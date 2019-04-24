package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0196 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0196";
    public static final String myFingerPrint = "13d200fd48262d1a1c8458d2888b1e7d6787257725bb919915bc18545cfcfd69";
    private static SubLSymbol $g2280$;
    private static SubLSymbol $g2281$;
    private static SubLSymbol $g2282$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    
    public static SubLObject f12232(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0196.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0196.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0196.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0196.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0196.NIL;
        SubLObject var10_11 = (SubLObject)module0196.NIL;
        while (module0196.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0196.$ic0$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0196.$ic0$);
            if (module0196.NIL == conses_high.member(var10_11, (SubLObject)module0196.$ic1$, (SubLObject)module0196.UNPROVIDED, (SubLObject)module0196.UNPROVIDED)) {
                var9 = (SubLObject)module0196.T;
            }
            if (var10_11 == module0196.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0196.NIL != var9 && module0196.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0196.$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0196.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0196.NIL != var10) ? conses_high.cadr(var10) : module0196.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0196.$ic4$, var4);
        final SubLObject var13 = (SubLObject)((module0196.NIL != var12) ? conses_high.cadr(var12) : module0196.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0196.$ic5$, var4);
        final SubLObject var15 = (SubLObject)((module0196.NIL != var14) ? conses_high.cadr(var14) : module0196.NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0196.$ic6$, var4);
        final SubLObject var17 = (SubLObject)((module0196.NIL != var16) ? conses_high.cadr(var16) : module0196.NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)module0196.$ic7$, var4);
        final SubLObject var19 = (SubLObject)((module0196.NIL != var18) ? conses_high.cadr(var18) : module0196.NIL);
        final SubLObject var20;
        var4 = (var20 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0196.$ic8$, (SubLObject)ConsesLow.listS((SubLObject)module0196.$ic9$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0196.$ic3$, var11, (SubLObject)module0196.$ic4$, var13, (SubLObject)module0196.$ic5$, var15), ConsesLow.append(var20, (SubLObject)module0196.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0196.$ic10$, var6, (SubLObject)ConsesLow.list((SubLObject)module0196.$ic11$, var19)));
    }
    
    public static SubLObject f12233(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0196.$ic12$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0196.NIL;
        SubLObject var7 = (SubLObject)module0196.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0196.$ic12$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0196.$ic12$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0196.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0196.$ic13$, (SubLObject)ConsesLow.listS(var6, var7, (SubLObject)module0196.$ic14$), ConsesLow.append(var8, (SubLObject)module0196.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0196.$ic12$);
        return (SubLObject)module0196.NIL;
    }
    
    public static SubLObject f12234(final SubLObject var26, final SubLObject var21) {
        if (module0196.NIL != var21) {
            module0067.f4886(module0196.$g2281$.getGlobalValue(), var26, var21);
            SubLObject var27 = var21;
            SubLObject var28 = (SubLObject)module0196.NIL;
            var28 = var27.first();
            while (module0196.NIL != var27) {
                module0084.f5762(module0196.$g2280$.getGlobalValue(), var28, var26);
                var27 = var27.rest();
                var28 = var27.first();
            }
        }
        return var26;
    }
    
    public static SubLObject f12235(final SubLObject var26, final SubLObject var28) {
        return module0004.f104(var28, module0067.f4884(module0196.$g2281$.getGlobalValue(), var26, (SubLObject)module0196.UNPROVIDED), (SubLObject)module0196.UNPROVIDED, (SubLObject)module0196.UNPROVIDED);
    }
    
    public static SubLObject f12236(final SubLObject var28) {
        if (var28.eql((SubLObject)module0196.$ic15$)) {
            return f12237();
        }
        if (var28.eql((SubLObject)module0196.$ic16$)) {
            return (SubLObject)module0196.NIL;
        }
        return module0067.f4884(module0196.$g2280$.getGlobalValue(), var28, (SubLObject)module0196.UNPROVIDED);
    }
    
    public static SubLObject f12238(final SubLObject var21) {
        SubLObject var22 = (SubLObject)module0196.NIL;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)module0196.NIL;
        var24 = var23.first();
        while (module0196.NIL != var23) {
            final SubLObject var25 = f12236(var24);
            var22 = conses_high.union(var22, var25, (SubLObject)module0196.UNPROVIDED, (SubLObject)module0196.UNPROVIDED);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f12239(final SubLObject var21) {
        SubLObject var22 = (SubLObject)module0196.NIL;
        SubLObject var23 = (SubLObject)module0196.NIL;
        SubLObject var24 = (SubLObject)module0196.NIL;
        SubLObject var25 = (SubLObject)module0196.NIL;
        var23 = var21;
        var24 = var23.first();
        for (var25 = (SubLObject)module0196.ZERO_INTEGER; module0196.NIL != var23; var23 = var23.rest(), var24 = var23.first(), var25 = Numbers.add((SubLObject)module0196.ONE_INTEGER, var25)) {
            final SubLObject var26 = f12236(var24);
            if (var25.isZero()) {
                var22 = var26;
            }
            else {
                var22 = conses_high.intersection(var22, var26, (SubLObject)module0196.UNPROVIDED, (SubLObject)module0196.UNPROVIDED);
            }
        }
        return var22;
    }
    
    public static SubLObject f12240(final SubLObject var26) {
        return module0035.sublisp_boolean(module0067.f4884(module0196.$g2281$.getGlobalValue(), var26, (SubLObject)module0196.UNPROVIDED));
    }
    
    public static SubLObject f12241(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var28 == module0196.$ic15$ || var28 == module0196.$ic16$ || module0196.NIL != module0035.sublisp_boolean(module0067.f4884(module0196.$g2280$.getGlobalValue(), var28, (SubLObject)module0196.UNPROVIDED)));
    }
    
    public static SubLObject f12237() {
        return module0067.f4902(module0196.$g2281$.getGlobalValue());
    }
    
    public static SubLObject f12242() {
        return module0067.f4902(module0196.$g2280$.getGlobalValue());
    }
    
    public static SubLObject f12243(final SubLObject var34) {
        return module0021.f1039(var34);
    }
    
    public static SubLObject f12244(final SubLObject var35) {
        SubLObject var36 = module0021.f1059(var35);
        SubLObject var37 = (SubLObject)module0196.ZERO_INTEGER;
        while (module0196.NIL != module0035.f2428(module0338.f22673(), var36, (SubLObject)module0196.UNPROVIDED, (SubLObject)module0196.UNPROVIDED)) {
            var37 = Numbers.add(var37, (SubLObject)module0196.ONE_INTEGER);
            if (var37.numG(module0196.$g2282$.getGlobalValue())) {
                Errors.error((SubLObject)module0196.$ic17$, var35);
            }
            Threads.sleep((SubLObject)module0196.ONE_INTEGER);
            var36 = module0021.f1059(var35);
        }
        return var36;
    }
    
    public static SubLObject f12245() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0196", "f12232", "S#15052");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0196", "f12233", "S#15053");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12234", "S#15054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12235", "S#15055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12236", "S#15056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12238", "S#15057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12239", "S#15058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12240", "S#15059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12241", "S#15060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12237", "S#15061", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12242", "S#15062", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12243", "S#15063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0196", "f12244", "S#15064", 1, 0, false);
        return (SubLObject)module0196.NIL;
    }
    
    public static SubLObject f12246() {
        module0196.$g2280$ = SubLFiles.deflexical("S#15065", module0067.f4880((SubLObject)module0196.UNPROVIDED, (SubLObject)module0196.UNPROVIDED));
        module0196.$g2281$ = SubLFiles.deflexical("S#15066", module0067.f4880((SubLObject)module0196.UNPROVIDED, (SubLObject)module0196.UNPROVIDED));
        module0196.$g2282$ = SubLFiles.deflexical("S#15067", (SubLObject)module0196.ONE_INTEGER);
        return (SubLObject)module0196.NIL;
    }
    
    public static SubLObject f12247() {
        return (SubLObject)module0196.NIL;
    }
    
    public void declareFunctions() {
        f12245();
    }
    
    public void initializeVariables() {
        f12246();
    }
    
    public void runTopLevelForms() {
        f12247();
    }
    
    static {
        me = (SubLFile)new module0196();
        module0196.$g2280$ = null;
        module0196.$g2281$ = null;
        module0196.$g2282$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#10127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10298", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15068", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("DOCSTRING"), (SubLObject)SubLObjectFactory.makeKeyword("HIERARCHY"), (SubLObject)SubLObjectFactory.makeKeyword("GENERATED-BY"), (SubLObject)SubLObjectFactory.makeKeyword("PROPERTIES"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("PARENT");
        $ic4$ = SubLObjectFactory.makeKeyword("DOCSTRING");
        $ic5$ = SubLObjectFactory.makeKeyword("HIERARCHY");
        $ic6$ = SubLObjectFactory.makeKeyword("GENERATED-BY");
        $ic7$ = SubLObjectFactory.makeKeyword("PROPERTIES");
        $ic8$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic9$ = SubLObjectFactory.makeSymbol("S#10262", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#15054", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15066", "CYC"));
        $ic15$ = SubLObjectFactory.makeKeyword("ALL");
        $ic16$ = SubLObjectFactory.makeKeyword("NONE");
        $ic17$ = SubLObjectFactory.makeString("Could not properly unpack the event description: ~A");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0196.class
	Total time: 92 ms
	
	Decompiled with Procyon 0.5.32.
*/