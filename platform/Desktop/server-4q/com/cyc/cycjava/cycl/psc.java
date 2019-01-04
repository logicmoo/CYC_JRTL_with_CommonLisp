package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psc extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.psc";
    public static final String myFingerPrint = "ef5ad1fc4c5aedc9bb00e7911555eb532a0ab27fde14c4516434571388593a77";
    private static final SubLObject $const0$EverythingPSC;
    private static final SubLSymbol $sym1$ALL_MTS_INFERENCE;
    private static final SubLObject $const2$InferencePSC;
    private static final SubLSymbol $sym3$PSC_INFERENCE;
    private static final SubLSymbol $sym4$NORMAL_INFERENCE;
    private static final SubLSymbol $sym5$MT_UNION_INFERENCE;
    private static final SubLSymbol $sym6$ANYTIME_PSC_INFERENCE;
    private static final SubLObject $const7$ProblemSolvingCntxt;
    
    @SubLTranslatedFile.SubL(source = "cycl/psc.lisp", position = 878L)
    public static SubLObject mt_inference_function(final SubLObject mt) {
        if (psc.NIL != kb_utilities.kbeq(mt, psc.$const0$EverythingPSC)) {
            return (SubLObject)psc.$sym1$ALL_MTS_INFERENCE;
        }
        if (psc.NIL != kb_utilities.kbeq(mt, psc.$const2$InferencePSC)) {
            return (SubLObject)psc.$sym3$PSC_INFERENCE;
        }
        if (psc.NIL == el_utilities.possibly_naut_p(mt)) {
            return (SubLObject)psc.$sym4$NORMAL_INFERENCE;
        }
        if (psc.NIL != hlmt.mt_union_naut_p(mt)) {
            return (SubLObject)psc.$sym5$MT_UNION_INFERENCE;
        }
        if (psc.NIL != hlmt.hlmt_with_anytime_psc_p(mt)) {
            return (SubLObject)psc.$sym6$ANYTIME_PSC_INFERENCE;
        }
        return (SubLObject)psc.$sym4$NORMAL_INFERENCE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psc.lisp", position = 1342L)
    public static SubLObject pscP(final SubLObject constant) {
        return isa.isaP(constant, psc.$const7$ProblemSolvingCntxt, mt_vars.$psc_mt$.getGlobalValue(), (SubLObject)psc.UNPROVIDED);
    }
    
    public static SubLObject declare_psc_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psc", "mt_inference_function", "MT-INFERENCE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psc", "pscP", "PSC?", 1, 0, false);
        return (SubLObject)psc.NIL;
    }
    
    public static SubLObject init_psc_file() {
        return (SubLObject)psc.NIL;
    }
    
    public static SubLObject setup_psc_file() {
        return (SubLObject)psc.NIL;
    }
    
    public void declareFunctions() {
        declare_psc_file();
    }
    
    public void initializeVariables() {
        init_psc_file();
    }
    
    public void runTopLevelForms() {
        setup_psc_file();
    }
    
    static {
        me = (SubLFile)new psc();
        $const0$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym1$ALL_MTS_INFERENCE = SubLObjectFactory.makeSymbol("ALL-MTS-INFERENCE");
        $const2$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym3$PSC_INFERENCE = SubLObjectFactory.makeSymbol("PSC-INFERENCE");
        $sym4$NORMAL_INFERENCE = SubLObjectFactory.makeSymbol("NORMAL-INFERENCE");
        $sym5$MT_UNION_INFERENCE = SubLObjectFactory.makeSymbol("MT-UNION-INFERENCE");
        $sym6$ANYTIME_PSC_INFERENCE = SubLObjectFactory.makeSymbol("ANYTIME-PSC-INFERENCE");
        $const7$ProblemSolvingCntxt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProblemSolvingCntxt"));
    }
}

/*

	Total time: 36 ms
	
*/