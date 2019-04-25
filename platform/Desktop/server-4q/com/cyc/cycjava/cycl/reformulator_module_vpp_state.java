package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_vpp_state extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_vpp_state";
    public static final String myFingerPrint = "99427505d3217288b583d7459e64e7c5801be2e48a304683819515be77c5586d";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-state.lisp", position = 3135L)
    private static SubLSymbol $vpps_microseconds$;
    private static final SubLObject $const0$VPPProcessingStateRLModule;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym3$GAF_ARG2;
    private static final SubLObject $const4$SomeFn;
    private static final SubLObject $const5$StateFn;
    private static final SubLSymbol $kw6$IGNORE;
    private static final SubLObject $const7$TheActiveSubject;
    private static final SubLInteger $int8$100;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-state.lisp", position = 1271L)
    public static SubLObject active_subject_for_reln_in_arg(final SubLObject reln, final SubLObject n, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_module_vpp_state.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_module_vpp_state.$sym2$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject genl_assertions = kb_mapping.gather_gaf_arg_index(reln, (SubLObject)reformulator_module_vpp_state.ONE_INTEGER, kb_accessors.arg_genl_pred(n, (SubLObject)reformulator_module_vpp_state.UNPROVIDED, (SubLObject)reformulator_module_vpp_state.UNPROVIDED), (SubLObject)reformulator_module_vpp_state.UNPROVIDED, (SubLObject)reformulator_module_vpp_state.UNPROVIDED);
            if (reformulator_module_vpp_state.NIL != genl_assertions) {
                final SubLObject cols = Mapping.mapcar((SubLObject)reformulator_module_vpp_state.$sym3$GAF_ARG2, genl_assertions);
                final SubLObject min_cols = genls.min_cols(cols, (SubLObject)reformulator_module_vpp_state.UNPROVIDED, (SubLObject)reformulator_module_vpp_state.UNPROVIDED);
                if (reformulator_module_vpp_state.NIL != list_utilities.singletonP(min_cols)) {
                    result = min_cols.first();
                }
            }
            else {
                final SubLObject isa_assertions = kb_mapping.gather_gaf_arg_index(reln, (SubLObject)reformulator_module_vpp_state.ONE_INTEGER, kb_accessors.arg_isa_pred(n, (SubLObject)reformulator_module_vpp_state.UNPROVIDED, (SubLObject)reformulator_module_vpp_state.UNPROVIDED), (SubLObject)reformulator_module_vpp_state.UNPROVIDED, (SubLObject)reformulator_module_vpp_state.UNPROVIDED);
                final SubLObject cols2 = Mapping.mapcar((SubLObject)reformulator_module_vpp_state.$sym3$GAF_ARG2, isa_assertions);
                final SubLObject min_cols2 = genls.min_cols(cols2, (SubLObject)reformulator_module_vpp_state.UNPROVIDED, (SubLObject)reformulator_module_vpp_state.UNPROVIDED);
                if (reformulator_module_vpp_state.NIL != list_utilities.singletonP(min_cols2)) {
                    result = min_cols2.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-state.lisp", position = 2204L)
    public static SubLObject vpps_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (reformulator_module_vpp_state.NIL != clauses.clauses_p(expression) && reformulator_module_vpp_state.NIL != list_utilities.singletonP(expression) && reformulator_module_vpp_state.NIL != clause_utilities.pos_atomic_cnf_p(expression.first())) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            if (reformulator_module_vpp_state.NIL != el_utilities.el_binary_formula_p(asent)) {
                final SubLObject plays_role_pred = cycl_utilities.atomic_sentence_predicate(asent);
                final SubLObject some_fn_arg = cycl_utilities.formula_arg1(asent, (SubLObject)reformulator_module_vpp_state.UNPROVIDED);
                if (reformulator_module_vpp_state.NIL != el_utilities.el_unary_formula_p(some_fn_arg) && reformulator_module_vpp_state.$const4$SomeFn.eql(cycl_utilities.formula_operator(some_fn_arg))) {
                    final SubLObject state_fn_arg = cycl_utilities.formula_arg1(some_fn_arg, (SubLObject)reformulator_module_vpp_state.UNPROVIDED);
                    if (reformulator_module_vpp_state.NIL != el_utilities.el_unary_formula_p(state_fn_arg) && reformulator_module_vpp_state.$const5$StateFn.eql(cycl_utilities.formula_operator(cycl_utilities.formula_arg1(some_fn_arg, (SubLObject)reformulator_module_vpp_state.UNPROVIDED))) && reformulator_module_vpp_state.NIL != reformulator_module_vpp_non_state.subject_role_predicateP(plays_role_pred, mt)) {
                        return (SubLObject)reformulator_module_vpp_state.T;
                    }
                }
            }
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_vpp_state.$kw6$IGNORE);
            SubLObject arg = (SubLObject)reformulator_module_vpp_state.NIL;
            arg = cdolist_list_var.first();
            while (reformulator_module_vpp_state.NIL != cdolist_list_var) {
                if (reformulator_module_vpp_state.$const7$TheActiveSubject.eql(arg) && reformulator_module_vpp_state.NIL != fort_types_interface.isa_predicateP(cycl_utilities.atomic_sentence_predicate(asent), mt)) {
                    return (SubLObject)reformulator_module_vpp_state.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return (SubLObject)reformulator_module_vpp_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-state.lisp", position = 3199L)
    public static SubLObject vpps_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_vpp_state.$vpps_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-state.lisp", position = 3314L)
    public static SubLObject vpps_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        SubLObject result = (SubLObject)reformulator_module_vpp_state.NIL;
        final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
        SubLObject active_subjectP = (SubLObject)reformulator_module_vpp_state.NIL;
        SubLObject argnum = (SubLObject)reformulator_module_vpp_state.ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_vpp_state.$kw6$IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = (SubLObject)reformulator_module_vpp_state.NIL, rest = args; reformulator_module_vpp_state.NIL == result && reformulator_module_vpp_state.NIL != rest; rest = rest.rest()) {
            arg = rest.first();
            argnum = Numbers.add(argnum, (SubLObject)reformulator_module_vpp_state.ONE_INTEGER);
            if (reformulator_module_vpp_state.$const7$TheActiveSubject.eql(arg)) {
                active_subjectP = (SubLObject)reformulator_module_vpp_state.T;
                result = vpps_reformulate_the_active_subject(asent, argnum, mt, settings);
            }
        }
        if (reformulator_module_vpp_state.NIL == active_subjectP) {
            result = vpps_reformulate_some_fn_state_fn(asent, mt, settings);
        }
        if (reformulator_module_vpp_state.NIL != result) {
            return Values.values(result, (SubLObject)reformulator_module_vpp_state.T);
        }
        return Values.values(expression, (SubLObject)reformulator_module_vpp_state.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-state.lisp", position = 3990L)
    public static SubLObject vpps_reformulate_the_active_subject(final SubLObject asent, final SubLObject argnum, final SubLObject mt, final SubLObject settings) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject col = active_subject_for_reln_in_arg(pred, argnum, mt);
        final SubLObject new_arg = el_utilities.make_unary_formula(reformulator_module_vpp_state.$const4$SomeFn, col);
        if (reformulator_module_vpp_state.NIL != col) {
            return el_utilities.replace_formula_arg(argnum, new_arg, asent);
        }
        return (SubLObject)reformulator_module_vpp_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-state.lisp", position = 4328L)
    public static SubLObject vpps_reformulate_some_fn_state_fn(final SubLObject asent, final SubLObject mt, final SubLObject settings) {
        final SubLObject some_fn_arg = cycl_utilities.formula_arg1(asent, (SubLObject)reformulator_module_vpp_state.UNPROVIDED);
        final SubLObject state_fn_arg = cycl_utilities.formula_arg1(some_fn_arg, (SubLObject)reformulator_module_vpp_state.UNPROVIDED);
        final SubLObject sentence = cycl_utilities.formula_arg1(state_fn_arg, (SubLObject)reformulator_module_vpp_state.UNPROVIDED);
        return sentence;
    }
    
    public static SubLObject declare_reformulator_module_vpp_state_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_state", "active_subject_for_reln_in_arg", "ACTIVE-SUBJECT-FOR-RELN-IN-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_state", "vpps_required", "VPPS-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_state", "vpps_cost", "VPPS-COST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_state", "vpps_reformulate", "VPPS-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_state", "vpps_reformulate_the_active_subject", "VPPS-REFORMULATE-THE-ACTIVE-SUBJECT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_vpp_state", "vpps_reformulate_some_fn_state_fn", "VPPS-REFORMULATE-SOME-FN-STATE-FN", 3, 0, false);
        return (SubLObject)reformulator_module_vpp_state.NIL;
    }
    
    public static SubLObject init_reformulator_module_vpp_state_file() {
        reformulator_module_vpp_state.$vpps_microseconds$ = SubLFiles.deflexical("*VPPS-MICROSECONDS*", (SubLObject)reformulator_module_vpp_state.$int8$100);
        return (SubLObject)reformulator_module_vpp_state.NIL;
    }
    
    public static SubLObject setup_reformulator_module_vpp_state_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_vpp_state.$const0$VPPProcessingStateRLModule, (SubLObject)reformulator_module_vpp_state.$list1);
        return (SubLObject)reformulator_module_vpp_state.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_reformulator_module_vpp_state_file();
    }
    
    @Override
	public void initializeVariables() {
        init_reformulator_module_vpp_state_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_reformulator_module_vpp_state_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_vpp_state();
        reformulator_module_vpp_state.$vpps_microseconds$ = null;
        $const0$VPPProcessingStateRLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VPPProcessingStateRLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("VPPS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("VPPS-COST"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("VPPS-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Transforms the output of the RTP and VPP into usable CycL."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$likes-Generic #$TheActiveSubject #$BillClinton)"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$likes-Generic (#$SomeFn #$Agent-Generic) #$BillClinton)") });
        $sym2$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym3$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $const4$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $const5$StateFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StateFn"));
        $kw6$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const7$TheActiveSubject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheActiveSubject"));
        $int8$100 = SubLObjectFactory.makeInteger(100);
    }
}

/*

	Total time: 55 ms
	
*/