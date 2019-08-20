package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class transformation_tactician_datastructures extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "6ad4b0ffb58b93181d8313911c6e993da5e26c9bedeb6e22b1c5d626f18d475c";
    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLSymbol $dtp_transformation_strategy_data$;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $sym1$TRANSFORMATION_STRATEGY_DATA;
    private static SubLSymbol $sym2$TRANSFORMATION_STRATEGY_DATA_P;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLList $list6;
    private static SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list9;
    private static SubLSymbol $sym10$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED;
    private static SubLSymbol $sym11$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED;
    private static SubLSymbol $sym12$TRANS_STRAT_DATA_PROBLEMS_PENDING;
    private static SubLSymbol $sym13$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING;
    private static SubLSymbol $sym14$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX;
    private static SubLSymbol $sym15$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX;
    private static SubLSymbol $sym16$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
    private static SubLSymbol $sym17$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
    private static SubLSymbol $sym18$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE;
    private static SubLSymbol $sym19$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE;
    private static SubLSymbol $sym20$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY;
    private static SubLSymbol $sym21$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY;
    private static SubLSymbol $LINK_HEADS_MOTIVATED;
    private static SubLSymbol $PROBLEMS_PENDING;
    private static SubLSymbol $TRANSFORMATION_STRATEGEM_INDEX;
    private static SubLSymbol $PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
    private static SubLSymbol $PROBLEM_STRATEGEMS_SET_ASIDE;
    private static SubLSymbol $PROBLEM_STRATEGEMS_THROWN_AWAY;
    private static SubLString $str28$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD;
    private static SubLSymbol $sym34$TRANSFORMATION_STRATEGY_P;
    private static SubLSymbol $sym35$PROBLEM_P;
    private static SubLSymbol $sym36$MOTIVATION_STRATEGEM_P;
    private static SubLSymbol $sym37$STRATEGEM_P;
    private static SubLSymbol $sym38$TRANSFORMATION_STRATEGEM_P;

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 900L)
    public static SubLObject transformation_strategy_motivation_p(SubLObject v_object) {
        return Equality.eq(v_object, $TRANSFORMATION);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject transformation_strategy_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject transformation_strategy_data_p(SubLObject v_object) {
        return (v_object.getClass() == $transformation_strategy_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject trans_strat_data_link_heads_motivated(SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject trans_strat_data_problems_pending(SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject trans_strat_data_transformation_strategem_index(SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject trans_strat_data_problem_total_strategems_active(SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject trans_strat_data_problem_strategems_set_aside(SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject trans_strat_data_problem_strategems_thrown_away(SubLObject v_object) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject _csetf_trans_strat_data_link_heads_motivated(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject _csetf_trans_strat_data_problems_pending(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject _csetf_trans_strat_data_transformation_strategem_index(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject _csetf_trans_strat_data_problem_total_strategems_active(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject _csetf_trans_strat_data_problem_strategems_set_aside(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject _csetf_trans_strat_data_problem_strategems_thrown_away(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject make_transformation_strategy_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $transformation_strategy_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LINK_HEADS_MOTIVATED)) {
                _csetf_trans_strat_data_link_heads_motivated(v_new, current_value);
            } else if (pcase_var.eql($PROBLEMS_PENDING)) {
                _csetf_trans_strat_data_problems_pending(v_new, current_value);
            } else if (pcase_var.eql($TRANSFORMATION_STRATEGEM_INDEX)) {
                _csetf_trans_strat_data_transformation_strategem_index(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_TOTAL_STRATEGEMS_ACTIVE)) {
                _csetf_trans_strat_data_problem_total_strategems_active(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_STRATEGEMS_SET_ASIDE)) {
                _csetf_trans_strat_data_problem_strategems_set_aside(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_STRATEGEMS_THROWN_AWAY)) {
                _csetf_trans_strat_data_problem_strategems_thrown_away(v_new, current_value);
            } else {
                Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject visit_defstruct_transformation_strategy_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA, SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $LINK_HEADS_MOTIVATED, trans_strat_data_link_heads_motivated(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEMS_PENDING, trans_strat_data_problems_pending(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TRANSFORMATION_STRATEGEM_INDEX, trans_strat_data_transformation_strategem_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_TOTAL_STRATEGEMS_ACTIVE, trans_strat_data_problem_total_strategems_active(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_STRATEGEMS_SET_ASIDE, trans_strat_data_problem_strategems_set_aside(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_STRATEGEMS_THROWN_AWAY, trans_strat_data_problem_strategems_thrown_away(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA, SIX_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1400L)
    public static SubLObject visit_defstruct_object_transformation_strategy_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_transformation_strategy_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 2800L)
    public static SubLObject transformation_strategy_p(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object) && $TRANSFORMATION == inference_datastructures_strategy.strategy_type(v_object)) || NIL != abductive_tactician.abductive_strategy_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 3100L)
    public static SubLObject new_transformation_strategy_data(SubLObject transformation_index) {
        SubLObject data = make_transformation_strategy_data(UNPROVIDED);
        _csetf_trans_strat_data_link_heads_motivated(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_trans_strat_data_problems_pending(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_trans_strat_data_transformation_strategem_index(data, transformation_index);
        _csetf_trans_strat_data_problem_total_strategems_active(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_trans_strat_data_problem_strategems_set_aside(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_trans_strat_data_problem_strategems_thrown_away(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        return data;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 3900L)
    public static SubLObject transformation_strategy_link_heads_motivated(SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_link_heads_motivated(data);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 4200L)
    public static SubLObject transformation_strategy_problems_pending(SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problems_pending(data);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 4400L)
    public static SubLObject transformation_strategy_transformation_strategem_index(SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_transformation_strategem_index(data);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 4700L)
    public static SubLObject transformation_strategy_problem_total_strategems_active(SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problem_total_strategems_active(data);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 5000L)
    public static SubLObject transformation_strategy_problem_strategems_set_aside(SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problem_strategems_set_aside(data);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 5300L)
    public static SubLObject transformation_strategy_problem_strategems_thrown_away(SubLObject strategy) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problem_strategems_thrown_away(data);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 5700L)
    public static SubLObject transformation_strategy_problem_motivatedP(SubLObject strategy, SubLObject problem) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return inference_datastructures_strategy.problem_motivatedP(problem, strategy);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6000L)
    public static SubLObject transformation_strategy_link_head_motivatedP(SubLObject strategy, SubLObject link_head) {
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        return set.set_memberP(link_head, transformation_strategy_link_heads_motivated(strategy));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6300L)
    public static SubLObject transformation_strategy_problem_pendingP(SubLObject strategy, SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return set.set_memberP(problem, transformation_strategy_problems_pending(strategy));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6500L)
    public static SubLObject transformation_strategy_problem_activeP(SubLObject strategy, SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject index = transformation_strategy_problem_total_strategems_active(strategy);
        return Numbers.plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6900L)
    public static SubLObject transformation_strategy_problem_set_asideP(SubLObject strategy, SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        if (NIL == transformation_strategy_problem_activeP(strategy, problem)) {
            SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL != v_set && NIL == set.set_emptyP(v_set)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 7900L)
    public static SubLObject transformation_strategy_strategem_set_asideP(SubLObject strategy, SubLObject strategem) {
        assert NIL != inference_tactician.strategem_p(strategem) : strategem;
        SubLObject problem = inference_tactician.strategem_problem(strategem);
        SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        return makeBoolean(NIL != set.set_p(v_set) && NIL != set.set_memberP(strategem, v_set));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 8400L)
    public static SubLObject transformation_strategy_strategem_thrown_awayP(SubLObject strategy, SubLObject strategem) {
        assert NIL != inference_tactician.strategem_p(strategem) : strategem;
        SubLObject problem = inference_tactician.strategem_problem(strategem);
        SubLObject index = transformation_strategy_problem_strategems_thrown_away(strategy);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        return makeBoolean(NIL != set.set_p(v_set) && NIL != set.set_memberP(strategem, v_set));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 8900L)
    public static SubLObject transformation_strategy_note_problem_motivated(SubLObject strategy, SubLObject problem) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9100L)
    public static SubLObject transformation_strategy_note_link_head_motivated(SubLObject strategy, SubLObject link_head) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        return set.set_add(link_head, transformation_strategy_link_heads_motivated(strategy));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9400L)
    public static SubLObject transformation_strategy_note_problem_pending(SubLObject strategy, SubLObject problem) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return set.set_add(problem, transformation_strategy_problems_pending(strategy));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9700L)
    public static SubLObject transformation_strategy_note_problem_unpending(SubLObject strategy, SubLObject problem) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return set.set_remove(problem, transformation_strategy_problems_pending(strategy));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9900L)
    public static SubLObject transformation_strategy_activate_strategem(SubLObject strategy, SubLObject transformation_strategem) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : transformation_strategem;
        if (NIL != inference_worker_transformation.transformation_tactic_p(transformation_strategem) && NIL != inference_datastructures_tactic.tactic_executedP(transformation_strategem)) {
            return transformation_tactician_motivation.transformation_strategy_activate_transformation_argument_links(strategy, inference_datastructures_tactic.tactic_problem(transformation_strategem));
        }
        SubLObject result = NIL;
        result = transformation_tactician.transformation_strategy_activate_strategem_low(strategy, transformation_strategem);
        if (NIL != result) {
            SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
            SubLObject index = transformation_strategy_problem_total_strategems_active(strategy);
            SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
            count = Numbers.add(count, ONE_INTEGER);
            if (ONE_INTEGER.numE(count)) {
                transformation_strategy_note_problem_unpending(strategy, problem);
            }
            dictionary.dictionary_enter(index, problem, count);
            return count;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 11500L)
    public static SubLObject transformation_strategy_note_strategem_set_aside(SubLObject strategy, SubLObject transformation_strategem) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : transformation_strategem;
        SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
        SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (NIL == set.set_p(v_set)) {
            v_set = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set.set_add(transformation_strategem, v_set);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 12100L)
    public static SubLObject transformation_strategy_clear_strategems_set_aside(SubLObject strategy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != transformation_strategy_p(strategy) : strategy;
        SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject strategem_set = thread.secondMultipleValue();
            thread.resetMultipleValues();
            transformation_strategy_note_problem_unpending(strategy, problem);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(index);
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 12500L)
    public static SubLObject transformation_strategy_note_strategem_thrown_away(SubLObject strategy, SubLObject transformation_strategem) {
        assert NIL != transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : transformation_strategem;
        SubLObject index = transformation_strategy_problem_strategems_thrown_away(strategy);
        SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (NIL == set.set_p(v_set)) {
            v_set = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set.set_add(transformation_strategem, v_set);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 13100L)
    public static SubLObject transformation_strategy_clear_set_aside_problems(SubLObject strategy) {
        transformation_strategy_clear_strategems_set_aside(strategy);
        return strategy;
    }

    public static SubLObject declare_transformation_tactician_datastructures_file() {
        declareFunction("transformation_strategy_motivation_p", "TRANSFORMATION-STRATEGY-MOTIVATION-P", 1, 0, false);
        declareFunction("transformation_strategy_data_print_function_trampoline", "TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("transformation_strategy_data_p", "TRANSFORMATION-STRATEGY-DATA-P", 1, 0, false);
        new $transformation_strategy_data_p$UnaryFunction();
        declareFunction("trans_strat_data_link_heads_motivated", "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction("trans_strat_data_problems_pending", "TRANS-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false);
        declareFunction("trans_strat_data_transformation_strategem_index", "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("trans_strat_data_problem_total_strategems_active", "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction("trans_strat_data_problem_strategems_set_aside", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("trans_strat_data_problem_strategems_thrown_away", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction("_csetf_trans_strat_data_link_heads_motivated", "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problems_pending", "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_transformation_strategem_index", "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problem_total_strategems_active", "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problem_strategems_set_aside", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problem_strategems_thrown_away", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false);
        declareFunction("make_transformation_strategy_data", "MAKE-TRANSFORMATION-STRATEGY-DATA", 0, 1, false);
        declareFunction("visit_defstruct_transformation_strategy_data", "VISIT-DEFSTRUCT-TRANSFORMATION-STRATEGY-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_transformation_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD", 2, 0, false);
        declareFunction("transformation_strategy_p", "TRANSFORMATION-STRATEGY-P", 1, 0, false);
        declareFunction("new_transformation_strategy_data", "NEW-TRANSFORMATION-STRATEGY-DATA", 1, 0, false);
        declareFunction("transformation_strategy_link_heads_motivated", "TRANSFORMATION-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction("transformation_strategy_problems_pending", "TRANSFORMATION-STRATEGY-PROBLEMS-PENDING", 1, 0, false);
        declareFunction("transformation_strategy_transformation_strategem_index", "TRANSFORMATION-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("transformation_strategy_problem_total_strategems_active", "TRANSFORMATION-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction("transformation_strategy_problem_strategems_set_aside", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("transformation_strategy_problem_strategems_thrown_away", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction("transformation_strategy_problem_motivatedP", "TRANSFORMATION-STRATEGY-PROBLEM-MOTIVATED?", 2, 0, false);
        declareFunction("transformation_strategy_link_head_motivatedP", "TRANSFORMATION-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
        declareFunction("transformation_strategy_problem_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-PENDING?", 2, 0, false);
        declareFunction("transformation_strategy_problem_activeP", "TRANSFORMATION-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        declareFunction("transformation_strategy_problem_set_asideP", "TRANSFORMATION-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false);
        declareFunction("transformation_strategy_strategem_set_asideP", "TRANSFORMATION-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false);
        declareFunction("transformation_strategy_strategem_thrown_awayP", "TRANSFORMATION-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false);
        declareFunction("transformation_strategy_note_problem_motivated", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction("transformation_strategy_note_link_head_motivated", "TRANSFORMATION-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false);
        declareFunction("transformation_strategy_note_problem_pending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false);
        declareFunction("transformation_strategy_note_problem_unpending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false);
        declareFunction("transformation_strategy_activate_strategem", "TRANSFORMATION-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("transformation_strategy_note_strategem_set_aside", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false);
        declareFunction("transformation_strategy_clear_strategems_set_aside", "TRANSFORMATION-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("transformation_strategy_note_strategem_thrown_away", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false);
        declareFunction("transformation_strategy_clear_set_aside_problems", "TRANSFORMATION-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_transformation_tactician_datastructures_file() {
        $dtp_transformation_strategy_data$ = defconstant("*DTP-TRANSFORMATION-STRATEGY-DATA*", $sym1$TRANSFORMATION_STRATEGY_DATA);
        return NIL;
    }

    public static SubLObject setup_transformation_tactician_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_transformation_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        Structures.def_csetf($sym10$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED, $sym11$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED);
        Structures.def_csetf($sym12$TRANS_STRAT_DATA_PROBLEMS_PENDING, $sym13$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING);
        Structures.def_csetf($sym14$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, $sym15$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX);
        Structures.def_csetf($sym16$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, $sym17$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE);
        Structures.def_csetf($sym18$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, $sym19$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE);
        Structures.def_csetf($sym20$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, $sym21$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY);
        Equality.identity($sym1$TRANSFORMATION_STRATEGY_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_transformation_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym33$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD));
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
        me = new transformation_tactician_datastructures();
        $dtp_transformation_strategy_data$ = null;
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $sym1$TRANSFORMATION_STRATEGY_DATA = makeSymbol("TRANSFORMATION-STRATEGY-DATA");
        $sym2$TRANSFORMATION_STRATEGY_DATA_P = makeSymbol("TRANSFORMATION-STRATEGY-DATA-P");
        $list3 = list(makeSymbol("LINK-HEADS-MOTIVATED"), makeSymbol("PROBLEMS-PENDING"), makeSymbol("TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $list4 = list(makeKeyword("LINK-HEADS-MOTIVATED"), makeKeyword("PROBLEMS-PENDING"), makeKeyword("TRANSFORMATION-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $list5 = list(makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"),
                makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $list6 = list(makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"),
                makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TRANSFORMATION-STRATEGY-DATA-P"));
        $sym10$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");
        $sym11$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");
        $sym12$TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING");
        $sym13$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING");
        $sym14$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");
        $sym15$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");
        $sym16$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $sym17$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $sym18$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
        $sym19$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
        $sym20$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
        $sym21$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
        $LINK_HEADS_MOTIVATED = makeKeyword("LINK-HEADS-MOTIVATED");
        $PROBLEMS_PENDING = makeKeyword("PROBLEMS-PENDING");
        $TRANSFORMATION_STRATEGEM_INDEX = makeKeyword("TRANSFORMATION-STRATEGEM-INDEX");
        $PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $PROBLEM_STRATEGEMS_SET_ASIDE = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE");
        $PROBLEM_STRATEGEMS_THROWN_AWAY = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY");
        $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA = makeSymbol("MAKE-TRANSFORMATION-STRATEGY-DATA");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD");
        $sym34$TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");
        $sym35$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym36$MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");
        $sym37$STRATEGEM_P = makeSymbol("STRATEGEM-P");
        $sym38$TRANSFORMATION_STRATEGEM_P = makeSymbol("TRANSFORMATION-STRATEGEM-P");
    }

    public static class $transformation_strategy_data_native extends SubLStructNative {
        public SubLObject $link_heads_motivated;
        public SubLObject $problems_pending;
        public SubLObject $transformation_strategem_index;
        public SubLObject $problem_total_strategems_active;
        public SubLObject $problem_strategems_set_aside;
        public SubLObject $problem_strategems_thrown_away;
        private static SubLStructDeclNative structDecl;

        public $transformation_strategy_data_native() {
            this.$link_heads_motivated = CommonSymbols.NIL;
            this.$problems_pending = CommonSymbols.NIL;
            this.$transformation_strategem_index = CommonSymbols.NIL;
            this.$problem_total_strategems_active = CommonSymbols.NIL;
            this.$problem_strategems_set_aside = CommonSymbols.NIL;
            this.$problem_strategems_thrown_away = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $transformation_strategy_data_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$link_heads_motivated = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$problems_pending = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$transformation_strategem_index = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$problem_total_strategems_active = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$problem_strategems_set_aside = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$problem_strategems_thrown_away = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($transformation_strategy_data_native.class, $sym1$TRANSFORMATION_STRATEGY_DATA, $sym2$TRANSFORMATION_STRATEGY_DATA_P, $list3, $list4,
                    new String[] { "$link_heads_motivated", "$problems_pending", "$transformation_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away" }, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $transformation_strategy_data_p$UnaryFunction extends UnaryFunction {
        public $transformation_strategy_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANSFORMATION-STRATEGY-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return transformation_strategy_data_p(arg1);
        }
    }
}
/*
 *
 * Total time: 167 ms
 *
 */