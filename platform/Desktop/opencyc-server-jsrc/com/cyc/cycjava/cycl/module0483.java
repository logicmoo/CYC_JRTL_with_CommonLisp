package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0483 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0483";
    public static final String myFingerPrint = "4e4bb9c18da2162929581149d83eda99a001f4079f84de5a2551eec18aa4a854";
    private static SubLSymbol $g3700$;
    public static SubLSymbol $g3582$;
    private static SubLSymbol $g3701$;
    private static SubLSymbol $g3702$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLFloat $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLInteger $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    
    public static SubLObject f31843(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0350.f23544(var1, module0147.$g2095$.getDynamicValue(var2));
    }
    
    public static SubLObject f31844(final SubLObject var3, final SubLObject var4) {
        if (var3.eql(module0483.$ic0$)) {
            final SubLObject var5 = module0202.f12643(var3, var4);
            final SubLObject var6 = module0191.f11990((SubLObject)module0483.$ic1$, var5, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
            return var6;
        }
        return module0191.f11990((SubLObject)module0483.$ic2$, var4, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
    }
    
    public static SubLObject f31845(final SubLObject var7) {
        final SubLObject var8 = module0205.f13387(var7, (SubLObject)module0483.UNPROVIDED);
        return (SubLObject)ConsesLow.list(f31846(var8));
    }
    
    public static SubLObject f31847(SubLObject var1, SubLObject var9, final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0483.ZERO_INTEGER;
        if (module0483.NIL != module0202.f12884(var1)) {
            var11.resetMultipleValues();
            final SubLObject var12_13 = module0279.f18578(var1, var9);
            final SubLObject var14_15 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            var1 = var12_13;
            var9 = var14_15;
        }
        final SubLObject var13 = module0147.f9540(var9);
        final SubLObject var14 = module0147.$g2095$.currentBinding(var11);
        final SubLObject var15 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var16 = module0147.$g2096$.currentBinding(var11);
        try {
            module0147.$g2095$.bind(module0147.f9545(var13), var11);
            module0147.$g2094$.bind(module0147.f9546(var13), var11);
            module0147.$g2096$.bind(module0147.f9549(var13), var11);
            var12 = module0411.f28638(var1, var10, var9, module0450.f31011());
        }
        finally {
            module0147.$g2096$.rebind(var16, var11);
            module0147.$g2094$.rebind(var15, var11);
            module0147.$g2095$.rebind(var14, var11);
        }
        return var12;
    }
    
    public static SubLObject f31848(final SubLObject var1, final SubLObject var20, final SubLObject var21) {
        final SubLObject var22 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        if (module0483.NIL != module0337.f22626((SubLObject)module0483.$ic6$, var22)) {
            return (SubLObject)module0483.$ic7$;
        }
        final SubLObject var23 = module0358.f23660(var22, (SubLObject)module0483.$ic8$, var20, var21);
        if (module0483.NIL != module0358.f23663(var23, (SubLObject)module0483.$ic9$)) {
            return var23;
        }
        return (SubLObject)module0483.$ic7$;
    }
    
    public static SubLObject f31846(final SubLObject var4) {
        return f31844(module0483.$ic3$, var4);
    }
    
    public static SubLObject f31849(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        if (module0483.NIL != f31850(var11, (SubLObject)module0483.UNPROVIDED)) {
            final SubLObject var12 = f31846(var11);
            module0347.f23330(var12, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31850(final SubLObject var4, SubLObject var9) {
        if (var9 == module0483.UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23494(var4, var9, (SubLObject)module0483.ONE_INTEGER);
    }
    
    public static SubLObject f31851(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        SubLObject var13 = f31847(var12, module0147.$g2095$.getDynamicValue(var11), (SubLObject)module0483.$ic8$);
        if (!var13.isZero()) {
            var13 = Numbers.add(var13, module0483.$g3582$.getDynamicValue(var11));
        }
        if (module0483.NIL != module0193.f12105(var1)) {
            var13 = Numbers.min(var13, module0483.$g3700$.getDynamicValue(var11));
        }
        return var13;
    }
    
    public static SubLObject f31852(final SubLObject var8) {
        return module0052.f3709(f31853(var8, (SubLObject)module0483.UNPROVIDED));
    }
    
    public static SubLObject f31854(final SubLObject var8, final SubLObject var10) {
        if (module0483.NIL != module0193.f12105(var8)) {
            return (SubLObject)module0483.$ic16$;
        }
        if (module0483.NIL != module0337.f22626((SubLObject)module0483.$ic6$, var8)) {
            return (SubLObject)module0483.$ic16$;
        }
        final SubLObject var11 = module0411.f28643(var8, var10, (SubLObject)module0483.UNPROVIDED);
        if (module0483.NIL != module0360.f23927(var11, (SubLObject)module0483.$ic17$)) {
            return var11;
        }
        return (SubLObject)module0483.$ic16$;
    }
    
    public static SubLObject f31853(final SubLObject var1, SubLObject var9) {
        if (var9 == module0483.UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23493(var1, var9, (SubLObject)module0483.$ic18$);
    }
    
    public static SubLObject f31855(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var13 = module0205.f13379(var12, (SubLObject)module0483.UNPROVIDED);
        SubLObject var14 = f31847(var13, module0147.$g2095$.getDynamicValue(var11), (SubLObject)module0483.$ic19$);
        if (!var14.isZero()) {
            var14 = Numbers.add(var14, module0483.$g3582$.getDynamicValue(var11));
        }
        var14 = Numbers.min(var14, module0483.$g3700$.getDynamicValue(var11));
        return var14;
    }
    
    public static SubLObject f31856(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var12 = module0205.f13379(var11, (SubLObject)module0483.UNPROVIDED);
        if (module0483.NIL != f31857(var12, (SubLObject)module0483.UNPROVIDED)) {
            final SubLObject var13 = f31846(var11);
            module0347.f23330(var13, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31857(final SubLObject var1, SubLObject var9) {
        if (var9 == module0483.UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23493(var1, var9, (SubLObject)module0483.$ic22$);
    }
    
    public static SubLObject f31858(final SubLObject var4) {
        return f31844(module0483.$ic0$, var4);
    }
    
    public static SubLObject f31859(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var13 = f31850(var12, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var14 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        if (module0483.NIL == var13 && module0483.NIL != var14) {
            final SubLObject var15 = f31858(var12);
            module0347.f23330(var15, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31860(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return Numbers.min(module0483.$g3701$.getDynamicValue(var11), f31851(var1, (SubLObject)module0483.UNPROVIDED));
    }
    
    public static SubLObject f31861(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var13 = f31853(var12, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var14 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        if (module0483.NIL == var13 && module0483.NIL != var14) {
            final SubLObject var15 = f31858(var12);
            module0347.f23330(var15, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31862(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return Numbers.min(module0483.$g3701$.getDynamicValue(var11), f31855(var1, (SubLObject)module0483.UNPROVIDED));
    }
    
    public static SubLObject f31863(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var12 = module0205.f13379(var11, (SubLObject)module0483.UNPROVIDED);
        if (module0483.NIL == f31857(var12, (SubLObject)module0483.UNPROVIDED)) {
            final SubLObject var13 = f31858(var11);
            module0347.f23330(var13, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31864(final SubLObject var4) {
        return f31844(module0483.$ic29$, var4);
    }
    
    public static SubLObject f31865(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        if (var12.eql(module0483.$ic30$)) {
            return Numbers.multiply((SubLObject)module0483.ONE_INTEGER, module0483.$g3701$.getDynamicValue(var11));
        }
        if (var12.eql(module0483.$ic31$)) {
            return Numbers.multiply((SubLObject)module0483.TEN_INTEGER, module0483.$g3701$.getDynamicValue(var11));
        }
        if (var12.eql(module0483.$ic32$)) {
            return Numbers.multiply((SubLObject)module0483.$ic33$, module0483.$g3701$.getDynamicValue(var11));
        }
        return Numbers.multiply((SubLObject)module0483.$ic34$, module0483.$g3701$.getDynamicValue(var11));
    }
    
    public static SubLObject f31866(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var13 = module0349.$g2987$.currentBinding(var11);
        try {
            module0349.$g2987$.bind((SubLObject)(var12.eql(module0483.$ic30$) ? module0412.f28715((SubLObject)module0483.$ic35$) : (var12.eql(module0483.$ic31$) ? module0412.f28715((SubLObject)module0483.$ic36$) : (var12.eql(module0483.$ic32$) ? module0412.f28715((SubLObject)module0483.$ic37$) : (var12.eql(module0483.$ic38$) ? module0412.f28715((SubLObject)module0483.$ic39$) : module0483.NIL)))), var11);
            final SubLObject var14 = module0205.f13388(var1, (SubLObject)module0483.UNPROVIDED);
            var11.resetMultipleValues();
            final SubLObject var15 = f31850(var14, (SubLObject)module0483.UNPROVIDED);
            final SubLObject var16 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0483.NIL == var15 && module0483.NIL != var16) {
                final SubLObject var17 = f31858(var14);
                module0347.f23330(var17, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
            }
            return (SubLObject)module0483.NIL;
        }
        finally {
            module0349.$g2987$.rebind(var13, var11);
        }
    }
    
    public static SubLObject f31867(final SubLObject var30) {
        return module0259.f16891(var30, module0483.$ic43$);
    }
    
    public static SubLObject f31868(final SubLObject var1, final SubLObject var20, final SubLObject var21) {
        return f31848(var1, var20, var21);
    }
    
    public static SubLObject f31869(final SubLObject var4) {
        return f31844(module0483.$ic44$, var4);
    }
    
    public static SubLObject f31870(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        if (module0483.NIL != f31871(var11, (SubLObject)module0483.UNPROVIDED)) {
            final SubLObject var12 = f31869(var11);
            module0347.f23330(var12, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31871(final SubLObject var4, SubLObject var9) {
        if (var9 == module0483.UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23495(var4, var9, (SubLObject)module0483.ONE_INTEGER, (SubLObject)module0483.UNPROVIDED);
    }
    
    public static SubLObject f31872(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        return f31851(var1, (SubLObject)module0483.UNPROVIDED);
    }
    
    public static SubLObject f31873(final SubLObject var8) {
        return module0052.f3709(f31853(var8, (SubLObject)module0483.UNPROVIDED));
    }
    
    public static SubLObject f31874(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        return f31855(var1, (SubLObject)module0483.UNPROVIDED);
    }
    
    public static SubLObject f31875(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var12 = module0205.f13379(var11, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var13 = f31857(var12, (SubLObject)module0483.UNPROVIDED);
        if (module0483.NIL != var13) {
            SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)module0483.NIL;
            var15 = var14.first();
            while (module0483.NIL != var14) {
                final SubLObject var16 = module0233.f15361(var15, var12);
                final SubLObject var17 = f31869(module0205.f13338(var16));
                module0347.f23330(var17, var15, (SubLObject)module0483.UNPROVIDED);
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31876(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        var11.resetMultipleValues();
        final SubLObject var12 = module0202.f12795(var1);
        SubLObject var13 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        while (module0483.NIL != module0202.f12604(var13)) {
            var13 = module0202.f12668(var13);
        }
        var13 = module0370.f25852(var13, module0147.f9496(), (SubLObject)module0483.T);
        if (module0483.NIL == module0202.f12673(var13) && module0483.NIL != module0202.f12594(var13) && module0483.NIL == module0202.f12673(var13)) {
            final SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)module0483.ZERO_INTEGER;
            SubLObject var16 = (SubLObject)module0483.NIL;
            final SubLObject var17 = module0205.f13207(var14, (SubLObject)module0483.$ic58$);
            SubLObject var18;
            SubLObject var19;
            for (var18 = (SubLObject)module0483.NIL, var18 = var17; module0483.NIL == var16 && module0483.NIL != var18; var18 = var18.rest()) {
                var19 = var18.first();
                if (module0483.NIL != module0206.f13487(var19)) {
                    var15 = Numbers.add(var15, (SubLObject)module0483.ONE_INTEGER);
                }
                else {
                    var16 = (SubLObject)module0483.T;
                }
            }
            if (module0483.NIL == var16 && var15.numGE((SubLObject)module0483.TWO_INTEGER)) {
                return (SubLObject)module0483.T;
            }
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31877(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        var11.resetMultipleValues();
        final SubLObject var12 = module0202.f12795(var1);
        SubLObject var13 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        while (module0483.NIL != module0202.f12604(var13)) {
            var13 = module0202.f12668(var13);
        }
        final SubLObject var14 = module0147.f9496();
        final SubLObject var15 = module0282.f18738(var13, module0147.f9496());
        SubLObject var17;
        final SubLObject var16 = var17 = module0205.f13207(var15, (SubLObject)module0483.$ic58$);
        SubLObject var18 = (SubLObject)module0483.NIL;
        var18 = var17.first();
        while (module0483.NIL != var17) {
            final SubLObject var19 = Sequences.remove(var18, module0205.f13207(var15, (SubLObject)module0483.UNPROVIDED), (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
            final SubLObject var20 = module0202.f12911(var18, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
            final SubLObject var21 = Functions.apply(Symbols.symbol_function((SubLObject)module0483.$ic60$), Mapping.mapcar((SubLObject)module0483.$ic61$, var19));
            SubLObject var31_47;
            final SubLObject var22 = var31_47 = conses_high.set_difference(var20, var21, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
            SubLObject var23 = (SubLObject)module0483.NIL;
            var23 = var31_47.first();
            while (module0483.NIL != var31_47) {
                var18 = module0202.f12775(var23, var18);
                var31_47 = var31_47.rest();
                var23 = var31_47.first();
            }
            final SubLObject var24 = Mapping.mapcar((SubLObject)module0483.$ic62$, var19);
            final SubLObject var25 = (SubLObject)ConsesLow.list(module0483.$ic63$, reader.bq_cons(module0483.$ic64$, ConsesLow.append(var24, (SubLObject)module0483.NIL)), var18);
            var11.resetMultipleValues();
            final SubLObject var26 = module0434.f30592(var25, var14, (SubLObject)module0483.$ic65$);
            final SubLObject var27 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0483.NIL == module0360.f23866(var27) && module0483.NIL != var26) {
                final SubLObject var28 = module0191.f11990((SubLObject)module0483.$ic2$, var25, var14, (SubLObject)module0483.UNPROVIDED);
                module0347.f23330(var28, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31878(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        var11.resetMultipleValues();
        final SubLObject var12 = module0202.f12795(var1);
        SubLObject var13 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        while (module0483.NIL != module0202.f12604(var13)) {
            var13 = module0202.f12668(var13);
        }
        if (module0483.NIL != module0202.f12597(var13)) {
            var13 = module0205.f13203(var13, (SubLObject)module0483.UNPROVIDED);
            if (module0205.f13132(var13).eql(module0483.$ic69$) && module0483.NIL != module0206.f13497(module0205.f13203(var13, (SubLObject)module0483.UNPROVIDED)) && module0483.NIL != module0202.f12674(module0205.f13204(var13, (SubLObject)module0483.UNPROVIDED))) {
                return (SubLObject)module0483.T;
            }
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31879(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0147.f9496();
        SubLObject var13 = (SubLObject)module0483.NIL;
        SubLObject var14 = (SubLObject)module0483.NIL;
        SubLObject var15 = (SubLObject)module0483.NIL;
        SubLObject var16 = (SubLObject)module0483.NIL;
        var11.resetMultipleValues();
        final SubLObject var17 = module0202.f12795(var1);
        SubLObject var18 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        while (module0483.NIL != module0202.f12604(var18)) {
            var18 = module0202.f12668(var18);
        }
        if (module0483.NIL != module0202.f12597(var18)) {
            var15 = module0205.f13204(var18, (SubLObject)module0483.UNPROVIDED);
            var18 = module0205.f13203(var18, (SubLObject)module0483.UNPROVIDED);
            if (module0205.f13132(var18).eql(module0483.$ic69$)) {
                var14 = module0205.f13203(var18, (SubLObject)module0483.UNPROVIDED);
                var13 = module0205.f13204(var18, (SubLObject)module0483.UNPROVIDED);
            }
        }
        SubLObject var19 = module0202.f12751(var13);
        SubLObject var20 = (SubLObject)module0483.NIL;
        var20 = var19.first();
        while (module0483.NIL != var19) {
            final SubLObject var21 = module0233.f15362(module0510.f32487((SubLObject)ConsesLow.list(var14), (SubLObject)ConsesLow.list(var20)), var15);
            var11.resetMultipleValues();
            final SubLObject var22 = module0434.f30592(var21, var12, (SubLObject)module0483.UNPROVIDED);
            final SubLObject var23 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0483.NIL != module0360.f23866(var23) || module0483.NIL == var22) {
                return (SubLObject)module0483.NIL;
            }
            var16 = (SubLObject)ConsesLow.cons(var21, var16);
            var19 = var19.rest();
            var20 = var19.first();
        }
        module0347.f23330(module0191.f11990((SubLObject)module0483.$ic2$, module0202.f12773(var16), var12, (SubLObject)module0483.UNPROVIDED), (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31880(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var5.resetMultipleValues();
        final SubLObject var6 = f31881(var4);
        SubLObject var7 = var5.secondMultipleValue();
        final SubLObject var8 = var5.thirdMultipleValue();
        var5.resetMultipleValues();
        if (module0483.NIL != var7 && module0483.NIL != var8) {
            final SubLObject var9 = module0147.f9496();
            var7 = f31882(var7, var6);
            return f31883(var7, var9);
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31881(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var5.resetMultipleValues();
        final SubLObject var6 = f31884(var4, (SubLObject)module0483.NIL);
        final SubLObject var7 = var5.secondMultipleValue();
        final SubLObject var8 = var5.thirdMultipleValue();
        var5.resetMultipleValues();
        return Values.values(Sequences.nreverse(var6), var7, var8);
    }
    
    public static SubLObject f31884(final SubLObject var4, final SubLObject var57) {
        if (module0483.NIL != module0202.f12597(var4)) {
            final SubLObject var58 = module0205.f13203(var4, (SubLObject)module0483.UNPROVIDED);
            final SubLObject var59 = module0205.f13204(var4, (SubLObject)module0483.UNPROVIDED);
            return Values.values(var57, var58, var59);
        }
        if (module0483.NIL != module0202.f12604(var4)) {
            final SubLObject var60 = module0205.f13203(var4, (SubLObject)module0483.UNPROVIDED);
            final SubLObject var61 = module0205.f13204(var4, (SubLObject)module0483.UNPROVIDED);
            return f31884(var61, (SubLObject)ConsesLow.cons(var60, var57));
        }
        return Values.values((SubLObject)module0483.NIL, (SubLObject)module0483.NIL, (SubLObject)module0483.NIL);
    }
    
    public static SubLObject f31885(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0147.f9496();
        final SubLObject var13 = module0205.f13203(var1, (SubLObject)module0483.UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var14 = f31881(var13);
        final SubLObject var15 = var11.secondMultipleValue();
        final SubLObject var16 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        final SubLObject var17 = f31886(var15, var12);
        final SubLObject var18 = f31887(var16, var12);
        SubLObject var20;
        final SubLObject var19 = var20 = module0434.f30594(var15, var12, var17);
        SubLObject var21 = (SubLObject)module0483.NIL;
        var21 = var20.first();
        while (module0483.NIL != var20) {
            final SubLObject var22 = module0233.f15362(var21, var16);
            if (module0483.NIL == module0434.f30594(var22, var12, var18)) {
                return (SubLObject)module0483.NIL;
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        final SubLObject var23 = module0191.f11990((SubLObject)module0483.$ic1$, var1, var12, (SubLObject)module0483.$ic75$);
        module0347.f23330(var23, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31886(final SubLObject var4, final SubLObject var9) {
        SubLObject var10 = module0349.f23492(var4, var9);
        var10 = conses_high.putf(var10, (SubLObject)module0483.$ic77$, (SubLObject)module0483.NIL);
        return var10;
    }
    
    public static SubLObject f31887(final SubLObject var4, final SubLObject var9) {
        return f31886(var4, var9);
    }
    
    public static SubLObject f31883(final SubLObject var4, final SubLObject var9) {
        if (module0483.NIL != module0206.f13433(var4)) {
            return f31888(var4, var9);
        }
        if (module0483.NIL != module0202.f12595(var4) && module0483.NIL != f31889(var4, var9)) {
            return (SubLObject)module0483.T;
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31888(final SubLObject var1, final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0483.$ic16$ == module0411.f28643(var1, (SubLObject)module0483.$ic8$, var9) || module0483.NIL != module0350.f23560(var1, var9));
    }
    
    public static SubLObject f31889(final SubLObject var68, final SubLObject var9) {
        SubLObject var70;
        final SubLObject var69 = var70 = module0205.f13377(var68, (SubLObject)module0483.UNPROVIDED);
        SubLObject var71 = (SubLObject)module0483.NIL;
        var71 = var70.first();
        while (module0483.NIL != var70) {
            if (module0483.NIL != f31883(var71, var9)) {
                final SubLObject var72 = Sequences.remove(var71, var69, Symbols.symbol_function((SubLObject)module0483.EQL), (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
                final SubLObject var73 = module0193.f12102(var71);
                SubLObject var74 = (SubLObject)module0483.NIL;
                if (module0483.NIL == var74) {
                    SubLObject var75 = var72;
                    SubLObject var76 = (SubLObject)module0483.NIL;
                    var76 = var75.first();
                    while (module0483.NIL == var74 && module0483.NIL != var75) {
                        if (module0483.NIL == f31883(var76, var9) && module0483.NIL == f31890(var76, var73)) {
                            var74 = var76;
                        }
                        var75 = var75.rest();
                        var76 = var75.first();
                    }
                }
                if (module0483.NIL == var74) {
                    return (SubLObject)module0483.T;
                }
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31882(SubLObject var4, final SubLObject var57) {
        final SubLObject var58 = f31891(var57);
        if (module0483.NIL != var58) {
            var4 = module0233.f15362(var58, var4);
        }
        return var4;
    }
    
    public static SubLObject f31891(final SubLObject var77) {
        SubLObject var78 = (SubLObject)module0483.NIL;
        SubLObject var79 = (SubLObject)module0483.NIL;
        SubLObject var80 = (SubLObject)module0483.NIL;
        SubLObject var81 = (SubLObject)module0483.NIL;
        var79 = var77;
        var80 = var79.first();
        for (var81 = (SubLObject)module0483.ZERO_INTEGER; module0483.NIL != var79; var79 = var79.rest(), var80 = var79.first(), var81 = Numbers.add((SubLObject)module0483.ONE_INTEGER, var81)) {
            final SubLObject var82 = module0193.f12075(var81);
            var78 = module0233.f15345(var80, var82, var78);
        }
        return module0234.f15468(Sequences.nreverse(var78));
    }
    
    public static SubLObject f31890(final SubLObject var81, final SubLObject var82) {
        final SubLObject var83 = module0193.f12102(var81);
        return conses_high.subsetp(var83, var82, Symbols.symbol_function((SubLObject)module0483.EQL), (SubLObject)module0483.UNPROVIDED);
    }
    
    public static SubLObject f31892(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var13 = f31893(var12, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var14 = var11.secondMultipleValue();
        final SubLObject var15 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        SubLObject var16 = (SubLObject)module0483.NIL;
        final SubLObject var17 = module0369.f25492(var15);
        if (module0483.NIL == module0065.f4772(var17, (SubLObject)module0483.$ic81$)) {
            final SubLObject var87_88 = var17;
            if (module0483.NIL == module0065.f4775(var87_88, (SubLObject)module0483.$ic81$)) {
                final SubLObject var18 = module0065.f4740(var87_88);
                final SubLObject var19 = (SubLObject)module0483.NIL;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                SubLObject var27;
                SubLObject var28;
                SubLObject var29;
                for (var20 = Sequences.length(var18), var21 = (SubLObject)module0483.NIL, var21 = (SubLObject)module0483.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0483.ONE_INTEGER)) {
                    var22 = ((module0483.NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)module0483.ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (module0483.NIL == module0065.f4749(var23) || module0483.NIL == module0065.f4773((SubLObject)module0483.$ic81$)) {
                        if (module0483.NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)module0483.$ic81$;
                        }
                        var24 = module0369.f25744(var23);
                        var25 = (SubLObject)module0483.NIL;
                        var25 = var24.first();
                        while (module0483.NIL != var24) {
                            var26 = module0369.f25775(var25);
                            var27 = conses_high.copy_list(var26);
                            while (module0483.NIL != var27) {
                                var28 = var27.first();
                                var27 = var27.rest();
                                var29 = ((module0483.NIL != module0174.f11035(var28)) ? var28 : module0191.f11967(var28));
                                if (module0483.NIL != module0279.f18551(var12, var29, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED)) {
                                    var27 = ConsesLow.append(module0191.f11977(var28), var27);
                                }
                                else {
                                    var16 = (SubLObject)ConsesLow.cons(var29, var16);
                                }
                            }
                            var24 = var24.rest();
                            var25 = var24.first();
                        }
                    }
                }
            }
            final SubLObject var99_100 = var17;
            if (module0483.NIL == module0065.f4777(var99_100)) {
                final SubLObject var30 = module0065.f4738(var99_100);
                SubLObject var31 = (SubLObject)module0483.NIL;
                SubLObject var32 = (SubLObject)module0483.NIL;
                final Iterator var33 = Hashtables.getEntrySetIterator(var30);
                try {
                    while (Hashtables.iteratorHasNext(var33)) {
                        final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                        var31 = Hashtables.getEntryKey(var34);
                        var32 = Hashtables.getEntryValue(var34);
                        SubLObject var35 = module0369.f25744(var32);
                        SubLObject var36 = (SubLObject)module0483.NIL;
                        var36 = var35.first();
                        while (module0483.NIL != var35) {
                            final SubLObject var37 = module0369.f25775(var36);
                            SubLObject var38 = conses_high.copy_list(var37);
                            while (module0483.NIL != var38) {
                                final SubLObject var39 = var38.first();
                                var38 = var38.rest();
                                final SubLObject var40 = (module0483.NIL != module0174.f11035(var39)) ? var39 : module0191.f11967(var39);
                                if (module0483.NIL != module0279.f18551(var12, var40, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED)) {
                                    var38 = ConsesLow.append(module0191.f11977(var39), var38);
                                }
                                else {
                                    var16 = (SubLObject)ConsesLow.cons(var40, var16);
                                }
                            }
                            var35 = var35.rest();
                            var36 = var35.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var33);
                }
            }
        }
        if (module0483.NIL != var16) {
            final SubLObject var41 = (SubLObject)ConsesLow.list(module0483.$ic78$, var12, module0202.f12681(var16));
            final SubLObject var42 = module0234.f15444(var1, var41, (SubLObject)module0483.T, (SubLObject)module0483.UNPROVIDED);
            final SubLObject var43 = module0191.f11990((SubLObject)module0483.$ic1$, var41, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
            module0347.f23330(var43, var42, (SubLObject)module0483.UNPROVIDED);
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31894(final SubLObject var4, SubLObject var9) {
        if (var9 == module0483.UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var10 = module0339.f22757();
        SubLObject var11 = module0349.f23492(var4, var9);
        var11 = conses_high.putf(var11, (SubLObject)module0483.$ic83$, (SubLObject)module0483.T);
        var11 = conses_high.putf(var11, (SubLObject)module0483.$ic84$, (SubLObject)module0483.ONE_INTEGER);
        var11 = conses_high.putf(var11, (SubLObject)module0483.$ic85$, (SubLObject)module0483.T);
        var11 = conses_high.putf(var11, (SubLObject)module0483.$ic86$, module0411.f28572(var10, (SubLObject)module0483.$ic86$, (SubLObject)module0483.UNPROVIDED));
        var11 = conses_high.putf(var11, (SubLObject)module0483.$ic87$, module0411.f28572(var10, (SubLObject)module0483.$ic87$, (SubLObject)module0483.UNPROVIDED));
        var11 = conses_high.putf(var11, (SubLObject)module0483.$ic88$, module0369.f25610(var10));
        var11 = conses_high.putf(var11, (SubLObject)module0483.$ic89$, module0369.f25511(var10));
        return module0434.f30592(var4, var9, var11);
    }
    
    public static SubLObject f31893(final SubLObject var4, SubLObject var9) {
        if (var9 == module0483.UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0034.$g879$.getDynamicValue(var10);
        SubLObject var12 = (SubLObject)module0483.NIL;
        if (module0483.NIL == var11) {
            return f31894(var4, var9);
        }
        var12 = module0034.f1857(var11, (SubLObject)module0483.$ic82$, (SubLObject)module0483.UNPROVIDED);
        if (module0483.NIL == var12) {
            var12 = module0034.f1807(module0034.f1842(var11), (SubLObject)module0483.$ic82$, (SubLObject)module0483.TWO_INTEGER, (SubLObject)module0483.NIL, (SubLObject)module0483.EQUAL, (SubLObject)module0483.UNPROVIDED);
            module0034.f1860(var11, (SubLObject)module0483.$ic82$, var12);
        }
        final SubLObject var13 = module0034.f1782(var4, var9);
        final SubLObject var14 = module0034.f1814(var12, var13, (SubLObject)module0483.UNPROVIDED);
        if (var14 != module0483.$ic90$) {
            SubLObject var15 = var14;
            SubLObject var16 = (SubLObject)module0483.NIL;
            var16 = var15.first();
            while (module0483.NIL != var15) {
                SubLObject var17 = var16.first();
                final SubLObject var18 = conses_high.second(var16);
                if (var4.equal(var17.first())) {
                    var17 = var17.rest();
                    if (module0483.NIL != var17 && module0483.NIL == var17.rest() && var9.equal(var17.first())) {
                        return module0034.f1959(var18);
                    }
                }
                var15 = var15.rest();
                var16 = var15.first();
            }
        }
        final SubLObject var19 = Values.arg2(var10.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f31894(var4, var9)));
        module0034.f1836(var12, var13, var14, var19, (SubLObject)ConsesLow.list(var4, var9));
        return module0034.f1959(var19);
    }
    
    public static SubLObject f31895(final SubLObject var1, SubLObject var10) {
        if (var10 == module0483.UNPROVIDED) {
            var10 = (SubLObject)module0483.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0483.UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var13 = f31893(var12, (SubLObject)module0483.UNPROVIDED);
        final SubLObject var14 = var11.secondMultipleValue();
        final SubLObject var15 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        SubLObject var16 = (SubLObject)module0483.NIL;
        final SubLObject var17 = module0369.f25492(var15);
        if (module0483.NIL == module0065.f4772(var17, (SubLObject)module0483.$ic81$)) {
            final SubLObject var87_113 = var17;
            if (module0483.NIL == module0065.f4775(var87_113, (SubLObject)module0483.$ic81$)) {
                final SubLObject var18 = module0065.f4740(var87_113);
                final SubLObject var19 = (SubLObject)module0483.NIL;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                SubLObject var31_114;
                SubLObject var26;
                SubLObject var27;
                SubLObject var28;
                for (var20 = Sequences.length(var18), var21 = (SubLObject)module0483.NIL, var21 = (SubLObject)module0483.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0483.ONE_INTEGER)) {
                    var22 = ((module0483.NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)module0483.ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (module0483.NIL == module0065.f4749(var23) || module0483.NIL == module0065.f4773((SubLObject)module0483.$ic81$)) {
                        if (module0483.NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)module0483.$ic81$;
                        }
                        var24 = module0369.f25744(var23);
                        var25 = (SubLObject)module0483.NIL;
                        var25 = var24.first();
                        while (module0483.NIL != var24) {
                            var31_114 = module0369.f25785(var25);
                            var26 = (SubLObject)module0483.NIL;
                            var26 = var31_114.first();
                            while (module0483.NIL != var31_114) {
                                if (module0483.NIL == var16) {
                                    var27 = module0773.f49487(var26, var23, (SubLObject)module0483.UNPROVIDED);
                                    var28 = module0773.f49519(var27);
                                    var16 = Mapping.mapcar((SubLObject)module0483.$ic94$, var28);
                                }
                                var31_114 = var31_114.rest();
                                var26 = var31_114.first();
                            }
                            var24 = var24.rest();
                            var25 = var24.first();
                        }
                    }
                }
            }
            final SubLObject var99_118 = var17;
            if (module0483.NIL == module0065.f4777(var99_118)) {
                final SubLObject var29 = module0065.f4738(var99_118);
                SubLObject var30 = (SubLObject)module0483.NIL;
                SubLObject var31 = (SubLObject)module0483.NIL;
                final Iterator var32 = Hashtables.getEntrySetIterator(var29);
                try {
                    while (Hashtables.iteratorHasNext(var32)) {
                        final Map.Entry var33 = Hashtables.iteratorNextEntry(var32);
                        var30 = Hashtables.getEntryKey(var33);
                        var31 = Hashtables.getEntryValue(var33);
                        SubLObject var34 = module0369.f25744(var31);
                        SubLObject var35 = (SubLObject)module0483.NIL;
                        var35 = var34.first();
                        while (module0483.NIL != var34) {
                            SubLObject var31_115 = module0369.f25785(var35);
                            SubLObject var36 = (SubLObject)module0483.NIL;
                            var36 = var31_115.first();
                            while (module0483.NIL != var31_115) {
                                if (module0483.NIL == var16) {
                                    final SubLObject var37 = module0773.f49487(var36, var31, (SubLObject)module0483.UNPROVIDED);
                                    final SubLObject var38 = module0773.f49519(var37);
                                    var16 = Mapping.mapcar((SubLObject)module0483.$ic94$, var38);
                                }
                                var31_115 = var31_115.rest();
                                var36 = var31_115.first();
                            }
                            var34 = var34.rest();
                            var35 = var34.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var32);
                }
            }
        }
        if (module0483.NIL != var16) {
            final SubLObject var39 = (SubLObject)ConsesLow.list(module0483.$ic91$, var12, module0202.f12787(var16, (SubLObject)module0483.UNPROVIDED));
            final SubLObject var40 = module0234.f15444(var1, var39, (SubLObject)module0483.T, (SubLObject)module0483.UNPROVIDED);
            final SubLObject var41 = module0191.f11990((SubLObject)module0483.$ic1$, var39, (SubLObject)module0483.UNPROVIDED, (SubLObject)module0483.UNPROVIDED);
            module0347.f23330(var41, var40, (SubLObject)module0483.UNPROVIDED);
        }
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31896() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31843", "S#31694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31844", "S#35181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31845", "S#35182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31847", "S#35183", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31848", "S#35184", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31846", "S#35185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31849", "S#35186", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31850", "S#35187", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31851", "S#35188", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31852", "S#35189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31854", "S#35190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31853", "S#35191", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31855", "S#35192", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31856", "S#35193", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31857", "S#35194", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31858", "S#24934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31859", "S#35195", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31860", "S#35196", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31861", "S#35197", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31862", "S#35198", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31863", "S#35199", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31864", "S#35200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31865", "S#35201", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31866", "S#35202", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31867", "S#35203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31868", "S#35204", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31869", "S#35205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31870", "S#35206", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31871", "S#35207", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31872", "S#35208", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31873", "S#35209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31874", "S#35210", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31875", "S#35211", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31876", "S#35212", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31877", "S#35213", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31878", "S#35214", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31879", "S#35215", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31880", "S#35216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31881", "S#35217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31884", "S#35218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31885", "S#35219", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31886", "S#35220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31887", "S#35221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31883", "S#35222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31888", "S#35223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31889", "S#35224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31882", "S#35225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31891", "S#35226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31890", "S#35227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31892", "S#35228", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31894", "S#35229", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31893", "S#35230", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0483", "f31895", "S#35231", 1, 1, false);
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31897() {
        module0483.$g3700$ = SubLFiles.defparameter("S#35232", module0018.$g661$.getGlobalValue());
        module0483.$g3582$ = SubLFiles.defparameter("S#35233", (SubLObject)module0483.$ic13$);
        module0483.$g3701$ = SubLFiles.defparameter("S#35234", module0483.$g3700$.getDynamicValue());
        module0483.$g3702$ = SubLFiles.defparameter("S#35235", module0483.$g3700$.getDynamicValue());
        return (SubLObject)module0483.NIL;
    }
    
    public static SubLObject f31898() {
        module0340.f22938(module0483.$ic3$);
        module0358.f23730((SubLObject)module0483.$ic4$, (SubLObject)module0483.$ic5$);
        module0012.f419((SubLObject)module0483.$ic10$);
        module0340.f22941((SubLObject)module0483.$ic11$, (SubLObject)module0483.$ic12$);
        module0340.f22941((SubLObject)module0483.$ic14$, (SubLObject)module0483.$ic15$);
        module0340.f22941((SubLObject)module0483.$ic20$, (SubLObject)module0483.$ic21$);
        module0340.f22938(module0483.$ic0$);
        module0358.f23773((SubLObject)module0483.$ic8$, module0483.$ic0$);
        module0340.f22941((SubLObject)module0483.$ic23$, (SubLObject)module0483.$ic24$);
        module0340.f22941((SubLObject)module0483.$ic25$, (SubLObject)module0483.$ic26$);
        module0340.f22941((SubLObject)module0483.$ic27$, (SubLObject)module0483.$ic28$);
        module0340.f22938(module0483.$ic29$);
        module0358.f23773((SubLObject)module0483.$ic8$, module0483.$ic29$);
        module0340.f22941((SubLObject)module0483.$ic41$, (SubLObject)module0483.$ic42$);
        module0340.f22938(module0483.$ic44$);
        module0358.f23730((SubLObject)module0483.$ic45$, (SubLObject)module0483.$ic46$);
        module0012.f419((SubLObject)module0483.$ic47$);
        module0340.f22941((SubLObject)module0483.$ic48$, (SubLObject)module0483.$ic49$);
        module0340.f22941((SubLObject)module0483.$ic50$, (SubLObject)module0483.$ic51$);
        module0340.f22941((SubLObject)module0483.$ic52$, (SubLObject)module0483.$ic53$);
        module0340.f22941((SubLObject)module0483.$ic54$, (SubLObject)module0483.$ic55$);
        module0340.f22941((SubLObject)module0483.$ic56$, (SubLObject)module0483.$ic57$);
        module0012.f419((SubLObject)module0483.$ic59$);
        module0012.f419((SubLObject)module0483.$ic66$);
        module0340.f22941((SubLObject)module0483.$ic67$, (SubLObject)module0483.$ic68$);
        module0012.f419((SubLObject)module0483.$ic70$);
        module0012.f419((SubLObject)module0483.$ic71$);
        module0340.f22941((SubLObject)module0483.$ic72$, (SubLObject)module0483.$ic73$);
        module0012.f419((SubLObject)module0483.$ic74$);
        module0012.f419((SubLObject)module0483.$ic76$);
        module0340.f22938(module0483.$ic78$);
        module0358.f23771((SubLObject)module0483.$ic8$, module0483.$ic78$, (SubLObject)module0483.ONE_INTEGER);
        module0340.f22941((SubLObject)module0483.$ic79$, (SubLObject)module0483.$ic80$);
        module0034.f1895((SubLObject)module0483.$ic82$);
        module0340.f22938(module0483.$ic91$);
        module0358.f23771((SubLObject)module0483.$ic8$, module0483.$ic91$, (SubLObject)module0483.ONE_INTEGER);
        module0340.f22941((SubLObject)module0483.$ic92$, (SubLObject)module0483.$ic93$);
        return (SubLObject)module0483.NIL;
    }
    
    public void declareFunctions() {
        f31896();
    }
    
    public void initializeVariables() {
        f31897();
    }
    
    public void runTopLevelForms() {
        f31898();
    }
    
    static {
        me = (SubLFile)new module0483();
        module0483.$g3700$ = null;
        module0483.$g3582$ = null;
        module0483.$g3701$ = null;
        module0483.$g3702$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $ic1$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic2$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence"));
        $ic4$ = SubLObjectFactory.makeKeyword("KNOWN-SENTENCE-POS-GAF");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35184", "CYC"));
        $ic6$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#17749", "CYC")))));
        $ic7$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic8$ = SubLObjectFactory.makeKeyword("POS");
        $ic9$ = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $ic10$ = SubLObjectFactory.makeSymbol("S#35184", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-KNOWN-SENTENCE-CHECK");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35232", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35186", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$knownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$knownSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $ic13$ = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $ic14$ = SubLObjectFactory.makeKeyword("REMOVAL-KNOWN-SENTENCE-POS-GAF");
        $ic15$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35188", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35190", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("POS"))), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35189", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35182", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$knownSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$knownSentence \n     (#$genls ?SPEC #$BinaryRelation))") });
        $ic16$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic17$ = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $ic18$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic19$ = SubLObjectFactory.makeKeyword("NEG");
        $ic20$ = SubLObjectFactory.makeKeyword("REMOVAL-KNOWN-SENTENCE-NEG-GAF");
        $ic21$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35192", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35193", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$knownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if the query succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$knownSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $ic22$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic23$ = SubLObjectFactory.makeKeyword("REMOVAL-UNKNOWN-SENTENCE-CHECK");
        $ic24$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35234", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35195", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$unknownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query fails"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$unknownSentence\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });
        $ic25$ = SubLObjectFactory.makeKeyword("REMOVAL-UNKNOWN-SENTENCE-POS-GAF");
        $ic26$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35196", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35197", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$unknownSentence (<predicate> . <fully-bound>))\n    by recursively querying sentence (<predicate> . <fully-bound>)\n    and succeeding if it fails"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$unknownSentence\n     (#$arg1Isa #$isa #$Microtheory))") });
        $ic27$ = SubLObjectFactory.makeKeyword("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF");
        $ic28$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35198", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35199", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$unknownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if it fails"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$unknownSentence\n     (#$not (#$isa #$myCreator #$DefaultMonotonicPredicate)))") });
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentenceWRTInferenceMode"));
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Shallow-CycInferenceMode"));
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Minimal-CycInferenceMode"));
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Extended-CycInferenceMode"));
        $ic33$ = SubLObjectFactory.makeInteger(100);
        $ic34$ = SubLObjectFactory.makeInteger(1000);
        $ic35$ = SubLObjectFactory.makeKeyword("SHALLOW");
        $ic36$ = SubLObjectFactory.makeKeyword("MINIMAL");
        $ic37$ = SubLObjectFactory.makeKeyword("EXTENDED");
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Maximal-CycInferenceMode"));
        $ic39$ = SubLObjectFactory.makeKeyword("MAXIMAL");
        $ic40$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK");
        $ic42$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentenceWRTInferenceMode")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentenceWRTInferenceMode")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35203", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35201", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35202", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$unknownSentenceWRTInferenceMode <inference-mode-term-p> <fully-bound>)\n    by recursively querying sentence <fully-bound> using the provided inference mode."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$unknownSentenceWRTInferenceMode #$Shallow-CycInferenceMode\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SpecifiedInferenceModeCluster"));
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $ic45$ = SubLObjectFactory.makeKeyword("TRUE-SENTENCE-POS-GAF");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35204", "CYC"));
        $ic47$ = SubLObjectFactory.makeSymbol("S#35204", "CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK");
        $ic49$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("True")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35235", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35206", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$trueSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$trueSentence\n     (#$thereExists ?COL\n      (#$disjointWith #$Collection ?COL)))") });
        $ic50$ = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-POS-GAF");
        $ic51$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35208", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35190", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("POS"))), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35189", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35236", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35182", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$trueSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$trueSentence \n     (#$isa #$Predicate ?WHAT))") });
        $ic52$ = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-GAF");
        $ic53$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35210", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35211", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$trueSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$trueSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $ic54$ = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-FALSE");
        $ic55$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), module0483.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), module0483.T, SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35182", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$trueSentence #$False)") });
        $ic56$ = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION");
        $ic57$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35212", "CYC"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0483.THREE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35213", "CYC"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence \n      (#$not \n       (#$thereExists ?EATER \n        (#$thereExists ?EATING \n         (#$and \n          (#$isa ?EATING #$EatingEvent) \n          (#$consumedObject ?EATING ?EATER) \n          (#$doneBy ?EATING ?EATER)))))))") });
        $ic58$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic59$ = SubLObjectFactory.makeSymbol("S#35212", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("APPEND");
        $ic61$ = SubLObjectFactory.makeSymbol("SENTENCE-FREE-VARIABLES");
        $ic62$ = SubLObjectFactory.makeSymbol("NEGATE");
        $ic63$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
        $ic64$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?"), (SubLObject)module0483.T);
        $ic66$ = SubLObjectFactory.makeSymbol("S#35213", "CYC");
        $ic67$ = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION");
        $ic68$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35214", "CYC"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0483.THREE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35215", "CYC"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence\n      (#$forAll ?PRED\n       (#$implies\n        (#$memberOfList ?PRED\n         (#$TheList #$fieldsOfCompetence \n \t\t    #$primarySupervisor\n \t\t    (#$IsaPredFn #$ProjectManager)\n \t\t    (#$IsaPredFn #$OntologicalEngineer)\n \t\t    (#$IsaPredFn #$ComputerProgrammer) #$fieldsOfCompetence))\n        (#$thereExists ?CONSTRAINT\n \t (#$thereExists ?M\n          (#$argIsa ?PRED ?M ?CONSTRAINT)))))))") });
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList"));
        $ic70$ = SubLObjectFactory.makeSymbol("S#35214", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#35215", "CYC");
        $ic72$ = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION");
        $ic73$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TREE-FIND"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#35216", "CYC")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0483.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35219", "CYC"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$UniversalVocabularyMt\n     (#$trueSentence\n      (#$forAll ?N\n       (#$implies\n        (#$elementOf ?N (#$TheSet 0 1))\n        (#$evaluate ?N (#$TimesFn ?N ?N))))))") });
        $ic74$ = SubLObjectFactory.makeSymbol("S#35216", "CYC");
        $ic75$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic76$ = SubLObjectFactory.makeSymbol("S#35219", "CYC");
        $ic77$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic78$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-Simple"));
        $ic79$ = SubLObjectFactory.makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE");
        $ic80$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-Simple")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-Simple")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0483.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35228", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sentenceJustifications-Simple <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-Simple (#$genls #$Dog #$Animal) ?WHY))") });
        $ic81$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic82$ = SubLObjectFactory.makeSymbol("S#35230", "CYC");
        $ic83$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic84$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic85$ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic86$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic87$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic88$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $ic89$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic90$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic91$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-ProofViewSummary"));
        $ic92$ = SubLObjectFactory.makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY");
        $ic93$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-ProofViewSummary")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-ProofViewSummary")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0483.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35231", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sentenceJustifications-ProofViewSummary <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-ProofViewSummary (#$genls #$Dog #$Animal) ?WHY))") });
        $ic94$ = SubLObjectFactory.makeSymbol("S#35237", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0483.class
	Total time: 466 ms
	
	Decompiled with Procyon 0.5.32.
*/