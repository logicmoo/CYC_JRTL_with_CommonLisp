/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.control_vars.$perform_unification_occurs_check$;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class unification extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new unification();

 public static final String myName = "com.cyc.cycjava.cycl.unification";


    // defvar
    @LispMethod(comment = "Temporary control variable; when non-nil, term variables (EL variables) are allowed\r\nto unify with other term variables.\ndefvar\nTemporary control variable; when non-nil, term variables (EL variables) are allowed\nto unify with other term variables.")
    // Definitions
    /**
     * Temporary control variable; when non-nil, term variables (EL variables) are allowed
     * to unify with other term variables.
     */
    public static final SubLSymbol $unify_term_variable_enabledP$ = makeSymbol("*UNIFY-TERM-VARIABLE-ENABLED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $unify_possible_cons_function$ = makeSymbol("*UNIFY-POSSIBLE-CONS-FUNCTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $unify_cons_function$ = makeSymbol("*UNIFY-CONS-FUNCTION*");

    // defparameter
    /**
     * Do we want UNIFY to find all possible bindings sets, and not just the first?
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Do we want UNIFY to find all possible bindings sets, and not just the first?\r\n\r\n@unknown baxter\ndefparameter")
    public static final SubLSymbol $unify_multipleP$ = makeSymbol("*UNIFY-MULTIPLE?*");

    // defparameter
    /**
     * Do we want to restrict UNIFY to only bind HL variables to other not-yet-bound
     * HL variables in the inverted variable space?
     */
    @LispMethod(comment = "Do we want to restrict UNIFY to only bind HL variables to other not-yet-bound\r\nHL variables in the inverted variable space?\ndefparameter\nDo we want to restrict UNIFY to only bind HL variables to other not-yet-bound\nHL variables in the inverted variable space?")
    public static final SubLSymbol $computing_variable_mapP$ = makeSymbol("*COMPUTING-VARIABLE-MAP?*");

    // defparameter
    /**
     * Do we return a justification for the bindings?
     *
     * @unknown Currently this only works if *unify-multiple?* is NIL.
     */
    @LispMethod(comment = "Do we return a justification for the bindings?\r\n\r\n@unknown Currently this only works if *unify-multiple?* is NIL.\ndefparameter")
    public static final SubLSymbol $unify_return_justificationP$ = makeSymbol("*UNIFY-RETURN-JUSTIFICATION?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $unify_narts_with_hl_formulasP$ = makeSymbol("*UNIFY-NARTS-WITH-HL-FORMULAS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $variable_base_max$ = makeSymbol("*VARIABLE-BASE-MAX*");

    static private final SubLList $list2 = list(list(makeSymbol("*UNIFY-RETURN-JUSTIFICATION?*"), T));

    private static final SubLSymbol BINDINGS_P = makeSymbol("BINDINGS-P");



    private static final SubLSymbol BASE_VARIABLE_P = makeSymbol("BASE-VARIABLE-P");

    private static final SubLSymbol VARIABLE_NON_BASE_VERSION = makeSymbol("VARIABLE-NON-BASE-VERSION");

    private static final SubLSymbol NON_BASE_VARIABLE_P = makeSymbol("NON-BASE-VARIABLE-P");

    private static final SubLSymbol VARIABLE_BASE_VERSION = makeSymbol("VARIABLE-BASE-VERSION");

    public static final SubLObject with_unifier_justifications_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt2, append(body, NIL));
        }
    }

    public static SubLObject with_unifier_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    /**
     * A quick, necessary condition check for whether unification
     * between OBJ1 and OBJ2 could possibly succeed.
     */
    @LispMethod(comment = "A quick, necessary condition check for whether unification\r\nbetween OBJ1 and OBJ2 could possibly succeed.\nA quick, necessary condition check for whether unification\nbetween OBJ1 and OBJ2 could possibly succeed.")
    public static final SubLObject unify_possible_alt(SubLObject obj1, SubLObject obj2) {
        return com.cyc.cycjava.cycl.unification.unify_possible_recursive(obj1, obj2);
    }

    /**
     * A quick, necessary condition check for whether unification
     * between OBJ1 and OBJ2 could possibly succeed.
     */
    @LispMethod(comment = "A quick, necessary condition check for whether unification\r\nbetween OBJ1 and OBJ2 could possibly succeed.\nA quick, necessary condition check for whether unification\nbetween OBJ1 and OBJ2 could possibly succeed.")
    public static SubLObject unify_possible(final SubLObject obj1, final SubLObject obj2) {
        return unify_possible_recursive(obj1, obj2);
    }

    /**
     * A quick, sufficient condition check for whether unification
     * between OBJ1 and OBJ2 must necessarily fail.
     */
    @LispMethod(comment = "A quick, sufficient condition check for whether unification\r\nbetween OBJ1 and OBJ2 must necessarily fail.\nA quick, sufficient condition check for whether unification\nbetween OBJ1 and OBJ2 must necessarily fail.")
    public static final SubLObject unify_impossible_alt(SubLObject obj1, SubLObject obj2) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.unification.unify_possible_recursive(obj1, obj2));
    }

    /**
     * A quick, sufficient condition check for whether unification
     * between OBJ1 and OBJ2 must necessarily fail.
     */
    @LispMethod(comment = "A quick, sufficient condition check for whether unification\r\nbetween OBJ1 and OBJ2 must necessarily fail.\nA quick, sufficient condition check for whether unification\nbetween OBJ1 and OBJ2 must necessarily fail.")
    public static SubLObject unify_impossible(final SubLObject obj1, final SubLObject obj2) {
        return makeBoolean(NIL == unify_possible_recursive(obj1, obj2));
    }

    /**
     * Return T iff the objects OBJ1 and OBJ2 could possibly unify
     */
    @LispMethod(comment = "Return T iff the objects OBJ1 and OBJ2 could possibly unify")
    public static final SubLObject unify_possible_recursive_alt(SubLObject obj1, SubLObject obj2) {
        if (obj1.eql(obj2)) {
            return T;
        } else {
            if (NIL != variables.variable_p(obj1)) {
                return T;
            } else {
                if (NIL != variables.variable_p(obj2)) {
                    return T;
                } else {
                    if ((NIL != com.cyc.cycjava.cycl.unification.term_variable_p(obj1)) && (NIL != com.cyc.cycjava.cycl.unification.term_variable_p(obj2))) {
                        return com.cyc.cycjava.cycl.unification.unify_possible_term_variable(obj1, obj2);
                    } else {
                        if (NIL != forts.fort_p(obj1)) {
                            return com.cyc.cycjava.cycl.unification.unify_possible_fort(obj1, obj2);
                        } else {
                            if (NIL != forts.fort_p(obj2)) {
                                return com.cyc.cycjava.cycl.unification.unify_possible_fort(obj2, obj1);
                            } else {
                                if (obj1.isCons() && obj2.isCons()) {
                                    return com.cyc.cycjava.cycl.unification.unify_possible_cons(obj1, obj2);
                                } else {
                                    if (obj1.isAtom() && obj2.isAtom()) {
                                        return com.cyc.cycjava.cycl.unification.unify_possible_atom(obj1, obj2);
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Return T iff the objects OBJ1 and OBJ2 could possibly unify
     */
    @LispMethod(comment = "Return T iff the objects OBJ1 and OBJ2 could possibly unify")
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

    /**
     * Return T iff the term variables TERM-VARIABLE1 and TERM-VARIABLE2 could possibly unify
     */
    @LispMethod(comment = "Return T iff the term variables TERM-VARIABLE1 and TERM-VARIABLE2 could possibly unify")
    public static final SubLObject unify_possible_term_variable_alt(SubLObject term_variable1, SubLObject term_variable2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $unify_term_variable_enabledP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.unification.unify_possible_atom(term_variable1, term_variable2);
            }
            return T;
        }
    }

    /**
     * Return T iff the term variables TERM-VARIABLE1 and TERM-VARIABLE2 could possibly unify
     */
    @LispMethod(comment = "Return T iff the term variables TERM-VARIABLE1 and TERM-VARIABLE2 could possibly unify")
    public static SubLObject unify_possible_term_variable(final SubLObject term_variable1, final SubLObject term_variable2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $unify_term_variable_enabledP$.getDynamicValue(thread)) {
            return unify_possible_atom(term_variable1, term_variable2);
        }
        return T;
    }

    /**
     * Return T iff fort FORT1 and OBJ2 could possibly unify
     */
    @LispMethod(comment = "Return T iff fort FORT1 and OBJ2 could possibly unify")
    public static final SubLObject unify_possible_fort_alt(SubLObject fort1, SubLObject obj2) {
        if (NIL == obj2) {
            return NIL;
        } else {
            if (NIL != constant_p(fort1)) {
                return com.cyc.cycjava.cycl.unification.unify_possible_constant(fort1, obj2);
            } else {
                if (NIL != constant_p(obj2)) {
                    return com.cyc.cycjava.cycl.unification.unify_possible_constant(obj2, fort1);
                } else {
                    if ((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(fort1, obj2, UNPROVIDED, UNPROVIDED))) {
                        return T;
                    } else {
                        if (obj2.isCons()) {
                            {
                                SubLObject formula1 = narts_high.nart_hl_formula(fort1);
                                return com.cyc.cycjava.cycl.unification.unify_possible_cons(formula1, obj2);
                            }
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     * Return T iff fort FORT1 and OBJ2 could possibly unify
     */
    @LispMethod(comment = "Return T iff fort FORT1 and OBJ2 could possibly unify")
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

    /**
     * Return T iff constant CONSTANT1 and OBJ2 could possibly unify
     */
    @LispMethod(comment = "Return T iff constant CONSTANT1 and OBJ2 could possibly unify")
    public static final SubLObject unify_possible_constant_alt(SubLObject constant1, SubLObject obj2) {
        return makeBoolean((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(constant1, obj2, UNPROVIDED, UNPROVIDED)));
    }

    @LispMethod(comment = "Return T iff constant CONSTANT1 and OBJ2 could possibly unify")
    public static SubLObject unify_possible_constant(final SubLObject constant1, final SubLObject obj2) {
        return makeBoolean((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(constant1, obj2, UNPROVIDED, UNPROVIDED)));
    }/**
     * Return T iff constant CONSTANT1 and OBJ2 could possibly unify
     */


    /**
     * Return T iff the conses CONS1 and CONS2 could possibly unify
     */
    @LispMethod(comment = "Return T iff the conses CONS1 and CONS2 could possibly unify")
    public static final SubLObject unify_possible_cons_alt(SubLObject cons1, SubLObject cons2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $unify_possible_cons_function$.getDynamicValue(thread);
                if (pcase_var.eql($DEFAULT)) {
                    return com.cyc.cycjava.cycl.unification.unify_possible_cons_default(cons1, cons2);
                } else {
                    return funcall($unify_possible_cons_function$.getDynamicValue(thread), cons1, cons2);
                }
            }
        }
    }

    @LispMethod(comment = "Return T iff the conses CONS1 and CONS2 could possibly unify")
    public static SubLObject unify_possible_cons(final SubLObject cons1, final SubLObject cons2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $unify_possible_cons_function$.getDynamicValue(thread);
        if (pcase_var.eql($DEFAULT)) {
            return unify_possible_cons_default(cons1, cons2);
        }
        return funcall($unify_possible_cons_function$.getDynamicValue(thread), cons1, cons2);
    }/**
     * Return T iff the conses CONS1 and CONS2 could possibly unify
     */


    public static final SubLObject unify_possible_cons_default_alt(SubLObject cons1, SubLObject cons2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.unification.unify_possible_recursive(cons1.first(), cons2.first())) && (NIL != com.cyc.cycjava.cycl.unification.unify_possible_recursive(cons1.rest(), cons2.rest())));
    }

    public static SubLObject unify_possible_cons_default(final SubLObject cons1, final SubLObject cons2) {
        return makeBoolean((NIL != unify_possible_recursive(cons1.first(), cons2.first())) && (NIL != unify_possible_recursive(cons1.rest(), cons2.rest())));
    }

    /**
     * Return T iff the atoms ATOM1 and ATOM2 could possibly unify
     */
    @LispMethod(comment = "Return T iff the atoms ATOM1 and ATOM2 could possibly unify")
    public static final SubLObject unify_possible_atom_alt(SubLObject atom1, SubLObject atom2) {
        return equal(atom1, atom2);
    }

    @LispMethod(comment = "Return T iff the atoms ATOM1 and ATOM2 could possibly unify")
    public static SubLObject unify_possible_atom(final SubLObject atom1, final SubLObject atom2) {
        if (atom1.isNumber() && atom2.isNumber()) {
            return arithmetic.cyc_numerically_equal(atom1, atom2);
        }
        return equal(atom1, atom2);
    }/**
     * Return T iff the atoms ATOM1 and ATOM2 could possibly unify
     */


    /**
     * Compute the Most General Unifier between OBJ-TRANS and OBJ.
     * If SHARE-VARS? is nil, then the HL variables in OBJ-TRANS and OBJ
     * are assumed to be in different variable spaces, and the so ones in OBJ-TRANS
     * are temporarily converted so as to uniquify all variables.
     * If JUSTIFY? is non-nil, then a justification will be returned (if appropriate).
     *
     * @return NIL ; when unification fails
     * @return unification-success-token-p ; when unification succeeds without bindings
     * @return bindings-p ; when unification succeeds with bindings
     * @return set-p of bindings-p ; when *UNIFY-MULTIPLE?* is non-NIL and we find more
    than one way to bind the variables.
     */
    @LispMethod(comment = "Compute the Most General Unifier between OBJ-TRANS and OBJ.\r\nIf SHARE-VARS? is nil, then the HL variables in OBJ-TRANS and OBJ\r\nare assumed to be in different variable spaces, and the so ones in OBJ-TRANS\r\nare temporarily converted so as to uniquify all variables.\r\nIf JUSTIFY? is non-nil, then a justification will be returned (if appropriate).\r\n\r\n@return NIL ; when unification fails\r\n@return unification-success-token-p ; when unification succeeds without bindings\r\n@return bindings-p ; when unification succeeds with bindings\r\n@return set-p of bindings-p ; when *UNIFY-MULTIPLE?* is non-NIL and we find more\r\nthan one way to bind the variables.\nCompute the Most General Unifier between OBJ-TRANS and OBJ.\nIf SHARE-VARS? is nil, then the HL variables in OBJ-TRANS and OBJ\nare assumed to be in different variable spaces, and the so ones in OBJ-TRANS\nare temporarily converted so as to uniquify all variables.\nIf JUSTIFY? is non-nil, then a justification will be returned (if appropriate).")
    public static final SubLObject unify_alt(SubLObject obj_trans, SubLObject obj, SubLObject share_varsP, SubLObject justifyP) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = $unify_return_justificationP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.unification.unify_assuming_bindings(obj_trans, obj, share_varsP, NIL, justifyP);
                SubLObject justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(v_bindings, justifications);
            }
        }
    }

    @LispMethod(comment = "Compute the Most General Unifier between OBJ-TRANS and OBJ.\r\nIf SHARE-VARS? is nil, then the HL variables in OBJ-TRANS and OBJ\r\nare assumed to be in different variable spaces, and the so ones in OBJ-TRANS\r\nare temporarily converted so as to uniquify all variables.\r\nIf JUSTIFY? is non-nil, then a justification will be returned (if appropriate).\r\n\r\n@return NIL ; when unification fails\r\n@return unification-success-token-p ; when unification succeeds without bindings\r\n@return bindings-p ; when unification succeeds with bindings\r\n@return set-p of bindings-p ; when *UNIFY-MULTIPLE?* is non-NIL and we find more\r\nthan one way to bind the variables.\nCompute the Most General Unifier between OBJ-TRANS and OBJ.\nIf SHARE-VARS? is nil, then the HL variables in OBJ-TRANS and OBJ\nare assumed to be in different variable spaces, and the so ones in OBJ-TRANS\nare temporarily converted so as to uniquify all variables.\nIf JUSTIFY? is non-nil, then a justification will be returned (if appropriate).")
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
    }/**
     * Compute the Most General Unifier between OBJ-TRANS and OBJ.
     * If SHARE-VARS? is nil, then the HL variables in OBJ-TRANS and OBJ
     * are assumed to be in different variable spaces, and the so ones in OBJ-TRANS
     * are temporarily converted so as to uniquify all variables.
     * If JUSTIFY? is non-nil, then a justification will be returned (if appropriate).
     *
     * @return NIL ; when unification fails
     * @return unification-success-token-p ; when unification succeeds without bindings
     * @return bindings-p ; when unification succeeds with bindings
     * @return set-p of bindings-p ; when *UNIFY-MULTIPLE?* is non-NIL and we find more
    than one way to bind the variables.
     */


    /**
     * Like @xref UNIFY, in which unification is done within the context of
     * assume-bindings, which are pre-existing bindings to assume.
     */
    @LispMethod(comment = "Like @xref UNIFY, in which unification is done within the context of\r\nassume-bindings, which are pre-existing bindings to assume.\nLike @xref UNIFY, in which unification is done within the context of\nassume-bindings, which are pre-existing bindings to assume.")
    public static final SubLObject unify_assuming_bindings_alt(SubLObject obj_trans, SubLObject obj, SubLObject share_varsP, SubLObject assume_bindings, SubLObject justifyP) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = $unify_return_justificationP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            inference_metrics.increment_unification_attempt_historical_count();
            if (NIL != com.cyc.cycjava.cycl.unification.unify_possible(obj_trans, obj)) {
                if (NIL == share_varsP) {
                    obj_trans = com.cyc.cycjava.cycl.unification.pre_unify_replace_variables(obj_trans);
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
                                SubLObject result_bindings_1 = com.cyc.cycjava.cycl.unification.unify_internal(obj_trans, obj, assume_bindings);
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
                    if (NIL != successP) {
                        inference_metrics.increment_unification_success_historical_count();
                        if (NIL == result_bindings) {
                            return values(bindings.unification_success_token(), justification);
                        } else {
                            if (NIL != set.set_p(result_bindings)) {
                                {
                                    SubLObject new_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                                    SubLObject set_contents_var = set.do_set_internal(result_bindings);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject v_bindings = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, v_bindings)) {
                                                SubLTrampolineFile.checkType(v_bindings, BINDINGS_P);
                                                set.set_add(nreverse(copy_tree(v_bindings)), new_set);
                                            }
                                        }
                                    }
                                    return values(new_set, justification);
                                }
                            } else {
                                return values(nreverse(copy_tree(result_bindings)), justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Like @xref UNIFY, in which unification is done within the context of
     * assume-bindings, which are pre-existing bindings to assume.
     */
    @LispMethod(comment = "Like @xref UNIFY, in which unification is done within the context of\r\nassume-bindings, which are pre-existing bindings to assume.\nLike @xref UNIFY, in which unification is done within the context of\nassume-bindings, which are pre-existing bindings to assume.")
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
                            assert NIL != bindings.bindings_p(v_bindings) : "! bindings.bindings_p(v_bindings) " + ("bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) ") + v_bindings;
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

    public static final SubLObject unify_internal_alt(SubLObject obj1, SubLObject obj2, SubLObject v_bindings) {
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
                        SubLObject result_bindings_4 = com.cyc.cycjava.cycl.unification.unify_recursive(obj1, obj2, v_bindings);
                        SubLObject justification_5 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result_bindings = result_bindings_4;
                        justification = justification_5;
                    }
                    successP = T;
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $UNIFY_FAILURE);
                }
                return values(result_bindings, justification, successP);
            }
        }
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

    /**
     * Note that unification failed due to an inability to unify OBJ1 and OBJ2
     */
    @LispMethod(comment = "Note that unification failed due to an inability to unify OBJ1 and OBJ2")
    public static final SubLObject unify_failure_alt(SubLObject obj1, SubLObject obj2) {
        return sublisp_throw($UNIFY_FAILURE, NIL);
    }

    @LispMethod(comment = "Note that unification failed due to an inability to unify OBJ1 and OBJ2")
    public static SubLObject unify_failure(final SubLObject obj1, final SubLObject obj2) {
        return sublisp_throw($UNIFY_FAILURE, NIL);
    }/**
     * Note that unification failed due to an inability to unify OBJ1 and OBJ2
     */


    public static final SubLObject unify_recursive_alt(SubLObject obj1, SubLObject obj2, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $unify_multipleP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.unification.unify_recursive_internal(obj1, obj2, v_bindings);
            } else {
                if (NIL != set.set_p(v_bindings)) {
                    {
                        SubLObject ans_bindings = NIL;
                        SubLObject some_successP = NIL;
                        SubLObject set_contents_var = set.do_set_internal(v_bindings);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject one_bindings = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, one_bindings)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject new_bindings = com.cyc.cycjava.cycl.unification.unify_internal(obj1, obj2, one_bindings);
                                        SubLObject justification = thread.secondMultipleValue();
                                        SubLObject successP = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != successP) {
                                            some_successP = T;
                                            ans_bindings = com.cyc.cycjava.cycl.unification.add_bindings_to_answer(new_bindings, ans_bindings);
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != some_successP) {
                            return values(ans_bindings, NIL);
                        } else {
                            return com.cyc.cycjava.cycl.unification.unify_failure(obj1, obj2);
                        }
                    }
                } else {
                    return com.cyc.cycjava.cycl.unification.unify_recursive_internal(obj1, obj2, v_bindings);
                }
            }
        }
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

    /**
     *
     *
     * @param NEW-BINDINGS;
     * 		bindings-p or set-p of bindings-p.
     * @param ANSWER;
     * 		NIL or bindings-p or set-p of bindings-p.
     * @return bindings-p or set-p of bindings-p.
     * @unknown baxter
     */
    @LispMethod(comment = "@param NEW-BINDINGS;\r\n\t\tbindings-p or set-p of bindings-p.\r\n@param ANSWER;\r\n\t\tNIL or bindings-p or set-p of bindings-p.\r\n@return bindings-p or set-p of bindings-p.\r\n@unknown baxter")
    public static final SubLObject add_bindings_to_answer_alt(SubLObject new_bindings, SubLObject v_answer) {
        if (NIL != set.set_p(new_bindings)) {
            {
                SubLObject set_contents_var = set.do_set_internal(new_bindings);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject one_new_bindings = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, one_new_bindings)) {
                            SubLTrampolineFile.checkType(one_new_bindings, BINDINGS_P);
                            v_answer = com.cyc.cycjava.cycl.unification.add_bindings_to_answer(one_new_bindings, v_answer);
                        }
                    }
                }
            }
        } else {
            if (NIL == v_answer) {
                v_answer = new_bindings;
            } else {
                if (NIL != set.set_p(v_answer)) {
                    set.set_add(new_bindings, v_answer);
                } else {
                    v_answer = set_utilities.new_singleton_set(v_answer, symbol_function(EQUAL));
                    set.set_add(new_bindings, v_answer);
                }
            }
        }
        return v_answer;
    }

    /**
     *
     *
     * @param NEW-BINDINGS;
     * 		bindings-p or set-p of bindings-p.
     * @param ANSWER;
     * 		NIL or bindings-p or set-p of bindings-p.
     * @return bindings-p or set-p of bindings-p.
     * @unknown baxter
     */
    @LispMethod(comment = "@param NEW-BINDINGS;\r\n\t\tbindings-p or set-p of bindings-p.\r\n@param ANSWER;\r\n\t\tNIL or bindings-p or set-p of bindings-p.\r\n@return bindings-p or set-p of bindings-p.\r\n@unknown baxter")
    public static SubLObject add_bindings_to_answer(final SubLObject new_bindings, SubLObject v_answer) {
        if (NIL != set.set_p(new_bindings)) {
            final SubLObject set_contents_var = set.do_set_internal(new_bindings);
            SubLObject basis_object;
            SubLObject state;
            SubLObject one_new_bindings;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                one_new_bindings = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, one_new_bindings)) {
                    assert NIL != bindings.bindings_p(one_new_bindings) : "! bindings.bindings_p(one_new_bindings) " + ("bindings.bindings_p(one_new_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(one_new_bindings) ") + one_new_bindings;
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

    public static final SubLObject unify_recursive_internal_alt(SubLObject obj1, SubLObject obj2, SubLObject v_bindings) {
        if (obj1 == obj2) {
            return values(v_bindings, NIL);
        } else {
            if (NIL != variables.variable_p(obj1)) {
                return com.cyc.cycjava.cycl.unification.unify_variable(obj1, obj2, v_bindings);
            } else {
                if (NIL != variables.variable_p(obj2)) {
                    return com.cyc.cycjava.cycl.unification.unify_variable(obj2, obj1, v_bindings);
                } else {
                    if ((NIL != com.cyc.cycjava.cycl.unification.term_variable_p(obj1)) && (NIL != com.cyc.cycjava.cycl.unification.term_variable_p(obj2))) {
                        return com.cyc.cycjava.cycl.unification.unify_term_variable(obj1, obj2, v_bindings);
                    } else {
                        if (NIL != forts.fort_p(obj1)) {
                            return com.cyc.cycjava.cycl.unification.unify_fort(obj1, obj2, v_bindings);
                        } else {
                            if (NIL != forts.fort_p(obj2)) {
                                return com.cyc.cycjava.cycl.unification.unify_fort(obj2, obj1, v_bindings);
                            } else {
                                if (obj1.isCons() && obj2.isCons()) {
                                    return com.cyc.cycjava.cycl.unification.unify_cons(obj1, obj2, v_bindings);
                                } else {
                                    if (obj1.isAtom() && obj2.isAtom()) {
                                        return com.cyc.cycjava.cycl.unification.unify_atom(obj1, obj2, v_bindings);
                                    } else {
                                        return com.cyc.cycjava.cycl.unification.unify_failure(obj1, obj2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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

    /**
     * Unify VARIABLE with OBJECT
     */
    @LispMethod(comment = "Unify VARIABLE with OBJECT")
    public static final SubLObject unify_variable_alt(SubLObject variable, SubLObject v_object, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != bindings.variable_bound_p(variable, v_bindings)) {
                return com.cyc.cycjava.cycl.unification.unify_recursive(bindings.variable_lookup(variable, v_bindings), v_object, v_bindings);
            } else {
                if ((NIL != variables.variable_p(v_object)) && (NIL != bindings.variable_bound_p(v_object, v_bindings))) {
                    return com.cyc.cycjava.cycl.unification.unify_variable(v_object, variable, v_bindings);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.unification.unification_occurs_check(variable, v_object, v_bindings)) {
                        return com.cyc.cycjava.cycl.unification.unify_failure(variable, v_object);
                    } else {
                        if ((NIL != $computing_variable_mapP$.getDynamicValue(thread)) && ((NIL == variables.variable_p(v_object)) || (makeBoolean(NIL == com.cyc.cycjava.cycl.unification.base_variable_p(variable)) == makeBoolean(NIL == com.cyc.cycjava.cycl.unification.base_variable_p(v_object))))) {
                            return com.cyc.cycjava.cycl.unification.unify_failure(variable, v_object);
                        } else {
                            return values(bindings.add_variable_binding(variable, v_object, v_bindings), NIL);
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Unify VARIABLE with OBJECT")
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
    }/**
     * Unify VARIABLE with OBJECT
     */


    /**
     * Unify term TERM-VARIABLE1 with term TERM-VARIABLE2 assuming BINDINGS
     */
    @LispMethod(comment = "Unify term TERM-VARIABLE1 with term TERM-VARIABLE2 assuming BINDINGS")
    public static final SubLObject unify_term_variable_alt(SubLObject term_variable1, SubLObject term_variable2, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $unify_term_variable_enabledP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.unification.unify_atom(term_variable1, term_variable2, v_bindings);
            }
            if (NIL != bindings.variable_bound_p(term_variable1, v_bindings)) {
                return com.cyc.cycjava.cycl.unification.unify_recursive(bindings.variable_lookup(term_variable1, v_bindings), term_variable2, v_bindings);
            } else {
                if (NIL != bindings.variable_bound_p(term_variable2, v_bindings)) {
                    return com.cyc.cycjava.cycl.unification.unify_recursive(term_variable1, bindings.variable_lookup(term_variable2, v_bindings), v_bindings);
                } else {
                    return values(bindings.add_variable_binding(term_variable1, term_variable2, v_bindings), NIL);
                }
            }
        }
    }

    @LispMethod(comment = "Unify term TERM-VARIABLE1 with term TERM-VARIABLE2 assuming BINDINGS")
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
    }/**
     * Unify term TERM-VARIABLE1 with term TERM-VARIABLE2 assuming BINDINGS
     */


    /**
     * Unify fort FORT1 and OBJ2 assuming BINDINGS
     */
    @LispMethod(comment = "Unify fort FORT1 and OBJ2 assuming BINDINGS")
    public static final SubLObject unify_fort_alt(SubLObject fort1, SubLObject obj2, SubLObject v_bindings) {
        if (NIL == obj2) {
            return com.cyc.cycjava.cycl.unification.unify_failure(fort1, obj2);
        } else {
            if (NIL != constant_p(fort1)) {
                return com.cyc.cycjava.cycl.unification.unify_constant(fort1, obj2, v_bindings);
            } else {
                if (NIL != constant_p(obj2)) {
                    return com.cyc.cycjava.cycl.unification.unify_constant(obj2, fort1, v_bindings);
                } else {
                    if ((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(fort1, obj2, UNPROVIDED, UNPROVIDED))) {
                        return values(v_bindings, com.cyc.cycjava.cycl.unification.unify_possibly_justify_equals(fort1, obj2));
                    } else {
                        if (obj2.isCons()) {
                            {
                                SubLObject formula1 = narts_high.nart_hl_formula(fort1);
                                return com.cyc.cycjava.cycl.unification.unify_cons(formula1, obj2, v_bindings);
                            }
                        } else {
                            return com.cyc.cycjava.cycl.unification.unify_failure(fort1, obj2);
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Unify fort FORT1 and OBJ2 assuming BINDINGS")
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
    }/**
     * Unify fort FORT1 and OBJ2 assuming BINDINGS
     */


    /**
     * Unify constant CONSTANT1 and OBJ2 assuming BINDINGS
     */
    @LispMethod(comment = "Unify constant CONSTANT1 and OBJ2 assuming BINDINGS")
    public static final SubLObject unify_constant_alt(SubLObject constant1, SubLObject obj2, SubLObject v_bindings) {
        if ((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(constant1, obj2, UNPROVIDED, UNPROVIDED))) {
            return values(v_bindings, com.cyc.cycjava.cycl.unification.unify_possibly_justify_equals(constant1, obj2));
        } else {
            return com.cyc.cycjava.cycl.unification.unify_failure(constant1, obj2);
        }
    }

    @LispMethod(comment = "Unify constant CONSTANT1 and OBJ2 assuming BINDINGS")
    public static SubLObject unify_constant(final SubLObject constant1, final SubLObject obj2, final SubLObject v_bindings) {
        if ((NIL != variables.fully_bound_p(obj2)) && (NIL != equals.equalsP(constant1, obj2, UNPROVIDED, UNPROVIDED))) {
            return subl_promotions.values2(v_bindings, unify_possibly_justify_equals(constant1, obj2));
        }
        return unify_failure(constant1, obj2);
    }/**
     * Unify constant CONSTANT1 and OBJ2 assuming BINDINGS
     */


    /**
     * Unify conses CONS1 and CONS2 assuming BINDINGS
     */
    @LispMethod(comment = "Unify conses CONS1 and CONS2 assuming BINDINGS")
    public static final SubLObject unify_cons_alt(SubLObject cons1, SubLObject cons2, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $unify_cons_function$.getDynamicValue(thread);
                if (pcase_var.eql($DEFAULT)) {
                    return com.cyc.cycjava.cycl.unification.unify_cons_default(cons1, cons2, v_bindings);
                } else {
                    return funcall($unify_cons_function$.getDynamicValue(thread), cons1, cons2, v_bindings);
                }
            }
        }
    }

    @LispMethod(comment = "Unify conses CONS1 and CONS2 assuming BINDINGS")
    public static SubLObject unify_cons(final SubLObject cons1, final SubLObject cons2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $unify_cons_function$.getDynamicValue(thread);
        if (pcase_var.eql($DEFAULT)) {
            return unify_cons_default(cons1, cons2, v_bindings);
        }
        return funcall($unify_cons_function$.getDynamicValue(thread), cons1, cons2, v_bindings);
    }/**
     * Unify conses CONS1 and CONS2 assuming BINDINGS
     */


    /**
     * Unify conses CONS1 and CONS2 assuming BINDINGS
     */
    @LispMethod(comment = "Unify conses CONS1 and CONS2 assuming BINDINGS")
    public static final SubLObject unify_cons_default_alt(SubLObject cons1, SubLObject cons2, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject car_bindings = com.cyc.cycjava.cycl.unification.unify_recursive(cons1.first(), cons2.first(), v_bindings);
                SubLObject car_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject full_bindings = com.cyc.cycjava.cycl.unification.unify_recursive(cons1.rest(), cons2.rest(), car_bindings);
                    SubLObject cdr_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(full_bindings, append(car_justification, cdr_justification));
                }
            }
        }
    }

    @LispMethod(comment = "Unify conses CONS1 and CONS2 assuming BINDINGS")
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
    }/**
     * Unify conses CONS1 and CONS2 assuming BINDINGS
     */


    /**
     * Unify atoms ATOM1 and ATOM2 assuming BINDINGS
     */
    @LispMethod(comment = "Unify atoms ATOM1 and ATOM2 assuming BINDINGS")
    public static final SubLObject unify_atom_alt(SubLObject atom1, SubLObject atom2, SubLObject v_bindings) {
        if (atom1.equal(atom2)) {
            return values(v_bindings, NIL);
        } else {
            return com.cyc.cycjava.cycl.unification.unify_failure(atom1, atom2);
        }
    }

    @LispMethod(comment = "Unify atoms ATOM1 and ATOM2 assuming BINDINGS")
    public static SubLObject unify_atom(final SubLObject atom1, final SubLObject atom2, final SubLObject v_bindings) {
        if ((atom1.isNumber() && atom2.isNumber()) && (NIL != arithmetic.cyc_numerically_equal(atom1, atom2))) {
            return subl_promotions.values2(v_bindings, NIL);
        }
        if (atom1.equal(atom2)) {
            return subl_promotions.values2(v_bindings, NIL);
        }
        return unify_failure(atom1, atom2);
    }/**
     * Unify atoms ATOM1 and ATOM2 assuming BINDINGS
     */


    public static final SubLObject unify_possibly_justify_equals_alt(SubLObject obj1, SubLObject obj2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $unify_return_justificationP$.getDynamicValue(thread) ? ((SubLObject) (list(arguments.make_hl_support($EQUALITY, make_binary_formula($$equals, obj1, obj2), UNPROVIDED, UNPROVIDED)))) : NIL;
        }
    }

    public static SubLObject unify_possibly_justify_equals(final SubLObject obj1, final SubLObject obj2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $unify_return_justificationP$.getDynamicValue(thread) ? list(arguments.make_hl_support($EQUALITY, make_binary_formula($$equals, obj1, obj2), UNPROVIDED, UNPROVIDED)) : NIL;
    }

    /**
     * Return T iff VARIABLE occurs in OBJECT according to BINDINGS
     */
    @LispMethod(comment = "Return T iff VARIABLE occurs in OBJECT according to BINDINGS")
    public static final SubLObject unification_occurs_check_alt(SubLObject variable, SubLObject value, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $perform_unification_occurs_check$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.unification.unification_occurs_check_recursive(variable, value, v_bindings);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Return T iff VARIABLE occurs in OBJECT according to BINDINGS")
    public static SubLObject unification_occurs_check(final SubLObject variable, final SubLObject value, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $perform_unification_occurs_check$.getDynamicValue(thread)) {
            return unification_occurs_check_recursive(variable, value, v_bindings);
        }
        return NIL;
    }/**
     * Return T iff VARIABLE occurs in OBJECT according to BINDINGS
     */


    public static final SubLObject unification_occurs_check_recursive_alt(SubLObject variable, SubLObject v_object, SubLObject v_bindings) {
        if (variable == v_object) {
            return T;
        } else {
            if (NIL == v_object) {
                return NIL;
            } else {
                if (v_object.isCons()) {
                    {
                        SubLObject cons = NIL;
                        for (cons = v_object; !cons.isAtom(); cons = cons.rest()) {
                            {
                                SubLObject car = cons.first();
                                if (NIL != com.cyc.cycjava.cycl.unification.unification_occurs_check_recursive(variable, car, v_bindings)) {
                                    return T;
                                }
                            }
                            {
                                SubLObject cdr = cons.rest();
                                if ((!cdr.isList()) && (NIL != com.cyc.cycjava.cycl.unification.unification_occurs_check_recursive(variable, cdr, v_bindings))) {
                                    return T;
                                }
                            }
                        }
                    }
                    return NIL;
                } else {
                    if ((NIL != variables.variable_p(v_object)) && (NIL != bindings.variable_bound_p(v_object, v_bindings))) {
                        return com.cyc.cycjava.cycl.unification.unification_occurs_check_recursive(variable, bindings.variable_lookup(v_object, v_bindings), v_bindings);
                    } else {
                        return NIL;
                    }
                }
            }
        }
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

    public static final SubLObject too_many_hl_variables_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return numGE(list_utilities.tree_count_if(symbol_function(VARIABLE_P), v_object, UNPROVIDED), $variable_base_max$.getDynamicValue(thread));
        }
    }

    public static SubLObject too_many_hl_variables(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numGE(list_utilities.tree_count_if(symbol_function(VARIABLE_P), v_object, UNPROVIDED), $variable_base_max$.getDynamicValue(thread));
    }

    public static final SubLObject base_variable_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != variables.variable_p(v_object)) && variables.variable_id(v_object).numL($variable_base_max$.getDynamicValue(thread)));
        }
    }

    public static SubLObject base_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != variables.variable_p(v_object)) && variables.variable_id(v_object).numL($variable_base_max$.getDynamicValue(thread)));
    }

    public static final SubLObject non_base_variable_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != variables.variable_p(v_object)) && variables.variable_id(v_object).numGE($variable_base_max$.getDynamicValue(thread)));
        }
    }

    public static SubLObject non_base_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != variables.variable_p(v_object)) && variables.variable_id(v_object).numGE($variable_base_max$.getDynamicValue(thread)));
    }

    public static final SubLObject variable_base_version_alt(SubLObject variable) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(variable, VARIABLE_P);
            return variables.find_variable_by_id(mod(variables.variable_id(variable), $variable_base_max$.getDynamicValue(thread)));
        }
    }

    public static SubLObject variable_base_version(final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != variables.variable_p(variable) : "! variables.variable_p(variable) " + ("variables.variable_p(variable) " + "CommonSymbols.NIL != variables.variable_p(variable) ") + variable;
        return variables.find_variable_by_id(mod(variables.variable_id(variable), $variable_base_max$.getDynamicValue(thread)));
    }

    public static final SubLObject variable_non_base_version_alt(SubLObject variable) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(variable, VARIABLE_P);
            return variables.find_variable_by_id(add(mod(variables.variable_id(variable), $variable_base_max$.getDynamicValue(thread)), $variable_base_max$.getDynamicValue(thread)));
        }
    }

    public static SubLObject variable_non_base_version(final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != variables.variable_p(variable) : "! variables.variable_p(variable) " + ("variables.variable_p(variable) " + "CommonSymbols.NIL != variables.variable_p(variable) ") + variable;
        return variables.find_variable_by_id(add(mod(variables.variable_id(variable), $variable_base_max$.getDynamicValue(thread)), $variable_base_max$.getDynamicValue(thread)));
    }

    /**
     * Convert base VARIABLE to its non-base form, or vice versa.
     */
    @LispMethod(comment = "Convert base VARIABLE to its non-base form, or vice versa.")
    public static final SubLObject variable_base_inverted_version_alt(SubLObject variable) {
        if (NIL != com.cyc.cycjava.cycl.unification.base_variable_p(variable)) {
            return com.cyc.cycjava.cycl.unification.variable_non_base_version(variable);
        } else {
            return com.cyc.cycjava.cycl.unification.variable_base_version(variable);
        }
    }

    @LispMethod(comment = "Convert base VARIABLE to its non-base form, or vice versa.")
    public static SubLObject variable_base_inverted_version(final SubLObject variable) {
        if (NIL != base_variable_p(variable)) {
            return variable_non_base_version(variable);
        }
        return variable_base_version(variable);
    }/**
     * Convert base VARIABLE to its non-base form, or vice versa.
     */


    public static final SubLObject non_base_variable_transform_alt(SubLObject v_object) {
        return transform_list_utilities.transform(v_object, symbol_function(BASE_VARIABLE_P), symbol_function(VARIABLE_NON_BASE_VERSION), UNPROVIDED);
    }

    public static SubLObject non_base_variable_transform(final SubLObject v_object) {
        return transform_list_utilities.transform(v_object, symbol_function(BASE_VARIABLE_P), symbol_function(VARIABLE_NON_BASE_VERSION), UNPROVIDED);
    }

    public static final SubLObject base_variable_transform_alt(SubLObject v_object) {
        return transform_list_utilities.transform(v_object, symbol_function(NON_BASE_VARIABLE_P), symbol_function(VARIABLE_BASE_VERSION), UNPROVIDED);
    }

    public static SubLObject base_variable_transform(final SubLObject v_object) {
        return transform_list_utilities.transform(v_object, symbol_function(NON_BASE_VARIABLE_P), symbol_function(VARIABLE_BASE_VERSION), UNPROVIDED);
    }

    /**
     * Convert all base variables in OBJECT to their non-base form, and vice versa.
     */
    @LispMethod(comment = "Convert all base variables in OBJECT to their non-base form, and vice versa.")
    public static final SubLObject variable_base_inversion_alt(SubLObject v_object) {
        if (NIL != variables.variable_p(v_object)) {
            return com.cyc.cycjava.cycl.unification.variable_base_inverted_version(v_object);
        } else {
            if (v_object.isAtom()) {
                return v_object;
            } else {
                return list_utilities.recons(com.cyc.cycjava.cycl.unification.variable_base_inversion(v_object.first()), com.cyc.cycjava.cycl.unification.variable_base_inversion(v_object.rest()), v_object);
            }
        }
    }

    @LispMethod(comment = "Convert all base variables in OBJECT to their non-base form, and vice versa.")
    public static SubLObject variable_base_inversion(final SubLObject v_object) {
        if (NIL != variables.variable_p(v_object)) {
            return variable_base_inverted_version(v_object);
        }
        if (v_object.isAtom()) {
            return v_object;
        }
        return list_utilities.recons(variable_base_inversion(v_object.first()), variable_base_inversion(v_object.rest()), v_object);
    }/**
     * Convert all base variables in OBJECT to their non-base form, and vice versa.
     */


    public static final SubLObject pre_unify_replace_variables_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.unification.non_base_variable_transform(v_object);
    }

    public static SubLObject pre_unify_replace_variables(final SubLObject v_object) {
        return non_base_variable_transform(v_object);
    }

    public static final SubLObject term_variable_p_alt(SubLObject v_object) {
        return cycl_variables.el_varP(v_object);
    }

    public static SubLObject term_variable_p(final SubLObject v_object) {
        return cycl_variables.el_varP(v_object);
    }

    public static SubLObject declare_unification_file() {
        declareMacro("with_unifier_justifications", "WITH-UNIFIER-JUSTIFICATIONS");
        declareFunction("unify_possible", "UNIFY-POSSIBLE", 2, 0, false);
        declareFunction("unify_impossible", "UNIFY-IMPOSSIBLE", 2, 0, false);
        declareFunction("unify_possible_recursive", "UNIFY-POSSIBLE-RECURSIVE", 2, 0, false);
        declareFunction("unify_possible_term_variable", "UNIFY-POSSIBLE-TERM-VARIABLE", 2, 0, false);
        declareFunction("unify_possible_fort", "UNIFY-POSSIBLE-FORT", 2, 0, false);
        declareFunction("unify_possible_constant", "UNIFY-POSSIBLE-CONSTANT", 2, 0, false);
        declareFunction("unify_possible_cons", "UNIFY-POSSIBLE-CONS", 2, 0, false);
        declareFunction("unify_possible_cons_default", "UNIFY-POSSIBLE-CONS-DEFAULT", 2, 0, false);
        declareFunction("unify_possible_atom", "UNIFY-POSSIBLE-ATOM", 2, 0, false);
        declareFunction("unify", "UNIFY", 2, 2, false);
        declareFunction("unify_assuming_bindings", "UNIFY-ASSUMING-BINDINGS", 2, 3, false);
        declareFunction("unify_internal", "UNIFY-INTERNAL", 3, 0, false);
        declareFunction("unify_failure", "UNIFY-FAILURE", 2, 0, false);
        declareFunction("unify_recursive", "UNIFY-RECURSIVE", 3, 0, false);
        declareFunction("add_bindings_to_answer", "ADD-BINDINGS-TO-ANSWER", 2, 0, false);
        declareFunction("unify_recursive_internal", "UNIFY-RECURSIVE-INTERNAL", 3, 0, false);
        declareFunction("unify_variable", "UNIFY-VARIABLE", 3, 0, false);
        declareFunction("unify_term_variable", "UNIFY-TERM-VARIABLE", 3, 0, false);
        declareFunction("unify_fort", "UNIFY-FORT", 3, 0, false);
        declareFunction("unify_constant", "UNIFY-CONSTANT", 3, 0, false);
        declareFunction("unify_cons", "UNIFY-CONS", 3, 0, false);
        declareFunction("unify_cons_default", "UNIFY-CONS-DEFAULT", 3, 0, false);
        declareFunction("unify_atom", "UNIFY-ATOM", 3, 0, false);
        declareFunction("unify_possibly_justify_equals", "UNIFY-POSSIBLY-JUSTIFY-EQUALS", 2, 0, false);
        declareFunction("unification_occurs_check", "UNIFICATION-OCCURS-CHECK", 3, 0, false);
        declareFunction("unification_occurs_check_recursive", "UNIFICATION-OCCURS-CHECK-RECURSIVE", 3, 0, false);
        declareFunction("too_many_hl_variables", "TOO-MANY-HL-VARIABLES", 1, 0, false);
        declareFunction("base_variable_p", "BASE-VARIABLE-P", 1, 0, false);
        new unification.$base_variable_p$UnaryFunction();
        declareFunction("non_base_variable_p", "NON-BASE-VARIABLE-P", 1, 0, false);
        declareFunction("variable_base_version", "VARIABLE-BASE-VERSION", 1, 0, false);
        declareFunction("variable_non_base_version", "VARIABLE-NON-BASE-VERSION", 1, 0, false);
        new unification.$variable_non_base_version$UnaryFunction();
        declareFunction("variable_base_inverted_version", "VARIABLE-BASE-INVERTED-VERSION", 1, 0, false);
        declareFunction("non_base_variable_transform", "NON-BASE-VARIABLE-TRANSFORM", 1, 0, false);
        declareFunction("base_variable_transform", "BASE-VARIABLE-TRANSFORM", 1, 0, false);
        declareFunction("variable_base_inversion", "VARIABLE-BASE-INVERSION", 1, 0, false);
        declareFunction("pre_unify_replace_variables", "PRE-UNIFY-REPLACE-VARIABLES", 1, 0, false);
        declareFunction("term_variable_p", "TERM-VARIABLE-P", 1, 0, false);
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

    static {
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

    static private final SubLList $list_alt2 = list(list(makeSymbol("*UNIFY-RETURN-JUSTIFICATION?*"), T));
}

/**
 * Total time: 226 ms
 */
