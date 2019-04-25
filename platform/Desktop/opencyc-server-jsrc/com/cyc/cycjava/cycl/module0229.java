package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0229 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0229";
    public static final String myFingerPrint = "4db4c45c2431fee6e5d829f2009a66d3ccdecb684c26b6601cc2260787ab4eb2";
    private static SubLSymbol $g2420$;
    private static SubLSymbol $g2421$;
    public static SubLSymbol $g2422$;
    private static SubLSymbol $g2423$;
    private static SubLSymbol $g2424$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
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
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    
    public static SubLObject f15234(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean((module0229.NIL != module0173.f10955(var1) && module0229.NIL != module0269.f17770(var1)) || module0229.NIL != f15235(var1) || module0229.NIL != module0202.f12899(var1));
    }
    
    public static SubLObject f15236(final SubLObject var2, SubLObject var3) {
        if (var3 == module0229.UNPROVIDED) {
            var3 = (SubLObject)module0229.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0229.NIL != module0173.f10955(var2) && module0229.NIL != module0269.f17772(var2, var3));
    }
    
    public static SubLObject f15237(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0229.NIL;
        final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind((SubLObject)module0229.$ic0$, var5);
            module0147.$g2095$.bind(module0229.$ic1$, var5);
            var6 = (SubLObject)SubLObjectFactory.makeBoolean(module0229.NIL != f15234(var4) || module0229.NIL != f15236(var4, (SubLObject)module0229.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var8, var5);
            module0147.$g2094$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f15238(final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0229.NIL != module0202.f12590(var9) && module0229.NIL != module0351.f23583(var9) && module0229.NIL != f15237(module0205.f13136(var9)));
    }
    
    public static SubLObject f15239(final SubLObject var10, SubLObject var3) {
        if (var3 == module0229.UNPROVIDED) {
            var3 = (SubLObject)module0229.NIL;
        }
        return module0202.f12757(module0220.f14557(var10, module0229.$ic2$, var3, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED));
    }
    
    public static SubLObject f15240() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return module0229.$g2420$.getDynamicValue(var5);
    }
    
    public static SubLObject f15241(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        assert module0229.NIL != module0191.f11950(var11) : var11;
        if (module0229.NIL != module0229.$g2420$.getDynamicValue(var12) && module0229.NIL == conses_high.member(var11, module0229.$g2421$.getDynamicValue(var12), (SubLObject)module0229.$ic4$, Symbols.symbol_function((SubLObject)module0229.IDENTITY))) {
            module0229.$g2421$.setDynamicValue((SubLObject)ConsesLow.cons(var11, module0229.$g2421$.getDynamicValue(var12)), var12);
        }
        return var11;
    }
    
    public static SubLObject f15242(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0229.NIL;
        final SubLObject var16 = module0229.$g2420$.currentBinding(var14);
        final SubLObject var17 = module0229.$g2421$.currentBinding(var14);
        try {
            module0229.$g2420$.bind((SubLObject)module0229.T, var14);
            module0229.$g2421$.bind((SubLObject)module0229.NIL, var14);
            var14.resetMultipleValues();
            final SubLObject var18 = f15243(var13);
            final SubLObject var19 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (module0229.NIL != var19) {
                var15 = Sequences.nreverse(module0229.$g2421$.getDynamicValue(var14));
            }
        }
        finally {
            module0229.$g2421$.rebind(var17, var14);
            module0229.$g2420$.rebind(var16, var14);
        }
        return var15;
    }
    
    public static SubLObject f15244(final SubLObject var16, final SubLObject var17) {
        if (module0229.NIL != f15240()) {
            final SubLObject var18 = module0466.f31514(var16, var17);
            final SubLObject var19 = module0438.f30664(var18, (SubLObject)module0229.UNPROVIDED);
            f15241(var19);
            return (SubLObject)module0229.T;
        }
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15245(final SubLObject var6, final SubLObject var4, final SubLObject var19) {
        if (module0229.NIL != f15240()) {
            final SubLObject var20 = module0202.f12720(var4, var19, (SubLObject)module0229.UNPROVIDED);
            final SubLObject var21 = (module0229.NIL != f15234(var4)) ? module0466.f31514(var6, var20) : var20;
            final SubLObject var22 = module0438.f30664(var21, (SubLObject)module0229.UNPROVIDED);
            f15241(var22);
            return (SubLObject)module0229.T;
        }
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15246(final SubLObject var6, final SubLObject var20) {
        if (module0229.NIL != f15240()) {
            final SubLObject var21 = module0205.f13136(var20);
            final SubLObject var22 = (module0229.NIL != f15234(var21)) ? module0466.f31514(var6, var20) : var20;
            final SubLObject var23 = module0438.f30664(var22, (SubLObject)module0229.UNPROVIDED);
            f15241(var23);
            return (SubLObject)module0229.T;
        }
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15247(final SubLObject var21, final SubLObject var20, final SubLObject var3) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        if (module0229.NIL != f15240()) {
            var22.resetMultipleValues();
            final SubLObject var23 = module0278.f18412(var21, var3);
            final SubLObject var24 = var22.secondMultipleValue();
            final SubLObject var25 = var22.thirdMultipleValue();
            var22.resetMultipleValues();
            if (var23.equal(var20)) {
                SubLObject var26 = var25;
                SubLObject var27 = (SubLObject)module0229.NIL;
                var27 = var26.first();
                while (module0229.NIL != var26) {
                    f15241(var27);
                    var26 = var26.rest();
                    var27 = var26.first();
                }
                return (SubLObject)module0229.T;
            }
        }
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15248(final SubLObject var4, final SubLObject var25) {
        if (module0229.NIL != f15240()) {
            final SubLObject var26 = module0220.f14572(module0229.$ic2$, var4, var25, (SubLObject)module0229.ONE_INTEGER, (SubLObject)module0229.TWO_INTEGER, (SubLObject)module0229.$ic5$);
            final SubLObject var27 = var26.first();
            if (module0229.NIL != var27) {
                f15241(var27);
                return (SubLObject)module0229.T;
            }
        }
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15249(final SubLObject var27, final SubLObject var28) {
        final SubLObject var29 = var27.rest();
        final SubLObject var31;
        final SubLObject var30 = var31 = var29;
        final SubLObject var32 = (SubLObject)module0229.$ic7$;
        return (SubLObject)ConsesLow.list((SubLObject)module0229.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var32)), (SubLObject)ConsesLow.listS((SubLObject)module0229.$ic9$, (SubLObject)module0229.$ic10$, var32, ConsesLow.append(var31, (SubLObject)module0229.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0229.$ic11$, var32));
    }
    
    public static SubLObject f15250(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0229.NIL == module0229.$g2423$.getDynamicValue(var5)) {
            module0229.$g2423$.setDynamicValue(module0269.f17834(var4), var5);
        }
        return module0229.$g2423$.getDynamicValue(var5);
    }
    
    public static SubLObject f15243(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0229.NIL;
        SubLObject var16 = (SubLObject)module0229.NIL;
        SubLObject var17 = (SubLObject)module0229.NIL;
        final SubLObject var18 = module0229.$g2423$.currentBinding(var14);
        try {
            module0229.$g2423$.bind((SubLObject)module0229.NIL, var14);
            try {
                var14.throwStack.push(module0229.$ic10$);
                var15 = f15251(var13, (SubLObject)module0229.T);
                var17 = module0035.sublisp_boolean(module0229.$g2423$.getDynamicValue(var14));
            }
            catch (Throwable var19) {
                var16 = Errors.handleThrowable(var19, (SubLObject)module0229.$ic10$);
            }
            finally {
                var14.throwStack.pop();
            }
        }
        finally {
            module0229.$g2423$.rebind(var18, var14);
        }
        if (module0229.NIL == module0206.f13433(var13) && module0229.NIL != var16 && module0229.NIL != f15252(var13)) {
            var15 = f15253(var13);
            var17 = module0035.sublisp_boolean(module0229.$g2423$.getDynamicValue(var14));
            var16 = (SubLObject)module0229.NIL;
        }
        if (module0229.NIL != var16) {
            return f15254();
        }
        return f15255(var15, var17);
    }
    
    public static SubLObject f15252(final SubLObject var13) {
        return module0205.f13145((SubLObject)module0229.$ic12$, var13, (SubLObject)module0229.NIL, (SubLObject)module0229.UNPROVIDED);
    }
    
    public static SubLObject f15256(final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0229.NIL != module0173.f10955(var9) && module0229.NIL != module0269.f17698(var9, module0229.$ic13$, module0132.$g1555$.getGlobalValue()));
    }
    
    public static SubLObject f15253(final SubLObject var13) {
        return module0285.f18875(var13, (SubLObject)module0229.UNPROVIDED);
    }
    
    public static SubLObject f15257(final SubLObject var1, final SubLObject var37, SubLObject var38) {
        if (var38 == module0229.UNPROVIDED) {
            var38 = (SubLObject)module0229.NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)module0229.NIL;
        SubLObject var41 = (SubLObject)module0229.NIL;
        SubLObject var42 = var37;
        SubLObject var43 = (SubLObject)module0229.NIL;
        var43 = var42.first();
        while (module0229.NIL != var42) {
            var39.resetMultipleValues();
            final SubLObject var44 = f15243((SubLObject)ConsesLow.list(var1, var43));
            final SubLObject var45 = var39.secondMultipleValue();
            final SubLObject var46 = var39.thirdMultipleValue();
            var39.resetMultipleValues();
            if (module0229.NIL != var45) {
                var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var43, var44), var40);
                if (module0229.NIL != var46) {
                    var41 = (SubLObject)module0229.T;
                }
            }
            else if (module0229.NIL == var38) {
                return f15254();
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        return f15255(Sequences.nreverse(var40), var41);
    }
    
    public static SubLObject f15258(final SubLObject var42, final SubLObject var2, SubLObject var43, SubLObject var35) {
        if (var43 == module0229.UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)module0229.IDENTITY);
        }
        if (var35 == module0229.UNPROVIDED) {
            var35 = (SubLObject)module0229.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0229.NIL;
        SubLObject var46 = (SubLObject)module0229.NIL;
        try {
            var44.throwStack.push(module0229.$ic10$);
            var45 = Sort.sort(var42, var2, var43);
        }
        catch (Throwable var47) {
            var46 = Errors.handleThrowable(var47, (SubLObject)module0229.$ic10$);
        }
        finally {
            var44.throwStack.pop();
        }
        if (module0229.NIL != var46) {
            return f15254();
        }
        return f15255(var45, var35);
    }
    
    public static SubLObject f15259() {
        Dynamic.sublisp_throw((SubLObject)module0229.$ic10$, (SubLObject)module0229.T);
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15255(final SubLObject var33, final SubLObject var35) {
        return Values.values(var33, (SubLObject)module0229.T, var35);
    }
    
    public static SubLObject f15254() {
        return Values.values((SubLObject)module0229.NIL, (SubLObject)module0229.NIL, (SubLObject)module0229.NIL);
    }
    
    public static SubLObject f15251(final SubLObject var44, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        final SubLObject var47 = module0205.f13136(var44);
        if (module0229.NIL == f15237(var47)) {
            f15259();
        }
        final SubLObject var48 = f15260(var47);
        if (module0229.NIL == module0112.f7693(var48) && (module0229.NIL == var45 || module0229.NIL == module0279.f18530(var47, (SubLObject)module0229.UNPROVIDED))) {
            f15259();
        }
        final SubLObject var49 = module0205.f13207(var44, (SubLObject)module0229.UNPROVIDED);
        final SubLObject var50 = f15261(var49);
        SubLObject var51 = (SubLObject)module0229.NIL;
        f15250(var47);
        if (module0229.NIL != module0112.f7693(var48)) {
            final SubLObject var52 = module0229.$g2422$.currentBinding(var46);
            try {
                module0229.$g2422$.bind(var47, var46);
                final SubLObject var53 = f15262(var47);
                if (module0229.NIL == var53) {
                    var51 = module0112.f7695(var48, var50);
                }
                else {
                    if (!var53.numE(Sequences.length(var50))) {
                        f15259();
                    }
                    var51 = module0112.f7692(var48, var50);
                }
            }
            finally {
                module0229.$g2422$.rebind(var52, var46);
            }
            if (var49.equal(var50)) {
                f15248(var47, var48);
            }
            else {
                f15245(var51, var47, var50);
            }
            return var51;
        }
        final SubLObject var54 = module0278.f18398(var44, module0147.$g2095$.getDynamicValue(var46));
        if (module0229.$ic15$ == var54 || var54.equal(var44)) {
            f15259();
        }
        SubLObject var33_48 = (SubLObject)module0229.NIL;
        var33_48 = f15263(var54, (SubLObject)module0229.NIL);
        f15246(var33_48, var54);
        f15247(var44, var54, module0147.$g2095$.getDynamicValue(var46));
        return var33_48;
    }
    
    public static SubLObject f15261(final SubLObject var19) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0229.$ic16$), var19);
    }
    
    public static SubLObject f15264(final SubLObject var17) {
        return f15263(var17, (SubLObject)module0229.T);
    }
    
    public static SubLObject f15263(final SubLObject var13, SubLObject var45) {
        if (var45 == module0229.UNPROVIDED) {
            var45 = (SubLObject)module0229.NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        if (module0229.NIL == f15238(var13)) {
            return var13;
        }
        SubLObject var47 = (SubLObject)module0229.NIL;
        final SubLObject var48 = module0229.$g2420$.currentBinding(var46);
        try {
            module0229.$g2420$.bind((SubLObject)module0229.NIL, var46);
            var47 = f15251(var13, var45);
        }
        finally {
            module0229.$g2420$.rebind(var48, var46);
        }
        f15244(var47, var13);
        return var47;
    }
    
    public static SubLObject f15260(final SubLObject var4) {
        if (module0229.NIL != module0173.f10955(var4)) {
            return f15265(var4);
        }
        if (module0229.NIL != f15235(var4)) {
            return (SubLObject)module0229.$ic17$;
        }
        if (module0229.NIL != module0202.f12899(var4)) {
            return (SubLObject)module0229.$ic18$;
        }
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15262(final SubLObject var4) {
        if (module0229.NIL != module0173.f10955(var4)) {
            return module0225.f14739(var4);
        }
        if (module0229.NIL != f15235(var4)) {
            final SubLObject var5 = module0205.f13368(var4, (SubLObject)module0229.UNPROVIDED);
            if (module0229.NIL != module0173.f10955(var5)) {
                final SubLObject var6 = module0225.f14739(var5);
                if (var6.isInteger() && var6.numG((SubLObject)module0229.ZERO_INTEGER)) {
                    return Numbers.subtract(var6, (SubLObject)module0229.ONE_INTEGER);
                }
            }
            else {
                if (module0229.NIL == module0202.f12895(var5)) {
                    return (SubLObject)module0229.NIL;
                }
                final SubLObject var6 = module0202.f12897(var5);
                if (var6.isInteger() && var6.numG((SubLObject)module0229.ZERO_INTEGER)) {
                    return Numbers.subtract(var6, (SubLObject)module0229.ONE_INTEGER);
                }
            }
            return (SubLObject)module0229.NIL;
        }
        if (module0229.NIL != module0202.f12899(var4)) {
            return module0202.f12901(var4);
        }
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15266() {
        final SubLObject var52 = module0229.$g2424$.getGlobalValue();
        if (module0229.NIL != var52) {
            module0034.f1818(var52);
        }
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15267(final SubLObject var4) {
        return module0034.f1829(module0229.$g2424$.getGlobalValue(), (SubLObject)ConsesLow.list(var4), (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED);
    }
    
    public static SubLObject f15268(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0229.NIL;
        final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind((SubLObject)module0229.$ic0$, var5);
            module0147.$g2095$.bind(module0229.$ic1$, var5);
            var6 = f15239(var4, (SubLObject)module0229.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var8, var5);
            module0147.$g2094$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f15265(final SubLObject var4) {
        SubLObject var5 = module0229.$g2424$.getGlobalValue();
        if (module0229.NIL == var5) {
            var5 = module0034.f1934((SubLObject)module0229.$ic19$, (SubLObject)module0229.$ic20$, (SubLObject)module0229.NIL, (SubLObject)module0229.EQL, (SubLObject)module0229.ONE_INTEGER, (SubLObject)module0229.TEN_INTEGER);
            module0034.f1940((SubLObject)module0229.$ic21$);
        }
        SubLObject var6 = module0034.f1814(var5, var4, (SubLObject)module0229.$ic22$);
        if (var6 == module0229.$ic22$) {
            var6 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f15268(var4)));
            module0034.f1816(var5, var4, var6, (SubLObject)module0229.UNPROVIDED);
        }
        return module0034.f1959(var6);
    }
    
    public static SubLObject f15235(final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0229.NIL != module0202.f12589(var9, module0229.$ic23$) && module0229.NIL != module0202.f12734(var9, (SubLObject)module0229.TWO_INTEGER, (SubLObject)module0229.UNPROVIDED) && module0205.f13277(var9, (SubLObject)module0229.UNPROVIDED).isInteger() && (module0229.NIL != module0173.f10955(module0205.f13368(var9, (SubLObject)module0229.UNPROVIDED)) || module0229.NIL != module0202.f12895(module0205.f13368(var9, (SubLObject)module0229.UNPROVIDED))));
    }
    
    public static SubLObject f15269(SubLObject var49, SubLObject var55, SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var59) {
        if (var49 == module0229.UNPROVIDED) {
            var49 = (SubLObject)module0229.NIL;
        }
        if (var55 == module0229.UNPROVIDED) {
            var55 = (SubLObject)module0229.NIL;
        }
        if (var56 == module0229.UNPROVIDED) {
            var56 = (SubLObject)module0229.NIL;
        }
        if (var57 == module0229.UNPROVIDED) {
            var57 = (SubLObject)module0229.NIL;
        }
        if (var58 == module0229.UNPROVIDED) {
            var58 = (SubLObject)module0229.NIL;
        }
        if (var59 == module0229.UNPROVIDED) {
            var59 = (SubLObject)module0229.NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = module0205.f13277(module0229.$g2422$.getDynamicValue(var60), (SubLObject)module0229.UNPROVIDED);
        final SubLObject var62 = module0205.f13368(module0229.$g2422$.getDynamicValue(var60), (SubLObject)module0229.UNPROVIDED);
        if (!var61.isInteger()) {
            f15259();
        }
        final SubLObject var63 = Sequences.delete((SubLObject)module0229.NIL, (SubLObject)ConsesLow.list(var49, var55, var56, var57, var58, var59), (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED);
        if (module0229.NIL != module0173.f10955(var62)) {
            final SubLObject var64 = module0202.f12720(var62, var63, (SubLObject)module0229.UNPROVIDED);
            final SubLObject var65 = conses_high.nthcdr(Numbers.subtract(var61, (SubLObject)module0229.ONE_INTEGER), var64);
            final SubLObject var66 = (SubLObject)module0229.$ic24$;
            ConsesLow.rplacd(var65, (SubLObject)ConsesLow.cons(var66, var65.rest()));
            final SubLObject var67 = f15270(var64, module0147.$g2095$.getDynamicValue(var60));
            if (module0229.NIL == var67) {
                f15259();
            }
            return module0233.f15370(var67.first().first());
        }
        if (module0229.NIL != module0202.f12895(var62)) {
            SubLObject var68 = module0202.f12898(var62);
            final SubLObject var69 = module0202.f12896(var62);
            final SubLObject var70 = ConsesLow.nth(Numbers.subtract(var61, (SubLObject)module0229.ONE_INTEGER), var69);
            final SubLObject var71 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0229.$ic25$), Sequences.remove(var70, var69, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED), new SubLObject[] { var63 });
            var68 = module0233.f15362(var71, var68);
            final SubLObject var72 = f15270(var68, module0147.$g2095$.getDynamicValue(var60));
            if (module0229.NIL == var72) {
                f15259();
            }
            return module0233.f15370(var72.first().first());
        }
        f15259();
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15270(final SubLObject var62, final SubLObject var3) {
        SubLObject var63 = module0349.f23492(var62, var3);
        var63 = conses_high.putf(var63, (SubLObject)module0229.$ic26$, (SubLObject)module0229.ONE_INTEGER);
        var63 = conses_high.putf(var63, (SubLObject)module0229.$ic27$, (SubLObject)module0229.T);
        var63 = conses_high.putf(var63, (SubLObject)module0229.$ic28$, (SubLObject)module0229.$ic29$);
        return module0434.f30594(var62, var3, var63);
    }
    
    public static SubLObject f15271(SubLObject var49, SubLObject var55, SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var59) {
        if (var49 == module0229.UNPROVIDED) {
            var49 = (SubLObject)module0229.NIL;
        }
        if (var55 == module0229.UNPROVIDED) {
            var55 = (SubLObject)module0229.NIL;
        }
        if (var56 == module0229.UNPROVIDED) {
            var56 = (SubLObject)module0229.NIL;
        }
        if (var57 == module0229.UNPROVIDED) {
            var57 = (SubLObject)module0229.NIL;
        }
        if (var58 == module0229.UNPROVIDED) {
            var58 = (SubLObject)module0229.NIL;
        }
        if (var59 == module0229.UNPROVIDED) {
            var59 = (SubLObject)module0229.NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = Sequences.delete((SubLObject)module0229.NIL, (SubLObject)ConsesLow.list(var49, var55, var56, var57, var58, var59), (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED, (SubLObject)module0229.UNPROVIDED);
        final SubLObject var62 = module0229.$g2422$.getDynamicValue(var60);
        final SubLObject var63 = module0202.f12900(var62);
        final SubLObject var64 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0229.$ic25$), var63, new SubLObject[] { var61 });
        final SubLObject var65 = module0202.f12902(var62);
        SubLObject var66 = module0233.f15362(var64, var65);
        if (module0229.NIL != f15238(var66)) {
            var60.resetMultipleValues();
            final SubLObject var67 = f15243(var66);
            final SubLObject var68 = var60.secondMultipleValue();
            var60.resetMultipleValues();
            if (module0229.NIL == var68) {
                f15259();
            }
            var66 = var67;
        }
        return var66;
    }
    
    public static SubLObject f15272() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15234", "S#15516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15236", "EVALUATABLE-PREDICATE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15237", "S#17996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15238", "S#17997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15239", "S#17998", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15240", "S#17999", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15241", "S#18000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15242", "S#18001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15244", "S#18002", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15245", "S#18003", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15246", "S#18004", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15247", "S#18005", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15248", "S#18006", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0229", "f15249", "S#18007");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15250", "S#18008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15243", "CYC-EVALUATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15252", "S#18009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15256", "S#18010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15253", "S#18011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15257", "S#18012", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15258", "S#18013", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15259", "THROW-UNEVALUATABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15255", "S#18014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15254", "S#18015", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15251", "S#18016", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15261", "S#18017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15264", "S#17991", 1, 0, false);
        new $f15264$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15263", "S#18018", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15260", "S#18019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15262", "S#18020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15266", "S#17992", 0, 0, false);
        new $f15266$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15267", "S#18021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15268", "S#18022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15265", "S#18023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15235", "S#18024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15269", "CYC-FUNCTION-TO-ARG", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15270", "S#18025", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0229", "f15271", "S#18026", 0, 6, false);
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15273() {
        module0229.$g2420$ = SubLFiles.defparameter("S#18027", (SubLObject)module0229.NIL);
        module0229.$g2421$ = SubLFiles.defparameter("S#18028", (SubLObject)module0229.NIL);
        module0229.$g2422$ = SubLFiles.defparameter("S#18029", (SubLObject)module0229.NIL);
        module0229.$g2423$ = SubLFiles.defparameter("S#18030", (SubLObject)module0229.$ic6$);
        module0229.$g2424$ = SubLFiles.deflexical("S#18031", (SubLObject)module0229.NIL);
        return (SubLObject)module0229.NIL;
    }
    
    public static SubLObject f15274() {
        module0012.f419((SubLObject)module0229.$ic12$);
        module0002.f38((SubLObject)module0229.$ic14$);
        module0034.f1909((SubLObject)module0229.$ic19$);
        return (SubLObject)module0229.NIL;
    }
    
    public void declareFunctions() {
        f15272();
    }
    
    public void initializeVariables() {
        f15273();
    }
    
    public void runTopLevelForms() {
        f15274();
    }
    
    static {
        me = (SubLFile)new module0229();
        module0229.$g2420$ = null;
        module0229.$g2421$ = null;
        module0229.$g2422$ = null;
        module0229.$g2423$ = null;
        module0229.$g2424$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("evaluationDefn"));
        $ic3$ = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $ic4$ = SubLObjectFactory.makeSymbol("S#14596", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic6$ = SubLObjectFactory.makeKeyword("UNBOUND");
        $ic7$ = SubLObjectFactory.makeUninternedSymbol("US#38432D4");
        $ic8$ = SubLObjectFactory.makeSymbol("CLET");
        $ic9$ = SubLObjectFactory.makeSymbol("CCATCH");
        $ic10$ = SubLObjectFactory.makeKeyword("UNEVALUATABLE");
        $ic11$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic12$ = SubLObjectFactory.makeSymbol("S#18010", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnknownScalarInterval"));
        $ic14$ = SubLObjectFactory.makeSymbol("THROW-UNEVALUATABLE");
        $ic15$ = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $ic16$ = SubLObjectFactory.makeSymbol("S#17991", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("CYC-FUNCTION-TO-ARG");
        $ic18$ = SubLObjectFactory.makeSymbol("S#18026", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#18023", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#18031", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#17992", "CYC");
        $ic22$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FunctionToArg"));
        $ic24$ = SubLObjectFactory.makeSymbol("?VALUE");
        $ic25$ = SubLObjectFactory.makeSymbol("S#14186", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic27$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic28$ = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $ic29$ = SubLObjectFactory.makeKeyword("HL");
    }
    
    public static final class $f15264$UnaryFunction extends UnaryFunction
    {
        public $f15264$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#17991"));
        }
        
        public SubLObject processItem(final SubLObject var49) {
            return module0229.f15264(var49);
        }
    }
    
    public static final class $f15266$ZeroArityFunction extends ZeroArityFunction
    {
        public $f15266$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#17992"));
        }
        
        public SubLObject processItem() {
            return module0229.f15266();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0229.class
	Total time: 229 ms
	
	Decompiled with Procyon 0.5.32.
*/