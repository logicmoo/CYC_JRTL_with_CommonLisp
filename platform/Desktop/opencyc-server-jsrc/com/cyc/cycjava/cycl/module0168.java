package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0168 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0168";
    public static final String myFingerPrint = "5428f6869a9e2f4750cc4ab1284d70a98ca32988ae37fbd7531d50bead379958";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLString $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    
    public static SubLObject f10836(final SubLObject var1) {
        assert module0168.NIL != module0228.f15225(var1) : var1;
        oc_hl_interface_infrastructure.f8308();
        oc_hl_interface_infrastructure.f8341((SubLObject)module0168.$ic1$, var1, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED);
        if (module0168.NIL != oc_hl_interface_infrastructure.f8289()) {
            final SubLObject var2 = module0018.$g573$.getGlobalValue();
            SubLObject var3 = (SubLObject)module0168.NIL;
            try {
                var3 = Locks.seize_lock(var2);
                final SubLObject var4 = (module0168.NIL != oc_hl_interface_infrastructure.f8288()) ? f10837(var1) : f10838(var1);
                module0197.f12260(var1);
                oc_hl_interface_infrastructure.f8309();
                return var4;
            }
            finally {
                if (module0168.NIL != var3) {
                    Locks.release_lock(var2);
                }
            }
        }
        return (SubLObject)module0168.NIL;
    }
    
    public static SubLObject f10837(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0168.$ic7$, module0035.f2241(var1)));
        SubLObject var4 = (SubLObject)module0168.NIL;
        final SubLObject var5 = oc_hl_interface_infrastructure.$g1483$.currentBinding(var2);
        try {
            oc_hl_interface_infrastructure.$g1483$.bind((SubLObject)module0168.T, var2);
            var4 = module0171.f10906(var3);
            if (module0168.NIL != oc_hl_interface_infrastructure.f8287()) {
                module0171.f10904(var4, var3, var1);
            }
        }
        finally {
            oc_hl_interface_infrastructure.$g1483$.rebind(var5, var2);
        }
        return var4;
    }
    
    public static SubLObject f10838(final SubLObject var1) {
        final SubLObject var2 = module0171.f10903(var1);
        return module0167.f10832(var2);
    }
    
    public static SubLObject f10839(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0168.NIL != module0167.f10813(var4) : var4;
        SubLObject var6 = (SubLObject)module0168.NIL;
        oc_hl_interface_infrastructure.f8308();
        oc_hl_interface_infrastructure.f8341((SubLObject)module0168.$ic9$, var4, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED, (SubLObject)module0168.UNPROVIDED);
        if (module0168.NIL != oc_hl_interface_infrastructure.f8288()) {
            var6 = oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0168.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0168.$ic10$, var4)));
        }
        if (module0168.NIL != oc_hl_interface_infrastructure.f8287()) {
            final SubLObject var7 = oc_hl_interface_infrastructure.$g1483$.currentBinding(var5);
            try {
                oc_hl_interface_infrastructure.$g1483$.bind((SubLObject)module0168.T, var5);
                final SubLObject var8 = module0018.$g573$.getGlobalValue();
                SubLObject var9 = (SubLObject)module0168.NIL;
                try {
                    var9 = Locks.seize_lock(var8);
                    module0197.f12262(var4);
                    return module0171.f10911(var4);
                }
                finally {
                    if (module0168.NIL != var9) {
                        Locks.release_lock(var8);
                    }
                }
            }
            finally {
                oc_hl_interface_infrastructure.$g1483$.rebind(var7, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f10840(final SubLObject var4) {
        assert module0168.NIL != module0167.f10813(var4) : var4;
        if (module0168.NIL != oc_hl_interface_infrastructure.f8291()) {
            return oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0168.$ic15$, (SubLObject)ConsesLow.list((SubLObject)module0168.$ic10$, var4)));
        }
        return module0171.f10899(var4);
    }
    
    public static SubLObject f10841(final SubLObject var1) {
        assert module0168.NIL != module0202.f12659(var1) : var1;
        if (module0168.NIL != oc_hl_interface_infrastructure.f8291()) {
            return oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0168.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0168.$ic10$, var1)));
        }
        return module0171.f10900(var1);
    }
    
    public static SubLObject f10842() {
        return module0171.f10908();
    }
    
    public static SubLObject f10843() {
        return f10842();
    }
    
    public static SubLObject f10844() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0168", "f10836", "KB-CREATE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0168", "f10837", "S#13660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0168", "f10838", "S#13661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0168", "f10839", "KB-REMOVE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0168", "f10840", "KB-NART-HL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0168", "f10841", "KB-LOOKUP-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0168", "f10842", "S#13662", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0168", "f10843", "S#13663", 0, 0, false);
        return (SubLObject)module0168.NIL;
    }
    
    public static SubLObject f10845() {
        return (SubLObject)module0168.NIL;
    }
    
    public static SubLObject f10846() {
        module0012.f368((SubLObject)module0168.$ic1$, (SubLObject)module0168.$ic3$, (SubLObject)module0168.$ic4$, (SubLObject)module0168.$ic5$, (SubLObject)module0168.$ic6$);
        module0012.f368((SubLObject)module0168.$ic9$, (SubLObject)module0168.$ic11$, (SubLObject)module0168.$ic12$, (SubLObject)module0168.$ic13$, (SubLObject)module0168.$ic14$);
        module0012.f368((SubLObject)module0168.$ic15$, (SubLObject)module0168.$ic11$, (SubLObject)module0168.$ic16$, (SubLObject)module0168.$ic13$, (SubLObject)module0168.$ic17$);
        module0012.f368((SubLObject)module0168.$ic19$, (SubLObject)module0168.$ic3$, (SubLObject)module0168.$ic20$, (SubLObject)module0168.$ic21$, (SubLObject)module0168.$ic22$);
        return (SubLObject)module0168.NIL;
    }
    
    public void declareFunctions() {
        f10844();
    }
    
    public void initializeVariables() {
        f10845();
    }
    
    public void runTopLevelForms() {
        f10846();
    }
    
    static {
        me = (SubLFile)new module0168();
        $ic0$ = SubLObjectFactory.makeSymbol("S#13650", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("KB-CREATE-NART");
        $ic2$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-HL-FORMULA"));
        $ic4$ = SubLObjectFactory.makeString("Create a new NART to implement NART-HL-FORMULA.");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-HL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("S#13650", "CYC")));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-P"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#13654", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("NART-P");
        $ic9$ = SubLObjectFactory.makeSymbol("KB-REMOVE-NART");
        $ic10$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13601", "CYC"));
        $ic12$ = SubLObjectFactory.makeString("Remove NART from the KB.");
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13601", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $ic15$ = SubLObjectFactory.makeSymbol("KB-NART-HL-FORMULA");
        $ic16$ = SubLObjectFactory.makeString("Return the hl formula of this NART.");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")));
        $ic18$ = SubLObjectFactory.makeSymbol("S#12761", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("KB-LOOKUP-NART");
        $ic20$ = SubLObjectFactory.makeString("Return the NART implementing NART-HL-FORMULA, or NIL if none is present.\n   No substitutions for sub-NARTs are performed.");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-HL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("S#12761", "CYC")));
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0168.class
	Total time: 85 ms
	
	Decompiled with Procyon 0.5.32.
*/