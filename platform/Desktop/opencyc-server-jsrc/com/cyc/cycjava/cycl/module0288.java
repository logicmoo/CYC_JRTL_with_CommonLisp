package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0288 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0288";
    public static final String myFingerPrint = "b4ba3d9694de41fae1f39aec4da017e6f96bc8b31b056c74e287ba6e85d7468b";
    private static SubLSymbol $g2645$;
    private static SubLSymbol $g2646$;
    private static SubLSymbol $g2647$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
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
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    
    public static SubLObject f19301(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0288.NIL;
        if (module0288.NIL == var2) {
            SubLObject var3 = module0211.f13701(var1);
            SubLObject var4 = (SubLObject)module0288.NIL;
            var4 = var3.first();
            while (module0288.NIL == var2 && module0288.NIL != var3) {
                if (module0288.NIL != module0202.f12648(module0289.f19396(var4))) {
                    var2 = (SubLObject)module0288.T;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return var2;
    }
    
    public static SubLObject f19302(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        if (module0288.NIL != module0202.f12903(var5)) {
            return f19303(module0202.f12887(var5), module0202.f12906(var5));
        }
        return f19304(var5, var6);
    }
    
    public static SubLObject f19305(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        final SubLObject var7 = f19302(var5, var6);
        if (module0288.NIL != var7) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == module0004.f104((SubLObject)module0288.NIL, var7, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED));
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19304(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0288.NIL;
        SubLObject var9 = (SubLObject)module0288.NIL;
        final SubLObject var10 = var6;
        final SubLObject var11 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var7);
        try {
            module0147.$g2094$.bind(module0147.f9531(var10), var7);
            module0147.$g2095$.bind(module0147.f9534(var10), var7);
            final SubLObject var11_13 = module0018.$g696$.currentBinding(var7);
            final SubLObject var12_14 = module0018.$g698$.currentBinding(var7);
            final SubLObject var13 = module0146.$g2050$.currentBinding(var7);
            try {
                module0018.$g696$.bind((SubLObject)module0288.NIL, var7);
                module0018.$g698$.bind((SubLObject)module0288.NIL, var7);
                module0146.$g2050$.bind((SubLObject)module0288.T, var7);
                var9 = module0285.f18874(var5, (SubLObject)module0288.UNPROVIDED);
            }
            finally {
                module0146.$g2050$.rebind(var13, var7);
                module0018.$g698$.rebind(var12_14, var7);
                module0018.$g696$.rebind(var11_13, var7);
            }
            if (var9.isCons()) {
                SubLObject var14 = var9;
                SubLObject var15 = (SubLObject)module0288.NIL;
                var15 = var14.first();
                while (module0288.NIL != var14) {
                    SubLObject var16 = (SubLObject)module0288.NIL;
                    var7.resetMultipleValues();
                    final SubLObject var17 = module0538.f33413(var15, (SubLObject)module0288.T, (SubLObject)module0288.UNPROVIDED);
                    final SubLObject var18 = var7.secondMultipleValue();
                    final SubLObject var19 = var7.thirdMultipleValue();
                    var7.resetMultipleValues();
                    if (module0288.NIL == module0232.f15306(var17) && module0288.NIL != module0035.f1997(module0232.f15308(var17)) && module0288.NIL != module0202.f12903(module0232.f15308(var17).first()) && module0288.NIL != module0161.f10481(module0202.f12906(module0232.f15308(var17).first()))) {
                        final SubLObject var20 = module0232.f15308(var17).first();
                        SubLObject var16_23 = f19303(module0202.f12887(var20), module0202.f12906(var20));
                        SubLObject var21 = (SubLObject)module0288.NIL;
                        var21 = var16_23.first();
                        while (module0288.NIL != var16_23) {
                            var16 = (SubLObject)ConsesLow.cons(var21, var16);
                            var16_23 = var16_23.rest();
                            var21 = var16_23.first();
                        }
                    }
                    else {
                        SubLObject var16_24 = module0217.f14420(var17);
                        SubLObject var22 = (SubLObject)module0288.NIL;
                        var22 = var16_24.first();
                        while (module0288.NIL != var16_24) {
                            if (module0288.NIL != module0147.f9507(module0178.f11287(var22))) {
                                var16 = (SubLObject)ConsesLow.cons(var22, var16);
                            }
                            var16_24 = var16_24.rest();
                            var22 = var16_24.first();
                        }
                    }
                    var8 = (SubLObject)ConsesLow.cons(var16, var8);
                    var14 = var14.rest();
                    var15 = var14.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var12, var7);
            module0147.$g2094$.rebind(var11, var7);
        }
        return var8;
    }
    
    public static SubLObject f19306(final SubLObject var25, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        if (module0288.NIL != module0274.f18060(var25, var6, (SubLObject)module0288.UNPROVIDED)) {
            return f19303(var25, var6);
        }
        if (module0288.NIL != module0210.f13593(var25, Symbols.symbol_function((SubLObject)module0288.$ic0$))) {
            return module0035.f2117(module0172.f10921(var25));
        }
        return (SubLObject)ConsesLow.list(var25);
    }
    
    public static SubLObject f19307(final SubLObject var22, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        SubLObject var23 = (SubLObject)module0288.ZERO_INTEGER;
        final SubLObject var24 = module0202.f12833(var22, (SubLObject)module0288.UNPROVIDED);
        SubLObject var25 = (SubLObject)module0288.NIL;
        SubLObject var26 = module0202.f12829(var22, (SubLObject)module0288.UNPROVIDED);
        SubLObject var27 = (SubLObject)module0288.NIL;
        var27 = var26.first();
        while (module0288.NIL != var26) {
            var23 = Numbers.add(var23, (SubLObject)module0288.ONE_INTEGER);
            if (module0288.NIL != f19308(var24, var23, var6)) {
                var25 = (SubLObject)ConsesLow.cons(var27, var25);
            }
            var26 = var26.rest();
            var27 = var26.first();
        }
        return Sequences.nreverse(var25);
    }
    
    public static SubLObject f19309(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19310(var5, Symbols.symbol_function((SubLObject)module0288.$ic1$), var6);
    }
    
    public static SubLObject f19311(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19310(var5, Symbols.symbol_function((SubLObject)module0288.$ic2$), var6);
    }
    
    public static SubLObject f19312(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19310(var5, Symbols.symbol_function((SubLObject)module0288.$ic3$), var6);
    }
    
    public static SubLObject f19313(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19310(var5, Symbols.symbol_function((SubLObject)module0288.$ic4$), var6);
    }
    
    public static SubLObject f19314(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19310(var5, Symbols.symbol_function((SubLObject)module0288.$ic5$), var6);
    }
    
    public static SubLObject f19310(final SubLObject var5, final SubLObject var30, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)module0288.NIL;
        final SubLObject var33 = var6;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var31);
        final SubLObject var35 = module0147.$g2095$.currentBinding(var31);
        try {
            module0147.$g2094$.bind(module0147.f9531(var33), var31);
            module0147.$g2095$.bind(module0147.f9534(var33), var31);
            var31.resetMultipleValues();
            final SubLObject var36 = f19303(var5, (SubLObject)module0288.UNPROVIDED);
            final SubLObject var37 = var31.secondMultipleValue();
            var31.resetMultipleValues();
            if (module0288.NIL != var36) {
                if (module0288.NIL == var37) {
                    if (module0288.NIL != module0035.f1997(var36)) {
                        var32 = Functions.funcall(var30, var36.first());
                    }
                    else if (module0288.NIL != module0146.$g2004$.getDynamicValue(var31)) {
                        var32 = Types.sublisp_null(module0035.find_if_not(var30, var36, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED));
                    }
                    else if (module0288.NIL != module0146.$g2005$.getDynamicValue(var31)) {
                        var32 = (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == module0035.find_if_not(var30, var36, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED) && module0288.NIL != f19315(var36));
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var35, var31);
            module0147.$g2094$.rebind(var34, var31);
        }
        return var32;
    }
    
    public static SubLObject f19316(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19310(var5, Symbols.symbol_function((SubLObject)module0288.$ic6$), var6);
    }
    
    public static SubLObject f19315(final SubLObject var32) {
        if (module0288.NIL != module0035.f1997(var32)) {
            return module0174.f11035(var32.first());
        }
        if (module0288.NIL != var32) {
            SubLObject var33 = (SubLObject)module0288.NIL;
            SubLObject var34 = (SubLObject)module0288.NIL;
            if (module0288.NIL == var34) {
                SubLObject var35 = var32;
                SubLObject var36 = (SubLObject)module0288.NIL;
                var36 = var35.first();
                while (module0288.NIL == var34 && module0288.NIL != var35) {
                    if (module0288.NIL != var33) {
                        var34 = (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == module0174.f11035(var36) || !var33.equal(module0289.f19396(var36)));
                    }
                    else {
                        var33 = module0289.f19396(var36);
                    }
                    var35 = var35.rest();
                    var36 = var35.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == var34);
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19317(final SubLObject var36, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0269.f17706(var36) && module0288.NIL != f19318(var36, var6));
    }
    
    public static SubLObject f19318(final SubLObject var36, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0226.f14792(var36) && module0288.NIL == module0210.f13570(var36) && module0288.NIL != f19319(var36) && module0288.NIL != f19320(var36, var6));
    }
    
    public static SubLObject f19321() {
        final SubLObject var37 = module0288.$g2645$.getGlobalValue();
        if (module0288.NIL != var37) {
            module0034.f1818(var37);
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19322(final SubLObject var38) {
        return module0034.f1829(module0288.$g2645$.getGlobalValue(), (SubLObject)ConsesLow.list(var38), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
    }
    
    public static SubLObject f19323(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)module0288.NIL;
        final SubLObject var41 = module0147.$g2094$.currentBinding(var39);
        final SubLObject var42 = module0147.$g2095$.currentBinding(var39);
        try {
            module0147.$g2094$.bind((SubLObject)module0288.$ic8$, var39);
            module0147.$g2095$.bind(module0288.$ic9$, var39);
            var40 = f19320(var38, (SubLObject)module0288.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var42, var39);
            module0147.$g2094$.rebind(var41, var39);
        }
        return var40;
    }
    
    public static SubLObject f19319(final SubLObject var38) {
        SubLObject var39 = module0288.$g2645$.getGlobalValue();
        if (module0288.NIL == var39) {
            var39 = module0034.f1934((SubLObject)module0288.$ic7$, (SubLObject)module0288.$ic10$, (SubLObject)module0288.NIL, (SubLObject)module0288.EQL, (SubLObject)module0288.ONE_INTEGER, (SubLObject)module0288.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0288.$ic11$);
        }
        SubLObject var40 = module0034.f1814(var39, var38, (SubLObject)module0288.$ic12$);
        if (var40 == module0288.$ic12$) {
            var40 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19323(var38)));
            module0034.f1816(var39, var38, var40, (SubLObject)module0288.UNPROVIDED);
        }
        return module0034.f1959(var40);
    }
    
    public static SubLObject f19320(final SubLObject var36, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        SubLObject var37 = module0225.f14773(var36);
        SubLObject var38 = (SubLObject)module0288.NIL;
        if (module0288.NIL == var37) {
            var37 = (SubLObject)module0288.FIVE_INTEGER;
        }
        if (module0288.NIL == var38) {
            SubLObject var39;
            SubLObject var40;
            SubLObject var41;
            for (var39 = module0048.f_1X(var37), var40 = (SubLObject)module0288.NIL, var40 = (SubLObject)module0288.ONE_INTEGER; module0288.NIL == var38 && !var40.numGE(var39); var40 = module0048.f_1X(var40)) {
                var41 = module0226.f14909(var40, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
                if (module0288.NIL == var38 && module0288.NIL != module0173.f10955(var41)) {
                    var38 = module0256.f16626(module0146.$g1978$.getGlobalValue(), var36, var41, var6, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
                }
            }
        }
        return var38;
    }
    
    public static SubLObject f19324(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19317(module0205.f13136(var5), var6);
    }
    
    public static SubLObject f19325(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19318(module0205.f13136(var5), var6);
    }
    
    public static SubLObject f19326(final SubLObject var36, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0269.f17706(var36) && module0288.NIL == module0210.f13570(var36) && module0288.NIL != f19327(var36) && (module0288.NIL != f19328(var36, var6) || module0288.NIL != f19320(var36, var6)));
    }
    
    public static SubLObject f19329(final SubLObject var36, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0226.f14792(var36) && module0288.NIL == module0210.f13570(var36) && module0288.NIL != f19327(var36) && (module0288.NIL != f19328(var36, var6) || module0288.NIL != f19320(var36, var6)));
    }
    
    public static SubLObject f19327(final SubLObject var38) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != f19319(var38) || module0288.NIL != f19330(var38));
    }
    
    public static SubLObject f19331() {
        final SubLObject var37 = module0288.$g2646$.getGlobalValue();
        if (module0288.NIL != var37) {
            module0034.f1818(var37);
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19332(final SubLObject var38) {
        return module0034.f1829(module0288.$g2646$.getGlobalValue(), (SubLObject)ConsesLow.list(var38), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
    }
    
    public static SubLObject f19333(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)module0288.NIL;
        final SubLObject var41 = module0147.$g2094$.currentBinding(var39);
        final SubLObject var42 = module0147.$g2095$.currentBinding(var39);
        try {
            module0147.$g2094$.bind((SubLObject)module0288.$ic8$, var39);
            module0147.$g2095$.bind(module0288.$ic9$, var39);
            var40 = f19328(var38, (SubLObject)module0288.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var42, var39);
            module0147.$g2094$.rebind(var41, var39);
        }
        return var40;
    }
    
    public static SubLObject f19330(final SubLObject var38) {
        SubLObject var39 = module0288.$g2646$.getGlobalValue();
        if (module0288.NIL == var39) {
            var39 = module0034.f1934((SubLObject)module0288.$ic13$, (SubLObject)module0288.$ic14$, (SubLObject)module0288.NIL, (SubLObject)module0288.EQL, (SubLObject)module0288.ONE_INTEGER, (SubLObject)module0288.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0288.$ic15$);
        }
        SubLObject var40 = module0034.f1814(var39, var38, (SubLObject)module0288.$ic12$);
        if (var40 == module0288.$ic12$) {
            var40 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19333(var38)));
            module0034.f1816(var39, var38, var40, (SubLObject)module0288.UNPROVIDED);
        }
        return module0034.f1959(var40);
    }
    
    public static SubLObject f19328(final SubLObject var36, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return conses_high.member(module0146.$g1979$.getGlobalValue(), module0226.f14922(var36, var6), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
    }
    
    public static SubLObject f19334(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19326(module0205.f13136(var5), var6);
    }
    
    public static SubLObject f19335(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return f19329(module0205.f13136(var5), var6);
    }
    
    public static SubLObject f19308(final SubLObject var27, final SubLObject var26, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        if (module0288.NIL != f19336(var27, var26, var6)) {
            return (SubLObject)module0288.T;
        }
        return f19337(var27, var26, var6);
    }
    
    public static SubLObject f19336(final SubLObject var27, final SubLObject var26, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        return module0004.f104(module0146.$g1979$.getGlobalValue(), module0226.f14895(var27, var26, var6), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
    }
    
    public static SubLObject f19337(final SubLObject var27, final SubLObject var26, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        final SubLObject var28 = module0226.f14909(var26, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
        if (module0288.NIL != module0173.f10955(var28)) {
            return module0256.f16626(module0146.$g1978$.getGlobalValue(), var27, var28, var6, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19338(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        if (module0288.NIL != module0202.f12590(var5) || module0288.NIL != module0210.f13566(var5)) {
            return f19303(var5, var6).first();
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19339(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0288.NIL != module0202.f12590(var5) || module0288.NIL != module0210.f13566(var5)) {
            var7.resetMultipleValues();
            final SubLObject var8 = f19303(var5, var6);
            final SubLObject var9 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            if (module0288.NIL != module0035.f1997(var8) && module0288.NIL == var9) {
                return var8.first();
            }
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19340(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        if (module0288.NIL != module0202.f12590(var5) || module0288.NIL != module0210.f13566(var5)) {
            final SubLObject var7 = f19341(var5, var6);
            if (module0288.NIL != module0035.f1997(var7)) {
                return var7.first();
            }
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19303(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        if (module0288.NIL != module0210.f13566(var5)) {
            return (SubLObject)ConsesLow.list(var5);
        }
        if (module0288.NIL != module0202.f12903(var5)) {
            return f19303(module0202.f12887(var5), module0202.f12906(var5));
        }
        return f19342(var5, var6);
    }
    
    public static SubLObject f19341(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        if (module0288.NIL != module0210.f13566(var5)) {
            return f19343(var5);
        }
        if (module0288.NIL != module0202.f12903(var5)) {
            return f19341(module0202.f12887(var5), module0202.f12906(var5));
        }
        return f19344(var5, var6);
    }
    
    public static SubLObject f19343(final SubLObject var1) {
        final SubLObject var2 = module0217.f14429(var1);
        final SubLObject var3 = module0178.f11287(var1);
        SubLObject var4 = (SubLObject)module0288.NIL;
        SubLObject var5 = var2;
        SubLObject var6 = (SubLObject)module0288.NIL;
        var6 = var5.first();
        while (module0288.NIL != var5) {
            if (module0288.NIL != module0262.f17336(var3, module0178.f11287(var6), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED)) {
                var4 = (SubLObject)ConsesLow.cons(var6, var4);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        var4 = (SubLObject)ConsesLow.cons(var1, var4);
        return var4;
    }
    
    public static SubLObject f19345(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        if (module0288.NIL != module0202.f12590(var5)) {
            final SubLObject var7 = f19303(var5, var6);
            if (module0288.NIL != var7) {
                return var7.first();
            }
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19346(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        var7.resetMultipleValues();
        final SubLObject var8 = f19303(var5, var6);
        final SubLObject var9 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != var8 && module0288.NIL == var9);
    }
    
    public static SubLObject f19347(final SubLObject var52, final SubLObject var19) {
        return Equality.equal(f19348(), var19);
    }
    
    public static SubLObject f19349(final SubLObject var52, final SubLObject var53) {
        return Equality.equal(module0204.f13047(f19348()), var53);
    }
    
    public static SubLObject f19348() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0288.NIL != module0004.f104(module0018.$g581$.getDynamicValue(var8), module0146.$g2051$.getDynamicValue(var8), Symbols.symbol_function((SubLObject)module0288.EQ), (SubLObject)module0288.UNPROVIDED)) {
            return (SubLObject)module0288.NIL;
        }
        SubLObject var9 = (SubLObject)module0288.NIL;
        final SubLObject var10 = module0144.$g1796$.currentBinding(var8);
        final SubLObject var11 = module0146.$g2051$.currentBinding(var8);
        try {
            module0144.$g1796$.bind((SubLObject)module0288.NIL, var8);
            module0146.$g2051$.bind((SubLObject)ConsesLow.cons(module0018.$g581$.getDynamicValue(var8), module0146.$g2051$.getDynamicValue(var8)), var8);
            var9 = module0279.f18498(module0285.f18874(module0538.f33478(module0018.$g581$.getDynamicValue(var8), (SubLObject)module0288.UNPROVIDED), module0178.f11287(module0018.$g581$.getDynamicValue(var8)))).first();
        }
        finally {
            module0146.$g2051$.rebind(var11, var8);
            module0144.$g1796$.rebind(var10, var8);
        }
        return var9;
    }
    
    public static SubLObject f19350() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0288.NIL != module0174.f11035(module0018.$g581$.getDynamicValue(var8))) {
            return module0289.f19396(module0018.$g581$.getDynamicValue(var8));
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19351() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0288.NIL != module0174.f11035(module0018.$g581$.getDynamicValue(var8))) {
            return module0538.f33478(module0018.$g581$.getDynamicValue(var8), (SubLObject)module0288.T);
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19352() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0288.$ic16$ == module0146.$g2008$.getDynamicValue(var8)) {
            return (SubLObject)module0288.NIL;
        }
        return module0146.$g2008$.getDynamicValue(var8);
    }
    
    public static SubLObject f19353(final SubLObject var5, final SubLObject var6, final SubLObject var55) {
        if (module0288.NIL != var55) {
            return f19344(var5, var6);
        }
        return f19342(var5, var6);
    }
    
    public static SubLObject f19342(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0288.NIL != module0202.f12590(var5)) {
            final SubLObject var8 = module0205.f13327(var6);
            if (module0288.NIL == module0161.f10481(var8)) {
                return (SubLObject)module0288.NIL;
            }
            if (module0288.NIL != module0146.$g1986$.getDynamicValue(var7) || module0288.NIL != module0152.$g2101$.getDynamicValue(var7)) {
                return f19354(var5, var8, (SubLObject)module0288.NIL);
            }
            return f19355(var5, var8, (SubLObject)module0288.NIL);
        }
        else {
            if (module0288.NIL != module0210.f13566(var5)) {
                return (SubLObject)ConsesLow.list(var5);
            }
            return (SubLObject)module0288.NIL;
        }
    }
    
    public static SubLObject f19344(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0288.NIL != module0147.f9557(var6) && module0288.NIL != module0202.f12590(var5)) {
            SubLObject var8 = (SubLObject)module0288.NIL;
            SubLObject var9 = (SubLObject)module0288.NIL;
            final SubLObject var10 = module0147.$g2094$.currentBinding(var7);
            final SubLObject var11 = module0147.$g2095$.currentBinding(var7);
            try {
                module0147.$g2094$.bind((SubLObject)module0288.$ic8$, var7);
                module0147.$g2095$.bind(module0288.$ic9$, var7);
                var7.resetMultipleValues();
                final SubLObject var58_59 = f19342(var5, (SubLObject)module0288.UNPROVIDED);
                final SubLObject var60_61 = var7.secondMultipleValue();
                var7.resetMultipleValues();
                var8 = var58_59;
                var9 = var60_61;
            }
            finally {
                module0147.$g2095$.rebind(var11, var7);
                module0147.$g2094$.rebind(var10, var7);
            }
            return Values.values(var8, var9);
        }
        if (module0288.NIL != module0202.f12590(var5)) {
            final SubLObject var12 = module0205.f13327(var6);
            if (module0288.NIL != module0146.$g1986$.getDynamicValue(var7) || module0288.NIL != module0152.$g2101$.getDynamicValue(var7)) {
                return f19354(var5, var12, (SubLObject)module0288.T);
            }
            return f19355(var5, var12, (SubLObject)module0288.T);
        }
        else {
            if (module0288.NIL != module0210.f13566(var5)) {
                return f19343(var5);
            }
            return (SubLObject)module0288.NIL;
        }
    }
    
    public static SubLObject f19356() {
        final SubLObject var37 = module0288.$g2647$.getGlobalValue();
        if (module0288.NIL != var37) {
            module0034.f1818(var37);
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19357(final SubLObject var5, final SubLObject var6, final SubLObject var62) {
        return module0034.f1829(module0288.$g2647$.getGlobalValue(), (SubLObject)ConsesLow.list(var5, var6, var62), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
    }
    
    public static SubLObject f19358(final SubLObject var5, final SubLObject var6, final SubLObject var62) {
        return f19355(var5, var6, var62);
    }
    
    public static SubLObject f19354(final SubLObject var5, final SubLObject var6, final SubLObject var62) {
        SubLObject var63 = module0288.$g2647$.getGlobalValue();
        if (module0288.NIL == var63) {
            var63 = module0034.f1934((SubLObject)module0288.$ic17$, (SubLObject)module0288.$ic18$, (SubLObject)module0288.NIL, (SubLObject)module0288.EQUAL, (SubLObject)module0288.THREE_INTEGER, (SubLObject)module0288.EIGHT_INTEGER);
        }
        final SubLObject var64 = module0034.f1781(var5, var6, var62);
        final SubLObject var65 = module0034.f1814(var63, var64, (SubLObject)module0288.UNPROVIDED);
        if (var65 != module0288.$ic12$) {
            SubLObject var66 = var65;
            SubLObject var67 = (SubLObject)module0288.NIL;
            var67 = var66.first();
            while (module0288.NIL != var66) {
                SubLObject var68 = var67.first();
                final SubLObject var69 = conses_high.second(var67);
                if (var5.equal(var68.first())) {
                    var68 = var68.rest();
                    if (var6.equal(var68.first())) {
                        var68 = var68.rest();
                        if (module0288.NIL != var68 && module0288.NIL == var68.rest() && var62.equal(var68.first())) {
                            return module0034.f1959(var69);
                        }
                    }
                }
                var66 = var66.rest();
                var67 = var66.first();
            }
        }
        final SubLObject var70 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19358(var5, var6, var62)));
        module0034.f1836(var63, var64, var65, var70, (SubLObject)ConsesLow.list(var5, var6, var62));
        return module0034.f1959(var70);
    }
    
    public static SubLObject f19355(final SubLObject var5, final SubLObject var6, final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        var63.resetMultipleValues();
        SubLObject var64 = f19359(var5, var6, var62);
        SubLObject var65 = var63.secondMultipleValue();
        var63.resetMultipleValues();
        if (module0288.NIL == var64 && module0288.NIL != f19352()) {
            final SubLObject var66 = module0018.$g578$.currentBinding(var63);
            final SubLObject var67 = module0018.$g579$.currentBinding(var63);
            try {
                module0018.$g578$.bind((SubLObject)module0288.$ic19$, var63);
                module0018.$g579$.bind((SubLObject)module0288.$ic20$, var63);
                var63.resetMultipleValues();
                final SubLObject var70_71 = f19359(var5, var6, var62);
                final SubLObject var72_73 = var63.secondMultipleValue();
                var63.resetMultipleValues();
                var64 = var70_71;
                var65 = var72_73;
            }
            finally {
                module0018.$g579$.rebind(var67, var63);
                module0018.$g578$.rebind(var66, var63);
            }
        }
        return Values.values(var64, var65);
    }
    
    public static SubLObject f19359(final SubLObject var5, SubLObject var6, final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var64 = module0285.f19069(var5);
        SubLObject var65 = (SubLObject)module0288.NIL;
        SubLObject var66 = (SubLObject)module0288.NIL;
        SubLObject var67 = (SubLObject)module0288.NIL;
        SubLObject var68 = (SubLObject)module0288.NIL;
        var63.resetMultipleValues();
        final SubLObject var78_79 = f19360(var64, (SubLObject)module0288.T, var6);
        final SubLObject var80_81 = var63.secondMultipleValue();
        final SubLObject var82_83 = var63.thirdMultipleValue();
        var63.resetMultipleValues();
        var66 = var78_79;
        var67 = var80_81;
        var6 = var82_83;
        if (module0288.NIL == module0206.f13427(var67)) {
            SubLObject var69 = (SubLObject)module0288.NIL;
            SubLObject var85_86 = (SubLObject)module0288.NIL;
            SubLObject var70 = (SubLObject)module0288.NIL;
            SubLObject var88_89 = (SubLObject)module0288.NIL;
            var69 = var66;
            var85_86 = var69.first();
            var70 = var67;
            var88_89 = var70.first();
            while (module0288.NIL != var70 || module0288.NIL != var69) {
                SubLObject var72;
                final SubLObject var71 = var72 = var85_86;
                SubLObject var73 = (SubLObject)module0288.NIL;
                SubLObject var74 = (SubLObject)module0288.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var72, var71, (SubLObject)module0288.$ic21$);
                var73 = var72.first();
                var72 = (var74 = var72.rest());
                final SubLObject var75 = f19361(var73, var88_89, var6, var62);
                if (module0288.NIL == var75) {
                    var68 = (SubLObject)module0288.T;
                }
                var65 = ConsesLow.nconc(var65, var75);
                var69 = var69.rest();
                var85_86 = var69.first();
                var70 = var70.rest();
                var88_89 = var70.first();
            }
        }
        if (module0288.NIL == var65) {
            var68 = (SubLObject)module0288.T;
        }
        return Values.values(Sequences.nreverse(var65), var68);
    }
    
    public static SubLObject f19361(final SubLObject var19, final SubLObject var88, final SubLObject var6, final SubLObject var62) {
        SubLObject var89 = (SubLObject)module0288.NIL;
        if (module0288.NIL != module0204.f13044(var19) && module0288.NIL != module0202.f12903(module0204.f13054(var19)) && module0288.NIL != module0161.f10481(module0202.f12906(module0204.f13054(var19)))) {
            final SubLObject var90 = f19362(var19, var88);
            var89 = ConsesLow.nconc(var89, var90);
        }
        if (module0288.NIL != module0226.f14827(var19)) {
            final SubLObject var90 = f19363(var19, var6);
            var89 = ConsesLow.nconc(var89, var90);
        }
        else {
            final SubLObject var90 = (module0288.NIL != module0147.f9513()) ? module0217.f14420(var19) : ((module0288.NIL != var62) ? module0230.f15278(var19, var6) : module0435.f30615(module0217.f14415(var19, var6)));
            if (module0288.NIL != var90) {
                var89 = ConsesLow.nconc(var89, var90);
            }
        }
        return var89;
    }
    
    public static SubLObject f19362(final SubLObject var19, final SubLObject var88) {
        final SubLObject var89 = module0204.f13054(var19);
        return f19303(module0205.f13257(module0035.f2230(var88), module0202.f12887(var89), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED), module0202.f12906(var89));
    }
    
    public static SubLObject f19363(final SubLObject var19, final SubLObject var6) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)module0288.NIL;
        if (module0288.NIL != module0146.$g2006$.getDynamicValue(var20)) {
            var21 = module0217.f14420(var19);
        }
        else {
            final SubLObject var22 = module0226.f14830(var6, var19);
            var21 = (SubLObject)ConsesLow.list(module0217.f14415(var19, var22));
        }
        return var21;
    }
    
    public static SubLObject f19364(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0288.NIL;
        final SubLObject var9 = module0144.$g1796$.currentBinding(var7);
        final SubLObject var10 = module0144.$g1795$.currentBinding(var7);
        final SubLObject var11 = module0152.$g2116$.currentBinding(var7);
        final SubLObject var12 = module0152.$g2115$.currentBinding(var7);
        final SubLObject var13 = module0018.$g696$.currentBinding(var7);
        final SubLObject var14 = module0018.$g698$.currentBinding(var7);
        try {
            module0144.$g1796$.bind((SubLObject)module0288.NIL, var7);
            module0144.$g1795$.bind((SubLObject)module0288.NIL, var7);
            module0152.$g2116$.bind((SubLObject)module0288.NIL, var7);
            module0152.$g2115$.bind((SubLObject)module0288.NIL, var7);
            module0018.$g696$.bind((SubLObject)module0288.NIL, var7);
            module0018.$g698$.bind((SubLObject)module0288.NIL, var7);
            var8 = module0285.f18874(var5, var6);
        }
        finally {
            module0018.$g698$.rebind(var14, var7);
            module0018.$g696$.rebind(var13, var7);
            module0152.$g2115$.rebind(var12, var7);
            module0152.$g2116$.rebind(var11, var7);
            module0144.$g1795$.rebind(var10, var7);
            module0144.$g1796$.rebind(var9, var7);
        }
        return var8;
    }
    
    public static SubLObject f19365(final SubLObject var5, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0288.NIL;
        final SubLObject var9 = module0144.$g1796$.currentBinding(var7);
        final SubLObject var10 = module0144.$g1795$.currentBinding(var7);
        final SubLObject var11 = module0152.$g2116$.currentBinding(var7);
        final SubLObject var12 = module0152.$g2115$.currentBinding(var7);
        final SubLObject var13 = module0018.$g696$.currentBinding(var7);
        final SubLObject var14 = module0018.$g698$.currentBinding(var7);
        try {
            module0144.$g1796$.bind((SubLObject)module0288.NIL, var7);
            module0144.$g1795$.bind((SubLObject)module0288.NIL, var7);
            module0152.$g2116$.bind((SubLObject)module0288.NIL, var7);
            module0152.$g2115$.bind((SubLObject)module0288.NIL, var7);
            module0018.$g696$.bind((SubLObject)module0288.NIL, var7);
            module0018.$g698$.bind((SubLObject)module0288.NIL, var7);
            if (module0288.NIL == module0146.f9483((SubLObject)module0288.$ic22$)) {
                Errors.error((SubLObject)module0288.$ic23$);
            }
            final SubLObject var11_100 = module0146.$g2092$.currentBinding(var7);
            try {
                module0146.$g2092$.bind((SubLObject)module0288.$ic22$, var7);
                var7.resetMultipleValues();
                final SubLObject var101_102 = module0285.f18902(var5, var6);
                final SubLObject var103_104 = var7.secondMultipleValue();
                var7.resetMultipleValues();
                var8 = var101_102;
                var6 = var103_104;
            }
            finally {
                module0146.$g2092$.rebind(var11_100, var7);
            }
        }
        finally {
            module0018.$g698$.rebind(var14, var7);
            module0018.$g696$.rebind(var13, var7);
            module0152.$g2115$.rebind(var12, var7);
            module0152.$g2116$.rebind(var11, var7);
            module0144.$g1795$.rebind(var10, var7);
            module0144.$g1796$.rebind(var9, var7);
        }
        return Values.values(var8, var6);
    }
    
    public static SubLObject f19366(final SubLObject var5, SubLObject var105, SubLObject var6) {
        if (var105 == module0288.UNPROVIDED) {
            var105 = (SubLObject)module0288.NIL;
        }
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var106 = SubLProcess.currentSubLThread();
        final SubLObject var107 = f19364(var5, var6);
        final SubLObject var108 = module0279.f18500(var107);
        SubLObject var109 = (SubLObject)module0288.NIL;
        if (module0288.NIL != module0202.f12590(var107)) {
            SubLObject var110 = var107;
            SubLObject var111 = (SubLObject)module0288.NIL;
            var111 = var110.first();
            while (module0288.NIL != var110) {
                var106.resetMultipleValues();
                final SubLObject var112 = module0538.f33413(var111, var105, (SubLObject)module0288.UNPROVIDED);
                final SubLObject var113 = var106.secondMultipleValue();
                final SubLObject var114 = var106.thirdMultipleValue();
                var106.resetMultipleValues();
                if (module0288.NIL != var105) {
                    var109 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var112, var114), var109);
                }
                else {
                    var109 = (SubLObject)ConsesLow.cons(var112, var109);
                }
                var110 = var110.rest();
                var111 = var110.first();
            }
        }
        return Values.values(Sequences.nreverse(var109), var108);
    }
    
    public static SubLObject f19360(final SubLObject var5, SubLObject var105, SubLObject var6) {
        if (var105 == module0288.UNPROVIDED) {
            var105 = (SubLObject)module0288.NIL;
        }
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var106 = SubLProcess.currentSubLThread();
        SubLObject var107 = (SubLObject)module0288.NIL;
        var106.resetMultipleValues();
        final SubLObject var106_107 = f19365(var5, var6);
        final SubLObject var108_109 = var106.secondMultipleValue();
        var106.resetMultipleValues();
        var107 = var106_107;
        var6 = var108_109;
        final SubLObject var108 = module0279.f18500(var107);
        SubLObject var109 = (SubLObject)module0288.NIL;
        if (module0288.NIL != module0202.f12590(var107)) {
            SubLObject var110 = var107;
            SubLObject var111 = (SubLObject)module0288.NIL;
            var111 = var110.first();
            while (module0288.NIL != var110) {
                var106.resetMultipleValues();
                final SubLObject var112 = module0538.f33413(var111, var105, (SubLObject)module0288.UNPROVIDED);
                final SubLObject var113 = var106.secondMultipleValue();
                final SubLObject var114 = var106.thirdMultipleValue();
                var106.resetMultipleValues();
                if (module0288.NIL != var105) {
                    var109 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var112, var114), var109);
                }
                else {
                    var109 = (SubLObject)ConsesLow.cons(var112, var109);
                }
                var110 = var110.rest();
                var111 = var110.first();
            }
        }
        return Values.values(Sequences.nreverse(var109), var108, var6);
    }
    
    public static SubLObject f19367(final SubLObject var110) {
        if (module0288.$ic24$.eql(var110)) {
            return var110;
        }
        if (module0288.$ic25$.eql(var110)) {
            return var110;
        }
        SubLObject var111 = (SubLObject)module0288.NIL;
        SubLObject var112 = var110;
        SubLObject var113 = (SubLObject)module0288.NIL;
        var113 = var112.first();
        while (module0288.NIL != var112) {
            if (module0288.NIL != f19368(var113)) {
                var111 = ConsesLow.nconc(f19369(var113), var111);
            }
            else if (module0288.NIL != f19370(var113)) {
                var111 = (SubLObject)ConsesLow.cons(f19371(var113), var111);
            }
            else {
                var111 = (SubLObject)ConsesLow.cons(var113, var111);
            }
            var112 = var112.rest();
            var113 = var112.first();
        }
        return Sequences.nreverse(var111);
    }
    
    public static SubLObject f19371(final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        if (module0288.NIL != module0018.$g698$.getDynamicValue(var112)) {
            return f19372(var111, Symbols.symbol_function((SubLObject)module0288.$ic26$), Symbols.symbol_function((SubLObject)module0288.$ic27$), Symbols.symbol_function((SubLObject)module0288.EQUAL), (SubLObject)module0288.UNPROVIDED);
        }
        return module0036.f2547(var111, Symbols.symbol_function((SubLObject)module0288.$ic28$), Symbols.symbol_function((SubLObject)module0288.$ic27$), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
    }
    
    public static SubLObject f19372(final SubLObject var112, final SubLObject var113, final SubLObject var114, SubLObject var115, SubLObject var116) {
        if (var115 == module0288.UNPROVIDED) {
            var115 = Symbols.symbol_function((SubLObject)module0288.EQL);
        }
        if (var116 == module0288.UNPROVIDED) {
            var116 = Symbols.symbol_function((SubLObject)module0288.IDENTITY);
        }
        return f19373(conses_high.copy_tree(var112), var113, var114, var115, var116);
    }
    
    public static SubLObject f19373(final SubLObject var112, final SubLObject var113, final SubLObject var114, SubLObject var115, SubLObject var116) {
        if (var115 == module0288.UNPROVIDED) {
            var115 = Symbols.symbol_function((SubLObject)module0288.EQL);
        }
        if (var116 == module0288.UNPROVIDED) {
            var116 = Symbols.symbol_function((SubLObject)module0288.IDENTITY);
        }
        if (module0288.NIL == Functions.funcall(var113, var112)) {
            return f19374(var112, var113, var114, var115, var116);
        }
        final SubLObject var117 = Functions.funcall(var114, Functions.funcall(var116, var112));
        if (module0288.NIL != Functions.funcall(var115, var112, var117)) {
            return f19374(var112, var113, var114, var115, var116);
        }
        return f19373(conses_high.copy_tree(var117), var113, var114, var115, var116);
    }
    
    public static SubLObject f19374(final SubLObject var112, final SubLObject var113, final SubLObject var114, SubLObject var115, SubLObject var116) {
        if (var115 == module0288.UNPROVIDED) {
            var115 = Symbols.symbol_function((SubLObject)module0288.EQL);
        }
        if (var116 == module0288.UNPROVIDED) {
            var116 = Symbols.symbol_function((SubLObject)module0288.IDENTITY);
        }
        if (var112.isAtom()) {
            return var112;
        }
        SubLObject var117;
        for (var117 = (SubLObject)module0288.NIL, var117 = var112; var117.rest().isCons(); var117 = var117.rest()) {
            ConsesLow.rplaca(var117, f19373(var117.first(), var113, var114, var115, var116));
        }
        ConsesLow.rplaca(var117, f19373(var117.first(), var113, var114, var115, var116));
        if (module0288.NIL != var117.rest()) {
            ConsesLow.rplacd(var117, f19373(var117.rest(), var113, var114, var115, var116));
        }
        return var112;
    }
    
    public static SubLObject f19375(final SubLObject var119) {
        if (module0288.NIL != module0174.f11035(var119)) {
            return var119;
        }
        if (module0288.NIL != module0202.f12590(var119)) {
            return f19376(var119, (SubLObject)module0288.T);
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19377(final SubLObject var119) {
        return f19376(var119, (SubLObject)module0288.NIL);
    }
    
    public static SubLObject f19376(final SubLObject var119, final SubLObject var120) {
        final SubLThread var121 = SubLProcess.currentSubLThread();
        SubLObject var122 = (SubLObject)module0288.ZERO_INTEGER;
        final SubLObject var123 = module0205.f13132(var119);
        SubLObject var124 = (SubLObject)module0288.NIL;
        SubLObject var125 = (SubLObject)module0288.NIL;
        SubLObject var126 = module0205.f13207(var119, (SubLObject)module0288.UNPROVIDED);
        SubLObject var127 = (SubLObject)module0288.NIL;
        var127 = var126.first();
        while (module0288.NIL != var126) {
            var122 = Numbers.add(var122, (SubLObject)module0288.ONE_INTEGER);
            if (module0288.NIL != f19308(var123, var122, (SubLObject)module0288.UNPROVIDED)) {
                if (module0288.NIL != module0202.f12904(var127)) {
                    if (module0288.NIL != var120) {
                        final SubLObject var128 = module0202.f12906(var127);
                        final SubLObject var129 = module0147.$g2095$.currentBinding(var121);
                        try {
                            module0147.$g2095$.bind((module0288.NIL != module0161.f10485(var128)) ? var128 : module0147.$g2095$.getDynamicValue(var121), var121);
                            var124 = (SubLObject)ConsesLow.cons(f19339(module0202.f12887(var127), (SubLObject)module0288.UNPROVIDED), var124);
                        }
                        finally {
                            module0147.$g2095$.rebind(var129, var121);
                        }
                    }
                    else {
                        var125 = (SubLObject)ConsesLow.cons(module0202.f12887(var127), var125);
                    }
                }
                else if (module0288.NIL != module0201.f12580(var127)) {
                    var124 = (SubLObject)ConsesLow.cons(var127, var124);
                }
                else if (module0288.NIL != var120) {
                    final SubLObject var130 = f19339(var127, (SubLObject)module0288.UNPROVIDED);
                    if (module0288.NIL != module0210.f13566(var130)) {
                        var124 = (SubLObject)ConsesLow.cons(var130, var124);
                    }
                    else {
                        module0202.f12747((SubLObject)module0288.THREE_INTEGER, (SubLObject)module0288.$ic29$, var127, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED);
                        var124 = (SubLObject)ConsesLow.cons(var127, var124);
                    }
                }
                else {
                    var125 = (SubLObject)ConsesLow.cons(var127, var125);
                }
            }
            else {
                var124 = (SubLObject)ConsesLow.cons(var127, var124);
            }
            var126 = var126.rest();
            var127 = var126.first();
        }
        return (module0288.NIL != var120) ? module0202.f12720(var123, Sequences.nreverse(var124), (SubLObject)module0288.UNPROVIDED) : Sequences.nreverse(var125);
    }
    
    public static SubLObject f19369(final SubLObject var111) {
        final SubLObject var112 = module0232.f15308(var111).first();
        return f19378(var112);
    }
    
    public static SubLObject f19378(final SubLObject var95) {
        final SubLThread var96 = SubLProcess.currentSubLThread();
        SubLObject var97 = (SubLObject)module0288.NIL;
        if (module0288.NIL != module0202.f12883(var95, (SubLObject)module0288.UNPROVIDED)) {
            if (module0288.NIL != module0161.f10481(module0202.f12906(var95))) {
                final SubLObject var98 = module0147.f9540(module0202.f12906(var95));
                final SubLObject var99 = module0147.$g2095$.currentBinding(var96);
                final SubLObject var100 = module0147.$g2094$.currentBinding(var96);
                final SubLObject var101 = module0147.$g2096$.currentBinding(var96);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var98), var96);
                    module0147.$g2094$.bind(module0147.f9546(var98), var96);
                    module0147.$g2096$.bind(module0147.f9549(var98), var96);
                    var97 = f19378(module0202.f12887(var95));
                }
                finally {
                    module0147.$g2096$.rebind(var101, var96);
                    module0147.$g2094$.rebind(var100, var96);
                    module0147.$g2095$.rebind(var99, var96);
                }
            }
            else {
                var97 = module0204.f13033(var95);
            }
        }
        else {
            final SubLObject var102 = module0205.f13333(var95);
            SubLObject var103 = (SubLObject)module0288.ZERO_INTEGER;
            SubLObject var104 = (SubLObject)module0288.NIL;
            SubLObject var105 = module0205.f13385(var95, (SubLObject)module0288.$ic30$);
            SubLObject var106 = (SubLObject)module0288.NIL;
            var106 = var105.first();
            while (module0288.NIL != var105) {
                var103 = Numbers.add(var103, (SubLObject)module0288.ONE_INTEGER);
                if (module0288.NIL != module0279.f18447(var102, var103, (SubLObject)module0288.UNPROVIDED)) {
                    final SubLObject var107 = f19303(var106, (SubLObject)module0288.UNPROVIDED);
                    if (module0288.NIL != var107) {
                        var104 = (SubLObject)ConsesLow.cons(var107, var104);
                    }
                    else {
                        var104 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var106), var104);
                    }
                }
                else {
                    var104 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var106), var104);
                }
                var105 = var105.rest();
                var106 = var105.first();
            }
            var105 = module0035.f2468((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var102), Sequences.nreverse(var104)));
            SubLObject var108 = (SubLObject)module0288.NIL;
            var108 = var105.first();
            while (module0288.NIL != var105) {
                var97 = (SubLObject)ConsesLow.cons(module0232.f15326((SubLObject)module0288.NIL, (SubLObject)ConsesLow.list(var108)), var97);
                var105 = var105.rest();
                var108 = var105.first();
            }
        }
        return var97;
    }
    
    public static SubLObject f19370(final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = module0232.f15306(var111);
        SubLObject var114 = (SubLObject)module0288.NIL;
        var114 = var113.first();
        while (module0288.NIL != var113) {
            if (module0288.NIL != module0202.f12665(var114)) {
                if (module0288.NIL != module0018.$g698$.getDynamicValue(var112)) {
                    if (module0288.NIL != module0205.f13145((SubLObject)module0288.$ic26$, var114, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED)) {
                        return (SubLObject)module0288.T;
                    }
                }
                else if (module0288.NIL != module0205.f13145((SubLObject)module0288.$ic28$, var114, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED)) {
                    return (SubLObject)module0288.T;
                }
            }
            var113 = var113.rest();
            var114 = var113.first();
        }
        var113 = module0232.f15308(var111);
        var114 = (SubLObject)module0288.NIL;
        var114 = var113.first();
        while (module0288.NIL != var113) {
            if (module0288.NIL != module0202.f12665(var114)) {
                if (module0288.NIL != module0018.$g698$.getDynamicValue(var112)) {
                    if (module0288.NIL != module0205.f13145((SubLObject)module0288.$ic26$, var114, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED)) {
                        return (SubLObject)module0288.T;
                    }
                }
                else if (module0288.NIL != module0205.f13145((SubLObject)module0288.$ic28$, var114, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED)) {
                    return (SubLObject)module0288.T;
                }
            }
            var113 = var113.rest();
            var114 = var113.first();
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19368(final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        if (module0288.NIL == module0232.f15306(var111)) {
            final SubLObject var113 = module0232.f15308(var111);
            final SubLObject var114 = var113.first();
            if (module0288.NIL != module0035.f1997(var113)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != f19379(var114, module0147.$g2095$.getDynamicValue(var112)) && module0288.NIL != f19380(var114));
            }
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19380(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0288.NIL != module0202.f12665(var22) && module0288.NIL != module0202.f12937(var22)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0279.f18488(module0202.f12833(var22, (SubLObject)module0288.UNPROVIDED)) || module0288.NIL != f19381(var22) || (module0288.NIL != module0146.$g2005$.getDynamicValue(var23) && module0288.NIL != f19382(var22, (SubLObject)module0288.UNPROVIDED)));
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19381(final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0202.f12903(var22) && module0288.NIL != module0161.f10481(module0202.f12834(var22, (SubLObject)module0288.UNPROVIDED)) && module0288.NIL != f19380(module0202.f12835(var22, (SubLObject)module0288.UNPROVIDED)));
    }
    
    public static SubLObject f19383(final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0202.f12903(var22) && module0288.NIL != module0161.f10481(module0202.f12906(var22)) && module0288.NIL != f19379(module0202.f12887(var22), module0202.f12906(var22)));
    }
    
    public static SubLObject f19384(final SubLObject var119) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0202.f12904(var119) && module0288.NIL != module0161.f10481(module0202.f12906(var119)) && module0288.NIL != f19385(module0202.f12887(var119), module0202.f12906(var119)));
    }
    
    public static SubLObject f19379(final SubLObject var22, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0202.f12665(var22) && module0288.NIL != f19383(var22));
        if (module0288.NIL == var24 && module0288.NIL != module0161.f10481(var6)) {
            final SubLObject var25 = module0152.$g2129$.currentBinding(var23);
            try {
                module0152.$g2129$.bind((SubLObject)module0288.NIL, var23);
                var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != module0202.f12937(var22) && module0288.NIL != f19326(module0202.f12833(var22, (SubLObject)module0288.UNPROVIDED), var6) && module0288.NIL != f19386(var22, var6, (SubLObject)module0288.UNPROVIDED));
            }
            finally {
                module0152.$g2129$.rebind(var25, var23);
            }
        }
        return var24;
    }
    
    public static SubLObject f19385(final SubLObject var119, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        final SubLThread var120 = SubLProcess.currentSubLThread();
        SubLObject var121 = f19384(var119);
        if (module0288.NIL == var121 && module0288.NIL != module0161.f10481(var6)) {
            final SubLObject var122 = module0152.$g2129$.currentBinding(var120);
            try {
                module0152.$g2129$.bind((SubLObject)module0288.NIL, var120);
                var121 = (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != f19329(module0205.f13136(var119), var6) && module0288.NIL != f19386(var119, var6, (SubLObject)module0288.UNPROVIDED));
            }
            finally {
                module0152.$g2129$.rebind(var122, var120);
            }
        }
        return var121;
    }
    
    public static SubLObject f19386(final SubLObject var22, SubLObject var6, SubLObject var130) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        if (var130 == module0288.UNPROVIDED) {
            var130 = Symbols.symbol_function((SubLObject)module0288.$ic0$);
        }
        final SubLThread var131 = SubLProcess.currentSubLThread();
        SubLObject var132 = (SubLObject)module0288.NIL;
        final SubLObject var133 = (SubLObject)module0288.ZERO_INTEGER;
        final SubLObject var134 = module0202.f12832(var22, (SubLObject)module0288.UNPROVIDED);
        SubLObject var26_132 = (SubLObject)module0288.ZERO_INTEGER;
        final SubLObject var135 = module0205.f13207(module0202.f12826(var22), (SubLObject)module0288.$ic30$);
        SubLObject var136;
        SubLObject var137;
        for (var136 = (SubLObject)module0288.NIL, var136 = var135; module0288.NIL == var132 && module0288.NIL != var136; var136 = var136.rest()) {
            var137 = var136.first();
            var26_132 = Numbers.add(var26_132, (SubLObject)module0288.ONE_INTEGER);
            if (module0288.NIL != f19337(var134, var26_132, var6)) {
                if (module0288.NIL == f19387(var134, var137, var6, var130)) {
                    var132 = (SubLObject)module0288.T;
                }
            }
            else if (module0288.NIL != f19336(var134, var26_132, var6) && module0288.NIL == f19387(var134, var137, var6, var130) && module0288.NIL == module0304.f20285(var137, var26_132, var134, var6)) {
                var132 = (SubLObject)module0288.T;
            }
        }
        if (module0288.NIL != var132 && module0288.NIL != module0146.$g2052$.getDynamicValue(var131)) {
            module0146.$g2053$.setDynamicValue(f19337(var134, var133, var6), var131);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == var132);
    }
    
    public static SubLObject f19387(final SubLObject var27, final SubLObject var29, final SubLObject var6, final SubLObject var130) {
        final SubLThread var131 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL != Functions.funcall(var130, var29) || module0288.NIL != module0210.f13566(var29) || module0288.NIL != f19339(var29, var6) || (module0288.NIL != f19346(var29, var6) && (module0288.NIL != module0279.f18488(var27) || (module0288.NIL != module0146.$g2005$.getDynamicValue(var131) && module0288.NIL != f19315(f19303(var29, (SubLObject)module0288.UNPROVIDED))))));
    }
    
    public static SubLObject f19382(final SubLObject var22, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        SubLObject var23 = Numbers.numE(module0202.f12839(var22, (SubLObject)module0288.$ic30$), (SubLObject)module0288.ZERO_INTEGER);
        SubLObject var24 = (SubLObject)module0288.T;
        final SubLObject var25 = module0202.f12833(var22, (SubLObject)module0288.UNPROVIDED);
        SubLObject var26 = (SubLObject)module0288.ZERO_INTEGER;
        final SubLObject var27 = module0205.f13207(var22, (SubLObject)module0288.$ic30$);
        SubLObject var28;
        SubLObject var29;
        for (var28 = (SubLObject)module0288.NIL, var28 = var27; module0288.NIL == var23 && module0288.NIL != var28; var28 = var28.rest()) {
            var29 = var28.first();
            var26 = Numbers.add(var26, (SubLObject)module0288.ONE_INTEGER);
            if (module0288.NIL != f19308(var25, var26, var6)) {
                var24 = (SubLObject)module0288.NIL;
                var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == f19315(f19303(var29, (SubLObject)module0288.UNPROVIDED)));
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == var24 && module0288.NIL == var23);
    }
    
    public static SubLObject f19388(final SubLObject var119, SubLObject var6) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        if (module0288.NIL != f19385(var119, var6)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)module0288.$ic31$), module0205.f13207(var119, (SubLObject)module0288.UNPROVIDED), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED));
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19389(final SubLObject var119, SubLObject var6, SubLObject var130) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = (SubLObject)module0288.NIL;
        }
        if (var130 == module0288.UNPROVIDED) {
            var130 = Symbols.symbol_function((SubLObject)module0288.$ic0$);
        }
        if (module0288.NIL != f19385(var119, var6)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == Sequences.find_if(var130, module0205.f13207(var119, (SubLObject)module0288.$ic32$), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED));
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19390(final SubLObject var119, SubLObject var6, SubLObject var130) {
        if (var6 == module0288.UNPROVIDED) {
            var6 = module0147.$g2095$.getDynamicValue();
        }
        if (var130 == module0288.UNPROVIDED) {
            var130 = Symbols.symbol_function((SubLObject)module0288.$ic0$);
        }
        if (module0288.NIL != f19389(var119, var6, var130)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0288.NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)module0288.$ic31$), module0205.f13207(var119, (SubLObject)module0288.UNPROVIDED), (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED, (SubLObject)module0288.UNPROVIDED));
        }
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19391() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19301", "S#21920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19302", "S#21921", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19305", "S#21922", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19304", "S#21923", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19306", "S#21924", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19307", "S#21925", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19309", "S#21926", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19311", "S#21927", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19312", "S#21928", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19313", "S#21929", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19314", "S#21930", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19310", "S#21931", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19316", "S#21932", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19315", "S#21933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19317", "S#21934", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19318", "S#21935", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19321", "S#21915", 0, 0, false);
        new $f19321$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19322", "S#21936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19323", "S#21937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19319", "S#21938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19320", "S#21939", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19324", "S#21940", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19325", "S#21941", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19326", "S#21942", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19329", "S#21943", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19327", "S#21944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19331", "S#21916", 0, 0, false);
        new $f19331$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19332", "S#21945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19333", "S#21946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19330", "S#21947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19328", "S#21948", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19334", "S#21949", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19335", "S#21950", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19308", "S#21951", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19336", "S#21952", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19337", "S#21953", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19338", "FIND-ASSERTION-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19339", "S#21954", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19340", "FIND-VISIBLE-ASSERTION-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19303", "S#21955", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19341", "S#21956", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19343", "S#21957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19345", "S#21057", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19346", "S#21958", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19347", "S#21959", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19349", "S#21960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19348", "S#21961", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19350", "S#21962", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19351", "S#21963", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19352", "S#21964", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19353", "S#21965", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19342", "FIND-ASSERTIONS-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19344", "FIND-VISIBLE-ASSERTIONS-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19356", "S#21467", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19357", "S#21966", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19358", "S#21967", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19354", "S#21968", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19355", "S#21969", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19359", "S#21970", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19361", "S#21971", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19362", "S#21972", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19363", "S#21973", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19364", "S#21974", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19365", "S#21975", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19366", "S#21976", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19360", "S#21977", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19367", "S#21487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19371", "S#21978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19372", "S#21979", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19373", "S#21980", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19374", "S#21981", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19375", "S#21982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19377", "S#21983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19376", "S#21984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19369", "S#21985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19378", "S#21986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19370", "S#21987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19368", "S#21988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19380", "S#21989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19381", "S#21990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19383", "S#21991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19384", "S#21992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19379", "S#21993", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19385", "S#21994", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19386", "S#21995", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19387", "S#21996", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19382", "S#21997", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19388", "S#21918", 1, 1, false);
        new $f19388$UnaryFunction();
        new $f19388$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19389", "S#21998", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0288", "f19390", "S#21919", 1, 2, false);
        new $f19390$UnaryFunction();
        new $f19390$BinaryFunction();
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19392() {
        module0288.$g2645$ = SubLFiles.deflexical("S#21999", (SubLObject)module0288.NIL);
        module0288.$g2646$ = SubLFiles.deflexical("S#22000", (SubLObject)module0288.NIL);
        module0288.$g2647$ = SubLFiles.deflexical("S#22001", (SubLObject)module0288.NIL);
        return (SubLObject)module0288.NIL;
    }
    
    public static SubLObject f19393() {
        module0034.f1909((SubLObject)module0288.$ic7$);
        module0034.f1909((SubLObject)module0288.$ic13$);
        module0034.f1909((SubLObject)module0288.$ic17$);
        return (SubLObject)module0288.NIL;
    }
    
    public void declareFunctions() {
        f19391();
    }
    
    public void initializeVariables() {
        f19392();
    }
    
    public void runTopLevelForms() {
        f19393();
    }
    
    static {
        me = (SubLFile)new module0288();
        module0288.$g2645$ = null;
        module0288.$g2646$ = null;
        module0288.$g2647$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic1$ = SubLObjectFactory.makeSymbol("TRUE");
        $ic2$ = SubLObjectFactory.makeSymbol("S#11995", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $ic5$ = SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION?");
        $ic6$ = SubLObjectFactory.makeSymbol("S#16466", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#21938", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#21999", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#21915", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic13$ = SubLObjectFactory.makeSymbol("S#21947", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#22000", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#21916", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic17$ = SubLObjectFactory.makeSymbol("S#21968", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#22001", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#21959", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#21960", "CYC");
        $ic21$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22002", "CYC"));
        $ic22$ = SubLObjectFactory.makeKeyword("ASSERT");
        $ic23$ = SubLObjectFactory.makeString("Cannot set tense czer to invalid mode.");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#21918", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#21982", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#21919", "CYC");
        $ic29$ = SubLObjectFactory.makeString("invalid meta-arg: ~s");
        $ic30$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic31$ = SubLObjectFactory.makeSymbol("S#16400", "CYC");
        $ic32$ = SubLObjectFactory.makeKeyword("REGULARIZE");
    }
    
    public static final class $f19321$ZeroArityFunction extends ZeroArityFunction
    {
        public $f19321$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21915"));
        }
        
        public SubLObject processItem() {
            return module0288.f19321();
        }
    }
    
    public static final class $f19331$ZeroArityFunction extends ZeroArityFunction
    {
        public $f19331$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21916"));
        }
        
        public SubLObject processItem() {
            return module0288.f19331();
        }
    }
    
    public static final class $f19388$UnaryFunction extends UnaryFunction
    {
        public $f19388$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21918"));
        }
        
        public SubLObject processItem(final SubLObject var137) {
            return module0288.f19388(var137, (SubLObject)$f19388$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f19388$BinaryFunction extends BinaryFunction
    {
        public $f19388$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21918"));
        }
        
        public SubLObject processItem(final SubLObject var137, final SubLObject var138) {
            return module0288.f19388(var137, var138);
        }
    }
    
    public static final class $f19390$UnaryFunction extends UnaryFunction
    {
        public $f19390$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21919"));
        }
        
        public SubLObject processItem(final SubLObject var137) {
            return module0288.f19390(var137, (SubLObject)$f19390$UnaryFunction.UNPROVIDED, (SubLObject)$f19390$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f19390$BinaryFunction extends BinaryFunction
    {
        public $f19390$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21919"));
        }
        
        public SubLObject processItem(final SubLObject var137, final SubLObject var138) {
            return module0288.f19390(var137, var138, (SubLObject)$f19390$BinaryFunction.UNPROVIDED);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0288.class
	Total time: 465 ms
	
	Decompiled with Procyon 0.5.32.
*/