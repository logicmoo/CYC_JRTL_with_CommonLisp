package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_genlpreds extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds";
    public static final String myFingerPrint = "fb566c69ffa4a5fd606d82e4c1773f9db984b3714a0bffad324c0f512a415e0b";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 525L)
    private static SubLSymbol $default_genlpreds_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 3452L)
    private static SubLSymbol $default_not_genlpreds_check_cost$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$GENLPREDS;
    private static final SubLSymbol $kw2$REMOVAL_GENLPREDS_CHECK;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_ALL_GENLPREDS;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$REMOVAL_ALL_SPEC_PREDS;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$MINIMIZE;
    private static final SubLSymbol $kw9$REMOVAL_NOT_GENLPREDS_CHECK;
    private static final SubLList $list10;
    private static final SubLObject $const11$genlPreds;
    private static final SubLSymbol $kw12$POS;
    private static final SubLSymbol $kw13$NEG;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 688L)
    public static SubLObject removal_genlpreds_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_genlpreds.UNPROVIDED);
        SubLObject spec_pred = (SubLObject)removal_modules_genlpreds.NIL;
        SubLObject genl_pred = (SubLObject)removal_modules_genlpreds.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlpreds.$list0);
        spec_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlpreds.$list0);
        genl_pred = current.first();
        current = current.rest();
        if (removal_modules_genlpreds.NIL == current) {
            if (removal_modules_genlpreds.NIL != genl_predicates.genl_predP(spec_pred, genl_pred, (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genlpreds.$kw1$GENLPREDS, asent, (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED), (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genlpreds.$list0);
        }
        return (SubLObject)removal_modules_genlpreds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 1251L)
    public static SubLObject removal_all_genlpreds_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds.NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_genlpreds.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 1472L)
    public static SubLObject removal_all_genlpreds_iterator(final SubLObject spec_pred) {
        return iteration.new_list_iterator(genl_predicates.all_genl_preds(spec_pred, (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 2349L)
    public static SubLObject removal_all_spec_preds_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds.NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genlpreds.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 2574L)
    public static SubLObject removal_all_spec_preds_iterator(final SubLObject genl_pred) {
        return iteration.new_list_iterator(genl_predicates.all_spec_preds(genl_pred, (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 3610L)
    public static SubLObject removal_not_genlpreds_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlpreds.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlpreds.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_genlpreds.UNPROVIDED);
        SubLObject spec_pred = (SubLObject)removal_modules_genlpreds.NIL;
        SubLObject genl_pred = (SubLObject)removal_modules_genlpreds.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlpreds.$list0);
        spec_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlpreds.$list0);
        genl_pred = current.first();
        current = current.rest();
        if (removal_modules_genlpreds.NIL == current) {
            if (removal_modules_genlpreds.NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && removal_modules_genlpreds.NIL == genl_predicates.genl_predP(spec_pred, genl_pred, (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genlpreds.$kw8$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED), (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED);
            }
            else if (removal_modules_genlpreds.NIL != genl_predicates.not_genl_predP(spec_pred, genl_pred, (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genlpreds.$kw1$GENLPREDS, cycl_utilities.negate(asent), (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED), (SubLObject)removal_modules_genlpreds.UNPROVIDED, (SubLObject)removal_modules_genlpreds.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genlpreds.$list0);
        }
        return (SubLObject)removal_modules_genlpreds.NIL;
    }
    
    public static SubLObject declare_removal_modules_genlpreds_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds", "removal_genlpreds_check_expand", "REMOVAL-GENLPREDS-CHECK-EXPAND", 1, 1, false);
        new $removal_genlpreds_check_expand$UnaryFunction();
        new $removal_genlpreds_check_expand$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds", "removal_all_genlpreds_cost", "REMOVAL-ALL-GENLPREDS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds", "removal_all_genlpreds_iterator", "REMOVAL-ALL-GENLPREDS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds", "removal_all_spec_preds_cost", "REMOVAL-ALL-SPEC-PREDS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds", "removal_all_spec_preds_iterator", "REMOVAL-ALL-SPEC-PREDS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds", "removal_not_genlpreds_check_expand", "REMOVAL-NOT-GENLPREDS-CHECK-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_genlpreds.NIL;
    }
    
    public static SubLObject init_removal_modules_genlpreds_file() {
        removal_modules_genlpreds.$default_genlpreds_check_cost$ = SubLFiles.defparameter("*DEFAULT-GENLPREDS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_genlpreds.$default_not_genlpreds_check_cost$ = SubLFiles.defparameter("*DEFAULT-NOT-GENLPREDS-CHECK-COST*", (SubLObject)removal_modules_genlpreds.TWO_INTEGER);
        return (SubLObject)removal_modules_genlpreds.NIL;
    }
    
    public static SubLObject setup_removal_modules_genlpreds_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds.$kw2$REMOVAL_GENLPREDS_CHECK, (SubLObject)removal_modules_genlpreds.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds.$kw4$REMOVAL_ALL_GENLPREDS, (SubLObject)removal_modules_genlpreds.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds.$kw6$REMOVAL_ALL_SPEC_PREDS, (SubLObject)removal_modules_genlpreds.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlpreds.$kw9$REMOVAL_NOT_GENLPREDS_CHECK, (SubLObject)removal_modules_genlpreds.$list10);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_genlpreds.$const11$genlPreds);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_genlpreds.$kw12$POS, removal_modules_genlpreds.$const11$genlPreds);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_genlpreds.$kw13$NEG, removal_modules_genlpreds.$const11$genlPreds);
        return (SubLObject)removal_modules_genlpreds.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_genlpreds_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_genlpreds_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_genlpreds_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_genlpreds();
        removal_modules_genlpreds.$default_genlpreds_check_cost$ = null;
        removal_modules_genlpreds.$default_not_genlpreds_check_cost$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-PRED"));
        $kw1$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw2$REMOVAL_GENLPREDS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-GENLPREDS-CHECK");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-GENLPREDS-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLPREDS-CHECK-EXPAND") });
        $kw4$REMOVAL_ALL_GENLPREDS = SubLObjectFactory.makeKeyword("REMOVAL-ALL-GENLPREDS");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-GENLPREDS-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALL-GENLPREDS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLPREDS"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlPreds <predicate-fort> <variable>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlPreds #$performedBy ?WHAT)") });
        $kw6$REMOVAL_ALL_SPEC_PREDS = SubLObjectFactory.makeKeyword("REMOVAL-ALL-SPEC-PREDS");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-SPEC-PREDS-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-PRED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-PRED"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALL-SPEC-PREDS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-PRED"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLPREDS"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlPreds <variable> <predicate-fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlPreds ?WHAT #$performedBy)") });
        $kw8$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw9$REMOVAL_NOT_GENLPREDS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NOT-GENLPREDS-CHECK");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NOT-GENLPREDS-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-GENLPREDS-CHECK-EXPAND") });
        $const11$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw12$POS = SubLObjectFactory.makeKeyword("POS");
        $kw13$NEG = SubLObjectFactory.makeKeyword("NEG");
    }
    
    public static final class $removal_genlpreds_check_expand$UnaryFunction extends UnaryFunction
    {
        public $removal_genlpreds_check_expand$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-CHECK-EXPAND"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_genlpreds.removal_genlpreds_check_expand(arg1, (SubLObject)$removal_genlpreds_check_expand$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_genlpreds_check_expand$BinaryFunction extends BinaryFunction
    {
        public $removal_genlpreds_check_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-CHECK-EXPAND"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_genlpreds.removal_genlpreds_check_expand(arg1, arg2);
        }
    }
}

/*

	Total time: 89 ms
	
*/