package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0386 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0386";
    public static final String myFingerPrint = "23a015a86d90f6a105c0c18def8a11bfe885098156d4339a63baadae13bddaa2";
    private static SubLSymbol $g3231$;
    private static SubLSymbol $g3232$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    
    public static SubLObject f27415(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0363.f24658(var1, var2);
        return f27416(var3);
    }
    
    public static SubLObject f27416(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0386.$ic0$ == var3) {
            return (SubLObject)module0386.$ic0$;
        }
        if (module0363.$g3132$.getDynamicValue(var4) == module0386.$ic1$) {
            return f27417(var3);
        }
        return f27418(var3);
    }
    
    public static SubLObject f27419(final SubLObject var5, final SubLObject var2) {
        final SubLObject var6 = module0365.f24850(var5);
        final SubLObject var7 = module0363.f24658(var6, var2);
        if (module0386.$ic0$ == var7) {
            return (SubLObject)module0386.$ic0$;
        }
        if (module0386.NIL != module0381.f27067(var5)) {
            return f27420(var5, var7);
        }
        if (module0386.NIL != module0380.f26969(var5)) {
            return f27421(var5, var7);
        }
        if (module0386.NIL != module0383.f27235(var5)) {
            return f27422(var5, var7);
        }
        return Errors.error((SubLObject)module0386.$ic2$, var5);
    }
    
    public static SubLObject f27423(final SubLObject var6) {
        final SubLObject var7 = module0361.f24123(module0364.f24722(var6));
        if (module0386.NIL == module0065.f4772(var7, (SubLObject)module0386.$ic3$)) {
            final SubLObject var8_9 = var7;
            if (module0386.NIL == module0065.f4775(var8_9, (SubLObject)module0386.$ic3$)) {
                final SubLObject var8 = module0065.f4740(var8_9);
                final SubLObject var9 = (SubLObject)module0386.NIL;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                for (var10 = Sequences.length(var8), var11 = (SubLObject)module0386.NIL, var11 = (SubLObject)module0386.ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)module0386.ONE_INTEGER)) {
                    var12 = ((module0386.NIL != var9) ? Numbers.subtract(var10, var11, (SubLObject)module0386.ONE_INTEGER) : var11);
                    var13 = Vectors.aref(var8, var12);
                    if (module0386.NIL == module0065.f4749(var13) || module0386.NIL == module0065.f4773((SubLObject)module0386.$ic3$)) {
                        if (module0386.NIL != module0065.f4749(var13)) {
                            var13 = (SubLObject)module0386.$ic3$;
                        }
                        f27424(var6, var13);
                    }
                }
            }
            final SubLObject var15_16 = var7;
            if (module0386.NIL == module0065.f4777(var15_16)) {
                final SubLObject var14 = module0065.f4738(var15_16);
                SubLObject var15 = (SubLObject)module0386.NIL;
                SubLObject var16 = (SubLObject)module0386.NIL;
                final Iterator var17 = Hashtables.getEntrySetIterator(var14);
                try {
                    while (Hashtables.iteratorHasNext(var17)) {
                        final Map.Entry var18 = Hashtables.iteratorNextEntry(var17);
                        var15 = Hashtables.getEntryKey(var18);
                        var16 = Hashtables.getEntryValue(var18);
                        f27424(var6, var16);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var17);
                }
            }
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27425(final SubLObject var1, final SubLObject var20, final SubLObject var2) {
        final SubLObject var21 = module0363.f24678(var1, var2, var20);
        if (module0386.NIL != var21) {
            final SubLObject var22 = module0363.f24507(var1);
            final SubLObject var23 = module0361.f24123(var22);
            if (module0386.NIL == module0065.f4772(var23, (SubLObject)module0386.$ic3$)) {
                final SubLObject var8_24 = var23;
                if (module0386.NIL == module0065.f4775(var8_24, (SubLObject)module0386.$ic3$)) {
                    final SubLObject var24 = module0065.f4740(var8_24);
                    final SubLObject var25 = (SubLObject)module0386.NIL;
                    SubLObject var26;
                    SubLObject var27;
                    SubLObject var28;
                    SubLObject var25_26;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    for (var26 = Sequences.length(var24), var27 = (SubLObject)module0386.NIL, var27 = (SubLObject)module0386.ZERO_INTEGER; var27.numL(var26); var27 = Numbers.add(var27, (SubLObject)module0386.ONE_INTEGER)) {
                        var28 = ((module0386.NIL != var25) ? Numbers.subtract(var26, var27, (SubLObject)module0386.ONE_INTEGER) : var27);
                        var25_26 = Vectors.aref(var24, var28);
                        if (module0386.NIL == module0065.f4749(var25_26) || module0386.NIL == module0065.f4773((SubLObject)module0386.$ic3$)) {
                            if (module0386.NIL != module0065.f4749(var25_26)) {
                                var25_26 = (SubLObject)module0386.$ic3$;
                            }
                            if (module0386.NIL != module0363.f24547(var1, var25_26)) {
                                var29 = var25_26;
                                var30 = module0077.f5333(oc_inference_datastructures_inference.f25473(var29));
                                for (var31 = module0032.f1741(var30), var32 = (SubLObject)module0386.NIL, var32 = module0032.f1742(var31, var30); module0386.NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                    var33 = module0032.f1745(var31, var32);
                                    if (module0386.NIL != module0032.f1746(var32, var33) && module0386.NIL != module0398.f28152(var33)) {
                                        module0367.f25107(var1, var33);
                                        module0367.f25179(var1, var33);
                                        module0367.f25103(var33);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var15_32 = var23;
                if (module0386.NIL == module0065.f4777(var15_32)) {
                    final SubLObject var34 = module0065.f4738(var15_32);
                    SubLObject var35 = (SubLObject)module0386.NIL;
                    SubLObject var25_27 = (SubLObject)module0386.NIL;
                    final Iterator var36 = Hashtables.getEntrySetIterator(var34);
                    try {
                        while (Hashtables.iteratorHasNext(var36)) {
                            final Map.Entry var37 = Hashtables.iteratorNextEntry(var36);
                            var35 = Hashtables.getEntryKey(var37);
                            var25_27 = Hashtables.getEntryValue(var37);
                            if (module0386.NIL != module0363.f24547(var1, var25_27)) {
                                final SubLObject var38 = var25_27;
                                final SubLObject var39 = module0077.f5333(oc_inference_datastructures_inference.f25473(var38));
                                SubLObject var40;
                                SubLObject var41;
                                SubLObject var42;
                                for (var40 = module0032.f1741(var39), var41 = (SubLObject)module0386.NIL, var41 = module0032.f1742(var40, var39); module0386.NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                    var42 = module0032.f1745(var40, var41);
                                    if (module0386.NIL != module0032.f1746(var41, var42) && module0386.NIL != module0398.f28152(var42)) {
                                        module0367.f25107(var1, var42);
                                        module0367.f25179(var1, var42);
                                        module0367.f25103(var42);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var36);
                    }
                }
            }
            final SubLObject var43 = module0363.f24527(var1);
            SubLObject var44;
            SubLObject var45;
            SubLObject var46;
            for (var44 = module0032.f1741(var43), var45 = (SubLObject)module0386.NIL, var45 = module0032.f1742(var44, var43); module0386.NIL == module0032.f1744(var44, var45); var45 = module0032.f1743(var45)) {
                var46 = module0032.f1745(var44, var45);
                if (module0386.NIL != module0032.f1746(var45, var46)) {
                    f27423(var46);
                }
            }
        }
        return var21;
    }
    
    public static SubLObject f27424(final SubLObject var6, final SubLObject var2) {
        final SubLObject var7 = module0364.f24725(var6);
        final SubLObject var8 = module0363.f24658(var7, var2);
        if (module0386.$ic0$ != var8) {
            if (module0386.NIL != module0377.f26746(var6)) {
                return f27426(var8, var6, var2);
            }
            if (module0386.NIL != module0381.f27029(var6)) {
                return f27427(var8, var6, var2);
            }
            if (module0386.NIL != module0378.f26860(var6)) {
                return f27428(var8, var6, var2);
            }
            if (module0386.NIL != module0380.f26955(var6)) {
                return f27429(var8, var6, var2);
            }
            if (module0386.NIL != module0375.f26571(var6)) {
                return f27430(var8, var6, var2);
            }
            if (module0386.NIL != module0383.f27227(var6)) {
                return f27431(var8, var6, var2);
            }
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27426(final SubLObject var35, final SubLObject var36, final SubLObject var2) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (module0386.NIL == Errors.$ignore_mustsP$.getDynamicValue(var37) && module0386.NIL == f27432(var35)) {
            Errors.error((SubLObject)module0386.$ic4$, var35);
        }
        if (module0386.NIL != module0364.f24749(var36)) {
            final SubLObject var38 = module0364.f24757(var36);
            final SubLObject var39 = module0363.f24509(var38);
            final SubLObject var40 = f27433(var39, module0048.f_1X(var35));
            return f27425(var38, var40, var2);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27428(final SubLObject var35, final SubLObject var41, final SubLObject var2) {
        final SubLObject var42 = module0364.f24757(var41);
        final SubLObject var43 = f27434(var35, var41);
        if (module0386.NIL != var43) {
            return f27425(var42, var43, var2);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27434(final SubLObject var35, final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = module0378.f26875(var41);
        final SubLObject var44 = module0378.f26872(var41);
        final SubLObject var45 = module0381.f27064(var44);
        if (module0386.NIL != var45) {
            final SubLObject var47;
            final SubLObject var46 = var47 = f27435(var35, var45);
            final SubLObject var48 = module0364.f24757(var41);
            final SubLObject var49 = module0363.f24509(var48);
            SubLObject var50 = conses_high.copy_tree(f27433(var49, module0048.f_1X(var47)));
            var50 = f27436(var35, var43, var50);
            if (module0386.NIL == Errors.$ignore_mustsP$.getDynamicValue(var42) && module0386.NIL != module0035.f2434((SubLObject)module0386.$ic5$, var50)) {
                Errors.error((SubLObject)module0386.$ic6$, var50);
            }
            return f27437(var50);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27427(final SubLObject var35, final SubLObject var44, final SubLObject var2) {
        final SubLObject var45 = module0381.f27050(var44);
        final SubLObject var46 = f27438(var44, var35);
        if (module0386.NIL != var46) {
            f27425(var45, var46, var2);
            if (module0386.NIL != module0381.f27046(var44)) {
                final SubLObject var47 = module0381.f27051(var44);
                final SubLObject var48 = f27439(var44, var35);
                if (module0386.NIL != var48) {
                    f27425(var47, var48, var2);
                }
            }
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27438(final SubLObject var44, final SubLObject var35) {
        final SubLObject var45 = module0381.f27064(var44);
        if (module0386.NIL != var45) {
            return f27435(var35, var45);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27439(final SubLObject var44, final SubLObject var35) {
        final SubLObject var45 = module0381.f27066(var44);
        if (module0386.NIL != var45) {
            return f27435(var35, var45);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27420(final SubLObject var52, final SubLObject var35) {
        final SubLObject var53 = module0381.f27055(var52);
        return f27438(var53, var35);
    }
    
    public static SubLObject f27429(final SubLObject var35, final SubLObject var53, final SubLObject var2) {
        final SubLObject var54 = module0364.f24725(var53);
        SubLObject var55 = module0364.f24735(var53);
        SubLObject var56 = (SubLObject)module0386.NIL;
        var56 = var55.first();
        while (module0386.NIL != var55) {
            if (module0386.NIL != module0339.f22743((SubLObject)module0386.NIL, var53, var56)) {
                final SubLObject var57 = module0364.f24736(var56);
                SubLObject var58 = f27440(var54, var56, var35);
                var58 = f27437(var58);
                f27425(var57, var58, var2);
            }
            var55 = var55.rest();
            var56 = var55.first();
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27421(final SubLObject var60, final SubLObject var35) {
        final SubLObject var61 = module0365.f24850(var60);
        final SubLObject var62 = module0380.f26964(var60);
        final SubLObject var63 = f27440(var61, var62, var35);
        return var63;
    }
    
    public static SubLObject f27440(final SubLObject var54, final SubLObject var57, final SubLObject var35) {
        final SubLObject var58 = module0364.f24736(var57);
        final SubLObject var59 = f27441(var54, var57);
        SubLObject var60 = conses_high.copy_tree(f27433(module0363.f24509(var58), (SubLObject)module0386.$ic7$));
        var60 = f27436(var35, var59, var60);
        return var60;
    }
    
    public static SubLObject f27441(final SubLObject var54, final SubLObject var57) {
        final SubLObject var58 = module0363.f24509(var54);
        final SubLObject var59 = var58.first();
        final SubLObject var60 = module0364.f24737(var57);
        final SubLObject var61 = module0364.f24736(var57);
        final SubLObject var62 = module0363.f24509(var61);
        final SubLObject var63 = var62.first();
        final SubLObject var64 = module0233.f15362(var60, var63);
        return f27442(var59, var64, (SubLObject)module0386.UNPROVIDED);
    }
    
    public static SubLObject f27430(final SubLObject var35, final SubLObject var67, final SubLObject var2) {
        final SubLObject var68 = module0364.f24757(var67);
        final SubLObject var69 = f27443(var67, var35);
        return f27425(var68, var69, var2);
    }
    
    public static SubLObject f27443(final SubLObject var67, final SubLObject var35) {
        if (module0386.NIL != module0363.f24562(module0364.f24725(var67))) {
            return var35;
        }
        final SubLObject var68 = module0364.f24757(var67);
        final SubLObject var69 = f27444(var67);
        SubLObject var70 = conses_high.copy_tree(f27433(module0363.f24509(var68), (SubLObject)module0386.$ic7$));
        var70 = f27436(var35, var69, var70);
        return var70;
    }
    
    public static SubLObject f27444(final SubLObject var67) {
        final SubLObject var68 = module0363.f24509(module0364.f24725(var67)).first();
        final SubLObject var69 = module0375.f26570(var67);
        final SubLObject var70 = module0233.f15362(var69, var68);
        final SubLObject var71 = module0364.f24754(var67);
        final SubLObject var72 = module0364.f24737(var71);
        final SubLObject var73 = module0363.f24509(module0364.f24736(var71)).first();
        final SubLObject var74 = module0233.f15362(var72, var73);
        final SubLObject var75 = f27445(var70, var74);
        return var75;
    }
    
    public static SubLObject f27445(SubLObject var70, final SubLObject var75) {
        SubLObject var76 = f27446(var70, var75);
        if (module0386.NIL != module0004.f104((SubLObject)module0386.NIL, var76.first(), (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED) || module0386.NIL != module0004.f104((SubLObject)module0386.NIL, conses_high.second(var76), (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED)) {
            var70 = module0370.f25846(conses_high.copy_tree(var70));
            var76 = f27446(var70, var75);
        }
        return var76;
    }
    
    public static SubLObject f27446(final SubLObject var77, final SubLObject var78) {
        SubLObject var79 = (SubLObject)module0386.NIL;
        SubLObject var80 = (SubLObject)module0386.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var77, var77, (SubLObject)module0386.$ic8$);
        var79 = var77.first();
        SubLObject var81 = var77.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var77, (SubLObject)module0386.$ic8$);
        var80 = var81.first();
        var81 = var81.rest();
        if (module0386.NIL == var81) {
            SubLObject var82 = (SubLObject)module0386.NIL;
            SubLObject var83 = (SubLObject)module0386.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var78, var78, (SubLObject)module0386.$ic9$);
            var82 = var78.first();
            SubLObject var85_86 = var78.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var78, (SubLObject)module0386.$ic9$);
            var83 = var85_86.first();
            var85_86 = var85_86.rest();
            if (module0386.NIL == var85_86) {
                SubLObject var84 = (SubLObject)module0386.NIL;
                SubLObject var85 = (SubLObject)module0386.NIL;
                SubLObject var86 = var79;
                SubLObject var87 = (SubLObject)module0386.NIL;
                var87 = var86.first();
                while (module0386.NIL != var86) {
                    final SubLObject var88 = Sequences.position(var87, var82, Symbols.symbol_function((SubLObject)module0386.EQUAL), (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED);
                    var84 = (SubLObject)ConsesLow.cons(var88, var84);
                    var86 = var86.rest();
                    var87 = var86.first();
                }
                var86 = var80;
                SubLObject var89 = (SubLObject)module0386.NIL;
                var89 = var86.first();
                while (module0386.NIL != var86) {
                    final SubLObject var88 = Sequences.position(var89, var83, Symbols.symbol_function((SubLObject)module0386.EQUAL), (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED);
                    var85 = (SubLObject)ConsesLow.cons(var88, var85);
                    var86 = var86.rest();
                    var89 = var86.first();
                }
                var85 = Sequences.nreverse(var85);
                final SubLObject var90 = (SubLObject)ConsesLow.list(var84, var85);
                return var90;
            }
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)module0386.$ic9$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var77, (SubLObject)module0386.$ic8$);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27431(final SubLObject var35, final SubLObject var94, final SubLObject var2) {
        final SubLObject var95 = module0383.f27232(var94);
        final SubLObject var96 = module0363.f24509(var95);
        final SubLObject var97 = f27433(var96, (SubLObject)module0386.ZERO_INTEGER);
        return f27425(var95, var97, var2);
    }
    
    public static SubLObject f27422(final SubLObject var98, final SubLObject var35) {
        assert module0386.NIL != f27447(var35) : var35;
        final SubLObject var99 = module0383.f27237(var98);
        return ConsesLow.nth(var99, var35);
    }
    
    public static SubLObject f27448(final SubLObject var100) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0386.NIL != f27432(var100) || module0386.NIL != f27449(var100) || module0386.NIL != f27447(var100));
    }
    
    public static SubLObject f27432(final SubLObject var100) {
        return module0004.f106(var100);
    }
    
    public static SubLObject f27449(final SubLObject var100) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var100.isCons() && module0386.NIL != module0035.f1995(var100, (SubLObject)module0386.TWO_INTEGER, (SubLObject)module0386.UNPROVIDED) && var100.first().isList() && module0386.NIL != module0035.f2370((SubLObject)module0386.$ic11$, var100.first(), (SubLObject)module0386.UNPROVIDED) && conses_high.second(var100).isList() && module0386.NIL != module0035.f2370((SubLObject)module0386.$ic11$, conses_high.second(var100), (SubLObject)module0386.UNPROVIDED));
    }
    
    public static SubLObject f27447(final SubLObject var100) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var100.isCons() && module0386.NIL != module0035.f2000(var100, (SubLObject)module0386.TWO_INTEGER, (SubLObject)module0386.UNPROVIDED) && module0386.NIL != module0035.f2370((SubLObject)module0386.$ic12$, var100, (SubLObject)module0386.UNPROVIDED));
    }
    
    public static SubLObject f27450() {
        final SubLObject var101 = module0386.$g3231$.getGlobalValue();
        if (module0386.NIL != var101) {
            module0034.f1818(var101);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27451(final SubLObject var102) {
        return module0034.f1829(module0386.$g3231$.getGlobalValue(), (SubLObject)ConsesLow.list(var102), (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED);
    }
    
    public static SubLObject f27452(final SubLObject var102) {
        assert module0386.NIL != f27448(var102) : var102;
        return conses_high.copy_tree(var102);
    }
    
    public static SubLObject f27437(final SubLObject var102) {
        SubLObject var103 = module0386.$g3231$.getGlobalValue();
        if (module0386.NIL == var103) {
            var103 = module0034.f1934((SubLObject)module0386.$ic13$, (SubLObject)module0386.$ic15$, (SubLObject)module0386.NIL, (SubLObject)module0386.EQUAL, (SubLObject)module0386.ONE_INTEGER, (SubLObject)module0386.ZERO_INTEGER);
        }
        SubLObject var104 = module0034.f1814(var103, var102, (SubLObject)module0386.$ic16$);
        if (var104 == module0386.$ic16$) {
            var104 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27452(var102)));
            module0034.f1816(var103, var102, var104, (SubLObject)module0386.UNPROVIDED);
        }
        return module0034.f1959(var104);
    }
    
    public static SubLObject f27433(final SubLObject var105, SubLObject var106) {
        if (var106 == module0386.UNPROVIDED) {
            var106 = (SubLObject)module0386.ZERO_INTEGER;
        }
        if (module0386.NIL != module0362.f24460(var105)) {
            return var106;
        }
        if (module0386.NIL != module0035.f1997(var105)) {
            return f27453(var105.first(), var106);
        }
        SubLObject var107 = (SubLObject)module0386.NIL;
        SubLObject var108 = var105;
        SubLObject var109 = (SubLObject)module0386.NIL;
        var109 = var108.first();
        while (module0386.NIL != var108) {
            var107 = (SubLObject)ConsesLow.cons(f27453(var109, var106), var107);
            var108 = var108.rest();
            var109 = var108.first();
        }
        var107 = Sequences.nreverse(var107);
        if (var106.isInteger()) {
            var107 = f27437(var107);
        }
        return var107;
    }
    
    public static SubLObject f27453(final SubLObject var108, SubLObject var106) {
        if (var106 == module0386.UNPROVIDED) {
            var106 = (SubLObject)module0386.ZERO_INTEGER;
        }
        SubLObject var109 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.make_list(Sequences.length(module0232.f15306(var108)), var106), (SubLObject)ConsesLow.make_list(Sequences.length(module0232.f15308(var108)), var106));
        if (var106.isInteger()) {
            var109 = f27437(var109);
        }
        return var109;
    }
    
    public static SubLObject f27435(final SubLObject var109, final SubLObject var110) {
        assert module0386.NIL != f27449(var109) : var109;
        SubLObject var111 = (SubLObject)module0386.NIL;
        SubLObject var112 = (SubLObject)module0386.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var109, var109, (SubLObject)module0386.$ic17$);
        var111 = var109.first();
        SubLObject var113 = var109.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var113, var109, (SubLObject)module0386.$ic17$);
        var112 = var113.first();
        var113 = var113.rest();
        if (module0386.NIL == var113) {
            SubLObject var114 = (SubLObject)module0386.NIL;
            SubLObject var115 = (SubLObject)module0386.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var110, var110, (SubLObject)module0386.$ic18$);
            var114 = var110.first();
            SubLObject var117_118 = var110.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var117_118, var110, (SubLObject)module0386.$ic18$);
            var115 = var117_118.first();
            var117_118 = var117_118.rest();
            if (module0386.NIL == var117_118) {
                SubLObject var116 = (SubLObject)module0386.NIL;
                SubLObject var117 = (SubLObject)module0386.NIL;
                SubLObject var118 = var114;
                SubLObject var119 = (SubLObject)module0386.NIL;
                var119 = var118.first();
                while (module0386.NIL != var118) {
                    var116 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var119, var111), var116);
                    var118 = var118.rest();
                    var119 = var118.first();
                }
                var118 = var115;
                SubLObject var120 = (SubLObject)module0386.NIL;
                var120 = var118.first();
                while (module0386.NIL != var118) {
                    var117 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var120, var112), var117);
                    var118 = var118.rest();
                    var120 = var118.first();
                }
                var116 = Sequences.nreverse(var116);
                var117 = Sequences.nreverse(var117);
                if (module0386.NIL == var116 && module0386.NIL != module0035.f1997(var117)) {
                    return var117.first();
                }
                if (module0386.NIL == var117 && module0386.NIL != module0035.f1997(var116)) {
                    return var116.first();
                }
                return f27437((SubLObject)ConsesLow.list(var116, var117));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var110, (SubLObject)module0386.$ic18$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var109, (SubLObject)module0386.$ic17$);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27454() {
        final SubLObject var101 = module0386.$g3232$.getGlobalValue();
        if (module0386.NIL != var101) {
            module0034.f1818(var101);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27455(final SubLObject var102, final SubLObject var125) {
        return module0034.f1829(module0386.$g3232$.getGlobalValue(), (SubLObject)ConsesLow.list(var102, var125), (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED);
    }
    
    public static SubLObject f27456(final SubLObject var102, final SubLObject var125) {
        if (var125.eql((SubLObject)module0386.$ic20$)) {
            return f27417(var102);
        }
        if (var125.eql((SubLObject)module0386.$ic21$)) {
            return f27418(var102);
        }
        return Errors.error((SubLObject)module0386.$ic22$, var125);
    }
    
    public static SubLObject f27457(final SubLObject var102, final SubLObject var125) {
        SubLObject var126 = module0386.$g3232$.getGlobalValue();
        if (module0386.NIL == var126) {
            var126 = module0034.f1934((SubLObject)module0386.$ic19$, (SubLObject)module0386.$ic23$, (SubLObject)module0386.NIL, (SubLObject)module0386.EQUAL, (SubLObject)module0386.TWO_INTEGER, (SubLObject)module0386.ZERO_INTEGER);
        }
        final SubLObject var127 = module0034.f1782(var102, var125);
        final SubLObject var128 = module0034.f1814(var126, var127, (SubLObject)module0386.UNPROVIDED);
        if (var128 != module0386.$ic16$) {
            SubLObject var129 = var128;
            SubLObject var130 = (SubLObject)module0386.NIL;
            var130 = var129.first();
            while (module0386.NIL != var129) {
                SubLObject var131 = var130.first();
                final SubLObject var132 = conses_high.second(var130);
                if (var102.equal(var131.first())) {
                    var131 = var131.rest();
                    if (module0386.NIL != var131 && module0386.NIL == var131.rest() && var125.equal(var131.first())) {
                        return module0034.f1959(var132);
                    }
                }
                var129 = var129.rest();
                var130 = var129.first();
            }
        }
        final SubLObject var133 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27456(var102, var125)));
        module0034.f1836(var126, var127, var128, var133, (SubLObject)ConsesLow.list(var102, var125));
        return module0034.f1959(var133);
    }
    
    public static SubLObject f27458(final SubLObject var134, final SubLObject var135) {
        if (var134.equal(var135)) {
            return var134;
        }
        if (module0386.NIL != f27432(var134)) {
            return f27459(var134, var135);
        }
        if (module0386.NIL != f27449(var134)) {
            return f27460(var134, var135);
        }
        return f27461(var134, var135);
    }
    
    public static SubLObject f27459(final SubLObject var134, final SubLObject var135) {
        return Numbers.min(var134, var135);
    }
    
    public static SubLObject f27460(final SubLObject var134, final SubLObject var135) {
        SubLObject var136 = (SubLObject)module0386.NIL;
        SubLObject var137 = (SubLObject)module0386.NIL;
        SubLObject var138 = (SubLObject)module0386.NIL;
        SubLObject var139_140 = (SubLObject)module0386.NIL;
        SubLObject var139 = (SubLObject)module0386.NIL;
        SubLObject var142_143 = (SubLObject)module0386.NIL;
        var138 = module0232.f15306(var134);
        var139_140 = var138.first();
        var139 = module0232.f15306(var135);
        var142_143 = var139.first();
        while (module0386.NIL != var139 || module0386.NIL != var138) {
            var136 = (SubLObject)ConsesLow.cons(f27459(var139_140, var142_143), var136);
            var138 = var138.rest();
            var139_140 = var138.first();
            var139 = var139.rest();
            var142_143 = var139.first();
        }
        SubLObject var140 = (SubLObject)module0386.NIL;
        SubLObject var139_141 = (SubLObject)module0386.NIL;
        SubLObject var141 = (SubLObject)module0386.NIL;
        SubLObject var142_144 = (SubLObject)module0386.NIL;
        var140 = module0232.f15308(var134);
        var139_141 = var140.first();
        var141 = module0232.f15308(var135);
        var142_144 = var141.first();
        while (module0386.NIL != var141 || module0386.NIL != var140) {
            var137 = (SubLObject)ConsesLow.cons(f27459(var139_141, var142_144), var137);
            var140 = var140.rest();
            var139_141 = var140.first();
            var141 = var141.rest();
            var142_144 = var141.first();
        }
        final SubLObject var142 = (SubLObject)ConsesLow.list(Sequences.nreverse(var136), Sequences.nreverse(var137));
        return f27437(var142);
    }
    
    public static SubLObject f27461(final SubLObject var134, final SubLObject var135) {
        SubLObject var136 = (SubLObject)module0386.NIL;
        SubLObject var137 = (SubLObject)module0386.NIL;
        SubLObject var150_151 = (SubLObject)module0386.NIL;
        SubLObject var138 = (SubLObject)module0386.NIL;
        SubLObject var153_154 = (SubLObject)module0386.NIL;
        var137 = var134;
        var150_151 = var137.first();
        var138 = var135;
        var153_154 = var138.first();
        while (module0386.NIL != var138 || module0386.NIL != var137) {
            var136 = (SubLObject)ConsesLow.cons(f27458(var150_151, var153_154), var136);
            var137 = var137.rest();
            var150_151 = var137.first();
            var138 = var138.rest();
            var153_154 = var138.first();
        }
        var136 = Sequences.nreverse(var136);
        return f27437(var136);
    }
    
    public static SubLObject f27442(final SubLObject var155, final SubLObject var156, SubLObject var157) {
        if (var157 == module0386.UNPROVIDED) {
            var157 = (SubLObject)module0386.NIL;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        SubLObject var159 = (SubLObject)module0386.NIL;
        SubLObject var160 = (SubLObject)module0386.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var155, var155, (SubLObject)module0386.$ic24$);
        var159 = var155.first();
        SubLObject var161 = var155.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var161, var155, (SubLObject)module0386.$ic24$);
        var160 = var161.first();
        var161 = var161.rest();
        if (module0386.NIL == var161) {
            SubLObject var162 = (SubLObject)module0386.NIL;
            SubLObject var163 = (SubLObject)module0386.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var156, var156, (SubLObject)module0386.$ic25$);
            var162 = var156.first();
            SubLObject var164_165 = var156.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var164_165, var156, (SubLObject)module0386.$ic25$);
            var163 = var164_165.first();
            var164_165 = var164_165.rest();
            if (module0386.NIL == var164_165) {
                final SubLObject var164 = (SubLObject)ConsesLow.make_list(Sequences.length(var159), var157);
                final SubLObject var165 = (SubLObject)ConsesLow.make_list(Sequences.length(var160), var157);
                SubLObject var166 = (SubLObject)module0386.NIL;
                SubLObject var167 = (SubLObject)module0386.NIL;
                SubLObject var168 = (SubLObject)module0386.NIL;
                var166 = var159;
                var167 = var166.first();
                for (var168 = (SubLObject)module0386.ZERO_INTEGER; module0386.NIL != var166; var166 = var166.rest(), var167 = var166.first(), var168 = Numbers.add((SubLObject)module0386.ONE_INTEGER, var168)) {
                    final SubLObject var169 = Sequences.position(var167, var162, Symbols.symbol_function((SubLObject)module0386.EQUAL), (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED);
                    if (var169.isInteger()) {
                        ConsesLow.set_nth(var168, var164, var169);
                    }
                }
                var166 = (SubLObject)module0386.NIL;
                var167 = (SubLObject)module0386.NIL;
                var168 = (SubLObject)module0386.NIL;
                var166 = var160;
                var167 = var166.first();
                for (var168 = (SubLObject)module0386.ZERO_INTEGER; module0386.NIL != var166; var166 = var166.rest(), var167 = var166.first(), var168 = Numbers.add((SubLObject)module0386.ONE_INTEGER, var168)) {
                    final SubLObject var169 = Sequences.position(var167, var163, Symbols.symbol_function((SubLObject)module0386.EQUAL), (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED, (SubLObject)module0386.UNPROVIDED);
                    if (var169.isInteger()) {
                        ConsesLow.set_nth(var168, var165, var169);
                    }
                }
                final SubLObject var170 = (SubLObject)ConsesLow.list(var164, var165);
                if (module0386.NIL == Errors.$ignore_mustsP$.getDynamicValue(var158) && module0386.NIL == module0035.f2439(Symbols.symbol_function((SubLObject)module0386.$ic26$), var170, (SubLObject)module0386.UNPROVIDED)) {
                    Errors.error((SubLObject)module0386.$ic27$, var170);
                }
                return var170;
            }
            cdestructuring_bind.cdestructuring_bind_error(var156, (SubLObject)module0386.$ic25$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var155, (SubLObject)module0386.$ic24$);
        }
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27436(final SubLObject var174, final SubLObject var43, SubLObject var175) {
        SubLObject var176 = (SubLObject)module0386.NIL;
        SubLObject var177 = (SubLObject)module0386.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var174, var174, (SubLObject)module0386.$ic28$);
        var176 = var174.first();
        SubLObject var178 = var174.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var178, var174, (SubLObject)module0386.$ic28$);
        var177 = var178.first();
        var178 = var178.rest();
        if (module0386.NIL == var178) {
            SubLObject var179 = (SubLObject)module0386.NIL;
            SubLObject var180 = (SubLObject)module0386.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var43, var43, (SubLObject)module0386.$ic29$);
            var179 = var43.first();
            SubLObject var182_183 = var43.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var182_183, var43, (SubLObject)module0386.$ic29$);
            var180 = var182_183.first();
            var182_183 = var182_183.rest();
            if (module0386.NIL == var182_183) {
                final SubLObject var181 = (SubLObject)(var175.isCons() ? var175.first() : module0386.NIL);
                final SubLObject var182 = (SubLObject)(var175.isCons() ? conses_high.second(var175) : module0386.NIL);
                SubLObject var183 = (SubLObject)module0386.NIL;
                SubLObject var187_188 = (SubLObject)module0386.NIL;
                SubLObject var184 = (SubLObject)module0386.NIL;
                SubLObject var190_191 = (SubLObject)module0386.NIL;
                var183 = var176;
                var187_188 = var183.first();
                var184 = var179;
                var190_191 = var184.first();
                while (module0386.NIL != var184 || module0386.NIL != var183) {
                    if (var190_191.isInteger()) {
                        if (var175.isCons()) {
                            ConsesLow.set_nth(var190_191, var181, var187_188);
                        }
                        else {
                            var175 = var187_188;
                        }
                    }
                    var183 = var183.rest();
                    var187_188 = var183.first();
                    var184 = var184.rest();
                    var190_191 = var184.first();
                }
                SubLObject var185 = (SubLObject)module0386.NIL;
                SubLObject var193_194 = (SubLObject)module0386.NIL;
                SubLObject var186 = (SubLObject)module0386.NIL;
                SubLObject var196_197 = (SubLObject)module0386.NIL;
                var185 = var177;
                var193_194 = var185.first();
                var186 = var180;
                var196_197 = var186.first();
                while (module0386.NIL != var186 || module0386.NIL != var185) {
                    if (var196_197.isInteger()) {
                        if (var175.isCons()) {
                            ConsesLow.set_nth(var196_197, var182, var193_194);
                        }
                        else {
                            var175 = var193_194;
                        }
                    }
                    var185 = var185.rest();
                    var193_194 = var185.first();
                    var186 = var186.rest();
                    var196_197 = var186.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var43, (SubLObject)module0386.$ic29$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var174, (SubLObject)module0386.$ic28$);
        }
        return var175;
    }
    
    public static SubLObject f27418(final SubLObject var198) {
        return f27462(var198, (SubLObject)module0386.ZERO_INTEGER);
    }
    
    public static SubLObject f27462(final SubLObject var198, SubLObject var199) {
        if (var198.isNumber()) {
            var199 = Numbers.add(var199, var198);
        }
        else if (!var198.isAtom()) {
            SubLObject var200 = (SubLObject)module0386.NIL;
            SubLObject var201 = (SubLObject)module0386.NIL;
            var200 = var198;
            var201 = var200.first();
            while (!var200.rest().isAtom()) {
                var199 = f27462(var201, var199);
                var200 = var200.rest();
                var201 = var200.first();
            }
            var199 = f27462(var200.first(), var199);
            var199 = f27462(var200.rest(), var199);
        }
        return var199;
    }
    
    public static SubLObject f27417(final SubLObject var198) {
        return f27463(var198, (SubLObject)module0386.$ic30$);
    }
    
    public static SubLObject f27463(final SubLObject var198, SubLObject var202) {
        if (module0386.NIL != module0048.f3324(var198)) {
            var202 = module0048.f3352(var202, var198);
        }
        else if (!var198.isAtom()) {
            SubLObject var203 = (SubLObject)module0386.NIL;
            SubLObject var204 = (SubLObject)module0386.NIL;
            var203 = var198;
            var204 = var203.first();
            while (!var203.rest().isAtom()) {
                var202 = f27463(var204, var202);
                var203 = var203.rest();
                var204 = var203.first();
            }
            var202 = f27463(var203.first(), var202);
            var202 = f27463(var203.rest(), var202);
        }
        return var202;
    }
    
    public static SubLObject f27464() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27415", "S#27380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27416", "S#27392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27419", "S#29290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27423", "S#29283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27425", "S#30506", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27424", "S#29279", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27426", "S#30507", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27428", "S#30508", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27434", "S#30509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27427", "S#30510", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27438", "S#30511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27439", "S#30512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27420", "S#30513", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27429", "S#30514", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27421", "S#30515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27440", "S#30516", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27441", "S#30517", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27430", "S#30518", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27443", "S#30519", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27444", "S#30520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27445", "S#30521", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27446", "S#30522", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27431", "S#30523", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27422", "S#30524", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27448", "S#27391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27432", "S#30525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27449", "S#30526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27447", "S#30527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27450", "S#30528", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27451", "S#30529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27452", "S#30530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27437", "S#30531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27433", "S#27393", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27453", "S#30532", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27435", "S#30533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27454", "S#30534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27455", "S#30535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27456", "S#30536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27457", "S#30537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27458", "S#27394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27459", "S#30538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27460", "S#30539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27461", "S#30540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27442", "S#30541", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27436", "S#30542", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27418", "S#30543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27462", "S#30544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27417", "S#30545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0386", "f27463", "S#30546", 2, 0, false);
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27465() {
        module0386.$g3231$ = SubLFiles.deflexical("S#30547", (SubLObject)module0386.NIL);
        module0386.$g3232$ = SubLFiles.deflexical("S#30548", (SubLObject)module0386.NIL);
        return (SubLObject)module0386.NIL;
    }
    
    public static SubLObject f27466() {
        module0034.f1909((SubLObject)module0386.$ic13$);
        module0034.f1909((SubLObject)module0386.$ic19$);
        return (SubLObject)module0386.NIL;
    }
    
    public void declareFunctions() {
        f27464();
    }
    
    public void initializeVariables() {
        f27465();
    }
    
    public void runTopLevelForms() {
        f27466();
    }
    
    static {
        me = (SubLFile)new module0386();
        module0386.$g3231$ = null;
        module0386.$g3232$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic1$ = SubLObjectFactory.makeKeyword("COUNTERINTUITIVE");
        $ic2$ = SubLObjectFactory.makeString("Unexpected logical-tactic : ~S");
        $ic3$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic4$ = SubLObjectFactory.makeString("Time to support ~S propagation");
        $ic5$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic6$ = SubLObjectFactory.makeString("Propagation error : ~S");
        $ic7$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30549", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30550", "CYC"));
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30551", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30552", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#30527", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#30525", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#30526", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#30531", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#27391", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#30547", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30553", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30554", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30555", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30556", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#30537", "CYC");
        $ic20$ = SubLObjectFactory.makeKeyword("UNINTUITIVE");
        $ic21$ = SubLObjectFactory.makeKeyword("INTUITIVE");
        $ic22$ = SubLObjectFactory.makeString("unexpected mode ~S");
        $ic23$ = SubLObjectFactory.makeSymbol("S#30548", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30557", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30558", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30559", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30560", "CYC"));
        $ic26$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic27$ = SubLObjectFactory.makeString("Failed literal map ~S");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30561", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30562", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30563", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30564", "CYC"));
        $ic30$ = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0386.class
	Total time: 275 ms
	
	Decompiled with Procyon 0.5.32.
*/