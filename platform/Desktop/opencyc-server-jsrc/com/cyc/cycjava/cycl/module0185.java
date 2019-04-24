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

public final class module0185 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0185";
    public static final String myFingerPrint = "fb73797e8eeac65ec7b0f3425d6011bdbf50e864e03175f1c525df38245c3484";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLString $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLString $ic37$;
    private static final SubLList $ic38$;
    
    public static SubLObject f11679(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        assert module0185.NIL != module0191.f11950(var1) : var1;
        assert module0185.NIL != module0191.f11993(var2) : var2;
        assert module0185.NIL != module0130.f8511(var3) : var3;
        assert module0185.NIL != module0130.f8507(var4) : var4;
        module0122.f8308();
        module0122.f8341((SubLObject)module0185.$ic4$, var1, var2, var3, var4, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED);
        if (module0185.NIL != module0122.f8289()) {
            final SubLObject var5 = module0018.$g573$.getGlobalValue();
            SubLObject var6 = (SubLObject)module0185.NIL;
            try {
                var6 = Locks.seize_lock(var5);
                final SubLObject var7 = (module0185.NIL != module0122.f8288()) ? f11680(var1, var2, var3, var4) : f11681(var1, var2, var3, var4);
                module0197.f12312(var1, var2, var3, var4);
                module0122.f8309();
                return var7;
            }
            finally {
                if (module0185.NIL != var6) {
                    Locks.release_lock(var5);
                }
            }
        }
        return (SubLObject)module0185.NIL;
    }
    
    public static SubLObject f11680(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0122.f8304((SubLObject)ConsesLow.list((SubLObject)module0185.$ic10$, module0035.f2241(var1), module0035.f2241(var2), module0035.f2241(var3), module0035.f2241(var4)));
        SubLObject var7 = (SubLObject)module0185.NIL;
        final SubLObject var8 = module0122.$g1483$.currentBinding(var5);
        try {
            module0122.$g1483$.bind((SubLObject)module0185.T, var5);
            var7 = module0187.f11751(var6);
            if (module0185.NIL != module0122.f8287()) {
                module0187.f11748(var7, var6, var1, var2, var3, var4);
            }
        }
        finally {
            module0122.$g1483$.rebind(var8, var5);
        }
        return var7;
    }
    
    public static SubLObject f11681(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = module0187.f11747(var1, var2, var3, var4);
        return module0184.f11675(var5);
    }
    
    public static SubLObject f11682(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert module0185.NIL != module0184.f11659(var7) : var7;
        SubLObject var9 = (SubLObject)module0185.NIL;
        module0122.f8308();
        module0122.f8341((SubLObject)module0185.$ic12$, var7, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED);
        if (module0185.NIL != module0122.f8288()) {
            var9 = module0122.f8304((SubLObject)ConsesLow.list((SubLObject)module0185.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var7)));
        }
        if (module0185.NIL != module0122.f8287()) {
            final SubLObject var10 = module0122.$g1483$.currentBinding(var8);
            try {
                module0122.$g1483$.bind((SubLObject)module0185.T, var8);
                final SubLObject var11 = module0018.$g573$.getGlobalValue();
                SubLObject var12 = (SubLObject)module0185.NIL;
                try {
                    var12 = Locks.seize_lock(var11);
                    module0197.f12316(var7);
                    module0187.f11755(var7);
                    final SubLObject var13 = module0188.f11781(var7);
                    if (module0185.NIL != module0174.f11035(var13)) {
                        if (module0185.NIL != module0174.f11041(var13, (SubLObject)module0185.UNPROVIDED)) {
                            module0177.f11268(var13, var7);
                        }
                    }
                    else if (module0185.NIL != module0191.f11952(var13)) {
                        final SubLObject var14 = module0183.f11552(var13);
                        if (module0185.NIL != var14) {
                            module0182.f11520(var14);
                        }
                    }
                    return module0187.f11754(var7);
                }
                finally {
                    if (module0185.NIL != var12) {
                        Locks.release_lock(var11);
                    }
                }
            }
            finally {
                module0122.$g1483$.rebind(var10, var8);
            }
        }
        return var9;
    }
    
    public static SubLObject f11683(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        assert module0185.NIL != module0191.f11950(var1) : var1;
        assert module0185.NIL != module0191.f11993(var2) : var2;
        assert module0185.NIL != module0130.f8511(var3) : var3;
        if (module0185.NIL != module0122.f8291()) {
            return module0122.f8304((SubLObject)ConsesLow.list((SubLObject)module0185.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var1), (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var2), (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var3)));
        }
        return module0187.f11758(var1, var2, var3);
    }
    
    public static SubLObject f11684(final SubLObject var7) {
        assert module0185.NIL != module0184.f11659(var7) : var7;
        if (module0185.NIL != module0122.f8291()) {
            return module0122.f8304((SubLObject)ConsesLow.list((SubLObject)module0185.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var7)));
        }
        return module0187.f11760(var7);
    }
    
    public static SubLObject f11685(final SubLObject var7) {
        assert module0185.NIL != module0184.f11659(var7) : var7;
        if (module0185.NIL != module0122.f8291()) {
            return module0122.f8304((SubLObject)ConsesLow.list((SubLObject)module0185.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var7)));
        }
        return module0187.f11753(var7);
    }
    
    public static SubLObject f11686(final SubLObject var7) {
        assert module0185.NIL != module0184.f11659(var7) : var7;
        if (module0185.NIL != module0122.f8291()) {
            return module0122.f8304((SubLObject)ConsesLow.list((SubLObject)module0185.$ic29$, (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var7)));
        }
        return module0187.f11761(var7);
    }
    
    public static SubLObject f11687(final SubLObject var7) {
        assert module0185.NIL != module0184.f11659(var7) : var7;
        if (module0185.NIL != module0122.f8291()) {
            return module0122.f8304((SubLObject)ConsesLow.list((SubLObject)module0185.$ic32$, (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var7)));
        }
        return module0187.f11762(var7);
    }
    
    public static SubLObject f11688(final SubLObject var7, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        assert module0185.NIL != module0184.f11659(var7) : var7;
        assert module0185.NIL != module0130.f8507(var16) : var16;
        SubLObject var18 = (SubLObject)module0185.NIL;
        module0122.f8308();
        module0122.f8341((SubLObject)module0185.$ic35$, var7, var16, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED, (SubLObject)module0185.UNPROVIDED);
        if (module0185.NIL != module0122.f8288()) {
            var18 = module0122.f8304((SubLObject)ConsesLow.list((SubLObject)module0185.$ic35$, (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var7), (SubLObject)ConsesLow.list((SubLObject)module0185.$ic13$, var16)));
        }
        if (module0185.NIL != module0122.f8287()) {
            final SubLObject var19 = module0122.$g1483$.currentBinding(var17);
            try {
                module0122.$g1483$.bind((SubLObject)module0185.T, var17);
                final SubLObject var20 = module0018.$g573$.getGlobalValue();
                SubLObject var21 = (SubLObject)module0185.NIL;
                try {
                    var21 = Locks.seize_lock(var20);
                    final SubLObject var22 = module0191.f11928(var7);
                    final SubLObject var20_21 = module0187.f11756(var7, var16);
                    module0197.f12318(var7, var22, var16);
                    return var20_21;
                }
                finally {
                    if (module0185.NIL != var21) {
                        Locks.release_lock(var20);
                    }
                }
            }
            finally {
                module0122.$g1483$.rebind(var19, var17);
            }
        }
        return var18;
    }
    
    public static SubLObject f11689() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11679", "KB-CREATE-DEDUCTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11680", "S#14508", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11681", "S#14509", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11682", "KB-REMOVE-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11683", "KB-LOOKUP-DEDUCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11684", "KB-DEDUCTION-SUPPORTED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11685", "KB-DEDUCTION-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11686", "KB-DEDUCTION-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11687", "KB-DEDUCTION-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0185", "f11688", "KB-SET-DEDUCTION-STRENGTH", 2, 0, false);
        return (SubLObject)module0185.NIL;
    }
    
    public static SubLObject f11690() {
        return (SubLObject)module0185.NIL;
    }
    
    public static SubLObject f11691() {
        module0012.f368((SubLObject)module0185.$ic4$, (SubLObject)module0185.$ic6$, (SubLObject)module0185.$ic7$, (SubLObject)module0185.$ic8$, (SubLObject)module0185.$ic9$);
        module0012.f368((SubLObject)module0185.$ic12$, (SubLObject)module0185.$ic14$, (SubLObject)module0185.$ic15$, (SubLObject)module0185.$ic16$, (SubLObject)module0185.$ic17$);
        module0012.f368((SubLObject)module0185.$ic18$, (SubLObject)module0185.$ic19$, (SubLObject)module0185.$ic20$, (SubLObject)module0185.$ic21$, (SubLObject)module0185.$ic22$);
        module0012.f368((SubLObject)module0185.$ic23$, (SubLObject)module0185.$ic14$, (SubLObject)module0185.$ic24$, (SubLObject)module0185.$ic16$, (SubLObject)module0185.$ic25$);
        module0012.f368((SubLObject)module0185.$ic26$, (SubLObject)module0185.$ic14$, (SubLObject)module0185.$ic27$, (SubLObject)module0185.$ic16$, (SubLObject)module0185.$ic28$);
        module0012.f368((SubLObject)module0185.$ic29$, (SubLObject)module0185.$ic14$, (SubLObject)module0185.$ic30$, (SubLObject)module0185.$ic16$, (SubLObject)module0185.$ic31$);
        module0012.f368((SubLObject)module0185.$ic32$, (SubLObject)module0185.$ic14$, (SubLObject)module0185.$ic33$, (SubLObject)module0185.$ic16$, (SubLObject)module0185.$ic34$);
        module0012.f368((SubLObject)module0185.$ic35$, (SubLObject)module0185.$ic36$, (SubLObject)module0185.$ic37$, (SubLObject)module0185.$ic38$, (SubLObject)module0185.$ic9$);
        return (SubLObject)module0185.NIL;
    }
    
    public void declareFunctions() {
        f11689();
    }
    
    public void initializeVariables() {
        f11690();
    }
    
    public void runTopLevelForms() {
        f11691();
    }
    
    static {
        me = (SubLFile)new module0185();
        $ic0$ = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $ic1$ = SubLObjectFactory.makeSymbol("S#14254", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("TRUTH-P");
        $ic3$ = SubLObjectFactory.makeSymbol("EL-STRENGTH-P");
        $ic4$ = SubLObjectFactory.makeSymbol("KB-CREATE-DEDUCTION");
        $ic5$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13918", "CYC"));
        $ic7$ = SubLObjectFactory.makeString("Create a new deduction consisting of SUPPORTS for ASSERTION.\n   TRUTH is the truth value of the deduction.\n   Hook up the indexing for the new deduction.");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14254", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13918", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-STRENGTH-P")));
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#14497", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $ic12$ = SubLObjectFactory.makeSymbol("KB-REMOVE-DEDUCTION");
        $ic13$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14450", "CYC"));
        $ic15$ = SubLObjectFactory.makeString("Remove DEDUCTION from the KB, and unhook its indexing.");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14450", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P")));
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $ic18$ = SubLObjectFactory.makeSymbol("KB-LOOKUP-DEDUCTION");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"));
        $ic20$ = SubLObjectFactory.makeString("Return the deduction with ASSERTION, SUPPORTS, and TRUTH, if it exists.\n   Return NIL otherwise.");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14254", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P")));
        $ic23$ = SubLObjectFactory.makeSymbol("KB-DEDUCTION-SUPPORTED-OBJECT");
        $ic24$ = SubLObjectFactory.makeString("Return the assertion for DEDUCTION.");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-P"));
        $ic26$ = SubLObjectFactory.makeSymbol("KB-DEDUCTION-SUPPORTS");
        $ic27$ = SubLObjectFactory.makeString("Return the supports for DEDUCTION.");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14254", "CYC"));
        $ic29$ = SubLObjectFactory.makeSymbol("KB-DEDUCTION-TRUTH");
        $ic30$ = SubLObjectFactory.makeString("Return the truth for DEDUCTION.");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P"));
        $ic32$ = SubLObjectFactory.makeSymbol("KB-DEDUCTION-STRENGTH");
        $ic33$ = SubLObjectFactory.makeString("Return the strength for DEDUCTION.");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-STRENGTH-P"));
        $ic35$ = SubLObjectFactory.makeSymbol("KB-SET-DEDUCTION-STRENGTH");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14450", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13923", "CYC"));
        $ic37$ = SubLObjectFactory.makeString("Change the strength of DEDUCTION to NEW-STRENGTH.");
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14450", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13923", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-STRENGTH-P")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0185.class
	Total time: 120 ms
	
	Decompiled with Procyon 0.5.32.
*/