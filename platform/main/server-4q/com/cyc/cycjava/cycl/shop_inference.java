package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.shop_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.shop_inference.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class shop_inference extends SubLTranslatedFile {
    public static final SubLFile me = new shop_inference();

    public static final String myName = "com.cyc.cycjava.cycl.shop_inference";

    public static final String myFingerPrint = "2c343ffcd4047e83eff2a2459e6b22f2feb07b86fa08e3117116f4df3d86d74e";

    // defparameter
    private static final SubLSymbol $shop_use_new_inference_harnessP$ = makeSymbol("*SHOP-USE-NEW-INFERENCE-HARNESS?*");



    public static final SubLList $list1 = list(list(makeSymbol("*INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*"), makeSymbol("*SHOP-INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*")));





    public static final SubLString $str4$shop_ = makeString("shop-");

    public static final SubLString $str5$_heuristic = makeString("-heuristic");

    public static final SubLSymbol $sym6$_LITERAL__ = makeSymbol("?LITERAL??");









    public static final SubLSymbol ADD_SHOP_HEURISTIC = makeSymbol("ADD-SHOP-HEURISTIC");



    public static final SubLList $list13 = list(list(makeSymbol("PRED"), makeSymbol("&REST"), makeSymbol("ARGS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLObject $$EvaluatablePredicate = reader_make_constant_shell(makeString("EvaluatablePredicate"));

    public static final SubLSymbol $sym15$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $kw18$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");











    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");







    private static final SubLSymbol $kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw29$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw30$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");





    private static final SubLSymbol $kw33$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");



    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLInteger $int$30 = makeInteger(30);







    public static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("SHOP-EFFECT-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("SHOP-EFFECT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <anything>)\n    Queries the dynamically bound plan state for literal.") });

    public static final SubLList $list43 = list(list(makeSymbol("PLAN-STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $shop_ask_plan_state$ = makeSymbol("*SHOP-ASK-PLAN-STATE*");

    public static final SubLSymbol GET_SHOP_BASIC_PLAN_STATE_WORLD_STATE = makeSymbol("GET-SHOP-BASIC-PLAN-STATE-WORLD-STATE");

    public static final SubLSymbol $shop_ask_multibinding$ = makeSymbol("*SHOP-ASK-MULTIBINDING*");

    public static final SubLSymbol GET_SHOP_BASIC_PLAN_STATE_MBINDINGS = makeSymbol("GET-SHOP-BASIC-PLAN-STATE-MBINDINGS");

    public static final SubLString $str48$SHOP_HYP = makeString("SHOP-HYP");





    public static final SubLString $str51$shop_nd_event_fn___a = makeString("shop-nd-event-fn: ~a");

    private static final SubLObject $$ComplexActionFn = reader_make_constant_shell(makeString("ComplexActionFn"));

    private static final SubLObject $$NonDavidsonianPredFn = reader_make_constant_shell(makeString("NonDavidsonianPredFn"));

    public static final SubLSymbol SHOP_ND_EVENT_FN = makeSymbol("SHOP-ND-EVENT-FN");

    public static final SubLString $str55$shop_nd_actor_fn___a__a = makeString("shop-nd-actor-fn: ~a ~a");

    public static final SubLSymbol SHOP_ND_ACTOR_FN = makeSymbol("SHOP-ND-ACTOR-FN");

    public static SubLObject with_shop_inference_defaults(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject add_shop_heuristic(final SubLObject pred, final SubLObject heuristic_func) {
        dictionary_utilities.dictionary_push(shop_parameters.$shop_heuristics$.getGlobalValue(), pred, heuristic_func);
        return NIL;
    }

    public static SubLObject find_shop_heuristics(final SubLObject pred) {
        return dictionary.dictionary_lookup(shop_parameters.$shop_heuristics$.getGlobalValue(), pred, UNPROVIDED);
    }

    public static SubLObject shop_heuristic_value_p(final SubLObject value) {
        return makeBoolean(((value == $MANY) || (value == $LAST)) || value.isNumber());
    }

    public static SubLObject shop_heuristic_value_LE(final SubLObject val1, final SubLObject val2) {
        if (val1.isNumber() && val2.isNumber()) {
            return numLE(val1, val2);
        }
        if (val1.isNumber()) {
            return T;
        }
        if (val1 == $LAST) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject shop_heuristic_value_max(final SubLObject val1, final SubLObject val2) {
        if (NIL != shop_heuristic_value_LE(val1, val2)) {
            return val2;
        }
        return val1;
    }

    public static SubLObject shop_heuristic_value_min(final SubLObject val1, final SubLObject val2) {
        if (NIL != shop_heuristic_value_LE(val1, val2)) {
            return val1;
        }
        return val2;
    }

    public static SubLObject shop_expand_heuristic(final SubLObject pred, final SubLObject args, final SubLObject body) {
        final SubLObject heuristic_name = cconcatenate($str4$shop_, new SubLObject[]{ constants_high.constant_name(pred), $str5$_heuristic });
        final SubLObject heuristic_symbol = intern(Strings.string_upcase(heuristic_name, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject literal = $sym6$_LITERAL__;
        return list(PROGN, list(DEFINE_PUBLIC, heuristic_symbol, list(literal), listS(CDESTRUCTURING_BIND, args, list(FORMULA_ARGS, literal), append(body, NIL))), list(ADD_SHOP_HEURISTIC, pred, list(QUOTE, heuristic_symbol)));
    }

    public static SubLObject define_shop_heuristic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        pred = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject body;
        current = body = temp;
        return shop_expand_heuristic(pred, args, body);
    }

    public static SubLObject shop_evaluatable_literalP(final SubLObject literal, final SubLObject mt) {
        return isa.isaP(cycl_utilities.formula_operator(literal), $$EvaluatablePredicate, mt, UNPROVIDED);
    }

    public static SubLObject shop_bad_evaluatable_literalP(final SubLObject literal, final SubLObject mt) {
        return makeBoolean((NIL != shop_evaluatable_literalP(literal, mt)) && (NIL == groundP(literal, UNPROVIDED)));
    }

    public static SubLObject shop_estimate_ask_bindings(final SubLObject literal, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_operator(literal);
        final SubLObject h_funcs = find_shop_heuristics(pred);
        SubLObject result = $MANY;
        if (NIL != groundP(literal, UNPROVIDED)) {
            return ONE_INTEGER;
        }
        if (NIL != cycl_utilities.negatedP(literal)) {
            return $LAST;
        }
        if (NIL != shop_evaluatable_literalP(literal, mt)) {
            return $LAST;
        }
        SubLObject cdolist_list_var = h_funcs;
        SubLObject cur_func = NIL;
        cur_func = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_result = funcall(cur_func, literal);
            result = shop_heuristic_value_min(new_result, result);
            cdolist_list_var = cdolist_list_var.rest();
            cur_func = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject shop_estimate_best_literal(final SubLObject literals, final SubLObject mbinding, final SubLObject mt) {
        final SubLObject simple_binding = multibindings.mb_simple_binding(mbinding);
        final SubLObject subbed_literals = sublis(simple_binding, literals, UNPROVIDED, UNPROVIDED);
        SubLObject other_literals = NIL;
        SubLObject best_literal = subbed_literals.first();
        SubLObject best_result = shop_estimate_ask_bindings(best_literal, mt);
        SubLObject cur_result = NIL;
        SubLObject cdolist_list_var = subbed_literals.rest();
        SubLObject cur_literal = NIL;
        cur_literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cur_result = shop_estimate_ask_bindings(cur_literal, mt);
            if ((NIL != shop_bad_evaluatable_literalP(cur_literal, mt)) || (NIL != shop_heuristic_value_LE(best_result, cur_result))) {
                other_literals = cons(cur_literal, other_literals);
            } else {
                best_result = cur_result;
                other_literals = cons(best_literal, other_literals);
                best_literal = cur_literal;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_literal = cdolist_list_var.first();
        } 
        return values(best_literal, other_literals);
    }

    public static SubLObject shop_converse_bindings(final SubLObject v_bindings) {
        SubLObject reversed_bindings = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject cur_binding = NIL;
        cur_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            reversed_bindings = cons(bindings.make_variable_binding(bindings.variable_binding_value(cur_binding), bindings.variable_binding_variable(cur_binding)), reversed_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            cur_binding = cdolist_list_var.first();
        } 
        return reverse(reversed_bindings);
    }

    public static SubLObject shop_sentence_free_variables(final SubLObject form) {
        return list_utilities.remove_if_not($sym15$EL_VAR_, list_utilities.flatten(form), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject shop_canonicalize_ask(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (formula.first().eql($$and)) {
            final SubLObject el_vars = nreverse(sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            final SubLObject hl_vars = variables.generate_hl_variable_list(length(el_vars));
            final SubLObject el_hl_sub = nreverse(pairlis(el_vars, hl_vars, UNPROVIDED));
            final SubLObject hl_form = sublis(el_hl_sub, formula, UNPROVIDED, UNPROVIDED);
            SubLObject hl_pos = NIL;
            SubLObject hl_neg = NIL;
            SubLObject cdolist_list_var = hl_form.rest();
            SubLObject cur_literal = NIL;
            cur_literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != cycl_utilities.negatedP(cur_literal)) {
                    hl_neg = cons(cycl_utilities.formula_arg1(cur_literal, UNPROVIDED), hl_neg);
                } else {
                    hl_pos = cons(cur_literal, hl_pos);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_literal = cdolist_list_var.first();
            } 
            return list(list(list(nreverse(hl_neg), nreverse(hl_pos)), el_hl_sub, el_vars));
        }
        return NIL;
    }

    public static SubLObject shop_query_properties(final SubLObject planner_time_cutoff, SubLObject backchain) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_properties = NIL;
        if (NIL != backchain) {
            v_properties = putf(v_properties, $MAX_TRANSFORMATION_DEPTH, T == backchain ? NIL : backchain);
        }
        v_properties = putf(v_properties, $kw18$CACHE_INFERENCE_RESULTS_, list_utilities.sublisp_boolean($cache_inference_results$.getDynamicValue(thread)));
        v_properties = putf(v_properties, $ANSWER_LANGUAGE, $HL);
        if (NIL != $proof_checking_enabled$.getDynamicValue(thread)) {
            v_properties = putf(v_properties, $ALLOWED_RULES, $proof_checker_rules$.getDynamicValue(thread));
        } else {
            v_properties = putf(v_properties, $ALLOWED_RULES, $ALL);
        }
        if (NIL != shop_parameters.$shop_use_inference_supportsP$.getDynamicValue(thread)) {
            v_properties = putf(v_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
            v_properties = putf(v_properties, $RESULT_UNIQUENESS, $PROOF);
            v_properties = putf(v_properties, $ANSWER_LANGUAGE, $HL);
        } else {
            v_properties = putf(v_properties, $RETURN, $BINDINGS);
            v_properties = putf(v_properties, $RESULT_UNIQUENESS, $BINDINGS);
        }
        v_properties = putf(v_properties, $kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean($hl_failure_backchaining$.getDynamicValue(thread)));
        v_properties = putf(v_properties, $kw29$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean($unbound_rule_backchain_enabled$.getDynamicValue(thread)));
        v_properties = putf(v_properties, $kw30$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean($evaluatable_backchain_enabled$.getDynamicValue(thread)));
        final SubLObject productivity_limit = (NIL != $removal_cost_cutoff$.getDynamicValue(thread)) ? multiply(TWO_INTEGER, $int$100, $removal_cost_cutoff$.getDynamicValue(thread)) : number_utilities.positive_infinity();
        v_properties = putf(v_properties, $PRODUCTIVITY_LIMIT, productivity_limit);
        v_properties = putf(v_properties, $kw33$NEGATION_BY_FAILURE_, list_utilities.sublisp_boolean($negation_by_failure$.getDynamicValue(thread)));
        v_properties = putf(v_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, shop_parameters.$shop_inference_intermediate_step_validation_level$.getDynamicValue(thread));
        v_properties = putf(v_properties, $BROWSABLE_, T);
        v_properties = putf(v_properties, $PROBABLY_APPROXIMATELY_DONE, $float$1_0);
        SubLObject max_time = NIL;
        if (NIL != planner_time_cutoff) {
            max_time = divide(integerDivide(planner_time_cutoff, TEN_INTEGER), time_high.$internal_time_units_per_second$.getGlobalValue());
        } else {
            max_time = $int$30;
        }
        v_properties = putf(v_properties, $MAX_TIME, max_time);
        return v_properties;
    }

    public static SubLObject shop_ask_int(final SubLObject formula, final SubLObject mt, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject reason = NIL;
        final SubLObject halt_status = NIL;
        final SubLObject inference = NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            thread.resetMultipleValues();
            final SubLObject v_answer_$1 = inference_kernel.new_cyc_query(formula, mt, query_properties);
            final SubLObject reason_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_answer = v_answer_$1;
            reason = reason_$2;
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return values(v_answer, reason, halt_status, inference);
    }

    public static SubLObject shop_ask(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!formula.isCons()) {
            return NIL;
        }
        if (NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        mt = fi.fi_convert_to_fort(mt);
        if (((NIL != backchain) && (backchain != T)) && (!backchain.isInteger())) {
            return NIL;
        }
        if ((NIL != number) && (!number.isInteger())) {
            return NIL;
        }
        if ((NIL != time) && (!time.isInteger())) {
            return NIL;
        }
        if ((NIL != depth) && (!depth.isInteger())) {
            return NIL;
        }
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        thread.resetMultipleValues();
        final SubLObject v_answer = inference_kernel.new_cyc_query(formula, mt, query_properties);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(v_answer, reason);
    }

    public static SubLObject shop_effect_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread)) {
            final SubLObject v_bindings = shop_basic_world_state.shop_basic_world_state_ask_method(shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread), asent);
            if (NIL != v_bindings) {
                SubLObject cdolist_list_var = v_bindings;
                SubLObject cur_binding = NIL;
                cur_binding = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    backward.removal_add_node(arguments.make_hl_support($SHOP_EFFECT, bindings.subst_bindings(cur_binding, asent), UNPROVIDED, UNPROVIDED), cur_binding, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_binding = cdolist_list_var.first();
                } 
            }
            return NIL;
        }
        return NIL;
    }

    public static SubLObject shop_effect_generate(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return shop_basic_world_state.shop_basic_world_state_ask_method(shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread), asent);
    }

    public static SubLObject shop_effect_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread)) && (NIL != shop_basic_world_state.shop_basic_world_state_ask_method(shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread), asent)));
    }

    public static SubLObject with_query_plan_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject plan_state = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        plan_state = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($shop_ask_plan_state$, list(GET_SHOP_BASIC_PLAN_STATE_WORLD_STATE, plan_state)), list($shop_ask_multibinding$, list(GET_SHOP_BASIC_PLAN_STATE_MBINDINGS, plan_state))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list43);
        return NIL;
    }

    public static SubLObject shop_hypothesize(final SubLObject formula, final SubLObject mt) {
        final SubLObject name_prefix = $str48$SHOP_HYP;
        return prove.fi_hypothesize_int(formula, mt, name_prefix, NIL);
    }

    public static SubLObject shop_expand_action_list(final SubLObject action_template, final SubLObject pos, final SubLObject arg_list) {
        assert NIL != integerp(pos) : "Types.integerp(pos) " + "CommonSymbols.NIL != Types.integerp(pos) " + pos;
        assert NIL != listp(arg_list) : "Types.listp(arg_list) " + "CommonSymbols.NIL != Types.listp(arg_list) " + arg_list;
        SubLObject result = NIL;
        if (NIL == arg_list) {
            return values(NIL, NIL);
        }
        SubLObject cdolist_list_var = arg_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(cycl_utilities.formula_arg_position_subst(item, list(pos), action_template), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return values(nreverse(result), T);
    }

    public static SubLObject shop_nd_event_fn(SubLObject form) {
        if (NIL != assertion_handles.assertion_p(form)) {
            form = assertions_high.assertion_formula(form);
        }
        if (NIL == cafP(form)) {
            relation_evaluation.throw_unevaluatable();
        }
        format(T, $str51$shop_nd_event_fn___a, form);
        SubLObject pred_form = cycl_utilities.formula_operator(form);
        if (cycl_utilities.formula_operator(pred_form).eql($$ComplexActionFn)) {
            pred_form = cycl_utilities.formula_arg1(pred_form, UNPROVIDED);
        }
        if (cycl_utilities.formula_operator(pred_form).eql($$NonDavidsonianPredFn)) {
            return cycl_utilities.formula_arg1(pred_form, UNPROVIDED);
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject shop_nd_actor_fn(SubLObject form, final SubLObject role) {
        if (NIL != assertion_handles.assertion_p(form)) {
            form = assertions_high.assertion_formula(form);
        }
        if (NIL == cafP(form)) {
            relation_evaluation.throw_unevaluatable();
        }
        format(T, $str55$shop_nd_actor_fn___a__a, form, role);
        SubLObject pred_form = cycl_utilities.formula_operator(form);
        final SubLObject formula_args = cycl_utilities.formula_args(form, UNPROVIDED);
        SubLObject role_list = NIL;
        if (cycl_utilities.formula_operator(pred_form).eql($$ComplexActionFn)) {
            pred_form = cycl_utilities.formula_arg1(pred_form, UNPROVIDED);
        }
        if (cycl_utilities.formula_operator(pred_form).eql($$NonDavidsonianPredFn)) {
            role_list = cycl_utilities.formula_arg2(pred_form, UNPROVIDED).rest();
            final SubLObject alist = pairlis(role_list, formula_args, UNPROVIDED);
            return assoc(role, alist, UNPROVIDED, UNPROVIDED).rest();
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject declare_shop_inference_file() {
        declareMacro(me, "with_shop_inference_defaults", "WITH-SHOP-INFERENCE-DEFAULTS");
        declareFunction(me, "add_shop_heuristic", "ADD-SHOP-HEURISTIC", 2, 0, false);
        declareFunction(me, "find_shop_heuristics", "FIND-SHOP-HEURISTICS", 1, 0, false);
        declareFunction(me, "shop_heuristic_value_p", "SHOP-HEURISTIC-VALUE-P", 1, 0, false);
        declareFunction(me, "shop_heuristic_value_LE", "SHOP-HEURISTIC-VALUE-<=", 2, 0, false);
        declareFunction(me, "shop_heuristic_value_max", "SHOP-HEURISTIC-VALUE-MAX", 2, 0, false);
        declareFunction(me, "shop_heuristic_value_min", "SHOP-HEURISTIC-VALUE-MIN", 2, 0, false);
        declareFunction(me, "shop_expand_heuristic", "SHOP-EXPAND-HEURISTIC", 3, 0, false);
        declareMacro(me, "define_shop_heuristic", "DEFINE-SHOP-HEURISTIC");
        declareFunction(me, "shop_evaluatable_literalP", "SHOP-EVALUATABLE-LITERAL?", 2, 0, false);
        declareFunction(me, "shop_bad_evaluatable_literalP", "SHOP-BAD-EVALUATABLE-LITERAL?", 2, 0, false);
        declareFunction(me, "shop_estimate_ask_bindings", "SHOP-ESTIMATE-ASK-BINDINGS", 2, 0, false);
        declareFunction(me, "shop_estimate_best_literal", "SHOP-ESTIMATE-BEST-LITERAL", 3, 0, false);
        declareFunction(me, "shop_converse_bindings", "SHOP-CONVERSE-BINDINGS", 1, 0, false);
        declareFunction(me, "shop_sentence_free_variables", "SHOP-SENTENCE-FREE-VARIABLES", 1, 0, false);
        declareFunction(me, "shop_canonicalize_ask", "SHOP-CANONICALIZE-ASK", 1, 1, false);
        declareFunction(me, "shop_query_properties", "SHOP-QUERY-PROPERTIES", 1, 1, false);
        declareFunction(me, "shop_ask_int", "SHOP-ASK-INT", 3, 0, false);
        declareFunction(me, "shop_ask", "SHOP-ASK", 1, 5, false);
        declareFunction(me, "shop_effect_expand", "SHOP-EFFECT-EXPAND", 1, 1, false);
        declareFunction(me, "shop_effect_generate", "SHOP-EFFECT-GENERATE", 1, 0, false);
        declareFunction(me, "shop_effect_required", "SHOP-EFFECT-REQUIRED", 1, 1, false);
        new shop_inference.$shop_effect_required$UnaryFunction();
        new shop_inference.$shop_effect_required$BinaryFunction();
        declareMacro(me, "with_query_plan_state", "WITH-QUERY-PLAN-STATE");
        declareFunction(me, "shop_hypothesize", "SHOP-HYPOTHESIZE", 2, 0, false);
        declareFunction(me, "shop_expand_action_list", "SHOP-EXPAND-ACTION-LIST", 3, 0, false);
        declareFunction(me, "shop_nd_event_fn", "SHOP-ND-EVENT-FN", 1, 0, false);
        declareFunction(me, "shop_nd_actor_fn", "SHOP-ND-ACTOR-FN", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_shop_inference_file() {
        defparameter("*SHOP-USE-NEW-INFERENCE-HARNESS?*", T);
        return NIL;
    }

    public static SubLObject setup_shop_inference_file() {
        inference_modules.inference_removal_module($SHOP_EFFECT, $list42);
        register_kb_function(SHOP_ND_EVENT_FN);
        register_kb_function(SHOP_ND_ACTOR_FN);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_shop_inference_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_inference_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_inference_file();
    }

    static {



























































    }

    public static final class $shop_effect_required$UnaryFunction extends UnaryFunction {
        public $shop_effect_required$UnaryFunction() {
            super(extractFunctionNamed("SHOP-EFFECT-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return shop_effect_required(arg1, UNPROVIDED);
        }
    }

    public static final class $shop_effect_required$BinaryFunction extends BinaryFunction {
        public $shop_effect_required$BinaryFunction() {
            super(extractFunctionNamed("SHOP-EFFECT-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return shop_effect_required(arg1, arg2);
        }
    }
}

/**
 * Total time: 357 ms
 */
