package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_datastructures_proof extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof";
    public static String myFingerPrint = "cb408b096c1aadf6fc9993296988d344f45c77946a068d69a5fbf0c8607f306a";
    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLSymbol $dtp_proof$;
    private static SubLSymbol $sym0$PROOF;
    private static SubLSymbol $sym1$PROOF_P;
    private static SubLInteger $int$211;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLList $list6;
    private static SubLSymbol $sym7$PRINT_PROOF;
    private static SubLSymbol $sym8$PROOF_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list9;
    private static SubLSymbol $sym10$PRF_SUID;
    private static SubLSymbol $sym11$_CSETF_PRF_SUID;
    private static SubLSymbol $sym12$PRF_BINDINGS;
    private static SubLSymbol $sym13$_CSETF_PRF_BINDINGS;
    private static SubLSymbol $sym14$PRF_LINK;
    private static SubLSymbol $sym15$_CSETF_PRF_LINK;
    private static SubLSymbol $sym16$PRF_SUBPROOFS;
    private static SubLSymbol $sym17$_CSETF_PRF_SUBPROOFS;
    private static SubLSymbol $sym18$PRF_DEPENDENTS;
    private static SubLSymbol $sym19$_CSETF_PRF_DEPENDENTS;
    private static SubLSymbol $sym20$PRF_PROCESSED_;
    private static SubLSymbol $sym21$_CSETF_PRF_PROCESSED_;
    private static SubLSymbol $SUID;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $LINK;
    private static SubLSymbol $SUBPROOFS;
    private static SubLSymbol $DEPENDENTS;
    private static SubLSymbol $PROCESSED_;
    private static SubLString $str28$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym30$MAKE_PROOF;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_PROOF_METHOD;
    private static SubLSymbol $FREE;
    private static SubLString $str35$_Invalid_PROOF__s_;
    private static SubLSymbol $sym36$PROOF_SUID;
    private static SubLString $str37$_PROOF__a__a_for_link__a__a_suppo;
    private static SubLSymbol $sym38$SXHASH_PROOF_METHOD;
    private static SubLList $list39;
    private static SubLSymbol $sym40$DO_LIST;
    private static SubLSymbol $sym41$PROOF_DIRECT_SUBPROOFS;
    private static SubLList $list42;
    private static SubLList $list43;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym46$ALL_PROOF_SUBPROOFS;
    private static SubLList $list47;
    private static SubLList $list48;
    private static SubLSymbol $PROOF_STATUS;
    private static SubLSymbol $sym50$CSOME;
    private static SubLSymbol $sym51$PROOF_DEPENDENTS;
    private static SubLSymbol $sym52$PWHEN;
    private static SubLSymbol $sym53$PROOF_HAS_STATUS_;
    private static SubLSymbol $sym54$PROBLEM_LINK_P;
    private static SubLSymbol $sym55$LIST_OF_PROOF_P;
    private static SubLSymbol $sym56$BINDING_LIST_P;
    private static SubLString $str57$Expected_link__a_to_have_exactly_;
    private static SubLString $str58$Unexpected_link_type_for_proof___;
    private static SubLSymbol $sym59$SUPPORT_EQUAL;
    private static SubLString $str60$Expected__s_to_have_at_most_one_s;
    private static SubLSymbol $sym61$PROOF_SUPPORTED_PROBLEM;
    private static SubLSymbol $sym62$_;
    private static SubLSymbol $sym63$PROBLEM_SUID;
    private static SubLSymbol $REJECTED;
    private static SubLSymbol $PROVEN;
    private static SubLSymbol $sym66$PROOF_REJECT_REASON_P;
    private static SubLSymbol $ILL_FORMED;
    private static SubLSymbol $sym68$PROBLEM_P;

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject proof_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_proof(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject proof_p(SubLObject v_object) {
        return (v_object.getClass() == $proof_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject prf_suid(SubLObject v_object) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject prf_bindings(SubLObject v_object) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject prf_link(SubLObject v_object) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject prf_subproofs(SubLObject v_object) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject prf_dependents(SubLObject v_object) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject prf_processedP(SubLObject v_object) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject _csetf_prf_suid(SubLObject v_object, SubLObject value) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject _csetf_prf_bindings(SubLObject v_object, SubLObject value) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject _csetf_prf_link(SubLObject v_object, SubLObject value) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject _csetf_prf_subproofs(SubLObject v_object, SubLObject value) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject _csetf_prf_dependents(SubLObject v_object, SubLObject value) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject _csetf_prf_processedP(SubLObject v_object, SubLObject value) {
        assert NIL != proof_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject make_proof(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $proof_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_prf_suid(v_new, current_value);
            } else if (pcase_var.eql($BINDINGS)) {
                _csetf_prf_bindings(v_new, current_value);
            } else if (pcase_var.eql($LINK)) {
                _csetf_prf_link(v_new, current_value);
            } else if (pcase_var.eql($SUBPROOFS)) {
                _csetf_prf_subproofs(v_new, current_value);
            } else if (pcase_var.eql($DEPENDENTS)) {
                _csetf_prf_dependents(v_new, current_value);
            } else if (pcase_var.eql($PROCESSED_)) {
                _csetf_prf_processedP(v_new, current_value);
            } else {
                Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject visit_defstruct_proof(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym30$MAKE_PROOF, SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $SUID, prf_suid(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $BINDINGS, prf_bindings(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $LINK, prf_link(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SUBPROOFS, prf_subproofs(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DEPENDENTS, prf_dependents(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROCESSED_, prf_processedP(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym30$MAKE_PROOF, SIX_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1000L)
    public static SubLObject visit_defstruct_object_proof_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_proof(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 2000L)
    public static SubLObject valid_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != proof_p(v_object) && NIL == proof_invalid_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 2100L)
    public static SubLObject proof_invalid_p(SubLObject proof) {
        return Equality.eq($FREE, proof_bindings(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 2200L)
    public static SubLObject print_proof(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != proof_invalid_p(v_object)) {
            PrintLow.format(stream, $str35$_Invalid_PROOF__s_, prf_suid(v_object));
        } else {
            SubLObject proof_suid = proof_suid(v_object);
            SubLObject store_suid = inference_datastructures_problem_store.problem_store_suid(proof_store(v_object));
            SubLObject link_suid = inference_datastructures_problem_link.problem_link_suid(proof_link(v_object));
            SubLObject subproofs = proof_direct_subproofs(v_object);
            SubLObject subproof_suids = Mapping.mapcar($sym36$PROOF_SUID, subproofs);
            SubLObject dependents = proof_dependent_proofs(v_object, UNPROVIDED);
            SubLObject dependent_suids = Mapping.mapcar($sym36$PROOF_SUID, dependents);
            PrintLow.format(stream, $str37$_PROOF__a__a_for_link__a__a_suppo, new SubLObject[] { store_suid, proof_suid, store_suid, link_suid, subproof_suids, dependent_suids });
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3000L)
    public static SubLObject sxhash_proof_method(SubLObject v_object) {
        return prf_suid(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3000L)
    public static SubLObject list_of_proof_p(SubLObject v_object) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3200L)
    public static SubLObject non_empty_list_of_proof_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && NIL != list_of_proof_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3300L)
    public static SubLObject do_proof_direct_subproofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject subproof_var = NIL;
        SubLObject proof = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        subproof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        proof = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym40$DO_LIST, list(subproof_var, list($sym41$PROOF_DIRECT_SUBPROOFS, proof)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list39);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3500L)
    public static SubLObject do_proof_all_subproofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject subproof_var = NIL;
        SubLObject proof = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
        subproof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
        proof = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list42);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list42);
            if (NIL == conses_high.member(current_$1, $list43, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list42);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym40$DO_LIST, list(subproof_var, list($sym46$ALL_PROOF_SUBPROOFS, proof), $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3700L)
    public static SubLObject do_proof_dependent_proofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject dependent_proof_var = NIL;
        SubLObject proof = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        dependent_proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        proof = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list47);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == conses_high.member(current_$2, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
        }
        SubLObject proof_status_tail = cdestructuring_bind.property_list_member($PROOF_STATUS, current);
        SubLObject proof_status = (NIL != proof_status_tail) ? conses_high.cadr(proof_status_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return list($sym50$CSOME, list(dependent_proof_var, list($sym51$PROOF_DEPENDENTS, proof), done), listS($sym52$PWHEN, list($sym53$PROOF_HAS_STATUS_, dependent_proof_var, proof_status), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 4200L)
    public static SubLObject new_proof(SubLObject link, SubLObject subproofs) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        assert NIL != list_of_proof_p(subproofs) : subproofs;
        SubLObject proof = make_proof(UNPROVIDED);
        SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        SubLObject suid = inference_datastructures_problem_store.problem_store_new_proof_id(store);
        inference_metrics.increment_proof_historical_count();
        _csetf_prf_suid(proof, suid);
        _csetf_prf_link(proof, link);
        _csetf_prf_subproofs(proof, subproofs);
        _csetf_prf_processedP(proof, NIL);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 4700L)
    public static SubLObject new_proof_with_bindings(SubLObject link, SubLObject v_bindings, SubLObject subproofs) {
        SubLObject proof = new_proof(link, subproofs);
        set_proof_bindings(proof, v_bindings);
        register_proof(proof);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 4900L)
    public static SubLObject register_proof(SubLObject proof) {
        SubLObject link = proof_link(proof);
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        inference_datastructures_problem.add_problem_proof(supported_problem, proof);
        inference_datastructures_problem_store.add_problem_store_proof(store, proof);
        inference_datastructures_problem_link.add_problem_link_proof(link, proof);
        add_dependent_proof_references(proof);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 5300L)
    public static SubLObject add_dependent_proof_references(SubLObject proof) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 5500L)
    public static SubLObject destroy_proof(SubLObject proof) {
        if (NIL != valid_proof_p(proof)) {
            SubLObject link = proof_link(proof);
            SubLObject v_bindings = proof_bindings(proof);
            SubLObject store = proof_store(proof);
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
                SubLObject problem = proof_supported_problem(proof);
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 6600L)
    public static SubLObject destroy_dependent_proofs(SubLObject proof) {
        SubLObject problem = proof_supported_problem(proof);
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            SubLObject cdolist_list_var;
            SubLObject dependent_proofs = cdolist_list_var = proof_dependent_proofs(proof, UNPROVIDED);
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7000L)
    public static SubLObject destroy_problem_store_proof(SubLObject proof) {
        if (NIL != valid_proof_p(proof)) {
            note_proof_invalid(proof);
            return destroy_proof_int(proof);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7200L)
    public static SubLObject destroy_proof_int(SubLObject proof) {
        _csetf_prf_processedP(proof, $FREE);
        _csetf_prf_subproofs(proof, $FREE);
        _csetf_prf_dependents(proof, $FREE);
        _csetf_prf_link(proof, $FREE);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7400L)
    public static SubLObject note_proof_invalid(SubLObject proof) {
        _csetf_prf_bindings(proof, $FREE);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7500L)
    public static SubLObject proof_suid(SubLObject proof) {
        assert NIL != proof_p(proof) : proof;
        return prf_suid(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7600L)
    public static SubLObject proof_bindings(SubLObject proof) {
        assert NIL != proof_p(proof) : proof;
        return prf_bindings(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8000L)
    public static SubLObject proof_link(SubLObject proof) {
        assert NIL != proof_p(proof) : proof;
        return prf_link(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8100L)
    public static SubLObject proof_direct_subproofs(SubLObject proof) {
        assert NIL != proof_p(proof) : proof;
        return prf_subproofs(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8200L)
    public static SubLObject proof_dependents(SubLObject proof) {
        assert NIL != proof_p(proof) : proof;
        return prf_dependents(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8300L)
    public static SubLObject set_proof_bindings(SubLObject proof, SubLObject v_bindings) {
        assert NIL != proof_p(proof) : proof;
        assert NIL != bindings.binding_list_p(v_bindings) : v_bindings;
        _csetf_prf_bindings(proof, v_bindings);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8500L)
    public static SubLObject add_proof_dependent(SubLObject proof, SubLObject dependent) {
        SubLObject dependents = prf_dependents(proof);
        if (NIL == conses_high.member(dependent, dependents, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY))) {
            dependents = cons(dependent, dependents);
        }
        _csetf_prf_dependents(proof, dependents);
        return dependents;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8700L)
    public static SubLObject remove_proof_dependent(SubLObject proof, SubLObject old_dependent) {
        if (NIL != valid_proof_p(proof)) {
            SubLObject dependents = prf_dependents(proof);
            dependents = Sequences.delete(old_dependent, dependents, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            _csetf_prf_dependents(proof, dependents);
            return dependents;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9300L)
    public static SubLObject note_proof_processed(SubLObject proof) {
        _csetf_prf_processedP(proof, T);
        inference_datastructures_problem_store.problem_store_note_proof_processed(proof_store(proof), proof);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9500L)
    public static SubLObject note_proof_unprocessed(SubLObject proof) {
        _csetf_prf_processedP(proof, NIL);
        inference_datastructures_problem_store.problem_store_note_proof_unprocessed(proof_store(proof), proof);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9600L)
    public static SubLObject proof_store(SubLObject proof) {
        SubLObject link = proof_link(proof);
        SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9800L)
    public static SubLObject proof_supported_problem(SubLObject proof) {
        SubLObject link = proof_link(proof);
        return inference_datastructures_problem_link.problem_link_supported_problem(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9900L)
    public static SubLObject proof_supported_problem_query(SubLObject proof) {
        SubLObject supported_problem = proof_supported_problem(proof);
        SubLObject problem_query = inference_datastructures_problem.problem_query(supported_problem);
        return problem_query;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10100L)
    public static SubLObject proof_supported_problem_free_hl_vars(SubLObject proof) {
        SubLObject supported_problem = proof_supported_problem(proof);
        SubLObject problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        return problem_free_hl_vars;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10400L)
    public static SubLObject proof_has_supportsP(SubLObject proof) {
        return inference_worker.content_link_p(proof_link(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10500L)
    public static SubLObject proof_supports(SubLObject proof) {
        SubLObject link = proof_link(proof);
        if (NIL != inference_worker.content_link_p(link)) {
            SubLObject supports = inference_worker.content_link_supports(link);
            return supports;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10700L)
    public static SubLObject proof_direct_supports(SubLObject proof) {
        return proof_direct_supports_recursive(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10800L)
    public static SubLObject proof_spec_direct_supports(SubLObject link, SubLObject subproofs) {
        return proof_spec_direct_supports_recursive(link, subproofs);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10900L)
    public static SubLObject proof_direct_supports_recursive(SubLObject proof) {
        SubLObject link = proof_link(proof);
        SubLObject subproofs = proof_direct_subproofs(proof);
        return proof_spec_direct_supports_recursive(link, subproofs);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 11100L)
    public static SubLObject proof_spec_direct_supports_recursive(SubLObject link, SubLObject subproofs) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem_link.problem_link_store(link)) && NIL != inference_worker_transformation.transformation_link_p(link)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == list_utilities.singletonP(subproofs)) {
                Errors.error($str57$Expected_link__a_to_have_exactly_, link);
            }
            SubLObject subproof = subproofs.first();
            return append(inference_worker.content_link_supports(link), proof_direct_supports_recursive(subproof));
        }
        if (NIL != inference_worker.content_link_p(link)) {
            return inference_worker.content_link_supports(link);
        }
        if (NIL != inference_worker_restriction.restriction_link_p(link) || NIL != inference_worker_union.union_link_p(link)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == list_utilities.singletonP(subproofs)) {
                Errors.error($str57$Expected_link__a_to_have_exactly_, link);
            }
            SubLObject subproof = subproofs.first();
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
            return Sequences.nreverse(direct_supports);
        }
        Errors.error($str58$Unexpected_link_type_for_proof___, link);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 12400L)
    public static SubLObject all_proof_supports(SubLObject proof) {
        return Sequences.nreverse(all_proof_supports_recursive(proof, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 12500L)
    public static SubLObject all_proof_supports_recursive(SubLObject proof, SubLObject supports) {
        SubLObject cdolist_list_var;
        SubLObject new_supports = cdolist_list_var = proof_supports(proof);
        SubLObject new_support = NIL;
        new_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var = new_support;
            if (NIL == conses_high.member(item_var, supports, $sym59$SUPPORT_EQUAL, Symbols.symbol_function(IDENTITY))) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 12900L)
    public static SubLObject all_proof_supports_of_proofs(SubLObject proofs) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13100L)
    public static SubLObject proof_has_subproofsP(SubLObject proof) {
        return list_utilities.sublisp_boolean(proof_direct_subproofs(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13200L)
    public static SubLObject proof_sole_subproof(SubLObject proof) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13500L)
    public static SubLObject proof_first_subproof(SubLObject proof) {
        SubLObject cdolist_list_var = proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            return subproof;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13600L)
    public static SubLObject all_proof_subproofs(SubLObject proof) {
        SubLObject v_set_contents = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ));
        v_set_contents = all_proof_subproofs_recursive(proof, v_set_contents);
        return set_contents.set_contents_element_list(v_set_contents);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13900L)
    public static SubLObject all_proof_subproofs_recursive(SubLObject proof, SubLObject all_subproofs_set) {
        if (NIL == set_contents.set_contents_memberP(proof, all_subproofs_set, Symbols.symbol_function(EQ))) {
            all_subproofs_set = set_contents.set_contents_add(proof, all_subproofs_set, Symbols.symbol_function(EQ));
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14300L)
    public static SubLObject all_proof_subproblems(SubLObject proof) {
        SubLObject proofs = all_proof_subproofs(proof);
        SubLObject problems = Mapping.mapcar(Symbols.symbol_function($sym61$PROOF_SUPPORTED_PROBLEM), proofs);
        problems = Sort.sort(problems, Symbols.symbol_function($sym62$_), Symbols.symbol_function($sym63$PROBLEM_SUID));
        problems = list_utilities.delete_duplicates_sorted(problems, Symbols.symbol_function(EQ));
        return problems;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14600L)
    public static SubLObject proof_has_dependent_proofsP(SubLObject proof) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14800L)
    public static SubLObject proof_dependent_proofs(SubLObject proof, SubLObject proof_status) {
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
        return Sequences.nreverse(dependent_proofs);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15100L)
    public static SubLObject proof_status(SubLObject proof) {
        if (NIL != proof_rejectedP(proof)) {
            return $REJECTED;
        }
        return $PROVEN;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15300L)
    public static SubLObject proof_rejectedP(SubLObject proof) {
        SubLObject store = proof_store(proof);
        SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        return dictionary_utilities.dictionary_has_keyP(rejected_proofs, proof);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15500L)
    public static SubLObject proof_reject_reason(SubLObject proof) {
        SubLObject store = proof_store(proof);
        SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        return dictionary.dictionary_lookup(rejected_proofs, proof, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15700L)
    public static SubLObject proof_provenP(SubLObject proof) {
        return makeBoolean(NIL == proof_rejectedP(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15800L)
    public static SubLObject proof_processedP(SubLObject proof) {
        return prf_processedP(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15900L)
    public static SubLObject proof_destructibility_status(SubLObject proof) {
        return inference_datastructures_problem.problem_destructibility_status(proof_supported_problem(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16000L)
    public static SubLObject proof_indestructibleP(SubLObject proof) {
        return inference_datastructures_problem.problem_indestructibleP(proof_supported_problem(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16200L)
    public static SubLObject proof_destructibleP(SubLObject proof) {
        return inference_datastructures_problem.problem_destructibleP(proof_supported_problem(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16300L)
    public static SubLObject proof_note_rejected(SubLObject proof, SubLObject reject_reason) {
        assert NIL != inference_datastructures_enumerated_types.proof_reject_reason_p(reject_reason) : reject_reason;
        SubLObject store = proof_store(proof);
        SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        dictionary.dictionary_enter(rejected_proofs, proof, reject_reason);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16700L)
    public static SubLObject proof_rejected_due_to_ill_formednessP(SubLObject proof) {
        SubLObject store = proof_store(proof);
        SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        if ($ILL_FORMED == dictionary.dictionary_lookup(rejected_proofs, proof, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16900L)
    public static SubLObject proof_type(SubLObject proof) {
        if (NIL != inference_worker.content_proof_p(proof)) {
            return inference_worker.content_proof_hl_module(proof);
        }
        return inference_worker.structural_proof_type(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 17200L)
    public static SubLObject proof_equalP(SubLObject proof1, SubLObject proof2) {
        assert NIL != proof_p(proof1) : proof1;
        assert NIL != proof_p(proof2) : proof2;
        if (proof1.eql(proof2)) {
            return T;
        }
        SubLObject supported_problem = proof_supported_problem(proof2);
        SubLObject v_bindings = proof_bindings(proof2);
        SubLObject supports = proof_direct_supports(proof2);
        return proof_matches_specificationP(proof1, supported_problem, v_bindings, supports);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 17800L)
    public static SubLObject proof_matches_specificationP(SubLObject candidate_proof, SubLObject supported_problem, SubLObject proof_bindings, SubLObject proof_direct_supports) {
        assert NIL != proof_p(candidate_proof) : candidate_proof;
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        if (!proof_supported_problem(candidate_proof).eql(supported_problem)) {
            return NIL;
        }
        if (NIL == inference_worker.proof_bindings_equalP(proof_bindings(candidate_proof), proof_bindings)) {
            return NIL;
        }
        return arguments.justification_equal(proof_direct_supports(candidate_proof), proof_direct_supports);
    }

    public static SubLObject declare_inference_datastructures_proof_file() {
        declareFunction(myName, "proof_print_function_trampoline", "PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "proof_p", "PROOF-P", 1, 0, false);
        new $proof_p$UnaryFunction();
        declareFunction(myName, "prf_suid", "PRF-SUID", 1, 0, false);
        declareFunction(myName, "prf_bindings", "PRF-BINDINGS", 1, 0, false);
        declareFunction(myName, "prf_link", "PRF-LINK", 1, 0, false);
        declareFunction(myName, "prf_subproofs", "PRF-SUBPROOFS", 1, 0, false);
        declareFunction(myName, "prf_dependents", "PRF-DEPENDENTS", 1, 0, false);
        declareFunction(myName, "prf_processedP", "PRF-PROCESSED?", 1, 0, false);
        declareFunction(myName, "_csetf_prf_suid", "_CSETF-PRF-SUID", 2, 0, false);
        declareFunction(myName, "_csetf_prf_bindings", "_CSETF-PRF-BINDINGS", 2, 0, false);
        declareFunction(myName, "_csetf_prf_link", "_CSETF-PRF-LINK", 2, 0, false);
        declareFunction(myName, "_csetf_prf_subproofs", "_CSETF-PRF-SUBPROOFS", 2, 0, false);
        declareFunction(myName, "_csetf_prf_dependents", "_CSETF-PRF-DEPENDENTS", 2, 0, false);
        declareFunction(myName, "_csetf_prf_processedP", "_CSETF-PRF-PROCESSED?", 2, 0, false);
        declareFunction(myName, "make_proof", "MAKE-PROOF", 0, 1, false);
        declareFunction(myName, "visit_defstruct_proof", "VISIT-DEFSTRUCT-PROOF", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_proof_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-METHOD", 2, 0, false);
        declareFunction(myName, "valid_proof_p", "VALID-PROOF-P", 1, 0, false);
        declareFunction(myName, "proof_invalid_p", "PROOF-INVALID-P", 1, 0, false);
        declareFunction(myName, "print_proof", "PRINT-PROOF", 3, 0, false);
        declareFunction(myName, "sxhash_proof_method", "SXHASH-PROOF-METHOD", 1, 0, false);
        new $sxhash_proof_method$UnaryFunction();
        declareFunction(myName, "list_of_proof_p", "LIST-OF-PROOF-P", 1, 0, false);
        declareFunction(myName, "non_empty_list_of_proof_p", "NON-EMPTY-LIST-OF-PROOF-P", 1, 0, false);
        declareMacro(me, "do_proof_direct_subproofs", "DO-PROOF-DIRECT-SUBPROOFS");
        declareMacro(me, "do_proof_all_subproofs", "DO-PROOF-ALL-SUBPROOFS");
        declareMacro(me, "do_proof_dependent_proofs", "DO-PROOF-DEPENDENT-PROOFS");
        declareFunction(myName, "new_proof", "NEW-PROOF", 2, 0, false);
        declareFunction(myName, "new_proof_with_bindings", "NEW-PROOF-WITH-BINDINGS", 3, 0, false);
        declareFunction(myName, "register_proof", "REGISTER-PROOF", 1, 0, false);
        declareFunction(myName, "add_dependent_proof_references", "ADD-DEPENDENT-PROOF-REFERENCES", 1, 0, false);
        declareFunction(myName, "destroy_proof", "DESTROY-PROOF", 1, 0, false);
        declareFunction(myName, "destroy_dependent_proofs", "DESTROY-DEPENDENT-PROOFS", 1, 0, false);
        declareFunction(myName, "destroy_problem_store_proof", "DESTROY-PROBLEM-STORE-PROOF", 1, 0, false);
        declareFunction(myName, "destroy_proof_int", "DESTROY-PROOF-INT", 1, 0, false);
        declareFunction(myName, "note_proof_invalid", "NOTE-PROOF-INVALID", 1, 0, false);
        declareFunction(myName, "proof_suid", "PROOF-SUID", 1, 0, false);
        declareFunction(myName, "proof_bindings", "PROOF-BINDINGS", 1, 0, false);
        declareFunction(myName, "proof_link", "PROOF-LINK", 1, 0, false);
        declareFunction(myName, "proof_direct_subproofs", "PROOF-DIRECT-SUBPROOFS", 1, 0, false);
        declareFunction(myName, "proof_dependents", "PROOF-DEPENDENTS", 1, 0, false);
        declareFunction(myName, "set_proof_bindings", "SET-PROOF-BINDINGS", 2, 0, false);
        declareFunction(myName, "add_proof_dependent", "ADD-PROOF-DEPENDENT", 2, 0, false);
        declareFunction(myName, "remove_proof_dependent", "REMOVE-PROOF-DEPENDENT", 2, 0, false);
        declareFunction(myName, "note_proof_processed", "NOTE-PROOF-PROCESSED", 1, 0, false);
        declareFunction(myName, "note_proof_unprocessed", "NOTE-PROOF-UNPROCESSED", 1, 0, false);
        declareFunction(myName, "proof_store", "PROOF-STORE", 1, 0, false);
        declareFunction(myName, "proof_supported_problem", "PROOF-SUPPORTED-PROBLEM", 1, 0, false);
        declareFunction(myName, "proof_supported_problem_query", "PROOF-SUPPORTED-PROBLEM-QUERY", 1, 0, false);
        declareFunction(myName, "proof_supported_problem_free_hl_vars", "PROOF-SUPPORTED-PROBLEM-FREE-HL-VARS", 1, 0, false);
        declareFunction(myName, "proof_has_supportsP", "PROOF-HAS-SUPPORTS?", 1, 0, false);
        declareFunction(myName, "proof_supports", "PROOF-SUPPORTS", 1, 0, false);
        declareFunction(myName, "proof_direct_supports", "PROOF-DIRECT-SUPPORTS", 1, 0, false);
        declareFunction(myName, "proof_spec_direct_supports", "PROOF-SPEC-DIRECT-SUPPORTS", 2, 0, false);
        declareFunction(myName, "proof_direct_supports_recursive", "PROOF-DIRECT-SUPPORTS-RECURSIVE", 1, 0, false);
        declareFunction(myName, "proof_spec_direct_supports_recursive", "PROOF-SPEC-DIRECT-SUPPORTS-RECURSIVE", 2, 0, false);
        declareFunction(myName, "all_proof_supports", "ALL-PROOF-SUPPORTS", 1, 0, false);
        declareFunction(myName, "all_proof_supports_recursive", "ALL-PROOF-SUPPORTS-RECURSIVE", 2, 0, false);
        declareFunction(myName, "all_proof_supports_of_proofs", "ALL-PROOF-SUPPORTS-OF-PROOFS", 1, 0, false);
        declareFunction(myName, "proof_has_subproofsP", "PROOF-HAS-SUBPROOFS?", 1, 0, false);
        declareFunction(myName, "proof_sole_subproof", "PROOF-SOLE-SUBPROOF", 1, 0, false);
        declareFunction(myName, "proof_first_subproof", "PROOF-FIRST-SUBPROOF", 1, 0, false);
        declareFunction(myName, "all_proof_subproofs", "ALL-PROOF-SUBPROOFS", 1, 0, false);
        declareFunction(myName, "all_proof_subproofs_recursive", "ALL-PROOF-SUBPROOFS-RECURSIVE", 2, 0, false);
        declareFunction(myName, "all_proof_subproblems", "ALL-PROOF-SUBPROBLEMS", 1, 0, false);
        declareFunction(myName, "proof_has_dependent_proofsP", "PROOF-HAS-DEPENDENT-PROOFS?", 1, 0, false);
        declareFunction(myName, "proof_dependent_proofs", "PROOF-DEPENDENT-PROOFS", 1, 1, false);
        declareFunction(myName, "proof_status", "PROOF-STATUS", 1, 0, false);
        declareFunction(myName, "proof_rejectedP", "PROOF-REJECTED?", 1, 0, false);
        declareFunction(myName, "proof_reject_reason", "PROOF-REJECT-REASON", 1, 0, false);
        declareFunction(myName, "proof_provenP", "PROOF-PROVEN?", 1, 0, false);
        new $proof_provenP$UnaryFunction();
        declareFunction(myName, "proof_processedP", "PROOF-PROCESSED?", 1, 0, false);
        declareFunction(myName, "proof_destructibility_status", "PROOF-DESTRUCTIBILITY-STATUS", 1, 0, false);
        declareFunction(myName, "proof_indestructibleP", "PROOF-INDESTRUCTIBLE?", 1, 0, false);
        declareFunction(myName, "proof_destructibleP", "PROOF-DESTRUCTIBLE?", 1, 0, false);
        declareFunction(myName, "proof_note_rejected", "PROOF-NOTE-REJECTED", 2, 0, false);
        declareFunction(myName, "proof_rejected_due_to_ill_formednessP", "PROOF-REJECTED-DUE-TO-ILL-FORMEDNESS?", 1, 0, false);
        declareFunction(myName, "proof_type", "PROOF-TYPE", 1, 0, false);
        declareFunction(myName, "proof_equalP", "PROOF-EQUAL?", 2, 0, false);
        declareFunction(myName, "proof_matches_specificationP", "PROOF-MATCHES-SPECIFICATION?", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_proof_file() {
        $dtp_proof$ = defconstant("*DTP-PROOF*", $sym0$PROOF);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_proof_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_proof$.getGlobalValue(), Symbols.symbol_function($sym8$PROOF_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        Structures.def_csetf($sym10$PRF_SUID, $sym11$_CSETF_PRF_SUID);
        Structures.def_csetf($sym12$PRF_BINDINGS, $sym13$_CSETF_PRF_BINDINGS);
        Structures.def_csetf($sym14$PRF_LINK, $sym15$_CSETF_PRF_LINK);
        Structures.def_csetf($sym16$PRF_SUBPROOFS, $sym17$_CSETF_PRF_SUBPROOFS);
        Structures.def_csetf($sym18$PRF_DEPENDENTS, $sym19$_CSETF_PRF_DEPENDENTS);
        Structures.def_csetf($sym20$PRF_PROCESSED_, $sym21$_CSETF_PRF_PROCESSED_);
        Equality.identity($sym0$PROOF);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_proof$.getGlobalValue(), Symbols.symbol_function($sym33$VISIT_DEFSTRUCT_OBJECT_PROOF_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_proof$.getGlobalValue(), Symbols.symbol_function($sym38$SXHASH_PROOF_METHOD));
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

    static {
        me = new inference_datastructures_proof();
        $dtp_proof$ = null;
        $sym0$PROOF = makeSymbol("PROOF");
        $sym1$PROOF_P = makeSymbol("PROOF-P");
        $int$211 = makeInteger(211);
        $list3 = list(makeSymbol("SUID"), makeSymbol("BINDINGS"), makeSymbol("LINK"), makeSymbol("SUBPROOFS"), makeSymbol("DEPENDENTS"), makeSymbol("PROCESSED?"));
        $list4 = list(makeKeyword("SUID"), makeKeyword("BINDINGS"), makeKeyword("LINK"), makeKeyword("SUBPROOFS"), makeKeyword("DEPENDENTS"), makeKeyword("PROCESSED?"));
        $list5 = list(makeSymbol("PRF-SUID"), makeSymbol("PRF-BINDINGS"), makeSymbol("PRF-LINK"), makeSymbol("PRF-SUBPROOFS"), makeSymbol("PRF-DEPENDENTS"), makeSymbol("PRF-PROCESSED?"));
        $list6 = list(makeSymbol("_CSETF-PRF-SUID"), makeSymbol("_CSETF-PRF-BINDINGS"), makeSymbol("_CSETF-PRF-LINK"), makeSymbol("_CSETF-PRF-SUBPROOFS"), makeSymbol("_CSETF-PRF-DEPENDENTS"), makeSymbol("_CSETF-PRF-PROCESSED?"));
        $sym7$PRINT_PROOF = makeSymbol("PRINT-PROOF");
        $sym8$PROOF_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROOF-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROOF-P"));
        $sym10$PRF_SUID = makeSymbol("PRF-SUID");
        $sym11$_CSETF_PRF_SUID = makeSymbol("_CSETF-PRF-SUID");
        $sym12$PRF_BINDINGS = makeSymbol("PRF-BINDINGS");
        $sym13$_CSETF_PRF_BINDINGS = makeSymbol("_CSETF-PRF-BINDINGS");
        $sym14$PRF_LINK = makeSymbol("PRF-LINK");
        $sym15$_CSETF_PRF_LINK = makeSymbol("_CSETF-PRF-LINK");
        $sym16$PRF_SUBPROOFS = makeSymbol("PRF-SUBPROOFS");
        $sym17$_CSETF_PRF_SUBPROOFS = makeSymbol("_CSETF-PRF-SUBPROOFS");
        $sym18$PRF_DEPENDENTS = makeSymbol("PRF-DEPENDENTS");
        $sym19$_CSETF_PRF_DEPENDENTS = makeSymbol("_CSETF-PRF-DEPENDENTS");
        $sym20$PRF_PROCESSED_ = makeSymbol("PRF-PROCESSED?");
        $sym21$_CSETF_PRF_PROCESSED_ = makeSymbol("_CSETF-PRF-PROCESSED?");
        $SUID = makeKeyword("SUID");
        $BINDINGS = makeKeyword("BINDINGS");
        $LINK = makeKeyword("LINK");
        $SUBPROOFS = makeKeyword("SUBPROOFS");
        $DEPENDENTS = makeKeyword("DEPENDENTS");
        $PROCESSED_ = makeKeyword("PROCESSED?");
        $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym30$MAKE_PROOF = makeSymbol("MAKE-PROOF");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_PROOF_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROOF-METHOD");
        $FREE = makeKeyword("FREE");
        $str35$_Invalid_PROOF__s_ = makeString("<Invalid PROOF ~s>");
        $sym36$PROOF_SUID = makeSymbol("PROOF-SUID");
        $str37$_PROOF__a__a_for_link__a__a_suppo = makeString("<PROOF ~a.~a for link ~a.~a supported by ~a, supporting ~a>");
        $sym38$SXHASH_PROOF_METHOD = makeSymbol("SXHASH-PROOF-METHOD");
        $list39 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("PROOF")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym40$DO_LIST = makeSymbol("DO-LIST");
        $sym41$PROOF_DIRECT_SUBPROOFS = makeSymbol("PROOF-DIRECT-SUBPROOFS");
        $list42 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("PROOF"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list43 = list(makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $sym46$ALL_PROOF_SUBPROOFS = makeSymbol("ALL-PROOF-SUBPROOFS");
        $list47 = list(list(makeSymbol("DEPENDENT-PROOF-VAR"), makeSymbol("PROOF"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list48 = list(makeKeyword("PROOF-STATUS"), makeKeyword("DONE"));
        $PROOF_STATUS = makeKeyword("PROOF-STATUS");
        $sym50$CSOME = makeSymbol("CSOME");
        $sym51$PROOF_DEPENDENTS = makeSymbol("PROOF-DEPENDENTS");
        $sym52$PWHEN = makeSymbol("PWHEN");
        $sym53$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");
        $sym54$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
        $sym55$LIST_OF_PROOF_P = makeSymbol("LIST-OF-PROOF-P");
        $sym56$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
        $str57$Expected_link__a_to_have_exactly_ = makeString("Expected link ~a to have exactly one subproof");
        $str58$Unexpected_link_type_for_proof___ = makeString("Unexpected link type for proof: ~a");
        $sym59$SUPPORT_EQUAL = makeSymbol("SUPPORT-EQUAL");
        $str60$Expected__s_to_have_at_most_one_s = makeString("Expected ~s to have at most one subproof, but it had more");
        $sym61$PROOF_SUPPORTED_PROBLEM = makeSymbol("PROOF-SUPPORTED-PROBLEM");
        $sym62$_ = makeSymbol("<");
        $sym63$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
        $REJECTED = makeKeyword("REJECTED");
        $PROVEN = makeKeyword("PROVEN");
        $sym66$PROOF_REJECT_REASON_P = makeSymbol("PROOF-REJECT-REASON-P");
        $ILL_FORMED = makeKeyword("ILL-FORMED");
        $sym68$PROBLEM_P = makeSymbol("PROBLEM-P");
    }

    public static class $proof_native extends SubLStructNative {
        public SubLObject $suid;
        public SubLObject $bindings;
        public SubLObject $link;
        public SubLObject $subproofs;
        public SubLObject $dependents;
        public SubLObject $processedP;
        private static SubLStructDeclNative structDecl;

        public $proof_native() {
            this.$suid = CommonSymbols.NIL;
            this.$bindings = CommonSymbols.NIL;
            this.$link = CommonSymbols.NIL;
            this.$subproofs = CommonSymbols.NIL;
            this.$dependents = CommonSymbols.NIL;
            this.$processedP = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $proof_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$link = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$subproofs = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$dependents = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$processedP = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($proof_native.class, $sym0$PROOF, $sym1$PROOF_P, $list3, $list4, new String[] { "$suid", "$bindings", "$link", "$subproofs", "$dependents", "$processedP" }, $list5, $list6, $sym7$PRINT_PROOF);
        }
    }

    public static class $proof_p$UnaryFunction extends UnaryFunction {
        public $proof_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROOF-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return proof_p(arg1);
        }
    }

    public static class $sxhash_proof_method$UnaryFunction extends UnaryFunction {
        public $sxhash_proof_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-PROOF-METHOD"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return sxhash_proof_method(arg1);
        }
    }

    public static class $proof_provenP$UnaryFunction extends UnaryFunction {
        public $proof_provenP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROOF-PROVEN?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return proof_provenP(arg1);
        }
    }
}
/*
 *
 * Total time: 259 ms
 *
 */