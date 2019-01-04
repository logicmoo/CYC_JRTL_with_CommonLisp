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
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deduction_manager;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.kb_hl_supports;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class deductions_low extends SubLTranslatedFile {

  //// Constructor

  private deductions_low() {}
  public static final SubLFile me = new deductions_low();
  public static final String myName = "com.cyc.cycjava.cycl.deductions_low";

  //// Definitions

  public static final class $deduction_content_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $tv; }
    public SubLObject getField3() { return $assertion; }
    public SubLObject getField4() { return $supports; }
    public SubLObject setField2(SubLObject value) { return $tv = value; }
    public SubLObject setField3(SubLObject value) { return $assertion = value; }
    public SubLObject setField4(SubLObject value) { return $supports = value; }
    public SubLObject $tv = NIL;
    public SubLObject $assertion = NIL;
    public SubLObject $supports = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($deduction_content_native.class, $sym0$DEDUCTION_CONTENT, $sym1$DEDUCTION_CONTENT_P, $list3, $list4, new String[] {"$tv", "$assertion", "$supports"}, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static SubLSymbol $dtp_deduction_content$ = null;

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static final SubLObject deduction_content_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static final SubLObject deduction_content_p(SubLObject object) {
    return ((object.getClass() == $deduction_content_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $deduction_content_p$UnaryFunction extends UnaryFunction {
    public $deduction_content_p$UnaryFunction() { super(extractFunctionNamed("DEDUCTION-CONTENT-P")); }
    public SubLObject processItem(SubLObject arg1) { return deduction_content_p(arg1); }
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static final SubLObject d_content_tv(SubLObject object) {
    checkType(object, $sym1$DEDUCTION_CONTENT_P);
    return object.getField2();
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static final SubLObject d_content_assertion(SubLObject object) {
    checkType(object, $sym1$DEDUCTION_CONTENT_P);
    return object.getField3();
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static final SubLObject d_content_supports(SubLObject object) {
    checkType(object, $sym1$DEDUCTION_CONTENT_P);
    return object.getField4();
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static final SubLObject _csetf_d_content_tv(SubLObject object, SubLObject value) {
    checkType(object, $sym1$DEDUCTION_CONTENT_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static final SubLObject _csetf_d_content_assertion(SubLObject object, SubLObject value) {
    checkType(object, $sym1$DEDUCTION_CONTENT_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static final SubLObject _csetf_d_content_supports(SubLObject object, SubLObject value) {
    checkType(object, $sym1$DEDUCTION_CONTENT_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1136) 
  public static final SubLObject make_deduction_content(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $deduction_content_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw15$TV)) {
            _csetf_d_content_tv(v_new, current_value);
          } else if (pcase_var.eql($kw16$ASSERTION)) {
            _csetf_d_content_assertion(v_new, current_value);
          } else if (pcase_var.eql($kw17$SUPPORTS)) {
            _csetf_d_content_supports(v_new, current_value);
          } else {
            Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1263) 
  public static final SubLObject create_deduction_content(SubLObject id, SubLObject assertion, SubLObject supports) {
    {
      SubLObject deduction_content = NIL;
      deduction_content = make_deduction_content(UNPROVIDED);
      _csetf_d_content_assertion(deduction_content, assertion);
      _csetf_d_content_supports(deduction_content, supports);
      _csetf_d_content_tv(deduction_content, $kw19$UNKNOWN);
      deduction_manager.register_deduction_content(id, deduction_content);
      return deduction_content;
    }
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 1747) 
  public static final SubLObject destroy_deduction_content(SubLObject id) {
    {
      SubLObject deduction_content = deduction_manager.lookup_deduction_content(id);
      if ((NIL != deduction_content_p(deduction_content))) {
        deduction_manager.deregister_deduction_content(id);
        _csetf_d_content_tv(deduction_content, NIL);
        _csetf_d_content_assertion(deduction_content, NIL);
        _csetf_d_content_supports(deduction_content, NIL);
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 2152) 
  public static final SubLObject lookup_deduction_tv(SubLObject id) {
    return d_content_tv(deduction_manager.lookup_deduction_content(id));
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 2269) 
  public static final SubLObject lookup_deduction_assertion(SubLObject id) {
    return d_content_assertion(deduction_manager.lookup_deduction_content(id));
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 2379) 
  public static final SubLObject lookup_deduction_supports(SubLObject id) {
    return d_content_supports(deduction_manager.lookup_deduction_content(id));
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 2488) 
  public static final SubLObject set_deduction_tv(SubLObject id, SubLObject new_tv) {
    _csetf_d_content_tv(deduction_manager.lookup_deduction_content(id), new_tv);
    deduction_manager.mark_deduction_content_as_muted(id);
    return id;
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 3518) 
  public static final SubLObject load_deduction_content(SubLObject deduction, SubLObject stream) {
    {
      SubLObject id = deduction_handles.deduction_id(deduction);
      SubLObject tv = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject assertion = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject supports = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      load_deduction_content_int(id, assertion, supports, tv);
    }
    return deduction;
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 4061) 
  public static final SubLObject load_deduction_content_int(SubLObject id, SubLObject assertion, SubLObject supports, SubLObject tv) {
    {
      SubLObject deduction_content = create_deduction_content(id, assertion, supports);
      _csetf_d_content_tv(deduction_content, tv);
    }
    return id;
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 4274) 
  public static final SubLObject kb_create_deduction_kb_store(SubLObject assertion, SubLObject supports, SubLObject truth) {
    {
      SubLObject internal_id = deduction_handles.make_deduction_id();
      SubLObject deduction = deduction_handles.make_deduction_shell(internal_id);
      kb_create_deduction_int(deduction, internal_id, assertion, supports, truth);
      return internal_id;
    }
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 4726) 
  public static final SubLObject kb_create_deduction_int(SubLObject deduction, SubLObject internal_id, SubLObject assertion, SubLObject supports, SubLObject truth) {
    {
      SubLObject tv = enumeration_types.tv_from_truth_strength(truth, $kw20$DEFAULT);
      create_deduction_content(internal_id, assertion, supports);
      reset_deduction_tv(deduction, tv);
      if ((NIL != assertion_handles.assertion_p(assertion))) {
        assertions_low.add_new_assertion_argument(assertion, deduction);
      }
      add_deduction_dependents(deduction);
    }
    return NIL;
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 5220) 
  public static final SubLObject add_deduction_dependents(SubLObject deduction) {
    checkType(deduction, $sym21$DEDUCTION_P);
    {
      SubLObject cdolist_list_var = deduction_supports_internal(deduction);
      SubLObject support = NIL;
      for (support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support = cdolist_list_var.first()) {
        if ((NIL != assertion_handles.assertion_p(support))) {
          assertions_low.add_assertion_dependent(support, deduction);
        } else if ((NIL != kb_hl_supports.kb_hl_support_p(support))) {
          kb_hl_supports.kb_hl_support_add_dependent(support, deduction);
        }
      }
    }
    return deduction;
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 5564) 
  public static final SubLObject kb_remove_deduction_internal(SubLObject deduction) {
    {
      SubLObject id = deduction_handles.deduction_id(deduction);
      destroy_deduction_content(id);
      deduction_handles.deregister_deduction_id(id);
    }
    deduction_handles.free_deduction(deduction);
    return T;
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 5797) 
  public static final SubLObject remove_deduction_dependents(SubLObject deduction) {
    checkType(deduction, $sym21$DEDUCTION_P);
    {
      SubLObject cdolist_list_var = deduction_supports_internal(deduction);
      SubLObject support = NIL;
      for (support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support = cdolist_list_var.first()) {
        if ((NIL != assertion_handles.valid_assertionP(support, UNPROVIDED))) {
          assertions_low.remove_assertion_dependent(support, deduction);
        } else if ((NIL != kb_hl_supports.valid_kb_hl_supportP(support, UNPROVIDED))) {
          kb_hl_supports.kb_hl_support_remove_dependent(support, deduction);
        }
      }
    }
    return deduction;
  }

  /** Primitively change the tv of DEDUCTION to NEW-TV. */
  @SubL(source = "cycl/deductions-low.lisp", position = 6160) 
  public static final SubLObject reset_deduction_tv(SubLObject deduction, SubLObject new_tv) {
    set_deduction_tv(deduction_handles.deduction_id(deduction), new_tv);
    return deduction;
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 6561) 
  public static final SubLObject kb_set_deduction_strength_internal(SubLObject deduction, SubLObject new_strength) {
    {
      SubLObject truth = arguments.argument_truth(deduction);
      SubLObject new_tv = enumeration_types.tv_from_truth_strength(truth, new_strength);
      return reset_deduction_tv(deduction, new_tv);
    }
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 7159) 
  public static final SubLObject find_deduction_internal(SubLObject assertion, SubLObject supports, SubLObject truth) {
    {
      SubLObject deduction = NIL;
      if ((NIL != assertion_handles.assertion_p(assertion))) {
        {
          SubLObject rest = NIL;
          for (rest = assertions_high.assertion_arguments(assertion); (!(((NIL != deduction)
                || (NIL == rest)))); rest = rest.rest()) {
            {
              SubLObject argument = rest.first();
              if ((NIL != deduction_handles.deduction_p(argument))) {
                if ((NIL != deduction_matches_specification(argument, assertion, supports, truth))) {
                  deduction = argument;
                }
              }
            }
          }
        }
      } else if ((NIL != kb_hl_supports.kb_hl_support_p(assertion))) {
        {
          SubLObject rest = NIL;
          for (rest = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11006"); (!(((NIL != deduction)
                || (NIL == rest)))); rest = rest.rest()) {
            {
              SubLObject argument = rest.first();
              if ((NIL != deduction_handles.deduction_p(argument))) {
                {
                  SubLObject hl_support = kb_hl_supports.kb_hl_support_hl_support(assertion);
                  if ((NIL != deduction_matches_specification(argument, hl_support, supports, truth))) {
                    deduction = argument;
                  }
                }
              }
            }
          }
        }
      }
      return deduction;
    }
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 7883) 
  public static final SubLObject deduction_matches_specification(SubLObject deduction, SubLObject assertion, SubLObject supports, SubLObject truth) {
    if ((truth == UNPROVIDED)) {
      truth = $kw22$TRUE;
    }
    return makeBoolean((assertion.equal(deductions_high.deduction_assertion(deduction))
           && (truth == arguments.argument_truth(deduction))
           && (NIL != deductions_high.deduction_supports_equal(supports, deductions_high.deduction_supports(deduction)))));
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 8238) 
  public static final SubLObject deduction_assertion_internal(SubLObject deduction) {
    return lookup_deduction_assertion(deduction_handles.deduction_id(deduction));
  }

  /** Return the tv of DEDUCTION. */
  @SubL(source = "cycl/deductions-low.lisp", position = 8375) 
  public static final SubLObject deduction_tv(SubLObject deduction) {
    checkType(deduction, $sym21$DEDUCTION_P);
    return lookup_deduction_tv(deduction_handles.deduction_id(deduction));
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 8575) 
  public static final SubLObject deduction_supports_internal(SubLObject deduction) {
    return lookup_deduction_supports(deduction_handles.deduction_id(deduction));
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 8696) 
  public static final SubLObject deduction_truth_internal(SubLObject deduction) {
    return enumeration_types.tv_truth(deduction_tv(deduction));
  }

  @SubL(source = "cycl/deductions-low.lisp", position = 8797) 
  public static final SubLObject deduction_strength_internal(SubLObject deduction) {
    return enumeration_types.tv_strength(deduction_tv(deduction));
  }

  public static final SubLObject declare_deductions_low_file() {
    declareFunction(myName, "deduction_content_print_function_trampoline", "DEDUCTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "deduction_content_p", "DEDUCTION-CONTENT-P", 1, 0, false); new $deduction_content_p$UnaryFunction();
    declareFunction(myName, "d_content_tv", "D-CONTENT-TV", 1, 0, false);
    declareFunction(myName, "d_content_assertion", "D-CONTENT-ASSERTION", 1, 0, false);
    declareFunction(myName, "d_content_supports", "D-CONTENT-SUPPORTS", 1, 0, false);
    declareFunction(myName, "_csetf_d_content_tv", "_CSETF-D-CONTENT-TV", 2, 0, false);
    declareFunction(myName, "_csetf_d_content_assertion", "_CSETF-D-CONTENT-ASSERTION", 2, 0, false);
    declareFunction(myName, "_csetf_d_content_supports", "_CSETF-D-CONTENT-SUPPORTS", 2, 0, false);
    declareFunction(myName, "make_deduction_content", "MAKE-DEDUCTION-CONTENT", 0, 1, false);
    declareFunction(myName, "create_deduction_content", "CREATE-DEDUCTION-CONTENT", 3, 0, false);
    declareFunction(myName, "destroy_deduction_content", "DESTROY-DEDUCTION-CONTENT", 1, 0, false);
    declareFunction(myName, "lookup_deduction_tv", "LOOKUP-DEDUCTION-TV", 1, 0, false);
    declareFunction(myName, "lookup_deduction_assertion", "LOOKUP-DEDUCTION-ASSERTION", 1, 0, false);
    declareFunction(myName, "lookup_deduction_supports", "LOOKUP-DEDUCTION-SUPPORTS", 1, 0, false);
    declareFunction(myName, "set_deduction_tv", "SET-DEDUCTION-TV", 2, 0, false);
    declareFunction(myName, "set_deduction_supports", "SET-DEDUCTION-SUPPORTS", 2, 0, false);
    declareFunction(myName, "dump_deduction_content", "DUMP-DEDUCTION-CONTENT", 2, 0, false);
    declareFunction(myName, "bundle_deduction_content_for_dumping", "BUNDLE-DEDUCTION-CONTENT-FOR-DUMPING", 1, 0, false);
    declareFunction(myName, "bundle_deduction_content", "BUNDLE-DEDUCTION-CONTENT", 3, 0, false);
    declareFunction(myName, "load_deduction_content", "LOAD-DEDUCTION-CONTENT", 2, 0, false);
    declareFunction(myName, "load_deduction_content_as_bundle", "LOAD-DEDUCTION-CONTENT-AS-BUNDLE", 2, 0, false);
    declareFunction(myName, "load_deduction_content_int", "LOAD-DEDUCTION-CONTENT-INT", 4, 0, false);
    declareFunction(myName, "kb_create_deduction_kb_store", "KB-CREATE-DEDUCTION-KB-STORE", 3, 0, false);
    declareFunction(myName, "kb_create_deduction_int", "KB-CREATE-DEDUCTION-INT", 5, 0, false);
    declareFunction(myName, "kb_create_deduction_cyc", "KB-CREATE-DEDUCTION-CYC", 1, 0, false);
    declareFunction(myName, "add_deduction_dependents", "ADD-DEDUCTION-DEPENDENTS", 1, 0, false);
    declareFunction(myName, "kb_remove_deduction_internal", "KB-REMOVE-DEDUCTION-INTERNAL", 1, 0, false);
    declareFunction(myName, "remove_deduction_dependents", "REMOVE-DEDUCTION-DEPENDENTS", 1, 0, false);
    declareFunction(myName, "reset_deduction_tv", "RESET-DEDUCTION-TV", 2, 0, false);
    declareFunction(myName, "kb_set_deduction_strength_internal", "KB-SET-DEDUCTION-STRENGTH-INTERNAL", 2, 0, false);
    declareFunction(myName, "reset_deduction_supports", "RESET-DEDUCTION-SUPPORTS", 2, 0, false);
    declareFunction(myName, "find_deduction_internal", "FIND-DEDUCTION-INTERNAL", 3, 0, false);
    declareFunction(myName, "deduction_matches_specification", "DEDUCTION-MATCHES-SPECIFICATION", 3, 1, false);
    declareFunction(myName, "deduction_assertion_internal", "DEDUCTION-ASSERTION-INTERNAL", 1, 0, false);
    declareFunction(myName, "deduction_tv", "DEDUCTION-TV", 1, 0, false);
    declareFunction(myName, "deduction_supports_internal", "DEDUCTION-SUPPORTS-INTERNAL", 1, 0, false);
    declareFunction(myName, "deduction_truth_internal", "DEDUCTION-TRUTH-INTERNAL", 1, 0, false);
    declareFunction(myName, "deduction_strength_internal", "DEDUCTION-STRENGTH-INTERNAL", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_deductions_low_file() {
    $dtp_deduction_content$ = defconstant("*DTP-DEDUCTION-CONTENT*", $sym0$DEDUCTION_CONTENT);
    return NIL;
  }

  public static final SubLObject setup_deductions_low_file() {
    // CVS_ID("Id: deductions-low.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_deduction_content$.getGlobalValue(), Symbols.symbol_function($sym8$DEDUCTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$D_CONTENT_TV, $sym10$_CSETF_D_CONTENT_TV);
    Structures.def_csetf($sym11$D_CONTENT_ASSERTION, $sym12$_CSETF_D_CONTENT_ASSERTION);
    Structures.def_csetf($sym13$D_CONTENT_SUPPORTS, $sym14$_CSETF_D_CONTENT_SUPPORTS);
    Equality.identity($sym0$DEDUCTION_CONTENT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$DEDUCTION_CONTENT = makeSymbol("DEDUCTION-CONTENT");
  public static final SubLSymbol $sym1$DEDUCTION_CONTENT_P = makeSymbol("DEDUCTION-CONTENT-P");
  public static final SubLInteger $int2$149 = makeInteger(149);
  public static final SubLList $list3 = list(makeSymbol("TV"), makeSymbol("ASSERTION"), makeSymbol("SUPPORTS"));
  public static final SubLList $list4 = list(makeKeyword("TV"), makeKeyword("ASSERTION"), makeKeyword("SUPPORTS"));
  public static final SubLList $list5 = list(makeSymbol("D-CONTENT-TV"), makeSymbol("D-CONTENT-ASSERTION"), makeSymbol("D-CONTENT-SUPPORTS"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-D-CONTENT-TV"), makeSymbol("_CSETF-D-CONTENT-ASSERTION"), makeSymbol("_CSETF-D-CONTENT-SUPPORTS"));
  public static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym8$DEDUCTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DEDUCTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$D_CONTENT_TV = makeSymbol("D-CONTENT-TV");
  public static final SubLSymbol $sym10$_CSETF_D_CONTENT_TV = makeSymbol("_CSETF-D-CONTENT-TV");
  public static final SubLSymbol $sym11$D_CONTENT_ASSERTION = makeSymbol("D-CONTENT-ASSERTION");
  public static final SubLSymbol $sym12$_CSETF_D_CONTENT_ASSERTION = makeSymbol("_CSETF-D-CONTENT-ASSERTION");
  public static final SubLSymbol $sym13$D_CONTENT_SUPPORTS = makeSymbol("D-CONTENT-SUPPORTS");
  public static final SubLSymbol $sym14$_CSETF_D_CONTENT_SUPPORTS = makeSymbol("_CSETF-D-CONTENT-SUPPORTS");
  public static final SubLSymbol $kw15$TV = makeKeyword("TV");
  public static final SubLSymbol $kw16$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $kw17$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw19$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $kw20$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym21$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLSymbol $kw22$TRUE = makeKeyword("TRUE");

  //// Initializers

  public void declareFunctions() {
    declare_deductions_low_file();
  }

  public void initializeVariables() {
    init_deductions_low_file();
  }

  public void runTopLevelForms() {
    setup_deductions_low_file();
  }

}
