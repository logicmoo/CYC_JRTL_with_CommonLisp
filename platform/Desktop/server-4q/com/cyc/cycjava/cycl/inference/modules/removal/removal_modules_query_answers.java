package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.czer_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_query_answers extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers";
    public static final String myFingerPrint = "289f05847544f84d7cf96921dbf12aa596ae2d34d717b1577a9bd248b9b4859f";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 17167L)
    private static SubLSymbol $removal_justification_partial_expand_max_justifications_count$;
    private static final SubLObject $const0$queryAnswers;
    private static final SubLSymbol $kw1$POS;
    private static final SubLObject $const2$CycLQuerySpecification;
    private static final SubLSymbol $kw3$REMOVAL_QUERY_ANSWERS;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$ANSWER;
    private static final SubLSymbol $kw6$BINDINGS;
    private static final SubLSymbol $kw7$SUPPORTS;
    private static final SubLSymbol $kw8$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $kw9$BINDINGS_AND_HYPOTHETICAL_BINDINGS;
    private static final SubLObject $const10$TheEmptySet;
    private static final SubLObject $const11$TheSet;
    private static final SubLObject $const12$CycInferenceAnswerJustificationFn;
    private static final SubLList $list13;
    private static final SubLObject $const14$CycHLSupportFn;
    private static final SubLObject $const15$CycInferenceAnswerFn;
    private static final SubLObject $const16$inferenceAnswerBindingsAndJustifi;
    private static final SubLSymbol $kw17$REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS;
    private static final SubLList $list18;
    private static final SubLObject $const19$queryBindings;
    private static final SubLSymbol $kw20$REMOVAL_QUERY_BINDINGS;
    private static final SubLList $list21;
    private static final SubLObject $const22$queryVariable;
    private static final SubLSymbol $kw23$REMOVAL_QUERY_VARIABLE;
    private static final SubLList $list24;
    private static final SubLObject $const25$justification_Partial;
    private static final SubLSymbol $kw26$REMOVAL_JUSTIFICATION_PARTIAL;
    private static final SubLList $list27;
    private static final SubLObject $const28$and;
    private static final SubLObject $const29$or;
    private static final SubLSymbol $kw30$SKIP;
    private static final SubLSymbol $kw31$MAX_NUMBER;
    private static final SubLSymbol $kw32$CONTINUABLE_;
    private static final SubLSymbol $kw33$BROWSABLE_;
    private static final SubLSymbol $kw34$ALLOWED_MODULES;
    private static final SubLSymbol $kw35$MAX_TIME;
    private static final SubLSymbol $kw36$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw37$ALLOWED_RULES;
    private static final SubLObject $const38$firstInListSatisfying;
    private static final SubLSymbol $kw39$REMOVAL_FIRSTINLISTSATISFYING;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$OPAQUE;
    private static final SubLSymbol $sym42$FIRST;
    private static final SubLSymbol $sym43$BINDINGS_VALUES;
    private static final SubLSymbol $sym44$TEST_REMOVAL_FIRSTINLISTSATISFYING_EXPAND;
    private static final SubLSymbol $kw45$TEST;
    private static final SubLSymbol $kw46$OWNER;
    private static final SubLSymbol $kw47$CLASSES;
    private static final SubLSymbol $kw48$KB;
    private static final SubLSymbol $kw49$FULL;
    private static final SubLSymbol $kw50$WORKING_;
    private static final SubLList $list51;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 1427L)
    public static SubLObject removal_cycl_query_specification_p(final SubLObject v_object) {
        return isa.isaP(v_object, removal_modules_query_answers.$const2$CycLQuerySpecification, (SubLObject)removal_modules_query_answers.UNPROVIDED, (SubLObject)removal_modules_query_answers.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 1536L)
    public static SubLObject removal_allowed_query_answers_sentenceP(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, (SubLObject)removal_modules_query_answers.UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 2718L)
    public static SubLObject removal_query_answers_cost(final SubLObject asent) {
        return (SubLObject)removal_modules_query_answers.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 2808L)
    public static SubLObject removal_query_answers_iterate(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = query_answers_kbq_run_query(query_spec);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject return_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject answer_fns = removal_create_inference_answer_fns(results, return_type);
        if (removal_modules_query_answers.NIL != answer_fns) {
            return iteration.new_list_iterator(answer_fns);
        }
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 3147L)
    public static SubLObject removal_create_inference_answer_fns(final SubLObject results, final SubLObject return_type) {
        if (removal_modules_query_answers.NIL == results) {
            return (SubLObject)removal_modules_query_answers.NIL;
        }
        if (return_type.eql((SubLObject)removal_modules_query_answers.$kw5$ANSWER)) {
            return removal_create_inference_answer_fn_from_answers(results);
        }
        if (return_type.eql((SubLObject)removal_modules_query_answers.$kw6$BINDINGS)) {
            return removal_create_inference_answer_fn_from_bindings(results);
        }
        if (return_type.eql((SubLObject)removal_modules_query_answers.$kw7$SUPPORTS)) {
            return removal_create_inference_answer_fn_from_supports(results);
        }
        if (return_type.eql((SubLObject)removal_modules_query_answers.$kw8$BINDINGS_AND_SUPPORTS)) {
            return removal_create_inference_answer_fn_from_bindings_and_supports(results);
        }
        if (return_type.eql((SubLObject)removal_modules_query_answers.$kw9$BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
            return removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings(results);
        }
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 3784L)
    public static SubLObject removal_create_inference_answer_fn_from_answers(final SubLObject inference_answers) {
        SubLObject answer_fns = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject cdolist_list_var = inference_answers;
        SubLObject inference_answer = (SubLObject)removal_modules_query_answers.NIL;
        inference_answer = cdolist_list_var.first();
        while (removal_modules_query_answers.NIL != cdolist_list_var) {
            final SubLObject binding_set = bindings.kbify_inference_binding_set(inference_datastructures_inference.inference_answer_bindings(inference_answer));
            final SubLObject justifications = removal_justification_fns(inference_datastructures_inference.inference_answer_justifications(inference_answer));
            answer_fns = (SubLObject)ConsesLow.cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            inference_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 4268L)
    public static SubLObject removal_create_inference_answer_fn_from_bindings(final SubLObject binding_sets) {
        SubLObject answer_fns = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = (SubLObject)removal_modules_query_answers.NIL;
        binding_set = cdolist_list_var.first();
        while (removal_modules_query_answers.NIL != cdolist_list_var) {
            final SubLObject justifications = removal_justification_fns((SubLObject)removal_modules_query_answers.NIL);
            answer_fns = (SubLObject)ConsesLow.cons(removal_create_inference_answer_fn(bindings.kbify_inference_binding_set(binding_set), justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 4632L)
    public static SubLObject removal_create_inference_answer_fn_from_supports(final SubLObject supports_set) {
        SubLObject answer_fns = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject cdolist_list_var = supports_set;
        SubLObject supports = (SubLObject)removal_modules_query_answers.NIL;
        supports = cdolist_list_var.first();
        while (removal_modules_query_answers.NIL != cdolist_list_var) {
            final SubLObject binding_set = bindings.kbify_inference_binding_set((SubLObject)removal_modules_query_answers.NIL);
            final SubLObject justifications = removal_justification_fns_from_supports(supports);
            answer_fns = (SubLObject)ConsesLow.cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            supports = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 5027L)
    public static SubLObject removal_create_inference_answer_fn_from_bindings_and_supports(final SubLObject bindings_supports_set) {
        SubLObject answer_fns = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject cdolist_list_var = bindings_supports_set;
        SubLObject bindings_supports = (SubLObject)removal_modules_query_answers.NIL;
        bindings_supports = cdolist_list_var.first();
        while (removal_modules_query_answers.NIL != cdolist_list_var) {
            final SubLObject binding_set = bindings.kbify_inference_binding_set(bindings_supports.first());
            final SubLObject justifications = removal_justification_fns_from_supports(conses_high.second(bindings_supports));
            answer_fns = (SubLObject)ConsesLow.cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            bindings_supports = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 5505L)
    public static SubLObject removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings(final SubLObject bindings_hypotheticals) {
        SubLObject answer_fns = (SubLObject)removal_modules_query_answers.NIL;
        final SubLObject binding_sets = bindings_hypotheticals.first();
        final SubLObject hypothetical_bindings = conses_high.second(bindings_hypotheticals);
        final SubLObject justifications = removal_justification_fns_from_supports((SubLObject)removal_modules_query_answers.NIL);
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = (SubLObject)removal_modules_query_answers.NIL;
        binding_set = cdolist_list_var.first();
        while (removal_modules_query_answers.NIL != cdolist_list_var) {
            binding_set = bindings.kbify_inference_binding_set(ConsesLow.append(binding_set, hypothetical_bindings));
            answer_fns = (SubLObject)ConsesLow.cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_fns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 6104L)
    public static SubLObject removal_justification_fns(final SubLObject justifications) {
        if (removal_modules_query_answers.NIL == justifications) {
            return removal_modules_query_answers.$const10$TheEmptySet;
        }
        SubLObject justificationsfn = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject cdolist_list_var = justifications;
        SubLObject justification = (SubLObject)removal_modules_query_answers.NIL;
        justification = cdolist_list_var.first();
        while (removal_modules_query_answers.NIL != cdolist_list_var) {
            justificationsfn = (SubLObject)ConsesLow.cons(removal_create_justification_fn(inference_datastructures_inference.inference_answer_justification_supports(justification)), justificationsfn);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return el_utilities.make_el_formula(removal_modules_query_answers.$const11$TheSet, justificationsfn, (SubLObject)removal_modules_query_answers.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 6470L)
    public static SubLObject removal_justification_fns_from_supports(final SubLObject supports) {
        if (removal_modules_query_answers.NIL == supports) {
            return removal_modules_query_answers.$const10$TheEmptySet;
        }
        SubLObject justificationsfn = (SubLObject)removal_modules_query_answers.NIL;
        justificationsfn = (SubLObject)ConsesLow.cons(removal_create_justification_fn(supports), justificationsfn);
        return el_utilities.make_el_formula(removal_modules_query_answers.$const11$TheSet, justificationsfn, (SubLObject)removal_modules_query_answers.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 6736L)
    public static SubLObject removal_create_justification_fn(final SubLObject supports) {
        SubLObject support_datastructures = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)removal_modules_query_answers.NIL;
        support = cdolist_list_var.first();
        while (removal_modules_query_answers.NIL != cdolist_list_var) {
            support_datastructures = (SubLObject)ConsesLow.cons(removal_support_datastructures(support), support_datastructures);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        support_datastructures = el_utilities.make_el_formula(removal_modules_query_answers.$const11$TheSet, Sequences.nreverse(support_datastructures), (SubLObject)removal_modules_query_answers.UNPROVIDED);
        return (SubLObject)ConsesLow.list(removal_modules_query_answers.$const12$CycInferenceAnswerJustificationFn, support_datastructures);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 7111L)
    public static SubLObject removal_support_datastructures(final SubLObject support) {
        if (removal_modules_query_answers.NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        if (removal_modules_query_answers.NIL != arguments.hl_support_p(support)) {
            return removal_create_cycl_hl_support_fn(support);
        }
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 7301L)
    public static SubLObject removal_create_cycl_hl_support_fn(final SubLObject support) {
        SubLObject module = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject sentence = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject mt = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject tv = (SubLObject)removal_modules_query_answers.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_query_answers.$list13);
        module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_query_answers.$list13);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_query_answers.$list13);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_query_answers.$list13);
        tv = current.first();
        current = current.rest();
        if (removal_modules_query_answers.NIL == current) {
            final SubLObject cycl_module = kb_query.kbq_hl_support_module_from_keyword(module);
            final SubLObject cycl_tv = kb_query.kbq_kb_tv_from_hl_tv(tv);
            return (SubLObject)ConsesLow.list(removal_modules_query_answers.$const14$CycHLSupportFn, cycl_module, sentence, mt, cycl_tv);
        }
        cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_query_answers.$list13);
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 7602L)
    public static SubLObject removal_create_inference_answer_fn(final SubLObject binding_set, final SubLObject justifications) {
        return (SubLObject)ConsesLow.list(removal_modules_query_answers.$const15$CycInferenceAnswerFn, binding_set, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 7747L)
    public static SubLObject query_answers_kbq_run_query(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, (SubLObject)removal_modules_query_answers.UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(query_properties);
        if (removal_modules_query_answers.NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) {
            return Values.values((SubLObject)removal_modules_query_answers.NIL, (SubLObject)removal_modules_query_answers.NIL, return_type);
        }
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_query_answers.NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
        }
        return Values.values(results, halt_reason, return_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 11139L)
    public static SubLObject removal_allowed_query_bindings_sentenceP(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, (SubLObject)removal_modules_query_answers.UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_query_answers.NIL != inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties) && removal_modules_query_answers.$kw7$SUPPORTS != inference_datastructures_enumerated_types.inference_properties_return_type(query_properties));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 11494L)
    public static SubLObject removal_query_bindings_cost(final SubLObject asent) {
        return (SubLObject)removal_modules_query_answers.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 11585L)
    public static SubLObject removal_query_bindings_iterate(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = query_answers_kbq_run_query(query_spec);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject return_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject binding_sets = removal_create_el_bindings_sets(results, return_type);
        if (removal_modules_query_answers.NIL != binding_sets) {
            return iteration.new_list_iterator(binding_sets);
        }
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 11927L)
    public static SubLObject removal_create_el_bindings_sets(final SubLObject results, final SubLObject return_type) {
        if (removal_modules_query_answers.NIL == results) {
            return (SubLObject)removal_modules_query_answers.NIL;
        }
        SubLObject binding_sets = (SubLObject)removal_modules_query_answers.NIL;
        if (return_type.eql((SubLObject)removal_modules_query_answers.$kw5$ANSWER)) {
            SubLObject cdolist_list_var = results;
            SubLObject inference_answer = (SubLObject)removal_modules_query_answers.NIL;
            inference_answer = cdolist_list_var.first();
            while (removal_modules_query_answers.NIL != cdolist_list_var) {
                binding_sets = (SubLObject)ConsesLow.cons(bindings.kbify_inference_binding_set(inference_datastructures_inference.inference_answer_bindings(inference_answer)), binding_sets);
                cdolist_list_var = cdolist_list_var.rest();
                inference_answer = cdolist_list_var.first();
            }
        }
        else if (return_type.eql((SubLObject)removal_modules_query_answers.$kw6$BINDINGS)) {
            SubLObject cdolist_list_var = results;
            SubLObject binding_set = (SubLObject)removal_modules_query_answers.NIL;
            binding_set = cdolist_list_var.first();
            while (removal_modules_query_answers.NIL != cdolist_list_var) {
                binding_sets = (SubLObject)ConsesLow.cons(bindings.kbify_inference_binding_set(binding_set), binding_sets);
                cdolist_list_var = cdolist_list_var.rest();
                binding_set = cdolist_list_var.first();
            }
        }
        else if (return_type.eql((SubLObject)removal_modules_query_answers.$kw8$BINDINGS_AND_SUPPORTS)) {
            SubLObject cdolist_list_var = results;
            SubLObject bindings_supports = (SubLObject)removal_modules_query_answers.NIL;
            bindings_supports = cdolist_list_var.first();
            while (removal_modules_query_answers.NIL != cdolist_list_var) {
                binding_sets = (SubLObject)ConsesLow.cons(bindings.kbify_inference_binding_set(bindings_supports.first()), binding_sets);
                cdolist_list_var = cdolist_list_var.rest();
                bindings_supports = cdolist_list_var.first();
            }
        }
        else if (return_type.eql((SubLObject)removal_modules_query_answers.$kw9$BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
            final SubLObject v_bindings = results.first();
            final SubLObject hypothetical_bindings = conses_high.second(results);
            SubLObject cdolist_list_var2 = v_bindings;
            SubLObject binding_set2 = (SubLObject)removal_modules_query_answers.NIL;
            binding_set2 = cdolist_list_var2.first();
            while (removal_modules_query_answers.NIL != cdolist_list_var2) {
                binding_sets = (SubLObject)ConsesLow.cons(bindings.kbify_inference_binding_set(ConsesLow.append(binding_set2, hypothetical_bindings)), binding_sets);
                cdolist_list_var2 = cdolist_list_var2.rest();
                binding_set2 = cdolist_list_var2.first();
            }
        }
        return Sequences.nreverse(binding_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 14065L)
    public static SubLObject removal_allowed_query_variable_sentenceP(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, (SubLObject)removal_modules_query_answers.UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_query_answers.NIL != inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties) && removal_modules_query_answers.$kw7$SUPPORTS != inference_datastructures_enumerated_types.inference_properties_return_type(query_properties) && removal_modules_query_answers.NIL != list_utilities.singletonP(el_utilities.sentence_free_variables(sentence, (SubLObject)removal_modules_query_answers.UNPROVIDED, (SubLObject)removal_modules_query_answers.UNPROVIDED, (SubLObject)removal_modules_query_answers.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 14534L)
    public static SubLObject removal_query_variable_cost(final SubLObject asent) {
        return (SubLObject)removal_modules_query_answers.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 14625L)
    public static SubLObject removal_query_variable_iterate(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = query_answers_kbq_run_query(query_spec);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject return_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject answer_fns = removal_create_set_of_variable_bindings(results, return_type);
        if (removal_modules_query_answers.NIL != answer_fns) {
            return iteration.new_list_iterator(answer_fns);
        }
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 14969L)
    public static SubLObject removal_create_set_of_variable_bindings(final SubLObject results, final SubLObject return_type) {
        if (removal_modules_query_answers.NIL == results) {
            return (SubLObject)removal_modules_query_answers.NIL;
        }
        SubLObject v_bindings = (SubLObject)removal_modules_query_answers.NIL;
        if (return_type.eql((SubLObject)removal_modules_query_answers.$kw5$ANSWER)) {
            SubLObject cdolist_list_var = results;
            SubLObject inference_answer = (SubLObject)removal_modules_query_answers.NIL;
            inference_answer = cdolist_list_var.first();
            while (removal_modules_query_answers.NIL != cdolist_list_var) {
                final SubLObject binding = removal_query_variable_binding(inference_datastructures_inference.inference_answer_bindings(inference_answer));
                if (removal_modules_query_answers.NIL == binding) {
                    return (SubLObject)removal_modules_query_answers.NIL;
                }
                v_bindings = (SubLObject)ConsesLow.cons(binding, v_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                inference_answer = cdolist_list_var.first();
            }
        }
        else if (return_type.eql((SubLObject)removal_modules_query_answers.$kw6$BINDINGS)) {
            SubLObject cdolist_list_var = results;
            SubLObject bindings_set = (SubLObject)removal_modules_query_answers.NIL;
            bindings_set = cdolist_list_var.first();
            while (removal_modules_query_answers.NIL != cdolist_list_var) {
                final SubLObject binding = removal_query_variable_binding(bindings_set);
                if (removal_modules_query_answers.NIL == binding) {
                    return (SubLObject)removal_modules_query_answers.NIL;
                }
                v_bindings = (SubLObject)ConsesLow.cons(binding, v_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                bindings_set = cdolist_list_var.first();
            }
        }
        else if (return_type.eql((SubLObject)removal_modules_query_answers.$kw8$BINDINGS_AND_SUPPORTS)) {
            SubLObject cdolist_list_var = results;
            SubLObject bindings_supports = (SubLObject)removal_modules_query_answers.NIL;
            bindings_supports = cdolist_list_var.first();
            while (removal_modules_query_answers.NIL != cdolist_list_var) {
                final SubLObject binding = removal_query_variable_binding(bindings_supports.first());
                if (removal_modules_query_answers.NIL == binding) {
                    return (SubLObject)removal_modules_query_answers.NIL;
                }
                v_bindings = (SubLObject)ConsesLow.cons(binding, v_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                bindings_supports = cdolist_list_var.first();
            }
        }
        else if (return_type.eql((SubLObject)removal_modules_query_answers.$kw9$BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
            SubLObject cdolist_list_var = results.first();
            SubLObject bindings_set = (SubLObject)removal_modules_query_answers.NIL;
            bindings_set = cdolist_list_var.first();
            while (removal_modules_query_answers.NIL != cdolist_list_var) {
                final SubLObject binding = removal_query_variable_binding(bindings_set);
                if (removal_modules_query_answers.NIL == binding) {
                    return (SubLObject)removal_modules_query_answers.NIL;
                }
                v_bindings = (SubLObject)ConsesLow.cons(binding, v_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                bindings_set = cdolist_list_var.first();
            }
        }
        v_bindings = Sequences.nreverse(v_bindings);
        return (SubLObject)ConsesLow.list(el_utilities.make_el_set(v_bindings, (SubLObject)removal_modules_query_answers.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 16035L)
    public static SubLObject removal_query_variable_binding(final SubLObject bindings_set) {
        if (removal_modules_query_answers.NIL == list_utilities.singletonP(bindings_set)) {
            return (SubLObject)removal_modules_query_answers.NIL;
        }
        return bindings.variable_binding_value(bindings_set.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 17319L)
    public static SubLObject removal_justification_partial_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_query_answers.UNPROVIDED) {
            sense = (SubLObject)removal_modules_query_answers.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject askable_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_query_answers.UNPROVIDED);
        final SubLObject justification_sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_query_answers.UNPROVIDED);
        final SubLObject query_properties_initial = inference_justification_partial_recursive_query_properties_initial(asent, mt);
        final SubLObject query_properties_continued = inference_justification_partial_recursive_query_properties_continued(asent, mt);
        SubLObject iteration_count = (SubLObject)removal_modules_query_answers.ZERO_INTEGER;
        SubLObject results = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject halt_reason = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject inference = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject justification_mode = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject justification_sentences = (SubLObject)removal_modules_query_answers.NIL;
        SubLObject doneP = (SubLObject)removal_modules_query_answers.NIL;
        if (removal_modules_query_answers.NIL == el_utilities.el_formula_p(askable_sentence)) {
            return (SubLObject)removal_modules_query_answers.NIL;
        }
        if (removal_modules_query_answers.NIL != el_utilities.el_conjunction_p(justification_sentence)) {
            justification_sentences = cycl_utilities.atomic_sentence_args(justification_sentence, (SubLObject)removal_modules_query_answers.UNPROVIDED);
            justification_mode = removal_modules_query_answers.$const28$and;
        }
        else if (removal_modules_query_answers.NIL != el_utilities.el_disjunction_p(justification_sentence)) {
            justification_sentences = cycl_utilities.atomic_sentence_args(justification_sentence, (SubLObject)removal_modules_query_answers.UNPROVIDED);
            justification_mode = removal_modules_query_answers.$const29$or;
        }
        else {
            justification_sentences = (SubLObject)ConsesLow.list(justification_sentence);
            justification_mode = removal_modules_query_answers.$const28$and;
        }
        while (removal_modules_query_answers.NIL == doneP && iteration_count.numL(removal_modules_query_answers.$removal_justification_partial_expand_max_justifications_count$.getDynamicValue(thread))) {
            iteration_count = Numbers.add(iteration_count, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
            thread.resetMultipleValues();
            final SubLObject results_$1 = (removal_modules_query_answers.NIL != inference) ? inference_justification_partial_recursive_inference_one_more_justification(inference, query_properties_continued) : inference_justification_partial_recursive_inference(askable_sentence, mt, query_properties_initial);
            final SubLObject halt_reason_$2 = thread.secondMultipleValue();
            final SubLObject inference_$3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            results = results_$1;
            halt_reason = halt_reason_$2;
            inference = inference_$3;
            doneP = (SubLObject)SubLObjectFactory.makeBoolean(!iteration_count.eql(Sequences.length(inference_datastructures_inference.inference_answer_justifications(inference_datastructures_inference.inference_all_answers(inference, (SubLObject)removal_modules_query_answers.UNPROVIDED).first()))));
            if (removal_modules_query_answers.NIL == doneP) {
                final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (removal_modules_query_answers.NIL != id_index.id_index_objects_empty_p(idx, (SubLObject)removal_modules_query_answers.$kw30$SKIP)) {
                    continue;
                }
                final SubLObject idx_$4 = idx;
                if (removal_modules_query_answers.NIL == id_index.id_index_dense_objects_empty_p(idx_$4, (SubLObject)removal_modules_query_answers.$kw30$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$4);
                    final SubLObject backwardP_var = (SubLObject)removal_modules_query_answers.NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_query_answers.NIL, v_iteration = (SubLObject)removal_modules_query_answers.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_query_answers.ONE_INTEGER)) {
                        id = ((removal_modules_query_answers.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_query_answers.ONE_INTEGER) : v_iteration);
                        this_answer = Vectors.aref(vector_var, id);
                        if (removal_modules_query_answers.NIL == id_index.id_index_tombstone_p(this_answer) || removal_modules_query_answers.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_query_answers.$kw30$SKIP)) {
                            if (removal_modules_query_answers.NIL != id_index.id_index_tombstone_p(this_answer)) {
                                this_answer = (SubLObject)removal_modules_query_answers.$kw30$SKIP;
                            }
                            cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                            this_justification = (SubLObject)removal_modules_query_answers.NIL;
                            this_justification = cdolist_list_var.first();
                            while (removal_modules_query_answers.NIL != cdolist_list_var) {
                                original_supports = inference_datastructures_inference.inference_answer_justification_supports(this_justification);
                                supports = conses_high.copy_list(original_supports);
                                checked_supports = (SubLObject)removal_modules_query_answers.NIL;
                                found_justification_sentences = (SubLObject)removal_modules_query_answers.NIL;
                                while (removal_modules_query_answers.NIL != supports && (!justification_mode.eql(removal_modules_query_answers.$const29$or) || removal_modules_query_answers.NIL == found_justification_sentences) && (!justification_mode.eql(removal_modules_query_answers.$const28$and) || Sequences.length(found_justification_sentences).numL(Sequences.length(justification_sentences)))) {
                                    support = supports.first();
                                    supports = supports.rest();
                                    cdolist_list_var_$5 = justification_sentences;
                                    justification_sentence_$6 = (SubLObject)removal_modules_query_answers.NIL;
                                    justification_sentence_$6 = cdolist_list_var_$5.first();
                                    while (removal_modules_query_answers.NIL != cdolist_list_var_$5) {
                                        if (removal_modules_query_answers.NIL != entails_elP(arguments.support_sentence(support), justification_sentence_$6)) {
                                            item_var = justification_sentence_$6;
                                            if (removal_modules_query_answers.NIL == conses_high.member(item_var, found_justification_sentences, Symbols.symbol_function((SubLObject)removal_modules_query_answers.EQL), Symbols.symbol_function((SubLObject)removal_modules_query_answers.IDENTITY))) {
                                                found_justification_sentences = (SubLObject)ConsesLow.cons(item_var, found_justification_sentences);
                                            }
                                        }
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        justification_sentence_$6 = cdolist_list_var_$5.first();
                                    }
                                    checked_supports = (SubLObject)ConsesLow.cons(support, checked_supports);
                                    cdolist_list_var_$6 = arguments.support_justification(support);
                                    support_justification = (SubLObject)removal_modules_query_answers.NIL;
                                    support_justification = cdolist_list_var_$6.first();
                                    while (removal_modules_query_answers.NIL != cdolist_list_var_$6) {
                                        if (removal_modules_query_answers.NIL == subl_promotions.memberP(support_justification, checked_supports, Symbols.symbol_function((SubLObject)removal_modules_query_answers.EQUAL), (SubLObject)removal_modules_query_answers.UNPROVIDED)) {
                                            supports = (SubLObject)ConsesLow.cons(support_justification, supports);
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        support_justification = cdolist_list_var_$6.first();
                                    }
                                }
                                if (removal_modules_query_answers.NIL != found_justification_sentences && (!justification_mode.eql(removal_modules_query_answers.$const28$and) || Sequences.length(found_justification_sentences).numE(Sequences.length(justification_sentences)))) {
                                    doneP = (SubLObject)removal_modules_query_answers.T;
                                    backward.removal_add_node(original_supports.first(), (SubLObject)removal_modules_query_answers.NIL, original_supports.rest());
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                this_justification = cdolist_list_var.first();
                            }
                        }
                    }
                }
                final SubLObject idx_$5 = idx;
                if (removal_modules_query_answers.NIL != id_index.id_index_sparse_objects_empty_p(idx_$5)) {
                    continue;
                }
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$5);
                SubLObject id2 = (SubLObject)removal_modules_query_answers.NIL;
                SubLObject this_answer2 = (SubLObject)removal_modules_query_answers.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        this_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = (SubLObject)removal_modules_query_answers.NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (removal_modules_query_answers.NIL != cdolist_list_var2) {
                            final SubLObject original_supports2 = inference_datastructures_inference.inference_answer_justification_supports(this_justification2);
                            SubLObject supports2 = conses_high.copy_list(original_supports2);
                            SubLObject checked_supports2 = (SubLObject)removal_modules_query_answers.NIL;
                            SubLObject found_justification_sentences2 = (SubLObject)removal_modules_query_answers.NIL;
                            while (removal_modules_query_answers.NIL != supports2 && (!justification_mode.eql(removal_modules_query_answers.$const29$or) || removal_modules_query_answers.NIL == found_justification_sentences2) && (!justification_mode.eql(removal_modules_query_answers.$const28$and) || Sequences.length(found_justification_sentences2).numL(Sequences.length(justification_sentences)))) {
                                final SubLObject support2 = supports2.first();
                                supports2 = supports2.rest();
                                SubLObject cdolist_list_var_$7 = justification_sentences;
                                SubLObject justification_sentence_$7 = (SubLObject)removal_modules_query_answers.NIL;
                                justification_sentence_$7 = cdolist_list_var_$7.first();
                                while (removal_modules_query_answers.NIL != cdolist_list_var_$7) {
                                    if (removal_modules_query_answers.NIL != entails_elP(arguments.support_sentence(support2), justification_sentence_$7)) {
                                        final SubLObject item_var2 = justification_sentence_$7;
                                        if (removal_modules_query_answers.NIL == conses_high.member(item_var2, found_justification_sentences2, Symbols.symbol_function((SubLObject)removal_modules_query_answers.EQL), Symbols.symbol_function((SubLObject)removal_modules_query_answers.IDENTITY))) {
                                            found_justification_sentences2 = (SubLObject)ConsesLow.cons(item_var2, found_justification_sentences2);
                                        }
                                    }
                                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                    justification_sentence_$7 = cdolist_list_var_$7.first();
                                }
                                checked_supports2 = (SubLObject)ConsesLow.cons(support2, checked_supports2);
                                SubLObject cdolist_list_var_$8 = arguments.support_justification(support2);
                                SubLObject support_justification2 = (SubLObject)removal_modules_query_answers.NIL;
                                support_justification2 = cdolist_list_var_$8.first();
                                while (removal_modules_query_answers.NIL != cdolist_list_var_$8) {
                                    if (removal_modules_query_answers.NIL == subl_promotions.memberP(support_justification2, checked_supports2, Symbols.symbol_function((SubLObject)removal_modules_query_answers.EQUAL), (SubLObject)removal_modules_query_answers.UNPROVIDED)) {
                                        supports2 = (SubLObject)ConsesLow.cons(support_justification2, supports2);
                                    }
                                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                    support_justification2 = cdolist_list_var_$8.first();
                                }
                            }
                            if (removal_modules_query_answers.NIL != found_justification_sentences2 && (!justification_mode.eql(removal_modules_query_answers.$const28$and) || Sequences.length(found_justification_sentences2).numE(Sequences.length(justification_sentences)))) {
                                doneP = (SubLObject)removal_modules_query_answers.T;
                                backward.removal_add_node(original_supports2.first(), (SubLObject)removal_modules_query_answers.NIL, original_supports2.rest());
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 20615L)
    public static SubLObject entails_elP(final SubLObject sentence, final SubLObject entailed_sentence) {
        if (removal_modules_query_answers.NIL != czer_utilities.equals_elP(sentence, entailed_sentence, (SubLObject)removal_modules_query_answers.UNPROVIDED, (SubLObject)removal_modules_query_answers.UNPROVIDED, (SubLObject)removal_modules_query_answers.UNPROVIDED)) {
            return (SubLObject)removal_modules_query_answers.T;
        }
        if (removal_modules_query_answers.NIL != fort_types_interface.predicate_p(sentence.first()) && removal_modules_query_answers.NIL != fort_types_interface.predicate_p(entailed_sentence.first()) && removal_modules_query_answers.NIL != genl_predicates.genl_predicateP(sentence.first(), entailed_sentence.first(), (SubLObject)removal_modules_query_answers.UNPROVIDED, (SubLObject)removal_modules_query_answers.UNPROVIDED) && sentence.rest().equal(entailed_sentence.rest())) {
            return (SubLObject)removal_modules_query_answers.T;
        }
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 21120L)
    public static SubLObject inference_justification_partial_recursive_inference(final SubLObject formula, final SubLObject mt, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.inference_recursive_query(formula, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(results, halt_reason, inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 21388L)
    public static SubLObject inference_justification_partial_recursive_inference_one_more_justification(final SubLObject inference, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.continue_inference(inference, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference_$12 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(results, halt_reason, inference_$12);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 21670L)
    public static SubLObject inference_justification_partial_recursive_query_properties_initial(final SubLObject formula, SubLObject mt) {
        if (mt == removal_modules_query_answers.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(formula, mt);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw31$MAX_NUMBER, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw32$CONTINUABLE_, (SubLObject)removal_modules_query_answers.T);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw33$BROWSABLE_, (SubLObject)removal_modules_query_answers.T);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw34$ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec());
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (removal_modules_query_answers.NIL != inference_datastructures_inference.inference_p(inference)) {
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw35$MAX_TIME, inference_utilities.inference_property_lookup(inference, (SubLObject)removal_modules_query_answers.$kw35$MAX_TIME, (SubLObject)removal_modules_query_answers.UNPROVIDED));
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw36$MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference, (SubLObject)removal_modules_query_answers.$kw36$MAX_TRANSFORMATION_DEPTH, (SubLObject)removal_modules_query_answers.UNPROVIDED));
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw37$ALLOWED_RULES, inference_datastructures_inference.inference_allowed_rules_list(inference));
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw34$ALLOWED_MODULES, inference_datastructures_inference.inference_allowed_modules(inference));
        }
        else {
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw36$MAX_TRANSFORMATION_DEPTH, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
        }
        return query_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 22959L)
    public static SubLObject inference_justification_partial_recursive_query_properties_continued(final SubLObject formula, SubLObject mt) {
        if (mt == removal_modules_query_answers.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(formula, mt);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw31$MAX_NUMBER, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw32$CONTINUABLE_, (SubLObject)removal_modules_query_answers.T);
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (removal_modules_query_answers.NIL != inference_datastructures_inference.inference_p(inference)) {
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw35$MAX_TIME, inference_utilities.inference_property_lookup(inference, (SubLObject)removal_modules_query_answers.$kw35$MAX_TIME, (SubLObject)removal_modules_query_answers.UNPROVIDED));
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw36$MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference, (SubLObject)removal_modules_query_answers.$kw36$MAX_TRANSFORMATION_DEPTH, (SubLObject)removal_modules_query_answers.UNPROVIDED));
        }
        else {
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_query_answers.$kw36$MAX_TRANSFORMATION_DEPTH, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
        }
        return query_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 24754L)
    public static SubLObject removal_firstinlistsatisfying_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_query_answers.UNPROVIDED) {
            sense = (SubLObject)removal_modules_query_answers.NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_query_answers.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_query_answers.UNPROVIDED);
        SubLObject doneP = (SubLObject)removal_modules_query_answers.NIL;
        if (removal_modules_query_answers.NIL == doneP) {
            SubLObject csome_list_var = el_utilities.el_list_items(arg1);
            SubLObject elem = (SubLObject)removal_modules_query_answers.NIL;
            elem = csome_list_var.first();
            while (removal_modules_query_answers.NIL == doneP && removal_modules_query_answers.NIL != csome_list_var) {
                if (removal_modules_query_answers.NIL != ask_utilities.inference_recursive_query(el_utilities.make_unary_formula(arg2, elem), (SubLObject)removal_modules_query_answers.UNPROVIDED, (SubLObject)removal_modules_query_answers.UNPROVIDED)) {
                    doneP = (SubLObject)removal_modules_query_answers.T;
                    final SubLObject answer_asent = el_utilities.make_ternary_formula(removal_modules_query_answers.$const38$firstInListSatisfying, arg1, arg2, elem);
                    final SubLObject v_bindings = unification_utilities.term_unify(answer_asent, asent, (SubLObject)removal_modules_query_answers.UNPROVIDED, (SubLObject)removal_modules_query_answers.UNPROVIDED);
                    if (removal_modules_query_answers.NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_query_answers.$kw41$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_query_answers.UNPROVIDED, (SubLObject)removal_modules_query_answers.UNPROVIDED), v_bindings, (SubLObject)removal_modules_query_answers.UNPROVIDED);
                    }
                }
                csome_list_var = csome_list_var.rest();
                elem = csome_list_var.first();
            }
        }
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-query-answers.lisp", position = 25348L)
    public static SubLObject test_removal_firstinlistsatisfying_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == removal_modules_query_answers.UNPROVIDED) {
            mt = (SubLObject)removal_modules_query_answers.NIL;
        }
        if (query_properties == removal_modules_query_answers.UNPROVIDED) {
            query_properties = (SubLObject)removal_modules_query_answers.NIL;
        }
        final SubLObject v_answer = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        if (removal_modules_query_answers.NIL != cyc_kernel.closed_query_success_token_p(v_answer)) {
            return (SubLObject)removal_modules_query_answers.T;
        }
        if (removal_modules_query_answers.NIL != bindings.bindings_p(v_answer)) {
            return Mapping.mapcar((SubLObject)removal_modules_query_answers.$sym42$FIRST, Mapping.mapcar((SubLObject)removal_modules_query_answers.$sym43$BINDINGS_VALUES, v_answer));
        }
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    public static SubLObject declare_removal_modules_query_answers_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_cycl_query_specification_p", "REMOVAL-CYCL-QUERY-SPECIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_allowed_query_answers_sentenceP", "REMOVAL-ALLOWED-QUERY-ANSWERS-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_query_answers_cost", "REMOVAL-QUERY-ANSWERS-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_query_answers_iterate", "REMOVAL-QUERY-ANSWERS-ITERATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_inference_answer_fns", "REMOVAL-CREATE-INFERENCE-ANSWER-FNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_inference_answer_fn_from_answers", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_inference_answer_fn_from_bindings", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_inference_answer_fn_from_supports", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_inference_answer_fn_from_bindings_and_supports", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-BINDINGS-AND-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-BINDINGS-AND-HYPOTHETICAL-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_justification_fns", "REMOVAL-JUSTIFICATION-FNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_justification_fns_from_supports", "REMOVAL-JUSTIFICATION-FNS-FROM-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_justification_fn", "REMOVAL-CREATE-JUSTIFICATION-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_support_datastructures", "REMOVAL-SUPPORT-DATASTRUCTURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_cycl_hl_support_fn", "REMOVAL-CREATE-CYCL-HL-SUPPORT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_inference_answer_fn", "REMOVAL-CREATE-INFERENCE-ANSWER-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "query_answers_kbq_run_query", "QUERY-ANSWERS-KBQ-RUN-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_allowed_query_bindings_sentenceP", "REMOVAL-ALLOWED-QUERY-BINDINGS-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_query_bindings_cost", "REMOVAL-QUERY-BINDINGS-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_query_bindings_iterate", "REMOVAL-QUERY-BINDINGS-ITERATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_el_bindings_sets", "REMOVAL-CREATE-EL-BINDINGS-SETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_allowed_query_variable_sentenceP", "REMOVAL-ALLOWED-QUERY-VARIABLE-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_query_variable_cost", "REMOVAL-QUERY-VARIABLE-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_query_variable_iterate", "REMOVAL-QUERY-VARIABLE-ITERATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_create_set_of_variable_bindings", "REMOVAL-CREATE-SET-OF-VARIABLE-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_query_variable_binding", "REMOVAL-QUERY-VARIABLE-BINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_justification_partial_expand", "REMOVAL-JUSTIFICATION-PARTIAL-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "entails_elP", "ENTAILS-EL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "inference_justification_partial_recursive_inference", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-INFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "inference_justification_partial_recursive_inference_one_more_justification", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-INFERENCE-ONE-MORE-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "inference_justification_partial_recursive_query_properties_initial", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-QUERY-PROPERTIES-INITIAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "inference_justification_partial_recursive_query_properties_continued", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-QUERY-PROPERTIES-CONTINUED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "removal_firstinlistsatisfying_expand", "REMOVAL-FIRSTINLISTSATISFYING-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers", "test_removal_firstinlistsatisfying_expand", "TEST-REMOVAL-FIRSTINLISTSATISFYING-EXPAND", 1, 2, false);
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    public static SubLObject init_removal_modules_query_answers_file() {
        removal_modules_query_answers.$removal_justification_partial_expand_max_justifications_count$ = SubLFiles.defparameter("*REMOVAL-JUSTIFICATION-PARTIAL-EXPAND-MAX-JUSTIFICATIONS-COUNT*", (SubLObject)removal_modules_query_answers.TEN_INTEGER);
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    public static SubLObject setup_removal_modules_query_answers_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_query_answers.$const0$queryAnswers);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_query_answers.$kw1$POS, removal_modules_query_answers.$const0$queryAnswers, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_query_answers.$kw3$REMOVAL_QUERY_ANSWERS, (SubLObject)removal_modules_query_answers.$list4);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_query_answers.$const16$inferenceAnswerBindingsAndJustifi);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_query_answers.$kw1$POS, removal_modules_query_answers.$const16$inferenceAnswerBindingsAndJustifi, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_query_answers.$kw17$REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, (SubLObject)removal_modules_query_answers.$list18);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_query_answers.$const19$queryBindings);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_query_answers.$kw1$POS, removal_modules_query_answers.$const19$queryBindings, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_query_answers.$kw20$REMOVAL_QUERY_BINDINGS, (SubLObject)removal_modules_query_answers.$list21);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_query_answers.$const22$queryVariable);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_query_answers.$kw1$POS, removal_modules_query_answers.$const22$queryVariable, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_query_answers.$kw23$REMOVAL_QUERY_VARIABLE, (SubLObject)removal_modules_query_answers.$list24);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_query_answers.$const25$justification_Partial);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_query_answers.$kw1$POS, removal_modules_query_answers.$const25$justification_Partial);
        inference_modules.inference_removal_module((SubLObject)removal_modules_query_answers.$kw26$REMOVAL_JUSTIFICATION_PARTIAL, (SubLObject)removal_modules_query_answers.$list27);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_query_answers.$const38$firstInListSatisfying);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_query_answers.$kw1$POS, removal_modules_query_answers.$const38$firstInListSatisfying, (SubLObject)removal_modules_query_answers.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_query_answers.$kw1$POS, removal_modules_query_answers.$const38$firstInListSatisfying, (SubLObject)removal_modules_query_answers.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_query_answers.$kw39$REMOVAL_FIRSTINLISTSATISFYING, (SubLObject)removal_modules_query_answers.$list40);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_query_answers.$sym44$TEST_REMOVAL_FIRSTINLISTSATISFYING_EXPAND, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_query_answers.$kw45$TEST, Symbols.symbol_function((SubLObject)removal_modules_query_answers.EQUAL), removal_modules_query_answers.$kw46$OWNER, removal_modules_query_answers.NIL, removal_modules_query_answers.$kw47$CLASSES, removal_modules_query_answers.NIL, removal_modules_query_answers.$kw48$KB, removal_modules_query_answers.$kw49$FULL, removal_modules_query_answers.$kw50$WORKING_, removal_modules_query_answers.T }), (SubLObject)removal_modules_query_answers.$list51);
        return (SubLObject)removal_modules_query_answers.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_query_answers_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_query_answers_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_query_answers_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_query_answers();
        removal_modules_query_answers.$removal_justification_partial_expand_max_justifications_count$ = null;
        $const0$queryAnswers = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryAnswers"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $const2$CycLQuerySpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification"));
        $kw3$REMOVAL_QUERY_ANSWERS = SubLObjectFactory.makeKeyword("REMOVAL-QUERY-ANSWERS");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryAnswers")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryAnswers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALLOWED-QUERY-ANSWERS-SENTENCE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-QUERY-ANSWERS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryAnswers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-QUERY-ANSWERS-ITERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryAnswers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$queryAnswers <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$queryAnswers (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?ANS)") });
        $kw5$ANSWER = SubLObjectFactory.makeKeyword("ANSWER");
        $kw6$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw7$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $kw8$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw9$BINDINGS_AND_HYPOTHETICAL_BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $const10$TheEmptySet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptySet"));
        $const11$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $const12$CycInferenceAnswerJustificationFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycInferenceAnswerJustificationFn"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $const14$CycHLSupportFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycHLSupportFn"));
        $const15$CycInferenceAnswerFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycInferenceAnswerFn"));
        $const16$inferenceAnswerBindingsAndJustifi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications"));
        $kw17$REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS = SubLObjectFactory.makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-AND-JUSTIFICATIONS");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycInferenceAnswerFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_query_answers.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-FN")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-FN"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycInferenceAnswerFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING-SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION-SET"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING-SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION-SET")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING-SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION-SET"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inferenceAnswerBindingsAndJustifications")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-FN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING-SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION-SET")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$inferenceAnswerBindingsAndJustifications <fully-bound> <anything> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$inferenceAnswerBindingsAndJustifications \n      (#$CycInferenceAnswerFn (#$TheSet (#$ELInferenceBindingFn ?DOG #$Muffet)) TheEmptySet) \n      ?BIND ?JUST)") });
        $const19$queryBindings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryBindings"));
        $kw20$REMOVAL_QUERY_BINDINGS = SubLObjectFactory.makeKeyword("REMOVAL-QUERY-BINDINGS");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryBindings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryBindings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALLOWED-QUERY-BINDINGS-SENTENCE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-QUERY-BINDINGS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryBindings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-QUERY-BINDINGS-ITERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryBindings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$queryBindings <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$queryBindings (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?BINDINGS)") });
        $const22$queryVariable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryVariable"));
        $kw23$REMOVAL_QUERY_VARIABLE = SubLObjectFactory.makeKeyword("REMOVAL-QUERY-VARIABLE");
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryVariable")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryVariable")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALLOWED-QUERY-VARIABLE-SENTENCE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-QUERY-VARIABLE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryVariable")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-QUERY-VARIABLE-ITERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryVariable")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$queryVariable <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$queryVariable (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?SET)") });
        $const25$justification_Partial = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("justification-Partial"));
        $kw26$REMOVAL_JUSTIFICATION_PARTIAL = SubLObjectFactory.makeKeyword("REMOVAL-JUSTIFICATION-PARTIAL");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("justification-Partial")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("justification-Partial")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-JUSTIFICATION-PARTIAL-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$justification-Partial <fully-bound> <fully-bound>)\n    by recursively querying ASKABLE-SENTENCE and succeeding if the answer justifications contain the JUSTIFICATION-SENTENCE"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$justification-Partial (#$genls #$Dog #$Animal) (#$genls #$Dog #$CanisGenus))") });
        $const28$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const29$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $kw30$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw31$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw32$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw33$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw34$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $kw35$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw36$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw37$ALLOWED_RULES = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $const38$firstInListSatisfying = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying"));
        $kw39$REMOVAL_FIRSTINLISTSATISFYING = SubLObjectFactory.makeKeyword("REMOVAL-FIRSTINLISTSATISFYING");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-FIRSTINLISTSATISFYING-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$firstInListSatisfying <fully-bound-p> <fully-bound-p> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$firstInListSatisfying\n  (#$TheList 1 2 3 4 5 6)\n  (#$Kappa (?INPUT)\n    (#$greaterThan ?INPUT 4))\n  ?WHAT)") });
        $kw41$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $sym42$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym43$BINDINGS_VALUES = SubLObjectFactory.makeSymbol("BINDINGS-VALUES");
        $sym44$TEST_REMOVAL_FIRSTINLISTSATISFYING_EXPAND = SubLObjectFactory.makeSymbol("TEST-REMOVAL-FIRSTINLISTSATISFYING-EXPAND");
        $kw45$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw46$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw47$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw48$KB = SubLObjectFactory.makeKeyword("KB");
        $kw49$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw50$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)removal_modules_query_answers.ONE_INTEGER, (SubLObject)removal_modules_query_answers.TWO_INTEGER, (SubLObject)removal_modules_query_answers.THREE_INTEGER, (SubLObject)removal_modules_query_answers.FOUR_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?INPUT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?INPUT"), (SubLObject)removal_modules_query_answers.FOUR_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("?WHAT"))), (SubLObject)removal_modules_query_answers.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)removal_modules_query_answers.ONE_INTEGER, (SubLObject)removal_modules_query_answers.TWO_INTEGER, (SubLObject)removal_modules_query_answers.THREE_INTEGER, (SubLObject)removal_modules_query_answers.FOUR_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?INPUT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?INPUT"), (SubLObject)removal_modules_query_answers.FOUR_INTEGER)), (SubLObject)removal_modules_query_answers.FOUR_INTEGER)), (SubLObject)removal_modules_query_answers.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)removal_modules_query_answers.ONE_INTEGER, (SubLObject)removal_modules_query_answers.TWO_INTEGER, (SubLObject)removal_modules_query_answers.THREE_INTEGER, (SubLObject)removal_modules_query_answers.FOUR_INTEGER, (SubLObject)removal_modules_query_answers.FIVE_INTEGER, (SubLObject)removal_modules_query_answers.SIX_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?INPUT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?INPUT"), (SubLObject)removal_modules_query_answers.FOUR_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("?WHAT"))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_query_answers.FIVE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)removal_modules_query_answers.ONE_INTEGER, (SubLObject)removal_modules_query_answers.TWO_INTEGER, (SubLObject)removal_modules_query_answers.THREE_INTEGER, (SubLObject)removal_modules_query_answers.FOUR_INTEGER, (SubLObject)removal_modules_query_answers.FIVE_INTEGER, (SubLObject)removal_modules_query_answers.SIX_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?INPUT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?INPUT"), (SubLObject)removal_modules_query_answers.FOUR_INTEGER)), (SubLObject)removal_modules_query_answers.FIVE_INTEGER)), (SubLObject)removal_modules_query_answers.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("X")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.FIVE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.FIVE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.SEVEN_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.SEVEN_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.THREE_INTEGER))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FOO")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mathExpressionNthOperand")), (SubLObject)SubLObjectFactory.makeSymbol("?FOO"), (SubLObject)removal_modules_query_answers.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?VAR")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathematicalVariable")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("X")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.FIVE_INTEGER)))), (SubLObject)removal_modules_query_answers.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("X")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.FIVE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.FIVE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.SEVEN_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.SEVEN_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.THREE_INTEGER))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FOO")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mathExpressionNthOperand")), (SubLObject)SubLObjectFactory.makeSymbol("?FOO"), (SubLObject)removal_modules_query_answers.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?VAR")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathematicalVariable")))))), (SubLObject)SubLObjectFactory.makeSymbol("?WHAT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("X")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)removal_modules_query_answers.FIVE_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstInListSatisfying")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)removal_modules_query_answers.ONE_INTEGER, (SubLObject)removal_modules_query_answers.TWO_INTEGER, (SubLObject)removal_modules_query_answers.THREE_INTEGER, (SubLObject)removal_modules_query_answers.FOUR_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?INPUT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?INPUT"), (SubLObject)removal_modules_query_answers.ZERO_INTEGER)), (SubLObject)removal_modules_query_answers.FOUR_INTEGER)), (SubLObject)removal_modules_query_answers.NIL));
    }
}

/*

	Total time: 338 ms
	
*/