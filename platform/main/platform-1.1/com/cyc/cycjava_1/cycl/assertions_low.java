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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_manager;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.clause_strucs;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.file_hash_table;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_hl_supports;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.keyhash;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class assertions_low extends SubLTranslatedFile {

  //// Constructor

  private assertions_low() {}
  public static final SubLFile me = new assertions_low();
  public static final String myName = "com.cyc.cycjava_1.cycl.assertions_low";

  //// Definitions

  public static final class $assertion_content_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $formula_data; }
    public SubLObject getField3() { return $mt; }
    public SubLObject getField4() { return $flags; }
    public SubLObject getField5() { return $arguments; }
    public SubLObject getField6() { return $plist; }
    public SubLObject setField2(SubLObject value) { return $formula_data = value; }
    public SubLObject setField3(SubLObject value) { return $mt = value; }
    public SubLObject setField4(SubLObject value) { return $flags = value; }
    public SubLObject setField5(SubLObject value) { return $arguments = value; }
    public SubLObject setField6(SubLObject value) { return $plist = value; }
    public SubLObject $formula_data = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $flags = NIL;
    public SubLObject $arguments = NIL;
    public SubLObject $plist = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($assertion_content_native.class, $sym0$ASSERTION_CONTENT, $sym1$ASSERTION_CONTENT_P, $list3, $list4, new String[] {"$formula_data", "$mt", "$flags", "$arguments", "$plist"}, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static SubLSymbol $dtp_assertion_content$ = null;

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject assertion_content_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject assertion_content_p(SubLObject object) {
    return ((object.getClass() == $assertion_content_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $assertion_content_p$UnaryFunction extends UnaryFunction {
    public $assertion_content_p$UnaryFunction() { super(extractFunctionNamed("ASSERTION-CONTENT-P")); }
    public SubLObject processItem(SubLObject arg1) { return assertion_content_p(arg1); }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject as_content_formula_data(SubLObject object) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.getField2();
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject as_content_mt(SubLObject object) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.getField3();
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject as_content_flags(SubLObject object) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.getField4();
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject as_content_arguments(SubLObject object) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.getField5();
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject as_content_plist(SubLObject object) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.getField6();
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject _csetf_as_content_formula_data(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject _csetf_as_content_mt(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject _csetf_as_content_flags(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject _csetf_as_content_arguments(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject _csetf_as_content_plist(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ASSERTION_CONTENT_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1510) 
  public static final SubLObject make_assertion_content(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $assertion_content_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw19$FORMULA_DATA)) {
            _csetf_as_content_formula_data(v_new, current_value);
          } else if (pcase_var.eql($kw20$MT)) {
            _csetf_as_content_mt(v_new, current_value);
          } else if (pcase_var.eql($kw21$FLAGS)) {
            _csetf_as_content_flags(v_new, current_value);
          } else if (pcase_var.eql($kw22$ARGUMENTS)) {
            _csetf_as_content_arguments(v_new, current_value);
          } else if (pcase_var.eql($kw23$PLIST)) {
            _csetf_as_content_plist(v_new, current_value);
          } else {
            Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 1858) 
  private static SubLSymbol $default_assertion_flags$ = null;

  @SubL(source = "cycl/assertions-low.lisp", position = 1925) 
  public static final SubLObject create_assertion_content(SubLObject mt) {
    {
      SubLObject assertion_content = NIL;
      assertion_content = make_assertion_content(UNPROVIDED);
      _csetf_as_content_formula_data(assertion_content, NIL);
      _csetf_as_content_mt(assertion_content, mt);
      _csetf_as_content_flags(assertion_content, $default_assertion_flags$.getGlobalValue());
      _csetf_as_content_arguments(assertion_content, NIL);
      _csetf_as_content_plist(assertion_content, NIL);
      return assertion_content;
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 2456) 
  public static final SubLObject destroy_assertion_content(SubLObject id) {
    {
      SubLObject assertion_content = assertion_manager.lookup_assertion_content(id);
      if ((NIL != assertion_content_p(assertion_content))) {
        assertion_manager.deregister_assertion_content(id);
        _csetf_as_content_formula_data(assertion_content, NIL);
        _csetf_as_content_mt(assertion_content, NIL);
        _csetf_as_content_flags(assertion_content, NIL);
        _csetf_as_content_arguments(assertion_content, NIL);
        _csetf_as_content_plist(assertion_content, NIL);
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 2997) 
  public static final SubLObject lookup_assertion_formula_data(SubLObject id) {
    {
      SubLObject contents = assertion_manager.lookup_assertion_content(id);
      return ((NIL != contents) ? ((SubLObject) as_content_formula_data(contents)) : NIL);
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 3178) 
  public static final SubLObject lookup_assertion_mt(SubLObject id) {
    {
      SubLObject contents = assertion_manager.lookup_assertion_content(id);
      return ((NIL != contents) ? ((SubLObject) as_content_mt(contents)) : NIL);
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 3325) 
  public static final SubLObject lookup_assertion_flags(SubLObject id) {
    {
      SubLObject contents = assertion_manager.lookup_assertion_content(id);
      return ((NIL != contents) ? ((SubLObject) as_content_flags(contents)) : NIL);
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 3478) 
  public static final SubLObject lookup_assertion_arguments(SubLObject id) {
    {
      SubLObject contents = assertion_manager.lookup_assertion_content(id);
      return ((NIL != contents) ? ((SubLObject) as_content_arguments(contents)) : NIL);
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 3639) 
  public static final SubLObject lookup_assertion_plist(SubLObject id) {
    {
      SubLObject contents = assertion_manager.lookup_assertion_content(id);
      return ((NIL != contents) ? ((SubLObject) as_content_plist(contents)) : NIL);
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 3792) 
  public static final SubLObject set_assertion_formula_data(SubLObject id, SubLObject new_formula_data) {
    _csetf_as_content_formula_data(assertion_manager.lookup_assertion_content(id), new_formula_data);
    assertion_manager.mark_assertion_content_as_muted(id);
    return id;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 4004) 
  public static final SubLObject set_assertion_flags(SubLObject id, SubLObject new_flags) {
    _csetf_as_content_flags(assertion_manager.lookup_assertion_content(id), new_flags);
    assertion_manager.mark_assertion_content_as_muted(id);
    return id;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 4176) 
  public static final SubLObject set_assertion_arguments(SubLObject id, SubLObject new_arguments) {
    _csetf_as_content_arguments(assertion_manager.lookup_assertion_content(id), new_arguments);
    assertion_manager.mark_assertion_content_as_muted(id);
    return id;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 4364) 
  public static final SubLObject set_assertion_plist(SubLObject id, SubLObject new_plist) {
    _csetf_as_content_plist(assertion_manager.lookup_assertion_content(id), new_plist);
    assertion_manager.mark_assertion_content_as_muted(id);
    return id;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 5771) 
  public static final SubLObject load_assertion_content(SubLObject assertion, SubLObject stream) {
    {
      SubLObject id = assertion_handles.assertion_id(assertion);
      SubLObject formula_data = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject mt = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject flags = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject v_arguments = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject plist = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      load_assertion_content_int(id, formula_data, mt, flags, v_arguments, plist);
    }
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 7024) 
  public static final SubLObject load_assertion_content_int(SubLObject id, SubLObject formula_data, SubLObject mt, SubLObject flags, SubLObject v_arguments, SubLObject plist) {
    {
      SubLObject assertion_content = create_assertion_content(mt);
      _csetf_as_content_formula_data(assertion_content, formula_data);
      _csetf_as_content_flags(assertion_content, flags);
      _csetf_as_content_arguments(assertion_content, v_arguments);
      _csetf_as_content_plist(assertion_content, plist);
      assertion_manager.register_assertion_content(id, assertion_content);
    }
    return id;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 7497) 
  public static final SubLObject assertion_cnf_internal(SubLObject assertion) {
    {
      SubLObject hl_cnf = assertion_hl_cnf(assertion);
      if ((NIL != clause_strucs.clause_struc_p(hl_cnf))) {
        return clause_strucs.clause_struc_cnf(hl_cnf);
      } else {
        return hl_cnf;
      }
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 7814) 
  public static final SubLObject possibly_assertion_cnf_internal(SubLObject assertion) {
    return ((NIL != valid_assertion_with_contentP(assertion)) ? ((SubLObject) assertion_cnf_internal(assertion)) : NIL);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 7973) 
  public static final SubLObject assertion_mt_internal(SubLObject assertion) {
    return lookup_assertion_mt(assertion_handles.assertion_id(assertion));
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 8082) 
  public static final SubLObject assertion_gaf_hl_formula_internal(SubLObject assertion) {
    if ((NIL != assertion_gaf_p(assertion))) {
      {
        SubLObject formula_data = assertion_formula_data(assertion);
        if ((NIL != clause_strucs.clause_struc_p(formula_data))) {
          return cnf_to_gaf_formula(clause_strucs.clause_struc_cnf(formula_data));
        } else {
          return formula_data;
        }
      }
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 8397) 
  public static final SubLObject assertion_cons_internal(SubLObject assertion) {
    return ((NIL != assertion_gaf_p(assertion)) ? ((SubLObject) assertions_high.assertion_gaf_hl_formula(assertion)) : assertion_cnf_internal(assertion));
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 8577) 
  public static final SubLObject assertion_direction_internal(SubLObject assertion) {
    return enumeration_types.decode_direction(assertion_flags_direction_code(assertion_flags(assertion)));
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 8732) 
  public static final SubLObject assertion_truth_internal(SubLObject assertion) {
    return enumeration_types.tv_truth(assertion_tv(assertion));
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 8833) 
  public static final SubLObject assertion_strength_internal(SubLObject assertion) {
    return enumeration_types.tv_strength(assertion_tv(assertion));
  }

  /** Return the hl tv of ASSERTION. */
  @SubL(source = "cycl/assertions-low.lisp", position = 8940) 
  public static final SubLObject assertion_tv(SubLObject assertion) {
    checkType(assertion, $sym26$ASSERTION_P);
    return enumeration_types.decode_tv(assertion_flags_tv_code(assertion_flags(assertion)));
  }

  /** Return the list of names for the variables in ASSERTION. */
  @SubL(source = "cycl/assertions-low.lisp", position = 9134) 
  public static final SubLObject assertion_variable_names_internal(SubLObject assertion) {
    return get_assertion_prop(assertion, $kw27$VARIABLE_NAMES, UNPROVIDED);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 9316) 
  public static final SubLObject asserted_by_internal(SubLObject assertion) {
    return ((NIL != assertions_high.asserted_assertionP(assertion)) ? ((SubLObject) assert_info_who(assertion_assert_info(assertion))) : NIL);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 9471) 
  public static final SubLObject asserted_when_internal(SubLObject assertion) {
    return ((NIL != assertions_high.asserted_assertionP(assertion)) ? ((SubLObject) assert_info_when(assertion_assert_info(assertion))) : NIL);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 9629) 
  public static final SubLObject asserted_why_internal(SubLObject assertion) {
    return ((NIL != assertions_high.asserted_assertionP(assertion)) ? ((SubLObject) assert_info_why(assertion_assert_info(assertion))) : NIL);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 9785) 
  public static final SubLObject asserted_second_internal(SubLObject assertion) {
    return ((NIL != assertions_high.asserted_assertionP(assertion)) ? ((SubLObject) assert_info_second(assertion_assert_info(assertion))) : NIL);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 9947) 
  public static final SubLObject assertion_arguments_internal(SubLObject assertion) {
    return lookup_assertion_arguments(assertion_handles.assertion_id(assertion));
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 10070) 
  public static final SubLObject assertion_dependents_internal(SubLObject assertion) {
    return get_assertion_prop(assertion, $kw28$DEPENDENTS, UNPROVIDED);
  }

  /** Return the HL structure used to implement the formula for ASSERTION.
   This will either be a clause struc containing a cnf, a cnf, or a gaf formula.
   @owner pace */
  @SubL(source = "cycl/assertions-low.lisp", position = 10183) 
  public static final SubLObject assertion_formula_data(SubLObject assertion) {
    checkType(assertion, $sym26$ASSERTION_P);
    return lookup_assertion_formula_data(assertion_handles.assertion_id(assertion));
  }

  /** Primitively sets the HL structure used to implement the formula for ASSERTION.
   This should either be a clause struc containing a cnf, a cnf, or a gaf formula.
   @owner pace */
  @SubL(source = "cycl/assertions-low.lisp", position = 10572) 
  public static final SubLObject reset_assertion_formula_data(SubLObject assertion, SubLObject new_formula_data) {
    checkType(assertion, $sym26$ASSERTION_P);
    set_assertion_formula_data(assertion_handles.assertion_id(assertion), new_formula_data);
    return assertion;
  }

  /** Return the HL structure used to implement the CNF clause for ASSERTION.
   This will either be a clause struc containing a cnf, or a cnf.
   gaf formulas are expanded into CNFs.
   @owner pace */
  @SubL(source = "cycl/assertions-low.lisp", position = 10959) 
  public static final SubLObject assertion_hl_cnf(SubLObject assertion) {
    checkType(assertion, $sym26$ASSERTION_P);
    {
      SubLObject formula_data = assertion_formula_data(assertion);
      if ((NIL != clause_strucs.clause_struc_p(formula_data))) {
        return formula_data;
      } else if ((NIL == formula_data)) {
        return formula_data;
      } else if ((NIL == assertion_gaf_p(assertion))) {
        return formula_data;
      } else {
        return gaf_formula_to_cnf(formula_data);
      }
    }
  }

  /** Primitively change the formula data of ASSERTION to NEW-FORMULA-DATA,
   and update the GAF flag.  Assumes that NEW-FORMULA-DATA is either a CNF clause, a gaf formula, a clause-struc, or NIL.
   @owner pace
   @todo robustify against @xref cnf-impostor? formulas */
  @SubL(source = "cycl/assertions-low.lisp", position = 11539) 
  public static final SubLObject update_assertion_formula_data(SubLObject assertion, SubLObject new_formula_data) {
    if ((NIL != clause_strucs.clause_struc_p(new_formula_data))) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32000");
    } else if ((NIL == new_formula_data)) {
      annihilate_assertion_formula_data(assertion);
    } else if ((NIL != clauses.cnf_p(new_formula_data))) {
      reset_assertion_cnf(assertion, new_formula_data);
    } else if ((NIL != el_utilities.el_formula_p(new_formula_data))) {
      reset_assertion_gaf_formula(assertion, new_formula_data);
    } else {
      Errors.error($str29$Unexpected_formula_data_type___S, new_formula_data);
      return NIL;
    }
    return assertion;
  }

  /** If ASSERTION has a clause struc as its HL CNF implementation, return it.
   Otherwise, return NIL. */
  @SubL(source = "cycl/assertions-low.lisp", position = 12346) 
  public static final SubLObject assertion_clause_struc(SubLObject assertion) {
    {
      SubLObject formula_data = assertion_formula_data(assertion);
      return ((NIL != clause_strucs.clause_struc_p(formula_data)) ? ((SubLObject) formula_data) : NIL);
    }
  }

  /** Primitively change the formula data of ASSERTION to NEW-CNF,
   and update the GAF flag.  Shrinks NEW-CNF to a gaf formula if possible.
   @param NEW-CNF cnf-p
   @owner pace */
  @SubL(source = "cycl/assertions-low.lisp", position = 12626) 
  public static final SubLObject reset_assertion_cnf(SubLObject assertion, SubLObject new_cnf) {
    {
      SubLObject gafP = determine_cnf_gaf_p(new_cnf);
      reset_assertion_formula_data(assertion, ((NIL != gafP) ? ((SubLObject) cnf_to_gaf_formula(new_cnf)) : new_cnf));
      set_assertion_gaf_p(assertion, gafP);
      return assertion;
    }
  }

  /** Primitively change the formula data of ASSERTION to NEW-GAF-FORMULA,
   and set the GAF flag to t.  Assumes that NEW-GAF-FORMULA is a valid gaf formula.
   @owner pace */
  @SubL(source = "cycl/assertions-low.lisp", position = 13603) 
  public static final SubLObject reset_assertion_gaf_formula(SubLObject assertion, SubLObject new_gaf_formula) {
    reset_assertion_formula_data(assertion, new_gaf_formula);
    set_assertion_gaf_p(assertion, T);
    return assertion;
  }

  /** Primitively change the formula data of ASSERTION to nil,
   and update the GAF flag to t (why not?)
   @owner pace */
  @SubL(source = "cycl/assertions-low.lisp", position = 13962) 
  public static final SubLObject annihilate_assertion_formula_data(SubLObject assertion) {
    reset_assertion_formula_data(assertion, NIL);
    set_assertion_gaf_p(assertion, T);
    return assertion;
  }

  /** Return the bit-flags for ASSERTION */
  @SubL(source = "cycl/assertions-low.lisp", position = 14246) 
  public static final SubLObject assertion_flags(SubLObject assertion) {
    {
      SubLObject flags = lookup_assertion_flags(assertion_handles.assertion_id(assertion));
      return flags;
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 14786) 
  public static final SubLObject reset_assertion_flags(SubLObject assertion, SubLObject new_flags) {
    checkType(assertion, $sym26$ASSERTION_P);
    {
      SubLObject flags = assertion_flags(assertion);
      if ((!(flags.eql(new_flags)))) {
        set_assertion_flags(assertion_handles.assertion_id(assertion), new_flags);
      }
    }
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 15051) 
  private static SubLSymbol $assertion_flags_gaf_byte$ = null;

  @SubL(source = "cycl/assertions-low.lisp", position = 15223) 
  public static final SubLObject set_assertion_flags_gaf_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $assertion_flags_gaf_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 15334) 
  private static SubLSymbol $assertion_flags_direction_byte$ = null;

  @SubL(source = "cycl/assertions-low.lisp", position = 15401) 
  public static final SubLObject assertion_flags_direction_code(SubLObject flags) {
    return bytes.ldb($assertion_flags_direction_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 15510) 
  public static final SubLObject set_assertion_flags_direction_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $assertion_flags_direction_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 15633) 
  private static SubLSymbol $assertion_flags_tv_byte$ = null;

  @SubL(source = "cycl/assertions-low.lisp", position = 15693) 
  public static final SubLObject assertion_flags_tv_code(SubLObject flags) {
    return bytes.ldb($assertion_flags_tv_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 15788) 
  public static final SubLObject set_assertion_flags_tv_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $assertion_flags_tv_byte$.getGlobalValue(), flags);
  }

  /** Return T iff ASSERTION is a GAF according to its internal flag bits. */
  @SubL(source = "cycl/assertions-low.lisp", position = 15897) 
  public static final SubLObject assertion_flags_gaf_p(SubLObject assertion) {
    return Numbers.oddp(assertion_flags(assertion));
  }

  /** Primitively set the gaf flag of ASSERTION
   @owner pace */
  @SubL(source = "cycl/assertions-low.lisp", position = 16331) 
  public static final SubLObject set_assertion_flags_gaf_p(SubLObject assertion, SubLObject gafP) {
    {
      SubLObject gaf_code = number_utilities.encode_boolean(gafP);
      if ((NIL != gaf_code)) {
        reset_assertion_flags(assertion, set_assertion_flags_gaf_code(assertion_flags(assertion), gaf_code));
      }
    }
    return assertion;
  }

  /** When non-NIL, a cache of all the rule assertions in the KB. */
  @SubL(source = "cycl/assertions-low.lisp", position = 16652) 
  private static SubLSymbol $rule_set$ = null;

  /** When non-NIL, the rule-set cache is used to compute GAF vs Rule rather than
   using the bit in the flags. */
  @SubL(source = "cycl/assertions-low.lisp", position = 16801) 
  private static SubLSymbol $prefer_rule_set_over_flagsP$ = null;

  @SubL(source = "cycl/assertions-low.lisp", position = 16975) 
  private static SubLSymbol $estimated_assertions_per_rule$ = null;

  @SubL(source = "cycl/assertions-low.lisp", position = 17051) 
  public static final SubLObject setup_rule_set(SubLObject estimated_assertion_size) {
    checkType(estimated_assertion_size, $sym33$NON_NEGATIVE_INTEGER_P);
    {
      SubLObject estimated_rule_count = Numbers.ceiling(Numbers.divide(estimated_assertion_size, $estimated_assertions_per_rule$.getGlobalValue()), UNPROVIDED);
      $rule_set$.setGlobalValue(keyhash.new_keyhash(estimated_rule_count, Symbols.symbol_function(EQ)));
      return T;
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 17538) 
  public static final SubLObject assertion_gaf_p(SubLObject assertion) {
    if ((NIL != $prefer_rule_set_over_flagsP$.getGlobalValue())) {
      if ((NIL != $rule_set$.getGlobalValue())) {
        return makeBoolean((NIL == keyhash.getkeyhash(assertion, $rule_set$.getGlobalValue())));
      }
    }
    return assertion_flags_gaf_p(assertion);
  }

  /** Primitively set the gaf flag of ASSERTION
   @owner pace */
  @SubL(source = "cycl/assertions-low.lisp", position = 18266) 
  public static final SubLObject set_assertion_gaf_p(SubLObject assertion, SubLObject gafP) {
    if ((NIL != $rule_set$.getGlobalValue())) {
      if ((NIL != gafP)) {
        keyhash.remkeyhash(assertion, $rule_set$.getGlobalValue());
      } else {
        keyhash.setkeyhash(assertion, $rule_set$.getGlobalValue());
      }
    }
    return set_assertion_flags_gaf_p(assertion, gafP);
  }

  /** @return boolean; the recomputed value for the gaf flag of ASSERTION
   @param CNF cnf-p
   @owner pace */
  @SubL(source = "cycl/assertions-low.lisp", position = 19511) 
  public static final SubLObject determine_cnf_gaf_p(SubLObject cnf) {
    checkType(cnf, $sym39$CNF_P);
    return clauses.gaf_cnfP(cnf);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 19822) 
  public static final SubLObject load_rule_set_from_stream(SubLObject stream) {
    $rule_set$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    return keyhash.keyhash_count($rule_set$.getGlobalValue());
  }

  /** Converts a gaf formula to a CNF clause.
   @param gaf el-formula-p
   @return cnf-p */
  @SubL(source = "cycl/assertions-low.lisp", position = 20235) 
  public static final SubLObject gaf_formula_to_cnf(SubLObject gaf) {
    return clause_utilities.make_gaf_cnf(gaf);
  }

  /** Converts a CNF representation of a gaf formula to a gaf formula.
   @param cnf cnf-p
   @return el-formula-p */
  @SubL(source = "cycl/assertions-low.lisp", position = 20469) 
  public static final SubLObject cnf_to_gaf_formula(SubLObject cnf) {
    return clause_utilities.gaf_cnf_literal(cnf);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 20657) 
  public static final SubLObject kb_set_assertion_direction_internal(SubLObject assertion, SubLObject new_direction) {
    if ((NIL != assertions_high.gaf_assertionP(assertion))) {
      reset_assertion_direction(assertion, new_direction);
    } else {
      kb_indexing.remove_assertion_indices(assertion, UNPROVIDED);
      reset_assertion_direction(assertion, new_direction);
      kb_indexing.add_assertion_indices(assertion, UNPROVIDED);
    }
    return assertion;
  }

  /** Primitively change direction of ASSERTION to NEW-DIRECTION. */
  @SubL(source = "cycl/assertions-low.lisp", position = 21035) 
  public static final SubLObject reset_assertion_direction(SubLObject assertion, SubLObject new_direction) {
    checkType(assertion, $sym26$ASSERTION_P);
    {
      SubLObject direction_code = enumeration_types.encode_direction(new_direction);
      if ((NIL != direction_code)) {
        reset_assertion_flags(assertion, set_assertion_flags_direction_code(assertion_flags(assertion), direction_code));
      }
    }
    return assertion;
  }

  /** Primitively change the hl tv of ASSERTION to NEW-TV. */
  @SubL(source = "cycl/assertions-low.lisp", position = 21440) 
  public static final SubLObject reset_assertion_tv(SubLObject assertion, SubLObject new_tv) {
    checkType(assertion, $sym26$ASSERTION_P);
    {
      SubLObject tv_code = enumeration_types.encode_tv(new_tv);
      if ((NIL != tv_code)) {
        reset_assertion_flags(assertion, set_assertion_flags_tv_code(assertion_flags(assertion), tv_code));
      }
    }
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 21812) 
  public static final SubLObject reset_assertion_truth(SubLObject assertion, SubLObject new_truth) {
    {
      SubLObject existing_strength = assertions_high.assertion_strength(assertion);
      SubLObject new_tv = enumeration_types.tv_from_truth_strength(new_truth, existing_strength);
      return reset_assertion_tv(assertion, new_tv);
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 22050) 
  public static final SubLObject reset_assertion_strength(SubLObject assertion, SubLObject new_strength) {
    {
      SubLObject existing_truth = assertions_high.assertion_truth(assertion);
      SubLObject new_tv = enumeration_types.tv_from_truth_strength(existing_truth, new_strength);
      return reset_assertion_tv(assertion, new_tv);
    }
  }

  /** Return the plist for ASSERTION. */
  @SubL(source = "cycl/assertions-low.lisp", position = 22288) 
  public static final SubLObject assertion_plist(SubLObject assertion) {
    return lookup_assertion_plist(assertion_handles.assertion_id(assertion));
  }

  /** Primitively set the plist of ASSERTION to PLIST. */
  @SubL(source = "cycl/assertions-low.lisp", position = 22528) 
  public static final SubLObject reset_assertion_plist(SubLObject assertion, SubLObject plist) {
    checkType(assertion, $sym26$ASSERTION_P);
    checkType(plist, $sym41$LISTP);
    set_assertion_plist(assertion_handles.assertion_id(assertion), plist);
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 22776) 
  public static final SubLObject get_assertion_prop(SubLObject assertion, SubLObject indicator, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    return conses_high.getf(assertion_plist(assertion), indicator, v_default);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 22914) 
  public static final SubLObject set_assertion_prop(SubLObject assertion, SubLObject indicator, SubLObject value) {
    {
      SubLObject old_plist = assertion_plist(assertion);
      SubLObject new_plist = conses_high.putf(old_plist, indicator, value);
      reset_assertion_plist(assertion, new_plist);
    }
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 23143) 
  public static final SubLObject rem_assertion_prop(SubLObject assertion, SubLObject indicator) {
    {
      SubLObject old_plist = assertion_plist(assertion);
      SubLObject new_plist = conses_high.remf(old_plist, indicator);
      reset_assertion_plist(assertion, new_plist);
    }
    return assertion;
  }

  /** Primitively change the variable names for ASSERTION to NEW-VARIABLE-NAMES. */
  @SubL(source = "cycl/assertions-low.lisp", position = 23360) 
  public static final SubLObject reset_assertion_variable_names(SubLObject assertion, SubLObject new_variable_names) {
    checkType(assertion, $sym26$ASSERTION_P);
    {
      SubLObject list_var = new_variable_names;
      checkType(list_var, $sym42$NON_DOTTED_LIST_P);
      {
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          checkType(elem, $sym37$STRINGP);
        }
      }
    }
    if ((NIL != new_variable_names)) {
      set_assertion_prop(assertion, $kw27$VARIABLE_NAMES, new_variable_names);
    } else {
      rem_assertion_prop(assertion, $kw27$VARIABLE_NAMES);
    }
    return assertion;
  }

  /** Return the indexing structure for ASSERTION. */
  @SubL(source = "cycl/assertions-low.lisp", position = 23797) 
  public static final SubLObject assertion_index(SubLObject assertion) {
    return kb_indexing_datastructures.assertion_indexing_store_get(assertion);
  }

  /** Primitively change the indexing structure for ASSERTION to NEW-INDEX. */
  @SubL(source = "cycl/assertions-low.lisp", position = 23955) 
  public static final SubLObject reset_assertion_index(SubLObject assertion, SubLObject new_index) {
    checkType(assertion, $sym26$ASSERTION_P);
    if ((new_index == kb_indexing_datastructures.new_simple_index())) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31913");
    } else {
      kb_indexing_datastructures.assertion_indexing_store_set(assertion, new_index);
    }
    return assertion;
  }

  /** Return the assert timestamping info for ASSERTION. */
  @SubL(source = "cycl/assertions-low.lisp", position = 24674) 
  public static final SubLObject assertion_assert_info(SubLObject assertion) {
    {
      SubLObject assert_info = get_assertion_prop(assertion, $kw46$ASSERT_INFO, UNPROVIDED);
      if ((NIL != assert_info)) {
        return assert_info;
      }
    }
    return NIL;
  }

  /** Primitively change the assert timestamping info for ASSERTION to NEW-INFO. */
  @SubL(source = "cycl/assertions-low.lisp", position = 24900) 
  public static final SubLObject reset_assertion_assert_info(SubLObject assertion, SubLObject new_info) {
    checkType(assertion, $sym26$ASSERTION_P);
    if ((NIL != new_info)) {
      set_assertion_prop(assertion, $kw46$ASSERT_INFO, new_info);
    } else {
      rem_assertion_prop(assertion, $kw46$ASSERT_INFO);
    }
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 25231) 
  public static final SubLObject asserted_assertion_timestampedP(SubLObject assertion) {
    checkType(assertion, $sym26$ASSERTION_P);
    if ((NIL != assertions_high.asserted_assertionP(assertion))) {
      return list_utilities.sublisp_boolean(assertion_assert_info(assertion));
    }
    return NIL;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 25427) 
  public static final SubLObject make_assert_info(SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
    if ((who == UNPROVIDED)) {
      who = NIL;
    }
    if ((when == UNPROVIDED)) {
      when = NIL;
    }
    if ((why == UNPROVIDED)) {
      why = NIL;
    }
    if ((second == UNPROVIDED)) {
      second = NIL;
    }
    if ((NIL != second)) {
      return list(who, when, why, second);
    }
    if ((NIL != why)) {
      return list(who, when, why);
    }
    if ((NIL != when)) {
      return list(who, when);
    }
    if ((NIL != who)) {
      return list(who);
    }
    return NIL;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 25690) 
  public static final SubLObject assert_info_who(SubLObject assert_info) {
    return assert_info.first();
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 25796) 
  public static final SubLObject assert_info_when(SubLObject assert_info) {
    return conses_high.second(assert_info);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 25904) 
  public static final SubLObject assert_info_why(SubLObject assert_info) {
    return conses_high.third(assert_info);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 26010) 
  public static final SubLObject assert_info_second(SubLObject assert_info) {
    return conses_high.fourth(assert_info);
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 26120) 
  public static final SubLObject set_assertion_asserted_by(SubLObject assertion, SubLObject assertor) {
    {
      SubLObject datum = assertion_assert_info(assertion);
      SubLObject current = datum;
      SubLObject who = (current.isCons() ? ((SubLObject) current.first()) : NIL);
      cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
      current = current.rest();
      {
        SubLObject when = (current.isCons() ? ((SubLObject) current.first()) : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
        current = current.rest();
        {
          SubLObject why = (current.isCons() ? ((SubLObject) current.first()) : NIL);
          cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
          current = current.rest();
          {
            SubLObject second = (current.isCons() ? ((SubLObject) current.first()) : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
            current = current.rest();
            if ((NIL == current)) {
              who = assertor;
              return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, second));
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 26388) 
  public static final SubLObject set_assertion_asserted_when(SubLObject assertion, SubLObject universal_date) {
    {
      SubLObject datum = assertion_assert_info(assertion);
      SubLObject current = datum;
      SubLObject who = (current.isCons() ? ((SubLObject) current.first()) : NIL);
      cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
      current = current.rest();
      {
        SubLObject when = (current.isCons() ? ((SubLObject) current.first()) : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
        current = current.rest();
        {
          SubLObject why = (current.isCons() ? ((SubLObject) current.first()) : NIL);
          cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
          current = current.rest();
          {
            SubLObject second = (current.isCons() ? ((SubLObject) current.first()) : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
            current = current.rest();
            if ((NIL == current)) {
              when = universal_date;
              return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, second));
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 26671) 
  public static final SubLObject set_assertion_asserted_why(SubLObject assertion, SubLObject reason) {
    {
      SubLObject datum = assertion_assert_info(assertion);
      SubLObject current = datum;
      SubLObject who = (current.isCons() ? ((SubLObject) current.first()) : NIL);
      cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
      current = current.rest();
      {
        SubLObject when = (current.isCons() ? ((SubLObject) current.first()) : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
        current = current.rest();
        {
          SubLObject why = (current.isCons() ? ((SubLObject) current.first()) : NIL);
          cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
          current = current.rest();
          {
            SubLObject second = (current.isCons() ? ((SubLObject) current.first()) : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
            current = current.rest();
            if ((NIL == current)) {
              why = reason;
              return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, second));
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 26936) 
  public static final SubLObject set_assertion_asserted_second(SubLObject assertion, SubLObject universal_second) {
    {
      SubLObject datum = assertion_assert_info(assertion);
      SubLObject current = datum;
      SubLObject who = (current.isCons() ? ((SubLObject) current.first()) : NIL);
      cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
      current = current.rest();
      {
        SubLObject when = (current.isCons() ? ((SubLObject) current.first()) : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
        current = current.rest();
        {
          SubLObject why = (current.isCons() ? ((SubLObject) current.first()) : NIL);
          cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
          current = current.rest();
          {
            SubLObject second = (current.isCons() ? ((SubLObject) current.first()) : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list47);
            current = current.rest();
            if ((NIL == current)) {
              second = universal_second;
              return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, second));
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Does ASSERTION have content? */
  @SubL(source = "cycl/assertions-low.lisp", position = 28007) 
  public static final SubLObject valid_assertion_with_contentP(SubLObject assertion) {
    {
      SubLObject id = assertion_handles.assertion_id(assertion);
      SubLObject content = NIL;
      SubLObject ignore_errors_tag = NIL;
      try {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
          try {
            Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym50$IGNORE_ERRORS_HANDLER));
            try {
              content = assertion_manager.lookup_assertion_content(id);
            } catch (Throwable catch_var) {
              Errors.handleThrowable(catch_var, NIL);
            }
          } finally {
            Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
          }
        }
      } catch (Throwable ccatch_env_var) {
        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw49$IGNORE_ERRORS_TARGET);
      }
      return list_utilities.sublisp_boolean(content);
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 28253) 
  public static final SubLObject kb_create_assertion_kb_store(SubLObject cnf, SubLObject mt) {
    {
      SubLObject assertion = kb_indexing.find_assertion_internal(cnf, mt);
      if ((NIL != assertion)) {
        return assertion_handles.assertion_id(assertion);
      } else {
        {
          SubLObject internal_id = assertion_handles.make_assertion_id();
          assertion = assertion_handles.make_assertion_shell(internal_id);
          kb_create_assertion_int(assertion, internal_id, cnf, mt);
          return internal_id;
        }
      }
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 28946) 
  public static final SubLObject kb_create_assertion_int(SubLObject assertion, SubLObject internal_id, SubLObject cnf, SubLObject mt) {
    {
      SubLObject assertion_content = create_assertion_content(mt);
      assertion_manager.register_assertion_content(internal_id, assertion_content);
      reset_assertion_tv(assertion, $kw51$UNKNOWN);
      {
        SubLObject formula_data_hook = find_cnf_formula_data_hook(cnf);
        connect_assertion(assertion, formula_data_hook);
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 29592) 
  public static final SubLObject find_cnf_formula_data_hook(SubLObject cnf) {
    if ((NIL != clauses.gaf_cnfP(cnf))) {
      return find_gaf_formula_hook(clause_utilities.gaf_cnf_literal(cnf));
    } else {
      return find_hl_cnf_hook(cnf);
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 29761) 
  public static final SubLObject find_hl_cnf_hook(SubLObject cnf) {
    {
      SubLObject assertion = kb_indexing.find_assertion_any_mt(cnf);
      if ((NIL != assertion)) {
        {
          SubLObject clause_struc = assertion_clause_struc(assertion);
          return ((NIL != clause_struc) ? ((SubLObject) clause_struc) : assertion);
        }
      } else {
        return cnf;
      }
    }
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 30016) 
  public static final SubLObject find_gaf_formula_hook(SubLObject gaf) {
    {
      SubLObject assertion = kb_indexing.find_gaf_any_mt(gaf);
      if ((NIL != assertion)) {
        {
          SubLObject clause_struc = assertion_clause_struc(assertion);
          return ((NIL != clause_struc) ? ((SubLObject) clause_struc) : assertion);
        }
      } else {
        return gaf;
      }
    }
  }

  /** Connect ASSERTION to FORMULA-DATA-HOOK and all its relevant indexes */
  @SubL(source = "cycl/assertions-low.lisp", position = 30266) 
  public static final SubLObject connect_assertion(SubLObject assertion, SubLObject formula_data_hook) {
    connect_assertion_formula_data(assertion, formula_data_hook);
    kb_indexing.add_assertion_indices(assertion, UNPROVIDED);
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 30521) 
  public static final SubLObject connect_assertion_formula_data(SubLObject assertion, SubLObject formula_data_hook) {
    {
      SubLObject formula_data = formula_data_hook;
      if ((NIL != clause_strucs.clause_struc_p(formula_data_hook))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11315");
      } else if ((NIL != assertion_handles.assertion_p(formula_data_hook))) {
        {
          SubLObject cnf = assertions_high.assertion_cnf(formula_data_hook);
          SubLObject new_clause_struc = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11343");
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11316");
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11317");
          formula_data = new_clause_struc;
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32001");
        }
      } else if ((NIL != clauses.cnf_p(formula_data_hook))) {
      } else if ((NIL != el_utilities.el_formula_p(formula_data_hook))) {
      } else {
        Errors.error($str52$Unexpected_formula_data_hook___S, formula_data_hook);
        return NIL;
      }
      update_assertion_formula_data(assertion, formula_data);
    }
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 31768) 
  public static final SubLObject kb_remove_assertion_internal(SubLObject assertion) {
    {
      SubLObject id = assertion_handles.assertion_id(assertion);
      disconnect_assertion(assertion);
      destroy_assertion_content(id);
      assertion_handles.deregister_assertion_id(id);
    }
    assertion_handles.free_assertion(assertion);
    return NIL;
  }

  /** Disconnect ASSERTION from all its connections. */
  @SubL(source = "cycl/assertions-low.lisp", position = 32418) 
  public static final SubLObject disconnect_assertion(SubLObject assertion) {
    kb_indexing.remove_assertion_indices(assertion, UNPROVIDED);
    disconnect_assertion_formula_data(assertion);
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 32677) 
  public static final SubLObject disconnect_assertion_formula_data(SubLObject assertion) {
    {
      SubLObject clause_struc = assertion_clause_struc(assertion);
      if ((NIL != clause_struc)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11355");
      }
    }
    annihilate_assertion_formula_data(assertion);
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 32954) 
  public static final SubLObject add_new_assertion_argument(SubLObject assertion, SubLObject new_argument) {
    set_assertion_arguments(assertion_handles.assertion_id(assertion), cons(new_argument, assertions_high.assertion_arguments(assertion)));
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 33422) 
  public static final SubLObject remove_assertion_argument(SubLObject assertion, SubLObject argument) {
    set_assertion_arguments(assertion_handles.assertion_id(assertion), list_utilities.delete_first(argument, assertions_high.assertion_arguments(assertion), UNPROVIDED));
    return assertion;
  }

  /** Primitively set the dependent arguments of ASSERTION to NEW-DEPENDENTS. */
  @SubL(source = "cycl/assertions-low.lisp", position = 33622) 
  public static final SubLObject reset_assertion_dependents(SubLObject assertion, SubLObject new_dependents) {
    checkType(new_dependents, $sym41$LISTP);
    if ((NIL != new_dependents)) {
      set_assertion_prop(assertion, $kw28$DEPENDENTS, new_dependents);
    } else {
      rem_assertion_prop(assertion, $kw28$DEPENDENTS);
    }
    return assertion;
  }

  /** Add ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION. */
  @SubL(source = "cycl/assertions-low.lisp", position = 34109) 
  public static final SubLObject add_assertion_dependent(SubLObject assertion, SubLObject argument) {
    checkType(assertion, $sym26$ASSERTION_P);
    checkType(argument, $sym53$ARGUMENT_P);
    reset_assertion_dependents(assertion, cons(argument, assertions_high.assertion_dependents(assertion)));
    return assertion;
  }

  /** Remove ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION. */
  @SubL(source = "cycl/assertions-low.lisp", position = 34462) 
  public static final SubLObject remove_assertion_dependent(SubLObject assertion, SubLObject argument) {
    checkType(assertion, $sym26$ASSERTION_P);
    checkType(argument, $sym53$ARGUMENT_P);
    reset_assertion_dependents(assertion, list_utilities.delete_first(argument, assertions_high.assertion_dependents(assertion), UNPROVIDED));
    return assertion;
  }

  @SubL(source = "cycl/assertions-low.lisp", position = 34829) 
  private static SubLSymbol $dependent_deduction_table$ = null;

  @SubL(source = "cycl/assertions-low.lisp", position = 34914) 
  private static SubLSymbol $dependent_assertion_table$ = null;

  public static final SubLObject declare_assertions_low_file() {
    declareFunction(myName, "assertion_content_print_function_trampoline", "ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "assertion_content_p", "ASSERTION-CONTENT-P", 1, 0, false); new $assertion_content_p$UnaryFunction();
    declareFunction(myName, "as_content_formula_data", "AS-CONTENT-FORMULA-DATA", 1, 0, false);
    declareFunction(myName, "as_content_mt", "AS-CONTENT-MT", 1, 0, false);
    declareFunction(myName, "as_content_flags", "AS-CONTENT-FLAGS", 1, 0, false);
    declareFunction(myName, "as_content_arguments", "AS-CONTENT-ARGUMENTS", 1, 0, false);
    declareFunction(myName, "as_content_plist", "AS-CONTENT-PLIST", 1, 0, false);
    declareFunction(myName, "_csetf_as_content_formula_data", "_CSETF-AS-CONTENT-FORMULA-DATA", 2, 0, false);
    declareFunction(myName, "_csetf_as_content_mt", "_CSETF-AS-CONTENT-MT", 2, 0, false);
    declareFunction(myName, "_csetf_as_content_flags", "_CSETF-AS-CONTENT-FLAGS", 2, 0, false);
    declareFunction(myName, "_csetf_as_content_arguments", "_CSETF-AS-CONTENT-ARGUMENTS", 2, 0, false);
    declareFunction(myName, "_csetf_as_content_plist", "_CSETF-AS-CONTENT-PLIST", 2, 0, false);
    declareFunction(myName, "make_assertion_content", "MAKE-ASSERTION-CONTENT", 0, 1, false);
    declareFunction(myName, "create_assertion_content", "CREATE-ASSERTION-CONTENT", 1, 0, false);
    declareFunction(myName, "destroy_assertion_content", "DESTROY-ASSERTION-CONTENT", 1, 0, false);
    declareFunction(myName, "lookup_assertion_formula_data", "LOOKUP-ASSERTION-FORMULA-DATA", 1, 0, false);
    declareFunction(myName, "lookup_assertion_mt", "LOOKUP-ASSERTION-MT", 1, 0, false);
    declareFunction(myName, "lookup_assertion_flags", "LOOKUP-ASSERTION-FLAGS", 1, 0, false);
    declareFunction(myName, "lookup_assertion_arguments", "LOOKUP-ASSERTION-ARGUMENTS", 1, 0, false);
    declareFunction(myName, "lookup_assertion_plist", "LOOKUP-ASSERTION-PLIST", 1, 0, false);
    declareFunction(myName, "set_assertion_formula_data", "SET-ASSERTION-FORMULA-DATA", 2, 0, false);
    declareFunction(myName, "set_assertion_flags", "SET-ASSERTION-FLAGS", 2, 0, false);
    declareFunction(myName, "set_assertion_arguments", "SET-ASSERTION-ARGUMENTS", 2, 0, false);
    declareFunction(myName, "set_assertion_plist", "SET-ASSERTION-PLIST", 2, 0, false);
    declareFunction(myName, "dump_assertion_content", "DUMP-ASSERTION-CONTENT", 2, 0, false);
    declareFunction(myName, "bundle_assertion_content_for_dumping", "BUNDLE-ASSERTION-CONTENT-FOR-DUMPING", 1, 0, false);
    declareFunction(myName, "bundle_assertion_content", "BUNDLE-ASSERTION-CONTENT", 5, 0, false);
    declareFunction(myName, "dump_assertion_content_to_fht", "DUMP-ASSERTION-CONTENT-TO-FHT", 2, 1, false);
    declareFunction(myName, "dump_assertion_content_bundle_to_fht", "DUMP-ASSERTION-CONTENT-BUNDLE-TO-FHT", 3, 0, false);
    declareFunction(myName, "load_assertion_content", "LOAD-ASSERTION-CONTENT", 2, 0, false);
    declareFunction(myName, "load_assertion_content_as_bundle", "LOAD-ASSERTION-CONTENT-AS-BUNDLE", 2, 0, false);
    declareFunction(myName, "load_assertion_content_from_fht", "LOAD-ASSERTION-CONTENT-FROM-FHT", 2, 0, false);
    declareFunction(myName, "load_assertion_content_int", "LOAD-ASSERTION-CONTENT-INT", 6, 0, false);
    declareFunction(myName, "assertion_cnf_internal", "ASSERTION-CNF-INTERNAL", 1, 0, false);
    declareFunction(myName, "possibly_assertion_cnf_internal", "POSSIBLY-ASSERTION-CNF-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_mt_internal", "ASSERTION-MT-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_gaf_hl_formula_internal", "ASSERTION-GAF-HL-FORMULA-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_cons_internal", "ASSERTION-CONS-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_direction_internal", "ASSERTION-DIRECTION-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_truth_internal", "ASSERTION-TRUTH-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_strength_internal", "ASSERTION-STRENGTH-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_tv", "ASSERTION-TV", 1, 0, false);
    declareFunction(myName, "assertion_variable_names_internal", "ASSERTION-VARIABLE-NAMES-INTERNAL", 1, 0, false);
    declareFunction(myName, "asserted_by_internal", "ASSERTED-BY-INTERNAL", 1, 0, false);
    declareFunction(myName, "asserted_when_internal", "ASSERTED-WHEN-INTERNAL", 1, 0, false);
    declareFunction(myName, "asserted_why_internal", "ASSERTED-WHY-INTERNAL", 1, 0, false);
    declareFunction(myName, "asserted_second_internal", "ASSERTED-SECOND-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_arguments_internal", "ASSERTION-ARGUMENTS-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_dependents_internal", "ASSERTION-DEPENDENTS-INTERNAL", 1, 0, false);
    declareFunction(myName, "assertion_formula_data", "ASSERTION-FORMULA-DATA", 1, 0, false);
    declareFunction(myName, "reset_assertion_formula_data", "RESET-ASSERTION-FORMULA-DATA", 2, 0, false);
    declareFunction(myName, "assertion_hl_cnf", "ASSERTION-HL-CNF", 1, 0, false);
    declareFunction(myName, "update_assertion_formula_data", "UPDATE-ASSERTION-FORMULA-DATA", 2, 0, false);
    declareFunction(myName, "assertion_clause_struc", "ASSERTION-CLAUSE-STRUC", 1, 0, false);
    declareFunction(myName, "reset_assertion_cnf", "RESET-ASSERTION-CNF", 2, 0, false);
    declareFunction(myName, "reset_assertion_clause_struc", "RESET-ASSERTION-CLAUSE-STRUC", 2, 0, false);
    declareFunction(myName, "reset_assertion_gaf_formula", "RESET-ASSERTION-GAF-FORMULA", 2, 0, false);
    declareFunction(myName, "annihilate_assertion_formula_data", "ANNIHILATE-ASSERTION-FORMULA-DATA", 1, 0, false);
    declareFunction(myName, "assertion_flags", "ASSERTION-FLAGS", 1, 0, false);
    declareFunction(myName, "reset_assertion_flags", "RESET-ASSERTION-FLAGS", 2, 0, false);
    declareFunction(myName, "assertion_flags_gaf_code", "ASSERTION-FLAGS-GAF-CODE", 1, 0, false);
    declareFunction(myName, "set_assertion_flags_gaf_code", "SET-ASSERTION-FLAGS-GAF-CODE", 2, 0, false);
    declareFunction(myName, "assertion_flags_direction_code", "ASSERTION-FLAGS-DIRECTION-CODE", 1, 0, false);
    declareFunction(myName, "set_assertion_flags_direction_code", "SET-ASSERTION-FLAGS-DIRECTION-CODE", 2, 0, false);
    declareFunction(myName, "assertion_flags_tv_code", "ASSERTION-FLAGS-TV-CODE", 1, 0, false);
    declareFunction(myName, "set_assertion_flags_tv_code", "SET-ASSERTION-FLAGS-TV-CODE", 2, 0, false);
    declareFunction(myName, "assertion_flags_gaf_p", "ASSERTION-FLAGS-GAF-P", 1, 0, false);
    declareFunction(myName, "set_assertion_flags_gaf_p", "SET-ASSERTION-FLAGS-GAF-P", 2, 0, false);
    declareFunction(myName, "setup_rule_set", "SETUP-RULE-SET", 1, 0, false);
    declareFunction(myName, "kb_rule_set", "KB-RULE-SET", 0, 0, false);
    declareFunction(myName, "assertion_gaf_p", "ASSERTION-GAF-P", 1, 0, false);
    declareFunction(myName, "assertion_rule_p", "ASSERTION-RULE-P", 1, 0, false);
    declareFunction(myName, "rule_count", "RULE-COUNT", 0, 0, false);
    declareFunction(myName, "gaf_count", "GAF-COUNT", 0, 0, false);
    declareFunction(myName, "set_assertion_gaf_p", "SET-ASSERTION-GAF-P", 2, 0, false);
    declareFunction(myName, "possibly_rule_set_delete", "POSSIBLY-RULE-SET-DELETE", 1, 0, false);
    declareFunction(myName, "recompute_assertion_gaf_p", "RECOMPUTE-ASSERTION-GAF-P", 1, 0, false);
    declareFunction(myName, "determine_cnf_gaf_p", "DETERMINE-CNF-GAF-P", 1, 0, false);
    declareFunction(myName, "dump_rule_set_to_stream", "DUMP-RULE-SET-TO-STREAM", 1, 0, false);
    declareFunction(myName, "load_rule_set_from_stream", "LOAD-RULE-SET-FROM-STREAM", 1, 0, false);
    declareFunction(myName, "rebuild_rule_set", "REBUILD-RULE-SET", 0, 0, false);
    declareFunction(myName, "gaf_formula_to_cnf", "GAF-FORMULA-TO-CNF", 1, 0, false);
    declareFunction(myName, "cnf_to_gaf_formula", "CNF-TO-GAF-FORMULA", 1, 0, false);
    declareFunction(myName, "kb_set_assertion_direction_internal", "KB-SET-ASSERTION-DIRECTION-INTERNAL", 2, 0, false);
    declareFunction(myName, "reset_assertion_direction", "RESET-ASSERTION-DIRECTION", 2, 0, false);
    declareFunction(myName, "reset_assertion_tv", "RESET-ASSERTION-TV", 2, 0, false);
    declareFunction(myName, "reset_assertion_truth", "RESET-ASSERTION-TRUTH", 2, 0, false);
    declareFunction(myName, "reset_assertion_strength", "RESET-ASSERTION-STRENGTH", 2, 0, false);
    declareFunction(myName, "assertion_plist", "ASSERTION-PLIST", 1, 0, false);
    declareFunction(myName, "reset_assertion_plist", "RESET-ASSERTION-PLIST", 2, 0, false);
    declareFunction(myName, "get_assertion_prop", "GET-ASSERTION-PROP", 2, 1, false);
    declareFunction(myName, "set_assertion_prop", "SET-ASSERTION-PROP", 3, 0, false);
    declareFunction(myName, "rem_assertion_prop", "REM-ASSERTION-PROP", 2, 0, false);
    declareFunction(myName, "reset_assertion_variable_names", "RESET-ASSERTION-VARIABLE-NAMES", 2, 0, false);
    declareFunction(myName, "assertion_index", "ASSERTION-INDEX", 1, 0, false);
    declareFunction(myName, "reset_assertion_index", "RESET-ASSERTION-INDEX", 2, 0, false);
    declareFunction(myName, "clear_assertion_index", "CLEAR-ASSERTION-INDEX", 1, 0, false);
    declareMacro(myName, "destructure_assert_info", "DESTRUCTURE-ASSERT-INFO");
    declareFunction(myName, "assertion_assert_info", "ASSERTION-ASSERT-INFO", 1, 0, false);
    declareFunction(myName, "reset_assertion_assert_info", "RESET-ASSERTION-ASSERT-INFO", 2, 0, false);
    declareFunction(myName, "asserted_assertion_timestampedP", "ASSERTED-ASSERTION-TIMESTAMPED?", 1, 0, false);
    declareFunction(myName, "make_assert_info", "MAKE-ASSERT-INFO", 0, 4, false);
    declareFunction(myName, "assert_info_who", "ASSERT-INFO-WHO", 1, 0, false);
    declareFunction(myName, "assert_info_when", "ASSERT-INFO-WHEN", 1, 0, false);
    declareFunction(myName, "assert_info_why", "ASSERT-INFO-WHY", 1, 0, false);
    declareFunction(myName, "assert_info_second", "ASSERT-INFO-SECOND", 1, 0, false);
    declareFunction(myName, "set_assertion_asserted_by", "SET-ASSERTION-ASSERTED-BY", 2, 0, false);
    declareFunction(myName, "set_assertion_asserted_when", "SET-ASSERTION-ASSERTED-WHEN", 2, 0, false);
    declareFunction(myName, "set_assertion_asserted_why", "SET-ASSERTION-ASSERTED-WHY", 2, 0, false);
    declareFunction(myName, "set_assertion_asserted_second", "SET-ASSERTION-ASSERTED-SECOND", 2, 0, false);
    declareFunction(myName, "valid_assertion_robustP", "VALID-ASSERTION-ROBUST?", 1, 0, false);
    declareFunction(myName, "valid_assertion_with_contentP", "VALID-ASSERTION-WITH-CONTENT?", 1, 0, false);
    declareFunction(myName, "kb_create_assertion_kb_store", "KB-CREATE-ASSERTION-KB-STORE", 2, 0, false);
    declareFunction(myName, "kb_create_assertion_int", "KB-CREATE-ASSERTION-INT", 4, 0, false);
    declareFunction(myName, "kb_create_assertion_cyc", "KB-CREATE-ASSERTION-CYC", 1, 0, false);
    declareFunction(myName, "find_cnf_formula_data_hook", "FIND-CNF-FORMULA-DATA-HOOK", 1, 0, false);
    declareFunction(myName, "find_hl_cnf_hook", "FIND-HL-CNF-HOOK", 1, 0, false);
    declareFunction(myName, "find_gaf_formula_hook", "FIND-GAF-FORMULA-HOOK", 1, 0, false);
    declareFunction(myName, "connect_assertion", "CONNECT-ASSERTION", 2, 0, false);
    declareFunction(myName, "connect_assertion_formula_data", "CONNECT-ASSERTION-FORMULA-DATA", 2, 0, false);
    declareFunction(myName, "kb_remove_assertion_internal", "KB-REMOVE-ASSERTION-INTERNAL", 1, 0, false);
    declareFunction(myName, "reconnect_assertion", "RECONNECT-ASSERTION", 2, 0, false);
    declareFunction(myName, "disconnect_assertion", "DISCONNECT-ASSERTION", 1, 0, false);
    declareFunction(myName, "disconnect_assertion_formula_data", "DISCONNECT-ASSERTION-FORMULA-DATA", 1, 0, false);
    declareFunction(myName, "add_new_assertion_argument", "ADD-NEW-ASSERTION-ARGUMENT", 2, 0, false);
    declareFunction(myName, "remove_assertion_argument", "REMOVE-ASSERTION-ARGUMENT", 2, 0, false);
    declareFunction(myName, "reset_assertion_dependents", "RESET-ASSERTION-DEPENDENTS", 2, 0, false);
    declareFunction(myName, "add_assertion_dependent", "ADD-ASSERTION-DEPENDENT", 2, 0, false);
    declareFunction(myName, "remove_assertion_dependent", "REMOVE-ASSERTION-DEPENDENT", 2, 0, false);
    declareFunction(myName, "assertion_dependencies", "ASSERTION-DEPENDENCIES", 1, 0, false);
    declareFunction(myName, "mark_dependent_assertion", "MARK-DEPENDENT-ASSERTION", 1, 0, false);
    declareFunction(myName, "mark_dependent_deduction", "MARK-DEPENDENT-DEDUCTION", 1, 0, false);
    declareFunction(myName, "verify_assertion_content_table", "VERIFY-ASSERTION-CONTENT-TABLE", 0, 1, false);
    return NIL;
  }

  public static final SubLObject init_assertions_low_file() {
    $dtp_assertion_content$ = defconstant("*DTP-ASSERTION-CONTENT*", $sym0$ASSERTION_CONTENT);
    $default_assertion_flags$ = deflexical("*DEFAULT-ASSERTION-FLAGS*", ZERO_INTEGER);
    $assertion_flags_gaf_byte$ = defconstant("*ASSERTION-FLAGS-GAF-BYTE*", bytes.sublisp_byte(ONE_INTEGER, ZERO_INTEGER));
    $assertion_flags_direction_byte$ = defconstant("*ASSERTION-FLAGS-DIRECTION-BYTE*", bytes.sublisp_byte(TWO_INTEGER, ONE_INTEGER));
    $assertion_flags_tv_byte$ = defconstant("*ASSERTION-FLAGS-TV-BYTE*", bytes.sublisp_byte(THREE_INTEGER, THREE_INTEGER));
    $rule_set$ = deflexical("*RULE-SET*", maybeDefault( $sym30$_RULE_SET_, $rule_set$, NIL));
    $prefer_rule_set_over_flagsP$ = deflexical("*PREFER-RULE-SET-OVER-FLAGS?*", maybeDefault( $sym31$_PREFER_RULE_SET_OVER_FLAGS__, $prefer_rule_set_over_flagsP$, NIL));
    $estimated_assertions_per_rule$ = deflexical("*ESTIMATED-ASSERTIONS-PER-RULE*", $int32$60);
    $dependent_deduction_table$ = defparameter("*DEPENDENT-DEDUCTION-TABLE*", NIL);
    $dependent_assertion_table$ = defparameter("*DEPENDENT-ASSERTION-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_assertions_low_file() {
    // CVS_ID("Id: assertions-low.lisp 128721 2009-09-08 22:22:50Z goolsbey ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_assertion_content$.getGlobalValue(), Symbols.symbol_function($sym8$ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$AS_CONTENT_FORMULA_DATA, $sym10$_CSETF_AS_CONTENT_FORMULA_DATA);
    Structures.def_csetf($sym11$AS_CONTENT_MT, $sym12$_CSETF_AS_CONTENT_MT);
    Structures.def_csetf($sym13$AS_CONTENT_FLAGS, $sym14$_CSETF_AS_CONTENT_FLAGS);
    Structures.def_csetf($sym15$AS_CONTENT_ARGUMENTS, $sym16$_CSETF_AS_CONTENT_ARGUMENTS);
    Structures.def_csetf($sym17$AS_CONTENT_PLIST, $sym18$_CSETF_AS_CONTENT_PLIST);
    Equality.identity($sym0$ASSERTION_CONTENT);
    subl_macro_promotions.declare_defglobal($sym30$_RULE_SET_);
    subl_macro_promotions.declare_defglobal($sym31$_PREFER_RULE_SET_OVER_FLAGS__);
    access_macros.register_macro_helper($sym34$KB_RULE_SET, $sym35$DO_RULES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ASSERTION_CONTENT = makeSymbol("ASSERTION-CONTENT");
  public static final SubLSymbol $sym1$ASSERTION_CONTENT_P = makeSymbol("ASSERTION-CONTENT-P");
  public static final SubLInteger $int2$148 = makeInteger(148);
  public static final SubLList $list3 = list(makeSymbol("FORMULA-DATA"), makeSymbol("MT"), makeSymbol("FLAGS"), makeSymbol("ARGUMENTS"), makeSymbol("PLIST"));
  public static final SubLList $list4 = list(makeKeyword("FORMULA-DATA"), makeKeyword("MT"), makeKeyword("FLAGS"), makeKeyword("ARGUMENTS"), makeKeyword("PLIST"));
  public static final SubLList $list5 = list(makeSymbol("AS-CONTENT-FORMULA-DATA"), makeSymbol("AS-CONTENT-MT"), makeSymbol("AS-CONTENT-FLAGS"), makeSymbol("AS-CONTENT-ARGUMENTS"), makeSymbol("AS-CONTENT-PLIST"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-AS-CONTENT-FORMULA-DATA"), makeSymbol("_CSETF-AS-CONTENT-MT"), makeSymbol("_CSETF-AS-CONTENT-FLAGS"), makeSymbol("_CSETF-AS-CONTENT-ARGUMENTS"), makeSymbol("_CSETF-AS-CONTENT-PLIST"));
  public static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym8$ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$AS_CONTENT_FORMULA_DATA = makeSymbol("AS-CONTENT-FORMULA-DATA");
  public static final SubLSymbol $sym10$_CSETF_AS_CONTENT_FORMULA_DATA = makeSymbol("_CSETF-AS-CONTENT-FORMULA-DATA");
  public static final SubLSymbol $sym11$AS_CONTENT_MT = makeSymbol("AS-CONTENT-MT");
  public static final SubLSymbol $sym12$_CSETF_AS_CONTENT_MT = makeSymbol("_CSETF-AS-CONTENT-MT");
  public static final SubLSymbol $sym13$AS_CONTENT_FLAGS = makeSymbol("AS-CONTENT-FLAGS");
  public static final SubLSymbol $sym14$_CSETF_AS_CONTENT_FLAGS = makeSymbol("_CSETF-AS-CONTENT-FLAGS");
  public static final SubLSymbol $sym15$AS_CONTENT_ARGUMENTS = makeSymbol("AS-CONTENT-ARGUMENTS");
  public static final SubLSymbol $sym16$_CSETF_AS_CONTENT_ARGUMENTS = makeSymbol("_CSETF-AS-CONTENT-ARGUMENTS");
  public static final SubLSymbol $sym17$AS_CONTENT_PLIST = makeSymbol("AS-CONTENT-PLIST");
  public static final SubLSymbol $sym18$_CSETF_AS_CONTENT_PLIST = makeSymbol("_CSETF-AS-CONTENT-PLIST");
  public static final SubLSymbol $kw19$FORMULA_DATA = makeKeyword("FORMULA-DATA");
  public static final SubLSymbol $kw20$MT = makeKeyword("MT");
  public static final SubLSymbol $kw21$FLAGS = makeKeyword("FLAGS");
  public static final SubLSymbol $kw22$ARGUMENTS = makeKeyword("ARGUMENTS");
  public static final SubLSymbol $kw23$PLIST = makeKeyword("PLIST");
  public static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw25$NOT_FOUND = makeKeyword("NOT-FOUND");
  public static final SubLSymbol $sym26$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $kw27$VARIABLE_NAMES = makeKeyword("VARIABLE-NAMES");
  public static final SubLSymbol $kw28$DEPENDENTS = makeKeyword("DEPENDENTS");
  public static final SubLString $str29$Unexpected_formula_data_type___S = makeString("Unexpected formula-data type: ~S");
  public static final SubLSymbol $sym30$_RULE_SET_ = makeSymbol("*RULE-SET*");
  public static final SubLSymbol $sym31$_PREFER_RULE_SET_OVER_FLAGS__ = makeSymbol("*PREFER-RULE-SET-OVER-FLAGS?*");
  public static final SubLInteger $int32$60 = makeInteger(60);
  public static final SubLSymbol $sym33$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym34$KB_RULE_SET = makeSymbol("KB-RULE-SET");
  public static final SubLSymbol $sym35$DO_RULES = makeSymbol("DO-RULES");
  public static final SubLString $str36$mapping_Cyc_assertions = makeString("mapping Cyc assertions");
  public static final SubLSymbol $sym37$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw38$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym39$CNF_P = makeSymbol("CNF-P");
  public static final SubLString $str40$Rebuilding_the_Rule_Set = makeString("Rebuilding the Rule Set");
  public static final SubLSymbol $sym41$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym42$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLList $list43 = list(list(makeSymbol("WHO"), makeSymbol("WHEN"), makeSymbol("WHY"), makeSymbol("SECOND")), makeSymbol("ASSERT-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym44$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol $sym45$_OPTIONAL = makeSymbol("&OPTIONAL");
  public static final SubLSymbol $kw46$ASSERT_INFO = makeKeyword("ASSERT-INFO");
  public static final SubLList $list47 = list(makeSymbol("&OPTIONAL"), makeSymbol("WHO"), makeSymbol("WHEN"), makeSymbol("WHY"), makeSymbol("SECOND"));
  public static final SubLSymbol $sym48$VALID_ARGUMENT = makeSymbol("VALID-ARGUMENT");
  public static final SubLSymbol $kw49$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym50$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw51$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str52$Unexpected_formula_data_hook___S = makeString("Unexpected formula data hook: ~S");
  public static final SubLSymbol $sym53$ARGUMENT_P = makeSymbol("ARGUMENT-P");
  public static final SubLSymbol $sym54$DEDUCTION_P = makeSymbol("DEDUCTION-P");

  //// Initializers

  public void declareFunctions() {
    declare_assertions_low_file();
  }

  public void initializeVariables() {
    init_assertions_low_file();
  }

  public void runTopLevelForms() {
    setup_assertions_low_file();
  }

}
