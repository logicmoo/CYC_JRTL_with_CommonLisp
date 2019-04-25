package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        assert NIL != module0191.f11950(var1) : var1;
        assert NIL != module0191.f11993(var2) : var2;
        assert NIL != module0130.f8511(var3) : var3;
        assert NIL != module0130.f8507(var4) : var4;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic4$, var1, var2, var3, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8289()) {
            final SubLObject var5 = module0018.$g573$.getGlobalValue();
            SubLObject var6 = (SubLObject)NIL;
            try {
                var6 = Locks.seize_lock(var5);
                final SubLObject var7 = (NIL != hl_interface_infrastructure_oc.f8288()) ? f11680(var1, var2, var3, var4) : f11681(var1, var2, var3, var4);
                module0197.f12312(var1, var2, var3, var4);
                hl_interface_infrastructure_oc.f8309();
                return var7;
            }
            finally {
                if (NIL != var6) {
                    Locks.release_lock(var5);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11680(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic10$, module0035.f2241(var1), module0035.f2241(var2), module0035.f2241(var3), module0035.f2241(var4)));
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var5);
        try {
            hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var5);
            var7 = module0187.f11751(var6);
            if (NIL != hl_interface_infrastructure_oc.f8287()) {
                module0187.f11748(var7, var6, var1, var2, var3, var4);
            }
        }
        finally {
            hl_interface_infrastructure_oc.$g1483$.rebind(var8, var5);
        }
        return var7;
    }
    
    public static SubLObject f11681(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = module0187.f11747(var1, var2, var3, var4);
        return deduction_handles_oc.f11675(var5);
    }
    
    public static SubLObject f11682(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        SubLObject var9 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic12$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var9 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var7)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var10 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var8);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var8);
                final SubLObject var11 = module0018.$g573$.getGlobalValue();
                SubLObject var12 = (SubLObject)NIL;
                try {
                    var12 = Locks.seize_lock(var11);
                    module0197.f12316(var7);
                    module0187.f11755(var7);
                    final SubLObject var13 = module0188.f11781(var7);
                    if (NIL != assertion_handles_oc.f11035(var13)) {
                        if (NIL != assertion_handles_oc.f11041(var13, (SubLObject)UNPROVIDED)) {
                            assertions_low_oc.f11268(var13, var7);
                        }
                    }
                    else if (NIL != module0191.f11952(var13)) {
                        final SubLObject var14 = module0183.f11552(var13);
                        if (NIL != var14) {
                            module0182.f11520(var14);
                        }
                    }
                    return module0187.f11754(var7);
                }
                finally {
                    if (NIL != var12) {
                        Locks.release_lock(var11);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var10, var8);
            }
        }
        return var9;
    }
    
    public static SubLObject f11683(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        assert NIL != module0191.f11950(var1) : var1;
        assert NIL != module0191.f11993(var2) : var2;
        assert NIL != module0130.f8511(var3) : var3;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic18$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var1), (SubLObject)ConsesLow.list((SubLObject)$ic13$, var2), (SubLObject)ConsesLow.list((SubLObject)$ic13$, var3)));
        }
        return module0187.f11758(var1, var2, var3);
    }
    
    public static SubLObject f11684(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var7)));
        }
        return module0187.f11760(var7);
    }
    
    public static SubLObject f11685(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var7)));
        }
        return module0187.f11753(var7);
    }
    
    public static SubLObject f11686(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var7)));
        }
        return module0187.f11761(var7);
    }
    
    public static SubLObject f11687(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic32$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var7)));
        }
        return module0187.f11762(var7);
    }
    
    public static SubLObject f11688(final SubLObject var7, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        assert NIL != module0130.f8507(var16) : var16;
        SubLObject var18 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic35$, var7, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var18 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic13$, var16)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var19 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var17);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var17);
                final SubLObject var20 = module0018.$g573$.getGlobalValue();
                SubLObject var21 = (SubLObject)NIL;
                try {
                    var21 = Locks.seize_lock(var20);
                    final SubLObject var22 = module0191.f11928(var7);
                    final SubLObject var20_21 = module0187.f11756(var7, var16);
                    module0197.f12318(var7, var22, var16);
                    return var20_21;
                }
                finally {
                    if (NIL != var21) {
                        Locks.release_lock(var20);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var19, var17);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11690() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11691() {
        module0012.f368((SubLObject)$ic4$, (SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)$ic9$);
        module0012.f368((SubLObject)$ic12$, (SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)$ic17$);
        module0012.f368((SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic22$);
        module0012.f368((SubLObject)$ic23$, (SubLObject)$ic14$, (SubLObject)$ic24$, (SubLObject)$ic16$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic26$, (SubLObject)$ic14$, (SubLObject)$ic27$, (SubLObject)$ic16$, (SubLObject)$ic28$);
        module0012.f368((SubLObject)$ic29$, (SubLObject)$ic14$, (SubLObject)$ic30$, (SubLObject)$ic16$, (SubLObject)$ic31$);
        module0012.f368((SubLObject)$ic32$, (SubLObject)$ic14$, (SubLObject)$ic33$, (SubLObject)$ic16$, (SubLObject)$ic34$);
        module0012.f368((SubLObject)$ic35$, (SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)$ic9$);
        return (SubLObject)NIL;
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
        $ic0$ = makeSymbol("SUPPORT-P");
        $ic1$ = makeSymbol("S#14254", "CYC");
        $ic2$ = makeSymbol("TRUTH-P");
        $ic3$ = makeSymbol("EL-STRENGTH-P");
        $ic4$ = makeSymbol("KB-CREATE-DEDUCTION");
        $ic5$ = makeSymbol("S#5859", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#13918", "CYC"));
        $ic7$ = makeString("Create a new deduction consisting of SUPPORTS for ASSERTION.\n   TRUTH is the truth value of the deduction.\n   Hook up the indexing for the new deduction.");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("SUPPORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14510", "CYC"), (SubLObject)makeSymbol("S#14254", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("TRUTH-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13918", "CYC"), (SubLObject)makeSymbol("EL-STRENGTH-P")));
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("DEDUCTION-P"));
        $ic10$ = makeSymbol("S#14497", "CYC");
        $ic11$ = makeSymbol("DEDUCTION-P");
        $ic12$ = makeSymbol("KB-REMOVE-DEDUCTION");
        $ic13$ = makeSymbol("QUOTE");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("DEDUCTION", "CYC"));
        $ic15$ = makeString("Remove DEDUCTION from the KB, and unhook its indexing.");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEDUCTION", "CYC"), (SubLObject)makeSymbol("DEDUCTION-P")));
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("NULL"));
        $ic18$ = makeSymbol("KB-LOOKUP-DEDUCTION");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"));
        $ic20$ = makeString("Return the deduction with ASSERTION, SUPPORTS, and TRUTH, if it exists.\n   Return NIL otherwise.");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("SUPPORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14510", "CYC"), (SubLObject)makeSymbol("S#14254", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("TRUTH-P")));
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("DEDUCTION-P")));
        $ic23$ = makeSymbol("KB-DEDUCTION-SUPPORTED-OBJECT");
        $ic24$ = makeString("Return the assertion for DEDUCTION.");
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("SUPPORT-P"));
        $ic26$ = makeSymbol("KB-DEDUCTION-SUPPORTS");
        $ic27$ = makeString("Return the supports for DEDUCTION.");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#14254", "CYC"));
        $ic29$ = makeSymbol("KB-DEDUCTION-TRUTH");
        $ic30$ = makeString("Return the truth for DEDUCTION.");
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("TRUTH-P"));
        $ic32$ = makeSymbol("KB-DEDUCTION-STRENGTH");
        $ic33$ = makeString("Return the strength for DEDUCTION.");
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("EL-STRENGTH-P"));
        $ic35$ = makeSymbol("KB-SET-DEDUCTION-STRENGTH");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("DEDUCTION", "CYC"), (SubLObject)makeSymbol("S#13923", "CYC"));
        $ic37$ = makeString("Change the strength of DEDUCTION to NEW-STRENGTH.");
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEDUCTION", "CYC"), (SubLObject)makeSymbol("DEDUCTION-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13923", "CYC"), (SubLObject)makeSymbol("EL-STRENGTH-P")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 120 ms
	
	Decompiled with Procyon 0.5.32.
*/