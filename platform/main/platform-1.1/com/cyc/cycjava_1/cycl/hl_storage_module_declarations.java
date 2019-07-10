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

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.bookkeeping_store;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_completion_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hl_storage_modules;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.tms;

public  final class hl_storage_module_declarations extends SubLTranslatedFile {

  //// Constructor

  private hl_storage_module_declarations() {}
  public static final SubLFile me = new hl_storage_module_declarations();
  public static final String myName = "com.cyc.cycjava_1.cycl.hl_storage_module_declarations";

  //// Definitions

  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 1538) 
  public static final SubLObject regular_kb_assertion_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    return makeBoolean(((NIL == bookkeeping_store.my_creator_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))
           && (NIL == bookkeeping_store.my_creation_time_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))
           && (NIL == bookkeeping_store.my_creation_purpose_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))
           && (NIL == bookkeeping_store.my_creation_second_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))
           && (NIL == ist_assertion_applicableP(argument_spec, cnf, mt, direction, variable_map))
           && (NIL == assertion_direction_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))
           && (NIL == perform_subl_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))
           && (NIL == indexical_the_user_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))
           && (NIL == constant_name_hl_storage_applicableP(argument_spec, cnf, mt, direction, variable_map))));
  }

  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 3017) 
  public static final SubLObject hl_add_as_kb_assertion(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    {
      SubLObject argument_type = arguments.argument_spec_type(argument_spec);
      SubLObject pcase_var = argument_type;
      if (pcase_var.eql($kw2$ASSERTED_ARGUMENT)) {
        checkType(argument_spec, $sym3$ASSERTED_ARGUMENT_SPEC_P);
        {
          SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
          return hl_assert_as_kb_assertion(cnf, mt, strength_spec, direction, variable_map);
        }
      } else if (pcase_var.eql($kw4$DEDUCTION)) {
        checkType(argument_spec, $sym5$DEDUCTION_SPEC_P);
        {
          SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
          return hl_deduce_as_kb_deduction(cnf, mt, supports, direction, variable_map);
        }
      } else {
        fi.signal_fi_error($list6);
        return NIL;
      }
    }
  }

  /** @return boolean; whether the assert succeeded */
  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 3768) 
  public static final SubLObject hl_assert_as_kb_assertion(SubLObject cnf, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject variable_map) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject canon_version = list(cnf, variable_map);
        thread.resetMultipleValues();
        {
          SubLObject cnf_1 = fi.fi_canonicalize(canon_version, T, strength);
          SubLObject v_variables = thread.secondMultipleValue();
          SubLObject hl_tv = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject var_names = Mapping.mapcar($sym7$VARIABLE_NAME, v_variables);
            SubLObject assertion = assertions_high.find_or_create_assertion(cnf_1, mt, var_names, direction);
            if ((NIL != assertion)) {
              return fi.hl_assert_update_asserted_argument(assertion, hl_tv, direction);
            } else {
              return NIL;
            }
          }
        }
      }
    }
  }

  /** @return boolean; whether the deduce succeeded */
  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 4305) 
  public static final SubLObject hl_deduce_as_kb_deduction(SubLObject cnf, SubLObject mt, SubLObject supports, SubLObject direction, SubLObject variable_map) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject canon_version = list(cnf, variable_map);
        thread.resetMultipleValues();
        {
          SubLObject cnf_2 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
          SubLObject v_variables = thread.secondMultipleValue();
          SubLObject hl_tv = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject var_names = Mapping.mapcar($sym7$VARIABLE_NAME, v_variables);
            SubLObject support_truth = enumeration_types.tv_truth(hl_tv);
            SubLObject supports_copy = conses_high.copy_tree(supports);
            thread.resetMultipleValues();
            {
              SubLObject deduction = tms.tms_add_deduction_for_cnf(cnf_2, mt, supports_copy, support_truth, direction, var_names);
              SubLObject redundantP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if (((NIL != redundantP)
                  || (NIL != deduction_handles.deduction_p(deduction)))) {
                if ((NIL != redundantP)) {
                  {
                    SubLObject formula = clauses.cnf_formula(cnf_2, UNPROVIDED);
                    fi.signal_fi_warning(list($kw8$ARGUMENT_ALREADY_PRESENT, $str9$Argument_for__S_in__S_is_already_, formula, mt));
                  }
                }
                return deduction;
              } else {
                {
                  SubLObject formula = clauses.cnf_formula(cnf_2, UNPROVIDED);
                  fi.signal_fi_error(list($kw10$GENERIC_ERROR, $str11$Unable_to_add_argument_for__S_in_, formula, mt));
                  return NIL;
                }
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 5267) 
  public static final SubLObject hl_remove_as_kb_assertion(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
    {
      SubLObject argument_type = arguments.argument_spec_type(argument_spec);
      SubLObject pcase_var = argument_type;
      if (pcase_var.eql($kw2$ASSERTED_ARGUMENT)) {
        checkType(argument_spec, $sym3$ASSERTED_ARGUMENT_SPEC_P);
        {
          SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
          return hl_unassert_as_kb_assertion(cnf, mt);
        }
      } else if (pcase_var.eql($kw4$DEDUCTION)) {
        checkType(argument_spec, $sym5$DEDUCTION_SPEC_P);
        {
          SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31971");
        }
      } else {
        fi.signal_fi_error($list6);
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 5970) 
  public static final SubLObject hl_unassert_as_kb_assertion(SubLObject cnf, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject canon_version = list(cnf, NIL);
        thread.resetMultipleValues();
        {
          SubLObject cnf_3 = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
          SubLObject v_variables = thread.secondMultipleValue();
          SubLObject hl_tv = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject already_thereP = kb_indexing.find_assertion(cnf_3, mt);
            if ((NIL == already_thereP)) {
              {
                SubLObject formula = clauses.cnf_formula(cnf_3, UNPROVIDED);
                fi.signal_fi_warning(list($kw12$ASSERTION_NOT_PRESENT, $str13$Formula__S_in_mt__S_is_not_in_the, formula, mt));
              }
            } else {
              {
                SubLObject asserted_argument = assertions_high.get_asserted_argument(already_thereP);
                if ((NIL == asserted_argument)) {
                  {
                    SubLObject formula = clauses.cnf_formula(cnf_3, UNPROVIDED);
                    fi.signal_fi_warning(list($kw14$ASSERTION_NOT_LOCAL, $str15$Formula__S_in_mt__S_is_not_locall, formula, mt));
                  }
                } else {
                  tms.tms_remove_argument(asserted_argument, already_thereP);
                }
              }
            }
          }
        }
      }
      return T;
    }
  }

  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 8808) 
  public static final SubLObject ist_assertion_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != clauses.atomic_clause_p(cnf))) {
      {
        SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        if ((NIL != el_utilities.el_formula_with_operator_p(asent, $const22$ist))) {
          return formula_pattern_match.pattern_matches_formula_without_bindings($list23, asent);
        }
      }
    }
    return NIL;
  }

  /** @return booleanp; Returns whether the hl-storage-module for #$constantName is applicable. */
  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 12457) 
  public static final SubLObject constant_name_hl_storage_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != clause_utilities.pos_atomic_cnf_p(cnf))) {
      {
        SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        if ((NIL != el_utilities.el_formula_with_operator_p(asent, $const27$constantName))) {
          return formula_pattern_match.pattern_matches_formula_without_bindings($list28, asent);
        }
      }
    }
    return NIL;
  }

  /** @return booleanp; Returns whether the hl-storage-module for #$assertionDirection is applicable. */
  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 15162) 
  public static final SubLObject assertion_direction_hl_storage_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != clause_utilities.pos_atomic_cnf_p(cnf))) {
      {
        SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        if ((NIL != el_utilities.el_formula_with_operator_p(asent, $const31$assertionDirection))) {
          return formula_pattern_match.pattern_matches_formula_without_bindings($list32, asent);
        }
      }
    }
    return NIL;
  }

  /** @return booleanp; Returns whether the hl-storage-module for #$indexicalReferent #$TheUser is applicable. */
  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 17632) 
  public static final SubLObject indexical_the_user_hl_storage_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != clause_utilities.pos_atomic_cnf_p(cnf))) {
      {
        SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        if ((NIL != el_utilities.el_formula_with_operator_p(asent, $const35$indexicalReferent))) {
          return formula_pattern_match.pattern_matches_formula_without_bindings($list36, asent);
        }
      }
    }
    return NIL;
  }

  /** @return booleanp; Returns whether the hl-storage-module for #$performSubL is applicable. */
  @SubL(source = "cycl/hl-storage-module-declarations.lisp", position = 20414) 
  public static final SubLObject perform_subl_hl_storage_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != clause_utilities.pos_atomic_cnf_p(cnf))) {
      {
        SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        if ((NIL != el_utilities.el_formula_with_operator_p(asent, $const38$performSubL))) {
          return formula_pattern_match.pattern_matches_formula_without_bindings($list41, asent);
        }
      }
    }
    return NIL;
  }

  public static final SubLObject declare_hl_storage_module_declarations_file() {
    declareFunction(myName, "regular_kb_assertion_applicableP", "REGULAR-KB-ASSERTION-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "regular_kb_assertion_incompleteness", "REGULAR-KB-ASSERTION-INCOMPLETENESS", 5, 0, false);
    declareFunction(myName, "hl_add_as_kb_assertion", "HL-ADD-AS-KB-ASSERTION", 5, 0, false);
    declareFunction(myName, "hl_assert_as_kb_assertion", "HL-ASSERT-AS-KB-ASSERTION", 5, 0, false);
    declareFunction(myName, "hl_deduce_as_kb_deduction", "HL-DEDUCE-AS-KB-DEDUCTION", 5, 0, false);
    declareFunction(myName, "hl_remove_as_kb_assertion", "HL-REMOVE-AS-KB-ASSERTION", 3, 0, false);
    declareFunction(myName, "hl_unassert_as_kb_assertion", "HL-UNASSERT-AS-KB-ASSERTION", 2, 0, false);
    declareFunction(myName, "hl_undeduce_as_kb_deduction", "HL-UNDEDUCE-AS-KB-DEDUCTION", 3, 0, false);
    declareFunction(myName, "hl_remove_all_as_kb_assertion", "HL-REMOVE-ALL-AS-KB-ASSERTION", 2, 0, false);
    declareFunction(myName, "ist_assertion_applicableP", "IST-ASSERTION-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "ist_assertion_incompleteness", "IST-ASSERTION-INCOMPLETENESS", 5, 0, false);
    declareFunction(myName, "hl_add_as_ist_assertion", "HL-ADD-AS-IST-ASSERTION", 5, 0, false);
    declareFunction(myName, "hl_remove_as_ist_assertion", "HL-REMOVE-AS-IST-ASSERTION", 3, 0, false);
    declareFunction(myName, "hl_remove_all_as_ist_assertion", "HL-REMOVE-ALL-AS-IST-ASSERTION", 2, 0, false);
    declareFunction(myName, "constant_name_hl_storage_applicableP", "CONSTANT-NAME-HL-STORAGE-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "constant_name_hl_storage_incompleteness", "CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
    declareFunction(myName, "constant_name_hl_storage_assert", "CONSTANT-NAME-HL-STORAGE-ASSERT", 5, 0, false);
    declareFunction(myName, "constant_name_hl_storage_unassert", "CONSTANT-NAME-HL-STORAGE-UNASSERT", 3, 0, false);
    declareFunction(myName, "assertion_direction_hl_storage_applicableP", "ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "assertion_direction_hl_storage_incompleteness", "ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
    declareFunction(myName, "assertion_direction_hl_storage_assert", "ASSERTION-DIRECTION-HL-STORAGE-ASSERT", 5, 0, false);
    declareFunction(myName, "assertion_direction_hl_storage_unassert", "ASSERTION-DIRECTION-HL-STORAGE-UNASSERT", 3, 0, false);
    declareFunction(myName, "indexical_the_user_hl_storage_applicableP", "INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "indexical_the_user_hl_storage_incompleteness", "INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
    declareFunction(myName, "indexical_the_user_hl_storage_assert", "INDEXICAL-THE-USER-HL-STORAGE-ASSERT", 5, 0, false);
    declareFunction(myName, "indexical_the_user_hl_storage_unassert", "INDEXICAL-THE-USER-HL-STORAGE-UNASSERT", 3, 0, false);
    declareFunction(myName, "perform_subl_hl_storage_applicableP", "PERFORM-SUBL-HL-STORAGE-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "perform_subl_hl_storage_incompleteness", "PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS", 5, 0, false);
    declareFunction(myName, "perform_subl_hl_storage_assert", "PERFORM-SUBL-HL-STORAGE-ASSERT", 5, 0, false);
    declareFunction(myName, "perform_subl_hl_storage_unassert", "PERFORM-SUBL-HL-STORAGE-UNASSERT", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_hl_storage_module_declarations_file() {
    return NIL;
  }

  public static final SubLObject setup_hl_storage_module_declarations_file() {
    // CVS_ID("Id: hl-storage-module-declarations.lisp 126640 2008-12-04 13:39:36Z builder ");
    hl_storage_modules.hl_storage_module($kw0$REGULAR_KB_ASSERTION, $list1);
    hl_storage_modules.hl_storage_module($kw20$IST, $list21);
    hl_storage_modules.hl_storage_module($kw25$CONSTANT_NAME, $list26);
    hl_storage_modules.hl_storage_module($kw29$ASSERTION_DIRECTION, $list30);
    hl_storage_modules.hl_storage_module($kw33$INDEXICAL_THE_USER, $list34);
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate($const38$performSubL);
    hl_storage_modules.hl_storage_module($kw39$PERFORM_SUBL, $list40);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$REGULAR_KB_ASSERTION = makeKeyword("REGULAR-KB-ASSERTION");
  public static final SubLList $list1 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("Regular KB Assertion"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("APPLICABILITY"), makeSymbol("REGULAR-KB-ASSERTION-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("REGULAR-KB-ASSERTION-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("HL-ADD-AS-KB-ASSERTION"), makeKeyword("REMOVE"), makeSymbol("HL-REMOVE-AS-KB-ASSERTION"), makeKeyword("REMOVE-ALL"), makeSymbol("HL-REMOVE-ALL-AS-KB-ASSERTION")});
  public static final SubLSymbol $kw2$ASSERTED_ARGUMENT = makeKeyword("ASSERTED-ARGUMENT");
  public static final SubLSymbol $sym3$ASSERTED_ARGUMENT_SPEC_P = makeSymbol("ASSERTED-ARGUMENT-SPEC-P");
  public static final SubLSymbol $kw4$DEDUCTION = makeKeyword("DEDUCTION");
  public static final SubLSymbol $sym5$DEDUCTION_SPEC_P = makeSymbol("DEDUCTION-SPEC-P");
  public static final SubLList $list6 = list(makeKeyword("GENERIC-ERROR"), makeString("Unknown argument type ~S"));
  public static final SubLSymbol $sym7$VARIABLE_NAME = makeSymbol("VARIABLE-NAME");
  public static final SubLSymbol $kw8$ARGUMENT_ALREADY_PRESENT = makeKeyword("ARGUMENT-ALREADY-PRESENT");
  public static final SubLString $str9$Argument_for__S_in__S_is_already_ = makeString("Argument for ~S in ~S is already present");
  public static final SubLSymbol $kw10$GENERIC_ERROR = makeKeyword("GENERIC-ERROR");
  public static final SubLString $str11$Unable_to_add_argument_for__S_in_ = makeString("Unable to add argument for ~S in ~S");
  public static final SubLSymbol $kw12$ASSERTION_NOT_PRESENT = makeKeyword("ASSERTION-NOT-PRESENT");
  public static final SubLString $str13$Formula__S_in_mt__S_is_not_in_the = makeString("Formula ~S in mt ~S is not in the KB");
  public static final SubLSymbol $kw14$ASSERTION_NOT_LOCAL = makeKeyword("ASSERTION-NOT-LOCAL");
  public static final SubLString $str15$Formula__S_in_mt__S_is_not_locall = makeString("Formula ~S in mt ~S is not locally in the KB");
  public static final SubLSymbol $kw16$ARGUMENT_NOT_PRESENT = makeKeyword("ARGUMENT-NOT-PRESENT");
  public static final SubLString $str17$Argument__S___for__S_in_mt__S_is_ = makeString("Argument ~S ~%for ~S in mt ~S is not already present");
  public static final SubLSymbol $sym18$CNF_P = makeSymbol("CNF-P");
  public static final SubLSymbol $sym19$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $kw20$IST = makeKeyword("IST");
  public static final SubLList $list21 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("ist"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("ist")), makeKeyword("APPLICABILITY"), makeSymbol("IST-ASSERTION-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("IST-ASSERTION-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("HL-ADD-AS-IST-ASSERTION"), makeKeyword("REMOVE"), makeSymbol("HL-REMOVE-AS-IST-ASSERTION"), makeKeyword("REMOVE-ALL"), makeSymbol("HL-REMOVE-ALL-AS-IST-ASSERTION")});
  public static final SubLObject $const22$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLList $list23 = list(constant_handles.reader_make_constant_shell(makeString("ist")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));
  public static final SubLList $list24 = list(makeSymbol("SUB-CNF"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-VARIABLE-MAP"), makeSymbol("QUERY-FREE-VARS"));
  public static final SubLSymbol $kw25$CONSTANT_NAME = makeKeyword("CONSTANT-NAME");
  public static final SubLList $list26 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("constantName"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("constantName")), makeKeyword("APPLICABILITY"), makeSymbol("CONSTANT-NAME-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("CONSTANT-NAME-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("CONSTANT-NAME-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("CONSTANT-NAME-HL-STORAGE-UNASSERT")});
  public static final SubLObject $const27$constantName = constant_handles.reader_make_constant_shell(makeString("constantName"));
  public static final SubLList $list28 = list(constant_handles.reader_make_constant_shell(makeString("constantName")), makeKeyword("CONSTANT"), makeKeyword("STRING"));
  public static final SubLSymbol $kw29$ASSERTION_DIRECTION = makeKeyword("ASSERTION-DIRECTION");
  public static final SubLList $list30 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("assertionDirection"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("APPLICABILITY"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-UNASSERT")});
  public static final SubLObject $const31$assertionDirection = constant_handles.reader_make_constant_shell(makeString("assertionDirection"));
  public static final SubLList $list32 = list(constant_handles.reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("ASSERTION"), list(makeKeyword("TEST"), makeSymbol("CYCL-DIRECTION-P")));
  public static final SubLSymbol $kw33$INDEXICAL_THE_USER = makeKeyword("INDEXICAL-THE-USER");
  public static final SubLList $list34 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("indexicalReferent TheUser"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("indexicalReferent")), makeKeyword("APPLICABILITY"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-UNASSERT")});
  public static final SubLObject $const35$indexicalReferent = constant_handles.reader_make_constant_shell(makeString("indexicalReferent"));
  public static final SubLList $list36 = list(constant_handles.reader_make_constant_shell(makeString("indexicalReferent")), constant_handles.reader_make_constant_shell(makeString("TheUser")), makeKeyword("FULLY-BOUND"));
  public static final SubLObject $const37$TheUser = constant_handles.reader_make_constant_shell(makeString("TheUser"));
  public static final SubLObject $const38$performSubL = constant_handles.reader_make_constant_shell(makeString("performSubL"));
  public static final SubLSymbol $kw39$PERFORM_SUBL = makeKeyword("PERFORM-SUBL");
  public static final SubLList $list40 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("performSubL"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ARGUMENT"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("performSubL")), makeKeyword("APPLICABILITY"), makeSymbol("PERFORM-SUBL-HL-STORAGE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("PERFORM-SUBL-HL-STORAGE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("PERFORM-SUBL-HL-STORAGE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("PERFORM-SUBL-HL-STORAGE-UNASSERT")});
  public static final SubLList $list41 = list(constant_handles.reader_make_constant_shell(makeString("performSubL")), list(makeKeyword("OR"), list(constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn")), makeKeyword("FULLY-BOUND")), list(constant_handles.reader_make_constant_shell(makeString("ExpandSubLFn")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("LISTP"))), makeKeyword("FULLY-BOUND"))));
  public static final SubLList $list42 = list(makeKeyword("MT"), makeKeyword("DIRECTION"), makeKeyword("STRENGTH"));

  //// Initializers

  public void declareFunctions() {
    declare_hl_storage_module_declarations_file();
  }

  public void initializeVariables() {
    init_hl_storage_module_declarations_file();
  }

  public void runTopLevelForms() {
    setup_hl_storage_module_declarations_file();
  }

}
