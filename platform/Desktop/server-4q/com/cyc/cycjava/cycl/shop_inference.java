package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_inference extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_inference";
    public static final String myFingerPrint = "2c343ffcd4047e83eff2a2459e6b22f2feb07b86fa08e3117116f4df3d86d74e";
    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 6065L)
    private static SubLSymbol $shop_use_new_inference_harnessP$;
    private static final SubLSymbol $sym0$CLET;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$MANY;
    private static final SubLSymbol $kw3$LAST;
    private static final SubLString $str4$shop_;
    private static final SubLString $str5$_heuristic;
    private static final SubLSymbol $sym6$_LITERAL__;
    private static final SubLSymbol $sym7$PROGN;
    private static final SubLSymbol $sym8$DEFINE_PUBLIC;
    private static final SubLSymbol $sym9$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym10$FORMULA_ARGS;
    private static final SubLSymbol $sym11$ADD_SHOP_HEURISTIC;
    private static final SubLSymbol $sym12$QUOTE;
    private static final SubLList $list13;
    private static final SubLObject $const14$EvaluatablePredicate;
    private static final SubLSymbol $sym15$EL_VAR_;
    private static final SubLObject $const16$and;
    private static final SubLSymbol $kw17$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw18$CACHE_INFERENCE_RESULTS_;
    private static final SubLSymbol $kw19$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw20$HL;
    private static final SubLSymbol $kw21$ALLOWED_RULES;
    private static final SubLSymbol $kw22$ALL;
    private static final SubLSymbol $kw23$RETURN;
    private static final SubLSymbol $kw24$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $kw25$RESULT_UNIQUENESS;
    private static final SubLSymbol $kw26$PROOF;
    private static final SubLSymbol $kw27$BINDINGS;
    private static final SubLSymbol $kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_;
    private static final SubLSymbol $kw29$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
    private static final SubLSymbol $kw30$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
    private static final SubLInteger $int31$100;
    private static final SubLSymbol $kw32$PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $kw33$NEGATION_BY_FAILURE_;
    private static final SubLSymbol $kw34$INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static final SubLSymbol $kw35$BROWSABLE_;
    private static final SubLSymbol $kw36$PROBABLY_APPROXIMATELY_DONE;
    private static final SubLFloat $float37$1_0;
    private static final SubLInteger $int38$30;
    private static final SubLSymbol $kw39$MAX_TIME;
    private static final SubLSymbol $sym40$QUEUE_P;
    private static final SubLSymbol $kw41$SHOP_EFFECT;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$_SHOP_ASK_PLAN_STATE_;
    private static final SubLSymbol $sym45$GET_SHOP_BASIC_PLAN_STATE_WORLD_STATE;
    private static final SubLSymbol $sym46$_SHOP_ASK_MULTIBINDING_;
    private static final SubLSymbol $sym47$GET_SHOP_BASIC_PLAN_STATE_MBINDINGS;
    private static final SubLString $str48$SHOP_HYP;
    private static final SubLSymbol $sym49$INTEGERP;
    private static final SubLSymbol $sym50$LISTP;
    private static final SubLString $str51$shop_nd_event_fn___a;
    private static final SubLObject $const52$ComplexActionFn;
    private static final SubLObject $const53$NonDavidsonianPredFn;
    private static final SubLSymbol $sym54$SHOP_ND_EVENT_FN;
    private static final SubLString $str55$shop_nd_actor_fn___a__a;
    private static final SubLSymbol $sym56$SHOP_ND_ACTOR_FN;

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 771L)
    public static SubLObject with_shop_inference_defaults(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)shop_inference.$sym0$CLET, (SubLObject)shop_inference.$list1, ConsesLow.append(body, (SubLObject)shop_inference.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 967L)
    public static SubLObject add_shop_heuristic(final SubLObject pred, final SubLObject heuristic_func) {
        dictionary_utilities.dictionary_push(shop_parameters.$shop_heuristics$.getGlobalValue(), pred, heuristic_func);
        return (SubLObject)shop_inference.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 1166L)
    public static SubLObject find_shop_heuristics(final SubLObject pred) {
        return dictionary.dictionary_lookup(shop_parameters.$shop_heuristics$.getGlobalValue(), pred, (SubLObject)shop_inference.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 1292L)
    public static SubLObject shop_heuristic_value_p(final SubLObject value) {
        return (SubLObject)SubLObjectFactory.makeBoolean(value == shop_inference.$kw2$MANY || value == shop_inference.$kw3$LAST || value.isNumber());
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 1692L)
    public static SubLObject shop_heuristic_value_LE(final SubLObject val1, final SubLObject val2) {
        if (val1.isNumber() && val2.isNumber()) {
            return Numbers.numLE(val1, val2);
        }
        if (val1.isNumber()) {
            return (SubLObject)shop_inference.T;
        }
        if (val1 == shop_inference.$kw3$LAST) {
            return (SubLObject)shop_inference.NIL;
        }
        return (SubLObject)shop_inference.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 2010L)
    public static SubLObject shop_heuristic_value_max(final SubLObject val1, final SubLObject val2) {
        if (shop_inference.NIL != shop_heuristic_value_LE(val1, val2)) {
            return val2;
        }
        return val1;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 2145L)
    public static SubLObject shop_heuristic_value_min(final SubLObject val1, final SubLObject val2) {
        if (shop_inference.NIL != shop_heuristic_value_LE(val1, val2)) {
            return val1;
        }
        return val2;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 2280L)
    public static SubLObject shop_expand_heuristic(final SubLObject pred, final SubLObject args, final SubLObject body) {
        final SubLObject heuristic_name = Sequences.cconcatenate((SubLObject)shop_inference.$str4$shop_, new SubLObject[] { constants_high.constant_name(pred), shop_inference.$str5$_heuristic });
        final SubLObject heuristic_symbol = Packages.intern(Strings.string_upcase(heuristic_name, (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED), (SubLObject)shop_inference.UNPROVIDED);
        final SubLObject literal = (SubLObject)shop_inference.$sym6$_LITERAL__;
        return (SubLObject)ConsesLow.list((SubLObject)shop_inference.$sym7$PROGN, (SubLObject)ConsesLow.list((SubLObject)shop_inference.$sym8$DEFINE_PUBLIC, heuristic_symbol, (SubLObject)ConsesLow.list(literal), (SubLObject)ConsesLow.listS((SubLObject)shop_inference.$sym9$CDESTRUCTURING_BIND, args, (SubLObject)ConsesLow.list((SubLObject)shop_inference.$sym10$FORMULA_ARGS, literal), ConsesLow.append(body, (SubLObject)shop_inference.NIL))), (SubLObject)ConsesLow.list((SubLObject)shop_inference.$sym11$ADD_SHOP_HEURISTIC, pred, (SubLObject)ConsesLow.list((SubLObject)shop_inference.$sym12$QUOTE, heuristic_symbol)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 2708L)
    public static SubLObject define_shop_heuristic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_inference.$list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = (SubLObject)shop_inference.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_inference.$list13);
        pred = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject body;
        current = (body = temp);
        return shop_expand_heuristic(pred, args, body);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 2827L)
    public static SubLObject shop_evaluatable_literalP(final SubLObject literal, final SubLObject mt) {
        return isa.isaP(cycl_utilities.formula_operator(literal), shop_inference.$const14$EvaluatablePredicate, mt, (SubLObject)shop_inference.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 2953L)
    public static SubLObject shop_bad_evaluatable_literalP(final SubLObject literal, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(shop_inference.NIL != shop_evaluatable_literalP(literal, mt) && shop_inference.NIL == el_utilities.groundP(literal, (SubLObject)shop_inference.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 3094L)
    public static SubLObject shop_estimate_ask_bindings(final SubLObject literal, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_operator(literal);
        final SubLObject h_funcs = find_shop_heuristics(pred);
        SubLObject result = (SubLObject)shop_inference.$kw2$MANY;
        if (shop_inference.NIL != el_utilities.groundP(literal, (SubLObject)shop_inference.UNPROVIDED)) {
            return (SubLObject)shop_inference.ONE_INTEGER;
        }
        if (shop_inference.NIL != cycl_utilities.negatedP(literal)) {
            return (SubLObject)shop_inference.$kw3$LAST;
        }
        if (shop_inference.NIL != shop_evaluatable_literalP(literal, mt)) {
            return (SubLObject)shop_inference.$kw3$LAST;
        }
        SubLObject cdolist_list_var = h_funcs;
        SubLObject cur_func = (SubLObject)shop_inference.NIL;
        cur_func = cdolist_list_var.first();
        while (shop_inference.NIL != cdolist_list_var) {
            final SubLObject new_result = Functions.funcall(cur_func, literal);
            result = shop_heuristic_value_min(new_result, result);
            cdolist_list_var = cdolist_list_var.rest();
            cur_func = cdolist_list_var.first();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 3683L)
    public static SubLObject shop_estimate_best_literal(final SubLObject literals, final SubLObject mbinding, final SubLObject mt) {
        final SubLObject simple_binding = multibindings.mb_simple_binding(mbinding);
        final SubLObject subbed_literals = conses_high.sublis(simple_binding, literals, (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED);
        SubLObject other_literals = (SubLObject)shop_inference.NIL;
        SubLObject best_literal = subbed_literals.first();
        SubLObject best_result = shop_estimate_ask_bindings(best_literal, mt);
        SubLObject cur_result = (SubLObject)shop_inference.NIL;
        SubLObject cdolist_list_var = subbed_literals.rest();
        SubLObject cur_literal = (SubLObject)shop_inference.NIL;
        cur_literal = cdolist_list_var.first();
        while (shop_inference.NIL != cdolist_list_var) {
            cur_result = shop_estimate_ask_bindings(cur_literal, mt);
            if (shop_inference.NIL != shop_bad_evaluatable_literalP(cur_literal, mt) || shop_inference.NIL != shop_heuristic_value_LE(best_result, cur_result)) {
                other_literals = (SubLObject)ConsesLow.cons(cur_literal, other_literals);
            }
            else {
                best_result = cur_result;
                other_literals = (SubLObject)ConsesLow.cons(best_literal, other_literals);
                best_literal = cur_literal;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_literal = cdolist_list_var.first();
        }
        return Values.values(best_literal, other_literals);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 4629L)
    public static SubLObject shop_converse_bindings(final SubLObject v_bindings) {
        SubLObject reversed_bindings = (SubLObject)shop_inference.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject cur_binding = (SubLObject)shop_inference.NIL;
        cur_binding = cdolist_list_var.first();
        while (shop_inference.NIL != cdolist_list_var) {
            reversed_bindings = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(bindings.variable_binding_value(cur_binding), bindings.variable_binding_variable(cur_binding)), reversed_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            cur_binding = cdolist_list_var.first();
        }
        return Sequences.reverse(reversed_bindings);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 5018L)
    public static SubLObject shop_sentence_free_variables(final SubLObject form) {
        return list_utilities.remove_if_not((SubLObject)shop_inference.$sym15$EL_VAR_, list_utilities.flatten(form), (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 5270L)
    public static SubLObject shop_canonicalize_ask(final SubLObject formula, SubLObject mt) {
        if (mt == shop_inference.UNPROVIDED) {
            mt = (SubLObject)shop_inference.NIL;
        }
        if (formula.first().eql(shop_inference.$const16$and)) {
            final SubLObject el_vars = Sequences.nreverse(el_utilities.sentence_free_variables(formula, (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED));
            final SubLObject hl_vars = variables.generate_hl_variable_list(Sequences.length(el_vars));
            final SubLObject el_hl_sub = Sequences.nreverse(conses_high.pairlis(el_vars, hl_vars, (SubLObject)shop_inference.UNPROVIDED));
            final SubLObject hl_form = conses_high.sublis(el_hl_sub, formula, (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED);
            SubLObject hl_pos = (SubLObject)shop_inference.NIL;
            SubLObject hl_neg = (SubLObject)shop_inference.NIL;
            SubLObject cdolist_list_var = hl_form.rest();
            SubLObject cur_literal = (SubLObject)shop_inference.NIL;
            cur_literal = cdolist_list_var.first();
            while (shop_inference.NIL != cdolist_list_var) {
                if (shop_inference.NIL != cycl_utilities.negatedP(cur_literal)) {
                    hl_neg = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg1(cur_literal, (SubLObject)shop_inference.UNPROVIDED), hl_neg);
                }
                else {
                    hl_pos = (SubLObject)ConsesLow.cons(cur_literal, hl_pos);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_literal = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Sequences.nreverse(hl_neg), Sequences.nreverse(hl_pos)), el_hl_sub, el_vars));
        }
        return (SubLObject)shop_inference.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 6375L)
    public static SubLObject shop_query_properties(final SubLObject planner_time_cutoff, SubLObject backchain) {
        if (backchain == shop_inference.UNPROVIDED) {
            backchain = (SubLObject)shop_inference.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_properties = (SubLObject)shop_inference.NIL;
        if (shop_inference.NIL != backchain) {
            v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw17$MAX_TRANSFORMATION_DEPTH, (SubLObject)((shop_inference.T == backchain) ? shop_inference.NIL : backchain));
        }
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw18$CACHE_INFERENCE_RESULTS_, list_utilities.sublisp_boolean(control_vars.$cache_inference_results$.getDynamicValue(thread)));
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw19$ANSWER_LANGUAGE, (SubLObject)shop_inference.$kw20$HL);
        if (shop_inference.NIL != control_vars.$proof_checking_enabled$.getDynamicValue(thread)) {
            v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw21$ALLOWED_RULES, control_vars.$proof_checker_rules$.getDynamicValue(thread));
        }
        else {
            v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw21$ALLOWED_RULES, (SubLObject)shop_inference.$kw22$ALL);
        }
        if (shop_inference.NIL != shop_parameters.$shop_use_inference_supportsP$.getDynamicValue(thread)) {
            v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw23$RETURN, (SubLObject)shop_inference.$kw24$BINDINGS_AND_SUPPORTS);
            v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw25$RESULT_UNIQUENESS, (SubLObject)shop_inference.$kw26$PROOF);
            v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw19$ANSWER_LANGUAGE, (SubLObject)shop_inference.$kw20$HL);
        }
        else {
            v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw23$RETURN, (SubLObject)shop_inference.$kw27$BINDINGS);
            v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw25$RESULT_UNIQUENESS, (SubLObject)shop_inference.$kw27$BINDINGS);
        }
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean(control_vars.$hl_failure_backchaining$.getDynamicValue(thread)));
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw29$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean(control_vars.$unbound_rule_backchain_enabled$.getDynamicValue(thread)));
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw30$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean(control_vars.$evaluatable_backchain_enabled$.getDynamicValue(thread)));
        final SubLObject productivity_limit = (shop_inference.NIL != control_vars.$removal_cost_cutoff$.getDynamicValue(thread)) ? Numbers.multiply((SubLObject)shop_inference.TWO_INTEGER, (SubLObject)shop_inference.$int31$100, control_vars.$removal_cost_cutoff$.getDynamicValue(thread)) : number_utilities.positive_infinity();
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw32$PRODUCTIVITY_LIMIT, productivity_limit);
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw33$NEGATION_BY_FAILURE_, list_utilities.sublisp_boolean(control_vars.$negation_by_failure$.getDynamicValue(thread)));
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw34$INTERMEDIATE_STEP_VALIDATION_LEVEL, shop_parameters.$shop_inference_intermediate_step_validation_level$.getDynamicValue(thread));
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw35$BROWSABLE_, (SubLObject)shop_inference.T);
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw36$PROBABLY_APPROXIMATELY_DONE, (SubLObject)shop_inference.$float37$1_0);
        SubLObject max_time = (SubLObject)shop_inference.NIL;
        if (shop_inference.NIL != planner_time_cutoff) {
            max_time = Numbers.divide(Numbers.integerDivide(planner_time_cutoff, (SubLObject)shop_inference.TEN_INTEGER), time_high.$internal_time_units_per_second$.getGlobalValue());
        }
        else {
            max_time = (SubLObject)shop_inference.$int38$30;
        }
        v_properties = conses_high.putf(v_properties, (SubLObject)shop_inference.$kw39$MAX_TIME, max_time);
        return v_properties;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 9345L)
    public static SubLObject shop_ask_int(final SubLObject formula, final SubLObject mt, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)shop_inference.NIL;
        SubLObject reason = (SubLObject)shop_inference.NIL;
        final SubLObject halt_status = (SubLObject)shop_inference.NIL;
        final SubLObject inference = (SubLObject)shop_inference.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert shop_inference.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            thread.resetMultipleValues();
            final SubLObject v_answer_$1 = inference_kernel.new_cyc_query(formula, mt, query_properties);
            final SubLObject reason_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_answer = v_answer_$1;
            reason = reason_$2;
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return Values.values(v_answer, reason, halt_status, inference);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 9681L)
    public static SubLObject shop_ask(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == shop_inference.UNPROVIDED) {
            mt = (SubLObject)shop_inference.NIL;
        }
        if (backchain == shop_inference.UNPROVIDED) {
            backchain = (SubLObject)shop_inference.NIL;
        }
        if (number == shop_inference.UNPROVIDED) {
            number = (SubLObject)shop_inference.NIL;
        }
        if (time == shop_inference.UNPROVIDED) {
            time = (SubLObject)shop_inference.NIL;
        }
        if (depth == shop_inference.UNPROVIDED) {
            depth = (SubLObject)shop_inference.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!formula.isCons()) {
            return (SubLObject)shop_inference.NIL;
        }
        if (shop_inference.NIL == mt) {
            mt = mt_vars.$default_ask_mt$.getGlobalValue();
        }
        mt = fi.fi_convert_to_fort(mt);
        if (shop_inference.NIL != backchain && backchain != shop_inference.T && !backchain.isInteger()) {
            return (SubLObject)shop_inference.NIL;
        }
        if (shop_inference.NIL != number && !number.isInteger()) {
            return (SubLObject)shop_inference.NIL;
        }
        if (shop_inference.NIL != time && !time.isInteger()) {
            return (SubLObject)shop_inference.NIL;
        }
        if (shop_inference.NIL != depth && !depth.isInteger()) {
            return (SubLObject)shop_inference.NIL;
        }
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        thread.resetMultipleValues();
        final SubLObject v_answer = inference_kernel.new_cyc_query(formula, mt, query_properties);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(v_answer, reason);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 10459L)
    public static SubLObject shop_effect_expand(final SubLObject asent, SubLObject sense) {
        if (sense == shop_inference.UNPROVIDED) {
            sense = (SubLObject)shop_inference.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (shop_inference.NIL != shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread)) {
            final SubLObject v_bindings = shop_basic_world_state.shop_basic_world_state_ask_method(shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread), asent);
            if (shop_inference.NIL != v_bindings) {
                SubLObject cdolist_list_var = v_bindings;
                SubLObject cur_binding = (SubLObject)shop_inference.NIL;
                cur_binding = cdolist_list_var.first();
                while (shop_inference.NIL != cdolist_list_var) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)shop_inference.$kw41$SHOP_EFFECT, bindings.subst_bindings(cur_binding, asent), (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED), cur_binding, (SubLObject)shop_inference.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_binding = cdolist_list_var.first();
                }
            }
            return (SubLObject)shop_inference.NIL;
        }
        return (SubLObject)shop_inference.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 10916L)
    public static SubLObject shop_effect_generate(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return shop_basic_world_state.shop_basic_world_state_ask_method(shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread), asent);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 11044L)
    public static SubLObject shop_effect_required(final SubLObject asent, SubLObject sense) {
        if (sense == shop_inference.UNPROVIDED) {
            sense = (SubLObject)shop_inference.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(shop_inference.NIL != shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread) && shop_inference.NIL != shop_basic_world_state.shop_basic_world_state_ask_method(shop_parameters.$shop_ask_plan_state$.getDynamicValue(thread), asent));
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 11612L)
    public static SubLObject with_query_plan_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_inference.$list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject plan_state = (SubLObject)shop_inference.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_inference.$list43);
        plan_state = current.first();
        current = current.rest();
        if (shop_inference.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)shop_inference.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)shop_inference.$sym44$_SHOP_ASK_PLAN_STATE_, (SubLObject)ConsesLow.list((SubLObject)shop_inference.$sym45$GET_SHOP_BASIC_PLAN_STATE_WORLD_STATE, plan_state)), (SubLObject)ConsesLow.list((SubLObject)shop_inference.$sym46$_SHOP_ASK_MULTIBINDING_, (SubLObject)ConsesLow.list((SubLObject)shop_inference.$sym47$GET_SHOP_BASIC_PLAN_STATE_MBINDINGS, plan_state))), ConsesLow.append(body, (SubLObject)shop_inference.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_inference.$list43);
        return (SubLObject)shop_inference.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 11871L)
    public static SubLObject shop_hypothesize(final SubLObject formula, final SubLObject mt) {
        final SubLObject name_prefix = (SubLObject)shop_inference.$str48$SHOP_HYP;
        return prove.fi_hypothesize_int(formula, mt, name_prefix, (SubLObject)shop_inference.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 12824L)
    public static SubLObject shop_expand_action_list(final SubLObject action_template, final SubLObject pos, final SubLObject arg_list) {
        assert shop_inference.NIL != Types.integerp(pos) : pos;
        assert shop_inference.NIL != Types.listp(arg_list) : arg_list;
        SubLObject result = (SubLObject)shop_inference.NIL;
        if (shop_inference.NIL == arg_list) {
            return Values.values((SubLObject)shop_inference.NIL, (SubLObject)shop_inference.NIL);
        }
        SubLObject cdolist_list_var = arg_list;
        SubLObject item = (SubLObject)shop_inference.NIL;
        item = cdolist_list_var.first();
        while (shop_inference.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg_position_subst(item, (SubLObject)ConsesLow.list(pos), action_template), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(result), (SubLObject)shop_inference.T);
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 13234L)
    public static SubLObject shop_nd_event_fn(SubLObject form) {
        if (shop_inference.NIL != assertion_handles.assertion_p(form)) {
            form = assertions_high.assertion_formula(form);
        }
        if (shop_inference.NIL == el_utilities.cafP(form)) {
            relation_evaluation.throw_unevaluatable();
        }
        PrintLow.format((SubLObject)shop_inference.T, (SubLObject)shop_inference.$str51$shop_nd_event_fn___a, form);
        SubLObject pred_form = cycl_utilities.formula_operator(form);
        if (cycl_utilities.formula_operator(pred_form).eql(shop_inference.$const52$ComplexActionFn)) {
            pred_form = cycl_utilities.formula_arg1(pred_form, (SubLObject)shop_inference.UNPROVIDED);
        }
        if (cycl_utilities.formula_operator(pred_form).eql(shop_inference.$const53$NonDavidsonianPredFn)) {
            return cycl_utilities.formula_arg1(pred_form, (SubLObject)shop_inference.UNPROVIDED);
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)shop_inference.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/shop-inference.lisp", position = 13828L)
    public static SubLObject shop_nd_actor_fn(SubLObject form, final SubLObject role) {
        if (shop_inference.NIL != assertion_handles.assertion_p(form)) {
            form = assertions_high.assertion_formula(form);
        }
        if (shop_inference.NIL == el_utilities.cafP(form)) {
            relation_evaluation.throw_unevaluatable();
        }
        PrintLow.format((SubLObject)shop_inference.T, (SubLObject)shop_inference.$str55$shop_nd_actor_fn___a__a, form, role);
        SubLObject pred_form = cycl_utilities.formula_operator(form);
        final SubLObject formula_args = cycl_utilities.formula_args(form, (SubLObject)shop_inference.UNPROVIDED);
        SubLObject role_list = (SubLObject)shop_inference.NIL;
        if (cycl_utilities.formula_operator(pred_form).eql(shop_inference.$const52$ComplexActionFn)) {
            pred_form = cycl_utilities.formula_arg1(pred_form, (SubLObject)shop_inference.UNPROVIDED);
        }
        if (cycl_utilities.formula_operator(pred_form).eql(shop_inference.$const53$NonDavidsonianPredFn)) {
            role_list = cycl_utilities.formula_arg2(pred_form, (SubLObject)shop_inference.UNPROVIDED).rest();
            final SubLObject alist = conses_high.pairlis(role_list, formula_args, (SubLObject)shop_inference.UNPROVIDED);
            return conses_high.assoc(role, alist, (SubLObject)shop_inference.UNPROVIDED, (SubLObject)shop_inference.UNPROVIDED).rest();
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)shop_inference.NIL;
    }

    public static SubLObject declare_shop_inference_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shop_inference", "with_shop_inference_defaults", "WITH-SHOP-INFERENCE-DEFAULTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "add_shop_heuristic", "ADD-SHOP-HEURISTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "find_shop_heuristics", "FIND-SHOP-HEURISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_heuristic_value_p", "SHOP-HEURISTIC-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_heuristic_value_LE", "SHOP-HEURISTIC-VALUE-<=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_heuristic_value_max", "SHOP-HEURISTIC-VALUE-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_heuristic_value_min", "SHOP-HEURISTIC-VALUE-MIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_expand_heuristic", "SHOP-EXPAND-HEURISTIC", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shop_inference", "define_shop_heuristic", "DEFINE-SHOP-HEURISTIC");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_evaluatable_literalP", "SHOP-EVALUATABLE-LITERAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_bad_evaluatable_literalP", "SHOP-BAD-EVALUATABLE-LITERAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_estimate_ask_bindings", "SHOP-ESTIMATE-ASK-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_estimate_best_literal", "SHOP-ESTIMATE-BEST-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_converse_bindings", "SHOP-CONVERSE-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_sentence_free_variables", "SHOP-SENTENCE-FREE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_canonicalize_ask", "SHOP-CANONICALIZE-ASK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_query_properties", "SHOP-QUERY-PROPERTIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_ask_int", "SHOP-ASK-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_ask", "SHOP-ASK", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_effect_expand", "SHOP-EFFECT-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_effect_generate", "SHOP-EFFECT-GENERATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_effect_required", "SHOP-EFFECT-REQUIRED", 1, 1, false);
        new $shop_effect_required$UnaryFunction();
        new $shop_effect_required$BinaryFunction();
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shop_inference", "with_query_plan_state", "WITH-QUERY-PLAN-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_hypothesize", "SHOP-HYPOTHESIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_expand_action_list", "SHOP-EXPAND-ACTION-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_nd_event_fn", "SHOP-ND-EVENT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_inference", "shop_nd_actor_fn", "SHOP-ND-ACTOR-FN", 2, 0, false);
        return (SubLObject)shop_inference.NIL;
    }

    public static SubLObject init_shop_inference_file() {
        shop_inference.$shop_use_new_inference_harnessP$ = SubLFiles.defparameter("*SHOP-USE-NEW-INFERENCE-HARNESS?*", (SubLObject)shop_inference.T);
        return (SubLObject)shop_inference.NIL;
    }

    public static SubLObject setup_shop_inference_file() {
        inference_modules.inference_removal_module((SubLObject)shop_inference.$kw41$SHOP_EFFECT, (SubLObject)shop_inference.$list42);
        utilities_macros.register_kb_function((SubLObject)shop_inference.$sym54$SHOP_ND_EVENT_FN);
        utilities_macros.register_kb_function((SubLObject)shop_inference.$sym56$SHOP_ND_ACTOR_FN);
        return (SubLObject)shop_inference.NIL;
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
        me = (SubLFile)new shop_inference();
        shop_inference.$shop_use_new_inference_harnessP$ = null;
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*")));
        $kw2$MANY = SubLObjectFactory.makeKeyword("MANY");
        $kw3$LAST = SubLObjectFactory.makeKeyword("LAST");
        $str4$shop_ = SubLObjectFactory.makeString("shop-");
        $str5$_heuristic = SubLObjectFactory.makeString("-heuristic");
        $sym6$_LITERAL__ = SubLObjectFactory.makeSymbol("?LITERAL??");
        $sym7$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym8$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym9$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym10$FORMULA_ARGS = SubLObjectFactory.makeSymbol("FORMULA-ARGS");
        $sym11$ADD_SHOP_HEURISTIC = SubLObjectFactory.makeSymbol("ADD-SHOP-HEURISTIC");
        $sym12$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $const14$EvaluatablePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatablePredicate"));
        $sym15$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $const16$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw17$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw18$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw19$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw20$HL = SubLObjectFactory.makeKeyword("HL");
        $kw21$ALLOWED_RULES = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $kw22$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw23$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw24$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw25$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw26$PROOF = SubLObjectFactory.makeKeyword("PROOF");
        $kw27$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw28$ALLOW_HL_PREDICATE_TRANSFORMATION_ = SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $kw29$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $kw30$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $int31$100 = SubLObjectFactory.makeInteger(100);
        $kw32$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $kw33$NEGATION_BY_FAILURE_ = SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?");
        $kw34$INTERMEDIATE_STEP_VALIDATION_LEVEL = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $kw35$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw36$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $float37$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $int38$30 = SubLObjectFactory.makeInteger(30);
        $kw39$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $sym40$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $kw41$SHOP_EFFECT = SubLObjectFactory.makeKeyword("SHOP-EFFECT");
        $list42 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("SHOP-EFFECT-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("SHOP-EFFECT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fort> . <anything>)\n    Queries the dynamically bound plan state for literal.") });
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym44$_SHOP_ASK_PLAN_STATE_ = SubLObjectFactory.makeSymbol("*SHOP-ASK-PLAN-STATE*");
        $sym45$GET_SHOP_BASIC_PLAN_STATE_WORLD_STATE = SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-PLAN-STATE-WORLD-STATE");
        $sym46$_SHOP_ASK_MULTIBINDING_ = SubLObjectFactory.makeSymbol("*SHOP-ASK-MULTIBINDING*");
        $sym47$GET_SHOP_BASIC_PLAN_STATE_MBINDINGS = SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-PLAN-STATE-MBINDINGS");
        $str48$SHOP_HYP = SubLObjectFactory.makeString("SHOP-HYP");
        $sym49$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym50$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str51$shop_nd_event_fn___a = SubLObjectFactory.makeString("shop-nd-event-fn: ~a");
        $const52$ComplexActionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComplexActionFn"));
        $const53$NonDavidsonianPredFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonDavidsonianPredFn"));
        $sym54$SHOP_ND_EVENT_FN = SubLObjectFactory.makeSymbol("SHOP-ND-EVENT-FN");
        $str55$shop_nd_actor_fn___a__a = SubLObjectFactory.makeString("shop-nd-actor-fn: ~a ~a");
        $sym56$SHOP_ND_ACTOR_FN = SubLObjectFactory.makeSymbol("SHOP-ND-ACTOR-FN");
    }

    public static final class $shop_effect_required$UnaryFunction extends UnaryFunction
    {
        public $shop_effect_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SHOP-EFFECT-REQUIRED"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return shop_inference.shop_effect_required(arg1, (SubLObject)UNPROVIDED);
        }
    }

    public static final class $shop_effect_required$BinaryFunction extends BinaryFunction
    {
        public $shop_effect_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SHOP-EFFECT-REQUIRED"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return shop_inference.shop_effect_required(arg1, arg2);
        }
    }
}

/*

	Total time: 357 ms

*/