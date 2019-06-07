package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0447 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0447";
    public static final String myFingerPrint = "62af4792a4a66121afa65cbad30855bcc279e9e26623edb9ee3fd91007f3aa2f";
    private static SubLSymbol $g3574$;
    public static SubLSymbol $g3575$;
    private static SubLSymbol $g3576$;
    private static SubLSymbol $g3577$;
    private static SubLSymbol $g3578$;
    public static SubLSymbol $g3579$;
    private static SubLSymbol $g3580$;
    private static SubLSymbol $g3581$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLList $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    
    public static SubLObject f30904(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0220.f14548(var2, var1, var3, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30905(final SubLObject var4) {
        if (NIL != assertion_handles_oc.f11035(var4) && NIL == module0351.f23568(var4)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f30906(final SubLObject var4) {
        return (NIL != module0178.f11284(var4)) ? module0178.f11285(var4) : module0191.f11961(var4);
    }
    
    public static SubLObject f30907(final SubLObject var5) {
        final SubLObject var6 = (SubLObject)ZERO_INTEGER;
        return var6;
    }
    
    public static SubLObject f30908(final SubLObject var2, final SubLObject var7) {
        if (var7.eql((SubLObject)$ic0$)) {
            return module0349.f23411(var2);
        }
        if (var7.eql((SubLObject)$ic1$)) {
            return module0349.f23416(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30909(final SubLObject var2, final SubLObject var7, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var7.eql((SubLObject)$ic2$)) {
            return (SubLObject)makeBoolean(NIL != f30910(var2, var3) || NIL != f30911(var2, var3));
        }
        if (var7.eql((SubLObject)$ic0$)) {
            return f30910(var2, var3);
        }
        if (var7.eql((SubLObject)$ic1$)) {
            return f30911(var2, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30912(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f30904($ic3$, var2, var3);
    }
    
    public static SubLObject f30910(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = module0349.f23411(var2);
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (NIL != f30912(var6, var3)) {
                return (SubLObject)T;
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30911(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = module0349.f23416(var2);
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (NIL != f30912(var6, var3)) {
                return (SubLObject)T;
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30913(final SubLObject var14, final SubLObject var7, final SubLObject var15) {
        if (NIL != var15 && NIL == module0435.f30628()) {
            return (SubLObject)NIL;
        }
        final SubLObject var16 = module0205.f13333(var14);
        return (SubLObject)makeBoolean(NIL == module0333.f22416(var16) && (NIL == var15 || NIL != module0461.f31411($ic4$)) && NIL != f30909(var16, var7, (SubLObject)NIL));
    }
    
    public static SubLObject f30914() {
        return module0191.f11990((SubLObject)$ic8$, $g3574$.getGlobalValue(), $g3575$.getGlobalValue(), (SubLObject)$ic9$);
    }
    
    public static SubLObject f30915(final SubLObject var2, final SubLObject var16, final SubLObject var17) {
        return module0202.f12761((SubLObject)ConsesLow.list($ic4$, var2, var16, var17));
    }
    
    public static SubLObject f30916(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL != module0337.f22626((SubLObject)$ic12$, var14)) {
            final SubLObject var20 = (SubLObject)$ic13$;
            var19.resetMultipleValues();
            final SubLObject var21 = module0337.f22630(var14, var20);
            final SubLObject var22 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (NIL != var21) {
                final SubLObject var23 = module0035.f2294(var22, (SubLObject)$ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var24 = module0035.f2294(var22, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var25 = module0035.f2294(var22, (SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var26 = module0035.f2294(var22, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var27 = module0035.f2294(var22, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var25.eql(var27) && NIL == module0260.f17089(var25, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)T;
                }
                if (NIL == module0234.f15434(var24, var26)) {
                    return (SubLObject)T;
                }
            }
        }
        else {
            if (NIL == module0337.f22626((SubLObject)$ic19$, var14)) {
                return (SubLObject)T;
            }
            final SubLObject var20 = (SubLObject)$ic20$;
            var19.resetMultipleValues();
            final SubLObject var21 = module0337.f22630(var14, var20);
            final SubLObject var22 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (NIL != var21) {
                final SubLObject var23 = module0035.f2294(var22, (SubLObject)$ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var24 = module0035.f2294(var22, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var25 = module0035.f2294(var22, (SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var26 = module0035.f2294(var22, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var27 = module0035.f2294(var22, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var25.eql(var27) && NIL == module0260.f17094(var25, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)T;
                }
                if (NIL == module0234.f15434(var24, var26)) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30917(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL == f30913(var14, (SubLObject)$ic2$, (SubLObject)NIL)) {
            return (SubLObject)NIL;
        }
        final SubLObject var20 = module0205.f13333(var14);
        final SubLObject var21 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12590(var22) && NIL != module0205.f13221($ic4$, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var19.resetMultipleValues();
            final SubLObject var23 = module0202.f12797(var22);
            final SubLObject var24 = var19.secondMultipleValue();
            final SubLObject var25 = var19.thirdMultipleValue();
            final SubLObject var26 = var19.fourthMultipleValue();
            var19.resetMultipleValues();
            return (SubLObject)makeBoolean((var24.eql(var20) || NIL != module0260.f17089(var24, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && var21.equal(var25));
        }
        if (NIL != module0202.f12590(var21) && NIL != module0205.f13221($ic4$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var19.resetMultipleValues();
            final SubLObject var23 = module0202.f12797(var21);
            final SubLObject var24 = var19.secondMultipleValue();
            final SubLObject var25 = var19.thirdMultipleValue();
            final SubLObject var26 = var19.fourthMultipleValue();
            var19.resetMultipleValues();
            return (SubLObject)makeBoolean((var24.eql(var20) || NIL != module0260.f17094(var24, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && var22.equal(var25));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30918(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0205.f13333(var14);
        final SubLObject var21 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        if (NIL != module0202.f12590(var22) && NIL != module0205.f13221($ic4$, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var19.resetMultipleValues();
            final SubLObject var31_32 = module0202.f12797(var22);
            final SubLObject var33_34 = var19.secondMultipleValue();
            final SubLObject var35_36 = var19.thirdMultipleValue();
            final SubLObject var37_38 = var19.fourthMultipleValue();
            var19.resetMultipleValues();
            var23 = var31_32;
            var24 = var33_34;
            var25 = var35_36;
            var26 = var37_38;
            var27 = (SubLObject)$ic0$;
        }
        else if (NIL != module0202.f12590(var21) && NIL != module0205.f13221($ic4$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var19.resetMultipleValues();
            final SubLObject var39_40 = module0202.f12797(var21);
            final SubLObject var41_42 = var19.secondMultipleValue();
            final SubLObject var43_44 = var19.thirdMultipleValue();
            final SubLObject var45_46 = var19.fourthMultipleValue();
            var19.resetMultipleValues();
            var23 = var39_40;
            var24 = var41_42;
            var25 = var43_44;
            var26 = var45_46;
            var27 = (SubLObject)$ic1$;
        }
        final SubLObject var28 = module0202.f12761((SubLObject)ConsesLow.list($ic3$, var24, var25, var26));
        final SubLObject var29 = module0349.f23449(var28, (SubLObject)$ic21$);
        final SubLObject var31;
        final SubLObject var30 = var31 = module0158.f10294(var29);
        if (var31.eql((SubLObject)$ic22$)) {
            var19.resetMultipleValues();
            final SubLObject var50_51 = module0158.f10297(var29);
            final SubLObject var32 = var19.secondMultipleValue();
            final SubLObject var53_54 = var19.thirdMultipleValue();
            var19.resetMultipleValues();
            if (NIL != var32) {
                if (NIL != var53_54) {
                    final SubLObject var33 = var53_54;
                    if (NIL != module0158.f10010(var50_51, var32, var33)) {
                        final SubLObject var34 = module0158.f10011(var50_51, var32, var33);
                        SubLObject var35 = (SubLObject)NIL;
                        final SubLObject var36 = (SubLObject)NIL;
                        while (NIL == var35) {
                            final SubLObject var37 = module0052.f3695(var34, var36);
                            final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                            if (NIL != var38) {
                                SubLObject var39 = (SubLObject)NIL;
                                try {
                                    var39 = module0158.f10316(var37, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                    SubLObject var57_62 = (SubLObject)NIL;
                                    final SubLObject var58_63 = (SubLObject)NIL;
                                    while (NIL == var57_62) {
                                        final SubLObject var40 = module0052.f3695(var39, var58_63);
                                        final SubLObject var60_65 = (SubLObject)makeBoolean(!var58_63.eql(var40));
                                        if (NIL != var60_65) {
                                            f30919(var20, var25, var26, var40, var27);
                                        }
                                        var57_62 = (SubLObject)makeBoolean(NIL == var60_65);
                                    }
                                }
                                finally {
                                    final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                        if (NIL != var39) {
                                            module0158.f10319(var39);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var41, var19);
                                    }
                                }
                            }
                            var35 = (SubLObject)makeBoolean(NIL == var38);
                        }
                    }
                }
                else {
                    final SubLObject var33 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var50_51, var32, var33)) {
                        final SubLObject var34 = module0158.f10011(var50_51, var32, var33);
                        SubLObject var35 = (SubLObject)NIL;
                        final SubLObject var36 = (SubLObject)NIL;
                        while (NIL == var35) {
                            final SubLObject var37 = module0052.f3695(var34, var36);
                            final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                            if (NIL != var38) {
                                SubLObject var39 = (SubLObject)NIL;
                                try {
                                    var39 = module0158.f10316(var37, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                    SubLObject var57_63 = (SubLObject)NIL;
                                    final SubLObject var58_64 = (SubLObject)NIL;
                                    while (NIL == var57_63) {
                                        final SubLObject var40 = module0052.f3695(var39, var58_64);
                                        final SubLObject var60_66 = (SubLObject)makeBoolean(!var58_64.eql(var40));
                                        if (NIL != var60_66) {
                                            f30919(var20, var25, var26, var40, var27);
                                        }
                                        var57_63 = (SubLObject)makeBoolean(NIL == var60_66);
                                    }
                                }
                                finally {
                                    final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                        if (NIL != var39) {
                                            module0158.f10319(var39);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var42, var19);
                                    }
                                }
                            }
                            var35 = (SubLObject)makeBoolean(NIL == var38);
                        }
                    }
                }
            }
            else if (NIL != var53_54) {
                final SubLObject var33 = var53_54;
                if (NIL != module0158.f10010(var50_51, (SubLObject)NIL, var33)) {
                    final SubLObject var34 = module0158.f10011(var50_51, (SubLObject)NIL, var33);
                    SubLObject var35 = (SubLObject)NIL;
                    final SubLObject var36 = (SubLObject)NIL;
                    while (NIL == var35) {
                        final SubLObject var37 = module0052.f3695(var34, var36);
                        final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                        if (NIL != var38) {
                            SubLObject var39 = (SubLObject)NIL;
                            try {
                                var39 = module0158.f10316(var37, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                SubLObject var57_64 = (SubLObject)NIL;
                                final SubLObject var58_65 = (SubLObject)NIL;
                                while (NIL == var57_64) {
                                    final SubLObject var40 = module0052.f3695(var39, var58_65);
                                    final SubLObject var60_67 = (SubLObject)makeBoolean(!var58_65.eql(var40));
                                    if (NIL != var60_67) {
                                        f30919(var20, var25, var26, var40, var27);
                                    }
                                    var57_64 = (SubLObject)makeBoolean(NIL == var60_67);
                                }
                            }
                            finally {
                                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var39) {
                                        module0158.f10319(var39);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var19);
                                }
                            }
                        }
                        var35 = (SubLObject)makeBoolean(NIL == var38);
                    }
                }
            }
            else {
                final SubLObject var33 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var50_51, (SubLObject)NIL, var33)) {
                    final SubLObject var34 = module0158.f10011(var50_51, (SubLObject)NIL, var33);
                    SubLObject var35 = (SubLObject)NIL;
                    final SubLObject var36 = (SubLObject)NIL;
                    while (NIL == var35) {
                        final SubLObject var37 = module0052.f3695(var34, var36);
                        final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                        if (NIL != var38) {
                            SubLObject var39 = (SubLObject)NIL;
                            try {
                                var39 = module0158.f10316(var37, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                SubLObject var57_65 = (SubLObject)NIL;
                                final SubLObject var58_66 = (SubLObject)NIL;
                                while (NIL == var57_65) {
                                    final SubLObject var40 = module0052.f3695(var39, var58_66);
                                    final SubLObject var60_68 = (SubLObject)makeBoolean(!var58_66.eql(var40));
                                    if (NIL != var60_68) {
                                        f30919(var20, var25, var26, var40, var27);
                                    }
                                    var57_65 = (SubLObject)makeBoolean(NIL == var60_68);
                                }
                            }
                            finally {
                                final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var39) {
                                        module0158.f10319(var39);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var44, var19);
                                }
                            }
                        }
                        var35 = (SubLObject)makeBoolean(NIL == var38);
                    }
                }
            }
        }
        else if (var31.eql((SubLObject)$ic24$)) {
            final SubLObject var45 = module0158.f10299(var29);
            if (NIL != module0158.f10038(var45)) {
                final SubLObject var46 = (SubLObject)NIL;
                final SubLObject var47 = module0012.$g73$.currentBinding(var19);
                final SubLObject var48 = module0012.$g65$.currentBinding(var19);
                final SubLObject var49 = module0012.$g67$.currentBinding(var19);
                final SubLObject var50 = module0012.$g68$.currentBinding(var19);
                final SubLObject var51 = module0012.$g66$.currentBinding(var19);
                final SubLObject var52 = module0012.$g69$.currentBinding(var19);
                final SubLObject var53 = module0012.$g70$.currentBinding(var19);
                final SubLObject var54 = module0012.$silent_progressP$.currentBinding(var19);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var19);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var19), var19);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var19);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g70$.bind((SubLObject)T, var19);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var46) ? module0012.$silent_progressP$.getDynamicValue(var19) : T), var19);
                    module0012.f474(var46);
                    final SubLObject var55 = module0158.f10039(var45);
                    SubLObject var56 = (SubLObject)NIL;
                    final SubLObject var57 = (SubLObject)NIL;
                    while (NIL == var56) {
                        final SubLObject var58 = module0052.f3695(var55, var57);
                        final SubLObject var59 = (SubLObject)makeBoolean(!var57.eql(var58));
                        if (NIL != var59) {
                            module0012.f476();
                            SubLObject var60 = (SubLObject)NIL;
                            try {
                                var60 = module0158.f10316(var58, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                SubLObject var57_66 = (SubLObject)NIL;
                                final SubLObject var58_67 = (SubLObject)NIL;
                                while (NIL == var57_66) {
                                    final SubLObject var61 = module0052.f3695(var60, var58_67);
                                    final SubLObject var60_69 = (SubLObject)makeBoolean(!var58_67.eql(var61));
                                    if (NIL != var60_69) {
                                        f30919(var20, var25, var26, var61, var27);
                                    }
                                    var57_66 = (SubLObject)makeBoolean(NIL == var60_69);
                                }
                            }
                            finally {
                                final SubLObject var66_89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var60) {
                                        module0158.f10319(var60);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var66_89, var19);
                                }
                            }
                        }
                        var56 = (SubLObject)makeBoolean(NIL == var59);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var54, var19);
                    module0012.$g70$.rebind(var53, var19);
                    module0012.$g69$.rebind(var52, var19);
                    module0012.$g66$.rebind(var51, var19);
                    module0012.$g68$.rebind(var50, var19);
                    module0012.$g67$.rebind(var49, var19);
                    module0012.$g65$.rebind(var48, var19);
                    module0012.$g73$.rebind(var47, var19);
                }
            }
        }
        else if (var31.eql((SubLObject)$ic25$)) {
            SubLObject var62 = module0218.f14453(module0158.f10301(var29), (SubLObject)UNPROVIDED);
            SubLObject var63 = (SubLObject)NIL;
            var63 = var62.first();
            while (NIL != var62) {
                if (NIL == module0130.f8518((SubLObject)$ic21$) || NIL != module0178.f11343(var63, module0130.f8518((SubLObject)$ic21$))) {
                    f30919(var20, var25, var26, var63, var27);
                }
                var62 = var62.rest();
                var63 = var62.first();
            }
        }
        else {
            module0158.f10295(var29, var30);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30919(final SubLObject var30, final SubLObject var26, final SubLObject var17, final SubLObject var4, final SubLObject var7) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL == f30905(var4)) {
            return (SubLObject)NIL;
        }
        final SubLObject var32 = f30906(var4);
        if (NIL != module0202.f12734(var32, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED)) {
            var31.resetMultipleValues();
            final SubLObject var33 = module0202.f12797(var32);
            final SubLObject var34 = var31.secondMultipleValue();
            final SubLObject var35 = var31.thirdMultipleValue();
            final SubLObject var36 = var31.fourthMultipleValue();
            var31.resetMultipleValues();
            if (!var35.equal(var26) || !var36.equal(var17)) {
                return (SubLObject)NIL;
            }
            SubLObject var37 = (SubLObject)NIL;
            if (var7.eql((SubLObject)$ic0$)) {
                if (var34.eql(var30) || NIL != module0260.f17089(var34, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    final SubLObject var38 = f30914();
                    final SubLObject var39 = module0435.f30622(var34, var30);
                    var37 = (SubLObject)ConsesLow.listS(var38, var39);
                }
            }
            else if (var7.eql((SubLObject)$ic1$)) {
                if (var34.eql(var30) || NIL != module0260.f17094(var34, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {}
                final SubLObject var38 = f30914();
                final SubLObject var40 = module0435.f30620(var34, var30);
                var37 = (SubLObject)ConsesLow.listS(var38, var40);
            }
            module0347.f23330(var4, (SubLObject)NIL, var37);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30920(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30913(var14, (SubLObject)$ic1$, (SubLObject)T);
    }
    
    public static SubLObject f30921(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30913(var14, (SubLObject)$ic0$, (SubLObject)T);
    }
    
    public static SubLObject f30922(final SubLObject var2, final SubLObject var26, final SubLObject var7) {
        final SubLObject var27 = f30923(var2, var7, (SubLObject)UNPROVIDED);
        final SubLObject var28 = f30924(var26, (SubLObject)UNPROVIDED);
        return Numbers.max($g3577$.getGlobalValue(), Numbers.min(var27, var28));
    }
    
    public static SubLObject f30925(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13333(var14);
        final SubLObject var20 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        return f30922(var19, var20, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30926(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13333(var14);
        final SubLObject var20 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        return f30922(var19, var20, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30927(final SubLObject var2, final SubLObject var26, final SubLObject var14, final SubLObject var7) {
        final SubLObject var27 = f30923(var2, var7, (SubLObject)NIL);
        final SubLObject var28 = f30924(var26, (SubLObject)NIL);
        if (var27.numLE(var28)) {
            SubLObject var30;
            final SubLObject var29 = var30 = f30908(var2, var7);
            SubLObject var31 = (SubLObject)NIL;
            var31 = var30.first();
            while (NIL != var30) {
                final SubLObject var32 = $ic3$;
                if (NIL != module0158.f10010(var31, (SubLObject)ONE_INTEGER, var32)) {
                    final SubLObject var33 = module0158.f10011(var31, (SubLObject)ONE_INTEGER, var32);
                    SubLObject var34 = (SubLObject)NIL;
                    final SubLObject var35 = (SubLObject)NIL;
                    while (NIL == var34) {
                        final SubLObject var36 = module0052.f3695(var33, var35);
                        final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                        if (NIL != var37) {
                            SubLObject var38 = (SubLObject)NIL;
                            try {
                                var38 = module0158.f10316(var36, (SubLObject)$ic23$, (SubLObject)$ic28$, (SubLObject)NIL);
                                SubLObject var57_103 = (SubLObject)NIL;
                                final SubLObject var58_104 = (SubLObject)NIL;
                                while (NIL == var57_103) {
                                    final SubLObject var39 = module0052.f3695(var38, var58_104);
                                    final SubLObject var60_105 = (SubLObject)makeBoolean(!var58_104.eql(var39));
                                    if (NIL != var60_105) {
                                        f30928(var14, var39, var26, var7);
                                    }
                                    var57_103 = (SubLObject)makeBoolean(NIL == var60_105);
                                }
                            }
                            finally {
                                final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var38) {
                                        module0158.f10319(var38);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                                }
                            }
                        }
                        var34 = (SubLObject)makeBoolean(NIL == var37);
                    }
                }
                var30 = var30.rest();
                var31 = var30.first();
            }
        }
        else {
            final SubLObject var41 = $ic3$;
            if (NIL != module0158.f10010(var26, (SubLObject)TWO_INTEGER, var41)) {
                final SubLObject var42 = module0158.f10011(var26, (SubLObject)TWO_INTEGER, var41);
                SubLObject var43 = (SubLObject)NIL;
                final SubLObject var44 = (SubLObject)NIL;
                while (NIL == var43) {
                    final SubLObject var45 = module0052.f3695(var42, var44);
                    final SubLObject var46 = (SubLObject)makeBoolean(!var44.eql(var45));
                    if (NIL != var46) {
                        SubLObject var47 = (SubLObject)NIL;
                        try {
                            var47 = module0158.f10316(var45, (SubLObject)$ic23$, (SubLObject)$ic28$, (SubLObject)NIL);
                            SubLObject var57_104 = (SubLObject)NIL;
                            final SubLObject var58_105 = (SubLObject)NIL;
                            while (NIL == var57_104) {
                                final SubLObject var48 = module0052.f3695(var47, var58_105);
                                final SubLObject var60_106 = (SubLObject)makeBoolean(!var58_105.eql(var48));
                                if (NIL != var60_106) {
                                    f30929(var14, var48, var7);
                                }
                                var57_104 = (SubLObject)makeBoolean(NIL == var60_106);
                            }
                        }
                        finally {
                            final SubLObject var49 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var47) {
                                    module0158.f10319(var47);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var49);
                            }
                        }
                    }
                    var43 = (SubLObject)makeBoolean(NIL == var46);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30930(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13333(var14);
        final SubLObject var20 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        return f30927(var19, var20, var14, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30931(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13333(var14);
        final SubLObject var20 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        return f30927(var19, var20, var14, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30932() {
        return f30907($ic3$);
    }
    
    public static SubLObject f30923(final SubLObject var2, final SubLObject var7, SubLObject var109) {
        if (var109 == UNPROVIDED) {
            var109 = (SubLObject)T;
        }
        final SubLObject var110 = f30908(var2, var7);
        SubLObject var111 = (SubLObject)ZERO_INTEGER;
        final SubLObject var112 = (SubLObject)((NIL != var109) ? f30932() : ZERO_INTEGER);
        SubLObject var113 = var110;
        SubLObject var114 = (SubLObject)NIL;
        var114 = var113.first();
        while (NIL != var113) {
            if (NIL != f30912(var114, (SubLObject)UNPROVIDED)) {
                var111 = Numbers.add(var111, module0217.f14223(var114, (SubLObject)ONE_INTEGER, $ic3$));
            }
            var113 = var113.rest();
            var114 = var113.first();
        }
        return Numbers.add(var111, var112);
    }
    
    public static SubLObject f30924(final SubLObject var16, SubLObject var109) {
        if (var109 == UNPROVIDED) {
            var109 = (SubLObject)T;
        }
        if (NIL != module0212.f13762(var16)) {
            return (NIL != var109) ? Numbers.add(module0217.f14223(var16, (SubLObject)TWO_INTEGER, $ic3$), f30932()) : module0217.f14223(var16, (SubLObject)TWO_INTEGER, $ic3$);
        }
        return Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    
    public static SubLObject f30928(final SubLObject var14, final SubLObject var4, final SubLObject var26, final SubLObject var7) {
        if (NIL != module0193.f12105(var26)) {
            final SubLObject var27 = f30906(var4);
            if (!var26.equal(module0205.f13388(var27, (SubLObject)UNPROVIDED))) {
                return (SubLObject)NIL;
            }
        }
        return f30933(var14, var4, var7);
    }
    
    public static SubLObject f30929(final SubLObject var14, final SubLObject var64, final SubLObject var7) {
        final SubLObject var65 = module0205.f13333(var14);
        final SubLObject var66 = module0178.f11334(var64);
        if (var7.eql((SubLObject)$ic0$)) {
            if (!var66.eql(var65) && NIL == module0260.f17091(var66, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
        }
        else if (var7.eql((SubLObject)$ic1$) && !var66.eql(var65) && NIL == module0260.f17094(var66, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30933(var14, var64, var7);
    }
    
    public static SubLObject f30933(final SubLObject var14, final SubLObject var4, final SubLObject var7) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL == f30905(var4)) {
            return (SubLObject)NIL;
        }
        final SubLObject var16 = module0205.f13333(var14);
        final SubLObject var17 = f30906(var4);
        final SubLObject var18 = module0205.f13387(var17, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0205.f13388(var17, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0205.f13389(var17, (SubLObject)UNPROVIDED);
        final SubLObject var21 = f30915(var18, var19, var20);
        SubLObject var22 = (SubLObject)NIL;
        if (var7.eql((SubLObject)$ic0$)) {
            var22 = (SubLObject)ConsesLow.list(var16, var19, var21);
        }
        else if (var7.eql((SubLObject)$ic1$)) {
            var22 = (SubLObject)ConsesLow.list(var16, var21, var19);
        }
        if (NIL != module0228.f15212(var21)) {
            var15.resetMultipleValues();
            final SubLObject var23 = module0235.f15474(var14, var22, (SubLObject)T, (SubLObject)T);
            final SubLObject var24 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            if (NIL != var23) {
                final SubLObject var25 = f30914();
                SubLObject var26 = (SubLObject)NIL;
                SubLObject var27 = (SubLObject)NIL;
                if (var7.eql((SubLObject)$ic0$)) {
                    var26 = module0435.f30622(var18, var16);
                }
                else if (var7.eql((SubLObject)$ic1$)) {
                    var26 = module0435.f30620(var18, var16);
                }
                var27 = ConsesLow.append((SubLObject)ConsesLow.list(var25), var26, var24);
                module0347.f23330(var4, var23, var27);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30934(final SubLObject var14, final SubLObject var7) {
        return f30913(var14, var7, (SubLObject)T);
    }
    
    public static SubLObject f30935(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30934(var14, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30936(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30934(var14, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30937(final SubLObject var14, final SubLObject var7) {
        return f30923(module0205.f13333(var14), var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30938(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30937(var14, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30939(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30937(var14, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30940(final SubLObject var14, final SubLObject var7) {
        final SubLObject var15 = module0205.f13333(var14);
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = f30908(var15, var7);
        if (var7.eql((SubLObject)$ic0$)) {
            var16 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        }
        else if (var7.eql((SubLObject)$ic1$)) {
            var16 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        }
        SubLObject var18 = var17;
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            final SubLObject var20 = $ic3$;
            if (NIL != module0158.f10010(var19, (SubLObject)ONE_INTEGER, var20)) {
                final SubLObject var21 = module0158.f10011(var19, (SubLObject)ONE_INTEGER, var20);
                SubLObject var22 = (SubLObject)NIL;
                final SubLObject var23 = (SubLObject)NIL;
                while (NIL == var22) {
                    final SubLObject var24 = module0052.f3695(var21, var23);
                    final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                    if (NIL != var25) {
                        SubLObject var26 = (SubLObject)NIL;
                        try {
                            var26 = module0158.f10316(var24, (SubLObject)$ic23$, (SubLObject)$ic28$, (SubLObject)NIL);
                            SubLObject var57_116 = (SubLObject)NIL;
                            final SubLObject var58_117 = (SubLObject)NIL;
                            while (NIL == var57_116) {
                                final SubLObject var27 = module0052.f3695(var26, var58_117);
                                final SubLObject var60_118 = (SubLObject)makeBoolean(!var58_117.eql(var27));
                                if (NIL != var60_118) {
                                    f30928(var14, var27, var16, var7);
                                }
                                var57_116 = (SubLObject)makeBoolean(NIL == var60_118);
                            }
                        }
                        finally {
                            final SubLObject var28 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var26) {
                                    module0158.f10319(var26);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var28);
                            }
                        }
                    }
                    var22 = (SubLObject)makeBoolean(NIL == var25);
                }
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30941(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30940(var14, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30942(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30940(var14, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30943(final SubLObject var2, final SubLObject var7, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var7.eql((SubLObject)$ic2$)) {
            return (SubLObject)makeBoolean(NIL != f30944(var2, var3) || NIL != f30945(var2, var3));
        }
        if (var7.eql((SubLObject)$ic0$)) {
            return f30944(var2, var3);
        }
        if (var7.eql((SubLObject)$ic1$)) {
            return f30945(var2, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30946(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f30904($ic37$, var2, var3);
    }
    
    public static SubLObject f30944(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = module0349.f23411(var2);
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (NIL != f30946(var6, var3)) {
                return (SubLObject)T;
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30945(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = module0349.f23416(var2);
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (NIL != f30946(var6, var3)) {
                return (SubLObject)T;
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30947(final SubLObject var14, final SubLObject var7, final SubLObject var15) {
        if (NIL != var15 && NIL == module0435.f30628()) {
            return (SubLObject)NIL;
        }
        final SubLObject var16 = module0205.f13333(var14);
        return (SubLObject)makeBoolean(NIL == module0333.f22416(var16) && (NIL == var15 || NIL != module0461.f31411($ic38$)) && NIL != f30943(var16, var7, (SubLObject)NIL));
    }
    
    public static SubLObject f30948() {
        return module0191.f11990((SubLObject)$ic8$, $g3578$.getGlobalValue(), $g3579$.getGlobalValue(), (SubLObject)$ic9$);
    }
    
    public static SubLObject f30949(final SubLObject var2, final SubLObject var17, final SubLObject var16) {
        return module0202.f12761((SubLObject)ConsesLow.list($ic38$, var2, var17, var16));
    }
    
    public static SubLObject f30950(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL != module0337.f22626((SubLObject)$ic43$, var14)) {
            final SubLObject var20 = (SubLObject)$ic44$;
            var19.resetMultipleValues();
            final SubLObject var21 = module0337.f22630(var14, var20);
            final SubLObject var22 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (NIL != var21) {
                final SubLObject var23 = module0035.f2294(var22, (SubLObject)$ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var24 = module0035.f2294(var22, (SubLObject)$ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var25 = module0035.f2294(var22, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var26 = module0035.f2294(var22, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var27 = module0035.f2294(var22, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var25.eql(var27) && NIL == module0260.f17089(var25, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)T;
                }
                if (NIL == module0234.f15434(var23, var26)) {
                    return (SubLObject)T;
                }
            }
        }
        else {
            if (NIL == module0337.f22626((SubLObject)$ic48$, var14)) {
                return (SubLObject)T;
            }
            final SubLObject var20 = (SubLObject)$ic49$;
            var19.resetMultipleValues();
            final SubLObject var21 = module0337.f22630(var14, var20);
            final SubLObject var22 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            if (NIL != var21) {
                final SubLObject var28 = module0035.f2294(var22, (SubLObject)$ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var29 = module0035.f2294(var22, (SubLObject)$ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var25 = module0035.f2294(var22, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var26 = module0035.f2294(var22, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var27 = module0035.f2294(var22, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var25.eql(var27) && NIL == module0260.f17094(var25, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)T;
                }
                if (NIL == module0234.f15434(var29, var26)) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30951(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL != f30947(var14, (SubLObject)$ic2$, (SubLObject)NIL)) {
            final SubLObject var20 = module0205.f13333(var14);
            final SubLObject var21 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
            final SubLObject var22 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
            if (NIL != module0202.f12590(var21) && NIL != module0205.f13221($ic38$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var19.resetMultipleValues();
                final SubLObject var23 = module0202.f12797(var21);
                final SubLObject var24 = var19.secondMultipleValue();
                final SubLObject var25 = var19.thirdMultipleValue();
                final SubLObject var26 = var19.fourthMultipleValue();
                var19.resetMultipleValues();
                return (SubLObject)makeBoolean((var24.eql(var20) || NIL != module0260.f17089(var24, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && var22.equal(var26));
            }
            if (NIL != module0202.f12590(var22) && NIL != module0205.f13221($ic38$, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var19.resetMultipleValues();
                final SubLObject var23 = module0202.f12797(var22);
                final SubLObject var24 = var19.secondMultipleValue();
                final SubLObject var25 = var19.thirdMultipleValue();
                final SubLObject var26 = var19.fourthMultipleValue();
                var19.resetMultipleValues();
                return (SubLObject)makeBoolean((var24.eql(var20) || NIL != module0260.f17094(var24, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && var21.equal(var26));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30952(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0205.f13333(var14);
        final SubLObject var21 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        if (NIL != module0202.f12590(var21) && NIL != module0205.f13221($ic38$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var19.resetMultipleValues();
            final SubLObject var122_123 = module0202.f12797(var21);
            final SubLObject var124_125 = var19.secondMultipleValue();
            final SubLObject var126_127 = var19.thirdMultipleValue();
            final SubLObject var128_129 = var19.fourthMultipleValue();
            var19.resetMultipleValues();
            var23 = var122_123;
            var24 = var124_125;
            var26 = var126_127;
            var25 = var128_129;
            var27 = (SubLObject)$ic0$;
        }
        else if (NIL != module0202.f12590(var22) && NIL != module0205.f13221($ic38$, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var19.resetMultipleValues();
            final SubLObject var130_131 = module0202.f12797(var22);
            final SubLObject var132_133 = var19.secondMultipleValue();
            final SubLObject var134_135 = var19.thirdMultipleValue();
            final SubLObject var136_137 = var19.fourthMultipleValue();
            var19.resetMultipleValues();
            var23 = var130_131;
            var24 = var132_133;
            var26 = var134_135;
            var25 = var136_137;
            var27 = (SubLObject)$ic1$;
        }
        final SubLObject var28 = module0202.f12761((SubLObject)ConsesLow.list($ic37$, var24, var26, var25));
        final SubLObject var29 = module0349.f23449(var28, (SubLObject)$ic21$);
        final SubLObject var31;
        final SubLObject var30 = var31 = module0158.f10294(var29);
        if (var31.eql((SubLObject)$ic22$)) {
            var19.resetMultipleValues();
            final SubLObject var50_139 = module0158.f10297(var29);
            final SubLObject var32 = var19.secondMultipleValue();
            final SubLObject var53_140 = var19.thirdMultipleValue();
            var19.resetMultipleValues();
            if (NIL != var32) {
                if (NIL != var53_140) {
                    final SubLObject var33 = var53_140;
                    if (NIL != module0158.f10010(var50_139, var32, var33)) {
                        final SubLObject var34 = module0158.f10011(var50_139, var32, var33);
                        SubLObject var35 = (SubLObject)NIL;
                        final SubLObject var36 = (SubLObject)NIL;
                        while (NIL == var35) {
                            final SubLObject var37 = module0052.f3695(var34, var36);
                            final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                            if (NIL != var38) {
                                SubLObject var39 = (SubLObject)NIL;
                                try {
                                    var39 = module0158.f10316(var37, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                    SubLObject var57_141 = (SubLObject)NIL;
                                    final SubLObject var58_142 = (SubLObject)NIL;
                                    while (NIL == var57_141) {
                                        final SubLObject var40 = module0052.f3695(var39, var58_142);
                                        final SubLObject var60_143 = (SubLObject)makeBoolean(!var58_142.eql(var40));
                                        if (NIL != var60_143) {
                                            f30953(var20, var25, var26, var40, var27);
                                        }
                                        var57_141 = (SubLObject)makeBoolean(NIL == var60_143);
                                    }
                                }
                                finally {
                                    final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                        if (NIL != var39) {
                                            module0158.f10319(var39);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var41, var19);
                                    }
                                }
                            }
                            var35 = (SubLObject)makeBoolean(NIL == var38);
                        }
                    }
                }
                else {
                    final SubLObject var33 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var50_139, var32, var33)) {
                        final SubLObject var34 = module0158.f10011(var50_139, var32, var33);
                        SubLObject var35 = (SubLObject)NIL;
                        final SubLObject var36 = (SubLObject)NIL;
                        while (NIL == var35) {
                            final SubLObject var37 = module0052.f3695(var34, var36);
                            final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                            if (NIL != var38) {
                                SubLObject var39 = (SubLObject)NIL;
                                try {
                                    var39 = module0158.f10316(var37, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                    SubLObject var57_142 = (SubLObject)NIL;
                                    final SubLObject var58_143 = (SubLObject)NIL;
                                    while (NIL == var57_142) {
                                        final SubLObject var40 = module0052.f3695(var39, var58_143);
                                        final SubLObject var60_144 = (SubLObject)makeBoolean(!var58_143.eql(var40));
                                        if (NIL != var60_144) {
                                            f30953(var20, var25, var26, var40, var27);
                                        }
                                        var57_142 = (SubLObject)makeBoolean(NIL == var60_144);
                                    }
                                }
                                finally {
                                    final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                        if (NIL != var39) {
                                            module0158.f10319(var39);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var42, var19);
                                    }
                                }
                            }
                            var35 = (SubLObject)makeBoolean(NIL == var38);
                        }
                    }
                }
            }
            else if (NIL != var53_140) {
                final SubLObject var33 = var53_140;
                if (NIL != module0158.f10010(var50_139, (SubLObject)NIL, var33)) {
                    final SubLObject var34 = module0158.f10011(var50_139, (SubLObject)NIL, var33);
                    SubLObject var35 = (SubLObject)NIL;
                    final SubLObject var36 = (SubLObject)NIL;
                    while (NIL == var35) {
                        final SubLObject var37 = module0052.f3695(var34, var36);
                        final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                        if (NIL != var38) {
                            SubLObject var39 = (SubLObject)NIL;
                            try {
                                var39 = module0158.f10316(var37, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                SubLObject var57_143 = (SubLObject)NIL;
                                final SubLObject var58_144 = (SubLObject)NIL;
                                while (NIL == var57_143) {
                                    final SubLObject var40 = module0052.f3695(var39, var58_144);
                                    final SubLObject var60_145 = (SubLObject)makeBoolean(!var58_144.eql(var40));
                                    if (NIL != var60_145) {
                                        f30953(var20, var25, var26, var40, var27);
                                    }
                                    var57_143 = (SubLObject)makeBoolean(NIL == var60_145);
                                }
                            }
                            finally {
                                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var39) {
                                        module0158.f10319(var39);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var19);
                                }
                            }
                        }
                        var35 = (SubLObject)makeBoolean(NIL == var38);
                    }
                }
            }
            else {
                final SubLObject var33 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var50_139, (SubLObject)NIL, var33)) {
                    final SubLObject var34 = module0158.f10011(var50_139, (SubLObject)NIL, var33);
                    SubLObject var35 = (SubLObject)NIL;
                    final SubLObject var36 = (SubLObject)NIL;
                    while (NIL == var35) {
                        final SubLObject var37 = module0052.f3695(var34, var36);
                        final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                        if (NIL != var38) {
                            SubLObject var39 = (SubLObject)NIL;
                            try {
                                var39 = module0158.f10316(var37, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                SubLObject var57_144 = (SubLObject)NIL;
                                final SubLObject var58_145 = (SubLObject)NIL;
                                while (NIL == var57_144) {
                                    final SubLObject var40 = module0052.f3695(var39, var58_145);
                                    final SubLObject var60_146 = (SubLObject)makeBoolean(!var58_145.eql(var40));
                                    if (NIL != var60_146) {
                                        f30953(var20, var25, var26, var40, var27);
                                    }
                                    var57_144 = (SubLObject)makeBoolean(NIL == var60_146);
                                }
                            }
                            finally {
                                final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var39) {
                                        module0158.f10319(var39);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var44, var19);
                                }
                            }
                        }
                        var35 = (SubLObject)makeBoolean(NIL == var38);
                    }
                }
            }
        }
        else if (var31.eql((SubLObject)$ic24$)) {
            final SubLObject var45 = module0158.f10299(var29);
            if (NIL != module0158.f10038(var45)) {
                final SubLObject var46 = (SubLObject)NIL;
                final SubLObject var47 = module0012.$g73$.currentBinding(var19);
                final SubLObject var48 = module0012.$g65$.currentBinding(var19);
                final SubLObject var49 = module0012.$g67$.currentBinding(var19);
                final SubLObject var50 = module0012.$g68$.currentBinding(var19);
                final SubLObject var51 = module0012.$g66$.currentBinding(var19);
                final SubLObject var52 = module0012.$g69$.currentBinding(var19);
                final SubLObject var53 = module0012.$g70$.currentBinding(var19);
                final SubLObject var54 = module0012.$silent_progressP$.currentBinding(var19);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var19);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var19), var19);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var19);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g70$.bind((SubLObject)T, var19);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var46) ? module0012.$silent_progressP$.getDynamicValue(var19) : T), var19);
                    module0012.f474(var46);
                    final SubLObject var55 = module0158.f10039(var45);
                    SubLObject var56 = (SubLObject)NIL;
                    final SubLObject var57 = (SubLObject)NIL;
                    while (NIL == var56) {
                        final SubLObject var58 = module0052.f3695(var55, var57);
                        final SubLObject var59 = (SubLObject)makeBoolean(!var57.eql(var58));
                        if (NIL != var59) {
                            module0012.f476();
                            SubLObject var60 = (SubLObject)NIL;
                            try {
                                var60 = module0158.f10316(var58, (SubLObject)$ic23$, module0130.f8518((SubLObject)$ic21$), (SubLObject)NIL);
                                SubLObject var57_145 = (SubLObject)NIL;
                                final SubLObject var58_146 = (SubLObject)NIL;
                                while (NIL == var57_145) {
                                    final SubLObject var61 = module0052.f3695(var60, var58_146);
                                    final SubLObject var60_147 = (SubLObject)makeBoolean(!var58_146.eql(var61));
                                    if (NIL != var60_147) {
                                        f30953(var20, var25, var26, var61, var27);
                                    }
                                    var57_145 = (SubLObject)makeBoolean(NIL == var60_147);
                                }
                            }
                            finally {
                                final SubLObject var66_156 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var60) {
                                        module0158.f10319(var60);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var66_156, var19);
                                }
                            }
                        }
                        var56 = (SubLObject)makeBoolean(NIL == var59);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var54, var19);
                    module0012.$g70$.rebind(var53, var19);
                    module0012.$g69$.rebind(var52, var19);
                    module0012.$g66$.rebind(var51, var19);
                    module0012.$g68$.rebind(var50, var19);
                    module0012.$g67$.rebind(var49, var19);
                    module0012.$g65$.rebind(var48, var19);
                    module0012.$g73$.rebind(var47, var19);
                }
            }
        }
        else if (var31.eql((SubLObject)$ic25$)) {
            SubLObject var62 = module0218.f14453(module0158.f10301(var29), (SubLObject)UNPROVIDED);
            SubLObject var63 = (SubLObject)NIL;
            var63 = var62.first();
            while (NIL != var62) {
                if (NIL == module0130.f8518((SubLObject)$ic21$) || NIL != module0178.f11343(var63, module0130.f8518((SubLObject)$ic21$))) {
                    f30953(var20, var25, var26, var63, var27);
                }
                var62 = var62.rest();
                var63 = var62.first();
            }
        }
        else {
            module0158.f10295(var29, var30);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30953(final SubLObject var30, final SubLObject var26, final SubLObject var17, final SubLObject var4, final SubLObject var7) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL == f30905(var4)) {
            return (SubLObject)NIL;
        }
        final SubLObject var32 = f30906(var4);
        if (NIL != module0202.f12734(var32, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED)) {
            var31.resetMultipleValues();
            final SubLObject var33 = module0202.f12797(var32);
            final SubLObject var34 = var31.secondMultipleValue();
            final SubLObject var35 = var31.thirdMultipleValue();
            final SubLObject var36 = var31.fourthMultipleValue();
            var31.resetMultipleValues();
            if (!var17.equal(var35) || !var26.equal(var36)) {
                return (SubLObject)NIL;
            }
            SubLObject var37 = (SubLObject)NIL;
            if (var7.eql((SubLObject)$ic0$)) {
                if (var34.eql(var30) || NIL != module0260.f17089(var34, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    final SubLObject var38 = f30948();
                    final SubLObject var39 = module0435.f30622(var34, var30);
                    var37 = (SubLObject)ConsesLow.listS(var38, var39);
                }
            }
            else if (var7.eql((SubLObject)$ic1$) && (var34.eql(var30) || NIL != module0260.f17094(var34, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                final SubLObject var38 = f30948();
                final SubLObject var40 = module0435.f30620(var34, var30);
                var37 = (SubLObject)ConsesLow.listS(var38, var40);
            }
            module0347.f23330(var4, (SubLObject)NIL, var37);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30954(final SubLObject var14, final SubLObject var7) {
        return f30947(var14, var7, (SubLObject)T);
    }
    
    public static SubLObject f30955(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30954(var14, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30956(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30954(var14, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30957(final SubLObject var2, final SubLObject var26, final SubLObject var7) {
        final SubLObject var27 = f30958(var2, var7, (SubLObject)UNPROVIDED);
        final SubLObject var28 = f30959(var26, (SubLObject)UNPROVIDED);
        return Numbers.max($g3581$.getGlobalValue(), Numbers.min(var27, var28));
    }
    
    public static SubLObject f30960(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13333(var14);
        final SubLObject var20 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        return f30957(var19, var20, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30961(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13333(var14);
        final SubLObject var20 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        return f30957(var19, var20, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30962(final SubLObject var2, final SubLObject var26, final SubLObject var14, final SubLObject var7) {
        final SubLObject var27 = f30958(var2, var7, (SubLObject)NIL);
        final SubLObject var28 = f30959(var26, (SubLObject)NIL);
        if (var27.numLE(var28)) {
            SubLObject var30;
            final SubLObject var29 = var30 = f30908(var2, var7);
            SubLObject var31 = (SubLObject)NIL;
            var31 = var30.first();
            while (NIL != var30) {
                final SubLObject var32 = $ic37$;
                if (NIL != module0158.f10010(var31, (SubLObject)ONE_INTEGER, var32)) {
                    final SubLObject var33 = module0158.f10011(var31, (SubLObject)ONE_INTEGER, var32);
                    SubLObject var34 = (SubLObject)NIL;
                    final SubLObject var35 = (SubLObject)NIL;
                    while (NIL == var34) {
                        final SubLObject var36 = module0052.f3695(var33, var35);
                        final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                        if (NIL != var37) {
                            SubLObject var38 = (SubLObject)NIL;
                            try {
                                var38 = module0158.f10316(var36, (SubLObject)$ic23$, (SubLObject)$ic28$, (SubLObject)NIL);
                                SubLObject var57_158 = (SubLObject)NIL;
                                final SubLObject var58_159 = (SubLObject)NIL;
                                while (NIL == var57_158) {
                                    final SubLObject var39 = module0052.f3695(var38, var58_159);
                                    final SubLObject var60_160 = (SubLObject)makeBoolean(!var58_159.eql(var39));
                                    if (NIL != var60_160) {
                                        f30963(var14, var39, var26, var7);
                                    }
                                    var57_158 = (SubLObject)makeBoolean(NIL == var60_160);
                                }
                            }
                            finally {
                                final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var38) {
                                        module0158.f10319(var38);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                                }
                            }
                        }
                        var34 = (SubLObject)makeBoolean(NIL == var37);
                    }
                }
                var30 = var30.rest();
                var31 = var30.first();
            }
        }
        else {
            final SubLObject var41 = $ic37$;
            if (NIL != module0158.f10010(var26, (SubLObject)THREE_INTEGER, var41)) {
                final SubLObject var42 = module0158.f10011(var26, (SubLObject)THREE_INTEGER, var41);
                SubLObject var43 = (SubLObject)NIL;
                final SubLObject var44 = (SubLObject)NIL;
                while (NIL == var43) {
                    final SubLObject var45 = module0052.f3695(var42, var44);
                    final SubLObject var46 = (SubLObject)makeBoolean(!var44.eql(var45));
                    if (NIL != var46) {
                        SubLObject var47 = (SubLObject)NIL;
                        try {
                            var47 = module0158.f10316(var45, (SubLObject)$ic23$, (SubLObject)$ic28$, (SubLObject)NIL);
                            SubLObject var57_159 = (SubLObject)NIL;
                            final SubLObject var58_160 = (SubLObject)NIL;
                            while (NIL == var57_159) {
                                final SubLObject var48 = module0052.f3695(var47, var58_160);
                                final SubLObject var60_161 = (SubLObject)makeBoolean(!var58_160.eql(var48));
                                if (NIL != var60_161) {
                                    f30964(var14, var48, var7);
                                }
                                var57_159 = (SubLObject)makeBoolean(NIL == var60_161);
                            }
                        }
                        finally {
                            final SubLObject var49 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var47) {
                                    module0158.f10319(var47);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var49);
                            }
                        }
                    }
                    var43 = (SubLObject)makeBoolean(NIL == var46);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30965(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13333(var14);
        final SubLObject var20 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        return f30962(var19, var20, var14, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30966(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13333(var14);
        final SubLObject var20 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        return f30962(var19, var20, var14, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30967() {
        return f30907($ic37$);
    }
    
    public static SubLObject f30958(final SubLObject var2, final SubLObject var7, SubLObject var109) {
        if (var109 == UNPROVIDED) {
            var109 = (SubLObject)T;
        }
        final SubLObject var110 = f30908(var2, var7);
        SubLObject var111 = (SubLObject)ZERO_INTEGER;
        final SubLObject var112 = (SubLObject)((NIL != var109) ? f30967() : ZERO_INTEGER);
        SubLObject var113 = var110;
        SubLObject var114 = (SubLObject)NIL;
        var114 = var113.first();
        while (NIL != var113) {
            if (NIL != f30946(var114, (SubLObject)UNPROVIDED)) {
                var111 = Numbers.add(var111, module0217.f14223(var2, (SubLObject)ONE_INTEGER, $ic37$));
            }
            var113 = var113.rest();
            var114 = var113.first();
        }
        return Numbers.add(var111, var112);
    }
    
    public static SubLObject f30959(final SubLObject var16, SubLObject var109) {
        if (var109 == UNPROVIDED) {
            var109 = (SubLObject)T;
        }
        if (NIL != module0212.f13762(var16)) {
            return (NIL != var109) ? Numbers.add(module0217.f14223(var16, (SubLObject)THREE_INTEGER, $ic37$), f30967()) : module0217.f14223(var16, (SubLObject)THREE_INTEGER, $ic37$);
        }
        return Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    
    public static SubLObject f30963(final SubLObject var14, final SubLObject var4, final SubLObject var26, final SubLObject var7) {
        if (NIL != module0193.f12105(var26)) {
            final SubLObject var27 = f30906(var4);
            if (!var26.equal(module0205.f13389(var27, (SubLObject)UNPROVIDED))) {
                return (SubLObject)NIL;
            }
        }
        return f30968(var14, var4, var7);
    }
    
    public static SubLObject f30964(final SubLObject var14, final SubLObject var64, final SubLObject var7) {
        final SubLObject var65 = module0205.f13333(var14);
        final SubLObject var66 = module0178.f11334(var64);
        if (var7.eql((SubLObject)$ic0$)) {
            if (!var66.eql(var65) && NIL == module0260.f17091(var66, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
        }
        else if (var7.eql((SubLObject)$ic1$) && !var66.eql(var65) && NIL == module0260.f17094(var66, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30968(var14, var64, var7);
    }
    
    public static SubLObject f30968(final SubLObject var14, final SubLObject var4, final SubLObject var7) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL == f30905(var4)) {
            return (SubLObject)NIL;
        }
        final SubLObject var16 = module0205.f13333(var14);
        final SubLObject var17 = f30906(var4);
        final SubLObject var18 = module0205.f13387(var17, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0205.f13389(var17, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0205.f13388(var17, (SubLObject)UNPROVIDED);
        final SubLObject var21 = f30949(var18, var20, var19);
        SubLObject var22 = (SubLObject)NIL;
        if (var7.eql((SubLObject)$ic0$)) {
            var22 = (SubLObject)ConsesLow.list(var16, var21, var19);
        }
        else if (var7.eql((SubLObject)$ic1$)) {
            var22 = (SubLObject)ConsesLow.list(var16, var19, var21);
        }
        if (NIL != module0228.f15212(var21)) {
            var15.resetMultipleValues();
            final SubLObject var23 = module0235.f15474(var14, var22, (SubLObject)T, (SubLObject)T);
            final SubLObject var24 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            if (NIL != var23) {
                final SubLObject var25 = f30948();
                SubLObject var26 = (SubLObject)NIL;
                SubLObject var27 = (SubLObject)NIL;
                if (var7.eql((SubLObject)$ic0$)) {
                    var26 = module0435.f30622(var18, var16);
                }
                else if (var7.eql((SubLObject)$ic1$)) {
                    var26 = module0435.f30620(var18, var16);
                }
                var27 = ConsesLow.append((SubLObject)ConsesLow.list(var25), var26, var24);
                module0347.f23330(var4, var23, var27);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30969(final SubLObject var14, final SubLObject var7) {
        return f30947(var14, var7, (SubLObject)T);
    }
    
    public static SubLObject f30970(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30969(var14, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30971(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30969(var14, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30972(final SubLObject var14, final SubLObject var7) {
        return f30958(module0205.f13333(var14), var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30973(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30972(var14, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30974(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30972(var14, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30975(final SubLObject var14, final SubLObject var7) {
        final SubLObject var15 = module0205.f13333(var14);
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = f30908(var15, var7);
        if (var7.eql((SubLObject)$ic0$)) {
            var16 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        }
        else if (var7.eql((SubLObject)$ic1$)) {
            var16 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        }
        SubLObject var18 = var17;
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            final SubLObject var20 = $ic37$;
            if (NIL != module0158.f10010(var19, (SubLObject)ONE_INTEGER, var20)) {
                final SubLObject var21 = module0158.f10011(var19, (SubLObject)ONE_INTEGER, var20);
                SubLObject var22 = (SubLObject)NIL;
                final SubLObject var23 = (SubLObject)NIL;
                while (NIL == var22) {
                    final SubLObject var24 = module0052.f3695(var21, var23);
                    final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                    if (NIL != var25) {
                        SubLObject var26 = (SubLObject)NIL;
                        try {
                            var26 = module0158.f10316(var24, (SubLObject)$ic23$, (SubLObject)$ic28$, (SubLObject)NIL);
                            SubLObject var57_164 = (SubLObject)NIL;
                            final SubLObject var58_165 = (SubLObject)NIL;
                            while (NIL == var57_164) {
                                final SubLObject var27 = module0052.f3695(var26, var58_165);
                                final SubLObject var60_166 = (SubLObject)makeBoolean(!var58_165.eql(var27));
                                if (NIL != var60_166) {
                                    f30963(var14, var27, var16, var7);
                                }
                                var57_164 = (SubLObject)makeBoolean(NIL == var60_166);
                            }
                        }
                        finally {
                            final SubLObject var28 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var26) {
                                    module0158.f10319(var26);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var28);
                            }
                        }
                    }
                    var22 = (SubLObject)makeBoolean(NIL == var25);
                }
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30976(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30975(var14, (SubLObject)$ic1$);
    }
    
    public static SubLObject f30977(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f30975(var14, (SubLObject)$ic0$);
    }
    
    public static SubLObject f30978(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        final SubLObject var21 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0205.f13389(var14, (SubLObject)UNPROVIDED);
        final SubLObject var23 = (SubLObject)ConsesLow.list($ic62$, (SubLObject)$ic63$, (SubLObject)ConsesLow.list($ic64$, (SubLObject)ConsesLow.listS(var20, var21, (SubLObject)$ic65$), (SubLObject)ConsesLow.list($ic66$, (SubLObject)$ic63$, var22)));
        SubLObject var24 = module0411.f28638(var23, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (!var24.isZero()) {
            var24 = Numbers.add(var24, module0483.$g3582$.getDynamicValue(var19));
        }
        return var24;
    }
    
    public static SubLObject f30979(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        final SubLObject var21 = module0205.f13389(var14, (SubLObject)UNPROVIDED);
        final SubLObject var22 = (SubLObject)ConsesLow.list($ic62$, (SubLObject)$ic63$, (SubLObject)ConsesLow.list($ic64$, (SubLObject)ConsesLow.listS(var19, var20, (SubLObject)$ic65$), (SubLObject)ConsesLow.list($ic66$, (SubLObject)$ic63$, var21)));
        if (NIL != f30980(var22, (SubLObject)UNPROVIDED)) {
            final SubLObject var23 = f30981(var22);
            module0347.f23330(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30980(final SubLObject var168, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23495(var168, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30981(final SubLObject var168) {
        return module0191.f11990((SubLObject)$ic67$, var168, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30982(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        final SubLObject var21 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0205.f13389(var14, (SubLObject)UNPROVIDED);
        final SubLObject var23 = (SubLObject)ConsesLow.list($ic62$, (SubLObject)$ic63$, (SubLObject)ConsesLow.list($ic64$, (SubLObject)ConsesLow.list(var20, (SubLObject)$ic63$, var22), (SubLObject)ConsesLow.list($ic66$, (SubLObject)$ic63$, var21)));
        SubLObject var24 = module0411.f28638(var23, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (!var24.isZero()) {
            var24 = Numbers.add(var24, module0483.$g3582$.getDynamicValue(var19));
        }
        return var24;
    }
    
    public static SubLObject f30983(final SubLObject var14, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0205.f13387(var14, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0205.f13388(var14, (SubLObject)UNPROVIDED);
        final SubLObject var21 = module0205.f13389(var14, (SubLObject)UNPROVIDED);
        final SubLObject var22 = (SubLObject)ConsesLow.list($ic62$, (SubLObject)$ic63$, (SubLObject)ConsesLow.list($ic64$, (SubLObject)ConsesLow.list(var19, (SubLObject)$ic63$, var21), (SubLObject)ConsesLow.list($ic66$, (SubLObject)$ic63$, var20)));
        if (NIL != f30984(var22, (SubLObject)UNPROVIDED)) {
            final SubLObject var23 = f30985(var22);
            module0347.f23330(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30984(final SubLObject var168, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        return module0349.f23495(var168, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30985(final SubLObject var168) {
        return module0191.f11990((SubLObject)$ic67$, var168, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30986(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        SubLObject var173 = (SubLObject)NIL;
        if (NIL != module0435.f30628()) {
            SubLObject var174 = (SubLObject)ZERO_INTEGER;
            SubLObject var175 = module0232.f15308(var171);
            SubLObject var176 = (SubLObject)NIL;
            var176 = var175.first();
            while (NIL != var175) {
                SubLObject var178;
                final SubLObject var177 = var178 = var176;
                SubLObject var179 = (SubLObject)NIL;
                SubLObject var180 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var178, var177, (SubLObject)$ic72$);
                var179 = var178.first();
                var178 = var178.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var178, var177, (SubLObject)$ic72$);
                var180 = var178.first();
                var178 = var178.rest();
                if (NIL == var178) {
                    final SubLObject var181 = var179;
                    final SubLObject var182 = module0147.$g2095$.currentBinding(var172);
                    final SubLObject var183 = module0147.$g2094$.currentBinding(var172);
                    final SubLObject var184 = module0147.$g2096$.currentBinding(var172);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var181), var172);
                        module0147.$g2094$.bind(module0147.f9546(var181), var172);
                        module0147.$g2096$.bind(module0147.f9549(var181), var172);
                        if ($ic66$.eql(module0205.f13333(var180))) {
                            final SubLObject var185 = module0205.f13387(var180, (SubLObject)UNPROVIDED);
                            final SubLObject var186 = module0205.f13388(var180, (SubLObject)UNPROVIDED);
                            if (NIL != module0193.f12105(var186) && NIL != module0193.f12106(var185)) {
                                SubLObject var187 = (SubLObject)ZERO_INTEGER;
                                SubLObject var10_183 = module0232.f15308(var171);
                                SubLObject var188 = (SubLObject)NIL;
                                var188 = var10_183.first();
                                while (NIL != var10_183) {
                                    if (!var174.eql(var187)) {
                                        SubLObject var187_188;
                                        final SubLObject var185_186 = var187_188 = var188;
                                        SubLObject var189 = (SubLObject)NIL;
                                        SubLObject var190 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var187_188, var185_186, (SubLObject)$ic73$);
                                        var189 = var187_188.first();
                                        var187_188 = var187_188.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var187_188, var185_186, (SubLObject)$ic73$);
                                        var190 = var187_188.first();
                                        var187_188 = var187_188.rest();
                                        if (NIL == var187_188) {
                                            if (NIL != module0147.f9507(var189)) {
                                                final SubLObject var179_191 = var189;
                                                final SubLObject var66_192 = module0147.$g2095$.currentBinding(var172);
                                                final SubLObject var78_193 = module0147.$g2094$.currentBinding(var172);
                                                final SubLObject var79_194 = module0147.$g2096$.currentBinding(var172);
                                                try {
                                                    module0147.$g2095$.bind(module0147.f9545(var179_191), var172);
                                                    module0147.$g2094$.bind(module0147.f9546(var179_191), var172);
                                                    module0147.$g2096$.bind(module0147.f9549(var179_191), var172);
                                                    final SubLObject var191 = module0205.f13333(var190);
                                                    if (NIL != module0333.f22417(var191) && NIL != module0226.f14807(var191)) {
                                                        final SubLObject var192 = module0205.f13387(var190, (SubLObject)UNPROVIDED);
                                                        final SubLObject var193 = module0205.f13388(var190, (SubLObject)UNPROVIDED);
                                                        if (NIL != module0193.f12106(var193) && var193.equal(var185) && NIL != f30987(var191, var192, var186, var189)) {
                                                            if (var174.numL(var187)) {
                                                                var173 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list(var174, var187)), var173);
                                                            }
                                                            else {
                                                                var173 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list(var187, var174)), var173);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0147.$g2096$.rebind(var79_194, var172);
                                                    module0147.$g2094$.rebind(var78_193, var172);
                                                    module0147.$g2095$.rebind(var66_192, var172);
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var185_186, (SubLObject)$ic73$);
                                        }
                                    }
                                    var187 = Numbers.add(var187, (SubLObject)ONE_INTEGER);
                                    var10_183 = var10_183.rest();
                                    var188 = var10_183.first();
                                }
                            }
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var184, var172);
                        module0147.$g2094$.rebind(var183, var172);
                        module0147.$g2095$.rebind(var182, var172);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var177, (SubLObject)$ic72$);
                }
                var174 = Numbers.add(var174, (SubLObject)ONE_INTEGER);
                var175 = var175.rest();
                var176 = var175.first();
            }
        }
        return module0035.f2269(var173, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30988(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        SubLObject var173 = (SubLObject)NIL;
        var172.resetMultipleValues();
        final SubLObject var174 = f30989(var171);
        final SubLObject var175 = var172.secondMultipleValue();
        final SubLObject var176 = var172.thirdMultipleValue();
        final SubLObject var177 = var172.fourthMultipleValue();
        final SubLObject var178 = var172.fifthMultipleValue();
        var172.resetMultipleValues();
        final SubLObject var179 = module0205.f13333(var177);
        final SubLObject var180 = module0205.f13387(var177, (SubLObject)UNPROVIDED);
        final SubLObject var181 = module0205.f13388(var175, (SubLObject)UNPROVIDED);
        final SubLObject var182 = module0202.f12769($ic3$, var179, var180, var181);
        final SubLObject var183 = var176;
        final SubLObject var184 = module0147.$g2095$.currentBinding(var172);
        final SubLObject var185 = module0147.$g2094$.currentBinding(var172);
        final SubLObject var186 = module0147.$g2096$.currentBinding(var172);
        try {
            module0147.$g2095$.bind(module0147.f9545(var183), var172);
            module0147.$g2094$.bind(module0147.f9546(var183), var172);
            module0147.$g2096$.bind(module0147.f9549(var183), var172);
            var173 = module0499.f32219(var182, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var186, var172);
            module0147.$g2094$.rebind(var185, var172);
            module0147.$g2095$.rebind(var184, var172);
        }
        return var173;
    }
    
    public static SubLObject f30990(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        var172.resetMultipleValues();
        final SubLObject var173 = f30989(var171);
        final SubLObject var174 = var172.secondMultipleValue();
        final SubLObject var175 = var172.thirdMultipleValue();
        final SubLObject var176 = var172.fourthMultipleValue();
        final SubLObject var177 = var172.fifthMultipleValue();
        var172.resetMultipleValues();
        final SubLObject var178 = module0205.f13333(var176);
        final SubLObject var179 = module0205.f13387(var176, (SubLObject)UNPROVIDED);
        final SubLObject var180 = module0205.f13388(var174, (SubLObject)UNPROVIDED);
        final SubLObject var181 = module0202.f12769($ic3$, var178, var179, var180);
        final SubLObject var182 = f30915(var178, var179, var180);
        final SubLObject var183 = module0202.f12768($ic66$, var182, var180);
        final SubLObject var184 = module0202.f12768(var178, var179, var182);
        SubLObject var185 = f30991(var178, var179, var180, var175);
        SubLObject var186 = (SubLObject)NIL;
        var186 = var185.first();
        while (NIL != var185) {
            SubLObject var188;
            final SubLObject var187 = var188 = var186;
            SubLObject var189 = (SubLObject)NIL;
            SubLObject var190 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var188, var187, (SubLObject)$ic74$);
            var189 = var188.first();
            var188 = var188.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var188, var187, (SubLObject)$ic74$);
            var190 = var188.first();
            var188 = var188.rest();
            if (NIL == var188) {
                final SubLObject var191 = (SubLObject)((NIL != var189) ? var189 : $ic75$);
                final SubLObject var192 = module0233.f15361(var191, var181);
                final SubLObject var193 = module0191.f11990((SubLObject)$ic76$, var192, var175, (SubLObject)UNPROVIDED);
                final SubLObject var194 = module0233.f15361(var191, var183);
                var172.resetMultipleValues();
                final SubLObject var195 = module0235.f15476(var174, var194, (SubLObject)T, (SubLObject)T);
                final SubLObject var196 = var172.secondMultipleValue();
                final SubLObject var197 = var172.thirdMultipleValue();
                var172.resetMultipleValues();
                if (NIL != var195) {
                    final SubLObject var198 = module0191.f11990((SubLObject)$ic77$, var194, var173, (SubLObject)UNPROVIDED);
                    final SubLObject var199 = (SubLObject)ConsesLow.cons(var198, var197);
                    final SubLObject var200 = module0233.f15361(var191, var184);
                    var172.resetMultipleValues();
                    final SubLObject var201 = module0235.f15476(var176, var200, (SubLObject)T, (SubLObject)T);
                    final SubLObject var202 = var172.secondMultipleValue();
                    final SubLObject var203 = var172.thirdMultipleValue();
                    var172.resetMultipleValues();
                    if (NIL != var201) {
                        final SubLObject var204 = f30914();
                        final SubLObject var205 = (SubLObject)ConsesLow.cons(var204, (SubLObject)ConsesLow.cons(var193, var203));
                        final SubLObject var206 = module0035.f2269(ConsesLow.append(var189, var195, var201), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0376.f26641(var206, (SubLObject)((NIL != var177) ? ConsesLow.list(var199, var205) : ConsesLow.list(var205, var199)));
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var187, (SubLObject)$ic74$);
            }
            var185 = var185.rest();
            var186 = var185.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30989(final SubLObject var171) {
        SubLObject var173;
        final SubLObject var172 = var173 = module0232.f15308(var171);
        SubLObject var174 = (SubLObject)NIL;
        SubLObject var175 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var173, var172, (SubLObject)$ic78$);
        var174 = var173.first();
        var173 = var173.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var173, var172, (SubLObject)$ic78$);
        var175 = var173.first();
        var173 = var173.rest();
        if (NIL == var173) {
            SubLObject var234_235;
            final SubLObject var232_233 = var234_235 = var174;
            SubLObject var176 = (SubLObject)NIL;
            SubLObject var177 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var234_235, var232_233, (SubLObject)$ic73$);
            var176 = var234_235.first();
            var234_235 = var234_235.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var234_235, var232_233, (SubLObject)$ic73$);
            var177 = var234_235.first();
            var234_235 = var234_235.rest();
            if (NIL == var234_235) {
                SubLObject var238_239;
                final SubLObject var236_237 = var238_239 = var175;
                SubLObject var178 = (SubLObject)NIL;
                SubLObject var179 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var238_239, var236_237, (SubLObject)$ic79$);
                var178 = var238_239.first();
                var238_239 = var238_239.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var238_239, var236_237, (SubLObject)$ic79$);
                var179 = var238_239.first();
                var238_239 = var238_239.rest();
                if (NIL == var238_239) {
                    return $ic66$.eql(module0205.f13333(var177)) ? Values.values(var176, var177, var178, var179, (SubLObject)T) : Values.values(var178, var179, var176, var177, (SubLObject)NIL);
                }
                cdestructuring_bind.cdestructuring_bind_error(var236_237, (SubLObject)$ic79$);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var232_233, (SubLObject)$ic73$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var172, (SubLObject)$ic78$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30987(final SubLObject var203, final SubLObject var204, final SubLObject var167, final SubLObject var3) {
        final SubLThread var205 = SubLProcess.currentSubLThread();
        SubLObject var206 = (SubLObject)NIL;
        final SubLObject var207 = module0202.f12769($ic3$, var203, var204, var167);
        final SubLObject var208 = module0147.$g2095$.currentBinding(var205);
        final SubLObject var209 = module0147.$g2094$.currentBinding(var205);
        final SubLObject var210 = module0147.$g2096$.currentBinding(var205);
        try {
            module0147.$g2095$.bind(module0147.f9545(var3), var205);
            module0147.$g2094$.bind(module0147.f9546(var3), var205);
            module0147.$g2096$.bind(module0147.f9549(var3), var205);
            var206 = module0499.f32215(var207);
        }
        finally {
            module0147.$g2096$.rebind(var210, var205);
            module0147.$g2094$.rebind(var209, var205);
            module0147.$g2095$.rebind(var208, var205);
        }
        return var206;
    }
    
    public static SubLObject f30991(final SubLObject var203, final SubLObject var204, final SubLObject var167, final SubLObject var3) {
        final SubLObject var205 = module0202.f12769($ic3$, var203, var204, var167);
        return module0321.f21702(var205, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30992() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30904", "S#34174", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30905", "S#34175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30906", "S#34176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30907", "S#34177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30908", "S#34178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30909", "S#34179", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30912", "S#34180", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30910", "S#34181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30911", "S#34182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30913", "S#34183", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30914", "S#34184", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30915", "S#34185", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30916", "S#34186", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30917", "S#34187", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30918", "S#34188", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30919", "S#34189", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30920", "S#34163", 1, 1, false);
        new $f30920$UnaryFunction();
        new $f30920$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30921", "S#34164", 1, 1, false);
        new $f30921$UnaryFunction();
        new $f30921$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30922", "S#34190", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30925", "S#34191", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30926", "S#34192", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30927", "S#34193", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30930", "S#34194", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30931", "S#34195", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30932", "S#34196", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30923", "S#34197", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30924", "S#34198", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30928", "S#34199", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30929", "S#34200", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30933", "S#34201", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30934", "S#34202", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30935", "S#34165", 1, 1, false);
        new $f30935$UnaryFunction();
        new $f30935$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30936", "S#34166", 1, 1, false);
        new $f30936$UnaryFunction();
        new $f30936$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30937", "S#34203", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30938", "S#34204", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30939", "S#34205", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30940", "S#34206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30941", "S#34207", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30942", "S#34208", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30943", "S#34209", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30946", "S#34210", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30944", "S#34211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30945", "S#34212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30947", "S#34213", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30948", "S#34214", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30949", "S#34215", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30950", "S#34216", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30951", "S#34217", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30952", "S#34218", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30953", "S#34219", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30954", "S#34220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30955", "S#34167", 1, 1, false);
        new $f30955$UnaryFunction();
        new $f30955$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30956", "S#34168", 1, 1, false);
        new $f30956$UnaryFunction();
        new $f30956$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30957", "S#34221", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30960", "S#34222", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30961", "S#34223", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30962", "S#34224", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30965", "S#34225", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30966", "S#34226", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30967", "S#34227", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30958", "S#34228", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30959", "S#34229", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30963", "S#34230", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30964", "S#34231", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30968", "S#34232", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30969", "S#34233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30970", "S#34169", 1, 1, false);
        new $f30970$UnaryFunction();
        new $f30970$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30971", "S#34170", 1, 1, false);
        new $f30971$UnaryFunction();
        new $f30971$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30972", "S#34234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30973", "S#34235", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30974", "S#34236", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30975", "S#34237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30976", "S#34238", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30977", "S#34239", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30978", "S#34240", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30979", "S#34241", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30980", "S#34242", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30981", "S#34243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30982", "S#34244", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30983", "S#34245", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30984", "S#34246", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30985", "S#34247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30986", "S#34171", 1, 0, false);
        new $f30986$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30988", "S#34248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30990", "S#34249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30989", "S#34250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30987", "S#34251", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0447", "f30991", "S#34252", 4, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30993() {
        $g3574$ = SubLFiles.deflexical("S#34253", module0202.f12761((SubLObject)$ic5$));
        $g3575$ = SubLFiles.deflexical("S#34254", (NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g3575$.getGlobalValue() : $ic7$);
        $g3576$ = SubLFiles.deflexical("S#34255", module0018.$g661$.getGlobalValue());
        $g3577$ = SubLFiles.deflexical("S#34256", module0018.$g661$.getGlobalValue());
        $g3578$ = SubLFiles.deflexical("S#34257", module0202.f12761((SubLObject)$ic39$));
        $g3579$ = SubLFiles.deflexical("S#34258", (NIL != Symbols.boundp((SubLObject)$ic40$)) ? $g3579$.getGlobalValue() : $ic7$);
        $g3580$ = SubLFiles.deflexical("S#34259", module0018.$g661$.getGlobalValue());
        $g3581$ = SubLFiles.deflexical("S#34260", module0018.$g661$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30994() {
        module0003.f57((SubLObject)$ic6$);
        module0132.f8593((SubLObject)$ic6$, $ic3$);
        module0340.f22941((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0340.f22941((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0340.f22941((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0340.f22941((SubLObject)$ic31$, (SubLObject)$ic32$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0340.f22941((SubLObject)$ic35$, (SubLObject)$ic36$);
        module0003.f57((SubLObject)$ic40$);
        module0132.f8593((SubLObject)$ic40$, $ic37$);
        module0340.f22941((SubLObject)$ic41$, (SubLObject)$ic42$);
        module0340.f22941((SubLObject)$ic50$, (SubLObject)$ic51$);
        module0340.f22941((SubLObject)$ic52$, (SubLObject)$ic53$);
        module0340.f22941((SubLObject)$ic54$, (SubLObject)$ic55$);
        module0340.f22941((SubLObject)$ic56$, (SubLObject)$ic57$);
        module0340.f22941((SubLObject)$ic58$, (SubLObject)$ic59$);
        module0340.f22941((SubLObject)$ic60$, (SubLObject)$ic61$);
        module0340.f22941((SubLObject)$ic68$, (SubLObject)$ic69$);
        module0340.f22962((SubLObject)$ic70$, (SubLObject)$ic71$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30992();
    }
    
    public void initializeVariables() {
        f30993();
    }
    
    public void runTopLevelForms() {
        f30994();
    }
    
    static {
        me = (SubLFile)new module0447();
        $g3574$ = null;
        $g3575$ = null;
        $g3576$ = null;
        $g3577$ = null;
        $g3578$ = null;
        $g3579$ = null;
        $g3580$ = null;
        $g3581$ = null;
        $ic0$ = makeKeyword("GENL-PREDS");
        $ic1$ = makeKeyword("GENL-INVERSE");
        $ic2$ = makeKeyword("BOTH");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn"));
        $ic5$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?THING"), (SubLObject)makeSymbol("?COLL")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?THING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?THING"), (SubLObject)makeSymbol("?COLL"))));
        $ic6$ = makeSymbol("S#34254", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic8$ = makeKeyword("CODE");
        $ic9$ = makeKeyword("TRUE-MON");
        $ic10$ = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TREE-FIND"), constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("S#34186", "CYC"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("@todo write this"), makeKeyword("EXAMPLE"), makeString("@todo write this") });
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")));
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34261", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34262", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34263", "CYC"))));
        $ic14$ = makeSymbol("S#34263", "CYC");
        $ic15$ = makeSymbol("S#34262", "CYC");
        $ic16$ = makeSymbol("S#34261", "CYC");
        $ic17$ = makeSymbol("S#12141", "CYC");
        $ic18$ = makeSymbol("S#717", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("ANYTHING"));
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34261", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34262", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34263", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")));
        $ic21$ = makeKeyword("POS");
        $ic22$ = makeKeyword("GAF-ARG");
        $ic23$ = makeKeyword("GAF");
        $ic24$ = makeKeyword("PREDICATE-EXTENT");
        $ic25$ = makeKeyword("OVERLAP");
        $ic26$ = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-CHECK");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("S#34187", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34255", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34188", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> (#$RelationInstanceExistsFn <predicate> <object> <coll>)) \nwhere <object> is a TERM\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)\n\nor \n\n(<predicate> (#$RelationInstanceExistsFn <predicate> <object> <coll>) <object>) \nwhere <object> is a TERM\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)\n"), makeKeyword("EXAMPLE"), makeString("(#$owns #$Sean \n      (#$RelationInstanceExistsFn #$owns #$Sean #$Holster))\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)") });
        $ic28$ = makeKeyword("TRUE");
        $ic29$ = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1");
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34163", "CYC"), makeKeyword("COST"), makeSymbol("S#34191", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34194", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>)\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("") });
        $ic31$ = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2");
        $ic32$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34164", "CYC"), makeKeyword("COST"), makeSymbol("S#34192", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34195", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>)\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$owns #$Sean ?ITEM)\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)") });
        $ic33$ = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")), (SubLObject)makeKeyword("ANYTHING"))))), makeKeyword("REQUIRED"), makeSymbol("S#34165", "CYC"), makeKeyword("COST"), makeSymbol("S#34204", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34207", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <anything>)\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$owns ?WHO ?ITEM)\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)") });
        $ic35$ = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2");
        $ic36$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34166", "CYC"), makeKeyword("COST"), makeSymbol("S#34205", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34208", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <anything> <not fully-bound>)\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("") });
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("relationExistsInstance"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn"));
        $ic39$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationExistsInstance")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?COLL"), (SubLObject)makeSymbol("?THING")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PRED"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?COLL"), (SubLObject)makeSymbol("?THING")), (SubLObject)makeSymbol("?THING")));
        $ic40$ = makeSymbol("S#34258", "CYC");
        $ic41$ = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE");
        $ic42$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TREE-FIND"), constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("S#34216", "CYC"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("@todo write this"), makeKeyword("EXAMPLE"), makeString("@todo write this") });
        $ic43$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("ANYTHING"));
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34264", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34265", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34266", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")));
        $ic45$ = makeSymbol("S#34266", "CYC");
        $ic46$ = makeSymbol("S#34265", "CYC");
        $ic47$ = makeSymbol("S#34264", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")));
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34264", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34265", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34266", "CYC"))));
        $ic50$ = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-CHECK");
        $ic51$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("REQUIRED"), makeSymbol("S#34217", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34259", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34218", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> (#$RelationExistsInstanceFn <predicate> <coll> <object>) <object>) \nfrom (#$relationExistsInstance <spec-predicate> <coll> <object>)\nand (#$genlPreds <spec-predicate> <predicate)\n\nor \n\n(<predicate> <object> (#$RelationExistsInstanceFn <predicate> <coll> <object>)) \nfrom (#$relationExistsInstance <inv-predicate> <coll> <object>)\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$inRegion (#$RelationExistsInstanceFn #$inRegion #$Subway #$CityOfMadridSpain)\n                #$CityOfMadridSpain)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)") });
        $ic52$ = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1");
        $ic53$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34167", "CYC"), makeKeyword("COST"), makeSymbol("S#34222", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34225", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>) \nfrom (#$relationExistsInstance <spec-predicate> <coll> <object>)\nand (#$genlPreds <spec-predicate> <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$inRegion ?WHAT #$CityOfMadridSpain)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)") });
        $ic54$ = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2");
        $ic55$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34168", "CYC"), makeKeyword("COST"), makeSymbol("S#34223", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34226", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>) \nfrom (#$relationExistsInstance <inv-predicate> <coll> <object>)\nand (#$genlInverse <inv-predicate> <predicate>"), makeKeyword("EXAMPLE"), makeString("") });
        $ic56$ = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1");
        $ic57$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("S#34169", "CYC"), makeKeyword("COST"), makeSymbol("S#34235", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34238", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <anything>)\nfrom (#$relationExistsInstance <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("") });
        $ic58$ = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2");
        $ic59$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")), (SubLObject)makeKeyword("ANYTHING"))), (SubLObject)makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("S#34170", "CYC"), makeKeyword("COST"), makeSymbol("S#34236", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34239", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <anything> <not fully-bound>)\nfrom (#$relationExistsInstance <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$inRegion ?OBJ1 ?OBJ2)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)") });
        $ic60$ = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR");
        $ic61$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists")), (SubLObject)makeKeyword("PREDICATE-FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("COLLECTION-FORT"))), makeKeyword("COST"), makeSymbol("S#34240", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34241", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$relationInstanceExists <predicate> <term> <collection>) \nfrom (<spec-predicate> <term> <collection-instance>) \n(#$genlPreds <spec-predicate> <predicate>) \nand (#$isa <collection-instance> <collection>) \nor \nfrom (<inv-predicate> <collection-instance> <term>) \n(#$genlInverse <inv-predicate> <predicate>) \nand (#$isa <collection-instance> <collection>)\t       \n"), makeKeyword("EXAMPLE"), makeString("") });
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic63$ = makeSymbol("?INS");
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("?INS"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic67$ = makeKeyword("QUERY");
        $ic68$ = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR");
        $ic69$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("relationExistsInstance")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationExistsInstance")), (SubLObject)makeKeyword("PREDICATE-FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("COLLECTION-FORT")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34244", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34245", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$relationExistsInstance <predicate> <collection> <term>)\nfrom (<spec-predicate> <collection-instance> <term>)\n(#$genlPreds <spec-predicate> <predicate>)\nand (#$isa <collection-instance> <collection>)\nor\nfrom (<inv-predicate> <term> <collection-instance>)\n(#$genlInverse <inv-predicate> <predicate>)\nand (#$isa <collection-instance> <collection>)\t       \n"), makeKeyword("EXAMPLE"), makeString("") });
        $ic70$ = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION");
        $ic71$ = ConsesLow.list(new SubLObject[] { makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa"))), makeKeyword("APPLICABILITY"), makeSymbol("S#34171", "CYC"), makeKeyword("COST"), makeSymbol("S#34248", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34249", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$and (<fort> <anything> <not-fully-bound-N>)\n           (#$isa <not-fully-bound-N> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$organismKilled ?EVENT ?PERSON)\n           (#$isa ?PERSON #$UnitedStatesPerson))") });
        $ic72$ = ConsesLow.list((SubLObject)makeSymbol("S#34267", "CYC"), (SubLObject)makeSymbol("S#34268", "CYC"));
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("S#34269", "CYC"), (SubLObject)makeSymbol("S#34270", "CYC"));
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#34271", "CYC"), (SubLObject)makeSymbol("S#34272", "CYC"));
        $ic75$ = ConsesLow.list((SubLObject)NIL);
        $ic76$ = makeKeyword("TVA");
        $ic77$ = makeKeyword("ISA");
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#34273", "CYC"), (SubLObject)makeSymbol("S#34274", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("S#34275", "CYC"), (SubLObject)makeSymbol("S#34276", "CYC"));
    }
    
    public static final class $f30920$UnaryFunction extends UnaryFunction
    {
        public $f30920$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34163"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f30920(var27, (SubLObject)$f30920$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30920$BinaryFunction extends BinaryFunction
    {
        public $f30920$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34163"));
        }
        
        public SubLObject processItem(final SubLObject var27, final SubLObject var28) {
            return f30920(var27, var28);
        }
    }
    
    public static final class $f30921$UnaryFunction extends UnaryFunction
    {
        public $f30921$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34164"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f30921(var27, (SubLObject)$f30921$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30921$BinaryFunction extends BinaryFunction
    {
        public $f30921$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34164"));
        }
        
        public SubLObject processItem(final SubLObject var27, final SubLObject var28) {
            return f30921(var27, var28);
        }
    }
    
    public static final class $f30935$UnaryFunction extends UnaryFunction
    {
        public $f30935$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34165"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f30935(var27, (SubLObject)$f30935$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30935$BinaryFunction extends BinaryFunction
    {
        public $f30935$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34165"));
        }
        
        public SubLObject processItem(final SubLObject var27, final SubLObject var28) {
            return f30935(var27, var28);
        }
    }
    
    public static final class $f30936$UnaryFunction extends UnaryFunction
    {
        public $f30936$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34166"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f30936(var27, (SubLObject)$f30936$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30936$BinaryFunction extends BinaryFunction
    {
        public $f30936$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34166"));
        }
        
        public SubLObject processItem(final SubLObject var27, final SubLObject var28) {
            return f30936(var27, var28);
        }
    }
    
    public static final class $f30955$UnaryFunction extends UnaryFunction
    {
        public $f30955$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34167"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f30955(var27, (SubLObject)$f30955$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30955$BinaryFunction extends BinaryFunction
    {
        public $f30955$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34167"));
        }
        
        public SubLObject processItem(final SubLObject var27, final SubLObject var28) {
            return f30955(var27, var28);
        }
    }
    
    public static final class $f30956$UnaryFunction extends UnaryFunction
    {
        public $f30956$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34168"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f30956(var27, (SubLObject)$f30956$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30956$BinaryFunction extends BinaryFunction
    {
        public $f30956$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34168"));
        }
        
        public SubLObject processItem(final SubLObject var27, final SubLObject var28) {
            return f30956(var27, var28);
        }
    }
    
    public static final class $f30970$UnaryFunction extends UnaryFunction
    {
        public $f30970$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34169"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f30970(var27, (SubLObject)$f30970$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30970$BinaryFunction extends BinaryFunction
    {
        public $f30970$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34169"));
        }
        
        public SubLObject processItem(final SubLObject var27, final SubLObject var28) {
            return f30970(var27, var28);
        }
    }
    
    public static final class $f30971$UnaryFunction extends UnaryFunction
    {
        public $f30971$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34170"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f30971(var27, (SubLObject)$f30971$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30971$BinaryFunction extends BinaryFunction
    {
        public $f30971$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34170"));
        }
        
        public SubLObject processItem(final SubLObject var27, final SubLObject var28) {
            return f30971(var27, var28);
        }
    }
    
    public static final class $f30986$UnaryFunction extends UnaryFunction
    {
        public $f30986$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34171"));
        }
        
        public SubLObject processItem(final SubLObject var27) {
            return f30986(var27);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1191 ms
	
	Decompiled with Procyon 0.5.32.
*/