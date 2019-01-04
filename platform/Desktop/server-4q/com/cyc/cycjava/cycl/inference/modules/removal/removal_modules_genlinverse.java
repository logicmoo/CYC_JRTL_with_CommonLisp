package com.cyc.cycjava.cycl.inference.modules.removal;

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

public final class removal_modules_genlinverse extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse";
    public static final String myFingerPrint = "3a30f363df17cbac5a8369fc81aaff29702eff50f806dfce2067532dae017ba7";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 531L)
    private static SubLSymbol $default_genlinverse_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 3577L)
    private static SubLSymbol $default_not_genlinverse_check_cost$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$GENLPREDS;
    private static final SubLSymbol $kw2$REMOVAL_GENLINVERSE_CHECK;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_ALL_GENL_INVERSES;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$REMOVAL_ALL_SPEC_INVERSES;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$MINIMIZE;
    private static final SubLSymbol $kw9$REMOVAL_NOT_GENLINVERSE_CHECK;
    private static final SubLList $list10;
    private static final SubLObject $const11$genlInverse;
    private static final SubLSymbol $kw12$NEG;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 702L)
    public static SubLObject removal_genlinverse_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlinverse.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlinverse.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_genlinverse.UNPROVIDED);
        SubLObject spec_pred = (SubLObject)removal_modules_genlinverse.NIL;
        SubLObject genl_pred = (SubLObject)removal_modules_genlinverse.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlinverse.$list0);
        spec_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlinverse.$list0);
        genl_pred = current.first();
        current = current.rest();
        if (removal_modules_genlinverse.NIL == current) {
            if (removal_modules_genlinverse.NIL != genl_predicates.genl_inverseP(spec_pred, genl_pred, (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genlinverse.$kw1$GENLPREDS, asent, (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED), (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genlinverse.$list0);
        }
        return (SubLObject)removal_modules_genlinverse.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 1286L)
    public static SubLObject removal_all_genl_inverses_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlinverse.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlinverse.NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_genlinverse.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 1523L)
    public static SubLObject removal_all_genl_inverses_iterator(final SubLObject spec_pred) {
        return iteration.new_list_iterator(genl_predicates.all_genl_inverses(spec_pred, (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 2438L)
    public static SubLObject removal_all_spec_inverses_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlinverse.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlinverse.NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genlinverse.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 2675L)
    public static SubLObject removal_all_spec_inverses_iterator(final SubLObject genl_pred) {
        return iteration.new_list_iterator(genl_predicates.all_spec_inverses(genl_pred, (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 3743L)
    public static SubLObject removal_not_genlinverse_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlinverse.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlinverse.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_genlinverse.UNPROVIDED);
        SubLObject spec_pred = (SubLObject)removal_modules_genlinverse.NIL;
        SubLObject genl_pred = (SubLObject)removal_modules_genlinverse.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlinverse.$list0);
        spec_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlinverse.$list0);
        genl_pred = current.first();
        current = current.rest();
        if (removal_modules_genlinverse.NIL == current) {
            if (removal_modules_genlinverse.NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && removal_modules_genlinverse.NIL == genl_predicates.genl_inverseP(spec_pred, genl_pred, (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genlinverse.$kw8$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED), (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED);
            }
            else if (removal_modules_genlinverse.NIL != genl_predicates.not_genl_inverseP(spec_pred, genl_pred, (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genlinverse.$kw1$GENLPREDS, cycl_utilities.negate(asent), (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED), (SubLObject)removal_modules_genlinverse.UNPROVIDED, (SubLObject)removal_modules_genlinverse.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genlinverse.$list0);
        }
        return (SubLObject)removal_modules_genlinverse.NIL;
    }
    
    public static SubLObject declare_removal_modules_genlinverse_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse", "removal_genlinverse_check_expand", "REMOVAL-GENLINVERSE-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse", "removal_all_genl_inverses_cost", "REMOVAL-ALL-GENL-INVERSES-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse", "removal_all_genl_inverses_iterator", "REMOVAL-ALL-GENL-INVERSES-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse", "removal_all_spec_inverses_cost", "REMOVAL-ALL-SPEC-INVERSES-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse", "removal_all_spec_inverses_iterator", "REMOVAL-ALL-SPEC-INVERSES-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse", "removal_not_genlinverse_check_expand", "REMOVAL-NOT-GENLINVERSE-CHECK-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_genlinverse.NIL;
    }
    
    public static SubLObject init_removal_modules_genlinverse_file() {
        removal_modules_genlinverse.$default_genlinverse_check_cost$ = SubLFiles.defparameter("*DEFAULT-GENLINVERSE-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_genlinverse.$default_not_genlinverse_check_cost$ = SubLFiles.defparameter("*DEFAULT-NOT-GENLINVERSE-CHECK-COST*", (SubLObject)removal_modules_genlinverse.TWO_INTEGER);
        return (SubLObject)removal_modules_genlinverse.NIL;
    }
    
    public static SubLObject setup_removal_modules_genlinverse_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlinverse.$kw2$REMOVAL_GENLINVERSE_CHECK, (SubLObject)removal_modules_genlinverse.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlinverse.$kw4$REMOVAL_ALL_GENL_INVERSES, (SubLObject)removal_modules_genlinverse.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlinverse.$kw6$REMOVAL_ALL_SPEC_INVERSES, (SubLObject)removal_modules_genlinverse.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlinverse.$kw9$REMOVAL_NOT_GENLINVERSE_CHECK, (SubLObject)removal_modules_genlinverse.$list10);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_genlinverse.$const11$genlInverse);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_genlinverse.$kw12$NEG, removal_modules_genlinverse.$const11$genlInverse);
        return (SubLObject)removal_modules_genlinverse.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_genlinverse_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_genlinverse_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_genlinverse_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_genlinverse();
        removal_modules_genlinverse.$default_genlinverse_check_cost$ = null;
        removal_modules_genlinverse.$default_not_genlinverse_check_cost$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-PRED"));
        $kw1$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw2$REMOVAL_GENLINVERSE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-GENLINVERSE-CHECK");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-GENLINVERSE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLINVERSE-CHECK-EXPAND") });
        $kw4$REMOVAL_ALL_GENL_INVERSES = SubLObjectFactory.makeKeyword("REMOVAL-ALL-GENL-INVERSES");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-GENL-INVERSES-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALL-GENL-INVERSES-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLPREDS"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlInverse <predicate-fort> <variable>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlInverse #$geographicalSubRegions ?WHAT)") });
        $kw6$REMOVAL_ALL_SPEC_INVERSES = SubLObjectFactory.makeKeyword("REMOVAL-ALL-SPEC-INVERSES");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-SPEC-INVERSES-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-PRED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-PRED"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALL-SPEC-INVERSES-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-PRED"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLPREDS"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlInverse <variable> <predicate-fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlInverse ?WHAT #$inRegion)") });
        $kw8$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw9$REMOVAL_NOT_GENLINVERSE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NOT-GENLINVERSE-CHECK");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NOT-GENLINVERSE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-GENLINVERSE-CHECK-EXPAND") });
        $const11$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $kw12$NEG = SubLObjectFactory.makeKeyword("NEG");
    }
}

/*

	Total time: 86 ms
	
*/