package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0350 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0350";
    public static final String myFingerPrint = "5cd9e11cadf73a873ec802717111e04ae981464f3cd7e5b0bfa130d2d9984fb8";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    
    public static SubLObject f23509(final SubLObject var1) {
        return module0226.f14842(var1, (SubLObject)module0350.UNPROVIDED);
    }
    
    public static SubLObject f23510(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)module0350.NIL;
        if (module0350.NIL == var3) {
            return f23509(var1);
        }
        var4 = module0034.f1857(var3, (SubLObject)module0350.$ic0$, (SubLObject)module0350.UNPROVIDED);
        if (module0350.NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)module0350.$ic0$, (SubLObject)module0350.ONE_INTEGER, (SubLObject)module0350.NIL, (SubLObject)module0350.EQL, (SubLObject)module0350.UNPROVIDED);
            module0034.f1860(var3, (SubLObject)module0350.$ic0$, var4);
        }
        SubLObject var5 = module0034.f1814(var4, var1, (SubLObject)module0350.$ic1$);
        if (var5 == module0350.$ic1$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23509(var1)));
            module0034.f1816(var4, var1, var5, (SubLObject)module0350.UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f23511(final SubLObject var1, final SubLObject var6) {
        return module0035.sublisp_boolean(f23512(var1, var6));
    }
    
    public static SubLObject f23512(final SubLObject var1, SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var8 = (SubLObject)module0350.NIL;
        final SubLObject var9 = module0147.f9540(var6);
        final SubLObject var10 = module0147.$g2095$.currentBinding(var7);
        final SubLObject var11 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var12 = module0147.$g2096$.currentBinding(var7);
        try {
            module0147.$g2095$.bind(module0147.f9545(var9), var7);
            module0147.$g2094$.bind(module0147.f9546(var9), var7);
            module0147.$g2096$.bind(module0147.f9549(var9), var7);
            var8 = module0226.f14844(var1, (SubLObject)module0350.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var12, var7);
            module0147.$g2094$.rebind(var11, var7);
            module0147.$g2095$.rebind(var10, var7);
        }
        return var8;
    }
    
    public static SubLObject f23514(final SubLObject var1, final SubLObject var12, final SubLObject var13, final SubLObject var6) {
        return module0035.sublisp_boolean(f23515(var1, var12, var13, var6));
    }
    
    public static SubLObject f23515(final SubLObject var1, final SubLObject var12, final SubLObject var13, final SubLObject var6) {
        return f23516(var1, var12, var13, var6).first();
    }
    
    public static SubLObject f23517(final SubLObject var1, final SubLObject var12, final SubLObject var13, SubLObject var6) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var15 = (SubLObject)module0350.NIL;
        final SubLObject var17;
        final SubLObject var16 = var17 = f23512(var1, var6);
        if (module0350.NIL != var17) {
            var15 = (SubLObject)ConsesLow.cons(var17, var15);
        }
        final SubLObject var18 = module0147.f9540(var6);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var14);
        final SubLObject var20 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var21 = module0147.$g2096$.currentBinding(var14);
        try {
            module0147.$g2095$.bind(module0147.f9545(var18), var14);
            module0147.$g2094$.bind(module0147.f9546(var18), var14);
            module0147.$g2096$.bind(module0147.f9549(var18), var14);
            final SubLObject var23;
            final SubLObject var22 = var23 = module0226.f14846(var1, var12, var13, (SubLObject)module0350.UNPROVIDED);
            if (module0350.NIL != var23) {
                var15 = (SubLObject)ConsesLow.cons(var23, var15);
            }
        }
        finally {
            module0147.$g2096$.rebind(var21, var14);
            module0147.$g2094$.rebind(var20, var14);
            module0147.$g2095$.rebind(var19, var14);
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f23516(final SubLObject var1, final SubLObject var12, final SubLObject var13, final SubLObject var6) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0034.$g879$.getDynamicValue(var14);
        SubLObject var16 = (SubLObject)module0350.NIL;
        if (module0350.NIL == var15) {
            return f23517(var1, var12, var13, var6);
        }
        var16 = module0034.f1857(var15, (SubLObject)module0350.$ic2$, (SubLObject)module0350.UNPROVIDED);
        if (module0350.NIL == var16) {
            var16 = module0034.f1807(module0034.f1842(var15), (SubLObject)module0350.$ic2$, (SubLObject)module0350.FOUR_INTEGER, (SubLObject)module0350.NIL, (SubLObject)module0350.EQL, (SubLObject)module0350.UNPROVIDED);
            module0034.f1860(var15, (SubLObject)module0350.$ic2$, var16);
        }
        final SubLObject var17 = module0034.f1780(var1, var12, var13, var6);
        final SubLObject var18 = module0034.f1814(var16, var17, (SubLObject)module0350.UNPROVIDED);
        if (var18 != module0350.$ic1$) {
            SubLObject var19 = var18;
            SubLObject var20 = (SubLObject)module0350.NIL;
            var20 = var19.first();
            while (module0350.NIL != var19) {
                SubLObject var21 = var20.first();
                final SubLObject var22 = conses_high.second(var20);
                if (var1.eql(var21.first())) {
                    var21 = var21.rest();
                    if (var12.eql(var21.first())) {
                        var21 = var21.rest();
                        if (var13.eql(var21.first())) {
                            var21 = var21.rest();
                            if (module0350.NIL != var21 && module0350.NIL == var21.rest() && var6.eql(var21.first())) {
                                return module0034.f1959(var22);
                            }
                        }
                    }
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        final SubLObject var23 = Values.arg2(var14.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23517(var1, var12, var13, var6)));
        module0034.f1836(var16, var17, var18, var23, (SubLObject)ConsesLow.list(var1, var12, var13, var6));
        return module0034.f1959(var23);
    }
    
    public static SubLObject f23518(final SubLObject var1, final SubLObject var6) {
        return module0035.sublisp_boolean(f23519(var1, var6));
    }
    
    public static SubLObject f23519(final SubLObject var1, final SubLObject var6) {
        return f23520(var1, var6).first();
    }
    
    public static SubLObject f23521(final SubLObject var1, SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var8 = (SubLObject)module0350.NIL;
        final SubLObject var10;
        final SubLObject var9 = var10 = f23512(var1, var6);
        if (module0350.NIL != var10) {
            var8 = (SubLObject)ConsesLow.cons(var10, var8);
        }
        final SubLObject var11 = module0147.f9540(var6);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var7);
        final SubLObject var13 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var14 = module0147.$g2096$.currentBinding(var7);
        try {
            module0147.$g2095$.bind(module0147.f9545(var11), var7);
            module0147.$g2094$.bind(module0147.f9546(var11), var7);
            module0147.$g2096$.bind(module0147.f9549(var11), var7);
            final SubLObject var16;
            final SubLObject var15 = var16 = module0226.f14848(var1, (SubLObject)module0350.UNPROVIDED);
            if (module0350.NIL != var16) {
                var8 = (SubLObject)ConsesLow.cons(var16, var8);
            }
        }
        finally {
            module0147.$g2096$.rebind(var14, var7);
            module0147.$g2094$.rebind(var13, var7);
            module0147.$g2095$.rebind(var12, var7);
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f23520(final SubLObject var1, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0034.$g879$.getDynamicValue(var7);
        SubLObject var9 = (SubLObject)module0350.NIL;
        if (module0350.NIL == var8) {
            return f23521(var1, var6);
        }
        var9 = module0034.f1857(var8, (SubLObject)module0350.$ic3$, (SubLObject)module0350.UNPROVIDED);
        if (module0350.NIL == var9) {
            var9 = module0034.f1807(module0034.f1842(var8), (SubLObject)module0350.$ic3$, (SubLObject)module0350.TWO_INTEGER, (SubLObject)module0350.NIL, (SubLObject)module0350.EQL, (SubLObject)module0350.UNPROVIDED);
            module0034.f1860(var8, (SubLObject)module0350.$ic3$, var9);
        }
        final SubLObject var10 = module0034.f1782(var1, var6);
        final SubLObject var11 = module0034.f1814(var9, var10, (SubLObject)module0350.UNPROVIDED);
        if (var11 != module0350.$ic1$) {
            SubLObject var12 = var11;
            SubLObject var13 = (SubLObject)module0350.NIL;
            var13 = var12.first();
            while (module0350.NIL != var12) {
                SubLObject var14 = var13.first();
                final SubLObject var15 = conses_high.second(var13);
                if (var1.eql(var14.first())) {
                    var14 = var14.rest();
                    if (module0350.NIL != var14 && module0350.NIL == var14.rest() && var6.eql(var14.first())) {
                        return module0034.f1959(var15);
                    }
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        final SubLObject var16 = Values.arg2(var7.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23521(var1, var6)));
        module0034.f1836(var9, var10, var11, var16, (SubLObject)ConsesLow.list(var1, var6));
        return module0034.f1959(var16);
    }
    
    public static SubLObject f23522(final SubLObject var1, final SubLObject var6) {
        return module0035.sublisp_boolean(f23523(var1, var6));
    }
    
    public static SubLObject f23523(final SubLObject var1, final SubLObject var6) {
        return f23524(var1, var6).first();
    }
    
    public static SubLObject f23525(final SubLObject var1, SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var8 = (SubLObject)module0350.NIL;
        SubLObject var10;
        final SubLObject var9 = var10 = f23520(var1, var6);
        SubLObject var11 = (SubLObject)module0350.NIL;
        var11 = var10.first();
        while (module0350.NIL != var10) {
            var8 = (SubLObject)ConsesLow.cons(var11, var8);
            var10 = var10.rest();
            var11 = var10.first();
        }
        final SubLObject var12 = module0147.f9540(var6);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var7);
        final SubLObject var14 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var15 = module0147.$g2096$.currentBinding(var7);
        try {
            module0147.$g2095$.bind(module0147.f9545(var12), var7);
            module0147.$g2094$.bind(module0147.f9546(var12), var7);
            module0147.$g2096$.bind(module0147.f9549(var12), var7);
            final SubLObject var17;
            final SubLObject var16 = var17 = module0226.f14851(var1, (SubLObject)module0350.UNPROVIDED);
            if (module0350.NIL != var17) {
                var8 = (SubLObject)ConsesLow.cons(var17, var8);
            }
        }
        finally {
            module0147.$g2096$.rebind(var15, var7);
            module0147.$g2094$.rebind(var14, var7);
            module0147.$g2095$.rebind(var13, var7);
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f23524(final SubLObject var1, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0034.$g879$.getDynamicValue(var7);
        SubLObject var9 = (SubLObject)module0350.NIL;
        if (module0350.NIL == var8) {
            return f23525(var1, var6);
        }
        var9 = module0034.f1857(var8, (SubLObject)module0350.$ic4$, (SubLObject)module0350.UNPROVIDED);
        if (module0350.NIL == var9) {
            var9 = module0034.f1807(module0034.f1842(var8), (SubLObject)module0350.$ic4$, (SubLObject)module0350.TWO_INTEGER, (SubLObject)module0350.NIL, (SubLObject)module0350.EQL, (SubLObject)module0350.UNPROVIDED);
            module0034.f1860(var8, (SubLObject)module0350.$ic4$, var9);
        }
        final SubLObject var10 = module0034.f1782(var1, var6);
        final SubLObject var11 = module0034.f1814(var9, var10, (SubLObject)module0350.UNPROVIDED);
        if (var11 != module0350.$ic1$) {
            SubLObject var12 = var11;
            SubLObject var13 = (SubLObject)module0350.NIL;
            var13 = var12.first();
            while (module0350.NIL != var12) {
                SubLObject var14 = var13.first();
                final SubLObject var15 = conses_high.second(var13);
                if (var1.eql(var14.first())) {
                    var14 = var14.rest();
                    if (module0350.NIL != var14 && module0350.NIL == var14.rest() && var6.eql(var14.first())) {
                        return module0034.f1959(var15);
                    }
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        final SubLObject var16 = Values.arg2(var7.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23525(var1, var6)));
        module0034.f1836(var9, var10, var11, var16, (SubLObject)ConsesLow.list(var1, var6));
        return module0034.f1959(var16);
    }
    
    public static SubLObject f23526(final SubLObject var1, final SubLObject var13, final SubLObject var6) {
        return module0035.sublisp_boolean(f23527(var1, var13, var6));
    }
    
    public static SubLObject f23527(final SubLObject var1, final SubLObject var13, final SubLObject var6) {
        return f23528(var1, var13, var6).first();
    }
    
    public static SubLObject f23529(final SubLObject var1, final SubLObject var13, SubLObject var6) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var15 = (SubLObject)module0350.NIL;
        SubLObject var17;
        final SubLObject var16 = var17 = f23520(var1, var6);
        SubLObject var18 = (SubLObject)module0350.NIL;
        var18 = var17.first();
        while (module0350.NIL != var17) {
            var15 = (SubLObject)ConsesLow.cons(var18, var15);
            var17 = var17.rest();
            var18 = var17.first();
        }
        final SubLObject var19 = module0147.f9540(var6);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var14);
        final SubLObject var21 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var22 = module0147.$g2096$.currentBinding(var14);
        try {
            module0147.$g2095$.bind(module0147.f9545(var19), var14);
            module0147.$g2094$.bind(module0147.f9546(var19), var14);
            module0147.$g2096$.bind(module0147.f9549(var19), var14);
            final SubLObject var24;
            final SubLObject var23 = var24 = module0226.f14853(var1, var13, (SubLObject)module0350.UNPROVIDED);
            if (module0350.NIL != var24) {
                var15 = (SubLObject)ConsesLow.cons(var24, var15);
            }
        }
        finally {
            module0147.$g2096$.rebind(var22, var14);
            module0147.$g2094$.rebind(var21, var14);
            module0147.$g2095$.rebind(var20, var14);
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f23528(final SubLObject var1, final SubLObject var13, final SubLObject var6) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0034.$g879$.getDynamicValue(var14);
        SubLObject var16 = (SubLObject)module0350.NIL;
        if (module0350.NIL == var15) {
            return f23529(var1, var13, var6);
        }
        var16 = module0034.f1857(var15, (SubLObject)module0350.$ic5$, (SubLObject)module0350.UNPROVIDED);
        if (module0350.NIL == var16) {
            var16 = module0034.f1807(module0034.f1842(var15), (SubLObject)module0350.$ic5$, (SubLObject)module0350.THREE_INTEGER, (SubLObject)module0350.NIL, (SubLObject)module0350.EQL, (SubLObject)module0350.UNPROVIDED);
            module0034.f1860(var15, (SubLObject)module0350.$ic5$, var16);
        }
        final SubLObject var17 = module0034.f1781(var1, var13, var6);
        final SubLObject var18 = module0034.f1814(var16, var17, (SubLObject)module0350.UNPROVIDED);
        if (var18 != module0350.$ic1$) {
            SubLObject var19 = var18;
            SubLObject var20 = (SubLObject)module0350.NIL;
            var20 = var19.first();
            while (module0350.NIL != var19) {
                SubLObject var21 = var20.first();
                final SubLObject var22 = conses_high.second(var20);
                if (var1.eql(var21.first())) {
                    var21 = var21.rest();
                    if (var13.eql(var21.first())) {
                        var21 = var21.rest();
                        if (module0350.NIL != var21 && module0350.NIL == var21.rest() && var6.eql(var21.first())) {
                            return module0034.f1959(var22);
                        }
                    }
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        final SubLObject var23 = Values.arg2(var14.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23529(var1, var13, var6)));
        module0034.f1836(var16, var17, var18, var23, (SubLObject)ConsesLow.list(var1, var13, var6));
        return module0034.f1959(var23);
    }
    
    public static SubLObject f23530(final SubLObject var1, final SubLObject var12, final SubLObject var13, final SubLObject var6) {
        return module0035.sublisp_boolean(f23531(var1, var12, var13, var6));
    }
    
    public static SubLObject f23531(final SubLObject var1, final SubLObject var12, final SubLObject var13, final SubLObject var6) {
        return f23532(var1, var12, var13, var6).first();
    }
    
    public static SubLObject f23533(final SubLObject var1, final SubLObject var12, final SubLObject var13, SubLObject var6) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var15 = (SubLObject)module0350.NIL;
        SubLObject var17;
        SubLObject var16 = var17 = f23516(var1, var12, var13, var6);
        SubLObject var18 = (SubLObject)module0350.NIL;
        var18 = var17.first();
        while (module0350.NIL != var17) {
            var15 = (SubLObject)ConsesLow.cons(var18, var15);
            var17 = var17.rest();
            var18 = var17.first();
        }
        var16 = (var17 = f23528(var1, var13, var6));
        var18 = (SubLObject)module0350.NIL;
        var18 = var17.first();
        while (module0350.NIL != var17) {
            var15 = (SubLObject)ConsesLow.cons(var18, var15);
            var17 = var17.rest();
            var18 = var17.first();
        }
        final SubLObject var19 = module0147.f9540(var6);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var14);
        final SubLObject var21 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var22 = module0147.$g2096$.currentBinding(var14);
        try {
            module0147.$g2095$.bind(module0147.f9545(var19), var14);
            module0147.$g2094$.bind(module0147.f9546(var19), var14);
            module0147.$g2096$.bind(module0147.f9549(var19), var14);
            final SubLObject var24;
            final SubLObject var23 = var24 = module0226.f14855(var1, var12, var13, (SubLObject)module0350.UNPROVIDED);
            if (module0350.NIL != var24) {
                var15 = (SubLObject)ConsesLow.cons(var24, var15);
            }
        }
        finally {
            module0147.$g2096$.rebind(var22, var14);
            module0147.$g2094$.rebind(var21, var14);
            module0147.$g2095$.rebind(var20, var14);
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f23532(final SubLObject var1, final SubLObject var12, final SubLObject var13, final SubLObject var6) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0034.$g879$.getDynamicValue(var14);
        SubLObject var16 = (SubLObject)module0350.NIL;
        if (module0350.NIL == var15) {
            return f23533(var1, var12, var13, var6);
        }
        var16 = module0034.f1857(var15, (SubLObject)module0350.$ic6$, (SubLObject)module0350.UNPROVIDED);
        if (module0350.NIL == var16) {
            var16 = module0034.f1807(module0034.f1842(var15), (SubLObject)module0350.$ic6$, (SubLObject)module0350.FOUR_INTEGER, (SubLObject)module0350.NIL, (SubLObject)module0350.EQL, (SubLObject)module0350.UNPROVIDED);
            module0034.f1860(var15, (SubLObject)module0350.$ic6$, var16);
        }
        final SubLObject var17 = module0034.f1780(var1, var12, var13, var6);
        final SubLObject var18 = module0034.f1814(var16, var17, (SubLObject)module0350.UNPROVIDED);
        if (var18 != module0350.$ic1$) {
            SubLObject var19 = var18;
            SubLObject var20 = (SubLObject)module0350.NIL;
            var20 = var19.first();
            while (module0350.NIL != var19) {
                SubLObject var21 = var20.first();
                final SubLObject var22 = conses_high.second(var20);
                if (var1.eql(var21.first())) {
                    var21 = var21.rest();
                    if (var12.eql(var21.first())) {
                        var21 = var21.rest();
                        if (var13.eql(var21.first())) {
                            var21 = var21.rest();
                            if (module0350.NIL != var21 && module0350.NIL == var21.rest() && var6.eql(var21.first())) {
                                return module0034.f1959(var22);
                            }
                        }
                    }
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        final SubLObject var23 = Values.arg2(var14.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23533(var1, var12, var13, var6)));
        module0034.f1836(var16, var17, var18, var23, (SubLObject)ConsesLow.list(var1, var12, var13, var6));
        return module0034.f1959(var23);
    }
    
    public static SubLObject f23534(final SubLObject var1, final SubLObject var12, final SubLObject var13, final SubLObject var6) {
        return module0035.sublisp_boolean(f23535(var1, var12, var13, var6));
    }
    
    public static SubLObject f23535(final SubLObject var1, final SubLObject var12, final SubLObject var13, final SubLObject var6) {
        return f23536(var1, var12, var13, var6).first();
    }
    
    public static SubLObject f23537(final SubLObject var1, final SubLObject var12, final SubLObject var13, SubLObject var6) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var15 = (SubLObject)module0350.NIL;
        SubLObject var17;
        final SubLObject var16 = var17 = f23532(var1, var12, var13, var6);
        SubLObject var18 = (SubLObject)module0350.NIL;
        var18 = var17.first();
        while (module0350.NIL != var17) {
            var15 = (SubLObject)ConsesLow.cons(var18, var15);
            var17 = var17.rest();
            var18 = var17.first();
        }
        final SubLObject var19 = module0147.f9540(var6);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var14);
        final SubLObject var21 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var22 = module0147.$g2096$.currentBinding(var14);
        try {
            module0147.$g2095$.bind(module0147.f9545(var19), var14);
            module0147.$g2094$.bind(module0147.f9546(var19), var14);
            module0147.$g2096$.bind(module0147.f9549(var19), var14);
            final SubLObject var24;
            final SubLObject var23 = var24 = module0226.f14857(var1, var12, var13, (SubLObject)module0350.UNPROVIDED);
            if (module0350.NIL != var24) {
                var15 = (SubLObject)ConsesLow.cons(var24, var15);
            }
        }
        finally {
            module0147.$g2096$.rebind(var22, var14);
            module0147.$g2094$.rebind(var21, var14);
            module0147.$g2095$.rebind(var20, var14);
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f23536(final SubLObject var1, final SubLObject var12, final SubLObject var13, final SubLObject var6) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0034.$g879$.getDynamicValue(var14);
        SubLObject var16 = (SubLObject)module0350.NIL;
        if (module0350.NIL == var15) {
            return f23537(var1, var12, var13, var6);
        }
        var16 = module0034.f1857(var15, (SubLObject)module0350.$ic7$, (SubLObject)module0350.UNPROVIDED);
        if (module0350.NIL == var16) {
            var16 = module0034.f1807(module0034.f1842(var15), (SubLObject)module0350.$ic7$, (SubLObject)module0350.FOUR_INTEGER, (SubLObject)module0350.NIL, (SubLObject)module0350.EQL, (SubLObject)module0350.UNPROVIDED);
            module0034.f1860(var15, (SubLObject)module0350.$ic7$, var16);
        }
        final SubLObject var17 = module0034.f1780(var1, var12, var13, var6);
        final SubLObject var18 = module0034.f1814(var16, var17, (SubLObject)module0350.UNPROVIDED);
        if (var18 != module0350.$ic1$) {
            SubLObject var19 = var18;
            SubLObject var20 = (SubLObject)module0350.NIL;
            var20 = var19.first();
            while (module0350.NIL != var19) {
                SubLObject var21 = var20.first();
                final SubLObject var22 = conses_high.second(var20);
                if (var1.eql(var21.first())) {
                    var21 = var21.rest();
                    if (var12.eql(var21.first())) {
                        var21 = var21.rest();
                        if (var13.eql(var21.first())) {
                            var21 = var21.rest();
                            if (module0350.NIL != var21 && module0350.NIL == var21.rest() && var6.eql(var21.first())) {
                                return module0034.f1959(var22);
                            }
                        }
                    }
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        final SubLObject var23 = Values.arg2(var14.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23537(var1, var12, var13, var6)));
        module0034.f1836(var16, var17, var18, var23, (SubLObject)ConsesLow.list(var1, var12, var13, var6));
        return module0034.f1959(var23);
    }
    
    public static SubLObject f23538(final SubLObject var27, final SubLObject var6) {
        return module0035.sublisp_boolean(f23539(var27, var6));
    }
    
    public static SubLObject f23539(final SubLObject var27, SubLObject var6) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var29 = (SubLObject)module0350.NIL;
        final SubLObject var30 = module0147.f9540(var6);
        final SubLObject var31 = module0147.$g2095$.currentBinding(var28);
        final SubLObject var32 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var33 = module0147.$g2096$.currentBinding(var28);
        try {
            module0147.$g2095$.bind(module0147.f9545(var30), var28);
            module0147.$g2094$.bind(module0147.f9546(var30), var28);
            module0147.$g2096$.bind(module0147.f9549(var30), var28);
            var29 = module0226.f14859(var27, (SubLObject)module0350.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var33, var28);
            module0147.$g2094$.rebind(var32, var28);
            module0147.$g2095$.rebind(var31, var28);
        }
        return var29;
    }
    
    public static SubLObject f23540(final SubLObject var27, final SubLObject var6) {
        return module0035.sublisp_boolean(f23541(var27, var6));
    }
    
    public static SubLObject f23541(final SubLObject var27, final SubLObject var6) {
        return f23542(var27, var6).first();
    }
    
    public static SubLObject f23543(final SubLObject var27, SubLObject var6) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var29 = (SubLObject)module0350.NIL;
        final SubLObject var31;
        final SubLObject var30 = var31 = f23539(var27, var6);
        if (module0350.NIL != var31) {
            var29 = (SubLObject)ConsesLow.cons(var31, var29);
        }
        final SubLObject var32 = module0147.f9540(var6);
        final SubLObject var33 = module0147.$g2095$.currentBinding(var28);
        final SubLObject var34 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var35 = module0147.$g2096$.currentBinding(var28);
        try {
            module0147.$g2095$.bind(module0147.f9545(var32), var28);
            module0147.$g2094$.bind(module0147.f9546(var32), var28);
            module0147.$g2096$.bind(module0147.f9549(var32), var28);
            final SubLObject var37;
            final SubLObject var36 = var37 = module0226.f14862(var27, (SubLObject)module0350.UNPROVIDED);
            if (module0350.NIL != var37) {
                var29 = (SubLObject)ConsesLow.cons(var37, var29);
            }
        }
        finally {
            module0147.$g2096$.rebind(var35, var28);
            module0147.$g2094$.rebind(var34, var28);
            module0147.$g2095$.rebind(var33, var28);
        }
        return Sequences.nreverse(var29);
    }
    
    public static SubLObject f23542(final SubLObject var27, final SubLObject var6) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = module0034.$g879$.getDynamicValue(var28);
        SubLObject var30 = (SubLObject)module0350.NIL;
        if (module0350.NIL == var29) {
            return f23543(var27, var6);
        }
        var30 = module0034.f1857(var29, (SubLObject)module0350.$ic8$, (SubLObject)module0350.UNPROVIDED);
        if (module0350.NIL == var30) {
            var30 = module0034.f1807(module0034.f1842(var29), (SubLObject)module0350.$ic8$, (SubLObject)module0350.TWO_INTEGER, (SubLObject)module0350.NIL, (SubLObject)module0350.EQL, (SubLObject)module0350.UNPROVIDED);
            module0034.f1860(var29, (SubLObject)module0350.$ic8$, var30);
        }
        final SubLObject var31 = module0034.f1782(var27, var6);
        final SubLObject var32 = module0034.f1814(var30, var31, (SubLObject)module0350.UNPROVIDED);
        if (var32 != module0350.$ic1$) {
            SubLObject var33 = var32;
            SubLObject var34 = (SubLObject)module0350.NIL;
            var34 = var33.first();
            while (module0350.NIL != var33) {
                SubLObject var35 = var34.first();
                final SubLObject var36 = conses_high.second(var34);
                if (var27.eql(var35.first())) {
                    var35 = var35.rest();
                    if (module0350.NIL != var35 && module0350.NIL == var35.rest() && var6.eql(var35.first())) {
                        return module0034.f1959(var36);
                    }
                }
                var33 = var33.rest();
                var34 = var33.first();
            }
        }
        final SubLObject var37 = Values.arg2(var28.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23543(var27, var6)));
        module0034.f1836(var30, var31, var32, var37, (SubLObject)ConsesLow.list(var27, var6));
        return module0034.f1959(var37);
    }
    
    public static SubLObject f23544(final SubLObject var28, final SubLObject var6) {
        if (module0350.NIL != module0193.f12105(var28)) {
            return f23545(var28, var6);
        }
        return f23546(var28, var6);
    }
    
    public static SubLObject f23547(final SubLObject var28, final SubLObject var6) {
        return module0035.sublisp_boolean(f23548(var28, var6));
    }
    
    public static SubLObject f23548(final SubLObject var28, final SubLObject var6) {
        return f23549(var28, var6).first();
    }
    
    public static SubLObject f23549(final SubLObject var28, SubLObject var6) {
        var6 = f23513(var6);
        SubLObject var29 = (SubLObject)module0350.NIL;
        final SubLObject var30 = module0205.f13333(var28);
        if (module0350.NIL != module0173.f10955(var30)) {
            final SubLObject var31 = f23512(var30, var6);
            if (module0350.NIL != module0331.f22395(var28)) {
                final SubLObject var32 = var31;
                if (module0350.NIL != var32) {
                    var29 = (SubLObject)ConsesLow.cons(var32, var29);
                }
            }
            final SubLObject var33 = module0205.f13180(var28, (SubLObject)module0350.$ic9$);
            SubLObject var34 = (SubLObject)module0350.NIL;
            SubLObject var35 = (SubLObject)module0350.NIL;
            SubLObject var36 = (SubLObject)module0350.NIL;
            var34 = var33;
            var35 = var34.first();
            for (var36 = (SubLObject)module0350.ZERO_INTEGER; module0350.NIL != var34; var34 = var34.rest(), var35 = var34.first(), var36 = module0048.f_1X(var36)) {
                if (module0350.NIL != module0193.f12105(var35)) {
                    final SubLObject var37 = f23516(var30, var35, var36, var6);
                    if (module0350.NIL != var37 && module0350.NIL != module0331.f22396(var28, var36)) {
                        SubLObject var38 = var37;
                        SubLObject var39 = (SubLObject)module0350.NIL;
                        var39 = var38.first();
                        while (module0350.NIL != var38) {
                            final SubLObject var40 = var39;
                            if (module0350.NIL == conses_high.member(var40, var29, Symbols.symbol_function((SubLObject)module0350.EQL), Symbols.symbol_function((SubLObject)module0350.IDENTITY))) {
                                var29 = (SubLObject)ConsesLow.cons(var40, var29);
                            }
                            var38 = var38.rest();
                            var39 = var38.first();
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(var29);
    }
    
    public static SubLObject f23546(final SubLObject var28, final SubLObject var6) {
        return module0035.sublisp_boolean(f23550(var28, var6));
    }
    
    public static SubLObject f23550(final SubLObject var28, final SubLObject var6) {
        return f23551(var28, var6);
    }
    
    public static SubLObject f23551(final SubLObject var28, SubLObject var6) {
        var6 = f23513(var6);
        SubLObject var29 = (SubLObject)module0350.NIL;
        final SubLObject var30 = module0205.f13333(var28);
        if (module0350.NIL != module0173.f10955(var30)) {
            final SubLObject var31 = f23520(var30, var6);
            if (module0350.NIL != var31 && module0350.NIL != module0331.f22395(var28)) {
                SubLObject var32 = var31;
                SubLObject var33 = (SubLObject)module0350.NIL;
                var33 = var32.first();
                while (module0350.NIL != var32) {
                    var29 = (SubLObject)ConsesLow.cons(var33, var29);
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
            if (module0350.$ic10$.eql(var30)) {
                final SubLObject var34 = module0205.f13388(var28, (SubLObject)module0350.UNPROVIDED);
                if (module0350.NIL != module0173.f10955(var34)) {
                    final SubLObject var35 = f23539(var34, var6);
                    if (module0350.NIL != var35 && module0350.NIL != module0331.f22385(module0205.f13387(var28, (SubLObject)module0350.UNPROVIDED))) {
                        var29 = (SubLObject)ConsesLow.cons(var35, var29);
                    }
                }
            }
            SubLObject var36 = module0205.f13180(var28, (SubLObject)module0350.$ic9$);
            SubLObject var37 = (SubLObject)module0350.NIL;
            SubLObject var38 = (SubLObject)module0350.NIL;
            SubLObject var39 = (SubLObject)module0350.NIL;
            var37 = var36;
            var38 = var37.first();
            for (var39 = (SubLObject)module0350.ZERO_INTEGER; module0350.NIL != var37; var37 = var37.rest(), var38 = var37.first(), var39 = module0048.f_1X(var39)) {
                if (module0350.NIL != module0193.f12105(var38)) {
                    final SubLObject var40 = f23528(var30, var39, var6);
                    if (module0350.NIL != var40 && module0350.NIL != module0331.f22396(var28, var39)) {
                        SubLObject var41 = var40;
                        SubLObject var42 = (SubLObject)module0350.NIL;
                        var42 = var41.first();
                        while (module0350.NIL != var41) {
                            final SubLObject var43 = var42;
                            if (module0350.NIL == conses_high.member(var43, var29, Symbols.symbol_function((SubLObject)module0350.EQL), Symbols.symbol_function((SubLObject)module0350.IDENTITY))) {
                                var29 = (SubLObject)ConsesLow.cons(var43, var29);
                            }
                            var41 = var41.rest();
                            var42 = var41.first();
                        }
                    }
                }
            }
            var36 = module0205.f13180(var28, (SubLObject)module0350.$ic9$);
            var37 = (SubLObject)module0350.NIL;
            var38 = (SubLObject)module0350.NIL;
            var39 = (SubLObject)module0350.NIL;
            var37 = var36;
            var38 = var37.first();
            for (var39 = (SubLObject)module0350.ZERO_INTEGER; module0350.NIL != var37; var37 = var37.rest(), var38 = var37.first(), var39 = module0048.f_1X(var39)) {
                if (module0350.NIL != module0193.f12105(var38)) {
                    final SubLObject var40 = f23532(var30, var38, var39, var6);
                    if (module0350.NIL != var40 && module0350.NIL != module0331.f22396(var28, var39)) {
                        SubLObject var41 = var40;
                        SubLObject var42 = (SubLObject)module0350.NIL;
                        var42 = var41.first();
                        while (module0350.NIL != var41) {
                            final SubLObject var43 = var42;
                            if (module0350.NIL == conses_high.member(var43, var29, Symbols.symbol_function((SubLObject)module0350.EQL), Symbols.symbol_function((SubLObject)module0350.IDENTITY))) {
                                var29 = (SubLObject)ConsesLow.cons(var43, var29);
                            }
                            var41 = var41.rest();
                            var42 = var41.first();
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(var29);
    }
    
    public static SubLObject f23545(final SubLObject var28, final SubLObject var6) {
        return module0035.sublisp_boolean(f23552(var28, var6));
    }
    
    public static SubLObject f23552(final SubLObject var28, final SubLObject var6) {
        return f23553(var28, var6).first();
    }
    
    public static SubLObject f23553(final SubLObject var28, SubLObject var6) {
        var6 = f23513(var6);
        SubLObject var29 = (SubLObject)module0350.NIL;
        final SubLObject var30 = module0205.f13333(var28);
        if (module0350.NIL != module0173.f10955(var30)) {
            SubLObject var31 = f23520(var30, var6);
            if (module0350.NIL != var31 && module0350.NIL != module0331.f22395(var28)) {
                SubLObject var32 = var31;
                SubLObject var33 = (SubLObject)module0350.NIL;
                var33 = var32.first();
                while (module0350.NIL != var32) {
                    var29 = (SubLObject)ConsesLow.cons(var33, var29);
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
            if (module0350.$ic10$.eql(var30)) {
                final SubLObject var34 = module0205.f13388(var28, (SubLObject)module0350.UNPROVIDED);
                if (module0350.NIL != module0173.f10955(var34)) {
                    final SubLObject var35 = f23539(var34, var6);
                    if (module0350.NIL != var35 && module0350.NIL != module0331.f22385(module0205.f13387(var28, (SubLObject)module0350.UNPROVIDED))) {
                        var29 = (SubLObject)ConsesLow.cons(var35, var29);
                    }
                }
            }
            var31 = f23524(var30, var6);
            if (module0350.NIL != var31 && module0350.NIL != module0331.f22395(var28)) {
                SubLObject var32 = var31;
                SubLObject var33 = (SubLObject)module0350.NIL;
                var33 = var32.first();
                while (module0350.NIL != var32) {
                    final SubLObject var36 = var33;
                    if (module0350.NIL == conses_high.member(var36, var29, Symbols.symbol_function((SubLObject)module0350.EQL), Symbols.symbol_function((SubLObject)module0350.IDENTITY))) {
                        var29 = (SubLObject)ConsesLow.cons(var36, var29);
                    }
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
            if (module0350.$ic10$.eql(var30)) {
                final SubLObject var34 = module0205.f13388(var28, (SubLObject)module0350.UNPROVIDED);
                if (module0350.NIL != module0173.f10955(var34)) {
                    final SubLObject var37 = f23542(var34, var6);
                    if (module0350.NIL != var37 && module0350.NIL != module0331.f22385(module0205.f13387(var28, (SubLObject)module0350.UNPROVIDED))) {
                        SubLObject var38 = var37;
                        SubLObject var39 = (SubLObject)module0350.NIL;
                        var39 = var38.first();
                        while (module0350.NIL != var38) {
                            final SubLObject var40 = var39;
                            if (module0350.NIL == conses_high.member(var40, var29, Symbols.symbol_function((SubLObject)module0350.EQL), Symbols.symbol_function((SubLObject)module0350.IDENTITY))) {
                                var29 = (SubLObject)ConsesLow.cons(var40, var29);
                            }
                            var38 = var38.rest();
                            var39 = var38.first();
                        }
                    }
                }
            }
            SubLObject var41 = module0205.f13180(var28, (SubLObject)module0350.$ic9$);
            SubLObject var42 = (SubLObject)module0350.NIL;
            SubLObject var43 = (SubLObject)module0350.NIL;
            SubLObject var44 = (SubLObject)module0350.NIL;
            var42 = var41;
            var43 = var42.first();
            for (var44 = (SubLObject)module0350.ZERO_INTEGER; module0350.NIL != var42; var42 = var42.rest(), var43 = var42.first(), var44 = module0048.f_1X(var44)) {
                if (module0350.NIL != module0193.f12105(var43)) {
                    final SubLObject var45 = f23528(var30, var44, var6);
                    if (module0350.NIL != var45 && module0350.NIL != module0331.f22396(var28, var44)) {
                        SubLObject var46 = var45;
                        SubLObject var47 = (SubLObject)module0350.NIL;
                        var47 = var46.first();
                        while (module0350.NIL != var46) {
                            final SubLObject var48 = var47;
                            if (module0350.NIL == conses_high.member(var48, var29, Symbols.symbol_function((SubLObject)module0350.EQL), Symbols.symbol_function((SubLObject)module0350.IDENTITY))) {
                                var29 = (SubLObject)ConsesLow.cons(var48, var29);
                            }
                            var46 = var46.rest();
                            var47 = var46.first();
                        }
                    }
                }
            }
            var41 = module0205.f13180(var28, (SubLObject)module0350.$ic9$);
            var42 = (SubLObject)module0350.NIL;
            var43 = (SubLObject)module0350.NIL;
            var44 = (SubLObject)module0350.NIL;
            var42 = var41;
            var43 = var42.first();
            for (var44 = (SubLObject)module0350.ZERO_INTEGER; module0350.NIL != var42; var42 = var42.rest(), var43 = var42.first(), var44 = module0048.f_1X(var44)) {
                if (module0350.NIL != module0193.f12105(var43)) {
                    final SubLObject var45 = f23536(var30, var43, var44, var6);
                    if (module0350.NIL != var45 && module0350.NIL != module0331.f22396(var28, var44)) {
                        SubLObject var46 = var45;
                        SubLObject var47 = (SubLObject)module0350.NIL;
                        var47 = var46.first();
                        while (module0350.NIL != var46) {
                            final SubLObject var48 = var47;
                            if (module0350.NIL == conses_high.member(var48, var29, Symbols.symbol_function((SubLObject)module0350.EQL), Symbols.symbol_function((SubLObject)module0350.IDENTITY))) {
                                var29 = (SubLObject)ConsesLow.cons(var48, var29);
                            }
                            var46 = var46.rest();
                            var47 = var46.first();
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(var29);
    }
    
    public static SubLObject f23513(final SubLObject var6) {
        return module0147.f9558(var6);
    }
    
    public static SubLObject f23554(final SubLObject var1, final SubLObject var6) {
        return module0035.sublisp_boolean(f23555(var1, var6));
    }
    
    public static SubLObject f23555(final SubLObject var1, SubLObject var6) {
        var6 = f23513(var6);
        return f23556(var1, var6).first();
    }
    
    public static SubLObject f23557(final SubLObject var1, SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var8 = (SubLObject)module0350.NIL;
        final SubLObject var9 = module0147.f9540(var6);
        final SubLObject var10 = module0147.$g2095$.currentBinding(var7);
        final SubLObject var11 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var12 = module0147.$g2096$.currentBinding(var7);
        try {
            module0147.$g2095$.bind(module0147.f9545(var9), var7);
            module0147.$g2094$.bind(module0147.f9546(var9), var7);
            module0147.$g2096$.bind(module0147.f9549(var9), var7);
            final SubLObject var14;
            final SubLObject var13 = var14 = module0226.f14849(var1, (SubLObject)module0350.UNPROVIDED);
            if (module0350.NIL != var14) {
                var8 = (SubLObject)ConsesLow.cons(var14, var8);
            }
        }
        finally {
            module0147.$g2096$.rebind(var12, var7);
            module0147.$g2094$.rebind(var11, var7);
            module0147.$g2095$.rebind(var10, var7);
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f23556(final SubLObject var1, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0034.$g879$.getDynamicValue(var7);
        SubLObject var9 = (SubLObject)module0350.NIL;
        if (module0350.NIL == var8) {
            return f23557(var1, var6);
        }
        var9 = module0034.f1857(var8, (SubLObject)module0350.$ic11$, (SubLObject)module0350.UNPROVIDED);
        if (module0350.NIL == var9) {
            var9 = module0034.f1807(module0034.f1842(var8), (SubLObject)module0350.$ic11$, (SubLObject)module0350.TWO_INTEGER, (SubLObject)module0350.NIL, (SubLObject)module0350.EQL, (SubLObject)module0350.UNPROVIDED);
            module0034.f1860(var8, (SubLObject)module0350.$ic11$, var9);
        }
        final SubLObject var10 = module0034.f1782(var1, var6);
        final SubLObject var11 = module0034.f1814(var9, var10, (SubLObject)module0350.UNPROVIDED);
        if (var11 != module0350.$ic1$) {
            SubLObject var12 = var11;
            SubLObject var13 = (SubLObject)module0350.NIL;
            var13 = var12.first();
            while (module0350.NIL != var12) {
                SubLObject var14 = var13.first();
                final SubLObject var15 = conses_high.second(var13);
                if (var1.eql(var14.first())) {
                    var14 = var14.rest();
                    if (module0350.NIL != var14 && module0350.NIL == var14.rest() && var6.eql(var14.first())) {
                        return module0034.f1959(var15);
                    }
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        final SubLObject var16 = Values.arg2(var7.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23557(var1, var6)));
        module0034.f1836(var9, var10, var11, var16, (SubLObject)ConsesLow.list(var1, var6));
        return module0034.f1959(var16);
    }
    
    public static SubLObject f23558(final SubLObject var27, final SubLObject var6) {
        return module0035.sublisp_boolean(f23559(var27, var6));
    }
    
    public static SubLObject f23559(final SubLObject var27, SubLObject var6) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        var6 = f23513(var6);
        SubLObject var29 = (SubLObject)module0350.NIL;
        final SubLObject var30 = module0147.f9540(var6);
        final SubLObject var31 = module0147.$g2095$.currentBinding(var28);
        final SubLObject var32 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var33 = module0147.$g2096$.currentBinding(var28);
        try {
            module0147.$g2095$.bind(module0147.f9545(var30), var28);
            module0147.$g2094$.bind(module0147.f9546(var30), var28);
            module0147.$g2096$.bind(module0147.f9549(var30), var28);
            var29 = module0226.f14860(var27, (SubLObject)module0350.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var33, var28);
            module0147.$g2094$.rebind(var32, var28);
            module0147.$g2095$.rebind(var31, var28);
        }
        return var29;
    }
    
    public static SubLObject f23560(final SubLObject var28, final SubLObject var6) {
        return module0035.sublisp_boolean(f23561(var28, var6));
    }
    
    public static SubLObject f23561(final SubLObject var28, final SubLObject var6) {
        return f23562(var28, var6).first();
    }
    
    public static SubLObject f23562(final SubLObject var28, SubLObject var6) {
        var6 = f23513(var6);
        SubLObject var29 = (SubLObject)module0350.NIL;
        final SubLObject var30 = module0205.f13333(var28);
        if (module0350.NIL != module0173.f10955(var30)) {
            final SubLObject var31 = f23556(var30, var6);
            if (module0350.NIL != var31) {
                SubLObject var32 = var31;
                SubLObject var33 = (SubLObject)module0350.NIL;
                var33 = var32.first();
                while (module0350.NIL != var32) {
                    var29 = (SubLObject)ConsesLow.cons(var33, var29);
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
            if (module0350.$ic10$.eql(var30)) {
                final SubLObject var34 = module0205.f13388(var28, (SubLObject)module0350.UNPROVIDED);
                if (module0350.NIL != module0173.f10955(var34)) {
                    final SubLObject var35 = f23559(var34, var6);
                    if (module0350.NIL != var35) {
                        var29 = (SubLObject)ConsesLow.cons(var35, var29);
                    }
                }
            }
        }
        return Sequences.nreverse(var29);
    }
    
    public static SubLObject f23563() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23509", "S#26202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23510", "S#26203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23511", "S#26204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23512", "S#26205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23514", "S#26206", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23515", "S#26207", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23517", "S#26208", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23516", "S#26209", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23518", "S#26210", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23519", "S#26211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23521", "S#26212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23520", "S#26213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23522", "S#26214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23523", "S#26215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23525", "S#26216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23524", "S#26217", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23526", "S#26218", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23527", "S#26219", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23529", "S#26220", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23528", "S#26221", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23530", "S#26222", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23531", "S#26223", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23533", "S#26224", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23532", "S#26225", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23534", "S#26226", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23535", "S#26227", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23537", "S#26228", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23536", "S#26229", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23538", "S#26230", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23539", "S#26231", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23540", "S#26232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23541", "S#26233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23543", "S#26234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23542", "S#26235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23544", "S#26236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23547", "S#26237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23548", "S#26238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23549", "INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23546", "S#26239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23550", "S#26240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23551", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23545", "S#26241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23552", "S#26242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23553", "INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23513", "S#26243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23554", "S#26244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23555", "S#26245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23557", "S#26246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23556", "S#26247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23558", "S#26248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23559", "S#26249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23560", "S#26087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23561", "S#26250", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0350", "f23562", "S#26251", 2, 0, false);
        return (SubLObject)module0350.NIL;
    }
    
    public static SubLObject f23564() {
        return (SubLObject)module0350.NIL;
    }
    
    public static SubLObject f23565() {
        module0034.f1895((SubLObject)module0350.$ic0$);
        module0034.f1895((SubLObject)module0350.$ic2$);
        module0034.f1895((SubLObject)module0350.$ic3$);
        module0034.f1895((SubLObject)module0350.$ic4$);
        module0034.f1895((SubLObject)module0350.$ic5$);
        module0034.f1895((SubLObject)module0350.$ic6$);
        module0034.f1895((SubLObject)module0350.$ic7$);
        module0034.f1895((SubLObject)module0350.$ic8$);
        module0034.f1895((SubLObject)module0350.$ic11$);
        return (SubLObject)module0350.NIL;
    }
    
    public void declareFunctions() {
        f23563();
    }
    
    public void initializeVariables() {
        f23564();
    }
    
    public void runTopLevelForms() {
        f23565();
    }
    
    static {
        me = (SubLFile)new module0350();
        $ic0$ = SubLObjectFactory.makeSymbol("S#26203", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic2$ = SubLObjectFactory.makeSymbol("S#26209", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#26213", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#26217", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#26221", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#26225", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#26229", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#26235", "CYC");
        $ic9$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic11$ = SubLObjectFactory.makeSymbol("S#26247", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0350.class
	Total time: 256 ms
	
	Decompiled with Procyon 0.5.32.
*/