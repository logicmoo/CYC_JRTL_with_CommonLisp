package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class balancing_tactician extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.balancing_tactician";
    public static String myFingerPrint = "c0814c0b2dbac93f18034e1301faa03e86f47885d2ab7c11b10d789f1257e929";
    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLSymbol $dtp_balancing_tactician_data$;
    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 20200L)
    private static SubLSymbol $balancing_tactician_early_removal_productivity_limit$;
    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 24800L)
    private static SubLSymbol $balancing_tactician_self_looping_rule_fix_enabledP$;
    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 25100L)
    public static SubLSymbol $balancing_tactician_new_roots_check_for_t_on_jo_linkP$;
    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 28000L)
    private static SubLSymbol $balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$;
    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 35100L)
    private static SubLSymbol $balancing_tactician_is_tactically_hardcoreP$;
    private static SubLSymbol $BALANCING;
    private static SubLList $list1;
    private static SubLSymbol $sym2$BALANCING_TACTICIAN_DATA;
    private static SubLSymbol $sym3$BALANCING_TACTICIAN_DATA_P;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLList $list6;
    private static SubLList $list7;
    private static SubLSymbol $sym8$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym9$BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list10;
    private static SubLSymbol $sym11$BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY;
    private static SubLSymbol $sym12$_CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY;
    private static SubLSymbol $sym13$BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY;
    private static SubLSymbol $sym14$_CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY;
    private static SubLSymbol $sym15$BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES;
    private static SubLSymbol $sym16$_CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES;
    private static SubLSymbol $NEW_ROOT_SUBSTRATEGY;
    private static SubLSymbol $TRANSFORMATION_SUBSTRATEGY;
    private static SubLSymbol $REMOVAL_SUBSTRATEGIES;
    private static SubLString $str20$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym22$MAKE_BALANCING_TACTICIAN_DATA;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym25$VISIT_DEFSTRUCT_OBJECT_BALANCING_TACTICIAN_DATA_METHOD;
    private static SubLList $list26;
    private static SubLList $list27;
    private static SubLList $list28;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym31$CSOME;
    private static SubLSymbol $sym32$BALANCING_TACTICIAN_ALL_SUBSTRATEGIES;
    private static SubLSymbol $sym33$DO_BALANCING_TACTICIAN_SUBSTRATEGIES;
    private static SubLSymbol $sym34$PUNLESS;
    private static SubLSymbol $sym35$BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P;
    private static SubLSymbol $sym36$BALANCING_TACTICIAN_INITIALIZE;
    private static SubLSymbol $NEW_ROOT;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $sym40$BALANCING_TACTICIAN_P;
    private static SubLSymbol $sym41$BALANCING_TACTICIAN_DONE_;
    private static SubLSymbol $UNINTERESTING;
    private static SubLSymbol $sym43$BALANCING_TACTICIAN_DO_ONE_STEP;
    private static SubLSymbol $RECONSIDER_SET_ASIDES;
    private static SubLSymbol $PROPAGATE_ANSWER_LINK;
    private static SubLSymbol $INTERESTING;
    private static SubLSymbol $MOTIVATION;
    private static SubLString $str48$_a_do_one_step___a__;
    private static SubLSymbol $sym49$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_;
    private static SubLSymbol $sym50$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_;
    private static SubLSymbol $sym51$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_;
    private static SubLSymbol $sym52$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_;
    private static SubLSymbol $sym53$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_;
    private static SubLSymbol $sym54$BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES;
    private static SubLSymbol $sym55$BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED;
    private static SubLSymbol $sym56$BALANCING_TACTICIAN_INITIALIZE_PROPERTIES;
    private static SubLSymbol $sym57$BALANCING_TACTICIAN_UPDATE_PROPERTIES;
    private static SubLSymbol $sym58$BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES;
    private static SubLSymbol $sym59$BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $sym62$PROBLEM_LINK_P;
    private static SubLSymbol $COMPLETE;
    private static SubLSymbol $SIMPLIFICATION;
    private static SubLSymbol $sym65$BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK;
    private static SubLSymbol $sym66$BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT;
    private static SubLSymbol $sym67$BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED;
    private static SubLSymbol $SPLIT;
    private static SubLSymbol $UNION;
    private static SubLSymbol $sym70$TRANSFORMATION_STRATEGY_P;
    private static SubLSymbol $RESIDUAL_TRANSFORMATION;
    private static SubLSymbol $sym72$CONNECTED_CONJUNCTION_TACTIC_P;
    private static SubLSymbol $sym73$SPLIT_TACTIC_P;
    private static SubLSymbol $sym74$REMOVAL_STRATEGY_P;
    private static SubLSymbol $sym75$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV;
    private static SubLSymbol $sym76$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_;
    private static SubLSymbol $COMPLETE_REMOVAL_TACTIC_NO_GOOD;
    private static SubLSymbol $sym78$BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE;
    private static SubLSymbol $FINISHED;
    private static SubLSymbol $NO_GOOD;
    private static SubLSymbol $GOOD;
    private static SubLSymbol $NEUTRAL;
    private static SubLSymbol $POSSIBLE;
    private static SubLSymbol $PENDING;
    private static SubLSymbol $TACTICAL;
    private static SubLSymbol $CONNECTED_CONJUNCTION;

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject balancing_tactician_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject balancing_tactician_data_p(SubLObject v_object) {
        return (v_object.getClass() == $balancing_tactician_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject bal_tac_data_new_root_substrategy(SubLObject v_object) {
        assert NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject bal_tac_data_transformation_substrategy(SubLObject v_object) {
        assert NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject bal_tac_data_removal_substrategies(SubLObject v_object) {
        assert NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject _csetf_bal_tac_data_new_root_substrategy(SubLObject v_object, SubLObject value) {
        assert NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject _csetf_bal_tac_data_transformation_substrategy(SubLObject v_object, SubLObject value) {
        assert NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject _csetf_bal_tac_data_removal_substrategies(SubLObject v_object, SubLObject value) {
        assert NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject make_balancing_tactician_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $balancing_tactician_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NEW_ROOT_SUBSTRATEGY)) {
                _csetf_bal_tac_data_new_root_substrategy(v_new, current_value);
            } else if (pcase_var.eql($TRANSFORMATION_SUBSTRATEGY)) {
                _csetf_bal_tac_data_transformation_substrategy(v_new, current_value);
            } else if (pcase_var.eql($REMOVAL_SUBSTRATEGIES)) {
                _csetf_bal_tac_data_removal_substrategies(v_new, current_value);
            } else {
                Errors.error($str20$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject visit_defstruct_balancing_tactician_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym22$MAKE_BALANCING_TACTICIAN_DATA, THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $NEW_ROOT_SUBSTRATEGY, bal_tac_data_new_root_substrategy(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TRANSFORMATION_SUBSTRATEGY, bal_tac_data_transformation_substrategy(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $REMOVAL_SUBSTRATEGIES, bal_tac_data_removal_substrategies(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym22$MAKE_BALANCING_TACTICIAN_DATA, THREE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4200L)
    public static SubLObject visit_defstruct_object_balancing_tactician_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_balancing_tactician_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4500L)
    public static SubLObject balancing_tactician_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_strategy.strategy_p(v_object) && NIL != list_utilities.member_eqP(inference_datastructures_strategy.strategy_type(v_object), $list26));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4700L)
    public static SubLObject do_balancing_tactician_substrategies(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject substrategy_var = NIL;
        SubLObject strategy = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        substrategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list27);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list27);
            if (NIL == conses_high.member(current_$1, $list28, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list27);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym31$CSOME, list(substrategy_var, list($sym32$BALANCING_TACTICIAN_ALL_SUBSTRATEGIES, strategy), done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4900L)
    public static SubLObject do_balancing_tactician_spineful_substrategies(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject substrategy_var = NIL;
        SubLObject strategy = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        substrategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list27);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list27);
            if (NIL == conses_high.member(current_$2, $list28, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list27);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return list($sym33$DO_BALANCING_TACTICIAN_SUBSTRATEGIES, list(substrategy_var, strategy, $DONE, done), listS($sym34$PUNLESS, list($sym35$BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P, substrategy_var), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 5200L)
    public static SubLObject new_balancing_tactician_data(SubLObject new_root_substrategy, SubLObject transformation_substrategy, SubLObject removal_substrategies) {
        SubLObject data = make_balancing_tactician_data(UNPROVIDED);
        _csetf_bal_tac_data_new_root_substrategy(data, new_root_substrategy);
        _csetf_bal_tac_data_transformation_substrategy(data, transformation_substrategy);
        _csetf_bal_tac_data_removal_substrategies(data, removal_substrategies);
        return data;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 5700L)
    public static SubLObject balancing_tactician_initialize(SubLObject strategy) {
        inference_datastructures_strategy.set_strategy_data(strategy, new_balancing_tactician_data_from_inference(inference_datastructures_strategy.strategy_inference(strategy)));
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 5900L)
    public static SubLObject new_balancing_tactician_data_from_inference(SubLObject inference) {
        SubLObject new_root_substrategy = inference_datastructures_strategy.new_strategy($NEW_ROOT, inference);
        SubLObject transformation_substrategy = inference_datastructures_strategy.new_strategy($TRANSFORMATION, inference);
        SubLObject sole_removal_substrategy = inference_datastructures_strategy.new_strategy($REMOVAL, inference);
        return new_balancing_tactician_data(new_root_substrategy, transformation_substrategy, list(sole_removal_substrategy));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 6300L)
    public static SubLObject balancing_tactician_new_root_substrategy(SubLObject strategy) {
        assert NIL != balancing_tactician_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return bal_tac_data_new_root_substrategy(data);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 6500L)
    public static SubLObject balancing_tactician_transformation_substrategy(SubLObject strategy) {
        assert NIL != balancing_tactician_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return bal_tac_data_transformation_substrategy(data);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 6800L)
    public static SubLObject balancing_tactician_removal_substrategies(SubLObject strategy) {
        assert NIL != balancing_tactician_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return bal_tac_data_removal_substrategies(data);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7000L)
    public static SubLObject balancing_tactician_sole_removal_substrategy(SubLObject strategy) {
        assert NIL != balancing_tactician_p(strategy) : strategy;
        return list_utilities.only_one(balancing_tactician_removal_substrategies(strategy));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7200L)
    public static SubLObject balancing_tactician_all_substrategies(SubLObject strategy) {
        return listS(balancing_tactician_new_root_substrategy(strategy), balancing_tactician_transformation_substrategy(strategy), balancing_tactician_removal_substrategies(strategy));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7500L)
    public static SubLObject balancing_tactician_problem_motivated_wrt_nP(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, balancing_tactician_new_root_substrategy(strategy));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7700L)
    public static SubLObject balancing_tactician_problem_motivated_wrt_rP(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, balancing_tactician_sole_removal_substrategy(strategy));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7900L)
    public static SubLObject balancing_tactician_problem_motivated_wrt_tP(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, balancing_tactician_transformation_substrategy(strategy));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8100L)
    public static SubLObject balancing_tactician_link_head_motivated_wrt_rP(SubLObject strategy, SubLObject link_head) {
        return inference_tactician.substrategy_link_head_motivatedP(balancing_tactician_sole_removal_substrategy(strategy), link_head);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8300L)
    public static SubLObject balancing_tactician_substrategy_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_strategy.strategy_p(v_object) && NIL != balancing_tactician_p(inference_tactician.controlling_strategy(v_object)));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8400L)
    public static SubLObject balancing_tactician_proper_substrategy_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_strategy.strategy_p(v_object) && NIL == balancing_tactician_p(v_object) && NIL != balancing_tactician_p(inference_tactician.controlling_strategy(v_object)));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8600L)
    public static SubLObject balancing_tactician_spineless_substrategy_p(SubLObject v_object) {
        return new_root_tactician.new_root_strategy_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8800L)
    public static SubLObject balancing_tactician_doneP(SubLObject strategy) {
        SubLObject not_yet_doneP = NIL;
        if (NIL == not_yet_doneP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            substrategy = csome_list_var.first();
            while (NIL == not_yet_doneP && NIL != csome_list_var) {
                if (NIL == inference_tactician.strategy_doneP(substrategy)) {
                    not_yet_doneP = T;
                }
                csome_list_var = csome_list_var.rest();
                substrategy = csome_list_var.first();
            }
        }
        return makeBoolean(NIL == not_yet_doneP);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 9200L)
    public static SubLObject balancing_tactician_do_one_step(SubLObject strategy) {
        SubLObject result;
        for (result = $UNINTERESTING; $UNINTERESTING == result; result = balancing_tactician_do_one_step_int(strategy)) {
        }
        return Equality.eq($DONE, result);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 9500L)
    public static SubLObject balancing_tactician_do_one_step_int(SubLObject strategy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject action = NIL;
        if (NIL != balancing_tactician_should_reconsider_set_asidesP(strategy)) {
            balancing_tactician_reconsider_set_asides(strategy);
            action = $RECONSIDER_SET_ASIDES;
            result = $UNINTERESTING;
        } else if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference_datastructures_strategy.strategy_inference(strategy));
            SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
            SubLObject n_strategy = balancing_tactician_new_root_substrategy(strategy);
            inference_tactician.substrategy_motivate_strategem(n_strategy, root_problem);
            inference_worker.possibly_propagate_answer_link(answer_link);
            action = $PROPAGATE_ANSWER_LINK;
            result = $INTERESTING;
        } else if (NIL == inference_tactician.strategy_doneP(balancing_tactician_sole_removal_substrategy(strategy))) {
            action = balancing_tactician_sole_removal_substrategy(strategy);
            result = substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(balancing_tactician_sole_removal_substrategy(strategy)));
        } else if (NIL == inference_tactician.strategy_doneP(balancing_tactician_new_root_substrategy(strategy))) {
            SubLObject n_strategy2 = balancing_tactician_new_root_substrategy(strategy);
            SubLObject r_strategy = balancing_tactician_sole_removal_substrategy(strategy);
            SubLObject t_strategy = balancing_tactician_transformation_substrategy(strategy);
            SubLObject new_root = inference_tactician.substrategy_peek_next_strategem(n_strategy2);
            action = n_strategy2;
            result = inference_tactician.substrategy_do_one_step(n_strategy2);
            SubLObject re_addP = NIL;
            if (NIL == balancing_tactician_problem_motivated_wrt_rP(strategy, new_root)) {
                re_addP = T;
                action = list($MOTIVATION, r_strategy, new_root);
                inference_tactician.substrategy_motivate_strategem(r_strategy, new_root);
            } else if (NIL == balancing_tactician_problem_motivated_wrt_tP(strategy, new_root) && NIL == inference_tactician.strategy_throws_away_all_transformationP(t_strategy)) {
                re_addP = T;
                action = list($MOTIVATION, t_strategy, new_root);
                inference_tactician.substrategy_motivate_strategem(t_strategy, new_root);
            }
            if (NIL != re_addP) {
                inference_tactician.substrategy_activate_strategem(n_strategy2, new_root);
            }
        } else if (NIL == inference_tactician.strategy_doneP(balancing_tactician_transformation_substrategy(strategy))) {
            action = balancing_tactician_transformation_substrategy(strategy);
            result = substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(balancing_tactician_transformation_substrategy(strategy)));
        }
        if (control_vars.$inference_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            format_nil.force_format(T, $str48$_a_do_one_step___a__, strategy, action, NIL, NIL, NIL, NIL, NIL, NIL);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 12100L)
    public static SubLObject balancing_tactician_should_reconsider_set_asidesP(SubLObject strategy) {
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(substrategy)) {
                return T;
            }
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 12300L)
    public static SubLObject balancing_tactician_reconsider_set_asides(SubLObject strategy) {
        SubLObject count = ZERO_INTEGER;
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            count = Numbers.add(count, inference_tactician.strategy_reconsider_set_asides(substrategy));
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 12600L)
    public static SubLObject substrategy_do_one_step_interestingness(SubLObject substrategy_return_value) {
        return (NIL != substrategy_return_value) ? $UNINTERESTING : $INTERESTING;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 12900L)
    public static SubLObject balancing_tactician_continuation_possibleP(SubLObject strategy) {
        SubLObject continuation_possibleP = NIL;
        if (NIL == continuation_possibleP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = NIL;
            substrategy = csome_list_var.first();
            while (NIL == continuation_possibleP && NIL != csome_list_var) {
                if (NIL != inference_tactician.strategy_continuation_possibleP(substrategy)) {
                    continuation_possibleP = T;
                }
                csome_list_var = csome_list_var.rest();
                substrategy = csome_list_var.first();
            }
        }
        return continuation_possibleP;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 13300L)
    public static SubLObject balancing_tactician_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem) {
        SubLObject dont_throw_awayP = NIL;
        if (NIL == dont_throw_awayP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            sub_strategy = csome_list_var.first();
            while (NIL == dont_throw_awayP && NIL != csome_list_var) {
                if (NIL == balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_throw_awayP = makeBoolean(NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_problemP(sub_strategy, problem, UNPROVIDED));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            }
        }
        return makeBoolean(NIL == dont_throw_awayP);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 13800L)
    public static SubLObject balancing_tactician_chooses_to_set_aside_problemP(SubLObject strategy, SubLObject problem) {
        SubLObject dont_set_asideP = NIL;
        if (NIL == dont_set_asideP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            sub_strategy = csome_list_var.first();
            while (NIL == dont_set_asideP && NIL != csome_list_var) {
                if (NIL == balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_set_asideP = makeBoolean(NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_problemP(sub_strategy, problem));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            }
        }
        return makeBoolean(NIL == dont_set_asideP);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 14200L)
    public static SubLObject balancing_tactician_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        SubLObject dont_throw_awayP = NIL;
        if (NIL == dont_throw_awayP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            sub_strategy = csome_list_var.first();
            while (NIL == dont_throw_awayP && NIL != csome_list_var) {
                if (NIL == balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_throw_awayP = makeBoolean(NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_tacticP(sub_strategy, tactic, problem_already_consideredP, siblings_already_consideredP));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            }
        }
        return makeBoolean(NIL == dont_throw_awayP);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 14700L)
    public static SubLObject balancing_tactician_chooses_to_set_aside_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        SubLObject dont_set_asideP = NIL;
        if (NIL == dont_set_asideP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = NIL;
            sub_strategy = csome_list_var.first();
            while (NIL == dont_set_asideP && NIL != csome_list_var) {
                if (NIL == balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_set_asideP = makeBoolean(NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_tacticP(sub_strategy, tactic, problem_already_consideredP, siblings_already_consideredP));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            }
        }
        return makeBoolean(NIL == dont_set_asideP);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 15300L)
    public static SubLObject balancing_tactician_throw_away_uninteresting_set_asides(SubLObject strategy) {
        SubLObject count = ZERO_INTEGER;
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            count = Numbers.add(count, inference_tactician.strategy_throw_away_uninteresting_set_asides(substrategy));
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 15700L)
    public static SubLObject balancing_tactician_note_inference_dynamic_properties_updated(SubLObject strategy) {
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_tactician.strategy_note_inference_dynamic_properties_updated(substrategy);
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 16000L)
    public static SubLObject balancing_tactician_initialize_properties(SubLObject strategy, SubLObject strategy_static_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_static_properties);
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_tactician.strategy_initialize_properties(substrategy, strategy_static_properties);
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 16500L)
    public static SubLObject balancing_tactician_update_properties(SubLObject strategy, SubLObject strategy_dynamic_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_dynamic_properties);
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_tactician.strategy_update_properties(substrategy, strategy_dynamic_properties);
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 16800L)
    public static SubLObject balancing_tactician_initial_relevant_strategies(SubLObject strategy) {
        return balancing_tactician_all_substrategies(strategy);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 17100L)
    public static SubLObject balancing_tactician_possibly_activate_problem(SubLObject strategy, SubLObject problem) {
        if (NIL == inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
            if (NIL != balancing_tactician_problem_is_the_rest_of_an_early_removalP(strategy, problem)) {
                balancing_tactician_possibly_make_new_root(strategy, problem);
            } else if (NIL != balancing_tactician_problem_is_the_result_of_a_simplificationP(strategy, problem)) {
                balancing_tactician_possibly_make_new_root(strategy, problem);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 17800L)
    public static SubLObject balancing_tactician_problem_is_the_rest_of_an_early_removalP(SubLObject strategy, SubLObject problem) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$3;
        SubLObject basis_object_$4;
        SubLObject state_$5;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            restriction_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                set_contents_var_$3 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                for (basis_object_$4 = set_contents.do_set_contents_basis_object(set_contents_var_$3), state_$5 = NIL, state_$5 = set_contents.do_set_contents_initial_state(basis_object_$4, set_contents_var_$3); NIL == set_contents.do_set_contents_doneP(basis_object_$4,
                        state_$5); state_$5 = set_contents.do_set_contents_update_state(state_$5)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object_$4, state_$5);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$5, join_ordered_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)
                            && NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))
                            && NIL != balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(strategy, problem, join_ordered_link)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 18300L)
    public static SubLObject balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(SubLObject strategy, SubLObject problem, SubLObject join_ordered_link) {
        if (NIL != balancing_tactician_treats_restricted_non_focal_as_new_rootP(strategy, join_ordered_link)) {
            return T;
        }
        if (NIL != balancing_tactician_early_removal_linkP(strategy, join_ordered_link)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 18700L)
    public static SubLObject balancing_tactician_treats_restricted_non_focal_as_new_rootP(SubLObject strategy, SubLObject join_ordered_link) {
        return makeBoolean(NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_unbound_predicateP(join_ordered_link) || NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 19000L)
    public static SubLObject balancing_tactician_early_removal_linkP(SubLObject strategy, SubLObject link) {
        assert NIL != balancing_tactician_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        SubLObject r_strategy = balancing_tactician_sole_removal_substrategy(strategy);
        return makeBoolean(NIL != inference_worker_join_ordered.join_ordered_link_p(link) && NIL != inference_datastructures_problem_link.problem_link_openP(link) && NIL != substrategy_connected_conjunction_link_motivatedP(r_strategy, link)
                && NIL != balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link))
                && $COMPLETE == inference_worker.problem_generalized_removal_completeness(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(inference_worker_join_ordered.join_ordered_link_tactic(link)), r_strategy)
                && NIL != inference_tactician.join_ordered_link_early_removal_cheapP(link, strategy));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 19900L)
    public static SubLObject substrategy_connected_conjunction_link_motivatedP(SubLObject substrategy, SubLObject connected_conjunction_link) {
        SubLObject link_head = inference_worker.connected_conjunction_link_tactic(connected_conjunction_link);
        return inference_tactician.substrategy_link_head_motivatedP(substrategy, link_head);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 20400L)
    public static SubLObject balancing_tactician_problem_is_the_result_of_a_simplificationP(SubLObject strategy, SubLObject problem) {
        if (NIL != inference_worker_restriction.problem_is_a_simplificationP(problem)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject simplification_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                simplification_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, simplification_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(simplification_link, $SIMPLIFICATION)
                        && NIL != balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(simplification_link))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 20700L)
    public static SubLObject balancing_tactician_note_argument_link(SubLObject strategy, SubLObject link) {
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            SubLObject t_strategy = balancing_tactician_transformation_substrategy(strategy);
            SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
            if (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
                balancing_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
            }
            return NIL;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 21400L)
    public static SubLObject balancing_tactician_early_removal_productivity_limit(SubLObject strategy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $balancing_tactician_early_removal_productivity_limit$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 21700L)
    public static SubLObject balancing_tactician_substrategy_strategem_motivated(SubLObject strategy, SubLObject substrategy, SubLObject strategem) {
        if (NIL != inference_datastructures_problem.problem_p(strategem)) {
            return balancing_tactician_substrategy_problem_motivated(strategy, substrategy, strategem);
        }
        if (NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
            return balancing_tactician_substrategy_link_motivated(strategy, substrategy, strategem);
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return balancing_tactician_substrategy_tactic_motivated(strategy, substrategy, strategem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 22500L)
    public static SubLObject balancing_tactician_substrategy_problem_motivated(SubLObject strategy, SubLObject substrategy, SubLObject problem) {
        inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
        if (NIL != new_root_tactician.new_root_strategy_p(substrategy)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject split_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                split_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, split_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT)) {
                    balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, split_link);
                }
            }
            set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject union_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                union_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, union_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, $UNION)) {
                    balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, union_link);
                }
            }
            set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject link;
            SubLObject link_var;
            SubLObject set_contents_var_$6;
            SubLObject basis_object_$7;
            SubLObject state_$8;
            SubLObject restriction_link;
            SubLObject restricted_non_focal_problem;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $JOIN_ORDERED) && NIL != balancing_tactician_early_removal_linkP(strategy, link)) {
                    link_var = link;
                    set_contents_var_$6 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                    for (basis_object_$7 = set_contents.do_set_contents_basis_object(set_contents_var_$6), state_$8 = NIL, state_$8 = set_contents.do_set_contents_initial_state(basis_object_$7, set_contents_var_$6); NIL == set_contents.do_set_contents_doneP(basis_object_$7,
                            state_$8); state_$8 = set_contents.do_set_contents_update_state(state_$8)) {
                        restriction_link = set_contents.do_set_contents_next(basis_object_$7, state_$8);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$8, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)
                                && NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var)) {
                            restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                            balancing_tactician_possibly_make_new_root(strategy, restricted_non_focal_problem);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 23700L)
    public static SubLObject balancing_tactician_substrategy_link_motivated(SubLObject strategy, SubLObject substrategy, SubLObject link) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : substrategy;
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            if (NIL == balancing_tactician_chooses_to_make_d_a_new_rootP(strategy, link)) {
                SubLObject count = ZERO_INTEGER;
                SubLObject cdolist_list_var = balancing_tactician_transformation_new_root_candidates(strategy, link);
                SubLObject new_root = NIL;
                new_root = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != balancing_tactician_possibly_make_new_root(strategy, new_root)) {
                        count = Numbers.add(count, ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    new_root = cdolist_list_var.first();
                }
                return count;
            }
            if (NIL != balancing_tactician_problem_motivated_wrt_rP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link))) {
                SubLObject residual_problem = inference_worker_transformation.transformation_link_supporting_problem(link);
                return balancing_tactician_possibly_make_new_root(strategy, residual_problem);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 25400L)
    public static SubLObject balancing_tactician_chooses_to_make_d_a_new_rootP(SubLObject strategy, SubLObject t_link) {
        return Types.sublisp_null(balancing_tactician_residual_conjunction_new_root_candidates(strategy, t_link));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 25900L)
    public static SubLObject balancing_tactician_residual_conjunction_new_root_candidates(SubLObject strategy, SubLObject t_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject t_strategy = balancing_tactician_transformation_substrategy(strategy);
        SubLObject new_roots = NIL;
        if (NIL == $balancing_tactician_self_looping_rule_fix_enabledP$.getDynamicValue(thread) || NIL == assertion_utilities.self_expanding_ruleP(inference_worker_transformation.transformation_link_rule_assertion(t_link))) {
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject jo_link_var;
            SubLObject jo_link_var_$9;
            SubLObject motivating_conjunction_problem;
            SubLObject set_contents_var_$10;
            SubLObject basis_object_$11;
            SubLObject state_$12;
            SubLObject rt_link;
            SubLObject candidate_new_root;
            SubLObject jo_link;
            SubLObject jo_tactic;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                jo_link_var = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, jo_link_var) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED)) {
                    jo_link_var_$9 = jo_link_var;
                    motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$9);
                    set_contents_var_$10 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                    for (basis_object_$11 = set_contents.do_set_contents_basis_object(set_contents_var_$10), state_$12 = NIL, state_$12 = set_contents.do_set_contents_initial_state(basis_object_$11, set_contents_var_$10); NIL == set_contents.do_set_contents_doneP(basis_object_$11,
                            state_$12); state_$12 = set_contents.do_set_contents_update_state(state_$12)) {
                        rt_link = set_contents.do_set_contents_next(basis_object_$11, state_$12);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$12, rt_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)
                                && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$9)
                                && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link)) {
                            candidate_new_root = inference_worker_residual_transformation.residual_transformation_link_supporting_problem(rt_link);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(candidate_new_root, t_strategy) || NIL != inference_datastructures_strategy.problem_motivatedP(candidate_new_root, t_strategy)) {
                                jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
                                jo_tactic = inference_worker_join_ordered.join_ordered_link_tactic(jo_link);
                                if (NIL == $balancing_tactician_new_roots_check_for_t_on_jo_linkP$.getDynamicValue(thread) || NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, jo_tactic)) {
                                    new_roots = cons(candidate_new_root, new_roots);
                                }
                            }
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(new_roots);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 27000L)
    public static SubLObject balancing_tactician_transformation_new_root_candidates(SubLObject strategy, SubLObject t_link) {
        if (NIL != inference_tactician.transformation_link_leads_to_term_chosen_dead_endP(t_link)) {
            return inference_tactician.all_restricted_non_focals_around_transformation_link(t_link);
        }
        return balancing_tactician_residual_conjunction_new_root_candidates(strategy, t_link);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 27300L)
    public static SubLObject balancing_tactician_possibly_make_new_root(SubLObject strategy, SubLObject problem) {
        return inference_tactician.substrategy_motivate_strategem(balancing_tactician_new_root_substrategy(strategy), problem);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 27500L)
    public static SubLObject balancing_tactician_substrategy_tactic_motivated(SubLObject strategy, SubLObject substrategy, SubLObject tactic) {
        if (NIL != inference_worker.connected_conjunction_tactic_p(tactic)) {
            return balancing_tactician_substrategy_connected_conjunction_tactic_motivated(strategy, substrategy, tactic);
        }
        if (NIL != inference_worker_split.split_tactic_p(tactic)) {
            return balancing_tactician_substrategy_split_tactic_motivated(strategy, substrategy, tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 28500L)
    public static SubLObject balancing_tactician_substrategy_connected_conjunction_tactic_motivated(SubLObject strategy, SubLObject substrategy, SubLObject cc_tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : substrategy;
        assert NIL != inference_worker.connected_conjunction_tactic_p(cc_tactic) : cc_tactic;
        if (NIL != $balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$.getDynamicValue(thread)) {
            SubLObject link = inference_worker.connected_conjunction_tactic_link(cc_tactic);
            if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                SubLObject jo_link_var = link;
                SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var);
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject rt_link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    rt_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, rt_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)
                            && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var)) {
                        balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link(strategy, rt_link);
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 29100L)
    public static SubLObject balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link(SubLObject strategy, SubLObject rt_link) {
        SubLObject t_strategy = balancing_tactician_transformation_substrategy(strategy);
        SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
        if (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
            return balancing_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 30300L)
    public static SubLObject balancing_tactician_substrategy_split_tactic_motivated(SubLObject strategy, SubLObject substrategy, SubLObject split_tactic) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : substrategy;
        assert NIL != inference_worker_split.split_tactic_p(split_tactic) : split_tactic;
        balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, inference_worker_split.split_tactic_link(split_tactic));
        SubLObject r_strategy = balancing_tactician_sole_removal_substrategy(strategy);
        if (NIL != inference_datastructures_strategy.problem_motivatedP(inference_datastructures_tactic.tactic_problem(split_tactic), r_strategy)) {
            return inference_tactician.substrategy_reconsider_split_set_asides(r_strategy, split_tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 30800L)
    public static SubLObject balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(SubLObject strategy, SubLObject split_link) {
        SubLObject count = ZERO_INTEGER;
        if (NIL != balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(split_link))) {
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
                    SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if (NIL != balancing_tactician_problem_motivated_wrt_tP(strategy, supporting_problem) && NIL != inference_tactician.substrategy_motivate_strategem(balancing_tactician_new_root_substrategy(strategy), supporting_problem)) {
                        count = Numbers.add(count, ONE_INTEGER);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 31900L)
    public static SubLObject balancing_tactician_substrategy_union_tactic_motivated(SubLObject strategy, SubLObject substrategy, SubLObject union_tactic) {
        if (NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy)) {
            return balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, inference_worker_union.union_tactic_link(union_tactic));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 32200L)
    public static SubLObject balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(SubLObject strategy, SubLObject union_link) {
        if (NIL != balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(union_link))) {
            SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(union_link);
            if (NIL != balancing_tactician_problem_motivated_wrt_tP(strategy, supporting_problem)) {
                return balancing_tactician_possibly_make_new_root(strategy, supporting_problem);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 33100L)
    public static SubLObject balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP(SubLObject strategy, SubLObject substrategy, SubLObject split_tactic) {
        assert NIL != removal_tactician.removal_strategy_p(substrategy) : substrategy;
        return makeBoolean(NIL == inference_tactician.substrategy_link_head_motivatedP(balancing_tactician_transformation_substrategy(strategy), split_tactic));
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 33600L)
    public static SubLObject balancing_tactician_chooses_to_totally_throw_away_tacticP(SubLObject strategy, SubLObject substrategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        return balancing_tactician_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 34000L)
    public static SubLObject balancing_tactician_substrategy_problem_status_change(SubLObject strategy, SubLObject substrategy, SubLObject problem, SubLObject old_status, SubLObject new_status) {
        balancing_tactician_recompute_problem_status(strategy, problem);
        if (NIL != removal_tactician.removal_strategy_p(substrategy) && NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, substrategy) && NIL == inference_datastructures_enumerated_types.no_good_problem_status_p(old_status)
                && NIL != inference_datastructures_enumerated_types.no_good_problem_status_p(new_status)) {
            balancing_tactician_make_problem_no_good(strategy, problem);
            return $COMPLETE_REMOVAL_TACTIC_NO_GOOD;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 35100L)
    public static SubLObject balancing_tactician_recompute_problem_status(SubLObject strategy, SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject weakest_strategic_status = $FINISHED;
        SubLObject most_sensible_provability_status = $NO_GOOD;
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = NIL;
        substrategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL == balancing_tactician_spineless_substrategy_p(substrategy)) {
                SubLObject strategic_status = inference_datastructures_strategy.problem_strategic_status(problem, substrategy);
                if (NIL != inference_datastructures_enumerated_types.tactical_status_unionP(strategic_status, weakest_strategic_status)) {
                    weakest_strategic_status = strategic_status;
                }
                SubLObject pcase_var;
                SubLObject provability_status = pcase_var = inference_datastructures_strategy.problem_provability_status(problem, substrategy);
                if (!pcase_var.eql($NO_GOOD)) {
                    if (pcase_var.eql($GOOD)) {
                        most_sensible_provability_status = $NEUTRAL;
                    } else if (pcase_var.eql($NEUTRAL)) {
                        most_sensible_provability_status = $NEUTRAL;
                    }
                }
            }
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        if ($POSSIBLE == weakest_strategic_status && $NO_GOOD == most_sensible_provability_status) {
            weakest_strategic_status = $PENDING;
        }
        SubLObject status = inference_datastructures_enumerated_types.problem_status_from_tactical_status_and_provability_status(weakest_strategic_status, most_sensible_provability_status);
        inference_datastructures_strategy.set_problem_raw_strategic_status(problem, strategy, status);
        if (NIL != $balancing_tactician_is_tactically_hardcoreP$.getDynamicValue(thread) && NIL != inference_tactician.strategy_controls_problem_storeP(strategy) && NIL == inference_datastructures_strategy.strategy_continuableP(strategy)
                && NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) {
            balancing_tactician_possibly_propagate_strategic_status_to_tactical_status(problem, most_sensible_provability_status, weakest_strategic_status);
        }
        return status;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 36700L)
    public static SubLObject balancing_tactician_possibly_propagate_strategic_status_to_tactical_status(SubLObject problem, SubLObject most_sensible_provability_status, SubLObject weakest_strategic_status) {
        if ($NO_GOOD == most_sensible_provability_status) {
            inference_worker.make_problem_no_good(problem, NIL, $TACTICAL);
        }
        if ($PENDING == weakest_strategic_status) {
            inference_worker.discard_all_possible_tactics(problem);
            inference_worker.possibly_note_problem_pending(problem, $TACTICAL);
        }
        if ($FINISHED == weakest_strategic_status) {
            inference_worker.possibly_note_problem_finished(problem, $TACTICAL);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 37300L)
    public static SubLObject balancing_tactician_make_problem_no_good(SubLObject strategy, SubLObject problem) {
        inference_worker.make_problem_no_good(problem, NIL, strategy);
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject sub_strategy = NIL;
        sub_strategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_worker.make_problem_no_good(problem, NIL, sub_strategy);
            csome_list_var = csome_list_var.rest();
            sub_strategy = csome_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 37500L)
    public static SubLObject balancing_tactician_make_problem_pending(SubLObject strategy, SubLObject problem) {
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject sub_strategy = NIL;
        sub_strategy = csome_list_var.first();
        while (NIL != csome_list_var) {
            inference_worker.possibly_note_problem_pending(problem, sub_strategy);
            csome_list_var = csome_list_var.rest();
            sub_strategy = csome_list_var.first();
        }
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $CONNECTED_CONJUNCTION)) {
                balancing_tactician_make_problem_pending(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link));
            }
        }
        return NIL;
    }

    public static SubLObject declare_balancing_tactician_file() {
        declareFunction(myName, "balancing_tactician_data_print_function_trampoline", "BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "balancing_tactician_data_p", "BALANCING-TACTICIAN-DATA-P", 1, 0, false);
        new $balancing_tactician_data_p$UnaryFunction();
        declareFunction(myName, "bal_tac_data_new_root_substrategy", "BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
        declareFunction(myName, "bal_tac_data_transformation_substrategy", "BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
        declareFunction(myName, "bal_tac_data_removal_substrategies", "BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 1, 0, false);
        declareFunction(myName, "_csetf_bal_tac_data_new_root_substrategy", "_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 2, 0, false);
        declareFunction(myName, "_csetf_bal_tac_data_transformation_substrategy", "_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 2, 0, false);
        declareFunction(myName, "_csetf_bal_tac_data_removal_substrategies", "_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 2, 0, false);
        declareFunction(myName, "make_balancing_tactician_data", "MAKE-BALANCING-TACTICIAN-DATA", 0, 1, false);
        declareFunction(myName, "visit_defstruct_balancing_tactician_data", "VISIT-DEFSTRUCT-BALANCING-TACTICIAN-DATA", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_balancing_tactician_data_method", "VISIT-DEFSTRUCT-OBJECT-BALANCING-TACTICIAN-DATA-METHOD", 2, 0, false);
        declareFunction(myName, "balancing_tactician_p", "BALANCING-TACTICIAN-P", 1, 0, false);
        declareMacro(me, "do_balancing_tactician_substrategies", "DO-BALANCING-TACTICIAN-SUBSTRATEGIES");
        declareMacro(me, "do_balancing_tactician_spineful_substrategies", "DO-BALANCING-TACTICIAN-SPINEFUL-SUBSTRATEGIES");
        declareFunction(myName, "new_balancing_tactician_data", "NEW-BALANCING-TACTICIAN-DATA", 3, 0, false);
        declareFunction(myName, "balancing_tactician_initialize", "BALANCING-TACTICIAN-INITIALIZE", 1, 0, false);
        declareFunction(myName, "new_balancing_tactician_data_from_inference", "NEW-BALANCING-TACTICIAN-DATA-FROM-INFERENCE", 1, 0, false);
        declareFunction(myName, "balancing_tactician_new_root_substrategy", "BALANCING-TACTICIAN-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
        declareFunction(myName, "balancing_tactician_transformation_substrategy", "BALANCING-TACTICIAN-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
        declareFunction(myName, "balancing_tactician_removal_substrategies", "BALANCING-TACTICIAN-REMOVAL-SUBSTRATEGIES", 1, 0, false);
        declareFunction(myName, "balancing_tactician_sole_removal_substrategy", "BALANCING-TACTICIAN-SOLE-REMOVAL-SUBSTRATEGY", 1, 0, false);
        declareFunction(myName, "balancing_tactician_all_substrategies", "BALANCING-TACTICIAN-ALL-SUBSTRATEGIES", 1, 0, false);
        declareFunction(myName, "balancing_tactician_problem_motivated_wrt_nP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-N?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_problem_motivated_wrt_rP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-R?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_problem_motivated_wrt_tP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-T?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_link_head_motivated_wrt_rP", "BALANCING-TACTICIAN-LINK-HEAD-MOTIVATED-WRT-R?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_substrategy_p", "BALANCING-TACTICIAN-SUBSTRATEGY-P", 1, 0, false);
        declareFunction(myName, "balancing_tactician_proper_substrategy_p", "BALANCING-TACTICIAN-PROPER-SUBSTRATEGY-P", 1, 0, false);
        declareFunction(myName, "balancing_tactician_spineless_substrategy_p", "BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P", 1, 0, false);
        declareFunction(myName, "balancing_tactician_doneP", "BALANCING-TACTICIAN-DONE?", 1, 0, false);
        declareFunction(myName, "balancing_tactician_do_one_step", "BALANCING-TACTICIAN-DO-ONE-STEP", 1, 0, false);
        declareFunction(myName, "balancing_tactician_do_one_step_int", "BALANCING-TACTICIAN-DO-ONE-STEP-INT", 1, 0, false);
        declareFunction(myName, "balancing_tactician_should_reconsider_set_asidesP", "BALANCING-TACTICIAN-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
        declareFunction(myName, "balancing_tactician_reconsider_set_asides", "BALANCING-TACTICIAN-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareFunction(myName, "substrategy_do_one_step_interestingness", "SUBSTRATEGY-DO-ONE-STEP-INTERESTINGNESS", 1, 0, false);
        declareFunction(myName, "balancing_tactician_continuation_possibleP", "BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?", 1, 0, false);
        declareFunction(myName, "balancing_tactician_chooses_to_throw_away_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_chooses_to_set_aside_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_chooses_to_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
        declareFunction(myName, "balancing_tactician_chooses_to_set_aside_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
        declareFunction(myName, "balancing_tactician_throw_away_uninteresting_set_asides", "BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        declareFunction(myName, "balancing_tactician_note_inference_dynamic_properties_updated", "BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
        declareFunction(myName, "balancing_tactician_initialize_properties", "BALANCING-TACTICIAN-INITIALIZE-PROPERTIES", 2, 0, false);
        declareFunction(myName, "balancing_tactician_update_properties", "BALANCING-TACTICIAN-UPDATE-PROPERTIES", 2, 0, false);
        declareFunction(myName, "balancing_tactician_initial_relevant_strategies", "BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(myName, "balancing_tactician_possibly_activate_problem", "BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction(myName, "balancing_tactician_problem_is_the_rest_of_an_early_removalP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-REST-OF-AN-EARLY-REMOVAL?", 2, 0, false);
        declareFunction(me, "balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-PROPAGATE-NEW-ROOT-MOTIVATION-TO-RESTRICTED-NON-FOCAL-PROBLEM?", 3, 0, false);
        declareFunction(myName, "balancing_tactician_treats_restricted_non_focal_as_new_rootP", "BALANCING-TACTICIAN-TREATS-RESTRICTED-NON-FOCAL-AS-NEW-ROOT?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_early_removal_linkP", "BALANCING-TACTICIAN-EARLY-REMOVAL-LINK?", 2, 0, false);
        declareFunction(myName, "substrategy_connected_conjunction_link_motivatedP", "SUBSTRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_problem_is_the_result_of_a_simplificationP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-RESULT-OF-A-SIMPLIFICATION?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_note_argument_link", "BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK", 2, 0, false);
        declareFunction(myName, "balancing_tactician_early_removal_productivity_limit", "BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(myName, "balancing_tactician_substrategy_strategem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED", 3, 0, false);
        declareFunction(myName, "balancing_tactician_substrategy_problem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-MOTIVATED", 3, 0, false);
        declareFunction(myName, "balancing_tactician_substrategy_link_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-LINK-MOTIVATED", 3, 0, false);
        declareFunction(myName, "balancing_tactician_chooses_to_make_d_a_new_rootP", "BALANCING-TACTICIAN-CHOOSES-TO-MAKE-D-A-NEW-ROOT?", 2, 0, false);
        declareFunction(myName, "balancing_tactician_residual_conjunction_new_root_candidates", "BALANCING-TACTICIAN-RESIDUAL-CONJUNCTION-NEW-ROOT-CANDIDATES", 2, 0, false);
        declareFunction(myName, "balancing_tactician_transformation_new_root_candidates", "BALANCING-TACTICIAN-TRANSFORMATION-NEW-ROOT-CANDIDATES", 2, 0, false);
        declareFunction(myName, "balancing_tactician_possibly_make_new_root", "BALANCING-TACTICIAN-POSSIBLY-MAKE-NEW-ROOT", 2, 0, false);
        declareFunction(myName, "balancing_tactician_substrategy_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction(myName, "balancing_tactician_substrategy_connected_conjunction_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-CONNECTED-CONJUNCTION-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction(myName, "balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link", "BALANCING-TACTICIAN-POSSIBLY-MOTIVATE-NEW-ROOT-VIA-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction(myName, "balancing_tactician_substrategy_split_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-SPLIT-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction(myName, "balancing_tactician_possibly_propagate_new_root_motivation_down_split_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-SPLIT-LINK", 2, 0, false);
        declareFunction(myName, "balancing_tactician_substrategy_union_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-UNION-TACTIC-MOTIVATED", 3, 0, false);
        declareFunction(myName, "balancing_tactician_possibly_propagate_new_root_motivation_down_union_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-UNION-LINK", 2, 0, false);
        declareFunction(myName, "balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP", "BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?", 3, 0, false);
        declareFunction(myName, "balancing_tactician_chooses_to_totally_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 5, 0, false);
        declareFunction(myName, "balancing_tactician_substrategy_problem_status_change", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE", 5, 0, false);
        declareFunction(myName, "balancing_tactician_recompute_problem_status", "BALANCING-TACTICIAN-RECOMPUTE-PROBLEM-STATUS", 2, 0, false);
        declareFunction(myName, "balancing_tactician_possibly_propagate_strategic_status_to_tactical_status", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-STRATEGIC-STATUS-TO-TACTICAL-STATUS", 3, 0, false);
        declareFunction(myName, "balancing_tactician_make_problem_no_good", "BALANCING-TACTICIAN-MAKE-PROBLEM-NO-GOOD", 2, 0, false);
        declareFunction(myName, "balancing_tactician_make_problem_pending", "BALANCING-TACTICIAN-MAKE-PROBLEM-PENDING", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_balancing_tactician_file() {
        $dtp_balancing_tactician_data$ = defconstant("*DTP-BALANCING-TACTICIAN-DATA*", $sym2$BALANCING_TACTICIAN_DATA);
        $balancing_tactician_early_removal_productivity_limit$ = defvar("*BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
        $balancing_tactician_self_looping_rule_fix_enabledP$ = SubLFiles.defparameter("*BALANCING-TACTICIAN-SELF-LOOPING-RULE-FIX-ENABLED?*", T);
        $balancing_tactician_new_roots_check_for_t_on_jo_linkP$ = SubLFiles.defvar("*BALANCING-TACTICIAN-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*", T);
        $balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$ = SubLFiles.defparameter("*BALANCING-TACTICIAN-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*", T);
        $balancing_tactician_is_tactically_hardcoreP$ = SubLFiles.defparameter("*BALANCING-TACTICIAN-IS-TACTICALLY-HARDCORE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_balancing_tactician_file() {
        inference_tactician.inference_strategy_type($BALANCING, $list1);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_balancing_tactician_data$.getGlobalValue(), Symbols.symbol_function($sym9$BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list10);
        Structures.def_csetf($sym11$BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY, $sym12$_CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY);
        Structures.def_csetf($sym13$BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY, $sym14$_CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY);
        Structures.def_csetf($sym15$BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES, $sym16$_CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES);
        Equality.identity($sym2$BALANCING_TACTICIAN_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_balancing_tactician_data$.getGlobalValue(), Symbols.symbol_function($sym25$VISIT_DEFSTRUCT_OBJECT_BALANCING_TACTICIAN_DATA_METHOD));
        utilities_macros.note_funcall_helper_function($sym36$BALANCING_TACTICIAN_INITIALIZE);
        utilities_macros.note_funcall_helper_function($sym41$BALANCING_TACTICIAN_DONE_);
        utilities_macros.note_funcall_helper_function($sym43$BALANCING_TACTICIAN_DO_ONE_STEP);
        utilities_macros.note_funcall_helper_function($sym49$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_);
        utilities_macros.note_funcall_helper_function($sym50$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_);
        utilities_macros.note_funcall_helper_function($sym51$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_);
        utilities_macros.note_funcall_helper_function($sym52$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_);
        utilities_macros.note_funcall_helper_function($sym53$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_);
        utilities_macros.note_funcall_helper_function($sym54$BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES);
        utilities_macros.note_funcall_helper_function($sym55$BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED);
        utilities_macros.note_funcall_helper_function($sym56$BALANCING_TACTICIAN_INITIALIZE_PROPERTIES);
        utilities_macros.note_funcall_helper_function($sym57$BALANCING_TACTICIAN_UPDATE_PROPERTIES);
        utilities_macros.note_funcall_helper_function($sym58$BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES);
        utilities_macros.note_funcall_helper_function($sym59$BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM);
        utilities_macros.note_funcall_helper_function($sym65$BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK);
        utilities_macros.note_funcall_helper_function($sym66$BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT);
        utilities_macros.note_funcall_helper_function($sym67$BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED);
        utilities_macros.note_funcall_helper_function($sym75$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV);
        utilities_macros.note_funcall_helper_function($sym76$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_);
        utilities_macros.note_funcall_helper_function($sym78$BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_balancing_tactician_file();
    }

    @Override
    public void initializeVariables() {
        init_balancing_tactician_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_balancing_tactician_file();
    }

    static {
        me = new balancing_tactician();
        $dtp_balancing_tactician_data$ = null;
        $balancing_tactician_early_removal_productivity_limit$ = null;
        $balancing_tactician_self_looping_rule_fix_enabledP$ = null;
        $balancing_tactician_new_roots_check_for_t_on_jo_linkP$ = null;
        $balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$ = null;
        $balancing_tactician_is_tactically_hardcoreP$ = null;
        $BALANCING = makeKeyword("BALANCING");
        $list1 = list(new SubLObject[] { makeKeyword("NAME"), makeString("Balancing Tactician"), makeKeyword("COMMENT"), makeString("A balancing tactician type which delegates to a new-root tactician,\n a transformation tactician, and a single removal tactician."), makeKeyword("CONSTRUCTOR"),
                makeSymbol("BALANCING-TACTICIAN-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("BALANCING-TACTICIAN-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP"), makeKeyword("INITIAL-RELEVANT-STRATEGIES"),
                makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES"), makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES"), makeKeyword("UPDATE-PROPERTIES"), makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES"),
                makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"),
                makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"),
                makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?"),
                makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK"),
                makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE"), makeKeyword("PROBLEM-NOTHING-TO-DO?"),
                makeSymbol("FALSE"), makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?"),
                makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?"), makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE") });
        $sym2$BALANCING_TACTICIAN_DATA = makeSymbol("BALANCING-TACTICIAN-DATA");
        $sym3$BALANCING_TACTICIAN_DATA_P = makeSymbol("BALANCING-TACTICIAN-DATA-P");
        $list4 = list(makeSymbol("NEW-ROOT-SUBSTRATEGY"), makeSymbol("TRANSFORMATION-SUBSTRATEGY"), makeSymbol("REMOVAL-SUBSTRATEGIES"));
        $list5 = list(makeKeyword("NEW-ROOT-SUBSTRATEGY"), makeKeyword("TRANSFORMATION-SUBSTRATEGY"), makeKeyword("REMOVAL-SUBSTRATEGIES"));
        $list6 = list(makeSymbol("BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));
        $list7 = list(makeSymbol("_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));
        $sym8$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym9$BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list10 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("BALANCING-TACTICIAN-DATA-P"));
        $sym11$BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY = makeSymbol("BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY");
        $sym12$_CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY = makeSymbol("_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY");
        $sym13$BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = makeSymbol("BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");
        $sym14$_CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = makeSymbol("_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");
        $sym15$BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES = makeSymbol("BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES");
        $sym16$_CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES = makeSymbol("_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES");
        $NEW_ROOT_SUBSTRATEGY = makeKeyword("NEW-ROOT-SUBSTRATEGY");
        $TRANSFORMATION_SUBSTRATEGY = makeKeyword("TRANSFORMATION-SUBSTRATEGY");
        $REMOVAL_SUBSTRATEGIES = makeKeyword("REMOVAL-SUBSTRATEGIES");
        $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym22$MAKE_BALANCING_TACTICIAN_DATA = makeSymbol("MAKE-BALANCING-TACTICIAN-DATA");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym25$VISIT_DEFSTRUCT_OBJECT_BALANCING_TACTICIAN_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-BALANCING-TACTICIAN-DATA-METHOD");
        $list26 = list(makeKeyword("BALANCING"), makeKeyword("STRIPING"), makeKeyword("ABDUCTIVE"));
        $list27 = list(list(makeSymbol("SUBSTRATEGY-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list28 = list(makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $sym31$CSOME = makeSymbol("CSOME");
        $sym32$BALANCING_TACTICIAN_ALL_SUBSTRATEGIES = makeSymbol("BALANCING-TACTICIAN-ALL-SUBSTRATEGIES");
        $sym33$DO_BALANCING_TACTICIAN_SUBSTRATEGIES = makeSymbol("DO-BALANCING-TACTICIAN-SUBSTRATEGIES");
        $sym34$PUNLESS = makeSymbol("PUNLESS");
        $sym35$BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P = makeSymbol("BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P");
        $sym36$BALANCING_TACTICIAN_INITIALIZE = makeSymbol("BALANCING-TACTICIAN-INITIALIZE");
        $NEW_ROOT = makeKeyword("NEW-ROOT");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $REMOVAL = makeKeyword("REMOVAL");
        $sym40$BALANCING_TACTICIAN_P = makeSymbol("BALANCING-TACTICIAN-P");
        $sym41$BALANCING_TACTICIAN_DONE_ = makeSymbol("BALANCING-TACTICIAN-DONE?");
        $UNINTERESTING = makeKeyword("UNINTERESTING");
        $sym43$BALANCING_TACTICIAN_DO_ONE_STEP = makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP");
        $RECONSIDER_SET_ASIDES = makeKeyword("RECONSIDER-SET-ASIDES");
        $PROPAGATE_ANSWER_LINK = makeKeyword("PROPAGATE-ANSWER-LINK");
        $INTERESTING = makeKeyword("INTERESTING");
        $MOTIVATION = makeKeyword("MOTIVATION");
        $str48$_a_do_one_step___a__ = makeString("~a do-one-step: ~a~%");
        $sym49$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_ = makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?");
        $sym50$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?");
        $sym51$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?");
        $sym52$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?");
        $sym53$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?");
        $sym54$BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES = makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES");
        $sym55$BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED");
        $sym56$BALANCING_TACTICIAN_INITIALIZE_PROPERTIES = makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES");
        $sym57$BALANCING_TACTICIAN_UPDATE_PROPERTIES = makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES");
        $sym58$BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES = makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES");
        $sym59$BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM = makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $sym62$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
        $COMPLETE = makeKeyword("COMPLETE");
        $SIMPLIFICATION = makeKeyword("SIMPLIFICATION");
        $sym65$BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK = makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK");
        $sym66$BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT = makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT");
        $sym67$BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED = makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED");
        $SPLIT = makeKeyword("SPLIT");
        $UNION = makeKeyword("UNION");
        $sym70$TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");
        $RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
        $sym72$CONNECTED_CONJUNCTION_TACTIC_P = makeSymbol("CONNECTED-CONJUNCTION-TACTIC-P");
        $sym73$SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");
        $sym74$REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");
        $sym75$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV = makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?");
        $sym76$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?");
        $COMPLETE_REMOVAL_TACTIC_NO_GOOD = makeKeyword("COMPLETE-REMOVAL-TACTIC-NO-GOOD");
        $sym78$BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE = makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE");
        $FINISHED = makeKeyword("FINISHED");
        $NO_GOOD = makeKeyword("NO-GOOD");
        $GOOD = makeKeyword("GOOD");
        $NEUTRAL = makeKeyword("NEUTRAL");
        $POSSIBLE = makeKeyword("POSSIBLE");
        $PENDING = makeKeyword("PENDING");
        $TACTICAL = makeKeyword("TACTICAL");
        $CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
    }

    public static class $balancing_tactician_data_native extends SubLStructNative {
        public SubLObject $new_root_substrategy;
        public SubLObject $transformation_substrategy;
        public SubLObject $removal_substrategies;
        private static SubLStructDeclNative structDecl;

        public $balancing_tactician_data_native() {
            this.$new_root_substrategy = CommonSymbols.NIL;
            this.$transformation_substrategy = CommonSymbols.NIL;
            this.$removal_substrategies = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $balancing_tactician_data_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$new_root_substrategy;
        }

        @Override
        public SubLObject getField3() {
            return this.$transformation_substrategy;
        }

        @Override
        public SubLObject getField4() {
            return this.$removal_substrategies;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$new_root_substrategy = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$transformation_substrategy = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$removal_substrategies = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($balancing_tactician_data_native.class, $sym2$BALANCING_TACTICIAN_DATA, $sym3$BALANCING_TACTICIAN_DATA_P, $list4, $list5, new String[] { "$new_root_substrategy", "$transformation_substrategy", "$removal_substrategies" }, $list6, $list7,
                    $sym8$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $balancing_tactician_data_p$UnaryFunction extends UnaryFunction {
        public $balancing_tactician_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("BALANCING-TACTICIAN-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return balancing_tactician_data_p(arg1);
        }
    }
}
/*
 *
 * Total time: 232 ms
 *
 */