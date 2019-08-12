/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-SYMMETRY
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-symmetry.lisp
 * created:     2019/07/03 17:37:44
 */
public final class removal_modules_symmetry extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_symmetry();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SYMMETRIC_LITERAL = makeSymbol("SYMMETRIC-LITERAL");

    static private final SubLList $list1 = list(makeSymbol("SYMMETRIC-ASENT"));

    static private final SubLList $list2 = list(list(makeSymbol("PERMUTED-FORMULA"), makeSymbol("SOURCE-FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list3 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym6$SOURCE_FORMULA_VAR = makeUninternedSymbol("SOURCE-FORMULA-VAR");

    private static final SubLSymbol EL_BINARY_FORMULA_P = makeSymbol("EL-BINARY-FORMULA-P");

    private static final SubLSymbol SYMMETRIC_ASENT = makeSymbol("SYMMETRIC-ASENT");

    private static final SubLSymbol FORMULA_COMMUTATIVE_PERMUTATIONS = makeSymbol("FORMULA-COMMUTATIVE-PERMUTATIONS");

    static private final SubLList $list14 = list(list(makeSymbol("PERMUTED-FORMULA"), makeSymbol("SOURCE-FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PENETRATE-ARGS?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list15 = list($DONE, makeKeyword("PENETRATE-ARGS?"));

    private static final SubLSymbol $kw16$PENETRATE_ARGS_ = makeKeyword("PENETRATE-ARGS?");

    static private final SubLSymbol $sym17$SOURCE_FORMULA_VAR = makeUninternedSymbol("SOURCE-FORMULA-VAR");

    private static final SubLSymbol CANONICAL_COMMUTATIVE_PERMUTATIONS = makeSymbol("CANONICAL-COMMUTATIVE-PERMUTATIONS");

    static private final SubLList $list19 = list(makeSymbol("FUNCTION"), makeSymbol("HL-VAR?"));





    private static final SubLString $str28$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str33$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str35$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str36$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str37$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol $sym38$HL_VAR_ = makeSymbol("HL-VAR?");



    private static final SubLSymbol $REMOVAL_SYMMETRIC_LOOKUP_POS = makeKeyword("REMOVAL-SYMMETRIC-LOOKUP-POS");

    static private final SubLList $list50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-POS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<symmetric predicate> <whatever> <whatever>)\nfrom (<symmetric predicate> <arg2> <arg1>) assertion"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$Canada #$UnitedStatesOfAmerica)") });

    private static final SubLSymbol $REMOVAL_SYMMETRIC_LOOKUP_NEG = makeKeyword("REMOVAL-SYMMETRIC-LOOKUP-NEG");

    private static final SubLList $list52 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<symmetric predicate> <whatever> <whatever>))\nfrom (#$not (<symmetric predicate> <arg2> <arg1>)) assertion") });



    private static final SubLSymbol $REMOVAL_COMMUTATIVE_LOOKUP_POS = makeKeyword("REMOVAL-COMMUTATIVE-LOOKUP-POS");

    private static final SubLList $list55 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING")), cons(list(makeKeyword("NOT"), list($TEST, makeSymbol("BINARY-PREDICATE?"))), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-POS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(#$collinear <some point> <some other point> <some other other point>)") });

    private static final SubLSymbol $REMOVAL_COMMUTATIVE_LOOKUP_NEG = makeKeyword("REMOVAL-COMMUTATIVE-LOOKUP-NEG");

    private static final SubLList $list57 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING")), cons(list(makeKeyword("NOT"), list($TEST, makeSymbol("BINARY-PREDICATE?"))), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(#$not (#$collinear <some point> <some other point> <some other other point>))") });



    private static final SubLSymbol $REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS = makeKeyword("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS");

    private static final SubLList $list60 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING")), cons(list(makeKeyword("NOT"), list($TEST, makeSymbol("BINARY-PREDICATE?"))), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("DOCUMENTATION"), makeString("(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\n    from \n    (distanceBetween Sun PlanetEarth ((Mega Mile) 93))") });

    private static final SubLSymbol $REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG = makeKeyword("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG");

    private static final SubLList $list62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING")), cons(list(makeKeyword("NOT"), list($TEST, makeSymbol("BINARY-PREDICATE?"))), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("DOCUMENTATION"), makeString("(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\n    from \n    (not (distanceBetween Sun PlanetEarth (Inch 93)))") });



    private static final SubLSymbol $REMOVAL_ASYMMETRIC_LOOKUP = makeKeyword("REMOVAL-ASYMMETRIC-LOOKUP");

    private static final SubLList $list65 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("NOT"), $FORT), list(makeKeyword("NOT"), $FORT)), cons(list($TEST, makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-ASYMMETRIC-LOOKUP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASYMMETRIC-LOOKUP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASYMMETRIC-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASYMMETRIC-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<asymmetric predicate> <non-fort> <non-fort>))\nfrom (<asymmetric predicate> <arg2> <arg1>) assertion.\nNB: the case in which either arg is a FORT is subsumed by\nnegationInverse modules."), makeKeyword("EXAMPLE"), makeString("(#$not (#$northOf #$UnitedStatesOfAmerica #$Canada))") });

    // Definitions
    public static final SubLObject symmetric_asent_alt(SubLObject asent) {
        return list(cycl_utilities.atomic_sentence_predicate(asent), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    // Definitions
    public static SubLObject symmetric_asent(final SubLObject asent) {
        return list(cycl_utilities.atomic_sentence_predicate(asent), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static final SubLObject symmetric_literal_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.symmetric_asent(asent);
    }

    public static SubLObject symmetric_literal(final SubLObject asent) {
        return symmetric_asent(asent);
    }

    /**
     * Does not iterate over the null permutation which is equal to SOURCE-FORMULA
     */
    @LispMethod(comment = "Does not iterate over the null permutation which is equal to SOURCE-FORMULA")
    public static final SubLObject do_formula_commutative_permutations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject permuted_formula = NIL;
                    SubLObject source_formula = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    permuted_formula = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    source_formula = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt2);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt2);
                            if (NIL == member(current_1, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt2);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject source_formula_var = $sym6$SOURCE_FORMULA_VAR;
                                return list(CLET, list(list(source_formula_var, source_formula)), list(PIF, list(EL_BINARY_FORMULA_P, source_formula_var), listS(CLET, list(list(permuted_formula, list(SYMMETRIC_ASENT, source_formula_var))), append(body, NIL)), list(DO_LIST, list(permuted_formula, list(FORMULA_COMMUTATIVE_PERMUTATIONS, source_formula_var), $DONE, done), listS(PUNLESS, list(EQUAL, permuted_formula, source_formula_var), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Does not iterate over the null permutation which is equal to SOURCE-FORMULA
     */
    @LispMethod(comment = "Does not iterate over the null permutation which is equal to SOURCE-FORMULA")
    public static SubLObject do_formula_commutative_permutations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject permuted_formula = NIL;
        SubLObject source_formula = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        permuted_formula = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        source_formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list2);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list2);
            if (NIL == member(current_$1, $list3, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list2);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject source_formula_var = $sym6$SOURCE_FORMULA_VAR;
        return list(CLET, list(list(source_formula_var, source_formula)), list(PIF, list(EL_BINARY_FORMULA_P, source_formula_var), listS(CLET, list(list(permuted_formula, list(SYMMETRIC_ASENT, source_formula_var))), append(body, NIL)), list(DO_LIST, list(permuted_formula, list(FORMULA_COMMUTATIVE_PERMUTATIONS, source_formula_var), $DONE, done), listS(PUNLESS, list(EQUAL, permuted_formula, source_formula_var), append(body, NIL)))));
    }

    /**
     * Does not iterate over the null permutation which is equal to SOURCE-FORMULA
     */
    @LispMethod(comment = "Does not iterate over the null permutation which is equal to SOURCE-FORMULA")
    public static final SubLObject do_formula_canonical_commutative_permutations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject permuted_formula = NIL;
                    SubLObject source_formula = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    permuted_formula = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    source_formula = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt14);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt14);
                            if (NIL == member(current_2, $list_alt15, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt14);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject penetrate_argsP_tail = property_list_member($kw16$PENETRATE_ARGS_, current);
                            SubLObject penetrate_argsP = (NIL != penetrate_argsP_tail) ? ((SubLObject) (cadr(penetrate_argsP_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject source_formula_var = $sym17$SOURCE_FORMULA_VAR;
                                return list(CLET, list(list(source_formula_var, source_formula)), listS(DO_LIST, list(permuted_formula, list(CANONICAL_COMMUTATIVE_PERMUTATIONS, source_formula_var, $list_alt19, penetrate_argsP), $DONE, done), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Does not iterate over the null permutation which is equal to SOURCE-FORMULA
     */
    @LispMethod(comment = "Does not iterate over the null permutation which is equal to SOURCE-FORMULA")
    public static SubLObject do_formula_canonical_commutative_permutations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject permuted_formula = NIL;
        SubLObject source_formula = NIL;
        destructuring_bind_must_consp(current, datum, $list14);
        permuted_formula = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        source_formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list14);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list14);
            if (NIL == member(current_$2, $list15, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list14);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject penetrate_argsP_tail = property_list_member($kw16$PENETRATE_ARGS_, current);
        final SubLObject penetrate_argsP = (NIL != penetrate_argsP_tail) ? cadr(penetrate_argsP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject source_formula_var = $sym17$SOURCE_FORMULA_VAR;
        return list(CLET, list(list(source_formula_var, source_formula)), listS(DO_LIST, list(permuted_formula, list(CANONICAL_COMMUTATIVE_PERMUTATIONS, source_formula_var, $list19, penetrate_argsP), $DONE, done), append(body, NIL)));
    }

    public static final SubLObject commutative_in_args_supports_alt(SubLObject predicate) {
        {
            SubLObject assertions = NIL;
            {
                SubLObject pred_var = $$commutativeInArgs;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                if (NIL != valid) {
                                    {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            {
                                                SubLObject done_var_3 = NIL;
                                                SubLObject token_var_4 = NIL;
                                                while (NIL == done_var_3) {
                                                    {
                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                        SubLObject valid_5 = makeBoolean(token_var_4 != ass);
                                                        if (NIL != valid_5) {
                                                            assertions = cons(ass, assertions);
                                                        }
                                                        done_var_3 = makeBoolean(NIL == valid_5);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                }
            }
            {
                SubLObject pred_var = $$commutativeInArgsAndRest;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                if (NIL != valid) {
                                    {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            {
                                                SubLObject done_var_6 = NIL;
                                                SubLObject token_var_7 = NIL;
                                                while (NIL == done_var_6) {
                                                    {
                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                        SubLObject valid_8 = makeBoolean(token_var_7 != ass);
                                                        if (NIL != valid_8) {
                                                            assertions = cons(ass, assertions);
                                                        }
                                                        done_var_6 = makeBoolean(NIL == valid_8);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                }
            }
            return nreverse(assertions);
        }
    }

    public static SubLObject commutative_in_args_supports(final SubLObject predicate) {
        SubLObject assertions = NIL;
        SubLObject pred_var = $$commutativeInArgs;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$3 = NIL;
                        final SubLObject token_var_$4 = NIL;
                        while (NIL == done_var_$3) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(ass));
                            if (NIL != valid_$5) {
                                assertions = cons(ass, assertions);
                            }
                            done_var_$3 = makeBoolean(NIL == valid_$5);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        pred_var = $$commutativeInArgsAndRest;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$4 = NIL;
                        final SubLObject token_var_$5 = NIL;
                        while (NIL == done_var_$4) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(ass));
                            if (NIL != valid_$6) {
                                assertions = cons(ass, assertions);
                            }
                            done_var_$4 = makeBoolean(NIL == valid_$6);
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return nreverse(assertions);
    }

    public static final SubLObject removal_commutativity_lookup_cost_alt(SubLObject asent, SubLObject truth) {
        return NIL != variables.fully_bound_p(asent) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_check_cost(asent, truth))) : com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_generate_cost(asent, truth);
    }

    public static SubLObject removal_commutativity_lookup_cost(final SubLObject asent, final SubLObject truth) {
        return NIL != variables.fully_bound_p(asent) ? removal_commutativity_check_cost(asent, truth) : removal_commutativity_generate_cost(asent, truth);
    }

    public static final SubLObject removal_commutativity_check_cost_alt(SubLObject asent, SubLObject truth) {
        return $expensive_hl_module_check_cost$.getGlobalValue();
    }

    public static SubLObject removal_commutativity_check_cost(final SubLObject asent, final SubLObject truth) {
        return $expensive_hl_module_check_cost$.getGlobalValue();
    }

    public static final SubLObject removal_commutativity_generate_cost_alt(SubLObject asent, SubLObject truth) {
        {
            SubLObject cost = ZERO_INTEGER;
            SubLObject source_formula_var = asent;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, symbol_function($sym23$HL_VAR_), NIL);
            SubLObject permuted_asent = NIL;
            for (permuted_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , permuted_asent = cdolist_list_var.first()) {
                cost = add(cost, kb_indexing.num_best_gaf_lookup_index(permuted_asent, truth, UNPROVIDED));
            }
            return cost;
        }
    }

    public static SubLObject removal_commutativity_generate_cost(final SubLObject asent, final SubLObject truth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = ZERO_INTEGER;
        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(asent, symbol_function($sym38$HL_VAR_), NIL);
        SubLObject permuted_asent = NIL;
        permuted_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(permuted_asent);
            if (NIL != forts.fort_p(pred)) {
                final SubLObject node_var = pred;
                final SubLObject deck_type = $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str28$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str28$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str28$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str33$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str28$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$15 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$15;
                                            final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$15)) {
                                                    cost = add(cost, kb_indexing.num_best_gaf_lookup_index(replace_formula_arg(ZERO_INTEGER, spec_pred, permuted_asent), truth, UNPROVIDED));
                                                }
                                                SubLObject cdolist_list_var_$17;
                                                final SubLObject accessible_modules = cdolist_list_var_$17 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var_$17.first();
                                                while (NIL != cdolist_list_var_$17) {
                                                    final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$15);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$21;
                                                                                for (iteration_state_$21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$21); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next(iteration_state_$21)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$21);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$21);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str36$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$18;
                                                                final SubLObject new_list = cdolist_list_var_$18 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$18.first();
                                                                while (NIL != cdolist_list_var_$18) {
                                                                    final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                                                    }
                                                                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                                                    generating_fn = cdolist_list_var_$18.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                                    module_var = cdolist_list_var_$17.first();
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$14, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$12, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$11, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str37$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$11, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$10, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$9, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            } else {
                cost = add(cost, kb_indexing.num_best_gaf_lookup_index(permuted_asent, truth, UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            permuted_asent = cdolist_list_var.first();
        } 
        return cost;
    }

    public static final SubLObject removal_commutativity_lookup_iterator_alt(SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject source_formula_var = asent;
                SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, symbol_function($sym23$HL_VAR_), NIL);
                SubLObject permuted_asent = NIL;
                for (permuted_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , permuted_asent = cdolist_list_var.first()) {
                    {
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_asent, sense);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                        {
                                                                            SubLObject done_var_9 = NIL;
                                                                            SubLObject token_var_10 = NIL;
                                                                            while (NIL == done_var_9) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                                                    SubLObject valid_11 = makeBoolean(token_var_10 != assertion);
                                                                                    if (NIL != valid_11) {
                                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != v_bindings) {
                                                                                                    result = cons(list(v_bindings, assertion), result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_9 = makeBoolean(NIL == valid_11);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                        {
                                                                            SubLObject done_var_12 = NIL;
                                                                            SubLObject token_var_13 = NIL;
                                                                            while (NIL == done_var_12) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_13);
                                                                                    SubLObject valid_14 = makeBoolean(token_var_13 != assertion);
                                                                                    if (NIL != valid_14) {
                                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != v_bindings) {
                                                                                                    result = cons(list(v_bindings, assertion), result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_12 = makeBoolean(NIL == valid_14);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                        {
                                                                            SubLObject done_var_15 = NIL;
                                                                            SubLObject token_var_16 = NIL;
                                                                            while (NIL == done_var_15) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_16);
                                                                                    SubLObject valid_17 = makeBoolean(token_var_16 != assertion);
                                                                                    if (NIL != valid_17) {
                                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != v_bindings) {
                                                                                                    result = cons(list(v_bindings, assertion), result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_15 = makeBoolean(NIL == valid_17);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                        {
                                                                            SubLObject done_var_18 = NIL;
                                                                            SubLObject token_var_19 = NIL;
                                                                            while (NIL == done_var_18) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
                                                                                    SubLObject valid_20 = makeBoolean(token_var_19 != assertion);
                                                                                    if (NIL != valid_20) {
                                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != v_bindings) {
                                                                                                    result = cons(list(v_bindings, assertion), result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_18 = makeBoolean(NIL == valid_20);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                {
                                                                    SubLObject done_var_21 = NIL;
                                                                    SubLObject token_var_22 = NIL;
                                                                    while (NIL == done_var_21) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_22);
                                                                            SubLObject valid_23 = makeBoolean(token_var_22 != assertion);
                                                                            if (NIL != valid_23) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                        SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                        SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != v_bindings) {
                                                                                            result = cons(list(v_bindings, assertion), result);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_21 = makeBoolean(NIL == valid_23);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject cdolist_list_var_24 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , assertion = cdolist_list_var_24.first()) {
                                            if ((NIL == enumeration_types.sense_truth(sense)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(sense)))) {
                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                        SubLObject gaf_asent = thread.secondMultipleValue();
                                                        SubLObject unify_justification = thread.thirdMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != v_bindings) {
                                                            result = cons(list(v_bindings, assertion), result);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
                if (NIL != result) {
                    return iteration.new_list_iterator(result);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_commutativity_lookup_iterator(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(pred)) {
            final SubLObject node_var = pred;
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str28$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str28$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str28$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str33$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str28$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$27 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$28 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$29 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$32 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$32;
                                        final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$32)) {
                                                if (NIL != kb_utilities.kbeq(spec_pred, pred)) {
                                                    SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(asent, symbol_function($sym38$HL_VAR_), NIL);
                                                    SubLObject permuted_asent = NIL;
                                                    permuted_asent = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        result = append(result, removal_commutativity_lookup_helper(replace_formula_arg(ZERO_INTEGER, spec_pred, permuted_asent), sense));
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        permuted_asent = cdolist_list_var.first();
                                                    } 
                                                } else
                                                    if (NIL != el_binary_formula_p(asent)) {
                                                        final SubLObject permuted_asent2 = symmetric_asent(asent);
                                                        result = append(result, removal_commutativity_lookup_helper(replace_formula_arg(ZERO_INTEGER, spec_pred, permuted_asent2), sense));
                                                    } else {
                                                        SubLObject cdolist_list_var = cycl_utilities.formula_commutative_permutations(asent, UNPROVIDED);
                                                        SubLObject permuted_asent = NIL;
                                                        permuted_asent = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            if (!permuted_asent.equal(asent)) {
                                                                result = append(result, removal_commutativity_lookup_helper(replace_formula_arg(ZERO_INTEGER, spec_pred, permuted_asent), sense));
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            permuted_asent = cdolist_list_var.first();
                                                        } 
                                                    }

                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$30 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$32);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$37;
                                                                            for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$32, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$31, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str36$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$39;
                                                            final SubLObject new_list = cdolist_list_var_$39 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$39.first();
                                                            while (NIL != cdolist_list_var_$39) {
                                                                final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$33, thread);
                                                                }
                                                                cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                                                                generating_fn = cdolist_list_var_$39.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$30, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$30, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$29, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$31, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$29, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$28, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str37$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$28, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$27, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$26, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        } else {
            SubLObject cdolist_list_var2 = cycl_utilities.canonical_commutative_permutations(asent, symbol_function($sym38$HL_VAR_), NIL);
            SubLObject permuted_asent3 = NIL;
            permuted_asent3 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                result = append(result, removal_commutativity_lookup_helper(permuted_asent3, sense));
                cdolist_list_var2 = cdolist_list_var2.rest();
                permuted_asent3 = cdolist_list_var2.first();
            } 
        }
        return iteration.new_inference_list_iterator(result);
    }

    public static SubLObject removal_commutativity_lookup_helper(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$42 = NIL;
                                    final SubLObject token_var_$43 = NIL;
                                    while (NIL == done_var_$42) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                        final SubLObject valid_$44 = makeBoolean(!token_var_$43.eql(assertion));
                                        if ((NIL != valid_$44) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), T, T);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                result = cons(list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$42 = makeBoolean(NIL == valid_$44);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$43 = NIL;
                                    final SubLObject token_var_$44 = NIL;
                                    while (NIL == done_var_$43) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                        final SubLObject valid_$45 = makeBoolean(!token_var_$44.eql(assertion));
                                        if ((NIL != valid_$45) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), T, T);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                result = cons(list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$43 = makeBoolean(NIL == valid_$45);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$44 = NIL;
                                    final SubLObject token_var_$45 = NIL;
                                    while (NIL == done_var_$44) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$45);
                                        final SubLObject valid_$46 = makeBoolean(!token_var_$45.eql(assertion));
                                        if ((NIL != valid_$46) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), T, T);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                result = cons(list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$44 = makeBoolean(NIL == valid_$46);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$45 = NIL;
                                    final SubLObject token_var_$46 = NIL;
                                    while (NIL == done_var_$45) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                        final SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(assertion));
                                        if ((NIL != valid_$47) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), T, T);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                result = cons(list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$45 = makeBoolean(NIL == valid_$47);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$46 = NIL;
                                    final SubLObject token_var_$47 = NIL;
                                    while (NIL == done_var_$46) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$47);
                                        final SubLObject valid_$48 = makeBoolean(!token_var_$47.eql(assertion2));
                                        if ((NIL != valid_$48) && (NIL != backward_utilities.direction_is_relevant(assertion2))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion2), T, T);
                                            final SubLObject gaf_asent2 = thread.secondMultipleValue();
                                            final SubLObject unify_justification2 = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings2) {
                                                result = cons(list(v_bindings2, assertion2), result);
                                            }
                                        }
                                        done_var_$46 = makeBoolean(NIL == valid_$48);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (((NIL == enumeration_types.sense_truth(sense)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense)))) && (NIL != backward_utilities.direction_is_relevant(assertion3))) {
                            thread.resetMultipleValues();
                            final SubLObject v_bindings3 = unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion3), T, T);
                            final SubLObject gaf_asent3 = thread.secondMultipleValue();
                            final SubLObject unify_justification3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings3) {
                                result = cons(list(v_bindings3, assertion3), result);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        return result;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("SYMMETRIC-ASENT"));

    static private final SubLList $list_alt2 = list(list(makeSymbol("PERMUTED-FORMULA"), makeSymbol("SOURCE-FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list($DONE);

    static private final SubLList $list_alt14 = list(list(makeSymbol("PERMUTED-FORMULA"), makeSymbol("SOURCE-FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PENETRATE-ARGS?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt15 = list($DONE, makeKeyword("PENETRATE-ARGS?"));

    static private final SubLList $list_alt19 = list(makeSymbol("FUNCTION"), makeSymbol("HL-VAR?"));

    static private final SubLSymbol $sym23$HL_VAR_ = makeSymbol("HL-VAR?");

    static private final SubLList $list_alt35 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-POS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<symmetric predicate> <whatever> <whatever>)\nfrom (<symmetric predicate> <arg2> <arg1>) assertion"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$Canada #$UnitedStatesOfAmerica)") });

    static private final SubLList $list_alt37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-SYMMETRIC-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<symmetric predicate> <whatever> <whatever>))\nfrom (#$not (<symmetric predicate> <arg2> <arg1>)) assertion") });

    static private final SubLList $list_alt40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-POS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(#$collinear <some point> <some other point> <some other other point>)") });

    static private final SubLList $list_alt42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(#$not (#$collinear <some point> <some other point> <some other other point>))") });

    static private final SubLList $list_alt45 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\n    from \n    (distanceBetween Sun PlanetEarth ((Mega Mile) 93))") });

    static private final SubLList $list_alt47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\n    from \n    (not (distanceBetween Sun PlanetEarth (Inch 93)))") });

    static private final SubLList $list_alt50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("NOT"), $FORT), list(makeKeyword("NOT"), $FORT)), cons(list($TEST, makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-ASYMMETRIC-LOOKUP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASYMMETRIC-LOOKUP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASYMMETRIC-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASYMMETRIC-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<asymmetric predicate> <non-fort> <non-fort>))\nfrom (<asymmetric predicate> <arg2> <arg1>) assertion.\nNB: the case in which either arg is a FORT is subsumed by\nnegationInverse modules."), makeKeyword("EXAMPLE"), makeString("(#$not (#$northOf #$UnitedStatesOfAmerica #$Canada))") });

    public static final SubLObject removal_symmetric_lookup_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_cost(asent, $TRUE);
    }

    public static SubLObject removal_symmetric_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_commutativity_lookup_cost(asent, $TRUE);
    }

    public static final SubLObject removal_symmetric_lookup_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_cost(asent, $FALSE);
    }

    public static SubLObject removal_symmetric_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_commutativity_lookup_cost(asent, $FALSE);
    }

    public static final SubLObject removal_symmetric_lookup_neg_completeness_alt(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        } else {
            return $INCOMPLETE;
        }
    }

    public static SubLObject removal_symmetric_lookup_neg_completeness(final SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    public static final SubLObject removal_symmetric_lookup_pos_iterator_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_iterator(asent, $POS);
    }

    public static SubLObject removal_symmetric_lookup_pos_iterator(final SubLObject asent) {
        return removal_commutativity_lookup_iterator(asent, $POS);
    }

    public static final SubLObject removal_symmetric_lookup_neg_iterator_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_iterator(asent, $NEG);
    }

    public static SubLObject removal_symmetric_lookup_neg_iterator(final SubLObject asent) {
        return removal_commutativity_lookup_iterator(asent, $NEG);
    }

    public static final SubLObject removal_symmetric_supports_alt(SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_predicate(assertion);
            return list(assertion, removal_module_utilities.additional_isa_support(predicate, $$SymmetricBinaryPredicate));
        }
    }

    public static SubLObject removal_symmetric_supports(final SubLObject assertion) {
        final SubLObject predicate = assertions_high.gaf_predicate(assertion);
        return list(assertion, removal_module_utilities.additional_isa_support(predicate, $$SymmetricBinaryPredicate));
    }

    public static final SubLObject removal_commutative_lookup_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_cost(asent, $TRUE);
    }

    public static SubLObject removal_commutative_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_commutativity_lookup_cost(asent, $TRUE);
    }

    public static final SubLObject removal_commutative_lookup_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_cost(asent, $FALSE);
    }

    public static SubLObject removal_commutative_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_commutativity_lookup_cost(asent, $FALSE);
    }

    public static final SubLObject removal_commutative_lookup_neg_completeness_alt(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        } else {
            return $INCOMPLETE;
        }
    }

    public static SubLObject removal_commutative_lookup_neg_completeness(final SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    public static final SubLObject removal_commutative_lookup_pos_iterator_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_iterator(asent, $POS);
    }

    public static SubLObject removal_commutative_lookup_pos_iterator(final SubLObject asent) {
        return removal_commutativity_lookup_iterator(asent, $POS);
    }

    public static final SubLObject removal_commutative_lookup_neg_iterator_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_iterator(asent, $NEG);
    }

    public static SubLObject removal_commutative_lookup_neg_iterator(final SubLObject asent) {
        return removal_commutativity_lookup_iterator(asent, $NEG);
    }

    public static final SubLObject removal_commutative_supports_alt(SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_predicate(assertion);
            return list(assertion, removal_module_utilities.additional_isa_support(predicate, $$CommutativePredicate));
        }
    }

    public static SubLObject removal_commutative_supports(final SubLObject assertion) {
        final SubLObject predicate = assertions_high.gaf_predicate(assertion);
        return list(assertion, removal_module_utilities.additional_isa_support(predicate, $$CommutativePredicate));
    }

    public static final SubLObject removal_partially_commutative_lookup_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_cost(asent, $TRUE);
    }

    public static SubLObject removal_partially_commutative_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_commutativity_lookup_cost(asent, $TRUE);
    }

    public static final SubLObject removal_partially_commutative_lookup_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_cost(asent, $FALSE);
    }

    public static SubLObject removal_partially_commutative_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_commutativity_lookup_cost(asent, $FALSE);
    }

    public static final SubLObject removal_partially_commutative_lookup_neg_completeness_alt(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        } else {
            return $INCOMPLETE;
        }
    }

    public static SubLObject removal_partially_commutative_lookup_neg_completeness(final SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    public static final SubLObject removal_partially_commutative_lookup_pos_iterator_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_iterator(asent, $POS);
    }

    public static SubLObject removal_partially_commutative_lookup_pos_iterator(final SubLObject asent) {
        return removal_commutativity_lookup_iterator(asent, $POS);
    }

    public static final SubLObject removal_partially_commutative_lookup_neg_iterator_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_iterator(asent, $NEG);
    }

    public static SubLObject removal_partially_commutative_lookup_neg_iterator(final SubLObject asent) {
        return removal_commutativity_lookup_iterator(asent, $NEG);
    }

    public static final SubLObject removal_partially_commutative_supports(SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_predicate(assertion);
            SubLObject isa_support = removal_module_utilities.additional_isa_support(predicate, $$PartiallyCommutativePredicate);
            SubLObject supports = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.commutative_in_args_supports(predicate);
            return append(list(assertion, isa_support), supports);
        }
    }

    public static SubLObject removal_partially_commutative_supports(final SubLObject assertion, final SubLObject asent) {
        final SubLObject predicate = assertions_high.gaf_predicate(assertion);
        final SubLObject isa_support = removal_module_utilities.additional_isa_support(predicate, $$PartiallyCommutativePredicate);
        SubLObject supports = commutative_in_args_supports(predicate);
        final SubLObject assertion_predicate = assertions_high.gaf_predicate(assertion);
        final SubLObject asent_predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (((NIL != forts.fort_p(assertion_predicate)) && (NIL != forts.fort_p(asent_predicate))) && (NIL == kb_utilities.kbeq(assertion_predicate, asent_predicate))) {
            supports = cons(removal_module_utilities.make_genl_preds_support(assertion_predicate, asent_predicate), supports);
        }
        return append(list(assertion, isa_support), supports);
    }

    public static final SubLObject removal_asymmetric_lookup_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.removal_commutativity_lookup_cost(asent, $TRUE);
    }

    public static SubLObject removal_asymmetric_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_commutativity_lookup_cost(asent, $TRUE);
    }

    public static final SubLObject removal_asymmetric_lookup_completeness_alt(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        } else {
            return $INCOMPLETE;
        }
    }

    public static SubLObject removal_asymmetric_lookup_completeness(final SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    public static final SubLObject removal_asymmetric_lookup_iterator_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject symmetric_asent = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.symmetric_asent(asent);
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(symmetric_asent, $POS);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_25 = NIL;
                                                                    SubLObject token_var_26 = NIL;
                                                                    while (NIL == done_var_25) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_26);
                                                                            SubLObject valid_27 = makeBoolean(token_var_26 != assertion);
                                                                            if (NIL != valid_27) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                        SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                        SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != v_bindings) {
                                                                                            result = cons(list(v_bindings, assertion), result);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_25 = makeBoolean(NIL == valid_27);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_28 = NIL;
                                                                    SubLObject token_var_29 = NIL;
                                                                    while (NIL == done_var_28) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_29);
                                                                            SubLObject valid_30 = makeBoolean(token_var_29 != assertion);
                                                                            if (NIL != valid_30) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                        SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                        SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != v_bindings) {
                                                                                            result = cons(list(v_bindings, assertion), result);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_28 = makeBoolean(NIL == valid_30);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            }
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_31 = NIL;
                                                                    SubLObject token_var_32 = NIL;
                                                                    while (NIL == done_var_31) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_32);
                                                                            SubLObject valid_33 = makeBoolean(token_var_32 != assertion);
                                                                            if (NIL != valid_33) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                        SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                        SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != v_bindings) {
                                                                                            result = cons(list(v_bindings, assertion), result);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_31 = makeBoolean(NIL == valid_33);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_34 = NIL;
                                                                    SubLObject token_var_35 = NIL;
                                                                    while (NIL == done_var_34) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_35);
                                                                            SubLObject valid_36 = makeBoolean(token_var_35 != assertion);
                                                                            if (NIL != valid_36) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                        SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                        SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != v_bindings) {
                                                                                            result = cons(list(v_bindings, assertion), result);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_34 = makeBoolean(NIL == valid_36);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                        {
                                                            SubLObject done_var_37 = NIL;
                                                            SubLObject token_var_38 = NIL;
                                                            while (NIL == done_var_37) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                                                                    SubLObject valid_39 = makeBoolean(token_var_38 != assertion);
                                                                    if (NIL != valid_39) {
                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != v_bindings) {
                                                                                    result = cons(list(v_bindings, assertion), result);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_37 = makeBoolean(NIL == valid_39);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings) {
                                                    result = cons(list(v_bindings, assertion), result);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
                if (NIL != result) {
                    return iteration.new_list_iterator(result);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asymmetric_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject symmetric_asent = symmetric_asent(asent);
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(symmetric_asent, $POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$58 = NIL;
                                    final SubLObject token_var_$59 = NIL;
                                    while (NIL == done_var_$58) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                        final SubLObject valid_$60 = makeBoolean(!token_var_$59.eql(assertion));
                                        if ((NIL != valid_$60) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                result = cons(list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$58 = makeBoolean(NIL == valid_$60);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$59 = NIL;
                                    final SubLObject token_var_$60 = NIL;
                                    while (NIL == done_var_$59) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$60);
                                        final SubLObject valid_$61 = makeBoolean(!token_var_$60.eql(assertion));
                                        if ((NIL != valid_$61) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                result = cons(list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$59 = makeBoolean(NIL == valid_$61);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$60 = NIL;
                                    final SubLObject token_var_$61 = NIL;
                                    while (NIL == done_var_$60) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$61);
                                        final SubLObject valid_$62 = makeBoolean(!token_var_$61.eql(assertion));
                                        if ((NIL != valid_$62) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                result = cons(list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$60 = makeBoolean(NIL == valid_$62);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$61 = NIL;
                                    final SubLObject token_var_$62 = NIL;
                                    while (NIL == done_var_$61) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$62);
                                        final SubLObject valid_$63 = makeBoolean(!token_var_$62.eql(assertion));
                                        if ((NIL != valid_$63) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion), T, T);
                                            final SubLObject gaf_asent = thread.secondMultipleValue();
                                            final SubLObject unify_justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                result = cons(list(v_bindings, assertion), result);
                                            }
                                        }
                                        done_var_$61 = makeBoolean(NIL == valid_$63);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$62 = NIL;
                                    final SubLObject token_var_$63 = NIL;
                                    while (NIL == done_var_$62) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$63);
                                        final SubLObject valid_$64 = makeBoolean(!token_var_$63.eql(assertion2));
                                        if ((NIL != valid_$64) && (NIL != backward_utilities.direction_is_relevant(assertion2))) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion2), T, T);
                                            final SubLObject gaf_asent2 = thread.secondMultipleValue();
                                            final SubLObject unify_justification2 = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings2) {
                                                result = cons(list(v_bindings2, assertion2), result);
                                            }
                                        }
                                        done_var_$62 = makeBoolean(NIL == valid_$64);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) && (NIL != backward_utilities.direction_is_relevant(assertion3))) {
                            thread.resetMultipleValues();
                            final SubLObject v_bindings3 = unification_utilities.gaf_asent_unify(symmetric_asent, assertions_high.gaf_formula(assertion3), T, T);
                            final SubLObject gaf_asent3 = thread.secondMultipleValue();
                            final SubLObject unify_justification3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings3) {
                                result = cons(list(v_bindings3, assertion3), result);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    public static final SubLObject removal_asymmetric_supports_alt(SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_predicate(assertion);
            return list(assertion, removal_module_utilities.additional_isa_support(predicate, $$AsymmetricBinaryPredicate));
        }
    }

    public static SubLObject removal_asymmetric_supports(final SubLObject assertion) {
        final SubLObject predicate = assertions_high.gaf_predicate(assertion);
        return list(assertion, removal_module_utilities.additional_isa_support(predicate, $$AsymmetricBinaryPredicate));
    }

    public static final SubLObject declare_removal_modules_symmetry_file_alt() {
        declareFunction("symmetric_asent", "SYMMETRIC-ASENT", 1, 0, false);
        declareFunction("symmetric_literal", "SYMMETRIC-LITERAL", 1, 0, false);
        declareMacro("do_formula_commutative_permutations", "DO-FORMULA-COMMUTATIVE-PERMUTATIONS");
        declareMacro("do_formula_canonical_commutative_permutations", "DO-FORMULA-CANONICAL-COMMUTATIVE-PERMUTATIONS");
        declareFunction("commutative_in_args_supports", "COMMUTATIVE-IN-ARGS-SUPPORTS", 1, 0, false);
        declareFunction("removal_commutativity_lookup_cost", "REMOVAL-COMMUTATIVITY-LOOKUP-COST", 2, 0, false);
        declareFunction("removal_commutativity_check_cost", "REMOVAL-COMMUTATIVITY-CHECK-COST", 2, 0, false);
        declareFunction("removal_commutativity_generate_cost", "REMOVAL-COMMUTATIVITY-GENERATE-COST", 2, 0, false);
        declareFunction("removal_commutativity_lookup_iterator", "REMOVAL-COMMUTATIVITY-LOOKUP-ITERATOR", 2, 0, false);
        declareFunction("removal_symmetric_lookup_pos_cost", "REMOVAL-SYMMETRIC-LOOKUP-POS-COST", 1, 1, false);
        new com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.$removal_symmetric_lookup_pos_cost$UnaryFunction();
        new com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.$removal_symmetric_lookup_pos_cost$BinaryFunction();
        declareFunction("removal_symmetric_lookup_neg_cost", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_symmetric_lookup_neg_completeness", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction("removal_symmetric_lookup_pos_iterator", "REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.$removal_symmetric_lookup_pos_iterator$UnaryFunction();
        declareFunction("removal_symmetric_lookup_neg_iterator", "REMOVAL-SYMMETRIC-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction("removal_symmetric_supports", "REMOVAL-SYMMETRIC-SUPPORTS", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry.$removal_symmetric_supports$UnaryFunction();
        declareFunction("removal_commutative_lookup_pos_cost", "REMOVAL-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_commutative_lookup_neg_cost", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_commutative_lookup_neg_completeness", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction("removal_commutative_lookup_pos_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false);
        declareFunction("removal_commutative_lookup_neg_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction("removal_commutative_supports", "REMOVAL-COMMUTATIVE-SUPPORTS", 1, 0, false);
        declareFunction("removal_partially_commutative_lookup_pos_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_partially_commutative_lookup_neg_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_partially_commutative_lookup_neg_completeness", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction("removal_partially_commutative_lookup_pos_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false);
        declareFunction("removal_partially_commutative_lookup_neg_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction("removal_partially_commutative_supports", "REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS", 1, 0, false);
        declareFunction("removal_asymmetric_lookup_cost", "REMOVAL-ASYMMETRIC-LOOKUP-COST", 1, 1, false);
        declareFunction("removal_asymmetric_lookup_completeness", "REMOVAL-ASYMMETRIC-LOOKUP-COMPLETENESS", 1, 0, false);
        declareFunction("removal_asymmetric_lookup_iterator", "REMOVAL-ASYMMETRIC-LOOKUP-ITERATOR", 1, 0, false);
        declareFunction("removal_asymmetric_supports", "REMOVAL-ASYMMETRIC-SUPPORTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_removal_modules_symmetry_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("symmetric_asent", "SYMMETRIC-ASENT", 1, 0, false);
            declareFunction("symmetric_literal", "SYMMETRIC-LITERAL", 1, 0, false);
            declareMacro("do_formula_commutative_permutations", "DO-FORMULA-COMMUTATIVE-PERMUTATIONS");
            declareMacro("do_formula_canonical_commutative_permutations", "DO-FORMULA-CANONICAL-COMMUTATIVE-PERMUTATIONS");
            declareFunction("commutative_in_args_supports", "COMMUTATIVE-IN-ARGS-SUPPORTS", 1, 0, false);
            declareFunction("removal_commutativity_lookup_cost", "REMOVAL-COMMUTATIVITY-LOOKUP-COST", 2, 0, false);
            declareFunction("removal_commutativity_check_cost", "REMOVAL-COMMUTATIVITY-CHECK-COST", 2, 0, false);
            declareFunction("removal_commutativity_generate_cost", "REMOVAL-COMMUTATIVITY-GENERATE-COST", 2, 0, false);
            declareFunction("removal_commutativity_lookup_iterator", "REMOVAL-COMMUTATIVITY-LOOKUP-ITERATOR", 2, 0, false);
            declareFunction("removal_commutativity_lookup_helper", "REMOVAL-COMMUTATIVITY-LOOKUP-HELPER", 2, 0, false);
            declareFunction("removal_symmetric_lookup_pos_cost", "REMOVAL-SYMMETRIC-LOOKUP-POS-COST", 1, 1, false);
            new removal_modules_symmetry.$removal_symmetric_lookup_pos_cost$UnaryFunction();
            new removal_modules_symmetry.$removal_symmetric_lookup_pos_cost$BinaryFunction();
            declareFunction("removal_symmetric_lookup_neg_cost", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COST", 1, 1, false);
            declareFunction("removal_symmetric_lookup_neg_completeness", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
            declareFunction("removal_symmetric_lookup_pos_iterator", "REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR", 1, 0, false);
            new removal_modules_symmetry.$removal_symmetric_lookup_pos_iterator$UnaryFunction();
            declareFunction("removal_symmetric_lookup_neg_iterator", "REMOVAL-SYMMETRIC-LOOKUP-NEG-ITERATOR", 1, 0, false);
            declareFunction("removal_symmetric_supports", "REMOVAL-SYMMETRIC-SUPPORTS", 1, 0, false);
            new removal_modules_symmetry.$removal_symmetric_supports$UnaryFunction();
            declareFunction("removal_commutative_lookup_pos_cost", "REMOVAL-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false);
            declareFunction("removal_commutative_lookup_neg_cost", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false);
            declareFunction("removal_commutative_lookup_neg_completeness", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
            declareFunction("removal_commutative_lookup_pos_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false);
            declareFunction("removal_commutative_lookup_neg_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false);
            declareFunction("removal_commutative_supports", "REMOVAL-COMMUTATIVE-SUPPORTS", 1, 0, false);
            declareFunction("removal_partially_commutative_lookup_pos_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false);
            declareFunction("removal_partially_commutative_lookup_neg_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false);
            declareFunction("removal_partially_commutative_lookup_neg_completeness", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
            declareFunction("removal_partially_commutative_lookup_pos_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false);
            declareFunction("removal_partially_commutative_lookup_neg_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false);
            declareFunction("removal_partially_commutative_supports", "REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS", 2, 0, false);
            declareFunction("removal_asymmetric_lookup_cost", "REMOVAL-ASYMMETRIC-LOOKUP-COST", 1, 1, false);
            declareFunction("removal_asymmetric_lookup_completeness", "REMOVAL-ASYMMETRIC-LOOKUP-COMPLETENESS", 1, 0, false);
            declareFunction("removal_asymmetric_lookup_iterator", "REMOVAL-ASYMMETRIC-LOOKUP-ITERATOR", 1, 0, false);
            declareFunction("removal_asymmetric_supports", "REMOVAL-ASYMMETRIC-SUPPORTS", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("removal_partially_commutative_supports", "REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_symmetry_file_Previous() {
        declareFunction("symmetric_asent", "SYMMETRIC-ASENT", 1, 0, false);
        declareFunction("symmetric_literal", "SYMMETRIC-LITERAL", 1, 0, false);
        declareMacro("do_formula_commutative_permutations", "DO-FORMULA-COMMUTATIVE-PERMUTATIONS");
        declareMacro("do_formula_canonical_commutative_permutations", "DO-FORMULA-CANONICAL-COMMUTATIVE-PERMUTATIONS");
        declareFunction("commutative_in_args_supports", "COMMUTATIVE-IN-ARGS-SUPPORTS", 1, 0, false);
        declareFunction("removal_commutativity_lookup_cost", "REMOVAL-COMMUTATIVITY-LOOKUP-COST", 2, 0, false);
        declareFunction("removal_commutativity_check_cost", "REMOVAL-COMMUTATIVITY-CHECK-COST", 2, 0, false);
        declareFunction("removal_commutativity_generate_cost", "REMOVAL-COMMUTATIVITY-GENERATE-COST", 2, 0, false);
        declareFunction("removal_commutativity_lookup_iterator", "REMOVAL-COMMUTATIVITY-LOOKUP-ITERATOR", 2, 0, false);
        declareFunction("removal_commutativity_lookup_helper", "REMOVAL-COMMUTATIVITY-LOOKUP-HELPER", 2, 0, false);
        declareFunction("removal_symmetric_lookup_pos_cost", "REMOVAL-SYMMETRIC-LOOKUP-POS-COST", 1, 1, false);
        new removal_modules_symmetry.$removal_symmetric_lookup_pos_cost$UnaryFunction();
        new removal_modules_symmetry.$removal_symmetric_lookup_pos_cost$BinaryFunction();
        declareFunction("removal_symmetric_lookup_neg_cost", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_symmetric_lookup_neg_completeness", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction("removal_symmetric_lookup_pos_iterator", "REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR", 1, 0, false);
        new removal_modules_symmetry.$removal_symmetric_lookup_pos_iterator$UnaryFunction();
        declareFunction("removal_symmetric_lookup_neg_iterator", "REMOVAL-SYMMETRIC-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction("removal_symmetric_supports", "REMOVAL-SYMMETRIC-SUPPORTS", 1, 0, false);
        new removal_modules_symmetry.$removal_symmetric_supports$UnaryFunction();
        declareFunction("removal_commutative_lookup_pos_cost", "REMOVAL-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_commutative_lookup_neg_cost", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_commutative_lookup_neg_completeness", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction("removal_commutative_lookup_pos_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false);
        declareFunction("removal_commutative_lookup_neg_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction("removal_commutative_supports", "REMOVAL-COMMUTATIVE-SUPPORTS", 1, 0, false);
        declareFunction("removal_partially_commutative_lookup_pos_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_partially_commutative_lookup_neg_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_partially_commutative_lookup_neg_completeness", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction("removal_partially_commutative_lookup_pos_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false);
        declareFunction("removal_partially_commutative_lookup_neg_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction("removal_partially_commutative_supports", "REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS", 2, 0, false);
        declareFunction("removal_asymmetric_lookup_cost", "REMOVAL-ASYMMETRIC-LOOKUP-COST", 1, 1, false);
        declareFunction("removal_asymmetric_lookup_completeness", "REMOVAL-ASYMMETRIC-LOOKUP-COMPLETENESS", 1, 0, false);
        declareFunction("removal_asymmetric_lookup_iterator", "REMOVAL-ASYMMETRIC-LOOKUP-ITERATOR", 1, 0, false);
        declareFunction("removal_asymmetric_supports", "REMOVAL-ASYMMETRIC-SUPPORTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_symmetry_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_symmetry_file_alt() {
        define_obsolete_register(SYMMETRIC_LITERAL, $list_alt1);
        inference_modules.inference_removal_module($REMOVAL_SYMMETRIC_LOOKUP_POS, $list_alt35);
        inference_modules.inference_removal_module($REMOVAL_SYMMETRIC_LOOKUP_NEG, $list_alt37);
        inference_modules.inference_removal_module($REMOVAL_COMMUTATIVE_LOOKUP_POS, $list_alt40);
        inference_modules.inference_removal_module($REMOVAL_COMMUTATIVE_LOOKUP_NEG, $list_alt42);
        inference_modules.inference_removal_module($REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS, $list_alt45);
        inference_modules.inference_removal_module($REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG, $list_alt47);
        inference_modules.inference_removal_module($REMOVAL_ASYMMETRIC_LOOKUP, $list_alt50);
        return NIL;
    }

    public static SubLObject setup_removal_modules_symmetry_file() {
        if (SubLFiles.USE_V1) {
            define_obsolete_register(SYMMETRIC_LITERAL, $list1);
            inference_modules.inference_removal_module($REMOVAL_SYMMETRIC_LOOKUP_POS, $list50);
            inference_modules.inference_removal_module($REMOVAL_SYMMETRIC_LOOKUP_NEG, $list52);
            inference_modules.inference_removal_module($REMOVAL_COMMUTATIVE_LOOKUP_POS, $list55);
            inference_modules.inference_removal_module($REMOVAL_COMMUTATIVE_LOOKUP_NEG, $list57);
            inference_modules.inference_removal_module($REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS, $list60);
            inference_modules.inference_removal_module($REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG, $list62);
            inference_modules.inference_removal_module($REMOVAL_ASYMMETRIC_LOOKUP, $list65);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_SYMMETRIC_LOOKUP_POS, $list_alt35);
            inference_modules.inference_removal_module($REMOVAL_SYMMETRIC_LOOKUP_NEG, $list_alt37);
            inference_modules.inference_removal_module($REMOVAL_COMMUTATIVE_LOOKUP_POS, $list_alt40);
            inference_modules.inference_removal_module($REMOVAL_COMMUTATIVE_LOOKUP_NEG, $list_alt42);
            inference_modules.inference_removal_module($REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS, $list_alt45);
            inference_modules.inference_removal_module($REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG, $list_alt47);
            inference_modules.inference_removal_module($REMOVAL_ASYMMETRIC_LOOKUP, $list_alt50);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_symmetry_file_Previous() {
        define_obsolete_register(SYMMETRIC_LITERAL, $list1);
        inference_modules.inference_removal_module($REMOVAL_SYMMETRIC_LOOKUP_POS, $list50);
        inference_modules.inference_removal_module($REMOVAL_SYMMETRIC_LOOKUP_NEG, $list52);
        inference_modules.inference_removal_module($REMOVAL_COMMUTATIVE_LOOKUP_POS, $list55);
        inference_modules.inference_removal_module($REMOVAL_COMMUTATIVE_LOOKUP_NEG, $list57);
        inference_modules.inference_removal_module($REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS, $list60);
        inference_modules.inference_removal_module($REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG, $list62);
        inference_modules.inference_removal_module($REMOVAL_ASYMMETRIC_LOOKUP, $list65);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_symmetry_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_symmetry_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_symmetry_file();
    }

    static {
    }

    public static final class $removal_symmetric_lookup_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_symmetric_lookup_pos_cost$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-SYMMETRIC-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_symmetric_lookup_pos_cost(arg1, removal_modules_symmetry.$removal_symmetric_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_symmetric_lookup_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_symmetric_lookup_pos_cost$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-SYMMETRIC-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_symmetric_lookup_pos_cost(arg1, arg2);
        }
    }

    public static final class $removal_symmetric_lookup_pos_iterator$UnaryFunction extends UnaryFunction {
        public $removal_symmetric_lookup_pos_iterator$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_symmetric_lookup_pos_iterator(arg1);
        }
    }

    public static final class $removal_symmetric_supports$UnaryFunction extends UnaryFunction {
        public $removal_symmetric_supports$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-SYMMETRIC-SUPPORTS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_symmetric_supports(arg1);
        }
    }
}

/**
 * Total time: 1384 ms
 */
