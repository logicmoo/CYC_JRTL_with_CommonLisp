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
import com.cyc.cycjava_1.cycl.api_control_vars;
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.inference.ask_utilities;
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertion_utilities;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.assertions_low;
import com.cyc.cycjava_1.cycl.at_vars;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.canon_tl;
import com.cyc.cycjava_1.cycl.clause_utilities;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_completion_high;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.constants_high;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cyc_kernel;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_main;
import com.cyc.cycjava_1.cycl.czer_meta;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.czer_vars;
import com.cyc.cycjava_1.cycl.deduction_handles;
import com.cyc.cycjava_1.cycl.deductions_high;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.encapsulation;
import com.cyc.cycjava_1.cycl.enumeration_types;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.inference.harness.forward;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.inference.harness.hl_prototypes;
import com.cyc.cycjava_1.cycl.hl_storage_modules;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.hlmt_czer;
import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.inference.janus;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_control_vars;
import com.cyc.cycjava_1.cycl.kb_hl_supports;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_mapping;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.kb_utilities;
import com.cyc.cycjava_1.cycl.ke;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.nart_handles;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.numeric_date_utilities;
import com.cyc.cycjava_1.cycl.operation_queues;
import com.cyc.cycjava_1.cycl.precanonicalizer;
import com.cyc.cycjava_1.cycl.queues;
import com.cyc.cycjava_1.cycl.skolems;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.system_parameters;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.tms;
import com.cyc.cycjava_1.cycl.transform_list_utilities;
import com.cyc.cycjava_1.cycl.uncanonicalizer;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;
import com.cyc.cycjava_1.cycl.wff;
import com.cyc.cycjava_1.cycl.wff_utilities;
import com.cyc.cycjava_1.cycl.wff_vars;

public  final class fi extends SubLTranslatedFile {

  //// Constructor

  private fi() {}
  public static final SubLFile me = new fi();
  public static final String myName = "com.cyc.cycjava_1.cycl.fi";

  //// Definitions

  @SubL(source = "cycl/fi.lisp", position = 2539) 
  private static SubLSymbol $fi_dispatch_table$ = null;

  @SubL(source = "cycl/fi.lisp", position = 6118) 
  public static final SubLObject reset_fi_error_state() {
    reset_fi_error();
    reset_fi_warning();
    return NIL;
  }

  @SubL(source = "cycl/fi.lisp", position = 6558) 
  public static SubLSymbol $fi_warning$ = null;

  @SubL(source = "cycl/fi.lisp", position = 6620) 
  public static final SubLObject reset_fi_warning() {
    $fi_warning$.setDynamicValue(NIL);
    return NIL;
  }

  @SubL(source = "cycl/fi.lisp", position = 7008) 
  public static final SubLObject signal_fi_warning(SubLObject fi_warning) {
    $fi_warning$.setDynamicValue(fi_warning);
    return NIL;
  }

  @SubL(source = "cycl/fi.lisp", position = 7234) 
  public static SubLSymbol $fi_error$ = null;

  @SubL(source = "cycl/fi.lisp", position = 7293) 
  public static final SubLObject reset_fi_error() {
    $fi_error$.setDynamicValue(NIL);
    return NIL;
  }

  @SubL(source = "cycl/fi.lisp", position = 7538) 
  public static final SubLObject signal_fi_error(SubLObject fi_error) {
    $fi_error$.setDynamicValue(fi_error);
    return NIL;
  }

  @SubL(source = "cycl/fi.lisp", position = 7624) 
  public static final SubLObject fi_error_signaledP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return list_utilities.sublisp_boolean($fi_error$.getDynamicValue(thread));
    }
  }


  @SubL(source = "cycl/fi.lisp", position = 7692) 
  public static final SubLObject fi_get_error_int() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $fi_error$.getDynamicValue(thread);
    }
  }

  
  @SubL(source = "cycl/fi.lisp", position = 8179) 
  public static SubLSymbol $fi_last_constant$ = null;

  @SubL(source = "cycl/fi.lisp", position = 8245) 
  public static SubLSymbol $fi_last_assertions_asserted$ = null;

  @SubL(source = "cycl/fi.lisp", position = 8327) 
  private static SubLSymbol $within_fi_operationP$ = null;

  @SubL(source = "cycl/fi.lisp", position = 10675) 
  public static SubLSymbol $current_fi_op$ = null;

  @SubL(source = "cycl/fi.lisp", position = 15072) 
  public static final SubLObject fi_find_int(SubLObject name) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      reset_fi_error_state();
      if ((!(name.isString()))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str34$Expected_a_string__got__S, name));
        return NIL;
      }
      if ((NIL == constant_completion_high.valid_constant_name_p(name))) {
        signal_fi_error(list($kw35$INVALID_NAME, $str36$_S_is_not_a_valid_name_for_a_cons, name));
        return NIL;
      }
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
          try {
            $within_fi_operationP$.bind(T, thread);
            {
              SubLObject constant = constants_high.find_constant(name);
              ans = ((NIL != constant_handles.valid_constantP(constant, UNPROVIDED)) ? ((SubLObject) constant) : NIL);
            }
          } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 16592) 
  public static final SubLObject fi_create_int(SubLObject name, SubLObject external_id) {
    if ((external_id == UNPROVIDED)) {
      external_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      reset_fi_error_state();
      if ((name != $kw46$UNNAMED)) {
        if ((!(name.isString()))) {
          signal_fi_error(list($kw33$ARG_ERROR, $str34$Expected_a_string__got__S, name));
          return NIL;
        }
        if ((NIL == constant_completion_high.valid_constant_name_p(name))) {
          signal_fi_error(list($kw35$INVALID_NAME, $str36$_S_is_not_a_valid_name_for_a_cons, name));
          return NIL;
        }
        if ((NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread))) {
          {
            SubLObject name_collision = constant_completion_high.constant_name_case_collision(name);
            if ((NIL != name_collision)) {
              {
                SubLObject new_name = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31584");
                signal_fi_warning(list($kw47$NAME_CLASH, $str48$NAME_clash_for__S___renaming_to__, name, new_name));
                name = new_name;
              }
            }
          }
        }
      }
      if ((!(((NIL == external_id)
            || (NIL != constants_high.constant_external_id_p(external_id)))))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str49$Expected_an_external_ID__got__S, external_id));
        return NIL;
      }
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$janus_within_somethingP$.currentBinding(thread);
          SubLObject _prev_bind_1 = $within_fi_operationP$.currentBinding(thread);
          try {
            control_vars.$janus_within_somethingP$.bind(T, thread);
            $within_fi_operationP$.bind(T, thread);
            {
              SubLObject existing_by_name = (name.isString() ? ((SubLObject) constants_high.find_constant(name)) : NIL);
              SubLObject existing_by_id = ((NIL != external_id) ? ((SubLObject) constants_high.find_constant_by_external_id(external_id)) : NIL);
              if (((NIL == existing_by_name)
                   && (NIL == external_id))) {
                {
                  SubLObject new_external_id = constants_high.make_constant_external_id();
                  ans = constants_high.create_constant(name, new_external_id);
                  $fi_last_constant$.setDynamicValue(ans, thread);
                }
              } else if (((NIL == existing_by_name)
                   && (NIL != external_id)
                   && (NIL == existing_by_id))) {
                ans = constants_high.create_constant(name, external_id);
                $fi_last_constant$.setDynamicValue(ans, thread);
              } else if (((NIL == existing_by_name)
                   && (NIL != existing_by_id))) {
                ans = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11177");
              } else if (((NIL != existing_by_name)
                   && (NIL != existing_by_id)
                   && (existing_by_name != existing_by_id))) {
                ans = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11178");
              } else if (((NIL != existing_by_name)
                   && (NIL != existing_by_id)
                   && (existing_by_name == existing_by_id))) {
                ans = existing_by_name;
              } else if (((NIL != existing_by_name)
                   && (NIL == existing_by_id)
                   && (NIL != constants_high.uninstalled_constant_p(existing_by_name)))) {
                {
                  SubLObject external_id_to_install = ((NIL != external_id) ? ((SubLObject) external_id) : constants_high.make_constant_external_id());
                  ans = constants_high.create_constant(name, external_id_to_install);
                }
                $fi_last_constant$.setDynamicValue(ans, thread);
              } else if (((NIL != existing_by_name)
                   && (NIL == existing_by_id))) {
                {
                  SubLObject new_name = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31585");
                  ans = constants_high.create_constant(new_name, external_id);
                  $fi_last_constant$.setDynamicValue(ans, thread);
                  signal_fi_warning(list($kw47$NAME_CLASH, $str48$NAME_clash_for__S___renaming_to__, name, new_name));
                }
              }
            }
          } finally {
            $within_fi_operationP$.rebind(_prev_bind_1, thread);
            control_vars.$janus_within_somethingP$.rebind(_prev_bind_0, thread);
          }
        }
        janus.janus_note_create_finished(ans);
        return ans;
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 26584) 
  private static SubLSymbol $merge_fort_assertion_map$ = null;

  @SubL(source = "cycl/fi.lisp", position = 40541) 
  public static final SubLObject fi_kill_int(SubLObject fort) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      reset_fi_error_state();
      fort = fi_convert_to_fort(fort);
      if ((NIL != fi_error_signaledP())) {
        return NIL;
      }
      if ((NIL != constants_high.uninstalled_constant_p(fort))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str92$Constant__S_is_merely_an_empty_sh, fort));
        return NIL;
      }
      {
        SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
        SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
        SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
        SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        SubLObject _prev_bind_11 = $within_fi_operationP$.currentBinding(thread);
        try {
          control_vars.$within_assert$.bind(NIL, thread);
          wff_utilities.$check_arg_typesP$.bind(NIL, thread);
          at_vars.$at_check_arg_typesP$.bind(NIL, thread);
          wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
          wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
          wff_utilities.$check_var_typesP$.bind(NIL, thread);
          czer_vars.$simplify_literalP$.bind(NIL, thread);
          at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
          at_vars.$at_check_arg_formatP$.bind(NIL, thread);
          wff_vars.$validate_constantsP$.bind(NIL, thread);
          system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
          $within_fi_operationP$.bind(T, thread);
          forts.remove_fort(fort);
        } finally {
          $within_fi_operationP$.rebind(_prev_bind_11, thread);
          system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
          wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
          at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
          at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
          czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
          wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
          wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
          wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
          at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
          wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
          control_vars.$within_assert$.rebind(_prev_bind_0, thread);
        }
      }
      return makeBoolean((NIL == fi_error_signaledP()));
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 41317) 
  public static final SubLObject fi_rename_int(SubLObject constant, SubLObject name) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      reset_fi_error_state();
      if ((NIL == constant_handles.constant_p(constant))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str97$Expected_a_constant__got__S, constant));
        return NIL;
      }
      if ((!(name.isString()))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str34$Expected_a_string__got__S, name));
        return NIL;
      }
      if ((NIL == constant_completion_high.valid_constant_name_p(name))) {
        signal_fi_error(list($kw35$INVALID_NAME, $str36$_S_is_not_a_valid_name_for_a_cons, name));
        return NIL;
      }
      if ((NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread))) {
        {
          SubLObject name_collisions = constant_completion_high.constant_name_case_collisions(name);
          name_collisions = Sequences.delete(constant, name_collisions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          if ((NIL != name_collisions)) {
            {
              SubLObject new_name = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31586");
              signal_fi_warning(list($kw47$NAME_CLASH, $str48$NAME_clash_for__S___renaming_to__, name, new_name));
              name = new_name;
            }
          }
        }
      }
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
          try {
            $within_fi_operationP$.bind(T, thread);
            if (constants_high.constant_name(constant).equal(name)) {
              signal_fi_warning(list($kw98$ALREADY_HAS_NAME, $str99$Constant__S_is_already_named__A, constant, name));
            } else {
              {
                SubLObject existing_constant = constants_high.find_constant(name);
                if ((NIL != constant_handles.valid_constantP(existing_constant, UNPROVIDED))) {
                  {
                    SubLObject new_name = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31587");
                    ans = constants_high.rename_constant(constant, new_name);
                    signal_fi_warning(list($kw47$NAME_CLASH, $str48$NAME_clash_for__S___renaming_to__, name, new_name));
                  }
                } else {
                  if ((NIL != constant_handles.constant_p(existing_constant))) {
                    constants_high.remove_constant(existing_constant);
                  }
                  ans = constants_high.rename_constant(constant, name);
                }
              }
            }
          } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  /** To be used only by cyc-assert-wff */
  @SubL(source = "cycl/fi.lisp", position = 47381) 
  public static SubLSymbol $assume_assert_sentence_is_wfP$ = null;

  @SubL(source = "cycl/fi.lisp", position = 47482) 
  public static final SubLObject fi_assert_int(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
    if ((strength == UNPROVIDED)) {
      strength = $kw107$DEFAULT;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      reset_fi_error_state();
      if ((NIL == el_utilities.el_formula_p(formula))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str105$Expected_a_cons__got__S, formula));
        return NIL;
      }
      formula = canon_tl.transform_tl_terms_to_hl(formula);
      mt = canon_tl.transform_tl_terms_to_hl(mt);
      mt = fi_convert_to_assert_hlmt(mt);
      if ((NIL != fi_error_signaledP())) {
        return NIL;
      }
      if ((NIL == enumeration_types.el_strength_p(strength))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str112$Expected__default_or__monotonic__, strength));
        return NIL;
      }
      if ((!(((NIL == direction)
            || (NIL != enumeration_types.direction_p(direction)))))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str113$Expected_a_direction__got__S, direction));
        return NIL;
      }
      {
        SubLObject assertions_found_or_created = NIL;
        SubLObject ans = NIL;
        SubLObject janus_deduce_specs = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$janus_within_somethingP$.currentBinding(thread);
          SubLObject _prev_bind_1 = control_vars.$janus_extraction_deduce_specs$.currentBinding(thread);
          try {
            control_vars.$janus_within_somethingP$.bind(T, thread);
            control_vars.$janus_extraction_deduce_specs$.bind(NIL, thread);
            thread.resetMultipleValues();
            {
              SubLObject canon_versions = ((NIL != $assume_assert_sentence_is_wfP$.getDynamicValue(thread)) ? ((SubLObject) czer_main.canonicalize_wf_assert_sentence(formula, mt)) : czer_main.canonicalize_assert_sentence(formula, mt));
              SubLObject canon_mt = thread.secondMultipleValue();
              thread.resetMultipleValues();
              {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(canon_mt);
                {
                  SubLObject _prev_bind_0_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  SubLObject _prev_bind_3 = $within_fi_operationP$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    $within_fi_operationP$.bind(T, thread);
                    if ((NIL == canon_versions)) {
                      signal_fi_error(fi_not_wff_assert_error(formula, canon_mt));
                    } else if ((canon_versions == $const114$True)) {
                      signal_fi_error(list($kw115$TAUTOLOGY, $str116$Formula______S___in__S_was_a_taut, formula, canon_mt));
                    } else if ((canon_versions == $const117$False)) {
                      signal_fi_error(list($kw118$CONTRADICTION, $str119$Formula______S___in__S_was_a_cont, formula, canon_mt));
                    } else {
                      $fi_last_assertions_asserted$.setDynamicValue(NIL, thread);
                      {
                        SubLObject cdolist_list_var = canon_versions;
                        SubLObject canon_version = NIL;
                        for (canon_version = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), canon_version = cdolist_list_var.first()) {
                          if ((NIL == fi_error_signaledP())) {
                            {
                              SubLObject datum = canon_version;
                              SubLObject current = datum;
                              SubLObject cnf = NIL;
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list120);
                              cnf = current.first();
                              current = current.rest();
                              {
                                SubLObject variable_map = (current.isCons() ? ((SubLObject) current.first()) : NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list120);
                                current = current.rest();
                                {
                                  SubLObject query_free_vars = (current.isCons() ? ((SubLObject) current.first()) : NIL);
                                  cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list120);
                                  current = current.rest();
                                  if ((NIL == current)) {
                                    if ((NIL == direction)) {
                                      direction = fi_cnf_default_direction(cnf);
                                    }
                                    {
                                      SubLObject assertion = hl_storage_modules.hl_assert(cnf, canon_mt, strength, direction, variable_map);
                                      if ((NIL != assertion_handles.assertion_p(assertion))) {
                                        assertions_found_or_created = cons(assertion, assertions_found_or_created);
                                      } else if ((NIL == assertion)) {
                                        signal_fi_error(list($kw121$COULD_NOT_ASSERT, $str122$Unable_to_assert_formula__S__in__, formula, canon_mt));
                                      }
                                    }
                                  } else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, $list120);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      assertions_found_or_created = Sequences.nreverse(assertions_found_or_created);
                    }
                    ans = makeBoolean((NIL == fi_error_signaledP()));
                  } finally {
                    $within_fi_operationP$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_4, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_3, thread);
                  }
                }
              }
            }
            if ((NIL == fi_error_signaledP())) {
              {
                SubLObject deductions_found_or_created = NIL;
                {
                  SubLObject _prev_bind_0_5 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                  try {
                    kb_control_vars.$forward_inference_allowed_rules$.bind(hl_prototypes.hl_prototype_allowed_forward_rules(assertions_found_or_created), thread);
                    deductions_found_or_created = forward.perform_forward_inference();
                  } finally {
                    kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_5, thread);
                  }
                }
                perform_assert_post_processing(assertions_found_or_created, deductions_found_or_created);
              }
            }
            janus_deduce_specs = control_vars.$janus_extraction_deduce_specs$.getDynamicValue(thread);
          } finally {
            control_vars.$janus_extraction_deduce_specs$.rebind(_prev_bind_1, thread);
            control_vars.$janus_within_somethingP$.rebind(_prev_bind_0, thread);
          }
        }
        janus.janus_note_assert_finished(formula, mt, strength, direction, janus_deduce_specs);
        return ans;
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 50682) 
  public static final SubLObject perform_assert_post_processing(SubLObject assertions_found_or_created, SubLObject deductions_found_or_created) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject skolem_functions = NIL;
        {
          SubLObject cdolist_list_var = assertions_found_or_created;
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            if ((NIL == function_terms.tou_assertionP(ass))) {
              {
                SubLObject skolem_narts = NIL;
                {
                  SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                  try {
                    cycl_utilities.$opaque_arg_function$.bind($sym123$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_, thread);
                    skolem_narts = cycl_utilities.assertion_gather($sym124$FAST_SKOLEM_NAT_, ass, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                  } finally {
                    cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
                  }
                }
                if ((NIL != skolem_narts)) {
                  {
                    SubLObject cdolist_list_var_6 = skolem_narts;
                    SubLObject skolem_nart = NIL;
                    for (skolem_nart = cdolist_list_var_6.first(); (NIL != cdolist_list_var_6); cdolist_list_var_6 = cdolist_list_var_6.rest(), skolem_nart = cdolist_list_var_6.first()) {
                      {
                        SubLObject item_var = cycl_utilities.nat_functor(skolem_nart);
                        if ((NIL == conses_high.member(item_var, skolem_functions, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                          skolem_functions = cons(item_var, skolem_functions);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if ((NIL != skolem_functions)) {
          {
            SubLObject cdolist_list_var = skolem_functions;
            SubLObject skolem_function = NIL;
            for (skolem_function = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), skolem_function = cdolist_list_var.first()) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11190");
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 53560) 
  public static final SubLObject fi_cnf_default_direction(SubLObject cnf) {
    checkType(cnf, $sym130$CNF_P);
    if ((NIL != clause_utilities.pos_atomic_clause_p(cnf))) {
      {
        SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
        if ((NIL != el_utilities.ist_sentence_p(asent))) {
          {
            SubLObject sub_mt = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30485");
            SubLObject subsentence = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30505");
            SubLObject sub_cnfs = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8813");
            SubLObject cdolist_list_var = sub_cnfs;
            SubLObject sub_cnf = NIL;
            for (sub_cnf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sub_cnf = cdolist_list_var.first()) {
              if (($kw131$BACKWARD == fi_cnf_default_direction(sub_cnf))) {
                return $kw131$BACKWARD;
              }
            }
          }
          return $kw132$FORWARD;
        }
      }
    }
    if (((NIL != clauses.atomic_clause_p(cnf))
         && (NIL != clauses.ground_clause_p(cnf)))) {
      return $kw132$FORWARD;
    } else {
      return $kw131$BACKWARD;
    }
  }

  /** Whether to generate precise WFF errors when FI operations fail.
These precise explanations will explain why the operation failed.
If NIL, the error will simply state that the operation was ill-formed,
but will not say why.  Can be bound to NIL by callers that do not
care about the reason. */
  @SubL(source = "cycl/fi.lisp", position = 54339) 
  public static SubLSymbol $generate_precise_fi_wff_errorsP$ = null;

  /** Returns an error for why it is not wff to assert FORMULA in MT. */
  @SubL(source = "cycl/fi.lisp", position = 55077) 
  public static final SubLObject fi_not_wff_assert_error(SubLObject formula, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $generate_precise_fi_wff_errorsP$.getDynamicValue(thread))) {
        return list($kw133$FORMULA_NOT_WELL_FORMED, $str134$Formula______S___was_not_well_for, formula, wff.explanation_of_why_not_wff_assert(formula, mt, UNPROVIDED));
      } else {
        return list($kw133$FORMULA_NOT_WELL_FORMED, $str135$Formula______S___was_not_well_for, formula);
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 55486) 
  public static final SubLObject fi_assert_update_asserted_argument(SubLObject assertion, SubLObject hl_tv, SubLObject direction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject current_direction = assertions_high.assertion_direction(assertion);
        SubLObject existing_asserted_argument = assertions_high.get_asserted_argument(assertion);
        $fi_last_assertions_asserted$.setDynamicValue(cons(assertion, $fi_last_assertions_asserted$.getDynamicValue(thread)), thread);
        if ((NIL != existing_asserted_argument)) {
          if ((hl_tv == arguments.argument_tv(existing_asserted_argument))) {
            if ((direction == current_direction)) {
              signal_fi_warning($list136);
            }
          } else {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12457");
          }
        } else {
          tms.tms_create_asserted_argument_with_tv(assertion, hl_tv);
        }
        if ((direction != current_direction)) {
          tms.tms_change_direction(assertion, direction);
        }
      }
      return assertion;
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 56422) 
  public static final SubLObject hl_assert_update_asserted_argument(SubLObject assertion, SubLObject hl_tv, SubLObject direction) {
    return fi_assert_update_asserted_argument(assertion, hl_tv, direction);
  }

  @SubL(source = "cycl/fi.lisp", position = 59190) 
  public static final SubLObject fi_unassert_int(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      reset_fi_error_state();
      if ((NIL == el_utilities.el_formula_p(sentence))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str105$Expected_a_cons__got__S, sentence));
        return NIL;
      }
      {
        SubLObject ans = NIL;
        SubLObject environment = forward.get_forward_inference_environment();
        checkType(environment, $sym55$QUEUE_P);
        {
          SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
          try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            {
              SubLObject _prev_bind_0_7 = $within_fi_operationP$.currentBinding(thread);
              try {
                $within_fi_operationP$.bind(T, thread);
                {
                  SubLObject canon_versions = NIL;
                  SubLObject deduced_argumentP = NIL;
                  thread.resetMultipleValues();
                  {
                    SubLObject canon_versions_8 = canonicalize_fi_unassert_sentence(sentence, mt);
                    SubLObject mt_9 = thread.secondMultipleValue();
                    SubLObject deduced_argumentP_10 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    canon_versions = canon_versions_8;
                    mt = mt_9;
                    deduced_argumentP = deduced_argumentP_10;
                  }
                  {
                    SubLObject canonical_mt = fi_convert_to_assert_hlmt(mt);
                    if ((NIL == fi_error_signaledP())) {
                      {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(canonical_mt);
                        {
                          SubLObject _prev_bind_0_11 = mt_relevance_macros.$mt$.currentBinding(thread);
                          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                          try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            if (((NIL != deduced_argumentP)
                                 && (NIL == canon_versions))) {
                            } else if ((NIL == canon_versions)) {
                              signal_fi_error(Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11160"));
                            } else if ((canon_versions == $const114$True)) {
                              signal_fi_error(list($kw115$TAUTOLOGY, $str144$Sentence______S___in__S_was_a_tau, sentence, mt));
                            } else if ((canon_versions == $const117$False)) {
                              signal_fi_error(list($kw118$CONTRADICTION, $str145$Sentence______S___in__S_was_a_con, sentence, mt));
                            } else {
                              {
                                SubLObject cdolist_list_var = canon_versions;
                                SubLObject canon_version = NIL;
                                for (canon_version = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), canon_version = cdolist_list_var.first()) {
                                  if ((NIL == fi_error_signaledP())) {
                                    {
                                      SubLObject datum = canon_version;
                                      SubLObject current = datum;
                                      SubLObject cnf = NIL;
                                      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list120);
                                      cnf = current.first();
                                      current = current.rest();
                                      {
                                        SubLObject variable_map = (current.isCons() ? ((SubLObject) current.first()) : NIL);
                                        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list120);
                                        current = current.rest();
                                        {
                                          SubLObject query_free_vars = (current.isCons() ? ((SubLObject) current.first()) : NIL);
                                          cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list120);
                                          current = current.rest();
                                          if ((NIL == current)) {
                                            if ((NIL == hl_storage_modules.hl_unassert(cnf, mt))) {
                                              signal_fi_warning(list($kw139$ASSERTION_NOT_PRESENT, $str146$Sentence__S_in_mt__S_is_not_in_th, sentence, mt));
                                            }
                                          } else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, $list120);
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_11, thread);
                          }
                        }
                      }
                    }
                  }
                  ans = makeBoolean((NIL == fi_error_signaledP()));
                }
              } finally {
                $within_fi_operationP$.rebind(_prev_bind_0_7, thread);
              }
            }
            if ((NIL != ans)) {
              forward.perform_forward_inference();
            }
          } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 61091) 
  public static final SubLObject canonicalize_fi_unassert_sentence(SubLObject sentence, SubLObject mt) {
    return canonicalize_fi_remove_sentence(sentence, mt, T);
  }

  /** @return 0 canon-versions
   @return 1 mt */
  @SubL(source = "cycl/fi.lisp", position = 61463) 
  public static final SubLObject canonicalize_fi_remove_sentence(SubLObject sentence, SubLObject mt, SubLObject check_for_asserted_argumentP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject el_sentence = canon_tl.transform_tl_terms_to_hl(sentence);
        thread.resetMultipleValues();
        {
          SubLObject el_sentence_13 = czer_utilities.unwrap_if_ist(el_sentence, mt);
          SubLObject mt_14 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          el_sentence = el_sentence_13;
          mt = mt_14;
        }
        mt = canonicalize_unassert_hlmt(mt);
        {
          SubLObject canon_versions = NIL;
          SubLObject deduced_argumentP = NIL;
          SubLObject assertions = ((NIL != hlmt.hlmt_p(mt)) ? ((SubLObject) czer_meta.find_assertions_cycl(el_sentence, mt)) : NIL);
          if ((NIL == assertions)) {
            assertions = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10917");
          }
          if ((NIL != assertions)) {
            {
              SubLObject cdolist_list_var = assertions;
              SubLObject assertion = NIL;
              for (assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
                if (((NIL != check_for_asserted_argumentP)
                     && (NIL == assertions_high.get_asserted_argument(assertion)))) {
                  signal_fi_warning(list($kw147$ASSERTION_NOT_LOCAL, $str148$Sentence__S_in_mt__S_is_not_local, el_sentence, mt));
                  deduced_argumentP = T;
                } else {
                  {
                    SubLObject cnf = assertions_high.assertion_cnf(assertion);
                    SubLObject variable_map = NIL;
                    SubLObject query_free_vars = NIL;
                    SubLObject canon_version = list(cnf, variable_map, query_free_vars);
                    SubLObject ass_mt = assertions_high.assertion_mt(assertion);
                    canon_versions = cons(canon_version, canon_versions);
                    mt = ass_mt;
                  }
                }
              }
            }
          } else {
            if ((NIL != hlmt.hlmt_p(mt))) {
              thread.resetMultipleValues();
              {
                SubLObject canon_versions_15 = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31062");
                SubLObject mt_16 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_15;
                mt = mt_16;
              }
            }
          }
          return Values.values(canon_versions, mt, deduced_argumentP);
        }
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 62900) 
  public static final SubLObject canonicalize_unassert_hlmt(SubLObject mt) {
    mt = canon_tl.tlmt_to_hlmt(mt);
    mt = narts_high.nart_substitute(mt);
    return mt;
  }

  @SubL(source = "cycl/fi.lisp", position = 92600) 
  public static final SubLObject fi_timestamp_constant_int(SubLObject cyclist, SubLObject time, SubLObject why, SubLObject second) {
    if ((why == UNPROVIDED)) {
      why = NIL;
    }
    if ((second == UNPROVIDED)) {
      second = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      cyclist = canon_tl.transform_tl_terms_to_hl(cyclist);
      if ((NIL != why)) {
        why = canon_tl.transform_tl_terms_to_hl(why);
      }
      reset_fi_error_state();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
          try {
            $within_fi_operationP$.bind(T, thread);
            if ((NIL == forts.fort_p(cyclist))) {
              signal_fi_warning($list211);
            } else if ((!(time.isInteger()))) {
              signal_fi_warning($list212);
            } else if ((!(((NIL == why)
                  || (NIL != constant_handles.constant_p(why)))))) {
              signal_fi_warning($list213);
            } else if ((!(((NIL == second)
                  || (NIL != numeric_date_utilities.universal_second_p(second)))))) {
              signal_fi_warning($list214);
            } else if ((NIL == constant_handles.constant_p($fi_last_constant$.getDynamicValue(thread)))) {
              signal_fi_warning($list215);
            } else if ((NIL != constant_timestampedP($fi_last_constant$.getDynamicValue(thread)))) {
              signal_fi_warning($list216);
            } else {
              timestamp_constant($fi_last_constant$.getDynamicValue(thread), cyclist, time, why, second);
            }
            ans = makeBoolean((NIL == fi_error_signaledP()));
            $fi_last_constant$.setDynamicValue(NIL, thread);
            $fi_last_assertions_asserted$.setDynamicValue(NIL, thread);
          } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 93802) 
  public static final SubLObject constant_timestampedP(SubLObject constant) {
    checkType(constant, $sym217$CONSTANT_P);
    return makeBoolean(((NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, $const218$myCreator, UNPROVIDED, UNPROVIDED, UNPROVIDED))
          || (NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, $const219$myCreationTime, UNPROVIDED, UNPROVIDED, UNPROVIDED))
          || (NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, $const220$myCreationPurpose, UNPROVIDED, UNPROVIDED, UNPROVIDED))
          || (NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, $const221$myCreationSecond, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
  }

  @SubL(source = "cycl/fi.lisp", position = 94153) 
  public static final SubLObject timestamp_constant(SubLObject constant, SubLObject cyclist, SubLObject time, SubLObject why, SubLObject second) {
    if ((why == UNPROVIDED)) {
      why = NIL;
    }
    if ((second == UNPROVIDED)) {
      second = NIL;
    }
    {
      SubLObject v_properties = list($kw222$STRENGTH, $kw57$MONOTONIC, $kw223$DIRECTION, $kw131$BACKWARD);
      cyc_kernel.cyc_assert_wff(list($const218$myCreator, constant, cyclist), $const224$BookkeepingMt, v_properties);
      cyc_kernel.cyc_assert_wff(list($const219$myCreationTime, constant, time), $const224$BookkeepingMt, v_properties);
      if ((NIL != constant_handles.constant_p(why))) {
        cyc_kernel.cyc_assert_wff(list($const220$myCreationPurpose, constant, why), $const224$BookkeepingMt, v_properties);
      }
      if ((NIL != numeric_date_utilities.universal_second_p(second))) {
        cyc_kernel.cyc_assert_wff(list($const221$myCreationSecond, constant, second), $const224$BookkeepingMt, v_properties);
      }
    }
    return constant;
  }

  @SubL(source = "cycl/fi.lisp", position = 96137) 
  public static final SubLObject fi_timestamp_assertion_int(SubLObject cyclist, SubLObject time, SubLObject why, SubLObject second) {
    if ((why == UNPROVIDED)) {
      why = NIL;
    }
    if ((second == UNPROVIDED)) {
      second = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      cyclist = canon_tl.transform_tl_terms_to_hl(cyclist);
      if ((NIL != why)) {
        why = canon_tl.transform_tl_terms_to_hl(why);
      }
      reset_fi_error_state();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $within_fi_operationP$.currentBinding(thread);
          try {
            $within_fi_operationP$.bind(T, thread);
            if ((NIL == forts.fort_p(cyclist))) {
              signal_fi_warning($list211);
            } else if ((!(time.isInteger()))) {
              signal_fi_warning($list212);
            } else if ((!(((NIL == why)
                  || (NIL != constant_handles.constant_p(why)))))) {
              signal_fi_warning($list213);
            } else if ((!(((NIL == second)
                  || (NIL != numeric_date_utilities.universal_second_p(second)))))) {
              signal_fi_warning($list214);
            } else if ((!($fi_last_assertions_asserted$.getDynamicValue(thread).isCons()))) {
              signal_fi_warning($list226);
            } else {
              {
                SubLObject assertions = $fi_last_assertions_asserted$.getDynamicValue(thread);
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
                  if ((NIL != assertions_high.asserted_assertionP(assertion))) {
                    if ((NIL != assertions_low.asserted_assertion_timestampedP(assertion))) {
                      signal_fi_warning($list216);
                    } else {
                      assertions_high.timestamp_asserted_assertion(assertion, cyclist, time, why, second);
                    }
                  }
                }
              }
            }
            ans = makeBoolean((NIL == fi_error_signaledP()));
            $fi_last_assertions_asserted$.setDynamicValue(NIL, thread);
          } finally {
            $within_fi_operationP$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 102035) 
  public static final SubLObject ke_purpose() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return api_control_vars.$ke_purpose$.getDynamicValue(thread);
    }
  }

  /** When non-nil, this variable contains the date to be used for asserting formulas to the system.
NIL means that the current date is to be used. */
  @SubL(source = "cycl/fi.lisp", position = 102294) 
  public static SubLSymbol $the_date$ = null;

  @SubL(source = "cycl/fi.lisp", position = 102507) 
  public static final SubLObject the_date() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ($the_date$.getDynamicValue(thread).isInteger()) {
        return $the_date$.getDynamicValue(thread);
      } else {
        return numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
      }
    }
  }

  /** When non-nil, this variable contains the second to be used for asserting formulas to the system.
NIL means that the current second is to be used. */
  @SubL(source = "cycl/fi.lisp", position = 102681) 
  public static SubLSymbol $the_second$ = null;

  @SubL(source = "cycl/fi.lisp", position = 102864) 
  public static final SubLObject the_second() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ($the_second$.getDynamicValue(thread).isInteger()) {
        return $the_second$.getDynamicValue(thread);
      } else {
        return numeric_date_utilities.get_universal_second(UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 103046) 
  public static final SubLObject fi_convert_to_assert_hlmt(SubLObject el_term) {
    {
      SubLObject v_hlmt = czer_main.canonicalize_assert_mt(el_term);
      if ((NIL == hlmt.hlmt_p(v_hlmt))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str237$Expected_a_microtheory__got__S, el_term));
        return NIL;
      }
      return v_hlmt;
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 103666) 
  public static final SubLObject fi_convert_to_fort(SubLObject el_term) {
    {
      SubLObject fort = fi_canonicalize_el_term(el_term);
      if ((NIL == forts.fort_p(fort))) {
        signal_fi_error(list($kw33$ARG_ERROR, $str238$Expected_a_term__got__S, el_term));
        return NIL;
      }
      return fort;
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 103899) 
  public static final SubLObject fi_canonicalize_el_term(SubLObject el_term) {
    el_term = canon_tl.transform_tl_terms_to_hl(el_term);
    if ((NIL != hlmt.fort_or_chlmt_p(el_term))) {
      return el_term;
    } else if ((NIL != el_utilities.possibly_naut_p(el_term))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10341");
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 104145) 
  public static final SubLObject fi_canonicalize(SubLObject canon_info, SubLObject canon_gaf, SubLObject strength) {
    if ((canon_gaf == UNPROVIDED)) {
      canon_gaf = NIL;
    }
    if ((strength == UNPROVIDED)) {
      strength = $kw107$DEFAULT;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cnf = canon_info.first();
        SubLObject v_variables = Mapping.mapcar(Symbols.symbol_function($sym239$CAR), conses_high.second(canon_info));
        SubLObject hl_tv = NIL;
        if ((NIL != control_vars.$within_assert$.getDynamicValue(thread))) {
          checkType(Mapping.mapcar(Symbols.symbol_function($sym240$CDR), conses_high.second(canon_info)), $sym241$KB_VAR_LIST_);
        }
        if (((NIL != canon_gaf)
             && (NIL != clauses.atomic_clause_p(cnf))
             && (NIL == v_variables))) {
          if ((NIL == clauses.neg_lits(cnf))) {
            hl_tv = ((strength == $kw57$MONOTONIC) ? ((SubLObject) $kw242$TRUE_MON) : $kw243$TRUE_DEF);
          } else {
            ConsesLow.rplaca(cnf.rest(), clauses.neg_lits(cnf));
            ConsesLow.rplaca(cnf, NIL);
            hl_tv = ((strength == $kw57$MONOTONIC) ? ((SubLObject) $kw244$FALSE_MON) : $kw245$FALSE_DEF);
          }
        } else {
          hl_tv = ((strength == $kw57$MONOTONIC) ? ((SubLObject) $kw242$TRUE_MON) : $kw243$TRUE_DEF);
        }
        return Values.values(cnf, v_variables, hl_tv);
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 105699) 
  private static SubLSymbol $cached_fi_canonicalize_gaf_caching_state$ = null;

  @SubL(source = "cycl/fi.lisp", position = 106583) 
  private static SubLSymbol $assertion_fi_formula_mt_scope$ = null;

  /** Return the formula for ASSERTION which is suitable for the FI.
If SUBSTITUTE-VARS? is non-nil, then the original variable names are substituted as well. */
  @SubL(source = "cycl/fi.lisp", position = 106794) 
  public static final SubLObject assertion_fi_formula(SubLObject assertion, SubLObject substitute_varsP) {
    if ((substitute_varsP == UNPROVIDED)) {
      substitute_varsP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject scope_mt = $assertion_fi_formula_mt_scope$.getDynamicValue(thread);
        SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject formula = NIL;
        if (((NIL != scope_mt)
             && (NIL == hlmt.hlmt_equal(mt, scope_mt)))) {
          formula = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31010");
        } else {
          formula = assertions_high.assertion_formula(assertion);
        }
        formula = conses_high.copy_tree(formula);
        {
          SubLObject _prev_bind_0 = $assertion_fi_formula_mt_scope$.currentBinding(thread);
          try {
            $assertion_fi_formula_mt_scope$.bind(mt, thread);
            formula = perform_fi_substitutions(formula, ((NIL != substitute_varsP) ? ((SubLObject) assertions_high.assertion_el_variables(assertion)) : NIL));
          } finally {
            $assertion_fi_formula_mt_scope$.rebind(_prev_bind_0, thread);
          }
        }
        return formula;
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 107571) 
  public static final SubLObject assertion_hl_formula(SubLObject assertion, SubLObject substitute_varsP) {
    if ((substitute_varsP == UNPROVIDED)) {
      substitute_varsP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym83$ASSERTION_P);
      {
        SubLObject formula = NIL;
        {
          SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
          try {
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            formula = assertion_fi_formula(assertion, substitute_varsP);
          } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
          }
        }
        return formula;
      }
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 108986) 
  public static final SubLObject perform_fi_substitutions(SubLObject object, SubLObject symbol_variables) {
    if ((symbol_variables == UNPROVIDED)) {
      symbol_variables = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cdolist_list_var = symbol_variables;
        SubLObject symbol = NIL;
        for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
          {
            SubLObject variable = variables.find_variable_by_id(Sequences.position(symbol, symbol_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            object = conses_high.nsubst(symbol, variable, object, UNPROVIDED, UNPROVIDED);
          }
        }
      }
      object = transform_list_utilities.ntransform(object, Symbols.symbol_function($sym252$VARIABLE_P), Symbols.symbol_function($sym253$DEFAULT_EL_VAR_FOR_HL_VAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL != api_control_vars.$generate_readable_fi_results$.getDynamicValue(thread))) {
        object = assertion_expand(object);
        object = narts_high.nart_expand(object);
      }
      return object;
    }
  }

  @SubL(source = "cycl/fi.lisp", position = 109719) 
  public static final SubLObject assertion_expand(SubLObject object) {
    if ((NIL != list_utilities.tree_find_if(Symbols.symbol_function($sym83$ASSERTION_P), object, UNPROVIDED))) {
      object = transform_list_utilities.transform(object, Symbols.symbol_function($sym83$ASSERTION_P), Symbols.symbol_function($sym106$ASSERTION_FI_FORMULA), UNPROVIDED);
    }
    return object;
  }

  public static final SubLObject declare_fi_file() {
    declareFunction(myName, "reset_fi_error_state", "RESET-FI-ERROR-STATE", 0, 0, false);
    //declareMacro(myName, "with_clean_fi_error_state", "WITH-CLEAN-FI-ERROR-STATE");
    declareFunction(myName, "reset_fi_warning", "RESET-FI-WARNING", 0, 0, false);
    declareFunction(myName, "signal_fi_warning", "SIGNAL-FI-WARNING", 1, 0, false);
    //declareFunction(myName, "fi_warning_signaledP", "FI-WARNING-SIGNALED?", 0, 0, false);
    //declareFunction(myName, "fi_get_warning_int", "FI-GET-WARNING-INT", 0, 0, false);
    declareFunction(myName, "reset_fi_error", "RESET-FI-ERROR", 0, 0, false);
    declareFunction(myName, "signal_fi_error", "SIGNAL-FI-ERROR", 1, 0, false);
    declareFunction(myName, "fi_error_signaledP", "FI-ERROR-SIGNALED?", 0, 0, false);
    //declareFunction(myName, "fi_get_error_int", "FI-GET-ERROR-INT", 0, 0, false);
    //declareFunction(myName, "fi_error_string", "FI-ERROR-STRING", 1, 0, false);
    //declareFunction(myName, "fi_get_error_string_int", "FI-GET-ERROR-STRING-INT", 0, 0, false);
    //declareMacro(myName, "within_fi_operation", "WITHIN-FI-OPERATION");
    //declareFunction(myName, "already_within_fi_operationP", "ALREADY-WITHIN-FI-OPERATION?", 0, 0, false);
    //declareFunction(myName, "fi", "FI", 1, 8, false);
    //declareFunction(myName, "fi_1", "FI-1", 3, 0, false);
    //declareFunction(myName, "possibly_add_to_transcript_queues", "POSSIBLY-ADD-TO-TRANSCRIPT-QUEUES", 1, 0, false);
    //declareFunction(myName, "safe_fi", "SAFE-FI", 1, 8, false);
    //declareFunction(myName, "fi_get_warning", "FI-GET-WARNING", 0, 0, false);
    //declareFunction(myName, "fi_get_error", "FI-GET-ERROR", 0, 0, false);
    //declareFunction(myName, "fi_find", "FI-FIND", 1, 0, false);
    declareFunction(myName, "fi_find_int", "FI-FIND-INT", 1, 0, false);
    //declareFunction(myName, "fi_complete", "FI-COMPLETE", 1, 1, false);
    //declareFunction(myName, "fi_complete_int", "FI-COMPLETE-INT", 1, 1, false);
    //declareFunction(myName, "fi_create", "FI-CREATE", 1, 1, false);
    declareFunction(myName, "fi_create_int", "FI-CREATE-INT", 1, 1, false);
    //declareFunction(myName, "handle_id_clash", "HANDLE-ID-CLASH", 2, 0, false);
    //declareFunction(myName, "fi_find_or_create", "FI-FIND-OR-CREATE", 1, 1, false);
    //declareFunction(myName, "fi_find_or_create_int", "FI-FIND-OR-CREATE-INT", 1, 1, false);
    //declareFunction(myName, "fi_create_skolem", "FI-CREATE-SKOLEM", 5, 0, false);
    //declareFunction(myName, "fi_create_skolem_int", "FI-CREATE-SKOLEM-INT", 4, 1, false);
    //declareFunction(myName, "fi_skolem_assert_arg_isas", "FI-SKOLEM-ASSERT-ARG-ISAS", 4, 0, false);
    //declareFunction(myName, "fi_skolem_assert_result_types", "FI-SKOLEM-ASSERT-RESULT-TYPES", 3, 0, false);
    //declareFunction(myName, "new_skolem_name", "NEW-SKOLEM-NAME", 1, 0, false);
    //declareFunction(myName, "fi_merge", "FI-MERGE", 2, 0, false);
    //declareFunction(myName, "fi_merge_int", "FI-MERGE-INT", 2, 0, false);
    //declareFunction(myName, "merge_fort_recursive", "MERGE-FORT-RECURSIVE", 2, 0, false);
    //declareFunction(myName, "merge_dependent_narts", "MERGE-DEPENDENT-NARTS", 2, 0, false);
    //declareFunction(myName, "merge_dependent_kb_hl_supports", "MERGE-DEPENDENT-KB-HL-SUPPORTS", 2, 0, false);
    //declareFunction(myName, "substitute_assertion", "SUBSTITUTE-ASSERTION", 4, 0, false);
    //declareFunction(myName, "substitute_asserted_argument", "SUBSTITUTE-ASSERTED-ARGUMENT", 4, 0, false);
    //declareFunction(myName, "substitute_deduction", "SUBSTITUTE-DEDUCTION", 6, 0, false);
    //declareFunction(myName, "substitute_dependents", "SUBSTITUTE-DEPENDENTS", 5, 0, false);
    //declareFunction(myName, "substitute_dependent_assertion", "SUBSTITUTE-DEPENDENT-ASSERTION", 4, 0, false);
    //declareFunction(myName, "substitute_termofunit_assertion", "SUBSTITUTE-TERMOFUNIT-ASSERTION", 4, 0, false);
    //declareFunction(myName, "make_merge_fort_assertion_map", "MAKE-MERGE-FORT-ASSERTION-MAP", 1, 0, false);
    //declareFunction(myName, "merge_fort_assertion_map_validP", "MERGE-FORT-ASSERTION-MAP-VALID?", 0, 0, false);
    //declareFunction(myName, "add_merge_fort_assertion_mapping", "ADD-MERGE-FORT-ASSERTION-MAPPING", 3, 0, false);
    //declareFunction(myName, "get_merge_fort_assertion_mapping", "GET-MERGE-FORT-ASSERTION-MAPPING", 1, 0, false);
    //declareFunction(myName, "fi_kill", "FI-KILL", 1, 0, false);
    declareFunction(myName, "fi_kill_int", "FI-KILL-INT", 1, 0, false);
    //declareFunction(myName, "fi_rename", "FI-RENAME", 2, 0, false);
    declareFunction(myName, "fi_rename_int", "FI-RENAME-INT", 2, 0, false);
    //declareFunction(myName, "fi_lookup", "FI-LOOKUP", 2, 0, false);
    //declareFunction(myName, "fi_lookup_int", "FI-LOOKUP-INT", 2, 0, false);
    //declareFunction(myName, "sentence_assertions_in_mt", "SENTENCE-ASSERTIONS-IN-MT", 3, 0, false);
    //declareFunction(myName, "sentence_assertions", "SENTENCE-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "sentence_visible_assertions", "SENTENCE-VISIBLE-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "sentence_assertions_in_any_mt", "SENTENCE-ASSERTIONS-IN-ANY-MT", 1, 0, false);
    //declareFunction(myName, "sentence_assertion", "SENTENCE-ASSERTION", 2, 0, false);
    //declareFunction(myName, "gaf_sentence_assertion", "GAF-SENTENCE-ASSERTION", 2, 0, false);
    //declareFunction(myName, "fi_assert", "FI-ASSERT", 2, 2, false);
    declareFunction(myName, "fi_assert_int", "FI-ASSERT-INT", 2, 2, false);
    declareFunction(myName, "perform_assert_post_processing", "PERFORM-ASSERT-POST-PROCESSING", 2, 0, false);
    //declareFunction(myName, "perform_assert_post_processing_for_skolem", "PERFORM-ASSERT-POST-PROCESSING-FOR-SKOLEM", 2, 0, false);
    //declareFunction(myName, "fi_perform_assert_post_processing_for_skolem", "FI-PERFORM-ASSERT-POST-PROCESSING-FOR-SKOLEM", 2, 0, false);
    declareFunction(myName, "fi_cnf_default_direction", "FI-CNF-DEFAULT-DIRECTION", 1, 0, false);
    //declareFunction(myName, "fi_not_wff_error", "FI-NOT-WFF-ERROR", 2, 0, false);
    declareFunction(myName, "fi_not_wff_assert_error", "FI-NOT-WFF-ASSERT-ERROR", 2, 0, false);
    declareFunction(myName, "fi_assert_update_asserted_argument", "FI-ASSERT-UPDATE-ASSERTED-ARGUMENT", 3, 0, false);
    declareFunction(myName, "hl_assert_update_asserted_argument", "HL-ASSERT-UPDATE-ASSERTED-ARGUMENT", 3, 0, false);
    //declareFunction(myName, "fi_reassert", "FI-REASSERT", 4, 0, false);
    //declareFunction(myName, "fi_reassert_int", "FI-REASSERT-INT", 4, 0, false);
    //declareFunction(myName, "fi_reassert_hl_tv", "FI-REASSERT-HL-TV", 2, 0, false);
    //declareFunction(myName, "fi_rededuce_deduction_assertion", "FI-REDEDUCE-DEDUCTION-ASSERTION", 2, 0, false);
    //declareFunction(myName, "fi_unassert", "FI-UNASSERT", 2, 0, false);
    declareFunction(myName, "fi_unassert_int", "FI-UNASSERT-INT", 2, 0, false);
    declareFunction(myName, "canonicalize_fi_unassert_sentence", "CANONICALIZE-FI-UNASSERT-SENTENCE", 2, 0, false);
    //declareFunction(myName, "canonicalize_fi_blast_sentence", "CANONICALIZE-FI-BLAST-SENTENCE", 2, 0, false);
    declareFunction(myName, "canonicalize_fi_remove_sentence", "CANONICALIZE-FI-REMOVE-SENTENCE", 3, 0, false);
    declareFunction(myName, "canonicalize_unassert_hlmt", "CANONICALIZE-UNASSERT-HLMT", 1, 0, false);
    //declareFunction(myName, "fi_edit", "FI-EDIT", 2, 4, false);
    //declareFunction(myName, "fi_edit_int", "FI-EDIT-INT", 2, 4, false);
    //declareFunction(myName, "careful_fi_edit_int", "CAREFUL-FI-EDIT-INT", 2, 4, false);
    //declareFunction(myName, "fi_justify", "FI-JUSTIFY", 2, 1, false);
    //declareFunction(myName, "fi_justify_int", "FI-JUSTIFY-INT", 2, 1, false);
    //declareFunction(myName, "formula_justify", "FORMULA-JUSTIFY", 2, 1, false);
    //declareFunction(myName, "gaf_justify", "GAF-JUSTIFY", 3, 0, false);
    //declareFunction(myName, "one_step_gaf_justify", "ONE-STEP-GAF-JUSTIFY", 2, 0, false);
    //declareFunction(myName, "justify_support", "JUSTIFY-SUPPORT", 1, 0, false);
    //declareFunction(myName, "fi_add_argument", "FI-ADD-ARGUMENT", 3, 2, false);
    //declareFunction(myName, "fi_add_argument_int", "FI-ADD-ARGUMENT-INT", 3, 2, false);
    //declareFunction(myName, "convert_hl_support_to_el_support", "CONVERT-HL-SUPPORT-TO-EL-SUPPORT", 1, 0, false);
    //declareFunction(myName, "convert_hl_support_to_fi_support", "CONVERT-HL-SUPPORT-TO-FI-SUPPORT", 1, 0, false);
    //declareFunction(myName, "convert_hl_support_to_tl_support", "CONVERT-HL-SUPPORT-TO-TL-SUPPORT", 1, 0, false);
    //declareFunction(myName, "make_el_support", "MAKE-EL-SUPPORT", 2, 2, false);
    //declareFunction(myName, "fi_canonicalize_el_supports", "FI-CANONICALIZE-EL-SUPPORTS", 1, 1, false);
    //declareFunction(myName, "el_support_assertions", "EL-SUPPORT-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "fi_remove_argument", "FI-REMOVE-ARGUMENT", 3, 1, false);
    //declareFunction(myName, "fi_remove_argument_int", "FI-REMOVE-ARGUMENT-INT", 3, 1, false);
    //declareFunction(myName, "fi_blast", "FI-BLAST", 2, 0, false);
    //declareFunction(myName, "fi_blast_int", "FI-BLAST-INT", 2, 0, false);
    //declareFunction(myName, "fi_ask", "FI-ASK", 1, 5, false);
    //declareFunction(myName, "fi_ask_int", "FI-ASK-INT", 1, 5, false);
    //declareFunction(myName, "fi_ask_ist_query_p", "FI-ASK-IST-QUERY-P", 1, 0, false);
    //declareFunction(myName, "fi_ask_int_new_cyc_query_trampoline", "FI-ASK-INT-NEW-CYC-QUERY-TRAMPOLINE", 6, 0, false);
    //declareFunction(myName, "fi_continue_last_ask", "FI-CONTINUE-LAST-ASK", 0, 5, false);
    //declareFunction(myName, "fi_continue_last_ask_int", "FI-CONTINUE-LAST-ASK-INT", 0, 5, false);
    //declareFunction(myName, "fi_ask_status", "FI-ASK-STATUS", 0, 0, false);
    //declareFunction(myName, "fi_ask_status_int", "FI-ASK-STATUS-INT", 0, 0, false);
    //declareFunction(myName, "fi_tms_reconsider_formula", "FI-TMS-RECONSIDER-FORMULA", 2, 0, false);
    //declareFunction(myName, "fi_tms_reconsider_formula_int", "FI-TMS-RECONSIDER-FORMULA-INT", 2, 0, false);
    //declareFunction(myName, "fi_tms_reconsider_mt", "FI-TMS-RECONSIDER-MT", 1, 0, false);
    //declareFunction(myName, "fi_tms_reconsider_mt_int", "FI-TMS-RECONSIDER-MT-INT", 1, 0, false);
    //declareFunction(myName, "fi_tms_reconsider_gafs", "FI-TMS-RECONSIDER-GAFS", 1, 3, false);
    //declareFunction(myName, "fi_tms_reconsider_gafs_int", "FI-TMS-RECONSIDER-GAFS-INT", 1, 3, false);
    //declareFunction(myName, "fi_tms_reconsider_term", "FI-TMS-RECONSIDER-TERM", 1, 1, false);
    //declareFunction(myName, "fi_tms_reconsider_term_int", "FI-TMS-RECONSIDER-TERM-INT", 1, 1, false);
    //declareFunction(myName, "fi_timestamp_constant", "FI-TIMESTAMP-CONSTANT", 2, 2, false);
    declareFunction(myName, "fi_timestamp_constant_int", "FI-TIMESTAMP-CONSTANT-INT", 2, 2, false);
    declareFunction(myName, "constant_timestampedP", "CONSTANT-TIMESTAMPED?", 1, 0, false);
    declareFunction(myName, "timestamp_constant", "TIMESTAMP-CONSTANT", 3, 2, false);
    //declareFunction(myName, "untimestamp_constant", "UNTIMESTAMP-CONSTANT", 1, 0, false);
    //declareFunction(myName, "retimestamp_constant", "RETIMESTAMP-CONSTANT", 3, 2, false);
    //declareFunction(myName, "fi_timestamp_assertion", "FI-TIMESTAMP-ASSERTION", 2, 2, false);
    declareFunction(myName, "fi_timestamp_assertion_int", "FI-TIMESTAMP-ASSERTION-INT", 2, 2, false);
    //declareFunction(myName, "fi_remove_timestamp", "FI-REMOVE-TIMESTAMP", 1, 1, false);
    //declareFunction(myName, "fi_remove_timestamp_int", "FI-REMOVE-TIMESTAMP-INT", 2, 0, false);
    //declareFunction(myName, "fi_rename_variables", "FI-RENAME-VARIABLES", 2, 1, false);
    //declareFunction(myName, "fi_rename_variables_int", "FI-RENAME-VARIABLES-INT", 2, 1, false);
    //declareFunction(myName, "fi_get_parameter", "FI-GET-PARAMETER", 1, 0, false);
    //declareFunction(myName, "fi_get_parameter_int", "FI-GET-PARAMETER-INT", 1, 0, false);
    //declareFunction(myName, "fi_set_parameter", "FI-SET-PARAMETER", 2, 0, false);
    //declareFunction(myName, "fi_set_parameter_int", "FI-SET-PARAMETER-INT", 2, 0, false);
    //declareFunction(myName, "fi_eval", "FI-EVAL", 1, 0, false);
    //declareFunction(myName, "fi_eval_int", "FI-EVAL-INT", 1, 0, false);
    //declareFunction(myName, "fi_local_eval", "FI-LOCAL-EVAL", 1, 0, false);
    //declareFunction(myName, "fi_local_eval_int", "FI-LOCAL-EVAL-INT", 1, 0, false);
    declareFunction(myName, "ke_purpose", "KE-PURPOSE", 0, 0, false);
    //declareFunction(myName, "set_ke_purpose", "SET-KE-PURPOSE", 1, 0, false);
    declareFunction(myName, "the_date", "THE-DATE", 0, 0, false);
    declareFunction(myName, "the_second", "THE-SECOND", 0, 0, false);
    declareFunction(myName, "fi_convert_to_assert_hlmt", "FI-CONVERT-TO-ASSERT-HLMT", 1, 0, false);
    //declareFunction(myName, "fi_convert_to_ask_hlmt", "FI-CONVERT-TO-ASK-HLMT", 1, 0, false);
    declareFunction(myName, "fi_convert_to_fort", "FI-CONVERT-TO-FORT", 1, 0, false);
    declareFunction(myName, "fi_canonicalize_el_term", "FI-CANONICALIZE-EL-TERM", 1, 0, false);
    declareFunction(myName, "fi_canonicalize", "FI-CANONICALIZE", 1, 2, false);
    //declareFunction(myName, "fi_canonicalize_gaf", "FI-CANONICALIZE-GAF", 2, 0, false);
    //declareFunction(myName, "clear_cached_fi_canonicalize_gaf", "CLEAR-CACHED-FI-CANONICALIZE-GAF", 0, 0, false);
    //declareFunction(myName, "remove_cached_fi_canonicalize_gaf", "REMOVE-CACHED-FI-CANONICALIZE-GAF", 2, 0, false);
    //declareFunction(myName, "cached_fi_canonicalize_gaf_internal", "CACHED-FI-CANONICALIZE-GAF-INTERNAL", 2, 0, false);
    //declareFunction(myName, "cached_fi_canonicalize_gaf", "CACHED-FI-CANONICALIZE-GAF", 2, 0, false);
    //declareFunction(myName, "fi_canonicalize_literal", "FI-CANONICALIZE-LITERAL", 2, 0, false);
    //declareFunction(myName, "fi_canonicalize_ask", "FI-CANONICALIZE-ASK", 1, 0, false);
    //declareFunction(myName, "kb_var_listP", "KB-VAR-LIST?", 1, 0, false);
    declareFunction(myName, "assertion_fi_formula", "ASSERTION-FI-FORMULA", 1, 1, false);
    declareFunction(myName, "assertion_hl_formula", "ASSERTION-HL-FORMULA", 1, 1, false);
    //declareFunction(myName, "assertion_fi_ist_formula", "ASSERTION-FI-IST-FORMULA", 1, 1, false);
    //declareFunction(myName, "assertion_fi_cnf", "ASSERTION-FI-CNF", 1, 1, false);
    //declareFunction(myName, "assertion_cnf_with_el_vars", "ASSERTION-CNF-WITH-EL-VARS", 1, 0, false);
    declareFunction(myName, "perform_fi_substitutions", "PERFORM-FI-SUBSTITUTIONS", 1, 1, false);
    declareFunction(myName, "assertion_expand", "ASSERTION-EXPAND", 1, 0, false);
    //declareFunction(myName, "assertion_ist_expand", "ASSERTION-IST-EXPAND", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_fi_file() {
    $fi_dispatch_table$ = deflexical("*FI-DISPATCH-TABLE*", $list0);
    $fi_warning$ = defparameter("*FI-WARNING*", NIL);
    $fi_error$ = defparameter("*FI-ERROR*", NIL);
    $fi_last_constant$ = defparameter("*FI-LAST-CONSTANT*", NIL);
    $fi_last_assertions_asserted$ = defparameter("*FI-LAST-ASSERTIONS-ASSERTED*", NIL);
    $within_fi_operationP$ = defparameter("*WITHIN-FI-OPERATION?*", NIL);
    $current_fi_op$ = defparameter("*CURRENT-FI-OP*", NIL);
    $merge_fort_assertion_map$ = defparameter("*MERGE-FORT-ASSERTION-MAP*", NIL);
    $assume_assert_sentence_is_wfP$ = defparameter("*ASSUME-ASSERT-SENTENCE-IS-WF?*", NIL);
    $generate_precise_fi_wff_errorsP$ = defparameter("*GENERATE-PRECISE-FI-WFF-ERRORS?*", T);
    $the_date$ = defparameter("*THE-DATE*", NIL);
    $the_second$ = defparameter("*THE-SECOND*", NIL);
    $cached_fi_canonicalize_gaf_caching_state$ = deflexical("*CACHED-FI-CANONICALIZE-GAF-CACHING-STATE*", NIL);
    $assertion_fi_formula_mt_scope$ = defparameter("*ASSERTION-FI-FORMULA-MT-SCOPE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_fi_file() {
    // CVS_ID("Id: fi.lisp 127877 2009-05-27 15:07:45Z pace ");
    {
      SubLObject item_var = $sym3$_FI_WARNING_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$fi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$fi_state_variables$.getGlobalValue()));
      }
    }
    {
      SubLObject item_var = $sym4$_FI_ERROR_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$fi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$fi_state_variables$.getGlobalValue()));
      }
    }
    {
      SubLObject item_var = $sym7$_FI_LAST_CONSTANT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$fi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$fi_state_variables$.getGlobalValue()));
      }
    }
    {
      SubLObject item_var = $sym8$_FI_LAST_ASSERTIONS_ASSERTED_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$fi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$fi_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.register_cyc_api_function($sym22$FI_GET_WARNING, NIL, $str23$Return_a_description_of_the_warni, NIL, $list24);
    utilities_macros.register_cyc_api_function($sym26$FI_GET_ERROR, NIL, $str27$Return_a_description_of_the_error, NIL, $list24);
    utilities_macros.register_cyc_api_function($sym29$FI_FIND, $list30, $str31$Return_the_constant_indentified_b, NIL, $list32);
    utilities_macros.register_cyc_api_function($sym38$FI_COMPLETE, $list39, $str40$Return_a_list_of_constants_whose_, NIL, $list41);
    utilities_macros.register_cyc_api_function($sym14$FI_CREATE, $list43, $str44$Create_a_new_constant_with_NAME__, NIL, $list45);
    utilities_macros.register_cyc_api_function($sym15$FI_FIND_OR_CREATE, $list43, $str53$Return_constant_with_NAME_if_it_i, NIL, $list45);
    utilities_macros.register_cyc_api_function($sym88$FI_KILL, $list89, $str90$Kill_FORT_and_all_its_uses_from_t, NIL, $list91);
    utilities_macros.register_cyc_api_function($sym94$FI_RENAME, $list95, $str96$Change_name_of_CONSTANT_to_NAME__, NIL, $list32);
    utilities_macros.register_cyc_api_function($sym101$FI_LOOKUP, $list102, $str103$Returns_two_values_when_looking_u, NIL, $list104);
    utilities_macros.register_cyc_api_function($sym109$FI_ASSERT, $list110, $str111$Assert_the_FORMULA_in_the_specifi, NIL, $list91);
    utilities_macros.register_cyc_api_function($sym142$FI_UNASSERT, $list102, $str143$Remove_the_assertions_canonicaliz, NIL, $list91);
    utilities_macros.register_cyc_api_function($sym150$FI_EDIT, $list151, $str152$Unassert_the_assertions_canonical, NIL, $list91);
    utilities_macros.register_cyc_api_function($sym170$FI_BLAST, $list102, $str171$Remove_all_arguments_for_the_FORM, NIL, $list91);
    utilities_macros.register_cyc_api_function($sym173$FI_ASK, $list174, $str175$Ask_for_bindings_for_free_variabl, NIL, $list176);
    utilities_macros.register_obsolete_cyc_api_function($sym182$FI_CONTINUE_LAST_ASK, $list183, $list184, $str185$Continue_the_last_ask_that_was_pe, NIL, $list176);
    access_macros.define_obsolete_register($sym186$FI_CONTINUE_LAST_ASK_INT, $list183);
    utilities_macros.register_obsolete_cyc_api_function($sym189$FI_ASK_STATUS, $list190, NIL, $str191$Return_a_status_as_to_how_the_las, NIL, $list24);
    access_macros.define_obsolete_register($sym192$FI_ASK_STATUS_INT, $list190);
    utilities_macros.register_cyc_api_function($sym195$FI_TMS_RECONSIDER_FORMULA, $list102, $str196$Reconsider_all_arguments_for_FORM, NIL, $list91);
    utilities_macros.register_cyc_api_function($sym198$FI_TMS_RECONSIDER_MT, $list199, $str200$Reconsider_all_arguments_for_all_, NIL, $list91);
    utilities_macros.register_cyc_api_function($sym202$FI_TMS_RECONSIDER_GAFS, $list203, $str204$Reconsider_all_arguments_for_all_, NIL, $list91);
    utilities_macros.register_cyc_api_function($sym207$FI_TMS_RECONSIDER_TERM, $list208, $str209$Reconsider_all_arguments_involvin, NIL, $list91);
    memoization_state.note_globally_cached_function($sym246$CACHED_FI_CANONICALIZE_GAF);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(new SubLObject[] {list(makeKeyword("GET-WARNING"), makeSymbol("FI-GET-WARNING"), makeSymbol("FI-GET-WARNING-INT"), NIL), list(makeKeyword("GET-ERROR"), makeSymbol("FI-GET-ERROR"), makeSymbol("FI-GET-ERROR-INT"), NIL), list(makeKeyword("FIND"), makeSymbol("FI-FIND"), makeSymbol("FI-FIND-INT"), NIL), list(makeKeyword("COMPLETE"), makeSymbol("FI-COMPLETE"), makeSymbol("FI-COMPLETE-INT"), NIL), list(makeKeyword("CREATE"), makeSymbol("FI-CREATE"), makeSymbol("FI-CREATE-INT"), T), list(makeKeyword("FIND-OR-CREATE"), makeSymbol("FI-FIND-OR-CREATE"), makeSymbol("FI-FIND-OR-CREATE-INT"), T), list(makeKeyword("CREATE-SKOLEM"), makeSymbol("FI-CREATE-SKOLEM"), makeSymbol("FI-CREATE-SKOLEM-INT"), T), list(makeKeyword("MERGE"), makeSymbol("FI-MERGE"), makeSymbol("FI-MERGE-INT"), T), list(makeKeyword("KILL"), makeSymbol("FI-KILL"), makeSymbol("FI-KILL-INT"), T), list(makeKeyword("RENAME"), makeSymbol("FI-RENAME"), makeSymbol("FI-RENAME-INT"), T), list(makeKeyword("LOOKUP"), makeSymbol("FI-LOOKUP"), makeSymbol("FI-LOOKUP-INT"), NIL), list(makeKeyword("ASSERT"), makeSymbol("FI-ASSERT"), makeSymbol("FI-ASSERT-INT"), T), list(makeKeyword("REASSERT"), makeSymbol("FI-REASSERT"), makeSymbol("FI-REASSERT-INT"), T), list(makeKeyword("UNASSERT"), makeSymbol("FI-UNASSERT"), makeSymbol("FI-UNASSERT-INT"), T), list(makeKeyword("EDIT"), makeSymbol("FI-EDIT"), makeSymbol("FI-EDIT-INT"), T), list(makeKeyword("RENAME-VARIABLES"), makeSymbol("FI-RENAME-VARIABLES"), makeSymbol("FI-RENAME-VARIABLES-INT"), T), list(makeKeyword("JUSTIFY"), makeSymbol("FI-JUSTIFY"), makeSymbol("FI-JUSTIFY-INT"), NIL), list(makeKeyword("ADD-ARGUMENT"), makeSymbol("FI-ADD-ARGUMENT"), makeSymbol("FI-ADD-ARGUMENT-INT"), T), list(makeKeyword("REMOVE-ARGUMENT"), makeSymbol("FI-REMOVE-ARGUMENT"), makeSymbol("FI-REMOVE-ARGUMENT-INT"), T), list(makeKeyword("BLAST"), makeSymbol("FI-BLAST"), makeSymbol("FI-BLAST-INT"), T), list(makeKeyword("ASK"), makeSymbol("FI-ASK"), makeSymbol("FI-ASK-INT"), T), list(makeKeyword("CONTINUE-LAST-ASK"), makeSymbol("FI-CONTINUE-LAST-ASK"), makeSymbol("FI-CONTINUE-LAST-ASK-INT"), T), list(makeKeyword("ASK-STATUS"), makeSymbol("FI-ASK-STATUS"), makeSymbol("FI-ASK-STATUS-INT"), NIL), list(makeKeyword("TMS-RECONSIDER-FORMULA"), makeSymbol("FI-TMS-RECONSIDER-FORMULA"), makeSymbol("FI-TMS-RECONSIDER-FORMULA-INT"), T), list(makeKeyword("TMS-RECONSIDER-MT"), makeSymbol("FI-TMS-RECONSIDER-MT"), makeSymbol("FI-TMS-RECONSIDER-MT-INT"), T), list(makeKeyword("TMS-RECONSIDER-GAFS"), makeSymbol("FI-TMS-RECONSIDER-GAFS"), makeSymbol("FI-TMS-RECONSIDER-GAFS-INT"), T), list(makeKeyword("TMS-RECONSIDER-TERM"), makeSymbol("FI-TMS-RECONSIDER-TERM"), makeSymbol("FI-TMS-RECONSIDER-TERM-INT"), T), list(makeKeyword("HYPOTHESIZE"), makeSymbol("FI-HYPOTHESIZE"), makeSymbol("FI-HYPOTHESIZE-INT"), T), list(makeKeyword("PROVE"), makeSymbol("FI-PROVE"), makeSymbol("FI-PROVE-INT"), T), list(makeKeyword("TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-CONSTANT-INT"), T), list(makeKeyword("TIMESTAMP-ASSERTION"), makeSymbol("FI-TIMESTAMP-ASSERTION"), makeSymbol("FI-TIMESTAMP-ASSERTION-INT"), T), list(makeKeyword("REMOVE-TIMESTAMP"), makeSymbol("FI-REMOVE-TIMESTAMP"), makeSymbol("FI-REMOVE-TIMESTAMP-INT"), T), list(makeKeyword("GET-PARAMETER"), makeSymbol("FI-GET-PARAMETER"), makeSymbol("FI-GET-PARAMETER-INT"), NIL), list(makeKeyword("SET-PARAMETER"), makeSymbol("FI-SET-PARAMETER"), makeSymbol("FI-SET-PARAMETER-INT"), T), list(makeKeyword("EVAL"), makeSymbol("FI-EVAL"), makeSymbol("FI-EVAL-INT"), T), list(makeKeyword("LOCAL-EVAL"), makeSymbol("FI-LOCAL-EVAL"), makeSymbol("FI-LOCAL-EVAL-INT"), NIL)});
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLList $list2 = list(list(makeSymbol("*FI-ERROR*"), NIL), list(makeSymbol("*FI-WARNING*"), NIL));
  public static final SubLSymbol $sym3$_FI_WARNING_ = makeSymbol("*FI-WARNING*");
  public static final SubLSymbol $sym4$_FI_ERROR_ = makeSymbol("*FI-ERROR*");
  public static final SubLSymbol $sym5$FORMAT = makeSymbol("FORMAT");
  public static final SubLString $str6$_S = makeString("~S");
  public static final SubLSymbol $sym7$_FI_LAST_CONSTANT_ = makeSymbol("*FI-LAST-CONSTANT*");
  public static final SubLSymbol $sym8$_FI_LAST_ASSERTIONS_ASSERTED_ = makeSymbol("*FI-LAST-ASSERTIONS-ASSERTED*");
  public static final SubLList $list9 = list(list(makeSymbol("*WITHIN-FI-OPERATION?*"), T));
  public static final SubLList $list10 = list(makeSymbol("FUN"), makeSymbol("INT-FUN"), makeSymbol("MODIFIES-KB?"));
  public static final SubLSymbol $sym11$QUOTE = makeSymbol("QUOTE");
  public static final SubLString $str12$Bad_function_call_____FI__s__s__s = makeString("Bad function call -> (FI ~s ~s ~s ~s ~s ~s ~s ~s ~s)\n~%A function for ~s is missing from *fi-dispatch-table*");
  public static final SubLSymbol $kw13$QUEUED = makeKeyword("QUEUED");
  public static final SubLSymbol $sym14$FI_CREATE = makeSymbol("FI-CREATE");
  public static final SubLSymbol $sym15$FI_FIND_OR_CREATE = makeSymbol("FI-FIND-OR-CREATE");
  public static final SubLList $list16 = list(makeSymbol("FUNC"), makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));
  public static final SubLList $list17 = list(makeSymbol("QUOTE"), NIL);
  public static final SubLSymbol $sym18$FI_HYPOTHESIZE = makeSymbol("FI-HYPOTHESIZE");
  public static final SubLList $list19 = list(makeSymbol("FUNC"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NAME-PREFIX"), makeString("HYP")), makeSymbol("TERM-EXTERNAL-IDS"));
  public static final SubLString $str20$HYP = makeString("HYP");
  public static final SubLSymbol $kw21$GET_WARNING = makeKeyword("GET-WARNING");
  public static final SubLSymbol $sym22$FI_GET_WARNING = makeSymbol("FI-GET-WARNING");
  public static final SubLString $str23$Return_a_description_of_the_warni = makeString("Return a description of the warning resulting from the last FI operation.");
  public static final SubLList $list24 = list(list(makeSymbol("NIL-OR"), makeSymbol("ATOM")));
  public static final SubLSymbol $kw25$GET_ERROR = makeKeyword("GET-ERROR");
  public static final SubLSymbol $sym26$FI_GET_ERROR = makeSymbol("FI-GET-ERROR");
  public static final SubLString $str27$Return_a_description_of_the_error = makeString("Return a description of the error resulting from the last FI operation.");
  public static final SubLSymbol $kw28$FIND = makeKeyword("FIND");
  public static final SubLSymbol $sym29$FI_FIND = makeSymbol("FI-FIND");
  public static final SubLList $list30 = list(makeSymbol("NAME"));
  public static final SubLString $str31$Return_the_constant_indentified_b = makeString("Return the constant indentified by the string NAME.");
  public static final SubLList $list32 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));
  public static final SubLSymbol $kw33$ARG_ERROR = makeKeyword("ARG-ERROR");
  public static final SubLString $str34$Expected_a_string__got__S = makeString("Expected a string, got ~S");
  public static final SubLSymbol $kw35$INVALID_NAME = makeKeyword("INVALID-NAME");
  public static final SubLString $str36$_S_is_not_a_valid_name_for_a_cons = makeString("~S is not a valid name for a constant");
  public static final SubLSymbol $kw37$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $sym38$FI_COMPLETE = makeSymbol("FI-COMPLETE");
  public static final SubLList $list39 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"));
  public static final SubLString $str40$Return_a_list_of_constants_whose_ = makeString("Return a list of constants whose name begins with PREFIX. The comparison is\nperformed in a case-insensitive mode unless CASE-SENSITIVE? is non-nil.");
  public static final SubLList $list41 = list(list(makeSymbol("LIST"), makeSymbol("CONSTANT-P")));
  public static final SubLSymbol $kw42$CREATE = makeKeyword("CREATE");
  public static final SubLList $list43 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));
  public static final SubLString $str44$Create_a_new_constant_with_NAME__ = makeString("Create a new constant with NAME.\nIf EXTERNAL-ID is non-null it is used, otherwise a unique identifier is generated.");
  public static final SubLList $list45 = list(makeSymbol("CONSTANT-P"));
  public static final SubLSymbol $kw46$UNNAMED = makeKeyword("UNNAMED");
  public static final SubLSymbol $kw47$NAME_CLASH = makeKeyword("NAME-CLASH");
  public static final SubLString $str48$NAME_clash_for__S___renaming_to__ = makeString("NAME clash for ~S ; renaming to ~S");
  public static final SubLString $str49$Expected_an_external_ID__got__S = makeString("Expected an external ID, got ~S");
  public static final SubLSymbol $kw50$ID_CLASH = makeKeyword("ID-CLASH");
  public static final SubLString $str51$Already_a_constant_with_id__A = makeString("Already a constant with id ~A");
  public static final SubLSymbol $kw52$FIND_OR_CREATE = makeKeyword("FIND-OR-CREATE");
  public static final SubLString $str53$Return_constant_with_NAME_if_it_i = makeString("Return constant with NAME if it is present.  \nIf not present, then create constant with NAME, using EXTERNAL-ID if given.\nIf EXTERNAL-ID is not given, generate a new one for the new constant.");
  public static final SubLSymbol $kw54$CREATE_SKOLEM = makeKeyword("CREATE-SKOLEM");
  public static final SubLSymbol $sym55$QUEUE_P = makeSymbol("QUEUE-P");
  public static final SubLObject $const56$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw57$MONOTONIC = makeKeyword("MONOTONIC");
  public static final SubLObject $const58$arityMin = constant_handles.reader_make_constant_shell(makeString("arityMin"));
  public static final SubLObject $const59$arity = constant_handles.reader_make_constant_shell(makeString("arity"));
  public static final SubLObject $const60$arg1Isa = constant_handles.reader_make_constant_shell(makeString("arg1Isa"));
  public static final SubLObject $const61$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));
  public static final SubLObject $const62$arg3Isa = constant_handles.reader_make_constant_shell(makeString("arg3Isa"));
  public static final SubLObject $const63$arg4Isa = constant_handles.reader_make_constant_shell(makeString("arg4Isa"));
  public static final SubLObject $const64$arg5Isa = constant_handles.reader_make_constant_shell(makeString("arg5Isa"));
  public static final SubLObject $const65$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));
  public static final SubLObject $const66$resultIsaArg = constant_handles.reader_make_constant_shell(makeString("resultIsaArg"));
  public static final SubLObject $const67$CollectionDenotingFunction = constant_handles.reader_make_constant_shell(makeString("CollectionDenotingFunction"));
  public static final SubLList $list68 = list(constant_handles.reader_make_constant_shell(makeString("CollectionDenotingFunction")));
  public static final SubLObject $const69$resultGenl = constant_handles.reader_make_constant_shell(makeString("resultGenl"));
  public static final SubLObject $const70$SubcollectionDenotingFunction = constant_handles.reader_make_constant_shell(makeString("SubcollectionDenotingFunction"));
  public static final SubLList $list71 = list(constant_handles.reader_make_constant_shell(makeString("SubcollectionDenotingFunction")));
  public static final SubLObject $const72$resultGenlArg = constant_handles.reader_make_constant_shell(makeString("resultGenlArg"));
  public static final SubLString $str73$SKF__a = makeString("SKF-~a");
  public static final SubLString $str74$0123456789 = makeString("0123456789");
  public static final SubLSymbol $kw75$MERGE = makeKeyword("MERGE");
  public static final SubLList $list76 = list(makeKeyword("SELF-MERGE"), makeString("Merging ~S onto itself is a no-op"), makeSymbol("KEEP-TERM"));
  public static final SubLSymbol $sym77$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym78$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const79$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const80$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const81$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $sym82$SKOLEM_NART_ = makeSymbol("SKOLEM-NART?");
  public static final SubLSymbol $sym83$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym84$SKOLEM_TERM_ = makeSymbol("SKOLEM-TERM?");
  public static final SubLString $str85$Could_not_merge_assertion_onto_te = makeString("Could not merge assertion onto term ~S due to uncanonicalization problem:~%  ~S");
  public static final SubLSymbol $sym86$CONVERT_HL_SUPPORT_TO_FI_SUPPORT = makeSymbol("CONVERT-HL-SUPPORT-TO-FI-SUPPORT");
  public static final SubLSymbol $kw87$KILL = makeKeyword("KILL");
  public static final SubLSymbol $sym88$FI_KILL = makeSymbol("FI-KILL");
  public static final SubLList $list89 = list(makeSymbol("FORT"));
  public static final SubLString $str90$Kill_FORT_and_all_its_uses_from_t = makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\nin that microtheory are removed.");
  public static final SubLList $list91 = list(makeSymbol("BOOLEANP"));
  public static final SubLString $str92$Constant__S_is_merely_an_empty_sh = makeString("Constant ~S is merely an empty shell, not part of the Knowledge Base");
  public static final SubLSymbol $kw93$RENAME = makeKeyword("RENAME");
  public static final SubLSymbol $sym94$FI_RENAME = makeSymbol("FI-RENAME");
  public static final SubLList $list95 = list(makeSymbol("CONSTANT"), makeSymbol("NAME"));
  public static final SubLString $str96$Change_name_of_CONSTANT_to_NAME__ = makeString("Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.");
  public static final SubLString $str97$Expected_a_constant__got__S = makeString("Expected a constant, got ~S");
  public static final SubLSymbol $kw98$ALREADY_HAS_NAME = makeKeyword("ALREADY-HAS-NAME");
  public static final SubLString $str99$Constant__S_is_already_named__A = makeString("Constant ~S is already named ~A");
  public static final SubLSymbol $kw100$LOOKUP = makeKeyword("LOOKUP");
  public static final SubLSymbol $sym101$FI_LOOKUP = makeSymbol("FI-LOOKUP");
  public static final SubLList $list102 = list(makeSymbol("FORMULA"), makeSymbol("MT"));
  public static final SubLString $str103$Returns_two_values_when_looking_u = makeString("Returns two values when looking up the EL FORMULA in the microtheory MT.  The\nfirst value returned is a list of HL formulas resulting from the canonicalization\nof the EL FORMULA.  The second value is T iff all the HL assertions were properly \nput into the KB.");
  public static final SubLList $list104 = list(list(makeSymbol("LIST"), makeSymbol("CONSP")), makeSymbol("BOOLEANP"));
  public static final SubLString $str105$Expected_a_cons__got__S = makeString("Expected a cons, got ~S");
  public static final SubLSymbol $sym106$ASSERTION_FI_FORMULA = makeSymbol("ASSERTION-FI-FORMULA");
  public static final SubLSymbol $kw107$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw108$ASSERT = makeKeyword("ASSERT");
  public static final SubLSymbol $sym109$FI_ASSERT = makeSymbol("FI-ASSERT");
  public static final SubLList $list110 = list(makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));
  public static final SubLString $str111$Assert_the_FORMULA_in_the_specifi = makeString("Assert the FORMULA in the specified MT.  STRENGTH is :default or :monotonic.\nDIRECTION is :forward or :backward.  GAF assertion direction defaults to :forward, and rule\nassertion direction defaults to :backward. Return T if there was no error.");
  public static final SubLString $str112$Expected__default_or__monotonic__ = makeString("Expected :default or :monotonic, got ~S");
  public static final SubLString $str113$Expected_a_direction__got__S = makeString("Expected a direction, got ~S");
  public static final SubLObject $const114$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLSymbol $kw115$TAUTOLOGY = makeKeyword("TAUTOLOGY");
  public static final SubLString $str116$Formula______S___in__S_was_a_taut = makeString("Formula ~%  ~S ~%in ~S was a tautology.");
  public static final SubLObject $const117$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLSymbol $kw118$CONTRADICTION = makeKeyword("CONTRADICTION");
  public static final SubLString $str119$Formula______S___in__S_was_a_cont = makeString("Formula ~%  ~S ~%in ~S was a contradiction.");
  public static final SubLList $list120 = list(makeSymbol("CNF"), makeSymbol("&OPTIONAL"), makeSymbol("VARIABLE-MAP"), makeSymbol("QUERY-FREE-VARS"));
  public static final SubLSymbol $kw121$COULD_NOT_ASSERT = makeKeyword("COULD-NOT-ASSERT");
  public static final SubLString $str122$Unable_to_assert_formula__S__in__ = makeString("Unable to assert formula ~S~%in ~S.");
  public static final SubLSymbol $sym123$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_ = makeSymbol("OPAQUE-ARG-WRT-QUOTING-NOT-COUNTING-LOGICAL-OPS?");
  public static final SubLSymbol $sym124$FAST_SKOLEM_NAT_ = makeSymbol("FAST-SKOLEM-NAT?");
  public static final SubLObject $const125$skolem = constant_handles.reader_make_constant_shell(makeString("skolem"));
  public static final SubLString $str126$Found_a___skolem_assertion_with_m = makeString("Found a #$skolem assertion with more than one argument: ~s");
  public static final SubLString $str127$Found_a___skolem_assertion_with_a = makeString("Found a #$skolem assertion with a non-deduced argument: ~s");
  public static final SubLString $str128$Defining_assertions_for__s___s__d = makeString("Defining assertions for ~s~%~s~%did not match existing supports~%~s");
  public static final SubLList $list129 = list(makeKeyword("DIRECTION"), makeKeyword("FORWARD"));
  public static final SubLSymbol $sym130$CNF_P = makeSymbol("CNF-P");
  public static final SubLSymbol $kw131$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $kw132$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw133$FORMULA_NOT_WELL_FORMED = makeKeyword("FORMULA-NOT-WELL-FORMED");
  public static final SubLString $str134$Formula______S___was_not_well_for = makeString("Formula ~%  ~S ~%was not well formed because: ~%~a");
  public static final SubLString $str135$Formula______S___was_not_well_for = makeString("Formula ~%  ~S ~%was not well formed");
  public static final SubLList $list136 = list(makeKeyword("REDUNDANT-LOCAL-ASSERTION"));
  public static final SubLSymbol $kw137$REASSERT = makeKeyword("REASSERT");
  public static final SubLList $list138 = list(makeKeyword("INVALID-STRENGTH-CHANGE"), makeString("Attempt to change the strength of a deduced assertion from ~S to ~S"), makeSymbol("CURRENT-STRENGTH"), makeSymbol("STRENGTH"));
  public static final SubLSymbol $kw139$ASSERTION_NOT_PRESENT = makeKeyword("ASSERTION-NOT-PRESENT");
  public static final SubLString $str140$Formula__S_in_mt__S_is_not_in_the = makeString("Formula ~S in mt ~S is not in the KB");
  public static final SubLSymbol $kw141$UNASSERT = makeKeyword("UNASSERT");
  public static final SubLSymbol $sym142$FI_UNASSERT = makeSymbol("FI-UNASSERT");
  public static final SubLString $str143$Remove_the_assertions_canonicaliz = makeString("Remove the assertions canonicalized from FORMULA in the microtheory MT.\nReturn T if the operation succeeded, otherwise return NIL.");
  public static final SubLString $str144$Sentence______S___in__S_was_a_tau = makeString("Sentence ~%  ~S ~%in ~S was a tautology.");
  public static final SubLString $str145$Sentence______S___in__S_was_a_con = makeString("Sentence ~%  ~S ~%in ~S was a contradiction.");
  public static final SubLString $str146$Sentence__S_in_mt__S_is_not_in_th = makeString("Sentence ~S in mt ~S is not in the KB");
  public static final SubLSymbol $kw147$ASSERTION_NOT_LOCAL = makeKeyword("ASSERTION-NOT-LOCAL");
  public static final SubLString $str148$Sentence__S_in_mt__S_is_not_local = makeString("Sentence ~S in mt ~S is not locally in the KB");
  public static final SubLSymbol $kw149$EDIT = makeKeyword("EDIT");
  public static final SubLSymbol $sym150$FI_EDIT = makeSymbol("FI-EDIT");
  public static final SubLList $list151 = list(makeSymbol("OLD-FORMULA"), makeSymbol("NEW-FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("OLD-MT"), list(makeSymbol("NEW-MT"), makeSymbol("OLD-MT")), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));
  public static final SubLString $str152$Unassert_the_assertions_canonical = makeString("Unassert the assertions canonicalized from OLD-FORMULA in the microtheory OLD-MT.\n   Assert NEW-FORMULA in the specified NEW-MT.  \n   STRENGTH is :default or :monotonic.\n   DIRECTION is :forward or :backward.  \n    GAF assertion direction defaults to :forward.\n    Rule assertion direction defaults to :backward.\n   Return T if there was no error.");
  public static final SubLSymbol $kw153$JUSTIFY = makeKeyword("JUSTIFY");
  public static final SubLList $list154 = list(makeSymbol("HL-MODULE"), makeSymbol("JUST-FORMULA"), makeSymbol("JUST-MT"));
  public static final SubLSymbol $sym155$ARGUMENT_TV = makeSymbol("ARGUMENT-TV");
  public static final SubLSymbol $kw156$ADD_ARGUMENT = makeKeyword("ADD-ARGUMENT");
  public static final SubLString $str157$Expected_a_support__got__S = makeString("Expected a support, got ~S");
  public static final SubLList $list158 = list(makeKeyword("FORWARD"), makeKeyword("BACKWARD"));
  public static final SubLString $str159$Expected__forward_or__backward__g = makeString("Expected :forward or :backward, got ~S");
  public static final SubLSymbol $kw160$FALSE = makeKeyword("FALSE");
  public static final SubLList $list161 = list(makeSymbol("HL-MODULE"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("STRENGTH"));
  public static final SubLSymbol $kw162$SUPPORT_MALFORMED = makeKeyword("SUPPORT-MALFORMED");
  public static final SubLString $str163$Support__S_was_malformed = makeString("Support ~S was malformed");
  public static final SubLSymbol $kw164$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw165$SUPPORT_INVALID = makeKeyword("SUPPORT-INVALID");
  public static final SubLString $str166$Support__S_is_not_currently_valid = makeString("Support ~S is not currently valid");
  public static final SubLSymbol $kw167$REMOVE_ARGUMENT = makeKeyword("REMOVE-ARGUMENT");
  public static final SubLSymbol $sym168$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $kw169$BLAST = makeKeyword("BLAST");
  public static final SubLSymbol $sym170$FI_BLAST = makeSymbol("FI-BLAST");
  public static final SubLString $str171$Remove_all_arguments_for_the_FORM = makeString("Remove all arguments for the FORMULA within MT, including both those \narguments resulting the direct assertion of the FORMULA, and \nthose arguments supporting the FORMULA which were derived through inference.\nReturn T if successful, otherwise return NIL.");
  public static final SubLSymbol $kw172$ASK = makeKeyword("ASK");
  public static final SubLSymbol $sym173$FI_ASK = makeSymbol("FI-ASK");
  public static final SubLList $list174 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));
  public static final SubLString $str175$Ask_for_bindings_for_free_variabl = makeString("Ask for bindings for free variables which will satisfy FORMULA within MT.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB.");
  public static final SubLList $list176 = list(list(makeSymbol("NIL-OR"), makeSymbol("LISTP")));
  public static final SubLString $str177$Expected_a_formula__got__S = makeString("Expected a formula, got ~S");
  public static final SubLList $list178 = list(makeSymbol("IST"), makeSymbol("IST-MT"), makeSymbol("IST-FORMULA"));
  public static final SubLString $str179$Expected_an_integer__got__S = makeString("Expected an integer, got ~S");
  public static final SubLObject $const180$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $kw181$CONTINUE_LAST_ASK = makeKeyword("CONTINUE-LAST-ASK");
  public static final SubLSymbol $sym182$FI_CONTINUE_LAST_ASK = makeSymbol("FI-CONTINUE-LAST-ASK");
  public static final SubLList $list183 = list(makeSymbol("CONTINUE-INFERENCE"));
  public static final SubLList $list184 = list(makeSymbol("&OPTIONAL"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"), makeSymbol("RECONSIDER-DEEP"));
  public static final SubLString $str185$Continue_the_last_ask_that_was_pe = makeString("Continue the last ask that was performed with more resources.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB.");
  public static final SubLSymbol $sym186$FI_CONTINUE_LAST_ASK_INT = makeSymbol("FI-CONTINUE-LAST-ASK-INT");
  public static final SubLString $str187$fi_continue_last_ask_int_is_depre = makeString("fi-continue-last-ask-int is deprecated; use CONTINUE-INFERENCE instead.");
  public static final SubLString $str188$fi_ask_status_is_deprecated__use_ = makeString("fi-ask-status is deprecated: use INFERENCE-SUSPEND-STATUS");
  public static final SubLSymbol $sym189$FI_ASK_STATUS = makeSymbol("FI-ASK-STATUS");
  public static final SubLList $list190 = list(makeSymbol("INFERENCE-SUSPEND-STATUS"));
  public static final SubLString $str191$Return_a_status_as_to_how_the_las = makeString("Return a status as to how the last ask successfully completed regarding\nresource limits.  \n:EXHAUST if the search spaces was exhausted.\n:DEPTH if the search space was limited because some nodes were too deep.\n:NUMBER if the requested number of bindings was found without exceeding other limits.\n:TIME if the time alloted expired prior to exhausting the search space.\nReturn NIL if there was no prior successful ask.");
  public static final SubLSymbol $sym192$FI_ASK_STATUS_INT = makeSymbol("FI-ASK-STATUS-INT");
  public static final SubLString $str193$fi_ask_status_int_is_deprecated__ = makeString("fi-ask-status-int is deprecated: use INFERENCE-SUSPEND-STATUS");
  public static final SubLSymbol $kw194$TMS_RECONSIDER_FORMULA = makeKeyword("TMS-RECONSIDER-FORMULA");
  public static final SubLSymbol $sym195$FI_TMS_RECONSIDER_FORMULA = makeSymbol("FI-TMS-RECONSIDER-FORMULA");
  public static final SubLString $str196$Reconsider_all_arguments_for_FORM = makeString("Reconsider all arguments for FORMULA within MT.  Return T if the\noperation succeeded, NIL if there was an error.");
  public static final SubLSymbol $kw197$TMS_RECONSIDER_MT = makeKeyword("TMS-RECONSIDER-MT");
  public static final SubLSymbol $sym198$FI_TMS_RECONSIDER_MT = makeSymbol("FI-TMS-RECONSIDER-MT");
  public static final SubLList $list199 = list(makeSymbol("MT"));
  public static final SubLString $str200$Reconsider_all_arguments_for_all_ = makeString("Reconsider all arguments for all formulas within MT.  Return T if the\noperation succeeded, NIL if there was an error.");
  public static final SubLSymbol $kw201$TMS_RECONSIDER_GAFS = makeKeyword("TMS-RECONSIDER-GAFS");
  public static final SubLSymbol $sym202$FI_TMS_RECONSIDER_GAFS = makeSymbol("FI-TMS-RECONSIDER-GAFS");
  public static final SubLList $list203 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("ARG"), makeSymbol("PREDICATE"), makeSymbol("MT"));
  public static final SubLString $str204$Reconsider_all_arguments_for_all_ = makeString("Reconsider all arguments for all gaf formulas involving TERM.\nARG optionally constrains gafs such that the TERM occupies a specific arg position.\nPREDICATE optionally constrains gafs such that the specifed PREDICATE\noccupies the arg0 position.\nMT optionally constrains gafs such that they must be included in the specific\nmicrotheory. \nReturn T if the operation succeeded, NIL if there was an error.");
  public static final SubLString $str205$Expected_an_integer_0_5__got__S = makeString("Expected an integer 0-5, got ~S");
  public static final SubLSymbol $kw206$TMS_RECONSIDER_TERM = makeKeyword("TMS-RECONSIDER-TERM");
  public static final SubLSymbol $sym207$FI_TMS_RECONSIDER_TERM = makeSymbol("FI-TMS-RECONSIDER-TERM");
  public static final SubLList $list208 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str209$Reconsider_all_arguments_involvin = makeString("Reconsider all arguments involving TERM.  \nIf MT is provided, then only arguments in that microtheory are reconsidered.\nReturn T if the operation succeeded, NIL if there was an error.");
  public static final SubLSymbol $kw210$TIMESTAMP_CONSTANT = makeKeyword("TIMESTAMP-CONSTANT");
  public static final SubLList $list211 = list(makeKeyword("INVALID-CYCLIST"));
  public static final SubLList $list212 = list(makeKeyword("INVALID-TIME"));
  public static final SubLList $list213 = list(makeKeyword("INVALID-PURPOSE"));
  public static final SubLList $list214 = list(makeKeyword("INVALID-SECOND"));
  public static final SubLList $list215 = list(makeKeyword("NO-CONSTANT"));
  public static final SubLList $list216 = list(makeKeyword("ALREADY-TIMESTAMPED"));
  public static final SubLSymbol $sym217$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLObject $const218$myCreator = constant_handles.reader_make_constant_shell(makeString("myCreator"));
  public static final SubLObject $const219$myCreationTime = constant_handles.reader_make_constant_shell(makeString("myCreationTime"));
  public static final SubLObject $const220$myCreationPurpose = constant_handles.reader_make_constant_shell(makeString("myCreationPurpose"));
  public static final SubLObject $const221$myCreationSecond = constant_handles.reader_make_constant_shell(makeString("myCreationSecond"));
  public static final SubLSymbol $kw222$STRENGTH = makeKeyword("STRENGTH");
  public static final SubLSymbol $kw223$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLObject $const224$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));
  public static final SubLSymbol $kw225$TIMESTAMP_ASSERTION = makeKeyword("TIMESTAMP-ASSERTION");
  public static final SubLList $list226 = list(makeKeyword("NO-ASSERTIONS"));
  public static final SubLSymbol $kw227$REMOVE_TIMESTAMP = makeKeyword("REMOVE-TIMESTAMP");
  public static final SubLSymbol $kw228$RENAME_VARIABLES = makeKeyword("RENAME-VARIABLES");
  public static final SubLList $list229 = list(makeKeyword("SIMPLE-VARIABLE-RENAME-IMPOSSIBLE"));
  public static final SubLSymbol $kw230$GET_PARAMETER = makeKeyword("GET-PARAMETER");
  public static final SubLString $str231$Expected_a_symbol__got__S = makeString("Expected a symbol, got ~S");
  public static final SubLSymbol $kw232$UNBOUND = makeKeyword("UNBOUND");
  public static final SubLString $str233$Parameter__S_is_not_bound = makeString("Parameter ~S is not bound");
  public static final SubLSymbol $kw234$SET_PARAMETER = makeKeyword("SET-PARAMETER");
  public static final SubLSymbol $kw235$EVAL = makeKeyword("EVAL");
  public static final SubLSymbol $kw236$LOCAL_EVAL = makeKeyword("LOCAL-EVAL");
  public static final SubLString $str237$Expected_a_microtheory__got__S = makeString("Expected a microtheory, got ~S");
  public static final SubLString $str238$Expected_a_term__got__S = makeString("Expected a term, got ~S");
  public static final SubLSymbol $sym239$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym240$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym241$KB_VAR_LIST_ = makeSymbol("KB-VAR-LIST?");
  public static final SubLSymbol $kw242$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $kw243$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $kw244$FALSE_MON = makeKeyword("FALSE-MON");
  public static final SubLSymbol $kw245$FALSE_DEF = makeKeyword("FALSE-DEF");
  public static final SubLSymbol $sym246$CACHED_FI_CANONICALIZE_GAF = makeSymbol("CACHED-FI-CANONICALIZE-GAF");
  public static final SubLSymbol $sym247$_CACHED_FI_CANONICALIZE_GAF_CACHING_STATE_ = makeSymbol("*CACHED-FI-CANONICALIZE-GAF-CACHING-STATE*");
  public static final SubLInteger $int248$100 = makeInteger(100);
  public static final SubLSymbol $kw249$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list250 = list(makeSymbol("DNF"), makeSymbol("VARIABLES"), makeSymbol("FREE-VARIABLES"));
  public static final SubLSymbol $sym251$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym252$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym253$DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");
  public static final SubLSymbol $sym254$ASSERTION_FI_IST_FORMULA = makeSymbol("ASSERTION-FI-IST-FORMULA");

  //// Initializers

  public void declareFunctions() {
    declare_fi_file();
  }

  public void initializeVariables() {
    init_fi_file();
  }

  public void runTopLevelForms() {
    setup_fi_file();
  }

}
