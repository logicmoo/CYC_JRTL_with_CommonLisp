package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0123 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0123";
    public static final String myFingerPrint = "df661bd0cc14e892ceb2f8741e8a8025ad8db90d43e56785e55c1658560c377e";
    public static SubLSymbol $g1493$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    
    public static SubLObject f8348(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0123.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0123.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0123.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0123.$ic2$, (SubLObject)ConsesLow.listS((SubLObject)module0123.$ic3$, var6, (SubLObject)module0123.$ic4$))), ConsesLow.append(var7, (SubLObject)module0123.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0123.$ic0$);
        return (SubLObject)module0123.NIL;
    }
    
    public static SubLObject f8349() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0123.$g1493$.getDynamicValue(var8));
    }
    
    public static SubLObject f8350(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0004.f104(var6, module0123.$g1493$.getDynamicValue(var7), (SubLObject)module0123.UNPROVIDED, (SubLObject)module0123.UNPROVIDED);
    }
    
    public static SubLObject f8351(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0123.NIL;
        SubLObject var7 = (SubLObject)module0123.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0123.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0123.NIL;
        SubLObject var17_18 = (SubLObject)module0123.NIL;
        while (module0123.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0123.$ic5$);
            var17_18 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0123.$ic5$);
            if (module0123.NIL == conses_high.member(var17_18, (SubLObject)module0123.$ic6$, (SubLObject)module0123.UNPROVIDED, (SubLObject)module0123.UNPROVIDED)) {
                var10 = (SubLObject)module0123.T;
            }
            if (var17_18 == module0123.$ic7$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0123.NIL != var10 && module0123.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0123.$ic5$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic8$, var4);
        final SubLObject var12 = (SubLObject)((module0123.NIL != var11) ? conses_high.cadr(var11) : module0123.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic9$, var4);
        final SubLObject var14 = (SubLObject)((module0123.NIL != var13) ? conses_high.cadr(var13) : module0123.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)module0123.$ic10$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0123.$ic11$, (SubLObject)ConsesLow.list(new SubLObject[] { var16, var6, var7, module0123.$ic12$, module0123.T, module0123.$ic8$, var12, module0123.$ic9$, var14 }), (SubLObject)ConsesLow.list((SubLObject)module0123.$ic13$, var16), ConsesLow.append(var15, (SubLObject)module0123.NIL));
    }
    
    public static SubLObject f8352(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0123.NIL;
        SubLObject var7 = (SubLObject)module0123.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0123.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0123.NIL;
        SubLObject var30_31 = (SubLObject)module0123.NIL;
        while (module0123.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0123.$ic5$);
            var30_31 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0123.$ic5$);
            if (module0123.NIL == conses_high.member(var30_31, (SubLObject)module0123.$ic6$, (SubLObject)module0123.UNPROVIDED, (SubLObject)module0123.UNPROVIDED)) {
                var10 = (SubLObject)module0123.T;
            }
            if (var30_31 == module0123.$ic7$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0123.NIL != var10 && module0123.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0123.$ic5$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic8$, var4);
        final SubLObject var12 = (SubLObject)((module0123.NIL != var11) ? conses_high.cadr(var11) : module0123.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic9$, var4);
        final SubLObject var14 = (SubLObject)((module0123.NIL != var13) ? conses_high.cadr(var13) : module0123.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)module0123.$ic14$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0123.$ic15$, (SubLObject)ConsesLow.list(var16, var6, var7, (SubLObject)module0123.$ic8$, var12, (SubLObject)module0123.$ic9$, var14), (SubLObject)ConsesLow.list((SubLObject)module0123.$ic13$, var16), ConsesLow.append(var15, (SubLObject)module0123.NIL));
    }
    
    public static SubLObject f8353(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic16$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0123.NIL;
        SubLObject var7 = (SubLObject)module0123.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic16$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic16$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0123.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0123.NIL;
        SubLObject var40_41 = (SubLObject)module0123.NIL;
        while (module0123.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0123.$ic16$);
            var40_41 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0123.$ic16$);
            if (module0123.NIL == conses_high.member(var40_41, (SubLObject)module0123.$ic17$, (SubLObject)module0123.UNPROVIDED, (SubLObject)module0123.UNPROVIDED)) {
                var10 = (SubLObject)module0123.T;
            }
            if (var40_41 == module0123.$ic7$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0123.NIL != var10 && module0123.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0123.$ic16$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic12$, var4);
        final SubLObject var12 = (SubLObject)((module0123.NIL != var11) ? conses_high.cadr(var11) : module0123.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic8$, var4);
        final SubLObject var14 = (SubLObject)((module0123.NIL != var13) ? conses_high.cadr(var13) : module0123.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic9$, var4);
        final SubLObject var16 = (SubLObject)((module0123.NIL != var15) ? conses_high.cadr(var15) : module0123.NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)module0123.$ic18$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0123.$ic19$, (SubLObject)ConsesLow.list(new SubLObject[] { var18, var6, var7, module0123.$ic12$, var12, module0123.$ic8$, var14, module0123.$ic9$, var16 }), (SubLObject)ConsesLow.list((SubLObject)module0123.$ic13$, var18), ConsesLow.append(var17, (SubLObject)module0123.NIL));
    }
    
    public static SubLObject f8354(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic20$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0123.NIL;
        SubLObject var7 = (SubLObject)module0123.NIL;
        SubLObject var8 = (SubLObject)module0123.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic20$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic20$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0123.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0123.NIL;
        SubLObject var53_54 = (SubLObject)module0123.NIL;
        while (module0123.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0123.$ic20$);
            var53_54 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0123.$ic20$);
            if (module0123.NIL == conses_high.member(var53_54, (SubLObject)module0123.$ic6$, (SubLObject)module0123.UNPROVIDED, (SubLObject)module0123.UNPROVIDED)) {
                var11 = (SubLObject)module0123.T;
            }
            if (var53_54 == module0123.$ic7$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0123.NIL != var11 && module0123.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0123.$ic20$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic8$, var4);
        final SubLObject var13 = (SubLObject)((module0123.NIL != var12) ? conses_high.cadr(var12) : module0123.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic9$, var4);
        final SubLObject var15 = (SubLObject)((module0123.NIL != var14) ? conses_high.cadr(var14) : module0123.NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        final SubLObject var17 = (SubLObject)module0123.$ic21$;
        final SubLObject var18 = (SubLObject)module0123.$ic22$;
        final SubLObject var19 = (SubLObject)module0123.$ic23$;
        return (SubLObject)ConsesLow.list((SubLObject)module0123.$ic1$, (SubLObject)ConsesLow.list(var18, var19), (SubLObject)ConsesLow.list((SubLObject)module0123.$ic11$, (SubLObject)ConsesLow.list(new SubLObject[] { var17, var6, var7, module0123.$ic12$, module0123.T, module0123.$ic8$, var13, module0123.$ic9$, var19 }), (SubLObject)ConsesLow.list((SubLObject)module0123.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)module0123.$ic24$, var8, var17))), (SubLObject)ConsesLow.listS((SubLObject)module0123.$ic25$, var18, ConsesLow.append(var16, (SubLObject)module0123.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0123.$ic26$, var19, (SubLObject)ConsesLow.list((SubLObject)module0123.$ic27$, var15, var18)))));
    }
    
    public static SubLObject f8355(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic28$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0123.NIL;
        SubLObject var7 = (SubLObject)module0123.NIL;
        SubLObject var8 = (SubLObject)module0123.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic28$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic28$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0123.$ic28$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0123.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0123.NIL;
        SubLObject var66_67 = (SubLObject)module0123.NIL;
        while (module0123.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0123.$ic28$);
            var66_67 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0123.$ic28$);
            if (module0123.NIL == conses_high.member(var66_67, (SubLObject)module0123.$ic6$, (SubLObject)module0123.UNPROVIDED, (SubLObject)module0123.UNPROVIDED)) {
                var11 = (SubLObject)module0123.T;
            }
            if (var66_67 == module0123.$ic7$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0123.NIL != var11 && module0123.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0123.$ic28$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic8$, var4);
        final SubLObject var13 = (SubLObject)((module0123.NIL != var12) ? conses_high.cadr(var12) : module0123.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0123.$ic9$, var4);
        final SubLObject var15 = (SubLObject)((module0123.NIL != var14) ? conses_high.cadr(var14) : module0123.NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        final SubLObject var17 = (SubLObject)module0123.$ic29$;
        return (SubLObject)ConsesLow.list((SubLObject)module0123.$ic11$, (SubLObject)ConsesLow.list(new SubLObject[] { var17, var6, var7, module0123.$ic12$, module0123.T, module0123.$ic8$, var13, module0123.$ic9$, var15 }), (SubLObject)ConsesLow.listS((SubLObject)module0123.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0123.$ic24$, var17, var8), ConsesLow.append(var16, (SubLObject)module0123.NIL)));
    }
    
    public static SubLObject f8356() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0123", "f8348", "S#10458");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0123", "f8349", "S#10459", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0123", "f8350", "S#10460", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0123", "f8351", "DO-KB-SUID-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0123", "f8352", "S#10461");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0123", "f8353", "S#10462");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0123", "f8354", "S#10463");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0123", "f8355", "S#10464");
        return (SubLObject)module0123.NIL;
    }
    
    public static SubLObject f8357() {
        module0123.$g1493$ = SubLFiles.defparameter("S#10465", (SubLObject)module0123.NIL);
        return (SubLObject)module0123.NIL;
    }
    
    public static SubLObject f8358() {
        return (SubLObject)module0123.NIL;
    }
    
    public void declareFunctions() {
        f8356();
    }
    
    public void initializeVariables() {
        f8357();
    }
    
    public void runTopLevelForms() {
        f8358();
    }
    
    static {
        me = (SubLFile)new module0123();
        module0123.$g1493$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = SubLObjectFactory.makeSymbol("S#10465", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("CONS");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10465", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#705", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic7$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic8$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic9$ = SubLObjectFactory.makeKeyword("DONE");
        $ic10$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
        $ic11$ = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $ic12$ = SubLObjectFactory.makeKeyword("ORDERED");
        $ic13$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic14$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
        $ic15$ = SubLObjectFactory.makeSymbol("S#6337", "CYC");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#705", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#6384", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORDERED"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic18$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
        $ic19$ = SubLObjectFactory.makeSymbol("S#6340", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#705", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10467", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
        $ic22$ = SubLObjectFactory.makeUninternedSymbol("US#794C611");
        $ic23$ = SubLObjectFactory.makeUninternedSymbol("US#3D5CF45");
        $ic24$ = SubLObjectFactory.makeSymbol("<");
        $ic25$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic26$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic27$ = SubLObjectFactory.makeSymbol("COR");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#705", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10468", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic29$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0123.class
	Total time: 99 ms
	
	Decompiled with Procyon 0.5.32.
*/