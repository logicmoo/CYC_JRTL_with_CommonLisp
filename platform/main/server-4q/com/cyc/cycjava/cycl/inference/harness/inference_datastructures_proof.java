/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.arguments.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-DATASTRUCTURES-PROOF
 * source file: /cyc/top/cycl/inference/harness/inference-datastructures-proof.lisp
 * created:     2019/07/03 17:37:38
 */
public final class inference_datastructures_proof extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @return list-of-proof-p; a list without repetition of all dependent proofs of PROOF.
     */
    @LispMethod(comment = "@return list-of-proof-p; a list without repetition of all dependent proofs of PROOF.")
    public static final SubLObject proof_dependent_proofs_int(SubLObject proof, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        {
            SubLObject dependent_proofs = NIL;
            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_dependents(proof);
            SubLObject dependent_proof = NIL;
            for (dependent_proof = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , dependent_proof = csome_list_var.first()) {
                if (NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, proof_status)) {
                    dependent_proofs = cons(dependent_proof, dependent_proofs);
                }
            }
            return nreverse(dependent_proofs);
        }
    }

    /**
     *
     *
     * @return list-of-proof-p; a list without repetition of all dependent proofs of PROOF.
     */
    @LispMethod(comment = "@return list-of-proof-p; a list without repetition of all dependent proofs of PROOF.")
    public static final SubLObject proof_dependent_proofs_computed(SubLObject proof, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dependent_proofs = NIL;
                SubLObject already_seen_proofs = set.new_set(symbol_function(EQ), UNPROVIDED);
                SubLObject proof_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(proof);
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(proof_problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                            {
                                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                                if (NIL != supported_problem) {
                                    {
                                        SubLObject status_var = proof_status;
                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(supported_problem));
                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                SubLObject proof_list = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject cdolist_list_var = proof_list;
                                                    SubLObject dependent_proof = NIL;
                                                    for (dependent_proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent_proof = cdolist_list_var.first()) {
                                                        if (NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, status_var)) {
                                                            if (NIL != list_utilities.member_eqP(proof, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(dependent_proof))) {
                                                                {
                                                                    SubLObject dependent_proof_7 = dependent_proof;
                                                                    if (NIL == set.set_memberP(dependent_proof_7, already_seen_proofs)) {
                                                                        set.set_add(dependent_proof_7, already_seen_proofs);
                                                                        dependent_proofs = cons(dependent_proof_7, dependent_proofs);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                            }
                                        } 
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(dependent_proofs);
            }
        }
    }

    /**
     *
     *
     * @unknown this may bind DEPENDENT-PROOF-VAR to the same proof more than once, in the case
    where PROOF's supported problem has more than one supported problem.
    All callers of this must be able to handle duplicates.
     */
    @LispMethod(comment = "@unknown this may bind DEPENDENT-PROOF-VAR to the same proof more than once, in the case\r\nwhere PROOF\'s supported problem has more than one supported problem.\r\nAll callers of this must be able to handle duplicates.")
    public static final SubLObject do_proof_dependent_proofs_int(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dependent_proof_var = NIL;
                    SubLObject proof = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    dependent_proof_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    proof = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            if (NIL == member(current_3, $list_alt39, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt38);
                        }
                        {
                            SubLObject proof_status_tail = property_list_member($PROOF_STATUS, current);
                            SubLObject proof_status = (NIL != proof_status_tail) ? ((SubLObject) (cadr(proof_status_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CSOME, list(dependent_proof_var, list(PROOF_DEPENDENTS, proof), done), listS(PWHEN, list($sym52$PROOF_HAS_STATUS_, dependent_proof_var, proof_status), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown this may bind DEPENDENT-PROOF-VAR to the same proof more than once, in the case
    where PROOF's supported problem has more than one supported problem.
    All callers of this must be able to handle duplicates.
     */
    @LispMethod(comment = "@unknown this may bind DEPENDENT-PROOF-VAR to the same proof more than once, in the case\r\nwhere PROOF\'s supported problem has more than one supported problem.\r\nAll callers of this must be able to handle duplicates.")
    public static final SubLObject do_proof_dependent_proofs_computed(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dependent_proof_var = NIL;
                    SubLObject proof = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    dependent_proof_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    proof = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            if (NIL == member(current_2, $list_alt39, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt38);
                        }
                        {
                            SubLObject proof_status_tail = property_list_member($PROOF_STATUS, current);
                            SubLObject proof_status = (NIL != proof_status_tail) ? ((SubLObject) (cadr(proof_status_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject proof_problem = $sym41$PROOF_PROBLEM;
                                SubLObject supported_problem = $sym42$SUPPORTED_PROBLEM;
                                SubLObject dependent_proof = $sym43$DEPENDENT_PROOF;
                                return list(CLET, list(list(proof_problem, list(PROOF_SUPPORTED_PROBLEM, proof))), list(DO_PROBLEM_SUPPORTED_PROBLEMS, list(supported_problem, proof_problem, $DONE, done), list(DO_PROBLEM_PROOFS, list(dependent_proof, supported_problem, $PROOF_STATUS, proof_status, $DONE, done), list(PWHEN, list($sym49$MEMBER_EQ_, proof, list(PROOF_DIRECT_SUBPROOFS, dependent_proof)), listS(CLET, list(list(dependent_proof_var, dependent_proof)), append(body, NIL))))));
                            }
                        }
                    }
                }
            }
        }
    }



    public static final SubLFile me = new inference_datastructures_proof();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof";


    // defconstant
    // return $bindings;
    @LispMethod(comment = "defconstant\npublic static final class $proof_native_BAD extends $proof_native {\npublic SubLStructDecl getStructDecl() {\nreturn structDecl;\npublic SubLObject getField2() {\nreturn $suid;\npublic SubLObject getField3() {\nreturn $bindings;\npublic SubLObject getField4() {\nreturn $link;\npublic SubLObject getField5() {\nreturn $subproofs;\npublic SubLObject getField6() {\nreturn $dependents;\npublic SubLObject setField2(SubLObject value) {\nreturn $suid = value;\npublic SubLObject setField3(SubLObject value) {\nreturn $bindings = value;\npublic SubLObject setField4(SubLObject value) {\nreturn $link = value;\npublic SubLObject setField5(SubLObject value) {\nreturn $subproofs = value;\npublic SubLObject setField6(SubLObject value) {\nreturn $dependents = value;\npublic SubLObject $suid = Lisp.NIL;\npublic SubLObject $bindings = Lisp.NIL;\npublic SubLObject $link = Lisp.NIL;\npublic SubLObject $subproofs = Lisp.NIL;\npublic SubLObject $dependents = Lisp.NIL;\nprivate static final SubLStructDeclNative structDecl = makeStructDeclNative($proof_native.class, PROOF, PROOF_P, $list_alt3, $list_alt4, new String[]{ \"$suid\", \"$bindings\", \"$link\", \"$subproofs\", \"$dependents\" }, $list_alt5, $list_alt6, PRINT_PROOF);")
    // return $link;
    // public SubLObject getField5() {
    // return $subproofs;
    // public SubLObject getField6() {
    // return $dependents;
    // public SubLObject setField2(SubLObject value) {
    // return $suid = value;
    // public SubLObject setField3(SubLObject value) {
    // return $bindings = value;
    // public SubLObject setField4(SubLObject value) {
    // return $link = value;
    // public SubLObject setField5(SubLObject value) {
    // return $subproofs = value;
    // public SubLObject setField6(SubLObject value) {
    // return $dependents = value;
    // public SubLObject $suid = Lisp.NIL;
    // public SubLObject $bindings = Lisp.NIL;
    // public SubLObject $link = Lisp.NIL;
    // public SubLObject $subproofs = Lisp.NIL;
    // public SubLObject $dependents = Lisp.NIL;
    // private static final SubLStructDeclNative structDecl = makeStructDeclNative($proof_native.class, PROOF, PROOF_P, $list_alt3, $list_alt4, new String[]{ "$suid", "$bindings", "$link", "$subproofs", "$dependents" }, $list_alt5, $list_alt6, PRINT_PROOF);
    public static final SubLSymbol $dtp_proof$ = makeSymbol("*DTP-PROOF*");

    private static final SubLInteger $int$211 = makeInteger(211);

    static private final SubLList $list3 = list(makeSymbol("SUID"), makeSymbol("BINDINGS"), makeSymbol("LINK"), makeSymbol("SUBPROOFS"), makeSymbol("DEPENDENTS"), makeSymbol("PROCESSED?"));

    static private final SubLList $list4 = list($SUID, makeKeyword("BINDINGS"), $LINK, makeKeyword("SUBPROOFS"), makeKeyword("DEPENDENTS"), makeKeyword("PROCESSED?"));

    static private final SubLList $list5 = list(makeSymbol("PRF-SUID"), makeSymbol("PRF-BINDINGS"), makeSymbol("PRF-LINK"), makeSymbol("PRF-SUBPROOFS"), makeSymbol("PRF-DEPENDENTS"), makeSymbol("PRF-PROCESSED?"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-PRF-SUID"), makeSymbol("_CSETF-PRF-BINDINGS"), makeSymbol("_CSETF-PRF-LINK"), makeSymbol("_CSETF-PRF-SUBPROOFS"), makeSymbol("_CSETF-PRF-DEPENDENTS"), makeSymbol("_CSETF-PRF-PROCESSED?"));

    private static final SubLSymbol PRINT_PROOF = makeSymbol("PRINT-PROOF");

    private static final SubLSymbol PROOF_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROOF-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROOF-P"));

    private static final SubLSymbol PRF_SUID = makeSymbol("PRF-SUID");

    private static final SubLSymbol _CSETF_PRF_SUID = makeSymbol("_CSETF-PRF-SUID");

    private static final SubLSymbol PRF_BINDINGS = makeSymbol("PRF-BINDINGS");

    private static final SubLSymbol _CSETF_PRF_BINDINGS = makeSymbol("_CSETF-PRF-BINDINGS");

    private static final SubLSymbol PRF_LINK = makeSymbol("PRF-LINK");

    private static final SubLSymbol _CSETF_PRF_LINK = makeSymbol("_CSETF-PRF-LINK");

    private static final SubLSymbol PRF_SUBPROOFS = makeSymbol("PRF-SUBPROOFS");

    private static final SubLSymbol _CSETF_PRF_SUBPROOFS = makeSymbol("_CSETF-PRF-SUBPROOFS");

    private static final SubLSymbol PRF_DEPENDENTS = makeSymbol("PRF-DEPENDENTS");

    private static final SubLSymbol _CSETF_PRF_DEPENDENTS = makeSymbol("_CSETF-PRF-DEPENDENTS");

    private static final SubLSymbol $sym20$PRF_PROCESSED_ = makeSymbol("PRF-PROCESSED?");

    private static final SubLSymbol $sym21$_CSETF_PRF_PROCESSED_ = makeSymbol("_CSETF-PRF-PROCESSED?");

    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PROOF = makeSymbol("MAKE-PROOF");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROOF_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROOF-METHOD");

    private static final SubLString $str35$_Invalid_PROOF__s_ = makeString("<Invalid PROOF ~s>");

    private static final SubLSymbol PROOF_SUID = makeSymbol("PROOF-SUID");

    private static final SubLString $str37$_PROOF__a__a_for_link__a__a_suppo = makeString("<PROOF ~a.~a for link ~a.~a supported by ~a, supporting ~a>");

    private static final SubLSymbol SXHASH_PROOF_METHOD = makeSymbol("SXHASH-PROOF-METHOD");

    static private final SubLList $list39 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("PROOF")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PROOF_DIRECT_SUBPROOFS = makeSymbol("PROOF-DIRECT-SUBPROOFS");

    private static final SubLList $list42 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("PROOF"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list43 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol ALL_PROOF_SUBPROOFS = makeSymbol("ALL-PROOF-SUBPROOFS");

    private static final SubLList $list47 = list(list(makeSymbol("DEPENDENT-PROOF-VAR"), makeSymbol("PROOF"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list48 = list(makeKeyword("PROOF-STATUS"), $DONE);

    private static final SubLSymbol PROOF_DEPENDENTS = makeSymbol("PROOF-DEPENDENTS");

    private static final SubLSymbol $sym53$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");

    private static final SubLSymbol LIST_OF_PROOF_P = makeSymbol("LIST-OF-PROOF-P");

    private static final SubLSymbol BINDING_LIST_P = makeSymbol("BINDING-LIST-P");

    private static final SubLString $str57$Expected_link__a_to_have_exactly_ = makeString("Expected link ~a to have exactly one subproof");

    private static final SubLString $str58$Unexpected_link_type_for_proof___ = makeString("Unexpected link type for proof: ~a");

    private static final SubLSymbol SUPPORT_EQUAL = makeSymbol("SUPPORT-EQUAL");

    private static final SubLString $str60$Expected__s_to_have_at_most_one_s = makeString("Expected ~s to have at most one subproof, but it had more");

    private static final SubLSymbol PROOF_SUPPORTED_PROBLEM = makeSymbol("PROOF-SUPPORTED-PROBLEM");

    private static final SubLSymbol $sym62$_ = makeSymbol("<");

    private static final SubLSymbol PROOF_REJECT_REASON_P = makeSymbol("PROOF-REJECT-REASON-P");

    public static final SubLObject proof_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.print_proof(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject proof_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_proof(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject proof_p_alt(SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_proof.$proof_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject proof_p(final SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_proof.$proof_native.class ? T : NIL;
    }

    public static SubLObject prf_suid(final SubLObject v_object) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject prf_bindings(final SubLObject v_object) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject prf_link(final SubLObject v_object) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject prf_subproofs(final SubLObject v_object) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject prf_dependents(final SubLObject v_object) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject prf_processedP(final SubLObject v_object) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_prf_suid(final SubLObject v_object, final SubLObject value) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_prf_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_prf_link(final SubLObject v_object, final SubLObject value) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_prf_subproofs(final SubLObject v_object, final SubLObject value) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_prf_dependents(final SubLObject v_object, final SubLObject value) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return ((inference_datastructures_proof.$proof_native) (v_object)).setField6(value);
    }

    public static SubLObject _csetf_prf_processedP(final SubLObject v_object, final SubLObject value) {
        assert NIL != proof_p(v_object) : "! inference_datastructures_proof.proof_p(v_object) " + "proofp error :" + v_object;
        return ((inference_datastructures_proof.$proof_native) (v_object)).setField7(value);
    }

    // 
    // public static final SubLObject prf_suid(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField2();
    // }
    // 
    // public static final SubLObject prf_bindings(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField3();
    // }
    // 
    // public static final SubLObject prf_link(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField4();
    // }
    // 
    // public static final SubLObject prf_subproofs(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField5();
    // }
    // 
    // public static final SubLObject prf_dependents(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField6();
    // }
    // 
    // public static final SubLObject _csetf_prf_suid(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField2(value);
    // }
    // 
    // public static final SubLObject _csetf_prf_bindings(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField3(value);
    // }
    // 
    // public static final SubLObject _csetf_prf_link(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField4(value);
    // }
    // 
    // public static final SubLObject _csetf_prf_subproofs(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField5(value);
    // }
    // 
    // public static final SubLObject _csetf_prf_dependents(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField6(value);
    // }
    @LispMethod(comment = "public static final SubLObject prf_suid(SubLObject v_object) {\nSubLTrampolineFile.checkType(v_object, PROOF_P);\nreturn v_object.getField2();\n}\npublic static final SubLObject prf_bindings(SubLObject v_object) {\nreturn v_object.getField3();\npublic static final SubLObject prf_link(SubLObject v_object) {\nreturn v_object.getField4();\npublic static final SubLObject prf_subproofs(SubLObject v_object) {\nreturn v_object.getField5();\npublic static final SubLObject prf_dependents(SubLObject v_object) {\nreturn v_object.getField6();\npublic static final SubLObject _csetf_prf_suid(SubLObject v_object, SubLObject value) {\nreturn v_object.setField2(value);\npublic static final SubLObject _csetf_prf_bindings(SubLObject v_object, SubLObject value) {\nreturn v_object.setField3(value);\npublic static final SubLObject _csetf_prf_link(SubLObject v_object, SubLObject value) {\nreturn v_object.setField4(value);\npublic static final SubLObject _csetf_prf_subproofs(SubLObject v_object, SubLObject value) {\nreturn v_object.setField5(value);\npublic static final SubLObject _csetf_prf_dependents(SubLObject v_object, SubLObject value) {\nreturn v_object.setField6(value);")
    public static final SubLObject make_proof_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new inference_datastructures_proof.$proof_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SUID)) {
                        _csetf_prf_suid(v_new, current_value);
                    } else {
                        if (pcase_var.eql($BINDINGS)) {
                            _csetf_prf_bindings(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LINK)) {
                                _csetf_prf_link(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SUBPROOFS)) {
                                    _csetf_prf_subproofs(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($DEPENDENTS)) {
                                        _csetf_prf_dependents(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt24$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    // public static final SubLObject prf_suid(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField2();
    // }
    // public static final SubLObject prf_bindings(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField3();
    // }
    // public static final SubLObject prf_link(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField4();
    // }
    // public static final SubLObject prf_subproofs(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField5();
    // }
    // public static final SubLObject prf_dependents(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.getField6();
    // }
    // public static final SubLObject _csetf_prf_suid(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField2(value);
    // }
    // public static final SubLObject _csetf_prf_bindings(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField3(value);
    // }
    // public static final SubLObject _csetf_prf_link(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField4(value);
    // }
    // public static final SubLObject _csetf_prf_subproofs(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField5(value);
    // }
    // public static final SubLObject _csetf_prf_dependents(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROOF_P);
    // return v_object.setField6(value);
    // }
    @LispMethod(comment = "public static final SubLObject prf_suid(SubLObject v_object) {\nSubLTrampolineFile.checkType(v_object, PROOF_P);\nreturn v_object.getField2();\n}\npublic static final SubLObject prf_bindings(SubLObject v_object) {\nreturn v_object.getField3();\npublic static final SubLObject prf_link(SubLObject v_object) {\nreturn v_object.getField4();\npublic static final SubLObject prf_subproofs(SubLObject v_object) {\nreturn v_object.getField5();\npublic static final SubLObject prf_dependents(SubLObject v_object) {\nreturn v_object.getField6();\npublic static final SubLObject _csetf_prf_suid(SubLObject v_object, SubLObject value) {\nreturn v_object.setField2(value);\npublic static final SubLObject _csetf_prf_bindings(SubLObject v_object, SubLObject value) {\nreturn v_object.setField3(value);\npublic static final SubLObject _csetf_prf_link(SubLObject v_object, SubLObject value) {\nreturn v_object.setField4(value);\npublic static final SubLObject _csetf_prf_subproofs(SubLObject v_object, SubLObject value) {\nreturn v_object.setField5(value);\npublic static final SubLObject _csetf_prf_dependents(SubLObject v_object, SubLObject value) {\nreturn v_object.setField6(value);")
    public static SubLObject make_proof(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new inference_datastructures_proof.$proof_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_prf_suid(v_new, current_value);
            } else
                if (pcase_var.eql($BINDINGS)) {
                    _csetf_prf_bindings(v_new, current_value);
                } else
                    if (pcase_var.eql($LINK)) {
                        _csetf_prf_link(v_new, current_value);
                    } else
                        if (pcase_var.eql($SUBPROOFS)) {
                            _csetf_prf_subproofs(v_new, current_value);
                        } else
                            if (pcase_var.eql($DEPENDENTS)) {
                                _csetf_prf_dependents(v_new, current_value);
                            } else
                                if (pcase_var.eql($PROCESSED_)) {
                                    _csetf_prf_processedP(v_new, current_value);
                                } else {
                                    Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_proof(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PROOF, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SUID, prf_suid(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, prf_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $LINK, prf_link(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBPROOFS, prf_subproofs(obj));
        funcall(visitor_fn, obj, $SLOT, $DEPENDENTS, prf_dependents(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESSED_, prf_processedP(obj));
        funcall(visitor_fn, obj, $END, MAKE_PROOF, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_proof_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_proof(obj, visitor_fn);
    }

    public static final SubLObject valid_proof_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_p(v_object)) && (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_invalid_p(v_object)));
    }

    public static SubLObject valid_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != proof_p(v_object)) && (NIL == proof_invalid_p(v_object)));
    }

    public static final SubLObject proof_invalid_p_alt(SubLObject proof) {
        return eq($FREE, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_bindings(proof));
    }

    public static SubLObject proof_invalid_p(final SubLObject proof) {
        return eq($FREE, proof_bindings(proof));
    }

    public static final SubLObject print_proof_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_invalid_p(v_object)) {
            format(stream, $str_alt26$_Invalid_PROOF__s_, prf_suid(v_object));
        } else {
            {
                SubLObject proof_suid = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_suid(v_object);
                SubLObject store_suid = inference_datastructures_problem_store.problem_store_suid(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_store(v_object));
                SubLObject link_suid = inference_datastructures_problem_link.problem_link_suid(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_link(v_object));
                SubLObject subproofs = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(v_object);
                SubLObject subproof_suids = Mapping.mapcar(PROOF_SUID, subproofs);
                SubLObject dependents = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_dependent_proofs(v_object, UNPROVIDED);
                SubLObject dependent_suids = Mapping.mapcar(PROOF_SUID, dependents);
                format(stream, $str_alt28$_PROOF__a__a_for_link__a__a_suppo, new SubLObject[]{ store_suid, proof_suid, store_suid, link_suid, subproof_suids, dependent_suids });
            }
        }
        return NIL;
    }

    public static SubLObject print_proof(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (NIL != proof_invalid_p(v_object)) {
            format(stream, $str35$_Invalid_PROOF__s_, prf_suid(v_object));
        } else {
            final SubLObject proof_suid = proof_suid(v_object);
            final SubLObject store_suid = inference_datastructures_problem_store.problem_store_suid(proof_store(v_object));
            final SubLObject link_suid = inference_datastructures_problem_link.problem_link_suid(proof_link(v_object));
            final SubLObject subproofs = proof_direct_subproofs(v_object);
            final SubLObject subproof_suids = Mapping.mapcar(PROOF_SUID, subproofs);
            final SubLObject dependents = proof_dependent_proofs(v_object, UNPROVIDED);
            final SubLObject dependent_suids = Mapping.mapcar(PROOF_SUID, dependents);
            format(stream, $str37$_PROOF__a__a_for_link__a__a_suppo, new SubLObject[]{ store_suid, proof_suid, store_suid, link_suid, subproof_suids, dependent_suids });
        }
        return NIL;
    }

    public static final SubLObject sxhash_proof_method_alt(SubLObject v_object) {
        return prf_suid(v_object);
    }

    public static SubLObject sxhash_proof_method(final SubLObject v_object) {
        return prf_suid(v_object);
    }

    public static final SubLObject list_of_proof_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject subobject = NIL;
                for (subobject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subobject = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_p(subobject)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject list_of_proof_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == proof_p(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject non_empty_list_of_proof_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.list_of_proof_p(v_object)));
    }

    public static SubLObject non_empty_list_of_proof_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != list_of_proof_p(v_object)));
    }

    public static final SubLObject do_proof_direct_subproofs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject subproof_var = NIL;
                    SubLObject proof = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    subproof_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    proof = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_LIST, list(subproof_var, list(PROOF_DIRECT_SUBPROOFS, proof)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt30);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_proof_direct_subproofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subproof_var = NIL;
        SubLObject proof = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        subproof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        proof = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_LIST, list(subproof_var, list(PROOF_DIRECT_SUBPROOFS, proof)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list39);
        return NIL;
    }

    public static final SubLObject do_proof_all_subproofs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt33);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject subproof_var = NIL;
                    SubLObject proof = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    subproof_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    proof = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt33);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt33);
                            if (NIL == member(current_1, $list_alt34, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt33);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(subproof_var, list(ALL_PROOF_SUBPROOFS, proof), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_proof_all_subproofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subproof_var = NIL;
        SubLObject proof = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        subproof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        proof = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list42);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list42);
            if (NIL == member(current_$1, $list43, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list42);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(subproof_var, list(ALL_PROOF_SUBPROOFS, proof), $DONE, done), append(body, NIL));
    }

    /**
     *
     *
     * @unknown this may bind DEPENDENT-PROOF-VAR to the same proof more than once, in the case
    where PROOF's supported problem has more than one supported problem.
    All callers of this must be able to handle duplicates.
     */
    @LispMethod(comment = "@unknown this may bind DEPENDENT-PROOF-VAR to the same proof more than once, in the case\r\nwhere PROOF\'s supported problem has more than one supported problem.\r\nAll callers of this must be able to handle duplicates.")
    public static final SubLObject do_proof_dependent_proofs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dependent_proof_var = NIL;
                    SubLObject proof = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    dependent_proof_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    proof = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            if (NIL == member(current_4, $list_alt39, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt38);
                        }
                        {
                            SubLObject proof_status_tail = property_list_member($PROOF_STATUS, current);
                            SubLObject proof_status = (NIL != proof_status_tail) ? ((SubLObject) (cadr(proof_status_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(PIF, $proof_datastructure_stores_dependent_proofsP$, listS(DO_PROOF_DEPENDENT_PROOFS_INT, list(dependent_proof_var, proof, $PROOF_STATUS, proof_status, $DONE, done), append(body, NIL)), listS(DO_PROOF_DEPENDENT_PROOFS_COMPUTED, list(dependent_proof_var, proof, $PROOF_STATUS, proof_status, $DONE, done), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown this may bind DEPENDENT-PROOF-VAR to the same proof more than once, in the case
    where PROOF's supported problem has more than one supported problem.
    All callers of this must be able to handle duplicates.
     */
    @LispMethod(comment = "@unknown this may bind DEPENDENT-PROOF-VAR to the same proof more than once, in the case\r\nwhere PROOF\'s supported problem has more than one supported problem.\r\nAll callers of this must be able to handle duplicates.")
    public static SubLObject do_proof_dependent_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dependent_proof_var = NIL;
        SubLObject proof = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        dependent_proof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        proof = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list47);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == member(current_$2, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list47);
        }
        final SubLObject proof_status_tail = property_list_member($PROOF_STATUS, current);
        final SubLObject proof_status = (NIL != proof_status_tail) ? cadr(proof_status_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(CSOME, list(dependent_proof_var, list(PROOF_DEPENDENTS, proof), done), listS(PWHEN, list($sym53$PROOF_HAS_STATUS_, dependent_proof_var, proof_status), append(body, NIL)));
    }

    public static final SubLObject new_proof_alt(SubLObject link, SubLObject subproofs) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        SubLTrampolineFile.checkType(subproofs, LIST_OF_PROOF_P);
        {
            SubLObject proof = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.make_proof(UNPROVIDED);
            SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
            SubLObject suid = inference_datastructures_problem_store.problem_store_new_proof_id(store);
            inference_metrics.increment_proof_historical_count();
            _csetf_prf_suid(proof, suid);
            _csetf_prf_link(proof, link);
            _csetf_prf_subproofs(proof, subproofs);
            return proof;
        }
    }

    public static SubLObject new_proof(final SubLObject link, final SubLObject subproofs) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        assert NIL != list_of_proof_p(subproofs) : "! inference_datastructures_proof.list_of_proof_p(subproofs) " + ("inference_datastructures_proof.list_of_proof_p(subproofs) " + "CommonSymbols.NIL != inference_datastructures_proof.list_of_proof_p(subproofs) ") + subproofs;
        final SubLObject proof = make_proof(UNPROVIDED);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        final SubLObject suid = inference_datastructures_problem_store.problem_store_new_proof_id(store);
        inference_metrics.increment_proof_historical_count();
        _csetf_prf_suid(proof, suid);
        _csetf_prf_link(proof, link);
        _csetf_prf_subproofs(proof, subproofs);
        _csetf_prf_processedP(proof, NIL);
        return proof;
    }

    public static final SubLObject new_proof_with_bindings_alt(SubLObject link, SubLObject v_bindings, SubLObject subproofs) {
        {
            SubLObject proof = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.new_proof(link, subproofs);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.set_proof_bindings(proof, v_bindings);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.register_proof(proof);
            return proof;
        }
    }

    public static SubLObject new_proof_with_bindings(final SubLObject link, final SubLObject v_bindings, final SubLObject subproofs) {
        final SubLObject proof = new_proof(link, subproofs);
        set_proof_bindings(proof, v_bindings);
        register_proof(proof);
        return proof;
    }

    /**
     * Adds backpointers to PROOF from other datastructures
     */
    @LispMethod(comment = "Adds backpointers to PROOF from other datastructures")
    public static final SubLObject register_proof_alt(SubLObject proof) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_link(proof);
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
                inference_datastructures_problem.add_problem_proof(supported_problem, proof);
                inference_datastructures_problem_store.add_problem_store_proof(store, proof);
                if (NIL != inference_datastructures_problem_link.$problem_link_datastructure_stores_proofsP$.getDynamicValue(thread)) {
                    inference_datastructures_problem_link.add_problem_link_proof(link, proof);
                }
                if (NIL != $proof_datastructure_stores_dependent_proofsP$.getDynamicValue(thread)) {
                    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.add_dependent_proof_references(proof);
                }
            }
            return proof;
        }
    }

    @LispMethod(comment = "Adds backpointers to PROOF from other datastructures")
    public static SubLObject register_proof(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        inference_datastructures_problem.add_problem_proof(supported_problem, proof);
        inference_datastructures_problem_store.add_problem_store_proof(store, proof);
        inference_datastructures_problem_link.add_problem_link_proof(link, proof);
        add_dependent_proof_references(proof);
        return proof;
    }/**
     * Adds backpointers to PROOF from other datastructures
     */


    public static final SubLObject add_dependent_proof_references_alt(SubLObject proof) {
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.add_proof_dependent(subproof, proof);
            }
        }
        return NIL;
    }

    public static SubLObject add_dependent_proof_references(final SubLObject proof) {
        SubLObject cdolist_list_var = proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_proof_dependent(subproof, proof);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject destroy_proof_alt(SubLObject proof) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.valid_proof_p(proof)) {
                {
                    SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_link(proof);
                    SubLObject v_bindings = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_bindings(proof);
                    SubLObject store = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_store(proof);
                    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.destroy_dependent_proofs(proof);
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.valid_proof_p(proof)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.note_proof_invalid(proof);
                        inference_datastructures_inference.destroy_proof_inference_answer_justifications(proof);
                        if (NIL != $proof_datastructure_stores_dependent_proofsP$.getDynamicValue(thread)) {
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(proof);
                                SubLObject subproof = NIL;
                                for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.remove_proof_dependent(subproof, proof);
                                }
                            }
                        }
                        {
                            SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(proof);
                            if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                                inference_worker.note_problem_dirty(problem);
                                inference_datastructures_problem.remove_problem_proof_with_bindings(problem, proof, v_bindings);
                            }
                        }
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_rejectedP(proof)) {
                            inference_datastructures_problem_store.problem_store_forget_that_proof_is_rejected(store, proof);
                        }
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_processedP(proof)) {
                            inference_datastructures_problem_store.problem_store_note_proof_unprocessed(store, proof);
                        }
                        if (NIL != inference_datastructures_problem_link.$problem_link_datastructure_stores_proofsP$.getDynamicValue(thread)) {
                            inference_datastructures_problem_link.remove_problem_link_proof(link, proof);
                        }
                        inference_datastructures_problem_store.remove_problem_store_proof(store, proof);
                    }
                }
                return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.destroy_proof_int(proof);
            }
            return NIL;
        }
    }

    public static SubLObject destroy_proof(final SubLObject proof) {
        if (NIL != valid_proof_p(proof)) {
            final SubLObject link = proof_link(proof);
            final SubLObject v_bindings = proof_bindings(proof);
            final SubLObject store = proof_store(proof);
            destroy_dependent_proofs(proof);
            if (NIL != valid_proof_p(proof)) {
                note_proof_invalid(proof);
                inference_datastructures_inference.destroy_proof_inference_answer_justifications(proof);
                SubLObject cdolist_list_var = proof_direct_subproofs(proof);
                SubLObject subproof = NIL;
                subproof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    remove_proof_dependent(subproof, proof);
                    cdolist_list_var = cdolist_list_var.rest();
                    subproof = cdolist_list_var.first();
                } 
                final SubLObject problem = proof_supported_problem(proof);
                if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                    inference_worker.note_problem_dirty(problem);
                    inference_datastructures_problem.note_problem_potentially_processed(problem);
                    inference_datastructures_problem.remove_problem_proof_with_bindings(problem, proof, v_bindings);
                }
                if (NIL != proof_rejectedP(proof)) {
                    inference_datastructures_problem_store.problem_store_forget_that_proof_is_rejected(store, proof);
                }
                if (NIL != proof_processedP(proof)) {
                    inference_datastructures_problem_store.problem_store_note_proof_unprocessed(store, proof);
                }
                inference_datastructures_problem_link.remove_problem_link_proof(link, proof);
                inference_datastructures_problem_store.remove_problem_store_proof(store, proof);
            }
            return destroy_proof_int(proof);
        }
        return NIL;
    }

    public static final SubLObject destroy_dependent_proofs_alt(SubLObject proof) {
        {
            SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(proof);
            if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                {
                    SubLObject dependent_proofs = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_dependent_proofs(proof, UNPROVIDED);
                    SubLObject cdolist_list_var = dependent_proofs;
                    SubLObject dependent_proof = NIL;
                    for (dependent_proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent_proof = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.destroy_proof(dependent_proof);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject destroy_dependent_proofs(final SubLObject proof) {
        final SubLObject problem = proof_supported_problem(proof);
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            SubLObject cdolist_list_var;
            final SubLObject dependent_proofs = cdolist_list_var = proof_dependent_proofs(proof, UNPROVIDED);
            SubLObject dependent_proof = NIL;
            dependent_proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                destroy_proof(dependent_proof);
                cdolist_list_var = cdolist_list_var.rest();
                dependent_proof = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject destroy_problem_store_proof_alt(SubLObject proof) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.valid_proof_p(proof)) {
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.note_proof_invalid(proof);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.destroy_proof_int(proof);
        }
        return NIL;
    }

    public static SubLObject destroy_problem_store_proof(final SubLObject proof) {
        if (NIL != valid_proof_p(proof)) {
            note_proof_invalid(proof);
            return destroy_proof_int(proof);
        }
        return NIL;
    }

    public static final SubLObject destroy_proof_int_alt(SubLObject proof) {
        _csetf_prf_subproofs(proof, $FREE);
        _csetf_prf_dependents(proof, $FREE);
        _csetf_prf_link(proof, $FREE);
        return NIL;
    }

    public static SubLObject destroy_proof_int(final SubLObject proof) {
        _csetf_prf_processedP(proof, $FREE);
        _csetf_prf_subproofs(proof, $FREE);
        _csetf_prf_dependents(proof, $FREE);
        _csetf_prf_link(proof, $FREE);
        return NIL;
    }

    public static final SubLObject note_proof_invalid_alt(SubLObject proof) {
        _csetf_prf_bindings(proof, $FREE);
        return proof;
    }

    public static SubLObject note_proof_invalid(final SubLObject proof) {
        _csetf_prf_bindings(proof, $FREE);
        return proof;
    }

    public static final SubLObject proof_suid_alt(SubLObject proof) {
        SubLTrampolineFile.checkType(proof, PROOF_P);
        return prf_suid(proof);
    }

    public static SubLObject proof_suid(final SubLObject proof) {
        assert NIL != proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("proofp(proof) " + "CommonSymbols.NIL != proofp(proof) ") + proof;
        return prf_suid(proof);
    }

    /**
     * Maps PROOF's problem-query -> HL proven-query of PROOF
     * or equivalently, PROOF's problem-query vars -> content.
     * Bindings to substitute into the supported-problem-query to get the proven-query.
     * First elements are variables in the supported-problem-query,
     * second elements are terms bound by this proof.
     */
    @LispMethod(comment = "Maps PROOF\'s problem-query -> HL proven-query of PROOF\r\nor equivalently, PROOF\'s problem-query vars -> content.\r\nBindings to substitute into the supported-problem-query to get the proven-query.\r\nFirst elements are variables in the supported-problem-query,\r\nsecond elements are terms bound by this proof.\nMaps PROOF\'s problem-query -> HL proven-query of PROOF\nor equivalently, PROOF\'s problem-query vars -> content.\nBindings to substitute into the supported-problem-query to get the proven-query.\nFirst elements are variables in the supported-problem-query,\nsecond elements are terms bound by this proof.")
    public static final SubLObject proof_bindings_alt(SubLObject proof) {
        SubLTrampolineFile.checkType(proof, PROOF_P);
        return prf_bindings(proof);
    }

    @LispMethod(comment = "Maps PROOF\'s problem-query -> HL proven-query of PROOF\r\nor equivalently, PROOF\'s problem-query vars -> content.\r\nBindings to substitute into the supported-problem-query to get the proven-query.\r\nFirst elements are variables in the supported-problem-query,\r\nsecond elements are terms bound by this proof.\nMaps PROOF\'s problem-query -> HL proven-query of PROOF\nor equivalently, PROOF\'s problem-query vars -> content.\nBindings to substitute into the supported-problem-query to get the proven-query.\nFirst elements are variables in the supported-problem-query,\nsecond elements are terms bound by this proof.")
    public static SubLObject proof_bindings(final SubLObject proof) {
        assert NIL != proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("proofp(proof) " + "CommonSymbols.NIL != proofp(proof) ") + proof;
        return prf_bindings(proof);
    }/**
     * Maps PROOF's problem-query -> HL proven-query of PROOF
     * or equivalently, PROOF's problem-query vars -> content.
     * Bindings to substitute into the supported-problem-query to get the proven-query.
     * First elements are variables in the supported-problem-query,
     * second elements are terms bound by this proof.
     */


    public static final SubLObject proof_link_alt(SubLObject proof) {
        SubLTrampolineFile.checkType(proof, PROOF_P);
        return prf_link(proof);
    }

    public static SubLObject proof_link(final SubLObject proof) {
        assert NIL != proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("proofp(proof) " + "CommonSymbols.NIL != proofp(proof) ") + proof;
        return prf_link(proof);
    }

    public static final SubLObject proof_direct_subproofs_alt(SubLObject proof) {
        SubLTrampolineFile.checkType(proof, PROOF_P);
        return prf_subproofs(proof);
    }

    public static SubLObject proof_direct_subproofs(final SubLObject proof) {
        assert NIL != proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("proofp(proof) " + "CommonSymbols.NIL != proofp(proof) ") + proof;
        return prf_subproofs(proof);
    }

    public static final SubLObject proof_dependents_alt(SubLObject proof) {
        SubLTrampolineFile.checkType(proof, PROOF_P);
        return prf_dependents(proof);
    }

    public static SubLObject proof_dependents(final SubLObject proof) {
        assert NIL != proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("proofp(proof) " + "CommonSymbols.NIL != proofp(proof) ") + proof;
        return prf_dependents(proof);
    }

    public static final SubLObject set_proof_bindings_alt(SubLObject proof, SubLObject v_bindings) {
        SubLTrampolineFile.checkType(proof, PROOF_P);
        SubLTrampolineFile.checkType(v_bindings, BINDING_LIST_P);
        _csetf_prf_bindings(proof, v_bindings);
        return proof;
    }

    public static SubLObject set_proof_bindings(final SubLObject proof, final SubLObject v_bindings) {
        assert NIL != proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("proofp(proof) " + "CommonSymbols.NIL != proofp(proof) ") + proof;
        assert NIL != bindings.binding_list_p(v_bindings) : "! bindings.binding_list_p(v_bindings) " + ("bindings.binding_list_p(v_bindings) " + "CommonSymbols.NIL != bindings.binding_list_p(v_bindings) ") + v_bindings;
        _csetf_prf_bindings(proof, v_bindings);
        return proof;
    }

    public static final SubLObject add_proof_dependent_alt(SubLObject proof, SubLObject dependent) {
        {
            SubLObject dependents = prf_dependents(proof);
            SubLObject item_var = dependent;
            if (NIL == member(item_var, dependents, symbol_function(EQL), symbol_function(IDENTITY))) {
                dependents = cons(item_var, dependents);
            }
            _csetf_prf_dependents(proof, dependents);
            return dependents;
        }
    }

    public static SubLObject add_proof_dependent(final SubLObject proof, final SubLObject dependent) {
        SubLObject dependents = prf_dependents(proof);
        if (NIL == member(dependent, dependents, symbol_function(EQ), symbol_function(IDENTITY))) {
            dependents = cons(dependent, dependents);
        }
        _csetf_prf_dependents(proof, dependents);
        return dependents;
    }

    public static final SubLObject remove_proof_dependent_alt(SubLObject proof, SubLObject old_dependent) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.valid_proof_p(proof)) {
            {
                SubLObject dependents = prf_dependents(proof);
                if (NIL == list_utilities.member_eqP(old_dependent, dependents)) {
                    Errors.warn($str_alt60$Could_not_remove_dependent__a_fro, old_dependent, proof);
                }
                dependents = delete(old_dependent, dependents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                _csetf_prf_dependents(proof, dependents);
                return dependents;
            }
        }
        return NIL;
    }

    public static SubLObject remove_proof_dependent(final SubLObject proof, final SubLObject old_dependent) {
        if (NIL != valid_proof_p(proof)) {
            SubLObject dependents = prf_dependents(proof);
            dependents = delete(old_dependent, dependents, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            _csetf_prf_dependents(proof, dependents);
            return dependents;
        }
        return NIL;
    }

    public static SubLObject note_proof_processed(final SubLObject proof) {
        _csetf_prf_processedP(proof, T);
        inference_datastructures_problem_store.problem_store_note_proof_processed(proof_store(proof), proof);
        return proof;
    }

    public static SubLObject note_proof_unprocessed(final SubLObject proof) {
        _csetf_prf_processedP(proof, NIL);
        inference_datastructures_problem_store.problem_store_note_proof_unprocessed(proof_store(proof), proof);
        return proof;
    }

    public static final SubLObject proof_store_alt(SubLObject proof) {
        {
            SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_link(proof);
            SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
            return store;
        }
    }

    public static SubLObject proof_store(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        return store;
    }

    public static final SubLObject proof_supported_problem_alt(SubLObject proof) {
        {
            SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_link(proof);
            return inference_datastructures_problem_link.problem_link_supported_problem(link);
        }
    }

    public static SubLObject proof_supported_problem(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        return inference_datastructures_problem_link.problem_link_supported_problem(link);
    }

    public static final SubLObject proof_supported_problem_query_alt(SubLObject proof) {
        {
            SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(proof);
            SubLObject problem_query = inference_datastructures_problem.problem_query(supported_problem);
            return problem_query;
        }
    }

    public static SubLObject proof_supported_problem_query(final SubLObject proof) {
        final SubLObject supported_problem = proof_supported_problem(proof);
        final SubLObject problem_query = inference_datastructures_problem.problem_query(supported_problem);
        return problem_query;
    }

    public static SubLObject proof_supported_problem_free_hl_vars(final SubLObject proof) {
        final SubLObject supported_problem = proof_supported_problem(proof);
        final SubLObject problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        return problem_free_hl_vars;
    }

    public static final SubLObject proof_has_supportsP_alt(SubLObject proof) {
        return inference_worker.content_link_p(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_link(proof));
    }

    public static SubLObject proof_has_supportsP(final SubLObject proof) {
        return inference_worker.content_link_p(proof_link(proof));
    }

    public static final SubLObject proof_supports_alt(SubLObject proof) {
        {
            SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_link(proof);
            if (NIL != inference_worker.content_link_p(link)) {
                {
                    SubLObject supports = inference_worker.content_link_supports(link);
                    return supports;
                }
            }
        }
        return NIL;
    }

    public static SubLObject proof_supports(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        if (NIL != inference_worker.content_link_p(link)) {
            final SubLObject supports = inference_worker.content_link_supports(link);
            return supports;
        }
        return NIL;
    }

    public static final SubLObject proof_direct_supports_alt(SubLObject proof) {
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_supports_recursive(proof);
    }

    public static SubLObject proof_direct_supports(final SubLObject proof) {
        return proof_direct_supports_recursive(proof);
    }

    public static final SubLObject proof_spec_direct_supports_alt(SubLObject link, SubLObject subproofs) {
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_spec_direct_supports_recursive(link, subproofs);
    }

    public static SubLObject proof_spec_direct_supports(final SubLObject link, final SubLObject subproofs) {
        return proof_spec_direct_supports_recursive(link, subproofs);
    }

    public static final SubLObject proof_direct_supports_recursive_alt(SubLObject proof) {
        {
            SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_link(proof);
            SubLObject subproofs = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(proof);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_spec_direct_supports_recursive(link, subproofs);
        }
    }

    public static SubLObject proof_direct_supports_recursive(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        final SubLObject subproofs = proof_direct_subproofs(proof);
        return proof_spec_direct_supports_recursive(link, subproofs);
    }

    public static final SubLObject proof_spec_direct_supports_recursive_alt(SubLObject link, SubLObject subproofs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem_link.problem_link_store(link))) && (NIL != inference_worker_transformation.transformation_link_p(link))) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.singletonP(subproofs)) {
                        Errors.error($str_alt61$Expected_link__a_to_have_exactly_, link);
                    }
                }
                {
                    SubLObject subproof = subproofs.first();
                    return append(inference_worker.content_link_supports(link), com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_supports_recursive(subproof));
                }
            } else {
                if (NIL != inference_worker.content_link_p(link)) {
                    return inference_worker.content_link_supports(link);
                } else {
                    if ((NIL != inference_worker_restriction.restriction_link_p(link)) || (NIL != inference_worker_union.union_link_p(link))) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == list_utilities.singletonP(subproofs)) {
                                Errors.error($str_alt61$Expected_link__a_to_have_exactly_, link);
                            }
                        }
                        {
                            SubLObject subproof = subproofs.first();
                            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_supports_recursive(subproof);
                        }
                    } else {
                        if (NIL != inference_worker.conjunctive_link_p(link)) {
                            {
                                SubLObject direct_supports = NIL;
                                SubLObject cdolist_list_var = subproofs;
                                SubLObject subproof = NIL;
                                for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_5 = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_supports_recursive(subproof);
                                        SubLObject direct_support = NIL;
                                        for (direct_support = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , direct_support = cdolist_list_var_5.first()) {
                                            direct_supports = cons(direct_support, direct_supports);
                                        }
                                    }
                                }
                                return nreverse(direct_supports);
                            }
                        } else {
                            Errors.error($str_alt62$Unexpected_link_type_for_proof___, link);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject proof_spec_direct_supports_recursive(final SubLObject link, final SubLObject subproofs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem_link.problem_link_store(link))) && (NIL != inference_worker_transformation.transformation_link_p(link))) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(subproofs))) {
                Errors.error($str57$Expected_link__a_to_have_exactly_, link);
            }
            final SubLObject subproof = subproofs.first();
            return append(inference_worker.content_link_supports(link), proof_direct_supports_recursive(subproof));
        }
        if (NIL != inference_worker.content_link_p(link)) {
            return inference_worker.content_link_supports(link);
        }
        if ((NIL != inference_worker_restriction.restriction_link_p(link)) || (NIL != inference_worker_union.union_link_p(link))) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(subproofs))) {
                Errors.error($str57$Expected_link__a_to_have_exactly_, link);
            }
            final SubLObject subproof = subproofs.first();
            return proof_direct_supports_recursive(subproof);
        }
        if (NIL != inference_worker.conjunctive_link_p(link)) {
            SubLObject direct_supports = NIL;
            SubLObject cdolist_list_var = subproofs;
            SubLObject subproof2 = NIL;
            subproof2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = proof_direct_supports_recursive(subproof2);
                SubLObject direct_support = NIL;
                direct_support = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    direct_supports = cons(direct_support, direct_supports);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    direct_support = cdolist_list_var_$3.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                subproof2 = cdolist_list_var.first();
            } 
            return nreverse(direct_supports);
        }
        Errors.error($str58$Unexpected_link_type_for_proof___, link);
        return NIL;
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static final SubLObject all_proof_supports_alt(SubLObject proof) {
        return nreverse(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.all_proof_supports_recursive(proof, NIL));
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static SubLObject all_proof_supports(final SubLObject proof) {
        return nreverse(all_proof_supports_recursive(proof, NIL));
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static final SubLObject all_proof_supports_recursive_alt(SubLObject proof, SubLObject supports) {
        {
            SubLObject new_supports = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supports(proof);
            SubLObject cdolist_list_var = new_supports;
            SubLObject new_support = NIL;
            for (new_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_support = cdolist_list_var.first()) {
                {
                    SubLObject item_var = new_support;
                    if (NIL == member(item_var, supports, SUPPORT_EQUAL, symbol_function(IDENTITY))) {
                        supports = cons(item_var, supports);
                    }
                }
            }
        }
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                supports = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.all_proof_supports_recursive(subproof, supports);
            }
        }
        return supports;
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static SubLObject all_proof_supports_recursive(final SubLObject proof, SubLObject supports) {
        SubLObject cdolist_list_var;
        final SubLObject new_supports = cdolist_list_var = proof_supports(proof);
        SubLObject new_support = NIL;
        new_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = new_support;
            if (NIL == member(item_var, supports, SUPPORT_EQUAL, symbol_function(IDENTITY))) {
                supports = cons(item_var, supports);
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_support = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            supports = all_proof_supports_recursive(subproof, supports);
            cdolist_list_var2 = cdolist_list_var2.rest();
            subproof = cdolist_list_var2.first();
        } 
        return supports;
    }

    public static final SubLObject all_proof_supports_of_proofs_alt(SubLObject proofs) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = proofs;
            SubLObject proof = NIL;
            for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                result = nconc(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.all_proof_supports(proof), result);
            }
            return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject all_proof_supports_of_proofs(final SubLObject proofs) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = proofs;
        SubLObject proof = NIL;
        proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(all_proof_supports(proof), result);
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject proof_has_subproofsP_alt(SubLObject proof) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(proof));
    }

    public static SubLObject proof_has_subproofsP(final SubLObject proof) {
        return list_utilities.sublisp_boolean(proof_direct_subproofs(proof));
    }

    public static final SubLObject proof_sole_subproof_alt(SubLObject proof) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                if (NIL != result) {
                    Errors.error($str_alt64$Expected__s_to_have_at_most_one_s, proof);
                } else {
                    result = subproof;
                }
            }
            return result;
        }
    }

    public static SubLObject proof_sole_subproof(final SubLObject proof) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != result) {
                Errors.error($str60$Expected__s_to_have_at_most_one_s, proof);
            } else {
                result = subproof;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @return nil or proof-p
     */
    @LispMethod(comment = "@return nil or proof-p")
    public static final SubLObject proof_first_subproof_alt(SubLObject proof) {
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                return subproof;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil or proof-p
     */
    @LispMethod(comment = "@return nil or proof-p")
    public static SubLObject proof_first_subproof(final SubLObject proof) {
        final SubLObject cdolist_list_var = proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            return subproof;
        }
        return NIL;
    }

    public static final SubLObject all_proof_subproofs_alt(SubLObject proof) {
        {
            SubLObject v_set_contents = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
            v_set_contents = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.all_proof_subproofs_recursive(proof, v_set_contents);
            return set_contents.set_contents_element_list(v_set_contents);
        }
    }

    public static SubLObject all_proof_subproofs(final SubLObject proof) {
        SubLObject v_set_contents = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
        v_set_contents = all_proof_subproofs_recursive(proof, v_set_contents);
        return set_contents.set_contents_element_list(v_set_contents);
    }

    public static final SubLObject all_proof_subproofs_recursive_alt(SubLObject proof, SubLObject all_subproofs_set) {
        if (NIL == set_contents.set_contents_memberP(proof, all_subproofs_set, symbol_function(EQ))) {
            all_subproofs_set = set_contents.set_contents_add(proof, all_subproofs_set, symbol_function(EQ));
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(proof);
                SubLObject subproof = NIL;
                for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                    all_subproofs_set = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.all_proof_subproofs_recursive(subproof, all_subproofs_set);
                }
            }
        }
        return all_subproofs_set;
    }

    public static SubLObject all_proof_subproofs_recursive(final SubLObject proof, SubLObject all_subproofs_set) {
        if (NIL == set_contents.set_contents_memberP(proof, all_subproofs_set, symbol_function(EQ))) {
            all_subproofs_set = set_contents.set_contents_add(proof, all_subproofs_set, symbol_function(EQ));
            SubLObject cdolist_list_var = proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                all_subproofs_set = all_proof_subproofs_recursive(subproof, all_subproofs_set);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            } 
        }
        return all_subproofs_set;
    }

    public static final SubLObject all_proof_subproblems_alt(SubLObject proof) {
        {
            SubLObject proofs = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.all_proof_subproofs(proof);
            SubLObject problems = Mapping.mapcar(symbol_function(PROOF_SUPPORTED_PROBLEM), proofs);
            problems = Sort.sort(problems, symbol_function($sym65$_), symbol_function(PROBLEM_SUID));
            problems = list_utilities.delete_duplicates_sorted(problems, symbol_function(EQ));
            return problems;
        }
    }

    public static SubLObject all_proof_subproblems(final SubLObject proof) {
        final SubLObject proofs = all_proof_subproofs(proof);
        SubLObject problems = Mapping.mapcar(symbol_function(PROOF_SUPPORTED_PROBLEM), proofs);
        problems = Sort.sort(problems, symbol_function($sym62$_), symbol_function(PROBLEM_SUID));
        problems = list_utilities.delete_duplicates_sorted(problems, symbol_function(EQ));
        return problems;
    }

    public static final SubLObject proof_has_dependent_proofsP_alt(SubLObject proof) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $proof_datastructure_stores_dependent_proofsP$.getDynamicValue(thread)) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_dependents(proof);
                    SubLObject dependent_proof = NIL;
                    for (dependent_proof = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , dependent_proof = csome_list_var.first()) {
                        if (NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, NIL)) {
                            return T;
                        }
                    }
                }
            } else {
                {
                    SubLObject proof_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(proof);
                    SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(proof_problem);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                                {
                                    SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                                    if (NIL != supported_problem) {
                                        {
                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(supported_problem));
                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    SubLObject proof_list = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject cdolist_list_var = proof_list;
                                                        SubLObject dependent_proof = NIL;
                                                        for (dependent_proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent_proof = cdolist_list_var.first()) {
                                                            if (NIL != list_utilities.member_eqP(proof, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_subproofs(dependent_proof))) {
                                                                {
                                                                    SubLObject dependent_proof_6 = dependent_proof;
                                                                    return T;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                }
                                            } 
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject proof_has_dependent_proofsP(final SubLObject proof) {
        SubLObject csome_list_var = proof_dependents(proof);
        SubLObject dependent_proof = NIL;
        dependent_proof = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, NIL)) {
                return T;
            }
            csome_list_var = csome_list_var.rest();
            dependent_proof = csome_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return list-of-proof-p; a list without repetition of all dependent proofs of PROOF.
     */
    @LispMethod(comment = "@return list-of-proof-p; a list without repetition of all dependent proofs of PROOF.")
    public static final SubLObject proof_dependent_proofs_alt(SubLObject proof, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $proof_datastructure_stores_dependent_proofsP$.getDynamicValue(thread) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_dependent_proofs_int(proof, proof_status))) : com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_dependent_proofs_computed(proof, proof_status);
        }
    }

    /**
     *
     *
     * @return list-of-proof-p; a list without repetition of all dependent proofs of PROOF.
     */
    @LispMethod(comment = "@return list-of-proof-p; a list without repetition of all dependent proofs of PROOF.")
    public static SubLObject proof_dependent_proofs(final SubLObject proof, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        SubLObject dependent_proofs = NIL;
        SubLObject csome_list_var = proof_dependents(proof);
        SubLObject dependent_proof = NIL;
        dependent_proof = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, proof_status)) {
                dependent_proofs = cons(dependent_proof, dependent_proofs);
            }
            csome_list_var = csome_list_var.rest();
            dependent_proof = csome_list_var.first();
        } 
        return nreverse(dependent_proofs);
    }

    /**
     *
     *
     * @return proof-status-p
     */
    @LispMethod(comment = "@return proof-status-p")
    public static final SubLObject proof_status_alt(SubLObject proof) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_rejectedP(proof)) {
            return $REJECTED;
        } else {
            return $PROVEN;
        }
    }

    /**
     *
     *
     * @return proof-status-p
     */
    @LispMethod(comment = "@return proof-status-p")
    public static SubLObject proof_status(final SubLObject proof) {
        if (NIL != proof_rejectedP(proof)) {
            return $REJECTED;
        }
        return $PROVEN;
    }

    public static final SubLObject proof_rejectedP_alt(SubLObject proof) {
        {
            SubLObject store = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_store(proof);
            SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
            return dictionary_utilities.dictionary_has_keyP(rejected_proofs, proof);
        }
    }

    public static SubLObject proof_rejectedP(final SubLObject proof) {
        final SubLObject store = proof_store(proof);
        final SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        return dictionary_utilities.dictionary_has_keyP(rejected_proofs, proof);
    }

    public static final SubLObject proof_reject_reason_alt(SubLObject proof) {
        {
            SubLObject store = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_store(proof);
            SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
            return dictionary.dictionary_lookup(rejected_proofs, proof, UNPROVIDED);
        }
    }

    public static SubLObject proof_reject_reason(final SubLObject proof) {
        final SubLObject store = proof_store(proof);
        final SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        return dictionary.dictionary_lookup(rejected_proofs, proof, UNPROVIDED);
    }

    public static final SubLObject proof_provenP_alt(SubLObject proof) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_rejectedP(proof));
    }

    public static SubLObject proof_provenP(final SubLObject proof) {
        return makeBoolean(NIL == proof_rejectedP(proof));
    }

    public static final SubLObject proof_processedP_alt(SubLObject proof) {
        {
            SubLObject store = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_store(proof);
            SubLObject processed_proofs = inference_datastructures_problem_store.problem_store_processed_proofs(store);
            return set.set_memberP(proof, processed_proofs);
        }
    }

    public static SubLObject proof_processedP(final SubLObject proof) {
        return prf_processedP(proof);
    }

    /**
     *
     *
     * @return destructibility-status-p
     */
    @LispMethod(comment = "@return destructibility-status-p")
    public static final SubLObject proof_destructibility_status_alt(SubLObject proof) {
        return inference_datastructures_problem.problem_destructibility_status(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(proof));
    }

    /**
     *
     *
     * @return destructibility-status-p
     */
    @LispMethod(comment = "@return destructibility-status-p")
    public static SubLObject proof_destructibility_status(final SubLObject proof) {
        return inference_datastructures_problem.problem_destructibility_status(proof_supported_problem(proof));
    }

    public static final SubLObject proof_indestructibleP_alt(SubLObject proof) {
        return inference_datastructures_problem.problem_indestructibleP(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(proof));
    }

    public static SubLObject proof_indestructibleP(final SubLObject proof) {
        return inference_datastructures_problem.problem_indestructibleP(proof_supported_problem(proof));
    }

    public static final SubLObject proof_destructibleP_alt(SubLObject proof) {
        return inference_datastructures_problem.problem_destructibleP(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(proof));
    }

    public static SubLObject proof_destructibleP(final SubLObject proof) {
        return inference_datastructures_problem.problem_destructibleP(proof_supported_problem(proof));
    }

    public static final SubLObject proof_note_rejected_alt(SubLObject proof, SubLObject reject_reason) {
        SubLTrampolineFile.checkType(reject_reason, PROOF_REJECT_REASON_P);
        {
            SubLObject store = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_store(proof);
            SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
            dictionary.dictionary_enter(rejected_proofs, proof, reject_reason);
        }
        return proof;
    }

    public static SubLObject proof_note_rejected(final SubLObject proof, final SubLObject reject_reason) {
        assert NIL != inference_datastructures_enumerated_types.proof_reject_reason_p(reject_reason) : "! inference_datastructures_enumerated_types.proof_reject_reason_p(reject_reason) " + ("inference_datastructures_enumerated_types.proof_reject_reason_p(reject_reason) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.proof_reject_reason_p(reject_reason) ") + reject_reason;
        final SubLObject store = proof_store(proof);
        final SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        dictionary.dictionary_enter(rejected_proofs, proof, reject_reason);
        return proof;
    }

    public static final SubLObject proof_rejected_due_to_ill_formednessP_alt(SubLObject proof) {
        {
            SubLObject store = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_store(proof);
            SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
            if ($ILL_FORMED == dictionary.dictionary_lookup(rejected_proofs, proof, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject proof_rejected_due_to_ill_formednessP(final SubLObject proof) {
        final SubLObject store = proof_store(proof);
        final SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        if ($ILL_FORMED == dictionary.dictionary_lookup(rejected_proofs, proof, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return hl-module-p or problem-link-type-p
     */
    @LispMethod(comment = "@return hl-module-p or problem-link-type-p")
    public static final SubLObject proof_type_alt(SubLObject proof) {
        if (NIL != inference_worker.content_proof_p(proof)) {
            return inference_worker.content_proof_hl_module(proof);
        } else {
            return inference_worker.structural_proof_type(proof);
        }
    }

    /**
     *
     *
     * @return hl-module-p or problem-link-type-p
     */
    @LispMethod(comment = "@return hl-module-p or problem-link-type-p")
    public static SubLObject proof_type(final SubLObject proof) {
        if (NIL != inference_worker.content_proof_p(proof)) {
            return inference_worker.content_proof_hl_module(proof);
        }
        return inference_worker.structural_proof_type(proof);
    }

    /**
     *
     *
     * @return boolean; t iff PROOF1 equals PROOF2, modulo
    uninteresting differences.  To be equal in this sense,
    the two proofs must have the same supported problem,
    the same bindings, and the same supports.
     */
    @LispMethod(comment = "@return boolean; t iff PROOF1 equals PROOF2, modulo\r\nuninteresting differences.  To be equal in this sense,\r\nthe two proofs must have the same supported problem,\r\nthe same bindings, and the same supports.")
    public static final SubLObject proof_equalP_alt(SubLObject proof1, SubLObject proof2) {
        SubLTrampolineFile.checkType(proof1, PROOF_P);
        SubLTrampolineFile.checkType(proof2, PROOF_P);
        if (proof1 == proof2) {
            return T;
        } else {
            {
                SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(proof2);
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_bindings(proof2);
                SubLObject supports = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_supports(proof2);
                return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_matches_specificationP(proof1, supported_problem, v_bindings, supports);
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff PROOF1 equals PROOF2, modulo
    uninteresting differences.  To be equal in this sense,
    the two proofs must have the same supported problem,
    the same bindings, and the same supports.
     */
    @LispMethod(comment = "@return boolean; t iff PROOF1 equals PROOF2, modulo\r\nuninteresting differences.  To be equal in this sense,\r\nthe two proofs must have the same supported problem,\r\nthe same bindings, and the same supports.")
    public static SubLObject proof_equalP(final SubLObject proof1, final SubLObject proof2) {
        assert NIL != proof_p(proof1) : "! inference_datastructures_proof.proof_p(proof1) " + ("proofp(proof1) " + "CommonSymbols.NIL != proofp(proof1) ") + proof1;
        assert NIL != proof_p(proof2) : "! inference_datastructures_proof.proof_p(proof2) " + ("proofp(proof2) " + "CommonSymbols.NIL != proofp(proof2) ") + proof2;
        if (proof1.eql(proof2)) {
            return T;
        }
        final SubLObject supported_problem = proof_supported_problem(proof2);
        final SubLObject v_bindings = proof_bindings(proof2);
        final SubLObject supports = proof_direct_supports(proof2);
        return proof_matches_specificationP(proof1, supported_problem, v_bindings, supports);
    }

    /**
     *
     *
     * @return boolean; t iff CANDIDATE-PROOF would equal a proof supporting
    SUPPORTED-PROBLEM, with bindings PROOF-BINDINGS and direct supports PROOF-DIRECT-SUPPORTS.
     * @unknown assumes PROOF-BINDINGS have been canonicalized, but does not assume that PROOF-DIRECT-SUPPORTS has been canonicalized.
     */
    @LispMethod(comment = "@return boolean; t iff CANDIDATE-PROOF would equal a proof supporting\r\nSUPPORTED-PROBLEM, with bindings PROOF-BINDINGS and direct supports PROOF-DIRECT-SUPPORTS.\r\n@unknown assumes PROOF-BINDINGS have been canonicalized, but does not assume that PROOF-DIRECT-SUPPORTS has been canonicalized.")
    public static final SubLObject proof_matches_specificationP_alt(SubLObject candidate_proof, SubLObject supported_problem, SubLObject proof_bindings, SubLObject proof_direct_supports) {
        SubLTrampolineFile.checkType(candidate_proof, PROOF_P);
        SubLTrampolineFile.checkType(supported_problem, PROBLEM_P);
        if (com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem(candidate_proof) != supported_problem) {
            return NIL;
        } else {
            if (NIL == inference_worker.proof_bindings_equalP(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_bindings(candidate_proof), proof_bindings)) {
                return NIL;
            } else {
                return arguments.justification_equal(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_direct_supports(candidate_proof), proof_direct_supports);
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff CANDIDATE-PROOF would equal a proof supporting
    SUPPORTED-PROBLEM, with bindings PROOF-BINDINGS and direct supports PROOF-DIRECT-SUPPORTS.
     * @unknown assumes PROOF-BINDINGS have been canonicalized, but does not assume that PROOF-DIRECT-SUPPORTS has been canonicalized.
     */
    @LispMethod(comment = "@return boolean; t iff CANDIDATE-PROOF would equal a proof supporting\r\nSUPPORTED-PROBLEM, with bindings PROOF-BINDINGS and direct supports PROOF-DIRECT-SUPPORTS.\r\n@unknown assumes PROOF-BINDINGS have been canonicalized, but does not assume that PROOF-DIRECT-SUPPORTS has been canonicalized.")
    public static SubLObject proof_matches_specificationP(final SubLObject candidate_proof, final SubLObject supported_problem, final SubLObject proof_bindings, final SubLObject proof_direct_supports) {
        assert NIL != proof_p(candidate_proof) : "! inference_datastructures_proof.proof_p(candidate_proof) " + ("proofp(candidate_proof) " + "CommonSymbols.NIL != proofp(candidate_proof) ") + candidate_proof;
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : "! inference_datastructures_problem.problem_p(supported_problem) " + ("inference_datastructures_problem.problem_p(supported_problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(supported_problem) ") + supported_problem;
        if (!proof_supported_problem(candidate_proof).eql(supported_problem)) {
            return NIL;
        }
        if (NIL == inference_worker.proof_bindings_equalP(proof_bindings(candidate_proof), proof_bindings)) {
            return NIL;
        }
        return justification_equal(proof_direct_supports(candidate_proof), proof_direct_supports);
    }

    public static final SubLObject declare_inference_datastructures_proof_file_alt() {
        declareFunction("proof_print_function_trampoline", "PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("proof_p", "PROOF-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.$proof_p$UnaryFunction();
        declareFunction("prf_suid", "PRF-SUID", 1, 0, false);
        declareFunction("prf_bindings", "PRF-BINDINGS", 1, 0, false);
        declareFunction("prf_link", "PRF-LINK", 1, 0, false);
        declareFunction("prf_subproofs", "PRF-SUBPROOFS", 1, 0, false);
        declareFunction("prf_dependents", "PRF-DEPENDENTS", 1, 0, false);
        declareFunction("_csetf_prf_suid", "_CSETF-PRF-SUID", 2, 0, false);
        declareFunction("_csetf_prf_bindings", "_CSETF-PRF-BINDINGS", 2, 0, false);
        declareFunction("_csetf_prf_link", "_CSETF-PRF-LINK", 2, 0, false);
        declareFunction("_csetf_prf_subproofs", "_CSETF-PRF-SUBPROOFS", 2, 0, false);
        declareFunction("_csetf_prf_dependents", "_CSETF-PRF-DEPENDENTS", 2, 0, false);
        declareFunction("make_proof", "MAKE-PROOF", 0, 1, false);
        declareFunction("valid_proof_p", "VALID-PROOF-P", 1, 0, false);
        declareFunction("proof_invalid_p", "PROOF-INVALID-P", 1, 0, false);
        declareFunction("print_proof", "PRINT-PROOF", 3, 0, false);
        declareFunction("sxhash_proof_method", "SXHASH-PROOF-METHOD", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.$sxhash_proof_method$UnaryFunction();
        declareFunction("list_of_proof_p", "LIST-OF-PROOF-P", 1, 0, false);
        declareFunction("non_empty_list_of_proof_p", "NON-EMPTY-LIST-OF-PROOF-P", 1, 0, false);
        declareMacro("do_proof_direct_subproofs", "DO-PROOF-DIRECT-SUBPROOFS");
        declareMacro("do_proof_all_subproofs", "DO-PROOF-ALL-SUBPROOFS");
        declareMacro("do_proof_dependent_proofs_computed", "DO-PROOF-DEPENDENT-PROOFS-COMPUTED");
        declareMacro("do_proof_dependent_proofs_int", "DO-PROOF-DEPENDENT-PROOFS-INT");
        declareMacro("do_proof_dependent_proofs", "DO-PROOF-DEPENDENT-PROOFS");
        declareFunction("new_proof", "NEW-PROOF", 2, 0, false);
        declareFunction("new_proof_with_bindings", "NEW-PROOF-WITH-BINDINGS", 3, 0, false);
        declareFunction("register_proof", "REGISTER-PROOF", 1, 0, false);
        declareFunction("add_dependent_proof_references", "ADD-DEPENDENT-PROOF-REFERENCES", 1, 0, false);
        declareFunction("destroy_proof", "DESTROY-PROOF", 1, 0, false);
        declareFunction("destroy_dependent_proofs", "DESTROY-DEPENDENT-PROOFS", 1, 0, false);
        declareFunction("destroy_problem_store_proof", "DESTROY-PROBLEM-STORE-PROOF", 1, 0, false);
        declareFunction("destroy_proof_int", "DESTROY-PROOF-INT", 1, 0, false);
        declareFunction("note_proof_invalid", "NOTE-PROOF-INVALID", 1, 0, false);
        declareFunction("proof_suid", "PROOF-SUID", 1, 0, false);
        declareFunction("proof_bindings", "PROOF-BINDINGS", 1, 0, false);
        declareFunction("proof_link", "PROOF-LINK", 1, 0, false);
        declareFunction("proof_direct_subproofs", "PROOF-DIRECT-SUBPROOFS", 1, 0, false);
        declareFunction("proof_dependents", "PROOF-DEPENDENTS", 1, 0, false);
        declareFunction("set_proof_bindings", "SET-PROOF-BINDINGS", 2, 0, false);
        declareFunction("add_proof_dependent", "ADD-PROOF-DEPENDENT", 2, 0, false);
        declareFunction("remove_proof_dependent", "REMOVE-PROOF-DEPENDENT", 2, 0, false);
        declareFunction("proof_store", "PROOF-STORE", 1, 0, false);
        declareFunction("proof_supported_problem", "PROOF-SUPPORTED-PROBLEM", 1, 0, false);
        declareFunction("proof_supported_problem_query", "PROOF-SUPPORTED-PROBLEM-QUERY", 1, 0, false);
        declareFunction("proof_has_supportsP", "PROOF-HAS-SUPPORTS?", 1, 0, false);
        declareFunction("proof_supports", "PROOF-SUPPORTS", 1, 0, false);
        declareFunction("proof_direct_supports", "PROOF-DIRECT-SUPPORTS", 1, 0, false);
        declareFunction("proof_spec_direct_supports", "PROOF-SPEC-DIRECT-SUPPORTS", 2, 0, false);
        declareFunction("proof_direct_supports_recursive", "PROOF-DIRECT-SUPPORTS-RECURSIVE", 1, 0, false);
        declareFunction("proof_spec_direct_supports_recursive", "PROOF-SPEC-DIRECT-SUPPORTS-RECURSIVE", 2, 0, false);
        declareFunction("all_proof_supports", "ALL-PROOF-SUPPORTS", 1, 0, false);
        declareFunction("all_proof_supports_recursive", "ALL-PROOF-SUPPORTS-RECURSIVE", 2, 0, false);
        declareFunction("all_proof_supports_of_proofs", "ALL-PROOF-SUPPORTS-OF-PROOFS", 1, 0, false);
        declareFunction("proof_has_subproofsP", "PROOF-HAS-SUBPROOFS?", 1, 0, false);
        declareFunction("proof_sole_subproof", "PROOF-SOLE-SUBPROOF", 1, 0, false);
        declareFunction("proof_first_subproof", "PROOF-FIRST-SUBPROOF", 1, 0, false);
        declareFunction("all_proof_subproofs", "ALL-PROOF-SUBPROOFS", 1, 0, false);
        declareFunction("all_proof_subproofs_recursive", "ALL-PROOF-SUBPROOFS-RECURSIVE", 2, 0, false);
        declareFunction("all_proof_subproblems", "ALL-PROOF-SUBPROBLEMS", 1, 0, false);
        declareFunction("proof_has_dependent_proofsP", "PROOF-HAS-DEPENDENT-PROOFS?", 1, 0, false);
        declareFunction("proof_dependent_proofs_computed", "PROOF-DEPENDENT-PROOFS-COMPUTED", 1, 1, false);
        declareFunction("proof_dependent_proofs_int", "PROOF-DEPENDENT-PROOFS-INT", 1, 1, false);
        declareFunction("proof_dependent_proofs", "PROOF-DEPENDENT-PROOFS", 1, 1, false);
        declareFunction("proof_status", "PROOF-STATUS", 1, 0, false);
        declareFunction("proof_rejectedP", "PROOF-REJECTED?", 1, 0, false);
        declareFunction("proof_reject_reason", "PROOF-REJECT-REASON", 1, 0, false);
        declareFunction("proof_provenP", "PROOF-PROVEN?", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.$proof_provenP$UnaryFunction();
        declareFunction("proof_processedP", "PROOF-PROCESSED?", 1, 0, false);
        declareFunction("proof_destructibility_status", "PROOF-DESTRUCTIBILITY-STATUS", 1, 0, false);
        declareFunction("proof_indestructibleP", "PROOF-INDESTRUCTIBLE?", 1, 0, false);
        declareFunction("proof_destructibleP", "PROOF-DESTRUCTIBLE?", 1, 0, false);
        declareFunction("proof_note_rejected", "PROOF-NOTE-REJECTED", 2, 0, false);
        declareFunction("proof_rejected_due_to_ill_formednessP", "PROOF-REJECTED-DUE-TO-ILL-FORMEDNESS?", 1, 0, false);
        declareFunction("proof_type", "PROOF-TYPE", 1, 0, false);
        declareFunction("proof_equalP", "PROOF-EQUAL?", 2, 0, false);
        declareFunction("proof_matches_specificationP", "PROOF-MATCHES-SPECIFICATION?", 4, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_datastructures_proof_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("proof_print_function_trampoline", "PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("proof_p", "PROOF-P", 1, 0, false);
            new inference_datastructures_proof.$proof_p$UnaryFunction();
            declareFunction("prf_suid", "PRF-SUID", 1, 0, false);
            declareFunction("prf_bindings", "PRF-BINDINGS", 1, 0, false);
            declareFunction("prf_link", "PRF-LINK", 1, 0, false);
            declareFunction("prf_subproofs", "PRF-SUBPROOFS", 1, 0, false);
            declareFunction("prf_dependents", "PRF-DEPENDENTS", 1, 0, false);
            declareFunction("prf_processedP", "PRF-PROCESSED?", 1, 0, false);
            declareFunction("_csetf_prf_suid", "_CSETF-PRF-SUID", 2, 0, false);
            declareFunction("_csetf_prf_bindings", "_CSETF-PRF-BINDINGS", 2, 0, false);
            declareFunction("_csetf_prf_link", "_CSETF-PRF-LINK", 2, 0, false);
            declareFunction("_csetf_prf_subproofs", "_CSETF-PRF-SUBPROOFS", 2, 0, false);
            declareFunction("_csetf_prf_dependents", "_CSETF-PRF-DEPENDENTS", 2, 0, false);
            declareFunction("_csetf_prf_processedP", "_CSETF-PRF-PROCESSED?", 2, 0, false);
            declareFunction("make_proof", "MAKE-PROOF", 0, 1, false);
            declareFunction("visit_defstruct_proof", "VISIT-DEFSTRUCT-PROOF", 2, 0, false);
            declareFunction("visit_defstruct_object_proof_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-METHOD", 2, 0, false);
            declareFunction("valid_proof_p", "VALID-PROOF-P", 1, 0, false);
            declareFunction("proof_invalid_p", "PROOF-INVALID-P", 1, 0, false);
            declareFunction("print_proof", "PRINT-PROOF", 3, 0, false);
            declareFunction("sxhash_proof_method", "SXHASH-PROOF-METHOD", 1, 0, false);
            new inference_datastructures_proof.$sxhash_proof_method$UnaryFunction();
            declareFunction("list_of_proof_p", "LIST-OF-PROOF-P", 1, 0, false);
            declareFunction("non_empty_list_of_proof_p", "NON-EMPTY-LIST-OF-PROOF-P", 1, 0, false);
            declareMacro("do_proof_direct_subproofs", "DO-PROOF-DIRECT-SUBPROOFS");
            declareMacro("do_proof_all_subproofs", "DO-PROOF-ALL-SUBPROOFS");
            declareMacro("do_proof_dependent_proofs", "DO-PROOF-DEPENDENT-PROOFS");
            declareFunction("new_proof", "NEW-PROOF", 2, 0, false);
            declareFunction("new_proof_with_bindings", "NEW-PROOF-WITH-BINDINGS", 3, 0, false);
            declareFunction("register_proof", "REGISTER-PROOF", 1, 0, false);
            declareFunction("add_dependent_proof_references", "ADD-DEPENDENT-PROOF-REFERENCES", 1, 0, false);
            declareFunction("destroy_proof", "DESTROY-PROOF", 1, 0, false);
            declareFunction("destroy_dependent_proofs", "DESTROY-DEPENDENT-PROOFS", 1, 0, false);
            declareFunction("destroy_problem_store_proof", "DESTROY-PROBLEM-STORE-PROOF", 1, 0, false);
            declareFunction("destroy_proof_int", "DESTROY-PROOF-INT", 1, 0, false);
            declareFunction("note_proof_invalid", "NOTE-PROOF-INVALID", 1, 0, false);
            declareFunction("proof_suid", "PROOF-SUID", 1, 0, false);
            declareFunction("proof_bindings", "PROOF-BINDINGS", 1, 0, false);
            declareFunction("proof_link", "PROOF-LINK", 1, 0, false);
            declareFunction("proof_direct_subproofs", "PROOF-DIRECT-SUBPROOFS", 1, 0, false);
            declareFunction("proof_dependents", "PROOF-DEPENDENTS", 1, 0, false);
            declareFunction("set_proof_bindings", "SET-PROOF-BINDINGS", 2, 0, false);
            declareFunction("add_proof_dependent", "ADD-PROOF-DEPENDENT", 2, 0, false);
            declareFunction("remove_proof_dependent", "REMOVE-PROOF-DEPENDENT", 2, 0, false);
            declareFunction("note_proof_processed", "NOTE-PROOF-PROCESSED", 1, 0, false);
            declareFunction("note_proof_unprocessed", "NOTE-PROOF-UNPROCESSED", 1, 0, false);
            declareFunction("proof_store", "PROOF-STORE", 1, 0, false);
            declareFunction("proof_supported_problem", "PROOF-SUPPORTED-PROBLEM", 1, 0, false);
            declareFunction("proof_supported_problem_query", "PROOF-SUPPORTED-PROBLEM-QUERY", 1, 0, false);
            declareFunction("proof_supported_problem_free_hl_vars", "PROOF-SUPPORTED-PROBLEM-FREE-HL-VARS", 1, 0, false);
            declareFunction("proof_has_supportsP", "PROOF-HAS-SUPPORTS?", 1, 0, false);
            declareFunction("proof_supports", "PROOF-SUPPORTS", 1, 0, false);
            declareFunction("proof_direct_supports", "PROOF-DIRECT-SUPPORTS", 1, 0, false);
            declareFunction("proof_spec_direct_supports", "PROOF-SPEC-DIRECT-SUPPORTS", 2, 0, false);
            declareFunction("proof_direct_supports_recursive", "PROOF-DIRECT-SUPPORTS-RECURSIVE", 1, 0, false);
            declareFunction("proof_spec_direct_supports_recursive", "PROOF-SPEC-DIRECT-SUPPORTS-RECURSIVE", 2, 0, false);
            declareFunction("all_proof_supports", "ALL-PROOF-SUPPORTS", 1, 0, false);
            declareFunction("all_proof_supports_recursive", "ALL-PROOF-SUPPORTS-RECURSIVE", 2, 0, false);
            declareFunction("all_proof_supports_of_proofs", "ALL-PROOF-SUPPORTS-OF-PROOFS", 1, 0, false);
            declareFunction("proof_has_subproofsP", "PROOF-HAS-SUBPROOFS?", 1, 0, false);
            declareFunction("proof_sole_subproof", "PROOF-SOLE-SUBPROOF", 1, 0, false);
            declareFunction("proof_first_subproof", "PROOF-FIRST-SUBPROOF", 1, 0, false);
            declareFunction("all_proof_subproofs", "ALL-PROOF-SUBPROOFS", 1, 0, false);
            declareFunction("all_proof_subproofs_recursive", "ALL-PROOF-SUBPROOFS-RECURSIVE", 2, 0, false);
            declareFunction("all_proof_subproblems", "ALL-PROOF-SUBPROBLEMS", 1, 0, false);
            declareFunction("proof_has_dependent_proofsP", "PROOF-HAS-DEPENDENT-PROOFS?", 1, 0, false);
            declareFunction("proof_dependent_proofs", "PROOF-DEPENDENT-PROOFS", 1, 1, false);
            declareFunction("proof_status", "PROOF-STATUS", 1, 0, false);
            declareFunction("proof_rejectedP", "PROOF-REJECTED?", 1, 0, false);
            declareFunction("proof_reject_reason", "PROOF-REJECT-REASON", 1, 0, false);
            declareFunction("proof_provenP", "PROOF-PROVEN?", 1, 0, false);
            new inference_datastructures_proof.$proof_provenP$UnaryFunction();
            declareFunction("proof_processedP", "PROOF-PROCESSED?", 1, 0, false);
            declareFunction("proof_destructibility_status", "PROOF-DESTRUCTIBILITY-STATUS", 1, 0, false);
            declareFunction("proof_indestructibleP", "PROOF-INDESTRUCTIBLE?", 1, 0, false);
            declareFunction("proof_destructibleP", "PROOF-DESTRUCTIBLE?", 1, 0, false);
            declareFunction("proof_note_rejected", "PROOF-NOTE-REJECTED", 2, 0, false);
            declareFunction("proof_rejected_due_to_ill_formednessP", "PROOF-REJECTED-DUE-TO-ILL-FORMEDNESS?", 1, 0, false);
            declareFunction("proof_type", "PROOF-TYPE", 1, 0, false);
            declareFunction("proof_equalP", "PROOF-EQUAL?", 2, 0, false);
            declareFunction("proof_matches_specificationP", "PROOF-MATCHES-SPECIFICATION?", 4, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareMacro("do_proof_dependent_proofs_computed", "DO-PROOF-DEPENDENT-PROOFS-COMPUTED");
            declareMacro("do_proof_dependent_proofs_int", "DO-PROOF-DEPENDENT-PROOFS-INT");
            declareFunction("proof_dependent_proofs_computed", "PROOF-DEPENDENT-PROOFS-COMPUTED", 1, 1, false);
            declareFunction("proof_dependent_proofs_int", "PROOF-DEPENDENT-PROOFS-INT", 1, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_datastructures_proof_file_Previous() {
        declareFunction("proof_print_function_trampoline", "PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("proof_p", "PROOF-P", 1, 0, false);
        new inference_datastructures_proof.$proof_p$UnaryFunction();
        declareFunction("prf_suid", "PRF-SUID", 1, 0, false);
        declareFunction("prf_bindings", "PRF-BINDINGS", 1, 0, false);
        declareFunction("prf_link", "PRF-LINK", 1, 0, false);
        declareFunction("prf_subproofs", "PRF-SUBPROOFS", 1, 0, false);
        declareFunction("prf_dependents", "PRF-DEPENDENTS", 1, 0, false);
        declareFunction("prf_processedP", "PRF-PROCESSED?", 1, 0, false);
        declareFunction("_csetf_prf_suid", "_CSETF-PRF-SUID", 2, 0, false);
        declareFunction("_csetf_prf_bindings", "_CSETF-PRF-BINDINGS", 2, 0, false);
        declareFunction("_csetf_prf_link", "_CSETF-PRF-LINK", 2, 0, false);
        declareFunction("_csetf_prf_subproofs", "_CSETF-PRF-SUBPROOFS", 2, 0, false);
        declareFunction("_csetf_prf_dependents", "_CSETF-PRF-DEPENDENTS", 2, 0, false);
        declareFunction("_csetf_prf_processedP", "_CSETF-PRF-PROCESSED?", 2, 0, false);
        declareFunction("make_proof", "MAKE-PROOF", 0, 1, false);
        declareFunction("visit_defstruct_proof", "VISIT-DEFSTRUCT-PROOF", 2, 0, false);
        declareFunction("visit_defstruct_object_proof_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-METHOD", 2, 0, false);
        declareFunction("valid_proof_p", "VALID-PROOF-P", 1, 0, false);
        declareFunction("proof_invalid_p", "PROOF-INVALID-P", 1, 0, false);
        declareFunction("print_proof", "PRINT-PROOF", 3, 0, false);
        declareFunction("sxhash_proof_method", "SXHASH-PROOF-METHOD", 1, 0, false);
        new inference_datastructures_proof.$sxhash_proof_method$UnaryFunction();
        declareFunction("list_of_proof_p", "LIST-OF-PROOF-P", 1, 0, false);
        declareFunction("non_empty_list_of_proof_p", "NON-EMPTY-LIST-OF-PROOF-P", 1, 0, false);
        declareMacro("do_proof_direct_subproofs", "DO-PROOF-DIRECT-SUBPROOFS");
        declareMacro("do_proof_all_subproofs", "DO-PROOF-ALL-SUBPROOFS");
        declareMacro("do_proof_dependent_proofs", "DO-PROOF-DEPENDENT-PROOFS");
        declareFunction("new_proof", "NEW-PROOF", 2, 0, false);
        declareFunction("new_proof_with_bindings", "NEW-PROOF-WITH-BINDINGS", 3, 0, false);
        declareFunction("register_proof", "REGISTER-PROOF", 1, 0, false);
        declareFunction("add_dependent_proof_references", "ADD-DEPENDENT-PROOF-REFERENCES", 1, 0, false);
        declareFunction("destroy_proof", "DESTROY-PROOF", 1, 0, false);
        declareFunction("destroy_dependent_proofs", "DESTROY-DEPENDENT-PROOFS", 1, 0, false);
        declareFunction("destroy_problem_store_proof", "DESTROY-PROBLEM-STORE-PROOF", 1, 0, false);
        declareFunction("destroy_proof_int", "DESTROY-PROOF-INT", 1, 0, false);
        declareFunction("note_proof_invalid", "NOTE-PROOF-INVALID", 1, 0, false);
        declareFunction("proof_suid", "PROOF-SUID", 1, 0, false);
        declareFunction("proof_bindings", "PROOF-BINDINGS", 1, 0, false);
        declareFunction("proof_link", "PROOF-LINK", 1, 0, false);
        declareFunction("proof_direct_subproofs", "PROOF-DIRECT-SUBPROOFS", 1, 0, false);
        declareFunction("proof_dependents", "PROOF-DEPENDENTS", 1, 0, false);
        declareFunction("set_proof_bindings", "SET-PROOF-BINDINGS", 2, 0, false);
        declareFunction("add_proof_dependent", "ADD-PROOF-DEPENDENT", 2, 0, false);
        declareFunction("remove_proof_dependent", "REMOVE-PROOF-DEPENDENT", 2, 0, false);
        declareFunction("note_proof_processed", "NOTE-PROOF-PROCESSED", 1, 0, false);
        declareFunction("note_proof_unprocessed", "NOTE-PROOF-UNPROCESSED", 1, 0, false);
        declareFunction("proof_store", "PROOF-STORE", 1, 0, false);
        declareFunction("proof_supported_problem", "PROOF-SUPPORTED-PROBLEM", 1, 0, false);
        declareFunction("proof_supported_problem_query", "PROOF-SUPPORTED-PROBLEM-QUERY", 1, 0, false);
        declareFunction("proof_supported_problem_free_hl_vars", "PROOF-SUPPORTED-PROBLEM-FREE-HL-VARS", 1, 0, false);
        declareFunction("proof_has_supportsP", "PROOF-HAS-SUPPORTS?", 1, 0, false);
        declareFunction("proof_supports", "PROOF-SUPPORTS", 1, 0, false);
        declareFunction("proof_direct_supports", "PROOF-DIRECT-SUPPORTS", 1, 0, false);
        declareFunction("proof_spec_direct_supports", "PROOF-SPEC-DIRECT-SUPPORTS", 2, 0, false);
        declareFunction("proof_direct_supports_recursive", "PROOF-DIRECT-SUPPORTS-RECURSIVE", 1, 0, false);
        declareFunction("proof_spec_direct_supports_recursive", "PROOF-SPEC-DIRECT-SUPPORTS-RECURSIVE", 2, 0, false);
        declareFunction("all_proof_supports", "ALL-PROOF-SUPPORTS", 1, 0, false);
        declareFunction("all_proof_supports_recursive", "ALL-PROOF-SUPPORTS-RECURSIVE", 2, 0, false);
        declareFunction("all_proof_supports_of_proofs", "ALL-PROOF-SUPPORTS-OF-PROOFS", 1, 0, false);
        declareFunction("proof_has_subproofsP", "PROOF-HAS-SUBPROOFS?", 1, 0, false);
        declareFunction("proof_sole_subproof", "PROOF-SOLE-SUBPROOF", 1, 0, false);
        declareFunction("proof_first_subproof", "PROOF-FIRST-SUBPROOF", 1, 0, false);
        declareFunction("all_proof_subproofs", "ALL-PROOF-SUBPROOFS", 1, 0, false);
        declareFunction("all_proof_subproofs_recursive", "ALL-PROOF-SUBPROOFS-RECURSIVE", 2, 0, false);
        declareFunction("all_proof_subproblems", "ALL-PROOF-SUBPROBLEMS", 1, 0, false);
        declareFunction("proof_has_dependent_proofsP", "PROOF-HAS-DEPENDENT-PROOFS?", 1, 0, false);
        declareFunction("proof_dependent_proofs", "PROOF-DEPENDENT-PROOFS", 1, 1, false);
        declareFunction("proof_status", "PROOF-STATUS", 1, 0, false);
        declareFunction("proof_rejectedP", "PROOF-REJECTED?", 1, 0, false);
        declareFunction("proof_reject_reason", "PROOF-REJECT-REASON", 1, 0, false);
        declareFunction("proof_provenP", "PROOF-PROVEN?", 1, 0, false);
        new inference_datastructures_proof.$proof_provenP$UnaryFunction();
        declareFunction("proof_processedP", "PROOF-PROCESSED?", 1, 0, false);
        declareFunction("proof_destructibility_status", "PROOF-DESTRUCTIBILITY-STATUS", 1, 0, false);
        declareFunction("proof_indestructibleP", "PROOF-INDESTRUCTIBLE?", 1, 0, false);
        declareFunction("proof_destructibleP", "PROOF-DESTRUCTIBLE?", 1, 0, false);
        declareFunction("proof_note_rejected", "PROOF-NOTE-REJECTED", 2, 0, false);
        declareFunction("proof_rejected_due_to_ill_formednessP", "PROOF-REJECTED-DUE-TO-ILL-FORMEDNESS?", 1, 0, false);
        declareFunction("proof_type", "PROOF-TYPE", 1, 0, false);
        declareFunction("proof_equalP", "PROOF-EQUAL?", 2, 0, false);
        declareFunction("proof_matches_specificationP", "PROOF-MATCHES-SPECIFICATION?", 4, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_datastructures_proof_file_alt() {
        defparameter("*PROOF-DATASTRUCTURE-STORES-DEPENDENT-PROOFS?*", NIL);
        defconstant("*DTP-PROOF*", PROOF);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_proof_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-PROOF*", PROOF);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*PROOF-DATASTRUCTURE-STORES-DEPENDENT-PROOFS?*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_inference_datastructures_proof_file_Previous() {
        defconstant("*DTP-PROOF*", PROOF);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_proof_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_proof$.getGlobalValue(), symbol_function(PROOF_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(PRF_SUID, _CSETF_PRF_SUID);
        def_csetf(PRF_BINDINGS, _CSETF_PRF_BINDINGS);
        def_csetf(PRF_LINK, _CSETF_PRF_LINK);
        def_csetf(PRF_SUBPROOFS, _CSETF_PRF_SUBPROOFS);
        def_csetf(PRF_DEPENDENTS, _CSETF_PRF_DEPENDENTS);
        def_csetf($sym20$PRF_PROCESSED_, $sym21$_CSETF_PRF_PROCESSED_);
        identity(PROOF);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_proof$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROOF_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_proof$.getGlobalValue(), symbol_function(SXHASH_PROOF_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_datastructures_proof_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_datastructures_proof_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_datastructures_proof_file();
    }

    public static class $proof_native extends SubLStructNative {
        public SubLObject $suid;

        public SubLObject $bindings;

        public SubLObject $link;

        public SubLObject $subproofs;

        public SubLObject $dependents;

        public SubLObject $processedP;

        private static final SubLStructDeclNative structDecl;

        public $proof_native() {
            this.$suid = Lisp.NIL;
            this.$bindings = Lisp.NIL;
            this.$link = Lisp.NIL;
            this.$subproofs = Lisp.NIL;
            this.$dependents = Lisp.NIL;
            this.$processedP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$suid;
        }

        @Override
        public SubLObject getField3() {
            return this.$bindings;
        }

        @Override
        public SubLObject getField4() {
            return this.$link;
        }

        @Override
        public SubLObject getField5() {
            return this.$subproofs;
        }

        @Override
        public SubLObject getField6() {
            return this.$dependents;
        }

        @Override
        public SubLObject getField7() {
            return this.$processedP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$link = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$subproofs = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$dependents = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$processedP = value;
        }

        static {
            structDecl = makeStructDeclNative(inference_datastructures_proof.$proof_native.class, PROOF, PROOF_P, $list3, $list4, new String[]{ "$suid", "$bindings", "$link", "$subproofs", "$dependents", "$processedP" }, $list5, $list6, PRINT_PROOF);
        }
    }

    public static final class $proof_p$UnaryFunction extends UnaryFunction {
        public $proof_p$UnaryFunction() {
            super(extractFunctionNamed("PROOF-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return proof_p(arg1);
        }
    }

    public static final class $sxhash_proof_method$UnaryFunction extends UnaryFunction {
        public $sxhash_proof_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-PROOF-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_proof_method(arg1);
        }
    }

    public static final class $proof_provenP$UnaryFunction extends UnaryFunction {
        public $proof_provenP$UnaryFunction() {
            super(extractFunctionNamed("PROOF-PROVEN?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return proof_provenP(arg1);
        }
    }

    static private final SubLList $list_alt3 = list(makeSymbol("SUID"), makeSymbol("BINDINGS"), makeSymbol("LINK"), makeSymbol("SUBPROOFS"), makeSymbol("DEPENDENTS"));

    static private final SubLList $list_alt4 = list($SUID, makeKeyword("BINDINGS"), $LINK, makeKeyword("SUBPROOFS"), makeKeyword("DEPENDENTS"));

    static private final SubLList $list_alt5 = list(makeSymbol("PRF-SUID"), makeSymbol("PRF-BINDINGS"), makeSymbol("PRF-LINK"), makeSymbol("PRF-SUBPROOFS"), makeSymbol("PRF-DEPENDENTS"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-PRF-SUID"), makeSymbol("_CSETF-PRF-BINDINGS"), makeSymbol("_CSETF-PRF-LINK"), makeSymbol("_CSETF-PRF-SUBPROOFS"), makeSymbol("_CSETF-PRF-DEPENDENTS"));

    static private final SubLString $str_alt24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt26$_Invalid_PROOF__s_ = makeString("<Invalid PROOF ~s>");

    static private final SubLString $str_alt28$_PROOF__a__a_for_link__a__a_suppo = makeString("<PROOF ~a.~a for link ~a.~a supported by ~a, supporting ~a>");

    static private final SubLList $list_alt30 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("PROOF")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt33 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("PROOF"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt34 = list($DONE);

    static private final SubLList $list_alt38 = list(list(makeSymbol("DEPENDENT-PROOF-VAR"), makeSymbol("PROOF"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt39 = list(makeKeyword("PROOF-STATUS"), $DONE);

    static private final SubLSymbol $sym41$PROOF_PROBLEM = makeUninternedSymbol("PROOF-PROBLEM");

    static private final SubLSymbol $sym42$SUPPORTED_PROBLEM = makeUninternedSymbol("SUPPORTED-PROBLEM");

    static private final SubLSymbol $sym43$DEPENDENT_PROOF = makeUninternedSymbol("DEPENDENT-PROOF");

    private static final SubLSymbol DO_PROBLEM_SUPPORTED_PROBLEMS = makeSymbol("DO-PROBLEM-SUPPORTED-PROBLEMS");

    private static final SubLSymbol DO_PROBLEM_PROOFS = makeSymbol("DO-PROBLEM-PROOFS");

    static private final SubLSymbol $sym49$MEMBER_EQ_ = makeSymbol("MEMBER-EQ?");

    static private final SubLSymbol $sym52$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");

    public static final SubLSymbol $proof_datastructure_stores_dependent_proofsP$ = makeSymbol("*PROOF-DATASTRUCTURE-STORES-DEPENDENT-PROOFS?*");

    private static final SubLSymbol DO_PROOF_DEPENDENT_PROOFS_INT = makeSymbol("DO-PROOF-DEPENDENT-PROOFS-INT");

    private static final SubLSymbol DO_PROOF_DEPENDENT_PROOFS_COMPUTED = makeSymbol("DO-PROOF-DEPENDENT-PROOFS-COMPUTED");

    static private final SubLString $str_alt60$Could_not_remove_dependent__a_fro = makeString("Could not remove dependent ~a from proof ~a");

    static private final SubLString $str_alt61$Expected_link__a_to_have_exactly_ = makeString("Expected link ~a to have exactly one subproof");

    static private final SubLString $str_alt62$Unexpected_link_type_for_proof___ = makeString("Unexpected link type for proof: ~a");

    static private final SubLString $str_alt64$Expected__s_to_have_at_most_one_s = makeString("Expected ~s to have at most one subproof, but it had more");

    static private final SubLSymbol $sym65$_ = makeSymbol("<");
}

/**
 * Total time: 259 ms
 */
