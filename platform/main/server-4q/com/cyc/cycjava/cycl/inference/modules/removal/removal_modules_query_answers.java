package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_query_answers extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "289f05847544f84d7cf96921dbf12aa596ae2d34d717b1577a9bd248b9b4859f";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 17100L)
    private static SubLSymbol $removal_justification_partial_expand_max_justifications_count$;
    private static SubLObject $$queryAnswers;
    private static SubLSymbol $POS;
    private static SubLObject $$CycLQuerySpecification;
    private static SubLSymbol $REMOVAL_QUERY_ANSWERS;
    private static SubLList $list4;
    private static SubLSymbol $ANSWER;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $SUPPORTS;
    private static SubLSymbol $BINDINGS_AND_SUPPORTS;
    private static SubLSymbol $BINDINGS_AND_HYPOTHETICAL_BINDINGS;
    private static SubLObject $$TheEmptySet;
    private static SubLObject $$TheSet;
    private static SubLObject $$CycInferenceAnswerJustificationFn;
    private static SubLList $list13;
    private static SubLObject $$CycHLSupportFn;
    private static SubLObject $$CycInferenceAnswerFn;
    private static SubLObject $$inferenceAnswerBindingsAndJustifi;
    private static SubLSymbol $REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS;
    private static SubLList $list18;
    private static SubLObject $$queryBindings;
    private static SubLSymbol $REMOVAL_QUERY_BINDINGS;
    private static SubLList $list21;
    private static SubLObject $$queryVariable;
    private static SubLSymbol $REMOVAL_QUERY_VARIABLE;
    private static SubLList $list24;
    private static SubLObject $$justification_Partial;
    private static SubLSymbol $REMOVAL_JUSTIFICATION_PARTIAL;
    private static SubLList $list27;
    private static SubLObject $$and;
    private static SubLObject $$or;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $MAX_NUMBER;
    private static SubLSymbol $CONTINUABLE_;
    private static SubLSymbol $BROWSABLE_;
    private static SubLSymbol $ALLOWED_MODULES;
    private static SubLSymbol $MAX_TIME;
    private static SubLSymbol $MAX_TRANSFORMATION_DEPTH;
    private static SubLSymbol $ALLOWED_RULES;
    private static SubLObject $$firstInListSatisfying;
    private static SubLSymbol $REMOVAL_FIRSTINLISTSATISFYING;
    private static SubLList $list40;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $sym42$FIRST;
    private static SubLSymbol $sym43$BINDINGS_VALUES;
    private static SubLSymbol $sym44$TEST_REMOVAL_FIRSTINLISTSATISFYING_EXPAND;
    private static SubLSymbol $TEST;
    private static SubLSymbol $OWNER;
    private static SubLSymbol $CLASSES;
    private static SubLSymbol $KB;
    private static SubLSymbol $FULL;
    private static SubLSymbol $WORKING_;
    private static SubLList $list51;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 1400L)
    public static SubLObject removal_cycl_query_specification_p(SubLObject v_object) {
        return isa.isaP(v_object, $$CycLQuerySpecification, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 1500L)
    public static SubLObject removal_allowed_query_answers_sentenceP(SubLObject query_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
        SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 2700L)
    public static SubLObject removal_query_answers_cost(SubLObject asent) {
        return ONE_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 2800L)
    public static SubLObject removal_query_answers_iterate(SubLObject query_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject results = query_answers_kbq_run_query(query_spec);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject return_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject answer_fns = removal_create_inference_answer_fns(results, return_type);
        if (NIL != answer_fns) {
            return iteration.new_list_iterator(answer_fns);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 3100L)
    public static SubLObject removal_create_inference_answer_fns(SubLObject results, SubLObject return_type) {
        if (NIL == results) {
            return NIL;
        }
        if (return_type.eql($ANSWER)) {
            return removal_create_inference_answer_fn_from_answers(results);
        }
        if (return_type.eql($BINDINGS)) {
            return removal_create_inference_answer_fn_from_bindings(results);
        }
        if (return_type.eql($SUPPORTS)) {
            return removal_create_inference_answer_fn_from_supports(results);
        }
        if (return_type.eql($BINDINGS_AND_SUPPORTS)) {
            return removal_create_inference_answer_fn_from_bindings_and_supports(results);
        }
        if (return_type.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
            return removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings(results);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 3700L)
    public static SubLObject removal_create_inference_answer_fn_from_answers(SubLObject inference_answers) {
        SubLObject answer_fns = NIL;
        SubLObject cdolist_list_var = inference_answers;
        SubLObject inference_answer = NIL;
        inference_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject binding_set = bindings.kbify_inference_binding_set(inference_datastructures_inference.inference_answer_bindings(inference_answer));
            SubLObject justifications = removal_justification_fns(inference_datastructures_inference.inference_answer_justifications(inference_answer));
            answer_fns = cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            inference_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 4200L)
    public static SubLObject removal_create_inference_answer_fn_from_bindings(SubLObject binding_sets) {
        SubLObject answer_fns = NIL;
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject justifications = removal_justification_fns(NIL);
            answer_fns = cons(removal_create_inference_answer_fn(bindings.kbify_inference_binding_set(binding_set), justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 4600L)
    public static SubLObject removal_create_inference_answer_fn_from_supports(SubLObject supports_set) {
        SubLObject answer_fns = NIL;
        SubLObject cdolist_list_var = supports_set;
        SubLObject supports = NIL;
        supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject binding_set = bindings.kbify_inference_binding_set(NIL);
            SubLObject justifications = removal_justification_fns_from_supports(supports);
            answer_fns = cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            supports = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 5000L)
    public static SubLObject removal_create_inference_answer_fn_from_bindings_and_supports(SubLObject bindings_supports_set) {
        SubLObject answer_fns = NIL;
        SubLObject cdolist_list_var = bindings_supports_set;
        SubLObject bindings_supports = NIL;
        bindings_supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject binding_set = bindings.kbify_inference_binding_set(bindings_supports.first());
            SubLObject justifications = removal_justification_fns_from_supports(conses_high.second(bindings_supports));
            answer_fns = cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            bindings_supports = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 5500L)
    public static SubLObject removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings(SubLObject bindings_hypotheticals) {
        SubLObject answer_fns = NIL;
        SubLObject binding_sets = bindings_hypotheticals.first();
        SubLObject hypothetical_bindings = conses_high.second(bindings_hypotheticals);
        SubLObject justifications = removal_justification_fns_from_supports(NIL);
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            binding_set = bindings.kbify_inference_binding_set(append(binding_set, hypothetical_bindings));
            answer_fns = cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 6100L)
    public static SubLObject removal_justification_fns(SubLObject justifications) {
        if (NIL == justifications) {
            return $$TheEmptySet;
        }
        SubLObject justificationsfn = NIL;
        SubLObject cdolist_list_var = justifications;
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            justificationsfn = cons(removal_create_justification_fn(inference_datastructures_inference.inference_answer_justification_supports(justification)), justificationsfn);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return el_utilities.make_el_formula($$TheSet, justificationsfn, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 6400L)
    public static SubLObject removal_justification_fns_from_supports(SubLObject supports) {
        if (NIL == supports) {
            return $$TheEmptySet;
        }
        SubLObject justificationsfn = NIL;
        justificationsfn = cons(removal_create_justification_fn(supports), justificationsfn);
        return el_utilities.make_el_formula($$TheSet, justificationsfn, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 6700L)
    public static SubLObject removal_create_justification_fn(SubLObject supports) {
        SubLObject support_datastructures = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            support_datastructures = cons(removal_support_datastructures(support), support_datastructures);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        support_datastructures = el_utilities.make_el_formula($$TheSet, Sequences.nreverse(support_datastructures), UNPROVIDED);
        return list($$CycInferenceAnswerJustificationFn, support_datastructures);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 7100L)
    public static SubLObject removal_support_datastructures(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        if (NIL != arguments.hl_support_p(support)) {
            return removal_create_cycl_hl_support_fn(support);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 7300L)
    public static SubLObject removal_create_cycl_hl_support_fn(SubLObject support) {
        SubLObject module = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list13);
        module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list13);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list13);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list13);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cycl_module = kb_query.kbq_hl_support_module_from_keyword(module);
            SubLObject cycl_tv = kb_query.kbq_kb_tv_from_hl_tv(tv);
            return list($$CycHLSupportFn, cycl_module, sentence, mt, cycl_tv);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, $list13);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 7600L)
    public static SubLObject removal_create_inference_answer_fn(SubLObject binding_set, SubLObject justifications) {
        return list($$CycInferenceAnswerFn, binding_set, justifications);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 7700L)
    public static SubLObject query_answers_kbq_run_query(SubLObject query_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
        SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(query_properties);
        if (NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) {
            return Values.values(NIL, NIL, return_type);
        }
        thread.resetMultipleValues();
        SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject inference = thread.thirdMultipleValue();
        SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
        }
        return Values.values(results, halt_reason, return_type);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 11100L)
    public static SubLObject removal_allowed_query_bindings_sentenceP(SubLObject query_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
        SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(NIL != inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties) && $SUPPORTS != inference_datastructures_enumerated_types.inference_properties_return_type(query_properties));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 11400L)
    public static SubLObject removal_query_bindings_cost(SubLObject asent) {
        return ONE_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 11500L)
    public static SubLObject removal_query_bindings_iterate(SubLObject query_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject results = query_answers_kbq_run_query(query_spec);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject return_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject binding_sets = removal_create_el_bindings_sets(results, return_type);
        if (NIL != binding_sets) {
            return iteration.new_list_iterator(binding_sets);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 11900L)
    public static SubLObject removal_create_el_bindings_sets(SubLObject results, SubLObject return_type) {
        if (NIL == results) {
            return NIL;
        }
        SubLObject binding_sets = NIL;
        if (return_type.eql($ANSWER)) {
            SubLObject cdolist_list_var = results;
            SubLObject inference_answer = NIL;
            inference_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                binding_sets = cons(bindings.kbify_inference_binding_set(inference_datastructures_inference.inference_answer_bindings(inference_answer)), binding_sets);
                cdolist_list_var = cdolist_list_var.rest();
                inference_answer = cdolist_list_var.first();
            }
        } else if (return_type.eql($BINDINGS)) {
            SubLObject cdolist_list_var = results;
            SubLObject binding_set = NIL;
            binding_set = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                binding_sets = cons(bindings.kbify_inference_binding_set(binding_set), binding_sets);
                cdolist_list_var = cdolist_list_var.rest();
                binding_set = cdolist_list_var.first();
            }
        } else if (return_type.eql($BINDINGS_AND_SUPPORTS)) {
            SubLObject cdolist_list_var = results;
            SubLObject bindings_supports = NIL;
            bindings_supports = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                binding_sets = cons(bindings.kbify_inference_binding_set(bindings_supports.first()), binding_sets);
                cdolist_list_var = cdolist_list_var.rest();
                bindings_supports = cdolist_list_var.first();
            }
        } else if (return_type.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
            SubLObject v_bindings = results.first();
            SubLObject hypothetical_bindings = conses_high.second(results);
            SubLObject cdolist_list_var2 = v_bindings;
            SubLObject binding_set2 = NIL;
            binding_set2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                binding_sets = cons(bindings.kbify_inference_binding_set(append(binding_set2, hypothetical_bindings)), binding_sets);
                cdolist_list_var2 = cdolist_list_var2.rest();
                binding_set2 = cdolist_list_var2.first();
            }
        }
        return Sequences.nreverse(binding_sets);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 14000L)
    public static SubLObject removal_allowed_query_variable_sentenceP(SubLObject query_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
        SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(NIL != inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties) && $SUPPORTS != inference_datastructures_enumerated_types.inference_properties_return_type(query_properties)
                && NIL != list_utilities.singletonP(el_utilities.sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 14500L)
    public static SubLObject removal_query_variable_cost(SubLObject asent) {
        return ONE_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 14600L)
    public static SubLObject removal_query_variable_iterate(SubLObject query_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject results = query_answers_kbq_run_query(query_spec);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject return_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject answer_fns = removal_create_set_of_variable_bindings(results, return_type);
        if (NIL != answer_fns) {
            return iteration.new_list_iterator(answer_fns);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 14900L)
    public static SubLObject removal_create_set_of_variable_bindings(SubLObject results, SubLObject return_type) {
        if (NIL == results) {
            return NIL;
        }
        SubLObject v_bindings = NIL;
        if (return_type.eql($ANSWER)) {
            SubLObject cdolist_list_var = results;
            SubLObject inference_answer = NIL;
            inference_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject binding = removal_query_variable_binding(inference_datastructures_inference.inference_answer_bindings(inference_answer));
                if (NIL == binding) {
                    return NIL;
                }
                v_bindings = cons(binding, v_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                inference_answer = cdolist_list_var.first();
            }
        } else if (return_type.eql($BINDINGS)) {
            SubLObject cdolist_list_var = results;
            SubLObject bindings_set = NIL;
            bindings_set = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject binding = removal_query_variable_binding(bindings_set);
                if (NIL == binding) {
                    return NIL;
                }
                v_bindings = cons(binding, v_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                bindings_set = cdolist_list_var.first();
            }
        } else if (return_type.eql($BINDINGS_AND_SUPPORTS)) {
            SubLObject cdolist_list_var = results;
            SubLObject bindings_supports = NIL;
            bindings_supports = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject binding = removal_query_variable_binding(bindings_supports.first());
                if (NIL == binding) {
                    return NIL;
                }
                v_bindings = cons(binding, v_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                bindings_supports = cdolist_list_var.first();
            }
        } else if (return_type.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
            SubLObject cdolist_list_var = results.first();
            SubLObject bindings_set = NIL;
            bindings_set = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject binding = removal_query_variable_binding(bindings_set);
                if (NIL == binding) {
                    return NIL;
                }
                v_bindings = cons(binding, v_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                bindings_set = cdolist_list_var.first();
            }
        }
        v_bindings = Sequences.nreverse(v_bindings);
        return list(el_utilities.make_el_set(v_bindings, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 16000L)
    public static SubLObject removal_query_variable_binding(SubLObject bindings_set) {
        if (NIL == list_utilities.singletonP(bindings_set)) {
            return NIL;
        }
        return bindings.variable_binding_value(bindings_set.first());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 17300L)
    public static SubLObject removal_justification_partial_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject askable_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject justification_sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject query_properties_initial = inference_justification_partial_recursive_query_properties_initial(asent, mt);
        SubLObject query_properties_continued = inference_justification_partial_recursive_query_properties_continued(asent, mt);
        SubLObject iteration_count = ZERO_INTEGER;
        SubLObject results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject justification_mode = NIL;
        SubLObject justification_sentences = NIL;
        SubLObject doneP = NIL;
        if (NIL == el_utilities.el_formula_p(askable_sentence)) {
            return NIL;
        }
        if (NIL != el_utilities.el_conjunction_p(justification_sentence)) {
            justification_sentences = cycl_utilities.atomic_sentence_args(justification_sentence, UNPROVIDED);
            justification_mode = $$and;
        } else if (NIL != el_utilities.el_disjunction_p(justification_sentence)) {
            justification_sentences = cycl_utilities.atomic_sentence_args(justification_sentence, UNPROVIDED);
            justification_mode = $$or;
        } else {
            justification_sentences = list(justification_sentence);
            justification_mode = $$and;
        }
        while (NIL == doneP && iteration_count.numL($removal_justification_partial_expand_max_justifications_count$.getDynamicValue(thread))) {
            iteration_count = Numbers.add(iteration_count, ONE_INTEGER);
            thread.resetMultipleValues();
            SubLObject results_$1 = (NIL != inference) ? inference_justification_partial_recursive_inference_one_more_justification(inference, query_properties_continued) : inference_justification_partial_recursive_inference(askable_sentence, mt, query_properties_initial);
            SubLObject halt_reason_$2 = thread.secondMultipleValue();
            SubLObject inference_$3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            results = results_$1;
            halt_reason = halt_reason_$2;
            inference = inference_$3;
            doneP = makeBoolean(!iteration_count.eql(Sequences.length(inference_datastructures_inference.inference_answer_justifications(inference_datastructures_inference.inference_all_answers(inference, UNPROVIDED).first()))));
            if (NIL == doneP) {
                SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (NIL != id_index.id_index_objects_empty_p(idx, $SKIP)) {
                    continue;
                }
                SubLObject idx_$4 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$4);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject this_answer;
                    SubLObject cdolist_list_var;
                    SubLObject this_justification;
                    SubLObject original_supports;
                    SubLObject supports;
                    SubLObject checked_supports;
                    SubLObject found_justification_sentences;
                    SubLObject support;
                    SubLObject cdolist_list_var_$5;
                    SubLObject justification_sentence_$6;
                    SubLObject item_var;
                    SubLObject cdolist_list_var_$6;
                    SubLObject support_justification;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        this_answer = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(this_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(this_answer)) {
                                this_answer = $SKIP;
                            }
                            cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                            this_justification = NIL;
                            this_justification = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                original_supports = inference_datastructures_inference.inference_answer_justification_supports(this_justification);
                                supports = conses_high.copy_list(original_supports);
                                checked_supports = NIL;
                                found_justification_sentences = NIL;
                                while (NIL != supports && (!justification_mode.eql($$or) || NIL == found_justification_sentences) && (!justification_mode.eql($$and) || Sequences.length(found_justification_sentences).numL(Sequences.length(justification_sentences)))) {
                                    support = supports.first();
                                    supports = supports.rest();
                                    cdolist_list_var_$5 = justification_sentences;
                                    justification_sentence_$6 = NIL;
                                    justification_sentence_$6 = cdolist_list_var_$5.first();
                                    while (NIL != cdolist_list_var_$5) {
                                        if (NIL != entails_elP(arguments.support_sentence(support), justification_sentence_$6)) {
                                            item_var = justification_sentence_$6;
                                            if (NIL == conses_high.member(item_var, found_justification_sentences, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                                found_justification_sentences = cons(item_var, found_justification_sentences);
                                            }
                                        }
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        justification_sentence_$6 = cdolist_list_var_$5.first();
                                    }
                                    checked_supports = cons(support, checked_supports);
                                    cdolist_list_var_$6 = arguments.support_justification(support);
                                    support_justification = NIL;
                                    support_justification = cdolist_list_var_$6.first();
                                    while (NIL != cdolist_list_var_$6) {
                                        if (NIL == subl_promotions.memberP(support_justification, checked_supports, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
                                            supports = cons(support_justification, supports);
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        support_justification = cdolist_list_var_$6.first();
                                    }
                                }
                                if (NIL != found_justification_sentences && (!justification_mode.eql($$and) || Sequences.length(found_justification_sentences).numE(Sequences.length(justification_sentences)))) {
                                    doneP = T;
                                    backward.removal_add_node(original_supports.first(), NIL, original_supports.rest());
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                this_justification = cdolist_list_var.first();
                            }
                        }
                    }
                }
                SubLObject idx_$5 = idx;
                if (NIL != id_index.id_index_sparse_objects_empty_p(idx_$5)) {
                    continue;
                }
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$5);
                SubLObject id2 = NIL;
                SubLObject this_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        this_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject original_supports2 = inference_datastructures_inference.inference_answer_justification_supports(this_justification2);
                            SubLObject supports2 = conses_high.copy_list(original_supports2);
                            SubLObject checked_supports2 = NIL;
                            SubLObject found_justification_sentences2 = NIL;
                            while (NIL != supports2 && (!justification_mode.eql($$or) || NIL == found_justification_sentences2) && (!justification_mode.eql($$and) || Sequences.length(found_justification_sentences2).numL(Sequences.length(justification_sentences)))) {
                                SubLObject support2 = supports2.first();
                                supports2 = supports2.rest();
                                SubLObject cdolist_list_var_$7 = justification_sentences;
                                SubLObject justification_sentence_$7 = NIL;
                                justification_sentence_$7 = cdolist_list_var_$7.first();
                                while (NIL != cdolist_list_var_$7) {
                                    if (NIL != entails_elP(arguments.support_sentence(support2), justification_sentence_$7)) {
                                        SubLObject item_var2 = justification_sentence_$7;
                                        if (NIL == conses_high.member(item_var2, found_justification_sentences2, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                            found_justification_sentences2 = cons(item_var2, found_justification_sentences2);
                                        }
                                    }
                                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                    justification_sentence_$7 = cdolist_list_var_$7.first();
                                }
                                checked_supports2 = cons(support2, checked_supports2);
                                SubLObject cdolist_list_var_$8 = arguments.support_justification(support2);
                                SubLObject support_justification2 = NIL;
                                support_justification2 = cdolist_list_var_$8.first();
                                while (NIL != cdolist_list_var_$8) {
                                    if (NIL == subl_promotions.memberP(support_justification2, checked_supports2, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
                                        supports2 = cons(support_justification2, supports2);
                                    }
                                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                    support_justification2 = cdolist_list_var_$8.first();
                                }
                            }
                            if (NIL != found_justification_sentences2 && (!justification_mode.eql($$and) || Sequences.length(found_justification_sentences2).numE(Sequences.length(justification_sentences)))) {
                                doneP = T;
                                backward.removal_add_node(original_supports2.first(), NIL, original_supports2.rest());
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 20600L)
    public static SubLObject entails_elP(SubLObject sentence, SubLObject entailed_sentence) {
        if (NIL != czer_utilities.equals_elP(sentence, entailed_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != fort_types_interface.predicate_p(sentence.first()) && NIL != fort_types_interface.predicate_p(entailed_sentence.first()) && NIL != genl_predicates.genl_predicateP(sentence.first(), entailed_sentence.first(), UNPROVIDED, UNPROVIDED)
                && sentence.rest().equal(entailed_sentence.rest())) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 21100L)
    public static SubLObject inference_justification_partial_recursive_inference(SubLObject formula, SubLObject mt, SubLObject query_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject results = ask_utilities.inference_recursive_query(formula, mt, query_properties);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(results, halt_reason, inference);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 21300L)
    public static SubLObject inference_justification_partial_recursive_inference_one_more_justification(SubLObject inference, SubLObject query_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject results = inference_kernel.continue_inference(inference, query_properties);
        SubLObject halt_reason = thread.secondMultipleValue();
        SubLObject inference_$12 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(results, halt_reason, inference_$12);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 21600L)
    public static SubLObject inference_justification_partial_recursive_query_properties_initial(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(formula, mt);
        query_properties = conses_high.putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
        query_properties = conses_high.putf(query_properties, $CONTINUABLE_, T);
        query_properties = conses_high.putf(query_properties, $BROWSABLE_, T);
        query_properties = conses_high.putf(query_properties, $ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec());
        SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference_datastructures_inference.inference_p(inference)) {
            query_properties = conses_high.putf(query_properties, $MAX_TIME, inference_utilities.inference_property_lookup(inference, $MAX_TIME, UNPROVIDED));
            query_properties = conses_high.putf(query_properties, $MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED));
            query_properties = conses_high.putf(query_properties, $ALLOWED_RULES, inference_datastructures_inference.inference_allowed_rules_list(inference));
            query_properties = conses_high.putf(query_properties, $ALLOWED_MODULES, inference_datastructures_inference.inference_allowed_modules(inference));
        } else {
            query_properties = conses_high.putf(query_properties, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER);
        }
        return query_properties;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 22900L)
    public static SubLObject inference_justification_partial_recursive_query_properties_continued(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(formula, mt);
        query_properties = conses_high.putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
        query_properties = conses_high.putf(query_properties, $CONTINUABLE_, T);
        SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference_datastructures_inference.inference_p(inference)) {
            query_properties = conses_high.putf(query_properties, $MAX_TIME, inference_utilities.inference_property_lookup(inference, $MAX_TIME, UNPROVIDED));
            query_properties = conses_high.putf(query_properties, $MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED));
        } else {
            query_properties = conses_high.putf(query_properties, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER);
        }
        return query_properties;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 24700L)
    public static SubLObject removal_firstinlistsatisfying_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = el_utilities.el_list_items(arg1);
            SubLObject elem = NIL;
            elem = csome_list_var.first();
            while (NIL == doneP && NIL != csome_list_var) {
                if (NIL != ask_utilities.inference_recursive_query(el_utilities.make_unary_formula(arg2, elem), UNPROVIDED, UNPROVIDED)) {
                    doneP = T;
                    SubLObject answer_asent = el_utilities.make_ternary_formula($$firstInListSatisfying, arg1, arg2, elem);
                    SubLObject v_bindings = unification_utilities.term_unify(answer_asent, asent, UNPROVIDED, UNPROVIDED);
                    if (NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                    }
                }
                csome_list_var = csome_list_var.rest();
                elem = csome_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 25300L)
    public static SubLObject test_removal_firstinlistsatisfying_expand(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        SubLObject v_answer = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        if (NIL != cyc_kernel.closed_query_success_token_p(v_answer)) {
            return T;
        }
        if (NIL != bindings.bindings_p(v_answer)) {
            return Mapping.mapcar($sym42$FIRST, Mapping.mapcar($sym43$BINDINGS_VALUES, v_answer));
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_query_answers_file() {
        declareFunction("removal_cycl_query_specification_p", "REMOVAL-CYCL-QUERY-SPECIFICATION-P", 1, 0, false);
        declareFunction("removal_allowed_query_answers_sentenceP", "REMOVAL-ALLOWED-QUERY-ANSWERS-SENTENCE?", 1, 0, false);
        declareFunction("removal_query_answers_cost", "REMOVAL-QUERY-ANSWERS-COST", 1, 0, false);
        declareFunction("removal_query_answers_iterate", "REMOVAL-QUERY-ANSWERS-ITERATE", 1, 0, false);
        declareFunction("removal_create_inference_answer_fns", "REMOVAL-CREATE-INFERENCE-ANSWER-FNS", 2, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_answers", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-ANSWERS", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_bindings", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-BINDINGS", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_supports", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-SUPPORTS", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_bindings_and_supports", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-BINDINGS-AND-SUPPORTS", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-BINDINGS-AND-HYPOTHETICAL-BINDINGS", 1, 0, false);
        declareFunction("removal_justification_fns", "REMOVAL-JUSTIFICATION-FNS", 1, 0, false);
        declareFunction("removal_justification_fns_from_supports", "REMOVAL-JUSTIFICATION-FNS-FROM-SUPPORTS", 1, 0, false);
        declareFunction("removal_create_justification_fn", "REMOVAL-CREATE-JUSTIFICATION-FN", 1, 0, false);
        declareFunction("removal_support_datastructures", "REMOVAL-SUPPORT-DATASTRUCTURES", 1, 0, false);
        declareFunction("removal_create_cycl_hl_support_fn", "REMOVAL-CREATE-CYCL-HL-SUPPORT-FN", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn", "REMOVAL-CREATE-INFERENCE-ANSWER-FN", 2, 0, false);
        declareFunction("query_answers_kbq_run_query", "QUERY-ANSWERS-KBQ-RUN-QUERY", 1, 0, false);
        declareFunction("removal_allowed_query_bindings_sentenceP", "REMOVAL-ALLOWED-QUERY-BINDINGS-SENTENCE?", 1, 0, false);
        declareFunction("removal_query_bindings_cost", "REMOVAL-QUERY-BINDINGS-COST", 1, 0, false);
        declareFunction("removal_query_bindings_iterate", "REMOVAL-QUERY-BINDINGS-ITERATE", 1, 0, false);
        declareFunction("removal_create_el_bindings_sets", "REMOVAL-CREATE-EL-BINDINGS-SETS", 2, 0, false);
        declareFunction("removal_allowed_query_variable_sentenceP", "REMOVAL-ALLOWED-QUERY-VARIABLE-SENTENCE?", 1, 0, false);
        declareFunction("removal_query_variable_cost", "REMOVAL-QUERY-VARIABLE-COST", 1, 0, false);
        declareFunction("removal_query_variable_iterate", "REMOVAL-QUERY-VARIABLE-ITERATE", 1, 0, false);
        declareFunction("removal_create_set_of_variable_bindings", "REMOVAL-CREATE-SET-OF-VARIABLE-BINDINGS", 2, 0, false);
        declareFunction("removal_query_variable_binding", "REMOVAL-QUERY-VARIABLE-BINDING", 1, 0, false);
        declareFunction("removal_justification_partial_expand", "REMOVAL-JUSTIFICATION-PARTIAL-EXPAND", 1, 1, false);
        declareFunction("entails_elP", "ENTAILS-EL?", 2, 0, false);
        declareFunction("inference_justification_partial_recursive_inference", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-INFERENCE", 3, 0, false);
        declareFunction("inference_justification_partial_recursive_inference_one_more_justification", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-INFERENCE-ONE-MORE-JUSTIFICATION", 2, 0, false);
        declareFunction("inference_justification_partial_recursive_query_properties_initial", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-QUERY-PROPERTIES-INITIAL", 1, 1, false);
        declareFunction("inference_justification_partial_recursive_query_properties_continued", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-QUERY-PROPERTIES-CONTINUED", 1, 1, false);
        declareFunction("removal_firstinlistsatisfying_expand", "REMOVAL-FIRSTINLISTSATISFYING-EXPAND", 1, 1, false);
        declareFunction("test_removal_firstinlistsatisfying_expand", "TEST-REMOVAL-FIRSTINLISTSATISFYING-EXPAND", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_query_answers_file() {
        $removal_justification_partial_expand_max_justifications_count$ = SubLFiles.defparameter("*REMOVAL-JUSTIFICATION-PARTIAL-EXPAND-MAX-JUSTIFICATIONS-COUNT*", TEN_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_query_answers_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$queryAnswers);
        preference_modules.doomed_unless_arg_bindable($POS, $$queryAnswers, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_QUERY_ANSWERS, $list4);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceAnswerBindingsAndJustifi);
        preference_modules.doomed_unless_arg_bindable($POS, $$inferenceAnswerBindingsAndJustifi, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, $list18);
        inference_modules.register_solely_specific_removal_module_predicate($$queryBindings);
        preference_modules.doomed_unless_arg_bindable($POS, $$queryBindings, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_QUERY_BINDINGS, $list21);
        inference_modules.register_solely_specific_removal_module_predicate($$queryVariable);
        preference_modules.doomed_unless_arg_bindable($POS, $$queryVariable, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_QUERY_VARIABLE, $list24);
        inference_modules.register_solely_specific_removal_module_predicate($$justification_Partial);
        preference_modules.doomed_unless_all_args_bindable($POS, $$justification_Partial);
        inference_modules.inference_removal_module($REMOVAL_JUSTIFICATION_PARTIAL, $list27);
        inference_modules.register_solely_specific_removal_module_predicate($$firstInListSatisfying);
        preference_modules.doomed_unless_arg_bindable($POS, $$firstInListSatisfying, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$firstInListSatisfying, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_FIRSTINLISTSATISFYING, $list40);
        generic_testing.define_test_case_table_int($sym44$TEST_REMOVAL_FIRSTINLISTSATISFYING_EXPAND, list(new SubLObject[] { $TEST, Symbols.symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list51);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_query_answers_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_query_answers_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_query_answers_file();
    }

    static {
        me = new removal_modules_query_answers();
        $removal_justification_partial_expand_max_justifications_count$ = null;
        $$queryAnswers = makeConstSym(("queryAnswers"));
        $POS = makeKeyword("POS");
        $$CycLQuerySpecification = makeConstSym(("CycLQuerySpecification"));
        $REMOVAL_QUERY_ANSWERS = makeKeyword("REMOVAL-QUERY-ANSWERS");
        $list4 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("queryAnswers")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("queryAnswers")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), list(makeKeyword("TEST"), makeSymbol("REMOVAL-ALLOWED-QUERY-ANSWERS-SENTENCE?"))), makeKeyword("ANYTHING")),
                makeKeyword("COST"), makeSymbol("REMOVAL-QUERY-ANSWERS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("queryAnswers")), list(makeKeyword("BIND"), makeSymbol("QUERY-SPEC")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("QUERY-SPEC")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-QUERY-ANSWERS-ITERATE"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("queryAnswers")), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$queryAnswers <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryAnswers (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?ANS)") });
        $ANSWER = makeKeyword("ANSWER");
        $BINDINGS = makeKeyword("BINDINGS");
        $SUPPORTS = makeKeyword("SUPPORTS");
        $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
        $BINDINGS_AND_HYPOTHETICAL_BINDINGS = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $$TheEmptySet = makeConstSym(("TheEmptySet"));
        $$TheSet = makeConstSym(("TheSet"));
        $$CycInferenceAnswerJustificationFn = makeConstSym(("CycInferenceAnswerJustificationFn"));
        $list13 = list(makeSymbol("MODULE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));
        $$CycHLSupportFn = makeConstSym(("CycHLSupportFn"));
        $$CycInferenceAnswerFn = makeConstSym(("CycInferenceAnswerFn"));
        $$inferenceAnswerBindingsAndJustifi = makeConstSym(("inferenceAnswerBindingsAndJustifications"));
        $REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS = makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-AND-JUSTIFICATIONS");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("inferenceAnswerBindingsAndJustifications")), makeKeyword("REQUIRED-PATTERN"),
                listS(makeConstSym(("inferenceAnswerBindingsAndJustifications")), cons(makeConstSym(("CycInferenceAnswerFn")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("inferenceAnswerBindingsAndJustifications")), list(makeKeyword("BIND"), makeSymbol("ANSWER-FN")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ANSWER-FN"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("CycInferenceAnswerFn")), list(makeKeyword("BIND"), makeSymbol("BINDING-SET")), list(makeKeyword("BIND"), makeSymbol("JUSTIFICATION-SET"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("BINDING-SET")), list(makeKeyword("VALUE"), makeSymbol("JUSTIFICATION-SET")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDING-SET")), list(makeKeyword("BIND"), makeSymbol("JUSTIFICATION-SET"))),
                        list(makeConstSym(("inferenceAnswerBindingsAndJustifications")), list(makeKeyword("VALUE"), makeSymbol("ANSWER-FN")), list(makeKeyword("VALUE"), makeSymbol("BINDING-SET")), list(makeKeyword("VALUE"), makeSymbol("JUSTIFICATION-SET")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindingsAndJustifications <fully-bound> <anything> <anything>)"), makeKeyword("EXAMPLE"),
                makeString("(#$inferenceAnswerBindingsAndJustifications \n      (#$CycInferenceAnswerFn (#$TheSet (#$ELInferenceBindingFn ?DOG #$Muffet)) TheEmptySet) \n      ?BIND ?JUST)") });
        $$queryBindings = makeConstSym(("queryBindings"));
        $REMOVAL_QUERY_BINDINGS = makeKeyword("REMOVAL-QUERY-BINDINGS");
        $list21 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("queryBindings")), makeKeyword("REQUIRED-PATTERN"),
                        list(makeConstSym(("queryBindings")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), list(makeKeyword("TEST"), makeSymbol("REMOVAL-ALLOWED-QUERY-BINDINGS-SENTENCE?"))),
                                makeKeyword("ANYTHING")),
                        makeKeyword("COST"), makeSymbol("REMOVAL-QUERY-BINDINGS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("queryBindings")), list(makeKeyword("BIND"), makeSymbol("QUERY-SPEC")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("QUERY-SPEC")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-QUERY-BINDINGS-ITERATE"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                        list(makeConstSym(("queryBindings")), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                        makeString("(#$queryBindings <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryBindings (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?BINDINGS)") });
        $$queryVariable = makeConstSym(("queryVariable"));
        $REMOVAL_QUERY_VARIABLE = makeKeyword("REMOVAL-QUERY-VARIABLE");
        $list24 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("queryVariable")), makeKeyword("REQUIRED-PATTERN"),
                        list(makeConstSym(("queryVariable")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), list(makeKeyword("TEST"), makeSymbol("REMOVAL-ALLOWED-QUERY-VARIABLE-SENTENCE?"))),
                                makeKeyword("ANYTHING")),
                        makeKeyword("COST"), makeSymbol("REMOVAL-QUERY-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("queryVariable")), list(makeKeyword("BIND"), makeSymbol("QUERY-SPEC")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("QUERY-SPEC")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-QUERY-VARIABLE-ITERATE"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                        list(makeConstSym(("queryVariable")), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                        makeString("(#$queryVariable <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryVariable (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?SET)") });
        $$justification_Partial = makeConstSym(("justification-Partial"));
        $REMOVAL_JUSTIFICATION_PARTIAL = makeKeyword("REMOVAL-JUSTIFICATION-PARTIAL");
        $list27 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("justification-Partial")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("justification-Partial")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-JUSTIFICATION-PARTIAL-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$justification-Partial <fully-bound> <fully-bound>)\n    by recursively querying ASKABLE-SENTENCE and succeeding if the answer justifications contain the JUSTIFICATION-SENTENCE"), makeKeyword("EXAMPLE"),
                makeString("(#$justification-Partial (#$genls #$Dog #$Animal) (#$genls #$Dog #$CanisGenus))") });
        $$and = makeConstSym(("and"));
        $$or = makeConstSym(("or"));
        $SKIP = makeKeyword("SKIP");
        $MAX_NUMBER = makeKeyword("MAX-NUMBER");
        $CONTINUABLE_ = makeKeyword("CONTINUABLE?");
        $BROWSABLE_ = makeKeyword("BROWSABLE?");
        $ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
        $MAX_TIME = makeKeyword("MAX-TIME");
        $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
        $$firstInListSatisfying = makeConstSym(("firstInListSatisfying"));
        $REMOVAL_FIRSTINLISTSATISFYING = makeKeyword("REMOVAL-FIRSTINLISTSATISFYING");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("firstInListSatisfying")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("firstInListSatisfying")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-FIRSTINLISTSATISFYING-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$firstInListSatisfying <fully-bound-p> <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"),
                makeString("(#$firstInListSatisfying\n  (#$TheList 1 2 3 4 5 6)\n  (#$Kappa (?INPUT)\n    (#$greaterThan ?INPUT 4))\n  ?WHAT)") });
        $OPAQUE = makeKeyword("OPAQUE");
        $sym42$FIRST = makeSymbol("FIRST");
        $sym43$BINDINGS_VALUES = makeSymbol("BINDINGS-VALUES");
        $sym44$TEST_REMOVAL_FIRSTINLISTSATISFYING_EXPAND = makeSymbol("TEST-REMOVAL-FIRSTINLISTSATISFYING-EXPAND");
        $TEST = makeKeyword("TEST");
        $OWNER = makeKeyword("OWNER");
        $CLASSES = makeKeyword("CLASSES");
        $KB = makeKeyword("KB");
        $FULL = makeKeyword("FULL");
        $WORKING_ = makeKeyword("WORKING?");
        $list51 = list(
                list(list(list(makeConstSym(("firstInListSatisfying")), list(makeConstSym(("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER), list(makeConstSym(("Kappa")), list(makeSymbol("?INPUT")), list(makeConstSym(("greaterThan")), makeSymbol("?INPUT"), FOUR_INTEGER)),
                        makeSymbol("?WHAT"))), NIL),
                list(list(list(makeConstSym(("firstInListSatisfying")), list(makeConstSym(("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER), list(makeConstSym(("Kappa")), list(makeSymbol("?INPUT")), list(makeConstSym(("greaterThan")), makeSymbol("?INPUT"), FOUR_INTEGER)),
                        FOUR_INTEGER)), NIL),
                list(list(list(makeConstSym(("firstInListSatisfying")), list(makeConstSym(("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER),
                        list(makeConstSym(("Kappa")), list(makeSymbol("?INPUT")), list(makeConstSym(("greaterThan")), makeSymbol("?INPUT"), FOUR_INTEGER)), makeSymbol("?WHAT"))), list(FIVE_INTEGER)),
                list(list(list(makeConstSym(("firstInListSatisfying")), list(makeConstSym(("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER),
                        list(makeConstSym(("Kappa")), list(makeSymbol("?INPUT")), list(makeConstSym(("greaterThan")), makeSymbol("?INPUT"), FOUR_INTEGER)), FIVE_INTEGER)), T),
                list(list(list(makeConstSym(("firstInListSatisfying")),
                        list(makeConstSym(("TheList")), list(makeConstSym(("MathExpressionFn")), list(makeConstSym(("MathVarFn")), makeString("X")), makeConstSym(("InfixPlusFn")), list(makeConstSym(("MathQuantFn")), FIVE_INTEGER)),
                                list(makeConstSym(("MathExpressionFn")), list(makeConstSym(("MathQuantFn")), FIVE_INTEGER), makeConstSym(("InfixTimesFn")), list(makeConstSym(("MathQuantFn")), SEVEN_INTEGER)),
                                list(makeConstSym(("MathExpressionFn")), list(makeConstSym(("MathQuantFn")), SEVEN_INTEGER), makeConstSym(("InfixMinusFn")), list(makeConstSym(("MathQuantFn")), THREE_INTEGER))),
                        list(makeConstSym(("Kappa")), list(makeSymbol("?FOO")),
                                list(makeConstSym(("thereExists")), makeSymbol("?VAR"),
                                        list(makeConstSym(("and")), list(makeConstSym(("mathExpressionNthOperand")), makeSymbol("?FOO"), ONE_INTEGER, makeSymbol("?VAR")), list(makeConstSym(("isa")), makeSymbol("?VAR"), makeConstSym(("MathematicalVariable")))))),
                        list(makeConstSym(("MathExpressionFn")), list(makeConstSym(("MathVarFn")), makeString("X")), makeConstSym(("InfixPlusFn")), list(makeConstSym(("MathQuantFn")), FIVE_INTEGER)))), T),
                list(list(list(makeConstSym(("firstInListSatisfying")),
                        list(makeConstSym(("TheList")), list(makeConstSym(("MathExpressionFn")), list(makeConstSym(("MathVarFn")), makeString("X")), makeConstSym(("InfixPlusFn")), list(makeConstSym(("MathQuantFn")), FIVE_INTEGER)),
                                list(makeConstSym(("MathExpressionFn")), list(makeConstSym(("MathQuantFn")), FIVE_INTEGER), makeConstSym(("InfixTimesFn")), list(makeConstSym(("MathQuantFn")), SEVEN_INTEGER)),
                                list(makeConstSym(("MathExpressionFn")), list(makeConstSym(("MathQuantFn")), SEVEN_INTEGER), makeConstSym(("InfixMinusFn")), list(makeConstSym(("MathQuantFn")), THREE_INTEGER))),
                        list(makeConstSym(("Kappa")), list(makeSymbol("?FOO")),
                                list(makeConstSym(("thereExists")), makeSymbol("?VAR"),
                                        list(makeConstSym(("and")), list(makeConstSym(("mathExpressionNthOperand")), makeSymbol("?FOO"), ONE_INTEGER, makeSymbol("?VAR")), list(makeConstSym(("isa")), makeSymbol("?VAR"), makeConstSym(("MathematicalVariable")))))),
                        makeSymbol("?WHAT"))), list(list(makeConstSym(("MathExpressionFn")), list(makeConstSym(("MathVarFn")), makeString("X")), makeConstSym(("InfixPlusFn")), list(makeConstSym(("MathQuantFn")), FIVE_INTEGER)))),
                list(list(list(makeConstSym(("firstInListSatisfying")), list(makeConstSym(("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER), list(makeConstSym(("Kappa")), list(makeSymbol("?INPUT")), list(makeConstSym(("greaterThan")), makeSymbol("?INPUT"), ZERO_INTEGER)),
                        FOUR_INTEGER)), NIL));
    }
}
/*
 *
 * Total time: 338 ms
 *
 */