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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.cfasl_kb_methods;
//dm import com.cyc.cycjava_1.cycl.cfasl_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.deductions_low;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_hl_support_manager;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.keyhash_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kb_hl_supports extends SubLTranslatedFile {

  //// Constructor

  private kb_hl_supports() {}
  public static final SubLFile me = new kb_hl_supports();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_hl_supports";

  //// Definitions

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 806) 
  public static final SubLObject find_kb_hl_support(SubLObject hl_support) {
    {
      SubLObject kb_hl_support = find_kb_hl_support_during_creation(hl_support);
      return ((NIL != kb_hl_support) ? ((SubLObject) kb_hl_support) : lookup_kb_hl_support(hl_support));
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 1060) 
  public static final SubLObject find_kb_hl_support_by_id(SubLObject id) {
    return lookup_kb_hl_support_by_id(id);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 1147) 
  public static final SubLObject find_kb_hl_supports_mentioning_term(SubLObject v_term) {
    return lookup_kb_hl_supports_mentioning_term(v_term);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 1260) 
  public static final SubLObject kb_hl_support_count() {
    return ((NIL != $kb_hl_supports_from_ids$.getGlobalValue()) ? ((SubLObject) id_index.id_index_count($kb_hl_supports_from_ids$.getGlobalValue())) : ZERO_INTEGER);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 1659) 
  public static final SubLObject kb_hl_support_id(SubLObject kb_hl_support) {
    return kb_hl_support_get_id(kb_hl_support);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 2600) 
  public static final SubLObject do_kb_hl_support_dependents_helper(SubLObject kb_hl_support) {
    {
      SubLObject content = kb_hl_support_content(kb_hl_support);
      return kb_hl_support_content_get_dependents(content);
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 3339) 
  public static final SubLObject kb_hl_support_hl_support(SubLObject kb_hl_support) {
    {
      SubLObject content = kb_hl_support_content(kb_hl_support);
      SubLObject argument = kb_hl_support_content_get_argument(content);
      SubLObject hl_support = NIL;
      if ((NIL != deduction_handles.deduction_p(argument))) {
        hl_support = deductions_high.deduction_assertion(argument);
      } else if ((NIL != arguments.hl_support_p(argument))) {
        hl_support = argument;
      }
      return hl_support;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 3903) 
  public static final SubLObject kb_hl_support_sentence(SubLObject kb_hl_support) {
    {
      SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
      return ((NIL != arguments.hl_support_p(hl_support)) ? ((SubLObject) arguments.hl_support_sentence(hl_support)) : NIL);
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 4295) 
  public static final SubLObject kb_hl_support_tv(SubLObject kb_hl_support) {
    {
      SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
      return ((NIL != arguments.hl_support_p(hl_support)) ? ((SubLObject) arguments.hl_support_tv(hl_support)) : NIL);
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 5322) 
  public static final SubLObject find_or_possibly_create_kb_hl_support(SubLObject hl_support) {
    {
      SubLObject kb_hl_support = find_kb_hl_support(hl_support);
      if ((NIL == kb_hl_support)) {
        kb_hl_support = possibly_create_kb_hl_support(hl_support);
      }
      return kb_hl_support;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 5573) 
  public static final SubLObject possibly_create_kb_hl_support(SubLObject hl_support) {
    {
      SubLObject justification = hl_justify_for_kb_hl_support(hl_support);
      SubLObject kb_hl_support = NIL;
      if ((NIL != arguments.non_empty_hl_justification_p(justification))) {
        kb_hl_support = create_kb_hl_support(hl_support, justification);
      }
      return kb_hl_support;
    }
  }

  public static final class $kb_hl_support_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject $id = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($kb_hl_support_native.class, $sym12$KB_HL_SUPPORT, $sym13$KB_HL_SUPPORT_P, $list14, $list15, new String[] {"$id"}, $list16, $list17, $sym18$PRINT_KB_HL_SUPPORT);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 6104) 
  public static SubLSymbol $dtp_kb_hl_support$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 6104) 
  public static final SubLObject kb_hl_support_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11058");
    return NIL;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 6104) 
  public static final SubLObject kb_hl_support_p(SubLObject object) {
    return ((object.getClass() == $kb_hl_support_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $kb_hl_support_p$UnaryFunction extends UnaryFunction {
    public $kb_hl_support_p$UnaryFunction() { super(extractFunctionNamed("KB-HL-SUPPORT-P")); }
    public SubLObject processItem(SubLObject arg1) { return kb_hl_support_p(arg1); }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 6104) 
  public static final SubLObject kb_hls_id(SubLObject object) {
    checkType(object, $sym13$KB_HL_SUPPORT_P);
    return object.getField2();
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 6104) 
  public static final SubLObject _csetf_kb_hls_id(SubLObject object, SubLObject value) {
    checkType(object, $sym13$KB_HL_SUPPORT_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 6104) 
  public static final SubLObject make_kb_hl_support(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $kb_hl_support_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw22$ID)) {
            _csetf_kb_hls_id(v_new, current_value);
          } else {
            Errors.error($str23$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 6216) 
  public static SubLSymbol $print_kb_hl_support_hl_supportP$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 6680) 
  public static final SubLObject sxhash_kb_hl_support_method(SubLObject object) {
    {
      SubLObject id = kb_hls_id(object);
      return (id.isInteger() ? ((SubLObject) id) : $int27$787);
    }
  }

  public static final class $sxhash_kb_hl_support_method$UnaryFunction extends UnaryFunction {
    public $sxhash_kb_hl_support_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-KB-HL-SUPPORT-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_kb_hl_support_method(arg1); }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 6801) 
  public static final SubLObject new_kb_hl_support(SubLObject id) {
    {
      SubLObject kb_hl_support = NIL;
      kb_hl_support = make_kb_hl_support(UNPROVIDED);
      _csetf_kb_hls_id(kb_hl_support, id);
      return kb_hl_support;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7046) 
  public static final SubLObject free_kb_hl_support(SubLObject kb_hl_support) {
    _csetf_kb_hls_id(kb_hl_support, NIL);
    return kb_hl_support;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7177) 
  public static final SubLObject kb_hl_support_get_id(SubLObject kb_hl_support) {
    return kb_hls_id(kb_hl_support);
  }

  public static final class $kb_hl_support_content_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $argument; }
    public SubLObject getField3() { return $dependents; }
    public SubLObject setField2(SubLObject value) { return $argument = value; }
    public SubLObject setField3(SubLObject value) { return $dependents = value; }
    public SubLObject $argument = NIL;
    public SubLObject $dependents = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($kb_hl_support_content_native.class, $sym29$KB_HL_SUPPORT_CONTENT, $sym30$KB_HL_SUPPORT_CONTENT_P, $list31, $list32, new String[] {"$argument", "$dependents"}, $list33, $list34, $sym35$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7559) 
  public static SubLSymbol $dtp_kb_hl_support_content$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7559) 
  public static final SubLObject kb_hl_support_content_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $kb_hl_support_content_p$UnaryFunction extends UnaryFunction {
    public $kb_hl_support_content_p$UnaryFunction() { super(extractFunctionNamed("KB-HL-SUPPORT-CONTENT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11012"); }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7559) 
  public static final SubLObject kb_hlsc_argument(SubLObject object) {
    checkType(object, $sym30$KB_HL_SUPPORT_CONTENT_P);
    return object.getField2();
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7559) 
  public static final SubLObject kb_hlsc_dependents(SubLObject object) {
    checkType(object, $sym30$KB_HL_SUPPORT_CONTENT_P);
    return object.getField3();
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7559) 
  public static final SubLObject _csetf_kb_hlsc_argument(SubLObject object, SubLObject value) {
    checkType(object, $sym30$KB_HL_SUPPORT_CONTENT_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7559) 
  public static final SubLObject _csetf_kb_hlsc_dependents(SubLObject object, SubLObject value) {
    checkType(object, $sym30$KB_HL_SUPPORT_CONTENT_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7559) 
  public static final SubLObject make_kb_hl_support_content(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $kb_hl_support_content_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw41$ARGUMENT)) {
            _csetf_kb_hlsc_argument(v_new, current_value);
          } else if (pcase_var.eql($kw42$DEPENDENTS)) {
            _csetf_kb_hlsc_dependents(v_new, current_value);
          } else {
            Errors.error($str23$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7656) 
  public static final SubLObject new_kb_hl_support_content() {
    {
      SubLObject kb_hl_support_content = NIL;
      kb_hl_support_content = make_kb_hl_support_content(UNPROVIDED);
      return kb_hl_support_content;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 7898) 
  public static final SubLObject free_kb_hl_support_content(SubLObject kb_hl_support_content) {
    _csetf_kb_hlsc_argument(kb_hl_support_content, NIL);
    _csetf_kb_hlsc_dependents(kb_hl_support_content, NIL);
    return kb_hl_support_content;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 8125) 
  public static final SubLObject kb_hl_support_content_get_argument(SubLObject kb_hl_support_content) {
    return kb_hlsc_argument(kb_hl_support_content);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 8273) 
  public static final SubLObject kb_hl_support_content_get_dependents(SubLObject kb_hl_support_content) {
    return kb_hlsc_dependents(kb_hl_support_content);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 8403) 
  public static final SubLObject kb_hl_support_content_set_argument(SubLObject kb_hl_support_content, SubLObject deduction) {
    _csetf_kb_hlsc_argument(kb_hl_support_content, deduction);
    return kb_hl_support_content;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 8603) 
  public static final SubLObject kb_hl_support_content_set_dependents(SubLObject kb_hl_support_content, SubLObject dependents) {
    _csetf_kb_hlsc_dependents(kb_hl_support_content, dependents);
    return kb_hl_support_content;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 8787) 
  public static final SubLObject make_kb_hl_support_shell(SubLObject id) {
    {
      SubLObject kb_hl_support = new_kb_hl_support(id);
      register_kb_hl_support_id(id, kb_hl_support);
      return kb_hl_support;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 9017) 
  public static final SubLObject kb_hl_support_content(SubLObject kb_hl_support) {
    return kb_hl_support_manager.lookup_kb_hl_support_content(kb_hl_support_get_id(kb_hl_support));
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 9163) 
  public static final SubLObject kb_hl_support_add_dependent(SubLObject kb_hl_support, SubLObject deduction) {
    {
      SubLObject content = kb_hl_support_content(kb_hl_support);
      SubLObject old_dependents = kb_hl_support_content_get_dependents(content);
      SubLObject new_dependents = set_contents.set_contents_add(deduction, old_dependents, Symbols.symbol_function(EQ));
      kb_hl_support_content_set_dependents(content, new_dependents);
      kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_id(kb_hl_support));
    }
    return kb_hl_support;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 9614) 
  public static final SubLObject kb_hl_support_remove_dependent(SubLObject kb_hl_support, SubLObject deduction) {
    {
      SubLObject content = kb_hl_support_content(kb_hl_support);
      SubLObject old_dependents = kb_hl_support_content_get_dependents(content);
      SubLObject new_dependents = set_contents.set_contents_delete(deduction, old_dependents, Symbols.symbol_function(EQ));
      kb_hl_support_content_set_dependents(content, new_dependents);
      kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_id(kb_hl_support));
    }
    return kb_hl_support;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 11786) 
  public static final SubLObject remove_kb_hl_support(SubLObject kb_hl_support) {
    {
      SubLObject content = kb_hl_support_content(kb_hl_support);
      SubLObject argument = kb_hl_support_content_get_argument(content);
      if ((NIL != deduction_handles.valid_deductionP(argument, UNPROVIDED))) {
        deductions_high.remove_deduction(argument);
      }
      free_kb_hl_support(kb_hl_support);
      free_kb_hl_support_content(content);
      return kb_hl_support;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 12137) 
  public static final SubLObject hl_justify_for_kb_hl_support(SubLObject hl_support) {
    return Sequences.remove(hl_support, hl_supports.hl_support_justify(hl_support), Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 12284) 
  public static final SubLObject valid_kb_hl_supportP(SubLObject object, SubLObject robustP) {
    if ((robustP == UNPROVIDED)) {
      robustP = NIL;
    }
    return makeBoolean(((NIL != valid_kb_hl_support_handleP(object))
           && ((NIL == robustP)
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11080")))));
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 12502) 
  public static final SubLObject valid_kb_hl_support_handleP(SubLObject object) {
    return makeBoolean(((NIL != kb_hl_support_p(object))
           && (NIL != kb_hl_support_handle_validP(object))));
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 12639) 
  public static final SubLObject kb_hl_support_handle_validP(SubLObject kb_hl_support) {
    return Types.integerp(kb_hl_support_get_id(kb_hl_support));
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 14170) 
  public static final SubLObject tms_remove_kb_hl_supports_mentioning_term(SubLObject v_term) {
    {
      SubLObject removed_count = ZERO_INTEGER;
      SubLObject cdolist_list_var = find_kb_hl_supports_mentioning_term(v_term);
      SubLObject kb_hl_support = NIL;
      for (kb_hl_support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), kb_hl_support = cdolist_list_var.first()) {
        if ((NIL != arguments.valid_supportP(kb_hl_support, UNPROVIDED))) {
          tms_remove_kb_hl_support(kb_hl_support);
        }
        removed_count = Numbers.add(removed_count, ONE_INTEGER);
      }
      return removed_count;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 14479) 
  public static final SubLObject setup_kb_hl_support_tables(SubLObject size, SubLObject exactP) {
    setup_kb_hl_support_id_tables(size, exactP);
    setup_kb_hl_support_index_table();
    return NIL;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 14702) 
  public static final SubLObject finalize_kb_hl_supports(SubLObject max_kb_hl_support_id) {
    if ((max_kb_hl_support_id == UNPROVIDED)) {
      max_kb_hl_support_id = NIL;
    }
    set_next_kb_hl_support_id(max_kb_hl_support_id);
    if ((NIL == max_kb_hl_support_id)) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11056");
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 15024) 
  private static SubLSymbol $kb_hl_supports_from_ids$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 15772) 
  public static final SubLObject do_kb_hl_supports_table() {
    return $kb_hl_supports_from_ids$.getGlobalValue();
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 15885) 
  public static final SubLObject setup_kb_hl_support_id_tables(SubLObject size, SubLObject exactP) {
    if ((NIL == $kb_hl_supports_from_ids$.getGlobalValue())) {
      $kb_hl_supports_from_ids$.setGlobalValue(id_index.new_id_index(size, ZERO_INTEGER));
    }
    kb_hl_support_manager.setup_kb_hl_support_content_table(size, exactP);
    return NIL;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 16381) 
  public static final SubLObject lookup_kb_hl_support_by_id(SubLObject id) {
    return id_index.id_index_lookup($kb_hl_supports_from_ids$.getGlobalValue(), id, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 16500) 
  public static final SubLObject next_kb_hl_support_id() {
    return id_index.id_index_next_id($kb_hl_supports_from_ids$.getGlobalValue());
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 16596) 
  public static final SubLObject register_kb_hl_support_id(SubLObject id, SubLObject kb_hl_support) {
    return id_index.id_index_enter($kb_hl_supports_from_ids$.getGlobalValue(), id, kb_hl_support);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 16741) 
  public static final SubLObject deregister_kb_hl_support_id(SubLObject id) {
    return id_index.id_index_remove($kb_hl_supports_from_ids$.getGlobalValue(), id);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 16847) 
  public static final SubLObject set_next_kb_hl_support_id(SubLObject max_kb_hl_support_id) {
    if ((max_kb_hl_support_id == UNPROVIDED)) {
      max_kb_hl_support_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject max = MINUS_ONE_INTEGER;
        if ((NIL != max_kb_hl_support_id)) {
          max = max_kb_hl_support_id;
        } else {
          {
            SubLObject idx = do_kb_hl_supports_table();
            SubLObject mess = $str55$Determining_maximum_KB_HL_support;
            SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            checkType(mess, $sym56$STRINGP);
            {
              SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
              SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
              SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
              SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
              try {
                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.noting_percent_progress_preamble(mess);
                {
                  SubLObject idx_7 = idx;
                  if ((NIL == id_index.id_index_objects_empty_p(idx_7, $kw57$SKIP))) {
                    {
                      SubLObject idx_8 = idx_7;
                      if ((NIL == id_index.id_index_old_objects_empty_p(idx_8, $kw57$SKIP))) {
                        {
                          SubLObject vector_var = id_index.id_index_old_objects(idx_8);
                          SubLObject backwardP_var = NIL;
                          SubLObject length = Sequences.length(vector_var);
                          SubLObject v_iteration = NIL;
                          for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            {
                              SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                              SubLObject kb_hl_support = Vectors.aref(vector_var, id);
                              if ((!(((NIL != id_index.id_index_tombstone_p(kb_hl_support))
                                     && (NIL != id_index.id_index_skip_tombstones_p($kw57$SKIP)))))) {
                                if ((NIL != id_index.id_index_tombstone_p(kb_hl_support))) {
                                  kb_hl_support = $kw57$SKIP;
                                }
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, kb_hl_support_id(kb_hl_support));
                              }
                            }
                          }
                        }
                      }
                    }
                    {
                      SubLObject idx_9 = idx_7;
                      if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_9))
                             && (NIL != id_index.id_index_skip_tombstones_p($kw57$SKIP)))))) {
                        {
                          SubLObject v_new = id_index.id_index_new_objects(idx_9);
                          SubLObject id = id_index.id_index_new_id_threshold(idx_9);
                          SubLObject end_id = id_index.id_index_next_id(idx_9);
                          SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw57$SKIP)) ? ((SubLObject) NIL) : $kw57$SKIP);
                          while (id.numL(end_id)) {
                            {
                              SubLObject kb_hl_support = Hashtables.gethash_without_values(id, v_new, v_default);
                              if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw57$SKIP))
                                     && (NIL != id_index.id_index_tombstone_p(kb_hl_support)))))) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, kb_hl_support_id(kb_hl_support));
                              }
                            }
                            id = Numbers.add(id, ONE_INTEGER);
                          }
                        }
                      }
                    }
                  }
                }
                utilities_macros.noting_percent_progress_postamble();
              } finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        {
          SubLObject next_id = Numbers.add(max, ONE_INTEGER);
          id_index.set_id_index_next_id($kb_hl_supports_from_ids$.getGlobalValue(), next_id);
          return next_id;
        }
      }
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 17280) 
  public static final SubLObject increment_next_kb_hl_support_id() {
    {
      SubLObject id = next_kb_hl_support_id();
      return id_index.set_id_index_next_id($kb_hl_supports_from_ids$.getGlobalValue(), Numbers.add(ONE_INTEGER, id));
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 17441) 
  public static final SubLObject clear_kb_hl_support_id_tables() {
    id_index.clear_id_index($kb_hl_supports_from_ids$.getGlobalValue());
    kb_hl_support_manager.clear_kb_hl_support_content_table();
    return NIL;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 17587) 
  private static SubLSymbol $kb_hl_support_index$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 17656) 
  private static SubLSymbol $kb_hl_support_index_lock$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 17746) 
  private static SubLSymbol $kb_hl_support_index_unindexed_terms$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 17958) 
  public static final SubLObject kb_hl_support_index_unindexed_termP(SubLObject v_term) {
    return list_utilities.member_equalP(v_term, $kb_hl_support_index_unindexed_terms$.getGlobalValue());
  }

  public static final class $kb_hl_support_index_unindexed_termP$UnaryFunction extends UnaryFunction {
    public $kb_hl_support_index_unindexed_termP$UnaryFunction() { super(extractFunctionNamed("KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?")); }
    public SubLObject processItem(SubLObject arg1) { return kb_hl_support_index_unindexed_termP(arg1); }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 18086) 
  public static final SubLObject kb_hl_support_index_indexed_term_p(SubLObject v_term) {
    return makeBoolean(((NIL != kb_indexing_datastructures.indexed_term_p(v_term))
           && (NIL == kb_hl_support_index_unindexed_termP(v_term))));
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 18239) 
  public static final SubLObject kb_hl_support_index_indexed_terms(SubLObject sentence) {
    {
      SubLObject terms = cycl_utilities.expression_gather(sentence, $sym61$INDEXED_TERM_P, NIL, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
      return ((NIL != list_utilities.find_if_not($sym62$KB_HL_SUPPORT_INDEX_UNINDEXED_TERM_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) Sequences.remove_if($sym62$KB_HL_SUPPORT_INDEX_UNINDEXED_TERM_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : terms);
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 18526) 
  public static final SubLObject setup_kb_hl_support_index_table() {
    if ((NIL != $kb_hl_support_index$.getGlobalValue())) {
      return NIL;
    } else {
      $kb_hl_support_index$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      return T;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 18715) 
  public static final SubLObject lookup_kb_hl_support(SubLObject hl_support) {
    {
      SubLObject support_sets = NIL;
      SubLObject kb_hl_support = NIL;
      SubLObject datum = hl_support;
      SubLObject current = datum;
      SubLObject module = NIL;
      SubLObject sentence = NIL;
      SubLObject mt = NIL;
      SubLObject tv = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      sentence = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      tv = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            {
              SubLObject mt_index = dictionary.dictionary_lookup_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
              if ((NIL != dictionary.dictionary_p(mt_index))) {
                {
                  SubLObject tv_index = dictionary.dictionary_lookup_without_values(mt_index, mt, UNPROVIDED);
                  if ((NIL != dictionary.dictionary_p(tv_index))) {
                    {
                      SubLObject term_index = dictionary.dictionary_lookup_without_values(tv_index, tv, UNPROVIDED);
                      if ((NIL != dictionary.dictionary_p(term_index))) {
                        {
                          SubLObject indexed_terms = kb_hl_support_index_indexed_terms(sentence);
                          SubLObject doneP = NIL;
                          if ((NIL == doneP)) {
                            {
                              SubLObject csome_list_var = indexed_terms;
                              SubLObject v_term = NIL;
                              for (v_term = csome_list_var.first(); (!(((NIL != doneP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), v_term = csome_list_var.first()) {
                                {
                                  SubLObject support_set = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                                  if ((NIL != set_contents.set_contents_emptyP(support_set))) {
                                    support_sets = NIL;
                                    doneP = T;
                                  } else if ((NIL != set_contents.set_contents_singletonP(support_set))) {
                                    support_sets = list(support_set);
                                    doneP = T;
                                  } else {
                                    support_sets = cons(support_set, support_sets);
                                  }
                                }
                              }
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
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
        if ((NIL != support_sets)) {
          {
            SubLObject candidate_kb_hl_supports = ((NIL != list_utilities.singletonP(support_sets)) ? ((SubLObject) support_sets.first()) : set_utilities.set_contents_intersection(support_sets, Symbols.symbol_function(EQ)));
            if ((NIL == set_contents.set_contents_emptyP(candidate_kb_hl_supports))) {
              {
                SubLObject set_contents_var = candidate_kb_hl_supports;
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (!(((NIL != kb_hl_support)
                      || (NIL != set_contents.do_set_contents_doneP(basis_object, state))))); state = set_contents.do_set_contents_update_state(state)) {
                  {
                    SubLObject candidate_kb_hl_support = set_contents.do_set_contents_next(basis_object, state);
                    if ((NIL != set_contents.do_set_contents_element_validP(state, candidate_kb_hl_support))) {
                      {
                        SubLObject candidate_sentence = kb_hl_support_sentence(candidate_kb_hl_support);
                        if (candidate_sentence.equal(sentence)) {
                          kb_hl_support = candidate_kb_hl_support;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list63);
      }
      return kb_hl_support;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 20382) 
  public static final SubLObject lookup_kb_hl_supports_mentioning_term(SubLObject v_term) {
    {
      SubLObject sentence_kb_hl_supports = lookup_kb_hl_supports_mentioning_term_in_sentence(v_term);
      SubLObject mt_kb_hl_supports = lookup_kb_hl_supports_mentioning_term_in_mt(v_term);
      return set_contents.set_contents_element_list(set_utilities.set_contents_union(list(sentence_kb_hl_supports, mt_kb_hl_supports), Symbols.symbol_function(EQ)));
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 20731) 
  public static final SubLObject lookup_kb_hl_supports_mentioning_term_in_sentence(SubLObject v_term) {
    return ((NIL != kb_hl_support_index_indexed_term_p(v_term)) ? ((SubLObject) lookup_kb_hl_supports_mentioning_indexed_term_in_sentence(v_term)) : Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11055"));
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 21004) 
  public static final SubLObject lookup_kb_hl_supports_mentioning_indexed_term_in_sentence(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject support_sets = NIL;
        SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          {
            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($kb_hl_support_index$.getGlobalValue()));
            while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
              thread.resetMultipleValues();
              {
                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                SubLObject mt_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                  SubLObject iteration_state_10 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_index));
                  while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_10))) {
                    thread.resetMultipleValues();
                    {
                      SubLObject key_11 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_10);
                      SubLObject tv_index = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      {
                        SubLObject iteration_state_12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_index));
                        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_12))) {
                          thread.resetMultipleValues();
                          {
                            SubLObject key_13 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_12);
                            SubLObject term_index = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                              SubLObject support_set = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                              if (((NIL != set_contents.set_contents_p(support_set))
                                   && (NIL == set_contents.set_contents_emptyP(support_set)))) {
                                support_sets = cons(support_set, support_sets);
                              }
                            }
                            iteration_state_12 = dictionary_contents.do_dictionary_contents_next(iteration_state_12);
                          }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_12);
                      }
                      iteration_state_10 = dictionary_contents.do_dictionary_contents_next(iteration_state_10);
                    }
                  }
                  dictionary_contents.do_dictionary_contents_finalize(iteration_state_10);
                }
                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
              }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
        return set_utilities.set_contents_union(support_sets, Symbols.symbol_function(EQ));
      }
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 21954) 
  public static final SubLObject lookup_kb_hl_supports_mentioning_term_in_mt(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject support_sets = NIL;
        SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          {
            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($kb_hl_support_index$.getGlobalValue()));
            while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
              thread.resetMultipleValues();
              {
                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                SubLObject mt_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                  SubLObject iteration_state_17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_index));
                  while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_17))) {
                    thread.resetMultipleValues();
                    {
                      SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state_17);
                      SubLObject tv_index = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      if ((NIL != list_utilities.simple_tree_find_via_equalP(v_term, mt))) {
                        {
                          SubLObject iteration_state_18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_index));
                          while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_18))) {
                            thread.resetMultipleValues();
                            {
                              SubLObject key_19 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_18);
                              SubLObject term_index = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              {
                                SubLObject iteration_state_20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_index));
                                while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_20))) {
                                  thread.resetMultipleValues();
                                  {
                                    SubLObject key_21 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_20);
                                    SubLObject support_set = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    support_sets = cons(support_set, support_sets);
                                    iteration_state_20 = dictionary_contents.do_dictionary_contents_next(iteration_state_20);
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_20);
                              }
                              iteration_state_18 = dictionary_contents.do_dictionary_contents_next(iteration_state_18);
                            }
                          }
                          dictionary_contents.do_dictionary_contents_finalize(iteration_state_18);
                        }
                      }
                      iteration_state_17 = dictionary_contents.do_dictionary_contents_next(iteration_state_17);
                    }
                  }
                  dictionary_contents.do_dictionary_contents_finalize(iteration_state_17);
                }
                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
              }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
        return set_utilities.set_contents_union(support_sets, Symbols.symbol_function(EQ));
      }
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 22437) 
  public static final SubLObject index_kb_hl_support(SubLObject kb_hl_support, SubLObject hl_support) {
    {
      SubLObject datum = hl_support;
      SubLObject current = datum;
      SubLObject module = NIL;
      SubLObject sentence = NIL;
      SubLObject mt = NIL;
      SubLObject tv = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      sentence = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      tv = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            {
              SubLObject mt_index = dictionary.dictionary_lookup_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
              if ((NIL == dictionary.dictionary_p(mt_index))) {
                mt_index = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
                dictionary.dictionary_enter($kb_hl_support_index$.getGlobalValue(), module, mt_index);
              }
              {
                SubLObject tv_index = dictionary.dictionary_lookup_without_values(mt_index, mt, UNPROVIDED);
                if ((NIL == dictionary.dictionary_p(tv_index))) {
                  tv_index = dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED);
                  dictionary.dictionary_enter(mt_index, mt, tv_index);
                }
                {
                  SubLObject term_index = dictionary.dictionary_lookup_without_values(tv_index, tv, UNPROVIDED);
                  if ((NIL == dictionary.dictionary_p(term_index))) {
                    term_index = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
                    dictionary.dictionary_enter(tv_index, tv, term_index);
                  }
                  {
                    SubLObject indexed_terms = kb_hl_support_index_indexed_terms(sentence);
                    SubLObject cdolist_list_var = indexed_terms;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
                      {
                        SubLObject old_supports = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                        SubLObject new_supports = set_contents.set_contents_add(kb_hl_support, old_supports, Symbols.symbol_function(EQ));
                        dictionary.dictionary_enter(term_index, v_term, new_supports);
                      }
                    }
                  }
                }
              }
            }
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list63);
      }
    }
    return kb_hl_support;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 23601) 
  public static final SubLObject unindex_kb_hl_support(SubLObject kb_hl_support, SubLObject robustP) {
    if ((robustP == UNPROVIDED)) {
      robustP = NIL;
    }
    if ((NIL != robustP)) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11077");
    } else {
      {
        SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        if ((NIL != arguments.hl_support_p(hl_support))) {
          unindex_kb_hl_support_with_hl_support(kb_hl_support, hl_support);
        } else {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11078");
        }
      }
    }
    return kb_hl_support;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 24017) 
  public static final SubLObject unindex_kb_hl_support_with_hl_support(SubLObject kb_hl_support, SubLObject hl_support) {
    {
      SubLObject datum = hl_support;
      SubLObject current = datum;
      SubLObject module = NIL;
      SubLObject sentence = NIL;
      SubLObject mt = NIL;
      SubLObject tv = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      sentence = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
      tv = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            {
              SubLObject mt_index = dictionary.dictionary_lookup_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
              if ((NIL != dictionary.dictionary_p(mt_index))) {
                {
                  SubLObject tv_index = dictionary.dictionary_lookup_without_values(mt_index, mt, UNPROVIDED);
                  if ((NIL != dictionary.dictionary_p(tv_index))) {
                    {
                      SubLObject term_index = dictionary.dictionary_lookup_without_values(tv_index, tv, UNPROVIDED);
                      if ((NIL != dictionary.dictionary_p(term_index))) {
                        {
                          SubLObject indexed_terms = kb_hl_support_index_indexed_terms(sentence);
                          SubLObject cdolist_list_var = indexed_terms;
                          SubLObject v_term = NIL;
                          for (v_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
                            {
                              SubLObject old_supports = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                              SubLObject new_supports = set_contents.set_contents_delete(kb_hl_support, old_supports, Symbols.symbol_function(EQ));
                              if ((NIL != set_contents.set_contents_emptyP(new_supports))) {
                                dictionary.dictionary_remove(term_index, v_term);
                              } else {
                                dictionary.dictionary_enter(term_index, v_term, new_supports);
                              }
                            }
                          }
                        }
                        if ((NIL != dictionary.dictionary_empty_p(term_index))) {
                          dictionary.dictionary_remove(tv_index, tv);
                        }
                      }
                    }
                    if ((NIL != dictionary.dictionary_empty_p(tv_index))) {
                      dictionary.dictionary_remove(mt_index, mt);
                    }
                  }
                }
                if ((NIL != dictionary.dictionary_empty_p(mt_index))) {
                  dictionary.dictionary_remove($kb_hl_support_index$.getGlobalValue(), module);
                }
              }
            }
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list63);
      }
    }
    return kb_hl_support;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 26051) 
  public static final SubLObject clear_kb_hl_support_index() {
    dictionary.clear_dictionary($kb_hl_support_index$.getGlobalValue());
    return NIL;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 26449) 
  private static SubLSymbol $kb_hl_supports_being_created$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 26590) 
  public static final SubLObject note_kb_hl_support_creation_started(SubLObject hl_support, SubLObject kb_hl_support) {
    if ((NIL == dictionary.dictionary_p($kb_hl_supports_being_created$.getGlobalValue()))) {
      $kb_hl_supports_being_created$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
    }
    dictionary.dictionary_enter($kb_hl_supports_being_created$.getGlobalValue(), hl_support, kb_hl_support);
    return hl_support;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 26893) 
  public static final SubLObject note_kb_hl_support_creation_complete(SubLObject hl_support) {
    if ((NIL != dictionary.dictionary_p($kb_hl_supports_being_created$.getGlobalValue()))) {
      dictionary.dictionary_remove($kb_hl_supports_being_created$.getGlobalValue(), hl_support);
    }
    return hl_support;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 27102) 
  public static final SubLObject find_kb_hl_support_during_creation(SubLObject hl_support) {
    {
      SubLObject kb_hl_support = NIL;
      if ((NIL != dictionary.dictionary_p($kb_hl_supports_being_created$.getGlobalValue()))) {
        kb_hl_support = dictionary.dictionary_lookup_without_values($kb_hl_supports_being_created$.getGlobalValue(), hl_support, UNPROVIDED);
      }
      return kb_hl_support;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 27644) 
  public static final SubLObject create_kb_hl_support(SubLObject hl_support, SubLObject justification) {
    {
      SubLObject id = next_kb_hl_support_id();
      SubLObject kb_hl_support = new_kb_hl_support(id);
      SubLObject kb_hl_support_content = new_kb_hl_support_content();
      note_kb_hl_support_creation_started(hl_support, kb_hl_support);
      increment_next_kb_hl_support_id();
      register_kb_hl_support_id(id, kb_hl_support);
      kb_hl_support_manager.register_kb_hl_support_content(id, kb_hl_support_content);
      {
        SubLObject canon_just = arguments.canonicalize_supports(justification, T);
        SubLObject deduction = deductions_high.create_deduction_for_hl_support(hl_support, canon_just);
        kb_hl_support_content_set_argument(kb_hl_support_content, deduction);
      }
      index_kb_hl_support(kb_hl_support, hl_support);
      note_kb_hl_support_creation_complete(hl_support);
      return kb_hl_support;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 28639) 
  public static final SubLObject destroy_kb_hl_support(SubLObject kb_hl_support) {
    unindex_kb_hl_support(kb_hl_support, UNPROVIDED);
    {
      SubLObject id = kb_hl_support_id(kb_hl_support);
      remove_kb_hl_support(kb_hl_support);
      deregister_kb_hl_support_id(id);
      kb_hl_support_manager.deregister_kb_hl_support_content(id);
    }
    return kb_hl_support;
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 28926) 
  public static final SubLObject free_all_kb_hl_support() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      clear_kb_hl_support_index();
      {
        SubLObject idx = do_kb_hl_supports_table();
        SubLObject mess = $str66$Freeing_KB_HL_supports;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        checkType(mess, $sym56$STRINGP);
        {
          SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
          SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
          SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
          SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
          try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.noting_percent_progress_preamble(mess);
            {
              SubLObject idx_28 = idx;
              if ((NIL == id_index.id_index_objects_empty_p(idx_28, $kw57$SKIP))) {
                {
                  SubLObject idx_29 = idx_28;
                  if ((NIL == id_index.id_index_old_objects_empty_p(idx_29, $kw57$SKIP))) {
                    {
                      SubLObject vector_var = id_index.id_index_old_objects(idx_29);
                      SubLObject backwardP_var = NIL;
                      SubLObject length = Sequences.length(vector_var);
                      SubLObject v_iteration = NIL;
                      for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        {
                          SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                          SubLObject kb_hl_support = Vectors.aref(vector_var, id);
                          if ((!(((NIL != id_index.id_index_tombstone_p(kb_hl_support))
                                 && (NIL != id_index.id_index_skip_tombstones_p($kw57$SKIP)))))) {
                            if ((NIL != id_index.id_index_tombstone_p(kb_hl_support))) {
                              kb_hl_support = $kw57$SKIP;
                            }
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            {
                              SubLObject content = kb_hl_support_content(kb_hl_support);
                              free_kb_hl_support(kb_hl_support);
                              free_kb_hl_support_content(content);
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  SubLObject idx_30 = idx_28;
                  if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_30))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw57$SKIP)))))) {
                    {
                      SubLObject v_new = id_index.id_index_new_objects(idx_30);
                      SubLObject id = id_index.id_index_new_id_threshold(idx_30);
                      SubLObject end_id = id_index.id_index_next_id(idx_30);
                      SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw57$SKIP)) ? ((SubLObject) NIL) : $kw57$SKIP);
                      while (id.numL(end_id)) {
                        {
                          SubLObject kb_hl_support = Hashtables.gethash_without_values(id, v_new, v_default);
                          if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw57$SKIP))
                                 && (NIL != id_index.id_index_tombstone_p(kb_hl_support)))))) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            {
                              SubLObject content = kb_hl_support_content(kb_hl_support);
                              free_kb_hl_support(kb_hl_support);
                              free_kb_hl_support_content(content);
                            }
                          }
                        }
                        id = Numbers.add(id, ONE_INTEGER);
                      }
                    }
                  }
                }
              }
            }
            utilities_macros.noting_percent_progress_postamble();
          } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
          }
        }
      }
      clear_kb_hl_support_id_tables();
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 29728) 
  public static SubLSymbol $unreify_kb_hl_supportsP$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 29781) 
  public static final SubLObject possibly_unreify_kb_hl_supports(SubLObject justification) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != $unreify_kb_hl_supportsP$.getDynamicValue(thread)) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11079")) : justification);
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 30208) 
  public static SubLSymbol $tms_kb_hl_support_queue$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 30286) 
  public static final SubLObject enqueueing_kb_hl_supports_for_tmsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return queues.queue_p($tms_kb_hl_support_queue$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 30654) 
  public static final SubLObject process_tms_kb_hl_support_queue() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      while ((NIL == queues.queue_empty_p($tms_kb_hl_support_queue$.getDynamicValue(thread)))) {
        {
          SubLObject kb_hl_support = queues.dequeue($tms_kb_hl_support_queue$.getDynamicValue(thread));
          if (kb_hl_support_id(kb_hl_support).isInteger()) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11060");
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 32277) 
  public static final SubLObject tms_remove_kb_hl_support(SubLObject kb_hl_support) {
    {
      SubLObject set_contents_var = do_kb_hl_support_dependents_helper(kb_hl_support);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject deduction = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, deduction))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12466");
          }
        }
      }
    }
    destroy_kb_hl_support(kb_hl_support);
    return kb_hl_support;
  }

  /** Create a sample invalid KB HL support. */
  @SubL(source = "cycl/kb-hl-supports.lisp", position = 33298) 
  public static final SubLObject create_sample_invalid_kb_hl_support() {
    return make_kb_hl_support(UNPROVIDED);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 33457) 
  public static SubLSymbol $kb_hl_support_dump_id_table$ = null;

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 33850) 
  public static final SubLObject find_kb_hl_support_by_dump_id(SubLObject dump_id) {
    return find_kb_hl_support_by_id(dump_id);
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 34648) 
  public static final SubLObject load_kb_hl_support_content(SubLObject kb_hl_support, SubLObject stream) {
    {
      SubLObject id = kb_hl_support_id(kb_hl_support);
      SubLObject argument = cfasl.cfasl_input(stream, NIL, UNPROVIDED);
      SubLObject dependents = cfasl.cfasl_input(stream, NIL, UNPROVIDED);
      SubLObject content = new_kb_hl_support_content();
      kb_hl_support_content_set_argument(content, argument);
      kb_hl_support_content_set_dependents(content, dependents);
      kb_hl_support_manager.register_kb_hl_support_content(id, content);
      return id;
    }
  }

  @SubL(source = "cycl/kb-hl-supports.lisp", position = 35213) 
  public static final SubLObject load_kb_hl_support_indexing_int(SubLObject filename) {
    $kb_hl_support_index$.setGlobalValue(cfasl_utilities.cfasl_load(filename));
    return NIL;
  }

  public static final SubLObject declare_kb_hl_supports_file() {
    declareFunction(myName, "find_kb_hl_support", "FIND-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "find_kb_hl_support_by_id", "FIND-KB-HL-SUPPORT-BY-ID", 1, 0, false);
    declareFunction(myName, "find_kb_hl_supports_mentioning_term", "FIND-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
    declareFunction(myName, "kb_hl_support_count", "KB-HL-SUPPORT-COUNT", 0, 0, false);
    //declareFunction(myName, "old_kb_hl_support_count", "OLD-KB-HL-SUPPORT-COUNT", 0, 0, false);
    //declareFunction(myName, "new_kb_hl_support_count", "NEW-KB-HL-SUPPORT-COUNT", 0, 0, false);
    declareFunction(myName, "kb_hl_support_id", "KB-HL-SUPPORT-ID", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_arguments", "KB-HL-SUPPORT-ARGUMENTS", 1, 0, false);
    //declareMacro(myName, "do_kb_hl_support_arguments", "DO-KB-HL-SUPPORT-ARGUMENTS");
    //declareFunction(myName, "kb_hl_support_dependents", "KB-HL-SUPPORT-DEPENDENTS", 1, 0, false);
    //declareMacro(myName, "do_kb_hl_support_dependents", "DO-KB-HL-SUPPORT-DEPENDENTS");
    declareFunction(myName, "do_kb_hl_support_dependents_helper", "DO-KB-HL-SUPPORT-DEPENDENTS-HELPER", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_justification", "KB-HL-SUPPORT-JUSTIFICATION", 1, 0, false);
    //declareMacro(myName, "do_kb_hl_support_supports", "DO-KB-HL-SUPPORT-SUPPORTS");
    declareFunction(myName, "kb_hl_support_hl_support", "KB-HL-SUPPORT-HL-SUPPORT", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_module", "KB-HL-SUPPORT-MODULE", 1, 0, false);
    declareFunction(myName, "kb_hl_support_sentence", "KB-HL-SUPPORT-SENTENCE", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_mt", "KB-HL-SUPPORT-MT", 1, 0, false);
    declareFunction(myName, "kb_hl_support_tv", "KB-HL-SUPPORT-TV", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_el_sentence", "KB-HL-SUPPORT-EL-SENTENCE", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_ist_sentence", "KB-HL-SUPPORT-IST-SENTENCE", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_el_ist_sentence", "KB-HL-SUPPORT-EL-IST-SENTENCE", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_elmt", "KB-HL-SUPPORT-ELMT", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_cons", "KB-HL-SUPPORT-CONS", 1, 0, false);
    declareFunction(myName, "find_or_possibly_create_kb_hl_support", "FIND-OR-POSSIBLY-CREATE-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "possibly_create_kb_hl_support", "POSSIBLY-CREATE-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "kb_hl_support_print_function_trampoline", "KB-HL-SUPPORT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "kb_hl_support_p", "KB-HL-SUPPORT-P", 1, 0, false); new $kb_hl_support_p$UnaryFunction();
    declareFunction(myName, "kb_hls_id", "KB-HLS-ID", 1, 0, false);
    declareFunction(myName, "_csetf_kb_hls_id", "_CSETF-KB-HLS-ID", 2, 0, false);
    declareFunction(myName, "make_kb_hl_support", "MAKE-KB-HL-SUPPORT", 0, 1, false);
    //declareFunction(myName, "print_kb_hl_support", "PRINT-KB-HL-SUPPORT", 3, 0, false);
    declareFunction(myName, "sxhash_kb_hl_support_method", "SXHASH-KB-HL-SUPPORT-METHOD", 1, 0, false); new $sxhash_kb_hl_support_method$UnaryFunction();
    declareFunction(myName, "new_kb_hl_support", "NEW-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "free_kb_hl_support", "FREE-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "kb_hl_support_get_id", "KB-HL-SUPPORT-GET-ID", 1, 0, false);
    declareFunction(myName, "kb_hl_support_content_print_function_trampoline", "KB-HL-SUPPORT-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "kb_hl_support_content_p", "KB-HL-SUPPORT-CONTENT-P", 1, 0, false); new $kb_hl_support_content_p$UnaryFunction();
    declareFunction(myName, "kb_hlsc_argument", "KB-HLSC-ARGUMENT", 1, 0, false);
    declareFunction(myName, "kb_hlsc_dependents", "KB-HLSC-DEPENDENTS", 1, 0, false);
    declareFunction(myName, "_csetf_kb_hlsc_argument", "_CSETF-KB-HLSC-ARGUMENT", 2, 0, false);
    declareFunction(myName, "_csetf_kb_hlsc_dependents", "_CSETF-KB-HLSC-DEPENDENTS", 2, 0, false);
    declareFunction(myName, "make_kb_hl_support_content", "MAKE-KB-HL-SUPPORT-CONTENT", 0, 1, false);
    declareFunction(myName, "new_kb_hl_support_content", "NEW-KB-HL-SUPPORT-CONTENT", 0, 0, false);
    declareFunction(myName, "free_kb_hl_support_content", "FREE-KB-HL-SUPPORT-CONTENT", 1, 0, false);
    declareFunction(myName, "kb_hl_support_content_get_argument", "KB-HL-SUPPORT-CONTENT-GET-ARGUMENT", 1, 0, false);
    declareFunction(myName, "kb_hl_support_content_get_dependents", "KB-HL-SUPPORT-CONTENT-GET-DEPENDENTS", 1, 0, false);
    declareFunction(myName, "kb_hl_support_content_set_argument", "KB-HL-SUPPORT-CONTENT-SET-ARGUMENT", 2, 0, false);
    declareFunction(myName, "kb_hl_support_content_set_dependents", "KB-HL-SUPPORT-CONTENT-SET-DEPENDENTS", 2, 0, false);
    declareFunction(myName, "make_kb_hl_support_shell", "MAKE-KB-HL-SUPPORT-SHELL", 1, 0, false);
    declareFunction(myName, "kb_hl_support_content", "KB-HL-SUPPORT-CONTENT", 1, 0, false);
    declareFunction(myName, "kb_hl_support_add_dependent", "KB-HL-SUPPORT-ADD-DEPENDENT", 2, 0, false);
    declareFunction(myName, "kb_hl_support_remove_dependent", "KB-HL-SUPPORT-REMOVE-DEPENDENT", 2, 0, false);
    //declareFunction(myName, "kb_hl_support_clear_dependents", "KB-HL-SUPPORT-CLEAR-DEPENDENTS", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_remove_argument", "KB-HL-SUPPORT-REMOVE-ARGUMENT", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_reset_argument", "KB-HL-SUPPORT-RESET-ARGUMENT", 2, 0, false);
    //declareFunction(myName, "kb_hl_support_reset_justification", "KB-HL-SUPPORT-RESET-JUSTIFICATION", 2, 0, false);
    //declareFunction(myName, "rejustify_kb_hl_support", "REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "remove_kb_hl_support", "REMOVE-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "hl_justify_for_kb_hl_support", "HL-JUSTIFY-FOR-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "valid_kb_hl_supportP", "VALID-KB-HL-SUPPORT?", 1, 1, false);
    declareFunction(myName, "valid_kb_hl_support_handleP", "VALID-KB-HL-SUPPORT-HANDLE?", 1, 0, false);
    declareFunction(myName, "kb_hl_support_handle_validP", "KB-HL-SUPPORT-HANDLE-VALID?", 1, 0, false);
    //declareFunction(myName, "valid_kb_hl_support_contentP", "VALID-KB-HL-SUPPORT-CONTENT?", 1, 1, false);
    //declareFunction(myName, "kb_hl_support_content_validP", "KB-HL-SUPPORT-CONTENT-VALID?", 1, 1, false);
    //declareFunction(myName, "kb_hl_support_uselessP", "KB-HL-SUPPORT-USELESS?", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_unjustifiedP", "KB-HL-SUPPORT-UNJUSTIFIED?", 1, 0, false);
    //declareFunction(myName, "possibly_destroy_kb_hl_support", "POSSIBLY-DESTROY-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "tms_remove_kb_hl_supports_mentioning_term", "TMS-REMOVE-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
    declareFunction(myName, "setup_kb_hl_support_tables", "SETUP-KB-HL-SUPPORT-TABLES", 2, 0, false);
    declareFunction(myName, "finalize_kb_hl_supports", "FINALIZE-KB-HL-SUPPORTS", 0, 1, false);
    //declareMacro(myName, "do_kb_hl_supports", "DO-KB-HL-SUPPORTS");
    //declareMacro(myName, "do_old_kb_hl_supports", "DO-OLD-KB-HL-SUPPORTS");
    //declareMacro(myName, "do_new_kb_hl_supports", "DO-NEW-KB-HL-SUPPORTS");
    declareFunction(myName, "do_kb_hl_supports_table", "DO-KB-HL-SUPPORTS-TABLE", 0, 0, false);
    declareFunction(myName, "setup_kb_hl_support_id_tables", "SETUP-KB-HL-SUPPORT-ID-TABLES", 2, 0, false);
    //declareFunction(myName, "optimize_kb_hl_support_id_tables", "OPTIMIZE-KB-HL-SUPPORT-ID-TABLES", 0, 0, false);
    declareFunction(myName, "lookup_kb_hl_support_by_id", "LOOKUP-KB-HL-SUPPORT-BY-ID", 1, 0, false);
    declareFunction(myName, "next_kb_hl_support_id", "NEXT-KB-HL-SUPPORT-ID", 0, 0, false);
    declareFunction(myName, "register_kb_hl_support_id", "REGISTER-KB-HL-SUPPORT-ID", 2, 0, false);
    declareFunction(myName, "deregister_kb_hl_support_id", "DEREGISTER-KB-HL-SUPPORT-ID", 1, 0, false);
    declareFunction(myName, "set_next_kb_hl_support_id", "SET-NEXT-KB-HL-SUPPORT-ID", 0, 1, false);
    declareFunction(myName, "increment_next_kb_hl_support_id", "INCREMENT-NEXT-KB-HL-SUPPORT-ID", 0, 0, false);
    declareFunction(myName, "clear_kb_hl_support_id_tables", "CLEAR-KB-HL-SUPPORT-ID-TABLES", 0, 0, false);
    declareFunction(myName, "kb_hl_support_index_unindexed_termP", "KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?", 1, 0, false); new $kb_hl_support_index_unindexed_termP$UnaryFunction();
    declareFunction(myName, "kb_hl_support_index_indexed_term_p", "KB-HL-SUPPORT-INDEX-INDEXED-TERM-P", 1, 0, false);
    declareFunction(myName, "kb_hl_support_index_indexed_terms", "KB-HL-SUPPORT-INDEX-INDEXED-TERMS", 1, 0, false);
    declareFunction(myName, "setup_kb_hl_support_index_table", "SETUP-KB-HL-SUPPORT-INDEX-TABLE", 0, 0, false);
    declareFunction(myName, "lookup_kb_hl_support", "LOOKUP-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "lookup_kb_hl_supports_mentioning_term", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
    declareFunction(myName, "lookup_kb_hl_supports_mentioning_term_in_sentence", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM-IN-SENTENCE", 1, 0, false);
    declareFunction(myName, "lookup_kb_hl_supports_mentioning_indexed_term_in_sentence", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-INDEXED-TERM-IN-SENTENCE", 1, 0, false);
    //declareFunction(myName, "lookup_kb_hl_supports_mentioning_unindexed_term_in_sentence", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-UNINDEXED-TERM-IN-SENTENCE", 1, 0, false);
    declareFunction(myName, "lookup_kb_hl_supports_mentioning_term_in_mt", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM-IN-MT", 1, 0, false);
    declareFunction(myName, "index_kb_hl_support", "INDEX-KB-HL-SUPPORT", 2, 0, false);
    declareFunction(myName, "unindex_kb_hl_support", "UNINDEX-KB-HL-SUPPORT", 1, 1, false);
    declareFunction(myName, "unindex_kb_hl_support_with_hl_support", "UNINDEX-KB-HL-SUPPORT-WITH-HL-SUPPORT", 2, 0, false);
    //declareFunction(myName, "unindex_kb_hl_support_without_hl_support", "UNINDEX-KB-HL-SUPPORT-WITHOUT-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "clear_kb_hl_support_index", "CLEAR-KB-HL-SUPPORT-INDEX", 0, 0, false);
    //declareFunction(myName, "reindex_all_kb_hl_supports", "REINDEX-ALL-KB-HL-SUPPORTS", 0, 0, false);
    declareFunction(myName, "note_kb_hl_support_creation_started", "NOTE-KB-HL-SUPPORT-CREATION-STARTED", 2, 0, false);
    declareFunction(myName, "note_kb_hl_support_creation_complete", "NOTE-KB-HL-SUPPORT-CREATION-COMPLETE", 1, 0, false);
    declareFunction(myName, "find_kb_hl_support_during_creation", "FIND-KB-HL-SUPPORT-DURING-CREATION", 1, 0, false);
    //declareFunction(myName, "find_or_create_kb_hl_support", "FIND-OR-CREATE-KB-HL-SUPPORT", 2, 0, false);
    declareFunction(myName, "create_kb_hl_support", "CREATE-KB-HL-SUPPORT", 2, 0, false);
    declareFunction(myName, "destroy_kb_hl_support", "DESTROY-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "free_all_kb_hl_support", "FREE-ALL-KB-HL-SUPPORT", 0, 0, false);
    //declareFunction(myName, "possibly_reify_hl_supports", "POSSIBLY-REIFY-HL-SUPPORTS", 1, 0, false);
    //declareFunction(myName, "possibly_reify_hl_support", "POSSIBLY-REIFY-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "possibly_unreify_kb_hl_supports", "POSSIBLY-UNREIFY-KB-HL-SUPPORTS", 1, 0, false);
    //declareFunction(myName, "unreify_kb_hl_supports", "UNREIFY-KB-HL-SUPPORTS", 1, 0, false);
    //declareFunction(myName, "unreify_kb_hl_support", "UNREIFY-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "enqueueing_kb_hl_supports_for_tmsP", "ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?", 0, 0, false);
    //declareMacro(myName, "with_kb_hl_support_rejustification", "WITH-KB-HL-SUPPORT-REJUSTIFICATION");
    declareFunction(myName, "process_tms_kb_hl_support_queue", "PROCESS-TMS-KB-HL-SUPPORT-QUEUE", 0, 0, false);
    //declareFunction(myName, "rejustify_or_remove_kb_hl_support", "REJUSTIFY-OR-REMOVE-KB-HL-SUPPORT", 1, 0, false);
    //declareFunction(myName, "tms_possibly_rejustify_kb_hl_support", "TMS-POSSIBLY-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
    //declareFunction(myName, "enqueue_kb_hl_support_for_tms", "ENQUEUE-KB-HL-SUPPORT-FOR-TMS", 1, 0, false);
    //declareFunction(myName, "possibly_rejustify_kb_hl_support", "POSSIBLY-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "tms_remove_kb_hl_support", "TMS-REMOVE-KB-HL-SUPPORT", 1, 0, false);
    //declareFunction(myName, "verify_kb_hl_support", "VERIFY-KB-HL-SUPPORT", 1, 0, false);
    //declareFunction(myName, "handle_unverifiable_kb_hl_support", "HANDLE-UNVERIFIABLE-KB-HL-SUPPORT", 1, 0, false);
    //declareFunction(myName, "partition_create_invalid_kb_hl_support", "PARTITION-CREATE-INVALID-KB-HL-SUPPORT", 0, 0, false);
    declareFunction(myName, "create_sample_invalid_kb_hl_support", "CREATE-SAMPLE-INVALID-KB-HL-SUPPORT", 0, 0, false);
    //declareFunction(myName, "kb_hl_support_dump_id", "KB-HL-SUPPORT-DUMP-ID", 1, 0, false);
    declareFunction(myName, "find_kb_hl_support_by_dump_id", "FIND-KB-HL-SUPPORT-BY-DUMP-ID", 1, 0, false);
    //declareMacro(myName, "with_kb_hl_support_dump_id_table", "WITH-KB-HL-SUPPORT-DUMP-ID-TABLE");
    //declareFunction(myName, "create_kb_hl_support_dump_id_table", "CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE", 0, 0, false);
    //declareFunction(myName, "dump_kb_hl_support_content", "DUMP-KB-HL-SUPPORT-CONTENT", 2, 0, false);
    declareFunction(myName, "load_kb_hl_support_content", "LOAD-KB-HL-SUPPORT-CONTENT", 2, 0, false);
    //declareFunction(myName, "dump_kb_hl_support_indexing_int", "DUMP-KB-HL-SUPPORT-INDEXING-INT", 1, 0, false);
    declareFunction(myName, "load_kb_hl_support_indexing_int", "LOAD-KB-HL-SUPPORT-INDEXING-INT", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_not_findable_by_hl_supportP", "KB-HL-SUPPORT-NOT-FINDABLE-BY-HL-SUPPORT?", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_circularP", "KB-HL-SUPPORT-CIRCULAR?", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_circularP_int", "KB-HL-SUPPORT-CIRCULAR?-INT", 2, 0, false);
    //declareFunction(myName, "kb_hl_support_has_invalid_dependentP", "KB-HL-SUPPORT-HAS-INVALID-DEPENDENT?", 1, 1, false);
    //declareFunction(myName, "kb_hl_support_has_invalid_argumentP", "KB-HL-SUPPORT-HAS-INVALID-ARGUMENT?", 1, 1, false);
    //declareFunction(myName, "kb_hl_support_has_invalid_hl_supportP", "KB-HL-SUPPORT-HAS-INVALID-HL-SUPPORT?", 1, 0, false);
    //declareFunction(myName, "kb_hl_support_has_missing_backpointerP", "KB-HL-SUPPORT-HAS-MISSING-BACKPOINTER?", 1, 0, false);
    //declareFunction(myName, "kb_hl_supports_not_findable_by_hl_support", "KB-HL-SUPPORTS-NOT-FINDABLE-BY-HL-SUPPORT", 0, 0, false);
    //declareFunction(myName, "circular_kb_hl_supports", "CIRCULAR-KB-HL-SUPPORTS", 0, 0, false);
    //declareFunction(myName, "duplicate_kb_hl_supports", "DUPLICATE-KB-HL-SUPPORTS", 0, 0, false);
    //declareFunction(myName, "kb_hl_supports_with_invalid_dependents", "KB-HL-SUPPORTS-WITH-INVALID-DEPENDENTS", 0, 1, false);
    //declareFunction(myName, "kb_hl_supports_with_invalid_arguments", "KB-HL-SUPPORTS-WITH-INVALID-ARGUMENTS", 0, 1, false);
    //declareFunction(myName, "kb_hl_supports_with_invalid_hl_supports", "KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 0, 0, false);
    //declareFunction(myName, "kb_hl_supports_with_missing_backpointers", "KB-HL-SUPPORTS-WITH-MISSING-BACKPOINTERS", 0, 0, false);
    //declareFunction(myName, "verify_kb_hl_supports", "VERIFY-KB-HL-SUPPORTS", 0, 2, false);
    //declareFunction(myName, "verify_kb_hl_support_indexing", "VERIFY-KB-HL-SUPPORT-INDEXING", 0, 1, false);
    //declareFunction(myName, "report_kb_hl_support_indexing_failures", "REPORT-KB-HL-SUPPORT-INDEXING-FAILURES", 2, 1, false);
    //declareFunction(myName, "verify_kb_hl_supports_non_circular", "VERIFY-KB-HL-SUPPORTS-NON-CIRCULAR", 0, 1, false);
    //declareFunction(myName, "report_circular_kb_hl_supports", "REPORT-CIRCULAR-KB-HL-SUPPORTS", 2, 1, false);
    //declareFunction(myName, "verify_kb_hl_support_uniqueness", "VERIFY-KB-HL-SUPPORT-UNIQUENESS", 0, 1, false);
    //declareFunction(myName, "report_duplicate_kb_hl_supports", "REPORT-DUPLICATE-KB-HL-SUPPORTS", 2, 1, false);
    //declareFunction(myName, "verify_kb_hl_support_dependents", "VERIFY-KB-HL-SUPPORT-DEPENDENTS", 0, 1, false);
    //declareFunction(myName, "report_kb_hl_supports_with_invalid_dependents", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-DEPENDENTS", 2, 1, false);
    //declareFunction(myName, "verify_kb_hl_support_arguments", "VERIFY-KB-HL-SUPPORT-ARGUMENTS", 0, 1, false);
    //declareFunction(myName, "report_kb_hl_supports_with_invalid_arguments", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-ARGUMENTS", 2, 1, false);
    //declareFunction(myName, "verify_kb_hl_support_hl_supports", "VERIFY-KB-HL-SUPPORT-HL-SUPPORTS", 0, 1, false);
    //declareFunction(myName, "report_kb_hl_supports_with_invalid_hl_supports", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 2, 1, false);
    //declareFunction(myName, "verify_kb_hl_support_backpointers", "VERIFY-KB-HL-SUPPORT-BACKPOINTERS", 0, 1, false);
    //declareFunction(myName, "report_kb_hl_supports_with_missing_backpointers", "REPORT-KB-HL-SUPPORTS-WITH-MISSING-BACKPOINTERS", 2, 1, false);
    //declareFunction(myName, "destroy_duplicate_kb_hl_supports", "DESTROY-DUPLICATE-KB-HL-SUPPORTS", 0, 0, false);
    //declareFunction(myName, "destroy_duplicate_kb_hl_support", "DESTROY-DUPLICATE-KB-HL-SUPPORT", 2, 0, false);
    //declareFunction(myName, "eliminate_kb_hl_supports_invalid_dependents", "ELIMINATE-KB-HL-SUPPORTS-INVALID-DEPENDENTS", 0, 1, false);
    //declareFunction(myName, "eliminate_kb_hl_support_invalid_dependents", "ELIMINATE-KB-HL-SUPPORT-INVALID-DEPENDENTS", 1, 1, false);
    //declareFunction(myName, "destroy_kb_hl_supports_with_invalid_hl_supports", "DESTROY-KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 0, 0, false);
    //declareFunction(myName, "bootstrap_kb_hl_supports", "BOOTSTRAP-KB-HL-SUPPORTS", 0, 1, false);
    //declareFunction(myName, "bootstrap_kb_hl_supports_for_deduction", "BOOTSTRAP-KB-HL-SUPPORTS-FOR-DEDUCTION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_hl_supports_file() {
    $dtp_kb_hl_support$ = defconstant("*DTP-KB-HL-SUPPORT*", $sym12$KB_HL_SUPPORT);
    $print_kb_hl_support_hl_supportP$ = defparameter("*PRINT-KB-HL-SUPPORT-HL-SUPPORT?*", T);
    $dtp_kb_hl_support_content$ = defconstant("*DTP-KB-HL-SUPPORT-CONTENT*", $sym29$KB_HL_SUPPORT_CONTENT);
    $kb_hl_supports_from_ids$ = deflexical("*KB-HL-SUPPORTS-FROM-IDS*", maybeDefault( $sym43$_KB_HL_SUPPORTS_FROM_IDS_, $kb_hl_supports_from_ids$, NIL));
    $kb_hl_support_index$ = deflexical("*KB-HL-SUPPORT-INDEX*", maybeDefault( $sym58$_KB_HL_SUPPORT_INDEX_, $kb_hl_support_index$, NIL));
    $kb_hl_support_index_lock$ = deflexical("*KB-HL-SUPPORT-INDEX-LOCK*", Locks.make_lock($str59$KB_HL_support_indexing_lock));
    $kb_hl_support_index_unindexed_terms$ = deflexical("*KB-HL-SUPPORT-INDEX-UNINDEXED-TERMS*", $list60);
    $kb_hl_supports_being_created$ = deflexical("*KB-HL-SUPPORTS-BEING-CREATED*", maybeDefault( $sym65$_KB_HL_SUPPORTS_BEING_CREATED_, $kb_hl_supports_being_created$, NIL));
    $unreify_kb_hl_supportsP$ = defparameter("*UNREIFY-KB-HL-SUPPORTS?*", NIL);
    $tms_kb_hl_support_queue$ = defparameter("*TMS-KB-HL-SUPPORT-QUEUE*", NIL);
    $kb_hl_support_dump_id_table$ = defparameter("*KB-HL-SUPPORT-DUMP-ID-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_hl_supports_file() {
    // CVS_ID("Id: kb-hl-supports.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_macro_helper($sym8$DO_KB_HL_SUPPORT_DEPENDENTS_HELPER, $sym9$DO_KB_HL_SUPPORT_DEPENDENTS);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function($sym19$KB_HL_SUPPORT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym20$KB_HLS_ID, $sym21$_CSETF_KB_HLS_ID);
    Equality.identity($sym12$KB_HL_SUPPORT);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function($sym28$SXHASH_KB_HL_SUPPORT_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kb_hl_support_content$.getGlobalValue(), Symbols.symbol_function($sym36$KB_HL_SUPPORT_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym37$KB_HLSC_ARGUMENT, $sym38$_CSETF_KB_HLSC_ARGUMENT);
    Structures.def_csetf($sym39$KB_HLSC_DEPENDENTS, $sym40$_CSETF_KB_HLSC_DEPENDENTS);
    Equality.identity($sym29$KB_HL_SUPPORT_CONTENT);
    subl_macro_promotions.declare_defglobal($sym43$_KB_HL_SUPPORTS_FROM_IDS_);
    access_macros.register_macro_helper($sym53$DO_KB_HL_SUPPORTS_TABLE, $sym54$DO_KB_HL_SUPPORTS);
    subl_macro_promotions.declare_defglobal($sym58$_KB_HL_SUPPORT_INDEX_);
    subl_macro_promotions.declare_defglobal($sym65$_KB_HL_SUPPORTS_BEING_CREATED_);
    access_macros.register_macro_helper($sym75$PROCESS_TMS_KB_HL_SUPPORT_QUEUE, $sym76$WITH_KB_HL_SUPPORT_REJUSTIFICATION);
    access_macros.register_macro_helper($sym78$CREATE_KB_HL_SUPPORT_DUMP_ID_TABLE, $sym79$WITH_KB_HL_SUPPORT_DUMP_ID_TABLE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("ARGUMENT-VAR"), makeSymbol("KB-HL-SUPPORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym4$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym5$KB_HL_SUPPORT_ARGUMENTS = makeSymbol("KB-HL-SUPPORT-ARGUMENTS");
  public static final SubLList $list6 = list(list(makeSymbol("DEPENDENT-VAR"), makeSymbol("KB-HL-SUPPORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym7$DO_SET_CONTENTS = makeSymbol("DO-SET-CONTENTS");
  public static final SubLSymbol $sym8$DO_KB_HL_SUPPORT_DEPENDENTS_HELPER = makeSymbol("DO-KB-HL-SUPPORT-DEPENDENTS-HELPER");
  public static final SubLSymbol $sym9$DO_KB_HL_SUPPORT_DEPENDENTS = makeSymbol("DO-KB-HL-SUPPORT-DEPENDENTS");
  public static final SubLList $list10 = list(list(makeSymbol("SUPPORT-VAR"), makeSymbol("KB-HL-SUPPORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym11$KB_HL_SUPPORT_JUSTIFICATION = makeSymbol("KB-HL-SUPPORT-JUSTIFICATION");
  public static final SubLSymbol $sym12$KB_HL_SUPPORT = makeSymbol("KB-HL-SUPPORT");
  public static final SubLSymbol $sym13$KB_HL_SUPPORT_P = makeSymbol("KB-HL-SUPPORT-P");
  public static final SubLList $list14 = list(makeSymbol("ID"));
  public static final SubLList $list15 = list(makeKeyword("ID"));
  public static final SubLList $list16 = list(makeSymbol("KB-HLS-ID"));
  public static final SubLList $list17 = list(makeSymbol("_CSETF-KB-HLS-ID"));
  public static final SubLSymbol $sym18$PRINT_KB_HL_SUPPORT = makeSymbol("PRINT-KB-HL-SUPPORT");
  public static final SubLSymbol $sym19$KB_HL_SUPPORT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-HL-SUPPORT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym20$KB_HLS_ID = makeSymbol("KB-HLS-ID");
  public static final SubLSymbol $sym21$_CSETF_KB_HLS_ID = makeSymbol("_CSETF-KB-HLS-ID");
  public static final SubLSymbol $kw22$ID = makeKeyword("ID");
  public static final SubLString $str23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str24$_The_CFASL_invalid_KB_HL_support_ = makeString("<The CFASL invalid KB HL support>");
  public static final SubLString $str25$___s_ = makeString("#<~s>");
  public static final SubLString $str26$__KB_HL_SUPPORT__s_ = makeString("#<KB HL SUPPORT ~s>");
  public static final SubLInteger $int27$787 = makeInteger(787);
  public static final SubLSymbol $sym28$SXHASH_KB_HL_SUPPORT_METHOD = makeSymbol("SXHASH-KB-HL-SUPPORT-METHOD");
  public static final SubLSymbol $sym29$KB_HL_SUPPORT_CONTENT = makeSymbol("KB-HL-SUPPORT-CONTENT");
  public static final SubLSymbol $sym30$KB_HL_SUPPORT_CONTENT_P = makeSymbol("KB-HL-SUPPORT-CONTENT-P");
  public static final SubLList $list31 = list(makeSymbol("ARGUMENT"), makeSymbol("DEPENDENTS"));
  public static final SubLList $list32 = list(makeKeyword("ARGUMENT"), makeKeyword("DEPENDENTS"));
  public static final SubLList $list33 = list(makeSymbol("KB-HLSC-ARGUMENT"), makeSymbol("KB-HLSC-DEPENDENTS"));
  public static final SubLList $list34 = list(makeSymbol("_CSETF-KB-HLSC-ARGUMENT"), makeSymbol("_CSETF-KB-HLSC-DEPENDENTS"));
  public static final SubLSymbol $sym35$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym36$KB_HL_SUPPORT_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-HL-SUPPORT-CONTENT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym37$KB_HLSC_ARGUMENT = makeSymbol("KB-HLSC-ARGUMENT");
  public static final SubLSymbol $sym38$_CSETF_KB_HLSC_ARGUMENT = makeSymbol("_CSETF-KB-HLSC-ARGUMENT");
  public static final SubLSymbol $sym39$KB_HLSC_DEPENDENTS = makeSymbol("KB-HLSC-DEPENDENTS");
  public static final SubLSymbol $sym40$_CSETF_KB_HLSC_DEPENDENTS = makeSymbol("_CSETF-KB-HLSC-DEPENDENTS");
  public static final SubLSymbol $kw41$ARGUMENT = makeKeyword("ARGUMENT");
  public static final SubLSymbol $kw42$DEPENDENTS = makeKeyword("DEPENDENTS");
  public static final SubLSymbol $sym43$_KB_HL_SUPPORTS_FROM_IDS_ = makeSymbol("*KB-HL-SUPPORTS-FROM-IDS*");
  public static final SubLList $list44 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc KB HL supports")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list45 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw46$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLString $str47$mapping_Cyc_KB_HL_supports = makeString("mapping Cyc KB HL supports");
  public static final SubLSymbol $sym48$DO_KB_SUID_TABLE = makeSymbol("DO-KB-SUID-TABLE");
  public static final SubLList $list49 = list(makeSymbol("DO-KB-HL-SUPPORTS-TABLE"));
  public static final SubLList $list50 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym51$DO_KB_SUID_TABLE_OLD_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-OLD-OBJECTS");
  public static final SubLSymbol $sym52$DO_KB_SUID_TABLE_NEW_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-NEW-OBJECTS");
  public static final SubLSymbol $sym53$DO_KB_HL_SUPPORTS_TABLE = makeSymbol("DO-KB-HL-SUPPORTS-TABLE");
  public static final SubLSymbol $sym54$DO_KB_HL_SUPPORTS = makeSymbol("DO-KB-HL-SUPPORTS");
  public static final SubLString $str55$Determining_maximum_KB_HL_support = makeString("Determining maximum KB HL support ID");
  public static final SubLSymbol $sym56$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw57$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym58$_KB_HL_SUPPORT_INDEX_ = makeSymbol("*KB-HL-SUPPORT-INDEX*");
  public static final SubLString $str59$KB_HL_support_indexing_lock = makeString("KB HL support indexing lock");
  public static final SubLList $list60 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("DefaultSemanticsForStringFn")), constant_handles.reader_make_constant_shell(makeString("evaluate")), constant_handles.reader_make_constant_shell(makeString("genlInverse")), constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), constant_handles.reader_make_constant_shell(makeString("SubLStringConcatenationFn")), constant_handles.reader_make_constant_shell(makeString("TheList")), constant_handles.reader_make_constant_shell(makeString("TheSet"))});
  public static final SubLSymbol $sym61$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $sym62$KB_HL_SUPPORT_INDEX_UNINDEXED_TERM_ = makeSymbol("KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?");
  public static final SubLList $list63 = list(makeSymbol("MODULE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str64$reindexing_KB_HL_supports = makeString("reindexing KB HL supports");
  public static final SubLSymbol $sym65$_KB_HL_SUPPORTS_BEING_CREATED_ = makeSymbol("*KB-HL-SUPPORTS-BEING-CREATED*");
  public static final SubLString $str66$Freeing_KB_HL_supports = makeString("Freeing KB HL supports");
  public static final SubLSymbol $sym67$POSSIBLY_REIFY_HL_SUPPORT = makeSymbol("POSSIBLY-REIFY-HL-SUPPORT");
  public static final SubLSymbol $sym68$UNREIFY_KB_HL_SUPPORT = makeSymbol("UNREIFY-KB-HL-SUPPORT");
  public static final SubLSymbol $sym69$PIF = makeSymbol("PIF");
  public static final SubLList $list70 = list(makeSymbol("ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?"));
  public static final SubLSymbol $sym71$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym72$CLET = makeSymbol("CLET");
  public static final SubLList $list73 = list(list(makeSymbol("*TMS-KB-HL-SUPPORT-QUEUE*"), list(makeSymbol("CREATE-QUEUE"))));
  public static final SubLList $list74 = list(list(makeSymbol("PROCESS-TMS-KB-HL-SUPPORT-QUEUE")));
  public static final SubLSymbol $sym75$PROCESS_TMS_KB_HL_SUPPORT_QUEUE = makeSymbol("PROCESS-TMS-KB-HL-SUPPORT-QUEUE");
  public static final SubLSymbol $sym76$WITH_KB_HL_SUPPORT_REJUSTIFICATION = makeSymbol("WITH-KB-HL-SUPPORT-REJUSTIFICATION");
  public static final SubLList $list77 = list(list(makeSymbol("*KB-HL-SUPPORT-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-KB-HL-SUPPORT-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("KB-HL-SUPPORT-DUMP-ID"))));
  public static final SubLSymbol $sym78$CREATE_KB_HL_SUPPORT_DUMP_ID_TABLE = makeSymbol("CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE");
  public static final SubLSymbol $sym79$WITH_KB_HL_SUPPORT_DUMP_ID_TABLE = makeSymbol("WITH-KB-HL-SUPPORT-DUMP-ID-TABLE");
  public static final SubLString $str80$Verifying_KB_HL_support_indexing = makeString("Verifying KB HL support indexing");
  public static final SubLString $str81$Searching_for_circular_KB_HL_supp = makeString("Searching for circular KB HL supports");
  public static final SubLString $str82$Searching_for_duplicate_KB_HL_sup = makeString("Searching for duplicate KB HL supports");
  public static final SubLSymbol $sym83$_ = makeSymbol("<");
  public static final SubLSymbol $sym84$KB_HL_SUPPORT_ID = makeSymbol("KB-HL-SUPPORT-ID");
  public static final SubLString $str85$Searching_for_KB_HL_supports_with = makeString("Searching for KB HL supports with invalid dependents");
  public static final SubLString $str86$Searching_for_KB_HL_supports_with = makeString("Searching for KB HL supports with invalid arguments");
  public static final SubLString $str87$Searching_for_KB_HL_supports_with = makeString("Searching for KB HL supports with invalid HL supports");
  public static final SubLString $str88$Searching_for_KB_HL_supports_with = makeString("Searching for KB HL supports with missing backpointers");
  public static final SubLSymbol $sym89$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str90$Verifying_KB_HL_supports = makeString("Verifying KB HL supports");
  public static final SubLString $str91$__Error_during_KB_HL_support_veri = makeString("~&Error during KB HL support verification: ~a~%");
  public static final SubLString $str92$__Error_during_indexing_verificat = makeString("~&Error during indexing verification: ~a~%");
  public static final SubLString $str93$__The_following_KB_HL_supports_we = makeString("~&The following KB HL supports were not findable via their HL supports (~s in total):~%");
  public static final SubLString $str94$__s__s__ = makeString(" ~s ~s~%");
  public static final SubLString $str95$___s_KB_HL_supports_are_not_finab = makeString("~&~s KB HL supports are not finable via their HL supports.~%");
  public static final SubLString $str96$__Error_during_non_circularity_ve = makeString("~&Error during non-circularity verification: ~a~%");
  public static final SubLString $str97$__The_following_KB_HL_supports_ar = makeString("~&The following KB HL supports are circular (~s in total):~%");
  public static final SubLString $str98$___s_KB_HL_supports_are_circular_ = makeString("~&~s KB HL supports are circular.~%");
  public static final SubLString $str99$__Error_during_uniqueness_verific = makeString("~&Error during uniqueness verification: ~a~%");
  public static final SubLString $str100$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have duplicates (~s in total):~%");
  public static final SubLString $str101$___s_KB_HL_supports_have_duplicat = makeString("~&~s KB HL supports have duplicates.~%");
  public static final SubLString $str102$__Error_during_dependent_verifica = makeString("~&Error during dependent verification: ~a~%");
  public static final SubLString $str103$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have invalid dependents (~s in total):~%");
  public static final SubLString $str104$___s_KB_HL_supports_have_invalid_ = makeString("~&~s KB HL supports have invalid dependents.~%");
  public static final SubLString $str105$__Error_during_argument_verificat = makeString("~&Error during argument verification: ~a~%");
  public static final SubLString $str106$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have invalid arguments (~s in total):~%");
  public static final SubLString $str107$___s_KB_HL_supports_have_invalid_ = makeString("~&~s KB HL supports have invalid arguments.~%");
  public static final SubLString $str108$__Error_during_HL_support_verific = makeString("~&Error during HL support verification: ~a~%");
  public static final SubLString $str109$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have invalid HL supports (~s in total):~%");
  public static final SubLString $str110$___s_KB_HL_supports_have_invalid_ = makeString("~&~s KB HL supports have invalid HL supports.~%");
  public static final SubLString $str111$__Error_during_KB_HL_support_back = makeString("~&Error during KB HL support backpointer verification: ~a~%");
  public static final SubLString $str112$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have missing backpointers (~s in total):~%");
  public static final SubLString $str113$___s_KB_HL_supports_have_missing_ = makeString("~&~s KB HL supports have missing backpointers.~%");
  public static final SubLString $str114$Eliminating_duplicate_KB_HL_suppo = makeString("Eliminating duplicate KB HL supports");
  public static final SubLString $str115$Eliminating_invalid_KB_HL_support = makeString("Eliminating invalid KB HL support dependents");
  public static final SubLSymbol $sym116$VALID_DEDUCTION_ = makeSymbol("VALID-DEDUCTION?");
  public static final SubLString $str117$Eliminating_KB_HL_supports_with_i = makeString("Eliminating KB HL supports with invalid HL supports");
  public static final SubLString $str118$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLString $str119$Bootstrapping_KB_HL_supports = makeString("Bootstrapping KB HL supports");
  public static final SubLString $str120$Could_not_create_KB_HL_support_fo = makeString("Could not create KB HL support for ~s because ~a");

  //// Initializers

  public void declareFunctions() {
    declare_kb_hl_supports_file();
  }

  public void initializeVariables() {
    init_kb_hl_supports_file();
  }

  public void runTopLevelForms() {
    setup_kb_hl_supports_file();
  }

}
