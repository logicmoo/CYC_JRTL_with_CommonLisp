package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0747 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0747";
    public static final String myFingerPrint = "559c6282a34299160fdf4fa524695f35ea32abe26cbe2ccb5677a9bef670672d";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
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
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    
    public static SubLObject f46308(SubLObject var1) {
        if (var1 == module0747.UNPROVIDED) {
            var1 = (SubLObject)module0747.NIL;
        }
        assert module0747.NIL != f46309(var1) : var1;
        final SubLObject var2 = module0067.f4880((SubLObject)module0747.UNPROVIDED, (SubLObject)module0747.UNPROVIDED);
        SubLObject var3;
        SubLObject var4;
        SubLObject var5;
        for (var3 = (SubLObject)module0747.NIL, var3 = var1; module0747.NIL != var3; var3 = conses_high.cddr(var3)) {
            var4 = var3.first();
            var5 = conses_high.cadr(var3);
            module0067.f4886(var2, var4, var5);
        }
        assert module0747.NIL != f46310(var2) : var2;
        return var2;
    }
    
    public static SubLObject f46311(final SubLObject var6) {
        return Types.keywordp(module0582.f35706(var6));
    }
    
    public static SubLObject f46312(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var7.eql((SubLObject)module0747.$ic3$) || module0747.NIL != f46310(var7));
    }
    
    public static SubLObject f46310(final SubLObject var7) {
        return module0067.f4852(var7);
    }
    
    public static SubLObject f46309(final SubLObject var7) {
        SubLObject var8 = (SubLObject)module0747.NIL;
        if (module0747.NIL != module0035.f2331(var7, (SubLObject)module0747.$ic4$)) {
            SubLObject var9 = (SubLObject)module0747.NIL;
            SubLObject var10;
            SubLObject var11;
            SubLObject var12;
            for (var10 = (SubLObject)module0747.NIL, var10 = var7; module0747.NIL != var10; var10 = conses_high.cddr(var10)) {
                var11 = var10.first();
                var12 = conses_high.cadr(var10);
                if (module0747.NIL == module0582.f35708(var11, var12)) {
                    var9 = (SubLObject)module0747.T;
                }
            }
            if (module0747.NIL == var9) {
                var8 = (SubLObject)module0747.T;
            }
        }
        return var8;
    }
    
    public static SubLObject f46313(final SubLObject var10, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var14;
        final SubLObject var13 = var14 = var10.rest();
        SubLObject var15 = (SubLObject)module0747.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0747.$ic5$);
        var15 = var14.first();
        final SubLObject var16;
        var14 = (var16 = var14.rest());
        final SubLObject var17 = (SubLObject)module0747.$ic6$;
        final SubLObject var18 = (SubLObject)module0747.$ic7$;
        SubLObject var19 = (SubLObject)module0747.NIL;
        final SubLObject var20 = module0582.f35711();
        SubLObject var23;
        for (SubLObject var21 = (SubLObject)module0747.NIL; module0747.NIL == var21; var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0747.NIL == var23)) {
            var12.resetMultipleValues();
            final SubLObject var22 = module0052.f3693(var20);
            var23 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (module0747.NIL != var23) {
                final SubLObject var24 = var22.first();
                final SubLObject var25 = module0582.f35707(var24);
                if (module0747.NIL != var25) {
                    var19 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0747.$ic8$, var18, var24)), var19);
                }
            }
        }
        var19 = Sort.sort(var19, Symbols.symbol_function((SubLObject)module0747.$ic9$), Symbols.symbol_function((SubLObject)module0747.$ic10$));
        return (SubLObject)ConsesLow.list((SubLObject)module0747.$ic11$, reader.bq_cons((SubLObject)ConsesLow.list(var18, var15), ConsesLow.append(var19, (SubLObject)ConsesLow.list(reader.bq_cons(var17, (SubLObject)module0747.$ic12$)))), (SubLObject)ConsesLow.listS((SubLObject)module0747.$ic13$, (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.listS((SubLObject)module0747.$ic8$, var18, (SubLObject)module0747.$ic14$)), ConsesLow.append(var16, (SubLObject)module0747.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0747.$ic15$, var17));
    }
    
    public static SubLObject f46314(final SubLObject var18, final SubLObject var4, SubLObject var25) {
        if (var25 == module0747.UNPROVIDED) {
            var25 = (SubLObject)module0747.T;
        }
        assert module0747.NIL != f46312(var18) : var18;
        final SubLObject var26 = (SubLObject)module0747.$ic17$;
        final SubLObject var27 = (module0747.NIL != module0067.f4852(var18)) ? module0067.f4885(var18, var4, var26) : var26;
        if (!var27.eql(var26)) {
            return var27;
        }
        if (module0747.NIL != var25 || var18.eql((SubLObject)module0747.$ic3$)) {
            return module0582.f35709(var4);
        }
        return (SubLObject)module0747.$ic18$;
    }
    
    public static SubLObject f46315(final SubLObject var7) {
        return module0161.f10481(var7);
    }
    
    public static SubLObject f46316(final SubLObject var28, final SubLObject var2) {
        final SubLObject var29 = f46317(var28, var2);
        SubLObject var30 = (SubLObject)module0747.NIL;
        SubLObject var31 = var29;
        SubLObject var32 = (SubLObject)module0747.NIL;
        var32 = var31.first();
        while (module0747.NIL != var31) {
            var30 = (SubLObject)ConsesLow.cons(f46318(var32, (SubLObject)module0747.NIL, (SubLObject)module0747.ZERO_INTEGER, (SubLObject)module0747.NIL, (SubLObject)module0747.NIL), var30);
            var31 = var31.rest();
            var32 = var31.first();
        }
        return Sequences.nreverse(var30);
    }
    
    public static SubLObject f46317(final SubLObject var28, final SubLObject var2) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f46314(var2, (SubLObject)module0747.$ic24$, (SubLObject)module0747.T);
        final SubLObject var31 = f46314(var2, (SubLObject)module0747.$ic25$, (SubLObject)module0747.T);
        final SubLObject var32 = f46314(var2, (SubLObject)module0747.$ic26$, (SubLObject)module0747.T);
        final SubLObject var33 = f46314(var2, (SubLObject)module0747.$ic27$, (SubLObject)module0747.T);
        final SubLObject var34 = f46314(var2, (SubLObject)module0747.$ic28$, (SubLObject)module0747.T);
        SubLObject var35 = (SubLObject)module0747.NIL;
        final SubLObject var36 = module0579.$g4304$.currentBinding(var29);
        try {
            module0579.$g4304$.bind((SubLObject)module0747.T, var29);
            final SubLObject var38_40 = module0579.$g4268$.currentBinding(var29);
            final SubLObject var37 = module0579.$g4287$.currentBinding(var29);
            final SubLObject var38 = module0579.$g4262$.currentBinding(var29);
            final SubLObject var39 = module0579.$g4277$.currentBinding(var29);
            final SubLObject var40 = module0579.$g4260$.currentBinding(var29);
            final SubLObject var41 = module0579.$g4290$.currentBinding(var29);
            final SubLObject var42 = module0579.$g4306$.currentBinding(var29);
            final SubLObject var43 = module0579.$g4276$.currentBinding(var29);
            final SubLObject var44 = module0579.$g4280$.currentBinding(var29);
            final SubLObject var45 = module0579.$g4291$.currentBinding(var29);
            final SubLObject var46 = module0579.$g4255$.currentBinding(var29);
            final SubLObject var47 = module0579.$g4245$.currentBinding(var29);
            final SubLObject var48 = module0579.$g4279$.currentBinding(var29);
            final SubLObject var49 = module0579.$g4274$.currentBinding(var29);
            try {
                module0579.$g4268$.bind(f46314(var2, (SubLObject)module0747.$ic29$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4287$.bind(f46314(var2, (SubLObject)module0747.$ic30$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4262$.bind(f46314(var2, (SubLObject)module0747.$ic27$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4277$.bind(f46314(var2, (SubLObject)module0747.$ic31$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4260$.bind(f46314(var2, (SubLObject)module0747.$ic26$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4290$.bind(f46314(var2, (SubLObject)module0747.$ic32$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4306$.bind(f46314(var2, (SubLObject)module0747.$ic33$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4276$.bind(f46314(var2, (SubLObject)module0747.$ic34$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4280$.bind(f46314(var2, (SubLObject)module0747.$ic35$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4291$.bind(f46314(var2, (SubLObject)module0747.$ic36$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4255$.bind(f46314(var2, (SubLObject)module0747.$ic37$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4245$.bind(f46314(var2, (SubLObject)module0747.$ic38$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4279$.bind(f46314(var2, (SubLObject)module0747.$ic39$, (SubLObject)module0747.UNPROVIDED), var29);
                module0579.$g4274$.bind(f46314(var2, (SubLObject)module0747.$ic40$, (SubLObject)module0747.UNPROVIDED), var29);
                SubLObject var50 = (SubLObject)module0747.NIL;
                final SubLObject var38_41 = module0580.$g4371$.currentBinding(var29);
                final SubLObject var41_56 = module0580.$g4369$.currentBinding(var29);
                final SubLObject var42_57 = module0580.$g4370$.currentBinding(var29);
                try {
                    module0580.$g4371$.bind((SubLObject)module0747.ZERO_INTEGER, var29);
                    module0580.$g4369$.bind(module0580.f35598(f46314(var2, (SubLObject)module0747.$ic41$, (SubLObject)module0747.UNPROVIDED)), var29);
                    module0580.$g4370$.bind(module0580.$g4370$.getDynamicValue(var29), var29);
                    module0580.$g4370$.setDynamicValue(module0580.f35596(), var29);
                    if (module0747.NIL == module0580.$g4370$.getDynamicValue(var29)) {
                        if ((var31 == module0747.$ic42$ || (var31 == module0747.$ic3$ && module0747.$ic42$ == module0751.f47036(var28))) && module0747.NIL != module0048.f3361(var34, (SubLObject)module0747.ONE_INTEGER)) {
                            final SubLObject var51 = (SubLObject)module0747.NIL;
                            final SubLObject var52 = (SubLObject)module0747.NIL;
                            final SubLObject var53 = module0770.f49079(var28, var30, var32, var33, var51, var52, (SubLObject)module0747.UNPROVIDED);
                            SubLObject var54 = (SubLObject)SubLObjectFactory.makeBoolean(var34.isInteger() && module0747.NIL != module0035.f2000(var35, var34, (SubLObject)module0747.UNPROVIDED));
                            if (module0747.NIL == var54) {
                                SubLObject var55 = var53;
                                SubLObject var56 = (SubLObject)module0747.NIL;
                                var56 = var55.first();
                                while (module0747.NIL == var54 && module0747.NIL != var55) {
                                    final SubLObject var57 = module0751.f46953(var56);
                                    final SubLObject var59;
                                    final SubLObject var58 = var59 = module0751.f46974(var57, var28);
                                    if (module0747.NIL == conses_high.member(var59, var35, Symbols.symbol_function((SubLObject)module0747.EQUAL), Symbols.symbol_function((SubLObject)module0747.IDENTITY))) {
                                        var35 = (SubLObject)ConsesLow.cons(var59, var35);
                                    }
                                    var54 = (SubLObject)SubLObjectFactory.makeBoolean(var34.isInteger() && module0747.NIL != module0035.f2000(var35, var34, (SubLObject)module0747.UNPROVIDED));
                                    var55 = var55.rest();
                                    var56 = var55.first();
                                }
                            }
                        }
                        else {
                            final SubLObject var60 = module0770.f49063(var28, var30, var32, var33, (SubLObject)module0747.$ic43$, var31);
                            final SubLObject var61 = module0751.f46953(var60);
                            final SubLObject var63;
                            final SubLObject var62 = var63 = module0751.f46974(var61, var28);
                            if (module0747.NIL == conses_high.member(var63, var35, Symbols.symbol_function((SubLObject)module0747.EQUAL), Symbols.symbol_function((SubLObject)module0747.IDENTITY))) {
                                var35 = (SubLObject)ConsesLow.cons(var63, var35);
                            }
                        }
                    }
                    var50 = module0580.f35596();
                }
                finally {
                    module0580.$g4370$.rebind(var42_57, var29);
                    module0580.$g4369$.rebind(var41_56, var29);
                    module0580.$g4371$.rebind(var38_41, var29);
                }
            }
            finally {
                module0579.$g4274$.rebind(var49, var29);
                module0579.$g4279$.rebind(var48, var29);
                module0579.$g4245$.rebind(var47, var29);
                module0579.$g4255$.rebind(var46, var29);
                module0579.$g4291$.rebind(var45, var29);
                module0579.$g4280$.rebind(var44, var29);
                module0579.$g4276$.rebind(var43, var29);
                module0579.$g4306$.rebind(var42, var29);
                module0579.$g4290$.rebind(var41, var29);
                module0579.$g4260$.rebind(var40, var29);
                module0579.$g4277$.rebind(var39, var29);
                module0579.$g4262$.rebind(var38, var29);
                module0579.$g4287$.rebind(var37, var29);
                module0579.$g4268$.rebind(var38_40, var29);
            }
        }
        finally {
            module0579.$g4304$.rebind(var36, var29);
        }
        return Sequences.nreverse(var35);
    }
    
    public static SubLObject f46319(final SubLObject var67, final SubLObject var2) {
        final SubLObject var68 = f46320(var67, var2);
        SubLObject var69 = (SubLObject)module0747.NIL;
        SubLObject var70 = var68;
        SubLObject var71 = (SubLObject)module0747.NIL;
        var71 = var70.first();
        while (module0747.NIL != var70) {
            var69 = (SubLObject)ConsesLow.cons(f46318(var71, (SubLObject)module0747.NIL, (SubLObject)module0747.ZERO_INTEGER, (SubLObject)module0747.NIL, (SubLObject)module0747.NIL), var69);
            var70 = var70.rest();
            var71 = var70.first();
        }
        return Sequences.nreverse(var69);
    }
    
    public static SubLObject f46320(final SubLObject var68, final SubLObject var2) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = f46314(var2, (SubLObject)module0747.$ic24$, (SubLObject)module0747.T);
        final SubLObject var71 = f46314(var2, (SubLObject)module0747.$ic25$, (SubLObject)module0747.T);
        final SubLObject var72 = f46314(var2, (SubLObject)module0747.$ic26$, (SubLObject)module0747.T);
        final SubLObject var73 = f46314(var2, (SubLObject)module0747.$ic27$, (SubLObject)module0747.T);
        SubLObject var74 = (SubLObject)module0747.NIL;
        final SubLObject var75 = module0579.$g4304$.currentBinding(var69);
        try {
            module0579.$g4304$.bind((SubLObject)module0747.T, var69);
            final SubLObject var38_69 = module0579.$g4268$.currentBinding(var69);
            final SubLObject var76 = module0579.$g4287$.currentBinding(var69);
            final SubLObject var77 = module0579.$g4262$.currentBinding(var69);
            final SubLObject var78 = module0579.$g4277$.currentBinding(var69);
            final SubLObject var79 = module0579.$g4260$.currentBinding(var69);
            final SubLObject var80 = module0579.$g4290$.currentBinding(var69);
            final SubLObject var81 = module0579.$g4306$.currentBinding(var69);
            final SubLObject var82 = module0579.$g4276$.currentBinding(var69);
            final SubLObject var83 = module0579.$g4280$.currentBinding(var69);
            final SubLObject var84 = module0579.$g4291$.currentBinding(var69);
            final SubLObject var85 = module0579.$g4255$.currentBinding(var69);
            final SubLObject var86 = module0579.$g4245$.currentBinding(var69);
            final SubLObject var87 = module0579.$g4279$.currentBinding(var69);
            final SubLObject var88 = module0579.$g4274$.currentBinding(var69);
            try {
                module0579.$g4268$.bind(f46314(var2, (SubLObject)module0747.$ic29$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4287$.bind(f46314(var2, (SubLObject)module0747.$ic30$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4262$.bind(f46314(var2, (SubLObject)module0747.$ic27$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4277$.bind(f46314(var2, (SubLObject)module0747.$ic31$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4260$.bind(f46314(var2, (SubLObject)module0747.$ic26$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4290$.bind(f46314(var2, (SubLObject)module0747.$ic32$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4306$.bind(f46314(var2, (SubLObject)module0747.$ic33$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4276$.bind(f46314(var2, (SubLObject)module0747.$ic34$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4280$.bind(f46314(var2, (SubLObject)module0747.$ic35$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4291$.bind(f46314(var2, (SubLObject)module0747.$ic36$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4255$.bind(f46314(var2, (SubLObject)module0747.$ic37$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4245$.bind(f46314(var2, (SubLObject)module0747.$ic38$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4279$.bind(f46314(var2, (SubLObject)module0747.$ic39$, (SubLObject)module0747.UNPROVIDED), var69);
                module0579.$g4274$.bind(f46314(var2, (SubLObject)module0747.$ic40$, (SubLObject)module0747.UNPROVIDED), var69);
                SubLObject var89 = (SubLObject)module0747.NIL;
                final SubLObject var38_70 = module0580.$g4371$.currentBinding(var69);
                final SubLObject var41_71 = module0580.$g4369$.currentBinding(var69);
                final SubLObject var42_72 = module0580.$g4370$.currentBinding(var69);
                try {
                    module0580.$g4371$.bind((SubLObject)module0747.ZERO_INTEGER, var69);
                    module0580.$g4369$.bind(module0580.f35598(f46314(var2, (SubLObject)module0747.$ic41$, (SubLObject)module0747.UNPROVIDED)), var69);
                    module0580.$g4370$.bind(module0580.$g4370$.getDynamicValue(var69), var69);
                    module0580.$g4370$.setDynamicValue(module0580.f35596(), var69);
                    if (module0747.NIL == module0580.$g4370$.getDynamicValue(var69)) {
                        SubLObject var90 = (SubLObject)module0747.NIL;
                        SubLObject var64_74 = (SubLObject)module0747.NIL;
                        SubLObject var91 = (SubLObject)module0747.NIL;
                        SubLObject var28_76 = (SubLObject)module0747.NIL;
                        var90 = module0770.f49071(var68, var71, var70, var72, var73, (SubLObject)module0747.NIL, (SubLObject)module0747.$ic48$);
                        var64_74 = var90.first();
                        var91 = var68;
                        var28_76 = var91.first();
                        while (module0747.NIL != var91 || module0747.NIL != var90) {
                            var74 = (SubLObject)ConsesLow.cons(module0751.f46974(var64_74, var28_76), var74);
                            var90 = var90.rest();
                            var64_74 = var90.first();
                            var91 = var91.rest();
                            var28_76 = var91.first();
                        }
                    }
                    var89 = module0580.f35596();
                }
                finally {
                    module0580.$g4370$.rebind(var42_72, var69);
                    module0580.$g4369$.rebind(var41_71, var69);
                    module0580.$g4371$.rebind(var38_70, var69);
                }
            }
            finally {
                module0579.$g4274$.rebind(var88, var69);
                module0579.$g4279$.rebind(var87, var69);
                module0579.$g4245$.rebind(var86, var69);
                module0579.$g4255$.rebind(var85, var69);
                module0579.$g4291$.rebind(var84, var69);
                module0579.$g4280$.rebind(var83, var69);
                module0579.$g4276$.rebind(var82, var69);
                module0579.$g4306$.rebind(var81, var69);
                module0579.$g4290$.rebind(var80, var69);
                module0579.$g4260$.rebind(var79, var69);
                module0579.$g4277$.rebind(var78, var69);
                module0579.$g4262$.rebind(var77, var69);
                module0579.$g4287$.rebind(var76, var69);
                module0579.$g4268$.rebind(var38_69, var69);
            }
        }
        finally {
            module0579.$g4304$.rebind(var75, var69);
        }
        return Sequences.nreverse(var74);
    }
    
    public static SubLObject f46321(final SubLObject var28, final SubLObject var77, final SubLObject var78, final SubLObject var2) {
        final SubLObject var79 = (SubLObject)module0747.NIL;
        return var79;
    }
    
    public static SubLObject f46318(final SubLObject var32, final SubLObject var79, final SubLObject var80, final SubLObject var81, final SubLObject var82) {
        if (module0747.NIL != module0751.f46908(var32)) {
            return module0751.f46919(var32);
        }
        return module0751.f46910(module0751.f46976(var32));
    }
    
    public static SubLObject f46322(final SubLObject var32, final SubLObject var83, final SubLObject var79, final SubLObject var80, final SubLObject var84, final SubLObject var82) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0747.NIL;
        final SubLObject var87 = module0579.$g4304$.currentBinding(var85);
        try {
            module0579.$g4304$.bind(var84, var85);
            if (module0747.NIL != module0751.f46908(var32)) {
                var86 = module0751.f46916(var32);
            }
            else {
                var86 = module0751.f46913(module0751.f46976(var32), (SubLObject)module0747.UNPROVIDED);
            }
        }
        finally {
            module0579.$g4304$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f46323(final SubLObject var7) {
        return module0035.f2192((SubLObject)module0747.$ic56$, var7);
    }
    
    public static SubLObject f46324(final SubLObject var7) {
        return module0035.sublisp_boolean(module0062.f4492(var7, (SubLObject)module0747.$ic57$));
    }
    
    public static SubLObject f46325(final SubLObject var32) {
        assert module0747.NIL != f46324(var32) : var32;
        if (module0747.NIL != module0751.f46908(var32)) {
            return (SubLObject)module0747.NIL;
        }
        return module0751.f46911(module0751.f46976(var32));
    }
    
    public static SubLObject f46326(final SubLObject var32) {
        assert module0747.NIL != f46324(var32) : var32;
        if (module0747.NIL != module0751.f46908(var32)) {
            return module0751.f46919(var32);
        }
        return module0751.f46910(module0751.f46976(var32));
    }
    
    public static SubLObject f46327(final SubLObject var32) {
        assert module0747.NIL != f46324(var32) : var32;
        if (module0747.NIL != module0751.f46908(var32)) {
            return module0751.f46926(var32);
        }
        return var32.first();
    }
    
    public static SubLObject f46328(final SubLObject var32) {
        assert module0747.NIL != f46324(var32) : var32;
        if (module0747.NIL != module0751.f46908(var32)) {
            return module0751.f46928(var32);
        }
        return (SubLObject)module0747.ZERO_INTEGER;
    }
    
    public static SubLObject f46329(final SubLObject var32) {
        assert module0747.NIL != f46324(var32) : var32;
        if (module0747.NIL != module0751.f46908(var32)) {
            return module0751.f46921(var32);
        }
        return module0751.f47211(module0751.f47198());
    }
    
    public static SubLObject f46330() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46308", "NEW-PPH-PARAMETERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46311", "S#50661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46312", "S#50662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46310", "S#39392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46309", "S#39394", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0747", "f46313", "S#50663");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46314", "S#50664", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46315", "LEXICAL-CONTEXT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46316", "S#37360", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46317", "S#37361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46319", "S#37364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46320", "S#37363", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46321", "S#37367", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46318", "S#37372", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46322", "S#37376", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46323", "PPH-OUTPUT-MAPS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46324", "PPH-OUTPUT-MAP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46325", "PPH-OUTPUT-MAP-GET-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46326", "PPH-OUTPUT-MAP-GET-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46327", "PPH-OUTPUT-MAP-GET-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46328", "PPH-OUTPUT-MAP-GET-STRING-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0747", "f46329", "PPH-OUTPUT-MAP-GET-ARG-POSITION", 1, 0, false);
        return (SubLObject)module0747.NIL;
    }
    
    public static SubLObject f46331() {
        return (SubLObject)module0747.NIL;
    }
    
    public static SubLObject f46332() {
        module0002.f38((SubLObject)module0747.$ic0$);
        module0002.f38((SubLObject)module0747.$ic19$);
        module0002.f50((SubLObject)module0747.$ic20$, (SubLObject)module0747.$ic21$);
        module0002.f50((SubLObject)module0747.$ic22$, (SubLObject)module0747.$ic23$);
        module0002.f50((SubLObject)module0747.$ic44$, (SubLObject)module0747.$ic45$);
        module0002.f50((SubLObject)module0747.$ic46$, (SubLObject)module0747.$ic47$);
        module0002.f50((SubLObject)module0747.$ic49$, (SubLObject)module0747.$ic50$);
        module0002.f50((SubLObject)module0747.$ic51$, (SubLObject)module0747.$ic52$);
        module0002.f50((SubLObject)module0747.$ic53$, (SubLObject)module0747.$ic54$);
        module0002.f38((SubLObject)module0747.$ic55$);
        module0002.f38((SubLObject)module0747.$ic56$);
        module0002.f38((SubLObject)module0747.$ic58$);
        module0002.f38((SubLObject)module0747.$ic59$);
        module0002.f38((SubLObject)module0747.$ic60$);
        module0002.f38((SubLObject)module0747.$ic61$);
        module0002.f38((SubLObject)module0747.$ic62$);
        return (SubLObject)module0747.NIL;
    }
    
    public void declareFunctions() {
        f46330();
    }
    
    public void initializeVariables() {
        f46331();
    }
    
    public void runTopLevelForms() {
        f46332();
    }
    
    static {
        me = (SubLFile)new module0747();
        $ic0$ = SubLObjectFactory.makeSymbol("NEW-PPH-PARAMETERS");
        $ic1$ = SubLObjectFactory.makeSymbol("S#39394", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#39392", "CYC");
        $ic3$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic4$ = SubLObjectFactory.makeSymbol("S#50661", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic6$ = SubLObjectFactory.makeUninternedSymbol("US#2C5BC21");
        $ic7$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic8$ = SubLObjectFactory.makeSymbol("S#50664", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic11$ = SubLObjectFactory.makeSymbol("CLET");
        $ic12$ = ConsesLow.list((SubLObject)module0747.NIL);
        $ic13$ = SubLObjectFactory.makeSymbol("S#39177", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PPH-TIMEOUT"));
        $ic15$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic16$ = SubLObjectFactory.makeSymbol("S#50662", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic18$ = SubLObjectFactory.makeKeyword("NO-VALUE");
        $ic19$ = SubLObjectFactory.makeSymbol("LEXICAL-CONTEXT-P");
        $ic20$ = SubLObjectFactory.makeSymbol("S#37360", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-NL-STRING");
        $ic22$ = SubLObjectFactory.makeSymbol("S#37361", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-NL");
        $ic24$ = SubLObjectFactory.makeKeyword("PPH-AGREEMENT");
        $ic25$ = SubLObjectFactory.makeKeyword("PPH-SENTENTIAL-FORCE");
        $ic26$ = SubLObjectFactory.makeKeyword("PPH-LEXICAL-CONTEXT");
        $ic27$ = SubLObjectFactory.makeKeyword("PPH-SEMANTIC-MT");
        $ic28$ = SubLObjectFactory.makeKeyword("PPH-GENERATION-COUNT");
        $ic29$ = SubLObjectFactory.makeKeyword("ADD-DETERMINERS-BEFORE-VARIABLES?");
        $ic30$ = SubLObjectFactory.makeKeyword("DEMERIT-CUTOFF");
        $ic31$ = SubLObjectFactory.makeKeyword("HIDE-EXPLICIT-UNIVERSALS?");
        $ic32$ = SubLObjectFactory.makeKeyword("MAX-DIGITS-WITHOUT-COMMA");
        $ic33$ = SubLObjectFactory.makeKeyword("MAXIMIZE-LINKS?");
        $ic34$ = SubLObjectFactory.makeKeyword("QUANTIFY-VARIABLES?");
        $ic35$ = SubLObjectFactory.makeKeyword("GENLPREDS-BACKOFF-LIMIT");
        $ic36$ = SubLObjectFactory.makeKeyword("SIGNIFICANT-DIGITS-CUTOFF");
        $ic37$ = SubLObjectFactory.makeKeyword("PREFER-TERSE-PARAPHRASE?");
        $ic38$ = SubLObjectFactory.makeKeyword("USE-INDEXICAL-DATES?");
        $ic39$ = SubLObjectFactory.makeKeyword("USE-SMART-VARIABLE-REPLACEMENT?");
        $ic40$ = SubLObjectFactory.makeKeyword("USE-TITLE-CAPITALIZATION?");
        $ic41$ = SubLObjectFactory.makeKeyword("PPH-TIMEOUT");
        $ic42$ = SubLObjectFactory.makeKeyword("NONE");
        $ic43$ = SubLObjectFactory.makeKeyword("HTML");
        $ic44$ = SubLObjectFactory.makeSymbol("S#37364", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("CYCL-TERMS-TO-NL-STRINGS");
        $ic46$ = SubLObjectFactory.makeSymbol("S#37363", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("CYCL-TERMS-TO-NL");
        $ic48$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic49$ = SubLObjectFactory.makeSymbol("S#37367", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-SEARCH-QUERY");
        $ic51$ = SubLObjectFactory.makeSymbol("S#37372", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-TO-TEXT");
        $ic53$ = SubLObjectFactory.makeSymbol("S#37376", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-TO-HTML");
        $ic55$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAPS-P");
        $ic56$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-P");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#50666", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#50649", "CYC")));
        $ic58$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-GET-ITEMS");
        $ic59$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-GET-STRING");
        $ic60$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-GET-CYCL");
        $ic61$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-GET-STRING-OFFSET");
        $ic62$ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-GET-ARG-POSITION");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0747.class
	Total time: 211 ms
	
	Decompiled with Procyon 0.5.32.
*/