package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0753 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0753";
    public static final String myFingerPrint = "c0402bd4956f4b09f6fe5f51dd10768ef01749de1bfa5b4bf38d9b84f4c1a028";
    private static SubLSymbol $g6061$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    
    public static SubLObject f47245(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var9 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)$ic1$;
            final SubLObject var12 = (SubLObject)$ic2$;
            final SubLObject var13 = (SubLObject)$ic3$;
            final SubLObject var14 = (SubLObject)$ic4$;
            final SubLObject var15 = (SubLObject)$ic5$;
            final SubLObject var16 = (SubLObject)$ic6$;
            final SubLObject var17 = (SubLObject)$ic7$;
            final SubLObject var18 = (SubLObject)$ic8$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)$ic11$), reader.bq_cons(var18, (SubLObject)$ic11$)), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list(var6, var7, var8, var18), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list(reader.bq_cons(var17, ConsesLow.append(var10, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var7, var17), (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic18$, var17, var11), (SubLObject)ConsesLow.listS((SubLObject)$ic19$, var18, (SubLObject)$ic20$)))), (SubLObject)ConsesLow.list((SubLObject)$ic16$, var18, (SubLObject)ConsesLow.listS((SubLObject)$ic19$, var9, (SubLObject)$ic21$), (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var11, (SubLObject)ConsesLow.list((SubLObject)$ic23$, var11)), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)$ic24$, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.list(var12, var13), (SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)TWO_INTEGER, (SubLObject)$ic27$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)$ic28$, var12, var8))), (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.list(var7, var12), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var7, var8))), (SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)ONE_INTEGER, (SubLObject)$ic30$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic31$, var6, var14)), (SubLObject)ConsesLow.list((SubLObject)$ic32$, (SubLObject)ConsesLow.list((SubLObject)$ic33$, var7, var11)), reader.bq_cons(var16, (SubLObject)$ic11$)), (SubLObject)ConsesLow.list((SubLObject)$ic34$, (SubLObject)ConsesLow.listS((SubLObject)EQUAL, var15, (SubLObject)$ic35$), (SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)TWO_INTEGER, (SubLObject)$ic36$, var15, var6), (SubLObject)ConsesLow.list((SubLObject)$ic37$, var15, (SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)ConsesLow.listS((SubLObject)$ic19$, var16, ConsesLow.append(var10, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)TWO_INTEGER, (SubLObject)$ic40$, var15, var6, var16)), (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic44$, var16, (SubLObject)ConsesLow.list((SubLObject)$ic45$, var16, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var7, var11)))), (SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)TWO_INTEGER, (SubLObject)$ic46$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)ConsesLow.listS((SubLObject)$ic19$, var16, ConsesLow.append(var10, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)TWO_INTEGER, (SubLObject)$ic48$, var6, var16)), (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var16, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var7, var11), var6), (SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)ONE_INTEGER, (SubLObject)$ic50$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var7, var11), var16), (SubLObject)ConsesLow.list((SubLObject)$ic51$, var7, var11, var16), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var7, var16)))))))), (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.list(var6, var8), (SubLObject)ConsesLow.list((SubLObject)$ic52$, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic19$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic53$, var9, var11)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47246() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        return module0067.f4852(module0579.$g4237$.getDynamicValue(var19));
    }
    
    public static SubLObject f47247(final SubLObject var7, final SubLObject var20) {
        return (SubLObject)ConsesLow.cons(var7, var20);
    }
    
    public static SubLObject f47248(final SubLObject var21) {
        return (SubLObject)makeBoolean(var21.isCons() && NIL != module0004.f106(var21.first()));
    }
    
    public static SubLObject f47249(final SubLObject var22) {
        return var22.first();
    }
    
    public static SubLObject f47250(final SubLObject var22) {
        return conses_high.copy_list(var22.rest());
    }
    
    public static SubLObject f47251(final SubLObject var23, final SubLObject var24, SubLObject var25, SubLObject var26, SubLObject var27) {
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        if (NIL != module0578.f35470(var23)) {
            PrintLow.format((SubLObject)T, var24, new SubLObject[] { var25, var26, var27 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47252(final SubLObject var7, final SubLObject var20) {
        module0012.f597(f47247(var7, var20));
        return var20;
    }
    
    public static SubLObject f47253(final SubLObject var28, final SubLObject var11) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = ConsesLow.nth(var28, var11);
        final SubLObject var31 = (NIL != module0038.f2653(module0756.f47713(var30, (SubLObject)NIL))) ? $g6061$.getDynamicValue(var29) : module0048.f3326();
        return var31;
    }
    
    public static SubLObject f47254(final SubLObject var16, final SubLObject var29, final SubLObject var30) {
        if (NIL != module0579.f35495() && NIL == module0751.f46997(module0756.f47713(var29, (SubLObject)NIL), var30)) {
            return (SubLObject)T;
        }
        if (var16.isCons() && NIL != module0038.f2653(module0756.f47713(var16, (SubLObject)NIL)) && NIL == f47255(var16, var29)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47255(final SubLObject var31, final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        if (NIL != module0035.f2004(var31, var32)) {
            SubLObject var34 = (SubLObject)NIL;
            if (NIL == var34) {
                SubLObject var35 = (SubLObject)NIL;
                SubLObject var36_37 = (SubLObject)NIL;
                SubLObject var36 = (SubLObject)NIL;
                SubLObject var39_40 = (SubLObject)NIL;
                var35 = var31;
                var36_37 = var35.first();
                var36 = var32;
                var39_40 = var36.first();
                while (NIL == var34 && (NIL != var36 || NIL != var35)) {
                    if (!module0749.f46455(var36_37).equal(module0749.f46455(var39_40))) {
                        var34 = (SubLObject)T;
                    }
                    var35 = var35.rest();
                    var36_37 = var35.first();
                    var36 = var36.rest();
                    var39_40 = var36.first();
                }
            }
            var33 = (SubLObject)makeBoolean(NIL == var34);
        }
        return var33;
    }
    
    public static SubLObject f47256(final SubLObject var41, final SubLObject var42) {
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var44 = var41;
        SubLObject var45 = (SubLObject)NIL;
        var45 = var44.first();
        while (NIL != var44) {
            var43 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var45, var42), var43);
            var44 = var44.rest();
            var45 = var44.first();
        }
        return Sequences.nreverse(var43);
    }
    
    public static SubLObject f47257(final SubLObject var11) {
        return Mapping.mapcar((SubLObject)$ic56$, var11);
    }
    
    public static SubLObject f47258(final SubLObject var11) {
        final SubLObject var12 = Sequences.remove((SubLObject)NIL, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var13 = Mapping.mapcar((SubLObject)$ic56$, var12);
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = f47246();
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var16 = (SubLObject)NIL, var17 = (SubLObject)NIL, var16 = var13.first(), var17 = (SubLObject)ZERO_INTEGER; NIL != var16; var16 = var13.first(), var17 = module0048.f_1X(var17)) {
            var18 = (SubLObject)NIL;
            var19 = ConsesLow.nth(var17, var12);
            var20 = (SubLObject)((NIL != module0035.f1997(var19)) ? module0749.f46466(var19.first()) : NIL);
            var21 = (SubLObject)NIL;
            var22 = (SubLObject)NIL;
            var23 = (SubLObject)NIL;
            var21 = var13;
            var22 = var21.first();
            for (var23 = (SubLObject)ZERO_INTEGER; NIL != var21; var21 = var21.rest(), var22 = var21.first(), var23 = Numbers.add((SubLObject)ONE_INTEGER, var23)) {
                if (var23.isPositive() && NIL == module0201.f12546(var20) && NIL != f47259(var16, var22)) {
                    if (NIL != var15) {
                        f47260(var16, var20);
                        var24 = ConsesLow.nth(var23, var11);
                        if (NIL != module0035.f1997(var24)) {
                            var25 = module0749.f46466(var24.first());
                            f47260(var16, var25);
                        }
                    }
                    var18 = (SubLObject)ConsesLow.cons(Numbers.add(var17, var23), var18);
                }
            }
            if (NIL != var18) {
                var14 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var17, Sequences.nreverse(var18)), var14);
            }
            var13 = var13.rest();
        }
        var14 = Sequences.nreverse(var14);
        return var14;
    }
    
    public static SubLObject f47260(SubLObject var58, SubLObject var59) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        var58 = module0581.f35664(var58);
        final SubLObject var61 = module0067.f4885(module0579.$g4237$.getDynamicValue(var60), var58, (SubLObject)NIL);
        if (NIL != var59 && var61.isList()) {
            module0084.f5765(module0579.$g4237$.getDynamicValue(var60), var58, var59, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        else if (NIL != var59) {
            module0067.f4886(module0579.$g4237$.getDynamicValue(var60), var58, (SubLObject)ConsesLow.list(var59));
        }
        else if (NIL == var61) {
            module0067.f4886(module0579.$g4237$.getDynamicValue(var60), var58, (SubLObject)$ic57$);
        }
        return module0579.$g4237$.getDynamicValue(var60);
    }
    
    public static SubLObject f47261(final SubLObject var58) {
        return module0035.f2013(f47262(var58));
    }
    
    public static SubLObject f47262(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = (SubLObject)((NIL != f47246()) ? module0067.f4885(module0579.$g4237$.getDynamicValue(var59), module0581.f35664(var58), (SubLObject)NIL) : NIL);
        return (SubLObject)(var60.isList() ? var60 : NIL);
    }
    
    public static SubLObject f47263(final SubLObject var58) {
        return (SubLObject)makeBoolean(var58.isString() && NIL == f47261(var58));
    }
    
    public static SubLObject f47264(final SubLObject var62) {
        return f47261(module0749.f46455(var62));
    }
    
    public static SubLObject f47259(final SubLObject var63, final SubLObject var64) {
        final SubLObject var65 = (SubLObject)NIL;
        final SubLObject var66 = (NIL != var65) ? ((NIL != module0035.f2007(var64, var63)) ? module0038.f2668(var63, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0038.f2668(var64, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : Equality.equal(var63, var64);
        if (NIL != var66 && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic59$, var63, var64);
        }
        return var66;
    }
    
    public static SubLObject f47265(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic61$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic54$, (SubLObject)ConsesLow.list(var6, var10, var7, var8), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic60$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47266(final SubLObject var71) {
        if ($ic62$ == var71) {
            return (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL != module0751.f46640(module0751.f47113(var71, (SubLObject)UNPROVIDED), $ic63$, (SubLObject)UNPROVIDED) || NIL != module0751.f46640(module0751.f47113(var71, (SubLObject)UNPROVIDED), $ic64$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47267(final SubLObject var62, final SubLObject var72) {
        if (NIL == var72) {
            final SubLObject var73 = Sequences.cconcatenate((SubLObject)$ic65$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic66$, module0006.f203((SubLObject)$ic67$) });
            module0578.f35476(var73, (SubLObject)ConsesLow.list(var62));
        }
        final SubLObject var74 = module0749.f46455(var62);
        final SubLObject var75 = module0749.f46466(var62);
        if (NIL != f47268(var74, var75)) {
            final SubLObject var76 = f47269(var74, var75, var72);
            SubLObject var77 = (SubLObject)NIL;
            if (NIL != f47270() || NIL != var76) {
                final SubLObject var78 = f47271(var75);
                if (var78.isString()) {
                    var77 = f47272(var78, var62);
                }
                if (NIL == var77) {
                    final SubLObject var79 = f47273(var75, var76, (SubLObject)UNPROVIDED);
                    if (NIL == var77) {
                        SubLObject var80 = var79;
                        SubLObject var81 = (SubLObject)NIL;
                        var81 = var80.first();
                        while (NIL == var77 && NIL != var80) {
                            if (NIL == f47274(var81, var76)) {
                                var77 = f47272(var81, var62);
                            }
                            var80 = var80.rest();
                            var81 = var80.first();
                        }
                    }
                    if (NIL == var77 && NIL == module0035.f2012(var79)) {
                        f47272(var79.first(), var62);
                    }
                }
            }
        }
        return var62;
    }
    
    public static SubLObject f47273(final SubLObject var30, final SubLObject var74, SubLObject var80) {
        if (var80 == UNPROVIDED) {
            var80 = module0579.$g4262$.getDynamicValue();
        }
        return f47275(var30, var74, (SubLObject)THREE_INTEGER, var80);
    }
    
    public static SubLObject f47275(final SubLObject var30, final SubLObject var74, SubLObject var81, SubLObject var80) {
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)THREE_INTEGER;
        }
        if (var80 == UNPROVIDED) {
            var80 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var82 = (NIL != module0269.f17849(var30) && NIL != f47276(var30, var74)) ? module0751.f46898(var30, var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0751.f46898(var30, var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var82;
    }
    
    public static SubLObject f47276(final SubLObject var83, final SubLObject var84) {
        final SubLObject var85 = module0035.remove_if_not((SubLObject)$ic68$, var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var86 = (SubLObject)NIL;
        if (NIL != var85) {
            if (NIL != module0762.f48196(var83)) {
                SubLObject var87 = (SubLObject)NIL;
                if (NIL == var87) {
                    SubLObject var88 = var85;
                    SubLObject var89 = (SubLObject)NIL;
                    var89 = var88.first();
                    while (NIL == var87 && NIL != var88) {
                        if (NIL == module0269.f17847(var89)) {
                            var87 = var89;
                        }
                        var88 = var88.rest();
                        var89 = var88.first();
                    }
                }
                if (NIL == var87) {
                    var86 = (SubLObject)T;
                }
            }
            else if (NIL != module0269.f17851(var83)) {
                SubLObject var90 = (SubLObject)NIL;
                if (NIL == var90) {
                    SubLObject var88 = var85;
                    SubLObject var89 = (SubLObject)NIL;
                    var89 = var88.first();
                    while (NIL == var90 && NIL != var88) {
                        if (NIL == module0269.f17851(var89)) {
                            var90 = var89;
                        }
                        var88 = var88.rest();
                        var89 = var88.first();
                    }
                }
                if (NIL == var90) {
                    var86 = (SubLObject)T;
                }
            }
        }
        return var86;
    }
    
    public static SubLObject f47277(final SubLObject var30, final SubLObject var58) {
        SubLObject var59 = module0038.f2658(var58);
        if (NIL != module0751.f46661((SubLObject)UNPROVIDED) && NIL != f47278() && var58.isString() && NIL != module0212.f13762(var30) && NIL != module0751.f46684(var30, $ic69$, (SubLObject)UNPROVIDED)) {
            SubLObject var60 = (SubLObject)NIL;
            if (NIL == var60) {
                SubLObject var61;
                SubLObject var62;
                SubLObject var63;
                for (var61 = module0764.f48446(var30, module0260.f17034($ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), var62 = (SubLObject)NIL, var62 = var61.first(); NIL == var60 && NIL != var61; var63 = (var60 = module0178.f11335(var62)), var61 = var61.rest(), var62 = var61.first()) {}
            }
            if (var60.isString()) {
                var59 = Sequences.cconcatenate(var59, new SubLObject[] { $ic71$, var60, $ic72$ });
            }
        }
        return var59;
    }
    
    public static SubLObject f47269(final SubLObject var58, final SubLObject var30, final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        SubLObject var74 = Sequences.remove(var30, f47262(var58), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f47268(var58, var30) && NIL != f47266(var72)) {
            final SubLObject var75 = module0584.$g4396$.currentBinding(var73);
            try {
                module0584.$g4396$.bind(module0579.$g4260$.getDynamicValue(var73), var73);
                SubLObject var76 = module0751.f46645(var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var77 = (SubLObject)NIL;
                var77 = var76.first();
                while (NIL != var76) {
                    if (!var77.equal(var30) && NIL == module0004.f104(var77, var74, (SubLObject)EQUAL, (SubLObject)UNPROVIDED)) {
                        var74 = (SubLObject)ConsesLow.cons(var77, var74);
                    }
                    var76 = var76.rest();
                    var77 = var76.first();
                }
            }
            finally {
                module0584.$g4396$.rebind(var75, var73);
            }
        }
        return var74;
    }
    
    public static SubLObject f47268(final SubLObject var58, final SubLObject var30) {
        return (SubLObject)makeBoolean(NIL != f47278() && var58.isString() && NIL != ((NIL != module0201.f12546(var30)) ? makeBoolean(NIL != module0754.f47312(var30) && NIL == module0754.f47311(var30)) : module0206.f13444(var30)));
    }
    
    public static SubLObject f47278() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0579.$g4236$.getDynamicValue(var19).eql((SubLObject)$ic73$) && NIL != module0751.f46605()) {
            return (SubLObject)T;
        }
        if (NIL != f47270()) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47270() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(module0579.f35487().numLE((SubLObject)ONE_INTEGER) && module0579.$g4236$.getDynamicValue(var19).eql((SubLObject)$ic74$));
    }
    
    public static SubLObject f47272(final SubLObject var79, final SubLObject var62) {
        final SubLThread var80 = SubLProcess.currentSubLThread();
        SubLObject var81 = (SubLObject)(var79.isString() ? var79 : NIL);
        SubLObject var82 = (SubLObject)NIL;
        final SubLObject var83 = module0579.$g4259$.currentBinding(var80);
        final SubLObject var84 = module0579.$g4236$.currentBinding(var80);
        try {
            module0579.$g4259$.bind((SubLObject)$ic75$, var80);
            module0579.$g4236$.bind((SubLObject)NIL, var80);
            assert NIL != module0751.f46598((SubLObject)NIL) : NIL;
            final SubLObject var93_97 = module0579.$g4254$.currentBinding(var80);
            try {
                module0579.$g4254$.bind((SubLObject)NIL, var80);
                if (NIL != var79 && NIL == var81) {
                    final SubLObject var85 = module0749.f46470(var62);
                    final SubLObject var86 = (SubLObject)((NIL != var85) ? ConsesLow.list(var85) : NIL);
                    final SubLObject var93_98 = module0579.$g4287$.currentBinding(var80);
                    try {
                        module0579.$g4287$.bind((SubLObject)TWO_INTEGER, var80);
                        var81 = module0770.f49097(var79, var86, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0579.$g4287$.rebind(var93_98, var80);
                    }
                }
            }
            finally {
                module0579.$g4254$.rebind(var93_97, var80);
            }
        }
        finally {
            module0579.$g4236$.rebind(var84, var80);
            module0579.$g4259$.rebind(var83, var80);
        }
        if (var81.isString()) {
            final SubLObject var87 = Sequences.cconcatenate((SubLObject)$ic77$, new SubLObject[] { var81, $ic78$ });
            if (NIL == module0038.f2668(var87, module0749.f46455(var62), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0749.f46461(var62, var87);
                var82 = (SubLObject)T;
            }
        }
        return var82;
    }
    
    public static SubLObject f47274(final SubLObject var79, final SubLObject var74) {
        final SubLThread var80 = SubLProcess.currentSubLThread();
        SubLObject var81 = (SubLObject)NIL;
        if (NIL == var81) {
            SubLObject var82 = var74;
            SubLObject var83 = (SubLObject)NIL;
            var83 = var82.first();
            while (NIL == var81 && NIL != var82) {
                if (NIL != ((NIL != module0269.f17709(var83)) ? module0751.f46669(var83, var79, module0579.$g4262$.getDynamicValue(var80)) : module0751.f46684(var83, var79, module0579.$g4262$.getDynamicValue(var80)))) {
                    var81 = (SubLObject)T;
                }
                var82 = var82.rest();
                var83 = var82.first();
            }
        }
        return var81;
    }
    
    public static SubLObject f47279(final SubLObject var8, SubLObject var80) {
        if (var80 == UNPROVIDED) {
            var80 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var81 = SubLProcess.currentSubLThread();
        SubLObject var82 = (SubLObject)NIL;
        final SubLObject var83 = module0579.$g4262$.currentBinding(var81);
        try {
            module0579.$g4262$.bind(var80, var81);
            SubLObject var84 = var8;
            SubLObject var85 = (SubLObject)NIL;
            var85 = var84.first();
            while (NIL != var84) {
                SubLObject var86 = (SubLObject)NIL;
                final SubLObject var87 = module0751.f46898(var85, (SubLObject)$ic79$, var80, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var88 = Sequences.remove(var85, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == var86) {
                    SubLObject var89 = var87;
                    SubLObject var90 = (SubLObject)NIL;
                    var90 = var89.first();
                    while (NIL == var86 && NIL != var89) {
                        if (NIL == Sequences.find(var90, var88, (SubLObject)$ic80$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == Sequences.find(var90, var88, (SubLObject)$ic81$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var86 = var90;
                        }
                        var89 = var89.rest();
                        var90 = var89.first();
                    }
                }
                if (NIL == var86) {
                    var86 = var87.first();
                }
                var82 = (SubLObject)ConsesLow.cons(var86, var82);
                var84 = var84.rest();
                var85 = var84.first();
            }
            var82 = Sequences.nreverse(var82);
        }
        finally {
            module0579.$g4262$.rebind(var83, var81);
        }
        return var82;
    }
    
    public static SubLObject f47271(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0173.f10955(var30) && NIL != module0222.f14635($ic82$, var30, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) ? module0751.f46770((SubLObject)$ic83$, (SubLObject)ConsesLow.listS($ic82$, var30, (SubLObject)$ic84$), module0579.$g4260$.getDynamicValue(var31), (SubLObject)NIL, (SubLObject)ONE_INTEGER).first() : NIL);
    }
    
    public static SubLObject f47280(final SubLObject var107, final SubLObject var108, final SubLObject var99, SubLObject var109, SubLObject var110) {
        if (var109 == UNPROVIDED) {
            var109 = module0579.$g4260$.getDynamicValue();
        }
        if (var110 == UNPROVIDED) {
            var110 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = module0751.f46910(var107);
        final SubLObject var113 = module0751.f46940(var107);
        final SubLObject var114 = (SubLObject)((NIL != var113) ? module0749.f46466(var113) : NIL);
        final SubLObject var115 = module0751.f47118();
        if (NIL == var113) {
            Errors.warn((SubLObject)$ic85$, var107);
            return var107;
        }
        assert NIL != module0751.f46598((SubLObject)T) : T;
        final SubLObject var116 = module0579.$g4254$.currentBinding(var111);
        final SubLObject var117 = module0579.$g4237$.currentBinding(var111);
        try {
            module0579.$g4254$.bind((SubLObject)T, var111);
            module0579.$g4237$.bind((NIL != module0579.$g4237$.getDynamicValue(var111)) ? module0579.$g4237$.getDynamicValue(var111) : module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED), var111);
            f47267(var113, var115);
        }
        finally {
            module0579.$g4237$.rebind(var117, var111);
            module0579.$g4254$.rebind(var116, var111);
        }
        if (NIL != f47263(module0749.f46455(var113))) {
            return module0751.f46953((SubLObject)ConsesLow.list(var113));
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic86$, var114, var112);
        }
        f47260(var112, var114);
        final SubLObject var118 = module0770.f49078(var114, var108, var99, var109, var110, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
        if (NIL == f47263(var118)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic87$, var114);
            }
            return var107;
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic88$, var114, var118);
        }
        return module0751.f46907(var118, (SubLObject)ConsesLow.list(module0751.f46929(var118, var114, module0749.f46462(var113), module0749.f46474(var113), module0749.f46476(var113), (SubLObject)ZERO_INTEGER)));
    }
    
    public static SubLObject f47281() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0753", "f47245", "S#51697");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47246", "S#51698", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47247", "S#51699", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47248", "S#39076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47249", "S#39077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47250", "S#39078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47251", "S#51700", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47252", "S#51701", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47253", "S#51702", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47254", "S#51703", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47255", "S#51704", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47256", "S#51705", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47257", "S#51706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47258", "S#51707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47260", "S#51708", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47261", "S#50997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47262", "S#51709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47263", "S#51710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47264", "S#51711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47259", "S#51712", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0753", "f47265", "S#51713");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47266", "S#51714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47267", "S#51715", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47273", "S#51716", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47275", "S#44568", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47276", "S#51717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47277", "S#51718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47269", "S#51719", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47268", "S#51720", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47278", "S#51721", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47270", "S#51722", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47272", "S#51723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47274", "S#51724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47279", "S#51725", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47271", "S#51726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0753", "f47280", "S#51727", 3, 2, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47282() {
        $g6061$ = SubLFiles.defparameter("S#51728", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47283() {
        module0002.f50((SubLObject)$ic26$, (SubLObject)$ic54$);
        module0002.f50((SubLObject)$ic15$, (SubLObject)$ic54$);
        module0002.f50((SubLObject)$ic33$, (SubLObject)$ic54$);
        module0002.f50((SubLObject)$ic49$, (SubLObject)$ic54$);
        module0002.f50((SubLObject)$ic45$, (SubLObject)$ic54$);
        module0002.f50((SubLObject)$ic28$, (SubLObject)$ic54$);
        module0002.f50((SubLObject)$ic55$, (SubLObject)$ic54$);
        module0002.f50((SubLObject)$ic24$, (SubLObject)$ic54$);
        module0002.f50((SubLObject)$ic58$, (SubLObject)$ic54$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f47281();
    }
    
    public void initializeVariables() {
        f47282();
    }
    
    public void runTopLevelForms() {
        f47283();
    }
    
    static {
        me = (SubLFile)new module0753();
        $g6061$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#51729", "CYC"), (SubLObject)makeSymbol("S#38843", "CYC"), (SubLObject)makeSymbol("S#51730", "CYC"), (SubLObject)makeSymbol("S#39283", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeUninternedSymbol("US#34A1C48");
        $ic2$ = makeUninternedSymbol("US#49590BF");
        $ic3$ = makeUninternedSymbol("US#1A590BF");
        $ic4$ = makeUninternedSymbol("US#2ACE83B");
        $ic5$ = makeUninternedSymbol("US#3196D6");
        $ic6$ = makeUninternedSymbol("US#192D162");
        $ic7$ = makeUninternedSymbol("US#33252C2");
        $ic8$ = makeUninternedSymbol("US#70DE2C2");
        $ic9$ = makeSymbol("WITH-PPH-MEMOIZATION");
        $ic10$ = makeSymbol("CLET");
        $ic11$ = ConsesLow.list((SubLObject)NIL);
        $ic12$ = makeSymbol("S#39117", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#51700", "CYC"), (SubLObject)ONE_INTEGER, (SubLObject)makeString("~&Trying default precision: ~S.~%"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#51025", "CYC")));
        $ic14$ = makeSymbol("S#3323", "CYC");
        $ic15$ = makeSymbol("S#51701", "CYC");
        $ic16$ = makeSymbol("PIF");
        $ic17$ = makeSymbol("S#39267", "CYC");
        $ic18$ = makeSymbol("CPUSH");
        $ic19$ = makeSymbol("CSETQ");
        $ic20$ = ConsesLow.list((SubLObject)T);
        $ic21$ = ConsesLow.list((SubLObject)makeKeyword("FAILURE"));
        $ic22$ = makeSymbol("PROGN");
        $ic23$ = makeSymbol("NREVERSE");
        $ic24$ = makeSymbol("S#51707", "CYC");
        $ic25$ = makeSymbol("CDOLIST");
        $ic26$ = makeSymbol("S#51700", "CYC");
        $ic27$ = makeString("~&Working on dupe list: ~S~%");
        $ic28$ = makeSymbol("S#51705", "CYC");
        $ic29$ = makeSymbol("NTH");
        $ic30$ = makeString("~&Trying to reparaphrase ~S.~%");
        $ic31$ = makeSymbol("S#51032", "CYC");
        $ic32$ = makeSymbol("S#51731", "CYC");
        $ic33$ = makeSymbol("S#51702", "CYC");
        $ic34$ = makeSymbol("PUNLESS");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#51025", "CYC")));
        $ic36$ = makeString("~&Trying targeted precision ~S for ~S");
        $ic37$ = makeSymbol("WITH-PARAPHRASE-PRECISION");
        $ic38$ = makeSymbol("WITH-PPH-DEMERIT-CUTOFF");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#51731", "CYC"));
        $ic40$ = makeString("~&New paraphrase with precision ~S for ~S:~% ~S");
        $ic41$ = makeSymbol("PWHEN");
        $ic42$ = makeSymbol("CAND");
        $ic43$ = makeSymbol("LISTP");
        $ic44$ = makeSymbol("FIMPLIES");
        $ic45$ = makeSymbol("S#51704", "CYC");
        $ic46$ = makeString("~&Trying full precision for ~S");
        $ic47$ = makeSymbol("WITH-PRECISE-PARAPHRASE-ON");
        $ic48$ = makeString("~&New paraphrase with full precision for ~S:~% ~S");
        $ic49$ = makeSymbol("S#51703", "CYC");
        $ic50$ = makeString("~&Changing output-list for ~S from~% ~S to~% ~S.~%");
        $ic51$ = makeSymbol("SET-NTH");
        $ic52$ = makeSymbol("S#51732", "CYC");
        $ic53$ = makeSymbol("APPEND");
        $ic54$ = makeSymbol("S#51697", "CYC");
        $ic55$ = makeSymbol("S#51706", "CYC");
        $ic56$ = makeSymbol("S#51733", "CYC");
        $ic57$ = makeKeyword("DENOTS-UNKNOWN");
        $ic58$ = makeSymbol("S#51712", "CYC");
        $ic59$ = makeString("~&~S is a duplicate of ~S.~%");
        $ic60$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#51729", "CYC"), (SubLObject)makeSymbol("S#51730", "CYC"), (SubLObject)makeSymbol("S#39283", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic61$ = makeUninternedSymbol("US#4AF219B");
        $ic62$ = makeKeyword("ANY");
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("Noun"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("Adjective"));
        $ic65$ = makeString("(PPH error level ");
        $ic66$ = makeString(") ");
        $ic67$ = makeString("Can't add disambiguation string. Null category for ~S");
        $ic68$ = makeSymbol("S#20380", "CYC");
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("Agent-Generic"));
        $ic70$ = constant_handles_oc.f8479((SubLObject)makeString("alias"));
        $ic71$ = makeString(" (aka \"");
        $ic72$ = makeString("\")");
        $ic73$ = makeKeyword("WHEN-NECESSARY");
        $ic74$ = makeKeyword("TOP-LEVEL");
        $ic75$ = makeKeyword("TEXT");
        $ic76$ = makeSymbol("PPH-PRECISION-P");
        $ic77$ = makeString(" (");
        $ic78$ = makeString(")");
        $ic79$ = makeKeyword("ALL");
        $ic80$ = makeSymbol("S#51429", "CYC");
        $ic81$ = makeSymbol("S#51007", "CYC");
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("terseDisambiguationString"));
        $ic83$ = makeSymbol("?STRING");
        $ic84$ = ConsesLow.list((SubLObject)makeSymbol("?STRING"));
        $ic85$ = makeString("Can't disambiguate javalist:~% ~S");
        $ic86$ = makeString("Reparaphrasing~% ~S due to ambiguous string~% ~S.");
        $ic87$ = makeString("Failed to disambiguate ~S.");
        $ic88$ = makeString("Disambiguated~% ~S~% to ~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 340 ms
	
	Decompiled with Procyon 0.5.32.
*/