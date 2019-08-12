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
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class unification_utilities extends SubLTranslatedFile {

  //// Constructor

  private unification_utilities() {}
  public static final SubLFile me = new unification_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.unification_utilities";

  //// Definitions

  @SubL(source = "cycl/unification-utilities.lisp", position = 756) 
  public static final SubLObject term_unify(SubLObject term1, SubLObject term2, SubLObject share_vars, SubLObject justifyP) {
    if ((share_vars == UNPROVIDED)) {
      share_vars = T;
    }
    if ((justifyP == UNPROVIDED)) {
      justifyP = unification.$unify_return_justificationP$.getDynamicValue();
    }
    if (((NIL != variables.variable_p(term1))
         && (NIL != forts.fort_p(term2)))) {
      return Values.values(list(bindings.make_variable_binding(term1, term2)), NIL);
    } else {
      return unification.unify(term1, term2, share_vars, justifyP);
    }
  }

  @SubL(source = "cycl/unification-utilities.lisp", position = 1104) 
  public static final SubLObject asent_unify(SubLObject asent1, SubLObject asent2, SubLObject share_vars, SubLObject justify) {
    if ((share_vars == UNPROVIDED)) {
      share_vars = NIL;
    }
    if ((justify == UNPROVIDED)) {
      justify = unification.$unify_return_justificationP$.getDynamicValue();
    }
    return unification.unify(asent1, asent2, share_vars, justify);
  }

  @SubL(source = "cycl/unification-utilities.lisp", position = 1296) 
  public static final SubLObject gaf_asent_unify(SubLObject inference_asent, SubLObject gaf_asent, SubLObject share_vars, SubLObject justify) {
    if ((share_vars == UNPROVIDED)) {
      share_vars = T;
    }
    if ((justify == UNPROVIDED)) {
      justify = unification.$unify_return_justificationP$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject v_bindings = unification.unify(inference_asent, gaf_asent, share_vars, justify);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(v_bindings, ((NIL != v_bindings) ? ((SubLObject) gaf_asent) : NIL), justification);
      }
    }
  }

  @SubL(source = "cycl/unification-utilities.lisp", position = 1602) 
  public static final SubLObject gaf_asent_args_unify(SubLObject inference_asent, SubLObject gaf_asent, SubLObject share_vars, SubLObject justify) {
    if ((share_vars == UNPROVIDED)) {
      share_vars = T;
    }
    if ((justify == UNPROVIDED)) {
      justify = unification.$unify_return_justificationP$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject inference_args = cycl_utilities.atomic_sentence_args(inference_asent, UNPROVIDED);
        SubLObject gaf_args = cycl_utilities.atomic_sentence_args(gaf_asent, UNPROVIDED);
        thread.resetMultipleValues();
        {
          SubLObject v_bindings = unification.unify(inference_args, gaf_args, share_vars, justify);
          SubLObject justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != v_bindings)) {
            return Values.values(v_bindings, bindings.subst_bindings(v_bindings, inference_asent), justification);
          } else {
            return Values.values(NIL, NIL, NIL);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/unification-utilities.lisp", position = 2600) 
  public static final SubLObject transformation_asent_unify(SubLObject inference_asent, SubLObject rule_asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject v_bindings = asent_unify(inference_asent, rule_asent, NIL, NIL);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(v_bindings, NIL);
      }
    }
  }

  public static final class $unify_clause$BinaryFunction extends BinaryFunction {
    public $unify_clause$BinaryFunction() { super(extractFunctionNamed("UNIFY-CLAUSE")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8912"); }
  }

  @SubL(source = "cycl/unification-utilities.lisp", position = 13366) 
  private static SubLSymbol $query_dnf_from_formula_caching_state$ = null;

  public static final SubLObject declare_unification_utilities_file() {
    declareFunction(myName, "term_unify", "TERM-UNIFY", 2, 2, false);
    declareFunction(myName, "asent_unify", "ASENT-UNIFY", 2, 2, false);
    declareFunction(myName, "gaf_asent_unify", "GAF-ASENT-UNIFY", 2, 2, false);
    declareFunction(myName, "gaf_asent_args_unify", "GAF-ASENT-ARGS-UNIFY", 2, 2, false);
    //declareFunction(myName, "gaf_asent_inverse_args_unify", "GAF-ASENT-INVERSE-ARGS-UNIFY", 2, 2, false);
    declareFunction(myName, "transformation_asent_unify", "TRANSFORMATION-ASENT-UNIFY", 2, 0, false);
    //declareFunction(myName, "rewrite_asent_unify", "REWRITE-ASENT-UNIFY", 2, 0, false);
    //declareFunction(myName, "unify_clauses", "UNIFY-CLAUSES", 2, 2, false);
    //declareFunction(myName, "clean_up_unify_result", "CLEAN-UP-UNIFY-RESULT", 1, 0, false);
    //declareFunction(myName, "unify_clause", "UNIFY-CLAUSE", 2, 2, false); new $unify_clause$BinaryFunction();
    //declareFunction(myName, "unify_clause_literal", "UNIFY-CLAUSE-LITERAL", 4, 0, false);
    //declareFunction(myName, "compute_variable_map", "COMPUTE-VARIABLE-MAP", 2, 0, false);
    //declareFunction(myName, "variable_base_inversion_binding", "VARIABLE-BASE-INVERSION-BINDING", 1, 0, false);
    //declareFunction(myName, "unify_set", "UNIFY-SET", 2, 2, false);
    //declareFunction(myName, "unify_sets", "UNIFY-SETS", 2, 2, false);
    //declareFunction(myName, "unify_sets_of_sets", "UNIFY-SETS-OF-SETS", 2, 2, false);
    //declareFunction(myName, "unify_set_recursive", "UNIFY-SET-RECURSIVE", 5, 0, false);
    //declareFunction(myName, "unify_element", "UNIFY-ELEMENT", 4, 0, false);
    //declareFunction(myName, "parent_to_unify_bindings", "PARENT-TO-UNIFY-BINDINGS", 2, 0, false);
    //declareFunction(myName, "unify_to_child_bindings", "UNIFY-TO-CHILD-BINDINGS", 1, 0, false);
    //declareFunction(myName, "unify_source_bindings", "UNIFY-SOURCE-BINDINGS", 2, 0, false);
    //declareFunction(myName, "parent_to_child_bindings", "PARENT-TO-CHILD-BINDINGS", 2, 0, false);
    //declareFunction(myName, "clear_query_dnf_from_formula", "CLEAR-QUERY-DNF-FROM-FORMULA", 0, 0, false);
    //declareFunction(myName, "remove_query_dnf_from_formula", "REMOVE-QUERY-DNF-FROM-FORMULA", 1, 0, false);
    //declareFunction(myName, "query_dnf_from_formula_internal", "QUERY-DNF-FROM-FORMULA-INTERNAL", 1, 0, false);
    //declareFunction(myName, "query_dnf_from_formula", "QUERY-DNF-FROM-FORMULA", 1, 0, false);
    //declareFunction(myName, "remove_duplicate_formulas", "REMOVE-DUPLICATE-FORMULAS", 1, 1, false);
    //declareFunction(myName, "remove_duplicate_or_invalid_formulas", "REMOVE-DUPLICATE-OR-INVALID-FORMULAS", 1, 0, false);
    //declareFunction(myName, "unify_el", "UNIFY-EL", 2, 1, false);
    //declareFunction(myName, "unify_el_cnfs", "UNIFY-EL-CNFS", 2, 1, false);
    //declareFunction(myName, "unify_one_way", "UNIFY-ONE-WAY", 2, 0, false);
    //declareFunction(myName, "genl_mt_unify", "GENL-MT-UNIFY", 2, 1, false);
    //declareFunction(myName, "genl_mt_unify_no_time", "GENL-MT-UNIFY-NO-TIME", 3, 0, false);
    //declareFunction(myName, "genl_mt_unify_possibly_justify_genl_mt", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-GENL-MT", 2, 0, false);
    //declareFunction(myName, "genl_mt_unify_possibly_justify_temporally_subsumes", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-TEMPORALLY-SUBSUMES", 2, 0, false);
    //declareFunction(myName, "genl_mt_unify_possibly_justify_temporally_subsumes_ins_type", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-TEMPORALLY-SUBSUMES-INS-TYPE", 2, 0, false);
    //declareFunction(myName, "genl_mt_unify_possibly_justify_temporally_subsumes_type_type", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-TEMPORALLY-SUBSUMES-TYPE-TYPE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_unification_utilities_file() {
    $query_dnf_from_formula_caching_state$ = deflexical("*QUERY-DNF-FROM-FORMULA-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_unification_utilities_file() {
        memoization_state.note_globally_cached_function($sym16$QUERY_DNF_FROM_FORMULA);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym1$UNIFY_CLAUSE = makeSymbol("UNIFY-CLAUSE");
  public static final SubLSymbol $sym2$CLAUSE_P = makeSymbol("CLAUSE-P");
  public static final SubLSymbol $sym3$UNIFY_CLAUSE_LITERAL = makeSymbol("UNIFY-CLAUSE-LITERAL");
  public static final SubLSymbol $sym4$CLAUSES_P = makeSymbol("CLAUSES-P");
  public static final SubLSymbol $sym5$NON_BASE_VARIABLE_P = makeSymbol("NON-BASE-VARIABLE-P");
  public static final SubLSymbol $sym6$VARIABLE_BASE_INVERSION_BINDING = makeSymbol("VARIABLE-BASE-INVERSION-BINDING");
  public static final SubLList $list7 = cons(makeSymbol("VAR1"), makeSymbol("VAR2"));
  public static final SubLSymbol $sym8$UNIFY_ELEMENT = makeSymbol("UNIFY-ELEMENT");
  public static final SubLSymbol $sym9$UNIFY_SET = makeSymbol("UNIFY-SET");
  public static final SubLSymbol $sym10$UNIFY_SETS = makeSymbol("UNIFY-SETS");
  public static final SubLSymbol $sym11$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym12$BASE_VARIABLE_P = makeSymbol("BASE-VARIABLE-P");
  public static final SubLSymbol $sym13$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym14$CAR = makeSymbol("CAR");
  public static final SubLList $list15 = cons(makeSymbol("PARENT-VAR"), makeSymbol("UNIFY-BINDING"));
  public static final SubLSymbol $sym16$QUERY_DNF_FROM_FORMULA = makeSymbol("QUERY-DNF-FROM-FORMULA");
  public static final SubLSymbol $sym17$_QUERY_DNF_FROM_FORMULA_CACHING_STATE_ = makeSymbol("*QUERY-DNF-FROM-FORMULA-CACHING-STATE*");
  public static final SubLSymbol $kw18$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym19$OBJECT_TO_STRING = makeSymbol("OBJECT-TO-STRING");
  public static final SubLSymbol $kw20$GENLMT = makeKeyword("GENLMT");
  public static final SubLObject $const21$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $kw22$TIME = makeKeyword("TIME");
  public static final SubLObject $const23$temporallySubsumes = constant_handles.reader_make_constant_shell(makeString("temporallySubsumes"));
  public static final SubLObject $const24$temporallySubsumes_InsType = constant_handles.reader_make_constant_shell(makeString("temporallySubsumes-InsType"));
  public static final SubLObject $const25$temporallySubsumes_TypeType = constant_handles.reader_make_constant_shell(makeString("temporallySubsumes-TypeType"));

  //// Initializers

  public void declareFunctions() {
    declare_unification_utilities_file();
  }

  public void initializeVariables() {
    init_unification_utilities_file();
  }

  public void runTopLevelForms() {
    setup_unification_utilities_file();
  }

}
