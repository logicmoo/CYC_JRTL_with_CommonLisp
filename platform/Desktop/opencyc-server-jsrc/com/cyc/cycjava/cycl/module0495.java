package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0495 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0495";
    public static final String myFingerPrint = "4e0ed3816b2fc8e5c8ade5a044d7b97fd9d8c8fed14c26c67abd82cbe4621fea";
    private static SubLSymbol $g3770$;
    private static SubLSymbol $g3771$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLInteger $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    
    public static SubLObject f32121(final SubLObject var1, SubLObject var2) {
        if (var2 == module0495.UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)module0495.IDENTITY);
        }
        return module0229.f15258(var1, Symbols.symbol_function((SubLObject)module0495.$ic0$), var2, (SubLObject)module0495.UNPROVIDED);
    }
    
    public static SubLObject f32122(final SubLObject var1, SubLObject var2) {
        if (var2 == module0495.UNPROVIDED) {
            var2 = Symbols.symbol_function((SubLObject)module0495.IDENTITY);
        }
        return module0229.f15258(var1, Symbols.symbol_function((SubLObject)module0495.$ic1$), var2, (SubLObject)module0495.UNPROVIDED);
    }
    
    public static SubLObject f32123(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32124(var3);
    }
    
    public static SubLObject f32125(final SubLObject var5, final SubLObject var6, final SubLObject var7) {
        return f32126(module0495.$ic2$, var5, var6, var7);
    }
    
    public static SubLObject f32127(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32124(var3);
    }
    
    public static SubLObject f32128(final SubLObject var5, final SubLObject var6, final SubLObject var7) {
        return f32126(module0495.$ic4$, var5, var6, var7);
    }
    
    public static SubLObject f32124(final SubLObject var3) {
        return module0004.f105(module0205.f13388(var3, (SubLObject)module0495.UNPROVIDED));
    }
    
    public static SubLObject f32126(final SubLObject var8, final SubLObject var5, final SubLObject var9, final SubLObject var7) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0610.f37287(var9, (SubLObject)module0495.$ic9$);
        SubLObject var12 = (SubLObject)module0495.NIL;
        var10.resetMultipleValues();
        SubLObject var13 = module0611.f37347(var7, var11);
        final SubLObject var14 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        if (module0495.NIL != var14) {
            if (var8.eql(module0495.$ic2$)) {
                var13 = f32121(var13, Symbols.symbol_function((SubLObject)module0495.$ic10$));
            }
            else if (var8.eql(module0495.$ic4$)) {
                var13 = f32122(var13, Symbols.symbol_function((SubLObject)module0495.$ic10$));
            }
            final SubLObject var15 = module0035.f2380(var5, var13, Symbols.symbol_function((SubLObject)module0495.EQUAL), Symbols.symbol_function((SubLObject)module0495.$ic10$));
            var12 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0495.$ic11$), var15);
        }
        return module0052.f3709(var12);
    }
    
    public static SubLObject f32129(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32124(var3);
    }
    
    public static SubLObject f32130(final SubLObject var5, final SubLObject var9, final SubLObject var7) {
        return f32126(module0495.$ic2$, var5, var9, var7);
    }
    
    public static SubLObject f32131(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32124(var3);
    }
    
    public static SubLObject f32132(final SubLObject var5, final SubLObject var9, final SubLObject var7) {
        return f32126(module0495.$ic4$, var5, var9, var7);
    }
    
    public static SubLObject f32133(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32124(var3);
    }
    
    public static SubLObject f32134(final SubLObject var5, final SubLObject var9, final SubLObject var7) {
        return f32126(module0495.$ic2$, var5, var9, var7);
    }
    
    public static SubLObject f32135(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32124(var3);
    }
    
    public static SubLObject f32136(final SubLObject var5, final SubLObject var9, final SubLObject var7) {
        return f32126(module0495.$ic4$, var5, var9, var7);
    }
    
    public static SubLObject f32137(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return module0549.f33895(module0205.f13389(var3, (SubLObject)module0495.UNPROVIDED));
    }
    
    public static SubLObject f32138(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32139(var3);
    }
    
    public static SubLObject f32140(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return module0549.f33895(module0205.f13389(var3, (SubLObject)module0495.UNPROVIDED));
    }
    
    public static SubLObject f32141(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32139(var3);
    }
    
    public static SubLObject f32139(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0205.f13333(var3);
        SubLObject var7;
        final SubLObject var6 = var7 = module0205.f13385(var3, (SubLObject)module0495.UNPROVIDED);
        SubLObject var8 = (SubLObject)module0495.NIL;
        SubLObject var9 = (SubLObject)module0495.NIL;
        SubLObject var10 = (SubLObject)module0495.NIL;
        SubLObject var11 = (SubLObject)module0495.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0495.$ic24$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0495.$ic24$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0495.$ic24$);
        var10 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0495.$ic24$);
        var11 = var7.first();
        var7 = var7.rest();
        if (module0495.NIL == var7) {
            final SubLObject var12 = module0610.f37287(var10, (SubLObject)module0495.$ic9$);
            var4.resetMultipleValues();
            SubLObject var13 = module0611.f37347(var11, var12);
            final SubLObject var14 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            if (module0495.NIL != var14) {
                final SubLObject var15 = var5;
                if (var15.eql(module0495.$ic2$)) {
                    var13 = f32121(var13, Symbols.symbol_function((SubLObject)module0495.$ic10$));
                }
                else if (var15.eql(module0495.$ic4$)) {
                    var13 = f32122(var13, Symbols.symbol_function((SubLObject)module0495.$ic10$));
                }
                SubLObject var16;
                var13 = (var16 = f32142(var13));
                SubLObject var17 = (SubLObject)module0495.NIL;
                var17 = var16.first();
                while (module0495.NIL != var16) {
                    var4.resetMultipleValues();
                    final SubLObject var18 = module0235.f15474((SubLObject)ConsesLow.cons(var8, var9), var17, (SubLObject)module0495.T, (SubLObject)module0495.T);
                    final SubLObject var19 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    if (module0495.NIL != var18) {
                        final SubLObject var20 = module0233.f15361(var18, var9);
                        final SubLObject var21 = module0233.f15361(var18, var8);
                        final SubLObject var22 = (SubLObject)ConsesLow.list(var5, var21, var20, var10, var11);
                        final SubLObject var23 = module0191.f11990((SubLObject)module0495.$ic25$, var22, (SubLObject)module0495.UNPROVIDED, (SubLObject)module0495.UNPROVIDED);
                        module0347.f23330(var23, var18, var19);
                    }
                    var16 = var16.rest();
                    var17 = var16.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0495.$ic24$);
        }
        return (SubLObject)module0495.NIL;
    }
    
    public static SubLObject f32142(final SubLObject var13) {
        if (module0495.NIL != var13) {
            final SubLObject var14 = var13.first();
            SubLObject var15 = var14.rest();
            SubLObject var16 = (SubLObject)module0495.ONE_INTEGER;
            SubLObject var17 = (SubLObject)module0495.ONE_INTEGER;
            ConsesLow.rplacd(var14, var16);
            SubLObject var18 = var13.rest();
            SubLObject var19 = (SubLObject)module0495.NIL;
            var19 = var18.first();
            while (module0495.NIL != var18) {
                var17 = Numbers.add(var17, (SubLObject)module0495.ONE_INTEGER);
                final SubLObject var20 = var19.rest();
                if (!var15.equal(var20)) {
                    var16 = var17;
                }
                ConsesLow.rplacd(var19, var16);
                var15 = var20;
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return var13;
    }
    
    public static SubLObject f32143(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return module0205.f13360(module0205.f13389(var3, (SubLObject)module0495.UNPROVIDED), (SubLObject)module0495.UNPROVIDED);
    }
    
    public static SubLObject f32144(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32139(var3);
    }
    
    public static SubLObject f32145(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return module0205.f13360(module0205.f13389(var3, (SubLObject)module0495.UNPROVIDED), (SubLObject)module0495.UNPROVIDED);
    }
    
    public static SubLObject f32146(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32139(var3);
    }
    
    public static SubLObject f32147(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32139(var3);
    }
    
    public static SubLObject f32148(final SubLObject var3, SubLObject var4) {
        if (var4 == module0495.UNPROVIDED) {
            var4 = (SubLObject)module0495.NIL;
        }
        return f32139(var3);
    }
    
    public static SubLObject f32149() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32121", "S#35511", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32122", "S#35512", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32123", "S#35513", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32125", "S#35514", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32127", "S#35515", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32128", "S#35516", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32124", "S#35517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32126", "S#35518", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32129", "S#35519", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32130", "S#35520", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32131", "S#35521", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32132", "S#35522", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32133", "S#35523", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32134", "S#35524", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32135", "S#35525", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32136", "S#35526", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32137", "S#35527", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32138", "S#35528", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32140", "S#35529", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32141", "S#35530", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32139", "S#35531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32142", "S#35532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32143", "S#35533", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32144", "S#35534", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32145", "S#35535", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32146", "S#35536", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32147", "S#35537", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0495", "f32148", "S#35538", 1, 1, false);
        return (SubLObject)module0495.NIL;
    }
    
    public static SubLObject f32150() {
        module0495.$g3770$ = SubLFiles.defparameter("S#35539", (SubLObject)module0495.ONE_INTEGER);
        module0495.$g3771$ = SubLFiles.defparameter("S#35540", (SubLObject)module0495.$ic30$);
        return (SubLObject)module0495.NIL;
    }
    
    public static SubLObject f32151() {
        module0340.f22938(module0495.$ic2$);
        module0358.f23771((SubLObject)module0495.$ic3$, module0495.$ic2$, (SubLObject)module0495.THREE_INTEGER);
        module0358.f23771((SubLObject)module0495.$ic3$, module0495.$ic2$, (SubLObject)module0495.FOUR_INTEGER);
        module0340.f22938(module0495.$ic4$);
        module0358.f23771((SubLObject)module0495.$ic3$, module0495.$ic4$, (SubLObject)module0495.THREE_INTEGER);
        module0358.f23771((SubLObject)module0495.$ic3$, module0495.$ic4$, (SubLObject)module0495.FOUR_INTEGER);
        module0340.f22941((SubLObject)module0495.$ic5$, (SubLObject)module0495.$ic6$);
        module0340.f22941((SubLObject)module0495.$ic7$, (SubLObject)module0495.$ic8$);
        module0340.f22941((SubLObject)module0495.$ic12$, (SubLObject)module0495.$ic13$);
        module0340.f22941((SubLObject)module0495.$ic14$, (SubLObject)module0495.$ic15$);
        module0340.f22941((SubLObject)module0495.$ic16$, (SubLObject)module0495.$ic17$);
        module0340.f22941((SubLObject)module0495.$ic18$, (SubLObject)module0495.$ic19$);
        module0340.f22941((SubLObject)module0495.$ic20$, (SubLObject)module0495.$ic21$);
        module0340.f22941((SubLObject)module0495.$ic22$, (SubLObject)module0495.$ic23$);
        module0340.f22941((SubLObject)module0495.$ic26$, (SubLObject)module0495.$ic27$);
        module0340.f22941((SubLObject)module0495.$ic28$, (SubLObject)module0495.$ic29$);
        module0340.f22941((SubLObject)module0495.$ic31$, (SubLObject)module0495.$ic32$);
        module0340.f22941((SubLObject)module0495.$ic33$, (SubLObject)module0495.$ic34$);
        return (SubLObject)module0495.NIL;
    }
    
    public void declareFunctions() {
        f32149();
    }
    
    public void initializeVariables() {
        f32150();
    }
    
    public void runTopLevelForms() {
        f32151();
    }
    
    static {
        me = (SubLFile)new module0495();
        module0495.$g3770$ = null;
        module0495.$g3771$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CYC-GREATER-THAN");
        $ic1$ = SubLObjectFactory.makeSymbol("CYC-LESS-THAN");
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement"));
        $ic3$ = SubLObjectFactory.makeKeyword("POS");
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement"));
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-N-COLLECTION");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35513", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35539", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35514", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement <whatever> <n> <collection> <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement #$Alaska-State 1 \n       #$State-UnitedStates\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $ic7$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-N-COLLECTION");
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35515", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35539", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35516", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <n> <collection> <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement #$Alaska-State 50 \n       #$State-UnitedStates\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $ic9$ = SubLObjectFactory.makeKeyword("HL");
        $ic10$ = SubLObjectFactory.makeSymbol("CDR");
        $ic11$ = SubLObjectFactory.makeSymbol("CAR");
        $ic12$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-N-THE-SET");
        $ic13$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35519", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35539", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35520", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement <whatever> <n> (#$TheSet . <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement ?WHAT 1 \n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)") });
        $ic14$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-N-THE-SET");
        $ic15$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35521", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35539", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35522", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <n> (#$TheSet . <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement ?WHAT 1\n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)") });
        $ic16$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-N-THE-SET-OF");
        $ic17$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35523", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35539", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35524", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement  <whatever> <n> (#$TheSetOf <var> <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement ?COUNTRY 1 \n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $ic18$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-N-THE-SET-OF");
        $ic19$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35525", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35539", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35526", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <n> (#$TheSetOf <var> <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement ?COUNTRY 1 \n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $ic20$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-ITERATE-COLLECTION");
        $ic21$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35527", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35528", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement <whatever> <not-fully-bound> <collection> <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement #$China-PeoplesRepublic ?NTH\n       #$IndependentCountry\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $ic22$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION");
        $ic23$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35529", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35530", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <not-fully-bound> <collection> <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement #$Belgium ?NTH\n       #$IndependentCountry\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35541", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"));
        $ic25$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-ITERATE-THE-SET");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35533", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35534", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement <whatever> <not-fully-bound> (TheSet . <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement 3 ?WHAT\n      (#$TheSet 1 2 3 -3)\n      #$AbsoluteValueFn)") });
        $ic28$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET");
        $ic29$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35535", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35536", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <not-fully-bound> (TheSet . <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement 3 ?WHAT\n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)") });
        $ic30$ = SubLObjectFactory.makeInteger(100);
        $ic31$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF");
        $ic32$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35540", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35537", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement  <whatever> <not-fully-bound> (#$TheSetOf <var> <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement #$France ?NTH\n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $ic33$ = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF");
        $ic34$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35540", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35538", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <not-fully-bound> (#$TheSetOf <var> <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement #$Denmark ?NTH\n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0495.class
	Total time: 212 ms
	
	Decompiled with Procyon 0.5.32.
*/