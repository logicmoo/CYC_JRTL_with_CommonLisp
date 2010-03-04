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
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.variables;

public  final class unification extends SubLTranslatedFile {

  //// Constructor

  private unification() {}
  public static final SubLFile me = new unification();
  public static final String myName = "com.cyc.cycjava.cycl.unification";

  //// Definitions

  /** Temporary control variable; when non-nil, term variables (EL variables) are allowed
   to unify with other term variables. */
  @SubL(source = "cycl/unification.lisp", position = 544) 
  public static SubLSymbol $unify_term_variable_enabledP$ = null;

  @SubL(source = "cycl/unification.lisp", position = 841) 
  public static SubLSymbol $unify_possible_cons_function$ = null;

  @SubL(source = "cycl/unification.lisp", position = 907) 
  public static SubLSymbol $unify_cons_function$ = null;

  /** Do we want UNIFY to find all possible bindings sets, and not just the first?
@owner baxter */
  @SubL(source = "cycl/unification.lisp", position = 964) 
  public static SubLSymbol $unify_multipleP$ = null;

  /** Do we want to restrict UNIFY to only bind HL variables to other not-yet-bound HL variables
in the inverted variable space? */
  @SubL(source = "cycl/unification.lisp", position = 1107) 
  public static SubLSymbol $computing_variable_mapP$ = null;

  /** Do we return a justification for the bindings?
   @note Currently this only works if *unify-multiple?* is NIL. */
  @SubL(source = "cycl/unification.lisp", position = 1290) 
  public static SubLSymbol $unify_return_justificationP$ = null;

  /** A quick, necessary condition check for whether unification 
   between OBJ1 and OBJ2 could possibly succeed. */
  @SubL(source = "cycl/unification.lisp", position = 1584) 
  public static final SubLObject unify_possible(SubLObject obj1, SubLObject obj2) {
    return unify_possible_recursive(obj1, obj2);
  }

  /** Return T iff the objects OBJ1 and OBJ2 could possibly unify */
  @SubL(source = "cycl/unification.lisp", position = 2076) 
  public static final SubLObject unify_possible_recursive(SubLObject obj1, SubLObject obj2) {
    if (obj1.eql(obj2)) {
      return T;
    } else if ((NIL != variables.variable_p(obj1))) {
      return T;
    } else if ((NIL != variables.variable_p(obj2))) {
      return T;
    } else if (((NIL != term_variable_p(obj1))
         && (NIL != term_variable_p(obj2)))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31782");
    } else if ((NIL != forts.fort_p(obj1))) {
      return unify_possible_fort(obj1, obj2);
    } else if ((NIL != forts.fort_p(obj2))) {
      return unify_possible_fort(obj2, obj1);
    } else if ((obj1.isCons()
         && obj2.isCons())) {
      return unify_possible_cons(obj1, obj2);
    } else if ((obj1.isAtom()
         && obj2.isAtom())) {
      return unify_possible_atom(obj1, obj2);
    } else {
      return NIL;
    }
  }

  /** Return T iff fort FORT1 and OBJ2 could possibly unify */
  @SubL(source = "cycl/unification.lisp", position = 3223) 
  public static final SubLObject unify_possible_fort(SubLObject fort1, SubLObject obj2) {
    if ((NIL == obj2)) {
      return NIL;
    } else if ((NIL != constant_handles.constant_p(fort1))) {
      return unify_possible_constant(fort1, obj2);
    } else if ((NIL != constant_handles.constant_p(obj2))) {
      return unify_possible_constant(obj2, fort1);
    } else if (((NIL != variables.fully_bound_p(obj2))
         && (NIL != equals.equalsP(fort1, obj2, UNPROVIDED, UNPROVIDED)))) {
      return T;
    } else if (obj2.isCons()) {
      {
        SubLObject formula1 = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10416");
        return unify_possible_cons(formula1, obj2);
      }
    } else {
      return NIL;
    }
  }

  /** Return T iff constant CONSTANT1 and OBJ2 could possibly unify */
  @SubL(source = "cycl/unification.lisp", position = 3759) 
  public static final SubLObject unify_possible_constant(SubLObject constant1, SubLObject obj2) {
    return makeBoolean(((NIL != variables.fully_bound_p(obj2))
           && (NIL != equals.equalsP(constant1, obj2, UNPROVIDED, UNPROVIDED))));
  }

  /** Return T iff the conses CONS1 and CONS2 could possibly unify */
  @SubL(source = "cycl/unification.lisp", position = 3951) 
  public static final SubLObject unify_possible_cons(SubLObject cons1, SubLObject cons2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = $unify_possible_cons_function$.getDynamicValue(thread);
        if (pcase_var.eql($kw0$DEFAULT)) {
          return unify_possible_cons_default(cons1, cons2);
        } else {
          return Functions.funcall($unify_possible_cons_function$.getDynamicValue(thread), cons1, cons2);
        }
      }
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 4247) 
  public static final SubLObject unify_possible_cons_default(SubLObject cons1, SubLObject cons2) {
    return makeBoolean(((NIL != unify_possible_recursive(cons1.first(), cons2.first()))
           && (NIL != unify_possible_recursive(cons1.rest(), cons2.rest()))));
  }

  /** Return T iff the atoms ATOM1 and ATOM2 could possibly unify */
  @SubL(source = "cycl/unification.lisp", position = 4430) 
  public static final SubLObject unify_possible_atom(SubLObject atom1, SubLObject atom2) {
    return Equality.equal(atom1, atom2);
  }

  /** Compute the Most General Unifier between OBJ-TRANS and OBJ.
   If SHARE-VARS? is nil, then the HL variables in OBJ-TRANS and OBJ
   are assumed to be in different variable spaces, and the so ones in OBJ-TRANS
   are temporarily converted so as to uniquify all variables.
   If JUSTIFY? is non-nil, then a justification will be returned (if appropriate).
   @return NIL ; when unification fails
   @return unification-success-token-p ; when unification succeeds without bindings
   @return bindings-p ; when unification succeeds with bindings
   @return set-p of bindings-p ; when *UNIFY-MULTIPLE?* is non-NIL and we find more
   than one way to bind the variables. */
  @SubL(source = "cycl/unification.lisp", position = 4574) 
  public static final SubLObject unify(SubLObject obj_trans, SubLObject obj, SubLObject share_varsP, SubLObject justifyP) {
    if ((share_varsP == UNPROVIDED)) {
      share_varsP = NIL;
    }
    if ((justifyP == UNPROVIDED)) {
      justifyP = $unify_return_justificationP$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject v_bindings = unify_assuming_bindings(obj_trans, obj, share_varsP, NIL, justifyP);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(v_bindings, justifications);
      }
    }
  }

  /** Like @xref UNIFY, in which unification is done within the context of
   assume-bindings, which are pre-existing bindings to assume. */
  @SubL(source = "cycl/unification.lisp", position = 5788) 
  public static final SubLObject unify_assuming_bindings(SubLObject obj_trans, SubLObject obj, SubLObject share_varsP, SubLObject assume_bindings, SubLObject justifyP) {
    if ((share_varsP == UNPROVIDED)) {
      share_varsP = NIL;
    }
    if ((assume_bindings == UNPROVIDED)) {
      assume_bindings = NIL;
    }
    if ((justifyP == UNPROVIDED)) {
      justifyP = $unify_return_justificationP$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      inference_metrics.increment_unification_attempt_historical_count();
      if ((NIL != unify_possible(obj_trans, obj))) {
        if ((NIL == share_varsP)) {
          obj_trans = pre_unify_replace_variables(obj_trans);
        }
        {
          SubLObject result_bindings = NIL;
          SubLObject justification = NIL;
          SubLObject successP = NIL;
          {
            SubLObject _prev_bind_0 = $unify_return_justificationP$.currentBinding(thread);
            try {
              $unify_return_justificationP$.bind(justifyP, thread);
              thread.resetMultipleValues();
              {
                SubLObject result_bindings_1 = unify_internal(obj_trans, obj, assume_bindings);
                SubLObject justification_2 = thread.secondMultipleValue();
                SubLObject successP_3 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                result_bindings = result_bindings_1;
                justification = justification_2;
                successP = successP_3;
              }
            } finally {
              $unify_return_justificationP$.rebind(_prev_bind_0, thread);
            }
          }
          if ((NIL != successP)) {
            inference_metrics.increment_unification_success_historical_count();
            if ((NIL == result_bindings)) {
              return Values.values(bindings.unification_success_token(), justification);
            } else if ((NIL != set.set_p(result_bindings))) {
              {
                SubLObject new_set = set.new_set(Symbols.symbol_function(EQUAL), UNPROVIDED);
                SubLObject set_contents_var = set.do_set_internal(result_bindings);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                  {
                    SubLObject v_bindings = set_contents.do_set_contents_next(basis_object, state);
                    if ((NIL != set_contents.do_set_contents_element_validP(state, v_bindings))) {
                      checkType(v_bindings, $sym3$BINDINGS_P);
                      set.set_add(Sequences.nreverse(conses_high.copy_tree(v_bindings)), new_set);
                    }
                  }
                }
                return Values.values(new_set, justification);
              }
            } else {
              return Values.values(Sequences.nreverse(conses_high.copy_tree(result_bindings)), justification);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 7138) 
  public static final SubLObject unify_internal(SubLObject obj1, SubLObject obj2, SubLObject v_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result_bindings = NIL;
        SubLObject justification = NIL;
        SubLObject successP = NIL;
        SubLObject catch_var = NIL;
        try {
          thread.resetMultipleValues();
          {
            SubLObject result_bindings_4 = unify_recursive(obj1, obj2, v_bindings);
            SubLObject justification_5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result_bindings = result_bindings_4;
            justification = justification_5;
          }
          successP = T;
        } catch (Throwable ccatch_env_var) {
          catch_var = Errors.handleThrowable(ccatch_env_var, $kw4$UNIFY_FAILURE);
        }
        return Values.values(result_bindings, justification, successP);
      }
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 7657) 
  public static final SubLObject unify_recursive(SubLObject obj1, SubLObject obj2, SubLObject v_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $unify_multipleP$.getDynamicValue(thread))) {
        return unify_recursive_internal(obj1, obj2, v_bindings);
      } else if ((NIL != set.set_p(v_bindings))) {
        {
          SubLObject ans_bindings = NIL;
          SubLObject some_successP = NIL;
          SubLObject set_contents_var = set.do_set_internal(v_bindings);
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject one_bindings = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, one_bindings))) {
                thread.resetMultipleValues();
                {
                  SubLObject new_bindings = unify_internal(obj1, obj2, one_bindings);
                  SubLObject justification = thread.secondMultipleValue();
                  SubLObject successP = thread.thirdMultipleValue();
                  thread.resetMultipleValues();
                  if ((NIL != successP)) {
                    some_successP = T;
                    ans_bindings = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31767");
                  }
                }
              }
            }
          }
          if ((NIL != some_successP)) {
            return Values.values(ans_bindings, NIL);
          } else {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31773");
          }
        }
      } else {
        return unify_recursive_internal(obj1, obj2, v_bindings);
      }
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 9031) 
  public static final SubLObject unify_recursive_internal(SubLObject obj1, SubLObject obj2, SubLObject v_bindings) {
    if ((obj1 == obj2)) {
      return Values.values(v_bindings, NIL);
    } else if ((NIL != variables.variable_p(obj1))) {
      return unify_variable(obj1, obj2, v_bindings);
    } else if ((NIL != variables.variable_p(obj2))) {
      return unify_variable(obj2, obj1, v_bindings);
    } else if (((NIL != term_variable_p(obj1))
         && (NIL != term_variable_p(obj2)))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31783");
    } else if ((NIL != forts.fort_p(obj1))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31779");
    } else if ((NIL != forts.fort_p(obj2))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31780");
    } else if ((obj1.isCons()
         && obj2.isCons())) {
      return unify_cons(obj1, obj2, v_bindings);
    } else if ((obj1.isAtom()
         && obj2.isAtom())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31769");
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31774");
    }
  }

  /** Unify VARIABLE with OBJECT */
  @SubL(source = "cycl/unification.lisp", position = 9966) 
  public static final SubLObject unify_variable(SubLObject variable, SubLObject object, SubLObject v_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != bindings.variable_bound_p(variable, v_bindings))) {
        return unify_recursive(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31853"), object, v_bindings);
      } else if (((NIL != variables.variable_p(object))
           && (NIL != bindings.variable_bound_p(object, v_bindings)))) {
        return unify_variable(object, variable, v_bindings);
      } else if ((NIL != unification_occurs_check(variable, object, v_bindings))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31775");
      } else if (((NIL != $computing_variable_mapP$.getDynamicValue(thread))
           && ((NIL == variables.variable_p(object))
            || (makeBoolean((NIL == base_variable_p(variable))) == makeBoolean((NIL == base_variable_p(object))))))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31776");
      } else {
        return Values.values(bindings.add_variable_binding(variable, object, v_bindings), NIL);
      }
    }
  }

  /** Unify conses CONS1 and CONS2 assuming BINDINGS */
  @SubL(source = "cycl/unification.lisp", position = 12707) 
  public static final SubLObject unify_cons(SubLObject cons1, SubLObject cons2, SubLObject v_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = $unify_cons_function$.getDynamicValue(thread);
        if (pcase_var.eql($kw0$DEFAULT)) {
          return unify_cons_default(cons1, cons2, v_bindings);
        } else {
          return Functions.funcall($unify_cons_function$.getDynamicValue(thread), cons1, cons2, v_bindings);
        }
      }
    }
  }

  /** Unify conses CONS1 and CONS2 assuming BINDINGS */
  @SubL(source = "cycl/unification.lisp", position = 12980) 
  public static final SubLObject unify_cons_default(SubLObject cons1, SubLObject cons2, SubLObject v_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject car_bindings = unify_recursive(cons1.first(), cons2.first(), v_bindings);
        SubLObject car_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        {
          SubLObject full_bindings = unify_recursive(cons1.rest(), cons2.rest(), car_bindings);
          SubLObject cdr_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return Values.values(full_bindings, ConsesLow.append(car_justification, cdr_justification));
        }
      }
    }
  }

  /** Return T iff VARIABLE occurs in OBJECT according to BINDINGS */
  @SubL(source = "cycl/unification.lisp", position = 13801) 
  public static final SubLObject unification_occurs_check(SubLObject variable, SubLObject value, SubLObject v_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != control_vars.$perform_unification_occurs_check$.getDynamicValue(thread))) {
        return unification_occurs_check_recursive(variable, value, v_bindings);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 14116) 
  public static final SubLObject unification_occurs_check_recursive(SubLObject variable, SubLObject object, SubLObject v_bindings) {
    if ((variable == object)) {
      return T;
    } else if ((NIL == object)) {
      return NIL;
    } else if (object.isCons()) {
      {
        SubLObject cons = NIL;
        for (cons = object; (!(cons.isAtom())); cons = cons.rest()) {
          {
            SubLObject car = cons.first();
            if ((NIL != unification_occurs_check_recursive(variable, car, v_bindings))) {
              return T;
            }
          }
          {
            SubLObject cdr = cons.rest();
            if (((!(cdr.isList()))
                 && (NIL != unification_occurs_check_recursive(variable, cdr, v_bindings)))) {
              return T;
            }
          }
        }
      }
      return NIL;
    } else if (((NIL != variables.variable_p(object))
         && (NIL != bindings.variable_bound_p(object, v_bindings)))) {
      return unification_occurs_check_recursive(variable, Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31854"), v_bindings);
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 14825) 
  private static SubLSymbol $variable_base_max$ = null;

  @SubL(source = "cycl/unification.lisp", position = 15084) 
  public static final SubLObject base_variable_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != variables.variable_p(object))
             && variables.variable_id(object).numL($variable_base_max$.getDynamicValue(thread))));
    }
  }

  public static final class $base_variable_p$UnaryFunction extends UnaryFunction {
    public $base_variable_p$UnaryFunction() { super(extractFunctionNamed("BASE-VARIABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return base_variable_p(arg1); }
  }

  @SubL(source = "cycl/unification.lisp", position = 15215) 
  public static final SubLObject non_base_variable_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != variables.variable_p(object))
             && variables.variable_id(object).numGE($variable_base_max$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 15351) 
  public static final SubLObject variable_base_version(SubLObject variable) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(variable, $sym8$VARIABLE_P);
      return variables.find_variable_by_id(Numbers.mod(variables.variable_id(variable), $variable_base_max$.getDynamicValue(thread)));
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 15518) 
  public static final SubLObject variable_non_base_version(SubLObject variable) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(variable, $sym8$VARIABLE_P);
      return variables.find_variable_by_id(Numbers.add(Numbers.mod(variables.variable_id(variable), $variable_base_max$.getDynamicValue(thread)), $variable_base_max$.getDynamicValue(thread)));
    }
  }

  public static final class $variable_non_base_version$UnaryFunction extends UnaryFunction {
    public $variable_non_base_version$UnaryFunction() { super(extractFunctionNamed("VARIABLE-NON-BASE-VERSION")); }
    public SubLObject processItem(SubLObject arg1) { return variable_non_base_version(arg1); }
  }

  /** Convert base VARIABLE to its non-base form, or vice versa. */
  @SubL(source = "cycl/unification.lisp", position = 15723) 
  public static final SubLObject variable_base_inverted_version(SubLObject variable) {
    if ((NIL != base_variable_p(variable))) {
      return variable_non_base_version(variable);
    } else {
      return variable_base_version(variable);
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 15979) 
  public static final SubLObject non_base_variable_transform(SubLObject object) {
    return transform_list_utilities.transform(object, Symbols.symbol_function($sym9$BASE_VARIABLE_P), Symbols.symbol_function($sym10$VARIABLE_NON_BASE_VERSION), UNPROVIDED);
  }

  /** Convert all base variables in OBJECT to their non-base form, and vice versa. */
  @SubL(source = "cycl/unification.lisp", position = 16215) 
  public static final SubLObject variable_base_inversion(SubLObject object) {
    if ((NIL != variables.variable_p(object))) {
      return variable_base_inverted_version(object);
    } else {
      if (object.isAtom()) {
        return object;
      } else {
        return list_utilities.recons(variable_base_inversion(object.first()), variable_base_inversion(object.rest()), object);
      }
    }
  }

  @SubL(source = "cycl/unification.lisp", position = 16695) 
  public static final SubLObject pre_unify_replace_variables(SubLObject object) {
    return non_base_variable_transform(object);
  }

  @SubL(source = "cycl/unification.lisp", position = 16795) 
  public static final SubLObject term_variable_p(SubLObject object) {
    return cycl_variables.el_varP(object);
  }

  public static final SubLObject declare_unification_file() {
    declareMacro(myName, "with_unifier_justifications", "WITH-UNIFIER-JUSTIFICATIONS");
    declareFunction(myName, "unify_possible", "UNIFY-POSSIBLE", 2, 0, false);
    declareFunction(myName, "unify_impossible", "UNIFY-IMPOSSIBLE", 2, 0, false);
    declareFunction(myName, "unify_possible_recursive", "UNIFY-POSSIBLE-RECURSIVE", 2, 0, false);
    declareFunction(myName, "unify_possible_term_variable", "UNIFY-POSSIBLE-TERM-VARIABLE", 2, 0, false);
    declareFunction(myName, "unify_possible_fort", "UNIFY-POSSIBLE-FORT", 2, 0, false);
    declareFunction(myName, "unify_possible_constant", "UNIFY-POSSIBLE-CONSTANT", 2, 0, false);
    declareFunction(myName, "unify_possible_cons", "UNIFY-POSSIBLE-CONS", 2, 0, false);
    declareFunction(myName, "unify_possible_cons_default", "UNIFY-POSSIBLE-CONS-DEFAULT", 2, 0, false);
    declareFunction(myName, "unify_possible_atom", "UNIFY-POSSIBLE-ATOM", 2, 0, false);
    declareFunction(myName, "unify", "UNIFY", 2, 2, false);
    declareFunction(myName, "unify_assuming_bindings", "UNIFY-ASSUMING-BINDINGS", 2, 3, false);
    declareFunction(myName, "unify_internal", "UNIFY-INTERNAL", 3, 0, false);
    declareFunction(myName, "unify_failure", "UNIFY-FAILURE", 2, 0, false);
    declareFunction(myName, "unify_recursive", "UNIFY-RECURSIVE", 3, 0, false);
    declareFunction(myName, "add_bindings_to_answer", "ADD-BINDINGS-TO-ANSWER", 2, 0, false);
    declareFunction(myName, "unify_recursive_internal", "UNIFY-RECURSIVE-INTERNAL", 3, 0, false);
    declareFunction(myName, "unify_variable", "UNIFY-VARIABLE", 3, 0, false);
    declareFunction(myName, "unify_term_variable", "UNIFY-TERM-VARIABLE", 3, 0, false);
    declareFunction(myName, "unify_fort", "UNIFY-FORT", 3, 0, false);
    declareFunction(myName, "unify_constant", "UNIFY-CONSTANT", 3, 0, false);
    declareFunction(myName, "unify_cons", "UNIFY-CONS", 3, 0, false);
    declareFunction(myName, "unify_cons_default", "UNIFY-CONS-DEFAULT", 3, 0, false);
    declareFunction(myName, "unify_atom", "UNIFY-ATOM", 3, 0, false);
    declareFunction(myName, "unify_possibly_justify_equals", "UNIFY-POSSIBLY-JUSTIFY-EQUALS", 2, 0, false);
    declareFunction(myName, "unification_occurs_check", "UNIFICATION-OCCURS-CHECK", 3, 0, false);
    declareFunction(myName, "unification_occurs_check_recursive", "UNIFICATION-OCCURS-CHECK-RECURSIVE", 3, 0, false);
    declareFunction(myName, "too_many_hl_variables", "TOO-MANY-HL-VARIABLES", 1, 0, false);
    declareFunction(myName, "base_variable_p", "BASE-VARIABLE-P", 1, 0, false); new $base_variable_p$UnaryFunction();
    declareFunction(myName, "non_base_variable_p", "NON-BASE-VARIABLE-P", 1, 0, false);
    declareFunction(myName, "variable_base_version", "VARIABLE-BASE-VERSION", 1, 0, false);
    declareFunction(myName, "variable_non_base_version", "VARIABLE-NON-BASE-VERSION", 1, 0, false); new $variable_non_base_version$UnaryFunction();
    declareFunction(myName, "variable_base_inverted_version", "VARIABLE-BASE-INVERTED-VERSION", 1, 0, false);
    declareFunction(myName, "non_base_variable_transform", "NON-BASE-VARIABLE-TRANSFORM", 1, 0, false);
    declareFunction(myName, "base_variable_transform", "BASE-VARIABLE-TRANSFORM", 1, 0, false);
    declareFunction(myName, "variable_base_inversion", "VARIABLE-BASE-INVERSION", 1, 0, false);
    declareFunction(myName, "pre_unify_replace_variables", "PRE-UNIFY-REPLACE-VARIABLES", 1, 0, false);
    declareFunction(myName, "term_variable_p", "TERM-VARIABLE-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_unification_file() {
    $unify_term_variable_enabledP$ = defvar("*UNIFY-TERM-VARIABLE-ENABLED?*", T);
    $unify_possible_cons_function$ = defparameter("*UNIFY-POSSIBLE-CONS-FUNCTION*", $kw0$DEFAULT);
    $unify_cons_function$ = defparameter("*UNIFY-CONS-FUNCTION*", $kw0$DEFAULT);
    $unify_multipleP$ = defparameter("*UNIFY-MULTIPLE?*", NIL);
    $computing_variable_mapP$ = defparameter("*COMPUTING-VARIABLE-MAP?*", NIL);
    $unify_return_justificationP$ = defparameter("*UNIFY-RETURN-JUSTIFICATION?*", NIL);
    $variable_base_max$ = defparameter("*VARIABLE-BASE-MAX*", $int7$100);
    return NIL;
  }

  public static final SubLObject setup_unification_file() {
    // CVS_ID("Id: unification.lisp 128434 2009-07-28 22:05:56Z goolsbey ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLList $list2 = list(list(makeSymbol("*UNIFY-RETURN-JUSTIFICATION?*"), T));
  public static final SubLSymbol $sym3$BINDINGS_P = makeSymbol("BINDINGS-P");
  public static final SubLSymbol $kw4$UNIFY_FAILURE = makeKeyword("UNIFY-FAILURE");
  public static final SubLSymbol $kw5$EQUALITY = makeKeyword("EQUALITY");
  public static final SubLObject $const6$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLInteger $int7$100 = makeInteger(100);
  public static final SubLSymbol $sym8$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym9$BASE_VARIABLE_P = makeSymbol("BASE-VARIABLE-P");
  public static final SubLSymbol $sym10$VARIABLE_NON_BASE_VERSION = makeSymbol("VARIABLE-NON-BASE-VERSION");
  public static final SubLSymbol $sym11$NON_BASE_VARIABLE_P = makeSymbol("NON-BASE-VARIABLE-P");
  public static final SubLSymbol $sym12$VARIABLE_BASE_VERSION = makeSymbol("VARIABLE-BASE-VERSION");

  //// Initializers

  public void declareFunctions() {
    declare_unification_file();
  }

  public void initializeVariables() {
    init_unification_file();
  }

  public void runTopLevelForms() {
    setup_unification_file();
  }

}
