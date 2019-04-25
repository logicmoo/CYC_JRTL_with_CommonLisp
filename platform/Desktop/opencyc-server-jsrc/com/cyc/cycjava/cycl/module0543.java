package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0543 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0543";
    public static final String myFingerPrint = "75f80fe8dff69f076c8f0137ddd1821aa0fde1d192c126eecafc5fec30231c63";
    public static SubLSymbol $g3953$;
    public static SubLSymbol $g3954$;
    public static SubLSymbol $g3955$;
    public static SubLSymbol $g3956$;
    private static SubLSymbol $g3957$;
    private static SubLSymbol $g3958$;
    private static SubLSymbol $g3959$;
    private static SubLSymbol $g3960$;
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
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLList $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    
    public static SubLObject f33618(final SubLObject var1) {
        return f33619(var1, (SubLObject)NIL);
    }
    
    public static SubLObject f33620(final SubLObject var1, final SubLObject var2) {
        if (NIL != f33621()) {
            final SubLObject var3 = module0538.f33340(var1, var2);
            SubLObject var4 = (SubLObject)NIL;
            if (var3 != $ic1$) {
                var4 = module0538.f33325();
            }
            f33622((SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0051.f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33465()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0051.f3558((SubLObject)UNPROVIDED))));
            if (var3 != $ic1$) {
                module0538.f33323(var4);
            }
            return var3;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33619(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != f33621()) {
            final SubLObject var3 = f33622((SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var1), ConsesLow.append((SubLObject)((NIL != var2) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic3$, var2)) : NIL), (SubLObject)NIL)));
            SubLObject var4 = (SubLObject)NIL;
            if (var3 != $ic1$) {
                var4 = module0538.f33325();
            }
            f33622((SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0051.f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33465()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0051.f3558((SubLObject)UNPROVIDED))));
            if (var3 != $ic1$) {
                module0538.f33323(var4);
            }
            return var3;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33623(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        try {
            var3.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var6 = Errors.$error_handler$.currentBinding(var3);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic5$, var3);
                try {
                    final SubLObject var8_9 = module0538.$g3923$.currentBinding(var3);
                    try {
                        module0538.$g3923$.bind((SubLObject)NIL, var3);
                        var4 = module0538.f33341(var1, var2);
                    }
                    finally {
                        module0538.$g3923$.rebind(var8_9, var3);
                    }
                }
                catch (Throwable var7) {
                    Errors.handleThrowable(var7, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var6, var3);
            }
        }
        catch (Throwable var8) {
            var5 = Errors.handleThrowable(var8, module0003.$g3$.getGlobalValue());
        }
        finally {
            var3.throwStack.pop();
        }
        if (NIL != var4) {
            module0575.f35294(module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, constants_high_oc.f10743(var4)), constants_high_oc.f10757(var4))));
            SubLObject var9 = (SubLObject)NIL;
            try {
                var3.throwStack.push($ic6$);
                final SubLObject var10 = Errors.$error_handler$.currentBinding(var3);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic7$), var3);
                    try {
                        final SubLObject var8_10 = module0538.$g3923$.currentBinding(var3);
                        try {
                            module0538.$g3923$.bind(var4, var3);
                            if (NIL != module0538.f33447(module0574.f35152(), module0538.f33467(), module0538.f33465(), module0538.f33468())) {
                                module0575.f35294(module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33467()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33465()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33468()))));
                            }
                        }
                        finally {
                            module0538.$g3923$.rebind(var8_10, var3);
                        }
                    }
                    catch (Throwable var11) {
                        Errors.handleThrowable(var11, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var10, var3);
                }
            }
            catch (Throwable var12) {
                var9 = Errors.handleThrowable(var12, (SubLObject)$ic6$);
            }
            finally {
                var3.throwStack.pop();
            }
            return var4;
        }
        if (NIL != var5) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var5));
        }
        if (NIL != module0538.f33324()) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list(module0538.f33325().first(), Functions.apply(Symbols.symbol_function((SubLObject)$ic9$), (SubLObject)ConsesLow.cons((SubLObject)NIL, module0538.f33325().rest()))));
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic10$);
    }
    
    public static SubLObject f33624(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0538.f33337(var1);
        if (NIL != var3) {
            return Values.values(var3, (SubLObject)NIL);
        }
        return f33623(var1, var2);
    }
    
    public static SubLObject f33625(final SubLObject var14) {
        if (NIL != f33621()) {
            final SubLObject var15 = constants_high_oc.f10757(var14);
            final SubLObject var16 = constants_high_oc.f10743(var14);
            final SubLObject var17 = module0617.f37871(var14, (SubLObject)UNPROVIDED);
            final SubLObject var18 = module0617.f37872(var14, (SubLObject)UNPROVIDED);
            final SubLObject var19 = module0617.f37874(var14, (SubLObject)UNPROVIDED);
            final SubLObject var20 = module0617.f37875(var14, (SubLObject)UNPROVIDED);
            f33626(var14);
            f33623(var16, var15);
            if (NIL != var17 && NIL != var18) {
                module0538.f33446(var17, var18, var19, var20);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33627(final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = (SubLObject)((NIL != constant_handles_oc.f8449(var19)) ? constants_high_oc.f10743(var19) : ((NIL != module0167.f10813(var19)) ? module0006.f204(module0172.f10920(var19)) : NIL));
        final SubLObject var23 = (SubLObject)((NIL != constant_handles_oc.f8449(var19)) ? Guids.guid_to_string(constants_high_oc.f10744(var19)) : NIL);
        if (NIL != f33621()) {
            if (NIL == module0127.f8414(var19)) {
                f33622((SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var19), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var20)));
            }
            if (NIL != $g3953$.getDynamicValue(var21) && var22.isString() && var23.isString()) {
                if (NIL != constant_handles_oc.f8449(var20) && NIL != var22) {
                    f33628((SubLObject)ConsesLow.list($ic17$, var20, var22), $ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != constant_handles_oc.f8449(var20) && NIL != var23) {
                    f33628((SubLObject)ConsesLow.list($ic19$, var20, var23), $ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                return var20;
            }
        }
        Errors.cerror((SubLObject)$ic20$, (SubLObject)$ic21$, var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33629(SubLObject var19, SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != module0127.f8414(var19)) {
            return Values.values((SubLObject)NIL, (SubLObject)$ic22$);
        }
        final SubLObject var22 = (SubLObject)((NIL != constant_handles_oc.f8449(var19)) ? constants_high_oc.f10743(var19) : ((NIL != module0167.f10813(var19)) ? module0006.f204(module0172.f10920(var19)) : NIL));
        final SubLObject var23 = (SubLObject)((NIL != constant_handles_oc.f8449(var19)) ? Guids.guid_to_string(constants_high_oc.f10744(var19)) : NIL);
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        var19 = Eval.eval(var19);
        var20 = Eval.eval(var20);
        var25 = module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var19), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var20)));
        try {
            var21.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var27 = Errors.$error_handler$.currentBinding(var21);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic5$, var21);
                try {
                    var24 = module0538.f33355(var19, var20);
                }
                catch (Throwable var28) {
                    Errors.handleThrowable(var28, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var27, var21);
            }
        }
        catch (Throwable var29) {
            var26 = Errors.handleThrowable(var29, module0003.$g3$.getGlobalValue());
        }
        finally {
            var21.throwStack.pop();
        }
        if (NIL != var24) {
            module0575.f35294(var25);
            if (NIL != $g3953$.getDynamicValue(var21) && var22.isString() && var23.isString()) {
                SubLObject var30 = (SubLObject)NIL;
                try {
                    var21.throwStack.push($ic6$);
                    final SubLObject var31 = Errors.$error_handler$.currentBinding(var21);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic7$), var21);
                        try {
                            final SubLObject var8_25 = module0147.$g2094$.currentBinding(var21);
                            final SubLObject var32 = module0147.$g2095$.currentBinding(var21);
                            try {
                                module0147.$g2094$.bind((SubLObject)$ic23$, var21);
                                module0147.$g2095$.bind($ic18$, var21);
                                SubLObject var33 = $ic17$;
                                if (NIL != module0158.f10010(var20, (SubLObject)ONE_INTEGER, var33)) {
                                    final SubLObject var34 = module0158.f10011(var20, (SubLObject)ONE_INTEGER, var33);
                                    SubLObject var35 = (SubLObject)NIL;
                                    final SubLObject var36 = (SubLObject)NIL;
                                    while (NIL == var35) {
                                        final SubLObject var37 = module0052.f3695(var34, var36);
                                        final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                                        if (NIL != var38) {
                                            SubLObject var39 = (SubLObject)NIL;
                                            try {
                                                var39 = module0158.f10316(var37, (SubLObject)$ic24$, (SubLObject)NIL, (SubLObject)NIL);
                                                SubLObject var29_34 = (SubLObject)NIL;
                                                final SubLObject var30_35 = (SubLObject)NIL;
                                                while (NIL == var29_34) {
                                                    final SubLObject var40 = module0052.f3695(var39, var30_35);
                                                    final SubLObject var32_37 = (SubLObject)makeBoolean(!var30_35.eql(var40));
                                                    if (NIL != var32_37) {
                                                        f33630(var40);
                                                    }
                                                    var29_34 = (SubLObject)makeBoolean(NIL == var32_37);
                                                }
                                            }
                                            finally {
                                                final SubLObject var8_26 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var21);
                                                    if (NIL != var39) {
                                                        module0158.f10319(var39);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_26, var21);
                                                }
                                            }
                                        }
                                        var35 = (SubLObject)makeBoolean(NIL == var38);
                                    }
                                }
                                var33 = $ic19$;
                                if (NIL != module0158.f10010(var20, (SubLObject)ONE_INTEGER, var33)) {
                                    final SubLObject var34 = module0158.f10011(var20, (SubLObject)ONE_INTEGER, var33);
                                    SubLObject var35 = (SubLObject)NIL;
                                    final SubLObject var36 = (SubLObject)NIL;
                                    while (NIL == var35) {
                                        final SubLObject var37 = module0052.f3695(var34, var36);
                                        final SubLObject var38 = (SubLObject)makeBoolean(!var36.eql(var37));
                                        if (NIL != var38) {
                                            SubLObject var39 = (SubLObject)NIL;
                                            try {
                                                var39 = module0158.f10316(var37, (SubLObject)$ic24$, (SubLObject)NIL, (SubLObject)NIL);
                                                SubLObject var29_35 = (SubLObject)NIL;
                                                final SubLObject var30_36 = (SubLObject)NIL;
                                                while (NIL == var29_35) {
                                                    final SubLObject var40 = module0052.f3695(var39, var30_36);
                                                    final SubLObject var32_38 = (SubLObject)makeBoolean(!var30_36.eql(var40));
                                                    if (NIL != var32_38) {
                                                        f33630(var40);
                                                    }
                                                    var29_35 = (SubLObject)makeBoolean(NIL == var32_38);
                                                }
                                            }
                                            finally {
                                                final SubLObject var8_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var21);
                                                    if (NIL != var39) {
                                                        module0158.f10319(var39);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_27, var21);
                                                }
                                            }
                                        }
                                        var35 = (SubLObject)makeBoolean(NIL == var38);
                                    }
                                }
                            }
                            finally {
                                module0147.$g2095$.rebind(var32, var21);
                                module0147.$g2094$.rebind(var8_25, var21);
                            }
                        }
                        catch (Throwable var41) {
                            Errors.handleThrowable(var41, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var31, var21);
                    }
                }
                catch (Throwable var42) {
                    var30 = Errors.handleThrowable(var42, (SubLObject)$ic6$);
                }
                finally {
                    var21.throwStack.pop();
                }
            }
            if (NIL != constant_handles_oc.f8449(var20)) {
                if (NIL != var22 && NIL != $g3953$.getDynamicValue(var21)) {
                    f33631((SubLObject)ConsesLow.list($ic17$, var20, var22), $ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var23) {
                    f33631((SubLObject)ConsesLow.list($ic19$, var20, var23), $ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            return var24;
        }
        if (NIL != var26) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var26));
        }
        if (NIL != module0538.f33324()) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list(module0538.f33325().first(), Functions.apply(Symbols.symbol_function((SubLObject)$ic9$), (SubLObject)ConsesLow.cons((SubLObject)NIL, module0538.f33325().rest()))));
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic10$);
    }
    
    public static SubLObject f33632(final SubLObject var43) {
        if (NIL == f33621()) {
            return (SubLObject)NIL;
        }
        if (NIL == module0173.f10955(var43) || NIL == module0127.f8414(var43)) {
            return f33622((SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var43)));
        }
        Errors.cerror((SubLObject)$ic20$, (SubLObject)$ic27$, var43);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33626(SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        var43 = Eval.eval(var43);
        var46 = module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var43)));
        try {
            var44.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var48 = Errors.$error_handler$.currentBinding(var44);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic5$, var44);
                try {
                    var45 = module0538.f33365(var43);
                }
                catch (Throwable var49) {
                    Errors.handleThrowable(var49, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var48, var44);
            }
        }
        catch (Throwable var50) {
            var47 = Errors.handleThrowable(var50, module0003.$g3$.getGlobalValue());
        }
        finally {
            var44.throwStack.pop();
        }
        if (NIL != var45) {
            module0575.f35294(var46);
            return var45;
        }
        if (NIL != var47) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var47));
        }
        if (NIL != module0538.f33324()) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list(module0538.f33325().first(), Functions.apply(Symbols.symbol_function((SubLObject)$ic9$), (SubLObject)ConsesLow.cons((SubLObject)NIL, module0538.f33325().rest()))));
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic10$);
    }
    
    public static SubLObject f33633(final SubLObject var14) {
        if (NIL != f33621()) {
            final SubLObject var15 = constants_high_oc.f10757(var14);
            final SubLObject var16 = constants_high_oc.f10743(var14);
            final SubLObject var17 = module0617.f37871(var14, (SubLObject)UNPROVIDED);
            final SubLObject var18 = module0617.f37872(var14, (SubLObject)UNPROVIDED);
            final SubLObject var19 = module0617.f37874(var14, (SubLObject)UNPROVIDED);
            final SubLObject var20 = module0617.f37875(var14, (SubLObject)UNPROVIDED);
            f33632(var14);
            module0538.f33340(var16, var15);
            if (NIL != var17 && NIL != var18) {
                module0538.f33446(var17, var18, var19, var20);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33634(final SubLObject var44, final SubLObject var45) {
        assert NIL != Types.stringp(var44) : var44;
        assert NIL != Types.stringp(var45) : var45;
        final SubLObject var46 = constants_high_oc.f10737(var44);
        if (NIL != var46) {
            final SubLObject var47 = constants_high_oc.f10737(var45);
            if (NIL == var47 || NIL == constant_handles_oc.f8463(var47, (SubLObject)UNPROVIDED)) {
                module0538.f33377(var46, var45);
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33635(final SubLObject var14, final SubLObject var1) {
        if (NIL != f33621()) {
            if (NIL == module0127.f8414(var14)) {
                return f33636(var14, var1);
            }
            Errors.cerror((SubLObject)$ic20$, (SubLObject)$ic33$, var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33637(final SubLObject var14, final SubLObject var1) {
        if (NIL == f33621()) {
            return (SubLObject)NIL;
        }
        if (NIL != module0127.f8414(var14)) {
            return f33636(var14, var1);
        }
        Errors.cerror((SubLObject)$ic34$, (SubLObject)$ic35$, var14);
        return f33635(var14, var1);
    }
    
    public static SubLObject f33636(final SubLObject var14, final SubLObject var1) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = constants_high_oc.f10743(var14);
        final SubLObject var17 = f33622((SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var14), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var1)));
        SubLObject var18 = (SubLObject)NIL;
        if (var17 != $ic1$) {
            var18 = module0538.f33325();
        }
        if (NIL != $g3954$.getDynamicValue(var15) && var16.isString()) {
            f33638(var14, var16);
        }
        module0745.f46272(var14);
        if (var17 != $ic1$) {
            module0538.f33323(var18);
        }
        return var17;
    }
    
    public static SubLObject f33638(final SubLObject var14, final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        assert NIL != constant_handles_oc.f8449(var14) : var14;
        assert NIL != Types.stringp(var44) : var44;
        if (NIL != module0220.f14545(var14, $ic38$, $ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var46 = module0147.$g2094$.currentBinding(var45);
            final SubLObject var47 = module0147.$g2095$.currentBinding(var45);
            try {
                module0147.$g2094$.bind((SubLObject)$ic23$, var45);
                module0147.$g2095$.bind($ic18$, var45);
                final SubLObject var48 = $ic38$;
                if (NIL != module0158.f10010(var14, (SubLObject)ONE_INTEGER, var48)) {
                    final SubLObject var49 = module0158.f10011(var14, (SubLObject)ONE_INTEGER, var48);
                    SubLObject var50 = (SubLObject)NIL;
                    final SubLObject var51 = (SubLObject)NIL;
                    while (NIL == var50) {
                        final SubLObject var52 = module0052.f3695(var49, var51);
                        final SubLObject var53 = (SubLObject)makeBoolean(!var51.eql(var52));
                        if (NIL != var53) {
                            SubLObject var54 = (SubLObject)NIL;
                            try {
                                var54 = module0158.f10316(var52, (SubLObject)$ic24$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var29_47 = (SubLObject)NIL;
                                final SubLObject var30_48 = (SubLObject)NIL;
                                while (NIL == var29_47) {
                                    final SubLObject var55 = module0052.f3695(var54, var30_48);
                                    final SubLObject var32_49 = (SubLObject)makeBoolean(!var30_48.eql(var55));
                                    if (NIL != var32_49) {
                                        f33639(var55);
                                    }
                                    var29_47 = (SubLObject)makeBoolean(NIL == var32_49);
                                }
                            }
                            finally {
                                final SubLObject var8_50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var45);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var45);
                                    if (NIL != var54) {
                                        module0158.f10319(var54);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_50, var45);
                                }
                            }
                        }
                        var50 = (SubLObject)makeBoolean(NIL == var53);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var47, var45);
                module0147.$g2094$.rebind(var46, var45);
            }
        }
        f33628((SubLObject)ConsesLow.list($ic38$, var14, var44), $ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var14;
    }
    
    public static SubLObject f33640(SubLObject var14, final SubLObject var1) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = constants_high_oc.f10743(var14);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        var14 = Eval.eval(var14);
        var18 = module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var14), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var1)));
        try {
            var15.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var20 = Errors.$error_handler$.currentBinding(var15);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic5$, var15);
                try {
                    var17 = module0538.f33377(var14, var1);
                }
                catch (Throwable var21) {
                    Errors.handleThrowable(var21, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var20, var15);
            }
        }
        catch (Throwable var22) {
            var19 = Errors.handleThrowable(var22, module0003.$g3$.getGlobalValue());
        }
        finally {
            var15.throwStack.pop();
        }
        if (NIL != var17) {
            module0575.f35294(var18);
            if (NIL != $g3954$.getDynamicValue(var15) && var16.isString()) {
                SubLObject var23 = (SubLObject)NIL;
                try {
                    var15.throwStack.push($ic6$);
                    final SubLObject var24 = Errors.$error_handler$.currentBinding(var15);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic7$), var15);
                        try {
                            final SubLObject var8_52 = module0147.$g2094$.currentBinding(var15);
                            final SubLObject var25 = module0147.$g2095$.currentBinding(var15);
                            try {
                                module0147.$g2094$.bind((SubLObject)$ic23$, var15);
                                module0147.$g2095$.bind($ic18$, var15);
                                final SubLObject var26 = $ic38$;
                                if (NIL != module0158.f10010(var14, (SubLObject)ONE_INTEGER, var26)) {
                                    final SubLObject var27 = module0158.f10011(var14, (SubLObject)ONE_INTEGER, var26);
                                    SubLObject var28 = (SubLObject)NIL;
                                    final SubLObject var29 = (SubLObject)NIL;
                                    while (NIL == var28) {
                                        final SubLObject var30 = module0052.f3695(var27, var29);
                                        final SubLObject var31 = (SubLObject)makeBoolean(!var29.eql(var30));
                                        if (NIL != var31) {
                                            SubLObject var32 = (SubLObject)NIL;
                                            try {
                                                var32 = module0158.f10316(var30, (SubLObject)$ic24$, (SubLObject)NIL, (SubLObject)NIL);
                                                SubLObject var29_53 = (SubLObject)NIL;
                                                final SubLObject var30_54 = (SubLObject)NIL;
                                                while (NIL == var29_53) {
                                                    final SubLObject var33 = module0052.f3695(var32, var30_54);
                                                    final SubLObject var32_55 = (SubLObject)makeBoolean(!var30_54.eql(var33));
                                                    if (NIL != var32_55) {
                                                        f33630(var33);
                                                    }
                                                    var29_53 = (SubLObject)makeBoolean(NIL == var32_55);
                                                }
                                            }
                                            finally {
                                                final SubLObject var8_53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                                    if (NIL != var32) {
                                                        module0158.f10319(var32);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_53, var15);
                                                }
                                            }
                                        }
                                        var28 = (SubLObject)makeBoolean(NIL == var31);
                                    }
                                }
                            }
                            finally {
                                module0147.$g2095$.rebind(var25, var15);
                                module0147.$g2094$.rebind(var8_52, var15);
                            }
                        }
                        catch (Throwable var34) {
                            Errors.handleThrowable(var34, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var24, var15);
                    }
                }
                catch (Throwable var35) {
                    var23 = Errors.handleThrowable(var35, (SubLObject)$ic6$);
                }
                finally {
                    var15.throwStack.pop();
                }
                f33631((SubLObject)ConsesLow.list($ic38$, var14, var16), $ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return var17;
            }
        }
        if (NIL != var19) {
            return Values.values((SubLObject)$ic8$, var19);
        }
        if (NIL != module0538.f33324()) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list(module0538.f33325().first(), Functions.apply(Symbols.symbol_function((SubLObject)$ic9$), (SubLObject)ConsesLow.cons((SubLObject)NIL, module0538.f33325().rest()))));
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic10$);
    }
    
    public static SubLObject f33628(final SubLObject var57, SubLObject var58, SubLObject var59, SubLObject var60) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        if (NIL == var59) {
            var59 = (SubLObject)$ic40$;
        }
        if (NIL != f33621()) {
            var58 = module0162.f10628(var58);
            final SubLObject var61 = f33622((SubLObject)ConsesLow.listS((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var57), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var58), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var59), ConsesLow.append((SubLObject)((NIL != var60) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic3$, var60)) : NIL), (SubLObject)NIL)));
            SubLObject var62 = (SubLObject)NIL;
            if (var61 != $ic1$) {
                var62 = module0538.f33325();
            }
            f33622((SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33467()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33465()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33468())));
            if (var61 != $ic1$) {
                module0538.f33323(var62);
            }
            return var61;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33641(final SubLObject var36, final SubLObject var59, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        assert NIL != module0130.f8507(var59) : var59;
        assert NIL != module0130.f8503(var60) : var60;
        if (NIL == f33621()) {
            return (SubLObject)NIL;
        }
        var61.resetMultipleValues();
        final SubLObject var62 = f33642(var36, var59, var60);
        final SubLObject var63 = var61.secondMultipleValue();
        final SubLObject var64 = var61.thirdMultipleValue();
        final SubLObject var65 = var61.fourthMultipleValue();
        var61.resetMultipleValues();
        if (NIL != var62) {
            final SubLObject var61_63 = f33643(var36);
            final SubLObject var62_64 = module0162.f10628(module0178.f11287(var36));
            module0575.f35294(module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic46$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var61_63), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var62_64), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var59), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var60))));
            return var62;
        }
        if (NIL != var63) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var63));
        }
        if (NIL != module0538.f33324()) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list(module0538.f33325().first(), Functions.apply(Symbols.symbol_function((SubLObject)$ic9$), (SubLObject)ConsesLow.cons((SubLObject)NIL, module0538.f33325().rest()))));
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic10$);
    }
    
    public static SubLObject f33642(final SubLObject var36, final SubLObject var59, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = f33643(var36);
        final SubLObject var63 = module0162.f10628(module0178.f11287(var36));
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        try {
            var61.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var66 = Errors.$error_handler$.currentBinding(var61);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic5$, var61);
                try {
                    var64 = module0538.f33396(var62, var63, var59, var60);
                }
                catch (Throwable var67) {
                    Errors.handleThrowable(var67, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var66, var61);
            }
        }
        catch (Throwable var68) {
            var65 = Errors.handleThrowable(var68, module0003.$g3$.getGlobalValue());
        }
        finally {
            var61.throwStack.pop();
        }
        return Values.values(var64, var65, var62, var63);
    }
    
    public static SubLObject f33644(final SubLObject var36, final SubLObject var59, final SubLObject var60) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != f33621()) {
            final SubLObject var61 = f33643(var36);
            final SubLObject var62 = module0162.f10628(module0178.f11287(var36));
            return f33622((SubLObject)ConsesLow.list((SubLObject)$ic46$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var61), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var62), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var59), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var60)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33645(final SubLObject var36, final SubLObject var59, final SubLObject var60) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != f33621()) {
            final SubLObject var61 = f33643(var36);
            final SubLObject var62 = module0162.f10628(module0178.f11287(var36));
            return f33622((SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var61), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var62), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var59), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var60)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33646(final SubLObject var36) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != module0178.f11314(var36)) {
            final SubLObject var37 = module0178.f11293(var36);
            f33641(var36, var37, (SubLObject)$ic48$);
            f33641(var36, var37, (SubLObject)$ic49$);
            return var36;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33647(final SubLObject var36) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != module0178.f11314(var36)) {
            final SubLObject var37 = module0178.f11293(var36);
            f33644(var36, var37, (SubLObject)$ic48$);
            f33644(var36, var37, (SubLObject)$ic49$);
            return var36;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33648(final SubLObject var36) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != module0178.f11314(var36)) {
            final SubLObject var37 = module0178.f11293(var36);
            f33642(var36, var37, (SubLObject)$ic48$);
            f33642(var36, var37, (SubLObject)$ic49$);
            return var36;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33649(final SubLObject var36) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != module0178.f11314(var36)) {
            final SubLObject var37 = module0178.f11293(var36);
            f33645(var36, var37, (SubLObject)$ic48$);
            f33645(var36, var37, (SubLObject)$ic49$);
            return var36;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33631(final SubLObject var57, final SubLObject var58, SubLObject var59, SubLObject var60) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)$ic40$;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        return f33650(var57, var58, var59, var60, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33651(final SubLObject var57, final SubLObject var58, SubLObject var59, SubLObject var60) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)$ic40$;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        return f33650(var57, var58, var59, var60, (SubLObject)$ic53$);
    }
    
    public static SubLObject f33652(final SubLObject var57, final SubLObject var58, SubLObject var59, SubLObject var60) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)$ic40$;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (NIL != f33621()) {
            SubLObject var62 = (SubLObject)NIL;
            SubLObject var63 = (SubLObject)NIL;
            final SubLObject var64 = module0131.$g1537$.currentBinding(var61);
            try {
                module0131.$g1537$.bind((SubLObject)NIL, var61);
                var61.resetMultipleValues();
                final SubLObject var65_66 = f33631(var57, var58, var59, var60);
                final SubLObject var67_68 = var61.secondMultipleValue();
                var61.resetMultipleValues();
                var62 = var65_66;
                var63 = var67_68;
            }
            finally {
                module0131.$g1537$.rebind(var64, var61);
            }
            f33649(module0288.f19338(var57, var58));
            return Values.values(var62, var63);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33650(final SubLObject var57, final SubLObject var58, final SubLObject var59, final SubLObject var60, SubLObject var69) {
        if (var69 == UNPROVIDED) {
            var69 = $g3955$.getDynamicValue();
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        final SubLObject var73 = module0162.f10628(var58);
        SubLObject var74 = (SubLObject)NIL;
        if (NIL == module0018.$g629$.getDynamicValue(var70)) {
            try {
                var70.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var75 = Errors.$error_handler$.currentBinding(var70);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic5$, var70);
                    try {
                        final SubLObject var8_71 = module0538.$g3924$.currentBinding(var70);
                        try {
                            module0538.$g3924$.bind((SubLObject)NIL, var70);
                            final SubLObject var76 = module0528.f32898();
                            assert NIL != module0055.f4006(var76) : var76;
                            final SubLObject var8_72 = module0131.$g1538$.currentBinding(var70);
                            try {
                                module0131.$g1538$.bind(var76, var70);
                                final SubLObject var77 = (SubLObject)ConsesLow.list((SubLObject)$ic60$, var59, (SubLObject)$ic61$, var60);
                                if (NIL != Functions.funcall(var69, var57, var58, var59, var60)) {
                                    var71 = module0540.f33517(var57, var73, var77);
                                }
                                else {
                                    var71 = module0540.f33516(var57, var73, var77);
                                }
                            }
                            finally {
                                module0131.$g1538$.rebind(var8_72, var70);
                            }
                            var74 = module0538.$g3924$.getDynamicValue(var70);
                        }
                        finally {
                            module0538.$g3924$.rebind(var8_71, var70);
                        }
                    }
                    catch (Throwable var78) {
                        Errors.handleThrowable(var78, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var75, var70);
                }
            }
            catch (Throwable var79) {
                var72 = Errors.handleThrowable(var79, module0003.$g3$.getGlobalValue());
            }
            finally {
                var70.throwStack.pop();
            }
        }
        else {
            final SubLObject var75 = module0538.$g3924$.currentBinding(var70);
            try {
                module0538.$g3924$.bind((SubLObject)NIL, var70);
                final SubLObject var80 = module0528.f32898();
                assert NIL != module0055.f4006(var80) : var80;
                final SubLObject var8_73 = module0131.$g1538$.currentBinding(var70);
                try {
                    module0131.$g1538$.bind(var80, var70);
                    final SubLObject var81 = (SubLObject)ConsesLow.list((SubLObject)$ic60$, var59, (SubLObject)$ic61$, var60);
                    if (NIL != Functions.funcall(var69, var57, var58, var59, var60)) {
                        var71 = module0540.f33517(var57, var73, var81);
                    }
                    else {
                        var71 = module0540.f33516(var57, var73, var81);
                    }
                }
                finally {
                    module0131.$g1538$.rebind(var8_73, var70);
                }
                var74 = module0538.$g3924$.getDynamicValue(var70);
            }
            finally {
                module0538.$g3924$.rebind(var75, var70);
            }
        }
        if (NIL != var71) {
            module0575.f35294(module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var57), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var73), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var59), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var60))));
            SubLObject var82 = (SubLObject)NIL;
            try {
                var70.throwStack.push($ic6$);
                final SubLObject var83 = Errors.$error_handler$.currentBinding(var70);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic7$), var70);
                    try {
                        final SubLObject var8_74 = module0538.$g3924$.currentBinding(var70);
                        try {
                            module0538.$g3924$.bind(var74, var70);
                            if (NIL != module0538.f33371(module0574.f35152(), module0538.f33467(), module0538.f33465(), module0538.f33468())) {
                                module0575.f35294(module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33467()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33465()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33468()))));
                            }
                        }
                        finally {
                            module0538.$g3924$.rebind(var8_74, var70);
                        }
                    }
                    catch (Throwable var84) {
                        Errors.handleThrowable(var84, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var83, var70);
                }
            }
            catch (Throwable var85) {
                var82 = Errors.handleThrowable(var85, (SubLObject)$ic6$);
            }
            finally {
                var70.throwStack.pop();
            }
            return Values.values(var71, (SubLObject)NIL);
        }
        if (NIL != var72) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var72));
        }
        if (NIL != module0538.f33324()) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list(module0538.f33325().first(), Functions.apply(Symbols.symbol_function((SubLObject)$ic9$), (SubLObject)ConsesLow.cons((SubLObject)NIL, module0538.f33325().rest()))));
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic10$);
    }
    
    public static SubLObject f33653(final SubLObject var57, final SubLObject var58, SubLObject var59, SubLObject var60) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)$ic40$;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        return f33654(var57, var58, var59, var60, (SubLObject)NIL);
    }
    
    public static SubLObject f33655(final SubLObject var57, final SubLObject var58, SubLObject var59, SubLObject var60) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)$ic40$;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        return f33654(var57, var58, var59, var60, (SubLObject)T);
    }
    
    public static SubLObject f33654(final SubLObject var57, final SubLObject var58, final SubLObject var59, final SubLObject var60, final SubLObject var78) {
        SubLObject var79 = (SubLObject)NIL;
        if (NIL != module0274.f18060(var57, var58, (SubLObject)UNPROVIDED)) {
            var79 = f33656(var57, var58, var59, var60, var78);
        }
        else {
            final SubLObject var80 = module0275.f18234(var57, var58);
            if (NIL != var80) {
                SubLObject var81 = var80;
                SubLObject var82 = (SubLObject)NIL;
                var82 = var81.first();
                while (NIL != var81) {
                    f33656(var82, var58, var59, var60, var78);
                    var81 = var81.rest();
                    var82 = var81.first();
                }
                var79 = f33656(var57, var58, var59, var60, var78);
            }
        }
        return var79;
    }
    
    public static SubLObject f33656(final SubLObject var57, final SubLObject var58, final SubLObject var59, final SubLObject var60, final SubLObject var78) {
        return (NIL != var78) ? f33631(var57, var58, var59, var60) : f33628(var57, var58, var59, var60);
    }
    
    public static SubLObject f33657(final SubLObject var61, SubLObject var58) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL == f33621()) {
            return (SubLObject)NIL;
        }
        var58 = module0162.f10628(var58);
        if (NIL == $g3956$.getDynamicValue(var62) || NIL != module0538.f33373(var61, var58)) {
            return f33622((SubLObject)ConsesLow.list((SubLObject)$ic63$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var61), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var58)));
        }
        Errors.error((SubLObject)$ic64$, var61, var58);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33639(final SubLObject var36) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        return f33657(f33643(var36), module0178.f11287(var36));
    }
    
    public static SubLObject f33658(final SubLObject var57, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        final SubLObject var62 = module0162.f10628(var58);
        final SubLObject var63 = module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic63$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var57), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var62)));
        try {
            var59.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var64 = Errors.$error_handler$.currentBinding(var59);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic5$, var59);
                try {
                    var60 = module0538.f33400(var57, var62);
                }
                catch (Throwable var65) {
                    Errors.handleThrowable(var65, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var64, var59);
            }
        }
        catch (Throwable var66) {
            var61 = Errors.handleThrowable(var66, module0003.$g3$.getGlobalValue());
        }
        finally {
            var59.throwStack.pop();
        }
        if (NIL != var60) {
            module0575.f35294(var63);
            return var60;
        }
        if (NIL != var61) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var61));
        }
        if (NIL != module0538.f33324()) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list(module0538.f33325().first(), Functions.apply(Symbols.symbol_function((SubLObject)$ic9$), (SubLObject)ConsesLow.cons((SubLObject)NIL, module0538.f33325().rest()))));
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic10$);
    }
    
    public static SubLObject f33630(final SubLObject var36) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != assertion_handles_oc.f11041(var36, (SubLObject)UNPROVIDED)) {
            return f33658(f33643(var36), module0178.f11287(var36));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33659(final SubLObject var83, final SubLObject var84, final SubLObject var85, SubLObject var86, SubLObject var59, SubLObject var60) {
        if (var86 == UNPROVIDED) {
            var86 = var85;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)$ic40$;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        final SubLObject var87 = module0162.f10628(var85);
        final SubLObject var88 = module0162.f10628(var86);
        if (NIL == $g3957$.getGlobalValue()) {
            f33657(var83, var87);
            return f33628(var84, var88, var59, var60);
        }
        if (NIL != f33621()) {
            final SubLObject var89 = f33622((SubLObject)ConsesLow.listS((SubLObject)$ic69$, new SubLObject[] { ConsesLow.list((SubLObject)$ic3$, var83), ConsesLow.list((SubLObject)$ic3$, var84), ConsesLow.list((SubLObject)$ic3$, var87), ConsesLow.list((SubLObject)$ic3$, var88), ConsesLow.list((SubLObject)$ic3$, var59), ConsesLow.append((SubLObject)((NIL != var60) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic3$, var60)) : NIL), (SubLObject)NIL) }));
            SubLObject var90 = (SubLObject)NIL;
            if (var89 != $ic1$) {
                var90 = module0538.f33325();
            }
            f33622((SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33467()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33465()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0538.f33468())));
            if (var89 != $ic1$) {
                module0538.f33323(var90);
            }
            return var89;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33660(final SubLObject var83, final SubLObject var84, final SubLObject var85, SubLObject var86, SubLObject var59, SubLObject var60) {
        if (var86 == UNPROVIDED) {
            var86 = var85;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)$ic40$;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        final SubLThread var87 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var87) && NIL != $g3957$.getGlobalValue()) {
            Errors.error((SubLObject)$ic70$);
        }
        final SubLObject var88 = module0162.f10628(var85);
        final SubLObject var89 = module0162.f10628(var86);
        f33658(var83, var88);
        return f33631(var84, var89, var59, var60);
    }
    
    public static SubLObject f33661(final SubLObject var36, final SubLObject var84, SubLObject var86, SubLObject var59, SubLObject var60) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != module0178.f11375(var36)) {
            final SubLObject var87 = f33643(var36);
            final SubLObject var88 = module0178.f11287(var36);
            final SubLObject var89 = module0178.f11293(var36);
            final SubLObject var90 = module0178.f11291(var36);
            if (NIL == var86) {
                var86 = var88;
            }
            if (NIL == var59) {
                var59 = var89;
            }
            if (NIL == var60) {
                var60 = var90;
            }
            return f33659(var87, var84, var88, var86, var59, var60);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33662(final SubLObject var36, final SubLObject var91, final SubLObject var84, SubLObject var86, SubLObject var59, SubLObject var60) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        return f33663(var36, var91, var84, var86, var59, var60, (SubLObject)NIL);
    }
    
    public static SubLObject f33664(final SubLObject var36, final SubLObject var91, final SubLObject var84, SubLObject var86, SubLObject var59, SubLObject var60) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        return f33663(var36, var91, var84, var86, var59, var60, (SubLObject)T);
    }
    
    public static SubLObject f33663(final SubLObject var36, SubLObject var91, final SubLObject var84, SubLObject var86, SubLObject var59, SubLObject var60, final SubLObject var78) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != module0178.f11375(var36)) {
            if (var91 == $ic71$) {
                var91 = module0211.f13701(var36);
            }
            final SubLObject var92 = f33643(var36);
            final SubLObject var93 = module0178.f11287(var36);
            final SubLObject var94 = module0178.f11293(var36);
            final SubLObject var95 = module0178.f11291(var36);
            if (NIL == var86) {
                var86 = var93;
            }
            if (NIL == var59) {
                var59 = var94;
            }
            if (NIL == var60) {
                var60 = var95;
            }
            final SubLObject var96 = f33665(var36, var91, var84, var86);
            final SubLObject var97 = (NIL != var78) ? f33660(var92, var84, var93, var86, var59, var60) : f33659(var92, var84, var93, var86, var59, var60);
            SubLObject var98 = var96;
            SubLObject var99 = (SubLObject)NIL;
            var99 = var98.first();
            while (NIL != var98) {
                SubLObject var101;
                final SubLObject var100 = var101 = var99;
                SubLObject var102 = (SubLObject)NIL;
                SubLObject var103 = (SubLObject)NIL;
                SubLObject var104 = (SubLObject)NIL;
                SubLObject var105 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)$ic72$);
                var102 = var101.first();
                var101 = var101.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)$ic72$);
                var103 = var101.first();
                var101 = var101.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)$ic72$);
                var104 = var101.first();
                var101 = var101.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)$ic72$);
                var105 = var101.first();
                var101 = var101.rest();
                if (NIL == var101) {
                    if (NIL != var78) {
                        f33631(var102, var103, var104, var105);
                    }
                    else {
                        f33628(var102, var103, var104, var105);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var100, (SubLObject)$ic72$);
                }
                var98 = var98.rest();
                var99 = var98.first();
            }
            return var97;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33666(final SubLObject var36, final SubLObject var84, SubLObject var86, SubLObject var59, SubLObject var60) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        return f33662(var36, (SubLObject)$ic71$, var84, var86, var59, var60);
    }
    
    public static SubLObject f33667(final SubLObject var36, final SubLObject var84, SubLObject var86, SubLObject var59, SubLObject var60) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        return f33664(var36, (SubLObject)$ic71$, var84, var86, var59, var60);
    }
    
    public static SubLObject f33668(final SubLObject var36) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        if (NIL != module0178.f11375(var36)) {
            final SubLObject var37 = module0211.f13701(var36);
            final SubLObject var38 = module0289.f19396(var36);
            return f33662(var36, var37, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33665(final SubLObject var36, final SubLObject var91, final SubLObject var84, final SubLObject var86) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        SubLObject var93 = (SubLObject)NIL;
        final SubLObject var94 = module0289.$g2649$.currentBinding(var92);
        try {
            module0289.$g2649$.bind((SubLObject)T, var92);
            var92.resetMultipleValues();
            final SubLObject var95 = module0289.f19396(var36);
            final SubLObject var96 = var92.secondMultipleValue();
            var92.resetMultipleValues();
            SubLObject var97 = var91;
            SubLObject var98 = (SubLObject)NIL;
            var98 = var97.first();
            while (NIL != var97) {
                var92.resetMultipleValues();
                final SubLObject var99 = f33669(var98);
                final SubLObject var100 = var92.secondMultipleValue();
                var92.resetMultipleValues();
                var92.resetMultipleValues();
                final SubLObject var101 = module0289.f19396(var99);
                final SubLObject var102 = var92.secondMultipleValue();
                var92.resetMultipleValues();
                final SubLObject var103 = module0202.f12768($ic74$, var86, var84);
                final SubLObject var104 = module0205.f13250(var103, var95, var101, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                final SubLObject var105 = module0178.f11293(var99);
                final SubLObject var106 = module0178.f11291(var99);
                var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var104, var100, var105, var106), var93);
                var97 = var97.rest();
                var98 = var97.first();
            }
            var93 = Sequences.nreverse(var93);
        }
        finally {
            module0289.$g2649$.rebind(var94, var92);
        }
        return var93;
    }
    
    public static SubLObject f33669(final SubLObject var103) {
        if (NIL != assertion_handles_oc.f11035(var103)) {
            return Values.values(var103, module0178.f11287(var103));
        }
        SubLObject var104 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var103, var103, (SubLObject)$ic75$);
        var104 = var103.first();
        SubLObject var105 = var103.rest();
        final SubLObject var106 = (SubLObject)(var105.isCons() ? var105.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var105, var103, (SubLObject)$ic75$);
        var105 = var105.rest();
        if (NIL == var105) {
            return Values.values(var104, (NIL != var106) ? var106 : module0178.f11287(var104));
        }
        cdestructuring_bind.cdestructuring_bind_error(var103, (SubLObject)$ic75$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33670(final SubLObject var110, final SubLObject var111, SubLObject var91) {
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        assert NIL != assertion_handles_oc.f11035(var110) : var110;
        final SubLObject var112 = f33671(var110);
        if (NIL == f33672(var112, var111)) {
            Errors.error((SubLObject)$ic76$);
        }
        return f33673(var110, var111, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var91);
    }
    
    public static SubLObject f33674(final SubLObject var36, SubLObject var91) {
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        final SubLObject var92 = f33671(var36);
        return f33673(var36, var92, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var91);
    }
    
    public static SubLObject f33675(final SubLObject var36, SubLObject var91) {
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        final SubLObject var92 = f33671(var36);
        return f33676(var36, var92, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var91);
    }
    
    public static SubLObject f33673(final SubLObject var110, final SubLObject var111, SubLObject var86, SubLObject var59, SubLObject var60, SubLObject var91) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var110) : var110;
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0111.$g1405$.currentBinding(var112);
        final SubLObject var115 = module0538.$g3931$.currentBinding(var112);
        final SubLObject var116 = module0111.$g1408$.currentBinding(var112);
        final SubLObject var117 = module0538.$g3932$.currentBinding(var112);
        final SubLObject var118 = module0539.$g3936$.currentBinding(var112);
        try {
            module0111.$g1405$.bind(module0178.f11295(var110), var112);
            module0538.$g3931$.bind(module0178.f11296(var110), var112);
            module0111.$g1408$.bind(module0178.f11297(var110), var112);
            module0538.$g3932$.bind(module0178.f11298(var110), var112);
            module0539.$g3936$.bind(module0539.f33494(module0111.$g1405$.getDynamicValue(var112), module0538.$g3931$.getDynamicValue(var112), module0111.$g1408$.getDynamicValue(var112), module0538.$g3932$.getDynamicValue(var112)), var112);
            var113 = f33662(var110, var91, var111, var86, var59, var60);
        }
        finally {
            module0539.$g3936$.rebind(var118, var112);
            module0538.$g3932$.rebind(var117, var112);
            module0111.$g1408$.rebind(var116, var112);
            module0538.$g3931$.rebind(var115, var112);
            module0111.$g1405$.rebind(var114, var112);
        }
        return var113;
    }
    
    public static SubLObject f33676(final SubLObject var110, final SubLObject var111, SubLObject var86, SubLObject var59, SubLObject var60, SubLObject var91) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var110) : var110;
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0111.$g1405$.currentBinding(var112);
        final SubLObject var115 = module0538.$g3931$.currentBinding(var112);
        final SubLObject var116 = module0111.$g1408$.currentBinding(var112);
        final SubLObject var117 = module0538.$g3932$.currentBinding(var112);
        final SubLObject var118 = module0539.$g3936$.currentBinding(var112);
        try {
            module0111.$g1405$.bind(module0178.f11295(var110), var112);
            module0538.$g3931$.bind(module0178.f11296(var110), var112);
            module0111.$g1408$.bind(module0178.f11297(var110), var112);
            module0538.$g3932$.bind(module0178.f11298(var110), var112);
            module0539.$g3936$.bind(module0539.f33494(module0111.$g1405$.getDynamicValue(var112), module0538.$g3931$.getDynamicValue(var112), module0111.$g1408$.getDynamicValue(var112), module0538.$g3932$.getDynamicValue(var112)), var112);
            var113 = f33664(var110, var91, var111, var86, var59, var60);
        }
        finally {
            module0539.$g3936$.rebind(var118, var112);
            module0538.$g3932$.rebind(var117, var112);
            module0111.$g1408$.rebind(var116, var112);
            module0538.$g3931$.rebind(var115, var112);
            module0111.$g1405$.rebind(var114, var112);
        }
        return var113;
    }
    
    public static SubLObject f33672(final SubLObject var117, final SubLObject var118) {
        return f33677(var117, var118, Symbols.symbol_function((SubLObject)$ic32$), Symbols.symbol_function((SubLObject)EQUAL));
    }
    
    public static SubLObject f33677(final SubLObject var119, final SubLObject var120, final SubLObject var121, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (NIL != Functions.funcall(var121, var119) && NIL != Functions.funcall(var121, var120)) {
            return (SubLObject)T;
        }
        if (var119.isAtom() && var120.isAtom()) {
            return Functions.funcall(var122, var119, var120);
        }
        if (!var119.isCons() || !var120.isCons()) {
            return (SubLObject)NIL;
        }
        if (NIL == f33677(var119.first(), var120.first(), var121, var122)) {
            return (SubLObject)NIL;
        }
        return f33677(var119.rest(), var120.rest(), var121, var122);
    }
    
    public static SubLObject f33678(final SubLObject var57, final SubLObject var58) {
        if (NIL != f33621()) {
            return f33622((SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var57), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0162.f10628(var58))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33679(final SubLObject var36) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        return f33678(f33643(var36), module0178.f11287(var36));
    }
    
    public static SubLObject f33680(final SubLObject var57, final SubLObject var123, final SubLObject var58) {
        assert NIL != module0202.f12590(var57) : var57;
        assert NIL != module0035.f2292(var123) : var123;
        return f33622((SubLObject)ConsesLow.list((SubLObject)$ic80$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var57), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var123), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0162.f10628(var58))));
    }
    
    public static SubLObject f33681(final SubLObject var57, final SubLObject var58, final SubLObject var124, SubLObject var60, SubLObject var125) {
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (NIL != f33621()) {
            return f33622((SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var57), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0162.f10628(var58)), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var124), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var60), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var125)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33682(final SubLObject var57, final SubLObject var58, final SubLObject var124, SubLObject var60, SubLObject var125, SubLObject var126) {
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (var126 == UNPROVIDED) {
            var126 = (SubLObject)makeBoolean(NIL == module0538.$g3929$.getDynamicValue());
        }
        final SubLThread var127 = SubLProcess.currentSubLThread();
        SubLObject var128 = (SubLObject)NIL;
        SubLObject var129 = (SubLObject)NIL;
        final SubLObject var130 = module0162.f10628(var58);
        if (NIL == module0018.$g629$.getDynamicValue(var127)) {
            try {
                var127.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var131 = Errors.$error_handler$.currentBinding(var127);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic5$, var127);
                    try {
                        final SubLObject var132 = module0528.f32898();
                        assert NIL != module0055.f4006(var132) : var132;
                        final SubLObject var8_127 = module0131.$g1538$.currentBinding(var127);
                        try {
                            module0131.$g1538$.bind(var132, var127);
                            final SubLObject var133 = (SubLObject)ConsesLow.list((SubLObject)$ic61$, var60, (SubLObject)$ic82$, var126);
                            var128 = module0540.f33520(var57, var124, var130, var133, var125);
                        }
                        finally {
                            module0131.$g1538$.rebind(var8_127, var127);
                        }
                    }
                    catch (Throwable var134) {
                        Errors.handleThrowable(var134, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var131, var127);
                }
            }
            catch (Throwable var135) {
                var129 = Errors.handleThrowable(var135, module0003.$g3$.getGlobalValue());
            }
            finally {
                var127.throwStack.pop();
            }
        }
        else {
            final SubLObject var136 = module0528.f32898();
            assert NIL != module0055.f4006(var136) : var136;
            final SubLObject var137 = module0131.$g1538$.currentBinding(var127);
            try {
                module0131.$g1538$.bind(var136, var127);
                final SubLObject var138 = (SubLObject)ConsesLow.list((SubLObject)$ic61$, var60, (SubLObject)$ic82$, var126);
                var128 = module0540.f33520(var57, var124, var130, var138, var125);
            }
            finally {
                module0131.$g1538$.rebind(var137, var127);
            }
        }
        if (NIL != var128) {
            module0575.f35295(module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var57), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var130), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var124), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var60), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var125))));
            return Values.values(var128, (SubLObject)NIL);
        }
        if (NIL != var129) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var129));
        }
        if (NIL != module0538.f33324()) {
            return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list(module0538.f33325().first(), Functions.apply(Symbols.symbol_function((SubLObject)$ic9$), (SubLObject)ConsesLow.cons((SubLObject)NIL, module0538.f33325().rest()))));
        }
        return Values.values((SubLObject)NIL, (SubLObject)$ic10$);
    }
    
    public static SubLObject f33683(final SubLObject var57, final SubLObject var58, final SubLObject var124) {
        if (NIL != f33621()) {
            return f33622((SubLObject)ConsesLow.list((SubLObject)$ic83$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var57), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0162.f10628(var58)), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var124)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33684(final SubLObject var128) {
        assert NIL != deduction_handles_oc.f11659(var128) : var128;
        final SubLObject var129 = module0188.f11788(var128);
        final SubLObject var130 = module0188.f11770(var128);
        final SubLObject var131 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic85$), var130);
        return f33683(f33643(var129), module0178.f11287(var129), var131);
    }
    
    public static SubLObject f33685(final SubLObject var43, SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var43) : var43;
        return f33622((SubLObject)ConsesLow.listS((SubLObject)$ic87$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var43), ConsesLow.append((SubLObject)((NIL != var58) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic3$, module0162.f10628(var58))) : NIL), (SubLObject)NIL)));
    }
    
    public static SubLObject f33686(final SubLObject var57, final SubLObject var58) {
        if (NIL != f33621()) {
            return f33622((SubLObject)ConsesLow.list((SubLObject)$ic88$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var57), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0162.f10628(var58))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33687(final SubLObject var36) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        return f33686(f33643(var36), module0178.f11287(var36));
    }
    
    public static SubLObject f33688(final SubLObject var36) {
        SubLObject var37 = (SubLObject)T;
        SubLObject var39;
        final SubLObject var38 = var39 = module0211.f13634(var36);
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            if (NIL != assertion_handles_oc.f11041(var40, (SubLObject)UNPROVIDED) && NIL == f33679(var40)) {
                var37 = (SubLObject)NIL;
            }
            var39 = var39.rest();
            var40 = var39.first();
        }
        return var37;
    }
    
    public static SubLObject f33689(final SubLObject var36, final SubLObject var134) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        assert NIL != module0130.f8503(var134) : var134;
        if (NIL != module0178.f11375(var36)) {
            final SubLObject var135 = module0178.f11291(var36);
            if (!var135.equal(var134)) {
                final SubLObject var136 = module0178.f11293(var36);
                f33644(var36, var136, var134);
                return var36;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33690(final SubLObject var36, final SubLObject var135) {
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        assert NIL != module0130.f8507(var135) : var135;
        if (NIL != module0178.f11375(var36)) {
            final SubLObject var136 = module0178.f11293(var36);
            if (!var136.equal(var135)) {
                final SubLObject var137 = module0178.f11291(var36);
                f33644(var36, var135, var137);
                return var36;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33691(final SubLObject var36, final SubLObject var86, SubLObject var91) {
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        assert NIL != module0161.f10481(var86) : var86;
        if (NIL != module0178.f11375(var36)) {
            final SubLObject var92 = module0178.f11287(var36);
            if (!var92.equal(var86)) {
                final SubLObject var93 = f33671(var36);
                return f33692(var36, var93, var86, var91);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33692(final SubLObject var36, final SubLObject var84, SubLObject var86, SubLObject var91) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        if (NIL != var91) {
            return f33662(var36, var91, var84, var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f33661(var36, var84, var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33693(final SubLObject var136) {
        if (NIL != $g3958$.getGlobalValue()) {
            return Values.values(Hashtables.gethash(var136, $g3958$.getGlobalValue(), (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33694() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0217.f14247($ic38$, $ic18$);
        if (!$g3958$.getGlobalValue().isHashtable()) {
            $g3958$.setGlobalValue(Hashtables.make_hash_table(var6, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        }
        Hashtables.clrhash($g3958$.getGlobalValue());
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        final SubLObject var8 = module0012.$g75$.currentBinding(var5);
        final SubLObject var9 = module0012.$g76$.currentBinding(var5);
        final SubLObject var10 = module0012.$g77$.currentBinding(var5);
        final SubLObject var11 = module0012.$g78$.currentBinding(var5);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var5);
            module0012.$g76$.bind((SubLObject)NIL, var5);
            module0012.$g77$.bind((SubLObject)T, var5);
            module0012.$g78$.bind(Time.get_universal_time(), var5);
            module0012.f478((SubLObject)$ic91$);
            final SubLObject var8_139 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var26_140 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind((SubLObject)$ic23$, var5);
                module0147.$g2095$.bind($ic18$, var5);
                final SubLObject var12 = $ic38$;
                if (NIL != module0158.f10038(var12)) {
                    final SubLObject var13 = (SubLObject)NIL;
                    final SubLObject var8_140 = module0012.$g73$.currentBinding(var5);
                    final SubLObject var26_141 = module0012.$g65$.currentBinding(var5);
                    final SubLObject var114_145 = module0012.$g67$.currentBinding(var5);
                    final SubLObject var115_146 = module0012.$g68$.currentBinding(var5);
                    final SubLObject var14 = module0012.$g66$.currentBinding(var5);
                    final SubLObject var15 = module0012.$g69$.currentBinding(var5);
                    final SubLObject var16 = module0012.$g70$.currentBinding(var5);
                    final SubLObject var17 = module0012.$silent_progressP$.currentBinding(var5);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var5);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var5), var5);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var5);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var5);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var5);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var5);
                        module0012.$g70$.bind((SubLObject)T, var5);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var13) ? module0012.$silent_progressP$.getDynamicValue(var5) : T), var5);
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
                                    var23 = module0158.f10316(var21, (SubLObject)$ic24$, (SubLObject)$ic92$, (SubLObject)NIL);
                                    SubLObject var29_151 = (SubLObject)NIL;
                                    final SubLObject var30_152 = (SubLObject)NIL;
                                    while (NIL == var29_151) {
                                        final SubLObject var24 = module0052.f3695(var23, var30_152);
                                        final SubLObject var32_154 = (SubLObject)makeBoolean(!var30_152.eql(var24));
                                        if (NIL != var32_154) {
                                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var7, var6);
                                            if (NIL != module0178.f11284(var24)) {
                                                final SubLObject var25 = module0178.f11331(var24, (SubLObject)ONE_INTEGER);
                                                final SubLObject var26 = module0178.f11331(var24, (SubLObject)TWO_INTEGER);
                                                f33695(var26, var25);
                                            }
                                        }
                                        var29_151 = (SubLObject)makeBoolean(NIL == var32_154);
                                    }
                                }
                                finally {
                                    final SubLObject var8_141 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var5);
                                        if (NIL != var23) {
                                            module0158.f10319(var23);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_141, var5);
                                    }
                                }
                            }
                            var19 = (SubLObject)makeBoolean(NIL == var22);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var17, var5);
                        module0012.$g70$.rebind(var16, var5);
                        module0012.$g69$.rebind(var15, var5);
                        module0012.$g66$.rebind(var14, var5);
                        module0012.$g68$.rebind(var115_146, var5);
                        module0012.$g67$.rebind(var114_145, var5);
                        module0012.$g65$.rebind(var26_141, var5);
                        module0012.$g73$.rebind(var8_140, var5);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var26_140, var5);
                module0147.$g2094$.rebind(var8_139, var5);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var5);
            module0012.$g77$.rebind(var10, var5);
            module0012.$g76$.rebind(var9, var5);
            module0012.$g75$.rebind(var8, var5);
        }
        return Hashtables.hash_table_count($g3958$.getGlobalValue());
    }
    
    public static SubLObject f33695(final SubLObject var136, final SubLObject var14) {
        if (NIL != $g3958$.getGlobalValue()) {
            final SubLObject var137 = f33693(var136);
            Hashtables.sethash(var136, $g3958$.getGlobalValue(), conses_high.adjoin(var14, var137, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33696(final SubLObject var136, final SubLObject var14) {
        if (NIL != $g3958$.getGlobalValue()) {
            SubLObject var137 = f33693(var136);
            if (NIL != var137) {
                var137 = Sequences.delete(var14, var137, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == var137) {
                    Hashtables.remhash(var136, $g3958$.getGlobalValue());
                }
                else {
                    Hashtables.sethash(var136, $g3958$.getGlobalValue(), var137);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33622(final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (NIL != module0111.$g1406$.getDynamicValue(var158)) {
            return module0575.f35284(var157, (SubLObject)T);
        }
        return Eval.eval(var157);
    }
    
    public static SubLObject f33697(SubLObject var61, SubLObject var58) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        final SubLObject var63 = $g3959$.getDynamicValue(var62);
        if (var63.eql((SubLObject)$ic3$) || var63.eql((SubLObject)$ic95$)) {
            return module0290.f19507(var61, var58);
        }
        if (var63.eql((SubLObject)$ic3$) || var63.eql((SubLObject)$ic93$)) {
            var62.resetMultipleValues();
            final SubLObject var159_160 = module0279.f18576(var61, var58);
            final SubLObject var161_162 = var62.secondMultipleValue();
            var62.resetMultipleValues();
            var61 = var159_160;
            var58 = var161_162;
            return module0290.f19507(var61, var58);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33671(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        return Functions.funcall($g3960$.getDynamicValue(var37), var36);
    }
    
    public static SubLObject f33643(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var36) : var36;
        return Functions.funcall($g3959$.getDynamicValue(var37), var36);
    }
    
    public static SubLObject f33698() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0110.$g1389$.getDynamicValue(var5)) ? NIL : Equality.equalp(module0574.f35152(), $ic96$));
    }
    
    public static SubLObject f33621() {
        if (NIL == f33698()) {
            return (SubLObject)T;
        }
        Errors.error((SubLObject)$ic97$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33699(final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        SubLObject var159 = (SubLObject)NIL;
        SubLObject var160 = (SubLObject)NIL;
        try {
            var158.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var161 = Errors.$error_handler$.currentBinding(var158);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic5$, var158);
                try {
                    var160 = module0538.f33462(var157);
                }
                catch (Throwable var162) {
                    Errors.handleThrowable(var162, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var161, var158);
            }
        }
        catch (Throwable var163) {
            var159 = Errors.handleThrowable(var163, module0003.$g3$.getGlobalValue());
        }
        finally {
            var158.throwStack.pop();
        }
        if (NIL != var159) {
            module0538.f33323((SubLObject)ConsesLow.list((SubLObject)$ic98$, var159));
        }
        if (NIL == module0018.$g689$.getDynamicValue(var158)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0538.f33324()) {
            return Values.values((SubLObject)NIL, module0538.f33325());
        }
        module0575.f35295(module0290.f19505((SubLObject)ConsesLow.list((SubLObject)$ic99$, var157)));
        return Values.values(var160, (SubLObject)NIL);
    }
    
    public static SubLObject f33700() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33618", "KE-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33620", "S#37022", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33619", "S#37023", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33623", "KE-CREATE-NOW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33624", "S#37024", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33625", "S#37025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33627", "KE-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33629", "S#37026", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33632", "KE-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33626", "KE-KILL-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33633", "S#37027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33634", "S#37028", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33635", "S#37029", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33637", "S#37030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33636", "S#37031", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33638", "S#37032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33640", "S#37033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33628", "KE-ASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33641", "S#37034", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33642", "S#37035", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33644", "S#37036", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33645", "S#37037", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33646", "S#37038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33647", "S#37039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33648", "S#37040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33649", "S#37041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33631", "KE-ASSERT-NOW", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33651", "KE-ASSERT-WFF-NOW", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33652", "KE-ASSERT-NOW-AND-PROPAGATE-LATER", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33650", "S#37042", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33653", "S#37043", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33655", "S#37044", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33654", "S#37045", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33656", "S#37046", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33657", "KE-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33639", "S#37047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33658", "KE-UNASSERT-NOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33630", "KE-UNASSERT-ASSERTION-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33659", "S#37048", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33660", "S#37049", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33661", "S#37050", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33662", "S#37051", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33664", "S#37052", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33663", "S#37053", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33666", "KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33667", "S#37054", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33668", "S#37055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33665", "S#37056", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33669", "S#37057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33670", "S#16716", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33674", "S#37058", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33675", "S#21744", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33673", "S#37059", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33676", "S#37060", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33672", "S#37061", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33677", "S#37062", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33678", "S#37063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33679", "S#37064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33680", "S#37065", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33681", "S#37066", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33682", "S#37067", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33683", "S#37068", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33684", "S#37069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33685", "S#37070", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33686", "S#37071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33687", "S#37072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33688", "S#37073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33689", "S#37074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33690", "S#37075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33691", "S#37076", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33692", "S#37077", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33693", "S#37078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33694", "S#37079", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33695", "S#25955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33696", "S#25956", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33622", "S#37080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33697", "FIND-ASSERTIONS-VIA-TL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33671", "S#16715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33643", "S#37081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33698", "S#37082", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33621", "S#37083", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0543", "f33699", "S#37084", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33701() {
        $g3953$ = SubLFiles.defparameter("S#37085", (SubLObject)T);
        $g3954$ = SubLFiles.defparameter("S#37086", (SubLObject)T);
        $g3955$ = SubLFiles.defparameter("S#37087", (SubLObject)$ic58$);
        $g3956$ = SubLFiles.defparameter("S#37088", (SubLObject)NIL);
        $g3957$ = SubLFiles.deflexical("S#37089", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic68$)) ? $g3957$.getGlobalValue() : NIL));
        $g3958$ = SubLFiles.deflexical("S#37090", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic90$)) ? $g3958$.getGlobalValue() : NIL));
        $g3959$ = SubLFiles.defparameter("S#37091", (SubLObject)$ic93$);
        $g3960$ = SubLFiles.defparameter("S#37092", (SubLObject)$ic94$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33702() {
        module0002.f38((SubLObject)$ic0$);
        module0012.f368((SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)NIL, (SubLObject)$ic14$);
        module0002.f38((SubLObject)$ic15$);
        module0002.f38((SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)NIL, (SubLObject)$ic31$);
        module0002.f38((SubLObject)$ic39$);
        module0012.f368((SubLObject)$ic50$, (SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)NIL, (SubLObject)$ic31$);
        module0012.f368((SubLObject)$ic54$, (SubLObject)$ic51$, (SubLObject)$ic55$, (SubLObject)NIL, (SubLObject)$ic31$);
        module0012.f368((SubLObject)$ic56$, (SubLObject)$ic51$, (SubLObject)$ic57$, (SubLObject)NIL, (SubLObject)$ic31$);
        module0002.f38((SubLObject)$ic62$);
        module0012.f368((SubLObject)$ic65$, (SubLObject)$ic66$, (SubLObject)$ic67$, (SubLObject)NIL, (SubLObject)$ic31$);
        module0003.f57((SubLObject)$ic68$);
        module0002.f38((SubLObject)$ic73$);
        module0003.f57((SubLObject)$ic90$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33700();
    }
    
    public void initializeVariables() {
        f33701();
    }
    
    public void runTopLevelForms() {
        f33702();
    }
    
    static {
        me = (SubLFile)new module0543();
        $g3953$ = null;
        $g3954$ = null;
        $g3955$ = null;
        $g3956$ = null;
        $g3957$ = null;
        $g3958$ = null;
        $g3959$ = null;
        $g3960$ = null;
        $ic0$ = makeSymbol("KE-CREATE");
        $ic1$ = makeKeyword("QUEUED");
        $ic2$ = makeSymbol("FI-TIMESTAMP-CONSTANT");
        $ic3$ = makeSymbol("QUOTE");
        $ic4$ = makeSymbol("FI-CREATE");
        $ic5$ = makeSymbol("S#38", "CYC");
        $ic6$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic7$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic8$ = makeKeyword("FATAL-ERROR");
        $ic9$ = makeSymbol("FORMAT");
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("UNKNOWN-ERROR"), (SubLObject)makeString("An unknown error has occurred"));
        $ic11$ = makeSymbol("KE-CREATE-NOW");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10596", "CYC"));
        $ic13$ = makeString("Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null \nit is used, otherwise a unique identifier is generated.\n@return 0 constant ;; new constant if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param NAME string\n@param EXTERNAL-ID guid-p\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("CONSTANT-P"), (SubLObject)makeSymbol("LISTP"));
        $ic15$ = makeSymbol("KE-MERGE");
        $ic16$ = makeSymbol("FI-MERGE");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("mergedConstantName"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("mergedConstantGUID"));
        $ic20$ = makeString("Skip this operation");
        $ic21$ = makeString("Constant ~S cannot be merged because it is mentioned in code");
        $ic22$ = ConsesLow.list((SubLObject)makeKeyword("FATAL-ERROR"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FORMAT"), (SubLObject)NIL, (SubLObject)makeString("~A is mentioned in code and cannot be merged."), (SubLObject)makeSymbol("S#36926", "CYC")));
        $ic23$ = makeSymbol("S#12276", "CYC");
        $ic24$ = makeKeyword("GAF");
        $ic25$ = makeSymbol("KE-KILL");
        $ic26$ = makeSymbol("FI-KILL");
        $ic27$ = makeString("Constant ~S cannot be killed because it is mentioned in code");
        $ic28$ = makeSymbol("KE-KILL-NOW");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"));
        $ic30$ = makeString("Kill FORT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORT fort\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"), (SubLObject)makeSymbol("LISTP"));
        $ic32$ = makeSymbol("STRINGP");
        $ic33$ = makeString("Constant ~S cannot be renamed because it is mentioned in code");
        $ic34$ = makeString("Use KE-RENAME");
        $ic35$ = makeString("Constant ~S is not mentioned in code");
        $ic36$ = makeSymbol("FI-RENAME");
        $ic37$ = makeSymbol("CONSTANT-P");
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("oldConstantName"));
        $ic39$ = makeSymbol("KE-ASSERT");
        $ic40$ = makeKeyword("DEFAULT");
        $ic41$ = makeSymbol("FI-ASSERT");
        $ic42$ = makeSymbol("FI-TIMESTAMP-ASSERTION");
        $ic43$ = makeSymbol("ASSERTION-P");
        $ic44$ = makeSymbol("EL-STRENGTH-P");
        $ic45$ = makeSymbol("DIRECTION-P");
        $ic46$ = makeSymbol("FI-REASSERT");
        $ic47$ = makeSymbol("FI-REASSERT-INT");
        $ic48$ = makeKeyword("BACKWARD");
        $ic49$ = makeKeyword("FORWARD");
        $ic50$ = makeSymbol("KE-ASSERT-NOW");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13918", "CYC"), (SubLObject)makeKeyword("DEFAULT")), (SubLObject)makeSymbol("S#5432", "CYC"));
        $ic52$ = makeString("Assert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $ic53$ = makeSymbol("TRUE");
        $ic54$ = makeSymbol("KE-ASSERT-WFF-NOW");
        $ic55$ = makeString("Assert FORMULA in MT now and add operation to transcript.\nFORMULA is assumed to be WFF.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $ic56$ = makeSymbol("KE-ASSERT-NOW-AND-PROPAGATE-LATER");
        $ic57$ = makeString("Assert FORMULA in MT now and add operation to transcript.  May return before forward-propagation is complete, but not\n   before FORMULA has been asserted in MT.\n   @return 0 boolean ;; t if success, o/w nil\n   @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n   @param FORMULA list\n   @param MT microtheory\n   @param STRENGTH keyword\n   @param DIRECTION keyword\n   @note Assumes cyclist is ok.\n   @note The salient property of this function is that it never throws an error.");
        $ic58$ = makeSymbol("FALSE");
        $ic59$ = makeSymbol("S#690", "CYC");
        $ic60$ = makeKeyword("STRENGTH");
        $ic61$ = makeKeyword("DIRECTION");
        $ic62$ = makeSymbol("KE-UNASSERT");
        $ic63$ = makeSymbol("FI-UNASSERT");
        $ic64$ = makeString("Sentence ~S in mt ~S~%is not in the KB and you are trying to unassert it.");
        $ic65$ = makeSymbol("KE-UNASSERT-NOW");
        $ic66$ = ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic67$ = makeString("Unassert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $ic68$ = makeSymbol("S#37089", "CYC");
        $ic69$ = makeSymbol("FI-EDIT");
        $ic70$ = makeString("KE-EDIT-NOW does not yet use FI-EDIT");
        $ic71$ = makeKeyword("ALL");
        $ic72$ = ConsesLow.list((SubLObject)makeSymbol("S#37093", "CYC"), (SubLObject)makeSymbol("S#37094", "CYC"), (SubLObject)makeSymbol("S#37095", "CYC"), (SubLObject)makeSymbol("S#37096", "CYC"));
        $ic73$ = makeSymbol("KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS");
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("S#37097", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#37094", "CYC"));
        $ic76$ = makeString("Sentences do not differ only in strings");
        $ic77$ = makeSymbol("FI-BLAST");
        $ic78$ = makeSymbol("S#12753", "CYC");
        $ic79$ = makeSymbol("S#3593", "CYC");
        $ic80$ = makeSymbol("S#36845", "CYC");
        $ic81$ = makeSymbol("S#36822", "CYC");
        $ic82$ = makeKeyword("CHECK-WFF?");
        $ic83$ = makeSymbol("S#36828", "CYC");
        $ic84$ = makeSymbol("DEDUCTION-P");
        $ic85$ = makeSymbol("S#36825", "CYC");
        $ic86$ = makeSymbol("FORT-P");
        $ic87$ = makeSymbol("FI-TMS-RECONSIDER-TERM");
        $ic88$ = makeSymbol("FI-TMS-RECONSIDER-FORMULA");
        $ic89$ = makeSymbol("S#12263", "CYC");
        $ic90$ = makeSymbol("S#37090", "CYC");
        $ic91$ = makeString("Initializing old constant name table");
        $ic92$ = makeKeyword("TRUE");
        $ic93$ = makeSymbol("S#22114", "CYC");
        $ic94$ = makeSymbol("ASSERTION-EL-FORMULA");
        $ic95$ = makeSymbol("S#21489", "CYC");
        $ic96$ = constant_handles_oc.f8479((SubLObject)makeString("Guest"));
        $ic97$ = makeString("KB editing is not allowed for users logged in as #$Guest.");
        $ic98$ = makeKeyword("GENERIC-ERROR");
        $ic99$ = makeSymbol("S#9950", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 872 ms
	
	Decompiled with Procyon 0.5.32.
*/