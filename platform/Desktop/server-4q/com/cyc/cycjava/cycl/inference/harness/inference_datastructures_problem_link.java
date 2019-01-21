package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
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

public final class inference_datastructures_problem_link extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link";
    public static final String myFingerPrint = "3ef675d0c7db161ff170f9b1f9557d7e48f535b52ee7ad35109852ef4a6a86a0";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLSymbol $dtp_problem_link$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLSymbol $dtp_mapped_problem$;
    private static final SubLSymbol $sym0$PROBLEM_LINK;
    private static final SubLSymbol $sym1$PROBLEM_LINK_P;
    private static final SubLInteger $int2$213;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_PROBLEM_LINK;
    private static final SubLSymbol $sym8$PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$PROB_LINK_SUID;
    private static final SubLSymbol $sym11$_CSETF_PROB_LINK_SUID;
    private static final SubLSymbol $sym12$PROB_LINK_TYPE;
    private static final SubLSymbol $sym13$_CSETF_PROB_LINK_TYPE;
    private static final SubLSymbol $sym14$PROB_LINK_SUPPORTED_OBJECT;
    private static final SubLSymbol $sym15$_CSETF_PROB_LINK_SUPPORTED_OBJECT;
    private static final SubLSymbol $sym16$PROB_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static final SubLSymbol $sym17$_CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static final SubLSymbol $sym18$PROB_LINK_OPEN_FLAGS;
    private static final SubLSymbol $sym19$_CSETF_PROB_LINK_OPEN_FLAGS;
    private static final SubLSymbol $sym20$PROB_LINK_DATA;
    private static final SubLSymbol $sym21$_CSETF_PROB_LINK_DATA;
    private static final SubLSymbol $sym22$PROB_LINK_PROOFS;
    private static final SubLSymbol $sym23$_CSETF_PROB_LINK_PROOFS;
    private static final SubLSymbol $sym24$PROB_LINK_MEMOIZATION_STATE;
    private static final SubLSymbol $sym25$_CSETF_PROB_LINK_MEMOIZATION_STATE;
    private static final SubLSymbol $kw26$SUID;
    private static final SubLSymbol $kw27$TYPE;
    private static final SubLSymbol $kw28$SUPPORTED_OBJECT;
    private static final SubLSymbol $kw29$SUPPORTING_MAPPED_PROBLEMS;
    private static final SubLSymbol $kw30$OPEN_FLAGS;
    private static final SubLSymbol $kw31$DATA;
    private static final SubLSymbol $kw32$PROOFS;
    private static final SubLSymbol $kw33$MEMOIZATION_STATE;
    private static final SubLString $str34$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw35$BEGIN;
    private static final SubLSymbol $sym36$MAKE_PROBLEM_LINK;
    private static final SubLSymbol $kw37$SLOT;
    private static final SubLSymbol $kw38$END;
    private static final SubLSymbol $sym39$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LINK_METHOD;
    private static final SubLSymbol $kw40$FREE;
    private static final SubLString $str41$_Invalid_LINK__s_;
    private static final SubLString $str42$__a_LINK__a__a_supporting_;
    private static final SubLSymbol $kw43$ANSWER;
    private static final SubLString $str44$_a_;
    private static final SubLString $str45$_a__a_;
    private static final SubLSymbol $sym46$SXHASH_PROBLEM_LINK_METHOD;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$WITH_MEMOIZATION_STATE;
    private static final SubLSymbol $sym49$PROBLEM_LINK_MEMOIZATION_STATE;
    private static final SubLSymbol $sym50$WITH_PROBLEM_LINK_MEMOIZATION_STATE;
    private static final SubLSymbol $sym51$PROBLEM_LINK_TYPE_P;
    private static final SubLString $str52$Can_t_call_new_problem_link_for_a;
    private static final SubLSymbol $sym53$PROBLEM_P;
    private static final SubLString $str54$problem_link_memoization_state;
    private static final SubLSymbol $kw55$REMOVAL;
    private static final SubLSymbol $kw56$TRANSFORMATION;
    private static final SubLSymbol $kw57$RESIDUAL_TRANSFORMATION;
    private static final SubLSymbol $kw58$JOIN_ORDERED;
    private static final SubLSymbol $kw59$JOIN;
    private static final SubLSymbol $kw60$SPLIT;
    private static final SubLSymbol $kw61$UNION;
    private static final SubLSymbol $kw62$RESTRICTION;
    private static final SubLSymbol $sym63$INTEGERP;
    private static final SubLSymbol $kw64$CONTENT;
    private static final SubLSymbol $kw65$STRUCTURAL;
    private static final SubLSymbol $kw66$DISJUNCTIVE;
    private static final SubLSymbol $kw67$CONJUNCTIVE;
    private static final SubLSymbol $kw68$CONNECTED_CONJUNCTION;
    private static final SubLSymbol $kw69$LOGICAL;
    private static final SubLSymbol $kw70$SPLIT_RESTRICTION;
    private static final SubLSymbol $kw71$SIMPLIFICATION;
    private static final SubLSymbol $kw72$REMOVAL_CONJUNCTIVE;
    private static final SubLSymbol $sym73$PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P;
    private static final SubLSymbol $sym76$MAPPED_PROBLEM_EQUAL;
    private static final SubLSymbol $kw77$PROVEN;
    private static final SubLSymbol $kw78$DESTRUCTIBLE;
    private static final SubLSymbol $kw79$INDESTRUCTIBLE;
    private static final SubLSymbol $sym80$MAPPED_PROBLEM_P;
    private static final SubLSymbol $sym81$MAPPED_PROBLEM;
    private static final SubLInteger $int82$214;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$PRINT_MAPPED_PROBLEM;
    private static final SubLSymbol $sym88$MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$MAPPED_PROB_PROBLEM;
    private static final SubLSymbol $sym91$_CSETF_MAPPED_PROB_PROBLEM;
    private static final SubLSymbol $sym92$MAPPED_PROB_VARIABLE_MAP;
    private static final SubLSymbol $sym93$_CSETF_MAPPED_PROB_VARIABLE_MAP;
    private static final SubLSymbol $kw94$PROBLEM;
    private static final SubLSymbol $kw95$VARIABLE_MAP;
    private static final SubLSymbol $sym96$MAKE_MAPPED_PROBLEM;
    private static final SubLSymbol $sym97$VISIT_DEFSTRUCT_OBJECT_MAPPED_PROBLEM_METHOD;
    private static final SubLString $str98$_MAPPED_PROBLEM__a__a_;
    private static final SubLSymbol $sym99$SXHASH_MAPPED_PROBLEM_METHOD;
    private static final SubLSymbol $sym100$VARIABLE_MAP_P;
    private static final SubLSymbol $sym101$CLOSED_PROBLEM_P;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLSymbol $kw104$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw105$OPEN_;
    private static final SubLSymbol $kw106$DONE;
    private static final SubLSymbol $sym107$PROBLEM_VAR;
    private static final SubLSymbol $sym108$CLET;
    private static final SubLSymbol $sym109$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static final SubLSymbol $sym110$PWHEN;
    private static final SubLSymbol $sym111$MAPPED_PROBLEM_PROBLEM;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$SUPPORTING_MAPPED_PROBLEM;
    private static final SubLSymbol $sym114$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS;
    private static final SubLSymbol $sym115$MAPPED_PROBLEM_VARIABLE_MAP;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject problem_link_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_problem_link(v_object, stream, (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject problem_link_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $problem_link_native.class) ? inference_datastructures_problem_link.T : inference_datastructures_problem_link.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject prob_link_suid(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject prob_link_type(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject prob_link_supported_object(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject prob_link_supporting_mapped_problems(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject prob_link_open_flags(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject prob_link_data(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject prob_link_proofs(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject prob_link_memoization_state(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject _csetf_prob_link_suid(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject _csetf_prob_link_type(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject _csetf_prob_link_supported_object(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject _csetf_prob_link_supporting_mapped_problems(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject _csetf_prob_link_open_flags(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject _csetf_prob_link_data(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject _csetf_prob_link_proofs(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject _csetf_prob_link_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject make_problem_link(SubLObject arglist) {
        if (arglist == inference_datastructures_problem_link.UNPROVIDED) {
            arglist = (SubLObject)inference_datastructures_problem_link.NIL;
        }
        final SubLObject v_new = (SubLObject)new $problem_link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_datastructures_problem_link.NIL, next = arglist; inference_datastructures_problem_link.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw26$SUID)) {
                _csetf_prob_link_suid(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw27$TYPE)) {
                _csetf_prob_link_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw28$SUPPORTED_OBJECT)) {
                _csetf_prob_link_supported_object(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw29$SUPPORTING_MAPPED_PROBLEMS)) {
                _csetf_prob_link_supporting_mapped_problems(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw30$OPEN_FLAGS)) {
                _csetf_prob_link_open_flags(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw31$DATA)) {
                _csetf_prob_link_data(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw32$PROOFS)) {
                _csetf_prob_link_proofs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw33$MEMOIZATION_STATE)) {
                _csetf_prob_link_memoization_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_datastructures_problem_link.$str34$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject visit_defstruct_problem_link(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw35$BEGIN, (SubLObject)inference_datastructures_problem_link.$sym36$MAKE_PROBLEM_LINK, (SubLObject)inference_datastructures_problem_link.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw26$SUID, prob_link_suid(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw27$TYPE, prob_link_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw28$SUPPORTED_OBJECT, prob_link_supported_object(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw29$SUPPORTING_MAPPED_PROBLEMS, prob_link_supporting_mapped_problems(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw30$OPEN_FLAGS, prob_link_open_flags(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw31$DATA, prob_link_data(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw32$PROOFS, prob_link_proofs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw33$MEMOIZATION_STATE, prob_link_memoization_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw38$END, (SubLObject)inference_datastructures_problem_link.$sym36$MAKE_PROBLEM_LINK, (SubLObject)inference_datastructures_problem_link.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1174L)
    public static SubLObject visit_defstruct_object_problem_link_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_problem_link(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 2261L)
    public static SubLObject valid_problem_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_link.NIL != problem_link_p(v_object) && inference_datastructures_problem_link.NIL == problem_link_invalid_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 2395L)
    public static SubLObject problem_link_invalid_p(final SubLObject problem_link) {
        return Equality.eq((SubLObject)inference_datastructures_problem_link.$kw40$FREE, problem_link_type(problem_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 2549L)
    public static SubLObject print_problem_link(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (inference_datastructures_problem_link.NIL != problem_link_invalid_p(v_object)) {
            PrintLow.format(stream, (SubLObject)inference_datastructures_problem_link.$str41$_Invalid_LINK__s_, prob_link_suid(v_object));
        }
        else {
            final SubLObject store_suid = inference_datastructures_problem_store.problem_store_suid(problem_link_store(v_object));
            final SubLObject type = problem_link_type(v_object);
            PrintLow.format(stream, (SubLObject)inference_datastructures_problem_link.$str42$__a_LINK__a__a_supporting_, new SubLObject[] { type, store_suid, problem_link_suid(v_object) });
            if (inference_datastructures_problem_link.$kw43$ANSWER == type) {
                PrintLow.format(stream, (SubLObject)inference_datastructures_problem_link.$str44$_a_, problem_link_supported_inference(v_object));
            }
            else {
                PrintLow.format(stream, (SubLObject)inference_datastructures_problem_link.$str45$_a__a_, store_suid, inference_datastructures_problem.problem_suid(problem_link_supported_problem(v_object)));
            }
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3181L)
    public static SubLObject sxhash_problem_link_method(final SubLObject v_object) {
        return prob_link_suid(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3261L)
    public static SubLObject with_problem_link_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_link = (SubLObject)inference_datastructures_problem_link.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list47);
        problem_link = current.first();
        current = current.rest();
        if (inference_datastructures_problem_link.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem_link.$sym48$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_link.$sym49$PROBLEM_LINK_MEMOIZATION_STATE, problem_link)), ConsesLow.append(body, (SubLObject)inference_datastructures_problem_link.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_link.$list47);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3542L)
    public static SubLObject problem_link_memoization_state(final SubLObject problem_link) {
        return prob_link_memoization_state(problem_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3753L)
    public static SubLObject new_problem_link(final SubLObject type, final SubLObject supported_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_datastructures_problem_link.NIL != inference_datastructures_enumerated_types.problem_link_type_p(type) : type;
        if (inference_datastructures_problem_link.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_datastructures_problem_link.$kw43$ANSWER == type) {
            Errors.error((SubLObject)inference_datastructures_problem_link.$str52$Can_t_call_new_problem_link_for_a);
        }
        assert inference_datastructures_problem_link.NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        final SubLObject link = new_problem_link_int(supported_problem, type);
        inference_datastructures_problem.add_problem_argument_link(supported_problem, link);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 4271L)
    public static SubLObject new_problem_link_int(final SubLObject supported_object, final SubLObject type) {
        final SubLObject link = make_problem_link((SubLObject)inference_datastructures_problem_link.UNPROVIDED);
        _csetf_prob_link_type(link, type);
        _csetf_prob_link_supported_object(link, supported_object);
        final SubLObject store = problem_link_store(link);
        final SubLObject suid = inference_datastructures_problem_store.problem_store_new_link_id(store);
        inference_metrics.increment_problem_link_type_historical_counts(type);
        _csetf_prob_link_suid(link, suid);
        _csetf_prob_link_supporting_mapped_problems(link, (SubLObject)inference_datastructures_problem_link.NIL);
        _csetf_prob_link_open_flags(link, (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER);
        _csetf_prob_link_memoization_state(link, memoization_state.new_memoization_state((SubLObject)inference_datastructures_problem_link.$str54$problem_link_memoization_state, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED));
        inference_datastructures_problem_store.add_problem_store_link(store, link);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 4983L)
    public static SubLObject destroy_problem_link(final SubLObject link) {
        if (inference_datastructures_problem_link.NIL != valid_problem_link_p(link)) {
            final SubLObject type = problem_link_type(link);
            final SubLObject store = problem_link_store(link);
            note_problem_link_invalid(link);
            final SubLObject pcase_var = type;
            if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw43$ANSWER)) {
                final SubLObject inference = problem_link_supported_object(link);
                if (inference_datastructures_problem_link.NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                    inference_datastructures_inference.destroy_inference(inference);
                }
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw55$REMOVAL)) {
                inference_worker_removal.destroy_removal_link(link);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw56$TRANSFORMATION)) {
                inference_worker_transformation.destroy_transformation_link(link);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw57$RESIDUAL_TRANSFORMATION)) {
                inference_worker_residual_transformation.destroy_residual_transformation_link(link);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw58$JOIN_ORDERED)) {
                inference_worker_join_ordered.destroy_join_ordered_link(link);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw59$JOIN)) {
                inference_worker_join.destroy_join_link(link);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw60$SPLIT)) {
                inference_worker_split.destroy_split_link(link);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw61$UNION)) {
                inference_worker_union.destroy_union_link(link);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw62$RESTRICTION)) {
                inference_worker_restriction.destroy_restriction_link(link);
            }
            if (inference_datastructures_problem_link.$kw43$ANSWER != type) {
                SubLObject cdolist_list_var;
                final SubLObject doomed_proofs = cdolist_list_var = problem_link_all_proofs(link);
                SubLObject proof = (SubLObject)inference_datastructures_problem_link.NIL;
                proof = cdolist_list_var.first();
                while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
                    if (inference_datastructures_problem_link.NIL != inference_datastructures_proof.valid_proof_p(proof)) {
                        inference_datastructures_proof.destroy_proof(proof);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
                if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link, supporting_mapped_problem)) {
                    final SubLObject supporting_problem = mapped_problem_problem(supporting_mapped_problem);
                    final SubLObject variable_map = mapped_problem_variable_map(supporting_mapped_problem);
                    if (inference_datastructures_problem_link.NIL != inference_datastructures_problem.valid_problem_p(supporting_problem)) {
                        inference_datastructures_problem.remove_problem_dependent_link(supporting_problem, link);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
            if (inference_datastructures_problem_link.$kw43$ANSWER != type) {
                final SubLObject supported_problem = problem_link_supported_problem(link);
                if (inference_datastructures_problem_link.NIL != inference_datastructures_problem.valid_problem_p(supported_problem)) {
                    inference_datastructures_problem.remove_problem_argument_link(supported_problem, link);
                }
            }
            inference_datastructures_problem_store.remove_problem_store_link(store, link);
            _csetf_prob_link_memoization_state(link, (SubLObject)inference_datastructures_problem_link.$kw40$FREE);
            return destroy_problem_link_int(link);
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 6679L)
    public static SubLObject destroy_problem_store_link(final SubLObject link) {
        if (inference_datastructures_problem_link.NIL != valid_problem_link_p(link)) {
            note_problem_link_invalid(link);
            return destroy_problem_link_int(link);
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 6850L)
    public static SubLObject destroy_problem_link_int(final SubLObject link) {
        _csetf_prob_link_data(link, (SubLObject)inference_datastructures_problem_link.$kw40$FREE);
        _csetf_prob_link_open_flags(link, (SubLObject)inference_datastructures_problem_link.$kw40$FREE);
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
        mapped_problem = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link, mapped_problem)) {
                destroy_problem_link_mapped_problem(mapped_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        }
        _csetf_prob_link_supporting_mapped_problems(link, (SubLObject)inference_datastructures_problem_link.$kw40$FREE);
        _csetf_prob_link_supported_object(link, (SubLObject)inference_datastructures_problem_link.$kw40$FREE);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7290L)
    public static SubLObject note_problem_link_invalid(final SubLObject link) {
        _csetf_prob_link_type(link, (SubLObject)inference_datastructures_problem_link.$kw40$FREE);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7392L)
    public static SubLObject problem_link_suid(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        return prob_link_suid(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7514L)
    public static SubLObject problem_link_type(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        return prob_link_type(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7624L)
    public static SubLObject problem_link_supported_object(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        return prob_link_supported_object(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7758L)
    public static SubLObject problem_link_supporting_mapped_problems(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        return prob_link_supporting_mapped_problems(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7912L)
    public static SubLObject problem_link_open_flags(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        return prob_link_open_flags(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8032L)
    public static SubLObject problem_link_data(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        return prob_link_data(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8142L)
    public static SubLObject set_problem_link_open_flags(final SubLObject link, final SubLObject flags) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        assert inference_datastructures_problem_link.NIL != Types.integerp(flags) : flags;
        _csetf_prob_link_open_flags(link, flags);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8335L)
    public static SubLObject set_problem_link_data(final SubLObject link, final SubLObject data) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        _csetf_prob_link_data(link, data);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8474L)
    public static SubLObject add_problem_link_proof(final SubLObject link, final SubLObject proof) {
        SubLObject proofs = prob_link_proofs(link);
        if (inference_datastructures_problem_link.NIL == conses_high.member(proof, proofs, Symbols.symbol_function((SubLObject)inference_datastructures_problem_link.EQL), Symbols.symbol_function((SubLObject)inference_datastructures_problem_link.IDENTITY))) {
            proofs = (SubLObject)ConsesLow.cons(proof, proofs);
        }
        _csetf_prob_link_proofs(link, proofs);
        return proofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8676L)
    public static SubLObject remove_problem_link_proof(final SubLObject link, final SubLObject old_proof) {
        if (inference_datastructures_problem_link.NIL != valid_problem_link_p(link)) {
            SubLObject proofs = prob_link_proofs(link);
            proofs = Sequences.delete(old_proof, proofs, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED);
            _csetf_prob_link_proofs(link, proofs);
            return proofs;
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8934L)
    public static SubLObject problem_link_supporting_problems(final SubLObject link) {
        SubLObject problems = (SubLObject)inference_datastructures_problem_link.NIL;
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link, supporting_mapped_problem)) {
                problems = (SubLObject)ConsesLow.cons(mapped_problem_problem(supporting_mapped_problem), problems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return Sequences.nreverse(problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 9295L)
    public static SubLObject problem_link_store(final SubLObject link) {
        if (inference_datastructures_problem_link.NIL != inference_worker_answer.answer_link_p(link)) {
            return inference_datastructures_inference.inference_problem_store(problem_link_supported_inference(link));
        }
        return inference_datastructures_problem.problem_store(problem_link_supported_problem(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 9516L)
    public static SubLObject problem_link_has_typeP(final SubLObject link, final SubLObject type) {
        if (type.eql((SubLObject)inference_datastructures_problem_link.$kw64$CONTENT)) {
            return inference_worker.content_link_p(link);
        }
        if (type.eql((SubLObject)inference_datastructures_problem_link.$kw65$STRUCTURAL)) {
            return inference_worker.structural_link_p(link);
        }
        if (type.eql((SubLObject)inference_datastructures_problem_link.$kw66$DISJUNCTIVE)) {
            return inference_worker.disjunctive_link_p(link);
        }
        if (type.eql((SubLObject)inference_datastructures_problem_link.$kw67$CONJUNCTIVE)) {
            return inference_worker.conjunctive_link_p(link);
        }
        if (type.eql((SubLObject)inference_datastructures_problem_link.$kw68$CONNECTED_CONJUNCTION)) {
            return inference_worker.connected_conjunction_link_p(link);
        }
        if (type.eql((SubLObject)inference_datastructures_problem_link.$kw69$LOGICAL)) {
            return inference_worker.logical_link_p(link);
        }
        if (type.eql((SubLObject)inference_datastructures_problem_link.$kw70$SPLIT_RESTRICTION)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_link.NIL != inference_worker_split.split_link_p(link) || inference_datastructures_problem_link.NIL != inference_worker_restriction.restriction_link_p(link));
        }
        if (type.eql((SubLObject)inference_datastructures_problem_link.$kw71$SIMPLIFICATION)) {
            return inference_worker_restriction.simplification_link_p(link);
        }
        if (type.eql((SubLObject)inference_datastructures_problem_link.$kw72$REMOVAL_CONJUNCTIVE)) {
            return inference_worker_removal.conjunctive_removal_link_p(link);
        }
        return Equality.eq(type, problem_link_type(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10253L)
    public static SubLObject problem_link_supported_inference(final SubLObject link) {
        if (inference_datastructures_problem_link.NIL != inference_worker_answer.answer_link_p(link)) {
            return problem_link_supported_object(link);
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10392L)
    public static SubLObject problem_link_supported_problem(final SubLObject link) {
        if (inference_datastructures_problem_link.NIL == inference_worker_answer.answer_link_p(link)) {
            return problem_link_supported_object(link);
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10530L)
    public static SubLObject problem_link_with_supporting_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_link.NIL != problem_link_p(v_object) && inference_datastructures_problem_link.NIL != list_utilities.sublisp_boolean(problem_link_supporting_mapped_problems(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10796L)
    public static SubLObject problem_link_with_single_supporting_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_link.NIL != problem_link_p(v_object) && inference_datastructures_problem_link.NIL != list_utilities.singletonP(problem_link_supporting_mapped_problems(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10978L)
    public static SubLObject problem_link_number_of_supporting_problems(final SubLObject link) {
        return problem_link_supporting_mapped_problem_count(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11170L)
    public static SubLObject problem_link_supporting_mapped_problem_count(final SubLObject link) {
        return Sequences.length(problem_link_supporting_mapped_problems(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11306L)
    public static SubLObject problem_link_first_supporting_mapped_problem(final SubLObject link) {
        return problem_link_supporting_mapped_problems(link).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11441L)
    public static SubLObject problem_link_sole_supporting_mapped_problem(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_with_single_supporting_problem_p(link) : link;
        return problem_link_first_supporting_mapped_problem(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11638L)
    public static SubLObject problem_link_sole_supporting_variable_map(final SubLObject link) {
        final SubLObject mapped_problem = problem_link_sole_supporting_mapped_problem(link);
        return mapped_problem_variable_map(mapped_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11841L)
    public static SubLObject problem_link_first_supporting_problem(final SubLObject link) {
        return mapped_problem_problem(problem_link_first_supporting_mapped_problem(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12083L)
    public static SubLObject problem_link_sole_supporting_problem(final SubLObject link) {
        return mapped_problem_problem(problem_link_sole_supporting_mapped_problem(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12322L)
    public static SubLObject problem_link_find_supporting_mapped_problem_by_index(final SubLObject link, final SubLObject index) {
        return ConsesLow.nth(index, problem_link_supporting_mapped_problems(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12475L)
    public static SubLObject problem_link_openP(final SubLObject link) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!problem_link_open_flags(link).isZero());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12576L)
    public static SubLObject problem_link_closedP(final SubLObject link) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_link.NIL == problem_link_openP(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12665L)
    public static SubLObject problem_link_index_openP(final SubLObject link, final SubLObject index) {
        final SubLObject flags = problem_link_open_flags(link);
        return number_utilities.get_bit(flags, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12805L)
    public static SubLObject problem_link_supporting_mapped_problem_openP(final SubLObject link, final SubLObject supporting_mapped_problem) {
        final SubLObject index = Sequences.position(supporting_mapped_problem, problem_link_supporting_mapped_problems(link), (SubLObject)inference_datastructures_problem_link.$sym76$MAPPED_PROBLEM_EQUAL, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED);
        return problem_link_index_openP(link, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 13076L)
    public static SubLObject problem_link_sole_supporting_mapped_problem_openP(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_with_single_supporting_problem_p(link) : link;
        return problem_link_index_openP(link, (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 13261L)
    public static SubLObject supporting_mapped_problem_open_wrt_linkP(final SubLObject supporting_mapped_problem, final SubLObject link) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject candidate_supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
        candidate_supporting_mapped_problem = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.T, link, candidate_supporting_mapped_problem) && candidate_supporting_mapped_problem.eql(supporting_mapped_problem)) {
                return (SubLObject)inference_datastructures_problem_link.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 13669L)
    public static SubLObject supporting_problem_open_wrt_linkP(final SubLObject supporting_problem, final SubLObject link) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.T, link, supporting_mapped_problem)) {
                final SubLObject candidate_supporting_problem = mapped_problem_problem(supporting_mapped_problem);
                final SubLObject variable_map = mapped_problem_variable_map(supporting_mapped_problem);
                if (candidate_supporting_problem.eql(supporting_problem)) {
                    return (SubLObject)inference_datastructures_problem_link.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14031L)
    public static SubLObject problem_link_completely_openP(final SubLObject link) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link, supporting_mapped_problem) && inference_datastructures_problem_link.NIL == problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem)) {
                return (SubLObject)inference_datastructures_problem_link.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem_link.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14286L)
    public static SubLObject problem_link_has_some_proofP(final SubLObject problem_link, SubLObject proof_status) {
        if (proof_status == inference_datastructures_problem_link.UNPROVIDED) {
            proof_status = (SubLObject)inference_datastructures_problem_link.NIL;
        }
        assert inference_datastructures_problem_link.NIL != problem_link_p(problem_link) : problem_link;
        SubLObject cdolist_list_var = problem_link_proofs(problem_link);
        SubLObject proof = (SubLObject)inference_datastructures_problem_link.NIL;
        proof = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_datastructures_problem.proof_has_statusP(proof, proof_status)) {
                return (SubLObject)inference_datastructures_problem_link.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14515L)
    public static SubLObject problem_link_goodP(final SubLObject link) {
        return problem_link_has_some_proofP(link, (SubLObject)inference_datastructures_problem_link.$kw77$PROVEN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14613L)
    public static SubLObject problem_link_proofs(final SubLObject link) {
        return prob_link_proofs(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14692L)
    public static SubLObject problem_link_all_proofs(final SubLObject link) {
        return problem_link_proofs(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14778L)
    public static SubLObject problem_link_proof_count(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        SubLObject count = (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_link_proofs(link);
        SubLObject proof = (SubLObject)inference_datastructures_problem_link.NIL;
        proof = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_datastructures_problem.proof_has_statusP(proof, (SubLObject)inference_datastructures_problem_link.NIL)) {
                count = Numbers.add(count, (SubLObject)inference_datastructures_problem_link.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14963L)
    public static SubLObject problem_link_destructibleP(final SubLObject link) {
        return inference_datastructures_enumerated_types.destructibility_status_destructibleP(problem_link_destructibility_status(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 15107L)
    public static SubLObject problem_link_destructibility_status(final SubLObject link) {
        if (inference_datastructures_problem_link.NIL == inference_worker_answer.answer_link_p(link)) {
            if (inference_datastructures_problem_link.NIL != inference_datastructures_problem.problem_destructibleP(problem_link_supported_problem(link))) {
                return (SubLObject)inference_datastructures_problem_link.$kw78$DESTRUCTIBLE;
            }
            SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
                if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link, supporting_mapped_problem)) {
                    final SubLObject supporting_problem = mapped_problem_problem(supporting_mapped_problem);
                    final SubLObject variable_map = mapped_problem_variable_map(supporting_mapped_problem);
                    if (inference_datastructures_problem_link.NIL != inference_datastructures_problem.problem_destructibleP(supporting_problem)) {
                        return (SubLObject)inference_datastructures_problem_link.$kw78$DESTRUCTIBLE;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_datastructures_problem_link.$kw79$INDESTRUCTIBLE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 15628L)
    public static SubLObject add_problem_link_supporting_mapped_problem(final SubLObject link, final SubLObject supporting_mapped_problem) {
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        assert inference_datastructures_problem_link.NIL != mapped_problem_p(supporting_mapped_problem) : supporting_mapped_problem;
        _csetf_prob_link_supporting_mapped_problems(link, (SubLObject)ConsesLow.cons(supporting_mapped_problem, prob_link_supporting_mapped_problems(link)));
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 15997L)
    public static SubLObject problem_link_open_all(final SubLObject link) {
        final SubLObject supporting_mapped_problem_count = problem_link_supporting_mapped_problem_count(link);
        SubLObject flags = (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER;
        SubLObject index;
        for (index = (SubLObject)inference_datastructures_problem_link.NIL, index = (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER; index.numL(supporting_mapped_problem_count); index = Numbers.add(index, (SubLObject)inference_datastructures_problem_link.ONE_INTEGER)) {
            flags = number_utilities.set_bit(flags, index, (SubLObject)inference_datastructures_problem_link.T);
        }
        set_problem_link_open_flags(link, flags);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16312L)
    public static SubLObject problem_link_open_index(final SubLObject link, final SubLObject index) {
        SubLObject flags = problem_link_open_flags(link);
        flags = number_utilities.set_bit(flags, index, (SubLObject)inference_datastructures_problem_link.T);
        set_problem_link_open_flags(link, flags);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16518L)
    public static SubLObject problem_link_open_supporting_mapped_problem(final SubLObject link, final SubLObject supporting_mapped_problem) {
        final SubLObject index = Sequences.position(supporting_mapped_problem, problem_link_supporting_mapped_problems(link), (SubLObject)inference_datastructures_problem_link.$sym76$MAPPED_PROBLEM_EQUAL, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED);
        return (SubLObject)((inference_datastructures_problem_link.NIL != index) ? problem_link_open_index(link, index) : inference_datastructures_problem_link.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16801L)
    public static SubLObject problem_link_open_sole_supporting_mapped_problem(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_with_single_supporting_problem_p(link) : link;
        return problem_link_open_index(link, (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16984L)
    public static SubLObject problem_link_close_index(final SubLObject link, final SubLObject index) {
        SubLObject flags = problem_link_open_flags(link);
        flags = number_utilities.set_bit(flags, index, (SubLObject)inference_datastructures_problem_link.NIL);
        set_problem_link_open_flags(link, flags);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17194L)
    public static SubLObject problem_link_close_all(final SubLObject link) {
        set_problem_link_open_flags(link, (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17296L)
    public static SubLObject problem_link_close_supporting_mapped_problem(final SubLObject link, final SubLObject supporting_mapped_problem) {
        final SubLObject index = Sequences.position(supporting_mapped_problem, problem_link_supporting_mapped_problems(link), (SubLObject)inference_datastructures_problem_link.$sym76$MAPPED_PROBLEM_EQUAL, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED);
        return problem_link_close_index(link, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17567L)
    public static SubLObject problem_link_close_sole_supporting_mapped_problem(final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != problem_link_with_single_supporting_problem_p(link) : link;
        return problem_link_close_index(link, (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17752L)
    public static SubLObject connect_supporting_mapped_problem_with_dependent_link(final SubLObject supporting_mapped_problem, final SubLObject link) {
        assert inference_datastructures_problem_link.NIL != mapped_problem_p(supporting_mapped_problem) : supporting_mapped_problem;
        assert inference_datastructures_problem_link.NIL != problem_link_p(link) : link;
        add_problem_link_supporting_mapped_problem(link, supporting_mapped_problem);
        inference_datastructures_problem.add_problem_dependent_link(mapped_problem_problem(supporting_mapped_problem), link);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 18216L)
    public static SubLObject problem_link_to_goal_p(final SubLObject link) {
        final SubLObject supporting_mapped_problems = problem_link_supporting_mapped_problems(link);
        return Types.sublisp_null(supporting_mapped_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 18587L)
    public static SubLObject find_problem_link_of_type_between(final SubLObject type, final SubLObject supported_problem, final SubLObject supporting_mapped_problem) {
        assert inference_datastructures_problem_link.NIL != inference_datastructures_enumerated_types.problem_link_type_p(type) : type;
        assert inference_datastructures_problem_link.NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        assert inference_datastructures_problem_link.NIL != mapped_problem_p(supporting_mapped_problem) : supporting_mapped_problem;
        SubLObject existing_link = (SubLObject)inference_datastructures_problem_link.NIL;
        final SubLObject problem_var;
        final SubLObject supporting_problem = problem_var = mapped_problem_problem(supporting_mapped_problem);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject link_var;
        SubLObject rest;
        SubLObject candidate_supporting_mapped_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem_link.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem_link.NIL == existing_link && inference_datastructures_problem_link.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem_link.NIL != set_contents.do_set_contents_element_validP(state, dependent_link) && inference_datastructures_problem_link.NIL != problem_link_has_typeP(dependent_link, type)) {
                link_var = dependent_link;
                for (rest = (SubLObject)inference_datastructures_problem_link.NIL, rest = problem_link_supporting_mapped_problems(link_var); inference_datastructures_problem_link.NIL == existing_link && inference_datastructures_problem_link.NIL != rest; rest = rest.rest()) {
                    candidate_supporting_mapped_problem = rest.first();
                    if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link_var, candidate_supporting_mapped_problem) && problem_var.eql(mapped_problem_problem(candidate_supporting_mapped_problem)) && supported_problem.eql(problem_link_supported_problem(dependent_link)) && inference_datastructures_problem_link.NIL != mapped_problem_equal(supporting_mapped_problem, candidate_supporting_mapped_problem)) {
                        existing_link = dependent_link;
                    }
                }
            }
        }
        return existing_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 19538L)
    public static SubLObject link_of_type_betweenP(final SubLObject link_type, final SubLObject supported_problem, final SubLObject supporting_problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem_link.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem_link.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem_link.NIL != set_contents.do_set_contents_element_validP(state, link) && inference_datastructures_problem_link.NIL != problem_link_has_typeP(link, link_type) && supported_problem.eql(problem_link_supported_problem(link))) {
                return (SubLObject)inference_datastructures_problem_link.T;
            }
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 20057L)
    public static SubLObject find_closed_supporting_problem_by_query(final SubLObject link, final SubLObject query) {
        final SubLObject mapped_problem = find_supporting_mapped_problem_by_query_and_variable_map(link, query, (SubLObject)inference_datastructures_problem_link.NIL);
        return (SubLObject)((inference_datastructures_problem_link.NIL != mapped_problem) ? mapped_problem_problem(mapped_problem) : inference_datastructures_problem_link.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 20305L)
    public static SubLObject find_supporting_mapped_problem_by_query_and_variable_map(final SubLObject link, final SubLObject query, final SubLObject variable_map) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
        mapped_problem = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link, mapped_problem) && inference_datastructures_problem_link.NIL != mapped_problem_equals_specP(mapped_problem, query, variable_map)) {
                return mapped_problem;
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 20725L)
    public static SubLObject problem_link_supporting_mapped_problem_that_isnt(final SubLObject link, final SubLObject wrong_mapped_problem) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link, supporting_mapped_problem) && !supporting_mapped_problem.eql(wrong_mapped_problem)) {
                return supporting_mapped_problem;
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLObject mapped_problem_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_mapped_problem(v_object, stream, (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLObject mapped_problem_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $mapped_problem_native.class) ? inference_datastructures_problem_link.T : inference_datastructures_problem_link.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLObject mapped_prob_problem(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != mapped_problem_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLObject mapped_prob_variable_map(final SubLObject v_object) {
        assert inference_datastructures_problem_link.NIL != mapped_problem_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLObject _csetf_mapped_prob_problem(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != mapped_problem_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLObject _csetf_mapped_prob_variable_map(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem_link.NIL != mapped_problem_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLObject make_mapped_problem(SubLObject arglist) {
        if (arglist == inference_datastructures_problem_link.UNPROVIDED) {
            arglist = (SubLObject)inference_datastructures_problem_link.NIL;
        }
        final SubLObject v_new = (SubLObject)new $mapped_problem_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_datastructures_problem_link.NIL, next = arglist; inference_datastructures_problem_link.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw94$PROBLEM)) {
                _csetf_mapped_prob_problem(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem_link.$kw95$VARIABLE_MAP)) {
                _csetf_mapped_prob_variable_map(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_datastructures_problem_link.$str34$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLObject visit_defstruct_mapped_problem(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw35$BEGIN, (SubLObject)inference_datastructures_problem_link.$sym96$MAKE_MAPPED_PROBLEM, (SubLObject)inference_datastructures_problem_link.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw94$PROBLEM, mapped_prob_problem(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw37$SLOT, (SubLObject)inference_datastructures_problem_link.$kw95$VARIABLE_MAP, mapped_prob_variable_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem_link.$kw38$END, (SubLObject)inference_datastructures_problem_link.$sym96$MAKE_MAPPED_PROBLEM, (SubLObject)inference_datastructures_problem_link.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21318L)
    public static SubLObject visit_defstruct_object_mapped_problem_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_mapped_problem(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21754L)
    public static SubLObject valid_mapped_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_link.NIL != mapped_problem_p(v_object) && inference_datastructures_problem_link.$kw40$FREE != mapped_problem_variable_map(v_object) && inference_datastructures_problem_link.NIL != inference_datastructures_problem.valid_problem_p(mapped_problem_problem(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21964L)
    public static SubLObject mapped_problem_equal(final SubLObject mapped_problem1, final SubLObject mapped_problem2) {
        if (mapped_problem1.eql(mapped_problem2)) {
            return (SubLObject)inference_datastructures_problem_link.T;
        }
        final SubLObject problem1 = mapped_problem_problem(mapped_problem1);
        final SubLObject problem2 = mapped_problem_problem(mapped_problem2);
        if (!problem1.eql(problem2)) {
            return (SubLObject)inference_datastructures_problem_link.NIL;
        }
        final SubLObject variable_map1 = mapped_problem_variable_map(mapped_problem1);
        final SubLObject variable_map2 = mapped_problem_variable_map(mapped_problem2);
        return Equality.equal(variable_map1, variable_map2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 22451L)
    public static SubLObject print_mapped_problem(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_datastructures_problem_link.NIL != valid_mapped_problem_p(v_object)) {
            PrintLow.format(stream, (SubLObject)inference_datastructures_problem_link.$str98$_MAPPED_PROBLEM__a__a_, mapped_problem_problem(v_object), mapped_problem_variable_map(v_object));
        }
        else if (inference_datastructures_problem_link.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)inference_datastructures_problem_link.NIL, (SubLObject)inference_datastructures_problem_link.NIL);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)inference_datastructures_problem_link.NIL, (SubLObject)inference_datastructures_problem_link.NIL);
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 22763L)
    public static SubLObject sxhash_mapped_problem_method(final SubLObject v_object) {
        return Numbers.logxor(Sxhash.sxhash(mapped_prob_problem(v_object)), Sxhash.sxhash(mapped_prob_variable_map(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 22964L)
    public static SubLObject closed_mapped_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_link.NIL != mapped_problem_p(v_object) && inference_datastructures_problem_link.NIL != inference_datastructures_problem.closed_problem_p(mapped_problem_problem(v_object)) && inference_datastructures_problem_link.NIL == mapped_problem_variable_map(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23218L)
    public static SubLObject new_mapped_problem(final SubLObject problem, final SubLObject variable_map) {
        assert inference_datastructures_problem_link.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert inference_datastructures_problem_link.NIL != bindings.variable_map_p(variable_map) : variable_map;
        final SubLObject mapped_problem = make_mapped_problem((SubLObject)inference_datastructures_problem_link.UNPROVIDED);
        _csetf_mapped_prob_problem(mapped_problem, problem);
        _csetf_mapped_prob_variable_map(mapped_problem, variable_map);
        return mapped_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23602L)
    public static SubLObject new_closed_mapped_problem(final SubLObject problem) {
        assert inference_datastructures_problem_link.NIL != inference_datastructures_problem.closed_problem_p(problem) : problem;
        return new_mapped_problem(problem, (SubLObject)inference_datastructures_problem_link.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23739L)
    public static SubLObject destroy_problem_link_mapped_problem(final SubLObject mapped_problem) {
        if (inference_datastructures_problem_link.NIL != valid_mapped_problem_p(mapped_problem)) {
            note_mapped_problem_invalid(mapped_problem);
            return destroy_mapped_problem_int(mapped_problem);
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23979L)
    public static SubLObject destroy_mapped_problem_int(final SubLObject mapped_problem) {
        _csetf_mapped_prob_problem(mapped_problem, (SubLObject)inference_datastructures_problem_link.$kw40$FREE);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24106L)
    public static SubLObject note_mapped_problem_invalid(final SubLObject mapped_problem) {
        _csetf_mapped_prob_variable_map(mapped_problem, (SubLObject)inference_datastructures_problem_link.$kw40$FREE);
        return mapped_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24250L)
    public static SubLObject mapped_problem_problem(final SubLObject mapped_problem) {
        assert inference_datastructures_problem_link.NIL != mapped_problem_p(mapped_problem) : mapped_problem;
        return mapped_prob_problem(mapped_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24414L)
    public static SubLObject mapped_problem_variable_map(final SubLObject mapped_problem) {
        assert inference_datastructures_problem_link.NIL != mapped_problem_p(mapped_problem) : mapped_problem;
        return mapped_prob_variable_map(mapped_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24666L)
    public static SubLObject supporting_mapped_problem_index(final SubLObject link, final SubLObject supporting_mapped_problem) {
        SubLObject index = (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject candidate_supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
        candidate_supporting_mapped_problem = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link, candidate_supporting_mapped_problem)) {
                if (inference_datastructures_problem_link.NIL != mapped_problem_equal(candidate_supporting_mapped_problem, supporting_mapped_problem)) {
                    return index;
                }
                index = Numbers.add(index, (SubLObject)inference_datastructures_problem_link.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24985L)
    public static SubLObject find_supporting_mapped_problem_by_index(final SubLObject link, final SubLObject index) {
        SubLObject candidate_index = (SubLObject)inference_datastructures_problem_link.ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_datastructures_problem_link.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_link.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem_link.NIL, link, supporting_mapped_problem)) {
                if (index.numE(candidate_index)) {
                    return supporting_mapped_problem;
                }
                candidate_index = Numbers.add(candidate_index, (SubLObject)inference_datastructures_problem_link.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 25239L)
    public static SubLObject mapped_problem_query_as_subquery(final SubLObject mapped_problem) {
        final SubLObject problem = mapped_problem_problem(mapped_problem);
        final SubLObject variable_map = mapped_problem_variable_map(mapped_problem);
        final SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
        final SubLObject subquery = bindings.apply_bindings(variable_map, problem_query);
        return subquery;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 25690L)
    public static SubLObject mapped_problem_equals_specP(final SubLObject mapped_problem, final SubLObject query, final SubLObject variable_map) {
        final SubLObject target_query = inference_datastructures_problem.problem_query(mapped_problem_problem(mapped_problem));
        final SubLObject target_variable_map = mapped_problem_variable_map(mapped_problem);
        return (SubLObject)SubLObjectFactory.makeBoolean(target_query.equal(query) && target_variable_map.equal(variable_map));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 26016L)
    public static SubLObject do_problem_link_supporting_mapped_problem_interpretations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_mapped_problem_var = (SubLObject)inference_datastructures_problem_link.NIL;
        SubLObject link = (SubLObject)inference_datastructures_problem_link.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem_link.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list102);
        supporting_mapped_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list102);
        link = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list102);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem_link.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem_link.NIL;
        SubLObject current_$1 = (SubLObject)inference_datastructures_problem_link.NIL;
        while (inference_datastructures_problem_link.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_link.$list102);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_link.$list102);
            if (inference_datastructures_problem_link.NIL == conses_high.member(current_$1, (SubLObject)inference_datastructures_problem_link.$list103, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem_link.T;
            }
            if (current_$1 == inference_datastructures_problem_link.$kw104$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem_link.NIL != bad && inference_datastructures_problem_link.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_link.$list102);
        }
        final SubLObject openP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem_link.$kw105$OPEN_, current);
        final SubLObject openP = (SubLObject)((inference_datastructures_problem_link.NIL != openP_tail) ? conses_high.cadr(openP_tail) : inference_datastructures_problem_link.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem_link.$kw106$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem_link.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem_link.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject problem_var = (SubLObject)inference_datastructures_problem_link.$sym107$PROBLEM_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_link.$sym108$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(problem_var, problem)), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_link.$sym109$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, (SubLObject)ConsesLow.list(supporting_mapped_problem_var, link, (SubLObject)inference_datastructures_problem_link.$kw105$OPEN_, openP, (SubLObject)inference_datastructures_problem_link.$kw106$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem_link.$sym110$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_link.EQ, problem_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_link.$sym111$MAPPED_PROBLEM_PROBLEM, supporting_mapped_problem_var)), ConsesLow.append(body, (SubLObject)inference_datastructures_problem_link.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 26612L)
    public static SubLObject do_problem_link_supporting_variable_map_interpretations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable_map_var = (SubLObject)inference_datastructures_problem_link.NIL;
        SubLObject link = (SubLObject)inference_datastructures_problem_link.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem_link.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list112);
        variable_map_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list112);
        link = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_link.$list112);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem_link.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem_link.NIL;
        SubLObject current_$2 = (SubLObject)inference_datastructures_problem_link.NIL;
        while (inference_datastructures_problem_link.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_link.$list112);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_link.$list112);
            if (inference_datastructures_problem_link.NIL == conses_high.member(current_$2, (SubLObject)inference_datastructures_problem_link.$list103, (SubLObject)inference_datastructures_problem_link.UNPROVIDED, (SubLObject)inference_datastructures_problem_link.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem_link.T;
            }
            if (current_$2 == inference_datastructures_problem_link.$kw104$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem_link.NIL != bad && inference_datastructures_problem_link.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_link.$list112);
        }
        final SubLObject openP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem_link.$kw105$OPEN_, current);
        final SubLObject openP = (SubLObject)((inference_datastructures_problem_link.NIL != openP_tail) ? conses_high.cadr(openP_tail) : inference_datastructures_problem_link.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem_link.$kw106$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem_link.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem_link.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject supporting_mapped_problem = (SubLObject)inference_datastructures_problem_link.$sym113$SUPPORTING_MAPPED_PROBLEM;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_link.$sym114$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS, (SubLObject)ConsesLow.list(supporting_mapped_problem, link, problem, (SubLObject)inference_datastructures_problem_link.$kw105$OPEN_, openP, (SubLObject)inference_datastructures_problem_link.$kw106$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem_link.$sym108$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(variable_map_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_link.$sym115$MAPPED_PROBLEM_VARIABLE_MAP, supporting_mapped_problem))), ConsesLow.append(body, (SubLObject)inference_datastructures_problem_link.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 27157L)
    public static SubLObject link_has_some_sibling_linkP(final SubLObject link) {
        return Numbers.numGE(inference_datastructures_problem.problem_argument_link_count(problem_link_supported_problem(link)), (SubLObject)inference_datastructures_problem_link.TWO_INTEGER);
    }
    
    public static SubLObject declare_inference_datastructures_problem_link_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_print_function_trampoline", "PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_p", "PROBLEM-LINK-P", 1, 0, false);
        new $problem_link_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "prob_link_suid", "PROB-LINK-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "prob_link_type", "PROB-LINK-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "prob_link_supported_object", "PROB-LINK-SUPPORTED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "prob_link_supporting_mapped_problems", "PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "prob_link_open_flags", "PROB-LINK-OPEN-FLAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "prob_link_data", "PROB-LINK-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "prob_link_proofs", "PROB-LINK-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "prob_link_memoization_state", "PROB-LINK-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_prob_link_suid", "_CSETF-PROB-LINK-SUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_prob_link_type", "_CSETF-PROB-LINK-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_prob_link_supported_object", "_CSETF-PROB-LINK-SUPPORTED-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_prob_link_supporting_mapped_problems", "_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_prob_link_open_flags", "_CSETF-PROB-LINK-OPEN-FLAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_prob_link_data", "_CSETF-PROB-LINK-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_prob_link_proofs", "_CSETF-PROB-LINK-PROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_prob_link_memoization_state", "_CSETF-PROB-LINK-MEMOIZATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "make_problem_link", "MAKE-PROBLEM-LINK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "visit_defstruct_problem_link", "VISIT-DEFSTRUCT-PROBLEM-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "visit_defstruct_object_problem_link_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "valid_problem_link_p", "VALID-PROBLEM-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_invalid_p", "PROBLEM-LINK-INVALID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "print_problem_link", "PRINT-PROBLEM-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "sxhash_problem_link_method", "SXHASH-PROBLEM-LINK-METHOD", 1, 0, false);
        new $sxhash_problem_link_method$UnaryFunction();
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "with_problem_link_memoization_state", "WITH-PROBLEM-LINK-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_memoization_state", "PROBLEM-LINK-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "new_problem_link", "NEW-PROBLEM-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "new_problem_link_int", "NEW-PROBLEM-LINK-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "destroy_problem_link", "DESTROY-PROBLEM-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "destroy_problem_store_link", "DESTROY-PROBLEM-STORE-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "destroy_problem_link_int", "DESTROY-PROBLEM-LINK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "note_problem_link_invalid", "NOTE-PROBLEM-LINK-INVALID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_suid", "PROBLEM-LINK-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_type", "PROBLEM-LINK-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_supported_object", "PROBLEM-LINK-SUPPORTED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_supporting_mapped_problems", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_open_flags", "PROBLEM-LINK-OPEN-FLAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_data", "PROBLEM-LINK-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "set_problem_link_open_flags", "SET-PROBLEM-LINK-OPEN-FLAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "set_problem_link_data", "SET-PROBLEM-LINK-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "add_problem_link_proof", "ADD-PROBLEM-LINK-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "remove_problem_link_proof", "REMOVE-PROBLEM-LINK-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_supporting_problems", "PROBLEM-LINK-SUPPORTING-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_store", "PROBLEM-LINK-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_has_typeP", "PROBLEM-LINK-HAS-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_supported_inference", "PROBLEM-LINK-SUPPORTED-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_supported_problem", "PROBLEM-LINK-SUPPORTED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_with_supporting_problem_p", "PROBLEM-LINK-WITH-SUPPORTING-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_with_single_supporting_problem_p", "PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_number_of_supporting_problems", "PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_supporting_mapped_problem_count", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_first_supporting_mapped_problem", "PROBLEM-LINK-FIRST-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_sole_supporting_mapped_problem", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_sole_supporting_variable_map", "PROBLEM-LINK-SOLE-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_first_supporting_problem", "PROBLEM-LINK-FIRST-SUPPORTING-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_sole_supporting_problem", "PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_find_supporting_mapped_problem_by_index", "PROBLEM-LINK-FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_openP", "PROBLEM-LINK-OPEN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_closedP", "PROBLEM-LINK-CLOSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_index_openP", "PROBLEM-LINK-INDEX-OPEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_supporting_mapped_problem_openP", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-OPEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_sole_supporting_mapped_problem_openP", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM-OPEN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "supporting_mapped_problem_open_wrt_linkP", "SUPPORTING-MAPPED-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "supporting_problem_open_wrt_linkP", "SUPPORTING-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_completely_openP", "PROBLEM-LINK-COMPLETELY-OPEN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_has_some_proofP", "PROBLEM-LINK-HAS-SOME-PROOF?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_goodP", "PROBLEM-LINK-GOOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_proofs", "PROBLEM-LINK-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_all_proofs", "PROBLEM-LINK-ALL-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_proof_count", "PROBLEM-LINK-PROOF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_destructibleP", "PROBLEM-LINK-DESTRUCTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_destructibility_status", "PROBLEM-LINK-DESTRUCTIBILITY-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "add_problem_link_supporting_mapped_problem", "ADD-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_open_all", "PROBLEM-LINK-OPEN-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_open_index", "PROBLEM-LINK-OPEN-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_open_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_open_sole_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_close_index", "PROBLEM-LINK-CLOSE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_close_all", "PROBLEM-LINK-CLOSE-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_close_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_close_sole_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "connect_supporting_mapped_problem_with_dependent_link", "CONNECT-SUPPORTING-MAPPED-PROBLEM-WITH-DEPENDENT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_to_goal_p", "PROBLEM-LINK-TO-GOAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "find_problem_link_of_type_between", "FIND-PROBLEM-LINK-OF-TYPE-BETWEEN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "link_of_type_betweenP", "LINK-OF-TYPE-BETWEEN?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "find_closed_supporting_problem_by_query", "FIND-CLOSED-SUPPORTING-PROBLEM-BY-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "find_supporting_mapped_problem_by_query_and_variable_map", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-QUERY-AND-VARIABLE-MAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "problem_link_supporting_mapped_problem_that_isnt", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-THAT-ISNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "mapped_problem_print_function_trampoline", "MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "mapped_problem_p", "MAPPED-PROBLEM-P", 1, 0, false);
        new $mapped_problem_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "mapped_prob_problem", "MAPPED-PROB-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "mapped_prob_variable_map", "MAPPED-PROB-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_mapped_prob_problem", "_CSETF-MAPPED-PROB-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "_csetf_mapped_prob_variable_map", "_CSETF-MAPPED-PROB-VARIABLE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "make_mapped_problem", "MAKE-MAPPED-PROBLEM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "visit_defstruct_mapped_problem", "VISIT-DEFSTRUCT-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "visit_defstruct_object_mapped_problem_method", "VISIT-DEFSTRUCT-OBJECT-MAPPED-PROBLEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "valid_mapped_problem_p", "VALID-MAPPED-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "mapped_problem_equal", "MAPPED-PROBLEM-EQUAL", 2, 0, false);
        new $mapped_problem_equal$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "print_mapped_problem", "PRINT-MAPPED-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "sxhash_mapped_problem_method", "SXHASH-MAPPED-PROBLEM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "closed_mapped_problem_p", "CLOSED-MAPPED-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "new_mapped_problem", "NEW-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "new_closed_mapped_problem", "NEW-CLOSED-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "destroy_problem_link_mapped_problem", "DESTROY-PROBLEM-LINK-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "destroy_mapped_problem_int", "DESTROY-MAPPED-PROBLEM-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "note_mapped_problem_invalid", "NOTE-MAPPED-PROBLEM-INVALID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "mapped_problem_problem", "MAPPED-PROBLEM-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "mapped_problem_variable_map", "MAPPED-PROBLEM-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "supporting_mapped_problem_index", "SUPPORTING-MAPPED-PROBLEM-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "find_supporting_mapped_problem_by_index", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "mapped_problem_query_as_subquery", "MAPPED-PROBLEM-QUERY-AS-SUBQUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "mapped_problem_equals_specP", "MAPPED-PROBLEM-EQUALS-SPEC?", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "do_problem_link_supporting_mapped_problem_interpretations", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "do_problem_link_supporting_variable_map_interpretations", "DO-PROBLEM-LINK-SUPPORTING-VARIABLE-MAP-INTERPRETATIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link", "link_has_some_sibling_linkP", "LINK-HAS-SOME-SIBLING-LINK?", 1, 0, false);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    public static SubLObject init_inference_datastructures_problem_link_file() {
        inference_datastructures_problem_link.$dtp_problem_link$ = SubLFiles.defconstant("*DTP-PROBLEM-LINK*", (SubLObject)inference_datastructures_problem_link.$sym0$PROBLEM_LINK);
        inference_datastructures_problem_link.$dtp_mapped_problem$ = SubLFiles.defconstant("*DTP-MAPPED-PROBLEM*", (SubLObject)inference_datastructures_problem_link.$sym81$MAPPED_PROBLEM);
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    public static SubLObject setup_inference_datastructures_problem_link_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_problem_link.$sym8$PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_datastructures_problem_link.$list9);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym10$PROB_LINK_SUID, (SubLObject)inference_datastructures_problem_link.$sym11$_CSETF_PROB_LINK_SUID);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym12$PROB_LINK_TYPE, (SubLObject)inference_datastructures_problem_link.$sym13$_CSETF_PROB_LINK_TYPE);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym14$PROB_LINK_SUPPORTED_OBJECT, (SubLObject)inference_datastructures_problem_link.$sym15$_CSETF_PROB_LINK_SUPPORTED_OBJECT);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym16$PROB_LINK_SUPPORTING_MAPPED_PROBLEMS, (SubLObject)inference_datastructures_problem_link.$sym17$_CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym18$PROB_LINK_OPEN_FLAGS, (SubLObject)inference_datastructures_problem_link.$sym19$_CSETF_PROB_LINK_OPEN_FLAGS);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym20$PROB_LINK_DATA, (SubLObject)inference_datastructures_problem_link.$sym21$_CSETF_PROB_LINK_DATA);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym22$PROB_LINK_PROOFS, (SubLObject)inference_datastructures_problem_link.$sym23$_CSETF_PROB_LINK_PROOFS);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym24$PROB_LINK_MEMOIZATION_STATE, (SubLObject)inference_datastructures_problem_link.$sym25$_CSETF_PROB_LINK_MEMOIZATION_STATE);
        Equality.identity((SubLObject)inference_datastructures_problem_link.$sym0$PROBLEM_LINK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_problem_link.$sym39$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LINK_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_problem_link.$sym46$SXHASH_PROBLEM_LINK_METHOD));
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem_link.$sym49$PROBLEM_LINK_MEMOIZATION_STATE, (SubLObject)inference_datastructures_problem_link.$sym50$WITH_PROBLEM_LINK_MEMOIZATION_STATE);
        access_macros.define_obsolete_register((SubLObject)inference_datastructures_problem_link.$sym73$PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS, (SubLObject)inference_datastructures_problem_link.$list74);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_mapped_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_problem_link.$sym88$MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_datastructures_problem_link.$list89);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym90$MAPPED_PROB_PROBLEM, (SubLObject)inference_datastructures_problem_link.$sym91$_CSETF_MAPPED_PROB_PROBLEM);
        Structures.def_csetf((SubLObject)inference_datastructures_problem_link.$sym92$MAPPED_PROB_VARIABLE_MAP, (SubLObject)inference_datastructures_problem_link.$sym93$_CSETF_MAPPED_PROB_VARIABLE_MAP);
        Equality.identity((SubLObject)inference_datastructures_problem_link.$sym81$MAPPED_PROBLEM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_mapped_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_problem_link.$sym97$VISIT_DEFSTRUCT_OBJECT_MAPPED_PROBLEM_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_mapped_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_problem_link.$sym99$SXHASH_MAPPED_PROBLEM_METHOD));
        return (SubLObject)inference_datastructures_problem_link.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inference_datastructures_problem_link_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inference_datastructures_problem_link_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inference_datastructures_problem_link_file();
    }
    
    static {
        me = (SubLFile)new inference_datastructures_problem_link();
        inference_datastructures_problem_link.$dtp_problem_link$ = null;
        inference_datastructures_problem_link.$dtp_mapped_problem$ = null;
        $sym0$PROBLEM_LINK = SubLObjectFactory.makeSymbol("PROBLEM-LINK");
        $sym1$PROBLEM_LINK_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-P");
        $int2$213 = SubLObjectFactory.makeInteger(213);
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUID"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTED-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTING-MAPPED-PROBLEMS"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-FLAGS"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"), (SubLObject)SubLObjectFactory.makeSymbol("PROOFS"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUID"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTED-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTING-MAPPED-PROBLEMS"), (SubLObject)SubLObjectFactory.makeKeyword("OPEN-FLAGS"), (SubLObject)SubLObjectFactory.makeKeyword("DATA"), (SubLObject)SubLObjectFactory.makeKeyword("PROOFS"), (SubLObject)SubLObjectFactory.makeKeyword("MEMOIZATION-STATE"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROB-LINK-SUID"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-LINK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-LINK-SUPPORTED-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-LINK-OPEN-FLAGS"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-LINK-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-LINK-PROOFS"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-LINK-MEMOIZATION-STATE"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-SUID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-SUPPORTED-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-OPEN-FLAGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-PROOFS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-MEMOIZATION-STATE"));
        $sym7$PRINT_PROBLEM_LINK = SubLObjectFactory.makeSymbol("PRINT-PROBLEM-LINK");
        $sym8$PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-LINK-P"));
        $sym10$PROB_LINK_SUID = SubLObjectFactory.makeSymbol("PROB-LINK-SUID");
        $sym11$_CSETF_PROB_LINK_SUID = SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-SUID");
        $sym12$PROB_LINK_TYPE = SubLObjectFactory.makeSymbol("PROB-LINK-TYPE");
        $sym13$_CSETF_PROB_LINK_TYPE = SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-TYPE");
        $sym14$PROB_LINK_SUPPORTED_OBJECT = SubLObjectFactory.makeSymbol("PROB-LINK-SUPPORTED-OBJECT");
        $sym15$_CSETF_PROB_LINK_SUPPORTED_OBJECT = SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-SUPPORTED-OBJECT");
        $sym16$PROB_LINK_SUPPORTING_MAPPED_PROBLEMS = SubLObjectFactory.makeSymbol("PROB-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $sym17$_CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS = SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $sym18$PROB_LINK_OPEN_FLAGS = SubLObjectFactory.makeSymbol("PROB-LINK-OPEN-FLAGS");
        $sym19$_CSETF_PROB_LINK_OPEN_FLAGS = SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-OPEN-FLAGS");
        $sym20$PROB_LINK_DATA = SubLObjectFactory.makeSymbol("PROB-LINK-DATA");
        $sym21$_CSETF_PROB_LINK_DATA = SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-DATA");
        $sym22$PROB_LINK_PROOFS = SubLObjectFactory.makeSymbol("PROB-LINK-PROOFS");
        $sym23$_CSETF_PROB_LINK_PROOFS = SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-PROOFS");
        $sym24$PROB_LINK_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("PROB-LINK-MEMOIZATION-STATE");
        $sym25$_CSETF_PROB_LINK_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("_CSETF-PROB-LINK-MEMOIZATION-STATE");
        $kw26$SUID = SubLObjectFactory.makeKeyword("SUID");
        $kw27$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw28$SUPPORTED_OBJECT = SubLObjectFactory.makeKeyword("SUPPORTED-OBJECT");
        $kw29$SUPPORTING_MAPPED_PROBLEMS = SubLObjectFactory.makeKeyword("SUPPORTING-MAPPED-PROBLEMS");
        $kw30$OPEN_FLAGS = SubLObjectFactory.makeKeyword("OPEN-FLAGS");
        $kw31$DATA = SubLObjectFactory.makeKeyword("DATA");
        $kw32$PROOFS = SubLObjectFactory.makeKeyword("PROOFS");
        $kw33$MEMOIZATION_STATE = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $str34$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw35$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym36$MAKE_PROBLEM_LINK = SubLObjectFactory.makeSymbol("MAKE-PROBLEM-LINK");
        $kw37$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw38$END = SubLObjectFactory.makeKeyword("END");
        $sym39$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LINK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-LINK-METHOD");
        $kw40$FREE = SubLObjectFactory.makeKeyword("FREE");
        $str41$_Invalid_LINK__s_ = SubLObjectFactory.makeString("<Invalid LINK ~s>");
        $str42$__a_LINK__a__a_supporting_ = SubLObjectFactory.makeString("<~a LINK ~a.~a supporting ");
        $kw43$ANSWER = SubLObjectFactory.makeKeyword("ANSWER");
        $str44$_a_ = SubLObjectFactory.makeString("~a>");
        $str45$_a__a_ = SubLObjectFactory.makeString("~a.~a>");
        $sym46$SXHASH_PROBLEM_LINK_METHOD = SubLObjectFactory.makeSymbol("SXHASH-PROBLEM-LINK-METHOD");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym48$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $sym49$PROBLEM_LINK_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("PROBLEM-LINK-MEMOIZATION-STATE");
        $sym50$WITH_PROBLEM_LINK_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-PROBLEM-LINK-MEMOIZATION-STATE");
        $sym51$PROBLEM_LINK_TYPE_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-TYPE-P");
        $str52$Can_t_call_new_problem_link_for_a = SubLObjectFactory.makeString("Can't call new-problem-link for an :answer link, call new-answer-link instead");
        $sym53$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $str54$problem_link_memoization_state = SubLObjectFactory.makeString("problem link memoization state");
        $kw55$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $kw56$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $kw57$RESIDUAL_TRANSFORMATION = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $kw58$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $kw59$JOIN = SubLObjectFactory.makeKeyword("JOIN");
        $kw60$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $kw61$UNION = SubLObjectFactory.makeKeyword("UNION");
        $kw62$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $sym63$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw64$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $kw65$STRUCTURAL = SubLObjectFactory.makeKeyword("STRUCTURAL");
        $kw66$DISJUNCTIVE = SubLObjectFactory.makeKeyword("DISJUNCTIVE");
        $kw67$CONJUNCTIVE = SubLObjectFactory.makeKeyword("CONJUNCTIVE");
        $kw68$CONNECTED_CONJUNCTION = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION");
        $kw69$LOGICAL = SubLObjectFactory.makeKeyword("LOGICAL");
        $kw70$SPLIT_RESTRICTION = SubLObjectFactory.makeKeyword("SPLIT/RESTRICTION");
        $kw71$SIMPLIFICATION = SubLObjectFactory.makeKeyword("SIMPLIFICATION");
        $kw72$REMOVAL_CONJUNCTIVE = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE");
        $sym73$PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS = SubLObjectFactory.makeSymbol("PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT"));
        $sym75$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");
        $sym76$MAPPED_PROBLEM_EQUAL = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-EQUAL");
        $kw77$PROVEN = SubLObjectFactory.makeKeyword("PROVEN");
        $kw78$DESTRUCTIBLE = SubLObjectFactory.makeKeyword("DESTRUCTIBLE");
        $kw79$INDESTRUCTIBLE = SubLObjectFactory.makeKeyword("INDESTRUCTIBLE");
        $sym80$MAPPED_PROBLEM_P = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-P");
        $sym81$MAPPED_PROBLEM = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM");
        $int82$214 = SubLObjectFactory.makeInteger(214);
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE-MAP"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPPED-PROB-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("MAPPED-PROB-VARIABLE-MAP"));
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MAPPED-PROB-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MAPPED-PROB-VARIABLE-MAP"));
        $sym87$PRINT_MAPPED_PROBLEM = SubLObjectFactory.makeSymbol("PRINT-MAPPED-PROBLEM");
        $sym88$MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-P"));
        $sym90$MAPPED_PROB_PROBLEM = SubLObjectFactory.makeSymbol("MAPPED-PROB-PROBLEM");
        $sym91$_CSETF_MAPPED_PROB_PROBLEM = SubLObjectFactory.makeSymbol("_CSETF-MAPPED-PROB-PROBLEM");
        $sym92$MAPPED_PROB_VARIABLE_MAP = SubLObjectFactory.makeSymbol("MAPPED-PROB-VARIABLE-MAP");
        $sym93$_CSETF_MAPPED_PROB_VARIABLE_MAP = SubLObjectFactory.makeSymbol("_CSETF-MAPPED-PROB-VARIABLE-MAP");
        $kw94$PROBLEM = SubLObjectFactory.makeKeyword("PROBLEM");
        $kw95$VARIABLE_MAP = SubLObjectFactory.makeKeyword("VARIABLE-MAP");
        $sym96$MAKE_MAPPED_PROBLEM = SubLObjectFactory.makeSymbol("MAKE-MAPPED-PROBLEM");
        $sym97$VISIT_DEFSTRUCT_OBJECT_MAPPED_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-MAPPED-PROBLEM-METHOD");
        $str98$_MAPPED_PROBLEM__a__a_ = SubLObjectFactory.makeString("<MAPPED PROBLEM:~a ~a>");
        $sym99$SXHASH_MAPPED_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SXHASH-MAPPED-PROBLEM-METHOD");
        $sym100$VARIABLE_MAP_P = SubLObjectFactory.makeSymbol("VARIABLE-MAP-P");
        $sym101$CLOSED_PROBLEM_P = SubLObjectFactory.makeSymbol("CLOSED-PROBLEM-P");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN?"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPEN?"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw104$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw105$OPEN_ = SubLObjectFactory.makeKeyword("OPEN?");
        $kw106$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym107$PROBLEM_VAR = SubLObjectFactory.makeUninternedSymbol("PROBLEM-VAR");
        $sym108$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym109$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = SubLObjectFactory.makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $sym110$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym111$MAPPED_PROBLEM_PROBLEM = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-PROBLEM");
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN?"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym113$SUPPORTING_MAPPED_PROBLEM = SubLObjectFactory.makeUninternedSymbol("SUPPORTING-MAPPED-PROBLEM");
        $sym114$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS = SubLObjectFactory.makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");
        $sym115$MAPPED_PROBLEM_VARIABLE_MAP = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP");
    }
    
    public static final class $problem_link_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $type;
        public SubLObject $supported_object;
        public SubLObject $supporting_mapped_problems;
        public SubLObject $open_flags;
        public SubLObject $data;
        public SubLObject $proofs;
        public SubLObject $memoization_state;
        private static final SubLStructDeclNative structDecl;
        
        public $problem_link_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$supported_object = (SubLObject)CommonSymbols.NIL;
            this.$supporting_mapped_problems = (SubLObject)CommonSymbols.NIL;
            this.$open_flags = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
            this.$proofs = (SubLObject)CommonSymbols.NIL;
            this.$memoization_state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$problem_link_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$suid;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$supported_object;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$supporting_mapped_problems;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$open_flags;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$data;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$proofs;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$memoization_state;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$supported_object = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$supporting_mapped_problems = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$open_flags = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$data = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$proofs = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$memoization_state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$problem_link_native.class, inference_datastructures_problem_link.$sym0$PROBLEM_LINK, inference_datastructures_problem_link.$sym1$PROBLEM_LINK_P, inference_datastructures_problem_link.$list3, inference_datastructures_problem_link.$list4, new String[] { "$suid", "$type", "$supported_object", "$supporting_mapped_problems", "$open_flags", "$data", "$proofs", "$memoization_state" }, inference_datastructures_problem_link.$list5, inference_datastructures_problem_link.$list6, inference_datastructures_problem_link.$sym7$PRINT_PROBLEM_LINK);
        }
    }
    
    public static final class $problem_link_p$UnaryFunction extends UnaryFunction
    {
        public $problem_link_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-LINK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_problem_link.problem_link_p(arg1);
        }
    }
    
    public static final class $sxhash_problem_link_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_problem_link_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-PROBLEM-LINK-METHOD"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_problem_link.sxhash_problem_link_method(arg1);
        }
    }
    
    public static final class $mapped_problem_native extends SubLStructNative
    {
        public SubLObject $problem;
        public SubLObject $variable_map;
        private static final SubLStructDeclNative structDecl;
        
        public $mapped_problem_native() {
            this.$problem = (SubLObject)CommonSymbols.NIL;
            this.$variable_map = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$mapped_problem_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$problem;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$variable_map;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$problem = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$variable_map = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$mapped_problem_native.class, inference_datastructures_problem_link.$sym81$MAPPED_PROBLEM, inference_datastructures_problem_link.$sym80$MAPPED_PROBLEM_P, inference_datastructures_problem_link.$list83, inference_datastructures_problem_link.$list84, new String[] { "$problem", "$variable_map" }, inference_datastructures_problem_link.$list85, inference_datastructures_problem_link.$list86, inference_datastructures_problem_link.$sym87$PRINT_MAPPED_PROBLEM);
        }
    }
    
    public static final class $mapped_problem_p$UnaryFunction extends UnaryFunction
    {
        public $mapped_problem_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MAPPED-PROBLEM-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_problem_link.mapped_problem_p(arg1);
        }
    }
    
    public static final class $mapped_problem_equal$BinaryFunction extends BinaryFunction
    {
        public $mapped_problem_equal$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MAPPED-PROBLEM-EQUAL"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return inference_datastructures_problem_link.mapped_problem_equal(arg1, arg2);
        }
    }
}

/*

	Total time: 410 ms
	
*/