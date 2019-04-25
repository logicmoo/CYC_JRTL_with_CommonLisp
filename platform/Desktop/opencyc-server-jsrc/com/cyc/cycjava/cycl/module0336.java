package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (NIL != module0018.$g666$.getDynamicValue(var3)) {
            final SubLObject var4 = module0138.$g1628$.currentBinding(var3);
            try {
                module0138.$g1628$.bind(var1, var3);
                if (NIL != module0211.f13635(var2)) {
                    final SubLObject var5 = module0178.f11287(var2);
                    final SubLObject var4_6 = $g2857$.currentBinding(var3);
                    final SubLObject var6 = $g2859$.currentBinding(var3);
                    final SubLObject var7 = $g2858$.currentBinding(var3);
                    final SubLObject var8 = module0147.$g2094$.currentBinding(var3);
                    final SubLObject var9 = module0147.$g2095$.currentBinding(var3);
                    try {
                        $g2857$.bind(module0178.f11334(var2), var3);
                        $g2859$.bind(module0178.f11335(var2), var3);
                        $g2858$.bind(var2, var3);
                        module0147.$g2094$.bind((SubLObject)$ic3$, var3);
                        module0147.$g2095$.bind(var5, var3);
                        if (module0225.f14739($g2857$.getDynamicValue(var3)).numGE($g2859$.getDynamicValue(var3)) || NIL != module0225.f14775($g2857$.getDynamicValue(var3))) {
                            module0219.f14480(Symbols.symbol_function((SubLObject)$ic4$), $g2857$.getDynamicValue(var3));
                        }
                    }
                    finally {
                        module0147.$g2095$.rebind(var9, var3);
                        module0147.$g2094$.rebind(var8, var3);
                        $g2858$.rebind(var7, var3);
                        $g2859$.rebind(var6, var3);
                        $g2857$.rebind(var4_6, var3);
                    }
                }
            }
            finally {
                module0138.$g1628$.rebind(var4, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22598(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0228.f15209(var2)) {
            final SubLObject var4 = $g2862$.currentBinding(var3);
            final SubLObject var5 = $g2861$.currentBinding(var3);
            final SubLObject var6 = $g2863$.currentBinding(var3);
            final SubLObject var7 = $g2873$.currentBinding(var3);
            final SubLObject var8 = $g2870$.currentBinding(var3);
            try {
                $g2862$.bind(module0178.f11334(var2), var3);
                $g2861$.bind(module0178.f11335(var2), var3);
                $g2863$.bind(module0205.f13362($g2861$.getDynamicValue(var3), $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED), var3);
                $g2873$.bind(f22599($g2862$.getDynamicValue(var3), $g2859$.getDynamicValue(var3)), var3);
                $g2870$.bind((SubLObject)NIL, var3);
                if (NIL != $g2863$.getDynamicValue(var3)) {
                    final SubLObject var4_11 = module0139.$g1659$.currentBinding(var3);
                    try {
                        module0139.$g1659$.bind(module0139.f9007(), var3);
                        final SubLObject var4_12 = module0147.$g2094$.currentBinding(var3);
                        final SubLObject var7_13 = module0147.$g2095$.currentBinding(var3);
                        try {
                            module0147.$g2094$.bind((SubLObject)$ic6$, var3);
                            module0147.$g2095$.bind($ic7$, var3);
                            module0256.f16588(Symbols.symbol_function((SubLObject)$ic8$), (SubLObject)$ic9$, $g2863$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                $g2870$.rebind(var8, var3);
                $g2873$.rebind(var7, var3);
                $g2863$.rebind(var6, var3);
                $g2861$.rebind(var5, var3);
                $g2862$.rebind(var4, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22601(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (!$g2863$.getDynamicValue(var15).eql(var14)) {
            final SubLObject var16 = module0147.$g2094$.currentBinding(var15);
            final SubLObject var17 = module0147.$g2095$.currentBinding(var15);
            try {
                module0147.$g2094$.bind((SubLObject)$ic3$, var15);
                module0147.$g2095$.bind(module0147.$g2095$.getDynamicValue(var15), var15);
                f22602(Symbols.symbol_function((SubLObject)$ic10$), var14, $g2859$.getDynamicValue(var15), $g2857$.getDynamicValue(var15));
            }
            finally {
                module0147.$g2095$.rebind(var17, var15);
                module0147.$g2094$.rebind(var16, var15);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22603(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var2) && NIL != module0228.f15209(var2) && !$g2862$.getDynamicValue(var3).eql(module0178.f11334(var2))) {
            final SubLObject var4 = module0178.f11334(var2);
            final SubLObject var5 = module0205.f13362(var4, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
            final SubLObject var6 = (SubLObject)ConsesLow.list($ic11$, $g2862$.getDynamicValue(var3), var4);
            if (NIL != var5) {
                SubLObject var7 = f22604($g2862$.getDynamicValue(var3), var4, $g2859$.getDynamicValue(var3));
                SubLObject var8 = (SubLObject)NIL;
                var8 = var7.first();
                while (NIL != var7) {
                    final SubLObject var9 = module0147.$g2094$.currentBinding(var3);
                    final SubLObject var10 = module0147.$g2095$.currentBinding(var3);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic12$, var3);
                        module0147.$g2095$.bind(var8, var3);
                        if (NIL == module0256.f16596($g2862$.getDynamicValue(var3), var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            $g2870$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var6, var5, var8), $g2870$.getDynamicValue(var3)), var3);
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
            module0251.f16241(module0137.f8955($ic11$), var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22605(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0018.$g666$.getDynamicValue(var3) && NIL == module0004.f104(var1, module0178.f11299(var2), (SubLObject)$ic13$, (SubLObject)UNPROVIDED)) {
            final SubLObject var4 = module0138.$g1628$.currentBinding(var3);
            try {
                module0138.$g1628$.bind(var1, var3);
                if (NIL != module0211.f13635(var2)) {
                    final SubLObject var5 = module0178.f11287(var2);
                    final SubLObject var6 = module0178.f11334(var2);
                    final SubLObject var7 = module0178.f11335(var2);
                    final SubLObject var8 = module0228.f15205(var6);
                    SubLObject var9 = module0245.f15830(var6, $ic14$);
                    if (NIL == var9) {
                        final SubLObject var4_24 = module0147.$g2094$.currentBinding(var3);
                        SubLObject var10 = module0147.$g2095$.currentBinding(var3);
                        try {
                            module0147.$g2094$.bind((SubLObject)$ic6$, var3);
                            module0147.$g2095$.bind($ic7$, var3);
                            var9 = module0004.f104(var7, module0259.f16821(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic13$, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0147.$g2095$.rebind(var10, var3);
                            module0147.$g2094$.rebind(var4_24, var3);
                        }
                        if (NIL == var9 && NIL != var8 && NIL != module0256.f16596(var7, $ic15$, var5, (SubLObject)UNPROVIDED)) {
                            final SubLObject var4_25 = $g2857$.currentBinding(var3);
                            var10 = $g2862$.currentBinding(var3);
                            final SubLObject var11 = $g2861$.currentBinding(var3);
                            final SubLObject var12 = module0147.$g2094$.currentBinding(var3);
                            final SubLObject var13 = module0147.$g2095$.currentBinding(var3);
                            try {
                                $g2857$.bind(module0205.f13276(var8), var3);
                                $g2862$.bind(var6, var3);
                                $g2861$.bind(var8, var3);
                                module0147.$g2094$.bind((SubLObject)$ic6$, var3);
                                module0147.$g2095$.bind($ic7$, var3);
                                module0219.f14477(Symbols.symbol_function((SubLObject)$ic16$), $g2857$.getDynamicValue(var3), (SubLObject)ONE_INTEGER, $ic17$, (SubLObject)$ic18$, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0147.$g2095$.rebind(var13, var3);
                                module0147.$g2094$.rebind(var12, var3);
                                $g2861$.rebind(var11, var3);
                                $g2862$.rebind(var10, var3);
                                $g2857$.rebind(var4_25, var3);
                            }
                        }
                    }
                }
            }
            finally {
                module0138.$g1628$.rebind(var4, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22606(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var2)) {
            final SubLObject var4 = $g2859$.currentBinding(var3);
            try {
                $g2859$.bind(module0178.f11335(var2), var3);
                if ($g2859$.getDynamicValue(var3).isInteger()) {
                    final SubLObject var4_28 = $g2863$.currentBinding(var3);
                    final SubLObject var5 = $g2858$.currentBinding(var3);
                    final SubLObject var6 = $g2870$.currentBinding(var3);
                    final SubLObject var7 = $g2871$.currentBinding(var3);
                    try {
                        $g2863$.bind(module0205.f13362($g2861$.getDynamicValue(var3), $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED), var3);
                        $g2858$.bind(var2, var3);
                        $g2870$.bind((SubLObject)NIL, var3);
                        $g2871$.bind((SubLObject)NIL, var3);
                        if (NIL != module0269.f17705($g2863$.getDynamicValue(var3))) {
                            module0219.f14480(Symbols.symbol_function((SubLObject)$ic20$), $g2857$.getDynamicValue(var3));
                        }
                        f22600();
                        f22607();
                    }
                    finally {
                        $g2871$.rebind(var7, var3);
                        $g2870$.rebind(var6, var3);
                        $g2858$.rebind(var5, var3);
                        $g2863$.rebind(var4_28, var3);
                    }
                }
            }
            finally {
                $g2859$.rebind(var4, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22608(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0228.f15209(var2)) {
            final SubLObject var4 = module0178.f11334(var2);
            final SubLObject var5 = module0178.f11335(var2);
            final SubLObject var6 = module0205.f13362(var5, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
            if (!$g2863$.getDynamicValue(var3).eql(var6)) {
                if (NIL != module0256.f16576($g2863$.getDynamicValue(var3), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    SubLObject var7 = f22604($g2862$.getDynamicValue(var3), var4, $g2859$.getDynamicValue(var3));
                    SubLObject var8 = (SubLObject)NIL;
                    var8 = var7.first();
                    while (NIL != var7) {
                        final SubLObject var9 = module0147.$g2094$.currentBinding(var3);
                        final SubLObject var10 = module0147.$g2095$.currentBinding(var3);
                        try {
                            module0147.$g2094$.bind((SubLObject)$ic12$, var3);
                            module0147.$g2095$.bind(var8, var3);
                            if (NIL == module0256.f16576($g2862$.getDynamicValue(var3), var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                $g2870$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list($ic11$, $g2862$.getDynamicValue(var3), var4), var6, var8), $g2870$.getDynamicValue(var3)), var3);
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
                if (NIL != module0256.f16576(var6, $g2863$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    SubLObject var7 = f22604(var4, $g2862$.getDynamicValue(var3), $g2859$.getDynamicValue(var3));
                    SubLObject var8 = (SubLObject)NIL;
                    var8 = var7.first();
                    while (NIL != var7) {
                        final SubLObject var9 = module0147.$g2094$.currentBinding(var3);
                        final SubLObject var10 = module0147.$g2095$.currentBinding(var3);
                        try {
                            module0147.$g2094$.bind((SubLObject)$ic12$, var3);
                            module0147.$g2095$.bind(var8, var3);
                            if (NIL == module0256.f16596(var4, $g2862$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                $g2871$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list($ic11$, var4, $g2862$.getDynamicValue(var3)), var6, var8), $g2871$.getDynamicValue(var3)), var3);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22609(final SubLObject var32, final SubLObject var2) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (NIL != module0018.$g666$.getDynamicValue(var33) && NIL != f22610(var32, (SubLObject)UNPROVIDED)) {
            final SubLObject var34 = module0178.f11285(var2);
            final SubLObject var35 = module0178.f11292(var2);
            final SubLObject var36 = module0178.f11287(var2);
            final SubLObject var37 = $g2867$.currentBinding(var33);
            final SubLObject var38 = $g2864$.currentBinding(var33);
            try {
                $g2867$.bind(conses_high.second(var34), var33);
                $g2864$.bind(conses_high.third(var34), var33);
                if (NIL == module0226.f15088(var2, var35)) {
                    final SubLObject var4_35 = $g2868$.currentBinding(var33);
                    final SubLObject var7_36 = $g2865$.currentBinding(var33);
                    try {
                        $g2868$.bind(module0228.f15205($g2867$.getDynamicValue(var33)), var33);
                        $g2865$.bind(module0228.f15205($g2864$.getDynamicValue(var33)), var33);
                        if (NIL != $g2868$.getDynamicValue(var33) && NIL != $g2865$.getDynamicValue(var33)) {
                            final SubLObject var4_36 = $g2857$.currentBinding(var33);
                            try {
                                $g2857$.bind(module0205.f13276($g2868$.getDynamicValue(var33)), var33);
                                if ($g2857$.getDynamicValue(var33).eql(module0205.f13276($g2865$.getDynamicValue(var33)))) {
                                    final SubLObject var4_37 = module0147.$g2094$.currentBinding(var33);
                                    final SubLObject var7_37 = module0147.$g2095$.currentBinding(var33);
                                    try {
                                        module0147.$g2094$.bind((SubLObject)$ic3$, var33);
                                        module0147.$g2095$.bind(var36, var33);
                                        module0219.f14477(Symbols.symbol_function((SubLObject)$ic21$), $g2857$.getDynamicValue(var33), (SubLObject)ONE_INTEGER, $ic17$, (SubLObject)$ic18$, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0147.$g2095$.rebind(var7_37, var33);
                                        module0147.$g2094$.rebind(var4_37, var33);
                                    }
                                }
                            }
                            finally {
                                $g2857$.rebind(var4_36, var33);
                            }
                        }
                    }
                    finally {
                        $g2865$.rebind(var7_36, var33);
                        $g2868$.rebind(var4_35, var33);
                    }
                }
            }
            finally {
                $g2864$.rebind(var38, var33);
                $g2867$.rebind(var37, var33);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22611(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var2) && NIL == module0342.f23104(var2)) {
            final SubLObject var4 = $g2859$.currentBinding(var3);
            final SubLObject var5 = $g2858$.currentBinding(var3);
            final SubLObject var6 = $g2870$.currentBinding(var3);
            final SubLObject var7 = $g2871$.currentBinding(var3);
            try {
                $g2859$.bind(module0178.f11335(var2), var3);
                $g2858$.bind(var2, var3);
                $g2870$.bind((SubLObject)NIL, var3);
                $g2871$.bind((SubLObject)NIL, var3);
                if ($g2859$.getDynamicValue(var3).isInteger()) {
                    final SubLObject var4_40 = module0147.$g2094$.currentBinding(var3);
                    final SubLObject var7_41 = module0147.$g2095$.currentBinding(var3);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic6$, var3);
                        module0147.$g2095$.bind($ic7$, var3);
                        final SubLObject var8 = module0205.f13362($g2868$.getDynamicValue(var3), $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                        final SubLObject var4_41 = module0137.$g1605$.currentBinding(var3);
                        try {
                            module0137.$g1605$.bind((NIL != module0137.f8955($ic11$)) ? module0137.f8955($ic11$) : module0137.$g1605$.getDynamicValue(var3), var3);
                            final SubLObject var9 = module0228.f15229($g2864$.getDynamicValue(var3));
                            if (NIL != module0138.f8992(var9)) {
                                final SubLObject var10 = module0242.f15664(var9, module0137.f8955($ic11$));
                                if (NIL != var10) {
                                    final SubLObject var11 = module0245.f15834(var10, module0244.f15778(module0137.f8955($ic11$)), module0137.f8955($ic11$));
                                    if (NIL != var11) {
                                        SubLObject var12;
                                        for (var12 = module0066.f4838(module0067.f4891(var11)); NIL == module0066.f4841(var12); var12 = module0066.f4840(var12)) {
                                            var3.resetMultipleValues();
                                            final SubLObject var13 = module0066.f4839(var12);
                                            final SubLObject var14 = var3.secondMultipleValue();
                                            var3.resetMultipleValues();
                                            if (NIL != module0147.f9507(var13)) {
                                                final SubLObject var4_42 = module0138.$g1623$.currentBinding(var3);
                                                try {
                                                    module0138.$g1623$.bind(var13, var3);
                                                    SubLObject var47_51;
                                                    for (var47_51 = module0066.f4838(module0067.f4891(var14)); NIL == module0066.f4841(var47_51); var47_51 = module0066.f4840(var47_51)) {
                                                        var3.resetMultipleValues();
                                                        final SubLObject var15 = module0066.f4839(var47_51);
                                                        final SubLObject var16 = var3.secondMultipleValue();
                                                        var3.resetMultipleValues();
                                                        if (NIL != module0141.f9289(var15)) {
                                                            final SubLObject var4_43 = module0138.$g1624$.currentBinding(var3);
                                                            try {
                                                                module0138.$g1624$.bind(var15, var3);
                                                                final SubLObject var17 = var16;
                                                                if (NIL != module0077.f5302(var17)) {
                                                                    final SubLObject var18 = module0077.f5333(var17);
                                                                    SubLObject var19;
                                                                    SubLObject var20;
                                                                    SubLObject var21;
                                                                    SubLObject var22;
                                                                    SubLObject var23;
                                                                    SubLObject var24;
                                                                    SubLObject var25;
                                                                    for (var19 = module0032.f1741(var18), var20 = (SubLObject)NIL, var20 = module0032.f1742(var19, var18); NIL == module0032.f1744(var19, var20); var20 = module0032.f1743(var20)) {
                                                                        var21 = module0032.f1745(var19, var20);
                                                                        if (NIL != module0032.f1746(var20, var21)) {
                                                                            var22 = module0228.f15205(var21);
                                                                            if (NIL != var22 && $g2857$.getDynamicValue(var3).eql(module0205.f13276(var22))) {
                                                                                var23 = module0205.f13362(var22, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                                                                                var24 = f22612(var8, var23, $g2867$.getDynamicValue(var3), var21, (SubLObject)$ic23$, (SubLObject)UNPROVIDED);
                                                                                if (NIL != var24) {
                                                                                    var25 = var24;
                                                                                    if (NIL == conses_high.member(var25, $g2870$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                                                        $g2870$.setDynamicValue((SubLObject)ConsesLow.cons(var25, $g2870$.getDynamicValue(var3)), var3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var17.isList()) {
                                                                    SubLObject var26 = var17;
                                                                    SubLObject var27 = (SubLObject)NIL;
                                                                    var27 = var26.first();
                                                                    while (NIL != var26) {
                                                                        final SubLObject var28 = module0228.f15205(var27);
                                                                        if (NIL != var28 && $g2857$.getDynamicValue(var3).eql(module0205.f13276(var28))) {
                                                                            final SubLObject var29 = module0205.f13362(var28, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                                                                            final SubLObject var30 = f22612(var8, var29, $g2867$.getDynamicValue(var3), var27, (SubLObject)$ic23$, (SubLObject)UNPROVIDED);
                                                                            if (NIL != var30) {
                                                                                final SubLObject var31 = var30;
                                                                                if (NIL == conses_high.member(var31, $g2870$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                                                    $g2870$.setDynamicValue((SubLObject)ConsesLow.cons(var31, $g2870$.getDynamicValue(var3)), var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        var26 = var26.rest();
                                                                        var27 = var26.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic24$, var17);
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
                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                            else if (NIL != module0155.f9785(var9, (SubLObject)UNPROVIDED)) {
                                SubLObject var33;
                                final SubLObject var32 = var33 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15778(module0137.f8955($ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955($ic11$))) : module0244.f15760(module0244.f15778(module0137.f8955($ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955($ic11$)));
                                SubLObject var34 = (SubLObject)NIL;
                                var34 = var33.first();
                                while (NIL != var33) {
                                    final SubLObject var4_44 = module0138.$g1625$.currentBinding(var3);
                                    try {
                                        module0138.$g1625$.bind(var34, var3);
                                        final SubLObject var36;
                                        final SubLObject var35 = var36 = Functions.funcall(var34, var9);
                                        if (NIL != module0077.f5302(var36)) {
                                            final SubLObject var37 = module0077.f5333(var36);
                                            SubLObject var38;
                                            SubLObject var39;
                                            SubLObject var40;
                                            SubLObject var41;
                                            SubLObject var42;
                                            SubLObject var43;
                                            SubLObject var44;
                                            for (var38 = module0032.f1741(var37), var39 = (SubLObject)NIL, var39 = module0032.f1742(var38, var37); NIL == module0032.f1744(var38, var39); var39 = module0032.f1743(var39)) {
                                                var40 = module0032.f1745(var38, var39);
                                                if (NIL != module0032.f1746(var39, var40)) {
                                                    var41 = module0228.f15205(var40);
                                                    if (NIL != var41 && $g2857$.getDynamicValue(var3).eql(module0205.f13276(var41))) {
                                                        var42 = module0205.f13362(var41, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                                                        var43 = f22612(var8, var42, $g2867$.getDynamicValue(var3), var40, (SubLObject)$ic23$, (SubLObject)UNPROVIDED);
                                                        if (NIL != var43) {
                                                            var44 = var43;
                                                            if (NIL == conses_high.member(var44, $g2870$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                                $g2870$.setDynamicValue((SubLObject)ConsesLow.cons(var44, $g2870$.getDynamicValue(var3)), var3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else if (var36.isList()) {
                                            SubLObject var45 = var36;
                                            SubLObject var46 = (SubLObject)NIL;
                                            var46 = var45.first();
                                            while (NIL != var45) {
                                                final SubLObject var47 = module0228.f15205(var46);
                                                if (NIL != var47 && $g2857$.getDynamicValue(var3).eql(module0205.f13276(var47))) {
                                                    final SubLObject var48 = module0205.f13362(var47, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                                                    final SubLObject var49 = f22612(var8, var48, $g2867$.getDynamicValue(var3), var46, (SubLObject)$ic23$, (SubLObject)UNPROVIDED);
                                                    if (NIL != var49) {
                                                        final SubLObject var50 = var49;
                                                        if (NIL == conses_high.member(var50, $g2870$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                            $g2870$.setDynamicValue((SubLObject)ConsesLow.cons(var50, $g2870$.getDynamicValue(var3)), var3);
                                                        }
                                                    }
                                                }
                                                var45 = var45.rest();
                                                var46 = var45.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)$ic24$, var36);
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
                        final SubLObject var51 = module0205.f13362($g2865$.getDynamicValue(var3), $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                        final SubLObject var4_45 = module0137.$g1605$.currentBinding(var3);
                        try {
                            module0137.$g1605$.bind((NIL != module0137.f8955($ic11$)) ? module0137.f8955($ic11$) : module0137.$g1605$.getDynamicValue(var3), var3);
                            final SubLObject var52 = module0228.f15229($g2867$.getDynamicValue(var3));
                            if (NIL != module0138.f8992(var52)) {
                                final SubLObject var53 = module0242.f15664(var52, module0137.f8955($ic11$));
                                if (NIL != var53) {
                                    final SubLObject var54 = module0245.f15834(var53, module0244.f15780(module0137.f8955($ic11$)), module0137.f8955($ic11$));
                                    if (NIL != var54) {
                                        SubLObject var55;
                                        for (var55 = module0066.f4838(module0067.f4891(var54)); NIL == module0066.f4841(var55); var55 = module0066.f4840(var55)) {
                                            var3.resetMultipleValues();
                                            final SubLObject var56 = module0066.f4839(var55);
                                            final SubLObject var57 = var3.secondMultipleValue();
                                            var3.resetMultipleValues();
                                            if (NIL != module0147.f9507(var56)) {
                                                final SubLObject var4_46 = module0138.$g1623$.currentBinding(var3);
                                                try {
                                                    module0138.$g1623$.bind(var56, var3);
                                                    SubLObject var47_52;
                                                    for (var47_52 = module0066.f4838(module0067.f4891(var57)); NIL == module0066.f4841(var47_52); var47_52 = module0066.f4840(var47_52)) {
                                                        var3.resetMultipleValues();
                                                        final SubLObject var58 = module0066.f4839(var47_52);
                                                        final SubLObject var59 = var3.secondMultipleValue();
                                                        var3.resetMultipleValues();
                                                        if (NIL != module0141.f9289(var58)) {
                                                            final SubLObject var4_47 = module0138.$g1624$.currentBinding(var3);
                                                            try {
                                                                module0138.$g1624$.bind(var58, var3);
                                                                final SubLObject var60 = var59;
                                                                if (NIL != module0077.f5302(var60)) {
                                                                    final SubLObject var61 = module0077.f5333(var60);
                                                                    SubLObject var62;
                                                                    SubLObject var63;
                                                                    SubLObject var64;
                                                                    SubLObject var65;
                                                                    SubLObject var66;
                                                                    SubLObject var67;
                                                                    SubLObject var68;
                                                                    for (var62 = module0032.f1741(var61), var63 = (SubLObject)NIL, var63 = module0032.f1742(var62, var61); NIL == module0032.f1744(var62, var63); var63 = module0032.f1743(var63)) {
                                                                        var64 = module0032.f1745(var62, var63);
                                                                        if (NIL != module0032.f1746(var63, var64)) {
                                                                            var65 = module0228.f15205(var64);
                                                                            if (NIL != var65 && $g2857$.getDynamicValue(var3).eql(module0205.f13276(var65))) {
                                                                                var66 = module0205.f13362(var65, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                                                                                var67 = f22612(var66, var51, var64, $g2864$.getDynamicValue(var3), (SubLObject)$ic26$, (SubLObject)UNPROVIDED);
                                                                                if (NIL != var67) {
                                                                                    var68 = var67;
                                                                                    if (NIL == conses_high.member(var68, $g2871$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                                                        $g2871$.setDynamicValue((SubLObject)ConsesLow.cons(var68, $g2871$.getDynamicValue(var3)), var3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var60.isList()) {
                                                                    SubLObject var69 = var60;
                                                                    SubLObject var70 = (SubLObject)NIL;
                                                                    var70 = var69.first();
                                                                    while (NIL != var69) {
                                                                        final SubLObject var71 = module0228.f15205(var70);
                                                                        if (NIL != var71 && $g2857$.getDynamicValue(var3).eql(module0205.f13276(var71))) {
                                                                            final SubLObject var72 = module0205.f13362(var71, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                                                                            final SubLObject var73 = f22612(var72, var51, var70, $g2864$.getDynamicValue(var3), (SubLObject)$ic26$, (SubLObject)UNPROVIDED);
                                                                            if (NIL != var73) {
                                                                                final SubLObject var74 = var73;
                                                                                if (NIL == conses_high.member(var74, $g2871$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                                                    $g2871$.setDynamicValue((SubLObject)ConsesLow.cons(var74, $g2871$.getDynamicValue(var3)), var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        var69 = var69.rest();
                                                                        var70 = var69.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic24$, var60);
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
                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                            else if (NIL != module0155.f9785(var52, (SubLObject)UNPROVIDED)) {
                                SubLObject var76;
                                final SubLObject var75 = var76 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955($ic11$))) : module0244.f15760(module0244.f15780(module0137.f8955($ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955($ic11$)));
                                SubLObject var77 = (SubLObject)NIL;
                                var77 = var76.first();
                                while (NIL != var76) {
                                    final SubLObject var4_48 = module0138.$g1625$.currentBinding(var3);
                                    try {
                                        module0138.$g1625$.bind(var77, var3);
                                        final SubLObject var79;
                                        final SubLObject var78 = var79 = Functions.funcall(var77, var52);
                                        if (NIL != module0077.f5302(var79)) {
                                            final SubLObject var80 = module0077.f5333(var79);
                                            SubLObject var81;
                                            SubLObject var82;
                                            SubLObject var83;
                                            SubLObject var84;
                                            SubLObject var85;
                                            SubLObject var86;
                                            SubLObject var87;
                                            for (var81 = module0032.f1741(var80), var82 = (SubLObject)NIL, var82 = module0032.f1742(var81, var80); NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                var83 = module0032.f1745(var81, var82);
                                                if (NIL != module0032.f1746(var82, var83)) {
                                                    var84 = module0228.f15205(var83);
                                                    if (NIL != var84 && $g2857$.getDynamicValue(var3).eql(module0205.f13276(var84))) {
                                                        var85 = module0205.f13362(var84, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                                                        var86 = f22612(var85, var51, var83, $g2864$.getDynamicValue(var3), (SubLObject)$ic26$, (SubLObject)UNPROVIDED);
                                                        if (NIL != var86) {
                                                            var87 = var86;
                                                            if (NIL == conses_high.member(var87, $g2871$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                                $g2871$.setDynamicValue((SubLObject)ConsesLow.cons(var87, $g2871$.getDynamicValue(var3)), var3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else if (var79.isList()) {
                                            SubLObject var88 = var79;
                                            SubLObject var89 = (SubLObject)NIL;
                                            var89 = var88.first();
                                            while (NIL != var88) {
                                                final SubLObject var90 = module0228.f15205(var89);
                                                if (NIL != var90 && $g2857$.getDynamicValue(var3).eql(module0205.f13276(var90))) {
                                                    final SubLObject var91 = module0205.f13362(var90, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
                                                    final SubLObject var92 = f22612(var91, var51, var89, $g2864$.getDynamicValue(var3), (SubLObject)$ic26$, (SubLObject)UNPROVIDED);
                                                    if (NIL != var92) {
                                                        final SubLObject var93 = var92;
                                                        if (NIL == conses_high.member(var93, $g2871$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                            $g2871$.setDynamicValue((SubLObject)ConsesLow.cons(var93, $g2871$.getDynamicValue(var3)), var3);
                                                        }
                                                    }
                                                }
                                                var88 = var88.rest();
                                                var89 = var88.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)$ic24$, var79);
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
                final SubLObject var4_49 = $g2863$.currentBinding(var3);
                try {
                    $g2863$.bind(module0205.f13362($g2868$.getDynamicValue(var3), $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED), var3);
                    f22600();
                }
                finally {
                    $g2863$.rebind(var4_49, var3);
                }
                final SubLObject var4_50 = $g2863$.currentBinding(var3);
                try {
                    $g2863$.bind(module0205.f13362($g2865$.getDynamicValue(var3), $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED), var3);
                    f22607();
                }
                finally {
                    $g2863$.rebind(var4_50, var3);
                }
            }
            finally {
                $g2871$.rebind(var7, var3);
                $g2870$.rebind(var6, var3);
                $g2858$.rebind(var5, var3);
                $g2859$.rebind(var4, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22612(final SubLObject var42, final SubLObject var16, final SubLObject var78, final SubLObject var79, final SubLObject var80, SubLObject var81) {
        if (var81 == UNPROVIDED) {
            var81 = $g2859$.getDynamicValue();
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = (SubLObject)NIL;
        if (NIL != module0256.f16596(var42, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var84 = f22604(var78, var79, var81);
            SubLObject var85 = (SubLObject)NIL;
            var85 = var84.first();
            while (NIL != var84) {
                final SubLObject var86 = module0147.$g2094$.currentBinding(var82);
                final SubLObject var87 = module0147.$g2095$.currentBinding(var82);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic12$, var82);
                    module0147.$g2095$.bind(var85, var82);
                    final SubLObject var88 = (SubLObject)ConsesLow.list($ic11$, var78, var79);
                    SubLObject var89 = (SubLObject)NIL;
                    if (var80.eql((SubLObject)$ic23$)) {
                        var89 = var16;
                    }
                    else if (var80.eql((SubLObject)$ic26$)) {
                        var89 = var42;
                    }
                    if (NIL != var89) {
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
        final SubLObject var84 = module0217.f14428((SubLObject)ConsesLow.list($ic17$, module0205.f13276(var82), var81));
        final SubLObject var85 = module0256.f16652(module0205.f13362(var82, var81, (SubLObject)UNPROVIDED), module0205.f13362(var83, var81, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        SubLObject var88 = var84;
        SubLObject var89 = (SubLObject)NIL;
        var89 = var88.first();
        while (NIL != var88) {
            SubLObject var18_92 = var85;
            SubLObject var90 = (SubLObject)NIL;
            var90 = var18_92.first();
            while (NIL != var18_92) {
                final SubLObject var91 = var89;
                if (NIL == conses_high.member(var91, var90, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
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
        if (NIL != module0018.$g666$.getDynamicValue(var95)) {
            if (NIL != module0210.f13594(var94)) {
                return f22613(module0172.f10921(var94));
            }
            if (NIL != module0173.f10955(var94)) {
                final SubLObject var96 = $g2857$.currentBinding(var95);
                final SubLObject var97 = $g2872$.currentBinding(var95);
                try {
                    $g2857$.bind(var94, var95);
                    $g2872$.bind((SubLObject)T, var95);
                    module0219.f14477(Symbols.symbol_function((SubLObject)$ic27$), $g2857$.getDynamicValue(var95), (SubLObject)ONE_INTEGER, $ic17$, (SubLObject)$ic18$, (SubLObject)UNPROVIDED);
                }
                finally {
                    $g2872$.rebind(var97, var95);
                    $g2857$.rebind(var96, var95);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22614(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var2)) {
            final SubLObject var4 = $g2858$.currentBinding(var3);
            final SubLObject var5 = $g2859$.currentBinding(var3);
            try {
                $g2858$.bind(var2, var3);
                $g2859$.bind(module0178.f11335(var2), var3);
                if ($g2859$.getDynamicValue(var3).isInteger()) {
                    final SubLObject var6 = module0178.f11287(var2);
                    final SubLObject var4_95 = module0147.$g2094$.currentBinding(var3);
                    final SubLObject var7_96 = module0147.$g2095$.currentBinding(var3);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic3$, var3);
                        module0147.$g2095$.bind(var6, var3);
                        if (module0225.f14739($g2857$.getDynamicValue(var3)).numGE($g2859$.getDynamicValue(var3)) || NIL != module0225.f14775($g2857$.getDynamicValue(var3))) {
                            module0219.f14480(Symbols.symbol_function((SubLObject)$ic4$), $g2857$.getDynamicValue(var3));
                        }
                    }
                    finally {
                        module0147.$g2095$.rebind(var7_96, var3);
                        module0147.$g2094$.rebind(var4_95, var3);
                    }
                }
            }
            finally {
                $g2859$.rebind(var5, var3);
                $g2858$.rebind(var4, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22615(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL != module0018.$g666$.getDynamicValue(var23)) {
            if (NIL != module0210.f13594(var22)) {
                return f22615(module0172.f10921(var22));
            }
            if (NIL != module0173.f10955(var22)) {
                final SubLObject var24 = $g2862$.currentBinding(var23);
                final SubLObject var25 = $g2861$.currentBinding(var23);
                final SubLObject var26 = $g2857$.currentBinding(var23);
                final SubLObject var27 = $g2872$.currentBinding(var23);
                try {
                    $g2862$.bind(var22, var23);
                    $g2861$.bind(module0228.f15205(var22), var23);
                    $g2857$.bind(module0205.f13276($g2861$.getDynamicValue(var23)), var23);
                    $g2872$.bind((SubLObject)T, var23);
                    module0219.f14477(Symbols.symbol_function((SubLObject)$ic28$), $g2857$.getDynamicValue(var23), (SubLObject)ONE_INTEGER, $ic17$, (SubLObject)$ic18$, (SubLObject)UNPROVIDED);
                }
                finally {
                    $g2872$.rebind(var27, var23);
                    $g2857$.rebind(var26, var23);
                    $g2861$.rebind(var25, var23);
                    $g2862$.rebind(var24, var23);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22616(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var2)) {
            final SubLObject var4 = $g2859$.currentBinding(var3);
            try {
                $g2859$.bind(module0178.f11335(var2), var3);
                if ($g2859$.getDynamicValue(var3).isInteger()) {
                    final SubLObject var4_97 = $g2863$.currentBinding(var3);
                    final SubLObject var5 = $g2858$.currentBinding(var3);
                    final SubLObject var6 = $g2873$.currentBinding(var3);
                    final SubLObject var7 = $g2874$.currentBinding(var3);
                    final SubLObject var8 = $g2870$.currentBinding(var3);
                    final SubLObject var9 = $g2871$.currentBinding(var3);
                    try {
                        $g2863$.bind(module0205.f13362($g2861$.getDynamicValue(var3), $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED), var3);
                        $g2858$.bind(var2, var3);
                        $g2873$.bind(f22599($g2862$.getDynamicValue(var3), $g2859$.getDynamicValue(var3)), var3);
                        $g2874$.bind(f22617($g2862$.getDynamicValue(var3), $g2859$.getDynamicValue(var3)), var3);
                        $g2870$.bind((SubLObject)NIL, var3);
                        $g2871$.bind((SubLObject)NIL, var3);
                        module0219.f14480(Symbols.symbol_function((SubLObject)$ic20$), $g2857$.getDynamicValue(var3));
                        f22600();
                        f22607();
                    }
                    finally {
                        $g2871$.rebind(var9, var3);
                        $g2870$.rebind(var8, var3);
                        $g2874$.rebind(var7, var3);
                        $g2873$.rebind(var6, var3);
                        $g2858$.rebind(var5, var3);
                        $g2863$.rebind(var4_97, var3);
                    }
                }
            }
            finally {
                $g2859$.rebind(var4, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22617(final SubLObject var99, final SubLObject var81) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL != $g2872$.getDynamicValue(var100)) {
            SubLObject var101 = (SubLObject)NIL;
            final SubLObject var102 = module0018.$g590$.currentBinding(var100);
            final SubLObject var103 = $g2859$.currentBinding(var100);
            final SubLObject var104 = module0018.$g584$.currentBinding(var100);
            try {
                module0018.$g590$.bind((SubLObject)ONE_INTEGER, var100);
                $g2859$.bind(var81, var100);
                module0018.$g584$.bind((SubLObject)NIL, var100);
                module0219.f14477(Symbols.symbol_function((SubLObject)$ic29$), var99, (SubLObject)TWO_INTEGER, $ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var101 = module0018.$g584$.getDynamicValue(var100);
            }
            finally {
                module0018.$g584$.rebind(var104, var100);
                $g2859$.rebind(var103, var100);
                module0018.$g590$.rebind(var102, var100);
            }
            return var101;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22599(final SubLObject var99, final SubLObject var81) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL != $g2872$.getDynamicValue(var100)) {
            SubLObject var101 = (SubLObject)NIL;
            final SubLObject var102 = module0018.$g590$.currentBinding(var100);
            final SubLObject var103 = $g2859$.currentBinding(var100);
            final SubLObject var104 = module0018.$g584$.currentBinding(var100);
            try {
                module0018.$g590$.bind((SubLObject)TWO_INTEGER, var100);
                $g2859$.bind(var81, var100);
                module0018.$g584$.bind((SubLObject)NIL, var100);
                module0219.f14477(Symbols.symbol_function((SubLObject)$ic29$), var99, (SubLObject)ONE_INTEGER, $ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var101 = module0018.$g584$.getDynamicValue(var100);
            }
            finally {
                module0018.$g584$.rebind(var104, var100);
                $g2859$.rebind(var103, var100);
                module0018.$g590$.rebind(var102, var100);
            }
            return var101;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22618(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != f22619(var2, $g2859$.getDynamicValue(var3))) {
            final SubLObject var4 = module0178.f11331(var2, module0018.$g590$.getDynamicValue(var3));
            final SubLObject var5 = module0205.f13362(var4, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var4, var5, module0178.f11287(var2)), module0018.$g584$.getDynamicValue(var3)), var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22619(final SubLObject var2, SubLObject var81) {
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)NIL;
        }
        SubLObject var82 = (SubLObject)NIL;
        if (NIL == var82) {
            SubLObject var83;
            SubLObject var84;
            for (var83 = module0178.f11299(var2), var84 = (SubLObject)NIL, var84 = var83.first(); NIL == var82 && NIL != var83; var82 = f22610(var84, var81), var83 = var83.rest(), var84 = var83.first()) {}
        }
        return var82;
    }
    
    public static SubLObject f22620(final SubLObject var105) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(var105.isCons() && var105.first() == $ic30$ && conses_high.second(var105).equal($g2876$.getDynamicValue(var106)));
    }
    
    public static SubLObject f22610(final SubLObject var32, SubLObject var81) {
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)NIL;
        }
        if (NIL != deduction_handles_oc.f11659(var32)) {
            SubLObject var82 = (SubLObject)NIL;
            SubLObject var83 = Types.sublisp_null(var81);
            if (NIL == var82) {
                SubLObject var84;
                SubLObject var85;
                for (var84 = module0188.f11770(var32), var85 = (SubLObject)NIL, var85 = var84.first(); NIL == var82 && NIL != var84; var82 = f22620(var85), var84 = var84.rest(), var85 = var84.first()) {}
            }
            if (NIL != var82) {
                SubLObject var86 = var83;
                if (NIL == var86) {
                    SubLObject var87 = module0188.f11770(var32);
                    SubLObject var88 = (SubLObject)NIL;
                    var88 = var87.first();
                    while (NIL == var86 && NIL != var87) {
                        if (NIL != module0178.f11284(var88) && $ic17$.eql(module0178.f11333(var88))) {
                            var83 = Equality.eq(var81, module0178.f11335(var88));
                            var86 = (SubLObject)T;
                        }
                        var87 = var87.rest();
                        var88 = var87.first();
                    }
                }
            }
            return (SubLObject)makeBoolean(NIL != var82 && NIL != var83);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22600() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = $g2870$.getDynamicValue(var3);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (NIL == f22621(var9, $g2873$.getDynamicValue(var3), (SubLObject)$ic23$)) {
                final SubLObject var10 = conses_high.second(var9);
                if (NIL == conses_high.member(var10, var5, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var5 = (SubLObject)ConsesLow.cons(var10, var5);
                }
            }
            SubLObject var10 = conses_high.second(var9);
            if (NIL == conses_high.member(var10, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var4 = (SubLObject)ConsesLow.cons(var10, var4);
            }
            var10 = conses_high.third(var9);
            if (NIL == conses_high.member(var10, var6, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        var8 = $g2873$.getDynamicValue(var3);
        SubLObject var11 = (SubLObject)NIL;
        var11 = var8.first();
        while (NIL != var8) {
            SubLObject var10 = conses_high.second(var11);
            if (NIL == conses_high.member(var10, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var4 = (SubLObject)ConsesLow.cons(var10, var4);
            }
            var10 = conses_high.third(var11);
            if (NIL == conses_high.member(var10, var6, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            var8 = var8.rest();
            var11 = var8.first();
        }
        var8 = var6;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var8.first();
        while (NIL != var8) {
            var7 = module0256.f16529(var4, var12, (SubLObject)UNPROVIDED);
            SubLObject var18_113 = $g2870$.getDynamicValue(var3);
            SubLObject var13 = (SubLObject)NIL;
            var13 = var18_113.first();
            while (NIL != var18_113) {
                SubLObject var15;
                final SubLObject var14 = var15 = var13;
                SubLObject var16 = (SubLObject)NIL;
                SubLObject var17 = (SubLObject)NIL;
                SubLObject var18 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic31$);
                var16 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic31$);
                var17 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic31$);
                var18 = var15.first();
                var15 = var15.rest();
                if (NIL == var15) {
                    if (var12.eql(var18) && NIL != module0004.f104(var17, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104(var17, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        module0538.f33372(var16, var18, (SubLObject)ConsesLow.list($g2858$.getDynamicValue(var3), (SubLObject)ConsesLow.listS((SubLObject)$ic23$, (SubLObject)ConsesLow.list($ic11$, $g2863$.getDynamicValue(var3), var17), var18, (SubLObject)$ic32$), module0538.f33420((SubLObject)$ic30$, conses_high.copy_tree($g2876$.getDynamicValue(var3)), $g2875$.getGlobalValue(), (SubLObject)$ic33$)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic31$);
                }
                var18_113 = var18_113.rest();
                var13 = var18_113.first();
            }
            SubLObject var18_114 = $g2873$.getDynamicValue(var3);
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18_114.first();
            while (NIL != var18_114) {
                SubLObject var118_119;
                final SubLObject var20 = var118_119 = var19;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var17 = (SubLObject)NIL;
                SubLObject var18 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var118_119, var20, (SubLObject)$ic34$);
                var21 = var118_119.first();
                var118_119 = var118_119.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var118_119, var20, (SubLObject)$ic34$);
                var17 = var118_119.first();
                var118_119 = var118_119.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var118_119, var20, (SubLObject)$ic34$);
                var18 = var118_119.first();
                var118_119 = var118_119.rest();
                if (NIL == var118_119) {
                    if (var12.eql(var18) && NIL == module0004.f104(var17, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var22 = module0018.$g666$.currentBinding(var3);
                        try {
                            module0018.$g666$.bind((SubLObject)NIL, var3);
                            final SubLObject var23 = (SubLObject)ConsesLow.list($ic11$, $g2862$.getDynamicValue(var3), var21);
                            module0538.f33424(var23, var18, (SubLObject)ConsesLow.list($g2858$.getDynamicValue(var3), (SubLObject)ConsesLow.listS((SubLObject)$ic23$, (SubLObject)ConsesLow.list($ic11$, $g2863$.getDynamicValue(var3), var17), var18, (SubLObject)$ic32$), module0538.f33420((SubLObject)$ic30$, conses_high.copy_tree($g2876$.getDynamicValue(var3)), $g2875$.getGlobalValue(), (SubLObject)$ic33$)), (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0018.$g666$.rebind(var22, var3);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic34$);
                }
                var18_114 = var18_114.rest();
                var19 = var18_114.first();
            }
            var8 = var8.rest();
            var12 = var8.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22607() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = $g2871$.getDynamicValue(var3);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (NIL == f22621(var9, $g2874$.getDynamicValue(var3), (SubLObject)$ic26$)) {
                final SubLObject var10 = conses_high.second(var9);
                if (NIL == conses_high.member(var10, var5, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var5 = (SubLObject)ConsesLow.cons(var10, var5);
                }
            }
            SubLObject var10 = conses_high.second(var9);
            if (NIL == conses_high.member(var10, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var4 = (SubLObject)ConsesLow.cons(var10, var4);
            }
            var10 = conses_high.third(var9);
            if (NIL == conses_high.member(var10, var6, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        var8 = $g2874$.getDynamicValue(var3);
        SubLObject var11 = (SubLObject)NIL;
        var11 = var8.first();
        while (NIL != var8) {
            SubLObject var10 = conses_high.second(var11);
            if (NIL == conses_high.member(var10, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var4 = (SubLObject)ConsesLow.cons(var10, var4);
            }
            var10 = conses_high.third(var11);
            if (NIL == conses_high.member(var10, var6, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var6 = (SubLObject)ConsesLow.cons(var10, var6);
            }
            var8 = var8.rest();
            var11 = var8.first();
        }
        var8 = var6;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var8.first();
        while (NIL != var8) {
            var7 = module0256.f16538(var4, var12, (SubLObject)UNPROVIDED);
            SubLObject var18_123 = $g2871$.getDynamicValue(var3);
            SubLObject var13 = (SubLObject)NIL;
            var13 = var18_123.first();
            while (NIL != var18_123) {
                SubLObject var15;
                final SubLObject var14 = var15 = var13;
                SubLObject var16 = (SubLObject)NIL;
                SubLObject var17 = (SubLObject)NIL;
                SubLObject var18 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic35$);
                var16 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic35$);
                var17 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic35$);
                var18 = var15.first();
                var15 = var15.rest();
                if (NIL == var15) {
                    if (var12.eql(var18) && NIL != module0004.f104(var17, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104(var17, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        module0538.f33372(var16, var18, (SubLObject)ConsesLow.list($g2858$.getDynamicValue(var3), (SubLObject)ConsesLow.listS((SubLObject)$ic23$, (SubLObject)ConsesLow.list($ic11$, var17, $g2863$.getDynamicValue(var3)), var18, (SubLObject)$ic32$), module0538.f33420((SubLObject)$ic30$, conses_high.copy_tree($g2876$.getDynamicValue(var3)), $g2875$.getGlobalValue(), (SubLObject)$ic33$)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic35$);
                }
                var18_123 = var18_123.rest();
                var13 = var18_123.first();
            }
            SubLObject var18_124 = $g2874$.getDynamicValue(var3);
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18_124.first();
            while (NIL != var18_124) {
                SubLObject var128_129;
                final SubLObject var20 = var128_129 = var19;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var17 = (SubLObject)NIL;
                SubLObject var18 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var128_129, var20, (SubLObject)$ic36$);
                var21 = var128_129.first();
                var128_129 = var128_129.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var128_129, var20, (SubLObject)$ic36$);
                var17 = var128_129.first();
                var128_129 = var128_129.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var128_129, var20, (SubLObject)$ic36$);
                var18 = var128_129.first();
                var128_129 = var128_129.rest();
                if (NIL == var128_129) {
                    if (var12.eql(var18) && NIL == module0004.f104(var17, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var22 = module0018.$g666$.currentBinding(var3);
                        try {
                            module0018.$g666$.bind((SubLObject)NIL, var3);
                            final SubLObject var23 = (SubLObject)ConsesLow.list($ic11$, var21, $g2862$.getDynamicValue(var3));
                            module0538.f33424(var23, var18, (SubLObject)ConsesLow.list($g2858$.getDynamicValue(var3), (SubLObject)ConsesLow.listS((SubLObject)$ic23$, (SubLObject)ConsesLow.list($ic11$, module0205.f13362(var21, $g2859$.getDynamicValue(var3), (SubLObject)UNPROVIDED), $g2863$.getDynamicValue(var3)), var18, (SubLObject)$ic32$), module0538.f33420((SubLObject)$ic30$, conses_high.copy_tree($g2876$.getDynamicValue(var3)), $g2875$.getGlobalValue(), (SubLObject)$ic33$)), (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0018.$g666$.rebind(var22, var3);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic36$);
                }
                var18_124 = var18_124.rest();
                var19 = var18_124.first();
            }
            var8 = var8.rest();
            var12 = var8.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22621(final SubLObject var82, final SubLObject var130, final SubLObject var80) {
        if (NIL != var130) {
            SubLObject var131 = (SubLObject)NIL;
            SubLObject var132 = (SubLObject)NIL;
            SubLObject var133 = (SubLObject)NIL;
            SubLObject var134 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var82, var82, (SubLObject)$ic37$);
            var132 = var82.first();
            SubLObject var135 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var135, var82, (SubLObject)$ic37$);
            var133 = var135.first();
            var135 = var135.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var135, var82, (SubLObject)$ic37$);
            var134 = var135.first();
            var135 = var135.rest();
            if (NIL == var135) {
                SubLObject var137_138;
                final SubLObject var135_136 = var137_138 = var132;
                SubLObject var136 = (SubLObject)NIL;
                SubLObject var137 = (SubLObject)NIL;
                SubLObject var138 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)$ic38$);
                var136 = var137_138.first();
                var137_138 = var137_138.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)$ic38$);
                var137 = var137_138.first();
                var137_138 = var137_138.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)$ic38$);
                var138 = var137_138.first();
                var137_138 = var137_138.rest();
                if (NIL == var137_138) {
                    if (NIL == var131) {
                        SubLObject var139 = var130;
                        SubLObject var140 = (SubLObject)NIL;
                        var140 = var139.first();
                        while (NIL == var131 && NIL != var139) {
                            SubLObject var144_145;
                            final SubLObject var142_143 = var144_145 = var140;
                            SubLObject var141 = (SubLObject)NIL;
                            SubLObject var142 = (SubLObject)NIL;
                            SubLObject var143 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)$ic39$);
                            var141 = var144_145.first();
                            var144_145 = var144_145.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)$ic39$);
                            var142 = var144_145.first();
                            var144_145 = var144_145.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)$ic39$);
                            var143 = var144_145.first();
                            var144_145 = var144_145.rest();
                            if (NIL == var144_145) {
                                if (var134.eql(var143)) {
                                    if (var80.eql((SubLObject)$ic23$)) {
                                        var131 = Equality.eq(var137, var141);
                                    }
                                    else if (var80.eql((SubLObject)$ic26$)) {
                                        var131 = Equality.eq(var138, var141);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var142_143, (SubLObject)$ic39$);
                            }
                            var139 = var139.rest();
                            var140 = var139.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var135_136, (SubLObject)$ic38$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)$ic37$);
            }
            return var131;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22622(final SubLObject var130, final SubLObject var149, final SubLObject var80) {
        SubLObject var150 = (SubLObject)NIL;
        SubLObject var151 = (SubLObject)NIL;
        SubLObject var152 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var130, var130, (SubLObject)$ic40$);
        var151 = var130.first();
        SubLObject var153 = var130.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var153, var130, (SubLObject)$ic40$);
        var152 = var153.first();
        var153 = var153.rest();
        if (NIL == var153) {
            if (NIL == var150) {
                SubLObject var154 = var149;
                SubLObject var155 = (SubLObject)NIL;
                var155 = var154.first();
                while (NIL == var150 && NIL != var154) {
                    SubLObject var154_155;
                    final SubLObject var152_153 = var154_155 = var155;
                    SubLObject var156 = (SubLObject)NIL;
                    SubLObject var157 = (SubLObject)NIL;
                    SubLObject var158 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var154_155, var152_153, (SubLObject)$ic37$);
                    var156 = var154_155.first();
                    var154_155 = var154_155.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var154_155, var152_153, (SubLObject)$ic37$);
                    var157 = var154_155.first();
                    var154_155 = var154_155.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var154_155, var152_153, (SubLObject)$ic37$);
                    var158 = var154_155.first();
                    var154_155 = var154_155.rest();
                    if (NIL == var154_155) {
                        if (var158.eql(var152)) {
                            SubLObject var158_159;
                            final SubLObject var156_157 = var158_159 = var156;
                            SubLObject var159 = (SubLObject)NIL;
                            SubLObject var160 = (SubLObject)NIL;
                            SubLObject var161 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var158_159, var156_157, (SubLObject)$ic38$);
                            var159 = var158_159.first();
                            var158_159 = var158_159.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var158_159, var156_157, (SubLObject)$ic38$);
                            var160 = var158_159.first();
                            var158_159 = var158_159.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var158_159, var156_157, (SubLObject)$ic38$);
                            var161 = var158_159.first();
                            var158_159 = var158_159.rest();
                            if (NIL == var158_159) {
                                if (var80.eql((SubLObject)$ic23$)) {
                                    var150 = Equality.eq(var160, var151);
                                }
                                else if (var80.eql((SubLObject)$ic26$)) {
                                    var150 = Equality.eq(var161, var151);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var156_157, (SubLObject)$ic38$);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var152_153, (SubLObject)$ic37$);
                    }
                    var154 = var154.rest();
                    var155 = var154.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var130, (SubLObject)$ic40$);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22624() {
        $g2857$ = SubLFiles.defparameter("S#25216", (SubLObject)NIL);
        $g2858$ = SubLFiles.defparameter("S#25217", (SubLObject)NIL);
        $g2859$ = SubLFiles.defparameter("S#25218", (SubLObject)NIL);
        $g2860$ = SubLFiles.defparameter("S#25219", (SubLObject)NIL);
        $g2861$ = SubLFiles.defparameter("S#25220", (SubLObject)NIL);
        $g2862$ = SubLFiles.defparameter("S#25221", (SubLObject)NIL);
        $g2863$ = SubLFiles.defparameter("S#25222", (SubLObject)NIL);
        $g2864$ = SubLFiles.defparameter("S#25223", (SubLObject)NIL);
        $g2865$ = SubLFiles.defparameter("S#25224", (SubLObject)NIL);
        $g2866$ = SubLFiles.defparameter("S#25225", (SubLObject)NIL);
        $g2867$ = SubLFiles.defparameter("S#25226", (SubLObject)NIL);
        $g2868$ = SubLFiles.defparameter("S#25227", (SubLObject)NIL);
        $g2869$ = SubLFiles.defparameter("S#25228", (SubLObject)NIL);
        $g2870$ = SubLFiles.defparameter("S#25229", (SubLObject)NIL);
        $g2871$ = SubLFiles.defparameter("S#25230", (SubLObject)NIL);
        $g2872$ = SubLFiles.defparameter("S#25231", (SubLObject)NIL);
        $g2873$ = SubLFiles.defparameter("S#25232", (SubLObject)NIL);
        $g2874$ = SubLFiles.defparameter("S#25233", (SubLObject)NIL);
        $g2875$ = SubLFiles.deflexical("S#25234", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2875$.getGlobalValue() : $ic1$);
        $g2876$ = SubLFiles.defparameter("S#25235", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22625() {
        module0003.f57((SubLObject)$ic0$);
        module0132.f8593((SubLObject)$ic0$, (SubLObject)NIL);
        module0012.f416((SubLObject)$ic5$);
        module0012.f416((SubLObject)$ic19$);
        module0012.f416((SubLObject)$ic22$);
        return (SubLObject)NIL;
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
        $g2857$ = null;
        $g2858$ = null;
        $g2859$ = null;
        $g2860$ = null;
        $g2861$ = null;
        $g2862$ = null;
        $g2863$ = null;
        $g2864$ = null;
        $g2865$ = null;
        $g2866$ = null;
        $g2867$ = null;
        $g2868$ = null;
        $g2869$ = null;
        $g2870$ = null;
        $g2871$ = null;
        $g2872$ = null;
        $g2873$ = null;
        $g2874$ = null;
        $g2875$ = null;
        $g2876$ = null;
        $ic0$ = makeSymbol("S#25234", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic2$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("preservesGenlsInArg")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FormulaArgFn")), (SubLObject)ZERO_INTEGER, (SubLObject)makeSymbol("?NAT-1")), (SubLObject)makeSymbol("?ARG")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FormulaArgFn")), (SubLObject)ZERO_INTEGER, (SubLObject)makeSymbol("?NAT-1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FormulaArgFn")), (SubLObject)ZERO_INTEGER, (SubLObject)makeSymbol("?NAT-2"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("different")), (SubLObject)makeSymbol("?NAT-1"), (SubLObject)makeSymbol("?NAT-2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FormulaArgFn")), (SubLObject)makeSymbol("?ARG"), (SubLObject)makeSymbol("?NAT-1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FormulaArgFn")), (SubLObject)makeSymbol("?ARG"), (SubLObject)makeSymbol("?NAT-2")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)makeSymbol("?NAT-1"), (SubLObject)makeSymbol("?NAT-2")));
        $ic3$ = makeSymbol("S#12278", "CYC");
        $ic4$ = makeSymbol("S#25193", "CYC");
        $ic5$ = makeSymbol("PGIA-AFTER-ADDING-PGIA");
        $ic6$ = makeSymbol("S#12274", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic8$ = makeSymbol("S#25194", "CYC");
        $ic9$ = makeSymbol("S#18976", "CYC");
        $ic10$ = makeSymbol("S#25195", "CYC");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic12$ = makeSymbol("S#12276", "CYC");
        $ic13$ = makeSymbol("NOT-EQ");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic16$ = makeSymbol("S#25196", "CYC");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("preservesGenlsInArg"));
        $ic18$ = makeKeyword("TRUE");
        $ic19$ = makeSymbol("PGIA-AFTER-ADDING-ISA");
        $ic20$ = makeSymbol("S#25197", "CYC");
        $ic21$ = makeSymbol("S#25198", "CYC");
        $ic22$ = makeSymbol("PGIA-AFTER-REMOVING-GENLS");
        $ic23$ = makeKeyword("GENLS");
        $ic24$ = makeString("~A is neither SET-P nor LISTP.");
        $ic25$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic26$ = makeKeyword("SPECS");
        $ic27$ = makeSymbol("S#25202", "CYC");
        $ic28$ = makeSymbol("S#25204", "CYC");
        $ic29$ = makeSymbol("S#25207", "CYC");
        $ic30$ = makeKeyword("CODE");
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("S#12459", "CYC"), (SubLObject)makeSymbol("S#25236", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)makeKeyword("DEFAULT"));
        $ic33$ = makeKeyword("DEFAULT");
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("S#25237", "CYC"), (SubLObject)makeSymbol("S#25236", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("S#12459", "CYC"), (SubLObject)makeSymbol("S#25238", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("S#25239", "CYC"), (SubLObject)makeSymbol("S#25238", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#12459", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#25240", "CYC"), (SubLObject)makeSymbol("S#25241", "CYC"), (SubLObject)makeSymbol("S#25242", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#25240", "CYC"), (SubLObject)makeSymbol("S#25242", "CYC"));
    }
    
    public static final class $f22605$BinaryFunction extends BinaryFunction
    {
        public $f22605$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PGIA-AFTER-ADDING-ISA"));
        }
        
        public SubLObject processItem(final SubLObject var26, final SubLObject var27) {
            return f22605(var26, var27);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 797 ms
	
	Decompiled with Procyon 0.5.32.
*/