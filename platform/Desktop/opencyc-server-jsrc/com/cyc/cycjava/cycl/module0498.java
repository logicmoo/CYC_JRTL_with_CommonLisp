package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0498 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0498";
    public static final String myFingerPrint = "280c322a755fbbde25db3f34a3a7dd3a917a45f314ed1a9615cf1d35a72385f6";
    private static SubLSymbol $g3777$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    
    public static SubLObject f32183(final SubLObject var1, SubLObject var2) {
        if (var2 == module0498.UNPROVIDED) {
            var2 = (SubLObject)module0498.NIL;
        }
        if (module0498.NIL != module0193.f12105(module0205.f13387(var1, (SubLObject)module0498.UNPROVIDED))) {
            module0347.f23330(f32184(var1), (SubLObject)module0498.UNPROVIDED, (SubLObject)module0498.UNPROVIDED);
        }
        return (SubLObject)module0498.NIL;
    }
    
    public static SubLObject f32184(final SubLObject var1) {
        return module0191.f11990((SubLObject)module0498.$ic4$, var1, module0132.$g1548$.getGlobalValue(), (SubLObject)module0498.$ic5$);
    }
    
    public static SubLObject f32185() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0498", "f32183", "S#35580", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0498", "f32184", "S#35581", 1, 0, false);
        return (SubLObject)module0498.NIL;
    }
    
    public static SubLObject f32186() {
        module0498.$g3777$ = SubLFiles.deflexical("S#35582", (SubLObject)module0498.ZERO_INTEGER);
        return (SubLObject)module0498.NIL;
    }
    
    public static SubLObject f32187() {
        module0340.f22938(module0498.$ic0$);
        module0358.f23771((SubLObject)module0498.$ic1$, module0498.$ic0$, (SubLObject)module0498.ONE_INTEGER);
        module0340.f22941((SubLObject)module0498.$ic2$, (SubLObject)module0498.$ic3$);
        return (SubLObject)module0498.NIL;
    }
    
    public void declareFunctions() {
        f32185();
    }
    
    public void initializeVariables() {
        f32186();
    }
    
    public void runTopLevelForms() {
        f32187();
    }
    
    static {
        me = (SubLFile)new module0498();
        module0498.$g3777$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termChosen"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("REMOVAL-TERM-CHOSEN-POS");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termChosen")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termChosen")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35582", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35580", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termChosen <whatever>)\nimmediately succeeds when ARG1 is fully bound\nimmediately fails when ARG1 is not fully bound."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termChosen #$Dog)\n    (#$termChosen ?WHAT)") });
        $ic4$ = SubLObjectFactory.makeKeyword("CODE");
        $ic5$ = SubLObjectFactory.makeKeyword("TRUE-MON");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0498.class
	Total time: 53 ms
	
	Decompiled with Procyon 0.5.32.
*/