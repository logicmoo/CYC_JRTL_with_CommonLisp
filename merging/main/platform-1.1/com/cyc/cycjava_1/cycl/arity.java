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
//dm import com.cyc.cycjava_1.cycl.inference.ask_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.cardinality_estimates;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class arity extends SubLTranslatedFile {

  //// Constructor

  private arity() {}
  public static final SubLFile me = new arity();
  public static final String myName = "com.cyc.cycjava_1.cycl.arity";

  //// Definitions

  /** The equality test used for the KB arity tables. */
  @SubL(source = "cycl/arity.lisp", position = 713) 
  private static SubLSymbol $kb_arity_table_equality_test$ = null;

  @SubL(source = "cycl/arity.lisp", position = 857) 
  private static SubLSymbol $kb_arity_table$ = null;

  @SubL(source = "cycl/arity.lisp", position = 1116) 
  public static final SubLObject arity_lookup(SubLObject relation) {
    checkType(relation, $sym2$FORT_P);
    return Hashtables.gethash_without_values(relation, $kb_arity_table$.getGlobalValue(), UNPROVIDED);
  }

  @SubL(source = "cycl/arity.lisp", position = 1249) 
  public static final SubLObject set_arity(SubLObject relation, SubLObject v_arity) {
    checkType(relation, $sym2$FORT_P);
    return Hashtables.sethash(relation, $kb_arity_table$.getGlobalValue(), v_arity);
  }

  @SubL(source = "cycl/arity.lisp", position = 1375) 
  public static final SubLObject rem_arity(SubLObject relation) {
    Hashtables.remhash(relation, $kb_arity_table$.getGlobalValue());
    return relation;
  }

  /** Return the arity for relation constant RELATION. */
  @SubL(source = "cycl/arity.lisp", position = 1501) 
  public static final SubLObject arity(SubLObject relation) {
    if ((NIL != forts.fort_p(relation))) {
      return arity_lookup(relation);
    } else if ((NIL != obsolete.reifiable_natP(relation, Symbols.symbol_function($sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue()))) {
      return arity(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10320"));
    } else if ((NIL != el_utilities.kappa_predicate_p(relation))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30572");
    } else if ((NIL != el_utilities.lambda_function_p(relation))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30574");
    }
    return NIL;
  }

  public static final class $arity$UnaryFunction extends UnaryFunction {
    public $arity$UnaryFunction() { super(extractFunctionNamed("ARITY")); }
    public SubLObject processItem(SubLObject arg1) { return arity(arg1); }
  }

  @SubL(source = "cycl/arity.lisp", position = 3535) 
  public static final SubLObject possibly_simplify_arity(SubLObject v_arity) {
    return v_arity;
  }

  @SubL(source = "cycl/arity.lisp", position = 3748) 
  public static final SubLObject maybe_add_arity_for_relation(SubLObject relation, SubLObject v_arity) {
    v_arity = possibly_simplify_arity(v_arity);
    checkType(v_arity, $sym17$INTEGERP);
    {
      SubLObject arity_in_table = arity(relation);
      if ((NIL != arity_in_table)) {
        if ((!(arity_in_table.eql(v_arity)))) {
          Errors.error($str18$Trying_to_overload_arity_for__A_f, relation, arity_in_table, v_arity);
        }
      }
      set_arity(relation, v_arity);
    }
    return v_arity;
  }

  @SubL(source = "cycl/arity.lisp", position = 4139) 
  public static final SubLObject maybe_remove_arity_for_relation(SubLObject relation, SubLObject v_arity) {
    {
      SubLObject dont_remove = NIL;
      SubLObject other_arity = NIL;
      SubLObject pred_var = $const8$arity;
      if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var))) {
        {
          SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
          SubLObject done_var = dont_remove;
          SubLObject token_var = NIL;
          while ((NIL == done_var)) {
            {
              SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
              SubLObject valid = makeBoolean((token_var != final_index_spec));
              if ((NIL != valid)) {
                {
                  SubLObject final_index_iterator = NIL;
                  try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw15$GAF, $kw16$TRUE, NIL);
                    {
                      SubLObject done_var_5 = dont_remove;
                      SubLObject token_var_6 = NIL;
                      while ((NIL == done_var_5)) {
                        {
                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                          SubLObject valid_7 = makeBoolean((token_var_6 != assertion));
                          if ((NIL != valid_7)) {
                            {
                              SubLObject asserted_arity = assertions_high.gaf_arg2(assertion);
                              if (v_arity.numE(asserted_arity)) {
                                dont_remove = kb_accessors.assertion_still_thereP(assertion, $kw16$TRUE);
                              } else {
                                other_arity = asserted_arity;
                              }
                            }
                          }
                          done_var_5 = makeBoolean(((NIL == valid_7)
                                || (NIL != dont_remove)));
                        }
                      }
                    }
                  } finally {
                    {
                      SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                      try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                        if ((NIL != final_index_iterator)) {
                          kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                      } finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                      }
                    }
                  }
                }
              }
              done_var = makeBoolean(((NIL == valid)
                    || (NIL != dont_remove)));
            }
          }
        }
      }
      if ((NIL == dont_remove)) {
        rem_arity(relation);
      }
      if ((NIL != other_arity)) {
        set_arity(relation, other_arity);
      }
    }
    return relation;
  }

  @SubL(source = "cycl/arity.lisp", position = 4742) 
  private static SubLSymbol $kb_arity_min_table$ = null;

  @SubL(source = "cycl/arity.lisp", position = 5041) 
  public static final SubLObject arity_min_lookup(SubLObject relation) {
    checkType(relation, $sym2$FORT_P);
    return Hashtables.gethash_without_values(relation, $kb_arity_min_table$.getGlobalValue(), UNPROVIDED);
  }

  /** Return the arity-min for RELATION. */
  @SubL(source = "cycl/arity.lisp", position = 5458) 
  public static final SubLObject arity_min(SubLObject relation) {
    {
      SubLObject arity_min = arity_min_int(relation);
      return ((NIL != arity_min) ? ((SubLObject) arity_min) : ZERO_INTEGER);
    }
  }

  @SubL(source = "cycl/arity.lisp", position = 5620) 
  public static final SubLObject arity_min_int(SubLObject relation) {
    if ((NIL != forts.fort_p(relation))) {
      {
        SubLObject arity_min_in_table = arity_min_lookup(relation);
        if ((NIL != arity_min_in_table)) {
          return arity_min_in_table;
        } else {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12071");
        }
      }
    } else if ((NIL != obsolete.reifiable_natP(relation, Symbols.symbol_function($sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue()))) {
      return arity_min(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10321"));
    }
    return NIL;
  }

  @SubL(source = "cycl/arity.lisp", position = 8183) 
  private static SubLSymbol $kb_arity_max_table$ = null;

  @SubL(source = "cycl/arity.lisp", position = 8482) 
  public static final SubLObject arity_max_lookup(SubLObject relation) {
    checkType(relation, $sym2$FORT_P);
    return Hashtables.gethash_without_values(relation, $kb_arity_max_table$.getGlobalValue(), UNPROVIDED);
  }

  /** Return the arityMax for RELATION. */
  @SubL(source = "cycl/arity.lisp", position = 8899) 
  public static final SubLObject arity_max(SubLObject relation) {
    if ((NIL != forts.fort_p(relation))) {
      {
        SubLObject arity_max_in_table = arity_max_lookup(relation);
        if ((NIL != arity_max_in_table)) {
          return arity_max_in_table;
        } else {
          return initialize_arity_max_for_relation(relation);
        }
      }
    } else if ((NIL != obsolete.reifiable_natP(relation, Symbols.symbol_function($sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue()))) {
      return arity_max(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10322"));
    }
    return NIL;
  }

  @SubL(source = "cycl/arity.lisp", position = 10053) 
  public static final SubLObject initialize_arity_max_for_relation(SubLObject relation) {
    {
      SubLObject arity_max = kb_mapping_utilities.fpred_value_in_any_mt(relation, $const24$arityMax, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL == arity_max)) {
        return NIL;
      }
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12068");
    }
  }

  @SubL(source = "cycl/arity.lisp", position = 14607) 
  public static final SubLObject binaryP(SubLObject relation) {
    return Equality.eql(arity(relation), TWO_INTEGER);
  }

  @SubL(source = "cycl/arity.lisp", position = 14731) 
  public static final SubLObject binary_arg_swap(SubLObject arg) {
    {
      SubLObject pcase_var = arg;
      if (pcase_var.eql(ONE_INTEGER)) {
        return TWO_INTEGER;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return ONE_INTEGER;
      } else {
        return arg;
      }
    }
  }

  @SubL(source = "cycl/arity.lisp", position = 15320) 
  public static final SubLObject variable_arityP(SubLObject relation) {
    return fort_types_interface.isa_variable_arity_relationP(relation, mt_vars.$anect_mt$.getGlobalValue());
  }

  @SubL(source = "cycl/arity.lisp", position = 16142) 
  public static final SubLObject arity_cache_unbuiltP() {
    return Types.sublisp_null($kb_arity_table$.getGlobalValue());
  }

  @SubL(source = "cycl/arity.lisp", position = 16609) 
  public static final SubLObject load_arity_cache_from_stream(SubLObject stream) {
    {
      SubLObject dummy = NIL;
      $kb_arity_table$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      $kb_arity_min_table$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      $kb_arity_max_table$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      dummy = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  public static final SubLObject declare_arity_file() {
    //declareFunction(myName, "initialize_arity_table", "INITIALIZE-ARITY-TABLE", 0, 0, false);
    declareFunction(myName, "arity_lookup", "ARITY-LOOKUP", 1, 0, false);
    declareFunction(myName, "set_arity", "SET-ARITY", 2, 0, false);
    declareFunction(myName, "rem_arity", "REM-ARITY", 1, 0, false);
    declareFunction(myName, "arity", "ARITY", 1, 0, false); new $arity$UnaryFunction();
    //declareFunction(myName, "arity_robust", "ARITY-ROBUST", 1, 0, false);
    //declareFunction(myName, "initialize_all_arities", "INITIALIZE-ALL-ARITIES", 0, 0, false);
    //declareFunction(myName, "initialize_arities", "INITIALIZE-ARITIES", 0, 0, false);
    //declareFunction(myName, "initialize_arity_from_assertion", "INITIALIZE-ARITY-FROM-ASSERTION", 1, 0, false);
    //declareFunction(myName, "initialize_arity_for_relation", "INITIALIZE-ARITY-FOR-RELATION", 1, 0, false);
    //declareFunction(myName, "initialize_arity_for_relation_guts", "INITIALIZE-ARITY-FOR-RELATION-GUTS", 2, 0, false);
    declareFunction(myName, "possibly_simplify_arity", "POSSIBLY-SIMPLIFY-ARITY", 1, 0, false);
    declareFunction(myName, "maybe_add_arity_for_relation", "MAYBE-ADD-ARITY-FOR-RELATION", 2, 0, false);
    declareFunction(myName, "maybe_remove_arity_for_relation", "MAYBE-REMOVE-ARITY-FOR-RELATION", 2, 0, false);
    //declareFunction(myName, "initialize_arity_min_table", "INITIALIZE-ARITY-MIN-TABLE", 0, 0, false);
    declareFunction(myName, "arity_min_lookup", "ARITY-MIN-LOOKUP", 1, 0, false);
    //declareFunction(myName, "set_arity_min", "SET-ARITY-MIN", 2, 0, false);
    //declareFunction(myName, "rem_arity_min", "REM-ARITY-MIN", 1, 0, false);
    declareFunction(myName, "arity_min", "ARITY-MIN", 1, 0, false);
    declareFunction(myName, "arity_min_int", "ARITY-MIN-INT", 1, 0, false);
    //declareFunction(myName, "initialize_min_arities", "INITIALIZE-MIN-ARITIES", 0, 0, false);
    //declareFunction(myName, "initialize_arity_min_from_assertion", "INITIALIZE-ARITY-MIN-FROM-ASSERTION", 1, 0, false);
    //declareFunction(myName, "initialize_arity_min_for_relation", "INITIALIZE-ARITY-MIN-FOR-RELATION", 1, 0, false);
    //declareFunction(myName, "initialize_arity_min_for_relation_guts", "INITIALIZE-ARITY-MIN-FOR-RELATION-GUTS", 2, 0, false);
    //declareFunction(myName, "maybe_add_arity_min_for_relation", "MAYBE-ADD-ARITY-MIN-FOR-RELATION", 2, 0, false);
    //declareFunction(myName, "maybe_remove_arity_min_for_relation", "MAYBE-REMOVE-ARITY-MIN-FOR-RELATION", 1, 0, false);
    //declareFunction(myName, "min_arity", "MIN-ARITY", 1, 0, false);
    //declareFunction(myName, "initialize_arity_max_table", "INITIALIZE-ARITY-MAX-TABLE", 0, 0, false);
    declareFunction(myName, "arity_max_lookup", "ARITY-MAX-LOOKUP", 1, 0, false);
    //declareFunction(myName, "set_arity_max", "SET-ARITY-MAX", 2, 0, false);
    //declareFunction(myName, "rem_arity_max", "REM-ARITY-MAX", 1, 0, false);
    declareFunction(myName, "arity_max", "ARITY-MAX", 1, 0, false);
    //declareFunction(myName, "initialize_max_arities", "INITIALIZE-MAX-ARITIES", 0, 0, false);
    //declareFunction(myName, "initialize_arity_max_from_assertion", "INITIALIZE-ARITY-MAX-FROM-ASSERTION", 1, 0, false);
    declareFunction(myName, "initialize_arity_max_for_relation", "INITIALIZE-ARITY-MAX-FOR-RELATION", 1, 0, false);
    //declareFunction(myName, "initialize_arity_max_for_relation_guts", "INITIALIZE-ARITY-MAX-FOR-RELATION-GUTS", 2, 0, false);
    //declareFunction(myName, "maybe_add_arity_max_for_relation", "MAYBE-ADD-ARITY-MAX-FOR-RELATION", 2, 0, false);
    //declareFunction(myName, "maybe_remove_arity_max_for_relation", "MAYBE-REMOVE-ARITY-MAX-FOR-RELATION", 1, 0, false);
    //declareFunction(myName, "max_arity", "MAX-ARITY", 1, 0, false);
    //declareFunction(myName, "arity_admitsP", "ARITY-ADMITS?", 2, 0, false);
    //declareFunction(myName, "any_arity_admitsP", "ANY-ARITY-ADMITS?", 2, 0, false);
    //declareFunction(myName, "arity_admitsGE", "ARITY-ADMITS>=", 2, 0, false);
    //declareFunction(myName, "arity_admitsG", "ARITY-ADMITS>", 2, 0, false);
    //declareFunction(myName, "arity_admitsLE", "ARITY-ADMITS<=", 2, 0, false);
    //declareFunction(myName, "arity_admitsL", "ARITY-ADMITS<", 2, 0, false);
    declareFunction(myName, "binaryP", "BINARY?", 1, 0, false);
    declareFunction(myName, "binary_arg_swap", "BINARY-ARG-SWAP", 1, 0, false);
    //declareFunction(myName, "logical_operator_arity", "LOGICAL-OPERATOR-ARITY", 1, 0, false);
    declareFunction(myName, "variable_arityP", "VARIABLE-ARITY?", 1, 0, false);
    //declareFunction(myName, "relation_arity_constraint_sentences", "RELATION-ARITY-CONSTRAINT-SENTENCES", 1, 0, false);
    declareFunction(myName, "arity_cache_unbuiltP", "ARITY-CACHE-UNBUILT?", 0, 0, false);
    //declareFunction(myName, "rebuild_arity_cache", "REBUILD-ARITY-CACHE", 0, 0, false);
    //declareFunction(myName, "dump_arity_cache_to_stream", "DUMP-ARITY-CACHE-TO-STREAM", 1, 0, false);
    declareFunction(myName, "load_arity_cache_from_stream", "LOAD-ARITY-CACHE-FROM-STREAM", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_arity_file() {
    $kb_arity_table_equality_test$ = deflexical("*KB-ARITY-TABLE-EQUALITY-TEST*", Symbols.symbol_function(EQ));
    $kb_arity_table$ = deflexical("*KB-ARITY-TABLE*", maybeDefault( $sym0$_KB_ARITY_TABLE_, $kb_arity_table$, NIL));
    $kb_arity_min_table$ = deflexical("*KB-ARITY-MIN-TABLE*", maybeDefault( $sym19$_KB_ARITY_MIN_TABLE_, $kb_arity_min_table$, NIL));
    $kb_arity_max_table$ = deflexical("*KB-ARITY-MAX-TABLE*", maybeDefault( $sym23$_KB_ARITY_MAX_TABLE_, $kb_arity_max_table$, NIL));
    return NIL;
  }

  public static final SubLObject setup_arity_file() {
        subl_macro_promotions.declare_defglobal($sym0$_KB_ARITY_TABLE_);
    utilities_macros.register_cyc_api_function($sym4$ARITY, $list5, $str6$Return_the_arity_for_relation_con, NIL, NIL);
    subl_macro_promotions.declare_defglobal($sym19$_KB_ARITY_MIN_TABLE_);
    subl_macro_promotions.declare_defglobal($sym23$_KB_ARITY_MAX_TABLE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_KB_ARITY_TABLE_ = makeSymbol("*KB-ARITY-TABLE*");
  public static final SubLObject $const1$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLSymbol $sym2$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym3$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym4$ARITY = makeSymbol("ARITY");
  public static final SubLList $list5 = list(makeSymbol("RELATION"));
  public static final SubLString $str6$Return_the_arity_for_relation_con = makeString("Return the arity for relation constant RELATION.");
  public static final SubLSymbol $sym7$_X = makeSymbol("?X");
  public static final SubLObject $const8$arity = constant_handles.reader_make_constant_shell(makeString("arity"));
  public static final SubLList $list9 = list(makeSymbol("?X"));
  public static final SubLObject $const10$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLList $list11 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);
  public static final SubLString $str12$Initializing_all_arities___ = makeString("Initializing all arities...");
  public static final SubLSymbol $sym13$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const14$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw15$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw16$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym17$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str18$Trying_to_overload_arity_for__A_f = makeString("Trying to overload arity for ~A from ~A to ~A");
  public static final SubLSymbol $sym19$_KB_ARITY_MIN_TABLE_ = makeSymbol("*KB-ARITY-MIN-TABLE*");
  public static final SubLObject $const20$VariableArityRelation = constant_handles.reader_make_constant_shell(makeString("VariableArityRelation"));
  public static final SubLObject $const21$arityMin = constant_handles.reader_make_constant_shell(makeString("arityMin"));
  public static final SubLString $str22$Trying_to_overload_arityMin_for__ = makeString("Trying to overload arityMin for ~A from ~A to ~A");
  public static final SubLSymbol $sym23$_KB_ARITY_MAX_TABLE_ = makeSymbol("*KB-ARITY-MAX-TABLE*");
  public static final SubLObject $const24$arityMax = constant_handles.reader_make_constant_shell(makeString("arityMax"));
  public static final SubLString $str25$Trying_to_overload_arityMax_for__ = makeString("Trying to overload arityMax for ~A from ~A to ~A");
  public static final SubLSymbol $sym26$RELATION_P = makeSymbol("RELATION-P");

  //// Initializers

  public void declareFunctions() {
    declare_arity_file();
  }

  public void initializeVariables() {
    init_arity_file();
  }

  public void runTopLevelForms() {
    setup_arity_file();
  }

}
