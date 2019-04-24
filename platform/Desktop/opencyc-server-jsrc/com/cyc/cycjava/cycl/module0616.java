package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0616 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0616";
    public static final String myFingerPrint = "fa70707d9ffe48ad274601546110fba21bab5b86be7061a85dc8cd1a91f37c0e";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLList $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    
    public static SubLObject f37777(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0616.NIL == module0617.f37824(var1, var2, var3, var4, var5) && module0616.NIL == module0617.f37825(var1, var2, var3, var4, var5) && module0616.NIL == module0617.f37826(var1, var2, var3, var4, var5) && module0616.NIL == module0617.f37827(var1, var2, var3, var4, var5) && module0616.NIL == f37778(var1, var2, var3, var4, var5) && module0616.NIL == f37779(var1, var2, var3, var4, var5) && module0616.NIL == f37780(var1, var2, var3, var4, var5) && module0616.NIL == f37781(var1, var2, var3, var4, var5) && module0616.NIL == f37782(var1, var2, var3, var4, var5));
    }
    
    public static SubLObject f37783(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37784(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLObject var7;
        final SubLObject var6 = var7 = module0191.f11917(var1);
        if (var7.eql((SubLObject)module0616.$ic2$)) {
            assert module0616.NIL != module0191.f11933(var1) : var1;
            final SubLObject var8 = module0191.f11943(var1);
            return f37785(var2, var3, var8, var4, var5);
        }
        else {
            if (!var7.eql((SubLObject)module0616.$ic4$)) {
                module0538.f33323((SubLObject)module0616.$ic6$);
                return (SubLObject)module0616.NIL;
            }
            assert module0616.NIL != module0188.f11767(var1) : var1;
            final SubLObject var9 = module0188.f11771(var1);
            return f37786(var2, var3, var9, var4, var5);
        }
    }
    
    public static SubLObject f37785(final SubLObject var2, final SubLObject var3, final SubLObject var10, final SubLObject var4, final SubLObject var5) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0616.NIL;
        final SubLObject var13 = (SubLObject)ConsesLow.list(var2, var5);
        var11.resetMultipleValues();
        final SubLObject var2_14 = module0538.f33413(var13, (SubLObject)module0616.T, var10);
        final SubLObject var14 = var11.secondMultipleValue();
        final SubLObject var15 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        final SubLObject var16 = Mapping.mapcar((SubLObject)module0616.$ic7$, var14);
        SubLObject var17 = module0217.f14415(var2_14, var3);
        final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0616.NIL != var17);
        if (module0616.NIL == module0174.f11041(var17, (SubLObject)module0616.UNPROVIDED)) {
            var17 = module0178.f11364(var2_14, var3, var16, var4, module0130.f8524(var15), module0130.f8523(var15), module0191.f11941((SubLObject)module0616.NIL, var15));
        }
        if (module0616.NIL != var17) {
            var11.resetMultipleValues();
            final SubLObject var19 = module0538.f33394(var17, var15, var4, var18);
            final SubLObject var20 = var11.secondMultipleValue();
            final SubLObject var21 = var11.thirdMultipleValue();
            var11.resetMultipleValues();
            if (var20 != module0616.$ic8$) {
                if (var20 == module0616.$ic9$) {
                    module0197.f12269(var19, (SubLObject)module0616.$ic10$);
                }
                final SubLObject var22 = module0178.f11283(var19);
                module0197.f12264(var22, var3);
            }
            var12 = var19;
        }
        else {
            var12 = (SubLObject)module0616.NIL;
        }
        return var12;
    }
    
    public static SubLObject f37786(final SubLObject var2, final SubLObject var3, final SubLObject var9, final SubLObject var4, final SubLObject var5) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = (SubLObject)ConsesLow.list(var2, var5);
        var10.resetMultipleValues();
        final SubLObject var2_24 = module0538.f33413(var11, (SubLObject)module0616.T, (SubLObject)module0616.UNPROVIDED);
        final SubLObject var12 = var10.secondMultipleValue();
        final SubLObject var13 = var10.thirdMultipleValue();
        var10.resetMultipleValues();
        final SubLObject var14 = Mapping.mapcar((SubLObject)module0616.$ic7$, var12);
        final SubLObject var15 = module0130.f8524(var13);
        final SubLObject var16 = conses_high.copy_tree(var9);
        var10.resetMultipleValues();
        final SubLObject var17 = module0342.f23141(var2_24, var3, var16, var15, var4, var14);
        final SubLObject var18 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        if (module0616.NIL != var18 || module0616.NIL != module0184.f11659(var17)) {
            if (module0616.NIL != var18) {
                final SubLObject var19 = module0232.f15328(var2_24, (SubLObject)module0616.UNPROVIDED);
                module0538.f33320((SubLObject)ConsesLow.list((SubLObject)module0616.$ic11$, (SubLObject)module0616.$ic12$, var19, var3));
            }
            return var17;
        }
        final SubLObject var19 = module0232.f15328(var2_24, (SubLObject)module0616.UNPROVIDED);
        module0538.f33323((SubLObject)ConsesLow.list((SubLObject)module0616.$ic13$, (SubLObject)module0616.$ic14$, var19, var3));
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37787(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var5;
        final SubLObject var4 = var5 = module0191.f11917(var1);
        if (var5.eql((SubLObject)module0616.$ic2$)) {
            assert module0616.NIL != module0191.f11933(var1) : var1;
            final SubLObject var6 = module0191.f11943(var1);
            return f37788(var2, var3);
        }
        else {
            if (!var5.eql((SubLObject)module0616.$ic4$)) {
                module0538.f33323((SubLObject)module0616.$ic6$);
                return (SubLObject)module0616.NIL;
            }
            assert module0616.NIL != module0188.f11767(var1) : var1;
            final SubLObject var7 = module0188.f11771(var1);
            return f37789(var2, var3, var7);
        }
    }
    
    public static SubLObject f37788(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = (SubLObject)ConsesLow.list(var2, (SubLObject)module0616.NIL);
        var4.resetMultipleValues();
        final SubLObject var2_30 = module0538.f33413(var5, (SubLObject)module0616.T, (SubLObject)module0616.UNPROVIDED);
        final SubLObject var6 = var4.secondMultipleValue();
        final SubLObject var7 = var4.thirdMultipleValue();
        var4.resetMultipleValues();
        final SubLObject var8 = module0217.f14415(var2_30, var3);
        if (module0616.NIL == var8) {
            final SubLObject var9 = module0232.f15328(var2_30, (SubLObject)module0616.UNPROVIDED);
            module0538.f33320((SubLObject)ConsesLow.list((SubLObject)module0616.$ic15$, (SubLObject)module0616.$ic16$, var9, var3));
        }
        else {
            var4.resetMultipleValues();
            final SubLObject var10 = module0178.f11379(var8);
            final SubLObject var11 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            if (module0616.NIL == var10) {
                final SubLObject var12 = module0232.f15328(var2_30, (SubLObject)module0616.UNPROVIDED);
                module0538.f33320((SubLObject)ConsesLow.list((SubLObject)module0616.$ic17$, (SubLObject)module0616.$ic18$, var12, var3));
            }
            else {
                module0342.f23121(var10, var8, var11);
            }
        }
        return (SubLObject)module0616.T;
    }
    
    public static SubLObject f37789(final SubLObject var2, final SubLObject var3, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = (SubLObject)ConsesLow.list(var2, (SubLObject)module0616.NIL);
        var10.resetMultipleValues();
        final SubLObject var2_34 = module0538.f33413(var11, (SubLObject)module0616.T, (SubLObject)module0616.UNPROVIDED);
        final SubLObject var12 = var10.secondMultipleValue();
        final SubLObject var13 = var10.thirdMultipleValue();
        var10.resetMultipleValues();
        final SubLObject var14 = module0217.f14415(var2_34, var3);
        if (module0616.NIL == var14) {
            final SubLObject var15 = module0232.f15328(var2_34, (SubLObject)module0616.UNPROVIDED);
            module0538.f33320((SubLObject)ConsesLow.list((SubLObject)module0616.$ic15$, (SubLObject)module0616.$ic16$, var15, var3));
        }
        else {
            final SubLObject var16 = module0130.f8524(var13);
            final SubLObject var17 = module0342.f23137(var14, var9, var16);
            if (module0616.NIL == var17) {
                final SubLObject var18 = module0232.f15328(var2_34, (SubLObject)module0616.UNPROVIDED);
                module0538.f33320((SubLObject)ConsesLow.list((SubLObject)module0616.$ic19$, (SubLObject)module0616.$ic20$, var9, var18, var3));
            }
        }
        return (SubLObject)module0616.T;
    }
    
    public static SubLObject f37790(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0616.NIL != module0232.f15320(var2) : var2;
        assert module0616.NIL != module0161.f10481(var3) : var3;
        final SubLObject var5 = (SubLObject)ConsesLow.list(var2, (SubLObject)module0616.NIL);
        var4.resetMultipleValues();
        final SubLObject var2_36 = module0538.f33413(var5, (SubLObject)module0616.T, (SubLObject)module0616.UNPROVIDED);
        final SubLObject var6 = var4.secondMultipleValue();
        final SubLObject var7 = var4.thirdMultipleValue();
        var4.resetMultipleValues();
        final SubLObject var8 = module0217.f14415(var2_36, var3);
        if (module0616.NIL == var8) {
            final SubLObject var9 = module0232.f15328(var2_36, (SubLObject)module0616.UNPROVIDED);
            module0538.f33320((SubLObject)ConsesLow.list((SubLObject)module0616.$ic15$, (SubLObject)module0616.$ic16$, var9, var3));
        }
        else {
            module0342.f23126(var8);
        }
        return (SubLObject)module0616.T;
    }
    
    public static SubLObject f37778(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        if (module0616.NIL != module0232.f15312(var2)) {
            final SubLObject var6 = module0204.f13054(var2);
            if (module0616.NIL != module0202.f12589(var6, module0616.$ic25$)) {
                return module0337.f22628((SubLObject)module0616.$ic26$, var6);
            }
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37791(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37792(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0616.NIL;
        final SubLObject var7 = module0204.f13048(var2);
        final SubLObject var8 = module0204.f13054(var2);
        final SubLObject var9 = module0202.f12906(var8);
        final SubLObject var10 = (module0616.NIL != var7) ? module0205.f13338(module0202.f12887(var8)) : module0202.f12887(var8);
        SubLObject var12;
        final SubLObject var11 = var12 = module0285.f18887(var10, var9);
        SubLObject var13 = (SubLObject)module0616.NIL;
        var13 = var12.first();
        while (module0616.NIL != var12) {
            SubLObject var15;
            final SubLObject var14 = var15 = var13;
            SubLObject var16 = (SubLObject)module0616.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0616.$ic27$);
            var16 = var15.first();
            var15 = var15.rest();
            final SubLObject var17 = (SubLObject)(var15.isCons() ? var15.first() : module0616.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var15, var14, (SubLObject)module0616.$ic27$);
            var15 = var15.rest();
            final SubLObject var18 = (SubLObject)(var15.isCons() ? var15.first() : module0616.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var15, var14, (SubLObject)module0616.$ic27$);
            var15 = var15.rest();
            if (module0616.NIL == var15) {
                var6 = module0195.f12214(var1, var16, var9, var4, var17);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0616.$ic27$);
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        return var6;
    }
    
    public static SubLObject f37793(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0616.NIL;
        final SubLObject var5 = module0204.f13048(var2);
        final SubLObject var6 = module0204.f13054(var2);
        final SubLObject var7 = module0202.f12906(var6);
        final SubLObject var8 = (module0616.NIL != var5) ? module0205.f13338(module0202.f12887(var6)) : module0202.f12887(var6);
        SubLObject var10;
        final SubLObject var9 = var10 = module0285.f18917(var8, var7);
        SubLObject var11 = (SubLObject)module0616.NIL;
        var11 = var10.first();
        while (module0616.NIL != var10) {
            SubLObject var13;
            final SubLObject var12 = var13 = var11;
            SubLObject var14 = (SubLObject)module0616.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0616.$ic27$);
            var14 = var13.first();
            var13 = var13.rest();
            final SubLObject var15 = (SubLObject)(var13.isCons() ? var13.first() : module0616.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var13, var12, (SubLObject)module0616.$ic27$);
            var13 = var13.rest();
            final SubLObject var16 = (SubLObject)(var13.isCons() ? var13.first() : module0616.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var13, var12, (SubLObject)module0616.$ic27$);
            var13 = var13.rest();
            if (module0616.NIL == var13) {
                var4 = module0195.f12218(var1, var14, var7);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0616.$ic27$);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return var4;
    }
    
    public static SubLObject f37794(final SubLObject var2, final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0616.NIL;
        final SubLObject var5 = module0204.f13048(var2);
        final SubLObject var6 = module0204.f13054(var2);
        final SubLObject var7 = module0202.f12906(var6);
        final SubLObject var8 = (module0616.NIL != var5) ? module0205.f13338(module0202.f12887(var6)) : module0202.f12887(var6);
        SubLObject var10;
        final SubLObject var9 = var10 = module0285.f18911(var8, var7);
        SubLObject var11 = (SubLObject)module0616.NIL;
        var11 = var10.first();
        while (module0616.NIL != var10) {
            SubLObject var13;
            final SubLObject var12 = var13 = var11;
            SubLObject var14 = (SubLObject)module0616.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0616.$ic27$);
            var14 = var13.first();
            var13 = var13.rest();
            final SubLObject var15 = (SubLObject)(var13.isCons() ? var13.first() : module0616.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var13, var12, (SubLObject)module0616.$ic27$);
            var13 = var13.rest();
            final SubLObject var16 = (SubLObject)(var13.isCons() ? var13.first() : module0616.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var13, var12, (SubLObject)module0616.$ic27$);
            var13 = var13.rest();
            if (module0616.NIL == var13) {
                var4 = module0195.f12220(var14, var7);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0616.$ic27$);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return var4;
    }
    
    public static SubLObject f37782(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        if (module0616.NIL != module0204.f13044(var2)) {
            final SubLObject var6 = module0204.f13047(var2);
            if (module0616.NIL != module0202.f12589(var6, module0616.$ic30$)) {
                return module0337.f22628((SubLObject)module0616.$ic31$, var6);
            }
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37795(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37796(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = module0204.f13047(var2);
        final SubLObject var7 = module0205.f13387(var6, (SubLObject)module0616.UNPROVIDED);
        final SubLObject var8 = module0205.f13388(var6, (SubLObject)module0616.UNPROVIDED);
        final SubLObject var9 = module0166.f10743(var7);
        if (module0616.NIL != module0128.f8449(var7) && module0616.NIL != module0126.f8389(var8) && !var8.equal(var9)) {
            return module0540.f33508(var7, var8);
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37797(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = module0204.f13047(var2);
        final SubLObject var5 = module0205.f13387(var4, (SubLObject)module0616.UNPROVIDED);
        final SubLObject var6 = module0205.f13388(var4, (SubLObject)module0616.UNPROVIDED);
        final SubLObject var7 = module0166.f10743(var5);
        if (module0616.NIL != module0128.f8449(var5) && module0616.NIL != module0126.f8389(var6) && var6.equal(var7)) {
            return (SubLObject)module0616.NIL;
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37779(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        if (module0616.NIL != module0204.f13044(var2)) {
            final SubLObject var6 = module0204.f13047(var2);
            if (module0616.NIL != module0202.f12589(var6, module0616.$ic34$)) {
                return module0337.f22628((SubLObject)module0616.$ic35$, var6);
            }
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37798(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37799(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = module0204.f13047(var2);
        final SubLObject var7 = module0205.f13379(var6, (SubLObject)module0616.UNPROVIDED);
        final SubLObject var8 = module0491.f32051(module0205.f13380(var6, (SubLObject)module0616.UNPROVIDED));
        final SubLObject var9 = module0178.f11291(var7);
        if (!var8.eql(var9)) {
            module0342.f23133(var7, var8);
        }
        return (SubLObject)module0616.T;
    }
    
    public static SubLObject f37800(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return (SubLObject)module0616.T;
    }
    
    public static SubLObject f37781(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        if (module0616.NIL != module0204.f13044(var2)) {
            final SubLObject var6 = module0204.f13047(var2);
            if (module0616.NIL != module0202.f12589(var6, module0616.$ic38$)) {
                return module0337.f22628((SubLObject)module0616.$ic39$, var6);
            }
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37801(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37802(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = module0204.f13047(var2);
        final SubLObject var7 = module0205.f13388(var6, (SubLObject)module0616.UNPROVIDED);
        if (module0616.NIL != module0173.f10955(var7) && module0616.NIL != module0226.f14809(var7) && !module0616.$ic40$.eql(var7)) {
            module0574.f35153(var7);
            return Equality.equal(var7, module0574.f35152());
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37803(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0204.f13047(var2);
        final SubLObject var6 = module0205.f13388(var5, (SubLObject)module0616.UNPROVIDED);
        if (module0616.NIL != module0173.f10955(var6) && module0616.NIL != module0226.f14809(var6) && var6.equal(module0574.f35152())) {
            module0574.f35153(module0110.$g1362$.getDynamicValue(var4));
            return (SubLObject)SubLObjectFactory.makeBoolean(!var6.equal(module0574.f35152()));
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37780(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        if (module0616.NIL != module0204.f13044(var2)) {
            final SubLObject var6 = module0204.f13047(var2);
            if (module0616.NIL != module0202.f12589(var6, module0616.$ic41$)) {
                return module0337.f22628((SubLObject)module0616.$ic44$, var6);
            }
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37804(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        return (SubLObject)module0616.$ic45$;
    }
    
    public static SubLObject f37805(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = module0204.f13047(var2);
        final SubLObject var7 = module0205.f13387(var6, (SubLObject)module0616.UNPROVIDED);
        return module0497.f32178(var7);
    }
    
    public static SubLObject f37806(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return (SubLObject)module0616.T;
    }
    
    public static SubLObject f37807(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        if (module0616.NIL != module0232.f15312(var2)) {
            final SubLObject var6 = module0204.f13052(var2);
            if (module0616.NIL != module0202.f12589(var6, module0616.$ic46$)) {
                return module0337.f22628((SubLObject)module0616.$ic49$, var6);
            }
        }
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37808(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        return (SubLObject)module0616.$ic45$;
    }
    
    public static SubLObject f37809(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = module0204.f13052(var2);
        final SubLObject var7 = module0205.f13387(var6, (SubLObject)module0616.UNPROVIDED);
        if (module0616.NIL != module0204.f13044(var2)) {
            return f37810(var7);
        }
        return f37811(var7);
    }
    
    public static SubLObject f37810(final SubLObject var60) {
        Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#32760", "CYC"), (SubLObject)ConsesLow.list(var60));
        return Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#41381", "CYC"), var60);
    }
    
    public static SubLObject f37812(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = module0204.f13047(var2);
        final SubLObject var5 = module0205.f13387(var4, (SubLObject)module0616.UNPROVIDED);
        return f37811(var5);
    }
    
    public static SubLObject f37811(final SubLObject var60) {
        Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#41382", "CYC"), (SubLObject)ConsesLow.list(var60));
        return (SubLObject)SubLObjectFactory.makeBoolean(module0616.NIL == Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#41381", "CYC"), var60));
    }
    
    public static SubLObject f37813() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37777", "S#41383", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37783", "S#41384", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37784", "S#41385", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37785", "S#41386", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37786", "S#41387", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37787", "S#41388", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37788", "S#41389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37789", "S#41390", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37790", "S#41391", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37778", "S#41392", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37791", "S#41393", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37792", "S#41394", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37793", "S#41395", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37794", "S#41396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37782", "S#41397", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37795", "S#41398", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37796", "S#41399", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37797", "S#41400", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37779", "S#41401", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37798", "S#41402", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37799", "S#41403", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37800", "S#41404", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37781", "S#41405", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37801", "S#41406", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37802", "S#41407", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37803", "S#41408", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37780", "S#41409", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37804", "S#41410", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37805", "S#41411", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37806", "S#41412", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37807", "S#41413", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37808", "S#41414", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37809", "S#41415", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37810", "S#41416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37812", "S#41417", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0616", "f37811", "S#41418", 1, 0, false);
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37814() {
        return (SubLObject)module0616.NIL;
    }
    
    public static SubLObject f37815() {
        module0195.f12128((SubLObject)module0616.$ic0$, (SubLObject)module0616.$ic1$);
        module0195.f12128((SubLObject)module0616.$ic23$, (SubLObject)module0616.$ic24$);
        module0195.f12128((SubLObject)module0616.$ic28$, (SubLObject)module0616.$ic29$);
        module0195.f12128((SubLObject)module0616.$ic32$, (SubLObject)module0616.$ic33$);
        module0195.f12128((SubLObject)module0616.$ic36$, (SubLObject)module0616.$ic37$);
        module0195.f12196(module0616.$ic41$);
        module0195.f12128((SubLObject)module0616.$ic42$, (SubLObject)module0616.$ic43$);
        module0195.f12196(module0616.$ic46$);
        module0195.f12128((SubLObject)module0616.$ic47$, (SubLObject)module0616.$ic48$);
        module0012.f419((SubLObject)module0616.$ic50$);
        module0012.f419((SubLObject)module0616.$ic51$);
        return (SubLObject)module0616.NIL;
    }
    
    public void declareFunctions() {
        f37813();
    }
    
    public void initializeVariables() {
        f37814();
    }
    
    public void runTopLevelForms() {
        f37815();
    }
    
    static {
        me = (SubLFile)new module0616();
        $ic0$ = SubLObjectFactory.makeKeyword("REGULAR-KB-ASSERTION");
        $ic1$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Regular KB Assertion"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#41383", "CYC"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("S#41384", "CYC"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("S#41385", "CYC"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("S#41388", "CYC"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("S#41391", "CYC") });
        $ic2$ = SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT");
        $ic3$ = SubLObjectFactory.makeSymbol("S#14731", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("DEDUCTION");
        $ic5$ = SubLObjectFactory.makeSymbol("S#14573", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENERIC-ERROR"), (SubLObject)SubLObjectFactory.makeString("Unknown argument type ~S"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#15462", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("UNCHANGED");
        $ic9$ = SubLObjectFactory.makeKeyword("FLIPPED");
        $ic10$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic11$ = SubLObjectFactory.makeKeyword("ARGUMENT-ALREADY-PRESENT");
        $ic12$ = SubLObjectFactory.makeString("Argument for ~S in ~S is already present");
        $ic13$ = SubLObjectFactory.makeKeyword("GENERIC-ERROR");
        $ic14$ = SubLObjectFactory.makeString("Unable to add argument for ~S in ~S");
        $ic15$ = SubLObjectFactory.makeKeyword("ASSERTION-NOT-PRESENT");
        $ic16$ = SubLObjectFactory.makeString("Formula ~S in mt ~S is not in the KB");
        $ic17$ = SubLObjectFactory.makeKeyword("ASSERTION-NOT-LOCAL");
        $ic18$ = SubLObjectFactory.makeString("Formula ~S in mt ~S is not locally in the KB");
        $ic19$ = SubLObjectFactory.makeKeyword("ARGUMENT-NOT-PRESENT");
        $ic20$ = SubLObjectFactory.makeString("Argument ~S ~%for ~S in mt ~S is not already present");
        $ic21$ = SubLObjectFactory.makeSymbol("CNF-P");
        $ic22$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("IST");
        $ic24$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("ist"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#41392", "CYC"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("S#41393", "CYC"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("S#41394", "CYC"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("S#41395", "CYC"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("S#41396", "CYC") });
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic26$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41419", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#41420", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36884", "CYC"));
        $ic28$ = SubLObjectFactory.makeKeyword("CONSTANT-NAME");
        $ic29$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("constantName"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#41397", "CYC"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("S#41398", "CYC"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("S#41399", "CYC"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("S#41400", "CYC"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("S#41400", "CYC") });
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName"));
        $ic31$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"));
        $ic32$ = SubLObjectFactory.makeKeyword("ASSERTION-DIRECTION");
        $ic33$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("assertionDirection"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionDirection")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#41401", "CYC"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("S#41402", "CYC"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("S#41403", "CYC"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("S#41404", "CYC"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("S#41404", "CYC") });
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionDirection"));
        $ic35$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionDirection")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35404", "CYC")));
        $ic36$ = SubLObjectFactory.makeKeyword("INDEXICAL-THE-USER");
        $ic37$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("indexicalReferent TheUser"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#41405", "CYC"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("S#41406", "CYC"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("S#41407", "CYC"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("S#41408", "CYC"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("S#41408", "CYC") });
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $ic39$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheUser")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"));
        $ic40$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheUser"));
        $ic41$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL"));
        $ic42$ = SubLObjectFactory.makeKeyword("PERFORM-SUBL");
        $ic43$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("performSubL"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#41409", "CYC"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("S#41410", "CYC"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("S#41411", "CYC"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("S#41412", "CYC"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("S#41412", "CYC") });
        $ic44$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))));
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"));
        $ic46$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("sksRegistered"));
        $ic47$ = SubLObjectFactory.makeKeyword("SKS-REGISTERED");
        $ic48$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("sksRegistered"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("ARGUMENT"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("sksRegistered")), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#41413", "CYC"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("S#41414", "CYC"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeSymbol("S#41415", "CYC"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeSymbol("S#41417", "CYC"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeSymbol("S#41417", "CYC") });
        $ic49$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("sksRegistered")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"));
        $ic50$ = SubLObjectFactory.makeSymbol("S#41413", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#41414", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0616.class
	Total time: 222 ms
	
	Decompiled with Procyon 0.5.32.
*/