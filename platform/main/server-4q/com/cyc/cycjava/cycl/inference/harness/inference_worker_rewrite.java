package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_worker_rewrite extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite";
    public static String myFingerPrint = "9053030c73d090be4d851064c423f073352b5bd2b8ba727e03aa471de4ded15f";
    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLSymbol $dtp_rewrite_link_data$;
    private static SubLSymbol $sym0$REWRITE_LINK_DATA;
    private static SubLSymbol $sym1$REWRITE_LINK_DATA_P;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym7$REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list8;
    private static SubLSymbol $sym9$RW_LINK_DATA_HL_MODULE;
    private static SubLSymbol $sym10$_CSETF_RW_LINK_DATA_HL_MODULE;
    private static SubLSymbol $sym11$RW_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym12$_CSETF_RW_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym13$RW_LINK_DATA_SUPPORTS;
    private static SubLSymbol $sym14$_CSETF_RW_LINK_DATA_SUPPORTS;
    private static SubLSymbol $HL_MODULE;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $SUPPORTS;
    private static SubLString $str18$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym20$MAKE_REWRITE_LINK_DATA;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_REWRITE_LINK_DATA_METHOD;
    private static SubLSymbol $sym24$PROBLEM_P;
    private static SubLSymbol $sym25$MAPPED_PROBLEM_P;
    private static SubLSymbol $sym26$HL_MODULE_P;
    private static SubLSymbol $REWRITE;
    private static SubLSymbol $UNDETERMINED;
    private static SubLSymbol $FREE;
    private static SubLSymbol $sym30$REWRITE_LINK_P;
    private static SubLString $str31$Bindings__a_are_not_valid_rewrite;
    private static SubLSymbol $sym32$HL_JUSTIFICATION_P;
    private static SubLString $str33$No_tactic_found_for__S;
    private static SubLSymbol $COMPLETE;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym36$PROBLEM_QUERY_P;
    private static SubLList $list37;
    private static SubLSymbol $sym38$PROOF_P;
    private static SubLSymbol $sym39$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P;

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject rewrite_link_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject rewrite_link_data_p(SubLObject v_object) {
        return (v_object.getClass() == $rewrite_link_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject rw_link_data_hl_module(SubLObject v_object) {
        assert NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject rw_link_data_bindings(SubLObject v_object) {
        assert NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject rw_link_data_supports(SubLObject v_object) {
        assert NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject _csetf_rw_link_data_hl_module(SubLObject v_object, SubLObject value) {
        assert NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject _csetf_rw_link_data_bindings(SubLObject v_object, SubLObject value) {
        assert NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject _csetf_rw_link_data_supports(SubLObject v_object, SubLObject value) {
        assert NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject make_rewrite_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $rewrite_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HL_MODULE)) {
                _csetf_rw_link_data_hl_module(v_new, current_value);
            } else if (pcase_var.eql($BINDINGS)) {
                _csetf_rw_link_data_bindings(v_new, current_value);
            } else if (pcase_var.eql($SUPPORTS)) {
                _csetf_rw_link_data_supports(v_new, current_value);
            } else {
                Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject visit_defstruct_rewrite_link_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym20$MAKE_REWRITE_LINK_DATA, THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $HL_MODULE, rw_link_data_hl_module(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $BINDINGS, rw_link_data_bindings(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SUPPORTS, rw_link_data_supports(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym20$MAKE_REWRITE_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1000L)
    public static SubLObject visit_defstruct_object_rewrite_link_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_rewrite_link_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1600L)
    public static SubLObject new_rewrite_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject hl_module, SubLObject supports) {
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        if (NIL != supporting_mapped_problem && !assertionsDisabledInClass && NIL == inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem)) {
            throw new AssertionError(supporting_mapped_problem);
        }
        assert NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        SubLObject rewrite_link = new_rewrite_link_int(supported_problem, hl_module, supports);
        if (NIL != supporting_mapped_problem) {
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, rewrite_link);
        }
        inference_datastructures_problem_link.problem_link_open_all(rewrite_link);
        inference_worker.propagate_problem_link(rewrite_link);
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 2200L)
    public static SubLObject new_rewrite_link_int(SubLObject problem, SubLObject hl_module, SubLObject supports) {
        SubLObject rewrite_link = inference_datastructures_problem_link.new_problem_link($REWRITE, problem);
        new_rewrite_link_data(rewrite_link);
        set_rewrite_link_hl_module(rewrite_link, hl_module);
        set_rewrite_link_bindings(rewrite_link, $UNDETERMINED);
        set_rewrite_link_supports(rewrite_link, supports);
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 2700L)
    public static SubLObject new_rewrite_link_data(SubLObject rewrite_link) {
        SubLObject data = make_rewrite_link_data(UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(rewrite_link, data);
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 2900L)
    public static SubLObject destroy_rewrite_link(SubLObject rewrite_link) {
        SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        _csetf_rw_link_data_hl_module(data, $FREE);
        _csetf_rw_link_data_bindings(data, $FREE);
        _csetf_rw_link_data_supports(data, $FREE);
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 3200L)
    public static SubLObject rewrite_link_hl_module(SubLObject rewrite_link) {
        assert NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        return rw_link_data_hl_module(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 3400L)
    public static SubLObject rewrite_link_bindings(SubLObject rewrite_link) {
        assert NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        SubLObject v_bindings = rw_link_data_bindings(data);
        if (v_bindings == $UNDETERMINED) {
            v_bindings = compute_rewrite_bindings(rewrite_link);
            _csetf_rw_link_data_bindings(data, v_bindings);
        }
        return v_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 3900L)
    public static SubLObject rewrite_link_supports(SubLObject rewrite_link) {
        assert NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        return rw_link_data_supports(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 4100L)
    public static SubLObject set_rewrite_link_hl_module(SubLObject rewrite_link, SubLObject hl_module) {
        assert NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        assert NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        _csetf_rw_link_data_hl_module(data, hl_module);
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 4400L)
    public static SubLObject set_rewrite_link_bindings(SubLObject rewrite_link, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == bindings.binding_list_p(v_bindings) && v_bindings != $UNDETERMINED) {
            Errors.error($str31$Bindings__a_are_not_valid_rewrite, v_bindings);
        }
        SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        _csetf_rw_link_data_bindings(data, v_bindings);
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 4800L)
    public static SubLObject set_rewrite_link_supports(SubLObject rewrite_link, SubLObject supports) {
        assert NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        assert NIL != arguments.hl_justification_p(supports) : supports;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        _csetf_rw_link_data_supports(data, supports);
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 5100L)
    public static SubLObject rewrite_link_tactic(SubLObject rewrite_link) {
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
        SubLObject hl_module = rewrite_link_hl_module(rewrite_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject candidate_tactic = NIL;
        candidate_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $REWRITE) && hl_module.eql(inference_datastructures_tactic.tactic_hl_module(candidate_tactic))) {
                return candidate_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_tactic = cdolist_list_var.first();
        }
        if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
            return Errors.error($str33$No_tactic_found_for__S, rewrite_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 5500L)
    public static SubLObject rewrite_link_supporting_mapped_problem(SubLObject rewrite_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(rewrite_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 5700L)
    public static SubLObject rewrite_link_supporting_variable_map(SubLObject rewrite_link) {
        SubLObject supporting_mapped_problem = rewrite_link_supporting_mapped_problem(rewrite_link);
        if (NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6000L)
    public static SubLObject rewrite_link_rewrite_mt(SubLObject rewrite_link) {
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
        return inference_datastructures_problem.single_literal_problem_mt(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6200L)
    public static SubLObject rewrite_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_link.problem_link_p(v_object) && $REWRITE == inference_datastructures_problem_link.problem_link_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6400L)
    public static SubLObject rewrite_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(tactic) && $REWRITE == inference_datastructures_tactic.tactic_type(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6500L)
    public static SubLObject rewrite_tactic_support(SubLObject tactic) {
        return inference_modules.rewrite_module_support(inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6700L)
    public static SubLObject rewrite_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(v_object) && NIL != rewrite_link_p(inference_datastructures_proof.proof_link(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6800L)
    public static SubLObject determine_new_literal_rewrite_tactics(SubLObject problem, SubLObject asent, SubLObject sense, SubLObject disabled_hl_modules) {
        if (disabled_hl_modules == UNPROVIDED) {
            disabled_hl_modules = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic_specs = NIL;
        SubLObject supplanted_hl_modules = NIL;
        SubLObject exclusive_foundP;
        SubLObject rest;
        SubLObject hl_module;
        SubLObject exclusive_func;
        SubLObject exclusive_foundP_$1;
        SubLObject tactic_specs_$2;
        SubLObject supplanted_hl_modules_$3;
        SubLObject required_func;
        SubLObject cost;
        SubLObject productivity;
        SubLObject completeness;
        SubLObject tactic_spec;
        for (exclusive_foundP = NIL, rest = NIL, rest = inference_modules.rewrite_modules(); NIL == exclusive_foundP && NIL != rest; rest = rest.rest()) {
            hl_module = rest.first();
            if (NIL != inference_modules.hl_module_activeP(hl_module, disabled_hl_modules) && (NIL == supplanted_hl_modules || NIL == conses_high.member(hl_module, supplanted_hl_modules, UNPROVIDED, UNPROVIDED)) && NIL != inference_modules.hl_module_sense_relevant_p(hl_module, sense)
                    && NIL != inference_worker_removal.hl_module_applicable_to_asentP(hl_module, asent)) {
                exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                if (NIL == exclusive_func || (exclusive_func.isFunctionSpec() && NIL != Functions.funcall(exclusive_func, asent))) {
                    if (NIL != exclusive_func) {
                        thread.resetMultipleValues();
                        exclusive_foundP_$1 = inference_worker_removal.update_supplanted_modules_wrt_tactic_specs(hl_module, tactic_specs, supplanted_hl_modules);
                        tactic_specs_$2 = thread.secondMultipleValue();
                        supplanted_hl_modules_$3 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        exclusive_foundP = exclusive_foundP_$1;
                        tactic_specs = tactic_specs_$2;
                        supplanted_hl_modules = supplanted_hl_modules_$3;
                    }
                    required_func = inference_modules.hl_module_required_func(hl_module);
                    if (NIL == required_func || (required_func.isFunctionSpec() && NIL != Functions.funcall(required_func, asent))) {
                        cost = inference_modules.hl_module_asent_cost(hl_module, asent);
                        if (NIL != cost) {
                            productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                            completeness = inference_modules.hl_module_completeness(hl_module, asent, $COMPLETE);
                            tactic_spec = list(hl_module, productivity, completeness);
                            tactic_specs = cons(tactic_spec, tactic_specs);
                            new_rewrite_tactic(problem, hl_module, productivity, completeness);
                        }
                    }
                }
            }
        }
        return tactic_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 8700L)
    public static SubLObject literal_level_rewrite_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != rewrite_tactic_p(tactic) && NIL != inference_worker.literal_level_tactic_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 8800L)
    public static SubLObject maybe_new_rewrite_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject tactic, SubLObject supports) {
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        SubLObject rewrite_link = new_rewrite_link(supported_problem, supporting_mapped_problem, hl_module, supports);
        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 9400L)
    public static SubLObject new_rewrite_tactic(SubLObject problem, SubLObject module, SubLObject productivity, SubLObject completeness) {
        SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, module, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$4 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$4);
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
            SubLObject idx_$5 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$5)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$5);
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

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 9700L)
    public static SubLObject compute_strategic_properties_of_rewrite_tactic(SubLObject tactic, SubLObject strategy) {
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 9900L)
    public static SubLObject current_rewrite_mt() {
        return inference_datastructures_problem.single_literal_problem_mt(inference_worker.currently_active_problem());
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 10100L)
    public static SubLObject execute_literal_level_rewrite_tactic(SubLObject tactic, SubLObject mt, SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        SubLObject _prev_bind_4 = control_vars.$negation_by_failure$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(inference_datastructures_tactic.tactic_store(tactic)), thread);
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
            if (NIL != pattern) {
                formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
            } else {
                SubLObject function = inference_modules.hl_module_expand_func(hl_module);
                if (function.isFunctionSpec()) {
                    Functions.funcall(function, asent);
                }
            }
        } finally {
            control_vars.$negation_by_failure$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 10700L)
    public static SubLObject rewrite_add_link(SubLObject query, SubLObject supports) {
        assert NIL != inference_datastructures_problem_query.problem_query_p(query) : query;
        assert NIL != arguments.hl_justification_p(supports) : supports;
        SubLObject tactic = inference_worker.currently_executing_tactic();
        SubLObject rewrite_support = rewrite_tactic_support(tactic);
        SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        SubLObject free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, query, free_hl_vars, UNPROVIDED);
        SubLObject all_supports = (NIL != rewrite_support) ? cons(rewrite_support, supports) : supports;
        return maybe_new_rewrite_link(supported_problem, supporting_mapped_problem, tactic, all_supports);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 11500L)
    public static SubLObject compute_rewrite_bindings(SubLObject rewrite_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rewrite_support = rewrite_tactic_support(rewrite_link_tactic(rewrite_link));
        SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link));
        SubLObject rule_cnf = (NIL != assertions_high.rule_assertionP(rewrite_support)) ? assertions_high.assertion_cnf(rewrite_support) : czer_main.canonicalize_cycl(arguments.support_sentence(rewrite_support), UNPROVIDED);
        SubLObject rule_variable_map = (NIL != assertions_high.rule_assertionP(rewrite_support)) ? inference_worker_transformation.rule_assertion_variable_map(rewrite_support) : identity_variable_map_for_sentence(arguments.support_sentence(rewrite_support));
        SubLObject poslits = clauses.pos_lits(rule_cnf);
        SubLObject neglits = clauses.neg_lits(rule_cnf);
        SubLObject consequent = poslits.first();
        SubLObject supported_problem_bindings = NIL;
        thread.resetMultipleValues();
        SubLObject v_bindings = unification.unify(asent, consequent, UNPROVIDED, UNPROVIDED);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        supported_problem_bindings = inference_worker_transformation.unification_bindings_to_transformation_bindings(v_bindings);
        return supported_problem_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 12600L)
    public static SubLObject identity_variable_map_for_sentence(SubLObject sentence) {
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 12700L)
    public static SubLObject restriction_rewrite_add_link(SubLObject query, SubLObject supports) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_query.problem_query_p(query) : query;
        assert NIL != arguments.hl_justification_p(supports) : supports;
        SubLObject tactic = inference_worker.currently_executing_tactic();
        SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
        SubLObject supported_query_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        SubLObject supported_asent = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(supported_query);
        SubLObject supporting_asent = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(query);
        thread.resetMultipleValues();
        SubLObject restriction_bindings = unification.unify(supporting_asent, supported_asent, T, UNPROVIDED);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        SubLObject free_hl_vars = variables.sort_hl_variable_list_memoized(list_utilities.fast_set_difference(supported_query_free_hl_vars, bindings.bindings_variables(restriction_bindings), UNPROVIDED));
        SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, query, free_hl_vars, UNPROVIDED);
        SubLObject link = inference_worker_restriction.maybe_new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, T, UNPROVIDED);
        if (NIL != link) {
            inference_worker_restriction.add_restriction_link_listener(link, tactic);
        }
        return supporting_mapped_problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 14100L)
    public static SubLObject trigger_restriction_link_listeners(SubLObject link, SubLObject proof) {
        if (NIL != inference_worker_restriction.restriction_listening_link_p(link)) {
            SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            SubLObject restricted_mapped_problem = inference_worker_restriction.restriction_link_supporting_mapped_problem(link);
            SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
            SubLObject restricted_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(restricted_problem);
            SubLObject cdolist_list_var = inference_worker_restriction.restriction_link_listeners(link);
            SubLObject tactic = NIL;
            tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                SubLObject rewrite_closure_fn = inference_modules.rewrite_module_closure(hl_module);
                SubLObject cdolist_list_var_$6;
                SubLObject rewritten_closure = cdolist_list_var_$6 = Functions.funcall(rewrite_closure_fn, restricted_asent);
                SubLObject asent_and_supports = NIL;
                asent_and_supports = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    SubLObject current;
                    SubLObject datum = current = asent_and_supports;
                    SubLObject asent = NIL;
                    SubLObject supports = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
                    asent = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
                    supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        maybe_add_restriction_rewrite_problem(asent, hl_module, tactic, unrestricted_problem, restricted_mapped_problem, supports);
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list37);
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    asent_and_supports = cdolist_list_var_$6.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                tactic = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 15000L)
    public static SubLObject maybe_add_restriction_rewrite_problem(SubLObject rewritten_asent, SubLObject rewrite_module, SubLObject rewrite_tactic, SubLObject unrestricted_problem, SubLObject restricted_mapped_problem, SubLObject supports) {
        SubLObject unrestricted_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(unrestricted_problem);
        SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
        SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(restricted_problem);
        SubLObject sense = inference_datastructures_problem.single_literal_problem_sense(restricted_problem);
        SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(rewritten_asent, sense, mt);
        SubLObject store = inference_datastructures_problem.problem_store(restricted_problem);
        SubLObject mapped_problem = inference_worker.find_or_create_problem(store, query, NIL, UNPROVIDED);
        SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
        if (NIL == structurally_redundant_restriction_rewrite_problemP(problem, rewrite_module)) {
            SubLObject find_problem_var_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
            SubLObject restricting_var_map = inference_datastructures_problem_link.mapped_problem_variable_map(restricted_mapped_problem);
            SubLObject new_restriction_var_map = bindings.compose_bindings(find_problem_var_map, restricting_var_map);
            SubLObject new_mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, new_restriction_var_map);
            SubLObject new_restriction_bindings = unification_utilities.rewrite_asent_unify(unrestricted_asent, rewritten_asent);
            SubLObject rewrite_support = inference_modules.rewrite_module_support(rewrite_module);
            SubLObject all_supports = (NIL != rewrite_support) ? cons(rewrite_support, supports) : supports;
            inference_worker_restriction.maybe_new_restriction_link(unrestricted_problem, new_mapped_problem, new_restriction_bindings, UNPROVIDED, UNPROVIDED);
            maybe_new_rewrite_link(problem, restricted_mapped_problem, rewrite_tactic, all_supports);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 16700L)
    public static SubLObject structurally_redundant_restriction_rewrite_problemP(SubLObject problem, SubLObject module) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject link_tactic;
        SubLObject link_module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $REWRITE)) {
                link_tactic = rewrite_link_tactic(link);
                link_module = inference_datastructures_tactic.tactic_hl_module(link_tactic);
                if (link_module.eql(module)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 17200L)
    public static SubLObject new_rewrite_proof(SubLObject rewrite_link, SubLObject subproof, SubLObject variable_map) {
        assert NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        if (NIL != subproof && !assertionsDisabledInClass && NIL == inference_datastructures_proof.proof_p(subproof)) {
            throw new AssertionError(subproof);
        }
        SubLObject subproofs = (NIL != subproof) ? list(subproof) : NIL;
        SubLObject supporting_subproof_bindings = (NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : NIL;
        SubLObject subproof_bindings = bindings.transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
        SubLObject proof_bindings = inference_worker_transformation.extended_supported_problem_bindings_to_supported_problem_bindings(subproof_bindings);
        SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        return inference_worker.propose_new_proof_with_bindings(rewrite_link, canonical_proof_bindings, subproofs);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 17900L)
    public static SubLObject bubble_up_proof_to_rewrite_link(SubLObject supporting_proof, SubLObject variable_map, SubLObject rewrite_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(rewrite_link) : rewrite_link;
        thread.resetMultipleValues();
        SubLObject proof = new_rewrite_proof(rewrite_link, supporting_proof, variable_map);
        SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != newP) {
            inference_worker.bubble_up_proof(proof);
        } else {
            inference_worker.possibly_note_proof_processed(supporting_proof);
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_rewrite_file() {
        declareFunction(myName, "rewrite_link_data_print_function_trampoline", "REWRITE-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "rewrite_link_data_p", "REWRITE-LINK-DATA-P", 1, 0, false);
        new $rewrite_link_data_p$UnaryFunction();
        declareFunction(myName, "rw_link_data_hl_module", "RW-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction(myName, "rw_link_data_bindings", "RW-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction(myName, "rw_link_data_supports", "RW-LINK-DATA-SUPPORTS", 1, 0, false);
        declareFunction(myName, "_csetf_rw_link_data_hl_module", "_CSETF-RW-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction(myName, "_csetf_rw_link_data_bindings", "_CSETF-RW-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction(myName, "_csetf_rw_link_data_supports", "_CSETF-RW-LINK-DATA-SUPPORTS", 2, 0, false);
        declareFunction(myName, "make_rewrite_link_data", "MAKE-REWRITE-LINK-DATA", 0, 1, false);
        declareFunction(myName, "visit_defstruct_rewrite_link_data", "VISIT-DEFSTRUCT-REWRITE-LINK-DATA", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_rewrite_link_data_method", "VISIT-DEFSTRUCT-OBJECT-REWRITE-LINK-DATA-METHOD", 2, 0, false);
        declareFunction(myName, "new_rewrite_link", "NEW-REWRITE-LINK", 4, 0, false);
        declareFunction(myName, "new_rewrite_link_int", "NEW-REWRITE-LINK-INT", 3, 0, false);
        declareFunction(myName, "new_rewrite_link_data", "NEW-REWRITE-LINK-DATA", 1, 0, false);
        declareFunction(myName, "destroy_rewrite_link", "DESTROY-REWRITE-LINK", 1, 0, false);
        declareFunction(myName, "rewrite_link_hl_module", "REWRITE-LINK-HL-MODULE", 1, 0, false);
        declareFunction(myName, "rewrite_link_bindings", "REWRITE-LINK-BINDINGS", 1, 0, false);
        declareFunction(myName, "rewrite_link_supports", "REWRITE-LINK-SUPPORTS", 1, 0, false);
        declareFunction(myName, "set_rewrite_link_hl_module", "SET-REWRITE-LINK-HL-MODULE", 2, 0, false);
        declareFunction(myName, "set_rewrite_link_bindings", "SET-REWRITE-LINK-BINDINGS", 2, 0, false);
        declareFunction(myName, "set_rewrite_link_supports", "SET-REWRITE-LINK-SUPPORTS", 2, 0, false);
        declareFunction(myName, "rewrite_link_tactic", "REWRITE-LINK-TACTIC", 1, 0, false);
        declareFunction(myName, "rewrite_link_supporting_mapped_problem", "REWRITE-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "rewrite_link_supporting_variable_map", "REWRITE-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "rewrite_link_rewrite_mt", "REWRITE-LINK-REWRITE-MT", 1, 0, false);
        declareFunction(myName, "rewrite_link_p", "REWRITE-LINK-P", 1, 0, false);
        declareFunction(myName, "rewrite_tactic_p", "REWRITE-TACTIC-P", 1, 0, false);
        declareFunction(myName, "rewrite_tactic_support", "REWRITE-TACTIC-SUPPORT", 1, 0, false);
        declareFunction(myName, "rewrite_proof_p", "REWRITE-PROOF-P", 1, 0, false);
        declareFunction(myName, "determine_new_literal_rewrite_tactics", "DETERMINE-NEW-LITERAL-REWRITE-TACTICS", 3, 1, false);
        declareFunction(myName, "literal_level_rewrite_tactic_p", "LITERAL-LEVEL-REWRITE-TACTIC-P", 1, 0, false);
        declareFunction(myName, "maybe_new_rewrite_link", "MAYBE-NEW-REWRITE-LINK", 4, 0, false);
        declareFunction(myName, "new_rewrite_tactic", "NEW-REWRITE-TACTIC", 4, 0, false);
        declareFunction(myName, "compute_strategic_properties_of_rewrite_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REWRITE-TACTIC", 2, 0, false);
        declareFunction(myName, "current_rewrite_mt", "CURRENT-REWRITE-MT", 0, 0, false);
        declareFunction(myName, "execute_literal_level_rewrite_tactic", "EXECUTE-LITERAL-LEVEL-REWRITE-TACTIC", 3, 0, false);
        declareFunction(myName, "rewrite_add_link", "REWRITE-ADD-LINK", 2, 0, false);
        declareFunction(myName, "compute_rewrite_bindings", "COMPUTE-REWRITE-BINDINGS", 1, 0, false);
        declareFunction(myName, "identity_variable_map_for_sentence", "IDENTITY-VARIABLE-MAP-FOR-SENTENCE", 1, 0, false);
        declareFunction(myName, "restriction_rewrite_add_link", "RESTRICTION-REWRITE-ADD-LINK", 2, 0, false);
        declareFunction(myName, "trigger_restriction_link_listeners", "TRIGGER-RESTRICTION-LINK-LISTENERS", 2, 0, false);
        declareFunction(myName, "maybe_add_restriction_rewrite_problem", "MAYBE-ADD-RESTRICTION-REWRITE-PROBLEM", 6, 0, false);
        declareFunction(myName, "structurally_redundant_restriction_rewrite_problemP", "STRUCTURALLY-REDUNDANT-RESTRICTION-REWRITE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "new_rewrite_proof", "NEW-REWRITE-PROOF", 3, 0, false);
        declareFunction(myName, "bubble_up_proof_to_rewrite_link", "BUBBLE-UP-PROOF-TO-REWRITE-LINK", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_rewrite_file() {
        $dtp_rewrite_link_data$ = defconstant("*DTP-REWRITE-LINK-DATA*", $sym0$REWRITE_LINK_DATA);
        return NIL;
    }

    public static SubLObject setup_inference_worker_rewrite_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_rewrite_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        Structures.def_csetf($sym9$RW_LINK_DATA_HL_MODULE, $sym10$_CSETF_RW_LINK_DATA_HL_MODULE);
        Structures.def_csetf($sym11$RW_LINK_DATA_BINDINGS, $sym12$_CSETF_RW_LINK_DATA_BINDINGS);
        Structures.def_csetf($sym13$RW_LINK_DATA_SUPPORTS, $sym14$_CSETF_RW_LINK_DATA_SUPPORTS);
        Equality.identity($sym0$REWRITE_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rewrite_link_data$.getGlobalValue(), Symbols.symbol_function($sym23$VISIT_DEFSTRUCT_OBJECT_REWRITE_LINK_DATA_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_rewrite_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_rewrite_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_rewrite_file();
    }

    static {
        me = new inference_worker_rewrite();
        $dtp_rewrite_link_data$ = null;
        $sym0$REWRITE_LINK_DATA = makeSymbol("REWRITE-LINK-DATA");
        $sym1$REWRITE_LINK_DATA_P = makeSymbol("REWRITE-LINK-DATA-P");
        $list2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
        $list3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));
        $list4 = list(makeSymbol("RW-LINK-DATA-HL-MODULE"), makeSymbol("RW-LINK-DATA-BINDINGS"), makeSymbol("RW-LINK-DATA-SUPPORTS"));
        $list5 = list(makeSymbol("_CSETF-RW-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-RW-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RW-LINK-DATA-SUPPORTS"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REWRITE-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REWRITE-LINK-DATA-P"));
        $sym9$RW_LINK_DATA_HL_MODULE = makeSymbol("RW-LINK-DATA-HL-MODULE");
        $sym10$_CSETF_RW_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-RW-LINK-DATA-HL-MODULE");
        $sym11$RW_LINK_DATA_BINDINGS = makeSymbol("RW-LINK-DATA-BINDINGS");
        $sym12$_CSETF_RW_LINK_DATA_BINDINGS = makeSymbol("_CSETF-RW-LINK-DATA-BINDINGS");
        $sym13$RW_LINK_DATA_SUPPORTS = makeSymbol("RW-LINK-DATA-SUPPORTS");
        $sym14$_CSETF_RW_LINK_DATA_SUPPORTS = makeSymbol("_CSETF-RW-LINK-DATA-SUPPORTS");
        $HL_MODULE = makeKeyword("HL-MODULE");
        $BINDINGS = makeKeyword("BINDINGS");
        $SUPPORTS = makeKeyword("SUPPORTS");
        $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym20$MAKE_REWRITE_LINK_DATA = makeSymbol("MAKE-REWRITE-LINK-DATA");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym23$VISIT_DEFSTRUCT_OBJECT_REWRITE_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REWRITE-LINK-DATA-METHOD");
        $sym24$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym25$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
        $sym26$HL_MODULE_P = makeSymbol("HL-MODULE-P");
        $REWRITE = makeKeyword("REWRITE");
        $UNDETERMINED = makeKeyword("UNDETERMINED");
        $FREE = makeKeyword("FREE");
        $sym30$REWRITE_LINK_P = makeSymbol("REWRITE-LINK-P");
        $str31$Bindings__a_are_not_valid_rewrite = makeString("Bindings ~a are not valid rewrite-link bindings.");
        $sym32$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
        $str33$No_tactic_found_for__S = makeString("No tactic found for ~S");
        $COMPLETE = makeKeyword("COMPLETE");
        $SKIP = makeKeyword("SKIP");
        $sym36$PROBLEM_QUERY_P = makeSymbol("PROBLEM-QUERY-P");
        $list37 = list(makeSymbol("ASENT"), makeSymbol("SUPPORTS"));
        $sym38$PROOF_P = makeSymbol("PROOF-P");
        $sym39$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");
    }

    public static class $rewrite_link_data_native extends SubLStructNative {
        public SubLObject $hl_module;
        public SubLObject $bindings;
        public SubLObject $supports;
        private static SubLStructDeclNative structDecl;

        public $rewrite_link_data_native() {
            this.$hl_module = CommonSymbols.NIL;
            this.$bindings = CommonSymbols.NIL;
            this.$supports = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $rewrite_link_data_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative($rewrite_link_data_native.class, $sym0$REWRITE_LINK_DATA, $sym1$REWRITE_LINK_DATA_P, $list2, $list3, new String[] { "$hl_module", "$bindings", "$supports" }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $rewrite_link_data_p$UnaryFunction extends UnaryFunction {
        public $rewrite_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REWRITE-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return rewrite_link_data_p(arg1);
        }
    }
}
/*
 *
 * Total time: 434 ms synthetic
 */