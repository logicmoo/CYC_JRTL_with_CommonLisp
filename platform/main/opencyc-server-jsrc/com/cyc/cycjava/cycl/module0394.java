package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0394 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0394";
    public static final String myFingerPrint = "9ad7dae05fed4f60f4e8aec7ee44156719557a3e2b40592b537fe097fefed99d";
    private static SubLSymbol $g3283$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
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
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    
    public static SubLObject f28010(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0380.f26969(var1) && NIL != module0361.f24164(module0365.f24879(var1))) {
            return (SubLObject)NIL;
        }
        return module0387.$g3239$.getDynamicValue(var2);
    }
    
    public static SubLObject f28011(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0387.$g3239$.getDynamicValue(var4);
    }
    
    public static SubLObject f28012(final SubLObject var4, final SubLObject var3, SubLObject var5, SubLObject var6) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)T;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)T;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = f28013(var5, var6, (SubLObject)NIL);
        final SubLObject var10 = module0367.f25171(var3, var4, var9);
        if (NIL != Types.booleanp(var10)) {
            var8 = var10;
        }
        if (T != var10 && NIL != f28014(var4, var3, var5, var6)) {
            return (SubLObject)T;
        }
        if ($ic0$ == var10) {
            final SubLObject var11 = f28015(var4, var3, var5, var6);
            if (NIL != $g3283$.getDynamicValue(var7)) {
                if (NIL != var11) {
                    module0367.f25175(var3, var4, var9);
                }
                else {
                    module0367.f25176(var3, var4, var9);
                }
            }
            var8 = var11;
        }
        return var8;
    }
    
    public static SubLObject f28014(final SubLObject var4, final SubLObject var3, final SubLObject var5, final SubLObject var6) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28015(final SubLObject var4, final SubLObject var3, final SubLObject var5, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != var6 && NIL != f28016(var4, var3)) {
            return (SubLObject)T;
        }
        if (NIL != module0384.f27288(var4, var3)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var7)) {
                module0384.f27262(module0384.f27290(var4, var3), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != var5 && NIL != f28017(var4, var3, (SubLObject)T, var6)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var7)) {
                module0384.f27262((SubLObject)$ic1$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != f28011(var3) && NIL == module0367.f25081(var4) && NIL != f28018(var4, var3, (SubLObject)T, (SubLObject)T)) {
            final SubLObject var8 = module0384.f27259();
            if (NIL != module0384.$g3229$.getDynamicValue(var7)) {
                module0384.f27262((SubLObject)$ic2$, var3, (SubLObject)NIL, (SubLObject)NIL, var8);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28019(final SubLObject var4, final SubLObject var12, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL != module0365.f24819(var12)) {
            return f28020(var4, var12, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f28021(var4, var12, var13);
    }
    
    public static SubLObject f28020(final SubLObject var4, final SubLObject var1, SubLObject var13, SubLObject var15, SubLObject var16) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)T;
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)NIL;
        final SubLObject var19 = f28022(var13, var15, var16, (SubLObject)NIL);
        final SubLObject var20 = module0367.f25226(var1, var4, var19);
        if (NIL != Types.booleanp(var20)) {
            var18 = var20;
        }
        if (T != var20 && NIL != f28023(var4, var1, var13, var15, var16)) {
            return (SubLObject)T;
        }
        if ($ic0$ == var20) {
            final SubLObject var21 = f28024(var4, var1, var13, var15, var16);
            if (NIL != $g3283$.getDynamicValue(var17)) {
                if (NIL != var21) {
                    module0367.f25228(var1, var4, var19);
                }
                else {
                    module0367.f25229(var1, var4, var19);
                }
            }
            var18 = var21;
        }
        return var18;
    }
    
    public static SubLObject f28023(final SubLObject var4, final SubLObject var1, final SubLObject var13, final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (NIL != f28025(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)$ic3$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL == module0384.f27368(var4, var1)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28024(final SubLObject var4, final SubLObject var1, final SubLObject var13, final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (NIL != var16 && NIL != f28026(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)$ic4$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0384.f27277(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262(module0384.f27296(var4, var1), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0373.f26157(var1) && NIL != module0388.f27584(module0365.f24850(var1), var4)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)$ic5$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0373.f26146(var1) && NIL != module0384.f27366(var1, var4)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0373.f26176(var1) && NIL != module0384.f27361(var1, var4)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)$ic7$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0381.f27067(var1) && NIL != module0363.f24659(module0365.f24850(var1)) && !var1.eql(f28027(var4, module0365.f24850(var1)))) {
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)$ic8$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != f28028(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)$ic9$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL == var13) {
            final SubLObject var18 = module0365.f24850(var1);
            if (NIL != f28012(var4, var18, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
                final SubLObject var19 = module0384.f27259();
                if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                    module0384.f27262((SubLObject)$ic10$, (SubLObject)NIL, var1, (SubLObject)NIL, var19);
                }
                return (SubLObject)T;
            }
        }
        if (NIL != module0373.f26163(var1) && NIL != f28029(var4, var1)) {
            final SubLObject var20 = module0384.f27259();
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)$ic11$, (SubLObject)NIL, var1, (SubLObject)NIL, var20);
            }
            return (SubLObject)T;
        }
        if (NIL == var15 && NIL != module0380.f26969(var1) && NIL != f28030(var4, var1)) {
            return (SubLObject)T;
        }
        if (NIL != f28010(var1) && NIL == module0367.f25081(var4) && NIL != f28031(var4, var1, (SubLObject)T, (SubLObject)T, (SubLObject)T)) {
            final SubLObject var20 = module0384.f27259();
            if (NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)$ic12$, (SubLObject)NIL, var1, (SubLObject)NIL, var20);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28032(final SubLObject var1) {
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
    
    public static SubLObject f28021(final SubLObject var4, final SubLObject var14, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL == var13) {
            final SubLObject var16 = module0364.f24725(var14);
            if (NIL != f28012(var4, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var17 = module0384.f27259();
                if (NIL != module0384.$g3229$.getDynamicValue(var15)) {
                    module0384.f27262((SubLObject)$ic13$, (SubLObject)NIL, (SubLObject)NIL, var14, var17);
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28018(final SubLObject var4, final SubLObject var3, SubLObject var5, SubLObject var20) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)T;
        }
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = f28013(var5, (SubLObject)$ic14$, var20);
        final SubLObject var24 = module0367.f25173(var3, var4, var23);
        if (NIL != Types.booleanp(var24)) {
            var22 = var24;
        }
        if (T != var24 && NIL != f28033(var4, var3, var5, var20)) {
            return (SubLObject)T;
        }
        if ($ic0$ == var24) {
            final SubLObject var25 = f28034(var4, var3, var5, var20);
            if (NIL != $g3283$.getDynamicValue(var21)) {
                if (NIL != var25) {
                    module0367.f25177(var3, var4, var23);
                }
                else {
                    module0367.f25178(var3, var4, var23);
                }
            }
            var22 = var25;
        }
        return var22;
    }
    
    public static SubLObject f28033(final SubLObject var4, final SubLObject var3, final SubLObject var5, final SubLObject var20) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28034(final SubLObject var4, final SubLObject var3, final SubLObject var5, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != module0393.f27989(var4, var3)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)$ic15$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL == var20 && NIL != module0384.f27311(var4, var3)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262(module0384.f27294(var4, var3), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != var5 && NIL != module0367.f25151(var3, var4) && NIL != f28035(var4, var3, (SubLObject)T)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)$ic16$, var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28036(final SubLObject var4, final SubLObject var12, SubLObject var13, SubLObject var20) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        if (NIL != module0365.f24819(var12)) {
            return f28031(var4, var12, var13, (SubLObject)NIL, var20);
        }
        return f28037(var4, var12, var13, var20);
    }
    
    public static SubLObject f28031(final SubLObject var4, final SubLObject var1, SubLObject var13, SubLObject var15, SubLObject var20) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = f28022(var13, var15, (SubLObject)$ic14$, var20);
        final SubLObject var24 = module0367.f25227(var1, var4, var23);
        if (NIL != Types.booleanp(var24)) {
            var22 = var24;
        }
        if (T != var24 && NIL != f28038(var4, var1, var13, var15, var20)) {
            return (SubLObject)T;
        }
        if ($ic0$ == var24) {
            final SubLObject var25 = f28039(var4, var1, var13, var15, var20);
            if (NIL != $g3283$.getDynamicValue(var21)) {
                if (NIL != var25) {
                    module0367.f25231(var1, var4, var23);
                }
                else {
                    module0367.f25232(var1, var4, var23);
                }
            }
            var22 = var25;
        }
        return var22;
    }
    
    public static SubLObject f28040(final SubLObject var22) {
        if (NIL != Types.booleanp(var22)) {
            return var22;
        }
        if (var22 == $ic14$) {
            return (SubLObject)NIL;
        }
        Errors.error((SubLObject)$ic17$, var22);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28022(SubLObject var13, SubLObject var15, SubLObject var16, SubLObject var20) {
        var13 = f28040(var13);
        var15 = f28040(var15);
        var16 = f28040(var16);
        var20 = f28040(var20);
        final SubLObject var21 = (SubLObject)makeBoolean(NIL == var13);
        final SubLObject var22 = (SubLObject)makeBoolean(NIL == var15);
        final SubLObject var23 = (SubLObject)makeBoolean(NIL == var20);
        return (SubLObject)ConsesLow.list(var21, var22, var16, var23);
    }
    
    public static SubLObject f28013(SubLObject var5, SubLObject var6, SubLObject var20) {
        var5 = f28040(var5);
        var6 = f28040(var6);
        var20 = f28040(var20);
        final SubLObject var21 = (SubLObject)makeBoolean(NIL == var20);
        return (SubLObject)ConsesLow.list(var5, var6, var21);
    }
    
    public static SubLObject f28038(final SubLObject var4, final SubLObject var1, final SubLObject var13, final SubLObject var15, final SubLObject var20) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28039(final SubLObject var4, final SubLObject var1, final SubLObject var13, final SubLObject var15, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != f28041(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)$ic18$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL != module0381.f27067(var1) && NIL != f28042(var4, var1, (SubLObject)UNPROVIDED)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)$ic19$, (SubLObject)NIL, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        if (NIL == var13) {
            final SubLObject var22 = module0365.f24850(var1);
            if (NIL != f28018(var4, var22, (SubLObject)NIL, var20)) {
                final SubLObject var23 = module0384.f27259();
                if (NIL != module0384.$g3229$.getDynamicValue(var21)) {
                    module0384.f27262((SubLObject)$ic20$, (SubLObject)NIL, var1, (SubLObject)NIL, var23);
                }
                return (SubLObject)T;
            }
        }
        if (NIL != module0373.f26163(var1) && NIL != f28043(var4, var1)) {
            final SubLObject var24 = module0384.f27259();
            if (NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)$ic21$, (SubLObject)NIL, var1, (SubLObject)NIL, var24);
            }
            return (SubLObject)T;
        }
        if (NIL == var15 && NIL != module0380.f26969(var1) && NIL != f28044(var4, var1)) {
            return (SubLObject)T;
        }
        if (NIL == var20 && NIL != module0384.f27285(var4, var1)) {
            if (NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262(module0384.f27302(var4, var1), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28037(final SubLObject var4, final SubLObject var14, SubLObject var13, SubLObject var20) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL == var13) {
            final SubLObject var22 = module0364.f24725(var14);
            if (NIL != f28018(var4, var22, (SubLObject)T, var20)) {
                final SubLObject var23 = module0384.f27259();
                if (NIL != module0384.$g3229$.getDynamicValue(var21)) {
                    module0384.f27262((SubLObject)$ic22$, (SubLObject)NIL, (SubLObject)NIL, var14, var23);
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28045(final SubLObject var4, final SubLObject var3) {
        return module0035.sublisp_boolean(f28046(var4, var3));
    }
    
    public static SubLObject f28046(final SubLObject var4, final SubLObject var3) {
        if (NIL != f28012(var4, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic23$;
        }
        if (NIL != f28018(var4, var3, (SubLObject)T, (SubLObject)T)) {
            return (SubLObject)$ic24$;
        }
        if (NIL == module0363.f24586(var3, var4)) {
            return (SubLObject)$ic25$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28047(final SubLObject var4, final SubLObject var12) {
        return module0035.sublisp_boolean(f28048(var4, var12));
    }
    
    public static SubLObject f28048(final SubLObject var4, final SubLObject var12) {
        if (NIL != module0387.f27529(var12)) {
            return (SubLObject)$ic26$;
        }
        if ((NIL != module0373.f26176(var12) || NIL != module0381.f27067(var12)) && NIL != module0365.f24884(var12)) {
            return (SubLObject)$ic23$;
        }
        if (NIL != f28019(var4, var12, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic23$;
        }
        if (NIL != f28036(var4, var12, (SubLObject)NIL, (SubLObject)T)) {
            return (SubLObject)$ic24$;
        }
        if (NIL == module0363.f24586(module0387.f27530(var12), var4)) {
            return (SubLObject)$ic25$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28049(final SubLObject var4, final SubLObject var1) {
        return f28047(var4, var1);
    }
    
    public static SubLObject f28050(final SubLObject var4, final SubLObject var14) {
        return f28047(var4, var14);
    }
    
    public static SubLObject f28017(final SubLObject var4, final SubLObject var3, SubLObject var13, SubLObject var6) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL == var13 && NIL != f28012(var4, var3, (SubLObject)NIL, var6)) {
            return (SubLObject)T;
        }
        SubLObject var14 = module0363.f24517(var3);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            if (NIL == f28020(var4, var15, (SubLObject)T, (SubLObject)NIL, var6)) {
                return (SubLObject)NIL;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28035(final SubLObject var4, final SubLObject var3, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL == var13 && NIL != f28018(var4, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        SubLObject var14 = module0363.f24517(var3);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            if (NIL == f28031(var4, var15, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28051(final SubLObject var4, final SubLObject var3, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL == var13 && NIL != f28018(var4, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        SubLObject var14 = module0363.f24517(var3);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            if (NIL != module0363.f24524(var15, (SubLObject)$ic27$) && NIL == f28031(var4, var15, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28042(final SubLObject var4, final SubLObject var27, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var28 = module0381.f27095(var27);
        return (SubLObject)makeBoolean(NIL == module0363.f24562(var28) && NIL != module0363.f24626(var28, (SubLObject)$ic27$) && NIL != f28051(var4, var28, var13));
    }
    
    public static SubLObject f28052(final SubLObject var4, final SubLObject var14) {
        final SubLObject var15 = module0373.f26161(var14);
        if (NIL != f28020(var4, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28053(final SubLObject var4, final SubLObject var14) {
        final SubLObject var15 = module0373.f26161(var14);
        if (NIL != f28031(var4, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28054(final SubLObject var4, final SubLObject var14) {
        final SubLObject var15 = module0373.f26152(var14);
        if (NIL != f28020(var4, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28055(final SubLObject var4, final SubLObject var14) {
        final SubLObject var15 = module0373.f26152(var14);
        if (NIL != f28031(var4, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28056(final SubLObject var4, final SubLObject var1, SubLObject var13, SubLObject var15) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        return module0367.f25100(var4, (SubLObject)$ic28$, var1, var13, var15, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28057(final SubLObject var4, final SubLObject var1) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28025(final SubLObject var4, final SubLObject var1) {
        if (NIL != module0377.f26771(var1)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28027(final SubLObject var4, final SubLObject var3) {
        if (NIL == module0361.f24164(module0363.f24507(var3))) {
            return (SubLObject)NIL;
        }
        final SubLObject var5 = module0391.f27938(var4);
        return module0399.f28200(var5, var3);
    }
    
    public static SubLObject f28016(final SubLObject var4, final SubLObject var3) {
        assert NIL != module0397.f28129(var4) : var4;
        assert NIL != module0363.f24478(var3) : var3;
        return (SubLObject)makeBoolean(NIL != module0393.f27987(var4, var3) && NIL == module0393.f27989(var4, var3));
    }
    
    public static SubLObject f28026(final SubLObject var4, final SubLObject var1) {
        return module0393.f27991(var4, var1);
    }
    
    public static SubLObject f28041(final SubLObject var4, final SubLObject var1) {
        return module0393.f27990(var4, var1);
    }
    
    public static SubLObject f28029(final SubLObject var4, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0382.f27206(var30)) {
            var31.resetMultipleValues();
            final SubLObject var32 = module0382.f27211(var30);
            final SubLObject var33 = var31.secondMultipleValue();
            var31.resetMultipleValues();
            if (NIL == var32 || NIL == var33) {
                return (SubLObject)NIL;
            }
            if (NIL != module0367.f25156(var32, var4) || NIL != module0367.f25156(var33, var4)) {
                return (SubLObject)NIL;
            }
            if (NIL != f28058(var4, var32) || NIL != f28058(var4, var33)) {
                return (SubLObject)T;
            }
        }
        else {
            final SubLObject var34 = module0373.f26168(var30);
            if (NIL != module0367.f25156(var34, var4)) {
                return (SubLObject)NIL;
            }
            if (NIL != var34) {
                if (NIL != module0383.f27235(var30)) {
                    module0373.f26191(var34, var4);
                }
                if (NIL != f28058(var4, var34)) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28058(final SubLObject var4, final SubLObject var28) {
        SubLObject var29 = (SubLObject)NIL;
        final SubLObject var30 = (SubLObject)makeBoolean(NIL != module0363.f24562(var28) && NIL != module0363.f24553(var28));
        var29 = f28012(var4, var28, (SubLObject)T, var30);
        return var29;
    }
    
    public static SubLObject f28030(final SubLObject var4, final SubLObject var34) {
        SubLObject var35 = module0363.f24517(module0365.f24850(var34));
        SubLObject var36 = (SubLObject)NIL;
        var36 = var35.first();
        while (NIL != var35) {
            if (NIL != module0363.f24524(var36, (SubLObject)$ic31$) && !var36.eql(var34)) {
                if (NIL != f28059(var4, var34, var36)) {
                    return (SubLObject)T;
                }
                final SubLObject var37 = module0380.f26982(var36);
                return (SubLObject)makeBoolean(NIL == module0373.f26203(var37, var4) && NIL != ((NIL != module0387.f27483(var4)) ? module0373.f26333(var37, var4) : module0373.f26320(var37, var4)));
            }
            else {
                var35 = var35.rest();
                var36 = var35.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28059(final SubLObject var4, final SubLObject var34, final SubLObject var19) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)NIL;
        final SubLObject var37 = module0387.$g3239$.currentBinding(var35);
        try {
            module0387.$g3239$.bind((SubLObject)NIL, var35);
            if (NIL != f28056(var4, var19, (SubLObject)T, (SubLObject)T)) {
                final SubLObject var38 = module0384.f27259();
                if (NIL != module0384.$g3229$.getDynamicValue(var35)) {
                    module0384.f27262((SubLObject)$ic32$, (SubLObject)NIL, var34, (SubLObject)NIL, var38);
                }
                var36 = (SubLObject)T;
            }
        }
        finally {
            module0387.$g3239$.rebind(var37, var35);
        }
        return var36;
    }
    
    public static SubLObject f28060(final SubLObject var4, final SubLObject var3) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0384.$g3229$.currentBinding(var5);
        try {
            module0384.$g3229$.bind((SubLObject)NIL, var5);
            var5.resetMultipleValues();
            final SubLObject var8 = module0395.f28088(var4, var3);
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
    
    public static SubLObject f28043(final SubLObject var4, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0382.f27206(var30)) {
            var31.resetMultipleValues();
            final SubLObject var32 = module0382.f27211(var30);
            final SubLObject var33 = var31.secondMultipleValue();
            var31.resetMultipleValues();
            if (NIL == var32 || NIL == var33) {
                return (SubLObject)NIL;
            }
            if (NIL != module0367.f25156(var32, var4) || NIL != module0367.f25156(var33, var4)) {
                return (SubLObject)NIL;
            }
            if (NIL != f28018(var4, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f28018(var4, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        else {
            final SubLObject var34 = module0373.f26168(var30);
            if (NIL != module0367.f25156(var34, var4)) {
                return (SubLObject)NIL;
            }
            if (NIL != f28018(var4, var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28044(final SubLObject var4, final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = module0363.f24517(module0365.f24850(var34));
        SubLObject var37 = (SubLObject)NIL;
        var37 = var36.first();
        while (NIL != var36) {
            if (NIL != module0363.f24524(var37, (SubLObject)$ic31$) && !var37.eql(var34) && NIL != f28061(var4, var37)) {
                final SubLObject var38 = module0380.f26982(var37);
                if ((NIL != module0373.f26333(var38, var4) && NIL == module0373.f26203(var38, var4)) || NIL != f28020(var4, var37, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED)) {
                    final SubLObject var39 = module0384.f27259();
                    if (NIL != module0384.$g3229$.getDynamicValue(var35)) {
                        module0384.f27262((SubLObject)$ic33$, (SubLObject)NIL, var34, (SubLObject)NIL, var39);
                    }
                    return (SubLObject)T;
                }
            }
            var36 = var36.rest();
            var37 = var36.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28061(final SubLObject var4, final SubLObject var34) {
        if (NIL != module0387.f27483(var4)) {
            return module0367.f25100(var4, (SubLObject)$ic34$, var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28028(final SubLObject var4, final SubLObject var40) {
        return f28062(module0367.f25037(var4), var40);
    }
    
    public static SubLObject f28062(final SubLObject var41, final SubLObject var40) {
        if (NIL != module0376.f26621(var40)) {
            SubLObject var42;
            SubLObject var43;
            SubLObject var44;
            for (var42 = (SubLObject)NIL, var43 = (SubLObject)NIL, var43 = module0363.f24517(module0365.f24850(var40)); NIL == var42 && NIL != var43; var43 = var43.rest()) {
                var44 = var43.first();
                if (NIL != module0363.f24524(var44, (SubLObject)$ic35$) && NIL != module0363.f24518(var44, (SubLObject)$ic36$) && !var44.eql(var40) && NIL == inference_datastructures_inference_oc.f25613(var41, module0365.f24865(var44))) {
                    var42 = (SubLObject)T;
                }
            }
            return var42;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28063(final SubLObject var4) {
        SubLObject var5;
        SubLObject var6;
        for (var5 = (SubLObject)ZERO_INTEGER, var6 = f28064(var4), var5 = Numbers.add(var5, var6); var6.isPositive(); var6 = f28064(var4), var5 = Numbers.add(var5, var6)) {}
        return var5;
    }
    
    public static SubLObject f28064(final SubLObject var4) {
        final SubLObject var5 = f28065(var4);
        module0367.f25102(var4);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (NIL != f28066(var4, var8)) {
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
    
    public static SubLObject f28066(final SubLObject var4, final SubLObject var47) {
        return Equality.eq((SubLObject)$ic24$, f28046(var4, var47));
    }
    
    public static SubLObject f28067(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0393.f28006(var4);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = module0373.$g3181$.currentBinding(var5);
        try {
            module0373.$g3181$.bind((SubLObject)T, var5);
            final SubLObject var8 = module0367.f25086(var4);
            module0367.f25102(var4);
            SubLObject var10;
            final SubLObject var9 = var10 = Sort.sort(var8, Symbols.symbol_function((SubLObject)$ic37$), Symbols.symbol_function((SubLObject)$ic38$));
            SubLObject var11 = (SubLObject)NIL;
            var11 = var10.first();
            while (NIL != var10) {
                if (NIL != f28068(var4, var11)) {
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
    
    public static SubLObject f28065(final SubLObject var4) {
        return module0367.f25086(var4);
    }
    
    public static SubLObject f28068(final SubLObject var4, final SubLObject var3) {
        module0387.f27513(var3, var4);
        return module0373.f26296(var4, var3);
    }
    
    public static SubLObject f28069() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28010", "S#31146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28011", "S#31147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28012", "S#31148", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28014", "S#31149", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28015", "S#31150", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28019", "S#31151", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28020", "S#31152", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28023", "S#31153", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28024", "S#31154", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28032", "S#31155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28021", "S#31156", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28018", "S#31157", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28033", "S#31158", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28034", "S#31159", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28036", "S#31160", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28031", "S#31161", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28040", "S#31162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28022", "S#31163", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28013", "S#31164", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28038", "S#31165", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28039", "S#31166", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28037", "S#31167", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28045", "S#31168", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28046", "S#31169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28047", "S#31170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28048", "S#31171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28049", "S#31172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28050", "S#31173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28017", "S#31174", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28035", "S#31175", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28051", "S#31176", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28042", "S#31177", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28052", "S#31178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28053", "S#31179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28054", "S#31180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28055", "S#31181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28056", "S#31182", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28057", "S#31183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28025", "S#31184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28027", "S#31185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28016", "S#31186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28026", "S#31187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28041", "S#31188", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28029", "S#31189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28058", "S#31190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28030", "S#31191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28059", "S#31192", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28060", "S#31193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28043", "S#31194", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28044", "S#31195", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28061", "S#31196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28028", "S#31197", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28062", "S#31198", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28063", "S#31199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28064", "S#31200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28066", "S#31201", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28067", "S#31202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28065", "S#31203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0394", "f28068", "S#31204", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28070() {
        $g3283$ = SubLFiles.defparameter("S#31205", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28071() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28069();
    }
    
    public void initializeVariables() {
        f28070();
    }
    
    public void runTopLevelForms() {
        f28071();
    }
    
    static {
        me = (SubLFile)new module0394();
        $g3283$ = null;
        $ic0$ = makeKeyword("RECOMPUTE");
        $ic1$ = makeKeyword("ALL-TACTICS-THROWN-AWAY");
        $ic2$ = makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");
        $ic3$ = makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");
        $ic4$ = makeKeyword("TACTIC-ALREADY-THROWN-AWAY");
        $ic5$ = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL");
        $ic6$ = makeString("tactic is disallowed");
        $ic7$ = makeString("tactic is impossible");
        $ic8$ = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED");
        $ic9$ = makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY");
        $ic10$ = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");
        $ic11$ = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");
        $ic12$ = makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");
        $ic13$ = makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");
        $ic14$ = makeKeyword("NOT-APPLICABLE");
        $ic15$ = makeKeyword("PROBLEM-ALREADY-SET-ASIDE");
        $ic16$ = makeKeyword("ALL-TACTICS-SET-ASIDE");
        $ic17$ = makeString("Condition ~A not handled yet");
        $ic18$ = makeKeyword("TACTIC-ALREADY-SET-ASIDE");
        $ic19$ = makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS");
        $ic20$ = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");
        $ic21$ = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE");
        $ic22$ = makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");
        $ic23$ = makeKeyword("THROW-AWAY");
        $ic24$ = makeKeyword("SET-ASIDE");
        $ic25$ = makeKeyword("IRRELEVANT");
        $ic26$ = makeKeyword("INVALID");
        $ic27$ = makeKeyword("REMOVAL-CONJUNCTIVE");
        $ic28$ = makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC");
        $ic29$ = makeSymbol("S#29327", "CYC");
        $ic30$ = makeSymbol("S#26082", "CYC");
        $ic31$ = makeKeyword("SPLIT");
        $ic32$ = makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
        $ic33$ = makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
        $ic34$ = makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL");
        $ic35$ = makeKeyword("GENERALIZED-REMOVAL");
        $ic36$ = makeKeyword("POSSIBLE");
        $ic37$ = makeSymbol("<");
        $ic38$ = makeSymbol("S#26813", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 284 ms
	
	Decompiled with Procyon 0.5.32.
*/