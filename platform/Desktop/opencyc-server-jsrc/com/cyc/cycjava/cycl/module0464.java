package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = Equality.equal(var1, var2);
        final SubLObject var6 = (SubLObject)makeBoolean(NIL != var5 || NIL != module0331.f22376(var1, var2));
        final SubLObject var7 = (SubLObject)((NIL != var5) ? $ic6$ : $ic7$);
        final SubLObject var8 = (NIL != var3) ? module0147.$g2095$.getDynamicValue(var4) : ((NIL != var6) ? module0132.$g1562$.getGlobalValue() : module0147.$g2095$.getDynamicValue(var4));
        final SubLObject var9 = module0351.f23578($ic0$, (SubLObject)ConsesLow.list(var1, var2));
        final SubLObject var10 = (NIL != var3) ? module0205.f13338(var9) : var9;
        final SubLObject var11 = module0191.f11990((SubLObject)$ic8$, var10, var8, var7);
        return var11;
    }
    
    public static SubLObject f31476(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = (NIL != module0173.f10955(var14)) ? var14 : var15;
        final SubLObject var17 = (NIL != module0173.f10955(var14)) ? var15 : var14;
        if (NIL != module0331.f22370(var16, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var18 = f31475(var16, var17, (SubLObject)UNPROVIDED);
            module0347.f23330(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31477(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = (NIL != module0173.f10955(var15)) ? var15 : var16;
        final SubLObject var18 = (NIL != module0173.f10955(var15)) ? var16 : var15;
        SubLObject var20;
        final SubLObject var19 = var20 = module0331.f22369(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            var14.resetMultipleValues();
            final SubLObject var22 = module0235.f15474(var18, var21, (SubLObject)T, (SubLObject)T);
            final SubLObject var23 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var22) {
                final SubLObject var24 = module0233.f15361(var22, var18);
                final SubLObject var25 = f31475(var17, var24, (SubLObject)UNPROVIDED);
                module0347.f23330(var25, var22, var23);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31478(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        var14.resetMultipleValues();
        final SubLObject var17 = module0235.f15474(var15, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var18 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        if (NIL != var17) {
            final SubLObject var19 = module0233.f15361(var17, var15);
            final SubLObject var20 = module0233.f15361(var17, var16);
            if (NIL != module0193.f12105(var19) && NIL != module0193.f12105(var20)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31479(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        var14.resetMultipleValues();
        final SubLObject var17 = module0235.f15474(var15, var16, (SubLObject)T, (SubLObject)T);
        final SubLObject var18 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        if (NIL != var17) {
            final SubLObject var19 = module0233.f15361(var17, var15);
            final SubLObject var20 = module0233.f15361(var17, var16);
            final SubLObject var21 = f31475(var19, var20, (SubLObject)UNPROVIDED);
            module0347.f23330(var21, var17, var18);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31480(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (var15.equal(var16)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return $g3660$.getDynamicValue(var14);
    }
    
    public static SubLObject f31481(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (NIL == module0331.f22385(var14) || NIL == module0331.f22385(var15)) {
            if (NIL != module0331.f22383((SubLObject)ConsesLow.list(var14, var15), (SubLObject)UNPROVIDED)) {
                final SubLObject var16 = f31475(var14, var15, (SubLObject)T);
                module0347.f23330(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else if (NIL == module0331.f22370(var14, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var16 = f31475(var14, var15, (SubLObject)T);
            module0347.f23330(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31482(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (var15.equal(var16)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return $g3661$.getDynamicValue(var14);
    }
    
    public static SubLObject f31483(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (NIL == module0331.f22385(var14) || NIL == module0331.f22385(var15)) {
            if (NIL != module0331.f22383((SubLObject)ConsesLow.list(var14, var15), (SubLObject)UNPROVIDED)) {
                final SubLObject var16 = f31475(var14, var15, (SubLObject)T);
                module0347.f23330(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else if (NIL == module0235.f15474(var14, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var16 = f31475(var14, var15, (SubLObject)T);
            module0347.f23330(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31484(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (var15.equal(var16)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return $g3662$.getDynamicValue(var14);
    }
    
    public static SubLObject f31485(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0018.$g624$.currentBinding(var3);
        try {
            module0018.$g624$.bind((SubLObject)NIL, var3);
            var4 = module0234.f15436(var1, var2);
        }
        finally {
            module0018.$g624$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f31486(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var4 = module0351.f23578($ic22$, (SubLObject)ConsesLow.list(var1, var2));
        final SubLObject var5 = (NIL != var3) ? module0205.f13338(var4) : var4;
        final SubLObject var6 = module0191.f11990((SubLObject)$ic8$, var5, $g3663$.getGlobalValue(), (SubLObject)$ic6$);
        return var6;
    }
    
    public static SubLObject f31487(final SubLObject var12) {
        return f31485(module0205.f13387(var12, (SubLObject)UNPROVIDED), module0205.f13388(var12, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31488(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (var15.equal(var16)) {
            return $g3664$.getDynamicValue(var14);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f31489(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (var14.equal(var15)) {
            final SubLObject var16 = f31486(var14, var15, (SubLObject)UNPROVIDED);
            module0347.f23330(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31490(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = module0018.$g624$.currentBinding(var14);
        try {
            module0018.$g624$.bind((SubLObject)NIL, var14);
            var17 = module0235.f15474(var15, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0018.$g624$.rebind(var18, var14);
        }
        if (NIL != var17) {
            final SubLObject var19 = module0233.f15361(var17, var15);
            final SubLObject var20 = module0233.f15361(var17, var16);
            if (NIL != module0193.f12105(var19) && NIL != module0193.f12105(var20)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31491(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0018.$g624$.currentBinding(var14);
        try {
            module0018.$g624$.bind((SubLObject)NIL, var14);
            var14.resetMultipleValues();
            final SubLObject var18 = module0235.f15474(var15, var16, (SubLObject)T, (SubLObject)T);
            final SubLObject var19 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var18) {
                final SubLObject var20 = module0233.f15361(var18, var15);
                final SubLObject var21 = module0233.f15361(var18, var16);
                final SubLObject var22 = f31486(var20, var21, (SubLObject)UNPROVIDED);
                module0347.f23330(var22, var18, var19);
            }
        }
        finally {
            module0018.$g624$.rebind(var17, var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31492(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (var15.equal(var16)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return $g3666$.getDynamicValue(var14);
    }
    
    public static SubLObject f31493(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (!var14.equal(var15)) {
            final SubLObject var16 = f31486(var14, var15, (SubLObject)T);
            module0347.f23330(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31494(final SubLObject var28, final SubLObject var29, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var30 = module0351.f23578($ic35$, (SubLObject)ConsesLow.list(var28, var29));
        final SubLObject var31 = (NIL != var3) ? module0205.f13338(var30) : var30;
        final SubLObject var32 = module0191.f11990((SubLObject)$ic38$, var31, $g3667$.getGlobalValue(), (SubLObject)$ic6$);
        return var32;
    }
    
    public static SubLObject f31495(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (NIL != Strings.string_equal(var15, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return $g3668$.getDynamicValue(var14);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f31496(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (NIL != Strings.string_equal(var14, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var16 = f31494(var14, var15, (SubLObject)UNPROVIDED);
            module0347.f23330(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31497(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (NIL != Strings.string_equal(var15, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return $g3669$.getDynamicValue(var14);
    }
    
    public static SubLObject f31498(final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13387(var12, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var12, (SubLObject)UNPROVIDED);
        if (NIL == Strings.string_equal(var14, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var16 = f31494(var14, var15, (SubLObject)T);
            module0347.f23330(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31500() {
        $g3657$ = SubLFiles.defparameter("S#34814", module0018.$g658$.getDynamicValue());
        $g3658$ = SubLFiles.defparameter("S#34815", (SubLObject)ONE_INTEGER);
        $g3659$ = SubLFiles.defparameter("S#34816", (SubLObject)ONE_INTEGER);
        $g3660$ = SubLFiles.defparameter("S#34817", module0018.$g658$.getDynamicValue());
        $g3661$ = SubLFiles.defparameter("S#34818", (SubLObject)ONE_INTEGER);
        $g3662$ = SubLFiles.defparameter("S#34819", (SubLObject)$ic19$);
        $g3663$ = SubLFiles.deflexical("S#34820", (NIL != Symbols.boundp((SubLObject)$ic25$)) ? $g3663$.getGlobalValue() : $ic26$);
        $g3664$ = SubLFiles.defparameter("S#34821", module0018.$g658$.getDynamicValue());
        $g3665$ = SubLFiles.defparameter("S#34822", module0018.$g658$.getDynamicValue());
        $g3666$ = SubLFiles.defparameter("S#34823", module0018.$g658$.getDynamicValue());
        $g3667$ = SubLFiles.deflexical("S#34824", (NIL != Symbols.boundp((SubLObject)$ic37$)) ? $g3667$.getGlobalValue() : $ic26$);
        $g3668$ = SubLFiles.defparameter("S#34825", module0018.$g658$.getDynamicValue());
        $g3669$ = SubLFiles.defparameter("S#34826", module0018.$g658$.getDynamicValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31501() {
        module0340.f22938($ic0$);
        module0340.f22946($ic0$, (SubLObject)$ic1$);
        module0340.f22946($ic0$, (SubLObject)$ic2$);
        module0340.f22947($ic0$, (SubLObject)$ic3$);
        module0358.f23774((SubLObject)$ic4$, $ic0$);
        module0358.f23773((SubLObject)$ic5$, $ic0$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22941((SubLObject)$ic13$, (SubLObject)$ic14$);
        module0340.f22941((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0340.f22941((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0340.f22938($ic22$);
        module0340.f22947($ic22$, (SubLObject)$ic3$);
        module0358.f23774((SubLObject)$ic4$, $ic22$);
        module0358.f23773((SubLObject)$ic5$, $ic22$);
        module0358.f23730((SubLObject)$ic23$, (SubLObject)$ic24$);
        module0003.f57((SubLObject)$ic25$);
        module0132.f8593((SubLObject)$ic25$, $ic22$);
        module0340.f22941((SubLObject)$ic27$, (SubLObject)$ic28$);
        module0340.f22941((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0340.f22941((SubLObject)$ic31$, (SubLObject)$ic32$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0340.f22938($ic35$);
        module0358.f23773((SubLObject)$ic36$, $ic35$);
        module0003.f57((SubLObject)$ic37$);
        module0132.f8593((SubLObject)$ic37$, $ic35$);
        module0340.f22941((SubLObject)$ic39$, (SubLObject)$ic40$);
        module0340.f22941((SubLObject)$ic41$, (SubLObject)$ic42$);
        return (SubLObject)NIL;
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
        $g3657$ = null;
        $g3658$ = null;
        $g3659$ = null;
        $g3660$ = null;
        $g3661$ = null;
        $g3662$ = null;
        $g3663$ = null;
        $g3664$ = null;
        $g3665$ = null;
        $g3666$ = null;
        $g3667$ = null;
        $g3668$ = null;
        $g3669$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic1$ = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $ic2$ = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $ic3$ = makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $ic4$ = makeKeyword("POS");
        $ic5$ = makeKeyword("NEG");
        $ic6$ = makeKeyword("TRUE-MON");
        $ic7$ = makeKeyword("TRUE-DEF");
        $ic8$ = makeKeyword("EQUALITY");
        $ic9$ = makeKeyword("REMOVAL-EQUALS-FORT-CHECK");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equals")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34814", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34791", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fort> <fully-bound>))\n    (#$equals <fully-bound> <fort>)\n    via unification and #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals #$Dog #$Dog)\n    (#$equals (#$JuvenileFn #$Dog)(#$JuvenileFn #$Dog))") });
        $ic11$ = makeKeyword("REMOVAL-ALL-EQUALS");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equals")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34815", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34792", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fort> <not fully-bound>)\n    (#$equals <not fully-bound> <fort>)\n    via unification and #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals #$Dog ?WHAT)") });
        $ic13$ = makeKeyword("REMOVAL-UNIFY");
        $ic14$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equals")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("REQUIRED"), makeSymbol("S#34793", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34816", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34794", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <non-fort> <non-fort>)\n    by unifying ARG1 and ARG2 and using #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals 212 212)\n    (#$equals 212 ?TERM)\n    (#$equals (#$YearFn 2000) (#$YearFn 2000))\n    (#$equals (#$YearFn 2000) (#$YearFn ?YEAR))\n    (#$equals (?FUNC 2000) (#$YearFn ?YEAR))") });
        $ic15$ = makeKeyword("REMOVAL-UNIQUE-NAMES");
        $ic16$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equals")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("CONSTANT")), makeKeyword("COST"), makeSymbol("S#34795", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34796", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <constant> <constant>))\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog #$Person))") });
        $ic17$ = makeKeyword("REMOVAL-NOT-EQUALS");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equals")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26090", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26090", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("CONSTANT")))), makeKeyword("COST"), makeSymbol("S#34797", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34798", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <atomic term> <atomic term>))\n    where either ARG1 or ARG2 is not a <constant-p>\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog \"Dog\"))\n    (#$not (#$equals 1 2))") });
        $ic19$ = (SubLFloat)makeDouble(1.1);
        $ic20$ = makeKeyword("REMOVAL-NOT-EQUALS-NON-ATOMIC");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equals")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26090", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26090", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeKeyword("CONSTANT"), (SubLObject)makeKeyword("CONSTANT")))), makeKeyword("COST"), makeSymbol("S#34799", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34798", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <fully-bound term> <fully-bound term>))\n    where either ARG1 or ARG2 is not a <constant-p> or <atomic term>\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog (#$JuvenileFn \"Dog\")))\n    (#$not (#$equals (#$JuvenileFn \"Dog\") (#$JuvenileFn #$Dog)))") });
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("equalSymbols"));
        $ic23$ = makeKeyword("EQUAL-SYMBOLS-DELAY-POS");
        $ic24$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISALLOWED"));
        $ic25$ = makeSymbol("S#34820", "CYC");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic27$ = makeKeyword("REMOVAL-EQUAL-SYMBOLS-REJECT");
        $ic28$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#34802", "CYC"))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <whatever> <whatever>)\n    where unification between ARG1 and ARG2 is provably doomed to fail"), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols (#$JuvenileFn ?DOG) (#$MaleFn ?DOG))") });
        $ic29$ = makeKeyword("REMOVAL-EQUAL-SYMBOLS-CHECK");
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34803", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34804", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <fully bound> <fully bound>) using EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols #$Dog #$Dog)\n    (#$equalSymbols 3 3)") });
        $ic31$ = makeKeyword("REMOVAL-EQUAL-SYMBOLS-UNIFY");
        $ic32$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("REQUIRED"), makeSymbol("S#34805", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34822", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34806", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <whatever> <not fully bound>)\n    (#$equalSymbols <not fully bound> <whatever>)\n    using unification, but no #$equals assertions."), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols 212 ?WHAT)\n    (#$equalSymbols #$Dog ?WHAT)\n    (#$equalSymbols (#$YearFn ?YEAR)(?FUNC 2003))") });
        $ic33$ = makeKeyword("REMOVAL-NOT-EQUAL-SYMBOLS");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34807", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34808", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equalSymbols <fully bound> <fully bound>))\n    using failure of EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equalSymbols #$Pi-Number 3.14159))") });
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("equalStrings-CaseInsensitive"));
        $ic36$ = makeKeyword("BOTH");
        $ic37$ = makeSymbol("S#34824", "CYC");
        $ic38$ = makeKeyword("OPAQUE");
        $ic39$ = makeKeyword("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equalStrings-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equalStrings-CaseInsensitive")), (SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("S#34810", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34811", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$equalStrings-CaseInsensitive <string> <string>)\n    using STRING-EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$equalStrings-CaseInsensitive \"DOG\" \"Dog\")") });
        $ic41$ = makeKeyword("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE");
        $ic42$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("equalStrings-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equalStrings-CaseInsensitive")), (SubLObject)makeKeyword("STRING"), (SubLObject)makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("S#34812", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34813", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equalStrings-CaseInsensitive <string> <string>))\n    using failure of STRING-EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equalStrings-CaseInsensitive \"DOGG\" \"Dog\"))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 193 ms
	
	Decompiled with Procyon 0.5.32.
*/