package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0461 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0461";
    public static final String myFingerPrint = "516ce03ad96318deea5541ddcf5c1a97c50b5401cd40ee0448406a3f476b1110";
    private static SubLSymbol $g3640$;
    private static SubLSymbol $g3641$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    
    public static SubLObject f31403(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0018.$g61$.getDynamicValue(var4)) {
            return (SubLObject)$ic5$;
        }
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        SubLObject var7;
        final SubLObject var6 = var7 = module0193.f12102(var5);
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (NIL != module0004.f104(var8, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)$ic5$;
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return (SubLObject)$ic6$;
    }
    
    public static SubLObject f31404(final SubLObject var9, final SubLObject var5) {
        final SubLObject var10 = (SubLObject)ConsesLow.list($ic0$, var9, var5);
        return module0191.f11990((SubLObject)$ic8$, var10, module0132.$g1558$.getGlobalValue(), (SubLObject)$ic9$);
    }
    
    public static SubLObject f31405(final SubLObject var11, final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != module0202.f12872(var11) && NIL != module0202.f12872(var12) && module0205.f13387(var11, (SubLObject)UNPROVIDED).equal(module0205.f13387(var12, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f31406(final SubLObject var11, final SubLObject var12) {
        return (SubLObject)makeBoolean(!var11.equal(var12) && NIL != f31405(var11, var12));
    }
    
    public static SubLObject f31407(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        return module0217.f14221(module0205.f13387(var1, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic0$, module0132.$g1558$.getGlobalValue());
    }
    
    public static SubLObject f31408(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0228.f15206(var15);
        if (NIL != var17) {
            final SubLObject var18 = module0178.f11331(var17, (SubLObject)TWO_INTEGER);
            var14.resetMultipleValues();
            final SubLObject var19 = module0235.f15474(var16, var18, (SubLObject)T, (SubLObject)T);
            final SubLObject var20 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var19) {
                module0347.f23330(var17, var19, var20);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31409(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        return module0234.f15436(var2, var3);
    }
    
    public static SubLObject f31410(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13364(var14);
        final SubLObject var16 = module0172.f10921(var14);
        if (NIL == var16 && NIL != f31411(var15) && NIL != module0228.f15212(var14)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31412(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        var14.resetMultipleValues();
        final SubLObject var17 = module0235.f15474(var15, var16, (SubLObject)T, (SubLObject)T);
        final SubLObject var18 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        if (NIL != var17) {
            final SubLObject var19 = f31404(var16, var16);
            module0347.f23330(var19, var17, var18);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31411(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0435.f30628() && NIL != ((NIL != module0131.f8587()) ? makeBoolean(NIL != module0018.$g61$.getDynamicValue(var22) || NIL != module0018.$g622$.getDynamicValue(var22) || NIL != module0285.f19013(var21, (SubLObject)UNPROVIDED)) : makeBoolean(NIL == module0131.$g60$.getDynamicValue(var22))));
    }
    
    public static SubLObject f31413(final SubLObject var1) {
        final SubLObject var2 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0205.f13364(var2);
        if (NIL == f31411(var3)) {
            return (SubLObject)$ic16$;
        }
        if (NIL != module0193.f12105(var2) && NIL != module0172.f10921(var2)) {
            return (SubLObject)$ic16$;
        }
        return (SubLObject)$ic17$;
    }
    
    public static SubLObject f31414(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0193.f12105(var14)) {
            return (SubLObject)((NIL != module0172.f10921(var14)) ? ONE_INTEGER : ZERO_INTEGER);
        }
        return module0217.f14384(var14, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31415(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0217.f14379(module0205.f13388(var1, (SubLObject)UNPROVIDED), (SubLObject)NIL);
        final SubLObject var17;
        final SubLObject var16 = var17 = module0158.f10306(var15);
        if (var17.eql((SubLObject)$ic18$)) {
            var14.resetMultipleValues();
            final SubLObject var18 = module0158.f10309(var15);
            final SubLObject var19 = var14.secondMultipleValue();
            final SubLObject var20 = var14.thirdMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var19) {
                if (NIL != var20) {
                    if (NIL != module0158.f10054(var18, var19, var20)) {
                        final SubLObject var21 = module0158.f10055(var18, var19, var20);
                        SubLObject var22 = (SubLObject)NIL;
                        final SubLObject var23 = (SubLObject)NIL;
                        while (NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                            if (NIL != var25) {
                                SubLObject var26 = (SubLObject)NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)$ic19$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var30_35 = (SubLObject)NIL;
                                    final SubLObject var31_36 = (SubLObject)NIL;
                                    while (NIL == var30_35) {
                                        final SubLObject var27 = module0052.f3695(var26, var31_36);
                                        final SubLObject var33_38 = (SubLObject)makeBoolean(!var31_36.eql(var27));
                                        if (NIL != var33_38) {
                                            module0436.f30642(var27, var1);
                                        }
                                        var30_35 = (SubLObject)makeBoolean(NIL == var33_38);
                                    }
                                }
                                finally {
                                    final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                        if (NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var28, var14);
                                    }
                                }
                            }
                            var22 = (SubLObject)makeBoolean(NIL == var25);
                        }
                    }
                }
                else if (NIL != module0158.f10054(var18, var19, (SubLObject)NIL)) {
                    final SubLObject var21 = module0158.f10055(var18, var19, (SubLObject)NIL);
                    SubLObject var22 = (SubLObject)NIL;
                    final SubLObject var23 = (SubLObject)NIL;
                    while (NIL == var22) {
                        final SubLObject var24 = module0052.f3695(var21, var23);
                        final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                        if (NIL != var25) {
                            SubLObject var26 = (SubLObject)NIL;
                            try {
                                var26 = module0158.f10316(var24, (SubLObject)$ic19$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var30_36 = (SubLObject)NIL;
                                final SubLObject var31_37 = (SubLObject)NIL;
                                while (NIL == var30_36) {
                                    final SubLObject var27 = module0052.f3695(var26, var31_37);
                                    final SubLObject var33_39 = (SubLObject)makeBoolean(!var31_37.eql(var27));
                                    if (NIL != var33_39) {
                                        module0436.f30642(var27, var1);
                                    }
                                    var30_36 = (SubLObject)makeBoolean(NIL == var33_39);
                                }
                            }
                            finally {
                                final SubLObject var29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                    if (NIL != var26) {
                                        module0158.f10319(var26);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var29, var14);
                                }
                            }
                        }
                        var22 = (SubLObject)makeBoolean(NIL == var25);
                    }
                }
            }
            else if (NIL != var20) {
                if (NIL != module0158.f10054(var18, (SubLObject)NIL, var20)) {
                    final SubLObject var21 = module0158.f10055(var18, (SubLObject)NIL, var20);
                    SubLObject var22 = (SubLObject)NIL;
                    final SubLObject var23 = (SubLObject)NIL;
                    while (NIL == var22) {
                        final SubLObject var24 = module0052.f3695(var21, var23);
                        final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                        if (NIL != var25) {
                            SubLObject var26 = (SubLObject)NIL;
                            try {
                                var26 = module0158.f10316(var24, (SubLObject)$ic19$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var30_37 = (SubLObject)NIL;
                                final SubLObject var31_38 = (SubLObject)NIL;
                                while (NIL == var30_37) {
                                    final SubLObject var27 = module0052.f3695(var26, var31_38);
                                    final SubLObject var33_40 = (SubLObject)makeBoolean(!var31_38.eql(var27));
                                    if (NIL != var33_40) {
                                        module0436.f30642(var27, var1);
                                    }
                                    var30_37 = (SubLObject)makeBoolean(NIL == var33_40);
                                }
                            }
                            finally {
                                final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                    if (NIL != var26) {
                                        module0158.f10319(var26);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var30, var14);
                                }
                            }
                        }
                        var22 = (SubLObject)makeBoolean(NIL == var25);
                    }
                }
            }
            else if (NIL != module0158.f10054(var18, (SubLObject)NIL, (SubLObject)NIL)) {
                final SubLObject var21 = module0158.f10055(var18, (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var22 = (SubLObject)NIL;
                final SubLObject var23 = (SubLObject)NIL;
                while (NIL == var22) {
                    final SubLObject var24 = module0052.f3695(var21, var23);
                    final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                    if (NIL != var25) {
                        SubLObject var26 = (SubLObject)NIL;
                        try {
                            var26 = module0158.f10316(var24, (SubLObject)$ic19$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var30_38 = (SubLObject)NIL;
                            final SubLObject var31_39 = (SubLObject)NIL;
                            while (NIL == var30_38) {
                                final SubLObject var27 = module0052.f3695(var26, var31_39);
                                final SubLObject var33_41 = (SubLObject)makeBoolean(!var31_39.eql(var27));
                                if (NIL != var33_41) {
                                    module0436.f30642(var27, var1);
                                }
                                var30_38 = (SubLObject)makeBoolean(NIL == var33_41);
                            }
                        }
                        finally {
                            final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                if (NIL != var26) {
                                    module0158.f10319(var26);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var31, var14);
                            }
                        }
                    }
                    var22 = (SubLObject)makeBoolean(NIL == var25);
                }
            }
        }
        else if (var17.eql((SubLObject)$ic20$)) {
            if (NIL != module0158.f10078(module0158.f10311(var15))) {
                final SubLObject var32 = module0158.f10080(module0158.f10311(var15));
                SubLObject var33 = (SubLObject)NIL;
                try {
                    var33 = module0158.f10316(var32, (SubLObject)$ic19$, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var34 = (SubLObject)NIL;
                    final SubLObject var35 = (SubLObject)NIL;
                    while (NIL == var34) {
                        final SubLObject var36 = module0052.f3695(var33, var35);
                        final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                        if (NIL != var37) {
                            module0436.f30642(var36, var1);
                        }
                        var34 = (SubLObject)makeBoolean(NIL == var37);
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
        }
        else if (var17.eql((SubLObject)$ic21$)) {
            SubLObject var39 = module0218.f14453(module0158.f10313(var15), (SubLObject)UNPROVIDED);
            SubLObject var40 = (SubLObject)NIL;
            var40 = var39.first();
            while (NIL != var39) {
                module0436.f30642(var40, var1);
                var39 = var39.rest();
                var40 = var39.first();
            }
        }
        else {
            module0158.f10307(var15, var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31416(final SubLObject var1, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        var14.resetMultipleValues();
        final SubLObject var17 = module0235.f15474(var15, var16, (SubLObject)T, (SubLObject)T);
        final SubLObject var18 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        if (NIL != var17) {
            final SubLObject var19 = module0233.f15361(var17, var15);
            final SubLObject var20 = module0233.f15361(var17, var16);
            final SubLObject var21 = f31404(var19, var20);
            module0347.f23330(var21, var17, var18);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31417() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31403", "S#34708", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31404", "S#34709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31405", "S#34710", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31406", "S#34711", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31407", "S#34712", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31408", "S#29822", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31409", "S#34707", 1, 0, false);
        new $f31409$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31410", "S#34713", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31412", "S#34714", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31411", "S#34111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31413", "S#34715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31414", "S#34716", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31415", "S#29824", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0461", "f31416", "S#34717", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31418() {
        $g3640$ = SubLFiles.defparameter("S#34718", (SubLObject)ONE_INTEGER);
        $g3641$ = SubLFiles.defparameter("S#34719", (SubLObject)ONE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31419() {
        module0340.f22938($ic0$);
        module0340.f22946($ic0$, (SubLObject)$ic1$);
        module0340.f22946($ic0$, (SubLObject)$ic2$);
        module0358.f23730((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0012.f419((SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0340.f22941((SubLObject)$ic12$, (SubLObject)$ic13$);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31417();
    }
    
    public void initializeVariables() {
        f31418();
    }
    
    public void runTopLevelForms() {
        f31419();
    }
    
    static {
        me = (SubLFile)new module0461();
        $g3640$ = null;
        $g3641$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic1$ = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $ic2$ = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $ic3$ = makeKeyword("NAT-LOOKUP-POS");
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#34111", "CYC"))), (SubLObject)makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#34708", "CYC"));
        $ic5$ = makeKeyword("DISALLOWED");
        $ic6$ = makeKeyword("PREFERRED");
        $ic7$ = makeSymbol("S#34708", "CYC");
        $ic8$ = makeKeyword("EQUALITY");
        $ic9$ = makeKeyword("TRUE-MON");
        $ic10$ = makeKeyword("REMOVAL-NAT-FORMULA");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)makeKeyword("NART"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("S#34712", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#29822", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <reified NAT> <whatever>)\n    using the GAF indexing on <reified NAT>"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit (#$JuvenileFn #$Dog) (#$JuvenileFn ?WHAT))") });
        $ic12$ = makeKeyword("REMOVAL-TERM-OF-UNIT-FAIL");
        $ic13$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#34286", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("ATOM")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("NART")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("VARIABLE"))), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#34707", "CYC")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <atom> <whatever>)\n    in all cases where <atom> is not a reified NAT or variable, should immediately fail.\n\n    (#$termOfUnit <arg1> <arg2>)\n    in all cases where ARG1 and ARG2 could not possibly unify, should immediately fail."), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit #$Dog (#$JuvenileFn ?WHAT))\n    (#$termOfUnit 1 ?WHAT)\n    (#$termOfUnit (#$IdentityFn #$Dog) (#$JuvenileFn ?WHAT))") });
        $ic14$ = makeKeyword("REMOVAL-SKOLEMIZE-CREATE");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("S#34713", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34718", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34714", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <variable> (<fort> . <fully bound>))"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit ?NAT (#$JuvenileFn #$Cougar))") });
        $ic16$ = makeKeyword("COMPLETE");
        $ic17$ = makeKeyword("GROSSLY-INCOMPLETE");
        $ic18$ = makeKeyword("NART-ARG");
        $ic19$ = makeKeyword("GAF");
        $ic20$ = makeKeyword("FUNCTION-EXTENT");
        $ic21$ = makeKeyword("OVERLAP");
        $ic22$ = makeKeyword("REMOVAL-NAT-LOOKUP");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("S#34716", "CYC"), makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34715", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("S#29824", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <not fully-bound> (<fort> . <whatever>)) \n    using the function-argument indexing on <fort>"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit ?NAT (#$JuvenileFn ?COL))") });
        $ic24$ = makeKeyword("REMOVAL-NAT-UNIFY");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34719", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34717", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit (<fully bound> . <fully bound>) (<whatever . <whatever>))\n    via unification"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit (#$JuvenileFn #$Dog) (#$JuvenileFn ?WHAT))") });
    }
    
    public static final class $f31409$UnaryFunction extends UnaryFunction
    {
        public $f31409$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34707"));
        }
        
        public SubLObject processItem(final SubLObject var20) {
            return f31409(var20);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 310 ms
	
	Decompiled with Procyon 0.5.32.
*/