package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_proof extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof";
    public static final String myFingerPrint = "cb408b096c1aadf6fc9993296988d344f45c77946a068d69a5fbf0c8607f306a";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLSymbol $dtp_proof$;
    private static final SubLSymbol $sym0$PROOF;
    private static final SubLSymbol $sym1$PROOF_P;
    private static final SubLInteger $int2$211;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_PROOF;
    private static final SubLSymbol $sym8$PROOF_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$PRF_SUID;
    private static final SubLSymbol $sym11$_CSETF_PRF_SUID;
    private static final SubLSymbol $sym12$PRF_BINDINGS;
    private static final SubLSymbol $sym13$_CSETF_PRF_BINDINGS;
    private static final SubLSymbol $sym14$PRF_LINK;
    private static final SubLSymbol $sym15$_CSETF_PRF_LINK;
    private static final SubLSymbol $sym16$PRF_SUBPROOFS;
    private static final SubLSymbol $sym17$_CSETF_PRF_SUBPROOFS;
    private static final SubLSymbol $sym18$PRF_DEPENDENTS;
    private static final SubLSymbol $sym19$_CSETF_PRF_DEPENDENTS;
    private static final SubLSymbol $sym20$PRF_PROCESSED_;
    private static final SubLSymbol $sym21$_CSETF_PRF_PROCESSED_;
    private static final SubLSymbol $kw22$SUID;
    private static final SubLSymbol $kw23$BINDINGS;
    private static final SubLSymbol $kw24$LINK;
    private static final SubLSymbol $kw25$SUBPROOFS;
    private static final SubLSymbol $kw26$DEPENDENTS;
    private static final SubLSymbol $kw27$PROCESSED_;
    private static final SubLString $str28$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw29$BEGIN;
    private static final SubLSymbol $sym30$MAKE_PROOF;
    private static final SubLSymbol $kw31$SLOT;
    private static final SubLSymbol $kw32$END;
    private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_PROOF_METHOD;
    private static final SubLSymbol $kw34$FREE;
    private static final SubLString $str35$_Invalid_PROOF__s_;
    private static final SubLSymbol $sym36$PROOF_SUID;
    private static final SubLString $str37$_PROOF__a__a_for_link__a__a_suppo;
    private static final SubLSymbol $sym38$SXHASH_PROOF_METHOD;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$DO_LIST;
    private static final SubLSymbol $sym41$PROOF_DIRECT_SUBPROOFS;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $kw44$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw45$DONE;
    private static final SubLSymbol $sym46$ALL_PROOF_SUBPROOFS;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $kw49$PROOF_STATUS;
    private static final SubLSymbol $sym50$CSOME;
    private static final SubLSymbol $sym51$PROOF_DEPENDENTS;
    private static final SubLSymbol $sym52$PWHEN;
    private static final SubLSymbol $sym53$PROOF_HAS_STATUS_;
    private static final SubLSymbol $sym54$PROBLEM_LINK_P;
    private static final SubLSymbol $sym55$LIST_OF_PROOF_P;
    private static final SubLSymbol $sym56$BINDING_LIST_P;
    private static final SubLString $str57$Expected_link__a_to_have_exactly_;
    private static final SubLString $str58$Unexpected_link_type_for_proof___;
    private static final SubLSymbol $sym59$SUPPORT_EQUAL;
    private static final SubLString $str60$Expected__s_to_have_at_most_one_s;
    private static final SubLSymbol $sym61$PROOF_SUPPORTED_PROBLEM;
    private static final SubLSymbol $sym62$_;
    private static final SubLSymbol $sym63$PROBLEM_SUID;
    private static final SubLSymbol $kw64$REJECTED;
    private static final SubLSymbol $kw65$PROVEN;
    private static final SubLSymbol $sym66$PROOF_REJECT_REASON_P;
    private static final SubLSymbol $kw67$ILL_FORMED;
    private static final SubLSymbol $sym68$PROBLEM_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject proof_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_proof(v_object, stream, (SubLObject)inference_datastructures_proof.ZERO_INTEGER);
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject proof_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $proof_native.class) ? inference_datastructures_proof.T : inference_datastructures_proof.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject prf_suid(final SubLObject v_object) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject prf_bindings(final SubLObject v_object) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject prf_link(final SubLObject v_object) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject prf_subproofs(final SubLObject v_object) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject prf_dependents(final SubLObject v_object) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject prf_processedP(final SubLObject v_object) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject _csetf_prf_suid(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject _csetf_prf_bindings(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject _csetf_prf_link(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject _csetf_prf_subproofs(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject _csetf_prf_dependents(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject _csetf_prf_processedP(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_proof.NIL != proof_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject make_proof(SubLObject arglist) {
        if (arglist == inference_datastructures_proof.UNPROVIDED) {
            arglist = (SubLObject)inference_datastructures_proof.NIL;
        }
        final SubLObject v_new = (SubLObject)new $proof_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_datastructures_proof.NIL, next = arglist; inference_datastructures_proof.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_datastructures_proof.$kw22$SUID)) {
                _csetf_prf_suid(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_proof.$kw23$BINDINGS)) {
                _csetf_prf_bindings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_proof.$kw24$LINK)) {
                _csetf_prf_link(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_proof.$kw25$SUBPROOFS)) {
                _csetf_prf_subproofs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_proof.$kw26$DEPENDENTS)) {
                _csetf_prf_dependents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_proof.$kw27$PROCESSED_)) {
                _csetf_prf_processedP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_datastructures_proof.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject visit_defstruct_proof(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_proof.$kw29$BEGIN, (SubLObject)inference_datastructures_proof.$sym30$MAKE_PROOF, (SubLObject)inference_datastructures_proof.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_proof.$kw31$SLOT, (SubLObject)inference_datastructures_proof.$kw22$SUID, prf_suid(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_proof.$kw31$SLOT, (SubLObject)inference_datastructures_proof.$kw23$BINDINGS, prf_bindings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_proof.$kw31$SLOT, (SubLObject)inference_datastructures_proof.$kw24$LINK, prf_link(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_proof.$kw31$SLOT, (SubLObject)inference_datastructures_proof.$kw25$SUBPROOFS, prf_subproofs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_proof.$kw31$SLOT, (SubLObject)inference_datastructures_proof.$kw26$DEPENDENTS, prf_dependents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_proof.$kw31$SLOT, (SubLObject)inference_datastructures_proof.$kw27$PROCESSED_, prf_processedP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_proof.$kw32$END, (SubLObject)inference_datastructures_proof.$sym30$MAKE_PROOF, (SubLObject)inference_datastructures_proof.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1055L)
    public static SubLObject visit_defstruct_object_proof_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_proof(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 2010L)
    public static SubLObject valid_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_proof.NIL != proof_p(v_object) && inference_datastructures_proof.NIL == proof_invalid_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 2123L)
    public static SubLObject proof_invalid_p(final SubLObject proof) {
        return Equality.eq((SubLObject)inference_datastructures_proof.$kw34$FREE, proof_bindings(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 2239L)
    public static SubLObject print_proof(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (inference_datastructures_proof.NIL != proof_invalid_p(v_object)) {
            PrintLow.format(stream, (SubLObject)inference_datastructures_proof.$str35$_Invalid_PROOF__s_, prf_suid(v_object));
        }
        else {
            final SubLObject proof_suid = proof_suid(v_object);
            final SubLObject store_suid = inference_datastructures_problem_store.problem_store_suid(proof_store(v_object));
            final SubLObject link_suid = inference_datastructures_problem_link.problem_link_suid(proof_link(v_object));
            final SubLObject subproofs = proof_direct_subproofs(v_object);
            final SubLObject subproof_suids = Mapping.mapcar((SubLObject)inference_datastructures_proof.$sym36$PROOF_SUID, subproofs);
            final SubLObject dependents = proof_dependent_proofs(v_object, (SubLObject)inference_datastructures_proof.UNPROVIDED);
            final SubLObject dependent_suids = Mapping.mapcar((SubLObject)inference_datastructures_proof.$sym36$PROOF_SUID, dependents);
            PrintLow.format(stream, (SubLObject)inference_datastructures_proof.$str37$_PROOF__a__a_for_link__a__a_suppo, new SubLObject[] { store_suid, proof_suid, store_suid, link_suid, subproof_suids, dependent_suids });
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3009L)
    public static SubLObject sxhash_proof_method(final SubLObject v_object) {
        return prf_suid(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3076L)
    public static SubLObject list_of_proof_p(final SubLObject v_object) {
        if (inference_datastructures_proof.NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = (SubLObject)inference_datastructures_proof.NIL;
            subobject = cdolist_list_var.first();
            while (inference_datastructures_proof.NIL != cdolist_list_var) {
                if (inference_datastructures_proof.NIL == proof_p(subobject)) {
                    return (SubLObject)inference_datastructures_proof.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            }
            return (SubLObject)inference_datastructures_proof.T;
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3266L)
    public static SubLObject non_empty_list_of_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && inference_datastructures_proof.NIL != list_of_proof_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3379L)
    public static SubLObject do_proof_direct_subproofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_proof.$list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subproof_var = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject proof = (SubLObject)inference_datastructures_proof.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_proof.$list39);
        subproof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_proof.$list39);
        proof = current.first();
        current = current.rest();
        if (inference_datastructures_proof.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_proof.$sym40$DO_LIST, (SubLObject)ConsesLow.list(subproof_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_proof.$sym41$PROOF_DIRECT_SUBPROOFS, proof)), ConsesLow.append(body, (SubLObject)inference_datastructures_proof.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_proof.$list39);
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3552L)
    public static SubLObject do_proof_all_subproofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_proof.$list42);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subproof_var = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject proof = (SubLObject)inference_datastructures_proof.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_proof.$list42);
        subproof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_proof.$list42);
        proof = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject current_$1 = (SubLObject)inference_datastructures_proof.NIL;
        while (inference_datastructures_proof.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_proof.$list42);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_proof.$list42);
            if (inference_datastructures_proof.NIL == conses_high.member(current_$1, (SubLObject)inference_datastructures_proof.$list43, (SubLObject)inference_datastructures_proof.UNPROVIDED, (SubLObject)inference_datastructures_proof.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_proof.T;
            }
            if (current_$1 == inference_datastructures_proof.$kw44$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_proof.NIL != bad && inference_datastructures_proof.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_proof.$list42);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_proof.$kw45$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_proof.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_proof.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_proof.$sym40$DO_LIST, (SubLObject)ConsesLow.list(subproof_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_proof.$sym46$ALL_PROOF_SUBPROOFS, proof), (SubLObject)inference_datastructures_proof.$kw45$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_proof.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 3769L)
    public static SubLObject do_proof_dependent_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_proof.$list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dependent_proof_var = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject proof = (SubLObject)inference_datastructures_proof.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_proof.$list47);
        dependent_proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_proof.$list47);
        proof = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject current_$2 = (SubLObject)inference_datastructures_proof.NIL;
        while (inference_datastructures_proof.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_proof.$list47);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_proof.$list47);
            if (inference_datastructures_proof.NIL == conses_high.member(current_$2, (SubLObject)inference_datastructures_proof.$list48, (SubLObject)inference_datastructures_proof.UNPROVIDED, (SubLObject)inference_datastructures_proof.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_proof.T;
            }
            if (current_$2 == inference_datastructures_proof.$kw44$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_proof.NIL != bad && inference_datastructures_proof.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_proof.$list47);
        }
        final SubLObject proof_status_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_proof.$kw49$PROOF_STATUS, current);
        final SubLObject proof_status = (SubLObject)((inference_datastructures_proof.NIL != proof_status_tail) ? conses_high.cadr(proof_status_tail) : inference_datastructures_proof.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_proof.$kw45$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_proof.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_proof.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_proof.$sym50$CSOME, (SubLObject)ConsesLow.list(dependent_proof_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_proof.$sym51$PROOF_DEPENDENTS, proof), done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_proof.$sym52$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_proof.$sym53$PROOF_HAS_STATUS_, dependent_proof_var, proof_status), ConsesLow.append(body, (SubLObject)inference_datastructures_proof.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 4246L)
    public static SubLObject new_proof(final SubLObject link, final SubLObject subproofs) {
        assert inference_datastructures_proof.NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        assert inference_datastructures_proof.NIL != list_of_proof_p(subproofs) : subproofs;
        final SubLObject proof = make_proof((SubLObject)inference_datastructures_proof.UNPROVIDED);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        final SubLObject suid = inference_datastructures_problem_store.problem_store_new_proof_id(store);
        inference_metrics.increment_proof_historical_count();
        _csetf_prf_suid(proof, suid);
        _csetf_prf_link(proof, link);
        _csetf_prf_subproofs(proof, subproofs);
        _csetf_prf_processedP(proof, (SubLObject)inference_datastructures_proof.NIL);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 4747L)
    public static SubLObject new_proof_with_bindings(final SubLObject link, final SubLObject v_bindings, final SubLObject subproofs) {
        final SubLObject proof = new_proof(link, subproofs);
        set_proof_bindings(proof, v_bindings);
        register_proof(proof);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 4970L)
    public static SubLObject register_proof(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        inference_datastructures_problem.add_problem_proof(supported_problem, proof);
        inference_datastructures_problem_store.add_problem_store_proof(store, proof);
        inference_datastructures_problem_link.add_problem_link_proof(link, proof);
        add_dependent_proof_references(proof);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 5388L)
    public static SubLObject add_dependent_proof_references(final SubLObject proof) {
        SubLObject cdolist_list_var = proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)inference_datastructures_proof.NIL;
        subproof = cdolist_list_var.first();
        while (inference_datastructures_proof.NIL != cdolist_list_var) {
            add_proof_dependent(subproof, proof);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 5545L)
    public static SubLObject destroy_proof(final SubLObject proof) {
        if (inference_datastructures_proof.NIL != valid_proof_p(proof)) {
            final SubLObject link = proof_link(proof);
            final SubLObject v_bindings = proof_bindings(proof);
            final SubLObject store = proof_store(proof);
            destroy_dependent_proofs(proof);
            if (inference_datastructures_proof.NIL != valid_proof_p(proof)) {
                note_proof_invalid(proof);
                inference_datastructures_inference.destroy_proof_inference_answer_justifications(proof);
                SubLObject cdolist_list_var = proof_direct_subproofs(proof);
                SubLObject subproof = (SubLObject)inference_datastructures_proof.NIL;
                subproof = cdolist_list_var.first();
                while (inference_datastructures_proof.NIL != cdolist_list_var) {
                    remove_proof_dependent(subproof, proof);
                    cdolist_list_var = cdolist_list_var.rest();
                    subproof = cdolist_list_var.first();
                }
                final SubLObject problem = proof_supported_problem(proof);
                if (inference_datastructures_proof.NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                    inference_worker.note_problem_dirty(problem);
                    inference_datastructures_problem.note_problem_potentially_processed(problem);
                    inference_datastructures_problem.remove_problem_proof_with_bindings(problem, proof, v_bindings);
                }
                if (inference_datastructures_proof.NIL != proof_rejectedP(proof)) {
                    inference_datastructures_problem_store.problem_store_forget_that_proof_is_rejected(store, proof);
                }
                if (inference_datastructures_proof.NIL != proof_processedP(proof)) {
                    inference_datastructures_problem_store.problem_store_note_proof_unprocessed(store, proof);
                }
                inference_datastructures_problem_link.remove_problem_link_proof(link, proof);
                inference_datastructures_problem_store.remove_problem_store_proof(store, proof);
            }
            return destroy_proof_int(proof);
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 6637L)
    public static SubLObject destroy_dependent_proofs(final SubLObject proof) {
        final SubLObject problem = proof_supported_problem(proof);
        if (inference_datastructures_proof.NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            SubLObject cdolist_list_var;
            final SubLObject dependent_proofs = cdolist_list_var = proof_dependent_proofs(proof, (SubLObject)inference_datastructures_proof.UNPROVIDED);
            SubLObject dependent_proof = (SubLObject)inference_datastructures_proof.NIL;
            dependent_proof = cdolist_list_var.first();
            while (inference_datastructures_proof.NIL != cdolist_list_var) {
                destroy_proof(dependent_proof);
                cdolist_list_var = cdolist_list_var.rest();
                dependent_proof = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7080L)
    public static SubLObject destroy_problem_store_proof(final SubLObject proof) {
        if (inference_datastructures_proof.NIL != valid_proof_p(proof)) {
            note_proof_invalid(proof);
            return destroy_proof_int(proof);
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7235L)
    public static SubLObject destroy_proof_int(final SubLObject proof) {
        _csetf_prf_processedP(proof, (SubLObject)inference_datastructures_proof.$kw34$FREE);
        _csetf_prf_subproofs(proof, (SubLObject)inference_datastructures_proof.$kw34$FREE);
        _csetf_prf_dependents(proof, (SubLObject)inference_datastructures_proof.$kw34$FREE);
        _csetf_prf_link(proof, (SubLObject)inference_datastructures_proof.$kw34$FREE);
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7482L)
    public static SubLObject note_proof_invalid(final SubLObject proof) {
        _csetf_prf_bindings(proof, (SubLObject)inference_datastructures_proof.$kw34$FREE);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7578L)
    public static SubLObject proof_suid(final SubLObject proof) {
        assert inference_datastructures_proof.NIL != proof_p(proof) : proof;
        return prf_suid(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 7683L)
    public static SubLObject proof_bindings(final SubLObject proof) {
        assert inference_datastructures_proof.NIL != proof_p(proof) : proof;
        return prf_bindings(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8088L)
    public static SubLObject proof_link(final SubLObject proof) {
        assert inference_datastructures_proof.NIL != proof_p(proof) : proof;
        return prf_link(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8181L)
    public static SubLObject proof_direct_subproofs(final SubLObject proof) {
        assert inference_datastructures_proof.NIL != proof_p(proof) : proof;
        return prf_subproofs(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8291L)
    public static SubLObject proof_dependents(final SubLObject proof) {
        assert inference_datastructures_proof.NIL != proof_p(proof) : proof;
        return prf_dependents(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8396L)
    public static SubLObject set_proof_bindings(final SubLObject proof, final SubLObject v_bindings) {
        assert inference_datastructures_proof.NIL != proof_p(proof) : proof;
        assert inference_datastructures_proof.NIL != bindings.binding_list_p(v_bindings) : v_bindings;
        _csetf_prf_bindings(proof, v_bindings);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8584L)
    public static SubLObject add_proof_dependent(final SubLObject proof, final SubLObject dependent) {
        SubLObject dependents = prf_dependents(proof);
        if (inference_datastructures_proof.NIL == conses_high.member(dependent, dependents, Symbols.symbol_function((SubLObject)inference_datastructures_proof.EQ), Symbols.symbol_function((SubLObject)inference_datastructures_proof.IDENTITY))) {
            dependents = (SubLObject)ConsesLow.cons(dependent, dependents);
        }
        _csetf_prf_dependents(proof, dependents);
        return dependents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8795L)
    public static SubLObject remove_proof_dependent(final SubLObject proof, final SubLObject old_dependent) {
        if (inference_datastructures_proof.NIL != valid_proof_p(proof)) {
            SubLObject dependents = prf_dependents(proof);
            dependents = Sequences.delete(old_dependent, dependents, Symbols.symbol_function((SubLObject)inference_datastructures_proof.EQ), (SubLObject)inference_datastructures_proof.UNPROVIDED, (SubLObject)inference_datastructures_proof.UNPROVIDED, (SubLObject)inference_datastructures_proof.UNPROVIDED, (SubLObject)inference_datastructures_proof.UNPROVIDED);
            _csetf_prf_dependents(proof, dependents);
            return dependents;
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9357L)
    public static SubLObject note_proof_processed(final SubLObject proof) {
        _csetf_prf_processedP(proof, (SubLObject)inference_datastructures_proof.T);
        inference_datastructures_problem_store.problem_store_note_proof_processed(proof_store(proof), proof);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9520L)
    public static SubLObject note_proof_unprocessed(final SubLObject proof) {
        _csetf_prf_processedP(proof, (SubLObject)inference_datastructures_proof.NIL);
        inference_datastructures_problem_store.problem_store_note_proof_unprocessed(proof_store(proof), proof);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9689L)
    public static SubLObject proof_store(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        return store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9833L)
    public static SubLObject proof_supported_problem(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        return inference_datastructures_problem_link.problem_link_supported_problem(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9971L)
    public static SubLObject proof_supported_problem_query(final SubLObject proof) {
        final SubLObject supported_problem = proof_supported_problem(proof);
        final SubLObject problem_query = inference_datastructures_problem.problem_query(supported_problem);
        return problem_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10172L)
    public static SubLObject proof_supported_problem_free_hl_vars(final SubLObject proof) {
        final SubLObject supported_problem = proof_supported_problem(proof);
        final SubLObject problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        return problem_free_hl_vars;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10400L)
    public static SubLObject proof_has_supportsP(final SubLObject proof) {
        return inference_worker.content_link_p(proof_link(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10514L)
    public static SubLObject proof_supports(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        if (inference_datastructures_proof.NIL != inference_worker.content_link_p(link)) {
            final SubLObject supports = inference_worker.content_link_supports(link);
            return supports;
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10713L)
    public static SubLObject proof_direct_supports(final SubLObject proof) {
        return proof_direct_supports_recursive(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10811L)
    public static SubLObject proof_spec_direct_supports(final SubLObject link, final SubLObject subproofs) {
        return proof_spec_direct_supports_recursive(link, subproofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10937L)
    public static SubLObject proof_direct_supports_recursive(final SubLObject proof) {
        final SubLObject link = proof_link(proof);
        final SubLObject subproofs = proof_direct_subproofs(proof);
        return proof_spec_direct_supports_recursive(link, subproofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 11155L)
    public static SubLObject proof_spec_direct_supports_recursive(final SubLObject link, final SubLObject subproofs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_datastructures_proof.NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem_link.problem_link_store(link)) && inference_datastructures_proof.NIL != inference_worker_transformation.transformation_link_p(link)) {
            if (inference_datastructures_proof.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_datastructures_proof.NIL == list_utilities.singletonP(subproofs)) {
                Errors.error((SubLObject)inference_datastructures_proof.$str57$Expected_link__a_to_have_exactly_, link);
            }
            final SubLObject subproof = subproofs.first();
            return ConsesLow.append(inference_worker.content_link_supports(link), proof_direct_supports_recursive(subproof));
        }
        if (inference_datastructures_proof.NIL != inference_worker.content_link_p(link)) {
            return inference_worker.content_link_supports(link);
        }
        if (inference_datastructures_proof.NIL != inference_worker_restriction.restriction_link_p(link) || inference_datastructures_proof.NIL != inference_worker_union.union_link_p(link)) {
            if (inference_datastructures_proof.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_datastructures_proof.NIL == list_utilities.singletonP(subproofs)) {
                Errors.error((SubLObject)inference_datastructures_proof.$str57$Expected_link__a_to_have_exactly_, link);
            }
            final SubLObject subproof = subproofs.first();
            return proof_direct_supports_recursive(subproof);
        }
        if (inference_datastructures_proof.NIL != inference_worker.conjunctive_link_p(link)) {
            SubLObject direct_supports = (SubLObject)inference_datastructures_proof.NIL;
            SubLObject cdolist_list_var = subproofs;
            SubLObject subproof2 = (SubLObject)inference_datastructures_proof.NIL;
            subproof2 = cdolist_list_var.first();
            while (inference_datastructures_proof.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = proof_direct_supports_recursive(subproof2);
                SubLObject direct_support = (SubLObject)inference_datastructures_proof.NIL;
                direct_support = cdolist_list_var_$3.first();
                while (inference_datastructures_proof.NIL != cdolist_list_var_$3) {
                    direct_supports = (SubLObject)ConsesLow.cons(direct_support, direct_supports);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    direct_support = cdolist_list_var_$3.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof2 = cdolist_list_var.first();
            }
            return Sequences.nreverse(direct_supports);
        }
        Errors.error((SubLObject)inference_datastructures_proof.$str58$Unexpected_link_type_for_proof___, link);
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 12405L)
    public static SubLObject all_proof_supports(final SubLObject proof) {
        return Sequences.nreverse(all_proof_supports_recursive(proof, (SubLObject)inference_datastructures_proof.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 12546L)
    public static SubLObject all_proof_supports_recursive(final SubLObject proof, SubLObject supports) {
        SubLObject cdolist_list_var;
        final SubLObject new_supports = cdolist_list_var = proof_supports(proof);
        SubLObject new_support = (SubLObject)inference_datastructures_proof.NIL;
        new_support = cdolist_list_var.first();
        while (inference_datastructures_proof.NIL != cdolist_list_var) {
            final SubLObject item_var = new_support;
            if (inference_datastructures_proof.NIL == conses_high.member(item_var, supports, (SubLObject)inference_datastructures_proof.$sym59$SUPPORT_EQUAL, Symbols.symbol_function((SubLObject)inference_datastructures_proof.IDENTITY))) {
                supports = (SubLObject)ConsesLow.cons(item_var, supports);
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_support = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2 = proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)inference_datastructures_proof.NIL;
        subproof = cdolist_list_var2.first();
        while (inference_datastructures_proof.NIL != cdolist_list_var2) {
            supports = all_proof_supports_recursive(subproof, supports);
            cdolist_list_var2 = cdolist_list_var2.rest();
            subproof = cdolist_list_var2.first();
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 12920L)
    public static SubLObject all_proof_supports_of_proofs(final SubLObject proofs) {
        SubLObject result = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject cdolist_list_var = proofs;
        SubLObject proof = (SubLObject)inference_datastructures_proof.NIL;
        proof = cdolist_list_var.first();
        while (inference_datastructures_proof.NIL != cdolist_list_var) {
            result = ConsesLow.nconc(all_proof_supports(proof), result);
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)inference_datastructures_proof.UNPROVIDED, (SubLObject)inference_datastructures_proof.UNPROVIDED, (SubLObject)inference_datastructures_proof.UNPROVIDED, (SubLObject)inference_datastructures_proof.UNPROVIDED, (SubLObject)inference_datastructures_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13135L)
    public static SubLObject proof_has_subproofsP(final SubLObject proof) {
        return list_utilities.sublisp_boolean(proof_direct_subproofs(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13267L)
    public static SubLObject proof_sole_subproof(final SubLObject proof) {
        SubLObject result = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject cdolist_list_var = proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)inference_datastructures_proof.NIL;
        subproof = cdolist_list_var.first();
        while (inference_datastructures_proof.NIL != cdolist_list_var) {
            if (inference_datastructures_proof.NIL != result) {
                Errors.error((SubLObject)inference_datastructures_proof.$str60$Expected__s_to_have_at_most_one_s, proof);
            }
            else {
                result = subproof;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13530L)
    public static SubLObject proof_first_subproof(final SubLObject proof) {
        final SubLObject cdolist_list_var = proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)inference_datastructures_proof.NIL;
        subproof = cdolist_list_var.first();
        if (inference_datastructures_proof.NIL != cdolist_list_var) {
            return subproof;
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13684L)
    public static SubLObject all_proof_subproofs(final SubLObject proof) {
        SubLObject v_set_contents = set_contents.new_set_contents((SubLObject)inference_datastructures_proof.ZERO_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_proof.EQ));
        v_set_contents = all_proof_subproofs_recursive(proof, v_set_contents);
        return set_contents.set_contents_element_list(v_set_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 13968L)
    public static SubLObject all_proof_subproofs_recursive(final SubLObject proof, SubLObject all_subproofs_set) {
        if (inference_datastructures_proof.NIL == set_contents.set_contents_memberP(proof, all_subproofs_set, Symbols.symbol_function((SubLObject)inference_datastructures_proof.EQ))) {
            all_subproofs_set = set_contents.set_contents_add(proof, all_subproofs_set, Symbols.symbol_function((SubLObject)inference_datastructures_proof.EQ));
            SubLObject cdolist_list_var = proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)inference_datastructures_proof.NIL;
            subproof = cdolist_list_var.first();
            while (inference_datastructures_proof.NIL != cdolist_list_var) {
                all_subproofs_set = all_proof_subproofs_recursive(subproof, all_subproofs_set);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        return all_subproofs_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14350L)
    public static SubLObject all_proof_subproblems(final SubLObject proof) {
        final SubLObject proofs = all_proof_subproofs(proof);
        SubLObject problems = Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_datastructures_proof.$sym61$PROOF_SUPPORTED_PROBLEM), proofs);
        problems = Sort.sort(problems, Symbols.symbol_function((SubLObject)inference_datastructures_proof.$sym62$_), Symbols.symbol_function((SubLObject)inference_datastructures_proof.$sym63$PROBLEM_SUID));
        problems = list_utilities.delete_duplicates_sorted(problems, Symbols.symbol_function((SubLObject)inference_datastructures_proof.EQ));
        return problems;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14640L)
    public static SubLObject proof_has_dependent_proofsP(final SubLObject proof) {
        SubLObject csome_list_var = proof_dependents(proof);
        SubLObject dependent_proof = (SubLObject)inference_datastructures_proof.NIL;
        dependent_proof = csome_list_var.first();
        while (inference_datastructures_proof.NIL != csome_list_var) {
            if (inference_datastructures_proof.NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, (SubLObject)inference_datastructures_proof.NIL)) {
                return (SubLObject)inference_datastructures_proof.T;
            }
            csome_list_var = csome_list_var.rest();
            dependent_proof = csome_list_var.first();
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14804L)
    public static SubLObject proof_dependent_proofs(final SubLObject proof, SubLObject proof_status) {
        if (proof_status == inference_datastructures_proof.UNPROVIDED) {
            proof_status = (SubLObject)inference_datastructures_proof.NIL;
        }
        SubLObject dependent_proofs = (SubLObject)inference_datastructures_proof.NIL;
        SubLObject csome_list_var = proof_dependents(proof);
        SubLObject dependent_proof = (SubLObject)inference_datastructures_proof.NIL;
        dependent_proof = csome_list_var.first();
        while (inference_datastructures_proof.NIL != csome_list_var) {
            if (inference_datastructures_proof.NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, proof_status)) {
                dependent_proofs = (SubLObject)ConsesLow.cons(dependent_proof, dependent_proofs);
            }
            csome_list_var = csome_list_var.rest();
            dependent_proof = csome_list_var.first();
        }
        return Sequences.nreverse(dependent_proofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15163L)
    public static SubLObject proof_status(final SubLObject proof) {
        if (inference_datastructures_proof.NIL != proof_rejectedP(proof)) {
            return (SubLObject)inference_datastructures_proof.$kw64$REJECTED;
        }
        return (SubLObject)inference_datastructures_proof.$kw65$PROVEN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15328L)
    public static SubLObject proof_rejectedP(final SubLObject proof) {
        final SubLObject store = proof_store(proof);
        final SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        return dictionary_utilities.dictionary_has_keyP(rejected_proofs, proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15523L)
    public static SubLObject proof_reject_reason(final SubLObject proof) {
        final SubLObject store = proof_store(proof);
        final SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        return dictionary.dictionary_lookup(rejected_proofs, proof, (SubLObject)inference_datastructures_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15720L)
    public static SubLObject proof_provenP(final SubLObject proof) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_proof.NIL == proof_rejectedP(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15801L)
    public static SubLObject proof_processedP(final SubLObject proof) {
        return prf_processedP(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 15901L)
    public static SubLObject proof_destructibility_status(final SubLObject proof) {
        return inference_datastructures_problem.problem_destructibility_status(proof_supported_problem(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16098L)
    public static SubLObject proof_indestructibleP(final SubLObject proof) {
        return inference_datastructures_problem.problem_indestructibleP(proof_supported_problem(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16214L)
    public static SubLObject proof_destructibleP(final SubLObject proof) {
        return inference_datastructures_problem.problem_destructibleP(proof_supported_problem(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16326L)
    public static SubLObject proof_note_rejected(final SubLObject proof, final SubLObject reject_reason) {
        assert inference_datastructures_proof.NIL != inference_datastructures_enumerated_types.proof_reject_reason_p(reject_reason) : reject_reason;
        final SubLObject store = proof_store(proof);
        final SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        dictionary.dictionary_enter(rejected_proofs, proof, reject_reason);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16708L)
    public static SubLObject proof_rejected_due_to_ill_formednessP(final SubLObject proof) {
        final SubLObject store = proof_store(proof);
        final SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
        if (inference_datastructures_proof.$kw67$ILL_FORMED == dictionary.dictionary_lookup(rejected_proofs, proof, (SubLObject)inference_datastructures_proof.UNPROVIDED)) {
            return (SubLObject)inference_datastructures_proof.T;
        }
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 16982L)
    public static SubLObject proof_type(final SubLObject proof) {
        if (inference_datastructures_proof.NIL != inference_worker.content_proof_p(proof)) {
            return inference_worker.content_proof_hl_module(proof);
        }
        return inference_worker.structural_proof_type(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 17226L)
    public static SubLObject proof_equalP(final SubLObject proof1, final SubLObject proof2) {
        assert inference_datastructures_proof.NIL != proof_p(proof1) : proof1;
        assert inference_datastructures_proof.NIL != proof_p(proof2) : proof2;
        if (proof1.eql(proof2)) {
            return (SubLObject)inference_datastructures_proof.T;
        }
        final SubLObject supported_problem = proof_supported_problem(proof2);
        final SubLObject v_bindings = proof_bindings(proof2);
        final SubLObject supports = proof_direct_supports(proof2);
        return proof_matches_specificationP(proof1, supported_problem, v_bindings, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 17833L)
    public static SubLObject proof_matches_specificationP(final SubLObject candidate_proof, final SubLObject supported_problem, final SubLObject proof_bindings, final SubLObject proof_direct_supports) {
        assert inference_datastructures_proof.NIL != proof_p(candidate_proof) : candidate_proof;
        assert inference_datastructures_proof.NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        if (!proof_supported_problem(candidate_proof).eql(supported_problem)) {
            return (SubLObject)inference_datastructures_proof.NIL;
        }
        if (inference_datastructures_proof.NIL == inference_worker.proof_bindings_equalP(proof_bindings(candidate_proof), proof_bindings)) {
            return (SubLObject)inference_datastructures_proof.NIL;
        }
        return arguments.justification_equal(proof_direct_supports(candidate_proof), proof_direct_supports);
    }
    
    public static SubLObject declare_inference_datastructures_proof_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_print_function_trampoline", "PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_p", "PROOF-P", 1, 0, false);
        new $proof_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "prf_suid", "PRF-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "prf_bindings", "PRF-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "prf_link", "PRF-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "prf_subproofs", "PRF-SUBPROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "prf_dependents", "PRF-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "prf_processedP", "PRF-PROCESSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "_csetf_prf_suid", "_CSETF-PRF-SUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "_csetf_prf_bindings", "_CSETF-PRF-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "_csetf_prf_link", "_CSETF-PRF-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "_csetf_prf_subproofs", "_CSETF-PRF-SUBPROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "_csetf_prf_dependents", "_CSETF-PRF-DEPENDENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "_csetf_prf_processedP", "_CSETF-PRF-PROCESSED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "make_proof", "MAKE-PROOF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "visit_defstruct_proof", "VISIT-DEFSTRUCT-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "visit_defstruct_object_proof_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "valid_proof_p", "VALID-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_invalid_p", "PROOF-INVALID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "print_proof", "PRINT-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "sxhash_proof_method", "SXHASH-PROOF-METHOD", 1, 0, false);
        new $sxhash_proof_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "list_of_proof_p", "LIST-OF-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "non_empty_list_of_proof_p", "NON-EMPTY-LIST-OF-PROOF-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "do_proof_direct_subproofs", "DO-PROOF-DIRECT-SUBPROOFS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "do_proof_all_subproofs", "DO-PROOF-ALL-SUBPROOFS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "do_proof_dependent_proofs", "DO-PROOF-DEPENDENT-PROOFS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "new_proof", "NEW-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "new_proof_with_bindings", "NEW-PROOF-WITH-BINDINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "register_proof", "REGISTER-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "add_dependent_proof_references", "ADD-DEPENDENT-PROOF-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "destroy_proof", "DESTROY-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "destroy_dependent_proofs", "DESTROY-DEPENDENT-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "destroy_problem_store_proof", "DESTROY-PROBLEM-STORE-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "destroy_proof_int", "DESTROY-PROOF-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "note_proof_invalid", "NOTE-PROOF-INVALID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_suid", "PROOF-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_bindings", "PROOF-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_link", "PROOF-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_direct_subproofs", "PROOF-DIRECT-SUBPROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_dependents", "PROOF-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "set_proof_bindings", "SET-PROOF-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "add_proof_dependent", "ADD-PROOF-DEPENDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "remove_proof_dependent", "REMOVE-PROOF-DEPENDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "note_proof_processed", "NOTE-PROOF-PROCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "note_proof_unprocessed", "NOTE-PROOF-UNPROCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_store", "PROOF-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_supported_problem", "PROOF-SUPPORTED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_supported_problem_query", "PROOF-SUPPORTED-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_supported_problem_free_hl_vars", "PROOF-SUPPORTED-PROBLEM-FREE-HL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_has_supportsP", "PROOF-HAS-SUPPORTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_supports", "PROOF-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_direct_supports", "PROOF-DIRECT-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_spec_direct_supports", "PROOF-SPEC-DIRECT-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_direct_supports_recursive", "PROOF-DIRECT-SUPPORTS-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_spec_direct_supports_recursive", "PROOF-SPEC-DIRECT-SUPPORTS-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "all_proof_supports", "ALL-PROOF-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "all_proof_supports_recursive", "ALL-PROOF-SUPPORTS-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "all_proof_supports_of_proofs", "ALL-PROOF-SUPPORTS-OF-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_has_subproofsP", "PROOF-HAS-SUBPROOFS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_sole_subproof", "PROOF-SOLE-SUBPROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_first_subproof", "PROOF-FIRST-SUBPROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "all_proof_subproofs", "ALL-PROOF-SUBPROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "all_proof_subproofs_recursive", "ALL-PROOF-SUBPROOFS-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "all_proof_subproblems", "ALL-PROOF-SUBPROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_has_dependent_proofsP", "PROOF-HAS-DEPENDENT-PROOFS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_dependent_proofs", "PROOF-DEPENDENT-PROOFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_status", "PROOF-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_rejectedP", "PROOF-REJECTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_reject_reason", "PROOF-REJECT-REASON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_provenP", "PROOF-PROVEN?", 1, 0, false);
        new $proof_provenP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_processedP", "PROOF-PROCESSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_destructibility_status", "PROOF-DESTRUCTIBILITY-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_indestructibleP", "PROOF-INDESTRUCTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_destructibleP", "PROOF-DESTRUCTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_note_rejected", "PROOF-NOTE-REJECTED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_rejected_due_to_ill_formednessP", "PROOF-REJECTED-DUE-TO-ILL-FORMEDNESS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_type", "PROOF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_equalP", "PROOF-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof", "proof_matches_specificationP", "PROOF-MATCHES-SPECIFICATION?", 4, 0, false);
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    public static SubLObject init_inference_datastructures_proof_file() {
        inference_datastructures_proof.$dtp_proof$ = SubLFiles.defconstant("*DTP-PROOF*", (SubLObject)inference_datastructures_proof.$sym0$PROOF);
        return (SubLObject)inference_datastructures_proof.NIL;
    }
    
    public static SubLObject setup_inference_datastructures_proof_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_datastructures_proof.$dtp_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_proof.$sym8$PROOF_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_datastructures_proof.$list9);
        Structures.def_csetf((SubLObject)inference_datastructures_proof.$sym10$PRF_SUID, (SubLObject)inference_datastructures_proof.$sym11$_CSETF_PRF_SUID);
        Structures.def_csetf((SubLObject)inference_datastructures_proof.$sym12$PRF_BINDINGS, (SubLObject)inference_datastructures_proof.$sym13$_CSETF_PRF_BINDINGS);
        Structures.def_csetf((SubLObject)inference_datastructures_proof.$sym14$PRF_LINK, (SubLObject)inference_datastructures_proof.$sym15$_CSETF_PRF_LINK);
        Structures.def_csetf((SubLObject)inference_datastructures_proof.$sym16$PRF_SUBPROOFS, (SubLObject)inference_datastructures_proof.$sym17$_CSETF_PRF_SUBPROOFS);
        Structures.def_csetf((SubLObject)inference_datastructures_proof.$sym18$PRF_DEPENDENTS, (SubLObject)inference_datastructures_proof.$sym19$_CSETF_PRF_DEPENDENTS);
        Structures.def_csetf((SubLObject)inference_datastructures_proof.$sym20$PRF_PROCESSED_, (SubLObject)inference_datastructures_proof.$sym21$_CSETF_PRF_PROCESSED_);
        Equality.identity((SubLObject)inference_datastructures_proof.$sym0$PROOF);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_proof.$dtp_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_proof.$sym33$VISIT_DEFSTRUCT_OBJECT_PROOF_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_proof.$dtp_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_proof.$sym38$SXHASH_PROOF_METHOD));
        return (SubLObject)inference_datastructures_proof.NIL;
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
        me = (SubLFile)new inference_datastructures_proof();
        inference_datastructures_proof.$dtp_proof$ = null;
        $sym0$PROOF = SubLObjectFactory.makeSymbol("PROOF");
        $sym1$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $int2$211 = SubLObjectFactory.makeInteger(211);
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUID"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SUBPROOFS"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENTS"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESSED?"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUID"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("LINK"), (SubLObject)SubLObjectFactory.makeKeyword("SUBPROOFS"), (SubLObject)SubLObjectFactory.makeKeyword("DEPENDENTS"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESSED?"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRF-SUID"), (SubLObject)SubLObjectFactory.makeSymbol("PRF-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("PRF-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("PRF-SUBPROOFS"), (SubLObject)SubLObjectFactory.makeSymbol("PRF-DEPENDENTS"), (SubLObject)SubLObjectFactory.makeSymbol("PRF-PROCESSED?"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PRF-SUID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PRF-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PRF-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PRF-SUBPROOFS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PRF-DEPENDENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PRF-PROCESSED?"));
        $sym7$PRINT_PROOF = SubLObjectFactory.makeSymbol("PRINT-PROOF");
        $sym8$PROOF_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PROOF-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF-P"));
        $sym10$PRF_SUID = SubLObjectFactory.makeSymbol("PRF-SUID");
        $sym11$_CSETF_PRF_SUID = SubLObjectFactory.makeSymbol("_CSETF-PRF-SUID");
        $sym12$PRF_BINDINGS = SubLObjectFactory.makeSymbol("PRF-BINDINGS");
        $sym13$_CSETF_PRF_BINDINGS = SubLObjectFactory.makeSymbol("_CSETF-PRF-BINDINGS");
        $sym14$PRF_LINK = SubLObjectFactory.makeSymbol("PRF-LINK");
        $sym15$_CSETF_PRF_LINK = SubLObjectFactory.makeSymbol("_CSETF-PRF-LINK");
        $sym16$PRF_SUBPROOFS = SubLObjectFactory.makeSymbol("PRF-SUBPROOFS");
        $sym17$_CSETF_PRF_SUBPROOFS = SubLObjectFactory.makeSymbol("_CSETF-PRF-SUBPROOFS");
        $sym18$PRF_DEPENDENTS = SubLObjectFactory.makeSymbol("PRF-DEPENDENTS");
        $sym19$_CSETF_PRF_DEPENDENTS = SubLObjectFactory.makeSymbol("_CSETF-PRF-DEPENDENTS");
        $sym20$PRF_PROCESSED_ = SubLObjectFactory.makeSymbol("PRF-PROCESSED?");
        $sym21$_CSETF_PRF_PROCESSED_ = SubLObjectFactory.makeSymbol("_CSETF-PRF-PROCESSED?");
        $kw22$SUID = SubLObjectFactory.makeKeyword("SUID");
        $kw23$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw24$LINK = SubLObjectFactory.makeKeyword("LINK");
        $kw25$SUBPROOFS = SubLObjectFactory.makeKeyword("SUBPROOFS");
        $kw26$DEPENDENTS = SubLObjectFactory.makeKeyword("DEPENDENTS");
        $kw27$PROCESSED_ = SubLObjectFactory.makeKeyword("PROCESSED?");
        $str28$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw29$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym30$MAKE_PROOF = SubLObjectFactory.makeSymbol("MAKE-PROOF");
        $kw31$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw32$END = SubLObjectFactory.makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_PROOF_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROOF-METHOD");
        $kw34$FREE = SubLObjectFactory.makeKeyword("FREE");
        $str35$_Invalid_PROOF__s_ = SubLObjectFactory.makeString("<Invalid PROOF ~s>");
        $sym36$PROOF_SUID = SubLObjectFactory.makeSymbol("PROOF-SUID");
        $str37$_PROOF__a__a_for_link__a__a_suppo = SubLObjectFactory.makeString("<PROOF ~a.~a for link ~a.~a supported by ~a, supporting ~a>");
        $sym38$SXHASH_PROOF_METHOD = SubLObjectFactory.makeSymbol("SXHASH-PROOF-METHOD");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBPROOF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym40$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym41$PROOF_DIRECT_SUBPROOFS = SubLObjectFactory.makeSymbol("PROOF-DIRECT-SUBPROOFS");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBPROOF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw44$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw45$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym46$ALL_PROOF_SUBPROOFS = SubLObjectFactory.makeSymbol("ALL-PROOF-SUBPROOFS");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-PROOF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROOF-STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw49$PROOF_STATUS = SubLObjectFactory.makeKeyword("PROOF-STATUS");
        $sym50$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym51$PROOF_DEPENDENTS = SubLObjectFactory.makeSymbol("PROOF-DEPENDENTS");
        $sym52$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym53$PROOF_HAS_STATUS_ = SubLObjectFactory.makeSymbol("PROOF-HAS-STATUS?");
        $sym54$PROBLEM_LINK_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-P");
        $sym55$LIST_OF_PROOF_P = SubLObjectFactory.makeSymbol("LIST-OF-PROOF-P");
        $sym56$BINDING_LIST_P = SubLObjectFactory.makeSymbol("BINDING-LIST-P");
        $str57$Expected_link__a_to_have_exactly_ = SubLObjectFactory.makeString("Expected link ~a to have exactly one subproof");
        $str58$Unexpected_link_type_for_proof___ = SubLObjectFactory.makeString("Unexpected link type for proof: ~a");
        $sym59$SUPPORT_EQUAL = SubLObjectFactory.makeSymbol("SUPPORT-EQUAL");
        $str60$Expected__s_to_have_at_most_one_s = SubLObjectFactory.makeString("Expected ~s to have at most one subproof, but it had more");
        $sym61$PROOF_SUPPORTED_PROBLEM = SubLObjectFactory.makeSymbol("PROOF-SUPPORTED-PROBLEM");
        $sym62$_ = SubLObjectFactory.makeSymbol("<");
        $sym63$PROBLEM_SUID = SubLObjectFactory.makeSymbol("PROBLEM-SUID");
        $kw64$REJECTED = SubLObjectFactory.makeKeyword("REJECTED");
        $kw65$PROVEN = SubLObjectFactory.makeKeyword("PROVEN");
        $sym66$PROOF_REJECT_REASON_P = SubLObjectFactory.makeSymbol("PROOF-REJECT-REASON-P");
        $kw67$ILL_FORMED = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $sym68$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
    }
    
    public static final class $proof_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $bindings;
        public SubLObject $link;
        public SubLObject $subproofs;
        public SubLObject $dependents;
        public SubLObject $processedP;
        private static final SubLStructDeclNative structDecl;
        
        public $proof_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$link = (SubLObject)CommonSymbols.NIL;
            this.$subproofs = (SubLObject)CommonSymbols.NIL;
            this.$dependents = (SubLObject)CommonSymbols.NIL;
            this.$processedP = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$proof_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$proof_native.class, inference_datastructures_proof.$sym0$PROOF, inference_datastructures_proof.$sym1$PROOF_P, inference_datastructures_proof.$list3, inference_datastructures_proof.$list4, new String[] { "$suid", "$bindings", "$link", "$subproofs", "$dependents", "$processedP" }, inference_datastructures_proof.$list5, inference_datastructures_proof.$list6, inference_datastructures_proof.$sym7$PRINT_PROOF);
        }
    }
    
    public static final class $proof_p$UnaryFunction extends UnaryFunction
    {
        public $proof_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROOF-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_proof.proof_p(arg1);
        }
    }
    
    public static final class $sxhash_proof_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_proof_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-PROOF-METHOD"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_proof.sxhash_proof_method(arg1);
        }
    }
    
    public static final class $proof_provenP$UnaryFunction extends UnaryFunction
    {
        public $proof_provenP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROOF-PROVEN?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_proof.proof_provenP(arg1);
        }
    }
}

/*

	Total time: 259 ms
	
*/