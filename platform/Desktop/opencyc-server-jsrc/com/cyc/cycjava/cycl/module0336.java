package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0336 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0336";
    public static final String myFingerPrint = "f1652732e5ae4c3b2bb0bd8c461faf6b590c7dc63e2069125a0b8047ea3db2d1";
    private static SubLSymbol $g2857$;
    private static SubLSymbol $g2858$;
    private static SubLSymbol $g2859$;
    private static SubLSymbol $g2860$;
    private static SubLSymbol $g2861$;
    private static SubLSymbol $g2862$;
    private static SubLSymbol $g2863$;
    private static SubLSymbol $g2864$;
    private static SubLSymbol $g2865$;
    private static SubLSymbol $g2866$;
    private static SubLSymbol $g2867$;
    private static SubLSymbol $g2868$;
    private static SubLSymbol $g2869$;
    private static SubLSymbol $g2870$;
    private static SubLSymbol $g2871$;
    private static SubLSymbol $g2872$;
    private static SubLSymbol $g2873$;
    private static SubLSymbol $g2874$;
    public static SubLSymbol $g2875$;
    private static SubLSymbol $g2876$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    
    public static SubLObject f22597(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != module0018.$g666$.getDynamicValue(var3)) {
            final SubLObject var4 = module0138.$g1628$.currentBinding(var3);
            try {
                module0138.$g1628$.bind(var1, var3);
                if (module0336.NIL != module0211.f13635(var2)) {
                    final SubLObject var5 = module0178.f11287(var2);
                    final SubLObject var4_6 = module0336.$g2857$.currentBinding(var3);
                    final SubLObject var6 = module0336.$g2859$.currentBinding(var3);
                    final SubLObject var7 = module0336.$g2858$.currentBinding(var3);
                    final SubLObject var8 = module0147.$g2094$.currentBinding(var3);
                    final SubLObject var9 = module0147.$g2095$.currentBinding(var3);
                    try {
                        module0336.$g2857$.bind(module0178.f11334(var2), var3);
                        module0336.$g2859$.bind(module0178.f11335(var2), var3);
                        module0336.$g2858$.bind(var2, var3);
                        module0147.$g2094$.bind((SubLObject)module0336.$ic3$, var3);
                        module0147.$g2095$.bind(var5, var3);
                        if (module0225.f14739(module0336.$g2857$.getDynamicValue(var3)).numGE(module0336.$g2859$.getDynamicValue(var3)) || module0336.NIL != module0225.f14775(module0336.$g2857$.getDynamicValue(var3))) {
                            module0219.f14480(Symbols.symbol_function((SubLObject)module0336.$ic4$), module0336.$g2857$.getDynamicValue(var3));
                        }
                    }
                    finally {
                        module0147.$g2095$.rebind(var9, var3);
                        module0147.$g2094$.rebind(var8, var3);
                        module0336.$g2858$.rebind(var7, var3);
                        module0336.$g2859$.rebind(var6, var3);
                        module0336.$g2857$.rebind(var4_6, var3);
                    }
                }
            }
            finally {
                module0138.$g1628$.rebind(var4, var3);
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22598(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != module0228.f15209(var2)) {
            final SubLObject var4 = module0336.$g2862$.currentBinding(var3);
            final SubLObject var5 = module0336.$g2861$.currentBinding(var3);
            final SubLObject var6 = module0336.$g2863$.currentBinding(var3);
            final SubLObject var7 = module0336.$g2873$.currentBinding(var3);
            final SubLObject var8 = module0336.$g2870$.currentBinding(var3);
            try {
                module0336.$g2862$.bind(module0178.f11334(var2), var3);
                module0336.$g2861$.bind(module0178.f11335(var2), var3);
                module0336.$g2863$.bind(module0205.f13362(module0336.$g2861$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED), var3);
                module0336.$g2873$.bind(f22599(module0336.$g2862$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3)), var3);
                module0336.$g2870$.bind((SubLObject)module0336.NIL, var3);
                if (module0336.NIL != module0336.$g2863$.getDynamicValue(var3)) {
                    final SubLObject var4_11 = module0139.$g1659$.currentBinding(var3);
                    try {
                        module0139.$g1659$.bind(module0139.f9007(), var3);
                        final SubLObject var4_12 = module0147.$g2094$.currentBinding(var3);
                        final SubLObject var7_13 = module0147.$g2095$.currentBinding(var3);
                        try {
                            module0147.$g2094$.bind((SubLObject)module0336.$ic6$, var3);
                            module0147.$g2095$.bind(module0336.$ic7$, var3);
                            module0256.f16588(Symbols.symbol_function((SubLObject)module0336.$ic8$), (SubLObject)module0336.$ic9$, module0336.$g2863$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED);
                        }
                        finally {
                            module0147.$g2095$.rebind(var7_13, var3);
                            module0147.$g2094$.rebind(var4_12, var3);
                        }
                        module0139.f9011(module0139.$g1659$.getDynamicValue(var3));
                    }
                    finally {
                        module0139.$g1659$.rebind(var4_11, var3);
                    }
                    f22600();
                }
            }
            finally {
                module0336.$g2870$.rebind(var8, var3);
                module0336.$g2873$.rebind(var7, var3);
                module0336.$g2863$.rebind(var6, var3);
                module0336.$g2861$.rebind(var5, var3);
                module0336.$g2862$.rebind(var4, var3);
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22601(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (!module0336.$g2863$.getDynamicValue(var15).eql(var14)) {
            final SubLObject var16 = module0147.$g2094$.currentBinding(var15);
            final SubLObject var17 = module0147.$g2095$.currentBinding(var15);
            try {
                module0147.$g2094$.bind((SubLObject)module0336.$ic3$, var15);
                module0147.$g2095$.bind(module0147.$g2095$.getDynamicValue(var15), var15);
                f22602(Symbols.symbol_function((SubLObject)module0336.$ic10$), var14, module0336.$g2859$.getDynamicValue(var15), module0336.$g2857$.getDynamicValue(var15));
            }
            finally {
                module0147.$g2095$.rebind(var17, var15);
                module0147.$g2094$.rebind(var16, var15);
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22603(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != assertion_handles_oc.f11035(var2) && module0336.NIL != module0228.f15209(var2) && !module0336.$g2862$.getDynamicValue(var3).eql(module0178.f11334(var2))) {
            final SubLObject var4 = module0178.f11334(var2);
            final SubLObject var5 = module0205.f13362(var4, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
            final SubLObject var6 = (SubLObject)ConsesLow.list(module0336.$ic11$, module0336.$g2862$.getDynamicValue(var3), var4);
            if (module0336.NIL != var5) {
                SubLObject var7 = f22604(module0336.$g2862$.getDynamicValue(var3), var4, module0336.$g2859$.getDynamicValue(var3));
                SubLObject var8 = (SubLObject)module0336.NIL;
                var8 = var7.first();
                while (module0336.NIL != var7) {
                    final SubLObject var9 = module0147.$g2094$.currentBinding(var3);
                    final SubLObject var10 = module0147.$g2095$.currentBinding(var3);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0336.$ic12$, var3);
                        module0147.$g2095$.bind(var8, var3);
                        if (module0336.NIL == module0256.f16596(module0336.$g2862$.getDynamicValue(var3), var4, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
                            module0336.$g2870$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var6, var5, var8), module0336.$g2870$.getDynamicValue(var3)), var3);
                        }
                    }
                    finally {
                        module0147.$g2095$.rebind(var10, var3);
                        module0147.$g2094$.rebind(var9, var3);
                    }
                    var7 = var7.rest();
                    var8 = var7.first();
                }
            }
            module0251.f16241(module0137.f8955(module0336.$ic11$), var5, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED);
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22605(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != module0018.$g666$.getDynamicValue(var3) && module0336.NIL == module0004.f104(var1, module0178.f11299(var2), (SubLObject)module0336.$ic13$, (SubLObject)module0336.UNPROVIDED)) {
            final SubLObject var4 = module0138.$g1628$.currentBinding(var3);
            try {
                module0138.$g1628$.bind(var1, var3);
                if (module0336.NIL != module0211.f13635(var2)) {
                    final SubLObject var5 = module0178.f11287(var2);
                    final SubLObject var6 = module0178.f11334(var2);
                    final SubLObject var7 = module0178.f11335(var2);
                    final SubLObject var8 = module0228.f15205(var6);
                    SubLObject var9 = module0245.f15830(var6, module0336.$ic14$);
                    if (module0336.NIL == var9) {
                        final SubLObject var4_24 = module0147.$g2094$.currentBinding(var3);
                        SubLObject var10 = module0147.$g2095$.currentBinding(var3);
                        try {
                            module0147.$g2094$.bind((SubLObject)module0336.$ic6$, var3);
                            module0147.$g2095$.bind(module0336.$ic7$, var3);
                            var9 = module0004.f104(var7, module0259.f16821(var6, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED), (SubLObject)module0336.$ic13$, (SubLObject)module0336.UNPROVIDED);
                        }
                        finally {
                            module0147.$g2095$.rebind(var10, var3);
                            module0147.$g2094$.rebind(var4_24, var3);
                        }
                        if (module0336.NIL == var9 && module0336.NIL != var8 && module0336.NIL != module0256.f16596(var7, module0336.$ic15$, var5, (SubLObject)module0336.UNPROVIDED)) {
                            final SubLObject var4_25 = module0336.$g2857$.currentBinding(var3);
                            var10 = module0336.$g2862$.currentBinding(var3);
                            final SubLObject var11 = module0336.$g2861$.currentBinding(var3);
                            final SubLObject var12 = module0147.$g2094$.currentBinding(var3);
                            final SubLObject var13 = module0147.$g2095$.currentBinding(var3);
                            try {
                                module0336.$g2857$.bind(module0205.f13276(var8), var3);
                                module0336.$g2862$.bind(var6, var3);
                                module0336.$g2861$.bind(var8, var3);
                                module0147.$g2094$.bind((SubLObject)module0336.$ic6$, var3);
                                module0147.$g2095$.bind(module0336.$ic7$, var3);
                                module0219.f14477(Symbols.symbol_function((SubLObject)module0336.$ic16$), module0336.$g2857$.getDynamicValue(var3), (SubLObject)module0336.ONE_INTEGER, module0336.$ic17$, (SubLObject)module0336.$ic18$, (SubLObject)module0336.UNPROVIDED);
                            }
                            finally {
                                module0147.$g2095$.rebind(var13, var3);
                                module0147.$g2094$.rebind(var12, var3);
                                module0336.$g2861$.rebind(var11, var3);
                                module0336.$g2862$.rebind(var10, var3);
                                module0336.$g2857$.rebind(var4_25, var3);
                            }
                        }
                    }
                }
            }
            finally {
                module0138.$g1628$.rebind(var4, var3);
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22606(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != assertion_handles_oc.f11035(var2)) {
            final SubLObject var4 = module0336.$g2859$.currentBinding(var3);
            try {
                module0336.$g2859$.bind(module0178.f11335(var2), var3);
                if (module0336.$g2859$.getDynamicValue(var3).isInteger()) {
                    final SubLObject var4_28 = module0336.$g2863$.currentBinding(var3);
                    final SubLObject var5 = module0336.$g2858$.currentBinding(var3);
                    final SubLObject var6 = module0336.$g2870$.currentBinding(var3);
                    final SubLObject var7 = module0336.$g2871$.currentBinding(var3);
                    try {
                        module0336.$g2863$.bind(module0205.f13362(module0336.$g2861$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED), var3);
                        module0336.$g2858$.bind(var2, var3);
                        module0336.$g2870$.bind((SubLObject)module0336.NIL, var3);
                        module0336.$g2871$.bind((SubLObject)module0336.NIL, var3);
                        if (module0336.NIL != module0269.f17705(module0336.$g2863$.getDynamicValue(var3))) {
                            module0219.f14480(Symbols.symbol_function((SubLObject)module0336.$ic20$), module0336.$g2857$.getDynamicValue(var3));
                        }
                        f22600();
                        f22607();
                    }
                    finally {
                        module0336.$g2871$.rebind(var7, var3);
                        module0336.$g2870$.rebind(var6, var3);
                        module0336.$g2858$.rebind(var5, var3);
                        module0336.$g2863$.rebind(var4_28, var3);
                    }
                }
            }
            finally {
                module0336.$g2859$.rebind(var4, var3);
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22608(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != module0228.f15209(var2)) {
            final SubLObject var4 = module0178.f11334(var2);
            final SubLObject var5 = module0178.f11335(var2);
            final SubLObject var6 = module0205.f13362(var5, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
            if (!module0336.$g2863$.getDynamicValue(var3).eql(var6)) {
                if (module0336.NIL != module0256.f16576(module0336.$g2863$.getDynamicValue(var3), var6, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
                    SubLObject var7 = f22604(module0336.$g2862$.getDynamicValue(var3), var4, module0336.$g2859$.getDynamicValue(var3));
                    SubLObject var8 = (SubLObject)module0336.NIL;
                    var8 = var7.first();
                    while (module0336.NIL != var7) {
                        final SubLObject var9 = module0147.$g2094$.currentBinding(var3);
                        final SubLObject var10 = module0147.$g2095$.currentBinding(var3);
                        try {
                            module0147.$g2094$.bind((SubLObject)module0336.$ic12$, var3);
                            module0147.$g2095$.bind(var8, var3);
                            if (module0336.NIL == module0256.f16576(module0336.$g2862$.getDynamicValue(var3), var4, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
                                module0336.$g2870$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0336.$ic11$, module0336.$g2862$.getDynamicValue(var3), var4), var6, var8), module0336.$g2870$.getDynamicValue(var3)), var3);
                            }
                        }
                        finally {
                            module0147.$g2095$.rebind(var10, var3);
                            module0147.$g2094$.rebind(var9, var3);
                        }
                        var7 = var7.rest();
                        var8 = var7.first();
                    }
                }
                if (module0336.NIL != module0256.f16576(var6, module0336.$g2863$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
                    SubLObject var7 = f22604(var4, module0336.$g2862$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3));
                    SubLObject var8 = (SubLObject)module0336.NIL;
                    var8 = var7.first();
                    while (module0336.NIL != var7) {
                        final SubLObject var9 = module0147.$g2094$.currentBinding(var3);
                        final SubLObject var10 = module0147.$g2095$.currentBinding(var3);
                        try {
                            module0147.$g2094$.bind((SubLObject)module0336.$ic12$, var3);
                            module0147.$g2095$.bind(var8, var3);
                            if (module0336.NIL == module0256.f16596(var4, module0336.$g2862$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
                                module0336.$g2871$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0336.$ic11$, var4, module0336.$g2862$.getDynamicValue(var3)), var6, var8), module0336.$g2871$.getDynamicValue(var3)), var3);
                            }
                        }
                        finally {
                            module0147.$g2095$.rebind(var10, var3);
                            module0147.$g2094$.rebind(var9, var3);
                        }
                        var7 = var7.rest();
                        var8 = var7.first();
                    }
                }
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22609(final SubLObject var32, final SubLObject var2) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (module0336.NIL != module0018.$g666$.getDynamicValue(var33) && module0336.NIL != f22610(var32, (SubLObject)module0336.UNPROVIDED)) {
            final SubLObject var34 = module0178.f11285(var2);
            final SubLObject var35 = module0178.f11292(var2);
            final SubLObject var36 = module0178.f11287(var2);
            final SubLObject var37 = module0336.$g2867$.currentBinding(var33);
            final SubLObject var38 = module0336.$g2864$.currentBinding(var33);
            try {
                module0336.$g2867$.bind(conses_high.second(var34), var33);
                module0336.$g2864$.bind(conses_high.third(var34), var33);
                if (module0336.NIL == module0226.f15088(var2, var35)) {
                    final SubLObject var4_35 = module0336.$g2868$.currentBinding(var33);
                    final SubLObject var7_36 = module0336.$g2865$.currentBinding(var33);
                    try {
                        module0336.$g2868$.bind(module0228.f15205(module0336.$g2867$.getDynamicValue(var33)), var33);
                        module0336.$g2865$.bind(module0228.f15205(module0336.$g2864$.getDynamicValue(var33)), var33);
                        if (module0336.NIL != module0336.$g2868$.getDynamicValue(var33) && module0336.NIL != module0336.$g2865$.getDynamicValue(var33)) {
                            final SubLObject var4_36 = module0336.$g2857$.currentBinding(var33);
                            try {
                                module0336.$g2857$.bind(module0205.f13276(module0336.$g2868$.getDynamicValue(var33)), var33);
                                if (module0336.$g2857$.getDynamicValue(var33).eql(module0205.f13276(module0336.$g2865$.getDynamicValue(var33)))) {
                                    final SubLObject var4_37 = module0147.$g2094$.currentBinding(var33);
                                    final SubLObject var7_37 = module0147.$g2095$.currentBinding(var33);
                                    try {
                                        module0147.$g2094$.bind((SubLObject)module0336.$ic3$, var33);
                                        module0147.$g2095$.bind(var36, var33);
                                        module0219.f14477(Symbols.symbol_function((SubLObject)module0336.$ic21$), module0336.$g2857$.getDynamicValue(var33), (SubLObject)module0336.ONE_INTEGER, module0336.$ic17$, (SubLObject)module0336.$ic18$, (SubLObject)module0336.UNPROVIDED);
                                    }
                                    finally {
                                        module0147.$g2095$.rebind(var7_37, var33);
                                        module0147.$g2094$.rebind(var4_37, var33);
                                    }
                                }
                            }
                            finally {
                                module0336.$g2857$.rebind(var4_36, var33);
                            }
                        }
                    }
                    finally {
                        module0336.$g2865$.rebind(var7_36, var33);
                        module0336.$g2868$.rebind(var4_35, var33);
                    }
                }
            }
            finally {
                module0336.$g2864$.rebind(var38, var33);
                module0336.$g2867$.rebind(var37, var33);
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22611(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != assertion_handles_oc.f11035(var2) && module0336.NIL == module0342.f23104(var2)) {
            final SubLObject var4 = module0336.$g2859$.currentBinding(var3);
            final SubLObject var5 = module0336.$g2858$.currentBinding(var3);
            final SubLObject var6 = module0336.$g2870$.currentBinding(var3);
            final SubLObject var7 = module0336.$g2871$.currentBinding(var3);
            try {
                module0336.$g2859$.bind(module0178.f11335(var2), var3);
                module0336.$g2858$.bind(var2, var3);
                module0336.$g2870$.bind((SubLObject)module0336.NIL, var3);
                module0336.$g2871$.bind((SubLObject)module0336.NIL, var3);
                if (module0336.$g2859$.getDynamicValue(var3).isInteger()) {
                    final SubLObject var4_40 = module0147.$g2094$.currentBinding(var3);
                    final SubLObject var7_41 = module0147.$g2095$.currentBinding(var3);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0336.$ic6$, var3);
                        module0147.$g2095$.bind(module0336.$ic7$, var3);
                        final SubLObject var8 = module0205.f13362(module0336.$g2868$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                        final SubLObject var4_41 = module0137.$g1605$.currentBinding(var3);
                        try {
                            module0137.$g1605$.bind((module0336.NIL != module0137.f8955(module0336.$ic11$)) ? module0137.f8955(module0336.$ic11$) : module0137.$g1605$.getDynamicValue(var3), var3);
                            final SubLObject var9 = module0228.f15229(module0336.$g2864$.getDynamicValue(var3));
                            if (module0336.NIL != module0138.f8992(var9)) {
                                final SubLObject var10 = module0242.f15664(var9, module0137.f8955(module0336.$ic11$));
                                if (module0336.NIL != var10) {
                                    final SubLObject var11 = module0245.f15834(var10, module0244.f15778(module0137.f8955(module0336.$ic11$)), module0137.f8955(module0336.$ic11$));
                                    if (module0336.NIL != var11) {
                                        SubLObject var12;
                                        for (var12 = module0066.f4838(module0067.f4891(var11)); module0336.NIL == module0066.f4841(var12); var12 = module0066.f4840(var12)) {
                                            var3.resetMultipleValues();
                                            final SubLObject var13 = module0066.f4839(var12);
                                            final SubLObject var14 = var3.secondMultipleValue();
                                            var3.resetMultipleValues();
                                            if (module0336.NIL != module0147.f9507(var13)) {
                                                final SubLObject var4_42 = module0138.$g1623$.currentBinding(var3);
                                                try {
                                                    module0138.$g1623$.bind(var13, var3);
                                                    SubLObject var47_51;
                                                    for (var47_51 = module0066.f4838(module0067.f4891(var14)); module0336.NIL == module0066.f4841(var47_51); var47_51 = module0066.f4840(var47_51)) {
                                                        var3.resetMultipleValues();
                                                        final SubLObject var15 = module0066.f4839(var47_51);
                                                        final SubLObject var16 = var3.secondMultipleValue();
                                                        var3.resetMultipleValues();
                                                        if (module0336.NIL != module0141.f9289(var15)) {
                                                            final SubLObject var4_43 = module0138.$g1624$.currentBinding(var3);
                                                            try {
                                                                module0138.$g1624$.bind(var15, var3);
                                                                final SubLObject var17 = var16;
                                                                if (module0336.NIL != module0077.f5302(var17)) {
                                                                    final SubLObject var18 = module0077.f5333(var17);
                                                                    SubLObject var19;
                                                                    SubLObject var20;
                                                                    SubLObject var21;
                                                                    SubLObject var22;
                                                                    SubLObject var23;
                                                                    SubLObject var24;
                                                                    SubLObject var25;
                                                                    for (var19 = module0032.f1741(var18), var20 = (SubLObject)module0336.NIL, var20 = module0032.f1742(var19, var18); module0336.NIL == module0032.f1744(var19, var20); var20 = module0032.f1743(var20)) {
                                                                        var21 = module0032.f1745(var19, var20);
                                                                        if (module0336.NIL != module0032.f1746(var20, var21)) {
                                                                            var22 = module0228.f15205(var21);
                                                                            if (module0336.NIL != var22 && module0336.$g2857$.getDynamicValue(var3).eql(module0205.f13276(var22))) {
                                                                                var23 = module0205.f13362(var22, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                                                                                var24 = f22612(var8, var23, module0336.$g2867$.getDynamicValue(var3), var21, (SubLObject)module0336.$ic23$, (SubLObject)module0336.UNPROVIDED);
                                                                                if (module0336.NIL != var24) {
                                                                                    var25 = var24;
                                                                                    if (module0336.NIL == conses_high.member(var25, module0336.$g2870$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0336.EQUAL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                                                                                        module0336.$g2870$.setDynamicValue((SubLObject)ConsesLow.cons(var25, module0336.$g2870$.getDynamicValue(var3)), var3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var17.isList()) {
                                                                    SubLObject var26 = var17;
                                                                    SubLObject var27 = (SubLObject)module0336.NIL;
                                                                    var27 = var26.first();
                                                                    while (module0336.NIL != var26) {
                                                                        final SubLObject var28 = module0228.f15205(var27);
                                                                        if (module0336.NIL != var28 && module0336.$g2857$.getDynamicValue(var3).eql(module0205.f13276(var28))) {
                                                                            final SubLObject var29 = module0205.f13362(var28, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                                                                            final SubLObject var30 = f22612(var8, var29, module0336.$g2867$.getDynamicValue(var3), var27, (SubLObject)module0336.$ic23$, (SubLObject)module0336.UNPROVIDED);
                                                                            if (module0336.NIL != var30) {
                                                                                final SubLObject var31 = var30;
                                                                                if (module0336.NIL == conses_high.member(var31, module0336.$g2870$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0336.EQUAL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                                                                                    module0336.$g2870$.setDynamicValue((SubLObject)ConsesLow.cons(var31, module0336.$g2870$.getDynamicValue(var3)), var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        var26 = var26.rest();
                                                                        var27 = var26.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0336.$ic24$, var17);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1624$.rebind(var4_43, var3);
                                                            }
                                                        }
                                                    }
                                                    module0066.f4842(var47_51);
                                                }
                                                finally {
                                                    module0138.$g1623$.rebind(var4_42, var3);
                                                }
                                            }
                                        }
                                        module0066.f4842(var12);
                                    }
                                }
                                else {
                                    module0136.f8870((SubLObject)module0336.FIVE_INTEGER, (SubLObject)module0336.$ic25$, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED);
                                }
                            }
                            else if (module0336.NIL != module0155.f9785(var9, (SubLObject)module0336.UNPROVIDED)) {
                                SubLObject var33;
                                final SubLObject var32 = var33 = ((module0336.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15778(module0137.f8955(module0336.$ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955(module0336.$ic11$))) : module0244.f15760(module0244.f15778(module0137.f8955(module0336.$ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955(module0336.$ic11$)));
                                SubLObject var34 = (SubLObject)module0336.NIL;
                                var34 = var33.first();
                                while (module0336.NIL != var33) {
                                    final SubLObject var4_44 = module0138.$g1625$.currentBinding(var3);
                                    try {
                                        module0138.$g1625$.bind(var34, var3);
                                        final SubLObject var36;
                                        final SubLObject var35 = var36 = Functions.funcall(var34, var9);
                                        if (module0336.NIL != module0077.f5302(var36)) {
                                            final SubLObject var37 = module0077.f5333(var36);
                                            SubLObject var38;
                                            SubLObject var39;
                                            SubLObject var40;
                                            SubLObject var41;
                                            SubLObject var42;
                                            SubLObject var43;
                                            SubLObject var44;
                                            for (var38 = module0032.f1741(var37), var39 = (SubLObject)module0336.NIL, var39 = module0032.f1742(var38, var37); module0336.NIL == module0032.f1744(var38, var39); var39 = module0032.f1743(var39)) {
                                                var40 = module0032.f1745(var38, var39);
                                                if (module0336.NIL != module0032.f1746(var39, var40)) {
                                                    var41 = module0228.f15205(var40);
                                                    if (module0336.NIL != var41 && module0336.$g2857$.getDynamicValue(var3).eql(module0205.f13276(var41))) {
                                                        var42 = module0205.f13362(var41, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                                                        var43 = f22612(var8, var42, module0336.$g2867$.getDynamicValue(var3), var40, (SubLObject)module0336.$ic23$, (SubLObject)module0336.UNPROVIDED);
                                                        if (module0336.NIL != var43) {
                                                            var44 = var43;
                                                            if (module0336.NIL == conses_high.member(var44, module0336.$g2870$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0336.EQUAL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                                                                module0336.$g2870$.setDynamicValue((SubLObject)ConsesLow.cons(var44, module0336.$g2870$.getDynamicValue(var3)), var3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else if (var36.isList()) {
                                            SubLObject var45 = var36;
                                            SubLObject var46 = (SubLObject)module0336.NIL;
                                            var46 = var45.first();
                                            while (module0336.NIL != var45) {
                                                final SubLObject var47 = module0228.f15205(var46);
                                                if (module0336.NIL != var47 && module0336.$g2857$.getDynamicValue(var3).eql(module0205.f13276(var47))) {
                                                    final SubLObject var48 = module0205.f13362(var47, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                                                    final SubLObject var49 = f22612(var8, var48, module0336.$g2867$.getDynamicValue(var3), var46, (SubLObject)module0336.$ic23$, (SubLObject)module0336.UNPROVIDED);
                                                    if (module0336.NIL != var49) {
                                                        final SubLObject var50 = var49;
                                                        if (module0336.NIL == conses_high.member(var50, module0336.$g2870$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0336.EQUAL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                                                            module0336.$g2870$.setDynamicValue((SubLObject)ConsesLow.cons(var50, module0336.$g2870$.getDynamicValue(var3)), var3);
                                                        }
                                                    }
                                                }
                                                var45 = var45.rest();
                                                var46 = var45.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)module0336.$ic24$, var36);
                                        }
                                    }
                                    finally {
                                        module0138.$g1625$.rebind(var4_44, var3);
                                    }
                                    var33 = var33.rest();
                                    var34 = var33.first();
                                }
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var4_41, var3);
                        }
                        final SubLObject var51 = module0205.f13362(module0336.$g2865$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                        final SubLObject var4_45 = module0137.$g1605$.currentBinding(var3);
                        try {
                            module0137.$g1605$.bind((module0336.NIL != module0137.f8955(module0336.$ic11$)) ? module0137.f8955(module0336.$ic11$) : module0137.$g1605$.getDynamicValue(var3), var3);
                            final SubLObject var52 = module0228.f15229(module0336.$g2867$.getDynamicValue(var3));
                            if (module0336.NIL != module0138.f8992(var52)) {
                                final SubLObject var53 = module0242.f15664(var52, module0137.f8955(module0336.$ic11$));
                                if (module0336.NIL != var53) {
                                    final SubLObject var54 = module0245.f15834(var53, module0244.f15780(module0137.f8955(module0336.$ic11$)), module0137.f8955(module0336.$ic11$));
                                    if (module0336.NIL != var54) {
                                        SubLObject var55;
                                        for (var55 = module0066.f4838(module0067.f4891(var54)); module0336.NIL == module0066.f4841(var55); var55 = module0066.f4840(var55)) {
                                            var3.resetMultipleValues();
                                            final SubLObject var56 = module0066.f4839(var55);
                                            final SubLObject var57 = var3.secondMultipleValue();
                                            var3.resetMultipleValues();
                                            if (module0336.NIL != module0147.f9507(var56)) {
                                                final SubLObject var4_46 = module0138.$g1623$.currentBinding(var3);
                                                try {
                                                    module0138.$g1623$.bind(var56, var3);
                                                    SubLObject var47_52;
                                                    for (var47_52 = module0066.f4838(module0067.f4891(var57)); module0336.NIL == module0066.f4841(var47_52); var47_52 = module0066.f4840(var47_52)) {
                                                        var3.resetMultipleValues();
                                                        final SubLObject var58 = module0066.f4839(var47_52);
                                                        final SubLObject var59 = var3.secondMultipleValue();
                                                        var3.resetMultipleValues();
                                                        if (module0336.NIL != module0141.f9289(var58)) {
                                                            final SubLObject var4_47 = module0138.$g1624$.currentBinding(var3);
                                                            try {
                                                                module0138.$g1624$.bind(var58, var3);
                                                                final SubLObject var60 = var59;
                                                                if (module0336.NIL != module0077.f5302(var60)) {
                                                                    final SubLObject var61 = module0077.f5333(var60);
                                                                    SubLObject var62;
                                                                    SubLObject var63;
                                                                    SubLObject var64;
                                                                    SubLObject var65;
                                                                    SubLObject var66;
                                                                    SubLObject var67;
                                                                    SubLObject var68;
                                                                    for (var62 = module0032.f1741(var61), var63 = (SubLObject)module0336.NIL, var63 = module0032.f1742(var62, var61); module0336.NIL == module0032.f1744(var62, var63); var63 = module0032.f1743(var63)) {
                                                                        var64 = module0032.f1745(var62, var63);
                                                                        if (module0336.NIL != module0032.f1746(var63, var64)) {
                                                                            var65 = module0228.f15205(var64);
                                                                            if (module0336.NIL != var65 && module0336.$g2857$.getDynamicValue(var3).eql(module0205.f13276(var65))) {
                                                                                var66 = module0205.f13362(var65, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                                                                                var67 = f22612(var66, var51, var64, module0336.$g2864$.getDynamicValue(var3), (SubLObject)module0336.$ic26$, (SubLObject)module0336.UNPROVIDED);
                                                                                if (module0336.NIL != var67) {
                                                                                    var68 = var67;
                                                                                    if (module0336.NIL == conses_high.member(var68, module0336.$g2871$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0336.EQUAL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                                                                                        module0336.$g2871$.setDynamicValue((SubLObject)ConsesLow.cons(var68, module0336.$g2871$.getDynamicValue(var3)), var3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var60.isList()) {
                                                                    SubLObject var69 = var60;
                                                                    SubLObject var70 = (SubLObject)module0336.NIL;
                                                                    var70 = var69.first();
                                                                    while (module0336.NIL != var69) {
                                                                        final SubLObject var71 = module0228.f15205(var70);
                                                                        if (module0336.NIL != var71 && module0336.$g2857$.getDynamicValue(var3).eql(module0205.f13276(var71))) {
                                                                            final SubLObject var72 = module0205.f13362(var71, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                                                                            final SubLObject var73 = f22612(var72, var51, var70, module0336.$g2864$.getDynamicValue(var3), (SubLObject)module0336.$ic26$, (SubLObject)module0336.UNPROVIDED);
                                                                            if (module0336.NIL != var73) {
                                                                                final SubLObject var74 = var73;
                                                                                if (module0336.NIL == conses_high.member(var74, module0336.$g2871$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0336.EQUAL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                                                                                    module0336.$g2871$.setDynamicValue((SubLObject)ConsesLow.cons(var74, module0336.$g2871$.getDynamicValue(var3)), var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        var69 = var69.rest();
                                                                        var70 = var69.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0336.$ic24$, var60);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1624$.rebind(var4_47, var3);
                                                            }
                                                        }
                                                    }
                                                    module0066.f4842(var47_52);
                                                }
                                                finally {
                                                    module0138.$g1623$.rebind(var4_46, var3);
                                                }
                                            }
                                        }
                                        module0066.f4842(var55);
                                    }
                                }
                                else {
                                    module0136.f8870((SubLObject)module0336.FIVE_INTEGER, (SubLObject)module0336.$ic25$, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED);
                                }
                            }
                            else if (module0336.NIL != module0155.f9785(var52, (SubLObject)module0336.UNPROVIDED)) {
                                SubLObject var76;
                                final SubLObject var75 = var76 = ((module0336.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0336.$ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955(module0336.$ic11$))) : module0244.f15760(module0244.f15780(module0137.f8955(module0336.$ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955(module0336.$ic11$)));
                                SubLObject var77 = (SubLObject)module0336.NIL;
                                var77 = var76.first();
                                while (module0336.NIL != var76) {
                                    final SubLObject var4_48 = module0138.$g1625$.currentBinding(var3);
                                    try {
                                        module0138.$g1625$.bind(var77, var3);
                                        final SubLObject var79;
                                        final SubLObject var78 = var79 = Functions.funcall(var77, var52);
                                        if (module0336.NIL != module0077.f5302(var79)) {
                                            final SubLObject var80 = module0077.f5333(var79);
                                            SubLObject var81;
                                            SubLObject var82;
                                            SubLObject var83;
                                            SubLObject var84;
                                            SubLObject var85;
                                            SubLObject var86;
                                            SubLObject var87;
                                            for (var81 = module0032.f1741(var80), var82 = (SubLObject)module0336.NIL, var82 = module0032.f1742(var81, var80); module0336.NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                var83 = module0032.f1745(var81, var82);
                                                if (module0336.NIL != module0032.f1746(var82, var83)) {
                                                    var84 = module0228.f15205(var83);
                                                    if (module0336.NIL != var84 && module0336.$g2857$.getDynamicValue(var3).eql(module0205.f13276(var84))) {
                                                        var85 = module0205.f13362(var84, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                                                        var86 = f22612(var85, var51, var83, module0336.$g2864$.getDynamicValue(var3), (SubLObject)module0336.$ic26$, (SubLObject)module0336.UNPROVIDED);
                                                        if (module0336.NIL != var86) {
                                                            var87 = var86;
                                                            if (module0336.NIL == conses_high.member(var87, module0336.$g2871$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0336.EQUAL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                                                                module0336.$g2871$.setDynamicValue((SubLObject)ConsesLow.cons(var87, module0336.$g2871$.getDynamicValue(var3)), var3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else if (var79.isList()) {
                                            SubLObject var88 = var79;
                                            SubLObject var89 = (SubLObject)module0336.NIL;
                                            var89 = var88.first();
                                            while (module0336.NIL != var88) {
                                                final SubLObject var90 = module0228.f15205(var89);
                                                if (module0336.NIL != var90 && module0336.$g2857$.getDynamicValue(var3).eql(module0205.f13276(var90))) {
                                                    final SubLObject var91 = module0205.f13362(var90, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
                                                    final SubLObject var92 = f22612(var91, var51, var89, module0336.$g2864$.getDynamicValue(var3), (SubLObject)module0336.$ic26$, (SubLObject)module0336.UNPROVIDED);
                                                    if (module0336.NIL != var92) {
                                                        final SubLObject var93 = var92;
                                                        if (module0336.NIL == conses_high.member(var93, module0336.$g2871$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0336.EQUAL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                                                            module0336.$g2871$.setDynamicValue((SubLObject)ConsesLow.cons(var93, module0336.$g2871$.getDynamicValue(var3)), var3);
                                                        }
                                                    }
                                                }
                                                var88 = var88.rest();
                                                var89 = var88.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)module0336.$ic24$, var79);
                                        }
                                    }
                                    finally {
                                        module0138.$g1625$.rebind(var4_48, var3);
                                    }
                                    var76 = var76.rest();
                                    var77 = var76.first();
                                }
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var4_45, var3);
                        }
                    }
                    finally {
                        module0147.$g2095$.rebind(var7_41, var3);
                        module0147.$g2094$.rebind(var4_40, var3);
                    }
                }
                final SubLObject var4_49 = module0336.$g2863$.currentBinding(var3);
                try {
                    module0336.$g2863$.bind(module0205.f13362(module0336.$g2868$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED), var3);
                    f22600();
                }
                finally {
                    module0336.$g2863$.rebind(var4_49, var3);
                }
                final SubLObject var4_50 = module0336.$g2863$.currentBinding(var3);
                try {
                    module0336.$g2863$.bind(module0205.f13362(module0336.$g2865$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED), var3);
                    f22607();
                }
                finally {
                    module0336.$g2863$.rebind(var4_50, var3);
                }
            }
            finally {
                module0336.$g2871$.rebind(var7, var3);
                module0336.$g2870$.rebind(var6, var3);
                module0336.$g2858$.rebind(var5, var3);
                module0336.$g2859$.rebind(var4, var3);
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22612(final SubLObject var42, final SubLObject var16, final SubLObject var78, final SubLObject var79, final SubLObject var80, SubLObject var81) {
        if (var81 == module0336.UNPROVIDED) {
            var81 = module0336.$g2859$.getDynamicValue();
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = (SubLObject)module0336.NIL;
        if (module0336.NIL != module0256.f16596(var42, var16, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
            SubLObject var84 = f22604(var78, var79, var81);
            SubLObject var85 = (SubLObject)module0336.NIL;
            var85 = var84.first();
            while (module0336.NIL != var84) {
                final SubLObject var86 = module0147.$g2094$.currentBinding(var82);
                final SubLObject var87 = module0147.$g2095$.currentBinding(var82);
                try {
                    module0147.$g2094$.bind((SubLObject)module0336.$ic12$, var82);
                    module0147.$g2095$.bind(var85, var82);
                    final SubLObject var88 = (SubLObject)ConsesLow.list(module0336.$ic11$, var78, var79);
                    SubLObject var89 = (SubLObject)module0336.NIL;
                    if (var80.eql((SubLObject)module0336.$ic23$)) {
                        var89 = var16;
                    }
                    else if (var80.eql((SubLObject)module0336.$ic26$)) {
                        var89 = var42;
                    }
                    if (module0336.NIL != var89) {
                        var83 = (SubLObject)ConsesLow.list(var88, var89, var85);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var87, var82);
                    module0147.$g2094$.rebind(var86, var82);
                }
                var84 = var84.rest();
                var85 = var84.first();
            }
        }
        return var83;
    }
    
    public static SubLObject f22604(final SubLObject var78, final SubLObject var79, final SubLObject var81) {
        final SubLObject var82 = module0228.f15205(var78);
        final SubLObject var83 = module0228.f15205(var79);
        final SubLObject var84 = module0217.f14428((SubLObject)ConsesLow.list(module0336.$ic17$, module0205.f13276(var82), var81));
        final SubLObject var85 = module0256.f16652(module0205.f13362(var82, var81, (SubLObject)module0336.UNPROVIDED), module0205.f13362(var83, var81, (SubLObject)module0336.UNPROVIDED), (SubLObject)module0336.UNPROVIDED);
        SubLObject var86 = (SubLObject)module0336.NIL;
        SubLObject var87 = (SubLObject)module0336.NIL;
        SubLObject var88 = var84;
        SubLObject var89 = (SubLObject)module0336.NIL;
        var89 = var88.first();
        while (module0336.NIL != var88) {
            SubLObject var18_92 = var85;
            SubLObject var90 = (SubLObject)module0336.NIL;
            var90 = var18_92.first();
            while (module0336.NIL != var18_92) {
                final SubLObject var91 = var89;
                if (module0336.NIL == conses_high.member(var91, var90, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                    var90 = (SubLObject)ConsesLow.cons(var91, var90);
                }
                var86 = (SubLObject)ConsesLow.cons(var90, var86);
                var18_92 = var18_92.rest();
                var90 = var18_92.first();
            }
            var88 = var88.rest();
            var89 = var88.first();
        }
        var87 = module0262.f17379(var86);
        return var87;
    }
    
    public static SubLObject f22613(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        if (module0336.NIL != module0018.$g666$.getDynamicValue(var95)) {
            if (module0336.NIL != module0210.f13594(var94)) {
                return f22613(module0172.f10921(var94));
            }
            if (module0336.NIL != module0173.f10955(var94)) {
                final SubLObject var96 = module0336.$g2857$.currentBinding(var95);
                final SubLObject var97 = module0336.$g2872$.currentBinding(var95);
                try {
                    module0336.$g2857$.bind(var94, var95);
                    module0336.$g2872$.bind((SubLObject)module0336.T, var95);
                    module0219.f14477(Symbols.symbol_function((SubLObject)module0336.$ic27$), module0336.$g2857$.getDynamicValue(var95), (SubLObject)module0336.ONE_INTEGER, module0336.$ic17$, (SubLObject)module0336.$ic18$, (SubLObject)module0336.UNPROVIDED);
                }
                finally {
                    module0336.$g2872$.rebind(var97, var95);
                    module0336.$g2857$.rebind(var96, var95);
                }
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22614(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != assertion_handles_oc.f11035(var2)) {
            final SubLObject var4 = module0336.$g2858$.currentBinding(var3);
            final SubLObject var5 = module0336.$g2859$.currentBinding(var3);
            try {
                module0336.$g2858$.bind(var2, var3);
                module0336.$g2859$.bind(module0178.f11335(var2), var3);
                if (module0336.$g2859$.getDynamicValue(var3).isInteger()) {
                    final SubLObject var6 = module0178.f11287(var2);
                    final SubLObject var4_95 = module0147.$g2094$.currentBinding(var3);
                    final SubLObject var7_96 = module0147.$g2095$.currentBinding(var3);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0336.$ic3$, var3);
                        module0147.$g2095$.bind(var6, var3);
                        if (module0225.f14739(module0336.$g2857$.getDynamicValue(var3)).numGE(module0336.$g2859$.getDynamicValue(var3)) || module0336.NIL != module0225.f14775(module0336.$g2857$.getDynamicValue(var3))) {
                            module0219.f14480(Symbols.symbol_function((SubLObject)module0336.$ic4$), module0336.$g2857$.getDynamicValue(var3));
                        }
                    }
                    finally {
                        module0147.$g2095$.rebind(var7_96, var3);
                        module0147.$g2094$.rebind(var4_95, var3);
                    }
                }
            }
            finally {
                module0336.$g2859$.rebind(var5, var3);
                module0336.$g2858$.rebind(var4, var3);
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22615(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0336.NIL != module0018.$g666$.getDynamicValue(var23)) {
            if (module0336.NIL != module0210.f13594(var22)) {
                return f22615(module0172.f10921(var22));
            }
            if (module0336.NIL != module0173.f10955(var22)) {
                final SubLObject var24 = module0336.$g2862$.currentBinding(var23);
                final SubLObject var25 = module0336.$g2861$.currentBinding(var23);
                final SubLObject var26 = module0336.$g2857$.currentBinding(var23);
                final SubLObject var27 = module0336.$g2872$.currentBinding(var23);
                try {
                    module0336.$g2862$.bind(var22, var23);
                    module0336.$g2861$.bind(module0228.f15205(var22), var23);
                    module0336.$g2857$.bind(module0205.f13276(module0336.$g2861$.getDynamicValue(var23)), var23);
                    module0336.$g2872$.bind((SubLObject)module0336.T, var23);
                    module0219.f14477(Symbols.symbol_function((SubLObject)module0336.$ic28$), module0336.$g2857$.getDynamicValue(var23), (SubLObject)module0336.ONE_INTEGER, module0336.$ic17$, (SubLObject)module0336.$ic18$, (SubLObject)module0336.UNPROVIDED);
                }
                finally {
                    module0336.$g2872$.rebind(var27, var23);
                    module0336.$g2857$.rebind(var26, var23);
                    module0336.$g2861$.rebind(var25, var23);
                    module0336.$g2862$.rebind(var24, var23);
                }
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22616(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != assertion_handles_oc.f11035(var2)) {
            final SubLObject var4 = module0336.$g2859$.currentBinding(var3);
            try {
                module0336.$g2859$.bind(module0178.f11335(var2), var3);
                if (module0336.$g2859$.getDynamicValue(var3).isInteger()) {
                    final SubLObject var4_97 = module0336.$g2863$.currentBinding(var3);
                    final SubLObject var5 = module0336.$g2858$.currentBinding(var3);
                    final SubLObject var6 = module0336.$g2873$.currentBinding(var3);
                    final SubLObject var7 = module0336.$g2874$.currentBinding(var3);
                    final SubLObject var8 = module0336.$g2870$.currentBinding(var3);
                    final SubLObject var9 = module0336.$g2871$.currentBinding(var3);
                    try {
                        module0336.$g2863$.bind(module0205.f13362(module0336.$g2861$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED), var3);
                        module0336.$g2858$.bind(var2, var3);
                        module0336.$g2873$.bind(f22599(module0336.$g2862$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3)), var3);
                        module0336.$g2874$.bind(f22617(module0336.$g2862$.getDynamicValue(var3), module0336.$g2859$.getDynamicValue(var3)), var3);
                        module0336.$g2870$.bind((SubLObject)module0336.NIL, var3);
                        module0336.$g2871$.bind((SubLObject)module0336.NIL, var3);
                        module0219.f14480(Symbols.symbol_function((SubLObject)module0336.$ic20$), module0336.$g2857$.getDynamicValue(var3));
                        f22600();
                        f22607();
                    }
                    finally {
                        module0336.$g2871$.rebind(var9, var3);
                        module0336.$g2870$.rebind(var8, var3);
                        module0336.$g2874$.rebind(var7, var3);
                        module0336.$g2873$.rebind(var6, var3);
                        module0336.$g2858$.rebind(var5, var3);
                        module0336.$g2863$.rebind(var4_97, var3);
                    }
                }
            }
            finally {
                module0336.$g2859$.rebind(var4, var3);
            }
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22617(final SubLObject var99, final SubLObject var81) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (module0336.NIL != module0336.$g2872$.getDynamicValue(var100)) {
            SubLObject var101 = (SubLObject)module0336.NIL;
            final SubLObject var102 = module0018.$g590$.currentBinding(var100);
            final SubLObject var103 = module0336.$g2859$.currentBinding(var100);
            final SubLObject var104 = module0018.$g584$.currentBinding(var100);
            try {
                module0018.$g590$.bind((SubLObject)module0336.ONE_INTEGER, var100);
                module0336.$g2859$.bind(var81, var100);
                module0018.$g584$.bind((SubLObject)module0336.NIL, var100);
                module0219.f14477(Symbols.symbol_function((SubLObject)module0336.$ic29$), var99, (SubLObject)module0336.TWO_INTEGER, module0336.$ic11$, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED);
                var101 = module0018.$g584$.getDynamicValue(var100);
            }
            finally {
                module0018.$g584$.rebind(var104, var100);
                module0336.$g2859$.rebind(var103, var100);
                module0018.$g590$.rebind(var102, var100);
            }
            return var101;
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22599(final SubLObject var99, final SubLObject var81) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (module0336.NIL != module0336.$g2872$.getDynamicValue(var100)) {
            SubLObject var101 = (SubLObject)module0336.NIL;
            final SubLObject var102 = module0018.$g590$.currentBinding(var100);
            final SubLObject var103 = module0336.$g2859$.currentBinding(var100);
            final SubLObject var104 = module0018.$g584$.currentBinding(var100);
            try {
                module0018.$g590$.bind((SubLObject)module0336.TWO_INTEGER, var100);
                module0336.$g2859$.bind(var81, var100);
                module0018.$g584$.bind((SubLObject)module0336.NIL, var100);
                module0219.f14477(Symbols.symbol_function((SubLObject)module0336.$ic29$), var99, (SubLObject)module0336.ONE_INTEGER, module0336.$ic11$, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED);
                var101 = module0018.$g584$.getDynamicValue(var100);
            }
            finally {
                module0018.$g584$.rebind(var104, var100);
                module0336.$g2859$.rebind(var103, var100);
                module0018.$g590$.rebind(var102, var100);
            }
            return var101;
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22618(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0336.NIL != f22619(var2, module0336.$g2859$.getDynamicValue(var3))) {
            final SubLObject var4 = module0178.f11331(var2, module0018.$g590$.getDynamicValue(var3));
            final SubLObject var5 = module0205.f13362(var4, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED);
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var4, var5, module0178.f11287(var2)), module0018.$g584$.getDynamicValue(var3)), var3);
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22619(final SubLObject var2, SubLObject var81) {
        if (var81 == module0336.UNPROVIDED) {
            var81 = (SubLObject)module0336.NIL;
        }
        SubLObject var82 = (SubLObject)module0336.NIL;
        if (module0336.NIL == var82) {
            SubLObject var83;
            SubLObject var84;
            for (var83 = module0178.f11299(var2), var84 = (SubLObject)module0336.NIL, var84 = var83.first(); module0336.NIL == var82 && module0336.NIL != var83; var82 = f22610(var84, var81), var83 = var83.rest(), var84 = var83.first()) {}
        }
        return var82;
    }
    
    public static SubLObject f22620(final SubLObject var105) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(var105.isCons() && var105.first() == module0336.$ic30$ && conses_high.second(var105).equal(module0336.$g2876$.getDynamicValue(var106)));
    }
    
    public static SubLObject f22610(final SubLObject var32, SubLObject var81) {
        if (var81 == module0336.UNPROVIDED) {
            var81 = (SubLObject)module0336.NIL;
        }
        if (module0336.NIL != oc_deduction_handles.f11659(var32)) {
            SubLObject var82 = (SubLObject)module0336.NIL;
            SubLObject var83 = Types.sublisp_null(var81);
            if (module0336.NIL == var82) {
                SubLObject var84;
                SubLObject var85;
                for (var84 = module0188.f11770(var32), var85 = (SubLObject)module0336.NIL, var85 = var84.first(); module0336.NIL == var82 && module0336.NIL != var84; var82 = f22620(var85), var84 = var84.rest(), var85 = var84.first()) {}
            }
            if (module0336.NIL != var82) {
                SubLObject var86 = var83;
                if (module0336.NIL == var86) {
                    SubLObject var87 = module0188.f11770(var32);
                    SubLObject var88 = (SubLObject)module0336.NIL;
                    var88 = var87.first();
                    while (module0336.NIL == var86 && module0336.NIL != var87) {
                        if (module0336.NIL != module0178.f11284(var88) && module0336.$ic17$.eql(module0178.f11333(var88))) {
                            var83 = Equality.eq(var81, module0178.f11335(var88));
                            var86 = (SubLObject)module0336.T;
                        }
                        var87 = var87.rest();
                        var88 = var87.first();
                    }
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0336.NIL != var82 && module0336.NIL != var83);
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22600() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0336.NIL;
        SubLObject var5 = (SubLObject)module0336.NIL;
        SubLObject var6 = (SubLObject)module0336.NIL;
        SubLObject var7 = (SubLObject)module0336.NIL;
        SubLObject var8 = module0336.$g2870$.getDynamicValue(var3);
        SubLObject var9 = (SubLObject)module0336.NIL;
        var9 = var8.first();
        while (module0336.NIL != var8) {
            if (module0336.NIL == f22621(var9, module0336.$g2873$.getDynamicValue(var3), (SubLObject)module0336.$ic23$)) {
                final SubLObject var10 = conses_high.second(var9);
                if (module0336.NIL == conses_high.member(var10, var5, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                    var5 = (SubLObject)ConsesLow.cons(var10, var5);
                }
            }
            SubLObject var10 = conses_high.second(var9);
            if (module0336.NIL == conses_high.member(var10, var4, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                var4 = (SubLObject)ConsesLow.cons(var10, var4);
            }
            var10 = conses_high.third(var9);
            if (module0336.NIL == conses_high.member(var10, var6, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        var8 = module0336.$g2873$.getDynamicValue(var3);
        SubLObject var11 = (SubLObject)module0336.NIL;
        var11 = var8.first();
        while (module0336.NIL != var8) {
            SubLObject var10 = conses_high.second(var11);
            if (module0336.NIL == conses_high.member(var10, var4, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                var4 = (SubLObject)ConsesLow.cons(var10, var4);
            }
            var10 = conses_high.third(var11);
            if (module0336.NIL == conses_high.member(var10, var6, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            var8 = var8.rest();
            var11 = var8.first();
        }
        var8 = var6;
        SubLObject var12 = (SubLObject)module0336.NIL;
        var12 = var8.first();
        while (module0336.NIL != var8) {
            var7 = module0256.f16529(var4, var12, (SubLObject)module0336.UNPROVIDED);
            SubLObject var18_113 = module0336.$g2870$.getDynamicValue(var3);
            SubLObject var13 = (SubLObject)module0336.NIL;
            var13 = var18_113.first();
            while (module0336.NIL != var18_113) {
                SubLObject var15;
                final SubLObject var14 = var15 = var13;
                SubLObject var16 = (SubLObject)module0336.NIL;
                SubLObject var17 = (SubLObject)module0336.NIL;
                SubLObject var18 = (SubLObject)module0336.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0336.$ic31$);
                var16 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0336.$ic31$);
                var17 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0336.$ic31$);
                var18 = var15.first();
                var15 = var15.rest();
                if (module0336.NIL == var15) {
                    if (var12.eql(var18) && module0336.NIL != module0004.f104(var17, var7, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED) && module0336.NIL != module0004.f104(var17, var5, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
                        module0538.f33372(var16, var18, (SubLObject)ConsesLow.list(module0336.$g2858$.getDynamicValue(var3), (SubLObject)ConsesLow.listS((SubLObject)module0336.$ic23$, (SubLObject)ConsesLow.list(module0336.$ic11$, module0336.$g2863$.getDynamicValue(var3), var17), var18, (SubLObject)module0336.$ic32$), module0538.f33420((SubLObject)module0336.$ic30$, conses_high.copy_tree(module0336.$g2876$.getDynamicValue(var3)), module0336.$g2875$.getGlobalValue(), (SubLObject)module0336.$ic33$)), (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0336.$ic31$);
                }
                var18_113 = var18_113.rest();
                var13 = var18_113.first();
            }
            SubLObject var18_114 = module0336.$g2873$.getDynamicValue(var3);
            SubLObject var19 = (SubLObject)module0336.NIL;
            var19 = var18_114.first();
            while (module0336.NIL != var18_114) {
                SubLObject var118_119;
                final SubLObject var20 = var118_119 = var19;
                SubLObject var21 = (SubLObject)module0336.NIL;
                SubLObject var17 = (SubLObject)module0336.NIL;
                SubLObject var18 = (SubLObject)module0336.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var118_119, var20, (SubLObject)module0336.$ic34$);
                var21 = var118_119.first();
                var118_119 = var118_119.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var118_119, var20, (SubLObject)module0336.$ic34$);
                var17 = var118_119.first();
                var118_119 = var118_119.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var118_119, var20, (SubLObject)module0336.$ic34$);
                var18 = var118_119.first();
                var118_119 = var118_119.rest();
                if (module0336.NIL == var118_119) {
                    if (var12.eql(var18) && module0336.NIL == module0004.f104(var17, var7, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
                        final SubLObject var22 = module0018.$g666$.currentBinding(var3);
                        try {
                            module0018.$g666$.bind((SubLObject)module0336.NIL, var3);
                            final SubLObject var23 = (SubLObject)ConsesLow.list(module0336.$ic11$, module0336.$g2862$.getDynamicValue(var3), var21);
                            module0538.f33424(var23, var18, (SubLObject)ConsesLow.list(module0336.$g2858$.getDynamicValue(var3), (SubLObject)ConsesLow.listS((SubLObject)module0336.$ic23$, (SubLObject)ConsesLow.list(module0336.$ic11$, module0336.$g2863$.getDynamicValue(var3), var17), var18, (SubLObject)module0336.$ic32$), module0538.f33420((SubLObject)module0336.$ic30$, conses_high.copy_tree(module0336.$g2876$.getDynamicValue(var3)), module0336.$g2875$.getGlobalValue(), (SubLObject)module0336.$ic33$)), (SubLObject)module0336.UNPROVIDED);
                        }
                        finally {
                            module0018.$g666$.rebind(var22, var3);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0336.$ic34$);
                }
                var18_114 = var18_114.rest();
                var19 = var18_114.first();
            }
            var8 = var8.rest();
            var12 = var8.first();
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22607() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0336.NIL;
        SubLObject var5 = (SubLObject)module0336.NIL;
        SubLObject var6 = (SubLObject)module0336.NIL;
        SubLObject var7 = (SubLObject)module0336.NIL;
        SubLObject var8 = module0336.$g2871$.getDynamicValue(var3);
        SubLObject var9 = (SubLObject)module0336.NIL;
        var9 = var8.first();
        while (module0336.NIL != var8) {
            if (module0336.NIL == f22621(var9, module0336.$g2874$.getDynamicValue(var3), (SubLObject)module0336.$ic26$)) {
                final SubLObject var10 = conses_high.second(var9);
                if (module0336.NIL == conses_high.member(var10, var5, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                    var5 = (SubLObject)ConsesLow.cons(var10, var5);
                }
            }
            SubLObject var10 = conses_high.second(var9);
            if (module0336.NIL == conses_high.member(var10, var4, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                var4 = (SubLObject)ConsesLow.cons(var10, var4);
            }
            var10 = conses_high.third(var9);
            if (module0336.NIL == conses_high.member(var10, var6, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        var8 = module0336.$g2874$.getDynamicValue(var3);
        SubLObject var11 = (SubLObject)module0336.NIL;
        var11 = var8.first();
        while (module0336.NIL != var8) {
            SubLObject var10 = conses_high.second(var11);
            if (module0336.NIL == conses_high.member(var10, var4, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                var4 = (SubLObject)ConsesLow.cons(var10, var4);
            }
            var10 = conses_high.third(var11);
            if (module0336.NIL == conses_high.member(var10, var6, Symbols.symbol_function((SubLObject)module0336.EQL), Symbols.symbol_function((SubLObject)module0336.IDENTITY))) {
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            var8 = var8.rest();
            var11 = var8.first();
        }
        var8 = var6;
        SubLObject var12 = (SubLObject)module0336.NIL;
        var12 = var8.first();
        while (module0336.NIL != var8) {
            var7 = module0256.f16538(var4, var12, (SubLObject)module0336.UNPROVIDED);
            SubLObject var18_123 = module0336.$g2871$.getDynamicValue(var3);
            SubLObject var13 = (SubLObject)module0336.NIL;
            var13 = var18_123.first();
            while (module0336.NIL != var18_123) {
                SubLObject var15;
                final SubLObject var14 = var15 = var13;
                SubLObject var16 = (SubLObject)module0336.NIL;
                SubLObject var17 = (SubLObject)module0336.NIL;
                SubLObject var18 = (SubLObject)module0336.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0336.$ic35$);
                var16 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0336.$ic35$);
                var17 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0336.$ic35$);
                var18 = var15.first();
                var15 = var15.rest();
                if (module0336.NIL == var15) {
                    if (var12.eql(var18) && module0336.NIL != module0004.f104(var17, var7, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED) && module0336.NIL != module0004.f104(var17, var5, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
                        module0538.f33372(var16, var18, (SubLObject)ConsesLow.list(module0336.$g2858$.getDynamicValue(var3), (SubLObject)ConsesLow.listS((SubLObject)module0336.$ic23$, (SubLObject)ConsesLow.list(module0336.$ic11$, var17, module0336.$g2863$.getDynamicValue(var3)), var18, (SubLObject)module0336.$ic32$), module0538.f33420((SubLObject)module0336.$ic30$, conses_high.copy_tree(module0336.$g2876$.getDynamicValue(var3)), module0336.$g2875$.getGlobalValue(), (SubLObject)module0336.$ic33$)), (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0336.$ic35$);
                }
                var18_123 = var18_123.rest();
                var13 = var18_123.first();
            }
            SubLObject var18_124 = module0336.$g2874$.getDynamicValue(var3);
            SubLObject var19 = (SubLObject)module0336.NIL;
            var19 = var18_124.first();
            while (module0336.NIL != var18_124) {
                SubLObject var128_129;
                final SubLObject var20 = var128_129 = var19;
                SubLObject var21 = (SubLObject)module0336.NIL;
                SubLObject var17 = (SubLObject)module0336.NIL;
                SubLObject var18 = (SubLObject)module0336.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var128_129, var20, (SubLObject)module0336.$ic36$);
                var21 = var128_129.first();
                var128_129 = var128_129.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var128_129, var20, (SubLObject)module0336.$ic36$);
                var17 = var128_129.first();
                var128_129 = var128_129.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var128_129, var20, (SubLObject)module0336.$ic36$);
                var18 = var128_129.first();
                var128_129 = var128_129.rest();
                if (module0336.NIL == var128_129) {
                    if (var12.eql(var18) && module0336.NIL == module0004.f104(var17, var7, (SubLObject)module0336.UNPROVIDED, (SubLObject)module0336.UNPROVIDED)) {
                        final SubLObject var22 = module0018.$g666$.currentBinding(var3);
                        try {
                            module0018.$g666$.bind((SubLObject)module0336.NIL, var3);
                            final SubLObject var23 = (SubLObject)ConsesLow.list(module0336.$ic11$, var21, module0336.$g2862$.getDynamicValue(var3));
                            module0538.f33424(var23, var18, (SubLObject)ConsesLow.list(module0336.$g2858$.getDynamicValue(var3), (SubLObject)ConsesLow.listS((SubLObject)module0336.$ic23$, (SubLObject)ConsesLow.list(module0336.$ic11$, module0205.f13362(var21, module0336.$g2859$.getDynamicValue(var3), (SubLObject)module0336.UNPROVIDED), module0336.$g2863$.getDynamicValue(var3)), var18, (SubLObject)module0336.$ic32$), module0538.f33420((SubLObject)module0336.$ic30$, conses_high.copy_tree(module0336.$g2876$.getDynamicValue(var3)), module0336.$g2875$.getGlobalValue(), (SubLObject)module0336.$ic33$)), (SubLObject)module0336.UNPROVIDED);
                        }
                        finally {
                            module0018.$g666$.rebind(var22, var3);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0336.$ic36$);
                }
                var18_124 = var18_124.rest();
                var19 = var18_124.first();
            }
            var8 = var8.rest();
            var12 = var8.first();
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22621(final SubLObject var82, final SubLObject var130, final SubLObject var80) {
        if (module0336.NIL != var130) {
            SubLObject var131 = (SubLObject)module0336.NIL;
            SubLObject var132 = (SubLObject)module0336.NIL;
            SubLObject var133 = (SubLObject)module0336.NIL;
            SubLObject var134 = (SubLObject)module0336.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var82, var82, (SubLObject)module0336.$ic37$);
            var132 = var82.first();
            SubLObject var135 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var135, var82, (SubLObject)module0336.$ic37$);
            var133 = var135.first();
            var135 = var135.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var135, var82, (SubLObject)module0336.$ic37$);
            var134 = var135.first();
            var135 = var135.rest();
            if (module0336.NIL == var135) {
                SubLObject var137_138;
                final SubLObject var135_136 = var137_138 = var132;
                SubLObject var136 = (SubLObject)module0336.NIL;
                SubLObject var137 = (SubLObject)module0336.NIL;
                SubLObject var138 = (SubLObject)module0336.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)module0336.$ic38$);
                var136 = var137_138.first();
                var137_138 = var137_138.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)module0336.$ic38$);
                var137 = var137_138.first();
                var137_138 = var137_138.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)module0336.$ic38$);
                var138 = var137_138.first();
                var137_138 = var137_138.rest();
                if (module0336.NIL == var137_138) {
                    if (module0336.NIL == var131) {
                        SubLObject var139 = var130;
                        SubLObject var140 = (SubLObject)module0336.NIL;
                        var140 = var139.first();
                        while (module0336.NIL == var131 && module0336.NIL != var139) {
                            SubLObject var144_145;
                            final SubLObject var142_143 = var144_145 = var140;
                            SubLObject var141 = (SubLObject)module0336.NIL;
                            SubLObject var142 = (SubLObject)module0336.NIL;
                            SubLObject var143 = (SubLObject)module0336.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)module0336.$ic39$);
                            var141 = var144_145.first();
                            var144_145 = var144_145.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)module0336.$ic39$);
                            var142 = var144_145.first();
                            var144_145 = var144_145.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)module0336.$ic39$);
                            var143 = var144_145.first();
                            var144_145 = var144_145.rest();
                            if (module0336.NIL == var144_145) {
                                if (var134.eql(var143)) {
                                    if (var80.eql((SubLObject)module0336.$ic23$)) {
                                        var131 = Equality.eq(var137, var141);
                                    }
                                    else if (var80.eql((SubLObject)module0336.$ic26$)) {
                                        var131 = Equality.eq(var138, var141);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var142_143, (SubLObject)module0336.$ic39$);
                            }
                            var139 = var139.rest();
                            var140 = var139.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var135_136, (SubLObject)module0336.$ic38$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)module0336.$ic37$);
            }
            return var131;
        }
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22622(final SubLObject var130, final SubLObject var149, final SubLObject var80) {
        SubLObject var150 = (SubLObject)module0336.NIL;
        SubLObject var151 = (SubLObject)module0336.NIL;
        SubLObject var152 = (SubLObject)module0336.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var130, var130, (SubLObject)module0336.$ic40$);
        var151 = var130.first();
        SubLObject var153 = var130.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var153, var130, (SubLObject)module0336.$ic40$);
        var152 = var153.first();
        var153 = var153.rest();
        if (module0336.NIL == var153) {
            if (module0336.NIL == var150) {
                SubLObject var154 = var149;
                SubLObject var155 = (SubLObject)module0336.NIL;
                var155 = var154.first();
                while (module0336.NIL == var150 && module0336.NIL != var154) {
                    SubLObject var154_155;
                    final SubLObject var152_153 = var154_155 = var155;
                    SubLObject var156 = (SubLObject)module0336.NIL;
                    SubLObject var157 = (SubLObject)module0336.NIL;
                    SubLObject var158 = (SubLObject)module0336.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var154_155, var152_153, (SubLObject)module0336.$ic37$);
                    var156 = var154_155.first();
                    var154_155 = var154_155.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var154_155, var152_153, (SubLObject)module0336.$ic37$);
                    var157 = var154_155.first();
                    var154_155 = var154_155.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var154_155, var152_153, (SubLObject)module0336.$ic37$);
                    var158 = var154_155.first();
                    var154_155 = var154_155.rest();
                    if (module0336.NIL == var154_155) {
                        if (var158.eql(var152)) {
                            SubLObject var158_159;
                            final SubLObject var156_157 = var158_159 = var156;
                            SubLObject var159 = (SubLObject)module0336.NIL;
                            SubLObject var160 = (SubLObject)module0336.NIL;
                            SubLObject var161 = (SubLObject)module0336.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var158_159, var156_157, (SubLObject)module0336.$ic38$);
                            var159 = var158_159.first();
                            var158_159 = var158_159.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var158_159, var156_157, (SubLObject)module0336.$ic38$);
                            var160 = var158_159.first();
                            var158_159 = var158_159.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var158_159, var156_157, (SubLObject)module0336.$ic38$);
                            var161 = var158_159.first();
                            var158_159 = var158_159.rest();
                            if (module0336.NIL == var158_159) {
                                if (var80.eql((SubLObject)module0336.$ic23$)) {
                                    var150 = Equality.eq(var160, var151);
                                }
                                else if (var80.eql((SubLObject)module0336.$ic26$)) {
                                    var150 = Equality.eq(var161, var151);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var156_157, (SubLObject)module0336.$ic38$);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var152_153, (SubLObject)module0336.$ic37$);
                    }
                    var154 = var154.rest();
                    var155 = var154.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var130, (SubLObject)module0336.$ic40$);
        }
        return var150;
    }
    
    public static SubLObject f22602(final SubLObject var160, final SubLObject var161, final SubLObject var81, final SubLObject var162) {
        return module0219.f14479(var160, var161, var81, var162);
    }
    
    public static SubLObject f22623() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22597", "PGIA-AFTER-ADDING-PGIA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22598", "S#25193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22601", "S#25194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22603", "S#25195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22605", "PGIA-AFTER-ADDING-ISA", 2, 0, false);
        new $f22605$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22606", "S#25196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22608", "S#25197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22609", "PGIA-AFTER-REMOVING-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22611", "S#25198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22612", "S#25199", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22604", "S#25200", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22613", "S#25201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22614", "S#25202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22615", "S#25203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22616", "S#25204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22617", "S#25205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22599", "S#25206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22618", "S#25207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22619", "S#25208", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22620", "S#25209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22610", "S#25210", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22600", "S#25211", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22607", "S#25212", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22621", "S#25213", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22622", "S#25214", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0336", "f22602", "S#25215", 4, 0, false);
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22624() {
        module0336.$g2857$ = SubLFiles.defparameter("S#25216", (SubLObject)module0336.NIL);
        module0336.$g2858$ = SubLFiles.defparameter("S#25217", (SubLObject)module0336.NIL);
        module0336.$g2859$ = SubLFiles.defparameter("S#25218", (SubLObject)module0336.NIL);
        module0336.$g2860$ = SubLFiles.defparameter("S#25219", (SubLObject)module0336.NIL);
        module0336.$g2861$ = SubLFiles.defparameter("S#25220", (SubLObject)module0336.NIL);
        module0336.$g2862$ = SubLFiles.defparameter("S#25221", (SubLObject)module0336.NIL);
        module0336.$g2863$ = SubLFiles.defparameter("S#25222", (SubLObject)module0336.NIL);
        module0336.$g2864$ = SubLFiles.defparameter("S#25223", (SubLObject)module0336.NIL);
        module0336.$g2865$ = SubLFiles.defparameter("S#25224", (SubLObject)module0336.NIL);
        module0336.$g2866$ = SubLFiles.defparameter("S#25225", (SubLObject)module0336.NIL);
        module0336.$g2867$ = SubLFiles.defparameter("S#25226", (SubLObject)module0336.NIL);
        module0336.$g2868$ = SubLFiles.defparameter("S#25227", (SubLObject)module0336.NIL);
        module0336.$g2869$ = SubLFiles.defparameter("S#25228", (SubLObject)module0336.NIL);
        module0336.$g2870$ = SubLFiles.defparameter("S#25229", (SubLObject)module0336.NIL);
        module0336.$g2871$ = SubLFiles.defparameter("S#25230", (SubLObject)module0336.NIL);
        module0336.$g2872$ = SubLFiles.defparameter("S#25231", (SubLObject)module0336.NIL);
        module0336.$g2873$ = SubLFiles.defparameter("S#25232", (SubLObject)module0336.NIL);
        module0336.$g2874$ = SubLFiles.defparameter("S#25233", (SubLObject)module0336.NIL);
        module0336.$g2875$ = SubLFiles.deflexical("S#25234", (module0336.NIL != Symbols.boundp((SubLObject)module0336.$ic0$)) ? module0336.$g2875$.getGlobalValue() : module0336.$ic1$);
        module0336.$g2876$ = SubLFiles.defparameter("S#25235", (SubLObject)module0336.$ic2$);
        return (SubLObject)module0336.NIL;
    }
    
    public static SubLObject f22625() {
        module0003.f57((SubLObject)module0336.$ic0$);
        module0132.f8593((SubLObject)module0336.$ic0$, (SubLObject)module0336.NIL);
        module0012.f416((SubLObject)module0336.$ic5$);
        module0012.f416((SubLObject)module0336.$ic19$);
        module0012.f416((SubLObject)module0336.$ic22$);
        return (SubLObject)module0336.NIL;
    }
    
    public void declareFunctions() {
        f22623();
    }
    
    public void initializeVariables() {
        f22624();
    }
    
    public void runTopLevelForms() {
        f22625();
    }
    
    static {
        me = (SubLFile)new module0336();
        module0336.$g2857$ = null;
        module0336.$g2858$ = null;
        module0336.$g2859$ = null;
        module0336.$g2860$ = null;
        module0336.$g2861$ = null;
        module0336.$g2862$ = null;
        module0336.$g2863$ = null;
        module0336.$g2864$ = null;
        module0336.$g2865$ = null;
        module0336.$g2866$ = null;
        module0336.$g2867$ = null;
        module0336.$g2868$ = null;
        module0336.$g2869$ = null;
        module0336.$g2870$ = null;
        module0336.$g2871$ = null;
        module0336.$g2872$ = null;
        module0336.$g2873$ = null;
        module0336.$g2874$ = null;
        module0336.$g2875$ = null;
        module0336.$g2876$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#25234", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic2$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("preservesGenlsInArg")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)module0336.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)module0336.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)module0336.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT-2"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-2")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-2")));
        $ic3$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#25193", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("PGIA-AFTER-ADDING-PGIA");
        $ic6$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic8$ = SubLObjectFactory.makeSymbol("S#25194", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#18976", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#25195", "CYC");
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("NOT-EQ");
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#25196", "CYC");
        $ic17$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("preservesGenlsInArg"));
        $ic18$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic19$ = SubLObjectFactory.makeSymbol("PGIA-AFTER-ADDING-ISA");
        $ic20$ = SubLObjectFactory.makeSymbol("S#25197", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#25198", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("PGIA-AFTER-REMOVING-GENLS");
        $ic23$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic24$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic25$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic26$ = SubLObjectFactory.makeKeyword("SPECS");
        $ic27$ = SubLObjectFactory.makeSymbol("S#25202", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#25204", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#25207", "CYC");
        $ic30$ = SubLObjectFactory.makeKeyword("CODE");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12459", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25236", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"));
        $ic33$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25237", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25236", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12459", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25238", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25239", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25238", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12459", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12109", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12112", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25240", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25241", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25242", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25240", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25242", "CYC"));
    }
    
    public static final class $f22605$BinaryFunction extends BinaryFunction
    {
        public $f22605$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PGIA-AFTER-ADDING-ISA"));
        }
        
        public SubLObject processItem(final SubLObject var26, final SubLObject var27) {
            return module0336.f22605(var26, var27);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0336.class
	Total time: 797 ms
	
	Decompiled with Procyon 0.5.32.
*/