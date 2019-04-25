package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return conses_high.copy_list(module0429.$g3500$.getGlobalValue());
    }
    
    public static SubLObject f30374() {
        return conses_high.copy_list(module0429.$g3501$.getGlobalValue());
    }
    
    public static SubLObject f30375() {
        return module0429.$g3502$.getGlobalValue();
    }
    
    public static SubLObject f30376(final SubLObject var1, SubLObject var2) {
        if (var2 == module0429.UNPROVIDED) {
            var2 = module0429.$g3499$.getGlobalValue();
        }
        return module0425.f30066(var1, var2);
    }
    
    public static SubLObject f30377(final SubLObject var3, final SubLObject var4) {
        final SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0429.NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)module0429.NIL;
        SubLObject var10_11 = (SubLObject)module0429.NIL;
        while (module0429.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var5, (SubLObject)module0429.$ic9$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var5, (SubLObject)module0429.$ic9$);
            if (module0429.NIL == conses_high.member(var10_11, (SubLObject)module0429.$ic10$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED)) {
                var9 = (SubLObject)module0429.T;
            }
            if (var10_11 == module0429.$ic11$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0429.NIL != var9 && module0429.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0429.$ic9$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic12$, var6);
        final SubLObject var11 = (SubLObject)((module0429.NIL != var10) ? conses_high.cadr(var10) : module0429.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic13$, var6);
        final SubLObject var13 = (SubLObject)((module0429.NIL != var12) ? conses_high.cadr(var12) : module0429.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic14$, var6);
        final SubLObject var15 = (SubLObject)((module0429.NIL != var14) ? conses_high.cadr(var14) : module0429.NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic15$, var6);
        final SubLObject var17 = (SubLObject)((module0429.NIL != var16) ? conses_high.cadr(var16) : module0429.NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic16$, var6);
        final SubLObject var19 = (SubLObject)((module0429.NIL != var18) ? conses_high.cadr(var18) : module0429.$ic17$);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic18$, var6);
        final SubLObject var21 = (SubLObject)((module0429.NIL != var20) ? conses_high.cadr(var20) : module0429.$ic19$);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic20$, var6);
        final SubLObject var23 = (SubLObject)((module0429.NIL != var22) ? conses_high.cadr(var22) : module0429.T);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic21$, var6);
        final SubLObject var25 = (SubLObject)((module0429.NIL != var24) ? conses_high.cadr(var24) : module0429.NIL);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic22$, var6);
        final SubLObject var27 = (SubLObject)((module0429.NIL != var26) ? conses_high.cadr(var26) : module0429.NIL);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic23$, var6);
        final SubLObject var29 = (SubLObject)((module0429.NIL != var28) ? conses_high.cadr(var28) : module0429.ZERO_INTEGER);
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic24$, var6);
        final SubLObject var31 = (SubLObject)((module0429.NIL != var30) ? conses_high.cadr(var30) : module0429.NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0429.$ic25$, var6);
        final SubLObject var33 = (module0429.NIL != var32) ? conses_high.cadr(var32) : module0429.$g3499$.getGlobalValue();
        final SubLObject var34 = (SubLObject)module0429.$ic26$;
        final SubLObject var35 = (SubLObject)module0429.$ic27$;
        return (SubLObject)ConsesLow.list((SubLObject)module0429.$ic28$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var34, var13), (SubLObject)ConsesLow.list(var35, (SubLObject)ConsesLow.list((SubLObject)module0429.$ic29$, var34, (SubLObject)ConsesLow.list((SubLObject)module0429.$ic30$, var34, var33)))), (SubLObject)ConsesLow.list(new SubLObject[] { module0429.$ic31$, module0429.$ic12$, var11, module0429.$ic13$, var35, module0429.$ic14$, var15, module0429.$ic15$, var17, module0429.$ic16$, var19, module0429.$ic18$, var21, module0429.$ic20$, var23, module0429.$ic21$, var25, module0429.$ic22$, var27, module0429.$ic23$, var29, module0429.$ic24$, var31 }));
    }
    
    public static SubLObject f30378(final SubLObject var1) {
        final SubLObject var2 = f30376(var1, (SubLObject)module0429.UNPROVIDED);
        return module0424.f29795(var2);
    }
    
    public static SubLObject f30379(final SubLObject var36, final SubLObject var1) {
        final SubLObject var37 = f30376(var1, (SubLObject)module0429.UNPROVIDED);
        return module0424.f29787(var36, var37);
    }
    
    public static SubLObject f30380(final SubLObject var37) {
        return module0424.f29988(var37, module0429.$ic32$, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30381(final SubLObject var37) {
        return module0424.f29988(var37, module0429.$ic33$, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30382(final SubLObject var37) {
        return module0424.f29988(var37, module0429.$ic34$, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30383(final SubLObject var37) {
        return module0424.f29988(var37, module0429.$ic35$, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30384(final SubLObject var38) {
        return module0259.f16854(var38, module0429.$ic32$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30385(final SubLObject var38) {
        return module0259.f16854(var38, module0429.$ic33$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30386(final SubLObject var38) {
        return module0259.f16854(var38, module0429.$ic34$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30387(final SubLObject var38) {
        return module0259.f16854(var38, module0429.$ic35$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30388(final SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42) {
        if (var40 == module0429.UNPROVIDED) {
            var40 = (SubLObject)module0429.$ic36$;
        }
        if (var41 == module0429.UNPROVIDED) {
            var41 = (SubLObject)module0429.$ic37$;
        }
        if (var42 == module0429.UNPROVIDED) {
            var42 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert module0429.NIL != module0091.f6320(var39) : var39;
        final SubLObject var43 = Symbols.symbol_value(var39);
        final SubLObject var44 = Symbols.symbol_name(var39);
        PrintLow.format(var42, (SubLObject)module0429.$ic39$);
        module0035.f2365(module0424.f29701(var43, f30373()), (SubLObject)module0429.UNPROVIDED);
        PrintLow.format(var42, (SubLObject)module0429.$ic40$);
        module0035.f2365(module0424.f29701(module0424.f29696(var43), f30373()), (SubLObject)module0429.UNPROVIDED);
        PrintLow.format(var42, (SubLObject)module0429.$ic41$);
        module0035.f2365(module0424.f29701(module0424.f29955(var43), f30373()), (SubLObject)module0429.UNPROVIDED);
        PrintLow.format(var42, (SubLObject)module0429.$ic42$);
        module0035.f2365(module0424.f29701(f30380(var43), f30373()), (SubLObject)module0429.UNPROVIDED);
        PrintLow.format(var42, (SubLObject)module0429.$ic43$);
        module0035.f2365(module0424.f29701(f30381(var43), f30373()), (SubLObject)module0429.UNPROVIDED);
        PrintLow.format(var42, (SubLObject)module0429.$ic44$);
        module0035.f2365(module0424.f29701(f30382(var43), f30373()), (SubLObject)module0429.UNPROVIDED);
        PrintLow.format(var42, (SubLObject)module0429.$ic45$);
        module0035.f2365(module0424.f29701(f30383(var43), f30373()), (SubLObject)module0429.UNPROVIDED);
        SubLObject var45 = f30374();
        SubLObject var46 = (SubLObject)module0429.NIL;
        var46 = var45.first();
        while (module0429.NIL != var45) {
            f30389(var43, var44, var46, var40, var41);
            var45 = var45.rest();
            var46 = var45.first();
        }
        return var44;
    }
    
    public static SubLObject f30389(final SubLObject var36, final SubLObject var43, final SubLObject var46, SubLObject var40, SubLObject var41) {
        if (var40 == module0429.UNPROVIDED) {
            var40 = (SubLObject)module0429.$ic36$;
        }
        if (var41 == module0429.UNPROVIDED) {
            var41 = (SubLObject)module0429.$ic37$;
        }
        return module0548.f33847(var36, var46, (SubLObject)module0429.$ic46$, (SubLObject)ConsesLow.listS((SubLObject)module0429.$ic47$, new SubLObject[] { Sequences.cconcatenate(module0006.f203(var40), new SubLObject[] { module0429.$ic48$, module0006.f203(var43), module0429.$ic49$, module0006.f203(var46) }), module0429.$ic50$, module0429.$ic51$, module0429.$ic52$, module0427.f30310(var46), module0429.$ic53$ }), var41);
    }
    
    public static SubLObject f30390(final SubLObject var47, final SubLObject var39, SubLObject var48, SubLObject var20, SubLObject var40, SubLObject var41, SubLObject var42) {
        if (var48 == module0429.UNPROVIDED) {
            var48 = (SubLObject)module0429.T;
        }
        if (var20 == module0429.UNPROVIDED) {
            var20 = f30373();
        }
        if (var40 == module0429.UNPROVIDED) {
            var40 = (SubLObject)module0429.$ic36$;
        }
        if (var41 == module0429.UNPROVIDED) {
            var41 = (SubLObject)module0429.$ic37$;
        }
        if (var42 == module0429.UNPROVIDED) {
            var42 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        assert module0429.NIL != module0091.f6320(var47) : var47;
        assert module0429.NIL != module0091.f6320(var39) : var39;
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
        PrintLow.format(var42, (SubLObject)module0429.$ic54$);
        var49.resetMultipleValues();
        SubLObject var64 = module0424.f30014(var50, var52);
        SubLObject var65 = var49.secondMultipleValue();
        SubLObject var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic55$, new SubLObject[] { var64, var65, var66 });
        var49.resetMultipleValues();
        var64 = module0424.f30014(var54, var55);
        var65 = var49.secondMultipleValue();
        var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic56$, new SubLObject[] { var64, var65, var66 });
        var49.resetMultipleValues();
        var64 = module0424.f30014(var56, var57);
        var65 = var49.secondMultipleValue();
        var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic57$, new SubLObject[] { var64, var65, var66 });
        var49.resetMultipleValues();
        var64 = module0424.f30014(var58, var59);
        var65 = var49.secondMultipleValue();
        var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic58$, new SubLObject[] { var64, var65, var66 });
        var49.resetMultipleValues();
        var64 = module0424.f30014(var60, var61);
        var65 = var49.secondMultipleValue();
        var66 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic59$, new SubLObject[] { var64, var65, var66 });
        PrintLow.format(var42, (SubLObject)module0429.$ic39$);
        module0424.f30024(module0424.f30020(var50, var52, var20));
        PrintLow.format(var42, (SubLObject)module0429.$ic60$);
        module0424.f30024(module0424.f30020(var62, var63, var20));
        PrintLow.format(var42, (SubLObject)module0429.$ic61$);
        module0424.f30024(module0424.f30020(f30380(var62), f30380(var63), var20));
        PrintLow.format(var42, (SubLObject)module0429.$ic62$);
        module0424.f30024(module0424.f30020(f30382(var62), f30382(var63), var20));
        PrintLow.format(var42, (SubLObject)module0429.$ic40$);
        module0424.f30024(module0424.f30020(module0424.f29696(var50), module0424.f29696(var52), var20));
        PrintLow.format(var42, (SubLObject)module0429.$ic41$);
        module0424.f30024(module0424.f30020(module0424.f29955(var50), module0424.f29955(var52), var20));
        PrintLow.format(var42, (SubLObject)module0429.$ic63$);
        module0424.f30024(module0424.f30020(var54, var55, var20));
        PrintLow.format(var42, (SubLObject)module0429.$ic64$);
        module0424.f30024(module0424.f30020(var56, var57, var20));
        PrintLow.format(var42, (SubLObject)module0429.$ic65$);
        module0424.f30024(module0424.f30020(var58, var59, var20));
        PrintLow.format(var42, (SubLObject)module0429.$ic66$);
        module0424.f30024(module0424.f30020(var60, var61, var20));
        if (module0429.NIL != var48) {
            SubLObject var67 = (SubLObject)module0429.$ic68$;
            SubLObject var68 = (SubLObject)module0429.NIL;
            var68 = var67.first();
            while (module0429.NIL != var67) {
                SubLObject var44_66 = (SubLObject)module0429.$ic67$;
                SubLObject var69 = (SubLObject)module0429.NIL;
                var69 = var44_66.first();
                while (module0429.NIL != var44_66) {
                    f30391(var50, var52, var51, var53, var68, var69, var40, var41);
                    var44_66 = var44_66.rest();
                    var69 = var44_66.first();
                }
                var67 = var67.rest();
                var68 = var67.first();
            }
        }
        return (SubLObject)module0429.NIL;
    }
    
    public static SubLObject f30391(final SubLObject var50, final SubLObject var36, final SubLObject var51, final SubLObject var52, final SubLObject var46, SubLObject var67, SubLObject var40, SubLObject var41) {
        if (var67 == module0429.UNPROVIDED) {
            var67 = (SubLObject)module0429.$ic69$;
        }
        if (var40 == module0429.UNPROVIDED) {
            var40 = (SubLObject)module0429.$ic36$;
        }
        if (var41 == module0429.UNPROVIDED) {
            var41 = (SubLObject)module0429.$ic37$;
        }
        return module0548.f33841(var50, var36, var46, (SubLObject)ConsesLow.listS((SubLObject)module0429.$ic47$, new SubLObject[] { Sequences.cconcatenate(module0006.f203(var40), new SubLObject[] { module0429.$ic70$, module0006.f203(var51), module0429.$ic71$, module0006.f203(var52), module0429.$ic49$, module0006.f203(var46) }), module0429.$ic50$, module0429.$ic51$, module0429.$ic52$, module0427.f30310(var46), module0429.$ic72$, var51, module0429.$ic73$, var52, module0429.$ic74$ }), var67, var41);
    }
    
    public static SubLObject f30392(final SubLObject var68, SubLObject var69, SubLObject var16, SubLObject var70) {
        if (var69 == module0429.UNPROVIDED) {
            var69 = (SubLObject)module0429.$ic75$;
        }
        if (var16 == module0429.UNPROVIDED) {
            var16 = (SubLObject)module0429.$ic76$;
        }
        if (var70 == module0429.UNPROVIDED) {
            var70 = (SubLObject)module0429.$ic77$;
        }
        final SubLObject var71 = module0425.f30094(var68, var70);
        SubLObject var72 = (SubLObject)module0429.NIL;
        SubLObject var73 = module0424.f29688(var71.first());
        SubLObject var74 = (SubLObject)module0429.NIL;
        var74 = var73.first();
        while (module0429.NIL != var73) {
            final SubLObject var75 = module0424.f30009(var71, var74);
            final SubLObject var76 = Functions.funcall(var69, var75);
            var72 = (SubLObject)ConsesLow.cons(var76, var72);
            var73 = var73.rest();
            var74 = var73.first();
        }
        SubLObject var77 = conses_high.copy_list(var71.first());
        var72 = Sequences.nreverse(var72);
        var77 = conses_high.putf(var77, (SubLObject)module0429.$ic78$, var72);
        var77 = conses_high.putf(var77, (SubLObject)module0429.$ic14$, var16);
        return var77;
    }
    
    public static SubLObject f30393(final SubLObject var73) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        if (module0429.NIL == Errors.$ignore_mustsP$.getDynamicValue(var74) && module0429.NIL == Numbers.oddp(Sequences.length(var73))) {
            Errors.error((SubLObject)module0429.$ic79$);
        }
        return module0048.f3387(var73, (SubLObject)module0429.$ic80$, (SubLObject)module0429.$ic81$);
    }
    
    public static SubLObject f30394(final SubLObject var76, final SubLObject var77, SubLObject var78) {
        if (var78 == module0429.UNPROVIDED) {
            var78 = (SubLObject)module0429.ZERO_INTEGER;
        }
        final SubLThread var79 = SubLProcess.currentSubLThread();
        var79.resetMultipleValues();
        final SubLObject var80 = f30395(var76, (SubLObject)module0429.UNPROVIDED);
        final SubLObject var81 = var79.secondMultipleValue();
        final SubLObject var82 = var79.thirdMultipleValue();
        final SubLObject var83 = var79.fourthMultipleValue();
        var79.resetMultipleValues();
        return Numbers.add(new SubLObject[] { f30396(var80, module0429.$ic32$, var77, var78), f30396(var81, module0429.$ic33$, var77, var78), f30396(var82, module0429.$ic34$, var77, var78), f30396(var83, module0429.$ic35$, var77, var78) });
    }
    
    public static SubLObject f30397() {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)module0429.NIL;
        SubLObject var51 = module0430.f30437();
        SubLObject var52 = (SubLObject)module0429.NIL;
        var52 = var51.first();
        while (module0429.NIL != var51) {
            SubLObject var53;
            SubLObject var54;
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            SubLObject var58;
            for (var53 = (SubLObject)module0429.NIL, var53 = (SubLObject)module0429.ZERO_INTEGER; var53.numL((SubLObject)module0429.FOUR_INTEGER); var53 = Numbers.add(var53, (SubLObject)module0429.ONE_INTEGER)) {
                var54 = module0147.f9540(module0429.$g3496$.getGlobalValue());
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
        return module0035.f2269(var50, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30399() {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)module0429.NIL;
        SubLObject var51 = module0430.f30437();
        SubLObject var52 = (SubLObject)module0429.NIL;
        var52 = var51.first();
        while (module0429.NIL != var51) {
            final SubLObject var53 = module0147.f9540(module0429.$g3496$.getGlobalValue());
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
                if (module0429.NIL != var59) {
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
        if (var93 == module0429.UNPROVIDED) {
            var93 = (SubLObject)module0429.T;
        }
        SubLObject var94 = (SubLObject)module0429.NIL;
        SubLObject var95 = (SubLObject)module0429.NIL;
        SubLObject var96 = (SubLObject)module0429.NIL;
        SubLObject var97 = (SubLObject)module0429.NIL;
        while (module0429.NIL != module0035.f1993(var94, var76, (SubLObject)module0429.UNPROVIDED) || module0429.NIL != module0035.f1993(var95, var76, (SubLObject)module0429.UNPROVIDED) || module0429.NIL != module0035.f1993(var96, var76, (SubLObject)module0429.UNPROVIDED) || module0429.NIL != module0035.f1993(var97, var76, (SubLObject)module0429.UNPROVIDED)) {
            final SubLObject var98 = (module0429.NIL != module0048.f3443((SubLObject)module0429.$ic82$)) ? f30402() : f30403();
            if (module0429.NIL != var98) {
                final SubLObject var99 = (SubLObject)SubLObjectFactory.makeBoolean(module0429.NIL == module0202.f12691(var98, (SubLObject)module0429.UNPROVIDED));
                final SubLObject var100 = module0035.sublisp_boolean(f30404(var98));
                if (module0429.NIL != var99) {
                    if (module0429.NIL != var100) {
                        if (module0429.NIL != var93) {
                            PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic83$);
                            streams_high.force_output((SubLObject)module0429.UNPROVIDED);
                        }
                        var94 = (SubLObject)ConsesLow.cons(var98, var94);
                    }
                    else {
                        if (module0429.NIL != var93) {
                            PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic84$);
                            streams_high.force_output((SubLObject)module0429.UNPROVIDED);
                        }
                        var95 = (SubLObject)ConsesLow.cons(var98, var95);
                    }
                }
                else if (module0429.NIL != var100) {
                    if (module0429.NIL != var93) {
                        PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic85$);
                        streams_high.force_output((SubLObject)module0429.UNPROVIDED);
                    }
                    var96 = (SubLObject)ConsesLow.cons(var98, var96);
                }
                else {
                    if (module0429.NIL != var93) {
                        PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic86$);
                        streams_high.force_output((SubLObject)module0429.UNPROVIDED);
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
        if (module0429.NIL == var41) {
            return f30407(var38, var40);
        }
        return (SubLObject)module0429.NIL;
    }
    
    public static SubLObject f30406(final SubLObject var38) {
        SubLObject var39 = (SubLObject)module0429.NIL;
        SubLObject var40 = (SubLObject)module0429.NIL;
        final SubLObject var41 = module0423.f29563(var38);
        final SubLObject var42 = f30408(var38);
        SubLObject var43 = module0205.f13282(var41, Symbols.symbol_function((SubLObject)module0429.$ic87$));
        SubLObject var44 = (SubLObject)module0429.NIL;
        var44 = var43.first();
        while (module0429.NIL != var43) {
            if (module0429.NIL != f30409(var42, var44)) {
                var40 = (SubLObject)module0429.T;
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
        for (var101 = (SubLObject)module0429.NIL; module0429.NIL == var101 || module0429.NIL == module0274.f18060(var101, module0429.$g3496$.getGlobalValue(), (SubLObject)module0429.UNPROVIDED); var101 = f30410(var38, var100)) {}
        return var101;
    }
    
    public static SubLObject f30410(final SubLObject var38, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        SubLObject var102 = module0423.f29563(var38);
        SubLObject var103 = var100;
        SubLObject var104 = (SubLObject)module0429.NIL;
        var104 = var103.first();
        while (module0429.NIL != var103) {
            final SubLObject var105 = f30398(var38, var104);
            if (module0429.NIL == Errors.$ignore_mustsP$.getDynamicValue(var101) && module0429.NIL == var105) {
                Errors.error((SubLObject)module0429.$ic88$, var104, var38);
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
        if (module0429.NIL != module0035.f2169(var85, module0429.$g3495$.getGlobalValue())) {
            return f30412(var38, var84);
        }
        if (var85.eql(module0429.$g3494$.getGlobalValue())) {
            return Errors.error((SubLObject)module0429.$ic89$, var38);
        }
        return f30413(var85, var84);
    }
    
    public static SubLObject f30412(final SubLObject var38, final SubLObject var84) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        final SubLObject var86 = module0423.f29563(var38);
        assert module0429.NIL != module0206.f13433(var86) : var86;
        final SubLObject var87 = module0205.f13333(var86);
        final SubLObject var88 = module0256.f16529(module0226.f14882(var87, var84, module0429.$g3496$.getGlobalValue()), module0429.$g3496$.getGlobalValue(), (SubLObject)module0429.UNPROVIDED);
        if (module0429.NIL != var88) {
            if (module0429.NIL == Errors.$ignore_mustsP$.getDynamicValue(var85) && module0429.NIL == module0035.f1997(var88)) {
                Errors.error((SubLObject)module0429.$ic91$, var88);
            }
            final SubLObject var89 = var88.first();
            return module0430.f30429(var89);
        }
        return (SubLObject)module0429.NIL;
    }
    
    public static SubLObject f30413(final SubLObject var101, final SubLObject var84) {
        final SubLThread var102 = SubLProcess.currentSubLThread();
        SubLObject var103 = (SubLObject)module0429.NIL;
        final SubLObject var104 = module0147.f9540(module0429.$g3496$.getGlobalValue());
        final SubLObject var105 = module0147.$g2095$.currentBinding(var102);
        final SubLObject var106 = module0147.$g2094$.currentBinding(var102);
        final SubLObject var107 = module0147.$g2096$.currentBinding(var102);
        try {
            module0147.$g2095$.bind(module0147.f9545(var104), var102);
            module0147.$g2094$.bind(module0147.f9546(var104), var102);
            module0147.$g2096$.bind(module0147.f9549(var104), var102);
            final SubLObject var108 = module0220.f14593(var101, module0429.$ic92$, var84, (SubLObject)module0429.ONE_INTEGER, (SubLObject)module0429.THREE_INTEGER, (SubLObject)module0429.TWO_INTEGER, (SubLObject)module0429.UNPROVIDED).first();
            if (module0429.NIL != var108) {
                if (module0429.NIL != module0167.f10813(var108) && module0429.$ic93$.eql(module0205.f13276(var108))) {
                    var102.resetMultipleValues();
                    final SubLObject var109 = module0234.f15444(module0205.f13368(var108, (SubLObject)module0429.UNPROVIDED), (SubLObject)module0429.$ic94$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
                    final SubLObject var110 = var102.secondMultipleValue();
                    var102.resetMultipleValues();
                    if (module0429.NIL == Errors.$ignore_mustsP$.getDynamicValue(var102) && module0429.NIL == var109) {
                        Errors.error((SubLObject)module0429.$ic95$);
                    }
                    final SubLObject var111 = module0205.f13277(var108, (SubLObject)module0429.UNPROVIDED);
                    var103 = conses_high.copy_list(module0430.f30433(var111));
                }
                else if (module0429.NIL != module0269.f17710(var108)) {
                    var103 = conses_high.copy_list(module0430.f30429(var108));
                }
                else {
                    Errors.error((SubLObject)module0429.$ic96$, var108);
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
        final SubLObject var116 = module0037.f2601(var115, var113, Symbols.symbol_function((SubLObject)module0429.$ic97$), Symbols.symbol_function((SubLObject)module0429.$ic98$), Symbols.symbol_function((SubLObject)module0429.$ic99$), (SubLObject)module0429.UNPROVIDED);
        final SubLObject var117 = var112.secondMultipleValue();
        var112.resetMultipleValues();
        final SubLObject var118 = Vectors.aref(var113, var116).first();
        return var118;
    }
    
    public static SubLObject f30414(final SubLObject var111) {
        final SubLObject var112 = Vectors.make_vector(Sequences.length(var111), (SubLObject)module0429.UNPROVIDED);
        SubLObject var113 = (SubLObject)module0429.ZERO_INTEGER;
        SubLObject var114 = (SubLObject)module0429.NIL;
        SubLObject var115 = (SubLObject)module0429.NIL;
        SubLObject var116 = (SubLObject)module0429.NIL;
        var114 = var111;
        var115 = var114.first();
        for (var116 = (SubLObject)module0429.ZERO_INTEGER; module0429.NIL != var114; var114 = var114.rest(), var115 = var114.first(), var116 = Numbers.add((SubLObject)module0429.ONE_INTEGER, var116)) {
            var113 = Numbers.add(var113, module0217.f14357(var115));
            Vectors.set_aref(var112, var116, (SubLObject)ConsesLow.list(var115, var113));
        }
        return var112;
    }
    
    public static SubLObject f30396(final SubLObject var121, final SubLObject var106, final SubLObject var77, final SubLObject var78) {
        SubLObject var122 = (SubLObject)module0429.ZERO_INTEGER;
        SubLObject var123 = (SubLObject)module0429.NIL;
        SubLObject var124 = (SubLObject)module0429.NIL;
        SubLObject var125 = (SubLObject)module0429.NIL;
        var123 = var121;
        var124 = var123.first();
        for (var125 = (SubLObject)module0429.ZERO_INTEGER; module0429.NIL != var123; var123 = var123.rest(), var124 = var123.first(), var125 = Numbers.add((SubLObject)module0429.ONE_INTEGER, var125)) {
            if (module0429.NIL != f30415(var124, var106, var77, Numbers.add(var78, var125))) {
                var122 = Numbers.add(var122, (SubLObject)module0429.ONE_INTEGER);
            }
        }
        return var122;
    }
    
    public static SubLObject f30415(final SubLObject var94, final SubLObject var106, final SubLObject var77, final SubLObject var76) {
        final SubLObject var107 = Sequences.cconcatenate(constants_high_oc.f10743(var106), new SubLObject[] { module0429.$ic100$, module0038.f2638(var76) });
        final SubLObject var108 = module0543.f33623(var107, (SubLObject)module0429.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0429.NIL != module0543.f33631((SubLObject)ConsesLow.list(module0429.$ic101$, var108, var106), module0429.$ic102$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED) && module0429.NIL != module0543.f33631(module0423.f29546(var94, var108), module0429.$ic103$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED) && module0429.NIL != ((module0429.NIL != var77) ? module0543.f33631((SubLObject)ConsesLow.listS(module0429.$ic101$, var108, (SubLObject)module0429.$ic104$), module0429.$ic102$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED) : module0543.f33631((SubLObject)ConsesLow.listS(module0429.$ic101$, var108, (SubLObject)module0429.$ic105$), module0429.$ic102$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED)));
    }
    
    public static SubLObject f30408(final SubLObject var38) {
        return module0434.f30578((SubLObject)module0429.$ic106$, (SubLObject)ConsesLow.list(module0429.$ic107$, (SubLObject)ConsesLow.listS(module0429.$ic108$, var38, (SubLObject)module0429.$ic109$), (SubLObject)ConsesLow.list(module0429.$ic110$, (SubLObject)module0429.$ic106$, module0429.$g3494$.getGlobalValue())), module0429.$g3496$.getGlobalValue(), (SubLObject)module0429.UNPROVIDED).first();
    }
    
    public static SubLObject f30405() {
        return module0035.f2099(module0430.f30437());
    }
    
    public static SubLObject f30409(final SubLObject var101, final SubLObject var84) {
        return module0220.f14582(module0429.$ic111$, var101, var84, module0429.$g3496$.getGlobalValue(), (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
    }
    
    public static SubLObject f30416(final SubLObject var124) {
        if (module0429.NIL == module0173.f10955(var124)) {
            return (SubLObject)module0429.NIL;
        }
        if (module0429.NIL != constant_handles_oc.f8449(var124)) {
            return module0259.f16975(var124, module0429.$ic112$, module0429.$ic113$, (SubLObject)module0429.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0429.NIL == module0035.f2439((SubLObject)module0429.$ic114$, module0172.f10920(var124), (SubLObject)module0429.UNPROVIDED));
    }
    
    public static SubLObject f30417(final SubLObject var124) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0429.NIL != module0173.f10955(var124) && module0429.NIL == f30416(var124));
    }
    
    public static SubLObject f30404(final SubLObject var94) {
        return module0409.f28506(var94, module0429.$g3496$.getGlobalValue(), module0429.$g3497$.getGlobalValue());
    }
    
    public static SubLObject f30418(final SubLObject var125) {
        SubLObject var126 = (SubLObject)module0429.NIL;
        SubLObject var127 = (SubLObject)module0429.NIL;
        if (var125.eql(module0429.$ic32$)) {
            var127 = (SubLObject)module0429.T;
            var126 = (SubLObject)module0429.T;
        }
        else if (var125.eql(module0429.$ic33$)) {
            var127 = (SubLObject)module0429.T;
            var126 = (SubLObject)module0429.NIL;
        }
        else if (var125.eql(module0429.$ic34$)) {
            var127 = (SubLObject)module0429.NIL;
            var126 = (SubLObject)module0429.T;
        }
        else if (var125.eql(module0429.$ic35$)) {
            var127 = (SubLObject)module0429.NIL;
            var126 = (SubLObject)module0429.NIL;
        }
        return f30419(var127, var126);
    }
    
    public static SubLObject f30419(final SubLObject var127, final SubLObject var126) {
        SubLObject var128 = (SubLObject)module0429.NIL;
        SubLObject var129 = (SubLObject)module0429.NIL;
        while (module0429.NIL == var128 || !var126.eql(var129)) {
            if (module0429.NIL != var127) {
                var128 = f30420((SubLObject)module0429.UNPROVIDED);
            }
            else {
                var128 = f30421((SubLObject)module0429.UNPROVIDED);
            }
            var129 = module0035.sublisp_boolean(f30404(var128));
            if (module0429.NIL != var129) {
                PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic115$);
                streams_high.force_output((SubLObject)module0429.UNPROVIDED);
            }
            else {
                PrintLow.format((SubLObject)module0429.T, (SubLObject)module0429.$ic116$);
                streams_high.force_output((SubLObject)module0429.UNPROVIDED);
            }
        }
        return var128;
    }
    
    public static SubLObject f30421(SubLObject var93) {
        if (var93 == module0429.UNPROVIDED) {
            var93 = (SubLObject)module0429.T;
        }
        SubLObject var94 = (SubLObject)module0429.NIL;
        SubLObject var95 = (SubLObject)module0429.NIL;
        while (module0429.NIL == var94 || module0429.NIL == var95) {
            var94 = f30403();
            var95 = module0202.f12691(var94, (SubLObject)module0429.UNPROVIDED);
            if (module0429.NIL != var93) {
                if (module0429.NIL != var95) {
                    module0006.f218((SubLObject)module0429.T, (SubLObject)module0429.$ic117$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
                }
                else {
                    module0006.f218((SubLObject)module0429.T, (SubLObject)module0429.$ic83$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
                }
            }
        }
        return var94;
    }
    
    public static SubLObject f30420(SubLObject var93) {
        if (var93 == module0429.UNPROVIDED) {
            var93 = (SubLObject)module0429.T;
        }
        SubLObject var94 = (SubLObject)module0429.NIL;
        SubLObject var95 = (SubLObject)module0429.NIL;
        while (module0429.NIL == var94 || module0429.NIL != var95) {
            var94 = f30402();
            var95 = module0202.f12691(var94, (SubLObject)module0429.UNPROVIDED);
            if (module0429.NIL != var93) {
                if (module0429.NIL != var95) {
                    module0006.f218((SubLObject)module0429.T, (SubLObject)module0429.$ic117$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
                }
                else {
                    module0006.f218((SubLObject)module0429.T, (SubLObject)module0429.$ic83$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
                }
            }
        }
        return var94;
    }
    
    public static SubLObject f30422(final SubLObject var38) {
        final SubLObject var39 = module0434.f30578((SubLObject)module0429.$ic118$, (SubLObject)ConsesLow.list(module0429.$ic119$, (SubLObject)module0429.$ic118$, (SubLObject)ConsesLow.list(module0429.$ic120$, module0429.$ic121$, (SubLObject)module0429.$ic122$, var38)), module0429.$ic103$, (SubLObject)module0429.UNPROVIDED).first();
        final SubLObject var40 = module0434.f30578((SubLObject)module0429.$ic123$, (SubLObject)ConsesLow.listS(module0429.$ic107$, (SubLObject)ConsesLow.listS(module0429.$ic108$, var38, (SubLObject)module0429.$ic124$), (SubLObject)module0429.$ic125$), (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED).first();
        SubLObject var41 = (SubLObject)module0429.NIL;
        if (module0429.NIL != var39) {
            module0543.f33658(var39, module0429.$ic103$);
        }
        var41 = f30418(var40);
        module0543.f33631(module0423.f29546(var41, var38), module0429.$ic103$, (SubLObject)module0429.UNPROVIDED, (SubLObject)module0429.UNPROVIDED);
        return (SubLObject)module0429.NIL;
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
        return (SubLObject)module0429.NIL;
    }
    
    public static SubLObject f30424() {
        module0429.$g3494$ = SubLFiles.deflexical("S#33653", module0429.$ic0$);
        module0429.$g3495$ = SubLFiles.deflexical("S#33654", (SubLObject)module0429.$ic1$);
        module0429.$g3496$ = SubLFiles.deflexical("S#33655", module0429.$ic2$);
        module0429.$g3497$ = SubLFiles.deflexical("S#33656", (SubLObject)module0429.$ic3$);
        module0429.$g3498$ = SubLFiles.deflexical("S#33657", (SubLObject)module0429.$ic4$);
        module0429.$g3499$ = SubLFiles.deflexical("S#33658", Sequences.cconcatenate(module0429.$g3498$.getGlobalValue(), (SubLObject)module0429.$ic5$));
        module0429.$g3500$ = SubLFiles.deflexical("S#33659", (SubLObject)module0429.$ic6$);
        module0429.$g3501$ = SubLFiles.deflexical("S#33660", (SubLObject)module0429.$ic6$);
        module0429.$g3502$ = SubLFiles.deflexical("S#33661", (SubLObject)module0429.$ic7$);
        module0429.$g3503$ = SubLFiles.deflexical("S#33662", (SubLObject)module0429.$ic8$);
        return (SubLObject)module0429.NIL;
    }
    
    public static SubLObject f30425() {
        return (SubLObject)module0429.NIL;
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
        module0429.$g3494$ = null;
        module0429.$g3495$ = null;
        module0429.$g3496$ = null;
        module0429.$g3497$ = null;
        module0429.$g3498$ = null;
        module0429.$g3499$ = null;
        module0429.$g3500$ = null;
        module0429.$g3501$ = null;
        module0429.$g3502$ = null;
        module0429.$g3503$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AKBBuilderQuery-InferenceTest"));
        $ic1$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AKBBuilderQuery-InferenceTest-Default")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AKBBuilderQuery-InferenceTest-LeaveOpenArg2")));
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0429.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)module0429.NIL, (SubLObject)SubLObjectFactory.makeKeyword("CONTINUABLE?"), (SubLObject)module0429.NIL, (SubLObject)SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)module0429.NIL);
        $ic4$ = SubLObjectFactory.makeString("/cyc/projects/inference/lilliput/");
        $ic5$ = SubLObjectFactory.makeString("experiments/");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TIME-PER-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWERABILITY-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"));
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ANSWER-COUNT"), SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("TOTAL-TIME"), SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"), SubLObjectFactory.makeKeyword("TIME-PER-ANSWER"), SubLObjectFactory.makeKeyword("COMPLETE-TIME-PER-ANSWER"), SubLObjectFactory.makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER"), SubLObjectFactory.makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), SubLObjectFactory.makeKeyword("ANSWER-TIMES"), SubLObjectFactory.makeKeyword("TACTIC-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-TACTIC-COUNT"), SubLObjectFactory.makeKeyword("EXECUTED-TACTIC-COUNT"), SubLObjectFactory.makeKeyword("DISCARDED-TACTIC-COUNT") });
        $ic8$ = SubLObjectFactory.makeInteger(60);
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#33243", "CYC"), SubLObjectFactory.makeSymbol("S#885", "CYC"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("S#33246", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7998", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33606", "CYC")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33247", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33662", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33248", "CYC"), (SubLObject)module0429.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33249", "CYC"), (SubLObject)module0429.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33250", "CYC"), (SubLObject)module0429.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1545", "CYC"), (SubLObject)module0429.ZERO_INTEGER), SubLObjectFactory.makeSymbol("COUNT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("S#33658", "CYC")) });
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("QUERY-SPEC-SET"), SubLObjectFactory.makeKeyword("FILENAME"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES"), SubLObjectFactory.makeKeyword("METRICS"), SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT"), SubLObjectFactory.makeKeyword("INCREMENTAL"), SubLObjectFactory.makeKeyword("INCLUDE-RESULTS"), SubLObjectFactory.makeKeyword("RANDOMIZE"), SubLObjectFactory.makeKeyword("SKIP"), SubLObjectFactory.makeKeyword("COUNT"), SubLObjectFactory.makeKeyword("DIRECTORY") });
        $ic11$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic12$ = SubLObjectFactory.makeKeyword("QUERY-SPEC-SET");
        $ic13$ = SubLObjectFactory.makeKeyword("FILENAME");
        $ic14$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic15$ = SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $ic16$ = SubLObjectFactory.makeKeyword("METRICS");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33606", "CYC"));
        $ic18$ = SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT");
        $ic19$ = SubLObjectFactory.makeSymbol("S#33662", "CYC");
        $ic20$ = SubLObjectFactory.makeKeyword("INCREMENTAL");
        $ic21$ = SubLObjectFactory.makeKeyword("INCLUDE-RESULTS");
        $ic22$ = SubLObjectFactory.makeKeyword("RANDOMIZE");
        $ic23$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic24$ = SubLObjectFactory.makeKeyword("COUNT");
        $ic25$ = SubLObjectFactory.makeKeyword("DIRECTORY");
        $ic26$ = SubLObjectFactory.makeUninternedSymbol("US#2150FF3");
        $ic27$ = SubLObjectFactory.makeUninternedSymbol("US#5E48C75");
        $ic28$ = SubLObjectFactory.makeSymbol("CLET");
        $ic29$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic30$ = SubLObjectFactory.makeSymbol("S#33607", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#32922", "CYC");
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LilliputQuery-OpenGood"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LilliputQuery-OpenNoGood"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LilliputQuery-ClosedGood"));
        $ic35$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LilliputQuery-ClosedNoGood"));
        $ic36$ = SubLObjectFactory.makeString("Lilliput Training");
        $ic37$ = SubLObjectFactory.makeString(":0");
        $ic38$ = SubLObjectFactory.makeSymbol("S#8004", "CYC");
        $ic39$ = SubLObjectFactory.makeString("~%~%Basic analysis: ~%");
        $ic40$ = SubLObjectFactory.makeString("~%~%Answerable: ~%");
        $ic41$ = SubLObjectFactory.makeString("~%~%Unanswerable: ~%");
        $ic42$ = SubLObjectFactory.makeString("~%~%Open Good ~%");
        $ic43$ = SubLObjectFactory.makeString("~%~%Open No Good ~%");
        $ic44$ = SubLObjectFactory.makeString("~%~%Closed Good ~%");
        $ic45$ = SubLObjectFactory.makeString("~%~%Closed No Good ~%");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33615", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33616", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33617", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33618", "CYC"));
        $ic47$ = SubLObjectFactory.makeKeyword("PLOT-TITLE");
        $ic48$ = SubLObjectFactory.makeString(" ");
        $ic49$ = SubLObjectFactory.makeString("\\n");
        $ic50$ = SubLObjectFactory.makeKeyword("XLABEL");
        $ic51$ = SubLObjectFactory.makeString("Sorted Queries");
        $ic52$ = SubLObjectFactory.makeKeyword("YLABEL");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASSIFICATION-LABELS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Open Good"), (SubLObject)SubLObjectFactory.makeString("Open No Good"), (SubLObject)SubLObjectFactory.makeString("Closed Good"), (SubLObject)SubLObjectFactory.makeString("Closed No Good")), (SubLObject)SubLObjectFactory.makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)module0429.ONE_INTEGER));
        $ic54$ = SubLObjectFactory.makeString("~%~%Answerability analysis: ~%");
        $ic55$ = SubLObjectFactory.makeString("Total:           ~s ~s ~s~%");
        $ic56$ = SubLObjectFactory.makeString("Open Good:       ~s ~s ~s~%");
        $ic57$ = SubLObjectFactory.makeString("Open No Good:    ~s ~s ~s~%");
        $ic58$ = SubLObjectFactory.makeString("Closed Good:     ~s ~s ~s~%");
        $ic59$ = SubLObjectFactory.makeString("Closed No Good:  ~s ~s ~s~%");
        $ic60$ = SubLObjectFactory.makeString("~%~%Mutually Answerable: ~%");
        $ic61$ = SubLObjectFactory.makeString("~%~%Mutually Answerable Open Good: ~%");
        $ic62$ = SubLObjectFactory.makeString("~%~%Mutually Answerable Closed Good: ~%");
        $ic63$ = SubLObjectFactory.makeString("~%~%Open Good: ~%");
        $ic64$ = SubLObjectFactory.makeString("~%~%Open No Good: ~%");
        $ic65$ = SubLObjectFactory.makeString("~%~%Closed Good: ~%");
        $ic66$ = SubLObjectFactory.makeString("~%~%Closed No Good: ~%");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOTH"), (SubLObject)SubLObjectFactory.makeKeyword("BASELINE"));
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWERABILITY-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"));
        $ic69$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic70$ = SubLObjectFactory.makeString(": ");
        $ic71$ = SubLObjectFactory.makeString(" vs. ");
        $ic72$ = SubLObjectFactory.makeKeyword("BASELINE-KEY-LABEL");
        $ic73$ = SubLObjectFactory.makeKeyword("EXPERIMENT-KEY-LABEL");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)module0429.ONE_INTEGER));
        $ic75$ = SubLObjectFactory.makeSymbol("S#33623", "CYC");
        $ic76$ = SubLObjectFactory.makeString("");
        $ic77$ = SubLObjectFactory.makeKeyword("ORIGIN");
        $ic78$ = SubLObjectFactory.makeKeyword("QUERY-RUNS");
        $ic79$ = SubLObjectFactory.makeString("Cannot handle even numbers of query runs");
        $ic80$ = SubLObjectFactory.makeSymbol("S#32807", "CYC");
        $ic81$ = SubLObjectFactory.makeKeyword("ITEM");
        $ic82$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $ic83$ = SubLObjectFactory.makeString("o");
        $ic84$ = SubLObjectFactory.makeString(".");
        $ic85$ = SubLObjectFactory.makeString("+");
        $ic86$ = SubLObjectFactory.makeString("x");
        $ic87$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic88$ = SubLObjectFactory.makeString("could not find any valid terms for argnum ~s of ~s");
        $ic89$ = SubLObjectFactory.makeString("got an unsorted query ~s");
        $ic90$ = SubLObjectFactory.makeSymbol("S#15527", "CYC");
        $ic91$ = SubLObjectFactory.makeString("Expected only one arg constraint, got ~s");
        $ic92$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("correspondingDomainInArg"));
        $ic93$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $ic94$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?ARGS"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeSymbol("?ARGS"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TKBConstant"))));
        $ic95$ = SubLObjectFactory.makeString("unhandled #$CollectionSubsetFn domain specification");
        $ic96$ = SubLObjectFactory.makeString("unexpected domain type ~s");
        $ic97$ = SubLObjectFactory.makeSymbol("<");
        $ic98$ = SubLObjectFactory.makeSymbol("=");
        $ic99$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic100$ = SubLObjectFactory.makeString("-");
        $ic101$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic102$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic103$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $ic104$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LilliputQuery-Training")));
        $ic105$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LilliputQuery-Blind")));
        $ic106$ = SubLObjectFactory.makeSymbol("?COL");
        $ic107$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic108$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nearestIsa"));
        $ic109$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COL"));
        $ic110$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic111$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("leaveArgPlaceOpenInTestQueries"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TKBConstant"));
        $ic113$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic114$ = SubLObjectFactory.makeSymbol("S#33646", "CYC");
        $ic115$ = SubLObjectFactory.makeString("g~%");
        $ic116$ = SubLObjectFactory.makeString("n~%");
        $ic117$ = SubLObjectFactory.makeString("c");
        $ic118$ = SubLObjectFactory.makeSymbol("?ASS");
        $ic119$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertionSentence"));
        $ic120$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("softwareParameterValueInSpecification"));
        $ic121$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceSentenceParameter"));
        $ic122$ = SubLObjectFactory.makeSymbol("?QUERY");
        $ic123$ = SubLObjectFactory.makeSymbol("?TYPE");
        $ic124$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TYPE"));
        $ic125$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LilliputQuery-Training"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0429.class
	Total time: 396 ms
	
	Decompiled with Procyon 0.5.32.
*/