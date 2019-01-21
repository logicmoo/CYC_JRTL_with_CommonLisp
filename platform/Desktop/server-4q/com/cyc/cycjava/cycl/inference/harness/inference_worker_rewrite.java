package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
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

public final class inference_worker_rewrite extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite";
    public static final String myFingerPrint = "9053030c73d090be4d851064c423f073352b5bd2b8ba727e03aa471de4ded15f";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLSymbol $dtp_rewrite_link_data$;
    private static final SubLSymbol $sym0$REWRITE_LINK_DATA;
    private static final SubLSymbol $sym1$REWRITE_LINK_DATA_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$RW_LINK_DATA_HL_MODULE;
    private static final SubLSymbol $sym10$_CSETF_RW_LINK_DATA_HL_MODULE;
    private static final SubLSymbol $sym11$RW_LINK_DATA_BINDINGS;
    private static final SubLSymbol $sym12$_CSETF_RW_LINK_DATA_BINDINGS;
    private static final SubLSymbol $sym13$RW_LINK_DATA_SUPPORTS;
    private static final SubLSymbol $sym14$_CSETF_RW_LINK_DATA_SUPPORTS;
    private static final SubLSymbol $kw15$HL_MODULE;
    private static final SubLSymbol $kw16$BINDINGS;
    private static final SubLSymbol $kw17$SUPPORTS;
    private static final SubLString $str18$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw19$BEGIN;
    private static final SubLSymbol $sym20$MAKE_REWRITE_LINK_DATA;
    private static final SubLSymbol $kw21$SLOT;
    private static final SubLSymbol $kw22$END;
    private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_REWRITE_LINK_DATA_METHOD;
    private static final SubLSymbol $sym24$PROBLEM_P;
    private static final SubLSymbol $sym25$MAPPED_PROBLEM_P;
    private static final SubLSymbol $sym26$HL_MODULE_P;
    private static final SubLSymbol $kw27$REWRITE;
    private static final SubLSymbol $kw28$UNDETERMINED;
    private static final SubLSymbol $kw29$FREE;
    private static final SubLSymbol $sym30$REWRITE_LINK_P;
    private static final SubLString $str31$Bindings__a_are_not_valid_rewrite;
    private static final SubLSymbol $sym32$HL_JUSTIFICATION_P;
    private static final SubLString $str33$No_tactic_found_for__S;
    private static final SubLSymbol $kw34$COMPLETE;
    private static final SubLSymbol $kw35$SKIP;
    private static final SubLSymbol $sym36$PROBLEM_QUERY_P;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$PROOF_P;
    private static final SubLSymbol $sym39$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject rewrite_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)inference_worker_rewrite.ZERO_INTEGER);
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject rewrite_link_data_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rewrite_link_data_native.class) ? inference_worker_rewrite.T : inference_worker_rewrite.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject rw_link_data_hl_module(final SubLObject v_object) {
        assert inference_worker_rewrite.NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject rw_link_data_bindings(final SubLObject v_object) {
        assert inference_worker_rewrite.NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject rw_link_data_supports(final SubLObject v_object) {
        assert inference_worker_rewrite.NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject _csetf_rw_link_data_hl_module(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_rewrite.NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject _csetf_rw_link_data_bindings(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_rewrite.NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject _csetf_rw_link_data_supports(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_rewrite.NIL != rewrite_link_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject make_rewrite_link_data(SubLObject arglist) {
        if (arglist == inference_worker_rewrite.UNPROVIDED) {
            arglist = (SubLObject)inference_worker_rewrite.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rewrite_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_worker_rewrite.NIL, next = arglist; inference_worker_rewrite.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_worker_rewrite.$kw15$HL_MODULE)) {
                _csetf_rw_link_data_hl_module(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_worker_rewrite.$kw16$BINDINGS)) {
                _csetf_rw_link_data_bindings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_worker_rewrite.$kw17$SUPPORTS)) {
                _csetf_rw_link_data_supports(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_worker_rewrite.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject visit_defstruct_rewrite_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_rewrite.$kw19$BEGIN, (SubLObject)inference_worker_rewrite.$sym20$MAKE_REWRITE_LINK_DATA, (SubLObject)inference_worker_rewrite.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_rewrite.$kw21$SLOT, (SubLObject)inference_worker_rewrite.$kw15$HL_MODULE, rw_link_data_hl_module(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_rewrite.$kw21$SLOT, (SubLObject)inference_worker_rewrite.$kw16$BINDINGS, rw_link_data_bindings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_rewrite.$kw21$SLOT, (SubLObject)inference_worker_rewrite.$kw17$SUPPORTS, rw_link_data_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_rewrite.$kw22$END, (SubLObject)inference_worker_rewrite.$sym20$MAKE_REWRITE_LINK_DATA, (SubLObject)inference_worker_rewrite.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1097L)
    public static SubLObject visit_defstruct_object_rewrite_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rewrite_link_data(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1631L)
    public static SubLObject new_rewrite_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject hl_module, final SubLObject supports) {
        assert inference_worker_rewrite.NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        if (inference_worker_rewrite.NIL != supporting_mapped_problem && !inference_worker_rewrite.assertionsDisabledInClass && inference_worker_rewrite.NIL == inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem)) {
            throw new AssertionError(supporting_mapped_problem);
        }
        assert inference_worker_rewrite.NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        final SubLObject rewrite_link = new_rewrite_link_int(supported_problem, hl_module, supports);
        if (inference_worker_rewrite.NIL != supporting_mapped_problem) {
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, rewrite_link);
        }
        inference_datastructures_problem_link.problem_link_open_all(rewrite_link);
        inference_worker.propagate_problem_link(rewrite_link);
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 2258L)
    public static SubLObject new_rewrite_link_int(final SubLObject problem, final SubLObject hl_module, final SubLObject supports) {
        final SubLObject rewrite_link = inference_datastructures_problem_link.new_problem_link((SubLObject)inference_worker_rewrite.$kw27$REWRITE, problem);
        new_rewrite_link_data(rewrite_link);
        set_rewrite_link_hl_module(rewrite_link, hl_module);
        set_rewrite_link_bindings(rewrite_link, (SubLObject)inference_worker_rewrite.$kw28$UNDETERMINED);
        set_rewrite_link_supports(rewrite_link, supports);
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 2791L)
    public static SubLObject new_rewrite_link_data(final SubLObject rewrite_link) {
        final SubLObject data = make_rewrite_link_data((SubLObject)inference_worker_rewrite.UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(rewrite_link, data);
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 2956L)
    public static SubLObject destroy_rewrite_link(final SubLObject rewrite_link) {
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        _csetf_rw_link_data_hl_module(data, (SubLObject)inference_worker_rewrite.$kw29$FREE);
        _csetf_rw_link_data_bindings(data, (SubLObject)inference_worker_rewrite.$kw29$FREE);
        _csetf_rw_link_data_supports(data, (SubLObject)inference_worker_rewrite.$kw29$FREE);
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 3244L)
    public static SubLObject rewrite_link_hl_module(final SubLObject rewrite_link) {
        assert inference_worker_rewrite.NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        return rw_link_data_hl_module(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 3448L)
    public static SubLObject rewrite_link_bindings(final SubLObject rewrite_link) {
        assert inference_worker_rewrite.NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        SubLObject v_bindings = rw_link_data_bindings(data);
        if (v_bindings == inference_worker_rewrite.$kw28$UNDETERMINED) {
            v_bindings = compute_rewrite_bindings(rewrite_link);
            _csetf_rw_link_data_bindings(data, v_bindings);
        }
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 3998L)
    public static SubLObject rewrite_link_supports(final SubLObject rewrite_link) {
        assert inference_worker_rewrite.NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        return rw_link_data_supports(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 4188L)
    public static SubLObject set_rewrite_link_hl_module(final SubLObject rewrite_link, final SubLObject hl_module) {
        assert inference_worker_rewrite.NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        assert inference_worker_rewrite.NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        _csetf_rw_link_data_hl_module(data, hl_module);
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 4474L)
    public static SubLObject set_rewrite_link_bindings(final SubLObject rewrite_link, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_rewrite.NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        if (inference_worker_rewrite.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker_rewrite.NIL == bindings.binding_list_p(v_bindings) && v_bindings != inference_worker_rewrite.$kw28$UNDETERMINED) {
            Errors.error((SubLObject)inference_worker_rewrite.$str31$Bindings__a_are_not_valid_rewrite, v_bindings);
        }
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        _csetf_rw_link_data_bindings(data, v_bindings);
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 4841L)
    public static SubLObject set_rewrite_link_supports(final SubLObject rewrite_link, final SubLObject supports) {
        assert inference_worker_rewrite.NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        assert inference_worker_rewrite.NIL != arguments.hl_justification_p(supports) : supports;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        _csetf_rw_link_data_supports(data, supports);
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 5117L)
    public static SubLObject rewrite_link_tactic(final SubLObject rewrite_link) {
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
        final SubLObject hl_module = rewrite_link_hl_module(rewrite_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject candidate_tactic = (SubLObject)inference_worker_rewrite.NIL;
        candidate_tactic = cdolist_list_var.first();
        while (inference_worker_rewrite.NIL != cdolist_list_var) {
            if (inference_worker_rewrite.NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, (SubLObject)inference_worker_rewrite.$kw27$REWRITE) && hl_module.eql(inference_datastructures_tactic.tactic_hl_module(candidate_tactic))) {
                return candidate_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_tactic = cdolist_list_var.first();
        }
        if (inference_worker_rewrite.NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
            return Errors.error((SubLObject)inference_worker_rewrite.$str33$No_tactic_found_for__S, rewrite_link);
        }
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 5585L)
    public static SubLObject rewrite_link_supporting_mapped_problem(final SubLObject rewrite_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(rewrite_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 5763L)
    public static SubLObject rewrite_link_supporting_variable_map(final SubLObject rewrite_link) {
        final SubLObject supporting_mapped_problem = rewrite_link_supporting_mapped_problem(rewrite_link);
        if (inference_worker_rewrite.NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
        }
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6067L)
    public static SubLObject rewrite_link_rewrite_mt(final SubLObject rewrite_link) {
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
        return inference_datastructures_problem.single_literal_problem_mt(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6274L)
    public static SubLObject rewrite_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_rewrite.NIL != inference_datastructures_problem_link.problem_link_p(v_object) && inference_worker_rewrite.$kw27$REWRITE == inference_datastructures_problem_link.problem_link_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6419L)
    public static SubLObject rewrite_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_rewrite.NIL != inference_datastructures_tactic.tactic_p(tactic) && inference_worker_rewrite.$kw27$REWRITE == inference_datastructures_tactic.tactic_type(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6536L)
    public static SubLObject rewrite_tactic_support(final SubLObject tactic) {
        return inference_modules.rewrite_module_support(inference_datastructures_tactic.tactic_hl_module(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6715L)
    public static SubLObject rewrite_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_rewrite.NIL != inference_datastructures_proof.proof_p(v_object) && inference_worker_rewrite.NIL != rewrite_link_p(inference_datastructures_proof.proof_link(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6832L)
    public static SubLObject determine_new_literal_rewrite_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense, SubLObject disabled_hl_modules) {
        if (disabled_hl_modules == inference_worker_rewrite.UNPROVIDED) {
            disabled_hl_modules = (SubLObject)inference_worker_rewrite.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic_specs = (SubLObject)inference_worker_rewrite.NIL;
        SubLObject supplanted_hl_modules = (SubLObject)inference_worker_rewrite.NIL;
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
        for (exclusive_foundP = (SubLObject)inference_worker_rewrite.NIL, rest = (SubLObject)inference_worker_rewrite.NIL, rest = inference_modules.rewrite_modules(); inference_worker_rewrite.NIL == exclusive_foundP && inference_worker_rewrite.NIL != rest; rest = rest.rest()) {
            hl_module = rest.first();
            if (inference_worker_rewrite.NIL != inference_modules.hl_module_activeP(hl_module, disabled_hl_modules) && (inference_worker_rewrite.NIL == supplanted_hl_modules || inference_worker_rewrite.NIL == conses_high.member(hl_module, supplanted_hl_modules, (SubLObject)inference_worker_rewrite.UNPROVIDED, (SubLObject)inference_worker_rewrite.UNPROVIDED)) && inference_worker_rewrite.NIL != inference_modules.hl_module_sense_relevant_p(hl_module, sense) && inference_worker_rewrite.NIL != inference_worker_removal.hl_module_applicable_to_asentP(hl_module, asent)) {
                exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                if (inference_worker_rewrite.NIL == exclusive_func || (exclusive_func.isFunctionSpec() && inference_worker_rewrite.NIL != Functions.funcall(exclusive_func, asent))) {
                    if (inference_worker_rewrite.NIL != exclusive_func) {
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
                    if (inference_worker_rewrite.NIL == required_func || (required_func.isFunctionSpec() && inference_worker_rewrite.NIL != Functions.funcall(required_func, asent))) {
                        cost = inference_modules.hl_module_asent_cost(hl_module, asent);
                        if (inference_worker_rewrite.NIL != cost) {
                            productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                            completeness = inference_modules.hl_module_completeness(hl_module, asent, (SubLObject)inference_worker_rewrite.$kw34$COMPLETE);
                            tactic_spec = (SubLObject)ConsesLow.list(hl_module, productivity, completeness);
                            tactic_specs = (SubLObject)ConsesLow.cons(tactic_spec, tactic_specs);
                            new_rewrite_tactic(problem, hl_module, productivity, completeness);
                        }
                    }
                }
            }
        }
        return tactic_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 8734L)
    public static SubLObject literal_level_rewrite_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_rewrite.NIL != rewrite_tactic_p(tactic) && inference_worker_rewrite.NIL != inference_worker.literal_level_tactic_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 8874L)
    public static SubLObject maybe_new_rewrite_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject tactic, final SubLObject supports) {
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject rewrite_link = new_rewrite_link(supported_problem, supporting_mapped_problem, hl_module, supports);
        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 9433L)
    public static SubLObject new_rewrite_tactic(final SubLObject problem, final SubLObject module, final SubLObject productivity, final SubLObject completeness) {
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, module, (SubLObject)inference_worker_rewrite.UNPROVIDED);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, (SubLObject)inference_worker_rewrite.UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker_rewrite.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_rewrite.$kw35$SKIP)) {
            final SubLObject idx_$4 = idx;
            if (inference_worker_rewrite.NIL == id_index.id_index_dense_objects_empty_p(idx_$4, (SubLObject)inference_worker_rewrite.$kw35$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$4);
                final SubLObject backwardP_var = (SubLObject)inference_worker_rewrite.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker_rewrite.NIL, v_iteration = (SubLObject)inference_worker_rewrite.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker_rewrite.ONE_INTEGER)) {
                    id = ((inference_worker_rewrite.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker_rewrite.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker_rewrite.NIL == id_index.id_index_tombstone_p(inference) || inference_worker_rewrite.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_rewrite.$kw35$SKIP)) {
                        if (inference_worker_rewrite.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker_rewrite.$kw35$SKIP;
                        }
                        if (inference_worker_rewrite.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_rewrite.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_rewrite.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker_rewrite.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$5 = idx;
            if (inference_worker_rewrite.NIL == id_index.id_index_sparse_objects_empty_p(idx_$5)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$5);
                SubLObject id2 = (SubLObject)inference_worker_rewrite.NIL;
                SubLObject inference2 = (SubLObject)inference_worker_rewrite.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker_rewrite.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker_rewrite.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker_rewrite.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker_rewrite.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 9783L)
    public static SubLObject compute_strategic_properties_of_rewrite_tactic(final SubLObject tactic, final SubLObject strategy) {
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 9903L)
    public static SubLObject current_rewrite_mt() {
        return inference_datastructures_problem.single_literal_problem_mt(inference_worker.currently_active_problem());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 10139L)
    public static SubLObject execute_literal_level_rewrite_tactic(final SubLObject tactic, final SubLObject mt, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = control_vars.$negation_by_failure$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(inference_datastructures_tactic.tactic_store(tactic)), thread);
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            final SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
            if (inference_worker_rewrite.NIL != pattern) {
                formula_pattern_match.pattern_transform_formula(pattern, asent, (SubLObject)inference_worker_rewrite.UNPROVIDED);
            }
            else {
                final SubLObject function = inference_modules.hl_module_expand_func(hl_module);
                if (function.isFunctionSpec()) {
                    Functions.funcall(function, asent);
                }
            }
        }
        finally {
            control_vars.$negation_by_failure$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 10753L)
    public static SubLObject rewrite_add_link(final SubLObject query, final SubLObject supports) {
        assert inference_worker_rewrite.NIL != inference_datastructures_problem_query.problem_query_p(query) : query;
        assert inference_worker_rewrite.NIL != arguments.hl_justification_p(supports) : supports;
        final SubLObject tactic = inference_worker.currently_executing_tactic();
        final SubLObject rewrite_support = rewrite_tactic_support(tactic);
        final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        final SubLObject free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        final SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, query, free_hl_vars, (SubLObject)inference_worker_rewrite.UNPROVIDED);
        final SubLObject all_supports = (SubLObject)((inference_worker_rewrite.NIL != rewrite_support) ? ConsesLow.cons(rewrite_support, supports) : supports);
        return maybe_new_rewrite_link(supported_problem, supporting_mapped_problem, tactic, all_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 11563L)
    public static SubLObject compute_rewrite_bindings(final SubLObject rewrite_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rewrite_support = rewrite_tactic_support(rewrite_link_tactic(rewrite_link));
        final SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link));
        final SubLObject rule_cnf = (inference_worker_rewrite.NIL != assertions_high.rule_assertionP(rewrite_support)) ? assertions_high.assertion_cnf(rewrite_support) : czer_main.canonicalize_cycl(arguments.support_sentence(rewrite_support), (SubLObject)inference_worker_rewrite.UNPROVIDED);
        final SubLObject rule_variable_map = (inference_worker_rewrite.NIL != assertions_high.rule_assertionP(rewrite_support)) ? inference_worker_transformation.rule_assertion_variable_map(rewrite_support) : identity_variable_map_for_sentence(arguments.support_sentence(rewrite_support));
        final SubLObject poslits = clauses.pos_lits(rule_cnf);
        final SubLObject neglits = clauses.neg_lits(rule_cnf);
        final SubLObject consequent = poslits.first();
        SubLObject supported_problem_bindings = (SubLObject)inference_worker_rewrite.NIL;
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification.unify(asent, consequent, (SubLObject)inference_worker_rewrite.UNPROVIDED, (SubLObject)inference_worker_rewrite.UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        supported_problem_bindings = inference_worker_transformation.unification_bindings_to_transformation_bindings(v_bindings);
        return supported_problem_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 12660L)
    public static SubLObject identity_variable_map_for_sentence(final SubLObject sentence) {
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 12763L)
    public static SubLObject restriction_rewrite_add_link(final SubLObject query, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_rewrite.NIL != inference_datastructures_problem_query.problem_query_p(query) : query;
        assert inference_worker_rewrite.NIL != arguments.hl_justification_p(supports) : supports;
        final SubLObject tactic = inference_worker.currently_executing_tactic();
        final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
        final SubLObject supported_query_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        final SubLObject supported_asent = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(supported_query);
        final SubLObject supporting_asent = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(query);
        thread.resetMultipleValues();
        final SubLObject restriction_bindings = unification.unify(supporting_asent, supported_asent, (SubLObject)inference_worker_rewrite.T, (SubLObject)inference_worker_rewrite.UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        final SubLObject free_hl_vars = variables.sort_hl_variable_list_memoized(list_utilities.fast_set_difference(supported_query_free_hl_vars, bindings.bindings_variables(restriction_bindings), (SubLObject)inference_worker_rewrite.UNPROVIDED));
        final SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, query, free_hl_vars, (SubLObject)inference_worker_rewrite.UNPROVIDED);
        final SubLObject link = inference_worker_restriction.maybe_new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, (SubLObject)inference_worker_rewrite.T, (SubLObject)inference_worker_rewrite.UNPROVIDED);
        if (inference_worker_rewrite.NIL != link) {
            inference_worker_restriction.add_restriction_link_listener(link, tactic);
        }
        return supporting_mapped_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 14139L)
    public static SubLObject trigger_restriction_link_listeners(final SubLObject link, final SubLObject proof) {
        if (inference_worker_rewrite.NIL != inference_worker_restriction.restriction_listening_link_p(link)) {
            final SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            final SubLObject restricted_mapped_problem = inference_worker_restriction.restriction_link_supporting_mapped_problem(link);
            final SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
            final SubLObject restricted_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(restricted_problem);
            SubLObject cdolist_list_var = inference_worker_restriction.restriction_link_listeners(link);
            SubLObject tactic = (SubLObject)inference_worker_rewrite.NIL;
            tactic = cdolist_list_var.first();
            while (inference_worker_rewrite.NIL != cdolist_list_var) {
                final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                final SubLObject rewrite_closure_fn = inference_modules.rewrite_module_closure(hl_module);
                SubLObject cdolist_list_var_$6;
                final SubLObject rewritten_closure = cdolist_list_var_$6 = Functions.funcall(rewrite_closure_fn, restricted_asent);
                SubLObject asent_and_supports = (SubLObject)inference_worker_rewrite.NIL;
                asent_and_supports = cdolist_list_var_$6.first();
                while (inference_worker_rewrite.NIL != cdolist_list_var_$6) {
                    SubLObject current;
                    final SubLObject datum = current = asent_and_supports;
                    SubLObject asent = (SubLObject)inference_worker_rewrite.NIL;
                    SubLObject supports = (SubLObject)inference_worker_rewrite.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_rewrite.$list37);
                    asent = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_rewrite.$list37);
                    supports = current.first();
                    current = current.rest();
                    if (inference_worker_rewrite.NIL == current) {
                        maybe_add_restriction_rewrite_problem(asent, hl_module, tactic, unrestricted_problem, restricted_mapped_problem, supports);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_rewrite.$list37);
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    asent_and_supports = cdolist_list_var_$6.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                tactic = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 15087L)
    public static SubLObject maybe_add_restriction_rewrite_problem(final SubLObject rewritten_asent, final SubLObject rewrite_module, final SubLObject rewrite_tactic, final SubLObject unrestricted_problem, final SubLObject restricted_mapped_problem, final SubLObject supports) {
        final SubLObject unrestricted_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(unrestricted_problem);
        final SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
        final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(restricted_problem);
        final SubLObject sense = inference_datastructures_problem.single_literal_problem_sense(restricted_problem);
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(rewritten_asent, sense, mt);
        final SubLObject store = inference_datastructures_problem.problem_store(restricted_problem);
        final SubLObject mapped_problem = inference_worker.find_or_create_problem(store, query, (SubLObject)inference_worker_rewrite.NIL, (SubLObject)inference_worker_rewrite.UNPROVIDED);
        final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
        if (inference_worker_rewrite.NIL == structurally_redundant_restriction_rewrite_problemP(problem, rewrite_module)) {
            final SubLObject find_problem_var_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
            final SubLObject restricting_var_map = inference_datastructures_problem_link.mapped_problem_variable_map(restricted_mapped_problem);
            final SubLObject new_restriction_var_map = bindings.compose_bindings(find_problem_var_map, restricting_var_map);
            final SubLObject new_mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, new_restriction_var_map);
            final SubLObject new_restriction_bindings = unification_utilities.rewrite_asent_unify(unrestricted_asent, rewritten_asent);
            final SubLObject rewrite_support = inference_modules.rewrite_module_support(rewrite_module);
            final SubLObject all_supports = (SubLObject)((inference_worker_rewrite.NIL != rewrite_support) ? ConsesLow.cons(rewrite_support, supports) : supports);
            inference_worker_restriction.maybe_new_restriction_link(unrestricted_problem, new_mapped_problem, new_restriction_bindings, (SubLObject)inference_worker_rewrite.UNPROVIDED, (SubLObject)inference_worker_rewrite.UNPROVIDED);
            maybe_new_rewrite_link(problem, restricted_mapped_problem, rewrite_tactic, all_supports);
        }
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 16795L)
    public static SubLObject structurally_redundant_restriction_rewrite_problemP(final SubLObject problem, final SubLObject module) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject link_tactic;
        SubLObject link_module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_rewrite.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_rewrite.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_rewrite.NIL != set_contents.do_set_contents_element_validP(state, link) && inference_worker_rewrite.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, (SubLObject)inference_worker_rewrite.$kw27$REWRITE)) {
                link_tactic = rewrite_link_tactic(link);
                link_module = inference_datastructures_tactic.tactic_hl_module(link_tactic);
                if (link_module.eql(module)) {
                    return (SubLObject)inference_worker_rewrite.T;
                }
            }
        }
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 17248L)
    public static SubLObject new_rewrite_proof(final SubLObject rewrite_link, final SubLObject subproof, final SubLObject variable_map) {
        assert inference_worker_rewrite.NIL != rewrite_link_p(rewrite_link) : rewrite_link;
        if (inference_worker_rewrite.NIL != subproof && !inference_worker_rewrite.assertionsDisabledInClass && inference_worker_rewrite.NIL == inference_datastructures_proof.proof_p(subproof)) {
            throw new AssertionError(subproof);
        }
        final SubLObject subproofs = (SubLObject)((inference_worker_rewrite.NIL != subproof) ? ConsesLow.list(subproof) : inference_worker_rewrite.NIL);
        final SubLObject supporting_subproof_bindings = (SubLObject)((inference_worker_rewrite.NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : inference_worker_rewrite.NIL);
        final SubLObject subproof_bindings = bindings.transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
        final SubLObject proof_bindings = inference_worker_transformation.extended_supported_problem_bindings_to_supported_problem_bindings(subproof_bindings);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        return inference_worker.propose_new_proof_with_bindings(rewrite_link, canonical_proof_bindings, subproofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 17934L)
    public static SubLObject bubble_up_proof_to_rewrite_link(final SubLObject supporting_proof, final SubLObject variable_map, final SubLObject rewrite_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_rewrite.NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(rewrite_link) : rewrite_link;
        thread.resetMultipleValues();
        final SubLObject proof = new_rewrite_proof(rewrite_link, supporting_proof, variable_map);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_rewrite.NIL != newP) {
            inference_worker.bubble_up_proof(proof);
        }
        else {
            inference_worker.possibly_note_proof_processed(supporting_proof);
        }
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    public static SubLObject declare_inference_worker_rewrite_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_data_print_function_trampoline", "REWRITE-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_data_p", "REWRITE-LINK-DATA-P", 1, 0, false);
        new $rewrite_link_data_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rw_link_data_hl_module", "RW-LINK-DATA-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rw_link_data_bindings", "RW-LINK-DATA-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rw_link_data_supports", "RW-LINK-DATA-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "_csetf_rw_link_data_hl_module", "_CSETF-RW-LINK-DATA-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "_csetf_rw_link_data_bindings", "_CSETF-RW-LINK-DATA-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "_csetf_rw_link_data_supports", "_CSETF-RW-LINK-DATA-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "make_rewrite_link_data", "MAKE-REWRITE-LINK-DATA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "visit_defstruct_rewrite_link_data", "VISIT-DEFSTRUCT-REWRITE-LINK-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "visit_defstruct_object_rewrite_link_data_method", "VISIT-DEFSTRUCT-OBJECT-REWRITE-LINK-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "new_rewrite_link", "NEW-REWRITE-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "new_rewrite_link_int", "NEW-REWRITE-LINK-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "new_rewrite_link_data", "NEW-REWRITE-LINK-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "destroy_rewrite_link", "DESTROY-REWRITE-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_hl_module", "REWRITE-LINK-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_bindings", "REWRITE-LINK-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_supports", "REWRITE-LINK-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "set_rewrite_link_hl_module", "SET-REWRITE-LINK-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "set_rewrite_link_bindings", "SET-REWRITE-LINK-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "set_rewrite_link_supports", "SET-REWRITE-LINK-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_tactic", "REWRITE-LINK-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_supporting_mapped_problem", "REWRITE-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_supporting_variable_map", "REWRITE-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_rewrite_mt", "REWRITE-LINK-REWRITE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_link_p", "REWRITE-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_tactic_p", "REWRITE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_tactic_support", "REWRITE-TACTIC-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_proof_p", "REWRITE-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "determine_new_literal_rewrite_tactics", "DETERMINE-NEW-LITERAL-REWRITE-TACTICS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "literal_level_rewrite_tactic_p", "LITERAL-LEVEL-REWRITE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "maybe_new_rewrite_link", "MAYBE-NEW-REWRITE-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "new_rewrite_tactic", "NEW-REWRITE-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "compute_strategic_properties_of_rewrite_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REWRITE-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "current_rewrite_mt", "CURRENT-REWRITE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "execute_literal_level_rewrite_tactic", "EXECUTE-LITERAL-LEVEL-REWRITE-TACTIC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "rewrite_add_link", "REWRITE-ADD-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "compute_rewrite_bindings", "COMPUTE-REWRITE-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "identity_variable_map_for_sentence", "IDENTITY-VARIABLE-MAP-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "restriction_rewrite_add_link", "RESTRICTION-REWRITE-ADD-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "trigger_restriction_link_listeners", "TRIGGER-RESTRICTION-LINK-LISTENERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "maybe_add_restriction_rewrite_problem", "MAYBE-ADD-RESTRICTION-REWRITE-PROBLEM", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "structurally_redundant_restriction_rewrite_problemP", "STRUCTURALLY-REDUNDANT-RESTRICTION-REWRITE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "new_rewrite_proof", "NEW-REWRITE-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite", "bubble_up_proof_to_rewrite_link", "BUBBLE-UP-PROOF-TO-REWRITE-LINK", 3, 0, false);
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    public static SubLObject init_inference_worker_rewrite_file() {
        inference_worker_rewrite.$dtp_rewrite_link_data$ = SubLFiles.defconstant("*DTP-REWRITE-LINK-DATA*", (SubLObject)inference_worker_rewrite.$sym0$REWRITE_LINK_DATA);
        return (SubLObject)inference_worker_rewrite.NIL;
    }
    
    public static SubLObject setup_inference_worker_rewrite_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_worker_rewrite.$dtp_rewrite_link_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_worker_rewrite.$sym7$REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_worker_rewrite.$list8);
        Structures.def_csetf((SubLObject)inference_worker_rewrite.$sym9$RW_LINK_DATA_HL_MODULE, (SubLObject)inference_worker_rewrite.$sym10$_CSETF_RW_LINK_DATA_HL_MODULE);
        Structures.def_csetf((SubLObject)inference_worker_rewrite.$sym11$RW_LINK_DATA_BINDINGS, (SubLObject)inference_worker_rewrite.$sym12$_CSETF_RW_LINK_DATA_BINDINGS);
        Structures.def_csetf((SubLObject)inference_worker_rewrite.$sym13$RW_LINK_DATA_SUPPORTS, (SubLObject)inference_worker_rewrite.$sym14$_CSETF_RW_LINK_DATA_SUPPORTS);
        Equality.identity((SubLObject)inference_worker_rewrite.$sym0$REWRITE_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_worker_rewrite.$dtp_rewrite_link_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_worker_rewrite.$sym23$VISIT_DEFSTRUCT_OBJECT_REWRITE_LINK_DATA_METHOD));
        return (SubLObject)inference_worker_rewrite.NIL;
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
        me = (SubLFile)new inference_worker_rewrite();
        inference_worker_rewrite.$dtp_rewrite_link_data$ = null;
        $sym0$REWRITE_LINK_DATA = SubLObjectFactory.makeSymbol("REWRITE-LINK-DATA");
        $sym1$REWRITE_LINK_DATA_P = SubLObjectFactory.makeSymbol("REWRITE-LINK-DATA-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HL-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RW-LINK-DATA-HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("RW-LINK-DATA-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("RW-LINK-DATA-SUPPORTS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RW-LINK-DATA-HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RW-LINK-DATA-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RW-LINK-DATA-SUPPORTS"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REWRITE-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REWRITE-LINK-DATA-P"));
        $sym9$RW_LINK_DATA_HL_MODULE = SubLObjectFactory.makeSymbol("RW-LINK-DATA-HL-MODULE");
        $sym10$_CSETF_RW_LINK_DATA_HL_MODULE = SubLObjectFactory.makeSymbol("_CSETF-RW-LINK-DATA-HL-MODULE");
        $sym11$RW_LINK_DATA_BINDINGS = SubLObjectFactory.makeSymbol("RW-LINK-DATA-BINDINGS");
        $sym12$_CSETF_RW_LINK_DATA_BINDINGS = SubLObjectFactory.makeSymbol("_CSETF-RW-LINK-DATA-BINDINGS");
        $sym13$RW_LINK_DATA_SUPPORTS = SubLObjectFactory.makeSymbol("RW-LINK-DATA-SUPPORTS");
        $sym14$_CSETF_RW_LINK_DATA_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-RW-LINK-DATA-SUPPORTS");
        $kw15$HL_MODULE = SubLObjectFactory.makeKeyword("HL-MODULE");
        $kw16$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw17$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $str18$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw19$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym20$MAKE_REWRITE_LINK_DATA = SubLObjectFactory.makeSymbol("MAKE-REWRITE-LINK-DATA");
        $kw21$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw22$END = SubLObjectFactory.makeKeyword("END");
        $sym23$VISIT_DEFSTRUCT_OBJECT_REWRITE_LINK_DATA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REWRITE-LINK-DATA-METHOD");
        $sym24$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $sym25$MAPPED_PROBLEM_P = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-P");
        $sym26$HL_MODULE_P = SubLObjectFactory.makeSymbol("HL-MODULE-P");
        $kw27$REWRITE = SubLObjectFactory.makeKeyword("REWRITE");
        $kw28$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $kw29$FREE = SubLObjectFactory.makeKeyword("FREE");
        $sym30$REWRITE_LINK_P = SubLObjectFactory.makeSymbol("REWRITE-LINK-P");
        $str31$Bindings__a_are_not_valid_rewrite = SubLObjectFactory.makeString("Bindings ~a are not valid rewrite-link bindings.");
        $sym32$HL_JUSTIFICATION_P = SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P");
        $str33$No_tactic_found_for__S = SubLObjectFactory.makeString("No tactic found for ~S");
        $kw34$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw35$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym36$PROBLEM_QUERY_P = SubLObjectFactory.makeSymbol("PROBLEM-QUERY-P");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $sym38$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $sym39$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");
    }
    
    public static final class $rewrite_link_data_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $bindings;
        public SubLObject $supports;
        private static final SubLStructDeclNative structDecl;
        
        public $rewrite_link_data_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rewrite_link_data_native.structDecl;
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
		public SubLObject setField2(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$bindings = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rewrite_link_data_native.class, inference_worker_rewrite.$sym0$REWRITE_LINK_DATA, inference_worker_rewrite.$sym1$REWRITE_LINK_DATA_P, inference_worker_rewrite.$list2, inference_worker_rewrite.$list3, new String[] { "$hl_module", "$bindings", "$supports" }, inference_worker_rewrite.$list4, inference_worker_rewrite.$list5, inference_worker_rewrite.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $rewrite_link_data_p$UnaryFunction extends UnaryFunction
    {
        public $rewrite_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REWRITE-LINK-DATA-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_rewrite.rewrite_link_data_p(arg1);
        }
    }
}

/*

	Total time: 434 ms
	 synthetic 
*/