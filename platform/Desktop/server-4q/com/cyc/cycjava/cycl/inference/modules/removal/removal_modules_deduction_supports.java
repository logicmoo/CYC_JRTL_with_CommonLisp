package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_deduction_supports extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_deduction_supports";
    public static final String myFingerPrint = "56ece29b3c5aabe1d774937426208a43dda96b378d3e6d82e992939ae32d2122";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 1851L)
    private static SubLSymbol $default_deduction_supports_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 2175L)
    private static SubLSymbol $average_deduction_support_count$;
    private static final SubLObject $const0$deductionSupports;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLObject $const3$CycDeductionDatastructureFn;
    private static final SubLSymbol $kw4$REMOVAL_DEDUCTIONSUPPORTS;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$OPAQUE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 833L)
    public static SubLObject deduction_supportP(final SubLObject deduction, final SubLObject support) {
        return conses_high.member(support, deductions_high.deduction_supports(deduction), (SubLObject)removal_modules_deduction_supports.UNPROVIDED, (SubLObject)removal_modules_deduction_supports.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 998L)
    public static SubLObject find_deduction_from_term(final SubLObject deduction_term) {
        SubLObject d_id = (SubLObject)removal_modules_deduction_supports.NIL;
        SubLObject deduction = (SubLObject)removal_modules_deduction_supports.NIL;
        if (!cycl_utilities.formula_operator(deduction_term).eql(removal_modules_deduction_supports.$const3$CycDeductionDatastructureFn)) {
            return (SubLObject)removal_modules_deduction_supports.NIL;
        }
        d_id = cycl_utilities.formula_arg1(deduction_term, (SubLObject)removal_modules_deduction_supports.UNPROVIDED);
        deduction = deduction_handles.find_deduction_by_id(d_id);
        if (removal_modules_deduction_supports.NIL != deduction_handles.deduction_p(deduction)) {
            return deduction;
        }
        return (SubLObject)removal_modules_deduction_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 1392L)
    public static SubLObject deduction_term_supports(final SubLObject deduction_term) {
        SubLObject deduction = (SubLObject)removal_modules_deduction_supports.NIL;
        SubLObject supports = (SubLObject)removal_modules_deduction_supports.NIL;
        if (!cycl_utilities.formula_operator(deduction_term).eql(removal_modules_deduction_supports.$const3$CycDeductionDatastructureFn)) {
            return (SubLObject)removal_modules_deduction_supports.NIL;
        }
        deduction = find_deduction_from_term(deduction_term);
        if (removal_modules_deduction_supports.NIL != deduction_handles.deduction_p(deduction)) {
            supports = deductions_high.deduction_supports(deduction);
            return supports;
        }
        return (SubLObject)removal_modules_deduction_supports.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 5797L)
    public static SubLObject removal_deductionsupports_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_deduction_supports.UNPROVIDED) {
            sense = (SubLObject)removal_modules_deduction_supports.NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_deduction_supports.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_deduction_supports.UNPROVIDED);
        if (removal_modules_deduction_supports.NIL != variables.fully_bound_p(arg1)) {
            SubLObject cdolist_list_var;
            final SubLObject supports = cdolist_list_var = deduction_term_supports(arg1);
            SubLObject support = (SubLObject)removal_modules_deduction_supports.NIL;
            support = cdolist_list_var.first();
            while (removal_modules_deduction_supports.NIL != cdolist_list_var) {
                final SubLObject v_bindings = unification_utilities.term_unify(support, arg2, (SubLObject)removal_modules_deduction_supports.UNPROVIDED, (SubLObject)removal_modules_deduction_supports.UNPROVIDED);
                if (removal_modules_deduction_supports.NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_deduction_supports.$kw6$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_deduction_supports.UNPROVIDED, (SubLObject)removal_modules_deduction_supports.UNPROVIDED), v_bindings, (SubLObject)removal_modules_deduction_supports.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        else if (removal_modules_deduction_supports.NIL != assertion_handles.assertion_p(arg2)) {
            SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(arg2);
            SubLObject argument = (SubLObject)removal_modules_deduction_supports.NIL;
            argument = cdolist_list_var2.first();
            while (removal_modules_deduction_supports.NIL != cdolist_list_var2) {
                if (removal_modules_deduction_supports.NIL != deduction_handles.deduction_p(argument)) {
                    final SubLObject v_answer = el_utilities.make_unary_formula(removal_modules_deduction_supports.$const3$CycDeductionDatastructureFn, deduction_handles.deduction_id(argument));
                    final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg1, (SubLObject)removal_modules_deduction_supports.UNPROVIDED, (SubLObject)removal_modules_deduction_supports.UNPROVIDED);
                    if (removal_modules_deduction_supports.NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_deduction_supports.$kw6$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_deduction_supports.UNPROVIDED, (SubLObject)removal_modules_deduction_supports.UNPROVIDED), v_bindings, (SubLObject)removal_modules_deduction_supports.UNPROVIDED);
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                argument = cdolist_list_var2.first();
            }
        }
        return (SubLObject)removal_modules_deduction_supports.NIL;
    }
    
    public static SubLObject declare_removal_modules_deduction_supports_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_deduction_supports", "deduction_supportP", "DEDUCTION-SUPPORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_deduction_supports", "find_deduction_from_term", "FIND-DEDUCTION-FROM-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_deduction_supports", "deduction_term_supports", "DEDUCTION-TERM-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_deduction_supports", "removal_deductionsupports_expand", "REMOVAL-DEDUCTIONSUPPORTS-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_deduction_supports.NIL;
    }
    
    public static SubLObject init_removal_modules_deduction_supports_file() {
        removal_modules_deduction_supports.$default_deduction_supports_check_cost$ = SubLFiles.defparameter("*DEFAULT-DEDUCTION-SUPPORTS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_deduction_supports.$average_deduction_support_count$ = SubLFiles.deflexical("*AVERAGE-DEDUCTION-SUPPORT-COUNT*", (SubLObject)removal_modules_deduction_supports.THREE_INTEGER);
        return (SubLObject)removal_modules_deduction_supports.NIL;
    }
    
    public static SubLObject setup_removal_modules_deduction_supports_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_deduction_supports.$const0$deductionSupports);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_deduction_supports.$kw1$POS, removal_modules_deduction_supports.$const0$deductionSupports);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_deduction_supports.$kw2$NEG, removal_modules_deduction_supports.$const0$deductionSupports);
        inference_modules.inference_removal_module((SubLObject)removal_modules_deduction_supports.$kw4$REMOVAL_DEDUCTIONSUPPORTS, (SubLObject)removal_modules_deduction_supports.$list5);
        return (SubLObject)removal_modules_deduction_supports.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_deduction_supports_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_deduction_supports_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_deduction_supports_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_deduction_supports();
        removal_modules_deduction_supports.$default_deduction_supports_check_cost$ = null;
        removal_modules_deduction_supports.$average_deduction_support_count$ = null;
        $const0$deductionSupports = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deductionSupports"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $const3$CycDeductionDatastructureFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycDeductionDatastructureFn"));
        $kw4$REMOVAL_DEDUCTIONSUPPORTS = SubLObjectFactory.makeKeyword("REMOVAL-DEDUCTIONSUPPORTS");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deductionSupports")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deductionSupports")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deductionSupports")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*AVERAGE-DEDUCTION-SUPPORT-COUNT*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-DEDUCTIONSUPPORTS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$deductionSupports <fully-bound-p> <anything>) or (#$deductionSupports <anything> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$deductionSupports \n      (#$CycDeductionDatastructureFn 408468)\n      ?SUPPORT)") });
        $kw6$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
    }
}

/*

	Total time: 77 ms
	
*/