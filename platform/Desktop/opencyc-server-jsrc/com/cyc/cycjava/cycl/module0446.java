package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0446 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0446";
    public static final String myFingerPrint = "bdd842ab2577440d9d870e89fe38912d01a981d1ba0ef01115c02bac94187c3a";
    private static SubLSymbol $g3564$;
    private static SubLSymbol $g3565$;
    public static SubLSymbol $g3566$;
    private static SubLSymbol $g3567$;
    private static SubLSymbol $g3568$;
    private static SubLSymbol $g3569$;
    private static SubLSymbol $g3570$;
    public static SubLSymbol $g3571$;
    private static SubLSymbol $g3572$;
    private static SubLSymbol $g3573$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
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
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    
    public static SubLObject f30864(final SubLObject var1) {
        return module0202.f12657(var1);
    }
    
    public static SubLObject f30865(final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        if (NIL == module0435.f30628()) {
            return (SubLObject)NIL;
        }
        if (NIL == f30866(var2, (SubLObject)T)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic2$)) {
            return (SubLObject)$ic3$;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic4$)) {
            return (SubLObject)$ic5$;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic6$)) {
            return (SubLObject)$ic3$;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic7$)) {
            return (SubLObject)$ic3$;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic8$)) {
            return (SubLObject)$ic5$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30867(final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var5)) {
            return module0220.f14548(var5, $ic9$, var6, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30868(final SubLObject var7, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var7) && NIL != module0222.f14635($ic9$, var7, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            return module0220.f14548(var7, $ic9$, var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30869(final SubLObject var5) {
        return module0217.f14223(var5, (SubLObject)ONE_INTEGER, $ic9$);
    }
    
    public static SubLObject f30870(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return Numbers.multiply($g3564$.getGlobalValue(), module0018.$g664$.getDynamicValue(var9));
    }
    
    public static SubLObject f30866(final SubLObject var2, final SubLObject var10) {
        if (NIL != var10 && NIL == module0435.f30628()) {
            return (SubLObject)NIL;
        }
        final SubLObject var11 = module0205.f13333(var2);
        return (SubLObject)makeBoolean(($ic10$.eql(var11) || NIL == module0333.f22416(var11)) && (NIL == var10 || NIL != module0461.f31411($ic11$)) && NIL != f30867(var11, (SubLObject)NIL));
    }
    
    public static SubLObject f30871() {
        return module0191.f11990((SubLObject)$ic15$, $g3565$.getGlobalValue(), $g3566$.getGlobalValue(), (SubLObject)$ic16$);
    }
    
    public static SubLObject f30872(final SubLObject var1, final SubLObject var5, final SubLObject var11, final SubLObject var12) {
        return module0202.f12761((SubLObject)ConsesLow.list($ic11$, var1, var5, var11, var12));
    }
    
    public static SubLObject f30873(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL != module0337.f22626((SubLObject)$ic19$, var2)) {
            final SubLObject var15 = (SubLObject)$ic20$;
            var14.resetMultipleValues();
            final SubLObject var16 = module0337.f22630(var2, var15);
            final SubLObject var17 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var16) {
                final SubLObject var18 = module0035.f2294(var17, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var19 = module0035.f2294(var17, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var20 = module0035.f2294(var17, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var21 = module0035.f2294(var17, (SubLObject)$ic24$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0035.f2294(var17, (SubLObject)$ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var23 = module0035.f2294(var17, (SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var20.eql(var23)) {
                    return (SubLObject)T;
                }
                if (NIL == module0234.f15434(var21, var22)) {
                    return (SubLObject)T;
                }
            }
            return (SubLObject)NIL;
        }
        if (NIL != module0337.f22626((SubLObject)$ic27$, var2)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f30874(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL != f30866(var2, (SubLObject)NIL)) {
            final SubLObject var15 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
            final SubLObject var16 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
            var14.resetMultipleValues();
            final SubLObject var17 = module0202.f12798(var16);
            final SubLObject var18 = var14.secondMultipleValue();
            final SubLObject var19 = var14.thirdMultipleValue();
            final SubLObject var20 = var14.fourthMultipleValue();
            final SubLObject var21 = var14.fifthMultipleValue();
            var14.resetMultipleValues();
            return (SubLObject)makeBoolean(var19.eql(module0205.f13333(var2)) && var15.equal(var18));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30875(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
        var14.resetMultipleValues();
        final SubLObject var16 = module0202.f12798(var15);
        final SubLObject var17 = var14.secondMultipleValue();
        final SubLObject var18 = var14.thirdMultipleValue();
        final SubLObject var19 = var14.fourthMultipleValue();
        final SubLObject var20 = var14.fifthMultipleValue();
        var14.resetMultipleValues();
        final SubLObject var21 = module0202.f12761((SubLObject)ConsesLow.list($ic9$, var18, var19, var20));
        final SubLObject var22 = module0349.f23449(var21, (SubLObject)$ic28$);
        final SubLObject var24;
        final SubLObject var23 = var24 = module0158.f10294(var22);
        if (var24.eql((SubLObject)$ic29$)) {
            var14.resetMultipleValues();
            final SubLObject var28_29 = module0158.f10297(var22);
            final SubLObject var25 = var14.secondMultipleValue();
            final SubLObject var26 = var14.thirdMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var25) {
                if (NIL != var26) {
                    final SubLObject var27 = var26;
                    if (NIL != module0158.f10010(var28_29, var25, var27)) {
                        final SubLObject var28 = module0158.f10011(var28_29, var25, var27);
                        SubLObject var29 = (SubLObject)NIL;
                        final SubLObject var30 = (SubLObject)NIL;
                        while (NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                            if (NIL != var32) {
                                SubLObject var33 = (SubLObject)NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                    SubLObject var34_39 = (SubLObject)NIL;
                                    final SubLObject var35_40 = (SubLObject)NIL;
                                    while (NIL == var34_39) {
                                        final SubLObject var34 = module0052.f3695(var33, var35_40);
                                        final SubLObject var37_42 = (SubLObject)makeBoolean(!var35_40.eql(var34));
                                        if (NIL != var37_42) {
                                            f30876(var2, var34);
                                        }
                                        var34_39 = (SubLObject)makeBoolean(NIL == var37_42);
                                    }
                                }
                                finally {
                                    final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                        if (NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35, var14);
                                    }
                                }
                            }
                            var29 = (SubLObject)makeBoolean(NIL == var32);
                        }
                    }
                }
                else {
                    final SubLObject var27 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var28_29, var25, var27)) {
                        final SubLObject var28 = module0158.f10011(var28_29, var25, var27);
                        SubLObject var29 = (SubLObject)NIL;
                        final SubLObject var30 = (SubLObject)NIL;
                        while (NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                            if (NIL != var32) {
                                SubLObject var33 = (SubLObject)NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                    SubLObject var34_40 = (SubLObject)NIL;
                                    final SubLObject var35_41 = (SubLObject)NIL;
                                    while (NIL == var34_40) {
                                        final SubLObject var34 = module0052.f3695(var33, var35_41);
                                        final SubLObject var37_43 = (SubLObject)makeBoolean(!var35_41.eql(var34));
                                        if (NIL != var37_43) {
                                            f30876(var2, var34);
                                        }
                                        var34_40 = (SubLObject)makeBoolean(NIL == var37_43);
                                    }
                                }
                                finally {
                                    final SubLObject var36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                        if (NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36, var14);
                                    }
                                }
                            }
                            var29 = (SubLObject)makeBoolean(NIL == var32);
                        }
                    }
                }
            }
            else if (NIL != var26) {
                final SubLObject var27 = var26;
                if (NIL != module0158.f10010(var28_29, (SubLObject)NIL, var27)) {
                    final SubLObject var28 = module0158.f10011(var28_29, (SubLObject)NIL, var27);
                    SubLObject var29 = (SubLObject)NIL;
                    final SubLObject var30 = (SubLObject)NIL;
                    while (NIL == var29) {
                        final SubLObject var31 = module0052.f3695(var28, var30);
                        final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                        if (NIL != var32) {
                            SubLObject var33 = (SubLObject)NIL;
                            try {
                                var33 = module0158.f10316(var31, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                SubLObject var34_41 = (SubLObject)NIL;
                                final SubLObject var35_42 = (SubLObject)NIL;
                                while (NIL == var34_41) {
                                    final SubLObject var34 = module0052.f3695(var33, var35_42);
                                    final SubLObject var37_44 = (SubLObject)makeBoolean(!var35_42.eql(var34));
                                    if (NIL != var37_44) {
                                        f30876(var2, var34);
                                    }
                                    var34_41 = (SubLObject)makeBoolean(NIL == var37_44);
                                }
                            }
                            finally {
                                final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                    if (NIL != var33) {
                                        module0158.f10319(var33);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var37, var14);
                                }
                            }
                        }
                        var29 = (SubLObject)makeBoolean(NIL == var32);
                    }
                }
            }
            else {
                final SubLObject var27 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var28_29, (SubLObject)NIL, var27)) {
                    final SubLObject var28 = module0158.f10011(var28_29, (SubLObject)NIL, var27);
                    SubLObject var29 = (SubLObject)NIL;
                    final SubLObject var30 = (SubLObject)NIL;
                    while (NIL == var29) {
                        final SubLObject var31 = module0052.f3695(var28, var30);
                        final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                        if (NIL != var32) {
                            SubLObject var33 = (SubLObject)NIL;
                            try {
                                var33 = module0158.f10316(var31, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                SubLObject var34_42 = (SubLObject)NIL;
                                final SubLObject var35_43 = (SubLObject)NIL;
                                while (NIL == var34_42) {
                                    final SubLObject var34 = module0052.f3695(var33, var35_43);
                                    final SubLObject var37_45 = (SubLObject)makeBoolean(!var35_43.eql(var34));
                                    if (NIL != var37_45) {
                                        f30876(var2, var34);
                                    }
                                    var34_42 = (SubLObject)makeBoolean(NIL == var37_45);
                                }
                            }
                            finally {
                                final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                    if (NIL != var33) {
                                        module0158.f10319(var33);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var38, var14);
                                }
                            }
                        }
                        var29 = (SubLObject)makeBoolean(NIL == var32);
                    }
                }
            }
        }
        else if (var24.eql((SubLObject)$ic31$)) {
            final SubLObject var39 = module0158.f10299(var22);
            if (NIL != module0158.f10038(var39)) {
                final SubLObject var40 = (SubLObject)NIL;
                final SubLObject var41 = module0012.$g73$.currentBinding(var14);
                final SubLObject var42 = module0012.$g65$.currentBinding(var14);
                final SubLObject var43 = module0012.$g67$.currentBinding(var14);
                final SubLObject var44 = module0012.$g68$.currentBinding(var14);
                final SubLObject var45 = module0012.$g66$.currentBinding(var14);
                final SubLObject var46 = module0012.$g69$.currentBinding(var14);
                final SubLObject var47 = module0012.$g70$.currentBinding(var14);
                final SubLObject var48 = module0012.$silent_progressP$.currentBinding(var14);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var14);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var14), var14);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var14);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var14);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var14);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var14);
                    module0012.$g70$.bind((SubLObject)T, var14);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var40) ? module0012.$silent_progressP$.getDynamicValue(var14) : T), var14);
                    module0012.f474(var40);
                    final SubLObject var49 = module0158.f10039(var39);
                    SubLObject var50 = (SubLObject)NIL;
                    final SubLObject var51 = (SubLObject)NIL;
                    while (NIL == var50) {
                        final SubLObject var52 = module0052.f3695(var49, var51);
                        final SubLObject var53 = (SubLObject)makeBoolean(!var51.eql(var52));
                        if (NIL != var53) {
                            module0012.f476();
                            SubLObject var54 = (SubLObject)NIL;
                            try {
                                var54 = module0158.f10316(var52, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                SubLObject var34_43 = (SubLObject)NIL;
                                final SubLObject var35_44 = (SubLObject)NIL;
                                while (NIL == var34_43) {
                                    final SubLObject var55 = module0052.f3695(var54, var35_44);
                                    final SubLObject var37_46 = (SubLObject)makeBoolean(!var35_44.eql(var55));
                                    if (NIL != var37_46) {
                                        f30876(var2, var55);
                                    }
                                    var34_43 = (SubLObject)makeBoolean(NIL == var37_46);
                                }
                            }
                            finally {
                                final SubLObject var43_66 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                    if (NIL != var54) {
                                        module0158.f10319(var54);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var43_66, var14);
                                }
                            }
                        }
                        var50 = (SubLObject)makeBoolean(NIL == var53);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var48, var14);
                    module0012.$g70$.rebind(var47, var14);
                    module0012.$g69$.rebind(var46, var14);
                    module0012.$g66$.rebind(var45, var14);
                    module0012.$g68$.rebind(var44, var14);
                    module0012.$g67$.rebind(var43, var14);
                    module0012.$g65$.rebind(var42, var14);
                    module0012.$g73$.rebind(var41, var14);
                }
            }
        }
        else if (var24.eql((SubLObject)$ic32$)) {
            SubLObject var56 = module0218.f14453(module0158.f10301(var22), (SubLObject)UNPROVIDED);
            SubLObject var57 = (SubLObject)NIL;
            var57 = var56.first();
            while (NIL != var56) {
                if (NIL == module0130.f8518((SubLObject)$ic28$) || NIL != module0178.f11343(var57, module0130.f8518((SubLObject)$ic28$))) {
                    f30876(var2, var57);
                }
                var56 = var56.rest();
                var57 = var56.first();
            }
        }
        else {
            module0158.f10295(var22, var23);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30876(final SubLObject var2, final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var41)) {
            final SubLObject var43 = module0178.f11285(var41);
            if (NIL != module0202.f12734(var43, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED)) {
                final SubLObject var44 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
                var42.resetMultipleValues();
                final SubLObject var45 = module0202.f12798(var44);
                final SubLObject var46 = var42.secondMultipleValue();
                final SubLObject var47 = var42.thirdMultipleValue();
                final SubLObject var48 = var42.fourthMultipleValue();
                final SubLObject var49 = var42.fifthMultipleValue();
                var42.resetMultipleValues();
                var42.resetMultipleValues();
                final SubLObject var50 = module0202.f12797(module0178.f11285(var41));
                final SubLObject var51 = var42.secondMultipleValue();
                final SubLObject var52 = var42.thirdMultipleValue();
                final SubLObject var53 = var42.fourthMultipleValue();
                var42.resetMultipleValues();
                if (var47.eql(var51) && var48.equal(var52) && var49.equal(var53) && NIL != module0259.f16854(var46, var48, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
                    final SubLObject var54 = f30871();
                    final SubLObject var55 = module0191.f11990((SubLObject)$ic35$, (SubLObject)ConsesLow.list($ic10$, var46, var48), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var56 = (SubLObject)ConsesLow.list(var54, var55);
                    module0347.f23330(var41, (SubLObject)NIL, var56);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30877(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL != f30866(var2, (SubLObject)T)) {
            final SubLObject var14 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
            return f30864(var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30878(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13333(var2);
        final SubLObject var15 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
        final SubLObject var16 = f30869(var14);
        final SubLObject var17 = Numbers.round(Numbers.sqrt(var16), (SubLObject)UNPROVIDED);
        return Numbers.max($g3568$.getGlobalValue(), var17);
    }
    
    public static SubLObject f30879(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13333(var2);
        final SubLObject var15 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
        final SubLObject var16 = f30869(var14);
        final SubLObject var17 = f30870(var15);
        if (var16.numLE(var17)) {
            final SubLObject var18 = $ic9$;
            if (NIL != module0158.f10010(var14, (SubLObject)ONE_INTEGER, var18)) {
                final SubLObject var19 = module0158.f10011(var14, (SubLObject)ONE_INTEGER, var18);
                SubLObject var20 = (SubLObject)NIL;
                final SubLObject var21 = (SubLObject)NIL;
                while (NIL == var20) {
                    final SubLObject var22 = module0052.f3695(var19, var21);
                    final SubLObject var23 = (SubLObject)makeBoolean(!var21.eql(var22));
                    if (NIL != var23) {
                        SubLObject var24 = (SubLObject)NIL;
                        try {
                            var24 = module0158.f10316(var22, (SubLObject)$ic30$, (SubLObject)$ic36$, (SubLObject)NIL);
                            SubLObject var34_79 = (SubLObject)NIL;
                            final SubLObject var35_80 = (SubLObject)NIL;
                            while (NIL == var34_79) {
                                final SubLObject var25 = module0052.f3695(var24, var35_80);
                                final SubLObject var37_81 = (SubLObject)makeBoolean(!var35_80.eql(var25));
                                if (NIL != var37_81) {
                                    f30880(var2, var25);
                                }
                                var34_79 = (SubLObject)makeBoolean(NIL == var37_81);
                            }
                        }
                        finally {
                            final SubLObject var26 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var24) {
                                    module0158.f10319(var24);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var26);
                            }
                        }
                    }
                    var20 = (SubLObject)makeBoolean(NIL == var23);
                }
            }
        }
        else {
            SubLObject var28;
            final SubLObject var27 = var28 = module0259.f16840(var15, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL != var28) {
                if (NIL != f30868(var29, (SubLObject)NIL)) {
                    final SubLObject var30 = $ic9$;
                    if (NIL != module0158.f10010(var29, (SubLObject)TWO_INTEGER, var30)) {
                        final SubLObject var31 = module0158.f10011(var29, (SubLObject)TWO_INTEGER, var30);
                        SubLObject var32 = (SubLObject)NIL;
                        final SubLObject var33 = (SubLObject)NIL;
                        while (NIL == var32) {
                            final SubLObject var34 = module0052.f3695(var31, var33);
                            final SubLObject var35 = (SubLObject)makeBoolean(!var33.eql(var34));
                            if (NIL != var35) {
                                SubLObject var36 = (SubLObject)NIL;
                                try {
                                    var36 = module0158.f10316(var34, (SubLObject)$ic30$, (SubLObject)$ic36$, (SubLObject)NIL);
                                    SubLObject var34_80 = (SubLObject)NIL;
                                    final SubLObject var35_81 = (SubLObject)NIL;
                                    while (NIL == var34_80) {
                                        final SubLObject var37 = module0052.f3695(var36, var35_81);
                                        final SubLObject var37_82 = (SubLObject)makeBoolean(!var35_81.eql(var37));
                                        if (NIL != var37_82) {
                                            f30881(var2, var37);
                                        }
                                        var34_80 = (SubLObject)makeBoolean(NIL == var37_82);
                                    }
                                }
                                finally {
                                    final SubLObject var38 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var36) {
                                            module0158.f10319(var36);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var38);
                                    }
                                }
                            }
                            var32 = (SubLObject)makeBoolean(NIL == var35);
                        }
                    }
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30880(final SubLObject var2, final SubLObject var41) {
        final SubLObject var42 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0178.f11335(var41);
        if (NIL == module0259.f16854(var42, var43, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30882(var2, var41);
    }
    
    public static SubLObject f30881(final SubLObject var2, final SubLObject var41) {
        final SubLObject var42 = module0205.f13333(var2);
        if (!var42.eql(module0178.f11334(var41))) {
            return (SubLObject)NIL;
        }
        return f30882(var2, var41);
    }
    
    public static SubLObject f30882(final SubLObject var2, final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var41)) {
            final SubLObject var43 = module0205.f13333(var2);
            final SubLObject var44 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
            final SubLObject var45 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
            final SubLObject var46 = module0178.f11335(var41);
            final SubLObject var47 = module0178.f11336(var41);
            final SubLObject var48 = f30872(var44, var43, var46, var47);
            if (NIL != module0228.f15212(var48)) {
                var42.resetMultipleValues();
                final SubLObject var49 = module0235.f15474(var45, var48, (SubLObject)T, (SubLObject)T);
                final SubLObject var50 = var42.secondMultipleValue();
                var42.resetMultipleValues();
                if (NIL != var49) {
                    final SubLObject var51 = f30871();
                    final SubLObject var52 = module0191.f11990((SubLObject)$ic35$, (SubLObject)ConsesLow.list($ic10$, var44, var46), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var53 = ConsesLow.append((SubLObject)ConsesLow.list(var51, var52), var50);
                    module0347.f23330(var41, var49, var53);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30883(final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        if (NIL == module0435.f30628()) {
            return (SubLObject)NIL;
        }
        if (NIL == f30884(var2, (SubLObject)T)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic2$)) {
            return (SubLObject)$ic3$;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic41$)) {
            return (SubLObject)$ic5$;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic7$)) {
            return (SubLObject)$ic3$;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic6$)) {
            return (SubLObject)$ic3$;
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic8$)) {
            return (SubLObject)$ic5$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30885(final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var5)) {
            return module0220.f14548(var5, $ic42$, var6, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30886(final SubLObject var7, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var7)) {
            return module0220.f14548(var7, $ic42$, var6, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30887(final SubLObject var5) {
        return module0217.f14223(var5, (SubLObject)ONE_INTEGER, $ic42$);
    }
    
    public static SubLObject f30888(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return Numbers.multiply($g3569$.getGlobalValue(), module0018.$g664$.getDynamicValue(var9));
    }
    
    public static SubLObject f30884(final SubLObject var2, final SubLObject var10) {
        if (NIL != var10 && NIL == module0435.f30628()) {
            return (SubLObject)NIL;
        }
        final SubLObject var11 = module0205.f13333(var2);
        return (SubLObject)makeBoolean(($ic10$.eql(var11) || NIL == module0333.f22416(var11)) && (NIL == var10 || NIL != module0461.f31411($ic43$)) && NIL != f30885(var11, (SubLObject)NIL));
    }
    
    public static SubLObject f30889() {
        return module0191.f11990((SubLObject)$ic15$, $g3570$.getGlobalValue(), $g3571$.getGlobalValue(), (SubLObject)$ic16$);
    }
    
    public static SubLObject f30890(final SubLObject var1, final SubLObject var5, final SubLObject var12, final SubLObject var11) {
        return module0202.f12761((SubLObject)ConsesLow.list($ic43$, var1, var5, var12, var11));
    }
    
    public static SubLObject f30891(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL != module0337.f22626((SubLObject)$ic48$, var2)) {
            final SubLObject var15 = (SubLObject)$ic49$;
            var14.resetMultipleValues();
            final SubLObject var16 = module0337.f22630(var2, var15);
            final SubLObject var17 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var16) {
                final SubLObject var18 = module0035.f2294(var17, (SubLObject)$ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var19 = module0035.f2294(var17, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var20 = module0035.f2294(var17, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var21 = module0035.f2294(var17, (SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0035.f2294(var17, (SubLObject)$ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var23 = module0035.f2294(var17, (SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var20.eql(var23)) {
                    return (SubLObject)T;
                }
                if (NIL == module0234.f15434(var21, var22)) {
                    return (SubLObject)T;
                }
            }
            return (SubLObject)NIL;
        }
        if (NIL != module0337.f22626((SubLObject)$ic52$, var2)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f30892(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL != f30884(var2, (SubLObject)NIL)) {
            final SubLObject var15 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
            if (NIL != f30864(var15)) {
                final SubLObject var16 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
                var14.resetMultipleValues();
                final SubLObject var17 = module0202.f12798(var16);
                final SubLObject var18 = var14.secondMultipleValue();
                final SubLObject var19 = var14.thirdMultipleValue();
                final SubLObject var20 = var14.fourthMultipleValue();
                final SubLObject var21 = var14.fifthMultipleValue();
                var14.resetMultipleValues();
                return (SubLObject)makeBoolean(var19.eql(module0205.f13333(var2)) && var15.equal(var18));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30893(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
        var14.resetMultipleValues();
        final SubLObject var16 = module0202.f12798(var15);
        final SubLObject var17 = var14.secondMultipleValue();
        final SubLObject var18 = var14.thirdMultipleValue();
        final SubLObject var19 = var14.fourthMultipleValue();
        final SubLObject var20 = var14.fifthMultipleValue();
        var14.resetMultipleValues();
        final SubLObject var21 = module0202.f12761((SubLObject)ConsesLow.list($ic42$, var18, var19, var20));
        final SubLObject var22 = module0349.f23449(var21, (SubLObject)$ic28$);
        final SubLObject var24;
        final SubLObject var23 = var24 = module0158.f10294(var22);
        if (var24.eql((SubLObject)$ic29$)) {
            var14.resetMultipleValues();
            final SubLObject var28_92 = module0158.f10297(var22);
            final SubLObject var25 = var14.secondMultipleValue();
            final SubLObject var26 = var14.thirdMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var25) {
                if (NIL != var26) {
                    final SubLObject var27 = var26;
                    if (NIL != module0158.f10010(var28_92, var25, var27)) {
                        final SubLObject var28 = module0158.f10011(var28_92, var25, var27);
                        SubLObject var29 = (SubLObject)NIL;
                        final SubLObject var30 = (SubLObject)NIL;
                        while (NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                            if (NIL != var32) {
                                SubLObject var33 = (SubLObject)NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                    SubLObject var34_93 = (SubLObject)NIL;
                                    final SubLObject var35_94 = (SubLObject)NIL;
                                    while (NIL == var34_93) {
                                        final SubLObject var34 = module0052.f3695(var33, var35_94);
                                        final SubLObject var37_95 = (SubLObject)makeBoolean(!var35_94.eql(var34));
                                        if (NIL != var37_95) {
                                            f30894(var2, var34);
                                        }
                                        var34_93 = (SubLObject)makeBoolean(NIL == var37_95);
                                    }
                                }
                                finally {
                                    final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                        if (NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35, var14);
                                    }
                                }
                            }
                            var29 = (SubLObject)makeBoolean(NIL == var32);
                        }
                    }
                }
                else {
                    final SubLObject var27 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var28_92, var25, var27)) {
                        final SubLObject var28 = module0158.f10011(var28_92, var25, var27);
                        SubLObject var29 = (SubLObject)NIL;
                        final SubLObject var30 = (SubLObject)NIL;
                        while (NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                            if (NIL != var32) {
                                SubLObject var33 = (SubLObject)NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                    SubLObject var34_94 = (SubLObject)NIL;
                                    final SubLObject var35_95 = (SubLObject)NIL;
                                    while (NIL == var34_94) {
                                        final SubLObject var34 = module0052.f3695(var33, var35_95);
                                        final SubLObject var37_96 = (SubLObject)makeBoolean(!var35_95.eql(var34));
                                        if (NIL != var37_96) {
                                            f30894(var2, var34);
                                        }
                                        var34_94 = (SubLObject)makeBoolean(NIL == var37_96);
                                    }
                                }
                                finally {
                                    final SubLObject var36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                        if (NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36, var14);
                                    }
                                }
                            }
                            var29 = (SubLObject)makeBoolean(NIL == var32);
                        }
                    }
                }
            }
            else if (NIL != var26) {
                final SubLObject var27 = var26;
                if (NIL != module0158.f10010(var28_92, (SubLObject)NIL, var27)) {
                    final SubLObject var28 = module0158.f10011(var28_92, (SubLObject)NIL, var27);
                    SubLObject var29 = (SubLObject)NIL;
                    final SubLObject var30 = (SubLObject)NIL;
                    while (NIL == var29) {
                        final SubLObject var31 = module0052.f3695(var28, var30);
                        final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                        if (NIL != var32) {
                            SubLObject var33 = (SubLObject)NIL;
                            try {
                                var33 = module0158.f10316(var31, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                SubLObject var34_95 = (SubLObject)NIL;
                                final SubLObject var35_96 = (SubLObject)NIL;
                                while (NIL == var34_95) {
                                    final SubLObject var34 = module0052.f3695(var33, var35_96);
                                    final SubLObject var37_97 = (SubLObject)makeBoolean(!var35_96.eql(var34));
                                    if (NIL != var37_97) {
                                        f30894(var2, var34);
                                    }
                                    var34_95 = (SubLObject)makeBoolean(NIL == var37_97);
                                }
                            }
                            finally {
                                final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                    if (NIL != var33) {
                                        module0158.f10319(var33);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var37, var14);
                                }
                            }
                        }
                        var29 = (SubLObject)makeBoolean(NIL == var32);
                    }
                }
            }
            else {
                final SubLObject var27 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var28_92, (SubLObject)NIL, var27)) {
                    final SubLObject var28 = module0158.f10011(var28_92, (SubLObject)NIL, var27);
                    SubLObject var29 = (SubLObject)NIL;
                    final SubLObject var30 = (SubLObject)NIL;
                    while (NIL == var29) {
                        final SubLObject var31 = module0052.f3695(var28, var30);
                        final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                        if (NIL != var32) {
                            SubLObject var33 = (SubLObject)NIL;
                            try {
                                var33 = module0158.f10316(var31, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                SubLObject var34_96 = (SubLObject)NIL;
                                final SubLObject var35_97 = (SubLObject)NIL;
                                while (NIL == var34_96) {
                                    final SubLObject var34 = module0052.f3695(var33, var35_97);
                                    final SubLObject var37_98 = (SubLObject)makeBoolean(!var35_97.eql(var34));
                                    if (NIL != var37_98) {
                                        f30894(var2, var34);
                                    }
                                    var34_96 = (SubLObject)makeBoolean(NIL == var37_98);
                                }
                            }
                            finally {
                                final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                    if (NIL != var33) {
                                        module0158.f10319(var33);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var38, var14);
                                }
                            }
                        }
                        var29 = (SubLObject)makeBoolean(NIL == var32);
                    }
                }
            }
        }
        else if (var24.eql((SubLObject)$ic31$)) {
            final SubLObject var39 = module0158.f10299(var22);
            if (NIL != module0158.f10038(var39)) {
                final SubLObject var40 = (SubLObject)NIL;
                final SubLObject var41 = module0012.$g73$.currentBinding(var14);
                final SubLObject var42 = module0012.$g65$.currentBinding(var14);
                final SubLObject var43 = module0012.$g67$.currentBinding(var14);
                final SubLObject var44 = module0012.$g68$.currentBinding(var14);
                final SubLObject var45 = module0012.$g66$.currentBinding(var14);
                final SubLObject var46 = module0012.$g69$.currentBinding(var14);
                final SubLObject var47 = module0012.$g70$.currentBinding(var14);
                final SubLObject var48 = module0012.$silent_progressP$.currentBinding(var14);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var14);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var14), var14);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var14);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var14);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var14);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var14);
                    module0012.$g70$.bind((SubLObject)T, var14);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var40) ? module0012.$silent_progressP$.getDynamicValue(var14) : T), var14);
                    module0012.f474(var40);
                    final SubLObject var49 = module0158.f10039(var39);
                    SubLObject var50 = (SubLObject)NIL;
                    final SubLObject var51 = (SubLObject)NIL;
                    while (NIL == var50) {
                        final SubLObject var52 = module0052.f3695(var49, var51);
                        final SubLObject var53 = (SubLObject)makeBoolean(!var51.eql(var52));
                        if (NIL != var53) {
                            module0012.f476();
                            SubLObject var54 = (SubLObject)NIL;
                            try {
                                var54 = module0158.f10316(var52, (SubLObject)$ic30$, module0130.f8518((SubLObject)$ic28$), (SubLObject)NIL);
                                SubLObject var34_97 = (SubLObject)NIL;
                                final SubLObject var35_98 = (SubLObject)NIL;
                                while (NIL == var34_97) {
                                    final SubLObject var55 = module0052.f3695(var54, var35_98);
                                    final SubLObject var37_99 = (SubLObject)makeBoolean(!var35_98.eql(var55));
                                    if (NIL != var37_99) {
                                        f30894(var2, var55);
                                    }
                                    var34_97 = (SubLObject)makeBoolean(NIL == var37_99);
                                }
                            }
                            finally {
                                final SubLObject var43_108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                    if (NIL != var54) {
                                        module0158.f10319(var54);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var43_108, var14);
                                }
                            }
                        }
                        var50 = (SubLObject)makeBoolean(NIL == var53);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var48, var14);
                    module0012.$g70$.rebind(var47, var14);
                    module0012.$g69$.rebind(var46, var14);
                    module0012.$g66$.rebind(var45, var14);
                    module0012.$g68$.rebind(var44, var14);
                    module0012.$g67$.rebind(var43, var14);
                    module0012.$g65$.rebind(var42, var14);
                    module0012.$g73$.rebind(var41, var14);
                }
            }
        }
        else if (var24.eql((SubLObject)$ic32$)) {
            SubLObject var56 = module0218.f14453(module0158.f10301(var22), (SubLObject)UNPROVIDED);
            SubLObject var57 = (SubLObject)NIL;
            var57 = var56.first();
            while (NIL != var56) {
                if (NIL == module0130.f8518((SubLObject)$ic28$) || NIL != module0178.f11343(var57, module0130.f8518((SubLObject)$ic28$))) {
                    f30894(var2, var57);
                }
                var56 = var56.rest();
                var57 = var56.first();
            }
        }
        else {
            module0158.f10295(var22, var23);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30894(final SubLObject var2, final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var41)) {
            final SubLObject var43 = module0178.f11285(var41);
            if (NIL != module0202.f12734(var43, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED)) {
                final SubLObject var44 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
                var42.resetMultipleValues();
                final SubLObject var45 = module0202.f12798(var44);
                final SubLObject var46 = var42.secondMultipleValue();
                final SubLObject var47 = var42.thirdMultipleValue();
                final SubLObject var48 = var42.fourthMultipleValue();
                final SubLObject var49 = var42.fifthMultipleValue();
                var42.resetMultipleValues();
                var42.resetMultipleValues();
                final SubLObject var50 = module0202.f12797(module0178.f11285(var41));
                final SubLObject var51 = var42.secondMultipleValue();
                final SubLObject var52 = var42.thirdMultipleValue();
                final SubLObject var53 = var42.fourthMultipleValue();
                var42.resetMultipleValues();
                if (var47.eql(var51) && var49.equal(var53) && var48.equal(var52) && NIL != module0259.f16854(var46, var49, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
                    final SubLObject var54 = f30889();
                    final SubLObject var55 = module0191.f11990((SubLObject)$ic35$, (SubLObject)ConsesLow.list($ic10$, var46, var49), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var56 = (SubLObject)ConsesLow.list(var54, var55);
                    module0347.f23330(var41, (SubLObject)NIL, var56);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30895(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (NIL != f30884(var2, (SubLObject)T)) {
            final SubLObject var14 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
            return f30864(var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30896(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13333(var2);
        final SubLObject var15 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
        final SubLObject var16 = f30887(var14);
        final SubLObject var17 = Numbers.round(Numbers.sqrt(var16), (SubLObject)UNPROVIDED);
        return Numbers.max($g3573$.getGlobalValue(), var17);
    }
    
    public static SubLObject f30897(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13333(var2);
        final SubLObject var15 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
        final SubLObject var16 = f30887(var14);
        final SubLObject var17 = f30888(var15);
        if (var16.numLE(var17)) {
            final SubLObject var18 = $ic42$;
            if (NIL != module0158.f10010(var14, (SubLObject)ONE_INTEGER, var18)) {
                final SubLObject var19 = module0158.f10011(var14, (SubLObject)ONE_INTEGER, var18);
                SubLObject var20 = (SubLObject)NIL;
                final SubLObject var21 = (SubLObject)NIL;
                while (NIL == var20) {
                    final SubLObject var22 = module0052.f3695(var19, var21);
                    final SubLObject var23 = (SubLObject)makeBoolean(!var21.eql(var22));
                    if (NIL != var23) {
                        SubLObject var24 = (SubLObject)NIL;
                        try {
                            var24 = module0158.f10316(var22, (SubLObject)$ic30$, (SubLObject)$ic36$, (SubLObject)NIL);
                            SubLObject var34_110 = (SubLObject)NIL;
                            final SubLObject var35_111 = (SubLObject)NIL;
                            while (NIL == var34_110) {
                                final SubLObject var25 = module0052.f3695(var24, var35_111);
                                final SubLObject var37_112 = (SubLObject)makeBoolean(!var35_111.eql(var25));
                                if (NIL != var37_112) {
                                    f30898(var2, var25);
                                }
                                var34_110 = (SubLObject)makeBoolean(NIL == var37_112);
                            }
                        }
                        finally {
                            final SubLObject var26 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var24) {
                                    module0158.f10319(var24);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var26);
                            }
                        }
                    }
                    var20 = (SubLObject)makeBoolean(NIL == var23);
                }
            }
        }
        else {
            SubLObject var28;
            final SubLObject var27 = var28 = module0259.f16840(var15, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL != var28) {
                if (NIL != f30886(var29, (SubLObject)NIL)) {
                    final SubLObject var30 = $ic42$;
                    if (NIL != module0158.f10010(var29, (SubLObject)THREE_INTEGER, var30)) {
                        final SubLObject var31 = module0158.f10011(var29, (SubLObject)THREE_INTEGER, var30);
                        SubLObject var32 = (SubLObject)NIL;
                        final SubLObject var33 = (SubLObject)NIL;
                        while (NIL == var32) {
                            final SubLObject var34 = module0052.f3695(var31, var33);
                            final SubLObject var35 = (SubLObject)makeBoolean(!var33.eql(var34));
                            if (NIL != var35) {
                                SubLObject var36 = (SubLObject)NIL;
                                try {
                                    var36 = module0158.f10316(var34, (SubLObject)$ic30$, (SubLObject)$ic36$, (SubLObject)NIL);
                                    SubLObject var34_111 = (SubLObject)NIL;
                                    final SubLObject var35_112 = (SubLObject)NIL;
                                    while (NIL == var34_111) {
                                        final SubLObject var37 = module0052.f3695(var36, var35_112);
                                        final SubLObject var37_113 = (SubLObject)makeBoolean(!var35_112.eql(var37));
                                        if (NIL != var37_113) {
                                            f30899(var2, var37);
                                        }
                                        var34_111 = (SubLObject)makeBoolean(NIL == var37_113);
                                    }
                                }
                                finally {
                                    final SubLObject var38 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var36) {
                                            module0158.f10319(var36);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var38);
                                    }
                                }
                            }
                            var32 = (SubLObject)makeBoolean(NIL == var35);
                        }
                    }
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30898(final SubLObject var2, final SubLObject var41) {
        final SubLObject var42 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0178.f11336(var41);
        if (NIL == module0259.f16854(var42, var43, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f30900(var2, var41);
    }
    
    public static SubLObject f30899(final SubLObject var2, final SubLObject var41) {
        final SubLObject var42 = module0205.f13333(var2);
        if (!var42.eql(module0178.f11334(var41))) {
            return (SubLObject)NIL;
        }
        return f30900(var2, var41);
    }
    
    public static SubLObject f30900(final SubLObject var2, final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var41)) {
            final SubLObject var43 = module0205.f13333(var2);
            final SubLObject var44 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
            final SubLObject var45 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
            final SubLObject var46 = module0178.f11335(var41);
            final SubLObject var47 = module0178.f11336(var41);
            final SubLObject var48 = f30890(var45, var43, var46, var47);
            if (NIL != module0228.f15212(var48)) {
                var42.resetMultipleValues();
                final SubLObject var49 = module0235.f15474(var44, var48, (SubLObject)T, (SubLObject)T);
                final SubLObject var50 = var42.secondMultipleValue();
                var42.resetMultipleValues();
                if (NIL != var49) {
                    final SubLObject var51 = f30889();
                    final SubLObject var52 = module0191.f11990((SubLObject)$ic35$, (SubLObject)ConsesLow.list($ic10$, var45, var47), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var53 = ConsesLow.append((SubLObject)ConsesLow.list(var51, var52), var50);
                    module0347.f23330(var41, var49, var53);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30901() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30864", "S#34114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30865", "S#34115", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30867", "S#34116", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30868", "S#34117", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30869", "S#34118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30870", "S#34119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30866", "S#34120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30871", "S#34121", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30872", "S#34122", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30873", "S#34123", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30874", "S#34124", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30875", "S#34125", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30876", "S#34126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30877", "S#34112", 1, 1, false);
        new $f30877$UnaryFunction();
        new $f30877$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30878", "S#34127", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30879", "S#34128", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30880", "S#34129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30881", "S#34130", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30882", "S#34131", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30883", "S#34132", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30885", "S#34133", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30886", "S#34134", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30887", "S#34135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30888", "S#34136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30884", "S#34137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30889", "S#34138", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30890", "S#34139", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30891", "S#34140", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30892", "S#34141", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30893", "S#34142", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30894", "S#34143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30895", "S#34113", 1, 1, false);
        new $f30895$UnaryFunction();
        new $f30895$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30896", "S#34144", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30897", "S#34145", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30898", "S#34146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30899", "S#34147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0446", "f30900", "S#34148", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30902() {
        $g3564$ = SubLFiles.deflexical("S#34149", (SubLObject)TWO_INTEGER);
        $g3565$ = SubLFiles.deflexical("S#34150", module0202.f12761((SubLObject)$ic12$));
        $g3566$ = SubLFiles.deflexical("S#34151", (NIL != Symbols.boundp((SubLObject)$ic13$)) ? $g3566$.getGlobalValue() : $ic14$);
        $g3567$ = SubLFiles.deflexical("S#34152", module0018.$g661$.getGlobalValue());
        $g3568$ = SubLFiles.deflexical("S#34153", module0018.$g661$.getGlobalValue());
        $g3569$ = SubLFiles.deflexical("S#34154", (SubLObject)TWO_INTEGER);
        $g3570$ = SubLFiles.deflexical("S#34155", module0202.f12761((SubLObject)$ic44$));
        $g3571$ = SubLFiles.deflexical("S#34156", (NIL != Symbols.boundp((SubLObject)$ic45$)) ? $g3571$.getGlobalValue() : $ic14$);
        $g3572$ = SubLFiles.deflexical("S#34157", module0018.$g661$.getGlobalValue());
        $g3573$ = SubLFiles.deflexical("S#34158", module0018.$g661$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30903() {
        module0358.f23730((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic13$);
        module0132.f8593((SubLObject)$ic13$, $ic9$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0340.f22941((SubLObject)$ic37$, (SubLObject)$ic38$);
        module0358.f23730((SubLObject)$ic39$, (SubLObject)$ic40$);
        module0003.f57((SubLObject)$ic45$);
        module0132.f8593((SubLObject)$ic45$, $ic42$);
        module0340.f22941((SubLObject)$ic46$, (SubLObject)$ic47$);
        module0340.f22941((SubLObject)$ic53$, (SubLObject)$ic54$);
        module0340.f22941((SubLObject)$ic55$, (SubLObject)$ic56$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30901();
    }
    
    public void initializeVariables() {
        f30902();
    }
    
    public void runTopLevelForms() {
        f30903();
    }
    
    static {
        me = (SubLFile)new module0446();
        $g3564$ = null;
        $g3565$ = null;
        $g3566$ = null;
        $g3567$ = null;
        $g3568$ = null;
        $g3569$ = null;
        $g3570$ = null;
        $g3571$ = null;
        $g3572$ = null;
        $g3573$ = null;
        $ic0$ = makeKeyword("RELATION-ALL-EXISTS-POS");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#34115", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"));
        $ic3$ = makeKeyword("PREFERRED");
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")), (SubLObject)makeKeyword("FULLY-BOUND")));
        $ic5$ = makeKeyword("DISPREFERRED");
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"));
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"));
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExists"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn"));
        $ic12$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAllExists")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?INDEP-COL"), (SubLObject)makeSymbol("?DEP-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?TERM"), (SubLObject)makeSymbol("?INDEP-COL"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?TERM"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")), (SubLObject)makeSymbol("?TERM"), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?INDEP-COL"), (SubLObject)makeSymbol("?DEP-COL"))));
        $ic13$ = makeSymbol("S#34151", "CYC");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic15$ = makeKeyword("CODE");
        $ic16$ = makeKeyword("TRUE-MON");
        $ic17$ = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-PRUNE");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TREE-FIND"), constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("S#34123", "CYC"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")));
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34159", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34160", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#23529", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#23530", "CYC"))));
        $ic21$ = makeSymbol("S#23530", "CYC");
        $ic22$ = makeSymbol("S#23529", "CYC");
        $ic23$ = makeSymbol("S#34160", "CYC");
        $ic24$ = makeSymbol("S#34159", "CYC");
        $ic25$ = makeSymbol("S#12141", "CYC");
        $ic26$ = makeSymbol("S#717", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("ANYTHING"));
        $ic28$ = makeKeyword("POS");
        $ic29$ = makeKeyword("GAF-ARG");
        $ic30$ = makeKeyword("GAF");
        $ic31$ = makeKeyword("PREDICATE-EXTENT");
        $ic32$ = makeKeyword("OVERLAP");
        $ic33$ = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-CHECK");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("S#34124", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34152", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34125", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object>\n  (#$RelationAllExistsFn <object> <predicate> <indep-col> <dep-col>)) \nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>)\nand  (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$grandfathers #$AbrahamLincoln \n  (#$RelationAllExistsFn #$AbrahamLincoln #$grandfathers #$Animal #$MaleAnimal))\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)") });
        $ic35$ = makeKeyword("ISA");
        $ic36$ = makeKeyword("TRUE");
        $ic37$ = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY");
        $ic38$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"))))), makeKeyword("REQUIRED"), makeSymbol("S#34112", "CYC"), makeKeyword("COST"), makeSymbol("S#34127", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34128", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>)\nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>) \nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$grandfathers #$AbrahamLincoln ?RELATIVE)\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)") });
        $ic39$ = makeKeyword("RELATION-EXISTS-ALL-POS");
        $ic40$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#34132", "CYC"));
        $ic41$ = ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("relationExistsAll"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn"));
        $ic44$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationExistsAll")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?DEP-COL"), (SubLObject)makeSymbol("?INDEP-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?TERM"), (SubLObject)makeSymbol("?INDEP-COL"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PRED"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")), (SubLObject)makeSymbol("?TERM"), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?DEP-COL"), (SubLObject)makeSymbol("?INDEP-COL")), (SubLObject)makeSymbol("?TERM")));
        $ic45$ = makeSymbol("S#34156", "CYC");
        $ic46$ = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-PRUNE");
        $ic47$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TREE-FIND"), constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("S#34140", "CYC"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });
        $ic48$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("ANYTHING"));
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#717", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34161", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34162", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#23530", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#23529", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")));
        $ic50$ = makeSymbol("S#34162", "CYC");
        $ic51$ = makeSymbol("S#34161", "CYC");
        $ic52$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT")));
        $ic53$ = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-CHECK");
        $ic54$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34141", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34157", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34142", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> (#$RelationExistsAllFn <object> <predicate> <dep-col> <indep-col>) <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$citizens (#$RelationExistsAllFn #$AbrahamLincoln #$citizens #$Country #$Person)\n  #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)") });
        $ic55$ = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-UNIFY");
        $ic56$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("S#34113", "CYC"), makeKeyword("COST"), makeSymbol("S#34144", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34145", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$citizens ?WHERE #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)") });
    }
    
    public static final class $f30877$UnaryFunction extends UnaryFunction
    {
        public $f30877$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34112"));
        }
        
        public SubLObject processItem(final SubLObject var20) {
            return f30877(var20, (SubLObject)$f30877$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30877$BinaryFunction extends BinaryFunction
    {
        public $f30877$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34112"));
        }
        
        public SubLObject processItem(final SubLObject var20, final SubLObject var21) {
            return f30877(var20, var21);
        }
    }
    
    public static final class $f30895$UnaryFunction extends UnaryFunction
    {
        public $f30895$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34113"));
        }
        
        public SubLObject processItem(final SubLObject var20) {
            return f30895(var20, (SubLObject)$f30895$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30895$BinaryFunction extends BinaryFunction
    {
        public $f30895$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34113"));
        }
        
        public SubLObject processItem(final SubLObject var20, final SubLObject var21) {
            return f30895(var20, var21);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 787 ms
	
	Decompiled with Procyon 0.5.32.
*/