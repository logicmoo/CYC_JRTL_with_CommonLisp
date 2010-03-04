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
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equality_store;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.virtual_indexing;

public  final class equals extends SubLTranslatedFile {

  //// Constructor

  private equals() {}
  public static final SubLFile me = new equals();
  public static final String myName = "com.cyc.cycjava.cycl.equals";

  //// Definitions

  @SubL(source = "cycl/equals.lisp", position = 880) 
  public static final SubLObject equalsP(SubLObject obj1, SubLObject obj2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if (obj1.equal(obj2)) {
      return T;
    } else {
      if ((NIL != forts.fort_p(obj1))) {
        if ((NIL != forts.fort_p(obj2))) {
          return equal_fortsP(obj1, obj2, mt, tv);
        } else {
          return equal_fortP(obj1, obj2, mt, tv);
        }
      } else {
        if ((NIL != forts.fort_p(obj2))) {
          return equal_fortP(obj2, obj1, mt, tv);
        } else {
          return NIL;
        }
      }
    }
  }

  /** Check if FORT is equal to NON-FORT. */
  @SubL(source = "cycl/equals.lisp", position = 1611) 
  public static final SubLObject equal_fortP(SubLObject fort, SubLObject non_fort, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        if (((NIL != control_vars.$perform_equals_unification$.getDynamicValue(thread))
             && (NIL == cycl_grammar.meta_variable_p(non_fort))
             && (NIL != equality_store.some_equality_assertionsP(fort, UNPROVIDED)))) {
          ans = ghl_search_methods.gt_predicate_relation_p($const0$equals, fort, non_fort, mt, tv, UNPROVIDED);
        }
        return ans;
      }
    }
  }

  /** Check if FORT1 is equal to FORT2. */
  @SubL(source = "cycl/equals.lisp", position = 2084) 
  public static final SubLObject equal_fortsP(SubLObject fort1, SubLObject fort2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        if (((NIL != control_vars.$perform_equals_unification$.getDynamicValue(thread))
             && (NIL != equality_store.some_equality_assertions_somewhereP(fort1))
             && (NIL != equality_store.some_equality_assertions_somewhereP(fort2))
             && (NIL != equality_store.some_equality_assertionsP(fort1, UNPROVIDED))
             && (NIL != equality_store.some_equality_assertionsP(fort2, UNPROVIDED)))) {
          ans = ghl_search_methods.gt_predicate_relation_p($const0$equals, fort1, fort2, mt, tv, UNPROVIDED);
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/equals.lisp", position = 5420) 
  public static final SubLObject differentP(SubLObject objects, SubLObject unknown_value) {
    if ((unknown_value == UNPROVIDED)) {
      unknown_value = NIL;
    }
    {
      SubLObject result = T;
      SubLObject failureP = NIL;
      SubLObject object = NIL;
      SubLObject other_objects = NIL;
      for (object = objects.first(), other_objects = objects.rest(); (!(((NIL != failureP)
            || (NIL == other_objects)))); object = other_objects.first(), other_objects = other_objects.rest()) {
        if ((NIL == failureP)) {
          {
            SubLObject csome_list_var = other_objects;
            SubLObject other_object = NIL;
            for (other_object = csome_list_var.first(); (!(((NIL != failureP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), other_object = csome_list_var.first()) {
              {
                SubLObject different = differentP_binary(object, other_object, unknown_value);
                if ((different == unknown_value)) {
                  failureP = T;
                  result = unknown_value;
                } else if ((NIL == different)) {
                  failureP = T;
                  result = NIL;
                }
              }
            }
          }
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/equals.lisp", position = 6032) 
  public static final SubLObject differentP_binary(SubLObject obj1, SubLObject obj2, SubLObject unknown_value) {
    if ((unknown_value == UNPROVIDED)) {
      unknown_value = NIL;
    }
    if ((NIL != unification_utilities.term_unify(obj1, obj2, UNPROVIDED, UNPROVIDED))) {
      return NIL;
    } else if (((NIL != cycl_grammar.subl_strict_atomic_term_p(obj1))
         && (NIL != cycl_grammar.subl_strict_atomic_term_p(obj2)))) {
      return T;
    } else if (((NIL != unique_names_assumption_applicable_to_termP(obj1))
         && (NIL != unique_names_assumption_applicable_to_termP(obj2)))) {
      return T;
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29996"))) {
      return T;
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29998"))) {
      return T;
    } else {
      return unknown_value;
    }
  }

  @SubL(source = "cycl/equals.lisp", position = 8538) 
  public static final SubLObject why_different(SubLObject objects) {
    {
      SubLObject justification = NIL;
      SubLObject failureP = NIL;
      SubLObject object = NIL;
      SubLObject other_objects = NIL;
      for (object = objects.first(), other_objects = objects.rest(); (!(((NIL != failureP)
            || (NIL == other_objects)))); object = other_objects.first(), other_objects = other_objects.rest()) {
        if ((NIL == failureP)) {
          {
            SubLObject csome_list_var = other_objects;
            SubLObject other_object = NIL;
            for (other_object = csome_list_var.first(); (!(((NIL != failureP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), other_object = csome_list_var.first()) {
              {
                SubLObject binary_justification = why_different_binary(object, other_object);
                if ((NIL != binary_justification)) {
                  justification = ConsesLow.nconc(justification, binary_justification);
                } else {
                  justification = NIL;
                  failureP = T;
                }
              }
            }
          }
        }
      }
      return list_utilities.fast_delete_duplicates(justification, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/equals.lisp", position = 9115) 
  public static final SubLObject why_different_binary(SubLObject obj1, SubLObject obj2) {
    if ((NIL != unification_utilities.term_unify(obj1, obj2, UNPROVIDED, UNPROVIDED))) {
      return NIL;
    } else if (((NIL != cycl_grammar.subl_strict_atomic_term_p(obj1))
         && (NIL != cycl_grammar.subl_strict_atomic_term_p(obj2)))) {
      {
        SubLObject support = arguments.make_hl_support($kw9$OPAQUE, el_utilities.make_binary_formula($const6$different, obj1, obj2), UNPROVIDED, UNPROVIDED);
        return list(support);
      }
    } else if (((NIL != unique_names_assumption_applicable_to_termP(obj1))
         && (NIL != unique_names_assumption_applicable_to_termP(obj2)))) {
      {
        SubLObject support = arguments.make_hl_support($kw9$OPAQUE, el_utilities.make_binary_formula($const6$different, obj1, obj2), UNPROVIDED, UNPROVIDED);
        return list(support);
      }
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29997"))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30003");
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29999"))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30004");
    } else {
      return NIL;
    }
  }

  /** @return booleanp; whether the Unique Names Assumption applies to TERM */
  @SubL(source = "cycl/equals.lisp", position = 11487) 
  public static final SubLObject unique_names_assumption_applicable_to_termP(SubLObject v_term) {
    if ((NIL != constant_handles.valid_constantP($const14$TermExemptFromUniqueNamesAssumpti, UNPROVIDED))) {
      return makeBoolean((NIL == Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7013")));
    } else {
      return makeBoolean((NIL == inference_trampolines.inference_indeterminate_termP(v_term)));
    }
  }

  /** @return booleanp; t iff the UNA is applicable to all arguments of FORMULA. */
  @SubL(source = "cycl/equals.lisp", position = 11901) 
  public static final SubLObject unique_names_assumption_applicable_to_all_argsP(SubLObject formula) {
    {
      SubLObject failureP = NIL;
      SubLObject args = cycl_utilities.formula_args(formula, $kw15$IGNORE);
      SubLObject rest = NIL;
      for (rest = args; (!(((NIL != failureP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject arg = rest.first();
          if ((NIL == unique_names_assumption_applicable_to_termP(arg))) {
            failureP = T;
          }
        }
      }
      return makeBoolean((NIL == failureP));
    }
  }

  /** @return booleanp; t iff the UNA is applicable to all arguments of FORMULA except the ARGNUMth argument.
   The UNA may or may not be applicable to the ARGNUMth argument; this function is agnostic. */
  @SubL(source = "cycl/equals.lisp", position = 12238) 
  public static final SubLObject unique_names_assumption_applicable_to_all_args_exceptP(SubLObject formula, SubLObject argnum) {
    {
      SubLObject failureP = NIL;
      SubLObject n = ZERO_INTEGER;
      SubLObject args = cycl_utilities.formula_args(formula, $kw15$IGNORE);
      SubLObject rest = NIL;
      for (rest = args; (!(((NIL != failureP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject arg = rest.first();
          n = Numbers.add(n, ONE_INTEGER);
          if ((!((n.eql(argnum)
                || (NIL != unique_names_assumption_applicable_to_termP(arg)))))) {
            failureP = T;
          }
        }
      }
      return makeBoolean((NIL == failureP));
    }
  }

  public static final SubLObject declare_equals_file() {
    declareFunction(myName, "all_equals", "ALL-EQUALS", 1, 2, false);
    declareFunction(myName, "equalsP", "EQUALS?", 2, 2, false);
    declareFunction(myName, "why_equals", "WHY-EQUALS", 2, 2, false);
    declareFunction(myName, "equal_fortP", "EQUAL-FORT?", 2, 2, false);
    declareFunction(myName, "equal_fortsP", "EQUAL-FORTS?", 2, 2, false);
    declareFunction(myName, "max_floor_mts_where_equals", "MAX-FLOOR-MTS-WHERE-EQUALS", 2, 0, false);
    declareFunction(myName, "max_floor_mts_where_equals_fort", "MAX-FLOOR-MTS-WHERE-EQUALS-FORT", 2, 0, false);
    declareFunction(myName, "max_floor_mts_where_equals_non_forts", "MAX-FLOOR-MTS-WHERE-EQUALS-NON-FORTS", 2, 0, false);
    declareFunction(myName, "equal_everywhereP", "EQUAL-EVERYWHERE?", 2, 0, false);
    declareFunction(myName, "equal_somewhereP", "EQUAL-SOMEWHERE?", 2, 0, false);
    declareFunction(myName, "direct_rewrite_ofP", "DIRECT-REWRITE-OF?", 2, 1, false);
    declareFunction(myName, "any_direct_rewrite_ofP", "ANY-DIRECT-REWRITE-OF?", 2, 1, false);
    declareFunction(myName, "simplest_forts_wrt_rewrite", "SIMPLEST-FORTS-WRT-REWRITE", 1, 1, false);
    declareFunction(myName, "differentP", "DIFFERENT?", 1, 1, false);
    declareFunction(myName, "differentP_binary", "DIFFERENT?-BINARY", 2, 1, false);
    declareFunction(myName, "asserted_differentP", "ASSERTED-DIFFERENT?", 2, 0, false);
    declareFunction(myName, "find_different_assertion", "FIND-DIFFERENT-ASSERTION", 2, 0, false);
    declareFunction(myName, "different_by_disjointnessP", "DIFFERENT-BY-DISJOINTNESS?", 2, 0, false);
    declareFunction(myName, "different_by_disjointnessP_rep_unrep", "DIFFERENT-BY-DISJOINTNESS?-REP-UNREP", 2, 0, false);
    declareFunction(myName, "why_different", "WHY-DIFFERENT", 1, 0, false);
    declareFunction(myName, "why_different_binary", "WHY-DIFFERENT-BINARY", 2, 0, false);
    declareFunction(myName, "why_asserted_different", "WHY-ASSERTED-DIFFERENT", 2, 0, false);
    declareFunction(myName, "why_different_by_disjointness", "WHY-DIFFERENT-BY-DISJOINTNESS", 2, 0, false);
    declareFunction(myName, "why_different_by_disjointness_rep_unrep", "WHY-DIFFERENT-BY-DISJOINTNESS-REP-UNREP", 2, 0, false);
    declareFunction(myName, "unique_names_assumption_applicable_to_termP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-TERM?", 1, 0, false);
    declareFunction(myName, "unique_names_assumption_applicable_to_all_argsP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-ALL-ARGS?", 1, 0, false);
    declareFunction(myName, "unique_names_assumption_applicable_to_all_args_exceptP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-ALL-ARGS-EXCEPT?", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_equals_file() {
    return NIL;
  }

  public static final SubLObject setup_equals_file() {
    // CVS_ID("Id: equals.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLSymbol $kw1$REFLEXIVE = makeKeyword("REFLEXIVE");
  public static final SubLObject $const2$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLObject $const3$rewriteOf = constant_handles.reader_make_constant_shell(makeString("rewriteOf"));
  public static final SubLSymbol $sym4$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym5$FORT_P = makeSymbol("FORT-P");
  public static final SubLObject $const6$different = constant_handles.reader_make_constant_shell(makeString("different"));
  public static final SubLSymbol $kw7$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw8$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw9$OPAQUE = makeKeyword("OPAQUE");
  public static final SubLSymbol $kw10$ISA = makeKeyword("ISA");
  public static final SubLObject $const11$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw12$DISJOINTWITH = makeKeyword("DISJOINTWITH");
  public static final SubLObject $const13$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLObject $const14$TermExemptFromUniqueNamesAssumpti = constant_handles.reader_make_constant_shell(makeString("TermExemptFromUniqueNamesAssumption"));
  public static final SubLSymbol $kw15$IGNORE = makeKeyword("IGNORE");

  //// Initializers

  public void declareFunctions() {
    declare_equals_file();
  }

  public void initializeVariables() {
    init_equals_file();
  }

  public void runTopLevelForms() {
    setup_equals_file();
  }

}
