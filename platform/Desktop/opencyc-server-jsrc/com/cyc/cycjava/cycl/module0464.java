package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0464 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0464";
    public static final String myFingerPrint = "7ce61f12c906b57f541fb8e8ceeec445908101f0b332700702d31c90a5fe0154";
    private static SubLSymbol $g3657$;
    private static SubLSymbol $g3658$;
    public static SubLSymbol $g3659$;
    private static SubLSymbol $g3660$;
    private static SubLSymbol $g3661$;
    private static SubLSymbol $g3662$;
    public static SubLSymbol $g3663$;
    private static SubLSymbol $g3664$;
    private static SubLSymbol $g3665$;
    private static SubLSymbol $g3666$;
    public static SubLSymbol $g3667$;
    private static SubLSymbol $g3668$;
    private static SubLSymbol $g3669$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLFloat $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    
    public static SubLObject f31475(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0464.UNPROVIDED) {
            var3 = (SubLObject)module0464.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = Equality.equal(var1, var2);
        final SubLObject var6 = (SubLObject)SubLObjectFactory.makeBoolean(module0464.NIL != var5 || module0464.NIL != module0331.f22376(var1, var2));
        final SubLObject var7 = (SubLObject)((module0464.NIL != var5) ? module0464.$ic6$ : module0464.$ic7$);
        final SubLObject var8 = (module0464.NIL != var3) ? module0147.$g2095$.getDynamicValue(var4) : ((module0464.NIL != var6) ? module0132.$g1562$.getGlobalValue() : module0147.$g2095$.getDynamicValue(var4));
        final SubLObject var9 = module0351.f23578(module0464.$ic0$, (SubLObject)ConsesLow.list(var1, var2));
        final SubLObject var10 = (module0464.NIL != var3) ? module0205.f13338(var9) : var9;
        final SubLObject var11 = module0191.f11990((SubLObject)module0464.$ic8$, var10, var8, var7);
        return var11;
    }
    
    public static SubLObject f31476(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = (module0464.NIL != module0173.f10955(var14)) ? var14 : var15;
        final SubLObject var17 = (module0464.NIL != module0173.f10955(var14)) ? var15 : var14;
        if (module0464.NIL != module0331.f22370(var16, var17, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED)) {
            final SubLObject var18 = f31475(var16, var17, (SubLObject)module0464.UNPROVIDED);
            module0347.f23330(var18, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31477(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var17 = (module0464.NIL != module0173.f10955(var15)) ? var15 : var16;
        final SubLObject var18 = (module0464.NIL != module0173.f10955(var15)) ? var16 : var15;
        SubLObject var20;
        final SubLObject var19 = var20 = module0331.f22369(var17, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        SubLObject var21 = (SubLObject)module0464.NIL;
        var21 = var20.first();
        while (module0464.NIL != var20) {
            var14.resetMultipleValues();
            final SubLObject var22 = module0235.f15474(var18, var21, (SubLObject)module0464.T, (SubLObject)module0464.T);
            final SubLObject var23 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (module0464.NIL != var22) {
                final SubLObject var24 = module0233.f15361(var22, var18);
                final SubLObject var25 = f31475(var17, var24, (SubLObject)module0464.UNPROVIDED);
                module0347.f23330(var25, var22, var23);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31478(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        var14.resetMultipleValues();
        final SubLObject var17 = module0235.f15474(var15, var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var18 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        if (module0464.NIL != var17) {
            final SubLObject var19 = module0233.f15361(var17, var15);
            final SubLObject var20 = module0233.f15361(var17, var16);
            if (module0464.NIL != module0193.f12105(var19) && module0464.NIL != module0193.f12105(var20)) {
                return (SubLObject)module0464.T;
            }
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31479(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        var14.resetMultipleValues();
        final SubLObject var17 = module0235.f15474(var15, var16, (SubLObject)module0464.T, (SubLObject)module0464.T);
        final SubLObject var18 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        if (module0464.NIL != var17) {
            final SubLObject var19 = module0233.f15361(var17, var15);
            final SubLObject var20 = module0233.f15361(var17, var16);
            final SubLObject var21 = f31475(var19, var20, (SubLObject)module0464.UNPROVIDED);
            module0347.f23330(var21, var17, var18);
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31480(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (var15.equal(var16)) {
            return (SubLObject)module0464.ZERO_INTEGER;
        }
        return module0464.$g3660$.getDynamicValue(var14);
    }
    
    public static SubLObject f31481(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (module0464.NIL == module0331.f22385(var14) || module0464.NIL == module0331.f22385(var15)) {
            if (module0464.NIL != module0331.f22383((SubLObject)ConsesLow.list(var14, var15), (SubLObject)module0464.UNPROVIDED)) {
                final SubLObject var16 = f31475(var14, var15, (SubLObject)module0464.T);
                module0347.f23330(var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
            }
        }
        else if (module0464.NIL == module0331.f22370(var14, var15, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED)) {
            final SubLObject var16 = f31475(var14, var15, (SubLObject)module0464.T);
            module0347.f23330(var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31482(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (var15.equal(var16)) {
            return (SubLObject)module0464.ZERO_INTEGER;
        }
        return module0464.$g3661$.getDynamicValue(var14);
    }
    
    public static SubLObject f31483(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (module0464.NIL == module0331.f22385(var14) || module0464.NIL == module0331.f22385(var15)) {
            if (module0464.NIL != module0331.f22383((SubLObject)ConsesLow.list(var14, var15), (SubLObject)module0464.UNPROVIDED)) {
                final SubLObject var16 = f31475(var14, var15, (SubLObject)module0464.T);
                module0347.f23330(var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
            }
        }
        else if (module0464.NIL == module0235.f15474(var14, var15, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED)) {
            final SubLObject var16 = f31475(var14, var15, (SubLObject)module0464.T);
            module0347.f23330(var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31484(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (var15.equal(var16)) {
            return (SubLObject)module0464.ZERO_INTEGER;
        }
        return module0464.$g3662$.getDynamicValue(var14);
    }
    
    public static SubLObject f31485(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0464.NIL;
        final SubLObject var5 = module0018.$g624$.currentBinding(var3);
        try {
            module0018.$g624$.bind((SubLObject)module0464.NIL, var3);
            var4 = module0234.f15436(var1, var2);
        }
        finally {
            module0018.$g624$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f31486(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0464.UNPROVIDED) {
            var3 = (SubLObject)module0464.NIL;
        }
        final SubLObject var4 = module0351.f23578(module0464.$ic22$, (SubLObject)ConsesLow.list(var1, var2));
        final SubLObject var5 = (module0464.NIL != var3) ? module0205.f13338(var4) : var4;
        final SubLObject var6 = module0191.f11990((SubLObject)module0464.$ic8$, var5, module0464.$g3663$.getGlobalValue(), (SubLObject)module0464.$ic6$);
        return var6;
    }
    
    public static SubLObject f31487(final SubLObject var12) {
        return f31485(module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED), module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED));
    }
    
    public static SubLObject f31488(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (var15.equal(var16)) {
            return module0464.$g3664$.getDynamicValue(var14);
        }
        return (SubLObject)module0464.ZERO_INTEGER;
    }
    
    public static SubLObject f31489(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (var14.equal(var15)) {
            final SubLObject var16 = f31486(var14, var15, (SubLObject)module0464.UNPROVIDED);
            module0347.f23330(var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31490(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        SubLObject var17 = (SubLObject)module0464.NIL;
        final SubLObject var18 = module0018.$g624$.currentBinding(var14);
        try {
            module0018.$g624$.bind((SubLObject)module0464.NIL, var14);
            var17 = module0235.f15474(var15, var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        }
        finally {
            module0018.$g624$.rebind(var18, var14);
        }
        if (module0464.NIL != var17) {
            final SubLObject var19 = module0233.f15361(var17, var15);
            final SubLObject var20 = module0233.f15361(var17, var16);
            if (module0464.NIL != module0193.f12105(var19) && module0464.NIL != module0193.f12105(var20)) {
                return (SubLObject)module0464.T;
            }
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31491(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var17 = module0018.$g624$.currentBinding(var14);
        try {
            module0018.$g624$.bind((SubLObject)module0464.NIL, var14);
            var14.resetMultipleValues();
            final SubLObject var18 = module0235.f15474(var15, var16, (SubLObject)module0464.T, (SubLObject)module0464.T);
            final SubLObject var19 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (module0464.NIL != var18) {
                final SubLObject var20 = module0233.f15361(var18, var15);
                final SubLObject var21 = module0233.f15361(var18, var16);
                final SubLObject var22 = f31486(var20, var21, (SubLObject)module0464.UNPROVIDED);
                module0347.f23330(var22, var18, var19);
            }
        }
        finally {
            module0018.$g624$.rebind(var17, var14);
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31492(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (var15.equal(var16)) {
            return (SubLObject)module0464.ZERO_INTEGER;
        }
        return module0464.$g3666$.getDynamicValue(var14);
    }
    
    public static SubLObject f31493(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (!var14.equal(var15)) {
            final SubLObject var16 = f31486(var14, var15, (SubLObject)module0464.T);
            module0347.f23330(var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31494(final SubLObject var28, final SubLObject var29, SubLObject var3) {
        if (var3 == module0464.UNPROVIDED) {
            var3 = (SubLObject)module0464.NIL;
        }
        final SubLObject var30 = module0351.f23578(module0464.$ic35$, (SubLObject)ConsesLow.list(var28, var29));
        final SubLObject var31 = (module0464.NIL != var3) ? module0205.f13338(var30) : var30;
        final SubLObject var32 = module0191.f11990((SubLObject)module0464.$ic38$, var31, module0464.$g3667$.getGlobalValue(), (SubLObject)module0464.$ic6$);
        return var32;
    }
    
    public static SubLObject f31495(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (module0464.NIL != Strings.string_equal(var15, var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED)) {
            return module0464.$g3668$.getDynamicValue(var14);
        }
        return (SubLObject)module0464.ZERO_INTEGER;
    }
    
    public static SubLObject f31496(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (module0464.NIL != Strings.string_equal(var14, var15, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED)) {
            final SubLObject var16 = f31494(var14, var15, (SubLObject)module0464.UNPROVIDED);
            module0347.f23330(var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31497(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (module0464.NIL != Strings.string_equal(var15, var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED)) {
            return (SubLObject)module0464.ZERO_INTEGER;
        }
        return module0464.$g3669$.getDynamicValue(var14);
    }
    
    public static SubLObject f31498(final SubLObject var12, SubLObject var13) {
        if (var13 == module0464.UNPROVIDED) {
            var13 = (SubLObject)module0464.NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)module0464.UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)module0464.UNPROVIDED);
        if (module0464.NIL == Strings.string_equal(var14, var15, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED)) {
            final SubLObject var16 = f31494(var14, var15, (SubLObject)module0464.T);
            module0347.f23330(var16, (SubLObject)module0464.UNPROVIDED, (SubLObject)module0464.UNPROVIDED);
        }
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31499() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31475", "S#34790", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31476", "S#34791", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31477", "S#34792", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31478", "S#34793", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31479", "S#34794", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31480", "S#34795", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31481", "S#34796", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31482", "S#34797", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31483", "S#34798", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31484", "S#34799", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31485", "S#34800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31486", "S#34801", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31487", "S#34802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31488", "S#34803", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31489", "S#34804", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31490", "S#34805", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31491", "S#34806", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31492", "S#34807", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31493", "S#34808", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31494", "S#34809", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31495", "S#34810", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31496", "S#34811", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31497", "S#34812", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0464", "f31498", "S#34813", 1, 1, false);
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31500() {
        module0464.$g3657$ = SubLFiles.defparameter("S#34814", module0018.$g658$.getDynamicValue());
        module0464.$g3658$ = SubLFiles.defparameter("S#34815", (SubLObject)module0464.ONE_INTEGER);
        module0464.$g3659$ = SubLFiles.defparameter("S#34816", (SubLObject)module0464.ONE_INTEGER);
        module0464.$g3660$ = SubLFiles.defparameter("S#34817", module0018.$g658$.getDynamicValue());
        module0464.$g3661$ = SubLFiles.defparameter("S#34818", (SubLObject)module0464.ONE_INTEGER);
        module0464.$g3662$ = SubLFiles.defparameter("S#34819", (SubLObject)module0464.$ic19$);
        module0464.$g3663$ = SubLFiles.deflexical("S#34820", (module0464.NIL != Symbols.boundp((SubLObject)module0464.$ic25$)) ? module0464.$g3663$.getGlobalValue() : module0464.$ic26$);
        module0464.$g3664$ = SubLFiles.defparameter("S#34821", module0018.$g658$.getDynamicValue());
        module0464.$g3665$ = SubLFiles.defparameter("S#34822", module0018.$g658$.getDynamicValue());
        module0464.$g3666$ = SubLFiles.defparameter("S#34823", module0018.$g658$.getDynamicValue());
        module0464.$g3667$ = SubLFiles.deflexical("S#34824", (module0464.NIL != Symbols.boundp((SubLObject)module0464.$ic37$)) ? module0464.$g3667$.getGlobalValue() : module0464.$ic26$);
        module0464.$g3668$ = SubLFiles.defparameter("S#34825", module0018.$g658$.getDynamicValue());
        module0464.$g3669$ = SubLFiles.defparameter("S#34826", module0018.$g658$.getDynamicValue());
        return (SubLObject)module0464.NIL;
    }
    
    public static SubLObject f31501() {
        module0340.f22938(module0464.$ic0$);
        module0340.f22946(module0464.$ic0$, (SubLObject)module0464.$ic1$);
        module0340.f22946(module0464.$ic0$, (SubLObject)module0464.$ic2$);
        module0340.f22947(module0464.$ic0$, (SubLObject)module0464.$ic3$);
        module0358.f23774((SubLObject)module0464.$ic4$, module0464.$ic0$);
        module0358.f23773((SubLObject)module0464.$ic5$, module0464.$ic0$);
        module0340.f22941((SubLObject)module0464.$ic9$, (SubLObject)module0464.$ic10$);
        module0340.f22941((SubLObject)module0464.$ic11$, (SubLObject)module0464.$ic12$);
        module0340.f22941((SubLObject)module0464.$ic13$, (SubLObject)module0464.$ic14$);
        module0340.f22941((SubLObject)module0464.$ic15$, (SubLObject)module0464.$ic16$);
        module0340.f22941((SubLObject)module0464.$ic17$, (SubLObject)module0464.$ic18$);
        module0340.f22941((SubLObject)module0464.$ic20$, (SubLObject)module0464.$ic21$);
        module0340.f22938(module0464.$ic22$);
        module0340.f22947(module0464.$ic22$, (SubLObject)module0464.$ic3$);
        module0358.f23774((SubLObject)module0464.$ic4$, module0464.$ic22$);
        module0358.f23773((SubLObject)module0464.$ic5$, module0464.$ic22$);
        module0358.f23730((SubLObject)module0464.$ic23$, (SubLObject)module0464.$ic24$);
        module0003.f57((SubLObject)module0464.$ic25$);
        module0132.f8593((SubLObject)module0464.$ic25$, module0464.$ic22$);
        module0340.f22941((SubLObject)module0464.$ic27$, (SubLObject)module0464.$ic28$);
        module0340.f22941((SubLObject)module0464.$ic29$, (SubLObject)module0464.$ic30$);
        module0340.f22941((SubLObject)module0464.$ic31$, (SubLObject)module0464.$ic32$);
        module0340.f22941((SubLObject)module0464.$ic33$, (SubLObject)module0464.$ic34$);
        module0340.f22938(module0464.$ic35$);
        module0358.f23773((SubLObject)module0464.$ic36$, module0464.$ic35$);
        module0003.f57((SubLObject)module0464.$ic37$);
        module0132.f8593((SubLObject)module0464.$ic37$, module0464.$ic35$);
        module0340.f22941((SubLObject)module0464.$ic39$, (SubLObject)module0464.$ic40$);
        module0340.f22941((SubLObject)module0464.$ic41$, (SubLObject)module0464.$ic42$);
        return (SubLObject)module0464.NIL;
    }
    
    public void declareFunctions() {
        f31499();
    }
    
    public void initializeVariables() {
        f31500();
    }
    
    public void runTopLevelForms() {
        f31501();
    }
    
    static {
        me = (SubLFile)new module0464();
        module0464.$g3657$ = null;
        module0464.$g3658$ = null;
        module0464.$g3659$ = null;
        module0464.$g3660$ = null;
        module0464.$g3661$ = null;
        module0464.$g3662$ = null;
        module0464.$g3663$ = null;
        module0464.$g3664$ = null;
        module0464.$g3665$ = null;
        module0464.$g3666$ = null;
        module0464.$g3667$ = null;
        module0464.$g3668$ = null;
        module0464.$g3669$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic1$ = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $ic2$ = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $ic3$ = SubLObjectFactory.makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $ic4$ = SubLObjectFactory.makeKeyword("POS");
        $ic5$ = SubLObjectFactory.makeKeyword("NEG");
        $ic6$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic7$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic8$ = SubLObjectFactory.makeKeyword("EQUALITY");
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-EQUALS-FORT-CHECK");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34814", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34791", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equals <fort> <fully-bound>))\n    (#$equals <fully-bound> <fort>)\n    via unification and #$equals assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equals #$Dog #$Dog)\n    (#$equals (#$JuvenileFn #$Dog)(#$JuvenileFn #$Dog))") });
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-EQUALS");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34815", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34792", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equals <fort> <not fully-bound>)\n    (#$equals <not fully-bound> <fort>)\n    via unification and #$equals assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equals #$Dog ?WHAT)") });
        $ic13$ = SubLObjectFactory.makeKeyword("REMOVAL-UNIFY");
        $ic14$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#34793", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34816", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34794", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equals <non-fort> <non-fort>)\n    by unifying ARG1 and ARG2 and using #$equals assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equals 212 212)\n    (#$equals 212 ?TERM)\n    (#$equals (#$YearFn 2000) (#$YearFn 2000))\n    (#$equals (#$YearFn 2000) (#$YearFn ?YEAR))\n    (#$equals (?FUNC 2000) (#$YearFn ?YEAR))") });
        $ic15$ = SubLObjectFactory.makeKeyword("REMOVAL-UNIQUE-NAMES");
        $ic16$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34795", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34796", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$equals <constant> <constant>))\n    by checking for unification failure"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$equals #$Dog #$Person))") });
        $ic17$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-EQUALS");
        $ic18$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26090", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26090", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34797", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34798", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$equals <atomic term> <atomic term>))\n    where either ARG1 or ARG2 is not a <constant-p>\n    by checking for unification failure"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$equals #$Dog \"Dog\"))\n    (#$not (#$equals 1 2))") });
        $ic19$ = (SubLFloat)SubLObjectFactory.makeDouble(1.1);
        $ic20$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-EQUALS-NON-ATOMIC");
        $ic21$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26090", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26090", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34799", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34798", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$equals <fully-bound term> <fully-bound term>))\n    where either ARG1 or ARG2 is not a <constant-p> or <atomic term>\n    by checking for unification failure"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$equals #$Dog (#$JuvenileFn \"Dog\")))\n    (#$not (#$equals (#$JuvenileFn \"Dog\") (#$JuvenileFn #$Dog)))") });
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $ic23$ = SubLObjectFactory.makeKeyword("EQUAL-SYMBOLS-DELAY-POS");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#34820", "CYC");
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic27$ = SubLObjectFactory.makeKeyword("REMOVAL-EQUAL-SYMBOLS-REJECT");
        $ic28$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#34802", "CYC"))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0464.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equalSymbols <whatever> <whatever>)\n    where unification between ARG1 and ARG2 is provably doomed to fail"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equalSymbols (#$JuvenileFn ?DOG) (#$MaleFn ?DOG))") });
        $ic29$ = SubLObjectFactory.makeKeyword("REMOVAL-EQUAL-SYMBOLS-CHECK");
        $ic30$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34803", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34804", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equalSymbols <fully bound> <fully bound>) using EQUAL"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equalSymbols #$Dog #$Dog)\n    (#$equalSymbols 3 3)") });
        $ic31$ = SubLObjectFactory.makeKeyword("REMOVAL-EQUAL-SYMBOLS-UNIFY");
        $ic32$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#34805", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34822", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34806", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equalSymbols <whatever> <not fully bound>)\n    (#$equalSymbols <not fully bound> <whatever>)\n    using unification, but no #$equals assertions."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equalSymbols 212 ?WHAT)\n    (#$equalSymbols #$Dog ?WHAT)\n    (#$equalSymbols (#$YearFn ?YEAR)(?FUNC 2003))") });
        $ic33$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-EQUAL-SYMBOLS");
        $ic34$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34807", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34808", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$equalSymbols <fully bound> <fully bound>))\n    using failure of EQUAL"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$equalSymbols #$Pi-Number 3.14159))") });
        $ic35$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalStrings-CaseInsensitive"));
        $ic36$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic37$ = SubLObjectFactory.makeSymbol("S#34824", "CYC");
        $ic38$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic39$ = SubLObjectFactory.makeKeyword("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK");
        $ic40$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalStrings-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalStrings-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34810", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34811", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$equalStrings-CaseInsensitive <string> <string>)\n    using STRING-EQUAL"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$equalStrings-CaseInsensitive \"DOG\" \"Dog\")") });
        $ic41$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE");
        $ic42$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalStrings-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalStrings-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34812", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34813", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$equalStrings-CaseInsensitive <string> <string>))\n    using failure of STRING-EQUAL"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$equalStrings-CaseInsensitive \"DOGG\" \"Dog\"))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0464.class
	Total time: 193 ms
	
	Decompiled with Procyon 0.5.32.
*/