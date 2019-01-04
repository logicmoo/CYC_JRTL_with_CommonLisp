package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.inference.leviathan;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker_transformation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation";
    public static final String myFingerPrint = "902d7be104627043e5fac8765af7703d05187cd554b4b86fa19875dd6c1abd39";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLSymbol $dtp_transformation_link_data$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 15546L)
    private static SubLSymbol $determine_new_transformation_tactics_module$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 33331L)
    private static SubLSymbol $transformation_tactic_iteration_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 36266L)
    private static SubLSymbol $stitch_up_bindings_loopP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 38860L)
    public static SubLSymbol $inference_transformation_type_checking_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 61655L)
    private static SubLSymbol $merge_dnf_lambda_var$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 61706L)
    private static SubLSymbol $rule_dnf_lambda_var$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 67258L)
    private static SubLSymbol $genl_rules_enabledP$;
    private static final SubLSymbol $sym0$TRANSFORMATION_LINK_DATA;
    private static final SubLSymbol $sym1$TRANSFORMATION_LINK_DATA_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$TRANSFORMATION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$TRANS_LINK_DATA_HL_MODULE;
    private static final SubLSymbol $sym10$_CSETF_TRANS_LINK_DATA_HL_MODULE;
    private static final SubLSymbol $sym11$TRANS_LINK_DATA_BINDINGS;
    private static final SubLSymbol $sym12$_CSETF_TRANS_LINK_DATA_BINDINGS;
    private static final SubLSymbol $sym13$TRANS_LINK_DATA_SUPPORTS;
    private static final SubLSymbol $sym14$_CSETF_TRANS_LINK_DATA_SUPPORTS;
    private static final SubLSymbol $sym15$TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY;
    private static final SubLSymbol $sym16$_CSETF_TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY;
    private static final SubLSymbol $kw17$HL_MODULE;
    private static final SubLSymbol $kw18$BINDINGS;
    private static final SubLSymbol $kw19$SUPPORTS;
    private static final SubLSymbol $kw20$NON_EXPLANATORY_SUBQUERY;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_TRANSFORMATION_LINK_DATA;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_LINK_DATA_METHOD;
    private static final SubLSymbol $sym27$PROBLEM_P;
    private static final SubLSymbol $sym28$MAPPED_PROBLEM_P;
    private static final SubLSymbol $kw29$TRANSFORMATION;
    private static final SubLSymbol $kw30$FREE;
    private static final SubLSymbol $sym31$TRANSFORMATION_LINK_P;
    private static final SubLSymbol $sym32$HL_MODULE_P;
    private static final SubLSymbol $sym33$BINDING_LIST_P;
    private static final SubLSymbol $sym34$HL_JUSTIFICATION_P;
    private static final SubLSymbol $sym35$NON_EXPLANATORY_SUBQUERY_SPEC_P;
    private static final SubLString $str36$No_tactic_found_for__S;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$JOIN_ORDERED;
    private static final SubLSymbol $kw39$RESIDUAL_TRANSFORMATION;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$STORE_VAR;
    private static final SubLSymbol $sym42$CLET;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$_NEGATION_BY_FAILURE_;
    private static final SubLSymbol $sym47$PROBLEM_STORE_NEGATION_BY_FAILURE_;
    private static final SubLSymbol $sym48$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_;
    private static final SubLSymbol $kw49$DETERMINE_NEW_TRANSFORMATION_TACTICS;
    private static final SubLSymbol $kw50$GROSSLY_INCOMPLETE;
    private static final SubLSymbol $kw51$SKIP;
    private static final SubLSymbol $sym52$TRANSFORMATION_GENERATOR_TACTIC_P;
    private static final SubLSymbol $sym53$TRANSFORMATION_PROOF_P;
    private static final SubLString $str54$generalized_transformation_link_o;
    private static final SubLString $str55$generalized_transformation_proof_;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$INFERENCE_EXCEPTED_ASSERTION_;
    private static final SubLSymbol $sym58$_EXIT;
    private static final SubLSymbol $sym59$SINGLE_LITERAL_PROBLEM_P;
    private static final SubLSymbol $kw60$TACTIC_SPECS;
    private static final SubLSymbol $kw61$TOTAL_PRODUCTIVITY;
    private static final SubLString $str62$unexpected_tactic_specs_return_ty;
    private static final SubLString $str63$pruning__s__s__s;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$TACTIC_VAR;
    private static final SubLSymbol $sym66$WITH_INFERENCE_MT_RELEVANCE;
    private static final SubLSymbol $sym67$_INFERENCE_EXPAND_HL_MODULE_;
    private static final SubLSymbol $sym68$TACTIC_HL_MODULE;
    private static final SubLSymbol $sym69$_INFERENCE_EXPAND_SENSE_;
    private static final SubLSymbol $sym70$WITH_PROBLEM_STORE_TRANSFORMATION_ASSUMPTIONS;
    private static final SubLSymbol $sym71$TACTIC_STORE;
    private static final SubLString $str72$time_to_add_meta_transformation_s;
    private static final SubLSymbol $kw73$TRANSFORMATION_RULE_SELECT;
    private static final SubLString $str74$transformation_tactic__S_already_;
    private static final SubLSymbol $sym75$HANDLE_TRANSFORMATION_ADD_NODE_FOR_EXPAND_RESULTS;
    private static final SubLSymbol $sym76$HL_VAR_;
    private static final SubLSymbol $kw77$NEG;
    private static final SubLSymbol $kw78$POS;
    private static final SubLList $list79;
    private static final SubLObject $const80$termOfUnit;
    private static final SubLSymbol $sym81$PROOF_P;
    private static final SubLSymbol $sym82$BINDINGS_P;
    private static final SubLString $str83$Could_not_ground_out__s_and__s;
    private static final SubLString $str84$Could_not_unify_transformation_bi;
    private static final SubLSymbol $sym85$RULE_ASSERTION_;
    private static final SubLObject $const86$InferencePSC;
    private static final SubLSymbol $sym87$ASSERTION_P;
    private static final SubLSymbol $kw88$RULE;
    private static final SubLObject $const89$forwardNonTriggerLiteral;
    private static final SubLObject $const90$forwardTriggerLiteral;
    private static final SubLSymbol $sym91$HL_VARIABLE_NOT_MENTIONED_IN_RULE_DNF_BUT_MENTIONED_IN_MERGE_DNF;
    private static final SubLSymbol $sym92$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P;
    private static final SubLSymbol $sym93$TRANSFORMATION_PROOF_ABNORMAL_;
    private static final SubLSymbol $sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED;
    private static final SubLSymbol $kw95$IGNORE;
    private static final SubLSymbol $sym96$_;
    private static final SubLSymbol $sym97$VARIABLE_ID;
    private static final SubLObject $const98$genlRules;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject transformation_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)inference_worker_transformation.ZERO_INTEGER);
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject transformation_link_data_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $transformation_link_data_native.class) ? inference_worker_transformation.T : inference_worker_transformation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject trans_link_data_hl_module(final SubLObject v_object) {
        assert inference_worker_transformation.NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject trans_link_data_bindings(final SubLObject v_object) {
        assert inference_worker_transformation.NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject trans_link_data_supports(final SubLObject v_object) {
        assert inference_worker_transformation.NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject trans_link_data_non_explanatory_subquery(final SubLObject v_object) {
        assert inference_worker_transformation.NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject _csetf_trans_link_data_hl_module(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_transformation.NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject _csetf_trans_link_data_bindings(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_transformation.NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject _csetf_trans_link_data_supports(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_transformation.NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject _csetf_trans_link_data_non_explanatory_subquery(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_transformation.NIL != transformation_link_data_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject make_transformation_link_data(SubLObject arglist) {
        if (arglist == inference_worker_transformation.UNPROVIDED) {
            arglist = (SubLObject)inference_worker_transformation.NIL;
        }
        final SubLObject v_new = (SubLObject)new $transformation_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_worker_transformation.NIL, next = arglist; inference_worker_transformation.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_worker_transformation.$kw17$HL_MODULE)) {
                _csetf_trans_link_data_hl_module(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_worker_transformation.$kw18$BINDINGS)) {
                _csetf_trans_link_data_bindings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_worker_transformation.$kw19$SUPPORTS)) {
                _csetf_trans_link_data_supports(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_worker_transformation.$kw20$NON_EXPLANATORY_SUBQUERY)) {
                _csetf_trans_link_data_non_explanatory_subquery(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_worker_transformation.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject visit_defstruct_transformation_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_transformation.$kw22$BEGIN, (SubLObject)inference_worker_transformation.$sym23$MAKE_TRANSFORMATION_LINK_DATA, (SubLObject)inference_worker_transformation.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_transformation.$kw24$SLOT, (SubLObject)inference_worker_transformation.$kw17$HL_MODULE, trans_link_data_hl_module(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_transformation.$kw24$SLOT, (SubLObject)inference_worker_transformation.$kw18$BINDINGS, trans_link_data_bindings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_transformation.$kw24$SLOT, (SubLObject)inference_worker_transformation.$kw19$SUPPORTS, trans_link_data_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_transformation.$kw24$SLOT, (SubLObject)inference_worker_transformation.$kw20$NON_EXPLANATORY_SUBQUERY, trans_link_data_non_explanatory_subquery(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_transformation.$kw25$END, (SubLObject)inference_worker_transformation.$sym23$MAKE_TRANSFORMATION_LINK_DATA, (SubLObject)inference_worker_transformation.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1234L)
    public static SubLObject visit_defstruct_object_transformation_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_transformation_link_data(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 2412L)
    public static SubLObject new_transformation_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject hl_module, final SubLObject transformation_bindings, final SubLObject rule_assertion, final SubLObject more_supports, final SubLObject non_explanatory_subquery) {
        assert inference_worker_transformation.NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        if (inference_worker_transformation.NIL != supporting_mapped_problem && !inference_worker_transformation.assertionsDisabledInClass && inference_worker_transformation.NIL == inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem)) {
            throw new AssertionError(supporting_mapped_problem);
        }
        final SubLObject supports = (SubLObject)ConsesLow.cons(rule_assertion, more_supports);
        final SubLObject transformation_link = new_transformation_link_int(supported_problem, hl_module, transformation_bindings, supports, non_explanatory_subquery);
        if (inference_worker_transformation.NIL != supporting_mapped_problem) {
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, transformation_link);
        }
        inference_datastructures_problem_link.problem_link_open_all(transformation_link);
        inference_worker.propagate_problem_link(transformation_link);
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 3224L)
    public static SubLObject new_transformation_link_int(final SubLObject problem, final SubLObject hl_module, final SubLObject transformation_bindings, final SubLObject supports, final SubLObject non_explanatory_subquery) {
        final SubLObject transformation_link = inference_datastructures_problem_link.new_problem_link((SubLObject)inference_worker_transformation.$kw29$TRANSFORMATION, problem);
        new_transformation_link_data(transformation_link);
        set_transformation_link_hl_module(transformation_link, hl_module);
        set_transformation_link_bindings(transformation_link, transformation_bindings);
        set_transformation_link_supports(transformation_link, supports);
        set_transformation_link_non_explanatory_subquery(transformation_link, non_explanatory_subquery);
        if (inference_worker_transformation.NIL != non_explanatory_subquery) {
            inference_datastructures_problem_store.problem_store_note_non_explanatory_subproofs_possible(inference_datastructures_problem.problem_store(problem));
        }
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 4130L)
    public static SubLObject new_transformation_link_data(final SubLObject transformation_link) {
        final SubLObject data = make_transformation_link_data((SubLObject)inference_worker_transformation.UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(transformation_link, data);
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 4330L)
    public static SubLObject destroy_transformation_link(final SubLObject transformation_link) {
        inference_worker_residual_transformation.destroy_transformation_link_wrt_residual_transformation_links(transformation_link);
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_hl_module(data, (SubLObject)inference_worker_transformation.$kw30$FREE);
        _csetf_trans_link_data_bindings(data, (SubLObject)inference_worker_transformation.$kw30$FREE);
        _csetf_trans_link_data_supports(data, (SubLObject)inference_worker_transformation.$kw30$FREE);
        _csetf_trans_link_data_non_explanatory_subquery(data, (SubLObject)inference_worker_transformation.$kw30$FREE);
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 4847L)
    public static SubLObject transformation_link_hl_module(final SubLObject transformation_link) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        return trans_link_data_hl_module(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5089L)
    public static SubLObject transformation_link_bindings(final SubLObject transformation_link) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        return trans_link_data_bindings(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5514L)
    public static SubLObject transformation_link_supports(final SubLObject transformation_link) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        return trans_link_data_supports(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5742L)
    public static SubLObject transformation_link_rule_assertion(final SubLObject transformation_link) {
        return transformation_link_supports(transformation_link).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5886L)
    public static SubLObject transformation_link_more_supports(final SubLObject transformation_link) {
        return transformation_link_supports(transformation_link).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6028L)
    public static SubLObject transformation_link_non_explanatory_subquery(final SubLObject transformation_link) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        return trans_link_data_non_explanatory_subquery(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6288L)
    public static SubLObject set_transformation_link_hl_module(final SubLObject transformation_link, final SubLObject hl_module) {
        assert inference_worker_transformation.NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_hl_module(data, hl_module);
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6620L)
    public static SubLObject set_transformation_link_bindings(final SubLObject transformation_link, final SubLObject v_bindings) {
        assert inference_worker_transformation.NIL != bindings.binding_list_p(v_bindings) : v_bindings;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_bindings(data, v_bindings);
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6938L)
    public static SubLObject set_transformation_link_supports(final SubLObject transformation_link, final SubLObject supports) {
        assert inference_worker_transformation.NIL != arguments.hl_justification_p(supports) : supports;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_supports(data, supports);
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 7260L)
    public static SubLObject set_transformation_link_non_explanatory_subquery(final SubLObject transformation_link, final SubLObject subquery) {
        assert inference_worker_transformation.NIL != inference_datastructures_problem_query.non_explanatory_subquery_spec_p(subquery) : subquery;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
        _csetf_trans_link_data_non_explanatory_subquery(data, subquery);
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 7627L)
    public static SubLObject transformation_link_tactic(final SubLObject transformation_link) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        final SubLObject hl_module = transformation_link_hl_module(transformation_link);
        final SubLObject rule = transformation_link_rule_assertion(transformation_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject candidate_tactic = (SubLObject)inference_worker_transformation.NIL;
        candidate_tactic = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            if (inference_worker_transformation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, (SubLObject)inference_worker_transformation.$kw29$TRANSFORMATION) && hl_module.eql(inference_datastructures_tactic.tactic_hl_module(candidate_tactic)) && rule.eql(transformation_tactic_rule(candidate_tactic))) {
                return candidate_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_tactic = cdolist_list_var.first();
        }
        if (inference_worker_transformation.NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
            return Errors.error((SubLObject)inference_worker_transformation.$str36$No_tactic_found_for__S, transformation_link);
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 8347L)
    public static SubLObject transformation_link_pragmatic_requirements(final SubLObject transformation_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_assertion = transformation_link_rule_assertion(transformation_link);
        final SubLObject transformation_mt = transformation_link_transformation_mt(transformation_link);
        SubLObject pragmatic_requirements_dnf = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(transformation_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pragmatic_requirements_dnf = unification.variable_base_inversion(backward_rule_pragmatic_dnf(rule_assertion, transformation_mt));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return inference_czer.contextualize_clause(pragmatic_requirements_dnf, transformation_mt, (SubLObject)inference_worker_transformation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9130L)
    public static SubLObject transformation_link_supporting_mapped_problem(final SubLObject transformation_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(transformation_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9329L)
    public static SubLObject transformation_link_supporting_problem(final SubLObject transformation_link) {
        final SubLObject supporting_mapped_problem = transformation_link_supporting_mapped_problem(transformation_link);
        if (inference_worker_transformation.NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9653L)
    public static SubLObject transformation_link_supporting_variable_map(final SubLObject transformation_link) {
        final SubLObject supporting_mapped_problem = transformation_link_supporting_mapped_problem(transformation_link);
        if (inference_worker_transformation.NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9985L)
    public static SubLObject transformation_link_transformation_mt(final SubLObject transformation_link) {
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        return inference_datastructures_problem.single_literal_problem_mt(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 10227L)
    public static SubLObject transformation_link_supporting_problem_wholly_explanatoryP(final SubLObject transformation_link) {
        return Types.sublisp_null(transformation_link_non_explanatory_subquery(transformation_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 10410L)
    public static SubLObject transformed_problem_using_rule(final SubLObject supported_problem, final SubLObject rule) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        SubLObject transformation_link_rule;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, (SubLObject)inference_worker_transformation.$kw29$TRANSFORMATION)) {
                transformation_link_rule = transformation_link_rule_assertion(transformation_link);
                if (rule.eql(transformation_link_rule)) {
                    return transformation_link_supporting_problem(transformation_link);
                }
            }
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 10939L)
    public static SubLObject transformed_problem_using_rule_and_hl_module(final SubLObject supported_problem, final SubLObject rule, final SubLObject hl_module) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        SubLObject transformation_link_rule;
        SubLObject transformation_link_hl_module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, (SubLObject)inference_worker_transformation.$kw29$TRANSFORMATION)) {
                transformation_link_rule = transformation_link_rule_assertion(transformation_link);
                if (rule.eql(transformation_link_rule)) {
                    transformation_link_hl_module = transformation_link_hl_module(transformation_link);
                    if (hl_module.eql(transformation_link_hl_module)) {
                        return transformation_link_supporting_problem(transformation_link);
                    }
                }
            }
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 11660L)
    public static SubLObject transformation_link_rule_bindings_to_closed(final SubLObject transformation_link) {
        return transformation_rule_bindings_to_closed(transformation_link_bindings(transformation_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 11846L)
    public static SubLObject transformation_rule_bindings_to_closed(final SubLObject transformation_bindings) {
        SubLObject v_bindings = (SubLObject)inference_worker_transformation.NIL;
        SubLObject cdolist_list_var = transformation_bindings;
        SubLObject binding = (SubLObject)inference_worker_transformation.NIL;
        binding = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = (SubLObject)inference_worker_transformation.NIL;
            SubLObject value = (SubLObject)inference_worker_transformation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list37);
            variable = current.first();
            current = (value = current.rest());
            if (inference_worker_transformation.NIL != unification.non_base_variable_p(variable) && inference_worker_transformation.NIL != variables.fully_bound_p(value)) {
                v_bindings = (SubLObject)ConsesLow.cons(binding, v_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 12358L)
    public static SubLObject transformation_link_el_bindings(final SubLObject transformation_link) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        final SubLObject rule_assertion = transformation_link_rule_assertion(transformation_link);
        final SubLObject rule_assertion_variable_map = rule_assertion_variable_map(rule_assertion);
        final SubLObject hl_bindings = transformation_link_bindings(transformation_link);
        final SubLObject el_bindings = bindings.apply_bindings_backwards(rule_assertion_variable_map, hl_bindings);
        final SubLObject canon_el_bindings = canonicalize_bindings_wrt_el_vars(el_bindings);
        return canon_el_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 12950L)
    public static SubLObject canonicalize_bindings_wrt_el_vars(final SubLObject v_bindings) {
        SubLObject new_bindings = (SubLObject)inference_worker_transformation.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)inference_worker_transformation.NIL;
        binding = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = (SubLObject)inference_worker_transformation.NIL;
            SubLObject value = (SubLObject)inference_worker_transformation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list37);
            variable = current.first();
            current = (value = current.rest());
            if (inference_worker_transformation.NIL != variables.variable_p(variable) && inference_worker_transformation.NIL != cycl_variables.el_varP(value)) {
                binding = bindings.make_variable_binding(value, variable);
            }
            new_bindings = (SubLObject)ConsesLow.cons(binding, new_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 13417L)
    public static SubLObject transformation_link_motivated_residual_transformation_links(final SubLObject transformation_link) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject rt_links = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link_var;
        SubLObject jo_link_var_$1;
        SubLObject motivating_conjunction_problem;
        SubLObject set_contents_var_$2;
        SubLObject basis_object_$3;
        SubLObject state_$4;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link_var = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state, jo_link_var) && inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, (SubLObject)inference_worker_transformation.$kw38$JOIN_ORDERED)) {
                jo_link_var_$1 = jo_link_var;
                motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$1);
                set_contents_var_$2 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                for (basis_object_$3 = set_contents.do_set_contents_basis_object(set_contents_var_$2), state_$4 = (SubLObject)inference_worker_transformation.NIL, state_$4 = set_contents.do_set_contents_initial_state(basis_object_$3, set_contents_var_$2); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object_$3, state_$4); state_$4 = set_contents.do_set_contents_update_state(state_$4)) {
                    rt_link = set_contents.do_set_contents_next(basis_object_$3, state_$4);
                    if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state_$4, rt_link) && inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, (SubLObject)inference_worker_transformation.$kw39$RESIDUAL_TRANSFORMATION) && inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$1) && inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, transformation_link)) {
                        rt_links = (SubLObject)ConsesLow.cons(rt_link, rt_links);
                    }
                }
            }
        }
        return Sequences.nreverse(rt_links);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 13888L)
    public static SubLObject transformation_link_motivated_residual_transformation_link_count(final SubLObject transformation_link) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject total = (SubLObject)inference_worker_transformation.ZERO_INTEGER;
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link_var;
        SubLObject jo_link_var_$5;
        SubLObject motivating_conjunction_problem;
        SubLObject set_contents_var_$6;
        SubLObject basis_object_$7;
        SubLObject state_$8;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link_var = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state, jo_link_var) && inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, (SubLObject)inference_worker_transformation.$kw38$JOIN_ORDERED)) {
                jo_link_var_$5 = jo_link_var;
                motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$5);
                set_contents_var_$6 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                for (basis_object_$7 = set_contents.do_set_contents_basis_object(set_contents_var_$6), state_$8 = (SubLObject)inference_worker_transformation.NIL, state_$8 = set_contents.do_set_contents_initial_state(basis_object_$7, set_contents_var_$6); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object_$7, state_$8); state_$8 = set_contents.do_set_contents_update_state(state_$8)) {
                    rt_link = set_contents.do_set_contents_next(basis_object_$7, state_$8);
                    if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state_$8, rt_link) && inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, (SubLObject)inference_worker_transformation.$kw39$RESIDUAL_TRANSFORMATION) && inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$5) && inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, transformation_link)) {
                        total = Numbers.add(total, (SubLObject)inference_worker_transformation.ONE_INTEGER);
                    }
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 14334L)
    public static SubLObject transformation_link_good_motivated_residual_transformation_link_count(final SubLObject transformation_link) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        SubLObject total = (SubLObject)inference_worker_transformation.ZERO_INTEGER;
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link_var;
        SubLObject jo_link_var_$9;
        SubLObject motivating_conjunction_problem;
        SubLObject set_contents_var_$10;
        SubLObject basis_object_$11;
        SubLObject state_$12;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link_var = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state, jo_link_var) && inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, (SubLObject)inference_worker_transformation.$kw38$JOIN_ORDERED)) {
                jo_link_var_$9 = jo_link_var;
                motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$9);
                set_contents_var_$10 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                for (basis_object_$11 = set_contents.do_set_contents_basis_object(set_contents_var_$10), state_$12 = (SubLObject)inference_worker_transformation.NIL, state_$12 = set_contents.do_set_contents_initial_state(basis_object_$11, set_contents_var_$10); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object_$11, state_$12); state_$12 = set_contents.do_set_contents_update_state(state_$12)) {
                    rt_link = set_contents.do_set_contents_next(basis_object_$11, state_$12);
                    if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state_$12, rt_link) && inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, (SubLObject)inference_worker_transformation.$kw39$RESIDUAL_TRANSFORMATION) && inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$9) && inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, transformation_link) && inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_goodP(rt_link)) {
                        total = Numbers.add(total, (SubLObject)inference_worker_transformation.ONE_INTEGER);
                    }
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 14851L)
    public static SubLObject with_problem_store_transformation_assumptions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject store = (SubLObject)inference_worker_transformation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list40);
        store = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject store_var = (SubLObject)inference_worker_transformation.$sym41$STORE_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_worker_transformation.$sym42$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(store_var, store), (SubLObject)inference_worker_transformation.$list43, (SubLObject)inference_worker_transformation.$list44, (SubLObject)inference_worker_transformation.$list45, (SubLObject)ConsesLow.list((SubLObject)inference_worker_transformation.$sym46$_NEGATION_BY_FAILURE_, (SubLObject)ConsesLow.list((SubLObject)inference_worker_transformation.$sym47$PROBLEM_STORE_NEGATION_BY_FAILURE_, store_var))), ConsesLow.append(body, (SubLObject)inference_worker_transformation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 15353L)
    public static SubLObject meta_transformation_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != inference_datastructures_tactic.tactic_p(v_object) && inference_worker_transformation.NIL != inference_modules.meta_transformation_module_p(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 15698L)
    public static SubLObject add_tactic_to_determine_new_literal_transformation_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense, final SubLObject mt) {
        if (inference_worker_transformation.NIL == inference_backchain_forbidden_asentP(asent, mt)) {
            new_meta_transformation_tactic(problem, asent, sense);
            return (SubLObject)inference_worker_transformation.T;
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16052L)
    public static SubLObject inference_backchain_forbidden_asentP(final SubLObject asent, final SubLObject mt) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (inference_worker_transformation.NIL != forts.fort_p(predicate) && inference_worker_transformation.NIL != inference_trampolines.inference_backchain_forbiddenP(predicate, mt)) {
            return (SubLObject)inference_worker_transformation.T;
        }
        if (inference_worker_transformation.NIL != inference_completeness_utilities.inference_complete_asentP(asent, mt)) {
            return (SubLObject)inference_worker_transformation.T;
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16359L)
    public static SubLObject new_meta_transformation_tactic(final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, inference_worker_transformation.$determine_new_transformation_tactics_module$.getGlobalValue(), (SubLObject)inference_worker_transformation.UNPROVIDED);
        final SubLObject productivity = (SubLObject)inference_worker_transformation.ZERO_INTEGER;
        inference_datastructures_tactic.set_tactic_completeness(tactic, (SubLObject)inference_worker_transformation.$kw50$GROSSLY_INCOMPLETE);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, (SubLObject)inference_worker_transformation.UNPROVIDED);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker_transformation.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_transformation.$kw51$SKIP)) {
            final SubLObject idx_$13 = idx;
            if (inference_worker_transformation.NIL == id_index.id_index_dense_objects_empty_p(idx_$13, (SubLObject)inference_worker_transformation.$kw51$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$13);
                final SubLObject backwardP_var = (SubLObject)inference_worker_transformation.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker_transformation.NIL, v_iteration = (SubLObject)inference_worker_transformation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker_transformation.ONE_INTEGER)) {
                    id = ((inference_worker_transformation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker_transformation.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker_transformation.NIL == id_index.id_index_tombstone_p(inference) || inference_worker_transformation.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_transformation.$kw51$SKIP)) {
                        if (inference_worker_transformation.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker_transformation.$kw51$SKIP;
                        }
                        if (inference_worker_transformation.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$14 = idx;
            if (inference_worker_transformation.NIL == id_index.id_index_sparse_objects_empty_p(idx_$14)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$14);
                SubLObject id2 = (SubLObject)inference_worker_transformation.NIL;
                SubLObject inference2 = (SubLObject)inference_worker_transformation.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker_transformation.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker_transformation.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16873L)
    public static SubLObject compute_strategic_properties_of_meta_transformation_tactic(final SubLObject tactic, final SubLObject strategy) {
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17005L)
    public static SubLObject transformation_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_p(v_object) && inference_worker_transformation.$kw29$TRANSFORMATION == inference_datastructures_problem_link.problem_link_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17171L)
    public static SubLObject transformation_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != inference_datastructures_tactic.tactic_p(tactic) && inference_worker_transformation.$kw29$TRANSFORMATION == inference_datastructures_tactic.tactic_type(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17302L)
    public static SubLObject transformation_tactic_rule(final SubLObject transformation_tactic) {
        return inference_datastructures_tactic.tactic_data(transformation_tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17567L)
    public static SubLObject transformation_rule_tactic_p(final SubLObject v_object) {
        if (inference_worker_transformation.NIL != transformation_tactic_p(v_object)) {
            return list_utilities.sublisp_boolean(transformation_tactic_rule(v_object));
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17721L)
    public static SubLObject transformation_generator_tactic_p(final SubLObject v_object) {
        if (inference_worker_transformation.NIL != transformation_tactic_p(v_object)) {
            return Types.sublisp_null(transformation_tactic_rule(v_object));
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17986L)
    public static SubLObject transformation_generator_tactic_lookahead_rule(final SubLObject transformation_generator_tactic) {
        assert inference_worker_transformation.NIL != transformation_generator_tactic_p(transformation_generator_tactic) : transformation_generator_tactic;
        final SubLObject iterator = inference_datastructures_tactic.tactic_progress_iterator(transformation_generator_tactic);
        if (inference_worker_transformation.NIL != iteration.iterator_p(iterator)) {
            final SubLObject state = iteration.iteration_state_peek(iterator);
            if (state.isList()) {
                final SubLObject rules = state.first();
                if (rules.isList()) {
                    final SubLObject rule = rules.first();
                    if (inference_worker_transformation.NIL != assertion_handles.assertion_p(rule)) {
                        return rule;
                    }
                }
            }
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 18586L)
    public static SubLObject transformation_tactic_lookahead_rule(final SubLObject transformation_tactic) {
        SubLObject rule = transformation_tactic_rule(transformation_tactic);
        if (inference_worker_transformation.NIL == rule) {
            rule = transformation_generator_tactic_lookahead_rule(transformation_tactic);
        }
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 18943L)
    public static SubLObject transformation_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != inference_datastructures_proof.proof_p(v_object) && inference_worker_transformation.NIL != transformation_link_p(inference_datastructures_proof.proof_link(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19074L)
    public static SubLObject transformation_proof_rule_assertion(final SubLObject proof) {
        assert inference_worker_transformation.NIL != transformation_proof_p(proof) : proof;
        return inference_datastructures_proof.proof_supports(proof).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19218L)
    public static SubLObject transformation_proof_additional_supports(final SubLObject proof) {
        assert inference_worker_transformation.NIL != transformation_proof_p(proof) : proof;
        return inference_datastructures_proof.proof_supports(proof).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19366L)
    public static SubLObject transformation_proof_subproof(final SubLObject proof) {
        assert inference_worker_transformation.NIL != transformation_proof_p(proof) : proof;
        return inference_datastructures_proof.proof_first_subproof(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19532L)
    public static SubLObject generalized_transformation_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != transformation_link_p(v_object) || inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_link_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19713L)
    public static SubLObject generalized_transformation_link_rule_assertion(final SubLObject link) {
        if (inference_worker_transformation.NIL != transformation_link_p(link)) {
            return transformation_link_rule_assertion(link);
        }
        if (inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            return inference_worker_residual_transformation.residual_transformation_link_rule_assertion(link);
        }
        return Errors.error((SubLObject)inference_worker_transformation.$str54$generalized_transformation_link_o, link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 20071L)
    public static SubLObject generalized_transformation_link_unaffected_by_exceptionsP(final SubLObject link) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL == abnormal.rule_has_exceptionsP(generalized_transformation_link_rule_assertion(link)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 20248L)
    public static SubLObject generalized_transformation_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != inference_datastructures_proof.proof_p(v_object) && inference_worker_transformation.NIL != generalized_transformation_link_p(inference_datastructures_proof.proof_link(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 20404L)
    public static SubLObject generalized_transformation_proof_rule_assertion(final SubLObject proof) {
        if (inference_worker_transformation.NIL != transformation_proof_p(proof)) {
            return transformation_proof_rule_assertion(proof);
        }
        if (inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return inference_worker_residual_transformation.residual_transformation_proof_rule_assertion(proof);
        }
        return Errors.error((SubLObject)inference_worker_transformation.$str55$generalized_transformation_proof_, proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 20766L)
    public static SubLObject generalized_transformation_proof_rule_bindings(final SubLObject proof) {
        if (inference_worker_transformation.NIL != transformation_proof_p(proof)) {
            return transformation_proof_rule_bindings(proof);
        }
        if (inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return inference_worker_residual_transformation.residual_transformation_proof_rule_bindings(proof);
        }
        return Errors.error((SubLObject)inference_worker_transformation.$str55$generalized_transformation_proof_, proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21128L)
    public static SubLObject generalized_transformation_proof_transformation_link(final SubLObject proof) {
        if (inference_worker_transformation.NIL != transformation_proof_p(proof)) {
            return inference_datastructures_proof.proof_link(proof);
        }
        if (inference_worker_transformation.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return inference_worker_residual_transformation.residual_transformation_proof_motivating_transformation_link(proof);
        }
        return Errors.error((SubLObject)inference_worker_transformation.$str55$generalized_transformation_proof_, proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21486L)
    public static SubLObject determine_new_literal_transformation_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store_var = inference_datastructures_problem.problem_store(problem);
        final SubLObject _prev_bind_0 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$evaluatable_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_4 = control_vars.$negation_by_failure$.currentBinding(thread);
        try {
            control_vars.$hl_failure_backchaining$.bind((SubLObject)inference_worker_transformation.T, thread);
            control_vars.$unbound_rule_backchain_enabled$.bind((SubLObject)inference_worker_transformation.T, thread);
            control_vars.$evaluatable_backchain_enabled$.bind((SubLObject)inference_worker_transformation.T, thread);
            control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
            determine_new_literal_transformation_tactics_int(problem, asent, sense, (SubLObject)inference_worker_transformation.UNPROVIDED);
        }
        finally {
            control_vars.$negation_by_failure$.rebind(_prev_bind_4, thread);
            control_vars.$evaluatable_backchain_enabled$.rebind(_prev_bind_3, thread);
            control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_2, thread);
            control_vars.$hl_failure_backchaining$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21783L)
    public static SubLObject determine_new_literal_transformation_tactics_int(final SubLObject problem, final SubLObject asent, final SubLObject sense, SubLObject disabled_modules) {
        if (disabled_modules == inference_worker_transformation.UNPROVIDED) {
            disabled_modules = (SubLObject)inference_worker_transformation.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject tactic_specs = cdolist_list_var = determine_literal_transformation_tactic_specs(asent, sense, disabled_modules);
        SubLObject tactic_spec = (SubLObject)inference_worker_transformation.NIL;
        tactic_spec = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tactic_spec;
            SubLObject hl_module = (SubLObject)inference_worker_transformation.NIL;
            SubLObject productivity = (SubLObject)inference_worker_transformation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list56);
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list56);
            productivity = current.first();
            current = current.rest();
            if (inference_worker_transformation.NIL == current) {
                new_transformation_tactic(problem, hl_module, productivity, (SubLObject)inference_worker_transformation.NIL);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_transformation.$list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        }
        return tactic_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 22195L)
    public static SubLObject determine_rules_for_literal_transformation_tactics(final SubLObject problem, SubLObject asent, final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (inference_worker_transformation.NIL != inference_czer.backchaining_on_ist_enabledP() && inference_worker_transformation.NIL != el_utilities.ist_sentence_p(asent, (SubLObject)inference_worker_transformation.UNPROVIDED) && inference_worker_transformation.NIL != variables.fully_bound_p(el_utilities.designated_mt(asent))) {
            mt = el_utilities.designated_mt(asent);
            asent = el_utilities.designated_sentence(asent);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject candidate_rules = (SubLObject)inference_worker_transformation.NIL;
            thread.resetMultipleValues();
            final SubLObject inference = problem_inference_and_non_continuable_problem_store_private(problem);
            final SubLObject non_continuable_private_problem_storeP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (inference_worker_transformation.NIL != non_continuable_private_problem_storeP && inference_worker_transformation.NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference)) {
                SubLObject rules = (SubLObject)inference_worker_transformation.NIL;
                final SubLObject set_var = inference_datastructures_inference.inference_allowed_rules(inference);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject rule;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    rule = set_contents.do_set_contents_next(basis_object, state);
                    if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state, rule)) {
                        rules = (SubLObject)ConsesLow.cons(rule, rules);
                    }
                }
                candidate_rules = transformation_modules.sort_rules_via_current_inference_rule_preference(rules);
            }
            else {
                final SubLObject rule_select_method = inference_modules.hl_module_rule_select_func(hl_module);
                if (rule_select_method.isFunctionSpec()) {
                    candidate_rules = Functions.funcall(rule_select_method, asent);
                }
            }
            final SubLObject rule_filter_method = inference_modules.hl_module_rule_filter_func(hl_module);
            SubLObject rules2 = (SubLObject)inference_worker_transformation.NIL;
            if (!rule_filter_method.isFunctionSpec()) {
                rules2 = conses_high.copy_list(candidate_rules);
            }
            else {
                SubLObject cdolist_list_var = candidate_rules;
                SubLObject rule2 = (SubLObject)inference_worker_transformation.NIL;
                rule2 = cdolist_list_var.first();
                while (inference_worker_transformation.NIL != cdolist_list_var) {
                    if (inference_worker_transformation.NIL != Functions.funcall(rule_filter_method, asent, rule2)) {
                        rules2 = (SubLObject)ConsesLow.cons(rule2, rules2);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rule2 = cdolist_list_var.first();
                }
                rules2 = Sequences.nreverse(rules2);
            }
            rules2 = Sequences.delete_if(Symbols.symbol_function((SubLObject)inference_worker_transformation.$sym57$INFERENCE_EXCEPTED_ASSERTION_), rules2, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED);
            if (inference_worker_transformation.NIL != genl_rules_enabledP()) {
                rules2 = max_rules(rules2, (SubLObject)inference_worker_transformation.UNPROVIDED);
            }
            return rules2;
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 24284L)
    public static SubLObject problem_inference_and_non_continuable_problem_store_private(final SubLObject problem) {
        final SubLObject problem_store = inference_datastructures_problem.problem_store(problem);
        SubLObject non_continuableP = (SubLObject)inference_worker_transformation.NIL;
        SubLObject problem_store_privateP = (SubLObject)inference_worker_transformation.NIL;
        SubLObject inference = (SubLObject)inference_worker_transformation.NIL;
        if (inference_worker_transformation.NIL != inference_datastructures_problem_store.problem_store_has_only_one_inferenceP(problem_store)) {
            inference = inference_datastructures_problem_store.first_problem_store_inference(problem_store);
            problem_store_privateP = inference_datastructures_inference.inference_problem_store_privateP(inference);
            non_continuableP = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL == inference_datastructures_inference.inference_continuableP(inference));
        }
        return Values.values(inference, (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != problem_store_privateP && inference_worker_transformation.NIL != non_continuableP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 25073L)
    public static SubLObject single_literal_problem_candidate_transformation_tactic_specs(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_transformation.NIL != inference_datastructures_problem.single_literal_problem_p(problem) : problem;
        final SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        final SubLObject sense = inference_datastructures_problem.single_literal_problem_sense(problem);
        SubLObject tactic_specs = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject store_var = inference_datastructures_problem.problem_store(problem);
        final SubLObject _prev_bind_0 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$evaluatable_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_4 = control_vars.$negation_by_failure$.currentBinding(thread);
        try {
            control_vars.$hl_failure_backchaining$.bind((SubLObject)inference_worker_transformation.T, thread);
            control_vars.$unbound_rule_backchain_enabled$.bind((SubLObject)inference_worker_transformation.T, thread);
            control_vars.$evaluatable_backchain_enabled$.bind((SubLObject)inference_worker_transformation.T, thread);
            control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
            tactic_specs = determine_literal_transformation_tactic_specs(asent, sense, (SubLObject)inference_worker_transformation.NIL);
        }
        finally {
            control_vars.$negation_by_failure$.rebind(_prev_bind_4, thread);
            control_vars.$evaluatable_backchain_enabled$.rebind(_prev_bind_3, thread);
            control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_2, thread);
            control_vars.$hl_failure_backchaining$.rebind(_prev_bind_0, thread);
        }
        return tactic_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 25549L)
    public static SubLObject determine_literal_transformation_tactic_specs(final SubLObject asent, final SubLObject sense, final SubLObject disabled_modules) {
        return determine_literal_transformation_tactic_specs_int(asent, sense, disabled_modules, (SubLObject)inference_worker_transformation.$kw60$TACTIC_SPECS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 25841L)
    public static SubLObject determine_literal_transformation_tactic_specs_int(final SubLObject asent, final SubLObject sense, final SubLObject disabled_modules, final SubLObject return_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic_specs = (SubLObject)inference_worker_transformation.NIL;
        SubLObject total_productivity = (SubLObject)inference_worker_transformation.ZERO_INTEGER;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject supplanted_modules = (SubLObject)inference_worker_transformation.NIL;
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
        for (exclusive_foundP = (SubLObject)inference_worker_transformation.NIL, rest = (SubLObject)inference_worker_transformation.NIL, rest = inference_modules.transformation_modules(); inference_worker_transformation.NIL == exclusive_foundP && inference_worker_transformation.NIL != rest; rest = rest.rest()) {
            hl_module = rest.first();
            if (inference_worker_transformation.NIL != inference_modules.hl_module_activeP(hl_module, disabled_modules) && (inference_worker_transformation.NIL == supplanted_modules || inference_worker_transformation.NIL == conses_high.member(hl_module, supplanted_modules, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED)) && inference_worker_transformation.NIL != inference_modules.hl_module_sense_relevant_p(hl_module, sense) && inference_worker_transformation.NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, predicate) && inference_worker_transformation.NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent) && inference_worker_transformation.NIL != inference_modules.hl_module_required_mt_relevantP(hl_module) && inference_worker_transformation.NIL != inference_modules.hl_module_direction_relevantP(hl_module)) {
                exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                if (inference_worker_transformation.NIL == exclusive_func || (exclusive_func.isFunctionSpec() && inference_worker_transformation.NIL != Functions.funcall(exclusive_func, asent))) {
                    if (inference_worker_transformation.NIL != exclusive_func) {
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
                    if (inference_worker_transformation.NIL == required_func || (required_func.isFunctionSpec() && inference_worker_transformation.NIL != Functions.funcall(required_func, asent))) {
                        cost = inference_modules.hl_module_asent_cost(hl_module, asent);
                        if (inference_worker_transformation.NIL != cost) {
                            productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                            if (return_type.eql((SubLObject)inference_worker_transformation.$kw60$TACTIC_SPECS)) {
                                tactic_spec = (SubLObject)ConsesLow.list(hl_module, productivity);
                                tactic_specs = (SubLObject)ConsesLow.cons(tactic_spec, tactic_specs);
                            }
                            else if (return_type.eql((SubLObject)inference_worker_transformation.$kw61$TOTAL_PRODUCTIVITY)) {
                                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, productivity);
                            }
                        }
                    }
                }
            }
        }
        if (return_type.eql((SubLObject)inference_worker_transformation.$kw60$TACTIC_SPECS)) {
            return tactic_specs;
        }
        if (return_type.eql((SubLObject)inference_worker_transformation.$kw61$TOTAL_PRODUCTIVITY)) {
            return total_productivity;
        }
        Errors.error((SubLObject)inference_worker_transformation.$str62$unexpected_tactic_specs_return_ty, return_type);
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 28146L)
    public static SubLObject literal_level_transformation_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != transformation_tactic_p(tactic) && inference_worker_transformation.NIL != inference_worker.literal_level_tactic_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 28296L)
    public static SubLObject maybe_new_transformation_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject tactic, final SubLObject transformation_bindings, final SubLObject rule_assertion, final SubLObject more_supports, final SubLObject non_explanatory_subquery) {
        final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(supported_problem);
        if (inference_worker_transformation.NIL == leviathan.rule_bindings_wff_cachedP(rule_assertion, transformation_bindings, mt)) {
            Errors.warn((SubLObject)inference_worker_transformation.$str63$pruning__s__s__s, rule_assertion, mt, transformation_bindings);
            return (SubLObject)inference_worker_transformation.NIL;
        }
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject transformation_link = new_transformation_link(supported_problem, supporting_mapped_problem, hl_module, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        inference_datastructures_problem_store.problem_store_note_transformation_rule_considered(store, rule_assertion);
        inference_worker_residual_transformation.maybe_possibly_add_residual_transformation_links_via_transformation_link(transformation_link);
        if (inference_worker_transformation.NIL != supporting_mapped_problem) {
            recompute_thrown_away_due_to_new_transformation_link(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
        }
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 29535L)
    public static SubLObject recompute_thrown_away_due_to_new_transformation_link(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker_transformation.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_transformation.$kw51$SKIP)) {
            final SubLObject idx_$18 = idx;
            if (inference_worker_transformation.NIL == id_index.id_index_dense_objects_empty_p(idx_$18, (SubLObject)inference_worker_transformation.$kw51$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$18);
                final SubLObject backwardP_var = (SubLObject)inference_worker_transformation.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker_transformation.NIL, v_iteration = (SubLObject)inference_worker_transformation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker_transformation.ONE_INTEGER)) {
                    id = ((inference_worker_transformation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker_transformation.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker_transformation.NIL == id_index.id_index_tombstone_p(inference) || inference_worker_transformation.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_transformation.$kw51$SKIP)) {
                        if (inference_worker_transformation.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker_transformation.$kw51$SKIP;
                        }
                        if (inference_worker_transformation.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
                                    if (inference_worker_transformation.NIL != abductive_tactician.abductive_strategy_p(strategy)) {
                                        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                                        sibling_tactic = (SubLObject)inference_worker_transformation.NIL;
                                        sibling_tactic = cdolist_list_var.first();
                                        while (inference_worker_transformation.NIL != cdolist_list_var) {
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
            final SubLObject idx_$19 = idx;
            if (inference_worker_transformation.NIL == id_index.id_index_sparse_objects_empty_p(idx_$19)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$19);
                SubLObject id2 = (SubLObject)inference_worker_transformation.NIL;
                SubLObject inference2 = (SubLObject)inference_worker_transformation.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker_transformation.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            SubLObject cdolist_list_var2;
                            SubLObject sibling_tactic2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker_transformation.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy2);
                                    if (inference_worker_transformation.NIL != abductive_tactician.abductive_strategy_p(strategy2)) {
                                        cdolist_list_var2 = inference_datastructures_problem.problem_tactics(problem);
                                        sibling_tactic2 = (SubLObject)inference_worker_transformation.NIL;
                                        sibling_tactic2 = cdolist_list_var2.first();
                                        while (inference_worker_transformation.NIL != cdolist_list_var2) {
                                            inference_datastructures_strategy.set_tactic_recompute_thrown_away(sibling_tactic2, strategy2);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            sibling_tactic2 = cdolist_list_var2.first();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 29895L)
    public static SubLObject new_transformation_tactic(final SubLObject problem, final SubLObject hl_module, final SubLObject productivity, final SubLObject rule) {
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, rule);
        final SubLObject completeness = (SubLObject)inference_worker_transformation.$kw50$GROSSLY_INCOMPLETE;
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, (SubLObject)inference_worker_transformation.UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker_transformation.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_transformation.$kw51$SKIP)) {
            final SubLObject idx_$20 = idx;
            if (inference_worker_transformation.NIL == id_index.id_index_dense_objects_empty_p(idx_$20, (SubLObject)inference_worker_transformation.$kw51$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                final SubLObject backwardP_var = (SubLObject)inference_worker_transformation.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker_transformation.NIL, v_iteration = (SubLObject)inference_worker_transformation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker_transformation.ONE_INTEGER)) {
                    id = ((inference_worker_transformation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker_transformation.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker_transformation.NIL == id_index.id_index_tombstone_p(inference) || inference_worker_transformation.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_transformation.$kw51$SKIP)) {
                        if (inference_worker_transformation.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker_transformation.$kw51$SKIP;
                        }
                        if (inference_worker_transformation.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$21 = idx;
            if (inference_worker_transformation.NIL == id_index.id_index_sparse_objects_empty_p(idx_$21)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$21);
                SubLObject id2 = (SubLObject)inference_worker_transformation.NIL;
                SubLObject inference2 = (SubLObject)inference_worker_transformation.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker_transformation.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker_transformation.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker_transformation.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker_transformation.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 30293L)
    public static SubLObject compute_strategic_properties_of_transformation_tactic(final SubLObject tactic, final SubLObject strategy) {
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 30420L)
    public static SubLObject with_transformation_tactic_execution_assumptions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tactic = (SubLObject)inference_worker_transformation.NIL;
        SubLObject mt = (SubLObject)inference_worker_transformation.NIL;
        SubLObject sense = (SubLObject)inference_worker_transformation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list64);
        tactic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list64);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list64);
        sense = current.first();
        current = current.rest();
        if (inference_worker_transformation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject tactic_var = (SubLObject)inference_worker_transformation.$sym65$TACTIC_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)inference_worker_transformation.$sym42$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tactic_var, tactic)), (SubLObject)ConsesLow.list((SubLObject)inference_worker_transformation.$sym66$WITH_INFERENCE_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)inference_worker_transformation.$sym42$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_worker_transformation.$sym67$_INFERENCE_EXPAND_HL_MODULE_, (SubLObject)ConsesLow.list((SubLObject)inference_worker_transformation.$sym68$TACTIC_HL_MODULE, tactic_var)), (SubLObject)ConsesLow.list((SubLObject)inference_worker_transformation.$sym69$_INFERENCE_EXPAND_SENSE_, sense)), (SubLObject)ConsesLow.listS((SubLObject)inference_worker_transformation.$sym70$WITH_PROBLEM_STORE_TRANSFORMATION_ASSUMPTIONS, (SubLObject)ConsesLow.list((SubLObject)inference_worker_transformation.$sym71$TACTIC_STORE, tactic_var), ConsesLow.append(body, (SubLObject)inference_worker_transformation.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_transformation.$list64);
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 31018L)
    public static SubLObject execute_literal_level_transformation_tactic(final SubLObject tactic, final SubLObject mt, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = backward.$inference_expand_hl_module$.currentBinding(thread);
        final SubLObject _prev_bind_5 = backward.$inference_expand_sense$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(tactic), thread);
            backward.$inference_expand_sense$.bind(sense, thread);
            final SubLObject store_var = inference_datastructures_tactic.tactic_store(tactic);
            final SubLObject _prev_bind_0_$22 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
            final SubLObject _prev_bind_1_$23 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
            final SubLObject _prev_bind_2_$24 = control_vars.$evaluatable_backchain_enabled$.currentBinding(thread);
            final SubLObject _prev_bind_3_$25 = control_vars.$negation_by_failure$.currentBinding(thread);
            try {
                control_vars.$hl_failure_backchaining$.bind((SubLObject)inference_worker_transformation.T, thread);
                control_vars.$unbound_rule_backchain_enabled$.bind((SubLObject)inference_worker_transformation.T, thread);
                control_vars.$evaluatable_backchain_enabled$.bind((SubLObject)inference_worker_transformation.T, thread);
                control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                if (inference_worker_transformation.NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                    inference_datastructures_tactic.tactic_in_progress_next(tactic);
                }
                else {
                    final SubLObject progress_iterator = maybe_make_transformation_tactic_progress_iterator(tactic, asent, sense);
                    if (inference_worker_transformation.NIL != progress_iterator) {
                        if (progress_iterator.isList()) {
                            SubLObject cdolist_list_var = progress_iterator;
                            SubLObject rule = (SubLObject)inference_worker_transformation.NIL;
                            rule = cdolist_list_var.first();
                            while (inference_worker_transformation.NIL != cdolist_list_var) {
                                handle_one_transformation_tactic_rule_select_result(tactic, rule);
                                cdolist_list_var = cdolist_list_var.rest();
                                rule = cdolist_list_var.first();
                            }
                        }
                        else {
                            inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                        }
                    }
                }
            }
            finally {
                control_vars.$negation_by_failure$.rebind(_prev_bind_3_$25, thread);
                control_vars.$evaluatable_backchain_enabled$.rebind(_prev_bind_2_$24, thread);
                control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_1_$23, thread);
                control_vars.$hl_failure_backchaining$.rebind(_prev_bind_0_$22, thread);
            }
        }
        finally {
            backward.$inference_expand_sense$.rebind(_prev_bind_5, thread);
            backward.$inference_expand_hl_module$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 31997L)
    public static SubLObject maybe_make_transformation_tactic_progress_iterator(final SubLObject tactic, final SubLObject asent, final SubLObject sense) {
        if (inference_worker_transformation.NIL != meta_transformation_tactic_p(tactic)) {
            return maybe_make_meta_transformation_progress_iterator(tactic, asent, sense);
        }
        if (inference_worker_transformation.NIL == transformation_tactic_rule(tactic)) {
            return maybe_make_transformation_rule_select_progress_iterator(tactic, asent);
        }
        return maybe_make_transformation_expand_progress_iterator(tactic, asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 32432L)
    public static SubLObject maybe_make_meta_transformation_progress_iterator(final SubLObject tactic, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = inference_datastructures_tactic.tactic_hl_module_name(tactic);
        if (inference_worker_transformation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && name != inference_worker_transformation.$kw49$DETERMINE_NEW_TRANSFORMATION_TACTICS) {
            Errors.error((SubLObject)inference_worker_transformation.$str72$time_to_add_meta_transformation_s, name);
        }
        final SubLObject progress_iterator = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject cdolist_list_var;
        final SubLObject tactic_specs = cdolist_list_var = determine_literal_transformation_tactic_specs(asent, sense, (SubLObject)inference_worker_transformation.NIL);
        SubLObject tactic_spec = (SubLObject)inference_worker_transformation.NIL;
        tactic_spec = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tactic_spec;
            SubLObject hl_module = (SubLObject)inference_worker_transformation.NIL;
            SubLObject productivity = (SubLObject)inference_worker_transformation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list56);
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_transformation.$list56);
            productivity = current.first();
            current = current.rest();
            if (inference_worker_transformation.NIL == current) {
                new_transformation_tactic(problem, hl_module, productivity, (SubLObject)inference_worker_transformation.NIL);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_transformation.$list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        }
        return progress_iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 33642L)
    public static SubLObject maybe_make_transformation_rule_select_progress_iterator(final SubLObject tactic, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        rules = determine_rules_for_literal_transformation_tactics(problem, asent, hl_module);
        final SubLObject old_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
        final SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(Sequences.length(rules));
        inference_datastructures_tactic.set_tactic_productivity(tactic, new_productivity, (SubLObject)inference_worker_transformation.NIL);
        if (inference_worker_transformation.NIL != list_utilities.lengthGE(rules, inference_worker_transformation.$transformation_tactic_iteration_threshold$.getDynamicValue(thread), (SubLObject)inference_worker_transformation.UNPROVIDED)) {
            rules = new_transformation_rule_select_progress_iterator(tactic, rules);
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 34666L)
    public static SubLObject new_transformation_rule_select_progress_iterator(final SubLObject tactic, final SubLObject tactic_specs) {
        return inference_datastructures_tactic.new_tactic_progress_iterator((SubLObject)inference_worker_transformation.$kw73$TRANSFORMATION_RULE_SELECT, tactic, tactic_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 34842L)
    public static SubLObject handle_one_transformation_tactic_rule_select_result(final SubLObject transformation_tactic, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_rule = transformation_tactic_rule(transformation_tactic);
        if (inference_worker_transformation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker_transformation.NIL != existing_rule) {
            Errors.error((SubLObject)inference_worker_transformation.$str74$transformation_tactic__S_already_, transformation_tactic, existing_rule);
        }
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(transformation_tactic);
        final SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children((SubLObject)inference_worker_transformation.ONE_INTEGER);
        inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(transformation_tactic, (SubLObject)inference_worker_transformation.UNPROVIDED);
        return new_transformation_tactic(problem, hl_module, productivity, rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 35542L)
    public static SubLObject maybe_make_transformation_expand_progress_iterator(final SubLObject tactic, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject progress_iterator = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject _prev_bind_0 = backward.$transformation_add_node_method$.currentBinding(thread);
        try {
            backward.$transformation_add_node_method$.bind((SubLObject)inference_worker_transformation.$sym75$HANDLE_TRANSFORMATION_ADD_NODE_FOR_EXPAND_RESULTS, thread);
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            final SubLObject rule = transformation_tactic_rule(tactic);
            final SubLObject expand_method = inference_modules.hl_module_expand_func(hl_module);
            if (expand_method.isFunctionSpec()) {
                Functions.funcall(expand_method, asent, rule);
            }
        }
        finally {
            backward.$transformation_add_node_method$.rebind(_prev_bind_0, thread);
        }
        return progress_iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 36319L)
    public static SubLObject handle_transformation_add_node_for_expand_results(final SubLObject rule_assertion, final SubLObject rule_pivot_asent, final SubLObject rule_pivot_sense, SubLObject unification_bindings, SubLObject unification_dependent_dnf, final SubLObject more_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        unification_bindings = bindings.inference_simplify_unification_bindings(unification_bindings);
        unification_bindings = bindings.possibly_optimize_bindings_wrt_equivalence(unification_bindings);
        if (inference_worker_transformation.NIL != inference_worker_transformation.$stitch_up_bindings_loopP$.getDynamicValue(thread)) {
            unification_bindings = bindings.possibly_stitch_up_bindings_loop(unification_bindings);
        }
        final SubLObject tactic = inference_worker.currently_executing_tactic();
        final SubLObject unification_explanatory_dnf = el_utilities.copy_clause(unification_dependent_dnf);
        if (inference_worker_transformation.NIL != rule_assertion_has_some_pragmatic_requirementP(rule_assertion, (SubLObject)inference_worker_transformation.NIL)) {
            final SubLObject pragmatic_requirements_dnf = backward_rule_pragmatic_dnf(rule_assertion, (SubLObject)inference_worker_transformation.NIL);
            unification_dependent_dnf = nmerge_dnf(unification_dependent_dnf, pragmatic_requirements_dnf);
        }
        if (inference_worker_transformation.NIL != rule_assertion_worth_adding_type_constraintsP(rule_assertion)) {
            final SubLObject type_constraint_dnf = inference_trampolines.inference_rule_type_constraints(rule_assertion);
            unification_dependent_dnf = nmerge_dnf(unification_dependent_dnf, type_constraint_dnf);
        }
        final SubLObject dont_care_constraints = transformation_additional_dont_care_constraints(rule_pivot_asent, unification_dependent_dnf, rule_assertion, unification_bindings);
        if (inference_worker_transformation.NIL != dont_care_constraints) {
            final SubLObject dont_care_dnf = clauses.make_dnf((SubLObject)inference_worker_transformation.NIL, dont_care_constraints);
            unification_dependent_dnf = nmerge_dnf(unification_dependent_dnf, dont_care_dnf);
        }
        final SubLObject unrestricted_transformation_dependent_dnf = unification_dependent_dnf_to_transformation_dependent_dnf(unification_dependent_dnf);
        final SubLObject unrestricted_transformation_explanatory_dnf = unification_dependent_dnf_to_transformation_dependent_dnf(unification_explanatory_dnf);
        final SubLObject transformation_bindings = unification_bindings_to_transformation_bindings(unification_bindings);
        return complete_execution_of_transformation_tactic(tactic, transformation_bindings, rule_assertion, more_supports, unrestricted_transformation_dependent_dnf, unrestricted_transformation_explanatory_dnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 39027L)
    public static SubLObject rule_assertion_worth_adding_type_constraintsP(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker_transformation.NIL == inference_worker_transformation.$inference_transformation_type_checking_enabledP$.getDynamicValue(thread)) {
            return (SubLObject)inference_worker_transformation.NIL;
        }
        return (SubLObject)inference_worker_transformation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 39305L)
    public static SubLObject transformation_additional_dont_care_constraints(final SubLObject rule_pivot_asent, final SubLObject unification_dependent_dnf, final SubLObject rule_assertion, final SubLObject unification_bindings) {
        final SubLObject source_var_pos_lits = backward_utilities.additional_source_variable_pos_lits(rule_pivot_asent, unification_dependent_dnf, rule_assertion);
        SubLObject dont_care_constraints = (SubLObject)inference_worker_transformation.NIL;
        SubLObject cdolist_list_var = source_var_pos_lits;
        SubLObject source_var_pos_lit = (SubLObject)inference_worker_transformation.NIL;
        source_var_pos_lit = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            final SubLObject substituted_pos_lit = bindings.apply_bindings(unification_bindings, source_var_pos_lit);
            if (inference_worker_transformation.NIL == variables.fully_bound_p(substituted_pos_lit)) {
                dont_care_constraints = (SubLObject)ConsesLow.cons(source_var_pos_lit, dont_care_constraints);
            }
            cdolist_list_var = cdolist_list_var.rest();
            source_var_pos_lit = cdolist_list_var.first();
        }
        return Sequences.nreverse(dont_care_constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 39905L)
    public static SubLObject nmerge_dnf(final SubLObject existing_dnf, final SubLObject added_dnf) {
        return clauses.make_dnf(ConsesLow.append(clauses.neg_lits(existing_dnf), clauses.neg_lits(added_dnf)), ConsesLow.append(clauses.pos_lits(existing_dnf), clauses.pos_lits(added_dnf)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 40309L)
    public static SubLObject merge_dnf(final SubLObject dnf1, final SubLObject dnf2) {
        return nmerge_dnf(el_utilities.copy_clause(dnf1), dnf2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 40424L)
    public static SubLObject complete_execution_of_transformation_tactic(final SubLObject tactic, final SubLObject transformation_bindings, final SubLObject rule_assertion, final SubLObject more_supports, final SubLObject unrestricted_transformation_dependent_dnf, final SubLObject unrestricted_transformation_explanatory_dnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        final SubLObject restricted_transformation_dependent_dnf = bindings.apply_bindings(transformation_bindings, unrestricted_transformation_dependent_dnf);
        SubLObject supporting_mapped_problem = (SubLObject)inference_worker_transformation.NIL;
        if (inference_worker_transformation.NIL == clauses.empty_clauseP(restricted_transformation_dependent_dnf)) {
            final SubLObject dependent_query = inference_czer.dnf_and_mt_to_hl_query(restricted_transformation_dependent_dnf, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject abduction_allowedP = inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem.problem_store(inference_datastructures_tactic.tactic_problem(tactic)));
            if (inference_worker_transformation.NIL == potentially_wf_transformation_dependent_query(dependent_query, abduction_allowedP)) {
                return (SubLObject)inference_worker_transformation.NIL;
            }
            final SubLObject dependent_query_free_hl_vars = variables.sort_hl_variable_list_memoized(conses_high.intersection(cycl_utilities.expression_gather(dependent_query, (SubLObject)inference_worker_transformation.$sym76$HL_VAR_, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED), cycl_utilities.expression_gather(bindings.apply_bindings(transformation_bindings, inference_datastructures_problem.problem_free_hl_vars(inference_datastructures_tactic.tactic_problem(tactic))), (SubLObject)inference_worker_transformation.$sym76$HL_VAR_, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED), (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED));
            supporting_mapped_problem = inference_worker.find_or_create_problem(store, dependent_query, dependent_query_free_hl_vars, (SubLObject)inference_worker_transformation.UNPROVIDED);
        }
        final SubLObject non_explanatory_subquery = compute_transformation_non_explanatory_subquery(unrestricted_transformation_dependent_dnf, unrestricted_transformation_explanatory_dnf, restricted_transformation_dependent_dnf, transformation_bindings, supporting_mapped_problem);
        return maybe_new_transformation_link(supported_problem, supporting_mapped_problem, tactic, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 42210L)
    public static SubLObject compute_transformation_non_explanatory_subquery(final SubLObject unrestricted_transformation_dependent_dnf, final SubLObject unrestricted_transformation_explanatory_dnf, final SubLObject restricted_transformation_dependent_dnf, final SubLObject transformation_bindings, final SubLObject supporting_mapped_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unrestricted_transformation_dependent_dnf.equal(unrestricted_transformation_explanatory_dnf)) {
            return (SubLObject)inference_worker_transformation.NIL;
        }
        final SubLObject non_explanatory_dnf = clause_utilities.clause_difference(unrestricted_transformation_dependent_dnf, unrestricted_transformation_explanatory_dnf);
        final SubLObject restricted_non_explanatory_dnf = bindings.apply_bindings(transformation_bindings, non_explanatory_dnf);
        final SubLObject non_explanatory_query = inference_czer.dnf_and_mt_to_hl_query(restricted_non_explanatory_dnf, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject non_explanatory_subquery = bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem), non_explanatory_query);
        return non_explanatory_subquery;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 43143L)
    public static SubLObject potentially_wf_transformation_dependent_query(final SubLObject dependent_query, final SubLObject abduction_allowedP) {
        SubLObject cdolist_list_var = dependent_query;
        SubLObject contextualized_dnf = (SubLObject)inference_worker_transformation.NIL;
        contextualized_dnf = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            SubLObject index_var = (SubLObject)inference_worker_transformation.ZERO_INTEGER;
            SubLObject cdolist_list_var_$26 = clauses.neg_lits(contextualized_dnf);
            SubLObject contextualized_asent = (SubLObject)inference_worker_transformation.NIL;
            contextualized_asent = cdolist_list_var_$26.first();
            while (inference_worker_transformation.NIL != cdolist_list_var_$26) {
                final SubLObject sense = (SubLObject)inference_worker_transformation.$kw77$NEG;
                if (inference_worker_transformation.NIL == potentially_wf_restricted_transformation_dependent_asent(contextualized_asent, sense, abduction_allowedP)) {
                    return (SubLObject)inference_worker_transformation.NIL;
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_worker_transformation.ONE_INTEGER);
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                contextualized_asent = cdolist_list_var_$26.first();
            }
            index_var = (SubLObject)inference_worker_transformation.ZERO_INTEGER;
            SubLObject cdolist_list_var_$27 = clauses.pos_lits(contextualized_dnf);
            contextualized_asent = (SubLObject)inference_worker_transformation.NIL;
            contextualized_asent = cdolist_list_var_$27.first();
            while (inference_worker_transformation.NIL != cdolist_list_var_$27) {
                final SubLObject sense = (SubLObject)inference_worker_transformation.$kw78$POS;
                if (inference_worker_transformation.NIL == potentially_wf_restricted_transformation_dependent_asent(contextualized_asent, sense, abduction_allowedP)) {
                    return (SubLObject)inference_worker_transformation.NIL;
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_worker_transformation.ONE_INTEGER);
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                contextualized_asent = cdolist_list_var_$27.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_dnf = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker_transformation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 43538L)
    public static SubLObject potentially_wf_restricted_transformation_dependent_asent(final SubLObject contextualized_asent, final SubLObject sense, final SubLObject abduction_allowedP) {
        SubLObject mt = (SubLObject)inference_worker_transformation.NIL;
        SubLObject asent = (SubLObject)inference_worker_transformation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)inference_worker_transformation.$list79);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)inference_worker_transformation.$list79);
        asent = current.first();
        current = current.rest();
        if (inference_worker_transformation.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != syntactically_valid_asent(asent) && (inference_worker_transformation.NIL != abduction_allowedP || inference_worker_transformation.NIL == cycl_utilities.atomic_sentence_with_pred_p(asent, inference_worker_transformation.$const80$termOfUnit) || inference_worker_transformation.NIL != syntactically_valid_contextualized_term_of_unit_asent(asent, sense)));
        }
        cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)inference_worker_transformation.$list79);
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 44020L)
    public static SubLObject syntactically_valid_asent(final SubLObject asent) {
        return cycl_grammar.cycl_atomic_sentence_p(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 44111L)
    public static SubLObject syntactically_valid_contextualized_term_of_unit_asent(final SubLObject asent, final SubLObject sense) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.$kw78$POS == sense && inference_worker_transformation.NIL != backward.syntactically_valid_term_of_unit_asent(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 44281L)
    public static SubLObject new_transformation_proof(final SubLObject transformation_link, final SubLObject subproof, final SubLObject variable_map) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        if (inference_worker_transformation.NIL != subproof && !inference_worker_transformation.assertionsDisabledInClass && inference_worker_transformation.NIL == inference_datastructures_proof.proof_p(subproof)) {
            throw new AssertionError(subproof);
        }
        final SubLObject transformation_bindings = transformation_link_bindings(transformation_link);
        final SubLObject supporting_subproof_bindings = (SubLObject)((inference_worker_transformation.NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : inference_worker_transformation.NIL);
        final SubLObject subproofs = (SubLObject)((inference_worker_transformation.NIL != subproof) ? ConsesLow.list(subproof) : inference_worker_transformation.NIL);
        final SubLObject canonical_proof_bindings = compute_canonical_transformation_proof_bindings(variable_map, transformation_bindings, supporting_subproof_bindings);
        return inference_worker.propose_new_proof_with_bindings(transformation_link, canonical_proof_bindings, subproofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 45352L)
    public static SubLObject compute_canonical_transformation_proof_bindings(final SubLObject t_link_variable_map, final SubLObject transformation_bindings, final SubLObject supporting_subproof_bindings) {
        final SubLObject subproof_bindings = bindings.transfer_variable_map_to_bindings_filtered(t_link_variable_map, supporting_subproof_bindings);
        final SubLObject final_combined_bindings = unify_transformation_and_subproof_bindings(transformation_bindings, subproof_bindings);
        final SubLObject proof_bindings = extended_supported_problem_bindings_to_supported_problem_bindings(final_combined_bindings);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        return canonical_proof_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 46600L)
    public static SubLObject unification_dependent_dnf_to_transformation_dependent_dnf(final SubLObject unification_dependent_dnf) {
        return unification.variable_base_inversion(unification_dependent_dnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 46801L)
    public static SubLObject unification_bindings_to_transformation_bindings(final SubLObject unification_bindings) {
        SubLObject swapped_unification_bindings = swap_variable_spaces_of_unification_bindings(unification_bindings);
        final SubLObject bindings_to_closed = bindings.bindings_to_closed(swapped_unification_bindings);
        if (inference_worker_transformation.NIL != bindings_to_closed) {
            SubLObject transformation_bindings = (SubLObject)inference_worker_transformation.NIL;
            SubLObject cdolist_list_var = swapped_unification_bindings;
            SubLObject binding = (SubLObject)inference_worker_transformation.NIL;
            binding = cdolist_list_var.first();
            while (inference_worker_transformation.NIL != cdolist_list_var) {
                final SubLObject old_value = bindings.variable_binding_value(binding);
                final SubLObject new_value = bindings.apply_bindings(bindings_to_closed, old_value);
                transformation_bindings = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(bindings.variable_binding_variable(binding), new_value), transformation_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
            swapped_unification_bindings = Sequences.nreverse(transformation_bindings);
        }
        return swapped_unification_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 47966L)
    public static SubLObject swap_variable_spaces_of_unification_bindings(final SubLObject unification_bindings) {
        return unification.variable_base_inversion(unification_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 48293L)
    public static SubLObject transformation_proof_rule_bindings(final SubLObject transformation_proof) {
        assert inference_worker_transformation.NIL != transformation_proof_p(transformation_proof) : transformation_proof;
        final SubLObject transformation_link = inference_datastructures_proof.proof_link(transformation_proof);
        final SubLObject subproof = transformation_proof_subproof(transformation_proof);
        final SubLObject supporting_subproof_bindings = (SubLObject)((inference_worker_transformation.NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : inference_worker_transformation.NIL);
        final SubLObject rule_bindings = compute_transformation_link_rule_bindings(transformation_link, supporting_subproof_bindings);
        return rule_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 49084L)
    public static SubLObject compute_transformation_link_rule_bindings(final SubLObject transformation_link, final SubLObject supporting_subproof_bindings) {
        assert inference_worker_transformation.NIL != transformation_link_p(transformation_link) : transformation_link;
        assert inference_worker_transformation.NIL != bindings.bindings_p(supporting_subproof_bindings) : supporting_subproof_bindings;
        final SubLObject t_link_variable_map = transformation_link_supporting_variable_map(transformation_link);
        final SubLObject transformation_bindings = transformation_link_bindings(transformation_link);
        final SubLObject subproof_bindings = bindings.transfer_variable_map_to_bindings_filtered(t_link_variable_map, supporting_subproof_bindings);
        final SubLObject final_combined_bindings = unify_transformation_and_subproof_bindings(transformation_bindings, subproof_bindings);
        final SubLObject rule_bindings = extended_supported_problem_bindings_to_rule_bindings(final_combined_bindings);
        return rule_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 50409L)
    public static SubLObject transformation_proof_rule_el_bindings(final SubLObject transformation_proof) {
        assert inference_worker_transformation.NIL != transformation_proof_p(transformation_proof) : transformation_proof;
        final SubLObject rule_assertion = transformation_proof_rule_assertion(transformation_proof);
        final SubLObject variable_map = rule_assertion_variable_map(rule_assertion);
        final SubLObject rule_bindings = transformation_proof_rule_bindings(transformation_proof);
        final SubLObject rule_el_bindings = bindings.transfer_variable_map_to_bindings_backwards(variable_map, rule_bindings);
        return rule_el_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 51226L)
    public static SubLObject transformation_proof_el_bindings(final SubLObject transformation_proof) {
        final SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(transformation_proof);
        final SubLObject transformation_link = inference_datastructures_proof.proof_link(transformation_proof);
        final SubLObject transformation_bindings = transformation_link_bindings(transformation_link);
        final SubLObject hl_bindings = bindings.apply_bindings(transformation_bindings, proof_bindings);
        final SubLObject rule_assertion = transformation_proof_rule_assertion(transformation_proof);
        final SubLObject rule_variable_map = rule_assertion_variable_map(rule_assertion);
        return bindings.transfer_variable_map_to_bindings_backwards(rule_variable_map, hl_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 52174L)
    public static SubLObject unify_transformation_and_subproof_bindings(final SubLObject transformation_bindings, final SubLObject subproof_bindings) {
        final SubLObject combined_bindings = ConsesLow.append(subproof_bindings, transformation_bindings);
        if (inference_worker_transformation.NIL != inference_worker.all_bindings_ground_outP(combined_bindings)) {
            return combined_bindings;
        }
        final SubLObject new_unified_bindings = inference_worker.unify_all_equal_bindings(combined_bindings);
        final SubLObject recombined_bindings = ConsesLow.append(new_unified_bindings, combined_bindings);
        SubLObject final_bindings = (SubLObject)inference_worker_transformation.NIL;
        SubLObject working_bindings = (SubLObject)inference_worker_transformation.NIL;
        SubLObject cdolist_list_var = recombined_bindings;
        SubLObject binding = (SubLObject)inference_worker_transformation.NIL;
        binding = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            if (inference_worker_transformation.NIL != inference_worker.binding_ground_outP(binding)) {
                final_bindings = (SubLObject)ConsesLow.cons(binding, final_bindings);
            }
            else {
                working_bindings = (SubLObject)ConsesLow.cons(binding, working_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        final_bindings = Sequences.nreverse(final_bindings);
        working_bindings = Sequences.nreverse(working_bindings);
        if (inference_worker_transformation.NIL == final_bindings) {
            Errors.error((SubLObject)inference_worker_transformation.$str83$Could_not_ground_out__s_and__s, transformation_bindings, subproof_bindings);
        }
        final SubLObject substituted_bindings = bindings.apply_bindings_to_values(final_bindings, working_bindings);
        if (transformation_bindings.equal(substituted_bindings) && subproof_bindings.equal(final_bindings)) {
            Errors.error((SubLObject)inference_worker_transformation.$str84$Could_not_unify_transformation_bi, transformation_bindings, subproof_bindings);
        }
        return unify_transformation_and_subproof_bindings(substituted_bindings, final_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 54222L)
    public static SubLObject extended_supported_problem_bindings_to_supported_problem_bindings(final SubLObject extended_supported_problem_bindings) {
        SubLObject supported_problem_bindings = (SubLObject)inference_worker_transformation.NIL;
        SubLObject cdolist_list_var = extended_supported_problem_bindings;
        SubLObject binding = (SubLObject)inference_worker_transformation.NIL;
        binding = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            final SubLObject variable = bindings.variable_binding_variable(binding);
            if (inference_worker_transformation.NIL != supported_problem_variable_p(variable)) {
                supported_problem_bindings = (SubLObject)ConsesLow.cons(binding, supported_problem_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(supported_problem_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 55236L)
    public static SubLObject supported_problem_variable_p(final SubLObject variable) {
        return unification.base_variable_p(variable);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 55329L)
    public static SubLObject extended_supported_problem_bindings_to_rule_bindings(final SubLObject extended_supported_problem_bindings) {
        SubLObject rule_bindings = (SubLObject)inference_worker_transformation.NIL;
        SubLObject cdolist_list_var = extended_supported_problem_bindings;
        SubLObject binding = (SubLObject)inference_worker_transformation.NIL;
        binding = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            final SubLObject variable = bindings.variable_binding_variable(binding);
            if (inference_worker_transformation.NIL != rule_assertion_variable_p(variable)) {
                rule_bindings = (SubLObject)ConsesLow.cons(binding, rule_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(rule_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 56276L)
    public static SubLObject rule_assertion_variable_p(final SubLObject variable) {
        return unification.non_base_variable_p(variable);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 56370L)
    public static SubLObject rule_assertion_variable_map(final SubLObject rule_assertion) {
        assert inference_worker_transformation.NIL != assertions_high.rule_assertionP(rule_assertion) : rule_assertion;
        final SubLObject variable_names = assertions_high.assertion_variable_names(rule_assertion);
        SubLObject variable_map = (SubLObject)inference_worker_transformation.NIL;
        SubLObject list_var = (SubLObject)inference_worker_transformation.NIL;
        SubLObject variable_name = (SubLObject)inference_worker_transformation.NIL;
        SubLObject variable_number = (SubLObject)inference_worker_transformation.NIL;
        list_var = variable_names;
        variable_name = list_var.first();
        for (variable_number = (SubLObject)inference_worker_transformation.ZERO_INTEGER; inference_worker_transformation.NIL != list_var; list_var = list_var.rest(), variable_name = list_var.first(), variable_number = Numbers.add((SubLObject)inference_worker_transformation.ONE_INTEGER, variable_number)) {
            final SubLObject hl_variable = unification.variable_non_base_version(variables.find_variable_by_id(variable_number));
            final SubLObject el_variable = cycl_variables.make_el_var(variable_name);
            variable_map = bindings.add_variable_binding(el_variable, hl_variable, variable_map);
        }
        variable_map = Sequences.nreverse(variable_map);
        return variable_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 57130L)
    public static SubLObject rule_assertion_base_variable_map(final SubLObject rule_assertion) {
        assert inference_worker_transformation.NIL != assertions_high.rule_assertionP(rule_assertion) : rule_assertion;
        final SubLObject variable_names = assertions_high.assertion_variable_names(rule_assertion);
        SubLObject variable_map = (SubLObject)inference_worker_transformation.NIL;
        SubLObject list_var = (SubLObject)inference_worker_transformation.NIL;
        SubLObject variable_name = (SubLObject)inference_worker_transformation.NIL;
        SubLObject variable_number = (SubLObject)inference_worker_transformation.NIL;
        list_var = variable_names;
        variable_name = list_var.first();
        for (variable_number = (SubLObject)inference_worker_transformation.ZERO_INTEGER; inference_worker_transformation.NIL != list_var; list_var = list_var.rest(), variable_name = list_var.first(), variable_number = Numbers.add((SubLObject)inference_worker_transformation.ONE_INTEGER, variable_number)) {
            final SubLObject hl_variable = variables.find_variable_by_id(variable_number);
            final SubLObject el_variable = cycl_variables.make_el_var(variable_name);
            variable_map = bindings.add_variable_binding(el_variable, hl_variable, variable_map);
        }
        variable_map = Sequences.nreverse(variable_map);
        return variable_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 57867L)
    public static SubLObject rule_assertion_has_some_pragmatic_requirementP(final SubLObject rule_assertion, SubLObject mt) {
        if (mt == inference_worker_transformation.UNPROVIDED) {
            mt = (SubLObject)inference_worker_transformation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_transformation.NIL != assertions_high.rule_assertionP(rule_assertion) : rule_assertion;
        SubLObject v_answer = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = Numbers.plusp(kb_indexing.relevant_num_pragma_rule_index(rule_assertion));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 58402L)
    public static SubLObject backward_rule_pragmatic_dnf(final SubLObject rule_assertion, SubLObject mt) {
        if (mt == inference_worker_transformation.UNPROVIDED) {
            mt = (SubLObject)inference_worker_transformation.NIL;
        }
        return forward.filter_forward_pragmatic_dnf(rule_assertion_pragmatic_requirements_dnf(rule_assertion, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 58689L)
    public static SubLObject forward_rule_pragmatic_dnf(final SubLObject rule, final SubLObject propagation_mt) {
        final SubLObject pragmatics_mt = inference_worker_transformation.$const86$InferencePSC.equal(propagation_mt) ? assertions_high.assertion_mt(rule) : propagation_mt;
        final SubLObject pragmatic_dnf = (inference_worker_transformation.NIL != rule_assertion_has_some_pragmatic_requirementP(rule, pragmatics_mt)) ? rule_assertion_pragmatic_requirements_dnf(rule, pragmatics_mt) : clauses.empty_clause();
        return pragmatic_dnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 59324L)
    public static SubLObject rule_assertion_pragmatic_requirements_dnf(final SubLObject rule_assertion, SubLObject mt) {
        if (mt == inference_worker_transformation.UNPROVIDED) {
            mt = (SubLObject)inference_worker_transformation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_transformation.NIL != assertion_handles.assertion_p(rule_assertion) : rule_assertion;
        SubLObject dnf = clauses.make_dnf((SubLObject)inference_worker_transformation.NIL, (SubLObject)inference_worker_transformation.NIL);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (inference_worker_transformation.NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule_assertion, (SubLObject)inference_worker_transformation.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule_assertion, (SubLObject)inference_worker_transformation.NIL);
                SubLObject done_var = (SubLObject)inference_worker_transformation.NIL;
                final SubLObject token_var = (SubLObject)inference_worker_transformation.NIL;
                while (inference_worker_transformation.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (inference_worker_transformation.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)inference_worker_transformation.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)inference_worker_transformation.$kw88$RULE, (SubLObject)inference_worker_transformation.NIL, (SubLObject)inference_worker_transformation.NIL);
                            SubLObject done_var_$28 = (SubLObject)inference_worker_transformation.NIL;
                            final SubLObject token_var_$29 = (SubLObject)inference_worker_transformation.NIL;
                            while (inference_worker_transformation.NIL == done_var_$28) {
                                final SubLObject pragma_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                final SubLObject valid_$30 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$29.eql(pragma_assertion));
                                if (inference_worker_transformation.NIL != valid_$30) {
                                    dnf = merge_pragmatic_requirement(rule_assertion, pragma_assertion, dnf);
                                }
                                done_var_$28 = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL == valid_$30);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker_transformation.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (inference_worker_transformation.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return dnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 59770L)
    public static SubLObject forward_rule_non_trigger_literals(final SubLObject rule_assertion, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_transformation.NIL != assertion_handles.assertion_p(rule_assertion) : rule_assertion;
        SubLObject result = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (inference_worker_transformation.NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule_assertion, (SubLObject)inference_worker_transformation.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule_assertion, (SubLObject)inference_worker_transformation.NIL);
                SubLObject done_var = (SubLObject)inference_worker_transformation.NIL;
                final SubLObject token_var = (SubLObject)inference_worker_transformation.NIL;
                while (inference_worker_transformation.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (inference_worker_transformation.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)inference_worker_transformation.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)inference_worker_transformation.$kw88$RULE, (SubLObject)inference_worker_transformation.NIL, (SubLObject)inference_worker_transformation.NIL);
                            SubLObject done_var_$32 = (SubLObject)inference_worker_transformation.NIL;
                            final SubLObject token_var_$33 = (SubLObject)inference_worker_transformation.NIL;
                            while (inference_worker_transformation.NIL == done_var_$32) {
                                final SubLObject pragma_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$33);
                                final SubLObject valid_$34 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$33.eql(pragma_assertion));
                                if (inference_worker_transformation.NIL != valid_$34) {
                                    final SubLObject neg_lits = clauses.neg_lits(assertions_high.assertion_cnf(pragma_assertion));
                                    if (inference_worker_transformation.NIL != list_utilities.singletonP(neg_lits)) {
                                        final SubLObject lit = neg_lits.first();
                                        if (inference_worker_transformation.NIL != el_utilities.el_formula_with_operator_p(lit, inference_worker_transformation.$const89$forwardNonTriggerLiteral)) {
                                            final SubLObject item_var = el_utilities.literal_arg1(lit, (SubLObject)inference_worker_transformation.UNPROVIDED);
                                            if (inference_worker_transformation.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)inference_worker_transformation.EQL), Symbols.symbol_function((SubLObject)inference_worker_transformation.IDENTITY))) {
                                                result = (SubLObject)ConsesLow.cons(item_var, result);
                                            }
                                        }
                                    }
                                }
                                done_var_$32 = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL == valid_$34);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker_transformation.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (inference_worker_transformation.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 60279L)
    public static SubLObject forward_rule_trigger_literals(final SubLObject rule_assertion, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_transformation.NIL != assertion_handles.assertion_p(rule_assertion) : rule_assertion;
        SubLObject result = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (inference_worker_transformation.NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule_assertion, (SubLObject)inference_worker_transformation.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule_assertion, (SubLObject)inference_worker_transformation.NIL);
                SubLObject done_var = (SubLObject)inference_worker_transformation.NIL;
                final SubLObject token_var = (SubLObject)inference_worker_transformation.NIL;
                while (inference_worker_transformation.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (inference_worker_transformation.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)inference_worker_transformation.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)inference_worker_transformation.$kw88$RULE, (SubLObject)inference_worker_transformation.NIL, (SubLObject)inference_worker_transformation.NIL);
                            SubLObject done_var_$36 = (SubLObject)inference_worker_transformation.NIL;
                            final SubLObject token_var_$37 = (SubLObject)inference_worker_transformation.NIL;
                            while (inference_worker_transformation.NIL == done_var_$36) {
                                final SubLObject pragma_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                final SubLObject valid_$38 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$37.eql(pragma_assertion));
                                if (inference_worker_transformation.NIL != valid_$38) {
                                    final SubLObject neg_lits = clauses.neg_lits(assertions_high.assertion_cnf(pragma_assertion));
                                    if (inference_worker_transformation.NIL != list_utilities.singletonP(neg_lits)) {
                                        final SubLObject lit = neg_lits.first();
                                        if (inference_worker_transformation.NIL != el_utilities.el_formula_with_operator_p(lit, inference_worker_transformation.$const90$forwardTriggerLiteral)) {
                                            final SubLObject item_var = el_utilities.literal_arg1(lit, (SubLObject)inference_worker_transformation.UNPROVIDED);
                                            if (inference_worker_transformation.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)inference_worker_transformation.EQL), Symbols.symbol_function((SubLObject)inference_worker_transformation.IDENTITY))) {
                                                result = (SubLObject)ConsesLow.cons(item_var, result);
                                            }
                                        }
                                    }
                                }
                                done_var_$36 = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL == valid_$38);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker_transformation.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (inference_worker_transformation.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 60781L)
    public static SubLObject merge_pragmatic_requirement(final SubLObject rule_assertion, final SubLObject pragma_assertion, final SubLObject merge_dnf) {
        SubLObject neg_lits = clauses.neg_lits(merge_dnf);
        SubLObject pos_lits = clauses.pos_lits(merge_dnf);
        final SubLObject rule_cnf = assertions_high.assertion_cnf(rule_assertion);
        final SubLObject pragma_cnf = assertions_high.assertion_cnf(pragma_assertion);
        SubLObject cdolist_list_var = clauses.neg_lits(pragma_cnf);
        SubLObject pragmatic_lit = (SubLObject)inference_worker_transformation.NIL;
        pragmatic_lit = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            final SubLObject item_var;
            pragmatic_lit = (item_var = compute_pragmatic_literal_for_merge(pragmatic_lit, merge_dnf, rule_cnf));
            if (inference_worker_transformation.NIL == conses_high.member(item_var, pos_lits, Symbols.symbol_function((SubLObject)inference_worker_transformation.EQUAL), Symbols.symbol_function((SubLObject)inference_worker_transformation.IDENTITY))) {
                pos_lits = (SubLObject)ConsesLow.cons(item_var, pos_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pragmatic_lit = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(pragma_cnf);
        pragmatic_lit = (SubLObject)inference_worker_transformation.NIL;
        pragmatic_lit = cdolist_list_var.first();
        while (inference_worker_transformation.NIL != cdolist_list_var) {
            if (inference_worker_transformation.NIL == el_utilities.el_meets_pragmatic_requirement_p(pragmatic_lit)) {
                final SubLObject item_var;
                pragmatic_lit = (item_var = compute_pragmatic_literal_for_merge(pragmatic_lit, merge_dnf, rule_cnf));
                if (inference_worker_transformation.NIL == conses_high.member(item_var, neg_lits, Symbols.symbol_function((SubLObject)inference_worker_transformation.EQUAL), Symbols.symbol_function((SubLObject)inference_worker_transformation.IDENTITY))) {
                    neg_lits = (SubLObject)ConsesLow.cons(item_var, neg_lits);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pragmatic_lit = cdolist_list_var.first();
        }
        return clause_utilities.nmake_dnf(neg_lits, pos_lits, merge_dnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 61756L)
    public static SubLObject compute_pragmatic_literal_for_merge(final SubLObject literal, final SubLObject merge_dnf, final SubLObject rule_dnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = literal;
        final SubLObject _prev_bind_0 = inference_worker_transformation.$merge_dnf_lambda_var$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_worker_transformation.$rule_dnf_lambda_var$.currentBinding(thread);
        try {
            inference_worker_transformation.$merge_dnf_lambda_var$.bind(merge_dnf, thread);
            inference_worker_transformation.$rule_dnf_lambda_var$.bind(rule_dnf, thread);
            final SubLObject conflicting_hl_var = cycl_utilities.expression_find_if((SubLObject)inference_worker_transformation.$sym91$HL_VARIABLE_NOT_MENTIONED_IN_RULE_DNF_BUT_MENTIONED_IN_MERGE_DNF, literal, (SubLObject)inference_worker_transformation.NIL, (SubLObject)inference_worker_transformation.UNPROVIDED);
            if (inference_worker_transformation.NIL != conflicting_hl_var) {
                final SubLObject unique_hl_var = czer_utilities.unique_hl_var_wrt_expression(merge_dnf, rule_dnf);
                final SubLObject new_literal = cycl_utilities.expression_subst(unique_hl_var, conflicting_hl_var, literal, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED);
                result = compute_pragmatic_literal_for_merge(new_literal, merge_dnf, rule_dnf);
            }
        }
        finally {
            inference_worker_transformation.$rule_dnf_lambda_var$.rebind(_prev_bind_2, thread);
            inference_worker_transformation.$merge_dnf_lambda_var$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 62684L)
    public static SubLObject hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_transformation.NIL != cycl_grammar.hl_variable_p(v_object) && inference_worker_transformation.NIL == cycl_utilities.expression_find(v_object, inference_worker_transformation.$rule_dnf_lambda_var$.getDynamicValue(thread), (SubLObject)inference_worker_transformation.NIL, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED) && inference_worker_transformation.NIL != cycl_utilities.expression_find(v_object, inference_worker_transformation.$merge_dnf_lambda_var$.getDynamicValue(thread), (SubLObject)inference_worker_transformation.NIL, (SubLObject)inference_worker_transformation.UNPROVIDED, (SubLObject)inference_worker_transformation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 62936L)
    public static SubLObject bubble_up_proof_to_transformation_link(final SubLObject supporting_proof, final SubLObject variable_map, final SubLObject transformation_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_transformation.NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(transformation_link) : transformation_link;
        thread.resetMultipleValues();
        final SubLObject proof = new_transformation_proof(transformation_link, supporting_proof, variable_map);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_transformation.NIL != newP) {
            inference_worker.bubble_up_proof(proof);
        }
        else {
            inference_worker.possibly_note_proof_processed(supporting_proof);
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 63456L)
    public static SubLObject transformation_proof_abnormalP_internal(final SubLObject transformation_proof) {
        return transformation_proof_abnormal_intP(transformation_proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 63456L)
    public static SubLObject transformation_proof_abnormalP(final SubLObject transformation_proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_worker_transformation.NIL;
        if (inference_worker_transformation.NIL == v_memoization_state) {
            return transformation_proof_abnormalP_internal(transformation_proof);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_worker_transformation.$sym93$TRANSFORMATION_PROOF_ABNORMAL_, (SubLObject)inference_worker_transformation.UNPROVIDED);
        if (inference_worker_transformation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_worker_transformation.$sym93$TRANSFORMATION_PROOF_ABNORMAL_, (SubLObject)inference_worker_transformation.ONE_INTEGER, (SubLObject)inference_worker_transformation.NIL, (SubLObject)inference_worker_transformation.EQ, (SubLObject)inference_worker_transformation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_worker_transformation.$sym93$TRANSFORMATION_PROOF_ABNORMAL_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, transformation_proof, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(transformation_proof_abnormalP_internal(transformation_proof)));
            memoization_state.caching_state_put(caching_state, transformation_proof, results, (SubLObject)inference_worker_transformation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 63660L)
    public static SubLObject transformation_proof_abnormal_intP(final SubLObject transformation_proof) {
        assert inference_worker_transformation.NIL != transformation_proof_p(transformation_proof) : transformation_proof;
        final SubLObject link = inference_datastructures_proof.proof_link(transformation_proof);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        final SubLObject rule = transformation_link_rule_assertion(link);
        final SubLObject transformation_mt = transformation_link_transformation_mt(link);
        final SubLObject rule_bindings = transformation_proof_rule_bindings(transformation_proof);
        return abnormal.rule_bindings_abnormalP(store, rule, rule_bindings, transformation_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 64198L)
    public static SubLObject proof_depends_on_excepted_assertionP(final SubLObject proof) {
        final SubLObject problem_mt = inference_datastructures_problem.problem_mt(inference_datastructures_proof.proof_supported_problem(proof));
        if (inference_worker_transformation.NIL != problem_mt) {
            return supports_contain_excepted_assertion_in_mtP(inference_datastructures_proof.proof_supports(proof), problem_mt, (SubLObject)inference_worker_transformation.UNPROVIDED);
        }
        return supports_contain_excepted_assertionP(inference_datastructures_proof.proof_supports(proof), (SubLObject)inference_worker_transformation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 64510L)
    public static SubLObject supports_contain_excepted_assertionP(final SubLObject supports, SubLObject justifyP) {
        if (justifyP == inference_worker_transformation.UNPROVIDED) {
            justifyP = (SubLObject)inference_worker_transformation.NIL;
        }
        SubLObject result = (SubLObject)inference_worker_transformation.NIL;
        if (inference_worker_transformation.NIL == result) {
            SubLObject csome_list_var = supports;
            SubLObject support = (SubLObject)inference_worker_transformation.NIL;
            support = csome_list_var.first();
            while (inference_worker_transformation.NIL == result && inference_worker_transformation.NIL != csome_list_var) {
                if (inference_worker_transformation.NIL != assertion_handles.assertion_p(support)) {
                    result = inference_trampolines.inference_excepted_assertionP(support, justifyP);
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 64822L)
    public static SubLObject supports_contain_excepted_assertion_in_mtP(final SubLObject supports, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == inference_worker_transformation.UNPROVIDED) {
            justifyP = (SubLObject)inference_worker_transformation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = supports_contain_excepted_assertionP(supports, justifyP);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 65070L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_argnums(final SubLObject predicate, final SubLObject mt) {
        SubLObject argnums = (SubLObject)inference_worker_transformation.NIL;
        if (inference_worker_transformation.NIL != forts.fort_p(predicate) && inference_worker_transformation.NIL != variables.fully_bound_p(mt) && inference_worker_transformation.NIL != kb_accessors.some_backchain_forbidden_unless_arg_chosen_assertion_somewhereP(predicate)) {
            argnums = inference_backchain_forbidden_unless_arg_chosen_argnums_memoized(predicate, mt);
        }
        return argnums;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 65704L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_argnums_memoized_internal(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject argnums = (SubLObject)inference_worker_transformation.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            argnums = kb_accessors.backchain_forbidden_unless_arg_chosen_argnums(predicate, mt);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return argnums;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 65704L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_argnums_memoized(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_worker_transformation.NIL;
        if (inference_worker_transformation.NIL == v_memoization_state) {
            return inference_backchain_forbidden_unless_arg_chosen_argnums_memoized_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_worker_transformation.$sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED, (SubLObject)inference_worker_transformation.UNPROVIDED);
        if (inference_worker_transformation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_worker_transformation.$sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED, (SubLObject)inference_worker_transformation.TWO_INTEGER, (SubLObject)inference_worker_transformation.NIL, (SubLObject)inference_worker_transformation.EQUAL, (SubLObject)inference_worker_transformation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_worker_transformation.$sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_worker_transformation.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_worker_transformation.NIL;
            collision = cdolist_list_var.first();
            while (inference_worker_transformation.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_worker_transformation.NIL != cached_args && inference_worker_transformation.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_backchain_forbidden_unless_arg_chosen_argnums_memoized_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 65978L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_asentP(final SubLObject asent, final SubLObject mt) {
        return inference_backchain_forbidden_unless_arg_chosen_asent_variables_int(asent, mt, (SubLObject)inference_worker_transformation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 66293L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_asent_variables(final SubLObject asent, final SubLObject mt) {
        return inference_backchain_forbidden_unless_arg_chosen_asent_variables_int(asent, mt, (SubLObject)inference_worker_transformation.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 66586L)
    public static SubLObject inference_backchain_forbidden_unless_arg_chosen_asent_variables_int(final SubLObject asent, final SubLObject mt, final SubLObject justifyP) {
        SubLObject v_variables = (SubLObject)inference_worker_transformation.NIL;
        if (inference_worker_transformation.NIL == variables.fully_bound_p(asent)) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject argnums = inference_backchain_forbidden_unless_arg_chosen_argnums(predicate, mt);
            if (inference_worker_transformation.NIL != argnums) {
                SubLObject argnum = (SubLObject)inference_worker_transformation.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)inference_worker_transformation.$kw95$IGNORE);
                SubLObject arg = (SubLObject)inference_worker_transformation.NIL;
                arg = cdolist_list_var.first();
                while (inference_worker_transformation.NIL != cdolist_list_var) {
                    argnum = Numbers.add(argnum, (SubLObject)inference_worker_transformation.ONE_INTEGER);
                    if (inference_worker_transformation.NIL != subl_promotions.memberP(argnum, argnums, Symbols.symbol_function((SubLObject)inference_worker_transformation.EQL), (SubLObject)inference_worker_transformation.UNPROVIDED) && inference_worker_transformation.NIL == variables.fully_bound_p(arg)) {
                        if (inference_worker_transformation.NIL == justifyP) {
                            return (SubLObject)inference_worker_transformation.T;
                        }
                        SubLObject cdolist_list_var_$40 = variables.gather_hl_variables(arg);
                        SubLObject variable = (SubLObject)inference_worker_transformation.NIL;
                        variable = cdolist_list_var_$40.first();
                        while (inference_worker_transformation.NIL != cdolist_list_var_$40) {
                            final SubLObject item_var = variable;
                            if (inference_worker_transformation.NIL == conses_high.member(item_var, v_variables, Symbols.symbol_function((SubLObject)inference_worker_transformation.EQL), Symbols.symbol_function((SubLObject)inference_worker_transformation.IDENTITY))) {
                                v_variables = (SubLObject)ConsesLow.cons(item_var, v_variables);
                            }
                            cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                            variable = cdolist_list_var_$40.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                v_variables = Sort.sort(v_variables, Symbols.symbol_function((SubLObject)inference_worker_transformation.$sym96$_), Symbols.symbol_function((SubLObject)inference_worker_transformation.$sym97$VARIABLE_ID));
            }
        }
        return v_variables;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 67550L)
    public static SubLObject genl_rules_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_worker_transformation.$genl_rules_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 67621L)
    public static SubLObject genl_rules(final SubLObject rule, SubLObject mt) {
        if (mt == inference_worker_transformation.UNPROVIDED) {
            mt = (SubLObject)inference_worker_transformation.NIL;
        }
        return gt_methods.gt_superiors(inference_worker_transformation.$const98$genlRules, rule, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 67713L)
    public static SubLObject max_rules(final SubLObject rules, SubLObject mt) {
        if (mt == inference_worker_transformation.UNPROVIDED) {
            mt = (SubLObject)inference_worker_transformation.NIL;
        }
        if (inference_worker_transformation.NIL == constant_handles.valid_constantP(inference_worker_transformation.$const98$genlRules, (SubLObject)inference_worker_transformation.UNPROVIDED)) {
            return rules;
        }
        SubLObject any_relevant_genl_rules_assertionsP = (SubLObject)inference_worker_transformation.NIL;
        if (inference_worker_transformation.NIL == any_relevant_genl_rules_assertionsP) {
            SubLObject csome_list_var = rules;
            SubLObject rule = (SubLObject)inference_worker_transformation.NIL;
            rule = csome_list_var.first();
            while (inference_worker_transformation.NIL == any_relevant_genl_rules_assertionsP && inference_worker_transformation.NIL != csome_list_var) {
                if (inference_worker_transformation.NIL != somewhere_cache.some_pred_assertion_somewhereP(inference_worker_transformation.$const98$genlRules, rule, (SubLObject)inference_worker_transformation.ONE_INTEGER, (SubLObject)inference_worker_transformation.UNPROVIDED)) {
                    any_relevant_genl_rules_assertionsP = (SubLObject)inference_worker_transformation.T;
                }
                csome_list_var = csome_list_var.rest();
                rule = csome_list_var.first();
            }
        }
        if (inference_worker_transformation.NIL == any_relevant_genl_rules_assertionsP) {
            return rules;
        }
        return gt_methods.gt_max_nodes(inference_worker_transformation.$const98$genlRules, rules, mt, (SubLObject)inference_worker_transformation.UNPROVIDED);
    }
    
    public static SubLObject declare_inference_worker_transformation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_data_print_function_trampoline", "TRANSFORMATION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_data_p", "TRANSFORMATION-LINK-DATA-P", 1, 0, false);
        new $transformation_link_data_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "trans_link_data_hl_module", "TRANS-LINK-DATA-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "trans_link_data_bindings", "TRANS-LINK-DATA-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "trans_link_data_supports", "TRANS-LINK-DATA-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "trans_link_data_non_explanatory_subquery", "TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "_csetf_trans_link_data_hl_module", "_CSETF-TRANS-LINK-DATA-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "_csetf_trans_link_data_bindings", "_CSETF-TRANS-LINK-DATA-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "_csetf_trans_link_data_supports", "_CSETF-TRANS-LINK-DATA-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "_csetf_trans_link_data_non_explanatory_subquery", "_CSETF-TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "make_transformation_link_data", "MAKE-TRANSFORMATION-LINK-DATA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "visit_defstruct_transformation_link_data", "VISIT-DEFSTRUCT-TRANSFORMATION-LINK-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "visit_defstruct_object_transformation_link_data_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-LINK-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "new_transformation_link", "NEW-TRANSFORMATION-LINK", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "new_transformation_link_int", "NEW-TRANSFORMATION-LINK-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "new_transformation_link_data", "NEW-TRANSFORMATION-LINK-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "destroy_transformation_link", "DESTROY-TRANSFORMATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_hl_module", "TRANSFORMATION-LINK-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_bindings", "TRANSFORMATION-LINK-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_supports", "TRANSFORMATION-LINK-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_rule_assertion", "TRANSFORMATION-LINK-RULE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_more_supports", "TRANSFORMATION-LINK-MORE-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_non_explanatory_subquery", "TRANSFORMATION-LINK-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "set_transformation_link_hl_module", "SET-TRANSFORMATION-LINK-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "set_transformation_link_bindings", "SET-TRANSFORMATION-LINK-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "set_transformation_link_supports", "SET-TRANSFORMATION-LINK-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "set_transformation_link_non_explanatory_subquery", "SET-TRANSFORMATION-LINK-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_tactic", "TRANSFORMATION-LINK-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_pragmatic_requirements", "TRANSFORMATION-LINK-PRAGMATIC-REQUIREMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_supporting_mapped_problem", "TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_supporting_problem", "TRANSFORMATION-LINK-SUPPORTING-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_supporting_variable_map", "TRANSFORMATION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_transformation_mt", "TRANSFORMATION-LINK-TRANSFORMATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_supporting_problem_wholly_explanatoryP", "TRANSFORMATION-LINK-SUPPORTING-PROBLEM-WHOLLY-EXPLANATORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformed_problem_using_rule", "TRANSFORMED-PROBLEM-USING-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformed_problem_using_rule_and_hl_module", "TRANSFORMED-PROBLEM-USING-RULE-AND-HL-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_rule_bindings_to_closed", "TRANSFORMATION-LINK-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_rule_bindings_to_closed", "TRANSFORMATION-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_el_bindings", "TRANSFORMATION-LINK-EL-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "canonicalize_bindings_wrt_el_vars", "CANONICALIZE-BINDINGS-WRT-EL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_motivated_residual_transformation_links", "TRANSFORMATION-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_motivated_residual_transformation_link_count", "TRANSFORMATION-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_good_motivated_residual_transformation_link_count", "TRANSFORMATION-LINK-GOOD-MOTIVATED-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "with_problem_store_transformation_assumptions", "WITH-PROBLEM-STORE-TRANSFORMATION-ASSUMPTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "meta_transformation_tactic_p", "META-TRANSFORMATION-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "add_tactic_to_determine_new_literal_transformation_tactics", "ADD-TACTIC-TO-DETERMINE-NEW-LITERAL-TRANSFORMATION-TACTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "inference_backchain_forbidden_asentP", "INFERENCE-BACKCHAIN-FORBIDDEN-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "new_meta_transformation_tactic", "NEW-META-TRANSFORMATION-TACTIC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "compute_strategic_properties_of_meta_transformation_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-TRANSFORMATION-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_link_p", "TRANSFORMATION-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_tactic_p", "TRANSFORMATION-TACTIC-P", 1, 0, false);
        new $transformation_tactic_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_tactic_rule", "TRANSFORMATION-TACTIC-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_rule_tactic_p", "TRANSFORMATION-RULE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_generator_tactic_p", "TRANSFORMATION-GENERATOR-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_generator_tactic_lookahead_rule", "TRANSFORMATION-GENERATOR-TACTIC-LOOKAHEAD-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_tactic_lookahead_rule", "TRANSFORMATION-TACTIC-LOOKAHEAD-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_p", "TRANSFORMATION-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_rule_assertion", "TRANSFORMATION-PROOF-RULE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_additional_supports", "TRANSFORMATION-PROOF-ADDITIONAL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_subproof", "TRANSFORMATION-PROOF-SUBPROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "generalized_transformation_link_p", "GENERALIZED-TRANSFORMATION-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "generalized_transformation_link_rule_assertion", "GENERALIZED-TRANSFORMATION-LINK-RULE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "generalized_transformation_link_unaffected_by_exceptionsP", "GENERALIZED-TRANSFORMATION-LINK-UNAFFECTED-BY-EXCEPTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "generalized_transformation_proof_p", "GENERALIZED-TRANSFORMATION-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "generalized_transformation_proof_rule_assertion", "GENERALIZED-TRANSFORMATION-PROOF-RULE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "generalized_transformation_proof_rule_bindings", "GENERALIZED-TRANSFORMATION-PROOF-RULE-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "generalized_transformation_proof_transformation_link", "GENERALIZED-TRANSFORMATION-PROOF-TRANSFORMATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "determine_new_literal_transformation_tactics", "DETERMINE-NEW-LITERAL-TRANSFORMATION-TACTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "determine_new_literal_transformation_tactics_int", "DETERMINE-NEW-LITERAL-TRANSFORMATION-TACTICS-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "determine_rules_for_literal_transformation_tactics", "DETERMINE-RULES-FOR-LITERAL-TRANSFORMATION-TACTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "problem_inference_and_non_continuable_problem_store_private", "PROBLEM-INFERENCE-AND-NON-CONTINUABLE-PROBLEM-STORE-PRIVATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "single_literal_problem_candidate_transformation_tactic_specs", "SINGLE-LITERAL-PROBLEM-CANDIDATE-TRANSFORMATION-TACTIC-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "determine_literal_transformation_tactic_specs", "DETERMINE-LITERAL-TRANSFORMATION-TACTIC-SPECS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "determine_literal_transformation_tactic_specs_int", "DETERMINE-LITERAL-TRANSFORMATION-TACTIC-SPECS-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "literal_level_transformation_tactic_p", "LITERAL-LEVEL-TRANSFORMATION-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "maybe_new_transformation_link", "MAYBE-NEW-TRANSFORMATION-LINK", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "recompute_thrown_away_due_to_new_transformation_link", "RECOMPUTE-THROWN-AWAY-DUE-TO-NEW-TRANSFORMATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "new_transformation_tactic", "NEW-TRANSFORMATION-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "compute_strategic_properties_of_transformation_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-TRANSFORMATION-TACTIC", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "with_transformation_tactic_execution_assumptions", "WITH-TRANSFORMATION-TACTIC-EXECUTION-ASSUMPTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "execute_literal_level_transformation_tactic", "EXECUTE-LITERAL-LEVEL-TRANSFORMATION-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "maybe_make_transformation_tactic_progress_iterator", "MAYBE-MAKE-TRANSFORMATION-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "maybe_make_meta_transformation_progress_iterator", "MAYBE-MAKE-META-TRANSFORMATION-PROGRESS-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "maybe_make_transformation_rule_select_progress_iterator", "MAYBE-MAKE-TRANSFORMATION-RULE-SELECT-PROGRESS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "new_transformation_rule_select_progress_iterator", "NEW-TRANSFORMATION-RULE-SELECT-PROGRESS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "handle_one_transformation_tactic_rule_select_result", "HANDLE-ONE-TRANSFORMATION-TACTIC-RULE-SELECT-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "maybe_make_transformation_expand_progress_iterator", "MAYBE-MAKE-TRANSFORMATION-EXPAND-PROGRESS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "handle_transformation_add_node_for_expand_results", "HANDLE-TRANSFORMATION-ADD-NODE-FOR-EXPAND-RESULTS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "rule_assertion_worth_adding_type_constraintsP", "RULE-ASSERTION-WORTH-ADDING-TYPE-CONSTRAINTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_additional_dont_care_constraints", "TRANSFORMATION-ADDITIONAL-DONT-CARE-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "nmerge_dnf", "NMERGE-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "merge_dnf", "MERGE-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "complete_execution_of_transformation_tactic", "COMPLETE-EXECUTION-OF-TRANSFORMATION-TACTIC", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "compute_transformation_non_explanatory_subquery", "COMPUTE-TRANSFORMATION-NON-EXPLANATORY-SUBQUERY", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "potentially_wf_transformation_dependent_query", "POTENTIALLY-WF-TRANSFORMATION-DEPENDENT-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "potentially_wf_restricted_transformation_dependent_asent", "POTENTIALLY-WF-RESTRICTED-TRANSFORMATION-DEPENDENT-ASENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "syntactically_valid_asent", "SYNTACTICALLY-VALID-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "syntactically_valid_contextualized_term_of_unit_asent", "SYNTACTICALLY-VALID-CONTEXTUALIZED-TERM-OF-UNIT-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "new_transformation_proof", "NEW-TRANSFORMATION-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "compute_canonical_transformation_proof_bindings", "COMPUTE-CANONICAL-TRANSFORMATION-PROOF-BINDINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "unification_dependent_dnf_to_transformation_dependent_dnf", "UNIFICATION-DEPENDENT-DNF-TO-TRANSFORMATION-DEPENDENT-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "unification_bindings_to_transformation_bindings", "UNIFICATION-BINDINGS-TO-TRANSFORMATION-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "swap_variable_spaces_of_unification_bindings", "SWAP-VARIABLE-SPACES-OF-UNIFICATION-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_rule_bindings", "TRANSFORMATION-PROOF-RULE-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "compute_transformation_link_rule_bindings", "COMPUTE-TRANSFORMATION-LINK-RULE-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_rule_el_bindings", "TRANSFORMATION-PROOF-RULE-EL-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_el_bindings", "TRANSFORMATION-PROOF-EL-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "unify_transformation_and_subproof_bindings", "UNIFY-TRANSFORMATION-AND-SUBPROOF-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "extended_supported_problem_bindings_to_supported_problem_bindings", "EXTENDED-SUPPORTED-PROBLEM-BINDINGS-TO-SUPPORTED-PROBLEM-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "supported_problem_variable_p", "SUPPORTED-PROBLEM-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "extended_supported_problem_bindings_to_rule_bindings", "EXTENDED-SUPPORTED-PROBLEM-BINDINGS-TO-RULE-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "rule_assertion_variable_p", "RULE-ASSERTION-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "rule_assertion_variable_map", "RULE-ASSERTION-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "rule_assertion_base_variable_map", "RULE-ASSERTION-BASE-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "rule_assertion_has_some_pragmatic_requirementP", "RULE-ASSERTION-HAS-SOME-PRAGMATIC-REQUIREMENT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "backward_rule_pragmatic_dnf", "BACKWARD-RULE-PRAGMATIC-DNF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "forward_rule_pragmatic_dnf", "FORWARD-RULE-PRAGMATIC-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "rule_assertion_pragmatic_requirements_dnf", "RULE-ASSERTION-PRAGMATIC-REQUIREMENTS-DNF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "forward_rule_non_trigger_literals", "FORWARD-RULE-NON-TRIGGER-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "forward_rule_trigger_literals", "FORWARD-RULE-TRIGGER-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "merge_pragmatic_requirement", "MERGE-PRAGMATIC-REQUIREMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "compute_pragmatic_literal_for_merge", "COMPUTE-PRAGMATIC-LITERAL-FOR-MERGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf", "HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF", 1, 0, false);
        new $hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "bubble_up_proof_to_transformation_link", "BUBBLE-UP-PROOF-TO-TRANSFORMATION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_abnormalP_internal", "TRANSFORMATION-PROOF-ABNORMAL?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_abnormalP", "TRANSFORMATION-PROOF-ABNORMAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "transformation_proof_abnormal_intP", "TRANSFORMATION-PROOF-ABNORMAL-INT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "proof_depends_on_excepted_assertionP", "PROOF-DEPENDS-ON-EXCEPTED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "supports_contain_excepted_assertionP", "SUPPORTS-CONTAIN-EXCEPTED-ASSERTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "supports_contain_excepted_assertion_in_mtP", "SUPPORTS-CONTAIN-EXCEPTED-ASSERTION-IN-MT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "inference_backchain_forbidden_unless_arg_chosen_argnums", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "inference_backchain_forbidden_unless_arg_chosen_argnums_memoized_internal", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "inference_backchain_forbidden_unless_arg_chosen_argnums_memoized", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "inference_backchain_forbidden_unless_arg_chosen_asentP", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "inference_backchain_forbidden_unless_arg_chosen_asent_variables", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "inference_backchain_forbidden_unless_arg_chosen_asent_variables_int", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-VARIABLES-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "genl_rules_enabledP", "GENL-RULES-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "genl_rules", "GENL-RULES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation", "max_rules", "MAX-RULES", 1, 1, false);
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    public static SubLObject init_inference_worker_transformation_file() {
        inference_worker_transformation.$dtp_transformation_link_data$ = SubLFiles.defconstant("*DTP-TRANSFORMATION-LINK-DATA*", (SubLObject)inference_worker_transformation.$sym0$TRANSFORMATION_LINK_DATA);
        inference_worker_transformation.$determine_new_transformation_tactics_module$ = SubLFiles.deflexical("*DETERMINE-NEW-TRANSFORMATION-TACTICS-MODULE*", (inference_worker_transformation.NIL != Symbols.boundp((SubLObject)inference_worker_transformation.$sym48$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_)) ? inference_worker_transformation.$determine_new_transformation_tactics_module$.getGlobalValue() : inference_modules.inference_meta_transformation_module((SubLObject)inference_worker_transformation.$kw49$DETERMINE_NEW_TRANSFORMATION_TACTICS, (SubLObject)inference_worker_transformation.UNPROVIDED));
        inference_worker_transformation.$transformation_tactic_iteration_threshold$ = SubLFiles.defparameter("*TRANSFORMATION-TACTIC-ITERATION-THRESHOLD*", (SubLObject)inference_worker_transformation.TWO_INTEGER);
        inference_worker_transformation.$stitch_up_bindings_loopP$ = SubLFiles.defparameter("*STITCH-UP-BINDINGS-LOOP?*", (SubLObject)inference_worker_transformation.T);
        inference_worker_transformation.$inference_transformation_type_checking_enabledP$ = SubLFiles.defparameter("*INFERENCE-TRANSFORMATION-TYPE-CHECKING-ENABLED?*", (SubLObject)inference_worker_transformation.NIL);
        inference_worker_transformation.$merge_dnf_lambda_var$ = SubLFiles.defparameter("*MERGE-DNF-LAMBDA-VAR*", (SubLObject)inference_worker_transformation.NIL);
        inference_worker_transformation.$rule_dnf_lambda_var$ = SubLFiles.defparameter("*RULE-DNF-LAMBDA-VAR*", (SubLObject)inference_worker_transformation.NIL);
        inference_worker_transformation.$genl_rules_enabledP$ = SubLFiles.defvar("*GENL-RULES-ENABLED?*", (SubLObject)inference_worker_transformation.T);
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    public static SubLObject setup_inference_worker_transformation_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_worker_transformation.$dtp_transformation_link_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_worker_transformation.$sym7$TRANSFORMATION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_worker_transformation.$list8);
        Structures.def_csetf((SubLObject)inference_worker_transformation.$sym9$TRANS_LINK_DATA_HL_MODULE, (SubLObject)inference_worker_transformation.$sym10$_CSETF_TRANS_LINK_DATA_HL_MODULE);
        Structures.def_csetf((SubLObject)inference_worker_transformation.$sym11$TRANS_LINK_DATA_BINDINGS, (SubLObject)inference_worker_transformation.$sym12$_CSETF_TRANS_LINK_DATA_BINDINGS);
        Structures.def_csetf((SubLObject)inference_worker_transformation.$sym13$TRANS_LINK_DATA_SUPPORTS, (SubLObject)inference_worker_transformation.$sym14$_CSETF_TRANS_LINK_DATA_SUPPORTS);
        Structures.def_csetf((SubLObject)inference_worker_transformation.$sym15$TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY, (SubLObject)inference_worker_transformation.$sym16$_CSETF_TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY);
        Equality.identity((SubLObject)inference_worker_transformation.$sym0$TRANSFORMATION_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_worker_transformation.$dtp_transformation_link_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_worker_transformation.$sym26$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_LINK_DATA_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)inference_worker_transformation.$sym48$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_);
        memoization_state.note_memoized_function((SubLObject)inference_worker_transformation.$sym93$TRANSFORMATION_PROOF_ABNORMAL_);
        memoization_state.note_memoized_function((SubLObject)inference_worker_transformation.$sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED);
        return (SubLObject)inference_worker_transformation.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_worker_transformation_file();
    }
    
    public void initializeVariables() {
        init_inference_worker_transformation_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_worker_transformation_file();
    }
    
    static {
        me = (SubLFile)new inference_worker_transformation();
        inference_worker_transformation.$dtp_transformation_link_data$ = null;
        inference_worker_transformation.$determine_new_transformation_tactics_module$ = null;
        inference_worker_transformation.$transformation_tactic_iteration_threshold$ = null;
        inference_worker_transformation.$stitch_up_bindings_loopP$ = null;
        inference_worker_transformation.$inference_transformation_type_checking_enabledP$ = null;
        inference_worker_transformation.$merge_dnf_lambda_var$ = null;
        inference_worker_transformation.$rule_dnf_lambda_var$ = null;
        inference_worker_transformation.$genl_rules_enabledP$ = null;
        $sym0$TRANSFORMATION_LINK_DATA = SubLObjectFactory.makeSymbol("TRANSFORMATION-LINK-DATA");
        $sym1$TRANSFORMATION_LINK_DATA_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-LINK-DATA-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("NON-EXPLANATORY-SUBQUERY"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HL-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SUBQUERY"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANS-LINK-DATA-HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-LINK-DATA-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-LINK-DATA-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-LINK-DATA-HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-LINK-DATA-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-LINK-DATA-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$TRANSFORMATION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TRANSFORMATION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION-LINK-DATA-P"));
        $sym9$TRANS_LINK_DATA_HL_MODULE = SubLObjectFactory.makeSymbol("TRANS-LINK-DATA-HL-MODULE");
        $sym10$_CSETF_TRANS_LINK_DATA_HL_MODULE = SubLObjectFactory.makeSymbol("_CSETF-TRANS-LINK-DATA-HL-MODULE");
        $sym11$TRANS_LINK_DATA_BINDINGS = SubLObjectFactory.makeSymbol("TRANS-LINK-DATA-BINDINGS");
        $sym12$_CSETF_TRANS_LINK_DATA_BINDINGS = SubLObjectFactory.makeSymbol("_CSETF-TRANS-LINK-DATA-BINDINGS");
        $sym13$TRANS_LINK_DATA_SUPPORTS = SubLObjectFactory.makeSymbol("TRANS-LINK-DATA-SUPPORTS");
        $sym14$_CSETF_TRANS_LINK_DATA_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-TRANS-LINK-DATA-SUPPORTS");
        $sym15$TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY = SubLObjectFactory.makeSymbol("TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY");
        $sym16$_CSETF_TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY = SubLObjectFactory.makeSymbol("_CSETF-TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY");
        $kw17$HL_MODULE = SubLObjectFactory.makeKeyword("HL-MODULE");
        $kw18$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw19$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $kw20$NON_EXPLANATORY_SUBQUERY = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SUBQUERY");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_TRANSFORMATION_LINK_DATA = SubLObjectFactory.makeSymbol("MAKE-TRANSFORMATION-LINK-DATA");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_LINK_DATA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-LINK-DATA-METHOD");
        $sym27$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $sym28$MAPPED_PROBLEM_P = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-P");
        $kw29$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $kw30$FREE = SubLObjectFactory.makeKeyword("FREE");
        $sym31$TRANSFORMATION_LINK_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-LINK-P");
        $sym32$HL_MODULE_P = SubLObjectFactory.makeSymbol("HL-MODULE-P");
        $sym33$BINDING_LIST_P = SubLObjectFactory.makeSymbol("BINDING-LIST-P");
        $sym34$HL_JUSTIFICATION_P = SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P");
        $sym35$NON_EXPLANATORY_SUBQUERY_SPEC_P = SubLObjectFactory.makeSymbol("NON-EXPLANATORY-SUBQUERY-SPEC-P");
        $str36$No_tactic_found_for__S = SubLObjectFactory.makeString("No tactic found for ~S");
        $list37 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $kw38$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $kw39$RESIDUAL_TRANSFORMATION = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym41$STORE_VAR = SubLObjectFactory.makeUninternedSymbol("STORE-VAR");
        $sym42$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HL-FAILURE-BACKCHAINING*"), (SubLObject)inference_worker_transformation.T);
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*"), (SubLObject)inference_worker_transformation.T);
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*"), (SubLObject)inference_worker_transformation.T);
        $sym46$_NEGATION_BY_FAILURE_ = SubLObjectFactory.makeSymbol("*NEGATION-BY-FAILURE*");
        $sym47$PROBLEM_STORE_NEGATION_BY_FAILURE_ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");
        $sym48$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_ = SubLObjectFactory.makeSymbol("*DETERMINE-NEW-TRANSFORMATION-TACTICS-MODULE*");
        $kw49$DETERMINE_NEW_TRANSFORMATION_TACTICS = SubLObjectFactory.makeKeyword("DETERMINE-NEW-TRANSFORMATION-TACTICS");
        $kw50$GROSSLY_INCOMPLETE = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $kw51$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym52$TRANSFORMATION_GENERATOR_TACTIC_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-GENERATOR-TACTIC-P");
        $sym53$TRANSFORMATION_PROOF_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-PROOF-P");
        $str54$generalized_transformation_link_o = SubLObjectFactory.makeString("generalized transformation link of unexpected type: ~s");
        $str55$generalized_transformation_proof_ = SubLObjectFactory.makeString("generalized transformation proof of unexpected type: ~s");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("PRODUCTIVITY"));
        $sym57$INFERENCE_EXCEPTED_ASSERTION_ = SubLObjectFactory.makeSymbol("INFERENCE-EXCEPTED-ASSERTION?");
        $sym58$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym59$SINGLE_LITERAL_PROBLEM_P = SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-P");
        $kw60$TACTIC_SPECS = SubLObjectFactory.makeKeyword("TACTIC-SPECS");
        $kw61$TOTAL_PRODUCTIVITY = SubLObjectFactory.makeKeyword("TOTAL-PRODUCTIVITY");
        $str62$unexpected_tactic_specs_return_ty = SubLObjectFactory.makeString("unexpected tactic-specs return type ~a");
        $str63$pruning__s__s__s = SubLObjectFactory.makeString("pruning ~s ~s ~s");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TACTIC"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym65$TACTIC_VAR = SubLObjectFactory.makeUninternedSymbol("TACTIC-VAR");
        $sym66$WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $sym67$_INFERENCE_EXPAND_HL_MODULE_ = SubLObjectFactory.makeSymbol("*INFERENCE-EXPAND-HL-MODULE*");
        $sym68$TACTIC_HL_MODULE = SubLObjectFactory.makeSymbol("TACTIC-HL-MODULE");
        $sym69$_INFERENCE_EXPAND_SENSE_ = SubLObjectFactory.makeSymbol("*INFERENCE-EXPAND-SENSE*");
        $sym70$WITH_PROBLEM_STORE_TRANSFORMATION_ASSUMPTIONS = SubLObjectFactory.makeSymbol("WITH-PROBLEM-STORE-TRANSFORMATION-ASSUMPTIONS");
        $sym71$TACTIC_STORE = SubLObjectFactory.makeSymbol("TACTIC-STORE");
        $str72$time_to_add_meta_transformation_s = SubLObjectFactory.makeString("time to add meta-transformation support for ~S");
        $kw73$TRANSFORMATION_RULE_SELECT = SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-SELECT");
        $str74$transformation_tactic__S_already_ = SubLObjectFactory.makeString("transformation tactic ~S already has rule ~S");
        $sym75$HANDLE_TRANSFORMATION_ADD_NODE_FOR_EXPAND_RESULTS = SubLObjectFactory.makeSymbol("HANDLE-TRANSFORMATION-ADD-NODE-FOR-EXPAND-RESULTS");
        $sym76$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $kw77$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw78$POS = SubLObjectFactory.makeKeyword("POS");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $const80$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $sym81$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $sym82$BINDINGS_P = SubLObjectFactory.makeSymbol("BINDINGS-P");
        $str83$Could_not_ground_out__s_and__s = SubLObjectFactory.makeString("Could not ground out ~s and ~s");
        $str84$Could_not_unify_transformation_bi = SubLObjectFactory.makeString("Could not unify transformation bindings ~a with subproof bindings ~a");
        $sym85$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $const86$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym87$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $kw88$RULE = SubLObjectFactory.makeKeyword("RULE");
        $const89$forwardNonTriggerLiteral = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardNonTriggerLiteral"));
        $const90$forwardTriggerLiteral = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardTriggerLiteral"));
        $sym91$HL_VARIABLE_NOT_MENTIONED_IN_RULE_DNF_BUT_MENTIONED_IN_MERGE_DNF = SubLObjectFactory.makeSymbol("HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF");
        $sym92$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");
        $sym93$TRANSFORMATION_PROOF_ABNORMAL_ = SubLObjectFactory.makeSymbol("TRANSFORMATION-PROOF-ABNORMAL?");
        $sym94$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED = SubLObjectFactory.makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS-MEMOIZED");
        $kw95$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym96$_ = SubLObjectFactory.makeSymbol("<");
        $sym97$VARIABLE_ID = SubLObjectFactory.makeSymbol("VARIABLE-ID");
        $const98$genlRules = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlRules"));
    }
    
    public static final class $transformation_link_data_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $bindings;
        public SubLObject $supports;
        public SubLObject $non_explanatory_subquery;
        private static final SubLStructDeclNative structDecl;
        
        public $transformation_link_data_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
            this.$non_explanatory_subquery = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$transformation_link_data_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$hl_module;
        }
        
        public SubLObject getField3() {
            return this.$bindings;
        }
        
        public SubLObject getField4() {
            return this.$supports;
        }
        
        public SubLObject getField5() {
            return this.$non_explanatory_subquery;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$non_explanatory_subquery = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$transformation_link_data_native.class, inference_worker_transformation.$sym0$TRANSFORMATION_LINK_DATA, inference_worker_transformation.$sym1$TRANSFORMATION_LINK_DATA_P, inference_worker_transformation.$list2, inference_worker_transformation.$list3, new String[] { "$hl_module", "$bindings", "$supports", "$non_explanatory_subquery" }, inference_worker_transformation.$list4, inference_worker_transformation.$list5, inference_worker_transformation.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $transformation_link_data_p$UnaryFunction extends UnaryFunction
    {
        public $transformation_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANSFORMATION-LINK-DATA-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_transformation.transformation_link_data_p(arg1);
        }
    }
    
    public static final class $transformation_tactic_p$UnaryFunction extends UnaryFunction
    {
        public $transformation_tactic_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANSFORMATION-TACTIC-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_transformation.transformation_tactic_p(arg1);
        }
    }
    
    public static final class $hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf$UnaryFunction extends UnaryFunction
    {
        public $hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_transformation.hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf(arg1);
        }
    }
}

/*

	Total time: 605 ms
	 synthetic 
*/