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
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.clause_strucs;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.constants_high;
import com.cyc.cycjava_1.cycl.deduction_handles;
import com.cyc.cycjava_1.cycl.deductions_high;
import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava_1.cycl.kb_hl_supports;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.nart_handles;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.variables;

public  final class cfasl_kb_methods extends SubLTranslatedFile {

  //// Constructor

  private cfasl_kb_methods() {}
  public static final SubLFile me = new cfasl_kb_methods();
  public static final String myName = "com.cyc.cycjava_1.cycl.cfasl_kb_methods";

  //// Definitions

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 797) 
  public static SubLSymbol $within_complete_cfasl_objects$ = null;

  /** Return T iff we are assuming complete CFASL constants (having guid and name) and complete
   variables (having only a name). */
  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 1205) 
  public static final SubLObject within_complete_cfasl_objects_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $within_complete_cfasl_objects$.getDynamicValue(thread);
    }
  }


  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 3160) 
  public static final SubLObject cfasl_invalid_constant() {
    return $sample_invalid_constant$.getGlobalValue();
  }

  
  /** A set of constants for which is it OK to output as
   an internal handle rather than as an external recipe. */
  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 1710) 
  public static SubLSymbol $cfasl_externalized_constant_exceptions$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 1951) 
  public static final SubLObject cfasl_externalized_constant_exception_p(SubLObject constant) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != $cfasl_externalized_constant_exceptions$.getDynamicValue(thread))
             && (NIL != set.set_memberP(constant, $cfasl_externalized_constant_exceptions$.getDynamicValue(thread)))));
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 2146) 
  private static SubLSymbol $cfasl_opcode_constant$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 2351) 
  private static SubLSymbol $cfasl_opcode_complete_constant$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 2440) 
  public static final SubLObject cfasl_output_constant(SubLObject constant, SubLObject stream) {
    if ((NIL != within_complete_cfasl_objects_p())) {
      cfasl.cfasl_raw_write_byte($cfasl_opcode_complete_constant$.getGlobalValue(), stream);
      cfasl_output_constant_recipe(constant, stream);
      cfasl.cfasl_output_string(constants_high.constant_name(constant), stream);
    } else {
      cfasl.cfasl_raw_write_byte($cfasl_opcode_constant$.getGlobalValue(), stream);
      if ((NIL != cfasl.within_cfasl_externalization_p())) {
        cfasl_output_constant_recipe(constant, stream);
      } else {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32180");
      }
    }
    return constant;
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 2962) 
  public static final SubLObject cfasl_output_object_constant_method(SubLObject object, SubLObject stream) {
    return cfasl_output_constant(object, stream);
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 3072) 
  private static SubLSymbol $sample_invalid_constant$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 3240) 
  public static final SubLObject cfasl_input_constant(SubLObject stream) {
    {
      SubLObject constant = NIL;
      if ((NIL != cfasl.within_cfasl_externalization_p())) {
        constant = cfasl_input_constant_recipe(stream);
      } else {
        constant = cfasl_input_constant_handle(stream);
      }
      if ((NIL == constant)) {
        constant = $sample_invalid_constant$.getGlobalValue();
      }
      return constant;
    }
  }

  public static final class $cfasl_input_constant$UnaryFunction extends UnaryFunction {
    public $cfasl_input_constant$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-CONSTANT")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_constant(arg1); }
  }

  /** Input the complete CFASL constant, assuming within-cfasl-externalization-p, and
   ignoring the constant name. */
  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 3554) 
  public static final SubLObject cfasl_input_complete_constant(SubLObject stream) {
    {
      SubLObject constant = NIL;
      constant = cfasl_input_constant_recipe(stream);
      cfasl.cfasl_input_object(stream);
      if ((NIL == constant)) {
        constant = $sample_invalid_constant$.getGlobalValue();
      }
      return constant;
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 3946) 
  public static final SubLObject cfasl_output_constant_recipe(SubLObject constant, SubLObject stream) {
    if ((NIL != cfasl_externalized_constant_exception_p(constant))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32181");
    }
    {
      SubLObject external_id = constants_high.constant_external_id(constant);
      cfasl.cfasl_output(external_id, stream);
    }
    return constant;
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 4260) 
  public static final SubLObject cfasl_input_constant_recipe(SubLObject stream) {
    {
      SubLObject id = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      if ((NIL != constants_high.constant_external_id_p(id))) {
        return constants_high.find_constant_by_external_id(id);
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31625"))) {
        return cfasl_constant_handle_lookup(id);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 4744) 
  public static final SubLObject cfasl_input_constant_handle(SubLObject stream) {
    {
      SubLObject handle = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      return cfasl_constant_handle_lookup(handle);
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 5367) 
  public static final SubLObject cfasl_constant_handle_lookup(SubLObject id) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == subl_promotions.non_negative_integer_p(id))) {
        return $sample_invalid_constant$.getGlobalValue();
      }
      {
        SubLObject method = api_control_vars.$cfasl_constant_handle_lookup_func$.getDynamicValue(thread);
        if ((NIL == method)) {
          return constants_high.find_constant_by_internal_id(id);
        }
        {
          SubLObject pcase_var = method;
          if (pcase_var.eql($sym11$FIND_CONSTANT_BY_INTERNAL_ID)) {
            return constants_high.find_constant_by_internal_id(id);
          } else if (pcase_var.eql($sym12$FIND_CONSTANT_BY_DUMP_ID)) {
            return constants_high.find_constant_by_dump_id(id);
          }
        }
        return Functions.funcall(method, id);
      }
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 5873) 
  private static SubLSymbol $cfasl_opcode_nart$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 6210) 
  public static final SubLObject cfasl_output_object_nart_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32184");
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 6312) 
  private static SubLSymbol $sample_invalid_nart$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 6538) 
  public static final SubLObject cfasl_input_nart(SubLObject stream) {
    {
      SubLObject nart = NIL;
      if ((NIL != cfasl.within_cfasl_externalization_p())) {
        nart = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32172");
      } else {
        nart = cfasl_input_nart_handle(stream);
      }
      if ((NIL == nart)) {
        nart = $sample_invalid_nart$.getGlobalValue();
      }
      return nart;
    }
  }

  public static final class $cfasl_input_nart$UnaryFunction extends UnaryFunction {
    public $cfasl_input_nart$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-NART")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_nart(arg1); }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 7279) 
  public static final SubLObject cfasl_input_nart_handle(SubLObject stream) {
    {
      SubLObject handle = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      return cfasl_nart_handle_lookup(handle);
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 7815) 
  public static final SubLObject cfasl_nart_handle_lookup(SubLObject id) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == subl_promotions.non_negative_integer_p(id))) {
        return $sample_invalid_nart$.getGlobalValue();
      }
      {
        SubLObject method = api_control_vars.$cfasl_nart_handle_lookup_func$.getDynamicValue(thread);
        if ((NIL == method)) {
          return nart_handles.find_nart_by_id(id);
        }
        {
          SubLObject pcase_var = method;
          if (pcase_var.eql($sym19$FIND_NART_BY_ID)) {
            return nart_handles.find_nart_by_id(id);
          } else if (pcase_var.eql($sym20$FIND_NART_BY_DUMP_ID)) {
            return narts_high.find_nart_by_dump_id(id);
          }
        }
        return Functions.funcall(method, id);
      }
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 8262) 
  private static SubLSymbol $cfasl_opcode_assertion$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 8664) 
  public static final SubLObject cfasl_output_object_assertion_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32178");
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 8776) 
  private static SubLSymbol $sample_invalid_assertion$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 8949) 
  public static final SubLObject cfasl_input_assertion(SubLObject stream) {
    {
      SubLObject assertion = NIL;
      if ((NIL != cfasl.within_cfasl_externalization_p())) {
        assertion = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32166");
      } else {
        assertion = cfasl_input_assertion_handle(stream);
      }
      if ((NIL == assertion)) {
        assertion = $sample_invalid_assertion$.getGlobalValue();
      }
      return assertion;
    }
  }

  public static final class $cfasl_input_assertion$UnaryFunction extends UnaryFunction {
    public $cfasl_input_assertion$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-ASSERTION")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_assertion(arg1); }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 9871) 
  public static final SubLObject cfasl_input_assertion_handle(SubLObject stream) {
    {
      SubLObject handle = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      return cfasl_assertion_handle_lookup(handle);
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 10482) 
  public static final SubLObject cfasl_assertion_handle_lookup(SubLObject id) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == subl_promotions.non_negative_integer_p(id))) {
        return $sample_invalid_assertion$.getGlobalValue();
      }
      {
        SubLObject method = api_control_vars.$cfasl_assertion_handle_lookup_func$.getDynamicValue(thread);
        if ((NIL == method)) {
          return assertion_handles.find_assertion_by_id(id);
        }
        {
          SubLObject pcase_var = method;
          if (pcase_var.eql($sym27$FIND_ASSERTION_BY_ID)) {
            return assertion_handles.find_assertion_by_id(id);
          } else if (pcase_var.eql($sym28$FIND_ASSERTION_BY_DUMP_ID)) {
            return assertions_high.find_assertion_by_dump_id(id);
          }
        }
        return Functions.funcall(method, id);
      }
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 10969) 
  private static SubLSymbol $cfasl_opcode_deduction$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 11371) 
  public static final SubLObject cfasl_output_object_deduction_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32182");
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 11483) 
  private static SubLSymbol $sample_invalid_deduction$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 11656) 
  public static final SubLObject cfasl_input_deduction(SubLObject stream) {
    {
      SubLObject deduction = NIL;
      if ((NIL != cfasl.within_cfasl_externalization_p())) {
        deduction = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32168");
      } else {
        deduction = cfasl_input_deduction_handle(stream);
      }
      if ((NIL == deduction)) {
        deduction = $sample_invalid_deduction$.getGlobalValue();
      }
      return deduction;
    }
  }

  public static final class $cfasl_input_deduction$UnaryFunction extends UnaryFunction {
    public $cfasl_input_deduction$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-DEDUCTION")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_deduction(arg1); }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 12764) 
  public static final SubLObject cfasl_input_deduction_handle(SubLObject stream) {
    {
      SubLObject handle = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      return cfasl_deduction_handle_lookup(handle);
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 13375) 
  public static final SubLObject cfasl_deduction_handle_lookup(SubLObject id) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == subl_promotions.non_negative_integer_p(id))) {
        return $sample_invalid_deduction$.getGlobalValue();
      }
      {
        SubLObject method = api_control_vars.$cfasl_deduction_handle_lookup_func$.getDynamicValue(thread);
        if ((NIL == method)) {
          return deduction_handles.find_deduction_by_id(id);
        }
        {
          SubLObject pcase_var = method;
          if (pcase_var.eql($sym35$FIND_DEDUCTION_BY_ID)) {
            return deduction_handles.find_deduction_by_id(id);
          } else if (pcase_var.eql($sym36$FIND_DEDUCTION_BY_DUMP_ID)) {
            return deductions_high.find_deduction_by_dump_id(id);
          }
        }
        return Functions.funcall(method, id);
      }
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 13862) 
  private static SubLSymbol $cfasl_opcode_kb_hl_support$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 14316) 
  public static final SubLObject cfasl_output_object_kb_hl_support_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32183");
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 14436) 
  private static SubLSymbol $sample_invalid_kb_hl_support$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 14616) 
  public static final SubLObject cfasl_input_kb_hl_support(SubLObject stream) {
    {
      SubLObject kb_hl_support = NIL;
      if ((NIL != cfasl.within_cfasl_externalization_p())) {
        kb_hl_support = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32171");
      } else {
        kb_hl_support = cfasl_input_kb_hl_support_handle(stream);
      }
      if ((NIL == kb_hl_support)) {
        kb_hl_support = $sample_invalid_kb_hl_support$.getGlobalValue();
      }
      return kb_hl_support;
    }
  }

  public static final class $cfasl_input_kb_hl_support$UnaryFunction extends UnaryFunction {
    public $cfasl_input_kb_hl_support$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-KB-HL-SUPPORT")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_kb_hl_support(arg1); }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 15566) 
  public static final SubLObject cfasl_input_kb_hl_support_handle(SubLObject stream) {
    {
      SubLObject handle = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      return cfasl_kb_hl_support_handle_lookup(handle);
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 16177) 
  public static final SubLObject cfasl_kb_hl_support_handle_lookup(SubLObject id) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject method = ((NIL != api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.getDynamicValue(thread)) ? ((SubLObject) api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.getDynamicValue(thread)) : $sym43$FIND_KB_HL_SUPPORT_BY_ID);
        SubLObject pcase_var = method;
        if (pcase_var.eql($sym43$FIND_KB_HL_SUPPORT_BY_ID)) {
          return kb_hl_supports.find_kb_hl_support_by_id(id);
        } else if (pcase_var.eql($sym44$FIND_KB_HL_SUPPORT_BY_DUMP_ID)) {
          return kb_hl_supports.find_kb_hl_support_by_dump_id(id);
        } else {
          return Functions.funcall(method, id);
        }
      }
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 16564) 
  private static SubLSymbol $cfasl_opcode_clause_struc$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 17005) 
  public static final SubLObject cfasl_output_object_clause_struc_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32179");
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 17123) 
  private static SubLSymbol $sample_invalid_clause_struc$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 17308) 
  public static final SubLObject cfasl_input_clause_struc(SubLObject stream) {
    {
      SubLObject clause_struc = NIL;
      if ((NIL != cfasl.within_cfasl_externalization_p())) {
        clause_struc = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32167");
      } else {
        clause_struc = cfasl_input_clause_struc_handle(stream);
      }
      if ((NIL == clause_struc)) {
        clause_struc = $sample_invalid_clause_struc$.getGlobalValue();
      }
      return clause_struc;
    }
  }

  public static final class $cfasl_input_clause_struc$UnaryFunction extends UnaryFunction {
    public $cfasl_input_clause_struc$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-CLAUSE-STRUC")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_clause_struc(arg1); }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 18181) 
  public static final SubLObject cfasl_input_clause_struc_handle(SubLObject stream) {
    {
      SubLObject handle = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      return cfasl_clause_struc_handle_lookup(handle);
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 18840) 
  public static final SubLObject cfasl_clause_struc_handle_lookup(SubLObject id) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == subl_promotions.non_negative_integer_p(id))) {
        return $sample_invalid_clause_struc$.getGlobalValue();
      }
      {
        SubLObject method = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.getDynamicValue(thread);
        if ((NIL == method)) {
          return clause_strucs.find_clause_struc_by_id(id);
        }
        {
          SubLObject pcase_var = method;
          if (pcase_var.eql($sym51$FIND_CLAUSE_STRUC_BY_ID)) {
            return clause_strucs.find_clause_struc_by_id(id);
          } else if (pcase_var.eql($sym52$FIND_CLAUSE_STRUC_BY_DUMP_ID)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11345");
          }
        }
        return Functions.funcall(method, id);
      }
    }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 19351) 
  private static SubLSymbol $cfasl_opcode_variable$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 19460) 
  private static SubLSymbol $cfasl_opcode_complete_variable$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 19963) 
  public static final SubLObject cfasl_output_object_variable_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32187");
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 20073) 
  public static final SubLObject cfasl_input_variable(SubLObject stream) {
    return variables.find_variable_by_id(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
  }

  public static final class $cfasl_input_variable$UnaryFunction extends UnaryFunction {
    public $cfasl_input_variable$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-VARIABLE")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_variable(arg1); }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 20358) 
  public static final SubLObject cfasl_output_object_sbhl_directed_link_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32185");
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 20670) 
  private static SubLSymbol $cfasl_opcode_sbhl_directed_link$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 21043) 
  public static final SubLObject cfasl_input_sbhl_directed_link(SubLObject stream) {
    {
      SubLObject d_link = NIL;
      d_link = sbhl_links.make_sbhl_directed_link(UNPROVIDED);
      sbhl_links._csetf_sbhl_directed_link_predicate_links(d_link, cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      sbhl_links._csetf_sbhl_directed_link_inverse_links(d_link, cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      return d_link;
    }
  }

  public static final class $cfasl_input_sbhl_directed_link$UnaryFunction extends UnaryFunction {
    public $cfasl_input_sbhl_directed_link$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-SBHL-DIRECTED-LINK")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_sbhl_directed_link(arg1); }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 21368) 
  public static final SubLObject cfasl_output_object_sbhl_undirected_link_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32186");
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 21528) 
  private static SubLSymbol $cfasl_opcode_sbhl_undirected_link$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 21835) 
  public static final SubLObject cfasl_input_sbhl_undirected_link(SubLObject stream) {
    {
      SubLObject d_link = NIL;
      d_link = sbhl_links.make_sbhl_undirected_link(UNPROVIDED);
      sbhl_links._csetf_sbhl_undirected_link_links(d_link, cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      return d_link;
    }
  }

  public static final class $cfasl_input_sbhl_undirected_link$UnaryFunction extends UnaryFunction {
    public $cfasl_input_sbhl_undirected_link$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-SBHL-UNDIRECTED-LINK")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_sbhl_undirected_link(arg1); }
  }

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 22081) 
  private static SubLSymbol $cfasl_opcode_hl_start$ = null;

  @SubL(source = "cycl/cfasl-kb-methods.lisp", position = 22307) 
  private static SubLSymbol $cfasl_opcode_hl_end$ = null;

  public static final class $cfasl_input_hl_start$UnaryFunction extends UnaryFunction {
    public $cfasl_input_hl_start$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-HL-START")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32170"); }
  }

  public static final class $cfasl_input_hl_end$UnaryFunction extends UnaryFunction {
    public $cfasl_input_hl_end$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-HL-END")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32169"); }
  }

  public static final SubLObject declare_cfasl_kb_methods_file() {
    declareFunction(myName, "within_complete_cfasl_objects_p", "WITHIN-COMPLETE-CFASL-OBJECTS-P", 0, 0, false);
    declareMacro(myName, "with_cfasl_externalized_constant_exceptions", "WITH-CFASL-EXTERNALIZED-CONSTANT-EXCEPTIONS");
    declareFunction(myName, "cfasl_externalized_constant_exception_p", "CFASL-EXTERNALIZED-CONSTANT-EXCEPTION-P", 1, 0, false);
    declareFunction(myName, "cfasl_output_constant", "CFASL-OUTPUT-CONSTANT", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_constant_method", "CFASL-OUTPUT-OBJECT-CONSTANT-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_invalid_constant", "CFASL-INVALID-CONSTANT", 0, 0, false);
    declareFunction(myName, "cfasl_input_constant", "CFASL-INPUT-CONSTANT", 1, 0, false); new $cfasl_input_constant$UnaryFunction();
    declareFunction(myName, "cfasl_input_complete_constant", "CFASL-INPUT-COMPLETE-CONSTANT", 1, 0, false);
    declareFunction(myName, "cfasl_output_constant_recipe", "CFASL-OUTPUT-CONSTANT-RECIPE", 2, 0, false);
    declareFunction(myName, "cfasl_input_constant_recipe", "CFASL-INPUT-CONSTANT-RECIPE", 1, 0, false);
    declareFunction(myName, "cfasl_output_constant_handle", "CFASL-OUTPUT-CONSTANT-HANDLE", 2, 0, false);
    declareFunction(myName, "cfasl_input_constant_handle", "CFASL-INPUT-CONSTANT-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_constant_handle", "CFASL-CONSTANT-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_constant_handle_lookup", "CFASL-CONSTANT-HANDLE-LOOKUP", 1, 0, false);
    declareFunction(myName, "cfasl_output_nart", "CFASL-OUTPUT-NART", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_nart_method", "CFASL-OUTPUT-OBJECT-NART-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_invalid_nart", "CFASL-INVALID-NART", 0, 0, false);
    declareFunction(myName, "cfasl_input_nart", "CFASL-INPUT-NART", 1, 0, false); new $cfasl_input_nart$UnaryFunction();
    declareFunction(myName, "cfasl_output_nart_recipe", "CFASL-OUTPUT-NART-RECIPE", 2, 0, false);
    declareFunction(myName, "cfasl_input_nart_recipe", "CFASL-INPUT-NART-RECIPE", 1, 0, false);
    declareFunction(myName, "cfasl_output_nart_handle", "CFASL-OUTPUT-NART-HANDLE", 2, 0, false);
    declareFunction(myName, "cfasl_input_nart_handle", "CFASL-INPUT-NART-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_nart_handle", "CFASL-NART-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_nart_handle_lookup", "CFASL-NART-HANDLE-LOOKUP", 1, 0, false);
    declareFunction(myName, "cfasl_output_assertion", "CFASL-OUTPUT-ASSERTION", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_assertion_method", "CFASL-OUTPUT-OBJECT-ASSERTION-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_invalid_assertion", "CFASL-INVALID-ASSERTION", 0, 0, false);
    declareFunction(myName, "cfasl_input_assertion", "CFASL-INPUT-ASSERTION", 1, 0, false); new $cfasl_input_assertion$UnaryFunction();
    declareFunction(myName, "cfasl_output_assertion_recipe", "CFASL-OUTPUT-ASSERTION-RECIPE", 2, 0, false);
    declareFunction(myName, "cfasl_input_assertion_recipe", "CFASL-INPUT-ASSERTION-RECIPE", 1, 0, false);
    declareFunction(myName, "cfasl_output_assertion_handle", "CFASL-OUTPUT-ASSERTION-HANDLE", 2, 0, false);
    declareFunction(myName, "cfasl_input_assertion_handle", "CFASL-INPUT-ASSERTION-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_assertion_handle", "CFASL-ASSERTION-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_assertion_handle_lookup", "CFASL-ASSERTION-HANDLE-LOOKUP", 1, 0, false);
    declareFunction(myName, "cfasl_output_deduction", "CFASL-OUTPUT-DEDUCTION", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_deduction_method", "CFASL-OUTPUT-OBJECT-DEDUCTION-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_invalid_deduction", "CFASL-INVALID-DEDUCTION", 0, 0, false);
    declareFunction(myName, "cfasl_input_deduction", "CFASL-INPUT-DEDUCTION", 1, 0, false); new $cfasl_input_deduction$UnaryFunction();
    declareFunction(myName, "cfasl_output_deduction_recipe", "CFASL-OUTPUT-DEDUCTION-RECIPE", 2, 0, false);
    declareFunction(myName, "cfasl_input_deduction_recipe", "CFASL-INPUT-DEDUCTION-RECIPE", 1, 0, false);
    declareFunction(myName, "cfasl_output_deduction_handle", "CFASL-OUTPUT-DEDUCTION-HANDLE", 2, 0, false);
    declareFunction(myName, "cfasl_input_deduction_handle", "CFASL-INPUT-DEDUCTION-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_deduction_handle", "CFASL-DEDUCTION-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_deduction_handle_lookup", "CFASL-DEDUCTION-HANDLE-LOOKUP", 1, 0, false);
    declareFunction(myName, "cfasl_output_kb_hl_support", "CFASL-OUTPUT-KB-HL-SUPPORT", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_kb_hl_support_method", "CFASL-OUTPUT-OBJECT-KB-HL-SUPPORT-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_invalid_kb_hl_support", "CFASL-INVALID-KB-HL-SUPPORT", 0, 0, false);
    declareFunction(myName, "cfasl_input_kb_hl_support", "CFASL-INPUT-KB-HL-SUPPORT", 1, 0, false); new $cfasl_input_kb_hl_support$UnaryFunction();
    declareFunction(myName, "cfasl_output_kb_hl_support_recipe", "CFASL-OUTPUT-KB-HL-SUPPORT-RECIPE", 2, 0, false);
    declareFunction(myName, "cfasl_input_kb_hl_support_recipe", "CFASL-INPUT-KB-HL-SUPPORT-RECIPE", 1, 0, false);
    declareFunction(myName, "cfasl_output_kb_hl_support_handle", "CFASL-OUTPUT-KB-HL-SUPPORT-HANDLE", 2, 0, false);
    declareFunction(myName, "cfasl_input_kb_hl_support_handle", "CFASL-INPUT-KB-HL-SUPPORT-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_kb_hl_support_handle", "CFASL-KB-HL-SUPPORT-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_kb_hl_support_handle_lookup", "CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP", 1, 0, false);
    declareFunction(myName, "cfasl_output_clause_struc", "CFASL-OUTPUT-CLAUSE-STRUC", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_clause_struc_method", "CFASL-OUTPUT-OBJECT-CLAUSE-STRUC-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_invalid_clause_struc", "CFASL-INVALID-CLAUSE-STRUC", 0, 0, false);
    declareFunction(myName, "cfasl_input_clause_struc", "CFASL-INPUT-CLAUSE-STRUC", 1, 0, false); new $cfasl_input_clause_struc$UnaryFunction();
    declareFunction(myName, "cfasl_output_clause_struc_recipe", "CFASL-OUTPUT-CLAUSE-STRUC-RECIPE", 2, 0, false);
    declareFunction(myName, "cfasl_input_clause_struc_recipe", "CFASL-INPUT-CLAUSE-STRUC-RECIPE", 1, 0, false);
    declareFunction(myName, "cfasl_output_clause_struc_handle", "CFASL-OUTPUT-CLAUSE-STRUC-HANDLE", 2, 0, false);
    declareFunction(myName, "cfasl_input_clause_struc_handle", "CFASL-INPUT-CLAUSE-STRUC-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_clause_struc_handle", "CFASL-CLAUSE-STRUC-HANDLE", 1, 0, false);
    declareFunction(myName, "cfasl_clause_struc_handle_lookup", "CFASL-CLAUSE-STRUC-HANDLE-LOOKUP", 1, 0, false);
    declareFunction(myName, "cfasl_output_variable", "CFASL-OUTPUT-VARIABLE", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_variable_method", "CFASL-OUTPUT-OBJECT-VARIABLE-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_input_variable", "CFASL-INPUT-VARIABLE", 1, 0, false); new $cfasl_input_variable$UnaryFunction();
    declareFunction(myName, "cfasl_input_complete_variable", "CFASL-INPUT-COMPLETE-VARIABLE", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_sbhl_directed_link_method", "CFASL-OUTPUT-OBJECT-SBHL-DIRECTED-LINK-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_sbhl_directed_link", "CFASL-OUTPUT-SBHL-DIRECTED-LINK", 2, 0, false);
    declareFunction(myName, "cfasl_input_sbhl_directed_link", "CFASL-INPUT-SBHL-DIRECTED-LINK", 1, 0, false); new $cfasl_input_sbhl_directed_link$UnaryFunction();
    declareFunction(myName, "cfasl_output_object_sbhl_undirected_link_method", "CFASL-OUTPUT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_sbhl_undirected_link", "CFASL-OUTPUT-SBHL-UNDIRECTED-LINK", 2, 0, false);
    declareFunction(myName, "cfasl_input_sbhl_undirected_link", "CFASL-INPUT-SBHL-UNDIRECTED-LINK", 1, 0, false); new $cfasl_input_sbhl_undirected_link$UnaryFunction();
    declareFunction(myName, "cfasl_input_hl_start", "CFASL-INPUT-HL-START", 1, 0, false); new $cfasl_input_hl_start$UnaryFunction();
    declareFunction(myName, "cfasl_input_hl_end", "CFASL-INPUT-HL-END", 1, 0, false); new $cfasl_input_hl_end$UnaryFunction();
    return NIL;
  }

  public static final SubLObject init_cfasl_kb_methods_file() {
    $within_complete_cfasl_objects$ = defparameter("*WITHIN-COMPLETE-CFASL-OBJECTS*", NIL);
    $cfasl_externalized_constant_exceptions$ = defparameter("*CFASL-EXTERNALIZED-CONSTANT-EXCEPTIONS*", NIL);
    $cfasl_opcode_constant$ = defconstant("*CFASL-OPCODE-CONSTANT*", $int3$30);
    $cfasl_opcode_complete_constant$ = defconstant("*CFASL-OPCODE-COMPLETE-CONSTANT*", $int5$32);
    $sample_invalid_constant$ = deflexical("*SAMPLE-INVALID-CONSTANT*", ((NIL != Symbols.boundp($sym8$_SAMPLE_INVALID_CONSTANT_)) ? ((SubLObject) $sample_invalid_constant$.getGlobalValue()) : constant_handles.create_sample_invalid_constant()));
    $cfasl_opcode_nart$ = defconstant("*CFASL-OPCODE-NART*", $int13$31);
    $sample_invalid_nart$ = deflexical("*SAMPLE-INVALID-NART*", ((NIL != Symbols.boundp($sym16$_SAMPLE_INVALID_NART_)) ? ((SubLObject) $sample_invalid_nart$.getGlobalValue()) : nart_handles.create_sample_invalid_nart()));
    $cfasl_opcode_assertion$ = defconstant("*CFASL-OPCODE-ASSERTION*", $int21$33);
    $sample_invalid_assertion$ = deflexical("*SAMPLE-INVALID-ASSERTION*", ((NIL != Symbols.boundp($sym24$_SAMPLE_INVALID_ASSERTION_)) ? ((SubLObject) $sample_invalid_assertion$.getGlobalValue()) : assertion_handles.create_sample_invalid_assertion()));
    $cfasl_opcode_deduction$ = defconstant("*CFASL-OPCODE-DEDUCTION*", $int29$36);
    $sample_invalid_deduction$ = deflexical("*SAMPLE-INVALID-DEDUCTION*", ((NIL != Symbols.boundp($sym32$_SAMPLE_INVALID_DEDUCTION_)) ? ((SubLObject) $sample_invalid_deduction$.getGlobalValue()) : deduction_handles.create_sample_invalid_deduction()));
    $cfasl_opcode_kb_hl_support$ = defconstant("*CFASL-OPCODE-KB-HL-SUPPORT*", $int37$37);
    $sample_invalid_kb_hl_support$ = deflexical("*SAMPLE-INVALID-KB-HL-SUPPORT*", ((NIL != Symbols.boundp($sym40$_SAMPLE_INVALID_KB_HL_SUPPORT_)) ? ((SubLObject) $sample_invalid_kb_hl_support$.getGlobalValue()) : kb_hl_supports.create_sample_invalid_kb_hl_support()));
    $cfasl_opcode_clause_struc$ = defconstant("*CFASL-OPCODE-CLAUSE-STRUC*", $int45$38);
    $sample_invalid_clause_struc$ = deflexical("*SAMPLE-INVALID-CLAUSE-STRUC*", ((NIL != Symbols.boundp($sym48$_SAMPLE_INVALID_CLAUSE_STRUC_)) ? ((SubLObject) $sample_invalid_clause_struc$.getGlobalValue()) : clause_strucs.create_sample_invalid_clause_struc()));
    $cfasl_opcode_variable$ = defconstant("*CFASL-OPCODE-VARIABLE*", $int53$40);
    $cfasl_opcode_complete_variable$ = defconstant("*CFASL-OPCODE-COMPLETE-VARIABLE*", $int55$42);
    $cfasl_opcode_sbhl_directed_link$ = defconstant("*CFASL-OPCODE-SBHL-DIRECTED-LINK*", $int59$90);
    $cfasl_opcode_sbhl_undirected_link$ = defconstant("*CFASL-OPCODE-SBHL-UNDIRECTED-LINK*", $int62$91);
    $cfasl_opcode_hl_start$ = defconstant("*CFASL-OPCODE-HL-START*", $int64$94);
    $cfasl_opcode_hl_end$ = defconstant("*CFASL-OPCODE-HL-END*", $int66$95);
    return NIL;
  }

  public static final SubLObject setup_cfasl_kb_methods_file() {
    // CVS_ID("Id: cfasl-kb-methods.lisp 126640 2008-12-04 13:39:36Z builder ");
    cfasl.register_cfasl_input_function($cfasl_opcode_constant$.getGlobalValue(), $sym4$CFASL_INPUT_CONSTANT);
    cfasl.register_cfasl_input_function($cfasl_opcode_complete_constant$.getGlobalValue(), $sym6$CFASL_INPUT_COMPLETE_CONSTANT);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function($sym7$CFASL_OUTPUT_OBJECT_CONSTANT_METHOD));
    subl_macro_promotions.declare_defglobal($sym8$_SAMPLE_INVALID_CONSTANT_);
    cfasl.register_cfasl_input_function($cfasl_opcode_nart$.getGlobalValue(), $sym14$CFASL_INPUT_NART);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function($sym15$CFASL_OUTPUT_OBJECT_NART_METHOD));
    subl_macro_promotions.declare_defglobal($sym16$_SAMPLE_INVALID_NART_);
    cfasl.register_cfasl_input_function($cfasl_opcode_assertion$.getGlobalValue(), $sym22$CFASL_INPUT_ASSERTION);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function($sym23$CFASL_OUTPUT_OBJECT_ASSERTION_METHOD));
    subl_macro_promotions.declare_defglobal($sym24$_SAMPLE_INVALID_ASSERTION_);
    cfasl.register_cfasl_input_function($cfasl_opcode_deduction$.getGlobalValue(), $sym30$CFASL_INPUT_DEDUCTION);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function($sym31$CFASL_OUTPUT_OBJECT_DEDUCTION_METHOD));
    subl_macro_promotions.declare_defglobal($sym32$_SAMPLE_INVALID_DEDUCTION_);
    cfasl.register_cfasl_input_function($cfasl_opcode_kb_hl_support$.getGlobalValue(), $sym38$CFASL_INPUT_KB_HL_SUPPORT);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), kb_hl_supports.$dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function($sym39$CFASL_OUTPUT_OBJECT_KB_HL_SUPPORT_METHOD));
    subl_macro_promotions.declare_defglobal($sym40$_SAMPLE_INVALID_KB_HL_SUPPORT_);
    cfasl.register_cfasl_input_function($cfasl_opcode_clause_struc$.getGlobalValue(), $sym46$CFASL_INPUT_CLAUSE_STRUC);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function($sym47$CFASL_OUTPUT_OBJECT_CLAUSE_STRUC_METHOD));
    subl_macro_promotions.declare_defglobal($sym48$_SAMPLE_INVALID_CLAUSE_STRUC_);
    cfasl.register_cfasl_input_function($cfasl_opcode_variable$.getGlobalValue(), $sym54$CFASL_INPUT_VARIABLE);
    cfasl.register_cfasl_input_function($cfasl_opcode_complete_variable$.getGlobalValue(), $sym56$CFASL_INPUT_COMPLETE_VARIABLE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), Symbols.symbol_function($sym57$CFASL_OUTPUT_OBJECT_VARIABLE_METHOD));
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_directed_link$.getGlobalValue(), Symbols.symbol_function($sym58$CFASL_OUTPUT_OBJECT_SBHL_DIRECTED_LINK_METHOD));
    cfasl.register_cfasl_input_function($cfasl_opcode_sbhl_directed_link$.getGlobalValue(), $sym60$CFASL_INPUT_SBHL_DIRECTED_LINK);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_undirected_link$.getGlobalValue(), Symbols.symbol_function($sym61$CFASL_OUTPUT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD));
    cfasl.register_cfasl_input_function($cfasl_opcode_sbhl_undirected_link$.getGlobalValue(), $sym63$CFASL_INPUT_SBHL_UNDIRECTED_LINK);
    cfasl.register_cfasl_input_function($cfasl_opcode_hl_start$.getGlobalValue(), $sym65$CFASL_INPUT_HL_START);
    cfasl.register_cfasl_input_function($cfasl_opcode_hl_end$.getGlobalValue(), $sym67$CFASL_INPUT_HL_END);
    generic_testing.define_test_case_table_int($sym68$CFASL_ENCODE, list(new SubLObject[] {$kw69$TEST, Symbols.symbol_function(EQUALP), $kw70$OWNER, NIL, $kw71$CLASSES, NIL, $kw72$KB, $kw73$TINY, $kw74$WORKING_, T}), $list75);
    generic_testing.define_test_case_table_int($sym76$CFASL_DECODE, list(new SubLObject[] {$kw69$TEST, Symbols.symbol_function(EQUALP), $kw70$OWNER, NIL, $kw71$CLASSES, NIL, $kw72$KB, $kw73$TINY, $kw74$WORKING_, T}), $list77);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("CONSTANTS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym2$_CFASL_EXTERNALIZED_CONSTANT_EXCEPTIONS_ = makeSymbol("*CFASL-EXTERNALIZED-CONSTANT-EXCEPTIONS*");
  public static final SubLInteger $int3$30 = makeInteger(30);
  public static final SubLSymbol $sym4$CFASL_INPUT_CONSTANT = makeSymbol("CFASL-INPUT-CONSTANT");
  public static final SubLInteger $int5$32 = makeInteger(32);
  public static final SubLSymbol $sym6$CFASL_INPUT_COMPLETE_CONSTANT = makeSymbol("CFASL-INPUT-COMPLETE-CONSTANT");
  public static final SubLSymbol $sym7$CFASL_OUTPUT_OBJECT_CONSTANT_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CONSTANT-METHOD");
  public static final SubLSymbol $sym8$_SAMPLE_INVALID_CONSTANT_ = makeSymbol("*SAMPLE-INVALID-CONSTANT*");
  public static final SubLSymbol $sym9$CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");
  public static final SubLSymbol $sym10$CONSTANT_DUMP_ID = makeSymbol("CONSTANT-DUMP-ID");
  public static final SubLSymbol $sym11$FIND_CONSTANT_BY_INTERNAL_ID = makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
  public static final SubLSymbol $sym12$FIND_CONSTANT_BY_DUMP_ID = makeSymbol("FIND-CONSTANT-BY-DUMP-ID");
  public static final SubLInteger $int13$31 = makeInteger(31);
  public static final SubLSymbol $sym14$CFASL_INPUT_NART = makeSymbol("CFASL-INPUT-NART");
  public static final SubLSymbol $sym15$CFASL_OUTPUT_OBJECT_NART_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-NART-METHOD");
  public static final SubLSymbol $sym16$_SAMPLE_INVALID_NART_ = makeSymbol("*SAMPLE-INVALID-NART*");
  public static final SubLSymbol $sym17$NART_ID = makeSymbol("NART-ID");
  public static final SubLSymbol $sym18$NART_DUMP_ID = makeSymbol("NART-DUMP-ID");
  public static final SubLSymbol $sym19$FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");
  public static final SubLSymbol $sym20$FIND_NART_BY_DUMP_ID = makeSymbol("FIND-NART-BY-DUMP-ID");
  public static final SubLInteger $int21$33 = makeInteger(33);
  public static final SubLSymbol $sym22$CFASL_INPUT_ASSERTION = makeSymbol("CFASL-INPUT-ASSERTION");
  public static final SubLSymbol $sym23$CFASL_OUTPUT_OBJECT_ASSERTION_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-ASSERTION-METHOD");
  public static final SubLSymbol $sym24$_SAMPLE_INVALID_ASSERTION_ = makeSymbol("*SAMPLE-INVALID-ASSERTION*");
  public static final SubLSymbol $sym25$ASSERTION_ID = makeSymbol("ASSERTION-ID");
  public static final SubLSymbol $sym26$ASSERTION_DUMP_ID = makeSymbol("ASSERTION-DUMP-ID");
  public static final SubLSymbol $sym27$FIND_ASSERTION_BY_ID = makeSymbol("FIND-ASSERTION-BY-ID");
  public static final SubLSymbol $sym28$FIND_ASSERTION_BY_DUMP_ID = makeSymbol("FIND-ASSERTION-BY-DUMP-ID");
  public static final SubLInteger $int29$36 = makeInteger(36);
  public static final SubLSymbol $sym30$CFASL_INPUT_DEDUCTION = makeSymbol("CFASL-INPUT-DEDUCTION");
  public static final SubLSymbol $sym31$CFASL_OUTPUT_OBJECT_DEDUCTION_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-DEDUCTION-METHOD");
  public static final SubLSymbol $sym32$_SAMPLE_INVALID_DEDUCTION_ = makeSymbol("*SAMPLE-INVALID-DEDUCTION*");
  public static final SubLSymbol $sym33$DEDUCTION_ID = makeSymbol("DEDUCTION-ID");
  public static final SubLSymbol $sym34$DEDUCTION_DUMP_ID = makeSymbol("DEDUCTION-DUMP-ID");
  public static final SubLSymbol $sym35$FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");
  public static final SubLSymbol $sym36$FIND_DEDUCTION_BY_DUMP_ID = makeSymbol("FIND-DEDUCTION-BY-DUMP-ID");
  public static final SubLInteger $int37$37 = makeInteger(37);
  public static final SubLSymbol $sym38$CFASL_INPUT_KB_HL_SUPPORT = makeSymbol("CFASL-INPUT-KB-HL-SUPPORT");
  public static final SubLSymbol $sym39$CFASL_OUTPUT_OBJECT_KB_HL_SUPPORT_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-KB-HL-SUPPORT-METHOD");
  public static final SubLSymbol $sym40$_SAMPLE_INVALID_KB_HL_SUPPORT_ = makeSymbol("*SAMPLE-INVALID-KB-HL-SUPPORT*");
  public static final SubLSymbol $sym41$KB_HL_SUPPORT_ID = makeSymbol("KB-HL-SUPPORT-ID");
  public static final SubLSymbol $sym42$KB_HL_SUPPORT_DUMP_ID = makeSymbol("KB-HL-SUPPORT-DUMP-ID");
  public static final SubLSymbol $sym43$FIND_KB_HL_SUPPORT_BY_ID = makeSymbol("FIND-KB-HL-SUPPORT-BY-ID");
  public static final SubLSymbol $sym44$FIND_KB_HL_SUPPORT_BY_DUMP_ID = makeSymbol("FIND-KB-HL-SUPPORT-BY-DUMP-ID");
  public static final SubLInteger $int45$38 = makeInteger(38);
  public static final SubLSymbol $sym46$CFASL_INPUT_CLAUSE_STRUC = makeSymbol("CFASL-INPUT-CLAUSE-STRUC");
  public static final SubLSymbol $sym47$CFASL_OUTPUT_OBJECT_CLAUSE_STRUC_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CLAUSE-STRUC-METHOD");
  public static final SubLSymbol $sym48$_SAMPLE_INVALID_CLAUSE_STRUC_ = makeSymbol("*SAMPLE-INVALID-CLAUSE-STRUC*");
  public static final SubLSymbol $sym49$CLAUSE_STRUC_ID = makeSymbol("CLAUSE-STRUC-ID");
  public static final SubLSymbol $sym50$CLAUSE_STRUC_DUMP_ID = makeSymbol("CLAUSE-STRUC-DUMP-ID");
  public static final SubLSymbol $sym51$FIND_CLAUSE_STRUC_BY_ID = makeSymbol("FIND-CLAUSE-STRUC-BY-ID");
  public static final SubLSymbol $sym52$FIND_CLAUSE_STRUC_BY_DUMP_ID = makeSymbol("FIND-CLAUSE-STRUC-BY-DUMP-ID");
  public static final SubLInteger $int53$40 = makeInteger(40);
  public static final SubLSymbol $sym54$CFASL_INPUT_VARIABLE = makeSymbol("CFASL-INPUT-VARIABLE");
  public static final SubLInteger $int55$42 = makeInteger(42);
  public static final SubLSymbol $sym56$CFASL_INPUT_COMPLETE_VARIABLE = makeSymbol("CFASL-INPUT-COMPLETE-VARIABLE");
  public static final SubLSymbol $sym57$CFASL_OUTPUT_OBJECT_VARIABLE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-VARIABLE-METHOD");
  public static final SubLSymbol $sym58$CFASL_OUTPUT_OBJECT_SBHL_DIRECTED_LINK_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SBHL-DIRECTED-LINK-METHOD");
  public static final SubLInteger $int59$90 = makeInteger(90);
  public static final SubLSymbol $sym60$CFASL_INPUT_SBHL_DIRECTED_LINK = makeSymbol("CFASL-INPUT-SBHL-DIRECTED-LINK");
  public static final SubLSymbol $sym61$CFASL_OUTPUT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD");
  public static final SubLInteger $int62$91 = makeInteger(91);
  public static final SubLSymbol $sym63$CFASL_INPUT_SBHL_UNDIRECTED_LINK = makeSymbol("CFASL-INPUT-SBHL-UNDIRECTED-LINK");
  public static final SubLInteger $int64$94 = makeInteger(94);
  public static final SubLSymbol $sym65$CFASL_INPUT_HL_START = makeSymbol("CFASL-INPUT-HL-START");
  public static final SubLInteger $int66$95 = makeInteger(95);
  public static final SubLSymbol $sym67$CFASL_INPUT_HL_END = makeSymbol("CFASL-INPUT-HL-END");
  public static final SubLSymbol $sym68$CFASL_ENCODE = makeSymbol("CFASL-ENCODE");
  public static final SubLSymbol $kw69$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw70$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw71$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw72$KB = makeKeyword("KB");
  public static final SubLSymbol $kw73$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw74$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list75 = list(list(list(makeGuid("bd5880f4-9c29-11b1-9dad-c379636f7270")), Vectors.vector(new SubLObject[] {makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(98), makeInteger(100), makeInteger(53), makeInteger(56), makeInteger(56), makeInteger(48), makeInteger(102), makeInteger(52), makeInteger(45), makeInteger(57), makeInteger(99), makeInteger(50), makeInteger(57), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(98), makeInteger(49), makeInteger(45), makeInteger(57), makeInteger(100), makeInteger(97), makeInteger(100), makeInteger(45), makeInteger(99), makeInteger(51), makeInteger(55), makeInteger(57), makeInteger(54), makeInteger(51), makeInteger(54), makeInteger(102), makeInteger(55), makeInteger(50), makeInteger(55), makeInteger(48)})), list(list(makeGuid("1bb5d971-e945-11dc-8241-00e08156aaa2")), Vectors.vector(new SubLObject[] {makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(49), makeInteger(98), makeInteger(98), makeInteger(53), makeInteger(100), makeInteger(57), makeInteger(55), makeInteger(49), makeInteger(45), makeInteger(101), makeInteger(57), makeInteger(52), makeInteger(53), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(100), makeInteger(99), makeInteger(45), makeInteger(56), makeInteger(50), makeInteger(52), makeInteger(49), makeInteger(45), makeInteger(48), makeInteger(48), makeInteger(101), makeInteger(48), makeInteger(56), makeInteger(49), makeInteger(53), makeInteger(54), makeInteger(97), makeInteger(97), makeInteger(97), makeInteger(50)})), list(list(makeGuid("8654b22c-e947-11dc-86ef-00e08156aaa2")), Vectors.vector(new SubLObject[] {makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(56), makeInteger(54), makeInteger(53), makeInteger(52), makeInteger(98), makeInteger(50), makeInteger(50), makeInteger(99), makeInteger(45), makeInteger(101), makeInteger(57), makeInteger(52), makeInteger(55), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(100), makeInteger(99), makeInteger(45), makeInteger(56), makeInteger(54), makeInteger(101), makeInteger(102), makeInteger(45), makeInteger(48), makeInteger(48), makeInteger(101), makeInteger(48), makeInteger(56), makeInteger(49), makeInteger(53), makeInteger(54), makeInteger(97), makeInteger(97), makeInteger(97), makeInteger(50)})), list(list(makeGuid("69ece82b-4224-40d6-8f55-268be97ba4e7")), Vectors.vector(new SubLObject[] {makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(54), makeInteger(57), makeInteger(101), makeInteger(99), makeInteger(101), makeInteger(56), makeInteger(50), makeInteger(98), makeInteger(45), makeInteger(52), makeInteger(50), makeInteger(50), makeInteger(52), makeInteger(45), makeInteger(52), makeInteger(48), makeInteger(100), makeInteger(54), makeInteger(45), makeInteger(56), makeInteger(102), makeInteger(53), makeInteger(53), makeInteger(45), makeInteger(50), makeInteger(54), makeInteger(56), makeInteger(98), makeInteger(101), makeInteger(57), makeInteger(55), makeInteger(98), makeInteger(97), makeInteger(52), makeInteger(101), makeInteger(55)})));
  public static final SubLSymbol $sym76$CFASL_DECODE = makeSymbol("CFASL-DECODE");
  public static final SubLList $list77 = list(list(list(Vectors.vector(new SubLObject[] {makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(98), makeInteger(100), makeInteger(53), makeInteger(56), makeInteger(56), makeInteger(48), makeInteger(102), makeInteger(52), makeInteger(45), makeInteger(57), makeInteger(99), makeInteger(50), makeInteger(57), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(98), makeInteger(49), makeInteger(45), makeInteger(57), makeInteger(100), makeInteger(97), makeInteger(100), makeInteger(45), makeInteger(99), makeInteger(51), makeInteger(55), makeInteger(57), makeInteger(54), makeInteger(51), makeInteger(54), makeInteger(102), makeInteger(55), makeInteger(50), makeInteger(55), makeInteger(48)})), makeGuid("bd5880f4-9c29-11b1-9dad-c379636f7270")), list(list(Vectors.vector(new SubLObject[] {makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(49), makeInteger(98), makeInteger(98), makeInteger(53), makeInteger(100), makeInteger(57), makeInteger(55), makeInteger(49), makeInteger(45), makeInteger(101), makeInteger(57), makeInteger(52), makeInteger(53), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(100), makeInteger(99), makeInteger(45), makeInteger(56), makeInteger(50), makeInteger(52), makeInteger(49), makeInteger(45), makeInteger(48), makeInteger(48), makeInteger(101), makeInteger(48), makeInteger(56), makeInteger(49), makeInteger(53), makeInteger(54), makeInteger(97), makeInteger(97), makeInteger(97), makeInteger(50)})), makeGuid("1bb5d971-e945-11dc-8241-00e08156aaa2")), list(list(Vectors.vector(new SubLObject[] {makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(56), makeInteger(54), makeInteger(53), makeInteger(52), makeInteger(98), makeInteger(50), makeInteger(50), makeInteger(99), makeInteger(45), makeInteger(101), makeInteger(57), makeInteger(52), makeInteger(55), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(100), makeInteger(99), makeInteger(45), makeInteger(56), makeInteger(54), makeInteger(101), makeInteger(102), makeInteger(45), makeInteger(48), makeInteger(48), makeInteger(101), makeInteger(48), makeInteger(56), makeInteger(49), makeInteger(53), makeInteger(54), makeInteger(97), makeInteger(97), makeInteger(97), makeInteger(50)})), makeGuid("8654b22c-e947-11dc-86ef-00e08156aaa2")), list(list(Vectors.vector(new SubLObject[] {makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(54), makeInteger(57), makeInteger(101), makeInteger(99), makeInteger(101), makeInteger(56), makeInteger(50), makeInteger(98), makeInteger(45), makeInteger(52), makeInteger(50), makeInteger(50), makeInteger(52), makeInteger(45), makeInteger(52), makeInteger(48), makeInteger(100), makeInteger(54), makeInteger(45), makeInteger(56), makeInteger(102), makeInteger(53), makeInteger(53), makeInteger(45), makeInteger(50), makeInteger(54), makeInteger(56), makeInteger(98), makeInteger(101), makeInteger(57), makeInteger(55), makeInteger(98), makeInteger(97), makeInteger(52), makeInteger(101), makeInteger(55)})), makeGuid("69ece82b-4224-40d6-8f55-268be97ba4e7")), list(list(Vectors.vector(new SubLObject[] {makeInteger(43), makeInteger(189), makeInteger(88), makeInteger(128), makeInteger(244), makeInteger(156), makeInteger(41), SEVENTEEN_INTEGER, makeInteger(177), makeInteger(157), makeInteger(173), makeInteger(195), makeInteger(121), makeInteger(99), makeInteger(111), makeInteger(114), makeInteger(112)})), makeGuid("bd5880f4-9c29-11b1-9dad-c379636f7270")), list(list(Vectors.vector(new SubLObject[] {makeInteger(43), makeInteger(27), makeInteger(181), makeInteger(217), makeInteger(113), makeInteger(233), makeInteger(69), SEVENTEEN_INTEGER, makeInteger(220), makeInteger(130), makeInteger(65), ZERO_INTEGER, makeInteger(224), makeInteger(129), makeInteger(86), makeInteger(170), makeInteger(162)})), makeGuid("1bb5d971-e945-11dc-8241-00e08156aaa2")), list(list(Vectors.vector(new SubLObject[] {makeInteger(43), makeInteger(134), makeInteger(84), makeInteger(178), makeInteger(44), makeInteger(233), makeInteger(71), SEVENTEEN_INTEGER, makeInteger(220), makeInteger(134), makeInteger(239), ZERO_INTEGER, makeInteger(224), makeInteger(129), makeInteger(86), makeInteger(170), makeInteger(162)})), makeGuid("8654b22c-e947-11dc-86ef-00e08156aaa2")), list(list(Vectors.vector(new SubLObject[] {makeInteger(43), makeInteger(105), makeInteger(236), makeInteger(232), makeInteger(43), makeInteger(66), makeInteger(36), makeInteger(64), makeInteger(214), makeInteger(143), makeInteger(85), makeInteger(38), makeInteger(139), makeInteger(233), makeInteger(123), makeInteger(164), makeInteger(231)})), makeGuid("69ece82b-4224-40d6-8f55-268be97ba4e7")));

  //// Initializers

  public void declareFunctions() {
    declare_cfasl_kb_methods_file();
  }

  public void initializeVariables() {
    init_cfasl_kb_methods_file();
  }

  public void runTopLevelForms() {
    setup_cfasl_kb_methods_file();
  }

}
