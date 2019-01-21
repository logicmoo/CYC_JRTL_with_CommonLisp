package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class relation_evaluation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.relation_evaluation";
    public static final String myFingerPrint = "3b0652cf9ca3ef35b9e6ae5ef8dd9803e24e321cf0606859bbc87198cc034b29";
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 1603L)
    private static SubLSymbol $cyc_evaluate_gather_justificationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 1742L)
    private static SubLSymbol $cyc_evaluate_supports$;
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 4652L)
    public static SubLSymbol $cyc_evaluate_relation$;
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 4805L)
    private static SubLSymbol $cyc_evaluate_some_contextualized_relationP$;
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 13669L)
    private static SubLSymbol $cached_evaluation_function_caching_state$;
    private static final SubLSymbol $sym0$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const1$EverythingPSC;
    private static final SubLObject $const2$evaluationDefn;
    private static final SubLSymbol $sym3$SUPPORT_P;
    private static final SubLSymbol $sym4$SUPPORT_EQUAL;
    private static final SubLSymbol $kw5$QUERY;
    private static final SubLObject $const6$SubLQuoteFn;
    private static final SubLSymbol $kw7$TRUE;
    private static final SubLSymbol $kw8$UNBOUND;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$CCATCH;
    private static final SubLSymbol $kw11$UNEVALUATABLE;
    private static final SubLSymbol $sym12$THROW_UNEVALUATABLE;
    private static final SubLSymbol $sym13$NOTING_UNEVALUATABLE;
    private static final SubLSymbol $sym14$CATCH_ERROR_MESSAGE;
    private static final SubLSymbol $sym15$CATCH_THIS;
    private static final SubLSymbol $sym16$CLET;
    private static final SubLSymbol $sym17$IGNORE;
    private static final SubLSymbol $kw18$UNTRANSLATABLE;
    private static final SubLSymbol $sym19$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str20$Error_from__cyc_evaluate__A____A;
    private static final SubLSymbol $sym21$UNKNOWN_SCALAR_INTERVAL_P;
    private static final SubLObject $const22$UnknownScalarInterval;
    private static final SubLSymbol $kw23$RECURSION_LIMIT_EXCEEDED;
    private static final SubLSymbol $sym24$CYC_EVALUATE_ARG;
    private static final SubLSymbol $sym25$CYC_FUNCTION_TO_ARG;
    private static final SubLSymbol $sym26$CYC_LAMBDA;
    private static final SubLSymbol $sym27$CACHED_EVALUATION_FUNCTION;
    private static final SubLSymbol $sym28$_CACHED_EVALUATION_FUNCTION_CACHING_STATE_;
    private static final SubLSymbol $sym29$CLEAR_CACHED_EVALUATION_FUNCTION;
    private static final SubLObject $const30$FunctionToArg;
    private static final SubLSymbol $sym31$_VALUE;
    private static final SubLSymbol $sym32$MAKE_VARIABLE_BINDING;
    private static final SubLSymbol $kw33$MAX_NUMBER;
    private static final SubLSymbol $kw34$ALLOW_INDETERMINATE_RESULTS_;
    private static final SubLSymbol $kw35$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw36$HL;
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 615L)
    public static SubLObject evaluatable_functionP(final SubLObject function) {
        return (SubLObject)SubLObjectFactory.makeBoolean((relation_evaluation.NIL != forts.fort_p(function) && relation_evaluation.NIL != fort_types_interface.evaluatable_function_p(function)) || relation_evaluation.NIL != function_to_arg_function_p(function) || relation_evaluation.NIL != el_utilities.lambda_function_p(function));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 960L)
    public static SubLObject evaluatable_predicateP(final SubLObject predicate, SubLObject mt) {
        if (mt == relation_evaluation.UNPROVIDED) {
            mt = (SubLObject)relation_evaluation.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(relation_evaluation.NIL != forts.fort_p(predicate) && relation_evaluation.NIL != fort_types_interface.evaluatable_predicate_p(predicate, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 1099L)
    public static SubLObject evaluatable_relationP(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)relation_evaluation.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)relation_evaluation.$sym0$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(relation_evaluation.$const1$EverythingPSC, thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(relation_evaluation.NIL != evaluatable_functionP(relation) || relation_evaluation.NIL != evaluatable_predicateP(relation, (SubLObject)relation_evaluation.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 1294L)
    public static SubLObject evaluatable_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(relation_evaluation.NIL != el_utilities.el_formula_p(v_object) && relation_evaluation.NIL != backward_utilities.inference_closed_termP(v_object) && relation_evaluation.NIL != evaluatable_relationP(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 1468L)
    public static SubLObject evaluation_defn(final SubLObject fort, SubLObject mt) {
        if (mt == relation_evaluation.UNPROVIDED) {
            mt = (SubLObject)relation_evaluation.NIL;
        }
        return el_utilities.cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(fort, relation_evaluation.$const2$evaluationDefn, mt, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 1793L)
    public static SubLObject cyc_evaluate_gathering_justificationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return relation_evaluation.$cyc_evaluate_gather_justificationsP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 1899L)
    public static SubLObject cyc_evaluate_note_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert relation_evaluation.NIL != arguments.support_p(support) : support;
        if (relation_evaluation.NIL != relation_evaluation.$cyc_evaluate_gather_justificationsP$.getDynamicValue(thread) && relation_evaluation.NIL == conses_high.member(support, relation_evaluation.$cyc_evaluate_supports$.getDynamicValue(thread), (SubLObject)relation_evaluation.$sym4$SUPPORT_EQUAL, Symbols.symbol_function((SubLObject)relation_evaluation.IDENTITY))) {
            relation_evaluation.$cyc_evaluate_supports$.setDynamicValue((SubLObject)ConsesLow.cons(support, relation_evaluation.$cyc_evaluate_supports$.getDynamicValue(thread)), thread);
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 2114L)
    public static SubLObject cyc_evaluate_justify(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)relation_evaluation.NIL;
        final SubLObject _prev_bind_0 = relation_evaluation.$cyc_evaluate_gather_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = relation_evaluation.$cyc_evaluate_supports$.currentBinding(thread);
        try {
            relation_evaluation.$cyc_evaluate_gather_justificationsP$.bind((SubLObject)relation_evaluation.T, thread);
            relation_evaluation.$cyc_evaluate_supports$.bind((SubLObject)relation_evaluation.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result = cyc_evaluate(expression);
            final SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (relation_evaluation.NIL != valid) {
                supports = Sequences.nreverse(relation_evaluation.$cyc_evaluate_supports$.getDynamicValue(thread));
            }
        }
        finally {
            relation_evaluation.$cyc_evaluate_supports$.rebind(_prev_bind_2, thread);
            relation_evaluation.$cyc_evaluate_gather_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 2577L)
    public static SubLObject note_cyc_evaluate_argument_support(final SubLObject evaluated_arg, final SubLObject input_arg) {
        if (relation_evaluation.NIL != cyc_evaluate_gathering_justificationsP()) {
            final SubLObject sentence = removal_modules_evaluate.make_evaluate_sentence(evaluated_arg, input_arg);
            final SubLObject support = removal_modules_evaluation.make_eval_support(sentence, (SubLObject)relation_evaluation.UNPROVIDED);
            cyc_evaluate_note_support(support);
            return (SubLObject)relation_evaluation.T;
        }
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 2916L)
    public static SubLObject note_cyc_evaluate_final_support(final SubLObject result, final SubLObject relation, final SubLObject args) {
        if (relation_evaluation.NIL != cyc_evaluate_gathering_justificationsP()) {
            final SubLObject expression = el_utilities.make_formula(relation, args, (SubLObject)relation_evaluation.UNPROVIDED);
            final SubLObject sentence = (relation_evaluation.NIL != evaluatable_functionP(relation)) ? removal_modules_evaluate.make_evaluate_sentence(result, expression) : expression;
            final SubLObject support = removal_modules_evaluation.make_eval_support(sentence, (SubLObject)relation_evaluation.UNPROVIDED);
            cyc_evaluate_note_support(support);
            return (SubLObject)relation_evaluation.T;
        }
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 3319L)
    public static SubLObject note_cyc_evaluate_expansion_support(final SubLObject result, final SubLObject expanded_formula) {
        if (relation_evaluation.NIL != cyc_evaluate_gathering_justificationsP()) {
            final SubLObject relation = cycl_utilities.formula_operator(expanded_formula);
            final SubLObject sentence = (relation_evaluation.NIL != evaluatable_functionP(relation)) ? removal_modules_evaluate.make_evaluate_sentence(result, expanded_formula) : expanded_formula;
            final SubLObject support = (relation_evaluation.NIL != evaluatable_functionP(relation)) ? removal_modules_evaluation.make_eval_support(sentence, (SubLObject)relation_evaluation.UNPROVIDED) : arguments.make_hl_support((SubLObject)relation_evaluation.$kw5$QUERY, sentence, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED);
            cyc_evaluate_note_support(support);
            return (SubLObject)relation_evaluation.T;
        }
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 3821L)
    public static SubLObject note_expansion_support(final SubLObject unexpanded_formula, final SubLObject expanded_formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (relation_evaluation.NIL != cyc_evaluate_gathering_justificationsP()) {
            thread.resetMultipleValues();
            final SubLObject justified_formula = verbosifier.el_expand_all_evaluatable_justified(unexpanded_formula, mt);
            final SubLObject justified_mt = thread.secondMultipleValue();
            final SubLObject supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (justified_formula.equal(expanded_formula)) {
                SubLObject cdolist_list_var = supports;
                SubLObject support = (SubLObject)relation_evaluation.NIL;
                support = cdolist_list_var.first();
                while (relation_evaluation.NIL != cdolist_list_var) {
                    cyc_evaluate_note_support(support);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                }
                return (SubLObject)relation_evaluation.T;
            }
        }
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 4247L)
    public static SubLObject note_evaluation_function_support(final SubLObject relation, final SubLObject evaluation_function) {
        if (relation_evaluation.NIL != cyc_evaluate_gathering_justificationsP()) {
            final SubLObject subl_function_term = el_utilities.make_unary_formula(relation_evaluation.$const6$SubLQuoteFn, evaluation_function);
            final SubLObject gafs = kb_mapping_utilities.pred_u_v_holds_gafs(relation_evaluation.$const2$evaluationDefn, relation, subl_function_term, (SubLObject)relation_evaluation.ONE_INTEGER, (SubLObject)relation_evaluation.TWO_INTEGER, (SubLObject)relation_evaluation.$kw7$TRUE);
            final SubLObject support = gafs.first();
            if (relation_evaluation.NIL != support) {
                cyc_evaluate_note_support(support);
                return (SubLObject)relation_evaluation.T;
            }
        }
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 4943L)
    public static SubLObject noting_unevaluatable(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject failure_var = (SubLObject)relation_evaluation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)relation_evaluation.$list9);
        failure_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)relation_evaluation.$sym10$CCATCH, (SubLObject)relation_evaluation.$kw11$UNEVALUATABLE, failure_var, ConsesLow.append(body, (SubLObject)relation_evaluation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 5164L)
    public static SubLObject throw_unevaluatable() {
        Dynamic.sublisp_throw((SubLObject)relation_evaluation.$kw11$UNEVALUATABLE, (SubLObject)relation_evaluation.T);
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 5299L)
    public static SubLObject noting_evaluation_failure(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject failure_var = (SubLObject)relation_evaluation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)relation_evaluation.$list9);
        failure_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)relation_evaluation.$sym13$NOTING_UNEVALUATABLE, failure_var, (SubLObject)ConsesLow.listS((SubLObject)relation_evaluation.$sym14$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(failure_var), ConsesLow.append(body, (SubLObject)relation_evaluation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 5603L)
    public static SubLObject ignoring_unevaluatable(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject catch_this = (SubLObject)relation_evaluation.$sym15$CATCH_THIS;
        return (SubLObject)ConsesLow.list((SubLObject)relation_evaluation.$sym16$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(catch_this)), (SubLObject)ConsesLow.listS((SubLObject)relation_evaluation.$sym13$NOTING_UNEVALUATABLE, catch_this, (SubLObject)ConsesLow.list((SubLObject)relation_evaluation.$sym17$IGNORE, catch_this), ConsesLow.append(body, (SubLObject)relation_evaluation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 5891L)
    public static SubLObject possibly_note_contextualized_evaluatable_relation(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (relation_evaluation.NIL == relation_evaluation.$cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread)) {
            relation_evaluation.$cyc_evaluate_some_contextualized_relationP$.setDynamicValue(fort_types_interface.evaluatable_relation_contextualized_p(relation), thread);
        }
        return relation_evaluation.$cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 6287L)
    public static SubLObject cyc_evaluate(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)relation_evaluation.NIL;
        SubLObject unevaluatable = (SubLObject)relation_evaluation.NIL;
        SubLObject contextualizedP = (SubLObject)relation_evaluation.NIL;
        if (relation_evaluation.NIL != list_utilities.simple_tree_find((SubLObject)relation_evaluation.$kw18$UNTRANSLATABLE, expression)) {
            return valid_evaluation((SubLObject)relation_evaluation.$kw18$UNTRANSLATABLE, (SubLObject)relation_evaluation.NIL);
        }
        final SubLObject _prev_bind_0 = relation_evaluation.$cyc_evaluate_some_contextualized_relationP$.currentBinding(thread);
        try {
            relation_evaluation.$cyc_evaluate_some_contextualized_relationP$.bind((SubLObject)relation_evaluation.NIL, thread);
            SubLObject error_message = (SubLObject)relation_evaluation.NIL;
            try {
                thread.throwStack.push(relation_evaluation.$kw11$UNEVALUATABLE);
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)relation_evaluation.$sym19$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            v_answer = cyc_evaluate_internal(expression, (SubLObject)relation_evaluation.T);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)relation_evaluation.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (relation_evaluation.NIL != error_message) {
                    Errors.warn((SubLObject)relation_evaluation.$str20$Error_from__cyc_evaluate__A____A, el_utilities.sefify(expression), error_message);
                    unevaluatable = (SubLObject)relation_evaluation.T;
                }
                contextualizedP = list_utilities.sublisp_boolean(relation_evaluation.$cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread));
            }
            catch (Throwable ccatch_env_var) {
                unevaluatable = Errors.handleThrowable(ccatch_env_var, (SubLObject)relation_evaluation.$kw11$UNEVALUATABLE);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            relation_evaluation.$cyc_evaluate_some_contextualized_relationP$.rebind(_prev_bind_0, thread);
        }
        if (relation_evaluation.NIL == cycl_grammar.cycl_atomic_sentence_p(expression) && relation_evaluation.NIL != unevaluatable && relation_evaluation.NIL == kb_control_vars.within_forward_inferenceP() && relation_evaluation.NIL != contains_an_unknown_scalar_intervalP(expression)) {
            v_answer = simplify_unknown_scalar_interval_evaluation(expression);
            contextualizedP = list_utilities.sublisp_boolean(relation_evaluation.$cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread));
            unevaluatable = (SubLObject)relation_evaluation.NIL;
        }
        if (relation_evaluation.NIL != unevaluatable) {
            return invalid_evaluation();
        }
        return valid_evaluation(v_answer, contextualizedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 7770L)
    public static SubLObject contains_an_unknown_scalar_intervalP(final SubLObject expression) {
        return cycl_utilities.expression_find_if((SubLObject)relation_evaluation.$sym21$UNKNOWN_SCALAR_INTERVAL_P, expression, (SubLObject)relation_evaluation.NIL, (SubLObject)relation_evaluation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 7909L)
    public static SubLObject unknown_scalar_interval_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(relation_evaluation.NIL != forts.fort_p(v_object) && relation_evaluation.NIL != fort_types_interface.fort_has_typeP(v_object, relation_evaluation.$const22$UnknownScalarInterval, mt_vars.$anect_mt$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 8060L)
    public static SubLObject simplify_unknown_scalar_interval_evaluation(final SubLObject expression) {
        return czer_main.canonicalize_term(expression, (SubLObject)relation_evaluation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 8184L)
    public static SubLObject cyc_evaluate_all_unary(final SubLObject function, final SubLObject item_list, SubLObject allow_partialP) {
        if (allow_partialP == relation_evaluation.UNPROVIDED) {
            allow_partialP = (SubLObject)relation_evaluation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)relation_evaluation.NIL;
        SubLObject contextualizedP = (SubLObject)relation_evaluation.NIL;
        SubLObject cdolist_list_var = item_list;
        SubLObject item = (SubLObject)relation_evaluation.NIL;
        item = cdolist_list_var.first();
        while (relation_evaluation.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject item_answer = cyc_evaluate((SubLObject)ConsesLow.list(function, item));
            final SubLObject valid = thread.secondMultipleValue();
            final SubLObject this_one_contextualizedP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (relation_evaluation.NIL != valid) {
                v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(item, item_answer), v_answer);
                if (relation_evaluation.NIL != this_one_contextualizedP) {
                    contextualizedP = (SubLObject)relation_evaluation.T;
                }
            }
            else if (relation_evaluation.NIL == allow_partialP) {
                return invalid_evaluation();
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return valid_evaluation(Sequences.nreverse(v_answer), contextualizedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 8851L)
    public static SubLObject cyc_evaluate_sort(final SubLObject sequence, final SubLObject predicate, SubLObject key, SubLObject contextualizedP) {
        if (key == relation_evaluation.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)relation_evaluation.IDENTITY);
        }
        if (contextualizedP == relation_evaluation.UNPROVIDED) {
            contextualizedP = (SubLObject)relation_evaluation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)relation_evaluation.NIL;
        SubLObject unevaluatable = (SubLObject)relation_evaluation.NIL;
        try {
            thread.throwStack.push(relation_evaluation.$kw11$UNEVALUATABLE);
            v_answer = Sort.sort(sequence, predicate, key);
        }
        catch (Throwable ccatch_env_var) {
            unevaluatable = Errors.handleThrowable(ccatch_env_var, (SubLObject)relation_evaluation.$kw11$UNEVALUATABLE);
        }
        finally {
            thread.throwStack.pop();
        }
        if (relation_evaluation.NIL != unevaluatable) {
            return invalid_evaluation();
        }
        return valid_evaluation(v_answer, contextualizedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 9183L)
    public static SubLObject valid_evaluation(final SubLObject v_answer, final SubLObject contextualizedP) {
        return Values.values(v_answer, (SubLObject)relation_evaluation.T, contextualizedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 9299L)
    public static SubLObject invalid_evaluation() {
        return Values.values((SubLObject)relation_evaluation.NIL, (SubLObject)relation_evaluation.NIL, (SubLObject)relation_evaluation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 9368L)
    public static SubLObject cyc_evaluate_internal(final SubLObject formula, final SubLObject consider_expansionP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject relation = cycl_utilities.formula_operator(formula);
        if (relation_evaluation.NIL == evaluatable_relationP(relation)) {
            throw_unevaluatable();
        }
        final SubLObject evaluation_function = evaluation_function(relation);
        if (relation_evaluation.NIL == eval_in_api.possibly_cyc_api_function_spec_p(evaluation_function) && (relation_evaluation.NIL == consider_expansionP || relation_evaluation.NIL == czer_utilities.relation_has_expansionP(relation, (SubLObject)relation_evaluation.UNPROVIDED))) {
            throw_unevaluatable();
        }
        final SubLObject input_args = cycl_utilities.formula_args(formula, (SubLObject)relation_evaluation.UNPROVIDED);
        final SubLObject args = cyc_evaluate_args(input_args);
        SubLObject v_answer = (SubLObject)relation_evaluation.NIL;
        possibly_note_contextualized_evaluatable_relation(relation);
        if (relation_evaluation.NIL != eval_in_api.possibly_cyc_api_function_spec_p(evaluation_function)) {
            final SubLObject _prev_bind_0 = relation_evaluation.$cyc_evaluate_relation$.currentBinding(thread);
            try {
                relation_evaluation.$cyc_evaluate_relation$.bind(relation, thread);
                final SubLObject v_arity = evaluation_arity(relation);
                if (relation_evaluation.NIL == v_arity) {
                    v_answer = eval_in_api.possibly_cyc_api_funcall_1(evaluation_function, args);
                }
                else {
                    if (!v_arity.numE(Sequences.length(args))) {
                        throw_unevaluatable();
                    }
                    v_answer = eval_in_api.possibly_cyc_api_apply(evaluation_function, args);
                }
            }
            finally {
                relation_evaluation.$cyc_evaluate_relation$.rebind(_prev_bind_0, thread);
            }
            if (input_args.equal(args)) {
                note_evaluation_function_support(relation, evaluation_function);
            }
            else {
                note_cyc_evaluate_final_support(v_answer, relation, args);
            }
            return v_answer;
        }
        final SubLObject expanded_formula = verbosifier.el_expand_all_evaluatable(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
        if (relation_evaluation.$kw23$RECURSION_LIMIT_EXCEEDED == expanded_formula || expanded_formula.equal(formula)) {
            throw_unevaluatable();
        }
        SubLObject v_answer_$2 = (SubLObject)relation_evaluation.NIL;
        v_answer_$2 = cyc_evaluate_if_evaluatable(expanded_formula, (SubLObject)relation_evaluation.NIL);
        if (v_answer_$2.equal(expanded_formula) && relation_evaluation.NIL != el_grammar.el_sentence_p(expanded_formula) && relation_evaluation.NIL == ask_utilities.recursive_query(expanded_formula, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED)) {
            v_answer_$2 = (SubLObject)relation_evaluation.NIL;
        }
        if (relation_evaluation.NIL != v_answer_$2) {
            note_cyc_evaluate_expansion_support(v_answer_$2, expanded_formula);
            note_expansion_support(formula, expanded_formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            return v_answer_$2;
        }
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 11896L)
    public static SubLObject cyc_evaluate_args(final SubLObject args) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)relation_evaluation.$sym24$CYC_EVALUATE_ARG), args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 12026L)
    public static SubLObject cyc_evaluate_arg(final SubLObject input_arg) {
        return cyc_evaluate_if_evaluatable(input_arg, (SubLObject)relation_evaluation.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 12123L)
    public static SubLObject cyc_evaluate_if_evaluatable(final SubLObject expression, SubLObject consider_expansionP) {
        if (consider_expansionP == relation_evaluation.UNPROVIDED) {
            consider_expansionP = (SubLObject)relation_evaluation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (relation_evaluation.NIL == evaluatable_expressionP(expression)) {
            return expression;
        }
        SubLObject evaluated_expression = (SubLObject)relation_evaluation.NIL;
        final SubLObject _prev_bind_0 = relation_evaluation.$cyc_evaluate_gather_justificationsP$.currentBinding(thread);
        try {
            relation_evaluation.$cyc_evaluate_gather_justificationsP$.bind((SubLObject)relation_evaluation.NIL, thread);
            evaluated_expression = cyc_evaluate_internal(expression, consider_expansionP);
        }
        finally {
            relation_evaluation.$cyc_evaluate_gather_justificationsP$.rebind(_prev_bind_0, thread);
        }
        note_cyc_evaluate_argument_support(evaluated_expression, expression);
        return evaluated_expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 12612L)
    public static SubLObject evaluation_function(final SubLObject relation) {
        if (relation_evaluation.NIL != forts.fort_p(relation)) {
            return cached_evaluation_function(relation);
        }
        if (relation_evaluation.NIL != function_to_arg_function_p(relation)) {
            return (SubLObject)relation_evaluation.$sym25$CYC_FUNCTION_TO_ARG;
        }
        if (relation_evaluation.NIL != el_utilities.lambda_function_p(relation)) {
            return (SubLObject)relation_evaluation.$sym26$CYC_LAMBDA;
        }
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 12893L)
    public static SubLObject evaluation_arity(final SubLObject relation) {
        if (relation_evaluation.NIL != forts.fort_p(relation)) {
            return arity.arity(relation);
        }
        if (relation_evaluation.NIL != function_to_arg_function_p(relation)) {
            final SubLObject predicate = cycl_utilities.nat_arg2(relation, (SubLObject)relation_evaluation.UNPROVIDED);
            if (relation_evaluation.NIL != forts.fort_p(predicate)) {
                final SubLObject predicate_arity = arity.arity(predicate);
                if (predicate_arity.isInteger() && predicate_arity.numG((SubLObject)relation_evaluation.ZERO_INTEGER)) {
                    return Numbers.subtract(predicate_arity, (SubLObject)relation_evaluation.ONE_INTEGER);
                }
            }
            else {
                if (relation_evaluation.NIL == el_utilities.kappa_predicate_p(predicate)) {
                    return (SubLObject)relation_evaluation.NIL;
                }
                final SubLObject predicate_arity = el_utilities.kappa_predicate_arity(predicate);
                if (predicate_arity.isInteger() && predicate_arity.numG((SubLObject)relation_evaluation.ZERO_INTEGER)) {
                    return Numbers.subtract(predicate_arity, (SubLObject)relation_evaluation.ONE_INTEGER);
                }
            }
            return (SubLObject)relation_evaluation.NIL;
        }
        if (relation_evaluation.NIL != el_utilities.lambda_function_p(relation)) {
            return el_utilities.lambda_function_arity(relation);
        }
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 13669L)
    public static SubLObject clear_cached_evaluation_function() {
        final SubLObject cs = relation_evaluation.$cached_evaluation_function_caching_state$.getGlobalValue();
        if (relation_evaluation.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 13669L)
    public static SubLObject remove_cached_evaluation_function(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args(relation_evaluation.$cached_evaluation_function_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation), (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 13669L)
    public static SubLObject cached_evaluation_function_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)relation_evaluation.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)relation_evaluation.$sym0$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(relation_evaluation.$const1$EverythingPSC, thread);
            result = evaluation_defn(relation, (SubLObject)relation_evaluation.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 13669L)
    public static SubLObject cached_evaluation_function(final SubLObject relation) {
        SubLObject caching_state = relation_evaluation.$cached_evaluation_function_caching_state$.getGlobalValue();
        if (relation_evaluation.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)relation_evaluation.$sym27$CACHED_EVALUATION_FUNCTION, (SubLObject)relation_evaluation.$sym28$_CACHED_EVALUATION_FUNCTION_CACHING_STATE_, (SubLObject)relation_evaluation.NIL, (SubLObject)relation_evaluation.EQL, (SubLObject)relation_evaluation.ONE_INTEGER, (SubLObject)relation_evaluation.TEN_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)relation_evaluation.$sym29$CLEAR_CACHED_EVALUATION_FUNCTION);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_evaluation_function_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, (SubLObject)relation_evaluation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 14012L)
    public static SubLObject function_to_arg_function_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(relation_evaluation.NIL != el_utilities.el_formula_with_operator_p(v_object, relation_evaluation.$const30$FunctionToArg) && relation_evaluation.NIL != el_utilities.formula_arityE(v_object, (SubLObject)relation_evaluation.TWO_INTEGER, (SubLObject)relation_evaluation.UNPROVIDED) && cycl_utilities.nat_arg1(v_object, (SubLObject)relation_evaluation.UNPROVIDED).isInteger() && (relation_evaluation.NIL != forts.fort_p(cycl_utilities.nat_arg2(v_object, (SubLObject)relation_evaluation.UNPROVIDED)) || relation_evaluation.NIL != el_utilities.kappa_predicate_p(cycl_utilities.nat_arg2(v_object, (SubLObject)relation_evaluation.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 14346L)
    public static SubLObject cyc_function_to_arg(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == relation_evaluation.UNPROVIDED) {
            arg1 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg2 == relation_evaluation.UNPROVIDED) {
            arg2 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg3 == relation_evaluation.UNPROVIDED) {
            arg3 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg4 == relation_evaluation.UNPROVIDED) {
            arg4 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg5 == relation_evaluation.UNPROVIDED) {
            arg5 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg6 == relation_evaluation.UNPROVIDED) {
            arg6 = (SubLObject)relation_evaluation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function_arg = cycl_utilities.nat_arg1(relation_evaluation.$cyc_evaluate_relation$.getDynamicValue(thread), (SubLObject)relation_evaluation.UNPROVIDED);
        final SubLObject predicate = cycl_utilities.nat_arg2(relation_evaluation.$cyc_evaluate_relation$.getDynamicValue(thread), (SubLObject)relation_evaluation.UNPROVIDED);
        if (!function_arg.isInteger()) {
            throw_unevaluatable();
        }
        final SubLObject call_arguments = Sequences.delete((SubLObject)relation_evaluation.NIL, (SubLObject)ConsesLow.list(arg1, arg2, arg3, arg4, arg5, arg6), (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED);
        if (relation_evaluation.NIL != forts.fort_p(predicate)) {
            final SubLObject query = el_utilities.make_formula(predicate, call_arguments, (SubLObject)relation_evaluation.UNPROVIDED);
            final SubLObject arg_position = conses_high.nthcdr(Numbers.subtract(function_arg, (SubLObject)relation_evaluation.ONE_INTEGER), query);
            final SubLObject variable = (SubLObject)relation_evaluation.$sym31$_VALUE;
            ConsesLow.rplacd(arg_position, (SubLObject)ConsesLow.cons(variable, arg_position.rest()));
            final SubLObject value = cyc_function_to_arg_query(query, mt_relevance_macros.$mt$.getDynamicValue(thread));
            if (relation_evaluation.NIL == value) {
                throw_unevaluatable();
            }
            return bindings.variable_binding_value(value.first().first());
        }
        if (relation_evaluation.NIL != el_utilities.kappa_predicate_p(predicate)) {
            SubLObject kappa_query = el_utilities.kappa_predicate_query(predicate);
            final SubLObject formal_arguments = el_utilities.kappa_predicate_formal_args(predicate);
            final SubLObject answer_arg = ConsesLow.nth(Numbers.subtract(function_arg, (SubLObject)relation_evaluation.ONE_INTEGER), formal_arguments);
            final SubLObject formal_argument_bindings = Mapping.mapcar(Symbols.symbol_function((SubLObject)relation_evaluation.$sym32$MAKE_VARIABLE_BINDING), Sequences.remove(answer_arg, formal_arguments, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED), new SubLObject[] { call_arguments });
            kappa_query = bindings.apply_bindings(formal_argument_bindings, kappa_query);
            final SubLObject value2 = cyc_function_to_arg_query(kappa_query, mt_relevance_macros.$mt$.getDynamicValue(thread));
            if (relation_evaluation.NIL == value2) {
                throw_unevaluatable();
            }
            return bindings.variable_binding_value(value2.first().first());
        }
        throw_unevaluatable();
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 15865L)
    public static SubLObject cyc_function_to_arg_query(final SubLObject query, final SubLObject mt) {
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(query, mt);
        query_properties = conses_high.putf(query_properties, (SubLObject)relation_evaluation.$kw33$MAX_NUMBER, (SubLObject)relation_evaluation.ONE_INTEGER);
        query_properties = conses_high.putf(query_properties, (SubLObject)relation_evaluation.$kw34$ALLOW_INDETERMINATE_RESULTS_, (SubLObject)relation_evaluation.T);
        query_properties = conses_high.putf(query_properties, (SubLObject)relation_evaluation.$kw35$ANSWER_LANGUAGE, (SubLObject)relation_evaluation.$kw36$HL);
        return ask_utilities.inference_recursive_query_unique_bindings(query, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-evaluation.lisp", position = 16313L)
    public static SubLObject cyc_lambda(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == relation_evaluation.UNPROVIDED) {
            arg1 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg2 == relation_evaluation.UNPROVIDED) {
            arg2 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg3 == relation_evaluation.UNPROVIDED) {
            arg3 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg4 == relation_evaluation.UNPROVIDED) {
            arg4 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg5 == relation_evaluation.UNPROVIDED) {
            arg5 = (SubLObject)relation_evaluation.NIL;
        }
        if (arg6 == relation_evaluation.UNPROVIDED) {
            arg6 = (SubLObject)relation_evaluation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject call_arguments = Sequences.delete((SubLObject)relation_evaluation.NIL, (SubLObject)ConsesLow.list(arg1, arg2, arg3, arg4, arg5, arg6), (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED, (SubLObject)relation_evaluation.UNPROVIDED);
        final SubLObject lambda = relation_evaluation.$cyc_evaluate_relation$.getDynamicValue(thread);
        final SubLObject formal_arguments = el_utilities.lambda_function_formal_args(lambda);
        final SubLObject formal_argument_bindings = Mapping.mapcar(Symbols.symbol_function((SubLObject)relation_evaluation.$sym32$MAKE_VARIABLE_BINDING), formal_arguments, new SubLObject[] { call_arguments });
        final SubLObject expression = el_utilities.lambda_function_expression(lambda);
        SubLObject answer_expression = bindings.apply_bindings(formal_argument_bindings, expression);
        if (relation_evaluation.NIL != evaluatable_expressionP(answer_expression)) {
            thread.resetMultipleValues();
            final SubLObject evaluated_answer = cyc_evaluate(answer_expression);
            final SubLObject evaluation_valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (relation_evaluation.NIL == evaluation_valid) {
                throw_unevaluatable();
            }
            answer_expression = evaluated_answer;
        }
        return answer_expression;
    }
    
    public static SubLObject declare_relation_evaluation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "evaluatable_functionP", "EVALUATABLE-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "evaluatable_predicateP", "EVALUATABLE-PREDICATE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "evaluatable_relationP", "EVALUATABLE-RELATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "evaluatable_expressionP", "EVALUATABLE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "evaluation_defn", "EVALUATION-DEFN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate_gathering_justificationsP", "CYC-EVALUATE-GATHERING-JUSTIFICATIONS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate_note_support", "CYC-EVALUATE-NOTE-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate_justify", "CYC-EVALUATE-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "note_cyc_evaluate_argument_support", "NOTE-CYC-EVALUATE-ARGUMENT-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "note_cyc_evaluate_final_support", "NOTE-CYC-EVALUATE-FINAL-SUPPORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "note_cyc_evaluate_expansion_support", "NOTE-CYC-EVALUATE-EXPANSION-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "note_expansion_support", "NOTE-EXPANSION-SUPPORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "note_evaluation_function_support", "NOTE-EVALUATION-FUNCTION-SUPPORT", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.relation_evaluation", "noting_unevaluatable", "NOTING-UNEVALUATABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "throw_unevaluatable", "THROW-UNEVALUATABLE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.relation_evaluation", "noting_evaluation_failure", "NOTING-EVALUATION-FAILURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.relation_evaluation", "ignoring_unevaluatable", "IGNORING-UNEVALUATABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "possibly_note_contextualized_evaluatable_relation", "POSSIBLY-NOTE-CONTEXTUALIZED-EVALUATABLE-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate", "CYC-EVALUATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "contains_an_unknown_scalar_intervalP", "CONTAINS-AN-UNKNOWN-SCALAR-INTERVAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "unknown_scalar_interval_p", "UNKNOWN-SCALAR-INTERVAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "simplify_unknown_scalar_interval_evaluation", "SIMPLIFY-UNKNOWN-SCALAR-INTERVAL-EVALUATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate_all_unary", "CYC-EVALUATE-ALL-UNARY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate_sort", "CYC-EVALUATE-SORT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "valid_evaluation", "VALID-EVALUATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "invalid_evaluation", "INVALID-EVALUATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate_internal", "CYC-EVALUATE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate_args", "CYC-EVALUATE-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate_arg", "CYC-EVALUATE-ARG", 1, 0, false);
        new $cyc_evaluate_arg$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_evaluate_if_evaluatable", "CYC-EVALUATE-IF-EVALUATABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "evaluation_function", "EVALUATION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "evaluation_arity", "EVALUATION-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "clear_cached_evaluation_function", "CLEAR-CACHED-EVALUATION-FUNCTION", 0, 0, false);
        new $clear_cached_evaluation_function$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "remove_cached_evaluation_function", "REMOVE-CACHED-EVALUATION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cached_evaluation_function_internal", "CACHED-EVALUATION-FUNCTION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cached_evaluation_function", "CACHED-EVALUATION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "function_to_arg_function_p", "FUNCTION-TO-ARG-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_function_to_arg", "CYC-FUNCTION-TO-ARG", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_function_to_arg_query", "CYC-FUNCTION-TO-ARG-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_evaluation", "cyc_lambda", "CYC-LAMBDA", 0, 6, false);
        return (SubLObject)relation_evaluation.NIL;
    }
    
    public static SubLObject init_relation_evaluation_file() {
        relation_evaluation.$cyc_evaluate_gather_justificationsP$ = SubLFiles.defparameter("*CYC-EVALUATE-GATHER-JUSTIFICATIONS?*", (SubLObject)relation_evaluation.NIL);
        relation_evaluation.$cyc_evaluate_supports$ = SubLFiles.defparameter("*CYC-EVALUATE-SUPPORTS*", (SubLObject)relation_evaluation.NIL);
        relation_evaluation.$cyc_evaluate_relation$ = SubLFiles.defparameter("*CYC-EVALUATE-RELATION*", (SubLObject)relation_evaluation.NIL);
        relation_evaluation.$cyc_evaluate_some_contextualized_relationP$ = SubLFiles.defparameter("*CYC-EVALUATE-SOME-CONTEXTUALIZED-RELATION?*", (SubLObject)relation_evaluation.$kw8$UNBOUND);
        relation_evaluation.$cached_evaluation_function_caching_state$ = SubLFiles.deflexical("*CACHED-EVALUATION-FUNCTION-CACHING-STATE*", (SubLObject)relation_evaluation.NIL);
        return (SubLObject)relation_evaluation.NIL;
    }
    
    public static SubLObject setup_relation_evaluation_file() {
        access_macros.register_external_symbol((SubLObject)relation_evaluation.$sym12$THROW_UNEVALUATABLE);
        utilities_macros.note_funcall_helper_function((SubLObject)relation_evaluation.$sym21$UNKNOWN_SCALAR_INTERVAL_P);
        memoization_state.note_globally_cached_function((SubLObject)relation_evaluation.$sym27$CACHED_EVALUATION_FUNCTION);
        return (SubLObject)relation_evaluation.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_relation_evaluation_file();
    }
    
    @Override
	public void initializeVariables() {
        init_relation_evaluation_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_relation_evaluation_file();
    }
    
    static {
        me = (SubLFile)new relation_evaluation();
        relation_evaluation.$cyc_evaluate_gather_justificationsP$ = null;
        relation_evaluation.$cyc_evaluate_supports$ = null;
        relation_evaluation.$cyc_evaluate_relation$ = null;
        relation_evaluation.$cyc_evaluate_some_contextualized_relationP$ = null;
        relation_evaluation.$cached_evaluation_function_caching_state$ = null;
        $sym0$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const1$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const2$evaluationDefn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationDefn"));
        $sym3$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym4$SUPPORT_EQUAL = SubLObjectFactory.makeSymbol("SUPPORT-EQUAL");
        $kw5$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $const6$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $kw7$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw8$UNBOUND = SubLObjectFactory.makeKeyword("UNBOUND");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAILURE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $kw11$UNEVALUATABLE = SubLObjectFactory.makeKeyword("UNEVALUATABLE");
        $sym12$THROW_UNEVALUATABLE = SubLObjectFactory.makeSymbol("THROW-UNEVALUATABLE");
        $sym13$NOTING_UNEVALUATABLE = SubLObjectFactory.makeSymbol("NOTING-UNEVALUATABLE");
        $sym14$CATCH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $sym15$CATCH_THIS = SubLObjectFactory.makeUninternedSymbol("CATCH-THIS");
        $sym16$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym17$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $kw18$UNTRANSLATABLE = SubLObjectFactory.makeKeyword("UNTRANSLATABLE");
        $sym19$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str20$Error_from__cyc_evaluate__A____A = SubLObjectFactory.makeString("Error from (cyc-evaluate ~A): ~A");
        $sym21$UNKNOWN_SCALAR_INTERVAL_P = SubLObjectFactory.makeSymbol("UNKNOWN-SCALAR-INTERVAL-P");
        $const22$UnknownScalarInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnknownScalarInterval"));
        $kw23$RECURSION_LIMIT_EXCEEDED = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $sym24$CYC_EVALUATE_ARG = SubLObjectFactory.makeSymbol("CYC-EVALUATE-ARG");
        $sym25$CYC_FUNCTION_TO_ARG = SubLObjectFactory.makeSymbol("CYC-FUNCTION-TO-ARG");
        $sym26$CYC_LAMBDA = SubLObjectFactory.makeSymbol("CYC-LAMBDA");
        $sym27$CACHED_EVALUATION_FUNCTION = SubLObjectFactory.makeSymbol("CACHED-EVALUATION-FUNCTION");
        $sym28$_CACHED_EVALUATION_FUNCTION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-EVALUATION-FUNCTION-CACHING-STATE*");
        $sym29$CLEAR_CACHED_EVALUATION_FUNCTION = SubLObjectFactory.makeSymbol("CLEAR-CACHED-EVALUATION-FUNCTION");
        $const30$FunctionToArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FunctionToArg"));
        $sym31$_VALUE = SubLObjectFactory.makeSymbol("?VALUE");
        $sym32$MAKE_VARIABLE_BINDING = SubLObjectFactory.makeSymbol("MAKE-VARIABLE-BINDING");
        $kw33$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw34$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw35$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw36$HL = SubLObjectFactory.makeKeyword("HL");
    }
    
    public static final class $cyc_evaluate_arg$UnaryFunction extends UnaryFunction
    {
        public $cyc_evaluate_arg$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-EVALUATE-ARG"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return relation_evaluation.cyc_evaluate_arg(arg1);
        }
    }
    
    public static final class $clear_cached_evaluation_function$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_cached_evaluation_function$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-CACHED-EVALUATION-FUNCTION"));
        }
        
        @Override
		public SubLObject processItem() {
            return relation_evaluation.clear_cached_evaluation_function();
        }
    }
}

/*

	Total time: 472 ms
	
*/