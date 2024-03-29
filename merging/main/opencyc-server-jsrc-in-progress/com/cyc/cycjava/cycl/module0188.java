package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0188 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0188";
    public static final String myFingerPrint = "edadd4f7cb34d0e6f114ba72a6fd87df6d5d5c68b7129c6f740df2f2dcc43d91";
    public static SubLSymbol $g2234$;
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
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLString $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    
    public static SubLObject f11766(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11_12 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic0$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var11_12, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var11_12 == $ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7), (SubLObject)$ic3$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f11767(final SubLObject var16) {
        return (SubLObject)makeBoolean(var16.isCons() && $ic6$ == var16.first() && NIL != module0191.f11995(var16.rest()));
    }
    
    public static SubLObject f11768(final SubLObject var17) {
        assert NIL != module0191.f11993(var17) : var17;
        final SubLObject var18 = module0191.f11986(var17, (SubLObject)T);
        return (SubLObject)ConsesLow.cons((SubLObject)$ic6$, var18);
    }
    
    public static SubLObject f11769(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        final SubLObject var8 = f11770(var7);
        final SubLObject var9 = f11768(var8);
        return var9;
    }
    
    public static SubLObject f11771(final SubLObject var19) {
        return var19.rest();
    }
    
    public static SubLObject f11772(final SubLObject var20, final SubLObject var17, final SubLObject var21) {
        final SubLObject var22 = f11773(var20, var17, module0130.f8524(var21), module0130.f8523(var21));
        return var22;
    }
    
    public static SubLObject f11774(final SubLObject var22, final SubLObject var23) {
        final SubLObject var24 = module0191.f11981(var22);
        final SubLObject var25 = f11772(var22, var23, var24);
        return var25;
    }
    
    public static SubLObject f11773(final SubLObject var20, final SubLObject var17, final SubLObject var24, final SubLObject var25) {
        return module0185.f11679(var20, var17, var24, var25);
    }
    
    public static SubLObject f11775(final SubLObject var7) {
        return module0185.f11682(var7);
    }
    
    public static SubLObject f11776(final SubLObject var7, final SubLObject var26) {
        return module0185.f11688(var7, var26);
    }
    
    public static SubLObject f11777() {
        if (deduction_handles_oc.f11643().numG((SubLObject)ZERO_INTEGER)) {
            SubLObject var27;
            SubLObject var28;
            for (var27 = deduction_handles_oc.f11645(), var28 = (SubLObject)NIL; NIL == var28; var28 = deduction_handles_oc.f11675(random.random(var27))) {}
            return var28;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11778(final SubLObject var29, final SubLObject var17, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)$ic9$;
        }
        return module0185.f11683(var29, var17, var24);
    }
    
    public static SubLObject f11779(final SubLObject var30, final SubLObject var31) {
        return (SubLObject)makeBoolean(Sequences.length(var30).numE(Sequences.length(var31)) && NIL != module0035.f2201(var30, var31, (SubLObject)$ic10$));
    }
    
    public static SubLObject f11780(final SubLObject var32, final SubLObject var33) {
        return (SubLObject)makeBoolean(f11781(var32).equal(f11781(var33)) && module0191.f11924(var32).eql(module0191.f11924(var33)) && NIL != f11779(f11770(var32), f11770(var33)));
    }
    
    public static SubLObject f11782(final SubLObject var7, SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != deduction_handles_oc.f11659(var7) && NIL == deduction_handles_oc.f11665(var7, var34));
    }
    
    public static SubLObject f11783(final SubLObject var7) {
        return f11784(var7, (SubLObject)T);
    }
    
    public static SubLObject f11785(final SubLObject var7) {
        return f11784(var7, (SubLObject)NIL);
    }
    
    public static SubLObject f11784(final SubLObject var7, final SubLObject var35) {
        if (NIL != deduction_handles_oc.f11659(var7)) {
            SubLObject var36;
            SubLObject var37;
            SubLObject var38;
            for (var36 = (SubLObject)NIL, var37 = (SubLObject)NIL, var37 = f11770(var7); NIL == var36 && NIL != var37; var36 = (SubLObject)makeBoolean(NIL == module0178.f11314(var38) && (NIL == var35 || NIL == module0178.f11341(var38)) && NIL == module0179.f11424(var38) && NIL == module0191.f11952(var38)), var37 = var37.rest()) {
                var38 = var37.first();
            }
            return (SubLObject)makeBoolean(NIL == var36);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11786(final SubLObject var7) {
        if (NIL != deduction_handles_oc.f11659(var7)) {
            if (NIL != module0226.f14833(f11781(var7))) {
                return (SubLObject)T;
            }
            SubLObject var8 = f11770(var7);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                if (NIL != module0178.f11325(var9)) {
                    return (SubLObject)T;
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11787(final SubLObject var7) {
        return module0211.f13649(f11781(var7), $ic11$);
    }
    
    public static SubLObject f11788(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        return (SubLObject)((NIL != deduction_handles_oc.f11670(var7)) ? module0185.f11684(var7) : NIL);
    }
    
    public static SubLObject f11781(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        return (SubLObject)((NIL != deduction_handles_oc.f11670(var7)) ? module0185.f11684(var7) : NIL);
    }
    
    public static SubLObject f11789(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        if (NIL == deduction_handles_oc.f11670(var7)) {
            return (SubLObject)$ic18$;
        }
        return module0185.f11686(var7);
    }
    
    public static SubLObject f11790(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        return (SubLObject)((NIL != deduction_handles_oc.f11670(var7)) ? module0185.f11687(var7) : NIL);
    }
    
    public static SubLObject f11770(final SubLObject var7) {
        assert NIL != deduction_handles_oc.f11659(var7) : var7;
        return (SubLObject)((NIL != deduction_handles_oc.f11670(var7)) ? module0183.f11576(module0185.f11685(var7)) : NIL);
    }
    
    public static SubLObject f11791(final SubLObject var7) {
        final SubLObject var8 = f11781(var7);
        if (NIL != assertion_handles_oc.f11035(var8)) {
            return module0178.f11287(f11788(var7));
        }
        return Errors.error((SubLObject)$ic25$, var8);
    }
    
    public static SubLObject f11792(final SubLObject var20, final SubLObject var17, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)$ic9$;
        }
        final SubLObject var25 = f11778(var20, var17, var24);
        return (SubLObject)((NIL != deduction_handles_oc.f11659(var25)) ? deduction_handles_oc.f11649(var25) : NIL);
    }
    
    public static SubLObject f11793(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != module0035.f2014(var16) && NIL != module0035.f1995(var16, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.f2370((SubLObject)$ic26$, var16, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f11794() {
        final SubLObject var39 = deduction_handles_oc.f11643();
        final SubLObject var40 = deduction_handles_oc.f11645();
        return (SubLObject)ConsesLow.list(var39, var40);
    }
    
    public static SubLObject f11795(final SubLObject var41) {
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var41, var41, (SubLObject)$ic27$);
        var42 = var41.first();
        SubLObject var44 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var41, (SubLObject)$ic27$);
        var43 = var44.first();
        var44 = var44.rest();
        if (NIL == var44) {
            return (SubLObject)makeBoolean(var42.numE(deduction_handles_oc.f11643()) && var43.numE(deduction_handles_oc.f11645()));
        }
        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)$ic27$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11796(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = deduction_handles_oc.f11649(var7);
        final SubLObject var10 = $g2234$.getDynamicValue(var8);
        if (NIL != var10) {
            var9 = module0065.f4750(var10, var9, (SubLObject)UNPROVIDED);
        }
        return var9;
    }
    
    public static SubLObject f11797(final SubLObject var49) {
        return deduction_handles_oc.f11675(var49);
    }
    
    public static SubLObject f11798(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic28$, (SubLObject)$ic29$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f11799() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0188", "f11766", "S#14572");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11767", "S#14573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11768", "S#14574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11769", "S#14575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11771", "S#14576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11772", "S#14577", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11774", "S#14305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11773", "S#14578", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11775", "S#14307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11776", "S#14579", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11777", "S#14580", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11778", "S#14581", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11779", "S#14539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11780", "S#14582", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11782", "S#14583", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11783", "S#14188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11785", "S#14189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11784", "S#14584", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11786", "S#14585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11787", "S#14586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11788", "DEDUCTION-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11781", "DEDUCTION-SUPPORTED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11789", "DEDUCTION-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11790", "DEDUCTION-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11770", "DEDUCTION-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11791", "S#14587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11792", "S#14588", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11793", "S#14589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11794", "S#14590", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11795", "S#14591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11796", "S#14592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0188", "f11797", "S#14593", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0188", "f11798", "S#14493");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11800() {
        $g2234$ = SubLFiles.defparameter("S#14594", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11801() {
        module0012.f588((SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)$ic16$);
        module0012.f368((SubLObject)$ic17$, (SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)$ic16$);
        module0012.f368((SubLObject)$ic19$, (SubLObject)$ic13$, (SubLObject)$ic20$, (SubLObject)$ic15$, (SubLObject)$ic21$);
        module0012.f368((SubLObject)$ic22$, (SubLObject)$ic13$, (SubLObject)$ic23$, (SubLObject)$ic15$, (SubLObject)$ic24$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f11799();
    }
    
    public void initializeVariables() {
        f11800();
    }
    
    public void runTopLevelForms() {
        f11801();
    }
    
    static {
        me = (SubLFile)new module0188();
        $g2234$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14595", "CYC"), (SubLObject)makeSymbol("DEDUCTION", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("DONE");
        $ic4$ = makeSymbol("DO-LIST");
        $ic5$ = makeSymbol("DEDUCTION-SUPPORTS");
        $ic6$ = makeKeyword("DEDUCTION");
        $ic7$ = makeSymbol("S#14254", "CYC");
        $ic8$ = makeSymbol("DEDUCTION-P");
        $ic9$ = makeKeyword("TRUE");
        $ic10$ = makeSymbol("S#14596", "CYC");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("skolem"));
        $ic12$ = makeSymbol("DEDUCTION-ASSERTION");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("DEDUCTION", "CYC"));
        $ic14$ = makeString("Return the support for which DEDUCTION is a deduction.");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEDUCTION", "CYC"), (SubLObject)makeSymbol("DEDUCTION-P")));
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("SUPPORT-P"));
        $ic17$ = makeSymbol("DEDUCTION-SUPPORTED-OBJECT");
        $ic18$ = makeKeyword("UNKNOWN");
        $ic19$ = makeSymbol("DEDUCTION-TRUTH");
        $ic20$ = makeString("Return the truth of DEDUCTION -- either :true :false or :unknown.");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("TRUTH-P"));
        $ic22$ = makeSymbol("DEDUCTION-STRENGTH");
        $ic23$ = makeString("Return the current argumentation strength of DEDUCTION -- either :monotonic, :default, or :unknown.");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("EL-STRENGTH-P"));
        $ic25$ = makeString("Implement deduction mt for non-assertion supported objects like ~a");
        $ic26$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("S#13597", "CYC"), (SubLObject)makeSymbol("S#13598", "CYC"));
        $ic28$ = makeSymbol("CLET");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14594", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14460", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9681", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#14592", "CYC"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 140 ms
	
	Decompiled with Procyon 0.5.32.
*/