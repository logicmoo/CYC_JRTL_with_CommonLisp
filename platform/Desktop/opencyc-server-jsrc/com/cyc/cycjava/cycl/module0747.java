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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        assert NIL != f46309(var1) : var1;
        final SubLObject var2 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var3;
        SubLObject var4;
        SubLObject var5;
        for (var3 = (SubLObject)NIL, var3 = var1; NIL != var3; var3 = conses_high.cddr(var3)) {
            var4 = var3.first();
            var5 = conses_high.cadr(var3);
            module0067.f4886(var2, var4, var5);
        }
        assert NIL != f46310(var2) : var2;
        return var2;
    }
    
    public static SubLObject f46311(final SubLObject var6) {
        return Types.keywordp(module0582.f35706(var6));
    }
    
    public static SubLObject f46312(final SubLObject var7) {
        return (SubLObject)makeBoolean(var7.eql((SubLObject)$ic3$) || NIL != f46310(var7));
    }
    
    public static SubLObject f46310(final SubLObject var7) {
        return module0067.f4852(var7);
    }
    
    public static SubLObject f46309(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != module0035.f2331(var7, (SubLObject)$ic4$)) {
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10;
            SubLObject var11;
            SubLObject var12;
            for (var10 = (SubLObject)NIL, var10 = var7; NIL != var10; var10 = conses_high.cddr(var10)) {
                var11 = var10.first();
                var12 = conses_high.cadr(var10);
                if (NIL == module0582.f35708(var11, var12)) {
                    var9 = (SubLObject)T;
                }
            }
            if (NIL == var9) {
                var8 = (SubLObject)T;
            }
        }
        return var8;
    }
    
    public static SubLObject f46313(final SubLObject var10, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var14;
        final SubLObject var13 = var14 = var10.rest();
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic5$);
        var15 = var14.first();
        final SubLObject var16;
        var14 = (var16 = var14.rest());
        final SubLObject var17 = (SubLObject)$ic6$;
        final SubLObject var18 = (SubLObject)$ic7$;
        SubLObject var19 = (SubLObject)NIL;
        final SubLObject var20 = module0582.f35711();
        SubLObject var23;
        for (SubLObject var21 = (SubLObject)NIL; NIL == var21; var21 = (SubLObject)makeBoolean(NIL == var23)) {
            var12.resetMultipleValues();
            final SubLObject var22 = module0052.f3693(var20);
            var23 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var23) {
                final SubLObject var24 = var22.first();
                final SubLObject var25 = module0582.f35707(var24);
                if (NIL != var25) {
                    var19 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var18, var24)), var19);
                }
            }
        }
        var19 = Sort.sort(var19, Symbols.symbol_function((SubLObject)$ic9$), Symbols.symbol_function((SubLObject)$ic10$));
        return (SubLObject)ConsesLow.list((SubLObject)$ic11$, reader.bq_cons((SubLObject)ConsesLow.list(var18, var15), ConsesLow.append(var19, (SubLObject)ConsesLow.list(reader.bq_cons(var17, (SubLObject)$ic12$)))), (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.listS((SubLObject)$ic8$, var18, (SubLObject)$ic14$)), ConsesLow.append(var16, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var17));
    }
    
    public static SubLObject f46314(final SubLObject var18, final SubLObject var4, SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)T;
        }
        assert NIL != f46312(var18) : var18;
        final SubLObject var26 = (SubLObject)$ic17$;
        final SubLObject var27 = (NIL != module0067.f4852(var18)) ? module0067.f4885(var18, var4, var26) : var26;
        if (!var27.eql(var26)) {
            return var27;
        }
        if (NIL != var25 || var18.eql((SubLObject)$ic3$)) {
            return module0582.f35709(var4);
        }
        return (SubLObject)$ic18$;
    }
    
    public static SubLObject f46315(final SubLObject var7) {
        return module0161.f10481(var7);
    }
    
    public static SubLObject f46316(final SubLObject var28, final SubLObject var2) {
        final SubLObject var29 = f46317(var28, var2);
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = var29;
        SubLObject var32 = (SubLObject)NIL;
        var32 = var31.first();
        while (NIL != var31) {
            var30 = (SubLObject)ConsesLow.cons(f46318(var32, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL), var30);
            var31 = var31.rest();
            var32 = var31.first();
        }
        return Sequences.nreverse(var30);
    }
    
    public static SubLObject f46317(final SubLObject var28, final SubLObject var2) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f46314(var2, (SubLObject)$ic24$, (SubLObject)T);
        final SubLObject var31 = f46314(var2, (SubLObject)$ic25$, (SubLObject)T);
        final SubLObject var32 = f46314(var2, (SubLObject)$ic26$, (SubLObject)T);
        final SubLObject var33 = f46314(var2, (SubLObject)$ic27$, (SubLObject)T);
        final SubLObject var34 = f46314(var2, (SubLObject)$ic28$, (SubLObject)T);
        SubLObject var35 = (SubLObject)NIL;
        final SubLObject var36 = module0579.$g4304$.currentBinding(var29);
        try {
            module0579.$g4304$.bind((SubLObject)T, var29);
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
                module0579.$g4268$.bind(f46314(var2, (SubLObject)$ic29$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4287$.bind(f46314(var2, (SubLObject)$ic30$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4262$.bind(f46314(var2, (SubLObject)$ic27$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4277$.bind(f46314(var2, (SubLObject)$ic31$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4260$.bind(f46314(var2, (SubLObject)$ic26$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4290$.bind(f46314(var2, (SubLObject)$ic32$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4306$.bind(f46314(var2, (SubLObject)$ic33$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4276$.bind(f46314(var2, (SubLObject)$ic34$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4280$.bind(f46314(var2, (SubLObject)$ic35$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4291$.bind(f46314(var2, (SubLObject)$ic36$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4255$.bind(f46314(var2, (SubLObject)$ic37$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4245$.bind(f46314(var2, (SubLObject)$ic38$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4279$.bind(f46314(var2, (SubLObject)$ic39$, (SubLObject)UNPROVIDED), var29);
                module0579.$g4274$.bind(f46314(var2, (SubLObject)$ic40$, (SubLObject)UNPROVIDED), var29);
                SubLObject var50 = (SubLObject)NIL;
                final SubLObject var38_41 = module0580.$g4371$.currentBinding(var29);
                final SubLObject var41_56 = module0580.$g4369$.currentBinding(var29);
                final SubLObject var42_57 = module0580.$g4370$.currentBinding(var29);
                try {
                    module0580.$g4371$.bind((SubLObject)ZERO_INTEGER, var29);
                    module0580.$g4369$.bind(module0580.f35598(f46314(var2, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)), var29);
                    module0580.$g4370$.bind(module0580.$g4370$.getDynamicValue(var29), var29);
                    module0580.$g4370$.setDynamicValue(module0580.f35596(), var29);
                    if (NIL == module0580.$g4370$.getDynamicValue(var29)) {
                        if ((var31 == $ic42$ || (var31 == $ic3$ && $ic42$ == module0751.f47036(var28))) && NIL != module0048.f3361(var34, (SubLObject)ONE_INTEGER)) {
                            final SubLObject var51 = (SubLObject)NIL;
                            final SubLObject var52 = (SubLObject)NIL;
                            final SubLObject var53 = module0770.f49079(var28, var30, var32, var33, var51, var52, (SubLObject)UNPROVIDED);
                            SubLObject var54 = (SubLObject)makeBoolean(var34.isInteger() && NIL != module0035.f2000(var35, var34, (SubLObject)UNPROVIDED));
                            if (NIL == var54) {
                                SubLObject var55 = var53;
                                SubLObject var56 = (SubLObject)NIL;
                                var56 = var55.first();
                                while (NIL == var54 && NIL != var55) {
                                    final SubLObject var57 = module0751.f46953(var56);
                                    final SubLObject var59;
                                    final SubLObject var58 = var59 = module0751.f46974(var57, var28);
                                    if (NIL == conses_high.member(var59, var35, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var35 = (SubLObject)ConsesLow.cons(var59, var35);
                                    }
                                    var54 = (SubLObject)makeBoolean(var34.isInteger() && NIL != module0035.f2000(var35, var34, (SubLObject)UNPROVIDED));
                                    var55 = var55.rest();
                                    var56 = var55.first();
                                }
                            }
                        }
                        else {
                            final SubLObject var60 = module0770.f49063(var28, var30, var32, var33, (SubLObject)$ic43$, var31);
                            final SubLObject var61 = module0751.f46953(var60);
                            final SubLObject var63;
                            final SubLObject var62 = var63 = module0751.f46974(var61, var28);
                            if (NIL == conses_high.member(var63, var35, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
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
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = var68;
        SubLObject var71 = (SubLObject)NIL;
        var71 = var70.first();
        while (NIL != var70) {
            var69 = (SubLObject)ConsesLow.cons(f46318(var71, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL), var69);
            var70 = var70.rest();
            var71 = var70.first();
        }
        return Sequences.nreverse(var69);
    }
    
    public static SubLObject f46320(final SubLObject var68, final SubLObject var2) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = f46314(var2, (SubLObject)$ic24$, (SubLObject)T);
        final SubLObject var71 = f46314(var2, (SubLObject)$ic25$, (SubLObject)T);
        final SubLObject var72 = f46314(var2, (SubLObject)$ic26$, (SubLObject)T);
        final SubLObject var73 = f46314(var2, (SubLObject)$ic27$, (SubLObject)T);
        SubLObject var74 = (SubLObject)NIL;
        final SubLObject var75 = module0579.$g4304$.currentBinding(var69);
        try {
            module0579.$g4304$.bind((SubLObject)T, var69);
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
                module0579.$g4268$.bind(f46314(var2, (SubLObject)$ic29$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4287$.bind(f46314(var2, (SubLObject)$ic30$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4262$.bind(f46314(var2, (SubLObject)$ic27$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4277$.bind(f46314(var2, (SubLObject)$ic31$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4260$.bind(f46314(var2, (SubLObject)$ic26$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4290$.bind(f46314(var2, (SubLObject)$ic32$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4306$.bind(f46314(var2, (SubLObject)$ic33$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4276$.bind(f46314(var2, (SubLObject)$ic34$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4280$.bind(f46314(var2, (SubLObject)$ic35$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4291$.bind(f46314(var2, (SubLObject)$ic36$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4255$.bind(f46314(var2, (SubLObject)$ic37$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4245$.bind(f46314(var2, (SubLObject)$ic38$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4279$.bind(f46314(var2, (SubLObject)$ic39$, (SubLObject)UNPROVIDED), var69);
                module0579.$g4274$.bind(f46314(var2, (SubLObject)$ic40$, (SubLObject)UNPROVIDED), var69);
                SubLObject var89 = (SubLObject)NIL;
                final SubLObject var38_70 = module0580.$g4371$.currentBinding(var69);
                final SubLObject var41_71 = module0580.$g4369$.currentBinding(var69);
                final SubLObject var42_72 = module0580.$g4370$.currentBinding(var69);
                try {
                    module0580.$g4371$.bind((SubLObject)ZERO_INTEGER, var69);
                    module0580.$g4369$.bind(module0580.f35598(f46314(var2, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)), var69);
                    module0580.$g4370$.bind(module0580.$g4370$.getDynamicValue(var69), var69);
                    module0580.$g4370$.setDynamicValue(module0580.f35596(), var69);
                    if (NIL == module0580.$g4370$.getDynamicValue(var69)) {
                        SubLObject var90 = (SubLObject)NIL;
                        SubLObject var64_74 = (SubLObject)NIL;
                        SubLObject var91 = (SubLObject)NIL;
                        SubLObject var28_76 = (SubLObject)NIL;
                        var90 = module0770.f49071(var68, var71, var70, var72, var73, (SubLObject)NIL, (SubLObject)$ic48$);
                        var64_74 = var90.first();
                        var91 = var68;
                        var28_76 = var91.first();
                        while (NIL != var91 || NIL != var90) {
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
        final SubLObject var79 = (SubLObject)NIL;
        return var79;
    }
    
    public static SubLObject f46318(final SubLObject var32, final SubLObject var79, final SubLObject var80, final SubLObject var81, final SubLObject var82) {
        if (NIL != module0751.f46908(var32)) {
            return module0751.f46919(var32);
        }
        return module0751.f46910(module0751.f46976(var32));
    }
    
    public static SubLObject f46322(final SubLObject var32, final SubLObject var83, final SubLObject var79, final SubLObject var80, final SubLObject var84, final SubLObject var82) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)NIL;
        final SubLObject var87 = module0579.$g4304$.currentBinding(var85);
        try {
            module0579.$g4304$.bind(var84, var85);
            if (NIL != module0751.f46908(var32)) {
                var86 = module0751.f46916(var32);
            }
            else {
                var86 = module0751.f46913(module0751.f46976(var32), (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0579.$g4304$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f46323(final SubLObject var7) {
        return module0035.f2192((SubLObject)$ic56$, var7);
    }
    
    public static SubLObject f46324(final SubLObject var7) {
        return module0035.sublisp_boolean(module0062.f4492(var7, (SubLObject)$ic57$));
    }
    
    public static SubLObject f46325(final SubLObject var32) {
        assert NIL != f46324(var32) : var32;
        if (NIL != module0751.f46908(var32)) {
            return (SubLObject)NIL;
        }
        return module0751.f46911(module0751.f46976(var32));
    }
    
    public static SubLObject f46326(final SubLObject var32) {
        assert NIL != f46324(var32) : var32;
        if (NIL != module0751.f46908(var32)) {
            return module0751.f46919(var32);
        }
        return module0751.f46910(module0751.f46976(var32));
    }
    
    public static SubLObject f46327(final SubLObject var32) {
        assert NIL != f46324(var32) : var32;
        if (NIL != module0751.f46908(var32)) {
            return module0751.f46926(var32);
        }
        return var32.first();
    }
    
    public static SubLObject f46328(final SubLObject var32) {
        assert NIL != f46324(var32) : var32;
        if (NIL != module0751.f46908(var32)) {
            return module0751.f46928(var32);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f46329(final SubLObject var32) {
        assert NIL != f46324(var32) : var32;
        if (NIL != module0751.f46908(var32)) {
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46331() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46332() {
        module0002.f38((SubLObject)$ic0$);
        module0002.f38((SubLObject)$ic19$);
        module0002.f50((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0002.f50((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0002.f50((SubLObject)$ic44$, (SubLObject)$ic45$);
        module0002.f50((SubLObject)$ic46$, (SubLObject)$ic47$);
        module0002.f50((SubLObject)$ic49$, (SubLObject)$ic50$);
        module0002.f50((SubLObject)$ic51$, (SubLObject)$ic52$);
        module0002.f50((SubLObject)$ic53$, (SubLObject)$ic54$);
        module0002.f38((SubLObject)$ic55$);
        module0002.f38((SubLObject)$ic56$);
        module0002.f38((SubLObject)$ic58$);
        module0002.f38((SubLObject)$ic59$);
        module0002.f38((SubLObject)$ic60$);
        module0002.f38((SubLObject)$ic61$);
        module0002.f38((SubLObject)$ic62$);
        return (SubLObject)NIL;
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
        $ic0$ = makeSymbol("NEW-PPH-PARAMETERS");
        $ic1$ = makeSymbol("S#39394", "CYC");
        $ic2$ = makeSymbol("S#39392", "CYC");
        $ic3$ = makeKeyword("DEFAULT");
        $ic4$ = makeSymbol("S#50661", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#50665", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic6$ = makeUninternedSymbol("US#2C5BC21");
        $ic7$ = makeUninternedSymbol("US#5126656");
        $ic8$ = makeSymbol("S#50664", "CYC");
        $ic9$ = makeSymbol("S#3846", "CYC");
        $ic10$ = makeSymbol("FIRST");
        $ic11$ = makeSymbol("CLET");
        $ic12$ = ConsesLow.list((SubLObject)NIL);
        $ic13$ = makeSymbol("S#39177", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)makeKeyword("PPH-TIMEOUT"));
        $ic15$ = makeSymbol("IGNORE");
        $ic16$ = makeSymbol("S#50662", "CYC");
        $ic17$ = makeKeyword("UNSPECIFIED");
        $ic18$ = makeKeyword("NO-VALUE");
        $ic19$ = makeSymbol("LEXICAL-CONTEXT-P");
        $ic20$ = makeSymbol("S#37360", "CYC");
        $ic21$ = makeSymbol("CYCL-TERM-TO-NL-STRING");
        $ic22$ = makeSymbol("S#37361", "CYC");
        $ic23$ = makeSymbol("CYCL-TERM-TO-NL");
        $ic24$ = makeKeyword("PPH-AGREEMENT");
        $ic25$ = makeKeyword("PPH-SENTENTIAL-FORCE");
        $ic26$ = makeKeyword("PPH-LEXICAL-CONTEXT");
        $ic27$ = makeKeyword("PPH-SEMANTIC-MT");
        $ic28$ = makeKeyword("PPH-GENERATION-COUNT");
        $ic29$ = makeKeyword("ADD-DETERMINERS-BEFORE-VARIABLES?");
        $ic30$ = makeKeyword("DEMERIT-CUTOFF");
        $ic31$ = makeKeyword("HIDE-EXPLICIT-UNIVERSALS?");
        $ic32$ = makeKeyword("MAX-DIGITS-WITHOUT-COMMA");
        $ic33$ = makeKeyword("MAXIMIZE-LINKS?");
        $ic34$ = makeKeyword("QUANTIFY-VARIABLES?");
        $ic35$ = makeKeyword("GENLPREDS-BACKOFF-LIMIT");
        $ic36$ = makeKeyword("SIGNIFICANT-DIGITS-CUTOFF");
        $ic37$ = makeKeyword("PREFER-TERSE-PARAPHRASE?");
        $ic38$ = makeKeyword("USE-INDEXICAL-DATES?");
        $ic39$ = makeKeyword("USE-SMART-VARIABLE-REPLACEMENT?");
        $ic40$ = makeKeyword("USE-TITLE-CAPITALIZATION?");
        $ic41$ = makeKeyword("PPH-TIMEOUT");
        $ic42$ = makeKeyword("NONE");
        $ic43$ = makeKeyword("HTML");
        $ic44$ = makeSymbol("S#37364", "CYC");
        $ic45$ = makeSymbol("CYCL-TERMS-TO-NL-STRINGS");
        $ic46$ = makeSymbol("S#37363", "CYC");
        $ic47$ = makeSymbol("CYCL-TERMS-TO-NL");
        $ic48$ = makeKeyword("PREFERRED");
        $ic49$ = makeSymbol("S#37367", "CYC");
        $ic50$ = makeSymbol("CYCL-TERM-TO-SEARCH-QUERY");
        $ic51$ = makeSymbol("S#37372", "CYC");
        $ic52$ = makeSymbol("PPH-OUTPUT-MAP-TO-TEXT");
        $ic53$ = makeSymbol("S#37376", "CYC");
        $ic54$ = makeSymbol("PPH-OUTPUT-MAP-TO-HTML");
        $ic55$ = makeSymbol("PPH-OUTPUT-MAPS-P");
        $ic56$ = makeSymbol("PPH-OUTPUT-MAP-P");
        $ic57$ = ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("CYCL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#50666", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#50649", "CYC")));
        $ic58$ = makeSymbol("PPH-OUTPUT-MAP-GET-ITEMS");
        $ic59$ = makeSymbol("PPH-OUTPUT-MAP-GET-STRING");
        $ic60$ = makeSymbol("PPH-OUTPUT-MAP-GET-CYCL");
        $ic61$ = makeSymbol("PPH-OUTPUT-MAP-GET-STRING-OFFSET");
        $ic62$ = makeSymbol("PPH-OUTPUT-MAP-GET-ARG-POSITION");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 211 ms
	
	Decompiled with Procyon 0.5.32.
*/