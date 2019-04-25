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
        return (SubLObject)SubLObjectFactory.makeBoolean((!module0442.ONE_INTEGER.eql(module0222.f14650(module0442.$ic0$)) || module0442.NIL != module0222.f14635(module0442.$ic0$, var1, (SubLObject)module0442.ONE_INTEGER, (SubLObject)module0442.UNPROVIDED)) && module0442.NIL != module0220.f14544(var1, module0442.$ic0$, (SubLObject)module0442.ONE_INTEGER, (SubLObject)module0442.$ic1$));
    }
    
    public static SubLObject f30740(final SubLObject var3) {
        return module0220.f14562(var3, module0442.$ic0$, (SubLObject)module0442.ONE_INTEGER, (SubLObject)module0442.TWO_INTEGER, (SubLObject)module0442.$ic1$);
    }
    
    public static SubLObject f30741(final SubLObject var4, SubLObject var5) {
        if (var5 == module0442.UNPROVIDED) {
            var5 = (SubLObject)module0442.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0144.$g1810$.currentBinding(var6);
        try {
            module0144.$g1810$.bind((SubLObject)module0442.NIL, var6);
            final SubLObject var8 = Sequences.find_if((SubLObject)module0442.$ic2$, module0205.f13385(var4, (SubLObject)module0442.UNPROVIDED), (SubLObject)module0442.UNPROVIDED, (SubLObject)module0442.UNPROVIDED, (SubLObject)module0442.UNPROVIDED);
            SubLObject var9 = (SubLObject)module0442.NIL;
            SubLObject var11;
            final SubLObject var10 = var11 = module0205.f13180(var4, (SubLObject)module0442.UNPROVIDED);
            SubLObject var12 = (SubLObject)module0442.NIL;
            SubLObject var13 = (SubLObject)module0442.NIL;
            SubLObject var14 = (SubLObject)module0442.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0442.$ic3$);
            var12 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0442.$ic3$);
            var13 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0442.$ic3$);
            var14 = var11.first();
            var11 = var11.rest();
            if (module0442.NIL == var11) {
                var6.resetMultipleValues();
                final SubLObject var15 = module0235.f15474(var13, var14, (SubLObject)module0442.T, (SubLObject)module0442.T);
                final SubLObject var16 = var6.secondMultipleValue();
                var6.resetMultipleValues();
                if (module0442.NIL != var15 && module0442.NIL == var9) {
                    SubLObject var17 = f30740(var12);
                    SubLObject var18 = (SubLObject)module0442.NIL;
                    var18 = var17.first();
                    while (module0442.NIL == var9 && module0442.NIL != var17) {
                        if (module0442.NIL != module0305.f20437(var8, var18, (SubLObject)module0442.UNPROVIDED)) {
                            final SubLObject var19 = module0233.f15361(var15, var4);
                            final SubLObject var20 = module0191.f11990((SubLObject)module0442.$ic4$, var19, (SubLObject)module0442.UNPROVIDED, (SubLObject)module0442.UNPROVIDED);
                            module0347.f23330(var20, var15, var16);
                            var9 = (SubLObject)module0442.T;
                        }
                        var17 = var17.rest();
                        var18 = var17.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)module0442.$ic3$);
            }
        }
        finally {
            module0144.$g1810$.rebind(var7, var6);
        }
        return (SubLObject)module0442.NIL;
    }
    
    public static SubLObject f30742(final SubLObject var4) {
        return (SubLObject)((module0442.NIL != module0193.f12105(var4)) ? module0442.$ic5$ : module0442.$ic6$);
    }
    
    public static SubLObject f30743(final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0442.NIL;
        final SubLObject var23 = module0202.f12826(var19);
        SubLObject var25;
        final SubLObject var24 = var25 = var23;
        SubLObject var26 = (SubLObject)module0442.NIL;
        SubLObject var27 = (SubLObject)module0442.NIL;
        SubLObject var28 = (SubLObject)module0442.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0442.$ic3$);
        var26 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0442.$ic3$);
        var27 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0442.$ic3$);
        var28 = var25.first();
        var25 = var25.rest();
        if (module0442.NIL == var25) {
            if (module0442.NIL != f30739(var26) && module0442.NIL == var22) {
                SubLObject var29 = f30740(var26);
                SubLObject var30 = (SubLObject)module0442.NIL;
                var30 = var29.first();
                while (module0442.NIL == var22 && module0442.NIL != var29) {
                    SubLObject var31 = (SubLObject)module0442.NIL;
                    final SubLObject var32 = module0147.f9540(var20);
                    final SubLObject var33 = module0147.$g2095$.currentBinding(var21);
                    final SubLObject var34 = module0147.$g2094$.currentBinding(var21);
                    final SubLObject var35 = module0147.$g2096$.currentBinding(var21);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var32), var21);
                        module0147.$g2094$.bind(module0147.f9546(var32), var21);
                        module0147.$g2096$.bind(module0147.f9549(var32), var21);
                        var31 = module0220.f14573(module0442.$ic0$, var26, var30, (SubLObject)module0442.ONE_INTEGER, (SubLObject)module0442.TWO_INTEGER, (SubLObject)module0442.$ic1$);
                    }
                    finally {
                        module0147.$g2096$.rebind(var35, var21);
                        module0147.$g2094$.rebind(var34, var21);
                        module0147.$g2095$.rebind(var33, var21);
                    }
                    if (module0442.NIL != var31 && module0442.NIL != module0305.f20437(var27, var30, (SubLObject)module0442.UNPROVIDED)) {
                        if (!var27.equal(var28)) {
                            var22 = (SubLObject)ConsesLow.cons(f30744(var28, var30, var20), var22);
                            var22 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0442.$ic10$, module0202.f12768(module0442.$ic11$, var27, var28), var20, (SubLObject)module0442.UNPROVIDED), var22);
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
            cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)module0442.$ic3$);
        }
        return var22;
    }
    
    public static SubLObject f30744(final SubLObject var29, final SubLObject var16, final SubLObject var20) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        SubLObject var31 = (SubLObject)module0442.NIL;
        final SubLObject var32 = module0147.f9540(var20);
        final SubLObject var33 = module0147.$g2095$.currentBinding(var30);
        final SubLObject var34 = module0147.$g2094$.currentBinding(var30);
        final SubLObject var35 = module0147.$g2096$.currentBinding(var30);
        try {
            module0147.$g2095$.bind(module0147.f9545(var32), var30);
            module0147.$g2094$.bind(module0147.f9546(var32), var30);
            module0147.$g2096$.bind(module0147.f9549(var32), var30);
            if (module0442.NIL != module0259.f16854(var29, var16, (SubLObject)module0442.UNPROVIDED, (SubLObject)module0442.UNPROVIDED)) {
                var31 = (SubLObject)module0442.$ic12$;
            }
            else if (module0442.NIL != module0305.f20437(var29, var16, (SubLObject)module0442.UNPROVIDED)) {
                var31 = (SubLObject)module0442.$ic13$;
            }
        }
        finally {
            module0147.$g2096$.rebind(var35, var30);
            module0147.$g2094$.rebind(var34, var30);
            module0147.$g2095$.rebind(var33, var30);
        }
        if (module0442.NIL == Errors.$ignore_mustsP$.getDynamicValue(var30) && module0442.NIL == var31) {
            Errors.error((SubLObject)module0442.$ic14$, var29, var16, var20);
        }
        return module0191.f11990(var31, module0202.f12768(module0442.$ic15$, var29, var16), var20, (SubLObject)module0442.UNPROVIDED);
    }
    
    public static SubLObject f30745() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30739", "S#33985", 1, 0, false);
        new $f30739$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30740", "S#33986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30741", "S#29825", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30742", "S#33987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30743", "S#24937", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0442", "f30744", "S#33988", 3, 0, false);
        return (SubLObject)module0442.NIL;
    }
    
    public static SubLObject f30746() {
        return (SubLObject)module0442.NIL;
    }
    
    public static SubLObject f30747() {
        module0012.f419((SubLObject)module0442.$ic7$);
        module0340.f22941((SubLObject)module0442.$ic8$, (SubLObject)module0442.$ic9$);
        return (SubLObject)module0442.NIL;
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
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("reflexiveOn"));
        $ic1$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic2$ = SubLObjectFactory.makeSymbol("FULLY-BOUND-P");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"));
        $ic4$ = SubLObjectFactory.makeKeyword("REFLEXIVE-ON");
        $ic5$ = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $ic6$ = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $ic7$ = SubLObjectFactory.makeSymbol("S#33987", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("REMOVAL-REFLEXIVE-ON");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0442.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33985", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1886", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33987", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#29825", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<reflexive predicate> arg1 arg2)\nwhere at least one of arg1 and arg2 is fully bound, \nby unification of arg1 and arg2\n"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$whollyLocatedAt-Spatial #$EarthsEquator ?X) in #$WorldGeographyMt\nvia\n (#$reflexiveOn #$whollyLocatedAt-Spatial #$SpaceRegion)\nand\n (#$isa #$EarthsEquator #$SpaceRegion)") });
        $ic10$ = SubLObjectFactory.makeKeyword("EQUALITY");
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic12$ = SubLObjectFactory.makeKeyword("ISA");
        $ic13$ = SubLObjectFactory.makeKeyword("DEFN");
        $ic14$ = SubLObjectFactory.makeString("Couldn't validate (#$isa ~S ~S) in ~S");
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
    }
    
    public static final class $f30739$UnaryFunction extends UnaryFunction
    {
        public $f30739$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33985"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return module0442.f30739(var2);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0442.class
	Total time: 129 ms
	
	Decompiled with Procyon 0.5.32.
*/