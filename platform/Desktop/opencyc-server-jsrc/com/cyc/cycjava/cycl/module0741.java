package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0741 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0741";
    public static final String myFingerPrint = "927410c15f7f04d8eabde0827be740575c638fe26a340fe43f5519e7ee979bf8";
    private static SubLSymbol $g5879$;
    private static SubLSymbol $g5880$;
    private static SubLSymbol $g5881$;
    private static SubLSymbol $g5882$;
    private static SubLSymbol $g5883$;
    private static SubLSymbol $g5884$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLInteger $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLInteger $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLInteger $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    
    public static SubLObject f45884(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0585.$g4448$.getDynamicValue();
        }
        assert NIL != module0209.f13550(var1) : var1;
        final SubLObject var3 = f45885(var1, var2);
        if (NIL == module0077.f5302(var3)) {
            return (SubLObject)NIL;
        }
        return module0077.f5312(var3);
    }
    
    public static SubLObject f45886() {
        f45887();
        return $g5881$.getGlobalValue();
    }
    
    public static SubLObject f45888() {
        return module0236.f15526(f45886());
    }
    
    public static SubLObject f45887() {
        final SubLObject var4 = $g5883$.getGlobalValue();
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = Locks.seize_lock(var4);
            if (NIL == module0236.f15526($g5881$.getGlobalValue())) {
                f45889();
            }
        }
        finally {
            if (NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45885(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0585.$g4448$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != module0209.f13550(var1) : var1;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && var1.isString() && NIL == module0039.f3006(var1)) {
            Errors.error((SubLObject)$ic5$, var1);
        }
        var3.resetMultipleValues();
        final SubLObject var4 = f45890(var1, var2);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        return (NIL != var5 || NIL == module0077.f5302(var4)) ? var4 : module0077.f5314(var4);
    }
    
    public static SubLObject f45890(final SubLObject var9, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0585.$g4448$.getDynamicValue();
        }
        final SubLObject var10 = module0209.f13552(var9);
        final SubLObject var11 = f45891(module0038.f2735(var10));
        if (NIL == module0077.f5302(var11)) {
            return var11;
        }
        final SubLObject var12 = var2;
        if (var12.eql((SubLObject)$ic6$) || var12.eql((SubLObject)$ic7$)) {
            final SubLObject var13 = module0077.f5313(module0077.f5315(var11), (SubLObject)UNPROVIDED);
            final SubLObject var14 = (var2 == $ic6$) ? Symbols.symbol_function((SubLObject)EQUAL) : Symbols.symbol_function((SubLObject)EQUALP);
            final SubLObject var15 = module0077.f5333(var11);
            SubLObject var16;
            SubLObject var17;
            SubLObject var18;
            for (var16 = module0032.f1741(var15), var17 = (SubLObject)NIL, var17 = module0032.f1742(var16, var15); NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
                var18 = module0032.f1745(var16, var17);
                if (NIL != module0032.f1746(var17, var18) && NIL != Sequences.search(var10, var18, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    module0077.f5326(module0208.f13539(var18), var13);
                }
            }
            return var13;
        }
        if (!var12.eql((SubLObject)$ic8$)) {
            return (SubLObject)NIL;
        }
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var15 = module0077.f5333(var11);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        for (var16 = module0032.f1741(var15), var17 = (SubLObject)NIL, var17 = module0032.f1742(var16, var15); NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
            var18 = module0032.f1745(var16, var17);
            if (NIL != module0032.f1746(var17, var18)) {
                if (NIL != Sequences.search(var10, var18, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var19 = (SubLObject)ConsesLow.cons(module0208.f13539(var18), var19);
                }
                else if (NIL != Sequences.search(var10, var18, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var20 = (SubLObject)ConsesLow.cons(module0208.f13539(var18), var20);
                }
            }
        }
        if (NIL != var19) {
            return module0078.f5367(var19, module0077.f5315(var11), (SubLObject)UNPROVIDED);
        }
        return module0078.f5367(var20, module0077.f5315(var11), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45892(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        if (NIL != Sequences.find_if((SubLObject)$ic11$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var3 = Mapping.mapcar((SubLObject)$ic9$, f45893(var1));
            if (NIL != Sequences.find((SubLObject)$ic12$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)$ic12$;
            }
            if (NIL != module0035.find_if_not((SubLObject)$ic13$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Errors.error((SubLObject)$ic14$, module0035.find_if_not((SubLObject)$ic13$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            else {
                if (NIL != module0035.f2012(var3)) {
                    return (SubLObject)$ic12$;
                }
                final SubLObject var4 = module0078.f5351(var3, (SubLObject)UNPROVIDED);
                return (SubLObject)((NIL != module0077.f5316(var4)) ? $ic12$ : var4);
            }
        }
        else {
            final SubLObject var5 = module0021.$g777$.currentBinding(var2);
            try {
                module0021.$g777$.bind((SubLObject)NIL, var2);
                module0021.f1151(module0107.f7590());
                return module0236.f15558(var1, f45886(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0021.$g777$.rebind(var5, var2);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45891(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var3) {
            return f45892(var1);
        }
        var4 = module0034.f1857(var3, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)$ic9$, (SubLObject)ONE_INTEGER, (SubLObject)$ic16$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var3, (SubLObject)$ic9$, var4);
        }
        SubLObject var5 = module0034.f1814(var4, var1, (SubLObject)$ic17$);
        if (var5 == $ic17$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45892(var1)));
            module0034.f1816(var4, var1, var5, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f45894(final SubLObject var1, SubLObject var25, SubLObject var2) {
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = module0585.$g4448$.getDynamicValue();
        }
        final SubLObject var26 = f45885(var1, var2);
        final SubLObject var27 = (SubLObject)NIL;
        final SubLObject var28 = (SubLObject)ZERO_INTEGER;
        final SubLObject var29 = (SubLObject)NIL;
        if (NIL == module0077.f5302(var26)) {
            return (SubLObject)NIL;
        }
        return Values.values(var27, (SubLObject)((NIL != var29) ? module0077.f5311(var26) : NIL));
    }
    
    public static SubLObject f45895(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        return Sequences.delete_if((SubLObject)$ic19$, module0038.f2738(var1, f45896(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45893(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var3) {
            return f45895(var1);
        }
        var4 = module0034.f1857(var3, (SubLObject)$ic18$, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)$ic18$, (SubLObject)ONE_INTEGER, (SubLObject)$ic20$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var3, (SubLObject)$ic18$, var4);
        }
        SubLObject var5 = module0034.f1814(var4, var1, (SubLObject)$ic17$);
        if (var5 == $ic17$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45895(var1)));
            module0034.f1816(var4, var1, var5, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f45897(final SubLObject var1) {
        return module0731.f44751(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45896() {
        if ($g5884$.getGlobalValue() == $ic21$) {
            $g5884$.setGlobalValue(Sequences.cconcatenate(module0038.f2819(), module0038.f2818()));
        }
        return $g5884$.getGlobalValue();
    }
    
    public static SubLObject f45898(final SubLObject var29) {
        return conses_high.member(var29, f45896(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45899(final SubLObject var30, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        final SubLObject var33 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var34 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)$ic22$, var32);
            module0147.$g2095$.bind($ic23$, var32);
            final SubLObject var35 = module0217.f14247(var30, (SubLObject)UNPROVIDED);
            SubLObject var36 = (SubLObject)ZERO_INTEGER;
            final SubLObject var37 = Sequences.cconcatenate((SubLObject)$ic24$, new SubLObject[] { module0006.f207(var31), $ic25$, module0006.f205(var30) });
            final SubLObject var21_36 = module0012.$g75$.currentBinding(var32);
            final SubLObject var32_37 = module0012.$g76$.currentBinding(var32);
            final SubLObject var38 = module0012.$g77$.currentBinding(var32);
            final SubLObject var39 = module0012.$g78$.currentBinding(var32);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var32);
                module0012.$g76$.bind((SubLObject)NIL, var32);
                module0012.$g77$.bind((SubLObject)T, var32);
                module0012.$g78$.bind(Time.get_universal_time(), var32);
                module0012.f478(var37);
                if (NIL != module0158.f10038(var30)) {
                    final SubLObject var40 = (SubLObject)NIL;
                    final SubLObject var21_37 = module0012.$g73$.currentBinding(var32);
                    final SubLObject var32_38 = module0012.$g65$.currentBinding(var32);
                    final SubLObject var38_44 = module0012.$g67$.currentBinding(var32);
                    final SubLObject var39_45 = module0012.$g68$.currentBinding(var32);
                    final SubLObject var41 = module0012.$g66$.currentBinding(var32);
                    final SubLObject var42 = module0012.$g69$.currentBinding(var32);
                    final SubLObject var43 = module0012.$g70$.currentBinding(var32);
                    final SubLObject var44 = module0012.$silent_progressP$.currentBinding(var32);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var32);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var32), var32);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var32);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var32);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var32);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var32);
                        module0012.$g70$.bind((SubLObject)T, var32);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var40) ? module0012.$silent_progressP$.getDynamicValue(var32) : T), var32);
                        module0012.f474(var40);
                        final SubLObject var45 = module0158.f10039(var30);
                        SubLObject var46 = (SubLObject)NIL;
                        final SubLObject var47 = (SubLObject)NIL;
                        while (NIL == var46) {
                            final SubLObject var48 = module0052.f3695(var45, var47);
                            final SubLObject var49 = (SubLObject)makeBoolean(!var47.eql(var48));
                            if (NIL != var49) {
                                module0012.f476();
                                SubLObject var50 = (SubLObject)NIL;
                                try {
                                    var50 = module0158.f10316(var48, (SubLObject)$ic26$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var51_56 = (SubLObject)NIL;
                                    final SubLObject var52_57 = (SubLObject)NIL;
                                    while (NIL == var51_56) {
                                        final SubLObject var51 = module0052.f3695(var50, var52_57);
                                        final SubLObject var54_59 = (SubLObject)makeBoolean(!var52_57.eql(var51));
                                        if (NIL != var54_59) {
                                            final SubLObject var52 = module0178.f11331(var51, var31);
                                            if (var52.isString()) {
                                                f45900(var52, (SubLObject)NIL);
                                            }
                                            var36 = Numbers.add(var36, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var36, var35);
                                        }
                                        var51_56 = (SubLObject)makeBoolean(NIL == var54_59);
                                    }
                                }
                                finally {
                                    final SubLObject var21_38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var32);
                                        if (NIL != var50) {
                                            module0158.f10319(var50);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21_38, var32);
                                    }
                                }
                            }
                            var46 = (SubLObject)makeBoolean(NIL == var49);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var44, var32);
                        module0012.$g70$.rebind(var43, var32);
                        module0012.$g69$.rebind(var42, var32);
                        module0012.$g66$.rebind(var41, var32);
                        module0012.$g68$.rebind(var39_45, var32);
                        module0012.$g67$.rebind(var38_44, var32);
                        module0012.$g65$.rebind(var32_38, var32);
                        module0012.$g73$.rebind(var21_37, var32);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var39, var32);
                module0012.$g77$.rebind(var38, var32);
                module0012.$g76$.rebind(var32_37, var32);
                module0012.$g75$.rebind(var21_36, var32);
            }
        }
        finally {
            module0147.$g2095$.rebind(var34, var32);
            module0147.$g2094$.rebind(var33, var32);
        }
        return (SubLObject)$ic27$;
    }
    
    public static SubLObject f45901(final SubLObject var30, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        final SubLObject var33 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var34 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)$ic22$, var32);
            module0147.$g2095$.bind($ic23$, var32);
            final SubLObject var35 = module0217.f14247(var30, (SubLObject)UNPROVIDED);
            SubLObject var36 = (SubLObject)ZERO_INTEGER;
            final SubLObject var37 = Sequences.cconcatenate((SubLObject)$ic28$, new SubLObject[] { module0006.f207(var31), $ic25$, module0006.f205(var30) });
            final SubLObject var21_61 = module0012.$g75$.currentBinding(var32);
            final SubLObject var32_62 = module0012.$g76$.currentBinding(var32);
            final SubLObject var38 = module0012.$g77$.currentBinding(var32);
            final SubLObject var39 = module0012.$g78$.currentBinding(var32);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var32);
                module0012.$g76$.bind((SubLObject)NIL, var32);
                module0012.$g77$.bind((SubLObject)T, var32);
                module0012.$g78$.bind(Time.get_universal_time(), var32);
                module0012.f478(var37);
                if (NIL != module0158.f10038(var30)) {
                    final SubLObject var40 = (SubLObject)NIL;
                    final SubLObject var21_62 = module0012.$g73$.currentBinding(var32);
                    final SubLObject var32_63 = module0012.$g65$.currentBinding(var32);
                    final SubLObject var38_65 = module0012.$g67$.currentBinding(var32);
                    final SubLObject var39_66 = module0012.$g68$.currentBinding(var32);
                    final SubLObject var41 = module0012.$g66$.currentBinding(var32);
                    final SubLObject var42 = module0012.$g69$.currentBinding(var32);
                    final SubLObject var43 = module0012.$g70$.currentBinding(var32);
                    final SubLObject var44 = module0012.$silent_progressP$.currentBinding(var32);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var32);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var32), var32);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var32);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var32);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var32);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var32);
                        module0012.$g70$.bind((SubLObject)T, var32);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var40) ? module0012.$silent_progressP$.getDynamicValue(var32) : T), var32);
                        module0012.f474(var40);
                        final SubLObject var45 = module0158.f10039(var30);
                        SubLObject var46 = (SubLObject)NIL;
                        final SubLObject var47 = (SubLObject)NIL;
                        while (NIL == var46) {
                            final SubLObject var48 = module0052.f3695(var45, var47);
                            final SubLObject var49 = (SubLObject)makeBoolean(!var47.eql(var48));
                            if (NIL != var49) {
                                module0012.f476();
                                SubLObject var50 = (SubLObject)NIL;
                                try {
                                    var50 = module0158.f10316(var48, (SubLObject)$ic26$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var51_67 = (SubLObject)NIL;
                                    final SubLObject var52_68 = (SubLObject)NIL;
                                    while (NIL == var51_67) {
                                        final SubLObject var51 = module0052.f3695(var50, var52_68);
                                        final SubLObject var54_69 = (SubLObject)makeBoolean(!var52_68.eql(var51));
                                        if (NIL != var54_69) {
                                            final SubLObject var52 = module0178.f11331(var51, var31);
                                            if (var52.isString()) {
                                                f45900(var52, (SubLObject)T);
                                            }
                                            var36 = Numbers.add(var36, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var36, var35);
                                        }
                                        var51_67 = (SubLObject)makeBoolean(NIL == var54_69);
                                    }
                                }
                                finally {
                                    final SubLObject var21_63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var32);
                                        if (NIL != var50) {
                                            module0158.f10319(var50);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21_63, var32);
                                    }
                                }
                            }
                            var46 = (SubLObject)makeBoolean(NIL == var49);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var44, var32);
                        module0012.$g70$.rebind(var43, var32);
                        module0012.$g69$.rebind(var42, var32);
                        module0012.$g66$.rebind(var41, var32);
                        module0012.$g68$.rebind(var39_66, var32);
                        module0012.$g67$.rebind(var38_65, var32);
                        module0012.$g65$.rebind(var32_63, var32);
                        module0012.$g73$.rebind(var21_62, var32);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var39, var32);
                module0012.$g77$.rebind(var38, var32);
                module0012.$g76$.rebind(var32_62, var32);
                module0012.$g75$.rebind(var21_61, var32);
            }
        }
        finally {
            module0147.$g2095$.rebind(var34, var32);
            module0147.$g2094$.rebind(var33, var32);
        }
        return (SubLObject)$ic27$;
    }
    
    public static SubLObject f45900(final SubLObject var9, final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        assert NIL != module0209.f13550(var9) : var9;
        final SubLObject var73 = module0209.f13552(var9);
        final SubLObject var74 = module0021.$g777$.currentBinding(var72);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var72);
            module0021.f1151(module0107.f7590());
            if (NIL == var71) {
                SubLObject var75 = f45893(var73);
                SubLObject var76 = (SubLObject)NIL;
                var76 = var75.first();
                while (NIL != var75) {
                    SubLObject var77 = f45891(var76);
                    if (NIL == module0077.f5302(var77)) {
                        var77 = module0077.f5313((SubLObject)EQUAL, (SubLObject)UNPROVIDED);
                    }
                    module0077.f5326(var73, var77);
                    module0236.f15559(var76, var77, f45886());
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
            else if (NIL == f45902(var73, (SubLObject)UNPROVIDED)) {
                if (NIL == f45903(var73)) {
                    SubLObject var75 = f45893(var73);
                    SubLObject var76 = (SubLObject)NIL;
                    var76 = var75.first();
                    while (NIL != var75) {
                        final SubLObject var77 = f45891(var76);
                        if (NIL != module0077.f5302(var77)) {
                            module0077.f5327(var73, var77);
                            module0236.f15559(var76, var77, f45886());
                        }
                        var75 = var75.rest();
                        var76 = var75.first();
                    }
                }
            }
        }
        finally {
            module0021.$g777$.rebind(var74, var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45904() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0147.$g2094$.currentBinding(var6);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var6);
        try {
            module0147.$g2094$.bind((SubLObject)$ic22$, var6);
            module0147.$g2095$.bind($ic23$, var6);
            final SubLObject var10 = $ic30$;
            if (NIL != module0158.f10038(var10)) {
                final SubLObject var11 = (SubLObject)NIL;
                final SubLObject var21_76 = module0012.$g73$.currentBinding(var6);
                final SubLObject var32_77 = module0012.$g65$.currentBinding(var6);
                final SubLObject var12 = module0012.$g67$.currentBinding(var6);
                final SubLObject var13 = module0012.$g68$.currentBinding(var6);
                final SubLObject var14 = module0012.$g66$.currentBinding(var6);
                final SubLObject var15 = module0012.$g69$.currentBinding(var6);
                final SubLObject var16 = module0012.$g70$.currentBinding(var6);
                final SubLObject var17 = module0012.$silent_progressP$.currentBinding(var6);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var6);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var6), var6);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var6);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var6);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var6);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var6);
                    module0012.$g70$.bind((SubLObject)T, var6);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var11) ? module0012.$silent_progressP$.getDynamicValue(var6) : T), var6);
                    module0012.f474(var11);
                    final SubLObject var18 = module0158.f10039(var10);
                    SubLObject var19 = (SubLObject)NIL;
                    final SubLObject var20 = (SubLObject)NIL;
                    while (NIL == var19) {
                        final SubLObject var21 = module0052.f3695(var18, var20);
                        final SubLObject var22 = (SubLObject)makeBoolean(!var20.eql(var21));
                        if (NIL != var22) {
                            module0012.f476();
                            SubLObject var23 = (SubLObject)NIL;
                            try {
                                var23 = module0158.f10316(var21, (SubLObject)$ic26$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var51_78 = (SubLObject)NIL;
                                final SubLObject var52_79 = (SubLObject)NIL;
                                while (NIL == var51_78) {
                                    final SubLObject var24 = module0052.f3695(var23, var52_79);
                                    final SubLObject var54_80 = (SubLObject)makeBoolean(!var52_79.eql(var24));
                                    if (NIL != var54_80) {
                                        final SubLObject var25 = module0178.f11334(var24);
                                        if (NIL == conses_high.member(var25, var7, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            var7 = (SubLObject)ConsesLow.cons(var25, var7);
                                        }
                                    }
                                    var51_78 = (SubLObject)makeBoolean(NIL == var54_80);
                                }
                            }
                            finally {
                                final SubLObject var21_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                                    if (NIL != var23) {
                                        module0158.f10319(var23);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var21_77, var6);
                                }
                            }
                        }
                        var19 = (SubLObject)makeBoolean(NIL == var22);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var17, var6);
                    module0012.$g70$.rebind(var16, var6);
                    module0012.$g69$.rebind(var15, var6);
                    module0012.$g66$.rebind(var14, var6);
                    module0012.$g68$.rebind(var13, var6);
                    module0012.$g67$.rebind(var12, var6);
                    module0012.$g65$.rebind(var32_77, var6);
                    module0012.$g73$.rebind(var21_76, var6);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var9, var6);
            module0147.$g2094$.rebind(var8, var6);
        }
        return var7;
    }
    
    public static SubLObject f45905() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0034.$g879$.getDynamicValue(var6);
        SubLObject var8 = (SubLObject)NIL;
        if (NIL == var7) {
            return f45904();
        }
        var8 = module0034.f1857(var7, (SubLObject)$ic29$, (SubLObject)UNPROVIDED);
        if (NIL == var8) {
            var8 = module0034.f1807(module0034.f1842(var7), (SubLObject)$ic29$, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var7, (SubLObject)$ic29$, var8);
        }
        SubLObject var9 = module0034.f1810(var8, (SubLObject)UNPROVIDED);
        if (var9 == $ic17$) {
            var9 = Values.arg2(var6.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45904()));
            module0034.f1812(var8, var9, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var9);
    }
    
    public static SubLObject f45906(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0147.$g2094$.currentBinding(var31);
        final SubLObject var33 = module0147.$g2095$.currentBinding(var31);
        try {
            module0147.$g2094$.bind((SubLObject)$ic22$, var31);
            module0147.$g2095$.bind($ic23$, var31);
            return conses_high.copy_list(module0220.f14562(var30, $ic30$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var33, var31);
            module0147.$g2094$.rebind(var32, var31);
        }
    }
    
    public static SubLObject f45903(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0208.f13539(var1);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic22$, var2);
            module0147.$g2095$.bind($ic23$, var2);
            if (NIL == var3) {
                SubLObject var7 = f45905();
                SubLObject var8 = (SubLObject)NIL;
                var8 = var7.first();
                while (NIL == var3 && NIL != var7) {
                    if (NIL == var3) {
                        SubLObject var84_85 = f45906(var8);
                        SubLObject var9 = (SubLObject)NIL;
                        var9 = var84_85.first();
                        while (NIL == var3 && NIL != var84_85) {
                            if (module0217.f14221(var4, var9, var8, (SubLObject)UNPROVIDED).isPositive()) {
                                var3 = (SubLObject)T;
                            }
                            var84_85 = var84_85.rest();
                            var9 = var84_85.first();
                        }
                    }
                    var7 = var7.rest();
                    var8 = var7.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var2);
            module0147.$g2094$.rebind(var5, var2);
        }
        return var3;
    }
    
    public static SubLObject f45907(final SubLObject var1, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        final SubLObject var13 = module0208.f13539(var1);
        final SubLObject var14 = module0209.f13552(var13);
        SubLObject var16;
        final SubLObject var15 = var16 = module0737.f45432(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            if (NIL != Functions.funcall(var12, var14, module0737.f45336(var17))) {
                return (SubLObject)T;
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45902(final SubLObject var1, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0034.$g879$.getDynamicValue(var13);
        SubLObject var15 = (SubLObject)NIL;
        if (NIL == var14) {
            return f45907(var1, var12);
        }
        var15 = module0034.f1857(var14, (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
        if (NIL == var15) {
            var15 = module0034.f1807(module0034.f1842(var14), (SubLObject)$ic31$, (SubLObject)TWO_INTEGER, (SubLObject)$ic32$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var14, (SubLObject)$ic31$, var15);
        }
        final SubLObject var16 = module0034.f1782(var1, var12);
        final SubLObject var17 = module0034.f1814(var15, var16, (SubLObject)UNPROVIDED);
        if (var17 != $ic17$) {
            SubLObject var18 = var17;
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL != var18) {
                SubLObject var20 = var19.first();
                final SubLObject var21 = conses_high.second(var19);
                if (var1.equal(var20.first())) {
                    var20 = var20.rest();
                    if (NIL != var20 && NIL == var20.rest() && var12.equal(var20.first())) {
                        return module0034.f1959(var21);
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        final SubLObject var22 = Values.arg2(var13.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45907(var1, var12)));
        module0034.f1836(var15, var16, var17, var22, (SubLObject)ConsesLow.list(var1, var12));
        return module0034.f1959(var22);
    }
    
    public static SubLObject f45889() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = f45908((SubLObject)UNPROVIDED);
        if (NIL != Filesys.probe_file(var7)) {
            $g5881$.setGlobalValue(module0236.f15548(var7, (SubLObject)NIL, (SubLObject)NIL, module0093.$g1217$.getDynamicValue(var6), (SubLObject)EQUALP, (SubLObject)$ic33$));
        }
        return $g5881$.getGlobalValue();
    }
    
    public static SubLObject f45909() {
        final SubLObject var99 = $g5879$.getGlobalValue();
        SubLObject var100 = (SubLObject)NIL;
        try {
            var100 = Locks.seize_lock(var99);
            if (NIL != $g5881$.getGlobalValue()) {
                $g5880$.setGlobalValue((SubLObject)NIL);
                module0236.f15553($g5881$.getGlobalValue(), (SubLObject)UNPROVIDED);
            }
        }
        finally {
            if (NIL != var100) {
                Locks.release_lock(var99);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45910() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var6) && NIL == module0018.f984()) {
            Errors.error((SubLObject)$ic34$);
        }
        $g5882$.setGlobalValue(module0067.f4880((SubLObject)EQUALP, (SubLObject)UNPROVIDED));
        final SubLObject var8;
        final SubLObject var7 = var8 = module0034.f1888();
        final SubLObject var9 = module0034.$g879$.currentBinding(var6);
        try {
            module0034.$g879$.bind(var8, var6);
            SubLObject var10 = (SubLObject)NIL;
            if (NIL != var8 && NIL == module0034.f1842(var8)) {
                var10 = module0034.f1869(var8);
                final SubLObject var11 = Threads.current_process();
                if (NIL == var10) {
                    module0034.f1873(var8, var11);
                }
                else if (!var10.eql(var11)) {
                    Errors.error((SubLObject)$ic35$);
                }
            }
            try {
                final SubLObject var12 = module0139.$g1630$.getDynamicValue(var6);
                final SubLObject var21_106 = module0139.$g1631$.currentBinding(var6);
                final SubLObject var13 = module0139.$g1632$.currentBinding(var6);
                final SubLObject var14 = module0139.$g1630$.currentBinding(var6);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var12, (SubLObject)SIX_INTEGER), var6);
                    module0139.$g1632$.bind(module0139.f9016(var12), var6);
                    module0139.$g1630$.bind((SubLObject)T, var6);
                    final SubLObject var15 = module0737.$g5846$.getGlobalValue();
                    SubLObject var16 = (SubLObject)NIL;
                    try {
                        var16 = Locks.seize_lock(var15);
                        final SubLObject var21_107 = module0096.$g1265$.currentBinding(var6);
                        try {
                            module0096.$g1265$.bind(module0737.$g5827$.getGlobalValue(), var6);
                            final SubLObject var17 = module0054.f3968();
                            final SubLObject var18 = module0737.f45538();
                            final SubLObject var19 = (SubLObject)$ic36$;
                            SubLObject var20 = (SubLObject)ZERO_INTEGER;
                            final SubLObject var21 = module0079.f5406(var18);
                            assert NIL != Types.stringp(var19) : var19;
                            final SubLObject var21_108 = module0012.$g75$.currentBinding(var6);
                            final SubLObject var32_116 = module0012.$g76$.currentBinding(var6);
                            final SubLObject var38_117 = module0012.$g77$.currentBinding(var6);
                            final SubLObject var22 = module0012.$g78$.currentBinding(var6);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var6);
                                module0012.$g76$.bind((SubLObject)NIL, var6);
                                module0012.$g77$.bind((SubLObject)T, var6);
                                module0012.$g78$.bind(Time.get_universal_time(), var6);
                                module0012.f478(var19);
                                final SubLObject var23 = module0079.f5424(var18);
                                SubLObject var26;
                                for (SubLObject var24 = (SubLObject)NIL; NIL == var24; var24 = (SubLObject)makeBoolean(NIL == var26)) {
                                    var6.resetMultipleValues();
                                    final SubLObject var25 = module0052.f3693(var23);
                                    var26 = var6.secondMultipleValue();
                                    var6.resetMultipleValues();
                                    if (NIL != var26) {
                                        SubLObject var28;
                                        final SubLObject var27 = var28 = var25;
                                        SubLObject var29 = (SubLObject)NIL;
                                        SubLObject var30 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)$ic37$);
                                        var29 = var28.first();
                                        var28 = var28.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)$ic37$);
                                        var30 = var28.first();
                                        var28 = var28.rest();
                                        if (NIL == var28) {
                                            module0012.note_percent_progress(var20, var21);
                                            var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
                                            if (NIL != module0079.f5404(var30)) {
                                                module0054.f3973(var30, var17);
                                                while (NIL == module0054.f3970(var17)) {
                                                    final SubLObject var31 = module0054.f3974(var17);
                                                    final SubLObject var118_127 = module0079.f5424(var31);
                                                    SubLObject var121_130;
                                                    for (SubLObject var119_128 = (SubLObject)NIL; NIL == var119_128; var119_128 = (SubLObject)makeBoolean(NIL == var121_130)) {
                                                        var6.resetMultipleValues();
                                                        final SubLObject var120_129 = module0052.f3693(var118_127);
                                                        var121_130 = var6.secondMultipleValue();
                                                        var6.resetMultipleValues();
                                                        if (NIL != var121_130) {
                                                            SubLObject var133_134;
                                                            final SubLObject var131_132 = var133_134 = var120_129;
                                                            SubLObject var32 = (SubLObject)NIL;
                                                            SubLObject var33 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var133_134, var131_132, (SubLObject)$ic38$);
                                                            var32 = var133_134.first();
                                                            var133_134 = var133_134.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var133_134, var131_132, (SubLObject)$ic38$);
                                                            var33 = var133_134.first();
                                                            var133_134 = var133_134.rest();
                                                            if (NIL == var133_134) {
                                                                if (NIL != module0079.f5404(var33)) {
                                                                    module0054.f3973(var33, var17);
                                                                }
                                                                else if (var33.isCons()) {
                                                                    final SubLObject var34 = var33.first();
                                                                    final SubLObject var35 = var33.rest();
                                                                    SubLObject var36 = f45911(var35);
                                                                    SubLObject var37 = (SubLObject)NIL;
                                                                    var37 = var36.first();
                                                                    while (NIL != var36) {
                                                                        if (NIL != var37) {
                                                                            f45912(var37);
                                                                        }
                                                                        var36 = var36.rest();
                                                                        var37 = var36.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var131_132, (SubLObject)$ic38$);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else if (var30.isCons()) {
                                                final SubLObject var38 = var30.first();
                                                final SubLObject var39 = var30.rest();
                                                SubLObject var40 = f45911(var39);
                                                SubLObject var41 = (SubLObject)NIL;
                                                var41 = var40.first();
                                                while (NIL != var40) {
                                                    if (NIL != var41) {
                                                        f45912(var41);
                                                    }
                                                    var40 = var40.rest();
                                                    var41 = var40.first();
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)$ic37$);
                                        }
                                    }
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var22, var6);
                                module0012.$g77$.rebind(var38_117, var6);
                                module0012.$g76$.rebind(var32_116, var6);
                                module0012.$g75$.rebind(var21_108, var6);
                            }
                        }
                        finally {
                            module0096.$g1265$.rebind(var21_107, var6);
                        }
                    }
                    finally {
                        if (NIL != var16) {
                            Locks.release_lock(var15);
                        }
                    }
                    SubLObject var42 = f45905();
                    SubLObject var43 = (SubLObject)NIL;
                    var43 = var42.first();
                    while (NIL != var42) {
                        SubLObject var72_139 = f45906(var43);
                        SubLObject var44 = (SubLObject)NIL;
                        var44 = var72_139.first();
                        while (NIL != var72_139) {
                            f45913(var43, var44);
                            var72_139 = var72_139.rest();
                            var44 = var72_139.first();
                        }
                        var42 = var42.rest();
                        var43 = var42.first();
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var14, var6);
                    module0139.$g1632$.rebind(var13, var6);
                    module0139.$g1631$.rebind(var21_106, var6);
                }
            }
            finally {
                final SubLObject var21_109 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                    if (NIL != var8 && NIL == var10) {
                        module0034.f1873(var8, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var21_109, var6);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var9, var6);
        }
        return $g5882$.getGlobalValue();
    }
    
    public static SubLObject f45912(final SubLObject var9) {
        final SubLObject var10 = module0209.f13552(var9);
        SubLObject var11 = f45893(var10);
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            SubLObject var13 = module0067.f4884($g5882$.getGlobalValue(), var12, (SubLObject)UNPROVIDED);
            if (NIL == module0077.f5302(var13)) {
                var13 = module0077.f5313((SubLObject)EQUAL, (SubLObject)UNPROVIDED);
                module0067.f4886($g5882$.getGlobalValue(), var12, var13);
            }
            module0077.f5326(var10, var13);
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)$ic39$;
    }
    
    public static SubLObject f45913(final SubLObject var30, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        final SubLObject var33 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var34 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)$ic22$, var32);
            module0147.$g2095$.bind($ic23$, var32);
            final SubLObject var35 = module0217.f14247(var30, (SubLObject)UNPROVIDED);
            SubLObject var36 = (SubLObject)ZERO_INTEGER;
            final SubLObject var37 = Sequences.cconcatenate((SubLObject)$ic24$, new SubLObject[] { module0006.f207(var31), $ic25$, module0006.f205(var30) });
            final SubLObject var21_141 = module0012.$g75$.currentBinding(var32);
            final SubLObject var32_142 = module0012.$g76$.currentBinding(var32);
            final SubLObject var38 = module0012.$g77$.currentBinding(var32);
            final SubLObject var39 = module0012.$g78$.currentBinding(var32);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var32);
                module0012.$g76$.bind((SubLObject)NIL, var32);
                module0012.$g77$.bind((SubLObject)T, var32);
                module0012.$g78$.bind(Time.get_universal_time(), var32);
                module0012.f478(var37);
                if (NIL != module0158.f10038(var30)) {
                    final SubLObject var40 = (SubLObject)NIL;
                    final SubLObject var21_142 = module0012.$g73$.currentBinding(var32);
                    final SubLObject var32_143 = module0012.$g65$.currentBinding(var32);
                    final SubLObject var38_145 = module0012.$g67$.currentBinding(var32);
                    final SubLObject var39_146 = module0012.$g68$.currentBinding(var32);
                    final SubLObject var41 = module0012.$g66$.currentBinding(var32);
                    final SubLObject var42 = module0012.$g69$.currentBinding(var32);
                    final SubLObject var43 = module0012.$g70$.currentBinding(var32);
                    final SubLObject var44 = module0012.$silent_progressP$.currentBinding(var32);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var32);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var32), var32);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var32);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var32);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var32);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var32);
                        module0012.$g70$.bind((SubLObject)T, var32);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var40) ? module0012.$silent_progressP$.getDynamicValue(var32) : T), var32);
                        module0012.f474(var40);
                        final SubLObject var45 = module0158.f10039(var30);
                        SubLObject var46 = (SubLObject)NIL;
                        final SubLObject var47 = (SubLObject)NIL;
                        while (NIL == var46) {
                            final SubLObject var48 = module0052.f3695(var45, var47);
                            final SubLObject var49 = (SubLObject)makeBoolean(!var47.eql(var48));
                            if (NIL != var49) {
                                module0012.f476();
                                SubLObject var50 = (SubLObject)NIL;
                                try {
                                    var50 = module0158.f10316(var48, (SubLObject)$ic26$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var51_147 = (SubLObject)NIL;
                                    final SubLObject var52_148 = (SubLObject)NIL;
                                    while (NIL == var51_147) {
                                        final SubLObject var51 = module0052.f3695(var50, var52_148);
                                        final SubLObject var54_149 = (SubLObject)makeBoolean(!var52_148.eql(var51));
                                        if (NIL != var54_149) {
                                            final SubLObject var52 = module0178.f11331(var51, var31);
                                            if (var52.isString()) {
                                                f45912(var52);
                                            }
                                            var36 = Numbers.add(var36, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var36, var35);
                                        }
                                        var51_147 = (SubLObject)makeBoolean(NIL == var54_149);
                                    }
                                }
                                finally {
                                    final SubLObject var21_143 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var32);
                                        if (NIL != var50) {
                                            module0158.f10319(var50);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21_143, var32);
                                    }
                                }
                            }
                            var46 = (SubLObject)makeBoolean(NIL == var49);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var44, var32);
                        module0012.$g70$.rebind(var43, var32);
                        module0012.$g69$.rebind(var42, var32);
                        module0012.$g66$.rebind(var41, var32);
                        module0012.$g68$.rebind(var39_146, var32);
                        module0012.$g67$.rebind(var38_145, var32);
                        module0012.$g65$.rebind(var32_143, var32);
                        module0012.$g73$.rebind(var21_142, var32);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var39, var32);
                module0012.$g77$.rebind(var38, var32);
                module0012.$g76$.rebind(var32_142, var32);
                module0012.$g75$.rebind(var21_141, var32);
            }
        }
        finally {
            module0147.$g2095$.rebind(var34, var32);
            module0147.$g2094$.rebind(var33, var32);
        }
        return (SubLObject)$ic39$;
    }
    
    public static SubLObject f45911(final SubLObject var88) {
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var90 = var88;
        SubLObject var91 = (SubLObject)NIL;
        var91 = var90.first();
        while (NIL != var90) {
            final SubLObject var92 = module0737.f45336(var91);
            if (NIL == conses_high.member(var92, var89, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                var89 = (SubLObject)ConsesLow.cons(var92, var89);
            }
            var90 = var90.rest();
            var91 = var90.first();
        }
        return var89;
    }
    
    public static SubLObject f45914(final SubLObject var152) {
        final SubLObject var153 = dumper_oc.f37917((SubLObject)$ic40$, var152, (SubLObject)UNPROVIDED);
        if (NIL != module0067.f4852($g5882$.getGlobalValue())) {
            return f45915($g5882$.getGlobalValue(), var153, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0236.f15526($g5881$.getGlobalValue())) {
            return Errors.warn((SubLObject)$ic41$);
        }
        final SubLObject var154 = module0107.f7590();
        final SubLObject var155 = module0021.f1153();
        return module0236.f15562($g5881$.getGlobalValue(), var153, var154, var155, module0075.f5180(), (SubLObject)$ic42$);
    }
    
    public static SubLObject f45915(SubLObject var156, SubLObject var157, SubLObject var158) {
        if (var156 == UNPROVIDED) {
            var156 = $g5882$.getGlobalValue();
        }
        if (var157 == UNPROVIDED) {
            var157 = f45908((SubLObject)UNPROVIDED);
        }
        if (var158 == UNPROVIDED) {
            var158 = module0075.f5180();
        }
        final SubLThread var159 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var159) && NIL == Filesys.probe_file(var158)) {
            Errors.error(Sequences.cconcatenate((SubLObject)$ic43$, new SubLObject[] { module0006.f203(var158), $ic44$ }));
        }
        final SubLObject var160 = module0093.f6656(var157, var158, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)$ic33$);
        final SubLObject var161 = Sequences.cconcatenate((SubLObject)$ic45$, module0006.f205(var157));
        SubLObject var162 = (SubLObject)ZERO_INTEGER;
        final SubLObject var163 = module0067.f4861(var156);
        final SubLObject var164 = module0012.$g75$.currentBinding(var159);
        final SubLObject var165 = module0012.$g76$.currentBinding(var159);
        final SubLObject var166 = module0012.$g77$.currentBinding(var159);
        final SubLObject var167 = module0012.$g78$.currentBinding(var159);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var159);
            module0012.$g76$.bind((SubLObject)NIL, var159);
            module0012.$g77$.bind((SubLObject)T, var159);
            module0012.$g78$.bind(Time.get_universal_time(), var159);
            module0012.f478(var161);
            SubLObject var168;
            for (var168 = module0066.f4838(module0067.f4891(var156)); NIL == module0066.f4841(var168); var168 = module0066.f4840(var168)) {
                var159.resetMultipleValues();
                final SubLObject var169 = module0066.f4839(var168);
                final SubLObject var170 = var159.secondMultipleValue();
                var159.resetMultipleValues();
                module0093.f6657(var169, var160, var170);
                var162 = Numbers.add(var162, (SubLObject)ONE_INTEGER);
                module0012.note_percent_progress(var162, var163);
            }
            module0066.f4842(var168);
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var167, var159);
            module0012.$g77$.rebind(var166, var159);
            module0012.$g76$.rebind(var165, var159);
            module0012.$g75$.rebind(var164, var159);
        }
        module0093.f6658(var160, (SubLObject)NIL, (SubLObject)$ic46$);
        return var160;
    }
    
    public static SubLObject f45908(SubLObject var165) {
        if (var165 == UNPROVIDED) {
            var165 = module0018.f971();
        }
        if (NIL != module0004.f105(var165) && (!$g5880$.getGlobalValue().isString() || NIL == Filesys.probe_file($g5880$.getGlobalValue()))) {
            $g5880$.setGlobalValue(dumper_oc.f37917((SubLObject)$ic40$, module0107.f7598(), (SubLObject)UNPROVIDED));
        }
        return $g5880$.getGlobalValue();
    }
    
    public static SubLObject f45916() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45884", "S#50136", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45886", "S#50137", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45888", "S#50138", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45887", "S#50139", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45885", "S#36115", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45890", "S#50140", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45892", "S#50141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45891", "S#50142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45894", "S#50143", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45895", "S#50144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45893", "S#50145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45897", "S#50146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45896", "S#50147", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45898", "S#50148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45899", "S#50149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45901", "S#50150", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45900", "S#49401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45904", "S#50151", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45905", "S#36113", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45906", "S#36114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45903", "S#50152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45907", "S#50153", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45902", "S#50154", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45889", "S#50155", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45909", "S#50156", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45910", "S#41494", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45912", "S#50157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45913", "S#50158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45911", "S#50159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45914", "S#41489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45915", "S#50160", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0741", "f45908", "S#50161", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45917() {
        $g5879$ = SubLFiles.deflexical("S#50162", Locks.make_lock((SubLObject)$ic0$));
        $g5880$ = SubLFiles.deflexical("S#50163", (SubLObject)NIL);
        $g5881$ = SubLFiles.deflexical("S#50164", (SubLObject)NIL);
        $g5882$ = SubLFiles.deflexical("S#50165", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g5882$.getGlobalValue() : NIL));
        $g5883$ = SubLFiles.deflexical("S#50166", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g5883$.getGlobalValue() : Locks.make_lock((SubLObject)$ic4$));
        $g5884$ = SubLFiles.deflexical("S#50167", (SubLObject)$ic21$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45918() {
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic3$);
        module0034.f1895((SubLObject)$ic9$);
        module0034.f1895((SubLObject)$ic18$);
        module0034.f1895((SubLObject)$ic29$);
        module0034.f1895((SubLObject)$ic31$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f45916();
    }
    
    public void initializeVariables() {
        f45917();
    }
    
    public void runTopLevelForms() {
        f45918();
    }
    
    static {
        me = (SubLFile)new module0741();
        $g5879$ = null;
        $g5880$ = null;
        $g5881$ = null;
        $g5882$ = null;
        $g5883$ = null;
        $g5884$ = null;
        $ic0$ = makeString("nl-trie-subword-fht-lock");
        $ic1$ = makeSymbol("S#50165", "CYC");
        $ic2$ = makeSymbol("S#3935", "CYC");
        $ic3$ = makeSymbol("S#50166", "CYC");
        $ic4$ = makeString("*nl-trie-subword-cache-initialization-lock*");
        $ic5$ = makeString("~S is not an ASCII string.");
        $ic6$ = makeKeyword("ON");
        $ic7$ = makeKeyword("OFF");
        $ic8$ = makeKeyword("PREFERRED");
        $ic9$ = makeSymbol("S#50142", "CYC");
        $ic10$ = makeSymbol("STRINGP");
        $ic11$ = makeSymbol("S#50148", "CYC");
        $ic12$ = makeKeyword("NOT-FOUND");
        $ic13$ = makeSymbol("S#6920", "CYC");
        $ic14$ = makeString("Unexpected result ~S from SUBWORD-INDEX-RAW-SEARCH-SET");
        $ic15$ = makeSymbol("S#5859", "CYC");
        $ic16$ = makeInteger(1024);
        $ic17$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic18$ = makeSymbol("S#50145", "CYC");
        $ic19$ = makeSymbol("S#50146", "CYC");
        $ic20$ = makeInteger(1000);
        $ic21$ = makeKeyword("UNINITIALIZED");
        $ic22$ = makeSymbol("S#12274", "CYC");
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic24$ = makeString("Indexing arg ");
        $ic25$ = makeString(" of ");
        $ic26$ = makeKeyword("GAF");
        $ic27$ = makeKeyword("ADDED");
        $ic28$ = makeString("Un-indexing arg ");
        $ic29$ = makeSymbol("S#36113", "CYC");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("indexSubWordsForArg"));
        $ic31$ = makeSymbol("S#50154", "CYC");
        $ic32$ = makeInteger(100);
        $ic33$ = makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $ic34$ = makeString("Lexicon not yet initialized");
        $ic35$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic36$ = makeString("building in-memory NL trie subword index");
        $ic37$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#6CABE02"), (SubLObject)makeUninternedSymbol("US#7901B45"));
        $ic38$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#794E61F"), (SubLObject)makeUninternedSymbol("US#712B0A2"));
        $ic39$ = makeKeyword("INDEXED");
        $ic40$ = makeString("nl-trie-subwords");
        $ic41$ = makeString("The in-memory NL Trie Subword Index is not initialized and no cache attached--it will not be dumped!");
        $ic42$ = makeString("Dumping NL Trie Subword Index Cache");
        $ic43$ = makeString("Temp directory '");
        $ic44$ = makeString("' unavailable");
        $ic45$ = makeString("Writing nl-trie-subword-index to file: ");
        $ic46$ = makeKeyword("USE-FIRST");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 610 ms
	
	Decompiled with Procyon 0.5.32.
*/