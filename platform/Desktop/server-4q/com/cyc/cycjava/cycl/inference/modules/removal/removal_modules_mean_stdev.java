package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_mean_stdev extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_mean_stdev";
    public static final String myFingerPrint = "d846f69ab60440df89f992b7576d7c8e93bdd5721f6cd6470614c7656f576f02";
    private static final SubLObject $const0$averageOfListElementsWithStandard;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_MEAN_STDEV_UNIFY_ARG1_ARG2;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$REMOVAL_STANDARD_DEVIATION_TUPLE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-mean-stdev.lisp", position = 2272L)
    public static SubLObject removal_standard_deviation_tuple(final SubLObject numbers) {
        return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(number_utilities.standard_deviation_from_population(numbers)));
    }
    
    public static SubLObject declare_removal_modules_mean_stdev_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_mean_stdev", "removal_standard_deviation_tuple", "REMOVAL-STANDARD-DEVIATION-TUPLE", 1, 0, false);
        return (SubLObject)removal_modules_mean_stdev.NIL;
    }
    
    public static SubLObject init_removal_modules_mean_stdev_file() {
        return (SubLObject)removal_modules_mean_stdev.NIL;
    }
    
    public static SubLObject setup_removal_modules_mean_stdev_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_mean_stdev.$const0$averageOfListElementsWithStandard);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_mean_stdev.$kw1$POS, removal_modules_mean_stdev.$const0$averageOfListElementsWithStandard, (SubLObject)removal_modules_mean_stdev.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_mean_stdev.$kw2$REMOVAL_MEAN_STDEV_UNIFY_ARG1_ARG2, (SubLObject)removal_modules_mean_stdev.$list3);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_mean_stdev.$sym4$REMOVAL_STANDARD_DEVIATION_TUPLE);
        return (SubLObject)removal_modules_mean_stdev.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_mean_stdev_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_mean_stdev_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_mean_stdev_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_mean_stdev();
        $const0$averageOfListElementsWithStandard = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("averageOfListElementsWithStandardDeviation"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_MEAN_STDEV_UNIFY_ARG1_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-MEAN-STDEV-UNIFY-ARG1-ARG2");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("averageOfListElementsWithStandardDeviation")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("averageOfListElementsWithStandardDeviation")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_mean_stdev.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("averageOfListElementsWithStandardDeviation")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INPUT-EL-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-LIST-ITEMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INPUT-EL-LIST")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-STANDARD-DEVIATION-TUPLE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STDEV"), (SubLObject)SubLObjectFactory.makeSymbol("AVERAGE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("averageOfListElementsWithStandardDeviation")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INPUT-EL-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("AVERAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STDEV")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$averageOfListElementsWithStandardDeviation :fully-bound :not-fully-bound :not-fully-bound)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$averageOfListElementsWithStandardDeviation (#$TheList 1 2 3 4 5) ?MEAN ?STDEV)\nwill bind ?MEAN to 3, and ?STDEV to 1.4142135623730951.") });
        $sym4$REMOVAL_STANDARD_DEVIATION_TUPLE = SubLObjectFactory.makeSymbol("REMOVAL-STANDARD-DEVIATION-TUPLE");
    }
}

/*

	Total time: 18 ms
	
*/