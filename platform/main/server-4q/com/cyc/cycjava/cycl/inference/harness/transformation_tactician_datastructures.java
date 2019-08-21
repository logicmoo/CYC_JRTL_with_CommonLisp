package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transformation_tactician_datastructures extends SubLTranslatedFile {
    public static final SubLFile me = new transformation_tactician_datastructures();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures";

    public static final String myFingerPrint = "6ad4b0ffb58b93181d8313911c6e993da5e26c9bedeb6e22b1c5d626f18d475c";

    // defconstant
    public static final SubLSymbol $dtp_transformation_strategy_data$ = makeSymbol("*DTP-TRANSFORMATION-STRATEGY-DATA*");



    public static final SubLSymbol TRANSFORMATION_STRATEGY_DATA = makeSymbol("TRANSFORMATION-STRATEGY-DATA");

    public static final SubLSymbol TRANSFORMATION_STRATEGY_DATA_P = makeSymbol("TRANSFORMATION-STRATEGY-DATA-P");

    public static final SubLList $list3 = list(makeSymbol("LINK-HEADS-MOTIVATED"), makeSymbol("PROBLEMS-PENDING"), makeSymbol("TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY"));

    public static final SubLList $list4 = list(makeKeyword("LINK-HEADS-MOTIVATED"), makeKeyword("PROBLEMS-PENDING"), makeKeyword("TRANSFORMATION-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));

    public static final SubLList $list5 = list(makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));



    public static final SubLSymbol TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TRANSFORMATION-STRATEGY-DATA-P"));

    private static final SubLSymbol TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");

    private static final SubLSymbol TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING");

    private static final SubLSymbol TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");

    private static final SubLSymbol TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");

    private static final SubLSymbol TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");

    private static final SubLSymbol TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");

    private static final SubLSymbol $LINK_HEADS_MOTIVATED = makeKeyword("LINK-HEADS-MOTIVATED");



    private static final SubLSymbol $TRANSFORMATION_STRATEGEM_INDEX = makeKeyword("TRANSFORMATION-STRATEGEM-INDEX");

    private static final SubLSymbol $PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE");

    private static final SubLSymbol $PROBLEM_STRATEGEMS_SET_ASIDE = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE");

    private static final SubLSymbol $PROBLEM_STRATEGEMS_THROWN_AWAY = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY");

    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TRANSFORMATION_STRATEGY_DATA = makeSymbol("MAKE-TRANSFORMATION-STRATEGY-DATA");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD");

    private static final SubLSymbol TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");



    private static final SubLSymbol MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");



    private static final SubLSymbol TRANSFORMATION_STRATEGEM_P = makeSymbol("TRANSFORMATION-STRATEGEM-P");

    public static SubLObject transformation_strategy_motivation_p(final SubLObject v_object) {
        return eq(v_object, $TRANSFORMATION);
    }

    public static SubLObject transformation_strategy_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject transformation_strategy_data_p(final SubLObject v_object) {
        return v_object.getClass() == $transformation_strategy_data_native.class ? T : NIL;
    }

    public static SubLObject trans_strat_data_link_heads_motivated(final SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject trans_strat_data_problems_pending(final SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject trans_strat_data_transformation_strategem_index(final SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject trans_strat_data_problem_total_strategems_active(final SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject trans_strat_data_problem_strategems_set_aside(final SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject trans_strat_data_problem_strategems_thrown_away(final SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_trans_strat_data_link_heads_motivated(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_trans_strat_data_problems_pending(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_trans_strat_data_transformation_strategem_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_trans_strat_data_problem_total_strategems_active(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_trans_strat_data_problem_strategems_set_aside(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_trans_strat_data_problem_strategems_thrown_away(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_transformation_strategy_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $transformation_strategy_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LINK_HEADS_MOTIVATED)) {
                _csetf_trans_strat_data_link_heads_motivated(v_new, current_value);
            } else
                if (pcase_var.eql($PROBLEMS_PENDING)) {
                    _csetf_trans_strat_data_problems_pending(v_new, current_value);
                } else
                    if (pcase_var.eql($TRANSFORMATION_STRATEGEM_INDEX)) {
                        _csetf_trans_strat_data_transformation_strategem_index(v_new, current_value);
                    } else
                        if (pcase_var.eql($PROBLEM_TOTAL_STRATEGEMS_ACTIVE)) {
                            _csetf_trans_strat_data_problem_total_strategems_active(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROBLEM_STRATEGEMS_SET_ASIDE)) {
                                _csetf_trans_strat_data_problem_strategems_set_aside(v_new, current_value);
                            } else
                                if (pcase_var.eql($PROBLEM_STRATEGEMS_THROWN_AWAY)) {
                                    _csetf_trans_strat_data_problem_strategems_thrown_away(v_new, current_value);
                                } else {
                                    Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_transformation_strategy_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TRANSFORMATION_STRATEGY_DATA, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LINK_HEADS_MOTIVATED, trans_strat_data_link_heads_motivated(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEMS_PENDING, trans_strat_data_problems_pending(obj));
        funcall(visitor_fn, obj, $SLOT, $TRANSFORMATION_STRATEGEM_INDEX, trans_strat_data_transformation_strategem_index(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEM_TOTAL_STRATEGEMS_ACTIVE, trans_strat_data_problem_total_strategems_active(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEM_STRATEGEMS_SET_ASIDE, trans_strat_data_problem_strategems_set_aside(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEM_STRATEGEMS_THROWN_AWAY, trans_strat_data_problem_strategems_thrown_away(obj));
        funcall(visitor_fn, obj, $END, MAKE_TRANSFORMATION_STRATEGY_DATA, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_transformation_strategy_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_transformation_strategy_data(obj, visitor_fn);
    }

    public static SubLObject transformation_strategy_p(final SubLObject v_object) {
        return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(v_object)) && ($TRANSFORMATION == inference_datastructures_strategy.strategy_type(v_object))) || (NIL != abductive_tactician.abductive_strategy_p(v_object)));
    }

    public static SubLObject new_transformation_strategy_data(final SubLObject transformation_index) {
        final SubLObject data = make_transformation_strategy_data(UNPROVIDED);
        _csetf_trans_strat_data_link_heads_motivated(data, set.new_set(symbol_function(EQ), UNPROVIDED));
        _csetf_trans_strat_data_problems_pending(data, set.new_set(symbol_function(EQ), UNPROVIDED));
        _csetf_trans_strat_data_transformation_strategem_index(data, transformation_index);
        _csetf_trans_strat_data_problem_total_strategems_active(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_trans_strat_data_problem_strategems_set_aside(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_trans_strat_data_problem_strategems_thrown_away(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        return data;
    }

    public static SubLObject transformation_strategy_link_heads_motivated(final SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_link_heads_motivated(data);
    }

    public static SubLObject transformation_strategy_problems_pending(final SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problems_pending(data);
    }

    public static SubLObject transformation_strategy_transformation_strategem_index(final SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_transformation_strategem_index(data);
    }

    public static SubLObject transformation_strategy_problem_total_strategems_active(final SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problem_total_strategems_active(data);
    }

    public static SubLObject transformation_strategy_problem_strategems_set_aside(final SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problem_strategems_set_aside(data);
    }

    public static SubLObject transformation_strategy_problem_strategems_thrown_away(final SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problem_strategems_thrown_away(data);
    }

    public static SubLObject transformation_strategy_problem_motivatedP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return inference_datastructures_strategy.problem_motivatedP(problem, strategy);
    }

    public static SubLObject transformation_strategy_link_head_motivatedP(final SubLObject strategy, final SubLObject link_head) {
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : "inference_tactician.motivation_strategem_p(link_head) " + "CommonSymbols.NIL != inference_tactician.motivation_strategem_p(link_head) " + link_head;
        return set.set_memberP(link_head, transformation_strategy_link_heads_motivated(strategy));
    }

    public static SubLObject transformation_strategy_problem_pendingP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return set.set_memberP(problem, transformation_strategy_problems_pending(strategy));
    }

    public static SubLObject transformation_strategy_problem_activeP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        final SubLObject index = transformation_strategy_problem_total_strategems_active(strategy);
        return plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
    }

    public static SubLObject transformation_strategy_problem_set_asideP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        if (NIL == transformation_strategy_problem_activeP(strategy, problem)) {
            final SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
            final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if ((NIL != v_set) && (NIL == set.set_emptyP(v_set))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_strategem_set_asideP(final SubLObject strategy, final SubLObject strategem) {
        assert NIL != inference_tactician.strategem_p(strategem) : "inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) " + strategem;
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        final SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
        final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        return makeBoolean((NIL != set.set_p(v_set)) && (NIL != set.set_memberP(strategem, v_set)));
    }

    public static SubLObject transformation_strategy_strategem_thrown_awayP(final SubLObject strategy, final SubLObject strategem) {
        assert NIL != inference_tactician.strategem_p(strategem) : "inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) " + strategem;
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        final SubLObject index = transformation_strategy_problem_strategems_thrown_away(strategy);
        final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        return makeBoolean((NIL != set.set_p(v_set)) && (NIL != set.set_memberP(strategem, v_set)));
    }

    public static SubLObject transformation_strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }

    public static SubLObject transformation_strategy_note_link_head_motivated(final SubLObject strategy, final SubLObject link_head) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : "inference_tactician.motivation_strategem_p(link_head) " + "CommonSymbols.NIL != inference_tactician.motivation_strategem_p(link_head) " + link_head;
        return set.set_add(link_head, transformation_strategy_link_heads_motivated(strategy));
    }

    public static SubLObject transformation_strategy_note_problem_pending(final SubLObject strategy, final SubLObject problem) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return set.set_add(problem, transformation_strategy_problems_pending(strategy));
    }

    public static SubLObject transformation_strategy_note_problem_unpending(final SubLObject strategy, final SubLObject problem) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return set.set_remove(problem, transformation_strategy_problems_pending(strategy));
    }

    public static SubLObject transformation_strategy_activate_strategem(final SubLObject strategy, final SubLObject transformation_strategem) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : "inference_tactician.transformation_strategem_p(transformation_strategem) " + "CommonSymbols.NIL != inference_tactician.transformation_strategem_p(transformation_strategem) " + transformation_strategem;
        if ((NIL != inference_worker_transformation.transformation_tactic_p(transformation_strategem)) && (NIL != inference_datastructures_tactic.tactic_executedP(transformation_strategem))) {
            return transformation_tactician_motivation.transformation_strategy_activate_transformation_argument_links(strategy, inference_datastructures_tactic.tactic_problem(transformation_strategem));
        }
        SubLObject result = NIL;
        result = transformation_tactician.transformation_strategy_activate_strategem_low(strategy, transformation_strategem);
        if (NIL != result) {
            final SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
            final SubLObject index = transformation_strategy_problem_total_strategems_active(strategy);
            SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
            count = add(count, ONE_INTEGER);
            if (ONE_INTEGER.numE(count)) {
                transformation_strategy_note_problem_unpending(strategy, problem);
            }
            dictionary.dictionary_enter(index, problem, count);
            return count;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_note_strategem_set_aside(final SubLObject strategy, final SubLObject transformation_strategem) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : "inference_tactician.transformation_strategem_p(transformation_strategem) " + "CommonSymbols.NIL != inference_tactician.transformation_strategem_p(transformation_strategem) " + transformation_strategem;
        final SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
        final SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (NIL == set.set_p(v_set)) {
            v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set.set_add(transformation_strategem, v_set);
    }

    public static SubLObject transformation_strategy_clear_strategems_set_aside(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        final SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject strategem_set = thread.secondMultipleValue();
            thread.resetMultipleValues();
            transformation_strategy_note_problem_unpending(strategy, problem);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(index);
        return strategy;
    }

    public static SubLObject transformation_strategy_note_strategem_thrown_away(final SubLObject strategy, final SubLObject transformation_strategem) {
        assert NIL != transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : "inference_tactician.transformation_strategem_p(transformation_strategem) " + "CommonSymbols.NIL != inference_tactician.transformation_strategem_p(transformation_strategem) " + transformation_strategem;
        final SubLObject index = transformation_strategy_problem_strategems_thrown_away(strategy);
        final SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (NIL == set.set_p(v_set)) {
            v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set.set_add(transformation_strategem, v_set);
    }

    public static SubLObject transformation_strategy_clear_set_aside_problems(final SubLObject strategy) {
        transformation_strategy_clear_strategems_set_aside(strategy);
        return strategy;
    }

    public static SubLObject declare_transformation_tactician_datastructures_file() {
        declareFunction(me, "transformation_strategy_motivation_p", "TRANSFORMATION-STRATEGY-MOTIVATION-P", 1, 0, false);
        declareFunction(me, "transformation_strategy_data_print_function_trampoline", "TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "transformation_strategy_data_p", "TRANSFORMATION-STRATEGY-DATA-P", 1, 0, false);
        new transformation_tactician_datastructures.$transformation_strategy_data_p$UnaryFunction();
        declareFunction(me, "trans_strat_data_link_heads_motivated", "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction(me, "trans_strat_data_problems_pending", "TRANS-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false);
        declareFunction(me, "trans_strat_data_transformation_strategem_index", "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction(me, "trans_strat_data_problem_total_strategems_active", "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction(me, "trans_strat_data_problem_strategems_set_aside", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction(me, "trans_strat_data_problem_strategems_thrown_away", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction(me, "_csetf_trans_strat_data_link_heads_motivated", "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false);
        declareFunction(me, "_csetf_trans_strat_data_problems_pending", "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false);
        declareFunction(me, "_csetf_trans_strat_data_transformation_strategem_index", "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_trans_strat_data_problem_total_strategems_active", "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false);
        declareFunction(me, "_csetf_trans_strat_data_problem_strategems_set_aside", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false);
        declareFunction(me, "_csetf_trans_strat_data_problem_strategems_thrown_away", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false);
        declareFunction(me, "make_transformation_strategy_data", "MAKE-TRANSFORMATION-STRATEGY-DATA", 0, 1, false);
        declareFunction(me, "visit_defstruct_transformation_strategy_data", "VISIT-DEFSTRUCT-TRANSFORMATION-STRATEGY-DATA", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_transformation_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD", 2, 0, false);
        declareFunction(me, "transformation_strategy_p", "TRANSFORMATION-STRATEGY-P", 1, 0, false);
        declareFunction(me, "new_transformation_strategy_data", "NEW-TRANSFORMATION-STRATEGY-DATA", 1, 0, false);
        declareFunction(me, "transformation_strategy_link_heads_motivated", "TRANSFORMATION-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction(me, "transformation_strategy_problems_pending", "TRANSFORMATION-STRATEGY-PROBLEMS-PENDING", 1, 0, false);
        declareFunction(me, "transformation_strategy_transformation_strategem_index", "TRANSFORMATION-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction(me, "transformation_strategy_problem_total_strategems_active", "TRANSFORMATION-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction(me, "transformation_strategy_problem_strategems_set_aside", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction(me, "transformation_strategy_problem_strategems_thrown_away", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction(me, "transformation_strategy_problem_motivatedP", "TRANSFORMATION-STRATEGY-PROBLEM-MOTIVATED?", 2, 0, false);
        declareFunction(me, "transformation_strategy_link_head_motivatedP", "TRANSFORMATION-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
        declareFunction(me, "transformation_strategy_problem_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-PENDING?", 2, 0, false);
        declareFunction(me, "transformation_strategy_problem_activeP", "TRANSFORMATION-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        declareFunction(me, "transformation_strategy_problem_set_asideP", "TRANSFORMATION-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false);
        declareFunction(me, "transformation_strategy_strategem_set_asideP", "TRANSFORMATION-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false);
        declareFunction(me, "transformation_strategy_strategem_thrown_awayP", "TRANSFORMATION-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false);
        declareFunction(me, "transformation_strategy_note_problem_motivated", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction(me, "transformation_strategy_note_link_head_motivated", "TRANSFORMATION-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false);
        declareFunction(me, "transformation_strategy_note_problem_pending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false);
        declareFunction(me, "transformation_strategy_note_problem_unpending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false);
        declareFunction(me, "transformation_strategy_activate_strategem", "TRANSFORMATION-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction(me, "transformation_strategy_note_strategem_set_aside", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false);
        declareFunction(me, "transformation_strategy_clear_strategems_set_aside", "TRANSFORMATION-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction(me, "transformation_strategy_note_strategem_thrown_away", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false);
        declareFunction(me, "transformation_strategy_clear_set_aside_problems", "TRANSFORMATION-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_transformation_tactician_datastructures_file() {
        defconstant("*DTP-TRANSFORMATION-STRATEGY-DATA*", TRANSFORMATION_STRATEGY_DATA);
        return NIL;
    }

    public static SubLObject setup_transformation_tactician_datastructures_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_transformation_strategy_data$.getGlobalValue(), symbol_function(TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED, _CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED);
        def_csetf(TRANS_STRAT_DATA_PROBLEMS_PENDING, _CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING);
        def_csetf(TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, _CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX);
        def_csetf(TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, _CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE);
        def_csetf(TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, _CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE);
        def_csetf(TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, _CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY);
        identity(TRANSFORMATION_STRATEGY_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_transformation_strategy_data$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transformation_tactician_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_transformation_tactician_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transformation_tactician_datastructures_file();
    }

    static {









































    }

    public static final class $transformation_strategy_data_native extends SubLStructNative {
        public SubLObject $link_heads_motivated;

        public SubLObject $problems_pending;

        public SubLObject $transformation_strategem_index;

        public SubLObject $problem_total_strategems_active;

        public SubLObject $problem_strategems_set_aside;

        public SubLObject $problem_strategems_thrown_away;

        private static final SubLStructDeclNative structDecl;

        private $transformation_strategy_data_native() {
            this.$link_heads_motivated = Lisp.NIL;
            this.$problems_pending = Lisp.NIL;
            this.$transformation_strategem_index = Lisp.NIL;
            this.$problem_total_strategems_active = Lisp.NIL;
            this.$problem_strategems_set_aside = Lisp.NIL;
            this.$problem_strategems_thrown_away = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$link_heads_motivated;
        }

        @Override
        public SubLObject getField3() {
            return this.$problems_pending;
        }

        @Override
        public SubLObject getField4() {
            return this.$transformation_strategem_index;
        }

        @Override
        public SubLObject getField5() {
            return this.$problem_total_strategems_active;
        }

        @Override
        public SubLObject getField6() {
            return this.$problem_strategems_set_aside;
        }

        @Override
        public SubLObject getField7() {
            return this.$problem_strategems_thrown_away;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$link_heads_motivated = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$problems_pending = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$transformation_strategem_index = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$problem_total_strategems_active = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$problem_strategems_set_aside = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$problem_strategems_thrown_away = value;
        }

        static {
            structDecl = makeStructDeclNative($transformation_strategy_data_native.class, TRANSFORMATION_STRATEGY_DATA, TRANSFORMATION_STRATEGY_DATA_P, $list3, $list4, new String[]{ "$link_heads_motivated", "$problems_pending", "$transformation_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away" }, $list5, $list6, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $transformation_strategy_data_p$UnaryFunction extends UnaryFunction {
        public $transformation_strategy_data_p$UnaryFunction() {
            super(extractFunctionNamed("TRANSFORMATION-STRATEGY-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return transformation_strategy_data_p(arg1);
        }
    }
}

/**
 * Total time: 167 ms
 */
