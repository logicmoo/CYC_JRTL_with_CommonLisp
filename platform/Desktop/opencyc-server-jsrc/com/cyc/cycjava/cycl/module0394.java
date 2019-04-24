package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (module0394.NIL != module0380.f26969(var1) && module0394.NIL != module0361.f24164(module0365.f24879(var1))) {
            return (SubLObject)module0394.NIL;
        }
        return module0387.$g3239$.getDynamicValue(var2);
    }
    
    public static SubLObject f28011(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0387.$g3239$.getDynamicValue(var4);
    }
    
    public static SubLObject f28012(final SubLObject var4, final SubLObject var3, SubLObject var5, SubLObject var6) {
        if (var5 == module0394.UNPROVIDED) {
            var5 = (SubLObject)module0394.T;
        }
        if (var6 == module0394.UNPROVIDED) {
            var6 = (SubLObject)module0394.T;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0394.NIL;
        final SubLObject var9 = f28013(var5, var6, (SubLObject)module0394.NIL);
        final SubLObject var10 = module0367.f25171(var3, var4, var9);
        if (module0394.NIL != Types.booleanp(var10)) {
            var8 = var10;
        }
        if (module0394.T != var10 && module0394.NIL != f28014(var4, var3, var5, var6)) {
            return (SubLObject)module0394.T;
        }
        if (module0394.$ic0$ == var10) {
            final SubLObject var11 = f28015(var4, var3, var5, var6);
            if (module0394.NIL != module0394.$g3283$.getDynamicValue(var7)) {
                if (module0394.NIL != var11) {
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
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28015(final SubLObject var4, final SubLObject var3, final SubLObject var5, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0394.NIL != var6 && module0394.NIL != f28016(var4, var3)) {
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != module0384.f27288(var4, var3)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var7)) {
                module0384.f27262(module0384.f27290(var4, var3), (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != var5 && module0394.NIL != f28017(var4, var3, (SubLObject)module0394.T, var6)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var7)) {
                module0384.f27262((SubLObject)module0394.$ic1$, var3, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != f28011(var3) && module0394.NIL == module0367.f25081(var4) && module0394.NIL != f28018(var4, var3, (SubLObject)module0394.T, (SubLObject)module0394.T)) {
            final SubLObject var8 = module0384.f27259();
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var7)) {
                module0384.f27262((SubLObject)module0394.$ic2$, var3, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, var8);
            }
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28019(final SubLObject var4, final SubLObject var12, SubLObject var13) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        if (module0394.NIL != module0365.f24819(var12)) {
            return f28020(var4, var12, var13, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED);
        }
        return f28021(var4, var12, var13);
    }
    
    public static SubLObject f28020(final SubLObject var4, final SubLObject var1, SubLObject var13, SubLObject var15, SubLObject var16) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        if (var15 == module0394.UNPROVIDED) {
            var15 = (SubLObject)module0394.NIL;
        }
        if (var16 == module0394.UNPROVIDED) {
            var16 = (SubLObject)module0394.T;
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0394.NIL;
        final SubLObject var19 = f28022(var13, var15, var16, (SubLObject)module0394.NIL);
        final SubLObject var20 = module0367.f25226(var1, var4, var19);
        if (module0394.NIL != Types.booleanp(var20)) {
            var18 = var20;
        }
        if (module0394.T != var20 && module0394.NIL != f28023(var4, var1, var13, var15, var16)) {
            return (SubLObject)module0394.T;
        }
        if (module0394.$ic0$ == var20) {
            final SubLObject var21 = f28024(var4, var1, var13, var15, var16);
            if (module0394.NIL != module0394.$g3283$.getDynamicValue(var17)) {
                if (module0394.NIL != var21) {
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
        if (module0394.NIL != f28025(var4, var1)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)module0394.$ic3$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL == module0384.f27368(var4, var1)) {
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28024(final SubLObject var4, final SubLObject var1, final SubLObject var13, final SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0394.NIL != var16 && module0394.NIL != f28026(var4, var1)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)module0394.$ic4$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != module0384.f27277(var4, var1)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262(module0384.f27296(var4, var1), (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != module0373.f26157(var1) && module0394.NIL != module0388.f27584(module0365.f24850(var1), var4)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)module0394.$ic5$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != module0373.f26146(var1) && module0394.NIL != module0384.f27366(var1, var4)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)module0394.$ic6$, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != module0373.f26176(var1) && module0394.NIL != module0384.f27361(var1, var4)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)module0394.$ic7$, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != module0381.f27067(var1) && module0394.NIL != module0363.f24659(module0365.f24850(var1)) && !var1.eql(f28027(var4, module0365.f24850(var1)))) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)module0394.$ic8$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != f28028(var4, var1)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)module0394.$ic9$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL == var13) {
            final SubLObject var18 = module0365.f24850(var1);
            if (module0394.NIL != f28012(var4, var18, (SubLObject)module0394.NIL, (SubLObject)module0394.UNPROVIDED)) {
                final SubLObject var19 = module0384.f27259();
                if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                    module0384.f27262((SubLObject)module0394.$ic10$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, var19);
                }
                return (SubLObject)module0394.T;
            }
        }
        if (module0394.NIL != module0373.f26163(var1) && module0394.NIL != f28029(var4, var1)) {
            final SubLObject var20 = module0384.f27259();
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)module0394.$ic11$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, var20);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL == var15 && module0394.NIL != module0380.f26969(var1) && module0394.NIL != f28030(var4, var1)) {
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != f28010(var1) && module0394.NIL == module0367.f25081(var4) && module0394.NIL != f28031(var4, var1, (SubLObject)module0394.T, (SubLObject)module0394.T, (SubLObject)module0394.T)) {
            final SubLObject var20 = module0384.f27259();
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var17)) {
                module0384.f27262((SubLObject)module0394.$ic12$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, var20);
            }
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28032(final SubLObject var1) {
        SubLObject var2;
        SubLObject var3;
        SubLObject var4;
        for (var2 = (SubLObject)module0394.NIL, var3 = (SubLObject)module0394.NIL, var3 = module0363.f24517(module0365.f24850(var1)); module0394.NIL == var2 && module0394.NIL != var3; var3 = var3.rest()) {
            var4 = var3.first();
            if (!var4.eql(var1) && module0394.NIL != module0375.f26586(var4)) {
                var2 = (SubLObject)module0394.T;
            }
        }
        return var2;
    }
    
    public static SubLObject f28021(final SubLObject var4, final SubLObject var14, SubLObject var13) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0394.NIL == var13) {
            final SubLObject var16 = module0364.f24725(var14);
            if (module0394.NIL != f28012(var4, var16, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
                final SubLObject var17 = module0384.f27259();
                if (module0394.NIL != module0384.$g3229$.getDynamicValue(var15)) {
                    module0384.f27262((SubLObject)module0394.$ic13$, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, var14, var17);
                }
                return (SubLObject)module0394.T;
            }
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28018(final SubLObject var4, final SubLObject var3, SubLObject var5, SubLObject var20) {
        if (var5 == module0394.UNPROVIDED) {
            var5 = (SubLObject)module0394.T;
        }
        if (var20 == module0394.UNPROVIDED) {
            var20 = (SubLObject)module0394.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0394.NIL;
        final SubLObject var23 = f28013(var5, (SubLObject)module0394.$ic14$, var20);
        final SubLObject var24 = module0367.f25173(var3, var4, var23);
        if (module0394.NIL != Types.booleanp(var24)) {
            var22 = var24;
        }
        if (module0394.T != var24 && module0394.NIL != f28033(var4, var3, var5, var20)) {
            return (SubLObject)module0394.T;
        }
        if (module0394.$ic0$ == var24) {
            final SubLObject var25 = f28034(var4, var3, var5, var20);
            if (module0394.NIL != module0394.$g3283$.getDynamicValue(var21)) {
                if (module0394.NIL != var25) {
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
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28034(final SubLObject var4, final SubLObject var3, final SubLObject var5, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0394.NIL != module0393.f27989(var4, var3)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)module0394.$ic15$, var3, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL == var20 && module0394.NIL != module0384.f27311(var4, var3)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262(module0384.f27294(var4, var3), (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != var5 && module0394.NIL != module0367.f25151(var3, var4) && module0394.NIL != f28035(var4, var3, (SubLObject)module0394.T)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)module0394.$ic16$, var3, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28036(final SubLObject var4, final SubLObject var12, SubLObject var13, SubLObject var20) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        if (var20 == module0394.UNPROVIDED) {
            var20 = (SubLObject)module0394.NIL;
        }
        if (module0394.NIL != module0365.f24819(var12)) {
            return f28031(var4, var12, var13, (SubLObject)module0394.NIL, var20);
        }
        return f28037(var4, var12, var13, var20);
    }
    
    public static SubLObject f28031(final SubLObject var4, final SubLObject var1, SubLObject var13, SubLObject var15, SubLObject var20) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        if (var15 == module0394.UNPROVIDED) {
            var15 = (SubLObject)module0394.NIL;
        }
        if (var20 == module0394.UNPROVIDED) {
            var20 = (SubLObject)module0394.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0394.NIL;
        final SubLObject var23 = f28022(var13, var15, (SubLObject)module0394.$ic14$, var20);
        final SubLObject var24 = module0367.f25227(var1, var4, var23);
        if (module0394.NIL != Types.booleanp(var24)) {
            var22 = var24;
        }
        if (module0394.T != var24 && module0394.NIL != f28038(var4, var1, var13, var15, var20)) {
            return (SubLObject)module0394.T;
        }
        if (module0394.$ic0$ == var24) {
            final SubLObject var25 = f28039(var4, var1, var13, var15, var20);
            if (module0394.NIL != module0394.$g3283$.getDynamicValue(var21)) {
                if (module0394.NIL != var25) {
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
        if (module0394.NIL != Types.booleanp(var22)) {
            return var22;
        }
        if (var22 == module0394.$ic14$) {
            return (SubLObject)module0394.NIL;
        }
        Errors.error((SubLObject)module0394.$ic17$, var22);
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28022(SubLObject var13, SubLObject var15, SubLObject var16, SubLObject var20) {
        var13 = f28040(var13);
        var15 = f28040(var15);
        var16 = f28040(var16);
        var20 = f28040(var20);
        final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0394.NIL == var13);
        final SubLObject var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0394.NIL == var15);
        final SubLObject var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0394.NIL == var20);
        return (SubLObject)ConsesLow.list(var21, var22, var16, var23);
    }
    
    public static SubLObject f28013(SubLObject var5, SubLObject var6, SubLObject var20) {
        var5 = f28040(var5);
        var6 = f28040(var6);
        var20 = f28040(var20);
        final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0394.NIL == var20);
        return (SubLObject)ConsesLow.list(var5, var6, var21);
    }
    
    public static SubLObject f28038(final SubLObject var4, final SubLObject var1, final SubLObject var13, final SubLObject var15, final SubLObject var20) {
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28039(final SubLObject var4, final SubLObject var1, final SubLObject var13, final SubLObject var15, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0394.NIL != f28041(var4, var1)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)module0394.$ic18$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL != module0381.f27067(var1) && module0394.NIL != f28042(var4, var1, (SubLObject)module0394.UNPROVIDED)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)module0394.$ic19$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL == var13) {
            final SubLObject var22 = module0365.f24850(var1);
            if (module0394.NIL != f28018(var4, var22, (SubLObject)module0394.NIL, var20)) {
                final SubLObject var23 = module0384.f27259();
                if (module0394.NIL != module0384.$g3229$.getDynamicValue(var21)) {
                    module0384.f27262((SubLObject)module0394.$ic20$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, var23);
                }
                return (SubLObject)module0394.T;
            }
        }
        if (module0394.NIL != module0373.f26163(var1) && module0394.NIL != f28043(var4, var1)) {
            final SubLObject var24 = module0384.f27259();
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262((SubLObject)module0394.$ic21$, (SubLObject)module0394.NIL, var1, (SubLObject)module0394.NIL, var24);
            }
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL == var15 && module0394.NIL != module0380.f26969(var1) && module0394.NIL != f28044(var4, var1)) {
            return (SubLObject)module0394.T;
        }
        if (module0394.NIL == var20 && module0394.NIL != module0384.f27285(var4, var1)) {
            if (module0394.NIL != module0384.$g3229$.getDynamicValue(var21)) {
                module0384.f27262(module0384.f27302(var4, var1), (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL);
            }
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28037(final SubLObject var4, final SubLObject var14, SubLObject var13, SubLObject var20) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        if (var20 == module0394.UNPROVIDED) {
            var20 = (SubLObject)module0394.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0394.NIL == var13) {
            final SubLObject var22 = module0364.f24725(var14);
            if (module0394.NIL != f28018(var4, var22, (SubLObject)module0394.T, var20)) {
                final SubLObject var23 = module0384.f27259();
                if (module0394.NIL != module0384.$g3229$.getDynamicValue(var21)) {
                    module0384.f27262((SubLObject)module0394.$ic22$, (SubLObject)module0394.NIL, (SubLObject)module0394.NIL, var14, var23);
                }
                return (SubLObject)module0394.T;
            }
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28045(final SubLObject var4, final SubLObject var3) {
        return module0035.sublisp_boolean(f28046(var4, var3));
    }
    
    public static SubLObject f28046(final SubLObject var4, final SubLObject var3) {
        if (module0394.NIL != f28012(var4, var3, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
            return (SubLObject)module0394.$ic23$;
        }
        if (module0394.NIL != f28018(var4, var3, (SubLObject)module0394.T, (SubLObject)module0394.T)) {
            return (SubLObject)module0394.$ic24$;
        }
        if (module0394.NIL == module0363.f24586(var3, var4)) {
            return (SubLObject)module0394.$ic25$;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28047(final SubLObject var4, final SubLObject var12) {
        return module0035.sublisp_boolean(f28048(var4, var12));
    }
    
    public static SubLObject f28048(final SubLObject var4, final SubLObject var12) {
        if (module0394.NIL != module0387.f27529(var12)) {
            return (SubLObject)module0394.$ic26$;
        }
        if ((module0394.NIL != module0373.f26176(var12) || module0394.NIL != module0381.f27067(var12)) && module0394.NIL != module0365.f24884(var12)) {
            return (SubLObject)module0394.$ic23$;
        }
        if (module0394.NIL != f28019(var4, var12, (SubLObject)module0394.UNPROVIDED)) {
            return (SubLObject)module0394.$ic23$;
        }
        if (module0394.NIL != f28036(var4, var12, (SubLObject)module0394.NIL, (SubLObject)module0394.T)) {
            return (SubLObject)module0394.$ic24$;
        }
        if (module0394.NIL == module0363.f24586(module0387.f27530(var12), var4)) {
            return (SubLObject)module0394.$ic25$;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28049(final SubLObject var4, final SubLObject var1) {
        return f28047(var4, var1);
    }
    
    public static SubLObject f28050(final SubLObject var4, final SubLObject var14) {
        return f28047(var4, var14);
    }
    
    public static SubLObject f28017(final SubLObject var4, final SubLObject var3, SubLObject var13, SubLObject var6) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        if (var6 == module0394.UNPROVIDED) {
            var6 = (SubLObject)module0394.NIL;
        }
        if (module0394.NIL == var13 && module0394.NIL != f28012(var4, var3, (SubLObject)module0394.NIL, var6)) {
            return (SubLObject)module0394.T;
        }
        SubLObject var14 = module0363.f24517(var3);
        SubLObject var15 = (SubLObject)module0394.NIL;
        var15 = var14.first();
        while (module0394.NIL != var14) {
            if (module0394.NIL == f28020(var4, var15, (SubLObject)module0394.T, (SubLObject)module0394.NIL, var6)) {
                return (SubLObject)module0394.NIL;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)module0394.T;
    }
    
    public static SubLObject f28035(final SubLObject var4, final SubLObject var3, SubLObject var13) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        if (module0394.NIL == var13 && module0394.NIL != f28018(var4, var3, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
            return (SubLObject)module0394.T;
        }
        SubLObject var14 = module0363.f24517(var3);
        SubLObject var15 = (SubLObject)module0394.NIL;
        var15 = var14.first();
        while (module0394.NIL != var14) {
            if (module0394.NIL == f28031(var4, var15, (SubLObject)module0394.T, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
                return (SubLObject)module0394.NIL;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)module0394.T;
    }
    
    public static SubLObject f28051(final SubLObject var4, final SubLObject var3, SubLObject var13) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        if (module0394.NIL == var13 && module0394.NIL != f28018(var4, var3, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
            return (SubLObject)module0394.T;
        }
        SubLObject var14 = module0363.f24517(var3);
        SubLObject var15 = (SubLObject)module0394.NIL;
        var15 = var14.first();
        while (module0394.NIL != var14) {
            if (module0394.NIL != module0363.f24524(var15, (SubLObject)module0394.$ic27$) && module0394.NIL == f28031(var4, var15, (SubLObject)module0394.T, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
                return (SubLObject)module0394.NIL;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)module0394.T;
    }
    
    public static SubLObject f28042(final SubLObject var4, final SubLObject var27, SubLObject var13) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        final SubLObject var28 = module0381.f27095(var27);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0394.NIL == module0363.f24562(var28) && module0394.NIL != module0363.f24626(var28, (SubLObject)module0394.$ic27$) && module0394.NIL != f28051(var4, var28, var13));
    }
    
    public static SubLObject f28052(final SubLObject var4, final SubLObject var14) {
        final SubLObject var15 = module0373.f26161(var14);
        if (module0394.NIL != f28020(var4, var15, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28053(final SubLObject var4, final SubLObject var14) {
        final SubLObject var15 = module0373.f26161(var14);
        if (module0394.NIL != f28031(var4, var15, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28054(final SubLObject var4, final SubLObject var14) {
        final SubLObject var15 = module0373.f26152(var14);
        if (module0394.NIL != f28020(var4, var15, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28055(final SubLObject var4, final SubLObject var14) {
        final SubLObject var15 = module0373.f26152(var14);
        if (module0394.NIL != f28031(var4, var15, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28056(final SubLObject var4, final SubLObject var1, SubLObject var13, SubLObject var15) {
        if (var13 == module0394.UNPROVIDED) {
            var13 = (SubLObject)module0394.NIL;
        }
        if (var15 == module0394.UNPROVIDED) {
            var15 = (SubLObject)module0394.NIL;
        }
        return module0367.f25100(var4, (SubLObject)module0394.$ic28$, var1, var13, var15, (SubLObject)module0394.UNPROVIDED);
    }
    
    public static SubLObject f28057(final SubLObject var4, final SubLObject var1) {
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28025(final SubLObject var4, final SubLObject var1) {
        if (module0394.NIL != module0377.f26771(var1)) {
            return (SubLObject)module0394.T;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28027(final SubLObject var4, final SubLObject var3) {
        if (module0394.NIL == module0361.f24164(module0363.f24507(var3))) {
            return (SubLObject)module0394.NIL;
        }
        final SubLObject var5 = module0391.f27938(var4);
        return module0399.f28200(var5, var3);
    }
    
    public static SubLObject f28016(final SubLObject var4, final SubLObject var3) {
        assert module0394.NIL != module0397.f28129(var4) : var4;
        assert module0394.NIL != module0363.f24478(var3) : var3;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0394.NIL != module0393.f27987(var4, var3) && module0394.NIL == module0393.f27989(var4, var3));
    }
    
    public static SubLObject f28026(final SubLObject var4, final SubLObject var1) {
        return module0393.f27991(var4, var1);
    }
    
    public static SubLObject f28041(final SubLObject var4, final SubLObject var1) {
        return module0393.f27990(var4, var1);
    }
    
    public static SubLObject f28029(final SubLObject var4, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (module0394.NIL != module0382.f27206(var30)) {
            var31.resetMultipleValues();
            final SubLObject var32 = module0382.f27211(var30);
            final SubLObject var33 = var31.secondMultipleValue();
            var31.resetMultipleValues();
            if (module0394.NIL == var32 || module0394.NIL == var33) {
                return (SubLObject)module0394.NIL;
            }
            if (module0394.NIL != module0367.f25156(var32, var4) || module0394.NIL != module0367.f25156(var33, var4)) {
                return (SubLObject)module0394.NIL;
            }
            if (module0394.NIL != f28058(var4, var32) || module0394.NIL != f28058(var4, var33)) {
                return (SubLObject)module0394.T;
            }
        }
        else {
            final SubLObject var34 = module0373.f26168(var30);
            if (module0394.NIL != module0367.f25156(var34, var4)) {
                return (SubLObject)module0394.NIL;
            }
            if (module0394.NIL != var34) {
                if (module0394.NIL != module0383.f27235(var30)) {
                    module0373.f26191(var34, var4);
                }
                if (module0394.NIL != f28058(var4, var34)) {
                    return (SubLObject)module0394.T;
                }
            }
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28058(final SubLObject var4, final SubLObject var28) {
        SubLObject var29 = (SubLObject)module0394.NIL;
        final SubLObject var30 = (SubLObject)SubLObjectFactory.makeBoolean(module0394.NIL != module0363.f24562(var28) && module0394.NIL != module0363.f24553(var28));
        var29 = f28012(var4, var28, (SubLObject)module0394.T, var30);
        return var29;
    }
    
    public static SubLObject f28030(final SubLObject var4, final SubLObject var34) {
        SubLObject var35 = module0363.f24517(module0365.f24850(var34));
        SubLObject var36 = (SubLObject)module0394.NIL;
        var36 = var35.first();
        while (module0394.NIL != var35) {
            if (module0394.NIL != module0363.f24524(var36, (SubLObject)module0394.$ic31$) && !var36.eql(var34)) {
                if (module0394.NIL != f28059(var4, var34, var36)) {
                    return (SubLObject)module0394.T;
                }
                final SubLObject var37 = module0380.f26982(var36);
                return (SubLObject)SubLObjectFactory.makeBoolean(module0394.NIL == module0373.f26203(var37, var4) && module0394.NIL != ((module0394.NIL != module0387.f27483(var4)) ? module0373.f26333(var37, var4) : module0373.f26320(var37, var4)));
            }
            else {
                var35 = var35.rest();
                var36 = var35.first();
            }
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28059(final SubLObject var4, final SubLObject var34, final SubLObject var19) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0394.NIL;
        final SubLObject var37 = module0387.$g3239$.currentBinding(var35);
        try {
            module0387.$g3239$.bind((SubLObject)module0394.NIL, var35);
            if (module0394.NIL != f28056(var4, var19, (SubLObject)module0394.T, (SubLObject)module0394.T)) {
                final SubLObject var38 = module0384.f27259();
                if (module0394.NIL != module0384.$g3229$.getDynamicValue(var35)) {
                    module0384.f27262((SubLObject)module0394.$ic32$, (SubLObject)module0394.NIL, var34, (SubLObject)module0394.NIL, var38);
                }
                var36 = (SubLObject)module0394.T;
            }
        }
        finally {
            module0387.$g3239$.rebind(var37, var35);
        }
        return var36;
    }
    
    public static SubLObject f28060(final SubLObject var4, final SubLObject var3) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0394.NIL;
        final SubLObject var7 = module0384.$g3229$.currentBinding(var5);
        try {
            module0384.$g3229$.bind((SubLObject)module0394.NIL, var5);
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
        if (module0394.NIL != module0382.f27206(var30)) {
            var31.resetMultipleValues();
            final SubLObject var32 = module0382.f27211(var30);
            final SubLObject var33 = var31.secondMultipleValue();
            var31.resetMultipleValues();
            if (module0394.NIL == var32 || module0394.NIL == var33) {
                return (SubLObject)module0394.NIL;
            }
            if (module0394.NIL != module0367.f25156(var32, var4) || module0394.NIL != module0367.f25156(var33, var4)) {
                return (SubLObject)module0394.NIL;
            }
            if (module0394.NIL != f28018(var4, var32, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED) || module0394.NIL != f28018(var4, var33, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
                return (SubLObject)module0394.T;
            }
        }
        else {
            final SubLObject var34 = module0373.f26168(var30);
            if (module0394.NIL != module0367.f25156(var34, var4)) {
                return (SubLObject)module0394.NIL;
            }
            if (module0394.NIL != f28018(var4, var34, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED)) {
                return (SubLObject)module0394.T;
            }
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28044(final SubLObject var4, final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = module0363.f24517(module0365.f24850(var34));
        SubLObject var37 = (SubLObject)module0394.NIL;
        var37 = var36.first();
        while (module0394.NIL != var36) {
            if (module0394.NIL != module0363.f24524(var37, (SubLObject)module0394.$ic31$) && !var37.eql(var34) && module0394.NIL != f28061(var4, var37)) {
                final SubLObject var38 = module0380.f26982(var37);
                if ((module0394.NIL != module0373.f26333(var38, var4) && module0394.NIL == module0373.f26203(var38, var4)) || module0394.NIL != f28020(var4, var37, (SubLObject)module0394.T, (SubLObject)module0394.T, (SubLObject)module0394.UNPROVIDED)) {
                    final SubLObject var39 = module0384.f27259();
                    if (module0394.NIL != module0384.$g3229$.getDynamicValue(var35)) {
                        module0384.f27262((SubLObject)module0394.$ic33$, (SubLObject)module0394.NIL, var34, (SubLObject)module0394.NIL, var39);
                    }
                    return (SubLObject)module0394.T;
                }
            }
            var36 = var36.rest();
            var37 = var36.first();
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28061(final SubLObject var4, final SubLObject var34) {
        if (module0394.NIL != module0387.f27483(var4)) {
            return module0367.f25100(var4, (SubLObject)module0394.$ic34$, var34, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED, (SubLObject)module0394.UNPROVIDED);
        }
        return (SubLObject)module0394.T;
    }
    
    public static SubLObject f28028(final SubLObject var4, final SubLObject var40) {
        return f28062(module0367.f25037(var4), var40);
    }
    
    public static SubLObject f28062(final SubLObject var41, final SubLObject var40) {
        if (module0394.NIL != module0376.f26621(var40)) {
            SubLObject var42;
            SubLObject var43;
            SubLObject var44;
            for (var42 = (SubLObject)module0394.NIL, var43 = (SubLObject)module0394.NIL, var43 = module0363.f24517(module0365.f24850(var40)); module0394.NIL == var42 && module0394.NIL != var43; var43 = var43.rest()) {
                var44 = var43.first();
                if (module0394.NIL != module0363.f24524(var44, (SubLObject)module0394.$ic35$) && module0394.NIL != module0363.f24518(var44, (SubLObject)module0394.$ic36$) && !var44.eql(var40) && module0394.NIL == module0369.f25613(var41, module0365.f24865(var44))) {
                    var42 = (SubLObject)module0394.T;
                }
            }
            return var42;
        }
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28063(final SubLObject var4) {
        SubLObject var5;
        SubLObject var6;
        for (var5 = (SubLObject)module0394.ZERO_INTEGER, var6 = f28064(var4), var5 = Numbers.add(var5, var6); var6.isPositive(); var6 = f28064(var4), var5 = Numbers.add(var5, var6)) {}
        return var5;
    }
    
    public static SubLObject f28064(final SubLObject var4) {
        final SubLObject var5 = f28065(var4);
        module0367.f25102(var4);
        SubLObject var6 = (SubLObject)module0394.ZERO_INTEGER;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0394.NIL;
        var8 = var7.first();
        while (module0394.NIL != var7) {
            if (module0394.NIL != f28066(var4, var8)) {
                module0387.f27512(var4, var8);
            }
            else {
                var6 = Numbers.add(var6, (SubLObject)module0394.ONE_INTEGER);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return var6;
    }
    
    public static SubLObject f28066(final SubLObject var4, final SubLObject var47) {
        return Equality.eq((SubLObject)module0394.$ic24$, f28046(var4, var47));
    }
    
    public static SubLObject f28067(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0393.f28006(var4);
        SubLObject var6 = (SubLObject)module0394.ZERO_INTEGER;
        final SubLObject var7 = module0373.$g3181$.currentBinding(var5);
        try {
            module0373.$g3181$.bind((SubLObject)module0394.T, var5);
            final SubLObject var8 = module0367.f25086(var4);
            module0367.f25102(var4);
            SubLObject var10;
            final SubLObject var9 = var10 = Sort.sort(var8, Symbols.symbol_function((SubLObject)module0394.$ic37$), Symbols.symbol_function((SubLObject)module0394.$ic38$));
            SubLObject var11 = (SubLObject)module0394.NIL;
            var11 = var10.first();
            while (module0394.NIL != var10) {
                if (module0394.NIL != f28068(var4, var11)) {
                    var6 = Numbers.add(var6, (SubLObject)module0394.ONE_INTEGER);
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
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28070() {
        module0394.$g3283$ = SubLFiles.defparameter("S#31205", (SubLObject)module0394.T);
        return (SubLObject)module0394.NIL;
    }
    
    public static SubLObject f28071() {
        return (SubLObject)module0394.NIL;
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
        module0394.$g3283$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("RECOMPUTE");
        $ic1$ = SubLObjectFactory.makeKeyword("ALL-TACTICS-THROWN-AWAY");
        $ic2$ = SubLObjectFactory.makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");
        $ic3$ = SubLObjectFactory.makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");
        $ic4$ = SubLObjectFactory.makeKeyword("TACTIC-ALREADY-THROWN-AWAY");
        $ic5$ = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL");
        $ic6$ = SubLObjectFactory.makeString("tactic is disallowed");
        $ic7$ = SubLObjectFactory.makeString("tactic is impossible");
        $ic8$ = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED");
        $ic9$ = SubLObjectFactory.makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY");
        $ic10$ = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");
        $ic11$ = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");
        $ic12$ = SubLObjectFactory.makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");
        $ic13$ = SubLObjectFactory.makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");
        $ic14$ = SubLObjectFactory.makeKeyword("NOT-APPLICABLE");
        $ic15$ = SubLObjectFactory.makeKeyword("PROBLEM-ALREADY-SET-ASIDE");
        $ic16$ = SubLObjectFactory.makeKeyword("ALL-TACTICS-SET-ASIDE");
        $ic17$ = SubLObjectFactory.makeString("Condition ~A not handled yet");
        $ic18$ = SubLObjectFactory.makeKeyword("TACTIC-ALREADY-SET-ASIDE");
        $ic19$ = SubLObjectFactory.makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS");
        $ic20$ = SubLObjectFactory.makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");
        $ic21$ = SubLObjectFactory.makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE");
        $ic22$ = SubLObjectFactory.makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");
        $ic23$ = SubLObjectFactory.makeKeyword("THROW-AWAY");
        $ic24$ = SubLObjectFactory.makeKeyword("SET-ASIDE");
        $ic25$ = SubLObjectFactory.makeKeyword("IRRELEVANT");
        $ic26$ = SubLObjectFactory.makeKeyword("INVALID");
        $ic27$ = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE");
        $ic28$ = SubLObjectFactory.makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#29327", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("SPLIT");
        $ic32$ = SubLObjectFactory.makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
        $ic33$ = SubLObjectFactory.makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
        $ic34$ = SubLObjectFactory.makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL");
        $ic35$ = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL");
        $ic36$ = SubLObjectFactory.makeKeyword("POSSIBLE");
        $ic37$ = SubLObjectFactory.makeSymbol("<");
        $ic38$ = SubLObjectFactory.makeSymbol("S#26813", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0394.class
	Total time: 284 ms
	
	Decompiled with Procyon 0.5.32.
*/