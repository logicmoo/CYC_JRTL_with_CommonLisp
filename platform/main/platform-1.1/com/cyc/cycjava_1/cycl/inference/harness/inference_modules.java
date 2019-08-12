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

package com.cyc.cycjava_1.cycl.inference.harness;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class inference_modules extends SubLTranslatedFile {

  //// Constructor

  private inference_modules() {}
  public static final SubLFile me = new inference_modules();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_modules";

  //// Definitions

  /** Set of all meta-removal modules, which are modules which execute
   other removal tactics on the problem.  These are treated similarly to removal 
   modules by the inference engine. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 868) 
  private static SubLSymbol $meta_removal_modules$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 1190) 
  private static SubLSymbol $hl_module_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3738) 
  private static SubLSymbol $valid_hl_module_subtypes$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3847) 
  private static SubLSymbol $default_hl_module_subtype$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 4001) 
  private static SubLSymbol $hl_module_property_defaults$ = null;

  public static final class $allowed_modules_spec_p$UnaryFunction extends UnaryFunction {
    public $allowed_modules_spec_p$UnaryFunction() { super(extractFunctionNamed("ALLOWED-MODULES-SPEC-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36405"); }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7052) 
  public static final SubLObject disjunctive_allowed_modules_spec_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && ($kw16$OR == object.first())
           && (NIL != list_utilities.list_of_type_p($sym17$ALLOWED_MODULES_SPEC_P, object.rest()))));
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7235) 
  public static final SubLObject conjunctive_allowed_modules_spec_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && ($kw18$AND == object.first())
           && (NIL != list_utilities.list_of_type_p($sym17$ALLOWED_MODULES_SPEC_P, object.rest()))));
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7419) 
  public static final SubLObject negated_allowed_modules_spec_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && ($kw19$NOT == object.first())
           && (NIL != list_utilities.list_of_type_p($sym17$ALLOWED_MODULES_SPEC_P, object.rest()))));
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7599) 
  public static final SubLObject hl_module_type_spec_p(SubLObject object) {
    return makeBoolean(((NIL != list_utilities.doubletonP(object))
           && ($kw20$MODULE_TYPE == object.first())));
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7722) 
  public static final SubLObject hl_module_subtype_spec_p(SubLObject object) {
    return makeBoolean(((NIL != list_utilities.doubletonP(object))
           && ($kw13$MODULE_SUBTYPE == object.first())));
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7851) 
  public static final SubLObject property_allowed_modules_spec_p(SubLObject object) {
    return makeBoolean(((NIL != list_utilities.doubletonP(object))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36416"))));
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 8863) 
  public static final SubLObject hl_module_allowed_by_allowed_modules_specP(SubLObject hl_module, SubLObject allowed_modules_spec) {
    if (($kw15$ALL == allowed_modules_spec)) {
      return T;
    } else if ((NIL != disjunctive_allowed_modules_spec_p(allowed_modules_spec))) {
      {
        SubLObject cdolist_list_var = allowed_modules_spec.rest();
        SubLObject allowed_modules_subspec = NIL;
        for (allowed_modules_subspec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), allowed_modules_subspec = cdolist_list_var.first()) {
          if ((NIL != hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec))) {
            return T;
          }
        }
      }
      return NIL;
    } else if ((NIL != conjunctive_allowed_modules_spec_p(allowed_modules_spec))) {
      {
        SubLObject cdolist_list_var = allowed_modules_spec.rest();
        SubLObject allowed_modules_subspec = NIL;
        for (allowed_modules_subspec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), allowed_modules_subspec = cdolist_list_var.first()) {
          if ((NIL == hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec))) {
            return NIL;
          }
        }
      }
      return T;
    } else if ((NIL != negated_allowed_modules_spec_p(allowed_modules_spec))) {
      return makeBoolean((NIL == hl_module_allowed_by_allowed_modules_specP(hl_module, conses_high.second(allowed_modules_spec))));
    } else if ((NIL != hl_module_type_spec_p(allowed_modules_spec))) {
      return Equality.eq(conses_high.second(allowed_modules_spec), hl_module_type(hl_module));
    } else if ((NIL != hl_module_subtype_spec_p(allowed_modules_spec))) {
      return list_utilities.member_eqP(conses_high.second(allowed_modules_spec), Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36417"));
    } else if ((NIL != property_allowed_modules_spec_p(allowed_modules_spec))) {
      {
        SubLObject property = allowed_modules_spec.first();
        SubLObject allowed_value = conses_high.second(allowed_modules_spec);
        SubLObject actual_value = hl_module_property_without_values(hl_module, property);
        return Equality.equal(allowed_value, actual_value);
      }
    } else {
      return Equality.eq(hl_module, find_hl_module_by_name(allowed_modules_spec));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 10318) 
  public static final SubLObject simple_allowed_modules_spec_p(SubLObject allowed_modules_spec) {
    if ((NIL != find_hl_module_by_name(allowed_modules_spec))) {
      return T;
    } else if ((NIL != disjunctive_allowed_modules_spec_p(allowed_modules_spec))) {
      {
        SubLObject cdolist_list_var = allowed_modules_spec.rest();
        SubLObject allowed_modules_subspec = NIL;
        for (allowed_modules_subspec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), allowed_modules_subspec = cdolist_list_var.first()) {
          if ((NIL == simple_allowed_modules_spec_p(allowed_modules_subspec))) {
            return NIL;
          }
        }
      }
      return T;
    } else if ((NIL != conjunctive_allowed_modules_spec_p(allowed_modules_spec))) {
      {
        SubLObject cdolist_list_var = allowed_modules_spec.rest();
        SubLObject allowed_modules_subspec = NIL;
        for (allowed_modules_subspec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), allowed_modules_subspec = cdolist_list_var.first()) {
          if ((NIL == simple_allowed_modules_spec_p(allowed_modules_subspec))) {
            return NIL;
          }
        }
      }
      return T;
    } else if ((($kw15$ALL == allowed_modules_spec)
        || (NIL != negated_allowed_modules_spec_p(allowed_modules_spec))
        || (NIL != hl_module_type_spec_p(allowed_modules_spec))
        || (NIL != hl_module_subtype_spec_p(allowed_modules_spec))
        || (NIL != property_allowed_modules_spec_p(allowed_modules_spec)))) {
      return NIL;
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 11224) 
  public static final SubLObject get_modules_from_simple_allowed_modules_spec(SubLObject allowed_modules_spec) {
    if ((NIL != disjunctive_allowed_modules_spec_p(allowed_modules_spec))) {
      {
        SubLObject module_specs = NIL;
        SubLObject cdolist_list_var = allowed_modules_spec.rest();
        SubLObject allowed_modules_subspec = NIL;
        for (allowed_modules_subspec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), allowed_modules_subspec = cdolist_list_var.first()) {
          module_specs = ConsesLow.append(module_specs, get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
        }
        return module_specs;
      }
    } else if ((NIL != conjunctive_allowed_modules_spec_p(allowed_modules_spec))) {
      {
        SubLObject module_specs = NIL;
        SubLObject cdolist_list_var = allowed_modules_spec.rest();
        SubLObject allowed_modules_subspec = NIL;
        for (allowed_modules_subspec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), allowed_modules_subspec = cdolist_list_var.first()) {
          module_specs = ConsesLow.append(module_specs, get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
        }
        return module_specs;
      }
    } else {
      return list(find_hl_module_by_name(allowed_modules_spec));
    }
  }

  public static final class $hl_module_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $plist; }
    public SubLObject getField4() { return $sense; }
    public SubLObject getField5() { return $predicate; }
    public SubLObject getField6() { return $any_predicates; }
    public SubLObject getField7() { return $arity; }
    public SubLObject getField8() { return $direction; }
    public SubLObject getField9() { return $required_pattern; }
    public SubLObject getField10() { return $required_mt; }
    public SubLObject getField11() { return $exclusive_func; }
    public SubLObject getField12() { return $required_func; }
    public SubLObject getField13() { return $completeness; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $plist = value; }
    public SubLObject setField4(SubLObject value) { return $sense = value; }
    public SubLObject setField5(SubLObject value) { return $predicate = value; }
    public SubLObject setField6(SubLObject value) { return $any_predicates = value; }
    public SubLObject setField7(SubLObject value) { return $arity = value; }
    public SubLObject setField8(SubLObject value) { return $direction = value; }
    public SubLObject setField9(SubLObject value) { return $required_pattern = value; }
    public SubLObject setField10(SubLObject value) { return $required_mt = value; }
    public SubLObject setField11(SubLObject value) { return $exclusive_func = value; }
    public SubLObject setField12(SubLObject value) { return $required_func = value; }
    public SubLObject setField13(SubLObject value) { return $completeness = value; }
    public SubLObject $name = NIL;
    public SubLObject $plist = NIL;
    public SubLObject $sense = NIL;
    public SubLObject $predicate = NIL;
    public SubLObject $any_predicates = NIL;
    public SubLObject $arity = NIL;
    public SubLObject $direction = NIL;
    public SubLObject $required_pattern = NIL;
    public SubLObject $required_mt = NIL;
    public SubLObject $exclusive_func = NIL;
    public SubLObject $required_func = NIL;
    public SubLObject $completeness = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($hl_module_native.class, $sym22$HL_MODULE, $sym21$HL_MODULE_P, $list23, $list24, new String[] {"$name", "$plist", "$sense", "$predicate", "$any_predicates", "$arity", "$direction", "$required_pattern", "$required_mt", "$exclusive_func", "$required_func", "$completeness"}, $list25, $list26, $sym27$PRINT_HL_MODULE);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12385) 
  public static SubLSymbol $dtp_hl_module$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12385) 
  public static final SubLObject hl_module_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36422");
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12385) 
  public static final SubLObject hl_module_p(SubLObject object) {
    return ((object.getClass() == $hl_module_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $hl_module_p$UnaryFunction extends UnaryFunction {
    public $hl_module_p$UnaryFunction() { super(extractFunctionNamed("HL-MODULE-P")); }
    public SubLObject processItem(SubLObject arg1) { return hl_module_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12385) 
  public static final SubLObject hl_mod_name(SubLObject object) {
    checkType(object, $sym21$HL_MODULE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12385) 
  public static final SubLObject hl_mod_plist(SubLObject object) {
    checkType(object, $sym21$HL_MODULE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12385) 
  public static final SubLObject _csetf_hl_mod_name(SubLObject object, SubLObject value) {
    checkType(object, $sym21$HL_MODULE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12385) 
  public static final SubLObject _csetf_hl_mod_plist(SubLObject object, SubLObject value) {
    checkType(object, $sym21$HL_MODULE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12385) 
  public static final SubLObject make_hl_module(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $hl_module_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw53$NAME)) {
            _csetf_hl_mod_name(v_new, current_value);
          } else if (pcase_var.eql($kw54$PLIST)) {
            _csetf_hl_mod_plist(v_new, current_value);
          } else if (pcase_var.eql($kw55$SENSE)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36403");
          } else if (pcase_var.eql($kw56$PREDICATE)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36399");
          } else if (pcase_var.eql($kw57$ANY_PREDICATES)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36394");
          } else if (pcase_var.eql($kw58$ARITY)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36395");
          } else if (pcase_var.eql($kw59$DIRECTION)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36397");
          } else if (pcase_var.eql($kw60$REQUIRED_PATTERN)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36402");
          } else if (pcase_var.eql($kw61$REQUIRED_MT)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36401");
          } else if (pcase_var.eql($kw62$EXCLUSIVE_FUNC)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36398");
          } else if (pcase_var.eql($kw63$REQUIRED_FUNC)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36400");
          } else if (pcase_var.eql($kw64$COMPLETENESS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36396");
          } else {
            Errors.error($str65$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13060) 
  public static final SubLObject sxhash_hl_module_method(SubLObject object) {
    return Sxhash.sxhash(hl_mod_name(object));
  }

  public static final class $sxhash_hl_module_method$UnaryFunction extends UnaryFunction {
    public $sxhash_hl_module_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-HL-MODULE-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_hl_module_method(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13143) 
  public static final SubLObject check_hl_module_property_list(SubLObject plist) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(plist, $sym68$PROPERTY_LIST_P);
      {
        SubLObject exclusive_specifiedP = NIL;
        {
          SubLObject remainder = NIL;
          for (remainder = plist; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              checkType(property, $sym69$HL_MODULE_PROPERTY_P);
              {
                SubLObject pcase_var = property;
                if (pcase_var.eql($kw70$EXCLUSIVE)) {
                  exclusive_specifiedP = T;
                }
              }
            }
          }
        }
        {
          SubLObject remainder = NIL;
          for (remainder = plist; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              SubLObject pcase_var = property;
              if (pcase_var.eql($kw71$SUPPLANTS)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                  if ((NIL == exclusive_specifiedP)) {
                    Errors.error($str72$_supplants_is_meaningless_without, plist);
                  }
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** @return hl-module-p; a new HL module named NAME with properties PLIST */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13863) 
  public static final SubLObject new_hl_module(SubLObject name, SubLObject plist) {
    check_hl_module_property_list(plist);
    {
      SubLObject hl_module = allocate_hl_module(name);
      plist = canonicalize_hl_module_plist(plist);
      _csetf_hl_mod_plist(hl_module, plist);
      add_hl_module(hl_module);
      return hl_module;
    }
  }

  /** Right now the only thing this changes is a single module-subtype canonicalizes
  into a singleton list. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14245) 
  public static final SubLObject canonicalize_hl_module_plist(SubLObject plist) {
    {
      SubLObject module_subtypes = conses_high.getf(plist, $kw13$MODULE_SUBTYPE, UNPROVIDED);
      if ((!(module_subtypes.isList()))) {
        plist = conses_high.putf(conses_high.copy_list(plist), $kw13$MODULE_SUBTYPE, list(module_subtypes));
      }
    }
    return plist;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14602) 
  public static final SubLObject allocate_hl_module(SubLObject name) {
    {
      SubLObject hl_module = find_hl_module_by_name(name);
      if ((NIL != hl_module)) {
        remove_hl_module(hl_module);
      } else {
        hl_module = make_hl_module(UNPROVIDED);
        _csetf_hl_mod_name(hl_module, name);
      }
      _csetf_hl_mod_plist(hl_module, NIL);
      return hl_module;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15049) 
  public static final SubLObject hl_module_name(SubLObject hl_module) {
    checkType(hl_module, $sym21$HL_MODULE_P);
    return hl_mod_name(hl_module);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15244) 
  public static final SubLObject hl_module_plist(SubLObject hl_module) {
    return hl_mod_plist(hl_module);
  }

  /** @return 0 the value of PROPERTY for HL-MODULE.
   @return 1 booleanp; whether the returned value was inferred as a default. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15361) 
  public static final SubLObject hl_module_property(SubLObject hl_module, SubLObject property) {
    {
      SubLObject plist = hl_module_plist(hl_module);
      SubLObject value = conses_high.getf(plist, property, $kw74$DEFAULT);
      if ((value == $kw74$DEFAULT)) {
        {
          SubLObject v_default = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
          return Values.values(v_default, T);
        }
      } else {
        return Values.values(value, NIL);
      }
    }
  }

  /** @return 0 the value of PROPERTY for HL-MODULE.
   @return 1 booleanp; whether the returned value was inferred as a default. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15984) 
  public static final SubLObject hl_module_property_without_values(SubLObject hl_module, SubLObject property) {
    {
      SubLObject plist = hl_module_plist(hl_module);
      SubLObject value = conses_high.getf(plist, property, $kw74$DEFAULT);
      if ((value == $kw74$DEFAULT)) {
        value = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
      }
      return value;
    }
  }

  /** An index mapping HL module names to the modules themselves */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 16855) 
  private static SubLSymbol $hl_module_store$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17820) 
  public static final SubLObject find_hl_module_by_name(SubLObject name) {
    {
      SubLObject hl_module = Hashtables.gethash_without_values(name, $hl_module_store$.getGlobalValue(), UNPROVIDED);
      return hl_module;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17972) 
  public static final SubLObject add_hl_module(SubLObject hl_module) {
    {
      SubLObject name = hl_module_name(hl_module);
      Hashtables.sethash(name, $hl_module_store$.getGlobalValue(), hl_module);
    }
    return hl_module;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18178) 
  public static final SubLObject remove_hl_module(SubLObject hl_module) {
    {
      SubLObject name = hl_module_name(hl_module);
      Hashtables.remhash(name, $hl_module_store$.getGlobalValue());
    }
    return hl_module;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18365) 
  public static final SubLObject setup_module(SubLObject name, SubLObject type, SubLObject plist) {
    {
      SubLObject new_plist = conses_high.copy_list(plist);
      new_plist = conses_high.putf(plist, $kw20$MODULE_TYPE, type);
      {
        SubLObject hl_module = new_hl_module(name, new_plist);
        return hl_module;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18824) 
  public static final SubLObject hl_module_type(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw20$MODULE_TYPE);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19183) 
  public static final SubLObject hl_module_universal(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw88$UNIVERSAL);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19458) 
  public static final SubLObject hl_module_sense(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw55$SENSE);
  }

  public static final class $hl_module_sense$UnaryFunction extends UnaryFunction {
    public $hl_module_sense$UnaryFunction() { super(extractFunctionNamed("HL-MODULE-SENSE")); }
    public SubLObject processItem(SubLObject arg1) { return hl_module_sense(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19564) 
  public static final SubLObject hl_module_sense_relevant_p(SubLObject hl_module, SubLObject sense) {
    {
      SubLObject module_sense = hl_module_sense(hl_module);
      return makeBoolean(((NIL == module_sense)
            || (module_sense == sense)));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19747) 
  public static final SubLObject hl_module_required_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw60$REQUIRED_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19875) 
  public static final SubLObject hl_module_required_pattern_matched_p(SubLObject hl_module, SubLObject asent) {
    {
      SubLObject pattern = hl_module_required_pattern(hl_module);
      return makeBoolean((($kw90$ANYTHING == pattern)
            || (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20110) 
  public static final SubLObject hl_module_required_mt(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw61$REQUIRED_MT);
  }

  /** @note: a return value of NIL means that all mts are relevant to HL-MODULE */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20228) 
  public static final SubLObject hl_module_required_mt_result(SubLObject hl_module) {
    {
      SubLObject required_mt_prop = hl_module_required_mt(hl_module);
      if ((NIL != required_mt_prop)) {
        return interpret_hl_module_mt_prop(required_mt_prop);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20516) 
  public static final SubLObject interpret_hl_module_mt_prop(SubLObject mt_prop) {
    if ((NIL != hlmt.hlmt_p(mt_prop))) {
      return mt_prop;
    } else if ((mt_prop.isSymbol()
         && (NIL != Symbols.boundp(mt_prop)))) {
      return Symbols.symbol_value(mt_prop);
    } else {
      return eval_in_api.possibly_cyc_api_eval(mt_prop);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20745) 
  public static final SubLObject hl_module_required_mt_relevantP(SubLObject hl_module) {
    {
      SubLObject required_mt = hl_module_required_mt_result(hl_module);
      return makeBoolean(((NIL == required_mt)
            || (NIL != mt_relevance_macros.relevant_mtP(required_mt))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20941) 
  public static final SubLObject hl_module_required_func(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw91$REQUIRED);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21058) 
  public static final SubLObject hl_module_cost_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw92$COST_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21178) 
  public static final SubLObject hl_module_cost_expression(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw93$COST_EXPRESSION);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21304) 
  public static final SubLObject hl_module_cost_func(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw94$COST);
  }

  /** Determines the estimated # of child nodes generated by HL-MODULE
   when applied to OBJECT with sense SENSE */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21413) 
  public static final SubLObject hl_module_cost(SubLObject hl_module, SubLObject object, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      SubLObject cost = hl_module_cost_pattern_result(hl_module, object);
      if ((!(cost.isNumber()))) {
        cost = hl_module_cost_expression_result(hl_module);
        if ((!(cost.isNumber()))) {
          cost = hl_module_cost_function_result(hl_module, object);
        }
      }
      return cost;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21906) 
  public static final SubLObject hl_module_asent_cost(SubLObject hl_module, SubLObject asent) {
    return hl_module_cost(hl_module, asent, UNPROVIDED);
  }

  /** Determines the estimated # of child nodes generated by HL-MODULE
   when applied to FORMULA based on the :cost-pattern
   property of HL-MODULE. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22183) 
  public static final SubLObject hl_module_cost_pattern_result(SubLObject hl_module, SubLObject formula) {
    {
      SubLObject cost_pattern = hl_module_cost_pattern(hl_module);
      if ((NIL != cost_pattern)) {
        return formula_pattern_match.pattern_transform_formula(cost_pattern, formula, UNPROVIDED);
      } else {
        return NIL;
      }
    }
  }

  /** Determines the estimated # of child nodes generated by HL-MODULE
   based on the :cost-expression property of HL-MODULE. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22553) 
  public static final SubLObject hl_module_cost_expression_result(SubLObject hl_module) {
    {
      SubLObject cost_expression = hl_module_cost_expression(hl_module);
      if ((NIL == cost_expression)) {
        return NIL;
      }
      if (cost_expression.isNumber()) {
        return cost_expression;
      } else if ((cost_expression.isSymbol()
           && (NIL != Symbols.boundp(cost_expression)))) {
        return Symbols.symbol_value(cost_expression);
      } else {
        return eval_in_api.possibly_cyc_api_eval(cost_expression);
      }
    }
  }

  /** Determines the estimated # of child nodes generated by HL-MODULE
   when applied to OBJECT based on the :cost property of HL-MODULE. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 23157) 
  public static final SubLObject hl_module_cost_function_result(SubLObject hl_module, SubLObject object) {
    {
      SubLObject cost_func = hl_module_cost_func(hl_module);
      if ((NIL != eval_in_api.possibly_cyc_api_function_spec_p(cost_func))) {
        {
          SubLObject cost = eval_in_api.possibly_cyc_api_funcall_1(cost_func, object);
          return cost;
        }
      }
    }
    return NIL;
  }

  /** @return boolean; whether HL-MODULE is a check module which evaluates
   to a boolean.  If false, it is an HL module which produces (some or no) bindings. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24154) 
  public static final SubLObject hl_module_is_checkP(SubLObject hl_module) {
    {
      SubLObject check = hl_module_property_without_values(hl_module, $kw95$CHECK);
      if ((check == $kw96$UNKNOWN)) {
        return guess_hl_module_is_checkP(hl_module);
      } else {
        return list_utilities.sublisp_boolean(check);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24534) 
  public static final SubLObject guess_hl_module_is_checkP(SubLObject hl_module) {
    {
      SubLObject required_pattern = hl_module_required_pattern(hl_module);
      if ((NIL != cycl_utilities.expression_find($kw97$NOT_FULLY_BOUND, required_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
        return NIL;
      } else {
        {
          SubLObject name = string_utilities.str(hl_module_name(hl_module));
          SubLObject checkP = string_utilities.substringP($str98$check, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          return checkP;
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24911) 
  public static final SubLObject hl_module_rule_select_func(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw99$RULE_SELECT);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25034) 
  public static final SubLObject hl_module_rule_filter_func(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw100$RULE_FILTER);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25157) 
  public static final SubLObject hl_module_expand_func(SubLObject hl_module) {
    inference_analysis.cinc_module_expand_count(hl_module);
    {
      SubLObject expand = hl_module_property_without_values(hl_module, $kw101$EXPAND);
      if (($kw74$DEFAULT == expand)) {
        return default_expand_func_for_hl_module(hl_module);
      } else {
        return expand;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25421) 
  public static final SubLObject default_expand_func_for_hl_module(SubLObject hl_module) {
    if (($kw102$REMOVAL == hl_module_type(hl_module))) {
      if ((NIL != hl_module_is_checkP(hl_module))) {
        return $sym103$INFERENCE_REMOVE_CHECK_DEFAULT;
      } else {
        return $sym104$INFERENCE_REMOVE_UNIFY_DEFAULT;
      }
    } else {
      return $sym105$DEFAULT_EXPAND_FUNC;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25699) 
  public static final SubLObject hl_module_expand_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw106$EXPAND_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25967) 
  public static final SubLObject hl_module_predicate(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw56$PREDICATE);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26081) 
  public static final SubLObject hl_module_predicate_relevant_p(SubLObject hl_module, SubLObject predicate) {
    {
      SubLObject hl_module_predicate = hl_module_predicate(hl_module);
      if ((NIL != hl_module_predicate)) {
        return Equality.eq(hl_module_predicate, predicate);
      }
    }
    {
      SubLObject hl_module_any_preds = hl_module_any_predicates(hl_module);
      if ((NIL != hl_module_any_preds)) {
        return subl_promotions.memberP(predicate, hl_module_any_preds, $sym108$PATTERN_MATCHES_FORMULA, UNPROVIDED);
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26484) 
  public static final SubLObject hl_module_arity(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw58$ARITY);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26590) 
  public static final SubLObject hl_module_arity_relevant_p(SubLObject hl_module, SubLObject asent) {
    {
      SubLObject hl_module_arity = hl_module_arity(hl_module);
      return makeBoolean(((NIL == hl_module_arity)
            || ((NIL != el_utilities.el_formula_without_sequence_termP(asent))
               && hl_module_arity.numE(Sequences.length(asent.rest())))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26913) 
  public static final SubLObject hl_module_exclusive_func(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw70$EXCLUSIVE);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 27742) 
  public static final SubLObject hl_module_supplants_info(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw71$SUPPLANTS);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 27861) 
  public static final SubLObject hl_module_direction(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw59$DIRECTION);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 27976) 
  public static final SubLObject hl_module_direction_relevantP(SubLObject hl_module) {
    if ((NIL == kb_control_vars.within_forward_inferenceP())) {
      return T;
    }
    {
      SubLObject direction = hl_module_direction(hl_module);
      return Equality.eq(direction, $kw109$FORWARD);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28334) 
  public static final SubLObject hl_module_input_extract_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw110$INPUT_EXTRACT_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28473) 
  public static final SubLObject hl_module_input_verify_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw111$INPUT_VERIFY_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28609) 
  public static final SubLObject hl_module_input_encode_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw112$INPUT_ENCODE_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28745) 
  public static final SubLObject hl_module_output_check_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw113$OUTPUT_CHECK_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28881) 
  public static final SubLObject hl_module_output_generate_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw114$OUTPUT_GENERATE_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29025) 
  public static final SubLObject hl_module_output_decode_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw115$OUTPUT_DECODE_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29165) 
  public static final SubLObject hl_module_output_verify_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw116$OUTPUT_VERIFY_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29303) 
  public static final SubLObject hl_module_output_construct_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw117$OUTPUT_CONSTRUCT_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29447) 
  public static final SubLObject hl_module_support_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw118$SUPPORT_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29573) 
  public static final SubLObject hl_module_support_func(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw119$SUPPORT);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29688) 
  public static final SubLObject hl_module_support_module(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw120$SUPPORT_MODULE);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29812) 
  public static final SubLObject hl_module_support_mt(SubLObject hl_module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject support_mt = hl_module_property(hl_module, $kw121$SUPPORT_MT);
        SubLObject default_inferredP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != default_inferredP)) {
          support_mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return support_mt;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30069) 
  public static final SubLObject hl_module_support_mt_result(SubLObject hl_module) {
    {
      SubLObject support_mt_prop = hl_module_support_mt(hl_module);
      return interpret_hl_module_mt_prop(support_mt_prop);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30244) 
  public static final SubLObject hl_module_support_strength(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw122$SUPPORT_STRENGTH);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30372) 
  public static final SubLObject hl_module_every_predicates(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw123$EVERY_PREDICATES);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30500) 
  public static final SubLObject hl_module_applicability_func(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw124$APPLICABILITY);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30627) 
  public static final SubLObject hl_module_applicability_pattern(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw125$APPLICABILITY_PATTERN);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30765) 
  public static final SubLObject hl_module_any_predicates(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw57$ANY_PREDICATES);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31521) 
  public static final SubLObject hl_module_completeness(SubLObject hl_module, SubLObject asent, SubLObject default_completeness) {
    if ((default_completeness == UNPROVIDED)) {
      default_completeness = $kw129$INCOMPLETE;
    }
    {
      SubLObject completeness = hl_module_property_without_values(hl_module, $kw64$COMPLETENESS);
      if ((NIL != completeness)) {
        return completeness;
      }
    }
    {
      SubLObject pattern = hl_module_property_without_values(hl_module, $kw130$COMPLETE_PATTERN);
      if (((NIL != pattern)
           && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent)))) {
        return $kw128$COMPLETE;
      }
    }
    {
      SubLObject pattern = hl_module_property_without_values(hl_module, $kw131$COMPLETENESS_PATTERN);
      if ((NIL != pattern)) {
        {
          SubLObject completeness = formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
          if ((NIL != completeness)) {
            return completeness;
          }
        }
      }
    }
    return default_completeness;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 34596) 
  public static final SubLObject hl_module_externalP(SubLObject hl_module) {
    return hl_module_property_without_values(hl_module, $kw132$EXTERNAL);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 34709) 
  public static final SubLObject hl_module_activeP(SubLObject hl_module, SubLObject inactive_hl_modules) {
    if ((inactive_hl_modules == UNPROVIDED)) {
      inactive_hl_modules = NIL;
    }
    return makeBoolean((NIL == subl_promotions.memberP(hl_module, inactive_hl_modules, UNPROVIDED, UNPROVIDED)));
  }

  /** Set of all possible removal modules. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 34841) 
  private static SubLSymbol $removal_modules$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35248) 
  public static final SubLObject removal_modules() {
    return $removal_modules$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35346) 
  public static final SubLObject removal_module_p(SubLObject object) {
    return set.set_memberP(object, $removal_modules$.getGlobalValue());
  }

  /** List of all the external removal modules. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35514) 
  private static SubLSymbol $removal_modules_external$ = null;

  /** List of all the generic literal-level removal modules.
These only apply when no specific modules apply. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35863) 
  private static SubLSymbol $removal_modules_generic$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36436) 
  public static final SubLObject generic_removal_modules_for_sense(SubLObject sense) {
    return Sequences.remove(enumeration_types.inverse_sense(sense), $removal_modules_generic$.getGlobalValue(), Symbols.symbol_function(EQ), $sym141$HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** List of all the universal literal-level removal modules.
These always apply even when specific modules apply. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36704) 
  private static SubLSymbol $removal_modules_universal$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38179) 
  public static final SubLObject universal_removal_modules_for_sense(SubLObject sense) {
    return Sequences.remove(enumeration_types.inverse_sense(sense), $removal_modules_universal$.getGlobalValue(), Symbols.symbol_function(EQ), $sym141$HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** A mapping between predicates and a list of modules which exclusively service that predicate.
If no there are no active specific modules for a predicate, the generic modules are used. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38359) 
  private static SubLSymbol $removal_modules_specific$ = null;

  /** Return the removal modules declared specific to PREDICATE in SENSE literals.
   @note destructible */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39060) 
  public static final SubLObject removal_modules_specific_for_sense(SubLObject predicate, SubLObject sense) {
    checkType(predicate, $sym145$FORT_P);
    return Sequences.remove(enumeration_types.inverse_sense(sense), Hashtables.gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL), Symbols.symbol_function(EQ), $sym141$HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** Return universal removal modules declared to use in SENSE literals and which have not been declared as dont-use for PREDICATE.
  @note destructible */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39438) 
  public static final SubLObject removal_modules_universal_for_predicate_and_sense(SubLObject predicate, SubLObject sense) {
    checkType(predicate, $sym145$FORT_P);
    {
      SubLObject universal_modules = NIL;
      SubLObject cdolist_list_var = universal_removal_modules_for_sense(sense);
      SubLObject universal_module = NIL;
      for (universal_module = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), universal_module = cdolist_list_var.first()) {
        if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36421"))) {
          universal_modules = cons(universal_module, universal_modules);
        }
      }
      return Sequences.nreverse(universal_modules);
    }
  }

  /** A mapping between generic modules and specific predicates for which they should also be used. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40704) 
  private static SubLSymbol $removal_modules_specific_use_generic$ = null;

  /** A mapping between meta-removal modules and specific predicates for which they should also be used. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40910) 
  private static SubLSymbol $removal_modules_specific_use_meta_removal$ = null;

  /** A mapping between universal modules and specific predicates for which they should not be used. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41126) 
  private static SubLSymbol $removal_modules_specific_dont_use_universal$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41305) 
  private static SubLSymbol $solely_specific_removal_module_predicate_store$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41588) 
  public static final SubLObject rebuild_solely_specific_removal_module_predicate_store() {
    return set.set_rebuild($solely_specific_removal_module_predicate_store$.getGlobalValue());
  }

  /** If you want the specific removal modules for PREDICATE to supplant ALL
   generic removal modules, then register this property. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41737) 
  public static final SubLObject register_solely_specific_removal_module_predicate(SubLObject predicate) {
    return set.set_add(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42189) 
  public static final SubLObject solely_specific_removal_module_predicateP(SubLObject predicate) {
    return set.set_memberP(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
  }

  /** Declare an inference removal module named NAME with properties in PLIST.
   @note For instructions on writing removal modules, see http://research.cyc.com/doc/removal-module-documentationv2.doc 
         and the other documentation provided from that doc page. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42344) 
  public static final SubLObject inference_removal_module(SubLObject name, SubLObject plist) {
    {
      SubLObject strengthened_plist = strengthen_removal_module_properties(name, plist);
      SubLObject hl_module = setup_module(name, $kw102$REMOVAL, strengthened_plist);
      set.set_add(hl_module, $removal_modules$.getGlobalValue());
      classify_removal_module(hl_module);
      return hl_module;
    }
  }

  /** State that the generic removal module named NAME should also be used for PREDICATE. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42956) 
  public static final SubLObject inference_removal_module_use_generic(SubLObject predicate, SubLObject name) {
    {
      SubLObject hl_module = find_hl_module_by_name(name);
      if ((NIL != hl_module)) {
        {
          SubLObject existing = conses_high.assoc(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
          if ((NIL == existing)) {
            existing = list(hl_module);
            $removal_modules_specific_use_generic$.setGlobalValue(cons(existing, $removal_modules_specific_use_generic$.getGlobalValue()));
          }
          ConsesLow.rplacd(existing, conses_high.adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
        }
        return inference_removal_module_note_specific(predicate, hl_module);
      }
    }
    return NIL;
  }

  /** State that the meta-removal module named NAME should also be used for PREDICATE. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43517) 
  public static final SubLObject inference_removal_module_use_meta_removal(SubLObject predicate, SubLObject name) {
    {
      SubLObject hl_module = find_hl_module_by_name(name);
      if ((NIL != hl_module)) {
        {
          SubLObject existing = conses_high.assoc(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
          if ((NIL == existing)) {
            existing = list(hl_module);
            $removal_modules_specific_use_meta_removal$.setGlobalValue(cons(existing, $removal_modules_specific_use_meta_removal$.getGlobalValue()));
          }
          ConsesLow.rplacd(existing, conses_high.adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
        }
        return hl_module;
      }
    }
    return NIL;
  }

  /** State that the universal removal module named NAME should not be used for PREDICATE. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 44039) 
  public static final SubLObject inference_removal_module_dont_use_universal(SubLObject predicate, SubLObject name) {
    {
      SubLObject hl_module = find_hl_module_by_name(name);
      if ((NIL != hl_module)) {
        {
          SubLObject existing = conses_high.assoc(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
          if ((NIL == existing)) {
            existing = list(hl_module);
            $removal_modules_specific_dont_use_universal$.setGlobalValue(cons(existing, $removal_modules_specific_dont_use_universal$.getGlobalValue()));
          }
          ConsesLow.rplacd(existing, conses_high.adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
        }
        return hl_module;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 44950) 
  public static final SubLObject strengthen_removal_module_properties(SubLObject name, SubLObject plist) {
    plist = conses_high.copy_tree(plist);
    {
      SubLObject sense = conses_high.getf(plist, $kw55$SENSE, UNPROVIDED);
      SubLObject pcase_var = sense;
      if ((pcase_var.eql($kw151$POS)
          || pcase_var.eql($kw152$NEG))) {
      } else {
        Errors.error($str153$removal_module__S_must_have_a__SE, name);
      }
    }
    return plist;
  }

  /** @note also reclassifies preference modules */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 48627) 
  public static final SubLObject reclassify_removal_modules() {
    clear_removal_modules();
    rebuild_solely_specific_removal_module_predicate_store();
    {
      SubLObject cdolist_list_var = $removal_modules_specific_use_generic$.getGlobalValue();
      SubLObject generic_info = NIL;
      for (generic_info = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), generic_info = cdolist_list_var.first()) {
        {
          SubLObject datum = generic_info;
          SubLObject current = datum;
          SubLObject hl_module = NIL;
          SubLObject predicates = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list155);
          hl_module = current.first();
          current = current.rest();
          predicates = current;
          {
            SubLObject cdolist_list_var_3 = predicates;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var_3.first(); (NIL != cdolist_list_var_3); cdolist_list_var_3 = cdolist_list_var_3.rest(), predicate = cdolist_list_var_3.first()) {
              inference_removal_module_note_specific(predicate, hl_module);
            }
          }
        }
      }
    }
    {
      SubLObject set_contents_var = set.do_set_internal(removal_modules());
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject hl_module = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, hl_module))) {
            classify_removal_module(hl_module);
          }
        }
      }
    }
    preference_modules.reclassify_preference_modules();
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 49233) 
  public static final SubLObject clear_removal_modules() {
    Hashtables.clrhash($removal_modules_specific$.getGlobalValue());
    $removal_modules_external$.setGlobalValue(NIL);
    $removal_modules_generic$.setGlobalValue(NIL);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 49432) 
  public static final SubLObject classify_removal_module(SubLObject hl_module) {
    if ((NIL != hl_module_externalP(hl_module))) {
      {
        SubLObject item_var = hl_module;
        if ((NIL == conses_high.member(item_var, $removal_modules_external$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          $removal_modules_external$.setGlobalValue(cons(item_var, $removal_modules_external$.getGlobalValue()));
        }
      }
    } else {
      {
        SubLObject predicate_spec = hl_module_predicate(hl_module);
        SubLObject universalP = hl_module_universal(hl_module);
        if ((NIL != universalP)) {
          {
            SubLObject item_var = hl_module;
            if ((NIL == conses_high.member(item_var, $removal_modules_universal$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              $removal_modules_universal$.setGlobalValue(cons(item_var, $removal_modules_universal$.getGlobalValue()));
            }
          }
        } else if ((NIL == predicate_spec)) {
          {
            SubLObject item_var = hl_module;
            if ((NIL == conses_high.member(item_var, $removal_modules_generic$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              $removal_modules_generic$.setGlobalValue(cons(item_var, $removal_modules_generic$.getGlobalValue()));
            }
          }
        } else if (predicate_spec.isAtom()) {
          inference_removal_module_note_specific(predicate_spec, hl_module);
        } else {
          {
            SubLObject cdolist_list_var = predicate_spec;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), predicate = cdolist_list_var.first()) {
              inference_removal_module_note_specific(predicate, hl_module);
            }
          }
        }
      }
    }
    return hl_module;
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50099) 
  public static final SubLObject inference_removal_module_note_specific(SubLObject predicate, SubLObject hl_module) {
    Hashtables.sethash(predicate, $removal_modules_specific$.getGlobalValue(), conses_high.adjoin(hl_module, Hashtables.gethash(predicate, $removal_modules_specific$.getGlobalValue(), NIL), UNPROVIDED, UNPROVIDED));
    return hl_module;
  }

  /** A set of all currently declared conjunctive removal modules. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50325) 
  private static SubLSymbol $conjunctive_removal_modules$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50813) 
  public static final SubLObject removal_modules_conjunctive() {
    return $conjunctive_removal_modules$.getGlobalValue();
  }

  /** Return T iff OBJECT is a conjunctive removal module. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50947) 
  public static final SubLObject conjunctive_removal_module_p(SubLObject object) {
    return set.set_memberP(object, $conjunctive_removal_modules$.getGlobalValue());
  }

  /** Declare a conjunctive inference removal module named NAME.
Allowed properties in PLIST:
:every-predicates <listp of predicate-p>; a necessary condition for applicability;
  the clause must contain every predicate in the list for MODULE to apply.
:applicability <function-spec-p>; a unary function whose single argument is
  a contextualized-dnf-clause-p.  Its return value is a list of subclause-spec-p
  indicating which subclauses of the input clause MODULE applies to.
  @note each of the returned subclauses must be a multi-literal-subclause-spec?.
:cost <function-spec-p>; a unary function whose single argument is
  a contextualized-dnf-clause-p.  Its return value is a non-negative number which is
  the expected number of bindings returned by MODULE when MODULE applies
  to the entire input clause, i.e. the return value of the applicability method
  is a singleton whose sole element picks out the totality of the input clause.
  A special case is that if it returns a zero, this indicates that this module
  does not in fact apply.
:expand <function-spec-p>; a unary function whose single argument is
  a contextualized-dnf-clause-p.  Its return value is NIL and it works by
  side effect, calling @xref conjunctive-removal-callback once for each
  binding list it determines to be an answer.  The JUSTIFICATIONS argument
  to @xref conjunctive-removal-callback is an ordered list of hl-justification-p.
  Each justification in JUSTIFICATIONS is a justification for a particular
  literal in the input clause, neg-lits first followed by pos-lits.
:documentation <stringp>; an explanation of what types of queries MODULE solves.
:example <stringp>; an example query that could be solved by MODULE. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 51444) 
  public static final SubLObject inference_conjunctive_removal_module(SubLObject name, SubLObject plist) {
    {
      SubLObject hl_module = setup_module(name, $kw161$REMOVAL_CONJUNCTIVE, plist);
      set.set_add(hl_module, $conjunctive_removal_modules$.getGlobalValue());
      return hl_module;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53914) 
  public static final SubLObject meta_removal_modules() {
    return $meta_removal_modules$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54115) 
  public static final SubLObject meta_removal_module_p(SubLObject object) {
    {
      SubLObject cdolist_list_var = meta_removal_modules();
      SubLObject module = NIL;
      for (module = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module = cdolist_list_var.first()) {
        if ((object == module)) {
          return T;
        }
      }
    }
    return NIL;
  }

  /** @return listp; a list of predicates with specific removal modules
that want to use this meta-removal module. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54331) 
  public static final SubLObject meta_removal_module_specific_predicates(SubLObject meta_removal_module) {
    return list_utilities.alist_lookup($removal_modules_specific_use_meta_removal$.getGlobalValue(), meta_removal_module, Symbols.symbol_function(EQ), UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54616) 
  public static final SubLObject meta_removal_module_specific_predicateP(SubLObject meta_removal_module, SubLObject predicate) {
    return list_utilities.member_eqP(predicate, meta_removal_module_specific_predicates(meta_removal_module));
  }

  /** All predicates use all meta-removal modules unless they are solely specific
and have not been stated as @xref inference-removal-module-use-meta-removal. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54799) 
  public static final SubLObject predicate_uses_meta_removal_moduleP(SubLObject predicate, SubLObject meta_removal_module) {
    if ((NIL != forts.fort_p(predicate))) {
      if ((NIL != solely_specific_removal_module_predicateP(predicate))) {
        if ((NIL == meta_removal_module_specific_predicateP(meta_removal_module, predicate))) {
          return NIL;
        }
      }
    }
    return T;
  }

  /** Meta-removal modules are modules which execute other removal tactics on the same problem.
They use the same required, cost, and completeness handling as removal modules,
but their execution is handled specially by the harness. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55248) 
  public static final SubLObject inference_meta_removal_module(SubLObject name, SubLObject plist) {
    if ((plist == UNPROVIDED)) {
      plist = NIL;
    }
    {
      SubLObject hl_module = setup_module(name, $kw165$META_REMOVAL, plist);
      SubLObject item_var = hl_module;
      if ((NIL == conses_high.member(item_var, $meta_removal_modules$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
        $meta_removal_modules$.setGlobalValue(cons(item_var, $meta_removal_modules$.getGlobalValue()));
      }
      return hl_module;
    }
  }

  /** Set of all transformation modules. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 56020) 
  private static SubLSymbol $transformation_modules$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 56489) 
  public static final SubLObject transformation_modules() {
    return $transformation_modules$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 56608) 
  public static final SubLObject transformation_module_p(SubLObject object) {
    return list_utilities.member_eqP(object, $transformation_modules$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 56801) 
  public static final SubLObject inference_transformation_module(SubLObject name, SubLObject plist) {
    {
      SubLObject hl_module = setup_module(name, $kw170$TRANSFORMATION, plist);
      SubLObject item_var = hl_module;
      if ((NIL == conses_high.member(item_var, $transformation_modules$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
        $transformation_modules$.setGlobalValue(cons(item_var, $transformation_modules$.getGlobalValue()));
      }
      return hl_module;
    }
  }

  /** Set of all meta-transformation modules, which are modules which generate 
   new transformation tactics.  These are currently treated as transformation 
   modules by the inference engine. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 57042) 
  private static SubLSymbol $meta_transformation_modules$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 57763) 
  public static final SubLObject meta_transformation_module_p(SubLObject object) {
    return list_utilities.member_eqP(object, $meta_transformation_modules$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 57976) 
  public static final SubLObject inference_meta_transformation_module(SubLObject name, SubLObject plist) {
    if ((plist == UNPROVIDED)) {
      plist = NIL;
    }
    {
      SubLObject hl_module = setup_module(name, $kw175$META_TRANSFORMATION, plist);
      SubLObject item_var = hl_module;
      if ((NIL == conses_high.member(item_var, $meta_transformation_modules$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
        $meta_transformation_modules$.setGlobalValue(cons(item_var, $meta_transformation_modules$.getGlobalValue()));
      }
      return hl_module;
    }
  }

  /** Set of all rewrite modules. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58247) 
  private static SubLSymbol $rewrite_modules$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58742) 
  public static final SubLObject rewrite_module_p(SubLObject object) {
    return list_utilities.member_eqP(object, $rewrite_modules$.getGlobalValue());
  }

  /** Declares NAME to be a rewrite module, with properties specified by PLIST. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 59434) 
  public static final SubLObject inference_rewrite_module(SubLObject name, SubLObject plist) {
    {
      SubLObject strengthened_plist = strengthen_rewrite_module_properties(name, plist);
      SubLObject hl_module = setup_module(name, $kw180$REWRITE, strengthened_plist);
      SubLObject item_var = hl_module;
      if ((NIL == conses_high.member(item_var, $rewrite_modules$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
        $rewrite_modules$.setGlobalValue(cons(item_var, $rewrite_modules$.getGlobalValue()));
      }
      return hl_module;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60479) 
  public static final SubLObject strengthen_rewrite_module_properties(SubLObject name, SubLObject plist) {
    plist = conses_high.copy_tree(plist);
    {
      SubLObject sense = conses_high.getf(plist, $kw55$SENSE, UNPROVIDED);
      SubLObject pcase_var = sense;
      if ((pcase_var.eql($kw151$POS)
          || pcase_var.eql($kw152$NEG))) {
      } else {
        Errors.error($str181$rewrite_module__S_must_have_a__SE, name);
      }
    }
    return plist;
  }

  /** Set of all structural modules. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60851) 
  private static SubLSymbol $structural_modules$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61162) 
  public static final SubLObject structural_module_p(SubLObject object) {
    return list_utilities.member_eqP(object, $structural_modules$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61257) 
  public static final SubLObject inference_structural_module(SubLObject name, SubLObject plist) {
    if ((plist == UNPROVIDED)) {
      plist = NIL;
    }
    {
      SubLObject hl_module = setup_module(name, $kw183$STRUCTURAL, plist);
      SubLObject item_var = hl_module;
      if ((NIL == conses_high.member(item_var, $structural_modules$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
        $structural_modules$.setGlobalValue(cons(item_var, $structural_modules$.getGlobalValue()));
      }
      return hl_module;
    }
  }

  /** Set of all meta-structural modules, which are modules which generate 
   new structural tactics.  These are currently treated as structural 
   modules by the inference engine. */
  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61542) 
  private static SubLSymbol $meta_structural_modules$ = null;

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62164) 
  public static final SubLObject meta_structural_module_p(SubLObject object) {
    return list_utilities.member_eqP(object, $meta_structural_modules$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62361) 
  public static final SubLObject inference_meta_structural_module(SubLObject name, SubLObject plist) {
    if ((plist == UNPROVIDED)) {
      plist = NIL;
    }
    {
      SubLObject hl_module = setup_module(name, $kw188$META_STRUCTURAL, plist);
      SubLObject item_var = hl_module;
      if ((NIL == conses_high.member(item_var, $meta_structural_modules$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
        $meta_structural_modules$.setGlobalValue(cons(item_var, $meta_structural_modules$.getGlobalValue()));
      }
      return hl_module;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62616) 
  private static SubLSymbol $cfasl_wide_opcode_hl_module$ = null;

  public static final SubLObject declare_inference_modules_file() {
    declareFunction(myName, "hl_module_property_p", "HL-MODULE-PROPERTY-P", 1, 0, false);
    declareMacro(myName, "do_hl_module_properties", "DO-HL-MODULE-PROPERTIES");
    declareFunction(myName, "hl_module_properties", "HL-MODULE-PROPERTIES", 0, 0, false);
    declareFunction(myName, "removal_module_plist_indicators", "REMOVAL-MODULE-PLIST-INDICATORS", 0, 0, false);
    declareFunction(myName, "hl_module_subtype_p", "HL-MODULE-SUBTYPE-P", 1, 0, false);
    declareFunction(myName, "allowed_modules_spec_p", "ALLOWED-MODULES-SPEC-P", 1, 0, false); new $allowed_modules_spec_p$UnaryFunction();
    declareFunction(myName, "non_universal_allowed_modules_spec_p", "NON-UNIVERSAL-ALLOWED-MODULES-SPEC-P", 1, 0, false);
    declareFunction(myName, "disjunctive_allowed_modules_spec_p", "DISJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
    declareFunction(myName, "conjunctive_allowed_modules_spec_p", "CONJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
    declareFunction(myName, "negated_allowed_modules_spec_p", "NEGATED-ALLOWED-MODULES-SPEC-P", 1, 0, false);
    declareFunction(myName, "hl_module_type_spec_p", "HL-MODULE-TYPE-SPEC-P", 1, 0, false);
    declareFunction(myName, "hl_module_subtype_spec_p", "HL-MODULE-SUBTYPE-SPEC-P", 1, 0, false);
    declareFunction(myName, "property_allowed_modules_spec_p", "PROPERTY-ALLOWED-MODULES-SPEC-P", 1, 0, false);
    declareFunction(myName, "hl_module_allowedP", "HL-MODULE-ALLOWED?", 2, 0, false);
    declareFunction(myName, "hl_module_allowed_by_allowed_modules_specP", "HL-MODULE-ALLOWED-BY-ALLOWED-MODULES-SPEC?", 2, 0, false);
    declareFunction(myName, "simple_allowed_modules_spec_p", "SIMPLE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
    declareFunction(myName, "get_modules_from_simple_allowed_modules_spec", "GET-MODULES-FROM-SIMPLE-ALLOWED-MODULES-SPEC", 1, 0, false);
    declareFunction(myName, "hl_module_print_function_trampoline", "HL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "hl_module_p", "HL-MODULE-P", 1, 0, false); new $hl_module_p$UnaryFunction();
    declareFunction(myName, "hl_mod_name", "HL-MOD-NAME", 1, 0, false);
    declareFunction(myName, "hl_mod_plist", "HL-MOD-PLIST", 1, 0, false);
    declareFunction(myName, "hl_mod_sense", "HL-MOD-SENSE", 1, 0, false);
    declareFunction(myName, "hl_mod_predicate", "HL-MOD-PREDICATE", 1, 0, false);
    declareFunction(myName, "hl_mod_any_predicates", "HL-MOD-ANY-PREDICATES", 1, 0, false);
    declareFunction(myName, "hl_mod_arity", "HL-MOD-ARITY", 1, 0, false);
    declareFunction(myName, "hl_mod_direction", "HL-MOD-DIRECTION", 1, 0, false);
    declareFunction(myName, "hl_mod_required_pattern", "HL-MOD-REQUIRED-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_mod_required_mt", "HL-MOD-REQUIRED-MT", 1, 0, false);
    declareFunction(myName, "hl_mod_exclusive_func", "HL-MOD-EXCLUSIVE-FUNC", 1, 0, false);
    declareFunction(myName, "hl_mod_required_func", "HL-MOD-REQUIRED-FUNC", 1, 0, false);
    declareFunction(myName, "hl_mod_completeness", "HL-MOD-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "_csetf_hl_mod_name", "_CSETF-HL-MOD-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_plist", "_CSETF-HL-MOD-PLIST", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_sense", "_CSETF-HL-MOD-SENSE", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_predicate", "_CSETF-HL-MOD-PREDICATE", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_any_predicates", "_CSETF-HL-MOD-ANY-PREDICATES", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_arity", "_CSETF-HL-MOD-ARITY", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_direction", "_CSETF-HL-MOD-DIRECTION", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_required_pattern", "_CSETF-HL-MOD-REQUIRED-PATTERN", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_required_mt", "_CSETF-HL-MOD-REQUIRED-MT", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_exclusive_func", "_CSETF-HL-MOD-EXCLUSIVE-FUNC", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_required_func", "_CSETF-HL-MOD-REQUIRED-FUNC", 2, 0, false);
    declareFunction(myName, "_csetf_hl_mod_completeness", "_CSETF-HL-MOD-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "make_hl_module", "MAKE-HL-MODULE", 0, 1, false);
    declareFunction(myName, "print_hl_module", "PRINT-HL-MODULE", 3, 0, false);
    declareFunction(myName, "sxhash_hl_module_method", "SXHASH-HL-MODULE-METHOD", 1, 0, false); new $sxhash_hl_module_method$UnaryFunction();
    declareFunction(myName, "check_hl_module_property_list", "CHECK-HL-MODULE-PROPERTY-LIST", 1, 0, false);
    declareFunction(myName, "new_hl_module", "NEW-HL-MODULE", 2, 0, false);
    declareFunction(myName, "canonicalize_hl_module_plist", "CANONICALIZE-HL-MODULE-PLIST", 1, 0, false);
    declareFunction(myName, "allocate_hl_module", "ALLOCATE-HL-MODULE", 1, 0, false);
    declareFunction(myName, "destroy_hl_module", "DESTROY-HL-MODULE", 1, 0, false);
    declareFunction(myName, "hl_module_name", "HL-MODULE-NAME", 1, 0, false);
    declareFunction(myName, "hl_module_plist", "HL-MODULE-PLIST", 1, 0, false);
    declareFunction(myName, "hl_module_property", "HL-MODULE-PROPERTY", 2, 0, false);
    declareFunction(myName, "hl_module_property_without_values", "HL-MODULE-PROPERTY-WITHOUT-VALUES", 2, 0, false);
    declareFunction(myName, "hl_module_property_not_defaultP", "HL-MODULE-PROPERTY-NOT-DEFAULT?", 2, 0, false);
    declareMacro(myName, "do_hl_modules", "DO-HL-MODULES");
    declareFunction(myName, "hl_module_store", "HL-MODULE-STORE", 0, 0, false);
    declareFunction(myName, "find_hl_module_by_name", "FIND-HL-MODULE-BY-NAME", 1, 0, false);
    declareFunction(myName, "add_hl_module", "ADD-HL-MODULE", 1, 0, false);
    declareFunction(myName, "remove_hl_module", "REMOVE-HL-MODULE", 1, 0, false);
    declareFunction(myName, "setup_module", "SETUP-MODULE", 3, 0, false);
    declareFunction(myName, "default_cost_func", "DEFAULT-COST-FUNC", 0, 1, false);
    declareFunction(myName, "default_expand_func", "DEFAULT-EXPAND-FUNC", 0, 2, false);
    declareFunction(myName, "hl_module_type", "HL-MODULE-TYPE", 1, 0, false);
    declareFunction(myName, "hl_module_subtypes", "HL-MODULE-SUBTYPES", 1, 0, false);
    declareFunction(myName, "abductive_hl_moduleP", "ABDUCTIVE-HL-MODULE?", 1, 0, false);
    declareFunction(myName, "hl_module_universal", "HL-MODULE-UNIVERSAL", 1, 0, false);
    declareFunction(myName, "hl_module_source", "HL-MODULE-SOURCE", 1, 0, false);
    declareFunction(myName, "hl_module_sense", "HL-MODULE-SENSE", 1, 0, false); new $hl_module_sense$UnaryFunction();
    declareFunction(myName, "hl_module_sense_relevant_p", "HL-MODULE-SENSE-RELEVANT-P", 2, 0, false);
    declareFunction(myName, "hl_module_required_pattern", "HL-MODULE-REQUIRED-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_required_pattern_matched_p", "HL-MODULE-REQUIRED-PATTERN-MATCHED-P", 2, 0, false);
    declareFunction(myName, "hl_module_required_mt", "HL-MODULE-REQUIRED-MT", 1, 0, false);
    declareFunction(myName, "hl_module_required_mt_result", "HL-MODULE-REQUIRED-MT-RESULT", 1, 0, false);
    declareFunction(myName, "interpret_hl_module_mt_prop", "INTERPRET-HL-MODULE-MT-PROP", 1, 0, false);
    declareFunction(myName, "hl_module_required_mt_relevantP", "HL-MODULE-REQUIRED-MT-RELEVANT?", 1, 0, false);
    declareFunction(myName, "hl_module_required_func", "HL-MODULE-REQUIRED-FUNC", 1, 0, false);
    declareFunction(myName, "hl_module_cost_pattern", "HL-MODULE-COST-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_cost_expression", "HL-MODULE-COST-EXPRESSION", 1, 0, false);
    declareFunction(myName, "hl_module_cost_func", "HL-MODULE-COST-FUNC", 1, 0, false);
    declareFunction(myName, "hl_module_cost", "HL-MODULE-COST", 2, 1, false);
    declareFunction(myName, "hl_module_asent_cost", "HL-MODULE-ASENT-COST", 2, 0, false);
    declareFunction(myName, "hl_module_clause_cost", "HL-MODULE-CLAUSE-COST", 2, 0, false);
    declareFunction(myName, "hl_module_cost_pattern_result", "HL-MODULE-COST-PATTERN-RESULT", 2, 0, false);
    declareFunction(myName, "hl_module_cost_expression_result", "HL-MODULE-COST-EXPRESSION-RESULT", 1, 0, false);
    declareFunction(myName, "hl_module_cost_function_result", "HL-MODULE-COST-FUNCTION-RESULT", 2, 0, false);
    declareFunction(myName, "hl_module_asent_cost_function_result", "HL-MODULE-ASENT-COST-FUNCTION-RESULT", 2, 0, false);
    declareFunction(myName, "hl_module_clause_cost_function_result", "HL-MODULE-CLAUSE-COST-FUNCTION-RESULT", 2, 0, false);
    declareFunction(myName, "hl_module_is_checkP", "HL-MODULE-IS-CHECK?", 1, 0, false);
    declareFunction(myName, "guess_hl_module_is_checkP", "GUESS-HL-MODULE-IS-CHECK?", 1, 0, false);
    declareFunction(myName, "hl_module_rule_select_func", "HL-MODULE-RULE-SELECT-FUNC", 1, 0, false);
    declareFunction(myName, "hl_module_rule_filter_func", "HL-MODULE-RULE-FILTER-FUNC", 1, 0, false);
    declareFunction(myName, "hl_module_expand_func", "HL-MODULE-EXPAND-FUNC", 1, 0, false);
    declareFunction(myName, "default_expand_func_for_hl_module", "DEFAULT-EXPAND-FUNC-FOR-HL-MODULE", 1, 0, false);
    declareFunction(myName, "hl_module_expand_pattern", "HL-MODULE-EXPAND-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_expand_iterative_pattern", "HL-MODULE-EXPAND-ITERATIVE-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_predicate", "HL-MODULE-PREDICATE", 1, 0, false);
    declareFunction(myName, "hl_module_predicate_relevant_p", "HL-MODULE-PREDICATE-RELEVANT-P", 2, 0, false);
    declareFunction(myName, "hl_module_arity", "HL-MODULE-ARITY", 1, 0, false);
    declareFunction(myName, "hl_module_arity_relevant_p", "HL-MODULE-ARITY-RELEVANT-P", 2, 0, false);
    declareFunction(myName, "hl_module_exclusive_func", "HL-MODULE-EXCLUSIVE-FUNC", 1, 0, false);
    declareFunction(myName, "hl_module_supplants_info", "HL-MODULE-SUPPLANTS-INFO", 1, 0, false);
    declareFunction(myName, "hl_module_direction", "HL-MODULE-DIRECTION", 1, 0, false);
    declareFunction(myName, "hl_module_direction_relevantP", "HL-MODULE-DIRECTION-RELEVANT?", 1, 0, false);
    declareFunction(myName, "hl_module_input_extract_pattern", "HL-MODULE-INPUT-EXTRACT-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_input_verify_pattern", "HL-MODULE-INPUT-VERIFY-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_input_encode_pattern", "HL-MODULE-INPUT-ENCODE-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_output_check_pattern", "HL-MODULE-OUTPUT-CHECK-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_output_generate_pattern", "HL-MODULE-OUTPUT-GENERATE-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_output_decode_pattern", "HL-MODULE-OUTPUT-DECODE-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_output_verify_pattern", "HL-MODULE-OUTPUT-VERIFY-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_output_construct_pattern", "HL-MODULE-OUTPUT-CONSTRUCT-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_support_pattern", "HL-MODULE-SUPPORT-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_support_func", "HL-MODULE-SUPPORT-FUNC", 1, 0, false);
    declareFunction(myName, "hl_module_support_module", "HL-MODULE-SUPPORT-MODULE", 1, 0, false);
    declareFunction(myName, "hl_module_support_mt", "HL-MODULE-SUPPORT-MT", 1, 0, false);
    declareFunction(myName, "hl_module_support_mt_result", "HL-MODULE-SUPPORT-MT-RESULT", 1, 0, false);
    declareFunction(myName, "hl_module_support_strength", "HL-MODULE-SUPPORT-STRENGTH", 1, 0, false);
    declareFunction(myName, "hl_module_every_predicates", "HL-MODULE-EVERY-PREDICATES", 1, 0, false);
    declareFunction(myName, "hl_module_applicability_func", "HL-MODULE-APPLICABILITY-FUNC", 1, 0, false);
    declareFunction(myName, "hl_module_applicability_pattern", "HL-MODULE-APPLICABILITY-PATTERN", 1, 0, false);
    declareFunction(myName, "hl_module_any_predicates", "HL-MODULE-ANY-PREDICATES", 1, 0, false);
    declareFunction(myName, "hl_module_documentation_string", "HL-MODULE-DOCUMENTATION-STRING", 1, 0, false);
    declareFunction(myName, "hl_module_example_string", "HL-MODULE-EXAMPLE-STRING", 1, 0, false);
    declareFunction(myName, "hl_module_completeP", "HL-MODULE-COMPLETE?", 2, 0, false);
    declareFunction(myName, "hl_module_incompleteP", "HL-MODULE-INCOMPLETE?", 2, 0, false);
    declareFunction(myName, "hl_module_completeness", "HL-MODULE-COMPLETENESS", 2, 1, false);
    declareFunction(myName, "hl_module_clause_completeness", "HL-MODULE-CLAUSE-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "hl_module_externalP", "HL-MODULE-EXTERNAL?", 1, 0, false);
    declareFunction(myName, "hl_module_activeP", "HL-MODULE-ACTIVE?", 1, 1, false);
    declareMacro(myName, "do_removal_modules", "DO-REMOVAL-MODULES");
    declareFunction(myName, "removal_modules", "REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "removal_module_p", "REMOVAL-MODULE-P", 1, 0, false);
    declareFunction(myName, "removal_module_count", "REMOVAL-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "some_external_removal_modulesP", "SOME-EXTERNAL-REMOVAL-MODULES?", 0, 0, false);
    declareFunction(myName, "removal_modules_external", "REMOVAL-MODULES-EXTERNAL", 0, 0, false);
    declareFunction(myName, "generic_removal_module_p", "GENERIC-REMOVAL-MODULE-P", 1, 0, false);
    declareFunction(myName, "generic_removal_modules", "GENERIC-REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "generic_removal_modules_for_sense", "GENERIC-REMOVAL-MODULES-FOR-SENSE", 1, 0, false);
    declareFunction(myName, "generic_removal_module_count", "GENERIC-REMOVAL-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "universal_removal_modules", "UNIVERSAL-REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "universal_removal_module_p", "UNIVERSAL-REMOVAL-MODULE-P", 1, 0, false);
    declareFunction(myName, "universal_removal_module_count", "UNIVERSAL-REMOVAL-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "universal_removal_module_exception_predicates", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATES", 1, 0, false);
    declareFunction(myName, "universal_removal_module_exception_predicateP", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATE?", 2, 0, false);
    declareFunction(myName, "predicate_doesnt_use_universal_removal_moduleP", "PREDICATE-DOESNT-USE-UNIVERSAL-REMOVAL-MODULE?", 2, 0, false);
    declareFunction(myName, "universal_removal_modules_for_sense", "UNIVERSAL-REMOVAL-MODULES-FOR-SENSE", 1, 0, false);
    declareFunction(myName, "removal_modules_specific", "REMOVAL-MODULES-SPECIFIC", 1, 0, false);
    declareFunction(myName, "predicate_has_specific_removal_modulesP", "PREDICATE-HAS-SPECIFIC-REMOVAL-MODULES?", 1, 0, false);
    declareFunction(myName, "removal_modules_specific_for_sense", "REMOVAL-MODULES-SPECIFIC-FOR-SENSE", 2, 0, false);
    declareFunction(myName, "removal_modules_universal_for_predicate_and_sense", "REMOVAL-MODULES-UNIVERSAL-FOR-PREDICATE-AND-SENSE", 2, 0, false);
    declareFunction(myName, "predicates_with_specific_removal_modules", "PREDICATES-WITH-SPECIFIC-REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "specific_removal_modules", "SPECIFIC-REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "specific_removal_module_count", "SPECIFIC-REMOVAL-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "specific_removal_module_set", "SPECIFIC-REMOVAL-MODULE-SET", 0, 0, false);
    declareFunction(myName, "clear_solely_specific_removal_module_predicate_store", "CLEAR-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false);
    declareFunction(myName, "rebuild_solely_specific_removal_module_predicate_store", "REBUILD-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false);
    declareFunction(myName, "register_solely_specific_removal_module_predicate", "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
    declareFunction(myName, "deregister_solely_specific_removal_module_predicate", "DEREGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
    declareFunction(myName, "solely_specific_removal_module_predicateP", "SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE?", 1, 0, false);
    declareFunction(myName, "inference_removal_module", "INFERENCE-REMOVAL-MODULE", 2, 0, false);
    declareFunction(myName, "inference_removal_module_use_generic", "INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 0, false);
    declareFunction(myName, "inference_removal_module_use_meta_removal", "INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 0, false);
    declareFunction(myName, "inference_removal_module_dont_use_universal", "INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 0, false);
    declareFunction(myName, "redeclare_inference_removal_module", "REDECLARE-INFERENCE-REMOVAL-MODULE", 1, 0, false);
    declareFunction(myName, "strengthen_removal_module_properties", "STRENGTHEN-REMOVAL-MODULE-PROPERTIES", 2, 0, false);
    declareFunction(myName, "undeclare_inference_removal_module", "UNDECLARE-INFERENCE-REMOVAL-MODULE", 1, 1, false);
    declareFunction(myName, "undeclare_inference_meta_removal_module", "UNDECLARE-INFERENCE-META-REMOVAL-MODULE", 1, 0, false);
    declareFunction(myName, "undeclare_inference_removal_module_use_generic", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 1, false);
    declareFunction(myName, "undeclare_inference_removal_module_use_meta_removal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 1, false);
    declareFunction(myName, "undeclare_inference_removal_module_dont_use_universal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 1, false);
    declareFunction(myName, "reclassify_removal_modules", "RECLASSIFY-REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "clear_removal_modules", "CLEAR-REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "classify_removal_module", "CLASSIFY-REMOVAL-MODULE", 1, 0, false);
    declareFunction(myName, "inference_removal_module_note_specific", "INFERENCE-REMOVAL-MODULE-NOTE-SPECIFIC", 2, 0, false);
    declareMacro(myName, "do_conjunctive_removal_modules", "DO-CONJUNCTIVE-REMOVAL-MODULES");
    declareFunction(myName, "removal_modules_conjunctive", "REMOVAL-MODULES-CONJUNCTIVE", 0, 0, false);
    declareFunction(myName, "conjunctive_removal_module_p", "CONJUNCTIVE-REMOVAL-MODULE-P", 1, 0, false);
    declareFunction(myName, "conjunctive_removal_module_count", "CONJUNCTIVE-REMOVAL-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "conjunctive_removal_modules", "CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "inference_conjunctive_removal_module", "INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 2, 0, false);
    declareFunction(myName, "undeclare_inference_conjunctive_removal_module", "UNDECLARE-INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 1, 0, false);
    declareMacro(myName, "do_meta_removal_modules", "DO-META-REMOVAL-MODULES");
    declareFunction(myName, "meta_removal_modules", "META-REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "meta_removal_module_list", "META-REMOVAL-MODULE-LIST", 0, 0, false);
    declareFunction(myName, "meta_removal_module_p", "META-REMOVAL-MODULE-P", 1, 0, false);
    declareFunction(myName, "meta_removal_module_count", "META-REMOVAL-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "meta_removal_module_specific_predicates", "META-REMOVAL-MODULE-SPECIFIC-PREDICATES", 1, 0, false);
    declareFunction(myName, "meta_removal_module_specific_predicateP", "META-REMOVAL-MODULE-SPECIFIC-PREDICATE?", 2, 0, false);
    declareFunction(myName, "predicate_uses_meta_removal_moduleP", "PREDICATE-USES-META-REMOVAL-MODULE?", 2, 0, false);
    declareFunction(myName, "inference_meta_removal_module", "INFERENCE-META-REMOVAL-MODULE", 1, 1, false);
    declareFunction(myName, "removal_proof_module_p", "REMOVAL-PROOF-MODULE-P", 1, 0, false);
    declareMacro(myName, "do_transformation_modules", "DO-TRANSFORMATION-MODULES");
    declareFunction(myName, "transformation_modules", "TRANSFORMATION-MODULES", 0, 0, false);
    declareFunction(myName, "transformation_module_p", "TRANSFORMATION-MODULE-P", 1, 0, false);
    declareFunction(myName, "transformation_module_count", "TRANSFORMATION-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "inference_transformation_module", "INFERENCE-TRANSFORMATION-MODULE", 2, 0, false);
    declareMacro(myName, "do_meta_transformation_modules", "DO-META-TRANSFORMATION-MODULES");
    declareFunction(myName, "meta_transformation_modules", "META-TRANSFORMATION-MODULES", 0, 0, false);
    declareFunction(myName, "meta_transformation_module_p", "META-TRANSFORMATION-MODULE-P", 1, 0, false);
    declareFunction(myName, "meta_transformation_module_count", "META-TRANSFORMATION-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "inference_meta_transformation_module", "INFERENCE-META-TRANSFORMATION-MODULE", 1, 1, false);
    declareMacro(myName, "do_rewrite_modules", "DO-REWRITE-MODULES");
    declareFunction(myName, "rewrite_modules", "REWRITE-MODULES", 0, 0, false);
    declareFunction(myName, "rewrite_module_p", "REWRITE-MODULE-P", 1, 0, false);
    declareFunction(myName, "rewrite_module_count", "REWRITE-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "rewrite_module_support", "REWRITE-MODULE-SUPPORT", 1, 0, false);
    declareFunction(myName, "rewrite_module_closure", "REWRITE-MODULE-CLOSURE", 1, 0, false);
    declareFunction(myName, "inference_rewrite_module", "INFERENCE-REWRITE-MODULE", 2, 0, false);
    declareFunction(myName, "undeclare_rewrite_module", "UNDECLARE-REWRITE-MODULE", 1, 0, false);
    declareFunction(myName, "undeclare_rewrite_module_by_name", "UNDECLARE-REWRITE-MODULE-BY-NAME", 1, 0, false);
    declareFunction(myName, "deregister_rewrite_module", "DEREGISTER-REWRITE-MODULE", 1, 0, false);
    declareFunction(myName, "deregister_rewrite_module_by_name", "DEREGISTER-REWRITE-MODULE-BY-NAME", 1, 0, false);
    declareFunction(myName, "strengthen_rewrite_module_properties", "STRENGTHEN-REWRITE-MODULE-PROPERTIES", 2, 0, false);
    declareFunction(myName, "structural_module_p", "STRUCTURAL-MODULE-P", 1, 0, false);
    declareFunction(myName, "inference_structural_module", "INFERENCE-STRUCTURAL-MODULE", 1, 1, false);
    declareFunction(myName, "structural_module_count", "STRUCTURAL-MODULE-COUNT", 0, 0, false);
    declareMacro(myName, "do_meta_structural_modules", "DO-META-STRUCTURAL-MODULES");
    declareFunction(myName, "meta_structural_modules", "META-STRUCTURAL-MODULES", 0, 0, false);
    declareFunction(myName, "meta_structural_module_p", "META-STRUCTURAL-MODULE-P", 1, 0, false);
    declareFunction(myName, "meta_structural_module_count", "META-STRUCTURAL-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "inference_meta_structural_module", "INFERENCE-META-STRUCTURAL-MODULE", 1, 1, false);
    declareFunction(myName, "cfasl_output_object_hl_module_method", "CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_wide_output_hl_module", "CFASL-WIDE-OUTPUT-HL-MODULE", 2, 0, false);
    declareFunction(myName, "cfasl_output_hl_module_internal", "CFASL-OUTPUT-HL-MODULE-INTERNAL", 2, 0, false);
    declareFunction(myName, "cfasl_input_hl_module", "CFASL-INPUT-HL-MODULE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_modules_file() {
    $meta_removal_modules$ = deflexical("*META-REMOVAL-MODULES*", maybeDefault( $sym0$_META_REMOVAL_MODULES_, $meta_removal_modules$, NIL));
    $hl_module_properties$ = deflexical("*HL-MODULE-PROPERTIES*", $list1);
    $valid_hl_module_subtypes$ = deflexical("*VALID-HL-MODULE-SUBTYPES*", $list10);
    $default_hl_module_subtype$ = deflexical("*DEFAULT-HL-MODULE-SUBTYPE*", $kw11$KB);
    $hl_module_property_defaults$ = deflexical("*HL-MODULE-PROPERTY-DEFAULTS*", dictionary_utilities.new_dictionary_from_alist(Sequences.reverse(listS($list12, list($kw13$MODULE_SUBTYPE, $default_hl_module_subtype$.getGlobalValue()), $list14)), Symbols.symbol_function(EQ)));
    $dtp_hl_module$ = defconstant("*DTP-HL-MODULE*", $sym22$HL_MODULE);
    $hl_module_store$ = deflexical("*HL-MODULE-STORE*", maybeDefault( $sym75$_HL_MODULE_STORE_, $hl_module_store$, ()-> (Hashtables.make_hash_table($int76$212, Symbols.symbol_function(EQUAL), UNPROVIDED))));
    $removal_modules$ = deflexical("*REMOVAL-MODULES*", maybeDefault( $sym133$_REMOVAL_MODULES_, $removal_modules$, ()-> (set.new_set(Symbols.symbol_function(EQ), UNPROVIDED))));
    $removal_modules_external$ = deflexical("*REMOVAL-MODULES-EXTERNAL*", maybeDefault( $sym139$_REMOVAL_MODULES_EXTERNAL_, $removal_modules_external$, NIL));
    $removal_modules_generic$ = deflexical("*REMOVAL-MODULES-GENERIC*", maybeDefault( $sym140$_REMOVAL_MODULES_GENERIC_, $removal_modules_generic$, NIL));
    $removal_modules_universal$ = deflexical("*REMOVAL-MODULES-UNIVERSAL*", maybeDefault( $sym142$_REMOVAL_MODULES_UNIVERSAL_, $removal_modules_universal$, NIL));
    $removal_modules_specific$ = deflexical("*REMOVAL-MODULES-SPECIFIC*", maybeDefault( $sym143$_REMOVAL_MODULES_SPECIFIC_, $removal_modules_specific$, ()-> (Hashtables.make_hash_table($int144$32, UNPROVIDED, UNPROVIDED))));
    $removal_modules_specific_use_generic$ = deflexical("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*", maybeDefault( $sym146$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_, $removal_modules_specific_use_generic$, NIL));
    $removal_modules_specific_use_meta_removal$ = deflexical("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*", maybeDefault( $sym147$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_, $removal_modules_specific_use_meta_removal$, NIL));
    $removal_modules_specific_dont_use_universal$ = deflexical("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*", maybeDefault( $sym148$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_, $removal_modules_specific_dont_use_universal$, NIL));
    $solely_specific_removal_module_predicate_store$ = deflexical("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*", maybeDefault( $sym149$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_, $solely_specific_removal_module_predicate_store$, ()-> (set.new_set(EQ, $int150$50))));
    $conjunctive_removal_modules$ = deflexical("*CONJUNCTIVE-REMOVAL-MODULES*", maybeDefault( $sym156$_CONJUNCTIVE_REMOVAL_MODULES_, $conjunctive_removal_modules$, ()-> (set.new_set(Symbols.symbol_function(EQ), UNPROVIDED))));
    $transformation_modules$ = deflexical("*TRANSFORMATION-MODULES*", maybeDefault( $sym166$_TRANSFORMATION_MODULES_, $transformation_modules$, NIL));
    $meta_transformation_modules$ = deflexical("*META-TRANSFORMATION-MODULES*", maybeDefault( $sym171$_META_TRANSFORMATION_MODULES_, $meta_transformation_modules$, NIL));
    $rewrite_modules$ = deflexical("*REWRITE-MODULES*", maybeDefault( $sym176$_REWRITE_MODULES_, $rewrite_modules$, NIL));
    $structural_modules$ = deflexical("*STRUCTURAL-MODULES*", maybeDefault( $sym182$_STRUCTURAL_MODULES_, $structural_modules$, NIL));
    $meta_structural_modules$ = deflexical("*META-STRUCTURAL-MODULES*", maybeDefault( $sym184$_META_STRUCTURAL_MODULES_, $meta_structural_modules$, NIL));
    $cfasl_wide_opcode_hl_module$ = defconstant("*CFASL-WIDE-OPCODE-HL-MODULE*", $int189$256);
    return NIL;
  }

  public static final SubLObject setup_inference_modules_file() {
        subl_macro_promotions.declare_defglobal($sym0$_META_REMOVAL_MODULES_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function($sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym29$HL_MOD_NAME, $sym30$_CSETF_HL_MOD_NAME);
    Structures.def_csetf($sym31$HL_MOD_PLIST, $sym32$_CSETF_HL_MOD_PLIST);
    Structures.def_csetf($sym33$HL_MOD_SENSE, $sym34$_CSETF_HL_MOD_SENSE);
    Structures.def_csetf($sym35$HL_MOD_PREDICATE, $sym36$_CSETF_HL_MOD_PREDICATE);
    Structures.def_csetf($sym37$HL_MOD_ANY_PREDICATES, $sym38$_CSETF_HL_MOD_ANY_PREDICATES);
    Structures.def_csetf($sym39$HL_MOD_ARITY, $sym40$_CSETF_HL_MOD_ARITY);
    Structures.def_csetf($sym41$HL_MOD_DIRECTION, $sym42$_CSETF_HL_MOD_DIRECTION);
    Structures.def_csetf($sym43$HL_MOD_REQUIRED_PATTERN, $sym44$_CSETF_HL_MOD_REQUIRED_PATTERN);
    Structures.def_csetf($sym45$HL_MOD_REQUIRED_MT, $sym46$_CSETF_HL_MOD_REQUIRED_MT);
    Structures.def_csetf($sym47$HL_MOD_EXCLUSIVE_FUNC, $sym48$_CSETF_HL_MOD_EXCLUSIVE_FUNC);
    Structures.def_csetf($sym49$HL_MOD_REQUIRED_FUNC, $sym50$_CSETF_HL_MOD_REQUIRED_FUNC);
    Structures.def_csetf($sym51$HL_MOD_COMPLETENESS, $sym52$_CSETF_HL_MOD_COMPLETENESS);
    Equality.identity($sym22$HL_MODULE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function($sym67$SXHASH_HL_MODULE_METHOD));
    subl_macro_promotions.declare_defglobal($sym75$_HL_MODULE_STORE_);
    access_macros.register_macro_helper($sym85$HL_MODULE_STORE, $sym86$DO_HL_MODULES);
    subl_macro_promotions.declare_defglobal($sym133$_REMOVAL_MODULES_);
    access_macros.register_macro_helper($sym137$REMOVAL_MODULES, $sym138$DO_REMOVAL_MODULES);
    subl_macro_promotions.declare_defglobal($sym139$_REMOVAL_MODULES_EXTERNAL_);
    subl_macro_promotions.declare_defglobal($sym140$_REMOVAL_MODULES_GENERIC_);
    subl_macro_promotions.declare_defglobal($sym142$_REMOVAL_MODULES_UNIVERSAL_);
    subl_macro_promotions.declare_defglobal($sym143$_REMOVAL_MODULES_SPECIFIC_);
    subl_macro_promotions.declare_defglobal($sym146$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_);
    subl_macro_promotions.declare_defglobal($sym147$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_);
    subl_macro_promotions.declare_defglobal($sym148$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_);
    subl_macro_promotions.declare_defglobal($sym149$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_);
    subl_macro_promotions.declare_defglobal($sym156$_CONJUNCTIVE_REMOVAL_MODULES_);
    access_macros.register_macro_helper($sym159$REMOVAL_MODULES_CONJUNCTIVE, $sym160$DO_CONJUNCTIVE_REMOVAL_MODULES);
    access_macros.register_macro_helper($sym163$META_REMOVAL_MODULES, $sym164$DO_META_REMOVAL_MODULES);
    subl_macro_promotions.declare_defglobal($sym166$_TRANSFORMATION_MODULES_);
    access_macros.register_macro_helper($sym168$TRANSFORMATION_MODULES, $sym169$DO_TRANSFORMATION_MODULES);
    subl_macro_promotions.declare_defglobal($sym171$_META_TRANSFORMATION_MODULES_);
    access_macros.register_macro_helper($sym173$META_TRANSFORMATION_MODULES, $sym174$DO_META_TRANSFORMATION_MODULES);
    subl_macro_promotions.declare_defglobal($sym176$_REWRITE_MODULES_);
    subl_macro_promotions.declare_defglobal($sym182$_STRUCTURAL_MODULES_);
    subl_macro_promotions.declare_defglobal($sym184$_META_STRUCTURAL_MODULES_);
    access_macros.register_macro_helper($sym186$META_STRUCTURAL_MODULES, $sym187$DO_META_STRUCTURAL_MODULES);
    cfasl.register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_hl_module$.getGlobalValue(), $sym190$CFASL_INPUT_HL_MODULE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function($sym191$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_META_REMOVAL_MODULES_ = makeSymbol("*META-REMOVAL-MODULES*");
  public static final SubLList $list1 = list(new SubLObject[] {makeKeyword("MODULE-TYPE"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("MODULE-SOURCE"), makeKeyword("CHECK"), makeKeyword("EXTERNAL"), makeKeyword("UNIVERSAL"), makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("PREDICATE"), makeKeyword("EVERY-PREDICATES"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("ARITY"), makeKeyword("EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("REQUIRED"), makeKeyword("APPLICABILITY-PATTERN"), makeKeyword("APPLICABILITY"), makeKeyword("COST-PATTERN"), makeKeyword("COST-EXPRESSION"), makeKeyword("COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE-PATTERN"), makeKeyword("COMPLETENESS-PATTERN"), makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("OUTPUT-CHECK-PATTERN"), makeKeyword("OUTPUT-GENERATE-PATTERN"), makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("RULE-SELECT"), makeKeyword("RULE-FILTER"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), makeKeyword("EXPAND-PATTERN"), makeKeyword("EXPAND"), makeKeyword("REWRITE-CLOSURE"), makeKeyword("SUPPORT-PATTERN"), makeKeyword("SUPPORT"), makeKeyword("SUPPORT-MODULE"), makeKeyword("SUPPORT-MT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("REWRITE-SUPPORT"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("INCOMPLETENESS"), makeKeyword("ADD"), makeKeyword("REMOVE"), makeKeyword("REMOVE-ALL"), makeKeyword("PREFERRED-OVER"), makeKeyword("DOCUMENTATION"), makeKeyword("EXAMPLE"), makeKeyword("PRETTY-NAME")});
  public static final SubLList $list2 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("VALUE-VAR"), makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym3$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");
  public static final SubLSymbol $sym4$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym5$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLList $list6 = list(list(makeSymbol("HL-MODULE-PROPERTIES")));
  public static final SubLSymbol $sym7$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_ = makeSymbol("HL-MODULE-PROPERTY-NOT-DEFAULT?");
  public static final SubLSymbol $sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES = makeSymbol("HL-MODULE-PROPERTY-WITHOUT-VALUES");
  public static final SubLList $list10 = list(makeKeyword("SKSI"), makeKeyword("KB"), makeKeyword("ABDUCTION"));
  public static final SubLSymbol $kw11$KB = makeKeyword("KB");
  public static final SubLList $list12 = list(makeKeyword("MODULE-TYPE"));
  public static final SubLSymbol $kw13$MODULE_SUBTYPE = makeKeyword("MODULE-SUBTYPE");
  public static final SubLList $list14 = list(new SubLObject[] {list(makeKeyword("MODULE-SOURCE")), list(makeKeyword("UNIVERSAL")), list(makeKeyword("SENSE")), cons(makeKeyword("REQUIRED-PATTERN"), makeKeyword("ANYTHING")), list(makeKeyword("REQUIRED-MT")), list(makeKeyword("REQUIRED")), list(makeKeyword("COST-PATTERN")), list(makeKeyword("COST-EXPRESSION")), cons(makeKeyword("COST"), makeSymbol("DEFAULT-COST-FUNC")), list(makeKeyword("COMPLETENESS")), list(makeKeyword("COMPLETE-PATTERN")), list(makeKeyword("COMPLETENESS-PATTERN")), cons(makeKeyword("CHECK"), makeKeyword("UNKNOWN")), list(makeKeyword("RULE-SELECT")), cons(makeKeyword("EXPAND"), makeKeyword("DEFAULT")), list(makeKeyword("EXPAND-PATTERN")), list(makeKeyword("EXPAND-ITERATIVE-PATTERN")), list(makeKeyword("PREDICATE")), list(makeKeyword("ARITY")), list(makeKeyword("EXCLUSIVE")), cons(makeKeyword("SUPPLANTS"), makeKeyword("ALL")), cons(makeKeyword("DIRECTION"), makeKeyword("FORWARD")), cons(makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT")), cons(makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")), cons(makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("OUTPUT-CHECK-PATTERN")), list(makeKeyword("OUTPUT-GENERATE-PATTERN")), cons(makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("INPUT")), cons(makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")), cons(makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("SUPPORT-PATTERN")), list(makeKeyword("SUPPORT")), cons(makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE")), list(makeKeyword("SUPPORT-MT")), cons(makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT")), list(makeKeyword("EVERY-PREDICATES")), cons(makeKeyword("APPLICABILITY"), makeSymbol("FALSE")), list(makeKeyword("APPLICABILITY-PATTERN")), list(makeKeyword("ANY-PREDICATES")), cons(makeKeyword("DOCUMENTATION"), makeString("")), cons(makeKeyword("EXAMPLE"), makeString("")), list(makeKeyword("EXTERNAL")), list(makeKeyword("REWRITE-SUPPORT")), list(makeKeyword("REWRITE-CLOSURE"))});
  public static final SubLSymbol $kw15$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw16$OR = makeKeyword("OR");
  public static final SubLSymbol $sym17$ALLOWED_MODULES_SPEC_P = makeSymbol("ALLOWED-MODULES-SPEC-P");
  public static final SubLSymbol $kw18$AND = makeKeyword("AND");
  public static final SubLSymbol $kw19$NOT = makeKeyword("NOT");
  public static final SubLSymbol $kw20$MODULE_TYPE = makeKeyword("MODULE-TYPE");
  public static final SubLSymbol $sym21$HL_MODULE_P = makeSymbol("HL-MODULE-P");
  public static final SubLSymbol $sym22$HL_MODULE = makeSymbol("HL-MODULE");
  public static final SubLList $list23 = list(new SubLObject[] {makeSymbol("NAME"), makeSymbol("PLIST"), makeSymbol("SENSE"), makeSymbol("PREDICATE"), makeSymbol("ANY-PREDICATES"), makeSymbol("ARITY"), makeSymbol("DIRECTION"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("REQUIRED-MT"), makeSymbol("EXCLUSIVE-FUNC"), makeSymbol("REQUIRED-FUNC"), makeSymbol("COMPLETENESS")});
  public static final SubLList $list24 = list(new SubLObject[] {makeKeyword("NAME"), makeKeyword("PLIST"), makeKeyword("SENSE"), makeKeyword("PREDICATE"), makeKeyword("ANY-PREDICATES"), makeKeyword("ARITY"), makeKeyword("DIRECTION"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("EXCLUSIVE-FUNC"), makeKeyword("REQUIRED-FUNC"), makeKeyword("COMPLETENESS")});
  public static final SubLList $list25 = list(new SubLObject[] {makeSymbol("HL-MOD-NAME"), makeSymbol("HL-MOD-PLIST"), makeSymbol("HL-MOD-SENSE"), makeSymbol("HL-MOD-PREDICATE"), makeSymbol("HL-MOD-ANY-PREDICATES"), makeSymbol("HL-MOD-ARITY"), makeSymbol("HL-MOD-DIRECTION"), makeSymbol("HL-MOD-REQUIRED-PATTERN"), makeSymbol("HL-MOD-REQUIRED-MT"), makeSymbol("HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("HL-MOD-REQUIRED-FUNC"), makeSymbol("HL-MOD-COMPLETENESS")});
  public static final SubLList $list26 = list(new SubLObject[] {makeSymbol("_CSETF-HL-MOD-NAME"), makeSymbol("_CSETF-HL-MOD-PLIST"), makeSymbol("_CSETF-HL-MOD-SENSE"), makeSymbol("_CSETF-HL-MOD-PREDICATE"), makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES"), makeSymbol("_CSETF-HL-MOD-ARITY"), makeSymbol("_CSETF-HL-MOD-DIRECTION"), makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN"), makeSymbol("_CSETF-HL-MOD-REQUIRED-MT"), makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC"), makeSymbol("_CSETF-HL-MOD-COMPLETENESS")});
  public static final SubLSymbol $sym27$PRINT_HL_MODULE = makeSymbol("PRINT-HL-MODULE");
  public static final SubLSymbol $sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HL-MODULE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym29$HL_MOD_NAME = makeSymbol("HL-MOD-NAME");
  public static final SubLSymbol $sym30$_CSETF_HL_MOD_NAME = makeSymbol("_CSETF-HL-MOD-NAME");
  public static final SubLSymbol $sym31$HL_MOD_PLIST = makeSymbol("HL-MOD-PLIST");
  public static final SubLSymbol $sym32$_CSETF_HL_MOD_PLIST = makeSymbol("_CSETF-HL-MOD-PLIST");
  public static final SubLSymbol $sym33$HL_MOD_SENSE = makeSymbol("HL-MOD-SENSE");
  public static final SubLSymbol $sym34$_CSETF_HL_MOD_SENSE = makeSymbol("_CSETF-HL-MOD-SENSE");
  public static final SubLSymbol $sym35$HL_MOD_PREDICATE = makeSymbol("HL-MOD-PREDICATE");
  public static final SubLSymbol $sym36$_CSETF_HL_MOD_PREDICATE = makeSymbol("_CSETF-HL-MOD-PREDICATE");
  public static final SubLSymbol $sym37$HL_MOD_ANY_PREDICATES = makeSymbol("HL-MOD-ANY-PREDICATES");
  public static final SubLSymbol $sym38$_CSETF_HL_MOD_ANY_PREDICATES = makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES");
  public static final SubLSymbol $sym39$HL_MOD_ARITY = makeSymbol("HL-MOD-ARITY");
  public static final SubLSymbol $sym40$_CSETF_HL_MOD_ARITY = makeSymbol("_CSETF-HL-MOD-ARITY");
  public static final SubLSymbol $sym41$HL_MOD_DIRECTION = makeSymbol("HL-MOD-DIRECTION");
  public static final SubLSymbol $sym42$_CSETF_HL_MOD_DIRECTION = makeSymbol("_CSETF-HL-MOD-DIRECTION");
  public static final SubLSymbol $sym43$HL_MOD_REQUIRED_PATTERN = makeSymbol("HL-MOD-REQUIRED-PATTERN");
  public static final SubLSymbol $sym44$_CSETF_HL_MOD_REQUIRED_PATTERN = makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN");
  public static final SubLSymbol $sym45$HL_MOD_REQUIRED_MT = makeSymbol("HL-MOD-REQUIRED-MT");
  public static final SubLSymbol $sym46$_CSETF_HL_MOD_REQUIRED_MT = makeSymbol("_CSETF-HL-MOD-REQUIRED-MT");
  public static final SubLSymbol $sym47$HL_MOD_EXCLUSIVE_FUNC = makeSymbol("HL-MOD-EXCLUSIVE-FUNC");
  public static final SubLSymbol $sym48$_CSETF_HL_MOD_EXCLUSIVE_FUNC = makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC");
  public static final SubLSymbol $sym49$HL_MOD_REQUIRED_FUNC = makeSymbol("HL-MOD-REQUIRED-FUNC");
  public static final SubLSymbol $sym50$_CSETF_HL_MOD_REQUIRED_FUNC = makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC");
  public static final SubLSymbol $sym51$HL_MOD_COMPLETENESS = makeSymbol("HL-MOD-COMPLETENESS");
  public static final SubLSymbol $sym52$_CSETF_HL_MOD_COMPLETENESS = makeSymbol("_CSETF-HL-MOD-COMPLETENESS");
  public static final SubLSymbol $kw53$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw54$PLIST = makeKeyword("PLIST");
  public static final SubLSymbol $kw55$SENSE = makeKeyword("SENSE");
  public static final SubLSymbol $kw56$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw57$ANY_PREDICATES = makeKeyword("ANY-PREDICATES");
  public static final SubLSymbol $kw58$ARITY = makeKeyword("ARITY");
  public static final SubLSymbol $kw59$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw60$REQUIRED_PATTERN = makeKeyword("REQUIRED-PATTERN");
  public static final SubLSymbol $kw61$REQUIRED_MT = makeKeyword("REQUIRED-MT");
  public static final SubLSymbol $kw62$EXCLUSIVE_FUNC = makeKeyword("EXCLUSIVE-FUNC");
  public static final SubLSymbol $kw63$REQUIRED_FUNC = makeKeyword("REQUIRED-FUNC");
  public static final SubLSymbol $kw64$COMPLETENESS = makeKeyword("COMPLETENESS");
  public static final SubLString $str65$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str66$_HL_Module___a_ = makeString("[HL Module: ~a]");
  public static final SubLSymbol $sym67$SXHASH_HL_MODULE_METHOD = makeSymbol("SXHASH-HL-MODULE-METHOD");
  public static final SubLSymbol $sym68$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym69$HL_MODULE_PROPERTY_P = makeSymbol("HL-MODULE-PROPERTY-P");
  public static final SubLSymbol $kw70$EXCLUSIVE = makeKeyword("EXCLUSIVE");
  public static final SubLSymbol $kw71$SUPPLANTS = makeKeyword("SUPPLANTS");
  public static final SubLString $str72$_supplants_is_meaningless_without = makeString(":supplants is meaningless without :exclusive being specified.  ~s contains a :supplants specification without an :exclusive.");
  public static final SubLSymbol $kw73$FREE = makeKeyword("FREE");
  public static final SubLSymbol $kw74$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym75$_HL_MODULE_STORE_ = makeSymbol("*HL-MODULE-STORE*");
  public static final SubLInteger $int76$212 = makeInteger(212);
  public static final SubLList $list77 = list(list(makeSymbol("HL-MODULE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list78 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw79$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw80$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym81$NAME_VAR = makeUninternedSymbol("NAME-VAR");
  public static final SubLSymbol $sym82$DO_HASH_TABLE = makeSymbol("DO-HASH-TABLE");
  public static final SubLList $list83 = list(makeSymbol("HL-MODULE-STORE"));
  public static final SubLSymbol $sym84$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym85$HL_MODULE_STORE = makeSymbol("HL-MODULE-STORE");
  public static final SubLSymbol $sym86$DO_HL_MODULES = makeSymbol("DO-HL-MODULES");
  public static final SubLSymbol $kw87$ABDUCTION = makeKeyword("ABDUCTION");
  public static final SubLSymbol $kw88$UNIVERSAL = makeKeyword("UNIVERSAL");
  public static final SubLSymbol $kw89$MODULE_SOURCE = makeKeyword("MODULE-SOURCE");
  public static final SubLSymbol $kw90$ANYTHING = makeKeyword("ANYTHING");
  public static final SubLSymbol $kw91$REQUIRED = makeKeyword("REQUIRED");
  public static final SubLSymbol $kw92$COST_PATTERN = makeKeyword("COST-PATTERN");
  public static final SubLSymbol $kw93$COST_EXPRESSION = makeKeyword("COST-EXPRESSION");
  public static final SubLSymbol $kw94$COST = makeKeyword("COST");
  public static final SubLSymbol $kw95$CHECK = makeKeyword("CHECK");
  public static final SubLSymbol $kw96$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $kw97$NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");
  public static final SubLString $str98$check = makeString("check");
  public static final SubLSymbol $kw99$RULE_SELECT = makeKeyword("RULE-SELECT");
  public static final SubLSymbol $kw100$RULE_FILTER = makeKeyword("RULE-FILTER");
  public static final SubLSymbol $kw101$EXPAND = makeKeyword("EXPAND");
  public static final SubLSymbol $kw102$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $sym103$INFERENCE_REMOVE_CHECK_DEFAULT = makeSymbol("INFERENCE-REMOVE-CHECK-DEFAULT");
  public static final SubLSymbol $sym104$INFERENCE_REMOVE_UNIFY_DEFAULT = makeSymbol("INFERENCE-REMOVE-UNIFY-DEFAULT");
  public static final SubLSymbol $sym105$DEFAULT_EXPAND_FUNC = makeSymbol("DEFAULT-EXPAND-FUNC");
  public static final SubLSymbol $kw106$EXPAND_PATTERN = makeKeyword("EXPAND-PATTERN");
  public static final SubLSymbol $kw107$EXPAND_ITERATIVE_PATTERN = makeKeyword("EXPAND-ITERATIVE-PATTERN");
  public static final SubLSymbol $sym108$PATTERN_MATCHES_FORMULA = makeSymbol("PATTERN-MATCHES-FORMULA");
  public static final SubLSymbol $kw109$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw110$INPUT_EXTRACT_PATTERN = makeKeyword("INPUT-EXTRACT-PATTERN");
  public static final SubLSymbol $kw111$INPUT_VERIFY_PATTERN = makeKeyword("INPUT-VERIFY-PATTERN");
  public static final SubLSymbol $kw112$INPUT_ENCODE_PATTERN = makeKeyword("INPUT-ENCODE-PATTERN");
  public static final SubLSymbol $kw113$OUTPUT_CHECK_PATTERN = makeKeyword("OUTPUT-CHECK-PATTERN");
  public static final SubLSymbol $kw114$OUTPUT_GENERATE_PATTERN = makeKeyword("OUTPUT-GENERATE-PATTERN");
  public static final SubLSymbol $kw115$OUTPUT_DECODE_PATTERN = makeKeyword("OUTPUT-DECODE-PATTERN");
  public static final SubLSymbol $kw116$OUTPUT_VERIFY_PATTERN = makeKeyword("OUTPUT-VERIFY-PATTERN");
  public static final SubLSymbol $kw117$OUTPUT_CONSTRUCT_PATTERN = makeKeyword("OUTPUT-CONSTRUCT-PATTERN");
  public static final SubLSymbol $kw118$SUPPORT_PATTERN = makeKeyword("SUPPORT-PATTERN");
  public static final SubLSymbol $kw119$SUPPORT = makeKeyword("SUPPORT");
  public static final SubLSymbol $kw120$SUPPORT_MODULE = makeKeyword("SUPPORT-MODULE");
  public static final SubLSymbol $kw121$SUPPORT_MT = makeKeyword("SUPPORT-MT");
  public static final SubLSymbol $kw122$SUPPORT_STRENGTH = makeKeyword("SUPPORT-STRENGTH");
  public static final SubLSymbol $kw123$EVERY_PREDICATES = makeKeyword("EVERY-PREDICATES");
  public static final SubLSymbol $kw124$APPLICABILITY = makeKeyword("APPLICABILITY");
  public static final SubLSymbol $kw125$APPLICABILITY_PATTERN = makeKeyword("APPLICABILITY-PATTERN");
  public static final SubLSymbol $kw126$DOCUMENTATION = makeKeyword("DOCUMENTATION");
  public static final SubLSymbol $kw127$EXAMPLE = makeKeyword("EXAMPLE");
  public static final SubLSymbol $kw128$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $kw129$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw130$COMPLETE_PATTERN = makeKeyword("COMPLETE-PATTERN");
  public static final SubLSymbol $kw131$COMPLETENESS_PATTERN = makeKeyword("COMPLETENESS-PATTERN");
  public static final SubLSymbol $kw132$EXTERNAL = makeKeyword("EXTERNAL");
  public static final SubLSymbol $sym133$_REMOVAL_MODULES_ = makeSymbol("*REMOVAL-MODULES*");
  public static final SubLList $list134 = list(list(makeSymbol("HL-MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym135$DO_SET = makeSymbol("DO-SET");
  public static final SubLList $list136 = list(makeSymbol("REMOVAL-MODULES"));
  public static final SubLSymbol $sym137$REMOVAL_MODULES = makeSymbol("REMOVAL-MODULES");
  public static final SubLSymbol $sym138$DO_REMOVAL_MODULES = makeSymbol("DO-REMOVAL-MODULES");
  public static final SubLSymbol $sym139$_REMOVAL_MODULES_EXTERNAL_ = makeSymbol("*REMOVAL-MODULES-EXTERNAL*");
  public static final SubLSymbol $sym140$_REMOVAL_MODULES_GENERIC_ = makeSymbol("*REMOVAL-MODULES-GENERIC*");
  public static final SubLSymbol $sym141$HL_MODULE_SENSE = makeSymbol("HL-MODULE-SENSE");
  public static final SubLSymbol $sym142$_REMOVAL_MODULES_UNIVERSAL_ = makeSymbol("*REMOVAL-MODULES-UNIVERSAL*");
  public static final SubLSymbol $sym143$_REMOVAL_MODULES_SPECIFIC_ = makeSymbol("*REMOVAL-MODULES-SPECIFIC*");
  public static final SubLInteger $int144$32 = makeInteger(32);
  public static final SubLSymbol $sym145$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym146$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_ = makeSymbol("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*");
  public static final SubLSymbol $sym147$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_ = makeSymbol("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*");
  public static final SubLSymbol $sym148$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_ = makeSymbol("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*");
  public static final SubLSymbol $sym149$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_ = makeSymbol("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*");
  public static final SubLInteger $int150$50 = makeInteger(50);
  public static final SubLSymbol $kw151$POS = makeKeyword("POS");
  public static final SubLSymbol $kw152$NEG = makeKeyword("NEG");
  public static final SubLString $str153$removal_module__S_must_have_a__SE = makeString("removal module ~S must have a :SENSE of :POS or :NEG");
  public static final SubLSymbol $sym154$CAR = makeSymbol("CAR");
  public static final SubLList $list155 = cons(makeSymbol("HL-MODULE"), makeSymbol("PREDICATES"));
  public static final SubLSymbol $sym156$_CONJUNCTIVE_REMOVAL_MODULES_ = makeSymbol("*CONJUNCTIVE-REMOVAL-MODULES*");
  public static final SubLList $list157 = list(list(makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list158 = list(makeSymbol("REMOVAL-MODULES-CONJUNCTIVE"));
  public static final SubLSymbol $sym159$REMOVAL_MODULES_CONJUNCTIVE = makeSymbol("REMOVAL-MODULES-CONJUNCTIVE");
  public static final SubLSymbol $sym160$DO_CONJUNCTIVE_REMOVAL_MODULES = makeSymbol("DO-CONJUNCTIVE-REMOVAL-MODULES");
  public static final SubLSymbol $kw161$REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
  public static final SubLList $list162 = list(makeSymbol("META-REMOVAL-MODULES"));
  public static final SubLSymbol $sym163$META_REMOVAL_MODULES = makeSymbol("META-REMOVAL-MODULES");
  public static final SubLSymbol $sym164$DO_META_REMOVAL_MODULES = makeSymbol("DO-META-REMOVAL-MODULES");
  public static final SubLSymbol $kw165$META_REMOVAL = makeKeyword("META-REMOVAL");
  public static final SubLSymbol $sym166$_TRANSFORMATION_MODULES_ = makeSymbol("*TRANSFORMATION-MODULES*");
  public static final SubLList $list167 = list(makeSymbol("TRANSFORMATION-MODULES"));
  public static final SubLSymbol $sym168$TRANSFORMATION_MODULES = makeSymbol("TRANSFORMATION-MODULES");
  public static final SubLSymbol $sym169$DO_TRANSFORMATION_MODULES = makeSymbol("DO-TRANSFORMATION-MODULES");
  public static final SubLSymbol $kw170$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $sym171$_META_TRANSFORMATION_MODULES_ = makeSymbol("*META-TRANSFORMATION-MODULES*");
  public static final SubLList $list172 = list(makeSymbol("META-TRANSFORMATION-MODULES"));
  public static final SubLSymbol $sym173$META_TRANSFORMATION_MODULES = makeSymbol("META-TRANSFORMATION-MODULES");
  public static final SubLSymbol $sym174$DO_META_TRANSFORMATION_MODULES = makeSymbol("DO-META-TRANSFORMATION-MODULES");
  public static final SubLSymbol $kw175$META_TRANSFORMATION = makeKeyword("META-TRANSFORMATION");
  public static final SubLSymbol $sym176$_REWRITE_MODULES_ = makeSymbol("*REWRITE-MODULES*");
  public static final SubLList $list177 = list(makeSymbol("REWRITE-MODULES"));
  public static final SubLSymbol $kw178$REWRITE_SUPPORT = makeKeyword("REWRITE-SUPPORT");
  public static final SubLSymbol $kw179$REWRITE_CLOSURE = makeKeyword("REWRITE-CLOSURE");
  public static final SubLSymbol $kw180$REWRITE = makeKeyword("REWRITE");
  public static final SubLString $str181$rewrite_module__S_must_have_a__SE = makeString("rewrite module ~S must have a :SENSE of :POS or :NEG");
  public static final SubLSymbol $sym182$_STRUCTURAL_MODULES_ = makeSymbol("*STRUCTURAL-MODULES*");
  public static final SubLSymbol $kw183$STRUCTURAL = makeKeyword("STRUCTURAL");
  public static final SubLSymbol $sym184$_META_STRUCTURAL_MODULES_ = makeSymbol("*META-STRUCTURAL-MODULES*");
  public static final SubLList $list185 = list(makeSymbol("META-STRUCTURAL-MODULES"));
  public static final SubLSymbol $sym186$META_STRUCTURAL_MODULES = makeSymbol("META-STRUCTURAL-MODULES");
  public static final SubLSymbol $sym187$DO_META_STRUCTURAL_MODULES = makeSymbol("DO-META-STRUCTURAL-MODULES");
  public static final SubLSymbol $kw188$META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
  public static final SubLInteger $int189$256 = makeInteger(256);
  public static final SubLSymbol $sym190$CFASL_INPUT_HL_MODULE = makeSymbol("CFASL-INPUT-HL-MODULE");
  public static final SubLSymbol $sym191$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD");

  //// Initializers

  public void declareFunctions() {
    declare_inference_modules_file();
  }

  public void initializeVariables() {
    init_inference_modules_file();
  }

  public void runTopLevelForms() {
    setup_inference_modules_file();
  }

}
