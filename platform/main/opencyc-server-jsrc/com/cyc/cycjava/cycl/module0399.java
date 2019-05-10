package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0399 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0399";
    public static final String myFingerPrint = "697571d0d636942e0be2c23927923499fcad79a37116d33e9bb758d4efe23b53";
    private static SubLSymbol $g3288$;
    private static SubLSymbol $g3289$;
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
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    
    public static SubLObject f28179(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0387.$g3239$.getDynamicValue(var2);
    }
    
    public static SubLObject f28180(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0387.$g3239$.getDynamicValue(var4);
    }
    
    public static SubLObject f28181(final SubLObject var4, final SubLObject var3) {
        if (NIL != f28182(var4, var3)) {
            final SubLObject var5 = module0384.f27259();
            return module0384.f27271(var5);
        }
        if (NIL != f28183(var4, var3)) {
            return (SubLObject)$ic0$;
        }
        return (SubLObject)$ic1$;
    }
    
    public static SubLObject f28182(final SubLObject var4, final SubLObject var3) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = $g3288$.currentBinding(var5);
        try {
            $g3288$.bind((SubLObject)NIL, var5);
            var6 = f28184(var4, var3, (SubLObject)UNPROVIDED);
        }
        finally {
            $g3288$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f28184(final SubLObject var4, final SubLObject var3, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)T;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != f28185(var4, var3, var8)) {
            return (SubLObject)T;
        }
        final SubLObject var10 = module0367.f25171(var3, var4, (SubLObject)UNPROVIDED);
        if (NIL != Types.booleanp(var10)) {
            return var10;
        }
        final SubLObject var11 = f28186(var4, var3, var8);
        if (NIL != var11) {
            if (NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)$ic1$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            module0367.f25175(var3, var4, (SubLObject)UNPROVIDED);
        }
        else {
            module0367.f25176(var3, var4, (SubLObject)UNPROVIDED);
        }
        return var11;
    }
    
    public static SubLObject f28185(final SubLObject var4, final SubLObject var3, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != module0387.f27516(var4)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != $g3288$.getDynamicValue(var9) && NIL != f28187(var4, var3)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262(f28181(var4, var3), var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != var8 && NIL != f28188(var4, var3, (SubLObject)T)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)$ic3$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != f28180(var3) && NIL == module0367.f25081(var4) && NIL != f28189(var4, var3, (SubLObject)T, (SubLObject)T)) {
            final SubLObject var10 = module0384.f27259();
            if (NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)$ic4$, var3, (SubLObject)NIL, (SubLObject)NIL, var10);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28186(final SubLObject var4, final SubLObject var3, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != module0384.f27288(var4, var3)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262(module0384.f27290(var4, var3), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0363.f24562(var3) && NIL == module0363.f24628(var3)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)$ic5$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != $g3289$.getDynamicValue(var9) && NIL != module0392.f27957(var4) && NIL != module0205.f13145(Symbols.symbol_function((SubLObject)$ic6$), module0363.f24509(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)$ic7$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28190(final SubLObject var4, final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (NIL != module0365.f24819(var11)) {
            return f28191(var4, var11, var12, (SubLObject)UNPROVIDED);
        }
        return f28192(var4, var11, var12);
    }
    
    public static SubLObject f28191(final SubLObject var4, final SubLObject var1, SubLObject var12, SubLObject var14) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != f28193(var4, var1, var12, var14)) {
            return (SubLObject)T;
        }
        final SubLObject var16 = module0367.f25226(var1, var4, (SubLObject)UNPROVIDED);
        if (NIL != Types.booleanp(var16)) {
            return var16;
        }
        final SubLObject var17 = f28194(var4, var1, var12, var14);
        if (NIL != var17) {
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic8$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            module0367.f25228(var1, var4, (SubLObject)UNPROVIDED);
        }
        else {
            module0367.f25229(var1, var4, (SubLObject)UNPROVIDED);
        }
        return var17;
    }
    
    public static SubLObject f28193(final SubLObject var4, final SubLObject var1, final SubLObject var12, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != $g3288$.getDynamicValue(var15) && NIL != f28195(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic8$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0387.f27516(var4)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != f28196(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic9$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL == module0384.f27368(var4, var1)) {
            return (SubLObject)T;
        }
        if (NIL == var12) {
            final SubLObject var16 = module0365.f24850(var1);
            if (NIL != f28184(var4, var16, (SubLObject)NIL)) {
                final SubLObject var17 = module0384.f27259();
                if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                    module0384.f27262((SubLObject)$ic10$, (SubLObject)NIL, var1, (SubLObject)NIL, var17);
                }
                return (SubLObject)T;
            }
        }
        if (NIL != module0373.f26163(var1) && NIL != f28197(var4, var1)) {
            final SubLObject var18 = module0384.f27259();
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic11$, (SubLObject)NIL, var1, (SubLObject)NIL, var18);
            }
            return (SubLObject)T;
        }
        if (NIL != f28198(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic12$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != f28179(var1) && NIL == module0367.f25081(var4) && NIL != f28199(var4, var1, (SubLObject)T, (SubLObject)NIL, (SubLObject)T)) {
            final SubLObject var18 = module0384.f27259();
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic13$, (SubLObject)NIL, var1, (SubLObject)NIL, var18);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28194(final SubLObject var4, final SubLObject var1, final SubLObject var12, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != module0376.f26618(var1)) {
            return (SubLObject)T;
        }
        if (NIL != module0363.f24606(module0365.f24850(var1))) {
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic14$, module0365.f24850(var1), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0384.f27277(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262(module0384.f27296(var4, var1), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0381.f27067(var1) && NIL != module0363.f24659(module0365.f24850(var1)) && !var1.eql(f28200(var4, module0365.f24850(var1)))) {
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic15$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0375.$g3188$.getDynamicValue(var15) && NIL != module0373.f26151(var1) && NIL != f28201(var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)$ic16$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28201(final SubLObject var1) {
        SubLObject var2;
        SubLObject var3;
        SubLObject var4;
        for (var2 = (SubLObject)NIL, var3 = (SubLObject)NIL, var3 = module0363.f24517(module0365.f24850(var1)); NIL == var2 && NIL != var3; var3 = var3.rest()) {
            var4 = var3.first();
            if (!var4.eql(var1) && NIL != module0375.f26586(var4)) {
                var2 = (SubLObject)T;
            }
        }
        return var2;
    }
    
    public static SubLObject f28192(final SubLObject var4, final SubLObject var13, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL == var12) {
            final SubLObject var15 = module0364.f24725(var13);
            if (NIL != f28184(var4, var15, (SubLObject)UNPROVIDED)) {
                final SubLObject var16 = module0384.f27259();
                if (NIL != module0384.$g3229$.getDynamicValue(var14)) {
                    module0384.f27262((SubLObject)$ic17$, (SubLObject)NIL, (SubLObject)NIL, var13, var16);
                }
                return (SubLObject)T;
            }
        }
        if (NIL != module0377.f26746(var13) && NIL == inference_datastructures_inference_oc.f25608(module0367.f25037(var4), module0377.f26749(var13))) {
            if (NIL != module0384.$g3229$.getDynamicValue(var14)) {
                module0384.f27262((SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL, var13, (SubLObject)NIL);
            }
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28189(final SubLObject var4, final SubLObject var3, SubLObject var8, SubLObject var19) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)T;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != f28202(var4, var3, var8, var19)) {
            return (SubLObject)T;
        }
        final SubLObject var21 = module0367.f25173(var3, var4, (SubLObject)UNPROVIDED);
        if (NIL != Types.booleanp(var21)) {
            return var21;
        }
        final SubLObject var22 = f28203(var4, var3, var8, var19);
        if (NIL != var22) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)$ic19$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            module0367.f25177(var3, var4, (SubLObject)UNPROVIDED);
        }
        else {
            module0367.f25178(var3, var4, (SubLObject)UNPROVIDED);
        }
        return var22;
    }
    
    public static SubLObject f28202(final SubLObject var4, final SubLObject var3, final SubLObject var8, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != module0387.f27517(var4)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0398.f28164(var4, var3)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)$ic19$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != var8 && NIL != module0367.f25151(var3, var4) && NIL != f28204(var4, var3, (SubLObject)T)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)$ic21$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28203(final SubLObject var4, final SubLObject var3, final SubLObject var8, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL == var19 && NIL != module0384.f27311(var4, var3)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262(module0384.f27294(var4, var3), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28205(final SubLObject var4, final SubLObject var11, SubLObject var12, SubLObject var19) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0365.f24819(var11)) {
            return f28199(var4, var11, var12, (SubLObject)NIL, var19);
        }
        return f28206(var4, var11, var12, var19);
    }
    
    public static SubLObject f28199(final SubLObject var4, final SubLObject var1, SubLObject var12, SubLObject var14, SubLObject var19) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != f28207(var4, var1, var12, var14, var19)) {
            return (SubLObject)T;
        }
        final SubLObject var21 = module0367.f25227(var1, var4, (SubLObject)UNPROVIDED);
        if (NIL != Types.booleanp(var21)) {
            return var21;
        }
        final SubLObject var22 = f28208(var4, var1, var12, var14, var19);
        if (NIL != var22) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)$ic22$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            module0367.f25231(var1, var4, (SubLObject)UNPROVIDED);
        }
        else {
            module0367.f25232(var1, var4, (SubLObject)UNPROVIDED);
        }
        return var22;
    }
    
    public static SubLObject f28207(final SubLObject var4, final SubLObject var1, final SubLObject var12, final SubLObject var14, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != f28209(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)$ic22$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL == var19 && NIL != module0387.f27516(var4)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0387.f27517(var4)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL == var12) {
            final SubLObject var21 = module0365.f24850(var1);
            if (NIL != f28189(var4, var21, (SubLObject)NIL, var19)) {
                final SubLObject var22 = module0384.f27259();
                if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                    module0384.f27262((SubLObject)$ic23$, (SubLObject)NIL, var1, (SubLObject)NIL, var22);
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28208(final SubLObject var4, final SubLObject var1, final SubLObject var12, final SubLObject var14, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL == var19 && NIL != module0384.f27285(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262(module0384.f27302(var4, var1), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0373.f26163(var1) && NIL == module0373.f26365(module0367.f25037(var4), var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)$ic24$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28198(final SubLObject var4, final SubLObject var1) {
        if (NIL != module0377.f26773(var1)) {
            final SubLObject var5 = module0367.f25037(var4);
            if (NIL == inference_datastructures_inference_oc.f25607(var5)) {
                final SubLObject var6 = inference_datastructures_inference_oc.f25658(var5);
                if (ZERO_INTEGER.eql(var6)) {
                    return (SubLObject)T;
                }
                if (NIL != module0004.f105(var6)) {
                    SubLObject var7 = (SubLObject)ZERO_INTEGER;
                    SubLObject var8;
                    SubLObject var9;
                    SubLObject var10;
                    SubLObject var11;
                    for (var8 = (SubLObject)NIL, var9 = (SubLObject)NIL, var9 = module0363.f24517(module0365.f24850(var1)); NIL == var8 && NIL != var9; var9 = var9.rest()) {
                        var10 = var9.first();
                        if (NIL != module0363.f24524(var10, (SubLObject)$ic25$) && NIL != module0363.f24522(var10, module0365.f24865(var1))) {
                            var11 = module0377.f26753(var10);
                            if (NIL != var11 && NIL != inference_datastructures_inference_oc.f25608(var5, var11)) {
                                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                if (var7.numE(var6)) {
                                    var8 = (SubLObject)T;
                                }
                            }
                        }
                    }
                    return var8;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28206(final SubLObject var4, final SubLObject var13, SubLObject var12, SubLObject var19) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL == var12) {
            final SubLObject var21 = module0364.f24725(var13);
            if (NIL != f28189(var4, var21, (SubLObject)T, var19)) {
                final SubLObject var22 = module0384.f27259();
                if (NIL != module0384.$g3229$.getDynamicValue(var20)) {
                    module0384.f27262((SubLObject)$ic26$, (SubLObject)NIL, (SubLObject)NIL, var13, var22);
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28210(final SubLObject var4, final SubLObject var3) {
        return module0035.sublisp_boolean(f28211(var4, var3));
    }
    
    public static SubLObject f28211(final SubLObject var4, final SubLObject var3) {
        if (NIL != f28184(var4, var3, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic27$;
        }
        if (NIL != f28189(var4, var3, (SubLObject)T, (SubLObject)T)) {
            return (SubLObject)$ic28$;
        }
        if (NIL == module0363.f24586(var3, var4)) {
            return (SubLObject)$ic29$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28212(final SubLObject var4, final SubLObject var11) {
        return module0035.sublisp_boolean(f28213(var4, var11));
    }
    
    public static SubLObject f28213(final SubLObject var4, final SubLObject var11) {
        if (NIL != module0387.f27529(var11)) {
            return (SubLObject)$ic30$;
        }
        if (NIL != module0373.f26176(var11) && NIL != module0365.f24884(var11)) {
            return (SubLObject)$ic27$;
        }
        if (NIL != f28190(var4, var11, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic27$;
        }
        if (NIL != f28205(var4, var11, (SubLObject)NIL, (SubLObject)T)) {
            return (SubLObject)$ic28$;
        }
        if (NIL == module0363.f24586(module0387.f27530(var11), var4)) {
            return (SubLObject)$ic29$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28214(final SubLObject var4, final SubLObject var1) {
        return f28212(var4, var1);
    }
    
    public static SubLObject f28215(final SubLObject var4, final SubLObject var13) {
        return f28212(var4, var13);
    }
    
    public static SubLObject f28188(final SubLObject var4, final SubLObject var3, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (NIL == var12 && NIL != f28184(var4, var3, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        SubLObject var13 = module0363.f24517(var3);
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            if (NIL == f28191(var4, var14, (SubLObject)T, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28204(final SubLObject var4, final SubLObject var3, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (NIL == var12 && NIL != f28189(var4, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        SubLObject var13 = module0363.f24517(var3);
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            if (NIL == f28199(var4, var14, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28216(final SubLObject var4, final SubLObject var1, SubLObject var12, SubLObject var14) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f28199(var4, var1, var12, var14, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28217(final SubLObject var4, final SubLObject var1, SubLObject var12, SubLObject var14) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        return f28191(var4, var1, var12, var14);
    }
    
    public static SubLObject f28218(final SubLObject var4, final SubLObject var1) {
        return f28214(var4, var1);
    }
    
    public static SubLObject f28196(final SubLObject var4, final SubLObject var1) {
        if (NIL != module0382.f27206(var1)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28219(final SubLObject var4, final SubLObject var3) {
        SubLObject var5 = (SubLObject)$ic32$;
        SubLObject var6 = (SubLObject)$ic33$;
        SubLObject var7 = (SubLObject)$ic32$;
        SubLObject var8 = module0363.f24517(var3);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (NIL != module0363.f24524(var9, (SubLObject)$ic34$)) {
                final SubLObject var10 = module0373.f26168(var9);
                if (NIL != module0363.f24659(var10) && NIL != module0363.f24562(var10)) {
                    final SubLObject var11 = f28220(var4, var10);
                    final SubLObject var12 = module0363.f24564(var10);
                    if (NIL != module0360.f23940(var11, var6) || (NIL != module0360.f23939(var11, var6) && module0035.f2451(Symbols.symbol_function((SubLObject)$ic35$), var12, (SubLObject)UNPROVIDED).numL(module0035.f2451(Symbols.symbol_function((SubLObject)$ic35$), var7, (SubLObject)UNPROVIDED)))) {
                        var5 = var9;
                        var6 = var11;
                        var7 = var12;
                    }
                }
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return Values.values(var5, var6);
    }
    
    public static SubLObject f28200(final SubLObject var4, final SubLObject var3) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0034.$g879$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)NIL;
        if (NIL == var6) {
            return f28219(var4, var3);
        }
        var7 = module0034.f1857(var6, (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
        if (NIL == var7) {
            var7 = module0034.f1807(module0034.f1842(var6), (SubLObject)$ic31$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var6, (SubLObject)$ic31$, var7);
        }
        final SubLObject var8 = module0034.f1782(var4, var3);
        final SubLObject var9 = module0034.f1814(var7, var8, (SubLObject)UNPROVIDED);
        if (var9 != $ic36$) {
            SubLObject var10 = var9;
            SubLObject var11 = (SubLObject)NIL;
            var11 = var10.first();
            while (NIL != var10) {
                SubLObject var12 = var11.first();
                final SubLObject var13 = conses_high.second(var11);
                if (var4.eql(var12.first())) {
                    var12 = var12.rest();
                    if (NIL != var12 && NIL == var12.rest() && var3.eql(var12.first())) {
                        return module0034.f1959(var13);
                    }
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        final SubLObject var14 = Values.arg2(var5.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f28219(var4, var3)));
        module0034.f1836(var7, var8, var9, var14, (SubLObject)ConsesLow.list(var4, var3));
        return module0034.f1959(var14);
    }
    
    public static SubLObject f28220(final SubLObject var4, final SubLObject var3) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0363.f24569(var3);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var5);
        final SubLObject var10 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var11 = module0147.$g2096$.currentBinding(var5);
        try {
            module0147.$g2095$.bind(module0147.f9545(var8), var5);
            module0147.$g2094$.bind(module0147.f9546(var8), var5);
            module0147.$g2096$.bind(module0147.f9549(var8), var5);
            var7 = module0377.f26797(var3);
        }
        finally {
            module0147.$g2096$.rebind(var11, var5);
            module0147.$g2094$.rebind(var10, var5);
            module0147.$g2095$.rebind(var9, var5);
        }
        SubLObject var12 = var7;
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            SubLObject var15;
            final SubLObject var14 = var15 = var13;
            SubLObject var16 = (SubLObject)NIL;
            SubLObject var17 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic37$);
            var16 = var15.first();
            var15 = var15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic37$);
            var17 = var15.first();
            var15 = var15.rest();
            if (NIL == var15) {
                if (NIL == module0384.f27352(var4, var16, var3)) {
                    var6 = module0360.f23944(var6, var17);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic37$);
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        return var6;
    }
    
    public static SubLObject f28187(final SubLObject var4, final SubLObject var3) {
        assert NIL != module0398.f28152(var4) : var4;
        assert NIL != module0363.f24478(var3) : var3;
        return (SubLObject)makeBoolean(NIL != module0398.f28162(var4, var3) && NIL == module0398.f28164(var4, var3));
    }
    
    public static SubLObject f28195(final SubLObject var4, final SubLObject var1) {
        return module0398.f28166(var4, var1);
    }
    
    public static SubLObject f28209(final SubLObject var4, final SubLObject var1) {
        return module0398.f28165(var4, var1);
    }
    
    public static SubLObject f28197(final SubLObject var4, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (NIL != module0382.f27206(var52)) {
            var53.resetMultipleValues();
            final SubLObject var54 = module0382.f27211(var52);
            final SubLObject var55 = var53.secondMultipleValue();
            var53.resetMultipleValues();
            if (NIL == var54 || NIL == var55) {
                return (SubLObject)NIL;
            }
            if (NIL != module0367.f25156(var54, var4) || NIL != module0367.f25156(var55, var4)) {
                return (SubLObject)NIL;
            }
            if (NIL != f28221(var4, var54) || NIL != f28221(var4, var55)) {
                return (SubLObject)T;
            }
        }
        else {
            final SubLObject var56 = module0373.f26168(var52);
            if (NIL != module0367.f25156(var56, var4)) {
                return (SubLObject)NIL;
            }
            if (NIL != var56 && NIL != f28221(var4, var56)) {
                return (SubLObject)T;
            }
        }
        final SubLObject var57 = module0373.f26167(var52);
        if (NIL != f28192(var4, var57, (SubLObject)T)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28221(final SubLObject var4, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)NIL;
        final SubLObject var35 = $g3288$.currentBinding(var33);
        try {
            $g3288$.bind((SubLObject)NIL, var33);
            var34 = f28184(var4, var32, (SubLObject)UNPROVIDED);
        }
        finally {
            $g3288$.rebind(var35, var33);
        }
        return var34;
    }
    
    public static SubLObject f28183(final SubLObject var4, final SubLObject var3) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0384.$g3229$.currentBinding(var5);
        try {
            module0384.$g3229$.bind((SubLObject)NIL, var5);
            var5.resetMultipleValues();
            final SubLObject var8 = module0400.f28247(var4, var3);
            final SubLObject var9 = var5.secondMultipleValue();
            final SubLObject var10 = var5.thirdMultipleValue();
            var5.resetMultipleValues();
            var6 = Types.sublisp_null(var8);
        }
        finally {
            module0384.$g3229$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f28222(final SubLObject var4, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (NIL != module0382.f27206(var52)) {
            var53.resetMultipleValues();
            final SubLObject var54 = module0382.f27211(var52);
            final SubLObject var55 = var53.secondMultipleValue();
            var53.resetMultipleValues();
            if (NIL == var54 || NIL == var55) {
                return (SubLObject)NIL;
            }
            if (NIL != module0367.f25156(var54, var4) || NIL != module0367.f25156(var55, var4)) {
                return (SubLObject)NIL;
            }
            if (NIL != f28189(var4, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f28189(var4, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        else {
            final SubLObject var56 = module0373.f26168(var52);
            if (NIL != module0367.f25156(var56, var4)) {
                return (SubLObject)NIL;
            }
            if (NIL != f28189(var4, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28223(final SubLObject var4) {
        SubLObject var5;
        SubLObject var6;
        for (var5 = (SubLObject)ZERO_INTEGER, var6 = f28224(var4), var5 = Numbers.add(var5, var6); var6.isPositive(); var6 = f28224(var4), var5 = Numbers.add(var5, var6)) {}
        return var5;
    }
    
    public static SubLObject f28224(final SubLObject var4) {
        final SubLObject var5 = f28225(var4);
        module0367.f25102(var4);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (NIL != f28226(var4, var8)) {
                module0387.f27512(var4, var8);
            }
            else {
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return var6;
    }
    
    public static SubLObject f28226(final SubLObject var4, final SubLObject var63) {
        return Equality.eq((SubLObject)$ic28$, f28211(var4, var63));
    }
    
    public static SubLObject f28227(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0398.f28175(var4);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = module0373.$g3181$.currentBinding(var5);
        try {
            module0373.$g3181$.bind((SubLObject)T, var5);
            final SubLObject var8 = module0367.f25086(var4);
            module0367.f25102(var4);
            SubLObject var10;
            final SubLObject var9 = var10 = Sort.sort(var8, Symbols.symbol_function((SubLObject)$ic40$), Symbols.symbol_function((SubLObject)$ic41$));
            SubLObject var11 = (SubLObject)NIL;
            var11 = var10.first();
            while (NIL != var10) {
                if (NIL != f28228(var4, var11)) {
                    var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        finally {
            module0373.$g3181$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f28225(final SubLObject var4) {
        return module0367.f25086(var4);
    }
    
    public static SubLObject f28228(final SubLObject var4, final SubLObject var3) {
        module0387.f27513(var3, var4);
        return module0373.f26296(var4, var3);
    }
    
    public static SubLObject f28229() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28179", "S#31308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28180", "S#31309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28181", "S#31310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28182", "S#31311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28184", "S#31312", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28185", "S#31313", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28186", "S#31314", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28190", "S#31315", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28191", "S#31316", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28193", "S#31317", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28194", "S#31318", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28201", "S#31319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28192", "S#31320", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28189", "S#31321", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28202", "S#31322", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28203", "S#31323", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28205", "S#31324", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28199", "S#31325", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28207", "S#31326", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28208", "S#31327", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28198", "S#31328", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28206", "S#31329", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28210", "S#31330", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28211", "S#31331", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28212", "S#31332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28213", "S#31333", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28214", "S#31334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28215", "S#31335", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28188", "S#31336", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28204", "S#31337", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28216", "S#31338", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28217", "S#31339", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28218", "S#31340", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28196", "S#31341", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28219", "S#31342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28200", "S#31144", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28220", "S#31343", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28187", "S#31344", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28195", "S#31345", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28209", "S#31346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28197", "S#31347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28221", "S#31348", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28183", "S#31349", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28222", "S#31350", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28223", "S#31351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28224", "S#31352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28226", "S#31353", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28227", "S#31354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28225", "S#31355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0399", "f28228", "S#31356", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28230() {
        $g3288$ = SubLFiles.defparameter("S#31357", (SubLObject)T);
        $g3289$ = SubLFiles.defvar("S#31358", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28231() {
        module0034.f1895((SubLObject)$ic31$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28229();
    }
    
    public void initializeVariables() {
        f28230();
    }
    
    public void runTopLevelForms() {
        f28231();
    }
    
    static {
        me = (SubLFile)new module0399();
        $g3288$ = null;
        $g3289$ = null;
        $ic0$ = makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS");
        $ic1$ = makeKeyword("PROBLEM-ALREADY-THROWN-AWAY");
        $ic2$ = makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION");
        $ic3$ = makeKeyword("ALL-TACTICS-THROWN-AWAY");
        $ic4$ = makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");
        $ic5$ = makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS");
        $ic6$ = makeSymbol("S#24006", "CYC");
        $ic7$ = makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM");
        $ic8$ = makeKeyword("TACTIC-ALREADY-THROWN-AWAY");
        $ic9$ = makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");
        $ic10$ = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");
        $ic11$ = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");
        $ic12$ = makeKeyword("TACTIC-GENERATED-ENOUGH");
        $ic13$ = makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");
        $ic14$ = makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK");
        $ic15$ = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED");
        $ic16$ = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION");
        $ic17$ = makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");
        $ic18$ = makeKeyword("LINK-RULE-DISALLOWED");
        $ic19$ = makeKeyword("PROBLEM-ALREADY-SET-ASIDE");
        $ic20$ = makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION");
        $ic21$ = makeKeyword("ALL-TACTICS-SET-ASIDE");
        $ic22$ = makeKeyword("TACTIC-ALREADY-SET-ASIDE");
        $ic23$ = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");
        $ic24$ = makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH");
        $ic25$ = makeKeyword("TRANSFORMATION");
        $ic26$ = makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");
        $ic27$ = makeKeyword("THROW-AWAY");
        $ic28$ = makeKeyword("SET-ASIDE");
        $ic29$ = makeKeyword("IRRELEVANT");
        $ic30$ = makeKeyword("INVALID");
        $ic31$ = makeSymbol("S#31144", "CYC");
        $ic32$ = makeKeyword("UNDETERMINED");
        $ic33$ = makeKeyword("POSITIVE-INFINITY");
        $ic34$ = makeKeyword("JOIN-ORDERED");
        $ic35$ = makeSymbol("VARIABLE-P");
        $ic36$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#26071", "CYC"));
        $ic38$ = makeSymbol("S#30356", "CYC");
        $ic39$ = makeSymbol("S#26082", "CYC");
        $ic40$ = makeSymbol("<");
        $ic41$ = makeSymbol("S#26813", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 273 ms
	
	Decompiled with Procyon 0.5.32.
*/