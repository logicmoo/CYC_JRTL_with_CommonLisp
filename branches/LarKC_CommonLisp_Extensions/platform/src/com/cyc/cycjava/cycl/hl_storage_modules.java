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
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.canon_tl;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class hl_storage_modules extends SubLTranslatedFile {

  //// Constructor

  public static final SubLFile me = new hl_storage_modules();
  public static final String myName = "com.cyc.cycjava.cycl.hl_storage_modules";

  //// Definitions

  /** Set of HL storage modules (set-p of hl-module-p) */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 898) 
  private static SubLSymbol $hl_storage_modules$ = null;

  /** Set of generic (non-predicate-specific) HL storage modules */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 1024) 
  private static SubLSymbol $predicate_generic_hl_storage_modules$ = null;

  /** Mapping between predicates and a list of their HL storage modules */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 1159) 
  private static SubLSymbol $predicate_specific_hl_storage_modules_table$ = null;

  /** Mapping between argument types and a list of HL storage modules that handle that argument type */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 1393) 
  private static SubLSymbol $argument_type_specific_hl_storage_modules_table$ = null;

  /** Declare and create a new HL storage module with name NAME and properties PLIST. */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 1582) 
  public static final SubLObject hl_storage_module(SubLObject name, SubLObject plist) {
    {
      SubLObject hl_module = setup_hl_storage_module(name, plist);
      return hl_module;
    }
  }

  /** Tests for applicability and attempts to add to the store.
   @return booleanp; whether the addition was successful */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 2273) 
  public static final SubLObject try_hl_add_modules(SubLObject hl_modules, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    checkType(hl_modules, $sym4$CONSP);
    {
      SubLObject list_var = hl_modules;
      checkType(list_var, $sym5$NON_DOTTED_LIST_P);
      {
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          checkType(elem, $sym6$HL_MODULE_P);
        }
      }
    }
    return try_hl_storage_modules_int(hl_modules, argument_spec, cnf, mt, direction, variable_map, $kw7$ADD, UNPROVIDED);
  }

  /** Tests for applicability and attempts to remove an argument from the store.
   @return booleanp; whether the removal was successful */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 7787) 
  public static final SubLObject try_hl_remove_modules(SubLObject hl_modules, SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
    checkType(hl_modules, $sym4$CONSP);
    {
      SubLObject list_var = hl_modules;
      checkType(list_var, $sym5$NON_DOTTED_LIST_P);
      {
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          checkType(elem, $sym6$HL_MODULE_P);
        }
      }
    }
    return try_hl_storage_modules_int(hl_modules, argument_spec, cnf, mt, NIL, NIL, $kw8$REMOVE, UNPROVIDED);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 8517) 
  public static final SubLObject hl_storage_modules_for_predicate_and_argument_type(SubLObject predicate, SubLObject argument_type) {
    return keyhash_utilities.fast_intersection(hl_storage_modules_for_predicate(predicate), hl_storage_modules_for_argument_type(argument_type), UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 8832) 
  public static final SubLObject hl_storage_modules_for_predicate(SubLObject predicate) {
    return conses_high.copy_list(dictionary.dictionary_lookup($predicate_specific_hl_storage_modules_table$.getGlobalValue(), predicate, UNPROVIDED));
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 9389) 
  public static final SubLObject hl_storage_modules_for_argument_type(SubLObject argument_type) {
    {
      SubLObject v_genls = arguments.argument_type_genls(argument_type);
      SubLObject hl_modules = NIL;
      SubLObject cdolist_list_var = v_genls;
      SubLObject genl = NIL;
      for (genl = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), genl = cdolist_list_var.first()) {
        hl_modules = ConsesLow.nconc(hl_modules, hl_storage_modules_for_just_argument_type(genl));
      }
      return hl_modules;
    }
  }

  /** accessor analogous to indexing, does not implement inheritance.
   Result is destructible */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 10019) 
  public static final SubLObject hl_storage_modules_for_just_argument_type(SubLObject argument_type) {
    return conses_high.copy_list(dictionary.dictionary_lookup_without_values($argument_type_specific_hl_storage_modules_table$.getGlobalValue(), argument_type, UNPROVIDED));
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 10377) 
  public static SubLSymbol $currently_executing_hl_storage_module$ = null;

  /** This assumes a partition rather than a covering; we could relax this to allow more than one of HL-MODULES to apply. */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 10850) 
  public static final SubLObject try_hl_storage_modules_int(SubLObject hl_modules, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map, SubLObject action, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject successP = NIL;
        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        {
          SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
          try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, FOUR_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            thread.resetMultipleValues();
            {
              SubLObject applicable_hl_modules = applicable_hl_storage_modules(hl_modules, argument_spec, cnf, mt, direction, variable_map);
              SubLObject dispreferred_hl_modules = thread.secondMultipleValue();
              thread.resetMultipleValues();
              {
                SubLObject sorted_applicable_hl_modules = sort_hl_storage_modules_by_cost(applicable_hl_modules, argument_spec, cnf, mt, direction, variable_map);
                if ((NIL == successP)) {
                  {
                    SubLObject csome_list_var = sorted_applicable_hl_modules;
                    SubLObject hl_module = NIL;
                    for (hl_module = csome_list_var.first(); (!(((NIL != successP)
                          || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), hl_module = csome_list_var.first()) {
                      successP = apply_hl_storage_module(hl_module, argument_spec, cnf, mt, direction, variable_map, action, v_default);
                      if ((NIL != successP)) {
                        note_successful_hl_storage_module(hl_module);
                      }
                    }
                  }
                }
                if ((NIL == successP)) {
                  {
                    SubLObject sorted_dispreferred_hl_modules = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31649");
                    SubLObject rest = NIL;
                    for (rest = sorted_dispreferred_hl_modules; (!(((NIL != successP)
                          || (NIL == rest)))); rest = rest.rest()) {
                      {
                        SubLObject cons = rest.first();
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject dispreferred_hl_module = NIL;
                        SubLObject preferred_modules = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
                        dispreferred_hl_module = current.first();
                        current = current.rest();
                        preferred_modules = current;
                        {
                          SubLObject dispreferP = NIL;
                          if ((NIL == dispreferP)) {
                            {
                              SubLObject csome_list_var = preferred_modules;
                              SubLObject preferred_module = NIL;
                              for (preferred_module = csome_list_var.first(); (!(((NIL != dispreferP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), preferred_module = csome_list_var.first()) {
                                if ((NIL != Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31644"))) {
                                  dispreferP = T;
                                }
                              }
                            }
                          }
                          if ((NIL == dispreferP)) {
                            successP = apply_hl_storage_module(dispreferred_hl_module, argument_spec, cnf, mt, direction, variable_map, action, v_default);
                            if ((NIL != successP)) {
                              note_successful_hl_storage_module(dispreferred_hl_module);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
          }
        }
        return successP;
      }
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 12729) 
  public static final SubLObject apply_hl_storage_module(SubLObject hl_module, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map, SubLObject action, SubLObject v_default) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject successP = NIL;
        {
          SubLObject _prev_bind_0 = $currently_executing_hl_storage_module$.currentBinding(thread);
          try {
            $currently_executing_hl_storage_module$.bind(hl_module, thread);
            {
              SubLObject pcase_var = action;
              if (pcase_var.eql($kw7$ADD)) {
                successP = hl_storage_module_add(hl_module, argument_spec, cnf, mt, direction, variable_map, v_default);
              } else if (pcase_var.eql($kw8$REMOVE)) {
                successP = hl_storage_module_remove(hl_module, argument_spec, cnf, mt, v_default);
              } else if (pcase_var.eql($kw9$REMOVE_ALL)) {
                successP = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31641");
              }
            }
          } finally {
            $currently_executing_hl_storage_module$.rebind(_prev_bind_0, thread);
          }
        }
        return successP;
      }
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 13371) 
  public static final SubLObject hl_storage_module_applicableP(SubLObject hl_module, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    {
      SubLObject applicable_func = hl_storage_module_applicability_func(hl_module);
      if ((NIL != Symbols.fboundp(applicable_func))) {
        return Functions.funcall(applicable_func, argument_spec, cnf, mt, direction, variable_map);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31637");
      }
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 13764) 
  public static final SubLObject applicable_hl_storage_modules(SubLObject hl_modules, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject supplanted_hl_modules = NIL;
        SubLObject dispreferred_hl_modules = NIL;
        SubLObject applicable_hl_modules = NIL;
        SubLObject exclusive_foundP = NIL;
        if ((NIL == exclusive_foundP)) {
          {
            SubLObject csome_list_var = hl_modules;
            SubLObject hl_module = NIL;
            for (hl_module = csome_list_var.first(); (!(((NIL != exclusive_foundP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), hl_module = csome_list_var.first()) {
              if ((NIL == subl_promotions.memberP(hl_module, supplanted_hl_modules, UNPROVIDED, UNPROVIDED))) {
                if (((NIL != list_utilities.alist_lookup_without_values(dispreferred_hl_modules, hl_module, UNPROVIDED, UNPROVIDED))
                    || (NIL != hl_storage_module_applicableP(hl_module, argument_spec, cnf, mt, direction, variable_map)))) {
                  {
                    SubLObject exclusive_func = hl_storage_module_exclusive_func(hl_module);
                    if (((NIL == exclusive_func)
                        || (exclusive_func.isFunctionSpec()
                           && (NIL != Functions.funcall(exclusive_func, argument_spec, cnf, mt, direction, variable_map))))) {
                      if ((NIL != exclusive_func)) {
                        thread.resetMultipleValues();
                        {
                          SubLObject exclusive_foundP_1 = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31652");
                          SubLObject applicable_hl_modules_2 = thread.secondMultipleValue();
                          SubLObject supplanted_hl_modules_3 = thread.thirdMultipleValue();
                          thread.resetMultipleValues();
                          exclusive_foundP = exclusive_foundP_1;
                          applicable_hl_modules = applicable_hl_modules_2;
                          supplanted_hl_modules = supplanted_hl_modules_3;
                        }
                      }
                      if ((NIL == exclusive_foundP)) {
                        thread.resetMultipleValues();
                        {
                          SubLObject applicable_hl_modules_4 = update_dispreferred_hl_storage_modules_wrt_applicable_modules(hl_module, applicable_hl_modules, dispreferred_hl_modules, hl_modules, argument_spec, cnf, mt, direction, variable_map);
                          SubLObject dispreferred_hl_modules_5 = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          applicable_hl_modules = applicable_hl_modules_4;
                          dispreferred_hl_modules = dispreferred_hl_modules_5;
                        }
                      }
                      if (((NIL != exclusive_foundP)
                          || (NIL == list_utilities.alist_lookup(dispreferred_hl_modules, hl_module, UNPROVIDED, UNPROVIDED)))) {
                        applicable_hl_modules = cons(hl_module, applicable_hl_modules);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return Values.values(Sequences.nreverse(applicable_hl_modules), ((NIL != exclusive_foundP) ? ((SubLObject) NIL) : dispreferred_hl_modules));
      }
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 15486) 
  public static final SubLObject update_dispreferred_hl_storage_modules_wrt_applicable_modules(SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject dispreferred_hl_modules, SubLObject hl_modules, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    {
      SubLObject preferred_over_info = hl_storage_module_preferred_over_info(hl_module);
      SubLObject pcase_var = preferred_over_info;
      SubLObject newly_dispreferred_module_names = preferred_over_info;
      SubLObject cdolist_list_var = newly_dispreferred_module_names;
      SubLObject dispreferred_module_name = NIL;
      for (dispreferred_module_name = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), dispreferred_module_name = cdolist_list_var.first()) {
        {
          SubLObject dispreferred_hl_module = inference_modules.find_hl_module_by_name(dispreferred_module_name);
          if ((NIL != subl_promotions.memberP(dispreferred_hl_module, hl_modules, UNPROVIDED, UNPROVIDED))) {
            if ((NIL != subl_promotions.memberP(dispreferred_hl_module, applicable_hl_modules, UNPROVIDED, UNPROVIDED))) {
              applicable_hl_modules = Sequences.delete(dispreferred_hl_module, applicable_hl_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              dispreferred_hl_modules = list_utilities.alist_push(dispreferred_hl_modules, dispreferred_hl_module, hl_module, UNPROVIDED);
            } else if ((NIL != list_utilities.alist_lookup(dispreferred_hl_modules, dispreferred_hl_module, UNPROVIDED, UNPROVIDED))) {
              dispreferred_hl_modules = list_utilities.alist_push(dispreferred_hl_modules, dispreferred_hl_module, hl_module, UNPROVIDED);
            } else {
              if ((NIL != hl_storage_module_applicableP(dispreferred_hl_module, argument_spec, cnf, mt, direction, variable_map))) {
                dispreferred_hl_modules = list_utilities.alist_push(dispreferred_hl_modules, dispreferred_hl_module, hl_module, UNPROVIDED);
              }
            }
          }
        }
      }
      return Values.values(applicable_hl_modules, dispreferred_hl_modules);
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 18274) 
  public static final SubLObject sort_hl_storage_modules_by_cost(SubLObject hl_modules, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    return hl_modules;
  }

  /** If HL-MODULE has an :add property, the specified function is applied to ARGUMENT-SPEC,
   CNF, MT, DIRECTION, and VARIABLE-MAP.  Otherwise, DEFAULT is returned. */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 19734) 
  public static final SubLObject hl_storage_module_add(SubLObject hl_module, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject add_func = get_hl_storage_module_property(hl_module, $kw7$ADD);
      return ((NIL != add_func) ? ((SubLObject) Functions.funcall(add_func, argument_spec, cnf, mt, direction, variable_map)) : v_default);
    }
  }

  /** If HL-MODULE has a :remove property, the specified function is applied to ARGUMENT-SPEC,
   CNF, and MT.  Otherwise, DEFAULT is returned. */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 20192) 
  public static final SubLObject hl_storage_module_remove(SubLObject hl_module, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject remove_func = get_hl_storage_module_property(hl_module, $kw8$REMOVE);
      return ((NIL != remove_func) ? ((SubLObject) Functions.funcall(remove_func, argument_spec, cnf, mt)) : v_default);
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 20979) 
  public static final SubLObject hl_storage_module_argument_type(SubLObject hl_module) {
    return get_hl_storage_module_property(hl_module, $kw17$ARGUMENT_TYPE);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 21460) 
  public static final SubLObject hl_storage_module_predicate(SubLObject hl_module) {
    return get_hl_storage_module_property(hl_module, $kw21$PREDICATE);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 21708) 
  public static final SubLObject hl_storage_module_applicability_func(SubLObject hl_module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject applicability_func = get_hl_storage_module_property(hl_module, $kw23$APPLICABILITY);
        SubLObject defaultP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != defaultP)) {
          return NIL;
        } else {
          return applicability_func;
        }
      }
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 22286) 
  public static final SubLObject hl_storage_module_exclusive_func(SubLObject hl_module) {
    return get_hl_storage_module_property(hl_module, $kw25$EXCLUSIVE);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 22536) 
  public static final SubLObject hl_storage_module_preferred_over_info(SubLObject hl_module) {
    return get_hl_storage_module_property(hl_module, $kw27$PREFERRED_OVER);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 22670) 
  public static final SubLObject get_hl_storage_module_property(SubLObject hl_module, SubLObject indicator) {
    return inference_modules.hl_module_property(hl_module, indicator);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 22790) 
  public static final SubLObject reclassify_hl_storage_modules() {
    clear_hl_storage_module_indexes();
    rebuild_solely_specific_hl_storage_module_predicate_store();
    {
      SubLObject set_contents_var = set.do_set_internal($hl_storage_modules$.getGlobalValue());
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject hl_module = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, hl_module))) {
            {
              SubLObject predicate = hl_storage_module_predicate(hl_module);
              SubLObject argument_type = hl_storage_module_argument_type(hl_module);
              classify_hl_storage_module(hl_module, predicate, argument_type);
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 23338) 
  private static SubLSymbol $hl_storage_module_properties$ = null;

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 24689) 
  public static final SubLObject clear_hl_storage_module_indexes() {
    $predicate_generic_hl_storage_modules$.setGlobalValue(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
    dictionary.clear_dictionary($predicate_specific_hl_storage_modules_table$.getGlobalValue());
    return NIL;
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 24885) 
  public static final SubLObject setup_hl_storage_module(SubLObject name, SubLObject plist) {
    checkType(name, $sym29$KEYWORDP);
    {
      SubLObject plist_var = plist;
      checkType(plist_var, $sym30$PROPERTY_LIST_P);
      {
        SubLObject remainder = NIL;
        for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
          {
            SubLObject property = remainder.first();
            SubLObject value = conses_high.cadr(remainder);
            checkType(property, $sym31$HL_STORAGE_MODULE_PROPERTY_P);
          }
        }
      }
    }
    {
      SubLObject datum = plist;
      SubLObject current = datum;
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_6 = NIL;
      for (; (NIL != rest); ) {
        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list32);
        current_6 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list32);
        if ((NIL == conses_high.member(current_6, $list28, UNPROVIDED, UNPROVIDED))) {
          bad = T;
        }
        if ((current_6 == $kw33$ALLOW_OTHER_KEYS)) {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if (((NIL != bad)
           && (NIL == allow_other_keys_p))) {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list32);
      }
      {
        SubLObject pretty_name_tail = cdestructuring_bind.property_list_member($kw34$PRETTY_NAME, current);
        SubLObject pretty_name = ((NIL != pretty_name_tail) ? ((SubLObject) conses_high.cadr(pretty_name_tail)) : NIL);
        SubLObject module_subtype_tail = cdestructuring_bind.property_list_member($kw35$MODULE_SUBTYPE, current);
        SubLObject module_subtype = ((NIL != module_subtype_tail) ? ((SubLObject) conses_high.cadr(module_subtype_tail)) : NIL);
        SubLObject module_source_tail = cdestructuring_bind.property_list_member($kw36$MODULE_SOURCE, current);
        SubLObject module_source = ((NIL != module_source_tail) ? ((SubLObject) conses_high.cadr(module_source_tail)) : NIL);
        SubLObject argument_type_tail = cdestructuring_bind.property_list_member($kw17$ARGUMENT_TYPE, current);
        SubLObject argument_type = ((NIL != argument_type_tail) ? ((SubLObject) conses_high.cadr(argument_type_tail)) : NIL);
        SubLObject sense_tail = cdestructuring_bind.property_list_member($kw18$SENSE, current);
        SubLObject sense = ((NIL != sense_tail) ? ((SubLObject) conses_high.cadr(sense_tail)) : NIL);
        SubLObject direction_tail = cdestructuring_bind.property_list_member($kw19$DIRECTION, current);
        SubLObject direction = ((NIL != direction_tail) ? ((SubLObject) conses_high.cadr(direction_tail)) : NIL);
        SubLObject required_mt_tail = cdestructuring_bind.property_list_member($kw20$REQUIRED_MT, current);
        SubLObject required_mt = ((NIL != required_mt_tail) ? ((SubLObject) conses_high.cadr(required_mt_tail)) : NIL);
        SubLObject predicate_tail = cdestructuring_bind.property_list_member($kw21$PREDICATE, current);
        SubLObject predicate = ((NIL != predicate_tail) ? ((SubLObject) conses_high.cadr(predicate_tail)) : NIL);
        SubLObject any_predicates_tail = cdestructuring_bind.property_list_member($kw22$ANY_PREDICATES, current);
        SubLObject any_predicates = ((NIL != any_predicates_tail) ? ((SubLObject) conses_high.cadr(any_predicates_tail)) : NIL);
        SubLObject applicability_pattern_tail = cdestructuring_bind.property_list_member($kw24$APPLICABILITY_PATTERN, current);
        SubLObject applicability_pattern = ((NIL != applicability_pattern_tail) ? ((SubLObject) conses_high.cadr(applicability_pattern_tail)) : NIL);
        SubLObject applicability_tail = cdestructuring_bind.property_list_member($kw23$APPLICABILITY, current);
        SubLObject applicability = ((NIL != applicability_tail) ? ((SubLObject) conses_high.cadr(applicability_tail)) : NIL);
        SubLObject supplants_tail = cdestructuring_bind.property_list_member($kw26$SUPPLANTS, current);
        SubLObject supplants = ((NIL != supplants_tail) ? ((SubLObject) conses_high.cadr(supplants_tail)) : NIL);
        SubLObject exclusive_tail = cdestructuring_bind.property_list_member($kw25$EXCLUSIVE, current);
        SubLObject exclusive = ((NIL != exclusive_tail) ? ((SubLObject) conses_high.cadr(exclusive_tail)) : NIL);
        SubLObject preferred_over_tail = cdestructuring_bind.property_list_member($kw27$PREFERRED_OVER, current);
        SubLObject preferred_over = ((NIL != preferred_over_tail) ? ((SubLObject) conses_high.cadr(preferred_over_tail)) : NIL);
        SubLObject incompleteness_tail = cdestructuring_bind.property_list_member($kw16$INCOMPLETENESS, current);
        SubLObject incompleteness = ((NIL != incompleteness_tail) ? ((SubLObject) conses_high.cadr(incompleteness_tail)) : NIL);
        SubLObject add_tail = cdestructuring_bind.property_list_member($kw7$ADD, current);
        SubLObject add = ((NIL != add_tail) ? ((SubLObject) conses_high.cadr(add_tail)) : NIL);
        SubLObject remove_tail = cdestructuring_bind.property_list_member($kw8$REMOVE, current);
        SubLObject remove = ((NIL != remove_tail) ? ((SubLObject) conses_high.cadr(remove_tail)) : NIL);
        SubLObject remove_all_tail = cdestructuring_bind.property_list_member($kw9$REMOVE_ALL, current);
        SubLObject remove_all = ((NIL != remove_all_tail) ? ((SubLObject) conses_high.cadr(remove_all_tail)) : NIL);
        SubLObject documentation_tail = cdestructuring_bind.property_list_member($kw37$DOCUMENTATION, current);
        SubLObject documentation = ((NIL != documentation_tail) ? ((SubLObject) conses_high.cadr(documentation_tail)) : NIL);
        checkType(pretty_name, $sym38$STRINGP);
        checkType(argument_type, $sym39$ARGUMENT_TYPE_P);
        checkType(incompleteness, $sym40$SYMBOLP);
        checkType(add, $sym40$SYMBOLP);
        checkType(remove, $sym40$SYMBOLP);
        checkType(remove_all, $sym40$SYMBOLP);
        if ((NIL != applicability)) {
          checkType(applicability, $sym40$SYMBOLP);
        } else {
          checkType(required_mt, $sym41$HLMT_P);
          checkType(applicability_pattern, $sym42$HL_STORAGE_MODULE_APPLICABILITY_PATTERN_P);
          if ((NIL != sense)) {
            checkType(sense, $sym43$SENSE_P);
          }
          if ((NIL != direction)) {
            checkType(direction, $sym44$DIRECTION_P);
          }
        }
        if ((NIL != module_subtype)) {
          checkType(module_subtype, $sym29$KEYWORDP);
        }
        if ((NIL != module_source)) {
          checkType(module_source, $sym45$FORT_P);
        }
        if ((NIL != supplants)) {
          {
            SubLObject list_var = supplants;
            checkType(list_var, $sym5$NON_DOTTED_LIST_P);
            {
              SubLObject cdolist_list_var = list_var;
              SubLObject elem = NIL;
              for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
                checkType(elem, $sym29$KEYWORDP);
              }
            }
          }
        }
        if ((NIL != exclusive)) {
          checkType(exclusive, $sym40$SYMBOLP);
        }
        if ((NIL != preferred_over)) {
          {
            SubLObject list_var = preferred_over;
            checkType(list_var, $sym5$NON_DOTTED_LIST_P);
            {
              SubLObject cdolist_list_var = list_var;
              SubLObject elem = NIL;
              for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
                checkType(elem, $sym29$KEYWORDP);
              }
            }
          }
        }
        if ((NIL != predicate)) {
          checkType(predicate, $sym46$CONSTANT_P);
        }
        if ((NIL != any_predicates)) {
          {
            SubLObject list_var = any_predicates;
            checkType(list_var, $sym5$NON_DOTTED_LIST_P);
            {
              SubLObject cdolist_list_var = list_var;
              SubLObject elem = NIL;
              for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
                checkType(elem, $sym45$FORT_P);
              }
            }
          }
        }
        if ((NIL != documentation)) {
          checkType(documentation, $sym38$STRINGP);
        }
        return register_hl_storage_module(name, plist);
      }
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 26692) 
  public static final SubLObject register_hl_storage_module(SubLObject name, SubLObject plist) {
    {
      SubLObject hl_module = inference_modules.setup_module(name, $kw48$STORAGE, plist);
      set.set_add(hl_module, $hl_storage_modules$.getGlobalValue());
      {
        SubLObject predicate = conses_high.getf(plist, $kw21$PREDICATE, UNPROVIDED);
        SubLObject argument_type = conses_high.getf(plist, $kw17$ARGUMENT_TYPE, UNPROVIDED);
        classify_hl_storage_module(hl_module, predicate, argument_type);
      }
      return hl_module;
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 27041) 
  public static final SubLObject classify_hl_storage_module(SubLObject hl_module, SubLObject predicate, SubLObject argument_type) {
    if ((NIL != predicate)) {
      register_predicate_specific_hl_storage_module(hl_module, predicate);
    } else {
      register_predicate_generic_hl_storage_module(hl_module);
    }
    register_argument_type_specific_hl_storage_module(hl_module, argument_type);
    return NIL;
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 27369) 
  public static final SubLObject register_predicate_specific_hl_storage_module(SubLObject hl_module, SubLObject predicate) {
    return dictionary_utilities.dictionary_pushnew($predicate_specific_hl_storage_modules_table$.getGlobalValue(), predicate, hl_module, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 27552) 
  public static final SubLObject register_predicate_generic_hl_storage_module(SubLObject hl_module) {
    set.set_add(hl_module, $predicate_generic_hl_storage_modules$.getGlobalValue());
    return hl_module;
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 27706) 
  public static final SubLObject register_argument_type_specific_hl_storage_module(SubLObject hl_module, SubLObject argument_type) {
    return dictionary_utilities.dictionary_pushnew($argument_type_specific_hl_storage_modules_table$.getGlobalValue(), argument_type, hl_module, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 30774) 
  private static SubLSymbol $solely_specific_hl_storage_module_predicate_store$ = null;

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 31073) 
  public static final SubLObject rebuild_solely_specific_hl_storage_module_predicate_store() {
    return set.set_rebuild($solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
  }

  /** If you want the specific hl-storage modules for PREDICATE to supplant ALL
   generic hl-storage modules, then register this property. */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 31226) 
  public static final SubLObject register_solely_specific_hl_storage_module_predicate(SubLObject predicate) {
    return set.set_add(predicate, $solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 31699) 
  public static final SubLObject solely_specific_hl_storage_module_predicateP(SubLObject predicate) {
    return set.set_memberP(predicate, $solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 32462) 
  public static final SubLObject new_hl_assertion_spec(SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((variable_map == UNPROVIDED)) {
      variable_map = NIL;
    }
    return list(cnf, mt, direction, variable_map);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 33537) 
  public static final SubLObject hl_assertion_spec_cnf(SubLObject hl_assertion_spec) {
    return hl_assertion_spec.first();
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 33630) 
  public static final SubLObject hl_assertion_spec_mt(SubLObject hl_assertion_spec) {
    return conses_high.second(hl_assertion_spec);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 33723) 
  public static final SubLObject hl_assertion_spec_direction(SubLObject hl_assertion_spec) {
    return conses_high.third(hl_assertion_spec);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 33822) 
  public static final SubLObject hl_assertion_spec_variable_map(SubLObject hl_assertion_spec) {
    return conses_high.fourth(hl_assertion_spec);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 34196) 
  public static final SubLObject new_hl_assertible(SubLObject hl_assertion_spec, SubLObject argument_spec) {
    return list(hl_assertion_spec, argument_spec);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 35240) 
  public static final SubLObject hl_assertible_hl_assertion_spec(SubLObject hl_assertible) {
    return hl_assertible.first();
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 35335) 
  public static final SubLObject hl_assertible_argument_spec(SubLObject hl_assertible) {
    return conses_high.second(hl_assertible);
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 35715) 
  public static final SubLObject hl_add_assertible(SubLObject hl_assertible) {
    checkType(hl_assertible, $sym82$HL_ASSERTIBLE_P);
    {
      SubLObject hl_assertible_var = hl_assertible;
      SubLObject argument_spec = hl_assertible_argument_spec(hl_assertible_var);
      SubLObject hl_assertion_spec_var = hl_assertible_hl_assertion_spec(hl_assertible_var);
      SubLObject hl_assertion_spec_var_7 = hl_assertion_spec_var;
      SubLObject cnf = hl_assertion_spec_cnf(hl_assertion_spec_var_7);
      SubLObject mt = hl_assertion_spec_mt(hl_assertion_spec_var_7);
      SubLObject direction = hl_assertion_spec_direction(hl_assertion_spec_var_7);
      SubLObject variable_map = hl_assertion_spec_variable_map(hl_assertion_spec_var_7);
      return hl_add_argument(argument_spec, cnf, mt, direction, variable_map);
    }
  }

  /** @return NIL if the argument specified by ARGUMENT-SPEC was /not/ added as an argument for CNF,
   and non-NIL otherwise. */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 36197) 
  public static final SubLObject hl_add_argument(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((variable_map == UNPROVIDED)) {
      variable_map = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(argument_spec, $sym83$ARGUMENT_SPEC_P);
      checkType(cnf, $sym84$CNF_P);
      checkType(mt, $sym41$HLMT_P);
      checkType(direction, $sym44$DIRECTION_P);
      checkType(variable_map, $sym85$LISTP);
      janus.janus_note_argument(argument_spec, cnf, mt, direction, variable_map);
      if ((NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32159");
      }
      if ((NIL != hlmt.hlmts_supportedP())) {
        mt = hlmt_czer.canonicalize_hlmt(mt);
      }
      return hl_store_perform_action_int($kw7$ADD, argument_spec, cnf, mt, direction, variable_map);
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 37728) 
  public static final SubLObject hl_remove_argument(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(argument_spec, $sym83$ARGUMENT_SPEC_P);
      checkType(cnf, $sym84$CNF_P);
      checkType(mt, $sym41$HLMT_P);
      if ((NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32160");
      }
      return hl_store_perform_action_int($kw8$REMOVE, argument_spec, cnf, mt, NIL, NIL);
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 39015) 
  private static SubLSymbol $successful_hl_storage_modules$ = null;

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 39591) 
  public static final SubLObject note_successful_hl_storage_module(SubLObject hl_module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      set.set_add(hl_module, $successful_hl_storage_modules$.getDynamicValue(thread));
      return $successful_hl_storage_modules$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 39873) 
  public static final SubLObject hl_store_perform_action_int(SubLObject action, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject successP = NIL;
        SubLObject solely_specificP = NIL;
        SubLObject argument_type = ((NIL != argument_spec) ? ((SubLObject) arguments.argument_spec_type(argument_spec)) : NIL);
        {
          SubLObject _prev_bind_0 = $successful_hl_storage_modules$.currentBinding(thread);
          try {
            $successful_hl_storage_modules$.bind(set.new_set(UNPROVIDED, UNPROVIDED), thread);
            if ((NIL != clauses.atomic_clause_p(cnf))) {
              {
                SubLObject predicate = clause_utilities.atomic_cnf_predicate(cnf);
                SubLObject predicate_specific_modules = ((NIL != argument_type) ? ((SubLObject) hl_storage_modules_for_predicate_and_argument_type(predicate, argument_type)) : hl_storage_modules_for_predicate(predicate));
                solely_specificP = solely_specific_hl_storage_module_predicateP(predicate);
                if ((NIL != predicate_specific_modules)) {
                  successP = hl_perform_action_with_storage_modules_int(action, predicate_specific_modules, argument_spec, cnf, mt, direction, variable_map);
                }
              }
            }
            if ((NIL == successP)) {
              if ((NIL == solely_specificP)) {
                {
                  SubLObject predicate_generic_modules = ((NIL != argument_type) ? ((SubLObject) hl_storage_modules_for_argument_type(argument_type)) : Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31629"));
                  if ((NIL != predicate_generic_modules)) {
                    successP = hl_perform_action_with_storage_modules_int(action, predicate_generic_modules, argument_spec, cnf, mt, direction, variable_map);
                  }
                }
              }
            }
          } finally {
            $successful_hl_storage_modules$.rebind(_prev_bind_0, thread);
          }
        }
        return successP;
      }
    }
  }

  /** Whether the HL storage modules should robustly try to remove a decontextualized assertible from
the mt given by the user in addition to removing it from its proper, decontextualized mt.
This can happen for example when a predicate is asserted to be decontextualized _after_
some assertions have already been made with it in other mts. */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 41531) 
  private static SubLSymbol $robustly_remove_uncanonical_decontextualized_assertiblesP$ = null;

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 41956) 
  public static final SubLObject hl_perform_action_with_storage_modules_int(SubLObject action, SubLObject hl_modules, SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    {
      SubLObject actual_mt = kb_accessors.possibly_convention_mt_for_decontextualized_cnf(mt, cnf);
      SubLObject pcase_var = action;
      if (pcase_var.eql($kw7$ADD)) {
        {
          SubLObject successP = try_hl_add_modules(hl_modules, argument_spec, cnf, actual_mt, direction, variable_map);
          return successP;
        }
      } else if (pcase_var.eql($kw8$REMOVE)) {
        {
          SubLObject successP = try_hl_remove_modules(hl_modules, argument_spec, cnf, actual_mt);
          if (((NIL != $robustly_remove_uncanonical_decontextualized_assertiblesP$.getGlobalValue())
               && (NIL == hlmt.hlmt_equal(mt, actual_mt)))) {
            {
              SubLObject robust_successP = try_hl_remove_modules(hl_modules, argument_spec, cnf, mt);
              successP = makeBoolean(((NIL != successP)
                    || (NIL != robust_successP)));
            }
          }
          return successP;
        }
      } else if (pcase_var.eql($kw9$REMOVE_ALL)) {
        {
          SubLObject successP = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31650");
          if (((NIL != $robustly_remove_uncanonical_decontextualized_assertiblesP$.getGlobalValue())
               && (NIL == hlmt.hlmt_equal(mt, actual_mt)))) {
            {
              SubLObject robust_successP = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31651");
              successP = makeBoolean(((NIL != successP)
                    || (NIL != robust_successP)));
            }
          }
          return successP;
        }
      } else {
        Errors.error($str90$Unexpected_HL_storage_action__a, action);
        return NIL;
      }
    }
  }

  /** @return NIL if CNF was not stored at the HL in some fashion,
   and non-NIL otherwise.  If CNF is stored as an as assertion object,
   that assertion object (assertion-p) will be returned, but there is no
   guarantee that CNF will be stored as an assertion. */
  @SubL(source = "cycl/hl-storage-modules.lisp", position = 43268) 
  public static final SubLObject hl_assert(SubLObject cnf, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject variable_map) {
    if ((variable_map == UNPROVIDED)) {
      variable_map = NIL;
    }
    {
      SubLObject argument_spec = arguments.create_asserted_argument_spec(strength);
      return hl_add_argument(argument_spec, cnf, mt, direction, variable_map);
    }
  }

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 43789) 
  private static SubLSymbol $dummy_asserted_argument_spec$ = null;

  @SubL(source = "cycl/hl-storage-modules.lisp", position = 43932) 
  public static final SubLObject hl_unassert(SubLObject cnf, SubLObject mt) {
    {
      SubLObject argument_spec = $dummy_asserted_argument_spec$.getGlobalValue();
      return hl_remove_argument(argument_spec, cnf, mt);
    }
  }

  public static final SubLObject declare_hl_storage_modules_file() {
    declareFunction(myName, "hl_storage_module", "HL-STORAGE-MODULE", 2, 0, false);
    declareFunction(myName, "undeclare_hl_storage_module", "UNDECLARE-HL-STORAGE-MODULE", 1, 0, false);
    declareFunction(myName, "try_hl_add_modules", "TRY-HL-ADD-MODULES", 6, 0, false);
    declareFunction(myName, "try_hl_remove_modules", "TRY-HL-REMOVE-MODULES", 4, 0, false);
    declareFunction(myName, "try_hl_remove_all_modules", "TRY-HL-REMOVE-ALL-MODULES", 3, 0, false);
    declareFunction(myName, "hl_storage_modules_for_predicate_and_argument_type", "HL-STORAGE-MODULES-FOR-PREDICATE-AND-ARGUMENT-TYPE", 2, 0, false);
    declareFunction(myName, "hl_storage_modules_for_predicate", "HL-STORAGE-MODULES-FOR-PREDICATE", 1, 0, false);
    declareFunction(myName, "predicate_has_specific_hl_storage_modulesP", "PREDICATE-HAS-SPECIFIC-HL-STORAGE-MODULES?", 1, 0, false);
    declareFunction(myName, "predicates_with_specific_hl_storage_modules", "PREDICATES-WITH-SPECIFIC-HL-STORAGE-MODULES", 0, 0, false);
    declareFunction(myName, "predicate_generic_hl_storage_modules", "PREDICATE-GENERIC-HL-STORAGE-MODULES", 0, 0, false);
    declareFunction(myName, "hl_storage_modules_for_argument_type", "HL-STORAGE-MODULES-FOR-ARGUMENT-TYPE", 1, 0, false);
    declareFunction(myName, "generic_hl_storage_modules", "GENERIC-HL-STORAGE-MODULES", 0, 0, false);
    declareFunction(myName, "generic_hl_storage_module_count", "GENERIC-HL-STORAGE-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "hl_storage_modules_for_just_argument_type", "HL-STORAGE-MODULES-FOR-JUST-ARGUMENT-TYPE", 1, 0, false);
    declareFunction(myName, "currently_executing_hl_storage_module", "CURRENTLY-EXECUTING-HL-STORAGE-MODULE", 0, 0, false);
    declareMacro(myName, "within_hl_storage_module_execution", "WITHIN-HL-STORAGE-MODULE-EXECUTION");
    declareFunction(myName, "try_hl_storage_modules_int", "TRY-HL-STORAGE-MODULES-INT", 7, 1, false);
    declareFunction(myName, "apply_hl_storage_module", "APPLY-HL-STORAGE-MODULE", 8, 0, false);
    declareFunction(myName, "hl_storage_module_name", "HL-STORAGE-MODULE-NAME", 1, 0, false);
    declareFunction(myName, "hl_storage_module_applicableP", "HL-STORAGE-MODULE-APPLICABLE?", 6, 0, false);
    declareFunction(myName, "applicable_hl_storage_modules", "APPLICABLE-HL-STORAGE-MODULES", 6, 0, false);
    declareFunction(myName, "update_dispreferred_hl_storage_modules_wrt_applicable_modules", "UPDATE-DISPREFERRED-HL-STORAGE-MODULES-WRT-APPLICABLE-MODULES", 9, 0, false);
    declareFunction(myName, "update_supplanted_hl_storage_modules_wrt_applicable_modules", "UPDATE-SUPPLANTED-HL-STORAGE-MODULES-WRT-APPLICABLE-MODULES", 3, 0, false);
    declareFunction(myName, "sort_hl_storage_modules_by_cost", "SORT-HL-STORAGE-MODULES-BY-COST", 6, 0, false);
    declareFunction(myName, "sort_dispreferred_hl_storage_modules_by_cost", "SORT-DISPREFERRED-HL-STORAGE-MODULES-BY-COST", 6, 0, false);
    declareFunction(myName, "hl_storage_module_incompleteness", "HL-STORAGE-MODULE-INCOMPLETENESS", 6, 1, false);
    declareFunction(myName, "hl_storage_module_add", "HL-STORAGE-MODULE-ADD", 6, 1, false);
    declareFunction(myName, "hl_storage_module_remove", "HL-STORAGE-MODULE-REMOVE", 4, 1, false);
    declareFunction(myName, "hl_storage_module_remove_all", "HL-STORAGE-MODULE-REMOVE-ALL", 3, 1, false);
    declareFunction(myName, "hl_storage_module_argument_type", "HL-STORAGE-MODULE-ARGUMENT-TYPE", 1, 0, false);
    declareFunction(myName, "hl_storage_module_sense", "HL-STORAGE-MODULE-SENSE", 1, 0, false);
    declareFunction(myName, "hl_storage_module_direction", "HL-STORAGE-MODULE-DIRECTION", 1, 0, false);
    declareFunction(myName, "hl_storage_module_required_mt", "HL-STORAGE-MODULE-REQUIRED-MT", 1, 0, false);
    declareFunction(myName, "hl_storage_module_predicate", "HL-STORAGE-MODULE-PREDICATE", 1, 0, false);
    declareFunction(myName, "hl_storage_module_any_predicates", "HL-STORAGE-MODULE-ANY-PREDICATES", 1, 0, false);
    declareFunction(myName, "hl_storage_module_applicability_func", "HL-STORAGE-MODULE-APPLICABILITY-FUNC", 1, 0, false);
    declareFunction(myName, "hl_storage_module_applicability_pattern", "HL-STORAGE-MODULE-APPLICABILITY-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_storage_module_exclusive_func", "HL-STORAGE-MODULE-EXCLUSIVE-FUNC", 1, 0, false);
    declareFunction(myName, "hl_storage_module_supplants_info", "HL-STORAGE-MODULE-SUPPLANTS-INFO", 1, 0, false);
    declareFunction(myName, "hl_storage_module_preferred_over_info", "HL-STORAGE-MODULE-PREFERRED-OVER-INFO", 1, 0, false);
    declareFunction(myName, "get_hl_storage_module_property", "GET-HL-STORAGE-MODULE-PROPERTY", 2, 0, false);
    declareFunction(myName, "reclassify_hl_storage_modules", "RECLASSIFY-HL-STORAGE-MODULES", 0, 0, false);
    declareFunction(myName, "hl_storage_module_properties", "HL-STORAGE-MODULE-PROPERTIES", 0, 0, false);
    declareFunction(myName, "hl_storage_module_property_p", "HL-STORAGE-MODULE-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "remove_hl_storage_module", "REMOVE-HL-STORAGE-MODULE", 1, 0, false);
    declareFunction(myName, "remove_hl_storage_module_from_generic_hl_module_cache", "REMOVE-HL-STORAGE-MODULE-FROM-GENERIC-HL-MODULE-CACHE", 1, 0, false);
    declareFunction(myName, "remove_hl_storage_module_from_predicate_specific_hl_module_cache", "REMOVE-HL-STORAGE-MODULE-FROM-PREDICATE-SPECIFIC-HL-MODULE-CACHE", 2, 0, false);
    declareFunction(myName, "clear_hl_storage_module_indexes", "CLEAR-HL-STORAGE-MODULE-INDEXES", 0, 0, false);
    declareFunction(myName, "setup_hl_storage_module", "SETUP-HL-STORAGE-MODULE", 2, 0, false);
    declareFunction(myName, "hl_storage_module_applicability_pattern_p", "HL-STORAGE-MODULE-APPLICABILITY-PATTERN-P", 1, 0, false);
    declareFunction(myName, "register_hl_storage_module", "REGISTER-HL-STORAGE-MODULE", 2, 0, false);
    declareFunction(myName, "classify_hl_storage_module", "CLASSIFY-HL-STORAGE-MODULE", 3, 0, false);
    declareFunction(myName, "register_predicate_specific_hl_storage_module", "REGISTER-PREDICATE-SPECIFIC-HL-STORAGE-MODULE", 2, 0, false);
    declareFunction(myName, "register_predicate_generic_hl_storage_module", "REGISTER-PREDICATE-GENERIC-HL-STORAGE-MODULE", 1, 0, false);
    declareFunction(myName, "register_argument_type_specific_hl_storage_module", "REGISTER-ARGUMENT-TYPE-SPECIFIC-HL-STORAGE-MODULE", 2, 0, false);
    declareFunction(myName, "hl_storage_modules", "HL-STORAGE-MODULES", 0, 0, false);
    declareFunction(myName, "hl_storage_module_count", "HL-STORAGE-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "hl_storage_module_applicable_intP", "HL-STORAGE-MODULE-APPLICABLE-INT?", 6, 0, false);
    declareFunction(myName, "hl_storage_module_sense_relevant_p", "HL-STORAGE-MODULE-SENSE-RELEVANT-P", 2, 0, false);
    declareFunction(myName, "hl_storage_module_direction_relevant_p", "HL-STORAGE-MODULE-DIRECTION-RELEVANT-P", 2, 0, false);
    declareFunction(myName, "hl_storage_module_argument_type_relevant_p", "HL-STORAGE-MODULE-ARGUMENT-TYPE-RELEVANT-P", 2, 0, false);
    declareFunction(myName, "hl_storage_module_predicate_relevant_p", "HL-STORAGE-MODULE-PREDICATE-RELEVANT-P", 2, 0, false);
    declareFunction(myName, "hl_storage_module_required_mt_relevant_p", "HL-STORAGE-MODULE-REQUIRED-MT-RELEVANT-P", 2, 0, false);
    declareFunction(myName, "hl_storage_module_applicability_pattern_matched_p", "HL-STORAGE-MODULE-APPLICABILITY-PATTERN-MATCHED-P", 2, 0, false);
    declareFunction(myName, "clear_solely_specific_hl_storage_module_predicate_store", "CLEAR-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE", 0, 0, false);
    declareFunction(myName, "rebuild_solely_specific_hl_storage_module_predicate_store", "REBUILD-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE", 0, 0, false);
    declareFunction(myName, "register_solely_specific_hl_storage_module_predicate", "REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE", 1, 0, false);
    declareFunction(myName, "deregister_solely_specific_hl_storage_module_predicate", "DEREGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE", 1, 0, false);
    declareFunction(myName, "solely_specific_hl_storage_module_predicateP", "SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE?", 1, 0, false);
    declareFunction(myName, "hl_assertion_spec_p", "HL-ASSERTION-SPEC-P", 1, 0, false);
    declareFunction(myName, "new_hl_assertion_spec", "NEW-HL-ASSERTION-SPEC", 2, 2, false);
    declareMacro(myName, "do_hl_assertion_specs", "DO-HL-ASSERTION-SPECS");
    declareMacro(myName, "destructure_hl_assertion_spec", "DESTRUCTURE-HL-ASSERTION-SPEC");
    declareFunction(myName, "hl_assertion_spec_cnf", "HL-ASSERTION-SPEC-CNF", 1, 0, false);
    declareFunction(myName, "hl_assertion_spec_mt", "HL-ASSERTION-SPEC-MT", 1, 0, false);
    declareFunction(myName, "hl_assertion_spec_direction", "HL-ASSERTION-SPEC-DIRECTION", 1, 0, false);
    declareFunction(myName, "hl_assertion_spec_variable_map", "HL-ASSERTION-SPEC-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "hl_assertible_p", "HL-ASSERTIBLE-P", 1, 0, false);
    declareFunction(myName, "new_hl_assertible", "NEW-HL-ASSERTIBLE", 2, 0, false);
    declareMacro(myName, "do_hl_assertibles", "DO-HL-ASSERTIBLES");
    declareMacro(myName, "destructure_hl_assertible", "DESTRUCTURE-HL-ASSERTIBLE");
    declareFunction(myName, "hl_assertible_hl_assertion_spec", "HL-ASSERTIBLE-HL-ASSERTION-SPEC", 1, 0, false);
    declareFunction(myName, "hl_assertible_argument_spec", "HL-ASSERTIBLE-ARGUMENT-SPEC", 1, 0, false);
    declareFunction(myName, "hl_find_or_create_assertion", "HL-FIND-OR-CREATE-ASSERTION", 2, 2, false);
    declareFunction(myName, "hl_add_assertible", "HL-ADD-ASSERTIBLE", 1, 0, false);
    declareFunction(myName, "hl_add_argument", "HL-ADD-ARGUMENT", 4, 1, false);
    declareFunction(myName, "tl_add_argument", "TL-ADD-ARGUMENT", 4, 1, false);
    declareFunction(myName, "hl_remove_assertible", "HL-REMOVE-ASSERTIBLE", 1, 0, false);
    declareFunction(myName, "hl_remove_argument", "HL-REMOVE-ARGUMENT", 3, 0, false);
    declareFunction(myName, "tl_remove_argument", "TL-REMOVE-ARGUMENT", 3, 0, false);
    declareFunction(myName, "hl_remove_all_arguments", "HL-REMOVE-ALL-ARGUMENTS", 2, 0, false);
    declareFunction(myName, "tl_remove_all_arguments", "TL-REMOVE-ALL-ARGUMENTS", 2, 0, false);
    declareMacro(myName, "with_new_successful_hl_storage_modules_info", "WITH-NEW-SUCCESSFUL-HL-STORAGE-MODULES-INFO");
    declareFunction(myName, "note_successful_hl_storage_module", "NOTE-SUCCESSFUL-HL-STORAGE-MODULE", 1, 0, false);
    declareFunction(myName, "hl_storage_module_successfulP", "HL-STORAGE-MODULE-SUCCESSFUL?", 1, 0, false);
    declareFunction(myName, "hl_store_perform_action_int", "HL-STORE-PERFORM-ACTION-INT", 6, 0, false);
    declareFunction(myName, "hl_perform_action_with_storage_modules_int", "HL-PERFORM-ACTION-WITH-STORAGE-MODULES-INT", 7, 0, false);
    declareFunction(myName, "hl_assert", "HL-ASSERT", 4, 1, false);
    declareFunction(myName, "hl_unassert", "HL-UNASSERT", 2, 0, false);
    declareFunction(myName, "hl_add_deduction", "HL-ADD-DEDUCTION", 4, 1, false);
    declareFunction(myName, "hl_add_deduction_for_gaf", "HL-ADD-DEDUCTION-FOR-GAF", 5, 0, false);
    declareFunction(myName, "hl_remove_deduction", "HL-REMOVE-DEDUCTION", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_hl_storage_modules_file() {
    $hl_storage_modules$ = deflexical("*HL-STORAGE-MODULES*", ((NIL != Symbols.boundp($sym0$_HL_STORAGE_MODULES_)) ? ((SubLObject) $hl_storage_modules$.getGlobalValue()) : set.new_set(Symbols.symbol_function(EQ), UNPROVIDED)));
    $predicate_generic_hl_storage_modules$ = deflexical("*PREDICATE-GENERIC-HL-STORAGE-MODULES*", ((NIL != Symbols.boundp($sym1$_PREDICATE_GENERIC_HL_STORAGE_MODULES_)) ? ((SubLObject) $predicate_generic_hl_storage_modules$.getGlobalValue()) : set.new_set(Symbols.symbol_function(EQ), UNPROVIDED)));
    $predicate_specific_hl_storage_modules_table$ = deflexical("*PREDICATE-SPECIFIC-HL-STORAGE-MODULES-TABLE*", ((NIL != Symbols.boundp($sym2$_PREDICATE_SPECIFIC_HL_STORAGE_MODULES_TABLE_)) ? ((SubLObject) $predicate_specific_hl_storage_modules_table$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    $argument_type_specific_hl_storage_modules_table$ = deflexical("*ARGUMENT-TYPE-SPECIFIC-HL-STORAGE-MODULES-TABLE*", ((NIL != Symbols.boundp($sym3$_ARGUMENT_TYPE_SPECIFIC_HL_STORAGE_MODULES_TABLE_)) ? ((SubLObject) $argument_type_specific_hl_storage_modules_table$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    $currently_executing_hl_storage_module$ = defparameter("*CURRENTLY-EXECUTING-HL-STORAGE-MODULE*", NIL);
    $hl_storage_module_properties$ = deflexical("*HL-STORAGE-MODULE-PROPERTIES*", $list28);
    $solely_specific_hl_storage_module_predicate_store$ = deflexical("*SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE*", ((NIL != Symbols.boundp($sym51$_SOLELY_SPECIFIC_HL_STORAGE_MODULE_PREDICATE_STORE_)) ? ((SubLObject) $solely_specific_hl_storage_module_predicate_store$.getGlobalValue()) : set.new_set(EQ, $int52$50)));
    $successful_hl_storage_modules$ = defparameter("*SUCCESSFUL-HL-STORAGE-MODULES*", NIL);
    $robustly_remove_uncanonical_decontextualized_assertiblesP$ = deflexical("*ROBUSTLY-REMOVE-UNCANONICAL-DECONTEXTUALIZED-ASSERTIBLES?*", T);
    $dummy_asserted_argument_spec$ = deflexical("*DUMMY-ASSERTED-ARGUMENT-SPEC*", ((NIL != Symbols.boundp($sym91$_DUMMY_ASSERTED_ARGUMENT_SPEC_)) ? ((SubLObject) $dummy_asserted_argument_spec$.getGlobalValue()) : arguments.create_asserted_argument_spec($kw92$UNSPECIFIED)));
    return NIL;
  }

  public static final SubLObject setup_hl_storage_modules_file() {
    // CVS_ID("Id: hl-storage-modules.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_HL_STORAGE_MODULES_);
    subl_macro_promotions.declare_defglobal($sym1$_PREDICATE_GENERIC_HL_STORAGE_MODULES_);
    subl_macro_promotions.declare_defglobal($sym2$_PREDICATE_SPECIFIC_HL_STORAGE_MODULES_TABLE_);
    subl_macro_promotions.declare_defglobal($sym3$_ARGUMENT_TYPE_SPECIFIC_HL_STORAGE_MODULES_TABLE_);
    subl_macro_promotions.declare_defglobal($sym51$_SOLELY_SPECIFIC_HL_STORAGE_MODULE_PREDICATE_STORE_);
    subl_macro_promotions.declare_defglobal($sym91$_DUMMY_ASSERTED_ARGUMENT_SPEC_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_HL_STORAGE_MODULES_ = makeSymbol("*HL-STORAGE-MODULES*");
  public static final SubLSymbol $sym1$_PREDICATE_GENERIC_HL_STORAGE_MODULES_ = makeSymbol("*PREDICATE-GENERIC-HL-STORAGE-MODULES*");
  public static final SubLSymbol $sym2$_PREDICATE_SPECIFIC_HL_STORAGE_MODULES_TABLE_ = makeSymbol("*PREDICATE-SPECIFIC-HL-STORAGE-MODULES-TABLE*");
  public static final SubLSymbol $sym3$_ARGUMENT_TYPE_SPECIFIC_HL_STORAGE_MODULES_TABLE_ = makeSymbol("*ARGUMENT-TYPE-SPECIFIC-HL-STORAGE-MODULES-TABLE*");
  public static final SubLSymbol $sym4$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $sym5$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym6$HL_MODULE_P = makeSymbol("HL-MODULE-P");
  public static final SubLSymbol $kw7$ADD = makeKeyword("ADD");
  public static final SubLSymbol $kw8$REMOVE = makeKeyword("REMOVE");
  public static final SubLSymbol $kw9$REMOVE_ALL = makeKeyword("REMOVE-ALL");
  public static final SubLSymbol $kw10$ARGUMENT = makeKeyword("ARGUMENT");
  public static final SubLList $list11 = list(makeSymbol("HL-STORAGE-MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym12$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym13$_CURRENTLY_EXECUTING_HL_STORAGE_MODULE_ = makeSymbol("*CURRENTLY-EXECUTING-HL-STORAGE-MODULE*");
  public static final SubLList $list14 = cons(makeSymbol("DISPREFERRED-HL-MODULE"), makeSymbol("PREFERRED-MODULES"));
  public static final SubLSymbol $kw15$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw16$INCOMPLETENESS = makeKeyword("INCOMPLETENESS");
  public static final SubLSymbol $kw17$ARGUMENT_TYPE = makeKeyword("ARGUMENT-TYPE");
  public static final SubLSymbol $kw18$SENSE = makeKeyword("SENSE");
  public static final SubLSymbol $kw19$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw20$REQUIRED_MT = makeKeyword("REQUIRED-MT");
  public static final SubLSymbol $kw21$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw22$ANY_PREDICATES = makeKeyword("ANY-PREDICATES");
  public static final SubLSymbol $kw23$APPLICABILITY = makeKeyword("APPLICABILITY");
  public static final SubLSymbol $kw24$APPLICABILITY_PATTERN = makeKeyword("APPLICABILITY-PATTERN");
  public static final SubLSymbol $kw25$EXCLUSIVE = makeKeyword("EXCLUSIVE");
  public static final SubLSymbol $kw26$SUPPLANTS = makeKeyword("SUPPLANTS");
  public static final SubLSymbol $kw27$PREFERRED_OVER = makeKeyword("PREFERRED-OVER");
  public static final SubLList $list28 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("MODULE-SOURCE"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("REQUIRED-MT"), makeKeyword("PREDICATE"), makeKeyword("ANY-PREDICATES"), makeKeyword("APPLICABILITY-PATTERN"), makeKeyword("APPLICABILITY"), makeKeyword("SUPPLANTS"), makeKeyword("EXCLUSIVE"), makeKeyword("PREFERRED-OVER"), makeKeyword("INCOMPLETENESS"), makeKeyword("ADD"), makeKeyword("REMOVE"), makeKeyword("REMOVE-ALL"), makeKeyword("DOCUMENTATION")});
  public static final SubLSymbol $sym29$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym30$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym31$HL_STORAGE_MODULE_PROPERTY_P = makeSymbol("HL-STORAGE-MODULE-PROPERTY-P");
  public static final SubLList $list32 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("PRETTY-NAME"), makeSymbol("MODULE-SUBTYPE"), makeSymbol("MODULE-SOURCE"), makeSymbol("ARGUMENT-TYPE"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("REQUIRED-MT"), makeSymbol("PREDICATE"), makeSymbol("ANY-PREDICATES"), makeSymbol("APPLICABILITY-PATTERN"), makeSymbol("APPLICABILITY"), makeSymbol("SUPPLANTS"), makeSymbol("EXCLUSIVE"), makeSymbol("PREFERRED-OVER"), makeSymbol("INCOMPLETENESS"), makeSymbol("ADD"), makeSymbol("REMOVE"), makeSymbol("REMOVE-ALL"), makeSymbol("DOCUMENTATION")});
  public static final SubLSymbol $kw33$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw34$PRETTY_NAME = makeKeyword("PRETTY-NAME");
  public static final SubLSymbol $kw35$MODULE_SUBTYPE = makeKeyword("MODULE-SUBTYPE");
  public static final SubLSymbol $kw36$MODULE_SOURCE = makeKeyword("MODULE-SOURCE");
  public static final SubLSymbol $kw37$DOCUMENTATION = makeKeyword("DOCUMENTATION");
  public static final SubLSymbol $sym38$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym39$ARGUMENT_TYPE_P = makeSymbol("ARGUMENT-TYPE-P");
  public static final SubLSymbol $sym40$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym41$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym42$HL_STORAGE_MODULE_APPLICABILITY_PATTERN_P = makeSymbol("HL-STORAGE-MODULE-APPLICABILITY-PATTERN-P");
  public static final SubLSymbol $sym43$SENSE_P = makeSymbol("SENSE-P");
  public static final SubLSymbol $sym44$DIRECTION_P = makeSymbol("DIRECTION-P");
  public static final SubLSymbol $sym45$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym46$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLList $list47 = list(makeKeyword("ANYTHING"), makeKeyword("NOTHING"));
  public static final SubLSymbol $kw48$STORAGE = makeKeyword("STORAGE");
  public static final SubLSymbol $kw49$POS = makeKeyword("POS");
  public static final SubLSymbol $kw50$NEG = makeKeyword("NEG");
  public static final SubLSymbol $sym51$_SOLELY_SPECIFIC_HL_STORAGE_MODULE_PREDICATE_STORE_ = makeSymbol("*SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE*");
  public static final SubLInteger $int52$50 = makeInteger(50);
  public static final SubLList $list53 = list(makeSymbol("CNF"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"), makeSymbol("VARIABLE-MAP"));
  public static final SubLList $list54 = list(list(makeSymbol("HL-ASSERTION-SPEC-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym55$ASS = makeUninternedSymbol("ASS");
  public static final SubLSymbol $sym56$ASENT = makeUninternedSymbol("ASENT");
  public static final SubLSymbol $sym57$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym58$DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");
  public static final SubLSymbol $sym59$ASSERTION_TO_HL_ASSERTION_SPEC = makeSymbol("ASSERTION-TO-HL-ASSERTION-SPEC");
  public static final SubLSymbol $sym60$DO_BOOKKEEPING_ASENTS = makeSymbol("DO-BOOKKEEPING-ASENTS");
  public static final SubLSymbol $sym61$BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC = makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTION-SPEC");
  public static final SubLList $list62 = list(list(makeSymbol("CNF"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"), makeSymbol("VARIABLE-MAP")), makeSymbol("HL-ASSERTION-SPEC"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym63$HL_ASSERTION_SPEC_VAR = makeUninternedSymbol("HL-ASSERTION-SPEC-VAR");
  public static final SubLSymbol $sym64$HL_ASSERTION_SPEC_CNF = makeSymbol("HL-ASSERTION-SPEC-CNF");
  public static final SubLSymbol $sym65$HL_ASSERTION_SPEC_MT = makeSymbol("HL-ASSERTION-SPEC-MT");
  public static final SubLSymbol $sym66$HL_ASSERTION_SPEC_DIRECTION = makeSymbol("HL-ASSERTION-SPEC-DIRECTION");
  public static final SubLSymbol $sym67$HL_ASSERTION_SPEC_VARIABLE_MAP = makeSymbol("HL-ASSERTION-SPEC-VARIABLE-MAP");
  public static final SubLList $list68 = list(list(makeSymbol("HL-ASSERTIBLE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym69$ASS = makeUninternedSymbol("ASS");
  public static final SubLSymbol $sym70$ASENT = makeUninternedSymbol("ASENT");
  public static final SubLSymbol $sym71$ASSERTIBLES = makeUninternedSymbol("ASSERTIBLES");
  public static final SubLSymbol $sym72$ASSERTION_TO_HL_ASSERTIBLES = makeSymbol("ASSERTION-TO-HL-ASSERTIBLES");
  public static final SubLSymbol $sym73$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym74$BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE = makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTIBLE");
  public static final SubLList $list75 = list(list(makeSymbol("ARGUMENT-SPEC"), makeSymbol("CNF"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"), makeSymbol("VARIABLE-MAP")), makeSymbol("HL-ASSERTIBLE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym76$HL_ASSERTIBLE_VAR = makeUninternedSymbol("HL-ASSERTIBLE-VAR");
  public static final SubLSymbol $sym77$HL_ASSERTION_SPEC_VAR = makeUninternedSymbol("HL-ASSERTION-SPEC-VAR");
  public static final SubLSymbol $sym78$HL_ASSERTIBLE_ARGUMENT_SPEC = makeSymbol("HL-ASSERTIBLE-ARGUMENT-SPEC");
  public static final SubLSymbol $sym79$HL_ASSERTIBLE_HL_ASSERTION_SPEC = makeSymbol("HL-ASSERTIBLE-HL-ASSERTION-SPEC");
  public static final SubLSymbol $sym80$DESTRUCTURE_HL_ASSERTION_SPEC = makeSymbol("DESTRUCTURE-HL-ASSERTION-SPEC");
  public static final SubLSymbol $kw81$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $sym82$HL_ASSERTIBLE_P = makeSymbol("HL-ASSERTIBLE-P");
  public static final SubLSymbol $sym83$ARGUMENT_SPEC_P = makeSymbol("ARGUMENT-SPEC-P");
  public static final SubLSymbol $sym84$CNF_P = makeSymbol("CNF-P");
  public static final SubLSymbol $sym85$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym86$TL_ADD_ARGUMENT = makeSymbol("TL-ADD-ARGUMENT");
  public static final SubLSymbol $sym87$TL_REMOVE_ARGUMENT = makeSymbol("TL-REMOVE-ARGUMENT");
  public static final SubLSymbol $sym88$TL_REMOVE_ALL_ARGUMENTS = makeSymbol("TL-REMOVE-ALL-ARGUMENTS");
  public static final SubLList $list89 = list(list(makeSymbol("*SUCCESSFUL-HL-STORAGE-MODULES*"), list(makeSymbol("NEW-SET"))));
  public static final SubLString $str90$Unexpected_HL_storage_action__a = makeString("Unexpected HL storage action ~a");
  public static final SubLSymbol $sym91$_DUMMY_ASSERTED_ARGUMENT_SPEC_ = makeSymbol("*DUMMY-ASSERTED-ARGUMENT-SPEC*");
  public static final SubLSymbol $kw92$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLSymbol $kw93$FORWARD = makeKeyword("FORWARD");
  public static final SubLObject $const94$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLObject $const95$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLList $list96 = list(makeSymbol("CANON-CNF"), makeSymbol("&OPTIONAL"), makeSymbol("BINDING-LIST"));

  //// Initializers

  public void declareFunctions() {
    declare_hl_storage_modules_file();
  }

  public void initializeVariables() {
    init_hl_storage_modules_file();
  }

  public void runTopLevelForms() {
    setup_hl_storage_modules_file();
  }

}
