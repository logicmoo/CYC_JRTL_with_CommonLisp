package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_negationpreds extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationpreds";
    public static final String myFingerPrint = "d442a29d4b5f70fcef40638746f8390262819a47716cca8918ecc425e0a5aaa1";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 720L)
    private static SubLSymbol $default_negationpreds_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 3356L)
    private static SubLSymbol $default_not_negationpreds_check_cost$;
    private static final SubLObject $const0$negationPreds;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$NEGATIONPREDS;
    private static final SubLSymbol $kw5$REMOVAL_NEGATIONPREDS_CHECK;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_MAX_NEGATIONPREDS;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$MAX_NEGATION_PREDS_POS;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$MINIMIZE;
    private static final SubLSymbol $kw12$REMOVAL_NOT_NEGATIONPREDS_CHECK;
    private static final SubLList $list13;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 899L)
    public static SubLObject removal_negationpreds_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_negationpreds.UNPROVIDED) {
            sense = (SubLObject)removal_modules_negationpreds.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = el_utilities.literal_args(literal, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
        SubLObject pred1 = (SubLObject)removal_modules_negationpreds.NIL;
        SubLObject pred2 = (SubLObject)removal_modules_negationpreds.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_negationpreds.$list3);
        pred1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_negationpreds.$list3);
        pred2 = current.first();
        current = current.rest();
        if (removal_modules_negationpreds.NIL == current) {
            if (removal_modules_negationpreds.NIL != negation_predicate.negation_predicateP(pred1, pred2, (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_negationpreds.$const0$negationPreds, (SubLObject)ConsesLow.list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_negationpreds.$kw4$NEGATIONPREDS, hl_support_formula, (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED), (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_negationpreds.$list3);
        }
        return (SubLObject)removal_modules_negationpreds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 1586L)
    public static SubLObject removal_max_negationpreds_cost(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_negationpreds.UNPROVIDED) {
            sense = (SubLObject)removal_modules_negationpreds.NIL;
        }
        SubLObject v_term = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
        if (removal_modules_negationpreds.NIL == forts.fort_p(v_term)) {
            v_term = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
        }
        return cardinality_estimates.genl_cardinality(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 1914L)
    public static SubLObject removal_max_negationpreds_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_negationpreds.UNPROVIDED) {
            sense = (SubLObject)removal_modules_negationpreds.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
        final SubLObject term2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
        final SubLObject variable = (removal_modules_negationpreds.NIL != variables.variable_p(term1)) ? term1 : term2;
        final SubLObject fort = (removal_modules_negationpreds.NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        final SubLObject disjoint_terms = cdolist_list_var = negation_predicate.max_negation_predicates(fort, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
        SubLObject disjoint_term = (SubLObject)removal_modules_negationpreds.NIL;
        disjoint_term = cdolist_list_var.first();
        while (removal_modules_negationpreds.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, (SubLObject)removal_modules_negationpreds.T, (SubLObject)removal_modules_negationpreds.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_negationpreds.NIL != v_bindings) {
                final SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_negationpreds.$const0$negationPreds, el_utilities.literal_args(subst_literal, (SubLObject)removal_modules_negationpreds.UNPROVIDED));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_negationpreds.$kw4$NEGATIONPREDS, hl_support_formula, (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_negationpreds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 3530L)
    public static SubLObject removal_not_negationpreds_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_negationpreds.UNPROVIDED) {
            sense = (SubLObject)removal_modules_negationpreds.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = el_utilities.literal_args(literal, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
        SubLObject pred1 = (SubLObject)removal_modules_negationpreds.NIL;
        SubLObject pred2 = (SubLObject)removal_modules_negationpreds.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_negationpreds.$list3);
        pred1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_negationpreds.$list3);
        pred2 = current.first();
        current = current.rest();
        if (removal_modules_negationpreds.NIL == current) {
            if (removal_modules_negationpreds.NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && removal_modules_negationpreds.NIL == negation_predicate.negation_predicateP(pred1, pred2, (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_negationpreds.$const0$negationPreds, (SubLObject)ConsesLow.list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_negationpreds.$kw11$MINIMIZE, cycl_utilities.negate(hl_support_formula), (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED), (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
            }
            else if (removal_modules_negationpreds.NIL != negation_predicate.not_negation_predicateP(pred1, pred2, (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_negationpreds.$const0$negationPreds, (SubLObject)ConsesLow.list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_negationpreds.$kw4$NEGATIONPREDS, cycl_utilities.negate(hl_support_formula), (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED), (SubLObject)removal_modules_negationpreds.UNPROVIDED, (SubLObject)removal_modules_negationpreds.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_negationpreds.$list3);
        }
        return (SubLObject)removal_modules_negationpreds.NIL;
    }
    
    public static SubLObject declare_removal_modules_negationpreds_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationpreds", "removal_negationpreds_check_expand", "REMOVAL-NEGATIONPREDS-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationpreds", "removal_max_negationpreds_cost", "REMOVAL-MAX-NEGATIONPREDS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationpreds", "removal_max_negationpreds_expand", "REMOVAL-MAX-NEGATIONPREDS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationpreds", "removal_not_negationpreds_check_expand", "REMOVAL-NOT-NEGATIONPREDS-CHECK-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_negationpreds.NIL;
    }
    
    public static SubLObject init_removal_modules_negationpreds_file() {
        removal_modules_negationpreds.$default_negationpreds_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEGATIONPREDS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_negationpreds.$default_not_negationpreds_check_cost$ = SubLFiles.defparameter("*DEFAULT-NOT-NEGATIONPREDS-CHECK-COST*", (SubLObject)removal_modules_negationpreds.TWO_INTEGER);
        return (SubLObject)removal_modules_negationpreds.NIL;
    }
    
    public static SubLObject setup_removal_modules_negationpreds_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_negationpreds.$const0$negationPreds);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_negationpreds.$kw1$POS, removal_modules_negationpreds.$const0$negationPreds);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_negationpreds.$kw2$NEG, removal_modules_negationpreds.$const0$negationPreds);
        inference_modules.inference_removal_module((SubLObject)removal_modules_negationpreds.$kw5$REMOVAL_NEGATIONPREDS_CHECK, (SubLObject)removal_modules_negationpreds.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_negationpreds.$kw7$REMOVAL_MAX_NEGATIONPREDS, (SubLObject)removal_modules_negationpreds.$list8);
        preference_modules.inference_preference_module((SubLObject)removal_modules_negationpreds.$kw9$MAX_NEGATION_PREDS_POS, (SubLObject)removal_modules_negationpreds.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_negationpreds.$kw12$REMOVAL_NOT_NEGATIONPREDS_CHECK, (SubLObject)removal_modules_negationpreds.$list13);
        return (SubLObject)removal_modules_negationpreds.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_negationpreds_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_negationpreds_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_negationpreds_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_negationpreds();
        removal_modules_negationpreds.$default_negationpreds_check_cost$ = null;
        removal_modules_negationpreds.$default_not_negationpreds_check_cost$ = null;
        $const0$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED1"), (SubLObject)SubLObjectFactory.makeSymbol("PRED2"));
        $kw4$NEGATIONPREDS = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $kw5$REMOVAL_NEGATIONPREDS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEGATIONPREDS-CHECK");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEGATIONPREDS-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONPREDS-CHECK-EXPAND") });
        $kw7$REMOVAL_MAX_NEGATIONPREDS = SubLObjectFactory.makeKeyword("REMOVAL-MAX-NEGATIONPREDS");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-NEGATIONPREDS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-NEGATIONPREDS-EXPAND") });
        $kw9$MAX_NEGATION_PREDS_POS = SubLObjectFactory.makeKeyword("MAX-NEGATION-PREDS-POS");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw11$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw12$REMOVAL_NOT_NEGATIONPREDS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NOT-NEGATIONPREDS-CHECK");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NOT-NEGATIONPREDS-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-NEGATIONPREDS-CHECK-EXPAND") });
    }
}

/*

	Total time: 87 ms
	
*/