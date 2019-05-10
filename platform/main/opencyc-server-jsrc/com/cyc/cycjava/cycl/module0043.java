package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return f3118((SubLObject)$ic1$, var6, var7);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3119(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return f3118((SubLObject)$ic4$, var6, var7);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3120(final SubLObject var11, final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = Vectors.make_vector(var12, (SubLObject)NIL);
        Vectors.set_aref(var15, (SubLObject)ZERO_INTEGER, var11);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var16 = (SubLObject)NIL, var16 = var14; NIL != var16; var16 = conses_high.cddr(var16)) {
            var17 = var16.first();
            var18 = conses_high.cadr(var16);
            var19 = Sequences.position(var17, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            Vectors.set_aref(var15, module0048.f_1X(var19), var18);
        }
        return var15;
    }
    
    public static SubLObject f3121(final SubLObject var11, final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = (SubLObject)ConsesLow.make_list(var12, (SubLObject)NIL);
        ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var15, var11);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var16 = (SubLObject)NIL, var16 = var14; NIL != var16; var16 = conses_high.cddr(var16)) {
            var17 = var16.first();
            var18 = conses_high.cadr(var16);
            var19 = Sequences.position(var17, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            ConsesLow.set_nth(module0048.f_1X(var19), var15, var18);
        }
        return var15;
    }
    
    public static SubLObject f3118(final SubLObject var11, final SubLObject var6, final SubLObject var7) {
        final SubLObject var12 = f3122(var6, var7);
        SubLObject var14;
        final SubLObject var13 = var14 = var12;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic9$);
        var15 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic9$);
        var16 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic9$);
        var17 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic9$);
        var18 = var14.first();
        var14 = var14.rest();
        if (NIL == var14) {
            final SubLObject var19 = Numbers.add((SubLObject)ONE_INTEGER, Sequences.length(var7));
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            if (var11.eql((SubLObject)$ic1$)) {
                var20 = (SubLObject)ConsesLow.list((SubLObject)$ic10$, var15, (SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, var19, (SubLObject)$ic16$), (SubLObject)ConsesLow.listS((SubLObject)EQ, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var6), (SubLObject)$ic18$))));
            }
            else if (var11.eql((SubLObject)$ic4$)) {
                var20 = (SubLObject)ConsesLow.list((SubLObject)$ic10$, var15, (SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)$ic19$, (SubLObject)ConsesLow.listS((SubLObject)EQ, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var6), (SubLObject)$ic20$), (SubLObject)$ic21$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, var19, (SubLObject)$ic16$))));
            }
            if (var11.eql((SubLObject)$ic1$)) {
                var21 = (SubLObject)ConsesLow.list((SubLObject)$ic10$, var16, (SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var6), var19, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var17), (SubLObject)$ic23$)));
            }
            else if (var11.eql((SubLObject)$ic4$)) {
                var21 = (SubLObject)ConsesLow.list((SubLObject)$ic10$, var16, (SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.listS((SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var6), var19, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var17), (SubLObject)$ic23$)));
            }
            SubLObject var24 = (SubLObject)ZERO_INTEGER;
            SubLObject var25 = var18;
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                var24 = Numbers.add(var24, (SubLObject)ONE_INTEGER);
                SubLObject var36_37;
                final SubLObject var34_35 = var36_37 = var26;
                SubLObject var27 = (SubLObject)NIL;
                SubLObject var28 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var36_37, var34_35, (SubLObject)$ic24$);
                var27 = var36_37.first();
                var36_37 = var36_37.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var36_37, var34_35, (SubLObject)$ic24$);
                var28 = var36_37.first();
                var36_37 = var36_37.rest();
                if (NIL == var36_37) {
                    if (var11.eql((SubLObject)$ic1$)) {
                        var22 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic10$, var27, (SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)$ic26$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)$ic26$, var24))), var22);
                    }
                    else if (var11.eql((SubLObject)$ic4$)) {
                        var22 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic10$, var27, (SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)$ic26$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.listS((SubLObject)$ic28$, var24, (SubLObject)$ic11$))), var22);
                    }
                    if (var11.eql((SubLObject)$ic1$)) {
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)$ic10$, var28, (SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)$ic26$, var15), (SubLObject)ConsesLow.listS((SubLObject)$ic30$, (SubLObject)$ic26$, var24, (SubLObject)$ic31$), (SubLObject)$ic32$), var23);
                    }
                    else if (var11.eql((SubLObject)$ic4$)) {
                        var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)$ic10$, var28, (SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)$ic26$, var15), (SubLObject)ConsesLow.listS((SubLObject)$ic33$, var24, (SubLObject)$ic29$), (SubLObject)$ic32$), var23);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var34_35, (SubLObject)$ic24$);
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
            return (SubLObject)ConsesLow.listS((SubLObject)$ic34$, var20, var21, ConsesLow.append(Sequences.nreverse(var22), Sequences.nreverse(var23), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)IDENTITY, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var6)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3122(final SubLObject var6, final SubLObject var7) {
        final SubLObject var8 = Packages.intern(Sequences.cconcatenate(module0006.f203(var6), (SubLObject)$ic35$), module0018.$g577$.getGlobalValue());
        final SubLObject var9 = Packages.intern(Sequences.cconcatenate((SubLObject)$ic36$, module0006.f203(var6)), module0018.$g577$.getGlobalValue());
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var7;
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            final SubLObject var14 = Symbols.make_keyword(var13);
            final SubLObject var15 = Packages.intern(Sequences.cconcatenate(module0006.f203(var6), new SubLObject[] { $ic37$, module0006.f203(var13) }), module0018.$g577$.getGlobalValue());
            final SubLObject var16 = Packages.intern(Sequences.cconcatenate((SubLObject)$ic38$, new SubLObject[] { module0006.f203(var6), $ic37$, module0006.f203(var13) }), module0018.$g577$.getGlobalValue());
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3124() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3125() {
        module0012.f375((SubLObject)$ic2$, (SubLObject)$ic0$, (SubLObject)$ic3$);
        module0012.f375((SubLObject)$ic5$, (SubLObject)$ic0$, (SubLObject)$ic6$);
        module0002.f38((SubLObject)$ic7$);
        module0002.f50((SubLObject)$ic7$, (SubLObject)$ic2$);
        module0002.f38((SubLObject)$ic8$);
        module0002.f50((SubLObject)$ic8$, (SubLObject)$ic5$);
        return (SubLObject)NIL;
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
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#4498", "CYC"));
        $ic1$ = makeKeyword("VECTOR");
        $ic2$ = makeSymbol("DEFSTRUCT-VECTOR");
        $ic3$ = makeString("A simplified version of DEFSTRUCT that just creates and manipulates vector objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");
        $ic4$ = makeKeyword("LIST");
        $ic5$ = makeSymbol("DEFSTRUCT-LIST");
        $ic6$ = makeString("A simplified version of DEFSTRUCT that just creates and manipulates list objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");
        $ic7$ = makeSymbol("DEFSTRUCT-VECTOR-CONSTRUCTOR");
        $ic8$ = makeSymbol("DEFSTRUCT-LIST-CONSTRUCTOR");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#4499", "CYC"), (SubLObject)makeSymbol("S#4500", "CYC"), (SubLObject)makeSymbol("S#4501", "CYC"));
        $ic10$ = makeSymbol("DEFINE");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic12$ = makeSymbol("RET");
        $ic13$ = makeSymbol("CAND");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("VECTORP"), (SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic15$ = makeSymbol("=");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LENGTH"), (SubLObject)makeSymbol("OBJECT", "CYC")));
        $ic17$ = makeSymbol("QUOTE");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("AREF"), (SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)ZERO_INTEGER));
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("CONSP"), (SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CAR"), (SubLObject)makeSymbol("OBJECT", "CYC")));
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#2028", "CYC"), (SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#30", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#30", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#755", "CYC"), (SubLObject)makeSymbol("S#4502", "CYC"));
        $ic25$ = makeSymbol("CHECK-TYPE");
        $ic26$ = makeSymbol("OBJECT", "CYC");
        $ic27$ = makeSymbol("AREF");
        $ic28$ = makeSymbol("NTH");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic30$ = makeSymbol("SET-AREF");
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)makeSymbol("OBJECT", "CYC")));
        $ic33$ = makeSymbol("SET-NTH");
        $ic34$ = makeSymbol("PROGN");
        $ic35$ = makeString("-P");
        $ic36$ = makeString("MAKE-");
        $ic37$ = makeString("-");
        $ic38$ = makeString("SET-");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 85 ms
	
	Decompiled with Procyon 0.5.32.
*/