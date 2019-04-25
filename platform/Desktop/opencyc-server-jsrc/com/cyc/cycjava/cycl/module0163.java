package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
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

public final class module0163 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0163";
    public static final String myFingerPrint = "a92872ee4a6c2ed784467107c06b6ae16e65a529385f50ab65e75ad54ab1a30a";
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
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLString $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    
    public static SubLObject f10653(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0126.f8391(var1) : var1;
        assert NIL != constants_high_oc.f10734(var2) : var2;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic2$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8289()) {
            final SubLObject var3 = module0018.$g573$.getGlobalValue();
            SubLObject var4 = (SubLObject)NIL;
            try {
                var4 = Locks.seize_lock(var3);
                final SubLObject var5 = (NIL != hl_interface_infrastructure_oc.f8288()) ? f10654(var1, var2) : f10655(var1, var2);
                module0197.f12248(var1, var2);
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
    
    public static SubLObject f10654(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic8$, module0035.f2241(var1), module0035.f2241(var2)));
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var3);
        try {
            hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var3);
            var5 = module0165.f10710(var1, var4);
            if (NIL != hl_interface_infrastructure_oc.f8287()) {
                module0165.f10708(var5, var1, var2);
            }
        }
        finally {
            hl_interface_infrastructure_oc.$g1483$.rebind(var6, var3);
        }
        return var5;
    }
    
    public static SubLObject f10655(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0165.f10707(var1, var2);
        return constants_high_oc.f10752(var3);
    }
    
    public static SubLObject f10656(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert NIL != constant_handles_oc.f8449(var5) : var5;
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
                    module0197.f12257(var5);
                    return module0165.f10713(var5);
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
    
    public static SubLObject f10657(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var1)));
        }
        return module0124.f8359(var1);
    }
    
    public static SubLObject f10658(final SubLObject var5) {
        assert NIL != constant_handles_oc.f8449(var5) : var5;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)));
        }
        return module0165.f10714(var5);
    }
    
    public static SubLObject f10659(final SubLObject var12) {
        assert NIL != Guids.guid_p(var12) : var12;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var12)));
        }
        return module0165.f10701(var12);
    }
    
    public static SubLObject f10660(final SubLObject var5) {
        assert NIL != constant_handles_oc.f8449(var5) : var5;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)));
        }
        return module0165.f10717(var5);
    }
    
    public static SubLObject f10661(final SubLObject var5) {
        assert NIL != constant_handles_oc.f8449(var5) : var5;
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5)));
        }
        return module0165.f10718(var5);
    }
    
    public static SubLObject f10662(final SubLObject var5, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert NIL != constant_handles_oc.f8449(var5) : var5;
        assert NIL != module0126.f8389(var13) : var13;
        SubLObject var15 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic36$, var5, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var15 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var13)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var16 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var14);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var14);
                final SubLObject var17 = module0018.$g573$.getGlobalValue();
                SubLObject var18 = (SubLObject)NIL;
                try {
                    var18 = Locks.seize_lock(var17);
                    final SubLObject var19 = constants_high_oc.f10743(var5);
                    SubLObject var17_18 = (SubLObject)NIL;
                    var17_18 = module0165.f10723(var5, var13);
                    module0197.f12253(var5, var19, var13);
                    return var17_18;
                }
                finally {
                    if (NIL != var18) {
                        Locks.release_lock(var17);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var16, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f10663(SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)ONE_INTEGER;
        }
        return hl_interface_infrastructure_oc.f8328((SubLObject)$ic40$, var19);
    }
    
    public static SubLObject f10664() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10653", "KB-CREATE-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10654", "S#13496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10655", "S#13497", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10656", "KB-REMOVE-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10657", "KB-LOOKUP-CONSTANT-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10658", "KB-CONSTANT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10659", "KB-LOOKUP-CONSTANT-BY-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10660", "KB-CONSTANT-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10661", "KB-CONSTANT-MERGED-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10662", "KB-RENAME-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0163", "f10663", "S#10525", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10665() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10666() {
        module0012.f368((SubLObject)$ic2$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic10$, (SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)$ic15$);
        module0012.f368((SubLObject)$ic17$, (SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)$ic21$);
        module0012.f368((SubLObject)$ic22$, (SubLObject)$ic12$, (SubLObject)$ic23$, (SubLObject)$ic14$, (SubLObject)$ic24$);
        module0012.f368((SubLObject)$ic26$, (SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)$ic21$);
        module0012.f368((SubLObject)$ic30$, (SubLObject)$ic12$, (SubLObject)$ic31$, (SubLObject)$ic14$, (SubLObject)$ic32$);
        module0012.f368((SubLObject)$ic33$, (SubLObject)$ic12$, (SubLObject)$ic34$, (SubLObject)$ic14$, (SubLObject)$ic32$);
        module0012.f368((SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f10664();
    }
    
    public void initializeVariables() {
        f10665();
    }
    
    public void runTopLevelForms() {
        f10666();
    }
    
    static {
        me = (SubLFile)new module0163();
        $ic0$ = makeSymbol("S#10492", "CYC");
        $ic1$ = makeSymbol("S#13484", "CYC");
        $ic2$ = makeSymbol("KB-CREATE-CONSTANT");
        $ic3$ = makeSymbol("S#5859", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#10596", "CYC"));
        $ic5$ = makeString("Return a new constant named NAME with EXTERNAL-ID.\n   If NAME is :unnamed, returns a constant with no name.");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#10492", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10596", "CYC"), (SubLObject)makeSymbol("S#13484", "CYC")));
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("CONSTANT-P"));
        $ic8$ = makeSymbol("S#13488", "CYC");
        $ic9$ = makeSymbol("CONSTANT-P");
        $ic10$ = makeSymbol("KB-REMOVE-CONSTANT");
        $ic11$ = makeSymbol("QUOTE");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("CONSTANT", "CYC"));
        $ic13$ = makeString("Remove CONSTANT from the KB.");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CONSTANT", "CYC"), (SubLObject)makeSymbol("CONSTANT-P")));
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("NULL"));
        $ic16$ = makeSymbol("STRINGP");
        $ic17$ = makeSymbol("KB-LOOKUP-CONSTANT-BY-NAME");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"));
        $ic19$ = makeString("Return the constant named NAME, if it exists.\n   Return NIL otherwise.");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("STRINGP")));
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("CONSTANT-P")));
        $ic22$ = makeSymbol("KB-CONSTANT-NAME");
        $ic23$ = makeString("Return the name for CONSTANT.");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#10492", "CYC"));
        $ic25$ = makeSymbol("GUID-P");
        $ic26$ = makeSymbol("KB-LOOKUP-CONSTANT-BY-GUID");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("GUID"));
        $ic28$ = makeString("Return the constant with GUID, if it exists.\n   Return NIL otherwise.");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("GUID"), (SubLObject)makeSymbol("GUID-P")));
        $ic30$ = makeSymbol("KB-CONSTANT-GUID");
        $ic31$ = makeString("Return the external ID for CONSTANT.");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#13484", "CYC"));
        $ic33$ = makeSymbol("KB-CONSTANT-MERGED-GUID");
        $ic34$ = makeString("Return the external merged ID for CONSTANT.");
        $ic35$ = makeSymbol("VALID-CONSTANT-NAME-P");
        $ic36$ = makeSymbol("KB-RENAME-CONSTANT");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("CONSTANT", "CYC"), (SubLObject)makeSymbol("S#13498", "CYC"));
        $ic38$ = makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CONSTANT", "CYC"), (SubLObject)makeSymbol("CONSTANT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13498", "CYC"), (SubLObject)makeSymbol("VALID-CONSTANT-NAME-P")));
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#13499", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 127 ms
	
	Decompiled with Procyon 0.5.32.
*/