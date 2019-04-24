package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0349 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0349";
    public static final String myFingerPrint = "785d853f9a7963632fc0905400332826033e43665e64b170792f4d56709b1e21";
    private static SubLSymbol $g2984$;
    private static SubLSymbol $g2985$;
    private static SubLSymbol $g2986$;
    public static SubLSymbol $g2987$;
    private static SubLSymbol $g2988$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLInteger $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLInteger $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLSymbol $ic93$;
    
    public static SubLObject f23385(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0206.f13481(var1) || module0349.NIL != module0128.f8449(var1));
    }
    
    public static SubLObject f23386(final SubLObject var1, SubLObject var2) {
        if (var2 == module0349.UNPROVIDED) {
            var2 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((module0349.NIL != module0173.f10955(var1) && module0349.NIL != module0269.f17705(var1)) || (module0349.NIL != module0202.f12659(var1) && module0349.NIL != module0259.f16854(var1, module0349.$ic0$, var2, (SubLObject)module0349.UNPROVIDED)));
    }
    
    public static SubLObject f23387(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0173.f10955(var1) && module0349.NIL != module0269.f17706(var1));
    }
    
    public static SubLObject f23388(final SubLObject var4) {
        return module0269.f17761(var4);
    }
    
    public static SubLObject f23389(final SubLObject var5) {
        return module0269.f17804(var5);
    }
    
    public static SubLObject f23390(final SubLObject var5) {
        return module0269.f17763(var5);
    }
    
    public static SubLObject f23391(final SubLObject var5) {
        return module0269.f17783(var5);
    }
    
    public static SubLObject f23392(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var7) {
            return f23391(var5);
        }
        var8 = module0034.f1857(var7, (SubLObject)module0349.$ic1$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)module0349.$ic1$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var7, (SubLObject)module0349.$ic1$, var8);
        }
        SubLObject var9 = module0034.f1814(var8, var5, (SubLObject)module0349.$ic2$);
        if (var9 == module0349.$ic2$) {
            var9 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23391(var5)));
            module0034.f1816(var8, var5, var9, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f23393(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != f23390(var5) || module0349.NIL != f23392(var5));
    }
    
    public static SubLObject f23394(final SubLObject var5) {
        return module0269.f17752(var5);
    }
    
    public static SubLObject f23395(final SubLObject var5) {
        return module0269.f17806(var5);
    }
    
    public static SubLObject f23396(final SubLObject var5) {
        return module0229.f15236(var5, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23397(final SubLObject var5) {
        return module0269.f17788(var5);
    }
    
    public static SubLObject f23398(final SubLObject var5) {
        return module0269.f17776(var5);
    }
    
    public static SubLObject f23399(final SubLObject var10) {
        if (module0349.NIL != module0173.f10955(var10)) {
            return f23400(var10);
        }
        if (module0349.NIL != module0202.f12659(var10)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0226.f15158(module0205.f13136(var10)) || module0349.NIL != f23401(var10));
        }
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23402() {
        final SubLObject var11 = module0349.$g2984$.getGlobalValue();
        if (module0349.NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23403(final SubLObject var12) {
        return module0034.f1829(module0349.$g2984$.getGlobalValue(), (SubLObject)ConsesLow.list(var12), (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23404(final SubLObject var12) {
        return module0259.f16976(var12, module0349.$ic4$);
    }
    
    public static SubLObject f23400(final SubLObject var12) {
        SubLObject var13 = module0349.$g2984$.getGlobalValue();
        if (module0349.NIL == var13) {
            var13 = module0034.f1934((SubLObject)module0349.$ic3$, (SubLObject)module0349.$ic5$, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0349.$ic6$);
        }
        SubLObject var14 = module0034.f1814(var13, var12, (SubLObject)module0349.$ic2$);
        if (var14 == module0349.$ic2$) {
            var14 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23404(var12)));
            module0034.f1816(var13, var12, var14, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var14);
    }
    
    public static SubLObject f23405(final SubLObject var10) {
        return module0259.f16976(var10, module0349.$ic4$);
    }
    
    public static SubLObject f23401(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0034.$g879$.getDynamicValue(var11);
        SubLObject var13 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var12) {
            return f23405(var10);
        }
        var13 = module0034.f1857(var12, (SubLObject)module0349.$ic7$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var13) {
            var13 = module0034.f1807(module0034.f1842(var12), (SubLObject)module0349.$ic7$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var12, (SubLObject)module0349.$ic7$, var13);
        }
        SubLObject var14 = module0034.f1814(var13, var10, (SubLObject)module0349.$ic2$);
        if (var14 == module0349.$ic2$) {
            var14 = Values.arg2(var11.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23405(var10)));
            module0034.f1816(var13, var10, var14, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var14);
    }
    
    public static SubLObject f23406(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0349.NIL;
        final SubLObject var18 = module0110.$g1374$.currentBinding(var16);
        try {
            module0110.$g1374$.bind((SubLObject)module0349.T, var16);
            var17 = module0260.f17124(var15, (SubLObject)module0349.NIL, (SubLObject)module0349.UNPROVIDED);
        }
        finally {
            module0110.$g1374$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f23407(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0349.NIL == module0260.f17088(var15)) {
            return (SubLObject)module0349.NIL;
        }
        SubLObject var17 = (SubLObject)module0349.NIL;
        final SubLObject var18 = module0110.$g1374$.currentBinding(var16);
        try {
            module0110.$g1374$.bind((SubLObject)module0349.T, var16);
            var17 = module0260.f17126(var15, (SubLObject)module0349.NIL, (SubLObject)module0349.UNPROVIDED);
        }
        finally {
            module0110.$g1374$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f23408(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0349.NIL;
        final SubLObject var18 = module0110.$g1374$.currentBinding(var16);
        try {
            module0110.$g1374$.bind((SubLObject)module0349.T, var16);
            var17 = module0261.f17255(var15, (SubLObject)module0349.NIL, (SubLObject)module0349.UNPROVIDED);
        }
        finally {
            module0110.$g1374$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f23409(final SubLObject var5) {
        return module0260.f17028(var5, (SubLObject)module0349.NIL, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23410(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var7) {
            return f23409(var5);
        }
        var8 = module0034.f1857(var7, (SubLObject)module0349.$ic8$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)module0349.$ic8$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var7, (SubLObject)module0349.$ic8$, var8);
        }
        SubLObject var9 = module0034.f1814(var8, var5, (SubLObject)module0349.$ic2$);
        if (var9 == module0349.$ic2$) {
            var9 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23409(var5)));
            module0034.f1816(var8, var5, var9, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f23411(final SubLObject var5) {
        if (module0349.NIL != module0260.f17088(var5)) {
            return f23412(var5);
        }
        return (SubLObject)ConsesLow.list(var5);
    }
    
    public static SubLObject f23413(final SubLObject var5) {
        return module0260.f17033(var5, (SubLObject)module0349.NIL, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23412(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var7) {
            return f23413(var5);
        }
        var8 = module0034.f1857(var7, (SubLObject)module0349.$ic9$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)module0349.$ic9$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var7, (SubLObject)module0349.$ic9$, var8);
        }
        SubLObject var9 = module0034.f1814(var8, var5, (SubLObject)module0349.$ic2$);
        if (var9 == module0349.$ic2$) {
            var9 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23413(var5)));
            module0034.f1816(var8, var5, var9, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f23414(final SubLObject var5) {
        return module0260.f17030(var5, (SubLObject)module0349.NIL, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23415(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var7) {
            return f23414(var5);
        }
        var8 = module0034.f1857(var7, (SubLObject)module0349.$ic10$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)module0349.$ic10$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var7, (SubLObject)module0349.$ic10$, var8);
        }
        SubLObject var9 = module0034.f1814(var8, var5, (SubLObject)module0349.$ic2$);
        if (var9 == module0349.$ic2$) {
            var9 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23414(var5)));
            module0034.f1816(var8, var5, var9, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f23416(final SubLObject var5) {
        if (module0349.NIL != module0260.f17088(var5)) {
            return f23417(var5);
        }
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23418(final SubLObject var5) {
        return module0260.f17035(var5, (SubLObject)module0349.NIL, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23417(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var7) {
            return f23418(var5);
        }
        var8 = module0034.f1857(var7, (SubLObject)module0349.$ic11$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)module0349.$ic11$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var7, (SubLObject)module0349.$ic11$, var8);
        }
        SubLObject var9 = module0034.f1814(var8, var5, (SubLObject)module0349.$ic2$);
        if (var9 == module0349.$ic2$) {
            var9 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23418(var5)));
            module0034.f1816(var8, var5, var9, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f23419(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0349.NIL;
        SubLObject var21 = (SubLObject)module0349.ZERO_INTEGER;
        final SubLObject var22 = (SubLObject)module0349.$ic15$;
        final SubLObject var23 = module0056.f4145(var22);
        SubLObject var24 = (SubLObject)module0349.NIL;
        final SubLObject var25 = module0139.$g1635$.currentBinding(var19);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var19);
            final SubLObject var26 = (SubLObject)module0349.NIL;
            final SubLObject var17_26 = module0141.$g1714$.currentBinding(var19);
            final SubLObject var27 = module0141.$g1715$.currentBinding(var19);
            try {
                module0141.$g1714$.bind((module0349.NIL != var26) ? var26 : module0141.f9283(), var19);
                module0141.$g1715$.bind((SubLObject)((module0349.NIL != var26) ? module0349.$ic16$ : module0141.$g1715$.getDynamicValue(var19)), var19);
                if (module0349.NIL != var26 && module0349.NIL != module0136.f8864() && module0349.NIL == module0141.f9279(var26)) {
                    final SubLObject var28 = module0136.$g1591$.getDynamicValue(var19);
                    if (var28.eql((SubLObject)module0349.$ic17$)) {
                        module0136.f8870((SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                    else if (var28.eql((SubLObject)module0349.$ic20$)) {
                        module0136.f8871((SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic21$, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                    else if (var28.eql((SubLObject)module0349.$ic22$)) {
                        Errors.warn((SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$);
                    }
                    else {
                        Errors.warn((SubLObject)module0349.$ic23$, module0136.$g1591$.getDynamicValue(var19));
                        Errors.cerror((SubLObject)module0349.$ic21$, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$);
                    }
                }
                final SubLObject var17_27 = module0141.$g1670$.currentBinding(var19);
                final SubLObject var27_30 = module0141.$g1671$.currentBinding(var19);
                final SubLObject var29 = module0141.$g1672$.currentBinding(var19);
                final SubLObject var30 = module0141.$g1674$.currentBinding(var19);
                final SubLObject var31 = module0137.$g1605$.currentBinding(var19);
                try {
                    module0141.$g1670$.bind(module0137.f8955(module0349.$ic24$), var19);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0349.$ic24$)), var19);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0349.$ic24$)), var19);
                    module0141.$g1674$.bind((SubLObject)module0349.NIL, var19);
                    module0137.$g1605$.bind(module0137.f8955(module0349.$ic24$), var19);
                    if (module0349.NIL != module0136.f8865() || module0349.NIL != module0244.f15795(var15, module0137.f8955((SubLObject)module0349.UNPROVIDED))) {
                        final SubLObject var17_28 = module0141.$g1677$.currentBinding(var19);
                        final SubLObject var27_31 = module0138.$g1619$.currentBinding(var19);
                        final SubLObject var31_36 = module0141.$g1674$.currentBinding(var19);
                        try {
                            module0141.$g1677$.bind(module0141.f9208(), var19);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0349.$ic24$)), var19);
                            module0141.$g1674$.bind((SubLObject)module0349.NIL, var19);
                            module0249.f16055(var15, (SubLObject)module0349.UNPROVIDED);
                            for (var24 = (SubLObject)ConsesLow.list(var15, module0141.f9195()); module0349.NIL != var24; var24 = module0056.f4150(var23)) {
                                final SubLObject var21_37 = var24.first();
                                final SubLObject var32 = conses_high.second(var24);
                                final SubLObject var33 = var21_37;
                                final SubLObject var17_29 = module0141.$g1674$.currentBinding(var19);
                                try {
                                    module0141.$g1674$.bind(var32, var19);
                                    if (module0349.NIL != module0250.f16115(module0141.f9190(), var21_37) && !var33.eql(var15)) {
                                        final SubLObject var34 = module0217.f14266(var33, var18);
                                        if (var34.isPositive()) {
                                            var20 = (SubLObject)ConsesLow.cons(var33, var20);
                                            var21 = Numbers.add(var21, var34);
                                        }
                                    }
                                    SubLObject var36;
                                    final SubLObject var35 = var36 = module0200.f12443(module0137.f8955(module0349.$ic24$));
                                    SubLObject var37 = (SubLObject)module0349.NIL;
                                    var37 = var36.first();
                                    while (module0349.NIL != var36) {
                                        final SubLObject var17_30 = module0137.$g1605$.currentBinding(var19);
                                        final SubLObject var27_32 = module0141.$g1674$.currentBinding(var19);
                                        try {
                                            module0137.$g1605$.bind(var37, var19);
                                            module0141.$g1674$.bind((SubLObject)((module0349.NIL != module0141.f9205((SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0349.NIL == module0141.$g1674$.getDynamicValue(var19)) : module0141.$g1674$.getDynamicValue(var19)), var19);
                                            final SubLObject var38 = module0228.f15229(var21_37);
                                            if (module0349.NIL != module0138.f8992(var38)) {
                                                final SubLObject var39 = module0242.f15664(var38, module0137.f8955((SubLObject)module0349.UNPROVIDED));
                                                if (module0349.NIL != var39) {
                                                    final SubLObject var40 = module0245.f15834(var39, module0138.f8979(), module0137.f8955((SubLObject)module0349.UNPROVIDED));
                                                    if (module0349.NIL != var40) {
                                                        SubLObject var41;
                                                        for (var41 = module0066.f4838(module0067.f4891(var40)); module0349.NIL == module0066.f4841(var41); var41 = module0066.f4840(var41)) {
                                                            var19.resetMultipleValues();
                                                            final SubLObject var42 = module0066.f4839(var41);
                                                            final SubLObject var43 = var19.secondMultipleValue();
                                                            var19.resetMultipleValues();
                                                            if (module0349.NIL != module0147.f9507(var42)) {
                                                                final SubLObject var17_31 = module0138.$g1623$.currentBinding(var19);
                                                                try {
                                                                    module0138.$g1623$.bind(var42, var19);
                                                                    SubLObject var50_54;
                                                                    for (var50_54 = module0066.f4838(module0067.f4891(var43)); module0349.NIL == module0066.f4841(var50_54); var50_54 = module0066.f4840(var50_54)) {
                                                                        var19.resetMultipleValues();
                                                                        final SubLObject var44 = module0066.f4839(var50_54);
                                                                        final SubLObject var45 = var19.secondMultipleValue();
                                                                        var19.resetMultipleValues();
                                                                        if (module0349.NIL != module0141.f9289(var44)) {
                                                                            final SubLObject var17_32 = module0138.$g1624$.currentBinding(var19);
                                                                            try {
                                                                                module0138.$g1624$.bind(var44, var19);
                                                                                final SubLObject var46 = var45;
                                                                                if (module0349.NIL != module0077.f5302(var46)) {
                                                                                    final SubLObject var47 = module0077.f5333(var46);
                                                                                    SubLObject var48;
                                                                                    SubLObject var49;
                                                                                    SubLObject var50;
                                                                                    for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0349.NIL, var49 = module0032.f1742(var48, var47); module0349.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                                                                        var50 = module0032.f1745(var48, var49);
                                                                                        if (module0349.NIL != module0032.f1746(var49, var50) && module0349.NIL == module0249.f16059(var50, (SubLObject)module0349.UNPROVIDED)) {
                                                                                            module0249.f16055(var50, (SubLObject)module0349.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var50, module0141.f9195()), var23);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var46.isList()) {
                                                                                    SubLObject var51 = var46;
                                                                                    SubLObject var52 = (SubLObject)module0349.NIL;
                                                                                    var52 = var51.first();
                                                                                    while (module0349.NIL != var51) {
                                                                                        if (module0349.NIL == module0249.f16059(var52, (SubLObject)module0349.UNPROVIDED)) {
                                                                                            module0249.f16055(var52, (SubLObject)module0349.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var52, module0141.f9195()), var23);
                                                                                        }
                                                                                        var51 = var51.rest();
                                                                                        var52 = var51.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0349.$ic25$, var46);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var17_32, var19);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var50_54);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var17_31, var19);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var41);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0349.FIVE_INTEGER, (SubLObject)module0349.$ic26$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                                                }
                                            }
                                            else if (module0349.NIL != module0155.f9785(var38, (SubLObject)module0349.UNPROVIDED)) {
                                                SubLObject var43_65;
                                                final SubLObject var53 = var43_65 = ((module0349.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)module0349.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)module0349.UNPROVIDED)));
                                                SubLObject var54 = (SubLObject)module0349.NIL;
                                                var54 = var43_65.first();
                                                while (module0349.NIL != var43_65) {
                                                    final SubLObject var17_33 = module0138.$g1625$.currentBinding(var19);
                                                    try {
                                                        module0138.$g1625$.bind(var54, var19);
                                                        final SubLObject var56;
                                                        final SubLObject var55 = var56 = Functions.funcall(var54, var38);
                                                        if (module0349.NIL != module0077.f5302(var56)) {
                                                            final SubLObject var57 = module0077.f5333(var56);
                                                            SubLObject var58;
                                                            SubLObject var59;
                                                            SubLObject var60;
                                                            for (var58 = module0032.f1741(var57), var59 = (SubLObject)module0349.NIL, var59 = module0032.f1742(var58, var57); module0349.NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                var60 = module0032.f1745(var58, var59);
                                                                if (module0349.NIL != module0032.f1746(var59, var60) && module0349.NIL == module0249.f16059(var60, (SubLObject)module0349.UNPROVIDED)) {
                                                                    module0249.f16055(var60, (SubLObject)module0349.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var60, module0141.f9195()), var23);
                                                                }
                                                            }
                                                        }
                                                        else if (var56.isList()) {
                                                            SubLObject var61 = var56;
                                                            SubLObject var62 = (SubLObject)module0349.NIL;
                                                            var62 = var61.first();
                                                            while (module0349.NIL != var61) {
                                                                if (module0349.NIL == module0249.f16059(var62, (SubLObject)module0349.UNPROVIDED)) {
                                                                    module0249.f16055(var62, (SubLObject)module0349.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var62, module0141.f9195()), var23);
                                                                }
                                                                var61 = var61.rest();
                                                                var62 = var61.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0349.$ic25$, var56);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var17_33, var19);
                                                    }
                                                    var43_65 = var43_65.rest();
                                                    var54 = var43_65.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var27_32, var19);
                                            module0137.$g1605$.rebind(var17_30, var19);
                                        }
                                        var36 = var36.rest();
                                        var37 = var36.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var17_29, var19);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var31_36, var19);
                            module0138.$g1619$.rebind(var27_31, var19);
                            module0141.$g1677$.rebind(var17_28, var19);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.$ic27$, var15, module0244.f15748(module0137.f8955((SubLObject)module0349.UNPROVIDED)), (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var31, var19);
                    module0141.$g1674$.rebind(var30, var19);
                    module0141.$g1672$.rebind(var29, var19);
                    module0141.$g1671$.rebind(var27_30, var19);
                    module0141.$g1670$.rebind(var17_27, var19);
                }
            }
            finally {
                module0141.$g1715$.rebind(var27, var19);
                module0141.$g1714$.rebind(var17_26, var19);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var19));
        }
        finally {
            module0139.$g1635$.rebind(var25, var19);
        }
        return Values.values(Sequences.nreverse(var20), var21);
    }
    
    public static SubLObject f23420(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0034.$g879$.getDynamicValue(var19);
        SubLObject var21 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var20) {
            return f23419(var15, var18);
        }
        var21 = module0034.f1857(var20, (SubLObject)module0349.$ic12$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var21) {
            var21 = module0034.f1807(module0034.f1842(var20), (SubLObject)module0349.$ic12$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var20, (SubLObject)module0349.$ic12$, var21);
        }
        final SubLObject var22 = module0034.f1782(var15, var18);
        final SubLObject var23 = module0034.f1814(var21, var22, (SubLObject)module0349.UNPROVIDED);
        if (var23 != module0349.$ic2$) {
            SubLObject var24 = var23;
            SubLObject var25 = (SubLObject)module0349.NIL;
            var25 = var24.first();
            while (module0349.NIL != var24) {
                SubLObject var26 = var25.first();
                final SubLObject var27 = conses_high.second(var25);
                if (var15.eql(var26.first())) {
                    var26 = var26.rest();
                    if (module0349.NIL != var26 && module0349.NIL == var26.rest() && var18.eql(var26.first())) {
                        return module0034.f1959(var27);
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        final SubLObject var28 = Values.arg2(var19.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23419(var15, var18)));
        module0034.f1836(var21, var22, var23, var28, (SubLObject)ConsesLow.list(var15, var18));
        return module0034.f1959(var28);
    }
    
    public static SubLObject f23421(final SubLObject var15, final SubLObject var18) {
        if (module0349.NIL != module0260.f17088(var15)) {
            return f23422(var15, var18);
        }
        return Values.values((SubLObject)module0349.NIL, (SubLObject)module0349.ZERO_INTEGER);
    }
    
    public static SubLObject f23423(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0349.NIL;
        SubLObject var21 = (SubLObject)module0349.ZERO_INTEGER;
        final SubLObject var22 = (SubLObject)module0349.$ic15$;
        final SubLObject var23 = module0056.f4145(var22);
        SubLObject var24 = (SubLObject)module0349.NIL;
        final SubLObject var25 = module0139.$g1635$.currentBinding(var19);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var19);
            final SubLObject var26 = (SubLObject)module0349.NIL;
            final SubLObject var17_76 = module0141.$g1714$.currentBinding(var19);
            final SubLObject var27 = module0141.$g1715$.currentBinding(var19);
            try {
                module0141.$g1714$.bind((module0349.NIL != var26) ? var26 : module0141.f9283(), var19);
                module0141.$g1715$.bind((SubLObject)((module0349.NIL != var26) ? module0349.$ic16$ : module0141.$g1715$.getDynamicValue(var19)), var19);
                if (module0349.NIL != var26 && module0349.NIL != module0136.f8864() && module0349.NIL == module0141.f9279(var26)) {
                    final SubLObject var28 = module0136.$g1591$.getDynamicValue(var19);
                    if (var28.eql((SubLObject)module0349.$ic17$)) {
                        module0136.f8870((SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                    else if (var28.eql((SubLObject)module0349.$ic20$)) {
                        module0136.f8871((SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic21$, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                    else if (var28.eql((SubLObject)module0349.$ic22$)) {
                        Errors.warn((SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$);
                    }
                    else {
                        Errors.warn((SubLObject)module0349.$ic23$, module0136.$g1591$.getDynamicValue(var19));
                        Errors.cerror((SubLObject)module0349.$ic21$, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$);
                    }
                }
                final SubLObject var17_77 = module0141.$g1670$.currentBinding(var19);
                final SubLObject var27_78 = module0141.$g1671$.currentBinding(var19);
                final SubLObject var29 = module0141.$g1672$.currentBinding(var19);
                final SubLObject var30 = module0141.$g1674$.currentBinding(var19);
                final SubLObject var31 = module0137.$g1605$.currentBinding(var19);
                try {
                    module0141.$g1670$.bind(module0137.f8955(module0349.$ic24$), var19);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0349.$ic24$)), var19);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0349.$ic24$)), var19);
                    module0141.$g1674$.bind((SubLObject)module0349.NIL, var19);
                    module0137.$g1605$.bind(module0137.f8955(module0349.$ic24$), var19);
                    if (module0349.NIL != module0136.f8865() || module0349.NIL != module0244.f15795(var15, module0137.f8955((SubLObject)module0349.UNPROVIDED))) {
                        final SubLObject var17_78 = module0141.$g1677$.currentBinding(var19);
                        final SubLObject var27_79 = module0138.$g1619$.currentBinding(var19);
                        final SubLObject var31_81 = module0141.$g1674$.currentBinding(var19);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var19);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0349.$ic24$)), var19);
                            module0141.$g1674$.bind((SubLObject)module0349.NIL, var19);
                            module0249.f16055(var15, (SubLObject)module0349.UNPROVIDED);
                            for (var24 = (SubLObject)ConsesLow.list(var15, module0141.f9195()); module0349.NIL != var24; var24 = module0056.f4150(var23)) {
                                final SubLObject var21_82 = var24.first();
                                final SubLObject var32 = conses_high.second(var24);
                                final SubLObject var33 = var21_82;
                                final SubLObject var17_79 = module0141.$g1674$.currentBinding(var19);
                                try {
                                    module0141.$g1674$.bind(var32, var19);
                                    if (module0349.NIL != module0250.f16115(module0141.f9190(), var21_82) && !var33.eql(var15)) {
                                        final SubLObject var34 = module0217.f14266(var33, var18);
                                        if (var34.isPositive()) {
                                            var20 = (SubLObject)ConsesLow.cons(var33, var20);
                                            var21 = Numbers.add(var21, var34);
                                        }
                                    }
                                    SubLObject var36;
                                    final SubLObject var35 = var36 = module0200.f12443(module0137.f8955(module0349.$ic24$));
                                    SubLObject var37 = (SubLObject)module0349.NIL;
                                    var37 = var36.first();
                                    while (module0349.NIL != var36) {
                                        final SubLObject var17_80 = module0137.$g1605$.currentBinding(var19);
                                        final SubLObject var27_80 = module0141.$g1674$.currentBinding(var19);
                                        try {
                                            module0137.$g1605$.bind(var37, var19);
                                            module0141.$g1674$.bind((SubLObject)((module0349.NIL != module0141.f9205((SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0349.NIL == module0141.$g1674$.getDynamicValue(var19)) : module0141.$g1674$.getDynamicValue(var19)), var19);
                                            final SubLObject var38 = module0228.f15229(var21_82);
                                            if (module0349.NIL != module0138.f8992(var38)) {
                                                final SubLObject var39 = module0242.f15664(var38, module0137.f8955((SubLObject)module0349.UNPROVIDED));
                                                if (module0349.NIL != var39) {
                                                    final SubLObject var40 = module0245.f15834(var39, module0138.f8979(), module0137.f8955((SubLObject)module0349.UNPROVIDED));
                                                    if (module0349.NIL != var40) {
                                                        SubLObject var41;
                                                        for (var41 = module0066.f4838(module0067.f4891(var40)); module0349.NIL == module0066.f4841(var41); var41 = module0066.f4840(var41)) {
                                                            var19.resetMultipleValues();
                                                            final SubLObject var42 = module0066.f4839(var41);
                                                            final SubLObject var43 = var19.secondMultipleValue();
                                                            var19.resetMultipleValues();
                                                            if (module0349.NIL != module0147.f9507(var42)) {
                                                                final SubLObject var17_81 = module0138.$g1623$.currentBinding(var19);
                                                                try {
                                                                    module0138.$g1623$.bind(var42, var19);
                                                                    SubLObject var50_88;
                                                                    for (var50_88 = module0066.f4838(module0067.f4891(var43)); module0349.NIL == module0066.f4841(var50_88); var50_88 = module0066.f4840(var50_88)) {
                                                                        var19.resetMultipleValues();
                                                                        final SubLObject var44 = module0066.f4839(var50_88);
                                                                        final SubLObject var45 = var19.secondMultipleValue();
                                                                        var19.resetMultipleValues();
                                                                        if (module0349.NIL != module0141.f9289(var44)) {
                                                                            final SubLObject var17_82 = module0138.$g1624$.currentBinding(var19);
                                                                            try {
                                                                                module0138.$g1624$.bind(var44, var19);
                                                                                final SubLObject var46 = var45;
                                                                                if (module0349.NIL != module0077.f5302(var46)) {
                                                                                    final SubLObject var47 = module0077.f5333(var46);
                                                                                    SubLObject var48;
                                                                                    SubLObject var49;
                                                                                    SubLObject var50;
                                                                                    for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0349.NIL, var49 = module0032.f1742(var48, var47); module0349.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                                                                        var50 = module0032.f1745(var48, var49);
                                                                                        if (module0349.NIL != module0032.f1746(var49, var50) && module0349.NIL == module0249.f16059(var50, (SubLObject)module0349.UNPROVIDED)) {
                                                                                            module0249.f16055(var50, (SubLObject)module0349.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var50, module0141.f9195()), var23);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var46.isList()) {
                                                                                    SubLObject var51 = var46;
                                                                                    SubLObject var52 = (SubLObject)module0349.NIL;
                                                                                    var52 = var51.first();
                                                                                    while (module0349.NIL != var51) {
                                                                                        if (module0349.NIL == module0249.f16059(var52, (SubLObject)module0349.UNPROVIDED)) {
                                                                                            module0249.f16055(var52, (SubLObject)module0349.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var52, module0141.f9195()), var23);
                                                                                        }
                                                                                        var51 = var51.rest();
                                                                                        var52 = var51.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0349.$ic25$, var46);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var17_82, var19);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var50_88);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var17_81, var19);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var41);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0349.FIVE_INTEGER, (SubLObject)module0349.$ic26$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                                                }
                                            }
                                            else if (module0349.NIL != module0155.f9785(var38, (SubLObject)module0349.UNPROVIDED)) {
                                                SubLObject var43_90;
                                                final SubLObject var53 = var43_90 = ((module0349.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)module0349.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)module0349.UNPROVIDED)));
                                                SubLObject var54 = (SubLObject)module0349.NIL;
                                                var54 = var43_90.first();
                                                while (module0349.NIL != var43_90) {
                                                    final SubLObject var17_83 = module0138.$g1625$.currentBinding(var19);
                                                    try {
                                                        module0138.$g1625$.bind(var54, var19);
                                                        final SubLObject var56;
                                                        final SubLObject var55 = var56 = Functions.funcall(var54, var38);
                                                        if (module0349.NIL != module0077.f5302(var56)) {
                                                            final SubLObject var57 = module0077.f5333(var56);
                                                            SubLObject var58;
                                                            SubLObject var59;
                                                            SubLObject var60;
                                                            for (var58 = module0032.f1741(var57), var59 = (SubLObject)module0349.NIL, var59 = module0032.f1742(var58, var57); module0349.NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                var60 = module0032.f1745(var58, var59);
                                                                if (module0349.NIL != module0032.f1746(var59, var60) && module0349.NIL == module0249.f16059(var60, (SubLObject)module0349.UNPROVIDED)) {
                                                                    module0249.f16055(var60, (SubLObject)module0349.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var60, module0141.f9195()), var23);
                                                                }
                                                            }
                                                        }
                                                        else if (var56.isList()) {
                                                            SubLObject var61 = var56;
                                                            SubLObject var62 = (SubLObject)module0349.NIL;
                                                            var62 = var61.first();
                                                            while (module0349.NIL != var61) {
                                                                if (module0349.NIL == module0249.f16059(var62, (SubLObject)module0349.UNPROVIDED)) {
                                                                    module0249.f16055(var62, (SubLObject)module0349.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var62, module0141.f9195()), var23);
                                                                }
                                                                var61 = var61.rest();
                                                                var62 = var61.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0349.$ic25$, var56);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var17_83, var19);
                                                    }
                                                    var43_90 = var43_90.rest();
                                                    var54 = var43_90.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var27_80, var19);
                                            module0137.$g1605$.rebind(var17_80, var19);
                                        }
                                        var36 = var36.rest();
                                        var37 = var36.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var17_79, var19);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var31_81, var19);
                            module0138.$g1619$.rebind(var27_79, var19);
                            module0141.$g1677$.rebind(var17_78, var19);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.$ic27$, var15, module0244.f15748(module0137.f8955((SubLObject)module0349.UNPROVIDED)), (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var31, var19);
                    module0141.$g1674$.rebind(var30, var19);
                    module0141.$g1672$.rebind(var29, var19);
                    module0141.$g1671$.rebind(var27_78, var19);
                    module0141.$g1670$.rebind(var17_77, var19);
                }
            }
            finally {
                module0141.$g1715$.rebind(var27, var19);
                module0141.$g1714$.rebind(var17_76, var19);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var19));
        }
        finally {
            module0139.$g1635$.rebind(var25, var19);
        }
        return Values.values(Sequences.nreverse(var20), var21);
    }
    
    public static SubLObject f23422(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0034.$g879$.getDynamicValue(var19);
        SubLObject var21 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var20) {
            return f23423(var15, var18);
        }
        var21 = module0034.f1857(var20, (SubLObject)module0349.$ic28$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var21) {
            var21 = module0034.f1807(module0034.f1842(var20), (SubLObject)module0349.$ic28$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var20, (SubLObject)module0349.$ic28$, var21);
        }
        final SubLObject var22 = module0034.f1782(var15, var18);
        final SubLObject var23 = module0034.f1814(var21, var22, (SubLObject)module0349.UNPROVIDED);
        if (var23 != module0349.$ic2$) {
            SubLObject var24 = var23;
            SubLObject var25 = (SubLObject)module0349.NIL;
            var25 = var24.first();
            while (module0349.NIL != var24) {
                SubLObject var26 = var25.first();
                final SubLObject var27 = conses_high.second(var25);
                if (var15.eql(var26.first())) {
                    var26 = var26.rest();
                    if (module0349.NIL != var26 && module0349.NIL == var26.rest() && var18.eql(var26.first())) {
                        return module0034.f1959(var27);
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        final SubLObject var28 = Values.arg2(var19.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23423(var15, var18)));
        module0034.f1836(var21, var22, var23, var28, (SubLObject)ConsesLow.list(var15, var18));
        return module0034.f1959(var28);
    }
    
    public static SubLObject f23424(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0349.NIL;
        SubLObject var21 = (SubLObject)module0349.ZERO_INTEGER;
        final SubLObject var22 = (SubLObject)module0349.$ic15$;
        final SubLObject var23 = module0056.f4145(var22);
        SubLObject var24 = (SubLObject)module0349.NIL;
        final SubLObject var25 = module0139.$g1635$.currentBinding(var19);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var19);
            final SubLObject var26 = (SubLObject)module0349.NIL;
            final SubLObject var17_92 = module0141.$g1714$.currentBinding(var19);
            final SubLObject var27 = module0141.$g1715$.currentBinding(var19);
            try {
                module0141.$g1714$.bind((module0349.NIL != var26) ? var26 : module0141.f9283(), var19);
                module0141.$g1715$.bind((SubLObject)((module0349.NIL != var26) ? module0349.$ic16$ : module0141.$g1715$.getDynamicValue(var19)), var19);
                if (module0349.NIL != var26 && module0349.NIL != module0136.f8864() && module0349.NIL == module0141.f9279(var26)) {
                    final SubLObject var28 = module0136.$g1591$.getDynamicValue(var19);
                    if (var28.eql((SubLObject)module0349.$ic17$)) {
                        module0136.f8870((SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                    else if (var28.eql((SubLObject)module0349.$ic20$)) {
                        module0136.f8871((SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic21$, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                    else if (var28.eql((SubLObject)module0349.$ic22$)) {
                        Errors.warn((SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$);
                    }
                    else {
                        Errors.warn((SubLObject)module0349.$ic23$, module0136.$g1591$.getDynamicValue(var19));
                        Errors.cerror((SubLObject)module0349.$ic21$, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$);
                    }
                }
                final SubLObject var17_93 = module0141.$g1670$.currentBinding(var19);
                final SubLObject var27_94 = module0141.$g1671$.currentBinding(var19);
                final SubLObject var29 = module0141.$g1672$.currentBinding(var19);
                final SubLObject var30 = module0141.$g1674$.currentBinding(var19);
                final SubLObject var31 = module0137.$g1605$.currentBinding(var19);
                try {
                    module0141.$g1670$.bind(module0137.f8955(module0349.$ic30$), var19);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0349.$ic30$)), var19);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0349.$ic30$)), var19);
                    module0141.$g1674$.bind((SubLObject)module0349.NIL, var19);
                    module0137.$g1605$.bind(module0137.f8955(module0349.$ic30$), var19);
                    if (module0349.NIL != module0136.f8865() || module0349.NIL != module0244.f15795(var15, module0137.f8955((SubLObject)module0349.UNPROVIDED))) {
                        final SubLObject var17_94 = module0141.$g1677$.currentBinding(var19);
                        final SubLObject var27_95 = module0138.$g1619$.currentBinding(var19);
                        final SubLObject var31_97 = module0141.$g1674$.currentBinding(var19);
                        try {
                            module0141.$g1677$.bind(module0141.f9208(), var19);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0349.$ic30$)), var19);
                            module0141.$g1674$.bind((SubLObject)module0349.NIL, var19);
                            module0249.f16055(var15, (SubLObject)module0349.UNPROVIDED);
                            for (var24 = (SubLObject)ConsesLow.list(var15, module0141.f9195()); module0349.NIL != var24; var24 = module0056.f4150(var23)) {
                                final SubLObject var21_98 = var24.first();
                                final SubLObject var32 = conses_high.second(var24);
                                final SubLObject var33 = var21_98;
                                final SubLObject var17_95 = module0141.$g1674$.currentBinding(var19);
                                try {
                                    module0141.$g1674$.bind(var32, var19);
                                    if (module0349.NIL != module0250.f16115(module0141.f9190(), var21_98) && !var33.eql(var15)) {
                                        final SubLObject var34 = module0217.f14266(var33, var18);
                                        if (var34.isPositive()) {
                                            var20 = (SubLObject)ConsesLow.cons(var33, var20);
                                            var21 = Numbers.add(var21, var34);
                                        }
                                    }
                                    SubLObject var36;
                                    final SubLObject var35 = var36 = module0200.f12443(module0137.f8955(module0349.$ic30$));
                                    SubLObject var37 = (SubLObject)module0349.NIL;
                                    var37 = var36.first();
                                    while (module0349.NIL != var36) {
                                        final SubLObject var17_96 = module0137.$g1605$.currentBinding(var19);
                                        final SubLObject var27_96 = module0141.$g1674$.currentBinding(var19);
                                        try {
                                            module0137.$g1605$.bind(var37, var19);
                                            module0141.$g1674$.bind((SubLObject)((module0349.NIL != module0141.f9205((SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0349.NIL == module0141.$g1674$.getDynamicValue(var19)) : module0141.$g1674$.getDynamicValue(var19)), var19);
                                            final SubLObject var38 = module0228.f15229(var21_98);
                                            if (module0349.NIL != module0138.f8992(var38)) {
                                                final SubLObject var39 = module0242.f15664(var38, module0137.f8955((SubLObject)module0349.UNPROVIDED));
                                                if (module0349.NIL != var39) {
                                                    final SubLObject var40 = module0245.f15834(var39, module0138.f8979(), module0137.f8955((SubLObject)module0349.UNPROVIDED));
                                                    if (module0349.NIL != var40) {
                                                        SubLObject var41;
                                                        for (var41 = module0066.f4838(module0067.f4891(var40)); module0349.NIL == module0066.f4841(var41); var41 = module0066.f4840(var41)) {
                                                            var19.resetMultipleValues();
                                                            final SubLObject var42 = module0066.f4839(var41);
                                                            final SubLObject var43 = var19.secondMultipleValue();
                                                            var19.resetMultipleValues();
                                                            if (module0349.NIL != module0147.f9507(var42)) {
                                                                final SubLObject var17_97 = module0138.$g1623$.currentBinding(var19);
                                                                try {
                                                                    module0138.$g1623$.bind(var42, var19);
                                                                    SubLObject var50_103;
                                                                    for (var50_103 = module0066.f4838(module0067.f4891(var43)); module0349.NIL == module0066.f4841(var50_103); var50_103 = module0066.f4840(var50_103)) {
                                                                        var19.resetMultipleValues();
                                                                        final SubLObject var44 = module0066.f4839(var50_103);
                                                                        final SubLObject var45 = var19.secondMultipleValue();
                                                                        var19.resetMultipleValues();
                                                                        if (module0349.NIL != module0141.f9289(var44)) {
                                                                            final SubLObject var17_98 = module0138.$g1624$.currentBinding(var19);
                                                                            try {
                                                                                module0138.$g1624$.bind(var44, var19);
                                                                                final SubLObject var46 = var45;
                                                                                if (module0349.NIL != module0077.f5302(var46)) {
                                                                                    final SubLObject var47 = module0077.f5333(var46);
                                                                                    SubLObject var48;
                                                                                    SubLObject var49;
                                                                                    SubLObject var50;
                                                                                    for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0349.NIL, var49 = module0032.f1742(var48, var47); module0349.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                                                                        var50 = module0032.f1745(var48, var49);
                                                                                        if (module0349.NIL != module0032.f1746(var49, var50) && module0349.NIL == module0249.f16059(var50, (SubLObject)module0349.UNPROVIDED)) {
                                                                                            module0249.f16055(var50, (SubLObject)module0349.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var50, module0141.f9195()), var23);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var46.isList()) {
                                                                                    SubLObject var51 = var46;
                                                                                    SubLObject var52 = (SubLObject)module0349.NIL;
                                                                                    var52 = var51.first();
                                                                                    while (module0349.NIL != var51) {
                                                                                        if (module0349.NIL == module0249.f16059(var52, (SubLObject)module0349.UNPROVIDED)) {
                                                                                            module0249.f16055(var52, (SubLObject)module0349.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var52, module0141.f9195()), var23);
                                                                                        }
                                                                                        var51 = var51.rest();
                                                                                        var52 = var51.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0349.$ic25$, var46);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var17_98, var19);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var50_103);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var17_97, var19);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var41);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0349.FIVE_INTEGER, (SubLObject)module0349.$ic26$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                                                }
                                            }
                                            else if (module0349.NIL != module0155.f9785(var38, (SubLObject)module0349.UNPROVIDED)) {
                                                SubLObject var43_105;
                                                final SubLObject var53 = var43_105 = ((module0349.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)module0349.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)module0349.UNPROVIDED)));
                                                SubLObject var54 = (SubLObject)module0349.NIL;
                                                var54 = var43_105.first();
                                                while (module0349.NIL != var43_105) {
                                                    final SubLObject var17_99 = module0138.$g1625$.currentBinding(var19);
                                                    try {
                                                        module0138.$g1625$.bind(var54, var19);
                                                        final SubLObject var56;
                                                        final SubLObject var55 = var56 = Functions.funcall(var54, var38);
                                                        if (module0349.NIL != module0077.f5302(var56)) {
                                                            final SubLObject var57 = module0077.f5333(var56);
                                                            SubLObject var58;
                                                            SubLObject var59;
                                                            SubLObject var60;
                                                            for (var58 = module0032.f1741(var57), var59 = (SubLObject)module0349.NIL, var59 = module0032.f1742(var58, var57); module0349.NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                var60 = module0032.f1745(var58, var59);
                                                                if (module0349.NIL != module0032.f1746(var59, var60) && module0349.NIL == module0249.f16059(var60, (SubLObject)module0349.UNPROVIDED)) {
                                                                    module0249.f16055(var60, (SubLObject)module0349.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var60, module0141.f9195()), var23);
                                                                }
                                                            }
                                                        }
                                                        else if (var56.isList()) {
                                                            SubLObject var61 = var56;
                                                            SubLObject var62 = (SubLObject)module0349.NIL;
                                                            var62 = var61.first();
                                                            while (module0349.NIL != var61) {
                                                                if (module0349.NIL == module0249.f16059(var62, (SubLObject)module0349.UNPROVIDED)) {
                                                                    module0249.f16055(var62, (SubLObject)module0349.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var62, module0141.f9195()), var23);
                                                                }
                                                                var61 = var61.rest();
                                                                var62 = var61.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0349.$ic25$, var56);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var17_99, var19);
                                                    }
                                                    var43_105 = var43_105.rest();
                                                    var54 = var43_105.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var27_96, var19);
                                            module0137.$g1605$.rebind(var17_96, var19);
                                        }
                                        var36 = var36.rest();
                                        var37 = var36.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var17_95, var19);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var31_97, var19);
                            module0138.$g1619$.rebind(var27_95, var19);
                            module0141.$g1677$.rebind(var17_94, var19);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.$ic27$, var15, module0244.f15748(module0137.f8955((SubLObject)module0349.UNPROVIDED)), (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var31, var19);
                    module0141.$g1674$.rebind(var30, var19);
                    module0141.$g1672$.rebind(var29, var19);
                    module0141.$g1671$.rebind(var27_94, var19);
                    module0141.$g1670$.rebind(var17_93, var19);
                }
            }
            finally {
                module0141.$g1715$.rebind(var27, var19);
                module0141.$g1714$.rebind(var17_92, var19);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var19));
        }
        finally {
            module0139.$g1635$.rebind(var25, var19);
        }
        return Values.values(Sequences.nreverse(var20), var21);
    }
    
    public static SubLObject f23425(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0034.$g879$.getDynamicValue(var19);
        SubLObject var21 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var20) {
            return f23424(var15, var18);
        }
        var21 = module0034.f1857(var20, (SubLObject)module0349.$ic29$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var21) {
            var21 = module0034.f1807(module0034.f1842(var20), (SubLObject)module0349.$ic29$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var20, (SubLObject)module0349.$ic29$, var21);
        }
        final SubLObject var22 = module0034.f1782(var15, var18);
        final SubLObject var23 = module0034.f1814(var21, var22, (SubLObject)module0349.UNPROVIDED);
        if (var23 != module0349.$ic2$) {
            SubLObject var24 = var23;
            SubLObject var25 = (SubLObject)module0349.NIL;
            var25 = var24.first();
            while (module0349.NIL != var24) {
                SubLObject var26 = var25.first();
                final SubLObject var27 = conses_high.second(var25);
                if (var15.eql(var26.first())) {
                    var26 = var26.rest();
                    if (module0349.NIL != var26 && module0349.NIL == var26.rest() && var18.eql(var26.first())) {
                        return module0034.f1959(var27);
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        final SubLObject var28 = Values.arg2(var19.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23424(var15, var18)));
        module0034.f1836(var21, var22, var23, var28, (SubLObject)ConsesLow.list(var15, var18));
        return module0034.f1959(var28);
    }
    
    public static SubLObject f23426(final SubLObject var15, final SubLObject var18) {
        if (module0349.NIL != module0260.f17088(var15)) {
            return f23427(var15, var18);
        }
        return Values.values((SubLObject)module0349.NIL, (SubLObject)module0349.ZERO_INTEGER);
    }
    
    public static SubLObject f23428(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)module0349.NIL;
        SubLObject var21 = (SubLObject)module0349.ZERO_INTEGER;
        final SubLObject var22 = (SubLObject)module0349.$ic15$;
        final SubLObject var23 = module0056.f4145(var22);
        SubLObject var24 = (SubLObject)module0349.NIL;
        final SubLObject var25 = module0139.$g1635$.currentBinding(var19);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var19);
            final SubLObject var26 = (SubLObject)module0349.NIL;
            final SubLObject var17_107 = module0141.$g1714$.currentBinding(var19);
            final SubLObject var27 = module0141.$g1715$.currentBinding(var19);
            try {
                module0141.$g1714$.bind((module0349.NIL != var26) ? var26 : module0141.f9283(), var19);
                module0141.$g1715$.bind((SubLObject)((module0349.NIL != var26) ? module0349.$ic16$ : module0141.$g1715$.getDynamicValue(var19)), var19);
                if (module0349.NIL != var26 && module0349.NIL != module0136.f8864() && module0349.NIL == module0141.f9279(var26)) {
                    final SubLObject var28 = module0136.$g1591$.getDynamicValue(var19);
                    if (var28.eql((SubLObject)module0349.$ic17$)) {
                        module0136.f8870((SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                    else if (var28.eql((SubLObject)module0349.$ic20$)) {
                        module0136.f8871((SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic21$, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                    else if (var28.eql((SubLObject)module0349.$ic22$)) {
                        Errors.warn((SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$);
                    }
                    else {
                        Errors.warn((SubLObject)module0349.$ic23$, module0136.$g1591$.getDynamicValue(var19));
                        Errors.cerror((SubLObject)module0349.$ic21$, (SubLObject)module0349.$ic18$, var26, (SubLObject)module0349.$ic19$);
                    }
                }
                final SubLObject var17_108 = module0141.$g1670$.currentBinding(var19);
                final SubLObject var27_109 = module0141.$g1671$.currentBinding(var19);
                final SubLObject var29 = module0141.$g1672$.currentBinding(var19);
                final SubLObject var30 = module0141.$g1674$.currentBinding(var19);
                final SubLObject var31 = module0137.$g1605$.currentBinding(var19);
                try {
                    module0141.$g1670$.bind(module0137.f8955(module0349.$ic30$), var19);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0349.$ic30$)), var19);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0349.$ic30$)), var19);
                    module0141.$g1674$.bind((SubLObject)module0349.NIL, var19);
                    module0137.$g1605$.bind(module0137.f8955(module0349.$ic30$), var19);
                    if (module0349.NIL != module0136.f8865() || module0349.NIL != module0244.f15795(var15, module0137.f8955((SubLObject)module0349.UNPROVIDED))) {
                        final SubLObject var17_109 = module0141.$g1677$.currentBinding(var19);
                        final SubLObject var27_110 = module0138.$g1619$.currentBinding(var19);
                        final SubLObject var31_112 = module0141.$g1674$.currentBinding(var19);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var19);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0349.$ic30$)), var19);
                            module0141.$g1674$.bind((SubLObject)module0349.NIL, var19);
                            module0249.f16055(var15, (SubLObject)module0349.UNPROVIDED);
                            for (var24 = (SubLObject)ConsesLow.list(var15, module0141.f9195()); module0349.NIL != var24; var24 = module0056.f4150(var23)) {
                                final SubLObject var21_113 = var24.first();
                                final SubLObject var32 = conses_high.second(var24);
                                final SubLObject var33 = var21_113;
                                final SubLObject var17_110 = module0141.$g1674$.currentBinding(var19);
                                try {
                                    module0141.$g1674$.bind(var32, var19);
                                    if (module0349.NIL != module0250.f16115(module0141.f9190(), var21_113) && !var33.eql(var15)) {
                                        final SubLObject var34 = module0217.f14266(var33, var18);
                                        if (var34.isPositive()) {
                                            var20 = (SubLObject)ConsesLow.cons(var33, var20);
                                            var21 = Numbers.add(var21, var34);
                                        }
                                    }
                                    SubLObject var36;
                                    final SubLObject var35 = var36 = module0200.f12443(module0137.f8955(module0349.$ic30$));
                                    SubLObject var37 = (SubLObject)module0349.NIL;
                                    var37 = var36.first();
                                    while (module0349.NIL != var36) {
                                        final SubLObject var17_111 = module0137.$g1605$.currentBinding(var19);
                                        final SubLObject var27_111 = module0141.$g1674$.currentBinding(var19);
                                        try {
                                            module0137.$g1605$.bind(var37, var19);
                                            module0141.$g1674$.bind((SubLObject)((module0349.NIL != module0141.f9205((SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0349.NIL == module0141.$g1674$.getDynamicValue(var19)) : module0141.$g1674$.getDynamicValue(var19)), var19);
                                            final SubLObject var38 = module0228.f15229(var21_113);
                                            if (module0349.NIL != module0138.f8992(var38)) {
                                                final SubLObject var39 = module0242.f15664(var38, module0137.f8955((SubLObject)module0349.UNPROVIDED));
                                                if (module0349.NIL != var39) {
                                                    final SubLObject var40 = module0245.f15834(var39, module0138.f8979(), module0137.f8955((SubLObject)module0349.UNPROVIDED));
                                                    if (module0349.NIL != var40) {
                                                        SubLObject var41;
                                                        for (var41 = module0066.f4838(module0067.f4891(var40)); module0349.NIL == module0066.f4841(var41); var41 = module0066.f4840(var41)) {
                                                            var19.resetMultipleValues();
                                                            final SubLObject var42 = module0066.f4839(var41);
                                                            final SubLObject var43 = var19.secondMultipleValue();
                                                            var19.resetMultipleValues();
                                                            if (module0349.NIL != module0147.f9507(var42)) {
                                                                final SubLObject var17_112 = module0138.$g1623$.currentBinding(var19);
                                                                try {
                                                                    module0138.$g1623$.bind(var42, var19);
                                                                    SubLObject var50_118;
                                                                    for (var50_118 = module0066.f4838(module0067.f4891(var43)); module0349.NIL == module0066.f4841(var50_118); var50_118 = module0066.f4840(var50_118)) {
                                                                        var19.resetMultipleValues();
                                                                        final SubLObject var44 = module0066.f4839(var50_118);
                                                                        final SubLObject var45 = var19.secondMultipleValue();
                                                                        var19.resetMultipleValues();
                                                                        if (module0349.NIL != module0141.f9289(var44)) {
                                                                            final SubLObject var17_113 = module0138.$g1624$.currentBinding(var19);
                                                                            try {
                                                                                module0138.$g1624$.bind(var44, var19);
                                                                                final SubLObject var46 = var45;
                                                                                if (module0349.NIL != module0077.f5302(var46)) {
                                                                                    final SubLObject var47 = module0077.f5333(var46);
                                                                                    SubLObject var48;
                                                                                    SubLObject var49;
                                                                                    SubLObject var50;
                                                                                    for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0349.NIL, var49 = module0032.f1742(var48, var47); module0349.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                                                                        var50 = module0032.f1745(var48, var49);
                                                                                        if (module0349.NIL != module0032.f1746(var49, var50) && module0349.NIL == module0249.f16059(var50, (SubLObject)module0349.UNPROVIDED)) {
                                                                                            module0249.f16055(var50, (SubLObject)module0349.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var50, module0141.f9195()), var23);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var46.isList()) {
                                                                                    SubLObject var51 = var46;
                                                                                    SubLObject var52 = (SubLObject)module0349.NIL;
                                                                                    var52 = var51.first();
                                                                                    while (module0349.NIL != var51) {
                                                                                        if (module0349.NIL == module0249.f16059(var52, (SubLObject)module0349.UNPROVIDED)) {
                                                                                            module0249.f16055(var52, (SubLObject)module0349.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var52, module0141.f9195()), var23);
                                                                                        }
                                                                                        var51 = var51.rest();
                                                                                        var52 = var51.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0349.$ic25$, var46);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var17_113, var19);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var50_118);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var17_112, var19);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var41);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0349.FIVE_INTEGER, (SubLObject)module0349.$ic26$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                                                }
                                            }
                                            else if (module0349.NIL != module0155.f9785(var38, (SubLObject)module0349.UNPROVIDED)) {
                                                SubLObject var43_120;
                                                final SubLObject var53 = var43_120 = ((module0349.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)module0349.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)module0349.UNPROVIDED)));
                                                SubLObject var54 = (SubLObject)module0349.NIL;
                                                var54 = var43_120.first();
                                                while (module0349.NIL != var43_120) {
                                                    final SubLObject var17_114 = module0138.$g1625$.currentBinding(var19);
                                                    try {
                                                        module0138.$g1625$.bind(var54, var19);
                                                        final SubLObject var56;
                                                        final SubLObject var55 = var56 = Functions.funcall(var54, var38);
                                                        if (module0349.NIL != module0077.f5302(var56)) {
                                                            final SubLObject var57 = module0077.f5333(var56);
                                                            SubLObject var58;
                                                            SubLObject var59;
                                                            SubLObject var60;
                                                            for (var58 = module0032.f1741(var57), var59 = (SubLObject)module0349.NIL, var59 = module0032.f1742(var58, var57); module0349.NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                var60 = module0032.f1745(var58, var59);
                                                                if (module0349.NIL != module0032.f1746(var59, var60) && module0349.NIL == module0249.f16059(var60, (SubLObject)module0349.UNPROVIDED)) {
                                                                    module0249.f16055(var60, (SubLObject)module0349.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var60, module0141.f9195()), var23);
                                                                }
                                                            }
                                                        }
                                                        else if (var56.isList()) {
                                                            SubLObject var61 = var56;
                                                            SubLObject var62 = (SubLObject)module0349.NIL;
                                                            var62 = var61.first();
                                                            while (module0349.NIL != var61) {
                                                                if (module0349.NIL == module0249.f16059(var62, (SubLObject)module0349.UNPROVIDED)) {
                                                                    module0249.f16055(var62, (SubLObject)module0349.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var62, module0141.f9195()), var23);
                                                                }
                                                                var61 = var61.rest();
                                                                var62 = var61.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0349.$ic25$, var56);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var17_114, var19);
                                                    }
                                                    var43_120 = var43_120.rest();
                                                    var54 = var43_120.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var27_111, var19);
                                            module0137.$g1605$.rebind(var17_111, var19);
                                        }
                                        var36 = var36.rest();
                                        var37 = var36.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var17_110, var19);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var31_112, var19);
                            module0138.$g1619$.rebind(var27_110, var19);
                            module0141.$g1677$.rebind(var17_109, var19);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.$ic27$, var15, module0244.f15748(module0137.f8955((SubLObject)module0349.UNPROVIDED)), (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var31, var19);
                    module0141.$g1674$.rebind(var30, var19);
                    module0141.$g1672$.rebind(var29, var19);
                    module0141.$g1671$.rebind(var27_109, var19);
                    module0141.$g1670$.rebind(var17_108, var19);
                }
            }
            finally {
                module0141.$g1715$.rebind(var27, var19);
                module0141.$g1714$.rebind(var17_107, var19);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var19));
        }
        finally {
            module0139.$g1635$.rebind(var25, var19);
        }
        return Values.values(Sequences.nreverse(var20), var21);
    }
    
    public static SubLObject f23427(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0034.$g879$.getDynamicValue(var19);
        SubLObject var21 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var20) {
            return f23428(var15, var18);
        }
        var21 = module0034.f1857(var20, (SubLObject)module0349.$ic31$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var21) {
            var21 = module0034.f1807(module0034.f1842(var20), (SubLObject)module0349.$ic31$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var20, (SubLObject)module0349.$ic31$, var21);
        }
        final SubLObject var22 = module0034.f1782(var15, var18);
        final SubLObject var23 = module0034.f1814(var21, var22, (SubLObject)module0349.UNPROVIDED);
        if (var23 != module0349.$ic2$) {
            SubLObject var24 = var23;
            SubLObject var25 = (SubLObject)module0349.NIL;
            var25 = var24.first();
            while (module0349.NIL != var24) {
                SubLObject var26 = var25.first();
                final SubLObject var27 = conses_high.second(var25);
                if (var15.eql(var26.first())) {
                    var26 = var26.rest();
                    if (module0349.NIL != var26 && module0349.NIL == var26.rest() && var18.eql(var26.first())) {
                        return module0034.f1959(var27);
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        final SubLObject var28 = Values.arg2(var19.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23428(var15, var18)));
        module0034.f1836(var21, var22, var23, var28, (SubLObject)ConsesLow.list(var15, var18));
        return module0034.f1959(var28);
    }
    
    public static SubLObject f23429(final SubLObject var15, final SubLObject var18) {
        SubLObject var19 = (SubLObject)module0349.NIL;
        SubLObject var20 = (SubLObject)module0349.ZERO_INTEGER;
        SubLObject var21 = module0261.f17222(var15, (SubLObject)module0349.NIL, (SubLObject)module0349.NIL);
        SubLObject var22 = (SubLObject)module0349.NIL;
        var22 = var21.first();
        while (module0349.NIL != var21) {
            final SubLObject var23 = module0217.f14266(var22, var18);
            if (var23.isPositive()) {
                var19 = (SubLObject)ConsesLow.cons(var22, var19);
                var20 = Numbers.add(var20, var23);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Values.values(Sequences.nreverse(var19), var20);
    }
    
    public static SubLObject f23430(final SubLObject var15, final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0034.$g879$.getDynamicValue(var19);
        SubLObject var21 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var20) {
            return f23429(var15, var18);
        }
        var21 = module0034.f1857(var20, (SubLObject)module0349.$ic32$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var21) {
            var21 = module0034.f1807(module0034.f1842(var20), (SubLObject)module0349.$ic32$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var20, (SubLObject)module0349.$ic32$, var21);
        }
        final SubLObject var22 = module0034.f1782(var15, var18);
        final SubLObject var23 = module0034.f1814(var21, var22, (SubLObject)module0349.UNPROVIDED);
        if (var23 != module0349.$ic2$) {
            SubLObject var24 = var23;
            SubLObject var25 = (SubLObject)module0349.NIL;
            var25 = var24.first();
            while (module0349.NIL != var24) {
                SubLObject var26 = var25.first();
                final SubLObject var27 = conses_high.second(var25);
                if (var15.eql(var26.first())) {
                    var26 = var26.rest();
                    if (module0349.NIL != var26 && module0349.NIL == var26.rest() && var18.eql(var26.first())) {
                        return module0034.f1959(var27);
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        final SubLObject var28 = Values.arg2(var19.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23429(var15, var18)));
        module0034.f1836(var21, var22, var23, var28, (SubLObject)ConsesLow.list(var15, var18));
        return module0034.f1959(var28);
    }
    
    public static SubLObject f23431(SubLObject var123) {
        var123 = Sequences.remove_duplicates(var123, Symbols.symbol_function((SubLObject)module0349.$ic33$), (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
        var123 = module0132.f8602(var123);
        return f23432(var123);
    }
    
    public static SubLObject f23433() {
        final SubLObject var11 = module0349.$g2985$.getGlobalValue();
        if (module0349.NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23434(final SubLObject var123) {
        return module0034.f1829(module0349.$g2985$.getGlobalValue(), (SubLObject)ConsesLow.list(var123), (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23435(final SubLObject var123) {
        return f23436(var123);
    }
    
    public static SubLObject f23432(final SubLObject var123) {
        SubLObject var124 = module0349.$g2985$.getGlobalValue();
        if (module0349.NIL == var124) {
            var124 = module0034.f1934((SubLObject)module0349.$ic34$, (SubLObject)module0349.$ic35$, (SubLObject)module0349.$ic36$, (SubLObject)module0349.EQUAL, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.ZERO_INTEGER);
            module0034.f1943((SubLObject)module0349.$ic37$);
        }
        SubLObject var125 = module0034.f1814(var124, var123, (SubLObject)module0349.$ic2$);
        if (var125 == module0349.$ic2$) {
            var125 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23435(var123)));
            module0034.f1816(var124, var123, var125, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var125);
    }
    
    public static SubLObject f23437(SubLObject var123, SubLObject var124) {
        if (var124 == module0349.UNPROVIDED) {
            var124 = (SubLObject)module0349.NIL;
        }
        var123 = Sequences.remove_duplicates(var123, Symbols.symbol_function((SubLObject)module0349.$ic33$), (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
        var123 = module0132.f8602(var123);
        if (module0349.NIL != var124) {
            return module0262.f17376(var123, var124, (SubLObject)module0349.UNPROVIDED);
        }
        return f23438(var123);
    }
    
    public static SubLObject f23439() {
        final SubLObject var11 = module0349.$g2986$.getGlobalValue();
        if (module0349.NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23440(final SubLObject var123) {
        return module0034.f1829(module0349.$g2986$.getGlobalValue(), (SubLObject)ConsesLow.list(var123), (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23441(final SubLObject var123) {
        return module0262.f17376(var123, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23438(final SubLObject var123) {
        SubLObject var124 = module0349.$g2986$.getGlobalValue();
        if (module0349.NIL == var124) {
            var124 = module0034.f1934((SubLObject)module0349.$ic38$, (SubLObject)module0349.$ic39$, (SubLObject)module0349.$ic36$, (SubLObject)module0349.EQUAL, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.ZERO_INTEGER);
            module0034.f1943((SubLObject)module0349.$ic40$);
        }
        SubLObject var125 = module0034.f1814(var124, var123, (SubLObject)module0349.$ic2$);
        if (var125 == module0349.$ic2$) {
            var125 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23441(var123)));
            module0034.f1816(var124, var123, var125, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var125);
    }
    
    public static SubLObject f23442(final SubLObject var125) {
        return module0303.f20235(var125, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23443(final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        final SubLObject var127 = module0034.$g879$.getDynamicValue(var126);
        SubLObject var128 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var127) {
            return f23442(var125);
        }
        var128 = module0034.f1857(var127, (SubLObject)module0349.$ic41$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var128) {
            var128 = module0034.f1807(module0034.f1842(var127), (SubLObject)module0349.$ic41$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var127, (SubLObject)module0349.$ic41$, var128);
        }
        SubLObject var129 = module0034.f1814(var128, var125, (SubLObject)module0349.$ic2$);
        if (var129 == module0349.$ic2$) {
            var129 = Values.arg2(var126.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23442(var125)));
            module0034.f1816(var128, var125, var129, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var129);
    }
    
    public static SubLObject f23436(final SubLObject var123) {
        return module0035.sublisp_boolean(module0262.f17370(var123, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED));
    }
    
    public static SubLObject f23444(final SubLObject var126) {
        return module0258.f16776(var126, (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23445(final SubLObject var126) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        final SubLObject var128 = module0034.$g879$.getDynamicValue(var127);
        SubLObject var129 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var128) {
            return f23444(var126);
        }
        var129 = module0034.f1857(var128, (SubLObject)module0349.$ic42$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var129) {
            var129 = module0034.f1807(module0034.f1842(var128), (SubLObject)module0349.$ic42$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var128, (SubLObject)module0349.$ic42$, var129);
        }
        SubLObject var130 = module0034.f1814(var129, var126, (SubLObject)module0349.$ic2$);
        if (var130 == module0349.$ic2$) {
            var130 = Values.arg2(var127.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23444(var126)));
            module0034.f1816(var129, var126, var130, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var130);
    }
    
    public static SubLObject f23446(final SubLObject var127, final SubLObject var128) {
        SubLObject var130;
        final SubLObject var129 = var130 = var127.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0349.$ic43$);
        final SubLObject var131 = var130.rest();
        var130 = var130.first();
        SubLObject var132 = (SubLObject)module0349.NIL;
        SubLObject var133 = (SubLObject)module0349.NIL;
        SubLObject var134 = (SubLObject)module0349.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0349.$ic43$);
        var132 = var130.first();
        var130 = var130.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0349.$ic43$);
        var133 = var130.first();
        var130 = var130.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0349.$ic43$);
        var134 = var130.first();
        var130 = var130.rest();
        SubLObject var135 = (SubLObject)module0349.NIL;
        SubLObject var136 = var130;
        SubLObject var137 = (SubLObject)module0349.NIL;
        SubLObject var137_138 = (SubLObject)module0349.NIL;
        while (module0349.NIL != var136) {
            cdestructuring_bind.destructuring_bind_must_consp(var136, var129, (SubLObject)module0349.$ic43$);
            var137_138 = var136.first();
            var136 = var136.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var136, var129, (SubLObject)module0349.$ic43$);
            if (module0349.NIL == conses_high.member(var137_138, (SubLObject)module0349.$ic44$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED)) {
                var137 = (SubLObject)module0349.T;
            }
            if (var137_138 == module0349.$ic45$) {
                var135 = var136.first();
            }
            var136 = var136.rest();
        }
        if (module0349.NIL != var137 && module0349.NIL == var135) {
            cdestructuring_bind.cdestructuring_bind_error(var129, (SubLObject)module0349.$ic43$);
        }
        final SubLObject var138 = cdestructuring_bind.property_list_member((SubLObject)module0349.$ic46$, var130);
        final SubLObject var139 = (SubLObject)((module0349.NIL != var138) ? conses_high.cadr(var138) : module0349.NIL);
        final SubLObject var140;
        var130 = (var140 = var131);
        return (SubLObject)ConsesLow.listS((SubLObject)module0349.$ic47$, (SubLObject)ConsesLow.list(var132, var133, var134, (SubLObject)module0349.$ic46$, var139), ConsesLow.append(var140, (SubLObject)module0349.NIL));
    }
    
    public static SubLObject f23447(final SubLObject var127, final SubLObject var128) {
        SubLObject var130;
        final SubLObject var129 = var130 = var127.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0349.$ic43$);
        final SubLObject var131 = var130.rest();
        var130 = var130.first();
        SubLObject var132 = (SubLObject)module0349.NIL;
        SubLObject var133 = (SubLObject)module0349.NIL;
        SubLObject var134 = (SubLObject)module0349.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0349.$ic43$);
        var132 = var130.first();
        var130 = var130.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0349.$ic43$);
        var133 = var130.first();
        var130 = var130.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0349.$ic43$);
        var134 = var130.first();
        var130 = var130.rest();
        SubLObject var135 = (SubLObject)module0349.NIL;
        SubLObject var136 = var130;
        SubLObject var137 = (SubLObject)module0349.NIL;
        SubLObject var148_149 = (SubLObject)module0349.NIL;
        while (module0349.NIL != var136) {
            cdestructuring_bind.destructuring_bind_must_consp(var136, var129, (SubLObject)module0349.$ic43$);
            var148_149 = var136.first();
            var136 = var136.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var136, var129, (SubLObject)module0349.$ic43$);
            if (module0349.NIL == conses_high.member(var148_149, (SubLObject)module0349.$ic44$, (SubLObject)module0349.UNPROVIDED, (SubLObject)module0349.UNPROVIDED)) {
                var137 = (SubLObject)module0349.T;
            }
            if (var148_149 == module0349.$ic45$) {
                var135 = var136.first();
            }
            var136 = var136.rest();
        }
        if (module0349.NIL != var137 && module0349.NIL == var135) {
            cdestructuring_bind.cdestructuring_bind_error(var129, (SubLObject)module0349.$ic43$);
        }
        final SubLObject var138 = cdestructuring_bind.property_list_member((SubLObject)module0349.$ic46$, var130);
        final SubLObject var139 = (SubLObject)((module0349.NIL != var138) ? conses_high.cadr(var138) : module0349.NIL);
        final SubLObject var140;
        var130 = (var140 = var131);
        return (SubLObject)ConsesLow.listS((SubLObject)module0349.$ic48$, (SubLObject)ConsesLow.list(var132, (SubLObject)ConsesLow.list((SubLObject)module0349.$ic49$, var133, var134), (SubLObject)module0349.$ic50$, (SubLObject)ConsesLow.list((SubLObject)module0349.$ic51$, var134), (SubLObject)module0349.$ic46$, var139), ConsesLow.append(var140, (SubLObject)module0349.NIL));
    }
    
    public static SubLObject f23448(final SubLObject var133, final SubLObject var18) {
        return module0217.f14404(var133, module0130.f8518(var18), (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23449(final SubLObject var133, final SubLObject var18) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = module0034.$g879$.getDynamicValue(var134);
        SubLObject var136 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var135) {
            return f23448(var133, var18);
        }
        var136 = module0034.f1857(var135, (SubLObject)module0349.$ic49$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var136) {
            var136 = module0034.f1807(module0034.f1842(var135), (SubLObject)module0349.$ic49$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var135, (SubLObject)module0349.$ic49$, var136);
        }
        final SubLObject var137 = module0034.f1782(var133, var18);
        final SubLObject var138 = module0034.f1814(var136, var137, (SubLObject)module0349.UNPROVIDED);
        if (var138 != module0349.$ic2$) {
            SubLObject var139 = var138;
            SubLObject var140 = (SubLObject)module0349.NIL;
            var140 = var139.first();
            while (module0349.NIL != var139) {
                SubLObject var141 = var140.first();
                final SubLObject var142 = conses_high.second(var140);
                if (var133.equal(var141.first())) {
                    var141 = var141.rest();
                    if (module0349.NIL != var141 && module0349.NIL == var141.rest() && var18.equal(var141.first())) {
                        return module0034.f1959(var142);
                    }
                }
                var139 = var139.rest();
                var140 = var139.first();
            }
        }
        final SubLObject var143 = Values.arg2(var134.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23448(var133, var18)));
        module0034.f1836(var136, var137, var138, var143, (SubLObject)ConsesLow.list(var133, var18));
        return module0034.f1959(var143);
    }
    
    public static SubLObject f23450(final SubLObject var133, final SubLObject var18) {
        return module0217.f14406(var133, module0130.f8518(var18), (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23451(final SubLObject var133, final SubLObject var18) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = module0034.$g879$.getDynamicValue(var134);
        SubLObject var136 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var135) {
            return f23450(var133, var18);
        }
        var136 = module0034.f1857(var135, (SubLObject)module0349.$ic52$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var136) {
            var136 = module0034.f1807(module0034.f1842(var135), (SubLObject)module0349.$ic52$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var135, (SubLObject)module0349.$ic52$, var136);
        }
        final SubLObject var137 = module0034.f1782(var133, var18);
        final SubLObject var138 = module0034.f1814(var136, var137, (SubLObject)module0349.UNPROVIDED);
        if (var138 != module0349.$ic2$) {
            SubLObject var139 = var138;
            SubLObject var140 = (SubLObject)module0349.NIL;
            var140 = var139.first();
            while (module0349.NIL != var139) {
                SubLObject var141 = var140.first();
                final SubLObject var142 = conses_high.second(var140);
                if (var133.equal(var141.first())) {
                    var141 = var141.rest();
                    if (module0349.NIL != var141 && module0349.NIL == var141.rest() && var18.equal(var141.first())) {
                        return module0034.f1959(var142);
                    }
                }
                var139 = var139.rest();
                var140 = var139.first();
            }
        }
        final SubLObject var143 = Values.arg2(var134.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23450(var133, var18)));
        module0034.f1836(var136, var137, var138, var143, (SubLObject)ConsesLow.list(var133, var18));
        return module0034.f1959(var143);
    }
    
    public static SubLObject f23452(final SubLObject var151, final SubLObject var133, final SubLObject var18) {
        return module0217.f14406(var133, module0130.f8518(var18), (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23453(final SubLObject var151, final SubLObject var133, final SubLObject var18) {
        final SubLThread var152 = SubLProcess.currentSubLThread();
        final SubLObject var153 = module0034.$g879$.getDynamicValue(var152);
        SubLObject var154 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var153) {
            return f23452(var151, var133, var18);
        }
        var154 = module0034.f1857(var153, (SubLObject)module0349.$ic53$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var154) {
            var154 = module0034.f1807(module0034.f1842(var153), (SubLObject)module0349.$ic53$, (SubLObject)module0349.THREE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var153, (SubLObject)module0349.$ic53$, var154);
        }
        final SubLObject var155 = module0034.f1781(var151, var133, var18);
        final SubLObject var156 = module0034.f1814(var154, var155, (SubLObject)module0349.UNPROVIDED);
        if (var156 != module0349.$ic2$) {
            SubLObject var157 = var156;
            SubLObject var158 = (SubLObject)module0349.NIL;
            var158 = var157.first();
            while (module0349.NIL != var157) {
                SubLObject var159 = var158.first();
                final SubLObject var160 = conses_high.second(var158);
                if (var151.equal(var159.first())) {
                    var159 = var159.rest();
                    if (var133.equal(var159.first())) {
                        var159 = var159.rest();
                        if (module0349.NIL != var159 && module0349.NIL == var159.rest() && var18.equal(var159.first())) {
                            return module0034.f1959(var160);
                        }
                    }
                }
                var157 = var157.rest();
                var158 = var157.first();
            }
        }
        final SubLObject var161 = Values.arg2(var152.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23452(var151, var133, var18)));
        module0034.f1836(var154, var155, var156, var161, (SubLObject)ConsesLow.list(var151, var133, var18));
        return module0034.f1959(var161);
    }
    
    public static SubLObject f23454(final SubLObject var152) {
        return module0217.f14233(var152);
    }
    
    public static SubLObject f23455(final SubLObject var152) {
        final SubLThread var153 = SubLProcess.currentSubLThread();
        final SubLObject var154 = module0034.$g879$.getDynamicValue(var153);
        SubLObject var155 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var154) {
            return f23454(var152);
        }
        var155 = module0034.f1857(var154, (SubLObject)module0349.$ic54$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var155) {
            var155 = module0034.f1807(module0034.f1842(var154), (SubLObject)module0349.$ic54$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var154, (SubLObject)module0349.$ic54$, var155);
        }
        SubLObject var156 = module0034.f1814(var155, var152, (SubLObject)module0349.$ic2$);
        if (var156 == module0349.$ic2$) {
            var156 = Values.arg2(var153.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23454(var152)));
            module0034.f1816(var155, var152, var156, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var156);
    }
    
    public static SubLObject f23456(final SubLObject var152, SubLObject var153) {
        if (var153 == module0349.UNPROVIDED) {
            var153 = (SubLObject)module0349.NIL;
        }
        return module0217.f14231(var152, var153);
    }
    
    public static SubLObject f23457(final SubLObject var152, SubLObject var153) {
        if (var153 == module0349.UNPROVIDED) {
            var153 = (SubLObject)module0349.NIL;
        }
        final SubLThread var154 = SubLProcess.currentSubLThread();
        final SubLObject var155 = module0034.$g879$.getDynamicValue(var154);
        SubLObject var156 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var155) {
            return f23456(var152, var153);
        }
        var156 = module0034.f1857(var155, (SubLObject)module0349.$ic55$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var156) {
            var156 = module0034.f1807(module0034.f1842(var155), (SubLObject)module0349.$ic55$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var155, (SubLObject)module0349.$ic55$, var156);
        }
        final SubLObject var157 = module0034.f1782(var152, var153);
        final SubLObject var158 = module0034.f1814(var156, var157, (SubLObject)module0349.UNPROVIDED);
        if (var158 != module0349.$ic2$) {
            SubLObject var159 = var158;
            SubLObject var160 = (SubLObject)module0349.NIL;
            var160 = var159.first();
            while (module0349.NIL != var159) {
                SubLObject var161 = var160.first();
                final SubLObject var162 = conses_high.second(var160);
                if (var152.eql(var161.first())) {
                    var161 = var161.rest();
                    if (module0349.NIL != var161 && module0349.NIL == var161.rest() && var153.eql(var161.first())) {
                        return module0034.f1959(var162);
                    }
                }
                var159 = var159.rest();
                var160 = var159.first();
            }
        }
        final SubLObject var163 = Values.arg2(var154.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23456(var152, var153)));
        module0034.f1836(var156, var157, var158, var163, (SubLObject)ConsesLow.list(var152, var153));
        return module0034.f1959(var163);
    }
    
    public static SubLObject f23458(final SubLObject var152, SubLObject var153, SubLObject var15) {
        if (var153 == module0349.UNPROVIDED) {
            var153 = (SubLObject)module0349.NIL;
        }
        if (var15 == module0349.UNPROVIDED) {
            var15 = (SubLObject)module0349.NIL;
        }
        return module0217.f14232(var152, var153, var15);
    }
    
    public static SubLObject f23459(final SubLObject var152, SubLObject var153, SubLObject var15) {
        if (var153 == module0349.UNPROVIDED) {
            var153 = (SubLObject)module0349.NIL;
        }
        if (var15 == module0349.UNPROVIDED) {
            var15 = (SubLObject)module0349.NIL;
        }
        final SubLThread var154 = SubLProcess.currentSubLThread();
        final SubLObject var155 = module0034.$g879$.getDynamicValue(var154);
        SubLObject var156 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var155) {
            return f23458(var152, var153, var15);
        }
        var156 = module0034.f1857(var155, (SubLObject)module0349.$ic56$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var156) {
            var156 = module0034.f1807(module0034.f1842(var155), (SubLObject)module0349.$ic56$, (SubLObject)module0349.THREE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var155, (SubLObject)module0349.$ic56$, var156);
        }
        final SubLObject var157 = module0034.f1781(var152, var153, var15);
        final SubLObject var158 = module0034.f1814(var156, var157, (SubLObject)module0349.UNPROVIDED);
        if (var158 != module0349.$ic2$) {
            SubLObject var159 = var158;
            SubLObject var160 = (SubLObject)module0349.NIL;
            var160 = var159.first();
            while (module0349.NIL != var159) {
                SubLObject var161 = var160.first();
                final SubLObject var162 = conses_high.second(var160);
                if (var152.eql(var161.first())) {
                    var161 = var161.rest();
                    if (var153.eql(var161.first())) {
                        var161 = var161.rest();
                        if (module0349.NIL != var161 && module0349.NIL == var161.rest() && var15.eql(var161.first())) {
                            return module0034.f1959(var162);
                        }
                    }
                }
                var159 = var159.rest();
                var160 = var159.first();
            }
        }
        final SubLObject var163 = Values.arg2(var154.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23458(var152, var153, var15)));
        module0034.f1836(var156, var157, var158, var163, (SubLObject)ConsesLow.list(var152, var153, var15));
        return module0034.f1959(var163);
    }
    
    public static SubLObject f23460(final SubLObject var154) {
        assert module0349.NIL != module0363.f24478(var154) : var154;
        SubLObject var156;
        final SubLObject var155 = var156 = module0363.f24509(var154);
        SubLObject var157 = (SubLObject)module0349.NIL;
        var157 = var156.first();
        while (module0349.NIL != var156) {
            if (module0349.NIL == f23461(var157)) {
                return (SubLObject)module0349.NIL;
            }
            var156 = var156.rest();
            var157 = var156.first();
        }
        return (SubLObject)module0349.T;
    }
    
    public static SubLObject f23461(final SubLObject var156) {
        SubLObject var157 = module0232.f15306(var156);
        SubLObject var158 = (SubLObject)module0349.NIL;
        var158 = var157.first();
        while (module0349.NIL != var157) {
            if (module0349.NIL != f23462(var158)) {
                return (SubLObject)module0349.T;
            }
            var157 = var157.rest();
            var158 = var157.first();
        }
        var157 = module0232.f15308(var156);
        var158 = (SubLObject)module0349.NIL;
        var158 = var157.first();
        while (module0349.NIL != var157) {
            if (module0349.NIL != f23462(var158)) {
                return (SubLObject)module0349.T;
            }
            var157 = var157.rest();
            var158 = var157.first();
        }
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23462(final SubLObject var157) {
        final SubLObject var158 = module0362.f24436(var157);
        final SubLObject var159 = module0362.f24435(var157);
        return f23463(var158, var159);
    }
    
    public static SubLObject f23463(final SubLObject var133, SubLObject var2) {
        var2 = f23464(var2);
        final SubLObject var134 = module0205.f13333(var133);
        if (module0349.NIL != module0173.f10955(var134)) {
            if (module0349.NIL != f23465(var134, var2)) {
                return (SubLObject)module0349.T;
            }
            final SubLObject var15_158 = module0205.f13333(var133);
            if (module0349.NIL != module0004.f104(var15_158, (SubLObject)module0349.$ic58$, Symbols.symbol_function((SubLObject)module0349.EQL), (SubLObject)module0349.UNPROVIDED)) {
                final SubLObject var135 = module0205.f13388(var133, (SubLObject)module0349.UNPROVIDED);
                if (module0349.NIL != module0173.f10955(var135)) {
                    if (module0349.NIL != f23466(var135, var2)) {
                        return (SubLObject)module0349.T;
                    }
                    if (var15_158.eql(module0349.$ic59$) && module0349.NIL != f23467(var135, var2)) {
                        return (SubLObject)module0349.T;
                    }
                    if (var15_158.eql(module0349.$ic60$) && module0349.NIL != f23468(var135, var2)) {
                        return (SubLObject)module0349.T;
                    }
                }
            }
        }
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23469(final SubLObject var5, final SubLObject var2) {
        return module0226.f14863(var5, f23464(var2));
    }
    
    public static SubLObject f23465(final SubLObject var5, final SubLObject var2) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var7) {
            return f23469(var5, var2);
        }
        var8 = module0034.f1857(var7, (SubLObject)module0349.$ic61$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)module0349.$ic61$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var7, (SubLObject)module0349.$ic61$, var8);
        }
        final SubLObject var9 = module0034.f1782(var5, var2);
        final SubLObject var10 = module0034.f1814(var8, var9, (SubLObject)module0349.UNPROVIDED);
        if (var10 != module0349.$ic2$) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0349.NIL;
            var12 = var11.first();
            while (module0349.NIL != var11) {
                SubLObject var13 = var12.first();
                final SubLObject var14 = conses_high.second(var12);
                if (var5.equal(var13.first())) {
                    var13 = var13.rest();
                    if (module0349.NIL != var13 && module0349.NIL == var13.rest() && var2.equal(var13.first())) {
                        return module0034.f1959(var14);
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        final SubLObject var15 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23469(var5, var2)));
        module0034.f1836(var8, var9, var10, var15, (SubLObject)ConsesLow.list(var5, var2));
        return module0034.f1959(var15);
    }
    
    public static SubLObject f23470(final SubLObject var5, final SubLObject var2) {
        return module0226.f14866(var5, f23464(var2));
    }
    
    public static SubLObject f23471(final SubLObject var5, final SubLObject var2) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var7) {
            return f23470(var5, var2);
        }
        var8 = module0034.f1857(var7, (SubLObject)module0349.$ic62$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)module0349.$ic62$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var7, (SubLObject)module0349.$ic62$, var8);
        }
        final SubLObject var9 = module0034.f1782(var5, var2);
        final SubLObject var10 = module0034.f1814(var8, var9, (SubLObject)module0349.UNPROVIDED);
        if (var10 != module0349.$ic2$) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0349.NIL;
            var12 = var11.first();
            while (module0349.NIL != var11) {
                SubLObject var13 = var12.first();
                final SubLObject var14 = conses_high.second(var12);
                if (var5.equal(var13.first())) {
                    var13 = var13.rest();
                    if (module0349.NIL != var13 && module0349.NIL == var13.rest() && var2.equal(var13.first())) {
                        return module0034.f1959(var14);
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        final SubLObject var15 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23470(var5, var2)));
        module0034.f1836(var8, var9, var10, var15, (SubLObject)ConsesLow.list(var5, var2));
        return module0034.f1959(var15);
    }
    
    public static SubLObject f23472(final SubLObject var159, final SubLObject var2) {
        return module0226.f14870(var159, f23464(var2));
    }
    
    public static SubLObject f23473(final SubLObject var159, final SubLObject var2) {
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = module0034.$g879$.getDynamicValue(var160);
        SubLObject var162 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var161) {
            return f23472(var159, var2);
        }
        var162 = module0034.f1857(var161, (SubLObject)module0349.$ic63$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var162) {
            var162 = module0034.f1807(module0034.f1842(var161), (SubLObject)module0349.$ic63$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var161, (SubLObject)module0349.$ic63$, var162);
        }
        final SubLObject var163 = module0034.f1782(var159, var2);
        final SubLObject var164 = module0034.f1814(var162, var163, (SubLObject)module0349.UNPROVIDED);
        if (var164 != module0349.$ic2$) {
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0349.NIL;
            var166 = var165.first();
            while (module0349.NIL != var165) {
                SubLObject var167 = var166.first();
                final SubLObject var168 = conses_high.second(var166);
                if (var159.equal(var167.first())) {
                    var167 = var167.rest();
                    if (module0349.NIL != var167 && module0349.NIL == var167.rest() && var2.equal(var167.first())) {
                        return module0034.f1959(var168);
                    }
                }
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        final SubLObject var169 = Values.arg2(var160.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23472(var159, var2)));
        module0034.f1836(var162, var163, var164, var169, (SubLObject)ConsesLow.list(var159, var2));
        return module0034.f1959(var169);
    }
    
    public static SubLObject f23474(final SubLObject var159, final SubLObject var2) {
        return module0226.f14871(var159, f23464(var2));
    }
    
    public static SubLObject f23475(final SubLObject var159, final SubLObject var2) {
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = module0034.$g879$.getDynamicValue(var160);
        SubLObject var162 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var161) {
            return f23474(var159, var2);
        }
        var162 = module0034.f1857(var161, (SubLObject)module0349.$ic64$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var162) {
            var162 = module0034.f1807(module0034.f1842(var161), (SubLObject)module0349.$ic64$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var161, (SubLObject)module0349.$ic64$, var162);
        }
        final SubLObject var163 = module0034.f1782(var159, var2);
        final SubLObject var164 = module0034.f1814(var162, var163, (SubLObject)module0349.UNPROVIDED);
        if (var164 != module0349.$ic2$) {
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0349.NIL;
            var166 = var165.first();
            while (module0349.NIL != var165) {
                SubLObject var167 = var166.first();
                final SubLObject var168 = conses_high.second(var166);
                if (var159.equal(var167.first())) {
                    var167 = var167.rest();
                    if (module0349.NIL != var167 && module0349.NIL == var167.rest() && var2.equal(var167.first())) {
                        return module0034.f1959(var168);
                    }
                }
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        final SubLObject var169 = Values.arg2(var160.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23474(var159, var2)));
        module0034.f1836(var162, var163, var164, var169, (SubLObject)ConsesLow.list(var159, var2));
        return module0034.f1959(var169);
    }
    
    public static SubLObject f23476(final SubLObject var159, final SubLObject var2) {
        return module0226.f14872(var159, f23464(var2));
    }
    
    public static SubLObject f23477(final SubLObject var159, final SubLObject var2) {
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = module0034.$g879$.getDynamicValue(var160);
        SubLObject var162 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var161) {
            return f23476(var159, var2);
        }
        var162 = module0034.f1857(var161, (SubLObject)module0349.$ic65$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var162) {
            var162 = module0034.f1807(module0034.f1842(var161), (SubLObject)module0349.$ic65$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var161, (SubLObject)module0349.$ic65$, var162);
        }
        final SubLObject var163 = module0034.f1782(var159, var2);
        final SubLObject var164 = module0034.f1814(var162, var163, (SubLObject)module0349.UNPROVIDED);
        if (var164 != module0349.$ic2$) {
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0349.NIL;
            var166 = var165.first();
            while (module0349.NIL != var165) {
                SubLObject var167 = var166.first();
                final SubLObject var168 = conses_high.second(var166);
                if (var159.equal(var167.first())) {
                    var167 = var167.rest();
                    if (module0349.NIL != var167 && module0349.NIL == var167.rest() && var2.equal(var167.first())) {
                        return module0034.f1959(var168);
                    }
                }
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        final SubLObject var169 = Values.arg2(var160.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23476(var159, var2)));
        module0034.f1836(var162, var163, var164, var169, (SubLObject)ConsesLow.list(var159, var2));
        return module0034.f1959(var169);
    }
    
    public static SubLObject f23478(final SubLObject var126, final SubLObject var2) {
        return module0226.f14869(var126, f23464(var2));
    }
    
    public static SubLObject f23466(final SubLObject var126, final SubLObject var2) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        final SubLObject var128 = module0034.$g879$.getDynamicValue(var127);
        SubLObject var129 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var128) {
            return f23478(var126, var2);
        }
        var129 = module0034.f1857(var128, (SubLObject)module0349.$ic66$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var129) {
            var129 = module0034.f1807(module0034.f1842(var128), (SubLObject)module0349.$ic66$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var128, (SubLObject)module0349.$ic66$, var129);
        }
        final SubLObject var130 = module0034.f1782(var126, var2);
        final SubLObject var131 = module0034.f1814(var129, var130, (SubLObject)module0349.UNPROVIDED);
        if (var131 != module0349.$ic2$) {
            SubLObject var132 = var131;
            SubLObject var133 = (SubLObject)module0349.NIL;
            var133 = var132.first();
            while (module0349.NIL != var132) {
                SubLObject var134 = var133.first();
                final SubLObject var135 = conses_high.second(var133);
                if (var126.equal(var134.first())) {
                    var134 = var134.rest();
                    if (module0349.NIL != var134 && module0349.NIL == var134.rest() && var2.equal(var134.first())) {
                        return module0034.f1959(var135);
                    }
                }
                var132 = var132.rest();
                var133 = var132.first();
            }
        }
        final SubLObject var136 = Values.arg2(var127.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23478(var126, var2)));
        module0034.f1836(var129, var130, var131, var136, (SubLObject)ConsesLow.list(var126, var2));
        return module0034.f1959(var136);
    }
    
    public static SubLObject f23479(final SubLObject var126, final SubLObject var2) {
        return module0226.f14867(var126, f23464(var2));
    }
    
    public static SubLObject f23467(final SubLObject var126, final SubLObject var2) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        final SubLObject var128 = module0034.$g879$.getDynamicValue(var127);
        SubLObject var129 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var128) {
            return f23479(var126, var2);
        }
        var129 = module0034.f1857(var128, (SubLObject)module0349.$ic67$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var129) {
            var129 = module0034.f1807(module0034.f1842(var128), (SubLObject)module0349.$ic67$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var128, (SubLObject)module0349.$ic67$, var129);
        }
        final SubLObject var130 = module0034.f1782(var126, var2);
        final SubLObject var131 = module0034.f1814(var129, var130, (SubLObject)module0349.UNPROVIDED);
        if (var131 != module0349.$ic2$) {
            SubLObject var132 = var131;
            SubLObject var133 = (SubLObject)module0349.NIL;
            var133 = var132.first();
            while (module0349.NIL != var132) {
                SubLObject var134 = var133.first();
                final SubLObject var135 = conses_high.second(var133);
                if (var126.equal(var134.first())) {
                    var134 = var134.rest();
                    if (module0349.NIL != var134 && module0349.NIL == var134.rest() && var2.equal(var134.first())) {
                        return module0034.f1959(var135);
                    }
                }
                var132 = var132.rest();
                var133 = var132.first();
            }
        }
        final SubLObject var136 = Values.arg2(var127.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23479(var126, var2)));
        module0034.f1836(var129, var130, var131, var136, (SubLObject)ConsesLow.list(var126, var2));
        return module0034.f1959(var136);
    }
    
    public static SubLObject f23480(final SubLObject var126, final SubLObject var2) {
        return module0226.f14868(var126, f23464(var2));
    }
    
    public static SubLObject f23468(final SubLObject var126, final SubLObject var2) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        final SubLObject var128 = module0034.$g879$.getDynamicValue(var127);
        SubLObject var129 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var128) {
            return f23480(var126, var2);
        }
        var129 = module0034.f1857(var128, (SubLObject)module0349.$ic68$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var129) {
            var129 = module0034.f1807(module0034.f1842(var128), (SubLObject)module0349.$ic68$, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var128, (SubLObject)module0349.$ic68$, var129);
        }
        final SubLObject var130 = module0034.f1782(var126, var2);
        final SubLObject var131 = module0034.f1814(var129, var130, (SubLObject)module0349.UNPROVIDED);
        if (var131 != module0349.$ic2$) {
            SubLObject var132 = var131;
            SubLObject var133 = (SubLObject)module0349.NIL;
            var133 = var132.first();
            while (module0349.NIL != var132) {
                SubLObject var134 = var133.first();
                final SubLObject var135 = conses_high.second(var133);
                if (var126.equal(var134.first())) {
                    var134 = var134.rest();
                    if (module0349.NIL != var134 && module0349.NIL == var134.rest() && var2.equal(var134.first())) {
                        return module0034.f1959(var135);
                    }
                }
                var132 = var132.rest();
                var133 = var132.first();
            }
        }
        final SubLObject var136 = Values.arg2(var127.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23480(var126, var2)));
        module0034.f1836(var129, var130, var131, var136, (SubLObject)ConsesLow.list(var126, var2));
        return module0034.f1959(var136);
    }
    
    public static SubLObject f23464(final SubLObject var2) {
        return module0147.f9558(var2);
    }
    
    public static SubLObject f23481(final SubLObject var160, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0173.f10955(var160) && module0349.NIL != module0220.f14548(var160, module0349.$ic69$, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic70$));
    }
    
    public static SubLObject f23482(final SubLObject var162, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0174.f11035(var162) && module0349.NIL != module0220.f14548(var162, module0349.$ic71$, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic70$));
    }
    
    public static SubLObject f23483(final SubLObject var5, final SubLObject var162, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0173.f10955(var5) && module0349.NIL != module0174.f11035(var162) && module0349.NIL != module0220.f14582(module0349.$ic72$, var5, var162, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.$ic70$));
    }
    
    public static SubLObject f23484(final SubLObject var152, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0173.f10955(var152) && module0349.NIL != module0226.f14875(var152) && module0349.NIL != module0220.f14548(var152, module0349.$ic73$, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic70$));
    }
    
    public static SubLObject f23485(final SubLObject var160, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0173.f10955(var160) && module0349.NIL != module0220.f14548(var160, module0349.$ic74$, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic70$));
    }
    
    public static SubLObject f23486(final SubLObject var162, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0174.f11035(var162) && module0349.NIL != module0220.f14548(var162, module0349.$ic75$, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic70$));
    }
    
    public static SubLObject f23487(final SubLObject var5, final SubLObject var162, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0173.f10955(var5) && module0349.NIL != module0174.f11035(var162) && module0349.NIL != module0220.f14582(module0349.$ic76$, var5, var162, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.$ic70$));
    }
    
    public static SubLObject f23488(final SubLObject var152, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0173.f10955(var152) && module0349.NIL != module0226.f14876(var152) && module0349.NIL != module0220.f14548(var152, module0349.$ic77$, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic70$));
    }
    
    public static SubLObject f23489(final SubLObject var162, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0349.NIL != module0174.f11035(var162) && module0349.NIL != module0220.f14548(var162, module0349.$ic78$, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic70$));
    }
    
    public static SubLObject f23490(final SubLObject var162, SubLObject var161) {
        if (var161 == module0349.UNPROVIDED) {
            var161 = (SubLObject)module0349.NIL;
        }
        if (module0349.NIL != module0174.f11035(var162)) {
            return module0220.f14557(var162, module0349.$ic78$, var161, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.TWO_INTEGER, (SubLObject)module0349.$ic70$);
        }
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23491(SubLObject var133, SubLObject var2, SubLObject var163) {
        if (var163 == module0349.UNPROVIDED) {
            var163 = (SubLObject)module0349.$ic70$;
        }
        final SubLThread var164 = SubLProcess.currentSubLThread();
        SubLObject var165 = (SubLObject)module0349.T;
        SubLObject var166 = (SubLObject)module0349.NIL;
        if (module0349.NIL != module0206.f13433(var133)) {
            if (module0349.NIL != module0202.f12884(var133)) {
                var164.resetMultipleValues();
                final SubLObject var166_167 = module0279.f18576(var133, var2);
                final SubLObject var168_169 = var164.secondMultipleValue();
                var164.resetMultipleValues();
                var133 = var166_167;
                var2 = var168_169;
            }
            final SubLObject var167 = var163;
            if (var167.eql((SubLObject)module0349.$ic70$)) {
                SubLObject var168 = f23492(var133, var2);
                var168 = conses_high.putf(var168, (SubLObject)module0349.$ic80$, module0450.f31011());
                if (module0349.NIL != module0035.f2331(var168, (SubLObject)module0349.$ic81$)) {
                    var164.resetMultipleValues();
                    final SubLObject var171_172 = module0347.f23337(var133, var2, var163, var168);
                    final SubLObject var173_174 = var164.secondMultipleValue();
                    var164.resetMultipleValues();
                    var166 = var171_172;
                    var165 = var173_174;
                }
                else {
                    var164.resetMultipleValues();
                    final SubLObject var175_176 = module0434.f30594(var133, var2, var168);
                    final SubLObject var177_178 = var164.secondMultipleValue();
                    var164.resetMultipleValues();
                    var166 = var175_176;
                    var165 = var177_178;
                }
            }
            else if (var167.eql((SubLObject)module0349.$ic82$)) {
                var164.resetMultipleValues();
                final SubLObject var179_180 = module0347.f23337(var133, var2, var163, (SubLObject)ConsesLow.list((SubLObject)module0349.$ic80$, module0450.f31011()));
                final SubLObject var181_182 = var164.secondMultipleValue();
                var164.resetMultipleValues();
                var166 = var179_180;
                var165 = var181_182;
            }
        }
        return Values.values(var166, var165);
    }
    
    public static SubLObject f23493(final SubLObject var133, final SubLObject var2, SubLObject var163) {
        if (var163 == module0349.UNPROVIDED) {
            var163 = (SubLObject)module0349.$ic70$;
        }
        final SubLThread var164 = SubLProcess.currentSubLThread();
        final SubLObject var165 = module0034.$g879$.getDynamicValue(var164);
        SubLObject var166 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var165) {
            return f23491(var133, var2, var163);
        }
        var166 = module0034.f1857(var165, (SubLObject)module0349.$ic79$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var166) {
            var166 = module0034.f1807(module0034.f1842(var165), (SubLObject)module0349.$ic79$, (SubLObject)module0349.THREE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var165, (SubLObject)module0349.$ic79$, var166);
        }
        final SubLObject var167 = module0034.f1781(var133, var2, var163);
        final SubLObject var168 = module0034.f1814(var166, var167, (SubLObject)module0349.UNPROVIDED);
        if (var168 != module0349.$ic2$) {
            SubLObject var169 = var168;
            SubLObject var170 = (SubLObject)module0349.NIL;
            var170 = var169.first();
            while (module0349.NIL != var169) {
                SubLObject var171 = var170.first();
                final SubLObject var172 = conses_high.second(var170);
                if (var133.equal(var171.first())) {
                    var171 = var171.rest();
                    if (var2.equal(var171.first())) {
                        var171 = var171.rest();
                        if (module0349.NIL != var171 && module0349.NIL == var171.rest() && var163.equal(var171.first())) {
                            return module0034.f1959(var172);
                        }
                    }
                }
                var169 = var169.rest();
                var170 = var169.first();
            }
        }
        final SubLObject var173 = Values.arg2(var164.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23491(var133, var2, var163)));
        module0034.f1836(var166, var167, var168, var173, (SubLObject)ConsesLow.list(var133, var2, var163));
        return module0034.f1959(var173);
    }
    
    public static SubLObject f23494(final SubLObject var183, final SubLObject var2, SubLObject var184) {
        if (var184 == module0349.UNPROVIDED) {
            var184 = (SubLObject)module0349.NIL;
        }
        final SubLThread var185 = SubLProcess.currentSubLThread();
        var185.resetMultipleValues();
        final SubLObject var186 = f23495(var183, var2, var184, (SubLObject)module0349.UNPROVIDED);
        final SubLObject var187 = var185.secondMultipleValue();
        var185.resetMultipleValues();
        return Values.values(var186, module0360.f23867(var187));
    }
    
    public static SubLObject f23496(final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        if (module0349.NIL != module0202.f12604(var185)) {
            return (SubLObject)module0349.T;
        }
        return module0004.f104(var185, module0349.$g2988$.getDynamicValue(var186), Symbols.symbol_function((SubLObject)module0349.EQUAL), (SubLObject)module0349.UNPROVIDED);
    }
    
    public static SubLObject f23497(final SubLObject var183, final SubLObject var2, SubLObject var184, SubLObject var186) {
        if (var184 == module0349.UNPROVIDED) {
            var184 = (SubLObject)module0349.NIL;
        }
        if (var186 == module0349.UNPROVIDED) {
            var186 = module0349.$g2987$.getDynamicValue();
        }
        final SubLThread var187 = SubLProcess.currentSubLThread();
        SubLObject var188 = (SubLObject)module0349.NIL;
        SubLObject var189 = (SubLObject)module0349.NIL;
        if (module0349.NIL == f23496(var183)) {
            final SubLObject var190 = module0349.$g2988$.currentBinding(var187);
            try {
                module0349.$g2988$.bind((SubLObject)ConsesLow.cons(var183, module0349.$g2988$.getDynamicValue(var187)), var187);
                SubLObject var191 = f23492(var183, var2);
                var191 = conses_high.putf(var191, (SubLObject)module0349.$ic84$, var184);
                var191 = conses_high.putf(var191, (SubLObject)module0349.$ic80$, module0450.f31011());
                var187.resetMultipleValues();
                final SubLObject var187_188 = module0434.f30594(var183, var2, var191);
                final SubLObject var189_190 = var187.secondMultipleValue();
                var187.resetMultipleValues();
                var188 = var187_188;
                var189 = var189_190;
            }
            finally {
                module0349.$g2988$.rebind(var190, var187);
            }
        }
        return Values.values(var188, var189);
    }
    
    public static SubLObject f23495(final SubLObject var183, final SubLObject var2, SubLObject var184, SubLObject var186) {
        if (var184 == module0349.UNPROVIDED) {
            var184 = (SubLObject)module0349.NIL;
        }
        if (var186 == module0349.UNPROVIDED) {
            var186 = module0349.$g2987$.getDynamicValue();
        }
        final SubLThread var187 = SubLProcess.currentSubLThread();
        final SubLObject var188 = module0034.$g879$.getDynamicValue(var187);
        SubLObject var189 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var188) {
            return f23497(var183, var2, var184, var186);
        }
        var189 = module0034.f1857(var188, (SubLObject)module0349.$ic83$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var189) {
            var189 = module0034.f1807(module0034.f1842(var188), (SubLObject)module0349.$ic83$, (SubLObject)module0349.FOUR_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var188, (SubLObject)module0349.$ic83$, var189);
        }
        final SubLObject var190 = module0034.f1780(var183, var2, var184, var186);
        final SubLObject var191 = module0034.f1814(var189, var190, (SubLObject)module0349.UNPROVIDED);
        if (var191 != module0349.$ic2$) {
            SubLObject var192 = var191;
            SubLObject var193 = (SubLObject)module0349.NIL;
            var193 = var192.first();
            while (module0349.NIL != var192) {
                SubLObject var194 = var193.first();
                final SubLObject var195 = conses_high.second(var193);
                if (var183.equal(var194.first())) {
                    var194 = var194.rest();
                    if (var2.equal(var194.first())) {
                        var194 = var194.rest();
                        if (var184.equal(var194.first())) {
                            var194 = var194.rest();
                            if (module0349.NIL != var194 && module0349.NIL == var194.rest() && var186.equal(var194.first())) {
                                return module0034.f1959(var195);
                            }
                        }
                    }
                }
                var192 = var192.rest();
                var193 = var192.first();
            }
        }
        final SubLObject var196 = Values.arg2(var187.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23497(var183, var2, var184, var186)));
        module0034.f1836(var189, var190, var191, var196, (SubLObject)ConsesLow.list(var183, var2, var184, var186));
        return module0034.f1959(var196);
    }
    
    public static SubLObject f23498(final SubLObject var191) {
        final SubLObject var192 = f23499(var191);
        SubLObject var193 = (SubLObject)module0349.NIL;
        SubLObject var194 = var192;
        SubLObject var195 = (SubLObject)module0349.NIL;
        var195 = var194.first();
        while (module0349.NIL != var194) {
            SubLObject var197;
            final SubLObject var196 = var197 = var195;
            SubLObject var198 = (SubLObject)module0349.NIL;
            SubLObject var199 = (SubLObject)module0349.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var197, var196, (SubLObject)module0349.$ic86$);
            var198 = var197.first();
            var197 = var197.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var197, var196, (SubLObject)module0349.$ic86$);
            var199 = var197.first();
            var197 = var197.rest();
            if (module0349.NIL == var197) {
                SubLObject var43_198 = var198;
                SubLObject var200 = (SubLObject)module0349.NIL;
                var200 = var43_198.first();
                while (module0349.NIL != var43_198) {
                    final SubLObject var201 = var200;
                    if (module0349.NIL == conses_high.member(var201, var193, Symbols.symbol_function((SubLObject)module0349.EQUAL), Symbols.symbol_function((SubLObject)module0349.IDENTITY))) {
                        var193 = (SubLObject)ConsesLow.cons(var201, var193);
                    }
                    var43_198 = var43_198.rest();
                    var200 = var43_198.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var196, (SubLObject)module0349.$ic86$);
            }
            var194 = var194.rest();
            var195 = var194.first();
        }
        return Sequences.nreverse(var193);
    }
    
    public static SubLObject f23500(final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        final SubLObject var193 = module0034.$g879$.getDynamicValue(var192);
        SubLObject var194 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var193) {
            return f23498(var191);
        }
        var194 = module0034.f1857(var193, (SubLObject)module0349.$ic85$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var194) {
            var194 = module0034.f1807(module0034.f1842(var193), (SubLObject)module0349.$ic85$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var193, (SubLObject)module0349.$ic85$, var194);
        }
        SubLObject var195 = module0034.f1814(var194, var191, (SubLObject)module0349.$ic2$);
        if (var195 == module0349.$ic2$) {
            var195 = Values.arg2(var192.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23498(var191)));
            module0034.f1816(var194, var191, var195, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var195);
    }
    
    public static SubLObject f23501(final SubLObject var191) {
        return f23499(var191);
    }
    
    public static SubLObject f23502(final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        final SubLObject var193 = module0034.$g879$.getDynamicValue(var192);
        SubLObject var194 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var193) {
            return f23501(var191);
        }
        var194 = module0034.f1857(var193, (SubLObject)module0349.$ic87$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var194) {
            var194 = module0034.f1807(module0034.f1842(var193), (SubLObject)module0349.$ic87$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQUAL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var193, (SubLObject)module0349.$ic87$, var194);
        }
        SubLObject var195 = module0034.f1814(var194, var191, (SubLObject)module0349.$ic2$);
        if (var195 == module0349.$ic2$) {
            var195 = Values.arg2(var192.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23501(var191)));
            module0034.f1816(var194, var191, var195, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var195);
    }
    
    public static SubLObject f23499(final SubLObject var191) {
        SubLObject var192 = (SubLObject)module0349.NIL;
        SubLObject var194;
        final SubLObject var193 = var194 = module0347.f23339(var191, module0349.$ic88$, (SubLObject)module0349.$ic70$, (SubLObject)module0349.UNPROVIDED);
        SubLObject var195 = (SubLObject)module0349.NIL;
        var195 = var194.first();
        while (module0349.NIL != var194) {
            SubLObject var43_203;
            final SubLObject var196 = var43_203 = module0528.f32971(var195);
            SubLObject var197 = (SubLObject)module0349.NIL;
            var197 = var43_203.first();
            while (module0349.NIL != var43_203) {
                var192 = (SubLObject)ConsesLow.cons(var197, var192);
                var43_203 = var43_203.rest();
                var197 = var43_203.first();
            }
            var194 = var194.rest();
            var195 = var194.first();
        }
        return Sequences.nreverse(var192);
    }
    
    public static SubLObject f23492(final SubLObject var185, final SubLObject var2) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        if (module0349.NIL != module0349.$g2987$.getDynamicValue(var186)) {
            return module0349.$g2987$.getDynamicValue(var186);
        }
        return f23503(var185, var2);
    }
    
    public static SubLObject f23503(final SubLObject var185, final SubLObject var2) {
        if (module0349.NIL != module0350.f23560(var185, var2)) {
            if (module0349.NIL != module0369.f25275(module0339.f22757())) {
                return (SubLObject)ConsesLow.list((SubLObject)module0349.$ic89$, module0411.f28572(module0339.f22757(), (SubLObject)module0349.$ic89$, (SubLObject)module0349.UNPROVIDED), (SubLObject)module0349.$ic90$, module0411.f28572(module0339.f22757(), (SubLObject)module0349.$ic90$, (SubLObject)module0349.UNPROVIDED));
            }
            return (SubLObject)ConsesLow.list((SubLObject)module0349.$ic89$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.$ic90$, (SubLObject)module0349.$ic91$);
        }
        else {
            if (module0349.NIL != module0202.f12595(var185) || module0349.NIL != module0202.f12594(var185)) {
                final SubLObject var186 = module0205.f13207(var185, (SubLObject)module0349.UNPROVIDED);
                SubLObject var187 = (SubLObject)module0349.NIL;
                SubLObject var188 = var186;
                SubLObject var189 = (SubLObject)module0349.NIL;
                var189 = var188.first();
                while (module0349.NIL != var188) {
                    final SubLObject var190 = f23503(var189, var2);
                    if (module0349.NIL != var190) {
                        var187 = module0412.f28671(var187, var190);
                    }
                    var188 = var188.rest();
                    var189 = var188.first();
                }
                return var187;
            }
            if (module0349.NIL != module0202.f12606(var185)) {
                return f23503(module0205.f13204(var185, (SubLObject)module0349.UNPROVIDED), var2);
            }
            if (module0349.NIL != module0202.f12589(module0205.f13204(var185, (SubLObject)module0349.UNPROVIDED), module0349.$ic92$)) {
                return f23503(module0205.f13204(module0205.f13204(var185, (SubLObject)module0349.UNPROVIDED), (SubLObject)module0349.UNPROVIDED), var2);
            }
            return (SubLObject)module0349.NIL;
        }
    }
    
    public static SubLObject f23504(final SubLObject var208) {
        return module0211.f13710(var208);
    }
    
    public static SubLObject f23505(final SubLObject var208) {
        final SubLThread var209 = SubLProcess.currentSubLThread();
        final SubLObject var210 = module0034.$g879$.getDynamicValue(var209);
        SubLObject var211 = (SubLObject)module0349.NIL;
        if (module0349.NIL == var210) {
            return f23504(var208);
        }
        var211 = module0034.f1857(var210, (SubLObject)module0349.$ic93$, (SubLObject)module0349.UNPROVIDED);
        if (module0349.NIL == var211) {
            var211 = module0034.f1807(module0034.f1842(var210), (SubLObject)module0349.$ic93$, (SubLObject)module0349.ONE_INTEGER, (SubLObject)module0349.NIL, (SubLObject)module0349.EQL, (SubLObject)module0349.UNPROVIDED);
            module0034.f1860(var210, (SubLObject)module0349.$ic93$, var211);
        }
        SubLObject var212 = module0034.f1814(var211, var208, (SubLObject)module0349.$ic2$);
        if (var212 == module0349.$ic2$) {
            var212 = Values.arg2(var209.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f23504(var208)));
            module0034.f1816(var211, var208, var212, (SubLObject)module0349.UNPROVIDED);
        }
        return module0034.f1959(var212);
    }
    
    public static SubLObject f23506() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23385", "S#26090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23386", "S#26091", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23387", "S#26073", 1, 0, false);
        new $f23387$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23388", "S#26092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23389", "S#26074", 1, 0, false);
        new $f23389$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23390", "S#26075", 1, 0, false);
        new $f23390$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23391", "S#26093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23392", "S#26076", 1, 0, false);
        new $f23392$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23393", "S#26094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23394", "S#26095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23395", "S#26077", 1, 0, false);
        new $f23395$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23396", "S#26078", 1, 0, false);
        new $f23396$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23397", "S#26079", 1, 0, false);
        new $f23397$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23398", "S#24936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23399", "S#24884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23402", "S#26080", 0, 0, false);
        new $f23402$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23403", "S#26096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23404", "S#26097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23400", "S#26098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23405", "S#26099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23401", "S#26100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23406", "S#26081", 1, 0, false);
        new $f23406$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23407", "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?", 1, 0, false);
        new $f23407$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23408", "S#26101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23409", "S#26102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23410", "S#26103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23411", "S#26104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23413", "S#26105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23412", "S#26106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23414", "S#26107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23415", "S#26108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23416", "S#26109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23418", "S#26110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23417", "S#26111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23419", "S#26112", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23420", "S#26113", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23421", "S#26114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23423", "S#26115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23422", "S#26116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23424", "S#26117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23425", "S#26118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23426", "S#26119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23428", "S#26120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23427", "S#26121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23429", "S#26122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23430", "S#26123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23431", "S#26124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23433", "S#26125", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23434", "S#26126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23435", "S#26127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23432", "S#26128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23437", "S#23781", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23439", "S#26129", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23440", "S#26130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23441", "S#26131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23438", "S#26132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23442", "S#26133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23443", "S#26134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23436", "S#26135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23444", "S#26136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23445", "S#26137", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0349", "f23446", "S#26138");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0349", "f23447", "S#26139");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23448", "S#26140", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23449", "S#26141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23450", "S#26142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23451", "S#26143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23452", "S#26144", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23453", "S#26145", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23454", "S#26146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23455", "S#26147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23456", "S#26148", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23457", "S#26149", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23458", "S#26150", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23459", "S#26151", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23460", "S#26152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23461", "S#26153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23462", "S#26154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23463", "S#26155", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23469", "S#26156", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23465", "S#26157", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23470", "S#26158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23471", "S#25823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23472", "S#26159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23473", "S#26160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23474", "S#26161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23475", "S#26162", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23476", "S#26163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23477", "S#26164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23478", "S#26165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23466", "S#26166", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23479", "S#26167", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23467", "S#26168", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23480", "S#26169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23468", "S#26170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23464", "S#26171", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23481", "S#26172", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23482", "S#26173", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23483", "S#26174", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23484", "S#26175", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23485", "S#26176", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23486", "S#26177", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23487", "S#26178", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23488", "S#26179", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23489", "S#26180", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23490", "S#26181", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23491", "S#26182", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23493", "S#26183", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23494", "S#26184", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23496", "S#26185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23497", "S#26186", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23495", "S#26187", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23498", "S#26188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23500", "S#26189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23501", "S#26190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23502", "S#26191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23499", "S#26192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23492", "S#17994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23503", "S#26193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23504", "S#26194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0349", "f23505", "S#26195", 1, 0, false);
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23507() {
        module0349.$g2984$ = SubLFiles.deflexical("S#26196", (SubLObject)module0349.NIL);
        module0349.$g2985$ = SubLFiles.deflexical("S#26197", (SubLObject)module0349.NIL);
        module0349.$g2986$ = SubLFiles.deflexical("S#26198", (SubLObject)module0349.NIL);
        module0349.$g2987$ = SubLFiles.defparameter("S#26199", (SubLObject)module0349.NIL);
        module0349.$g2988$ = SubLFiles.defparameter("S#26200", (SubLObject)module0349.NIL);
        return (SubLObject)module0349.NIL;
    }
    
    public static SubLObject f23508() {
        module0034.f1895((SubLObject)module0349.$ic1$);
        module0034.f1909((SubLObject)module0349.$ic3$);
        module0034.f1895((SubLObject)module0349.$ic7$);
        module0034.f1895((SubLObject)module0349.$ic8$);
        module0034.f1895((SubLObject)module0349.$ic9$);
        module0034.f1895((SubLObject)module0349.$ic10$);
        module0034.f1895((SubLObject)module0349.$ic11$);
        module0034.f1895((SubLObject)module0349.$ic12$);
        module0034.f1895((SubLObject)module0349.$ic28$);
        module0034.f1895((SubLObject)module0349.$ic29$);
        module0034.f1895((SubLObject)module0349.$ic31$);
        module0034.f1895((SubLObject)module0349.$ic32$);
        module0034.f1909((SubLObject)module0349.$ic34$);
        module0034.f1909((SubLObject)module0349.$ic38$);
        module0034.f1895((SubLObject)module0349.$ic41$);
        module0034.f1895((SubLObject)module0349.$ic42$);
        module0034.f1895((SubLObject)module0349.$ic49$);
        module0034.f1895((SubLObject)module0349.$ic52$);
        module0034.f1895((SubLObject)module0349.$ic53$);
        module0034.f1895((SubLObject)module0349.$ic54$);
        module0034.f1895((SubLObject)module0349.$ic55$);
        module0034.f1895((SubLObject)module0349.$ic56$);
        module0034.f1895((SubLObject)module0349.$ic61$);
        module0034.f1895((SubLObject)module0349.$ic62$);
        module0034.f1895((SubLObject)module0349.$ic63$);
        module0034.f1895((SubLObject)module0349.$ic64$);
        module0034.f1895((SubLObject)module0349.$ic65$);
        module0034.f1895((SubLObject)module0349.$ic66$);
        module0034.f1895((SubLObject)module0349.$ic67$);
        module0034.f1895((SubLObject)module0349.$ic68$);
        module0034.f1895((SubLObject)module0349.$ic79$);
        module0034.f1895((SubLObject)module0349.$ic83$);
        module0034.f1895((SubLObject)module0349.$ic85$);
        module0034.f1895((SubLObject)module0349.$ic87$);
        module0034.f1895((SubLObject)module0349.$ic93$);
        return (SubLObject)module0349.NIL;
    }
    
    public void declareFunctions() {
        f23506();
    }
    
    public void initializeVariables() {
        f23507();
    }
    
    public void runTopLevelForms() {
        f23508();
    }
    
    static {
        me = (SubLFile)new module0349();
        module0349.$g2984$ = null;
        module0349.$g2985$ = null;
        module0349.$g2986$ = null;
        module0349.$g2987$ = null;
        module0349.$g2988$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#26076", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic3$ = SubLObjectFactory.makeSymbol("S#26098", "CYC");
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm"));
        $ic5$ = SubLObjectFactory.makeSymbol("S#26196", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#26080", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#26100", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#26103", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#26106", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#26108", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#26111", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#26113", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic14$ = SubLObjectFactory.makeKeyword("STACK");
        $ic15$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic16$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic18$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic19$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic20$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic21$ = SubLObjectFactory.makeString("continue anyway");
        $ic22$ = SubLObjectFactory.makeKeyword("WARN");
        $ic23$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic25$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic26$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic27$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic28$ = SubLObjectFactory.makeSymbol("S#26116", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#26118", "CYC");
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic31$ = SubLObjectFactory.makeSymbol("S#26121", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#26123", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic34$ = SubLObjectFactory.makeSymbol("S#26128", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#26197", "CYC");
        $ic36$ = SubLObjectFactory.makeInteger(256);
        $ic37$ = SubLObjectFactory.makeSymbol("S#26125", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#26132", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#26198", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#26129", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#26134", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#26137", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12704", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic45$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic46$ = SubLObjectFactory.makeKeyword("DONE");
        $ic47$ = SubLObjectFactory.makeSymbol("S#26139", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#13028", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#26141", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("TRUTH");
        $ic51$ = SubLObjectFactory.makeSymbol("S#10613", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#26143", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#26145", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#26147", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#26149", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#26151", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic58$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")));
        $ic59$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic60$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic61$ = SubLObjectFactory.makeSymbol("S#26157", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#25823", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#26160", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#26162", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#26164", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#26166", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#26168", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#26170", "CYC");
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("highlyRelevantMt"));
        $ic70$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("highlyRelevantAssertion"));
        $ic72$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("highlyRelevantPredAssertion"));
        $ic73$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("highlyRelevantTerm"));
        $ic74$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("irrelevantMt"));
        $ic75$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("irrelevantAssertion"));
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("irrelevantPredAssertion"));
        $ic77$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("irrelevantTerm"));
        $ic78$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionUtility"));
        $ic79$ = SubLObjectFactory.makeSymbol("S#26183", "CYC");
        $ic80$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic81$ = SubLObjectFactory.makeSymbol("S#26012", "CYC");
        $ic82$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic83$ = SubLObjectFactory.makeSymbol("S#26187", "CYC");
        $ic84$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic85$ = SubLObjectFactory.makeSymbol("S#26189", "CYC");
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#26201", "CYC"));
        $ic87$ = SubLObjectFactory.makeSymbol("S#26191", "CYC");
        $ic88$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic89$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic90$ = SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY");
        $ic91$ = SubLObjectFactory.makeInteger(-100);
        $ic92$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic93$ = SubLObjectFactory.makeSymbol("S#26195", "CYC");
    }
    
    public static final class $f23387$UnaryFunction extends UnaryFunction
    {
        public $f23387$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26073"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0349.f23387(var3);
        }
    }
    
    public static final class $f23389$UnaryFunction extends UnaryFunction
    {
        public $f23389$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26074"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0349.f23389(var3);
        }
    }
    
    public static final class $f23390$UnaryFunction extends UnaryFunction
    {
        public $f23390$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26075"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0349.f23390(var3);
        }
    }
    
    public static final class $f23392$UnaryFunction extends UnaryFunction
    {
        public $f23392$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26076"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0349.f23392(var3);
        }
    }
    
    public static final class $f23395$UnaryFunction extends UnaryFunction
    {
        public $f23395$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26077"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0349.f23395(var3);
        }
    }
    
    public static final class $f23396$UnaryFunction extends UnaryFunction
    {
        public $f23396$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26078"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0349.f23396(var3);
        }
    }
    
    public static final class $f23397$UnaryFunction extends UnaryFunction
    {
        public $f23397$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26079"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0349.f23397(var3);
        }
    }
    
    public static final class $f23402$ZeroArityFunction extends ZeroArityFunction
    {
        public $f23402$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26080"));
        }
        
        public SubLObject processItem() {
            return module0349.f23402();
        }
    }
    
    public static final class $f23406$UnaryFunction extends UnaryFunction
    {
        public $f23406$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26081"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0349.f23406(var3);
        }
    }
    
    public static final class $f23407$UnaryFunction extends UnaryFunction
    {
        public $f23407$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0349.f23407(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0349.class
	Total time: 1491 ms
	
	Decompiled with Procyon 0.5.32.
*/