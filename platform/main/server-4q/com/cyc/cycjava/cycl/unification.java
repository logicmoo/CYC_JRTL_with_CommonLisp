package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$perform_unification_occurs_check$;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class unification extends SubLTranslatedFile {
    public static final SubLFile me = new unification();

    public static final String myName = "com.cyc.cycjava.cycl.unification";

    public static final String myFingerPrint = "281a0a2414500e81a21d7cf3192908c5e306d1c9e424872abe9b6db1476891ee";

    // defvar
    public static final SubLSymbol $unify_term_variable_enabledP$ = makeSymbol("*UNIFY-TERM-VARIABLE-ENABLED?*");

    // defparameter
    public static final SubLSymbol $unify_possible_cons_function$ = makeSymbol("*UNIFY-POSSIBLE-CONS-FUNCTION*");

    // defparameter
    public static final SubLSymbol $unify_cons_function$ = makeSymbol("*UNIFY-CONS-FUNCTION*");

    // defparameter
    /**
     * Do we want UNIFY to find all possible bindings sets, and not just the first?
     *
     * @unknown baxter
     */
    public static final SubLSymbol $unify_multipleP$ = makeSymbol("*UNIFY-MULTIPLE?*");

    // defparameter
    /**
     * Do we want to restrict UNIFY to only bind HL variables to other not-yet-bound
     * HL variables in the inverted variable space?
     */
    public static final SubLSymbol $computing_variable_mapP$ = makeSymbol("*COMPUTING-VARIABLE-MAP?*");

    // defparameter
    /**
     * Do we return a justification for the bindings?
     *
     * @unknown Currently this only works if *unify-multiple?* is NIL.
     */
    public static final SubLSymbol $unify_return_justificationP$ = makeSymbol("*UNIFY-RETURN-JUSTIFICATION?*");

    // defparameter
    public static final SubLSymbol $unify_narts_with_hl_formulasP$ = makeSymbol("*UNIFY-NARTS-WITH-HL-FORMULAS?*");

    // defparameter
    private static final SubLSymbol $variable_base_max$ = makeSymbol("*VARIABLE-BASE-MAX*");





    public static final SubLList $list2 = list(list(makeSymbol("*UNIFY-RETURN-JUSTIFICATION?*"), T));

    public static final SubLSymbol BINDINGS_P = makeSymbol("BINDINGS-P");





    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));





    public static final SubLSymbol BASE_VARIABLE_P = makeSymbol("BASE-VARIABLE-P");

    public static final SubLSymbol VARIABLE_NON_BASE_VERSION = makeSymbol("VARIABLE-NON-BASE-VERSION");

    public static final SubLSymbol NON_BASE_VARIABLE_P = makeSymbol("NON-BASE-VARIABLE-P");

    public static final SubLSymbol VARIABLE_BASE_VERSION = makeSymbol("VARIABLE-BASE-VERSION");

    public static SubLObject with_unifier_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    public static SubLObject unify_possible(final SubLObject obj1, final SubLObject obj2) {
        return unify_possible_recursive(obj1, obj2);
    }

    public static SubLObject unify_impossible(final SubLObject obj1, final SubLObject obj2) {
        return makeBoolean(NIL == unify_possible_recursive(obj1, obj2));
    }

    public static SubLObject unify_possible_recursive(final SubLObject obj1, final SubLObject obj2) {
        if (obj1.eql(obj2)) {
            return T;
        }
        if (NIL != variables.variable_p(obj1)) {
            return T;
        }
        if (NIL != variables.variable_p(obj2)) {
            return T;
        }
        if ((NIL != term_variable_p(obj1)) && (NIL != term_variable_p(obj2))) {
            return unify_possible_term_variable(obj1, obj2);
        }
        if (NIL != forts.fort_p(obj1)) {
            return unify_possible_fort(obj1, obj2);
        }
        if (NIL != forts.fort_p(obj2)) {
            return unify_possible_fort(obj2, obj1);
        }
        if (obj1.isCons() && obj2.isCons()) {
            return unify_possible_cons(obj1, obj2);
        }
        if (obj1.isAtom() && obj2.isAtom()) {
            return unify_possible_atom(obj1, obj2);
        }
        return NIL;
    }

    public static SubLObject unify_possible_term_variable(final SubLObject term_variable1, final SubLObject term_variable2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $unify_term_variable_enabledP$.getDynamicValue(thread)) {
            return unify_possible_atom(term_variable1, term_variable2);
        }
        return T;
    }

    public static SubLObject unify_possible_fort(final SubLObject fort1, final SubLObject obj2) {
        if (NIL == obj2) {
            return NIL;
        }
        if (NIL != constant_p(fort1)) {
            return unify_possible_constant(fort1, obj2);
        }
        if (NIL != constant_p(obj2)) {
            return unify_possible_constant(obj2, fort1);
        }
        if ((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(fort1, obj2, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if (obj2.isCons()) {
            final SubLObject formula1 = narts_high.nart_hl_formula(fort1);
            return unify_possible_cons(formula1, obj2);
        }
        return NIL;
    }

    public static SubLObject unify_possible_constant(final SubLObject constant1, final SubLObject obj2) {
        return makeBoolean((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(constant1, obj2, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject unify_possible_cons(final SubLObject cons1, final SubLObject cons2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $unify_possible_cons_function$.getDynamicValue(thread);
        if (pcase_var.eql($DEFAULT)) {
            return unify_possible_cons_default(cons1, cons2);
        }
        return funcall($unify_possible_cons_function$.getDynamicValue(thread), cons1, cons2);
    }

    public static SubLObject unify_possible_cons_default(final SubLObject cons1, final SubLObject cons2) {
        return makeBoolean((NIL != unify_possible_recursive(cons1.first(), cons2.first())) && (NIL != unify_possible_recursive(cons1.rest(), cons2.rest())));
    }

    public static SubLObject unify_possible_atom(final SubLObject atom1, final SubLObject atom2) {
        if (atom1.isNumber() && atom2.isNumber()) {
            return arithmetic.cyc_numerically_equal(atom1, atom2);
        }
        return equal(atom1, atom2);
    }

    public static SubLObject unify(final SubLObject obj_trans, final SubLObject obj, SubLObject share_varsP, SubLObject justifyP) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = $unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unify_assuming_bindings(obj_trans, obj, share_varsP, NIL, justifyP);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2(v_bindings, justifications);
    }

    public static SubLObject unify_assuming_bindings(SubLObject obj_trans, final SubLObject obj, SubLObject share_varsP, SubLObject assume_bindings, SubLObject justifyP) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = $unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_metrics.increment_unification_attempt_historical_count();
        if (NIL != unify_possible(obj_trans, obj)) {
            if (NIL == share_varsP) {
                obj_trans = pre_unify_replace_variables(obj_trans);
            }
            SubLObject result_bindings = NIL;
            SubLObject justification = NIL;
            SubLObject successP = NIL;
            final SubLObject _prev_bind_0 = $unify_return_justificationP$.currentBinding(thread);
            try {
                $unify_return_justificationP$.bind(justifyP, thread);
                thread.resetMultipleValues();
                final SubLObject result_bindings_$1 = unify_internal(obj_trans, obj, assume_bindings);
                final SubLObject justification_$2 = thread.secondMultipleValue();
                final SubLObject successP_$3 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                result_bindings = result_bindings_$1;
                justification = justification_$2;
                successP = successP_$3;
            } finally {
                $unify_return_justificationP$.rebind(_prev_bind_0, thread);
            }
            if (NIL != successP) {
                inference_metrics.increment_unification_success_historical_count();
                if (NIL == result_bindings) {
                    return subl_promotions.values2(bindings.unification_success_token(), justification);
                }
                if (NIL != set.set_p(result_bindings)) {
                    final SubLObject new_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                    final SubLObject set_contents_var = set.do_set_internal(result_bindings);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject v_bindings;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        v_bindings = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, v_bindings)) {
                            assert NIL != bindings.bindings_p(v_bindings) : "bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) " + v_bindings;
                            set.set_add(nreverse(copy_tree(v_bindings)), new_set);
                        }
                    }
                    return subl_promotions.values2(new_set, justification);
                }
                return subl_promotions.values2(nreverse(copy_tree(result_bindings)), justification);
            }
        }
        return subl_promotions.values2(NIL, NIL);
    }

    public static SubLObject unify_internal(final SubLObject obj1, final SubLObject obj2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_bindings = NIL;
        SubLObject justification = NIL;
        SubLObject successP = NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($UNIFY_FAILURE);
            thread.resetMultipleValues();
            final SubLObject result_bindings_$4 = unify_recursive(obj1, obj2, v_bindings);
            final SubLObject justification_$5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result_bindings = result_bindings_$4;
            justification = justification_$5;
            successP = T;
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $UNIFY_FAILURE);
        } finally {
            thread.throwStack.pop();
        }
        return subl_promotions.values3(result_bindings, justification, successP);
    }

    public static SubLObject unify_failure(final SubLObject obj1, final SubLObject obj2) {
        return sublisp_throw($UNIFY_FAILURE, NIL);
    }

    public static SubLObject unify_recursive(final SubLObject obj1, final SubLObject obj2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $unify_multipleP$.getDynamicValue(thread)) {
            return unify_recursive_internal(obj1, obj2, v_bindings);
        }
        if (NIL == set.set_p(v_bindings)) {
            return unify_recursive_internal(obj1, obj2, v_bindings);
        }
        SubLObject ans_bindings = NIL;
        SubLObject some_successP = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_bindings);
        SubLObject basis_object;
        SubLObject state;
        SubLObject one_bindings;
        SubLObject new_bindings;
        SubLObject justification;
        SubLObject successP;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            one_bindings = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, one_bindings)) {
                thread.resetMultipleValues();
                new_bindings = unify_internal(obj1, obj2, one_bindings);
                justification = thread.secondMultipleValue();
                successP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != successP) {
                    some_successP = T;
                    ans_bindings = add_bindings_to_answer(new_bindings, ans_bindings);
                }
            }
        }
        if (NIL != some_successP) {
            return subl_promotions.values2(ans_bindings, NIL);
        }
        return unify_failure(obj1, obj2);
    }

    public static SubLObject add_bindings_to_answer(final SubLObject new_bindings, SubLObject v_answer) {
        if (NIL != set.set_p(new_bindings)) {
            final SubLObject set_contents_var = set.do_set_internal(new_bindings);
            SubLObject basis_object;
            SubLObject state;
            SubLObject one_new_bindings;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                one_new_bindings = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, one_new_bindings)) {
                    assert NIL != bindings.bindings_p(one_new_bindings) : "bindings.bindings_p(one_new_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(one_new_bindings) " + one_new_bindings;
                    v_answer = add_bindings_to_answer(one_new_bindings, v_answer);
                }
            }
        } else
            if (NIL == v_answer) {
                v_answer = new_bindings;
            } else
                if (NIL != set.set_p(v_answer)) {
                    set.set_add(new_bindings, v_answer);
                } else {
                    v_answer = set_utilities.new_singleton_set(v_answer, symbol_function(EQUAL));
                    set.set_add(new_bindings, v_answer);
                }


        return v_answer;
    }

    public static SubLObject unify_recursive_internal(final SubLObject obj1, final SubLObject obj2, final SubLObject v_bindings) {
        if (obj1.eql(obj2)) {
            return subl_promotions.values2(v_bindings, NIL);
        }
        if (NIL != variables.variable_p(obj1)) {
            return unify_variable(obj1, obj2, v_bindings);
        }
        if (NIL != variables.variable_p(obj2)) {
            return unify_variable(obj2, obj1, v_bindings);
        }
        if ((NIL != term_variable_p(obj1)) && (NIL != term_variable_p(obj2))) {
            return unify_term_variable(obj1, obj2, v_bindings);
        }
        if (NIL != forts.fort_p(obj1)) {
            return unify_fort(obj1, obj2, v_bindings);
        }
        if (NIL != forts.fort_p(obj2)) {
            return unify_fort(obj2, obj1, v_bindings);
        }
        if (obj1.isCons() && obj2.isCons()) {
            return unify_cons(obj1, obj2, v_bindings);
        }
        if (obj1.isAtom() && obj2.isAtom()) {
            return unify_atom(obj1, obj2, v_bindings);
        }
        return unify_failure(obj1, obj2);
    }

    public static SubLObject unify_variable(final SubLObject variable, final SubLObject v_object, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != bindings.variable_bound_p(variable, v_bindings)) {
            return unify_recursive(v_object, bindings.variable_lookup(variable, v_bindings), v_bindings);
        }
        if ((NIL != variables.variable_p(v_object)) && (NIL != bindings.variable_bound_p(v_object, v_bindings))) {
            return unify_variable(v_object, variable, v_bindings);
        }
        if (NIL != unification_occurs_check(variable, v_object, v_bindings)) {
            return unify_failure(variable, v_object);
        }
        if ((NIL != $computing_variable_mapP$.getDynamicValue(thread)) && ((NIL == variables.variable_p(v_object)) || makeBoolean(NIL == base_variable_p(variable)).eql(makeBoolean(NIL == base_variable_p(v_object))))) {
            return unify_failure(variable, v_object);
        }
        return subl_promotions.values2(bindings.add_variable_binding(variable, v_object, v_bindings), NIL);
    }

    public static SubLObject unify_term_variable(final SubLObject term_variable1, final SubLObject term_variable2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $unify_term_variable_enabledP$.getDynamicValue(thread)) {
            return unify_atom(term_variable1, term_variable2, v_bindings);
        }
        if (NIL != bindings.variable_bound_p(term_variable1, v_bindings)) {
            return unify_recursive(bindings.variable_lookup(term_variable1, v_bindings), term_variable2, v_bindings);
        }
        if (NIL != bindings.variable_bound_p(term_variable2, v_bindings)) {
            return unify_recursive(term_variable1, bindings.variable_lookup(term_variable2, v_bindings), v_bindings);
        }
        return subl_promotions.values2(bindings.add_variable_binding(term_variable1, term_variable2, v_bindings), NIL);
    }

    public static SubLObject unify_fort(final SubLObject fort1, final SubLObject obj2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == obj2) {
            return unify_failure(fort1, obj2);
        }
        if (NIL != constant_p(fort1)) {
            return unify_constant(fort1, obj2, v_bindings);
        }
        if (NIL != constant_p(obj2)) {
            return unify_constant(obj2, fort1, v_bindings);
        }
        if ((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(fort1, obj2, UNPROVIDED, UNPROVIDED))) {
            return subl_promotions.values2(v_bindings, unify_possibly_justify_equals(fort1, obj2));
        }
        if ((NIL != $unify_narts_with_hl_formulasP$.getDynamicValue(thread)) && obj2.isCons()) {
            final SubLObject formula1 = narts_high.nart_hl_formula(fort1);
            return unify_cons(formula1, obj2, v_bindings);
        }
        return unify_failure(fort1, obj2);
    }

    public static SubLObject unify_constant(final SubLObject constant1, final SubLObject obj2, final SubLObject v_bindings) {
        if ((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(constant1, obj2, UNPROVIDED, UNPROVIDED))) {
            return subl_promotions.values2(v_bindings, unify_possibly_justify_equals(constant1, obj2));
        }
        return unify_failure(constant1, obj2);
    }

    public static SubLObject unify_cons(final SubLObject cons1, final SubLObject cons2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $unify_cons_function$.getDynamicValue(thread);
        if (pcase_var.eql($DEFAULT)) {
            return unify_cons_default(cons1, cons2, v_bindings);
        }
        return funcall($unify_cons_function$.getDynamicValue(thread), cons1, cons2, v_bindings);
    }

    public static SubLObject unify_cons_default(final SubLObject cons1, final SubLObject cons2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject car_bindings = unify_recursive(cons1.first(), cons2.first(), v_bindings);
        final SubLObject car_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject full_bindings = unify_recursive(cons1.rest(), cons2.rest(), car_bindings);
        final SubLObject cdr_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2(full_bindings, append(car_justification, cdr_justification));
    }

    public static SubLObject unify_atom(final SubLObject atom1, final SubLObject atom2, final SubLObject v_bindings) {
        if ((atom1.isNumber() && atom2.isNumber()) && (NIL != arithmetic.cyc_numerically_equal(atom1, atom2))) {
            return subl_promotions.values2(v_bindings, NIL);
        }
        if (atom1.equal(atom2)) {
            return subl_promotions.values2(v_bindings, NIL);
        }
        return unify_failure(atom1, atom2);
    }

    public static SubLObject unify_possibly_justify_equals(final SubLObject obj1, final SubLObject obj2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $unify_return_justificationP$.getDynamicValue(thread) ? list(arguments.make_hl_support($EQUALITY, make_binary_formula($$equals, obj1, obj2), UNPROVIDED, UNPROVIDED)) : NIL;
    }

    public static SubLObject unification_occurs_check(final SubLObject variable, final SubLObject value, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $perform_unification_occurs_check$.getDynamicValue(thread)) {
            return unification_occurs_check_recursive(variable, value, v_bindings);
        }
        return NIL;
    }

    public static SubLObject unification_occurs_check_recursive(final SubLObject variable, final SubLObject v_object, final SubLObject v_bindings) {
        if (variable.eql(v_object)) {
            return T;
        }
        if (NIL == v_object) {
            return NIL;
        }
        if (v_object.isCons()) {
            SubLObject cons;
            SubLObject car;
            SubLObject cdr;
            for (cons = NIL, cons = v_object; !cons.isAtom(); cons = cons.rest()) {
                car = cons.first();
                if (NIL != unification_occurs_check_recursive(variable, car, v_bindings)) {
                    return T;
                }
                cdr = cons.rest();
                if ((!cdr.isList()) && (NIL != unification_occurs_check_recursive(variable, cdr, v_bindings))) {
                    return T;
                }
            }
            return NIL;
        }
        if ((NIL != variables.variable_p(v_object)) && (NIL != bindings.variable_bound_p(v_object, v_bindings))) {
            return unification_occurs_check_recursive(variable, bindings.variable_lookup(v_object, v_bindings), v_bindings);
        }
        return NIL;
    }

    public static SubLObject too_many_hl_variables(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numGE(list_utilities.tree_count_if(symbol_function(VARIABLE_P), v_object, UNPROVIDED), $variable_base_max$.getDynamicValue(thread));
    }

    public static SubLObject base_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != variables.variable_p(v_object)) && variables.variable_id(v_object).numL($variable_base_max$.getDynamicValue(thread)));
    }

    public static SubLObject non_base_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != variables.variable_p(v_object)) && variables.variable_id(v_object).numGE($variable_base_max$.getDynamicValue(thread)));
    }

    public static SubLObject variable_base_version(final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != variables.variable_p(variable) : "variables.variable_p(variable) " + "CommonSymbols.NIL != variables.variable_p(variable) " + variable;
        return variables.find_variable_by_id(mod(variables.variable_id(variable), $variable_base_max$.getDynamicValue(thread)));
    }

    public static SubLObject variable_non_base_version(final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != variables.variable_p(variable) : "variables.variable_p(variable) " + "CommonSymbols.NIL != variables.variable_p(variable) " + variable;
        return variables.find_variable_by_id(add(mod(variables.variable_id(variable), $variable_base_max$.getDynamicValue(thread)), $variable_base_max$.getDynamicValue(thread)));
    }

    public static SubLObject variable_base_inverted_version(final SubLObject variable) {
        if (NIL != base_variable_p(variable)) {
            return variable_non_base_version(variable);
        }
        return variable_base_version(variable);
    }

    public static SubLObject non_base_variable_transform(final SubLObject v_object) {
        return transform_list_utilities.transform(v_object, symbol_function(BASE_VARIABLE_P), symbol_function(VARIABLE_NON_BASE_VERSION), UNPROVIDED);
    }

    public static SubLObject base_variable_transform(final SubLObject v_object) {
        return transform_list_utilities.transform(v_object, symbol_function(NON_BASE_VARIABLE_P), symbol_function(VARIABLE_BASE_VERSION), UNPROVIDED);
    }

    public static SubLObject variable_base_inversion(final SubLObject v_object) {
        if (NIL != variables.variable_p(v_object)) {
            return variable_base_inverted_version(v_object);
        }
        if (v_object.isAtom()) {
            return v_object;
        }
        return list_utilities.recons(variable_base_inversion(v_object.first()), variable_base_inversion(v_object.rest()), v_object);
    }

    public static SubLObject pre_unify_replace_variables(final SubLObject v_object) {
        return non_base_variable_transform(v_object);
    }

    public static SubLObject term_variable_p(final SubLObject v_object) {
        return cycl_variables.el_varP(v_object);
    }

    public static SubLObject declare_unification_file() {
        declareMacro(me, "with_unifier_justifications", "WITH-UNIFIER-JUSTIFICATIONS");
        declareFunction(me, "unify_possible", "UNIFY-POSSIBLE", 2, 0, false);
        declareFunction(me, "unify_impossible", "UNIFY-IMPOSSIBLE", 2, 0, false);
        declareFunction(me, "unify_possible_recursive", "UNIFY-POSSIBLE-RECURSIVE", 2, 0, false);
        declareFunction(me, "unify_possible_term_variable", "UNIFY-POSSIBLE-TERM-VARIABLE", 2, 0, false);
        declareFunction(me, "unify_possible_fort", "UNIFY-POSSIBLE-FORT", 2, 0, false);
        declareFunction(me, "unify_possible_constant", "UNIFY-POSSIBLE-CONSTANT", 2, 0, false);
        declareFunction(me, "unify_possible_cons", "UNIFY-POSSIBLE-CONS", 2, 0, false);
        declareFunction(me, "unify_possible_cons_default", "UNIFY-POSSIBLE-CONS-DEFAULT", 2, 0, false);
        declareFunction(me, "unify_possible_atom", "UNIFY-POSSIBLE-ATOM", 2, 0, false);
        declareFunction(me, "unify", "UNIFY", 2, 2, false);
        declareFunction(me, "unify_assuming_bindings", "UNIFY-ASSUMING-BINDINGS", 2, 3, false);
        declareFunction(me, "unify_internal", "UNIFY-INTERNAL", 3, 0, false);
        declareFunction(me, "unify_failure", "UNIFY-FAILURE", 2, 0, false);
        declareFunction(me, "unify_recursive", "UNIFY-RECURSIVE", 3, 0, false);
        declareFunction(me, "add_bindings_to_answer", "ADD-BINDINGS-TO-ANSWER", 2, 0, false);
        declareFunction(me, "unify_recursive_internal", "UNIFY-RECURSIVE-INTERNAL", 3, 0, false);
        declareFunction(me, "unify_variable", "UNIFY-VARIABLE", 3, 0, false);
        declareFunction(me, "unify_term_variable", "UNIFY-TERM-VARIABLE", 3, 0, false);
        declareFunction(me, "unify_fort", "UNIFY-FORT", 3, 0, false);
        declareFunction(me, "unify_constant", "UNIFY-CONSTANT", 3, 0, false);
        declareFunction(me, "unify_cons", "UNIFY-CONS", 3, 0, false);
        declareFunction(me, "unify_cons_default", "UNIFY-CONS-DEFAULT", 3, 0, false);
        declareFunction(me, "unify_atom", "UNIFY-ATOM", 3, 0, false);
        declareFunction(me, "unify_possibly_justify_equals", "UNIFY-POSSIBLY-JUSTIFY-EQUALS", 2, 0, false);
        declareFunction(me, "unification_occurs_check", "UNIFICATION-OCCURS-CHECK", 3, 0, false);
        declareFunction(me, "unification_occurs_check_recursive", "UNIFICATION-OCCURS-CHECK-RECURSIVE", 3, 0, false);
        declareFunction(me, "too_many_hl_variables", "TOO-MANY-HL-VARIABLES", 1, 0, false);
        declareFunction(me, "base_variable_p", "BASE-VARIABLE-P", 1, 0, false);
        new unification.$base_variable_p$UnaryFunction();
        declareFunction(me, "non_base_variable_p", "NON-BASE-VARIABLE-P", 1, 0, false);
        declareFunction(me, "variable_base_version", "VARIABLE-BASE-VERSION", 1, 0, false);
        declareFunction(me, "variable_non_base_version", "VARIABLE-NON-BASE-VERSION", 1, 0, false);
        new unification.$variable_non_base_version$UnaryFunction();
        declareFunction(me, "variable_base_inverted_version", "VARIABLE-BASE-INVERTED-VERSION", 1, 0, false);
        declareFunction(me, "non_base_variable_transform", "NON-BASE-VARIABLE-TRANSFORM", 1, 0, false);
        declareFunction(me, "base_variable_transform", "BASE-VARIABLE-TRANSFORM", 1, 0, false);
        declareFunction(me, "variable_base_inversion", "VARIABLE-BASE-INVERSION", 1, 0, false);
        declareFunction(me, "pre_unify_replace_variables", "PRE-UNIFY-REPLACE-VARIABLES", 1, 0, false);
        declareFunction(me, "term_variable_p", "TERM-VARIABLE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_unification_file() {
        defvar("*UNIFY-TERM-VARIABLE-ENABLED?*", T);
        defparameter("*UNIFY-POSSIBLE-CONS-FUNCTION*", $DEFAULT);
        defparameter("*UNIFY-CONS-FUNCTION*", $DEFAULT);
        defparameter("*UNIFY-MULTIPLE?*", NIL);
        defparameter("*COMPUTING-VARIABLE-MAP?*", NIL);
        defparameter("*UNIFY-RETURN-JUSTIFICATION?*", NIL);
        defparameter("*UNIFY-NARTS-WITH-HL-FORMULAS?*", T);
        defparameter("*VARIABLE-BASE-MAX*", $int$100);
        return NIL;
    }

    public static SubLObject setup_unification_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_unification_file();
    }

    @Override
    public void initializeVariables() {
        init_unification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_unification_file();
    }

    

    public static final class $base_variable_p$UnaryFunction extends UnaryFunction {
        public $base_variable_p$UnaryFunction() {
            super(extractFunctionNamed("BASE-VARIABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return base_variable_p(arg1);
        }
    }

    public static final class $variable_non_base_version$UnaryFunction extends UnaryFunction {
        public $variable_non_base_version$UnaryFunction() {
            super(extractFunctionNamed("VARIABLE-NON-BASE-VERSION"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return variable_non_base_version(arg1);
        }
    }
}

/**
 * Total time: 226 ms
 */
