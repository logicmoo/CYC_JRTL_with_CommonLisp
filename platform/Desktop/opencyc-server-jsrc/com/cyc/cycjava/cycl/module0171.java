package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0171 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0171";
    public static final String myFingerPrint = "05a5fea799fc70ae4f0d7bc326451e32d5a183503a87e5355d76ea8ff9eb5fca";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    
    public static SubLObject f10898(final SubLObject var1, final SubLObject var2) {
        return module0170.f10884(var1, var2);
    }
    
    public static SubLObject f10899(final SubLObject var3) {
        return module0170.f10881(module0167.f10803(var3));
    }
    
    public static SubLObject f10900(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12659(var2)) {
            SubLObject var4 = (SubLObject)NIL;
            final SubLObject var5 = module0217.f14379(var2, (SubLObject)NIL);
            final SubLObject var7;
            final SubLObject var6 = var7 = module0158.f10306(var5);
            if (var7.eql((SubLObject)$ic0$)) {
                var3.resetMultipleValues();
                final SubLObject var8 = module0158.f10309(var5);
                final SubLObject var9 = var3.secondMultipleValue();
                final SubLObject var10 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                if (NIL != var9) {
                    if (NIL != var10) {
                        if (NIL != module0158.f10054(var8, var9, var10)) {
                            final SubLObject var11 = module0158.f10055(var8, var9, var10);
                            SubLObject var12 = var4;
                            final SubLObject var13 = (SubLObject)NIL;
                            while (NIL == var12) {
                                final SubLObject var14 = module0052.f3695(var11, var13);
                                final SubLObject var15 = (SubLObject)makeBoolean(!var13.eql(var14));
                                if (NIL != var15) {
                                    SubLObject var16 = (SubLObject)NIL;
                                    try {
                                        var16 = module0158.f10316(var14, (SubLObject)$ic1$, (SubLObject)NIL, (SubLObject)NIL);
                                        SubLObject var13_18 = var4;
                                        final SubLObject var14_19 = (SubLObject)NIL;
                                        while (NIL == var13_18) {
                                            final SubLObject var17 = module0052.f3695(var16, var14_19);
                                            final SubLObject var16_21 = (SubLObject)makeBoolean(!var14_19.eql(var17));
                                            if (NIL != var16_21 && NIL != assertion_handles_oc.f11041(var17, (SubLObject)UNPROVIDED)) {
                                                final SubLObject var18 = module0178.f11335(var17);
                                                if (NIL != module0202.f12659(var18) && NIL != Functions.funcall(module0018.$g580$.getDynamicValue(var3), var18, var2)) {
                                                    var4 = module0178.f11334(var17);
                                                }
                                            }
                                            var13_18 = (SubLObject)makeBoolean(NIL == var16_21 || NIL != var4);
                                        }
                                    }
                                    finally {
                                        final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                            if (NIL != var16) {
                                                module0158.f10319(var16);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var19, var3);
                                        }
                                    }
                                }
                                var12 = (SubLObject)makeBoolean(NIL == var15 || NIL != var4);
                            }
                        }
                    }
                    else if (NIL != module0158.f10054(var8, var9, (SubLObject)NIL)) {
                        final SubLObject var11 = module0158.f10055(var8, var9, (SubLObject)NIL);
                        SubLObject var12 = var4;
                        final SubLObject var13 = (SubLObject)NIL;
                        while (NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)makeBoolean(!var13.eql(var14));
                            if (NIL != var15) {
                                SubLObject var16 = (SubLObject)NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)$ic1$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var13_19 = var4;
                                    final SubLObject var14_20 = (SubLObject)NIL;
                                    while (NIL == var13_19) {
                                        final SubLObject var17 = module0052.f3695(var16, var14_20);
                                        final SubLObject var16_22 = (SubLObject)makeBoolean(!var14_20.eql(var17));
                                        if (NIL != var16_22 && NIL != assertion_handles_oc.f11041(var17, (SubLObject)UNPROVIDED)) {
                                            final SubLObject var18 = module0178.f11335(var17);
                                            if (NIL != module0202.f12659(var18) && NIL != Functions.funcall(module0018.$g580$.getDynamicValue(var3), var18, var2)) {
                                                var4 = module0178.f11334(var17);
                                            }
                                        }
                                        var13_19 = (SubLObject)makeBoolean(NIL == var16_22 || NIL != var4);
                                    }
                                }
                                finally {
                                    final SubLObject var20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var20, var3);
                                    }
                                }
                            }
                            var12 = (SubLObject)makeBoolean(NIL == var15 || NIL != var4);
                        }
                    }
                }
                else if (NIL != var10) {
                    if (NIL != module0158.f10054(var8, (SubLObject)NIL, var10)) {
                        final SubLObject var11 = module0158.f10055(var8, (SubLObject)NIL, var10);
                        SubLObject var12 = var4;
                        final SubLObject var13 = (SubLObject)NIL;
                        while (NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)makeBoolean(!var13.eql(var14));
                            if (NIL != var15) {
                                SubLObject var16 = (SubLObject)NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)$ic1$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var13_20 = var4;
                                    final SubLObject var14_21 = (SubLObject)NIL;
                                    while (NIL == var13_20) {
                                        final SubLObject var17 = module0052.f3695(var16, var14_21);
                                        final SubLObject var16_23 = (SubLObject)makeBoolean(!var14_21.eql(var17));
                                        if (NIL != var16_23 && NIL != assertion_handles_oc.f11041(var17, (SubLObject)UNPROVIDED)) {
                                            final SubLObject var18 = module0178.f11335(var17);
                                            if (NIL != module0202.f12659(var18) && NIL != Functions.funcall(module0018.$g580$.getDynamicValue(var3), var18, var2)) {
                                                var4 = module0178.f11334(var17);
                                            }
                                        }
                                        var13_20 = (SubLObject)makeBoolean(NIL == var16_23 || NIL != var4);
                                    }
                                }
                                finally {
                                    final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21, var3);
                                    }
                                }
                            }
                            var12 = (SubLObject)makeBoolean(NIL == var15 || NIL != var4);
                        }
                    }
                }
                else if (NIL != module0158.f10054(var8, (SubLObject)NIL, (SubLObject)NIL)) {
                    final SubLObject var11 = module0158.f10055(var8, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var12 = var4;
                    final SubLObject var13 = (SubLObject)NIL;
                    while (NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)makeBoolean(!var13.eql(var14));
                        if (NIL != var15) {
                            SubLObject var16 = (SubLObject)NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)$ic1$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var13_21 = var4;
                                final SubLObject var14_22 = (SubLObject)NIL;
                                while (NIL == var13_21) {
                                    final SubLObject var17 = module0052.f3695(var16, var14_22);
                                    final SubLObject var16_24 = (SubLObject)makeBoolean(!var14_22.eql(var17));
                                    if (NIL != var16_24 && NIL != assertion_handles_oc.f11041(var17, (SubLObject)UNPROVIDED)) {
                                        final SubLObject var18 = module0178.f11335(var17);
                                        if (NIL != module0202.f12659(var18) && NIL != Functions.funcall(module0018.$g580$.getDynamicValue(var3), var18, var2)) {
                                            var4 = module0178.f11334(var17);
                                        }
                                    }
                                    var13_21 = (SubLObject)makeBoolean(NIL == var16_24 || NIL != var4);
                                }
                            }
                            finally {
                                final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                    if (NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var22, var3);
                                }
                            }
                        }
                        var12 = (SubLObject)makeBoolean(NIL == var15 || NIL != var4);
                    }
                }
            }
            else if (var7.eql((SubLObject)$ic2$)) {
                if (NIL != module0158.f10078(module0158.f10311(var5))) {
                    final SubLObject var23 = module0158.f10080(module0158.f10311(var5));
                    SubLObject var24 = (SubLObject)NIL;
                    try {
                        var24 = module0158.f10316(var23, (SubLObject)$ic1$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var25 = var4;
                        final SubLObject var26 = (SubLObject)NIL;
                        while (NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)makeBoolean(!var26.eql(var27));
                            if (NIL != var28 && NIL != assertion_handles_oc.f11041(var27, (SubLObject)UNPROVIDED)) {
                                final SubLObject var29 = module0178.f11335(var27);
                                if (NIL != module0202.f12659(var29) && NIL != Functions.funcall(module0018.$g580$.getDynamicValue(var3), var29, var2)) {
                                    var4 = module0178.f11334(var27);
                                }
                            }
                            var25 = (SubLObject)makeBoolean(NIL == var28 || NIL != var4);
                        }
                    }
                    finally {
                        final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                            if (NIL != var24) {
                                module0158.f10319(var24);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var30, var3);
                        }
                    }
                }
            }
            else if (var7.eql((SubLObject)$ic3$)) {
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                for (var31 = (SubLObject)NIL, var31 = module0218.f14453(module0158.f10313(var5), (SubLObject)UNPROVIDED); NIL == var4 && NIL != var31; var31 = var31.rest()) {
                    var32 = var31.first();
                    if (NIL != assertion_handles_oc.f11041(var32, (SubLObject)UNPROVIDED)) {
                        var33 = module0178.f11335(var32);
                        if (NIL != module0202.f12659(var33) && NIL != Functions.funcall(module0018.$g580$.getDynamicValue(var3), var33, var2)) {
                            var4 = module0178.f11334(var32);
                        }
                    }
                }
            }
            else {
                module0158.f10307(var5, var6);
            }
            return var4;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10901(final SubLObject var3) {
        assert NIL != module0167.f10813(var3) : var3;
        return module0169.f10855(module0167.f10803(var3));
    }
    
    public static SubLObject f10902(final SubLObject var3) {
        assert NIL != module0167.f10813(var3) : var3;
        module0425.f30056(var3);
        return module0169.f10856(module0167.f10803(var3));
    }
    
    public static SubLObject f10903(final SubLObject var2) {
        SubLObject var3 = f10900(var2);
        if (NIL != var3) {
            return module0167.f10803(var3);
        }
        final SubLObject var4 = module0167.f10807();
        var3 = module0167.f10828(var4);
        f10904(var3, var4, var2);
        return var4;
    }
    
    public static SubLObject f10904(final SubLObject var3, final SubLObject var35, final SubLObject var2) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        module0170.f10884(var35, var2);
        final SubLObject var37 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var36);
        try {
            hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)NIL, var36);
            f10905(var3, var2);
        }
        finally {
            hl_interface_infrastructure_oc.$g1483$.rebind(var37, var36);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10906(final SubLObject var35) {
        return module0167.f10828(var35);
    }
    
    public static SubLObject f10905(final SubLObject var3, final SubLObject var2) {
        assert NIL != module0167.f10813(var3) : var3;
        assert NIL != module0228.f15225(var2) : var2;
        final SubLObject var4 = module0202.f12768($ic6$, var3, var2);
        final SubLObject var5 = module0204.f13033(var4);
        final SubLObject var6 = (SubLObject)$ic7$;
        final SubLObject var7 = assertions_interface_oc.f11057(var5, module0132.$g1558$.getGlobalValue(), (SubLObject)NIL, var6, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)NIL);
        return var3;
    }
    
    public static SubLObject f10907(final SubLObject var3, final SubLObject var39) {
        assert NIL != module0167.f10813(var3) : var3;
        assert NIL != module0228.f15225(var39) : var39;
        final SubLObject var40 = module0228.f15206(var3);
        final SubLObject var41 = module0204.f13033(module0202.f12768($ic6$, var3, var39));
        assertions_low_oc.f11266(var40, var41);
        return var3;
    }
    
    public static SubLObject f10908() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0170.f10873(module0167.f10796(), (SubLObject)NIL);
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        final SubLObject var6 = module0217.f14247($ic6$, module0132.$g1558$.getGlobalValue());
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        final SubLObject var8 = module0012.$g75$.currentBinding(var4);
        final SubLObject var9 = module0012.$g76$.currentBinding(var4);
        final SubLObject var10 = module0012.$g77$.currentBinding(var4);
        final SubLObject var11 = module0012.$g78$.currentBinding(var4);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var4);
            module0012.$g76$.bind((SubLObject)NIL, var4);
            module0012.$g77$.bind((SubLObject)T, var4);
            module0012.$g78$.bind(Time.get_universal_time(), var4);
            module0012.f478((SubLObject)$ic10$);
            final SubLObject var23_48 = module0147.$g2094$.currentBinding(var4);
            final SubLObject var45_49 = module0147.$g2095$.currentBinding(var4);
            try {
                module0147.$g2094$.bind((SubLObject)$ic11$, var4);
                module0147.$g2095$.bind(module0132.$g1558$.getGlobalValue(), var4);
                final SubLObject var12 = $ic6$;
                if (NIL != module0158.f10038(var12)) {
                    final SubLObject var13 = (SubLObject)NIL;
                    final SubLObject var23_49 = module0012.$g73$.currentBinding(var4);
                    final SubLObject var45_50 = module0012.$g65$.currentBinding(var4);
                    final SubLObject var46_54 = module0012.$g67$.currentBinding(var4);
                    final SubLObject var47_55 = module0012.$g68$.currentBinding(var4);
                    final SubLObject var14 = module0012.$g66$.currentBinding(var4);
                    final SubLObject var15 = module0012.$g69$.currentBinding(var4);
                    final SubLObject var16 = module0012.$g70$.currentBinding(var4);
                    final SubLObject var17 = module0012.$silent_progressP$.currentBinding(var4);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var4);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var4), var4);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var4);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var4);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var4);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var4);
                        module0012.$g70$.bind((SubLObject)T, var4);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var13) ? module0012.$silent_progressP$.getDynamicValue(var4) : T), var4);
                        module0012.f474(var13);
                        final SubLObject var18 = module0158.f10039(var12);
                        SubLObject var19 = (SubLObject)NIL;
                        final SubLObject var20 = (SubLObject)NIL;
                        while (NIL == var19) {
                            final SubLObject var21 = module0052.f3695(var18, var20);
                            final SubLObject var22 = (SubLObject)makeBoolean(!var20.eql(var21));
                            if (NIL != var22) {
                                module0012.f476();
                                SubLObject var23 = (SubLObject)NIL;
                                try {
                                    var23 = module0158.f10316(var21, (SubLObject)$ic1$, (SubLObject)$ic8$, (SubLObject)NIL);
                                    SubLObject var13_61 = (SubLObject)NIL;
                                    final SubLObject var14_62 = (SubLObject)NIL;
                                    while (NIL == var13_61) {
                                        final SubLObject var24 = module0052.f3695(var23, var14_62);
                                        final SubLObject var16_63 = (SubLObject)makeBoolean(!var14_62.eql(var24));
                                        if (NIL != var16_63) {
                                            module0012.note_percent_progress(var7, var6);
                                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                            SubLObject var25 = (SubLObject)NIL;
                                            try {
                                                var4.throwStack.push(module0003.$g3$.getGlobalValue());
                                                final SubLObject var23_50 = Errors.$error_handler$.currentBinding(var4);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)$ic12$, var4);
                                                    try {
                                                        final SubLObject var26 = module0178.f11334(var24);
                                                        final SubLObject var27 = module0178.f11335(var24);
                                                        if (NIL != module0167.f10824(var26, (SubLObject)UNPROVIDED) && NIL != module0228.f15225(var27)) {
                                                            f10909(var26, var27);
                                                            var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                                                        }
                                                    }
                                                    catch (Throwable var28) {
                                                        Errors.handleThrowable(var28, (SubLObject)NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(var23_50, var4);
                                                }
                                            }
                                            catch (Throwable var29) {
                                                var25 = Errors.handleThrowable(var29, module0003.$g3$.getGlobalValue());
                                            }
                                            finally {
                                                var4.throwStack.pop();
                                            }
                                            if (var25.isString()) {
                                                Errors.warn((SubLObject)$ic13$, var25);
                                            }
                                        }
                                        var13_61 = (SubLObject)makeBoolean(NIL == var16_63);
                                    }
                                }
                                finally {
                                    final SubLObject var23_51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                                        if (NIL != var23) {
                                            module0158.f10319(var23);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var23_51, var4);
                                    }
                                }
                            }
                            var19 = (SubLObject)makeBoolean(NIL == var22);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var17, var4);
                        module0012.$g70$.rebind(var16, var4);
                        module0012.$g69$.rebind(var15, var4);
                        module0012.$g66$.rebind(var14, var4);
                        module0012.$g68$.rebind(var47_55, var4);
                        module0012.$g67$.rebind(var46_54, var4);
                        module0012.$g65$.rebind(var45_50, var4);
                        module0012.$g73$.rebind(var23_49, var4);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var45_49, var4);
                module0147.$g2094$.rebind(var23_48, var4);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var4);
            module0012.$g77$.rebind(var10, var4);
            module0012.$g76$.rebind(var9, var4);
            module0012.$g75$.rebind(var8, var4);
        }
        return Values.values(var5, module0167.f10796());
    }
    
    public static SubLObject f10909(final SubLObject var3, final SubLObject var69) {
        module0170.f10884(module0167.f10803(var3), var69);
        return var3;
    }
    
    public static SubLObject f10910(final SubLObject var3, final SubLObject var70) {
        assert NIL != module0167.f10813(var3) : var3;
        module0169.f10857(module0167.f10803(var3), var70);
        return var3;
    }
    
    public static SubLObject f10911(final SubLObject var3) {
        final SubLObject var4 = module0228.f15206(var3);
        if (NIL != assertion_handles_oc.f11041(var4, (SubLObject)UNPROVIDED)) {
            assertions_low_oc.f11264(var4);
        }
        final SubLObject var5 = module0167.f10803(var3);
        if (var5.isInteger()) {
            module0169.f10858(var5);
            module0170.f10885(var5);
            module0167.f10806(var5);
        }
        module0167.f10821(var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10912() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10898", "S#13716", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10899", "S#13657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10900", "S#13658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10901", "S#13605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10902", "S#13717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10903", "S#13654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10904", "S#13653", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10906", "S#13652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10905", "S#13718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10907", "S#13719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10908", "S#13659", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10909", "S#13720", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10910", "S#13721", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0171", "f10911", "S#13656", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10913() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10914() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f10912();
    }
    
    public void initializeVariables() {
        f10913();
    }
    
    public void runTopLevelForms() {
        f10914();
    }
    
    static {
        me = (SubLFile)new module0171();
        $ic0$ = makeKeyword("NART-ARG");
        $ic1$ = makeKeyword("GAF");
        $ic2$ = makeKeyword("FUNCTION-EXTENT");
        $ic3$ = makeKeyword("OVERLAP");
        $ic4$ = makeSymbol("NART-P");
        $ic5$ = makeSymbol("S#13650", "CYC");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic7$ = makeKeyword("FORWARD");
        $ic8$ = makeKeyword("TRUE");
        $ic9$ = makeKeyword("MONOTONIC");
        $ic10$ = makeString("Initializing NART HL formula table");
        $ic11$ = makeSymbol("S#12276", "CYC");
        $ic12$ = makeSymbol("S#38", "CYC");
        $ic13$ = makeString("~A");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 371 ms
	
	Decompiled with Procyon 0.5.32.
*/