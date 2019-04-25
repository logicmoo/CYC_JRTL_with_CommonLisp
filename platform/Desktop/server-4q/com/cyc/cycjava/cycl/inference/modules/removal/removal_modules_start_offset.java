package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_start_offset extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_start_offset";
    public static final String myFingerPrint = "8b1870ef90c82e8c15c150b66ddf7099a0f1137297f42360f41b9252f14ad7c4";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 519L)
    private static SubLSymbol $start_offset_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 2669L)
    private static SubLSymbol $start_offset_unify_cost$;
    private static final SubLSymbol $sym0$_START_OFFSET_CHECK_COST_;
    private static final SubLSymbol $kw1$REMOVAL_START_OFFSET_CHECK_POS;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$REMOVAL_START_OFFSET_CHECK_NEG;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$_START_OFFSET_UNIFY_COST_;
    private static final SubLSymbol $kw6$REMOVAL_START_OFFSET_UNIFY_ARG3_POS;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$REMOVAL_START_OFFSET_DELAY;
    private static final SubLList $list9;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 682L)
    public static SubLObject string_has_offsetP(final SubLObject big_string, final SubLObject little_string, final SubLObject offset) {
        return string_utilities.starts_with(string_utilities.substring(big_string, offset, (SubLObject)removal_modules_start_offset.UNPROVIDED), little_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 1607L)
    public static SubLObject string_has_offset_negP(final SubLObject big_string, final SubLObject little_string, final SubLObject offset) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_start_offset.NIL == string_has_offsetP(big_string, little_string, offset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 3642L)
    public static SubLObject start_offset_of_string_iterator(final SubLObject big_string, final SubLObject little_string) {
        return string_utilities.search_all(little_string, big_string, Symbols.symbol_function((SubLObject)removal_modules_start_offset.EQUAL), (SubLObject)removal_modules_start_offset.UNPROVIDED);
    }
    
    public static SubLObject declare_removal_modules_start_offset_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_start_offset", "string_has_offsetP", "STRING-HAS-OFFSET?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_start_offset", "string_has_offset_negP", "STRING-HAS-OFFSET-NEG?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_start_offset", "start_offset_of_string_iterator", "START-OFFSET-OF-STRING-ITERATOR", 2, 0, false);
        return (SubLObject)removal_modules_start_offset.NIL;
    }
    
    public static SubLObject init_removal_modules_start_offset_file() {
        removal_modules_start_offset.$start_offset_check_cost$ = SubLFiles.deflexical("*START-OFFSET-CHECK-COST*", (SubLObject)(maybeDefault((SubLObject)removal_modules_start_offset.$sym0$_START_OFFSET_CHECK_COST_, removal_modules_start_offset.$start_offset_check_cost$, removal_modules_start_offset.ONE_INTEGER)));
        removal_modules_start_offset.$start_offset_unify_cost$ = SubLFiles.deflexical("*START-OFFSET-UNIFY-COST*", (SubLObject)(maybeDefault((SubLObject)removal_modules_start_offset.$sym5$_START_OFFSET_UNIFY_COST_, removal_modules_start_offset.$start_offset_unify_cost$, removal_modules_start_offset.ONE_INTEGER)));
        return (SubLObject)removal_modules_start_offset.NIL;
    }
    
    public static SubLObject setup_removal_modules_start_offset_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_start_offset.$sym0$_START_OFFSET_CHECK_COST_);
        inference_modules.inference_removal_module((SubLObject)removal_modules_start_offset.$kw1$REMOVAL_START_OFFSET_CHECK_POS, (SubLObject)removal_modules_start_offset.$list2);
        inference_modules.inference_removal_module((SubLObject)removal_modules_start_offset.$kw3$REMOVAL_START_OFFSET_CHECK_NEG, (SubLObject)removal_modules_start_offset.$list4);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_start_offset.$sym5$_START_OFFSET_UNIFY_COST_);
        inference_modules.inference_removal_module((SubLObject)removal_modules_start_offset.$kw6$REMOVAL_START_OFFSET_UNIFY_ARG3_POS, (SubLObject)removal_modules_start_offset.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_start_offset.$kw8$REMOVAL_START_OFFSET_DELAY, (SubLObject)removal_modules_start_offset.$list9);
        return (SubLObject)removal_modules_start_offset.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_start_offset_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_start_offset_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_start_offset_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_start_offset();
        removal_modules_start_offset.$start_offset_check_cost$ = null;
        removal_modules_start_offset.$start_offset_unify_cost$ = null;
        $sym0$_START_OFFSET_CHECK_COST_ = SubLObjectFactory.makeSymbol("*START-OFFSET-CHECK-COST*");
        $kw1$REMOVAL_START_OFFSET_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-START-OFFSET-CHECK-POS");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*START-OFFSET-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-HAS-OFFSET?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$startOffset <string> <string> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$startOffset \"food\" \"foo\" 0)") });
        $kw3$REMOVAL_START_OFFSET_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-START-OFFSET-CHECK-NEG");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*START-OFFSET-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-HAS-OFFSET-NEG?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$startOffset <string> <string> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$startOffset \"foo\" \"bar\" 0))") });
        $sym5$_START_OFFSET_UNIFY_COST_ = SubLObjectFactory.makeSymbol("*START-OFFSET-UNIFY-COST*");
        $kw6$REMOVAL_START_OFFSET_UNIFY_ARG3_POS = SubLObjectFactory.makeKeyword("REMOVAL-START-OFFSET-UNIFY-ARG3-POS");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*START-OFFSET-UNIFY-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("START-OFFSET-OF-STRING-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LITTLE-STRING")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$startOffset <string> <string> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$startOffset \"food\" \"foo\" ?N)") });
        $kw8$REMOVAL_START_OFFSET_DELAY = SubLObjectFactory.makeKeyword("REMOVAL-START-OFFSET-DELAY");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startOffset")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("FALSE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Delay module that ensures that \n    (#$startOffset . ARGS)\n    is not worked on if one of first two arguments is not fully bound."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$startOffset ?X ?Y 10)") });
    }
}

/*

	Total time: 91 ms
	
*/