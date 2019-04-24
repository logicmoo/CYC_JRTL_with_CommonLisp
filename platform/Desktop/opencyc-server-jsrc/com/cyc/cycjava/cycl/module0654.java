package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0654 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0654";
    public static final String myFingerPrint = "bc1eb77556ae1ffd4924bb3632c030c8981321d564e8d5e672a7d81a7434dc8d";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    
    public static SubLObject f39739(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        module0002.f37((SubLObject)module0654.$ic0$, (SubLObject)module0654.$ic1$);
        return (SubLObject)ConsesLow.listS((SubLObject)module0654.$ic2$, (SubLObject)module0654.$ic1$, ConsesLow.append(var5, (SubLObject)module0654.NIL));
    }
    
    public static SubLObject f39740(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        module0002.f37((SubLObject)module0654.$ic3$, (SubLObject)module0654.$ic4$);
        return (SubLObject)ConsesLow.listS((SubLObject)module0654.$ic2$, (SubLObject)module0654.$ic4$, ConsesLow.append(var5, (SubLObject)module0654.NIL));
    }
    
    public static SubLObject f39741(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0654.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0654.$ic6$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0654.$ic5$);
        var4 = var4.rest();
        if (module0654.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0002.f37((SubLObject)module0654.$ic7$, (SubLObject)module0654.$ic8$);
            return (SubLObject)ConsesLow.listS((SubLObject)module0654.$ic9$, (SubLObject)ConsesLow.listS(var6, (SubLObject)module0654.$ic10$, var7, (SubLObject)module0654.$ic11$), ConsesLow.append(var8, (SubLObject)module0654.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0654.$ic5$);
        return (SubLObject)module0654.NIL;
    }
    
    public static SubLObject f39742(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0654.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0654.$ic6$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0654.$ic5$);
        var4 = var4.rest();
        if (module0654.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0002.f37((SubLObject)module0654.$ic12$, (SubLObject)module0654.$ic13$);
            return (SubLObject)ConsesLow.listS((SubLObject)module0654.$ic14$, (SubLObject)ConsesLow.listS(var6, (SubLObject)module0654.$ic10$, var7, (SubLObject)module0654.$ic11$), ConsesLow.append(var8, (SubLObject)module0654.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0654.$ic5$);
        return (SubLObject)module0654.NIL;
    }
    
    public static SubLObject f39743(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic15$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0654.NIL;
        SubLObject var7 = (SubLObject)module0654.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic15$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic15$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0654.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0002.f37((SubLObject)module0654.$ic16$, (SubLObject)module0654.$ic17$);
            return (SubLObject)ConsesLow.listS((SubLObject)module0654.$ic18$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0654.$ic19$, var7), ConsesLow.append(var8, (SubLObject)module0654.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0654.$ic15$);
        return (SubLObject)module0654.NIL;
    }
    
    public static SubLObject f39744(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic20$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0654.NIL;
        SubLObject var7 = (SubLObject)module0654.NIL;
        SubLObject var8 = (SubLObject)module0654.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic20$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic20$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0654.NIL == var4) {
            var4 = var5;
            if (module0654.NIL == var4) {
                module0002.f37((SubLObject)module0654.$ic21$, (SubLObject)module0654.$ic22$);
                return (SubLObject)ConsesLow.list((SubLObject)module0654.$ic23$, var6, var7, var8);
            }
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0654.$ic20$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0654.$ic20$);
        }
        return (SubLObject)module0654.NIL;
    }
    
    public static SubLObject f39745(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic24$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0654.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic24$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0654.$ic25$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0654.$ic24$);
        var4 = var4.rest();
        if (module0654.NIL == var4) {
            var4 = var5;
            if (module0654.NIL == var4) {
                module0002.f37((SubLObject)module0654.$ic26$, (SubLObject)module0654.$ic27$);
                return (SubLObject)ConsesLow.list((SubLObject)module0654.$ic28$, var6, var7);
            }
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0654.$ic24$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0654.$ic24$);
        }
        return (SubLObject)module0654.NIL;
    }
    
    public static SubLObject f39746(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic24$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0654.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0654.$ic24$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0654.$ic25$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0654.$ic24$);
        var4 = var4.rest();
        if (module0654.NIL == var4) {
            var4 = var5;
            if (module0654.NIL == var4) {
                module0002.f37((SubLObject)module0654.$ic29$, (SubLObject)module0654.$ic30$);
                return (SubLObject)ConsesLow.list((SubLObject)module0654.$ic31$, var6, var7);
            }
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0654.$ic24$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0654.$ic24$);
        }
        return (SubLObject)module0654.NIL;
    }
    
    public static SubLObject f39747() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0654", "f39739", "S#43636");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0654", "f39740", "S#43637");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0654", "f39741", "S#43638");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0654", "f39742", "S#43639");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0654", "f39743", "S#43640");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0654", "f39744", "S#43641");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0654", "f39745", "S#43642");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0654", "f39746", "S#43643");
        return (SubLObject)module0654.NIL;
    }
    
    public static SubLObject f39748() {
        return (SubLObject)module0654.NIL;
    }
    
    public static SubLObject f39749() {
        return (SubLObject)module0654.NIL;
    }
    
    public void declareFunctions() {
        f39747();
    }
    
    public void initializeVariables() {
        f39748();
    }
    
    public void runTopLevelForms() {
        f39749();
    }
    
    static {
        me = (SubLFile)new module0654();
        $ic0$ = SubLObjectFactory.makeSymbol("S#43636", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1661", "CYC"));
        $ic2$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic3$ = SubLObjectFactory.makeSymbol("S#43637", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1664", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1744", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("VISIBLE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic6$ = SubLObjectFactory.makeKeyword("VISIBLE");
        $ic7$ = SubLObjectFactory.makeSymbol("S#43638", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1674", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#1674", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("INITIAL-VISIBILITY");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FLOW-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#43639", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1675", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#1675", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1746", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#43640", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1679", "CYC"));
        $ic18$ = SubLObjectFactory.makeSymbol("S#1679", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("LINK-TEXT");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43644", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43645", "CYC")));
        $ic21$ = SubLObjectFactory.makeSymbol("S#43641", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1689", "CYC"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#1689", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43646", "CYC"), (SubLObject)SubLObjectFactory.makeString(""))));
        $ic25$ = SubLObjectFactory.makeString("");
        $ic26$ = SubLObjectFactory.makeSymbol("S#43642", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1691", "CYC"));
        $ic28$ = SubLObjectFactory.makeSymbol("S#1691", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#43643", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1694", "CYC"));
        $ic31$ = SubLObjectFactory.makeSymbol("S#1694", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0654.class
	Total time: 54 ms
	
	Decompiled with Procyon 0.5.32.
*/