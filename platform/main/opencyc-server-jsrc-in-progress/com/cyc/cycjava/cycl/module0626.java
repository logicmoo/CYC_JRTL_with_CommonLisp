package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0626 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0626";
    public static final String myFingerPrint = "b19d7617237428c0d9188b5120242282404d8b4f8b897385b2479215691df71a";
    private static SubLSymbol $g4819$;
    private static SubLSymbol $g4820$;
    public static SubLSymbol $g4821$;
    private static SubLSymbol $g4822$;
    private static SubLSymbol $g4823$;
    private static SubLSymbol $g4824$;
    private static SubLSymbol $g4825$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
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
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLString $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLFloat $ic88$;
    private static final SubLFloat $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    
    public static SubLObject f38525() {
        return f38526();
    }
    
    public static SubLObject f38526() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        $g4821$.setDynamicValue((SubLObject)ConsesLow.listS((SubLObject)$ic0$, new SubLObject[] { $ic1$, $ic2$, $ic3$, $ic4$, module0579.$g4260$.getDynamicValue(var1), $ic5$, module0579.$g4262$.getDynamicValue(var1), $ic6$ }), var1);
        return $g4821$.getDynamicValue(var1);
    }
    
    public static SubLObject f38527(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic11$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)ConsesLow.listS((SubLObject)$ic14$, (SubLObject)$ic8$, var6, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)$ic15$);
    }
    
    public static SubLObject f38528(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = var2.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        if (NIL != Sequences.find((SubLObject)$ic16$, reader.$features$.getDynamicValue(var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return reader.bq_cons((SubLObject)$ic17$, ConsesLow.append(var7, (SubLObject)NIL));
        }
        return reader.bq_cons((SubLObject)$ic18$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f38529(final SubLObject var11) {
        return module0084.f5831($g4825$.getGlobalValue(), var11, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38530(final SubLObject var11, final SubLObject var12) {
        return module0084.f5833($g4825$.getGlobalValue(), var11, var12);
    }
    
    public static SubLObject f38531(final SubLObject var11, final SubLObject var12) {
        return module0084.f5834($g4825$.getGlobalValue(), var11, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38532(final SubLObject var11) {
        return module0084.f5830($g4825$.getGlobalValue(), var11);
    }
    
    public static SubLObject f38533(final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = module0361.f24195(var12, var13);
        final SubLObject var16 = module0084.f5831($g4822$.getGlobalValue(), var15, (SubLObject)NIL);
        if (var14.isInteger()) {
            module0059.f4284((SubLObject)$ic20$, var16);
        }
        else if (var14 == $ic21$) {
            module0059.f4284((SubLObject)ConsesLow.list((SubLObject)$ic22$, var14, f38534(var15)), var16);
        }
        else {
            module0059.f4284((SubLObject)ConsesLow.list((SubLObject)$ic22$, var14, (SubLObject)NIL), var16);
            if (var14 == $ic23$) {
                module0084.f5830($g4822$.getGlobalValue(), var15);
                module0357.f23645(var12, var13, (SubLObject)$ic24$);
                f38535(var12, var13);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38534(final SubLObject var15) {
        return (SubLObject)((NIL != inference_datastructures_inference_oc.f25430(var15)) ? inference_datastructures_inference_oc.f25433(var15) : NIL);
    }
    
    public static SubLObject f38536(final SubLObject var17, final SubLObject var18, SubLObject var19, SubLObject var20, SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var20 == UNPROVIDED) {
            var20 = $g4821$.getDynamicValue();
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        if (var22 == UNPROVIDED) {
            var22 = $g4819$.getDynamicValue();
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)T;
        }
        assert NIL != module0202.f12590(var17) : var17;
        assert NIL != module0161.f10479(var18) : var18;
        assert NIL != module0360.f23784(var19) : var19;
        return f38537(var17, var18, var19, var20, var21, var22, var23);
    }
    
    public static SubLObject f38537(final SubLObject var17, SubLObject var18, SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        var18 = module0162.f10630(var18);
        var19 = conses_high.putf(var19, (SubLObject)$ic32$, (SubLObject)$ic33$);
        final SubLObject var25 = (NIL != var23) ? module0202.f12696(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var17;
        final SubLObject var26 = (NIL != module0035.f2346(var19, (SubLObject)$ic34$)) ? module0035.f2335(var19, (SubLObject)$ic34$, (SubLObject)UNPROVIDED) : module0408.f28423(module0205.f13144(var25));
        final SubLObject var27 = module0035.f2340(module0360.f23800(var19), (SubLObject)ConsesLow.list((SubLObject)$ic34$, var26));
        final SubLObject var28 = module0059.f4283((SubLObject)$ic35$);
        var24.resetMultipleValues();
        final SubLObject var29 = f38538(var25, var18, var27);
        final SubLObject var30 = var24.secondMultipleValue();
        final SubLObject var31 = var24.thirdMultipleValue();
        var24.resetMultipleValues();
        module0084.f5829($g4822$.getGlobalValue(), var29, var28);
        module0357.f23641(var29, (SubLObject)$ic24$);
        if (NIL != var22) {
            module0623.f38420((SubLObject)ConsesLow.list((SubLObject)$ic36$, var30, var31));
        }
        else {
            PrintLow.format((SubLObject)T, (SubLObject)$ic37$, var30, var31);
        }
        return f38539(var30, var31, var19, var20, var21, var22);
    }
    
    public static SubLObject f38540(SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = module0623.f38415();
        }
        assert NIL != Types.stringp(var11) : var11;
        SubLObject var13;
        final SubLObject var12 = var13 = f38529(var11);
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            module0361.f24005(module0361.f23997(var14));
            var13 = var13.rest();
            var14 = var13.first();
        }
        f38532(var11);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38541(final SubLObject var12, final SubLObject var13, final SubLObject var19, SubLObject var20, SubLObject var21, SubLObject var22) {
        if (var20 == UNPROVIDED) {
            var20 = $g4821$.getDynamicValue();
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        if (var22 == UNPROVIDED) {
            var22 = $g4819$.getDynamicValue();
        }
        assert NIL != Types.integerp(var12) : var12;
        assert NIL != Types.integerp(var13) : var13;
        assert NIL != module0360.f23784(var19) : var19;
        assert NIL != module0751.f46979(var20) : var20;
        return f38539(var12, var13, var19, var20, var21, var22);
    }
    
    public static SubLObject f38539(final SubLObject var12, final SubLObject var13, SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var22) {
        var19 = conses_high.putf(var19, (SubLObject)$ic32$, (SubLObject)$ic33$);
        final SubLObject var23 = module0361.f24195(var12, var13);
        if (NIL != inference_datastructures_inference_oc.f25429(var23)) {
            Errors.error((SubLObject)$ic49$, var23);
        }
        else {
            if (NIL != inference_datastructures_inference_oc.f25431(var23)) {
                return f38542(var23, var19, var20, var21, var22);
            }
            Errors.error((SubLObject)$ic50$, inference_datastructures_inference_oc.f25420(var23));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38543() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0147.f9540($ic51$);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2096$.currentBinding(var1);
        try {
            module0147.$g2095$.bind(module0147.f9545(var3), var1);
            module0147.$g2094$.bind(module0147.f9546(var3), var1);
            module0147.$g2096$.bind(module0147.f9549(var3), var1);
            final SubLObject var7 = f38544();
            final SubLObject var8 = f38545();
            final SubLObject var9 = f38546();
            final SubLObject var10 = f38547();
            final SubLObject var11 = f38548();
            var2 = module0035.f2333((SubLObject)$ic52$, (SubLObject)ConsesLow.list(var7, var8, var9, var10, var11));
        }
        finally {
            module0147.$g2096$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
            module0147.$g2095$.rebind(var4, var1);
        }
        return var2;
    }
    
    public static SubLObject f38538(final SubLObject var17, final SubLObject var18, final SubLObject var26) {
        final SubLObject var27 = module0409.f28515(var17, var18, var26);
        final SubLObject var28 = module0361.f23996(inference_datastructures_inference_oc.f25421(var27));
        final SubLObject var29 = inference_datastructures_inference_oc.f25422(var27);
        final SubLObject var30 = module0623.f38415();
        if (NIL != var30) {
            f38530(var30, var28);
        }
        return Values.values(var27, var28, var29);
    }
    
    public static SubLObject f38535(final SubLObject var12, final SubLObject var13) {
        final SubLObject var14 = module0361.f23997(var12);
        final SubLObject var15 = module0623.f38415();
        if (NIL != var15) {
            f38531(var15, var12);
        }
        module0361.f24005(var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38542(final SubLObject var15, final SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        try {
            try {
                var23.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var26 = Errors.$error_handler$.currentBinding(var23);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic56$, var23);
                    try {
                        final SubLObject var31_42 = module0580.$g4361$.currentBinding(var23);
                        try {
                            module0580.$g4361$.bind((SubLObject)NIL, var23);
                            var23.resetMultipleValues();
                            final SubLObject var31_43 = module0580.$g4362$.currentBinding(var23);
                            try {
                                module0580.$g4362$.bind(module0580.f35560(), var23);
                                final SubLObject var27 = var23.secondMultipleValue();
                                var23.resetMultipleValues();
                                try {
                                    var23.resetMultipleValues();
                                    final SubLObject var31_44 = module0580.$g4358$.currentBinding(var23);
                                    try {
                                        module0580.$g4358$.bind(module0580.f35544(), var23);
                                        final SubLObject var28 = var23.secondMultipleValue();
                                        var23.resetMultipleValues();
                                        final SubLObject var31_45 = module0580.$g4359$.currentBinding(var23);
                                        try {
                                            module0580.$g4359$.bind(module0580.f35545(), var23);
                                            final SubLObject var29 = module0580.$g4358$.getDynamicValue(var23);
                                            final SubLObject var31_46 = module0034.$g879$.currentBinding(var23);
                                            try {
                                                module0034.$g879$.bind(var29, var23);
                                                SubLObject var30 = (SubLObject)NIL;
                                                if (NIL != var29 && NIL == module0034.f1842(var29)) {
                                                    var30 = module0034.f1869(var29);
                                                    final SubLObject var31 = Threads.current_process();
                                                    if (NIL == var30) {
                                                        module0034.f1873(var29, var31);
                                                    }
                                                    else if (!var30.eql(var31)) {
                                                        Errors.error((SubLObject)$ic57$);
                                                    }
                                                }
                                                try {
                                                    final SubLObject var32 = module0360.f23805(var19);
                                                    SubLObject var33 = (SubLObject)NIL;
                                                    var33 = module0059.f4332(Sequences.cconcatenate((SubLObject)$ic58$, module0006.f203(var15)), (SubLObject)$ic59$, (SubLObject)ConsesLow.list(var15, var32));
                                                    final SubLObject var34 = inference_datastructures_inference_oc.f25621(var15);
                                                    final SubLObject var35 = module0084.f5831($g4822$.getGlobalValue(), var15, (SubLObject)UNPROVIDED);
                                                    final SubLObject var36 = module0628.f38585(var15, var35, var21, var20, $g4820$.getDynamicValue(var23), var22, var34, var33);
                                                    while (NIL == module0628.f38623(var36)) {
                                                        module0628.f38587(var36);
                                                    }
                                                    var24 = module0628.f38590(var36);
                                                }
                                                finally {
                                                    final SubLObject var31_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var23);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var23);
                                                        if (NIL != var29 && NIL == var30) {
                                                            module0034.f1873(var29, (SubLObject)NIL);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var31_47, var23);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0034.$g879$.rebind(var31_46, var23);
                                            }
                                        }
                                        finally {
                                            module0580.$g4359$.rebind(var31_45, var23);
                                        }
                                        if (var28 == $ic60$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var23))) {
                                            module0034.f1891(module0580.$g4358$.getDynamicValue(var23));
                                        }
                                    }
                                    finally {
                                        module0580.$g4358$.rebind(var31_44, var23);
                                    }
                                }
                                finally {
                                    final SubLObject var31_48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var23);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var23);
                                        if (NIL == var27) {
                                            module0580.f35554(module0580.$g4362$.getDynamicValue(var23));
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var31_48, var23);
                                    }
                                }
                            }
                            finally {
                                module0580.$g4362$.rebind(var31_43, var23);
                            }
                        }
                        finally {
                            module0580.$g4361$.rebind(var31_42, var23);
                        }
                    }
                    catch (Throwable var37) {
                        Errors.handleThrowable(var37, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var26, var23);
                }
            }
            catch (Throwable var38) {
                var25 = Errors.handleThrowable(var38, module0003.$g3$.getGlobalValue());
            }
            finally {
                var23.throwStack.pop();
            }
        }
        finally {
            final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var23);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var23);
                SubLObject var40 = (SubLObject)NIL;
                try {
                    var23.throwStack.push($ic61$);
                    final SubLObject var31_49 = Errors.$error_handler$.currentBinding(var23);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic62$), var23);
                        try {
                            module0408.f28400(var15, (SubLObject)FIVE_INTEGER);
                        }
                        catch (Throwable var41) {
                            Errors.handleThrowable(var41, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var31_49, var23);
                    }
                }
                catch (Throwable var42) {
                    var40 = Errors.handleThrowable(var42, (SubLObject)$ic61$);
                    var23.throwStack.pop();
                }
                finally {
                    var23.throwStack.pop();
                }
                if (NIL != var25) {
                    Errors.error(var25);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var39, var23);
            }
        }
        return var24;
    }
    
    public static SubLObject f38549(final SubLObject var62) {
        final SubLObject var63 = f38550(var62);
        final SubLObject var64 = f38551(var62);
        final SubLObject var65 = module0360.f23782(var63);
        final SubLObject var66 = f38552(var62);
        final SubLObject var67 = f38553(var62);
        final SubLObject var68 = f38554(var62);
        final SubLObject var69 = f38555(var62);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? f38556(var69) : NIL);
        final SubLObject var71 = module0035.f2333((SubLObject)$ic63$, (SubLObject)ConsesLow.list(var63, var64, var65, var66, var67, var68, var70));
        return var71;
    }
    
    public static SubLObject f38556(final SubLObject var72) {
        final SubLObject var73 = f38557(var72);
        final SubLObject var74 = f38558(var72);
        final SubLObject var75 = f38559(var72);
        return (SubLObject)ConsesLow.list((SubLObject)$ic64$, var73, (SubLObject)$ic65$, var74, (SubLObject)$ic66$, var75);
    }
    
    public static SubLObject f38544() {
        final SubLObject var74 = module0259.f16848($ic67$, $ic51$, (SubLObject)UNPROVIDED);
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var74;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            final SubLObject var78 = f38549(var77);
            var75 = conses_high.putf(var75, var77, var78);
            var76 = var76.rest();
            var77 = var76.first();
        }
        return var75;
    }
    
    public static SubLObject f38545() {
        final SubLObject var74 = module0259.f16848($ic68$, $ic51$, (SubLObject)UNPROVIDED);
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var74;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            SubLObject var78 = f38549(var77);
            final SubLObject var79 = f38560(var77);
            final SubLObject var80 = f38561(var77);
            var78 = conses_high.putf(var78, (SubLObject)$ic69$, var79);
            var78 = conses_high.putf(var78, (SubLObject)$ic70$, var80);
            var75 = conses_high.putf(var75, var77, var78);
            var76 = var76.rest();
            var77 = var76.first();
        }
        return var75;
    }
    
    public static SubLObject f38546() {
        final SubLObject var74 = module0259.f16848($ic71$, $ic51$, (SubLObject)UNPROVIDED);
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var74;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            SubLObject var78 = f38549(var77);
            final SubLObject var79 = f38562(var77);
            final SubLObject var80 = f38563(var77);
            var78 = conses_high.putf(var78, (SubLObject)$ic69$, var79);
            var78 = conses_high.putf(var78, (SubLObject)$ic70$, var80);
            var75 = conses_high.putf(var75, var77, var78);
            var76 = var76.rest();
            var77 = var76.first();
        }
        return var75;
    }
    
    public static SubLObject f38547() {
        final SubLObject var74 = module0259.f16848($ic72$, $ic51$, (SubLObject)UNPROVIDED);
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var74;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            SubLObject var78 = f38549(var77);
            final SubLObject var79 = f38564(var77);
            var78 = conses_high.putf(var78, (SubLObject)$ic73$, var79);
            var75 = conses_high.putf(var75, var77, var78);
            var76 = var76.rest();
            var77 = var76.first();
        }
        return var75;
    }
    
    public static SubLObject f38548() {
        final SubLObject var74 = module0259.f16848($ic74$, $ic51$, (SubLObject)UNPROVIDED);
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var74;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            if (NIL == module0167.f10813(var77) && NIL == module0220.f14581($ic75$, var77, $ic76$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic77$) && NIL == module0533.f33218(var77)) {
                final SubLObject var78 = module0259.f16822(var77, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0035.f1997(var78) && $ic74$.eql(module0035.f2113(var78))) {
                    SubLObject var79 = f38549(var77);
                    var79 = conses_high.putf(var79, (SubLObject)$ic78$, (SubLObject)NIL);
                    var75 = conses_high.putf(var75, var77, var79);
                }
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        return var75;
    }
    
    public static SubLObject f38565(final SubLObject var62) {
        return module0259.f16854(var62, $ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38551(final SubLObject var62) {
        return (SubLObject)makeBoolean(NIL == f38565(var62));
    }
    
    public static SubLObject f38550(final SubLObject var79) {
        final SubLObject var80 = module0220.f14554(var79, $ic80$, $ic51$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic81$);
        if (NIL != module0202.f12589(var80, $ic82$)) {
            return module0205.f13277(var80, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38552(final SubLObject var79) {
        return module0231.f15293(var79, $ic51$);
    }
    
    public static SubLObject f38553(final SubLObject var79) {
        return module0231.f15294(var79, $ic51$);
    }
    
    public static SubLObject f38557(final SubLObject var72) {
        return module0231.f15296(var72);
    }
    
    public static SubLObject f38554(final SubLObject var79) {
        return module0231.f15295(var79, $ic83$, $ic51$);
    }
    
    public static SubLObject f38555(final SubLObject var79) {
        return module0231.f15297(var79, $ic83$, $ic51$);
    }
    
    public static SubLObject f38564(final SubLObject var79) {
        final SubLObject var80 = module0231.f15298(var79, $ic83$, $ic51$);
        SubLObject var81 = (SubLObject)NIL;
        if (NIL != module0202.f12677(var80)) {
            SubLObject var82 = module0202.f12760(var80);
            SubLObject var83 = (SubLObject)NIL;
            var83 = var82.first();
            while (NIL != var82) {
                final SubLObject var84 = f38556(var83);
                var81 = (SubLObject)ConsesLow.cons(var84, var81);
                var82 = var82.rest();
                var83 = var82.first();
            }
            return Sequences.nreverse(var81);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38560(final SubLObject var79) {
        final SubLObject var80 = module0231.f15298(var79, $ic83$, $ic51$);
        if (var80.eql($ic84$)) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (NIL != module0172.f10933($ic85$, var80)) {
            return module0205.f13277(var80, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38561(final SubLObject var79) {
        final SubLObject var80 = module0231.f15298(var79, $ic83$, $ic51$);
        if (var80.eql($ic84$)) {
            return (SubLObject)$ic86$;
        }
        if (NIL != module0172.f10933($ic85$, var80)) {
            return module0205.f13368(var80, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38562(final SubLObject var79) {
        final SubLObject var81;
        final SubLObject var80 = var81 = module0231.f15298(var79, $ic83$, $ic51$);
        if (var81.eql($ic87$)) {
            return (SubLObject)$ic88$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38563(final SubLObject var79) {
        final SubLObject var81;
        final SubLObject var80 = var81 = module0231.f15298(var79, $ic83$, $ic51$);
        if (var81.eql($ic87$)) {
            return (SubLObject)$ic89$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38558(final SubLObject var79) {
        return module0231.f15299(var79, $ic51$);
    }
    
    public static SubLObject f38559(final SubLObject var79) {
        return module0231.f15300(var79, $ic51$);
    }
    
    public static SubLObject f38566(final SubLObject var85, final SubLObject var86) {
        if (NIL != module0259.f16854(var85, $ic67$, $ic51$, (SubLObject)UNPROVIDED)) {
            return f38567(var85, var86);
        }
        if (NIL != module0259.f16854(var85, $ic68$, $ic51$, (SubLObject)UNPROVIDED)) {
            return f38568(var85, var86);
        }
        if (NIL != module0259.f16854(var85, $ic71$, $ic51$, (SubLObject)UNPROVIDED)) {
            return f38569(var85, var86);
        }
        if (NIL != module0259.f16854(var85, $ic72$, $ic51$, (SubLObject)UNPROVIDED)) {
            return f38570(var85, var86);
        }
        return f38571(var85, var86);
    }
    
    public static SubLObject f38572(final SubLObject var85, final SubLObject var86) {
        return (SubLObject)makeBoolean(NIL != module0206.f13444(var85) && conses_high.getf(var86, (SubLObject)$ic90$, (SubLObject)UNPROVIDED).isKeyword() && NIL != Types.booleanp(conses_high.getf(var86, (SubLObject)$ic78$, (SubLObject)UNPROVIDED)) && NIL != Types.booleanp(conses_high.getf(var86, (SubLObject)$ic91$, (SubLObject)UNPROVIDED)) && conses_high.getf(var86, (SubLObject)$ic65$, (SubLObject)UNPROVIDED).isString() && conses_high.getf(var86, (SubLObject)$ic66$, (SubLObject)UNPROVIDED).isString());
    }
    
    public static SubLObject f38570(final SubLObject var85, final SubLObject var86) {
        return (SubLObject)makeBoolean(NIL != f38572(var85, var86) && NIL != f38573(conses_high.getf(var86, (SubLObject)$ic73$, (SubLObject)UNPROVIDED)) && NIL != module0751.f47219(conses_high.getf(var86, (SubLObject)$ic92$, (SubLObject)$ic93$)) && NIL != module0751.f47219(conses_high.getf(var86, (SubLObject)$ic94$, (SubLObject)$ic93$)));
    }
    
    public static SubLObject f38571(final SubLObject var85, final SubLObject var86) {
        return f38572(var85, var86);
    }
    
    public static SubLObject f38567(final SubLObject var85, final SubLObject var86) {
        return (SubLObject)makeBoolean(NIL != f38572(var85, var86) && NIL != Types.booleanp(conses_high.getf(var86, (SubLObject)$ic92$, (SubLObject)$ic93$)) && NIL != Types.booleanp(conses_high.getf(var86, (SubLObject)$ic94$, (SubLObject)$ic93$)));
    }
    
    public static SubLObject f38568(final SubLObject var85, final SubLObject var86) {
        return (SubLObject)makeBoolean(NIL != f38572(var85, var86) && conses_high.getf(var86, (SubLObject)$ic69$, (SubLObject)$ic93$).isInteger() && ($ic86$ == conses_high.getf(var86, (SubLObject)$ic70$, (SubLObject)$ic93$) || conses_high.getf(var86, (SubLObject)$ic70$, (SubLObject)$ic93$).isInteger()));
    }
    
    public static SubLObject f38569(final SubLObject var85, final SubLObject var86) {
        return (SubLObject)makeBoolean(NIL != f38572(var85, var86) && conses_high.getf(var86, (SubLObject)$ic92$, (SubLObject)$ic93$).isNumber() && conses_high.getf(var86, (SubLObject)$ic69$, (SubLObject)$ic93$).isNumber() && conses_high.getf(var86, (SubLObject)$ic70$, (SubLObject)$ic93$).isNumber() && (NIL == conses_high.getf(var86, (SubLObject)$ic94$, (SubLObject)$ic93$) || conses_high.getf(var86, (SubLObject)$ic94$, (SubLObject)$ic93$).isNumber()));
    }
    
    public static SubLObject f38573(final SubLObject var77) {
        if (NIL == var77) {
            return (SubLObject)NIL;
        }
        SubLObject var78 = var77;
        SubLObject var79 = (SubLObject)NIL;
        var79 = var78.first();
        while (NIL != var78) {
            if (NIL == f38574(var79)) {
                return (SubLObject)NIL;
            }
            var78 = var78.rest();
            var79 = var78.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f38574(final SubLObject var87) {
        return (SubLObject)makeBoolean(NIL != module0035.f2013(var87) && conses_high.getf(var87, (SubLObject)$ic64$, (SubLObject)$ic93$) != $ic93$ && conses_high.getf(var87, (SubLObject)$ic65$, (SubLObject)UNPROVIDED).isString() && conses_high.getf(var87, (SubLObject)$ic66$, (SubLObject)UNPROVIDED).isString());
    }
    
    public static SubLObject f38575() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38525", "S#41514", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38526", "S#42153", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0626", "f38527", "S#42154");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0626", "f38528", "S#42155");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38529", "S#42156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38530", "S#42157", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38531", "S#42158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38532", "S#42159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38533", "S#42160", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38534", "S#42161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38536", "OPEN-CYC-START-CONTINUABLE-QUERY", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38537", "S#42162", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38540", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38541", "OPEN-CYC-CONTINUE-QUERY", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38539", "S#42163", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38543", "GET-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38538", "S#42164", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38535", "S#42165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38542", "S#42166", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38549", "S#42167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38556", "S#42168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38544", "S#42169", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38545", "S#42170", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38546", "S#42171", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38547", "S#42172", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38548", "S#42173", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38565", "S#42174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38551", "S#42175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38550", "S#42176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38552", "S#42177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38553", "S#42178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38557", "S#42179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38554", "S#42180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38555", "S#42181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38564", "S#42182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38560", "S#42183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38561", "S#42184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38562", "S#42185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38563", "S#42186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38558", "S#42187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38559", "S#42188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38566", "S#42189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38572", "S#42190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38570", "S#42191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38571", "S#42192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38567", "S#42193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38568", "S#42194", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38569", "S#42195", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38573", "S#42196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0626", "f38574", "S#42197", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38576() {
        $g4819$ = SubLFiles.defparameter("S#42198", (SubLObject)T);
        $g4820$ = SubLFiles.defparameter("S#42199", module0051.f3570((SubLObject)ONE_INTEGER));
        $g4821$ = SubLFiles.defvar("S#42200", (SubLObject)NIL);
        $g4822$ = SubLFiles.deflexical("S#42201", (NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g4822$.getGlobalValue() : module0084.f5827((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4823$ = SubLFiles.deflexical("S#42202", (NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g4823$.getGlobalValue() : StreamsLow.$standard_output$.getDynamicValue());
        $g4824$ = SubLFiles.deflexical("S#42203", (NIL != Symbols.boundp((SubLObject)$ic9$)) ? $g4824$.getGlobalValue() : Locks.make_lock((SubLObject)$ic10$));
        $g4825$ = SubLFiles.deflexical("S#42204", (NIL != Symbols.boundp((SubLObject)$ic19$)) ? $g4825$.getGlobalValue() : module0084.f5827(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38577() {
        module0003.f57((SubLObject)$ic7$);
        module0003.f57((SubLObject)$ic8$);
        module0003.f57((SubLObject)$ic9$);
        module0003.f57((SubLObject)$ic19$);
        module0012.f368((SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic39$, (SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic45$, (SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic53$, (SubLObject)NIL, (SubLObject)$ic54$, (SubLObject)NIL, (SubLObject)$ic55$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38575();
    }
    
    public void initializeVariables() {
        f38576();
    }
    
    public void runTopLevelForms() {
        f38577();
    }
    
    static {
        me = (SubLFile)new module0626();
        $g4819$ = null;
        $g4820$ = null;
        $g4821$ = null;
        $g4822$ = null;
        $g4823$ = null;
        $g4824$ = null;
        $g4825$ = null;
        $ic0$ = makeKeyword("NL-PREDS");
        $ic1$ = makeKeyword("DEFAULT");
        $ic2$ = makeKeyword("FORCE");
        $ic3$ = makeKeyword("NONE");
        $ic4$ = makeKeyword("LANGUAGE-MT");
        $ic5$ = makeKeyword("DOMAIN-MT");
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("MODE"), (SubLObject)makeKeyword("HTML"));
        $ic7$ = makeSymbol("S#42201", "CYC");
        $ic8$ = makeSymbol("S#42202", "CYC");
        $ic9$ = makeSymbol("S#42203", "CYC");
        $ic10$ = makeString("*synch-format-lock*");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#200", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#201", "CYC"));
        $ic12$ = makeSymbol("WITH-LOCK-HELD");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#42203", "CYC"));
        $ic14$ = makeSymbol("FORMAT");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FORCE-OUTPUT"), (SubLObject)makeSymbol("S#42202", "CYC")));
        $ic16$ = makeKeyword("CYC-PPH");
        $ic17$ = makeSymbol("WITH-PPH-MEMOIZATION");
        $ic18$ = makeSymbol("PROGN");
        $ic19$ = makeSymbol("S#42204", "CYC");
        $ic20$ = makeKeyword("NEW-ANSWER");
        $ic21$ = makeKeyword("SUSPENDED");
        $ic22$ = makeKeyword("STATUS-CHANGE");
        $ic23$ = makeKeyword("DEAD");
        $ic24$ = makeSymbol("S#42160", "CYC");
        $ic25$ = makeSymbol("S#12753", "CYC");
        $ic26$ = makeSymbol("S#12264", "CYC");
        $ic27$ = makeSymbol("S#26487", "CYC");
        $ic28$ = makeSymbol("OPEN-CYC-START-CONTINUABLE-QUERY");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#5852", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42205", "CYC"), (SubLObject)makeSymbol("S#42200", "CYC")), (SubLObject)makeSymbol("S#42206", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42207", "CYC"), (SubLObject)makeSymbol("S#42198", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42208", "CYC"), (SubLObject)T));
        $ic30$ = makeString("Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT. \n   This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. \n\n   INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. \n   NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. \n   INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n   If OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.\n\n@return Partial result 1: (:INFERENCE-START problem-store-id inference-id)\n        Partial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)\n  Destroy problem store and inference");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#12753", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#12264", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5852", "CYC"), (SubLObject)makeSymbol("S#26487", "CYC")));
        $ic32$ = makeKeyword("EVENTS");
        $ic33$ = ConsesLow.list((SubLObject)makeKeyword("NEW-ANSWER"), (SubLObject)makeKeyword("STATUS-CHANGE"));
        $ic34$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic35$ = makeString("Inference Communication Queue");
        $ic36$ = makeKeyword("INFERENCE-START");
        $ic37$ = makeString("Problem store ID: ~A ~%Inference ID: ~A~%");
        $ic38$ = makeSymbol("STRINGP");
        $ic39$ = makeSymbol("OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42209", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42002", "CYC"))));
        $ic41$ = makeString("Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT).");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42209", "CYC"), (SubLObject)makeSymbol("STRINGP")));
        $ic43$ = makeSymbol("INTEGERP");
        $ic44$ = makeSymbol("S#42147", "CYC");
        $ic45$ = makeSymbol("OPEN-CYC-CONTINUE-QUERY");
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("S#42210", "CYC"), (SubLObject)makeSymbol("S#35841", "CYC"), (SubLObject)makeSymbol("S#5852", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42205", "CYC"), (SubLObject)makeSymbol("S#42200", "CYC")), (SubLObject)makeSymbol("S#42206", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42207", "CYC"), (SubLObject)makeSymbol("S#42198", "CYC")));
        $ic47$ = makeString("Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)");
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42210", "CYC"), (SubLObject)makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35841", "CYC"), (SubLObject)makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5852", "CYC"), (SubLObject)makeSymbol("S#26487", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42205", "CYC"), (SubLObject)makeSymbol("S#42147", "CYC")));
        $ic49$ = makeString("Inference ~A is already running!~%");
        $ic50$ = makeString("Cannot ask query. Invalid inference-status: ~A~%");
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("CycAPIMt"));
        $ic52$ = ConsesLow.list((SubLObject)makeKeyword("BOOLEAN-INFERENCE-PARAMETERS"), (SubLObject)makeKeyword("INTEGER-INFERENCE-PARAMETERS"), (SubLObject)makeKeyword("REAL-NUMBER-INFERENCE-PARAMETERS"), (SubLObject)makeKeyword("ENUMERATION-INFERENCE-PARAMETERS"), (SubLObject)makeKeyword("OTHER-INFERENCE-PARAMETERS"));
        $ic53$ = makeSymbol("GET-INFERENCE-PARAMETER-INFORMATION");
        $ic54$ = makeString("Returns a property list of inference parameters\n   where keys are the value domain types (e.g. :boolean-inference-parameters,\n   :integer-inference-parameters, etc.) and values\n   are lists of inference parameters that take values\n   of that type. Each such value is a property list itself \n   where keys are inference parameters and values are\n   property lists that contain property/value pairs\n   appropriate for the parameter at hand according to\n   its value domain type.");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#748", "CYC"));
        $ic56$ = makeSymbol("S#38", "CYC");
        $ic57$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic58$ = makeString("Query thread ");
        $ic59$ = makeSymbol("CONTINUE-INFERENCE");
        $ic60$ = makeKeyword("NEW");
        $ic61$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic62$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic63$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("BASIC?"), (SubLObject)makeKeyword("QUERY-STATIC?"), (SubLObject)makeKeyword("SHORT-DESC"), (SubLObject)makeKeyword("LONG-DESC"), (SubLObject)makeKeyword("DEFAULT-VALUE"), (SubLObject)makeKeyword("ALTERNATE-VALUE"));
        $ic64$ = makeKeyword("VALUE");
        $ic65$ = makeKeyword("SHORT-DESC");
        $ic66$ = makeKeyword("LONG-DESC");
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("BooleanInferenceParameter"));
        $ic68$ = constant_handles_oc.f8479((SubLObject)makeString("IntegerInferenceParameter"));
        $ic69$ = makeKeyword("MIN-VALUE");
        $ic70$ = makeKeyword("MAX-VALUE");
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("RealNumberInferenceParameter"));
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("EnumerationInferenceParameter"));
        $ic73$ = makeKeyword("POTENTIAL-VALUES");
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceParameter"));
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic76$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceSupportedTerm"));
        $ic77$ = makeKeyword("FALSE");
        $ic78$ = makeKeyword("BASIC?");
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("AdvancedInferenceParameter"));
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("subLIdentifier"));
        $ic81$ = makeKeyword("TRUE");
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn"));
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("CycInferenceEngine"));
        $ic84$ = constant_handles_oc.f8479((SubLObject)makeString("NonNegativeInteger"));
        $ic85$ = constant_handles_oc.f8479((SubLObject)makeString("IntegerFromToFn"));
        $ic86$ = makeKeyword("INTEGER-PLUS-INFINITY");
        $ic87$ = constant_handles_oc.f8479((SubLObject)makeString("Real0-1"));
        $ic88$ = (SubLFloat)makeDouble(0.0);
        $ic89$ = (SubLFloat)makeDouble(1.0);
        $ic90$ = makeKeyword("NAME");
        $ic91$ = makeKeyword("QUERY-STATIC?");
        $ic92$ = makeKeyword("DEFAULT-VALUE");
        $ic93$ = makeKeyword("NO-VALUE-SPECIFIED");
        $ic94$ = makeKeyword("ALTERNATE-VALUE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 460 ms
	
	Decompiled with Procyon 0.5.32.
*/