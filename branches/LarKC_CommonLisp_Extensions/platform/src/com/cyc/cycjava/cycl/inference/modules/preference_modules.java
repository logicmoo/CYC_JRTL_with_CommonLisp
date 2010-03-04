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

package  com.cyc.cycjava.cycl.inference.modules;

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
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class preference_modules extends SubLTranslatedFile {

  //// Constructor

  private preference_modules() {}
  public static final SubLFile me = new preference_modules();
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.preference_modules";

  //// Definitions

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 3273) 
  public static final SubLObject problem_preference_level_wrt_modules(SubLObject problem, SubLObject strategic_context, SubLObject shared_vars) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(problem, $sym19$SINGLE_LITERAL_PROBLEM_P);
      {
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        thread.resetMultipleValues();
        {
          SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
          SubLObject asent = thread.secondMultipleValue();
          SubLObject sense = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                thread.resetMultipleValues();
                {
                  SubLObject preference_level_5 = literal_preference_level_wrt_modules(asent, sense, shared_vars, strategic_context);
                  SubLObject justification_6 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  preference_level = preference_level_5;
                  justification = justification_6;
                }
              } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return Values.values(preference_level, justification);
      }
    }
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 3870) 
  public static final SubLObject literal_preference_level_wrt_modules(SubLObject asent, SubLObject sense, SubLObject bindable_vars, SubLObject strategic_context) {
    {
      SubLObject min_preference_level = $kw20$PREFERRED;
      SubLObject justification = $str21$no_preference_modules_applicable;
      SubLObject disallowedP = NIL;
      if ((NIL != bindable_vars)) {
        {
          SubLObject relevant_modules = all_relevant_preference_modules(asent, sense, bindable_vars);
          SubLObject rest = NIL;
          for (rest = relevant_modules; (!(((NIL != disallowedP)
                || (NIL == rest)))); rest = rest.rest()) {
            {
              SubLObject prefmod = rest.first();
              SubLObject preference_level = preference_module_compute_preference_level(prefmod, asent, bindable_vars, strategic_context);
              if ((NIL != preference_level)) {
                if ((NIL != preference_level_L(preference_level, min_preference_level))) {
                  min_preference_level = preference_level;
                  justification = string_utilities.str(preference_module_name(prefmod));
                }
                if (($kw22$DISALLOWED == preference_level)) {
                  disallowedP = T;
                }
              }
            }
          }
        }
      }
      return Values.values(min_preference_level, justification);
    }
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 4851) 
  public static final SubLObject all_relevant_preference_modules(SubLObject asent, SubLObject sense, SubLObject bindable_vars) {
    {
      SubLObject candidate_modules = NIL;
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      {
        SubLObject csome_list_var = specific_preference_modules_for_pred(pred);
        SubLObject prefmod = NIL;
        for (prefmod = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), prefmod = csome_list_var.first()) {
          if ((NIL != preference_module_relevantP(prefmod, asent, sense, bindable_vars))) {
            candidate_modules = cons(prefmod, candidate_modules);
          }
        }
      }
      {
        SubLObject set_contents_var = set.do_set_internal($generic_preference_modules$.getGlobalValue());
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject prefmod = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, prefmod))) {
              if ((NIL != preference_module_relevantP(prefmod, asent, sense, bindable_vars))) {
                candidate_modules = cons(prefmod, candidate_modules);
              }
            }
          }
        }
      }
      {
        SubLObject relevant_modules = NIL;
        SubLObject supplanted_module_names = NIL;
        SubLObject cdolist_list_var = candidate_modules;
        SubLObject candidate_module = NIL;
        for (candidate_module = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_module = cdolist_list_var.first()) {
          if ((!((($kw23$ALL == supplanted_module_names)
                || (NIL != list_utilities.member_eqP(preference_module_name(candidate_module), supplanted_module_names)))))) {
            if ((NIL != preference_module_exclusiveP(candidate_module))) {
              {
                SubLObject supplants_spec = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32940");
                if (($kw23$ALL == supplants_spec)) {
                  supplanted_module_names = $kw23$ALL;
                  relevant_modules = NIL;
                } else {
                  {
                    SubLObject cdolist_list_var_7 = supplants_spec;
                    SubLObject supplanted_module_name = NIL;
                    for (supplanted_module_name = cdolist_list_var_7.first(); (NIL != cdolist_list_var_7); cdolist_list_var_7 = cdolist_list_var_7.rest(), supplanted_module_name = cdolist_list_var_7.first()) {
                      relevant_modules = Sequences.delete(supplanted_module_name, relevant_modules, Symbols.symbol_function(EQ), Symbols.symbol_function($sym24$PREFERENCE_MODULE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      {
                        SubLObject item_var = supplanted_module_name;
                        if ((NIL == conses_high.member(item_var, supplanted_module_names, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                          supplanted_module_names = cons(item_var, supplanted_module_names);
                        }
                      }
                    }
                  }
                }
              }
            }
            relevant_modules = cons(candidate_module, relevant_modules);
          }
        }
        return relevant_modules;
      }
    }
  }

  /** These are sorted from least preferred to most preferred.
 Disallowed:           no answers can be generated for the literal as-is, but answers might be generated if the literal were more fully bound.
 Grossly Dispreferred: many answers will probably be missed if the literal is enumerated, but they might be testable if the literal were more fully bound.
 Dispreferred:         some answers might be missed if the literal is enumerated, but they might be testable if the literal were more fully bound.
 Preferred:            everything that's decidable is also enumerable, i.e. anything that could be proven if the literal were more fully bound is provable in the current state.
 */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 6678) 
  private static SubLSymbol $ordered_preference_levels$ = null;

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 8111) 
  public static final SubLObject preference_level_p(SubLObject object) {
    return list_utilities.member_eqP(object, $ordered_preference_levels$.getGlobalValue());
  }

  /** @return boolean; t iff PREFERENCE-LEVEL1 is _less_ preferred than PREFERENCE-LEVEL2. */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 8300) 
  public static final SubLObject preference_level_L(SubLObject preference_level1, SubLObject preference_level2) {
    checkType(preference_level1, $sym30$PREFERENCE_LEVEL_P);
    checkType(preference_level2, $sym30$PREFERENCE_LEVEL_P);
    return list_utilities.position_L(preference_level1, preference_level2, $ordered_preference_levels$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
  }

  /** @return boolean; t iff PREFERENCE-LEVEL1 is _more_ preferred than PREFERENCE-LEVEL2. */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 8653) 
  public static final SubLObject preference_level_G(SubLObject preference_level1, SubLObject preference_level2) {
    return preference_level_L(preference_level2, preference_level1);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 8881) 
  public static final SubLObject preference_level_LE(SubLObject preference_level1, SubLObject preference_level2) {
    return makeBoolean((NIL == preference_level_G(preference_level1, preference_level2)));
  }

  /** @hack This function should go away soon. */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 10131) 
  public static final SubLObject completeness_to_preference_level(SubLObject completeness) {
    {
      SubLObject pcase_var = completeness;
      if (pcase_var.eql($kw41$COMPLETE)) {
        return $kw20$PREFERRED;
      } else if (pcase_var.eql($kw42$INCOMPLETE)) {
        return $kw32$DISPREFERRED;
      } else if (pcase_var.eql($kw43$GROSSLY_INCOMPLETE)) {
        return $kw34$GROSSLY_DISPREFERRED;
      } else if (pcase_var.eql($kw44$IMPOSSIBLE)) {
        return $kw22$DISALLOWED;
      } else {
        return Errors.error($str45$unexpected_completeness__s, completeness);
      }
    }
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 10962) 
  private static SubLSymbol $preference_module_properties$ = null;

  /** @return t or throw an error */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 12370) 
  public static final SubLObject check_preference_module_properties(SubLObject plist) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject remainder = NIL;
        for (remainder = plist; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
          {
            SubLObject property = remainder.first();
            SubLObject value = conses_high.cadr(remainder);
            checkType(property, $sym48$PREFERENCE_MODULE_PROPERTY_P);
            {
              SubLObject pcase_var = property;
              if (pcase_var.eql($kw49$PREDICATE)) {
                checkType(value, $sym50$FORT_P);
              } else if (pcase_var.eql($kw51$SENSE)) {
                checkType(value, $sym52$SENSE_P);
              } else if (pcase_var.eql($kw53$REQUIRED_PATTERN)) {
                checkType(value, $sym54$CONSP);
              } else if (pcase_var.eql($kw55$REQUIRED_MT)) {
                checkType(value, $sym56$HLMT_P);
              } else if (pcase_var.eql($kw57$ANY_PREDICATES)) {
                checkType(value, $sym58$LISTP);
              } else if (pcase_var.eql($kw59$EXCLUSIVE)) {
                checkType(value, $sym60$FUNCTION_SPEC_P);
              } else if (pcase_var.eql($kw61$SUPPLANTS)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                  if ((!(((value == $kw23$ALL)
                        || ((NIL != list_utilities.proper_list_p(value))
                           && (NIL != list_utilities.every_in_list($sym62$SYMBOLP, value, UNPROVIDED))))))) {
                    Errors.error($str63$invalid__supplants_value__s, value);
                  }
                }
              } else if (pcase_var.eql($kw64$PREFERENCE_LEVEL)) {
                checkType(value, $sym30$PREFERENCE_LEVEL_P);
              } else if (pcase_var.eql($kw65$PREFERENCE)) {
                checkType(value, $sym62$SYMBOLP);
              } else {
                Errors.error($str66$unexpected_preference_module_prop, property);
              }
            }
          }
        }
      }
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == conses_high.getf(plist, $kw51$SENSE, UNPROVIDED))) {
          Errors.error($str67$_s_must_specify__sense);
        }
      }
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((makeBoolean((NIL == conses_high.getf(plist, $kw64$PREFERENCE_LEVEL, UNPROVIDED))) == makeBoolean((NIL == conses_high.getf(plist, $kw65$PREFERENCE, UNPROVIDED))))) {
          Errors.error($str68$_s_must_specify_exactly_one_of__p, plist);
        }
      }
      return T;
    }
  }

  /** A dictionary mapping names (keywords) to preference module objects. */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 13491) 
  private static SubLSymbol $preference_modules_by_name$ = null;

  /** The set of preference modules that are not specific to a single predicate */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 13717) 
  private static SubLSymbol $generic_preference_modules$ = null;

  /** Dictionary mapping a predicate to a list of preference modules that apply to that predicate */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 13860) 
  private static SubLSymbol $specific_preference_modules$ = null;

  /** Dictionary mapping a preference module to its supplants property */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 14029) 
  private static SubLSymbol $preference_module_supplants$ = null;

  /** @note called by reclassify-removal-modules */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 14217) 
  public static final SubLObject reclassify_preference_modules() {
    dictionary.dictionary_rebuild($specific_preference_modules$.getGlobalValue());
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 15005) 
  public static final SubLObject specific_preference_modules_for_pred(SubLObject pred) {
    return dictionary.dictionary_lookup_without_values($specific_preference_modules$.getGlobalValue(), pred, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 15286) 
  public static final SubLObject note_preference_module_supplants(SubLObject prefmod, SubLObject supplants) {
    if ((NIL == supplants)) {
      dictionary.dictionary_remove($preference_module_supplants$.getGlobalValue(), prefmod);
    } else {
      dictionary.dictionary_enter($preference_module_supplants$.getGlobalValue(), prefmod, supplants);
    }
    return prefmod;
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 15551) 
  public static final SubLObject preference_module_exclusiveP(SubLObject prefmod) {
    return list_utilities.sublisp_boolean(dictionary.dictionary_lookup_without_values($preference_module_supplants$.getGlobalValue(), prefmod, NIL));
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 16408) 
  public static final SubLObject register_preference_module(SubLObject prefmod) {
    dictionary.dictionary_enter($preference_modules_by_name$.getGlobalValue(), preference_module_name(prefmod), prefmod);
    {
      SubLObject predicate = preference_module_predicate(prefmod);
      if ((NIL != predicate)) {
        dictionary_utilities.dictionary_push($specific_preference_modules$.getGlobalValue(), predicate, prefmod);
      } else {
        set.set_add(prefmod, $generic_preference_modules$.getGlobalValue());
      }
    }
    return prefmod;
  }

  public static final class $preference_module_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $predicate; }
    public SubLObject getField4() { return $sense; }
    public SubLObject getField5() { return $required_pattern; }
    public SubLObject getField6() { return $preference_level; }
    public SubLObject getField7() { return $preference_func; }
    public SubLObject getField8() { return $required_mt; }
    public SubLObject getField9() { return $any_predicates; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $predicate = value; }
    public SubLObject setField4(SubLObject value) { return $sense = value; }
    public SubLObject setField5(SubLObject value) { return $required_pattern = value; }
    public SubLObject setField6(SubLObject value) { return $preference_level = value; }
    public SubLObject setField7(SubLObject value) { return $preference_func = value; }
    public SubLObject setField8(SubLObject value) { return $required_mt = value; }
    public SubLObject setField9(SubLObject value) { return $any_predicates = value; }
    public SubLObject $name = NIL;
    public SubLObject $predicate = NIL;
    public SubLObject $sense = NIL;
    public SubLObject $required_pattern = NIL;
    public SubLObject $preference_level = NIL;
    public SubLObject $preference_func = NIL;
    public SubLObject $required_mt = NIL;
    public SubLObject $any_predicates = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($preference_module_native.class, $sym71$PREFERENCE_MODULE, $sym72$PREFERENCE_MODULE_P, $list73, $list74, new String[] {"$name", "$predicate", "$sense", "$required_pattern", "$preference_level", "$preference_func", "$required_mt", "$any_predicates"}, $list75, $list76, $sym77$PRINT_PREFERENCE_MODULE);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static SubLSymbol $dtp_preference_module$ = null;

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject preference_module_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32941");
    return NIL;
  }

  public static final class $preference_module_p$UnaryFunction extends UnaryFunction {
    public $preference_module_p$UnaryFunction() { super(extractFunctionNamed("PREFERENCE-MODULE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32939"); }
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject pref_mod_name(SubLObject object) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject pref_mod_predicate(SubLObject object) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject pref_mod_sense(SubLObject object) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject pref_mod_required_pattern(SubLObject object) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject pref_mod_preference_level(SubLObject object) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.getField6();
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject pref_mod_preference_func(SubLObject object) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.getField7();
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject pref_mod_required_mt(SubLObject object) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.getField8();
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject pref_mod_any_predicates(SubLObject object) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.getField9();
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject _csetf_pref_mod_name(SubLObject object, SubLObject value) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject _csetf_pref_mod_predicate(SubLObject object, SubLObject value) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject _csetf_pref_mod_sense(SubLObject object, SubLObject value) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject _csetf_pref_mod_required_pattern(SubLObject object, SubLObject value) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject _csetf_pref_mod_preference_level(SubLObject object, SubLObject value) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject _csetf_pref_mod_preference_func(SubLObject object, SubLObject value) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject _csetf_pref_mod_required_mt(SubLObject object, SubLObject value) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject _csetf_pref_mod_any_predicates(SubLObject object, SubLObject value) {
    checkType(object, $sym72$PREFERENCE_MODULE_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17292) 
  public static final SubLObject make_preference_module(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $preference_module_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw95$NAME)) {
            _csetf_pref_mod_name(v_new, current_value);
          } else if (pcase_var.eql($kw49$PREDICATE)) {
            _csetf_pref_mod_predicate(v_new, current_value);
          } else if (pcase_var.eql($kw51$SENSE)) {
            _csetf_pref_mod_sense(v_new, current_value);
          } else if (pcase_var.eql($kw53$REQUIRED_PATTERN)) {
            _csetf_pref_mod_required_pattern(v_new, current_value);
          } else if (pcase_var.eql($kw64$PREFERENCE_LEVEL)) {
            _csetf_pref_mod_preference_level(v_new, current_value);
          } else if (pcase_var.eql($kw96$PREFERENCE_FUNC)) {
            _csetf_pref_mod_preference_func(v_new, current_value);
          } else if (pcase_var.eql($kw55$REQUIRED_MT)) {
            _csetf_pref_mod_required_mt(v_new, current_value);
          } else if (pcase_var.eql($kw57$ANY_PREDICATES)) {
            _csetf_pref_mod_any_predicates(v_new, current_value);
          } else {
            Errors.error($str97$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  public static final class $sxhash_preference_module_method$UnaryFunction extends UnaryFunction {
    public $sxhash_preference_module_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-PREFERENCE-MODULE-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32942"); }
  }

  /** @return nil or preference-module-p */
  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17828) 
  public static final SubLObject find_preference_module(SubLObject name) {
    checkType(name, $sym100$KEYWORDP);
    return dictionary.dictionary_lookup_without_values($preference_modules_by_name$.getGlobalValue(), name, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 18038) 
  public static final SubLObject inference_preference_module(SubLObject name, SubLObject plist) {
    checkType(name, $sym100$KEYWORDP);
    check_preference_module_properties(plist);
    {
      SubLObject prefmod = find_preference_module(name);
      if ((NIL != prefmod)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32934");
      } else {
        prefmod = make_preference_module(UNPROVIDED);
      }
      {
        SubLObject datum = plist;
        SubLObject current = datum;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_8 = NIL;
        for (; (NIL != rest); ) {
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list101);
          current_8 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list101);
          if ((NIL == conses_high.member(current_8, $list102, UNPROVIDED, UNPROVIDED))) {
            bad = T;
          }
          if ((current_8 == $kw2$ALLOW_OTHER_KEYS)) {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if (((NIL != bad)
             && (NIL == allow_other_keys_p))) {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list101);
        }
        {
          SubLObject predicate_tail = cdestructuring_bind.property_list_member($kw49$PREDICATE, current);
          SubLObject predicate = ((NIL != predicate_tail) ? ((SubLObject) conses_high.cadr(predicate_tail)) : NIL);
          SubLObject sense_tail = cdestructuring_bind.property_list_member($kw51$SENSE, current);
          SubLObject sense = ((NIL != sense_tail) ? ((SubLObject) conses_high.cadr(sense_tail)) : NIL);
          SubLObject any_predicates_tail = cdestructuring_bind.property_list_member($kw57$ANY_PREDICATES, current);
          SubLObject any_predicates = ((NIL != any_predicates_tail) ? ((SubLObject) conses_high.cadr(any_predicates_tail)) : NIL);
          SubLObject required_pattern_tail = cdestructuring_bind.property_list_member($kw53$REQUIRED_PATTERN, current);
          SubLObject required_pattern = ((NIL != required_pattern_tail) ? ((SubLObject) conses_high.cadr(required_pattern_tail)) : NIL);
          SubLObject required_mt_tail = cdestructuring_bind.property_list_member($kw55$REQUIRED_MT, current);
          SubLObject required_mt = ((NIL != required_mt_tail) ? ((SubLObject) conses_high.cadr(required_mt_tail)) : NIL);
          SubLObject supplants_tail = cdestructuring_bind.property_list_member($kw61$SUPPLANTS, current);
          SubLObject supplants = ((NIL != supplants_tail) ? ((SubLObject) conses_high.cadr(supplants_tail)) : NIL);
          SubLObject preference_level_tail = cdestructuring_bind.property_list_member($kw64$PREFERENCE_LEVEL, current);
          SubLObject preference_level = ((NIL != preference_level_tail) ? ((SubLObject) conses_high.cadr(preference_level_tail)) : NIL);
          SubLObject preference_tail = cdestructuring_bind.property_list_member($kw65$PREFERENCE, current);
          SubLObject preference = ((NIL != preference_tail) ? ((SubLObject) conses_high.cadr(preference_tail)) : NIL);
          _csetf_pref_mod_name(prefmod, name);
          _csetf_pref_mod_predicate(prefmod, predicate);
          _csetf_pref_mod_any_predicates(prefmod, any_predicates);
          _csetf_pref_mod_sense(prefmod, sense);
          _csetf_pref_mod_required_pattern(prefmod, required_pattern);
          _csetf_pref_mod_required_mt(prefmod, required_mt);
          _csetf_pref_mod_preference_level(prefmod, preference_level);
          _csetf_pref_mod_preference_func(prefmod, preference);
          note_preference_module_supplants(prefmod, supplants);
        }
      }
      register_preference_module(prefmod);
      return prefmod;
    }
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19299) 
  public static final SubLObject preference_module_name(SubLObject prefmod) {
    checkType(prefmod, $sym72$PREFERENCE_MODULE_P);
    return pref_mod_name(prefmod);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19439) 
  public static final SubLObject preference_module_predicate(SubLObject prefmod) {
    checkType(prefmod, $sym72$PREFERENCE_MODULE_P);
    return pref_mod_predicate(prefmod);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19575) 
  public static final SubLObject preference_module_any_predicates(SubLObject prefmod) {
    checkType(prefmod, $sym72$PREFERENCE_MODULE_P);
    return pref_mod_any_predicates(prefmod);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19721) 
  public static final SubLObject preference_module_sense(SubLObject prefmod) {
    checkType(prefmod, $sym72$PREFERENCE_MODULE_P);
    return pref_mod_sense(prefmod);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19849) 
  public static final SubLObject preference_module_required_pattern(SubLObject prefmod) {
    checkType(prefmod, $sym72$PREFERENCE_MODULE_P);
    return pref_mod_required_pattern(prefmod);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19999) 
  public static final SubLObject preference_module_required_mt(SubLObject prefmod) {
    checkType(prefmod, $sym72$PREFERENCE_MODULE_P);
    return pref_mod_required_mt(prefmod);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 20139) 
  public static final SubLObject preference_module_preference_level(SubLObject prefmod) {
    checkType(prefmod, $sym72$PREFERENCE_MODULE_P);
    return pref_mod_preference_level(prefmod);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 20289) 
  public static final SubLObject preference_module_preference_func(SubLObject prefmod) {
    checkType(prefmod, $sym72$PREFERENCE_MODULE_P);
    return pref_mod_preference_func(prefmod);
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 21908) 
  public static final SubLObject preference_module_relevantP(SubLObject prefmod, SubLObject asent, SubLObject sense, SubLObject bindable_vars) {
    if ((NIL != preference_module_predicate_matchP(prefmod, cycl_utilities.atomic_sentence_predicate(asent)))) {
      if ((NIL != preference_module_sense_matchP(prefmod, sense))) {
        if ((NIL != preference_module_required_pattern_matchP(prefmod, asent, bindable_vars))) {
          if ((NIL != preference_module_required_mt_matchP(prefmod))) {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22489) 
  public static final SubLObject preference_module_predicate_matchP(SubLObject prefmod, SubLObject pred) {
    {
      SubLObject match_pred = preference_module_predicate(prefmod);
      if ((NIL != match_pred)) {
        return Equality.eq(match_pred, pred);
      }
    }
    {
      SubLObject match_any_preds = preference_module_any_predicates(prefmod);
      if ((NIL != match_any_preds)) {
        return subl_promotions.memberP(pred, match_any_preds, $sym103$PATTERN_MATCHES_FORMULA, UNPROVIDED);
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22853) 
  public static final SubLObject preference_module_sense_matchP(SubLObject prefmod, SubLObject sense) {
    return Equality.eq(sense, preference_module_sense(prefmod));
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22971) 
  public static final SubLObject preference_module_required_pattern_matchP(SubLObject prefmod, SubLObject asent, SubLObject bindable_vars) {
    {
      SubLObject pattern = preference_module_required_pattern(prefmod);
      return makeBoolean(((NIL == pattern)
            || (NIL != formula_pattern_match.formula_matches_pattern(asent, pattern))));
    }
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 23279) 
  public static final SubLObject preference_module_required_mt_matchP(SubLObject prefmod) {
    {
      SubLObject match_mt = preference_module_required_mt(prefmod);
      return makeBoolean(((NIL == match_mt)
            || (NIL != mt_relevance_macros.relevant_mtP(match_mt))));
    }
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 23460) 
  public static final SubLObject preference_module_compute_preference_level(SubLObject prefmod, SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
    {
      SubLObject preference_level = preference_module_preference_level(prefmod);
      if ((NIL != preference_level)) {
        return preference_level;
      } else {
        {
          SubLObject preference_func = preference_module_preference_func(prefmod);
          return preference_module_compute_preference_level_funcall(preference_func, asent, bindable_vars, strategic_context);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 23920) 
  public static final SubLObject preference_module_compute_preference_level_funcall(SubLObject preference_func, SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
    {
      SubLObject pcase_var = preference_func;
      if (pcase_var.eql($sym104$TVA_POS_PREFERENCE)) {
        return removal_modules_tva_lookup.tva_pos_preference(asent, bindable_vars, strategic_context);
      } else {
        return Functions.funcall(preference_func, asent, bindable_vars, strategic_context);
      }
    }
  }

  public static final SubLObject declare_preference_modules_file() {
    declareMacro(myName, "do_generic_preference_modules", "DO-GENERIC-PREFERENCE-MODULES");
    declareMacro(myName, "do_specific_preference_modules_for_pred", "DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED");
    declareMacro(myName, "do_relevant_preference_modules", "DO-RELEVANT-PREFERENCE-MODULES");
    declareMacro(myName, "do_preference_modules", "DO-PREFERENCE-MODULES");
    declareFunction(myName, "problem_preference_level_wrt_modules", "PROBLEM-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
    declareFunction(myName, "literal_preference_level_wrt_modules", "LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
    declareFunction(myName, "all_relevant_preference_modules", "ALL-RELEVANT-PREFERENCE-MODULES", 3, 0, false);
    declareFunction(myName, "el_literal_preference_level_wrt_modules", "EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
    declareFunction(myName, "preference_level_string", "PREFERENCE-LEVEL-STRING", 1, 0, false);
    declareFunction(myName, "preference_level_p", "PREFERENCE-LEVEL-P", 1, 0, false);
    declareFunction(myName, "disallowed_preference_level_p", "DISALLOWED-PREFERENCE-LEVEL-P", 1, 0, false);
    declareFunction(myName, "preference_level_L", "PREFERENCE-LEVEL-<", 2, 0, false);
    declareFunction(myName, "preference_level_G", "PREFERENCE-LEVEL->", 2, 0, false);
    declareFunction(myName, "preference_level_LE", "PREFERENCE-LEVEL-<=", 2, 0, false);
    declareFunction(myName, "preference_level_GE", "PREFERENCE-LEVEL->=", 2, 0, false);
    declareFunction(myName, "min_preference_level", "MIN-PREFERENCE-LEVEL", 1, 0, false);
    declareFunction(myName, "min2_preference_level", "MIN2-PREFERENCE-LEVEL", 2, 0, false);
    declareFunction(myName, "max_preference_level", "MAX-PREFERENCE-LEVEL", 1, 0, false);
    declareFunction(myName, "max2_preference_level", "MAX2-PREFERENCE-LEVEL", 2, 0, false);
    declareFunction(myName, "completeness_to_preference_level", "COMPLETENESS-TO-PREFERENCE-LEVEL", 1, 0, false);
    declareFunction(myName, "preference_level_to_completeness", "PREFERENCE-LEVEL-TO-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "preference_module_property_p", "PREFERENCE-MODULE-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "check_preference_module_properties", "CHECK-PREFERENCE-MODULE-PROPERTIES", 1, 0, false);
    declareFunction(myName, "reclassify_preference_modules", "RECLASSIFY-PREFERENCE-MODULES", 0, 0, false);
    declareFunction(myName, "generic_preference_modules", "GENERIC-PREFERENCE-MODULES", 0, 0, false);
    declareFunction(myName, "generic_preference_module_count", "GENERIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "specific_preference_module_count", "SPECIFIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "preference_module_count", "PREFERENCE-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "specific_preference_module_predicates", "SPECIFIC-PREFERENCE-MODULE-PREDICATES", 0, 0, false);
    declareFunction(myName, "specific_preference_modules_for_pred", "SPECIFIC-PREFERENCE-MODULES-FOR-PRED", 1, 0, false);
    declareFunction(myName, "predicate_has_specific_preference_modulesP", "PREDICATE-HAS-SPECIFIC-PREFERENCE-MODULES?", 1, 0, false);
    declareFunction(myName, "note_preference_module_supplants", "NOTE-PREFERENCE-MODULE-SUPPLANTS", 2, 0, false);
    declareFunction(myName, "preference_module_exclusiveP", "PREFERENCE-MODULE-EXCLUSIVE?", 1, 0, false);
    declareFunction(myName, "preference_module_supplants", "PREFERENCE-MODULE-SUPPLANTS", 1, 0, false);
    declareFunction(myName, "deregister_preference_module", "DEREGISTER-PREFERENCE-MODULE", 1, 0, false);
    declareFunction(myName, "register_preference_module", "REGISTER-PREFERENCE-MODULE", 1, 0, false);
    declareFunction(myName, "preference_module_print_function_trampoline", "PREFERENCE-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "preference_module_p", "PREFERENCE-MODULE-P", 1, 0, false); new $preference_module_p$UnaryFunction();
    declareFunction(myName, "pref_mod_name", "PREF-MOD-NAME", 1, 0, false);
    declareFunction(myName, "pref_mod_predicate", "PREF-MOD-PREDICATE", 1, 0, false);
    declareFunction(myName, "pref_mod_sense", "PREF-MOD-SENSE", 1, 0, false);
    declareFunction(myName, "pref_mod_required_pattern", "PREF-MOD-REQUIRED-PATTERN", 1, 0, false);
    declareFunction(myName, "pref_mod_preference_level", "PREF-MOD-PREFERENCE-LEVEL", 1, 0, false);
    declareFunction(myName, "pref_mod_preference_func", "PREF-MOD-PREFERENCE-FUNC", 1, 0, false);
    declareFunction(myName, "pref_mod_required_mt", "PREF-MOD-REQUIRED-MT", 1, 0, false);
    declareFunction(myName, "pref_mod_any_predicates", "PREF-MOD-ANY-PREDICATES", 1, 0, false);
    declareFunction(myName, "_csetf_pref_mod_name", "_CSETF-PREF-MOD-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_pref_mod_predicate", "_CSETF-PREF-MOD-PREDICATE", 2, 0, false);
    declareFunction(myName, "_csetf_pref_mod_sense", "_CSETF-PREF-MOD-SENSE", 2, 0, false);
    declareFunction(myName, "_csetf_pref_mod_required_pattern", "_CSETF-PREF-MOD-REQUIRED-PATTERN", 2, 0, false);
    declareFunction(myName, "_csetf_pref_mod_preference_level", "_CSETF-PREF-MOD-PREFERENCE-LEVEL", 2, 0, false);
    declareFunction(myName, "_csetf_pref_mod_preference_func", "_CSETF-PREF-MOD-PREFERENCE-FUNC", 2, 0, false);
    declareFunction(myName, "_csetf_pref_mod_required_mt", "_CSETF-PREF-MOD-REQUIRED-MT", 2, 0, false);
    declareFunction(myName, "_csetf_pref_mod_any_predicates", "_CSETF-PREF-MOD-ANY-PREDICATES", 2, 0, false);
    declareFunction(myName, "make_preference_module", "MAKE-PREFERENCE-MODULE", 0, 1, false);
    declareFunction(myName, "print_preference_module", "PRINT-PREFERENCE-MODULE", 3, 0, false);
    declareFunction(myName, "sxhash_preference_module_method", "SXHASH-PREFERENCE-MODULE-METHOD", 1, 0, false); new $sxhash_preference_module_method$UnaryFunction();
    declareFunction(myName, "find_preference_module", "FIND-PREFERENCE-MODULE", 1, 0, false);
    declareFunction(myName, "inference_preference_module", "INFERENCE-PREFERENCE-MODULE", 2, 0, false);
    declareFunction(myName, "undeclare_inference_preference_module", "UNDECLARE-INFERENCE-PREFERENCE-MODULE", 1, 0, false);
    declareFunction(myName, "preference_module_name", "PREFERENCE-MODULE-NAME", 1, 0, false);
    declareFunction(myName, "preference_module_predicate", "PREFERENCE-MODULE-PREDICATE", 1, 0, false);
    declareFunction(myName, "preference_module_any_predicates", "PREFERENCE-MODULE-ANY-PREDICATES", 1, 0, false);
    declareFunction(myName, "preference_module_sense", "PREFERENCE-MODULE-SENSE", 1, 0, false);
    declareFunction(myName, "preference_module_required_pattern", "PREFERENCE-MODULE-REQUIRED-PATTERN", 1, 0, false);
    declareFunction(myName, "preference_module_required_mt", "PREFERENCE-MODULE-REQUIRED-MT", 1, 0, false);
    declareFunction(myName, "preference_module_preference_level", "PREFERENCE-MODULE-PREFERENCE-LEVEL", 1, 0, false);
    declareFunction(myName, "preference_module_preference_func", "PREFERENCE-MODULE-PREFERENCE-FUNC", 1, 0, false);
    declareFunction(myName, "preference_module_relevantP", "PREFERENCE-MODULE-RELEVANT?", 4, 0, false);
    declareFunction(myName, "preference_module_predicate_matchP", "PREFERENCE-MODULE-PREDICATE-MATCH?", 2, 0, false);
    declareFunction(myName, "preference_module_sense_matchP", "PREFERENCE-MODULE-SENSE-MATCH?", 2, 0, false);
    declareFunction(myName, "preference_module_required_pattern_matchP", "PREFERENCE-MODULE-REQUIRED-PATTERN-MATCH?", 3, 0, false);
    declareFunction(myName, "preference_module_required_mt_matchP", "PREFERENCE-MODULE-REQUIRED-MT-MATCH?", 1, 0, false);
    declareFunction(myName, "preference_module_compute_preference_level", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL", 4, 0, false);
    declareFunction(myName, "preference_module_compute_preference_level_funcall", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL-FUNCALL", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_preference_modules_file() {
    $ordered_preference_levels$ = deflexical("*ORDERED-PREFERENCE-LEVELS*", $list29);
    $preference_module_properties$ = deflexical("*PREFERENCE-MODULE-PROPERTIES*", $list47);
    $preference_modules_by_name$ = deflexical("*PREFERENCE-MODULES-BY-NAME*", ((NIL != Symbols.boundp($sym18$_PREFERENCE_MODULES_BY_NAME_)) ? ((SubLObject) $preference_modules_by_name$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    $generic_preference_modules$ = deflexical("*GENERIC-PREFERENCE-MODULES*", ((NIL != Symbols.boundp($sym5$_GENERIC_PREFERENCE_MODULES_)) ? ((SubLObject) $generic_preference_modules$.getGlobalValue()) : set.new_set(Symbols.symbol_function(EQ), UNPROVIDED)));
    $specific_preference_modules$ = deflexical("*SPECIFIC-PREFERENCE-MODULES*", ((NIL != Symbols.boundp($sym69$_SPECIFIC_PREFERENCE_MODULES_)) ? ((SubLObject) $specific_preference_modules$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    $preference_module_supplants$ = deflexical("*PREFERENCE-MODULE-SUPPLANTS*", ((NIL != Symbols.boundp($sym70$_PREFERENCE_MODULE_SUPPLANTS_)) ? ((SubLObject) $preference_module_supplants$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    $dtp_preference_module$ = defconstant("*DTP-PREFERENCE-MODULE*", $sym71$PREFERENCE_MODULE);
    return NIL;
  }

  public static final SubLObject setup_preference_modules_file() {
    // CVS_ID("Id: preference-modules.lisp 128153 2009-06-26 17:30:24Z pace ");
    subl_macro_promotions.declare_defglobal($sym18$_PREFERENCE_MODULES_BY_NAME_);
    subl_macro_promotions.declare_defglobal($sym5$_GENERIC_PREFERENCE_MODULES_);
    subl_macro_promotions.declare_defglobal($sym69$_SPECIFIC_PREFERENCE_MODULES_);
    subl_macro_promotions.declare_defglobal($sym70$_PREFERENCE_MODULE_SUPPLANTS_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), Symbols.symbol_function($sym78$PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym79$PREF_MOD_NAME, $sym80$_CSETF_PREF_MOD_NAME);
    Structures.def_csetf($sym81$PREF_MOD_PREDICATE, $sym82$_CSETF_PREF_MOD_PREDICATE);
    Structures.def_csetf($sym83$PREF_MOD_SENSE, $sym84$_CSETF_PREF_MOD_SENSE);
    Structures.def_csetf($sym85$PREF_MOD_REQUIRED_PATTERN, $sym86$_CSETF_PREF_MOD_REQUIRED_PATTERN);
    Structures.def_csetf($sym87$PREF_MOD_PREFERENCE_LEVEL, $sym88$_CSETF_PREF_MOD_PREFERENCE_LEVEL);
    Structures.def_csetf($sym89$PREF_MOD_PREFERENCE_FUNC, $sym90$_CSETF_PREF_MOD_PREFERENCE_FUNC);
    Structures.def_csetf($sym91$PREF_MOD_REQUIRED_MT, $sym92$_CSETF_PREF_MOD_REQUIRED_MT);
    Structures.def_csetf($sym93$PREF_MOD_ANY_PREDICATES, $sym94$_CSETF_PREF_MOD_ANY_PREDICATES);
    Equality.identity($sym71$PREFERENCE_MODULE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), Symbols.symbol_function($sym99$SXHASH_PREFERENCE_MODULE_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("PREFMOD"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym4$DO_SET = makeSymbol("DO-SET");
  public static final SubLSymbol $sym5$_GENERIC_PREFERENCE_MODULES_ = makeSymbol("*GENERIC-PREFERENCE-MODULES*");
  public static final SubLList $list6 = list(list(makeSymbol("PREFMOD"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym7$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym8$SPECIFIC_PREFERENCE_MODULES_FOR_PRED = makeSymbol("SPECIFIC-PREFERENCE-MODULES-FOR-PRED");
  public static final SubLList $list9 = list(list(makeSymbol("PREFMOD"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("BINDABLE-VARS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym10$PRED = makeUninternedSymbol("PRED");
  public static final SubLSymbol $sym11$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym12$ATOMIC_SENTENCE_PREDICATE = makeSymbol("ATOMIC-SENTENCE-PREDICATE");
  public static final SubLSymbol $sym13$DO_SPECIFIC_PREFERENCE_MODULES_FOR_PRED = makeSymbol("DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED");
  public static final SubLSymbol $sym14$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym15$PREFERENCE_MODULE_RELEVANT_ = makeSymbol("PREFERENCE-MODULE-RELEVANT?");
  public static final SubLSymbol $sym16$DO_GENERIC_PREFERENCE_MODULES = makeSymbol("DO-GENERIC-PREFERENCE-MODULES");
  public static final SubLSymbol $sym17$DO_DICTIONARY_VALUES = makeSymbol("DO-DICTIONARY-VALUES");
  public static final SubLSymbol $sym18$_PREFERENCE_MODULES_BY_NAME_ = makeSymbol("*PREFERENCE-MODULES-BY-NAME*");
  public static final SubLSymbol $sym19$SINGLE_LITERAL_PROBLEM_P = makeSymbol("SINGLE-LITERAL-PROBLEM-P");
  public static final SubLSymbol $kw20$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLString $str21$no_preference_modules_applicable = makeString("no preference modules applicable");
  public static final SubLSymbol $kw22$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLSymbol $kw23$ALL = makeKeyword("ALL");
  public static final SubLSymbol $sym24$PREFERENCE_MODULE_NAME = makeSymbol("PREFERENCE-MODULE-NAME");
  public static final SubLSymbol $sym25$SINGLETON_ = makeSymbol("SINGLETON?");
  public static final SubLList $list26 = list(makeSymbol("DNF-CLAUSE"), makeSymbol("BINDINGS"));
  public static final SubLSymbol $sym27$POS_ATOMIC_CLAUSE_P = makeSymbol("POS-ATOMIC-CLAUSE-P");
  public static final SubLSymbol $kw28$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLList $list29 = list(makeKeyword("DISALLOWED"), makeKeyword("GROSSLY-DISPREFERRED"), makeKeyword("DISPREFERRED"), makeKeyword("PREFERRED"));
  public static final SubLSymbol $sym30$PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");
  public static final SubLString $str31$Preferred = makeString("Preferred");
  public static final SubLSymbol $kw32$DISPREFERRED = makeKeyword("DISPREFERRED");
  public static final SubLString $str33$Dispreferred = makeString("Dispreferred");
  public static final SubLSymbol $kw34$GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
  public static final SubLString $str35$Grossly_Dispreferred = makeString("Grossly Dispreferred");
  public static final SubLString $str36$Disallowed = makeString("Disallowed");
  public static final SubLString $str37$Undetermined = makeString("Undetermined");
  public static final SubLString $str38$Unexpected_preference_level__a = makeString("Unexpected preference-level ~a");
  public static final SubLSymbol $sym39$PREFERENCE_LEVEL__ = makeSymbol("PREFERENCE-LEVEL-<");
  public static final SubLSymbol $sym40$PREFERENCE_LEVEL__ = makeSymbol("PREFERENCE-LEVEL->");
  public static final SubLSymbol $kw41$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $kw42$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw43$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $kw44$IMPOSSIBLE = makeKeyword("IMPOSSIBLE");
  public static final SubLString $str45$unexpected_completeness__s = makeString("unexpected completeness ~s");
  public static final SubLString $str46$unexpected_preference_level__s = makeString("unexpected preference-level ~s");
  public static final SubLList $list47 = list(makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("ANY-PREDICATES"), makeKeyword("SUPPLANTS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE"));
  public static final SubLSymbol $sym48$PREFERENCE_MODULE_PROPERTY_P = makeSymbol("PREFERENCE-MODULE-PROPERTY-P");
  public static final SubLSymbol $kw49$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $sym50$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $kw51$SENSE = makeKeyword("SENSE");
  public static final SubLSymbol $sym52$SENSE_P = makeSymbol("SENSE-P");
  public static final SubLSymbol $kw53$REQUIRED_PATTERN = makeKeyword("REQUIRED-PATTERN");
  public static final SubLSymbol $sym54$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $kw55$REQUIRED_MT = makeKeyword("REQUIRED-MT");
  public static final SubLSymbol $sym56$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $kw57$ANY_PREDICATES = makeKeyword("ANY-PREDICATES");
  public static final SubLSymbol $sym58$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $kw59$EXCLUSIVE = makeKeyword("EXCLUSIVE");
  public static final SubLSymbol $sym60$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $kw61$SUPPLANTS = makeKeyword("SUPPLANTS");
  public static final SubLSymbol $sym62$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLString $str63$invalid__supplants_value__s = makeString("invalid :supplants value ~s");
  public static final SubLSymbol $kw64$PREFERENCE_LEVEL = makeKeyword("PREFERENCE-LEVEL");
  public static final SubLSymbol $kw65$PREFERENCE = makeKeyword("PREFERENCE");
  public static final SubLString $str66$unexpected_preference_module_prop = makeString("unexpected preference module property ~s");
  public static final SubLString $str67$_s_must_specify__sense = makeString("~s must specify :sense");
  public static final SubLString $str68$_s_must_specify_exactly_one_of__p = makeString("~s must specify exactly one of :preference-level or :preference");
  public static final SubLSymbol $sym69$_SPECIFIC_PREFERENCE_MODULES_ = makeSymbol("*SPECIFIC-PREFERENCE-MODULES*");
  public static final SubLSymbol $sym70$_PREFERENCE_MODULE_SUPPLANTS_ = makeSymbol("*PREFERENCE-MODULE-SUPPLANTS*");
  public static final SubLSymbol $sym71$PREFERENCE_MODULE = makeSymbol("PREFERENCE-MODULE");
  public static final SubLSymbol $sym72$PREFERENCE_MODULE_P = makeSymbol("PREFERENCE-MODULE-P");
  public static final SubLList $list73 = list(makeSymbol("NAME"), makeSymbol("PREDICATE"), makeSymbol("SENSE"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("PREFERENCE-FUNC"), makeSymbol("REQUIRED-MT"), makeSymbol("ANY-PREDICATES"));
  public static final SubLList $list74 = list(makeKeyword("NAME"), makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE-FUNC"), makeKeyword("REQUIRED-MT"), makeKeyword("ANY-PREDICATES"));
  public static final SubLList $list75 = list(makeSymbol("PREF-MOD-NAME"), makeSymbol("PREF-MOD-PREDICATE"), makeSymbol("PREF-MOD-SENSE"), makeSymbol("PREF-MOD-REQUIRED-PATTERN"), makeSymbol("PREF-MOD-PREFERENCE-LEVEL"), makeSymbol("PREF-MOD-PREFERENCE-FUNC"), makeSymbol("PREF-MOD-REQUIRED-MT"), makeSymbol("PREF-MOD-ANY-PREDICATES"));
  public static final SubLList $list76 = list(makeSymbol("_CSETF-PREF-MOD-NAME"), makeSymbol("_CSETF-PREF-MOD-PREDICATE"), makeSymbol("_CSETF-PREF-MOD-SENSE"), makeSymbol("_CSETF-PREF-MOD-REQUIRED-PATTERN"), makeSymbol("_CSETF-PREF-MOD-PREFERENCE-LEVEL"), makeSymbol("_CSETF-PREF-MOD-PREFERENCE-FUNC"), makeSymbol("_CSETF-PREF-MOD-REQUIRED-MT"), makeSymbol("_CSETF-PREF-MOD-ANY-PREDICATES"));
  public static final SubLSymbol $sym77$PRINT_PREFERENCE_MODULE = makeSymbol("PRINT-PREFERENCE-MODULE");
  public static final SubLSymbol $sym78$PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PREFERENCE-MODULE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym79$PREF_MOD_NAME = makeSymbol("PREF-MOD-NAME");
  public static final SubLSymbol $sym80$_CSETF_PREF_MOD_NAME = makeSymbol("_CSETF-PREF-MOD-NAME");
  public static final SubLSymbol $sym81$PREF_MOD_PREDICATE = makeSymbol("PREF-MOD-PREDICATE");
  public static final SubLSymbol $sym82$_CSETF_PREF_MOD_PREDICATE = makeSymbol("_CSETF-PREF-MOD-PREDICATE");
  public static final SubLSymbol $sym83$PREF_MOD_SENSE = makeSymbol("PREF-MOD-SENSE");
  public static final SubLSymbol $sym84$_CSETF_PREF_MOD_SENSE = makeSymbol("_CSETF-PREF-MOD-SENSE");
  public static final SubLSymbol $sym85$PREF_MOD_REQUIRED_PATTERN = makeSymbol("PREF-MOD-REQUIRED-PATTERN");
  public static final SubLSymbol $sym86$_CSETF_PREF_MOD_REQUIRED_PATTERN = makeSymbol("_CSETF-PREF-MOD-REQUIRED-PATTERN");
  public static final SubLSymbol $sym87$PREF_MOD_PREFERENCE_LEVEL = makeSymbol("PREF-MOD-PREFERENCE-LEVEL");
  public static final SubLSymbol $sym88$_CSETF_PREF_MOD_PREFERENCE_LEVEL = makeSymbol("_CSETF-PREF-MOD-PREFERENCE-LEVEL");
  public static final SubLSymbol $sym89$PREF_MOD_PREFERENCE_FUNC = makeSymbol("PREF-MOD-PREFERENCE-FUNC");
  public static final SubLSymbol $sym90$_CSETF_PREF_MOD_PREFERENCE_FUNC = makeSymbol("_CSETF-PREF-MOD-PREFERENCE-FUNC");
  public static final SubLSymbol $sym91$PREF_MOD_REQUIRED_MT = makeSymbol("PREF-MOD-REQUIRED-MT");
  public static final SubLSymbol $sym92$_CSETF_PREF_MOD_REQUIRED_MT = makeSymbol("_CSETF-PREF-MOD-REQUIRED-MT");
  public static final SubLSymbol $sym93$PREF_MOD_ANY_PREDICATES = makeSymbol("PREF-MOD-ANY-PREDICATES");
  public static final SubLSymbol $sym94$_CSETF_PREF_MOD_ANY_PREDICATES = makeSymbol("_CSETF-PREF-MOD-ANY-PREDICATES");
  public static final SubLSymbol $kw95$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw96$PREFERENCE_FUNC = makeKeyword("PREFERENCE-FUNC");
  public static final SubLString $str97$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str98$_PREFMOD__a_ = makeString("[PREFMOD ~a]");
  public static final SubLSymbol $sym99$SXHASH_PREFERENCE_MODULE_METHOD = makeSymbol("SXHASH-PREFERENCE-MODULE-METHOD");
  public static final SubLSymbol $sym100$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLList $list101 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("PREDICATE"), makeSymbol("SENSE"), makeSymbol("ANY-PREDICATES"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("REQUIRED-MT"), makeSymbol("SUPPLANTS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("PREFERENCE")});
  public static final SubLList $list102 = list(makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("SUPPLANTS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE"));
  public static final SubLSymbol $sym103$PATTERN_MATCHES_FORMULA = makeSymbol("PATTERN-MATCHES-FORMULA");
  public static final SubLSymbol $sym104$TVA_POS_PREFERENCE = makeSymbol("TVA-POS-PREFERENCE");

  //// Initializers

  public void declareFunctions() {
    declare_preference_modules_file();
  }

  public void initializeVariables() {
    init_preference_modules_file();
  }

  public void runTopLevelForms() {
    setup_preference_modules_file();
  }

}
