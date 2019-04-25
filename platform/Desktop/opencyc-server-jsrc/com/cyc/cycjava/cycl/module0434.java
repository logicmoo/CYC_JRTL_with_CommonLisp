package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0434 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0434";
    public static final String myFingerPrint = "cde06ea2d272742d290901f0923211ba871f9c354e0847697ca690e56a94e8df";
    public static SubLSymbol $g3528$;
    private static SubLSymbol $g3529$;
    private static SubLSymbol $g3530$;
    private static SubLSymbol $g3531$;
    private static SubLSymbol $g3532$;
    private static SubLSymbol $g3533$;
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
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
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
    private static final SubLInteger $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLInteger $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    
    public static SubLObject f30570(SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var1 == module0434.UNPROVIDED) {
            var1 = (SubLObject)module0434.NIL;
        }
        if (var2 == module0434.UNPROVIDED) {
            var2 = (SubLObject)module0434.NIL;
        }
        if (var3 == module0434.UNPROVIDED) {
            var3 = (SubLObject)module0434.NIL;
        }
        if (var4 == module0434.UNPROVIDED) {
            var4 = (SubLObject)module0434.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0434.NIL;
        if (module0434.NIL != var1) {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic0$, (SubLObject)((module0434.T == var1) ? module0434.NIL : var1));
        }
        if (module0434.NIL != var2) {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic1$, var2);
        }
        if (module0434.NIL != var3) {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic2$, var3);
        }
        if (module0434.NIL != var4) {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic3$, var4);
        }
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic4$, module0035.sublisp_boolean(module0018.$g701$.getDynamicValue(var5)));
        if (module0434.NIL != module0111.$g1409$.getDynamicValue(var5)) {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic6$);
        }
        else {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic7$);
        }
        if (module0434.NIL != module0018.$g633$.getDynamicValue(var5)) {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic8$, module0018.$g634$.getDynamicValue(var5));
        }
        else {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic8$, (SubLObject)module0434.$ic9$);
        }
        final SubLObject var7 = module0018.$g656$.getDynamicValue(var5);
        if (var7.eql((SubLObject)module0434.$ic10$)) {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic11$, (SubLObject)module0434.$ic12$);
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic13$, (SubLObject)module0434.$ic12$);
        }
        else if (var7.eql((SubLObject)module0434.$ic14$)) {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic11$, (SubLObject)module0434.$ic15$);
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic13$, (SubLObject)module0434.$ic16$);
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic7$);
        }
        else if (var7.eql((SubLObject)module0434.$ic17$)) {
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0434.$ic18$, module0352.$g2993$.getDynamicValue(var5)));
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic13$, (SubLObject)module0434.$ic12$);
        }
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic19$, module0035.sublisp_boolean(module0018.$g644$.getDynamicValue(var5)));
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic20$, module0035.sublisp_boolean(module0018.$g648$.getDynamicValue(var5)));
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic21$, module0035.sublisp_boolean(module0018.$g645$.getDynamicValue(var5)));
        final SubLObject var8 = f30571(module0018.$g650$.getDynamicValue(var5));
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic22$, var8);
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic23$, module0352.$g2992$.getDynamicValue(var5));
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic24$, module0035.sublisp_boolean(module0018.$g646$.getDynamicValue(var5)));
        return var6;
    }
    
    public static SubLObject f30571(final SubLObject var9) {
        return (module0434.NIL != var9) ? Numbers.multiply((SubLObject)module0434.TWO_INTEGER, (SubLObject)module0434.$ic25$, var9) : module0048.f3326();
    }
    
    public static SubLObject f30572() {
        final SubLObject var10 = f30570((SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
        return module0360.f23793(var10);
    }
    
    public static SubLObject f30573(SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var11) {
        if (var1 == module0434.UNPROVIDED) {
            var1 = (SubLObject)module0434.NIL;
        }
        if (var2 == module0434.UNPROVIDED) {
            var2 = (SubLObject)module0434.NIL;
        }
        if (var3 == module0434.UNPROVIDED) {
            var3 = (SubLObject)module0434.NIL;
        }
        if (var4 == module0434.UNPROVIDED) {
            var4 = (SubLObject)module0434.NIL;
        }
        if (var11 == module0434.UNPROVIDED) {
            var11 = (SubLObject)module0434.NIL;
        }
        final SubLObject var12 = f30570(var1, var2, var3, var4);
        return module0360.f23805(var12);
    }
    
    public static SubLObject f30574(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (module0434.NIL == var13) {
            var13 = module0132.$g1568$.getGlobalValue();
        }
        SubLObject var15 = conses_high.putf(conses_high.copy_list(var10), (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic7$);
        var15 = conses_high.putf(var15, (SubLObject)module0434.$ic11$, (SubLObject)module0434.$ic15$);
        var14.resetMultipleValues();
        final SubLObject var16 = module0409.f28506(var12, var13, var15);
        final SubLObject var17 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        return Values.values(var16, var17);
    }
    
    public static SubLObject f30575(final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var1 == module0434.UNPROVIDED) {
            var1 = (SubLObject)module0434.NIL;
        }
        if (var2 == module0434.UNPROVIDED) {
            var2 = (SubLObject)module0434.NIL;
        }
        if (var3 == module0434.UNPROVIDED) {
            var3 = (SubLObject)module0434.NIL;
        }
        if (var4 == module0434.UNPROVIDED) {
            var4 = (SubLObject)module0434.NIL;
        }
        final SubLObject var14 = f30570(var1, var2, var3, var4);
        return f30574(var12, var13, var14);
    }
    
    public static SubLObject f30576(final SubLObject var17, final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0434.NIL == var13) {
            var13 = module0132.$g1568$.getGlobalValue();
        }
        SubLObject var19 = conses_high.putf(conses_high.copy_list(var10), (SubLObject)module0434.$ic13$, (SubLObject)module0434.$ic12$);
        var19 = conses_high.putf(var19, (SubLObject)module0434.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0434.$ic18$, var17));
        var18.resetMultipleValues();
        final SubLObject var20 = module0409.f28506(var12, var13, var19);
        final SubLObject var21 = var18.secondMultipleValue();
        var18.resetMultipleValues();
        return Values.values(var20, var21);
    }
    
    public static SubLObject f30577(final SubLObject var17, final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var1 == module0434.UNPROVIDED) {
            var1 = (SubLObject)module0434.NIL;
        }
        if (var2 == module0434.UNPROVIDED) {
            var2 = (SubLObject)module0434.NIL;
        }
        if (var3 == module0434.UNPROVIDED) {
            var3 = (SubLObject)module0434.NIL;
        }
        if (var4 == module0434.UNPROVIDED) {
            var4 = (SubLObject)module0434.NIL;
        }
        final SubLObject var18 = f30570(var1, var2, var3, var4);
        return f30576(var17, var12, var13, var18);
    }
    
    public static SubLObject f30578(final SubLObject var19, final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0279.f18513(var12, (SubLObject)module0434.UNPROVIDED);
        final SubLObject var22 = module0205.f13250(var21, var19, var12, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
        var20.resetMultipleValues();
        SubLObject var23 = f30576(var21, var22, var13, var10);
        final SubLObject var24 = var20.secondMultipleValue();
        var20.resetMultipleValues();
        var23 = Sequences.delete_duplicates(var23, Symbols.symbol_function((SubLObject)module0434.EQUAL), (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
        return Values.values(var23, var24);
    }
    
    public static SubLObject f30579(final SubLObject var19, final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var1 == module0434.UNPROVIDED) {
            var1 = (SubLObject)module0434.NIL;
        }
        if (var2 == module0434.UNPROVIDED) {
            var2 = (SubLObject)module0434.NIL;
        }
        if (var3 == module0434.UNPROVIDED) {
            var3 = (SubLObject)module0434.NIL;
        }
        if (var4 == module0434.UNPROVIDED) {
            var4 = (SubLObject)module0434.NIL;
        }
        final SubLObject var20 = f30570(var1, var2, var3, var4);
        return f30578(var19, var12, var13, var20);
    }
    
    public static SubLObject f30580(final SubLObject var17, final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        SubLObject var19;
        final SubLObject var18 = var19 = f30576(var17, var12, var13, var10);
        SubLObject var20 = (SubLObject)module0434.NIL;
        var20 = var19.first();
        while (module0434.NIL != var19) {
            module0112.f7688(var20);
            var19 = var19.rest();
            var20 = var19.first();
        }
        return Sequences.length(var18);
    }
    
    public static SubLObject f30581(final SubLObject var17, final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var1 == module0434.UNPROVIDED) {
            var1 = (SubLObject)module0434.NIL;
        }
        if (var2 == module0434.UNPROVIDED) {
            var2 = (SubLObject)module0434.NIL;
        }
        if (var3 == module0434.UNPROVIDED) {
            var3 = (SubLObject)module0434.NIL;
        }
        if (var4 == module0434.UNPROVIDED) {
            var4 = (SubLObject)module0434.NIL;
        }
        final SubLObject var18 = f30570(var1, var2, var3, var4);
        return f30580(var17, var12, var13, var18);
    }
    
    public static SubLObject f30582(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = module0409.f28506(var12, var13, var10);
        final SubLObject var16 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        return Values.values(module0035.sublisp_boolean(var15), var16);
    }
    
    public static SubLObject f30583(SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var1 == module0434.UNPROVIDED) {
            var1 = (SubLObject)module0434.NIL;
        }
        if (var2 == module0434.UNPROVIDED) {
            var2 = (SubLObject)module0434.NIL;
        }
        if (var3 == module0434.UNPROVIDED) {
            var3 = (SubLObject)module0434.NIL;
        }
        if (var4 == module0434.UNPROVIDED) {
            var4 = (SubLObject)module0434.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = f30570(var1, var2, var3, var4);
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic4$, (SubLObject)module0434.NIL);
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic7$);
        var6 = conses_high.putf(var6, (SubLObject)module0434.$ic23$, (SubLObject)module0434.$ic54$);
        if (module0434.NIL != module0408.$g3301$.getDynamicValue(var5) && module0434.NIL == module0131.f8587()) {
            final SubLObject var7 = module0373.f26113();
            var6 = conses_high.putf(var6, (SubLObject)module0434.$ic55$, var7);
        }
        return var6;
    }
    
    public static SubLObject f30584() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return module0004.f105(module0434.$g3530$.getDynamicValue(var5));
    }
    
    public static SubLObject f30585(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = conses_high.copy_list(var10);
        final SubLObject var16 = f30586(var15);
        if (module0434.NIL != var16) {
            var15 = conses_high.putf(var15, (SubLObject)module0434.$ic55$, var16);
        }
        if (module0434.NIL == conses_high.getf(var15, (SubLObject)module0434.$ic57$, (SubLObject)module0434.UNPROVIDED)) {
            var15 = conses_high.putf(var15, (SubLObject)module0434.$ic57$, (SubLObject)module0434.ONE_INTEGER);
        }
        SubLObject var17 = module0339.f22757();
        if (module0434.NIL != oc_inference_datastructures_inference.f25275(var17)) {
            SubLObject var18 = module0018.$g632$.getDynamicValue(var14);
            SubLObject var19 = (SubLObject)module0434.NIL;
            var19 = var18.first();
            while (module0434.NIL != var18) {
                if (module0434.NIL == conses_high.getf(var15, var19, (SubLObject)module0434.UNPROVIDED)) {
                    final SubLObject var20 = oc_inference_datastructures_inference.f25591(var17, var19, (SubLObject)module0434.UNPROVIDED);
                    if (module0434.NIL != var20) {
                        var15 = conses_high.putf(var15, var19, var20);
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        if (module0434.NIL == module0035.f2345(var15, (SubLObject)module0434.$ic5$)) {
            var15 = conses_high.putf(var15, (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic7$);
        }
        var17 = module0339.f22757();
        if (module0434.NIL != oc_inference_datastructures_inference.f25429(var17) && module0434.NIL != module0434.$g3528$.getDynamicValue(var14) && module0434.NIL != oc_inference_datastructures_inference.f25515(var17)) {
            var15 = conses_high.putf(var15, (SubLObject)module0434.$ic58$, (SubLObject)module0434.T);
        }
        SubLObject var21 = (SubLObject)module0434.NIL;
        SubLObject var22 = (SubLObject)module0434.NIL;
        SubLObject var23 = (SubLObject)module0434.NIL;
        SubLObject var24 = (SubLObject)module0434.NIL;
        final SubLObject var25 = module0434.$g3530$.currentBinding(var14);
        try {
            module0434.$g3530$.bind((SubLObject)((module0434.NIL != module0434.$g3530$.getDynamicValue(var14)) ? module0048.f_1X(module0434.$g3530$.getDynamicValue(var14)) : module0434.ONE_INTEGER), var14);
            if (module0434.$g3530$.getDynamicValue(var14).numG(module0434.$g3529$.getGlobalValue())) {
                if (module0434.NIL != module0018.$g629$.getDynamicValue(var14)) {
                    Errors.error((SubLObject)module0434.$ic59$, module0434.$g3529$.getGlobalValue(), var12, var13);
                }
                else {
                    Errors.error((SubLObject)module0434.$ic60$);
                }
            }
            else {
                final SubLObject var26 = module0012.$g52$.getGlobalValue();
                final ArrayList var27 = Dynamic.extract_dynamic_values(var26);
                try {
                    Dynamic.bind_dynamic_vars(var26, (SubLObject)ConsesLow.make_list(Sequences.length(module0012.$g52$.getGlobalValue()), (SubLObject)module0434.NIL));
                    final SubLObject var28 = module0528.f32898();
                    assert module0434.NIL != module0055.f4006(var28) : var28;
                    final SubLObject var30_34 = module0131.$g1538$.currentBinding(var14);
                    final SubLObject var29 = module0271.$g2560$.currentBinding(var14);
                    final SubLObject var30 = module0146.$g2057$.currentBinding(var14);
                    try {
                        module0131.$g1538$.bind(var28, var14);
                        module0271.$g2560$.bind((SubLObject)module0434.NIL, var14);
                        module0146.$g2057$.bind((SubLObject)module0434.NIL, var14);
                        var14.resetMultipleValues();
                        final SubLObject var37_38 = module0409.f28506(var12, var13, var15);
                        final SubLObject var39_40 = var14.secondMultipleValue();
                        final SubLObject var41_42 = var14.thirdMultipleValue();
                        final SubLObject var43_44 = var14.fourthMultipleValue();
                        var14.resetMultipleValues();
                        var21 = var37_38;
                        var22 = var39_40;
                        var23 = var41_42;
                        var24 = var43_44;
                    }
                    finally {
                        module0146.$g2057$.rebind(var30, var14);
                        module0271.$g2560$.rebind(var29, var14);
                        module0131.$g1538$.rebind(var30_34, var14);
                    }
                }
                finally {
                    Dynamic.rebind_dynamic_vars(var26, var27);
                }
            }
        }
        finally {
            module0434.$g3530$.rebind(var25, var14);
        }
        return Values.values(var21, var22, var23, var24);
    }
    
    public static SubLObject f30587(final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        return module0035.f2169(var45, module0018.$g632$.getDynamicValue(var46));
    }
    
    public static SubLObject f30588(final SubLObject var10) {
        return module0035.f2329(var10, (SubLObject)module0434.$ic62$);
    }
    
    public static SubLObject f30586(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (module0434.NIL != module0408.$g3301$.getDynamicValue(var11) && module0434.NIL == module0131.f8587()) {
            final SubLObject var12 = module0373.f26113();
            if (module0434.NIL != var12 && module0434.NIL != module0412.f28690(var12, var10)) {
                return var12;
            }
        }
        return (SubLObject)module0434.NIL;
    }
    
    public static SubLObject f30589(final SubLObject var46, final SubLObject var12, final SubLObject var13, SubLObject var10) {
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0289.f19491(var46);
        final SubLObject var49 = module0289.f19490(var12);
        SubLObject var50 = conses_high.copy_list(var10);
        var50 = conses_high.putf(var50, (SubLObject)module0434.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0434.$ic18$, var48));
        var50 = conses_high.putf(var50, (SubLObject)module0434.$ic13$, (SubLObject)module0434.$ic12$);
        var50 = conses_high.putf(var50, (SubLObject)module0434.$ic63$, (SubLObject)module0434.NIL);
        var50 = conses_high.putf(var50, (SubLObject)module0434.$ic23$, (SubLObject)module0434.$ic54$);
        var50 = conses_high.putf(var50, (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic7$);
        var47.resetMultipleValues();
        SubLObject var51 = f30585(var49, var13, var50);
        final SubLObject var52 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        var51 = Sequences.delete_duplicates(var51, Symbols.symbol_function((SubLObject)module0434.EQUAL), (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
        return Values.values(var51, var52);
    }
    
    public static SubLObject f30590(final SubLObject var46, final SubLObject var12, final SubLObject var13, SubLObject var10) {
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0289.f19491(var46);
        final SubLObject var49 = module0289.f19490(var12);
        SubLObject var50 = conses_high.copy_list(var10);
        var50 = conses_high.putf(var50, (SubLObject)module0434.$ic11$, (SubLObject)ConsesLow.list((SubLObject)module0434.$ic18$, ConsesLow.append((SubLObject)ConsesLow.list(var48), (SubLObject)module0434.$ic64$)));
        var50 = conses_high.putf(var50, (SubLObject)module0434.$ic13$, (SubLObject)module0434.$ic12$);
        var50 = conses_high.putf(var50, (SubLObject)module0434.$ic23$, (SubLObject)module0434.$ic54$);
        var50 = conses_high.putf(var50, (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic7$);
        var47.resetMultipleValues();
        SubLObject var51 = f30585(var49, var13, var50);
        final SubLObject var52 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        var51 = Sequences.delete_duplicates(var51, Symbols.symbol_function((SubLObject)module0434.EQUAL), (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
        return Values.values(var51, var52);
    }
    
    public static SubLObject f30591(final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var1 == module0434.UNPROVIDED) {
            var1 = (SubLObject)module0434.NIL;
        }
        if (var2 == module0434.UNPROVIDED) {
            var2 = (SubLObject)module0434.NIL;
        }
        if (var3 == module0434.UNPROVIDED) {
            var3 = (SubLObject)module0434.NIL;
        }
        if (var4 == module0434.UNPROVIDED) {
            var4 = (SubLObject)module0434.NIL;
        }
        if (module0434.NIL == var13) {
            var13 = module0132.$g1568$.getGlobalValue();
        }
        final SubLObject var14 = f30583(var1, var2, var3, var4);
        return f30592(var12, var13, var14);
    }
    
    public static SubLObject f30592(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0193.f12102(var12);
        final SubLObject var16 = module0289.f19490(var12);
        SubLObject var17 = conses_high.copy_list(var10);
        var17 = conses_high.putf(var17, (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic7$);
        var17 = conses_high.putf(var17, (SubLObject)module0434.$ic13$, (SubLObject)module0434.$ic16$);
        var17 = conses_high.putf(var17, (SubLObject)module0434.$ic11$, (SubLObject)module0434.$ic15$);
        var14.resetMultipleValues();
        final SubLObject var18 = f30585(var16, var13, var17);
        final SubLObject var19 = var14.secondMultipleValue();
        final SubLObject var20 = var14.thirdMultipleValue();
        final SubLObject var21 = var14.fourthMultipleValue();
        var14.resetMultipleValues();
        SubLObject var22 = var18;
        SubLObject var23 = (SubLObject)module0434.NIL;
        var23 = var22.first();
        while (module0434.NIL != var22) {
            final SubLObject var24 = var23.first();
            if (module0434.NIL != var24) {
                ConsesLow.set_nth((SubLObject)module0434.ZERO_INTEGER, var23, f30593(var24, var15));
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        return Values.values(var18, var19, var20, var21);
    }
    
    public static SubLObject f30594(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (module0434.NIL == var13) {
            var13 = module0132.$g1568$.getGlobalValue();
        }
        final SubLObject var15 = module0193.f12102(var12);
        final SubLObject var16 = module0289.f19490(var12);
        SubLObject var17 = conses_high.copy_list(var10);
        var17 = conses_high.putf(var17, (SubLObject)module0434.$ic5$, (SubLObject)module0434.$ic7$);
        var17 = conses_high.putf(var17, (SubLObject)module0434.$ic13$, (SubLObject)module0434.$ic12$);
        var17 = conses_high.putf(var17, (SubLObject)module0434.$ic63$, (SubLObject)module0434.NIL);
        var17 = conses_high.putf(var17, (SubLObject)module0434.$ic11$, (SubLObject)module0434.$ic12$);
        var14.resetMultipleValues();
        final SubLObject var18 = f30585(var16, var13, var17);
        final SubLObject var19 = var14.secondMultipleValue();
        final SubLObject var20 = var14.thirdMultipleValue();
        final SubLObject var21 = var14.fourthMultipleValue();
        var14.resetMultipleValues();
        SubLObject var22 = (SubLObject)module0434.NIL;
        SubLObject var23 = var18;
        SubLObject var24 = (SubLObject)module0434.NIL;
        var24 = var23.first();
        while (module0434.NIL != var23) {
            var22 = (SubLObject)ConsesLow.cons(f30593(var24, var15), var22);
            var23 = var23.rest();
            var24 = var23.first();
        }
        var22 = Sequences.nreverse(var22);
        return Values.values(var22, var19, var20, var21);
    }
    
    public static SubLObject f30595(final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var1 == module0434.UNPROVIDED) {
            var1 = (SubLObject)module0434.NIL;
        }
        if (var2 == module0434.UNPROVIDED) {
            var2 = (SubLObject)module0434.NIL;
        }
        if (var3 == module0434.UNPROVIDED) {
            var3 = (SubLObject)module0434.NIL;
        }
        if (var4 == module0434.UNPROVIDED) {
            var4 = (SubLObject)module0434.NIL;
        }
        final SubLObject var14 = f30583(var1, var2, var3, var4);
        return f30594(var12, var13, var14);
    }
    
    public static SubLObject f30593(final SubLObject var54, final SubLObject var50) {
        if (module0434.NIL == var50 || module0434.NIL != module0540.f33531(var54)) {
            return var54;
        }
        SubLObject var55 = (SubLObject)module0434.NIL;
        SubLObject var56 = var50;
        SubLObject var57 = (SubLObject)module0434.NIL;
        var57 = var56.first();
        while (module0434.NIL != var56) {
            final SubLObject var58 = module0193.f12082(var57);
            final SubLObject var59 = module0233.f15369(var58, var54);
            var55 = (SubLObject)ConsesLow.cons(module0233.f15340(var57, var59), var55);
            var56 = var56.rest();
            var57 = var56.first();
        }
        return Sequences.nreverse(var55);
    }
    
    public static SubLObject f30596(final SubLObject var58, final SubLObject var13) {
        if (module0434.NIL != f30597(var58, var13)) {
            return (SubLObject)module0434.$ic65$;
        }
        if (module0434.NIL != f30597(module0205.f13338(var58), var13)) {
            return (SubLObject)module0434.$ic66$;
        }
        return (SubLObject)module0434.$ic67$;
    }
    
    public static SubLObject f30597(final SubLObject var58, final SubLObject var13) {
        return module0035.sublisp_boolean(f30594(var58, var13, (SubLObject)module0434.$ic68$));
    }
    
    public static SubLObject f30598(final SubLObject var59, SubLObject var60, SubLObject var13) {
        if (var60 == module0434.UNPROVIDED) {
            var60 = (SubLObject)module0434.$ic6$;
        }
        if (var13 == module0434.UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        if (module0434.NIL != f30599(var59, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED)) {
            return f30600((SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
        }
        SubLObject var62;
        final SubLObject var61 = var62 = module0205.f13304(var59, (SubLObject)module0434.UNPROVIDED);
        SubLObject var63 = (SubLObject)module0434.NIL;
        SubLObject var64 = (SubLObject)module0434.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0434.$ic69$);
        var63 = var62.first();
        var62 = var62.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0434.$ic69$);
        var64 = var62.first();
        var62 = var62.rest();
        if (module0434.NIL == var62) {
            final SubLObject var65 = module0289.f19491(var63);
            final SubLObject var66 = module0289.f19490(var64);
            SubLObject var67 = module0349.f23492(var66, var13);
            SubLObject var68 = (SubLObject)module0434.NIL;
            var67 = conses_high.putf(var67, (SubLObject)module0434.$ic5$, var60);
            var68 = f30589((SubLObject)ConsesLow.list(var65), var66, var13, var67);
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0434.$ic70$), var68);
        }
        cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)module0434.$ic69$);
        return (SubLObject)module0434.NIL;
    }
    
    public static SubLObject f30599(SubLObject var59, SubLObject var66, SubLObject var13) {
        if (var59 == module0434.UNPROVIDED) {
            var59 = (SubLObject)module0434.NIL;
        }
        if (var66 == module0434.UNPROVIDED) {
            var66 = module0373.f26109();
        }
        if (var13 == module0434.UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (module0434.NIL == module0363.f24478(var66) || module0434.NIL == module0035.f2428(module0434.$ic71$, module0363.f24509(var66), (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED)) {
            return Values.values((SubLObject)module0434.NIL, (SubLObject)module0434.$ic72$);
        }
        if (module0434.NIL == module0434.$g3531$.getDynamicValue(var67)) {
            return Values.values((SubLObject)module0434.NIL, (SubLObject)module0434.$ic73$);
        }
        if (module0434.NIL == module0363.f24478(var66)) {
            return Values.values((SubLObject)module0434.NIL, (SubLObject)module0434.$ic74$);
        }
        var67.resetMultipleValues();
        final SubLObject var68 = f30601(var66);
        final SubLObject var69 = var67.secondMultipleValue();
        final SubLObject var70 = var67.thirdMultipleValue();
        var67.resetMultipleValues();
        if (module0434.NIL != var68 && module0434.NIL != var69 && module0434.NIL != var70) {
            if (module0434.NIL != module0202.f12678(var59)) {
                final SubLObject var71 = f30602(var66);
                final SubLObject var72 = f30603(var71, var13);
                final SubLObject var73 = module0205.f13204(var59, (SubLObject)module0434.UNPROVIDED);
                final SubLObject var74 = module0205.f13203(var59, (SubLObject)module0434.UNPROVIDED);
                final SubLObject var75 = f30603(var73, var13);
                if (!var72.equal(var75)) {
                    return Values.values((SubLObject)module0434.NIL, (SubLObject)module0434.$ic75$);
                }
                if (module0434.NIL != module0035.f2428(var73, var71, Symbols.symbol_function((SubLObject)module0434.EQUAL), (SubLObject)module0434.UNPROVIDED)) {
                    return Values.values((SubLObject)module0434.NIL, (SubLObject)module0434.$ic76$);
                }
                if (module0434.NIL != module0035.f2439((SubLObject)module0434.$ic77$, var71, (SubLObject)module0434.UNPROVIDED)) {
                    return Values.values((SubLObject)module0434.NIL, (SubLObject)module0434.$ic78$);
                }
                if (module0434.NIL != module0434.$g3533$.getDynamicValue(var67)) {
                    final SubLObject var76 = f30600(var66, var13);
                    var67.resetMultipleValues();
                    final SubLObject var77 = f30576(var74, var73, var13, var75);
                    final SubLObject var78 = var67.secondMultipleValue();
                    final SubLObject var79 = var67.thirdMultipleValue();
                    final SubLObject var80 = var67.fourthMultipleValue();
                    var67.resetMultipleValues();
                    if (module0434.NIL != conses_high.set_difference(var77, var76, (SubLObject)module0434.$ic79$, (SubLObject)module0434.UNPROVIDED)) {
                        module0006.f218((SubLObject)module0434.T, (SubLObject)module0434.$ic80$, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
                        module0006.f218((SubLObject)module0434.T, (SubLObject)module0434.$ic81$, module0035.f2241(f30602(var66)), module0035.f2241(var13), module0035.f2241(var72), (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
                        module0006.f218((SubLObject)module0434.T, (SubLObject)module0434.$ic82$, module0035.f2241(var73), module0035.f2241(var13), module0035.f2241(var75), (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
                        SubLObject var81 = conses_high.set_difference(var77, var76, (SubLObject)module0434.$ic79$, (SubLObject)module0434.UNPROVIDED);
                        SubLObject var82 = (SubLObject)module0434.NIL;
                        var82 = var81.first();
                        while (module0434.NIL != var81) {
                            module0006.f218((SubLObject)module0434.T, (SubLObject)module0434.$ic83$, var74, var82, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
                            var81 = var81.rest();
                            var82 = var81.first();
                        }
                    }
                }
            }
            return Values.values((SubLObject)module0434.T, (SubLObject)module0434.NIL);
        }
        return Values.values((SubLObject)module0434.NIL, (SubLObject)module0434.$ic84$);
    }
    
    public static SubLObject f30604(final SubLObject var78) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0434.NIL != module0173.f10955(var78) && module0434.NIL != module0269.f17706(var78) && module0434.NIL != module0222.f14635(module0434.$ic85$, var78, (SubLObject)module0434.ONE_INTEGER, (SubLObject)module0434.UNPROVIDED) && module0434.NIL != module0220.f14553(var78, module0434.$ic85$, (SubLObject)module0434.ONE_INTEGER, (SubLObject)module0434.ONE_INTEGER, (SubLObject)module0434.UNPROVIDED));
    }
    
    public static SubLObject f30600(SubLObject var66, SubLObject var13) {
        if (var66 == module0434.UNPROVIDED) {
            var66 = module0373.f26109();
        }
        if (var13 == module0434.UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        var67.resetMultipleValues();
        final SubLObject var68 = f30602(var66);
        final SubLObject var69 = var67.secondMultipleValue();
        final SubLObject var70 = var67.thirdMultipleValue();
        var67.resetMultipleValues();
        final SubLObject var71 = f30605(var68, var13);
        SubLObject var72 = (SubLObject)module0434.NIL;
        SubLObject var73 = var71;
        SubLObject var74 = (SubLObject)module0434.NIL;
        var74 = var73.first();
        while (module0434.NIL != var73) {
            if (module0434.NIL != module0035.f2206(var70, var74, Symbols.symbol_function((SubLObject)module0434.EQUAL))) {
                var72 = (SubLObject)ConsesLow.cons(module0233.f15369(var69, var74), var72);
            }
            var73 = var73.rest();
            var74 = var73.first();
        }
        return module0035.f2269(var72, Symbols.symbol_function((SubLObject)module0434.EQUAL), (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
    }
    
    public static SubLObject f30602(SubLObject var66) {
        if (var66 == module0434.UNPROVIDED) {
            var66 = module0373.f26109();
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        var67.resetMultipleValues();
        final SubLObject var68 = f30601(var66);
        final SubLObject var69 = var67.secondMultipleValue();
        final SubLObject var70 = var67.thirdMultipleValue();
        var67.resetMultipleValues();
        var67.resetMultipleValues();
        final SubLObject var71 = f30606(var68);
        final SubLObject var72 = var67.secondMultipleValue();
        var67.resetMultipleValues();
        if (module0434.NIL != var72) {
            final SubLObject var73 = module0381.f27142(var71);
            final SubLObject var74 = module0381.f27143(var71);
            final SubLObject var75 = module0205.f13203(var69, (SubLObject)module0434.UNPROVIDED);
            final SubLObject var76 = module0205.f13204(var69, (SubLObject)module0434.UNPROVIDED);
            final SubLObject var77 = module0363.f24551(var72);
            final SubLObject var78 = module0233.f15362(var73, var77);
            final SubLObject var79 = module0233.f15362(var74, var76);
            final SubLObject var80 = module0233.f15362(var74, var70);
            final SubLObject var81 = module0611.f37354(var75);
            final SubLObject var82 = module0202.f12773((SubLObject)ConsesLow.listS(var78, var79, ConsesLow.append((SubLObject)((module0434.NIL != var81) ? ConsesLow.list(var81) : module0434.NIL), (SubLObject)module0434.NIL)));
            return Values.values(var82, var75, var80);
        }
        return (SubLObject)module0434.NIL;
    }
    
    public static SubLObject f30601(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        final SubLObject var68 = module0205.f13183(module0363.f24551(var66), (SubLObject)module0434.$ic86$, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED, (SubLObject)module0434.UNPROVIDED);
        final SubLObject var69 = module0363.f24530(var66);
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        SubLObject var23_101;
        SubLObject var79;
        SubLObject var81;
        SubLObject var80;
        SubLObject var97_105;
        SubLObject var82;
        SubLObject var69_106;
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0434.NIL, var71 = module0032.f1742(var70, var69); module0434.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
            var72 = module0032.f1745(var70, var71);
            if (module0434.NIL != module0032.f1746(var71, var72)) {
                if (module0434.NIL != module0375.f26571(var72)) {
                    var73 = module0364.f24725(var72);
                    var74 = module0375.f26570(var72);
                    if (module0434.NIL != module0363.f24478(var73)) {
                        var75 = module0035.f2259((SubLObject)module0434.$ic86$, module0363.f24551(var73), (SubLObject)module0434.UNPROVIDED);
                        var76 = (SubLObject)module0434.NIL;
                        var77 = var68;
                        var78 = (SubLObject)module0434.NIL;
                        var78 = var77.first();
                        while (module0434.NIL != var77) {
                            var23_101 = var75;
                            var79 = (SubLObject)module0434.NIL;
                            var79 = var23_101.first();
                            while (module0434.NIL != var23_101) {
                                if (var78.equal(module0233.f15362(var74, var79))) {
                                    var76 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var73, var79, var74), var76);
                                }
                                var23_101 = var23_101.rest();
                                var79 = var23_101.first();
                            }
                            var77 = var77.rest();
                            var78 = var77.first();
                        }
                        if (module0434.NIL == module0434.$g3532$.getDynamicValue(var67) || module0434.NIL != module0035.f1997(var76)) {
                            var80 = (var81 = module0035.f2113(var76));
                            var97_105 = (SubLObject)module0434.NIL;
                            var82 = (SubLObject)module0434.NIL;
                            var69_106 = (SubLObject)module0434.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0434.$ic87$);
                            var97_105 = var81.first();
                            var81 = var81.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0434.$ic87$);
                            var82 = var81.first();
                            var81 = var81.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0434.$ic87$);
                            var69_106 = var81.first();
                            var81 = var81.rest();
                            if (module0434.NIL == var81) {
                                return Values.values(var97_105, var82, var69_106);
                            }
                            cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0434.$ic87$);
                        }
                    }
                }
                else if (module0434.NIL != module0381.f27029(var72)) {
                    var83 = module0364.f24725(var72);
                    if (module0434.NIL != module0363.f24478(var83)) {
                        var67.resetMultipleValues();
                        var84 = f30601(var83);
                        var85 = var67.secondMultipleValue();
                        var86 = var67.thirdMultipleValue();
                        var67.resetMultipleValues();
                        if (module0434.NIL != var84) {
                            return Values.values(var84, var85, var86);
                        }
                    }
                }
                else if (module0434.NIL != module0380.f26955(var72)) {
                    return f30601(module0364.f24725(var72));
                }
            }
        }
        return Values.values((SubLObject)module0434.NIL, (SubLObject)module0434.NIL, (SubLObject)module0434.NIL);
    }
    
    public static SubLObject f30606(final SubLObject var108) {
        SubLObject var109 = module0035.f2110((SubLObject)module0434.$ic88$, module0363.f24531(var108), (SubLObject)module0434.UNPROVIDED);
        SubLObject var110 = (SubLObject)module0434.NIL;
        var110 = var109.first();
        while (module0434.NIL != var109) {
            final SubLObject var111 = module0381.f27050(var110);
            if (var108.eql(module0381.f27051(var110))) {
                return Values.values(var110, var111);
            }
            var109 = var109.rest();
            var110 = var109.first();
        }
        return (SubLObject)module0434.NIL;
    }
    
    public static SubLObject f30607(final SubLObject var70, final SubLObject var13) {
        final SubLObject var71 = f30603(var70, var13);
        return f30585(var70, var13, var71);
    }
    
    public static SubLObject f30605(final SubLObject var70, final SubLObject var13) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = module0034.$g879$.getDynamicValue(var71);
        SubLObject var73 = (SubLObject)module0434.NIL;
        if (module0434.NIL == var72) {
            return f30607(var70, var13);
        }
        var73 = module0034.f1857(var72, (SubLObject)module0434.$ic89$, (SubLObject)module0434.UNPROVIDED);
        if (module0434.NIL == var73) {
            var73 = module0034.f1807(module0034.f1842(var72), (SubLObject)module0434.$ic89$, (SubLObject)module0434.TWO_INTEGER, (SubLObject)module0434.$ic25$, (SubLObject)module0434.EQUAL, (SubLObject)module0434.UNPROVIDED);
            module0034.f1860(var72, (SubLObject)module0434.$ic89$, var73);
        }
        final SubLObject var74 = module0034.f1782(var70, var13);
        final SubLObject var75 = module0034.f1814(var73, var74, (SubLObject)module0434.UNPROVIDED);
        if (var75 != module0434.$ic90$) {
            SubLObject var76 = var75;
            SubLObject var77 = (SubLObject)module0434.NIL;
            var77 = var76.first();
            while (module0434.NIL != var76) {
                SubLObject var78 = var77.first();
                final SubLObject var79 = conses_high.second(var77);
                if (var70.equal(var78.first())) {
                    var78 = var78.rest();
                    if (module0434.NIL != var78 && module0434.NIL == var78.rest() && var13.equal(var78.first())) {
                        return module0034.f1959(var79);
                    }
                }
                var76 = var76.rest();
                var77 = var76.first();
            }
        }
        final SubLObject var80 = Values.arg2(var71.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f30607(var70, var13)));
        module0034.f1836(var73, var74, var75, var80, (SubLObject)ConsesLow.list(var70, var13));
        return module0034.f1959(var80);
    }
    
    public static SubLObject f30603(final SubLObject var70, final SubLObject var13) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        SubLObject var72 = module0349.f23492(var70, var13);
        var72 = conses_high.putf(var72, (SubLObject)module0434.$ic63$, module0408.$g3301$.getDynamicValue(var71));
        return var72;
    }
    
    public static SubLObject f30608(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == module0434.UNPROVIDED) {
            var13 = (SubLObject)module0434.NIL;
        }
        if (var10 == module0434.UNPROVIDED) {
            var10 = (SubLObject)module0434.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = conses_high.copy_list(var10);
        SubLObject var16 = conses_high.getf(var10, (SubLObject)module0434.$ic0$, (SubLObject)module0434.UNPROVIDED);
        SubLObject var17 = (SubLObject)module0434.NIL;
        SubLObject var18 = (SubLObject)module0434.NIL;
        if (!var16.isInteger()) {
            var16 = Numbers.$most_positive_fixnum$.getGlobalValue();
        }
        var15 = conses_high.putf(var15, (SubLObject)module0434.$ic91$, (SubLObject)module0434.T);
        var15 = conses_high.putf(var15, (SubLObject)module0434.$ic0$, (SubLObject)module0434.MINUS_ONE_INTEGER);
        final SubLObject var19 = module0360.f23793(var15);
        SubLObject var20 = module0360.f23805(var15);
        final SubLObject var21 = module0409.f28515(var12, var13, var19);
        SubLObject var22 = (SubLObject)module0434.NIL;
        while (module0434.NIL == var22) {
            SubLObject var23 = conses_high.getf(var20, (SubLObject)module0434.$ic0$, (SubLObject)module0434.UNPROVIDED);
            var23 = Numbers.add(var23, (SubLObject)module0434.ONE_INTEGER);
            if (var23.numG(var16)) {
                var18 = (SubLObject)module0434.$ic92$;
                var22 = (SubLObject)module0434.T;
            }
            else {
                var20 = conses_high.putf(var20, (SubLObject)module0434.$ic0$, var23);
                var14.resetMultipleValues();
                final SubLObject var124_125 = module0409.f28521(var21, var20);
                final SubLObject var126_127 = var14.secondMultipleValue();
                var14.resetMultipleValues();
                var17 = var124_125;
                var18 = var126_127;
                if (module0434.NIL == var17) {
                    continue;
                }
                var22 = (SubLObject)module0434.T;
            }
        }
        return Values.values(var17, var18, var21);
    }
    
    public static SubLObject f30609() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30570", "QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30571", "S#33830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30572", "S#33831", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30573", "S#33832", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30574", "QUERY-JUSTIFIED", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30575", "ASK-JUSTIFIED", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30576", "QUERY-TEMPLATE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30577", "ASK-TEMPLATE", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30578", "QUERY-VARIABLE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30579", "ASK-VARIABLE", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30580", "QUERY-TEMPLATE-EVAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30581", "ASK-TEMPLATE-EVAL", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30582", "S#33833", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30583", "S#33834", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30584", "S#33835", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30585", "S#33836", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30587", "S#33837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30588", "S#33838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30586", "S#33839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30589", "S#33840", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30590", "S#33841", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30591", "S#33842", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30592", "S#33843", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30594", "S#17995", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30595", "S#33844", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30593", "S#33845", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30596", "S#33846", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30597", "S#24928", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30598", "S#33847", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30599", "S#33848", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30604", "S#33849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30600", "S#33850", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30602", "S#33851", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30601", "S#33852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30606", "S#33853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30607", "S#33854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30605", "S#33855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30603", "S#33856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0434", "f30608", "S#33857", 1, 2, false);
        return (SubLObject)module0434.NIL;
    }
    
    public static SubLObject f30610() {
        module0434.$g3528$ = SubLFiles.defvar("S#33858", (SubLObject)module0434.NIL);
        module0434.$g3529$ = SubLFiles.deflexical("S#33859", (SubLObject)module0434.$ic56$);
        module0434.$g3530$ = SubLFiles.defparameter("S#33860", (SubLObject)module0434.NIL);
        module0434.$g3531$ = SubLFiles.defparameter("S#33861", (SubLObject)module0434.T);
        module0434.$g3532$ = SubLFiles.defparameter("S#33862", (SubLObject)module0434.T);
        module0434.$g3533$ = SubLFiles.defparameter("S#33863", (SubLObject)module0434.NIL);
        return (SubLObject)module0434.NIL;
    }
    
    public static SubLObject f30611() {
        module0012.f368((SubLObject)module0434.$ic26$, (SubLObject)module0434.$ic27$, (SubLObject)module0434.$ic28$, (SubLObject)module0434.NIL, (SubLObject)module0434.$ic29$);
        module0012.f588((SubLObject)module0434.$ic30$, (SubLObject)module0434.$ic31$, (SubLObject)module0434.$ic32$, (SubLObject)module0434.$ic33$, (SubLObject)module0434.NIL, (SubLObject)module0434.$ic29$);
        module0012.f368((SubLObject)module0434.$ic34$, (SubLObject)module0434.$ic35$, (SubLObject)module0434.$ic36$, (SubLObject)module0434.NIL, (SubLObject)module0434.$ic29$);
        module0012.f588((SubLObject)module0434.$ic37$, (SubLObject)module0434.$ic38$, (SubLObject)module0434.$ic39$, (SubLObject)module0434.$ic40$, (SubLObject)module0434.NIL, (SubLObject)module0434.$ic29$);
        module0012.f368((SubLObject)module0434.$ic41$, (SubLObject)module0434.$ic42$, (SubLObject)module0434.$ic43$, (SubLObject)module0434.NIL, (SubLObject)module0434.$ic29$);
        module0012.f588((SubLObject)module0434.$ic44$, (SubLObject)module0434.$ic45$, (SubLObject)module0434.$ic46$, (SubLObject)module0434.$ic47$, (SubLObject)module0434.NIL, (SubLObject)module0434.$ic29$);
        module0012.f368((SubLObject)module0434.$ic48$, (SubLObject)module0434.$ic35$, (SubLObject)module0434.$ic49$, (SubLObject)module0434.NIL, (SubLObject)module0434.$ic50$);
        module0012.f588((SubLObject)module0434.$ic51$, (SubLObject)module0434.$ic52$, (SubLObject)module0434.$ic39$, (SubLObject)module0434.$ic53$, (SubLObject)module0434.NIL, (SubLObject)module0434.$ic50$);
        module0034.f1895((SubLObject)module0434.$ic89$);
        return (SubLObject)module0434.NIL;
    }
    
    public void declareFunctions() {
        f30609();
    }
    
    public void initializeVariables() {
        f30610();
    }
    
    public void runTopLevelForms() {
        f30611();
    }
    
    static {
        me = (SubLFile)new module0434();
        module0434.$g3528$ = null;
        module0434.$g3529$ = null;
        module0434.$g3530$ = null;
        module0434.$g3531$ = null;
        module0434.$g3532$ = null;
        module0434.$g3533$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic1$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic2$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic3$ = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $ic4$ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic5$ = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $ic6$ = SubLObjectFactory.makeKeyword("EL");
        $ic7$ = SubLObjectFactory.makeKeyword("HL");
        $ic8$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $ic9$ = SubLObjectFactory.makeKeyword("ALL");
        $ic10$ = SubLObjectFactory.makeSymbol("S#1965", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic12$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic13$ = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $ic14$ = SubLObjectFactory.makeSymbol("S#33864", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic16$ = SubLObjectFactory.makeKeyword("PROOF");
        $ic17$ = SubLObjectFactory.makeSymbol("S#33865", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("TEMPLATE");
        $ic19$ = SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic20$ = SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic21$ = SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic22$ = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $ic23$ = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic24$ = SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?");
        $ic25$ = SubLObjectFactory.makeInteger(100);
        $ic26$ = SubLObjectFactory.makeSymbol("QUERY-JUSTIFIED");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32187", "CYC"));
        $ic28$ = SubLObjectFactory.makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   Returns a list of binding and justificaion pairs.");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("S#26559", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("ASK-JUSTIFIED");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-JUSTIFIED"));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33866", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#25811", "CYC"));
        $ic33$ = SubLObjectFactory.makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   If BACKCHAIN is NIL, no inference is performed.\n   If BACKCHAIN is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If BACKCHAIN is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If NUMBER is an integer, then at most that number of bindings are returned.\n   If TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\n   If DEPTH is an integer, then the inference paths are limited to that number of total steps.\n   Returns a list of binding and justificaion pairs.\n   Deprecated in favor of query-justified.");
        $ic34$ = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE");
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33867", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32187", "CYC"));
        $ic36$ = SubLObjectFactory.makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.");
        $ic37$ = SubLObjectFactory.makeSymbol("ASK-TEMPLATE");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE"));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33867", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33866", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#25811", "CYC"));
        $ic40$ = SubLObjectFactory.makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\n   Deprecated in favor of query-template.");
        $ic41$ = SubLObjectFactory.makeSymbol("QUERY-VARIABLE");
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28828", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32187", "CYC"));
        $ic43$ = SubLObjectFactory.makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.");
        $ic44$ = SubLObjectFactory.makeSymbol("ASK-VARIABLE");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-VARIABLE"));
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28828", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33866", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#25811", "CYC"));
        $ic47$ = SubLObjectFactory.makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.\n   Deprecated in favor of query-variable.");
        $ic48$ = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-EVAL");
        $ic49$ = SubLObjectFactory.makeString("Ask SENTENCE in MT under the resource constraints query-properties\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"));
        $ic51$ = SubLObjectFactory.makeSymbol("ASK-TEMPLATE-EVAL");
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-EVAL"));
        $ic53$ = SubLObjectFactory.makeString("Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.\n Deprecated in favor of query-template-eval.");
        $ic54$ = SubLObjectFactory.makeKeyword("NONE");
        $ic55$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic56$ = SubLObjectFactory.makeInteger(27);
        $ic57$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic58$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic59$ = SubLObjectFactory.makeString("max recursive query depth of ~s exceeded with query ~s in mt ~s");
        $ic60$ = SubLObjectFactory.makeString("Either deeper thought is required to answer this query, or it is a paradox.");
        $ic61$ = SubLObjectFactory.makeSymbol("S#690", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#33837", "CYC");
        $ic63$ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"));
        $ic65$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic66$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic67$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0434.ONE_INTEGER);
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9148", "CYC"));
        $ic70$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic71$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic72$ = SubLObjectFactory.makeKeyword("NO-THE-SET-OF-EXPRESSION-FOUND");
        $ic73$ = SubLObjectFactory.makeKeyword("THE-SET-OF-VIA-GENERALIZED-QUERY-NOT-ALLOWED");
        $ic74$ = SubLObjectFactory.makeKeyword("PROBLEM-NOT-VALID");
        $ic75$ = SubLObjectFactory.makeKeyword("GENERALIZED-QUERY-PROPERTIES-DIFFERENT-THAN-RESTRICTED-QUERY-PROPERTIES");
        $ic76$ = SubLObjectFactory.makeKeyword("GENERALIZED-QUERY-NOT-GENERALIZED--CONTAINS-RESTRICTED-QUERY");
        $ic77$ = SubLObjectFactory.makeSymbol("S#33849", "CYC");
        $ic78$ = SubLObjectFactory.makeKeyword("GENERALIZED-QUERY-CONTAINS-PRED-NOT-ALLOWED-IN-GENERALIZED-QUERY-FOR-THE-SET-OF");
        $ic79$ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $ic80$ = SubLObjectFactory.makeString("the-set-of-via-generalized-query missed an answer!~%");
        $ic81$ = SubLObjectFactory.makeString("  Generalized query: (new-cyc-query ~S ~S ~S)~%");
        $ic82$ = SubLObjectFactory.makeString("  Restricted  query: (new-cyc-query ~S ~S ~S)~%");
        $ic83$ = SubLObjectFactory.makeString("  Missed answer: ~S -> ~S~%");
        $ic84$ = SubLObjectFactory.makeKeyword("FALLTHROUGH-NIL");
        $ic85$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("predNotAllowedInGeneralizedQueryForTheSetOf"));
        $ic86$ = SubLObjectFactory.makeSymbol("S#15606", "CYC");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33868", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33869", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27384", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#29224", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#33855", "CYC");
        $ic90$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic91$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic92$ = SubLObjectFactory.makeKeyword("EXHAUST");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0434.class
	Total time: 410 ms
	
	Decompiled with Procyon 0.5.32.
*/