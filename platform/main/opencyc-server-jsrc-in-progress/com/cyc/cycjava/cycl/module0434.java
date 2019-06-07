package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        if (NIL != var1) {
            var6 = conses_high.putf(var6, (SubLObject)$ic0$, (SubLObject)((T == var1) ? NIL : var1));
        }
        if (NIL != var2) {
            var6 = conses_high.putf(var6, (SubLObject)$ic1$, var2);
        }
        if (NIL != var3) {
            var6 = conses_high.putf(var6, (SubLObject)$ic2$, var3);
        }
        if (NIL != var4) {
            var6 = conses_high.putf(var6, (SubLObject)$ic3$, var4);
        }
        var6 = conses_high.putf(var6, (SubLObject)$ic4$, module0035.sublisp_boolean(module0018.$g701$.getDynamicValue(var5)));
        if (NIL != module0111.$g1409$.getDynamicValue(var5)) {
            var6 = conses_high.putf(var6, (SubLObject)$ic5$, (SubLObject)$ic6$);
        }
        else {
            var6 = conses_high.putf(var6, (SubLObject)$ic5$, (SubLObject)$ic7$);
        }
        if (NIL != module0018.$g633$.getDynamicValue(var5)) {
            var6 = conses_high.putf(var6, (SubLObject)$ic8$, module0018.$g634$.getDynamicValue(var5));
        }
        else {
            var6 = conses_high.putf(var6, (SubLObject)$ic8$, (SubLObject)$ic9$);
        }
        final SubLObject var7 = module0018.$g656$.getDynamicValue(var5);
        if (var7.eql((SubLObject)$ic10$)) {
            var6 = conses_high.putf(var6, (SubLObject)$ic11$, (SubLObject)$ic12$);
            var6 = conses_high.putf(var6, (SubLObject)$ic13$, (SubLObject)$ic12$);
        }
        else if (var7.eql((SubLObject)$ic14$)) {
            var6 = conses_high.putf(var6, (SubLObject)$ic11$, (SubLObject)$ic15$);
            var6 = conses_high.putf(var6, (SubLObject)$ic13$, (SubLObject)$ic16$);
            var6 = conses_high.putf(var6, (SubLObject)$ic5$, (SubLObject)$ic7$);
        }
        else if (var7.eql((SubLObject)$ic17$)) {
            var6 = conses_high.putf(var6, (SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, module0352.$g2993$.getDynamicValue(var5)));
            var6 = conses_high.putf(var6, (SubLObject)$ic13$, (SubLObject)$ic12$);
        }
        var6 = conses_high.putf(var6, (SubLObject)$ic19$, module0035.sublisp_boolean(module0018.$g644$.getDynamicValue(var5)));
        var6 = conses_high.putf(var6, (SubLObject)$ic20$, module0035.sublisp_boolean(module0018.$g648$.getDynamicValue(var5)));
        var6 = conses_high.putf(var6, (SubLObject)$ic21$, module0035.sublisp_boolean(module0018.$g645$.getDynamicValue(var5)));
        final SubLObject var8 = f30571(module0018.$g650$.getDynamicValue(var5));
        var6 = conses_high.putf(var6, (SubLObject)$ic22$, var8);
        var6 = conses_high.putf(var6, (SubLObject)$ic23$, module0352.$g2992$.getDynamicValue(var5));
        var6 = conses_high.putf(var6, (SubLObject)$ic24$, module0035.sublisp_boolean(module0018.$g646$.getDynamicValue(var5)));
        return var6;
    }
    
    public static SubLObject f30571(final SubLObject var9) {
        return (NIL != var9) ? Numbers.multiply((SubLObject)TWO_INTEGER, (SubLObject)$ic25$, var9) : module0048.f3326();
    }
    
    public static SubLObject f30572() {
        final SubLObject var10 = f30570((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0360.f23793(var10);
    }
    
    public static SubLObject f30573(SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var11) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLObject var12 = f30570(var1, var2, var3, var4);
        return module0360.f23805(var12);
    }
    
    public static SubLObject f30574(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL == var13) {
            var13 = module0132.$g1568$.getGlobalValue();
        }
        SubLObject var15 = conses_high.putf(conses_high.copy_list(var10), (SubLObject)$ic5$, (SubLObject)$ic7$);
        var15 = conses_high.putf(var15, (SubLObject)$ic11$, (SubLObject)$ic15$);
        var14.resetMultipleValues();
        final SubLObject var16 = module0409.f28506(var12, var13, var15);
        final SubLObject var17 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        return Values.values(var16, var17);
    }
    
    public static SubLObject f30575(final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var14 = f30570(var1, var2, var3, var4);
        return f30574(var12, var13, var14);
    }
    
    public static SubLObject f30576(final SubLObject var17, final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL == var13) {
            var13 = module0132.$g1568$.getGlobalValue();
        }
        SubLObject var19 = conses_high.putf(conses_high.copy_list(var10), (SubLObject)$ic13$, (SubLObject)$ic12$);
        var19 = conses_high.putf(var19, (SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var17));
        var18.resetMultipleValues();
        final SubLObject var20 = module0409.f28506(var12, var13, var19);
        final SubLObject var21 = var18.secondMultipleValue();
        var18.resetMultipleValues();
        return Values.values(var20, var21);
    }
    
    public static SubLObject f30577(final SubLObject var17, final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var18 = f30570(var1, var2, var3, var4);
        return f30576(var17, var12, var13, var18);
    }
    
    public static SubLObject f30578(final SubLObject var19, final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0279.f18513(var12, (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0205.f13250(var21, var19, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var20.resetMultipleValues();
        SubLObject var23 = f30576(var21, var22, var13, var10);
        final SubLObject var24 = var20.secondMultipleValue();
        var20.resetMultipleValues();
        var23 = Sequences.delete_duplicates(var23, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Values.values(var23, var24);
    }
    
    public static SubLObject f30579(final SubLObject var19, final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var20 = f30570(var1, var2, var3, var4);
        return f30578(var19, var12, var13, var20);
    }
    
    public static SubLObject f30580(final SubLObject var17, final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        SubLObject var19;
        final SubLObject var18 = var19 = f30576(var17, var12, var13, var10);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            module0112.f7688(var20);
            var19 = var19.rest();
            var20 = var19.first();
        }
        return Sequences.length(var18);
    }
    
    public static SubLObject f30581(final SubLObject var17, final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var18 = f30570(var1, var2, var3, var4);
        return f30580(var17, var12, var13, var18);
    }
    
    public static SubLObject f30582(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = module0409.f28506(var12, var13, var10);
        final SubLObject var16 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        return Values.values(module0035.sublisp_boolean(var15), var16);
    }
    
    public static SubLObject f30583(SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = f30570(var1, var2, var3, var4);
        var6 = conses_high.putf(var6, (SubLObject)$ic4$, (SubLObject)NIL);
        var6 = conses_high.putf(var6, (SubLObject)$ic5$, (SubLObject)$ic7$);
        var6 = conses_high.putf(var6, (SubLObject)$ic23$, (SubLObject)$ic54$);
        if (NIL != module0408.$g3301$.getDynamicValue(var5) && NIL == module0131.f8587()) {
            final SubLObject var7 = module0373.f26113();
            var6 = conses_high.putf(var6, (SubLObject)$ic55$, var7);
        }
        return var6;
    }
    
    public static SubLObject f30584() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return module0004.f105($g3530$.getDynamicValue(var5));
    }
    
    public static SubLObject f30585(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = conses_high.copy_list(var10);
        final SubLObject var16 = f30586(var15);
        if (NIL != var16) {
            var15 = conses_high.putf(var15, (SubLObject)$ic55$, var16);
        }
        if (NIL == conses_high.getf(var15, (SubLObject)$ic57$, (SubLObject)UNPROVIDED)) {
            var15 = conses_high.putf(var15, (SubLObject)$ic57$, (SubLObject)ONE_INTEGER);
        }
        SubLObject var17 = module0339.f22757();
        if (NIL != inference_datastructures_inference_oc.f25275(var17)) {
            SubLObject var18 = module0018.$g632$.getDynamicValue(var14);
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL != var18) {
                if (NIL == conses_high.getf(var15, var19, (SubLObject)UNPROVIDED)) {
                    final SubLObject var20 = inference_datastructures_inference_oc.f25591(var17, var19, (SubLObject)UNPROVIDED);
                    if (NIL != var20) {
                        var15 = conses_high.putf(var15, var19, var20);
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        if (NIL == module0035.f2345(var15, (SubLObject)$ic5$)) {
            var15 = conses_high.putf(var15, (SubLObject)$ic5$, (SubLObject)$ic7$);
        }
        var17 = module0339.f22757();
        if (NIL != inference_datastructures_inference_oc.f25429(var17) && NIL != $g3528$.getDynamicValue(var14) && NIL != inference_datastructures_inference_oc.f25515(var17)) {
            var15 = conses_high.putf(var15, (SubLObject)$ic58$, (SubLObject)T);
        }
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = $g3530$.currentBinding(var14);
        try {
            $g3530$.bind((SubLObject)((NIL != $g3530$.getDynamicValue(var14)) ? module0048.f_1X($g3530$.getDynamicValue(var14)) : ONE_INTEGER), var14);
            if ($g3530$.getDynamicValue(var14).numG($g3529$.getGlobalValue())) {
                if (NIL != module0018.$g629$.getDynamicValue(var14)) {
                    Errors.error((SubLObject)$ic59$, $g3529$.getGlobalValue(), var12, var13);
                }
                else {
                    Errors.error((SubLObject)$ic60$);
                }
            }
            else {
                final SubLObject var26 = module0012.$g52$.getGlobalValue();
                final ArrayList var27 = Dynamic.extract_dynamic_values(var26);
                try {
                    Dynamic.bind_dynamic_vars(var26, (SubLObject)ConsesLow.make_list(Sequences.length(module0012.$g52$.getGlobalValue()), (SubLObject)NIL));
                    final SubLObject var28 = module0528.f32898();
                    assert NIL != module0055.f4006(var28) : var28;
                    final SubLObject var30_34 = module0131.$g1538$.currentBinding(var14);
                    final SubLObject var29 = module0271.$g2560$.currentBinding(var14);
                    final SubLObject var30 = module0146.$g2057$.currentBinding(var14);
                    try {
                        module0131.$g1538$.bind(var28, var14);
                        module0271.$g2560$.bind((SubLObject)NIL, var14);
                        module0146.$g2057$.bind((SubLObject)NIL, var14);
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
            $g3530$.rebind(var25, var14);
        }
        return Values.values(var21, var22, var23, var24);
    }
    
    public static SubLObject f30587(final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        return module0035.f2169(var45, module0018.$g632$.getDynamicValue(var46));
    }
    
    public static SubLObject f30588(final SubLObject var10) {
        return module0035.f2329(var10, (SubLObject)$ic62$);
    }
    
    public static SubLObject f30586(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL != module0408.$g3301$.getDynamicValue(var11) && NIL == module0131.f8587()) {
            final SubLObject var12 = module0373.f26113();
            if (NIL != var12 && NIL != module0412.f28690(var12, var10)) {
                return var12;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30589(final SubLObject var46, final SubLObject var12, final SubLObject var13, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0289.f19491(var46);
        final SubLObject var49 = module0289.f19490(var12);
        SubLObject var50 = conses_high.copy_list(var10);
        var50 = conses_high.putf(var50, (SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var48));
        var50 = conses_high.putf(var50, (SubLObject)$ic13$, (SubLObject)$ic12$);
        var50 = conses_high.putf(var50, (SubLObject)$ic63$, (SubLObject)NIL);
        var50 = conses_high.putf(var50, (SubLObject)$ic23$, (SubLObject)$ic54$);
        var50 = conses_high.putf(var50, (SubLObject)$ic5$, (SubLObject)$ic7$);
        var47.resetMultipleValues();
        SubLObject var51 = f30585(var49, var13, var50);
        final SubLObject var52 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        var51 = Sequences.delete_duplicates(var51, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Values.values(var51, var52);
    }
    
    public static SubLObject f30590(final SubLObject var46, final SubLObject var12, final SubLObject var13, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0289.f19491(var46);
        final SubLObject var49 = module0289.f19490(var12);
        SubLObject var50 = conses_high.copy_list(var10);
        var50 = conses_high.putf(var50, (SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, ConsesLow.append((SubLObject)ConsesLow.list(var48), (SubLObject)$ic64$)));
        var50 = conses_high.putf(var50, (SubLObject)$ic13$, (SubLObject)$ic12$);
        var50 = conses_high.putf(var50, (SubLObject)$ic23$, (SubLObject)$ic54$);
        var50 = conses_high.putf(var50, (SubLObject)$ic5$, (SubLObject)$ic7$);
        var47.resetMultipleValues();
        SubLObject var51 = f30585(var49, var13, var50);
        final SubLObject var52 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        var51 = Sequences.delete_duplicates(var51, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Values.values(var51, var52);
    }
    
    public static SubLObject f30591(final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (NIL == var13) {
            var13 = module0132.$g1568$.getGlobalValue();
        }
        final SubLObject var14 = f30583(var1, var2, var3, var4);
        return f30592(var12, var13, var14);
    }
    
    public static SubLObject f30592(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0193.f12102(var12);
        final SubLObject var16 = module0289.f19490(var12);
        SubLObject var17 = conses_high.copy_list(var10);
        var17 = conses_high.putf(var17, (SubLObject)$ic5$, (SubLObject)$ic7$);
        var17 = conses_high.putf(var17, (SubLObject)$ic13$, (SubLObject)$ic16$);
        var17 = conses_high.putf(var17, (SubLObject)$ic11$, (SubLObject)$ic15$);
        var14.resetMultipleValues();
        final SubLObject var18 = f30585(var16, var13, var17);
        final SubLObject var19 = var14.secondMultipleValue();
        final SubLObject var20 = var14.thirdMultipleValue();
        final SubLObject var21 = var14.fourthMultipleValue();
        var14.resetMultipleValues();
        SubLObject var22 = var18;
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            final SubLObject var24 = var23.first();
            if (NIL != var24) {
                ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var23, f30593(var24, var15));
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        return Values.values(var18, var19, var20, var21);
    }
    
    public static SubLObject f30594(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL == var13) {
            var13 = module0132.$g1568$.getGlobalValue();
        }
        final SubLObject var15 = module0193.f12102(var12);
        final SubLObject var16 = module0289.f19490(var12);
        SubLObject var17 = conses_high.copy_list(var10);
        var17 = conses_high.putf(var17, (SubLObject)$ic5$, (SubLObject)$ic7$);
        var17 = conses_high.putf(var17, (SubLObject)$ic13$, (SubLObject)$ic12$);
        var17 = conses_high.putf(var17, (SubLObject)$ic63$, (SubLObject)NIL);
        var17 = conses_high.putf(var17, (SubLObject)$ic11$, (SubLObject)$ic12$);
        var14.resetMultipleValues();
        final SubLObject var18 = f30585(var16, var13, var17);
        final SubLObject var19 = var14.secondMultipleValue();
        final SubLObject var20 = var14.thirdMultipleValue();
        final SubLObject var21 = var14.fourthMultipleValue();
        var14.resetMultipleValues();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = var18;
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            var22 = (SubLObject)ConsesLow.cons(f30593(var24, var15), var22);
            var23 = var23.rest();
            var24 = var23.first();
        }
        var22 = Sequences.nreverse(var22);
        return Values.values(var22, var19, var20, var21);
    }
    
    public static SubLObject f30595(final SubLObject var12, SubLObject var13, SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var14 = f30583(var1, var2, var3, var4);
        return f30594(var12, var13, var14);
    }
    
    public static SubLObject f30593(final SubLObject var54, final SubLObject var50) {
        if (NIL == var50 || NIL != module0540.f33531(var54)) {
            return var54;
        }
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = var50;
        SubLObject var57 = (SubLObject)NIL;
        var57 = var56.first();
        while (NIL != var56) {
            final SubLObject var58 = module0193.f12082(var57);
            final SubLObject var59 = module0233.f15369(var58, var54);
            var55 = (SubLObject)ConsesLow.cons(module0233.f15340(var57, var59), var55);
            var56 = var56.rest();
            var57 = var56.first();
        }
        return Sequences.nreverse(var55);
    }
    
    public static SubLObject f30596(final SubLObject var58, final SubLObject var13) {
        if (NIL != f30597(var58, var13)) {
            return (SubLObject)$ic65$;
        }
        if (NIL != f30597(module0205.f13338(var58), var13)) {
            return (SubLObject)$ic66$;
        }
        return (SubLObject)$ic67$;
    }
    
    public static SubLObject f30597(final SubLObject var58, final SubLObject var13) {
        return module0035.sublisp_boolean(f30594(var58, var13, (SubLObject)$ic68$));
    }
    
    public static SubLObject f30598(final SubLObject var59, SubLObject var60, SubLObject var13) {
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)$ic6$;
        }
        if (var13 == UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        if (NIL != f30599(var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f30600((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var62;
        final SubLObject var61 = var62 = module0205.f13304(var59, (SubLObject)UNPROVIDED);
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic69$);
        var63 = var62.first();
        var62 = var62.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic69$);
        var64 = var62.first();
        var62 = var62.rest();
        if (NIL == var62) {
            final SubLObject var65 = module0289.f19491(var63);
            final SubLObject var66 = module0289.f19490(var64);
            SubLObject var67 = module0349.f23492(var66, var13);
            SubLObject var68 = (SubLObject)NIL;
            var67 = conses_high.putf(var67, (SubLObject)$ic5$, var60);
            var68 = f30589((SubLObject)ConsesLow.list(var65), var66, var13, var67);
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic70$), var68);
        }
        cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30599(SubLObject var59, SubLObject var66, SubLObject var13) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var66 == UNPROVIDED) {
            var66 = module0373.f26109();
        }
        if (var13 == UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL == module0363.f24478(var66) || NIL == module0035.f2428($ic71$, module0363.f24509(var66), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return Values.values((SubLObject)NIL, (SubLObject)$ic72$);
        }
        if (NIL == $g3531$.getDynamicValue(var67)) {
            return Values.values((SubLObject)NIL, (SubLObject)$ic73$);
        }
        if (NIL == module0363.f24478(var66)) {
            return Values.values((SubLObject)NIL, (SubLObject)$ic74$);
        }
        var67.resetMultipleValues();
        final SubLObject var68 = f30601(var66);
        final SubLObject var69 = var67.secondMultipleValue();
        final SubLObject var70 = var67.thirdMultipleValue();
        var67.resetMultipleValues();
        if (NIL != var68 && NIL != var69 && NIL != var70) {
            if (NIL != module0202.f12678(var59)) {
                final SubLObject var71 = f30602(var66);
                final SubLObject var72 = f30603(var71, var13);
                final SubLObject var73 = module0205.f13204(var59, (SubLObject)UNPROVIDED);
                final SubLObject var74 = module0205.f13203(var59, (SubLObject)UNPROVIDED);
                final SubLObject var75 = f30603(var73, var13);
                if (!var72.equal(var75)) {
                    return Values.values((SubLObject)NIL, (SubLObject)$ic75$);
                }
                if (NIL != module0035.f2428(var73, var71, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    return Values.values((SubLObject)NIL, (SubLObject)$ic76$);
                }
                if (NIL != module0035.f2439((SubLObject)$ic77$, var71, (SubLObject)UNPROVIDED)) {
                    return Values.values((SubLObject)NIL, (SubLObject)$ic78$);
                }
                if (NIL != $g3533$.getDynamicValue(var67)) {
                    final SubLObject var76 = f30600(var66, var13);
                    var67.resetMultipleValues();
                    final SubLObject var77 = f30576(var74, var73, var13, var75);
                    final SubLObject var78 = var67.secondMultipleValue();
                    final SubLObject var79 = var67.thirdMultipleValue();
                    final SubLObject var80 = var67.fourthMultipleValue();
                    var67.resetMultipleValues();
                    if (NIL != conses_high.set_difference(var77, var76, (SubLObject)$ic79$, (SubLObject)UNPROVIDED)) {
                        module0006.f218((SubLObject)T, (SubLObject)$ic80$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0006.f218((SubLObject)T, (SubLObject)$ic81$, module0035.f2241(f30602(var66)), module0035.f2241(var13), module0035.f2241(var72), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0006.f218((SubLObject)T, (SubLObject)$ic82$, module0035.f2241(var73), module0035.f2241(var13), module0035.f2241(var75), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var81 = conses_high.set_difference(var77, var76, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
                        SubLObject var82 = (SubLObject)NIL;
                        var82 = var81.first();
                        while (NIL != var81) {
                            module0006.f218((SubLObject)T, (SubLObject)$ic83$, var74, var82, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            var81 = var81.rest();
                            var82 = var81.first();
                        }
                    }
                }
            }
            return Values.values((SubLObject)T, (SubLObject)NIL);
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic84$);
    }
    
    public static SubLObject f30604(final SubLObject var78) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var78) && NIL != module0269.f17706(var78) && NIL != module0222.f14635($ic85$, var78, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0220.f14553(var78, $ic85$, (SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f30600(SubLObject var66, SubLObject var13) {
        if (var66 == UNPROVIDED) {
            var66 = module0373.f26109();
        }
        if (var13 == UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        var67.resetMultipleValues();
        final SubLObject var68 = f30602(var66);
        final SubLObject var69 = var67.secondMultipleValue();
        final SubLObject var70 = var67.thirdMultipleValue();
        var67.resetMultipleValues();
        final SubLObject var71 = f30605(var68, var13);
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = var71;
        SubLObject var74 = (SubLObject)NIL;
        var74 = var73.first();
        while (NIL != var73) {
            if (NIL != module0035.f2206(var70, var74, Symbols.symbol_function((SubLObject)EQUAL))) {
                var72 = (SubLObject)ConsesLow.cons(module0233.f15369(var69, var74), var72);
            }
            var73 = var73.rest();
            var74 = var73.first();
        }
        return module0035.f2269(var72, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30602(SubLObject var66) {
        if (var66 == UNPROVIDED) {
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
        if (NIL != var72) {
            final SubLObject var73 = module0381.f27142(var71);
            final SubLObject var74 = module0381.f27143(var71);
            final SubLObject var75 = module0205.f13203(var69, (SubLObject)UNPROVIDED);
            final SubLObject var76 = module0205.f13204(var69, (SubLObject)UNPROVIDED);
            final SubLObject var77 = module0363.f24551(var72);
            final SubLObject var78 = module0233.f15362(var73, var77);
            final SubLObject var79 = module0233.f15362(var74, var76);
            final SubLObject var80 = module0233.f15362(var74, var70);
            final SubLObject var81 = module0611.f37354(var75);
            final SubLObject var82 = module0202.f12773((SubLObject)ConsesLow.listS(var78, var79, ConsesLow.append((SubLObject)((NIL != var81) ? ConsesLow.list(var81) : NIL), (SubLObject)NIL)));
            return Values.values(var82, var75, var80);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30601(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        final SubLObject var68 = module0205.f13183(module0363.f24551(var66), (SubLObject)$ic86$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        for (var70 = module0032.f1741(var69), var71 = (SubLObject)NIL, var71 = module0032.f1742(var70, var69); NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
            var72 = module0032.f1745(var70, var71);
            if (NIL != module0032.f1746(var71, var72)) {
                if (NIL != module0375.f26571(var72)) {
                    var73 = module0364.f24725(var72);
                    var74 = module0375.f26570(var72);
                    if (NIL != module0363.f24478(var73)) {
                        var75 = module0035.f2259((SubLObject)$ic86$, module0363.f24551(var73), (SubLObject)UNPROVIDED);
                        var76 = (SubLObject)NIL;
                        var77 = var68;
                        var78 = (SubLObject)NIL;
                        var78 = var77.first();
                        while (NIL != var77) {
                            var23_101 = var75;
                            var79 = (SubLObject)NIL;
                            var79 = var23_101.first();
                            while (NIL != var23_101) {
                                if (var78.equal(module0233.f15362(var74, var79))) {
                                    var76 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var73, var79, var74), var76);
                                }
                                var23_101 = var23_101.rest();
                                var79 = var23_101.first();
                            }
                            var77 = var77.rest();
                            var78 = var77.first();
                        }
                        if (NIL == $g3532$.getDynamicValue(var67) || NIL != module0035.f1997(var76)) {
                            var80 = (var81 = module0035.f2113(var76));
                            var97_105 = (SubLObject)NIL;
                            var82 = (SubLObject)NIL;
                            var69_106 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic87$);
                            var97_105 = var81.first();
                            var81 = var81.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic87$);
                            var82 = var81.first();
                            var81 = var81.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)$ic87$);
                            var69_106 = var81.first();
                            var81 = var81.rest();
                            if (NIL == var81) {
                                return Values.values(var97_105, var82, var69_106);
                            }
                            cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)$ic87$);
                        }
                    }
                }
                else if (NIL != module0381.f27029(var72)) {
                    var83 = module0364.f24725(var72);
                    if (NIL != module0363.f24478(var83)) {
                        var67.resetMultipleValues();
                        var84 = f30601(var83);
                        var85 = var67.secondMultipleValue();
                        var86 = var67.thirdMultipleValue();
                        var67.resetMultipleValues();
                        if (NIL != var84) {
                            return Values.values(var84, var85, var86);
                        }
                    }
                }
                else if (NIL != module0380.f26955(var72)) {
                    return f30601(module0364.f24725(var72));
                }
            }
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f30606(final SubLObject var108) {
        SubLObject var109 = module0035.f2110((SubLObject)$ic88$, module0363.f24531(var108), (SubLObject)UNPROVIDED);
        SubLObject var110 = (SubLObject)NIL;
        var110 = var109.first();
        while (NIL != var109) {
            final SubLObject var111 = module0381.f27050(var110);
            if (var108.eql(module0381.f27051(var110))) {
                return Values.values(var110, var111);
            }
            var109 = var109.rest();
            var110 = var109.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30607(final SubLObject var70, final SubLObject var13) {
        final SubLObject var71 = f30603(var70, var13);
        return f30585(var70, var13, var71);
    }
    
    public static SubLObject f30605(final SubLObject var70, final SubLObject var13) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = module0034.$g879$.getDynamicValue(var71);
        SubLObject var73 = (SubLObject)NIL;
        if (NIL == var72) {
            return f30607(var70, var13);
        }
        var73 = module0034.f1857(var72, (SubLObject)$ic89$, (SubLObject)UNPROVIDED);
        if (NIL == var73) {
            var73 = module0034.f1807(module0034.f1842(var72), (SubLObject)$ic89$, (SubLObject)TWO_INTEGER, (SubLObject)$ic25$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var72, (SubLObject)$ic89$, var73);
        }
        final SubLObject var74 = module0034.f1782(var70, var13);
        final SubLObject var75 = module0034.f1814(var73, var74, (SubLObject)UNPROVIDED);
        if (var75 != $ic90$) {
            SubLObject var76 = var75;
            SubLObject var77 = (SubLObject)NIL;
            var77 = var76.first();
            while (NIL != var76) {
                SubLObject var78 = var77.first();
                final SubLObject var79 = conses_high.second(var77);
                if (var70.equal(var78.first())) {
                    var78 = var78.rest();
                    if (NIL != var78 && NIL == var78.rest() && var13.equal(var78.first())) {
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
        var72 = conses_high.putf(var72, (SubLObject)$ic63$, module0408.$g3301$.getDynamicValue(var71));
        return var72;
    }
    
    public static SubLObject f30608(final SubLObject var12, SubLObject var13, SubLObject var10) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = conses_high.copy_list(var10);
        SubLObject var16 = conses_high.getf(var10, (SubLObject)$ic0$, (SubLObject)UNPROVIDED);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        if (!var16.isInteger()) {
            var16 = Numbers.$most_positive_fixnum$.getGlobalValue();
        }
        var15 = conses_high.putf(var15, (SubLObject)$ic91$, (SubLObject)T);
        var15 = conses_high.putf(var15, (SubLObject)$ic0$, (SubLObject)MINUS_ONE_INTEGER);
        final SubLObject var19 = module0360.f23793(var15);
        SubLObject var20 = module0360.f23805(var15);
        final SubLObject var21 = module0409.f28515(var12, var13, var19);
        SubLObject var22 = (SubLObject)NIL;
        while (NIL == var22) {
            SubLObject var23 = conses_high.getf(var20, (SubLObject)$ic0$, (SubLObject)UNPROVIDED);
            var23 = Numbers.add(var23, (SubLObject)ONE_INTEGER);
            if (var23.numG(var16)) {
                var18 = (SubLObject)$ic92$;
                var22 = (SubLObject)T;
            }
            else {
                var20 = conses_high.putf(var20, (SubLObject)$ic0$, var23);
                var14.resetMultipleValues();
                final SubLObject var124_125 = module0409.f28521(var21, var20);
                final SubLObject var126_127 = var14.secondMultipleValue();
                var14.resetMultipleValues();
                var17 = var124_125;
                var18 = var126_127;
                if (NIL == var17) {
                    continue;
                }
                var22 = (SubLObject)T;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30610() {
        $g3528$ = SubLFiles.defvar("S#33858", (SubLObject)NIL);
        $g3529$ = SubLFiles.deflexical("S#33859", (SubLObject)$ic56$);
        $g3530$ = SubLFiles.defparameter("S#33860", (SubLObject)NIL);
        $g3531$ = SubLFiles.defparameter("S#33861", (SubLObject)T);
        $g3532$ = SubLFiles.defparameter("S#33862", (SubLObject)T);
        $g3533$ = SubLFiles.defparameter("S#33863", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30611() {
        module0012.f368((SubLObject)$ic26$, (SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)NIL, (SubLObject)$ic29$);
        module0012.f588((SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)$ic33$, (SubLObject)NIL, (SubLObject)$ic29$);
        module0012.f368((SubLObject)$ic34$, (SubLObject)$ic35$, (SubLObject)$ic36$, (SubLObject)NIL, (SubLObject)$ic29$);
        module0012.f588((SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)$ic40$, (SubLObject)NIL, (SubLObject)$ic29$);
        module0012.f368((SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)NIL, (SubLObject)$ic29$);
        module0012.f588((SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)NIL, (SubLObject)$ic29$);
        module0012.f368((SubLObject)$ic48$, (SubLObject)$ic35$, (SubLObject)$ic49$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f588((SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)$ic39$, (SubLObject)$ic53$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0034.f1895((SubLObject)$ic89$);
        return (SubLObject)NIL;
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
        $g3528$ = null;
        $g3529$ = null;
        $g3530$ = null;
        $g3531$ = null;
        $g3532$ = null;
        $g3533$ = null;
        $ic0$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic1$ = makeKeyword("MAX-NUMBER");
        $ic2$ = makeKeyword("MAX-TIME");
        $ic3$ = makeKeyword("MAX-PROOF-DEPTH");
        $ic4$ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic5$ = makeKeyword("ANSWER-LANGUAGE");
        $ic6$ = makeKeyword("EL");
        $ic7$ = makeKeyword("HL");
        $ic8$ = makeKeyword("ALLOWED-RULES");
        $ic9$ = makeKeyword("ALL");
        $ic10$ = makeSymbol("S#1965", "CYC");
        $ic11$ = makeKeyword("RETURN");
        $ic12$ = makeKeyword("BINDINGS");
        $ic13$ = makeKeyword("RESULT-UNIQUENESS");
        $ic14$ = makeSymbol("S#33864", "CYC");
        $ic15$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic16$ = makeKeyword("PROOF");
        $ic17$ = makeSymbol("S#33865", "CYC");
        $ic18$ = makeKeyword("TEMPLATE");
        $ic19$ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic20$ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic21$ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic22$ = makeKeyword("PRODUCTIVITY-LIMIT");
        $ic23$ = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic24$ = makeKeyword("NEGATION-BY-FAILURE?");
        $ic25$ = makeInteger(100);
        $ic26$ = makeSymbol("QUERY-JUSTIFIED");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#32187", "CYC"));
        $ic28$ = makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   Returns a list of binding and justificaion pairs.");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("LISTP"), (SubLObject)makeSymbol("S#26559", "CYC"));
        $ic30$ = makeSymbol("ASK-JUSTIFIED");
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("QUERY-JUSTIFIED"));
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#33866", "CYC"), (SubLObject)makeSymbol("NUMBER"), (SubLObject)makeSymbol("TIME"), (SubLObject)makeSymbol("S#25811", "CYC"));
        $ic33$ = makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   If BACKCHAIN is NIL, no inference is performed.\n   If BACKCHAIN is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If BACKCHAIN is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If NUMBER is an integer, then at most that number of bindings are returned.\n   If TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\n   If DEPTH is an integer, then the inference paths are limited to that number of total steps.\n   Returns a list of binding and justificaion pairs.\n   Deprecated in favor of query-justified.");
        $ic34$ = makeSymbol("QUERY-TEMPLATE");
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("S#33867", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#32187", "CYC"));
        $ic36$ = makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.");
        $ic37$ = makeSymbol("ASK-TEMPLATE");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("QUERY-TEMPLATE"));
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#33867", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#33866", "CYC"), (SubLObject)makeSymbol("NUMBER"), (SubLObject)makeSymbol("TIME"), (SubLObject)makeSymbol("S#25811", "CYC"));
        $ic40$ = makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\n   Deprecated in favor of query-template.");
        $ic41$ = makeSymbol("QUERY-VARIABLE");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#28828", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#32187", "CYC"));
        $ic43$ = makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.");
        $ic44$ = makeSymbol("ASK-VARIABLE");
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("QUERY-VARIABLE"));
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("S#28828", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#33866", "CYC"), (SubLObject)makeSymbol("NUMBER"), (SubLObject)makeSymbol("TIME"), (SubLObject)makeSymbol("S#25811", "CYC"));
        $ic47$ = makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.\n   Deprecated in favor of query-variable.");
        $ic48$ = makeSymbol("QUERY-TEMPLATE-EVAL");
        $ic49$ = makeString("Ask SENTENCE in MT under the resource constraints query-properties\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.");
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"));
        $ic51$ = makeSymbol("ASK-TEMPLATE-EVAL");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("QUERY-TEMPLATE-EVAL"));
        $ic53$ = makeString("Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.\n Deprecated in favor of query-template-eval.");
        $ic54$ = makeKeyword("NONE");
        $ic55$ = makeKeyword("PROBLEM-STORE");
        $ic56$ = makeInteger(27);
        $ic57$ = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic58$ = makeKeyword("BROWSABLE?");
        $ic59$ = makeString("max recursive query depth of ~s exceeded with query ~s in mt ~s");
        $ic60$ = makeString("Either deeper thought is required to answer this query, or it is a paradox.");
        $ic61$ = makeSymbol("S#690", "CYC");
        $ic62$ = makeSymbol("S#33837", "CYC");
        $ic63$ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic64$ = ConsesLow.list((SubLObject)makeKeyword("SUPPORTS"));
        $ic65$ = makeKeyword("TRUE");
        $ic66$ = makeKeyword("FALSE");
        $ic67$ = makeKeyword("UNKNOWN");
        $ic68$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#9148", "CYC"));
        $ic70$ = makeSymbol("FIRST");
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic72$ = makeKeyword("NO-THE-SET-OF-EXPRESSION-FOUND");
        $ic73$ = makeKeyword("THE-SET-OF-VIA-GENERALIZED-QUERY-NOT-ALLOWED");
        $ic74$ = makeKeyword("PROBLEM-NOT-VALID");
        $ic75$ = makeKeyword("GENERALIZED-QUERY-PROPERTIES-DIFFERENT-THAN-RESTRICTED-QUERY-PROPERTIES");
        $ic76$ = makeKeyword("GENERALIZED-QUERY-NOT-GENERALIZED--CONTAINS-RESTRICTED-QUERY");
        $ic77$ = makeSymbol("S#33849", "CYC");
        $ic78$ = makeKeyword("GENERALIZED-QUERY-CONTAINS-PRED-NOT-ALLOWED-IN-GENERALIZED-QUERY-FOR-THE-SET-OF");
        $ic79$ = makeSymbol("EQUALS-EL?");
        $ic80$ = makeString("the-set-of-via-generalized-query missed an answer!~%");
        $ic81$ = makeString("  Generalized query: (new-cyc-query ~S ~S ~S)~%");
        $ic82$ = makeString("  Restricted  query: (new-cyc-query ~S ~S ~S)~%");
        $ic83$ = makeString("  Missed answer: ~S -> ~S~%");
        $ic84$ = makeKeyword("FALLTHROUGH-NIL");
        $ic85$ = constant_handles_oc.f8479((SubLObject)makeString("predNotAllowedInGeneralizedQueryForTheSetOf"));
        $ic86$ = makeSymbol("S#15606", "CYC");
        $ic87$ = ConsesLow.list((SubLObject)makeSymbol("S#33868", "CYC"), (SubLObject)makeSymbol("S#33869", "CYC"), (SubLObject)makeSymbol("S#27384", "CYC"));
        $ic88$ = makeSymbol("S#29224", "CYC");
        $ic89$ = makeSymbol("S#33855", "CYC");
        $ic90$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic91$ = makeKeyword("CONTINUABLE?");
        $ic92$ = makeKeyword("EXHAUST");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 410 ms
	
	Decompiled with Procyon 0.5.32.
*/