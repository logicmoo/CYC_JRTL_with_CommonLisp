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
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.constants_low;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class forts extends SubLTranslatedFile {

  //// Constructor

  private forts() {}
  public static final SubLFile me = new forts();
  public static final String myName = "com.cyc.cycjava_1.cycl.forts";

  //// Definitions

  /** Return T iff OBJECT is a first order reified term (FORT). */
  @SubL(source = "cycl/forts.lisp", position = 771) 
  public static final SubLObject fort_p(SubLObject object) {
    return makeBoolean(((NIL != constant_handles.constant_p(object))
          || (NIL != nart_handles.nart_p(object))));
  }

  public static final class $fort_p$UnaryFunction extends UnaryFunction {
    public $fort_p$UnaryFunction() { super(extractFunctionNamed("FORT-P")); }
    public SubLObject processItem(SubLObject arg1) { return fort_p(arg1); }
  }

  @SubL(source = "cycl/forts.lisp", position = 1002) 
  public static final SubLObject non_fort_p(SubLObject object) {
    return makeBoolean((NIL == fort_p(object)));
  }

  /** Return the total number of FORTs. */
  @SubL(source = "cycl/forts.lisp", position = 2610) 
  public static final SubLObject fort_count() {
    return Numbers.add(constant_handles.constant_count(), nart_handles.nart_count());
  }

  /** Primitively change the assertion index for FORT to NEW-INDEX. */
  @SubL(source = "cycl/forts.lisp", position = 3403) 
  public static final SubLObject reset_fort_index(SubLObject fort, SubLObject new_index) {
    checkType(fort, $sym0$FORT_P);
    if ((NIL != constant_handles.constant_p(fort))) {
      return constants_low.reset_constant_index(fort, new_index);
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 208");
    }
  }

  public static final class $fort_internal_id$UnaryFunction extends UnaryFunction {
    public $fort_internal_id$UnaryFunction() { super(extractFunctionNamed("FORT-INTERNAL-ID")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23147"); }
  }

  /** Return T if FORT is a valid FORT. */
  @SubL(source = "cycl/forts.lisp", position = 4119) 
  public static final SubLObject valid_fortP(SubLObject fort) {
    if ((NIL != constant_handles.constant_p(fort))) {
      return constant_handles.valid_constantP(fort, UNPROVIDED);
    } else if ((NIL != nart_handles.nart_p(fort))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30880");
    } else {
      return NIL;
    }
  }

  public static final class $invalid_fortP$UnaryFunction extends UnaryFunction {
    public $invalid_fortP$UnaryFunction() { super(extractFunctionNamed("INVALID-FORT?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23148"); }
  }

  /** Remove FORT from the KB. */
  @SubL(source = "cycl/forts.lisp", position = 5245) 
  public static final SubLObject remove_fort(SubLObject fort) {
    checkType(fort, $sym0$FORT_P);
    if ((NIL != constant_handles.constant_p(fort))) {
      return constants_high.remove_constant(fort);
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10431");
    }
  }

  public static final class $fort_id_index_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $constants; }
    public SubLObject getField3() { return $narts; }
    public SubLObject setField2(SubLObject value) { return $constants = value; }
    public SubLObject setField3(SubLObject value) { return $narts = value; }
    public SubLObject $constants = NIL;
    public SubLObject $narts = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($fort_id_index_native.class, $sym38$FORT_ID_INDEX, $sym39$FORT_ID_INDEX_P, $list40, $list41, new String[] {"$constants", "$narts"}, $list42, $list43, $sym44$PRINT_FORT_ID_INDEX);
  }

  @SubL(source = "cycl/forts.lisp", position = 5775) 
  public static SubLSymbol $dtp_fort_id_index$ = null;

  @SubL(source = "cycl/forts.lisp", position = 5775) 
  public static final SubLObject fort_id_index_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23150");
    return NIL;
  }

  public static final class $fort_id_index_p$UnaryFunction extends UnaryFunction {
    public $fort_id_index_p$UnaryFunction() { super(extractFunctionNamed("FORT-ID-INDEX-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23146"); }
  }

  @SubL(source = "cycl/forts.lisp", position = 5775) 
  public static final SubLObject fort_id_index_constants(SubLObject object) {
    checkType(object, $sym39$FORT_ID_INDEX_P);
    return object.getField2();
  }

  @SubL(source = "cycl/forts.lisp", position = 5775) 
  public static final SubLObject _csetf_fort_id_index_constants(SubLObject object, SubLObject value) {
    checkType(object, $sym39$FORT_ID_INDEX_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/forts.lisp", position = 5775) 
  public static final SubLObject _csetf_fort_id_index_narts(SubLObject object, SubLObject value) {
    checkType(object, $sym39$FORT_ID_INDEX_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/forts.lisp", position = 5775) 
  public static final SubLObject make_fort_id_index(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $fort_id_index_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw50$CONSTANTS)) {
            _csetf_fort_id_index_constants(v_new, current_value);
          } else if (pcase_var.eql($kw51$NARTS)) {
            _csetf_fort_id_index_narts(v_new, current_value);
          } else {
            Errors.error($str52$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Constructor. @return fort-id-index-p; Returns a new fort index. */
  @SubL(source = "cycl/forts.lisp", position = 6727) 
  public static final SubLObject new_fort_id_index() {
    {
      SubLObject fort_id_index = make_fort_id_index(UNPROVIDED);
      _csetf_fort_id_index_constants(fort_id_index, new_fort_id_index_constants());
      _csetf_fort_id_index_narts(fort_id_index, new_fort_id_index_narts());
      return fort_id_index;
    }
  }

  /** Accessor. Returns the object associated with FORT in FORT-ID-INDEX. */
  @SubL(source = "cycl/forts.lisp", position = 7525) 
  public static final SubLObject fort_id_index_lookup(SubLObject fort_id_index, SubLObject fort) {
    {
      SubLObject answer = NIL;
      checkType(fort, $sym0$FORT_P);
      checkType(fort_id_index, $sym39$FORT_ID_INDEX_P);
      if ((NIL != valid_fortP(fort))) {
        {
          SubLObject v_id_index = ((NIL != constant_handles.constant_p(fort)) ? ((SubLObject) fort_id_index_constants(fort_id_index)) : Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23142"));
          SubLObject id = ((NIL != constant_handles.constant_p(fort)) ? ((SubLObject) constants_high.constant_internal_id(fort)) : Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30869"));
          answer = id_index.id_index_lookup(v_id_index, id, UNPROVIDED);
        }
      }
      return answer;
    }
  }

  /** Modifier. Enter OBJECT in FORT-ID-INDEX as the object associated with FORT. */
  @SubL(source = "cycl/forts.lisp", position = 7813) 
  public static final SubLObject fort_id_index_enter(SubLObject fort_id_index, SubLObject fort, SubLObject object) {
    checkType(fort, $sym0$FORT_P);
    checkType(fort_id_index, $sym39$FORT_ID_INDEX_P);
    if ((NIL != valid_fortP(fort))) {
      {
        SubLObject v_id_index = ((NIL != constant_handles.constant_p(fort)) ? ((SubLObject) fort_id_index_constants(fort_id_index)) : Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23143"));
        SubLObject id = ((NIL != constant_handles.constant_p(fort)) ? ((SubLObject) constants_high.constant_internal_id(fort)) : Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30870"));
        id_index.id_index_enter(v_id_index, id, object);
      }
    }
    return NIL;
  }

  /** Modifier. Remove all FORT associations in FORT-ID-INDEX. */
  @SubL(source = "cycl/forts.lisp", position = 8080) 
  public static final SubLObject fort_id_index_remove(SubLObject fort_id_index, SubLObject fort) {
    checkType(fort, $sym0$FORT_P);
    checkType(fort_id_index, $sym39$FORT_ID_INDEX_P);
    if ((NIL != valid_fortP(fort))) {
      {
        SubLObject v_id_index = ((NIL != constant_handles.constant_p(fort)) ? ((SubLObject) fort_id_index_constants(fort_id_index)) : Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23144"));
        SubLObject id = ((NIL != constant_handles.constant_p(fort)) ? ((SubLObject) constants_high.constant_internal_id(fort)) : Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30871"));
        id_index.id_index_remove(v_id_index, id);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/forts.lisp", position = 9319) 
  public static final SubLObject new_fort_id_index_constants() {
    return id_index.new_id_index(constants_high.new_constant_internal_id_threshold(), UNPROVIDED);
  }

  @SubL(source = "cycl/forts.lisp", position = 9442) 
  public static final SubLObject new_fort_id_index_narts() {
    return id_index.new_id_index(nart_handles.new_nart_id_threshold(), UNPROVIDED);
  }

  @SubL(source = "cycl/forts.lisp", position = 11031) 
  private static SubLSymbol $cfasl_opcode_fort_id_index$ = null;

  @SubL(source = "cycl/forts.lisp", position = 11165) 
  public static final SubLObject cfasl_output_object_fort_id_index_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23135");
  }

  @SubL(source = "cycl/forts.lisp", position = 11652) 
  public static final SubLObject cfasl_input_fort_id_index(SubLObject stream) {
    {
      SubLObject count = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject fort_id_index = NIL;
      fort_id_index = new_fort_id_index();
      {
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL(count); i = Numbers.add(i, ONE_INTEGER)) {
          {
            SubLObject fort = cfasl.cfasl_input_object(stream);
            SubLObject value = cfasl.cfasl_input_object(stream);
            fort_id_index_enter(fort_id_index, fort, value);
          }
        }
      }
      return fort_id_index;
    }
  }

  public static final SubLObject declare_forts_file() {
    declareFunction(myName, "fort_p", "FORT-P", 1, 0, false); new $fort_p$UnaryFunction();
    declareFunction(myName, "non_fort_p", "NON-FORT-P", 1, 0, false);
    declareFunction(myName, "list_of_fort_p", "LIST-OF-FORT-P", 1, 0, false);
    declareFunction(myName, "fort_el_formula", "FORT-EL-FORMULA", 1, 0, false);
    declareFunction(myName, "new_forts_iterator", "NEW-FORTS-ITERATOR", 0, 0, false);
    declareMacro(myName, "do_forts", "DO-FORTS");
    declareFunction(myName, "do_forts_tables", "DO-FORTS-TABLES", 0, 0, false);
    declareFunction(myName, "fort_count", "FORT-COUNT", 0, 0, false);
    declareFunction(myName, "random_fort", "RANDOM-FORT", 0, 0, false);
    declareFunction(myName, "fort_index", "FORT-INDEX", 1, 0, false);
    declareFunction(myName, "reset_fort_index", "RESET-FORT-INDEX", 2, 0, false);
    declareFunction(myName, "clear_fort_index", "CLEAR-FORT-INDEX", 1, 0, false);
    declareFunction(myName, "fort_internal_id", "FORT-INTERNAL-ID", 1, 0, false); new $fort_internal_id$UnaryFunction();
    declareFunction(myName, "fort_external_id", "FORT-EXTERNAL-ID", 1, 0, false);
    declareFunction(myName, "valid_fortP", "VALID-FORT?", 1, 0, false);
    declareFunction(myName, "valid_fort_robustP", "VALID-FORT-ROBUST?", 1, 0, false);
    declareFunction(myName, "invalid_fortP", "INVALID-FORT?", 1, 0, false); new $invalid_fortP$UnaryFunction();
    declareFunction(myName, "invalid_fort_robustP", "INVALID-FORT-ROBUST?", 1, 0, false);
    declareFunction(myName, "remove_fort", "REMOVE-FORT", 1, 0, false);
    declareFunction(myName, "fort_id_index_print_function_trampoline", "FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "fort_id_index_p", "FORT-ID-INDEX-P", 1, 0, false); new $fort_id_index_p$UnaryFunction();
    declareFunction(myName, "fort_id_index_constants", "FORT-ID-INDEX-CONSTANTS", 1, 0, false);
    declareFunction(myName, "fort_id_index_narts", "FORT-ID-INDEX-NARTS", 1, 0, false);
    declareFunction(myName, "_csetf_fort_id_index_constants", "_CSETF-FORT-ID-INDEX-CONSTANTS", 2, 0, false);
    declareFunction(myName, "_csetf_fort_id_index_narts", "_CSETF-FORT-ID-INDEX-NARTS", 2, 0, false);
    declareFunction(myName, "make_fort_id_index", "MAKE-FORT-ID-INDEX", 0, 1, false);
    declareFunction(myName, "print_fort_id_index", "PRINT-FORT-ID-INDEX", 3, 0, false);
    declareMacro(myName, "with_fort_id_index_index_and_id", "WITH-FORT-ID-INDEX-INDEX-AND-ID");
    declareFunction(myName, "new_fort_id_index", "NEW-FORT-ID-INDEX", 0, 0, false);
    declareFunction(myName, "fort_id_index_count", "FORT-ID-INDEX-COUNT", 1, 0, false);
    declareFunction(myName, "fort_id_index_emptyP", "FORT-ID-INDEX-EMPTY?", 1, 0, false);
    declareFunction(myName, "fort_id_index_lookup", "FORT-ID-INDEX-LOOKUP", 2, 0, false);
    declareFunction(myName, "fort_id_index_enter", "FORT-ID-INDEX-ENTER", 3, 0, false);
    declareFunction(myName, "fort_id_index_remove", "FORT-ID-INDEX-REMOVE", 2, 0, false);
    declareFunction(myName, "clear_fort_id_index", "CLEAR-FORT-ID-INDEX", 1, 0, false);
    declareFunction(myName, "optimize_fort_id_index", "OPTIMIZE-FORT-ID-INDEX", 1, 0, false);
    declareFunction(myName, "fort_id_index_optimized_p", "FORT-ID-INDEX-OPTIMIZED-P", 1, 0, false);
    declareFunction(myName, "new_fort_id_index_constants", "NEW-FORT-ID-INDEX-CONSTANTS", 0, 0, false);
    declareFunction(myName, "new_fort_id_index_narts", "NEW-FORT-ID-INDEX-NARTS", 0, 0, false);
    declareMacro(myName, "do_fort_id_index", "DO-FORT-ID-INDEX");
    declareMacro(myName, "do_fort_id_index_constants", "DO-FORT-ID-INDEX-CONSTANTS");
    declareFunction(myName, "do_fii_get_constants", "DO-FII-GET-CONSTANTS", 1, 0, false);
    declareMacro(myName, "do_fort_id_index_narts", "DO-FORT-ID-INDEX-NARTS");
    declareFunction(myName, "do_fii_get_narts", "DO-FII-GET-NARTS", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_fort_id_index_method", "CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_fort_id_index", "CFASL-OUTPUT-FORT-ID-INDEX", 2, 0, false);
    declareFunction(myName, "cfasl_input_fort_id_index", "CFASL-INPUT-FORT-ID-INDEX", 1, 0, false);
    declareFunction(myName, "verify_do_forts_macro_iteration_equivalence", "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_forts_file() {
    $dtp_fort_id_index$ = defconstant("*DTP-FORT-ID-INDEX*", $sym38$FORT_ID_INDEX);
    $cfasl_opcode_fort_id_index$ = defconstant("*CFASL-OPCODE-FORT-ID-INDEX*", $int83$99);
    return NIL;
  }

  public static final SubLObject setup_forts_file() {
    // CVS_ID("Id: forts.lisp 128359 2009-07-20 17:32:34Z goolsbey ");
    utilities_macros.register_cyc_api_function($sym0$FORT_P, $list1, $str2$Return_T_iff_OBJECT_is_a_first_or, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym4$FORT_EL_FORMULA, $list5, $str6$Return_the_EL_formula_for_any_FOR, $list7, $list8);
    utilities_macros.register_cyc_api_macro($sym26$DO_FORTS, $list9, $str29$Iterate_over_all_HL_FORT_datastru);
    access_macros.register_macro_helper($sym30$DO_FORTS_TABLES, $sym26$DO_FORTS);
    utilities_macros.register_cyc_api_function($sym31$FORT_COUNT, NIL, $str32$Return_the_total_number_of_FORTs_, NIL, $list33);
    utilities_macros.register_cyc_api_function($sym35$REMOVE_FORT, $list5, $str36$Remove_FORT_from_the_KB_, $list7, $list37);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), Symbols.symbol_function($sym45$FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym46$FORT_ID_INDEX_CONSTANTS, $sym47$_CSETF_FORT_ID_INDEX_CONSTANTS);
    Structures.def_csetf($sym48$FORT_ID_INDEX_NARTS, $sym49$_CSETF_FORT_ID_INDEX_NARTS);
    Equality.identity($sym38$FORT_ID_INDEX);
    access_macros.register_macro_helper($sym71$DO_FORT_ID_INDEX_CONSTANTS, $sym73$DO_FORT_ID_INDEX);
    access_macros.register_macro_helper($sym77$DO_FII_GET_CONSTANTS, $sym71$DO_FORT_ID_INDEX_CONSTANTS);
    access_macros.register_macro_helper($sym72$DO_FORT_ID_INDEX_NARTS, $sym73$DO_FORT_ID_INDEX);
    access_macros.register_macro_helper($sym81$DO_FII_GET_NARTS, $sym72$DO_FORT_ID_INDEX_NARTS);
    cfasl.register_cfasl_input_function($cfasl_opcode_fort_id_index$.getGlobalValue(), $sym84$CFASL_INPUT_FORT_ID_INDEX);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), Symbols.symbol_function($sym85$CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FORT_P = makeSymbol("FORT-P");
  public static final SubLList $list1 = list(makeSymbol("OBJECT"));
  public static final SubLString $str2$Return_T_iff_OBJECT_is_a_first_or = makeString("Return T iff OBJECT is a first order reified term (FORT).");
  public static final SubLList $list3 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym4$FORT_EL_FORMULA = makeSymbol("FORT-EL-FORMULA");
  public static final SubLList $list5 = list(makeSymbol("FORT"));
  public static final SubLString $str6$Return_the_EL_formula_for_any_FOR = makeString("Return the EL formula for any FORT.");
  public static final SubLList $list7 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")));
  public static final SubLList $list8 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSP")));
  public static final SubLList $list9 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc FORTs")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str10$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");
  public static final SubLList $list11 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw12$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw13$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym14$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");
  public static final SubLSymbol $sym15$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLList $list16 = list(makeSymbol("DO-FORTS-TABLES"));
  public static final SubLSymbol $sym17$DO_KB_SUID_TABLE = makeSymbol("DO-KB-SUID-TABLE");
  public static final SubLSymbol $kw18$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym19$MESSAGE = makeUninternedSymbol("MESSAGE");
  public static final SubLSymbol $sym20$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLSymbol $sym21$SOFAR = makeUninternedSymbol("SOFAR");
  public static final SubLSymbol $sym22$CLET = makeSymbol("CLET");
  public static final SubLList $list23 = list(list(makeSymbol("FORT-COUNT")));
  public static final SubLList $list24 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym25$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym26$DO_FORTS = makeSymbol("DO-FORTS");
  public static final SubLSymbol $sym27$CINC = makeSymbol("CINC");
  public static final SubLSymbol $sym28$NOTE_PERCENT_PROGRESS = makeSymbol("NOTE-PERCENT-PROGRESS");
  public static final SubLString $str29$Iterate_over_all_HL_FORT_datastru = makeString("Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the FORT.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts as soon as DONE becomes non-nil.");
  public static final SubLSymbol $sym30$DO_FORTS_TABLES = makeSymbol("DO-FORTS-TABLES");
  public static final SubLSymbol $sym31$FORT_COUNT = makeSymbol("FORT-COUNT");
  public static final SubLString $str32$Return_the_total_number_of_FORTs_ = makeString("Return the total number of FORTs.");
  public static final SubLList $list33 = list(makeSymbol("INTEGERP"));
  public static final SubLString $str34$_S_was_not_a_FORT = makeString("~S was not a FORT");
  public static final SubLSymbol $sym35$REMOVE_FORT = makeSymbol("REMOVE-FORT");
  public static final SubLString $str36$Remove_FORT_from_the_KB_ = makeString("Remove FORT from the KB.");
  public static final SubLList $list37 = list(makeSymbol("NULL"));
  public static final SubLSymbol $sym38$FORT_ID_INDEX = makeSymbol("FORT-ID-INDEX");
  public static final SubLSymbol $sym39$FORT_ID_INDEX_P = makeSymbol("FORT-ID-INDEX-P");
  public static final SubLList $list40 = list(makeSymbol("CONSTANTS"), makeSymbol("NARTS"));
  public static final SubLList $list41 = list(makeKeyword("CONSTANTS"), makeKeyword("NARTS"));
  public static final SubLList $list42 = list(makeSymbol("FORT-ID-INDEX-CONSTANTS"), makeSymbol("FORT-ID-INDEX-NARTS"));
  public static final SubLList $list43 = list(makeSymbol("_CSETF-FORT-ID-INDEX-CONSTANTS"), makeSymbol("_CSETF-FORT-ID-INDEX-NARTS"));
  public static final SubLSymbol $sym44$PRINT_FORT_ID_INDEX = makeSymbol("PRINT-FORT-ID-INDEX");
  public static final SubLSymbol $sym45$FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym46$FORT_ID_INDEX_CONSTANTS = makeSymbol("FORT-ID-INDEX-CONSTANTS");
  public static final SubLSymbol $sym47$_CSETF_FORT_ID_INDEX_CONSTANTS = makeSymbol("_CSETF-FORT-ID-INDEX-CONSTANTS");
  public static final SubLSymbol $sym48$FORT_ID_INDEX_NARTS = makeSymbol("FORT-ID-INDEX-NARTS");
  public static final SubLSymbol $sym49$_CSETF_FORT_ID_INDEX_NARTS = makeSymbol("_CSETF-FORT-ID-INDEX-NARTS");
  public static final SubLSymbol $kw50$CONSTANTS = makeKeyword("CONSTANTS");
  public static final SubLSymbol $kw51$NARTS = makeKeyword("NARTS");
  public static final SubLString $str52$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str53$__ = makeString("#<");
  public static final SubLSymbol $kw54$STREAM = makeKeyword("STREAM");
  public static final SubLString $str55$Constant_Index_ = makeString("Constant Index:");
  public static final SubLString $str56$Nart_Index_ = makeString("Nart Index:");
  public static final SubLSymbol $kw57$BASE = makeKeyword("BASE");
  public static final SubLList $list58 = list(list(makeSymbol("ID-INDEX-VAR"), makeSymbol("ID-VAR"), makeSymbol("FORT"), makeSymbol("FORT-ID-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym59$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym60$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list61 = list(makeSymbol("FORT-P"));
  public static final SubLList $list62 = list(makeSymbol("FORT-ID-INDEX-P"));
  public static final SubLSymbol $sym63$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym64$VALID_FORT_ = makeSymbol("VALID-FORT?");
  public static final SubLSymbol $sym65$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym66$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym67$CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");
  public static final SubLSymbol $sym68$NART_ID = makeSymbol("NART-ID");
  public static final SubLList $list69 = list(list(makeSymbol("FORT"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym70$FII = makeUninternedSymbol("FII");
  public static final SubLSymbol $sym71$DO_FORT_ID_INDEX_CONSTANTS = makeSymbol("DO-FORT-ID-INDEX-CONSTANTS");
  public static final SubLSymbol $sym72$DO_FORT_ID_INDEX_NARTS = makeSymbol("DO-FORT-ID-INDEX-NARTS");
  public static final SubLSymbol $sym73$DO_FORT_ID_INDEX = makeSymbol("DO-FORT-ID-INDEX");
  public static final SubLList $list74 = list(list(makeSymbol("CONSTANT"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym75$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym76$DO_ID_INDEX = makeSymbol("DO-ID-INDEX");
  public static final SubLSymbol $sym77$DO_FII_GET_CONSTANTS = makeSymbol("DO-FII-GET-CONSTANTS");
  public static final SubLSymbol $sym78$FIND_CONSTANT_BY_INTERNAL_ID = makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
  public static final SubLList $list79 = list(list(makeSymbol("NART"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym80$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym81$DO_FII_GET_NARTS = makeSymbol("DO-FII-GET-NARTS");
  public static final SubLSymbol $sym82$FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");
  public static final SubLInteger $int83$99 = makeInteger(99);
  public static final SubLSymbol $sym84$CFASL_INPUT_FORT_ID_INDEX = makeSymbol("CFASL-INPUT-FORT-ID-INDEX");
  public static final SubLSymbol $sym85$CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD");
  public static final SubLSymbol $kw86$SKIP = makeKeyword("SKIP");
  public static final SubLString $str87$Checking_that_forts_iterators_wor = makeString("Checking that forts iterators work.");
  public static final SubLSymbol $kw88$EXHAUSTED = makeKeyword("EXHAUSTED");
  public static final SubLSymbol $sym89$_EXIT = makeSymbol("%EXIT");
  public static final SubLSymbol $kw90$ERROR = makeKeyword("ERROR");
  public static final SubLString $str91$FORTS_ITERATOR_exhausted_before_D = makeString("FORTS-ITERATOR exhausted before DO-FORTS");
  public static final SubLSymbol $kw92$INDEX = makeKeyword("INDEX");
  public static final SubLString $str93$FORTS_ITERATOR_returned_non_fort_ = makeString("FORTS-ITERATOR returned non-fort!");
  public static final SubLSymbol $kw94$CANDIDATE = makeKeyword("CANDIDATE");
  public static final SubLString $str95$FORTS_ITERATOR_and_DO_FORTS_diffe = makeString("FORTS-ITERATOR and DO-FORTS differ in which FORT they think is next");
  public static final SubLSymbol $kw96$FORT = makeKeyword("FORT");
  public static final SubLString $str97$The_FORTS_iterator_has_more_value = makeString("The FORTS iterator has more values than DO-FORTS.");

  //// Initializers

  public void declareFunctions() {
    declare_forts_file();
  }

  public void initializeVariables() {
    init_forts_file();
  }

  public void runTopLevelForms() {
    setup_forts_file();
  }

}
