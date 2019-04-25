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

public final class removal_modules_negationinverse extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationinverse";
    public static final String myFingerPrint = "a3a4a1aaec237688d9b1cafcedcaf431dbe23d7f2f539eceec9ec3134c1933c8";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 732L)
    private static SubLSymbol $default_negationinverse_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 3422L)
    private static SubLSymbol $default_not_negationinverse_check_cost$;
    private static final SubLObject $const0$negationInverse;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$NEGATIONPREDS;
    private static final SubLSymbol $kw5$REMOVAL_NEGATIONINVERSE_CHECK;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_MAX_NEGATIONINVERSE;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$MAX_NEGATION_INVERSE_POS;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$MINIMIZE;
    private static final SubLSymbol $kw12$REMOVAL_NOT_NEGATIONINVERSE_CHECK;
    private static final SubLList $list13;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 919L)
    public static SubLObject removal_negationinverse_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_negationinverse.UNPROVIDED) {
            sense = (SubLObject)removal_modules_negationinverse.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = el_utilities.literal_args(literal, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
        SubLObject pred1 = (SubLObject)removal_modules_negationinverse.NIL;
        SubLObject pred2 = (SubLObject)removal_modules_negationinverse.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_negationinverse.$list3);
        pred1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_negationinverse.$list3);
        pred2 = current.first();
        current = current.rest();
        if (removal_modules_negationinverse.NIL == current) {
            if (removal_modules_negationinverse.NIL != negation_predicate.negation_inverseP(pred1, pred2, (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_negationinverse.$const0$negationInverse, (SubLObject)ConsesLow.list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_negationinverse.$kw4$NEGATIONPREDS, hl_support_formula, (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED), (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_negationinverse.$list3);
        }
        return (SubLObject)removal_modules_negationinverse.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 1620L)
    public static SubLObject removal_max_negationinverse_cost(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_negationinverse.UNPROVIDED) {
            sense = (SubLObject)removal_modules_negationinverse.NIL;
        }
        SubLObject v_term = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
        if (removal_modules_negationinverse.NIL == forts.fort_p(v_term)) {
            v_term = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
        }
        return cardinality_estimates.genl_cardinality(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 1956L)
    public static SubLObject removal_max_negationinverse_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_negationinverse.UNPROVIDED) {
            sense = (SubLObject)removal_modules_negationinverse.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
        final SubLObject term2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
        final SubLObject variable = (removal_modules_negationinverse.NIL != variables.variable_p(term1)) ? term1 : term2;
        final SubLObject fort = (removal_modules_negationinverse.NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        final SubLObject disjoint_terms = cdolist_list_var = negation_predicate.max_negation_inverses(fort, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
        SubLObject disjoint_term = (SubLObject)removal_modules_negationinverse.NIL;
        disjoint_term = cdolist_list_var.first();
        while (removal_modules_negationinverse.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, (SubLObject)removal_modules_negationinverse.T, (SubLObject)removal_modules_negationinverse.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_negationinverse.NIL != v_bindings) {
                final SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_negationinverse.$const0$negationInverse, el_utilities.literal_args(subst_literal, (SubLObject)removal_modules_negationinverse.UNPROVIDED));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_negationinverse.$kw4$NEGATIONPREDS, hl_support_formula, (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_negationinverse.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 3604L)
    public static SubLObject removal_not_negationinverse_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_negationinverse.UNPROVIDED) {
            sense = (SubLObject)removal_modules_negationinverse.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = el_utilities.literal_args(literal, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
        SubLObject pred1 = (SubLObject)removal_modules_negationinverse.NIL;
        SubLObject pred2 = (SubLObject)removal_modules_negationinverse.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_negationinverse.$list3);
        pred1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_negationinverse.$list3);
        pred2 = current.first();
        current = current.rest();
        if (removal_modules_negationinverse.NIL == current) {
            if (removal_modules_negationinverse.NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && removal_modules_negationinverse.NIL == negation_predicate.negation_inverseP(pred1, pred2, (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_negationinverse.$const0$negationInverse, (SubLObject)ConsesLow.list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_negationinverse.$kw11$MINIMIZE, cycl_utilities.negate(hl_support_formula), (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED), (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
            }
            else if (removal_modules_negationinverse.NIL != negation_predicate.not_negation_inverseP(pred1, pred2, (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal(removal_modules_negationinverse.$const0$negationInverse, (SubLObject)ConsesLow.list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_negationinverse.$kw4$NEGATIONPREDS, cycl_utilities.negate(hl_support_formula), (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED), (SubLObject)removal_modules_negationinverse.UNPROVIDED, (SubLObject)removal_modules_negationinverse.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_negationinverse.$list3);
        }
        return (SubLObject)removal_modules_negationinverse.NIL;
    }
    
    public static SubLObject declare_removal_modules_negationinverse_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationinverse", "removal_negationinverse_check_expand", "REMOVAL-NEGATIONINVERSE-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationinverse", "removal_max_negationinverse_cost", "REMOVAL-MAX-NEGATIONINVERSE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationinverse", "removal_max_negationinverse_expand", "REMOVAL-MAX-NEGATIONINVERSE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationinverse", "removal_not_negationinverse_check_expand", "REMOVAL-NOT-NEGATIONINVERSE-CHECK-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_negationinverse.NIL;
    }
    
    public static SubLObject init_removal_modules_negationinverse_file() {
        removal_modules_negationinverse.$default_negationinverse_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEGATIONINVERSE-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_negationinverse.$default_not_negationinverse_check_cost$ = SubLFiles.defparameter("*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST*", (SubLObject)removal_modules_negationinverse.TWO_INTEGER);
        return (SubLObject)removal_modules_negationinverse.NIL;
    }
    
    public static SubLObject setup_removal_modules_negationinverse_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_negationinverse.$const0$negationInverse);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_negationinverse.$kw1$POS, removal_modules_negationinverse.$const0$negationInverse);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_negationinverse.$kw2$NEG, removal_modules_negationinverse.$const0$negationInverse);
        inference_modules.inference_removal_module((SubLObject)removal_modules_negationinverse.$kw5$REMOVAL_NEGATIONINVERSE_CHECK, (SubLObject)removal_modules_negationinverse.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_negationinverse.$kw7$REMOVAL_MAX_NEGATIONINVERSE, (SubLObject)removal_modules_negationinverse.$list8);
        preference_modules.inference_preference_module((SubLObject)removal_modules_negationinverse.$kw9$MAX_NEGATION_INVERSE_POS, (SubLObject)removal_modules_negationinverse.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_negationinverse.$kw12$REMOVAL_NOT_NEGATIONINVERSE_CHECK, (SubLObject)removal_modules_negationinverse.$list13);
        return (SubLObject)removal_modules_negationinverse.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_negationinverse_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_negationinverse_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_negationinverse_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_negationinverse();
        removal_modules_negationinverse.$default_negationinverse_check_cost$ = null;
        removal_modules_negationinverse.$default_not_negationinverse_check_cost$ = null;
        $const0$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED1"), (SubLObject)SubLObjectFactory.makeSymbol("PRED2"));
        $kw4$NEGATIONPREDS = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $kw5$REMOVAL_NEGATIONINVERSE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEGATIONINVERSE-CHECK");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEGATIONINVERSE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NEGATIONINVERSE-CHECK-EXPAND") });
        $kw7$REMOVAL_MAX_NEGATIONINVERSE = SubLObjectFactory.makeKeyword("REMOVAL-MAX-NEGATIONINVERSE");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-NEGATIONINVERSE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-NEGATIONINVERSE-EXPAND") });
        $kw9$MAX_NEGATION_INVERSE_POS = SubLObjectFactory.makeKeyword("MAX-NEGATION-INVERSE-POS");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw11$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw12$REMOVAL_NOT_NEGATIONINVERSE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NOT-NEGATIONINVERSE-CHECK");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-NEGATIONINVERSE-CHECK-EXPAND") });
    }
}

/*

	Total time: 92 ms
	
*/