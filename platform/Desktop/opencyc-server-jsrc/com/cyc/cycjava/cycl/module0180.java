package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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

public final class module0180 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0180";
    public static final String myFingerPrint = "9d6bc8ccf231fc868d919793904b660a84fa514d7b5304420e7f1f51b56b5088";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLString $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLString $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLString $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    
    public static SubLObject f11447(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0191.f11952(var1) : var1;
        assert NIL != module0191.f11993(var2) : var2;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic2$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8289()) {
            final SubLObject var3 = module0018.$g573$.getGlobalValue();
            SubLObject var4 = (SubLObject)NIL;
            try {
                var4 = Locks.seize_lock(var3);
                final SubLObject var5 = (NIL != hl_interface_infrastructure_oc.f8288()) ? f11448(var1, var2) : f11449(var1, var2);
                module0197.f12322(var1, var2);
                hl_interface_infrastructure_oc.f8309();
                return var5;
            }
            finally {
                if (NIL != var4) {
                    Locks.release_lock(var3);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11448(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic8$, module0035.f2241(var1), module0035.f2241(var2)));
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var3);
        try {
            hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var3);
            var5 = module0182.f11515(var4);
            if (NIL != hl_interface_infrastructure_oc.f8287()) {
                module0182.f11511(var5, var4, var1, var2);
            }
        }
        finally {
            hl_interface_infrastructure_oc.$g1483$.rebind(var6, var3);
        }
        return var5;
    }
    
    public static SubLObject f11449(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0182.f11510(var1, var2);
        return module0179.f11443(var3);
    }
    
    public static SubLObject f11450(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert NIL != module0179.f11424(var5) : var5;
        SubLObject var7 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic10$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var7 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var8 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var6);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var6);
                final SubLObject var9 = module0018.$g573$.getGlobalValue();
                SubLObject var10 = (SubLObject)NIL;
                try {
                    var10 = Locks.seize_lock(var9);
                    module0197.f12325(var5);
                    module0182.f11528(var5);
                    return (SubLObject)NIL;
                }
                finally {
                    if (NIL != var10) {
                        Locks.release_lock(var9);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var8, var6);
            }
        }
        return var7;
    }
    
    public static SubLObject f11451(final SubLObject var1) {
        assert NIL != module0191.f11952(var1) : var1;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var1)));
        }
        final SubLObject var2 = module0182.f11527(var1);
        return (NIL != var2) ? var2 : module0182.f11533(var1);
    }
    
    public static SubLObject f11452(final SubLObject var12) {
        assert NIL != module0212.f13762(var12) : var12;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var12)));
        }
        return module0182.f11534(var12);
    }
    
    public static SubLObject f11453(final SubLObject var5) {
        assert NIL != module0179.f11424(var5) : var5;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)));
        }
        return module0179.f11399(var5);
    }
    
    public static SubLObject f11454(final SubLObject var5) {
        assert NIL != module0179.f11424(var5) : var5;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)));
        }
        return module0179.f11400(var5);
    }
    
    public static SubLObject f11455(final SubLObject var5) {
        assert NIL != module0179.f11424(var5) : var5;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic32$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)));
        }
        return module0179.f11401(var5);
    }
    
    public static SubLObject f11456(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert NIL != module0179.f11424(var5) : var5;
        SubLObject var7 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic34$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var7 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var8 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var6);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var6);
                final SubLObject var9 = module0018.$g573$.getGlobalValue();
                SubLObject var10 = (SubLObject)NIL;
                try {
                    var10 = Locks.seize_lock(var9);
                    return module0182.f11523(var5);
                }
                finally {
                    if (NIL != var10) {
                        Locks.release_lock(var9);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var8, var6);
            }
        }
        return var7;
    }
    
    public static SubLObject f11457(final SubLObject var5, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert NIL != module0179.f11424(var5) : var5;
        SubLObject var17 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic36$, var5, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var17 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var15)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var18 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var16);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var16);
                final SubLObject var19 = module0018.$g573$.getGlobalValue();
                SubLObject var20 = (SubLObject)NIL;
                try {
                    var20 = Locks.seize_lock(var19);
                    module0182.f11521(var5, var15);
                    return var5;
                }
                finally {
                    if (NIL != var20) {
                        Locks.release_lock(var19);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var18, var16);
            }
        }
        return var17;
    }
    
    public static SubLObject f11458(final SubLObject var5, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        assert NIL != module0179.f11424(var5) : var5;
        SubLObject var20 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic40$, var5, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var20 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic40$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var18)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var21 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var19);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var19);
                final SubLObject var22 = module0018.$g573$.getGlobalValue();
                SubLObject var23 = (SubLObject)NIL;
                try {
                    var23 = Locks.seize_lock(var22);
                    if (NIL != assertion_handles_oc.f11035(var18)) {
                        Errors.sublisp_break((SubLObject)UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
                    }
                    return module0182.f11517(var5, var18);
                }
                finally {
                    if (NIL != var23) {
                        Locks.release_lock(var22);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var21, var19);
            }
        }
        return var20;
    }
    
    public static SubLObject f11459(final SubLObject var5, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        assert NIL != module0179.f11424(var5) : var5;
        SubLObject var23 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic43$, var5, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var23 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var21)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var24 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var22);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var22);
                final SubLObject var25 = module0018.$g573$.getGlobalValue();
                SubLObject var26 = (SubLObject)NIL;
                try {
                    var26 = Locks.seize_lock(var25);
                    module0182.f11519(var5);
                    SubLObject var27 = var21;
                    SubLObject var28 = (SubLObject)NIL;
                    var28 = var27.first();
                    while (NIL != var27) {
                        if (NIL != assertion_handles_oc.f11035(var28)) {
                            Errors.sublisp_break((SubLObject)UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
                        }
                        module0182.f11517(var5, var28);
                        var27 = var27.rest();
                        var28 = var27.first();
                    }
                    return var5;
                }
                finally {
                    if (NIL != var26) {
                        Locks.release_lock(var25);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var24, var22);
            }
        }
        return var23;
    }
    
    public static SubLObject f11460() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11447", "KB-CREATE-KB-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11448", "S#14268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11449", "S#14269", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11450", "KB-REMOVE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11451", "KB-LOOKUP-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11452", "KB-LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11453", "KB-KB-HL-SUPPORT-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11454", "KB-KB-HL-SUPPORT-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11455", "KB-KB-HL-SUPPORT-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11456", "KB-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11457", "KB-KB-HL-SUPPORT-SET-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11458", "KB-KB-HL-SUPPORT-ADD-DEPENDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0180", "f11459", "KB-KB-HL-SUPPORT-SET-DEPENDENTS", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11461() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11462() {
        module0012.f368((SubLObject)$ic2$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic10$, (SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)$ic15$);
        module0012.f368((SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)$ic20$);
        module0012.f368((SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)$ic26$);
        module0012.f368((SubLObject)$ic27$, (SubLObject)$ic12$, (SubLObject)$ic28$, (SubLObject)$ic14$, (SubLObject)$ic29$);
        module0012.f368((SubLObject)$ic30$, (SubLObject)$ic12$, (SubLObject)$ic31$, (SubLObject)$ic14$, (SubLObject)$ic29$);
        module0012.f368((SubLObject)$ic32$, (SubLObject)$ic12$, (SubLObject)$ic33$, (SubLObject)$ic14$, (SubLObject)$ic29$);
        module0012.f368((SubLObject)$ic34$, (SubLObject)$ic12$, (SubLObject)$ic35$, (SubLObject)$ic14$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)$ic14$, (SubLObject)$ic39$);
        module0012.f368((SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)$ic14$, (SubLObject)$ic39$);
        module0012.f368((SubLObject)$ic43$, (SubLObject)$ic44$, (SubLObject)$ic38$, (SubLObject)$ic14$, (SubLObject)$ic39$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f11460();
    }
    
    public void initializeVariables() {
        f11461();
    }
    
    public void runTopLevelForms() {
        f11462();
    }
    
    static {
        me = (SubLFile)new module0180();
        $ic0$ = makeSymbol("HL-SUPPORT-P");
        $ic1$ = makeSymbol("S#14254", "CYC");
        $ic2$ = makeSymbol("KB-CREATE-KB-HL-SUPPORT");
        $ic3$ = makeSymbol("S#5859", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#14270", "CYC"), (SubLObject)makeSymbol("S#14271", "CYC"));
        $ic5$ = makeString("Create a new KB HL support consisting of JUSTIFICATION for HL-SUPPORT.");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14270", "CYC"), (SubLObject)makeSymbol("HL-SUPPORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14271", "CYC"), (SubLObject)makeSymbol("S#14254", "CYC")));
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("KB-HL-SUPPORT-P"));
        $ic8$ = makeSymbol("S#14258", "CYC");
        $ic9$ = makeSymbol("KB-HL-SUPPORT-P");
        $ic10$ = makeSymbol("KB-REMOVE-KB-HL-SUPPORT");
        $ic11$ = makeSymbol("QUOTE");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#14196", "CYC"));
        $ic13$ = makeString("Remove KB-HL-SUPPORT from the KB, and unhook its indexing.");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14196", "CYC"), (SubLObject)makeSymbol("KB-HL-SUPPORT-P")));
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("NULL"));
        $ic16$ = makeSymbol("KB-LOOKUP-KB-HL-SUPPORT");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#14270", "CYC"));
        $ic18$ = makeString("Return the kb-hl-support with HL-SUPPORT and JUSTIFICATION if it exists.\n   Return NIL otherwise.");
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14270", "CYC"), (SubLObject)makeSymbol("HL-SUPPORT-P")));
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("KB-HL-SUPPORT-P")));
        $ic21$ = makeSymbol("INDEXED-TERM-P");
        $ic22$ = makeSymbol("KB-LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"));
        $ic24$ = makeString("Return a list of kb-hl-supports mentioning TERM if any exists.\n   Return NIL otherwise.");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("INDEXED-TERM-P")));
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic27$ = makeSymbol("KB-KB-HL-SUPPORT-ARGUMENT");
        $ic28$ = makeString("Return the argument for KB-HL-SUPPORT.");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#14254", "CYC"));
        $ic30$ = makeSymbol("KB-KB-HL-SUPPORT-ARGUMENTS");
        $ic31$ = makeString("Return the arguments for KB-HL-SUPPORT.");
        $ic32$ = makeSymbol("KB-KB-HL-SUPPORT-DEPENDENTS");
        $ic33$ = makeString("Return the dependents for KB-HL-SUPPORT.");
        $ic34$ = makeSymbol("KB-REJUSTIFY-KB-HL-SUPPORT");
        $ic35$ = makeString("Perform TMS on KB-HL-SUPPORT\n   @return kb-hl-support-p or :unjustifiable");
        $ic36$ = makeSymbol("KB-KB-HL-SUPPORT-SET-ARGUMENT");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#14196", "CYC"), (SubLObject)makeSymbol("S#9952", "CYC"));
        $ic38$ = makeString("Replace the dependents of KB-HL-SUPPORT");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#14272", "CYC"));
        $ic40$ = makeSymbol("KB-KB-HL-SUPPORT-ADD-DEPENDENT");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("S#14196", "CYC"), (SubLObject)makeSymbol("S#14273", "CYC"));
        $ic42$ = makeString("Add a dependent to KB-HL-SUPPORT");
        $ic43$ = makeSymbol("KB-KB-HL-SUPPORT-SET-DEPENDENTS");
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("S#14196", "CYC"), (SubLObject)makeSymbol("S#14274", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 131 ms
	
	Decompiled with Procyon 0.5.32.
*/