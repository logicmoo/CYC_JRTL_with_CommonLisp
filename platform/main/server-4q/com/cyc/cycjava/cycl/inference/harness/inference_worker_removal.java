package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.modules.simplification_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
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

public class inference_worker_removal extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "1c41b8ebe528cf780646364a11ff99bd687f290e3192801352d3dff9709a21a2";
    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLSymbol $dtp_removal_link_data$;
    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 19200L)
    private static SubLSymbol $conjunctive_removal_tactic_expand_results_queue$;
    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 21400L)
    private static SubLSymbol $conjunctive_removal_suppress_split_justificationP$;
    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 21700L)
    public static SubLSymbol $conjunctive_removal_optimize_when_no_justificationsP$;
    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 54000L)
    private static SubLSymbol $removal_tactic_iteration_threshold$;
    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 54300L)
    private static SubLSymbol $removal_tactic_expand_results_queue$;
    private static SubLSymbol $sym0$REMOVAL_LINK_DATA;
    private static SubLSymbol $sym1$REMOVAL_LINK_DATA_P;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym7$REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list8;
    private static SubLSymbol $sym9$REMOV_LINK_DATA_HL_MODULE;
    private static SubLSymbol $sym10$_CSETF_REMOV_LINK_DATA_HL_MODULE;
    private static SubLSymbol $sym11$REMOV_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym12$_CSETF_REMOV_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym13$REMOV_LINK_DATA_SUPPORTS;
    private static SubLSymbol $sym14$_CSETF_REMOV_LINK_DATA_SUPPORTS;
    private static SubLSymbol $HL_MODULE;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $SUPPORTS;
    private static SubLString $str18$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym20$MAKE_REMOVAL_LINK_DATA;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_REMOVAL_LINK_DATA_METHOD;
    private static SubLSymbol $sym24$PROBLEM_P;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $FREE;
    private static SubLSymbol $sym27$REMOVAL_LINK_P;
    private static SubLSymbol $sym28$HL_MODULE_P;
    private static SubLSymbol $sym29$BINDING_LIST_P;
    private static SubLSymbol $sym30$HL_JUSTIFICATION_P;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $SPLIT;
    private static SubLSymbol $REMOVAL_CONJUNCTIVE;
    private static SubLList $list34;
    private static SubLSymbol $sym35$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_;
    private static SubLSymbol $ALL;
    private static SubLSymbol $INFERENCE;
    private static SubLString $str38$_s_stated_its_applicability_to_th;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $TACTICAL;
    private static SubLList $list41;
    private static SubLSymbol $CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE;
    private static SubLSymbol $sym43$HL_VAR_;
    private static SubLSymbol $CONJUNCTIVE_REMOVAL_EXPAND;
    private static SubLSymbol $INFERENCE_PROOF_SPEC;
    private static SubLString $str46$Problem_reuse_assumptions_were_vi;
    private static SubLString $str47$Couldn_t_find_the_right_conjuncti;
    private static SubLSymbol $NEG;
    private static SubLSymbol $POS;
    private static SubLList $list50;
    private static SubLSymbol $SKSI;
    private static SubLList $list52;
    private static SubLSymbol $sym53$STORE_VAR;
    private static SubLSymbol $sym54$CLET;
    private static SubLSymbol $sym55$_NEGATION_BY_FAILURE_;
    private static SubLSymbol $sym56$PROBLEM_STORE_NEGATION_BY_FAILURE_;
    private static SubLSymbol $META_REMOVAL;
    private static SubLSymbol $sym58$META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED;
    private static SubLSymbol $sym59$_EXIT;
    private static SubLSymbol $sym60$META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED;
    private static SubLSymbol $sym61$REMOVAL_ABDUCTION_POS_REQUIRED;
    private static SubLSymbol $sym62$REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED;
    private static SubLSymbol $sym63$REMOVAL_FCP_CHECK_REQUIRED;
    private static SubLSymbol $sym64$REMOVAL_ISA_DEFN_POS_REQUIRED;
    private static SubLSymbol $sym65$REMOVAL_TVA_CHECK_REQUIRED;
    private static SubLSymbol $sym66$REMOVAL_TVA_UNIFY_REQUIRED;
    private static SubLSymbol $sym67$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND;
    private static SubLSymbol $sym68$REMOVAL_EVAL_EXPAND;
    private static SubLSymbol $sym69$REMOVAL_EVALUATE_BIND_EXPAND;
    private static SubLSymbol $sym70$REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND;
    private static SubLSymbol $sym71$REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND;
    private static SubLSymbol $sym72$REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND;
    private static SubLSymbol $sym73$REMOVAL_NAT_FORMULA_EXPAND;
    private static SubLSymbol $sym74$REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND;
    private static SubLSymbol $sym75$REMOVAL_NAT_LOOKUP_EXPAND;
    private static SubLSymbol $sym76$REMOVAL_REFLEXIVE_ON_EXPAND;
    private static SubLSymbol $sym77$REMOVAL_TVA_CHECK_EXPAND;
    private static SubLSymbol $DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES;
    private static SubLSymbol $NOT;
    private static SubLSymbol $MODULE_SUBTYPE;
    private static SubLSymbol $sym81$FIRST;
    private static SubLString $str82$For_sentence_____S__Maximum_HL_Mo;
    private static SubLSymbol $sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT;
    private static SubLSymbol $sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE;
    private static SubLList $list85;
    private static SubLSymbol $sym86$TACTIC_VAR;
    private static SubLSymbol $sym87$WITH_INFERENCE_MT_RELEVANCE;
    private static SubLSymbol $sym88$_INFERENCE_EXPAND_HL_MODULE_;
    private static SubLSymbol $sym89$TACTIC_HL_MODULE;
    private static SubLSymbol $sym90$_INFERENCE_EXPAND_SENSE_;
    private static SubLSymbol $sym91$WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS;
    private static SubLSymbol $sym92$TACTIC_STORE;
    private static SubLSymbol $REMOVAL_OUTPUT_GENERATE;
    private static SubLSymbol $sym94$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE;
    private static SubLSymbol $MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR;
    private static SubLSymbol $sym96$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS;
    private static SubLSymbol $REMOVAL_EXPAND;
    private static SubLList $list98;
    private static SubLString $str99$Ignoring_result_from__S_due_to_op;
    private static SubLSymbol $sym100$PRODUCTIVITY__;
    private static SubLSymbol $sym101$TACTIC_PRODUCTIVITY;
    private static SubLList $list102;
    private static SubLSymbol $sym103$ITERATOR;
    private static SubLSymbol $sym104$PIF;
    private static SubLSymbol $sym105$ITERATOR_P;
    private static SubLSymbol $sym106$CUNWIND_PROTECT;
    private static SubLSymbol $sym107$DO_ITERATOR;
    private static SubLSymbol $sym108$ITERATION_FINALIZE;
    private static SubLSymbol $sym109$DO_LIST;
    private static SubLSymbol $MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR;
    private static SubLSymbol $HANDLE_ONE_OUTPUT_GENERATE_RESULT;
    private static SubLList $list112;
    private static SubLSymbol $TRUE;
    private static SubLString $str114$unknown_thing_to_do_in_the_HL_mod;

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject removal_link_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject removal_link_data_p(SubLObject v_object) {
        return (v_object.getClass() == $removal_link_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject remov_link_data_hl_module(SubLObject v_object) {
        assert NIL != removal_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject remov_link_data_bindings(SubLObject v_object) {
        assert NIL != removal_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject remov_link_data_supports(SubLObject v_object) {
        assert NIL != removal_link_data_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject _csetf_remov_link_data_hl_module(SubLObject v_object, SubLObject value) {
        assert NIL != removal_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject _csetf_remov_link_data_bindings(SubLObject v_object, SubLObject value) {
        assert NIL != removal_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject _csetf_remov_link_data_supports(SubLObject v_object, SubLObject value) {
        assert NIL != removal_link_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject make_removal_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $removal_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HL_MODULE)) {
                _csetf_remov_link_data_hl_module(v_new, current_value);
            } else if (pcase_var.eql($BINDINGS)) {
                _csetf_remov_link_data_bindings(v_new, current_value);
            } else if (pcase_var.eql($SUPPORTS)) {
                _csetf_remov_link_data_supports(v_new, current_value);
            } else {
                Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject visit_defstruct_removal_link_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym20$MAKE_REMOVAL_LINK_DATA, THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $HL_MODULE, remov_link_data_hl_module(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $BINDINGS, remov_link_data_bindings(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SUPPORTS, remov_link_data_supports(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym20$MAKE_REMOVAL_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1200L)
    public static SubLObject visit_defstruct_object_removal_link_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_removal_link_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1700L)
    public static SubLObject new_removal_link(SubLObject problem, SubLObject hl_module, SubLObject removal_bindings, SubLObject supports) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject removal_link = new_removal_link_int(problem, hl_module, removal_bindings, supports);
        inference_worker.propagate_problem_link(removal_link);
        return removal_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 2100L)
    public static SubLObject new_removal_link_int(SubLObject problem, SubLObject hl_module, SubLObject removal_bindings, SubLObject supports) {
        SubLObject removal_link = inference_datastructures_problem_link.new_problem_link($REMOVAL, problem);
        new_removal_link_data(removal_link);
        set_removal_link_hl_module(removal_link, hl_module);
        set_removal_link_bindings(removal_link, removal_bindings);
        set_removal_link_supports(removal_link, supports);
        inference_datastructures_problem.index_problem_argument_link(problem, removal_link);
        return removal_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 2700L)
    public static SubLObject new_removal_link_data(SubLObject removal_link) {
        SubLObject data = make_removal_link_data(UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(removal_link, data);
        return removal_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 2900L)
    public static SubLObject destroy_removal_link(SubLObject removal_link) {
        inference_datastructures_problem.deindex_problem_argument_link(inference_datastructures_problem_link.problem_link_supported_problem(removal_link), removal_link);
        SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        _csetf_remov_link_data_hl_module(data, $FREE);
        _csetf_remov_link_data_bindings(data, $FREE);
        _csetf_remov_link_data_supports(data, $FREE);
        return removal_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 3300L)
    public static SubLObject removal_link_hl_module(SubLObject removal_link) {
        assert NIL != removal_link_p(removal_link) : removal_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        return remov_link_data_hl_module(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 3500L)
    public static SubLObject removal_link_bindings(SubLObject removal_link) {
        assert NIL != removal_link_p(removal_link) : removal_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        return remov_link_data_bindings(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 3900L)
    public static SubLObject removal_link_supports(SubLObject removal_link) {
        assert NIL != removal_link_p(removal_link) : removal_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        return remov_link_data_supports(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 4100L)
    public static SubLObject set_removal_link_hl_module(SubLObject removal_link, SubLObject hl_module) {
        assert NIL != removal_link_p(removal_link) : removal_link;
        assert NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        _csetf_remov_link_data_hl_module(data, hl_module);
        return removal_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 4400L)
    public static SubLObject set_removal_link_bindings(SubLObject removal_link, SubLObject v_bindings) {
        assert NIL != removal_link_p(removal_link) : removal_link;
        assert NIL != bindings.binding_list_p(v_bindings) : v_bindings;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        _csetf_remov_link_data_bindings(data, v_bindings);
        return removal_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 4700L)
    public static SubLObject set_removal_link_supports(SubLObject removal_link, SubLObject supports) {
        assert NIL != removal_link_p(removal_link) : removal_link;
        assert NIL != arguments.hl_justification_p(supports) : supports;
        if (NIL != inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem_link.problem_link_store(removal_link))) {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
            _csetf_remov_link_data_supports(data, supports);
        }
        return removal_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 5000L)
    public static SubLObject removal_link_tactic(SubLObject removal_link) {
        assert NIL != removal_link_p(removal_link) : removal_link;
        SubLObject hl_module = removal_link_hl_module(removal_link);
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(removal_link);
        SubLObject store = inference_datastructures_problem_link.problem_link_store(removal_link);
        if (NIL != inference_modules.removal_module_p(hl_module)) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject candidate_tactic = NIL;
            candidate_tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $REMOVAL) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic).eql(hl_module)) {
                    return candidate_tactic;
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate_tactic = cdolist_list_var.first();
            }
            if (NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store) && NIL != inference_datastructures_problem.closed_problem_p(problem)) {
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject restriction_link;
                SubLObject unrestricted_problem;
                SubLObject cdolist_list_var2;
                SubLObject candidate_tactic2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                        unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                        cdolist_list_var2 = inference_datastructures_problem.problem_tactics(unrestricted_problem);
                        candidate_tactic2 = NIL;
                        candidate_tactic2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic2, $REMOVAL) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic2).eql(hl_module)) {
                                return candidate_tactic2;
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            candidate_tactic2 = cdolist_list_var2.first();
                        }
                    }
                }
            }
        } else {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject cdolist_list_var2;
            SubLObject candidate_tactic2;
            SubLObject split_link;
            SubLObject split_problem;
            SubLObject set_contents_var_$1;
            SubLObject basis_object_$2;
            SubLObject state_$3;
            SubLObject restriction_link2;
            SubLObject unrestricted_problem2;
            SubLObject cdolist_list_var3;
            SubLObject candidate_tactic3;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                split_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, split_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT)) {
                    split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
                    cdolist_list_var2 = inference_datastructures_problem.problem_tactics(split_problem);
                    candidate_tactic2 = NIL;
                    candidate_tactic2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic2, $REMOVAL_CONJUNCTIVE) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic2).eql(hl_module)) {
                            return candidate_tactic2;
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        candidate_tactic2 = cdolist_list_var2.first();
                    }
                    set_contents_var_$1 = inference_datastructures_problem.problem_dependent_links(split_problem);
                    for (basis_object_$2 = set_contents.do_set_contents_basis_object(set_contents_var_$1), state_$3 = NIL, state_$3 = set_contents.do_set_contents_initial_state(basis_object_$2, set_contents_var_$1); NIL == set_contents.do_set_contents_doneP(basis_object_$2,
                            state_$3); state_$3 = set_contents.do_set_contents_update_state(state_$3)) {
                        restriction_link2 = set_contents.do_set_contents_next(basis_object_$2, state_$3);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$3, restriction_link2) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link2, $RESTRICTION)) {
                            unrestricted_problem2 = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link2);
                            cdolist_list_var3 = inference_datastructures_problem.problem_tactics(unrestricted_problem2);
                            candidate_tactic3 = NIL;
                            candidate_tactic3 = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic3, $REMOVAL_CONJUNCTIVE) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic3).eql(hl_module)) {
                                    return candidate_tactic3;
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                candidate_tactic3 = cdolist_list_var3.first();
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 7500L)
    public static SubLObject removal_link_data_equals_specP(SubLObject removal_link, SubLObject removal_bindings, SubLObject supports) {
        SubLObject link_removal_bindings = removal_link_bindings(removal_link);
        SubLObject link_supports = removal_link_supports(removal_link);
        return makeBoolean(removal_bindings.equal(link_removal_bindings) && NIL != arguments.justification_equal(supports, link_supports));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 7900L)
    public static SubLObject generalized_removal_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != removal_tactic_p(v_object) || NIL != conjunctive_removal_tactic_p(v_object) || NIL != meta_removal_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 8200L)
    public static SubLObject conjunctive_removal_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(tactic) && $REMOVAL_CONJUNCTIVE == inference_datastructures_tactic.tactic_type(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 8400L)
    public static SubLObject conjunctive_removal_link_p(SubLObject link) {
        return makeBoolean(NIL != removal_link_p(link) && NIL != inference_modules.conjunctive_removal_module_p(removal_link_hl_module(link)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 8500L)
    public static SubLObject conjunctive_removal_proof_p(SubLObject proof) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(proof) && NIL != conjunctive_removal_link_p(inference_datastructures_proof.proof_link(proof)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 8700L)
    public static SubLObject determine_new_conjunctive_removal_tactics(SubLObject problem, SubLObject dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return NIL;
        }
        SubLObject supplanted_hl_modules = NIL;
        SubLObject tactic_specs = NIL;
        SubLObject exclusive_foundP = NIL;
        SubLObject common_mt = inference_czer.contextualized_dnf_clause_common_mt(dnf_clause);
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(common_mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject hl_modules = determine_applicable_conjunctive_removal_modules(dnf_clause);
            hl_modules = sort_applicable_conjunctive_removal_modules_by_priority(hl_modules);
            if (NIL == exclusive_foundP) {
                SubLObject csome_list_var = hl_modules;
                SubLObject hl_module = NIL;
                hl_module = csome_list_var.first();
                while (NIL == exclusive_foundP && NIL != csome_list_var) {
                    if (NIL == supplanted_hl_modules || NIL == conses_high.member(hl_module, supplanted_hl_modules, UNPROVIDED, UNPROVIDED)) {
                        SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                        if (NIL == exclusive_func || (exclusive_func.isFunctionSpec() && NIL != Functions.funcall(exclusive_func, dnf_clause))) {
                            if (NIL != exclusive_func) {
                                thread.resetMultipleValues();
                                SubLObject exclusive_foundP_$4 = update_supplanted_modules_wrt_tactic_specs(hl_module, tactic_specs, supplanted_hl_modules);
                                SubLObject tactic_specs_$5 = thread.secondMultipleValue();
                                SubLObject supplanted_hl_modules_$6 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                exclusive_foundP = exclusive_foundP_$4;
                                tactic_specs = tactic_specs_$5;
                                supplanted_hl_modules = supplanted_hl_modules_$6;
                            }
                            SubLObject cost = inference_modules.hl_module_clause_cost(hl_module, dnf_clause);
                            if (NIL != cost) {
                                SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                                SubLObject completeness = inference_modules.hl_module_clause_completeness(hl_module, dnf_clause);
                                SubLObject tactic_spec = list(hl_module, productivity, completeness);
                                tactic_specs = cons(tactic_spec, tactic_specs);
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    hl_module = csome_list_var.first();
                }
            }
            SubLObject cdolist_list_var = tactic_specs;
            SubLObject tactic_spec2 = NIL;
            tactic_spec2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                SubLObject datum = current = tactic_spec2;
                SubLObject hl_module2 = NIL;
                SubLObject productivity2 = NIL;
                SubLObject completeness2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
                hl_module2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
                productivity2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
                completeness2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    new_conjunctive_removal_tactic(problem, hl_module2, productivity2, completeness2);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list34);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tactic_spec2 = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return tactic_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 10500L)
    public static SubLObject sort_applicable_conjunctive_removal_modules_by_priority(SubLObject hl_modules) {
        return Sort.sort(hl_modules, $sym35$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 10900L)
    public static SubLObject conjunctive_removal_module_priorityL(SubLObject hl_module1, SubLObject hl_module2) {
        if (NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module1) && NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module2)) {
            return T;
        }
        if (NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module2) && NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module1)) {
            return NIL;
        }
        if (NIL != simplification_modules.simplification_module_p(hl_module1) && NIL == simplification_modules.simplification_module_p(hl_module2)) {
            return T;
        }
        if (NIL != simplification_modules.simplification_module_p(hl_module2) && NIL == simplification_modules.simplification_module_p(hl_module1)) {
            return NIL;
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 11500L)
    public static SubLObject determine_applicable_conjunctive_removal_modules(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause);
        SubLObject applicable_modules = NIL;
        SubLObject allowed_modules_spec = (NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_allowed_modules(inference_macros.current_controlling_inference()) : $ALL;
        SubLObject set_var = inference_modules.removal_modules_conjunctive();
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject hl_module;
        SubLObject _prev_bind_0;
        SubLObject cdolist_list_var;
        SubLObject new_subclause_specs;
        SubLObject subclause_spec;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            hl_module = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, hl_module)
                    && (NIL == some_backchain_requiredP || NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module)
                            || (NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread) && NIL != simplification_modules.simplification_module_p(hl_module)))
                    && NIL != inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec)) {
                _prev_bind_0 = sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.currentBinding(thread);
                try {
                    sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.bind(T, thread);
                    if (NIL != inference_modules.hl_module_direction_relevantP(hl_module)) {
                        new_subclause_specs = (cdolist_list_var = hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause));
                        subclause_spec = NIL;
                        subclause_spec = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != clause_utilities.total_subclause_specP(subclause_spec, contextualized_dnf_clause)) {
                                applicable_modules = cons(hl_module, applicable_modules);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            subclause_spec = cdolist_list_var.first();
                        }
                    }
                } finally {
                    sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return applicable_modules;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 13000L)
    public static SubLObject motivated_multi_literal_subclause_specs(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = NIL;
        if (NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause)) {
            SubLObject mt_var;
            SubLObject common_mt = mt_var = inference_czer.contextualized_dnf_clause_common_mt(contextualized_dnf_clause);
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject set_var = inference_modules.removal_modules_conjunctive();
                SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject hl_module;
                SubLObject cdolist_list_var;
                SubLObject new_subclause_specs;
                SubLObject subclause_spec;
                SubLObject item_var;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    hl_module = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, hl_module) && NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module) && NIL == simplification_modules.simplification_module_p(hl_module)
                            && NIL != inference_modules.hl_module_direction_relevantP(hl_module)) {
                        new_subclause_specs = (cdolist_list_var = hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause));
                        subclause_spec = NIL;
                        subclause_spec = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == clause_utilities.total_subclause_specP(subclause_spec, contextualized_dnf_clause)) {
                                item_var = subclause_spec;
                                if (NIL == conses_high.member(item_var, subclause_specs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                                    subclause_specs = cons(item_var, subclause_specs);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            subclause_spec = cdolist_list_var.first();
                        }
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.nreverse(subclause_specs);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 14100L)
    public static SubLObject hl_module_applicable_subclause_specs(SubLObject hl_module, SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_modules_spec = (NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_allowed_modules(inference_macros.current_controlling_inference()) : $ALL;
        if (NIL == inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec)) {
            return NIL;
        }
        SubLObject cdolist_list_var;
        SubLObject every_predicates = cdolist_list_var = inference_modules.hl_module_every_predicates(hl_module);
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_datastructures_problem_query.contextualized_clause_has_literal_with_predicateP(contextualized_dnf_clause, predicate)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        SubLObject subclause_specs = NIL;
        SubLObject applicability_pattern = inference_modules.hl_module_applicability_pattern(hl_module);
        if (NIL != applicability_pattern) {
            subclause_specs = formula_pattern_match.pattern_transform_formula(applicability_pattern, contextualized_dnf_clause, UNPROVIDED);
        } else {
            SubLObject applicability_method = inference_modules.hl_module_applicability_func(hl_module);
            if (applicability_method.isFunctionSpec()) {
                SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if (NIL != last_metric_type && NIL != last_metric) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
                }
                SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind($INFERENCE, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind(applicability_method, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                    try {
                        subclause_specs = Functions.funcall(applicability_method, contextualized_dnf_clause);
                    } finally {
                        SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values = Values.getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics($INFERENCE, applicability_method, NIL, NIL, NIL);
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                } finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
                }
            }
        }
        SubLObject cdolist_list_var2 = subclause_specs;
        SubLObject subclause_spec = NIL;
        subclause_spec = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == clause_utilities.multi_literal_subclause_specP(subclause_spec)) {
                Errors.error($str38$_s_stated_its_applicability_to_th, hl_module, subclause_spec);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            subclause_spec = cdolist_list_var2.first();
        }
        return subclause_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 15600L)
    public static SubLObject new_conjunctive_removal_tactic(SubLObject problem, SubLObject hl_module, SubLObject productivity, SubLObject completeness) {
        SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$8 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$8, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$8);
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
            SubLObject idx_$9 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$9)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$9);
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

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 16000L)
    public static SubLObject compute_strategic_properties_of_conjunctive_removal_tactic(SubLObject tactic, SubLObject strategy) {
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 16100L)
    public static SubLObject execute_conjunctive_removal_tactic(SubLObject tactic) {
        if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
            inference_datastructures_tactic.tactic_in_progress_next(tactic);
        } else {
            SubLObject progress_iterator = maybe_make_conjunctive_removal_tactic_progress_iterator(tactic);
            if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic) && NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, $TACTICAL)) {
                inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
            }
            if (NIL != progress_iterator) {
                if (progress_iterator.isList()) {
                    SubLObject cdolist_list_var = progress_iterator;
                    SubLObject execution_result = NIL;
                    execution_result = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        SubLObject datum = current = execution_result;
                        SubLObject removal_bindings = NIL;
                        SubLObject justifications = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list41);
                        removal_bindings = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list41);
                        justifications = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
                        } else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, $list41);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        execution_result = cdolist_list_var.first();
                    }
                } else {
                    inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                }
            }
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 17200L)
    public static SubLObject maybe_make_conjunctive_removal_tactic_progress_iterator(SubLObject tactic) {
        return (NIL != inference_modules.hl_module_expand_iterative_pattern(inference_datastructures_tactic.tactic_hl_module(tactic))) ? maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator(tactic) : maybe_make_conjunctive_removal_tactic_progress_expand_iterator(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 17500L)
    public static SubLObject maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator(SubLObject tactic) {
        SubLObject contextualized_dnf_clause = inference_datastructures_tactic.tactic_problem_sole_clause(tactic);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        SubLObject pattern = inference_modules.hl_module_expand_iterative_pattern(hl_module);
        SubLObject iterator = formula_pattern_match.pattern_transform_formula(pattern, contextualized_dnf_clause, UNPROVIDED);
        if (NIL != iterator) {
            inference_datastructures_tactic.possibly_update_tactic_productivity_from_iterator(tactic, iterator);
            return new_conjunctive_removal_tactic_progress_expand_iterative_iterator(tactic, iterator);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 18100L)
    public static SubLObject new_conjunctive_removal_tactic_progress_expand_iterative_iterator(SubLObject tactic, SubLObject output_iterator) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE, tactic, output_iterator);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 18400L)
    public static SubLObject handle_one_conjunctive_removal_tactic_expand_iterative_result(SubLObject tactic, SubLObject output_iterator) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        thread.resetMultipleValues();
        SubLObject raw_output = iteration.iteration_next(output_iterator);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            SubLObject current;
            SubLObject datum = current = raw_output;
            SubLObject removal_bindings = NIL;
            SubLObject justifications = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list41);
            removal_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list41);
            justifications = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(inference_datastructures_problem.problem_query(inference_datastructures_tactic.tactic_problem(tactic)), $sym43$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject var = NIL;
                var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == bindings.variable_lookup(var, removal_bindings)) {
                        removal_bindings = bindings.add_dont_care_variable_binding(var, removal_bindings);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                }
                result = handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list41);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 19400L)
    public static SubLObject maybe_make_conjunctive_removal_tactic_progress_expand_iterator(SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject contextualized_dnf_clause = inference_datastructures_tactic.tactic_problem_sole_clause(tactic);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        SubLObject expand_pattern = inference_modules.hl_module_expand_pattern(hl_module);
        SubLObject expand_function = (NIL != expand_pattern) ? NIL : inference_modules.hl_module_expand_func(hl_module);
        SubLObject expand_results = NIL;
        SubLObject _prev_bind_0 = $conjunctive_removal_tactic_expand_results_queue$.currentBinding(thread);
        try {
            $conjunctive_removal_tactic_expand_results_queue$.bind(NIL, thread);
            if (NIL != expand_pattern) {
                formula_pattern_match.pattern_transform_formula(expand_pattern, contextualized_dnf_clause, UNPROVIDED);
            } else if (expand_function.isFunctionSpec()) {
                Functions.funcall(expand_function, contextualized_dnf_clause);
            }
            if (NIL != $conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread)) {
                expand_results = $conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread);
            }
        } finally {
            $conjunctive_removal_tactic_expand_results_queue$.rebind(_prev_bind_0, thread);
        }
        SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(Sequences.length(expand_results));
        inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
        if (NIL != list_utilities.lengthGE(expand_results, $removal_tactic_iteration_threshold$.getDynamicValue(thread), UNPROVIDED)) {
            expand_results = new_conjunctive_removal_tactic_progress_expand_iterator(tactic, expand_results);
        }
        return expand_results;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 20600L)
    public static SubLObject new_conjunctive_removal_tactic_progress_expand_iterator(SubLObject tactic, SubLObject results) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($CONJUNCTIVE_REMOVAL_EXPAND, tactic, results);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 20800L)
    public static SubLObject conjunctive_removal_callback(SubLObject removal_bindings, SubLObject justifications) {
        SubLThread thread = SubLProcess.currentSubLThread();
        removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
        $conjunctive_removal_tactic_expand_results_queue$.setDynamicValue(cons(list(removal_bindings, justifications), $conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread)), thread);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 21100L)
    public static SubLObject handle_one_conjunctive_removal_tactic_expand_result(SubLObject tactic, SubLObject expand_result) {
        SubLObject removal_bindings = NIL;
        SubLObject justifications = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(expand_result, expand_result, $list41);
        removal_bindings = expand_result.first();
        SubLObject current = expand_result.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, expand_result, $list41);
        justifications = current.first();
        current = current.rest();
        if (NIL == current) {
            return handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
        }
        cdestructuring_bind.cdestructuring_bind_error(expand_result, $list41);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 22000L)
    public static SubLObject conjunctive_removal_suppress_split_justificationP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $conjunctive_removal_suppress_split_justificationP$.getDynamicValue(thread)) {
            SubLObject inf = inference_macros.current_controlling_inference();
            SubLObject metrics = inference_datastructures_inference.inference_metrics_template(inf);
            return makeBoolean(NIL == Sequences.find($INFERENCE_PROOF_SPEC, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 22400L)
    public static SubLObject handle_one_conjunctive_removal_tactic_result(SubLObject tactic, SubLObject removal_bindings, SubLObject justifications) {
        SubLThread thread = SubLProcess.currentSubLThread();
        inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(tactic, ONE_INTEGER);
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject compute_answersP = inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem.problem_store(problem));
        if (NIL == justifications) {
            return maybe_new_simplification_link(problem, tactic, removal_bindings);
        }
        if (NIL != $conjunctive_removal_optimize_when_no_justificationsP$.getDynamicValue(thread) && NIL == compute_answersP) {
            return maybe_new_removal_link(problem, tactic, removal_bindings, NIL);
        }
        if (NIL != conjunctive_removal_suppress_split_justificationP()) {
            SubLObject supports = NIL;
            if (justifications.isList()) {
                SubLObject cdolist_list_var = justifications;
                SubLObject justification = NIL;
                justification = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$10 = justification;
                    SubLObject support = NIL;
                    support = cdolist_list_var_$10.first();
                    while (NIL != cdolist_list_var_$10) {
                        supports = cons(support, supports);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        support = cdolist_list_var_$10.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                }
            }
            if (NIL == removal_bindings) {
                return maybe_new_removal_link(problem, tactic, removal_bindings, supports);
            }
            return maybe_new_restriction_and_removal_link(problem, tactic, removal_bindings, supports);
        } else {
            if (NIL == removal_bindings) {
                return maybe_new_split_and_removal_links(problem, tactic, justifications);
            }
            return maybe_new_restriction_split_and_removal_links(problem, tactic, removal_bindings, justifications);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 23800L)
    public static SubLObject maybe_new_simplification_link(SubLObject problem, SubLObject tactic, SubLObject removal_bindings) {
        SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
        return inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, NIL, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 24100L)
    public static SubLObject maybe_new_restriction_split_and_removal_links(SubLObject problem, SubLObject tactic, SubLObject removal_bindings, SubLObject justifications) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
        SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
        SubLObject reordered_justifications = reorder_conjunctive_removal_justifications(justifications, problem, removal_bindings, restricted_problem);
        maybe_new_split_and_removal_links(restricted_problem, tactic, reordered_justifications);
        SubLObject restriction_link = inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, NIL, tactic);
        SubLObject restricted_mapped_problem_from_link = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == inference_datastructures_problem_link.mapped_problem_equal(restricted_mapped_problem_from_link, restricted_mapped_problem)) {
            Errors.error($str46$Problem_reuse_assumptions_were_vi, restricted_mapped_problem_from_link, restricted_mapped_problem);
        }
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 25300L)
    public static SubLObject reorder_conjunctive_removal_justifications(SubLObject justifications, SubLObject unrestricted_problem, SubLObject restriction_bindings, SubLObject restricted_problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unrestricted_clause = inference_datastructures_problem.problem_sole_clause(unrestricted_problem);
        SubLObject actual_restricted_clause = inference_datastructures_problem.problem_sole_clause(restricted_problem);
        SubLObject expected_restricted_clause = bindings.apply_bindings(restriction_bindings, unrestricted_clause);
        if (actual_restricted_clause.equal(expected_restricted_clause)) {
            return justifications;
        }
        SubLObject reordered_justifications = NIL;
        SubLObject cdolist_list_var = clauses.neg_lits(actual_restricted_clause);
        SubLObject actual_asent = NIL;
        actual_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject expected_clause_index = ZERO_INTEGER;
            SubLObject foundP;
            SubLObject rest;
            SubLObject expected_asent;
            SubLObject justification;
            for (foundP = NIL, rest = NIL, rest = clauses.neg_lits(expected_restricted_clause); NIL == foundP && NIL != rest; rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = nth(expected_clause_index, justifications);
                    reordered_justifications = cons(justification, reordered_justifications);
                    foundP = T;
                }
                expected_clause_index = Numbers.add(expected_clause_index, ONE_INTEGER);
            }
            for (rest = NIL, rest = clauses.pos_lits(expected_restricted_clause); NIL == foundP && NIL != rest; rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = nth(expected_clause_index, justifications);
                    reordered_justifications = cons(justification, reordered_justifications);
                    foundP = T;
                }
                expected_clause_index = Numbers.add(expected_clause_index, ONE_INTEGER);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == foundP) {
                Errors.error($str47$Couldn_t_find_the_right_conjuncti, actual_asent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            actual_asent = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(actual_restricted_clause);
        actual_asent = NIL;
        actual_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject expected_clause_index = ZERO_INTEGER;
            SubLObject foundP;
            SubLObject rest;
            SubLObject expected_asent;
            SubLObject justification;
            for (foundP = NIL, rest = NIL, rest = clauses.neg_lits(expected_restricted_clause); NIL == foundP && NIL != rest; rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = nth(expected_clause_index, justifications);
                    reordered_justifications = cons(justification, reordered_justifications);
                    foundP = T;
                }
                expected_clause_index = Numbers.add(expected_clause_index, ONE_INTEGER);
            }
            for (rest = NIL, rest = clauses.pos_lits(expected_restricted_clause); NIL == foundP && NIL != rest; rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = nth(expected_clause_index, justifications);
                    reordered_justifications = cons(justification, reordered_justifications);
                    foundP = T;
                }
                expected_clause_index = Numbers.add(expected_clause_index, ONE_INTEGER);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == foundP) {
                Errors.error($str47$Couldn_t_find_the_right_conjuncti, actual_asent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            actual_asent = cdolist_list_var.first();
        }
        reordered_justifications = Sequences.nreverse(reordered_justifications);
        return reordered_justifications;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 26600L)
    public static SubLObject maybe_new_split_and_removal_links(SubLObject problem, SubLObject tactic, SubLObject justifications) {
        SubLObject dnf_clause = inference_datastructures_problem.problem_sole_clause(problem);
        if (NIL != clauses.atomic_clause_p(dnf_clause)) {
            maybe_new_removal_link(problem, tactic, NIL, justifications.first());
        } else {
            SubLObject split_link = inference_worker_split.maybe_new_split_link(problem, dnf_clause);
            inference_worker.problem_link_open_and_repropagate_all(split_link);
            SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject literal_supports = justifications.first();
                justifications = justifications.rest();
                maybe_new_removal_link_for_split_link(split_link, tactic, contextualized_asent, $NEG, literal_supports);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
            cdolist_list_var = clauses.pos_lits(dnf_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject literal_supports = justifications.first();
                justifications = justifications.rest();
                maybe_new_removal_link_for_split_link(split_link, tactic, contextualized_asent, $POS, literal_supports);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 27600L)
    public static SubLObject maybe_new_removal_link_for_split_link(SubLObject split_link, SubLObject tactic, SubLObject contextualized_asent, SubLObject sense, SubLObject literal_supports) {
        SubLObject query = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
        SubLObject literal_problem = inference_datastructures_problem_link.find_closed_supporting_problem_by_query(split_link, query);
        return maybe_new_removal_link(literal_problem, tactic, NIL, literal_supports);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 28000L)
    public static SubLObject executed_conjunctive_removal_problems(SubLObject store, SubLObject module_subtype) {
        if (module_subtype == UNPROVIDED) {
            module_subtype = NIL;
        }
        SubLObject problems = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$11 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$11, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$11);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject witness;
                SubLObject rest;
                SubLObject tactic;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        for (witness = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics(problem); NIL == witness && NIL != rest; rest = rest.rest()) {
                            tactic = rest.first();
                            if (NIL != executed_conjunctive_removal_tactic_p(tactic) && (NIL == module_subtype || NIL != list_utilities.member_eqP(module_subtype, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic))))) {
                                witness = tactic;
                            }
                        }
                        if (NIL != witness) {
                            problems = cons(problem, problems);
                        }
                    }
                }
            }
            SubLObject idx_$12 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$12) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$12);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$12);
                SubLObject end_id = id_index.id_index_next_id(idx_$12);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    SubLObject problem2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(problem2)) {
                        SubLObject witness2;
                        SubLObject rest2;
                        SubLObject tactic2;
                        for (witness2 = NIL, rest2 = NIL, rest2 = inference_datastructures_problem.problem_tactics(problem2); NIL == witness2 && NIL != rest2; rest2 = rest2.rest()) {
                            tactic2 = rest2.first();
                            if (NIL != executed_conjunctive_removal_tactic_p(tactic2) && (NIL == module_subtype || NIL != list_utilities.member_eqP(module_subtype, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic2))))) {
                                witness2 = tactic2;
                            }
                        }
                        if (NIL != witness2) {
                            problems = cons(problem2, problems);
                        }
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(problems);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 28600L)
    public static SubLObject problem_store_has_some_executed_sksi_conjunctive_removal_problemP(SubLObject store) {
        SubLObject witness = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$13 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$13, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$13);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                SubLObject datum = current = (NIL != backwardP_var) ? list(Numbers.subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject delta = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list50);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list50);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list50);
                delta = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == witness) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject problem;
                        SubLObject rest;
                        SubLObject tactic;
                        for (end_var = end, id = NIL, id = start; NIL == witness && NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            problem = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(problem)) {
                                    problem = $SKIP;
                                }
                                for (rest = NIL, rest = inference_datastructures_problem.problem_tactics(problem); NIL == witness && NIL != rest; rest = rest.rest()) {
                                    tactic = rest.first();
                                    if (NIL != executed_conjunctive_removal_tactic_p(tactic) && NIL != list_utilities.member_eqP($SKSI, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic)))) {
                                        witness = tactic;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list50);
                }
            }
            SubLObject idx_$14 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$14) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$14);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$14);
                SubLObject end_id = id_index.id_index_next_id(idx_$14);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id) && NIL == witness) {
                    SubLObject problem2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(problem2)) {
                        SubLObject rest2;
                        SubLObject tactic2;
                        for (rest2 = NIL, rest2 = inference_datastructures_problem.problem_tactics(problem2); NIL == witness && NIL != rest2; rest2 = rest2.rest()) {
                            tactic2 = rest2.first();
                            if (NIL != executed_conjunctive_removal_tactic_p(tactic2) && NIL != list_utilities.member_eqP($SKSI, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic2)))) {
                                witness = tactic2;
                            }
                        }
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return witness;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29100L)
    public static SubLObject executed_conjunctive_removal_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != conjunctive_removal_tactic_p(tactic) && (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic) || NIL != inference_datastructures_tactic.tactic_executedP(tactic)) && NIL == inference_worker_restriction.simplification_tactic_p(tactic)
                && NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_tactic_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29400L)
    public static SubLObject with_problem_store_removal_assumptions(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list52);
        store = current.first();
        SubLObject body;
        current = (body = current.rest());
        SubLObject store_var = $sym53$STORE_VAR;
        return listS($sym54$CLET, list(list(store_var, store), list($sym55$_NEGATION_BY_FAILURE_, list($sym56$PROBLEM_STORE_NEGATION_BY_FAILURE_, store_var))), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29800L)
    public static SubLObject meta_removal_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(v_object) && $META_REMOVAL == inference_datastructures_tactic.tactic_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29900L)
    public static SubLObject compute_strategic_properties_of_meta_removal_tactic(SubLObject tactic, SubLObject strategy) {
        return compute_strategic_properties_of_removal_tactic(tactic, strategy);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30100L)
    public static SubLObject removal_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_link.problem_link_p(v_object) && $REMOVAL == inference_datastructures_problem_link.problem_link_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30300L)
    public static SubLObject removal_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(v_object) && $REMOVAL == inference_datastructures_tactic.tactic_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30400L)
    public static SubLObject removal_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(v_object) && NIL != removal_link_p(inference_datastructures_proof.proof_link(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30500L)
    public static SubLObject removal_module_exclusive_func_funcall(SubLObject func, SubLObject asent, SubLObject sense) {
        return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30800L)
    public static SubLObject removal_module_required_func_funcall(SubLObject func, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (NIL != last_metric_type && NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($INFERENCE, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind(func, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                if (func.eql($sym58$META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED)) {
                    return meta_removal_modules.meta_removal_completely_decidable_pos_required(asent, sense);
                }
                if (func.eql($sym60$META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED)) {
                    return meta_removal_modules.meta_removal_completely_enumerable_pos_required(asent, sense);
                }
                if (func.eql($sym61$REMOVAL_ABDUCTION_POS_REQUIRED)) {
                    return removal_modules_abduction.removal_abduction_pos_required(asent, sense);
                }
                if (func.eql($sym62$REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED)) {
                    return removal_modules_function_corresponding_predicate.removal_evaluatable_fcp_unify_required(asent, sense);
                }
                if (func.eql($sym63$REMOVAL_FCP_CHECK_REQUIRED)) {
                    return removal_modules_function_corresponding_predicate.removal_fcp_check_required(asent, sense);
                }
                if (func.eql($sym64$REMOVAL_ISA_DEFN_POS_REQUIRED)) {
                    return removal_modules_isa.removal_isa_defn_pos_required(asent, sense);
                }
                if (func.eql($sym65$REMOVAL_TVA_CHECK_REQUIRED)) {
                    return removal_modules_tva_lookup.removal_tva_check_required(asent, sense);
                }
                if (func.eql($sym66$REMOVAL_TVA_UNIFY_REQUIRED)) {
                    return removal_modules_tva_lookup.removal_tva_unify_required(asent, sense);
                }
                return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
            } finally {
                SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($INFERENCE, func, NIL, NIL, NIL);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 31900L)
    public static SubLObject removal_module_expand_func_funcall(SubLObject func, SubLObject asent, SubLObject sense) {
        if (func.eql($sym67$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND)) {
            return removal_modules_asserted_formula.removal_asserted_term_sentences_arg_index_unify_expand(asent, sense);
        }
        if (func.eql($sym68$REMOVAL_EVAL_EXPAND)) {
            return removal_modules_evaluation.removal_eval_expand(asent, sense);
        }
        if (func.eql($sym69$REMOVAL_EVALUATE_BIND_EXPAND)) {
            return removal_modules_evaluate.removal_evaluate_bind_expand(asent, sense);
        }
        if (func.eql($sym70$REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND)) {
            return removal_modules_isa.removal_isa_collection_check_neg_expand(asent, sense);
        }
        if (func.eql($sym71$REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND)) {
            return removal_modules_isa.removal_isa_collection_check_pos_expand(asent, sense);
        }
        if (func.eql($sym72$REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND)) {
            return removal_modules_natfunction.removal_nat_argument_lookup_expand(asent, sense);
        }
        if (func.eql($sym73$REMOVAL_NAT_FORMULA_EXPAND)) {
            return removal_modules_termofunit.removal_nat_formula_expand(asent, sense);
        }
        if (func.eql($sym74$REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND)) {
            return removal_modules_natfunction.removal_nat_function_lookup_expand(asent, sense);
        }
        if (func.eql($sym75$REMOVAL_NAT_LOOKUP_EXPAND)) {
            return removal_modules_termofunit.removal_nat_lookup_expand(asent, sense);
        }
        if (func.eql($sym76$REMOVAL_REFLEXIVE_ON_EXPAND)) {
            return removal_modules_reflexive_on.removal_reflexive_on_expand(asent, sense);
        }
        if (func.eql($sym77$REMOVAL_TVA_CHECK_EXPAND)) {
            return removal_modules_tva_lookup.removal_tva_check_expand(asent, sense);
        }
        return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 33200L)
    public static SubLObject determine_new_literal_removal_tactics(SubLObject problem, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return NIL;
        }
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject tactics = NIL;
        SubLObject store_var = store;
        SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
        try {
            control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
            determine_new_literal_simple_removal_tactics(problem, asent, sense);
            determine_new_literal_meta_removal_tactics(problem, asent, sense);
        } finally {
            control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
        }
        return tactics;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 33800L)
    public static SubLObject determine_new_literal_meta_removal_tactics(SubLObject problem, SubLObject asent, SubLObject sense) {
        SubLObject hl_modules = literal_meta_removal_candidate_hl_modules(asent, sense);
        return determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 34200L)
    public static SubLObject determine_new_literal_simple_removal_tactics(SubLObject problem, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != control_vars.$external_inference_enabled$.getDynamicValue(thread) && NIL != inference_modules.some_external_removal_modulesP()) {
            SubLObject external_tactics = determine_new_removal_tactics_from_hl_modules(inference_modules.removal_modules_external(), problem, asent, sense);
            if (NIL != external_tactics) {
                return external_tactics;
            }
        }
        SubLObject hl_modules = literal_simple_removal_candidate_hl_modules(asent, sense);
        return determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 35100L)
    public static SubLObject literal_removal_options(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != control_vars.$external_inference_enabled$.getDynamicValue(thread) && NIL != inference_modules.some_external_removal_modulesP()) {
            SubLObject external_tactic_specs = determine_new_removal_tactic_specs_from_hl_modules(inference_modules.removal_modules_external(), asent, sense);
            if (NIL != external_tactic_specs) {
                return external_tactic_specs;
            }
        }
        SubLObject hl_modules = literal_removal_options_hl_modules(asent, sense, allowed_modules_spec);
        return determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 36000L)
    public static SubLObject literal_removal_options_hl_modules(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
        SubLObject candidate_hl_modules = literal_removal_options_candidate_hl_modules(asent, sense, allowed_modules_spec);
        return filter_modules_wrt_allowed_modules_spec(candidate_hl_modules, allowed_modules_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 36300L)
    public static SubLObject filter_modules_wrt_allowed_modules_spec(SubLObject candidate_hl_modules, SubLObject allowed_modules_spec) {
        SubLObject hl_modules = NIL;
        if (allowed_modules_spec == $ALL) {
            hl_modules = candidate_hl_modules;
        } else {
            SubLObject cdolist_list_var = candidate_hl_modules;
            SubLObject module = NIL;
            module = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_modules.hl_module_allowed_by_allowed_modules_specP(module, allowed_modules_spec) || NIL != inference_modules.hl_module_exclusive_func(module)) {
                    hl_modules = cons(module, hl_modules);
                }
                cdolist_list_var = cdolist_list_var.rest();
                module = cdolist_list_var.first();
            }
            hl_modules = Sequences.nreverse(hl_modules);
        }
        return hl_modules;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 36900L)
    public static SubLObject literal_removal_options_candidate_hl_modules(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == $ALL) {
            return literal_simple_removal_candidate_hl_modules(asent, sense);
        }
        if (NIL != inference_modules.simple_allowed_modules_spec_p(allowed_modules_spec)) {
            return inference_modules.get_modules_from_simple_allowed_modules_spec(allowed_modules_spec);
        }
        return literal_simple_removal_candidate_hl_modules(asent, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 37300L)
    public static SubLObject hl_module_applicable_to_asentP(SubLObject hl_module, SubLObject asent) {
        return makeBoolean(NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, cycl_utilities.atomic_sentence_predicate(asent)) && NIL != inference_modules.hl_module_arity_relevant_p(hl_module, asent) && NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent)
                && NIL != inference_modules.hl_module_required_mt_relevantP(hl_module) && NIL != inference_modules.hl_module_direction_relevantP(hl_module));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 37800L)
    public static SubLObject determine_new_removal_tactics_from_hl_modules(SubLObject hl_modules, SubLObject problem, SubLObject asent, SubLObject sense) {
        SubLObject cdolist_list_var;
        SubLObject tactic_specs = cdolist_list_var = determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
        SubLObject tactic_spec = NIL;
        tactic_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = tactic_spec;
            SubLObject hl_module = NIL;
            SubLObject productivity = NIL;
            SubLObject completeness = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
            productivity = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
            completeness = current.first();
            current = current.rest();
            if (NIL == current) {
                new_removal_tactic(problem, hl_module, productivity, completeness);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list34);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        }
        return tactic_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 38300L)
    public static SubLObject determine_new_removal_tactic_specs_from_hl_modules(SubLObject hl_modules, SubLObject asent, SubLObject sense) {
        return hl_module_guts($DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES, hl_modules, asent, sense, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 38700L)
    public static SubLObject determine_new_removal_tactic_specs_from_hl_modules_guts(SubLObject candidate_hl_modules, SubLObject asent, SubLObject sense) {
        SubLObject applicable_hl_modules = determine_applicable_hl_modules_for_asent(candidate_hl_modules, asent, sense);
        SubLObject tactic_specs = compute_tactic_specs_for_asent(applicable_hl_modules, asent, sense);
        return tactic_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 39400L)
    public static SubLObject determine_applicable_hl_modules_for_asent(SubLObject candidate_hl_modules, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supplanted_hl_modules = NIL;
        SubLObject applicable_hl_modules = NIL;
        SubLObject totally_exclusive_foundP = NIL;
        if (NIL == totally_exclusive_foundP) {
            SubLObject csome_list_var = candidate_hl_modules;
            SubLObject hl_module = NIL;
            hl_module = csome_list_var.first();
            while (NIL == totally_exclusive_foundP && NIL != csome_list_var) {
                if (NIL == inference_modules.hl_module_exclusive_func(hl_module)) {
                    thread.resetMultipleValues();
                    SubLObject totally_exclusive_foundP_$16 = update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                    SubLObject applicable_hl_modules_$17 = thread.secondMultipleValue();
                    SubLObject supplanted_hl_modules_$18 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_$16;
                    applicable_hl_modules = applicable_hl_modules_$17;
                    supplanted_hl_modules = supplanted_hl_modules_$18;
                }
                csome_list_var = csome_list_var.rest();
                hl_module = csome_list_var.first();
            }
        }
        if (NIL == totally_exclusive_foundP) {
            SubLObject csome_list_var = candidate_hl_modules;
            SubLObject hl_module = NIL;
            hl_module = csome_list_var.first();
            while (NIL == totally_exclusive_foundP && NIL != csome_list_var) {
                if (NIL != inference_modules.hl_module_exclusive_func(hl_module)) {
                    thread.resetMultipleValues();
                    SubLObject totally_exclusive_foundP_$17 = update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                    SubLObject applicable_hl_modules_$18 = thread.secondMultipleValue();
                    SubLObject supplanted_hl_modules_$19 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_$17;
                    applicable_hl_modules = applicable_hl_modules_$18;
                    supplanted_hl_modules = supplanted_hl_modules_$19;
                }
                csome_list_var = csome_list_var.rest();
                hl_module = csome_list_var.first();
            }
        }
        return applicable_hl_modules;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 40600L)
    public static SubLObject update_applicable_hl_modules(SubLObject hl_module, SubLObject asent, SubLObject sense, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject totally_exclusive_foundP = NIL;
        if ((NIL == supplanted_hl_modules || NIL == list_utilities.member_eqP(hl_module, supplanted_hl_modules)) && NIL != hl_module_applicable_to_asentP(hl_module, asent)) {
            SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
            if (NIL == exclusive_func || (NIL != eval_in_api.possibly_cyc_api_function_spec_p(exclusive_func) && NIL != removal_module_exclusive_func_funcall(exclusive_func, asent, sense))) {
                if (NIL != exclusive_func) {
                    thread.resetMultipleValues();
                    SubLObject totally_exclusive_foundP_$22 = update_supplanted_hl_modules(hl_module, applicable_hl_modules, supplanted_hl_modules);
                    SubLObject applicable_hl_modules_$23 = thread.secondMultipleValue();
                    SubLObject supplanted_hl_modules_$24 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_$22;
                    applicable_hl_modules = applicable_hl_modules_$23;
                    supplanted_hl_modules = supplanted_hl_modules_$24;
                }
                SubLObject required_func = inference_modules.hl_module_required_func(hl_module);
                if (NIL == required_func || (NIL != eval_in_api.possibly_cyc_api_function_spec_p(required_func) && NIL != removal_module_required_func_funcall(required_func, asent, sense))) {
                    applicable_hl_modules = cons(hl_module, applicable_hl_modules);
                }
            }
        }
        return subl_promotions.values3(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 42300L)
    public static SubLObject update_supplanted_hl_modules(SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
        SubLObject supplants_info = inference_modules.hl_module_supplants_info(hl_module);
        SubLObject totally_exclusive_foundP = NIL;
        SubLObject pcase_var = supplants_info;
        if (pcase_var.eql($ALL)) {
            applicable_hl_modules = NIL;
            totally_exclusive_foundP = T;
        } else {
            SubLObject cdolist_list_var;
            SubLObject newly_supplanted_hl_module_patterns = cdolist_list_var = supplants_info;
            SubLObject supplanted_hl_module_pattern = NIL;
            supplanted_hl_module_pattern = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (supplanted_hl_module_pattern.isCons()) {
                    SubLObject patterns = list(supplanted_hl_module_pattern);
                    SubLObject negateP = NIL;
                    SubLObject pattern = NIL;
                    while (NIL != patterns) {
                        pattern = patterns.first();
                        patterns = patterns.rest();
                        SubLObject directive = pattern.first();
                        SubLObject rest = pattern.rest();
                        SubLObject pcase_var_$25 = directive;
                        if (pcase_var_$25.eql($NOT)) {
                            negateP = makeBoolean(NIL == negateP);
                            patterns = cons(rest.first(), patterns);
                        } else {
                            if (!pcase_var_$25.eql($MODULE_SUBTYPE)) {
                                continue;
                            }
                            SubLObject subtype = rest.first();
                            SubLObject cdolist_list_var_$26;
                            SubLObject newly_supplanted_hl_modules = cdolist_list_var_$26 = applicable_hl_modules;
                            SubLObject supplanted_hl_module = NIL;
                            supplanted_hl_module = cdolist_list_var_$26.first();
                            while (NIL != cdolist_list_var_$26) {
                                if ((NIL == negateP && NIL != list_utilities.member_eqP(subtype, inference_modules.hl_module_subtypes(supplanted_hl_module))) || (NIL != negateP && NIL == list_utilities.member_eqP(subtype, inference_modules.hl_module_subtypes(supplanted_hl_module)))) {
                                    applicable_hl_modules = list_utilities.delete_first(supplanted_hl_module, applicable_hl_modules, Symbols.symbol_function(EQ));
                                }
                                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                supplanted_hl_module = cdolist_list_var_$26.first();
                            }
                        }
                    }
                } else {
                    SubLObject item_var;
                    SubLObject supplanted_hl_module2 = item_var = inference_modules.find_hl_module_by_name(supplanted_hl_module_pattern);
                    if (NIL == conses_high.member(item_var, supplanted_hl_modules, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY))) {
                        supplanted_hl_modules = cons(item_var, supplanted_hl_modules);
                    }
                    if (NIL != list_utilities.member_eqP(supplanted_hl_module2, applicable_hl_modules)) {
                        applicable_hl_modules = list_utilities.delete_first(supplanted_hl_module2, applicable_hl_modules, Symbols.symbol_function(EQ));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supplanted_hl_module_pattern = cdolist_list_var.first();
            }
        }
        return subl_promotions.values3(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 44500L)
    public static SubLObject update_supplanted_modules_wrt_tactic_specs(SubLObject hl_module, SubLObject existing_tactic_specs, SubLObject supplanted_modules) {
        SubLObject supplants_info = inference_modules.hl_module_supplants_info(hl_module);
        SubLObject totally_exclusive_foundP = NIL;
        SubLObject pcase_var = supplants_info;
        if (pcase_var.eql($ALL)) {
            existing_tactic_specs = NIL;
            totally_exclusive_foundP = T;
        } else {
            SubLObject cdolist_list_var;
            SubLObject newly_supplanted_module_names = cdolist_list_var = supplants_info;
            SubLObject supplanted_module_name = NIL;
            supplanted_module_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject supplanted_module = inference_modules.find_hl_module_by_name(supplanted_module_name);
                supplanted_modules = cons(supplanted_module, supplanted_modules);
                SubLObject supplanted_tactic_spec = Sequences.find(supplanted_module, existing_tactic_specs, Symbols.symbol_function(EQ), Symbols.symbol_function($sym81$FIRST), UNPROVIDED, UNPROVIDED);
                if (NIL != supplanted_tactic_spec) {
                    existing_tactic_specs = list_utilities.delete_first(supplanted_tactic_spec, existing_tactic_specs, Symbols.symbol_function(EQUAL));
                    supplanted_tactic_spec = NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                supplanted_module_name = cdolist_list_var.first();
            }
        }
        return subl_promotions.values3(totally_exclusive_foundP, existing_tactic_specs, supplanted_modules);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 45900L)
    public static SubLObject compute_tactic_specs_for_asent(SubLObject applicable_hl_modules, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic_specs = NIL;
        SubLObject cdolist_list_var = applicable_hl_modules;
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cost = inference_modules.hl_module_cost(hl_module, asent, sense);
            if (NIL != cost) {
                if (NIL != control_vars.$maximum_hl_module_check_cost$.getDynamicValue(thread) && NIL != variables.fully_bound_p(asent) && cost.numG(control_vars.$maximum_hl_module_check_cost$.getDynamicValue(thread))) {
                    Errors.error($str82$For_sentence_____S__Maximum_HL_Mo, asent, hl_module, cost);
                }
                SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                SubLObject completeness = inference_modules.hl_module_completeness(hl_module, asent, UNPROVIDED);
                SubLObject tactic_spec = list(hl_module, productivity, completeness);
                tactic_specs = cons(tactic_spec, tactic_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        return tactic_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 46600L)
    public static SubLObject literal_simple_removal_candidate_hl_modules(SubLObject asent, SubLObject sense) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            return literal_removal_candidate_hl_modules_for_predicate_with_sense(predicate, sense);
        }
        return inference_modules.generic_removal_modules_for_sense(sense);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 46900L)
    public static SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense(SubLObject predicate, SubLObject sense) {
        SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference && NIL != inference_datastructures_inference.inference_problem_store_privateP(inference)) {
            SubLObject allowed_modules_spec = inference_datastructures_inference.inference_allowed_modules(inference);
            return literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, allowed_modules_spec);
        }
        return literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, $ALL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 47400L)
    public static SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(SubLObject predicate, SubLObject sense, SubLObject allowed_modules_spec) {
        SubLObject predicate_specific_removal_modules = inference_modules.removal_modules_specific_for_sense(predicate, sense);
        SubLObject universal_removal_modules = inference_modules.removal_modules_universal_for_predicate_and_sense(predicate, sense);
        SubLObject v_modules = NIL;
        if (NIL != inference_modules.solely_specific_removal_module_predicateP(predicate)) {
            v_modules = nconc(predicate_specific_removal_modules, universal_removal_modules);
        } else {
            v_modules = nconc(predicate_specific_removal_modules, inference_modules.generic_removal_modules_for_sense(sense), universal_removal_modules);
        }
        v_modules = filter_modules_wrt_allowed_modules_spec(v_modules, allowed_modules_spec);
        return v_modules;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 47400L)
    public static SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int(SubLObject predicate, SubLObject sense, SubLObject allowed_modules_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, THREE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, sense, allowed_modules_spec);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sense.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && allowed_modules_spec.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, sense, allowed_modules_spec));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 48400L)
    public static SubLObject literal_meta_removal_candidate_hl_modules(SubLObject asent, SubLObject sense) {
        if (sense == $NEG) {
            return NIL;
        }
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            return literal_meta_removal_candidate_hl_modules_for_predicate(predicate);
        }
        return inference_modules.meta_removal_module_list();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 48700L)
    public static SubLObject literal_meta_removal_candidate_hl_modules_for_predicate_internal(SubLObject predicate) {
        SubLObject v_meta_removal_modules = NIL;
        SubLObject cdolist_list_var = inference_modules.meta_removal_modules();
        SubLObject meta_removal_module = NIL;
        meta_removal_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_modules.predicate_uses_meta_removal_moduleP(predicate, meta_removal_module)) {
                v_meta_removal_modules = cons(meta_removal_module, v_meta_removal_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_removal_module = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_meta_removal_modules);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 48700L)
    public static SubLObject literal_meta_removal_candidate_hl_modules_for_predicate(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49100L)
    public static SubLObject literal_level_removal_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != removal_tactic_p(tactic) && NIL != inference_worker.literal_level_tactic_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49200L)
    public static SubLObject literal_level_meta_removal_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != meta_removal_tactic_p(tactic) && NIL != inference_worker.literal_level_tactic_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49400L)
    public static SubLObject new_removal_tactic(SubLObject problem, SubLObject hl_module, SubLObject productivity, SubLObject completeness) {
        SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$27 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$27, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$27);
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
            SubLObject idx_$28 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$28)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$28);
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

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49800L)
    public static SubLObject compute_strategic_properties_of_removal_tactic(SubLObject tactic, SubLObject strategy) {
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 50100L)
    public static SubLObject with_removal_tactic_execution_assumptions(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list85);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject tactic = NIL;
        SubLObject mt = NIL;
        SubLObject sense = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list85);
        tactic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list85);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list85);
        sense = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject tactic_var = $sym86$TACTIC_VAR;
            return ConsesLow.list($sym54$CLET, list(list(tactic_var, tactic)), ConsesLow.list($sym87$WITH_INFERENCE_MT_RELEVANCE, mt,
                    list($sym54$CLET, list(list($sym88$_INFERENCE_EXPAND_HL_MODULE_, list($sym89$TACTIC_HL_MODULE, tactic_var)), list($sym90$_INFERENCE_EXPAND_SENSE_, sense)), listS($sym91$WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS, list($sym92$TACTIC_STORE, tactic_var), append(body, NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list85);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 50600L)
    public static SubLObject execute_literal_level_removal_tactic(SubLObject tactic, SubLObject mt, SubLObject asent, SubLObject sense) {
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
            SubLObject _prev_bind_0_$29 = control_vars.$negation_by_failure$.currentBinding(thread);
            try {
                control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                    inference_datastructures_tactic.tactic_in_progress_next(tactic);
                } else {
                    SubLObject progress_iterator = maybe_make_removal_tactic_progress_iterator(tactic, asent, sense);
                    if (NIL != progress_iterator) {
                        if (progress_iterator.isList()) {
                            SubLObject cdolist_list_var = progress_iterator;
                            SubLObject execution_result = NIL;
                            execution_result = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                handle_one_removal_tactic_expand_result(tactic, execution_result);
                                cdolist_list_var = cdolist_list_var.rest();
                                execution_result = cdolist_list_var.first();
                            }
                        } else {
                            inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                        }
                    }
                }
            } finally {
                control_vars.$negation_by_failure$.rebind(_prev_bind_0_$29, thread);
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

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 51500L)
    public static SubLObject maybe_make_removal_tactic_progress_iterator(SubLObject tactic, SubLObject asent, SubLObject sense) {
        if (NIL != inference_modules.hl_module_output_generate_pattern(inference_datastructures_tactic.tactic_hl_module(tactic))) {
            return maybe_make_removal_tactic_output_generate_progress_iterator(tactic, asent);
        }
        return maybe_make_removal_tactic_expand_results_progress_iterator(tactic, asent, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 51900L)
    public static SubLObject maybe_make_removal_tactic_output_generate_progress_iterator(SubLObject tactic, SubLObject cycl_input_asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        thread.resetMultipleValues();
        SubLObject output_iterator = maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
        SubLObject encoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != output_iterator) {
            inference_datastructures_tactic.possibly_update_tactic_productivity_from_iterator(tactic, output_iterator);
            return new_removal_tactic_output_generate_progress_iterator(tactic, output_iterator, encoded_bindings);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 52500L)
    public static SubLObject new_removal_tactic_output_generate_progress_iterator(SubLObject tactic, SubLObject output_iterator, SubLObject encoded_bindings) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($REMOVAL_OUTPUT_GENERATE, tactic, list(output_iterator, encoded_bindings));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 52800L)
    public static SubLObject handle_one_removal_tactic_output_generate_result(SubLObject removal_tactic, SubLObject output_iterator, SubLObject encoded_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
        SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        SubLObject cycl_input_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        thread.resetMultipleValues();
        SubLObject raw_output = iteration.iteration_next(output_iterator);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            SubLObject _prev_bind_0 = backward.$removal_add_node_method$.currentBinding(thread);
            try {
                backward.$removal_add_node_method$.bind($sym94$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE, thread);
                inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, UNPROVIDED);
                result = handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
            } finally {
                backward.$removal_add_node_method$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 53600L)
    public static SubLObject handle_removal_add_node_for_output_generate(SubLObject removal_bindings, SubLObject supports) {
        removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
        SubLObject removal_tactic = inference_worker.currently_executing_tactic();
        return handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 54400L)
    public static SubLObject maybe_make_removal_tactic_expand_results_progress_iterator(SubLObject tactic, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expand_results = hl_module_guts($MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR, tactic, asent, sense, UNPROVIDED, UNPROVIDED);
        SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(Sequences.length(expand_results));
        inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
        if (NIL != list_utilities.lengthGE(expand_results, $removal_tactic_iteration_threshold$.getDynamicValue(thread), UNPROVIDED)) {
            expand_results = new_removal_tactic_expand_results_progress_iterator(tactic, expand_results);
        }
        return expand_results;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 55100L)
    public static SubLObject maybe_make_removal_tactic_expand_results_progress_iterator_guts(SubLObject tactic, SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expand_results = NIL;
        SubLObject _prev_bind_0 = $removal_tactic_expand_results_queue$.currentBinding(thread);
        try {
            $removal_tactic_expand_results_queue$.bind(NIL, thread);
            SubLObject _prev_bind_0_$30 = backward.$removal_add_node_method$.currentBinding(thread);
            try {
                backward.$removal_add_node_method$.bind($sym96$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS, thread);
                SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
                if (NIL != pattern) {
                    formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
                } else {
                    SubLObject function = inference_modules.hl_module_expand_func(hl_module);
                    if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(function)) {
                        removal_module_expand_func_funcall(function, asent, sense);
                    }
                }
            } finally {
                backward.$removal_add_node_method$.rebind(_prev_bind_0_$30, thread);
            }
            if (NIL != $removal_tactic_expand_results_queue$.getDynamicValue(thread)) {
                expand_results = Sequences.nreverse($removal_tactic_expand_results_queue$.getDynamicValue(thread));
            }
        } finally {
            $removal_tactic_expand_results_queue$.rebind(_prev_bind_0, thread);
        }
        return expand_results;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 56000L)
    public static SubLObject handle_removal_add_node_for_expand_results(SubLObject removal_bindings, SubLObject supports) {
        SubLThread thread = SubLProcess.currentSubLThread();
        removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
        $removal_tactic_expand_results_queue$.setDynamicValue(cons(list(removal_bindings, supports), $removal_tactic_expand_results_queue$.getDynamicValue(thread)), thread);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 56400L)
    public static SubLObject new_removal_tactic_expand_results_progress_iterator(SubLObject tactic, SubLObject expand_results) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($REMOVAL_EXPAND, tactic, expand_results);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 56600L)
    public static SubLObject handle_one_removal_tactic_expand_result(SubLObject removal_tactic, SubLObject expand_result) {
        SubLObject removal_bindings = NIL;
        SubLObject supports = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(expand_result, expand_result, $list98);
        removal_bindings = expand_result.first();
        SubLObject current = expand_result.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, expand_result, $list98);
        supports = current.first();
        current = current.rest();
        if (NIL == current) {
            inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, UNPROVIDED);
            return handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
        }
        cdestructuring_bind.cdestructuring_bind_error(expand_result, $list98);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 57000L)
    public static SubLObject handle_one_removal_tactic_result(SubLObject removal_tactic, SubLObject removal_bindings, SubLObject supports) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject result = NIL;
        if (NIL == variables.fully_bound_p(supports)) {
            control_vars.inference_warn($str99$Ignoring_result_from__S_due_to_op, inference_datastructures_tactic.tactic_hl_module(removal_tactic), UNPROVIDED);
        } else {
            thread.resetMultipleValues();
            SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
            SubLObject asent = thread.secondMultipleValue();
            SubLObject sense = thread.thirdMultipleValue();
            thread.resetMultipleValues();
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
                backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(removal_tactic), thread);
                backward.$inference_expand_sense$.bind(sense, thread);
                SubLObject store_var = inference_datastructures_tactic.tactic_store(removal_tactic);
                SubLObject _prev_bind_0_$31 = control_vars.$negation_by_failure$.currentBinding(thread);
                try {
                    control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                    if (NIL != removal_bindings && NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store)) {
                        result = maybe_new_restriction_and_removal_link(problem, removal_tactic, removal_bindings, supports);
                    } else {
                        result = maybe_new_removal_link(problem, removal_tactic, removal_bindings, supports);
                    }
                } finally {
                    control_vars.$negation_by_failure$.rebind(_prev_bind_0_$31, thread);
                }
            } finally {
                backward.$inference_expand_sense$.rebind(_prev_bind_5, thread);
                backward.$inference_expand_hl_module$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 58100L)
    public static SubLObject maybe_new_restriction_and_removal_link(SubLObject problem, SubLObject tactic, SubLObject removal_bindings, SubLObject supports) {
        SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
        maybe_new_removal_link(inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem), tactic, NIL, supports);
        return inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, NIL, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 58500L)
    public static SubLObject maybe_new_removal_link(SubLObject problem, SubLObject tactic, SubLObject removal_bindings, SubLObject supports) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        if (NIL == inference_datastructures_problem.tactically_good_problem_p(problem)) {
            return new_removal_link(problem, hl_module, removal_bindings, supports);
        }
        if (NIL != removal_tactic_p(tactic) && NIL == inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(inference_datastructures_problem.problem_store(problem))) {
            return new_removal_link(problem, hl_module, removal_bindings, supports);
        }
        SubLObject existing_link = find_removal_link(problem, tactic, removal_bindings, supports);
        if (NIL != inference_datastructures_problem_link.problem_link_p(existing_link)) {
            return existing_link;
        }
        return new_removal_link(problem, hl_module, removal_bindings, supports);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 60000L)
    public static SubLObject find_removal_link(SubLObject problem, SubLObject tactic, SubLObject v_bindings, SubLObject supports) {
        SubLObject candidate_argument_links = inference_datastructures_problem.problem_argument_links_lookup(problem, v_bindings);
        if (NIL != candidate_argument_links) {
            SubLObject cdolist_list_var = candidate_argument_links;
            SubLObject link = NIL;
            link = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != removal_link_p(link) && tactic.eql(removal_link_tactic(link)) && NIL != removal_link_data_equals_specP(link, v_bindings, supports)) {
                    return link;
                }
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 60500L)
    public static SubLObject new_removal_proof(SubLObject removal_link) {
        SubLObject removal_bindings = removal_link_bindings(removal_link);
        return inference_worker.propose_new_proof_with_bindings(removal_link, removal_bindings, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 60700L)
    public static SubLObject execute_literal_level_meta_removal_tactic(SubLObject tactic, SubLObject mt, SubLObject asent, SubLObject sense) {
        SubLObject strategy = inference_macros.current_controlling_strategy();
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject removal_tactics = inference_datastructures_problem.problem_possible_removal_tactics(problem);
        SubLObject cdolist_list_var;
        removal_tactics = (cdolist_list_var = Sort.sort(removal_tactics, Symbols.symbol_function($sym100$PRODUCTIVITY__), Symbols.symbol_function($sym101$TACTIC_PRODUCTIVITY)));
        SubLObject other_tactic = NIL;
        other_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!tactic.eql(other_tactic) && NIL == inference_datastructures_tactic.abductive_tacticP(other_tactic)) {
                while (NIL != inference_datastructures_tactic.tactic_possibleP(other_tactic)) {
                    inference_tactician.strategy_execute_tactic(strategy, other_tactic);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 61700L)
    public static SubLObject inference_remove_check_default(SubLObject cycl_input_asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = inference_current_hl_module();
        thread.resetMultipleValues();
        SubLObject cycl_input = inference_input_extractor(hl_module, cycl_input_asent, NIL);
        SubLObject extracted_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_input_verifier(hl_module, cycl_input)) {
            thread.resetMultipleValues();
            SubLObject raw_input = inference_input_encoder(hl_module, cycl_input, extracted_bindings);
            SubLObject encoded_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != inference_output_checker(hl_module, raw_input, encoded_bindings)) {
                thread.resetMultipleValues();
                SubLObject support = inference_support_constructor(hl_module, cycl_input_asent, encoded_bindings);
                SubLObject more_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                backward.removal_add_node(support, NIL, more_supports);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 63300L)
    public static SubLObject do_all_legacy_inference_outputs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list102);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject raw_output = NIL;
        SubLObject raw_output_iterator = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list102);
        raw_output = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list102);
        raw_output_iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject iterator = $sym103$ITERATOR;
            return list($sym54$CLET, list(list(iterator, raw_output_iterator)),
                    list($sym104$PIF, list($sym105$ITERATOR_P, iterator), list($sym106$CUNWIND_PROTECT, listS($sym107$DO_ITERATOR, list(raw_output, iterator), append(body, NIL)), list($sym108$ITERATION_FINALIZE, iterator)), listS($sym109$DO_LIST, list(raw_output, iterator), append(body, NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list102);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 63800L)
    public static SubLObject inference_remove_unify_default(SubLObject cycl_input_asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = inference_current_hl_module();
        thread.resetMultipleValues();
        SubLObject output_iterator = maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
        SubLObject encoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != output_iterator) {
            SubLObject iterator = output_iterator;
            if (NIL != iteration.iterator_p(iterator)) {
                try {
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        SubLObject raw_output = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                        }
                    }
                } finally {
                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values = Values.getValuesAsVector();
                        iteration.iteration_finalize(iterator);
                        Values.restoreValuesFromVector(_values);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                SubLObject cdolist_list_var = iterator;
                SubLObject raw_output = NIL;
                raw_output = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                    cdolist_list_var = cdolist_list_var.rest();
                    raw_output = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 64400L)
    public static SubLObject maybe_make_inference_output_iterator(SubLObject hl_module, SubLObject cycl_input_asent) {
        return hl_module_guts($MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR, hl_module, cycl_input_asent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 64600L)
    public static SubLObject maybe_make_inference_output_iterator_guts(SubLObject hl_module, SubLObject cycl_input_asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject cycl_input = inference_input_extractor(hl_module, cycl_input_asent, NIL);
        SubLObject extracted_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_input_verifier(hl_module, cycl_input)) {
            thread.resetMultipleValues();
            SubLObject raw_input = inference_input_encoder(hl_module, cycl_input, extracted_bindings);
            SubLObject encoded_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject output_iterator = inference_output_generator(hl_module, raw_input, encoded_bindings);
            return subl_promotions.values2(output_iterator, encoded_bindings);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 65200L)
    public static SubLObject handle_one_output_generate_result(SubLObject cycl_input_asent, SubLObject hl_module, SubLObject raw_output, SubLObject encoded_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject successP = hl_module_guts($HANDLE_ONE_OUTPUT_GENERATE_RESULT, cycl_input_asent, hl_module, raw_output, encoded_bindings, UNPROVIDED);
        SubLObject support = thread.secondMultipleValue();
        SubLObject unify_bindings = thread.thirdMultipleValue();
        SubLObject more_supports = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != successP) {
            return backward.removal_add_node(support, unify_bindings, more_supports);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 65600L)
    public static SubLObject handle_one_output_generate_result_guts(SubLObject cycl_input_asent, SubLObject hl_module, SubLObject raw_output, SubLObject encoded_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject cycl_output = inference_output_decoder(hl_module, raw_output, encoded_bindings);
        SubLObject decoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_output_verifier(hl_module, cycl_output)) {
            thread.resetMultipleValues();
            SubLObject cycl_output_asent = inference_output_constructor(hl_module, cycl_output, decoded_bindings);
            SubLObject constructed_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            SubLObject unify_bindings = unification_utilities.term_unify(cycl_input_asent, cycl_output_asent, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != unify_bindings) {
                thread.resetMultipleValues();
                SubLObject support = inference_support_constructor(hl_module, cycl_output_asent, constructed_bindings);
                SubLObject more_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return subl_promotions.values4(T, support, unify_bindings, append(more_supports, unify_justification));
            }
        }
        return subl_promotions.values4(NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 66400L)
    public static SubLObject inference_current_hl_module() {
        return backward.inference_expand_hl_module();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 66600L)
    public static SubLObject inference_current_sense() {
        return backward.inference_expand_sense();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 66800L)
    public static SubLObject inference_input_extractor(SubLObject hl_module, SubLObject cycl_input_asent, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        SubLObject pattern = inference_modules.hl_module_input_extract_pattern(hl_module);
        return formula_pattern_match.pattern_transform_formula(pattern, cycl_input_asent, v_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 67100L)
    public static SubLObject inference_input_verifier(SubLObject hl_module, SubLObject cycl_input) {
        SubLObject pattern = inference_modules.hl_module_input_verify_pattern(hl_module);
        return formula_pattern_match.pattern_matches_formula_without_bindings(pattern, cycl_input);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 67300L)
    public static SubLObject inference_input_encoder(SubLObject hl_module, SubLObject cycl_input, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        SubLObject pattern = inference_modules.hl_module_input_encode_pattern(hl_module);
        return pattern_match.pattern_transform_tree(pattern, cycl_input, v_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 67500L)
    public static SubLObject inference_output_checker(SubLObject hl_module, SubLObject raw_input, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        SubLObject pattern = inference_modules.hl_module_output_check_pattern(hl_module);
        if (NIL == pattern) {
            return NIL;
        }
        SubLObject output = pattern_match.pattern_transform_tree(pattern, raw_input, v_bindings);
        return list_utilities.sublisp_boolean(output);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 67900L)
    public static SubLObject inference_output_generator(SubLObject hl_module, SubLObject raw_input, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        SubLObject pattern = inference_modules.hl_module_output_generate_pattern(hl_module);
        if (NIL == pattern) {
            return NIL;
        }
        SubLObject output = pattern_match.pattern_transform_tree(pattern, raw_input, v_bindings);
        if (NIL != iteration.iterator_p(output)) {
            return output;
        }
        if (output.isList()) {
            return iteration.new_list_iterator(output);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 68400L)
    public static SubLObject inference_output_decoder(SubLObject hl_module, SubLObject raw_output, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        SubLObject pattern = inference_modules.hl_module_output_decode_pattern(hl_module);
        return pattern_match.pattern_transform_tree(pattern, raw_output, v_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 68700L)
    public static SubLObject inference_output_verifier(SubLObject hl_module, SubLObject cycl_output) {
        SubLObject pattern = inference_modules.hl_module_output_verify_pattern(hl_module);
        return formula_pattern_match.pattern_matches_formula_without_bindings(pattern, cycl_output);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 69000L)
    public static SubLObject inference_output_constructor(SubLObject hl_module, SubLObject cycl_output, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        SubLObject pattern = inference_modules.hl_module_output_construct_pattern(hl_module);
        return pattern_match.pattern_transform_tree(pattern, cycl_output, v_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 69200L)
    public static SubLObject inference_support_constructor(SubLObject hl_module, SubLObject cycl_output_asent, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_sense = inference_current_sense();
        SubLObject support_sentence = el_utilities.asent_and_sense_to_literal(cycl_output_asent, support_sense);
        SubLObject support_mt = inference_modules.hl_module_support_mt_result(hl_module);
        SubLObject pattern = inference_modules.hl_module_support_pattern(hl_module);
        if (NIL != pattern) {
            SubLObject current;
            SubLObject datum = current = formula_pattern_match.pattern_transform_formula(pattern, cycl_output_asent, v_bindings);
            SubLObject support = current.isCons() ? current.first() : NIL;
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list112);
            SubLObject more_supports;
            current = (more_supports = current.rest());
            return subl_promotions.values2(support, more_supports);
        }
        SubLObject support_func = inference_modules.hl_module_support_func(hl_module);
        if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(support_func)) {
            thread.resetMultipleValues();
            SubLObject support2 = eval_in_api.possibly_cyc_api_funcall_2(support_func, support_sentence, support_mt);
            SubLObject more_supports2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return subl_promotions.values2(support2, more_supports2);
        }
        SubLObject support_module = inference_modules.hl_module_support_module(hl_module);
        SubLObject support_strength = inference_modules.hl_module_support_strength(hl_module);
        SubLObject support_tv = enumeration_types.tv_from_truth_strength($TRUE, support_strength);
        SubLObject support3 = arguments.make_hl_support(support_module, support_sentence, support_mt, support_tv);
        SubLObject more_supports3 = NIL;
        return subl_promotions.values2(support3, more_supports3);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 70700L)
    public static SubLObject hl_module_guts(SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        if (type.eql($DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES)) {
            return determine_new_removal_tactic_specs_from_hl_modules_guts(arg1, arg2, arg3);
        }
        if (type.eql($MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR)) {
            return maybe_make_removal_tactic_expand_results_progress_iterator_guts(arg1, arg2, arg3);
        }
        if (type.eql($HANDLE_ONE_OUTPUT_GENERATE_RESULT)) {
            return handle_one_output_generate_result_guts(arg1, arg2, arg3, arg4);
        }
        if (type.eql($MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR)) {
            return maybe_make_inference_output_iterator_guts(arg1, arg2);
        }
        Errors.error($str114$unknown_thing_to_do_in_the_HL_mod, type);
        return NIL;
    }

    public static SubLObject declare_inference_worker_removal_file() {
        declareFunction("removal_link_data_print_function_trampoline", "REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("removal_link_data_p", "REMOVAL-LINK-DATA-P", 1, 0, false);
        new $removal_link_data_p$UnaryFunction();
        declareFunction("remov_link_data_hl_module", "REMOV-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction("remov_link_data_bindings", "REMOV-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction("remov_link_data_supports", "REMOV-LINK-DATA-SUPPORTS", 1, 0, false);
        declareFunction("_csetf_remov_link_data_hl_module", "_CSETF-REMOV-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction("_csetf_remov_link_data_bindings", "_CSETF-REMOV-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction("_csetf_remov_link_data_supports", "_CSETF-REMOV-LINK-DATA-SUPPORTS", 2, 0, false);
        declareFunction("make_removal_link_data", "MAKE-REMOVAL-LINK-DATA", 0, 1, false);
        declareFunction("visit_defstruct_removal_link_data", "VISIT-DEFSTRUCT-REMOVAL-LINK-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_removal_link_data_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-LINK-DATA-METHOD", 2, 0, false);
        declareFunction("new_removal_link", "NEW-REMOVAL-LINK", 4, 0, false);
        declareFunction("new_removal_link_int", "NEW-REMOVAL-LINK-INT", 4, 0, false);
        declareFunction("new_removal_link_data", "NEW-REMOVAL-LINK-DATA", 1, 0, false);
        declareFunction("destroy_removal_link", "DESTROY-REMOVAL-LINK", 1, 0, false);
        declareFunction("removal_link_hl_module", "REMOVAL-LINK-HL-MODULE", 1, 0, false);
        declareFunction("removal_link_bindings", "REMOVAL-LINK-BINDINGS", 1, 0, false);
        declareFunction("removal_link_supports", "REMOVAL-LINK-SUPPORTS", 1, 0, false);
        declareFunction("set_removal_link_hl_module", "SET-REMOVAL-LINK-HL-MODULE", 2, 0, false);
        declareFunction("set_removal_link_bindings", "SET-REMOVAL-LINK-BINDINGS", 2, 0, false);
        declareFunction("set_removal_link_supports", "SET-REMOVAL-LINK-SUPPORTS", 2, 0, false);
        declareFunction("removal_link_tactic", "REMOVAL-LINK-TACTIC", 1, 0, false);
        declareFunction("removal_link_data_equals_specP", "REMOVAL-LINK-DATA-EQUALS-SPEC?", 3, 0, false);
        declareFunction("generalized_removal_tactic_p", "GENERALIZED-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("conjunctive_removal_tactic_p", "CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("conjunctive_removal_link_p", "CONJUNCTIVE-REMOVAL-LINK-P", 1, 0, false);
        declareFunction("conjunctive_removal_proof_p", "CONJUNCTIVE-REMOVAL-PROOF-P", 1, 0, false);
        declareFunction("determine_new_conjunctive_removal_tactics", "DETERMINE-NEW-CONJUNCTIVE-REMOVAL-TACTICS", 2, 0, false);
        declareFunction("sort_applicable_conjunctive_removal_modules_by_priority", "SORT-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES-BY-PRIORITY", 1, 0, false);
        declareFunction("conjunctive_removal_module_priorityL", "CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<", 2, 0, false);
        declareFunction("determine_applicable_conjunctive_removal_modules", "DETERMINE-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES", 1, 0, false);
        declareFunction("motivated_multi_literal_subclause_specs", "MOTIVATED-MULTI-LITERAL-SUBCLAUSE-SPECS", 1, 0, false);
        declareFunction("hl_module_applicable_subclause_specs", "HL-MODULE-APPLICABLE-SUBCLAUSE-SPECS", 2, 0, false);
        declareFunction("new_conjunctive_removal_tactic", "NEW-CONJUNCTIVE-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("compute_strategic_properties_of_conjunctive_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-CONJUNCTIVE-REMOVAL-TACTIC", 2, 0, false);
        declareFunction("execute_conjunctive_removal_tactic", "EXECUTE-CONJUNCTIVE-REMOVAL-TACTIC", 1, 0, false);
        declareFunction("maybe_make_conjunctive_removal_tactic_progress_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction("maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 1, 0, false);
        declareFunction("new_conjunctive_removal_tactic_progress_expand_iterative_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 2, 0, false);
        declareFunction("handle_one_conjunctive_removal_tactic_expand_iterative_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-ITERATIVE-RESULT", 2, 0, false);
        declareFunction("maybe_make_conjunctive_removal_tactic_progress_expand_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 1, 0, false);
        declareFunction("new_conjunctive_removal_tactic_progress_expand_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 2, 0, false);
        declareFunction("conjunctive_removal_callback", "CONJUNCTIVE-REMOVAL-CALLBACK", 2, 0, false);
        declareFunction("handle_one_conjunctive_removal_tactic_expand_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
        declareFunction("conjunctive_removal_suppress_split_justificationP", "CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?", 0, 0, false);
        declareFunction("handle_one_conjunctive_removal_tactic_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-RESULT", 3, 0, false);
        declareFunction("maybe_new_simplification_link", "MAYBE-NEW-SIMPLIFICATION-LINK", 3, 0, false);
        declareFunction("maybe_new_restriction_split_and_removal_links", "MAYBE-NEW-RESTRICTION-SPLIT-AND-REMOVAL-LINKS", 4, 0, false);
        declareFunction("reorder_conjunctive_removal_justifications", "REORDER-CONJUNCTIVE-REMOVAL-JUSTIFICATIONS", 4, 0, false);
        declareFunction("maybe_new_split_and_removal_links", "MAYBE-NEW-SPLIT-AND-REMOVAL-LINKS", 3, 0, false);
        declareFunction("maybe_new_removal_link_for_split_link", "MAYBE-NEW-REMOVAL-LINK-FOR-SPLIT-LINK", 5, 0, false);
        declareFunction("executed_conjunctive_removal_problems", "EXECUTED-CONJUNCTIVE-REMOVAL-PROBLEMS", 1, 1, false);
        declareFunction("problem_store_has_some_executed_sksi_conjunctive_removal_problemP", "PROBLEM-STORE-HAS-SOME-EXECUTED-SKSI-CONJUNCTIVE-REMOVAL-PROBLEM?", 1, 0, false);
        declareFunction("executed_conjunctive_removal_tactic_p", "EXECUTED-CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
        declareMacro("with_problem_store_removal_assumptions", "WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");
        declareFunction("meta_removal_tactic_p", "META-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("compute_strategic_properties_of_meta_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-REMOVAL-TACTIC", 2, 0, false);
        declareFunction("removal_link_p", "REMOVAL-LINK-P", 1, 0, false);
        declareFunction("removal_tactic_p", "REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("removal_proof_p", "REMOVAL-PROOF-P", 1, 0, false);
        declareFunction("removal_module_exclusive_func_funcall", "REMOVAL-MODULE-EXCLUSIVE-FUNC-FUNCALL", 3, 0, false);
        declareFunction("removal_module_required_func_funcall", "REMOVAL-MODULE-REQUIRED-FUNC-FUNCALL", 3, 0, false);
        declareFunction("removal_module_expand_func_funcall", "REMOVAL-MODULE-EXPAND-FUNC-FUNCALL", 3, 0, false);
        declareFunction("determine_new_literal_removal_tactics", "DETERMINE-NEW-LITERAL-REMOVAL-TACTICS", 3, 0, false);
        declareFunction("determine_new_literal_meta_removal_tactics", "DETERMINE-NEW-LITERAL-META-REMOVAL-TACTICS", 3, 0, false);
        declareFunction("determine_new_literal_simple_removal_tactics", "DETERMINE-NEW-LITERAL-SIMPLE-REMOVAL-TACTICS", 3, 0, false);
        declareFunction("literal_removal_options", "LITERAL-REMOVAL-OPTIONS", 2, 1, false);
        declareFunction("literal_removal_options_hl_modules", "LITERAL-REMOVAL-OPTIONS-HL-MODULES", 3, 0, false);
        declareFunction("filter_modules_wrt_allowed_modules_spec", "FILTER-MODULES-WRT-ALLOWED-MODULES-SPEC", 2, 0, false);
        declareFunction("literal_removal_options_candidate_hl_modules", "LITERAL-REMOVAL-OPTIONS-CANDIDATE-HL-MODULES", 3, 0, false);
        declareFunction("hl_module_applicable_to_asentP", "HL-MODULE-APPLICABLE-TO-ASENT?", 2, 0, false);
        declareFunction("determine_new_removal_tactics_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTICS-FROM-HL-MODULES", 4, 0, false);
        declareFunction("determine_new_removal_tactic_specs_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES", 3, 0, false);
        declareFunction("determine_new_removal_tactic_specs_from_hl_modules_guts", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES-GUTS", 3, 0, false);
        declareFunction("determine_applicable_hl_modules_for_asent", "DETERMINE-APPLICABLE-HL-MODULES-FOR-ASENT", 3, 0, false);
        declareFunction("update_applicable_hl_modules", "UPDATE-APPLICABLE-HL-MODULES", 5, 0, false);
        declareFunction("update_supplanted_hl_modules", "UPDATE-SUPPLANTED-HL-MODULES", 3, 0, false);
        declareFunction("update_supplanted_modules_wrt_tactic_specs", "UPDATE-SUPPLANTED-MODULES-WRT-TACTIC-SPECS", 3, 0, false);
        declareFunction("compute_tactic_specs_for_asent", "COMPUTE-TACTIC-SPECS-FOR-ASENT", 3, 0, false);
        declareFunction("literal_simple_removal_candidate_hl_modules", "LITERAL-SIMPLE-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
        declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE", 2, 0, false);
        declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT-INTERNAL", 3, 0, false);
        declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense_int", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT", 3, 0, false);
        declareFunction("literal_meta_removal_candidate_hl_modules", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
        declareFunction("literal_meta_removal_candidate_hl_modules_for_predicate_internal", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-INTERNAL", 1, 0, false);
        declareFunction("literal_meta_removal_candidate_hl_modules_for_predicate", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE", 1, 0, false);
        declareFunction("literal_level_removal_tactic_p", "LITERAL-LEVEL-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("literal_level_meta_removal_tactic_p", "LITERAL-LEVEL-META-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("new_removal_tactic", "NEW-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("compute_strategic_properties_of_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REMOVAL-TACTIC", 2, 0, false);
        declareMacro("with_removal_tactic_execution_assumptions", "WITH-REMOVAL-TACTIC-EXECUTION-ASSUMPTIONS");
        declareFunction("execute_literal_level_removal_tactic", "EXECUTE-LITERAL-LEVEL-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("maybe_make_removal_tactic_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("maybe_make_removal_tactic_output_generate_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction("new_removal_tactic_output_generate_progress_iterator", "NEW-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("handle_one_removal_tactic_output_generate_result", "HANDLE-ONE-REMOVAL-TACTIC-OUTPUT-GENERATE-RESULT", 3, 0, false);
        declareFunction("handle_removal_add_node_for_output_generate", "HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE", 2, 0, false);
        declareFunction("maybe_make_removal_tactic_expand_results_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("maybe_make_removal_tactic_expand_results_progress_iterator_guts", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR-GUTS", 3, 0, false);
        declareFunction("handle_removal_add_node_for_expand_results", "HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS", 2, 0, false);
        declareFunction("new_removal_tactic_expand_results_progress_iterator", "NEW-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction("handle_one_removal_tactic_expand_result", "HANDLE-ONE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
        declareFunction("handle_one_removal_tactic_result", "HANDLE-ONE-REMOVAL-TACTIC-RESULT", 3, 0, false);
        declareFunction("maybe_new_restriction_and_removal_link", "MAYBE-NEW-RESTRICTION-AND-REMOVAL-LINK", 4, 0, false);
        declareFunction("maybe_new_removal_link", "MAYBE-NEW-REMOVAL-LINK", 4, 0, false);
        declareFunction("find_removal_link", "FIND-REMOVAL-LINK", 4, 0, false);
        declareFunction("new_removal_proof", "NEW-REMOVAL-PROOF", 1, 0, false);
        declareFunction("execute_literal_level_meta_removal_tactic", "EXECUTE-LITERAL-LEVEL-META-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("inference_remove_check_default", "INFERENCE-REMOVE-CHECK-DEFAULT", 1, 1, false);
        declareMacro("do_all_legacy_inference_outputs", "DO-ALL-LEGACY-INFERENCE-OUTPUTS");
        declareFunction("inference_remove_unify_default", "INFERENCE-REMOVE-UNIFY-DEFAULT", 1, 1, false);
        new $inference_remove_unify_default$UnaryFunction();
        new $inference_remove_unify_default$BinaryFunction();
        declareFunction("maybe_make_inference_output_iterator", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR", 2, 0, false);
        declareFunction("maybe_make_inference_output_iterator_guts", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR-GUTS", 2, 0, false);
        declareFunction("handle_one_output_generate_result", "HANDLE-ONE-OUTPUT-GENERATE-RESULT", 4, 0, false);
        declareFunction("handle_one_output_generate_result_guts", "HANDLE-ONE-OUTPUT-GENERATE-RESULT-GUTS", 4, 0, false);
        declareFunction("inference_current_hl_module", "INFERENCE-CURRENT-HL-MODULE", 0, 0, false);
        declareFunction("inference_current_sense", "INFERENCE-CURRENT-SENSE", 0, 0, false);
        declareFunction("inference_input_extractor", "INFERENCE-INPUT-EXTRACTOR", 2, 1, false);
        declareFunction("inference_input_verifier", "INFERENCE-INPUT-VERIFIER", 2, 0, false);
        declareFunction("inference_input_encoder", "INFERENCE-INPUT-ENCODER", 2, 1, false);
        declareFunction("inference_output_checker", "INFERENCE-OUTPUT-CHECKER", 2, 1, false);
        declareFunction("inference_output_generator", "INFERENCE-OUTPUT-GENERATOR", 2, 1, false);
        declareFunction("inference_output_decoder", "INFERENCE-OUTPUT-DECODER", 2, 1, false);
        declareFunction("inference_output_verifier", "INFERENCE-OUTPUT-VERIFIER", 2, 0, false);
        declareFunction("inference_output_constructor", "INFERENCE-OUTPUT-CONSTRUCTOR", 2, 1, false);
        declareFunction("inference_support_constructor", "INFERENCE-SUPPORT-CONSTRUCTOR", 2, 1, false);
        declareFunction("hl_module_guts", "HL-MODULE-GUTS", 1, 5, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_removal_file() {
        $dtp_removal_link_data$ = defconstant("*DTP-REMOVAL-LINK-DATA*", $sym0$REMOVAL_LINK_DATA);
        $conjunctive_removal_tactic_expand_results_queue$ = SubLFiles.defparameter("*CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*", NIL);
        $conjunctive_removal_suppress_split_justificationP$ = SubLFiles.defparameter("*CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?*", T);
        $conjunctive_removal_optimize_when_no_justificationsP$ = SubLFiles.defparameter("*CONJUNCTIVE-REMOVAL-OPTIMIZE-WHEN-NO-JUSTIFICATIONS?*", T);
        $removal_tactic_iteration_threshold$ = defparameter("*REMOVAL-TACTIC-ITERATION-THRESHOLD*", TWO_INTEGER);
        $removal_tactic_expand_results_queue$ = defparameter("*REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_worker_removal_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_removal_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        Structures.def_csetf($sym9$REMOV_LINK_DATA_HL_MODULE, $sym10$_CSETF_REMOV_LINK_DATA_HL_MODULE);
        Structures.def_csetf($sym11$REMOV_LINK_DATA_BINDINGS, $sym12$_CSETF_REMOV_LINK_DATA_BINDINGS);
        Structures.def_csetf($sym13$REMOV_LINK_DATA_SUPPORTS, $sym14$_CSETF_REMOV_LINK_DATA_SUPPORTS);
        Equality.identity($sym0$REMOVAL_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_removal_link_data$.getGlobalValue(), Symbols.symbol_function($sym23$VISIT_DEFSTRUCT_OBJECT_REMOVAL_LINK_DATA_METHOD));
        memoization_state.note_memoized_function($sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT);
        memoization_state.note_memoized_function($sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_removal_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_removal_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_removal_file();
    }

    static {
        me = new inference_worker_removal();
        $dtp_removal_link_data$ = null;
        $conjunctive_removal_tactic_expand_results_queue$ = null;
        $conjunctive_removal_suppress_split_justificationP$ = null;
        $conjunctive_removal_optimize_when_no_justificationsP$ = null;
        $removal_tactic_iteration_threshold$ = null;
        $removal_tactic_expand_results_queue$ = null;
        $sym0$REMOVAL_LINK_DATA = makeSymbol("REMOVAL-LINK-DATA");
        $sym1$REMOVAL_LINK_DATA_P = makeSymbol("REMOVAL-LINK-DATA-P");
        $list2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
        $list3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));
        $list4 = list(makeSymbol("REMOV-LINK-DATA-HL-MODULE"), makeSymbol("REMOV-LINK-DATA-BINDINGS"), makeSymbol("REMOV-LINK-DATA-SUPPORTS"));
        $list5 = list(makeSymbol("_CSETF-REMOV-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-REMOV-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-REMOV-LINK-DATA-SUPPORTS"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOVAL-LINK-DATA-P"));
        $sym9$REMOV_LINK_DATA_HL_MODULE = makeSymbol("REMOV-LINK-DATA-HL-MODULE");
        $sym10$_CSETF_REMOV_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-REMOV-LINK-DATA-HL-MODULE");
        $sym11$REMOV_LINK_DATA_BINDINGS = makeSymbol("REMOV-LINK-DATA-BINDINGS");
        $sym12$_CSETF_REMOV_LINK_DATA_BINDINGS = makeSymbol("_CSETF-REMOV-LINK-DATA-BINDINGS");
        $sym13$REMOV_LINK_DATA_SUPPORTS = makeSymbol("REMOV-LINK-DATA-SUPPORTS");
        $sym14$_CSETF_REMOV_LINK_DATA_SUPPORTS = makeSymbol("_CSETF-REMOV-LINK-DATA-SUPPORTS");
        $HL_MODULE = makeKeyword("HL-MODULE");
        $BINDINGS = makeKeyword("BINDINGS");
        $SUPPORTS = makeKeyword("SUPPORTS");
        $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym20$MAKE_REMOVAL_LINK_DATA = makeSymbol("MAKE-REMOVAL-LINK-DATA");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym23$VISIT_DEFSTRUCT_OBJECT_REMOVAL_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-LINK-DATA-METHOD");
        $sym24$PROBLEM_P = makeSymbol("PROBLEM-P");
        $REMOVAL = makeKeyword("REMOVAL");
        $FREE = makeKeyword("FREE");
        $sym27$REMOVAL_LINK_P = makeSymbol("REMOVAL-LINK-P");
        $sym28$HL_MODULE_P = makeSymbol("HL-MODULE-P");
        $sym29$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
        $sym30$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $SPLIT = makeKeyword("SPLIT");
        $REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
        $list34 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));
        $sym35$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_ = makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<");
        $ALL = makeKeyword("ALL");
        $INFERENCE = makeKeyword("INFERENCE");
        $str38$_s_stated_its_applicability_to_th = makeString("~s stated its applicability to the subclause spec ~s, which does not specify more than one literal.\nConjunctive removal modules must apply to more than one literal in the clause.");
        $SKIP = makeKeyword("SKIP");
        $TACTICAL = makeKeyword("TACTICAL");
        $list41 = list(makeSymbol("REMOVAL-BINDINGS"), makeSymbol("JUSTIFICATIONS"));
        $CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");
        $sym43$HL_VAR_ = makeSymbol("HL-VAR?");
        $CONJUNCTIVE_REMOVAL_EXPAND = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");
        $INFERENCE_PROOF_SPEC = makeKeyword("INFERENCE-PROOF-SPEC");
        $str46$Problem_reuse_assumptions_were_vi = makeString("Problem reuse assumptions were violated: ~a did not equal ~a");
        $str47$Couldn_t_find_the_right_conjuncti = makeString("Couldn't find the right conjunctive removal justification for ~S");
        $NEG = makeKeyword("NEG");
        $POS = makeKeyword("POS");
        $list50 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));
        $SKSI = makeKeyword("SKSI");
        $list52 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym53$STORE_VAR = makeUninternedSymbol("STORE-VAR");
        $sym54$CLET = makeSymbol("CLET");
        $sym55$_NEGATION_BY_FAILURE_ = makeSymbol("*NEGATION-BY-FAILURE*");
        $sym56$PROBLEM_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");
        $META_REMOVAL = makeKeyword("META-REMOVAL");
        $sym58$META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED = makeSymbol("META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED");
        $sym59$_EXIT = makeSymbol("%EXIT");
        $sym60$META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED = makeSymbol("META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED");
        $sym61$REMOVAL_ABDUCTION_POS_REQUIRED = makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED");
        $sym62$REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED = makeSymbol("REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED");
        $sym63$REMOVAL_FCP_CHECK_REQUIRED = makeSymbol("REMOVAL-FCP-CHECK-REQUIRED");
        $sym64$REMOVAL_ISA_DEFN_POS_REQUIRED = makeSymbol("REMOVAL-ISA-DEFN-POS-REQUIRED");
        $sym65$REMOVAL_TVA_CHECK_REQUIRED = makeSymbol("REMOVAL-TVA-CHECK-REQUIRED");
        $sym66$REMOVAL_TVA_UNIFY_REQUIRED = makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED");
        $sym67$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND = makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND");
        $sym68$REMOVAL_EVAL_EXPAND = makeSymbol("REMOVAL-EVAL-EXPAND");
        $sym69$REMOVAL_EVALUATE_BIND_EXPAND = makeSymbol("REMOVAL-EVALUATE-BIND-EXPAND");
        $sym70$REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND = makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND");
        $sym71$REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND = makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND");
        $sym72$REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND = makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND");
        $sym73$REMOVAL_NAT_FORMULA_EXPAND = makeSymbol("REMOVAL-NAT-FORMULA-EXPAND");
        $sym74$REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND = makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND");
        $sym75$REMOVAL_NAT_LOOKUP_EXPAND = makeSymbol("REMOVAL-NAT-LOOKUP-EXPAND");
        $sym76$REMOVAL_REFLEXIVE_ON_EXPAND = makeSymbol("REMOVAL-REFLEXIVE-ON-EXPAND");
        $sym77$REMOVAL_TVA_CHECK_EXPAND = makeSymbol("REMOVAL-TVA-CHECK-EXPAND");
        $DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES = makeKeyword("DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES");
        $NOT = makeKeyword("NOT");
        $MODULE_SUBTYPE = makeKeyword("MODULE-SUBTYPE");
        $sym81$FIRST = makeSymbol("FIRST");
        $str82$For_sentence_____S__Maximum_HL_Mo = makeString("For sentence :~%~S~%Maximum HL Module check cost exceeded by ~A (~A).");
        $sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT = makeSymbol("LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT");
        $sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE = makeSymbol("LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE");
        $list85 = list(list(makeSymbol("TACTIC"), makeSymbol("MT"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym86$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");
        $sym87$WITH_INFERENCE_MT_RELEVANCE = makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $sym88$_INFERENCE_EXPAND_HL_MODULE_ = makeSymbol("*INFERENCE-EXPAND-HL-MODULE*");
        $sym89$TACTIC_HL_MODULE = makeSymbol("TACTIC-HL-MODULE");
        $sym90$_INFERENCE_EXPAND_SENSE_ = makeSymbol("*INFERENCE-EXPAND-SENSE*");
        $sym91$WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS = makeSymbol("WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");
        $sym92$TACTIC_STORE = makeSymbol("TACTIC-STORE");
        $REMOVAL_OUTPUT_GENERATE = makeKeyword("REMOVAL-OUTPUT-GENERATE");
        $sym94$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE");
        $MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR = makeKeyword("MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR");
        $sym96$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS");
        $REMOVAL_EXPAND = makeKeyword("REMOVAL-EXPAND");
        $list98 = list(makeSymbol("REMOVAL-BINDINGS"), makeSymbol("SUPPORTS"));
        $str99$Ignoring_result_from__S_due_to_op = makeString("Ignoring result from ~S due to open supports");
        $sym100$PRODUCTIVITY__ = makeSymbol("PRODUCTIVITY-<");
        $sym101$TACTIC_PRODUCTIVITY = makeSymbol("TACTIC-PRODUCTIVITY");
        $list102 = list(list(makeSymbol("RAW-OUTPUT"), makeSymbol("RAW-OUTPUT-ITERATOR")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym103$ITERATOR = makeUninternedSymbol("ITERATOR");
        $sym104$PIF = makeSymbol("PIF");
        $sym105$ITERATOR_P = makeSymbol("ITERATOR-P");
        $sym106$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
        $sym107$DO_ITERATOR = makeSymbol("DO-ITERATOR");
        $sym108$ITERATION_FINALIZE = makeSymbol("ITERATION-FINALIZE");
        $sym109$DO_LIST = makeSymbol("DO-LIST");
        $MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR = makeKeyword("MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR");
        $HANDLE_ONE_OUTPUT_GENERATE_RESULT = makeKeyword("HANDLE-ONE-OUTPUT-GENERATE-RESULT");
        $list112 = list(makeSymbol("&OPTIONAL"), makeSymbol("SUPPORT"), makeSymbol("&REST"), makeSymbol("MORE-SUPPORTS"));
        $TRUE = makeKeyword("TRUE");
        $str114$unknown_thing_to_do_in_the_HL_mod = makeString("unknown thing to do in the HL module guts: ~s");
    }

    public static class $removal_link_data_native extends SubLStructNative {
        public SubLObject $hl_module;
        public SubLObject $bindings;
        public SubLObject $supports;
        private static SubLStructDeclNative structDecl;

        public $removal_link_data_native() {
            this.$hl_module = CommonSymbols.NIL;
            this.$bindings = CommonSymbols.NIL;
            this.$supports = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $removal_link_data_native.structDecl;
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

        static {
            structDecl = Structures.makeStructDeclNative($removal_link_data_native.class, $sym0$REMOVAL_LINK_DATA, $sym1$REMOVAL_LINK_DATA_P, $list2, $list3, new String[] { "$hl_module", "$bindings", "$supports" }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $removal_link_data_p$UnaryFunction extends UnaryFunction {
        public $removal_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_link_data_p(arg1);
        }
    }

    public static class $inference_remove_unify_default$UnaryFunction extends UnaryFunction {
        public $inference_remove_unify_default$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-REMOVE-UNIFY-DEFAULT"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_remove_unify_default(arg1, $inference_remove_unify_default$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $inference_remove_unify_default$BinaryFunction extends BinaryFunction {
        public $inference_remove_unify_default$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-REMOVE-UNIFY-DEFAULT"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return inference_remove_unify_default(arg1, arg2);
        }
    }
}
/*
 *
 * Total time: 693 ms
 *
 */