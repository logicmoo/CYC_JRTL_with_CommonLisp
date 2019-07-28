package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0322 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0322";
    public static final String myFingerPrint = "17c17d17a850c71afca2eff5a3c22485e866a09a72bd9f991cf714a93643db7b";
    public static SubLSymbol $g2819$;
    public static SubLSymbol $g2820$;
    private static SubLSymbol $g2821$;
    private static SubLSymbol $g2822$;
    public static SubLSymbol $g2823$;
    private static SubLSymbol $g2824$;
    private static SubLSymbol $g2825$;
    private static SubLSymbol $g2826$;
    private static SubLSymbol $g2827$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
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
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLInteger $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLList $ic112$;
    private static final SubLList $ic113$;
    private static final SubLInteger $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLInteger $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLList $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLList $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLString $ic153$;
    private static final SubLList $ic154$;
    private static final SubLString $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLList $ic157$;
    private static final SubLObject $ic158$;
    private static final SubLInteger $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLList $ic164$;
    private static final SubLString $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLList $ic167$;
    
    public static SubLObject f21723(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic1$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.listS(var7, var9, (SubLObject)$ic3$), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list(var6, var9), ConsesLow.append(var8, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21724(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var9 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)$ic6$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list(var6, var11, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var9)), (SubLObject)ConsesLow.listS((SubLObject)$ic9$, reader.bq_cons(var7, var8), var11, ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21725(final SubLObject var17, final SubLObject var18, final SubLObject var19, final SubLObject var20) {
        assert NIL != module0004.f105(var19) : var19;
        final SubLObject var21 = f21726(var18, var19);
        return (SubLObject)((NIL != f21727(var21)) ? f21728(var21, var17, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f21729(final SubLObject var17, final SubLObject var18, final SubLObject var19, final SubLObject var21, SubLObject var22, SubLObject var20) {
        if (var22 == UNPROVIDED) {
            var22 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        assert NIL != module0004.f105(var19) : var19;
        final SubLObject var23 = f21726(var18, var19);
        return (SubLObject)((NIL != f21727(var23)) ? f21728(var23, var17, var20, var21, var22) : NIL);
    }
    
    public static SubLObject f21730(final SubLObject var18, final SubLObject var23) {
        return module0035.sublisp_boolean(f21726(var18, var23));
    }
    
    public static SubLObject f21731() {
        return f21732((SubLObject)T);
    }
    
    public static SubLObject f21733() {
        return f21732((SubLObject)NIL);
    }
    
    public static SubLObject f21732(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (NIL != var24) {
            module0067.f4881(f21734());
        }
        final SubLObject var26 = assertion_manager_oc.f11118();
        try {
            assertion_manager_oc.f11116();
            final SubLObject var27 = $ic11$;
            if (NIL != constant_handles_oc.f8463(var27, (SubLObject)UNPROVIDED)) {
                final SubLObject var28 = module0147.$g2094$.currentBinding(var25);
                final SubLObject var29 = module0147.$g2095$.currentBinding(var25);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic12$, var25);
                    module0147.$g2095$.bind($ic13$, var25);
                    final SubLObject var30 = var27;
                    if (NIL != module0158.f10038(var30)) {
                        final SubLObject var31 = (SubLObject)$ic14$;
                        final SubLObject var28_32 = module0012.$g73$.currentBinding(var25);
                        final SubLObject var29_33 = module0012.$g65$.currentBinding(var25);
                        final SubLObject var32 = module0012.$g67$.currentBinding(var25);
                        final SubLObject var33 = module0012.$g68$.currentBinding(var25);
                        final SubLObject var34 = module0012.$g66$.currentBinding(var25);
                        final SubLObject var35 = module0012.$g69$.currentBinding(var25);
                        final SubLObject var36 = module0012.$g70$.currentBinding(var25);
                        final SubLObject var37 = module0012.$silent_progressP$.currentBinding(var25);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var25);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var25), var25);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var25);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var25);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var25);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var25);
                            module0012.$g70$.bind((SubLObject)T, var25);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var31) ? module0012.$silent_progressP$.getDynamicValue(var25) : T), var25);
                            module0012.f474(var31);
                            final SubLObject var38 = module0158.f10039(var30);
                            SubLObject var39 = (SubLObject)NIL;
                            final SubLObject var40 = (SubLObject)NIL;
                            while (NIL == var39) {
                                final SubLObject var41 = module0052.f3695(var38, var40);
                                final SubLObject var42 = (SubLObject)makeBoolean(!var40.eql(var41));
                                if (NIL != var42) {
                                    module0012.f476();
                                    SubLObject var43 = (SubLObject)NIL;
                                    try {
                                        var43 = module0158.f10316(var41, (SubLObject)$ic15$, (SubLObject)NIL, (SubLObject)NIL);
                                        SubLObject var41_46 = (SubLObject)NIL;
                                        final SubLObject var42_47 = (SubLObject)NIL;
                                        while (NIL == var41_46) {
                                            final SubLObject var44 = module0052.f3695(var43, var42_47);
                                            final SubLObject var44_49 = (SubLObject)makeBoolean(!var42_47.eql(var44));
                                            if (NIL != var44_49) {
                                                SubLObject var46;
                                                final SubLObject var45 = var46 = module0178.f11330(var44);
                                                SubLObject var47 = (SubLObject)NIL;
                                                SubLObject var48 = (SubLObject)NIL;
                                                cdestructuring_bind.destructuring_bind_must_consp(var46, var45, (SubLObject)$ic16$);
                                                var47 = var46.first();
                                                var46 = var46.rest();
                                                cdestructuring_bind.destructuring_bind_must_consp(var46, var45, (SubLObject)$ic16$);
                                                var48 = var46.first();
                                                var46 = var46.rest();
                                                if (NIL == var46) {
                                                    if (NIL != var24 || NIL == f21726(var47, var48)) {
                                                        SubLObject var49 = (SubLObject)NIL;
                                                        try {
                                                            var25.throwStack.push(module0003.$g3$.getGlobalValue());
                                                            final SubLObject var28_33 = Errors.$error_handler$.currentBinding(var25);
                                                            try {
                                                                Errors.$error_handler$.bind((SubLObject)$ic17$, var25);
                                                                try {
                                                                    f21735(var47, var48, (SubLObject)T);
                                                                }
                                                                catch (Throwable var50) {
                                                                    Errors.handleThrowable(var50, (SubLObject)NIL);
                                                                }
                                                            }
                                                            finally {
                                                                Errors.$error_handler$.rebind(var28_33, var25);
                                                            }
                                                        }
                                                        catch (Throwable var51) {
                                                            var49 = Errors.handleThrowable(var51, module0003.$g3$.getGlobalValue());
                                                        }
                                                        finally {
                                                            var25.throwStack.pop();
                                                        }
                                                        if (var49.isString()) {
                                                            Errors.warn((SubLObject)$ic18$, var47, var49);
                                                        }
                                                    }
                                                }
                                                else {
                                                    cdestructuring_bind.cdestructuring_bind_error(var45, (SubLObject)$ic16$);
                                                }
                                            }
                                            var41_46 = (SubLObject)makeBoolean(NIL == var44_49);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28_34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                                            if (NIL != var43) {
                                                module0158.f10319(var43);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28_34, var25);
                                        }
                                    }
                                }
                                var39 = (SubLObject)makeBoolean(NIL == var42);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var37, var25);
                            module0012.$g70$.rebind(var36, var25);
                            module0012.$g69$.rebind(var35, var25);
                            module0012.$g66$.rebind(var34, var25);
                            module0012.$g68$.rebind(var33, var25);
                            module0012.$g67$.rebind(var32, var25);
                            module0012.$g65$.rebind(var29_33, var25);
                            module0012.$g73$.rebind(var28_32, var25);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var29, var25);
                    module0147.$g2094$.rebind(var28, var25);
                }
            }
        }
        finally {
            final SubLObject var52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                if (NIL != var26) {
                    assertion_manager_oc.f11117();
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var52, var25);
            }
        }
        return f21734();
    }
    
    public static SubLObject f21736() {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean($g2819$.getDynamicValue(var25));
    }
    
    public static SubLObject f21737() {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)ZERO_INTEGER;
        SubLObject var27;
        for (var27 = module0066.f4838(module0067.f4891(f21734())); NIL == module0066.f4841(var27); var27 = module0066.f4840(var27)) {
            var25.resetMultipleValues();
            final SubLObject var28 = module0066.f4839(var27);
            final SubLObject var29 = var25.secondMultipleValue();
            var25.resetMultipleValues();
            SubLObject var30 = var29;
            SubLObject var31 = (SubLObject)NIL;
            var31 = var30.first();
            while (NIL != var30) {
                final SubLObject var32 = module0079.f5424(f21738(var31));
                SubLObject var35;
                for (SubLObject var33 = (SubLObject)NIL; NIL == var33; var33 = (SubLObject)makeBoolean(NIL == var35)) {
                    var25.resetMultipleValues();
                    final SubLObject var34 = module0052.f3693(var32);
                    var35 = var25.secondMultipleValue();
                    var25.resetMultipleValues();
                    if (NIL != var35) {
                        SubLObject var37;
                        final SubLObject var36 = var37 = var34;
                        SubLObject var38 = (SubLObject)NIL;
                        SubLObject var39 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)$ic19$);
                        var38 = var37.first();
                        var37 = var37.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)$ic19$);
                        var39 = var37.first();
                        var37 = var37.rest();
                        if (NIL == var37) {
                            SubLObject var71_72;
                            final SubLObject var69_70 = var71_72 = var39;
                            SubLObject var40 = (SubLObject)NIL;
                            SubLObject var41 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var71_72, var69_70, (SubLObject)$ic20$);
                            var40 = var71_72.first();
                            var71_72 = (var41 = var71_72.rest());
                            var26 = Numbers.add(var26, module0079.f5406(var40));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var36, (SubLObject)$ic19$);
                        }
                    }
                }
                var30 = var30.rest();
                var31 = var30.first();
            }
        }
        module0066.f4842(var27);
        return var26;
    }
    
    public static SubLObject f21739(final SubLObject var73, final SubLObject var74) {
        f21740(var73, var74, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21727(final SubLObject var73) {
        return (SubLObject)((var73.getClass() == $sX24287_native.class) ? T : NIL);
    }
    
    public static SubLObject f21741(final SubLObject var73) {
        assert NIL != f21727(var73) : var73;
        return var73.getField2();
    }
    
    public static SubLObject f21742(final SubLObject var73) {
        assert NIL != f21727(var73) : var73;
        return var73.getField3();
    }
    
    public static SubLObject f21743(final SubLObject var73) {
        assert NIL != f21727(var73) : var73;
        return var73.getField4();
    }
    
    public static SubLObject f21744(final SubLObject var73) {
        assert NIL != f21727(var73) : var73;
        return var73.getField5();
    }
    
    public static SubLObject f21738(final SubLObject var73) {
        assert NIL != f21727(var73) : var73;
        return var73.getField6();
    }
    
    public static SubLObject f21745(final SubLObject var73, final SubLObject var76) {
        assert NIL != f21727(var73) : var73;
        return var73.setField2(var76);
    }
    
    public static SubLObject f21746(final SubLObject var73, final SubLObject var76) {
        assert NIL != f21727(var73) : var73;
        return var73.setField3(var76);
    }
    
    public static SubLObject f21747(final SubLObject var73, final SubLObject var76) {
        assert NIL != f21727(var73) : var73;
        return var73.setField4(var76);
    }
    
    public static SubLObject f21748(final SubLObject var73, final SubLObject var76) {
        assert NIL != f21727(var73) : var73;
        return var73.setField5(var76);
    }
    
    public static SubLObject f21749(final SubLObject var73, final SubLObject var76) {
        assert NIL != f21727(var73) : var73;
        return var73.setField6(var76);
    }
    
    public static SubLObject f21750(SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)NIL;
        }
        final SubLObject var78 = (SubLObject)new $sX24287_native();
        SubLObject var79;
        SubLObject var80;
        SubLObject var81;
        SubLObject var82;
        for (var79 = (SubLObject)NIL, var79 = var77; NIL != var79; var79 = conses_high.cddr(var79)) {
            var80 = var79.first();
            var81 = conses_high.cadr(var79);
            var82 = var80;
            if (var82.eql((SubLObject)$ic39$)) {
                f21745(var78, var81);
            }
            else if (var82.eql((SubLObject)$ic40$)) {
                f21746(var78, var81);
            }
            else if (var82.eql((SubLObject)$ic41$)) {
                f21747(var78, var81);
            }
            else if (var82.eql((SubLObject)$ic42$)) {
                f21748(var78, var81);
            }
            else if (var82.eql((SubLObject)$ic43$)) {
                f21749(var78, var81);
            }
            else {
                Errors.error((SubLObject)$ic44$, var80);
            }
        }
        return var78;
    }
    
    public static SubLObject f21751(final SubLObject var83, final SubLObject var84) {
        Functions.funcall(var84, var83, (SubLObject)$ic45$, (SubLObject)$ic46$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var84, var83, (SubLObject)$ic47$, (SubLObject)$ic39$, f21741(var83));
        Functions.funcall(var84, var83, (SubLObject)$ic47$, (SubLObject)$ic40$, f21742(var83));
        Functions.funcall(var84, var83, (SubLObject)$ic47$, (SubLObject)$ic41$, f21743(var83));
        Functions.funcall(var84, var83, (SubLObject)$ic47$, (SubLObject)$ic42$, f21744(var83));
        Functions.funcall(var84, var83, (SubLObject)$ic47$, (SubLObject)$ic43$, f21738(var83));
        Functions.funcall(var84, var83, (SubLObject)$ic48$, (SubLObject)$ic46$, (SubLObject)FIVE_INTEGER);
        return var83;
    }
    
    public static SubLObject f21752(final SubLObject var83, final SubLObject var84) {
        return f21751(var83, var84);
    }
    
    public static SubLObject f21753(final SubLObject var85) {
        return Sxhash.sxhash(f21741(var85));
    }
    
    public static SubLObject f21740(final SubLObject var86, SubLObject var74, SubLObject var87) {
        if (var74 == UNPROVIDED) {
            var74 = (SubLObject)NIL;
        }
        if (var87 == UNPROVIDED) {
            var87 = (SubLObject)NIL;
        }
        PrintLow.format(var74, (SubLObject)$ic51$, f21741(var86), f21742(var86));
        return var86;
    }
    
    public static SubLObject f21754(final SubLObject var88, final SubLObject var89) {
        final SubLObject var90 = f21750((SubLObject)UNPROVIDED);
        f21745(var90, f21741(var88));
        f21746(var90, f21742(var88));
        f21747(var90, f21743(var88));
        f21748(var90, f21744(var88));
        final SubLObject var91 = f21738(var88);
        final SubLObject var92 = module0067.f4880(module0079.f5408(var91), module0079.f5406(var91));
        final SubLObject var93 = module0096.f6948(var91, var92, var89, (SubLObject)$ic52$);
        final SubLObject var94 = module0096.f6964(var93);
        f21749(var90, var94);
        return var90;
    }
    
    public static SubLObject f21755() {
        return Types.lock_p($g2821$.getGlobalValue());
    }
    
    public static SubLObject f21756() {
        if (NIL == f21755()) {
            $g2821$.setGlobalValue(Locks.make_lock((SubLObject)$ic54$));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f21757(final SubLObject var86, final SubLObject var89, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        final SubLThread var96 = SubLProcess.currentSubLThread();
        final SubLObject var97 = f21738(var86);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var96) && NIL == module0096.f6951(var97)) {
            Errors.error((SubLObject)$ic55$, var97);
        }
        module0096.f6965(var97, var89, var95);
        f21756();
        return var86;
    }
    
    public static SubLObject f21734() {
        return $g2822$.getGlobalValue();
    }
    
    public static SubLObject f21758(final SubLObject var6) {
        final SubLObject var7 = f21741(var6);
        module0084.f5765($g2822$.getGlobalValue(), var7, var6, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        return var6;
    }
    
    public static SubLObject f21759(final SubLObject var18) {
        return module0067.f4885(f21734(), var18, (SubLObject)NIL);
    }
    
    public static SubLObject f21760(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var19);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var19);
        try {
            module0147.$g2094$.bind((SubLObject)$ic12$, var19);
            module0147.$g2095$.bind($ic13$, var19);
            final SubLObject var24 = module0137.f8955($ic57$);
            final SubLObject var25 = (SubLObject)(($ic58$ == $ic59$) ? $ic60$ : $ic61$);
            final SubLObject var26 = module0056.f4145(var25);
            SubLObject var27 = (SubLObject)NIL;
            final SubLObject var28_103 = module0139.$g1635$.currentBinding(var19);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var19);
                final SubLObject var28 = $ic62$;
                final SubLObject var28_104 = module0141.$g1714$.currentBinding(var19);
                final SubLObject var29_106 = module0141.$g1715$.currentBinding(var19);
                try {
                    module0141.$g1714$.bind((NIL != var28) ? var28 : module0141.f9283(), var19);
                    module0141.$g1715$.bind((SubLObject)((NIL != var28) ? $ic63$ : module0141.$g1715$.getDynamicValue(var19)), var19);
                    if (NIL != var28 && NIL != module0136.f8864() && NIL == module0141.f9279(var28)) {
                        final SubLObject var29 = module0136.$g1591$.getDynamicValue(var19);
                        if (var29.eql((SubLObject)$ic64$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var28, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var29.eql((SubLObject)$ic67$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var28, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var29.eql((SubLObject)$ic69$)) {
                            Errors.warn((SubLObject)$ic65$, var28, (SubLObject)$ic66$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var19));
                            Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var28, (SubLObject)$ic66$);
                        }
                    }
                    final SubLObject var28_105 = module0141.$g1670$.currentBinding(var19);
                    final SubLObject var29_107 = module0141.$g1671$.currentBinding(var19);
                    final SubLObject var30 = module0141.$g1672$.currentBinding(var19);
                    final SubLObject var31 = module0141.$g1674$.currentBinding(var19);
                    final SubLObject var32 = module0137.$g1605$.currentBinding(var19);
                    try {
                        module0141.$g1670$.bind(var24, var19);
                        module0141.$g1671$.bind(module0244.f15739(var24), var19);
                        module0141.$g1672$.bind(module0244.f15746(var24), var19);
                        module0141.$g1674$.bind((SubLObject)NIL, var19);
                        module0137.$g1605$.bind(var24, var19);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var18, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var28_106 = module0141.$g1677$.currentBinding(var19);
                            final SubLObject var29_108 = module0138.$g1619$.currentBinding(var19);
                            final SubLObject var34_111 = module0141.$g1674$.currentBinding(var19);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var19);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), var24), var19);
                                module0141.$g1674$.bind((SubLObject)NIL, var19);
                                module0249.f16055(var18, (SubLObject)UNPROVIDED);
                                for (var27 = (SubLObject)ConsesLow.list(var18, module0141.f9195()); NIL != var27; var27 = module0056.f4150(var26)) {
                                    final SubLObject var99_112 = var27.first();
                                    final SubLObject var33 = conses_high.second(var27);
                                    final SubLObject var34 = var99_112;
                                    final SubLObject var28_107 = module0141.$g1674$.currentBinding(var19);
                                    try {
                                        module0141.$g1674$.bind(var33, var19);
                                        final SubLObject var35 = var33;
                                        SubLObject var36 = f21759(var34);
                                        SubLObject var37 = (SubLObject)NIL;
                                        var37 = var36.first();
                                        while (NIL != var36) {
                                            if (NIL != var35) {
                                                var21 = (SubLObject)ConsesLow.cons(var37, var21);
                                            }
                                            else {
                                                var20 = (SubLObject)ConsesLow.cons(var37, var20);
                                            }
                                            var36 = var36.rest();
                                            var37 = var36.first();
                                        }
                                        final SubLObject var38 = var36 = module0200.f12443(var24);
                                        SubLObject var39 = (SubLObject)NIL;
                                        var39 = var36.first();
                                        while (NIL != var36) {
                                            final SubLObject var28_108 = module0137.$g1605$.currentBinding(var19);
                                            final SubLObject var29_109 = module0141.$g1674$.currentBinding(var19);
                                            try {
                                                module0137.$g1605$.bind(var39, var19);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var19)) : module0141.$g1674$.getDynamicValue(var19)), var19);
                                                final SubLObject var40 = module0228.f15229(var99_112);
                                                if (NIL != module0138.f8992(var40)) {
                                                    final SubLObject var41 = module0242.f15664(var40, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var41) {
                                                        final SubLObject var42 = module0245.f15834(var41, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var42) {
                                                            SubLObject var43;
                                                            for (var43 = module0066.f4838(module0067.f4891(var42)); NIL == module0066.f4841(var43); var43 = module0066.f4840(var43)) {
                                                                var19.resetMultipleValues();
                                                                final SubLObject var44 = module0066.f4839(var43);
                                                                final SubLObject var45 = var19.secondMultipleValue();
                                                                var19.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var44)) {
                                                                    final SubLObject var28_109 = module0138.$g1623$.currentBinding(var19);
                                                                    try {
                                                                        module0138.$g1623$.bind(var44, var19);
                                                                        SubLObject var59_127;
                                                                        for (var59_127 = module0066.f4838(module0067.f4891(var45)); NIL == module0066.f4841(var59_127); var59_127 = module0066.f4840(var59_127)) {
                                                                            var19.resetMultipleValues();
                                                                            final SubLObject var46 = module0066.f4839(var59_127);
                                                                            final SubLObject var47 = var19.secondMultipleValue();
                                                                            var19.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var46)) {
                                                                                final SubLObject var28_110 = module0138.$g1624$.currentBinding(var19);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var46, var19);
                                                                                    final SubLObject var48 = var47;
                                                                                    if (NIL != module0077.f5302(var48)) {
                                                                                        final SubLObject var49 = module0077.f5333(var48);
                                                                                        SubLObject var50;
                                                                                        SubLObject var51;
                                                                                        SubLObject var52;
                                                                                        for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                                                                                            var52 = module0032.f1745(var50, var51);
                                                                                            if (NIL != module0032.f1746(var51, var52) && NIL == module0249.f16059(var52, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var52, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var52, module0141.f9195()), var26);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var48.isList()) {
                                                                                        SubLObject var53 = var48;
                                                                                        SubLObject var54 = (SubLObject)NIL;
                                                                                        var54 = var53.first();
                                                                                        while (NIL != var53) {
                                                                                            if (NIL == module0249.f16059(var54, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var54, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var54, module0141.f9195()), var26);
                                                                                            }
                                                                                            var53 = var53.rest();
                                                                                            var54 = var53.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic71$, var48);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var28_110, var19);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var59_127);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var28_109, var19);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var43);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var40, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var61_138;
                                                    final SubLObject var55 = var61_138 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var56 = (SubLObject)NIL;
                                                    var56 = var61_138.first();
                                                    while (NIL != var61_138) {
                                                        final SubLObject var28_111 = module0138.$g1625$.currentBinding(var19);
                                                        try {
                                                            module0138.$g1625$.bind(var56, var19);
                                                            final SubLObject var58;
                                                            final SubLObject var57 = var58 = Functions.funcall(var56, var40);
                                                            if (NIL != module0077.f5302(var58)) {
                                                                final SubLObject var59 = module0077.f5333(var58);
                                                                SubLObject var60;
                                                                SubLObject var61;
                                                                SubLObject var62;
                                                                for (var60 = module0032.f1741(var59), var61 = (SubLObject)NIL, var61 = module0032.f1742(var60, var59); NIL == module0032.f1744(var60, var61); var61 = module0032.f1743(var61)) {
                                                                    var62 = module0032.f1745(var60, var61);
                                                                    if (NIL != module0032.f1746(var61, var62) && NIL == module0249.f16059(var62, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var62, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var62, module0141.f9195()), var26);
                                                                    }
                                                                }
                                                            }
                                                            else if (var58.isList()) {
                                                                SubLObject var63 = var58;
                                                                SubLObject var64 = (SubLObject)NIL;
                                                                var64 = var63.first();
                                                                while (NIL != var63) {
                                                                    if (NIL == module0249.f16059(var64, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var64, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var64, module0141.f9195()), var26);
                                                                    }
                                                                    var63 = var63.rest();
                                                                    var64 = var63.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic71$, var58);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var28_111, var19);
                                                        }
                                                        var61_138 = var61_138.rest();
                                                        var56 = var61_138.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var29_109, var19);
                                                module0137.$g1605$.rebind(var28_108, var19);
                                            }
                                            var36 = var36.rest();
                                            var39 = var36.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var28_107, var19);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var34_111, var19);
                                module0138.$g1619$.rebind(var29_108, var19);
                                module0141.$g1677$.rebind(var28_106, var19);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var18, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var32, var19);
                        module0141.$g1674$.rebind(var31, var19);
                        module0141.$g1672$.rebind(var30, var19);
                        module0141.$g1671$.rebind(var29_107, var19);
                        module0141.$g1670$.rebind(var28_105, var19);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var29_106, var19);
                    module0141.$g1714$.rebind(var28_104, var19);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var19));
            }
            finally {
                module0139.$g1635$.rebind(var28_103, var19);
            }
        }
        finally {
            module0147.$g2095$.rebind(var23, var19);
            module0147.$g2094$.rebind(var22, var19);
        }
        return Values.values(var20, var21);
    }
    
    public static SubLObject f21761(final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = (SubLObject)NIL;
        SubLObject var144 = (SubLObject)NIL;
        final SubLObject var145 = module0147.$g2094$.currentBinding(var142);
        final SubLObject var146 = module0147.$g2095$.currentBinding(var142);
        try {
            module0147.$g2094$.bind((SubLObject)$ic12$, var142);
            module0147.$g2095$.bind($ic13$, var142);
            SubLObject var147;
            for (var147 = module0066.f4838(module0067.f4891(f21734())); NIL == module0066.f4841(var147); var147 = module0066.f4840(var147)) {
                var142.resetMultipleValues();
                final SubLObject var148 = module0066.f4839(var147);
                final SubLObject var149 = var142.secondMultipleValue();
                var142.resetMultipleValues();
                SubLObject var150 = var149;
                SubLObject var151 = (SubLObject)NIL;
                var151 = var150.first();
                while (NIL != var150) {
                    SubLObject var152 = (SubLObject)NIL;
                    if (NIL == var152) {
                        SubLObject var153 = f21743(var151);
                        SubLObject var154 = (SubLObject)NIL;
                        var154 = var153.first();
                        while (NIL == var152 && NIL != var153) {
                            if (NIL != assertion_handles_oc.f11041(var154, (SubLObject)UNPROVIDED)) {
                                final SubLObject var155 = f21762(var154);
                                final SubLObject var156 = module0178.f11336(var154);
                                if (var156.eql(f21742(var151))) {
                                    if (NIL != module0260.f17089(var141, var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var143 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var151, (SubLObject)NIL, var155), var143);
                                    }
                                    if (NIL != module0260.f17094(var141, var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var143 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var151, (SubLObject)T, var155), var143);
                                    }
                                }
                            }
                            else {
                                var152 = (SubLObject)T;
                            }
                            var153 = var153.rest();
                            var154 = var153.first();
                        }
                    }
                    if (NIL == var152) {
                        SubLObject var153 = f21744(var151);
                        SubLObject var154 = (SubLObject)NIL;
                        var154 = var153.first();
                        while (NIL == var152 && NIL != var153) {
                            if (NIL != assertion_handles_oc.f11041(var154, (SubLObject)UNPROVIDED)) {
                                final SubLObject var155 = f21762(var154);
                                final SubLObject var156 = module0178.f11336(var154);
                                if (var156.eql(f21742(var151))) {
                                    if (NIL != module0260.f17089(var141, var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var144 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var151, (SubLObject)NIL, var155), var144);
                                    }
                                    if (NIL != module0260.f17094(var141, var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var144 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var151, (SubLObject)T, var155), var144);
                                    }
                                }
                            }
                            else {
                                var152 = (SubLObject)T;
                            }
                            var153 = var153.rest();
                            var154 = var153.first();
                        }
                    }
                    if (NIL != var152) {
                        f21763(var151, var148);
                    }
                    var150 = var150.rest();
                    var151 = var150.first();
                }
            }
            module0066.f4842(var147);
        }
        finally {
            module0147.$g2095$.rebind(var146, var142);
            module0147.$g2094$.rebind(var145, var142);
        }
        return Values.values(var143, var144);
    }
    
    public static SubLObject f21726(final SubLObject var18, final SubLObject var19) {
        final SubLObject var20 = f21759(var18);
        final SubLObject var21 = Sequences.find(var19, var20, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var21;
    }
    
    public static SubLObject f21764(final SubLObject var52, final SubLObject var19) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = f21726(var52, var19);
        if (NIL == var54) {
            if (NIL == module0012.$silent_progressP$.getDynamicValue(var53)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic74$, var52, var19);
            }
            var54 = f21735(var52, var19, (SubLObject)T);
        }
        return var54;
    }
    
    public static SubLObject f21763(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL != var7) {
            return module0084.f5771(f21734(), var7, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var9;
        for (var9 = module0066.f4838(module0067.f4891(f21734())); NIL == module0066.f4841(var9); var9 = module0066.f4840(var9)) {
            var8.resetMultipleValues();
            final SubLObject var10 = module0066.f4839(var9);
            final SubLObject var11 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            SubLObject var12 = var11;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                if (var6.eql(var13)) {
                    f21763(var13, var10);
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        module0066.f4842(var9);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21765(final SubLObject var7) {
        SubLObject var8 = f21759(var7);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            f21763(var9, var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21766() {
        return module0067.f4881($g2824$.getGlobalValue());
    }
    
    public static SubLObject f21767() {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)ZERO_INTEGER;
        SubLObject var27;
        for (var27 = module0066.f4838(module0067.f4891($g2824$.getGlobalValue())); NIL == module0066.f4841(var27); var27 = module0066.f4840(var27)) {
            var25.resetMultipleValues();
            final SubLObject var28 = module0066.f4839(var27);
            final SubLObject var29 = var25.secondMultipleValue();
            var25.resetMultipleValues();
            SubLObject var30 = var29;
            SubLObject var31 = (SubLObject)NIL;
            var31 = var30.first();
            while (NIL != var30) {
                SubLObject var33;
                final SubLObject var32 = var33 = var31;
                SubLObject var34 = (SubLObject)NIL;
                SubLObject var35 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic76$);
                var34 = var33.first();
                var33 = (var35 = var33.rest());
                if (var35.numG((SubLObject)ZERO_INTEGER)) {
                    var26 = Numbers.add(var26, var35);
                }
                var30 = var30.rest();
                var31 = var30.first();
            }
        }
        module0066.f4842(var27);
        return var26;
    }
    
    public static SubLObject f21768(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var162_163 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic77$);
            var162_163 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic77$);
            if (NIL == conses_high.member(var162_163, (SubLObject)$ic78$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var162_163 == $ic79$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic77$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic80$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)ConsesLow.listS((SubLObject)$ic83$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic80$, var13), ConsesLow.append(var14, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic84$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic80$, var13), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f21769(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var172_173 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic77$);
            var172_173 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic77$);
            if (NIL == conses_high.member(var172_173, (SubLObject)$ic78$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var172_173 == $ic79$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic77$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic80$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)$ic85$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic86$, (SubLObject)ConsesLow.list(var15, var8, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var7), (SubLObject)NIL, (SubLObject)NIL, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic87$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic88$, (SubLObject)ConsesLow.list((SubLObject)EQUAL, var15, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var7)), var7, (SubLObject)ConsesLow.list((SubLObject)$ic89$, var7, var15, var8)))), ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f21770(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var182_183 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic77$);
            var182_183 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic77$);
            if (NIL == conses_high.member(var182_183, (SubLObject)$ic78$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var182_183 == $ic79$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic77$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic80$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)$ic90$;
        final SubLObject var16 = (SubLObject)$ic91$;
        final SubLObject var17 = (SubLObject)$ic92$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic93$, (SubLObject)ConsesLow.list(var16, var17), (SubLObject)ConsesLow.list((SubLObject)$ic94$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic95$, (SubLObject)ConsesLow.list(var15, var16, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic87$, (SubLObject)ConsesLow.list(reader.bq_cons(var8, (SubLObject)$ic96$), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic88$, (SubLObject)ConsesLow.list((SubLObject)EQUAL, var15, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var7)), var7, (SubLObject)ConsesLow.list((SubLObject)$ic89$, var7, var15, var8)))), ConsesLow.append(var14, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic95$, (SubLObject)ConsesLow.list(var15, var17, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic87$, (SubLObject)ConsesLow.list(reader.bq_cons(var8, (SubLObject)$ic97$), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic88$, (SubLObject)ConsesLow.list((SubLObject)EQUAL, var15, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var7)), var7, (SubLObject)ConsesLow.list((SubLObject)$ic89$, var7, var15, var8)))), ConsesLow.append(var14, (SubLObject)NIL))));
    }
    
    public static SubLObject f21771(final SubLObject var27, SubLObject var153) {
        if (var153 == UNPROVIDED) {
            var153 = module0147.f9552((SubLObject)UNPROVIDED);
        }
        final SubLThread var154 = SubLProcess.currentSubLThread();
        SubLObject var155 = (SubLObject)NIL;
        SubLObject var156 = (SubLObject)NIL;
        SubLObject var157 = (SubLObject)NIL;
        final SubLObject var158 = Time.get_internal_real_time();
        if (NIL != module0147.f9491(var153, (SubLObject)$ic98$)) {
            final SubLObject var159 = module0147.$g2094$.currentBinding(var154);
            final SubLObject var160 = module0147.$g2095$.currentBinding(var154);
            try {
                module0147.$g2094$.bind((SubLObject)$ic98$, var154);
                module0147.$g2095$.bind($ic99$, var154);
                final SubLObject var161 = (SubLObject)$ic61$;
                final SubLObject var162 = module0056.f4145(var161);
                SubLObject var163 = (SubLObject)NIL;
                final SubLObject var28_192 = module0139.$g1635$.currentBinding(var154);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var154);
                    final SubLObject var164 = (SubLObject)NIL;
                    final SubLObject var28_193 = module0141.$g1714$.currentBinding(var154);
                    final SubLObject var29_194 = module0141.$g1715$.currentBinding(var154);
                    try {
                        module0141.$g1714$.bind((NIL != var164) ? var164 : module0141.f9283(), var154);
                        module0141.$g1715$.bind((SubLObject)((NIL != var164) ? $ic63$ : module0141.$g1715$.getDynamicValue(var154)), var154);
                        if (NIL != var164 && NIL != module0136.f8864() && NIL == module0141.f9279(var164)) {
                            final SubLObject var165 = module0136.$g1591$.getDynamicValue(var154);
                            if (var165.eql((SubLObject)$ic64$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var164, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var165.eql((SubLObject)$ic67$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var164, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var165.eql((SubLObject)$ic69$)) {
                                Errors.warn((SubLObject)$ic65$, var164, (SubLObject)$ic66$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var154));
                                Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var164, (SubLObject)$ic66$);
                            }
                        }
                        final SubLObject var28_194 = module0141.$g1670$.currentBinding(var154);
                        final SubLObject var29_195 = module0141.$g1671$.currentBinding(var154);
                        final SubLObject var166 = module0141.$g1672$.currentBinding(var154);
                        final SubLObject var167 = module0141.$g1674$.currentBinding(var154);
                        final SubLObject var168 = module0137.$g1605$.currentBinding(var154);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic57$), var154);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic57$)), var154);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic57$)), var154);
                            module0141.$g1674$.bind((SubLObject)NIL, var154);
                            module0137.$g1605$.bind(module0137.f8955($ic57$), var154);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var27, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var28_195 = module0141.$g1677$.currentBinding(var154);
                                final SubLObject var29_196 = module0138.$g1619$.currentBinding(var154);
                                final SubLObject var34_199 = module0141.$g1674$.currentBinding(var154);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var154);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic57$)), var154);
                                    module0141.$g1674$.bind((SubLObject)NIL, var154);
                                    module0249.f16055(var27, (SubLObject)UNPROVIDED);
                                    for (var163 = (SubLObject)ConsesLow.list(var27, module0141.f9195()); NIL != var163; var163 = module0056.f4150(var162)) {
                                        final SubLObject var188_200 = var163.first();
                                        final SubLObject var169 = conses_high.second(var163);
                                        final SubLObject var170 = var188_200;
                                        final SubLObject var28_196 = module0141.$g1674$.currentBinding(var154);
                                        try {
                                            module0141.$g1674$.bind(var169, var154);
                                            final SubLObject var171 = var169;
                                            if (NIL != var171) {
                                                var156 = (SubLObject)ConsesLow.cons(var170, var156);
                                            }
                                            else {
                                                var155 = (SubLObject)ConsesLow.cons(var170, var155);
                                            }
                                            SubLObject var173;
                                            final SubLObject var172 = var173 = module0200.f12443(module0137.f8955($ic57$));
                                            SubLObject var174 = (SubLObject)NIL;
                                            var174 = var173.first();
                                            while (NIL != var173) {
                                                final SubLObject var28_197 = module0137.$g1605$.currentBinding(var154);
                                                final SubLObject var29_197 = module0141.$g1674$.currentBinding(var154);
                                                try {
                                                    module0137.$g1605$.bind(var174, var154);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var154)) : module0141.$g1674$.getDynamicValue(var154)), var154);
                                                    final SubLObject var175 = module0228.f15229(var188_200);
                                                    if (NIL != module0138.f8992(var175)) {
                                                        final SubLObject var176 = module0242.f15664(var175, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var176) {
                                                            final SubLObject var177 = module0245.f15834(var176, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var177) {
                                                                SubLObject var178;
                                                                for (var178 = module0066.f4838(module0067.f4891(var177)); NIL == module0066.f4841(var178); var178 = module0066.f4840(var178)) {
                                                                    var154.resetMultipleValues();
                                                                    final SubLObject var179 = module0066.f4839(var178);
                                                                    final SubLObject var180 = var154.secondMultipleValue();
                                                                    var154.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var179)) {
                                                                        final SubLObject var28_198 = module0138.$g1623$.currentBinding(var154);
                                                                        try {
                                                                            module0138.$g1623$.bind(var179, var154);
                                                                            SubLObject var59_206;
                                                                            for (var59_206 = module0066.f4838(module0067.f4891(var180)); NIL == module0066.f4841(var59_206); var59_206 = module0066.f4840(var59_206)) {
                                                                                var154.resetMultipleValues();
                                                                                final SubLObject var181 = module0066.f4839(var59_206);
                                                                                final SubLObject var182 = var154.secondMultipleValue();
                                                                                var154.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var181)) {
                                                                                    final SubLObject var28_199 = module0138.$g1624$.currentBinding(var154);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var181, var154);
                                                                                        final SubLObject var183 = var182;
                                                                                        if (NIL != module0077.f5302(var183)) {
                                                                                            final SubLObject var184 = module0077.f5333(var183);
                                                                                            SubLObject var185;
                                                                                            SubLObject var186;
                                                                                            SubLObject var187;
                                                                                            for (var185 = module0032.f1741(var184), var186 = (SubLObject)NIL, var186 = module0032.f1742(var185, var184); NIL == module0032.f1744(var185, var186); var186 = module0032.f1743(var186)) {
                                                                                                var187 = module0032.f1745(var185, var186);
                                                                                                if (NIL != module0032.f1746(var186, var187) && NIL == module0249.f16059(var187, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var187, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var187, module0141.f9195()), var162);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var183.isList()) {
                                                                                            SubLObject var188 = var183;
                                                                                            SubLObject var189 = (SubLObject)NIL;
                                                                                            var189 = var188.first();
                                                                                            while (NIL != var188) {
                                                                                                if (NIL == module0249.f16059(var189, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var189, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var189, module0141.f9195()), var162);
                                                                                                }
                                                                                                var188 = var188.rest();
                                                                                                var189 = var188.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic71$, var183);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var28_199, var154);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var59_206);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_198, var154);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var178);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var175, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var61_209;
                                                        final SubLObject var190 = var61_209 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var154), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var154), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var191 = (SubLObject)NIL;
                                                        var191 = var61_209.first();
                                                        while (NIL != var61_209) {
                                                            final SubLObject var28_200 = module0138.$g1625$.currentBinding(var154);
                                                            try {
                                                                module0138.$g1625$.bind(var191, var154);
                                                                final SubLObject var193;
                                                                final SubLObject var192 = var193 = Functions.funcall(var191, var175);
                                                                if (NIL != module0077.f5302(var193)) {
                                                                    final SubLObject var194 = module0077.f5333(var193);
                                                                    SubLObject var195;
                                                                    SubLObject var196;
                                                                    SubLObject var197;
                                                                    for (var195 = module0032.f1741(var194), var196 = (SubLObject)NIL, var196 = module0032.f1742(var195, var194); NIL == module0032.f1744(var195, var196); var196 = module0032.f1743(var196)) {
                                                                        var197 = module0032.f1745(var195, var196);
                                                                        if (NIL != module0032.f1746(var196, var197) && NIL == module0249.f16059(var197, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var197, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var197, module0141.f9195()), var162);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var193.isList()) {
                                                                    SubLObject var198 = var193;
                                                                    SubLObject var199 = (SubLObject)NIL;
                                                                    var199 = var198.first();
                                                                    while (NIL != var198) {
                                                                        if (NIL == module0249.f16059(var199, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var199, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var199, module0141.f9195()), var162);
                                                                        }
                                                                        var198 = var198.rest();
                                                                        var199 = var198.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic71$, var193);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var28_200, var154);
                                                            }
                                                            var61_209 = var61_209.rest();
                                                            var191 = var61_209.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var29_197, var154);
                                                    module0137.$g1605$.rebind(var28_197, var154);
                                                }
                                                var173 = var173.rest();
                                                var174 = var173.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var28_196, var154);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var34_199, var154);
                                    module0138.$g1619$.rebind(var29_196, var154);
                                    module0141.$g1677$.rebind(var28_195, var154);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var27, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var168, var154);
                            module0141.$g1674$.rebind(var167, var154);
                            module0141.$g1672$.rebind(var166, var154);
                            module0141.$g1671$.rebind(var29_195, var154);
                            module0141.$g1670$.rebind(var28_194, var154);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var29_194, var154);
                        module0141.$g1714$.rebind(var28_193, var154);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var154));
                }
                finally {
                    module0139.$g1635$.rebind(var28_192, var154);
                }
            }
            finally {
                module0147.$g2095$.rebind(var160, var154);
                module0147.$g2094$.rebind(var159, var154);
            }
        }
        else if (NIL != module0147.f9491(var153, (SubLObject)$ic12$)) {
            final SubLObject var159 = module0147.$g2094$.currentBinding(var154);
            final SubLObject var160 = module0147.$g2095$.currentBinding(var154);
            try {
                module0147.$g2094$.bind((SubLObject)$ic12$, var154);
                module0147.$g2095$.bind($ic13$, var154);
                final SubLObject var161 = (SubLObject)$ic61$;
                final SubLObject var162 = module0056.f4145(var161);
                SubLObject var163 = (SubLObject)NIL;
                final SubLObject var28_201 = module0139.$g1635$.currentBinding(var154);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var154);
                    final SubLObject var164 = (SubLObject)NIL;
                    final SubLObject var28_202 = module0141.$g1714$.currentBinding(var154);
                    final SubLObject var29_198 = module0141.$g1715$.currentBinding(var154);
                    try {
                        module0141.$g1714$.bind((NIL != var164) ? var164 : module0141.f9283(), var154);
                        module0141.$g1715$.bind((SubLObject)((NIL != var164) ? $ic63$ : module0141.$g1715$.getDynamicValue(var154)), var154);
                        if (NIL != var164 && NIL != module0136.f8864() && NIL == module0141.f9279(var164)) {
                            final SubLObject var165 = module0136.$g1591$.getDynamicValue(var154);
                            if (var165.eql((SubLObject)$ic64$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var164, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var165.eql((SubLObject)$ic67$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var164, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var165.eql((SubLObject)$ic69$)) {
                                Errors.warn((SubLObject)$ic65$, var164, (SubLObject)$ic66$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var154));
                                Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var164, (SubLObject)$ic66$);
                            }
                        }
                        final SubLObject var28_203 = module0141.$g1670$.currentBinding(var154);
                        final SubLObject var29_199 = module0141.$g1671$.currentBinding(var154);
                        final SubLObject var166 = module0141.$g1672$.currentBinding(var154);
                        final SubLObject var167 = module0141.$g1674$.currentBinding(var154);
                        final SubLObject var168 = module0137.$g1605$.currentBinding(var154);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic57$), var154);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic57$)), var154);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic57$)), var154);
                            module0141.$g1674$.bind((SubLObject)NIL, var154);
                            module0137.$g1605$.bind(module0137.f8955($ic57$), var154);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var27, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var28_204 = module0141.$g1677$.currentBinding(var154);
                                final SubLObject var29_200 = module0138.$g1619$.currentBinding(var154);
                                final SubLObject var34_200 = module0141.$g1674$.currentBinding(var154);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var154);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic57$)), var154);
                                    module0141.$g1674$.bind((SubLObject)NIL, var154);
                                    module0249.f16055(var27, (SubLObject)UNPROVIDED);
                                    for (var163 = (SubLObject)ConsesLow.list(var27, module0141.f9195()); NIL != var163; var163 = module0056.f4150(var162)) {
                                        final SubLObject var188_201 = var163.first();
                                        final SubLObject var169 = conses_high.second(var163);
                                        final SubLObject var170 = var188_201;
                                        final SubLObject var28_205 = module0141.$g1674$.currentBinding(var154);
                                        try {
                                            module0141.$g1674$.bind(var169, var154);
                                            final SubLObject var171 = var169;
                                            if (NIL != var171) {
                                                var156 = (SubLObject)ConsesLow.cons(var170, var156);
                                            }
                                            else {
                                                var155 = (SubLObject)ConsesLow.cons(var170, var155);
                                            }
                                            SubLObject var173;
                                            final SubLObject var172 = var173 = module0200.f12443(module0137.f8955($ic57$));
                                            SubLObject var174 = (SubLObject)NIL;
                                            var174 = var173.first();
                                            while (NIL != var173) {
                                                final SubLObject var28_206 = module0137.$g1605$.currentBinding(var154);
                                                final SubLObject var29_201 = module0141.$g1674$.currentBinding(var154);
                                                try {
                                                    module0137.$g1605$.bind(var174, var154);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var154)) : module0141.$g1674$.getDynamicValue(var154)), var154);
                                                    final SubLObject var175 = module0228.f15229(var188_201);
                                                    if (NIL != module0138.f8992(var175)) {
                                                        final SubLObject var176 = module0242.f15664(var175, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var176) {
                                                            final SubLObject var177 = module0245.f15834(var176, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var177) {
                                                                SubLObject var178;
                                                                for (var178 = module0066.f4838(module0067.f4891(var177)); NIL == module0066.f4841(var178); var178 = module0066.f4840(var178)) {
                                                                    var154.resetMultipleValues();
                                                                    final SubLObject var179 = module0066.f4839(var178);
                                                                    final SubLObject var180 = var154.secondMultipleValue();
                                                                    var154.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var179)) {
                                                                        final SubLObject var28_207 = module0138.$g1623$.currentBinding(var154);
                                                                        try {
                                                                            module0138.$g1623$.bind(var179, var154);
                                                                            SubLObject var59_207;
                                                                            for (var59_207 = module0066.f4838(module0067.f4891(var180)); NIL == module0066.f4841(var59_207); var59_207 = module0066.f4840(var59_207)) {
                                                                                var154.resetMultipleValues();
                                                                                final SubLObject var181 = module0066.f4839(var59_207);
                                                                                final SubLObject var182 = var154.secondMultipleValue();
                                                                                var154.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var181)) {
                                                                                    final SubLObject var28_208 = module0138.$g1624$.currentBinding(var154);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var181, var154);
                                                                                        final SubLObject var183 = var182;
                                                                                        if (NIL != module0077.f5302(var183)) {
                                                                                            final SubLObject var184 = module0077.f5333(var183);
                                                                                            SubLObject var185;
                                                                                            SubLObject var186;
                                                                                            SubLObject var187;
                                                                                            for (var185 = module0032.f1741(var184), var186 = (SubLObject)NIL, var186 = module0032.f1742(var185, var184); NIL == module0032.f1744(var185, var186); var186 = module0032.f1743(var186)) {
                                                                                                var187 = module0032.f1745(var185, var186);
                                                                                                if (NIL != module0032.f1746(var186, var187) && NIL == module0249.f16059(var187, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var187, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var187, module0141.f9195()), var162);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var183.isList()) {
                                                                                            SubLObject var188 = var183;
                                                                                            SubLObject var189 = (SubLObject)NIL;
                                                                                            var189 = var188.first();
                                                                                            while (NIL != var188) {
                                                                                                if (NIL == module0249.f16059(var189, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var189, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var189, module0141.f9195()), var162);
                                                                                                }
                                                                                                var188 = var188.rest();
                                                                                                var189 = var188.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic71$, var183);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var28_208, var154);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var59_207);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_207, var154);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var178);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var175, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var61_210;
                                                        final SubLObject var190 = var61_210 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var154), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var154), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var191 = (SubLObject)NIL;
                                                        var191 = var61_210.first();
                                                        while (NIL != var61_210) {
                                                            final SubLObject var28_209 = module0138.$g1625$.currentBinding(var154);
                                                            try {
                                                                module0138.$g1625$.bind(var191, var154);
                                                                final SubLObject var193;
                                                                final SubLObject var192 = var193 = Functions.funcall(var191, var175);
                                                                if (NIL != module0077.f5302(var193)) {
                                                                    final SubLObject var194 = module0077.f5333(var193);
                                                                    SubLObject var195;
                                                                    SubLObject var196;
                                                                    SubLObject var197;
                                                                    for (var195 = module0032.f1741(var194), var196 = (SubLObject)NIL, var196 = module0032.f1742(var195, var194); NIL == module0032.f1744(var195, var196); var196 = module0032.f1743(var196)) {
                                                                        var197 = module0032.f1745(var195, var196);
                                                                        if (NIL != module0032.f1746(var196, var197) && NIL == module0249.f16059(var197, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var197, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var197, module0141.f9195()), var162);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var193.isList()) {
                                                                    SubLObject var198 = var193;
                                                                    SubLObject var199 = (SubLObject)NIL;
                                                                    var199 = var198.first();
                                                                    while (NIL != var198) {
                                                                        if (NIL == module0249.f16059(var199, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var199, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var199, module0141.f9195()), var162);
                                                                        }
                                                                        var198 = var198.rest();
                                                                        var199 = var198.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic71$, var193);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var28_209, var154);
                                                            }
                                                            var61_210 = var61_210.rest();
                                                            var191 = var61_210.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var29_201, var154);
                                                    module0137.$g1605$.rebind(var28_206, var154);
                                                }
                                                var173 = var173.rest();
                                                var174 = var173.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var28_205, var154);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var34_200, var154);
                                    module0138.$g1619$.rebind(var29_200, var154);
                                    module0141.$g1677$.rebind(var28_204, var154);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var27, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var168, var154);
                            module0141.$g1674$.rebind(var167, var154);
                            module0141.$g1672$.rebind(var166, var154);
                            module0141.$g1671$.rebind(var29_199, var154);
                            module0141.$g1670$.rebind(var28_203, var154);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var29_198, var154);
                        module0141.$g1714$.rebind(var28_202, var154);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var154));
                }
                finally {
                    module0139.$g1635$.rebind(var28_201, var154);
                }
            }
            finally {
                module0147.$g2095$.rebind(var160, var154);
                module0147.$g2094$.rebind(var159, var154);
            }
        }
        else if (NIL != module0161.f10488(var153)) {
            final SubLObject var159 = module0147.$g2094$.currentBinding(var154);
            final SubLObject var160 = module0147.$g2096$.currentBinding(var154);
            try {
                module0147.$g2094$.bind((SubLObject)$ic100$, var154);
                module0147.$g2096$.bind(module0161.f10522(var153), var154);
                final SubLObject var161 = (SubLObject)$ic61$;
                final SubLObject var162 = module0056.f4145(var161);
                SubLObject var163 = (SubLObject)NIL;
                final SubLObject var28_210 = module0139.$g1635$.currentBinding(var154);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var154);
                    final SubLObject var164 = (SubLObject)NIL;
                    final SubLObject var28_211 = module0141.$g1714$.currentBinding(var154);
                    final SubLObject var29_202 = module0141.$g1715$.currentBinding(var154);
                    try {
                        module0141.$g1714$.bind((NIL != var164) ? var164 : module0141.f9283(), var154);
                        module0141.$g1715$.bind((SubLObject)((NIL != var164) ? $ic63$ : module0141.$g1715$.getDynamicValue(var154)), var154);
                        if (NIL != var164 && NIL != module0136.f8864() && NIL == module0141.f9279(var164)) {
                            final SubLObject var165 = module0136.$g1591$.getDynamicValue(var154);
                            if (var165.eql((SubLObject)$ic64$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var164, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var165.eql((SubLObject)$ic67$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var164, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var165.eql((SubLObject)$ic69$)) {
                                Errors.warn((SubLObject)$ic65$, var164, (SubLObject)$ic66$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var154));
                                Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var164, (SubLObject)$ic66$);
                            }
                        }
                        final SubLObject var28_212 = module0141.$g1670$.currentBinding(var154);
                        final SubLObject var29_203 = module0141.$g1671$.currentBinding(var154);
                        final SubLObject var166 = module0141.$g1672$.currentBinding(var154);
                        final SubLObject var167 = module0141.$g1674$.currentBinding(var154);
                        final SubLObject var168 = module0137.$g1605$.currentBinding(var154);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic57$), var154);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic57$)), var154);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic57$)), var154);
                            module0141.$g1674$.bind((SubLObject)NIL, var154);
                            module0137.$g1605$.bind(module0137.f8955($ic57$), var154);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var27, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var28_213 = module0141.$g1677$.currentBinding(var154);
                                final SubLObject var29_204 = module0138.$g1619$.currentBinding(var154);
                                final SubLObject var34_201 = module0141.$g1674$.currentBinding(var154);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var154);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic57$)), var154);
                                    module0141.$g1674$.bind((SubLObject)NIL, var154);
                                    module0249.f16055(var27, (SubLObject)UNPROVIDED);
                                    for (var163 = (SubLObject)ConsesLow.list(var27, module0141.f9195()); NIL != var163; var163 = module0056.f4150(var162)) {
                                        final SubLObject var188_202 = var163.first();
                                        final SubLObject var169 = conses_high.second(var163);
                                        final SubLObject var170 = var188_202;
                                        final SubLObject var28_214 = module0141.$g1674$.currentBinding(var154);
                                        try {
                                            module0141.$g1674$.bind(var169, var154);
                                            final SubLObject var171 = var169;
                                            if (NIL != var171) {
                                                var156 = (SubLObject)ConsesLow.cons(var170, var156);
                                            }
                                            else {
                                                var155 = (SubLObject)ConsesLow.cons(var170, var155);
                                            }
                                            SubLObject var173;
                                            final SubLObject var172 = var173 = module0200.f12443(module0137.f8955($ic57$));
                                            SubLObject var174 = (SubLObject)NIL;
                                            var174 = var173.first();
                                            while (NIL != var173) {
                                                final SubLObject var28_215 = module0137.$g1605$.currentBinding(var154);
                                                final SubLObject var29_205 = module0141.$g1674$.currentBinding(var154);
                                                try {
                                                    module0137.$g1605$.bind(var174, var154);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var154)) : module0141.$g1674$.getDynamicValue(var154)), var154);
                                                    final SubLObject var175 = module0228.f15229(var188_202);
                                                    if (NIL != module0138.f8992(var175)) {
                                                        final SubLObject var176 = module0242.f15664(var175, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var176) {
                                                            final SubLObject var177 = module0245.f15834(var176, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var177) {
                                                                SubLObject var178;
                                                                for (var178 = module0066.f4838(module0067.f4891(var177)); NIL == module0066.f4841(var178); var178 = module0066.f4840(var178)) {
                                                                    var154.resetMultipleValues();
                                                                    final SubLObject var179 = module0066.f4839(var178);
                                                                    final SubLObject var180 = var154.secondMultipleValue();
                                                                    var154.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var179)) {
                                                                        final SubLObject var28_216 = module0138.$g1623$.currentBinding(var154);
                                                                        try {
                                                                            module0138.$g1623$.bind(var179, var154);
                                                                            SubLObject var59_208;
                                                                            for (var59_208 = module0066.f4838(module0067.f4891(var180)); NIL == module0066.f4841(var59_208); var59_208 = module0066.f4840(var59_208)) {
                                                                                var154.resetMultipleValues();
                                                                                final SubLObject var181 = module0066.f4839(var59_208);
                                                                                final SubLObject var182 = var154.secondMultipleValue();
                                                                                var154.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var181)) {
                                                                                    final SubLObject var28_217 = module0138.$g1624$.currentBinding(var154);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var181, var154);
                                                                                        final SubLObject var183 = var182;
                                                                                        if (NIL != module0077.f5302(var183)) {
                                                                                            final SubLObject var184 = module0077.f5333(var183);
                                                                                            SubLObject var185;
                                                                                            SubLObject var186;
                                                                                            SubLObject var187;
                                                                                            for (var185 = module0032.f1741(var184), var186 = (SubLObject)NIL, var186 = module0032.f1742(var185, var184); NIL == module0032.f1744(var185, var186); var186 = module0032.f1743(var186)) {
                                                                                                var187 = module0032.f1745(var185, var186);
                                                                                                if (NIL != module0032.f1746(var186, var187) && NIL == module0249.f16059(var187, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var187, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var187, module0141.f9195()), var162);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var183.isList()) {
                                                                                            SubLObject var188 = var183;
                                                                                            SubLObject var189 = (SubLObject)NIL;
                                                                                            var189 = var188.first();
                                                                                            while (NIL != var188) {
                                                                                                if (NIL == module0249.f16059(var189, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var189, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var189, module0141.f9195()), var162);
                                                                                                }
                                                                                                var188 = var188.rest();
                                                                                                var189 = var188.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic71$, var183);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var28_217, var154);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var59_208);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_216, var154);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var178);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var175, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var61_211;
                                                        final SubLObject var190 = var61_211 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var154), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var154), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var191 = (SubLObject)NIL;
                                                        var191 = var61_211.first();
                                                        while (NIL != var61_211) {
                                                            final SubLObject var28_218 = module0138.$g1625$.currentBinding(var154);
                                                            try {
                                                                module0138.$g1625$.bind(var191, var154);
                                                                final SubLObject var193;
                                                                final SubLObject var192 = var193 = Functions.funcall(var191, var175);
                                                                if (NIL != module0077.f5302(var193)) {
                                                                    final SubLObject var194 = module0077.f5333(var193);
                                                                    SubLObject var195;
                                                                    SubLObject var196;
                                                                    SubLObject var197;
                                                                    for (var195 = module0032.f1741(var194), var196 = (SubLObject)NIL, var196 = module0032.f1742(var195, var194); NIL == module0032.f1744(var195, var196); var196 = module0032.f1743(var196)) {
                                                                        var197 = module0032.f1745(var195, var196);
                                                                        if (NIL != module0032.f1746(var196, var197) && NIL == module0249.f16059(var197, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var197, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var197, module0141.f9195()), var162);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var193.isList()) {
                                                                    SubLObject var198 = var193;
                                                                    SubLObject var199 = (SubLObject)NIL;
                                                                    var199 = var198.first();
                                                                    while (NIL != var198) {
                                                                        if (NIL == module0249.f16059(var199, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var199, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var199, module0141.f9195()), var162);
                                                                        }
                                                                        var198 = var198.rest();
                                                                        var199 = var198.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic71$, var193);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var28_218, var154);
                                                            }
                                                            var61_211 = var61_211.rest();
                                                            var191 = var61_211.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var29_205, var154);
                                                    module0137.$g1605$.rebind(var28_215, var154);
                                                }
                                                var173 = var173.rest();
                                                var174 = var173.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var28_214, var154);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var34_201, var154);
                                    module0138.$g1619$.rebind(var29_204, var154);
                                    module0141.$g1677$.rebind(var28_213, var154);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var27, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var168, var154);
                            module0141.$g1674$.rebind(var167, var154);
                            module0141.$g1672$.rebind(var166, var154);
                            module0141.$g1671$.rebind(var29_203, var154);
                            module0141.$g1670$.rebind(var28_212, var154);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var29_202, var154);
                        module0141.$g1714$.rebind(var28_211, var154);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var154));
                }
                finally {
                    module0139.$g1635$.rebind(var28_210, var154);
                }
            }
            finally {
                module0147.$g2096$.rebind(var160, var154);
                module0147.$g2094$.rebind(var159, var154);
            }
        }
        else {
            final SubLObject var159 = module0147.$g2094$.currentBinding(var154);
            final SubLObject var160 = module0147.$g2095$.currentBinding(var154);
            try {
                module0147.$g2094$.bind((SubLObject)$ic101$, var154);
                module0147.$g2095$.bind(var153, var154);
                final SubLObject var161 = (SubLObject)$ic61$;
                final SubLObject var162 = module0056.f4145(var161);
                SubLObject var163 = (SubLObject)NIL;
                final SubLObject var28_219 = module0139.$g1635$.currentBinding(var154);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var154);
                    final SubLObject var164 = (SubLObject)NIL;
                    final SubLObject var28_220 = module0141.$g1714$.currentBinding(var154);
                    final SubLObject var29_206 = module0141.$g1715$.currentBinding(var154);
                    try {
                        module0141.$g1714$.bind((NIL != var164) ? var164 : module0141.f9283(), var154);
                        module0141.$g1715$.bind((SubLObject)((NIL != var164) ? $ic63$ : module0141.$g1715$.getDynamicValue(var154)), var154);
                        if (NIL != var164 && NIL != module0136.f8864() && NIL == module0141.f9279(var164)) {
                            final SubLObject var165 = module0136.$g1591$.getDynamicValue(var154);
                            if (var165.eql((SubLObject)$ic64$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var164, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var165.eql((SubLObject)$ic67$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var164, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var165.eql((SubLObject)$ic69$)) {
                                Errors.warn((SubLObject)$ic65$, var164, (SubLObject)$ic66$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var154));
                                Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var164, (SubLObject)$ic66$);
                            }
                        }
                        final SubLObject var28_221 = module0141.$g1670$.currentBinding(var154);
                        final SubLObject var29_207 = module0141.$g1671$.currentBinding(var154);
                        final SubLObject var166 = module0141.$g1672$.currentBinding(var154);
                        final SubLObject var167 = module0141.$g1674$.currentBinding(var154);
                        final SubLObject var168 = module0137.$g1605$.currentBinding(var154);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic57$), var154);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic57$)), var154);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic57$)), var154);
                            module0141.$g1674$.bind((SubLObject)NIL, var154);
                            module0137.$g1605$.bind(module0137.f8955($ic57$), var154);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var27, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var28_222 = module0141.$g1677$.currentBinding(var154);
                                final SubLObject var29_208 = module0138.$g1619$.currentBinding(var154);
                                final SubLObject var34_202 = module0141.$g1674$.currentBinding(var154);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var154);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic57$)), var154);
                                    module0141.$g1674$.bind((SubLObject)NIL, var154);
                                    module0249.f16055(var27, (SubLObject)UNPROVIDED);
                                    for (var163 = (SubLObject)ConsesLow.list(var27, module0141.f9195()); NIL != var163; var163 = module0056.f4150(var162)) {
                                        final SubLObject var188_203 = var163.first();
                                        final SubLObject var169 = conses_high.second(var163);
                                        final SubLObject var170 = var188_203;
                                        final SubLObject var28_223 = module0141.$g1674$.currentBinding(var154);
                                        try {
                                            module0141.$g1674$.bind(var169, var154);
                                            final SubLObject var171 = var169;
                                            if (NIL != var171) {
                                                var156 = (SubLObject)ConsesLow.cons(var170, var156);
                                            }
                                            else {
                                                var155 = (SubLObject)ConsesLow.cons(var170, var155);
                                            }
                                            SubLObject var173;
                                            final SubLObject var172 = var173 = module0200.f12443(module0137.f8955($ic57$));
                                            SubLObject var174 = (SubLObject)NIL;
                                            var174 = var173.first();
                                            while (NIL != var173) {
                                                final SubLObject var28_224 = module0137.$g1605$.currentBinding(var154);
                                                final SubLObject var29_209 = module0141.$g1674$.currentBinding(var154);
                                                try {
                                                    module0137.$g1605$.bind(var174, var154);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var154)) : module0141.$g1674$.getDynamicValue(var154)), var154);
                                                    final SubLObject var175 = module0228.f15229(var188_203);
                                                    if (NIL != module0138.f8992(var175)) {
                                                        final SubLObject var176 = module0242.f15664(var175, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var176) {
                                                            final SubLObject var177 = module0245.f15834(var176, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var177) {
                                                                SubLObject var178;
                                                                for (var178 = module0066.f4838(module0067.f4891(var177)); NIL == module0066.f4841(var178); var178 = module0066.f4840(var178)) {
                                                                    var154.resetMultipleValues();
                                                                    final SubLObject var179 = module0066.f4839(var178);
                                                                    final SubLObject var180 = var154.secondMultipleValue();
                                                                    var154.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var179)) {
                                                                        final SubLObject var28_225 = module0138.$g1623$.currentBinding(var154);
                                                                        try {
                                                                            module0138.$g1623$.bind(var179, var154);
                                                                            SubLObject var59_209;
                                                                            for (var59_209 = module0066.f4838(module0067.f4891(var180)); NIL == module0066.f4841(var59_209); var59_209 = module0066.f4840(var59_209)) {
                                                                                var154.resetMultipleValues();
                                                                                final SubLObject var181 = module0066.f4839(var59_209);
                                                                                final SubLObject var182 = var154.secondMultipleValue();
                                                                                var154.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var181)) {
                                                                                    final SubLObject var28_226 = module0138.$g1624$.currentBinding(var154);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var181, var154);
                                                                                        final SubLObject var183 = var182;
                                                                                        if (NIL != module0077.f5302(var183)) {
                                                                                            final SubLObject var184 = module0077.f5333(var183);
                                                                                            SubLObject var185;
                                                                                            SubLObject var186;
                                                                                            SubLObject var187;
                                                                                            for (var185 = module0032.f1741(var184), var186 = (SubLObject)NIL, var186 = module0032.f1742(var185, var184); NIL == module0032.f1744(var185, var186); var186 = module0032.f1743(var186)) {
                                                                                                var187 = module0032.f1745(var185, var186);
                                                                                                if (NIL != module0032.f1746(var186, var187) && NIL == module0249.f16059(var187, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var187, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var187, module0141.f9195()), var162);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var183.isList()) {
                                                                                            SubLObject var188 = var183;
                                                                                            SubLObject var189 = (SubLObject)NIL;
                                                                                            var189 = var188.first();
                                                                                            while (NIL != var188) {
                                                                                                if (NIL == module0249.f16059(var189, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var189, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var189, module0141.f9195()), var162);
                                                                                                }
                                                                                                var188 = var188.rest();
                                                                                                var189 = var188.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic71$, var183);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var28_226, var154);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var59_209);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_225, var154);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var178);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var175, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var61_212;
                                                        final SubLObject var190 = var61_212 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var154), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var154), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var191 = (SubLObject)NIL;
                                                        var191 = var61_212.first();
                                                        while (NIL != var61_212) {
                                                            final SubLObject var28_227 = module0138.$g1625$.currentBinding(var154);
                                                            try {
                                                                module0138.$g1625$.bind(var191, var154);
                                                                final SubLObject var193;
                                                                final SubLObject var192 = var193 = Functions.funcall(var191, var175);
                                                                if (NIL != module0077.f5302(var193)) {
                                                                    final SubLObject var194 = module0077.f5333(var193);
                                                                    SubLObject var195;
                                                                    SubLObject var196;
                                                                    SubLObject var197;
                                                                    for (var195 = module0032.f1741(var194), var196 = (SubLObject)NIL, var196 = module0032.f1742(var195, var194); NIL == module0032.f1744(var195, var196); var196 = module0032.f1743(var196)) {
                                                                        var197 = module0032.f1745(var195, var196);
                                                                        if (NIL != module0032.f1746(var196, var197) && NIL == module0249.f16059(var197, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var197, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var197, module0141.f9195()), var162);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var193.isList()) {
                                                                    SubLObject var198 = var193;
                                                                    SubLObject var199 = (SubLObject)NIL;
                                                                    var199 = var198.first();
                                                                    while (NIL != var198) {
                                                                        if (NIL == module0249.f16059(var199, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var199, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var199, module0141.f9195()), var162);
                                                                        }
                                                                        var198 = var198.rest();
                                                                        var199 = var198.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic71$, var193);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var28_227, var154);
                                                            }
                                                            var61_212 = var61_212.rest();
                                                            var191 = var61_212.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var29_209, var154);
                                                    module0137.$g1605$.rebind(var28_224, var154);
                                                }
                                                var173 = var173.rest();
                                                var174 = var173.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var28_223, var154);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var34_202, var154);
                                    module0138.$g1619$.rebind(var29_208, var154);
                                    module0141.$g1677$.rebind(var28_222, var154);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var27, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var168, var154);
                            module0141.$g1674$.rebind(var167, var154);
                            module0141.$g1672$.rebind(var166, var154);
                            module0141.$g1671$.rebind(var29_207, var154);
                            module0141.$g1670$.rebind(var28_221, var154);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var29_206, var154);
                        module0141.$g1714$.rebind(var28_220, var154);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var154));
                }
                finally {
                    module0139.$g1635$.rebind(var28_219, var154);
                }
            }
            finally {
                module0147.$g2095$.rebind(var160, var154);
                module0147.$g2094$.rebind(var159, var154);
            }
        }
        var157 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var158), time_high.$internal_time_units_per_second$.getGlobalValue());
        module0084.f5762($g2824$.getGlobalValue(), var27, (SubLObject)ConsesLow.cons(var153, var157));
        return Values.values(Sequences.nreverse(var155), Sequences.nreverse(var156));
    }
    
    public static SubLObject f21772(final SubLObject var27, SubLObject var153) {
        if (var153 == UNPROVIDED) {
            var153 = module0147.f9552((SubLObject)UNPROVIDED);
        }
        final SubLThread var154 = SubLProcess.currentSubLThread();
        final SubLObject var155 = module0034.$g879$.getDynamicValue(var154);
        SubLObject var156 = (SubLObject)NIL;
        if (NIL == var155) {
            return f21771(var27, var153);
        }
        var156 = module0034.f1857(var155, (SubLObject)$ic94$, (SubLObject)UNPROVIDED);
        if (NIL == var156) {
            var156 = module0034.f1807(module0034.f1842(var155), (SubLObject)$ic94$, (SubLObject)TWO_INTEGER, (SubLObject)$ic102$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var155, (SubLObject)$ic94$, var156);
        }
        final SubLObject var157 = module0034.f1782(var27, var153);
        final SubLObject var158 = module0034.f1814(var156, var157, (SubLObject)UNPROVIDED);
        if (var158 != $ic103$) {
            SubLObject var159 = var158;
            SubLObject var160 = (SubLObject)NIL;
            var160 = var159.first();
            while (NIL != var159) {
                SubLObject var161 = var160.first();
                final SubLObject var162 = conses_high.second(var160);
                if (var27.equal(var161.first())) {
                    var161 = var161.rest();
                    if (NIL != var161 && NIL == var161.rest() && var153.equal(var161.first())) {
                        return module0034.f1959(var162);
                    }
                }
                var159 = var159.rest();
                var160 = var159.first();
            }
        }
        final SubLObject var163 = Values.arg2(var154.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21771(var27, var153)));
        module0034.f1836(var156, var157, var158, var163, (SubLObject)ConsesLow.list(var27, var153));
        return module0034.f1959(var163);
    }
    
    public static SubLObject f21773(final SubLObject var6, final SubLObject var175, final SubLObject var116) {
        final SubLObject var176 = (NIL != var116) ? f21774(f21742(var6)) : f21742(var6);
        return f21726(var175, var176);
    }
    
    public static SubLObject f21728(final SubLObject var6, final SubLObject var13, SubLObject var20, SubLObject var21, SubLObject var270) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        if (var270 == UNPROVIDED) {
            var270 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLThread var271 = SubLProcess.currentSubLThread();
        final SubLObject var273;
        final SubLObject var272 = var273 = module0034.f1888();
        final SubLObject var274 = module0034.$g879$.currentBinding(var271);
        try {
            module0034.$g879$.bind(var273, var271);
            SubLObject var275 = (SubLObject)NIL;
            if (NIL != var273 && NIL == module0034.f1842(var273)) {
                var275 = module0034.f1869(var273);
                final SubLObject var276 = Threads.current_process();
                if (NIL == var275) {
                    module0034.f1873(var273, var276);
                }
                else if (!var275.eql(var276)) {
                    Errors.error((SubLObject)$ic104$);
                }
            }
            try {
                return f21775(var6, var13, var20, var21, var270, module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
            }
            finally {
                final SubLObject var28_275 = Threads.$is_thread_performing_cleanupP$.currentBinding(var271);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var271);
                    if (NIL != var273 && NIL == var275) {
                        module0034.f1873(var273, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var28_275, var271);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var274, var271);
        }
    }
    
    public static SubLObject f21775(final SubLObject var6, final SubLObject var13, final SubLObject var20, final SubLObject var21, final SubLObject var270, final SubLObject var276) {
        final SubLThread var277 = SubLProcess.currentSubLThread();
        final SubLObject var278 = module0067.f4882(var276);
        SubLObject var279 = module0004.f104(var13, module0067.f4885(var276, var6, (SubLObject)NIL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var280 = (SubLObject)((NIL != var279) ? NIL : f21776(var6, var13, var20, var21, var270, module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)));
        final SubLObject var281 = module0003.f61();
        try {
            var277.throwStack.push(var281);
            final SubLObject var282 = module0003.$g4$.currentBinding(var277);
            try {
                module0003.$g4$.bind((SubLObject)T, var277);
                SubLObject var283 = (SubLObject)NIL;
                try {
                    final SubLObject var28_281 = module0003.$g5$.currentBinding(var277);
                    try {
                        module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var277)), var277);
                        var283 = module0003.f62((SubLObject)((NIL != var278) ? module0408.f28449() : NIL), var281);
                        module0084.f5762(var276, var6, var13);
                        if (NIL != $g2823$.getDynamicValue(var277)) {
                            var277.resetMultipleValues();
                            final SubLObject var284 = f21772(f21741(var6), (SubLObject)UNPROVIDED);
                            final SubLObject var285 = var277.secondMultipleValue();
                            var277.resetMultipleValues();
                            if (NIL == var279) {
                                SubLObject var286 = var284;
                                SubLObject var287 = (SubLObject)NIL;
                                var287 = var286.first();
                                while (NIL == var279 && NIL != var286) {
                                    final SubLObject var288 = (SubLObject)NIL;
                                    final SubLObject var289 = var287.equal(f21741(var6)) ? var6 : f21773(var6, var287, var288);
                                    var277.resetMultipleValues();
                                    final SubLObject var285_286 = f21777(var6, var289, var288, var280, var276, var13, var20, var21, var270);
                                    final SubLObject var287_288 = var277.secondMultipleValue();
                                    var277.resetMultipleValues();
                                    var280 = var285_286;
                                    var279 = var287_288;
                                    var286 = var286.rest();
                                    var287 = var286.first();
                                }
                            }
                            if (NIL == var279) {
                                SubLObject var286 = var285;
                                SubLObject var287 = (SubLObject)NIL;
                                var287 = var286.first();
                                while (NIL == var279 && NIL != var286) {
                                    final SubLObject var288 = (SubLObject)T;
                                    final SubLObject var289 = var287.equal(f21741(var6)) ? var6 : f21773(var6, var287, var288);
                                    var277.resetMultipleValues();
                                    final SubLObject var289_290 = f21777(var6, var289, var288, var280, var276, var13, var20, var21, var270);
                                    final SubLObject var291_292 = var277.secondMultipleValue();
                                    var277.resetMultipleValues();
                                    var280 = var289_290;
                                    var279 = var291_292;
                                    var286 = var286.rest();
                                    var287 = var286.first();
                                }
                            }
                        }
                        else if (NIL == var279) {
                            final SubLObject var290 = f21741(var6);
                            final SubLObject var291 = (SubLObject)$ic61$;
                            final SubLObject var292 = module0056.f4145(var291);
                            SubLObject var293 = (SubLObject)NIL;
                            final SubLObject var28_282 = module0139.$g1635$.currentBinding(var277);
                            try {
                                module0139.$g1635$.bind(module0139.f9007(), var277);
                                final SubLObject var294 = (SubLObject)NIL;
                                final SubLObject var28_283 = module0141.$g1714$.currentBinding(var277);
                                final SubLObject var295 = module0141.$g1715$.currentBinding(var277);
                                try {
                                    module0141.$g1714$.bind((NIL != var294) ? var294 : module0141.f9283(), var277);
                                    module0141.$g1715$.bind((SubLObject)((NIL != var294) ? $ic63$ : module0141.$g1715$.getDynamicValue(var277)), var277);
                                    if (NIL != var294 && NIL != module0136.f8864() && NIL == module0141.f9279(var294)) {
                                        final SubLObject var296 = module0136.$g1591$.getDynamicValue(var277);
                                        if (var296.eql((SubLObject)$ic64$)) {
                                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var294, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        else if (var296.eql((SubLObject)$ic67$)) {
                                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var294, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        else if (var296.eql((SubLObject)$ic69$)) {
                                            Errors.warn((SubLObject)$ic65$, var294, (SubLObject)$ic66$);
                                        }
                                        else {
                                            Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var277));
                                            Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var294, (SubLObject)$ic66$);
                                        }
                                    }
                                    final SubLObject var28_284 = module0141.$g1670$.currentBinding(var277);
                                    final SubLObject var29_296 = module0141.$g1671$.currentBinding(var277);
                                    final SubLObject var297 = module0141.$g1672$.currentBinding(var277);
                                    final SubLObject var298 = module0141.$g1674$.currentBinding(var277);
                                    final SubLObject var299 = module0137.$g1605$.currentBinding(var277);
                                    try {
                                        module0141.$g1670$.bind(module0137.f8955($ic57$), var277);
                                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic57$)), var277);
                                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic57$)), var277);
                                        module0141.$g1674$.bind((SubLObject)NIL, var277);
                                        module0137.$g1605$.bind(module0137.f8955($ic57$), var277);
                                        if (NIL != module0136.f8865() || NIL != module0244.f15795(f21741(var6), module0137.f8955((SubLObject)UNPROVIDED))) {
                                            final SubLObject var28_285 = module0141.$g1677$.currentBinding(var277);
                                            final SubLObject var29_297 = module0138.$g1619$.currentBinding(var277);
                                            final SubLObject var34_299 = module0141.$g1674$.currentBinding(var277);
                                            try {
                                                module0141.$g1677$.bind(module0141.f9210(), var277);
                                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic57$)), var277);
                                                module0141.$g1674$.bind((SubLObject)NIL, var277);
                                                module0249.f16055(var290, (SubLObject)UNPROVIDED);
                                                for (var293 = (SubLObject)ConsesLow.list(f21741(var6), module0141.f9195()); NIL != var293 && NIL == var279; var293 = module0056.f4150(var292)) {
                                                    final SubLObject var188_300 = var293.first();
                                                    final SubLObject var300 = conses_high.second(var293);
                                                    final SubLObject var301 = var188_300;
                                                    final SubLObject var28_286 = module0141.$g1674$.currentBinding(var277);
                                                    try {
                                                        module0141.$g1674$.bind(var300, var277);
                                                        final SubLObject var302 = var300;
                                                        final SubLObject var303 = var301.equal(f21741(var6)) ? var6 : f21773(var6, var301, var302);
                                                        var277.resetMultipleValues();
                                                        final SubLObject var303_304 = f21777(var6, var303, var302, var280, var276, var13, var20, var21, var270);
                                                        final SubLObject var305_306 = var277.secondMultipleValue();
                                                        var277.resetMultipleValues();
                                                        var280 = var303_304;
                                                        var279 = var305_306;
                                                        final SubLObject var304 = module0200.f12443(module0137.f8955($ic57$));
                                                        SubLObject var305;
                                                        SubLObject var306;
                                                        SubLObject var28_287;
                                                        SubLObject var29_298;
                                                        SubLObject var307;
                                                        SubLObject var308;
                                                        SubLObject var309;
                                                        SubLObject var310;
                                                        SubLObject var311;
                                                        SubLObject var312;
                                                        SubLObject var28_288;
                                                        SubLObject var59_311;
                                                        SubLObject var313;
                                                        SubLObject var314;
                                                        SubLObject var28_289;
                                                        SubLObject var315;
                                                        SubLObject var316;
                                                        SubLObject var317;
                                                        SubLObject var318;
                                                        SubLObject var319;
                                                        SubLObject var320;
                                                        SubLObject var321;
                                                        SubLObject var322;
                                                        SubLObject var307_313;
                                                        SubLObject var323;
                                                        SubLObject var28_290;
                                                        SubLObject var325;
                                                        SubLObject var324;
                                                        SubLObject var326;
                                                        SubLObject var327;
                                                        SubLObject var328;
                                                        SubLObject var329;
                                                        SubLObject var330;
                                                        SubLObject var331;
                                                        for (var305 = (SubLObject)NIL, var305 = var304; NIL == var279 && NIL != var305; var305 = var305.rest()) {
                                                            var306 = var305.first();
                                                            var28_287 = module0137.$g1605$.currentBinding(var277);
                                                            var29_298 = module0141.$g1674$.currentBinding(var277);
                                                            try {
                                                                module0137.$g1605$.bind(var306, var277);
                                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var277)) : module0141.$g1674$.getDynamicValue(var277)), var277);
                                                                var307 = module0228.f15229(var188_300);
                                                                if (NIL != module0138.f8992(var307)) {
                                                                    var308 = module0242.f15664(var307, module0137.f8955((SubLObject)UNPROVIDED));
                                                                    if (NIL != var308) {
                                                                        var309 = module0245.f15834(var308, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                                        if (NIL != var309) {
                                                                            for (var310 = module0066.f4838(module0067.f4891(var309)); NIL == var279 && NIL == module0066.f4841(var310); var310 = module0066.f4840(var310)) {
                                                                                var277.resetMultipleValues();
                                                                                var311 = module0066.f4839(var310);
                                                                                var312 = var277.secondMultipleValue();
                                                                                var277.resetMultipleValues();
                                                                                if (NIL != module0147.f9507(var311)) {
                                                                                    var28_288 = module0138.$g1623$.currentBinding(var277);
                                                                                    try {
                                                                                        module0138.$g1623$.bind(var311, var277);
                                                                                        for (var59_311 = module0066.f4838(module0067.f4891(var312)); NIL == var279 && NIL == module0066.f4841(var59_311); var59_311 = module0066.f4840(var59_311)) {
                                                                                            var277.resetMultipleValues();
                                                                                            var313 = module0066.f4839(var59_311);
                                                                                            var314 = var277.secondMultipleValue();
                                                                                            var277.resetMultipleValues();
                                                                                            if (NIL != module0141.f9289(var313)) {
                                                                                                var28_289 = module0138.$g1624$.currentBinding(var277);
                                                                                                try {
                                                                                                    module0138.$g1624$.bind(var313, var277);
                                                                                                    var315 = var314;
                                                                                                    if (NIL != module0077.f5302(var315)) {
                                                                                                        var316 = module0077.f5333(var315);
                                                                                                        for (var317 = module0032.f1741(var316), var318 = (SubLObject)NIL, var318 = module0032.f1742(var317, var316); NIL == var279 && NIL == module0032.f1744(var317, var318); var318 = module0032.f1743(var318)) {
                                                                                                            var319 = module0032.f1745(var317, var318);
                                                                                                            if (NIL != module0032.f1746(var318, var319) && NIL == module0249.f16059(var319, (SubLObject)UNPROVIDED)) {
                                                                                                                module0249.f16055(var319, (SubLObject)UNPROVIDED);
                                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var319, module0141.f9195()), var292);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (var315.isList()) {
                                                                                                        if (NIL == var279) {
                                                                                                            var320 = var315;
                                                                                                            var321 = (SubLObject)NIL;
                                                                                                            var321 = var320.first();
                                                                                                            while (NIL == var279 && NIL != var320) {
                                                                                                                if (NIL == module0249.f16059(var321, (SubLObject)UNPROVIDED)) {
                                                                                                                    module0249.f16055(var321, (SubLObject)UNPROVIDED);
                                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var321, module0141.f9195()), var292);
                                                                                                                }
                                                                                                                var320 = var320.rest();
                                                                                                                var321 = var320.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)$ic71$, var315);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0138.$g1624$.rebind(var28_289, var277);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        module0066.f4842(var59_311);
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1623$.rebind(var28_288, var277);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var310);
                                                                        }
                                                                    }
                                                                    else {
                                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (NIL != module0155.f9785(var307, (SubLObject)UNPROVIDED)) {
                                                                    var322 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var277), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var277), module0137.f8955((SubLObject)UNPROVIDED)));
                                                                    for (var307_313 = (SubLObject)NIL, var307_313 = var322; NIL == var279 && NIL != var307_313; var307_313 = var307_313.rest()) {
                                                                        var323 = var307_313.first();
                                                                        var28_290 = module0138.$g1625$.currentBinding(var277);
                                                                        try {
                                                                            module0138.$g1625$.bind(var323, var277);
                                                                            var324 = (var325 = Functions.funcall(var323, var307));
                                                                            if (NIL != module0077.f5302(var325)) {
                                                                                var326 = module0077.f5333(var325);
                                                                                for (var327 = module0032.f1741(var326), var328 = (SubLObject)NIL, var328 = module0032.f1742(var327, var326); NIL == var279 && NIL == module0032.f1744(var327, var328); var328 = module0032.f1743(var328)) {
                                                                                    var329 = module0032.f1745(var327, var328);
                                                                                    if (NIL != module0032.f1746(var328, var329) && NIL == module0249.f16059(var329, (SubLObject)UNPROVIDED)) {
                                                                                        module0249.f16055(var329, (SubLObject)UNPROVIDED);
                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var329, module0141.f9195()), var292);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var325.isList()) {
                                                                                if (NIL == var279) {
                                                                                    var330 = var325;
                                                                                    var331 = (SubLObject)NIL;
                                                                                    var331 = var330.first();
                                                                                    while (NIL == var279 && NIL != var330) {
                                                                                        if (NIL == module0249.f16059(var331, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var331, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var331, module0141.f9195()), var292);
                                                                                        }
                                                                                        var330 = var330.rest();
                                                                                        var331 = var330.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)$ic71$, var325);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1625$.rebind(var28_290, var277);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0141.$g1674$.rebind(var29_298, var277);
                                                                module0137.$g1605$.rebind(var28_287, var277);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var28_286, var277);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var34_299, var277);
                                                module0138.$g1619$.rebind(var29_297, var277);
                                                module0141.$g1677$.rebind(var28_285, var277);
                                            }
                                        }
                                        else {
                                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, f21741(var6), module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var299, var277);
                                        module0141.$g1674$.rebind(var298, var277);
                                        module0141.$g1672$.rebind(var297, var277);
                                        module0141.$g1671$.rebind(var29_296, var277);
                                        module0141.$g1670$.rebind(var28_284, var277);
                                    }
                                }
                                finally {
                                    module0141.$g1715$.rebind(var295, var277);
                                    module0141.$g1714$.rebind(var28_283, var277);
                                }
                                module0139.f9011(module0139.$g1635$.getDynamicValue(var277));
                            }
                            finally {
                                module0139.$g1635$.rebind(var28_282, var277);
                            }
                        }
                    }
                    finally {
                        module0003.$g5$.rebind(var28_281, var277);
                    }
                }
                finally {
                    final SubLObject var28_291 = Threads.$is_thread_performing_cleanupP$.currentBinding(var277);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var277);
                        module0003.f64(var283);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var28_291, var277);
                    }
                }
            }
            finally {
                module0003.$g4$.rebind(var282, var277);
            }
        }
        catch (Throwable var332) {
            var279 = Errors.handleThrowable(var332, var281);
        }
        finally {
            var277.throwStack.pop();
        }
        return var280;
    }
    
    public static SubLObject f21777(final SubLObject var6, final SubLObject var158, final SubLObject var116, SubLObject var278, final SubLObject var276, final SubLObject var13, final SubLObject var20, final SubLObject var21, final SubLObject var270) {
        final SubLObject var279 = (SubLObject)((NIL != f21727(var158)) ? f21775(var158, var13, var20, (SubLObject)NIL, var270, var276) : NIL);
        SubLObject var280;
        SubLObject var281;
        SubLObject var282;
        SubLObject var284;
        SubLObject var283;
        SubLObject var285;
        SubLObject var286;
        SubLObject var287;
        SubLObject var288;
        SubLObject var289;
        SubLObject var307_324;
        SubLObject var317_325;
        SubLObject var328_329;
        SubLObject var326_327;
        SubLObject var290;
        SubLObject var291;
        for (var280 = (SubLObject)NIL, var281 = (SubLObject)NIL, var281 = var279; NIL == var280 && NIL != var281; var281 = var281.rest()) {
            var282 = var281.first();
            var283 = (var284 = var282);
            var285 = (SubLObject)NIL;
            var286 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var284, var283, (SubLObject)$ic106$);
            var285 = var284.first();
            var284 = (var286 = var284.rest());
            if (NIL != var20 && !f21741(var158).equal(f21741(var6))) {
                var287 = f21741(var6);
                var288 = f21741(var158);
                var289 = ((NIL != var116) ? module0435.f30619(var288, var287) : module0435.f30621(var288, var287));
                var286 = (SubLObject)ConsesLow.cons(var289, var286);
            }
            if (NIL == var21 || NIL != Functions.funcall(var270, var21, var285)) {
                var278 = module0035.f2063(var278, var285, var286, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0269.f17806(f21741(var158))) {
                for (var307_324 = (SubLObject)NIL, var307_324 = f21775(var158, var285, var20, var21, var270, var276); NIL == var280 && NIL != var307_324; var307_324 = var307_324.rest()) {
                    var317_325 = var307_324.first();
                    var326_327 = (var328_329 = var317_325);
                    var290 = (SubLObject)NIL;
                    var291 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var328_329, var326_327, (SubLObject)$ic107$);
                    var290 = var328_329.first();
                    var328_329 = (var291 = var328_329.rest());
                    if (NIL != var20) {
                        var291 = (SubLObject)ConsesLow.cons(f21778(f21741(var158)), var291);
                    }
                    var278 = module0035.f2063(var278, var290, conses_high.union(var286, var291, Symbols.symbol_function((SubLObject)$ic108$), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                }
            }
        }
        if (NIL != var21 && NIL != module0035.f2013(var278)) {
            var280 = (SubLObject)T;
        }
        return Values.values(var278, var280);
    }
    
    public static SubLObject f21779(final SubLObject var321) {
        SubLObject var322 = (SubLObject)NIL;
        SubLObject var323 = (SubLObject)NIL;
        SubLObject var324 = var321;
        SubLObject var325 = (SubLObject)NIL;
        var325 = var324.first();
        while (NIL != var324) {
            if ($ic109$.eql(module0191.f11965(var325))) {
                var323 = (SubLObject)ConsesLow.cons(var325, var323);
            }
            else {
                var322 = (SubLObject)ConsesLow.cons(var325, var322);
            }
            var324 = var324.rest();
            var325 = var324.first();
        }
        return var322;
    }
    
    public static SubLObject f21780(final SubLObject var6, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        if (NIL != f21755()) {
            final SubLObject var16 = module0096.$g1262$.currentBinding(var14);
            try {
                module0096.$g1262$.bind($g2821$.getGlobalValue(), var14);
                var15 = module0079.f5416(f21738(var6), var13, (SubLObject)NIL);
            }
            finally {
                module0096.$g1262$.rebind(var16, var14);
            }
        }
        else {
            var15 = module0079.f5416(f21738(var6), var13, (SubLObject)NIL);
        }
        return var15;
    }
    
    public static SubLObject f21781(final SubLObject var6, final SubLObject var13, final SubLObject var20, final SubLObject var21, final SubLObject var270, final SubLObject var334) {
        final SubLThread var335 = SubLProcess.currentSubLThread();
        final SubLObject var336 = f21780(var6, var13);
        SubLObject var337 = (SubLObject)NIL;
        SubLObject var338 = (SubLObject)NIL;
        if (NIL != var336) {
            module0077.f5326(var13, var334);
            SubLObject var340;
            final SubLObject var339 = var340 = var336;
            SubLObject var341 = (SubLObject)NIL;
            SubLObject var342 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var340, var339, (SubLObject)$ic20$);
            var341 = var340.first();
            var340 = (var342 = var340.rest());
            SubLObject var343 = module0079.f5424(var341);
            SubLObject var346;
            for (SubLObject var344 = var338; NIL == var344; var344 = (SubLObject)makeBoolean(NIL == var346 || NIL != var338)) {
                var335.resetMultipleValues();
                final SubLObject var345 = module0052.f3693(var343);
                var346 = var335.secondMultipleValue();
                var335.resetMultipleValues();
                if (NIL != var346) {
                    SubLObject var339_340;
                    final SubLObject var337_338 = var339_340 = var345;
                    SubLObject var347 = (SubLObject)NIL;
                    SubLObject var348 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var339_340, var337_338, (SubLObject)$ic111$);
                    var347 = var339_340.first();
                    var339_340 = var339_340.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var339_340, var337_338, (SubLObject)$ic111$);
                    var348 = var339_340.first();
                    var339_340 = var339_340.rest();
                    if (NIL == var339_340) {
                        if ((NIL == var21 || NIL != Functions.funcall(var270, var347, var21)) && NIL == var338) {
                            SubLObject var349 = var348;
                            SubLObject var350 = (SubLObject)NIL;
                            var350 = var349.first();
                            while (NIL == var338 && NIL != var349) {
                                final SubLObject var351 = f21782(var350, var20, f21741(var6));
                                if (NIL != var351) {
                                    var337 = module0035.f2063(var337, var347, (SubLObject)((NIL != var20) ? var351 : NIL), (SubLObject)UNPROVIDED);
                                    if (NIL != var21) {
                                        var338 = (SubLObject)T;
                                    }
                                }
                                var349 = var349.rest();
                                var350 = var349.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var337_338, (SubLObject)$ic111$);
                    }
                }
            }
            var343 = module0079.f5424(var342);
            for (SubLObject var344 = var338; NIL == var344; var344 = (SubLObject)makeBoolean(NIL == var346 || NIL != var338)) {
                var335.resetMultipleValues();
                final SubLObject var345 = module0052.f3693(var343);
                var346 = var335.secondMultipleValue();
                var335.resetMultipleValues();
                if (NIL != var346) {
                    SubLObject var344_345;
                    final SubLObject var342_343 = var344_345 = var345;
                    SubLObject var352 = (SubLObject)NIL;
                    SubLObject var353 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var344_345, var342_343, (SubLObject)$ic112$);
                    var352 = var344_345.first();
                    var344_345 = var344_345.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var344_345, var342_343, (SubLObject)$ic112$);
                    var353 = var344_345.first();
                    var344_345 = var344_345.rest();
                    if (NIL == var344_345) {
                        if (NIL == module0077.f5320(var352, var334) && NIL == var338) {
                            SubLObject var349 = var353;
                            SubLObject var354 = (SubLObject)NIL;
                            var354 = var349.first();
                            while (NIL == var338 && NIL != var349) {
                                SubLObject var355 = f21782(var354, var20, (SubLObject)UNPROVIDED);
                                final SubLObject var356 = (SubLObject)((NIL != var355) ? f21783(var6, var354, (SubLObject)UNPROVIDED) : NIL);
                                if (NIL != var356) {
                                    if (NIL != var20) {
                                        var355 = (SubLObject)ConsesLow.cons(var356, var355);
                                    }
                                    if (NIL == var338) {
                                        SubLObject var136_351 = f21776(var6, var352, var20, var21, var270, var334);
                                        SubLObject var357 = (SubLObject)NIL;
                                        var357 = var136_351.first();
                                        while (NIL == var338 && NIL != var136_351) {
                                            SubLObject var355_356;
                                            final SubLObject var353_354 = var355_356 = var357;
                                            SubLObject var358 = (SubLObject)NIL;
                                            SubLObject var359 = (SubLObject)NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var355_356, var353_354, (SubLObject)$ic113$);
                                            var358 = var355_356.first();
                                            var355_356 = (var359 = var355_356.rest());
                                            if (NIL == var21 || NIL != Functions.funcall(var270, var358, var21)) {
                                                final SubLObject var360 = (SubLObject)((NIL != var20) ? Sequences.delete_duplicates(ConsesLow.append(var359, var355), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                                                var337 = module0035.f2063(var337, var358, var360, (SubLObject)UNPROVIDED);
                                                if (NIL != var21) {
                                                    var338 = (SubLObject)T;
                                                }
                                            }
                                            var136_351 = var136_351.rest();
                                            var357 = var136_351.first();
                                        }
                                    }
                                }
                                var349 = var349.rest();
                                var354 = var349.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var342_343, (SubLObject)$ic112$);
                    }
                }
            }
        }
        return var337;
    }
    
    public static SubLObject f21776(final SubLObject var6, final SubLObject var13, final SubLObject var20, final SubLObject var21, final SubLObject var270, final SubLObject var334) {
        final SubLThread var335 = SubLProcess.currentSubLThread();
        final SubLObject var336 = module0034.$g879$.getDynamicValue(var335);
        SubLObject var337 = (SubLObject)NIL;
        if (NIL == var336) {
            return f21781(var6, var13, var20, var21, var270, var334);
        }
        var337 = module0034.f1857(var336, (SubLObject)$ic110$, (SubLObject)UNPROVIDED);
        if (NIL == var337) {
            var337 = module0034.f1807(module0034.f1842(var336), (SubLObject)$ic110$, (SubLObject)SIX_INTEGER, (SubLObject)$ic114$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var336, (SubLObject)$ic110$, var337);
        }
        final SubLObject var338 = module0034.f1778(var6, var13, var20, var21, var270, var334);
        final SubLObject var339 = module0034.f1814(var337, var338, (SubLObject)UNPROVIDED);
        if (var339 != $ic103$) {
            SubLObject var340 = var339;
            SubLObject var341 = (SubLObject)NIL;
            var341 = var340.first();
            while (NIL != var340) {
                SubLObject var342 = var341.first();
                final SubLObject var343 = conses_high.second(var341);
                if (var6.equal(var342.first())) {
                    var342 = var342.rest();
                    if (var13.equal(var342.first())) {
                        var342 = var342.rest();
                        if (var20.equal(var342.first())) {
                            var342 = var342.rest();
                            if (var21.equal(var342.first())) {
                                var342 = var342.rest();
                                if (var270.equal(var342.first())) {
                                    var342 = var342.rest();
                                    if (NIL != var342 && NIL == var342.rest() && var334.equal(var342.first())) {
                                        return module0034.f1959(var343);
                                    }
                                }
                            }
                        }
                    }
                }
                var340 = var340.rest();
                var341 = var340.first();
            }
        }
        final SubLObject var344 = Values.arg2(var335.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21781(var6, var13, var20, var21, var270, var334)));
        module0034.f1836(var337, var338, var339, var344, (SubLObject)ConsesLow.list(var6, var13, var20, var21, var270, var334));
        return module0034.f1959(var344);
    }
    
    public static SubLObject f21784(final SubLObject var6, final SubLObject var13) {
        return module0079.f5437(f21738(var6), var13);
    }
    
    public static SubLObject f21785(final SubLObject var323) {
        final SubLThread var324 = SubLProcess.currentSubLThread();
        if (NIL != $g2825$.getDynamicValue(var324)) {
            return (SubLObject)T;
        }
        if (NIL != assertion_handles_oc.f11035(var323)) {
            return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11041(var323, (SubLObject)UNPROVIDED) && NIL != module0147.f9507(module0191.f11976(var323)));
        }
        if (NIL != module0191.f11952(var323)) {
            final SubLObject var325 = module0191.f11990(module0191.f11966(var323), module0191.f11961(var323), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var326 = module0333.f22427(var325);
            return var326;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21786(final SubLObject var323) {
        final SubLThread var324 = SubLProcess.currentSubLThread();
        final SubLObject var325 = module0034.$g879$.getDynamicValue(var324);
        SubLObject var326 = (SubLObject)NIL;
        if (NIL == var325) {
            return f21785(var323);
        }
        var326 = module0034.f1857(var325, (SubLObject)$ic115$, (SubLObject)UNPROVIDED);
        if (NIL == var326) {
            var326 = module0034.f1807(module0034.f1842(var325), (SubLObject)$ic115$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var325, (SubLObject)$ic115$, var326);
        }
        SubLObject var327 = module0034.f1814(var326, var323, (SubLObject)$ic103$);
        if (var327 == $ic103$) {
            var327 = Values.arg2(var324.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21785(var323)));
            module0034.f1816(var326, var323, var327, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var327);
    }
    
    public static SubLObject f21787(final SubLObject var323) {
        return (NIL != assertion_handles_oc.f11035(var323)) ? var323 : conses_high.second(var323);
    }
    
    public static SubLObject f21788(final SubLObject var365, final SubLObject var366) {
        if (NIL != f21789(var365)) {
            return (SubLObject)makeBoolean(NIL != f21789(var366) && NIL != f21790(var365, var366));
        }
        return Equality.eql(f21787(var365), f21787(var366));
    }
    
    public static SubLObject f21782(final SubLObject var323, final SubLObject var20, SubLObject var322) {
        if (var322 == UNPROVIDED) {
            var322 = (SubLObject)NIL;
        }
        final SubLThread var324 = SubLProcess.currentSubLThread();
        if (NIL != module0191.f11950(var323)) {
            return (SubLObject)((NIL != f21786(var323)) ? ConsesLow.list(var323) : NIL);
        }
        if (NIL != f21789(var323)) {
            return f21791(var323, var20, var322);
        }
        SubLObject var325 = (SubLObject)NIL;
        SubLObject var326 = (SubLObject)NIL;
        SubLObject var327 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var323, var323, (SubLObject)$ic116$);
        var326 = var323.first();
        SubLObject var328 = var323.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var328, var323, (SubLObject)$ic116$);
        var327 = var328.first();
        var328 = var328.rest();
        final SubLObject var329 = (SubLObject)(var328.isCons() ? var328.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var328, var323, (SubLObject)$ic116$);
        var328 = var328.rest();
        if (NIL == var328) {
            final SubLObject var330 = (NIL != var329) ? var329 : var322;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var324) && NIL == var330) {
                Errors.error((SubLObject)$ic117$, var323);
            }
            if (NIL != f21786(var327)) {
                final SubLObject var331 = var326;
                if (var331.eql((SubLObject)$ic118$)) {
                    if (NIL != module0260.f17094(module0178.f11333(var327), var330, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        if (NIL != var20) {
                            var325 = (SubLObject)ConsesLow.cons(module0435.f30619(module0178.f11333(var327), var330), var325);
                        }
                        var325 = (SubLObject)ConsesLow.cons(var327, var325);
                    }
                }
                else if (var331.eql((SubLObject)$ic119$) && NIL != module0260.f17089(module0178.f11333(var327), var330, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    if (NIL != var20) {
                        var325 = (SubLObject)ConsesLow.cons(module0435.f30621(module0178.f11333(var327), var330), var325);
                    }
                    var325 = (SubLObject)ConsesLow.cons(var327, var325);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var323, (SubLObject)$ic116$);
        }
        return var325;
    }
    
    public static SubLObject f21791(final SubLObject var323, final SubLObject var20, SubLObject var322) {
        if (var322 == UNPROVIDED) {
            var322 = (SubLObject)NIL;
        }
        SubLObject var324 = (SubLObject)NIL;
        SubLObject var325 = (SubLObject)NIL;
        if (NIL == var324) {
            SubLObject var326 = var323.rest();
            SubLObject var327 = (SubLObject)NIL;
            var327 = var326.first();
            while (NIL == var324 && NIL != var326) {
                final SubLObject var328 = f21782(var327, var20, var322);
                if (NIL != var328) {
                    SubLObject var329 = var328;
                    SubLObject var330 = (SubLObject)NIL;
                    var330 = var329.first();
                    while (NIL != var329) {
                        var325 = (SubLObject)ConsesLow.cons(var330, var325);
                        var329 = var329.rest();
                        var330 = var329.first();
                    }
                }
                else {
                    var324 = (SubLObject)T;
                }
                var326 = var326.rest();
                var327 = var326.first();
            }
        }
        return (SubLObject)((NIL != var324) ? NIL : var325);
    }
    
    public static SubLObject f21792(final SubLObject var377, final SubLObject var378) {
        final SubLThread var379 = SubLProcess.currentSubLThread();
        SubLObject var381;
        final SubLObject var380 = var381 = module0205.f13180(module0178.f11328(var378), (SubLObject)UNPROVIDED);
        SubLObject var382 = (SubLObject)NIL;
        SubLObject var383 = (SubLObject)NIL;
        SubLObject var384 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var381, var380, (SubLObject)$ic120$);
        var382 = var381.first();
        var381 = var381.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var381, var380, (SubLObject)$ic120$);
        var383 = var381.first();
        var381 = var381.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var381, var380, (SubLObject)$ic120$);
        var384 = var381.first();
        var381 = var381.rest();
        if (NIL == var381) {
            var379.resetMultipleValues();
            final SubLObject var385 = f21760(var382);
            final SubLObject var386 = var379.secondMultipleValue();
            var379.resetMultipleValues();
            final SubLObject var387 = module0147.f9540(module0178.f11287(var378));
            final SubLObject var388 = module0147.$g2095$.currentBinding(var379);
            final SubLObject var389 = module0147.$g2094$.currentBinding(var379);
            final SubLObject var390 = module0147.$g2096$.currentBinding(var379);
            try {
                module0147.$g2095$.bind(module0147.f9545(var387), var379);
                module0147.$g2094$.bind(module0147.f9546(var387), var379);
                module0147.$g2096$.bind(module0147.f9549(var387), var379);
                SubLObject var391 = var385;
                SubLObject var392 = (SubLObject)NIL;
                var392 = var391.first();
                while (NIL != var391) {
                    final SubLObject var393 = f21742(var392);
                    if (var393.eql((SubLObject)ONE_INTEGER)) {
                        f21793(var392, var384);
                    }
                    else if (var393.eql((SubLObject)TWO_INTEGER)) {
                        f21793(var392, var383);
                    }
                    var391 = var391.rest();
                    var392 = var391.first();
                }
                var391 = var386;
                var392 = (SubLObject)NIL;
                var392 = var391.first();
                while (NIL != var391) {
                    final SubLObject var393 = f21742(var392);
                    if (var393.eql((SubLObject)TWO_INTEGER)) {
                        f21793(var392, var384);
                    }
                    else if (var393.eql((SubLObject)ONE_INTEGER)) {
                        f21793(var392, var383);
                    }
                    var391 = var391.rest();
                    var392 = var391.first();
                }
            }
            finally {
                module0147.$g2096$.rebind(var390, var379);
                module0147.$g2094$.rebind(var389, var379);
                module0147.$g2095$.rebind(var388, var379);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var380, (SubLObject)$ic120$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21794(final SubLObject var377, final SubLObject var378) {
        final SubLThread var379 = SubLProcess.currentSubLThread();
        SubLObject var381;
        final SubLObject var380 = var381 = module0205.f13180(module0178.f11328(var378), (SubLObject)UNPROVIDED);
        SubLObject var382 = (SubLObject)NIL;
        SubLObject var383 = (SubLObject)NIL;
        SubLObject var384 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var381, var380, (SubLObject)$ic120$);
        var382 = var381.first();
        var381 = var381.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var381, var380, (SubLObject)$ic120$);
        var383 = var381.first();
        var381 = var381.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var381, var380, (SubLObject)$ic120$);
        var384 = var381.first();
        var381 = var381.rest();
        if (NIL == var381) {
            var379.resetMultipleValues();
            final SubLObject var385 = f21760(var382);
            final SubLObject var386 = var379.secondMultipleValue();
            var379.resetMultipleValues();
            final SubLObject var387 = module0147.f9540(module0178.f11287(var378));
            final SubLObject var388 = module0147.$g2095$.currentBinding(var379);
            final SubLObject var389 = module0147.$g2094$.currentBinding(var379);
            final SubLObject var390 = module0147.$g2096$.currentBinding(var379);
            try {
                module0147.$g2095$.bind(module0147.f9545(var387), var379);
                module0147.$g2094$.bind(module0147.f9546(var387), var379);
                module0147.$g2096$.bind(module0147.f9549(var387), var379);
                SubLObject var391 = var385;
                SubLObject var392 = (SubLObject)NIL;
                var392 = var391.first();
                while (NIL != var391) {
                    final SubLObject var393 = f21742(var392);
                    if (var393.eql((SubLObject)ONE_INTEGER)) {
                        f21795(f21738(var392), var383, var384, var378);
                    }
                    else if (var393.eql((SubLObject)TWO_INTEGER)) {
                        f21795(f21738(var392), var384, var383, var378);
                    }
                    var391 = var391.rest();
                    var392 = var391.first();
                }
            }
            finally {
                module0147.$g2096$.rebind(var390, var379);
                module0147.$g2094$.rebind(var389, var379);
                module0147.$g2095$.rebind(var388, var379);
            }
            SubLObject var394 = var386;
            SubLObject var395 = (SubLObject)NIL;
            var395 = var394.first();
            while (NIL != var394) {
                final SubLObject var396 = f21742(var395);
                if (var396.eql((SubLObject)TWO_INTEGER)) {
                    f21795(f21738(var395), var383, var384, var378);
                }
                else if (var396.eql((SubLObject)ONE_INTEGER)) {
                    f21795(f21738(var395), var384, var383, var378);
                }
                var394 = var394.rest();
                var395 = var394.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var380, (SubLObject)$ic120$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21796(final SubLObject var377, final SubLObject var378) {
        final SubLThread var379 = SubLProcess.currentSubLThread();
        SubLObject var381;
        final SubLObject var380 = var381 = module0205.f13180(module0178.f11328(var378), (SubLObject)UNPROVIDED);
        SubLObject var382 = (SubLObject)NIL;
        SubLObject var383 = (SubLObject)NIL;
        SubLObject var384 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var381, var380, (SubLObject)$ic123$);
        var382 = var381.first();
        var381 = var381.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var381, var380, (SubLObject)$ic123$);
        var383 = var381.first();
        var381 = var381.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var381, var380, (SubLObject)$ic123$);
        var384 = var381.first();
        var381 = var381.rest();
        if (NIL == var381) {
            var379.resetMultipleValues();
            final SubLObject var385 = f21761(var382);
            final SubLObject var386 = var379.secondMultipleValue();
            var379.resetMultipleValues();
            final SubLObject var387 = module0147.f9540(module0178.f11287(var378));
            final SubLObject var388 = module0147.$g2095$.currentBinding(var379);
            final SubLObject var389 = module0147.$g2094$.currentBinding(var379);
            final SubLObject var390 = module0147.$g2096$.currentBinding(var379);
            try {
                module0147.$g2095$.bind(module0147.f9545(var387), var379);
                module0147.$g2094$.bind(module0147.f9546(var387), var379);
                module0147.$g2096$.bind(module0147.f9549(var387), var379);
                SubLObject var391 = var385;
                SubLObject var392 = (SubLObject)NIL;
                var392 = var391.first();
                while (NIL != var391) {
                    SubLObject var392_393;
                    final SubLObject var390_391 = var392_393 = var392;
                    SubLObject var393 = (SubLObject)NIL;
                    SubLObject var394 = (SubLObject)NIL;
                    SubLObject var395 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var392_393, var390_391, (SubLObject)$ic124$);
                    var393 = var392_393.first();
                    var392_393 = var392_393.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var392_393, var390_391, (SubLObject)$ic124$);
                    var394 = var392_393.first();
                    var392_393 = var392_393.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var392_393, var390_391, (SubLObject)$ic124$);
                    var395 = var392_393.first();
                    var392_393 = var392_393.rest();
                    if (NIL == var392_393) {
                        final SubLObject var396 = (SubLObject)makeBoolean(!var382.eql(var395));
                        final SubLObject var397 = (NIL != var394) ? var384 : var383;
                        final SubLObject var398 = (NIL != var394) ? var383 : var384;
                        f21797(var393, var398);
                        f21798(var393, var397, var398, (SubLObject)ConsesLow.list(f21799(var378, var394, var396, var395)));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var390_391, (SubLObject)$ic124$);
                    }
                    var391 = var391.rest();
                    var392 = var391.first();
                }
                var391 = var386;
                var392 = (SubLObject)NIL;
                var392 = var391.first();
                while (NIL != var391) {
                    SubLObject var399_400;
                    final SubLObject var397_398 = var399_400 = var392;
                    SubLObject var393 = (SubLObject)NIL;
                    SubLObject var394 = (SubLObject)NIL;
                    SubLObject var395 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var399_400, var397_398, (SubLObject)$ic124$);
                    var393 = var399_400.first();
                    var399_400 = var399_400.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var399_400, var397_398, (SubLObject)$ic124$);
                    var394 = var399_400.first();
                    var399_400 = var399_400.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var399_400, var397_398, (SubLObject)$ic124$);
                    var395 = var399_400.first();
                    var399_400 = var399_400.rest();
                    if (NIL == var399_400) {
                        final SubLObject var396 = (SubLObject)makeBoolean(!var382.eql(var395));
                        final SubLObject var397 = (NIL != var394) ? var383 : var384;
                        final SubLObject var398 = (NIL != var394) ? var384 : var383;
                        f21797(var393, var398);
                        f21798(var393, var397, var398, (SubLObject)ConsesLow.list(f21799(var378, var394, var396, var395)));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var397_398, (SubLObject)$ic124$);
                    }
                    var391 = var391.rest();
                    var392 = var391.first();
                }
            }
            finally {
                module0147.$g2096$.rebind(var390, var379);
                module0147.$g2094$.rebind(var389, var379);
                module0147.$g2095$.rebind(var388, var379);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var380, (SubLObject)$ic123$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21800(final SubLObject var377, final SubLObject var378) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21801(final SubLObject var401) {
        final SubLObject var402 = module0178.f11328(var401);
        final SubLObject var403 = module0205.f13203(var402, (SubLObject)UNPROVIDED);
        final SubLObject var404 = module0205.f13205(var402, (SubLObject)UNPROVIDED);
        final SubLObject var405 = f21726(var403, var404);
        if (NIL != var405) {
            f21747(var405, (SubLObject)ConsesLow.cons(var401, f21743(var405)));
            f21802(var405, var401, f21774(var404), var404);
        }
        return var405;
    }
    
    public static SubLObject f21803(final SubLObject var403) {
        final SubLObject var404 = module0178.f11328(var403);
        final SubLObject var405 = module0205.f13203(var404, (SubLObject)UNPROVIDED);
        final SubLObject var406 = module0205.f13205(var404, (SubLObject)UNPROVIDED);
        final SubLObject var407 = f21726(var405, var406);
        if (NIL != var407) {
            f21748(var407, (SubLObject)ConsesLow.cons(var403, f21744(var407)));
            f21802(var407, var403, f21774(var406), var406);
        }
        return var407;
    }
    
    public static SubLObject f21804(final SubLObject var401) {
        SubLObject var403;
        final SubLObject var402 = var403 = module0178.f11330(var401);
        SubLObject var404 = (SubLObject)NIL;
        SubLObject var405 = (SubLObject)NIL;
        SubLObject var406 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var403, var402, (SubLObject)$ic127$);
        var404 = var403.first();
        var403 = var403.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var403, var402, (SubLObject)$ic127$);
        var405 = var403.first();
        var403 = var403.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var403, var402, (SubLObject)$ic127$);
        var406 = var403.first();
        var403 = var403.rest();
        if (NIL == var403) {
            final SubLObject var407 = f21726(var404, var406);
            if (NIL != var407) {
                f21747(var407, Sequences.remove(var401, f21743(var407), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            return var407;
        }
        cdestructuring_bind.cdestructuring_bind_error(var402, (SubLObject)$ic127$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21805(final SubLObject var403) {
        SubLObject var405;
        final SubLObject var404 = var405 = module0178.f11330(var403);
        SubLObject var406 = (SubLObject)NIL;
        SubLObject var407 = (SubLObject)NIL;
        SubLObject var408 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var405, var404, (SubLObject)$ic127$);
        var406 = var405.first();
        var405 = var405.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var405, var404, (SubLObject)$ic127$);
        var407 = var405.first();
        var405 = var405.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var405, var404, (SubLObject)$ic127$);
        var408 = var405.first();
        var405 = var405.rest();
        if (NIL == var405) {
            final SubLObject var409 = f21726(var406, var408);
            if (NIL != var409) {
                f21748(var409, Sequences.remove(var403, f21744(var409), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            return var409;
        }
        cdestructuring_bind.cdestructuring_bind_error(var404, (SubLObject)$ic127$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21802(final SubLObject var6, final SubLObject var408, final SubLObject var23, final SubLObject var409) {
        final SubLThread var410 = SubLProcess.currentSubLThread();
        final SubLObject var411 = module0079.f5424(f21738(var6));
        SubLObject var414;
        for (SubLObject var412 = (SubLObject)NIL; NIL == var412; var412 = (SubLObject)makeBoolean(NIL == var414)) {
            var410.resetMultipleValues();
            final SubLObject var413 = module0052.f3693(var411);
            var414 = var410.secondMultipleValue();
            var410.resetMultipleValues();
            if (NIL != var414) {
                SubLObject var416;
                final SubLObject var415 = var416 = var413;
                SubLObject var417 = (SubLObject)NIL;
                SubLObject var418 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var416, var415, (SubLObject)$ic128$);
                var417 = var416.first();
                var416 = var416.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var416, var415, (SubLObject)$ic128$);
                var418 = var416.first();
                var416 = var416.rest();
                if (NIL == var416) {
                    f21806(var6, var417, var408, var23, var409);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var415, (SubLObject)$ic128$);
                }
            }
        }
        return var6;
    }
    
    public static SubLObject f21735(final SubLObject var52, final SubLObject var19, SubLObject var412) {
        if (var412 == UNPROVIDED) {
            var412 = (SubLObject)NIL;
        }
        final SubLThread var413 = SubLProcess.currentSubLThread();
        assert NIL != module0226.f14807(var52) : var52;
        final SubLObject var414 = f21750((SubLObject)UNPROVIDED);
        f21745(var414, var52);
        f21746(var414, var19);
        f21749(var414, module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        final SubLObject var415 = module0147.$g2094$.currentBinding(var413);
        final SubLObject var416 = module0147.$g2095$.currentBinding(var413);
        try {
            module0147.$g2094$.bind((SubLObject)$ic12$, var413);
            module0147.$g2095$.bind($ic13$, var413);
            SubLObject var417 = $ic130$;
            if (NIL != module0158.f10010(var52, (SubLObject)ONE_INTEGER, var417)) {
                final SubLObject var418 = module0158.f10011(var52, (SubLObject)ONE_INTEGER, var417);
                SubLObject var419 = (SubLObject)NIL;
                final SubLObject var420 = (SubLObject)NIL;
                while (NIL == var419) {
                    final SubLObject var421 = module0052.f3695(var418, var420);
                    final SubLObject var422 = (SubLObject)makeBoolean(!var420.eql(var421));
                    if (NIL != var422) {
                        SubLObject var423 = (SubLObject)NIL;
                        try {
                            var423 = module0158.f10316(var421, (SubLObject)$ic15$, (SubLObject)$ic131$, (SubLObject)NIL);
                            SubLObject var41_415 = (SubLObject)NIL;
                            final SubLObject var42_416 = (SubLObject)NIL;
                            while (NIL == var41_415) {
                                final SubLObject var424 = module0052.f3695(var423, var42_416);
                                final SubLObject var44_417 = (SubLObject)makeBoolean(!var42_416.eql(var424));
                                if (NIL != var44_417) {
                                    f21747(var414, (SubLObject)ConsesLow.cons(var424, f21743(var414)));
                                }
                                var41_415 = (SubLObject)makeBoolean(NIL == var44_417);
                            }
                        }
                        finally {
                            final SubLObject var28_418 = Threads.$is_thread_performing_cleanupP$.currentBinding(var413);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var413);
                                if (NIL != var423) {
                                    module0158.f10319(var423);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var28_418, var413);
                            }
                        }
                    }
                    var419 = (SubLObject)makeBoolean(NIL == var422);
                }
            }
            var417 = $ic132$;
            if (NIL != module0158.f10010(var52, (SubLObject)ONE_INTEGER, var417)) {
                final SubLObject var418 = module0158.f10011(var52, (SubLObject)ONE_INTEGER, var417);
                SubLObject var419 = (SubLObject)NIL;
                final SubLObject var420 = (SubLObject)NIL;
                while (NIL == var419) {
                    final SubLObject var421 = module0052.f3695(var418, var420);
                    final SubLObject var422 = (SubLObject)makeBoolean(!var420.eql(var421));
                    if (NIL != var422) {
                        SubLObject var423 = (SubLObject)NIL;
                        try {
                            var423 = module0158.f10316(var421, (SubLObject)$ic15$, (SubLObject)$ic131$, (SubLObject)NIL);
                            SubLObject var41_416 = (SubLObject)NIL;
                            final SubLObject var42_417 = (SubLObject)NIL;
                            while (NIL == var41_416) {
                                final SubLObject var424 = module0052.f3695(var423, var42_417);
                                final SubLObject var44_418 = (SubLObject)makeBoolean(!var42_417.eql(var424));
                                if (NIL != var44_418) {
                                    f21748(var414, (SubLObject)ConsesLow.cons(var424, f21744(var414)));
                                }
                                var41_416 = (SubLObject)makeBoolean(NIL == var44_418);
                            }
                        }
                        finally {
                            final SubLObject var28_419 = Threads.$is_thread_performing_cleanupP$.currentBinding(var413);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var413);
                                if (NIL != var423) {
                                    module0158.f10319(var423);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var28_419, var413);
                            }
                        }
                    }
                    var419 = (SubLObject)makeBoolean(NIL == var422);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var416, var413);
            module0147.$g2094$.rebind(var415, var413);
        }
        if (NIL != var412) {
            f21807(var414);
        }
        return var414;
    }
    
    public static SubLObject f21807(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = f21741(var6);
        final SubLObject var9 = f21742(var6);
        module0084.f5771($g2822$.getGlobalValue(), var8, var6, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        module0079.f5420(f21738(var6));
        final SubLObject var10 = module0139.$g1630$.getDynamicValue(var7);
        final SubLObject var11 = module0139.$g1631$.currentBinding(var7);
        final SubLObject var12 = module0139.$g1632$.currentBinding(var7);
        final SubLObject var13 = module0139.$g1630$.currentBinding(var7);
        final SubLObject var14 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var15 = module0147.$g2095$.currentBinding(var7);
        try {
            module0139.$g1631$.bind(module0139.f9015(var10, (SubLObject)FIVE_INTEGER), var7);
            module0139.$g1632$.bind(module0139.f9016(var10), var7);
            module0139.$g1630$.bind((SubLObject)T, var7);
            module0147.$g2094$.bind((SubLObject)$ic12$, var7);
            module0147.$g2095$.bind($ic13$, var7);
            f21808(var6);
            f21809(var6);
            f21810(var6);
            f21758(var6);
            SubLObject var16 = (SubLObject)NIL;
            try {
                var7.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var28_424 = Errors.$error_handler$.currentBinding(var7);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic17$, var7);
                    try {
                        final SubLObject var17 = var8;
                        final SubLObject var18 = (SubLObject)$ic61$;
                        final SubLObject var19 = module0056.f4145(var18);
                        SubLObject var20 = (SubLObject)NIL;
                        final SubLObject var28_425 = module0139.$g1635$.currentBinding(var7);
                        try {
                            module0139.$g1635$.bind(module0139.f9007(), var7);
                            final SubLObject var21 = $ic62$;
                            final SubLObject var28_426 = module0141.$g1714$.currentBinding(var7);
                            final SubLObject var29_427 = module0141.$g1715$.currentBinding(var7);
                            try {
                                module0141.$g1714$.bind((NIL != var21) ? var21 : module0141.f9283(), var7);
                                module0141.$g1715$.bind((SubLObject)((NIL != var21) ? $ic63$ : module0141.$g1715$.getDynamicValue(var7)), var7);
                                if (NIL != var21 && NIL != module0136.f8864() && NIL == module0141.f9279(var21)) {
                                    final SubLObject var22 = module0136.$g1591$.getDynamicValue(var7);
                                    if (var22.eql((SubLObject)$ic64$)) {
                                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var21, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    else if (var22.eql((SubLObject)$ic67$)) {
                                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var21, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    else if (var22.eql((SubLObject)$ic69$)) {
                                        Errors.warn((SubLObject)$ic65$, var21, (SubLObject)$ic66$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var7));
                                        Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var21, (SubLObject)$ic66$);
                                    }
                                }
                                final SubLObject var28_427 = module0141.$g1670$.currentBinding(var7);
                                final SubLObject var29_428 = module0141.$g1671$.currentBinding(var7);
                                final SubLObject var34_430 = module0141.$g1672$.currentBinding(var7);
                                final SubLObject var35_431 = module0141.$g1674$.currentBinding(var7);
                                final SubLObject var36_432 = module0137.$g1605$.currentBinding(var7);
                                try {
                                    module0141.$g1670$.bind(module0137.f8955($ic57$), var7);
                                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic57$)), var7);
                                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic57$)), var7);
                                    module0141.$g1674$.bind((SubLObject)NIL, var7);
                                    module0137.$g1605$.bind(module0137.f8955($ic57$), var7);
                                    if (NIL != module0136.f8865() || NIL != module0244.f15795(var8, module0137.f8955((SubLObject)UNPROVIDED))) {
                                        final SubLObject var28_428 = module0141.$g1677$.currentBinding(var7);
                                        final SubLObject var29_429 = module0138.$g1619$.currentBinding(var7);
                                        final SubLObject var34_431 = module0141.$g1674$.currentBinding(var7);
                                        try {
                                            module0141.$g1677$.bind(module0141.f9210(), var7);
                                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic57$)), var7);
                                            module0141.$g1674$.bind((SubLObject)NIL, var7);
                                            module0249.f16055(var17, (SubLObject)UNPROVIDED);
                                            for (var20 = (SubLObject)ConsesLow.list(var8, module0141.f9195()); NIL != var20; var20 = module0056.f4150(var19)) {
                                                final SubLObject var188_436 = var20.first();
                                                final SubLObject var23 = conses_high.second(var20);
                                                final SubLObject var24 = var188_436;
                                                final SubLObject var28_429 = module0141.$g1674$.currentBinding(var7);
                                                try {
                                                    module0141.$g1674$.bind(var23, var7);
                                                    final SubLObject var25 = var23;
                                                    if (!var24.equal(var8)) {
                                                        final SubLObject var26 = (NIL != var25) ? f21774(var9) : var9;
                                                        f21764(var24, var26);
                                                    }
                                                    SubLObject var28;
                                                    final SubLObject var27 = var28 = module0200.f12443(module0137.f8955($ic57$));
                                                    SubLObject var29 = (SubLObject)NIL;
                                                    var29 = var28.first();
                                                    while (NIL != var28) {
                                                        final SubLObject var28_430 = module0137.$g1605$.currentBinding(var7);
                                                        final SubLObject var29_430 = module0141.$g1674$.currentBinding(var7);
                                                        try {
                                                            module0137.$g1605$.bind(var29, var7);
                                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var7)) : module0141.$g1674$.getDynamicValue(var7)), var7);
                                                            final SubLObject var30 = module0228.f15229(var188_436);
                                                            if (NIL != module0138.f8992(var30)) {
                                                                final SubLObject var31 = module0242.f15664(var30, module0137.f8955((SubLObject)UNPROVIDED));
                                                                if (NIL != var31) {
                                                                    final SubLObject var32 = module0245.f15834(var31, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                                    if (NIL != var32) {
                                                                        SubLObject var33;
                                                                        for (var33 = module0066.f4838(module0067.f4891(var32)); NIL == module0066.f4841(var33); var33 = module0066.f4840(var33)) {
                                                                            var7.resetMultipleValues();
                                                                            final SubLObject var34 = module0066.f4839(var33);
                                                                            final SubLObject var35 = var7.secondMultipleValue();
                                                                            var7.resetMultipleValues();
                                                                            if (NIL != module0147.f9507(var34)) {
                                                                                final SubLObject var28_431 = module0138.$g1623$.currentBinding(var7);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var34, var7);
                                                                                    SubLObject var59_442;
                                                                                    for (var59_442 = module0066.f4838(module0067.f4891(var35)); NIL == module0066.f4841(var59_442); var59_442 = module0066.f4840(var59_442)) {
                                                                                        var7.resetMultipleValues();
                                                                                        final SubLObject var36 = module0066.f4839(var59_442);
                                                                                        final SubLObject var37 = var7.secondMultipleValue();
                                                                                        var7.resetMultipleValues();
                                                                                        if (NIL != module0141.f9289(var36)) {
                                                                                            final SubLObject var28_432 = module0138.$g1624$.currentBinding(var7);
                                                                                            try {
                                                                                                module0138.$g1624$.bind(var36, var7);
                                                                                                final SubLObject var38 = var37;
                                                                                                if (NIL != module0077.f5302(var38)) {
                                                                                                    final SubLObject var39 = module0077.f5333(var38);
                                                                                                    SubLObject var40;
                                                                                                    SubLObject var41;
                                                                                                    SubLObject var42;
                                                                                                    for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                                                                                        var42 = module0032.f1745(var40, var41);
                                                                                                        if (NIL != module0032.f1746(var41, var42) && NIL == module0249.f16059(var42, (SubLObject)UNPROVIDED)) {
                                                                                                            module0249.f16055(var42, (SubLObject)UNPROVIDED);
                                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var42, module0141.f9195()), var19);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (var38.isList()) {
                                                                                                    SubLObject var43 = var38;
                                                                                                    SubLObject var44 = (SubLObject)NIL;
                                                                                                    var44 = var43.first();
                                                                                                    while (NIL != var43) {
                                                                                                        if (NIL == module0249.f16059(var44, (SubLObject)UNPROVIDED)) {
                                                                                                            module0249.f16055(var44, (SubLObject)UNPROVIDED);
                                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var44, module0141.f9195()), var19);
                                                                                                        }
                                                                                                        var43 = var43.rest();
                                                                                                        var44 = var43.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)$ic71$, var38);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1624$.rebind(var28_432, var7);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var59_442);
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var28_431, var7);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var33);
                                                                    }
                                                                }
                                                                else {
                                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                }
                                                            }
                                                            else if (NIL != module0155.f9785(var30, (SubLObject)UNPROVIDED)) {
                                                                SubLObject var61_444;
                                                                final SubLObject var45 = var61_444 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var7), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var7), module0137.f8955((SubLObject)UNPROVIDED)));
                                                                SubLObject var46 = (SubLObject)NIL;
                                                                var46 = var61_444.first();
                                                                while (NIL != var61_444) {
                                                                    final SubLObject var28_433 = module0138.$g1625$.currentBinding(var7);
                                                                    try {
                                                                        module0138.$g1625$.bind(var46, var7);
                                                                        final SubLObject var48;
                                                                        final SubLObject var47 = var48 = Functions.funcall(var46, var30);
                                                                        if (NIL != module0077.f5302(var48)) {
                                                                            final SubLObject var49 = module0077.f5333(var48);
                                                                            SubLObject var50;
                                                                            SubLObject var51;
                                                                            SubLObject var52;
                                                                            for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                                                                                var52 = module0032.f1745(var50, var51);
                                                                                if (NIL != module0032.f1746(var51, var52) && NIL == module0249.f16059(var52, (SubLObject)UNPROVIDED)) {
                                                                                    module0249.f16055(var52, (SubLObject)UNPROVIDED);
                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var52, module0141.f9195()), var19);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var48.isList()) {
                                                                            SubLObject var53 = var48;
                                                                            SubLObject var54 = (SubLObject)NIL;
                                                                            var54 = var53.first();
                                                                            while (NIL != var53) {
                                                                                if (NIL == module0249.f16059(var54, (SubLObject)UNPROVIDED)) {
                                                                                    module0249.f16055(var54, (SubLObject)UNPROVIDED);
                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var54, module0141.f9195()), var19);
                                                                                }
                                                                                var53 = var53.rest();
                                                                                var54 = var53.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)$ic71$, var48);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1625$.rebind(var28_433, var7);
                                                                    }
                                                                    var61_444 = var61_444.rest();
                                                                    var46 = var61_444.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var29_430, var7);
                                                            module0137.$g1605$.rebind(var28_430, var7);
                                                        }
                                                        var28 = var28.rest();
                                                        var29 = var28.first();
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var28_429, var7);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var34_431, var7);
                                            module0138.$g1619$.rebind(var29_429, var7);
                                            module0141.$g1677$.rebind(var28_428, var7);
                                        }
                                    }
                                    else {
                                        module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var8, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0137.$g1605$.rebind(var36_432, var7);
                                    module0141.$g1674$.rebind(var35_431, var7);
                                    module0141.$g1672$.rebind(var34_430, var7);
                                    module0141.$g1671$.rebind(var29_428, var7);
                                    module0141.$g1670$.rebind(var28_427, var7);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var29_427, var7);
                                module0141.$g1714$.rebind(var28_426, var7);
                            }
                            module0139.f9011(module0139.$g1635$.getDynamicValue(var7));
                        }
                        finally {
                            module0139.$g1635$.rebind(var28_425, var7);
                        }
                    }
                    catch (Throwable var55) {
                        Errors.handleThrowable(var55, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var28_424, var7);
                }
            }
            catch (Throwable var56) {
                var16 = Errors.handleThrowable(var56, module0003.$g3$.getGlobalValue());
            }
            finally {
                var7.throwStack.pop();
            }
            if (NIL != var16) {
                Errors.warn((SubLObject)$ic133$, var6, var16);
                f21763(var6, (SubLObject)UNPROVIDED);
                Errors.error(var16);
            }
        }
        finally {
            module0147.$g2095$.rebind(var15, var7);
            module0147.$g2094$.rebind(var14, var7);
            module0139.$g1630$.rebind(var13, var7);
            module0139.$g1632$.rebind(var12, var7);
            module0139.$g1631$.rebind(var11, var7);
        }
        return var6;
    }
    
    public static SubLObject f21808(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = f21741(var6);
        final SubLObject var9 = f21742(var6);
        final SubLObject var10 = f21774(var9);
        final SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = (NIL != var11) ? var9 : var10;
        final SubLObject var13 = module0217.f14247(var8, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0012.$silent_progressP$.currentBinding(var7);
        try {
            module0012.$silent_progressP$.bind(f21811(var8, var13, var12), var7);
            SubLObject var15 = (SubLObject)ZERO_INTEGER;
            if (var13.isPositive()) {
                final SubLObject var28_448 = module0012.$g75$.currentBinding(var7);
                final SubLObject var16 = module0012.$g76$.currentBinding(var7);
                final SubLObject var17 = module0012.$g77$.currentBinding(var7);
                final SubLObject var18 = module0012.$g78$.currentBinding(var7);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var7);
                    module0012.$g76$.bind((SubLObject)NIL, var7);
                    module0012.$g77$.bind((SubLObject)T, var7);
                    module0012.$g78$.bind(Time.get_universal_time(), var7);
                    module0012.f478(Sequences.cconcatenate((SubLObject)$ic134$, new SubLObject[] { module0006.f205(var13), $ic135$, module0006.f205(var8), $ic136$ }));
                    final SubLObject var19 = var8;
                    if (NIL != module0158.f10038(var19)) {
                        final SubLObject var20 = (SubLObject)NIL;
                        final SubLObject var28_449 = module0012.$g73$.currentBinding(var7);
                        final SubLObject var29_450 = module0012.$g65$.currentBinding(var7);
                        final SubLObject var34_451 = module0012.$g67$.currentBinding(var7);
                        final SubLObject var35_452 = module0012.$g68$.currentBinding(var7);
                        final SubLObject var21 = module0012.$g66$.currentBinding(var7);
                        final SubLObject var22 = module0012.$g69$.currentBinding(var7);
                        final SubLObject var23 = module0012.$g70$.currentBinding(var7);
                        final SubLObject var24 = module0012.$silent_progressP$.currentBinding(var7);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var7);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var7), var7);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var7);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var7);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var7);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var7);
                            module0012.$g70$.bind((SubLObject)T, var7);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var20) ? module0012.$silent_progressP$.getDynamicValue(var7) : T), var7);
                            module0012.f474(var20);
                            final SubLObject var25 = module0158.f10039(var19);
                            SubLObject var26 = (SubLObject)NIL;
                            final SubLObject var27 = (SubLObject)NIL;
                            while (NIL == var26) {
                                final SubLObject var28 = module0052.f3695(var25, var27);
                                final SubLObject var29 = (SubLObject)makeBoolean(!var27.eql(var28));
                                if (NIL != var29) {
                                    module0012.f476();
                                    SubLObject var30 = (SubLObject)NIL;
                                    try {
                                        var30 = module0158.f10316(var28, (SubLObject)$ic15$, (SubLObject)$ic131$, (SubLObject)NIL);
                                        SubLObject var41_453 = (SubLObject)NIL;
                                        final SubLObject var42_454 = (SubLObject)NIL;
                                        while (NIL == var41_453) {
                                            final SubLObject var31 = module0052.f3695(var30, var42_454);
                                            final SubLObject var44_455 = (SubLObject)makeBoolean(!var42_454.eql(var31));
                                            if (NIL != var44_455) {
                                                final SubLObject var32 = module0178.f11331(var31, var12);
                                                f21812(var6, var31, var32, var8, var11);
                                                var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER);
                                                module0012.note_percent_progress(var15, var13);
                                            }
                                            var41_453 = (SubLObject)makeBoolean(NIL == var44_455);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28_450 = Threads.$is_thread_performing_cleanupP$.currentBinding(var7);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var7);
                                            if (NIL != var30) {
                                                module0158.f10319(var30);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28_450, var7);
                                        }
                                    }
                                }
                                var26 = (SubLObject)makeBoolean(NIL == var29);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var24, var7);
                            module0012.$g70$.rebind(var23, var7);
                            module0012.$g69$.rebind(var22, var7);
                            module0012.$g66$.rebind(var21, var7);
                            module0012.$g68$.rebind(var35_452, var7);
                            module0012.$g67$.rebind(var34_451, var7);
                            module0012.$g65$.rebind(var29_450, var7);
                            module0012.$g73$.rebind(var28_449, var7);
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var18, var7);
                    module0012.$g77$.rebind(var17, var7);
                    module0012.$g76$.rebind(var16, var7);
                    module0012.$g75$.rebind(var28_448, var7);
                }
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var14, var7);
        }
        return var6;
    }
    
    public static SubLObject f21809(final SubLObject var6) {
        final SubLObject var7 = f21741(var6);
        final SubLObject var8 = $ic137$;
        if (NIL != module0158.f10010(var7, (SubLObject)ONE_INTEGER, var8)) {
            final SubLObject var9 = module0158.f10011(var7, (SubLObject)ONE_INTEGER, var8);
            SubLObject var10 = (SubLObject)NIL;
            final SubLObject var11 = (SubLObject)NIL;
            while (NIL == var10) {
                final SubLObject var12 = module0052.f3695(var9, var11);
                final SubLObject var13 = (SubLObject)makeBoolean(!var11.eql(var12));
                if (NIL != var13) {
                    SubLObject var14 = (SubLObject)NIL;
                    try {
                        var14 = module0158.f10316(var12, (SubLObject)$ic15$, (SubLObject)$ic131$, (SubLObject)NIL);
                        SubLObject var41_457 = (SubLObject)NIL;
                        final SubLObject var42_458 = (SubLObject)NIL;
                        while (NIL == var41_457) {
                            final SubLObject var15 = module0052.f3695(var14, var42_458);
                            final SubLObject var44_459 = (SubLObject)makeBoolean(!var42_458.eql(var15));
                            if (NIL != var44_459) {
                                f21813(var6, var15);
                            }
                            var41_457 = (SubLObject)makeBoolean(NIL == var44_459);
                        }
                    }
                    finally {
                        final SubLObject var16 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var14) {
                                module0158.f10319(var14);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var16);
                        }
                    }
                }
                var10 = (SubLObject)makeBoolean(NIL == var13);
            }
        }
        return var6;
    }
    
    public static SubLObject f21814() {
        final SubLObject var460 = $g2826$.getGlobalValue();
        if (NIL != var460) {
            module0034.f1818(var460);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21815() {
        return module0034.f1829($g2826$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21816() {
        return Numbers.integerDivide(module0173.f10962(), (SubLObject)$ic139$);
    }
    
    public static SubLObject f21817() {
        SubLObject var461 = $g2826$.getGlobalValue();
        if (NIL == var461) {
            var461 = module0034.f1934((SubLObject)$ic138$, (SubLObject)$ic140$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var462 = module0034.f1810(var461, (SubLObject)UNPROVIDED);
        if (var462 == $ic103$) {
            var462 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21816()));
            module0034.f1812(var461, var462, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var462);
    }
    
    public static SubLObject f21813(final SubLObject var6, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = f21742(var6);
        final SubLObject var51 = module0178.f11336(var48);
        final SubLObject var52 = module0178.f11335(var48);
        final SubLObject var53 = module0147.$g2094$.currentBinding(var49);
        final SubLObject var54 = module0147.$g2095$.currentBinding(var49);
        try {
            module0147.$g2094$.bind((SubLObject)$ic12$, var49);
            module0147.$g2095$.bind($ic13$, var49);
            if (NIL != module0212.f13762(var52) && module0549.f33895(var52).numLE(f21817())) {
                final SubLObject var55 = var52;
                final SubLObject var28_466 = module0137.$g1605$.currentBinding(var49);
                final SubLObject var29_467 = module0139.$g1636$.currentBinding(var49);
                try {
                    module0137.$g1605$.bind(module0137.f8955($ic141$), var49);
                    module0139.$g1636$.bind(module0139.f9007(), var49);
                    SubLObject var468_469 = var55;
                    final SubLObject var56 = (SubLObject)$ic60$;
                    final SubLObject var57 = module0056.f4145(var56);
                    final SubLObject var28_467 = module0139.$g1635$.currentBinding(var49);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var49);
                        final SubLObject var58 = (SubLObject)NIL;
                        final SubLObject var28_468 = module0141.$g1714$.currentBinding(var49);
                        final SubLObject var29_468 = module0141.$g1715$.currentBinding(var49);
                        try {
                            module0141.$g1714$.bind((NIL != var58) ? var58 : module0141.f9283(), var49);
                            module0141.$g1715$.bind((SubLObject)((NIL != var58) ? $ic63$ : module0141.$g1715$.getDynamicValue(var49)), var49);
                            if (NIL != var58 && NIL != module0136.f8864() && NIL == module0141.f9279(var58)) {
                                final SubLObject var59 = module0136.$g1591$.getDynamicValue(var49);
                                if (var59.eql((SubLObject)$ic64$)) {
                                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var58, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)$ic67$)) {
                                    module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var58, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)$ic69$)) {
                                    Errors.warn((SubLObject)$ic65$, var58, (SubLObject)$ic66$);
                                }
                                else {
                                    Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var49));
                                    Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var58, (SubLObject)$ic66$);
                                }
                            }
                            final SubLObject var28_469 = module0141.$g1670$.currentBinding(var49);
                            final SubLObject var29_469 = module0141.$g1671$.currentBinding(var49);
                            final SubLObject var60 = module0141.$g1672$.currentBinding(var49);
                            final SubLObject var61 = module0141.$g1674$.currentBinding(var49);
                            final SubLObject var62 = module0137.$g1605$.currentBinding(var49);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic141$)), var49);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic141$))), var49);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic141$))), var49);
                                module0141.$g1674$.bind((SubLObject)NIL, var49);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic141$)), var49);
                                if (NIL != module0136.f8865() || NIL != module0244.f15795(var55, module0137.f8955((SubLObject)UNPROVIDED))) {
                                    final SubLObject var28_470 = module0141.$g1677$.currentBinding(var49);
                                    final SubLObject var29_470 = module0138.$g1619$.currentBinding(var49);
                                    final SubLObject var34_479 = module0141.$g1674$.currentBinding(var49);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var49);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic141$))), var49);
                                        module0141.$g1674$.bind((SubLObject)NIL, var49);
                                        module0249.f16055(var468_469, (SubLObject)UNPROVIDED);
                                        while (NIL != var468_469) {
                                            final SubLObject var63 = var468_469;
                                            SubLObject var65;
                                            final SubLObject var64 = var65 = module0200.f12443(module0137.f8955($ic141$));
                                            SubLObject var66 = (SubLObject)NIL;
                                            var66 = var65.first();
                                            while (NIL != var65) {
                                                final SubLObject var28_471 = module0137.$g1605$.currentBinding(var49);
                                                final SubLObject var29_471 = module0141.$g1674$.currentBinding(var49);
                                                try {
                                                    module0137.$g1605$.bind(var66, var49);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var49)) : module0141.$g1674$.getDynamicValue(var49)), var49);
                                                    final SubLObject var67 = module0228.f15229(var63);
                                                    if (NIL != module0138.f8992(var67)) {
                                                        final SubLObject var68 = module0242.f15664(var67, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var68) {
                                                            final SubLObject var69 = module0245.f15834(var68, module0244.f15780(module0137.f8955($ic141$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var69) {
                                                                SubLObject var70;
                                                                for (var70 = module0066.f4838(module0067.f4891(var69)); NIL == module0066.f4841(var70); var70 = module0066.f4840(var70)) {
                                                                    var49.resetMultipleValues();
                                                                    final SubLObject var71 = module0066.f4839(var70);
                                                                    final SubLObject var72 = var49.secondMultipleValue();
                                                                    var49.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var71)) {
                                                                        final SubLObject var28_472 = module0138.$g1623$.currentBinding(var49);
                                                                        try {
                                                                            module0138.$g1623$.bind(var71, var49);
                                                                            SubLObject var59_485;
                                                                            for (var59_485 = module0066.f4838(module0067.f4891(var72)); NIL == module0066.f4841(var59_485); var59_485 = module0066.f4840(var59_485)) {
                                                                                var49.resetMultipleValues();
                                                                                final SubLObject var73 = module0066.f4839(var59_485);
                                                                                final SubLObject var74 = var49.secondMultipleValue();
                                                                                var49.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var73)) {
                                                                                    final SubLObject var28_473 = module0138.$g1624$.currentBinding(var49);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var73, var49);
                                                                                        final SubLObject var75 = var74;
                                                                                        if (NIL != module0077.f5302(var75)) {
                                                                                            final SubLObject var76 = module0077.f5333(var75);
                                                                                            SubLObject var77;
                                                                                            SubLObject var78;
                                                                                            SubLObject var79;
                                                                                            SubLObject var80;
                                                                                            SubLObject var81;
                                                                                            for (var77 = module0032.f1741(var76), var78 = (SubLObject)NIL, var78 = module0032.f1742(var77, var76); NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                                                                                                var79 = module0032.f1745(var77, var78);
                                                                                                if (NIL != module0032.f1746(var78, var79) && NIL == module0249.f16059(var79, module0139.$g1636$.getDynamicValue(var49))) {
                                                                                                    module0249.f16055(var79, module0139.$g1636$.getDynamicValue(var49));
                                                                                                    var80 = (var50.eql((SubLObject)ONE_INTEGER) ? var79 : var51);
                                                                                                    var81 = (var50.eql((SubLObject)ONE_INTEGER) ? var51 : var79);
                                                                                                    if (NIL != module0212.f13762(var80)) {
                                                                                                        f21797(var6, var80);
                                                                                                        f21818(var6, var80, var81, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var79, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var75.isList()) {
                                                                                            SubLObject var82 = var75;
                                                                                            SubLObject var83 = (SubLObject)NIL;
                                                                                            var83 = var82.first();
                                                                                            while (NIL != var82) {
                                                                                                if (NIL == module0249.f16059(var83, module0139.$g1636$.getDynamicValue(var49))) {
                                                                                                    module0249.f16055(var83, module0139.$g1636$.getDynamicValue(var49));
                                                                                                    final SubLObject var84 = var50.eql((SubLObject)ONE_INTEGER) ? var83 : var51;
                                                                                                    final SubLObject var85 = var50.eql((SubLObject)ONE_INTEGER) ? var51 : var83;
                                                                                                    if (NIL != module0212.f13762(var84)) {
                                                                                                        f21797(var6, var84);
                                                                                                        f21818(var6, var84, var85, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var83, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                                                    }
                                                                                                }
                                                                                                var82 = var82.rest();
                                                                                                var83 = var82.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic71$, var75);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var28_473, var49);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var59_485);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_472, var49);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var70);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                        if (NIL != module0200.f12419(var67, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                            SubLObject var86 = module0248.f15995(var67);
                                                            SubLObject var87 = (SubLObject)NIL;
                                                            var87 = var86.first();
                                                            while (NIL != var86) {
                                                                SubLObject var89;
                                                                final SubLObject var88 = var89 = var87;
                                                                SubLObject var90 = (SubLObject)NIL;
                                                                SubLObject var91 = (SubLObject)NIL;
                                                                SubLObject var92 = (SubLObject)NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic142$);
                                                                var90 = var89.first();
                                                                var89 = var89.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic142$);
                                                                var91 = var89.first();
                                                                var89 = var89.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic142$);
                                                                var92 = var89.first();
                                                                var89 = var89.rest();
                                                                if (NIL == var89) {
                                                                    if (NIL != module0147.f9507(var91)) {
                                                                        final SubLObject var28_474 = module0138.$g1623$.currentBinding(var49);
                                                                        try {
                                                                            module0138.$g1623$.bind(var91, var49);
                                                                            if (NIL != module0141.f9289(var92)) {
                                                                                final SubLObject var28_475 = module0138.$g1624$.currentBinding(var49);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var92, var49);
                                                                                    final SubLObject var75;
                                                                                    final SubLObject var93 = var75 = (SubLObject)ConsesLow.list(var90);
                                                                                    if (NIL != module0077.f5302(var75)) {
                                                                                        final SubLObject var76 = module0077.f5333(var75);
                                                                                        SubLObject var77;
                                                                                        SubLObject var78;
                                                                                        SubLObject var79;
                                                                                        SubLObject var80;
                                                                                        SubLObject var81;
                                                                                        for (var77 = module0032.f1741(var76), var78 = (SubLObject)NIL, var78 = module0032.f1742(var77, var76); NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                                                                                            var79 = module0032.f1745(var77, var78);
                                                                                            if (NIL != module0032.f1746(var78, var79) && NIL == module0249.f16059(var79, module0139.$g1636$.getDynamicValue(var49))) {
                                                                                                module0249.f16055(var79, module0139.$g1636$.getDynamicValue(var49));
                                                                                                var80 = (var50.eql((SubLObject)ONE_INTEGER) ? var79 : var51);
                                                                                                var81 = (var50.eql((SubLObject)ONE_INTEGER) ? var51 : var79);
                                                                                                if (NIL != module0212.f13762(var80)) {
                                                                                                    f21797(var6, var80);
                                                                                                    f21818(var6, var80, var81, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var79, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var75.isList()) {
                                                                                        SubLObject var136_497 = var75;
                                                                                        SubLObject var83 = (SubLObject)NIL;
                                                                                        var83 = var136_497.first();
                                                                                        while (NIL != var136_497) {
                                                                                            if (NIL == module0249.f16059(var83, module0139.$g1636$.getDynamicValue(var49))) {
                                                                                                module0249.f16055(var83, module0139.$g1636$.getDynamicValue(var49));
                                                                                                final SubLObject var84 = var50.eql((SubLObject)ONE_INTEGER) ? var83 : var51;
                                                                                                final SubLObject var85 = var50.eql((SubLObject)ONE_INTEGER) ? var51 : var83;
                                                                                                if (NIL != module0212.f13762(var84)) {
                                                                                                    f21797(var6, var84);
                                                                                                    f21818(var6, var84, var85, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var83, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                                                }
                                                                                            }
                                                                                            var136_497 = var136_497.rest();
                                                                                            var83 = var136_497.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic71$, var75);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var28_475, var49);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_474, var49);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic142$);
                                                                }
                                                                var86 = var86.rest();
                                                                var87 = var86.first();
                                                            }
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var67, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var61_498;
                                                        final SubLObject var94 = var61_498 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic141$)), module0141.$g1714$.getDynamicValue(var49), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic141$)), module0141.$g1714$.getDynamicValue(var49), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var95 = (SubLObject)NIL;
                                                        var95 = var61_498.first();
                                                        while (NIL != var61_498) {
                                                            final SubLObject var28_476 = module0138.$g1625$.currentBinding(var49);
                                                            try {
                                                                module0138.$g1625$.bind(var95, var49);
                                                                final SubLObject var97;
                                                                final SubLObject var96 = var97 = Functions.funcall(var95, var67);
                                                                if (NIL != module0077.f5302(var97)) {
                                                                    final SubLObject var98 = module0077.f5333(var97);
                                                                    SubLObject var99;
                                                                    SubLObject var100;
                                                                    SubLObject var101;
                                                                    SubLObject var102;
                                                                    SubLObject var103;
                                                                    for (var99 = module0032.f1741(var98), var100 = (SubLObject)NIL, var100 = module0032.f1742(var99, var98); NIL == module0032.f1744(var99, var100); var100 = module0032.f1743(var100)) {
                                                                        var101 = module0032.f1745(var99, var100);
                                                                        if (NIL != module0032.f1746(var100, var101) && NIL == module0249.f16059(var101, module0139.$g1636$.getDynamicValue(var49))) {
                                                                            module0249.f16055(var101, module0139.$g1636$.getDynamicValue(var49));
                                                                            var102 = (var50.eql((SubLObject)ONE_INTEGER) ? var101 : var51);
                                                                            var103 = (var50.eql((SubLObject)ONE_INTEGER) ? var51 : var101);
                                                                            if (NIL != module0212.f13762(var102)) {
                                                                                f21797(var6, var102);
                                                                                f21818(var6, var102, var103, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var101, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var97.isList()) {
                                                                    SubLObject var104 = var97;
                                                                    SubLObject var105 = (SubLObject)NIL;
                                                                    var105 = var104.first();
                                                                    while (NIL != var104) {
                                                                        if (NIL == module0249.f16059(var105, module0139.$g1636$.getDynamicValue(var49))) {
                                                                            module0249.f16055(var105, module0139.$g1636$.getDynamicValue(var49));
                                                                            final SubLObject var106 = var50.eql((SubLObject)ONE_INTEGER) ? var105 : var51;
                                                                            final SubLObject var107 = var50.eql((SubLObject)ONE_INTEGER) ? var51 : var105;
                                                                            if (NIL != module0212.f13762(var106)) {
                                                                                f21797(var6, var106);
                                                                                f21818(var6, var106, var107, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var105, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                            }
                                                                        }
                                                                        var104 = var104.rest();
                                                                        var105 = var104.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic71$, var97);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var28_476, var49);
                                                            }
                                                            var61_498 = var61_498.rest();
                                                            var95 = var61_498.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var29_471, var49);
                                                    module0137.$g1605$.rebind(var28_471, var49);
                                                }
                                                var65 = var65.rest();
                                                var66 = var65.first();
                                            }
                                            SubLObject var109;
                                            final SubLObject var108 = var109 = module0200.f12443(module0244.f15771(module0137.f8955($ic141$)));
                                            SubLObject var110 = (SubLObject)NIL;
                                            var110 = var109.first();
                                            while (NIL != var109) {
                                                final SubLObject var28_477 = module0137.$g1605$.currentBinding(var49);
                                                final SubLObject var29_472 = module0141.$g1674$.currentBinding(var49);
                                                try {
                                                    module0137.$g1605$.bind(var110, var49);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var49)) : module0141.$g1674$.getDynamicValue(var49)), var49);
                                                    final SubLObject var111 = module0228.f15229(var468_469);
                                                    if (NIL != module0138.f8992(var111)) {
                                                        final SubLObject var112 = module0242.f15664(var111, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var112) {
                                                            final SubLObject var113 = module0245.f15834(var112, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var113) {
                                                                SubLObject var114;
                                                                for (var114 = module0066.f4838(module0067.f4891(var113)); NIL == module0066.f4841(var114); var114 = module0066.f4840(var114)) {
                                                                    var49.resetMultipleValues();
                                                                    final SubLObject var115 = module0066.f4839(var114);
                                                                    final SubLObject var116 = var49.secondMultipleValue();
                                                                    var49.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var115)) {
                                                                        final SubLObject var28_478 = module0138.$g1623$.currentBinding(var49);
                                                                        try {
                                                                            module0138.$g1623$.bind(var115, var49);
                                                                            SubLObject var59_486;
                                                                            for (var59_486 = module0066.f4838(module0067.f4891(var116)); NIL == module0066.f4841(var59_486); var59_486 = module0066.f4840(var59_486)) {
                                                                                var49.resetMultipleValues();
                                                                                final SubLObject var117 = module0066.f4839(var59_486);
                                                                                final SubLObject var118 = var49.secondMultipleValue();
                                                                                var49.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var117)) {
                                                                                    final SubLObject var28_479 = module0138.$g1624$.currentBinding(var49);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var117, var49);
                                                                                        final SubLObject var119 = var118;
                                                                                        if (NIL != module0077.f5302(var119)) {
                                                                                            final SubLObject var120 = module0077.f5333(var119);
                                                                                            SubLObject var121;
                                                                                            SubLObject var122;
                                                                                            SubLObject var123;
                                                                                            for (var121 = module0032.f1741(var120), var122 = (SubLObject)NIL, var122 = module0032.f1742(var121, var120); NIL == module0032.f1744(var121, var122); var122 = module0032.f1743(var122)) {
                                                                                                var123 = module0032.f1745(var121, var122);
                                                                                                if (NIL != module0032.f1746(var122, var123) && NIL == module0249.f16059(var123, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var123, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var123, var57);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var119.isList()) {
                                                                                            SubLObject var124 = var119;
                                                                                            SubLObject var125 = (SubLObject)NIL;
                                                                                            var125 = var124.first();
                                                                                            while (NIL != var124) {
                                                                                                if (NIL == module0249.f16059(var125, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var125, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var125, var57);
                                                                                                }
                                                                                                var124 = var124.rest();
                                                                                                var125 = var124.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic71$, var119);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var28_479, var49);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var59_486);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_478, var49);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var114);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var111, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var61_499;
                                                        final SubLObject var126 = var61_499 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var49), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var49), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var127 = (SubLObject)NIL;
                                                        var127 = var61_499.first();
                                                        while (NIL != var61_499) {
                                                            final SubLObject var28_480 = module0138.$g1625$.currentBinding(var49);
                                                            try {
                                                                module0138.$g1625$.bind(var127, var49);
                                                                final SubLObject var129;
                                                                final SubLObject var128 = var129 = Functions.funcall(var127, var111);
                                                                if (NIL != module0077.f5302(var129)) {
                                                                    final SubLObject var130 = module0077.f5333(var129);
                                                                    SubLObject var131;
                                                                    SubLObject var132;
                                                                    SubLObject var133;
                                                                    for (var131 = module0032.f1741(var130), var132 = (SubLObject)NIL, var132 = module0032.f1742(var131, var130); NIL == module0032.f1744(var131, var132); var132 = module0032.f1743(var132)) {
                                                                        var133 = module0032.f1745(var131, var132);
                                                                        if (NIL != module0032.f1746(var132, var133) && NIL == module0249.f16059(var133, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var133, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var133, var57);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var129.isList()) {
                                                                    SubLObject var134 = var129;
                                                                    SubLObject var135 = (SubLObject)NIL;
                                                                    var135 = var134.first();
                                                                    while (NIL != var134) {
                                                                        if (NIL == module0249.f16059(var135, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var135, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var135, var57);
                                                                        }
                                                                        var134 = var134.rest();
                                                                        var135 = var134.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic71$, var129);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var28_480, var49);
                                                            }
                                                            var61_499 = var61_499.rest();
                                                            var127 = var61_499.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var29_472, var49);
                                                    module0137.$g1605$.rebind(var28_477, var49);
                                                }
                                                var109 = var109.rest();
                                                var110 = var109.first();
                                            }
                                            var468_469 = module0056.f4150(var57);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var34_479, var49);
                                        module0138.$g1619$.rebind(var29_470, var49);
                                        module0141.$g1677$.rebind(var28_470, var49);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var55, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var62, var49);
                                module0141.$g1674$.rebind(var61, var49);
                                module0141.$g1672$.rebind(var60, var49);
                                module0141.$g1671$.rebind(var29_469, var49);
                                module0141.$g1670$.rebind(var28_469, var49);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var29_468, var49);
                            module0141.$g1714$.rebind(var28_468, var49);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var49));
                    }
                    finally {
                        module0139.$g1635$.rebind(var28_467, var49);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var49));
                }
                finally {
                    module0139.$g1636$.rebind(var29_467, var49);
                    module0137.$g1605$.rebind(var28_466, var49);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var54, var49);
            module0147.$g2094$.rebind(var53, var49);
        }
        return var6;
    }
    
    public static SubLObject f21821(final SubLObject var378) {
        SubLObject var379 = f21759(module0178.f11334(var378));
        SubLObject var380 = (SubLObject)NIL;
        var380 = var379.first();
        while (NIL != var379) {
            f21822(var380, var378);
            var379 = var379.rest();
            var380 = var379.first();
        }
        return var378;
    }
    
    public static SubLObject f21823(final SubLObject var378) {
        SubLObject var379 = f21759(module0178.f11334(var378));
        SubLObject var380 = (SubLObject)NIL;
        var380 = var379.first();
        while (NIL != var379) {
            f21813(var380, var378);
            var379 = var379.rest();
            var380 = var379.first();
        }
        return var378;
    }
    
    public static SubLObject f21824(final SubLObject var378) {
        SubLObject var379 = f21759(module0178.f11334(var378));
        SubLObject var380 = (SubLObject)NIL;
        var380 = var379.first();
        while (NIL != var379) {
            f21825(var380, var378);
            var379 = var379.rest();
            var380 = var379.first();
        }
        return var378;
    }
    
    public static SubLObject f21825(final SubLObject var6, final SubLObject var378) {
        final SubLThread var379 = SubLProcess.currentSubLThread();
        final SubLObject var380 = f21742(var6);
        final SubLObject var381 = module0178.f11335(var378);
        final SubLObject var382 = module0178.f11336(var378);
        final SubLObject var383 = module0147.$g2094$.currentBinding(var379);
        final SubLObject var384 = module0147.$g2095$.currentBinding(var379);
        try {
            module0147.$g2094$.bind((SubLObject)$ic12$, var379);
            module0147.$g2095$.bind($ic13$, var379);
            final SubLObject var385 = var381;
            final SubLObject var28_508 = module0137.$g1605$.currentBinding(var379);
            final SubLObject var29_509 = module0139.$g1636$.currentBinding(var379);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic141$), var379);
                module0139.$g1636$.bind(module0139.f9007(), var379);
                SubLObject var468_510 = var385;
                final SubLObject var386 = (SubLObject)$ic60$;
                final SubLObject var387 = module0056.f4145(var386);
                final SubLObject var28_509 = module0139.$g1635$.currentBinding(var379);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var379);
                    final SubLObject var388 = (SubLObject)NIL;
                    final SubLObject var28_510 = module0141.$g1714$.currentBinding(var379);
                    final SubLObject var29_510 = module0141.$g1715$.currentBinding(var379);
                    try {
                        module0141.$g1714$.bind((NIL != var388) ? var388 : module0141.f9283(), var379);
                        module0141.$g1715$.bind((SubLObject)((NIL != var388) ? $ic63$ : module0141.$g1715$.getDynamicValue(var379)), var379);
                        if (NIL != var388 && NIL != module0136.f8864() && NIL == module0141.f9279(var388)) {
                            final SubLObject var389 = module0136.$g1591$.getDynamicValue(var379);
                            if (var389.eql((SubLObject)$ic64$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var388, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var389.eql((SubLObject)$ic67$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var388, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var389.eql((SubLObject)$ic69$)) {
                                Errors.warn((SubLObject)$ic65$, var388, (SubLObject)$ic66$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var379));
                                Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var388, (SubLObject)$ic66$);
                            }
                        }
                        final SubLObject var28_511 = module0141.$g1670$.currentBinding(var379);
                        final SubLObject var29_511 = module0141.$g1671$.currentBinding(var379);
                        final SubLObject var390 = module0141.$g1672$.currentBinding(var379);
                        final SubLObject var391 = module0141.$g1674$.currentBinding(var379);
                        final SubLObject var392 = module0137.$g1605$.currentBinding(var379);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic141$)), var379);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic141$))), var379);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic141$))), var379);
                            module0141.$g1674$.bind((SubLObject)NIL, var379);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic141$)), var379);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var385, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var28_512 = module0141.$g1677$.currentBinding(var379);
                                final SubLObject var29_512 = module0138.$g1619$.currentBinding(var379);
                                final SubLObject var34_518 = module0141.$g1674$.currentBinding(var379);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var379);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic141$))), var379);
                                    module0141.$g1674$.bind((SubLObject)NIL, var379);
                                    module0249.f16055(var468_510, (SubLObject)UNPROVIDED);
                                    while (NIL != var468_510) {
                                        final SubLObject var393 = var468_510;
                                        SubLObject var395;
                                        final SubLObject var394 = var395 = module0200.f12443(module0137.f8955($ic141$));
                                        SubLObject var396 = (SubLObject)NIL;
                                        var396 = var395.first();
                                        while (NIL != var395) {
                                            final SubLObject var28_513 = module0137.$g1605$.currentBinding(var379);
                                            final SubLObject var29_513 = module0141.$g1674$.currentBinding(var379);
                                            try {
                                                module0137.$g1605$.bind(var396, var379);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var379)) : module0141.$g1674$.getDynamicValue(var379)), var379);
                                                final SubLObject var397 = module0228.f15229(var393);
                                                if (NIL != module0138.f8992(var397)) {
                                                    final SubLObject var398 = module0242.f15664(var397, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var398) {
                                                        final SubLObject var399 = module0245.f15834(var398, module0244.f15780(module0137.f8955($ic141$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var399) {
                                                            SubLObject var400;
                                                            for (var400 = module0066.f4838(module0067.f4891(var399)); NIL == module0066.f4841(var400); var400 = module0066.f4840(var400)) {
                                                                var379.resetMultipleValues();
                                                                final SubLObject var401 = module0066.f4839(var400);
                                                                final SubLObject var402 = var379.secondMultipleValue();
                                                                var379.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var401)) {
                                                                    final SubLObject var28_514 = module0138.$g1623$.currentBinding(var379);
                                                                    try {
                                                                        module0138.$g1623$.bind(var401, var379);
                                                                        SubLObject var59_522;
                                                                        for (var59_522 = module0066.f4838(module0067.f4891(var402)); NIL == module0066.f4841(var59_522); var59_522 = module0066.f4840(var59_522)) {
                                                                            var379.resetMultipleValues();
                                                                            final SubLObject var403 = module0066.f4839(var59_522);
                                                                            final SubLObject var404 = var379.secondMultipleValue();
                                                                            var379.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var403)) {
                                                                                final SubLObject var28_515 = module0138.$g1624$.currentBinding(var379);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var403, var379);
                                                                                    final SubLObject var405 = var404;
                                                                                    if (NIL != module0077.f5302(var405)) {
                                                                                        final SubLObject var406 = module0077.f5333(var405);
                                                                                        SubLObject var407;
                                                                                        SubLObject var408;
                                                                                        SubLObject var409;
                                                                                        SubLObject var410;
                                                                                        SubLObject var411;
                                                                                        for (var407 = module0032.f1741(var406), var408 = (SubLObject)NIL, var408 = module0032.f1742(var407, var406); NIL == module0032.f1744(var407, var408); var408 = module0032.f1743(var408)) {
                                                                                            var409 = module0032.f1745(var407, var408);
                                                                                            if (NIL != module0032.f1746(var408, var409) && NIL == module0249.f16059(var409, module0139.$g1636$.getDynamicValue(var379))) {
                                                                                                module0249.f16055(var409, module0139.$g1636$.getDynamicValue(var379));
                                                                                                var410 = (var380.eql((SubLObject)ONE_INTEGER) ? var409 : var382);
                                                                                                var411 = (var380.eql((SubLObject)ONE_INTEGER) ? var382 : var409);
                                                                                                f21795(f21738(var6), var410, var411, var378);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var405.isList()) {
                                                                                        SubLObject var412 = var405;
                                                                                        SubLObject var413 = (SubLObject)NIL;
                                                                                        var413 = var412.first();
                                                                                        while (NIL != var412) {
                                                                                            if (NIL == module0249.f16059(var413, module0139.$g1636$.getDynamicValue(var379))) {
                                                                                                module0249.f16055(var413, module0139.$g1636$.getDynamicValue(var379));
                                                                                                final SubLObject var414 = var380.eql((SubLObject)ONE_INTEGER) ? var413 : var382;
                                                                                                final SubLObject var415 = var380.eql((SubLObject)ONE_INTEGER) ? var382 : var413;
                                                                                                f21795(f21738(var6), var414, var415, var378);
                                                                                            }
                                                                                            var412 = var412.rest();
                                                                                            var413 = var412.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic71$, var405);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var28_515, var379);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var59_522);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var28_514, var379);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var400);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var397, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var416 = module0248.f15995(var397);
                                                        SubLObject var417 = (SubLObject)NIL;
                                                        var417 = var416.first();
                                                        while (NIL != var416) {
                                                            SubLObject var419;
                                                            final SubLObject var418 = var419 = var417;
                                                            SubLObject var420 = (SubLObject)NIL;
                                                            SubLObject var421 = (SubLObject)NIL;
                                                            SubLObject var422 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var419, var418, (SubLObject)$ic142$);
                                                            var420 = var419.first();
                                                            var419 = var419.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var419, var418, (SubLObject)$ic142$);
                                                            var421 = var419.first();
                                                            var419 = var419.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var419, var418, (SubLObject)$ic142$);
                                                            var422 = var419.first();
                                                            var419 = var419.rest();
                                                            if (NIL == var419) {
                                                                if (NIL != module0147.f9507(var421)) {
                                                                    final SubLObject var28_516 = module0138.$g1623$.currentBinding(var379);
                                                                    try {
                                                                        module0138.$g1623$.bind(var421, var379);
                                                                        if (NIL != module0141.f9289(var422)) {
                                                                            final SubLObject var28_517 = module0138.$g1624$.currentBinding(var379);
                                                                            try {
                                                                                module0138.$g1624$.bind(var422, var379);
                                                                                final SubLObject var405;
                                                                                final SubLObject var423 = var405 = (SubLObject)ConsesLow.list(var420);
                                                                                if (NIL != module0077.f5302(var405)) {
                                                                                    final SubLObject var406 = module0077.f5333(var405);
                                                                                    SubLObject var407;
                                                                                    SubLObject var408;
                                                                                    SubLObject var409;
                                                                                    SubLObject var410;
                                                                                    SubLObject var411;
                                                                                    for (var407 = module0032.f1741(var406), var408 = (SubLObject)NIL, var408 = module0032.f1742(var407, var406); NIL == module0032.f1744(var407, var408); var408 = module0032.f1743(var408)) {
                                                                                        var409 = module0032.f1745(var407, var408);
                                                                                        if (NIL != module0032.f1746(var408, var409) && NIL == module0249.f16059(var409, module0139.$g1636$.getDynamicValue(var379))) {
                                                                                            module0249.f16055(var409, module0139.$g1636$.getDynamicValue(var379));
                                                                                            var410 = (var380.eql((SubLObject)ONE_INTEGER) ? var409 : var382);
                                                                                            var411 = (var380.eql((SubLObject)ONE_INTEGER) ? var382 : var409);
                                                                                            f21795(f21738(var6), var410, var411, var378);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var405.isList()) {
                                                                                    SubLObject var136_528 = var405;
                                                                                    SubLObject var413 = (SubLObject)NIL;
                                                                                    var413 = var136_528.first();
                                                                                    while (NIL != var136_528) {
                                                                                        if (NIL == module0249.f16059(var413, module0139.$g1636$.getDynamicValue(var379))) {
                                                                                            module0249.f16055(var413, module0139.$g1636$.getDynamicValue(var379));
                                                                                            final SubLObject var414 = var380.eql((SubLObject)ONE_INTEGER) ? var413 : var382;
                                                                                            final SubLObject var415 = var380.eql((SubLObject)ONE_INTEGER) ? var382 : var413;
                                                                                            f21795(f21738(var6), var414, var415, var378);
                                                                                        }
                                                                                        var136_528 = var136_528.rest();
                                                                                        var413 = var136_528.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic71$, var405);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var28_517, var379);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var28_516, var379);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var418, (SubLObject)$ic142$);
                                                            }
                                                            var416 = var416.rest();
                                                            var417 = var416.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var397, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var61_529;
                                                    final SubLObject var424 = var61_529 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic141$)), module0141.$g1714$.getDynamicValue(var379), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic141$)), module0141.$g1714$.getDynamicValue(var379), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var425 = (SubLObject)NIL;
                                                    var425 = var61_529.first();
                                                    while (NIL != var61_529) {
                                                        final SubLObject var28_518 = module0138.$g1625$.currentBinding(var379);
                                                        try {
                                                            module0138.$g1625$.bind(var425, var379);
                                                            final SubLObject var427;
                                                            final SubLObject var426 = var427 = Functions.funcall(var425, var397);
                                                            if (NIL != module0077.f5302(var427)) {
                                                                final SubLObject var428 = module0077.f5333(var427);
                                                                SubLObject var429;
                                                                SubLObject var430;
                                                                SubLObject var431;
                                                                SubLObject var432;
                                                                SubLObject var433;
                                                                for (var429 = module0032.f1741(var428), var430 = (SubLObject)NIL, var430 = module0032.f1742(var429, var428); NIL == module0032.f1744(var429, var430); var430 = module0032.f1743(var430)) {
                                                                    var431 = module0032.f1745(var429, var430);
                                                                    if (NIL != module0032.f1746(var430, var431) && NIL == module0249.f16059(var431, module0139.$g1636$.getDynamicValue(var379))) {
                                                                        module0249.f16055(var431, module0139.$g1636$.getDynamicValue(var379));
                                                                        var432 = (var380.eql((SubLObject)ONE_INTEGER) ? var431 : var382);
                                                                        var433 = (var380.eql((SubLObject)ONE_INTEGER) ? var382 : var431);
                                                                        f21795(f21738(var6), var432, var433, var378);
                                                                    }
                                                                }
                                                            }
                                                            else if (var427.isList()) {
                                                                SubLObject var434 = var427;
                                                                SubLObject var435 = (SubLObject)NIL;
                                                                var435 = var434.first();
                                                                while (NIL != var434) {
                                                                    if (NIL == module0249.f16059(var435, module0139.$g1636$.getDynamicValue(var379))) {
                                                                        module0249.f16055(var435, module0139.$g1636$.getDynamicValue(var379));
                                                                        final SubLObject var436 = var380.eql((SubLObject)ONE_INTEGER) ? var435 : var382;
                                                                        final SubLObject var437 = var380.eql((SubLObject)ONE_INTEGER) ? var382 : var435;
                                                                        f21795(f21738(var6), var436, var437, var378);
                                                                    }
                                                                    var434 = var434.rest();
                                                                    var435 = var434.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic71$, var427);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var28_518, var379);
                                                        }
                                                        var61_529 = var61_529.rest();
                                                        var425 = var61_529.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var29_513, var379);
                                                module0137.$g1605$.rebind(var28_513, var379);
                                            }
                                            var395 = var395.rest();
                                            var396 = var395.first();
                                        }
                                        SubLObject var439;
                                        final SubLObject var438 = var439 = module0200.f12443(module0244.f15771(module0137.f8955($ic141$)));
                                        SubLObject var440 = (SubLObject)NIL;
                                        var440 = var439.first();
                                        while (NIL != var439) {
                                            final SubLObject var28_519 = module0137.$g1605$.currentBinding(var379);
                                            final SubLObject var29_514 = module0141.$g1674$.currentBinding(var379);
                                            try {
                                                module0137.$g1605$.bind(var440, var379);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var379)) : module0141.$g1674$.getDynamicValue(var379)), var379);
                                                final SubLObject var441 = module0228.f15229(var468_510);
                                                if (NIL != module0138.f8992(var441)) {
                                                    final SubLObject var442 = module0242.f15664(var441, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var442) {
                                                        final SubLObject var443 = module0245.f15834(var442, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var443) {
                                                            SubLObject var444;
                                                            for (var444 = module0066.f4838(module0067.f4891(var443)); NIL == module0066.f4841(var444); var444 = module0066.f4840(var444)) {
                                                                var379.resetMultipleValues();
                                                                final SubLObject var445 = module0066.f4839(var444);
                                                                final SubLObject var446 = var379.secondMultipleValue();
                                                                var379.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var445)) {
                                                                    final SubLObject var28_520 = module0138.$g1623$.currentBinding(var379);
                                                                    try {
                                                                        module0138.$g1623$.bind(var445, var379);
                                                                        SubLObject var59_523;
                                                                        for (var59_523 = module0066.f4838(module0067.f4891(var446)); NIL == module0066.f4841(var59_523); var59_523 = module0066.f4840(var59_523)) {
                                                                            var379.resetMultipleValues();
                                                                            final SubLObject var447 = module0066.f4839(var59_523);
                                                                            final SubLObject var448 = var379.secondMultipleValue();
                                                                            var379.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var447)) {
                                                                                final SubLObject var28_521 = module0138.$g1624$.currentBinding(var379);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var447, var379);
                                                                                    final SubLObject var449 = var448;
                                                                                    if (NIL != module0077.f5302(var449)) {
                                                                                        final SubLObject var450 = module0077.f5333(var449);
                                                                                        SubLObject var451;
                                                                                        SubLObject var452;
                                                                                        SubLObject var453;
                                                                                        for (var451 = module0032.f1741(var450), var452 = (SubLObject)NIL, var452 = module0032.f1742(var451, var450); NIL == module0032.f1744(var451, var452); var452 = module0032.f1743(var452)) {
                                                                                            var453 = module0032.f1745(var451, var452);
                                                                                            if (NIL != module0032.f1746(var452, var453) && NIL == module0249.f16059(var453, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var453, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var453, var387);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var449.isList()) {
                                                                                        SubLObject var454 = var449;
                                                                                        SubLObject var455 = (SubLObject)NIL;
                                                                                        var455 = var454.first();
                                                                                        while (NIL != var454) {
                                                                                            if (NIL == module0249.f16059(var455, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var455, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var455, var387);
                                                                                            }
                                                                                            var454 = var454.rest();
                                                                                            var455 = var454.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic71$, var449);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var28_521, var379);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var59_523);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var28_520, var379);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var444);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var441, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var61_530;
                                                    final SubLObject var456 = var61_530 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var379), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var379), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var457 = (SubLObject)NIL;
                                                    var457 = var61_530.first();
                                                    while (NIL != var61_530) {
                                                        final SubLObject var28_522 = module0138.$g1625$.currentBinding(var379);
                                                        try {
                                                            module0138.$g1625$.bind(var457, var379);
                                                            final SubLObject var459;
                                                            final SubLObject var458 = var459 = Functions.funcall(var457, var441);
                                                            if (NIL != module0077.f5302(var459)) {
                                                                final SubLObject var460 = module0077.f5333(var459);
                                                                SubLObject var461;
                                                                SubLObject var462;
                                                                SubLObject var463;
                                                                for (var461 = module0032.f1741(var460), var462 = (SubLObject)NIL, var462 = module0032.f1742(var461, var460); NIL == module0032.f1744(var461, var462); var462 = module0032.f1743(var462)) {
                                                                    var463 = module0032.f1745(var461, var462);
                                                                    if (NIL != module0032.f1746(var462, var463) && NIL == module0249.f16059(var463, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var463, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var463, var387);
                                                                    }
                                                                }
                                                            }
                                                            else if (var459.isList()) {
                                                                SubLObject var464 = var459;
                                                                SubLObject var465 = (SubLObject)NIL;
                                                                var465 = var464.first();
                                                                while (NIL != var464) {
                                                                    if (NIL == module0249.f16059(var465, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var465, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var465, var387);
                                                                    }
                                                                    var464 = var464.rest();
                                                                    var465 = var464.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic71$, var459);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var28_522, var379);
                                                        }
                                                        var61_530 = var61_530.rest();
                                                        var457 = var61_530.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var29_514, var379);
                                                module0137.$g1605$.rebind(var28_519, var379);
                                            }
                                            var439 = var439.rest();
                                            var440 = var439.first();
                                        }
                                        var468_510 = module0056.f4150(var387);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var34_518, var379);
                                    module0138.$g1619$.rebind(var29_512, var379);
                                    module0141.$g1677$.rebind(var28_512, var379);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var385, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var392, var379);
                            module0141.$g1674$.rebind(var391, var379);
                            module0141.$g1672$.rebind(var390, var379);
                            module0141.$g1671$.rebind(var29_511, var379);
                            module0141.$g1670$.rebind(var28_511, var379);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var29_510, var379);
                        module0141.$g1714$.rebind(var28_510, var379);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var379));
                }
                finally {
                    module0139.$g1635$.rebind(var28_509, var379);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var379));
            }
            finally {
                module0139.$g1636$.rebind(var29_509, var379);
                module0137.$g1605$.rebind(var28_508, var379);
            }
        }
        finally {
            module0147.$g2095$.rebind(var384, var379);
            module0147.$g2094$.rebind(var383, var379);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21826(final SubLObject var378) {
        SubLObject var379 = f21759(module0178.f11334(var378));
        SubLObject var380 = (SubLObject)NIL;
        var380 = var379.first();
        while (NIL != var379) {
            f21827(var380, var378);
            var379 = var379.rest();
            var380 = var379.first();
        }
        return var378;
    }
    
    public static SubLObject f21827(final SubLObject var6, final SubLObject var378) {
        final SubLThread var379 = SubLProcess.currentSubLThread();
        final SubLObject var380 = f21742(var6);
        final SubLObject var381 = module0178.f11335(var378);
        final SubLObject var382 = module0178.f11336(var378);
        final SubLObject var383 = module0147.$g2094$.currentBinding(var379);
        final SubLObject var384 = module0147.$g2095$.currentBinding(var379);
        try {
            module0147.$g2094$.bind((SubLObject)$ic12$, var379);
            module0147.$g2095$.bind($ic13$, var379);
            final SubLObject var385 = var382;
            final SubLObject var28_538 = module0137.$g1605$.currentBinding(var379);
            final SubLObject var29_539 = module0139.$g1636$.currentBinding(var379);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic141$), var379);
                module0139.$g1636$.bind(module0139.f9007(), var379);
                SubLObject var468_540 = var385;
                final SubLObject var386 = (SubLObject)$ic60$;
                final SubLObject var387 = module0056.f4145(var386);
                final SubLObject var28_539 = module0139.$g1635$.currentBinding(var379);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var379);
                    final SubLObject var388 = (SubLObject)NIL;
                    final SubLObject var28_540 = module0141.$g1714$.currentBinding(var379);
                    final SubLObject var29_540 = module0141.$g1715$.currentBinding(var379);
                    try {
                        module0141.$g1714$.bind((NIL != var388) ? var388 : module0141.f9283(), var379);
                        module0141.$g1715$.bind((SubLObject)((NIL != var388) ? $ic63$ : module0141.$g1715$.getDynamicValue(var379)), var379);
                        if (NIL != var388 && NIL != module0136.f8864() && NIL == module0141.f9279(var388)) {
                            final SubLObject var389 = module0136.$g1591$.getDynamicValue(var379);
                            if (var389.eql((SubLObject)$ic64$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var388, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var389.eql((SubLObject)$ic67$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var388, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var389.eql((SubLObject)$ic69$)) {
                                Errors.warn((SubLObject)$ic65$, var388, (SubLObject)$ic66$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var379));
                                Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var388, (SubLObject)$ic66$);
                            }
                        }
                        final SubLObject var28_541 = module0141.$g1670$.currentBinding(var379);
                        final SubLObject var29_541 = module0141.$g1671$.currentBinding(var379);
                        final SubLObject var390 = module0141.$g1672$.currentBinding(var379);
                        final SubLObject var391 = module0141.$g1674$.currentBinding(var379);
                        final SubLObject var392 = module0137.$g1605$.currentBinding(var379);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic141$)), var379);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic141$))), var379);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic141$))), var379);
                            module0141.$g1674$.bind((SubLObject)NIL, var379);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic141$)), var379);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var385, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var28_542 = module0141.$g1677$.currentBinding(var379);
                                final SubLObject var29_542 = module0138.$g1619$.currentBinding(var379);
                                final SubLObject var34_548 = module0141.$g1674$.currentBinding(var379);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var379);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic141$))), var379);
                                    module0141.$g1674$.bind((SubLObject)NIL, var379);
                                    module0249.f16055(var468_540, (SubLObject)UNPROVIDED);
                                    while (NIL != var468_540) {
                                        final SubLObject var393 = var468_540;
                                        SubLObject var395;
                                        final SubLObject var394 = var395 = module0200.f12443(module0137.f8955($ic141$));
                                        SubLObject var396 = (SubLObject)NIL;
                                        var396 = var395.first();
                                        while (NIL != var395) {
                                            final SubLObject var28_543 = module0137.$g1605$.currentBinding(var379);
                                            final SubLObject var29_543 = module0141.$g1674$.currentBinding(var379);
                                            try {
                                                module0137.$g1605$.bind(var396, var379);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var379)) : module0141.$g1674$.getDynamicValue(var379)), var379);
                                                final SubLObject var397 = module0228.f15229(var393);
                                                if (NIL != module0138.f8992(var397)) {
                                                    final SubLObject var398 = module0242.f15664(var397, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var398) {
                                                        final SubLObject var399 = module0245.f15834(var398, module0244.f15780(module0137.f8955($ic141$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var399) {
                                                            SubLObject var400;
                                                            for (var400 = module0066.f4838(module0067.f4891(var399)); NIL == module0066.f4841(var400); var400 = module0066.f4840(var400)) {
                                                                var379.resetMultipleValues();
                                                                final SubLObject var401 = module0066.f4839(var400);
                                                                final SubLObject var402 = var379.secondMultipleValue();
                                                                var379.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var401)) {
                                                                    final SubLObject var28_544 = module0138.$g1623$.currentBinding(var379);
                                                                    try {
                                                                        module0138.$g1623$.bind(var401, var379);
                                                                        SubLObject var59_552;
                                                                        for (var59_552 = module0066.f4838(module0067.f4891(var402)); NIL == module0066.f4841(var59_552); var59_552 = module0066.f4840(var59_552)) {
                                                                            var379.resetMultipleValues();
                                                                            final SubLObject var403 = module0066.f4839(var59_552);
                                                                            final SubLObject var404 = var379.secondMultipleValue();
                                                                            var379.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var403)) {
                                                                                final SubLObject var28_545 = module0138.$g1624$.currentBinding(var379);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var403, var379);
                                                                                    final SubLObject var405 = var404;
                                                                                    if (NIL != module0077.f5302(var405)) {
                                                                                        final SubLObject var406 = module0077.f5333(var405);
                                                                                        SubLObject var407;
                                                                                        SubLObject var408;
                                                                                        SubLObject var409;
                                                                                        SubLObject var410;
                                                                                        SubLObject var411;
                                                                                        for (var407 = module0032.f1741(var406), var408 = (SubLObject)NIL, var408 = module0032.f1742(var407, var406); NIL == module0032.f1744(var407, var408); var408 = module0032.f1743(var408)) {
                                                                                            var409 = module0032.f1745(var407, var408);
                                                                                            if (NIL != module0032.f1746(var408, var409) && NIL == module0249.f16059(var409, module0139.$g1636$.getDynamicValue(var379))) {
                                                                                                module0249.f16055(var409, module0139.$g1636$.getDynamicValue(var379));
                                                                                                var410 = (var380.eql((SubLObject)ONE_INTEGER) ? var409 : var381);
                                                                                                var411 = (var380.eql((SubLObject)ONE_INTEGER) ? var381 : var409);
                                                                                                f21795(f21738(var6), var410, var411, var378);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var405.isList()) {
                                                                                        SubLObject var412 = var405;
                                                                                        SubLObject var413 = (SubLObject)NIL;
                                                                                        var413 = var412.first();
                                                                                        while (NIL != var412) {
                                                                                            if (NIL == module0249.f16059(var413, module0139.$g1636$.getDynamicValue(var379))) {
                                                                                                module0249.f16055(var413, module0139.$g1636$.getDynamicValue(var379));
                                                                                                final SubLObject var414 = var380.eql((SubLObject)ONE_INTEGER) ? var413 : var381;
                                                                                                final SubLObject var415 = var380.eql((SubLObject)ONE_INTEGER) ? var381 : var413;
                                                                                                f21795(f21738(var6), var414, var415, var378);
                                                                                            }
                                                                                            var412 = var412.rest();
                                                                                            var413 = var412.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic71$, var405);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var28_545, var379);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var59_552);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var28_544, var379);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var400);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var397, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var416 = module0248.f15995(var397);
                                                        SubLObject var417 = (SubLObject)NIL;
                                                        var417 = var416.first();
                                                        while (NIL != var416) {
                                                            SubLObject var419;
                                                            final SubLObject var418 = var419 = var417;
                                                            SubLObject var420 = (SubLObject)NIL;
                                                            SubLObject var421 = (SubLObject)NIL;
                                                            SubLObject var422 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var419, var418, (SubLObject)$ic142$);
                                                            var420 = var419.first();
                                                            var419 = var419.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var419, var418, (SubLObject)$ic142$);
                                                            var421 = var419.first();
                                                            var419 = var419.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var419, var418, (SubLObject)$ic142$);
                                                            var422 = var419.first();
                                                            var419 = var419.rest();
                                                            if (NIL == var419) {
                                                                if (NIL != module0147.f9507(var421)) {
                                                                    final SubLObject var28_546 = module0138.$g1623$.currentBinding(var379);
                                                                    try {
                                                                        module0138.$g1623$.bind(var421, var379);
                                                                        if (NIL != module0141.f9289(var422)) {
                                                                            final SubLObject var28_547 = module0138.$g1624$.currentBinding(var379);
                                                                            try {
                                                                                module0138.$g1624$.bind(var422, var379);
                                                                                final SubLObject var405;
                                                                                final SubLObject var423 = var405 = (SubLObject)ConsesLow.list(var420);
                                                                                if (NIL != module0077.f5302(var405)) {
                                                                                    final SubLObject var406 = module0077.f5333(var405);
                                                                                    SubLObject var407;
                                                                                    SubLObject var408;
                                                                                    SubLObject var409;
                                                                                    SubLObject var410;
                                                                                    SubLObject var411;
                                                                                    for (var407 = module0032.f1741(var406), var408 = (SubLObject)NIL, var408 = module0032.f1742(var407, var406); NIL == module0032.f1744(var407, var408); var408 = module0032.f1743(var408)) {
                                                                                        var409 = module0032.f1745(var407, var408);
                                                                                        if (NIL != module0032.f1746(var408, var409) && NIL == module0249.f16059(var409, module0139.$g1636$.getDynamicValue(var379))) {
                                                                                            module0249.f16055(var409, module0139.$g1636$.getDynamicValue(var379));
                                                                                            var410 = (var380.eql((SubLObject)ONE_INTEGER) ? var409 : var381);
                                                                                            var411 = (var380.eql((SubLObject)ONE_INTEGER) ? var381 : var409);
                                                                                            f21795(f21738(var6), var410, var411, var378);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var405.isList()) {
                                                                                    SubLObject var136_558 = var405;
                                                                                    SubLObject var413 = (SubLObject)NIL;
                                                                                    var413 = var136_558.first();
                                                                                    while (NIL != var136_558) {
                                                                                        if (NIL == module0249.f16059(var413, module0139.$g1636$.getDynamicValue(var379))) {
                                                                                            module0249.f16055(var413, module0139.$g1636$.getDynamicValue(var379));
                                                                                            final SubLObject var414 = var380.eql((SubLObject)ONE_INTEGER) ? var413 : var381;
                                                                                            final SubLObject var415 = var380.eql((SubLObject)ONE_INTEGER) ? var381 : var413;
                                                                                            f21795(f21738(var6), var414, var415, var378);
                                                                                        }
                                                                                        var136_558 = var136_558.rest();
                                                                                        var413 = var136_558.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic71$, var405);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var28_547, var379);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var28_546, var379);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var418, (SubLObject)$ic142$);
                                                            }
                                                            var416 = var416.rest();
                                                            var417 = var416.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var397, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var61_559;
                                                    final SubLObject var424 = var61_559 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic141$)), module0141.$g1714$.getDynamicValue(var379), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic141$)), module0141.$g1714$.getDynamicValue(var379), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var425 = (SubLObject)NIL;
                                                    var425 = var61_559.first();
                                                    while (NIL != var61_559) {
                                                        final SubLObject var28_548 = module0138.$g1625$.currentBinding(var379);
                                                        try {
                                                            module0138.$g1625$.bind(var425, var379);
                                                            final SubLObject var427;
                                                            final SubLObject var426 = var427 = Functions.funcall(var425, var397);
                                                            if (NIL != module0077.f5302(var427)) {
                                                                final SubLObject var428 = module0077.f5333(var427);
                                                                SubLObject var429;
                                                                SubLObject var430;
                                                                SubLObject var431;
                                                                SubLObject var432;
                                                                SubLObject var433;
                                                                for (var429 = module0032.f1741(var428), var430 = (SubLObject)NIL, var430 = module0032.f1742(var429, var428); NIL == module0032.f1744(var429, var430); var430 = module0032.f1743(var430)) {
                                                                    var431 = module0032.f1745(var429, var430);
                                                                    if (NIL != module0032.f1746(var430, var431) && NIL == module0249.f16059(var431, module0139.$g1636$.getDynamicValue(var379))) {
                                                                        module0249.f16055(var431, module0139.$g1636$.getDynamicValue(var379));
                                                                        var432 = (var380.eql((SubLObject)ONE_INTEGER) ? var431 : var381);
                                                                        var433 = (var380.eql((SubLObject)ONE_INTEGER) ? var381 : var431);
                                                                        f21795(f21738(var6), var432, var433, var378);
                                                                    }
                                                                }
                                                            }
                                                            else if (var427.isList()) {
                                                                SubLObject var434 = var427;
                                                                SubLObject var435 = (SubLObject)NIL;
                                                                var435 = var434.first();
                                                                while (NIL != var434) {
                                                                    if (NIL == module0249.f16059(var435, module0139.$g1636$.getDynamicValue(var379))) {
                                                                        module0249.f16055(var435, module0139.$g1636$.getDynamicValue(var379));
                                                                        final SubLObject var436 = var380.eql((SubLObject)ONE_INTEGER) ? var435 : var381;
                                                                        final SubLObject var437 = var380.eql((SubLObject)ONE_INTEGER) ? var381 : var435;
                                                                        f21795(f21738(var6), var436, var437, var378);
                                                                    }
                                                                    var434 = var434.rest();
                                                                    var435 = var434.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic71$, var427);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var28_548, var379);
                                                        }
                                                        var61_559 = var61_559.rest();
                                                        var425 = var61_559.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var29_543, var379);
                                                module0137.$g1605$.rebind(var28_543, var379);
                                            }
                                            var395 = var395.rest();
                                            var396 = var395.first();
                                        }
                                        SubLObject var439;
                                        final SubLObject var438 = var439 = module0200.f12443(module0244.f15771(module0137.f8955($ic141$)));
                                        SubLObject var440 = (SubLObject)NIL;
                                        var440 = var439.first();
                                        while (NIL != var439) {
                                            final SubLObject var28_549 = module0137.$g1605$.currentBinding(var379);
                                            final SubLObject var29_544 = module0141.$g1674$.currentBinding(var379);
                                            try {
                                                module0137.$g1605$.bind(var440, var379);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var379)) : module0141.$g1674$.getDynamicValue(var379)), var379);
                                                final SubLObject var441 = module0228.f15229(var468_540);
                                                if (NIL != module0138.f8992(var441)) {
                                                    final SubLObject var442 = module0242.f15664(var441, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var442) {
                                                        final SubLObject var443 = module0245.f15834(var442, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var443) {
                                                            SubLObject var444;
                                                            for (var444 = module0066.f4838(module0067.f4891(var443)); NIL == module0066.f4841(var444); var444 = module0066.f4840(var444)) {
                                                                var379.resetMultipleValues();
                                                                final SubLObject var445 = module0066.f4839(var444);
                                                                final SubLObject var446 = var379.secondMultipleValue();
                                                                var379.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var445)) {
                                                                    final SubLObject var28_550 = module0138.$g1623$.currentBinding(var379);
                                                                    try {
                                                                        module0138.$g1623$.bind(var445, var379);
                                                                        SubLObject var59_553;
                                                                        for (var59_553 = module0066.f4838(module0067.f4891(var446)); NIL == module0066.f4841(var59_553); var59_553 = module0066.f4840(var59_553)) {
                                                                            var379.resetMultipleValues();
                                                                            final SubLObject var447 = module0066.f4839(var59_553);
                                                                            final SubLObject var448 = var379.secondMultipleValue();
                                                                            var379.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var447)) {
                                                                                final SubLObject var28_551 = module0138.$g1624$.currentBinding(var379);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var447, var379);
                                                                                    final SubLObject var449 = var448;
                                                                                    if (NIL != module0077.f5302(var449)) {
                                                                                        final SubLObject var450 = module0077.f5333(var449);
                                                                                        SubLObject var451;
                                                                                        SubLObject var452;
                                                                                        SubLObject var453;
                                                                                        for (var451 = module0032.f1741(var450), var452 = (SubLObject)NIL, var452 = module0032.f1742(var451, var450); NIL == module0032.f1744(var451, var452); var452 = module0032.f1743(var452)) {
                                                                                            var453 = module0032.f1745(var451, var452);
                                                                                            if (NIL != module0032.f1746(var452, var453) && NIL == module0249.f16059(var453, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var453, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var453, var387);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var449.isList()) {
                                                                                        SubLObject var454 = var449;
                                                                                        SubLObject var455 = (SubLObject)NIL;
                                                                                        var455 = var454.first();
                                                                                        while (NIL != var454) {
                                                                                            if (NIL == module0249.f16059(var455, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var455, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var455, var387);
                                                                                            }
                                                                                            var454 = var454.rest();
                                                                                            var455 = var454.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic71$, var449);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var28_551, var379);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var59_553);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var28_550, var379);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var444);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var441, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var61_560;
                                                    final SubLObject var456 = var61_560 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var379), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var379), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var457 = (SubLObject)NIL;
                                                    var457 = var61_560.first();
                                                    while (NIL != var61_560) {
                                                        final SubLObject var28_552 = module0138.$g1625$.currentBinding(var379);
                                                        try {
                                                            module0138.$g1625$.bind(var457, var379);
                                                            final SubLObject var459;
                                                            final SubLObject var458 = var459 = Functions.funcall(var457, var441);
                                                            if (NIL != module0077.f5302(var459)) {
                                                                final SubLObject var460 = module0077.f5333(var459);
                                                                SubLObject var461;
                                                                SubLObject var462;
                                                                SubLObject var463;
                                                                for (var461 = module0032.f1741(var460), var462 = (SubLObject)NIL, var462 = module0032.f1742(var461, var460); NIL == module0032.f1744(var461, var462); var462 = module0032.f1743(var462)) {
                                                                    var463 = module0032.f1745(var461, var462);
                                                                    if (NIL != module0032.f1746(var462, var463) && NIL == module0249.f16059(var463, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var463, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var463, var387);
                                                                    }
                                                                }
                                                            }
                                                            else if (var459.isList()) {
                                                                SubLObject var464 = var459;
                                                                SubLObject var465 = (SubLObject)NIL;
                                                                var465 = var464.first();
                                                                while (NIL != var464) {
                                                                    if (NIL == module0249.f16059(var465, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var465, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var465, var387);
                                                                    }
                                                                    var464 = var464.rest();
                                                                    var465 = var464.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic71$, var459);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var28_552, var379);
                                                        }
                                                        var61_560 = var61_560.rest();
                                                        var457 = var61_560.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var29_544, var379);
                                                module0137.$g1605$.rebind(var28_549, var379);
                                            }
                                            var439 = var439.rest();
                                            var440 = var439.first();
                                        }
                                        var468_540 = module0056.f4150(var387);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var34_548, var379);
                                    module0138.$g1619$.rebind(var29_542, var379);
                                    module0141.$g1677$.rebind(var28_542, var379);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var385, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var392, var379);
                            module0141.$g1674$.rebind(var391, var379);
                            module0141.$g1672$.rebind(var390, var379);
                            module0141.$g1671$.rebind(var29_541, var379);
                            module0141.$g1670$.rebind(var28_541, var379);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var29_540, var379);
                        module0141.$g1714$.rebind(var28_540, var379);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var379));
                }
                finally {
                    module0139.$g1635$.rebind(var28_539, var379);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var379));
            }
            finally {
                module0139.$g1636$.rebind(var29_539, var379);
                module0137.$g1605$.rebind(var28_538, var379);
            }
        }
        finally {
            module0147.$g2095$.rebind(var384, var379);
            module0147.$g2094$.rebind(var383, var379);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21810(final SubLObject var6) {
        final SubLObject var7 = f21741(var6);
        final SubLObject var8 = $ic143$;
        if (NIL != module0158.f10010(var7, (SubLObject)ONE_INTEGER, var8)) {
            final SubLObject var9 = module0158.f10011(var7, (SubLObject)ONE_INTEGER, var8);
            SubLObject var10 = (SubLObject)NIL;
            final SubLObject var11 = (SubLObject)NIL;
            while (NIL == var10) {
                final SubLObject var12 = module0052.f3695(var9, var11);
                final SubLObject var13 = (SubLObject)makeBoolean(!var11.eql(var12));
                if (NIL != var13) {
                    SubLObject var14 = (SubLObject)NIL;
                    try {
                        var14 = module0158.f10316(var12, (SubLObject)$ic15$, (SubLObject)$ic131$, (SubLObject)NIL);
                        SubLObject var41_568 = (SubLObject)NIL;
                        final SubLObject var42_569 = (SubLObject)NIL;
                        while (NIL == var41_568) {
                            final SubLObject var15 = module0052.f3695(var14, var42_569);
                            final SubLObject var44_570 = (SubLObject)makeBoolean(!var42_569.eql(var15));
                            if (NIL != var44_570) {
                                f21822(var6, var15);
                            }
                            var41_568 = (SubLObject)makeBoolean(NIL == var44_570);
                        }
                    }
                    finally {
                        final SubLObject var16 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var14) {
                                module0158.f10319(var14);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var16);
                        }
                    }
                }
                var10 = (SubLObject)makeBoolean(NIL == var13);
            }
        }
        return var6;
    }
    
    public static SubLObject f21822(final SubLObject var6, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0178.f11335(var48);
        final SubLObject var51 = f21742(var6);
        final SubLObject var52 = module0178.f11336(var48);
        final SubLObject var53 = module0147.$g2094$.currentBinding(var49);
        final SubLObject var54 = module0147.$g2095$.currentBinding(var49);
        try {
            module0147.$g2094$.bind((SubLObject)$ic12$, var49);
            module0147.$g2095$.bind($ic13$, var49);
            if (NIL != module0212.f13762(var52) && module0549.f33895(var52).numLE(f21817())) {
                final SubLObject var55 = var52;
                final SubLObject var28_571 = module0137.$g1605$.currentBinding(var49);
                final SubLObject var29_572 = module0139.$g1636$.currentBinding(var49);
                try {
                    module0137.$g1605$.bind(module0137.f8955($ic141$), var49);
                    module0139.$g1636$.bind(module0139.f9007(), var49);
                    SubLObject var468_573 = var55;
                    final SubLObject var56 = (SubLObject)$ic60$;
                    final SubLObject var57 = module0056.f4145(var56);
                    final SubLObject var28_572 = module0139.$g1635$.currentBinding(var49);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var49);
                        final SubLObject var58 = (SubLObject)NIL;
                        final SubLObject var28_573 = module0141.$g1714$.currentBinding(var49);
                        final SubLObject var29_573 = module0141.$g1715$.currentBinding(var49);
                        try {
                            module0141.$g1714$.bind((NIL != var58) ? var58 : module0141.f9283(), var49);
                            module0141.$g1715$.bind((SubLObject)((NIL != var58) ? $ic63$ : module0141.$g1715$.getDynamicValue(var49)), var49);
                            if (NIL != var58 && NIL != module0136.f8864() && NIL == module0141.f9279(var58)) {
                                final SubLObject var59 = module0136.$g1591$.getDynamicValue(var49);
                                if (var59.eql((SubLObject)$ic64$)) {
                                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var58, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)$ic67$)) {
                                    module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var58, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)$ic69$)) {
                                    Errors.warn((SubLObject)$ic65$, var58, (SubLObject)$ic66$);
                                }
                                else {
                                    Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var49));
                                    Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var58, (SubLObject)$ic66$);
                                }
                            }
                            final SubLObject var28_574 = module0141.$g1670$.currentBinding(var49);
                            final SubLObject var29_574 = module0141.$g1671$.currentBinding(var49);
                            final SubLObject var60 = module0141.$g1672$.currentBinding(var49);
                            final SubLObject var61 = module0141.$g1674$.currentBinding(var49);
                            final SubLObject var62 = module0137.$g1605$.currentBinding(var49);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic141$)), var49);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic141$))), var49);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic141$))), var49);
                                module0141.$g1674$.bind((SubLObject)NIL, var49);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic141$)), var49);
                                if (NIL != module0136.f8865() || NIL != module0244.f15795(var55, module0137.f8955((SubLObject)UNPROVIDED))) {
                                    final SubLObject var28_575 = module0141.$g1677$.currentBinding(var49);
                                    final SubLObject var29_575 = module0138.$g1619$.currentBinding(var49);
                                    final SubLObject var34_581 = module0141.$g1674$.currentBinding(var49);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var49);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic141$))), var49);
                                        module0141.$g1674$.bind((SubLObject)NIL, var49);
                                        module0249.f16055(var468_573, (SubLObject)UNPROVIDED);
                                        while (NIL != var468_573) {
                                            final SubLObject var63 = var468_573;
                                            SubLObject var65;
                                            final SubLObject var64 = var65 = module0200.f12443(module0137.f8955($ic141$));
                                            SubLObject var66 = (SubLObject)NIL;
                                            var66 = var65.first();
                                            while (NIL != var65) {
                                                final SubLObject var28_576 = module0137.$g1605$.currentBinding(var49);
                                                final SubLObject var29_576 = module0141.$g1674$.currentBinding(var49);
                                                try {
                                                    module0137.$g1605$.bind(var66, var49);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var49)) : module0141.$g1674$.getDynamicValue(var49)), var49);
                                                    final SubLObject var67 = module0228.f15229(var63);
                                                    if (NIL != module0138.f8992(var67)) {
                                                        final SubLObject var68 = module0242.f15664(var67, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var68) {
                                                            final SubLObject var69 = module0245.f15834(var68, module0244.f15780(module0137.f8955($ic141$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var69) {
                                                                SubLObject var70;
                                                                for (var70 = module0066.f4838(module0067.f4891(var69)); NIL == module0066.f4841(var70); var70 = module0066.f4840(var70)) {
                                                                    var49.resetMultipleValues();
                                                                    final SubLObject var71 = module0066.f4839(var70);
                                                                    final SubLObject var72 = var49.secondMultipleValue();
                                                                    var49.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var71)) {
                                                                        final SubLObject var28_577 = module0138.$g1623$.currentBinding(var49);
                                                                        try {
                                                                            module0138.$g1623$.bind(var71, var49);
                                                                            SubLObject var59_585;
                                                                            for (var59_585 = module0066.f4838(module0067.f4891(var72)); NIL == module0066.f4841(var59_585); var59_585 = module0066.f4840(var59_585)) {
                                                                                var49.resetMultipleValues();
                                                                                final SubLObject var73 = module0066.f4839(var59_585);
                                                                                final SubLObject var74 = var49.secondMultipleValue();
                                                                                var49.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var73)) {
                                                                                    final SubLObject var28_578 = module0138.$g1624$.currentBinding(var49);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var73, var49);
                                                                                        final SubLObject var75 = var74;
                                                                                        if (NIL != module0077.f5302(var75)) {
                                                                                            final SubLObject var76 = module0077.f5333(var75);
                                                                                            SubLObject var77;
                                                                                            SubLObject var78;
                                                                                            SubLObject var79;
                                                                                            SubLObject var80;
                                                                                            SubLObject var81;
                                                                                            for (var77 = module0032.f1741(var76), var78 = (SubLObject)NIL, var78 = module0032.f1742(var77, var76); NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                                                                                                var79 = module0032.f1745(var77, var78);
                                                                                                if (NIL != module0032.f1746(var78, var79) && NIL == module0249.f16059(var79, module0139.$g1636$.getDynamicValue(var49))) {
                                                                                                    module0249.f16055(var79, module0139.$g1636$.getDynamicValue(var49));
                                                                                                    var80 = (var51.eql((SubLObject)ONE_INTEGER) ? var50 : var79);
                                                                                                    var81 = (var51.eql((SubLObject)ONE_INTEGER) ? var79 : var50);
                                                                                                    if (NIL != module0212.f13762(var80)) {
                                                                                                        f21797(var6, var80);
                                                                                                        f21818(var6, var80, var81, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var79, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var75.isList()) {
                                                                                            SubLObject var82 = var75;
                                                                                            SubLObject var83 = (SubLObject)NIL;
                                                                                            var83 = var82.first();
                                                                                            while (NIL != var82) {
                                                                                                if (NIL == module0249.f16059(var83, module0139.$g1636$.getDynamicValue(var49))) {
                                                                                                    module0249.f16055(var83, module0139.$g1636$.getDynamicValue(var49));
                                                                                                    final SubLObject var84 = var51.eql((SubLObject)ONE_INTEGER) ? var50 : var83;
                                                                                                    final SubLObject var85 = var51.eql((SubLObject)ONE_INTEGER) ? var83 : var50;
                                                                                                    if (NIL != module0212.f13762(var84)) {
                                                                                                        f21797(var6, var84);
                                                                                                        f21818(var6, var84, var85, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var83, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                                                    }
                                                                                                }
                                                                                                var82 = var82.rest();
                                                                                                var83 = var82.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic71$, var75);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var28_578, var49);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var59_585);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_577, var49);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var70);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                        if (NIL != module0200.f12419(var67, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                            SubLObject var86 = module0248.f15995(var67);
                                                            SubLObject var87 = (SubLObject)NIL;
                                                            var87 = var86.first();
                                                            while (NIL != var86) {
                                                                SubLObject var89;
                                                                final SubLObject var88 = var89 = var87;
                                                                SubLObject var90 = (SubLObject)NIL;
                                                                SubLObject var91 = (SubLObject)NIL;
                                                                SubLObject var92 = (SubLObject)NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic142$);
                                                                var90 = var89.first();
                                                                var89 = var89.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic142$);
                                                                var91 = var89.first();
                                                                var89 = var89.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic142$);
                                                                var92 = var89.first();
                                                                var89 = var89.rest();
                                                                if (NIL == var89) {
                                                                    if (NIL != module0147.f9507(var91)) {
                                                                        final SubLObject var28_579 = module0138.$g1623$.currentBinding(var49);
                                                                        try {
                                                                            module0138.$g1623$.bind(var91, var49);
                                                                            if (NIL != module0141.f9289(var92)) {
                                                                                final SubLObject var28_580 = module0138.$g1624$.currentBinding(var49);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var92, var49);
                                                                                    final SubLObject var75;
                                                                                    final SubLObject var93 = var75 = (SubLObject)ConsesLow.list(var90);
                                                                                    if (NIL != module0077.f5302(var75)) {
                                                                                        final SubLObject var76 = module0077.f5333(var75);
                                                                                        SubLObject var77;
                                                                                        SubLObject var78;
                                                                                        SubLObject var79;
                                                                                        SubLObject var80;
                                                                                        SubLObject var81;
                                                                                        for (var77 = module0032.f1741(var76), var78 = (SubLObject)NIL, var78 = module0032.f1742(var77, var76); NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                                                                                            var79 = module0032.f1745(var77, var78);
                                                                                            if (NIL != module0032.f1746(var78, var79) && NIL == module0249.f16059(var79, module0139.$g1636$.getDynamicValue(var49))) {
                                                                                                module0249.f16055(var79, module0139.$g1636$.getDynamicValue(var49));
                                                                                                var80 = (var51.eql((SubLObject)ONE_INTEGER) ? var50 : var79);
                                                                                                var81 = (var51.eql((SubLObject)ONE_INTEGER) ? var79 : var50);
                                                                                                if (NIL != module0212.f13762(var80)) {
                                                                                                    f21797(var6, var80);
                                                                                                    f21818(var6, var80, var81, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var79, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var75.isList()) {
                                                                                        SubLObject var136_591 = var75;
                                                                                        SubLObject var83 = (SubLObject)NIL;
                                                                                        var83 = var136_591.first();
                                                                                        while (NIL != var136_591) {
                                                                                            if (NIL == module0249.f16059(var83, module0139.$g1636$.getDynamicValue(var49))) {
                                                                                                module0249.f16055(var83, module0139.$g1636$.getDynamicValue(var49));
                                                                                                final SubLObject var84 = var51.eql((SubLObject)ONE_INTEGER) ? var50 : var83;
                                                                                                final SubLObject var85 = var51.eql((SubLObject)ONE_INTEGER) ? var83 : var50;
                                                                                                if (NIL != module0212.f13762(var84)) {
                                                                                                    f21797(var6, var84);
                                                                                                    f21818(var6, var84, var85, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var83, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                                                }
                                                                                            }
                                                                                            var136_591 = var136_591.rest();
                                                                                            var83 = var136_591.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic71$, var75);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var28_580, var49);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_579, var49);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic142$);
                                                                }
                                                                var86 = var86.rest();
                                                                var87 = var86.first();
                                                            }
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var67, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var61_592;
                                                        final SubLObject var94 = var61_592 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic141$)), module0141.$g1714$.getDynamicValue(var49), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic141$)), module0141.$g1714$.getDynamicValue(var49), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var95 = (SubLObject)NIL;
                                                        var95 = var61_592.first();
                                                        while (NIL != var61_592) {
                                                            final SubLObject var28_581 = module0138.$g1625$.currentBinding(var49);
                                                            try {
                                                                module0138.$g1625$.bind(var95, var49);
                                                                final SubLObject var97;
                                                                final SubLObject var96 = var97 = Functions.funcall(var95, var67);
                                                                if (NIL != module0077.f5302(var97)) {
                                                                    final SubLObject var98 = module0077.f5333(var97);
                                                                    SubLObject var99;
                                                                    SubLObject var100;
                                                                    SubLObject var101;
                                                                    SubLObject var102;
                                                                    SubLObject var103;
                                                                    for (var99 = module0032.f1741(var98), var100 = (SubLObject)NIL, var100 = module0032.f1742(var99, var98); NIL == module0032.f1744(var99, var100); var100 = module0032.f1743(var100)) {
                                                                        var101 = module0032.f1745(var99, var100);
                                                                        if (NIL != module0032.f1746(var100, var101) && NIL == module0249.f16059(var101, module0139.$g1636$.getDynamicValue(var49))) {
                                                                            module0249.f16055(var101, module0139.$g1636$.getDynamicValue(var49));
                                                                            var102 = (var51.eql((SubLObject)ONE_INTEGER) ? var50 : var101);
                                                                            var103 = (var51.eql((SubLObject)ONE_INTEGER) ? var101 : var50);
                                                                            if (NIL != module0212.f13762(var102)) {
                                                                                f21797(var6, var102);
                                                                                f21818(var6, var102, var103, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var101, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var97.isList()) {
                                                                    SubLObject var104 = var97;
                                                                    SubLObject var105 = (SubLObject)NIL;
                                                                    var105 = var104.first();
                                                                    while (NIL != var104) {
                                                                        if (NIL == module0249.f16059(var105, module0139.$g1636$.getDynamicValue(var49))) {
                                                                            module0249.f16055(var105, module0139.$g1636$.getDynamicValue(var49));
                                                                            final SubLObject var106 = var51.eql((SubLObject)ONE_INTEGER) ? var50 : var105;
                                                                            final SubLObject var107 = var51.eql((SubLObject)ONE_INTEGER) ? var105 : var50;
                                                                            if (NIL != module0212.f13762(var106)) {
                                                                                f21797(var6, var106);
                                                                                f21818(var6, var106, var107, (SubLObject)ConsesLow.list(f21819((SubLObject)ConsesLow.list(var48, f21820((SubLObject)ConsesLow.list($ic141$, var105, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
                                                                            }
                                                                        }
                                                                        var104 = var104.rest();
                                                                        var105 = var104.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic71$, var97);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var28_581, var49);
                                                            }
                                                            var61_592 = var61_592.rest();
                                                            var95 = var61_592.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var29_576, var49);
                                                    module0137.$g1605$.rebind(var28_576, var49);
                                                }
                                                var65 = var65.rest();
                                                var66 = var65.first();
                                            }
                                            SubLObject var109;
                                            final SubLObject var108 = var109 = module0200.f12443(module0244.f15771(module0137.f8955($ic141$)));
                                            SubLObject var110 = (SubLObject)NIL;
                                            var110 = var109.first();
                                            while (NIL != var109) {
                                                final SubLObject var28_582 = module0137.$g1605$.currentBinding(var49);
                                                final SubLObject var29_577 = module0141.$g1674$.currentBinding(var49);
                                                try {
                                                    module0137.$g1605$.bind(var110, var49);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var49)) : module0141.$g1674$.getDynamicValue(var49)), var49);
                                                    final SubLObject var111 = module0228.f15229(var468_573);
                                                    if (NIL != module0138.f8992(var111)) {
                                                        final SubLObject var112 = module0242.f15664(var111, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var112) {
                                                            final SubLObject var113 = module0245.f15834(var112, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var113) {
                                                                SubLObject var114;
                                                                for (var114 = module0066.f4838(module0067.f4891(var113)); NIL == module0066.f4841(var114); var114 = module0066.f4840(var114)) {
                                                                    var49.resetMultipleValues();
                                                                    final SubLObject var115 = module0066.f4839(var114);
                                                                    final SubLObject var116 = var49.secondMultipleValue();
                                                                    var49.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var115)) {
                                                                        final SubLObject var28_583 = module0138.$g1623$.currentBinding(var49);
                                                                        try {
                                                                            module0138.$g1623$.bind(var115, var49);
                                                                            SubLObject var59_586;
                                                                            for (var59_586 = module0066.f4838(module0067.f4891(var116)); NIL == module0066.f4841(var59_586); var59_586 = module0066.f4840(var59_586)) {
                                                                                var49.resetMultipleValues();
                                                                                final SubLObject var117 = module0066.f4839(var59_586);
                                                                                final SubLObject var118 = var49.secondMultipleValue();
                                                                                var49.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var117)) {
                                                                                    final SubLObject var28_584 = module0138.$g1624$.currentBinding(var49);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var117, var49);
                                                                                        final SubLObject var119 = var118;
                                                                                        if (NIL != module0077.f5302(var119)) {
                                                                                            final SubLObject var120 = module0077.f5333(var119);
                                                                                            SubLObject var121;
                                                                                            SubLObject var122;
                                                                                            SubLObject var123;
                                                                                            for (var121 = module0032.f1741(var120), var122 = (SubLObject)NIL, var122 = module0032.f1742(var121, var120); NIL == module0032.f1744(var121, var122); var122 = module0032.f1743(var122)) {
                                                                                                var123 = module0032.f1745(var121, var122);
                                                                                                if (NIL != module0032.f1746(var122, var123) && NIL == module0249.f16059(var123, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var123, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var123, var57);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var119.isList()) {
                                                                                            SubLObject var124 = var119;
                                                                                            SubLObject var125 = (SubLObject)NIL;
                                                                                            var125 = var124.first();
                                                                                            while (NIL != var124) {
                                                                                                if (NIL == module0249.f16059(var125, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var125, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var125, var57);
                                                                                                }
                                                                                                var124 = var124.rest();
                                                                                                var125 = var124.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic71$, var119);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var28_584, var49);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var59_586);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var28_583, var49);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var114);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var111, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var61_593;
                                                        final SubLObject var126 = var61_593 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var49), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var49), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var127 = (SubLObject)NIL;
                                                        var127 = var61_593.first();
                                                        while (NIL != var61_593) {
                                                            final SubLObject var28_585 = module0138.$g1625$.currentBinding(var49);
                                                            try {
                                                                module0138.$g1625$.bind(var127, var49);
                                                                final SubLObject var129;
                                                                final SubLObject var128 = var129 = Functions.funcall(var127, var111);
                                                                if (NIL != module0077.f5302(var129)) {
                                                                    final SubLObject var130 = module0077.f5333(var129);
                                                                    SubLObject var131;
                                                                    SubLObject var132;
                                                                    SubLObject var133;
                                                                    for (var131 = module0032.f1741(var130), var132 = (SubLObject)NIL, var132 = module0032.f1742(var131, var130); NIL == module0032.f1744(var131, var132); var132 = module0032.f1743(var132)) {
                                                                        var133 = module0032.f1745(var131, var132);
                                                                        if (NIL != module0032.f1746(var132, var133) && NIL == module0249.f16059(var133, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var133, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var133, var57);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var129.isList()) {
                                                                    SubLObject var134 = var129;
                                                                    SubLObject var135 = (SubLObject)NIL;
                                                                    var135 = var134.first();
                                                                    while (NIL != var134) {
                                                                        if (NIL == module0249.f16059(var135, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var135, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var135, var57);
                                                                        }
                                                                        var134 = var134.rest();
                                                                        var135 = var134.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic71$, var129);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var28_585, var49);
                                                            }
                                                            var61_593 = var61_593.rest();
                                                            var127 = var61_593.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var29_577, var49);
                                                    module0137.$g1605$.rebind(var28_582, var49);
                                                }
                                                var109 = var109.rest();
                                                var110 = var109.first();
                                            }
                                            var468_573 = module0056.f4150(var57);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var34_581, var49);
                                        module0138.$g1619$.rebind(var29_575, var49);
                                        module0141.$g1677$.rebind(var28_575, var49);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var55, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var62, var49);
                                module0141.$g1674$.rebind(var61, var49);
                                module0141.$g1672$.rebind(var60, var49);
                                module0141.$g1671$.rebind(var29_574, var49);
                                module0141.$g1670$.rebind(var28_574, var49);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var29_573, var49);
                            module0141.$g1714$.rebind(var28_573, var49);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var49));
                    }
                    finally {
                        module0139.$g1635$.rebind(var28_572, var49);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var49));
                }
                finally {
                    module0139.$g1636$.rebind(var29_572, var49);
                    module0137.$g1605$.rebind(var28_571, var49);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var54, var49);
            module0147.$g2094$.rebind(var53, var49);
        }
        return var6;
    }
    
    public static SubLObject f21811(final SubLObject var322, final SubLObject var601, final SubLObject var23) {
        final SubLThread var602 = SubLProcess.currentSubLThread();
        return module0012.$silent_progressP$.getDynamicValue(var602);
    }
    
    public static SubLObject f21812(final SubLObject var6, final SubLObject var48, final SubLObject var320, final SubLObject var175, final SubLObject var116) {
        final SubLObject var321 = f21741(var6);
        final SubLObject var322 = f21742(var6);
        final SubLObject var323 = f21774(var322);
        final SubLObject var324 = (NIL != var116) ? var322 : var323;
        final SubLObject var325 = f21774(var324);
        final SubLObject var326 = (SubLObject)makeBoolean(NIL == var116 && !var175.eql(var321));
        final SubLObject var327 = module0178.f11331(var48, var325);
        final SubLObject var328 = (SubLObject)ConsesLow.list(f21799(var48, var116, var326, (SubLObject)NIL));
        if (NIL != module0212.f13762(var327)) {
            f21797(var6, var327);
            f21818(var6, var327, var320, var328);
        }
        return var6;
    }
    
    public static SubLObject f21793(final SubLObject var6, final SubLObject var320) {
        final SubLThread var321 = SubLProcess.currentSubLThread();
        final SubLObject var322 = f21741(var6);
        final SubLObject var323 = f21742(var6);
        final SubLObject var324 = f21774(var323);
        final SubLObject var325 = var322;
        final SubLObject var326 = (SubLObject)$ic61$;
        final SubLObject var327 = module0056.f4145(var326);
        SubLObject var328 = (SubLObject)NIL;
        final SubLObject var329 = module0139.$g1635$.currentBinding(var321);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var321);
            final SubLObject var330 = $ic62$;
            final SubLObject var28_603 = module0141.$g1714$.currentBinding(var321);
            final SubLObject var331 = module0141.$g1715$.currentBinding(var321);
            try {
                module0141.$g1714$.bind((NIL != var330) ? var330 : module0141.f9283(), var321);
                module0141.$g1715$.bind((SubLObject)((NIL != var330) ? $ic63$ : module0141.$g1715$.getDynamicValue(var321)), var321);
                if (NIL != var330 && NIL != module0136.f8864() && NIL == module0141.f9279(var330)) {
                    final SubLObject var332 = module0136.$g1591$.getDynamicValue(var321);
                    if (var332.eql((SubLObject)$ic64$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var330, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var332.eql((SubLObject)$ic67$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var330, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var332.eql((SubLObject)$ic69$)) {
                        Errors.warn((SubLObject)$ic65$, var330, (SubLObject)$ic66$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var321));
                        Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var330, (SubLObject)$ic66$);
                    }
                }
                final SubLObject var28_604 = module0141.$g1670$.currentBinding(var321);
                final SubLObject var29_605 = module0141.$g1671$.currentBinding(var321);
                final SubLObject var333 = module0141.$g1672$.currentBinding(var321);
                final SubLObject var334 = module0141.$g1674$.currentBinding(var321);
                final SubLObject var335 = module0137.$g1605$.currentBinding(var321);
                try {
                    module0141.$g1670$.bind(module0137.f8955($ic57$), var321);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic57$)), var321);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic57$)), var321);
                    module0141.$g1674$.bind((SubLObject)NIL, var321);
                    module0137.$g1605$.bind(module0137.f8955($ic57$), var321);
                    if (NIL != module0136.f8865() || NIL != module0244.f15795(var322, module0137.f8955((SubLObject)UNPROVIDED))) {
                        final SubLObject var28_605 = module0141.$g1677$.currentBinding(var321);
                        final SubLObject var29_606 = module0138.$g1619$.currentBinding(var321);
                        final SubLObject var34_608 = module0141.$g1674$.currentBinding(var321);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var321);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic57$)), var321);
                            module0141.$g1674$.bind((SubLObject)NIL, var321);
                            module0249.f16055(var325, (SubLObject)UNPROVIDED);
                            for (var328 = (SubLObject)ConsesLow.list(var322, module0141.f9195()); NIL != var328; var328 = module0056.f4150(var327)) {
                                final SubLObject var188_609 = var328.first();
                                final SubLObject var336 = conses_high.second(var328);
                                final SubLObject var337 = var188_609;
                                final SubLObject var28_606 = module0141.$g1674$.currentBinding(var321);
                                try {
                                    module0141.$g1674$.bind(var336, var321);
                                    final SubLObject var338 = var336;
                                    final SubLObject var339 = (NIL != var338) ? var323 : var324;
                                    SubLObject var340 = module0220.f14558(var320, var337, var339, (SubLObject)$ic131$);
                                    SubLObject var341 = (SubLObject)NIL;
                                    var341 = var340.first();
                                    while (NIL != var340) {
                                        f21812(var6, var341, var320, var337, var338);
                                        var340 = var340.rest();
                                        var341 = var340.first();
                                    }
                                    SubLObject var343;
                                    final SubLObject var342 = var343 = module0200.f12443(module0137.f8955($ic57$));
                                    SubLObject var344 = (SubLObject)NIL;
                                    var344 = var343.first();
                                    while (NIL != var343) {
                                        final SubLObject var28_607 = module0137.$g1605$.currentBinding(var321);
                                        final SubLObject var29_607 = module0141.$g1674$.currentBinding(var321);
                                        try {
                                            module0137.$g1605$.bind(var344, var321);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var321)) : module0141.$g1674$.getDynamicValue(var321)), var321);
                                            final SubLObject var345 = module0228.f15229(var188_609);
                                            if (NIL != module0138.f8992(var345)) {
                                                final SubLObject var346 = module0242.f15664(var345, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var346) {
                                                    final SubLObject var347 = module0245.f15834(var346, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var347) {
                                                        SubLObject var348;
                                                        for (var348 = module0066.f4838(module0067.f4891(var347)); NIL == module0066.f4841(var348); var348 = module0066.f4840(var348)) {
                                                            var321.resetMultipleValues();
                                                            final SubLObject var349 = module0066.f4839(var348);
                                                            final SubLObject var350 = var321.secondMultipleValue();
                                                            var321.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var349)) {
                                                                final SubLObject var28_608 = module0138.$g1623$.currentBinding(var321);
                                                                try {
                                                                    module0138.$g1623$.bind(var349, var321);
                                                                    SubLObject var59_614;
                                                                    for (var59_614 = module0066.f4838(module0067.f4891(var350)); NIL == module0066.f4841(var59_614); var59_614 = module0066.f4840(var59_614)) {
                                                                        var321.resetMultipleValues();
                                                                        final SubLObject var351 = module0066.f4839(var59_614);
                                                                        final SubLObject var352 = var321.secondMultipleValue();
                                                                        var321.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var351)) {
                                                                            final SubLObject var28_609 = module0138.$g1624$.currentBinding(var321);
                                                                            try {
                                                                                module0138.$g1624$.bind(var351, var321);
                                                                                final SubLObject var353 = var352;
                                                                                if (NIL != module0077.f5302(var353)) {
                                                                                    final SubLObject var354 = module0077.f5333(var353);
                                                                                    SubLObject var355;
                                                                                    SubLObject var356;
                                                                                    SubLObject var357;
                                                                                    for (var355 = module0032.f1741(var354), var356 = (SubLObject)NIL, var356 = module0032.f1742(var355, var354); NIL == module0032.f1744(var355, var356); var356 = module0032.f1743(var356)) {
                                                                                        var357 = module0032.f1745(var355, var356);
                                                                                        if (NIL != module0032.f1746(var356, var357) && NIL == module0249.f16059(var357, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var357, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var357, module0141.f9195()), var327);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var353.isList()) {
                                                                                    SubLObject var358 = var353;
                                                                                    SubLObject var359 = (SubLObject)NIL;
                                                                                    var359 = var358.first();
                                                                                    while (NIL != var358) {
                                                                                        if (NIL == module0249.f16059(var359, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var359, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var359, module0141.f9195()), var327);
                                                                                        }
                                                                                        var358 = var358.rest();
                                                                                        var359 = var358.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic71$, var353);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var28_609, var321);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var59_614);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var28_608, var321);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var348);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var345, (SubLObject)UNPROVIDED)) {
                                                SubLObject var61_616;
                                                final SubLObject var360 = var61_616 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var321), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var321), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var361 = (SubLObject)NIL;
                                                var361 = var61_616.first();
                                                while (NIL != var61_616) {
                                                    final SubLObject var28_610 = module0138.$g1625$.currentBinding(var321);
                                                    try {
                                                        module0138.$g1625$.bind(var361, var321);
                                                        final SubLObject var363;
                                                        final SubLObject var362 = var363 = Functions.funcall(var361, var345);
                                                        if (NIL != module0077.f5302(var363)) {
                                                            final SubLObject var364 = module0077.f5333(var363);
                                                            SubLObject var365;
                                                            SubLObject var366;
                                                            SubLObject var367;
                                                            for (var365 = module0032.f1741(var364), var366 = (SubLObject)NIL, var366 = module0032.f1742(var365, var364); NIL == module0032.f1744(var365, var366); var366 = module0032.f1743(var366)) {
                                                                var367 = module0032.f1745(var365, var366);
                                                                if (NIL != module0032.f1746(var366, var367) && NIL == module0249.f16059(var367, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var367, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var367, module0141.f9195()), var327);
                                                                }
                                                            }
                                                        }
                                                        else if (var363.isList()) {
                                                            SubLObject var368 = var363;
                                                            SubLObject var369 = (SubLObject)NIL;
                                                            var369 = var368.first();
                                                            while (NIL != var368) {
                                                                if (NIL == module0249.f16059(var369, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var369, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var369, module0141.f9195()), var327);
                                                                }
                                                                var368 = var368.rest();
                                                                var369 = var368.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic71$, var363);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var28_610, var321);
                                                    }
                                                    var61_616 = var61_616.rest();
                                                    var361 = var61_616.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var29_607, var321);
                                            module0137.$g1605$.rebind(var28_607, var321);
                                        }
                                        var343 = var343.rest();
                                        var344 = var343.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var28_606, var321);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var34_608, var321);
                            module0138.$g1619$.rebind(var29_606, var321);
                            module0141.$g1677$.rebind(var28_605, var321);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var322, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var335, var321);
                    module0141.$g1674$.rebind(var334, var321);
                    module0141.$g1672$.rebind(var333, var321);
                    module0141.$g1671$.rebind(var29_605, var321);
                    module0141.$g1670$.rebind(var28_604, var321);
                }
            }
            finally {
                module0141.$g1715$.rebind(var331, var321);
                module0141.$g1714$.rebind(var28_603, var321);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var321));
        }
        finally {
            module0139.$g1635$.rebind(var329, var321);
        }
        return var6;
    }
    
    public static SubLObject f21819(final SubLObject var321) {
        final SubLThread var322 = SubLProcess.currentSubLThread();
        SubLObject var323 = (SubLObject)NIL;
        if (NIL != module0035.f2428((SubLObject)$ic144$, var321, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var324 = var321;
            SubLObject var325 = (SubLObject)NIL;
            var325 = var324.first();
            while (NIL != var324) {
                SubLObject var61_619 = f21828(var325);
                SubLObject var326 = (SubLObject)NIL;
                var326 = var61_619.first();
                while (NIL != var61_619) {
                    var323 = (SubLObject)ConsesLow.cons(var326, var323);
                    var61_619 = var61_619.rest();
                    var326 = var61_619.first();
                }
                var324 = var324.rest();
                var325 = var324.first();
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var322) && NIL != module0035.f2428((SubLObject)$ic144$, var323, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Errors.error((SubLObject)$ic145$, var323);
            }
        }
        else {
            var323 = var321;
        }
        var323 = Sequences.delete_duplicates(var323, (SubLObject)$ic108$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return reader.bq_cons((SubLObject)$ic144$, var323);
    }
    
    public static SubLObject f21828(final SubLObject var323) {
        SubLObject var324 = (SubLObject)NIL;
        if (NIL != f21789(var323)) {
            SubLObject var325 = var323.rest();
            SubLObject var326 = (SubLObject)NIL;
            var326 = var325.first();
            while (NIL != var325) {
                SubLObject var61_622 = f21828(var326);
                SubLObject var327 = (SubLObject)NIL;
                var327 = var61_622.first();
                while (NIL != var61_622) {
                    var324 = (SubLObject)ConsesLow.cons(var327, var324);
                    var61_622 = var61_622.rest();
                    var327 = var61_622.first();
                }
                var325 = var325.rest();
                var326 = var325.first();
            }
        }
        else if (NIL == conses_high.member(var323, var324, (SubLObject)$ic108$, Symbols.symbol_function((SubLObject)IDENTITY))) {
            var324 = (SubLObject)ConsesLow.cons(var323, var324);
        }
        return Sequences.delete_duplicates(var324, (SubLObject)$ic108$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21789(final SubLObject var323) {
        return module0062.f4492(var323, (SubLObject)$ic146$);
    }
    
    public static SubLObject f21790(final SubLObject var365, final SubLObject var366) {
        return module0035.f2201(var365.rest(), var366.rest(), Symbols.symbol_function((SubLObject)$ic108$));
    }
    
    public static SubLObject f21799(final SubLObject var48, final SubLObject var116, final SubLObject var395, final SubLObject var624) {
        if (NIL != var116) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic118$, var48, (SubLObject)((NIL != var624) ? ConsesLow.list(var624) : NIL));
        }
        if (NIL != var395) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic119$, var48, (SubLObject)((NIL != var624) ? ConsesLow.list(var624) : NIL));
        }
        return var48;
    }
    
    public static SubLObject f21797(final SubLObject var6, final SubLObject var13) {
        if (NIL == f21784(var6, var13)) {
            f21829(var6, var13);
        }
        return f21780(var6, var13).rest();
    }
    
    public static SubLObject f21829(final SubLObject var6, final SubLObject var13) {
        final SubLObject var14 = f21743(var6);
        final SubLObject var15 = f21744(var6);
        final SubLObject var16 = f21738(var6);
        module0079.f5412(var16, var13, f21830());
        SubLObject var17 = var14;
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            f21806(var6, var13, var18, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER);
            var17 = var17.rest();
            var18 = var17.first();
        }
        var17 = var15;
        SubLObject var19 = (SubLObject)NIL;
        var19 = var17.first();
        while (NIL != var17) {
            f21806(var6, var13, var19, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER);
            var17 = var17.rest();
            var19 = var17.first();
        }
        return var6;
    }
    
    public static SubLObject f21806(final SubLObject var6, final SubLObject var13, final SubLObject var630, SubLObject var23, SubLObject var409) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        if (var409 == UNPROVIDED) {
            var409 = (SubLObject)NIL;
        }
        final SubLThread var631 = SubLProcess.currentSubLThread();
        if (NIL != module0212.f13762(var13) && f21742(var6).eql(module0178.f11336(var630))) {
            final SubLObject var632 = f21831(var13, var630, var23, var409);
            final SubLObject var633 = module0079.f5424(var632);
            SubLObject var636;
            for (SubLObject var634 = (SubLObject)NIL; NIL == var634; var634 = (SubLObject)makeBoolean(NIL == var636)) {
                var631.resetMultipleValues();
                final SubLObject var635 = module0052.f3693(var633);
                var636 = var631.secondMultipleValue();
                var631.resetMultipleValues();
                if (NIL != var636) {
                    SubLObject var638;
                    final SubLObject var637 = var638 = var635;
                    SubLObject var639 = (SubLObject)NIL;
                    SubLObject var640 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var638, var637, (SubLObject)$ic147$);
                    var639 = var638.first();
                    var638 = var638.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var638, var637, (SubLObject)$ic147$);
                    var640 = var638.first();
                    var638 = var638.rest();
                    if (NIL == var638) {
                        if (NIL != module0212.f13762(var639)) {
                            f21797(var6, var639);
                        }
                        f21798(var6, var13, var639, var640);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var637, (SubLObject)$ic147$);
                    }
                }
            }
            return var632;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21831(final SubLObject var17, final SubLObject var630, final SubLObject var23, final SubLObject var409) {
        assert NIL != module0212.f13762(var17) : var17;
        final SubLObject var631 = f21762(var630);
        final SubLObject var632 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        module0079.f5412(var632, (SubLObject)$ic149$, var17);
        f21832(var17, var631, var23, var409, var632, (SubLObject)ConsesLow.list(var630));
        module0079.f5418(var632, (SubLObject)$ic149$);
        return var632;
    }
    
    public static SubLObject f21832(final SubLObject var17, final SubLObject var27, final SubLObject var23, final SubLObject var409, final SubLObject var634, SubLObject var635) {
        if (var635 == UNPROVIDED) {
            var635 = (SubLObject)NIL;
        }
        final SubLThread var636 = SubLProcess.currentSubLThread();
        final SubLObject var637 = module0079.f5416(var634, (SubLObject)$ic149$, (SubLObject)UNPROVIDED);
        final SubLObject var638 = (SubLObject)$ic61$;
        final SubLObject var639 = module0056.f4145(var638);
        SubLObject var640 = (SubLObject)NIL;
        final SubLObject var641 = module0139.$g1635$.currentBinding(var636);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var636);
            final SubLObject var642 = $ic62$;
            final SubLObject var28_637 = module0141.$g1714$.currentBinding(var636);
            final SubLObject var643 = module0141.$g1715$.currentBinding(var636);
            try {
                module0141.$g1714$.bind((NIL != var642) ? var642 : module0141.f9283(), var636);
                module0141.$g1715$.bind((SubLObject)((NIL != var642) ? $ic63$ : module0141.$g1715$.getDynamicValue(var636)), var636);
                if (NIL != var642 && NIL != module0136.f8864() && NIL == module0141.f9279(var642)) {
                    final SubLObject var644 = module0136.$g1591$.getDynamicValue(var636);
                    if (var644.eql((SubLObject)$ic64$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic65$, var642, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var644.eql((SubLObject)$ic67$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic68$, (SubLObject)$ic65$, var642, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var644.eql((SubLObject)$ic69$)) {
                        Errors.warn((SubLObject)$ic65$, var642, (SubLObject)$ic66$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic70$, module0136.$g1591$.getDynamicValue(var636));
                        Errors.cerror((SubLObject)$ic68$, (SubLObject)$ic65$, var642, (SubLObject)$ic66$);
                    }
                }
                final SubLObject var28_638 = module0141.$g1670$.currentBinding(var636);
                final SubLObject var29_639 = module0141.$g1671$.currentBinding(var636);
                final SubLObject var645 = module0141.$g1672$.currentBinding(var636);
                final SubLObject var646 = module0141.$g1674$.currentBinding(var636);
                final SubLObject var647 = module0137.$g1605$.currentBinding(var636);
                try {
                    module0141.$g1670$.bind(module0137.f8955($ic57$), var636);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic57$)), var636);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic57$)), var636);
                    module0141.$g1674$.bind((SubLObject)NIL, var636);
                    module0137.$g1605$.bind(module0137.f8955($ic57$), var636);
                    if (NIL != module0136.f8865() || NIL != module0244.f15795(var27, module0137.f8955((SubLObject)UNPROVIDED))) {
                        final SubLObject var28_639 = module0141.$g1677$.currentBinding(var636);
                        final SubLObject var29_640 = module0138.$g1619$.currentBinding(var636);
                        final SubLObject var34_642 = module0141.$g1674$.currentBinding(var636);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var636);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic57$)), var636);
                            module0141.$g1674$.bind((SubLObject)NIL, var636);
                            module0249.f16055(var27, (SubLObject)UNPROVIDED);
                            for (var640 = (SubLObject)ConsesLow.list(var27, module0141.f9195()); NIL != var640; var640 = module0056.f4150(var639)) {
                                final SubLObject var188_643 = var640.first();
                                final SubLObject var648 = conses_high.second(var640);
                                final SubLObject var649 = var188_643;
                                final SubLObject var28_640 = module0141.$g1674$.currentBinding(var636);
                                try {
                                    module0141.$g1674$.bind(var648, var636);
                                    final SubLObject var650 = var648;
                                    final SubLObject var651 = (NIL != var650) ? var409 : var23;
                                    final SubLObject var652 = f21774(var651);
                                    final SubLObject var653 = (SubLObject)makeBoolean(NIL == var650 && !var649.eql(var27));
                                    SubLObject var654 = module0220.f14558(var17, var649, var651, (SubLObject)$ic131$);
                                    SubLObject var655 = (SubLObject)NIL;
                                    var655 = var654.first();
                                    while (NIL != var654) {
                                        final SubLObject var656 = module0178.f11331(var655, var652);
                                        if (!var656.equal(var637) && NIL == module0079.f5437(var634, var656)) {
                                            final SubLObject var657 = f21799(var655, var650, var653, var27);
                                            final SubLObject var658 = f21819(reader.bq_cons(var657, var635));
                                            if (!var656.equal(var17)) {
                                                module0079.f5438(var634, var656, var658);
                                                f21832(var656, var27, var23, var409, var634, (SubLObject)ConsesLow.cons(var657, var635));
                                            }
                                        }
                                        var654 = var654.rest();
                                        var655 = var654.first();
                                    }
                                    SubLObject var660;
                                    final SubLObject var659 = var660 = module0200.f12443(module0137.f8955($ic57$));
                                    SubLObject var661 = (SubLObject)NIL;
                                    var661 = var660.first();
                                    while (NIL != var660) {
                                        final SubLObject var28_641 = module0137.$g1605$.currentBinding(var636);
                                        final SubLObject var29_641 = module0141.$g1674$.currentBinding(var636);
                                        try {
                                            module0137.$g1605$.bind(var661, var636);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var636)) : module0141.$g1674$.getDynamicValue(var636)), var636);
                                            final SubLObject var662 = module0228.f15229(var188_643);
                                            if (NIL != module0138.f8992(var662)) {
                                                final SubLObject var663 = module0242.f15664(var662, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var663) {
                                                    final SubLObject var664 = module0245.f15834(var663, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var664) {
                                                        SubLObject var665;
                                                        for (var665 = module0066.f4838(module0067.f4891(var664)); NIL == module0066.f4841(var665); var665 = module0066.f4840(var665)) {
                                                            var636.resetMultipleValues();
                                                            final SubLObject var666 = module0066.f4839(var665);
                                                            final SubLObject var667 = var636.secondMultipleValue();
                                                            var636.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var666)) {
                                                                final SubLObject var28_642 = module0138.$g1623$.currentBinding(var636);
                                                                try {
                                                                    module0138.$g1623$.bind(var666, var636);
                                                                    SubLObject var59_651;
                                                                    for (var59_651 = module0066.f4838(module0067.f4891(var667)); NIL == module0066.f4841(var59_651); var59_651 = module0066.f4840(var59_651)) {
                                                                        var636.resetMultipleValues();
                                                                        final SubLObject var668 = module0066.f4839(var59_651);
                                                                        final SubLObject var669 = var636.secondMultipleValue();
                                                                        var636.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var668)) {
                                                                            final SubLObject var28_643 = module0138.$g1624$.currentBinding(var636);
                                                                            try {
                                                                                module0138.$g1624$.bind(var668, var636);
                                                                                final SubLObject var670 = var669;
                                                                                if (NIL != module0077.f5302(var670)) {
                                                                                    final SubLObject var671 = module0077.f5333(var670);
                                                                                    SubLObject var672;
                                                                                    SubLObject var673;
                                                                                    SubLObject var674;
                                                                                    for (var672 = module0032.f1741(var671), var673 = (SubLObject)NIL, var673 = module0032.f1742(var672, var671); NIL == module0032.f1744(var672, var673); var673 = module0032.f1743(var673)) {
                                                                                        var674 = module0032.f1745(var672, var673);
                                                                                        if (NIL != module0032.f1746(var673, var674) && NIL == module0249.f16059(var674, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var674, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var674, module0141.f9195()), var639);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var670.isList()) {
                                                                                    SubLObject var675 = var670;
                                                                                    SubLObject var676 = (SubLObject)NIL;
                                                                                    var676 = var675.first();
                                                                                    while (NIL != var675) {
                                                                                        if (NIL == module0249.f16059(var676, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var676, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var676, module0141.f9195()), var639);
                                                                                        }
                                                                                        var675 = var675.rest();
                                                                                        var676 = var675.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic71$, var670);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var28_643, var636);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var59_651);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var28_642, var636);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var665);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var662, (SubLObject)UNPROVIDED)) {
                                                SubLObject var61_653;
                                                final SubLObject var677 = var61_653 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var636), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var636), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var678 = (SubLObject)NIL;
                                                var678 = var61_653.first();
                                                while (NIL != var61_653) {
                                                    final SubLObject var28_644 = module0138.$g1625$.currentBinding(var636);
                                                    try {
                                                        module0138.$g1625$.bind(var678, var636);
                                                        final SubLObject var680;
                                                        final SubLObject var679 = var680 = Functions.funcall(var678, var662);
                                                        if (NIL != module0077.f5302(var680)) {
                                                            final SubLObject var681 = module0077.f5333(var680);
                                                            SubLObject var682;
                                                            SubLObject var683;
                                                            SubLObject var684;
                                                            for (var682 = module0032.f1741(var681), var683 = (SubLObject)NIL, var683 = module0032.f1742(var682, var681); NIL == module0032.f1744(var682, var683); var683 = module0032.f1743(var683)) {
                                                                var684 = module0032.f1745(var682, var683);
                                                                if (NIL != module0032.f1746(var683, var684) && NIL == module0249.f16059(var684, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var684, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var684, module0141.f9195()), var639);
                                                                }
                                                            }
                                                        }
                                                        else if (var680.isList()) {
                                                            SubLObject var685 = var680;
                                                            SubLObject var686 = (SubLObject)NIL;
                                                            var686 = var685.first();
                                                            while (NIL != var685) {
                                                                if (NIL == module0249.f16059(var686, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var686, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var686, module0141.f9195()), var639);
                                                                }
                                                                var685 = var685.rest();
                                                                var686 = var685.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic71$, var680);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var28_644, var636);
                                                    }
                                                    var61_653 = var61_653.rest();
                                                    var678 = var61_653.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var29_641, var636);
                                            module0137.$g1605$.rebind(var28_641, var636);
                                        }
                                        var660 = var660.rest();
                                        var661 = var660.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var28_640, var636);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var34_642, var636);
                            module0138.$g1619$.rebind(var29_640, var636);
                            module0141.$g1677$.rebind(var28_639, var636);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic73$, var27, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var647, var636);
                    module0141.$g1674$.rebind(var646, var636);
                    module0141.$g1672$.rebind(var645, var636);
                    module0141.$g1671$.rebind(var29_639, var636);
                    module0141.$g1670$.rebind(var28_638, var636);
                }
            }
            finally {
                module0141.$g1715$.rebind(var643, var636);
                module0141.$g1714$.rebind(var28_637, var636);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var636));
        }
        finally {
            module0139.$g1635$.rebind(var641, var636);
        }
        return var634;
    }
    
    public static SubLObject f21820(final SubLObject var655, SubLObject var656, SubLObject var657) {
        if (var656 == UNPROVIDED) {
            var656 = module0147.$g2095$.getDynamicValue();
        }
        if (var657 == UNPROVIDED) {
            var657 = (SubLObject)$ic150$;
        }
        final SubLObject var658 = module0318.f21467(module0205.f13132(var655));
        return module0191.f11990(var658, var655, var656, var657);
    }
    
    public static SubLObject f21762(final SubLObject var323) {
        final SubLThread var324 = SubLProcess.currentSubLThread();
        final SubLObject var325 = module0191.f11967(var323);
        final SubLObject var326 = module0205.f13132(var325);
        if (var326.eql($ic130$) || var326.eql($ic132$)) {
            return module0205.f13204(var325, (SubLObject)UNPROVIDED);
        }
        var324.resetMultipleValues();
        final SubLObject var327 = module0337.f22630(var325, (SubLObject)$ic151$);
        final SubLObject var328 = var324.secondMultipleValue();
        var324.resetMultipleValues();
        if (NIL != var327) {
            final SubLObject var329 = module0035.f2294(var328, (SubLObject)$ic152$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return var329;
        }
        Errors.error((SubLObject)$ic153$, var323);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21783(final SubLObject var6, final SubLObject var348, SubLObject var144) {
        if (var144 == UNPROVIDED) {
            var144 = (SubLObject)NIL;
        }
        final SubLThread var349 = SubLProcess.currentSubLThread();
        if (NIL == var144) {
            if (NIL != assertion_handles_oc.f11035(var348)) {
                var144 = module0178.f11333(var348);
            }
            else if (NIL != f21789(var348)) {
                if (NIL == var144) {
                    SubLObject var350 = var348.rest();
                    SubLObject var351 = (SubLObject)NIL;
                    var351 = var350.first();
                    while (NIL == var144 && NIL != var350) {
                        if (NIL != module0004.f104(var351, f21743(var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != conses_high.member(var351, f21744(var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var144 = f21762(var351);
                        }
                        var350 = var350.rest();
                        var351 = var350.first();
                    }
                }
            }
            else if (var348.isList() && NIL != conses_high.member(var348.first(), (SubLObject)$ic154$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var144 = conses_high.third(var348);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var349) && NIL == var144) {
                Errors.error((SubLObject)$ic155$, var348);
            }
        }
        SubLObject var352 = (SubLObject)NIL;
        if (NIL == var352) {
            SubLObject var353 = f21743(var6);
            SubLObject var354 = (SubLObject)NIL;
            var354 = var353.first();
            while (NIL == var352 && NIL != var353) {
                if (f21762(var354).eql(var144) && NIL != f21786(var354)) {
                    var352 = var354;
                }
                var353 = var353.rest();
                var354 = var353.first();
            }
        }
        if (NIL == var352) {
            SubLObject var353 = f21744(var6);
            SubLObject var354 = (SubLObject)NIL;
            var354 = var353.first();
            while (NIL == var352 && NIL != var353) {
                if (f21762(var354).eql(var144) && NIL != f21786(var354)) {
                    var352 = var354;
                }
                var353 = var353.rest();
                var354 = var353.first();
            }
        }
        return var352;
    }
    
    public static SubLObject f21830() {
        return (SubLObject)ConsesLow.cons(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f21818(final SubLObject var6, final SubLObject var13, final SubLObject var320, final SubLObject var321) {
        final SubLThread var322 = SubLProcess.currentSubLThread();
        final SubLObject var323 = f21780(var6, var13);
        final SubLObject var324 = var323.first();
        final SubLObject var325 = module0079.f5416(var324, var320, (SubLObject)NIL);
        final SubLObject var326 = conses_high.union(var321, var325, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic156$);
        module0079.f5412(var324, var320, var326);
        SubLObject var327;
        for (var327 = module0066.f4838(module0067.f4891(f21833(var6, var320))); NIL == module0066.f4841(var327); var327 = module0066.f4840(var327)) {
            var322.resetMultipleValues();
            final SubLObject var328 = module0066.f4839(var327);
            final SubLObject var329 = var322.secondMultipleValue();
            var322.resetMultipleValues();
            SubLObject var330 = var326;
            SubLObject var331 = (SubLObject)NIL;
            var331 = var330.first();
            while (NIL != var330) {
                SubLObject var61_666 = var329;
                SubLObject var332 = (SubLObject)NIL;
                var332 = var61_666.first();
                while (NIL != var61_666) {
                    final SubLObject var333 = f21819((SubLObject)ConsesLow.list(var331, var332));
                    module0079.f5439(var324, var328, var333, (SubLObject)$ic108$, (SubLObject)UNPROVIDED);
                    var61_666 = var61_666.rest();
                    var332 = var61_666.first();
                }
                var330 = var330.rest();
                var331 = var330.first();
            }
        }
        module0066.f4842(var327);
        return var323;
    }
    
    public static SubLObject f21833(final SubLObject var6, final SubLObject var320) {
        final SubLThread var321 = SubLProcess.currentSubLThread();
        final SubLObject var322 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        final SubLObject var323 = f21743(var6);
        final SubLObject var324 = f21744(var6);
        if (NIL != module0212.f13762(var320)) {
            final SubLObject var325 = f21742(var6);
            if (var325.eql((SubLObject)ONE_INTEGER)) {
                SubLObject var326 = var323;
                SubLObject var327 = (SubLObject)NIL;
                var327 = var326.first();
                while (NIL != var326) {
                    if (NIL != assertion_handles_oc.f11041(var327, (SubLObject)UNPROVIDED) && TWO_INTEGER.eql(module0178.f11336(var327))) {
                        final SubLObject var328 = module0079.f5424(f21831(var320, var327, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER));
                        SubLObject var331;
                        for (SubLObject var329 = (SubLObject)NIL; NIL == var329; var329 = (SubLObject)makeBoolean(NIL == var331)) {
                            var321.resetMultipleValues();
                            final SubLObject var330 = module0052.f3693(var328);
                            var331 = var321.secondMultipleValue();
                            var321.resetMultipleValues();
                            if (NIL != var331) {
                                SubLObject var333;
                                final SubLObject var332 = var333 = var330;
                                SubLObject var334 = (SubLObject)NIL;
                                SubLObject var335 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var333, var332, (SubLObject)$ic157$);
                                var334 = var333.first();
                                var333 = var333.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var333, var332, (SubLObject)$ic157$);
                                var335 = var333.first();
                                var333 = var333.rest();
                                if (NIL == var333) {
                                    module0067.f4886(var322, var334, var335);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var332, (SubLObject)$ic157$);
                                }
                            }
                        }
                    }
                    var326 = var326.rest();
                    var327 = var326.first();
                }
            }
            else if (var325.eql((SubLObject)TWO_INTEGER)) {
                SubLObject var326 = var324;
                SubLObject var336 = (SubLObject)NIL;
                var336 = var326.first();
                while (NIL != var326) {
                    if (NIL != assertion_handles_oc.f11041(var336, (SubLObject)UNPROVIDED) && ONE_INTEGER.eql(module0178.f11336(var336))) {
                        final SubLObject var328 = module0079.f5424(f21831(var320, var336, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER));
                        SubLObject var331;
                        for (SubLObject var329 = (SubLObject)NIL; NIL == var329; var329 = (SubLObject)makeBoolean(NIL == var331)) {
                            var321.resetMultipleValues();
                            final SubLObject var330 = module0052.f3693(var328);
                            var331 = var321.secondMultipleValue();
                            var321.resetMultipleValues();
                            if (NIL != var331) {
                                SubLObject var338;
                                final SubLObject var337 = var338 = var330;
                                SubLObject var334 = (SubLObject)NIL;
                                SubLObject var335 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var338, var337, (SubLObject)$ic157$);
                                var334 = var338.first();
                                var338 = var338.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var338, var337, (SubLObject)$ic157$);
                                var335 = var338.first();
                                var338 = var338.rest();
                                if (NIL == var338) {
                                    module0067.f4886(var322, var334, var335);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var337, (SubLObject)$ic157$);
                                }
                            }
                        }
                    }
                    var326 = var326.rest();
                    var336 = var326.first();
                }
            }
            if (NIL != module0269.f17806(f21741(var6))) {
                final SubLObject var339 = f21778(f21741(var6));
                final SubLObject var340 = f21742(var6);
                final SubLObject var341 = module0079.f5424(f21831(var320, var339, var340, f21774(var340)));
                SubLObject var344;
                for (SubLObject var342 = (SubLObject)NIL; NIL == var342; var342 = (SubLObject)makeBoolean(NIL == var344)) {
                    var321.resetMultipleValues();
                    final SubLObject var343 = module0052.f3693(var341);
                    var344 = var321.secondMultipleValue();
                    var321.resetMultipleValues();
                    if (NIL != var344) {
                        SubLObject var346;
                        final SubLObject var345 = var346 = var343;
                        SubLObject var347 = (SubLObject)NIL;
                        SubLObject var348 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var346, var345, (SubLObject)$ic157$);
                        var347 = var346.first();
                        var346 = var346.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var346, var345, (SubLObject)$ic157$);
                        var348 = var346.first();
                        var346 = var346.rest();
                        if (NIL == var346) {
                            module0067.f4886(var322, var347, var348);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var345, (SubLObject)$ic157$);
                        }
                    }
                }
            }
        }
        return var322;
    }
    
    public static SubLObject f21778(final SubLObject var27) {
        final SubLObject var28 = module0202.f12768($ic141$, var27, $ic158$);
        final SubLObject var29 = module0288.f19338(var28, (SubLObject)UNPROVIDED);
        return (NIL != var29) ? var29 : f21820(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21798(final SubLObject var6, final SubLObject var13, final SubLObject var396, final SubLObject var321) {
        SubLObject var397 = f21780(var6, var396);
        if (NIL == var397) {
            var397 = f21830();
            module0079.f5412(f21738(var6), var13, var397);
        }
        final SubLObject var398 = var397.rest();
        final SubLObject var399 = module0079.f5416(var398, var13, (SubLObject)NIL);
        module0079.f5412(var398, var13, conses_high.union(var321, var399, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic156$));
        return var397;
    }
    
    public static SubLObject f21795(final SubLObject var627, final SubLObject var13, final SubLObject var320, final SubLObject var323) {
        final SubLObject var628 = module0079.f5416(var627, var13, (SubLObject)UNPROVIDED);
        final SubLObject var629 = var628.first();
        if (NIL != module0079.f5404(var629)) {
            final SubLObject var630 = module0079.f5416(var629, var320, (SubLObject)NIL);
            module0079.f5412(var629, var320, Sequences.delete(var323, var630, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic156$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var628;
    }
    
    public static SubLObject f21834(final SubLObject var627, final SubLObject var13, final SubLObject var396, final SubLObject var323) {
        SubLObject var628 = module0079.f5416(var627, var396, (SubLObject)NIL);
        if (NIL == var628) {
            var628 = f21830();
            module0079.f5412(var627, var13, var628);
        }
        final SubLObject var629 = var628.rest();
        final SubLObject var630 = module0079.f5416(var629, var13, (SubLObject)NIL);
        module0079.f5412(var629, var13, Sequences.delete(var323, var630, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic156$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var628;
    }
    
    public static SubLObject f21774(final SubLObject var674) {
        return Numbers.subtract((SubLObject)THREE_INTEGER, var674);
    }
    
    public static SubLObject f21835(final SubLObject var85, final SubLObject var74) {
        return f21836(var85, var74);
    }
    
    public static SubLObject f21836(final SubLObject var86, final SubLObject var74) {
        module0021.f1086($g2827$.getGlobalValue(), var74);
        module0021.f1038(f21741(var86), var74);
        module0021.f1038(f21742(var86), var74);
        module0021.f1038(f21743(var86), var74);
        module0021.f1038(f21744(var86), var74);
        module0021.f1038(f21738(var86), var74);
        return var86;
    }
    
    public static SubLObject f21837(final SubLObject var74) {
        SubLObject var75 = (SubLObject)NIL;
        var75 = f21750((SubLObject)UNPROVIDED);
        f21745(var75, module0021.f1060(var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f21746(var75, module0021.f1060(var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f21747(var75, module0021.f1060(var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f21748(var75, module0021.f1060(var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f21749(var75, module0021.f1060(var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var75;
    }
    
    public static SubLObject f21838() {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = module0147.$g2094$.currentBinding(var25);
        final SubLObject var28 = module0147.$g2095$.currentBinding(var25);
        try {
            module0147.$g2094$.bind((SubLObject)$ic12$, var25);
            module0147.$g2095$.bind($ic13$, var25);
            var26 = (SubLObject)makeBoolean(NIL == module0079.f5404($g2822$.getGlobalValue()) || (NIL != module0079.f5410($g2822$.getGlobalValue()) && module0217.f14247($ic11$, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)));
        }
        finally {
            module0147.$g2095$.rebind(var28, var25);
            module0147.$g2094$.rebind(var27, var25);
        }
        return var26;
    }
    
    public static SubLObject f21839() {
        f21731();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21840(SubLObject var675) {
        if (var675 == UNPROVIDED) {
            var675 = (SubLObject)NIL;
        }
        return dumper_oc.f37916((SubLObject)$ic162$, var675, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21841(SubLObject var675) {
        if (var675 == UNPROVIDED) {
            var675 = (SubLObject)NIL;
        }
        return dumper_oc.f37916((SubLObject)$ic163$, var675, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21842(final SubLObject var676, final SubLObject var95) {
        final SubLObject var677 = f21840(var676);
        final SubLObject var678 = f21841(var676);
        return f21843(var677, var678, var95);
    }
    
    public static SubLObject f21843(final SubLObject var677, final SubLObject var678, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = module0021.f1153();
        }
        final SubLThread var679 = SubLProcess.currentSubLThread();
        final SubLObject var680 = (SubLObject)makeBoolean(NIL != module0075.f5218(var677) && NIL != module0075.f5218(var678));
        if (NIL != var680) {
            final SubLObject var681 = module0095.f6845(var677, var678, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var682 = module0079.f5424($g2822$.getGlobalValue());
            SubLObject var685;
            for (SubLObject var683 = (SubLObject)NIL; NIL == var683; var683 = (SubLObject)makeBoolean(NIL == var685)) {
                var679.resetMultipleValues();
                final SubLObject var684 = module0052.f3693(var682);
                var685 = var679.secondMultipleValue();
                var679.resetMultipleValues();
                if (NIL != var685) {
                    SubLObject var687;
                    final SubLObject var686 = var687 = var684;
                    SubLObject var688 = (SubLObject)NIL;
                    SubLObject var689 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var687, var686, (SubLObject)$ic164$);
                    var688 = var687.first();
                    var687 = var687.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var687, var686, (SubLObject)$ic164$);
                    var689 = var687.first();
                    var687 = var687.rest();
                    if (NIL == var687) {
                        SubLObject var690 = var689;
                        SubLObject var691 = (SubLObject)NIL;
                        var691 = var690.first();
                        while (NIL != var690) {
                            f21757(var691, var681, var95);
                            var690 = var690.rest();
                            var691 = var690.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var686, (SubLObject)$ic164$);
                    }
                }
            }
        }
        else {
            Errors.warn((SubLObject)$ic165$, var677, var678);
        }
        return var680;
    }
    
    public static SubLObject f21844(final SubLObject var74, final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        final SubLObject var91 = module0079.f5427($g2822$.getGlobalValue());
        final SubLObject var92 = module0079.f5424($g2822$.getGlobalValue());
        SubLObject var95;
        for (SubLObject var93 = (SubLObject)NIL; NIL == var93; var93 = (SubLObject)makeBoolean(NIL == var95)) {
            var90.resetMultipleValues();
            final SubLObject var94 = module0052.f3693(var92);
            var95 = var90.secondMultipleValue();
            var90.resetMultipleValues();
            if (NIL != var95) {
                SubLObject var97;
                final SubLObject var96 = var97 = var94;
                SubLObject var98 = (SubLObject)NIL;
                SubLObject var99 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var97, var96, (SubLObject)$ic164$);
                var98 = var97.first();
                var97 = var97.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var97, var96, (SubLObject)$ic164$);
                var99 = var97.first();
                var97 = var97.rest();
                if (NIL == var97) {
                    SubLObject var100 = (SubLObject)NIL;
                    SubLObject var101 = var99;
                    SubLObject var102 = (SubLObject)NIL;
                    var102 = var101.first();
                    while (NIL != var101) {
                        final SubLObject var103 = f21754(var102, var89);
                        var100 = (SubLObject)ConsesLow.cons(var103, var100);
                        var101 = var101.rest();
                        var102 = var101.first();
                    }
                    var100 = Sequences.nreverse(var100);
                    module0079.f5412(var91, var98, var100);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var96, (SubLObject)$ic164$);
                }
            }
        }
        module0021.f1038(var91, var74);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21845(final SubLObject var74) {
        module0021.f1038($g2822$.getGlobalValue(), var74);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21846(final SubLObject var74) {
        $g2822$.setGlobalValue(module0021.f1060(var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21847() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0322", "f21723", "S#24292");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0322", "f21724", "S#24293");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21725", "S#24191", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21729", "S#24190", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21730", "S#24189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21731", "S#24294", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21733", "S#24295", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21732", "S#24296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21736", "S#24188", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21737", "S#24297", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21739", "S#24298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21727", "S#24288", 1, 0, false);
        new $f21727$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21741", "S#24299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21742", "S#24300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21743", "S#24301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21744", "S#24302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21738", "S#24303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21745", "S#24304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21746", "S#24305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21747", "S#24306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21748", "S#24307", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21749", "S#24308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21750", "S#24309", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21751", "S#24310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21752", "S#24311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21753", "S#24312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21740", "S#24313", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21754", "S#24314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21755", "S#24315", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21756", "S#24316", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21757", "S#24317", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21734", "S#24318", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21758", "S#24319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21759", "S#24320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21760", "S#24321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21761", "S#24322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21726", "S#24323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21764", "S#24324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21763", "S#24325", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21765", "S#24326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21766", "S#24327", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21767", "S#24328", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0322", "f21768", "S#24329");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0322", "f21769", "S#24330");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0322", "f21770", "S#24331");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21771", "S#24332", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21772", "S#24333", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21773", "S#24334", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21728", "S#24335", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21775", "S#24336", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21777", "S#24337", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21779", "S#24338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21780", "S#24339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21781", "S#24340", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21776", "S#24341", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21784", "S#24342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21785", "S#24343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21786", "S#24344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21787", "S#24345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21788", "S#24346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21782", "S#24347", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21791", "S#24348", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21792", "ADD-TVA-CACHE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21794", "REMOVE-TVA-CACHE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21796", "ADD-TVA-CACHE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21800", "REMOVE-TVA-CACHE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21801", "S#24349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21803", "S#24350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21804", "S#24351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21805", "S#24352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21802", "S#24353", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21735", "S#24354", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21807", "S#24355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21808", "S#24356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21809", "S#24357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21814", "S#24358", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21815", "S#24359", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21816", "S#24360", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21817", "S#24361", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21813", "S#24362", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21821", "S#24363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21823", "S#24364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21824", "S#24365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21825", "S#24366", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21826", "S#24367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21827", "S#24368", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21810", "S#24369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21822", "S#24370", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21811", "S#24371", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21812", "S#24372", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21793", "S#24373", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21819", "S#24374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21828", "S#24375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21789", "S#24376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21790", "S#24377", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21799", "S#24378", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21797", "S#24379", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21829", "S#24380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21806", "S#24381", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21831", "S#24382", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21832", "S#24383", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21820", "S#24384", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21762", "S#24385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21783", "S#24386", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21830", "S#24387", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21818", "S#24388", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21833", "S#24389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21778", "S#24390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21798", "S#24391", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21795", "S#24392", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21834", "S#24393", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21774", "S#24394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21835", "S#24395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21836", "S#24396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21837", "S#24397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21838", "S#16686", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21839", "S#16687", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21840", "S#24398", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21841", "S#24399", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21842", "S#9552", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21843", "S#24400", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21844", "S#24401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21845", "S#24402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0322", "f21846", "S#24403", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21848() {
        $g2819$ = SubLFiles.defparameter("S#24404", (SubLObject)T);
        $g2820$ = SubLFiles.defconstant("S#24405", (SubLObject)$ic21$);
        $g2821$ = SubLFiles.deflexical("S#24406", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic53$)) ? $g2821$.getGlobalValue() : NIL));
        $g2822$ = SubLFiles.deflexical("S#24407", (NIL != Symbols.boundp((SubLObject)$ic56$)) ? $g2822$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2823$ = SubLFiles.defparameter("S#24408", (SubLObject)NIL);
        $g2824$ = SubLFiles.deflexical("S#24409", (NIL != Symbols.boundp((SubLObject)$ic75$)) ? $g2824$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g2825$ = SubLFiles.defparameter("S#24410", (SubLObject)NIL);
        $g2826$ = SubLFiles.deflexical("S#24411", (SubLObject)NIL);
        $g2827$ = SubLFiles.defconstant("S#24412", (SubLObject)$ic159$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21849() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2820$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic28$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic29$);
        Structures.def_csetf((SubLObject)$ic30$, (SubLObject)$ic31$);
        Structures.def_csetf((SubLObject)$ic32$, (SubLObject)$ic33$);
        Structures.def_csetf((SubLObject)$ic34$, (SubLObject)$ic35$);
        Structures.def_csetf((SubLObject)$ic36$, (SubLObject)$ic37$);
        Structures.def_csetf((SubLObject)$ic8$, (SubLObject)$ic38$);
        Equality.identity((SubLObject)$ic21$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2820$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic49$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g2820$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic50$));
        module0003.f57((SubLObject)$ic53$);
        module0003.f57((SubLObject)$ic56$);
        module0003.f57((SubLObject)$ic75$);
        module0034.f1895((SubLObject)$ic94$);
        module0034.f1895((SubLObject)$ic110$);
        module0034.f1895((SubLObject)$ic115$);
        module0012.f416((SubLObject)$ic121$);
        module0012.f416((SubLObject)$ic122$);
        module0012.f416((SubLObject)$ic125$);
        module0012.f416((SubLObject)$ic126$);
        module0034.f1909((SubLObject)$ic138$);
        module0021.f1098($g2827$.getGlobalValue(), (SubLObject)$ic160$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g2820$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic161$));
        module0002.f35((SubLObject)$ic166$, (SubLObject)$ic167$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f21847();
    }
    
    public void initializeVariables() {
        f21848();
    }
    
    public void runTopLevelForms() {
        f21849();
    }
    
    static {
        me = (SubLFile)new module0322();
        $g2819$ = null;
        $g2820$ = null;
        $g2821$ = null;
        $g2822$ = null;
        $g2823$ = null;
        $g2824$ = null;
        $g2825$ = null;
        $g2826$ = null;
        $g2827$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4495", "CYC"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeUninternedSymbol("US#3DD5054");
        $ic2$ = makeSymbol("DO-DICTIONARY");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24318", "CYC")));
        $ic4$ = makeSymbol("CDOLIST");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#24414", "CYC"), (SubLObject)makeSymbol("S#24415", "CYC"), (SubLObject)makeSymbol("S#4495", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic6$ = makeUninternedSymbol("US#13A0444");
        $ic7$ = makeSymbol("S#7027", "CYC");
        $ic8$ = makeSymbol("S#24303", "CYC");
        $ic9$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic10$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("cacheTransitiveClosureForArgs"));
        $ic12$ = makeSymbol("S#12275", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic14$ = makeString("Initialize TVA Caches ... ");
        $ic15$ = makeKeyword("GAF");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#24416", "CYC"), (SubLObject)makeSymbol("S#24417", "CYC"));
        $ic17$ = makeSymbol("S#38", "CYC");
        $ic18$ = makeString("Problem initializing TVA-CACHE for ~A: ~A. KB Subset issue?~%");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeUninternedSymbol("US#13A0444"));
        $ic20$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#24414", "CYC"), (SubLObject)makeSymbol("S#24415", "CYC"));
        $ic21$ = makeSymbol("S#24287", "CYC");
        $ic22$ = makeSymbol("S#24288", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#24417", "CYC"), (SubLObject)makeSymbol("S#24418", "CYC"), (SubLObject)makeSymbol("S#24419", "CYC"), (SubLObject)makeSymbol("MAP"));
        $ic24$ = ConsesLow.list((SubLObject)makeKeyword("PRED"), (SubLObject)makeKeyword("INDEX-ARGNUM"), (SubLObject)makeKeyword("TVA-PRED-GAFS"), (SubLObject)makeKeyword("TVAI-PRED-GAFS"), (SubLObject)makeKeyword("MAP"));
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#24299", "CYC"), (SubLObject)makeSymbol("S#24300", "CYC"), (SubLObject)makeSymbol("S#24301", "CYC"), (SubLObject)makeSymbol("S#24302", "CYC"), (SubLObject)makeSymbol("S#24303", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#24304", "CYC"), (SubLObject)makeSymbol("S#24305", "CYC"), (SubLObject)makeSymbol("S#24306", "CYC"), (SubLObject)makeSymbol("S#24307", "CYC"), (SubLObject)makeSymbol("S#24308", "CYC"));
        $ic27$ = makeSymbol("S#24313", "CYC");
        $ic28$ = makeSymbol("S#24298", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#24288", "CYC"));
        $ic30$ = makeSymbol("S#24299", "CYC");
        $ic31$ = makeSymbol("S#24304", "CYC");
        $ic32$ = makeSymbol("S#24300", "CYC");
        $ic33$ = makeSymbol("S#24305", "CYC");
        $ic34$ = makeSymbol("S#24301", "CYC");
        $ic35$ = makeSymbol("S#24306", "CYC");
        $ic36$ = makeSymbol("S#24302", "CYC");
        $ic37$ = makeSymbol("S#24307", "CYC");
        $ic38$ = makeSymbol("S#24308", "CYC");
        $ic39$ = makeKeyword("PRED");
        $ic40$ = makeKeyword("INDEX-ARGNUM");
        $ic41$ = makeKeyword("TVA-PRED-GAFS");
        $ic42$ = makeKeyword("TVAI-PRED-GAFS");
        $ic43$ = makeKeyword("MAP");
        $ic44$ = makeString("Invalid slot ~S for construction function");
        $ic45$ = makeKeyword("BEGIN");
        $ic46$ = makeSymbol("S#24309", "CYC");
        $ic47$ = makeKeyword("SLOT");
        $ic48$ = makeKeyword("END");
        $ic49$ = makeSymbol("S#24311", "CYC");
        $ic50$ = makeSymbol("S#24312", "CYC");
        $ic51$ = makeString("#<TVA-CACHE ~S ~S>");
        $ic52$ = makeKeyword("SWAPPED-OUT");
        $ic53$ = makeSymbol("S#24406", "CYC");
        $ic54$ = makeString("Swappable TVA Cache");
        $ic55$ = makeString("Cannot reconnect ~A, which is not a swappable TVA cache.");
        $ic56$ = makeSymbol("S#24407", "CYC");
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic58$ = makeKeyword("BREADTH");
        $ic59$ = makeKeyword("DEPTH");
        $ic60$ = makeKeyword("STACK");
        $ic61$ = makeKeyword("QUEUE");
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic63$ = makeSymbol("S#11450", "CYC");
        $ic64$ = makeKeyword("ERROR");
        $ic65$ = makeString("~A is not a ~A");
        $ic66$ = makeSymbol("S#11592", "CYC");
        $ic67$ = makeKeyword("CERROR");
        $ic68$ = makeString("continue anyway");
        $ic69$ = makeKeyword("WARN");
        $ic70$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic71$ = makeString("~A is neither SET-P nor LISTP.");
        $ic72$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic73$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic74$ = makeString("~&Creating TVA cache for ~S (arg ~D)...~%.");
        $ic75$ = makeSymbol("S#24409", "CYC");
        $ic76$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12316", "CYC"), (SubLObject)makeSymbol("TIME"));
        $ic77$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24420", "CYC"), (SubLObject)makeSymbol("S#4495", "CYC"), (SubLObject)makeSymbol("S#24001", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#15403", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic78$ = ConsesLow.list((SubLObject)makeKeyword("DONE?"));
        $ic79$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic80$ = makeKeyword("DONE?");
        $ic81$ = makeSymbol("PIF");
        $ic82$ = makeSymbol("S#24408", "CYC");
        $ic83$ = makeSymbol("S#24331", "CYC");
        $ic84$ = makeSymbol("S#24330", "CYC");
        $ic85$ = makeUninternedSymbol("US#1169C35");
        $ic86$ = makeSymbol("S#15326", "CYC");
        $ic87$ = makeSymbol("CLET");
        $ic88$ = makeSymbol("FIF");
        $ic89$ = makeSymbol("S#24334", "CYC");
        $ic90$ = makeUninternedSymbol("US#1169C35");
        $ic91$ = makeUninternedSymbol("US#117D035");
        $ic92$ = makeUninternedSymbol("US#7379475");
        $ic93$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic94$ = makeSymbol("S#24333", "CYC");
        $ic95$ = makeSymbol("CSOME");
        $ic96$ = ConsesLow.list((SubLObject)NIL);
        $ic97$ = ConsesLow.list((SubLObject)T);
        $ic98$ = makeSymbol("S#12274", "CYC");
        $ic99$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic100$ = makeSymbol("S#12280", "CYC");
        $ic101$ = makeSymbol("S#12278", "CYC");
        $ic102$ = makeInteger(5000);
        $ic103$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic104$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic105$ = makeSymbol("S#5859", "CYC");
        $ic106$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic107$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#24421", "CYC"), (SubLObject)makeSymbol("S#24422", "CYC"));
        $ic108$ = makeSymbol("S#24346", "CYC");
        $ic109$ = makeKeyword("GENLPREDS");
        $ic110$ = makeSymbol("S#24341", "CYC");
        $ic111$ = ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic112$ = ConsesLow.list((SubLObject)makeSymbol("S#24423", "CYC"), (SubLObject)makeSymbol("S#24424", "CYC"));
        $ic113$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#24425", "CYC"), (SubLObject)makeSymbol("S#24426", "CYC"));
        $ic114$ = makeInteger(100000);
        $ic115$ = makeSymbol("S#24344", "CYC");
        $ic116$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#12459", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#24427", "CYC"));
        $ic117$ = makeString("No specified pred for ~S");
        $ic118$ = makeKeyword("INVERSE");
        $ic119$ = makeKeyword("SPEC-PRED");
        $ic120$ = ConsesLow.list((SubLObject)makeSymbol("S#24413", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic121$ = makeSymbol("ADD-TVA-CACHE-VALUE");
        $ic122$ = makeSymbol("REMOVE-TVA-CACHE-VALUE");
        $ic123$ = ConsesLow.list((SubLObject)makeSymbol("S#24428", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("S#4495", "CYC"), (SubLObject)makeSymbol("S#24001", "CYC"), (SubLObject)makeSymbol("S#24429", "CYC"));
        $ic125$ = makeSymbol("ADD-TVA-CACHE-KEY");
        $ic126$ = makeSymbol("REMOVE-TVA-CACHE-KEY");
        $ic127$ = ConsesLow.list((SubLObject)makeSymbol("S#24413", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("S#24417", "CYC"));
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic129$ = makeSymbol("BINARY-PREDICATE?");
        $ic130$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArg"));
        $ic131$ = makeKeyword("TRUE");
        $ic132$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArgInverse"));
        $ic133$ = makeString("Error initializing ~S:~% ~S~% Deregistering cache.");
        $ic134$ = makeString("TVA Caching ");
        $ic135$ = makeString(" ");
        $ic136$ = makeString(" assertions...");
        $ic137$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance"));
        $ic138$ = makeSymbol("S#24361", "CYC");
        $ic139$ = makeInteger(25);
        $ic140$ = makeSymbol("S#24411", "CYC");
        $ic141$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic142$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceAll"));
        $ic144$ = makeKeyword("COMPLEX");
        $ic145$ = makeString("Complex TVA cache support in ~S");
        $ic146$ = (SubLList)ConsesLow.cons((SubLObject)makeKeyword("COMPLEX"), (SubLObject)makeKeyword("ANYTHING"));
        $ic147$ = ConsesLow.list((SubLObject)makeSymbol("S#24430", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic148$ = makeSymbol("INDEXED-TERM-P");
        $ic149$ = makeKeyword("TOP");
        $ic150$ = makeKeyword("TRUE-DEF");
        $ic151$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#155", "CYC")), constant_handles_oc.f8479((SubLObject)makeString("TransitiveBinaryPredicate")));
        $ic152$ = makeSymbol("S#155", "CYC");
        $ic153$ = makeString("Don't know how to find the transitive predicate from~% ~S");
        $ic154$ = ConsesLow.list((SubLObject)makeKeyword("SPEC-PRED"), (SubLObject)makeKeyword("INVERSE"));
        $ic155$ = makeString("Can't get transitivity support from ~S");
        $ic156$ = makeSymbol("S#24345", "CYC");
        $ic157$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic158$ = constant_handles_oc.f8479((SubLObject)makeString("TransitiveBinaryPredicate"));
        $ic159$ = makeInteger(96);
        $ic160$ = makeSymbol("S#24397", "CYC");
        $ic161$ = makeSymbol("S#24395", "CYC");
        $ic162$ = makeString("tva-cache-contents");
        $ic163$ = makeString("tva-cache-contents-index");
        $ic164$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#24431", "CYC"));
        $ic165$ = makeString("Reconnecting to legacy unit files w/out TVA cache contents in ~A and ~A.");
        $ic166$ = makeSymbol("S#24402", "CYC");
        $ic167$ = ConsesLow.list((SubLObject)makeSymbol("S#24401", "CYC"));
    }
    
    public static final class $sX24287_native extends SubLStructNative
    {
        public SubLObject $pred;
        public SubLObject $index_argnum;
        public SubLObject $tva_pred_gafs;
        public SubLObject $tvai_pred_gafs;
        public SubLObject $map;
        public static final SubLStructDeclNative structDecl;
        
        public $sX24287_native() {
            this.$pred = (SubLObject)CommonSymbols.NIL;
            this.$index_argnum = (SubLObject)CommonSymbols.NIL;
            this.$tva_pred_gafs = (SubLObject)CommonSymbols.NIL;
            this.$tvai_pred_gafs = (SubLObject)CommonSymbols.NIL;
            this.$map = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$pred;
        }
        
        public SubLObject getField3() {
            return this.$index_argnum;
        }
        
        public SubLObject getField4() {
            return this.$tva_pred_gafs;
        }
        
        public SubLObject getField5() {
            return this.$tvai_pred_gafs;
        }
        
        public SubLObject getField6() {
            return this.$map;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$pred = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$index_argnum = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$tva_pred_gafs = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$tvai_pred_gafs = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$map = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX24287_native.class, $ic21$, $ic22$, $ic23$, $ic24$, new String[] { "$pred", "$index_argnum", "$tva_pred_gafs", "$tvai_pred_gafs", "$map" }, $ic25$, $ic26$, $ic27$);
        }
    }
    
    public static final class $f21727$UnaryFunction extends UnaryFunction
    {
        public $f21727$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24288"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f21727(var75);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 7863 ms
	
	Decompiled with Procyon 0.5.32.
*/