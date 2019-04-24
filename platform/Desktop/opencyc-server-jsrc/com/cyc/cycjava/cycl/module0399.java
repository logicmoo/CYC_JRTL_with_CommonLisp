package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (module0399.NIL != f28182(var4, var3)) {
            final SubLObject var5 = module0384.f27259();
            return module0384.f27271(var5);
        }
        if (module0399.NIL != f28183(var4, var3)) {
            return (SubLObject)module0399.$ic0$;
        }
        return (SubLObject)module0399.$ic1$;
    }
    
    public static SubLObject f28182(final SubLObject var4, final SubLObject var3) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0399.NIL;
        final SubLObject var7 = module0399.$g3288$.currentBinding(var5);
        try {
            module0399.$g3288$.bind((SubLObject)module0399.NIL, var5);
            var6 = f28184(var4, var3, (SubLObject)module0399.UNPROVIDED);
        }
        finally {
            module0399.$g3288$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f28184(final SubLObject var4, final SubLObject var3, SubLObject var8) {
        if (var8 == module0399.UNPROVIDED) {
            var8 = (SubLObject)module0399.T;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0399.NIL != f28185(var4, var3, var8)) {
            return (SubLObject)module0399.T;
        }
        final SubLObject var10 = module0367.f25171(var3, var4, (SubLObject)module0399.UNPROVIDED);
        if (module0399.NIL != Types.booleanp(var10)) {
            return var10;
        }
        final SubLObject var11 = f28186(var4, var3, var8);
        if (module0399.NIL != var11) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)module0399.$ic1$, var3, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            module0367.f25175(var3, var4, (SubLObject)module0399.UNPROVIDED);
        }
        else {
            module0367.f25176(var3, var4, (SubLObject)module0399.UNPROVIDED);
        }
        return var11;
    }
    
    public static SubLObject f28185(final SubLObject var4, final SubLObject var3, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0399.NIL != module0387.f27516(var4)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)module0399.$ic2$, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0399.$g3288$.getDynamicValue(var9) && module0399.NIL != f28187(var4, var3)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262(f28181(var4, var3), var3, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != var8 && module0399.NIL != f28188(var4, var3, (SubLObject)module0399.T)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)module0399.$ic3$, var3, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != f28180(var3) && module0399.NIL == module0367.f25081(var4) && module0399.NIL != f28189(var4, var3, (SubLObject)module0399.T, (SubLObject)module0399.T)) {
            final SubLObject var10 = module0384.f27259();
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)module0399.$ic4$, var3, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, var10);
            }
            return (SubLObject)module0399.T;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28186(final SubLObject var4, final SubLObject var3, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0399.NIL != module0384.f27288(var4, var3)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262(module0384.f27290(var4, var3), (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0363.f24562(var3) && module0399.NIL == module0363.f24628(var3)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)module0399.$ic5$, var3, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0399.$g3289$.getDynamicValue(var9) && module0399.NIL != module0392.f27957(var4) && module0399.NIL != module0205.f13145(Symbols.symbol_function((SubLObject)module0399.$ic6$), module0363.f24509(var3), (SubLObject)module0399.UNPROVIDED, (SubLObject)module0399.UNPROVIDED)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var9)) {
                module0384.f27262((SubLObject)module0399.$ic7$, var3, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28190(final SubLObject var4, final SubLObject var11, SubLObject var12) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        if (module0399.NIL != module0365.f24819(var11)) {
            return f28191(var4, var11, var12, (SubLObject)module0399.UNPROVIDED);
        }
        return f28192(var4, var11, var12);
    }
    
    public static SubLObject f28191(final SubLObject var4, final SubLObject var1, SubLObject var12, SubLObject var14) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        if (var14 == module0399.UNPROVIDED) {
            var14 = (SubLObject)module0399.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0399.NIL != f28193(var4, var1, var12, var14)) {
            return (SubLObject)module0399.T;
        }
        final SubLObject var16 = module0367.f25226(var1, var4, (SubLObject)module0399.UNPROVIDED);
        if (module0399.NIL != Types.booleanp(var16)) {
            return var16;
        }
        final SubLObject var17 = f28194(var4, var1, var12, var14);
        if (module0399.NIL != var17) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic8$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            module0367.f25228(var1, var4, (SubLObject)module0399.UNPROVIDED);
        }
        else {
            module0367.f25229(var1, var4, (SubLObject)module0399.UNPROVIDED);
        }
        return var17;
    }
    
    public static SubLObject f28193(final SubLObject var4, final SubLObject var1, final SubLObject var12, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0399.NIL != module0399.$g3288$.getDynamicValue(var15) && module0399.NIL != f28195(var4, var1)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic8$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0387.f27516(var4)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic2$, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != f28196(var4, var1)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic9$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL == module0384.f27368(var4, var1)) {
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL == var12) {
            final SubLObject var16 = module0365.f24850(var1);
            if (module0399.NIL != f28184(var4, var16, (SubLObject)module0399.NIL)) {
                final SubLObject var17 = module0384.f27259();
                if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                    module0384.f27262((SubLObject)module0399.$ic10$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, var17);
                }
                return (SubLObject)module0399.T;
            }
        }
        if (module0399.NIL != module0373.f26163(var1) && module0399.NIL != f28197(var4, var1)) {
            final SubLObject var18 = module0384.f27259();
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic11$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, var18);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != f28198(var4, var1)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic12$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != f28179(var1) && module0399.NIL == module0367.f25081(var4) && module0399.NIL != f28199(var4, var1, (SubLObject)module0399.T, (SubLObject)module0399.NIL, (SubLObject)module0399.T)) {
            final SubLObject var18 = module0384.f27259();
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic13$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, var18);
            }
            return (SubLObject)module0399.T;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28194(final SubLObject var4, final SubLObject var1, final SubLObject var12, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0399.NIL != module0376.f26618(var1)) {
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0363.f24606(module0365.f24850(var1))) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic14$, module0365.f24850(var1), (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0384.f27277(var4, var1)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262(module0384.f27296(var4, var1), (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0381.f27067(var1) && module0399.NIL != module0363.f24659(module0365.f24850(var1)) && !var1.eql(f28200(var4, module0365.f24850(var1)))) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic15$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0375.$g3188$.getDynamicValue(var15) && module0399.NIL != module0373.f26151(var1) && module0399.NIL != f28201(var1)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                module0384.f27262((SubLObject)module0399.$ic16$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28201(final SubLObject var1) {
        SubLObject var2;
        SubLObject var3;
        SubLObject var4;
        for (var2 = (SubLObject)module0399.NIL, var3 = (SubLObject)module0399.NIL, var3 = module0363.f24517(module0365.f24850(var1)); module0399.NIL == var2 && module0399.NIL != var3; var3 = var3.rest()) {
            var4 = var3.first();
            if (!var4.eql(var1) && module0399.NIL != module0375.f26586(var4)) {
                var2 = (SubLObject)module0399.T;
            }
        }
        return var2;
    }
    
    public static SubLObject f28192(final SubLObject var4, final SubLObject var13, SubLObject var12) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (module0399.NIL == var12) {
            final SubLObject var15 = module0364.f24725(var13);
            if (module0399.NIL != f28184(var4, var15, (SubLObject)module0399.UNPROVIDED)) {
                final SubLObject var16 = module0384.f27259();
                if (module0399.NIL != module0384.$g3229$.getDynamicValue(var14)) {
                    module0384.f27262((SubLObject)module0399.$ic17$, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, var13, var16);
                }
                return (SubLObject)module0399.T;
            }
        }
        if (module0399.NIL != module0377.f26746(var13) && module0399.NIL == module0369.f25608(module0367.f25037(var4), module0377.f26749(var13))) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var14)) {
                module0384.f27262((SubLObject)module0399.$ic18$, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, var13, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.NIL;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28189(final SubLObject var4, final SubLObject var3, SubLObject var8, SubLObject var19) {
        if (var8 == module0399.UNPROVIDED) {
            var8 = (SubLObject)module0399.T;
        }
        if (var19 == module0399.UNPROVIDED) {
            var19 = (SubLObject)module0399.NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0399.NIL != f28202(var4, var3, var8, var19)) {
            return (SubLObject)module0399.T;
        }
        final SubLObject var21 = module0367.f25173(var3, var4, (SubLObject)module0399.UNPROVIDED);
        if (module0399.NIL != Types.booleanp(var21)) {
            return var21;
        }
        final SubLObject var22 = f28203(var4, var3, var8, var19);
        if (module0399.NIL != var22) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)module0399.$ic19$, var3, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            module0367.f25177(var3, var4, (SubLObject)module0399.UNPROVIDED);
        }
        else {
            module0367.f25178(var3, var4, (SubLObject)module0399.UNPROVIDED);
        }
        return var22;
    }
    
    public static SubLObject f28202(final SubLObject var4, final SubLObject var3, final SubLObject var8, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0399.NIL != module0387.f27517(var4)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)module0399.$ic20$, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0398.f28164(var4, var3)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)module0399.$ic19$, var3, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != var8 && module0399.NIL != module0367.f25151(var3, var4) && module0399.NIL != f28204(var4, var3, (SubLObject)module0399.T)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)module0399.$ic21$, var3, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28203(final SubLObject var4, final SubLObject var3, final SubLObject var8, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0399.NIL == var19 && module0399.NIL != module0384.f27311(var4, var3)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262(module0384.f27294(var4, var3), (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28205(final SubLObject var4, final SubLObject var11, SubLObject var12, SubLObject var19) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        if (var19 == module0399.UNPROVIDED) {
            var19 = (SubLObject)module0399.NIL;
        }
        if (module0399.NIL != module0365.f24819(var11)) {
            return f28199(var4, var11, var12, (SubLObject)module0399.NIL, var19);
        }
        return f28206(var4, var11, var12, var19);
    }
    
    public static SubLObject f28199(final SubLObject var4, final SubLObject var1, SubLObject var12, SubLObject var14, SubLObject var19) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        if (var14 == module0399.UNPROVIDED) {
            var14 = (SubLObject)module0399.NIL;
        }
        if (var19 == module0399.UNPROVIDED) {
            var19 = (SubLObject)module0399.NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0399.NIL != f28207(var4, var1, var12, var14, var19)) {
            return (SubLObject)module0399.T;
        }
        final SubLObject var21 = module0367.f25227(var1, var4, (SubLObject)module0399.UNPROVIDED);
        if (module0399.NIL != Types.booleanp(var21)) {
            return var21;
        }
        final SubLObject var22 = f28208(var4, var1, var12, var14, var19);
        if (module0399.NIL != var22) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)module0399.$ic22$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            module0367.f25231(var1, var4, (SubLObject)module0399.UNPROVIDED);
        }
        else {
            module0367.f25232(var1, var4, (SubLObject)module0399.UNPROVIDED);
        }
        return var22;
    }
    
    public static SubLObject f28207(final SubLObject var4, final SubLObject var1, final SubLObject var12, final SubLObject var14, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0399.NIL != f28209(var4, var1)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)module0399.$ic22$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL == var19 && module0399.NIL != module0387.f27516(var4)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)module0399.$ic2$, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0387.f27517(var4)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)module0399.$ic20$, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL == var12) {
            final SubLObject var21 = module0365.f24850(var1);
            if (module0399.NIL != f28189(var4, var21, (SubLObject)module0399.NIL, var19)) {
                final SubLObject var22 = module0384.f27259();
                if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                    module0384.f27262((SubLObject)module0399.$ic23$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, var22);
                }
                return (SubLObject)module0399.T;
            }
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28208(final SubLObject var4, final SubLObject var1, final SubLObject var12, final SubLObject var14, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0399.NIL == var19 && module0399.NIL != module0384.f27285(var4, var1)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262(module0384.f27302(var4, var1), (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        if (module0399.NIL != module0373.f26163(var1) && module0399.NIL == module0373.f26365(module0367.f25037(var4), var1)) {
            if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                module0384.f27262((SubLObject)module0399.$ic24$, (SubLObject)module0399.NIL, var1, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL);
            }
            return (SubLObject)module0399.T;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28198(final SubLObject var4, final SubLObject var1) {
        if (module0399.NIL != module0377.f26773(var1)) {
            final SubLObject var5 = module0367.f25037(var4);
            if (module0399.NIL == module0369.f25607(var5)) {
                final SubLObject var6 = module0369.f25658(var5);
                if (module0399.ZERO_INTEGER.eql(var6)) {
                    return (SubLObject)module0399.T;
                }
                if (module0399.NIL != module0004.f105(var6)) {
                    SubLObject var7 = (SubLObject)module0399.ZERO_INTEGER;
                    SubLObject var8;
                    SubLObject var9;
                    SubLObject var10;
                    SubLObject var11;
                    for (var8 = (SubLObject)module0399.NIL, var9 = (SubLObject)module0399.NIL, var9 = module0363.f24517(module0365.f24850(var1)); module0399.NIL == var8 && module0399.NIL != var9; var9 = var9.rest()) {
                        var10 = var9.first();
                        if (module0399.NIL != module0363.f24524(var10, (SubLObject)module0399.$ic25$) && module0399.NIL != module0363.f24522(var10, module0365.f24865(var1))) {
                            var11 = module0377.f26753(var10);
                            if (module0399.NIL != var11 && module0399.NIL != module0369.f25608(var5, var11)) {
                                var7 = Numbers.add(var7, (SubLObject)module0399.ONE_INTEGER);
                                if (var7.numE(var6)) {
                                    var8 = (SubLObject)module0399.T;
                                }
                            }
                        }
                    }
                    return var8;
                }
            }
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28206(final SubLObject var4, final SubLObject var13, SubLObject var12, SubLObject var19) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        if (var19 == module0399.UNPROVIDED) {
            var19 = (SubLObject)module0399.NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0399.NIL == var12) {
            final SubLObject var21 = module0364.f24725(var13);
            if (module0399.NIL != f28189(var4, var21, (SubLObject)module0399.T, var19)) {
                final SubLObject var22 = module0384.f27259();
                if (module0399.NIL != module0384.$g3229$.getDynamicValue(var20)) {
                    module0384.f27262((SubLObject)module0399.$ic26$, (SubLObject)module0399.NIL, (SubLObject)module0399.NIL, var13, var22);
                }
                return (SubLObject)module0399.T;
            }
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28210(final SubLObject var4, final SubLObject var3) {
        return module0035.sublisp_boolean(f28211(var4, var3));
    }
    
    public static SubLObject f28211(final SubLObject var4, final SubLObject var3) {
        if (module0399.NIL != f28184(var4, var3, (SubLObject)module0399.UNPROVIDED)) {
            return (SubLObject)module0399.$ic27$;
        }
        if (module0399.NIL != f28189(var4, var3, (SubLObject)module0399.T, (SubLObject)module0399.T)) {
            return (SubLObject)module0399.$ic28$;
        }
        if (module0399.NIL == module0363.f24586(var3, var4)) {
            return (SubLObject)module0399.$ic29$;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28212(final SubLObject var4, final SubLObject var11) {
        return module0035.sublisp_boolean(f28213(var4, var11));
    }
    
    public static SubLObject f28213(final SubLObject var4, final SubLObject var11) {
        if (module0399.NIL != module0387.f27529(var11)) {
            return (SubLObject)module0399.$ic30$;
        }
        if (module0399.NIL != module0373.f26176(var11) && module0399.NIL != module0365.f24884(var11)) {
            return (SubLObject)module0399.$ic27$;
        }
        if (module0399.NIL != f28190(var4, var11, (SubLObject)module0399.UNPROVIDED)) {
            return (SubLObject)module0399.$ic27$;
        }
        if (module0399.NIL != f28205(var4, var11, (SubLObject)module0399.NIL, (SubLObject)module0399.T)) {
            return (SubLObject)module0399.$ic28$;
        }
        if (module0399.NIL == module0363.f24586(module0387.f27530(var11), var4)) {
            return (SubLObject)module0399.$ic29$;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28214(final SubLObject var4, final SubLObject var1) {
        return f28212(var4, var1);
    }
    
    public static SubLObject f28215(final SubLObject var4, final SubLObject var13) {
        return f28212(var4, var13);
    }
    
    public static SubLObject f28188(final SubLObject var4, final SubLObject var3, SubLObject var12) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        if (module0399.NIL == var12 && module0399.NIL != f28184(var4, var3, (SubLObject)module0399.UNPROVIDED)) {
            return (SubLObject)module0399.T;
        }
        SubLObject var13 = module0363.f24517(var3);
        SubLObject var14 = (SubLObject)module0399.NIL;
        var14 = var13.first();
        while (module0399.NIL != var13) {
            if (module0399.NIL == f28191(var4, var14, (SubLObject)module0399.T, (SubLObject)module0399.UNPROVIDED)) {
                return (SubLObject)module0399.NIL;
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return (SubLObject)module0399.T;
    }
    
    public static SubLObject f28204(final SubLObject var4, final SubLObject var3, SubLObject var12) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        if (module0399.NIL == var12 && module0399.NIL != f28189(var4, var3, (SubLObject)module0399.UNPROVIDED, (SubLObject)module0399.UNPROVIDED)) {
            return (SubLObject)module0399.T;
        }
        SubLObject var13 = module0363.f24517(var3);
        SubLObject var14 = (SubLObject)module0399.NIL;
        var14 = var13.first();
        while (module0399.NIL != var13) {
            if (module0399.NIL == f28199(var4, var14, (SubLObject)module0399.T, (SubLObject)module0399.UNPROVIDED, (SubLObject)module0399.UNPROVIDED)) {
                return (SubLObject)module0399.NIL;
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return (SubLObject)module0399.T;
    }
    
    public static SubLObject f28216(final SubLObject var4, final SubLObject var1, SubLObject var12, SubLObject var14) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        if (var14 == module0399.UNPROVIDED) {
            var14 = (SubLObject)module0399.NIL;
        }
        return f28199(var4, var1, var12, var14, (SubLObject)module0399.UNPROVIDED);
    }
    
    public static SubLObject f28217(final SubLObject var4, final SubLObject var1, SubLObject var12, SubLObject var14) {
        if (var12 == module0399.UNPROVIDED) {
            var12 = (SubLObject)module0399.NIL;
        }
        if (var14 == module0399.UNPROVIDED) {
            var14 = (SubLObject)module0399.NIL;
        }
        return f28191(var4, var1, var12, var14);
    }
    
    public static SubLObject f28218(final SubLObject var4, final SubLObject var1) {
        return f28214(var4, var1);
    }
    
    public static SubLObject f28196(final SubLObject var4, final SubLObject var1) {
        if (module0399.NIL != module0382.f27206(var1)) {
            return (SubLObject)module0399.T;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28219(final SubLObject var4, final SubLObject var3) {
        SubLObject var5 = (SubLObject)module0399.$ic32$;
        SubLObject var6 = (SubLObject)module0399.$ic33$;
        SubLObject var7 = (SubLObject)module0399.$ic32$;
        SubLObject var8 = module0363.f24517(var3);
        SubLObject var9 = (SubLObject)module0399.NIL;
        var9 = var8.first();
        while (module0399.NIL != var8) {
            if (module0399.NIL != module0363.f24524(var9, (SubLObject)module0399.$ic34$)) {
                final SubLObject var10 = module0373.f26168(var9);
                if (module0399.NIL != module0363.f24659(var10) && module0399.NIL != module0363.f24562(var10)) {
                    final SubLObject var11 = f28220(var4, var10);
                    final SubLObject var12 = module0363.f24564(var10);
                    if (module0399.NIL != module0360.f23940(var11, var6) || (module0399.NIL != module0360.f23939(var11, var6) && module0035.f2451(Symbols.symbol_function((SubLObject)module0399.$ic35$), var12, (SubLObject)module0399.UNPROVIDED).numL(module0035.f2451(Symbols.symbol_function((SubLObject)module0399.$ic35$), var7, (SubLObject)module0399.UNPROVIDED)))) {
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
        SubLObject var7 = (SubLObject)module0399.NIL;
        if (module0399.NIL == var6) {
            return f28219(var4, var3);
        }
        var7 = module0034.f1857(var6, (SubLObject)module0399.$ic31$, (SubLObject)module0399.UNPROVIDED);
        if (module0399.NIL == var7) {
            var7 = module0034.f1807(module0034.f1842(var6), (SubLObject)module0399.$ic31$, (SubLObject)module0399.TWO_INTEGER, (SubLObject)module0399.NIL, (SubLObject)module0399.EQ, (SubLObject)module0399.UNPROVIDED);
            module0034.f1860(var6, (SubLObject)module0399.$ic31$, var7);
        }
        final SubLObject var8 = module0034.f1782(var4, var3);
        final SubLObject var9 = module0034.f1814(var7, var8, (SubLObject)module0399.UNPROVIDED);
        if (var9 != module0399.$ic36$) {
            SubLObject var10 = var9;
            SubLObject var11 = (SubLObject)module0399.NIL;
            var11 = var10.first();
            while (module0399.NIL != var10) {
                SubLObject var12 = var11.first();
                final SubLObject var13 = conses_high.second(var11);
                if (var4.eql(var12.first())) {
                    var12 = var12.rest();
                    if (module0399.NIL != var12 && module0399.NIL == var12.rest() && var3.eql(var12.first())) {
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
        SubLObject var6 = (SubLObject)module0399.ZERO_INTEGER;
        SubLObject var7 = (SubLObject)module0399.NIL;
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
        SubLObject var13 = (SubLObject)module0399.NIL;
        var13 = var12.first();
        while (module0399.NIL != var12) {
            SubLObject var15;
            final SubLObject var14 = var15 = var13;
            SubLObject var16 = (SubLObject)module0399.NIL;
            SubLObject var17 = (SubLObject)module0399.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0399.$ic37$);
            var16 = var15.first();
            var15 = var15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0399.$ic37$);
            var17 = var15.first();
            var15 = var15.rest();
            if (module0399.NIL == var15) {
                if (module0399.NIL == module0384.f27352(var4, var16, var3)) {
                    var6 = module0360.f23944(var6, var17);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0399.$ic37$);
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        return var6;
    }
    
    public static SubLObject f28187(final SubLObject var4, final SubLObject var3) {
        assert module0399.NIL != module0398.f28152(var4) : var4;
        assert module0399.NIL != module0363.f24478(var3) : var3;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0399.NIL != module0398.f28162(var4, var3) && module0399.NIL == module0398.f28164(var4, var3));
    }
    
    public static SubLObject f28195(final SubLObject var4, final SubLObject var1) {
        return module0398.f28166(var4, var1);
    }
    
    public static SubLObject f28209(final SubLObject var4, final SubLObject var1) {
        return module0398.f28165(var4, var1);
    }
    
    public static SubLObject f28197(final SubLObject var4, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (module0399.NIL != module0382.f27206(var52)) {
            var53.resetMultipleValues();
            final SubLObject var54 = module0382.f27211(var52);
            final SubLObject var55 = var53.secondMultipleValue();
            var53.resetMultipleValues();
            if (module0399.NIL == var54 || module0399.NIL == var55) {
                return (SubLObject)module0399.NIL;
            }
            if (module0399.NIL != module0367.f25156(var54, var4) || module0399.NIL != module0367.f25156(var55, var4)) {
                return (SubLObject)module0399.NIL;
            }
            if (module0399.NIL != f28221(var4, var54) || module0399.NIL != f28221(var4, var55)) {
                return (SubLObject)module0399.T;
            }
        }
        else {
            final SubLObject var56 = module0373.f26168(var52);
            if (module0399.NIL != module0367.f25156(var56, var4)) {
                return (SubLObject)module0399.NIL;
            }
            if (module0399.NIL != var56 && module0399.NIL != f28221(var4, var56)) {
                return (SubLObject)module0399.T;
            }
        }
        final SubLObject var57 = module0373.f26167(var52);
        if (module0399.NIL != f28192(var4, var57, (SubLObject)module0399.T)) {
            return (SubLObject)module0399.T;
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28221(final SubLObject var4, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0399.NIL;
        final SubLObject var35 = module0399.$g3288$.currentBinding(var33);
        try {
            module0399.$g3288$.bind((SubLObject)module0399.NIL, var33);
            var34 = f28184(var4, var32, (SubLObject)module0399.UNPROVIDED);
        }
        finally {
            module0399.$g3288$.rebind(var35, var33);
        }
        return var34;
    }
    
    public static SubLObject f28183(final SubLObject var4, final SubLObject var3) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0399.NIL;
        final SubLObject var7 = module0384.$g3229$.currentBinding(var5);
        try {
            module0384.$g3229$.bind((SubLObject)module0399.NIL, var5);
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
        if (module0399.NIL != module0382.f27206(var52)) {
            var53.resetMultipleValues();
            final SubLObject var54 = module0382.f27211(var52);
            final SubLObject var55 = var53.secondMultipleValue();
            var53.resetMultipleValues();
            if (module0399.NIL == var54 || module0399.NIL == var55) {
                return (SubLObject)module0399.NIL;
            }
            if (module0399.NIL != module0367.f25156(var54, var4) || module0399.NIL != module0367.f25156(var55, var4)) {
                return (SubLObject)module0399.NIL;
            }
            if (module0399.NIL != f28189(var4, var54, (SubLObject)module0399.UNPROVIDED, (SubLObject)module0399.UNPROVIDED) || module0399.NIL != f28189(var4, var55, (SubLObject)module0399.UNPROVIDED, (SubLObject)module0399.UNPROVIDED)) {
                return (SubLObject)module0399.T;
            }
        }
        else {
            final SubLObject var56 = module0373.f26168(var52);
            if (module0399.NIL != module0367.f25156(var56, var4)) {
                return (SubLObject)module0399.NIL;
            }
            if (module0399.NIL != f28189(var4, var56, (SubLObject)module0399.UNPROVIDED, (SubLObject)module0399.UNPROVIDED)) {
                return (SubLObject)module0399.T;
            }
        }
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28223(final SubLObject var4) {
        SubLObject var5;
        SubLObject var6;
        for (var5 = (SubLObject)module0399.ZERO_INTEGER, var6 = f28224(var4), var5 = Numbers.add(var5, var6); var6.isPositive(); var6 = f28224(var4), var5 = Numbers.add(var5, var6)) {}
        return var5;
    }
    
    public static SubLObject f28224(final SubLObject var4) {
        final SubLObject var5 = f28225(var4);
        module0367.f25102(var4);
        SubLObject var6 = (SubLObject)module0399.ZERO_INTEGER;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0399.NIL;
        var8 = var7.first();
        while (module0399.NIL != var7) {
            if (module0399.NIL != f28226(var4, var8)) {
                module0387.f27512(var4, var8);
            }
            else {
                var6 = Numbers.add(var6, (SubLObject)module0399.ONE_INTEGER);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return var6;
    }
    
    public static SubLObject f28226(final SubLObject var4, final SubLObject var63) {
        return Equality.eq((SubLObject)module0399.$ic28$, f28211(var4, var63));
    }
    
    public static SubLObject f28227(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0398.f28175(var4);
        SubLObject var6 = (SubLObject)module0399.ZERO_INTEGER;
        final SubLObject var7 = module0373.$g3181$.currentBinding(var5);
        try {
            module0373.$g3181$.bind((SubLObject)module0399.T, var5);
            final SubLObject var8 = module0367.f25086(var4);
            module0367.f25102(var4);
            SubLObject var10;
            final SubLObject var9 = var10 = Sort.sort(var8, Symbols.symbol_function((SubLObject)module0399.$ic40$), Symbols.symbol_function((SubLObject)module0399.$ic41$));
            SubLObject var11 = (SubLObject)module0399.NIL;
            var11 = var10.first();
            while (module0399.NIL != var10) {
                if (module0399.NIL != f28228(var4, var11)) {
                    var6 = Numbers.add(var6, (SubLObject)module0399.ONE_INTEGER);
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
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28230() {
        module0399.$g3288$ = SubLFiles.defparameter("S#31357", (SubLObject)module0399.T);
        module0399.$g3289$ = SubLFiles.defvar("S#31358", (SubLObject)module0399.T);
        return (SubLObject)module0399.NIL;
    }
    
    public static SubLObject f28231() {
        module0034.f1895((SubLObject)module0399.$ic31$);
        return (SubLObject)module0399.NIL;
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
        module0399.$g3288$ = null;
        module0399.$g3289$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS");
        $ic1$ = SubLObjectFactory.makeKeyword("PROBLEM-ALREADY-THROWN-AWAY");
        $ic2$ = SubLObjectFactory.makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION");
        $ic3$ = SubLObjectFactory.makeKeyword("ALL-TACTICS-THROWN-AWAY");
        $ic4$ = SubLObjectFactory.makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");
        $ic5$ = SubLObjectFactory.makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS");
        $ic6$ = SubLObjectFactory.makeSymbol("S#24006", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM");
        $ic8$ = SubLObjectFactory.makeKeyword("TACTIC-ALREADY-THROWN-AWAY");
        $ic9$ = SubLObjectFactory.makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");
        $ic10$ = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");
        $ic11$ = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");
        $ic12$ = SubLObjectFactory.makeKeyword("TACTIC-GENERATED-ENOUGH");
        $ic13$ = SubLObjectFactory.makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");
        $ic14$ = SubLObjectFactory.makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK");
        $ic15$ = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED");
        $ic16$ = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION");
        $ic17$ = SubLObjectFactory.makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");
        $ic18$ = SubLObjectFactory.makeKeyword("LINK-RULE-DISALLOWED");
        $ic19$ = SubLObjectFactory.makeKeyword("PROBLEM-ALREADY-SET-ASIDE");
        $ic20$ = SubLObjectFactory.makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION");
        $ic21$ = SubLObjectFactory.makeKeyword("ALL-TACTICS-SET-ASIDE");
        $ic22$ = SubLObjectFactory.makeKeyword("TACTIC-ALREADY-SET-ASIDE");
        $ic23$ = SubLObjectFactory.makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");
        $ic24$ = SubLObjectFactory.makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH");
        $ic25$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic26$ = SubLObjectFactory.makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");
        $ic27$ = SubLObjectFactory.makeKeyword("THROW-AWAY");
        $ic28$ = SubLObjectFactory.makeKeyword("SET-ASIDE");
        $ic29$ = SubLObjectFactory.makeKeyword("IRRELEVANT");
        $ic30$ = SubLObjectFactory.makeKeyword("INVALID");
        $ic31$ = SubLObjectFactory.makeSymbol("S#31144", "CYC");
        $ic32$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic33$ = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $ic34$ = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $ic35$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic36$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#26071", "CYC"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#30356", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("<");
        $ic41$ = SubLObjectFactory.makeSymbol("S#26813", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0399.class
	Total time: 273 ms
	
	Decompiled with Procyon 0.5.32.
*/