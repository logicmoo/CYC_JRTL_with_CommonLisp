package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0442 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0442";
    public static final String myFingerPrint = "73c4796a6598b0c194daa1aef1f63790dde4a265a6bc8d2154364d5fc873374f";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLObject $ic15$;
    
    public static SubLObject f30739(final SubLObject var1) {
        return (SubLObject)makeBoolean((!ONE_INTEGER.eql(module0222.f14650($ic0$)) || NIL != module0222.f14635($ic0$, var1, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) && NIL != module0220.f14544(var1, $ic0$, (SubLObject)ONE_INTEGER, (SubLObject)$ic1$));
    }
    
    public static SubLObject f30740(final SubLObject var3) {
        return module0220.f14562(var3, $ic0$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30741(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0144.$g1810$.currentBinding(var6);
        try {
            module0144.$g1810$.bind((SubLObject)NIL, var6);
            final SubLObject var8 = Sequences.find_if((SubLObject)$ic2$, module0205.f13385(var4, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var11;
            final SubLObject var10 = var11 = module0205.f13180(var4, (SubLObject)UNPROVIDED);
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var13 = (SubLObject)NIL;
            SubLObject var14 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic3$);
            var12 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic3$);
            var13 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic3$);
            var14 = var11.first();
            var11 = var11.rest();
            if (NIL == var11) {
                var6.resetMultipleValues();
                final SubLObject var15 = module0235.f15474(var13, var14, (SubLObject)T, (SubLObject)T);
                final SubLObject var16 = var6.secondMultipleValue();
                var6.resetMultipleValues();
                if (NIL != var15 && NIL == var9) {
                    SubLObject var17 = f30740(var12);
                    SubLObject var18 = (SubLObject)NIL;
                    var18 = var17.first();
                    while (NIL == var9 && NIL != var17) {
                        if (NIL != module0305.f20437(var8, var18, (SubLObject)UNPROVIDED)) {
                            final SubLObject var19 = module0233.f15361(var15, var4);
                            final SubLObject var20 = module0191.f11990((SubLObject)$ic4$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0347.f23330(var20, var15, var16);
                            var9 = (SubLObject)T;
                        }
                        var17 = var17.rest();
                        var18 = var17.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic3$);
            }
        }
        finally {
            module0144.$g1810$.rebind(var7, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30742(final SubLObject var4) {
        return (SubLObject)((NIL != module0193.f12105(var4)) ? $ic5$ : $ic6$);
    }
    
    public static SubLObject f30743(final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0202.f12826(var19);
        SubLObject var25;
        final SubLObject var24 = var25 = var23;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic3$);
        var26 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic3$);
        var27 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic3$);
        var28 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            if (NIL != f30739(var26) && NIL == var22) {
                SubLObject var29 = f30740(var26);
                SubLObject var30 = (SubLObject)NIL;
                var30 = var29.first();
                while (NIL == var22 && NIL != var29) {
                    SubLObject var31 = (SubLObject)NIL;
                    final SubLObject var32 = module0147.f9540(var20);
                    final SubLObject var33 = module0147.$g2095$.currentBinding(var21);
                    final SubLObject var34 = module0147.$g2094$.currentBinding(var21);
                    final SubLObject var35 = module0147.$g2096$.currentBinding(var21);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var32), var21);
                        module0147.$g2094$.bind(module0147.f9546(var32), var21);
                        module0147.$g2096$.bind(module0147.f9549(var32), var21);
                        var31 = module0220.f14573($ic0$, var26, var30, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic1$);
                    }
                    finally {
                        module0147.$g2096$.rebind(var35, var21);
                        module0147.$g2094$.rebind(var34, var21);
                        module0147.$g2095$.rebind(var33, var21);
                    }
                    if (NIL != var31 && NIL != module0305.f20437(var27, var30, (SubLObject)UNPROVIDED)) {
                        if (!var27.equal(var28)) {
                            var22 = (SubLObject)ConsesLow.cons(f30744(var28, var30, var20), var22);
                            var22 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic10$, module0202.f12768($ic11$, var27, var28), var20, (SubLObject)UNPROVIDED), var22);
                        }
                        var22 = (SubLObject)ConsesLow.cons(f30744(var27, var30, var20), var22);
                        var22 = (SubLObject)ConsesLow.cons(var31, var22);
                    }
                    var29 = var29.rest();
                    var30 = var29.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic3$);
        }
        return var22;
    }
    
    public static SubLObject f30744(final SubLObject var29, final SubLObject var16, final SubLObject var20) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        SubLObject var31 = (SubLObject)NIL;
        final SubLObject var32 = module0147.f9540(var20);
        final SubLObject var33 = module0147.$g2095$.currentBinding(var30);
        final SubLObject var34 = module0147.$g2094$.currentBinding(var30);
        final SubLObject var35 = module0147.$g2096$.currentBinding(var30);
        try {
            module0147.$g2095$.bind(module0147.f9545(var32), var30);
            module0147.$g2094$.bind(module0147.f9546(var32), var30);
            module0147.$g2096$.bind(module0147.f9549(var32), var30);
            if (NIL != module0259.f16854(var29, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var31 = (SubLObject)$ic12$;
            }
            else if (NIL != module0305.f20437(var29, var16, (SubLObject)UNPROVIDED)) {
                var31 = (SubLObject)$ic13$;
            }
        }
        finally {
            module0147.$g2096$.rebind(var35, var30);
            module0147.$g2094$.rebind(var34, var30);
            module0147.$g2095$.rebind(var33, var30);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var30) && NIL == var31) {
            Errors.error((SubLObject)$ic14$, var29, var16, var20);
        }
        return module0191.f11990(var31, module0202.f12768($ic15$, var29, var16), var20, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30745() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30739", "S#33985", 1, 0, false);
        new $f30739$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30740", "S#33986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30741", "S#29825", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30742", "S#33987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30743", "S#24937", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30744", "S#33988", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30746() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30747() {
        module0012.f419((SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30745();
    }
    
    public void initializeVariables() {
        f30746();
    }
    
    public void runTopLevelForms() {
        f30747();
    }
    
    static {
        me = (SubLFile)new module0442();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("reflexiveOn"));
        $ic1$ = makeKeyword("TRUE");
        $ic2$ = makeSymbol("FULLY-BOUND-P");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic4$ = makeKeyword("REFLEXIVE-ON");
        $ic5$ = makeKeyword("INCOMPLETE");
        $ic6$ = makeKeyword("GROSSLY-INCOMPLETE");
        $ic7$ = makeSymbol("S#33987", "CYC");
        $ic8$ = makeKeyword("REMOVAL-REFLEXIVE-ON");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#33985", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1886", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#33987", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("S#29825", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> arg1 arg2)\nwhere at least one of arg1 and arg2 is fully bound, \nby unification of arg1 and arg2\n"), makeKeyword("EXAMPLE"), makeString("(#$whollyLocatedAt-Spatial #$EarthsEquator ?X) in #$WorldGeographyMt\nvia\n (#$reflexiveOn #$whollyLocatedAt-Spatial #$SpaceRegion)\nand\n (#$isa #$EarthsEquator #$SpaceRegion)") });
        $ic10$ = makeKeyword("EQUALITY");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic12$ = makeKeyword("ISA");
        $ic13$ = makeKeyword("DEFN");
        $ic14$ = makeString("Couldn't validate (#$isa ~S ~S) in ~S");
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
    }
    
    public static final class $f30739$UnaryFunction extends UnaryFunction
    {
        public $f30739$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33985"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f30739(var2);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 129 ms
	
	Decompiled with Procyon 0.5.32.
*/