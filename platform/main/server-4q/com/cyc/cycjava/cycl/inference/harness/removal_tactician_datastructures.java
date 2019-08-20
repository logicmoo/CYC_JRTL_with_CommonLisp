package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.stacks;
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

public class removal_tactician_datastructures extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "a4b0b96c176ea673446896c7c84adff32bd51b3f9cdc52dae95491107a9cfb04";
    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLSymbol $dtp_removal_strategy_data$;
    private static SubLSymbol $sym0$REMOVAL_STRATEGY_DATA;
    private static SubLSymbol $sym1$REMOVAL_STRATEGY_DATA_P;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym7$REMOVAL_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list8;
    private static SubLSymbol $sym9$REM_STRAT_DATA_LINK_HEADS_MOTIVATED;
    private static SubLSymbol $sym10$_CSETF_REM_STRAT_DATA_LINK_HEADS_MOTIVATED;
    private static SubLSymbol $sym11$REM_STRAT_DATA_PROBLEMS_PENDING;
    private static SubLSymbol $sym12$_CSETF_REM_STRAT_DATA_PROBLEMS_PENDING;
    private static SubLSymbol $sym13$REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX;
    private static SubLSymbol $sym14$_CSETF_REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX;
    private static SubLSymbol $sym15$REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
    private static SubLSymbol $sym16$_CSETF_REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
    private static SubLSymbol $sym17$REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE;
    private static SubLSymbol $sym18$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE;
    private static SubLSymbol $sym19$REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY;
    private static SubLSymbol $sym20$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY;
    private static SubLSymbol $LINK_HEADS_MOTIVATED;
    private static SubLSymbol $PROBLEMS_PENDING;
    private static SubLSymbol $REMOVAL_STRATEGEM_INDEX;
    private static SubLSymbol $PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
    private static SubLSymbol $PROBLEM_STRATEGEMS_SET_ASIDE;
    private static SubLSymbol $PROBLEM_STRATEGEMS_THROWN_AWAY;
    private static SubLString $str27$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym29$MAKE_REMOVAL_STRATEGY_DATA;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym32$VISIT_DEFSTRUCT_OBJECT_REMOVAL_STRATEGY_DATA_METHOD;
    private static SubLSymbol $sym33$REMOVAL_STRATEGY_P;
    private static SubLSymbol $sym34$MOTIVATION_STRATEGEM_P;
    private static SubLSymbol $sym35$CONNECTED_CONJUNCTION_LINK_P;
    private static SubLSymbol $sym36$PROBLEM_P;
    private static SubLSymbol $sym37$STRATEGEM_P;
    private static SubLSymbol $sym38$REMOVAL_STRATEGEM_P;
    private static SubLSymbol $SPLIT;

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject removal_strategy_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject removal_strategy_data_p(SubLObject v_object) {
        return (v_object.getClass() == $removal_strategy_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject rem_strat_data_link_heads_motivated(SubLObject v_object) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject rem_strat_data_problems_pending(SubLObject v_object) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject rem_strat_data_removal_strategem_index(SubLObject v_object) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject rem_strat_data_problem_total_strategems_active(SubLObject v_object) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject rem_strat_data_problem_strategems_set_aside(SubLObject v_object) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject rem_strat_data_problem_strategems_thrown_away(SubLObject v_object) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject _csetf_rem_strat_data_link_heads_motivated(SubLObject v_object, SubLObject value) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject _csetf_rem_strat_data_problems_pending(SubLObject v_object, SubLObject value) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject _csetf_rem_strat_data_removal_strategem_index(SubLObject v_object, SubLObject value) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject _csetf_rem_strat_data_problem_total_strategems_active(SubLObject v_object, SubLObject value) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject _csetf_rem_strat_data_problem_strategems_set_aside(SubLObject v_object, SubLObject value) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject _csetf_rem_strat_data_problem_strategems_thrown_away(SubLObject v_object, SubLObject value) {
        assert NIL != removal_strategy_data_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject make_removal_strategy_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $removal_strategy_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LINK_HEADS_MOTIVATED)) {
                _csetf_rem_strat_data_link_heads_motivated(v_new, current_value);
            } else if (pcase_var.eql($PROBLEMS_PENDING)) {
                _csetf_rem_strat_data_problems_pending(v_new, current_value);
            } else if (pcase_var.eql($REMOVAL_STRATEGEM_INDEX)) {
                _csetf_rem_strat_data_removal_strategem_index(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_TOTAL_STRATEGEMS_ACTIVE)) {
                _csetf_rem_strat_data_problem_total_strategems_active(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_STRATEGEMS_SET_ASIDE)) {
                _csetf_rem_strat_data_problem_strategems_set_aside(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_STRATEGEMS_THROWN_AWAY)) {
                _csetf_rem_strat_data_problem_strategems_thrown_away(v_new, current_value);
            } else {
                Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject visit_defstruct_removal_strategy_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym29$MAKE_REMOVAL_STRATEGY_DATA, SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $LINK_HEADS_MOTIVATED, rem_strat_data_link_heads_motivated(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEMS_PENDING, rem_strat_data_problems_pending(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $REMOVAL_STRATEGEM_INDEX, rem_strat_data_removal_strategem_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_TOTAL_STRATEGEMS_ACTIVE, rem_strat_data_problem_total_strategems_active(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_STRATEGEMS_SET_ASIDE, rem_strat_data_problem_strategems_set_aside(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_STRATEGEMS_THROWN_AWAY, rem_strat_data_problem_strategems_thrown_away(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym29$MAKE_REMOVAL_STRATEGY_DATA, SIX_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1300L)
    public static SubLObject visit_defstruct_object_removal_strategy_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_removal_strategy_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 2700L)
    public static SubLObject new_removal_strategy_data(SubLObject removal_index) {
        SubLObject data = make_removal_strategy_data(UNPROVIDED);
        _csetf_rem_strat_data_link_heads_motivated(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_rem_strat_data_problems_pending(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_rem_strat_data_removal_strategem_index(data, removal_index);
        _csetf_rem_strat_data_problem_total_strategems_active(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_rem_strat_data_problem_strategems_set_aside(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_rem_strat_data_problem_strategems_thrown_away(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        return data;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 3400L)
    public static SubLObject removal_strategy_link_heads_motivated(SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return rem_strat_data_link_heads_motivated(data);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 3600L)
    public static SubLObject removal_strategy_problems_pending(SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return rem_strat_data_problems_pending(data);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 4000L)
    public static SubLObject removal_strategy_strategem_index(SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return rem_strat_data_removal_strategem_index(data);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 4200L)
    public static SubLObject removal_strategy_problem_total_strategems_active(SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return rem_strat_data_problem_total_strategems_active(data);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 4500L)
    public static SubLObject removal_strategy_problem_strategems_set_aside(SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return rem_strat_data_problem_strategems_set_aside(data);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 4800L)
    public static SubLObject removal_strategy_problem_strategems_thrown_away(SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return rem_strat_data_problem_strategems_thrown_away(data);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 5100L)
    public static SubLObject removal_strategy_link_head_motivatedP(SubLObject strategy, SubLObject link_head) {
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        return set.set_memberP(link_head, removal_strategy_link_heads_motivated(strategy));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 5400L)
    public static SubLObject removal_strategy_connected_conjunction_link_motivatedP(SubLObject strategy, SubLObject connected_conjunction_link) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert NIL != inference_worker.connected_conjunction_link_p(connected_conjunction_link) : connected_conjunction_link;
        SubLObject link_head = inference_worker.connected_conjunction_link_tactic(connected_conjunction_link);
        return removal_strategy_link_head_motivatedP(strategy, link_head);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 5800L)
    public static SubLObject removal_strategy_problem_pendingP(SubLObject strategy, SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return set.set_memberP(problem, removal_strategy_problems_pending(strategy));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 6000L)
    public static SubLObject removal_strategy_problem_activeP(SubLObject strategy, SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject index = removal_strategy_problem_total_strategems_active(strategy);
        return Numbers.plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 6300L)
    public static SubLObject removal_strategy_problem_set_asideP(SubLObject strategy, SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        if (NIL == removal_strategy_problem_activeP(strategy, problem)) {
            SubLObject index = removal_strategy_problem_strategems_set_aside(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL != v_set && NIL == set.set_emptyP(v_set)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 6800L)
    public static SubLObject removal_strategy_strategem_set_asideP(SubLObject strategy, SubLObject strategem) {
        assert NIL != inference_tactician.strategem_p(strategem) : strategem;
        SubLObject problem = inference_tactician.strategem_problem(strategem);
        SubLObject index = removal_strategy_problem_strategems_set_aside(strategy);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        return makeBoolean(NIL != set.set_p(v_set) && NIL != set.set_memberP(strategem, v_set));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 7300L)
    public static SubLObject removal_strategy_strategem_thrown_awayP(SubLObject strategy, SubLObject strategem) {
        assert NIL != inference_tactician.strategem_p(strategem) : strategem;
        SubLObject problem = inference_tactician.strategem_problem(strategem);
        SubLObject index = removal_strategy_problem_strategems_thrown_away(strategy);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        return makeBoolean(NIL != set.set_p(v_set) && NIL != set.set_memberP(strategem, v_set));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 7700L)
    public static SubLObject removal_strategy_removal_backtracking_productivity_limit(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_removal_backtracking_productivity_limit(strategy);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 8000L)
    public static SubLObject removal_strategy_peek_strategem(SubLObject strategy) {
        SubLObject removal_index = removal_strategy_strategem_index(strategy);
        if (NIL == stacks.stack_empty_p(removal_index)) {
            return stacks.stack_peek(removal_index);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 8300L)
    public static SubLObject removal_strategy_note_problem_motivated(SubLObject strategy, SubLObject problem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 8500L)
    public static SubLObject removal_strategy_note_link_head_motivated(SubLObject strategy, SubLObject link_head) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        return set.set_add(link_head, removal_strategy_link_heads_motivated(strategy));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 8800L)
    public static SubLObject removal_strategy_note_problem_pending(SubLObject strategy, SubLObject problem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        set.set_add(problem, removal_strategy_problems_pending(strategy));
        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 9100L)
    public static SubLObject removal_strategy_note_problem_unpending(SubLObject strategy, SubLObject problem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        set.set_remove(problem, removal_strategy_problems_pending(strategy));
        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away(problem, strategy);
        inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem, strategy);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 9500L)
    public static SubLObject removal_strategy_activate_strategem(SubLObject strategy, SubLObject strategem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.removal_strategem_p(strategem) : strategem;
        SubLObject removal_index = removal_strategy_strategem_index(strategy);
        stacks.stack_push(strategem, removal_index);
        SubLObject problem = inference_tactician.strategem_problem(strategem);
        SubLObject index = removal_strategy_problem_total_strategems_active(strategy);
        SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
        count = Numbers.add(count, ONE_INTEGER);
        if (ONE_INTEGER.numE(count)) {
            removal_strategy_note_problem_unpending(strategy, problem);
        }
        dictionary.dictionary_enter(index, problem, count);
        return count;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 10200L)
    public static SubLObject removal_strategy_force_done(SubLObject strategy) {
        stacks.clear_stack(removal_strategy_strategem_index(strategy));
        dictionary.clear_dictionary(removal_strategy_problem_total_strategems_active(strategy));
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 10500L)
    public static SubLObject removal_strategy_current_contents(SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        return stacks.stack_elements(removal_strategy_strategem_index(strategy));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 10700L)
    public static SubLObject removal_strategy_pop_strategem(SubLObject strategy) {
        SubLObject removal_index = removal_strategy_strategem_index(strategy);
        return stacks.stack_pop(removal_index);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 10900L)
    public static SubLObject removal_strategy_note_strategem_set_aside(SubLObject strategy, SubLObject strategem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.removal_strategem_p(strategem) : strategem;
        SubLObject index = removal_strategy_problem_strategems_set_aside(strategy);
        SubLObject problem = inference_tactician.strategem_problem(strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            inference_datastructures_strategy.set_tactic_set_aside(strategem, strategy, UNPROVIDED);
        }
        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy);
        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
        if (NIL == set.set_p(v_set)) {
            v_set = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set.set_add(strategem, v_set);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 11600L)
    public static SubLObject removal_strategy_clear_strategems_set_aside(SubLObject strategy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        SubLObject index = removal_strategy_problem_strategems_set_aside(strategy);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject strategem_set = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                removal_strategy_note_problem_unpending(strategy, problem);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(index);
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 12000L)
    public static SubLObject removal_strategy_note_strategem_thrown_away(SubLObject strategy, SubLObject strategem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.removal_strategem_p(strategem) : strategem;
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            inference_datastructures_strategy.set_tactic_thrown_away(strategem, strategy, UNPROVIDED);
            if (NIL != inference_worker_split.split_tactic_p(strategem)) {
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(strategem));
                SubLObject sibling_split_tactic = NIL;
                sibling_split_tactic = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_split_tactic, $SPLIT) && !sibling_split_tactic.eql(strategem)) {
                        inference_datastructures_strategy.set_tactic_recompute_set_aside(sibling_split_tactic, strategy);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sibling_split_tactic = cdolist_list_var.first();
                }
            }
        }
        SubLObject index = removal_strategy_problem_strategems_thrown_away(strategy);
        SubLObject problem = inference_tactician.strategem_problem(strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (NIL == set.set_p(v_set)) {
            v_set = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set.set_add(strategem, v_set);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 13000L)
    public static SubLObject removal_strategy_no_strategems_activeP(SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        return stacks.stack_empty_p(removal_strategy_strategem_index(strategy));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 13200L)
    public static SubLObject removal_strategy_clear_set_aside_problems(SubLObject strategy) {
        removal_strategy_clear_strategems_set_aside(strategy);
        return strategy;
    }

    public static SubLObject declare_removal_tactician_datastructures_file() {
        declareFunction("removal_strategy_data_print_function_trampoline", "REMOVAL-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("removal_strategy_data_p", "REMOVAL-STRATEGY-DATA-P", 1, 0, false);
        new $removal_strategy_data_p$UnaryFunction();
        declareFunction("rem_strat_data_link_heads_motivated", "REM-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction("rem_strat_data_problems_pending", "REM-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false);
        declareFunction("rem_strat_data_removal_strategem_index", "REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("rem_strat_data_problem_total_strategems_active", "REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction("rem_strat_data_problem_strategems_set_aside", "REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("rem_strat_data_problem_strategems_thrown_away", "REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction("_csetf_rem_strat_data_link_heads_motivated", "_CSETF-REM-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false);
        declareFunction("_csetf_rem_strat_data_problems_pending", "_CSETF-REM-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false);
        declareFunction("_csetf_rem_strat_data_removal_strategem_index", "_CSETF-REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX", 2, 0, false);
        declareFunction("_csetf_rem_strat_data_problem_total_strategems_active", "_CSETF-REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false);
        declareFunction("_csetf_rem_strat_data_problem_strategems_set_aside", "_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false);
        declareFunction("_csetf_rem_strat_data_problem_strategems_thrown_away", "_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false);
        declareFunction("make_removal_strategy_data", "MAKE-REMOVAL-STRATEGY-DATA", 0, 1, false);
        declareFunction("visit_defstruct_removal_strategy_data", "VISIT-DEFSTRUCT-REMOVAL-STRATEGY-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_removal_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-STRATEGY-DATA-METHOD", 2, 0, false);
        declareFunction("new_removal_strategy_data", "NEW-REMOVAL-STRATEGY-DATA", 1, 0, false);
        declareFunction("removal_strategy_link_heads_motivated", "REMOVAL-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction("removal_strategy_problems_pending", "REMOVAL-STRATEGY-PROBLEMS-PENDING", 1, 0, false);
        declareFunction("removal_strategy_strategem_index", "REMOVAL-STRATEGY-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("removal_strategy_problem_total_strategems_active", "REMOVAL-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction("removal_strategy_problem_strategems_set_aside", "REMOVAL-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("removal_strategy_problem_strategems_thrown_away", "REMOVAL-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction("removal_strategy_link_head_motivatedP", "REMOVAL-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
        declareFunction("removal_strategy_connected_conjunction_link_motivatedP", "REMOVAL-STRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED?", 2, 0, false);
        declareFunction("removal_strategy_problem_pendingP", "REMOVAL-STRATEGY-PROBLEM-PENDING?", 2, 0, false);
        declareFunction("removal_strategy_problem_activeP", "REMOVAL-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        declareFunction("removal_strategy_problem_set_asideP", "REMOVAL-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false);
        declareFunction("removal_strategy_strategem_set_asideP", "REMOVAL-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false);
        declareFunction("removal_strategy_strategem_thrown_awayP", "REMOVAL-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false);
        declareFunction("removal_strategy_removal_backtracking_productivity_limit", "REMOVAL-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction("removal_strategy_peek_strategem", "REMOVAL-STRATEGY-PEEK-STRATEGEM", 1, 0, false);
        declareFunction("removal_strategy_note_problem_motivated", "REMOVAL-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction("removal_strategy_note_link_head_motivated", "REMOVAL-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false);
        declareFunction("removal_strategy_note_problem_pending", "REMOVAL-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false);
        declareFunction("removal_strategy_note_problem_unpending", "REMOVAL-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false);
        declareFunction("removal_strategy_activate_strategem", "REMOVAL-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_force_done", "REMOVAL-STRATEGY-FORCE-DONE", 1, 0, false);
        declareFunction("removal_strategy_current_contents", "REMOVAL-STRATEGY-CURRENT-CONTENTS", 1, 0, false);
        declareFunction("removal_strategy_pop_strategem", "REMOVAL-STRATEGY-POP-STRATEGEM", 1, 0, false);
        declareFunction("removal_strategy_note_strategem_set_aside", "REMOVAL-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false);
        declareFunction("removal_strategy_clear_strategems_set_aside", "REMOVAL-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("removal_strategy_note_strategem_thrown_away", "REMOVAL-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false);
        declareFunction("removal_strategy_no_strategems_activeP", "REMOVAL-STRATEGY-NO-STRATEGEMS-ACTIVE?", 1, 0, false);
        declareFunction("removal_strategy_clear_set_aside_problems", "REMOVAL-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_tactician_datastructures_file() {
        $dtp_removal_strategy_data$ = defconstant("*DTP-REMOVAL-STRATEGY-DATA*", $sym0$REMOVAL_STRATEGY_DATA);
        return NIL;
    }

    public static SubLObject setup_removal_tactician_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_removal_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym7$REMOVAL_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        Structures.def_csetf($sym9$REM_STRAT_DATA_LINK_HEADS_MOTIVATED, $sym10$_CSETF_REM_STRAT_DATA_LINK_HEADS_MOTIVATED);
        Structures.def_csetf($sym11$REM_STRAT_DATA_PROBLEMS_PENDING, $sym12$_CSETF_REM_STRAT_DATA_PROBLEMS_PENDING);
        Structures.def_csetf($sym13$REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX, $sym14$_CSETF_REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX);
        Structures.def_csetf($sym15$REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, $sym16$_CSETF_REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE);
        Structures.def_csetf($sym17$REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, $sym18$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE);
        Structures.def_csetf($sym19$REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, $sym20$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY);
        Equality.identity($sym0$REMOVAL_STRATEGY_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_removal_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym32$VISIT_DEFSTRUCT_OBJECT_REMOVAL_STRATEGY_DATA_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_tactician_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_tactician_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_tactician_datastructures_file();
    }

    static {
        me = new removal_tactician_datastructures();
        $dtp_removal_strategy_data$ = null;
        $sym0$REMOVAL_STRATEGY_DATA = makeSymbol("REMOVAL-STRATEGY-DATA");
        $sym1$REMOVAL_STRATEGY_DATA_P = makeSymbol("REMOVAL-STRATEGY-DATA-P");
        $list2 = list(makeSymbol("LINK-HEADS-MOTIVATED"), makeSymbol("PROBLEMS-PENDING"), makeSymbol("REMOVAL-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $list3 = list(makeKeyword("LINK-HEADS-MOTIVATED"), makeKeyword("PROBLEMS-PENDING"), makeKeyword("REMOVAL-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $list4 = list(makeSymbol("REM-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("REM-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX"), makeSymbol("REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"),
                makeSymbol("REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $list5 = list(makeSymbol("_CSETF-REM-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("_CSETF-REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX"), makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"),
                makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$REMOVAL_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOVAL-STRATEGY-DATA-P"));
        $sym9$REM_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("REM-STRAT-DATA-LINK-HEADS-MOTIVATED");
        $sym10$_CSETF_REM_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("_CSETF-REM-STRAT-DATA-LINK-HEADS-MOTIVATED");
        $sym11$REM_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("REM-STRAT-DATA-PROBLEMS-PENDING");
        $sym12$_CSETF_REM_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEMS-PENDING");
        $sym13$REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX = makeSymbol("REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX");
        $sym14$_CSETF_REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX = makeSymbol("_CSETF-REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX");
        $sym15$REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $sym16$_CSETF_REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $sym17$REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
        $sym18$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
        $sym19$REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
        $sym20$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
        $LINK_HEADS_MOTIVATED = makeKeyword("LINK-HEADS-MOTIVATED");
        $PROBLEMS_PENDING = makeKeyword("PROBLEMS-PENDING");
        $REMOVAL_STRATEGEM_INDEX = makeKeyword("REMOVAL-STRATEGEM-INDEX");
        $PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $PROBLEM_STRATEGEMS_SET_ASIDE = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE");
        $PROBLEM_STRATEGEMS_THROWN_AWAY = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY");
        $str27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym29$MAKE_REMOVAL_STRATEGY_DATA = makeSymbol("MAKE-REMOVAL-STRATEGY-DATA");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym32$VISIT_DEFSTRUCT_OBJECT_REMOVAL_STRATEGY_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-STRATEGY-DATA-METHOD");
        $sym33$REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");
        $sym34$MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");
        $sym35$CONNECTED_CONJUNCTION_LINK_P = makeSymbol("CONNECTED-CONJUNCTION-LINK-P");
        $sym36$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym37$STRATEGEM_P = makeSymbol("STRATEGEM-P");
        $sym38$REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");
        $SPLIT = makeKeyword("SPLIT");
    }

    public static class $removal_strategy_data_native extends SubLStructNative {
        public SubLObject $link_heads_motivated;
        public SubLObject $problems_pending;
        public SubLObject $removal_strategem_index;
        public SubLObject $problem_total_strategems_active;
        public SubLObject $problem_strategems_set_aside;
        public SubLObject $problem_strategems_thrown_away;
        private static SubLStructDeclNative structDecl;

        public $removal_strategy_data_native() {
            this.$link_heads_motivated = CommonSymbols.NIL;
            this.$problems_pending = CommonSymbols.NIL;
            this.$removal_strategem_index = CommonSymbols.NIL;
            this.$problem_total_strategems_active = CommonSymbols.NIL;
            this.$problem_strategems_set_aside = CommonSymbols.NIL;
            this.$problem_strategems_thrown_away = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $removal_strategy_data_native.structDecl;
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
            return this.$removal_strategem_index;
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
            return this.$removal_strategem_index = value;
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
            structDecl = Structures.makeStructDeclNative($removal_strategy_data_native.class, $sym0$REMOVAL_STRATEGY_DATA, $sym1$REMOVAL_STRATEGY_DATA_P, $list2, $list3,
                    new String[] { "$link_heads_motivated", "$problems_pending", "$removal_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away" }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $removal_strategy_data_p$UnaryFunction extends UnaryFunction {
        public $removal_strategy_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-STRATEGY-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_strategy_data_p(arg1);
        }
    }
}
/*
 *
 * Total time: 124 ms
 *
 */