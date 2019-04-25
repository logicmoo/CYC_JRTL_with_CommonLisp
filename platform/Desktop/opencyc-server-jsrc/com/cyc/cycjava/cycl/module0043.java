package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0043 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0043";
    public static final String myFingerPrint = "74bc1645a3516a62f3cb2740149792a024130333d99fe0af169bd6e25c6ae1e0";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    
    public static SubLObject f3117(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0043.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0043.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0043.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0043.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return f3118((SubLObject)module0043.$ic1$, var6, var7);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0043.$ic0$);
        return (SubLObject)module0043.NIL;
    }
    
    public static SubLObject f3119(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0043.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0043.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0043.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0043.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return f3118((SubLObject)module0043.$ic4$, var6, var7);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0043.$ic0$);
        return (SubLObject)module0043.NIL;
    }
    
    public static SubLObject f3120(final SubLObject var11, final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = Vectors.make_vector(var12, (SubLObject)module0043.NIL);
        Vectors.set_aref(var15, (SubLObject)module0043.ZERO_INTEGER, var11);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var16 = (SubLObject)module0043.NIL, var16 = var14; module0043.NIL != var16; var16 = conses_high.cddr(var16)) {
            var17 = var16.first();
            var18 = conses_high.cadr(var16);
            var19 = Sequences.position(var17, var13, (SubLObject)module0043.UNPROVIDED, (SubLObject)module0043.UNPROVIDED, (SubLObject)module0043.UNPROVIDED, (SubLObject)module0043.UNPROVIDED);
            Vectors.set_aref(var15, module0048.f_1X(var19), var18);
        }
        return var15;
    }
    
    public static SubLObject f3121(final SubLObject var11, final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = (SubLObject)ConsesLow.make_list(var12, (SubLObject)module0043.NIL);
        ConsesLow.set_nth((SubLObject)module0043.ZERO_INTEGER, var15, var11);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var16 = (SubLObject)module0043.NIL, var16 = var14; module0043.NIL != var16; var16 = conses_high.cddr(var16)) {
            var17 = var16.first();
            var18 = conses_high.cadr(var16);
            var19 = Sequences.position(var17, var13, (SubLObject)module0043.UNPROVIDED, (SubLObject)module0043.UNPROVIDED, (SubLObject)module0043.UNPROVIDED, (SubLObject)module0043.UNPROVIDED);
            ConsesLow.set_nth(module0048.f_1X(var19), var15, var18);
        }
        return var15;
    }
    
    public static SubLObject f3118(final SubLObject var11, final SubLObject var6, final SubLObject var7) {
        final SubLObject var12 = f3122(var6, var7);
        SubLObject var14;
        final SubLObject var13 = var14 = var12;
        SubLObject var15 = (SubLObject)module0043.NIL;
        SubLObject var16 = (SubLObject)module0043.NIL;
        SubLObject var17 = (SubLObject)module0043.NIL;
        SubLObject var18 = (SubLObject)module0043.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0043.$ic9$);
        var15 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0043.$ic9$);
        var16 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0043.$ic9$);
        var17 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0043.$ic9$);
        var18 = var14.first();
        var14 = var14.rest();
        if (module0043.NIL == var14) {
            final SubLObject var19 = Numbers.add((SubLObject)module0043.ONE_INTEGER, Sequences.length(var7));
            SubLObject var20 = (SubLObject)module0043.NIL;
            SubLObject var21 = (SubLObject)module0043.NIL;
            SubLObject var22 = (SubLObject)module0043.NIL;
            SubLObject var23 = (SubLObject)module0043.NIL;
            if (var11.eql((SubLObject)module0043.$ic1$)) {
                var20 = (SubLObject)ConsesLow.list((SubLObject)module0043.$ic10$, var15, (SubLObject)module0043.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic13$, (SubLObject)module0043.$ic14$, (SubLObject)ConsesLow.listS((SubLObject)module0043.$ic15$, var19, (SubLObject)module0043.$ic16$), (SubLObject)ConsesLow.listS((SubLObject)module0043.EQ, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic17$, var6), (SubLObject)module0043.$ic18$))));
            }
            else if (var11.eql((SubLObject)module0043.$ic4$)) {
                var20 = (SubLObject)ConsesLow.list((SubLObject)module0043.$ic10$, var15, (SubLObject)module0043.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic13$, (SubLObject)module0043.$ic19$, (SubLObject)ConsesLow.listS((SubLObject)module0043.EQ, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic17$, var6), (SubLObject)module0043.$ic20$), (SubLObject)module0043.$ic21$, (SubLObject)ConsesLow.listS((SubLObject)module0043.$ic15$, var19, (SubLObject)module0043.$ic16$))));
            }
            if (var11.eql((SubLObject)module0043.$ic1$)) {
                var21 = (SubLObject)ConsesLow.list((SubLObject)module0043.$ic10$, var16, (SubLObject)module0043.$ic22$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic12$, (SubLObject)ConsesLow.listS((SubLObject)module0043.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic17$, var6), var19, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic17$, var17), (SubLObject)module0043.$ic23$)));
            }
            else if (var11.eql((SubLObject)module0043.$ic4$)) {
                var21 = (SubLObject)ConsesLow.list((SubLObject)module0043.$ic10$, var16, (SubLObject)module0043.$ic22$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic12$, (SubLObject)ConsesLow.listS((SubLObject)module0043.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic17$, var6), var19, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic17$, var17), (SubLObject)module0043.$ic23$)));
            }
            SubLObject var24 = (SubLObject)module0043.ZERO_INTEGER;
            SubLObject var25 = var18;
            SubLObject var26 = (SubLObject)module0043.NIL;
            var26 = var25.first();
            while (module0043.NIL != var25) {
                var24 = Numbers.add(var24, (SubLObject)module0043.ONE_INTEGER);
                SubLObject var36_37;
                final SubLObject var34_35 = var36_37 = var26;
                SubLObject var27 = (SubLObject)module0043.NIL;
                SubLObject var28 = (SubLObject)module0043.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var36_37, var34_35, (SubLObject)module0043.$ic24$);
                var27 = var36_37.first();
                var36_37 = var36_37.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var36_37, var34_35, (SubLObject)module0043.$ic24$);
                var28 = var36_37.first();
                var36_37 = var36_37.rest();
                if (module0043.NIL == var36_37) {
                    if (var11.eql((SubLObject)module0043.$ic1$)) {
                        var22 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0043.$ic10$, var27, (SubLObject)module0043.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic25$, (SubLObject)module0043.$ic26$, var15), (SubLObject)ConsesLow.list((SubLObject)module0043.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic27$, (SubLObject)module0043.$ic26$, var24))), var22);
                    }
                    else if (var11.eql((SubLObject)module0043.$ic4$)) {
                        var22 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0043.$ic10$, var27, (SubLObject)module0043.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic25$, (SubLObject)module0043.$ic26$, var15), (SubLObject)ConsesLow.list((SubLObject)module0043.$ic12$, (SubLObject)ConsesLow.listS((SubLObject)module0043.$ic28$, var24, (SubLObject)module0043.$ic11$))), var22);
                    }
                    if (var11.eql((SubLObject)module0043.$ic1$)) {
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)module0043.$ic10$, var28, (SubLObject)module0043.$ic29$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic25$, (SubLObject)module0043.$ic26$, var15), (SubLObject)ConsesLow.listS((SubLObject)module0043.$ic30$, (SubLObject)module0043.$ic26$, var24, (SubLObject)module0043.$ic31$), (SubLObject)module0043.$ic32$), var23);
                    }
                    else if (var11.eql((SubLObject)module0043.$ic4$)) {
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)module0043.$ic10$, var28, (SubLObject)module0043.$ic29$, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic25$, (SubLObject)module0043.$ic26$, var15), (SubLObject)ConsesLow.listS((SubLObject)module0043.$ic33$, var24, (SubLObject)module0043.$ic29$), (SubLObject)module0043.$ic32$), var23);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var34_35, (SubLObject)module0043.$ic24$);
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
            return (SubLObject)ConsesLow.listS((SubLObject)module0043.$ic34$, var20, var21, ConsesLow.append(Sequences.nreverse(var22), Sequences.nreverse(var23), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0043.IDENTITY, (SubLObject)ConsesLow.list((SubLObject)module0043.$ic17$, var6)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0043.$ic9$);
        return (SubLObject)module0043.NIL;
    }
    
    public static SubLObject f3122(final SubLObject var6, final SubLObject var7) {
        final SubLObject var8 = Packages.intern(Sequences.cconcatenate(module0006.f203(var6), (SubLObject)module0043.$ic35$), module0018.$g577$.getGlobalValue());
        final SubLObject var9 = Packages.intern(Sequences.cconcatenate((SubLObject)module0043.$ic36$, module0006.f203(var6)), module0018.$g577$.getGlobalValue());
        SubLObject var10 = (SubLObject)module0043.NIL;
        SubLObject var11 = (SubLObject)module0043.NIL;
        SubLObject var12 = var7;
        SubLObject var13 = (SubLObject)module0043.NIL;
        var13 = var12.first();
        while (module0043.NIL != var12) {
            final SubLObject var14 = Symbols.make_keyword(var13);
            final SubLObject var15 = Packages.intern(Sequences.cconcatenate(module0006.f203(var6), new SubLObject[] { module0043.$ic37$, module0006.f203(var13) }), module0018.$g577$.getGlobalValue());
            final SubLObject var16 = Packages.intern(Sequences.cconcatenate((SubLObject)module0043.$ic38$, new SubLObject[] { module0006.f203(var6), module0043.$ic37$, module0006.f203(var13) }), module0018.$g577$.getGlobalValue());
            var10 = (SubLObject)ConsesLow.cons(var14, var10);
            var11 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var15, var16), var11);
            var12 = var12.rest();
            var13 = var12.first();
        }
        return (SubLObject)ConsesLow.list(var8, var9, Sequences.nreverse(var10), Sequences.nreverse(var11));
    }
    
    public static SubLObject f3123() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0043", "f3117", "DEFSTRUCT-VECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0043", "f3119", "DEFSTRUCT-LIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0043", "f3120", "DEFSTRUCT-VECTOR-CONSTRUCTOR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0043", "f3121", "DEFSTRUCT-LIST-CONSTRUCTOR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0043", "f3118", "S#4496", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0043", "f3122", "S#4497", 2, 0, false);
        return (SubLObject)module0043.NIL;
    }
    
    public static SubLObject f3124() {
        return (SubLObject)module0043.NIL;
    }
    
    public static SubLObject f3125() {
        module0012.f375((SubLObject)module0043.$ic2$, (SubLObject)module0043.$ic0$, (SubLObject)module0043.$ic3$);
        module0012.f375((SubLObject)module0043.$ic5$, (SubLObject)module0043.$ic0$, (SubLObject)module0043.$ic6$);
        module0002.f38((SubLObject)module0043.$ic7$);
        module0002.f50((SubLObject)module0043.$ic7$, (SubLObject)module0043.$ic2$);
        module0002.f38((SubLObject)module0043.$ic8$);
        module0002.f50((SubLObject)module0043.$ic8$, (SubLObject)module0043.$ic5$);
        return (SubLObject)module0043.NIL;
    }
    
    public void declareFunctions() {
        f3123();
    }
    
    public void initializeVariables() {
        f3124();
    }
    
    public void runTopLevelForms() {
        f3125();
    }
    
    static {
        me = (SubLFile)new module0043();
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#4498", "CYC"));
        $ic1$ = SubLObjectFactory.makeKeyword("VECTOR");
        $ic2$ = SubLObjectFactory.makeSymbol("DEFSTRUCT-VECTOR");
        $ic3$ = SubLObjectFactory.makeString("A simplified version of DEFSTRUCT that just creates and manipulates vector objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");
        $ic4$ = SubLObjectFactory.makeKeyword("LIST");
        $ic5$ = SubLObjectFactory.makeSymbol("DEFSTRUCT-LIST");
        $ic6$ = SubLObjectFactory.makeString("A simplified version of DEFSTRUCT that just creates and manipulates list objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");
        $ic7$ = SubLObjectFactory.makeSymbol("DEFSTRUCT-VECTOR-CONSTRUCTOR");
        $ic8$ = SubLObjectFactory.makeSymbol("DEFSTRUCT-LIST-CONSTRUCTOR");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4499", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4500", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4501", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("DEFINE");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic12$ = SubLObjectFactory.makeSymbol("RET");
        $ic13$ = SubLObjectFactory.makeSymbol("CAND");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTORP"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic15$ = SubLObjectFactory.makeSymbol("=");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC")));
        $ic17$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)module0043.ZERO_INTEGER));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC")));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2028", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#755", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4502", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic26$ = SubLObjectFactory.makeSymbol("OBJECT", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("AREF");
        $ic28$ = SubLObjectFactory.makeSymbol("NTH");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("SET-AREF");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC")));
        $ic33$ = SubLObjectFactory.makeSymbol("SET-NTH");
        $ic34$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic35$ = SubLObjectFactory.makeString("-P");
        $ic36$ = SubLObjectFactory.makeString("MAKE-");
        $ic37$ = SubLObjectFactory.makeString("-");
        $ic38$ = SubLObjectFactory.makeString("SET-");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0043.class
	Total time: 85 ms
	
	Decompiled with Procyon 0.5.32.
*/