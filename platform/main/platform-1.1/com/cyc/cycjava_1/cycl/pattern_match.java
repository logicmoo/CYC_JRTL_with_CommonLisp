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
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class pattern_match extends SubLTranslatedFile {

  //// Constructor

  private pattern_match() {}
  public static final SubLFile me = new pattern_match();
  public static final String myName = "com.cyc.cycjava_1.cycl.pattern_match";

  //// Definitions

  @SubL(source = "cycl/pattern-match.lisp", position = 1407) 
  private static SubLSymbol $pattern_matches_tree_bindings$ = null;

  /** Additional atomic methods for pattern-matches-tree.
   Entries are of the form (operator method).
   OPERATOR is a token indicating the match method.
   METHOD must be suitable for (funcall method <tree>). */
  @SubL(source = "cycl/pattern-match.lisp", position = 1564) 
  public static SubLSymbol $pattern_matches_tree_atomic_methods$ = null;

  /** Additional methods for pattern-matches-tree.
   Entries are of the form (operator method).
   OPERATOR is a token indicating the match method.
   METHOD must be suitable for (funcall method <pattern> <tree>). */
  @SubL(source = "cycl/pattern-match.lisp", position = 1846) 
  public static SubLSymbol $pattern_matches_tree_methods$ = null;

  /** Return T iff PATTERN matches TREE. */
  @SubL(source = "cycl/pattern-match.lisp", position = 2124) 
  public static final SubLObject pattern_matches_tree(SubLObject pattern, SubLObject tree) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject success = NIL;
        SubLObject v_bindings = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
          {
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
              Errors.$error_handler$.bind(Symbols.symbol_function($sym1$IGNORE_ERRORS_HANDLER), thread);
              try {
                {
                  SubLObject _prev_bind_0_1 = $pattern_matches_tree_bindings$.currentBinding(thread);
                  try {
                    $pattern_matches_tree_bindings$.bind(NIL, thread);
                    if ((NIL != pattern_matches_tree_internal(pattern, tree))) {
                      success = T;
                      v_bindings = Sequences.nreverse($pattern_matches_tree_bindings$.getDynamicValue(thread));
                    }
                  } finally {
                    $pattern_matches_tree_bindings$.rebind(_prev_bind_0_1, thread);
                  }
                }
              } catch (Throwable catch_var) {
                Errors.handleThrowable(catch_var, NIL);
              }
            } finally {
              Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
          }
        } catch (Throwable ccatch_env_var) {
          ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw0$IGNORE_ERRORS_TARGET);
        }
        return Values.values(success, v_bindings);
      }
    }
  }

  /** Return T iff PATTERN matches TREE.
   :BIND expressions are not allowed in PATTERN. */
  @SubL(source = "cycl/pattern-match.lisp", position = 2556) 
  public static final SubLObject pattern_matches_tree_without_bindings(SubLObject pattern, SubLObject tree) {
    return pattern_matches_tree_internal(pattern, tree);
  }

  /** For use by pattern match methods in other files. */
  @SubL(source = "cycl/pattern-match.lisp", position = 4105) 
  public static final SubLObject pattern_matches_tree_internal(SubLObject pattern, SubLObject tree) {
    return pattern_matches_tree_recursive(pattern, tree);
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 4291) 
  public static final SubLObject pattern_matches_tree_atomic_method_funcall(SubLObject method, SubLObject tree) {
    return Functions.funcall(method, tree);
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 4410) 
  public static final SubLObject pattern_matches_tree_method_funcall(SubLObject method, SubLObject pattern, SubLObject tree) {
    return Functions.funcall(method, pattern, tree);
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 4524) 
  public static final SubLObject pattern_matches_tree_recursive(SubLObject pattern, SubLObject tree) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (pattern.isAtom()) {
        {
          SubLObject pcase_var = pattern;
          if (pcase_var.eql($kw15$ANYTHING)) {
            return T;
          } else if (pcase_var.eql($kw16$NOTHING)) {
            return NIL;
          } else {
            {
              SubLObject cdolist_list_var = $pattern_matches_tree_atomic_methods$.getDynamicValue(thread);
              SubLObject method_info = NIL;
              for (method_info = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), method_info = cdolist_list_var.first()) {
                {
                  SubLObject datum = method_info;
                  SubLObject current = datum;
                  SubLObject method_operator = NIL;
                  SubLObject method = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
                  method_operator = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
                  method = current.first();
                  current = current.rest();
                  if ((NIL == current)) {
                    if ((method_operator == pattern)) {
                      return pattern_matches_tree_atomic_method_funcall(method, tree);
                    }
                  } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list17);
                  }
                }
              }
            }
            return Equality.equal(pattern, tree);
          }
        }
      } else {
        {
          SubLObject datum = pattern;
          SubLObject current = datum;
          SubLObject pattern_operator = NIL;
          SubLObject pattern_args = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
          pattern_operator = current.first();
          current = current.rest();
          pattern_args = current;
          {
            SubLObject pcase_var = pattern_operator;
            if (pcase_var.eql($kw19$BIND)) {
              return pattern_matches_tree_bind(pattern, tree);
            } else if (pcase_var.eql($kw20$VALUE)) {
              return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32006");
            } else if (pcase_var.eql($kw21$AND)) {
              return pattern_matches_tree_and(pattern, tree);
            } else if (pcase_var.eql($kw22$OR)) {
              return pattern_matches_tree_or(pattern, tree);
            } else if (pcase_var.eql($kw23$NOT)) {
              {
                SubLObject datum_3 = pattern_args;
                SubLObject current_4 = datum_3;
                SubLObject sub_pattern = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_4, datum_3, $list24);
                sub_pattern = current_4.first();
                current_4 = current_4.rest();
                if ((NIL == current_4)) {
                  return makeBoolean((NIL == pattern_matches_tree_recursive(sub_pattern, tree)));
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum_3, $list24);
                }
              }
            } else if (pcase_var.eql($kw25$TEST)) {
              {
                SubLObject extra_arg_count = Numbers.subtract(Sequences.length(pattern_args), ONE_INTEGER);
                if ((ZERO_INTEGER == extra_arg_count)) {
                  {
                    SubLObject datum_5 = pattern_args;
                    SubLObject current_6 = datum_5;
                    SubLObject test = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_6, datum_5, $list26);
                    test = current_6.first();
                    current_6 = current_6.rest();
                    if ((NIL == current_6)) {
                      return list_utilities.sublisp_boolean(pattern_matches_tree_test_funcall(test, tree));
                    } else {
                      cdestructuring_bind.cdestructuring_bind_error(datum_5, $list26);
                    }
                  }
                } else if ((ONE_INTEGER == extra_arg_count)) {
                  {
                    SubLObject datum_7 = pattern_args;
                    SubLObject current_8 = datum_7;
                    SubLObject test = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_8, datum_7, $list27);
                    test = current_8.first();
                    current_8 = current_8.rest();
                    {
                      SubLObject arg2 = (current_8.isCons() ? ((SubLObject) current_8.first()) : NIL);
                      cdestructuring_bind.destructuring_bind_must_listp(current_8, datum_7, $list27);
                      current_8 = current_8.rest();
                      if ((NIL == current_8)) {
                        return list_utilities.sublisp_boolean(Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32003"));
                      } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_7, $list27);
                      }
                    }
                  }
                } else if ((TWO_INTEGER == extra_arg_count)) {
                  {
                    SubLObject datum_9 = pattern_args;
                    SubLObject current_10 = datum_9;
                    SubLObject test = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_10, datum_9, $list28);
                    test = current_10.first();
                    current_10 = current_10.rest();
                    {
                      SubLObject arg2 = (current_10.isCons() ? ((SubLObject) current_10.first()) : NIL);
                      cdestructuring_bind.destructuring_bind_must_listp(current_10, datum_9, $list28);
                      current_10 = current_10.rest();
                      {
                        SubLObject arg3 = (current_10.isCons() ? ((SubLObject) current_10.first()) : NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(current_10, datum_9, $list28);
                        current_10 = current_10.rest();
                        if ((NIL == current_10)) {
                          return list_utilities.sublisp_boolean(Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32004"));
                        } else {
                          cdestructuring_bind.cdestructuring_bind_error(datum_9, $list28);
                        }
                      }
                    }
                  }
                } else if ((THREE_INTEGER == extra_arg_count)) {
                  {
                    SubLObject datum_11 = pattern_args;
                    SubLObject current_12 = datum_11;
                    SubLObject test = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_12, datum_11, $list29);
                    test = current_12.first();
                    current_12 = current_12.rest();
                    {
                      SubLObject arg2 = (current_12.isCons() ? ((SubLObject) current_12.first()) : NIL);
                      cdestructuring_bind.destructuring_bind_must_listp(current_12, datum_11, $list29);
                      current_12 = current_12.rest();
                      {
                        SubLObject arg3 = (current_12.isCons() ? ((SubLObject) current_12.first()) : NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(current_12, datum_11, $list29);
                        current_12 = current_12.rest();
                        {
                          SubLObject arg4 = (current_12.isCons() ? ((SubLObject) current_12.first()) : NIL);
                          cdestructuring_bind.destructuring_bind_must_listp(current_12, datum_11, $list29);
                          current_12 = current_12.rest();
                          if ((NIL == current_12)) {
                            return list_utilities.sublisp_boolean(Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32005"));
                          } else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_11, $list29);
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else if (pcase_var.eql($kw30$TREE_FIND)) {
              {
                SubLObject datum_13 = pattern_args;
                SubLObject current_14 = datum_13;
                SubLObject sub_pattern = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_14, datum_13, $list24);
                sub_pattern = current_14.first();
                current_14 = current_14.rest();
                if ((NIL == current_14)) {
                  return pattern_matches_tree_tree_find(sub_pattern, tree);
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum_13, $list24);
                }
              }
            } else if (pcase_var.eql($kw31$QUOTE)) {
              {
                SubLObject datum_15 = pattern_args;
                SubLObject current_16 = datum_15;
                SubLObject quoted_object = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_16, datum_15, $list32);
                quoted_object = current_16.first();
                current_16 = current_16.rest();
                if ((NIL == current_16)) {
                  return Equality.equal(quoted_object, tree);
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum_15, $list32);
                }
              }
            } else {
              {
                SubLObject cdolist_list_var = $pattern_matches_tree_methods$.getDynamicValue(thread);
                SubLObject method_info = NIL;
                for (method_info = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), method_info = cdolist_list_var.first()) {
                  {
                    SubLObject datum_17 = method_info;
                    SubLObject current_18 = datum_17;
                    SubLObject method_operator = NIL;
                    SubLObject method = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_18, datum_17, $list17);
                    method_operator = current_18.first();
                    current_18 = current_18.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_18, datum_17, $list17);
                    method = current_18.first();
                    current_18 = current_18.rest();
                    if ((NIL == current_18)) {
                      if ((method_operator == pattern_operator)) {
                        return pattern_matches_tree_method_funcall(method, pattern, tree);
                      }
                    } else {
                      cdestructuring_bind.cdestructuring_bind_error(datum_17, $list17);
                    }
                  }
                }
              }
              return pattern_matches_tree_cons(pattern, tree);
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final class $pattern_matches_tree_recursive$BinaryFunction extends BinaryFunction {
    public $pattern_matches_tree_recursive$BinaryFunction() { super(extractFunctionNamed("PATTERN-MATCHES-TREE-RECURSIVE")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return pattern_matches_tree_recursive(arg1, arg2); }
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 6949) 
  public static final SubLObject pattern_matches_tree_bind(SubLObject pattern, SubLObject tree) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject variable = conses_high.second(pattern);
        $pattern_matches_tree_bindings$.setDynamicValue(list_utilities.alist_enter_without_values($pattern_matches_tree_bindings$.getDynamicValue(thread), variable, tree, Symbols.symbol_function(EQL)), thread);
        return T;
      }
    }
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 7496) 
  public static final SubLObject pattern_matches_tree_and(SubLObject pattern, SubLObject tree) {
    {
      SubLObject cdolist_list_var = pattern.rest();
      SubLObject sub_pattern = NIL;
      for (sub_pattern = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sub_pattern = cdolist_list_var.first()) {
        if ((NIL == pattern_matches_tree_recursive(sub_pattern, tree))) {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 7685) 
  public static final SubLObject pattern_matches_tree_or(SubLObject pattern, SubLObject tree) {
    {
      SubLObject cdolist_list_var = pattern.rest();
      SubLObject sub_pattern = NIL;
      for (sub_pattern = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sub_pattern = cdolist_list_var.first()) {
        if ((NIL != pattern_matches_tree_recursive(sub_pattern, tree))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 7871) 
  public static final SubLObject pattern_matches_tree_test_funcall(SubLObject test, SubLObject tree) {
    if ((NIL != eval_in_api.possibly_cyc_api_function_spec_p(test))) {
      return eval_in_api.possibly_cyc_api_funcall_1(test, tree);
    }
    return NIL;
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 8589) 
  public static final SubLObject pattern_matches_tree_tree_find(SubLObject sub_pattern, SubLObject tree) {
    return list_utilities.tree_find(sub_pattern, tree, Symbols.symbol_function($sym33$PATTERN_MATCHES_TREE_RECURSIVE), UNPROVIDED);
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 8727) 
  public static final SubLObject pattern_matches_tree_cons(SubLObject pattern, SubLObject tree) {
    if (tree.isAtom()) {
      return NIL;
    } else {
      {
        SubLObject datum = pattern;
        SubLObject current = datum;
        SubLObject pattern_operator = NIL;
        SubLObject pattern_args = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
        pattern_operator = current.first();
        current = current.rest();
        pattern_args = current;
        {
          SubLObject datum_19 = tree;
          SubLObject current_20 = datum_19;
          SubLObject tree_operator = NIL;
          SubLObject tree_args = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current_20, datum_19, $list34);
          tree_operator = current_20.first();
          current_20 = current_20.rest();
          tree_args = current_20;
          if ((NIL == pattern_matches_tree_recursive(pattern_operator, tree_operator))) {
            return NIL;
          }
          {
            SubLObject rest_pattern_args = NIL;
            SubLObject rest_tree_args = NIL;
            for (rest_pattern_args = pattern_args, rest_tree_args = tree_args; (!((rest_pattern_args.isAtom()
                  || rest_tree_args.isAtom()))); rest_pattern_args = rest_pattern_args.rest(), rest_tree_args = rest_tree_args.rest()) {
              {
                SubLObject next_pattern_arg = rest_pattern_args.first();
                SubLObject next_tree_arg = rest_tree_args.first();
                if ((NIL == pattern_matches_tree_recursive(next_pattern_arg, next_tree_arg))) {
                  return NIL;
                }
              }
            }
            return pattern_matches_tree_recursive(rest_pattern_args, rest_tree_args);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 9520) 
  private static SubLSymbol $pattern_transform_tree_bindings$ = null;

  @SubL(source = "cycl/pattern-match.lisp", position = 9687) 
  public static SubLSymbol $pattern_transform_match_method$ = null;

  /** Use PATTERN to transform TREE, assuming BINDINGS.
   Return transformation result and updated BINDINGS. */
  @SubL(source = "cycl/pattern-match.lisp", position = 9747) 
  public static final SubLObject pattern_transform_tree(SubLObject pattern, SubLObject tree, SubLObject v_bindings) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        SubLObject new_bindings = NIL;
        {
          SubLObject _prev_bind_0 = $pattern_transform_tree_bindings$.currentBinding(thread);
          try {
            $pattern_transform_tree_bindings$.bind(v_bindings, thread);
            answer = pattern_transform_tree_internal(pattern, tree);
            new_bindings = $pattern_transform_tree_bindings$.getDynamicValue(thread);
          } finally {
            $pattern_transform_tree_bindings$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(answer, new_bindings);
      }
    }
  }

  /** For use by pattern transform methods in other files. */
  @SubL(source = "cycl/pattern-match.lisp", position = 10422) 
  public static final SubLObject pattern_transform_tree_internal(SubLObject pattern, SubLObject tree) {
    return pattern_transform_tree_recursive(pattern, tree);
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 10616) 
  public static final SubLObject pattern_transform_tree_recursive(SubLObject pattern, SubLObject tree) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (pattern.isAtom()) {
        {
          SubLObject pcase_var = pattern;
          if (pcase_var.eql($kw35$INPUT)) {
            return tree;
          } else if (pcase_var.eql($kw36$BINDINGS)) {
            return $pattern_transform_tree_bindings$.getDynamicValue(thread);
          } else {
            return pattern;
          }
        }
      } else {
        {
          SubLObject datum = pattern;
          SubLObject current = datum;
          SubLObject pattern_operator = NIL;
          SubLObject pattern_args = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
          pattern_operator = current.first();
          current = current.rest();
          pattern_args = current;
          {
            SubLObject pcase_var = pattern_operator;
            if (pcase_var.eql($kw20$VALUE)) {
              {
                SubLObject datum_21 = pattern_args;
                SubLObject current_22 = datum_21;
                SubLObject variable = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_22, datum_21, $list37);
                variable = current_22.first();
                current_22 = current_22.rest();
                if ((NIL == current_22)) {
                  return list_utilities.alist_lookup_without_values($pattern_transform_tree_bindings$.getDynamicValue(thread), variable, Symbols.symbol_function(EQL), NIL);
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum_21, $list37);
                }
              }
            } else if (pcase_var.eql($kw38$TUPLE)) {
              return pattern_transform_tuple(pattern, tree);
            } else if (pcase_var.eql($kw39$TEMPLATE)) {
              return pattern_transform_template(pattern, tree);
            } else if (pcase_var.eql($kw40$CALL)) {
              return pattern_transform_call(pattern, tree);
            } else if (pcase_var.eql($kw31$QUOTE)) {
              {
                SubLObject datum_23 = pattern_args;
                SubLObject current_24 = datum_23;
                SubLObject quoted_object = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_24, datum_23, $list32);
                quoted_object = current_24.first();
                current_24 = current_24.rest();
                if ((NIL == current_24)) {
                  return quoted_object;
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum_23, $list32);
                }
              }
            } else {
              return pattern_transform_cons(pattern, tree);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 11615) 
  public static final SubLObject pattern_transform_tuple(SubLObject pattern, SubLObject tree) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = pattern;
        SubLObject current = datum;
        SubLObject operator = NIL;
        SubLObject v_variables = NIL;
        SubLObject subpattern = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list41);
        operator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list41);
        v_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list41);
        subpattern = current.first();
        current = current.rest();
        if ((NIL == current)) {
          if ((!((tree.isList()
                 && v_variables.isList()
                 && (NIL != list_utilities.lengthE(tree, Sequences.length(v_variables), UNPROVIDED)))))) {
            return NIL;
          }
          {
            SubLObject variable = NIL;
            SubLObject variable_25 = NIL;
            SubLObject subtree = NIL;
            SubLObject subtree_26 = NIL;
            for (variable = v_variables, variable_25 = variable.first(), subtree = tree, subtree_26 = subtree.first(); (!(((NIL == subtree)
                   && (NIL == variable)))); variable = variable.rest(), variable_25 = variable.first(), subtree = subtree.rest(), subtree_26 = subtree.first()) {
              $pattern_transform_tree_bindings$.setDynamicValue(list_utilities.alist_enter_without_values($pattern_transform_tree_bindings$.getDynamicValue(thread), variable_25, subtree_26, Symbols.symbol_function(EQL)), thread);
            }
          }
          return pattern_transform_tree_recursive(subpattern, NIL);
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list41);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 12252) 
  public static final SubLObject pattern_transform_template(SubLObject pattern, SubLObject tree) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = pattern;
        SubLObject current = datum;
        SubLObject operator = NIL;
        SubLObject match_pattern = NIL;
        SubLObject subpattern = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
        operator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
        match_pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
        subpattern = current.first();
        current = current.rest();
        if ((NIL == current)) {
          thread.resetMultipleValues();
          {
            SubLObject success = ((NIL != $pattern_transform_match_method$.getDynamicValue(thread)) ? ((SubLObject) Functions.funcall($pattern_transform_match_method$.getDynamicValue(thread), match_pattern, tree)) : pattern_matches_tree(match_pattern, tree));
            SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == success)) {
              return NIL;
            }
            {
              SubLObject cdolist_list_var = v_bindings;
              SubLObject binding = NIL;
              for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
                {
                  SubLObject datum_27 = binding;
                  SubLObject current_28 = datum_27;
                  SubLObject variable = NIL;
                  SubLObject value = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp(current_28, datum_27, $list43);
                  variable = current_28.first();
                  current_28 = current_28.rest();
                  value = current_28;
                  $pattern_transform_tree_bindings$.setDynamicValue(list_utilities.alist_enter_without_values($pattern_transform_tree_bindings$.getDynamicValue(thread), variable, value, Symbols.symbol_function(EQL)), thread);
                }
              }
            }
            return pattern_transform_tree_recursive(subpattern, NIL);
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list42);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 12934) 
  public static final SubLObject pattern_transform_call(SubLObject pattern, SubLObject tree) {
    {
      SubLObject datum = pattern;
      SubLObject current = datum;
      SubLObject operator = NIL;
      SubLObject method = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list44);
      operator = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list44);
      method = current.first();
      current = current.rest();
      {
        SubLObject method_args = current;
        SubLObject arg_count = Sequences.length(method_args);
        if ((arg_count.numLE(FOUR_INTEGER)
             && (NIL != Symbols.fboundp(method)))) {
          {
            SubLObject datum_29 = method_args;
            SubLObject current_30 = datum_29;
            SubLObject arg1 = (current_30.isCons() ? ((SubLObject) current_30.first()) : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current_30, datum_29, $list45);
            current_30 = current_30.rest();
            {
              SubLObject arg2 = (current_30.isCons() ? ((SubLObject) current_30.first()) : NIL);
              cdestructuring_bind.destructuring_bind_must_listp(current_30, datum_29, $list45);
              current_30 = current_30.rest();
              {
                SubLObject arg3 = (current_30.isCons() ? ((SubLObject) current_30.first()) : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current_30, datum_29, $list45);
                current_30 = current_30.rest();
                {
                  SubLObject arg4 = (current_30.isCons() ? ((SubLObject) current_30.first()) : NIL);
                  cdestructuring_bind.destructuring_bind_must_listp(current_30, datum_29, $list45);
                  current_30 = current_30.rest();
                  if ((NIL == current_30)) {
                    if (ZERO_INTEGER.numL(arg_count)) {
                      arg1 = pattern_transform_tree_recursive(arg1, tree);
                      if (ONE_INTEGER.numL(arg_count)) {
                        arg2 = pattern_transform_tree_recursive(arg2, tree);
                        if (TWO_INTEGER.numL(arg_count)) {
                          arg3 = pattern_transform_tree_recursive(arg3, tree);
                          if (THREE_INTEGER.numL(arg_count)) {
                            arg4 = pattern_transform_tree_recursive(arg4, tree);
                          }
                        }
                      }
                    }
                    {
                      SubLObject pcase_var = arg_count;
                      if (pcase_var.eql(ZERO_INTEGER)) {
                        return Functions.funcall(method);
                      } else if (pcase_var.eql(ONE_INTEGER)) {
                        return Functions.funcall(method, arg1);
                      } else if (pcase_var.eql(TWO_INTEGER)) {
                        return Functions.funcall(method, arg1, arg2);
                      } else if (pcase_var.eql(THREE_INTEGER)) {
                        return Functions.funcall(method, arg1, arg2, arg3);
                      } else {
                        return Functions.funcall(method, arg1, arg2, arg3, arg4);
                      }
                    }
                  } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_29, $list45);
                  }
                }
              }
            }
          }
        } else {
          method_args = conses_high.copy_list(method_args);
          {
            SubLObject rest_args = NIL;
            for (rest_args = method_args; (!(rest_args.isAtom())); rest_args = rest_args.rest()) {
              {
                SubLObject next_arg = rest_args.first();
                ConsesLow.rplaca(rest_args, pattern_transform_tree_recursive(next_arg, tree));
              }
            }
          }
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10863");
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/pattern-match.lisp", position = 14230) 
  public static final SubLObject pattern_transform_cons(SubLObject pattern, SubLObject tree) {
    {
      SubLObject answer = conses_high.copy_list(pattern);
      SubLObject rest_answer = NIL;
      for (rest_answer = answer; (!(rest_answer.rest().isAtom())); rest_answer = rest_answer.rest()) {
        ConsesLow.rplaca(rest_answer, pattern_transform_tree_recursive(rest_answer.first(), tree));
      }
      ConsesLow.rplaca(rest_answer, pattern_transform_tree_recursive(rest_answer.first(), tree));
      if ((NIL != rest_answer.rest())) {
        ConsesLow.rplacd(rest_answer, pattern_transform_tree_recursive(rest_answer.rest(), tree));
      }
      return answer;
    }
  }

  public static final SubLObject declare_pattern_match_file() {
    declareFunction(myName, "pattern_matches_tree", "PATTERN-MATCHES-TREE", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_without_bindings", "PATTERN-MATCHES-TREE-WITHOUT-BINDINGS", 2, 0, false);
    declareFunction(myName, "tree_matches_pattern", "TREE-MATCHES-PATTERN", 2, 0, false);
    declareMacro(myName, "with_tree_pattern_bindings", "WITH-TREE-PATTERN-BINDINGS");
    declareFunction(myName, "pattern_bindings_variable_specs", "PATTERN-BINDINGS-VARIABLE-SPECS", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_internal", "PATTERN-MATCHES-TREE-INTERNAL", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_atomic_method_funcall", "PATTERN-MATCHES-TREE-ATOMIC-METHOD-FUNCALL", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_method_funcall", "PATTERN-MATCHES-TREE-METHOD-FUNCALL", 3, 0, false);
    declareFunction(myName, "pattern_matches_tree_recursive", "PATTERN-MATCHES-TREE-RECURSIVE", 2, 0, false); new $pattern_matches_tree_recursive$BinaryFunction();
    declareFunction(myName, "pattern_matches_tree_bind", "PATTERN-MATCHES-TREE-BIND", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_value", "PATTERN-MATCHES-TREE-VALUE", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_and", "PATTERN-MATCHES-TREE-AND", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_or", "PATTERN-MATCHES-TREE-OR", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_test_funcall", "PATTERN-MATCHES-TREE-TEST-FUNCALL", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_test_funcall_2", "PATTERN-MATCHES-TREE-TEST-FUNCALL-2", 3, 0, false);
    declareFunction(myName, "pattern_matches_tree_test_funcall_3", "PATTERN-MATCHES-TREE-TEST-FUNCALL-3", 4, 0, false);
    declareFunction(myName, "pattern_matches_tree_test_funcall_4", "PATTERN-MATCHES-TREE-TEST-FUNCALL-4", 5, 0, false);
    declareFunction(myName, "pattern_matches_tree_tree_find", "PATTERN-MATCHES-TREE-TREE-FIND", 2, 0, false);
    declareFunction(myName, "pattern_matches_tree_cons", "PATTERN-MATCHES-TREE-CONS", 2, 0, false);
    declareFunction(myName, "pattern_transform_tree", "PATTERN-TRANSFORM-TREE", 2, 1, false);
    declareFunction(myName, "tree_pattern_transform", "TREE-PATTERN-TRANSFORM", 2, 1, false);
    declareFunction(myName, "pattern_transform_tree_internal", "PATTERN-TRANSFORM-TREE-INTERNAL", 2, 0, false);
    declareFunction(myName, "pattern_transform_tree_recursive", "PATTERN-TRANSFORM-TREE-RECURSIVE", 2, 0, false);
    declareFunction(myName, "pattern_transform_tuple", "PATTERN-TRANSFORM-TUPLE", 2, 0, false);
    declareFunction(myName, "pattern_transform_template", "PATTERN-TRANSFORM-TEMPLATE", 2, 0, false);
    declareFunction(myName, "pattern_transform_call", "PATTERN-TRANSFORM-CALL", 2, 0, false);
    declareFunction(myName, "pattern_transform_cons", "PATTERN-TRANSFORM-CONS", 2, 0, false);
    declareMacro(myName, "with_formula_pattern_bindings", "WITH-FORMULA-PATTERN-BINDINGS");
    return NIL;
  }

  public static final SubLObject init_pattern_match_file() {
    $pattern_matches_tree_bindings$ = defparameter("*PATTERN-MATCHES-TREE-BINDINGS*", NIL);
    $pattern_matches_tree_atomic_methods$ = defparameter("*PATTERN-MATCHES-TREE-ATOMIC-METHODS*", NIL);
    $pattern_matches_tree_methods$ = defparameter("*PATTERN-MATCHES-TREE-METHODS*", NIL);
    $pattern_transform_tree_bindings$ = defparameter("*PATTERN-TRANSFORM-TREE-BINDINGS*", NIL);
    $pattern_transform_match_method$ = defparameter("*PATTERN-TRANSFORM-MATCH-METHOD*", NIL);
    return NIL;
  }

  public static final SubLObject setup_pattern_match_file() {
    // CVS_ID("Id: pattern-match.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym1$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLList $list2 = list(list(makeSymbol("VARIABLES"), makeSymbol("TREE"), makeSymbol("PATTERN"), makeSymbol("&KEY"), makeSymbol("MATCH-METHOD")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list3 = list(makeKeyword("MATCH-METHOD"));
  public static final SubLSymbol $kw4$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw5$MATCH_METHOD = makeKeyword("MATCH-METHOD");
  public static final SubLSymbol $sym6$TREE_MATCHES_PATTERN = makeSymbol("TREE-MATCHES-PATTERN");
  public static final SubLSymbol $sym7$SUCCESS = makeUninternedSymbol("SUCCESS");
  public static final SubLSymbol $sym8$BINDINGS = makeUninternedSymbol("BINDINGS");
  public static final SubLSymbol $sym9$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym10$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym11$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym12$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym13$ALIST_LOOKUP_WITHOUT_VALUES = makeSymbol("ALIST-LOOKUP-WITHOUT-VALUES");
  public static final SubLSymbol $sym14$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $kw15$ANYTHING = makeKeyword("ANYTHING");
  public static final SubLSymbol $kw16$NOTHING = makeKeyword("NOTHING");
  public static final SubLList $list17 = list(makeSymbol("METHOD-OPERATOR"), makeSymbol("METHOD"));
  public static final SubLList $list18 = cons(makeSymbol("PATTERN-OPERATOR"), makeSymbol("PATTERN-ARGS"));
  public static final SubLSymbol $kw19$BIND = makeKeyword("BIND");
  public static final SubLSymbol $kw20$VALUE = makeKeyword("VALUE");
  public static final SubLSymbol $kw21$AND = makeKeyword("AND");
  public static final SubLSymbol $kw22$OR = makeKeyword("OR");
  public static final SubLSymbol $kw23$NOT = makeKeyword("NOT");
  public static final SubLList $list24 = list(makeSymbol("SUB-PATTERN"));
  public static final SubLSymbol $kw25$TEST = makeKeyword("TEST");
  public static final SubLList $list26 = list(makeSymbol("TEST"));
  public static final SubLList $list27 = list(makeSymbol("TEST"), makeSymbol("&OPTIONAL"), makeSymbol("ARG2"));
  public static final SubLList $list28 = list(makeSymbol("TEST"), makeSymbol("&OPTIONAL"), makeSymbol("ARG2"), makeSymbol("ARG3"));
  public static final SubLList $list29 = list(makeSymbol("TEST"), makeSymbol("&OPTIONAL"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"));
  public static final SubLSymbol $kw30$TREE_FIND = makeKeyword("TREE-FIND");
  public static final SubLSymbol $kw31$QUOTE = makeKeyword("QUOTE");
  public static final SubLList $list32 = list(makeSymbol("QUOTED-OBJECT"));
  public static final SubLSymbol $sym33$PATTERN_MATCHES_TREE_RECURSIVE = makeSymbol("PATTERN-MATCHES-TREE-RECURSIVE");
  public static final SubLList $list34 = cons(makeSymbol("TREE-OPERATOR"), makeSymbol("TREE-ARGS"));
  public static final SubLSymbol $kw35$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $kw36$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLList $list37 = list(makeSymbol("VARIABLE"));
  public static final SubLSymbol $kw38$TUPLE = makeKeyword("TUPLE");
  public static final SubLSymbol $kw39$TEMPLATE = makeKeyword("TEMPLATE");
  public static final SubLSymbol $kw40$CALL = makeKeyword("CALL");
  public static final SubLList $list41 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLES"), makeSymbol("SUBPATTERN"));
  public static final SubLList $list42 = list(makeSymbol("OPERATOR"), makeSymbol("MATCH-PATTERN"), makeSymbol("SUBPATTERN"));
  public static final SubLList $list43 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
  public static final SubLList $list44 = list(makeSymbol("OPERATOR"), makeSymbol("METHOD"), makeSymbol("&REST"), makeSymbol("METHOD-ARGS"));
  public static final SubLList $list45 = list(makeSymbol("&OPTIONAL"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"));
  public static final SubLList $list46 = list(list(makeSymbol("VARIABLES"), makeSymbol("FORMULA"), makeSymbol("PATTERN")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym47$WITH_TREE_PATTERN_BINDINGS = makeSymbol("WITH-TREE-PATTERN-BINDINGS");
  public static final SubLList $list48 = list(makeKeyword("MATCH-METHOD"), makeSymbol("FORMULA-MATCHES-PATTERN"));

  //// Initializers

  public void declareFunctions() {
    declare_pattern_match_file();
  }

  public void initializeVariables() {
    init_pattern_match_file();
  }

  public void runTopLevelForms() {
    setup_pattern_match_file();
  }

}
