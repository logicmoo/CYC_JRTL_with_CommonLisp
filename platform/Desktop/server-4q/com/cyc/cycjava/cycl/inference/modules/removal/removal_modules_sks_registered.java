package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_sks_registered extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sks_registered";
    public static final String myFingerPrint = "c311cc18147476e0224b980fea02bde503dcc3d77612f84d0f7a3956bbdd41a6";
    private static final SubLObject $const0$sksRegistered;
    private static final SubLSymbol $kw1$REMOVAL_SKS_REGISTERED_CHECK_POS;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$REMOVAL_SKS_REGISTERED_CHECK_NEG;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$REMOVAL_SKS_REGISTERED_UNIFY_POS;
    private static final SubLList $list6;
    
    public static SubLObject declare_removal_modules_sks_registered_file() {
        return (SubLObject)removal_modules_sks_registered.NIL;
    }
    
    public static SubLObject init_removal_modules_sks_registered_file() {
        return (SubLObject)removal_modules_sks_registered.NIL;
    }
    
    public static SubLObject setup_removal_modules_sks_registered_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_sks_registered.$const0$sksRegistered);
        inference_modules.inference_removal_module((SubLObject)removal_modules_sks_registered.$kw1$REMOVAL_SKS_REGISTERED_CHECK_POS, (SubLObject)removal_modules_sks_registered.$list2);
        inference_modules.inference_removal_module((SubLObject)removal_modules_sks_registered.$kw3$REMOVAL_SKS_REGISTERED_CHECK_NEG, (SubLObject)removal_modules_sks_registered.$list4);
        inference_modules.inference_removal_module((SubLObject)removal_modules_sks_registered.$kw5$REMOVAL_SKS_REGISTERED_UNIFY_POS, (SubLObject)removal_modules_sks_registered.$list6);
        return (SubLObject)removal_modules_sks_registered.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_sks_registered_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_sks_registered_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_sks_registered_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_sks_registered();
        $const0$sksRegistered = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered"));
        $kw1$REMOVAL_SKS_REGISTERED_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-SKS-REGISTERED-CHECK-POS");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_sks_registered.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sksRegistered <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$sksRegistered #$BLN-Example1-KS)") });
        $kw3$REMOVAL_SKS_REGISTERED_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-SKS-REGISTERED-CHECK-NEG");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_sks_registered.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$sksRegistered <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$sksRegistered #$BLN-Example1-KS))") });
        $kw5$REMOVAL_SKS_REGISTERED_UNIFY_POS = SubLObjectFactory.makeKeyword("REMOVAL-SKS-REGISTERED-UNIFY-POS");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE")), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sksRegistered <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$sksRegistered ?SOURCE)") });
    }
}

/*

	Total time: 69 ms
	
*/