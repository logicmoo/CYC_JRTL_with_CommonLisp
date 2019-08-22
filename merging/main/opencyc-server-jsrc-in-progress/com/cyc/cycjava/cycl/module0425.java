package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0425 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0425";
    public static final String myFingerPrint = "4603bf74af0a23a8fe40584f19192c2c08027b002b3f5d8becabdf75976f18f0";
    private static SubLSymbol $g3469$;
    private static SubLSymbol $g3470$;
    private static SubLSymbol $g3471$;
    public static SubLSymbol $g3472$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
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
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLList $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    
    public static SubLObject f30051() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0159.$g2138$.setDynamicValue((SubLObject)T, var1);
        module0159.$g2137$.setDynamicValue((SubLObject)T, var1);
        module0159.$g2140$.setDynamicValue((NIL != module0077.f5302(module0159.$g2140$.getDynamicValue(var1))) ? module0159.$g2140$.getDynamicValue(var1) : module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var1);
        module0159.$g2141$.setDynamicValue((NIL != module0077.f5302(module0159.$g2141$.getDynamicValue(var1))) ? module0159.$g2141$.getDynamicValue(var1) : module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var1);
        module0159.$g2142$.setDynamicValue((NIL != module0077.f5302(module0159.$g2142$.getDynamicValue(var1))) ? module0159.$g2142$.getDynamicValue(var1) : module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var1);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30052() {
        module0159.$g2138$.setDynamicValue((SubLObject)NIL);
        module0159.$g2137$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30053() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0159.$g2140$.setDynamicValue((SubLObject)((NIL != module0077.f5302(module0159.$g2140$.getDynamicValue(var1))) ? module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL), var1);
        module0159.$g2141$.setDynamicValue((SubLObject)((NIL != module0077.f5302(module0159.$g2141$.getDynamicValue(var1))) ? module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL), var1);
        module0159.$g2142$.setDynamicValue((SubLObject)((NIL != module0077.f5302(module0159.$g2142$.getDynamicValue(var1))) ? module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL), var1);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30054(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11041(var2, (SubLObject)UNPROVIDED)) {
            module0159.f10363(var2);
            if (NIL != module0159.$g2139$.getDynamicValue(var3) && module0159.$g2147$.getDynamicValue(var3).isNumber()) {
                module0159.$g2147$.setDynamicValue(Numbers.add(module0159.$g2147$.getDynamicValue(var3), (SubLObject)ONE_INTEGER), var3);
            }
            if (NIL != module0159.$g2138$.getDynamicValue(var3)) {
                module0159.$g2143$.setGlobalValue(var2);
            }
            if (NIL != module0159.$g2137$.getDynamicValue(var3) && NIL != module0077.f5302(module0159.$g2140$.getDynamicValue(var3))) {
                module0077.f5326(var2, module0159.$g2140$.getDynamicValue(var3));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30055(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0159.$g2139$.getDynamicValue(var4) && module0159.$g2148$.getDynamicValue(var4).isNumber()) {
            module0159.$g2148$.setDynamicValue(Numbers.add(module0159.$g2148$.getDynamicValue(var4), (SubLObject)ONE_INTEGER), var4);
        }
        if (NIL != module0159.$g2138$.getDynamicValue(var4)) {
            module0159.$g2145$.setGlobalValue(var3);
            module0159.$g2144$.setGlobalValue(var3);
        }
        if (NIL != module0159.$g2137$.getDynamicValue(var4) && NIL != module0077.f5302(module0159.$g2141$.getDynamicValue(var4))) {
            module0077.f5326(var3, module0159.$g2141$.getDynamicValue(var4));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30056(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (NIL != module0159.$g2139$.getDynamicValue(var5) && module0159.$g2148$.getDynamicValue(var5).isNumber()) {
            module0159.$g2148$.setDynamicValue(Numbers.add(module0159.$g2148$.getDynamicValue(var5), (SubLObject)ONE_INTEGER), var5);
        }
        if (NIL != module0159.$g2138$.getDynamicValue(var5)) {
            module0159.$g2146$.setGlobalValue(var4);
            module0159.$g2144$.setGlobalValue(var4);
        }
        if (NIL != module0159.$g2137$.getDynamicValue(var5) && NIL != module0077.f5302(module0159.$g2142$.getDynamicValue(var5))) {
            module0077.f5326(var4, module0159.$g2142$.getDynamicValue(var5));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30057(final SubLObject var5) {
        if (NIL != constant_handles_oc.f8449(var5)) {
            f30055(var5);
        }
        else if (NIL != module0167.f10813(var5)) {
            f30056(var5);
        }
        else if (NIL != assertion_handles_oc.f11035(var5)) {
            f30054(var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30058() {
        return module0159.$g2143$.getGlobalValue();
    }
    
    public static SubLObject f30059() {
        return module0159.$g2145$.getGlobalValue();
    }
    
    public static SubLObject f30060() {
        return module0159.$g2146$.getGlobalValue();
    }
    
    public static SubLObject f30061() {
        return module0159.$g2144$.getGlobalValue();
    }
    
    public static SubLObject f30062() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0077.f5302(module0159.$g2140$.getDynamicValue(var1))) ? module0077.f5311(module0159.$g2140$.getDynamicValue(var1)) : ZERO_INTEGER);
    }
    
    public static SubLObject f30063() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0077.f5302(module0159.$g2141$.getDynamicValue(var1))) ? module0077.f5311(module0159.$g2141$.getDynamicValue(var1)) : ZERO_INTEGER);
    }
    
    public static SubLObject f30064() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0077.f5302(module0159.$g2142$.getDynamicValue(var1))) ? module0077.f5311(module0159.$g2142$.getDynamicValue(var1)) : ZERO_INTEGER);
    }
    
    public static SubLObject f30065() {
        return Numbers.add(f30063(), f30064());
    }
    
    public static SubLObject f30066(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = $g3469$.getGlobalValue();
        }
        return Sequences.cconcatenate(var7, new SubLObject[] { var6, $ic1$, $ic2$ });
    }
    
    public static SubLObject f30067(final SubLObject var6) {
        return Sequences.cconcatenate($g3470$.getGlobalValue(), new SubLObject[] { var6, $ic1$, $ic4$ });
    }
    
    public static SubLObject f30068(final SubLObject var6) {
        final SubLObject var7 = f30066(var6, (SubLObject)UNPROVIDED);
        return module0424.f29795(var7);
    }
    
    public static SubLObject f30069(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var9);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var9);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        var10.resetMultipleValues();
        final SubLObject var15 = module0051.f3642(var14);
        final SubLObject var16 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        final SubLObject var17 = Sequences.substitute((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_period, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic7$, new SubLObject[] { var15, var16, var17 });
    }
    
    public static SubLObject f30070(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL == var6) {
            var6 = f30066((SubLObject)$ic10$, (SubLObject)UNPROVIDED);
        }
        $g3471$.setGlobalValue(module0424.f29795(var6));
        return $g3471$.getGlobalValue();
    }
    
    public static SubLObject f30071(final SubLObject var9) {
        return module0424.f30003($g3471$.getGlobalValue(), var9);
    }
    
    public static SubLObject f30072(final SubLObject var19, final SubLObject var20) {
        final SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = var22;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26_27 = (SubLObject)NIL;
        while (NIL != var24) {
            cdestructuring_bind.destructuring_bind_must_consp(var24, var21, (SubLObject)$ic11$);
            var26_27 = var24.first();
            var24 = var24.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var24, var21, (SubLObject)$ic11$);
            if (NIL == conses_high.member(var26_27, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var25 = (SubLObject)T;
            }
            if (var26_27 == $ic13$) {
                var23 = var24.first();
            }
            var24 = var24.rest();
        }
        if (NIL != var25 && NIL == var23) {
            cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)$ic11$);
        }
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic14$, var22);
        final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic15$, var22);
        final SubLObject var29 = (SubLObject)((NIL != var28) ? conses_high.cadr(var28) : NIL);
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var22);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic17$, var22);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var22);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : $ic19$);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var22);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : $ic21$);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var22);
        final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var22);
        final SubLObject var41 = (SubLObject)((NIL != var40) ? conses_high.cadr(var40) : T);
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var22);
        final SubLObject var43 = (SubLObject)((NIL != var42) ? conses_high.cadr(var42) : ZERO_INTEGER);
        final SubLObject var44 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var22);
        final SubLObject var45 = (SubLObject)((NIL != var44) ? conses_high.cadr(var44) : NIL);
        final SubLObject var46 = cdestructuring_bind.property_list_member((SubLObject)$ic26$, var22);
        final SubLObject var47 = (NIL != var46) ? conses_high.cadr(var46) : $g3469$.getGlobalValue();
        final SubLObject var48 = (SubLObject)$ic27$;
        final SubLObject var49 = (SubLObject)$ic28$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var48, var29), (SubLObject)ConsesLow.list(var49, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var48, (SubLObject)ConsesLow.list((SubLObject)$ic31$, var48, var47)))), (SubLObject)ConsesLow.list(new SubLObject[] { $ic32$, $ic14$, var27, $ic15$, var49, $ic16$, var31, $ic17$, var33, $ic18$, var35, $ic20$, var37, $ic22$, var39, $ic23$, var41, $ic24$, var43, $ic25$, var45 }));
    }
    
    public static SubLObject f30073(final SubLObject var49, final SubLObject var50, SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = module0360.f23813();
        }
        final SubLObject var51 = module0424.f30020(var49, var50, var36);
        return f30074(var51);
    }
    
    public static SubLObject f30074(final SubLObject var51) {
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var56;
        SubLObject var57;
        SubLObject var58;
        for (var53 = (SubLObject)NIL, var53 = var51; NIL != var53; var53 = conses_high.cddr(var53)) {
            var54 = var53.first();
            var55 = conses_high.cadr(var53);
            var56 = var55.first();
            var57 = conses_high.second(var55);
            var58 = (SubLObject)((NIL == var56 || var56.isZero()) ? $ic33$ : Numbers.divide(var57, var56));
            var52 = conses_high.putf(var52, var54, var58);
        }
        return var52;
    }
    
    public static SubLObject f30075(final SubLObject var51, final SubLObject var59, final SubLObject var60) {
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        SubLObject var67;
        for (var62 = (SubLObject)NIL, var62 = var51; NIL != var62; var62 = conses_high.cddr(var62)) {
            var63 = var62.first();
            var64 = conses_high.cadr(var62);
            var65 = var64.first();
            var66 = conses_high.second(var64);
            var67 = conses_high.getf(var59, var63, (SubLObject)UNPROVIDED);
            if (var67.isNumber()) {
                if ($ic34$ == var60) {
                    var65 = module0048.f3302(Numbers.multiply(var65, var67), (SubLObject)FOUR_INTEGER);
                }
                if ($ic35$ == var60) {
                    var66 = module0048.f3302(Numbers.multiply(var66, var67), (SubLObject)FOUR_INTEGER);
                }
                var61 = conses_high.putf(var61, var63, (SubLObject)ConsesLow.list(var65, var66));
            }
        }
        return var61;
    }
    
    public static SubLObject f30076(final SubLObject var66, final SubLObject var67) {
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69;
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        for (var69 = (SubLObject)NIL, var69 = var66; NIL != var69; var69 = conses_high.cddr(var69)) {
            var70 = var69.first();
            var71 = conses_high.cadr(var69);
            var72 = conses_high.getf(var67, var70, (SubLObject)UNPROVIDED);
            if (var72.isNumber() && var71.isNumber()) {
                var71 = Numbers.multiply(var71, var72);
            }
            var68 = conses_high.putf(var68, var70, var71);
        }
        return var68;
    }
    
    public static SubLObject f30077(final SubLObject var59) {
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        for (var61 = (SubLObject)NIL, var61 = var59; NIL != var61; var61 = conses_high.cddr(var61)) {
            var62 = var61.first();
            var63 = conses_high.cadr(var61);
            if (var63.isNumber() && !var63.isZero()) {
                var63 = Numbers.invert(var63);
            }
            var60 = conses_high.putf(var60, var62, var63);
        }
        return var60;
    }
    
    public static SubLObject f30078(final SubLObject var9, final SubLObject var6, SubLObject var69) {
        if (var69 == UNPROVIDED) {
            var69 = (SubLObject)NIL;
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        final SubLObject var71 = f30067(var6);
        if (NIL == var69 && NIL == Errors.$ignore_mustsP$.getDynamicValue(var70) && NIL != Filesys.probe_file(var71)) {
            Errors.error((SubLObject)$ic36$, var71);
        }
        SubLObject var72 = (SubLObject)NIL;
        try {
            var72 = compatibility.open_text(var71, (SubLObject)$ic37$);
            if (!var72.isStream()) {
                Errors.error((SubLObject)$ic38$, var71);
            }
            final SubLObject var71_72 = var72;
            f30079(var9, var71_72);
        }
        finally {
            final SubLObject var73 = Threads.$is_thread_performing_cleanupP$.currentBinding(var70);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var70);
                if (var72.isStream()) {
                    streams_high.close(var72, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var73, var70);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30079(final SubLObject var9, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = StreamsLow.$standard_output$.getDynamicValue();
        }
        PrintLow.format(var71, (SubLObject)$ic39$);
        final SubLObject var72 = module0424.f29681(var9);
        PrintLow.format(var71, (SubLObject)$ic40$, var72);
        final SubLObject var73 = conses_high.getf(var9, (SubLObject)$ic6$, (SubLObject)UNPROVIDED);
        PrintLow.format(var71, (SubLObject)$ic40$, module0051.f3552(var73));
        final SubLObject var74 = module0035.f2357(var9, (SubLObject)$ic41$);
        module0035.f2365(var74, var71);
        PrintLow.format(var71, (SubLObject)$ic39$);
        PrintLow.format(var71, (SubLObject)$ic42$);
        final SubLObject var75 = module0424.f29678(var9);
        final SubLObject var76 = (SubLObject)$ic43$;
        final SubLObject var77 = module0424.f29702(var75, var76);
        module0035.f2365(var77, var71);
        PrintLow.format(var71, (SubLObject)$ic44$);
        f30080(var9, var71, (SubLObject)$ic45$);
        f30081(var9, var71, (SubLObject)$ic46$);
        f30081(var9, var71, (SubLObject)$ic47$);
        f30081(var9, var71, (SubLObject)$ic48$);
        f30081(var9, var71, (SubLObject)$ic49$);
        f30080(var9, var71, (SubLObject)$ic50$);
        f30080(var9, var71, (SubLObject)$ic51$);
        f30080(var9, var71, (SubLObject)$ic52$);
        f30082(var9, var71, (SubLObject)$ic53$);
        f30082(var9, var71, (SubLObject)$ic54$);
        f30083(var9, var71, (SubLObject)$ic55$, (SubLObject)$ic56$);
        f30080(var9, var71, (SubLObject)$ic57$);
        f30080(var9, var71, (SubLObject)$ic58$);
        f30082(var9, var71, (SubLObject)$ic59$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30080(final SubLObject var9, final SubLObject var71, final SubLObject var77) {
        PrintLow.format(var71, (SubLObject)$ic60$, var77);
        final SubLObject var78 = module0424.f29687(var9, var77, (SubLObject)UNPROVIDED);
        final SubLObject var79 = module0035.f2516(var78, Symbols.symbol_function((SubLObject)$ic61$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        module0035.f2365(var79, var71);
        PrintLow.format(var71, (SubLObject)$ic44$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30081(final SubLObject var9, final SubLObject var71, final SubLObject var77) {
        PrintLow.format(var71, (SubLObject)$ic62$, var77);
        final SubLObject var78 = module0424.f29687(var9, var77, (SubLObject)UNPROVIDED);
        final SubLObject var79 = Sort.sort(conses_high.copy_list(var78), Symbols.symbol_function((SubLObject)$ic61$), (SubLObject)UNPROVIDED);
        module0006.f215(var79, var71);
        streams_high.terpri(var71);
        PrintLow.format(var71, (SubLObject)$ic44$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30082(final SubLObject var9, final SubLObject var71, final SubLObject var81) {
        PrintLow.format(var71, (SubLObject)$ic63$, var81);
        final SubLObject var82 = f30084(var9, var81);
        final SubLObject var83 = Sort.sort(conses_high.copy_list(var82), Symbols.symbol_function((SubLObject)$ic61$), Symbols.symbol_function((SubLObject)$ic64$));
        module0006.f215(var83, var71);
        streams_high.terpri(var71);
        PrintLow.format(var71, (SubLObject)$ic44$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30083(final SubLObject var9, final SubLObject var71, final SubLObject var81, final SubLObject var84) {
        PrintLow.format(var71, (SubLObject)$ic65$, var84, var81);
        final SubLObject var85 = f30084(var9, var81);
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = var85;
        SubLObject var88 = (SubLObject)NIL;
        var88 = var87.first();
        while (NIL != var87) {
            final SubLObject var89 = Functions.apply(var84, var88.first(), var88.rest());
            var86 = (SubLObject)ConsesLow.cons(var89, var86);
            var87 = var87.rest();
            var88 = var87.first();
        }
        var86 = Sequences.nreverse(var86);
        final SubLObject var90 = Sort.sort(conses_high.copy_list(var86), Symbols.symbol_function((SubLObject)$ic61$), (SubLObject)UNPROVIDED);
        module0006.f215(var90, var71);
        streams_high.terpri(var71);
        PrintLow.format(var71, (SubLObject)$ic44$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30084(final SubLObject var9, final SubLObject var81) {
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = var81;
        SubLObject var84 = (SubLObject)NIL;
        var84 = var83.first();
        while (NIL != var83) {
            final SubLObject var85 = module0424.f29687(var9, var84, (SubLObject)UNPROVIDED);
            var82 = (SubLObject)ConsesLow.cons(var85, var82);
            var83 = var83.rest();
            var84 = var83.first();
        }
        var82 = Sequences.nreverse(var82);
        final SubLObject var86 = Functions.apply(Symbols.symbol_function((SubLObject)$ic66$), (SubLObject)ConsesLow.listS(Symbols.symbol_function((SubLObject)$ic67$), var82));
        return var86;
    }
    
    public static SubLObject f30085(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = module0424.f29678(var9);
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            final SubLObject var13 = module0424.f29631(var12, (SubLObject)$ic45$, (SubLObject)UNPROVIDED);
            if (NIL != module0360.f23871(var13)) {
                final SubLObject var14 = module0424.f29629(var12);
                final SubLObject var15 = print_high.$print_pretty$.currentBinding(var10);
                try {
                    print_high.$print_pretty$.bind((SubLObject)NIL, var10);
                    PrintLow.format((SubLObject)T, (SubLObject)$ic68$, var14, var13);
                }
                finally {
                    print_high.$print_pretty$.rebind(var15, var10);
                }
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30086(final SubLObject var91, final SubLObject var92, final SubLObject var77, SubLObject var93, SubLObject var94) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)NIL;
        }
        return module0548.f33836(var91, var92, var77, var93, var94);
    }
    
    public static SubLObject f30087(final SubLObject var91, final SubLObject var92, final SubLObject var77, SubLObject var93, SubLObject var95, SubLObject var94) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)$ic73$;
        }
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)NIL;
        }
        return module0548.f33841(var91, var92, var77, var93, var95, var94);
    }
    
    public static SubLObject f30088(final SubLObject var9, final SubLObject var81, SubLObject var93, SubLObject var95, SubLObject var94) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)$ic76$;
        }
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)NIL;
        }
        return module0548.f33845(var9, var81, var93, var95, var94);
    }
    
    public static SubLObject f30089(final SubLObject var9, final SubLObject var77, SubLObject var96, SubLObject var93, SubLObject var94) {
        if (var96 == UNPROVIDED) {
            var96 = (SubLObject)NIL;
        }
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)NIL;
        }
        return module0548.f33847(var9, var77, var96, var93, var94);
    }
    
    public static SubLObject f30090() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), assertion_handles_oc.f11019());
        final SubLObject var3 = assertion_handles_oc.f11010();
        final SubLObject var4 = (SubLObject)$ic79$;
        final SubLObject var5 = module0065.f4733(var3);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var4) : var4;
        final SubLObject var7 = module0012.$g75$.currentBinding(var1);
        final SubLObject var8 = module0012.$g76$.currentBinding(var1);
        final SubLObject var9 = module0012.$g77$.currentBinding(var1);
        final SubLObject var10 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(var4);
            final SubLObject var105_106 = var3;
            if (NIL == module0065.f4772(var105_106, (SubLObject)$ic24$)) {
                final SubLObject var107_108 = var105_106;
                if (NIL == module0065.f4775(var107_108, (SubLObject)$ic24$)) {
                    final SubLObject var11 = module0065.f4740(var107_108);
                    final SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic24$)) {
                            if (NIL != module0065.f4749(var16)) {
                                var16 = (SubLObject)$ic24$;
                            }
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            for (var17 = (SubLObject)NIL, var17 = assertions_low_oc.f11163(var16); !var17.isAtom(); var17 = var17.rest()) {
                                module0084.f5775(var2, var17, (SubLObject)UNPROVIDED);
                            }
                        }
                    }
                }
                final SubLObject var116_117 = var105_106;
                if (NIL == module0065.f4777(var116_117) || NIL == module0065.f4773((SubLObject)$ic24$)) {
                    final SubLObject var18 = module0065.f4738(var116_117);
                    SubLObject var19 = module0065.f4739(var116_117);
                    final SubLObject var20 = module0065.f4734(var116_117);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic24$)) ? NIL : $ic24$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic24$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            SubLObject var23;
                            for (var23 = (SubLObject)NIL, var23 = assertions_low_oc.f11163(var22); !var23.isAtom(); var23 = var23.rest()) {
                                module0084.f5775(var2, var23, (SubLObject)UNPROVIDED);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var1);
            module0012.$g77$.rebind(var9, var1);
            module0012.$g76$.rebind(var8, var1);
            module0012.$g75$.rebind(var7, var1);
        }
        return var2;
    }
    
    public static SubLObject f30091(final SubLObject var97) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        SubLObject var99 = (SubLObject)ZERO_INTEGER;
        SubLObject var100 = (SubLObject)ZERO_INTEGER;
        SubLObject var101;
        for (var101 = module0066.f4838(module0067.f4891(var97)); NIL == module0066.f4841(var101); var101 = module0066.f4840(var101)) {
            var98.resetMultipleValues();
            final SubLObject var102 = module0066.f4839(var101);
            final SubLObject var103 = var98.secondMultipleValue();
            var98.resetMultipleValues();
            var100 = Numbers.add(var100, var103);
            if (var103.numG((SubLObject)ONE_INTEGER)) {
                var99 = Numbers.add(var99, Numbers.subtract(var103, (SubLObject)ONE_INTEGER));
            }
        }
        module0066.f4842(var101);
        return Values.values(var99, var100, Numbers.divide(var99, var100));
    }
    
    public static SubLObject f30092(final SubLObject var97) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        SubLObject var99 = (SubLObject)ZERO_INTEGER;
        SubLObject var100 = (SubLObject)ZERO_INTEGER;
        SubLObject var101 = (SubLObject)ZERO_INTEGER;
        SubLObject var102 = (SubLObject)ZERO_INTEGER;
        final SubLObject var103 = module0067.f4861(var97);
        final SubLObject var104 = module0012.$g75$.currentBinding(var98);
        final SubLObject var105 = module0012.$g76$.currentBinding(var98);
        final SubLObject var106 = module0012.$g77$.currentBinding(var98);
        final SubLObject var107 = module0012.$g78$.currentBinding(var98);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var98);
            module0012.$g76$.bind((SubLObject)NIL, var98);
            module0012.$g77$.bind((SubLObject)T, var98);
            module0012.$g78$.bind(Time.get_universal_time(), var98);
            module0012.f478((SubLObject)$ic81$);
            SubLObject var108;
            for (var108 = module0066.f4838(module0067.f4891(var97)); NIL == module0066.f4841(var108); var108 = module0066.f4840(var108)) {
                var98.resetMultipleValues();
                final SubLObject var109 = module0066.f4839(var108);
                final SubLObject var110 = var98.secondMultipleValue();
                var98.resetMultipleValues();
                final SubLObject var111 = module0205.f13136(var109);
                if (NIL != module0173.f10955(var111) && NIL != module0269.f17726(var111)) {
                    var99 = Numbers.add(var99, (SubLObject)ONE_INTEGER);
                    if (var110.numG((SubLObject)ONE_INTEGER)) {
                        var100 = Numbers.add(var100, (SubLObject)ONE_INTEGER);
                    }
                    var101 = Numbers.add(var101, Numbers.subtract(var110, (SubLObject)ONE_INTEGER));
                }
                var102 = Numbers.add(var102, (SubLObject)ONE_INTEGER);
                module0012.note_percent_progress(var102, var103);
            }
            module0066.f4842(var108);
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var107, var98);
            module0012.$g77$.rebind(var106, var98);
            module0012.$g76$.rebind(var105, var98);
            module0012.$g75$.rebind(var104, var98);
        }
        return Values.values(var99, var100, var101);
    }
    
    public static SubLObject f30093(final SubLObject var132, SubLObject var133, SubLObject var134, SubLObject var32, SubLObject var135) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)$ic47$;
        }
        if (var134 == UNPROVIDED) {
            var134 = (SubLObject)$ic82$;
        }
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        if (var135 == UNPROVIDED) {
            var135 = (SubLObject)$ic83$;
        }
        SubLObject var136;
        SubLObject var137;
        for (var136 = f30094(var132, var135), var137 = var136.first(); NIL != var136; var136 = var136.rest(), var137 = f30095(var137, var136.first(), var133, var134, var32)) {}
        return var137;
    }
    
    public static SubLObject f30094(final SubLObject var132, final SubLObject var135) {
        SubLObject var136 = (SubLObject)NIL;
        SubLObject var137 = (SubLObject)NIL;
        SubLObject var138 = (SubLObject)NIL;
        SubLObject var139 = (SubLObject)NIL;
        var137 = var132;
        var138 = var137.first();
        for (var139 = (SubLObject)ZERO_INTEGER; NIL != var137; var137 = var137.rest(), var138 = var137.first(), var139 = Numbers.add((SubLObject)ONE_INTEGER, var139)) {
            var136 = (SubLObject)ConsesLow.cons(module0424.f29684(var138, var135, var139), var136);
        }
        var136 = Sequences.nreverse(var136);
        return var136;
    }
    
    public static SubLObject f30095(final SubLObject var49, final SubLObject var50, SubLObject var133, SubLObject var134, SubLObject var32) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)$ic47$;
        }
        if (var134 == UNPROVIDED) {
            var134 = (SubLObject)$ic82$;
        }
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        SubLObject var135 = conses_high.copy_list(var49);
        final SubLObject var136 = module0424.f29678(var49);
        final SubLObject var137 = module0424.f29678(var50);
        SubLObject var138 = (SubLObject)NIL;
        SubLObject var139 = (SubLObject)NIL;
        SubLObject var144_145 = (SubLObject)NIL;
        SubLObject var140 = (SubLObject)NIL;
        SubLObject var147_148 = (SubLObject)NIL;
        var139 = var136;
        var144_145 = var139.first();
        var140 = var137;
        var147_148 = var140.first();
        while (NIL != var140 || NIL != var139) {
            final SubLObject var141 = f30096(var144_145, var147_148, var133, var134);
            var138 = (SubLObject)ConsesLow.cons(var141, var138);
            var139 = var139.rest();
            var144_145 = var139.first();
            var140 = var140.rest();
            var147_148 = var140.first();
        }
        var138 = Sequences.nreverse(var138);
        var135 = conses_high.putf(var135, (SubLObject)$ic84$, var138);
        if (NIL == var32) {
            var32 = Sequences.cconcatenate(conses_high.getf(var49, (SubLObject)$ic16$, (SubLObject)$ic85$), new SubLObject[] { PrintLow.format((SubLObject)NIL, (SubLObject)$ic86$), conses_high.getf(var50, (SubLObject)$ic16$, (SubLObject)$ic85$) });
        }
        var135 = conses_high.putf(var135, (SubLObject)$ic16$, var32);
        return var135;
    }
    
    public static SubLObject f30096(final SubLObject var144, final SubLObject var147, SubLObject var133, SubLObject var134) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)$ic47$;
        }
        if (var134 == UNPROVIDED) {
            var134 = (SubLObject)$ic82$;
        }
        if (NIL != Functions.funcall(var134, var147, var144, var133)) {
            return var147;
        }
        return var144;
    }
    
    public static SubLObject f30097(final SubLObject var144, final SubLObject var147, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)$ic47$;
        }
        final SubLObject var148 = module0424.f29631(var144, (SubLObject)$ic46$, (SubLObject)ZERO_INTEGER);
        final SubLObject var149 = module0424.f29631(var147, (SubLObject)$ic46$, (SubLObject)ZERO_INTEGER);
        if (var148.numG(var149)) {
            return (SubLObject)T;
        }
        if (var148.numL(var149)) {
            return (SubLObject)NIL;
        }
        final SubLObject var150 = module0424.f29631(var144, var133, (SubLObject)UNPROVIDED);
        final SubLObject var151 = module0424.f29631(var147, var133, (SubLObject)UNPROVIDED);
        return module0035.f2405(var150, var151);
    }
    
    public static SubLObject f30098(final SubLObject var144, final SubLObject var147, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)$ic47$;
        }
        final SubLObject var148 = module0424.f29631(var144, (SubLObject)$ic46$, (SubLObject)ZERO_INTEGER);
        final SubLObject var149 = module0424.f29631(var147, (SubLObject)$ic46$, (SubLObject)ZERO_INTEGER);
        if (var148.isZero() && var149.isZero()) {
            final SubLObject var150 = module0424.f29631(var144, var133, (SubLObject)UNPROVIDED);
            final SubLObject var151 = module0424.f29631(var147, var133, (SubLObject)UNPROVIDED);
            return module0035.f2405(var150, var151);
        }
        if (var148.isZero()) {
            return (SubLObject)NIL;
        }
        if (var149.isZero()) {
            return (SubLObject)T;
        }
        final SubLObject var150 = module0424.f29631(var144, var133, (SubLObject)UNPROVIDED);
        final SubLObject var152 = Numbers.divide(var150, var148);
        final SubLObject var153 = module0424.f29631(var147, var133, (SubLObject)UNPROVIDED);
        final SubLObject var154 = Numbers.divide(var153, var149);
        return module0035.f2405(var152, var154);
    }
    
    public static SubLObject f30099(final SubLObject var144, final SubLObject var147, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)$ic47$;
        }
        final SubLObject var148 = module0424.f29631(var144, (SubLObject)$ic46$, (SubLObject)ZERO_INTEGER);
        final SubLObject var149 = module0424.f29631(var147, (SubLObject)$ic46$, (SubLObject)ZERO_INTEGER);
        if (var148.isZero() && var149.isZero()) {
            final SubLObject var150 = module0424.f29631(var144, var133, (SubLObject)UNPROVIDED);
            final SubLObject var151 = module0424.f29631(var147, var133, (SubLObject)UNPROVIDED);
            return module0035.f2405(var150, var151);
        }
        if (var148.isZero()) {
            return (SubLObject)NIL;
        }
        if (var149.isZero()) {
            return (SubLObject)T;
        }
        final SubLObject var150 = module0424.f29631(var144, var133, (SubLObject)UNPROVIDED);
        final SubLObject var151 = module0424.f29631(var147, var133, (SubLObject)UNPROVIDED);
        return module0035.f2405(var150, var151);
    }
    
    public static SubLObject f30100(final SubLObject var156) {
        return f30101(module0423.f29563(var156), module0423.f29569(var156), module0423.f29573(var156));
    }
    
    public static SubLObject f30101(final SubLObject var157, SubLObject var158, SubLObject var159) {
        if (var158 == UNPROVIDED) {
            var158 = (SubLObject)NIL;
        }
        if (var159 == UNPROVIDED) {
            var159 = (SubLObject)NIL;
        }
        if (NIL != f30102(var157)) {
            return (SubLObject)T;
        }
        if (NIL != f30103(var157, var159)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30102(final SubLObject var157) {
        return module0205.f13145((SubLObject)$ic87$, var157, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30104(final SubLObject var5) {
        return (SubLObject)makeBoolean(var5.eql($ic88$) || var5.eql($ic89$));
    }
    
    public static SubLObject f30103(final SubLObject var157, final SubLObject var159) {
        final SubLObject var160 = conses_high.getf(var159, (SubLObject)$ic90$, (SubLObject)UNPROVIDED);
        if (NIL != var160 && NIL != module0202.f12597(var157)) {
            SubLObject var161 = module0205.f13379(var157, (SubLObject)UNPROVIDED);
            if (NIL == module0202.f12595(var161)) {
                var161 = (SubLObject)ConsesLow.list($ic91$, var161);
            }
            SubLObject var163;
            final SubLObject var162 = var163 = module0205.f13207(var161, (SubLObject)$ic92$);
            SubLObject var164 = (SubLObject)NIL;
            var164 = var163.first();
            while (NIL != var163) {
                if (NIL != module0202.f12691(var164, (SubLObject)UNPROVIDED) && NIL != module0226.f14824(var164)) {
                    return (SubLObject)T;
                }
                var163 = var163.rest();
                var164 = var163.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30105(final SubLObject var90) {
        final SubLObject var91 = module0423.f29563(var90);
        final SubLObject var92 = module0205.f13183(var91, Symbols.symbol_function((SubLObject)$ic93$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var93 = (SubLObject)NIL;
        if (NIL == var93) {
            SubLObject var94 = var92;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL == var93 && NIL != var94) {
                if (NIL != module0004.f104(var95, (SubLObject)$ic94$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                    var93 = var95;
                }
                var94 = var94.rest();
                var95 = var94.first();
            }
        }
        return var93;
    }
    
    public static SubLObject f30106(final SubLObject var90) {
        return (SubLObject)makeBoolean(NIL == f30105(var90));
    }
    
    public static SubLObject f30107() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30051", "S#33277", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30052", "S#33278", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30053", "S#33279", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30054", "S#13927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30055", "S#10521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30056", "S#13604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30057", "S#33280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30058", "S#31871", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30059", "S#33281", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30060", "S#33282", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30061", "S#31872", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30062", "S#31869", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30063", "S#33283", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30064", "S#33284", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30065", "S#31870", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30066", "S#33285", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30067", "S#33286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30068", "S#33287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30069", "S#33288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30070", "S#33289", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30071", "S#33290", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0425", "f30072", "S#33291");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30073", "S#33292", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30074", "S#33293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30075", "S#33294", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30076", "S#33295", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30077", "S#33296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30078", "S#33297", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30079", "S#33298", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30080", "S#33299", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30081", "S#33300", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30082", "S#33301", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30083", "S#33302", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30084", "S#33303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30085", "S#33304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30086", "S#33305", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30087", "S#33306", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30088", "S#33307", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30089", "S#33308", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30090", "S#33309", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30091", "S#33310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30092", "S#33311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30093", "S#33312", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30094", "S#33313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30095", "S#33314", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30096", "S#33315", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30097", "S#33316", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30098", "S#33317", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30099", "S#33318", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30100", "S#33319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30101", "S#33320", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30102", "S#33321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30104", "S#33322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30103", "S#33323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30105", "S#33324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0425", "f30106", "S#33325", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30108() {
        $g3469$ = SubLFiles.deflexical("S#33326", (SubLObject)$ic0$);
        $g3470$ = SubLFiles.deflexical("S#33327", (SubLObject)$ic3$);
        $g3471$ = SubLFiles.deflexical("S#33328", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g3471$.getGlobalValue() : $ic9$));
        $g3472$ = SubLFiles.deflexical("S#33329", module0424.$g3162$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30109() {
        module0003.f57((SubLObject)$ic8$);
        module0002.f35((SubLObject)$ic69$, (SubLObject)$ic70$);
        module0002.f35((SubLObject)$ic71$, (SubLObject)$ic72$);
        module0002.f35((SubLObject)$ic74$, (SubLObject)$ic75$);
        module0002.f35((SubLObject)$ic77$, (SubLObject)$ic78$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30107();
    }
    
    public void initializeVariables() {
        f30108();
    }
    
    public void runTopLevelForms() {
        f30109();
    }
    
    static {
        me = (SubLFile)new module0425();
        $g3469$ = null;
        $g3470$ = null;
        $g3471$ = null;
        $g3472$ = null;
        $ic0$ = makeString("/cyc/projects/inference/arete/experiments/");
        $ic1$ = makeString(".");
        $ic2$ = makeString("cfasl");
        $ic3$ = makeString("/cyc/projects/inference/arete/analysis/");
        $ic4$ = makeString("txt");
        $ic5$ = makeKeyword("MACHINE");
        $ic6$ = makeKeyword("DATE");
        $ic7$ = makeString("kbq-~8D-~6D-~A");
        $ic8$ = makeSymbol("S#33328", "CYC");
        $ic9$ = makeKeyword("UNINITIALIZED");
        $ic10$ = makeString("tkb-training-with-auto-destroy-real-time");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#33243", "CYC"), makeSymbol("S#885", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#33246", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#7998", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#26501", "CYC")))), ConsesLow.list((SubLObject)makeSymbol("S#33247", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#33329", "CYC"))), makeSymbol("S#33248", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#33249", "CYC"), (SubLObject)T), ConsesLow.list((SubLObject)makeSymbol("S#1545", "CYC"), (SubLObject)ZERO_INTEGER), makeSymbol("COUNT"), ConsesLow.list((SubLObject)makeSymbol("DIRECTORY"), (SubLObject)makeSymbol("S#33326", "CYC")) });
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("SKIP"), makeKeyword("COUNT"), makeKeyword("DIRECTORY") });
        $ic13$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic14$ = makeKeyword("QUERY-SPEC-SET");
        $ic15$ = makeKeyword("FILENAME");
        $ic16$ = makeKeyword("COMMENT");
        $ic17$ = makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $ic18$ = makeKeyword("METRICS");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#26501", "CYC"));
        $ic20$ = makeKeyword("OUTLIER-TIMEOUT");
        $ic21$ = makeSymbol("S#33329", "CYC");
        $ic22$ = makeKeyword("INCREMENTAL");
        $ic23$ = makeKeyword("INCLUDE-RESULTS");
        $ic24$ = makeKeyword("SKIP");
        $ic25$ = makeKeyword("COUNT");
        $ic26$ = makeKeyword("DIRECTORY");
        $ic27$ = makeUninternedSymbol("US#2150FF3");
        $ic28$ = makeUninternedSymbol("US#5E48C75");
        $ic29$ = makeSymbol("CLET");
        $ic30$ = makeSymbol("FWHEN");
        $ic31$ = makeSymbol("S#33285", "CYC");
        $ic32$ = makeSymbol("S#32922", "CYC");
        $ic33$ = makeKeyword("UNDEFINED");
        $ic34$ = makeKeyword("BASELINE");
        $ic35$ = makeKeyword("EXPERIMENT");
        $ic36$ = makeString("~s already exists, specify OVERWRITE? T if you want to overwrite it");
        $ic37$ = makeKeyword("OUTPUT");
        $ic38$ = makeString("Unable to open ~S");
        $ic39$ = makeString("=========================================~%");
        $ic40$ = makeString("~a~%");
        $ic41$ = ConsesLow.list((SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("DATE"), (SubLObject)makeKeyword("QUERY-RUNS"));
        $ic42$ = makeString("Summary Statistics:~%");
        $ic43$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-COUNT"), (SubLObject)makeKeyword("TOTAL-TIME"), (SubLObject)makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)makeKeyword("TIME-TO-LAST-ANSWER"));
        $ic44$ = makeString("-----------------------------------------~%");
        $ic45$ = makeKeyword("HALT-REASON");
        $ic46$ = makeKeyword("ANSWER-COUNT");
        $ic47$ = makeKeyword("TOTAL-TIME");
        $ic48$ = makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic49$ = makeKeyword("TIME-TO-LAST-ANSWER");
        $ic50$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic51$ = makeKeyword("BROWSABLE?");
        $ic52$ = makeKeyword("CONTINUABLE?");
        $ic53$ = ConsesLow.list((SubLObject)makeKeyword("TOTAL-TIME"), (SubLObject)makeKeyword("MAX-TRANSFORMATION-DEPTH"));
        $ic54$ = ConsesLow.list((SubLObject)makeKeyword("TOTAL-TIME"), (SubLObject)makeKeyword("MAX-TIME"));
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TIME"), (SubLObject)makeKeyword("TOTAL-TIME"));
        $ic56$ = makeSymbol("S#3705", "CYC");
        $ic57$ = ConsesLow.list((SubLObject)makeKeyword("QUERY-FUNCALL"), (SubLObject)makeSymbol("S#32689", "CYC"));
        $ic58$ = ConsesLow.list((SubLObject)makeKeyword("QUERY-FUNCALL"), (SubLObject)makeSymbol("S#32693", "CYC"));
        $ic59$ = ConsesLow.list((SubLObject)makeKeyword("TOTAL-TIME"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("QUERY-FUNCALL"), (SubLObject)makeSymbol("S#32693", "CYC")));
        $ic60$ = makeString("~s Histogram:~%");
        $ic61$ = makeSymbol("S#3700", "CYC");
        $ic62$ = makeString("~s Data:~%");
        $ic63$ = makeString("~s Tuples:~%");
        $ic64$ = makeSymbol("FIRST");
        $ic65$ = makeString("~s applied to ~s:~%");
        $ic66$ = makeSymbol("MAPCAR");
        $ic67$ = makeSymbol("LIST");
        $ic68$ = makeString("~s -> ~s~%");
        $ic69$ = makeSymbol("S#33305", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)makeSymbol("S#33273", "CYC"));
        $ic71$ = makeSymbol("S#33306", "CYC");
        $ic72$ = ConsesLow.list((SubLObject)makeSymbol("S#33274", "CYC"));
        $ic73$ = makeKeyword("BOTH");
        $ic74$ = makeSymbol("S#33307", "CYC");
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("S#33275", "CYC"));
        $ic76$ = makeKeyword("ALL");
        $ic77$ = makeSymbol("S#33308", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#33276", "CYC"));
        $ic79$ = makeString("Interning all assertion conses");
        $ic80$ = makeSymbol("STRINGP");
        $ic81$ = makeString("Looking for shared nauts");
        $ic82$ = makeSymbol("S#33316", "CYC");
        $ic83$ = makeKeyword("ORIGIN");
        $ic84$ = makeKeyword("QUERY-RUNS");
        $ic85$ = makeString("");
        $ic86$ = makeString("~%Hybridized with:~%");
        $ic87$ = makeSymbol("S#33322", "CYC");
        $ic88$ = constant_handles_oc.f8479((SubLObject)makeString("performSubL"));
        $ic89$ = constant_handles_oc.f8479((SubLObject)makeString("trueSubL"));
        $ic90$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic91$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic92$ = makeKeyword("IGNORE");
        $ic93$ = makeSymbol("CONSTANT-P");
        $ic94$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nthLargestElement")), constant_handles_oc.f8479((SubLObject)makeString("extentCardinality")), constant_handles_oc.f8479((SubLObject)makeString("PlusAll")), constant_handles_oc.f8479((SubLObject)makeString("Average")), constant_handles_oc.f8479((SubLObject)makeString("ratioOfCollectionToDifferentiatedCollection")), constant_handles_oc.f8479((SubLObject)makeString("performsActsOfType-Percentage")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 360 ms
	
	Decompiled with Procyon 0.5.32.
*/