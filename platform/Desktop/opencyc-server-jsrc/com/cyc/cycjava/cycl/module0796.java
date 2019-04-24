package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0796 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0796";
    public static final String myFingerPrint = "f1c4b962d02df577b7c50620ca05715a576374ffde6fcf1c77611b114b5bee9d";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    
    public static SubLObject f50932(final SubLObject var1, SubLObject var2) {
        if (var2 == module0796.UNPROVIDED) {
            var2 = module0796.$ic0$;
        }
        assert module0796.NIL != module0206.f13425(var1) : var1;
        assert module0796.NIL != module0161.f10481(var2) : var2;
        return module0274.f18199(var1, var2, (SubLObject)module0796.$ic3$);
    }
    
    public static SubLObject f50933(final SubLObject var1, SubLObject var2) {
        if (var2 == module0796.UNPROVIDED) {
            var2 = module0796.$ic0$;
        }
        assert module0796.NIL != module0206.f13425(var1) : var1;
        assert module0796.NIL != module0161.f10481(var2) : var2;
        return module0274.f18195(var1, var2, (SubLObject)module0796.$ic3$);
    }
    
    public static SubLObject f50934() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0796", "f50932", "OPENCYC-EXPLANATION-OF-WHY-NOT-WFF-ASSERT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0796", "f50933", "OPENCYC-EXPLANATION-OF-WHY-NOT-WFF", 1, 1, false);
        return (SubLObject)module0796.NIL;
    }
    
    public static SubLObject f50935() {
        return (SubLObject)module0796.NIL;
    }
    
    public static SubLObject f50936() {
        module0012.f368((SubLObject)module0796.$ic4$, (SubLObject)module0796.$ic5$, (SubLObject)module0796.$ic6$, (SubLObject)module0796.$ic7$, (SubLObject)module0796.$ic8$);
        module0012.f368((SubLObject)module0796.$ic9$, (SubLObject)module0796.$ic5$, (SubLObject)module0796.$ic6$, (SubLObject)module0796.$ic7$, (SubLObject)module0796.$ic8$);
        return (SubLObject)module0796.NIL;
    }
    
    public void declareFunctions() {
        f50934();
    }
    
    public void initializeVariables() {
        f50935();
    }
    
    public void runTopLevelForms() {
        f50936();
    }
    
    static {
        me = (SubLFile)new module0796();
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $ic1$ = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $ic2$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IO-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("NL"));
        $ic4$ = SubLObjectFactory.makeSymbol("OPENCYC-EXPLANATION-OF-WHY-NOT-WFF-ASSERT");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"))));
        $ic6$ = SubLObjectFactory.makeString("Returns an English explanation of why SENTENCE is not assertible in MT.  An assertible sentence results in a NIL return value.");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51575", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("OPENCYC-EXPLANATION-OF-WHY-NOT-WFF");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0796.class
	Total time: 52 ms
	
	Decompiled with Procyon 0.5.32.
*/