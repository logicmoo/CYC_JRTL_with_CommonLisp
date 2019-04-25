package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0246 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0246";
    public static final String myFingerPrint = "ffe85d6c672aacc8b40fdc886fc9008cd1461dd2dcd19204e6c942ee08a253d5";
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
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
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    
    public static SubLObject f15862() {
        module0219.f14478(Symbols.symbol_function((SubLObject)module0246.$ic0$), module0246.$ic1$, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15863(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0246.NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var3 = module0178.f11334(var1);
        SubLObject var4 = (SubLObject)module0246.NIL;
        SubLObject var5 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0246.$ic3$, var2);
            module0147.$g2095$.bind(module0246.$ic4$, var2);
            var4 = Types.sublisp_null(module0259.f16821(var3, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var6, var2);
            module0147.$g2094$.rebind(var5, var2);
        }
        if (module0246.NIL != var4) {
            var5 = module0110.$g1374$.currentBinding(var2);
            try {
                module0110.$g1374$.bind((SubLObject)module0246.T, var2);
                module0259.f16969(var3);
            }
            finally {
                module0110.$g1374$.rebind(var5, var2);
            }
        }
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15864(final SubLObject var7) {
        return module0226.f15014(module0205.f13276(var7), (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
    }
    
    public static SubLObject f15865(final SubLObject var7) {
        return module0226.f14990(module0205.f13276(var7), (SubLObject)module0246.UNPROVIDED);
    }
    
    public static SubLObject f15866(final SubLObject var7) {
        return module0226.f14993(module0205.f13276(var7), (SubLObject)module0246.UNPROVIDED);
    }
    
    public static SubLObject f15867(final SubLObject var7) {
        return module0226.f14996(module0205.f13276(var7), (SubLObject)module0246.UNPROVIDED);
    }
    
    public static SubLObject f15868(final SubLObject var7) {
        final SubLObject var8 = module0205.f13276(var7);
        if (var8.eql(module0246.$ic5$)) {
            return module0161.f10522(var7);
        }
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15869(final SubLObject var7, final SubLObject var9, final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (var10.eql((SubLObject)module0246.$ic6$)) {
            return f15870(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic7$)) {
            return f15871(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic8$)) {
            return f15872(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic9$)) {
            return f15873(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic10$)) {
            return f15874(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic11$)) {
            return f15875(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic12$)) {
            return f15876(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic13$)) {
            return f15877(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic14$)) {
            return f15878(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic15$)) {
            return f15879(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic16$)) {
            return f15880(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic17$)) {
            return f15881(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic18$)) {
            return f15882(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic19$)) {
            return f15883(var7, var9);
        }
        return module0191.f11990(module0244.f15790(module0137.f8917(module0141.$g1670$.getDynamicValue(var11))), (SubLObject)ConsesLow.list(module0137.f8917(module0141.$g1670$.getDynamicValue(var11)), var7, var9), module0147.$g2095$.getDynamicValue(var11), module0250.f16103(module0141.$g1714$.getDynamicValue(var11)));
    }
    
    public static SubLObject f15870(final SubLObject var7, final SubLObject var9) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic20$, module0205.f13276(var7), var9), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15871(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0226.f15023(var7, var9, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic22$, module0205.f13276(var7), var10.first()), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15872(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0226.f15028(var7, var9, (SubLObject)module0246.UNPROVIDED).first();
        final SubLObject var11 = var10.first();
        final SubLObject var12 = conses_high.second(var10);
        final SubLObject var13 = conses_high.third(var10);
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic23$, module0205.f13276(var7), var11, var12, var13), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15873(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0226.f15029(var7, var9, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED).first();
        final SubLObject var11 = var10.first().first();
        final SubLObject var12 = conses_high.second(var10);
        final SubLObject var13 = module0205.f13136(var11);
        final SubLObject var14 = conses_high.third(var10);
        final SubLObject var15 = conses_high.fourth(var10);
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic24$, module0205.f13276(var7), var12, var13, var14, var15), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15874(final SubLObject var7, final SubLObject var9) {
        return f15871(var7, var9);
    }
    
    public static SubLObject f15875(final SubLObject var7, final SubLObject var9) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic25$, module0205.f13276(var7), var9), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15876(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0226.f15024(var7, var9, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic26$, module0205.f13276(var7), var10.first()), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15877(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0226.f15026(var7, var9, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED).first();
        final SubLObject var11 = var10.first();
        final SubLObject var12 = conses_high.second(var10);
        final SubLObject var13 = conses_high.third(var10);
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic27$, module0205.f13276(var7), var11, var12, var13), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15878(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0226.f15027(var7, var9, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED).first();
        final SubLObject var11 = var10.first().first();
        final SubLObject var12 = conses_high.second(var10);
        final SubLObject var13 = module0205.f13136(var11);
        final SubLObject var14 = conses_high.third(var10);
        final SubLObject var15 = conses_high.fourth(var10);
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic28$, module0205.f13276(var7), var12, var13, var14, var15), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15880(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0226.f15025(var7, var9, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
        final SubLObject var11 = var10.first();
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic29$, module0205.f13276(var7), var11), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15881(final SubLObject var7, final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0246.NIL;
        var10 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic30$, var9, module0205.f13276(var7)), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
        return var10;
    }
    
    public static SubLObject f15879(final SubLObject var7, final SubLObject var9) {
        return f15876(var7, var9);
    }
    
    public static SubLObject f15882(final SubLObject var7, final SubLObject var9) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic31$, module0205.f13276(var7), var9), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15883(final SubLObject var7, final SubLObject var9) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0246.$ic32$, module0205.f13276(var7), var9), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$);
    }
    
    public static SubLObject f15884(final SubLObject var7, final SubLObject var9, final SubLObject var10) {
        if (var10.eql((SubLObject)module0246.$ic33$)) {
            return f15885(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic7$)) {
            return f15886(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic8$)) {
            return f15887(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic9$)) {
            return f15888(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic10$)) {
            return f15889(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic34$)) {
            return f15890(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic12$)) {
            return f15891(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic13$)) {
            return f15892(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic14$)) {
            return f15893(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic15$)) {
            return f15894(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic16$)) {
            return f15895(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic17$)) {
            return f15896(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic35$)) {
            return f15897(var7, var9);
        }
        if (var10.eql((SubLObject)module0246.$ic36$)) {
            return f15898(var7, var9);
        }
        module0136.f8870((SubLObject)module0246.ONE_INTEGER, (SubLObject)module0246.$ic37$, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15885(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0205.f13276(var7);
        if (module0246.NIL != module0173.f10955(var10)) {
            return module0217.f14428((SubLObject)ConsesLow.list(module0246.$ic20$, var7, var9));
        }
        if (module0246.NIL != module0279.f18541(var10)) {
            return f15885(module0202.f12786(module0172.f10921(var10), module0205.f13304(var7, (SubLObject)module0246.UNPROVIDED)), var9);
        }
        if (module0246.NIL != module0155.f9779(var10, Symbols.symbol_function((SubLObject)module0246.$ic38$), (SubLObject)module0246.UNPROVIDED)) {
            module0253.f16389();
            return (SubLObject)module0246.NIL;
        }
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15886(final SubLObject var7, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0205.f13276(var7);
        SubLObject var12 = (SubLObject)module0246.NIL;
        if (module0246.NIL != module0173.f10955(var11)) {
            final SubLObject var13 = module0147.$g2094$.currentBinding(var10);
            final SubLObject var14 = module0147.$g2095$.currentBinding(var10);
            try {
                module0147.$g2094$.bind((SubLObject)module0246.$ic3$, var10);
                module0147.$g2095$.bind(module0246.$ic4$, var10);
                SubLObject var15 = module0220.f14562(var11, module0246.$ic22$, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
                SubLObject var16 = (SubLObject)module0246.NIL;
                var16 = var15.first();
                while (module0246.NIL != var15) {
                    if (var16.isInteger() && module0205.f13362(var7, var16, (SubLObject)module0246.UNPROVIDED).equal(var9)) {
                        var12 = ConsesLow.nconc(module0217.f14428((SubLObject)ConsesLow.list(module0246.$ic22$, var11, var16)), var12);
                    }
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var14, var10);
                module0147.$g2094$.rebind(var13, var10);
            }
        }
        else if (module0246.NIL != module0279.f18541(var11)) {
            var12 = f15886(module0202.f12786(module0172.f10921(var11), module0205.f13304(var7, (SubLObject)module0246.UNPROVIDED)), var9);
        }
        else if (module0246.NIL != module0155.f9779(var11, Symbols.symbol_function((SubLObject)module0246.$ic38$), (SubLObject)module0246.UNPROVIDED)) {
            module0253.f16389();
        }
        return var12;
    }
    
    public static SubLObject f15889(final SubLObject var7, final SubLObject var9) {
        module0253.f16389();
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15887(final SubLObject var7, final SubLObject var9) {
        module0253.f16389();
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15888(final SubLObject var7, final SubLObject var9) {
        module0253.f16389();
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15890(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0205.f13276(var7);
        if (module0246.NIL != module0173.f10955(var10)) {
            return module0217.f14428((SubLObject)ConsesLow.list(module0246.$ic25$, var7, var9));
        }
        if (module0246.NIL != module0279.f18541(var10)) {
            return f15890(module0202.f12786(module0172.f10921(var10), module0205.f13304(var7, (SubLObject)module0246.UNPROVIDED)), var9);
        }
        if (module0246.NIL != module0155.f9779(var10, Symbols.symbol_function((SubLObject)module0246.$ic38$), (SubLObject)module0246.UNPROVIDED)) {
            module0253.f16389();
            return (SubLObject)module0246.NIL;
        }
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15891(final SubLObject var7, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0205.f13276(var7);
        SubLObject var12 = (SubLObject)module0246.NIL;
        if (module0246.NIL != module0173.f10955(var11)) {
            final SubLObject var13 = module0147.$g2094$.currentBinding(var10);
            final SubLObject var14 = module0147.$g2095$.currentBinding(var10);
            try {
                module0147.$g2094$.bind((SubLObject)module0246.$ic3$, var10);
                module0147.$g2095$.bind(module0246.$ic4$, var10);
                SubLObject var15 = module0220.f14562(var11, module0246.$ic26$, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
                SubLObject var16 = (SubLObject)module0246.NIL;
                var16 = var15.first();
                while (module0246.NIL != var15) {
                    if (var16.isInteger() && module0205.f13362(var7, var16, (SubLObject)module0246.UNPROVIDED).equal(var9)) {
                        var12 = ConsesLow.nconc(module0217.f14428((SubLObject)ConsesLow.list(module0246.$ic26$, var11, var16)), var12);
                    }
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var14, var10);
                module0147.$g2094$.rebind(var13, var10);
            }
        }
        else if (module0246.NIL != module0279.f18541(var11)) {
            var12 = f15891(module0202.f12786(module0172.f10921(var11), module0205.f13304(var7, (SubLObject)module0246.UNPROVIDED)), var9);
        }
        else if (module0246.NIL != module0155.f9779(var11, Symbols.symbol_function((SubLObject)module0246.$ic38$), (SubLObject)module0246.UNPROVIDED)) {
            module0253.f16389();
        }
        return var12;
    }
    
    public static SubLObject f15894(final SubLObject var7, final SubLObject var9) {
        module0253.f16389();
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15892(final SubLObject var7, final SubLObject var9) {
        module0253.f16389();
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15893(final SubLObject var7, final SubLObject var9) {
        module0253.f16389();
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15895(final SubLObject var7, final SubLObject var9) {
        module0253.f16389();
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15896(final SubLObject var7, final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0246.NIL;
        SubLObject var11 = (SubLObject)module0246.NIL;
        SubLObject var12 = module0205.f13304(var7, (SubLObject)module0246.UNPROVIDED);
        SubLObject var13 = (SubLObject)module0246.NIL;
        var13 = var12.first();
        while (module0246.NIL != var12) {
            var10 = ConsesLow.nconc(module0259.f16932(var13, var9, (SubLObject)module0246.UNPROVIDED), var10);
            var12 = var12.rest();
            var13 = var12.first();
        }
        var10 = module0262.f17370(var10, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
        SubLObject var15;
        final SubLObject var14 = var15 = module0217.f14425((SubLObject)ConsesLow.list(module0246.$ic30$, var9, module0205.f13276(var7), (SubLObject)module0246.NIL, (SubLObject)module0246.$ic21$));
        SubLObject var16 = (SubLObject)module0246.NIL;
        var16 = var15.first();
        while (module0246.NIL != var15) {
            final SubLObject var17 = module0178.f11287(var16);
            var11 = ConsesLow.nconc(module0262.f17370((SubLObject)ConsesLow.cons(var17, var10), (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED), var11);
            var15 = var15.rest();
            var16 = var15.first();
        }
        return module0035.f2269(var11, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED, (SubLObject)module0246.UNPROVIDED);
    }
    
    public static SubLObject f15897(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0205.f13276(var7);
        if (module0246.NIL != module0173.f10955(var10)) {
            return module0217.f14428((SubLObject)ConsesLow.list(module0246.$ic31$, var7, var9));
        }
        if (module0246.NIL != module0279.f18541(var10)) {
            return f15897(module0202.f12786(module0172.f10921(var10), module0205.f13304(var7, (SubLObject)module0246.UNPROVIDED)), var9);
        }
        if (module0246.NIL != module0155.f9779(var10, Symbols.symbol_function((SubLObject)module0246.$ic38$), (SubLObject)module0246.UNPROVIDED)) {
            module0253.f16389();
            return (SubLObject)module0246.NIL;
        }
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15898(final SubLObject var7, final SubLObject var9) {
        final SubLObject var10 = module0205.f13276(var7);
        if (module0246.NIL != module0173.f10955(var10)) {
            return module0217.f14428((SubLObject)ConsesLow.list(module0246.$ic32$, var7, var9));
        }
        if (module0246.NIL != module0279.f18541(var10)) {
            return f15898(module0202.f12786(module0172.f10921(var10), module0205.f13304(var7, (SubLObject)module0246.UNPROVIDED)), var9);
        }
        if (module0246.NIL != module0155.f9779(var10, Symbols.symbol_function((SubLObject)module0246.$ic38$), (SubLObject)module0246.UNPROVIDED)) {
            module0253.f16389();
            return (SubLObject)module0246.NIL;
        }
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15899() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15862", "S#18608", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15863", "S#18609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15864", "S#18610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15865", "S#18611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15866", "S#18612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15867", "S#18613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15868", "S#18614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15869", "S#18615", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15870", "S#18616", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15871", "S#18617", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15872", "S#18618", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15873", "S#18619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15874", "S#18620", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15875", "S#18621", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15876", "S#18622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15877", "S#18623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15878", "S#18624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15880", "S#18625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15881", "S#18626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15879", "S#18627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15882", "S#18628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15883", "S#18629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15884", "S#18630", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15885", "S#18631", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15886", "S#18632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15889", "S#18633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15887", "S#18634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15888", "S#18635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15890", "S#18636", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15891", "S#18637", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15894", "S#18638", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15892", "S#18639", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15893", "S#18640", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15895", "S#18641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15896", "S#18642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15897", "S#18643", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0246", "f15898", "S#18644", 2, 0, false);
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15900() {
        return (SubLObject)module0246.NIL;
    }
    
    public static SubLObject f15901() {
        return (SubLObject)module0246.NIL;
    }
    
    public void declareFunctions() {
        f15899();
    }
    
    public void initializeVariables() {
        f15900();
    }
    
    public void runTopLevelForms() {
        f15901();
    }
    
    static {
        me = (SubLFile)new module0246();
        $ic0$ = SubLObjectFactory.makeSymbol("S#18609", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic2$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic3$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#18610", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#17786", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#17788", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-GENL-RELN");
        $ic10$ = SubLObjectFactory.makeSymbol("S#17787", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#18611", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#17778", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#17781", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-ISA-RELN");
        $ic15$ = SubLObjectFactory.makeSymbol("S#17777", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#17779", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#17780", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#18612", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#18613", "CYC");
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultGenl"));
        $ic21$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultGenlArg"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgResultGenl"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgResultGenlReln"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultIsaArg"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgResultIsa"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgResultIsaReln"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultIsaArgIsa"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("closedUnder"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("evaluationResultQuotedIsa"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultQuotedIsa"));
        $ic33$ = SubLObjectFactory.makeSymbol("RESULT-GENL");
        $ic34$ = SubLObjectFactory.makeSymbol("RESULT-ISA");
        $ic35$ = SubLObjectFactory.makeSymbol("EVALUATION-RESULT-QUOTED-ISA");
        $ic36$ = SubLObjectFactory.makeSymbol("RESULT-QUOTED-ISA");
        $ic37$ = SubLObjectFactory.makeString("~a is not a supported NAUT link generator");
        $ic38$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0246.class
	Total time: 208 ms
	
	Decompiled with Procyon 0.5.32.
*/