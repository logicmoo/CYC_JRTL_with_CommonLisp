package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.leviathan;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
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

public class inference_worker_transformation extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation";
    public static String myFingerPrint = "902d7be104627043e5fac8765af7703d05187cd554b4b86fa19875dd6c1abd39";
    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLSymbol $dtp_transformation_link_data$;
    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 15500L)
    private static SubLSymbol $determine_new_transformation_tactics_module$;
    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 33300L)
    private static SubLSymbol $transformation_tactic_iteration_threshold$;
    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 36200L)
    private static SubLSymbol $stitch_up_bindings_loopP$;
    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 38800L)
    public static SubLSymbol $inference_transformation_type_checking_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 61600L)
    private static SubLSymbol $merge_dnf_lambda_var$;
    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 61700L)
    private static SubLSymbol $rule_dnf_lambda_var$;
    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 67200L)
    private static SubLSymbol $genl_rules_enabledP$;
    private static SubLSymbol $sym0$TRANSFORMATION_LINK_DATA;
    private static SubLSymbol $sym1$TRANSFORMATION_LINK_DATA_P;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym7$TRANSFORMATION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list8;
    private static SubLSymbol $sym9$TRANS_LINK_DATA_HL_MODULE;
    private static SubLSymbol $sym10$_CSETF_TRANS_LINK_DATA_HL_MODULE;
    private static SubLSymbol $sym11$TRANS_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym12$_CSETF_TRANS_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym13$TRANS_LINK_DATA_SUPPORTS;
    private static SubLSymbol $sym14$_CSETF_TRANS_LINK_DATA_SUPPORTS;
    private static SubLSymbol $sym15$TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY;
    private static SubLSymbol $sym16$_CSETF_TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY;
    private static SubLSymbol $HL_MODULE;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $SUPPORTS;
    private static SubLSymbol $NON_EXPLANATORY_SUBQUERY;
    private static SubLString $str21$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym23$MAKE_TRANSFORMATION_LINK_DATA;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_LINK_DATA_METHOD;
    private static SubLSymbol $sym27$PROBLEM_P;
    private static SubLSymbol $sym28$MAPPED_PROBLEM_P;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $FREE;
    private static SubLSymbol $sym31$TRANSFORMATION_LINK_P;
    private static SubLSymbol $sym32$HL_MODULE_P;
    private static SubLSymbol $sym33$BINDING_LIST_P;
    private static SubLSymbol $sym34$HL_JUSTIFICATION_P;
    private static SubLSymbol $sym35$NON_EXPLANATORY_SUBQUERY_SPEC_P;
    private static SubLString $str36$No_tactic_found_for__S;
    private static SubLList $list37;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $RESIDUAL_TRANSFORMATION;
    private static SubLList $list40;
    private static SubLSymbol $sym41$STORE_VAR;
    private static SubLSymbol $sym42$CLET;
    private static SubLList $list43;
    private static SubLList $list44;
    private static SubLList $list45;
    private static SubLSymbol $sym46$_NEGATION_BY_FAILURE_;
    private static SubLSymbol $sym47$PROBLEM_STORE_NEGATION_BY_FAILURE_;
    private static SubLSymbol $sym48$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_;
    private static SubLSymbol $DETERMINE_NEW_TRANSFORMATION_TACTICS;
    private static SubLSymbol $GROSSLY_INCOMPLETE;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym52$TRANSFORMATION_GENERATOR_TACTIC_P;
    private static SubLSymbol $sym53$TRANSFORMATION_PROOF_P;
    private static SubLString $str54$generalized_transformation_link_o;
    private static SubLString $str55$generalized_transformation_proof_;
    private static SubLList $list56;
    private static SubLSymbol $sym57$INFERENCE_EXCEPTED_ASSERTION_;
    private static SubLSymbol $sym58$_EXIT;
    private static SubLSymbol $sym59$SINGLE_LITERAL_PROBLEM_P;
    private static SubLSymbol $TACTIC_SPECS;
    private static SubLSymbol $TOTAL_PRODUCTIVITY;
    private static SubLString $str62$unexpected_tactic_specs_return_ty;
    private static SubLString $str63$pruning__s__s__s;
    private static SubLList $list64;
    private static SubLSymbol $sym65$TACTIC_VAR;
    private static SubLSymbol $sym66$WITH_INFERENCE_MT_RELEVANCE;
    private static SubLSymbol $sym67$_INFERENCE_EXPAND_HL_MODULE_;
    private static SubLSymbol $sym68$TACTIC_HL_MODULE;
    private static SubLSymbol $sym69$_INFERENCE_EXPAND_SENSE_;
    private static SubLSymbol $sym70$WITH_PROBLEM_STORE_TRANSFORMATION_ASSUMPTIONS;
    private static SubLSymbol $sym71$TACTIC_STORE;
    private static SubLString $str72$time_to_add_meta_transformation_s;
    private static SubLSymbol $TRANSFORMATION_RULE_SELECT;
    private static SubLString $str74$transformation_tactic__S_already_;
    private static SubLSymbol $sym75$HANDLE_TRANSFORMATION_ADD_NODE_FOR_EXPAND_RESULTS;
    private static SubLSymbol $sym76$HL_VAR_;
    private static SubLSymbol $NEG;
    private static SubLSymbol $POS;
    private static SubLList $list79;
    private static SubLObject $$termOfUnit;
    private static SubLSymbol $sym81$PROOF_P;
    private static SubLSymbol $sym82$BINDINGS_P;
    private static SubLString $str83$Could_not_ground_out__s_and__s;
    private static SubLString $str84$Could_not_unify_transformation_bi;
    private static SubLSymbol $sym85$RULE_ASSERTION_;
    private static SubLObject $$InferencePSC;
    private static SubLSymbol $sym87$ASSERTION_P;
    private static SubLSymbol $RULE;
    private static SubLObject $$forwardNonTriggerLiteral;
    private static SubLObject $$forwardTriggerLiteral;
    private static SubLSymbol $sym91$HL_VARIABLE_NOT_MENTIONED_IN_RULE_DNF_BUT_MENTIONED_IN_MERGE_DNF;
    private static SubLSymbol $sym92$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P;
    private static SubLSymbol $sym93$TRANSFORMATION_PROOF_ABNORMAL_;
    private static SubLSymbol $sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED;
    private static SubLSymbol $IGNORE;
    private static SubLSymbol $sym96$_;
    private static SubLSymbol $sym97$VARIABLE_ID;
    private static SubLObject $$genlRules;

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject transformation_link_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject transformation_link_data_p(SubLObject v_object) {
        return (v_object.getClass() == $transformation_link_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject trans_link_data_hl_module(SubLObject v_object) {
        assert NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject trans_link_data_bindings(SubLObject v_object) {
        assert NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject trans_link_data_supports(SubLObject v_object) {
        assert NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject trans_link_data_non_explanatory_subquery(SubLObject v_object) {
        assert NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject _csetf_trans_link_data_hl_module(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject _csetf_trans_link_data_bindings(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject _csetf_trans_link_data_supports(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject _csetf_trans_link_data_non_explanatory_subquery(SubLObject v_object, SubLObject value) {
        assert NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject make_transformation_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $transformation_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HL_MODULE)) {
                _csetf_trans_link_data_hl_module(v_new, current_value);
            } else if (pcase_var.eql($BINDINGS)) {
                _csetf_trans_link_data_bindings(v_new, current_value);
            } else if (pcase_var.eql($SUPPORTS)) {
                _csetf_trans_link_data_supports(v_new, current_value);
            } else if (pcase_var.eql($NON_EXPLANATORY_SUBQUERY)) {
                _csetf_trans_link_data_non_explanatory_subquery(v_new, current_value);
            } else {
                Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject visit_defstruct_transformation_link_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym23$MAKE_TRANSFORMATION_LINK_DATA, FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $HL_MODULE, trans_link_data_hl_module(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $BINDINGS, trans_link_data_bindings(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SUPPORTS, trans_link_data_supports(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NON_EXPLANATORY_SUBQUERY, trans_link_data_non_explanatory_subquery(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym23$MAKE_TRANSFORMATION_LINK_DATA, FOUR_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1200L)
    public static SubLObject visit_defstruct_object_transformation_link_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_transformation_link_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 2400L)
    public static SubLObject new_transformation_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject hl_module, SubLObject transformation_bindings, SubLObject rule_assertion, SubLObject more_supports, SubLObject non_explanatory_subquery) {
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        if (NIL != supporting_mapped_problem && !assertionsDisabledInClass && NIL == inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem)) {
            throw new AssertionError(supporting_mapped_problem);
        }
        SubLObject supports = cons(rule_assertion, more_supports);
        SubLObject transformation_link = new_transformation_link_int(supported_problem, hl_module, transformation_bindings, supports, non_explanatory_subquery);
        if (NIL != supporting_mapped_problem) {
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, transformation_link);
        }
        inference_datastructures_problem_link.problem_link_open_all(transformation_link);
        inference_worker.propagate_problem_link(transformation_link);
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 3200L)
    public static SubLObject new_transformation_link_int(SubLObject problem, SubLObject hl_module, SubLObject transformation_bindings, SubLObject supports, SubLObject non_explanatory_subquery) {
        SubLObject transformation_link = inference_datastructures_problem_link.new_problem_link($TRANSFORMATION, problem);
        new_transformation_link_data(transformation_link);
        set_transformation_link_hl_module(transformation_link, hl_module);
        set_transformation_link_bindings(transformation_link, transformation_bindings);
        set_transformation_link_supports(transformation_link, supports);
        set_transformation_link_non_explanatory_subquery(transformation_link, non_explanatory_subquery);
        if (NIL != non_explanatory_subquery) {
            inference_datastructures_problem_store.problem_store_note_non_explanatory_subproofs_possible(inference_datastructures_problem.problem_store(problem));
        }
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 4100L)
    public static SubLObject new_transformation_link_data(SubLObject transformation_link) {
        SubLObject data = make_transformation_link_data(UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(transformation_link, data);
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 4300L)
    public static SubLObject destroy_transformation_link(SubLObject transformation_link) {
        inference_worker_residual_transformation.destroy_transformation_link_wrt_residual_transformation_links(transformation_link);
        SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_hl_module(data, $FREE);
        _csetf_trans_link_data_bindings(data, $FREE);
        _csetf_trans_link_data_supports(data, $FREE);
        _csetf_trans_link_data_non_explanatory_subquery(data, $FREE);
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 4800L)
    public static SubLObject transformation_link_hl_module(SubLObject transformation_link) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        return trans_link_data_hl_module(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5000L)
    public static SubLObject transformation_link_bindings(SubLObject transformation_link) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        return trans_link_data_bindings(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5500L)
    public static SubLObject transformation_link_supports(SubLObject transformation_link) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        return trans_link_data_supports(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5700L)
    public static SubLObject transformation_link_rule_assertion(SubLObject transformation_link) {
        return transformation_link_supports(transformation_link).first();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5800L)
    public static SubLObject transformation_link_more_supports(SubLObject transformation_link) {
        return transformation_link_supports(transformation_link).rest();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6000L)
    public static SubLObject transformation_link_non_explanatory_subquery(SubLObject transformation_link) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        return trans_link_data_non_explanatory_subquery(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6200L)
    public static SubLObject set_transformation_link_hl_module(SubLObject transformation_link, SubLObject hl_module) {
        assert NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_hl_module(data, hl_module);
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6600L)
    public static SubLObject set_transformation_link_bindings(SubLObject transformation_link, SubLObject v_bindings) {
        assert NIL != bindings.binding_list_p(v_bindings) : v_bindings;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_bindings(data, v_bindings);
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6900L)
    public static SubLObject set_transformation_link_supports(SubLObject transformation_link, SubLObject supports) {
        assert NIL != arguments.hl_justification_p(supports) : supports;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_supports(data, supports);
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 7200L)
    public static SubLObject set_transformation_link_non_explanatory_subquery(SubLObject transformation_link, SubLObject subquery) {
        assert NIL != inference_datastructures_problem_query.non_explanatory_subquery_spec_p(subquery) : subquery;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_non_explanatory_subquery(data, subquery);
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 7600L)
    public static SubLObject transformation_link_tactic(SubLObject transformation_link) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        SubLObject hl_module = transformation_link_hl_module(transformation_link);
        SubLObject rule = transformation_link_rule_assertion(transformation_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject candidate_tactic = NIL;
        candidate_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $TRANSFORMATION) && hl_module.eql(inference_datastructures_tactic.tactic_hl_module(candidate_tactic)) && rule.eql(transformation_tactic_rule(candidate_tactic))) {
                return candidate_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_tactic = cdolist_list_var.first();
        }
        if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
            return Errors.error($str36$No_tactic_found_for__S, transformation_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 8300L)
    public static SubLObject transformation_link_pragmatic_requirements(SubLObject transformation_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rule_assertion = transformation_link_rule_assertion(transformation_link);
        SubLObject transformation_mt = transformation_link_transformation_mt(transformation_link);
        SubLObject pragmatic_requirements_dnf = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(transformation_mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pragmatic_requirements_dnf = unification.variable_base_inversion(backward_rule_pragmatic_dnf(rule_assertion, transformation_mt));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return inference_czer.contextualize_clause(pragmatic_requirements_dnf, transformation_mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9100L)
    public static SubLObject transformation_link_supporting_mapped_problem(SubLObject transformation_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(transformation_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9300L)
    public static SubLObject transformation_link_supporting_problem(SubLObject transformation_link) {
        SubLObject supporting_mapped_problem = transformation_link_supporting_mapped_problem(transformation_link);
        if (NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9600L)
    public static SubLObject transformation_link_supporting_variable_map(SubLObject transformation_link) {
        SubLObject supporting_mapped_problem = transformation_link_supporting_mapped_problem(transformation_link);
        if (NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9900L)
    public static SubLObject transformation_link_transformation_mt(SubLObject transformation_link) {
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        return inference_datastructures_problem.single_literal_problem_mt(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 10200L)
    public static SubLObject transformation_link_supporting_problem_wholly_explanatoryP(SubLObject transformation_link) {
        return Types.sublisp_null(transformation_link_non_explanatory_subquery(transformation_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 10400L)
    public static SubLObject transformed_problem_using_rule(SubLObject supported_problem, SubLObject rule) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        SubLObject transformation_link_rule;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                transformation_link_rule = transformation_link_rule_assertion(transformation_link);
                if (rule.eql(transformation_link_rule)) {
                    return transformation_link_supporting_problem(transformation_link);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 10900L)
    public static SubLObject transformed_problem_using_rule_and_hl_module(SubLObject supported_problem, SubLObject rule, SubLObject hl_module) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        SubLObject transformation_link_rule;
        SubLObject transformation_link_hl_module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                transformation_link_rule = transformation_link_rule_assertion(transformation_link);
                if (rule.eql(transformation_link_rule)) {
                    transformation_link_hl_module = transformation_link_hl_module(transformation_link);
                    if (hl_module.eql(transformation_link_hl_module)) {
                        return transformation_link_supporting_problem(transformation_link);
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 11600L)
    public static SubLObject transformation_link_rule_bindings_to_closed(SubLObject transformation_link) {
        return transformation_rule_bindings_to_closed(transformation_link_bindings(transformation_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 11800L)
    public static SubLObject transformation_rule_bindings_to_closed(SubLObject transformation_bindings) {
        SubLObject v_bindings = NIL;
        SubLObject cdolist_list_var = transformation_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
            variable = current.first();
            current = (value = current.rest());
            if (NIL != unification.non_base_variable_p(variable) && NIL != variables.fully_bound_p(value)) {
                v_bindings = cons(binding, v_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 12300L)
    public static SubLObject transformation_link_el_bindings(SubLObject transformation_link) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject rule_assertion = transformation_link_rule_assertion(transformation_link);
        SubLObject rule_assertion_variable_map = rule_assertion_variable_map(rule_assertion);
        SubLObject hl_bindings = transformation_link_bindings(transformation_link);
        SubLObject el_bindings = bindings.apply_bindings_backwards(rule_assertion_variable_map, hl_bindings);
        SubLObject canon_el_bindings = canonicalize_bindings_wrt_el_vars(el_bindings);
        return canon_el_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 12900L)
    public static SubLObject canonicalize_bindings_wrt_el_vars(SubLObject v_bindings) {
        SubLObject new_bindings = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
            variable = current.first();
            current = (value = current.rest());
            if (NIL != variables.variable_p(variable) && NIL != cycl_variables.el_varP(value)) {
                binding = bindings.make_variable_binding(value, variable);
            }
            new_bindings = cons(binding, new_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 13400L)
    public static SubLObject transformation_link_motivated_residual_transformation_links(SubLObject transformation_link) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject rt_links = NIL;
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link_var;
        SubLObject jo_link_var_$1;
        SubLObject motivating_conjunction_problem;
        SubLObject set_contents_var_$2;
        SubLObject basis_object_$3;
        SubLObject state_$4;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link_var = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, jo_link_var) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED)) {
                jo_link_var_$1 = jo_link_var;
                motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$1);
                set_contents_var_$2 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                for (basis_object_$3 = set_contents.do_set_contents_basis_object(set_contents_var_$2), state_$4 = NIL, state_$4 = set_contents.do_set_contents_initial_state(basis_object_$3, set_contents_var_$2); NIL == set_contents.do_set_contents_doneP(basis_object_$3,
                        state_$4); state_$4 = set_contents.do_set_contents_update_state(state_$4)) {
                    rt_link = set_contents.do_set_contents_next(basis_object_$3, state_$4);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$4, rt_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)
                            && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$1)
                            && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, transformation_link)) {
                        rt_links = cons(rt_link, rt_links);
                    }
                }
            }
        }
        return Sequences.nreverse(rt_links);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 13800L)
    public static SubLObject transformation_link_motivated_residual_transformation_link_count(SubLObject transformation_link) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject total = ZERO_INTEGER;
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link_var;
        SubLObject jo_link_var_$5;
        SubLObject motivating_conjunction_problem;
        SubLObject set_contents_var_$6;
        SubLObject basis_object_$7;
        SubLObject state_$8;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link_var = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, jo_link_var) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED)) {
                jo_link_var_$5 = jo_link_var;
                motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$5);
                set_contents_var_$6 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                for (basis_object_$7 = set_contents.do_set_contents_basis_object(set_contents_var_$6), state_$8 = NIL, state_$8 = set_contents.do_set_contents_initial_state(basis_object_$7, set_contents_var_$6); NIL == set_contents.do_set_contents_doneP(basis_object_$7,
                        state_$8); state_$8 = set_contents.do_set_contents_update_state(state_$8)) {
                    rt_link = set_contents.do_set_contents_next(basis_object_$7, state_$8);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$8, rt_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)
                            && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$5)
                            && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, transformation_link)) {
                        total = Numbers.add(total, ONE_INTEGER);
                    }
                }
            }
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 14300L)
    public static SubLObject transformation_link_good_motivated_residual_transformation_link_count(SubLObject transformation_link) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject total = ZERO_INTEGER;
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
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
                            && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, transformation_link) && NIL != inference_datastructures_problem_link.problem_link_goodP(rt_link)) {
                        total = Numbers.add(total, ONE_INTEGER);
                    }
                }
            }
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 14800L)
    public static SubLObject with_problem_store_transformation_assumptions(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        store = current.first();
        SubLObject body;
        current = (body = current.rest());
        SubLObject store_var = $sym41$STORE_VAR;
        return listS($sym42$CLET, list(list(store_var, store), $list43, $list44, $list45, list($sym46$_NEGATION_BY_FAILURE_, list($sym47$PROBLEM_STORE_NEGATION_BY_FAILURE_, store_var))), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 15300L)
    public static SubLObject meta_transformation_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(v_object) && NIL != inference_modules.meta_transformation_module_p(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 15600L)
    public static SubLObject add_tactic_to_determine_new_literal_transformation_tactics(SubLObject problem, SubLObject asent, SubLObject sense, SubLObject mt) {
        if (NIL == inference_backchain_forbidden_asentP(asent, mt)) {
            new_meta_transformation_tactic(problem, asent, sense);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16000L)
    public static SubLObject inference_backchain_forbidden_asentP(SubLObject asent, SubLObject mt) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate) && NIL != inference_trampolines.inference_backchain_forbiddenP(predicate, mt)) {
            return T;
        }
        if (NIL != inference_completeness_utilities.inference_complete_asentP(asent, mt)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16300L)
    public static SubLObject new_meta_transformation_tactic(SubLObject problem, SubLObject asent, SubLObject sense) {
        SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $determine_new_transformation_tactics_module$.getGlobalValue(), UNPROVIDED);
        SubLObject productivity = ZERO_INTEGER;
        inference_datastructures_tactic.set_tactic_completeness(tactic, $GROSSLY_INCOMPLETE);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$13 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$13, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$13);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$14 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$14)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$14);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16800L)
    public static SubLObject compute_strategic_properties_of_meta_transformation_tactic(SubLObject tactic, SubLObject strategy) {
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17000L)
    public static SubLObject transformation_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_link.problem_link_p(v_object) && $TRANSFORMATION == inference_datastructures_problem_link.problem_link_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17100L)
    public static SubLObject transformation_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(tactic) && $TRANSFORMATION == inference_datastructures_tactic.tactic_type(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17300L)
    public static SubLObject transformation_tactic_rule(SubLObject transformation_tactic) {
        return inference_datastructures_tactic.tactic_data(transformation_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17500L)
    public static SubLObject transformation_rule_tactic_p(SubLObject v_object) {
        if (NIL != transformation_tactic_p(v_object)) {
            return list_utilities.sublisp_boolean(transformation_tactic_rule(v_object));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17700L)
    public static SubLObject transformation_generator_tactic_p(SubLObject v_object) {
        if (NIL != transformation_tactic_p(v_object)) {
            return Types.sublisp_null(transformation_tactic_rule(v_object));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17900L)
    public static SubLObject transformation_generator_tactic_lookahead_rule(SubLObject transformation_generator_tactic) {
        assert NIL != transformation_generator_tactic_p(transformation_generator_tactic) : transformation_generator_tactic;
        SubLObject iterator = inference_datastructures_tactic.tactic_progress_iterator(transformation_generator_tactic);
        if (NIL != iteration.iterator_p(iterator)) {
            SubLObject state = iteration.iteration_state_peek(iterator);
            if (state.isList()) {
                SubLObject rules = state.first();
                if (rules.isList()) {
                    SubLObject rule = rules.first();
                    if (NIL != assertion_handles.assertion_p(rule)) {
                        return rule;
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 18500L)
    public static SubLObject transformation_tactic_lookahead_rule(SubLObject transformation_tactic) {
        SubLObject rule = transformation_tactic_rule(transformation_tactic);
        if (NIL == rule) {
            rule = transformation_generator_tactic_lookahead_rule(transformation_tactic);
        }
        return rule;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 18900L)
    public static SubLObject transformation_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(v_object) && NIL != transformation_link_p(inference_datastructures_proof.proof_link(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19000L)
    public static SubLObject transformation_proof_rule_assertion(SubLObject proof) {
        assert NIL != transformation_proof_p(proof) : proof;
        return inference_datastructures_proof.proof_supports(proof).first();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19200L)
    public static SubLObject transformation_proof_additional_supports(SubLObject proof) {
        assert NIL != transformation_proof_p(proof) : proof;
        return inference_datastructures_proof.proof_supports(proof).rest();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19300L)
    public static SubLObject transformation_proof_subproof(SubLObject proof) {
        assert NIL != transformation_proof_p(proof) : proof;
        return inference_datastructures_proof.proof_first_subproof(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19500L)
    public static SubLObject generalized_transformation_link_p(SubLObject v_object) {
        return makeBoolean(NIL != transformation_link_p(v_object) || NIL != inference_worker_residual_transformation.residual_transformation_link_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19700L)
    public static SubLObject generalized_transformation_link_rule_assertion(SubLObject link) {
        if (NIL != transformation_link_p(link)) {
            return transformation_link_rule_assertion(link);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            return inference_worker_residual_transformation.residual_transformation_link_rule_assertion(link);
        }
        return Errors.error($str54$generalized_transformation_link_o, link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 20000L)
    public static SubLObject generalized_transformation_link_unaffected_by_exceptionsP(SubLObject link) {
        return makeBoolean(NIL == abnormal.rule_has_exceptionsP(generalized_transformation_link_rule_assertion(link)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 20200L)
    public static SubLObject generalized_transformation_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(v_object) && NIL != generalized_transformation_link_p(inference_datastructures_proof.proof_link(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 20400L)
    public static SubLObject generalized_transformation_proof_rule_assertion(SubLObject proof) {
        if (NIL != transformation_proof_p(proof)) {
            return transformation_proof_rule_assertion(proof);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return inference_worker_residual_transformation.residual_transformation_proof_rule_assertion(proof);
        }
        return Errors.error($str55$generalized_transformation_proof_, proof);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 20700L)
    public static SubLObject generalized_transformation_proof_rule_bindings(SubLObject proof) {
        if (NIL != transformation_proof_p(proof)) {
            return transformation_proof_rule_bindings(proof);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return inference_worker_residual_transformation.residual_transformation_proof_rule_bindings(proof);
        }
        return Errors.error($str55$generalized_transformation_proof_, proof);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21100L)
    public static SubLObject generalized_transformation_proof_transformation_link(SubLObject proof) {
        if (NIL != transformation_proof_p(proof)) {
            return inference_datastructures_proof.proof_link(proof);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return inference_worker_residual_transformation.residual_transformation_proof_motivating_transformation_link(proof);
        }
        return Errors.error($str55$generalized_transformation_proof_, proof);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21400L)
    public static SubLObject determine_new_literal_transformation_tactics(SubLObject problem, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_var = inference_datastructures_problem.problem_store(problem);
        SubLObject _prev_bind_0 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
        SubLObject _prev_bind_2 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
        SubLObject _prev_bind_3 = control_vars.$evaluatable_backchain_enabled$.currentBinding(thread);
        SubLObject _prev_bind_4 = control_vars.$negation_by_failure$.currentBinding(thread);
        try {
            control_vars.$hl_failure_backchaining$.bind(T, thread);
            control_vars.$unbound_rule_backchain_enabled$.bind(T, thread);
            control_vars.$evaluatable_backchain_enabled$.bind(T, thread);
            control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
            determine_new_literal_transformation_tactics_int(problem, asent, sense, UNPROVIDED);
        } finally {
            control_vars.$negation_by_failure$.rebind(_prev_bind_4, thread);
            control_vars.$evaluatable_backchain_enabled$.rebind(_prev_bind_3, thread);
            control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_2, thread);
            control_vars.$hl_failure_backchaining$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21700L)
    public static SubLObject determine_new_literal_transformation_tactics_int(SubLObject problem, SubLObject asent, SubLObject sense, SubLObject disabled_modules) {
        if (disabled_modules == UNPROVIDED) {
            disabled_modules = NIL;
        }
        SubLObject cdolist_list_var;
        SubLObject tactic_specs = cdolist_list_var = determine_literal_transformation_tactic_specs(asent, sense, disabled_modules);
        SubLObject tactic_spec = NIL;
        tactic_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = tactic_spec;
            SubLObject hl_module = NIL;
            SubLObject productivity = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
            productivity = current.first();
            current = current.rest();
            if (NIL == current) {
                new_transformation_tactic(problem, hl_module, productivity, NIL);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        }
        return tactic_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 22100L)
    public static SubLObject determine_rules_for_literal_transformation_tactics(SubLObject problem, SubLObject asent, SubLObject hl_module) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (NIL != inference_czer.backchaining_on_ist_enabledP() && NIL != el_utilities.ist_sentence_p(asent, UNPROVIDED) && NIL != variables.fully_bound_p(el_utilities.designated_mt(asent))) {
            mt = el_utilities.designated_mt(asent);
            asent = el_utilities.designated_sentence(asent);
        }
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject candidate_rules = NIL;
            thread.resetMultipleValues();
            SubLObject inference = problem_inference_and_non_continuable_problem_store_private(problem);
            SubLObject non_continuable_private_problem_storeP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != non_continuable_private_problem_storeP && NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference)) {
                SubLObject rules = NIL;
                SubLObject set_var = inference_datastructures_inference.inference_allowed_rules(inference);
                SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject rule;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    rule = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, rule)) {
                        rules = cons(rule, rules);
                    }
                }
                candidate_rules = transformation_modules.sort_rules_via_current_inference_rule_preference(rules);
            } else {
                SubLObject rule_select_method = inference_modules.hl_module_rule_select_func(hl_module);
                if (rule_select_method.isFunctionSpec()) {
                    candidate_rules = Functions.funcall(rule_select_method, asent);
                }
            }
            SubLObject rule_filter_method = inference_modules.hl_module_rule_filter_func(hl_module);
            SubLObject rules2 = NIL;
            if (!rule_filter_method.isFunctionSpec()) {
                rules2 = conses_high.copy_list(candidate_rules);
            } else {
                SubLObject cdolist_list_var = candidate_rules;
                SubLObject rule2 = NIL;
                rule2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != Functions.funcall(rule_filter_method, asent, rule2)) {
                        rules2 = cons(rule2, rules2);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rule2 = cdolist_list_var.first();
                }
                rules2 = Sequences.nreverse(rules2);
            }
            rules2 = Sequences.delete_if(Symbols.symbol_function($sym57$INFERENCE_EXCEPTED_ASSERTION_), rules2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != genl_rules_enabledP()) {
                rules2 = max_rules(rules2, UNPROVIDED);
            }
            return rules2;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 24200L)
    public static SubLObject problem_inference_and_non_continuable_problem_store_private(SubLObject problem) {
        SubLObject problem_store = inference_datastructures_problem.problem_store(problem);
        SubLObject non_continuableP = NIL;
        SubLObject problem_store_privateP = NIL;
        SubLObject inference = NIL;
        if (NIL != inference_datastructures_problem_store.problem_store_has_only_one_inferenceP(problem_store)) {
            inference = inference_datastructures_problem_store.first_problem_store_inference(problem_store);
            problem_store_privateP = inference_datastructures_inference.inference_problem_store_privateP(inference);
            non_continuableP = makeBoolean(NIL == inference_datastructures_inference.inference_continuableP(inference));
        }
        return Values.values(inference, makeBoolean(NIL != problem_store_privateP && NIL != non_continuableP));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 25000L)
    public static SubLObject single_literal_problem_candidate_transformation_tactic_specs(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem.single_literal_problem_p(problem) : problem;
        SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        SubLObject sense = inference_datastructures_problem.single_literal_problem_sense(problem);
        SubLObject tactic_specs = NIL;
        SubLObject store_var = inference_datastructures_problem.problem_store(problem);
        SubLObject _prev_bind_0 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
        SubLObject _prev_bind_2 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
        SubLObject _prev_bind_3 = control_vars.$evaluatable_backchain_enabled$.currentBinding(thread);
        SubLObject _prev_bind_4 = control_vars.$negation_by_failure$.currentBinding(thread);
        try {
            control_vars.$hl_failure_backchaining$.bind(T, thread);
            control_vars.$unbound_rule_backchain_enabled$.bind(T, thread);
            control_vars.$evaluatable_backchain_enabled$.bind(T, thread);
            control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
            tactic_specs = determine_literal_transformation_tactic_specs(asent, sense, NIL);
        } finally {
            control_vars.$negation_by_failure$.rebind(_prev_bind_4, thread);
            control_vars.$evaluatable_backchain_enabled$.rebind(_prev_bind_3, thread);
            control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_2, thread);
            control_vars.$hl_failure_backchaining$.rebind(_prev_bind_0, thread);
        }
        return tactic_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 25500L)
    public static SubLObject determine_literal_transformation_tactic_specs(SubLObject asent, SubLObject sense, SubLObject disabled_modules) {
        return determine_literal_transformation_tactic_specs_int(asent, sense, disabled_modules, $TACTIC_SPECS);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 25800L)
    public static SubLObject determine_literal_transformation_tactic_specs_int(SubLObject asent, SubLObject sense, SubLObject disabled_modules, SubLObject return_type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic_specs = NIL;
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject supplanted_modules = NIL;
        SubLObject exclusive_foundP;
        SubLObject rest;
        SubLObject hl_module;
        SubLObject exclusive_func;
        SubLObject exclusive_foundP_$15;
        SubLObject tactic_specs_$16;
        SubLObject supplanted_modules_$17;
        SubLObject required_func;
        SubLObject cost;
        SubLObject productivity;
        SubLObject tactic_spec;
        for (exclusive_foundP = NIL, rest = NIL, rest = inference_modules.transformation_modules(); NIL == exclusive_foundP && NIL != rest; rest = rest.rest()) {
            hl_module = rest.first();
            if (NIL != inference_modules.hl_module_activeP(hl_module, disabled_modules) && (NIL == supplanted_modules || NIL == conses_high.member(hl_module, supplanted_modules, UNPROVIDED, UNPROVIDED)) && NIL != inference_modules.hl_module_sense_relevant_p(hl_module, sense)
                    && NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, predicate) && NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent) && NIL != inference_modules.hl_module_required_mt_relevantP(hl_module)
                    && NIL != inference_modules.hl_module_direction_relevantP(hl_module)) {
                exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                if (NIL == exclusive_func || (exclusive_func.isFunctionSpec() && NIL != Functions.funcall(exclusive_func, asent))) {
                    if (NIL != exclusive_func) {
                        thread.resetMultipleValues();
                        exclusive_foundP_$15 = inference_worker_removal.update_supplanted_modules_wrt_tactic_specs(hl_module, tactic_specs, supplanted_modules);
                        tactic_specs_$16 = thread.secondMultipleValue();
                        supplanted_modules_$17 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        exclusive_foundP = exclusive_foundP_$15;
                        tactic_specs = tactic_specs_$16;
                        supplanted_modules = supplanted_modules_$17;
                    }
                    required_func = inference_modules.hl_module_required_func(hl_module);
                    if (NIL == required_func || (required_func.isFunctionSpec() && NIL != Functions.funcall(required_func, asent))) {
                        cost = inference_modules.hl_module_asent_cost(hl_module, asent);
                        if (NIL != cost) {
                            productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                            if (return_type.eql($TACTIC_SPECS)) {
                                tactic_spec = list(hl_module, productivity);
                                tactic_specs = cons(tactic_spec, tactic_specs);
                            } else if (return_type.eql($TOTAL_PRODUCTIVITY)) {
                                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, productivity);
                            }
                        }
                    }
                }
            }
        }
        if (return_type.eql($TACTIC_SPECS)) {
            return tactic_specs;
        }
        if (return_type.eql($TOTAL_PRODUCTIVITY)) {
            return total_productivity;
        }
        Errors.error($str62$unexpected_tactic_specs_return_ty, return_type);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 28100L)
    public static SubLObject literal_level_transformation_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != transformation_tactic_p(tactic) && NIL != inference_worker.literal_level_tactic_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 28200L)
    public static SubLObject maybe_new_transformation_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject tactic, SubLObject transformation_bindings, SubLObject rule_assertion, SubLObject more_supports, SubLObject non_explanatory_subquery) {
        SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(supported_problem);
        if (NIL == leviathan.rule_bindings_wff_cachedP(rule_assertion, transformation_bindings, mt)) {
            Errors.warn($str63$pruning__s__s__s, rule_assertion, mt, transformation_bindings);
            return NIL;
        }
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        SubLObject transformation_link = new_transformation_link(supported_problem, supporting_mapped_problem, hl_module, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
        SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        inference_datastructures_problem_store.problem_store_note_transformation_rule_considered(store, rule_assertion);
        inference_worker_residual_transformation.maybe_possibly_add_residual_transformation_links_via_transformation_link(transformation_link);
        if (NIL != supporting_mapped_problem) {
            recompute_thrown_away_due_to_new_transformation_link(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
        }
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 29500L)
    public static SubLObject recompute_thrown_away_due_to_new_transformation_link(SubLObject problem) {
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$18 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$18, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$18);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                SubLObject cdolist_list_var;
                SubLObject sibling_tactic;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
                                    if (NIL != abductive_tactician.abductive_strategy_p(strategy)) {
                                        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                                        sibling_tactic = NIL;
                                        sibling_tactic = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            inference_datastructures_strategy.set_tactic_recompute_thrown_away(sibling_tactic, strategy);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            sibling_tactic = cdolist_list_var.first();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$19 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$19)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$19);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            SubLObject cdolist_list_var2;
                            SubLObject sibling_tactic2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy2);
                                    if (NIL != abductive_tactician.abductive_strategy_p(strategy2)) {
                                        cdolist_list_var2 = inference_datastructures_problem.problem_tactics(problem);
                                        sibling_tactic2 = NIL;
                                        sibling_tactic2 = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            inference_datastructures_strategy.set_tactic_recompute_thrown_away(sibling_tactic2, strategy2);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            sibling_tactic2 = cdolist_list_var2.first();
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 29800L)
    public static SubLObject new_transformation_tactic(SubLObject problem, SubLObject hl_module, SubLObject productivity, SubLObject rule) {
        SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, rule);
        SubLObject completeness = $GROSSLY_INCOMPLETE;
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$20 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$21 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$21)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$21);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 30200L)
    public static SubLObject compute_strategic_properties_of_transformation_tactic(SubLObject tactic, SubLObject strategy) {
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 30400L)
    public static SubLObject with_transformation_tactic_execution_assumptions(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list64);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject tactic = NIL;
        SubLObject mt = NIL;
        SubLObject sense = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list64);
        tactic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list64);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list64);
        sense = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject tactic_var = $sym65$TACTIC_VAR;
            return ConsesLow.list($sym42$CLET, list(list(tactic_var, tactic)), ConsesLow.list($sym66$WITH_INFERENCE_MT_RELEVANCE, mt,
                    list($sym42$CLET, list(list($sym67$_INFERENCE_EXPAND_HL_MODULE_, list($sym68$TACTIC_HL_MODULE, tactic_var)), list($sym69$_INFERENCE_EXPAND_SENSE_, sense)), listS($sym70$WITH_PROBLEM_STORE_TRANSFORMATION_ASSUMPTIONS, list($sym71$TACTIC_STORE, tactic_var), append(body, NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 31000L)
    public static SubLObject execute_literal_level_transformation_tactic(SubLObject tactic, SubLObject mt, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        SubLObject _prev_bind_4 = backward.$inference_expand_hl_module$.currentBinding(thread);
        SubLObject _prev_bind_5 = backward.$inference_expand_sense$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(tactic), thread);
            backward.$inference_expand_sense$.bind(sense, thread);
            SubLObject store_var = inference_datastructures_tactic.tactic_store(tactic);
            SubLObject _prev_bind_0_$22 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
            SubLObject _prev_bind_1_$23 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
            SubLObject _prev_bind_2_$24 = control_vars.$evaluatable_backchain_enabled$.currentBinding(thread);
            SubLObject _prev_bind_3_$25 = control_vars.$negation_by_failure$.currentBinding(thread);
            try {
                control_vars.$hl_failure_backchaining$.bind(T, thread);
                control_vars.$unbound_rule_backchain_enabled$.bind(T, thread);
                control_vars.$evaluatable_backchain_enabled$.bind(T, thread);
                control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                    inference_datastructures_tactic.tactic_in_progress_next(tactic);
                } else {
                    SubLObject progress_iterator = maybe_make_transformation_tactic_progress_iterator(tactic, asent, sense);
                    if (NIL != progress_iterator) {
                        if (progress_iterator.isList()) {
                            SubLObject cdolist_list_var = progress_iterator;
                            SubLObject rule = NIL;
                            rule = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                handle_one_transformation_tactic_rule_select_result(tactic, rule);
                                cdolist_list_var = cdolist_list_var.rest();
                                rule = cdolist_list_var.first();
                            }
                        } else {
                            inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                        }
                    }
                }
            } finally {
                control_vars.$negation_by_failure$.rebind(_prev_bind_3_$25, thread);
                control_vars.$evaluatable_backchain_enabled$.rebind(_prev_bind_2_$24, thread);
                control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_1_$23, thread);
                control_vars.$hl_failure_backchaining$.rebind(_prev_bind_0_$22, thread);
            }
        } finally {
            backward.$inference_expand_sense$.rebind(_prev_bind_5, thread);
            backward.$inference_expand_hl_module$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 31900L)
    public static SubLObject maybe_make_transformation_tactic_progress_iterator(SubLObject tactic, SubLObject asent, SubLObject sense) {
        if (NIL != meta_transformation_tactic_p(tactic)) {
            return maybe_make_meta_transformation_progress_iterator(tactic, asent, sense);
        }
        if (NIL == transformation_tactic_rule(tactic)) {
            return maybe_make_transformation_rule_select_progress_iterator(tactic, asent);
        }
        return maybe_make_transformation_expand_progress_iterator(tactic, asent);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 32400L)
    public static SubLObject maybe_make_meta_transformation_progress_iterator(SubLObject tactic, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = inference_datastructures_tactic.tactic_hl_module_name(tactic);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && name != $DETERMINE_NEW_TRANSFORMATION_TACTICS) {
            Errors.error($str72$time_to_add_meta_transformation_s, name);
        }
        SubLObject progress_iterator = NIL;
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject cdolist_list_var;
        SubLObject tactic_specs = cdolist_list_var = determine_literal_transformation_tactic_specs(asent, sense, NIL);
        SubLObject tactic_spec = NIL;
        tactic_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = tactic_spec;
            SubLObject hl_module = NIL;
            SubLObject productivity = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
            productivity = current.first();
            current = current.rest();
            if (NIL == current) {
                new_transformation_tactic(problem, hl_module, productivity, NIL);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        }
        return progress_iterator;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 33600L)
    public static SubLObject maybe_make_transformation_rule_select_progress_iterator(SubLObject tactic, SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = NIL;
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        rules = determine_rules_for_literal_transformation_tactics(problem, asent, hl_module);
        SubLObject old_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
        SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(Sequences.length(rules));
        inference_datastructures_tactic.set_tactic_productivity(tactic, new_productivity, NIL);
        if (NIL != list_utilities.lengthGE(rules, $transformation_tactic_iteration_threshold$.getDynamicValue(thread), UNPROVIDED)) {
            rules = new_transformation_rule_select_progress_iterator(tactic, rules);
        }
        return rules;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 34600L)
    public static SubLObject new_transformation_rule_select_progress_iterator(SubLObject tactic, SubLObject tactic_specs) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($TRANSFORMATION_RULE_SELECT, tactic, tactic_specs);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 34800L)
    public static SubLObject handle_one_transformation_tactic_rule_select_result(SubLObject transformation_tactic, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject existing_rule = transformation_tactic_rule(transformation_tactic);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != existing_rule) {
            Errors.error($str74$transformation_tactic__S_already_, transformation_tactic, existing_rule);
        }
        SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(transformation_tactic);
        SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(ONE_INTEGER);
        inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(transformation_tactic, UNPROVIDED);
        return new_transformation_tactic(problem, hl_module, productivity, rule);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 35500L)
    public static SubLObject maybe_make_transformation_expand_progress_iterator(SubLObject tactic, SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject progress_iterator = NIL;
        SubLObject _prev_bind_0 = backward.$transformation_add_node_method$.currentBinding(thread);
        try {
            backward.$transformation_add_node_method$.bind($sym75$HANDLE_TRANSFORMATION_ADD_NODE_FOR_EXPAND_RESULTS, thread);
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            SubLObject rule = transformation_tactic_rule(tactic);
            SubLObject expand_method = inference_modules.hl_module_expand_func(hl_module);
            if (expand_method.isFunctionSpec()) {
                Functions.funcall(expand_method, asent, rule);
            }
        } finally {
            backward.$transformation_add_node_method$.rebind(_prev_bind_0, thread);
        }
        return progress_iterator;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 36300L)
    public static SubLObject handle_transformation_add_node_for_expand_results(SubLObject rule_assertion, SubLObject rule_pivot_asent, SubLObject rule_pivot_sense, SubLObject unification_bindings, SubLObject unification_dependent_dnf, SubLObject more_supports) {
        SubLThread thread = SubLProcess.currentSubLThread();
        unification_bindings = bindings.inference_simplify_unification_bindings(unification_bindings);
        unification_bindings = bindings.possibly_optimize_bindings_wrt_equivalence(unification_bindings);
        if (NIL != $stitch_up_bindings_loopP$.getDynamicValue(thread)) {
            unification_bindings = bindings.possibly_stitch_up_bindings_loop(unification_bindings);
        }
        SubLObject tactic = inference_worker.currently_executing_tactic();
        SubLObject unification_explanatory_dnf = el_utilities.copy_clause(unification_dependent_dnf);
        if (NIL != rule_assertion_has_some_pragmatic_requirementP(rule_assertion, NIL)) {
            SubLObject pragmatic_requirements_dnf = backward_rule_pragmatic_dnf(rule_assertion, NIL);
            unification_dependent_dnf = nmerge_dnf(unification_dependent_dnf, pragmatic_requirements_dnf);
        }
        if (NIL != rule_assertion_worth_adding_type_constraintsP(rule_assertion)) {
            SubLObject type_constraint_dnf = inference_trampolines.inference_rule_type_constraints(rule_assertion);
            unification_dependent_dnf = nmerge_dnf(unification_dependent_dnf, type_constraint_dnf);
        }
        SubLObject dont_care_constraints = transformation_additional_dont_care_constraints(rule_pivot_asent, unification_dependent_dnf, rule_assertion, unification_bindings);
        if (NIL != dont_care_constraints) {
            SubLObject dont_care_dnf = clauses.make_dnf(NIL, dont_care_constraints);
            unification_dependent_dnf = nmerge_dnf(unification_dependent_dnf, dont_care_dnf);
        }
        SubLObject unrestricted_transformation_dependent_dnf = unification_dependent_dnf_to_transformation_dependent_dnf(unification_dependent_dnf);
        SubLObject unrestricted_transformation_explanatory_dnf = unification_dependent_dnf_to_transformation_dependent_dnf(unification_explanatory_dnf);
        SubLObject transformation_bindings = unification_bindings_to_transformation_bindings(unification_bindings);
        return complete_execution_of_transformation_tactic(tactic, transformation_bindings, rule_assertion, more_supports, unrestricted_transformation_dependent_dnf, unrestricted_transformation_explanatory_dnf);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 39000L)
    public static SubLObject rule_assertion_worth_adding_type_constraintsP(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $inference_transformation_type_checking_enabledP$.getDynamicValue(thread)) {
            return NIL;
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 39300L)
    public static SubLObject transformation_additional_dont_care_constraints(SubLObject rule_pivot_asent, SubLObject unification_dependent_dnf, SubLObject rule_assertion, SubLObject unification_bindings) {
        SubLObject source_var_pos_lits = backward_utilities.additional_source_variable_pos_lits(rule_pivot_asent, unification_dependent_dnf, rule_assertion);
        SubLObject dont_care_constraints = NIL;
        SubLObject cdolist_list_var = source_var_pos_lits;
        SubLObject source_var_pos_lit = NIL;
        source_var_pos_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject substituted_pos_lit = bindings.apply_bindings(unification_bindings, source_var_pos_lit);
            if (NIL == variables.fully_bound_p(substituted_pos_lit)) {
                dont_care_constraints = cons(source_var_pos_lit, dont_care_constraints);
            }
            cdolist_list_var = cdolist_list_var.rest();
            source_var_pos_lit = cdolist_list_var.first();
        }
        return Sequences.nreverse(dont_care_constraints);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 39900L)
    public static SubLObject nmerge_dnf(SubLObject existing_dnf, SubLObject added_dnf) {
        return clauses.make_dnf(append(clauses.neg_lits(existing_dnf), clauses.neg_lits(added_dnf)), append(clauses.pos_lits(existing_dnf), clauses.pos_lits(added_dnf)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 40300L)
    public static SubLObject merge_dnf(SubLObject dnf1, SubLObject dnf2) {
        return nmerge_dnf(el_utilities.copy_clause(dnf1), dnf2);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 40400L)
    public static SubLObject complete_execution_of_transformation_tactic(SubLObject tactic, SubLObject transformation_bindings, SubLObject rule_assertion, SubLObject more_supports, SubLObject unrestricted_transformation_dependent_dnf, SubLObject unrestricted_transformation_explanatory_dnf) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        SubLObject restricted_transformation_dependent_dnf = bindings.apply_bindings(transformation_bindings, unrestricted_transformation_dependent_dnf);
        SubLObject supporting_mapped_problem = NIL;
        if (NIL == clauses.empty_clauseP(restricted_transformation_dependent_dnf)) {
            SubLObject dependent_query = inference_czer.dnf_and_mt_to_hl_query(restricted_transformation_dependent_dnf, mt_relevance_macros.$mt$.getDynamicValue(thread));
            SubLObject abduction_allowedP = inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem.problem_store(inference_datastructures_tactic.tactic_problem(tactic)));
            if (NIL == potentially_wf_transformation_dependent_query(dependent_query, abduction_allowedP)) {
                return NIL;
            }
            SubLObject dependent_query_free_hl_vars = variables.sort_hl_variable_list_memoized(conses_high.intersection(cycl_utilities.expression_gather(dependent_query, $sym76$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED),
                    cycl_utilities.expression_gather(bindings.apply_bindings(transformation_bindings, inference_datastructures_problem.problem_free_hl_vars(inference_datastructures_tactic.tactic_problem(tactic))), $sym76$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED,
                    UNPROVIDED));
            supporting_mapped_problem = inference_worker.find_or_create_problem(store, dependent_query, dependent_query_free_hl_vars, UNPROVIDED);
        }
        SubLObject non_explanatory_subquery = compute_transformation_non_explanatory_subquery(unrestricted_transformation_dependent_dnf, unrestricted_transformation_explanatory_dnf, restricted_transformation_dependent_dnf, transformation_bindings, supporting_mapped_problem);
        return maybe_new_transformation_link(supported_problem, supporting_mapped_problem, tactic, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 42200L)
    public static SubLObject compute_transformation_non_explanatory_subquery(SubLObject unrestricted_transformation_dependent_dnf, SubLObject unrestricted_transformation_explanatory_dnf, SubLObject restricted_transformation_dependent_dnf, SubLObject transformation_bindings,
            SubLObject supporting_mapped_problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (unrestricted_transformation_dependent_dnf.equal(unrestricted_transformation_explanatory_dnf)) {
            return NIL;
        }
        SubLObject non_explanatory_dnf = clause_utilities.clause_difference(unrestricted_transformation_dependent_dnf, unrestricted_transformation_explanatory_dnf);
        SubLObject restricted_non_explanatory_dnf = bindings.apply_bindings(transformation_bindings, non_explanatory_dnf);
        SubLObject non_explanatory_query = inference_czer.dnf_and_mt_to_hl_query(restricted_non_explanatory_dnf, mt_relevance_macros.$mt$.getDynamicValue(thread));
        SubLObject non_explanatory_subquery = bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem), non_explanatory_query);
        return non_explanatory_subquery;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 43100L)
    public static SubLObject potentially_wf_transformation_dependent_query(SubLObject dependent_query, SubLObject abduction_allowedP) {
        SubLObject cdolist_list_var = dependent_query;
        SubLObject contextualized_dnf = NIL;
        contextualized_dnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$26 = clauses.neg_lits(contextualized_dnf);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$26.first();
            while (NIL != cdolist_list_var_$26) {
                SubLObject sense = $NEG;
                if (NIL == potentially_wf_restricted_transformation_dependent_asent(contextualized_asent, sense, abduction_allowedP)) {
                    return NIL;
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                contextualized_asent = cdolist_list_var_$26.first();
            }
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$27 = clauses.pos_lits(contextualized_dnf);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$27.first();
            while (NIL != cdolist_list_var_$27) {
                SubLObject sense = $POS;
                if (NIL == potentially_wf_restricted_transformation_dependent_asent(contextualized_asent, sense, abduction_allowedP)) {
                    return NIL;
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                contextualized_asent = cdolist_list_var_$27.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 43500L)
    public static SubLObject potentially_wf_restricted_transformation_dependent_asent(SubLObject contextualized_asent, SubLObject sense, SubLObject abduction_allowedP) {
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list79);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, $list79);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(NIL != syntactically_valid_asent(asent) && (NIL != abduction_allowedP || NIL == cycl_utilities.atomic_sentence_with_pred_p(asent, $$termOfUnit) || NIL != syntactically_valid_contextualized_term_of_unit_asent(asent, sense)));
        }
        cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, $list79);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 44000L)
    public static SubLObject syntactically_valid_asent(SubLObject asent) {
        return cycl_grammar.cycl_atomic_sentence_p(asent);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 44100L)
    public static SubLObject syntactically_valid_contextualized_term_of_unit_asent(SubLObject asent, SubLObject sense) {
        return makeBoolean($POS == sense && NIL != backward.syntactically_valid_term_of_unit_asent(asent));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 44200L)
    public static SubLObject new_transformation_proof(SubLObject transformation_link, SubLObject subproof, SubLObject variable_map) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        if (NIL != subproof && !assertionsDisabledInClass && NIL == inference_datastructures_proof.proof_p(subproof)) {
            throw new AssertionError(subproof);
        }
        SubLObject transformation_bindings = transformation_link_bindings(transformation_link);
        SubLObject supporting_subproof_bindings = (NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : NIL;
        SubLObject subproofs = (NIL != subproof) ? list(subproof) : NIL;
        SubLObject canonical_proof_bindings = compute_canonical_transformation_proof_bindings(variable_map, transformation_bindings, supporting_subproof_bindings);
        return inference_worker.propose_new_proof_with_bindings(transformation_link, canonical_proof_bindings, subproofs);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 45300L)
    public static SubLObject compute_canonical_transformation_proof_bindings(SubLObject t_link_variable_map, SubLObject transformation_bindings, SubLObject supporting_subproof_bindings) {
        SubLObject subproof_bindings = bindings.transfer_variable_map_to_bindings_filtered(t_link_variable_map, supporting_subproof_bindings);
        SubLObject final_combined_bindings = unify_transformation_and_subproof_bindings(transformation_bindings, subproof_bindings);
        SubLObject proof_bindings = extended_supported_problem_bindings_to_supported_problem_bindings(final_combined_bindings);
        SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        return canonical_proof_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 46600L)
    public static SubLObject unification_dependent_dnf_to_transformation_dependent_dnf(SubLObject unification_dependent_dnf) {
        return unification.variable_base_inversion(unification_dependent_dnf);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 46800L)
    public static SubLObject unification_bindings_to_transformation_bindings(SubLObject unification_bindings) {
        SubLObject swapped_unification_bindings = swap_variable_spaces_of_unification_bindings(unification_bindings);
        SubLObject bindings_to_closed = bindings.bindings_to_closed(swapped_unification_bindings);
        if (NIL != bindings_to_closed) {
            SubLObject transformation_bindings = NIL;
            SubLObject cdolist_list_var = swapped_unification_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject old_value = bindings.variable_binding_value(binding);
                SubLObject new_value = bindings.apply_bindings(bindings_to_closed, old_value);
                transformation_bindings = cons(bindings.make_variable_binding(bindings.variable_binding_variable(binding), new_value), transformation_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
            swapped_unification_bindings = Sequences.nreverse(transformation_bindings);
        }
        return swapped_unification_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 47900L)
    public static SubLObject swap_variable_spaces_of_unification_bindings(SubLObject unification_bindings) {
        return unification.variable_base_inversion(unification_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 48200L)
    public static SubLObject transformation_proof_rule_bindings(SubLObject transformation_proof) {
        assert NIL != transformation_proof_p(transformation_proof) : transformation_proof;
        SubLObject transformation_link = inference_datastructures_proof.proof_link(transformation_proof);
        SubLObject subproof = transformation_proof_subproof(transformation_proof);
        SubLObject supporting_subproof_bindings = (NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : NIL;
        SubLObject rule_bindings = compute_transformation_link_rule_bindings(transformation_link, supporting_subproof_bindings);
        return rule_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 49000L)
    public static SubLObject compute_transformation_link_rule_bindings(SubLObject transformation_link, SubLObject supporting_subproof_bindings) {
        assert NIL != transformation_link_p(transformation_link) : transformation_link;
        assert NIL != bindings.bindings_p(supporting_subproof_bindings) : supporting_subproof_bindings;
        SubLObject t_link_variable_map = transformation_link_supporting_variable_map(transformation_link);
        SubLObject transformation_bindings = transformation_link_bindings(transformation_link);
        SubLObject subproof_bindings = bindings.transfer_variable_map_to_bindings_filtered(t_link_variable_map, supporting_subproof_bindings);
        SubLObject final_combined_bindings = unify_transformation_and_subproof_bindings(transformation_bindings, subproof_bindings);
        SubLObject rule_bindings = extended_supported_problem_bindings_to_rule_bindings(final_combined_bindings);
        return rule_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 50400L)
    public static SubLObject transformation_proof_rule_el_bindings(SubLObject transformation_proof) {
        assert NIL != transformation_proof_p(transformation_proof) : transformation_proof;
        SubLObject rule_assertion = transformation_proof_rule_assertion(transformation_proof);
        SubLObject variable_map = rule_assertion_variable_map(rule_assertion);
        SubLObject rule_bindings = transformation_proof_rule_bindings(transformation_proof);
        SubLObject rule_el_bindings = bindings.transfer_variable_map_to_bindings_backwards(variable_map, rule_bindings);
        return rule_el_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 51200L)
    public static SubLObject transformation_proof_el_bindings(SubLObject transformation_proof) {
        SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(transformation_proof);
        SubLObject transformation_link = inference_datastructures_proof.proof_link(transformation_proof);
        SubLObject transformation_bindings = transformation_link_bindings(transformation_link);
        SubLObject hl_bindings = bindings.apply_bindings(transformation_bindings, proof_bindings);
        SubLObject rule_assertion = transformation_proof_rule_assertion(transformation_proof);
        SubLObject rule_variable_map = rule_assertion_variable_map(rule_assertion);
        return bindings.transfer_variable_map_to_bindings_backwards(rule_variable_map, hl_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 52100L)
    public static SubLObject unify_transformation_and_subproof_bindings(SubLObject transformation_bindings, SubLObject subproof_bindings) {
        SubLObject combined_bindings = append(subproof_bindings, transformation_bindings);
        if (NIL != inference_worker.all_bindings_ground_outP(combined_bindings)) {
            return combined_bindings;
        }
        SubLObject new_unified_bindings = inference_worker.unify_all_equal_bindings(combined_bindings);
        SubLObject recombined_bindings = append(new_unified_bindings, combined_bindings);
        SubLObject final_bindings = NIL;
        SubLObject working_bindings = NIL;
        SubLObject cdolist_list_var = recombined_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_worker.binding_ground_outP(binding)) {
                final_bindings = cons(binding, final_bindings);
            } else {
                working_bindings = cons(binding, working_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        final_bindings = Sequences.nreverse(final_bindings);
        working_bindings = Sequences.nreverse(working_bindings);
        if (NIL == final_bindings) {
            Errors.error($str83$Could_not_ground_out__s_and__s, transformation_bindings, subproof_bindings);
        }
        SubLObject substituted_bindings = bindings.apply_bindings_to_values(final_bindings, working_bindings);
        if (transformation_bindings.equal(substituted_bindings) && subproof_bindings.equal(final_bindings)) {
            Errors.error($str84$Could_not_unify_transformation_bi, transformation_bindings, subproof_bindings);
        }
        return unify_transformation_and_subproof_bindings(substituted_bindings, final_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 54200L)
    public static SubLObject extended_supported_problem_bindings_to_supported_problem_bindings(SubLObject extended_supported_problem_bindings) {
        SubLObject supported_problem_bindings = NIL;
        SubLObject cdolist_list_var = extended_supported_problem_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject variable = bindings.variable_binding_variable(binding);
            if (NIL != supported_problem_variable_p(variable)) {
                supported_problem_bindings = cons(binding, supported_problem_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(supported_problem_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 55200L)
    public static SubLObject supported_problem_variable_p(SubLObject variable) {
        return unification.base_variable_p(variable);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 55300L)
    public static SubLObject extended_supported_problem_bindings_to_rule_bindings(SubLObject extended_supported_problem_bindings) {
        SubLObject rule_bindings = NIL;
        SubLObject cdolist_list_var = extended_supported_problem_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject variable = bindings.variable_binding_variable(binding);
            if (NIL != rule_assertion_variable_p(variable)) {
                rule_bindings = cons(binding, rule_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(rule_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 56200L)
    public static SubLObject rule_assertion_variable_p(SubLObject variable) {
        return unification.non_base_variable_p(variable);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 56300L)
    public static SubLObject rule_assertion_variable_map(SubLObject rule_assertion) {
        assert NIL != assertions_high.rule_assertionP(rule_assertion) : rule_assertion;
        SubLObject variable_names = assertions_high.assertion_variable_names(rule_assertion);
        SubLObject variable_map = NIL;
        SubLObject list_var = NIL;
        SubLObject variable_name = NIL;
        SubLObject variable_number = NIL;
        list_var = variable_names;
        variable_name = list_var.first();
        for (variable_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_name = list_var.first(), variable_number = Numbers.add(ONE_INTEGER, variable_number)) {
            SubLObject hl_variable = unification.variable_non_base_version(variables.find_variable_by_id(variable_number));
            SubLObject el_variable = cycl_variables.make_el_var(variable_name);
            variable_map = bindings.add_variable_binding(el_variable, hl_variable, variable_map);
        }
        variable_map = Sequences.nreverse(variable_map);
        return variable_map;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 57100L)
    public static SubLObject rule_assertion_base_variable_map(SubLObject rule_assertion) {
        assert NIL != assertions_high.rule_assertionP(rule_assertion) : rule_assertion;
        SubLObject variable_names = assertions_high.assertion_variable_names(rule_assertion);
        SubLObject variable_map = NIL;
        SubLObject list_var = NIL;
        SubLObject variable_name = NIL;
        SubLObject variable_number = NIL;
        list_var = variable_names;
        variable_name = list_var.first();
        for (variable_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_name = list_var.first(), variable_number = Numbers.add(ONE_INTEGER, variable_number)) {
            SubLObject hl_variable = variables.find_variable_by_id(variable_number);
            SubLObject el_variable = cycl_variables.make_el_var(variable_name);
            variable_map = bindings.add_variable_binding(el_variable, hl_variable, variable_map);
        }
        variable_map = Sequences.nreverse(variable_map);
        return variable_map;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 57800L)
    public static SubLObject rule_assertion_has_some_pragmatic_requirementP(SubLObject rule_assertion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule_assertion) : rule_assertion;
        SubLObject v_answer = NIL;
        SubLObject mt_var = mt;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = Numbers.plusp(kb_indexing.relevant_num_pragma_rule_index(rule_assertion));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 58400L)
    public static SubLObject backward_rule_pragmatic_dnf(SubLObject rule_assertion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return forward.filter_forward_pragmatic_dnf(rule_assertion_pragmatic_requirements_dnf(rule_assertion, mt));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 58600L)
    public static SubLObject forward_rule_pragmatic_dnf(SubLObject rule, SubLObject propagation_mt) {
        SubLObject pragmatics_mt = $$InferencePSC.equal(propagation_mt) ? assertions_high.assertion_mt(rule) : propagation_mt;
        SubLObject pragmatic_dnf = (NIL != rule_assertion_has_some_pragmatic_requirementP(rule, pragmatics_mt)) ? rule_assertion_pragmatic_requirements_dnf(rule, pragmatics_mt) : clauses.empty_clause();
        return pragmatic_dnf;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 59300L)
    public static SubLObject rule_assertion_pragmatic_requirements_dnf(SubLObject rule_assertion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(rule_assertion) : rule_assertion;
        SubLObject dnf = clauses.make_dnf(NIL, NIL);
        SubLObject mt_var = mt;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule_assertion, NIL)) {
                SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule_assertion, NIL);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                            SubLObject done_var_$28 = NIL;
                            SubLObject token_var_$29 = NIL;
                            while (NIL == done_var_$28) {
                                SubLObject pragma_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                SubLObject valid_$30 = makeBoolean(!token_var_$29.eql(pragma_assertion));
                                if (NIL != valid_$30) {
                                    dnf = merge_pragmatic_requirement(rule_assertion, pragma_assertion, dnf);
                                }
                                done_var_$28 = makeBoolean(NIL == valid_$30);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return dnf;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 59700L)
    public static SubLObject forward_rule_non_trigger_literals(SubLObject rule_assertion, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(rule_assertion) : rule_assertion;
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule_assertion, NIL)) {
                SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule_assertion, NIL);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                            SubLObject done_var_$32 = NIL;
                            SubLObject token_var_$33 = NIL;
                            while (NIL == done_var_$32) {
                                SubLObject pragma_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$33);
                                SubLObject valid_$34 = makeBoolean(!token_var_$33.eql(pragma_assertion));
                                if (NIL != valid_$34) {
                                    SubLObject neg_lits = clauses.neg_lits(assertions_high.assertion_cnf(pragma_assertion));
                                    if (NIL != list_utilities.singletonP(neg_lits)) {
                                        SubLObject lit = neg_lits.first();
                                        if (NIL != el_utilities.el_formula_with_operator_p(lit, $$forwardNonTriggerLiteral)) {
                                            SubLObject item_var = el_utilities.literal_arg1(lit, UNPROVIDED);
                                            if (NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                                result = cons(item_var, result);
                                            }
                                        }
                                    }
                                }
                                done_var_$32 = makeBoolean(NIL == valid_$34);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 60200L)
    public static SubLObject forward_rule_trigger_literals(SubLObject rule_assertion, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(rule_assertion) : rule_assertion;
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule_assertion, NIL)) {
                SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule_assertion, NIL);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                            SubLObject done_var_$36 = NIL;
                            SubLObject token_var_$37 = NIL;
                            while (NIL == done_var_$36) {
                                SubLObject pragma_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                SubLObject valid_$38 = makeBoolean(!token_var_$37.eql(pragma_assertion));
                                if (NIL != valid_$38) {
                                    SubLObject neg_lits = clauses.neg_lits(assertions_high.assertion_cnf(pragma_assertion));
                                    if (NIL != list_utilities.singletonP(neg_lits)) {
                                        SubLObject lit = neg_lits.first();
                                        if (NIL != el_utilities.el_formula_with_operator_p(lit, $$forwardTriggerLiteral)) {
                                            SubLObject item_var = el_utilities.literal_arg1(lit, UNPROVIDED);
                                            if (NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                                result = cons(item_var, result);
                                            }
                                        }
                                    }
                                }
                                done_var_$36 = makeBoolean(NIL == valid_$38);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 60700L)
    public static SubLObject merge_pragmatic_requirement(SubLObject rule_assertion, SubLObject pragma_assertion, SubLObject merge_dnf) {
        SubLObject neg_lits = clauses.neg_lits(merge_dnf);
        SubLObject pos_lits = clauses.pos_lits(merge_dnf);
        SubLObject rule_cnf = assertions_high.assertion_cnf(rule_assertion);
        SubLObject pragma_cnf = assertions_high.assertion_cnf(pragma_assertion);
        SubLObject cdolist_list_var = clauses.neg_lits(pragma_cnf);
        SubLObject pragmatic_lit = NIL;
        pragmatic_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var;
            pragmatic_lit = (item_var = compute_pragmatic_literal_for_merge(pragmatic_lit, merge_dnf, rule_cnf));
            if (NIL == conses_high.member(item_var, pos_lits, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                pos_lits = cons(item_var, pos_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pragmatic_lit = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(pragma_cnf);
        pragmatic_lit = NIL;
        pragmatic_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == el_utilities.el_meets_pragmatic_requirement_p(pragmatic_lit)) {
                SubLObject item_var;
                pragmatic_lit = (item_var = compute_pragmatic_literal_for_merge(pragmatic_lit, merge_dnf, rule_cnf));
                if (NIL == conses_high.member(item_var, neg_lits, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                    neg_lits = cons(item_var, neg_lits);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pragmatic_lit = cdolist_list_var.first();
        }
        return clause_utilities.nmake_dnf(neg_lits, pos_lits, merge_dnf);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 61700L)
    public static SubLObject compute_pragmatic_literal_for_merge(SubLObject literal, SubLObject merge_dnf, SubLObject rule_dnf) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = literal;
        SubLObject _prev_bind_0 = $merge_dnf_lambda_var$.currentBinding(thread);
        SubLObject _prev_bind_2 = $rule_dnf_lambda_var$.currentBinding(thread);
        try {
            $merge_dnf_lambda_var$.bind(merge_dnf, thread);
            $rule_dnf_lambda_var$.bind(rule_dnf, thread);
            SubLObject conflicting_hl_var = cycl_utilities.expression_find_if($sym91$HL_VARIABLE_NOT_MENTIONED_IN_RULE_DNF_BUT_MENTIONED_IN_MERGE_DNF, literal, NIL, UNPROVIDED);
            if (NIL != conflicting_hl_var) {
                SubLObject unique_hl_var = czer_utilities.unique_hl_var_wrt_expression(merge_dnf, rule_dnf);
                SubLObject new_literal = cycl_utilities.expression_subst(unique_hl_var, conflicting_hl_var, literal, UNPROVIDED, UNPROVIDED);
                result = compute_pragmatic_literal_for_merge(new_literal, merge_dnf, rule_dnf);
            }
        } finally {
            $rule_dnf_lambda_var$.rebind(_prev_bind_2, thread);
            $merge_dnf_lambda_var$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 62600L)
    public static SubLObject hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != cycl_grammar.hl_variable_p(v_object) && NIL == cycl_utilities.expression_find(v_object, $rule_dnf_lambda_var$.getDynamicValue(thread), NIL, UNPROVIDED, UNPROVIDED)
                && NIL != cycl_utilities.expression_find(v_object, $merge_dnf_lambda_var$.getDynamicValue(thread), NIL, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 62900L)
    public static SubLObject bubble_up_proof_to_transformation_link(SubLObject supporting_proof, SubLObject variable_map, SubLObject transformation_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(transformation_link) : transformation_link;
        thread.resetMultipleValues();
        SubLObject proof = new_transformation_proof(transformation_link, supporting_proof, variable_map);
        SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != newP) {
            inference_worker.bubble_up_proof(proof);
        } else {
            inference_worker.possibly_note_proof_processed(supporting_proof);
        }
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 63400L)
    public static SubLObject transformation_proof_abnormalP_internal(SubLObject transformation_proof) {
        return transformation_proof_abnormal_intP(transformation_proof);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 63400L)
    public static SubLObject transformation_proof_abnormalP(SubLObject transformation_proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return transformation_proof_abnormalP_internal(transformation_proof);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym93$TRANSFORMATION_PROOF_ABNORMAL_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym93$TRANSFORMATION_PROOF_ABNORMAL_, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym93$TRANSFORMATION_PROOF_ABNORMAL_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, transformation_proof, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(transformation_proof_abnormalP_internal(transformation_proof)));
            memoization_state.caching_state_put(caching_state, transformation_proof, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 63600L)
    public static SubLObject transformation_proof_abnormal_intP(SubLObject transformation_proof) {
        assert NIL != transformation_proof_p(transformation_proof) : transformation_proof;
        SubLObject link = inference_datastructures_proof.proof_link(transformation_proof);
        SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        SubLObject rule = transformation_link_rule_assertion(link);
        SubLObject transformation_mt = transformation_link_transformation_mt(link);
        SubLObject rule_bindings = transformation_proof_rule_bindings(transformation_proof);
        return abnormal.rule_bindings_abnormalP(store, rule, rule_bindings, transformation_mt);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 64100L)
    public static SubLObject proof_depends_on_excepted_assertionP(SubLObject proof) {
        SubLObject problem_mt = inference_datastructures_problem.problem_mt(inference_datastructures_proof.proof_supported_problem(proof));
        if (NIL != problem_mt) {
            return supports_contain_excepted_assertion_in_mtP(inference_datastructures_proof.proof_supports(proof), problem_mt, UNPROVIDED);
        }
        return supports_contain_excepted_assertionP(inference_datastructures_proof.proof_supports(proof), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 64500L)
    public static SubLObject supports_contain_excepted_assertionP(SubLObject supports, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = supports;
            SubLObject support = NIL;
            support = csome_list_var.first();
            while (NIL == result && NIL != csome_list_var) {
                if (NIL != assertion_handles.assertion_p(support)) {
                    result = inference_trampolines.inference_excepted_assertionP(support, justifyP);
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 64800L)
    public static SubLObject supports_contain_excepted_assertion_in_mtP(SubLObject supports, SubLObject mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = supports_contain_excepted_assertionP(supports, justifyP);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 65000L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_argnums(SubLObject predicate, SubLObject mt) {
        SubLObject argnums = NIL;
        if (NIL != forts.fort_p(predicate) && NIL != variables.fully_bound_p(mt) && NIL != kb_accessors.some_backchain_forbidden_unless_arg_chosen_assertion_somewhereP(predicate)) {
            argnums = inference_backchain_forbidden_unless_arg_chosen_argnums_memoized(predicate, mt);
        }
        return argnums;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 65700L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_argnums_memoized_internal(SubLObject predicate, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject argnums = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            argnums = kb_accessors.backchain_forbidden_unless_arg_chosen_argnums(predicate, mt);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return argnums;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 65700L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_argnums_memoized(SubLObject predicate, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_backchain_forbidden_unless_arg_chosen_argnums_memoized_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_backchain_forbidden_unless_arg_chosen_argnums_memoized_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 65900L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_asentP(SubLObject asent, SubLObject mt) {
        return inference_backchain_forbidden_unless_arg_chosen_asent_variables_int(asent, mt, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 66200L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_asent_variables(SubLObject asent, SubLObject mt) {
        return inference_backchain_forbidden_unless_arg_chosen_asent_variables_int(asent, mt, T);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 66500L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_asent_variables_int(SubLObject asent, SubLObject mt, SubLObject justifyP) {
        SubLObject v_variables = NIL;
        if (NIL == variables.fully_bound_p(asent)) {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject argnums = inference_backchain_forbidden_unless_arg_chosen_argnums(predicate, mt);
            if (NIL != argnums) {
                SubLObject argnum = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = Numbers.add(argnum, ONE_INTEGER);
                    if (NIL != subl_promotions.memberP(argnum, argnums, Symbols.symbol_function(EQL), UNPROVIDED) && NIL == variables.fully_bound_p(arg)) {
                        if (NIL == justifyP) {
                            return T;
                        }
                        SubLObject cdolist_list_var_$40 = variables.gather_hl_variables(arg);
                        SubLObject variable = NIL;
                        variable = cdolist_list_var_$40.first();
                        while (NIL != cdolist_list_var_$40) {
                            SubLObject item_var = variable;
                            if (NIL == conses_high.member(item_var, v_variables, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                v_variables = cons(item_var, v_variables);
                            }
                            cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                            variable = cdolist_list_var_$40.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                v_variables = Sort.sort(v_variables, Symbols.symbol_function($sym96$_), Symbols.symbol_function($sym97$VARIABLE_ID));
            }
        }
        return v_variables;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 67500L)
    public static SubLObject genl_rules_enabledP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $genl_rules_enabledP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 67600L)
    public static SubLObject genl_rules(SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return gt_methods.gt_superiors($$genlRules, rule, mt);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 67700L)
    public static SubLObject max_rules(SubLObject rules, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == constant_handles.valid_constantP($$genlRules, UNPROVIDED)) {
            return rules;
        }
        SubLObject any_relevant_genl_rules_assertionsP = NIL;
        if (NIL == any_relevant_genl_rules_assertionsP) {
            SubLObject csome_list_var = rules;
            SubLObject rule = NIL;
            rule = csome_list_var.first();
            while (NIL == any_relevant_genl_rules_assertionsP && NIL != csome_list_var) {
                if (NIL != somewhere_cache.some_pred_assertion_somewhereP($$genlRules, rule, ONE_INTEGER, UNPROVIDED)) {
                    any_relevant_genl_rules_assertionsP = T;
                }
                csome_list_var = csome_list_var.rest();
                rule = csome_list_var.first();
            }
        }
        if (NIL == any_relevant_genl_rules_assertionsP) {
            return rules;
        }
        return gt_methods.gt_max_nodes($$genlRules, rules, mt, UNPROVIDED);
    }

    public static SubLObject declare_inference_worker_transformation_file() {
        declareFunction(myName, "transformation_link_data_print_function_trampoline", "TRANSFORMATION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "transformation_link_data_p", "TRANSFORMATION-LINK-DATA-P", 1, 0, false);
        new $transformation_link_data_p$UnaryFunction();
        declareFunction(myName, "trans_link_data_hl_module", "TRANS-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction(myName, "trans_link_data_bindings", "TRANS-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction(myName, "trans_link_data_supports", "TRANS-LINK-DATA-SUPPORTS", 1, 0, false);
        declareFunction(myName, "trans_link_data_non_explanatory_subquery", "TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction(myName, "_csetf_trans_link_data_hl_module", "_CSETF-TRANS-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction(myName, "_csetf_trans_link_data_bindings", "_CSETF-TRANS-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction(myName, "_csetf_trans_link_data_supports", "_CSETF-TRANS-LINK-DATA-SUPPORTS", 2, 0, false);
        declareFunction(myName, "_csetf_trans_link_data_non_explanatory_subquery", "_CSETF-TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
        declareFunction(myName, "make_transformation_link_data", "MAKE-TRANSFORMATION-LINK-DATA", 0, 1, false);
        declareFunction(myName, "visit_defstruct_transformation_link_data", "VISIT-DEFSTRUCT-TRANSFORMATION-LINK-DATA", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_transformation_link_data_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-LINK-DATA-METHOD", 2, 0, false);
        declareFunction(myName, "new_transformation_link", "NEW-TRANSFORMATION-LINK", 7, 0, false);
        declareFunction(myName, "new_transformation_link_int", "NEW-TRANSFORMATION-LINK-INT", 5, 0, false);
        declareFunction(myName, "new_transformation_link_data", "NEW-TRANSFORMATION-LINK-DATA", 1, 0, false);
        declareFunction(myName, "destroy_transformation_link", "DESTROY-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction(myName, "transformation_link_hl_module", "TRANSFORMATION-LINK-HL-MODULE", 1, 0, false);
        declareFunction(myName, "transformation_link_bindings", "TRANSFORMATION-LINK-BINDINGS", 1, 0, false);
        declareFunction(myName, "transformation_link_supports", "TRANSFORMATION-LINK-SUPPORTS", 1, 0, false);
        declareFunction(myName, "transformation_link_rule_assertion", "TRANSFORMATION-LINK-RULE-ASSERTION", 1, 0, false);
        declareFunction(myName, "transformation_link_more_supports", "TRANSFORMATION-LINK-MORE-SUPPORTS", 1, 0, false);
        declareFunction(myName, "transformation_link_non_explanatory_subquery", "TRANSFORMATION-LINK-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction(myName, "set_transformation_link_hl_module", "SET-TRANSFORMATION-LINK-HL-MODULE", 2, 0, false);
        declareFunction(myName, "set_transformation_link_bindings", "SET-TRANSFORMATION-LINK-BINDINGS", 2, 0, false);
        declareFunction(myName, "set_transformation_link_supports", "SET-TRANSFORMATION-LINK-SUPPORTS", 2, 0, false);
        declareFunction(myName, "set_transformation_link_non_explanatory_subquery", "SET-TRANSFORMATION-LINK-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
        declareFunction(myName, "transformation_link_tactic", "TRANSFORMATION-LINK-TACTIC", 1, 0, false);
        declareFunction(myName, "transformation_link_pragmatic_requirements", "TRANSFORMATION-LINK-PRAGMATIC-REQUIREMENTS", 1, 0, false);
        declareFunction(myName, "transformation_link_supporting_mapped_problem", "TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "transformation_link_supporting_problem", "TRANSFORMATION-LINK-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction(myName, "transformation_link_supporting_variable_map", "TRANSFORMATION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "transformation_link_transformation_mt", "TRANSFORMATION-LINK-TRANSFORMATION-MT", 1, 0, false);
        declareFunction(myName, "transformation_link_supporting_problem_wholly_explanatoryP", "TRANSFORMATION-LINK-SUPPORTING-PROBLEM-WHOLLY-EXPLANATORY?", 1, 0, false);
        declareFunction(myName, "transformed_problem_using_rule", "TRANSFORMED-PROBLEM-USING-RULE", 2, 0, false);
        declareFunction(myName, "transformed_problem_using_rule_and_hl_module", "TRANSFORMED-PROBLEM-USING-RULE-AND-HL-MODULE", 3, 0, false);
        declareFunction(myName, "transformation_link_rule_bindings_to_closed", "TRANSFORMATION-LINK-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
        declareFunction(myName, "transformation_rule_bindings_to_closed", "TRANSFORMATION-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
        declareFunction(myName, "transformation_link_el_bindings", "TRANSFORMATION-LINK-EL-BINDINGS", 1, 0, false);
        declareFunction(myName, "canonicalize_bindings_wrt_el_vars", "CANONICALIZE-BINDINGS-WRT-EL-VARS", 1, 0, false);
        declareFunction(myName, "transformation_link_motivated_residual_transformation_links", "TRANSFORMATION-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
        declareFunction(myName, "transformation_link_motivated_residual_transformation_link_count", "TRANSFORMATION-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
        declareFunction(myName, "transformation_link_good_motivated_residual_transformation_link_count", "TRANSFORMATION-LINK-GOOD-MOTIVATED-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
        declareMacro(me, "with_problem_store_transformation_assumptions", "WITH-PROBLEM-STORE-TRANSFORMATION-ASSUMPTIONS");
        declareFunction(myName, "meta_transformation_tactic_p", "META-TRANSFORMATION-TACTIC-P", 1, 0, false);
        declareFunction(myName, "add_tactic_to_determine_new_literal_transformation_tactics", "ADD-TACTIC-TO-DETERMINE-NEW-LITERAL-TRANSFORMATION-TACTICS", 4, 0, false);
        declareFunction(myName, "inference_backchain_forbidden_asentP", "INFERENCE-BACKCHAIN-FORBIDDEN-ASENT?", 2, 0, false);
        declareFunction(myName, "new_meta_transformation_tactic", "NEW-META-TRANSFORMATION-TACTIC", 3, 0, false);
        declareFunction(myName, "compute_strategic_properties_of_meta_transformation_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-TRANSFORMATION-TACTIC", 2, 0, false);
        declareFunction(myName, "transformation_link_p", "TRANSFORMATION-LINK-P", 1, 0, false);
        declareFunction(myName, "transformation_tactic_p", "TRANSFORMATION-TACTIC-P", 1, 0, false);
        new $transformation_tactic_p$UnaryFunction();
        declareFunction(myName, "transformation_tactic_rule", "TRANSFORMATION-TACTIC-RULE", 1, 0, false);
        declareFunction(myName, "transformation_rule_tactic_p", "TRANSFORMATION-RULE-TACTIC-P", 1, 0, false);
        declareFunction(myName, "transformation_generator_tactic_p", "TRANSFORMATION-GENERATOR-TACTIC-P", 1, 0, false);
        declareFunction(myName, "transformation_generator_tactic_lookahead_rule", "TRANSFORMATION-GENERATOR-TACTIC-LOOKAHEAD-RULE", 1, 0, false);
        declareFunction(myName, "transformation_tactic_lookahead_rule", "TRANSFORMATION-TACTIC-LOOKAHEAD-RULE", 1, 0, false);
        declareFunction(myName, "transformation_proof_p", "TRANSFORMATION-PROOF-P", 1, 0, false);
        declareFunction(myName, "transformation_proof_rule_assertion", "TRANSFORMATION-PROOF-RULE-ASSERTION", 1, 0, false);
        declareFunction(myName, "transformation_proof_additional_supports", "TRANSFORMATION-PROOF-ADDITIONAL-SUPPORTS", 1, 0, false);
        declareFunction(myName, "transformation_proof_subproof", "TRANSFORMATION-PROOF-SUBPROOF", 1, 0, false);
        declareFunction(myName, "generalized_transformation_link_p", "GENERALIZED-TRANSFORMATION-LINK-P", 1, 0, false);
        declareFunction(myName, "generalized_transformation_link_rule_assertion", "GENERALIZED-TRANSFORMATION-LINK-RULE-ASSERTION", 1, 0, false);
        declareFunction(myName, "generalized_transformation_link_unaffected_by_exceptionsP", "GENERALIZED-TRANSFORMATION-LINK-UNAFFECTED-BY-EXCEPTIONS?", 1, 0, false);
        declareFunction(myName, "generalized_transformation_proof_p", "GENERALIZED-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareFunction(myName, "generalized_transformation_proof_rule_assertion", "GENERALIZED-TRANSFORMATION-PROOF-RULE-ASSERTION", 1, 0, false);
        declareFunction(myName, "generalized_transformation_proof_rule_bindings", "GENERALIZED-TRANSFORMATION-PROOF-RULE-BINDINGS", 1, 0, false);
        declareFunction(myName, "generalized_transformation_proof_transformation_link", "GENERALIZED-TRANSFORMATION-PROOF-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction(myName, "determine_new_literal_transformation_tactics", "DETERMINE-NEW-LITERAL-TRANSFORMATION-TACTICS", 3, 0, false);
        declareFunction(myName, "determine_new_literal_transformation_tactics_int", "DETERMINE-NEW-LITERAL-TRANSFORMATION-TACTICS-INT", 3, 1, false);
        declareFunction(myName, "determine_rules_for_literal_transformation_tactics", "DETERMINE-RULES-FOR-LITERAL-TRANSFORMATION-TACTICS", 3, 0, false);
        declareFunction(myName, "problem_inference_and_non_continuable_problem_store_private", "PROBLEM-INFERENCE-AND-NON-CONTINUABLE-PROBLEM-STORE-PRIVATE", 1, 0, false);
        declareFunction(myName, "single_literal_problem_candidate_transformation_tactic_specs", "SINGLE-LITERAL-PROBLEM-CANDIDATE-TRANSFORMATION-TACTIC-SPECS", 1, 0, false);
        declareFunction(myName, "determine_literal_transformation_tactic_specs", "DETERMINE-LITERAL-TRANSFORMATION-TACTIC-SPECS", 3, 0, false);
        declareFunction(myName, "determine_literal_transformation_tactic_specs_int", "DETERMINE-LITERAL-TRANSFORMATION-TACTIC-SPECS-INT", 4, 0, false);
        declareFunction(myName, "literal_level_transformation_tactic_p", "LITERAL-LEVEL-TRANSFORMATION-TACTIC-P", 1, 0, false);
        declareFunction(myName, "maybe_new_transformation_link", "MAYBE-NEW-TRANSFORMATION-LINK", 7, 0, false);
        declareFunction(myName, "recompute_thrown_away_due_to_new_transformation_link", "RECOMPUTE-THROWN-AWAY-DUE-TO-NEW-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction(myName, "new_transformation_tactic", "NEW-TRANSFORMATION-TACTIC", 4, 0, false);
        declareFunction(myName, "compute_strategic_properties_of_transformation_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-TRANSFORMATION-TACTIC", 2, 0, false);
        declareMacro(me, "with_transformation_tactic_execution_assumptions", "WITH-TRANSFORMATION-TACTIC-EXECUTION-ASSUMPTIONS");
        declareFunction(myName, "execute_literal_level_transformation_tactic", "EXECUTE-LITERAL-LEVEL-TRANSFORMATION-TACTIC", 4, 0, false);
        declareFunction(myName, "maybe_make_transformation_tactic_progress_iterator", "MAYBE-MAKE-TRANSFORMATION-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction(myName, "maybe_make_meta_transformation_progress_iterator", "MAYBE-MAKE-META-TRANSFORMATION-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction(myName, "maybe_make_transformation_rule_select_progress_iterator", "MAYBE-MAKE-TRANSFORMATION-RULE-SELECT-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction(myName, "new_transformation_rule_select_progress_iterator", "NEW-TRANSFORMATION-RULE-SELECT-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction(myName, "handle_one_transformation_tactic_rule_select_result", "HANDLE-ONE-TRANSFORMATION-TACTIC-RULE-SELECT-RESULT", 2, 0, false);
        declareFunction(myName, "maybe_make_transformation_expand_progress_iterator", "MAYBE-MAKE-TRANSFORMATION-EXPAND-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction(myName, "handle_transformation_add_node_for_expand_results", "HANDLE-TRANSFORMATION-ADD-NODE-FOR-EXPAND-RESULTS", 6, 0, false);
        declareFunction(myName, "rule_assertion_worth_adding_type_constraintsP", "RULE-ASSERTION-WORTH-ADDING-TYPE-CONSTRAINTS?", 1, 0, false);
        declareFunction(myName, "transformation_additional_dont_care_constraints", "TRANSFORMATION-ADDITIONAL-DONT-CARE-CONSTRAINTS", 4, 0, false);
        declareFunction(myName, "nmerge_dnf", "NMERGE-DNF", 2, 0, false);
        declareFunction(myName, "merge_dnf", "MERGE-DNF", 2, 0, false);
        declareFunction(myName, "complete_execution_of_transformation_tactic", "COMPLETE-EXECUTION-OF-TRANSFORMATION-TACTIC", 6, 0, false);
        declareFunction(myName, "compute_transformation_non_explanatory_subquery", "COMPUTE-TRANSFORMATION-NON-EXPLANATORY-SUBQUERY", 5, 0, false);
        declareFunction(myName, "potentially_wf_transformation_dependent_query", "POTENTIALLY-WF-TRANSFORMATION-DEPENDENT-QUERY", 2, 0, false);
        declareFunction(myName, "potentially_wf_restricted_transformation_dependent_asent", "POTENTIALLY-WF-RESTRICTED-TRANSFORMATION-DEPENDENT-ASENT", 3, 0, false);
        declareFunction(myName, "syntactically_valid_asent", "SYNTACTICALLY-VALID-ASENT", 1, 0, false);
        declareFunction(myName, "syntactically_valid_contextualized_term_of_unit_asent", "SYNTACTICALLY-VALID-CONTEXTUALIZED-TERM-OF-UNIT-ASENT", 2, 0, false);
        declareFunction(myName, "new_transformation_proof", "NEW-TRANSFORMATION-PROOF", 3, 0, false);
        declareFunction(myName, "compute_canonical_transformation_proof_bindings", "COMPUTE-CANONICAL-TRANSFORMATION-PROOF-BINDINGS", 3, 0, false);
        declareFunction(myName, "unification_dependent_dnf_to_transformation_dependent_dnf", "UNIFICATION-DEPENDENT-DNF-TO-TRANSFORMATION-DEPENDENT-DNF", 1, 0, false);
        declareFunction(myName, "unification_bindings_to_transformation_bindings", "UNIFICATION-BINDINGS-TO-TRANSFORMATION-BINDINGS", 1, 0, false);
        declareFunction(myName, "swap_variable_spaces_of_unification_bindings", "SWAP-VARIABLE-SPACES-OF-UNIFICATION-BINDINGS", 1, 0, false);
        declareFunction(myName, "transformation_proof_rule_bindings", "TRANSFORMATION-PROOF-RULE-BINDINGS", 1, 0, false);
        declareFunction(myName, "compute_transformation_link_rule_bindings", "COMPUTE-TRANSFORMATION-LINK-RULE-BINDINGS", 2, 0, false);
        declareFunction(myName, "transformation_proof_rule_el_bindings", "TRANSFORMATION-PROOF-RULE-EL-BINDINGS", 1, 0, false);
        declareFunction(myName, "transformation_proof_el_bindings", "TRANSFORMATION-PROOF-EL-BINDINGS", 1, 0, false);
        declareFunction(myName, "unify_transformation_and_subproof_bindings", "UNIFY-TRANSFORMATION-AND-SUBPROOF-BINDINGS", 2, 0, false);
        declareFunction(myName, "extended_supported_problem_bindings_to_supported_problem_bindings", "EXTENDED-SUPPORTED-PROBLEM-BINDINGS-TO-SUPPORTED-PROBLEM-BINDINGS", 1, 0, false);
        declareFunction(myName, "supported_problem_variable_p", "SUPPORTED-PROBLEM-VARIABLE-P", 1, 0, false);
        declareFunction(myName, "extended_supported_problem_bindings_to_rule_bindings", "EXTENDED-SUPPORTED-PROBLEM-BINDINGS-TO-RULE-BINDINGS", 1, 0, false);
        declareFunction(myName, "rule_assertion_variable_p", "RULE-ASSERTION-VARIABLE-P", 1, 0, false);
        declareFunction(myName, "rule_assertion_variable_map", "RULE-ASSERTION-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "rule_assertion_base_variable_map", "RULE-ASSERTION-BASE-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "rule_assertion_has_some_pragmatic_requirementP", "RULE-ASSERTION-HAS-SOME-PRAGMATIC-REQUIREMENT?", 1, 1, false);
        declareFunction(myName, "backward_rule_pragmatic_dnf", "BACKWARD-RULE-PRAGMATIC-DNF", 1, 1, false);
        declareFunction(myName, "forward_rule_pragmatic_dnf", "FORWARD-RULE-PRAGMATIC-DNF", 2, 0, false);
        declareFunction(myName, "rule_assertion_pragmatic_requirements_dnf", "RULE-ASSERTION-PRAGMATIC-REQUIREMENTS-DNF", 1, 1, false);
        declareFunction(myName, "forward_rule_non_trigger_literals", "FORWARD-RULE-NON-TRIGGER-LITERALS", 2, 0, false);
        declareFunction(myName, "forward_rule_trigger_literals", "FORWARD-RULE-TRIGGER-LITERALS", 2, 0, false);
        declareFunction(myName, "merge_pragmatic_requirement", "MERGE-PRAGMATIC-REQUIREMENT", 3, 0, false);
        declareFunction(myName, "compute_pragmatic_literal_for_merge", "COMPUTE-PRAGMATIC-LITERAL-FOR-MERGE", 3, 0, false);
        declareFunction(myName, "hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf", "HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF", 1, 0, false);
        new $hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf$UnaryFunction();
        declareFunction(myName, "bubble_up_proof_to_transformation_link", "BUBBLE-UP-PROOF-TO-TRANSFORMATION-LINK", 3, 0, false);
        declareFunction(myName, "transformation_proof_abnormalP_internal", "TRANSFORMATION-PROOF-ABNORMAL?-INTERNAL", 1, 0, false);
        declareFunction(myName, "transformation_proof_abnormalP", "TRANSFORMATION-PROOF-ABNORMAL?", 1, 0, false);
        declareFunction(myName, "transformation_proof_abnormal_intP", "TRANSFORMATION-PROOF-ABNORMAL-INT?", 1, 0, false);
        declareFunction(myName, "proof_depends_on_excepted_assertionP", "PROOF-DEPENDS-ON-EXCEPTED-ASSERTION?", 1, 0, false);
        declareFunction(myName, "supports_contain_excepted_assertionP", "SUPPORTS-CONTAIN-EXCEPTED-ASSERTION?", 1, 1, false);
        declareFunction(myName, "supports_contain_excepted_assertion_in_mtP", "SUPPORTS-CONTAIN-EXCEPTED-ASSERTION-IN-MT?", 2, 1, false);
        declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_argnums", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS", 2, 0, false);
        declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_argnums_memoized_internal", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_argnums_memoized", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS-MEMOIZED", 2, 0, false);
        declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_asentP", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT?", 2, 0, false);
        declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_asent_variables", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-VARIABLES", 2, 0, false);
        declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_asent_variables_int", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-VARIABLES-INT", 3, 0, false);
        declareFunction(myName, "genl_rules_enabledP", "GENL-RULES-ENABLED?", 0, 0, false);
        declareFunction(myName, "genl_rules", "GENL-RULES", 1, 1, false);
        declareFunction(myName, "max_rules", "MAX-RULES", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_transformation_file() {
        $dtp_transformation_link_data$ = defconstant("*DTP-TRANSFORMATION-LINK-DATA*", $sym0$TRANSFORMATION_LINK_DATA);
        $determine_new_transformation_tactics_module$ = deflexical("*DETERMINE-NEW-TRANSFORMATION-TACTICS-MODULE*",
                maybeDefault($sym48$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_, $determine_new_transformation_tactics_module$, () -> (inference_modules.inference_meta_transformation_module($DETERMINE_NEW_TRANSFORMATION_TACTICS, UNPROVIDED))));
        $transformation_tactic_iteration_threshold$ = SubLFiles.defparameter("*TRANSFORMATION-TACTIC-ITERATION-THRESHOLD*", TWO_INTEGER);
        $stitch_up_bindings_loopP$ = defparameter("*STITCH-UP-BINDINGS-LOOP?*", T);
        $inference_transformation_type_checking_enabledP$ = SubLFiles.defparameter("*INFERENCE-TRANSFORMATION-TYPE-CHECKING-ENABLED?*", NIL);
        $merge_dnf_lambda_var$ = defparameter("*MERGE-DNF-LAMBDA-VAR*", NIL);
        $rule_dnf_lambda_var$ = defparameter("*RULE-DNF-LAMBDA-VAR*", NIL);
        $genl_rules_enabledP$ = defvar("*GENL-RULES-ENABLED?*", T);
        return NIL;
    }

    public static SubLObject setup_inference_worker_transformation_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_transformation_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$TRANSFORMATION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        Structures.def_csetf($sym9$TRANS_LINK_DATA_HL_MODULE, $sym10$_CSETF_TRANS_LINK_DATA_HL_MODULE);
        Structures.def_csetf($sym11$TRANS_LINK_DATA_BINDINGS, $sym12$_CSETF_TRANS_LINK_DATA_BINDINGS);
        Structures.def_csetf($sym13$TRANS_LINK_DATA_SUPPORTS, $sym14$_CSETF_TRANS_LINK_DATA_SUPPORTS);
        Structures.def_csetf($sym15$TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY, $sym16$_CSETF_TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY);
        Equality.identity($sym0$TRANSFORMATION_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_transformation_link_data$.getGlobalValue(), Symbols.symbol_function($sym26$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_LINK_DATA_METHOD));
        subl_macro_promotions.declare_defglobal($sym48$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_);
        memoization_state.note_memoized_function($sym93$TRANSFORMATION_PROOF_ABNORMAL_);
        memoization_state.note_memoized_function($sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_transformation_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_transformation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_transformation_file();
    }

    static {
        me = new inference_worker_transformation();
        $dtp_transformation_link_data$ = null;
        $determine_new_transformation_tactics_module$ = null;
        $transformation_tactic_iteration_threshold$ = null;
        $stitch_up_bindings_loopP$ = null;
        $inference_transformation_type_checking_enabledP$ = null;
        $merge_dnf_lambda_var$ = null;
        $rule_dnf_lambda_var$ = null;
        $genl_rules_enabledP$ = null;
        $sym0$TRANSFORMATION_LINK_DATA = makeSymbol("TRANSFORMATION-LINK-DATA");
        $sym1$TRANSFORMATION_LINK_DATA_P = makeSymbol("TRANSFORMATION-LINK-DATA-P");
        $list2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"), makeSymbol("NON-EXPLANATORY-SUBQUERY"));
        $list3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"), makeKeyword("NON-EXPLANATORY-SUBQUERY"));
        $list4 = list(makeSymbol("TRANS-LINK-DATA-HL-MODULE"), makeSymbol("TRANS-LINK-DATA-BINDINGS"), makeSymbol("TRANS-LINK-DATA-SUPPORTS"), makeSymbol("TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY"));
        $list5 = list(makeSymbol("_CSETF-TRANS-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-TRANS-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-TRANS-LINK-DATA-SUPPORTS"), makeSymbol("_CSETF-TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$TRANSFORMATION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSFORMATION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TRANSFORMATION-LINK-DATA-P"));
        $sym9$TRANS_LINK_DATA_HL_MODULE = makeSymbol("TRANS-LINK-DATA-HL-MODULE");
        $sym10$_CSETF_TRANS_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-TRANS-LINK-DATA-HL-MODULE");
        $sym11$TRANS_LINK_DATA_BINDINGS = makeSymbol("TRANS-LINK-DATA-BINDINGS");
        $sym12$_CSETF_TRANS_LINK_DATA_BINDINGS = makeSymbol("_CSETF-TRANS-LINK-DATA-BINDINGS");
        $sym13$TRANS_LINK_DATA_SUPPORTS = makeSymbol("TRANS-LINK-DATA-SUPPORTS");
        $sym14$_CSETF_TRANS_LINK_DATA_SUPPORTS = makeSymbol("_CSETF-TRANS-LINK-DATA-SUPPORTS");
        $sym15$TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY = makeSymbol("TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY");
        $sym16$_CSETF_TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY = makeSymbol("_CSETF-TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY");
        $HL_MODULE = makeKeyword("HL-MODULE");
        $BINDINGS = makeKeyword("BINDINGS");
        $SUPPORTS = makeKeyword("SUPPORTS");
        $NON_EXPLANATORY_SUBQUERY = makeKeyword("NON-EXPLANATORY-SUBQUERY");
        $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym23$MAKE_TRANSFORMATION_LINK_DATA = makeSymbol("MAKE-TRANSFORMATION-LINK-DATA");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-LINK-DATA-METHOD");
        $sym27$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym28$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $FREE = makeKeyword("FREE");
        $sym31$TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");
        $sym32$HL_MODULE_P = makeSymbol("HL-MODULE-P");
        $sym33$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
        $sym34$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
        $sym35$NON_EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol("NON-EXPLANATORY-SUBQUERY-SPEC-P");
        $str36$No_tactic_found_for__S = makeString("No tactic found for ~S");
        $list37 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
        $list40 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym41$STORE_VAR = makeUninternedSymbol("STORE-VAR");
        $sym42$CLET = makeSymbol("CLET");
        $list43 = list(makeSymbol("*HL-FAILURE-BACKCHAINING*"), T);
        $list44 = list(makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*"), T);
        $list45 = list(makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*"), T);
        $sym46$_NEGATION_BY_FAILURE_ = makeSymbol("*NEGATION-BY-FAILURE*");
        $sym47$PROBLEM_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");
        $sym48$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_ = makeSymbol("*DETERMINE-NEW-TRANSFORMATION-TACTICS-MODULE*");
        $DETERMINE_NEW_TRANSFORMATION_TACTICS = makeKeyword("DETERMINE-NEW-TRANSFORMATION-TACTICS");
        $GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
        $SKIP = makeKeyword("SKIP");
        $sym52$TRANSFORMATION_GENERATOR_TACTIC_P = makeSymbol("TRANSFORMATION-GENERATOR-TACTIC-P");
        $sym53$TRANSFORMATION_PROOF_P = makeSymbol("TRANSFORMATION-PROOF-P");
        $str54$generalized_transformation_link_o = makeString("generalized transformation link of unexpected type: ~s");
        $str55$generalized_transformation_proof_ = makeString("generalized transformation proof of unexpected type: ~s");
        $list56 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"));
        $sym57$INFERENCE_EXCEPTED_ASSERTION_ = makeSymbol("INFERENCE-EXCEPTED-ASSERTION?");
        $sym58$_EXIT = makeSymbol("%EXIT");
        $sym59$SINGLE_LITERAL_PROBLEM_P = makeSymbol("SINGLE-LITERAL-PROBLEM-P");
        $TACTIC_SPECS = makeKeyword("TACTIC-SPECS");
        $TOTAL_PRODUCTIVITY = makeKeyword("TOTAL-PRODUCTIVITY");
        $str62$unexpected_tactic_specs_return_ty = makeString("unexpected tactic-specs return type ~a");
        $str63$pruning__s__s__s = makeString("pruning ~s ~s ~s");
        $list64 = list(list(makeSymbol("TACTIC"), makeSymbol("MT"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym65$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");
        $sym66$WITH_INFERENCE_MT_RELEVANCE = makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $sym67$_INFERENCE_EXPAND_HL_MODULE_ = makeSymbol("*INFERENCE-EXPAND-HL-MODULE*");
        $sym68$TACTIC_HL_MODULE = makeSymbol("TACTIC-HL-MODULE");
        $sym69$_INFERENCE_EXPAND_SENSE_ = makeSymbol("*INFERENCE-EXPAND-SENSE*");
        $sym70$WITH_PROBLEM_STORE_TRANSFORMATION_ASSUMPTIONS = makeSymbol("WITH-PROBLEM-STORE-TRANSFORMATION-ASSUMPTIONS");
        $sym71$TACTIC_STORE = makeSymbol("TACTIC-STORE");
        $str72$time_to_add_meta_transformation_s = makeString("time to add meta-transformation support for ~S");
        $TRANSFORMATION_RULE_SELECT = makeKeyword("TRANSFORMATION-RULE-SELECT");
        $str74$transformation_tactic__S_already_ = makeString("transformation tactic ~S already has rule ~S");
        $sym75$HANDLE_TRANSFORMATION_ADD_NODE_FOR_EXPAND_RESULTS = makeSymbol("HANDLE-TRANSFORMATION-ADD-NODE-FOR-EXPAND-RESULTS");
        $sym76$HL_VAR_ = makeSymbol("HL-VAR?");
        $NEG = makeKeyword("NEG");
        $POS = makeKeyword("POS");
        $list79 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $$termOfUnit = makeConstSym(("termOfUnit"));
        $sym81$PROOF_P = makeSymbol("PROOF-P");
        $sym82$BINDINGS_P = makeSymbol("BINDINGS-P");
        $str83$Could_not_ground_out__s_and__s = makeString("Could not ground out ~s and ~s");
        $str84$Could_not_unify_transformation_bi = makeString("Could not unify transformation bindings ~a with subproof bindings ~a");
        $sym85$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $sym87$ASSERTION_P = makeSymbol("ASSERTION-P");
        $RULE = makeKeyword("RULE");
        $$forwardNonTriggerLiteral = makeConstSym(("forwardNonTriggerLiteral"));
        $$forwardTriggerLiteral = makeConstSym(("forwardTriggerLiteral"));
        $sym91$HL_VARIABLE_NOT_MENTIONED_IN_RULE_DNF_BUT_MENTIONED_IN_MERGE_DNF = makeSymbol("HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF");
        $sym92$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");
        $sym93$TRANSFORMATION_PROOF_ABNORMAL_ = makeSymbol("TRANSFORMATION-PROOF-ABNORMAL?");
        $sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED = makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS-MEMOIZED");
        $IGNORE = makeKeyword("IGNORE");
        $sym96$_ = makeSymbol("<");
        $sym97$VARIABLE_ID = makeSymbol("VARIABLE-ID");
        $$genlRules = makeConstSym(("genlRules"));
    }

    public static class $transformation_link_data_native extends SubLStructNative {
        public SubLObject $hl_module;
        public SubLObject $bindings;
        public SubLObject $supports;
        public SubLObject $non_explanatory_subquery;
        private static SubLStructDeclNative structDecl;

        public $transformation_link_data_native() {
            this.$hl_module = CommonSymbols.NIL;
            this.$bindings = CommonSymbols.NIL;
            this.$supports = CommonSymbols.NIL;
            this.$non_explanatory_subquery = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $transformation_link_data_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$hl_module;
        }

        @Override
        public SubLObject getField3() {
            return this.$bindings;
        }

        @Override
        public SubLObject getField4() {
            return this.$supports;
        }

        @Override
        public SubLObject getField5() {
            return this.$non_explanatory_subquery;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$hl_module = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$supports = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$non_explanatory_subquery = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($transformation_link_data_native.class, $sym0$TRANSFORMATION_LINK_DATA, $sym1$TRANSFORMATION_LINK_DATA_P, $list2, $list3, new String[] { "$hl_module", "$bindings", "$supports", "$non_explanatory_subquery" }, $list4, $list5,
                    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $transformation_link_data_p$UnaryFunction extends UnaryFunction {
        public $transformation_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANSFORMATION-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return transformation_link_data_p(arg1);
        }
    }

    public static class $transformation_tactic_p$UnaryFunction extends UnaryFunction {
        public $transformation_tactic_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANSFORMATION-TACTIC-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return transformation_tactic_p(arg1);
        }
    }

    public static class $hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf$UnaryFunction extends UnaryFunction {
        public $hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf(arg1);
        }
    }
}
/*
 *
 * Total time: 605 ms synthetic
 */