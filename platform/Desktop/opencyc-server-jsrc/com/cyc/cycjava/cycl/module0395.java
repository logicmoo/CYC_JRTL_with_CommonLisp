package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0395 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0395";
    public static final String myFingerPrint = "4d199681d3dd75574a3c62a749f56372cdfb921f0ee12e6b7fb9ea151018b0b4";
    private static SubLSymbol $g3284$;
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
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
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
    
    public static SubLObject f28072(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0395.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0395.NIL;
        SubLObject var7 = (SubLObject)module0395.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0395.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0395.$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0395.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)module0395.$ic1$;
            final SubLObject var10 = (SubLObject)module0395.$ic2$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0395.$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7), (SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)module0395.$ic4$, var10))), (SubLObject)ConsesLow.list((SubLObject)module0395.$ic5$, var6, var10), ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0395.$ic6$, var6, var9))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0395.$ic0$);
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28073(final SubLObject var6, final SubLObject var11) {
        assert module0395.NIL != module0387.f27528(var11) : var11;
        final SubLObject var12 = module0393.f27985(var6, var11);
        if (module0395.NIL == var12) {
            f28074(var6, var11);
            return (SubLObject)module0395.T;
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28074(final SubLObject var6, final SubLObject var11) {
        assert module0395.NIL != module0397.f28129(var6) : var6;
        assert module0395.NIL != module0387.f27528(var11) : var11;
        module0393.f27995(var6, var11);
        if (module0395.NIL == module0377.f26746(var11)) {
            if (module0395.NIL != module0387.f27531(var11)) {
                final SubLObject var12 = module0364.f24757(var11);
                f28075(var6, var12);
            }
            else if (module0395.NIL != module0382.f27206(var11)) {
                final SubLObject var13 = module0382.f27195(var11);
                final SubLObject var14 = module0382.f27185(var13);
                final SubLObject var15 = module0382.f27186(var13);
                f28075(var6, var14);
                f28075(var6, var15);
            }
            else {
                final SubLObject var16 = module0373.f26168(var11);
                f28075(var6, var16);
            }
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28076(final SubLObject var6, final SubLObject var13, SubLObject var9) {
        if (var9 == module0395.UNPROVIDED) {
            var9 = (SubLObject)module0395.NIL;
        }
        if (module0395.NIL == module0380.f26955(var13)) {
            return f28077(var6, var13);
        }
        SubLObject var14 = (SubLObject)module0395.NIL;
        final SubLObject var15 = var9;
        final SubLObject var16 = module0363.f24530(var9);
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var27_30;
        SubLObject var24;
        SubLObject var25;
        for (var17 = module0032.f1741(var16), var18 = (SubLObject)module0395.NIL, var18 = module0032.f1742(var17, var16); module0395.NIL == var14 && module0395.NIL == module0032.f1744(var17, var18); var18 = module0032.f1743(var18)) {
            var19 = module0032.f1745(var17, var18);
            if (module0395.NIL != module0032.f1746(var18, var19)) {
                var20 = var19;
                for (var21 = (SubLObject)module0395.NIL, var21 = module0364.f24735(var20); module0395.NIL == var14 && module0395.NIL != var21; var21 = var21.rest()) {
                    var22 = var21.first();
                    if (module0395.NIL != module0339.f22743((SubLObject)module0395.T, var20, var22) && var15.eql(module0364.f24736(var22))) {
                        var23 = module0364.f24725(var19);
                        for (var27_30 = (SubLObject)module0395.NIL, var27_30 = module0363.f24517(var23); module0395.NIL == var14 && module0395.NIL != var27_30; var27_30 = var27_30.rest()) {
                            var24 = var27_30.first();
                            if (module0395.NIL != module0380.f26969(var24)) {
                                var25 = module0380.f26964(var24);
                                if (var22.eql(var25) && module0395.NIL != module0393.f27985(var6, var24)) {
                                    var14 = (SubLObject)module0395.T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return var14;
    }
    
    public static SubLObject f28077(final SubLObject var6, final SubLObject var13) {
        if (module0395.NIL != module0387.f27531(var13)) {
            return module0393.f27985(var6, var13);
        }
        if (module0395.NIL != module0380.f26955(var13)) {
            return (SubLObject)module0395.NIL;
        }
        if (module0395.NIL != module0373.f26162(var13)) {
            final SubLObject var14 = module0373.f26166(var13);
            return module0393.f27985(var6, var14);
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28075(final SubLObject var6, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0367.f25083(var9, var6);
        if (module0395.NIL == var11) {
            module0393.f27994(var6, var9);
            final SubLObject var12 = module0363.f24530(var9);
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            SubLObject var16;
            SubLObject var17;
            SubLObject var18;
            SubLObject var19;
            SubLObject var20;
            SubLObject var21;
            SubLObject var22;
            SubLObject var34_39;
            SubLObject var23;
            SubLObject var24;
            SubLObject var25;
            for (var13 = module0032.f1741(var12), var14 = (SubLObject)module0395.NIL, var14 = module0032.f1742(var13, var12); module0395.NIL == module0032.f1744(var13, var14); var14 = module0032.f1743(var14)) {
                var15 = module0032.f1745(var13, var14);
                if (module0395.NIL != module0032.f1746(var14, var15) && module0395.NIL != module0364.f24748(var15, (SubLObject)module0395.$ic9$)) {
                    var16 = var15;
                    var17 = module0364.f24735(var16);
                    var18 = (SubLObject)module0395.NIL;
                    var18 = var17.first();
                    while (module0395.NIL != var17) {
                        if (module0395.NIL != module0339.f22743((SubLObject)module0395.T, var16, var18) && var9.eql(module0364.f24736(var18)) && module0395.NIL != f28076(var6, var15, var9)) {
                            var19 = (SubLObject)module0395.$ic10$;
                            for (var20 = module0066.f4838(module0363.f24537(var9)); module0395.NIL == module0066.f4841(var20); var20 = module0066.f4840(var20)) {
                                var10.resetMultipleValues();
                                var21 = module0066.f4839(var20);
                                var22 = var10.secondMultipleValue();
                                var10.resetMultipleValues();
                                var34_39 = var22;
                                var23 = (SubLObject)module0395.NIL;
                                var23 = var34_39.first();
                                while (module0395.NIL != var34_39) {
                                    if (module0395.NIL != module0363.f24538(var23, var19)) {
                                        var24 = module0381.f27119(var15, var23);
                                        var25 = module0364.f24736(var24);
                                        f28075(var6, var25);
                                    }
                                    var34_39 = var34_39.rest();
                                    var23 = var34_39.first();
                                }
                            }
                            module0066.f4842(var20);
                        }
                        var17 = var17.rest();
                        var18 = var17.first();
                    }
                }
            }
            if (module0395.NIL != module0363.f24586(var9, var6)) {
                f28078(var6, var9);
            }
            return (SubLObject)module0395.T;
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28078(final SubLObject var6, final SubLObject var9) {
        if (module0395.NIL != f28079(var6, var9)) {
            return (SubLObject)module0395.NIL;
        }
        module0373.f26191(var9, var6);
        if (module0395.NIL != f28080(var6, var9)) {
            return (SubLObject)module0395.NIL;
        }
        if (module0395.NIL != module0375.f26588(var9)) {
            f28075(var6, var9);
        }
        if (module0395.NIL != f28081(var9, var6)) {
            f28075(var6, var9);
        }
        if (module0395.NIL != f28082(var6, var9)) {
            f28075(var6, var9);
        }
        if (module0395.NIL != f28083(var9, var6)) {
            f28084(var6, var9);
        }
        final SubLObject var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0395.NIL != module0367.f25083(var9, var6) && module0395.NIL == f28080(var6, var9));
        if (module0395.NIL == var10) {
            return (SubLObject)module0395.NIL;
        }
        if (module0395.NIL != f28085(var6, var9)) {
            return (SubLObject)module0395.T;
        }
        f28086(var6, var9);
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28081(final SubLObject var9, final SubLObject var6) {
        final SubLObject var10 = module0363.f24530(var9);
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var22_46;
        SubLObject var23_47;
        SubLObject var24_48;
        SubLObject var15;
        for (var11 = module0032.f1741(var10), var12 = (SubLObject)module0395.NIL, var12 = module0032.f1742(var11, var10); module0395.NIL == module0032.f1744(var11, var12); var12 = module0032.f1743(var12)) {
            var13 = module0032.f1745(var11, var12);
            if (module0395.NIL != module0032.f1746(var12, var13) && module0395.NIL != module0364.f24748(var13, (SubLObject)module0395.$ic11$)) {
                var14 = module0364.f24725(var13);
                var22_46 = module0363.f24530(var14);
                for (var23_47 = module0032.f1741(var22_46), var24_48 = (SubLObject)module0395.NIL, var24_48 = module0032.f1742(var23_47, var22_46); module0395.NIL == module0032.f1744(var23_47, var24_48); var24_48 = module0032.f1743(var24_48)) {
                    var15 = module0032.f1745(var23_47, var24_48);
                    if (module0395.NIL != module0032.f1746(var24_48, var15) && module0395.NIL != module0364.f24748(var15, (SubLObject)module0395.$ic9$) && module0395.NIL != module0381.f27056(var15, var13) && var14.eql(module0381.f27051(var15)) && module0395.NIL != module0364.f24759(var15) && module0395.NIL != f28077(var6, var15)) {
                        return (SubLObject)module0395.T;
                    }
                }
            }
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28083(final SubLObject var9, final SubLObject var6) {
        SubLObject var10 = (SubLObject)module0395.NIL;
        final SubLObject var11 = module0363.f24530(var9);
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        SubLObject var22_50;
        SubLObject var23_51;
        SubLObject var24_52;
        SubLObject var16;
        for (var12 = module0032.f1741(var11), var13 = (SubLObject)module0395.NIL, var13 = module0032.f1742(var12, var11); module0395.NIL == var10 && module0395.NIL == module0032.f1744(var12, var13); var13 = module0032.f1743(var13)) {
            var14 = module0032.f1745(var12, var13);
            if (module0395.NIL != module0032.f1746(var13, var14) && module0395.NIL != module0364.f24748(var14, (SubLObject)module0395.$ic11$)) {
                var15 = module0364.f24725(var14);
                var22_50 = module0363.f24530(var15);
                for (var23_51 = module0032.f1741(var22_50), var24_52 = (SubLObject)module0395.NIL, var24_52 = module0032.f1742(var23_51, var22_50); module0395.NIL == var10 && module0395.NIL == module0032.f1744(var23_51, var24_52); var24_52 = module0032.f1743(var24_52)) {
                    var16 = module0032.f1745(var23_51, var24_52);
                    if (module0395.NIL != module0032.f1746(var24_52, var16) && module0395.NIL != module0364.f24748(var16, (SubLObject)module0395.$ic9$) && module0395.NIL != module0381.f27056(var16, var14) && var15.eql(module0381.f27051(var16))) {
                        var10 = (SubLObject)module0395.T;
                    }
                }
            }
        }
        return var10;
    }
    
    public static SubLObject f28084(final SubLObject var6, final SubLObject var9) {
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28082(final SubLObject var6, final SubLObject var9) {
        if (module0395.NIL != module0361.f24170(module0367.f25044(var6))) {
            final SubLObject var10 = module0363.f24530(var9);
            SubLObject var11;
            SubLObject var12;
            SubLObject var13;
            for (var11 = module0032.f1741(var10), var12 = (SubLObject)module0395.NIL, var12 = module0032.f1742(var11, var10); module0395.NIL == module0032.f1744(var11, var12); var12 = module0032.f1743(var12)) {
                var13 = module0032.f1745(var11, var12);
                if (module0395.NIL != module0032.f1746(var12, var13) && module0395.NIL != module0364.f24748(var13, (SubLObject)module0395.$ic12$) && module0395.NIL != module0367.f25083(module0364.f24725(var13), var6)) {
                    return (SubLObject)module0395.T;
                }
            }
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28079(final SubLObject var6, final SubLObject var9) {
        return module0384.f27319(var6, var9);
    }
    
    public static SubLObject f28080(final SubLObject var6, final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0395.NIL != module0393.f27988(var6, var9) || module0395.NIL != module0393.f27987(var6, var9));
    }
    
    public static SubLObject f28085(final SubLObject var6, final SubLObject var9) {
        assert module0395.NIL != module0397.f28129(var6) : var6;
        assert module0395.NIL != module0363.f24478(var9) : var9;
        return Numbers.plusp(f28087(var6, var9));
    }
    
    public static SubLObject f28087(final SubLObject var6, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        var10.resetMultipleValues();
        final SubLObject var11 = f28088(var6, var9);
        final SubLObject var12 = var10.secondMultipleValue();
        final SubLObject var13 = var10.thirdMultipleValue();
        var10.resetMultipleValues();
        SubLObject var14 = var11;
        SubLObject var15 = (SubLObject)module0395.NIL;
        var15 = var14.first();
        while (module0395.NIL != var14) {
            module0393.f27998(var6, var15);
            var14 = var14.rest();
            var15 = var14.first();
        }
        var14 = var12;
        var15 = (SubLObject)module0395.NIL;
        var15 = var14.first();
        while (module0395.NIL != var14) {
            module0393.f28002(var6, var15);
            if (module0395.NIL != module0365.f24819(var15)) {
                module0367.f25231(var15, var6, (SubLObject)module0395.UNPROVIDED);
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        var14 = var13;
        var15 = (SubLObject)module0395.NIL;
        var15 = var14.first();
        while (module0395.NIL != var14) {
            module0393.f28004(var6, var15);
            if (module0395.NIL != module0365.f24819(var15)) {
                module0367.f25228(var15, var6, (SubLObject)module0395.UNPROVIDED);
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return Sequences.length(var11);
    }
    
    public static SubLObject f28089(final SubLObject var56, final SubLObject var57) {
        if (var56.equal(var57)) {
            return var56;
        }
        return f28090(var56, var57);
    }
    
    public static SubLObject f28090(final SubLObject var56, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0395.NIL;
        SubLObject var60 = var56;
        SubLObject var61 = (SubLObject)module0395.NIL;
        var61 = var60.first();
        while (module0395.NIL != var60) {
            if (module0395.NIL == module0363.f24526(var61, module0395.$g3284$.getDynamicValue(var58))) {
                var59 = (SubLObject)ConsesLow.cons(var61, var59);
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        var60 = var57;
        SubLObject var62 = (SubLObject)module0395.NIL;
        var62 = var60.first();
        while (module0395.NIL != var60) {
            if (module0395.NIL != module0363.f24526(var62, module0395.$g3284$.getDynamicValue(var58))) {
                var59 = (SubLObject)ConsesLow.cons(var62, var59);
            }
            var60 = var60.rest();
            var62 = var60.first();
        }
        return Sequences.nreverse(var59);
    }
    
    public static SubLObject f28091(final SubLObject var6, final SubLObject var15) {
        module0373.f26130(var6, var15);
        if ((module0395.NIL == module0380.f26969(var15) || module0395.NIL == module0380.f26994()) && module0395.NIL == module0377.f26771(var15) && module0395.NIL == module0384.f27279(var6, var15)) {
            f28092(var6, var15);
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28093(final SubLObject var6, final SubLObject var61) {
        final SubLObject var62 = module0387.f27475(var6, conses_high.copy_list(var61), (SubLObject)module0395.$ic16$);
        SubLObject var63 = Sequences.reverse(var62);
        SubLObject var64 = (SubLObject)module0395.NIL;
        var64 = var63.first();
        while (module0395.NIL != var63) {
            f28092(var6, var64);
            var63 = var63.rest();
            var64 = var63.first();
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28092(final SubLObject var6, final SubLObject var15) {
        final SubLObject var16 = module0365.f24850(var15);
        module0367.f25208(var16, var15, var6);
        if ((module0395.NIL != module0380.f26994() && module0395.NIL != module0380.f26969(var15)) || (module0395.NIL != module0377.f26771(var15) && module0395.NIL == module0377.f26766(var15))) {
            final SubLObject var17 = (SubLObject)module0395.T;
            module0393.f27997(var6, module0365.f24850(var15));
            if (module0395.NIL != module0394.f28020(var6, var15, var17, (SubLObject)module0395.NIL, (SubLObject)module0395.UNPROVIDED)) {
                module0393.f28004(var6, var15);
            }
            else if (module0395.NIL != module0394.f28031(var6, var15, var17, (SubLObject)module0395.NIL, (SubLObject)module0395.T)) {
                module0393.f28002(var6, var15);
            }
            else {
                module0393.f27998(var6, var15);
            }
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28088(final SubLObject var6, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0395.NIL;
        SubLObject var12 = (SubLObject)module0395.NIL;
        SubLObject var13 = (SubLObject)module0395.NIL;
        final SubLObject var14 = module0394.f28018(var6, var9, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED);
        final SubLObject var15 = module0394.f28012(var6, var9, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED);
        var10.resetMultipleValues();
        final SubLObject var16 = f28094(var6, var9, var14, var15);
        SubLObject var17 = var10.secondMultipleValue();
        final SubLObject var18 = var10.thirdMultipleValue();
        final SubLObject var19 = var10.fourthMultipleValue();
        var10.resetMultipleValues();
        var10.resetMultipleValues();
        SubLObject var20 = f28095(var6, var9, var14, var15);
        final SubLObject var21 = var10.secondMultipleValue();
        final SubLObject var22 = var10.thirdMultipleValue();
        var10.resetMultipleValues();
        var12 = ConsesLow.append(var18, var21);
        var13 = ConsesLow.append(var19, var22);
        var17 = Sequences.nreverse(var17);
        SubLObject var23;
        var20 = (var23 = Sequences.nreverse(var20));
        SubLObject var24 = (SubLObject)module0395.NIL;
        var24 = var23.first();
        while (module0395.NIL != var23) {
            var11 = (SubLObject)ConsesLow.cons(var24, var11);
            var23 = var23.rest();
            var24 = var23.first();
        }
        var23 = var17;
        SubLObject var25 = (SubLObject)module0395.NIL;
        var25 = var23.first();
        while (module0395.NIL != var23) {
            var11 = (SubLObject)ConsesLow.cons(var25, var11);
            var23 = var23.rest();
            var25 = var23.first();
        }
        if (module0395.NIL != var16) {
            var11 = (SubLObject)ConsesLow.cons(var16, var11);
        }
        var23 = module0363.f24517(var9);
        SubLObject var26 = (SubLObject)module0395.NIL;
        var26 = var23.first();
        while (module0395.NIL != var23) {
            if (module0395.NIL != module0363.f24524(var26, (SubLObject)module0395.$ic18$)) {
                var11 = (SubLObject)ConsesLow.cons(var26, var11);
            }
            var23 = var23.rest();
            var26 = var23.first();
        }
        var11 = Sequences.nreverse(var11);
        return Values.values(var11, var12, var13);
    }
    
    public static SubLObject f28095(final SubLObject var6, final SubLObject var9, final SubLObject var65, final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var68 = (SubLObject)module0395.NIL;
        SubLObject var69 = (SubLObject)module0395.NIL;
        SubLObject var70 = (SubLObject)module0395.NIL;
        if (module0395.NIL == module0363.f24562(var9)) {
            if (module0395.NIL != module0363.f24578(var9)) {
                var67.resetMultipleValues();
                final SubLObject var77_78 = f28096(var6, var9, var65, var66);
                final SubLObject var79_80 = var67.secondMultipleValue();
                final SubLObject var81_82 = var67.thirdMultipleValue();
                var67.resetMultipleValues();
                var68 = var77_78;
                var69 = var79_80;
                var70 = var81_82;
            }
            else if (module0395.NIL != module0363.f24632(var9)) {
                var67.resetMultipleValues();
                final SubLObject var83_84 = f28097(var6, var9, var65, var66);
                final SubLObject var85_86 = var67.secondMultipleValue();
                final SubLObject var87_88 = var67.thirdMultipleValue();
                var67.resetMultipleValues();
                var68 = var83_84;
                var69 = var85_86;
                var70 = var87_88;
            }
            else {
                var67.resetMultipleValues();
                final SubLObject var89_90 = f28098(var6, var9, var65, var66);
                final SubLObject var91_92 = var67.secondMultipleValue();
                final SubLObject var93_94 = var67.thirdMultipleValue();
                var67.resetMultipleValues();
                var68 = var89_90;
                var69 = var91_92;
                var70 = var93_94;
            }
        }
        return Values.values(var68, var69, var70);
    }
    
    public static SubLObject f28094(final SubLObject var6, final SubLObject var9, final SubLObject var65, final SubLObject var66) {
        SubLObject var67 = (SubLObject)module0395.NIL;
        SubLObject var68 = (SubLObject)module0395.NIL;
        SubLObject var69 = (SubLObject)module0395.NIL;
        SubLObject var70 = (SubLObject)module0395.NIL;
        if (module0395.NIL == var66) {
            SubLObject var71 = module0363.f24517(var9);
            SubLObject var72 = (SubLObject)module0395.NIL;
            var72 = var71.first();
            while (module0395.NIL != var71) {
                if (module0395.NIL != module0363.f24524(var72, (SubLObject)module0395.$ic19$) && module0395.NIL != module0363.f24518(var72, (SubLObject)module0395.$ic20$) && module0395.NIL == module0394.f28020(var6, var72, (SubLObject)module0395.T, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED)) {
                    if (module0395.NIL != var65 || module0395.NIL != module0394.f28031(var6, var72, (SubLObject)module0395.T, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED)) {
                        if (module0395.NIL == var67) {
                            var69 = (SubLObject)ConsesLow.cons(var72, var69);
                        }
                    }
                    else {
                        final SubLObject var74;
                        final SubLObject var73 = var74 = module0367.f25197(var72, var6);
                        if (var74.eql((SubLObject)module0395.$ic21$)) {
                            final SubLObject var75 = module0367.f25203(var72, var6);
                            if (module0395.NIL == var67 || module0395.NIL != module0360.f23940(var75, var68)) {
                                var67 = var72;
                                var68 = var75;
                                if (module0395.NIL == module0376.f26621(var67)) {
                                    var70 = (SubLObject)module0395.NIL;
                                    var69 = (SubLObject)module0395.NIL;
                                }
                            }
                        }
                        else if ((var74.eql((SubLObject)module0395.$ic22$) || var74.eql((SubLObject)module0395.$ic23$)) && (module0395.NIL == var67 || module0395.NIL != module0376.f26621(var67))) {
                            var70 = (SubLObject)ConsesLow.cons(var72, var70);
                        }
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
            var70 = module0387.f27475(var6, var70, (SubLObject)module0395.$ic24$);
        }
        SubLObject var76 = (SubLObject)module0395.NIL;
        SubLObject var77 = module0363.f24517(var9);
        SubLObject var78 = (SubLObject)module0395.NIL;
        var78 = var77.first();
        while (module0395.NIL != var77) {
            if (module0395.NIL != module0363.f24524(var78, (SubLObject)module0395.$ic19$) && module0395.NIL != module0363.f24518(var78, (SubLObject)module0395.$ic20$) && !var78.eql(var67) && module0395.NIL == module0035.f2169(var78, var70) && module0395.NIL == module0035.f2169(var78, var69)) {
                var76 = (SubLObject)ConsesLow.cons(var78, var76);
            }
            var77 = var77.rest();
            var78 = var77.first();
        }
        return Values.values(var67, var70, var69, var76);
    }
    
    public static SubLObject f28096(final SubLObject var6, final SubLObject var9, final SubLObject var65, final SubLObject var66) {
        SubLObject var67 = (SubLObject)module0395.NIL;
        SubLObject var68 = (SubLObject)module0395.NIL;
        if (module0395.NIL == var66) {
            final SubLObject var69 = module0363.f24527(var9);
            SubLObject var70;
            SubLObject var71;
            SubLObject var72;
            SubLObject var73;
            for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0395.NIL, var71 = module0032.f1742(var70, var69); module0395.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                var72 = module0032.f1745(var70, var71);
                if (module0395.NIL != module0032.f1746(var71, var72) && module0395.NIL != module0364.f24748(var72, (SubLObject)module0395.$ic25$) && module0395.NIL == f28076(var6, var72, (SubLObject)module0395.UNPROVIDED) && module0395.NIL == module0394.f28052(var6, var72)) {
                    var73 = module0373.f26166(var72);
                    if (module0395.NIL != var65 || module0395.NIL != module0394.f28053(var6, var72)) {
                        var68 = (SubLObject)ConsesLow.cons(var73, var68);
                    }
                    else {
                        var67 = (SubLObject)ConsesLow.cons(var73, var67);
                    }
                }
            }
            var67 = module0387.f27475(var6, var67, (SubLObject)module0395.$ic16$);
        }
        SubLObject var74 = (SubLObject)module0395.NIL;
        final SubLObject var75 = module0363.f24527(var9);
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0395.NIL, var77 = module0032.f1742(var76, var75); module0395.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
            var78 = module0032.f1745(var76, var77);
            if (module0395.NIL != module0032.f1746(var77, var78) && module0395.NIL != module0364.f24748(var78, (SubLObject)module0395.$ic25$)) {
                var79 = module0373.f26166(var78);
                if (module0395.NIL == module0035.f2169(var79, var67) && module0395.NIL == module0035.f2169(var79, var68)) {
                    var74 = (SubLObject)ConsesLow.cons(var79, var74);
                }
            }
        }
        return Values.values(var67, var68, var74);
    }
    
    public static SubLObject f28097(final SubLObject var6, final SubLObject var9, final SubLObject var65, final SubLObject var66) {
        SubLObject var67 = (SubLObject)module0395.NIL;
        SubLObject var68 = (SubLObject)module0395.NIL;
        if (module0395.NIL == var66) {
            final SubLObject var69 = module0380.f26973(var9);
            if (module0395.NIL != var69) {
                SubLObject var70 = module0363.f24517(var9);
                SubLObject var71 = (SubLObject)module0395.NIL;
                var71 = var70.first();
                while (module0395.NIL != var70) {
                    if (module0395.NIL != module0363.f24524(var71, (SubLObject)module0395.$ic26$) && module0395.NIL != module0363.f24518(var71, (SubLObject)module0395.$ic27$) && module0395.NIL == module0393.f27985(var6, var71) && module0395.NIL == module0394.f28020(var6, var71, (SubLObject)module0395.T, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED)) {
                        if (module0395.NIL != var65 || module0395.NIL != module0394.f28031(var6, var71, (SubLObject)module0395.T, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED)) {
                            var68 = (SubLObject)ConsesLow.cons(var71, var68);
                        }
                        else {
                            var67 = (SubLObject)ConsesLow.cons(var71, var67);
                        }
                    }
                    var70 = var70.rest();
                    var71 = var70.first();
                }
                var67 = module0387.f27475(var6, var67, (SubLObject)module0395.$ic16$);
            }
        }
        SubLObject var72 = (SubLObject)module0395.NIL;
        SubLObject var70 = module0363.f24517(var9);
        SubLObject var71 = (SubLObject)module0395.NIL;
        var71 = var70.first();
        while (module0395.NIL != var70) {
            if (module0395.NIL != module0363.f24524(var71, (SubLObject)module0395.$ic26$) && module0395.NIL != module0363.f24518(var71, (SubLObject)module0395.$ic27$) && module0395.NIL == module0035.f2169(var71, var67) && module0395.NIL == module0035.f2169(var71, var68)) {
                var72 = (SubLObject)ConsesLow.cons(var71, var72);
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        return Values.values(var67, var68, var72);
    }
    
    public static SubLObject f28098(final SubLObject var6, final SubLObject var9, final SubLObject var65, final SubLObject var66) {
        SubLObject var67 = (SubLObject)module0395.NIL;
        SubLObject var68 = (SubLObject)module0395.NIL;
        SubLObject var69 = (SubLObject)module0395.NIL;
        SubLObject var70 = (SubLObject)module0395.$ic28$;
        SubLObject var71 = (SubLObject)module0395.$ic29$;
        SubLObject var72 = (SubLObject)module0395.$ic9$;
        SubLObject var73 = (SubLObject)module0395.ZERO_INTEGER;
        SubLObject var74 = (SubLObject)module0395.NIL;
        if (module0395.NIL == var66) {
            final SubLObject var75 = (SubLObject)module0395.$ic30$;
            final SubLObject var76 = module0387.f27486(var9, var75);
            SubLObject var77 = module0363.f24517(var9);
            SubLObject var78 = (SubLObject)module0395.NIL;
            var78 = var77.first();
            while (module0395.NIL != var77) {
                if (module0395.NIL != module0363.f24524(var78, var75) && module0395.NIL == module0387.f27487(var78, var76, var6)) {
                    final SubLObject var79 = module0373.f26167(var78);
                    final SubLObject var80 = (SubLObject)((module0395.NIL != module0382.f27206(var78)) ? module0395.$ic31$ : module0395.$ic9$);
                    if (module0395.NIL == f28076(var6, var79, (SubLObject)module0395.UNPROVIDED) && module0395.NIL == module0394.f28054(var6, var79)) {
                        if (module0395.NIL != var65 || module0395.NIL != module0394.f28055(var6, var79)) {
                            var68 = (SubLObject)ConsesLow.cons(var78, var68);
                        }
                        else {
                            final SubLObject var81 = module0385.f27409(var78, var6);
                            SubLObject var82 = module0367.f25198(var78, var6);
                            final SubLObject var83 = module0373.f26158(var78);
                            final SubLObject var84 = module0388.f27593(var78, var6);
                            if (module0395.NIL != var84) {
                                var82 = (SubLObject)module0395.$ic29$;
                            }
                            if (module0395.NIL == var69 || module0395.NIL != f28099(var6, var78, var81, var82, var80, var83, var69, var70, var71, var72, var73)) {
                                var69 = var78;
                                var70 = var81;
                                var71 = var82;
                                var72 = var80;
                                var73 = var83;
                            }
                            if (module0395.NIL == var84 && module0395.NIL != f28100(var78, var6)) {
                                var74 = (SubLObject)ConsesLow.cons(var78, var74);
                            }
                        }
                    }
                }
                var77 = var77.rest();
                var78 = var77.first();
            }
            if (module0395.NIL != var69) {
                if (module0395.NIL != f28101(var6, var69, var71)) {
                    var74 = (SubLObject)module0395.NIL;
                }
                else {
                    var74 = module0035.f2073(var69, var74, Symbols.symbol_function((SubLObject)module0395.EQ));
                }
                var67 = (SubLObject)ConsesLow.cons(var69, var67);
                SubLObject var85 = var74;
                SubLObject var86 = (SubLObject)module0395.NIL;
                var86 = var85.first();
                while (module0395.NIL != var85) {
                    var67 = (SubLObject)ConsesLow.cons(var86, var67);
                    var85 = var85.rest();
                    var86 = var85.first();
                }
                var67 = module0387.f27475(var6, var67, (SubLObject)module0395.$ic16$);
            }
        }
        SubLObject var87 = (SubLObject)module0395.NIL;
        final SubLObject var88 = (SubLObject)module0395.$ic30$;
        final SubLObject var89 = module0387.f27486(var9, var88);
        SubLObject var90 = module0363.f24517(var9);
        SubLObject var91 = (SubLObject)module0395.NIL;
        var91 = var90.first();
        while (module0395.NIL != var90) {
            if (module0395.NIL != module0363.f24524(var91, var88) && module0395.NIL == module0387.f27487(var91, var89, var6) && module0395.NIL == module0035.f2169(var91, var67) && module0395.NIL == module0035.f2169(var91, var68)) {
                var87 = (SubLObject)ConsesLow.cons(var91, var87);
            }
            var90 = var90.rest();
            var91 = var90.first();
        }
        return Values.values(var67, var68, var87);
    }
    
    public static SubLObject f28099(final SubLObject var6, final SubLObject var110, final SubLObject var112, final SubLObject var113, final SubLObject var111, final SubLObject var114, final SubLObject var101, final SubLObject var102, final SubLObject var103, final SubLObject var104, final SubLObject var105) {
        if (module0395.NIL != module0361.f24164(module0365.f24879(var110))) {
            if (module0395.NIL != f28102(var110)) {
                return (SubLObject)module0395.T;
            }
            if (module0395.NIL != f28102(var101)) {
                return (SubLObject)module0395.NIL;
            }
        }
        if (module0395.NIL != module0361.f24164(module0365.f24879(var101)) && module0395.NIL != module0360.f23939(var112, var102) && var113.eql(var103)) {
            final SubLObject var115 = module0373.f26206(var110, var6);
            final SubLObject var116 = module0373.f26206(var101, var6);
            if (module0395.NIL != module0360.f23928(var115, var116)) {
                return (SubLObject)module0395.T;
            }
        }
        return module0388.f27592(var112, var113, var111, var114, var102, var103, var104, var105);
    }
    
    public static SubLObject f28102(final SubLObject var15) {
        if (module0395.NIL != module0381.f27067(var15)) {
            final SubLObject var16 = module0381.f27095(var15);
            if (module0395.NIL != module0363.f24562(var16)) {
                return module0381.f27080(module0363.f24564(var16));
            }
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28101(final SubLObject var6, final SubLObject var101, final SubLObject var120) {
        if (module0395.NIL != ((module0395.NIL != module0361.f24164(module0365.f24879(var101))) ? Equality.eq((SubLObject)module0395.$ic21$, module0373.f26206(var101, var6)) : Equality.eq((SubLObject)module0395.$ic32$, var120)) && module0395.NIL != f28100(var101, var6)) {
            return (SubLObject)module0395.T;
        }
        if (module0395.NIL != module0363.f24659(module0365.f24850(var101))) {
            return (SubLObject)module0395.T;
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28100(final SubLObject var74, final SubLObject var6) {
        if (module0395.NIL == module0382.f27206(var74)) {
            final SubLObject var75 = module0393.f27992(var6);
            if (module0395.NIL != var75) {
                final SubLObject var76 = module0385.f27409(var74, var6);
                return module0360.f23941(var76, var75);
            }
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28103(final SubLObject var6, final SubLObject var63) {
        SubLObject var64 = (SubLObject)module0395.ZERO_INTEGER;
        final SubLObject var65 = module0365.f24850(var63);
        final SubLObject var66 = module0393.f27983(var6);
        final SubLObject var67 = module0067.f4885(var66, var65, (SubLObject)module0395.NIL);
        if (module0395.NIL != module0077.f5319(var67)) {
            final SubLObject var68 = module0035.delete_if_not((SubLObject)module0395.$ic33$, module0077.f5312(var67), (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED);
            SubLObject var70;
            final SubLObject var69 = var70 = var68;
            SubLObject var63_127 = (SubLObject)module0395.NIL;
            var63_127 = var70.first();
            while (module0395.NIL != var70) {
                module0077.f5327(var63_127, var67);
                var70 = var70.rest();
                var63_127 = var70.first();
            }
            var70 = var69;
            SubLObject var63_128 = (SubLObject)module0395.NIL;
            var63_128 = var70.first();
            while (module0395.NIL != var70) {
                if (module0395.NIL != f28104(var6, var63_128)) {
                    var64 = Numbers.add(var64, (SubLObject)module0395.ONE_INTEGER);
                }
                var70 = var70.rest();
                var63_128 = var70.first();
            }
        }
        return var64;
    }
    
    public static SubLObject f28104(final SubLObject var6, final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        SubLObject var65 = (SubLObject)module0395.NIL;
        final SubLObject var66 = module0373.$g3181$.currentBinding(var64);
        try {
            module0373.$g3181$.bind((SubLObject)module0395.T, var64);
            final SubLObject var67 = module0365.f24850(var63);
            f28105(var6, var67);
            module0367.f25230(var63, var6);
            module0367.f25233(var63, var6);
            if (module0395.NIL == module0394.f28020(var6, var63, (SubLObject)module0395.NIL, (SubLObject)module0395.T, (SubLObject)module0395.UNPROVIDED)) {
                if (module0395.NIL != module0394.f28031(var6, var63, (SubLObject)module0395.NIL, (SubLObject)module0395.T, (SubLObject)module0395.T)) {
                    module0393.f28002(var6, var63);
                }
                else {
                    module0393.f27998(var6, var63);
                    var65 = (SubLObject)module0395.T;
                }
            }
        }
        finally {
            module0373.$g3181$.rebind(var66, var64);
        }
        return var65;
    }
    
    public static SubLObject f28105(final SubLObject var6, final SubLObject var9) {
        if (module0395.NIL != module0367.f25152(var9, var6)) {
            module0387.f27513(var9, var6);
        }
        module0367.f25052(var6, var9);
        module0393.f27997(var6, var9);
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28106(final SubLObject var6, final SubLObject var7) {
        assert module0395.NIL != module0397.f28129(var6) : var6;
        assert module0395.NIL != module0387.f27527(var7) : var7;
        if (module0395.NIL != module0376.f26618(var7)) {
            return module0393.f27998(var6, var7);
        }
        if (module0395.NIL != module0377.f26771(var7)) {
            return (SubLObject)module0395.NIL;
        }
        if (module0395.NIL != module0373.f26148(var7)) {
            module0393.f27998(var6, var7);
            return var7;
        }
        return module0393.f27998(var6, var7);
    }
    
    public static SubLObject f28107(final SubLObject var6, final SubLObject var7) {
        if (module0395.NIL != module0387.f27529(var7)) {
            return (SubLObject)module0395.NIL;
        }
        final SubLObject var8 = module0387.f27530(var7);
        f28108(var6, var7);
        f28109(var6, var8);
        if (module0395.NIL != module0365.f24819(var7)) {
            module0373.f26291(var6, var7);
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28108(final SubLObject var6, final SubLObject var7) {
        assert module0395.NIL != module0397.f28129(var6) : var6;
        assert module0395.NIL != module0387.f27532(var7) : var7;
        final SubLObject var8 = module0387.f27530(var7);
        final SubLObject var9 = module0393.f27982(var6);
        SubLObject var10 = module0067.f4885(var9, var8, (SubLObject)module0395.ZERO_INTEGER);
        var10 = Numbers.subtract(var10, (SubLObject)module0395.ONE_INTEGER);
        if (var10.isPositive()) {
            module0067.f4886(var9, var8, var10);
        }
        else {
            module0067.f4887(var9, var8);
            module0393.f27996(var6, var8);
        }
        return var10;
    }
    
    public static SubLObject f28109(final SubLObject var6, final SubLObject var9) {
        if (module0395.NIL == module0393.f27988(var6, var9)) {
            module0367.f25050(var6, var9);
            if (module0395.NIL != module0393.f27989(var6, var9)) {
                module0367.f25101(var6, var9);
                return (SubLObject)module0395.T;
            }
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28110(final SubLObject var6, final SubLObject var9) {
        if (module0395.NIL != module0394.f28012(var6, var9, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED)) {
            f28086(var6, var9);
            return (SubLObject)module0395.T;
        }
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28086(final SubLObject var6, final SubLObject var9) {
        module0393.f27996(var6, var9);
        f28109(var6, var9);
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28111(final SubLObject var6, final SubLObject var9) {
        SubLObject var10 = module0363.f24517(var9);
        SubLObject var11 = (SubLObject)module0395.NIL;
        var11 = var10.first();
        while (module0395.NIL != var10) {
            if (module0395.NIL == module0394.f28020(var6, var11, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED, (SubLObject)module0395.UNPROVIDED)) {
                return (SubLObject)module0395.NIL;
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)module0395.T;
    }
    
    public static SubLObject f28112() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0395", "f28072", "S#31206");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28073", "S#31207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28074", "S#31208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28076", "S#31209", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28077", "S#31210", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28075", "S#31211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28078", "S#31212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28081", "S#31213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28083", "S#31214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28084", "S#31215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28082", "S#31216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28079", "S#31217", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28080", "S#31218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28085", "S#31219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28087", "S#31220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28089", "S#31221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28090", "S#31222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28091", "S#31223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28093", "S#31224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28092", "S#31225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28088", "S#31145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28095", "S#31226", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28094", "S#31227", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28096", "S#31228", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28097", "S#31229", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28098", "S#31230", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28099", "S#31231", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28102", "S#31232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28101", "S#31233", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28100", "S#31234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28103", "S#31235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28104", "S#31236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28105", "S#31237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28106", "S#31238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28107", "S#31239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28108", "S#31240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28109", "S#31241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28110", "S#31242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28086", "S#31243", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0395", "f28111", "S#31244", 2, 0, false);
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28113() {
        module0395.$g3284$ = SubLFiles.defparameter("S#31245", (SubLObject)module0395.$ic14$);
        return (SubLObject)module0395.NIL;
    }
    
    public static SubLObject f28114() {
        module0012.f419((SubLObject)module0395.$ic15$);
        module0012.f419((SubLObject)module0395.$ic17$);
        module0012.f419((SubLObject)module0395.$ic36$);
        module0012.f419((SubLObject)module0395.$ic37$);
        return (SubLObject)module0395.NIL;
    }
    
    public void declareFunctions() {
        f28112();
    }
    
    public void initializeVariables() {
        f28113();
    }
    
    public void runTopLevelForms() {
        f28114();
    }
    
    static {
        me = (SubLFile)new module0395();
        module0395.$g3284$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31246", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeUninternedSymbol("US#6FBE6D3");
        $ic2$ = SubLObjectFactory.makeUninternedSymbol("US#40FC4A0");
        $ic3$ = SubLObjectFactory.makeSymbol("CLET");
        $ic4$ = SubLObjectFactory.makeSymbol("S#30619", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#31240", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#31241", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#30620", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#29327", "CYC");
        $ic9$ = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $ic10$ = SubLObjectFactory.makeKeyword("PROVEN");
        $ic11$ = SubLObjectFactory.makeKeyword("RESTRICTION");
        $ic12$ = SubLObjectFactory.makeKeyword("REWRITE");
        $ic13$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("SPLIT"), (SubLObject)SubLObjectFactory.makeKeyword("UNION"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#31223", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#30575", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#31224", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("META-STRUCTURAL");
        $ic19$ = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");
        $ic20$ = SubLObjectFactory.makeKeyword("POSSIBLE");
        $ic21$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic22$ = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $ic23$ = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $ic24$ = SubLObjectFactory.makeSymbol("S#30574", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("DISJUNCTIVE");
        $ic26$ = SubLObjectFactory.makeKeyword("SPLIT");
        $ic27$ = SubLObjectFactory.makeKeyword("NON-DISCARDED");
        $ic28$ = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $ic29$ = SubLObjectFactory.makeKeyword("DISALLOWED");
        $ic30$ = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION");
        $ic31$ = SubLObjectFactory.makeKeyword("JOIN");
        $ic32$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic33$ = SubLObjectFactory.makeSymbol("S#27351", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#30617", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#30622", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#31242", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#31244", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0395.class
	Total time: 285 ms
	
	Decompiled with Procyon 0.5.32.
*/