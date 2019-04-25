package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0378 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0378";
    public static final String myFingerPrint = "a553b70e161f811192e8798f2b0e4cc684a909e3a6f9aa86e2a14ba81471ad18";
    private static SubLSymbol $g3204$;
    private static SubLSymbol $g3205$;
    private static SubLSymbol $g3206$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    
    public static SubLObject f26860(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0364.f24699(var1) && $ic0$ == module0364.f24721(var1));
    }
    
    public static SubLObject f26861(final SubLObject var2, final SubLObject var3) {
        return module0364.f24785((SubLObject)$ic0$, var2, var3);
    }
    
    public static SubLObject f26862(final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7) {
        assert NIL != module0364.f24774(var3) : var3;
        assert NIL != module0381.f27029(var4) : var4;
        assert NIL != module0377.f26746(var5) : var5;
        final SubLObject var8 = module0364.f24725(var4);
        final SubLObject var9 = module0364.f24736(var3);
        final SubLObject var10 = module0364.f24729((SubLObject)$ic0$, var8);
        module0364.f24783(var3, var10);
        f26863(var10, var4, var5, var6, var7);
        module0361.f24388(module0364.f24722(var10), var9);
        module0364.f24775(var10);
        module0373.f26334(var10);
        return var10;
    }
    
    public static SubLObject f26864(final SubLObject var10) {
        return var10;
    }
    
    public static SubLObject f26865(final SubLObject var11) {
        final SubLObject var12 = module0364.f24725(var11);
        final SubLObject var13 = module0363.f24527(var12);
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        for (var14 = module0032.f1741(var13), var15 = (SubLObject)NIL, var15 = module0032.f1742(var14, var13); NIL == module0032.f1744(var14, var15); var15 = module0032.f1743(var15)) {
            var16 = module0032.f1745(var14, var15);
            if (NIL != module0032.f1746(var15, var16) && NIL != module0364.f24748(var16, (SubLObject)$ic0$) && NIL != f26866(var16, var11)) {
                module0364.f24731(var16);
            }
        }
        return var11;
    }
    
    public static SubLObject f26867(final SubLObject var17) {
        final SubLObject var18 = module0364.f24725(var17);
        final SubLObject var19 = module0363.f24530(var18);
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        SubLObject var12_21;
        SubLObject var23;
        SubLObject var14_22;
        SubLObject var15_23;
        SubLObject var16_24;
        SubLObject var24;
        for (var20 = module0032.f1741(var19), var21 = (SubLObject)NIL, var21 = module0032.f1742(var20, var19); NIL == module0032.f1744(var20, var21); var21 = module0032.f1743(var21)) {
            var22 = module0032.f1745(var20, var21);
            if (NIL != module0032.f1746(var21, var22) && NIL != module0364.f24748(var22, (SubLObject)$ic4$)) {
                var12_21 = var22;
                var23 = module0364.f24725(var12_21);
                var14_22 = module0363.f24527(var23);
                for (var15_23 = module0032.f1741(var14_22), var16_24 = (SubLObject)NIL, var16_24 = module0032.f1742(var15_23, var14_22); NIL == module0032.f1744(var15_23, var16_24); var16_24 = module0032.f1743(var16_24)) {
                    var24 = module0032.f1745(var15_23, var16_24);
                    if (NIL != module0032.f1746(var16_24, var24) && NIL != module0364.f24748(var24, (SubLObject)$ic0$) && NIL != f26866(var24, var12_21) && NIL != f26868(var24, var17)) {
                        module0364.f24731(var24);
                    }
                }
            }
        }
        return var17;
    }
    
    public static SubLObject f26869(final SubLObject var10) {
        return module0364.f24753(var10);
    }
    
    public static SubLObject f26870(final SubLObject var10) {
        return module0364.f24736(f26869(var10));
    }
    
    public static SubLObject f26871(final SubLObject var10) {
        final SubLObject var11 = f26869(var10);
        if (NIL != var11) {
            return module0364.f24737(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26872(final SubLObject var10) {
        return module0364.f24742(var10).first();
    }
    
    public static SubLObject f26873(final SubLObject var10) {
        return conses_high.second(module0364.f24742(var10));
    }
    
    public static SubLObject f26874(final SubLObject var10) {
        return conses_high.third(module0364.f24742(var10));
    }
    
    public static SubLObject f26875(final SubLObject var10) {
        return conses_high.fourth(module0364.f24742(var10));
    }
    
    public static SubLObject f26876(final SubLObject var10, final SubLObject var11, final SubLObject var17) {
        return (SubLObject)makeBoolean(NIL != f26866(var10, var11) && NIL != f26868(var10, var17));
    }
    
    public static SubLObject f26866(final SubLObject var10, final SubLObject var11) {
        return Equality.eq(var11, f26872(var10));
    }
    
    public static SubLObject f26868(final SubLObject var10, final SubLObject var17) {
        return Equality.eq(var17, f26873(var10));
    }
    
    public static SubLObject f26877(final SubLObject var10) {
        final SubLObject var11 = f26873(var10);
        return module0377.f26758(var11);
    }
    
    public static SubLObject f26878(final SubLObject var10) {
        final SubLObject var11 = f26873(var10);
        return module0377.f26749(var11);
    }
    
    public static SubLObject f26863(final SubLObject var10, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7) {
        module0364.f24744(var10, (SubLObject)ConsesLow.list(var4, var5, var6, var7));
        return var10;
    }
    
    public static SubLObject f26879(final SubLObject var4) {
        if (NIL == module0361.f24164(module0364.f24722(var4))) {
            return (SubLObject)NIL;
        }
        return f26880(var4);
    }
    
    public static SubLObject f26881(final SubLObject var5) {
        if (NIL == module0361.f24164(module0364.f24722(var5))) {
            return (SubLObject)NIL;
        }
        if (NIL != module0364.f24749(var5)) {
            return f26882(var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26880(final SubLObject var4) {
        final SubLObject var5 = module0381.f27050(var4);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = module0363.f24527(var5);
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10) && NIL != module0364.f24748(var10, (SubLObject)$ic5$) && NIL != module0364.f24749(var10) && NIL != f26883(var4, var10)) {
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
            }
        }
        return var6;
    }
    
    public static SubLObject f26882(final SubLObject var5) {
        final SubLObject var6 = module0364.f24725(var5);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        final SubLObject var8 = var6;
        final SubLObject var9 = module0363.f24530(var6);
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        for (var10 = module0032.f1741(var9), var11 = (SubLObject)NIL, var11 = module0032.f1742(var10, var9); NIL == module0032.f1744(var10, var11); var11 = module0032.f1743(var11)) {
            var12 = module0032.f1745(var10, var11);
            if (NIL != module0032.f1746(var11, var12) && NIL != module0364.f24748(var12, (SubLObject)$ic4$)) {
                var13 = var12;
                var14 = module0364.f24735(var13);
                var15 = (SubLObject)NIL;
                var15 = var14.first();
                while (NIL != var14) {
                    if (NIL != module0339.f22743((SubLObject)T, var13, var15) && var8.eql(module0364.f24736(var15)) && NIL != f26883(var12, var5)) {
                        var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                    }
                    var14 = var14.rest();
                    var15 = var14.first();
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f26883(final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0364.f24722(var4);
        var6.resetMultipleValues();
        final SubLObject var8 = f26884(var4, var5);
        final SubLObject var9 = var6.secondMultipleValue();
        var6.resetMultipleValues();
        final SubLObject var10 = module0373.f26435(var7, var8, (SubLObject)T);
        final SubLObject var11 = f26885(var4, var5, var9, var10);
        return f26862(var10, var4, var5, var9, var11);
    }
    
    public static SubLObject f26884(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = module0381.f27031(var4);
        final SubLObject var7 = module0377.f26757(var5);
        final SubLObject var8 = module0364.f24736(var7);
        final SubLObject var9 = module0364.f24737(var6);
        final SubLObject var10 = module0364.f24737(var7);
        final SubLObject var11 = module0377.f26747(var5);
        final SubLObject var12 = module0233.f15377(var11, var10);
        final SubLObject var13 = f26886(var11);
        final SubLObject var14 = module0363.f24509(var8);
        final SubLObject var15 = f26887(var12, var14);
        final SubLObject var16 = f26887(var9, var15);
        final SubLObject var17 = module0381.f27052(var4, var6);
        final SubLObject var18 = module0364.f24736(var17);
        final SubLObject var19 = module0364.f24737(var17);
        final SubLObject var20 = module0363.f24509(var18);
        final SubLObject var21 = f26887(var19, var20);
        final SubLObject var22 = f26888(var21, var16);
        final SubLObject var23 = f26889(var19, var9, var5);
        final SubLObject var24 = f26887(var23, var22);
        final SubLObject var25 = module0233.f15376(var9, var24);
        final SubLObject var26 = f26887(var13, var25);
        final SubLObject var27 = module0233.f15376(var12, var26);
        return Values.values(var27, var23);
    }
    
    public static SubLObject f26885(final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var34) {
        final SubLObject var35 = module0381.f27031(var4);
        final SubLObject var36 = module0377.f26757(var5);
        final SubLObject var37 = module0364.f24737(var35);
        final SubLObject var38 = module0364.f24737(var36);
        final SubLObject var39 = module0377.f26747(var5);
        final SubLObject var40 = module0233.f15377(var39, var38);
        final SubLObject var41 = f26886(var39);
        final SubLObject var42 = module0381.f27052(var4, var35);
        final SubLObject var43 = module0364.f24736(var42);
        final SubLObject var44 = module0364.f24737(var42);
        final SubLObject var45 = module0363.f24509(var43);
        final SubLObject var46 = f26887(var44, var45);
        final SubLObject var47 = module0363.f24509(module0364.f24725(var4));
        final SubLObject var48 = f26887(var6, var47);
        final SubLObject var49 = f26887(var6, var46);
        final SubLObject var50 = module0233.f15376(var37, var49);
        final SubLObject var51 = f26887(var41, var50);
        final SubLObject var52 = module0233.f15376(var40, var51);
        final SubLObject var53 = module0364.f24736(var34);
        final SubLObject var54 = module0364.f24737(var34);
        final SubLObject var55 = module0363.f24509(var53);
        final SubLObject var56 = module0233.f15376(var54, var52);
        final SubLObject var57 = f26890(var48, var49, var56, var55);
        return var57;
    }
    
    public static SubLObject f26890(final SubLObject var56, final SubLObject var57, final SubLObject var64, final SubLObject var63) {
        final SubLObject var65 = var56.first();
        final SubLObject var66 = var57.first();
        final SubLObject var67 = var64.first();
        final SubLObject var68 = var63.first();
        final SubLObject var69 = module0232.f15308(var65);
        final SubLObject var70 = module0232.f15308(var66);
        final SubLObject var71 = module0232.f15308(var67);
        final SubLObject var72 = module0232.f15308(var68);
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = var69;
        SubLObject var75 = (SubLObject)NIL;
        var75 = var74.first();
        while (NIL != var74) {
            final SubLObject var76 = Sequences.position(var75, var70, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var77 = (SubLObject)$ic5$;
            if (NIL != var76) {
                final SubLObject var78 = ConsesLow.nth(var76, var71);
                var77 = Sequences.position(var78, var72, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var73 = (SubLObject)ConsesLow.cons(var77, var73);
            var74 = var74.rest();
            var75 = var74.first();
        }
        var73 = Sequences.nreverse(var73);
        final SubLObject var79 = (SubLObject)ConsesLow.list((SubLObject)NIL, var73);
        return var79;
    }
    
    public static SubLObject f26891(final SubLObject var10, final SubLObject var79, final SubLObject var80) {
        assert NIL != f26860(var10) : var10;
        assert NIL != module0366.f24916(var79) : var79;
        final SubLObject var81 = f26872(var10);
        final SubLObject var82 = f26873(var10);
        final SubLObject var83 = module0364.f24737(module0377.f26757(var82));
        final SubLObject var84 = module0377.f26747(var82);
        final SubLObject var85 = module0366.f24934(var79);
        final SubLObject var86 = module0233.f15384(var80, var85);
        final SubLObject var87 = module0377.f26826(var83, var84, var86);
        final SubLObject var88 = module0381.f27142(var81);
        final SubLObject var89 = module0233.f15384(var88, var87);
        final SubLObject var90 = var86;
        final SubLObject var91 = f26874(var10);
        final SubLObject var92 = module0233.f15387(var91, var90);
        final SubLObject var93 = ConsesLow.append(var92, var89);
        final SubLObject var94 = module0373.f26258(var93);
        return module0373.f26221(var10, var94, (SubLObject)ConsesLow.list(var79));
    }
    
    public static SubLObject f26892(final SubLObject var92) {
        final SubLObject var93 = module0366.f24937(var92);
        final SubLObject var94 = f26873(var93);
        final SubLObject var95 = f26893(var92);
        final SubLObject var96 = module0366.f24934(var95);
        final SubLObject var97 = f26871(var93);
        final SubLObject var98 = module0233.f15384(var97, var96);
        final SubLObject var99 = module0377.f26831(var94, var98);
        return var99;
    }
    
    public static SubLObject f26894(final SubLObject var92) {
        return f26873(module0366.f24937(var92));
    }
    
    public static SubLObject f26895(final SubLObject var10) {
        final SubLObject var11 = f26873(var10);
        final SubLObject var12 = f26872(var10);
        final SubLObject var13 = f26871(var10);
        final SubLObject var14 = module0364.f24737(module0377.f26757(var11));
        final SubLObject var15 = module0233.f15386(module0377.f26747(var11));
        final SubLObject var16 = module0364.f24737(module0381.f27031(var12));
        final SubLObject var17 = module0233.f15390(var13, var14);
        final SubLObject var18 = module0233.f15390(var17, var15);
        final SubLObject var19 = module0233.f15390(var18, var16);
        return var19;
    }
    
    public static SubLObject f26888(final SubLObject var101, final SubLObject var102) {
        assert NIL != module0362.f24458(var101) : var101;
        assert NIL != module0362.f24458(var102) : var102;
        final SubLObject var103 = module0362.f24459(var101);
        final SubLObject var104 = module0362.f24459(var102);
        return module0362.f24449(module0377.f26819(var103, var104));
    }
    
    public static SubLObject f26887(final SubLObject var105, final SubLObject var106) {
        return module0233.f15362(var105, var106);
    }
    
    public static SubLObject f26889(final SubLObject var48, final SubLObject var38, final SubLObject var5) {
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = module0035.f2220(module0233.f15373(var48), module0233.f15373(var38), (SubLObject)UNPROVIDED);
        SubLObject var52;
        final SubLObject var51 = var52 = f26896(var5);
        SubLObject var53 = var50;
        SubLObject var54 = (SubLObject)NIL;
        var54 = var53.first();
        while (NIL != var53) {
            final SubLObject var55 = module0193.f12079(var52);
            var49 = module0233.f15345(var54, var55, var49);
            var52 = Numbers.add(var52, (SubLObject)ONE_INTEGER);
            var53 = var53.rest();
            var54 = var53.first();
        }
        return var49;
    }
    
    public static SubLObject f26896(final SubLObject var5) {
        return (SubLObject)$ic9$;
    }
    
    public static SubLObject f26886(final SubLObject var40) {
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = var40;
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            final SubLObject var44 = module0233.f15370(var43);
            if (NIL == module0234.f15464(var44)) {
                var41 = (SubLObject)ConsesLow.cons(var43, var41);
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        return Sequences.nreverse(var41);
    }
    
    public static SubLObject f26897(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0366.f24916(var1) && NIL != f26860(module0366.f24937(var1)));
    }
    
    public static SubLObject f26898(final SubLObject var115) {
        final SubLObject var116 = module0366.f24937(var115);
        return f26878(var116);
    }
    
    public static SubLObject f26893(final SubLObject var115) {
        assert NIL != f26897(var115) : var115;
        return module0366.f24976(var115);
    }
    
    public static SubLObject f26899(final SubLObject var116, final SubLObject var117, final SubLObject var10) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        var118.resetMultipleValues();
        final SubLObject var119 = f26891(var10, var116, var117);
        final SubLObject var120 = var118.secondMultipleValue();
        var118.resetMultipleValues();
        if (NIL != var120) {
            module0373.f26265(var119);
        }
        else {
            module0373.f26245(var116);
        }
        return var119;
    }
    
    public static SubLObject f26900(final SubLObject var92) {
        final SubLObject var93 = module0366.f24937(var92);
        final SubLObject var94 = module0364.f24722(var93);
        final SubLObject var95 = f26878(var93);
        final SubLObject var96 = f26873(var93);
        final SubLObject var97 = module0377.f26755(var96);
        final SubLObject var98 = f26892(var92);
        return module0532.f33188(var94, var95, var98, var97);
    }
    
    public static SubLObject f26901(final SubLObject var122) {
        final SubLObject var123 = module0363.f24530(var122);
        SubLObject var124;
        SubLObject var125;
        SubLObject var126;
        for (var124 = module0032.f1741(var123), var125 = (SubLObject)NIL, var125 = module0032.f1742(var124, var123); NIL == module0032.f1744(var124, var125); var125 = module0032.f1743(var125)) {
            var126 = module0032.f1745(var124, var125);
            if (NIL != module0032.f1746(var125, var126) && NIL != module0364.f24748(var126, (SubLObject)$ic0$)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26902(final SubLObject var32) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26903(final SubLObject var32) {
        return Sequences.length(f26902(var32));
    }
    
    public static SubLObject f26904() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26860", "S#29236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26861", "S#30051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26862", "S#30052", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26864", "S#27590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26865", "S#30053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26867", "S#29933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26869", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26870", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26871", "S#30054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26872", "S#28931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26873", "S#28946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26874", "S#30055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26875", "S#30056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26876", "S#30057", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26866", "S#25421", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26868", "S#25423", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26877", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26878", "S#29318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26863", "S#30058", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26879", "S#30059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26881", "S#29936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26880", "S#30060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26882", "S#30061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26883", "S#30062", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26884", "S#30063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26885", "S#30064", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26890", "S#30065", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26891", "S#30066", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26892", "S#30067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26894", "S#29275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26895", "S#30068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26888", "S#30069", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26887", "S#30070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26889", "S#30071", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26896", "S#30072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26886", "S#30073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26897", "S#28926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26898", "S#28933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26893", "S#28934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26899", "S#29266", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26900", "S#29269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26901", "S#29322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26902", "S#30074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0378", "f26903", "S#30075", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26905() {
        $g3204$ = SubLFiles.deflexical("S#30076", Symbols.symbol_function((SubLObject)EQUAL));
        $g3205$ = SubLFiles.defvar("S#30077", (SubLObject)NIL);
        $g3206$ = SubLFiles.defvar("S#30078", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26906() {
        module0002.f35((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0002.f35((SubLObject)$ic13$, (SubLObject)$ic14$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f26904();
    }
    
    public void initializeVariables() {
        f26905();
    }
    
    public void runTopLevelForms() {
        f26906();
    }
    
    static {
        me = (SubLFile)new module0378();
        $g3204$ = null;
        $g3205$ = null;
        $g3206$ = null;
        $ic0$ = makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic1$ = makeSymbol("S#27608", "CYC");
        $ic2$ = makeSymbol("S#29224", "CYC");
        $ic3$ = makeSymbol("S#27817", "CYC");
        $ic4$ = makeKeyword("JOIN-ORDERED");
        $ic5$ = makeKeyword("TRANSFORMATION");
        $ic6$ = makeSymbol("S#29236", "CYC");
        $ic7$ = makeSymbol("S#26816", "CYC");
        $ic8$ = makeSymbol("S#27317", "CYC");
        $ic9$ = makeInteger(150);
        $ic10$ = makeSymbol("S#28926", "CYC");
        $ic11$ = makeSymbol("S#30074", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("NULL"));
        $ic13$ = makeSymbol("S#30075", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#4848", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 166 ms
	
	Decompiled with Procyon 0.5.32.
*/