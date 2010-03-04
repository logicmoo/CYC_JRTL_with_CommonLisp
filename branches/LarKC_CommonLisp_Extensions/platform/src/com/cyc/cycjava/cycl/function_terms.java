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
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.term;

public  final class function_terms extends SubLTranslatedFile {

  //// Constructor

  private function_terms() {}
  public static final SubLFile me = new function_terms();
  public static final String myName = "com.cyc.cycjava.cycl.function_terms";

  //// Definitions

  @SubL(source = "cycl/function-terms.lisp", position = 1014) 
  public static final SubLObject term_of_unit_assertion_p(SubLObject object) {
    if ((NIL != assertions_high.gaf_assertionP(object))) {
      return Equality.eq($const3$termOfUnit, assertions_high.gaf_predicate(object));
    }
    return NIL;
  }


  /** Return T iff OBJECT could be interpreted as a nat formula */
  @SubL(source = "cycl/function-terms.lisp", position = 4672) 
  public static final SubLObject nat_formula_p(SubLObject object) {
    return el_utilities.possibly_naut_p(object);
  }

  
  /** obsolete */
  @SubL(source = "cycl/function-terms.lisp", position = 1150) 
  public static final SubLObject tou_assertionP(SubLObject assertion) {
    return term_of_unit_assertion_p(assertion);
  }

  /** Return the maximum functional nesting depth of OBJECT. */
  @SubL(source = "cycl/function-terms.lisp", position = 1245) 
  public static final SubLObject term_functional_complexity(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym5$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const6$EverythingPSC, thread);
            ans = term_functional_complexity_internal(object);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/function-terms.lisp", position = 1871) 
  public static SubLSymbol $term_functional_complexity_internal_method_table$ = null;

  @SubL(source = "cycl/function-terms.lisp", position = 1871) 
  public static final SubLObject term_functional_complexity_internal(SubLObject object) {
    {
      SubLObject method_function = Structures.method_func(object, $term_functional_complexity_internal_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, object);
      }
      return ZERO_INTEGER;
    }
  }

  @SubL(source = "cycl/function-terms.lisp", position = 1962) 
  public static final SubLObject term_functional_complexity_internal_constant_method(SubLObject object) {
    return ZERO_INTEGER;
  }

  @SubL(source = "cycl/function-terms.lisp", position = 2063) 
  public static final SubLObject term_functional_complexity_internal_nart_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10746");
  }

  /** Fancy way of returning max term functional complexity within a NART. */
  @SubL(source = "cycl/function-terms.lisp", position = 2298) 
  public static final SubLObject term_functional_complexity_internal_cons_method(SubLObject object) {
    {
      SubLObject datum = object;
      SubLObject current = datum;
      SubLObject function = NIL;
      SubLObject args = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
      function = current.first();
      current = current.rest();
      args = current;
      if (((NIL != forts.fort_p(function))
           && (NIL == fort_types_interface.non_predicate_functionP(function)))) {
        return ZERO_INTEGER;
      } else {
        {
          SubLObject arg_max_complexity = term_functional_complexity_internal(function);
          SubLObject cdolist_list_var = args;
          SubLObject arg = NIL;
          for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
            {
              SubLObject arg_complexity = term_functional_complexity_internal(arg);
              arg_max_complexity = Numbers.max(arg_max_complexity, arg_complexity);
            }
          }
          return Numbers.add(arg_max_complexity, ONE_INTEGER);
        }
      }
    }
  }

  @SubL(source = "cycl/function-terms.lisp", position = 3843) 
  public static SubLSymbol $term_relational_complexity_internal_method_table$ = null;

  @SubL(source = "cycl/function-terms.lisp", position = 3934) 
  public static final SubLObject term_relational_complexity_internal_constant_method(SubLObject object) {
    return ZERO_INTEGER;
  }

  @SubL(source = "cycl/function-terms.lisp", position = 4035) 
  public static final SubLObject term_relational_complexity_internal_nart_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10766");
  }

  @SubL(source = "cycl/function-terms.lisp", position = 4270) 
  public static final SubLObject term_relational_complexity_internal_cons_method(SubLObject object) {
    {
      SubLObject datum = object;
      SubLObject current = datum;
      SubLObject relation = NIL;
      SubLObject args = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
      relation = current.first();
      current = current.rest();
      args = current;
      {
        SubLObject arg_max_complexity = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10764");
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
          {
            SubLObject arg_complexity = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10765");
            arg_max_complexity = Numbers.max(arg_max_complexity, arg_complexity);
          }
        }
        return Numbers.add(arg_max_complexity, ONE_INTEGER);
      }
    }
  }

  /** If OBJ is a ground NAUT (EL nat), convert it to an HL nart and return it,
   else return OBJ. */
  @SubL(source = "cycl/function-terms.lisp", position = 5915) 
  public static final SubLObject naut_to_nart(SubLObject obj) {
    if ((NIL != el_utilities.possibly_naut_p(obj))) {
      {
        SubLObject nart = narts_high.find_nart(obj);
        return ((NIL != nart) ? ((SubLObject) nart) : obj);
      }
    } else {
      return obj;
    }
  }

  public static final SubLObject declare_function_terms_file() {
    //declareFunction(myName, "term_of_unit", "TERM-OF-UNIT", 1, 0, false);
    //declareFunction(myName, "term_of_unit_assertion", "TERM-OF-UNIT-ASSERTION", 1, 0, false);
    //declareFunction(myName, "nart_hl_formula_via_term_of_unit_assertion", "NART-HL-FORMULA-VIA-TERM-OF-UNIT-ASSERTION", 1, 0, false);
    declareFunction(myName, "term_of_unit_assertion_p", "TERM-OF-UNIT-ASSERTION-P", 1, 0, false);
    declareFunction(myName, "tou_assertionP", "TOU-ASSERTION?", 1, 0, false);
    declareFunction(myName, "term_functional_complexity", "TERM-FUNCTIONAL-COMPLEXITY", 1, 0, false);
    //declareFunction(myName, "within_term_functional_complexity_cutoffP", "WITHIN-TERM-FUNCTIONAL-COMPLEXITY-CUTOFF?", 1, 0, false);
    declareFunction(myName, "term_functional_complexity_internal", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL", 1, 0, false);
    declareFunction(myName, "term_functional_complexity_internal_constant_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD", 1, 0, false);
    declareFunction(myName, "term_functional_complexity_internal_nart_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-NART-METHOD", 1, 0, false);
    //declareFunction(myName, "term_functional_complexity_nart", "TERM-FUNCTIONAL-COMPLEXITY-NART", 1, 0, false);
    declareFunction(myName, "term_functional_complexity_internal_cons_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONS-METHOD", 1, 0, false);
    //declareFunction(myName, "term_relational_complexity", "TERM-RELATIONAL-COMPLEXITY", 1, 0, false);
    //declareFunction(myName, "within_term_relational_complexity_cutoffP", "WITHIN-TERM-RELATIONAL-COMPLEXITY-CUTOFF?", 1, 0, false);
    //declareFunction(myName, "relational_complexity_L", "RELATIONAL-COMPLEXITY-<", 2, 0, false);
    //declareFunction(myName, "term_relational_complexity_internal", "TERM-RELATIONAL-COMPLEXITY-INTERNAL", 1, 0, false);
    declareFunction(myName, "term_relational_complexity_internal_constant_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD", 1, 0, false);
    declareFunction(myName, "term_relational_complexity_internal_nart_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-NART-METHOD", 1, 0, false);
    //declareFunction(myName, "term_relational_complexity_nart", "TERM-RELATIONAL-COMPLEXITY-NART", 1, 0, false);
    declareFunction(myName, "term_relational_complexity_internal_cons_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONS-METHOD", 1, 0, false);
    //declareFunction(myName, "nat_formula_p", "NAT-FORMULA-P", 1, 0, false);
    //declareFunction(myName, "narts_of_function", "NARTS-OF-FUNCTION", 1, 0, false);
    //declareFunction(myName, "narts_of_term", "NARTS-OF-TERM", 2, 1, false);
    //declareFunction(myName, "unnatify_terms", "UNNATIFY-TERMS", 1, 0, false);
    declareFunction(myName, "naut_to_nart", "NAUT-TO-NART", 1, 0, false);
    //declareFunction(myName, "nart_to_naut", "NART-TO-NAUT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_function_terms_file() {
    $term_functional_complexity_internal_method_table$ = deflexical("*TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*", Vectors.make_vector($int7$256, NIL));
    $term_relational_complexity_internal_method_table$ = deflexical("*TERM-RELATIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*", Vectors.make_vector($int7$256, NIL));
    return NIL;
  }

  public static final SubLObject setup_function_terms_file() {
    // CVS_ID("Id: function-terms.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.define_obsolete_register($sym0$TERM_OF_UNIT, NIL);
    Structures.register_method($term_functional_complexity_internal_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function($sym8$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD));
    Structures.register_method($term_functional_complexity_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function($sym9$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD));
    Structures.register_method($term_functional_complexity_internal_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function($sym11$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD));
    Structures.register_method($term_relational_complexity_internal_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function($sym12$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD));
    Structures.register_method($term_relational_complexity_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function($sym13$TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD));
    Structures.register_method($term_relational_complexity_internal_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function($sym15$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TERM_OF_UNIT = makeSymbol("TERM-OF-UNIT");
  public static final SubLSymbol $sym1$NART_P = makeSymbol("NART-P");
  public static final SubLSymbol $sym2$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLObject $const3$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $kw4$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym5$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const6$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLInteger $int7$256 = makeInteger(256);
  public static final SubLSymbol $sym8$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD");
  public static final SubLSymbol $sym9$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-NART-METHOD");
  public static final SubLList $list10 = cons(makeSymbol("FUNCTION"), makeSymbol("ARGS"));
  public static final SubLSymbol $sym11$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONS-METHOD");
  public static final SubLSymbol $sym12$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD = makeSymbol("TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD");
  public static final SubLSymbol $sym13$TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD = makeSymbol("TERM-RELATIONAL-COMPLEXITY-INTERNAL-NART-METHOD");
  public static final SubLList $list14 = cons(makeSymbol("RELATION"), makeSymbol("ARGS"));
  public static final SubLSymbol $sym15$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD = makeSymbol("TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONS-METHOD");
  public static final SubLSymbol $sym16$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym17$INTEGERP = makeSymbol("INTEGERP");

  //// Initializers

  public void declareFunctions() {
    declare_function_terms_file();
  }

  public void initializeVariables() {
    init_function_terms_file();
  }

  public void runTopLevelForms() {
    setup_function_terms_file();
  }

}
