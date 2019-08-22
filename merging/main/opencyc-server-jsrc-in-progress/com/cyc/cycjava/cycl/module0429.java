package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0429 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0429";
    public static final String myFingerPrint = "a609d33d8885933696020b1df3f3fb070da5e9c6a59cb4467f81c3a75386757c";
    public static SubLSymbol $g3494$;
    public static SubLSymbol $g3495$;
    public static SubLSymbol $g3496$;
    public static SubLSymbol $g3497$;
    private static SubLSymbol $g3498$;
    private static SubLSymbol $g3499$;
    private static SubLSymbol $g3500$;
    private static SubLSymbol $g3501$;
    private static SubLSymbol $g3502$;
    public static SubLSymbol $g3503$;
    private static final SubLObject $ic0$;
    private static final SubLList $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
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
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLFloat $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLList $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLList $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLList $ic109$;
    private static final SubLObject $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLObject $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLList $ic125$;
    
    public static SubLObject f30373() {
        return conses_high.copy_list($g3500$.getGlobalValue());
    }
    
    public static SubLObject f30374() {
        return conses_high.copy_list($g3501$.getGlobalValue());
    }
    
    public static SubLObject f30375() {
        return $g3502$.getGlobalValue();
    }
    
    public static SubLObject f30376(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = $g3499$.getGlobalValue();
        }
        return module0425.f30066(var1, var2);
    }
    
    public static SubLObject f30377(final SubLObject var3, final SubLObject var4) {
        final SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10_11 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var5, (SubLObject)$ic9$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var5, (SubLObject)$ic9$);
            if (NIL == conses_high.member(var10_11, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var10_11 == $ic11$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic9$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var6);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var6);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic14$, var6);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic15$, var6);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var6);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : $ic17$);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var6);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : $ic19$);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var6);
        final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : T);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic21$, var6);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var6);
        final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var6);
        final SubLObject var29 = (SubLObject)((NIL != var28) ? conses_high.cadr(var28) : ZERO_INTEGER);
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var6);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var6);
        final SubLObject var33 = (NIL != var32) ? conses_high.cadr(var32) : $g3499$.getGlobalValue();
        final SubLObject var34 = (SubLObject)$ic26$;
        final SubLObject var35 = (SubLObject)$ic27$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic28$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var34, var13), (SubLObject)ConsesLow.list(var35, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var34, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var34, var33)))), (SubLObject)ConsesLow.list(new SubLObject[] { $ic31$, $ic12$, var11, $ic13$, var35, $ic14$, var15, $ic15$, var17, $ic16$, var19, $ic18$, var21, $ic20$, var23, $ic21$, var25, $ic22$, var27, $ic23$, var29, $ic24$, var31 }));
    }
    
    public static SubLObject f30378(final SubLObject var1) {
        final SubLObject var2 = f30376(var1, (SubLObject)UNPROVIDED);
        return module0424.f29795(var2);
    }
    
    public static SubLObject f30379(final SubLObject var36, final SubLObject var1) {
        final SubLObject var37 = f30376(var1, (SubLObject)UNPROVIDED);
        return module0424.f29787(var36, var37);
    }
    
    public static SubLObject f30380(final SubLObject var37) {
        return module0424.f29988(var37, $ic32$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30381(final SubLObject var37) {
        return module0424.f29988(var37, $ic33$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30382(final SubLObject var37) {
        return module0424.f29988(var37, $ic34$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30383(final SubLObject var37) {
        return module0424.f29988(var37, $ic35$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30384(final SubLObject var38) {
        return module0259.f16854(var38, $ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30385(final SubLObject var38) {
        return module0259.f16854(var38, $ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30386(final SubLObject var38) {
        return module0259.f16854(var38, $ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30387(final SubLObject var38) {
        return module0259.f16854(var38, $ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30388(final SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)$ic36$;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)$ic37$;
        }
        if (var42 == UNPROVIDED) {
            var42 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != module0091.f6320(var39) : var39;
        final SubLObject var43 = Symbols.symbol_value(var39);
        final SubLObject var44 = Symbols.symbol_name(var39);
        PrintLow.format(var42, (SubLObject)$ic39$);
        module0035.f2365(module0424.f29701(var43, f30373()), (SubLObject)UNPROVIDED);
        PrintLow.format(var42, (SubLObject)$ic40$);
        module0035.f2365(module0424.f29701(module0424.f29696(var43), f30373()), (SubLObject)UNPROVIDED);
        PrintLow.format(var42, (SubLObject)$ic41$);
        module0035.f2365(module0424.f29701(module0424.f29955(var43), f30373()), (SubLObject)UNPROVIDED);
        PrintLow.format(var42, (SubLObject)$ic42$);
        module0035.f2365(module0424.f29701(f30380(var43), f30373()), (SubLObject)UNPROVIDED);
        PrintLow.format(var42, (SubLObject)$ic43$);
        module0035.f2365(module0424.f29701(f30381(var43), f30373()), (SubLObject)UNPROVIDED);
        PrintLow.format(var42, (SubLObject)$ic44$);
        module0035.f2365(module0424.f29701(f30382(var43), f30373()), (SubLObject)UNPROVIDED);
        PrintLow.format(var42, (SubLObject)$ic45$);
        module0035.f2365(module0424.f29701(f30383(var43), f30373()), (SubLObject)UNPROVIDED);
        SubLObject var45 = f30374();
        SubLObject var46 = (SubLObject)NIL;
        var46 = var45.first();
        while (NIL != var45) {
            f30389(var43, var44, var46, var40, var41);
            var45 = var45.rest();
            var46 = var45.first();
        }
        return var44;
    }
    
    public static SubLObject f30389(final SubLObject var36, final SubLObject var43, final SubLObject var46, SubLObject var40, SubLObject var41) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)$ic36$;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)$ic37$;
        }
        return module0548.f33847(var36, var46, (SubLObject)$ic46$, (SubLObject)ConsesLow.listS((SubLObject)$ic47$, new SubLObject[] { Sequences.cconcatenate(module0006.f203(var40), new SubLObject[] { $ic48$, module0006.f203(var43), $ic49$, module0006.f203(var46) }), $ic50$, $ic51$, $ic52$, module0427.f30310(var46), $ic53$ }), var41);
    }
    
    public static SubLObject f30390(final SubLObject var47, final SubLObject var39, SubLObject var48, SubLObject var20, SubLObject var40, SubLObject var41, SubLObject var42) {
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)T;
        }
        if (var20 == UNPROVIDED) {
            var20 = f30373();
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)$ic36$;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)$ic37$;
        }
        if (var42 == UNPROVIDED) {
            var42 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        assert NIL != module0091.f6320(var47) : var47;
        assert NIL != module0091.f6320(var39) : var39;
        final SubLObject var50 = Symbols.symbol_value(var47);
        final SubLObject var51 = Symbols.symbol_name(var47);
        final SubLObject var52 = Symbols.symbol_value(var39);
        final SubLObject var53 = Symbols.symbol_name(var39);
        final SubLObject var54 = f30380(var50);
        final SubLObject var55 = f30380(var52);
        final SubLObject var56 = f30381(var50);
        final SubLObject var57 = f30381(var52);
        final SubLObject var58 = f30382(var50);
        final SubLObject var59 = f30382(var52);
        final SubLObject var60 = f30383(var50);
        final SubLObject var61 = f30383(var52);
        var49.resetMultipleValues();
        final SubLObject var62 = module0424.f29968(var50, var52);
        final SubLObject var63 = var49.secondMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format(var42, (SubLObject)$ic54$);
        var49.resetMultipleValues();
        SubLObject var64 = module0424.f30014(var50, var52);
        SubLObject var65 = var49.secondMultipleValue();
        SubLObject var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)T, (SubLObject)$ic55$, new SubLObject[] { var64, var65, var66 });
        var49.resetMultipleValues();
        var64 = module0424.f30014(var54, var55);
        var65 = var49.secondMultipleValue();
        var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)T, (SubLObject)$ic56$, new SubLObject[] { var64, var65, var66 });
        var49.resetMultipleValues();
        var64 = module0424.f30014(var56, var57);
        var65 = var49.secondMultipleValue();
        var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)T, (SubLObject)$ic57$, new SubLObject[] { var64, var65, var66 });
        var49.resetMultipleValues();
        var64 = module0424.f30014(var58, var59);
        var65 = var49.secondMultipleValue();
        var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)T, (SubLObject)$ic58$, new SubLObject[] { var64, var65, var66 });
        var49.resetMultipleValues();
        var64 = module0424.f30014(var60, var61);
        var65 = var49.secondMultipleValue();
        var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)T, (SubLObject)$ic59$, new SubLObject[] { var64, var65, var66 });
        PrintLow.format(var42, (SubLObject)$ic39$);
        module0424.f30024(module0424.f30020(var50, var52, var20));
        PrintLow.format(var42, (SubLObject)$ic60$);
        module0424.f30024(module0424.f30020(var62, var63, var20));
        PrintLow.format(var42, (SubLObject)$ic61$);
        module0424.f30024(module0424.f30020(f30380(var62), f30380(var63), var20));
        PrintLow.format(var42, (SubLObject)$ic62$);
        module0424.f30024(module0424.f30020(f30382(var62), f30382(var63), var20));
        PrintLow.format(var42, (SubLObject)$ic40$);
        module0424.f30024(module0424.f30020(module0424.f29696(var50), module0424.f29696(var52), var20));
        PrintLow.format(var42, (SubLObject)$ic41$);
        module0424.f30024(module0424.f30020(module0424.f29955(var50), module0424.f29955(var52), var20));
        PrintLow.format(var42, (SubLObject)$ic63$);
        module0424.f30024(module0424.f30020(var54, var55, var20));
        PrintLow.format(var42, (SubLObject)$ic64$);
        module0424.f30024(module0424.f30020(var56, var57, var20));
        PrintLow.format(var42, (SubLObject)$ic65$);
        module0424.f30024(module0424.f30020(var58, var59, var20));
        PrintLow.format(var42, (SubLObject)$ic66$);
        module0424.f30024(module0424.f30020(var60, var61, var20));
        if (NIL != var48) {
            SubLObject var67 = (SubLObject)$ic68$;
            SubLObject var68 = (SubLObject)NIL;
            var68 = var67.first();
            while (NIL != var67) {
                SubLObject var44_66 = (SubLObject)$ic67$;
                SubLObject var69 = (SubLObject)NIL;
                var69 = var44_66.first();
                while (NIL != var44_66) {
                    f30391(var50, var52, var51, var53, var68, var69, var40, var41);
                    var44_66 = var44_66.rest();
                    var69 = var44_66.first();
                }
                var67 = var67.rest();
                var68 = var67.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30391(final SubLObject var50, final SubLObject var36, final SubLObject var51, final SubLObject var52, final SubLObject var46, SubLObject var67, SubLObject var40, SubLObject var41) {
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)$ic69$;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)$ic36$;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)$ic37$;
        }
        return module0548.f33841(var50, var36, var46, (SubLObject)ConsesLow.listS((SubLObject)$ic47$, new SubLObject[] { Sequences.cconcatenate(module0006.f203(var40), new SubLObject[] { $ic70$, module0006.f203(var51), $ic71$, module0006.f203(var52), $ic49$, module0006.f203(var46) }), $ic50$, $ic51$, $ic52$, module0427.f30310(var46), $ic72$, var51, $ic73$, var52, $ic74$ }), var67, var41);
    }
    
    public static SubLObject f30392(final SubLObject var68, SubLObject var69, SubLObject var16, SubLObject var70) {
        if (var69 == UNPROVIDED) {
            var69 = (SubLObject)$ic75$;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)$ic76$;
        }
        if (var70 == UNPROVIDED) {
            var70 = (SubLObject)$ic77$;
        }
        final SubLObject var71 = module0425.f30094(var68, var70);
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = module0424.f29688(var71.first());
        SubLObject var74 = (SubLObject)NIL;
        var74 = var73.first();
        while (NIL != var73) {
            final SubLObject var75 = module0424.f30009(var71, var74);
            final SubLObject var76 = Functions.funcall(var69, var75);
            var72 = (SubLObject)ConsesLow.cons(var76, var72);
            var73 = var73.rest();
            var74 = var73.first();
        }
        SubLObject var77 = conses_high.copy_list(var71.first());
        var72 = Sequences.nreverse(var72);
        var77 = conses_high.putf(var77, (SubLObject)$ic78$, var72);
        var77 = conses_high.putf(var77, (SubLObject)$ic14$, var16);
        return var77;
    }
    
    public static SubLObject f30393(final SubLObject var73) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var74) && NIL == Numbers.oddp(Sequences.length(var73))) {
            Errors.error((SubLObject)$ic79$);
        }
        return module0048.f3387(var73, (SubLObject)$ic80$, (SubLObject)$ic81$);
    }
    
    public static SubLObject f30394(final SubLObject var76, final SubLObject var77, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var79 = SubLProcess.currentSubLThread();
        var79.resetMultipleValues();
        final SubLObject var80 = f30395(var76, (SubLObject)UNPROVIDED);
        final SubLObject var81 = var79.secondMultipleValue();
        final SubLObject var82 = var79.thirdMultipleValue();
        final SubLObject var83 = var79.fourthMultipleValue();
        var79.resetMultipleValues();
        return Numbers.add(new SubLObject[] { f30396(var80, $ic32$, var77, var78), f30396(var81, $ic33$, var77, var78), f30396(var82, $ic34$, var77, var78), f30396(var83, $ic35$, var77, var78) });
    }
    
    public static SubLObject f30397() {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = module0430.f30437();
        SubLObject var52 = (SubLObject)NIL;
        var52 = var51.first();
        while (NIL != var51) {
            SubLObject var53;
            SubLObject var54;
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            SubLObject var58;
            for (var53 = (SubLObject)NIL, var53 = (SubLObject)ZERO_INTEGER; var53.numL((SubLObject)FOUR_INTEGER); var53 = Numbers.add(var53, (SubLObject)ONE_INTEGER)) {
                var54 = module0147.f9540($g3496$.getGlobalValue());
                var55 = module0147.$g2095$.currentBinding(var49);
                var56 = module0147.$g2094$.currentBinding(var49);
                var57 = module0147.$g2096$.currentBinding(var49);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var54), var49);
                    module0147.$g2094$.bind(module0147.f9546(var54), var49);
                    module0147.$g2096$.bind(module0147.f9549(var54), var49);
                    var58 = f30398(var52, var53);
                    var50 = ConsesLow.nconc(var58, var50);
                }
                finally {
                    module0147.$g2096$.rebind(var57, var49);
                    module0147.$g2094$.rebind(var56, var49);
                    module0147.$g2095$.rebind(var55, var49);
                }
            }
            var51 = var51.rest();
            var52 = var51.first();
        }
        return module0035.f2269(var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30399() {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = module0430.f30437();
        SubLObject var52 = (SubLObject)NIL;
        var52 = var51.first();
        while (NIL != var51) {
            final SubLObject var53 = module0147.f9540($g3496$.getGlobalValue());
            final SubLObject var54 = module0147.$g2095$.currentBinding(var49);
            final SubLObject var55 = module0147.$g2094$.currentBinding(var49);
            final SubLObject var56 = module0147.$g2096$.currentBinding(var49);
            try {
                module0147.$g2095$.bind(module0147.f9545(var53), var49);
                module0147.$g2094$.bind(module0147.f9546(var53), var49);
                module0147.$g2096$.bind(module0147.f9549(var53), var49);
                final SubLObject var57 = f30400(var52);
                var50 = (SubLObject)ConsesLow.cons(var57, var50);
                final SubLObject var59;
                final SubLObject var58 = var59 = f30401(var52);
                if (NIL != var59) {
                    var50 = (SubLObject)ConsesLow.cons(var59, var50);
                }
            }
            finally {
                module0147.$g2096$.rebind(var56, var49);
                module0147.$g2094$.rebind(var55, var49);
                module0147.$g2095$.rebind(var54, var49);
            }
            var51 = var51.rest();
            var52 = var51.first();
        }
        return Sequences.nreverse(var50);
    }
    
    public static SubLObject f30395(final SubLObject var76, SubLObject var93) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)T;
        }
        SubLObject var94 = (SubLObject)NIL;
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        SubLObject var97 = (SubLObject)NIL;
        while (NIL != module0035.f1993(var94, var76, (SubLObject)UNPROVIDED) || NIL != module0035.f1993(var95, var76, (SubLObject)UNPROVIDED) || NIL != module0035.f1993(var96, var76, (SubLObject)UNPROVIDED) || NIL != module0035.f1993(var97, var76, (SubLObject)UNPROVIDED)) {
            final SubLObject var98 = (NIL != module0048.f3443((SubLObject)$ic82$)) ? f30402() : f30403();
            if (NIL != var98) {
                final SubLObject var99 = (SubLObject)makeBoolean(NIL == module0202.f12691(var98, (SubLObject)UNPROVIDED));
                final SubLObject var100 = module0035.sublisp_boolean(f30404(var98));
                if (NIL != var99) {
                    if (NIL != var100) {
                        if (NIL != var93) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic83$);
                            streams_high.force_output((SubLObject)UNPROVIDED);
                        }
                        var94 = (SubLObject)ConsesLow.cons(var98, var94);
                    }
                    else {
                        if (NIL != var93) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic84$);
                            streams_high.force_output((SubLObject)UNPROVIDED);
                        }
                        var95 = (SubLObject)ConsesLow.cons(var98, var95);
                    }
                }
                else if (NIL != var100) {
                    if (NIL != var93) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic85$);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    var96 = (SubLObject)ConsesLow.cons(var98, var96);
                }
                else {
                    if (NIL != var93) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic86$);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    var97 = (SubLObject)ConsesLow.cons(var98, var97);
                }
            }
        }
        var94 = module0035.f2124(var76, var94);
        var95 = module0035.f2124(var76, var95);
        var96 = module0035.f2124(var76, var96);
        var97 = module0035.f2124(var76, var97);
        return Values.values(var94, var95, var96, var97);
    }
    
    public static SubLObject f30402() {
        return f30400(f30405());
    }
    
    public static SubLObject f30400(final SubLObject var38) {
        final SubLObject var39 = f30406(var38);
        final SubLObject var40 = module0035.f2099(var39);
        return f30407(var38, (SubLObject)ConsesLow.list(var40));
    }
    
    public static SubLObject f30403() {
        return f30401(f30405());
    }
    
    public static SubLObject f30401(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        var39.resetMultipleValues();
        final SubLObject var40 = f30406(var38);
        final SubLObject var41 = var39.secondMultipleValue();
        var39.resetMultipleValues();
        if (NIL == var41) {
            return f30407(var38, var40);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30406(final SubLObject var38) {
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        final SubLObject var41 = module0423.f29563(var38);
        final SubLObject var42 = f30408(var38);
        SubLObject var43 = module0205.f13282(var41, Symbols.symbol_function((SubLObject)$ic87$));
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            if (NIL != f30409(var42, var44)) {
                var40 = (SubLObject)T;
            }
            else {
                var39 = (SubLObject)ConsesLow.cons(var44, var39);
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return Values.values(var39, var40);
    }
    
    public static SubLObject f30407(final SubLObject var38, final SubLObject var100) {
        SubLObject var101;
        for (var101 = (SubLObject)NIL; NIL == var101 || NIL == module0274.f18060(var101, $g3496$.getGlobalValue(), (SubLObject)UNPROVIDED); var101 = f30410(var38, var100)) {}
        return var101;
    }
    
    public static SubLObject f30410(final SubLObject var38, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        SubLObject var102 = module0423.f29563(var38);
        SubLObject var103 = var100;
        SubLObject var104 = (SubLObject)NIL;
        var104 = var103.first();
        while (NIL != var103) {
            final SubLObject var105 = f30398(var38, var104);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var101) && NIL == var105) {
                Errors.error((SubLObject)$ic88$, var104, var38);
            }
            final SubLObject var106 = f30411(var105);
            var102 = module0202.f12817(var104, var106, var102);
            var103 = var103.rest();
            var104 = var103.first();
        }
        return var102;
    }
    
    public static SubLObject f30398(final SubLObject var38, final SubLObject var84) {
        final SubLObject var85 = f30408(var38);
        if (NIL != module0035.f2169(var85, $g3495$.getGlobalValue())) {
            return f30412(var38, var84);
        }
        if (var85.eql($g3494$.getGlobalValue())) {
            return Errors.error((SubLObject)$ic89$, var38);
        }
        return f30413(var85, var84);
    }
    
    public static SubLObject f30412(final SubLObject var38, final SubLObject var84) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        final SubLObject var86 = module0423.f29563(var38);
        assert NIL != module0206.f13433(var86) : var86;
        final SubLObject var87 = module0205.f13333(var86);
        final SubLObject var88 = module0256.f16529(module0226.f14882(var87, var84, $g3496$.getGlobalValue()), $g3496$.getGlobalValue(), (SubLObject)UNPROVIDED);
        if (NIL != var88) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var85) && NIL == module0035.f1997(var88)) {
                Errors.error((SubLObject)$ic91$, var88);
            }
            final SubLObject var89 = var88.first();
            return module0430.f30429(var89);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30413(final SubLObject var101, final SubLObject var84) {
        final SubLThread var102 = SubLProcess.currentSubLThread();
        SubLObject var103 = (SubLObject)NIL;
        final SubLObject var104 = module0147.f9540($g3496$.getGlobalValue());
        final SubLObject var105 = module0147.$g2095$.currentBinding(var102);
        final SubLObject var106 = module0147.$g2094$.currentBinding(var102);
        final SubLObject var107 = module0147.$g2096$.currentBinding(var102);
        try {
            module0147.$g2095$.bind(module0147.f9545(var104), var102);
            module0147.$g2094$.bind(module0147.f9546(var104), var102);
            module0147.$g2096$.bind(module0147.f9549(var104), var102);
            final SubLObject var108 = module0220.f14593(var101, $ic92$, var84, (SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED).first();
            if (NIL != var108) {
                if (NIL != module0167.f10813(var108) && $ic93$.eql(module0205.f13276(var108))) {
                    var102.resetMultipleValues();
                    final SubLObject var109 = module0234.f15444(module0205.f13368(var108, (SubLObject)UNPROVIDED), (SubLObject)$ic94$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var110 = var102.secondMultipleValue();
                    var102.resetMultipleValues();
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var102) && NIL == var109) {
                        Errors.error((SubLObject)$ic95$);
                    }
                    final SubLObject var111 = module0205.f13277(var108, (SubLObject)UNPROVIDED);
                    var103 = conses_high.copy_list(module0430.f30433(var111));
                }
                else if (NIL != module0269.f17710(var108)) {
                    var103 = conses_high.copy_list(module0430.f30429(var108));
                }
                else {
                    Errors.error((SubLObject)$ic96$, var108);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var107, var102);
            module0147.$g2094$.rebind(var106, var102);
            module0147.$g2095$.rebind(var105, var102);
        }
        return var103;
    }
    
    public static SubLObject f30411(final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        final SubLObject var113 = f30414(var111);
        final SubLObject var114 = conses_high.second(Vectors.aref(var113, module0048.f_1_(Sequences.length(var113))));
        final SubLObject var115 = random.random(var114);
        var112.resetMultipleValues();
        final SubLObject var116 = module0037.f2601(var115, var113, Symbols.symbol_function((SubLObject)$ic97$), Symbols.symbol_function((SubLObject)$ic98$), Symbols.symbol_function((SubLObject)$ic99$), (SubLObject)UNPROVIDED);
        final SubLObject var117 = var112.secondMultipleValue();
        var112.resetMultipleValues();
        final SubLObject var118 = Vectors.aref(var113, var116).first();
        return var118;
    }
    
    public static SubLObject f30414(final SubLObject var111) {
        final SubLObject var112 = Vectors.make_vector(Sequences.length(var111), (SubLObject)UNPROVIDED);
        SubLObject var113 = (SubLObject)ZERO_INTEGER;
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115 = (SubLObject)NIL;
        SubLObject var116 = (SubLObject)NIL;
        var114 = var111;
        var115 = var114.first();
        for (var116 = (SubLObject)ZERO_INTEGER; NIL != var114; var114 = var114.rest(), var115 = var114.first(), var116 = Numbers.add((SubLObject)ONE_INTEGER, var116)) {
            var113 = Numbers.add(var113, module0217.f14357(var115));
            Vectors.set_aref(var112, var116, (SubLObject)ConsesLow.list(var115, var113));
        }
        return var112;
    }
    
    public static SubLObject f30396(final SubLObject var121, final SubLObject var106, final SubLObject var77, final SubLObject var78) {
        SubLObject var122 = (SubLObject)ZERO_INTEGER;
        SubLObject var123 = (SubLObject)NIL;
        SubLObject var124 = (SubLObject)NIL;
        SubLObject var125 = (SubLObject)NIL;
        var123 = var121;
        var124 = var123.first();
        for (var125 = (SubLObject)ZERO_INTEGER; NIL != var123; var123 = var123.rest(), var124 = var123.first(), var125 = Numbers.add((SubLObject)ONE_INTEGER, var125)) {
            if (NIL != f30415(var124, var106, var77, Numbers.add(var78, var125))) {
                var122 = Numbers.add(var122, (SubLObject)ONE_INTEGER);
            }
        }
        return var122;
    }
    
    public static SubLObject f30415(final SubLObject var94, final SubLObject var106, final SubLObject var77, final SubLObject var76) {
        final SubLObject var107 = Sequences.cconcatenate(constants_high_oc.f10743(var106), new SubLObject[] { $ic100$, module0038.f2638(var76) });
        final SubLObject var108 = module0543.f33623(var107, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != module0543.f33631((SubLObject)ConsesLow.list($ic101$, var108, var106), $ic102$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0543.f33631(module0423.f29546(var94, var108), $ic103$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != ((NIL != var77) ? module0543.f33631((SubLObject)ConsesLow.listS($ic101$, var108, (SubLObject)$ic104$), $ic102$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0543.f33631((SubLObject)ConsesLow.listS($ic101$, var108, (SubLObject)$ic105$), $ic102$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f30408(final SubLObject var38) {
        return module0434.f30578((SubLObject)$ic106$, (SubLObject)ConsesLow.list($ic107$, (SubLObject)ConsesLow.listS($ic108$, var38, (SubLObject)$ic109$), (SubLObject)ConsesLow.list($ic110$, (SubLObject)$ic106$, $g3494$.getGlobalValue())), $g3496$.getGlobalValue(), (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f30405() {
        return module0035.f2099(module0430.f30437());
    }
    
    public static SubLObject f30409(final SubLObject var101, final SubLObject var84) {
        return module0220.f14582($ic111$, var101, var84, $g3496$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30416(final SubLObject var124) {
        if (NIL == module0173.f10955(var124)) {
            return (SubLObject)NIL;
        }
        if (NIL != constant_handles_oc.f8449(var124)) {
            return module0259.f16975(var124, $ic112$, $ic113$, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)makeBoolean(NIL == module0035.f2439((SubLObject)$ic114$, module0172.f10920(var124), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f30417(final SubLObject var124) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var124) && NIL == f30416(var124));
    }
    
    public static SubLObject f30404(final SubLObject var94) {
        return module0409.f28506(var94, $g3496$.getGlobalValue(), $g3497$.getGlobalValue());
    }
    
    public static SubLObject f30418(final SubLObject var125) {
        SubLObject var126 = (SubLObject)NIL;
        SubLObject var127 = (SubLObject)NIL;
        if (var125.eql($ic32$)) {
            var127 = (SubLObject)T;
            var126 = (SubLObject)T;
        }
        else if (var125.eql($ic33$)) {
            var127 = (SubLObject)T;
            var126 = (SubLObject)NIL;
        }
        else if (var125.eql($ic34$)) {
            var127 = (SubLObject)NIL;
            var126 = (SubLObject)T;
        }
        else if (var125.eql($ic35$)) {
            var127 = (SubLObject)NIL;
            var126 = (SubLObject)NIL;
        }
        return f30419(var127, var126);
    }
    
    public static SubLObject f30419(final SubLObject var127, final SubLObject var126) {
        SubLObject var128 = (SubLObject)NIL;
        SubLObject var129 = (SubLObject)NIL;
        while (NIL == var128 || !var126.eql(var129)) {
            if (NIL != var127) {
                var128 = f30420((SubLObject)UNPROVIDED);
            }
            else {
                var128 = f30421((SubLObject)UNPROVIDED);
            }
            var129 = module0035.sublisp_boolean(f30404(var128));
            if (NIL != var129) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic115$);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            else {
                PrintLow.format((SubLObject)T, (SubLObject)$ic116$);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
        }
        return var128;
    }
    
    public static SubLObject f30421(SubLObject var93) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)T;
        }
        SubLObject var94 = (SubLObject)NIL;
        SubLObject var95 = (SubLObject)NIL;
        while (NIL == var94 || NIL == var95) {
            var94 = f30403();
            var95 = module0202.f12691(var94, (SubLObject)UNPROVIDED);
            if (NIL != var93) {
                if (NIL != var95) {
                    module0006.f218((SubLObject)T, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0006.f218((SubLObject)T, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
        }
        return var94;
    }
    
    public static SubLObject f30420(SubLObject var93) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)T;
        }
        SubLObject var94 = (SubLObject)NIL;
        SubLObject var95 = (SubLObject)NIL;
        while (NIL == var94 || NIL != var95) {
            var94 = f30402();
            var95 = module0202.f12691(var94, (SubLObject)UNPROVIDED);
            if (NIL != var93) {
                if (NIL != var95) {
                    module0006.f218((SubLObject)T, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0006.f218((SubLObject)T, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
        }
        return var94;
    }
    
    public static SubLObject f30422(final SubLObject var38) {
        final SubLObject var39 = module0434.f30578((SubLObject)$ic118$, (SubLObject)ConsesLow.list($ic119$, (SubLObject)$ic118$, (SubLObject)ConsesLow.list($ic120$, $ic121$, (SubLObject)$ic122$, var38)), $ic103$, (SubLObject)UNPROVIDED).first();
        final SubLObject var40 = module0434.f30578((SubLObject)$ic123$, (SubLObject)ConsesLow.listS($ic107$, (SubLObject)ConsesLow.listS($ic108$, var38, (SubLObject)$ic124$), (SubLObject)$ic125$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
        SubLObject var41 = (SubLObject)NIL;
        if (NIL != var39) {
            module0543.f33658(var39, $ic103$);
        }
        var41 = f30418(var40);
        module0543.f33631(module0423.f29546(var41, var38), $ic103$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30423() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30373", "S#32790", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30374", "S#33605", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30375", "S#33606", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30376", "S#33607", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0429", "f30377", "S#33608");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30378", "S#33609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30379", "S#33610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30380", "S#33611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30381", "S#33612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30382", "S#33613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30383", "S#33614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30384", "S#33615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30385", "S#33616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30386", "S#33617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30387", "S#33618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30388", "S#33619", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30389", "S#33620", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30390", "S#33621", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30391", "S#32791", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30392", "S#33622", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30393", "S#33623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30394", "S#33624", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30397", "S#33625", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30399", "S#33626", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30395", "S#33627", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30402", "S#33628", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30400", "S#33629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30403", "S#33630", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30401", "S#33631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30406", "S#33632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30407", "S#33633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30410", "S#33634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30398", "S#33635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30412", "S#33636", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30413", "S#33637", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30411", "S#33638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30414", "S#33639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30396", "S#33640", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30415", "S#33641", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30408", "S#33642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30405", "S#33643", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30409", "S#33644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30416", "S#33645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30417", "S#33646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30404", "S#33647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30418", "S#33648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30419", "S#33649", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30421", "S#33650", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30420", "S#33651", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0429", "f30422", "S#33652", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30424() {
        $g3494$ = SubLFiles.deflexical("S#33653", $ic0$);
        $g3495$ = SubLFiles.deflexical("S#33654", (SubLObject)$ic1$);
        $g3496$ = SubLFiles.deflexical("S#33655", $ic2$);
        $g3497$ = SubLFiles.deflexical("S#33656", (SubLObject)$ic3$);
        $g3498$ = SubLFiles.deflexical("S#33657", (SubLObject)$ic4$);
        $g3499$ = SubLFiles.deflexical("S#33658", Sequences.cconcatenate($g3498$.getGlobalValue(), (SubLObject)$ic5$));
        $g3500$ = SubLFiles.deflexical("S#33659", (SubLObject)$ic6$);
        $g3501$ = SubLFiles.deflexical("S#33660", (SubLObject)$ic6$);
        $g3502$ = SubLFiles.deflexical("S#33661", (SubLObject)$ic7$);
        $g3503$ = SubLFiles.deflexical("S#33662", (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30425() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30423();
    }
    
    public void initializeVariables() {
        f30424();
    }
    
    public void runTopLevelForms() {
        f30425();
    }
    
    static {
        me = (SubLFile)new module0429();
        $g3494$ = null;
        $g3495$ = null;
        $g3496$ = null;
        $g3497$ = null;
        $g3498$ = null;
        $g3499$ = null;
        $g3500$ = null;
        $g3501$ = null;
        $g3502$ = null;
        $g3503$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("AKBBuilderQuery-InferenceTest"));
        $ic1$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("AKBBuilderQuery-InferenceTest-Default")), constant_handles_oc.f8479((SubLObject)makeString("AKBBuilderQuery-InferenceTest-LeaveOpenArg2")));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("TKBSourceSpindleCollectorMt"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)NIL, (SubLObject)makeKeyword("CONTINUABLE?"), (SubLObject)NIL, (SubLObject)makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)NIL);
        $ic4$ = makeString("/cyc/projects/inference/lilliput/");
        $ic5$ = makeString("experiments/");
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-COUNT"), (SubLObject)makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), (SubLObject)makeKeyword("COMPLETE-TIME-PER-ANSWER"), (SubLObject)makeKeyword("ANSWERABILITY-TIME"), (SubLObject)makeKeyword("COMPLETE-TOTAL-TIME"));
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"), makeKeyword("TIME-PER-ANSWER"), makeKeyword("COMPLETE-TIME-PER-ANSWER"), makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("ANSWER-TIMES"), makeKeyword("TACTIC-COUNT"), makeKeyword("POSSIBLE-TACTIC-COUNT"), makeKeyword("EXECUTED-TACTIC-COUNT"), makeKeyword("DISCARDED-TACTIC-COUNT") });
        $ic8$ = makeInteger(60);
        $ic9$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#33243", "CYC"), makeSymbol("S#885", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#33246", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#7998", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#33606", "CYC")))), ConsesLow.list((SubLObject)makeSymbol("S#33247", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#33662", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#33248", "CYC"), (SubLObject)T), ConsesLow.list((SubLObject)makeSymbol("S#33249", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#33250", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#1545", "CYC"), (SubLObject)ZERO_INTEGER), makeSymbol("COUNT"), ConsesLow.list((SubLObject)makeSymbol("DIRECTORY"), (SubLObject)makeSymbol("S#33658", "CYC")) });
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("RANDOMIZE"), makeKeyword("SKIP"), makeKeyword("COUNT"), makeKeyword("DIRECTORY") });
        $ic11$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic12$ = makeKeyword("QUERY-SPEC-SET");
        $ic13$ = makeKeyword("FILENAME");
        $ic14$ = makeKeyword("COMMENT");
        $ic15$ = makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $ic16$ = makeKeyword("METRICS");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#33606", "CYC"));
        $ic18$ = makeKeyword("OUTLIER-TIMEOUT");
        $ic19$ = makeSymbol("S#33662", "CYC");
        $ic20$ = makeKeyword("INCREMENTAL");
        $ic21$ = makeKeyword("INCLUDE-RESULTS");
        $ic22$ = makeKeyword("RANDOMIZE");
        $ic23$ = makeKeyword("SKIP");
        $ic24$ = makeKeyword("COUNT");
        $ic25$ = makeKeyword("DIRECTORY");
        $ic26$ = makeUninternedSymbol("US#2150FF3");
        $ic27$ = makeUninternedSymbol("US#5E48C75");
        $ic28$ = makeSymbol("CLET");
        $ic29$ = makeSymbol("FWHEN");
        $ic30$ = makeSymbol("S#33607", "CYC");
        $ic31$ = makeSymbol("S#32922", "CYC");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("LilliputQuery-OpenGood"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("LilliputQuery-OpenNoGood"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("LilliputQuery-ClosedGood"));
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("LilliputQuery-ClosedNoGood"));
        $ic36$ = makeString("Lilliput Training");
        $ic37$ = makeString(":0");
        $ic38$ = makeSymbol("S#8004", "CYC");
        $ic39$ = makeString("~%~%Basic analysis: ~%");
        $ic40$ = makeString("~%~%Answerable: ~%");
        $ic41$ = makeString("~%~%Unanswerable: ~%");
        $ic42$ = makeString("~%~%Open Good ~%");
        $ic43$ = makeString("~%~%Open No Good ~%");
        $ic44$ = makeString("~%~%Closed Good ~%");
        $ic45$ = makeString("~%~%Closed No Good ~%");
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("S#33615", "CYC"), (SubLObject)makeSymbol("S#33616", "CYC"), (SubLObject)makeSymbol("S#33617", "CYC"), (SubLObject)makeSymbol("S#33618", "CYC"));
        $ic47$ = makeKeyword("PLOT-TITLE");
        $ic48$ = makeString(" ");
        $ic49$ = makeString("\\n");
        $ic50$ = makeKeyword("XLABEL");
        $ic51$ = makeString("Sorted Queries");
        $ic52$ = makeKeyword("YLABEL");
        $ic53$ = ConsesLow.list((SubLObject)makeKeyword("CLASSIFICATION-LABELS"), (SubLObject)ConsesLow.list((SubLObject)makeString("Open Good"), (SubLObject)makeString("Open No Good"), (SubLObject)makeString("Closed Good"), (SubLObject)makeString("Closed No Good")), (SubLObject)makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)makeInteger(212), (SubLObject)ONE_INTEGER));
        $ic54$ = makeString("~%~%Answerability analysis: ~%");
        $ic55$ = makeString("Total:           ~s ~s ~s~%");
        $ic56$ = makeString("Open Good:       ~s ~s ~s~%");
        $ic57$ = makeString("Open No Good:    ~s ~s ~s~%");
        $ic58$ = makeString("Closed Good:     ~s ~s ~s~%");
        $ic59$ = makeString("Closed No Good:  ~s ~s ~s~%");
        $ic60$ = makeString("~%~%Mutually Answerable: ~%");
        $ic61$ = makeString("~%~%Mutually Answerable Open Good: ~%");
        $ic62$ = makeString("~%~%Mutually Answerable Closed Good: ~%");
        $ic63$ = makeString("~%~%Open Good: ~%");
        $ic64$ = makeString("~%~%Open No Good: ~%");
        $ic65$ = makeString("~%~%Closed Good: ~%");
        $ic66$ = makeString("~%~%Closed No Good: ~%");
        $ic67$ = ConsesLow.list((SubLObject)makeKeyword("BOTH"), (SubLObject)makeKeyword("BASELINE"));
        $ic68$ = ConsesLow.list((SubLObject)makeKeyword("ANSWERABILITY-TIME"), (SubLObject)makeKeyword("COMPLETE-TOTAL-TIME"));
        $ic69$ = makeKeyword("BOTH");
        $ic70$ = makeString(": ");
        $ic71$ = makeString(" vs. ");
        $ic72$ = makeKeyword("BASELINE-KEY-LABEL");
        $ic73$ = makeKeyword("EXPERIMENT-KEY-LABEL");
        $ic74$ = ConsesLow.list((SubLObject)makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)makeInteger(212), (SubLObject)ONE_INTEGER));
        $ic75$ = makeSymbol("S#33623", "CYC");
        $ic76$ = makeString("");
        $ic77$ = makeKeyword("ORIGIN");
        $ic78$ = makeKeyword("QUERY-RUNS");
        $ic79$ = makeString("Cannot handle even numbers of query runs");
        $ic80$ = makeSymbol("S#32807", "CYC");
        $ic81$ = makeKeyword("ITEM");
        $ic82$ = (SubLFloat)makeDouble(0.5);
        $ic83$ = makeString("o");
        $ic84$ = makeString(".");
        $ic85$ = makeString("+");
        $ic86$ = makeString("x");
        $ic87$ = makeSymbol("EL-VAR?");
        $ic88$ = makeString("could not find any valid terms for argnum ~s of ~s");
        $ic89$ = makeString("got an unsorted query ~s");
        $ic90$ = makeSymbol("S#15527", "CYC");
        $ic91$ = makeString("Expected only one arg constraint, got ~s");
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("correspondingDomainInArg"));
        $ic93$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn"));
        $ic94$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeSymbol("?ARGS"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeSymbol("?ARGS"), constant_handles_oc.f8479((SubLObject)makeString("TKBConstant"))));
        $ic95$ = makeString("unhandled #$CollectionSubsetFn domain specification");
        $ic96$ = makeString("unexpected domain type ~s");
        $ic97$ = makeSymbol("<");
        $ic98$ = makeSymbol("=");
        $ic99$ = makeSymbol("SECOND");
        $ic100$ = makeString("-");
        $ic101$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic103$ = constant_handles_oc.f8479((SubLObject)makeString("TestVocabularyMt"));
        $ic104$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LilliputQuery-Training")));
        $ic105$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LilliputQuery-Blind")));
        $ic106$ = makeSymbol("?COL");
        $ic107$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("nearestIsa"));
        $ic109$ = ConsesLow.list((SubLObject)makeSymbol("?COL"));
        $ic110$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("leaveArgPlaceOpenInTestQueries"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)makeString("TKBConstant"));
        $ic113$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic114$ = makeSymbol("S#33646", "CYC");
        $ic115$ = makeString("g~%");
        $ic116$ = makeString("n~%");
        $ic117$ = makeString("c");
        $ic118$ = makeSymbol("?ASS");
        $ic119$ = constant_handles_oc.f8479((SubLObject)makeString("assertionSentence"));
        $ic120$ = constant_handles_oc.f8479((SubLObject)makeString("softwareParameterValueInSpecification"));
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceSentenceParameter"));
        $ic122$ = makeSymbol("?QUERY");
        $ic123$ = makeSymbol("?TYPE");
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("?TYPE"));
        $ic125$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("different")), (SubLObject)makeSymbol("?TYPE"), constant_handles_oc.f8479((SubLObject)makeString("LilliputQuery-Training"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 396 ms
	
	Decompiled with Procyon 0.5.32.
*/