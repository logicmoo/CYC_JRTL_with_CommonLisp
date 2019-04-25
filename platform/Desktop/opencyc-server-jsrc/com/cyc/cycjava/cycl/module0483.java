package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var3.eql($ic0$)) {
            final SubLObject var5 = module0202.f12643(var3, var4);
            final SubLObject var6 = module0191.f11990((SubLObject)$ic1$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return var6;
        }
        return module0191.f11990((SubLObject)$ic2$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31845(final SubLObject var7) {
        final SubLObject var8 = module0205.f13387(var7, (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list(f31846(var8));
    }
    
    public static SubLObject f31847(SubLObject var1, SubLObject var9, final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0202.f12884(var1)) {
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
        final SubLObject var22 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0337.f22626((SubLObject)$ic6$, var22)) {
            return (SubLObject)$ic7$;
        }
        final SubLObject var23 = module0358.f23660(var22, (SubLObject)$ic8$, var20, var21);
        if (NIL != module0358.f23663(var23, (SubLObject)$ic9$)) {
            return var23;
        }
        return (SubLObject)$ic7$;
    }
    
    public static SubLObject f31846(final SubLObject var4) {
        return f31844($ic3$, var4);
    }
    
    public static SubLObject f31849(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        if (NIL != f31850(var11, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = f31846(var11);
            module0347.f23330(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31850(final SubLObject var4, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23494(var4, var9, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f31851(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        SubLObject var13 = f31847(var12, module0147.$g2095$.getDynamicValue(var11), (SubLObject)$ic8$);
        if (!var13.isZero()) {
            var13 = Numbers.add(var13, $g3582$.getDynamicValue(var11));
        }
        if (NIL != module0193.f12105(var1)) {
            var13 = Numbers.min(var13, $g3700$.getDynamicValue(var11));
        }
        return var13;
    }
    
    public static SubLObject f31852(final SubLObject var8) {
        return module0052.f3709(f31853(var8, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31854(final SubLObject var8, final SubLObject var10) {
        if (NIL != module0193.f12105(var8)) {
            return (SubLObject)$ic16$;
        }
        if (NIL != module0337.f22626((SubLObject)$ic6$, var8)) {
            return (SubLObject)$ic16$;
        }
        final SubLObject var11 = module0411.f28643(var8, var10, (SubLObject)UNPROVIDED);
        if (NIL != module0360.f23927(var11, (SubLObject)$ic17$)) {
            return var11;
        }
        return (SubLObject)$ic16$;
    }
    
    public static SubLObject f31853(final SubLObject var1, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23493(var1, var9, (SubLObject)$ic18$);
    }
    
    public static SubLObject f31855(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0205.f13379(var12, (SubLObject)UNPROVIDED);
        SubLObject var14 = f31847(var13, module0147.$g2095$.getDynamicValue(var11), (SubLObject)$ic19$);
        if (!var14.isZero()) {
            var14 = Numbers.add(var14, $g3582$.getDynamicValue(var11));
        }
        var14 = Numbers.min(var14, $g3700$.getDynamicValue(var11));
        return var14;
    }
    
    public static SubLObject f31856(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0205.f13379(var11, (SubLObject)UNPROVIDED);
        if (NIL != f31857(var12, (SubLObject)UNPROVIDED)) {
            final SubLObject var13 = f31846(var11);
            module0347.f23330(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31857(final SubLObject var1, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23493(var1, var9, (SubLObject)$ic22$);
    }
    
    public static SubLObject f31858(final SubLObject var4) {
        return f31844($ic0$, var4);
    }
    
    public static SubLObject f31859(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var13 = f31850(var12, (SubLObject)UNPROVIDED);
        final SubLObject var14 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        if (NIL == var13 && NIL != var14) {
            final SubLObject var15 = f31858(var12);
            module0347.f23330(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31860(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return Numbers.min($g3701$.getDynamicValue(var11), f31851(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31861(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var13 = f31853(var12, (SubLObject)UNPROVIDED);
        final SubLObject var14 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        if (NIL == var13 && NIL != var14) {
            final SubLObject var15 = f31858(var12);
            module0347.f23330(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31862(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return Numbers.min($g3701$.getDynamicValue(var11), f31855(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31863(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0205.f13379(var11, (SubLObject)UNPROVIDED);
        if (NIL == f31857(var12, (SubLObject)UNPROVIDED)) {
            final SubLObject var13 = f31858(var11);
            module0347.f23330(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31864(final SubLObject var4) {
        return f31844($ic29$, var4);
    }
    
    public static SubLObject f31865(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        if (var12.eql($ic30$)) {
            return Numbers.multiply((SubLObject)ONE_INTEGER, $g3701$.getDynamicValue(var11));
        }
        if (var12.eql($ic31$)) {
            return Numbers.multiply((SubLObject)TEN_INTEGER, $g3701$.getDynamicValue(var11));
        }
        if (var12.eql($ic32$)) {
            return Numbers.multiply((SubLObject)$ic33$, $g3701$.getDynamicValue(var11));
        }
        return Numbers.multiply((SubLObject)$ic34$, $g3701$.getDynamicValue(var11));
    }
    
    public static SubLObject f31866(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0349.$g2987$.currentBinding(var11);
        try {
            module0349.$g2987$.bind((SubLObject)(var12.eql($ic30$) ? module0412.f28715((SubLObject)$ic35$) : (var12.eql($ic31$) ? module0412.f28715((SubLObject)$ic36$) : (var12.eql($ic32$) ? module0412.f28715((SubLObject)$ic37$) : (var12.eql($ic38$) ? module0412.f28715((SubLObject)$ic39$) : NIL)))), var11);
            final SubLObject var14 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            var11.resetMultipleValues();
            final SubLObject var15 = f31850(var14, (SubLObject)UNPROVIDED);
            final SubLObject var16 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (NIL == var15 && NIL != var16) {
                final SubLObject var17 = f31858(var14);
                module0347.f23330(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            return (SubLObject)NIL;
        }
        finally {
            module0349.$g2987$.rebind(var13, var11);
        }
    }
    
    public static SubLObject f31867(final SubLObject var30) {
        return module0259.f16891(var30, $ic43$);
    }
    
    public static SubLObject f31868(final SubLObject var1, final SubLObject var20, final SubLObject var21) {
        return f31848(var1, var20, var21);
    }
    
    public static SubLObject f31869(final SubLObject var4) {
        return f31844($ic44$, var4);
    }
    
    public static SubLObject f31870(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        if (NIL != f31871(var11, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = f31869(var11);
            module0347.f23330(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31871(final SubLObject var4, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23495(var4, var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31872(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        return f31851(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31873(final SubLObject var8) {
        return module0052.f3709(f31853(var8, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31874(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        return f31855(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31875(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0205.f13379(var11, (SubLObject)UNPROVIDED);
        final SubLObject var13 = f31857(var12, (SubLObject)UNPROVIDED);
        if (NIL != var13) {
            SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                final SubLObject var16 = module0233.f15361(var15, var12);
                final SubLObject var17 = f31869(module0205.f13338(var16));
                module0347.f23330(var17, var15, (SubLObject)UNPROVIDED);
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31876(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        var11.resetMultipleValues();
        final SubLObject var12 = module0202.f12795(var1);
        SubLObject var13 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        while (NIL != module0202.f12604(var13)) {
            var13 = module0202.f12668(var13);
        }
        var13 = module0370.f25852(var13, module0147.f9496(), (SubLObject)T);
        if (NIL == module0202.f12673(var13) && NIL != module0202.f12594(var13) && NIL == module0202.f12673(var13)) {
            final SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)ZERO_INTEGER;
            SubLObject var16 = (SubLObject)NIL;
            final SubLObject var17 = module0205.f13207(var14, (SubLObject)$ic58$);
            SubLObject var18;
            SubLObject var19;
            for (var18 = (SubLObject)NIL, var18 = var17; NIL == var16 && NIL != var18; var18 = var18.rest()) {
                var19 = var18.first();
                if (NIL != module0206.f13487(var19)) {
                    var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER);
                }
                else {
                    var16 = (SubLObject)T;
                }
            }
            if (NIL == var16 && var15.numGE((SubLObject)TWO_INTEGER)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31877(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        var11.resetMultipleValues();
        final SubLObject var12 = module0202.f12795(var1);
        SubLObject var13 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        while (NIL != module0202.f12604(var13)) {
            var13 = module0202.f12668(var13);
        }
        final SubLObject var14 = module0147.f9496();
        final SubLObject var15 = module0282.f18738(var13, module0147.f9496());
        SubLObject var17;
        final SubLObject var16 = var17 = module0205.f13207(var15, (SubLObject)$ic58$);
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = Sequences.remove(var18, module0205.f13207(var15, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var20 = module0202.f12911(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var21 = Functions.apply(Symbols.symbol_function((SubLObject)$ic60$), Mapping.mapcar((SubLObject)$ic61$, var19));
            SubLObject var31_47;
            final SubLObject var22 = var31_47 = conses_high.set_difference(var20, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var23 = (SubLObject)NIL;
            var23 = var31_47.first();
            while (NIL != var31_47) {
                var18 = module0202.f12775(var23, var18);
                var31_47 = var31_47.rest();
                var23 = var31_47.first();
            }
            final SubLObject var24 = Mapping.mapcar((SubLObject)$ic62$, var19);
            final SubLObject var25 = (SubLObject)ConsesLow.list($ic63$, reader.bq_cons($ic64$, ConsesLow.append(var24, (SubLObject)NIL)), var18);
            var11.resetMultipleValues();
            final SubLObject var26 = module0434.f30592(var25, var14, (SubLObject)$ic65$);
            final SubLObject var27 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (NIL == module0360.f23866(var27) && NIL != var26) {
                final SubLObject var28 = module0191.f11990((SubLObject)$ic2$, var25, var14, (SubLObject)UNPROVIDED);
                module0347.f23330(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31878(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        var11.resetMultipleValues();
        final SubLObject var12 = module0202.f12795(var1);
        SubLObject var13 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        while (NIL != module0202.f12604(var13)) {
            var13 = module0202.f12668(var13);
        }
        if (NIL != module0202.f12597(var13)) {
            var13 = module0205.f13203(var13, (SubLObject)UNPROVIDED);
            if (module0205.f13132(var13).eql($ic69$) && NIL != module0206.f13497(module0205.f13203(var13, (SubLObject)UNPROVIDED)) && NIL != module0202.f12674(module0205.f13204(var13, (SubLObject)UNPROVIDED))) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31879(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0147.f9496();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        var11.resetMultipleValues();
        final SubLObject var17 = module0202.f12795(var1);
        SubLObject var18 = var11.secondMultipleValue();
        var11.resetMultipleValues();
        while (NIL != module0202.f12604(var18)) {
            var18 = module0202.f12668(var18);
        }
        if (NIL != module0202.f12597(var18)) {
            var15 = module0205.f13204(var18, (SubLObject)UNPROVIDED);
            var18 = module0205.f13203(var18, (SubLObject)UNPROVIDED);
            if (module0205.f13132(var18).eql($ic69$)) {
                var14 = module0205.f13203(var18, (SubLObject)UNPROVIDED);
                var13 = module0205.f13204(var18, (SubLObject)UNPROVIDED);
            }
        }
        SubLObject var19 = module0202.f12751(var13);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            final SubLObject var21 = module0233.f15362(module0510.f32487((SubLObject)ConsesLow.list(var14), (SubLObject)ConsesLow.list(var20)), var15);
            var11.resetMultipleValues();
            final SubLObject var22 = module0434.f30592(var21, var12, (SubLObject)UNPROVIDED);
            final SubLObject var23 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (NIL != module0360.f23866(var23) || NIL == var22) {
                return (SubLObject)NIL;
            }
            var16 = (SubLObject)ConsesLow.cons(var21, var16);
            var19 = var19.rest();
            var20 = var19.first();
        }
        module0347.f23330(module0191.f11990((SubLObject)$ic2$, module0202.f12773(var16), var12, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31880(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var5.resetMultipleValues();
        final SubLObject var6 = f31881(var4);
        SubLObject var7 = var5.secondMultipleValue();
        final SubLObject var8 = var5.thirdMultipleValue();
        var5.resetMultipleValues();
        if (NIL != var7 && NIL != var8) {
            final SubLObject var9 = module0147.f9496();
            var7 = f31882(var7, var6);
            return f31883(var7, var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31881(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var5.resetMultipleValues();
        final SubLObject var6 = f31884(var4, (SubLObject)NIL);
        final SubLObject var7 = var5.secondMultipleValue();
        final SubLObject var8 = var5.thirdMultipleValue();
        var5.resetMultipleValues();
        return Values.values(Sequences.nreverse(var6), var7, var8);
    }
    
    public static SubLObject f31884(final SubLObject var4, final SubLObject var57) {
        if (NIL != module0202.f12597(var4)) {
            final SubLObject var58 = module0205.f13203(var4, (SubLObject)UNPROVIDED);
            final SubLObject var59 = module0205.f13204(var4, (SubLObject)UNPROVIDED);
            return Values.values(var57, var58, var59);
        }
        if (NIL != module0202.f12604(var4)) {
            final SubLObject var60 = module0205.f13203(var4, (SubLObject)UNPROVIDED);
            final SubLObject var61 = module0205.f13204(var4, (SubLObject)UNPROVIDED);
            return f31884(var61, (SubLObject)ConsesLow.cons(var60, var57));
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f31885(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0147.f9496();
        final SubLObject var13 = module0205.f13203(var1, (SubLObject)UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var14 = f31881(var13);
        final SubLObject var15 = var11.secondMultipleValue();
        final SubLObject var16 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        final SubLObject var17 = f31886(var15, var12);
        final SubLObject var18 = f31887(var16, var12);
        SubLObject var20;
        final SubLObject var19 = var20 = module0434.f30594(var15, var12, var17);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            final SubLObject var22 = module0233.f15362(var21, var16);
            if (NIL == module0434.f30594(var22, var12, var18)) {
                return (SubLObject)NIL;
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        final SubLObject var23 = module0191.f11990((SubLObject)$ic1$, var1, var12, (SubLObject)$ic75$);
        module0347.f23330(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31886(final SubLObject var4, final SubLObject var9) {
        SubLObject var10 = module0349.f23492(var4, var9);
        var10 = conses_high.putf(var10, (SubLObject)$ic77$, (SubLObject)NIL);
        return var10;
    }
    
    public static SubLObject f31887(final SubLObject var4, final SubLObject var9) {
        return f31886(var4, var9);
    }
    
    public static SubLObject f31883(final SubLObject var4, final SubLObject var9) {
        if (NIL != module0206.f13433(var4)) {
            return f31888(var4, var9);
        }
        if (NIL != module0202.f12595(var4) && NIL != f31889(var4, var9)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31888(final SubLObject var1, final SubLObject var9) {
        return (SubLObject)makeBoolean($ic16$ == module0411.f28643(var1, (SubLObject)$ic8$, var9) || NIL != module0350.f23560(var1, var9));
    }
    
    public static SubLObject f31889(final SubLObject var68, final SubLObject var9) {
        SubLObject var70;
        final SubLObject var69 = var70 = module0205.f13377(var68, (SubLObject)UNPROVIDED);
        SubLObject var71 = (SubLObject)NIL;
        var71 = var70.first();
        while (NIL != var70) {
            if (NIL != f31883(var71, var9)) {
                final SubLObject var72 = Sequences.remove(var71, var69, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var73 = module0193.f12102(var71);
                SubLObject var74 = (SubLObject)NIL;
                if (NIL == var74) {
                    SubLObject var75 = var72;
                    SubLObject var76 = (SubLObject)NIL;
                    var76 = var75.first();
                    while (NIL == var74 && NIL != var75) {
                        if (NIL == f31883(var76, var9) && NIL == f31890(var76, var73)) {
                            var74 = var76;
                        }
                        var75 = var75.rest();
                        var76 = var75.first();
                    }
                }
                if (NIL == var74) {
                    return (SubLObject)T;
                }
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31882(SubLObject var4, final SubLObject var57) {
        final SubLObject var58 = f31891(var57);
        if (NIL != var58) {
            var4 = module0233.f15362(var58, var4);
        }
        return var4;
    }
    
    public static SubLObject f31891(final SubLObject var77) {
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        var79 = var77;
        var80 = var79.first();
        for (var81 = (SubLObject)ZERO_INTEGER; NIL != var79; var79 = var79.rest(), var80 = var79.first(), var81 = Numbers.add((SubLObject)ONE_INTEGER, var81)) {
            final SubLObject var82 = module0193.f12075(var81);
            var78 = module0233.f15345(var80, var82, var78);
        }
        return module0234.f15468(Sequences.nreverse(var78));
    }
    
    public static SubLObject f31890(final SubLObject var81, final SubLObject var82) {
        final SubLObject var83 = module0193.f12102(var81);
        return conses_high.subsetp(var83, var82, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31892(final SubLObject var1, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var13 = f31893(var12, (SubLObject)UNPROVIDED);
        final SubLObject var14 = var11.secondMultipleValue();
        final SubLObject var15 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = inference_datastructures_inference_oc.f25492(var15);
        if (NIL == module0065.f4772(var17, (SubLObject)$ic81$)) {
            final SubLObject var87_88 = var17;
            if (NIL == module0065.f4775(var87_88, (SubLObject)$ic81$)) {
                final SubLObject var18 = module0065.f4740(var87_88);
                final SubLObject var19 = (SubLObject)NIL;
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
                for (var20 = Sequences.length(var18), var21 = (SubLObject)NIL, var21 = (SubLObject)ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER)) {
                    var22 = ((NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (NIL == module0065.f4749(var23) || NIL == module0065.f4773((SubLObject)$ic81$)) {
                        if (NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)$ic81$;
                        }
                        var24 = inference_datastructures_inference_oc.f25744(var23);
                        var25 = (SubLObject)NIL;
                        var25 = var24.first();
                        while (NIL != var24) {
                            var26 = inference_datastructures_inference_oc.f25775(var25);
                            var27 = conses_high.copy_list(var26);
                            while (NIL != var27) {
                                var28 = var27.first();
                                var27 = var27.rest();
                                var29 = ((NIL != assertion_handles_oc.f11035(var28)) ? var28 : module0191.f11967(var28));
                                if (NIL != module0279.f18551(var12, var29, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
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
            if (NIL == module0065.f4777(var99_100)) {
                final SubLObject var30 = module0065.f4738(var99_100);
                SubLObject var31 = (SubLObject)NIL;
                SubLObject var32 = (SubLObject)NIL;
                final Iterator var33 = Hashtables.getEntrySetIterator(var30);
                try {
                    while (Hashtables.iteratorHasNext(var33)) {
                        final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                        var31 = Hashtables.getEntryKey(var34);
                        var32 = Hashtables.getEntryValue(var34);
                        SubLObject var35 = inference_datastructures_inference_oc.f25744(var32);
                        SubLObject var36 = (SubLObject)NIL;
                        var36 = var35.first();
                        while (NIL != var35) {
                            final SubLObject var37 = inference_datastructures_inference_oc.f25775(var36);
                            SubLObject var38 = conses_high.copy_list(var37);
                            while (NIL != var38) {
                                final SubLObject var39 = var38.first();
                                var38 = var38.rest();
                                final SubLObject var40 = (NIL != assertion_handles_oc.f11035(var39)) ? var39 : module0191.f11967(var39);
                                if (NIL != module0279.f18551(var12, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
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
        if (NIL != var16) {
            final SubLObject var41 = (SubLObject)ConsesLow.list($ic78$, var12, module0202.f12681(var16));
            final SubLObject var42 = module0234.f15444(var1, var41, (SubLObject)T, (SubLObject)UNPROVIDED);
            final SubLObject var43 = module0191.f11990((SubLObject)$ic1$, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0347.f23330(var43, var42, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31894(final SubLObject var4, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var10 = module0339.f22757();
        SubLObject var11 = module0349.f23492(var4, var9);
        var11 = conses_high.putf(var11, (SubLObject)$ic83$, (SubLObject)T);
        var11 = conses_high.putf(var11, (SubLObject)$ic84$, (SubLObject)ONE_INTEGER);
        var11 = conses_high.putf(var11, (SubLObject)$ic85$, (SubLObject)T);
        var11 = conses_high.putf(var11, (SubLObject)$ic86$, module0411.f28572(var10, (SubLObject)$ic86$, (SubLObject)UNPROVIDED));
        var11 = conses_high.putf(var11, (SubLObject)$ic87$, module0411.f28572(var10, (SubLObject)$ic87$, (SubLObject)UNPROVIDED));
        var11 = conses_high.putf(var11, (SubLObject)$ic88$, inference_datastructures_inference_oc.f25610(var10));
        var11 = conses_high.putf(var11, (SubLObject)$ic89$, inference_datastructures_inference_oc.f25511(var10));
        return module0434.f30592(var4, var9, var11);
    }
    
    public static SubLObject f31893(final SubLObject var4, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0034.$g879$.getDynamicValue(var10);
        SubLObject var12 = (SubLObject)NIL;
        if (NIL == var11) {
            return f31894(var4, var9);
        }
        var12 = module0034.f1857(var11, (SubLObject)$ic82$, (SubLObject)UNPROVIDED);
        if (NIL == var12) {
            var12 = module0034.f1807(module0034.f1842(var11), (SubLObject)$ic82$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var11, (SubLObject)$ic82$, var12);
        }
        final SubLObject var13 = module0034.f1782(var4, var9);
        final SubLObject var14 = module0034.f1814(var12, var13, (SubLObject)UNPROVIDED);
        if (var14 != $ic90$) {
            SubLObject var15 = var14;
            SubLObject var16 = (SubLObject)NIL;
            var16 = var15.first();
            while (NIL != var15) {
                SubLObject var17 = var16.first();
                final SubLObject var18 = conses_high.second(var16);
                if (var4.equal(var17.first())) {
                    var17 = var17.rest();
                    if (NIL != var17 && NIL == var17.rest() && var9.equal(var17.first())) {
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
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        var11.resetMultipleValues();
        final SubLObject var13 = f31893(var12, (SubLObject)UNPROVIDED);
        final SubLObject var14 = var11.secondMultipleValue();
        final SubLObject var15 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = inference_datastructures_inference_oc.f25492(var15);
        if (NIL == module0065.f4772(var17, (SubLObject)$ic81$)) {
            final SubLObject var87_113 = var17;
            if (NIL == module0065.f4775(var87_113, (SubLObject)$ic81$)) {
                final SubLObject var18 = module0065.f4740(var87_113);
                final SubLObject var19 = (SubLObject)NIL;
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
                for (var20 = Sequences.length(var18), var21 = (SubLObject)NIL, var21 = (SubLObject)ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER)) {
                    var22 = ((NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (NIL == module0065.f4749(var23) || NIL == module0065.f4773((SubLObject)$ic81$)) {
                        if (NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)$ic81$;
                        }
                        var24 = inference_datastructures_inference_oc.f25744(var23);
                        var25 = (SubLObject)NIL;
                        var25 = var24.first();
                        while (NIL != var24) {
                            var31_114 = inference_datastructures_inference_oc.f25785(var25);
                            var26 = (SubLObject)NIL;
                            var26 = var31_114.first();
                            while (NIL != var31_114) {
                                if (NIL == var16) {
                                    var27 = module0773.f49487(var26, var23, (SubLObject)UNPROVIDED);
                                    var28 = module0773.f49519(var27);
                                    var16 = Mapping.mapcar((SubLObject)$ic94$, var28);
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
            if (NIL == module0065.f4777(var99_118)) {
                final SubLObject var29 = module0065.f4738(var99_118);
                SubLObject var30 = (SubLObject)NIL;
                SubLObject var31 = (SubLObject)NIL;
                final Iterator var32 = Hashtables.getEntrySetIterator(var29);
                try {
                    while (Hashtables.iteratorHasNext(var32)) {
                        final Map.Entry var33 = Hashtables.iteratorNextEntry(var32);
                        var30 = Hashtables.getEntryKey(var33);
                        var31 = Hashtables.getEntryValue(var33);
                        SubLObject var34 = inference_datastructures_inference_oc.f25744(var31);
                        SubLObject var35 = (SubLObject)NIL;
                        var35 = var34.first();
                        while (NIL != var34) {
                            SubLObject var31_115 = inference_datastructures_inference_oc.f25785(var35);
                            SubLObject var36 = (SubLObject)NIL;
                            var36 = var31_115.first();
                            while (NIL != var31_115) {
                                if (NIL == var16) {
                                    final SubLObject var37 = module0773.f49487(var36, var31, (SubLObject)UNPROVIDED);
                                    final SubLObject var38 = module0773.f49519(var37);
                                    var16 = Mapping.mapcar((SubLObject)$ic94$, var38);
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
        if (NIL != var16) {
            final SubLObject var39 = (SubLObject)ConsesLow.list($ic91$, var12, module0202.f12787(var16, (SubLObject)UNPROVIDED));
            final SubLObject var40 = module0234.f15444(var1, var39, (SubLObject)T, (SubLObject)UNPROVIDED);
            final SubLObject var41 = module0191.f11990((SubLObject)$ic1$, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0347.f23330(var41, var40, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31897() {
        $g3700$ = SubLFiles.defparameter("S#35232", module0018.$g661$.getGlobalValue());
        $g3582$ = SubLFiles.defparameter("S#35233", (SubLObject)$ic13$);
        $g3701$ = SubLFiles.defparameter("S#35234", $g3700$.getDynamicValue());
        $g3702$ = SubLFiles.defparameter("S#35235", $g3700$.getDynamicValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31898() {
        module0340.f22938($ic3$);
        module0358.f23730((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0012.f419((SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0340.f22941((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0340.f22938($ic0$);
        module0358.f23773((SubLObject)$ic8$, $ic0$);
        module0340.f22941((SubLObject)$ic23$, (SubLObject)$ic24$);
        module0340.f22941((SubLObject)$ic25$, (SubLObject)$ic26$);
        module0340.f22941((SubLObject)$ic27$, (SubLObject)$ic28$);
        module0340.f22938($ic29$);
        module0358.f23773((SubLObject)$ic8$, $ic29$);
        module0340.f22941((SubLObject)$ic41$, (SubLObject)$ic42$);
        module0340.f22938($ic44$);
        module0358.f23730((SubLObject)$ic45$, (SubLObject)$ic46$);
        module0012.f419((SubLObject)$ic47$);
        module0340.f22941((SubLObject)$ic48$, (SubLObject)$ic49$);
        module0340.f22941((SubLObject)$ic50$, (SubLObject)$ic51$);
        module0340.f22941((SubLObject)$ic52$, (SubLObject)$ic53$);
        module0340.f22941((SubLObject)$ic54$, (SubLObject)$ic55$);
        module0340.f22941((SubLObject)$ic56$, (SubLObject)$ic57$);
        module0012.f419((SubLObject)$ic59$);
        module0012.f419((SubLObject)$ic66$);
        module0340.f22941((SubLObject)$ic67$, (SubLObject)$ic68$);
        module0012.f419((SubLObject)$ic70$);
        module0012.f419((SubLObject)$ic71$);
        module0340.f22941((SubLObject)$ic72$, (SubLObject)$ic73$);
        module0012.f419((SubLObject)$ic74$);
        module0012.f419((SubLObject)$ic76$);
        module0340.f22938($ic78$);
        module0358.f23771((SubLObject)$ic8$, $ic78$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic79$, (SubLObject)$ic80$);
        module0034.f1895((SubLObject)$ic82$);
        module0340.f22938($ic91$);
        module0358.f23771((SubLObject)$ic8$, $ic91$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic92$, (SubLObject)$ic93$);
        return (SubLObject)NIL;
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
        $g3700$ = null;
        $g3582$ = null;
        $g3701$ = null;
        $g3702$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("unknownSentence"));
        $ic1$ = makeKeyword("OPAQUE");
        $ic2$ = makeKeyword("QUERY");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("knownSentence"));
        $ic4$ = makeKeyword("KNOWN-SENTENCE-POS-GAF");
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#35184", "CYC"));
        $ic6$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#17749", "CYC")))));
        $ic7$ = makeKeyword("PREFERRED");
        $ic8$ = makeKeyword("POS");
        $ic9$ = makeKeyword("DISPREFERRED");
        $ic10$ = makeSymbol("S#35184", "CYC");
        $ic11$ = makeKeyword("REMOVAL-KNOWN-SENTENCE-CHECK");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING")))))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35232", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35186", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $ic13$ = (SubLFloat)makeDouble(0.1);
        $ic14$ = makeKeyword("REMOVAL-KNOWN-SENTENCE-POS-GAF");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("S#35188", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35236", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35190", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35236", "CYC")), (SubLObject)makeKeyword("POS"))), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35236", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35236", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35189", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18075", "CYC"), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35236", "CYC")))), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35182", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence \n     (#$genls ?SPEC #$BinaryRelation))") });
        $ic16$ = makeKeyword("COMPLETE");
        $ic17$ = makeKeyword("INCOMPLETE");
        $ic18$ = makeKeyword("TRUE");
        $ic19$ = makeKeyword("NEG");
        $ic20$ = makeKeyword("REMOVAL-KNOWN-SENTENCE-NEG-GAF");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#35192", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35193", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $ic22$ = makeKeyword("FALSE");
        $ic23$ = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-CHECK");
        $ic24$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("unknownSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("unknownSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")))))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35234", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35195", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });
        $ic25$ = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-POS-GAF");
        $ic26$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("unknownSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("unknownSentence")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("S#35196", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35197", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (<predicate> . <fully-bound>))\n    by recursively querying sentence (<predicate> . <fully-bound>)\n    and succeeding if it fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$arg1Isa #$isa #$Microtheory))") });
        $ic27$ = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF");
        $ic28$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("unknownSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#35198", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35199", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if it fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$not (#$isa #$myCreator #$DefaultMonotonicPredicate)))") });
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("unknownSentenceWRTInferenceMode"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("Shallow-CycInferenceMode"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("Minimal-CycInferenceMode"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("Extended-CycInferenceMode"));
        $ic33$ = makeInteger(100);
        $ic34$ = makeInteger(1000);
        $ic35$ = makeKeyword("SHALLOW");
        $ic36$ = makeKeyword("MINIMAL");
        $ic37$ = makeKeyword("EXTENDED");
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("Maximal-CycInferenceMode"));
        $ic39$ = makeKeyword("MAXIMAL");
        $ic40$ = makeSymbol("S#5859", "CYC");
        $ic41$ = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK");
        $ic42$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("unknownSentenceWRTInferenceMode")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("unknownSentenceWRTInferenceMode")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35203", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35201", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35202", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentenceWRTInferenceMode <inference-mode-term-p> <fully-bound>)\n    by recursively querying sentence <fully-bound> using the provided inference mode."), makeKeyword("EXAMPLE"), makeString("(#$unknownSentenceWRTInferenceMode #$Shallow-CycInferenceMode\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("SpecifiedInferenceModeCluster"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("trueSentence"));
        $ic45$ = makeKeyword("TRUE-SENTENCE-POS-GAF");
        $ic46$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#35204", "CYC"));
        $ic47$ = makeSymbol("S#35204", "CYC");
        $ic48$ = makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK");
        $ic49$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING")))))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), constant_handles_oc.f8479((SubLObject)makeString("True")))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35235", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35206", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence\n     (#$thereExists ?COL\n      (#$disjointWith #$Collection ?COL)))") });
        $ic50$ = makeKeyword("REMOVAL-TRUE-SENTENCE-POS-GAF");
        $ic51$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("S#35208", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35236", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35190", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35236", "CYC")), (SubLObject)makeKeyword("POS"))), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35236", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35236", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35189", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18075", "CYC"), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35236", "CYC")))), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35182", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence \n     (#$isa #$Predicate ?WHAT))") });
        $ic52$ = makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-GAF");
        $ic53$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#35210", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35211", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $ic54$ = makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-FALSE");
        $ic55$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), constant_handles_oc.f8479((SubLObject)makeString("False"))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), T, makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35182", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), constant_handles_oc.f8479((SubLObject)makeString("True"))))), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence #$False)") });
        $ic56$ = makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION");
        $ic57$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("forAll")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VARIABLE-P")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("S#35212", "CYC"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("S#35213", "CYC"), makeKeyword("EXAMPLE"), makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence \n      (#$not \n       (#$thereExists ?EATER \n        (#$thereExists ?EATING \n         (#$and \n          (#$isa ?EATING #$EatingEvent) \n          (#$consumedObject ?EATING ?EATER) \n          (#$doneBy ?EATING ?EATER)))))))") });
        $ic58$ = makeKeyword("IGNORE");
        $ic59$ = makeSymbol("S#35212", "CYC");
        $ic60$ = makeSymbol("APPEND");
        $ic61$ = makeSymbol("SENTENCE-FREE-VARIABLES");
        $ic62$ = makeSymbol("NEGATE");
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic65$ = ConsesLow.list((SubLObject)makeKeyword("CONDITIONAL-SENTENCE?"), (SubLObject)T);
        $ic66$ = makeSymbol("S#35213", "CYC");
        $ic67$ = makeKeyword("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION");
        $ic68$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("forAll")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VARIABLE-P")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("S#35214", "CYC"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("S#35215", "CYC"), makeKeyword("EXAMPLE"), makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence\n      (#$forAll ?PRED\n       (#$implies\n        (#$memberOfList ?PRED\n         (#$TheList #$fieldsOfCompetence \n \t\t    #$primarySupervisor\n \t\t    (#$IsaPredFn #$ProjectManager)\n \t\t    (#$IsaPredFn #$OntologicalEngineer)\n \t\t    (#$IsaPredFn #$ComputerProgrammer) #$fieldsOfCompetence))\n        (#$thereExists ?CONSTRAINT\n \t (#$thereExists ?M\n          (#$argIsa ?PRED ?M ?CONSTRAINT)))))))") });
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("memberOfList"));
        $ic70$ = makeSymbol("S#35214", "CYC");
        $ic71$ = makeSymbol("S#35215", "CYC");
        $ic72$ = makeKeyword("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION");
        $ic73$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("forAll")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TREE-FIND"), constant_handles_oc.f8479((SubLObject)makeString("implies"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35216", "CYC")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35219", "CYC"), makeKeyword("EXAMPLE"), makeString("(#$ist #$UniversalVocabularyMt\n     (#$trueSentence\n      (#$forAll ?N\n       (#$implies\n        (#$elementOf ?N (#$TheSet 0 1))\n        (#$evaluate ?N (#$TimesFn ?N ?N))))))") });
        $ic74$ = makeSymbol("S#35216", "CYC");
        $ic75$ = makeKeyword("TRUE-DEF");
        $ic76$ = makeSymbol("S#35219", "CYC");
        $ic77$ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic78$ = constant_handles_oc.f8479((SubLObject)makeString("sentenceJustifications-Simple"));
        $ic79$ = makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE");
        $ic80$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("sentenceJustifications-Simple")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("sentenceJustifications-Simple")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35228", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$sentenceJustifications-Simple <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"), makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-Simple (#$genls #$Dog #$Animal) ?WHY))") });
        $ic81$ = makeKeyword("SKIP");
        $ic82$ = makeSymbol("S#35230", "CYC");
        $ic83$ = makeKeyword("CONTINUABLE?");
        $ic84$ = makeKeyword("MAX-NUMBER");
        $ic85$ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic86$ = makeKeyword("MAX-TIME");
        $ic87$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic88$ = makeKeyword("ALLOWED-RULES");
        $ic89$ = makeKeyword("ALLOWED-MODULES");
        $ic90$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic91$ = constant_handles_oc.f8479((SubLObject)makeString("sentenceJustifications-ProofViewSummary"));
        $ic92$ = makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY");
        $ic93$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("sentenceJustifications-ProofViewSummary")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("sentenceJustifications-ProofViewSummary")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35231", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$sentenceJustifications-ProofViewSummary <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"), makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-ProofViewSummary (#$genls #$Dog #$Animal) ?WHY))") });
        $ic94$ = makeSymbol("S#35237", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 466 ms
	
	Decompiled with Procyon 0.5.32.
*/