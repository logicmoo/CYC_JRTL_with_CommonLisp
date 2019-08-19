package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_datastructures_problem_link extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link";
    public static String myFingerPrint = "3ef675d0c7db161ff170f9b1f9557d7e48f535b52ee7ad35109852ef4a6a86a0";
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLSymbol $dtp_problem_link$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLSymbol $dtp_mapped_problem$;
    private static SubLSymbol $sym0$PROBLEM_LINK;
    private static SubLSymbol $sym1$PROBLEM_LINK_P;
    private static SubLInteger $int$213;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLList $list6;
    private static SubLSymbol $sym7$PRINT_PROBLEM_LINK;
    private static SubLSymbol $sym8$PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list9;
    private static SubLSymbol $sym10$PROB_LINK_SUID;
    private static SubLSymbol $sym11$_CSETF_PROB_LINK_SUID;
    private static SubLSymbol $sym12$PROB_LINK_TYPE;
    private static SubLSymbol $sym13$_CSETF_PROB_LINK_TYPE;
    private static SubLSymbol $sym14$PROB_LINK_SUPPORTED_OBJECT;
    private static SubLSymbol $sym15$_CSETF_PROB_LINK_SUPPORTED_OBJECT;
    private static SubLSymbol $sym16$PROB_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static SubLSymbol $sym17$_CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static SubLSymbol $sym18$PROB_LINK_OPEN_FLAGS;
    private static SubLSymbol $sym19$_CSETF_PROB_LINK_OPEN_FLAGS;
    private static SubLSymbol $sym20$PROB_LINK_DATA;
    private static SubLSymbol $sym21$_CSETF_PROB_LINK_DATA;
    private static SubLSymbol $sym22$PROB_LINK_PROOFS;
    private static SubLSymbol $sym23$_CSETF_PROB_LINK_PROOFS;
    private static SubLSymbol $sym24$PROB_LINK_MEMOIZATION_STATE;
    private static SubLSymbol $sym25$_CSETF_PROB_LINK_MEMOIZATION_STATE;
    private static SubLSymbol $SUID;
    private static SubLSymbol $TYPE;
    private static SubLSymbol $SUPPORTED_OBJECT;
    private static SubLSymbol $SUPPORTING_MAPPED_PROBLEMS;
    private static SubLSymbol $OPEN_FLAGS;
    private static SubLSymbol $DATA;
    private static SubLSymbol $PROOFS;
    private static SubLSymbol $MEMOIZATION_STATE;
    private static SubLString $str34$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym36$MAKE_PROBLEM_LINK;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym39$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LINK_METHOD;
    private static SubLSymbol $FREE;
    private static SubLString $str41$_Invalid_LINK__s_;
    private static SubLString $str42$__a_LINK__a__a_supporting_;
    private static SubLSymbol $ANSWER;
    private static SubLString $str44$_a_;
    private static SubLString $str45$_a__a_;
    private static SubLSymbol $sym46$SXHASH_PROBLEM_LINK_METHOD;
    private static SubLList $list47;
    private static SubLSymbol $sym48$WITH_MEMOIZATION_STATE;
    private static SubLSymbol $sym49$PROBLEM_LINK_MEMOIZATION_STATE;
    private static SubLSymbol $sym50$WITH_PROBLEM_LINK_MEMOIZATION_STATE;
    private static SubLSymbol $sym51$PROBLEM_LINK_TYPE_P;
    private static SubLString $str52$Can_t_call_new_problem_link_for_a;
    private static SubLSymbol $sym53$PROBLEM_P;
    private static SubLString $str54$problem_link_memoization_state;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $RESIDUAL_TRANSFORMATION;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $JOIN;
    private static SubLSymbol $SPLIT;
    private static SubLSymbol $UNION;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $sym63$INTEGERP;
    private static SubLSymbol $CONTENT;
    private static SubLSymbol $STRUCTURAL;
    private static SubLSymbol $DISJUNCTIVE;
    private static SubLSymbol $CONJUNCTIVE;
    private static SubLSymbol $CONNECTED_CONJUNCTION;
    private static SubLSymbol $LOGICAL;
    private static SubLSymbol $SPLIT_RESTRICTION;
    private static SubLSymbol $SIMPLIFICATION;
    private static SubLSymbol $REMOVAL_CONJUNCTIVE;
    private static SubLSymbol $sym73$PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS;
    private static SubLList $list74;
    private static SubLSymbol $sym75$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P;
    private static SubLSymbol $sym76$MAPPED_PROBLEM_EQUAL;
    private static SubLSymbol $PROVEN;
    private static SubLSymbol $DESTRUCTIBLE;
    private static SubLSymbol $INDESTRUCTIBLE;
    private static SubLSymbol $sym80$MAPPED_PROBLEM_P;
    private static SubLSymbol $sym81$MAPPED_PROBLEM;
    private static SubLInteger $int$214;
    private static SubLList $list83;
    private static SubLList $list84;
    private static SubLList $list85;
    private static SubLList $list86;
    private static SubLSymbol $sym87$PRINT_MAPPED_PROBLEM;
    private static SubLSymbol $sym88$MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list89;
    private static SubLSymbol $sym90$MAPPED_PROB_PROBLEM;
    private static SubLSymbol $sym91$_CSETF_MAPPED_PROB_PROBLEM;
    private static SubLSymbol $sym92$MAPPED_PROB_VARIABLE_MAP;
    private static SubLSymbol $sym93$_CSETF_MAPPED_PROB_VARIABLE_MAP;
    private static SubLSymbol $PROBLEM;
    private static SubLSymbol $VARIABLE_MAP;
    private static SubLSymbol $sym96$MAKE_MAPPED_PROBLEM;
    private static SubLSymbol $sym97$VISIT_DEFSTRUCT_OBJECT_MAPPED_PROBLEM_METHOD;
    private static SubLString $str98$_MAPPED_PROBLEM__a__a_;
    private static SubLSymbol $sym99$SXHASH_MAPPED_PROBLEM_METHOD;
    private static SubLSymbol $sym100$VARIABLE_MAP_P;
    private static SubLSymbol $sym101$CLOSED_PROBLEM_P;
    private static SubLList $list102;
    private static SubLList $list103;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $OPEN_;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym107$PROBLEM_VAR;
    private static SubLSymbol $sym108$CLET;
    private static SubLSymbol $sym109$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static SubLSymbol $sym110$PWHEN;
    private static SubLSymbol $sym111$MAPPED_PROBLEM_PROBLEM;
    private static SubLList $list112;
    private static SubLSymbol $sym113$SUPPORTING_MAPPED_PROBLEM;
    private static SubLSymbol $sym114$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS;
    private static SubLSymbol $sym115$MAPPED_PROBLEM_VARIABLE_MAP;

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject problem_link_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_problem_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject problem_link_p(SubLObject v_object) {
        return (v_object.getClass() == $problem_link_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject prob_link_suid(SubLObject v_object) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject prob_link_type(SubLObject v_object) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject prob_link_supported_object(SubLObject v_object) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject prob_link_supporting_mapped_problems(SubLObject v_object) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject prob_link_open_flags(SubLObject v_object) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject prob_link_data(SubLObject v_object) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject prob_link_proofs(SubLObject v_object) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject prob_link_memoization_state(SubLObject v_object) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject _csetf_prob_link_suid(SubLObject v_object, SubLObject value) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject _csetf_prob_link_type(SubLObject v_object, SubLObject value) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject _csetf_prob_link_supported_object(SubLObject v_object, SubLObject value) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject _csetf_prob_link_supporting_mapped_problems(SubLObject v_object, SubLObject value) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject _csetf_prob_link_open_flags(SubLObject v_object, SubLObject value) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject _csetf_prob_link_data(SubLObject v_object, SubLObject value) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject _csetf_prob_link_proofs(SubLObject v_object, SubLObject value) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject _csetf_prob_link_memoization_state(SubLObject v_object, SubLObject value) {
        assert NIL != problem_link_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject make_problem_link(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $problem_link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_prob_link_suid(v_new, current_value);
            } else if (pcase_var.eql($TYPE)) {
                _csetf_prob_link_type(v_new, current_value);
            } else if (pcase_var.eql($SUPPORTED_OBJECT)) {
                _csetf_prob_link_supported_object(v_new, current_value);
            } else if (pcase_var.eql($SUPPORTING_MAPPED_PROBLEMS)) {
                _csetf_prob_link_supporting_mapped_problems(v_new, current_value);
            } else if (pcase_var.eql($OPEN_FLAGS)) {
                _csetf_prob_link_open_flags(v_new, current_value);
            } else if (pcase_var.eql($DATA)) {
                _csetf_prob_link_data(v_new, current_value);
            } else if (pcase_var.eql($PROOFS)) {
                _csetf_prob_link_proofs(v_new, current_value);
            } else if (pcase_var.eql($MEMOIZATION_STATE)) {
                _csetf_prob_link_memoization_state(v_new, current_value);
            } else {
                Errors.error($str34$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject visit_defstruct_problem_link(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym36$MAKE_PROBLEM_LINK, EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $SUID, prob_link_suid(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TYPE, prob_link_type(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SUPPORTED_OBJECT, prob_link_supported_object(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SUPPORTING_MAPPED_PROBLEMS, prob_link_supporting_mapped_problems(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $OPEN_FLAGS, prob_link_open_flags(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DATA, prob_link_data(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROOFS, prob_link_proofs(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE, prob_link_memoization_state(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym36$MAKE_PROBLEM_LINK, EIGHT_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1100L)
    public static SubLObject visit_defstruct_object_problem_link_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_problem_link(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 2200L)
    public static SubLObject valid_problem_link_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_link_p(v_object) && NIL == problem_link_invalid_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 2300L)
    public static SubLObject problem_link_invalid_p(SubLObject problem_link) {
        return Equality.eq($FREE, problem_link_type(problem_link));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 2500L)
    public static SubLObject print_problem_link(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != problem_link_invalid_p(v_object)) {
            PrintLow.format(stream, $str41$_Invalid_LINK__s_, prob_link_suid(v_object));
        } else {
            SubLObject store_suid = inference_datastructures_problem_store.problem_store_suid(problem_link_store(v_object));
            SubLObject type = problem_link_type(v_object);
            PrintLow.format(stream, $str42$__a_LINK__a__a_supporting_, new SubLObject[] { type, store_suid, problem_link_suid(v_object) });
            if ($ANSWER == type) {
                PrintLow.format(stream, $str44$_a_, problem_link_supported_inference(v_object));
            } else {
                PrintLow.format(stream, $str45$_a__a_, store_suid, inference_datastructures_problem.problem_suid(problem_link_supported_problem(v_object)));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3100L)
    public static SubLObject sxhash_problem_link_method(SubLObject v_object) {
        return prob_link_suid(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3200L)
    public static SubLObject with_problem_link_memoization_state(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_link = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        problem_link = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym48$WITH_MEMOIZATION_STATE, list(list($sym49$PROBLEM_LINK_MEMOIZATION_STATE, problem_link)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3500L)
    public static SubLObject problem_link_memoization_state(SubLObject problem_link) {
        return prob_link_memoization_state(problem_link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3700L)
    public static SubLObject new_problem_link(SubLObject type, SubLObject supported_problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_enumerated_types.problem_link_type_p(type) : type;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && $ANSWER == type) {
            Errors.error($str52$Can_t_call_new_problem_link_for_a);
        }
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        SubLObject link = new_problem_link_int(supported_problem, type);
        inference_datastructures_problem.add_problem_argument_link(supported_problem, link);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 4200L)
    public static SubLObject new_problem_link_int(SubLObject supported_object, SubLObject type) {
        SubLObject link = make_problem_link(UNPROVIDED);
        _csetf_prob_link_type(link, type);
        _csetf_prob_link_supported_object(link, supported_object);
        SubLObject store = problem_link_store(link);
        SubLObject suid = inference_datastructures_problem_store.problem_store_new_link_id(store);
        inference_metrics.increment_problem_link_type_historical_counts(type);
        _csetf_prob_link_suid(link, suid);
        _csetf_prob_link_supporting_mapped_problems(link, NIL);
        _csetf_prob_link_open_flags(link, ZERO_INTEGER);
        _csetf_prob_link_memoization_state(link, memoization_state.new_memoization_state($str54$problem_link_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        inference_datastructures_problem_store.add_problem_store_link(store, link);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 4900L)
    public static SubLObject destroy_problem_link(SubLObject link) {
        if (NIL != valid_problem_link_p(link)) {
            SubLObject type = problem_link_type(link);
            SubLObject store = problem_link_store(link);
            note_problem_link_invalid(link);
            SubLObject pcase_var = type;
            if (pcase_var.eql($ANSWER)) {
                SubLObject inference = problem_link_supported_object(link);
                if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                    inference_datastructures_inference.destroy_inference(inference);
                }
            } else if (pcase_var.eql($REMOVAL)) {
                inference_worker_removal.destroy_removal_link(link);
            } else if (pcase_var.eql($TRANSFORMATION)) {
                inference_worker_transformation.destroy_transformation_link(link);
            } else if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
                inference_worker_residual_transformation.destroy_residual_transformation_link(link);
            } else if (pcase_var.eql($JOIN_ORDERED)) {
                inference_worker_join_ordered.destroy_join_ordered_link(link);
            } else if (pcase_var.eql($JOIN)) {
                inference_worker_join.destroy_join_link(link);
            } else if (pcase_var.eql($SPLIT)) {
                inference_worker_split.destroy_split_link(link);
            } else if (pcase_var.eql($UNION)) {
                inference_worker_union.destroy_union_link(link);
            } else if (pcase_var.eql($RESTRICTION)) {
                inference_worker_restriction.destroy_restriction_link(link);
            }
            if ($ANSWER != type) {
                SubLObject cdolist_list_var;
                SubLObject doomed_proofs = cdolist_list_var = problem_link_all_proofs(link);
                SubLObject proof = NIL;
                proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
                        inference_datastructures_proof.destroy_proof(proof);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                    SubLObject supporting_problem = mapped_problem_problem(supporting_mapped_problem);
                    SubLObject variable_map = mapped_problem_variable_map(supporting_mapped_problem);
                    if (NIL != inference_datastructures_problem.valid_problem_p(supporting_problem)) {
                        inference_datastructures_problem.remove_problem_dependent_link(supporting_problem, link);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
            if ($ANSWER != type) {
                SubLObject supported_problem = problem_link_supported_problem(link);
                if (NIL != inference_datastructures_problem.valid_problem_p(supported_problem)) {
                    inference_datastructures_problem.remove_problem_argument_link(supported_problem, link);
                }
            }
            inference_datastructures_problem_store.remove_problem_store_link(store, link);
            _csetf_prob_link_memoization_state(link, $FREE);
            return destroy_problem_link_int(link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 6600L)
    public static SubLObject destroy_problem_store_link(SubLObject link) {
        if (NIL != valid_problem_link_p(link)) {
            note_problem_link_invalid(link);
            return destroy_problem_link_int(link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 6800L)
    public static SubLObject destroy_problem_link_int(SubLObject link) {
        _csetf_prob_link_data(link, $FREE);
        _csetf_prob_link_open_flags(link, $FREE);
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject mapped_problem = NIL;
        mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, mapped_problem)) {
                destroy_problem_link_mapped_problem(mapped_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        }
        _csetf_prob_link_supporting_mapped_problems(link, $FREE);
        _csetf_prob_link_supported_object(link, $FREE);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7200L)
    public static SubLObject note_problem_link_invalid(SubLObject link) {
        _csetf_prob_link_type(link, $FREE);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7300L)
    public static SubLObject problem_link_suid(SubLObject link) {
        assert NIL != problem_link_p(link) : link;
        return prob_link_suid(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7500L)
    public static SubLObject problem_link_type(SubLObject link) {
        assert NIL != problem_link_p(link) : link;
        return prob_link_type(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7600L)
    public static SubLObject problem_link_supported_object(SubLObject link) {
        assert NIL != problem_link_p(link) : link;
        return prob_link_supported_object(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7700L)
    public static SubLObject problem_link_supporting_mapped_problems(SubLObject link) {
        assert NIL != problem_link_p(link) : link;
        return prob_link_supporting_mapped_problems(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7900L)
    public static SubLObject problem_link_open_flags(SubLObject link) {
        assert NIL != problem_link_p(link) : link;
        return prob_link_open_flags(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8000L)
    public static SubLObject problem_link_data(SubLObject link) {
        assert NIL != problem_link_p(link) : link;
        return prob_link_data(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8100L)
    public static SubLObject set_problem_link_open_flags(SubLObject link, SubLObject flags) {
        assert NIL != problem_link_p(link) : link;
        assert NIL != Types.integerp(flags) : flags;
        _csetf_prob_link_open_flags(link, flags);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8300L)
    public static SubLObject set_problem_link_data(SubLObject link, SubLObject data) {
        assert NIL != problem_link_p(link) : link;
        _csetf_prob_link_data(link, data);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8400L)
    public static SubLObject add_problem_link_proof(SubLObject link, SubLObject proof) {
        SubLObject proofs = prob_link_proofs(link);
        if (NIL == conses_high.member(proof, proofs, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
            proofs = cons(proof, proofs);
        }
        _csetf_prob_link_proofs(link, proofs);
        return proofs;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8600L)
    public static SubLObject remove_problem_link_proof(SubLObject link, SubLObject old_proof) {
        if (NIL != valid_problem_link_p(link)) {
            SubLObject proofs = prob_link_proofs(link);
            proofs = Sequences.delete(old_proof, proofs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            _csetf_prob_link_proofs(link, proofs);
            return proofs;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8900L)
    public static SubLObject problem_link_supporting_problems(SubLObject link) {
        SubLObject problems = NIL;
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                problems = cons(mapped_problem_problem(supporting_mapped_problem), problems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return Sequences.nreverse(problems);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 9200L)
    public static SubLObject problem_link_store(SubLObject link) {
        if (NIL != inference_worker_answer.answer_link_p(link)) {
            return inference_datastructures_inference.inference_problem_store(problem_link_supported_inference(link));
        }
        return inference_datastructures_problem.problem_store(problem_link_supported_problem(link));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 9500L)
    public static SubLObject problem_link_has_typeP(SubLObject link, SubLObject type) {
        if (type.eql($CONTENT)) {
            return inference_worker.content_link_p(link);
        }
        if (type.eql($STRUCTURAL)) {
            return inference_worker.structural_link_p(link);
        }
        if (type.eql($DISJUNCTIVE)) {
            return inference_worker.disjunctive_link_p(link);
        }
        if (type.eql($CONJUNCTIVE)) {
            return inference_worker.conjunctive_link_p(link);
        }
        if (type.eql($CONNECTED_CONJUNCTION)) {
            return inference_worker.connected_conjunction_link_p(link);
        }
        if (type.eql($LOGICAL)) {
            return inference_worker.logical_link_p(link);
        }
        if (type.eql($SPLIT_RESTRICTION)) {
            return makeBoolean(NIL != inference_worker_split.split_link_p(link) || NIL != inference_worker_restriction.restriction_link_p(link));
        }
        if (type.eql($SIMPLIFICATION)) {
            return inference_worker_restriction.simplification_link_p(link);
        }
        if (type.eql($REMOVAL_CONJUNCTIVE)) {
            return inference_worker_removal.conjunctive_removal_link_p(link);
        }
        return Equality.eq(type, problem_link_type(link));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10200L)
    public static SubLObject problem_link_supported_inference(SubLObject link) {
        if (NIL != inference_worker_answer.answer_link_p(link)) {
            return problem_link_supported_object(link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10300L)
    public static SubLObject problem_link_supported_problem(SubLObject link) {
        if (NIL == inference_worker_answer.answer_link_p(link)) {
            return problem_link_supported_object(link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10500L)
    public static SubLObject problem_link_with_supporting_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_link_p(v_object) && NIL != list_utilities.sublisp_boolean(problem_link_supporting_mapped_problems(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10700L)
    public static SubLObject problem_link_with_single_supporting_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_link_p(v_object) && NIL != list_utilities.singletonP(problem_link_supporting_mapped_problems(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10900L)
    public static SubLObject problem_link_number_of_supporting_problems(SubLObject link) {
        return problem_link_supporting_mapped_problem_count(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11100L)
    public static SubLObject problem_link_supporting_mapped_problem_count(SubLObject link) {
        return Sequences.length(problem_link_supporting_mapped_problems(link));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11300L)
    public static SubLObject problem_link_first_supporting_mapped_problem(SubLObject link) {
        return problem_link_supporting_mapped_problems(link).first();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11400L)
    public static SubLObject problem_link_sole_supporting_mapped_problem(SubLObject link) {
        assert NIL != problem_link_with_single_supporting_problem_p(link) : link;
        return problem_link_first_supporting_mapped_problem(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11600L)
    public static SubLObject problem_link_sole_supporting_variable_map(SubLObject link) {
        SubLObject mapped_problem = problem_link_sole_supporting_mapped_problem(link);
        return mapped_problem_variable_map(mapped_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11800L)
    public static SubLObject problem_link_first_supporting_problem(SubLObject link) {
        return mapped_problem_problem(problem_link_first_supporting_mapped_problem(link));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12000L)
    public static SubLObject problem_link_sole_supporting_problem(SubLObject link) {
        return mapped_problem_problem(problem_link_sole_supporting_mapped_problem(link));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12300L)
    public static SubLObject problem_link_find_supporting_mapped_problem_by_index(SubLObject link, SubLObject index) {
        return nth(index, problem_link_supporting_mapped_problems(link));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12400L)
    public static SubLObject problem_link_openP(SubLObject link) {
        return makeBoolean(!problem_link_open_flags(link).isZero());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12500L)
    public static SubLObject problem_link_closedP(SubLObject link) {
        return makeBoolean(NIL == problem_link_openP(link));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12600L)
    public static SubLObject problem_link_index_openP(SubLObject link, SubLObject index) {
        SubLObject flags = problem_link_open_flags(link);
        return number_utilities.get_bit(flags, index);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12800L)
    public static SubLObject problem_link_supporting_mapped_problem_openP(SubLObject link, SubLObject supporting_mapped_problem) {
        SubLObject index = Sequences.position(supporting_mapped_problem, problem_link_supporting_mapped_problems(link), $sym76$MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return problem_link_index_openP(link, index);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 13000L)
    public static SubLObject problem_link_sole_supporting_mapped_problem_openP(SubLObject link) {
        assert NIL != problem_link_with_single_supporting_problem_p(link) : link;
        return problem_link_index_openP(link, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 13200L)
    public static SubLObject supporting_mapped_problem_open_wrt_linkP(SubLObject supporting_mapped_problem, SubLObject link) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject candidate_supporting_mapped_problem = NIL;
        candidate_supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(T, link, candidate_supporting_mapped_problem) && candidate_supporting_mapped_problem.eql(supporting_mapped_problem)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 13600L)
    public static SubLObject supporting_problem_open_wrt_linkP(SubLObject supporting_problem, SubLObject link) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(T, link, supporting_mapped_problem)) {
                SubLObject candidate_supporting_problem = mapped_problem_problem(supporting_mapped_problem);
                SubLObject variable_map = mapped_problem_variable_map(supporting_mapped_problem);
                if (candidate_supporting_problem.eql(supporting_problem)) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14000L)
    public static SubLObject problem_link_completely_openP(SubLObject link) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem) && NIL == problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14200L)
    public static SubLObject problem_link_has_some_proofP(SubLObject problem_link, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        assert NIL != problem_link_p(problem_link) : problem_link;
        SubLObject cdolist_list_var = problem_link_proofs(problem_link);
        SubLObject proof = NIL;
        proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, proof_status)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14500L)
    public static SubLObject problem_link_goodP(SubLObject link) {
        return problem_link_has_some_proofP(link, $PROVEN);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14600L)
    public static SubLObject problem_link_proofs(SubLObject link) {
        return prob_link_proofs(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14600L)
    public static SubLObject problem_link_all_proofs(SubLObject link) {
        return problem_link_proofs(link);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14700L)
    public static SubLObject problem_link_proof_count(SubLObject link) {
        assert NIL != problem_link_p(link) : link;
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_link_proofs(link);
        SubLObject proof = NIL;
        proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, NIL)) {
                count = Numbers.add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 14900L)
    public static SubLObject problem_link_destructibleP(SubLObject link) {
        return inference_datastructures_enumerated_types.destructibility_status_destructibleP(problem_link_destructibility_status(link));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 15100L)
    public static SubLObject problem_link_destructibility_status(SubLObject link) {
        if (NIL == inference_worker_answer.answer_link_p(link)) {
            if (NIL != inference_datastructures_problem.problem_destructibleP(problem_link_supported_problem(link))) {
                return $DESTRUCTIBLE;
            }
            SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                    SubLObject supporting_problem = mapped_problem_problem(supporting_mapped_problem);
                    SubLObject variable_map = mapped_problem_variable_map(supporting_mapped_problem);
                    if (NIL != inference_datastructures_problem.problem_destructibleP(supporting_problem)) {
                        return $DESTRUCTIBLE;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return $INDESTRUCTIBLE;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 15600L)
    public static SubLObject add_problem_link_supporting_mapped_problem(SubLObject link, SubLObject supporting_mapped_problem) {
        assert NIL != problem_link_p(link) : link;
        assert NIL != mapped_problem_p(supporting_mapped_problem) : supporting_mapped_problem;
        _csetf_prob_link_supporting_mapped_problems(link, cons(supporting_mapped_problem, prob_link_supporting_mapped_problems(link)));
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 15900L)
    public static SubLObject problem_link_open_all(SubLObject link) {
        SubLObject supporting_mapped_problem_count = problem_link_supporting_mapped_problem_count(link);
        SubLObject flags = ZERO_INTEGER;
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; index.numL(supporting_mapped_problem_count); index = Numbers.add(index, ONE_INTEGER)) {
            flags = number_utilities.set_bit(flags, index, T);
        }
        set_problem_link_open_flags(link, flags);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16300L)
    public static SubLObject problem_link_open_index(SubLObject link, SubLObject index) {
        SubLObject flags = problem_link_open_flags(link);
        flags = number_utilities.set_bit(flags, index, T);
        set_problem_link_open_flags(link, flags);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16500L)
    public static SubLObject problem_link_open_supporting_mapped_problem(SubLObject link, SubLObject supporting_mapped_problem) {
        SubLObject index = Sequences.position(supporting_mapped_problem, problem_link_supporting_mapped_problems(link), $sym76$MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return (NIL != index) ? problem_link_open_index(link, index) : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16800L)
    public static SubLObject problem_link_open_sole_supporting_mapped_problem(SubLObject link) {
        assert NIL != problem_link_with_single_supporting_problem_p(link) : link;
        return problem_link_open_index(link, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16900L)
    public static SubLObject problem_link_close_index(SubLObject link, SubLObject index) {
        SubLObject flags = problem_link_open_flags(link);
        flags = number_utilities.set_bit(flags, index, NIL);
        set_problem_link_open_flags(link, flags);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17100L)
    public static SubLObject problem_link_close_all(SubLObject link) {
        set_problem_link_open_flags(link, ZERO_INTEGER);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17200L)
    public static SubLObject problem_link_close_supporting_mapped_problem(SubLObject link, SubLObject supporting_mapped_problem) {
        SubLObject index = Sequences.position(supporting_mapped_problem, problem_link_supporting_mapped_problems(link), $sym76$MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return problem_link_close_index(link, index);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17500L)
    public static SubLObject problem_link_close_sole_supporting_mapped_problem(SubLObject link) {
        assert NIL != problem_link_with_single_supporting_problem_p(link) : link;
        return problem_link_close_index(link, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17700L)
    public static SubLObject connect_supporting_mapped_problem_with_dependent_link(SubLObject supporting_mapped_problem, SubLObject link) {
        assert NIL != mapped_problem_p(supporting_mapped_problem) : supporting_mapped_problem;
        assert NIL != problem_link_p(link) : link;
        add_problem_link_supporting_mapped_problem(link, supporting_mapped_problem);
        inference_datastructures_problem.add_problem_dependent_link(mapped_problem_problem(supporting_mapped_problem), link);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 18200L)
    public static SubLObject problem_link_to_goal_p(SubLObject link) {
        SubLObject supporting_mapped_problems = problem_link_supporting_mapped_problems(link);
        return Types.sublisp_null(supporting_mapped_problems);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 18500L)
    public static SubLObject find_problem_link_of_type_between(SubLObject type, SubLObject supported_problem, SubLObject supporting_mapped_problem) {
        assert NIL != inference_datastructures_enumerated_types.problem_link_type_p(type) : type;
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        assert NIL != mapped_problem_p(supporting_mapped_problem) : supporting_mapped_problem;
        SubLObject existing_link = NIL;
        SubLObject problem_var;
        SubLObject supporting_problem = problem_var = mapped_problem_problem(supporting_mapped_problem);
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject link_var;
        SubLObject rest;
        SubLObject candidate_supporting_mapped_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == existing_link
                && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link) && NIL != problem_link_has_typeP(dependent_link, type)) {
                link_var = dependent_link;
                for (rest = NIL, rest = problem_link_supporting_mapped_problems(link_var); NIL == existing_link && NIL != rest; rest = rest.rest()) {
                    candidate_supporting_mapped_problem = rest.first();
                    if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, candidate_supporting_mapped_problem) && problem_var.eql(mapped_problem_problem(candidate_supporting_mapped_problem)) && supported_problem.eql(problem_link_supported_problem(dependent_link))
                            && NIL != mapped_problem_equal(supporting_mapped_problem, candidate_supporting_mapped_problem)) {
                        existing_link = dependent_link;
                    }
                }
            }
        }
        return existing_link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 19500L)
    public static SubLObject link_of_type_betweenP(SubLObject link_type, SubLObject supported_problem, SubLObject supporting_problem) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL != problem_link_has_typeP(link, link_type) && supported_problem.eql(problem_link_supported_problem(link))) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 20000L)
    public static SubLObject find_closed_supporting_problem_by_query(SubLObject link, SubLObject query) {
        SubLObject mapped_problem = find_supporting_mapped_problem_by_query_and_variable_map(link, query, NIL);
        return (NIL != mapped_problem) ? mapped_problem_problem(mapped_problem) : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 20300L)
    public static SubLObject find_supporting_mapped_problem_by_query_and_variable_map(SubLObject link, SubLObject query, SubLObject variable_map) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject mapped_problem = NIL;
        mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, mapped_problem) && NIL != mapped_problem_equals_specP(mapped_problem, query, variable_map)) {
                return mapped_problem;
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 20700L)
    public static SubLObject problem_link_supporting_mapped_problem_that_isnt(SubLObject link, SubLObject wrong_mapped_problem) {
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem) && !supporting_mapped_problem.eql(wrong_mapped_problem)) {
                return supporting_mapped_problem;
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLObject mapped_problem_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_mapped_problem(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLObject mapped_problem_p(SubLObject v_object) {
        return (v_object.getClass() == $mapped_problem_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLObject mapped_prob_problem(SubLObject v_object) {
        assert NIL != mapped_problem_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLObject mapped_prob_variable_map(SubLObject v_object) {
        assert NIL != mapped_problem_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLObject _csetf_mapped_prob_problem(SubLObject v_object, SubLObject value) {
        assert NIL != mapped_problem_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLObject _csetf_mapped_prob_variable_map(SubLObject v_object, SubLObject value) {
        assert NIL != mapped_problem_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLObject make_mapped_problem(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $mapped_problem_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PROBLEM)) {
                _csetf_mapped_prob_problem(v_new, current_value);
            } else if (pcase_var.eql($VARIABLE_MAP)) {
                _csetf_mapped_prob_variable_map(v_new, current_value);
            } else {
                Errors.error($str34$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLObject visit_defstruct_mapped_problem(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym96$MAKE_MAPPED_PROBLEM, TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM, mapped_prob_problem(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $VARIABLE_MAP, mapped_prob_variable_map(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym96$MAKE_MAPPED_PROBLEM, TWO_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21300L)
    public static SubLObject visit_defstruct_object_mapped_problem_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_mapped_problem(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21700L)
    public static SubLObject valid_mapped_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != mapped_problem_p(v_object) && $FREE != mapped_problem_variable_map(v_object) && NIL != inference_datastructures_problem.valid_problem_p(mapped_problem_problem(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21900L)
    public static SubLObject mapped_problem_equal(SubLObject mapped_problem1, SubLObject mapped_problem2) {
        if (mapped_problem1.eql(mapped_problem2)) {
            return T;
        }
        SubLObject problem1 = mapped_problem_problem(mapped_problem1);
        SubLObject problem2 = mapped_problem_problem(mapped_problem2);
        if (!problem1.eql(problem2)) {
            return NIL;
        }
        SubLObject variable_map1 = mapped_problem_variable_map(mapped_problem1);
        SubLObject variable_map2 = mapped_problem_variable_map(mapped_problem2);
        return Equality.equal(variable_map1, variable_map2);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 22400L)
    public static SubLObject print_mapped_problem(SubLObject v_object, SubLObject stream, SubLObject depth) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_mapped_problem_p(v_object)) {
            PrintLow.format(stream, $str98$_MAPPED_PROBLEM__a__a_, mapped_problem_problem(v_object), mapped_problem_variable_map(v_object));
        } else if (NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, NIL, NIL);
            print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 22700L)
    public static SubLObject sxhash_mapped_problem_method(SubLObject v_object) {
        return Numbers.logxor(Sxhash.sxhash(mapped_prob_problem(v_object)), Sxhash.sxhash(mapped_prob_variable_map(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 22900L)
    public static SubLObject closed_mapped_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != mapped_problem_p(v_object) && NIL != inference_datastructures_problem.closed_problem_p(mapped_problem_problem(v_object)) && NIL == mapped_problem_variable_map(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23200L)
    public static SubLObject new_mapped_problem(SubLObject problem, SubLObject variable_map) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert NIL != bindings.variable_map_p(variable_map) : variable_map;
        SubLObject mapped_problem = make_mapped_problem(UNPROVIDED);
        _csetf_mapped_prob_problem(mapped_problem, problem);
        _csetf_mapped_prob_variable_map(mapped_problem, variable_map);
        return mapped_problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23600L)
    public static SubLObject new_closed_mapped_problem(SubLObject problem) {
        assert NIL != inference_datastructures_problem.closed_problem_p(problem) : problem;
        return new_mapped_problem(problem, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23700L)
    public static SubLObject destroy_problem_link_mapped_problem(SubLObject mapped_problem) {
        if (NIL != valid_mapped_problem_p(mapped_problem)) {
            note_mapped_problem_invalid(mapped_problem);
            return destroy_mapped_problem_int(mapped_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23900L)
    public static SubLObject destroy_mapped_problem_int(SubLObject mapped_problem) {
        _csetf_mapped_prob_problem(mapped_problem, $FREE);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24100L)
    public static SubLObject note_mapped_problem_invalid(SubLObject mapped_problem) {
        _csetf_mapped_prob_variable_map(mapped_problem, $FREE);
        return mapped_problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24200L)
    public static SubLObject mapped_problem_problem(SubLObject mapped_problem) {
        assert NIL != mapped_problem_p(mapped_problem) : mapped_problem;
        return mapped_prob_problem(mapped_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24400L)
    public static SubLObject mapped_problem_variable_map(SubLObject mapped_problem) {
        assert NIL != mapped_problem_p(mapped_problem) : mapped_problem;
        return mapped_prob_variable_map(mapped_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24600L)
    public static SubLObject supporting_mapped_problem_index(SubLObject link, SubLObject supporting_mapped_problem) {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject candidate_supporting_mapped_problem = NIL;
        candidate_supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, candidate_supporting_mapped_problem)) {
                if (NIL != mapped_problem_equal(candidate_supporting_mapped_problem, supporting_mapped_problem)) {
                    return index;
                }
                index = Numbers.add(index, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24900L)
    public static SubLObject find_supporting_mapped_problem_by_index(SubLObject link, SubLObject index) {
        SubLObject candidate_index = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                if (index.numE(candidate_index)) {
                    return supporting_mapped_problem;
                }
                candidate_index = Numbers.add(candidate_index, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 25200L)
    public static SubLObject mapped_problem_query_as_subquery(SubLObject mapped_problem) {
        SubLObject problem = mapped_problem_problem(mapped_problem);
        SubLObject variable_map = mapped_problem_variable_map(mapped_problem);
        SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
        SubLObject subquery = bindings.apply_bindings(variable_map, problem_query);
        return subquery;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 25600L)
    public static SubLObject mapped_problem_equals_specP(SubLObject mapped_problem, SubLObject query, SubLObject variable_map) {
        SubLObject target_query = inference_datastructures_problem.problem_query(mapped_problem_problem(mapped_problem));
        SubLObject target_variable_map = mapped_problem_variable_map(mapped_problem);
        return makeBoolean(target_query.equal(query) && target_variable_map.equal(variable_map));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 26000L)
    public static SubLObject do_problem_link_supporting_mapped_problem_interpretations(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list102);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_mapped_problem_var = NIL;
        SubLObject link = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list102);
        supporting_mapped_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list102);
        link = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list102);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list102);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list102);
            if (NIL == conses_high.member(current_$1, $list103, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list102);
        }
        SubLObject openP_tail = cdestructuring_bind.property_list_member($OPEN_, current);
        SubLObject openP = (NIL != openP_tail) ? conses_high.cadr(openP_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject problem_var = $sym107$PROBLEM_VAR;
        return list($sym108$CLET, list(list(problem_var, problem)),
                list($sym109$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, list(supporting_mapped_problem_var, link, $OPEN_, openP, $DONE, done), listS($sym110$PWHEN, list(EQ, problem_var, list($sym111$MAPPED_PROBLEM_PROBLEM, supporting_mapped_problem_var)), append(body, NIL))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 26600L)
    public static SubLObject do_problem_link_supporting_variable_map_interpretations(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list112);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable_map_var = NIL;
        SubLObject link = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list112);
        variable_map_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list112);
        link = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list112);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list112);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list112);
            if (NIL == conses_high.member(current_$2, $list103, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list112);
        }
        SubLObject openP_tail = cdestructuring_bind.property_list_member($OPEN_, current);
        SubLObject openP = (NIL != openP_tail) ? conses_high.cadr(openP_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject supporting_mapped_problem = $sym113$SUPPORTING_MAPPED_PROBLEM;
        return list($sym114$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS, list(supporting_mapped_problem, link, problem, $OPEN_, openP, $DONE, done),
                listS($sym108$CLET, list(list(variable_map_var, list($sym115$MAPPED_PROBLEM_VARIABLE_MAP, supporting_mapped_problem))), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 27100L)
    public static SubLObject link_has_some_sibling_linkP(SubLObject link) {
        return Numbers.numGE(inference_datastructures_problem.problem_argument_link_count(problem_link_supported_problem(link)), TWO_INTEGER);
    }

    public static SubLObject declare_inference_datastructures_problem_link_file() {
        declareFunction(myName, "problem_link_print_function_trampoline", "PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "problem_link_p", "PROBLEM-LINK-P", 1, 0, false);
        new $problem_link_p$UnaryFunction();
        declareFunction(myName, "prob_link_suid", "PROB-LINK-SUID", 1, 0, false);
        declareFunction(myName, "prob_link_type", "PROB-LINK-TYPE", 1, 0, false);
        declareFunction(myName, "prob_link_supported_object", "PROB-LINK-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction(myName, "prob_link_supporting_mapped_problems", "PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        declareFunction(myName, "prob_link_open_flags", "PROB-LINK-OPEN-FLAGS", 1, 0, false);
        declareFunction(myName, "prob_link_data", "PROB-LINK-DATA", 1, 0, false);
        declareFunction(myName, "prob_link_proofs", "PROB-LINK-PROOFS", 1, 0, false);
        declareFunction(myName, "prob_link_memoization_state", "PROB-LINK-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(myName, "_csetf_prob_link_suid", "_CSETF-PROB-LINK-SUID", 2, 0, false);
        declareFunction(myName, "_csetf_prob_link_type", "_CSETF-PROB-LINK-TYPE", 2, 0, false);
        declareFunction(myName, "_csetf_prob_link_supported_object", "_CSETF-PROB-LINK-SUPPORTED-OBJECT", 2, 0, false);
        declareFunction(myName, "_csetf_prob_link_supporting_mapped_problems", "_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 2, 0, false);
        declareFunction(myName, "_csetf_prob_link_open_flags", "_CSETF-PROB-LINK-OPEN-FLAGS", 2, 0, false);
        declareFunction(myName, "_csetf_prob_link_data", "_CSETF-PROB-LINK-DATA", 2, 0, false);
        declareFunction(myName, "_csetf_prob_link_proofs", "_CSETF-PROB-LINK-PROOFS", 2, 0, false);
        declareFunction(myName, "_csetf_prob_link_memoization_state", "_CSETF-PROB-LINK-MEMOIZATION-STATE", 2, 0, false);
        declareFunction(myName, "make_problem_link", "MAKE-PROBLEM-LINK", 0, 1, false);
        declareFunction(myName, "visit_defstruct_problem_link", "VISIT-DEFSTRUCT-PROBLEM-LINK", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_problem_link_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-LINK-METHOD", 2, 0, false);
        declareFunction(myName, "valid_problem_link_p", "VALID-PROBLEM-LINK-P", 1, 0, false);
        declareFunction(myName, "problem_link_invalid_p", "PROBLEM-LINK-INVALID-P", 1, 0, false);
        declareFunction(myName, "print_problem_link", "PRINT-PROBLEM-LINK", 3, 0, false);
        declareFunction(myName, "sxhash_problem_link_method", "SXHASH-PROBLEM-LINK-METHOD", 1, 0, false);
        new $sxhash_problem_link_method$UnaryFunction();
        declareMacro(me, "with_problem_link_memoization_state", "WITH-PROBLEM-LINK-MEMOIZATION-STATE");
        declareFunction(myName, "problem_link_memoization_state", "PROBLEM-LINK-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(myName, "new_problem_link", "NEW-PROBLEM-LINK", 2, 0, false);
        declareFunction(myName, "new_problem_link_int", "NEW-PROBLEM-LINK-INT", 2, 0, false);
        declareFunction(myName, "destroy_problem_link", "DESTROY-PROBLEM-LINK", 1, 0, false);
        declareFunction(myName, "destroy_problem_store_link", "DESTROY-PROBLEM-STORE-LINK", 1, 0, false);
        declareFunction(myName, "destroy_problem_link_int", "DESTROY-PROBLEM-LINK-INT", 1, 0, false);
        declareFunction(myName, "note_problem_link_invalid", "NOTE-PROBLEM-LINK-INVALID", 1, 0, false);
        declareFunction(myName, "problem_link_suid", "PROBLEM-LINK-SUID", 1, 0, false);
        declareFunction(myName, "problem_link_type", "PROBLEM-LINK-TYPE", 1, 0, false);
        declareFunction(myName, "problem_link_supported_object", "PROBLEM-LINK-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction(myName, "problem_link_supporting_mapped_problems", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        declareFunction(myName, "problem_link_open_flags", "PROBLEM-LINK-OPEN-FLAGS", 1, 0, false);
        declareFunction(myName, "problem_link_data", "PROBLEM-LINK-DATA", 1, 0, false);
        declareFunction(myName, "set_problem_link_open_flags", "SET-PROBLEM-LINK-OPEN-FLAGS", 2, 0, false);
        declareFunction(myName, "set_problem_link_data", "SET-PROBLEM-LINK-DATA", 2, 0, false);
        declareFunction(myName, "add_problem_link_proof", "ADD-PROBLEM-LINK-PROOF", 2, 0, false);
        declareFunction(myName, "remove_problem_link_proof", "REMOVE-PROBLEM-LINK-PROOF", 2, 0, false);
        declareFunction(myName, "problem_link_supporting_problems", "PROBLEM-LINK-SUPPORTING-PROBLEMS", 1, 0, false);
        declareFunction(myName, "problem_link_store", "PROBLEM-LINK-STORE", 1, 0, false);
        declareFunction(myName, "problem_link_has_typeP", "PROBLEM-LINK-HAS-TYPE?", 2, 0, false);
        declareFunction(myName, "problem_link_supported_inference", "PROBLEM-LINK-SUPPORTED-INFERENCE", 1, 0, false);
        declareFunction(myName, "problem_link_supported_problem", "PROBLEM-LINK-SUPPORTED-PROBLEM", 1, 0, false);
        declareFunction(myName, "problem_link_with_supporting_problem_p", "PROBLEM-LINK-WITH-SUPPORTING-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "problem_link_with_single_supporting_problem_p", "PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "problem_link_number_of_supporting_problems", "PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS", 1, 0, false);
        declareFunction(myName, "problem_link_supporting_mapped_problem_count", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT", 1, 0, false);
        declareFunction(myName, "problem_link_first_supporting_mapped_problem", "PROBLEM-LINK-FIRST-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "problem_link_sole_supporting_mapped_problem", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "problem_link_sole_supporting_variable_map", "PROBLEM-LINK-SOLE-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "problem_link_first_supporting_problem", "PROBLEM-LINK-FIRST-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction(myName, "problem_link_sole_supporting_problem", "PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction(myName, "problem_link_find_supporting_mapped_problem_by_index", "PROBLEM-LINK-FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
        declareFunction(myName, "problem_link_openP", "PROBLEM-LINK-OPEN?", 1, 0, false);
        declareFunction(myName, "problem_link_closedP", "PROBLEM-LINK-CLOSED?", 1, 0, false);
        declareFunction(myName, "problem_link_index_openP", "PROBLEM-LINK-INDEX-OPEN?", 2, 0, false);
        declareFunction(myName, "problem_link_supporting_mapped_problem_openP", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-OPEN?", 2, 0, false);
        declareFunction(myName, "problem_link_sole_supporting_mapped_problem_openP", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM-OPEN?", 1, 0, false);
        declareFunction(myName, "supporting_mapped_problem_open_wrt_linkP", "SUPPORTING-MAPPED-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
        declareFunction(myName, "supporting_problem_open_wrt_linkP", "SUPPORTING-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
        declareFunction(myName, "problem_link_completely_openP", "PROBLEM-LINK-COMPLETELY-OPEN?", 1, 0, false);
        declareFunction(myName, "problem_link_has_some_proofP", "PROBLEM-LINK-HAS-SOME-PROOF?", 1, 1, false);
        declareFunction(myName, "problem_link_goodP", "PROBLEM-LINK-GOOD?", 1, 0, false);
        declareFunction(myName, "problem_link_proofs", "PROBLEM-LINK-PROOFS", 1, 0, false);
        declareFunction(myName, "problem_link_all_proofs", "PROBLEM-LINK-ALL-PROOFS", 1, 0, false);
        declareFunction(myName, "problem_link_proof_count", "PROBLEM-LINK-PROOF-COUNT", 1, 0, false);
        declareFunction(myName, "problem_link_destructibleP", "PROBLEM-LINK-DESTRUCTIBLE?", 1, 0, false);
        declareFunction(myName, "problem_link_destructibility_status", "PROBLEM-LINK-DESTRUCTIBILITY-STATUS", 1, 0, false);
        declareFunction(myName, "add_problem_link_supporting_mapped_problem", "ADD-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction(myName, "problem_link_open_all", "PROBLEM-LINK-OPEN-ALL", 1, 0, false);
        declareFunction(myName, "problem_link_open_index", "PROBLEM-LINK-OPEN-INDEX", 2, 0, false);
        declareFunction(myName, "problem_link_open_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction(myName, "problem_link_open_sole_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "problem_link_close_index", "PROBLEM-LINK-CLOSE-INDEX", 2, 0, false);
        declareFunction(myName, "problem_link_close_all", "PROBLEM-LINK-CLOSE-ALL", 1, 0, false);
        declareFunction(myName, "problem_link_close_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction(myName, "problem_link_close_sole_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "connect_supporting_mapped_problem_with_dependent_link", "CONNECT-SUPPORTING-MAPPED-PROBLEM-WITH-DEPENDENT-LINK", 2, 0, false);
        declareFunction(myName, "problem_link_to_goal_p", "PROBLEM-LINK-TO-GOAL-P", 1, 0, false);
        declareFunction(myName, "find_problem_link_of_type_between", "FIND-PROBLEM-LINK-OF-TYPE-BETWEEN", 3, 0, false);
        declareFunction(myName, "link_of_type_betweenP", "LINK-OF-TYPE-BETWEEN?", 3, 0, false);
        declareFunction(myName, "find_closed_supporting_problem_by_query", "FIND-CLOSED-SUPPORTING-PROBLEM-BY-QUERY", 2, 0, false);
        declareFunction(myName, "find_supporting_mapped_problem_by_query_and_variable_map", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-QUERY-AND-VARIABLE-MAP", 3, 0, false);
        declareFunction(myName, "problem_link_supporting_mapped_problem_that_isnt", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-THAT-ISNT", 2, 0, false);
        declareFunction(myName, "mapped_problem_print_function_trampoline", "MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "mapped_problem_p", "MAPPED-PROBLEM-P", 1, 0, false);
        new $mapped_problem_p$UnaryFunction();
        declareFunction(myName, "mapped_prob_problem", "MAPPED-PROB-PROBLEM", 1, 0, false);
        declareFunction(myName, "mapped_prob_variable_map", "MAPPED-PROB-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "_csetf_mapped_prob_problem", "_CSETF-MAPPED-PROB-PROBLEM", 2, 0, false);
        declareFunction(myName, "_csetf_mapped_prob_variable_map", "_CSETF-MAPPED-PROB-VARIABLE-MAP", 2, 0, false);
        declareFunction(myName, "make_mapped_problem", "MAKE-MAPPED-PROBLEM", 0, 1, false);
        declareFunction(myName, "visit_defstruct_mapped_problem", "VISIT-DEFSTRUCT-MAPPED-PROBLEM", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_mapped_problem_method", "VISIT-DEFSTRUCT-OBJECT-MAPPED-PROBLEM-METHOD", 2, 0, false);
        declareFunction(myName, "valid_mapped_problem_p", "VALID-MAPPED-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "mapped_problem_equal", "MAPPED-PROBLEM-EQUAL", 2, 0, false);
        new $mapped_problem_equal$BinaryFunction();
        declareFunction(myName, "print_mapped_problem", "PRINT-MAPPED-PROBLEM", 3, 0, false);
        declareFunction(myName, "sxhash_mapped_problem_method", "SXHASH-MAPPED-PROBLEM-METHOD", 1, 0, false);
        declareFunction(myName, "closed_mapped_problem_p", "CLOSED-MAPPED-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "new_mapped_problem", "NEW-MAPPED-PROBLEM", 2, 0, false);
        declareFunction(myName, "new_closed_mapped_problem", "NEW-CLOSED-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "destroy_problem_link_mapped_problem", "DESTROY-PROBLEM-LINK-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "destroy_mapped_problem_int", "DESTROY-MAPPED-PROBLEM-INT", 1, 0, false);
        declareFunction(myName, "note_mapped_problem_invalid", "NOTE-MAPPED-PROBLEM-INVALID", 1, 0, false);
        declareFunction(myName, "mapped_problem_problem", "MAPPED-PROBLEM-PROBLEM", 1, 0, false);
        declareFunction(myName, "mapped_problem_variable_map", "MAPPED-PROBLEM-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "supporting_mapped_problem_index", "SUPPORTING-MAPPED-PROBLEM-INDEX", 2, 0, false);
        declareFunction(myName, "find_supporting_mapped_problem_by_index", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
        declareFunction(myName, "mapped_problem_query_as_subquery", "MAPPED-PROBLEM-QUERY-AS-SUBQUERY", 1, 0, false);
        declareFunction(myName, "mapped_problem_equals_specP", "MAPPED-PROBLEM-EQUALS-SPEC?", 3, 0, false);
        declareMacro(me, "do_problem_link_supporting_mapped_problem_interpretations", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");
        declareMacro(me, "do_problem_link_supporting_variable_map_interpretations", "DO-PROBLEM-LINK-SUPPORTING-VARIABLE-MAP-INTERPRETATIONS");
        declareFunction(myName, "link_has_some_sibling_linkP", "LINK-HAS-SOME-SIBLING-LINK?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_link_file() {
        $dtp_problem_link$ = defconstant("*DTP-PROBLEM-LINK*", $sym0$PROBLEM_LINK);
        $dtp_mapped_problem$ = defconstant("*DTP-MAPPED-PROBLEM*", $sym81$MAPPED_PROBLEM);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_link_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_link$.getGlobalValue(), Symbols.symbol_function($sym8$PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        Structures.def_csetf($sym10$PROB_LINK_SUID, $sym11$_CSETF_PROB_LINK_SUID);
        Structures.def_csetf($sym12$PROB_LINK_TYPE, $sym13$_CSETF_PROB_LINK_TYPE);
        Structures.def_csetf($sym14$PROB_LINK_SUPPORTED_OBJECT, $sym15$_CSETF_PROB_LINK_SUPPORTED_OBJECT);
        Structures.def_csetf($sym16$PROB_LINK_SUPPORTING_MAPPED_PROBLEMS, $sym17$_CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS);
        Structures.def_csetf($sym18$PROB_LINK_OPEN_FLAGS, $sym19$_CSETF_PROB_LINK_OPEN_FLAGS);
        Structures.def_csetf($sym20$PROB_LINK_DATA, $sym21$_CSETF_PROB_LINK_DATA);
        Structures.def_csetf($sym22$PROB_LINK_PROOFS, $sym23$_CSETF_PROB_LINK_PROOFS);
        Structures.def_csetf($sym24$PROB_LINK_MEMOIZATION_STATE, $sym25$_CSETF_PROB_LINK_MEMOIZATION_STATE);
        Equality.identity($sym0$PROBLEM_LINK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_link$.getGlobalValue(), Symbols.symbol_function($sym39$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LINK_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem_link$.getGlobalValue(), Symbols.symbol_function($sym46$SXHASH_PROBLEM_LINK_METHOD));
        access_macros.register_macro_helper($sym49$PROBLEM_LINK_MEMOIZATION_STATE, $sym50$WITH_PROBLEM_LINK_MEMOIZATION_STATE);
        access_macros.define_obsolete_register($sym73$PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS, $list74);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_mapped_problem$.getGlobalValue(), Symbols.symbol_function($sym88$MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list89);
        Structures.def_csetf($sym90$MAPPED_PROB_PROBLEM, $sym91$_CSETF_MAPPED_PROB_PROBLEM);
        Structures.def_csetf($sym92$MAPPED_PROB_VARIABLE_MAP, $sym93$_CSETF_MAPPED_PROB_VARIABLE_MAP);
        Equality.identity($sym81$MAPPED_PROBLEM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_mapped_problem$.getGlobalValue(), Symbols.symbol_function($sym97$VISIT_DEFSTRUCT_OBJECT_MAPPED_PROBLEM_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_mapped_problem$.getGlobalValue(), Symbols.symbol_function($sym99$SXHASH_MAPPED_PROBLEM_METHOD));
        return NIL;
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
        me = new inference_datastructures_problem_link();
        $dtp_problem_link$ = null;
        $dtp_mapped_problem$ = null;
        $sym0$PROBLEM_LINK = makeSymbol("PROBLEM-LINK");
        $sym1$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
        $int$213 = makeInteger(213);
        $list3 = list(makeSymbol("SUID"), makeSymbol("TYPE"), makeSymbol("SUPPORTED-OBJECT"), makeSymbol("SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("OPEN-FLAGS"), makeSymbol("DATA"), makeSymbol("PROOFS"), makeSymbol("MEMOIZATION-STATE"));
        $list4 = list(makeKeyword("SUID"), makeKeyword("TYPE"), makeKeyword("SUPPORTED-OBJECT"), makeKeyword("SUPPORTING-MAPPED-PROBLEMS"), makeKeyword("OPEN-FLAGS"), makeKeyword("DATA"), makeKeyword("PROOFS"), makeKeyword("MEMOIZATION-STATE"));
        $list5 = list(makeSymbol("PROB-LINK-SUID"), makeSymbol("PROB-LINK-TYPE"), makeSymbol("PROB-LINK-SUPPORTED-OBJECT"), makeSymbol("PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("PROB-LINK-OPEN-FLAGS"), makeSymbol("PROB-LINK-DATA"), makeSymbol("PROB-LINK-PROOFS"),
                makeSymbol("PROB-LINK-MEMOIZATION-STATE"));
        $list6 = list(makeSymbol("_CSETF-PROB-LINK-SUID"), makeSymbol("_CSETF-PROB-LINK-TYPE"), makeSymbol("_CSETF-PROB-LINK-SUPPORTED-OBJECT"), makeSymbol("_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("_CSETF-PROB-LINK-OPEN-FLAGS"), makeSymbol("_CSETF-PROB-LINK-DATA"),
                makeSymbol("_CSETF-PROB-LINK-PROOFS"), makeSymbol("_CSETF-PROB-LINK-MEMOIZATION-STATE"));
        $sym7$PRINT_PROBLEM_LINK = makeSymbol("PRINT-PROBLEM-LINK");
        $sym8$PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-LINK-P"));
        $sym10$PROB_LINK_SUID = makeSymbol("PROB-LINK-SUID");
        $sym11$_CSETF_PROB_LINK_SUID = makeSymbol("_CSETF-PROB-LINK-SUID");
        $sym12$PROB_LINK_TYPE = makeSymbol("PROB-LINK-TYPE");
        $sym13$_CSETF_PROB_LINK_TYPE = makeSymbol("_CSETF-PROB-LINK-TYPE");
        $sym14$PROB_LINK_SUPPORTED_OBJECT = makeSymbol("PROB-LINK-SUPPORTED-OBJECT");
        $sym15$_CSETF_PROB_LINK_SUPPORTED_OBJECT = makeSymbol("_CSETF-PROB-LINK-SUPPORTED-OBJECT");
        $sym16$PROB_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("PROB-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $sym17$_CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $sym18$PROB_LINK_OPEN_FLAGS = makeSymbol("PROB-LINK-OPEN-FLAGS");
        $sym19$_CSETF_PROB_LINK_OPEN_FLAGS = makeSymbol("_CSETF-PROB-LINK-OPEN-FLAGS");
        $sym20$PROB_LINK_DATA = makeSymbol("PROB-LINK-DATA");
        $sym21$_CSETF_PROB_LINK_DATA = makeSymbol("_CSETF-PROB-LINK-DATA");
        $sym22$PROB_LINK_PROOFS = makeSymbol("PROB-LINK-PROOFS");
        $sym23$_CSETF_PROB_LINK_PROOFS = makeSymbol("_CSETF-PROB-LINK-PROOFS");
        $sym24$PROB_LINK_MEMOIZATION_STATE = makeSymbol("PROB-LINK-MEMOIZATION-STATE");
        $sym25$_CSETF_PROB_LINK_MEMOIZATION_STATE = makeSymbol("_CSETF-PROB-LINK-MEMOIZATION-STATE");
        $SUID = makeKeyword("SUID");
        $TYPE = makeKeyword("TYPE");
        $SUPPORTED_OBJECT = makeKeyword("SUPPORTED-OBJECT");
        $SUPPORTING_MAPPED_PROBLEMS = makeKeyword("SUPPORTING-MAPPED-PROBLEMS");
        $OPEN_FLAGS = makeKeyword("OPEN-FLAGS");
        $DATA = makeKeyword("DATA");
        $PROOFS = makeKeyword("PROOFS");
        $MEMOIZATION_STATE = makeKeyword("MEMOIZATION-STATE");
        $str34$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym36$MAKE_PROBLEM_LINK = makeSymbol("MAKE-PROBLEM-LINK");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym39$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LINK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-LINK-METHOD");
        $FREE = makeKeyword("FREE");
        $str41$_Invalid_LINK__s_ = makeString("<Invalid LINK ~s>");
        $str42$__a_LINK__a__a_supporting_ = makeString("<~a LINK ~a.~a supporting ");
        $ANSWER = makeKeyword("ANSWER");
        $str44$_a_ = makeString("~a>");
        $str45$_a__a_ = makeString("~a.~a>");
        $sym46$SXHASH_PROBLEM_LINK_METHOD = makeSymbol("SXHASH-PROBLEM-LINK-METHOD");
        $list47 = list(list(makeSymbol("PROBLEM-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym48$WITH_MEMOIZATION_STATE = makeSymbol("WITH-MEMOIZATION-STATE");
        $sym49$PROBLEM_LINK_MEMOIZATION_STATE = makeSymbol("PROBLEM-LINK-MEMOIZATION-STATE");
        $sym50$WITH_PROBLEM_LINK_MEMOIZATION_STATE = makeSymbol("WITH-PROBLEM-LINK-MEMOIZATION-STATE");
        $sym51$PROBLEM_LINK_TYPE_P = makeSymbol("PROBLEM-LINK-TYPE-P");
        $str52$Can_t_call_new_problem_link_for_a = makeString("Can't call new-problem-link for an :answer link, call new-answer-link instead");
        $sym53$PROBLEM_P = makeSymbol("PROBLEM-P");
        $str54$problem_link_memoization_state = makeString("problem link memoization state");
        $REMOVAL = makeKeyword("REMOVAL");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $JOIN = makeKeyword("JOIN");
        $SPLIT = makeKeyword("SPLIT");
        $UNION = makeKeyword("UNION");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $sym63$INTEGERP = makeSymbol("INTEGERP");
        $CONTENT = makeKeyword("CONTENT");
        $STRUCTURAL = makeKeyword("STRUCTURAL");
        $DISJUNCTIVE = makeKeyword("DISJUNCTIVE");
        $CONJUNCTIVE = makeKeyword("CONJUNCTIVE");
        $CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
        $LOGICAL = makeKeyword("LOGICAL");
        $SPLIT_RESTRICTION = makeKeyword("SPLIT/RESTRICTION");
        $SIMPLIFICATION = makeKeyword("SIMPLIFICATION");
        $REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
        $sym73$PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS = makeSymbol("PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS");
        $list74 = list(makeSymbol("PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT"));
        $sym75$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");
        $sym76$MAPPED_PROBLEM_EQUAL = makeSymbol("MAPPED-PROBLEM-EQUAL");
        $PROVEN = makeKeyword("PROVEN");
        $DESTRUCTIBLE = makeKeyword("DESTRUCTIBLE");
        $INDESTRUCTIBLE = makeKeyword("INDESTRUCTIBLE");
        $sym80$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
        $sym81$MAPPED_PROBLEM = makeSymbol("MAPPED-PROBLEM");
        $int$214 = makeInteger(214);
        $list83 = list(makeSymbol("PROBLEM"), makeSymbol("VARIABLE-MAP"));
        $list84 = list(makeKeyword("PROBLEM"), makeKeyword("VARIABLE-MAP"));
        $list85 = list(makeSymbol("MAPPED-PROB-PROBLEM"), makeSymbol("MAPPED-PROB-VARIABLE-MAP"));
        $list86 = list(makeSymbol("_CSETF-MAPPED-PROB-PROBLEM"), makeSymbol("_CSETF-MAPPED-PROB-VARIABLE-MAP"));
        $sym87$PRINT_MAPPED_PROBLEM = makeSymbol("PRINT-MAPPED-PROBLEM");
        $sym88$MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE");
        $list89 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MAPPED-PROBLEM-P"));
        $sym90$MAPPED_PROB_PROBLEM = makeSymbol("MAPPED-PROB-PROBLEM");
        $sym91$_CSETF_MAPPED_PROB_PROBLEM = makeSymbol("_CSETF-MAPPED-PROB-PROBLEM");
        $sym92$MAPPED_PROB_VARIABLE_MAP = makeSymbol("MAPPED-PROB-VARIABLE-MAP");
        $sym93$_CSETF_MAPPED_PROB_VARIABLE_MAP = makeSymbol("_CSETF-MAPPED-PROB-VARIABLE-MAP");
        $PROBLEM = makeKeyword("PROBLEM");
        $VARIABLE_MAP = makeKeyword("VARIABLE-MAP");
        $sym96$MAKE_MAPPED_PROBLEM = makeSymbol("MAKE-MAPPED-PROBLEM");
        $sym97$VISIT_DEFSTRUCT_OBJECT_MAPPED_PROBLEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MAPPED-PROBLEM-METHOD");
        $str98$_MAPPED_PROBLEM__a__a_ = makeString("<MAPPED PROBLEM:~a ~a>");
        $sym99$SXHASH_MAPPED_PROBLEM_METHOD = makeSymbol("SXHASH-MAPPED-PROBLEM-METHOD");
        $sym100$VARIABLE_MAP_P = makeSymbol("VARIABLE-MAP-P");
        $sym101$CLOSED_PROBLEM_P = makeSymbol("CLOSED-PROBLEM-P");
        $list102 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("LINK"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list103 = list(makeKeyword("OPEN?"), makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $OPEN_ = makeKeyword("OPEN?");
        $DONE = makeKeyword("DONE");
        $sym107$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");
        $sym108$CLET = makeSymbol("CLET");
        $sym109$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $sym110$PWHEN = makeSymbol("PWHEN");
        $sym111$MAPPED_PROBLEM_PROBLEM = makeSymbol("MAPPED-PROBLEM-PROBLEM");
        $list112 = list(list(makeSymbol("VARIABLE-MAP-VAR"), makeSymbol("LINK"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym113$SUPPORTING_MAPPED_PROBLEM = makeUninternedSymbol("SUPPORTING-MAPPED-PROBLEM");
        $sym114$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");
        $sym115$MAPPED_PROBLEM_VARIABLE_MAP = makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP");
    }

    public static class $problem_link_native extends SubLStructNative {
        public SubLObject $suid;
        public SubLObject $type;
        public SubLObject $supported_object;
        public SubLObject $supporting_mapped_problems;
        public SubLObject $open_flags;
        public SubLObject $data;
        public SubLObject $proofs;
        public SubLObject $memoization_state;
        private static SubLStructDeclNative structDecl;

        public $problem_link_native() {
            this.$suid = CommonSymbols.NIL;
            this.$type = CommonSymbols.NIL;
            this.$supported_object = CommonSymbols.NIL;
            this.$supporting_mapped_problems = CommonSymbols.NIL;
            this.$open_flags = CommonSymbols.NIL;
            this.$data = CommonSymbols.NIL;
            this.$proofs = CommonSymbols.NIL;
            this.$memoization_state = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $problem_link_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$supported_object = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$supporting_mapped_problems = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$open_flags = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$data = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$proofs = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return this.$memoization_state = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($problem_link_native.class, $sym0$PROBLEM_LINK, $sym1$PROBLEM_LINK_P, $list3, $list4, new String[] { "$suid", "$type", "$supported_object", "$supporting_mapped_problems", "$open_flags", "$data", "$proofs", "$memoization_state" }, $list5,
                    $list6, $sym7$PRINT_PROBLEM_LINK);
        }
    }

    public static class $problem_link_p$UnaryFunction extends UnaryFunction {
        public $problem_link_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-LINK-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return problem_link_p(arg1);
        }
    }

    public static class $sxhash_problem_link_method$UnaryFunction extends UnaryFunction {
        public $sxhash_problem_link_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-PROBLEM-LINK-METHOD"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return sxhash_problem_link_method(arg1);
        }
    }

    public static class $mapped_problem_native extends SubLStructNative {
        public SubLObject $problem;
        public SubLObject $variable_map;
        private static SubLStructDeclNative structDecl;

        public $mapped_problem_native() {
            this.$problem = CommonSymbols.NIL;
            this.$variable_map = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $mapped_problem_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$problem = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$variable_map = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($mapped_problem_native.class, $sym81$MAPPED_PROBLEM, $sym80$MAPPED_PROBLEM_P, $list83, $list84, new String[] { "$problem", "$variable_map" }, $list85, $list86, $sym87$PRINT_MAPPED_PROBLEM);
        }
    }

    public static class $mapped_problem_p$UnaryFunction extends UnaryFunction {
        public $mapped_problem_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MAPPED-PROBLEM-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return mapped_problem_p(arg1);
        }
    }

    public static class $mapped_problem_equal$BinaryFunction extends BinaryFunction {
        public $mapped_problem_equal$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MAPPED-PROBLEM-EQUAL"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return mapped_problem_equal(arg1, arg2);
        }
    }
}
/*
 *
 * Total time: 410 ms
 *
 */