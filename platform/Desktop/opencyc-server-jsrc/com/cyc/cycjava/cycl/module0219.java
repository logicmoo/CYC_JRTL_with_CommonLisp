package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0219 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0219";
    public static final String myFingerPrint = "2ca25af84594d0e4aed94e8053f1f2bce0ec688f7b2092f987a4245d9ef2c273";
    private static SubLSymbol $g2394$;
    private static SubLSymbol $g2395$;
    private static SubLSymbol $g2396$;
    private static SubLSymbol $g2397$;
    private static SubLSymbol $g2398$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLString $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLString $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    
    public static SubLObject f14473(final SubLObject var1, final SubLObject var2) {
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
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(var9, var6, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var9), ConsesLow.append(var8, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14474(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic6$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(var9, var6, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic7$, var9), ConsesLow.append(var8, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14475(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic9$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(var10, var6, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var8), (SubLObject)ConsesLow.list((SubLObject)EQ, var10, var8)), ConsesLow.append(var9, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14476(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic12$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic12$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic12$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic12$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var6, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, var6, var8), ConsesLow.append(var9, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14477(final SubLObject var27, final SubLObject var28, final SubLObject var29, SubLObject var9, SubLObject var26, SubLObject var14) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var30 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        assert NIL != module0004.f105(var29) : var29;
        SubLObject var31 = (SubLObject)NIL;
        try {
            var30.throwStack.push($ic17$);
            final SubLObject var32 = var14;
            final SubLObject var33 = module0147.$g2094$.currentBinding(var30);
            final SubLObject var34 = module0147.$g2095$.currentBinding(var30);
            try {
                module0147.$g2094$.bind(module0147.f9536(var32), var30);
                module0147.$g2095$.bind(module0147.f9537(var32), var30);
                if (NIL != var9 && NIL != var26) {
                    final SubLObject var35 = var9;
                    if (NIL != module0158.f10010(var28, var29, var35)) {
                        final SubLObject var36 = module0158.f10011(var28, var29, var35);
                        SubLObject var37 = (SubLObject)NIL;
                        final SubLObject var38 = (SubLObject)NIL;
                        while (NIL == var37) {
                            final SubLObject var39 = module0052.f3695(var36, var38);
                            final SubLObject var40 = (SubLObject)makeBoolean(!var38.eql(var39));
                            if (NIL != var40) {
                                SubLObject var41 = (SubLObject)NIL;
                                try {
                                    var41 = module0158.f10316(var39, (SubLObject)$ic18$, var26, (SubLObject)NIL);
                                    SubLObject var37_42 = (SubLObject)NIL;
                                    final SubLObject var38_43 = (SubLObject)NIL;
                                    while (NIL == var37_42) {
                                        final SubLObject var42 = module0052.f3695(var41, var38_43);
                                        final SubLObject var40_44 = (SubLObject)makeBoolean(!var38_43.eql(var42));
                                        if (NIL != var40_44) {
                                            Functions.funcall(var27, var42);
                                        }
                                        var37_42 = (SubLObject)makeBoolean(NIL == var40_44);
                                    }
                                }
                                finally {
                                    final SubLObject var33_45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var30);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var30);
                                        if (NIL != var41) {
                                            module0158.f10319(var41);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_45, var30);
                                    }
                                }
                            }
                            var37 = (SubLObject)makeBoolean(NIL == var40);
                        }
                    }
                }
                else if (NIL != var9 && NIL == var26) {
                    final SubLObject var35 = var9;
                    if (NIL != module0158.f10010(var28, var29, var35)) {
                        final SubLObject var36 = module0158.f10011(var28, var29, var35);
                        SubLObject var37 = (SubLObject)NIL;
                        final SubLObject var38 = (SubLObject)NIL;
                        while (NIL == var37) {
                            final SubLObject var39 = module0052.f3695(var36, var38);
                            final SubLObject var40 = (SubLObject)makeBoolean(!var38.eql(var39));
                            if (NIL != var40) {
                                SubLObject var41 = (SubLObject)NIL;
                                try {
                                    var41 = module0158.f10316(var39, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var37_43 = (SubLObject)NIL;
                                    final SubLObject var38_44 = (SubLObject)NIL;
                                    while (NIL == var37_43) {
                                        final SubLObject var42 = module0052.f3695(var41, var38_44);
                                        final SubLObject var40_45 = (SubLObject)makeBoolean(!var38_44.eql(var42));
                                        if (NIL != var40_45) {
                                            Functions.funcall(var27, var42);
                                        }
                                        var37_43 = (SubLObject)makeBoolean(NIL == var40_45);
                                    }
                                }
                                finally {
                                    final SubLObject var33_46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var30);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var30);
                                        if (NIL != var41) {
                                            module0158.f10319(var41);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_46, var30);
                                    }
                                }
                            }
                            var37 = (SubLObject)makeBoolean(NIL == var40);
                        }
                    }
                }
                else if (NIL == var9 && NIL != var26) {
                    final SubLObject var35 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var28, var29, var35)) {
                        final SubLObject var36 = module0158.f10011(var28, var29, var35);
                        SubLObject var37 = (SubLObject)NIL;
                        final SubLObject var38 = (SubLObject)NIL;
                        while (NIL == var37) {
                            final SubLObject var39 = module0052.f3695(var36, var38);
                            final SubLObject var40 = (SubLObject)makeBoolean(!var38.eql(var39));
                            if (NIL != var40) {
                                SubLObject var41 = (SubLObject)NIL;
                                try {
                                    var41 = module0158.f10316(var39, (SubLObject)$ic18$, var26, (SubLObject)NIL);
                                    SubLObject var37_44 = (SubLObject)NIL;
                                    final SubLObject var38_45 = (SubLObject)NIL;
                                    while (NIL == var37_44) {
                                        final SubLObject var42 = module0052.f3695(var41, var38_45);
                                        final SubLObject var40_46 = (SubLObject)makeBoolean(!var38_45.eql(var42));
                                        if (NIL != var40_46) {
                                            Functions.funcall(var27, var42);
                                        }
                                        var37_44 = (SubLObject)makeBoolean(NIL == var40_46);
                                    }
                                }
                                finally {
                                    final SubLObject var33_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var30);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var30);
                                        if (NIL != var41) {
                                            module0158.f10319(var41);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_47, var30);
                                    }
                                }
                            }
                            var37 = (SubLObject)makeBoolean(NIL == var40);
                        }
                    }
                }
                else if (NIL == var9 && NIL == var26) {
                    final SubLObject var35 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var28, var29, var35)) {
                        final SubLObject var36 = module0158.f10011(var28, var29, var35);
                        SubLObject var37 = (SubLObject)NIL;
                        final SubLObject var38 = (SubLObject)NIL;
                        while (NIL == var37) {
                            final SubLObject var39 = module0052.f3695(var36, var38);
                            final SubLObject var40 = (SubLObject)makeBoolean(!var38.eql(var39));
                            if (NIL != var40) {
                                SubLObject var41 = (SubLObject)NIL;
                                try {
                                    var41 = module0158.f10316(var39, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var37_45 = (SubLObject)NIL;
                                    final SubLObject var38_46 = (SubLObject)NIL;
                                    while (NIL == var37_45) {
                                        final SubLObject var42 = module0052.f3695(var41, var38_46);
                                        final SubLObject var40_47 = (SubLObject)makeBoolean(!var38_46.eql(var42));
                                        if (NIL != var40_47) {
                                            Functions.funcall(var27, var42);
                                        }
                                        var37_45 = (SubLObject)makeBoolean(NIL == var40_47);
                                    }
                                }
                                finally {
                                    final SubLObject var33_48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var30);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var30);
                                        if (NIL != var41) {
                                            module0158.f10319(var41);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_48, var30);
                                    }
                                }
                            }
                            var37 = (SubLObject)makeBoolean(NIL == var40);
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var34, var30);
                module0147.$g2094$.rebind(var33, var30);
            }
        }
        catch (Throwable var43) {
            var31 = Errors.handleThrowable(var43, (SubLObject)$ic17$);
        }
        finally {
            var30.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14478(final SubLObject var27, final SubLObject var9, SubLObject var26, SubLObject var14) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        SubLObject var29 = (SubLObject)NIL;
        try {
            var28.throwStack.push($ic17$);
            final SubLObject var30 = var14;
            final SubLObject var31 = module0147.$g2094$.currentBinding(var28);
            final SubLObject var32 = module0147.$g2095$.currentBinding(var28);
            try {
                module0147.$g2094$.bind(module0147.f9536(var30), var28);
                module0147.$g2095$.bind(module0147.f9537(var30), var28);
                if (NIL != var26) {
                    if (NIL != module0158.f10038(var9)) {
                        final SubLObject var33 = (SubLObject)NIL;
                        final SubLObject var33_61 = module0012.$g73$.currentBinding(var28);
                        final SubLObject var34_62 = module0012.$g65$.currentBinding(var28);
                        final SubLObject var34 = module0012.$g67$.currentBinding(var28);
                        final SubLObject var35 = module0012.$g68$.currentBinding(var28);
                        final SubLObject var36 = module0012.$g66$.currentBinding(var28);
                        final SubLObject var37 = module0012.$g69$.currentBinding(var28);
                        final SubLObject var38 = module0012.$g70$.currentBinding(var28);
                        final SubLObject var39 = module0012.$silent_progressP$.currentBinding(var28);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var28);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var28), var28);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var28);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var28);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var28);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var28);
                            module0012.$g70$.bind((SubLObject)T, var28);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var33) ? module0012.$silent_progressP$.getDynamicValue(var28) : T), var28);
                            module0012.f474(var33);
                            final SubLObject var40 = module0158.f10039(var9);
                            SubLObject var41 = (SubLObject)NIL;
                            final SubLObject var42 = (SubLObject)NIL;
                            while (NIL == var41) {
                                final SubLObject var43 = module0052.f3695(var40, var42);
                                final SubLObject var44 = (SubLObject)makeBoolean(!var42.eql(var43));
                                if (NIL != var44) {
                                    module0012.f476();
                                    SubLObject var45 = (SubLObject)NIL;
                                    try {
                                        var45 = module0158.f10316(var43, (SubLObject)$ic18$, var26, (SubLObject)NIL);
                                        SubLObject var37_70 = (SubLObject)NIL;
                                        final SubLObject var38_71 = (SubLObject)NIL;
                                        while (NIL == var37_70) {
                                            final SubLObject var46 = module0052.f3695(var45, var38_71);
                                            final SubLObject var40_72 = (SubLObject)makeBoolean(!var38_71.eql(var46));
                                            if (NIL != var40_72) {
                                                Functions.funcall(var27, var46);
                                            }
                                            var37_70 = (SubLObject)makeBoolean(NIL == var40_72);
                                        }
                                    }
                                    finally {
                                        final SubLObject var33_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var28);
                                            if (NIL != var45) {
                                                module0158.f10319(var45);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var33_62, var28);
                                        }
                                    }
                                }
                                var41 = (SubLObject)makeBoolean(NIL == var44);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var39, var28);
                            module0012.$g70$.rebind(var38, var28);
                            module0012.$g69$.rebind(var37, var28);
                            module0012.$g66$.rebind(var36, var28);
                            module0012.$g68$.rebind(var35, var28);
                            module0012.$g67$.rebind(var34, var28);
                            module0012.$g65$.rebind(var34_62, var28);
                            module0012.$g73$.rebind(var33_61, var28);
                        }
                    }
                }
                else if (NIL != module0158.f10038(var9)) {
                    final SubLObject var33 = (SubLObject)NIL;
                    final SubLObject var33_63 = module0012.$g73$.currentBinding(var28);
                    final SubLObject var34_63 = module0012.$g65$.currentBinding(var28);
                    final SubLObject var34 = module0012.$g67$.currentBinding(var28);
                    final SubLObject var35 = module0012.$g68$.currentBinding(var28);
                    final SubLObject var36 = module0012.$g66$.currentBinding(var28);
                    final SubLObject var37 = module0012.$g69$.currentBinding(var28);
                    final SubLObject var38 = module0012.$g70$.currentBinding(var28);
                    final SubLObject var39 = module0012.$silent_progressP$.currentBinding(var28);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var28);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var28), var28);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var28);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var28);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var28);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var28);
                        module0012.$g70$.bind((SubLObject)T, var28);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var33) ? module0012.$silent_progressP$.getDynamicValue(var28) : T), var28);
                        module0012.f474(var33);
                        final SubLObject var40 = module0158.f10039(var9);
                        SubLObject var41 = (SubLObject)NIL;
                        final SubLObject var42 = (SubLObject)NIL;
                        while (NIL == var41) {
                            final SubLObject var43 = module0052.f3695(var40, var42);
                            final SubLObject var44 = (SubLObject)makeBoolean(!var42.eql(var43));
                            if (NIL != var44) {
                                module0012.f476();
                                SubLObject var45 = (SubLObject)NIL;
                                try {
                                    var45 = module0158.f10316(var43, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var37_71 = (SubLObject)NIL;
                                    final SubLObject var38_72 = (SubLObject)NIL;
                                    while (NIL == var37_71) {
                                        final SubLObject var46 = module0052.f3695(var45, var38_72);
                                        final SubLObject var40_73 = (SubLObject)makeBoolean(!var38_72.eql(var46));
                                        if (NIL != var40_73) {
                                            Functions.funcall(var27, var46);
                                        }
                                        var37_71 = (SubLObject)makeBoolean(NIL == var40_73);
                                    }
                                }
                                finally {
                                    final SubLObject var33_64 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var28);
                                        if (NIL != var45) {
                                            module0158.f10319(var45);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_64, var28);
                                    }
                                }
                            }
                            var41 = (SubLObject)makeBoolean(NIL == var44);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var39, var28);
                        module0012.$g70$.rebind(var38, var28);
                        module0012.$g69$.rebind(var37, var28);
                        module0012.$g66$.rebind(var36, var28);
                        module0012.$g68$.rebind(var35, var28);
                        module0012.$g67$.rebind(var34, var28);
                        module0012.$g65$.rebind(var34_63, var28);
                        module0012.$g73$.rebind(var33_63, var28);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var32, var28);
                module0147.$g2094$.rebind(var31, var28);
            }
        }
        catch (Throwable var47) {
            var29 = Errors.handleThrowable(var47, (SubLObject)$ic17$);
        }
        finally {
            var28.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14479(final SubLObject var80, final SubLObject var28, SubLObject var29, SubLObject var81) {
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)NIL;
        }
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)NIL;
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var80) : var80;
        SubLObject var83 = (SubLObject)NIL;
        try {
            var82.throwStack.push($ic17$);
            if (NIL != var29 && NIL != var81) {
                if (NIL != module0158.f10054(var28, var29, var81)) {
                    final SubLObject var84 = module0158.f10055(var28, var29, var81);
                    SubLObject var85 = (SubLObject)NIL;
                    final SubLObject var86 = (SubLObject)NIL;
                    while (NIL == var85) {
                        final SubLObject var87 = module0052.f3695(var84, var86);
                        final SubLObject var88 = (SubLObject)makeBoolean(!var86.eql(var87));
                        if (NIL != var88) {
                            SubLObject var89 = (SubLObject)NIL;
                            try {
                                var89 = module0158.f10316(var87, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_83 = (SubLObject)NIL;
                                final SubLObject var38_84 = (SubLObject)NIL;
                                while (NIL == var37_83) {
                                    final SubLObject var90 = module0052.f3695(var89, var38_84);
                                    final SubLObject var40_85 = (SubLObject)makeBoolean(!var38_84.eql(var90));
                                    if (NIL != var40_85) {
                                        Functions.funcall(var80, var90);
                                    }
                                    var37_83 = (SubLObject)makeBoolean(NIL == var40_85);
                                }
                            }
                            finally {
                                final SubLObject var91 = Threads.$is_thread_performing_cleanupP$.currentBinding(var82);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var82);
                                    if (NIL != var89) {
                                        module0158.f10319(var89);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var91, var82);
                                }
                            }
                        }
                        var85 = (SubLObject)makeBoolean(NIL == var88);
                    }
                }
            }
            else if (NIL != var29 && NIL == var81) {
                if (NIL != module0158.f10054(var28, var29, (SubLObject)NIL)) {
                    final SubLObject var84 = module0158.f10055(var28, var29, (SubLObject)NIL);
                    SubLObject var85 = (SubLObject)NIL;
                    final SubLObject var86 = (SubLObject)NIL;
                    while (NIL == var85) {
                        final SubLObject var87 = module0052.f3695(var84, var86);
                        final SubLObject var88 = (SubLObject)makeBoolean(!var86.eql(var87));
                        if (NIL != var88) {
                            SubLObject var89 = (SubLObject)NIL;
                            try {
                                var89 = module0158.f10316(var87, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_84 = (SubLObject)NIL;
                                final SubLObject var38_85 = (SubLObject)NIL;
                                while (NIL == var37_84) {
                                    final SubLObject var90 = module0052.f3695(var89, var38_85);
                                    final SubLObject var40_86 = (SubLObject)makeBoolean(!var38_85.eql(var90));
                                    if (NIL != var40_86) {
                                        Functions.funcall(var80, var90);
                                    }
                                    var37_84 = (SubLObject)makeBoolean(NIL == var40_86);
                                }
                            }
                            finally {
                                final SubLObject var92 = Threads.$is_thread_performing_cleanupP$.currentBinding(var82);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var82);
                                    if (NIL != var89) {
                                        module0158.f10319(var89);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var92, var82);
                                }
                            }
                        }
                        var85 = (SubLObject)makeBoolean(NIL == var88);
                    }
                }
            }
            else if (NIL == var29 && NIL != var81) {
                if (NIL != module0158.f10054(var28, (SubLObject)NIL, var81)) {
                    final SubLObject var84 = module0158.f10055(var28, (SubLObject)NIL, var81);
                    SubLObject var85 = (SubLObject)NIL;
                    final SubLObject var86 = (SubLObject)NIL;
                    while (NIL == var85) {
                        final SubLObject var87 = module0052.f3695(var84, var86);
                        final SubLObject var88 = (SubLObject)makeBoolean(!var86.eql(var87));
                        if (NIL != var88) {
                            SubLObject var89 = (SubLObject)NIL;
                            try {
                                var89 = module0158.f10316(var87, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_85 = (SubLObject)NIL;
                                final SubLObject var38_86 = (SubLObject)NIL;
                                while (NIL == var37_85) {
                                    final SubLObject var90 = module0052.f3695(var89, var38_86);
                                    final SubLObject var40_87 = (SubLObject)makeBoolean(!var38_86.eql(var90));
                                    if (NIL != var40_87) {
                                        Functions.funcall(var80, var90);
                                    }
                                    var37_85 = (SubLObject)makeBoolean(NIL == var40_87);
                                }
                            }
                            finally {
                                final SubLObject var93 = Threads.$is_thread_performing_cleanupP$.currentBinding(var82);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var82);
                                    if (NIL != var89) {
                                        module0158.f10319(var89);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var93, var82);
                                }
                            }
                        }
                        var85 = (SubLObject)makeBoolean(NIL == var88);
                    }
                }
            }
            else if (NIL == var29 && NIL == var81 && NIL != module0158.f10054(var28, (SubLObject)NIL, (SubLObject)NIL)) {
                final SubLObject var84 = module0158.f10055(var28, (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var85 = (SubLObject)NIL;
                final SubLObject var86 = (SubLObject)NIL;
                while (NIL == var85) {
                    final SubLObject var87 = module0052.f3695(var84, var86);
                    final SubLObject var88 = (SubLObject)makeBoolean(!var86.eql(var87));
                    if (NIL != var88) {
                        SubLObject var89 = (SubLObject)NIL;
                        try {
                            var89 = module0158.f10316(var87, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_86 = (SubLObject)NIL;
                            final SubLObject var38_87 = (SubLObject)NIL;
                            while (NIL == var37_86) {
                                final SubLObject var90 = module0052.f3695(var89, var38_87);
                                final SubLObject var40_88 = (SubLObject)makeBoolean(!var38_87.eql(var90));
                                if (NIL != var40_88) {
                                    Functions.funcall(var80, var90);
                                }
                                var37_86 = (SubLObject)makeBoolean(NIL == var40_88);
                            }
                        }
                        finally {
                            final SubLObject var94 = Threads.$is_thread_performing_cleanupP$.currentBinding(var82);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var82);
                                if (NIL != var89) {
                                    module0158.f10319(var89);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var94, var82);
                            }
                        }
                    }
                    var85 = (SubLObject)makeBoolean(NIL == var88);
                }
            }
        }
        catch (Throwable var95) {
            var83 = Errors.handleThrowable(var95, (SubLObject)$ic17$);
        }
        finally {
            var82.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14480(final SubLObject var80, final SubLObject var81) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var80) : var80;
        SubLObject var83 = (SubLObject)NIL;
        try {
            var82.throwStack.push($ic17$);
            if (NIL != module0158.f10078(var81)) {
                final SubLObject var84 = module0158.f10080(var81);
                SubLObject var85 = (SubLObject)NIL;
                try {
                    var85 = module0158.f10316(var84, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var86 = (SubLObject)NIL;
                    final SubLObject var87 = (SubLObject)NIL;
                    while (NIL == var86) {
                        final SubLObject var88 = module0052.f3695(var85, var87);
                        final SubLObject var89 = (SubLObject)makeBoolean(!var87.eql(var88));
                        if (NIL != var89) {
                            Functions.funcall(var80, var88);
                        }
                        var86 = (SubLObject)makeBoolean(NIL == var89);
                    }
                }
                finally {
                    final SubLObject var90 = Threads.$is_thread_performing_cleanupP$.currentBinding(var82);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var82);
                        if (NIL != var85) {
                            module0158.f10319(var85);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var90, var82);
                    }
                }
            }
        }
        catch (Throwable var91) {
            var83 = Errors.handleThrowable(var91, (SubLObject)$ic17$);
        }
        finally {
            var82.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14481(final SubLObject var27, final SubLObject var9, final SubLObject var96, SubLObject var19, SubLObject var14) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var97 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var98 = (SubLObject)NIL;
        try {
            var97.throwStack.push($ic17$);
            final SubLObject var99 = var14;
            final SubLObject var100 = module0147.$g2094$.currentBinding(var97);
            final SubLObject var101 = module0147.$g2095$.currentBinding(var97);
            try {
                module0147.$g2094$.bind(module0147.f9536(var99), var97);
                module0147.$g2095$.bind(module0147.f9537(var99), var97);
                if (NIL != var19) {
                    if (NIL != module0158.f10084(var9, var96, var19)) {
                        final SubLObject var102 = module0158.f10085(var9, var96, var19);
                        SubLObject var103 = (SubLObject)NIL;
                        final SubLObject var104 = (SubLObject)NIL;
                        while (NIL == var103) {
                            final SubLObject var105 = module0052.f3695(var102, var104);
                            final SubLObject var106 = (SubLObject)makeBoolean(!var104.eql(var105));
                            if (NIL != var106) {
                                SubLObject var107 = (SubLObject)NIL;
                                try {
                                    var107 = module0158.f10316(var105, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                    SubLObject var37_98 = (SubLObject)NIL;
                                    final SubLObject var38_99 = (SubLObject)NIL;
                                    while (NIL == var37_98) {
                                        final SubLObject var108 = module0052.f3695(var107, var38_99);
                                        final SubLObject var40_100 = (SubLObject)makeBoolean(!var38_99.eql(var108));
                                        if (NIL != var40_100) {
                                            Functions.funcall(var27, var108);
                                        }
                                        var37_98 = (SubLObject)makeBoolean(NIL == var40_100);
                                    }
                                }
                                finally {
                                    final SubLObject var33_101 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                                        if (NIL != var107) {
                                            module0158.f10319(var107);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_101, var97);
                                    }
                                }
                            }
                            var103 = (SubLObject)makeBoolean(NIL == var106);
                        }
                    }
                }
                else if (NIL != module0158.f10084(var9, var96, (SubLObject)NIL)) {
                    final SubLObject var102 = module0158.f10085(var9, var96, (SubLObject)NIL);
                    SubLObject var103 = (SubLObject)NIL;
                    final SubLObject var104 = (SubLObject)NIL;
                    while (NIL == var103) {
                        final SubLObject var105 = module0052.f3695(var102, var104);
                        final SubLObject var106 = (SubLObject)makeBoolean(!var104.eql(var105));
                        if (NIL != var106) {
                            SubLObject var107 = (SubLObject)NIL;
                            try {
                                var107 = module0158.f10316(var105, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_99 = (SubLObject)NIL;
                                final SubLObject var38_100 = (SubLObject)NIL;
                                while (NIL == var37_99) {
                                    final SubLObject var108 = module0052.f3695(var107, var38_100);
                                    final SubLObject var40_101 = (SubLObject)makeBoolean(!var38_100.eql(var108));
                                    if (NIL != var40_101) {
                                        Functions.funcall(var27, var108);
                                    }
                                    var37_99 = (SubLObject)makeBoolean(NIL == var40_101);
                                }
                            }
                            finally {
                                final SubLObject var33_102 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                                    if (NIL != var107) {
                                        module0158.f10319(var107);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_102, var97);
                                }
                            }
                        }
                        var103 = (SubLObject)makeBoolean(NIL == var106);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var101, var97);
                module0147.$g2094$.rebind(var100, var97);
            }
        }
        catch (Throwable var109) {
            var98 = Errors.handleThrowable(var109, (SubLObject)$ic17$);
        }
        finally {
            var97.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14482(final SubLObject var27, final SubLObject var9, final SubLObject var96, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var97 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var98 = (SubLObject)NIL;
        try {
            var97.throwStack.push($ic17$);
            if (NIL != var19) {
                if (NIL != module0158.f10112(var9, var96, var19)) {
                    final SubLObject var99 = module0158.f10113(var9, var96, var19);
                    SubLObject var100 = (SubLObject)NIL;
                    final SubLObject var101 = (SubLObject)NIL;
                    while (NIL == var100) {
                        final SubLObject var102 = module0052.f3695(var99, var101);
                        final SubLObject var103 = (SubLObject)makeBoolean(!var101.eql(var102));
                        if (NIL != var103) {
                            SubLObject var104 = (SubLObject)NIL;
                            try {
                                var104 = module0158.f10316(var102, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_107 = (SubLObject)NIL;
                                final SubLObject var38_108 = (SubLObject)NIL;
                                while (NIL == var37_107) {
                                    final SubLObject var105 = module0052.f3695(var104, var38_108);
                                    final SubLObject var40_109 = (SubLObject)makeBoolean(!var38_108.eql(var105));
                                    if (NIL != var40_109) {
                                        Functions.funcall(var27, var105);
                                    }
                                    var37_107 = (SubLObject)makeBoolean(NIL == var40_109);
                                }
                            }
                            finally {
                                final SubLObject var106 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                                    if (NIL != var104) {
                                        module0158.f10319(var104);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var106, var97);
                                }
                            }
                        }
                        var100 = (SubLObject)makeBoolean(NIL == var103);
                    }
                }
            }
            else if (NIL != module0158.f10112(var9, var96, (SubLObject)NIL)) {
                final SubLObject var99 = module0158.f10113(var9, var96, (SubLObject)NIL);
                SubLObject var100 = (SubLObject)NIL;
                final SubLObject var101 = (SubLObject)NIL;
                while (NIL == var100) {
                    final SubLObject var102 = module0052.f3695(var99, var101);
                    final SubLObject var103 = (SubLObject)makeBoolean(!var101.eql(var102));
                    if (NIL != var103) {
                        SubLObject var104 = (SubLObject)NIL;
                        try {
                            var104 = module0158.f10316(var102, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_108 = (SubLObject)NIL;
                            final SubLObject var38_109 = (SubLObject)NIL;
                            while (NIL == var37_108) {
                                final SubLObject var105 = module0052.f3695(var104, var38_109);
                                final SubLObject var40_110 = (SubLObject)makeBoolean(!var38_109.eql(var105));
                                if (NIL != var40_110) {
                                    Functions.funcall(var27, var105);
                                }
                                var37_108 = (SubLObject)makeBoolean(NIL == var40_110);
                            }
                        }
                        finally {
                            final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                                if (NIL != var104) {
                                    module0158.f10319(var104);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var107, var97);
                            }
                        }
                    }
                    var100 = (SubLObject)makeBoolean(NIL == var103);
                }
            }
        }
        catch (Throwable var108) {
            var98 = Errors.handleThrowable(var108, (SubLObject)$ic17$);
        }
        finally {
            var97.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14483(final SubLObject var27, final SubLObject var113, final SubLObject var96, SubLObject var19, SubLObject var14) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var115 = (SubLObject)NIL;
        try {
            var114.throwStack.push($ic17$);
            final SubLObject var116 = var14;
            final SubLObject var117 = module0147.$g2094$.currentBinding(var114);
            final SubLObject var118 = module0147.$g2095$.currentBinding(var114);
            try {
                module0147.$g2094$.bind(module0147.f9536(var116), var114);
                module0147.$g2095$.bind(module0147.f9537(var116), var114);
                if (NIL != var19) {
                    if (NIL != module0158.f10135(var113, var96, var19)) {
                        final SubLObject var119 = module0158.f10137(var113, var96, var19);
                        SubLObject var120 = (SubLObject)NIL;
                        final SubLObject var121 = (SubLObject)NIL;
                        while (NIL == var120) {
                            final SubLObject var122 = module0052.f3695(var119, var121);
                            final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                            if (NIL != var123) {
                                SubLObject var124 = (SubLObject)NIL;
                                try {
                                    var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                    SubLObject var37_115 = (SubLObject)NIL;
                                    final SubLObject var38_116 = (SubLObject)NIL;
                                    while (NIL == var37_115) {
                                        final SubLObject var125 = module0052.f3695(var124, var38_116);
                                        final SubLObject var40_117 = (SubLObject)makeBoolean(!var38_116.eql(var125));
                                        if (NIL != var40_117) {
                                            Functions.funcall(var27, var125);
                                        }
                                        var37_115 = (SubLObject)makeBoolean(NIL == var40_117);
                                    }
                                }
                                finally {
                                    final SubLObject var33_118 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                        if (NIL != var124) {
                                            module0158.f10319(var124);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_118, var114);
                                    }
                                }
                            }
                            var120 = (SubLObject)makeBoolean(NIL == var123);
                        }
                    }
                }
                else if (NIL != module0158.f10135(var113, var96, (SubLObject)NIL)) {
                    final SubLObject var119 = module0158.f10137(var113, var96, (SubLObject)NIL);
                    SubLObject var120 = (SubLObject)NIL;
                    final SubLObject var121 = (SubLObject)NIL;
                    while (NIL == var120) {
                        final SubLObject var122 = module0052.f3695(var119, var121);
                        final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                        if (NIL != var123) {
                            SubLObject var124 = (SubLObject)NIL;
                            try {
                                var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_116 = (SubLObject)NIL;
                                final SubLObject var38_117 = (SubLObject)NIL;
                                while (NIL == var37_116) {
                                    final SubLObject var125 = module0052.f3695(var124, var38_117);
                                    final SubLObject var40_118 = (SubLObject)makeBoolean(!var38_117.eql(var125));
                                    if (NIL != var40_118) {
                                        Functions.funcall(var27, var125);
                                    }
                                    var37_116 = (SubLObject)makeBoolean(NIL == var40_118);
                                }
                            }
                            finally {
                                final SubLObject var33_119 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                    if (NIL != var124) {
                                        module0158.f10319(var124);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_119, var114);
                                }
                            }
                        }
                        var120 = (SubLObject)makeBoolean(NIL == var123);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var118, var114);
                module0147.$g2094$.rebind(var117, var114);
            }
        }
        catch (Throwable var126) {
            var115 = Errors.handleThrowable(var126, (SubLObject)$ic17$);
        }
        finally {
            var114.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14484(final SubLObject var27, final SubLObject var113, final SubLObject var96, SubLObject var19, SubLObject var14) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var115 = (SubLObject)NIL;
        try {
            var114.throwStack.push($ic17$);
            final SubLObject var116 = var14;
            final SubLObject var117 = module0147.$g2094$.currentBinding(var114);
            final SubLObject var118 = module0147.$g2095$.currentBinding(var114);
            try {
                module0147.$g2094$.bind(module0147.f9536(var116), var114);
                module0147.$g2095$.bind(module0147.f9537(var116), var114);
                if (NIL != var19) {
                    if (NIL != module0158.f10140(var113, var96, var19)) {
                        final SubLObject var119 = module0158.f10141(var113, var96, var19);
                        SubLObject var120 = (SubLObject)NIL;
                        final SubLObject var121 = (SubLObject)NIL;
                        while (NIL == var120) {
                            final SubLObject var122 = module0052.f3695(var119, var121);
                            final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                            if (NIL != var123) {
                                SubLObject var124 = (SubLObject)NIL;
                                try {
                                    var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                    SubLObject var37_124 = (SubLObject)NIL;
                                    final SubLObject var38_125 = (SubLObject)NIL;
                                    while (NIL == var37_124) {
                                        final SubLObject var125 = module0052.f3695(var124, var38_125);
                                        final SubLObject var40_126 = (SubLObject)makeBoolean(!var38_125.eql(var125));
                                        if (NIL != var40_126) {
                                            Functions.funcall(var27, var125);
                                        }
                                        var37_124 = (SubLObject)makeBoolean(NIL == var40_126);
                                    }
                                }
                                finally {
                                    final SubLObject var33_127 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                        if (NIL != var124) {
                                            module0158.f10319(var124);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_127, var114);
                                    }
                                }
                            }
                            var120 = (SubLObject)makeBoolean(NIL == var123);
                        }
                    }
                }
                else if (NIL != module0158.f10140(var113, var96, (SubLObject)NIL)) {
                    final SubLObject var119 = module0158.f10141(var113, var96, (SubLObject)NIL);
                    SubLObject var120 = (SubLObject)NIL;
                    final SubLObject var121 = (SubLObject)NIL;
                    while (NIL == var120) {
                        final SubLObject var122 = module0052.f3695(var119, var121);
                        final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                        if (NIL != var123) {
                            SubLObject var124 = (SubLObject)NIL;
                            try {
                                var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_125 = (SubLObject)NIL;
                                final SubLObject var38_126 = (SubLObject)NIL;
                                while (NIL == var37_125) {
                                    final SubLObject var125 = module0052.f3695(var124, var38_126);
                                    final SubLObject var40_127 = (SubLObject)makeBoolean(!var38_126.eql(var125));
                                    if (NIL != var40_127) {
                                        Functions.funcall(var27, var125);
                                    }
                                    var37_125 = (SubLObject)makeBoolean(NIL == var40_127);
                                }
                            }
                            finally {
                                final SubLObject var33_128 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                    if (NIL != var124) {
                                        module0158.f10319(var124);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_128, var114);
                                }
                            }
                        }
                        var120 = (SubLObject)makeBoolean(NIL == var123);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var118, var114);
                module0147.$g2094$.rebind(var117, var114);
            }
        }
        catch (Throwable var126) {
            var115 = Errors.handleThrowable(var126, (SubLObject)$ic17$);
        }
        finally {
            var114.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14485(final SubLObject var27, final SubLObject var113, final SubLObject var96, SubLObject var19, SubLObject var14) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var115 = (SubLObject)NIL;
        try {
            var114.throwStack.push($ic17$);
            final SubLObject var116 = var14;
            final SubLObject var117 = module0147.$g2094$.currentBinding(var114);
            final SubLObject var118 = module0147.$g2095$.currentBinding(var114);
            try {
                module0147.$g2094$.bind(module0147.f9536(var116), var114);
                module0147.$g2095$.bind(module0147.f9537(var116), var114);
                if (NIL != var19) {
                    if (NIL != module0158.f10143(var113, var96, var19)) {
                        final SubLObject var119 = module0158.f10144(var113, var96, var19);
                        SubLObject var120 = (SubLObject)NIL;
                        final SubLObject var121 = (SubLObject)NIL;
                        while (NIL == var120) {
                            final SubLObject var122 = module0052.f3695(var119, var121);
                            final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                            if (NIL != var123) {
                                SubLObject var124 = (SubLObject)NIL;
                                try {
                                    var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                    SubLObject var37_133 = (SubLObject)NIL;
                                    final SubLObject var38_134 = (SubLObject)NIL;
                                    while (NIL == var37_133) {
                                        final SubLObject var125 = module0052.f3695(var124, var38_134);
                                        final SubLObject var40_135 = (SubLObject)makeBoolean(!var38_134.eql(var125));
                                        if (NIL != var40_135) {
                                            Functions.funcall(var27, var125);
                                        }
                                        var37_133 = (SubLObject)makeBoolean(NIL == var40_135);
                                    }
                                }
                                finally {
                                    final SubLObject var33_136 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                        if (NIL != var124) {
                                            module0158.f10319(var124);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_136, var114);
                                    }
                                }
                            }
                            var120 = (SubLObject)makeBoolean(NIL == var123);
                        }
                    }
                }
                else if (NIL != module0158.f10143(var113, var96, (SubLObject)NIL)) {
                    final SubLObject var119 = module0158.f10144(var113, var96, (SubLObject)NIL);
                    SubLObject var120 = (SubLObject)NIL;
                    final SubLObject var121 = (SubLObject)NIL;
                    while (NIL == var120) {
                        final SubLObject var122 = module0052.f3695(var119, var121);
                        final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                        if (NIL != var123) {
                            SubLObject var124 = (SubLObject)NIL;
                            try {
                                var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_134 = (SubLObject)NIL;
                                final SubLObject var38_135 = (SubLObject)NIL;
                                while (NIL == var37_134) {
                                    final SubLObject var125 = module0052.f3695(var124, var38_135);
                                    final SubLObject var40_136 = (SubLObject)makeBoolean(!var38_135.eql(var125));
                                    if (NIL != var40_136) {
                                        Functions.funcall(var27, var125);
                                    }
                                    var37_134 = (SubLObject)makeBoolean(NIL == var40_136);
                                }
                            }
                            finally {
                                final SubLObject var33_137 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                    if (NIL != var124) {
                                        module0158.f10319(var124);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_137, var114);
                                }
                            }
                        }
                        var120 = (SubLObject)makeBoolean(NIL == var123);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var118, var114);
                module0147.$g2094$.rebind(var117, var114);
            }
        }
        catch (Throwable var126) {
            var115 = Errors.handleThrowable(var126, (SubLObject)$ic17$);
        }
        finally {
            var114.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14486(final SubLObject var27, final SubLObject var141, final SubLObject var96, SubLObject var19, SubLObject var142) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var142 == UNPROVIDED) {
            var142 = (SubLObject)NIL;
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var144 = (SubLObject)NIL;
        try {
            var143.throwStack.push($ic17$);
            final SubLObject var145 = var142;
            final SubLObject var146 = module0147.$g2094$.currentBinding(var143);
            final SubLObject var147 = module0147.$g2095$.currentBinding(var143);
            try {
                module0147.$g2094$.bind(module0147.f9536(var145), var143);
                module0147.$g2095$.bind(module0147.f9537(var145), var143);
                if (NIL != var19) {
                    if (NIL != module0158.f10146(var141, var96, var19)) {
                        final SubLObject var148 = module0158.f10147(var141, var96, var19);
                        SubLObject var149 = (SubLObject)NIL;
                        final SubLObject var150 = (SubLObject)NIL;
                        while (NIL == var149) {
                            final SubLObject var151 = module0052.f3695(var148, var150);
                            final SubLObject var152 = (SubLObject)makeBoolean(!var150.eql(var151));
                            if (NIL != var152) {
                                SubLObject var153 = (SubLObject)NIL;
                                try {
                                    var153 = module0158.f10316(var151, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                    SubLObject var37_144 = (SubLObject)NIL;
                                    final SubLObject var38_145 = (SubLObject)NIL;
                                    while (NIL == var37_144) {
                                        final SubLObject var154 = module0052.f3695(var153, var38_145);
                                        final SubLObject var40_146 = (SubLObject)makeBoolean(!var38_145.eql(var154));
                                        if (NIL != var40_146) {
                                            Functions.funcall(var27, var154);
                                        }
                                        var37_144 = (SubLObject)makeBoolean(NIL == var40_146);
                                    }
                                }
                                finally {
                                    final SubLObject var33_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var143);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var143);
                                        if (NIL != var153) {
                                            module0158.f10319(var153);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_147, var143);
                                    }
                                }
                            }
                            var149 = (SubLObject)makeBoolean(NIL == var152);
                        }
                    }
                }
                else if (NIL != module0158.f10146(var141, var96, (SubLObject)NIL)) {
                    final SubLObject var148 = module0158.f10147(var141, var96, (SubLObject)NIL);
                    SubLObject var149 = (SubLObject)NIL;
                    final SubLObject var150 = (SubLObject)NIL;
                    while (NIL == var149) {
                        final SubLObject var151 = module0052.f3695(var148, var150);
                        final SubLObject var152 = (SubLObject)makeBoolean(!var150.eql(var151));
                        if (NIL != var152) {
                            SubLObject var153 = (SubLObject)NIL;
                            try {
                                var153 = module0158.f10316(var151, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_145 = (SubLObject)NIL;
                                final SubLObject var38_146 = (SubLObject)NIL;
                                while (NIL == var37_145) {
                                    final SubLObject var154 = module0052.f3695(var153, var38_146);
                                    final SubLObject var40_147 = (SubLObject)makeBoolean(!var38_146.eql(var154));
                                    if (NIL != var40_147) {
                                        Functions.funcall(var27, var154);
                                    }
                                    var37_145 = (SubLObject)makeBoolean(NIL == var40_147);
                                }
                            }
                            finally {
                                final SubLObject var33_148 = Threads.$is_thread_performing_cleanupP$.currentBinding(var143);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var143);
                                    if (NIL != var153) {
                                        module0158.f10319(var153);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_148, var143);
                                }
                            }
                        }
                        var149 = (SubLObject)makeBoolean(NIL == var152);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var147, var143);
                module0147.$g2094$.rebind(var146, var143);
            }
        }
        catch (Throwable var155) {
            var144 = Errors.handleThrowable(var155, (SubLObject)$ic17$);
        }
        finally {
            var143.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14487(final SubLObject var80, final SubLObject var81, SubLObject var19, SubLObject var14) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var80) : var80;
        SubLObject var83 = (SubLObject)NIL;
        try {
            var82.throwStack.push($ic17$);
            final SubLObject var84 = var14;
            final SubLObject var85 = module0147.$g2094$.currentBinding(var82);
            final SubLObject var86 = module0147.$g2095$.currentBinding(var82);
            try {
                module0147.$g2094$.bind(module0147.f9536(var84), var82);
                module0147.$g2095$.bind(module0147.f9537(var84), var82);
                if (NIL != var19) {
                    if (NIL != module0158.f10175(var81, var19)) {
                        final SubLObject var87 = module0158.f10176(var81, var19);
                        SubLObject var88 = (SubLObject)NIL;
                        final SubLObject var89 = (SubLObject)NIL;
                        while (NIL == var88) {
                            final SubLObject var90 = module0052.f3695(var87, var89);
                            final SubLObject var91 = (SubLObject)makeBoolean(!var89.eql(var90));
                            if (NIL != var91) {
                                SubLObject var92 = (SubLObject)NIL;
                                try {
                                    var92 = module0158.f10316(var90, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                    SubLObject var37_153 = (SubLObject)NIL;
                                    final SubLObject var38_154 = (SubLObject)NIL;
                                    while (NIL == var37_153) {
                                        final SubLObject var93 = module0052.f3695(var92, var38_154);
                                        final SubLObject var40_155 = (SubLObject)makeBoolean(!var38_154.eql(var93));
                                        if (NIL != var40_155) {
                                            Functions.funcall(var80, var93);
                                        }
                                        var37_153 = (SubLObject)makeBoolean(NIL == var40_155);
                                    }
                                }
                                finally {
                                    final SubLObject var33_156 = Threads.$is_thread_performing_cleanupP$.currentBinding(var82);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var82);
                                        if (NIL != var92) {
                                            module0158.f10319(var92);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_156, var82);
                                    }
                                }
                            }
                            var88 = (SubLObject)makeBoolean(NIL == var91);
                        }
                    }
                }
                else if (NIL != module0158.f10175(var81, (SubLObject)NIL)) {
                    final SubLObject var87 = module0158.f10176(var81, (SubLObject)NIL);
                    SubLObject var88 = (SubLObject)NIL;
                    final SubLObject var89 = (SubLObject)NIL;
                    while (NIL == var88) {
                        final SubLObject var90 = module0052.f3695(var87, var89);
                        final SubLObject var91 = (SubLObject)makeBoolean(!var89.eql(var90));
                        if (NIL != var91) {
                            SubLObject var92 = (SubLObject)NIL;
                            try {
                                var92 = module0158.f10316(var90, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_154 = (SubLObject)NIL;
                                final SubLObject var38_155 = (SubLObject)NIL;
                                while (NIL == var37_154) {
                                    final SubLObject var93 = module0052.f3695(var92, var38_155);
                                    final SubLObject var40_156 = (SubLObject)makeBoolean(!var38_155.eql(var93));
                                    if (NIL != var40_156) {
                                        Functions.funcall(var80, var93);
                                    }
                                    var37_154 = (SubLObject)makeBoolean(NIL == var40_156);
                                }
                            }
                            finally {
                                final SubLObject var33_157 = Threads.$is_thread_performing_cleanupP$.currentBinding(var82);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var82);
                                    if (NIL != var92) {
                                        module0158.f10319(var92);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_157, var82);
                                }
                            }
                        }
                        var88 = (SubLObject)makeBoolean(NIL == var91);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var86, var82);
                module0147.$g2094$.rebind(var85, var82);
            }
        }
        catch (Throwable var94) {
            var83 = Errors.handleThrowable(var94, (SubLObject)$ic17$);
        }
        finally {
            var82.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14488(final SubLObject var27, final SubLObject var161, SubLObject var19, SubLObject var14) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var162 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        SubLObject var163 = (SubLObject)NIL;
        try {
            var162.throwStack.push($ic17$);
            final SubLObject var164 = var14;
            final SubLObject var165 = module0147.$g2094$.currentBinding(var162);
            final SubLObject var166 = module0147.$g2095$.currentBinding(var162);
            try {
                module0147.$g2094$.bind(module0147.f9536(var164), var162);
                module0147.$g2095$.bind(module0147.f9537(var164), var162);
                if (NIL != var19) {
                    if (NIL != module0158.f10198(var161, var19)) {
                        final SubLObject var167 = module0158.f10199(var161, var19);
                        SubLObject var168 = (SubLObject)NIL;
                        final SubLObject var169 = (SubLObject)NIL;
                        while (NIL == var168) {
                            final SubLObject var170 = module0052.f3695(var167, var169);
                            final SubLObject var171 = (SubLObject)makeBoolean(!var169.eql(var170));
                            if (NIL != var171) {
                                SubLObject var172 = (SubLObject)NIL;
                                try {
                                    var172 = module0158.f10316(var170, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                    SubLObject var37_163 = (SubLObject)NIL;
                                    final SubLObject var38_164 = (SubLObject)NIL;
                                    while (NIL == var37_163) {
                                        final SubLObject var173 = module0052.f3695(var172, var38_164);
                                        final SubLObject var40_165 = (SubLObject)makeBoolean(!var38_164.eql(var173));
                                        if (NIL != var40_165) {
                                            Functions.funcall(var27, var173);
                                        }
                                        var37_163 = (SubLObject)makeBoolean(NIL == var40_165);
                                    }
                                }
                                finally {
                                    final SubLObject var33_166 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                                        if (NIL != var172) {
                                            module0158.f10319(var172);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_166, var162);
                                    }
                                }
                            }
                            var168 = (SubLObject)makeBoolean(NIL == var171);
                        }
                    }
                }
                else if (NIL != module0158.f10198(var161, (SubLObject)NIL)) {
                    final SubLObject var167 = module0158.f10199(var161, (SubLObject)NIL);
                    SubLObject var168 = (SubLObject)NIL;
                    final SubLObject var169 = (SubLObject)NIL;
                    while (NIL == var168) {
                        final SubLObject var170 = module0052.f3695(var167, var169);
                        final SubLObject var171 = (SubLObject)makeBoolean(!var169.eql(var170));
                        if (NIL != var171) {
                            SubLObject var172 = (SubLObject)NIL;
                            try {
                                var172 = module0158.f10316(var170, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_164 = (SubLObject)NIL;
                                final SubLObject var38_165 = (SubLObject)NIL;
                                while (NIL == var37_164) {
                                    final SubLObject var173 = module0052.f3695(var172, var38_165);
                                    final SubLObject var40_166 = (SubLObject)makeBoolean(!var38_165.eql(var173));
                                    if (NIL != var40_166) {
                                        Functions.funcall(var27, var173);
                                    }
                                    var37_164 = (SubLObject)makeBoolean(NIL == var40_166);
                                }
                            }
                            finally {
                                final SubLObject var33_167 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                                    if (NIL != var172) {
                                        module0158.f10319(var172);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_167, var162);
                                }
                            }
                        }
                        var168 = (SubLObject)makeBoolean(NIL == var171);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var166, var162);
                module0147.$g2094$.rebind(var165, var162);
            }
        }
        catch (Throwable var174) {
            var163 = Errors.handleThrowable(var174, (SubLObject)$ic17$);
        }
        finally {
            var162.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14489(final SubLObject var27, final SubLObject var161, SubLObject var19, SubLObject var14) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var162 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        SubLObject var163 = (SubLObject)NIL;
        try {
            var162.throwStack.push($ic17$);
            final SubLObject var164 = var14;
            final SubLObject var165 = module0147.$g2094$.currentBinding(var162);
            final SubLObject var166 = module0147.$g2095$.currentBinding(var162);
            try {
                module0147.$g2094$.bind(module0147.f9536(var164), var162);
                module0147.$g2095$.bind(module0147.f9537(var164), var162);
                if (NIL != var19) {
                    if (NIL != module0158.f10221(var161, var19)) {
                        final SubLObject var167 = module0158.f10222(var161, var19);
                        SubLObject var168 = (SubLObject)NIL;
                        final SubLObject var169 = (SubLObject)NIL;
                        while (NIL == var168) {
                            final SubLObject var170 = module0052.f3695(var167, var169);
                            final SubLObject var171 = (SubLObject)makeBoolean(!var169.eql(var170));
                            if (NIL != var171) {
                                SubLObject var172 = (SubLObject)NIL;
                                try {
                                    var172 = module0158.f10316(var170, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                    SubLObject var37_172 = (SubLObject)NIL;
                                    final SubLObject var38_173 = (SubLObject)NIL;
                                    while (NIL == var37_172) {
                                        final SubLObject var173 = module0052.f3695(var172, var38_173);
                                        final SubLObject var40_174 = (SubLObject)makeBoolean(!var38_173.eql(var173));
                                        if (NIL != var40_174) {
                                            Functions.funcall(var27, var173);
                                        }
                                        var37_172 = (SubLObject)makeBoolean(NIL == var40_174);
                                    }
                                }
                                finally {
                                    final SubLObject var33_175 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                                        if (NIL != var172) {
                                            module0158.f10319(var172);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33_175, var162);
                                    }
                                }
                            }
                            var168 = (SubLObject)makeBoolean(NIL == var171);
                        }
                    }
                }
                else if (NIL != module0158.f10221(var161, (SubLObject)NIL)) {
                    final SubLObject var167 = module0158.f10222(var161, (SubLObject)NIL);
                    SubLObject var168 = (SubLObject)NIL;
                    final SubLObject var169 = (SubLObject)NIL;
                    while (NIL == var168) {
                        final SubLObject var170 = module0052.f3695(var167, var169);
                        final SubLObject var171 = (SubLObject)makeBoolean(!var169.eql(var170));
                        if (NIL != var171) {
                            SubLObject var172 = (SubLObject)NIL;
                            try {
                                var172 = module0158.f10316(var170, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_173 = (SubLObject)NIL;
                                final SubLObject var38_174 = (SubLObject)NIL;
                                while (NIL == var37_173) {
                                    final SubLObject var173 = module0052.f3695(var172, var38_174);
                                    final SubLObject var40_175 = (SubLObject)makeBoolean(!var38_174.eql(var173));
                                    if (NIL != var40_175) {
                                        Functions.funcall(var27, var173);
                                    }
                                    var37_173 = (SubLObject)makeBoolean(NIL == var40_175);
                                }
                            }
                            finally {
                                final SubLObject var33_176 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                                    if (NIL != var172) {
                                        module0158.f10319(var172);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_176, var162);
                                }
                            }
                        }
                        var168 = (SubLObject)makeBoolean(NIL == var171);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var166, var162);
                module0147.$g2094$.rebind(var165, var162);
            }
        }
        catch (Throwable var174) {
            var163 = Errors.handleThrowable(var174, (SubLObject)$ic17$);
        }
        finally {
            var162.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14490(final SubLObject var27, final SubLObject var96, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var97 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        SubLObject var98 = (SubLObject)NIL;
        try {
            var97.throwStack.push($ic17$);
            if (NIL != var19) {
                if (NIL != module0158.f10244(var96, var19)) {
                    final SubLObject var99 = module0158.f10245(var96, var19);
                    SubLObject var100 = (SubLObject)NIL;
                    final SubLObject var101 = (SubLObject)NIL;
                    while (NIL == var100) {
                        final SubLObject var102 = module0052.f3695(var99, var101);
                        final SubLObject var103 = (SubLObject)makeBoolean(!var101.eql(var102));
                        if (NIL != var103) {
                            SubLObject var104 = (SubLObject)NIL;
                            try {
                                var104 = module0158.f10316(var102, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_181 = (SubLObject)NIL;
                                final SubLObject var38_182 = (SubLObject)NIL;
                                while (NIL == var37_181) {
                                    final SubLObject var105 = module0052.f3695(var104, var38_182);
                                    final SubLObject var40_183 = (SubLObject)makeBoolean(!var38_182.eql(var105));
                                    if (NIL != var40_183) {
                                        Functions.funcall(var27, var105);
                                    }
                                    var37_181 = (SubLObject)makeBoolean(NIL == var40_183);
                                }
                            }
                            finally {
                                final SubLObject var106 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                                    if (NIL != var104) {
                                        module0158.f10319(var104);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var106, var97);
                                }
                            }
                        }
                        var100 = (SubLObject)makeBoolean(NIL == var103);
                    }
                }
            }
            else if (NIL != module0158.f10244(var96, (SubLObject)NIL)) {
                final SubLObject var99 = module0158.f10245(var96, (SubLObject)NIL);
                SubLObject var100 = (SubLObject)NIL;
                final SubLObject var101 = (SubLObject)NIL;
                while (NIL == var100) {
                    final SubLObject var102 = module0052.f3695(var99, var101);
                    final SubLObject var103 = (SubLObject)makeBoolean(!var101.eql(var102));
                    if (NIL != var103) {
                        SubLObject var104 = (SubLObject)NIL;
                        try {
                            var104 = module0158.f10316(var102, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_182 = (SubLObject)NIL;
                            final SubLObject var38_183 = (SubLObject)NIL;
                            while (NIL == var37_182) {
                                final SubLObject var105 = module0052.f3695(var104, var38_183);
                                final SubLObject var40_184 = (SubLObject)makeBoolean(!var38_183.eql(var105));
                                if (NIL != var40_184) {
                                    Functions.funcall(var27, var105);
                                }
                                var37_182 = (SubLObject)makeBoolean(NIL == var40_184);
                            }
                        }
                        finally {
                            final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                                if (NIL != var104) {
                                    module0158.f10319(var104);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var107, var97);
                            }
                        }
                    }
                    var100 = (SubLObject)makeBoolean(NIL == var103);
                }
            }
        }
        catch (Throwable var108) {
            var98 = Errors.handleThrowable(var108, (SubLObject)$ic17$);
        }
        finally {
            var97.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14491(final SubLObject var27, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        SubLObject var30 = (SubLObject)NIL;
        try {
            var29.throwStack.push($ic17$);
            if (NIL != module0158.f10282(var28, (SubLObject)NIL)) {
                final SubLObject var31 = module0158.f10283(var28, (SubLObject)NIL);
                SubLObject var32 = (SubLObject)NIL;
                final SubLObject var33 = (SubLObject)NIL;
                while (NIL == var32) {
                    final SubLObject var34 = module0052.f3695(var31, var33);
                    final SubLObject var35 = (SubLObject)makeBoolean(!var33.eql(var34));
                    if (NIL != var35) {
                        SubLObject var36 = (SubLObject)NIL;
                        try {
                            var36 = module0158.f10316(var34, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_188 = (SubLObject)NIL;
                            final SubLObject var38_189 = (SubLObject)NIL;
                            while (NIL == var37_188) {
                                final SubLObject var37 = module0052.f3695(var36, var38_189);
                                final SubLObject var40_190 = (SubLObject)makeBoolean(!var38_189.eql(var37));
                                if (NIL != var40_190 && NIL != module0158.f10284(var37, var34)) {
                                    Functions.funcall(var27, var37);
                                }
                                var37_188 = (SubLObject)makeBoolean(NIL == var40_190);
                            }
                        }
                        finally {
                            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var29);
                                if (NIL != var36) {
                                    module0158.f10319(var36);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38, var29);
                            }
                        }
                    }
                    var32 = (SubLObject)makeBoolean(NIL == var35);
                }
            }
        }
        catch (Throwable var39) {
            var30 = Errors.handleThrowable(var39, (SubLObject)$ic17$);
        }
        finally {
            var29.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14492(final SubLObject var27, final SubLObject var28, SubLObject var26, SubLObject var191) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var191 == UNPROVIDED) {
            var191 = (SubLObject)NIL;
        }
        final SubLThread var192 = SubLProcess.currentSubLThread();
        final SubLObject var193 = (SubLObject)((NIL != var191) ? $ic18$ : NIL);
        SubLObject var194 = (SubLObject)NIL;
        try {
            var192.throwStack.push($ic17$);
            if (NIL != module0158.f10282(var28, var193)) {
                final SubLObject var195 = module0158.f10283(var28, var193);
                SubLObject var196 = (SubLObject)NIL;
                final SubLObject var197 = (SubLObject)NIL;
                while (NIL == var196) {
                    final SubLObject var198 = module0052.f3695(var195, var197);
                    final SubLObject var199 = (SubLObject)makeBoolean(!var197.eql(var198));
                    if (NIL != var199) {
                        SubLObject var200 = (SubLObject)NIL;
                        try {
                            var200 = module0158.f10316(var198, var193, var26, (SubLObject)NIL);
                            SubLObject var37_193 = (SubLObject)NIL;
                            final SubLObject var38_194 = (SubLObject)NIL;
                            while (NIL == var37_193) {
                                final SubLObject var201 = module0052.f3695(var200, var38_194);
                                final SubLObject var40_195 = (SubLObject)makeBoolean(!var38_194.eql(var201));
                                if (NIL != var40_195 && NIL != module0158.f10284(var201, var198)) {
                                    Functions.funcall(var27, var201);
                                }
                                var37_193 = (SubLObject)makeBoolean(NIL == var40_195);
                            }
                        }
                        finally {
                            final SubLObject var202 = Threads.$is_thread_performing_cleanupP$.currentBinding(var192);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var192);
                                if (NIL != var200) {
                                    module0158.f10319(var200);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var202, var192);
                            }
                        }
                    }
                    var196 = (SubLObject)makeBoolean(NIL == var199);
                }
            }
        }
        catch (Throwable var203) {
            var194 = Errors.handleThrowable(var203, (SubLObject)$ic17$);
        }
        finally {
            var192.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14493(final SubLObject var27, final SubLObject var28, final SubLObject var196, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var197 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        assert NIL != Types.function_spec_p(var196) : var196;
        final SubLObject var198 = $g2398$.currentBinding(var197);
        final SubLObject var199 = $g2397$.currentBinding(var197);
        final SubLObject var200 = $g2395$.currentBinding(var197);
        try {
            $g2398$.bind(var27, var197);
            $g2397$.bind(var196, var197);
            $g2395$.bind(var26, var197);
            SubLObject var201 = (SubLObject)NIL;
            try {
                var197.throwStack.push($ic17$);
                f14491((SubLObject)$ic26$, var28);
            }
            catch (Throwable var202) {
                var201 = Errors.handleThrowable(var202, (SubLObject)$ic17$);
            }
            finally {
                var197.throwStack.pop();
            }
        }
        finally {
            $g2395$.rebind(var200, var197);
            $g2397$.rebind(var199, var197);
            $g2398$.rebind(var198, var197);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14494(final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        if (NIL != Functions.funcall($g2397$.getDynamicValue(var198), var197)) {
            Functions.funcall($g2398$.getDynamicValue(var198), var197);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14495(final SubLObject var27, final SubLObject var28, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var27) : var27;
        f14492(var27, var28, var26, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14496(final SubLObject var27, final SubLObject var28, SubLObject var26, SubLObject var198) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var198 == UNPROVIDED) {
            var198 = (SubLObject)NIL;
        }
        final SubLThread var199 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        if (NIL != module0173.f10955(var28)) {
            if (NIL != module0217.f14342(var28)) {
                if (NIL != module0147.f9507(var28)) {
                    final SubLObject var200 = $g2395$.currentBinding(var199);
                    try {
                        $g2395$.bind(var26, var199);
                        SubLObject var201 = (SubLObject)NIL;
                        try {
                            var199.throwStack.push($ic17$);
                            final SubLObject var202 = assertion_handles_oc.f11010();
                            final SubLObject var203 = (SubLObject)$ic34$;
                            final SubLObject var204 = module0065.f4733(var202);
                            SubLObject var205 = (SubLObject)ZERO_INTEGER;
                            assert NIL != Types.stringp(var203) : var203;
                            final SubLObject var33_203 = module0012.$g75$.currentBinding(var199);
                            final SubLObject var206 = module0012.$g76$.currentBinding(var199);
                            final SubLObject var207 = module0012.$g77$.currentBinding(var199);
                            final SubLObject var208 = module0012.$g78$.currentBinding(var199);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var199);
                                module0012.$g76$.bind((SubLObject)NIL, var199);
                                module0012.$g77$.bind((SubLObject)T, var199);
                                module0012.$g78$.bind(Time.get_universal_time(), var199);
                                module0012.f478(var203);
                                final SubLObject var204_205 = var202;
                                if (NIL == module0065.f4772(var204_205, (SubLObject)$ic36$)) {
                                    final SubLObject var206_207 = var204_205;
                                    if (NIL == module0065.f4775(var206_207, (SubLObject)$ic36$)) {
                                        final SubLObject var209 = module0065.f4740(var206_207);
                                        final SubLObject var210 = (SubLObject)NIL;
                                        SubLObject var211;
                                        SubLObject var212;
                                        SubLObject var213;
                                        SubLObject var214;
                                        for (var211 = Sequences.length(var209), var212 = (SubLObject)NIL, var212 = (SubLObject)ZERO_INTEGER; var212.numL(var211); var212 = Numbers.add(var212, (SubLObject)ONE_INTEGER)) {
                                            var213 = ((NIL != var210) ? Numbers.subtract(var211, var212, (SubLObject)ONE_INTEGER) : var212);
                                            var214 = Vectors.aref(var209, var213);
                                            if (NIL == module0065.f4749(var214) || NIL == module0065.f4773((SubLObject)$ic36$)) {
                                                if (NIL != module0065.f4749(var214)) {
                                                    var214 = (SubLObject)$ic36$;
                                                }
                                                module0012.note_percent_progress(var205, var204);
                                                var205 = Numbers.add(var205, (SubLObject)ONE_INTEGER);
                                                f14497(var27, var214, var28, var198);
                                            }
                                        }
                                    }
                                    final SubLObject var213_214 = var204_205;
                                    if (NIL == module0065.f4777(var213_214) || NIL == module0065.f4773((SubLObject)$ic36$)) {
                                        final SubLObject var215 = module0065.f4738(var213_214);
                                        SubLObject var216 = module0065.f4739(var213_214);
                                        final SubLObject var217 = module0065.f4734(var213_214);
                                        final SubLObject var218 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic36$)) ? NIL : $ic36$);
                                        while (var216.numL(var217)) {
                                            final SubLObject var219 = Hashtables.gethash_without_values(var216, var215, var218);
                                            if (NIL == module0065.f4773((SubLObject)$ic36$) || NIL == module0065.f4749(var219)) {
                                                module0012.note_percent_progress(var205, var204);
                                                var205 = Numbers.add(var205, (SubLObject)ONE_INTEGER);
                                                f14497(var27, var219, var28, var198);
                                            }
                                            var216 = Numbers.add(var216, (SubLObject)ONE_INTEGER);
                                        }
                                    }
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var208, var199);
                                module0012.$g77$.rebind(var207, var199);
                                module0012.$g76$.rebind(var206, var199);
                                module0012.$g75$.rebind(var33_203, var199);
                            }
                        }
                        catch (Throwable var220) {
                            var201 = Errors.handleThrowable(var220, (SubLObject)$ic17$);
                        }
                        finally {
                            var199.throwStack.pop();
                        }
                    }
                    finally {
                        $g2395$.rebind(var200, var199);
                    }
                }
            }
            else {
                f14498(var27, var28, var26, var198);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14497(final SubLObject var27, final SubLObject var197, final SubLObject var14, final SubLObject var198) {
        if (NIL != module0178.f11361(var197, (SubLObject)UNPROVIDED) && NIL != module0161.f10514(module0178.f11287(var197), var14) && NIL != f14499(var197) && (NIL == var198 || (NIL != module0178.f11284(var197) && NIL != module0148.f9572(module0178.f11332(var197))))) {
            Functions.funcall(var27, var197);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14499(final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        return module0211.f13642(var197, $g2395$.getDynamicValue(var198));
    }
    
    public static SubLObject f14498(final SubLObject var27, final SubLObject var14, SubLObject var26, SubLObject var198) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var198 == UNPROVIDED) {
            var198 = (SubLObject)NIL;
        }
        final SubLThread var199 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        if (NIL != module0173.f10955(var14)) {
            SubLObject var200 = (SubLObject)NIL;
            try {
                var199.throwStack.push($ic17$);
                final SubLObject var201 = (SubLObject)((NIL != var198) ? $ic18$ : NIL);
                if (NIL != module0158.f10270(var14, var201)) {
                    final SubLObject var202 = module0158.f10271(var14);
                    SubLObject var203 = (SubLObject)NIL;
                    try {
                        var203 = module0158.f10316(var202, var201, var26, (SubLObject)NIL);
                        SubLObject var204 = (SubLObject)NIL;
                        final SubLObject var205 = (SubLObject)NIL;
                        while (NIL == var204) {
                            final SubLObject var206 = module0052.f3695(var203, var205);
                            final SubLObject var207 = (SubLObject)makeBoolean(!var205.eql(var206));
                            if (NIL != var207) {
                                Functions.funcall(var27, var206);
                            }
                            var204 = (SubLObject)makeBoolean(NIL == var207);
                        }
                    }
                    finally {
                        final SubLObject var208 = Threads.$is_thread_performing_cleanupP$.currentBinding(var199);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var199);
                            if (NIL != var203) {
                                module0158.f10319(var203);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var208, var199);
                        }
                    }
                }
            }
            catch (Throwable var209) {
                var200 = Errors.handleThrowable(var209, (SubLObject)$ic17$);
            }
            finally {
                var199.throwStack.pop();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14500(final SubLObject var27, final SubLObject var28, SubLObject var26, SubLObject var198) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var198 == UNPROVIDED) {
            var198 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var27) : var27;
        if (NIL != module0161.f10481(var28)) {
            f14501(var27, var28, var26, var198);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14501(final SubLObject var27, final SubLObject var14, SubLObject var26, SubLObject var198) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var198 == UNPROVIDED) {
            var198 = (SubLObject)NIL;
        }
        final SubLThread var199 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        if (NIL != module0161.f10499(var14)) {
            final SubLObject var200 = $g2395$.currentBinding(var199);
            try {
                $g2395$.bind(var26, var199);
                SubLObject var201 = (SubLObject)NIL;
                try {
                    var199.throwStack.push($ic17$);
                    SubLObject var202 = module0218.f14453(module0035.f2119(var14), (SubLObject)UNPROVIDED);
                    SubLObject var203 = (SubLObject)NIL;
                    var203 = var202.first();
                    while (NIL != var202) {
                        if ((NIL == var198 || NIL != module0202.f12938(var203)) && NIL != f14499(var203) && NIL != module0161.f10513(module0178.f11287(var203), var14)) {
                            Functions.funcall(var27, var203);
                        }
                        var202 = var202.rest();
                        var203 = var202.first();
                    }
                }
                catch (Throwable var204) {
                    var201 = Errors.handleThrowable(var204, (SubLObject)$ic17$);
                }
                finally {
                    var199.throwStack.pop();
                }
            }
            finally {
                $g2395$.rebind(var200, var199);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14502(final SubLObject var27, final SubLObject var28, SubLObject var26, SubLObject var198) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var198 == UNPROVIDED) {
            var198 = (SubLObject)NIL;
        }
        final SubLThread var199 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var27) : var27;
        final SubLObject var200 = (SubLObject)((NIL != var198) ? $ic18$ : NIL);
        SubLObject var201 = (SubLObject)NIL;
        try {
            var199.throwStack.push($ic17$);
            if (NIL != module0158.f10274(var28, var200)) {
                final SubLObject var202 = module0158.f10275(var28);
                SubLObject var203 = (SubLObject)NIL;
                try {
                    var203 = module0158.f10316(var202, var200, var26, (SubLObject)NIL);
                    SubLObject var204 = (SubLObject)NIL;
                    final SubLObject var205 = (SubLObject)NIL;
                    while (NIL == var204) {
                        final SubLObject var206 = module0052.f3695(var203, var205);
                        final SubLObject var207 = (SubLObject)makeBoolean(!var205.eql(var206));
                        if (NIL != var207 && NIL != module0158.f10280(var206)) {
                            Functions.funcall(var27, var206);
                        }
                        var204 = (SubLObject)makeBoolean(NIL == var207);
                    }
                }
                finally {
                    final SubLObject var208 = Threads.$is_thread_performing_cleanupP$.currentBinding(var199);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var199);
                        if (NIL != var203) {
                            module0158.f10319(var203);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var208, var199);
                    }
                }
            }
        }
        catch (Throwable var209) {
            var201 = Errors.handleThrowable(var209, (SubLObject)$ic17$);
        }
        finally {
            var199.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14503(final SubLObject var28, SubLObject var221) {
        if (var221 == UNPROVIDED) {
            var221 = (SubLObject)NIL;
        }
        return f14504(var28, var221, (SubLObject)NIL);
    }
    
    public static SubLObject f14505(final SubLObject var28, SubLObject var221) {
        if (var221 == UNPROVIDED) {
            var221 = (SubLObject)NIL;
        }
        return f14504(var28, var221, (SubLObject)NIL);
    }
    
    public static SubLObject f14506(final SubLObject var28, SubLObject var221) {
        if (var221 == UNPROVIDED) {
            var221 = (SubLObject)NIL;
        }
        return f14504(var28, var221, (SubLObject)$ic18$);
    }
    
    public static SubLObject f14507(final SubLObject var28, SubLObject var221) {
        if (var221 == UNPROVIDED) {
            var221 = (SubLObject)NIL;
        }
        return f14504(var28, var221, (SubLObject)$ic20$);
    }
    
    public static SubLObject f14504(final SubLObject var28, final SubLObject var221, final SubLObject var192) {
        SubLObject var222 = (SubLObject)NIL;
        if (NIL != module0223.f14667(var28)) {
            if (var28.eql(module0223.f14674())) {
                if (NIL != module0158.f10244((SubLObject)NIL, (SubLObject)NIL)) {
                    final SubLObject var223 = module0158.f10245((SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var224 = (SubLObject)NIL;
                    final SubLObject var225 = (SubLObject)NIL;
                    while (NIL == var224) {
                        final SubLObject var226 = module0052.f3695(var223, var225);
                        final SubLObject var227 = (SubLObject)makeBoolean(!var225.eql(var226));
                        if (NIL != var227) {
                            SubLObject var228 = (SubLObject)NIL;
                            try {
                                var228 = module0158.f10316(var226, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var37_223 = (SubLObject)NIL;
                                final SubLObject var38_224 = (SubLObject)NIL;
                                while (NIL == var37_223) {
                                    final SubLObject var229 = module0052.f3695(var228, var38_224);
                                    final SubLObject var40_225 = (SubLObject)makeBoolean(!var38_224.eql(var229));
                                    if (NIL != var40_225) {
                                        var222 = (SubLObject)ConsesLow.cons(var229, var222);
                                    }
                                    var37_223 = (SubLObject)makeBoolean(NIL == var40_225);
                                }
                            }
                            finally {
                                final SubLObject var230 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var228) {
                                        module0158.f10319(var228);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var230);
                                }
                            }
                        }
                        var224 = (SubLObject)makeBoolean(NIL == var227);
                    }
                }
            }
            else {
                Errors.cerror((SubLObject)$ic51$, (SubLObject)$ic52$, var28);
            }
        }
        else if (NIL != module0158.f10282(var28, var192)) {
            final SubLObject var223 = module0158.f10283(var28, var192);
            SubLObject var224 = (SubLObject)NIL;
            final SubLObject var225 = (SubLObject)NIL;
            while (NIL == var224) {
                final SubLObject var231 = module0052.f3695(var223, var225);
                final SubLObject var227 = (SubLObject)makeBoolean(!var225.eql(var231));
                if (NIL != var227) {
                    SubLObject var228 = (SubLObject)NIL;
                    try {
                        var228 = module0158.f10316(var231, var192, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var37_224 = (SubLObject)NIL;
                        final SubLObject var38_225 = (SubLObject)NIL;
                        while (NIL == var37_224) {
                            final SubLObject var229 = module0052.f3695(var228, var38_225);
                            final SubLObject var40_226 = (SubLObject)makeBoolean(!var38_225.eql(var229));
                            if (NIL != var40_226 && NIL != module0158.f10284(var229, var231)) {
                                var222 = (SubLObject)ConsesLow.cons(var229, var222);
                            }
                            var37_224 = (SubLObject)makeBoolean(NIL == var40_226);
                        }
                    }
                    finally {
                        final SubLObject var232 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var228) {
                                module0158.f10319(var228);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var232);
                        }
                    }
                }
                var224 = (SubLObject)makeBoolean(NIL == var227);
            }
        }
        if (NIL != var221) {
            var222 = module0035.f2269(var222, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var222;
    }
    
    public static SubLObject f14508(final SubLObject var28, SubLObject var221) {
        if (var221 == UNPROVIDED) {
            var221 = (SubLObject)NIL;
        }
        final SubLThread var222 = SubLProcess.currentSubLThread();
        SubLObject var223 = (SubLObject)NIL;
        final SubLObject var224 = module0147.$g2094$.currentBinding(var222);
        final SubLObject var225 = module0147.$g2095$.currentBinding(var222);
        try {
            module0147.$g2094$.bind((SubLObject)$ic53$, var222);
            module0147.$g2095$.bind($ic54$, var222);
            var223 = f14503(var28, var221);
        }
        finally {
            module0147.$g2095$.rebind(var225, var222);
            module0147.$g2094$.rebind(var224, var222);
        }
        return var223;
    }
    
    public static SubLObject f14509(final SubLObject var28, final SubLObject var29, SubLObject var9, SubLObject var14, SubLObject var26) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)$ic57$;
        }
        final SubLThread var30 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f105(var29) : var29;
        SubLObject var31 = (SubLObject)NIL;
        final SubLObject var32 = var14;
        final SubLObject var33 = module0147.$g2094$.currentBinding(var30);
        final SubLObject var34 = module0147.$g2095$.currentBinding(var30);
        try {
            module0147.$g2094$.bind(module0147.f9536(var32), var30);
            module0147.$g2095$.bind(module0147.f9537(var32), var30);
            if (NIL != var9) {
                final SubLObject var35 = var9;
                if (NIL != module0158.f10010(var28, var29, var35)) {
                    final SubLObject var36 = module0158.f10011(var28, var29, var35);
                    SubLObject var37 = (SubLObject)NIL;
                    final SubLObject var38 = (SubLObject)NIL;
                    while (NIL == var37) {
                        final SubLObject var39 = module0052.f3695(var36, var38);
                        final SubLObject var40 = (SubLObject)makeBoolean(!var38.eql(var39));
                        if (NIL != var40) {
                            SubLObject var41 = (SubLObject)NIL;
                            try {
                                var41 = module0158.f10316(var39, (SubLObject)$ic18$, var26, (SubLObject)NIL);
                                SubLObject var37_229 = (SubLObject)NIL;
                                final SubLObject var38_230 = (SubLObject)NIL;
                                while (NIL == var37_229) {
                                    final SubLObject var42 = module0052.f3695(var41, var38_230);
                                    final SubLObject var40_231 = (SubLObject)makeBoolean(!var38_230.eql(var42));
                                    if (NIL != var40_231) {
                                        var31 = (SubLObject)ConsesLow.cons(var42, var31);
                                    }
                                    var37_229 = (SubLObject)makeBoolean(NIL == var40_231);
                                }
                            }
                            finally {
                                final SubLObject var33_232 = Threads.$is_thread_performing_cleanupP$.currentBinding(var30);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var30);
                                    if (NIL != var41) {
                                        module0158.f10319(var41);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_232, var30);
                                }
                            }
                        }
                        var37 = (SubLObject)makeBoolean(NIL == var40);
                    }
                }
            }
            else {
                final SubLObject var35 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var28, var29, var35)) {
                    final SubLObject var36 = module0158.f10011(var28, var29, var35);
                    SubLObject var37 = (SubLObject)NIL;
                    final SubLObject var38 = (SubLObject)NIL;
                    while (NIL == var37) {
                        final SubLObject var39 = module0052.f3695(var36, var38);
                        final SubLObject var40 = (SubLObject)makeBoolean(!var38.eql(var39));
                        if (NIL != var40) {
                            SubLObject var41 = (SubLObject)NIL;
                            try {
                                var41 = module0158.f10316(var39, (SubLObject)$ic18$, var26, (SubLObject)NIL);
                                SubLObject var37_230 = (SubLObject)NIL;
                                final SubLObject var38_231 = (SubLObject)NIL;
                                while (NIL == var37_230) {
                                    final SubLObject var42 = module0052.f3695(var41, var38_231);
                                    final SubLObject var40_232 = (SubLObject)makeBoolean(!var38_231.eql(var42));
                                    if (NIL != var40_232) {
                                        var31 = (SubLObject)ConsesLow.cons(var42, var31);
                                    }
                                    var37_230 = (SubLObject)makeBoolean(NIL == var40_232);
                                }
                            }
                            finally {
                                final SubLObject var33_233 = Threads.$is_thread_performing_cleanupP$.currentBinding(var30);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var30);
                                    if (NIL != var41) {
                                        module0158.f10319(var41);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_233, var30);
                                }
                            }
                        }
                        var37 = (SubLObject)makeBoolean(NIL == var40);
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var34, var30);
            module0147.$g2094$.rebind(var33, var30);
        }
        var31 = module0035.f2269(var31, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var31;
    }
    
    public static SubLObject f14510(final SubLObject var28, final SubLObject var29, final SubLObject var9, SubLObject var14, SubLObject var26) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)$ic57$;
        }
        return f14509(var28, var29, var9, var14, var26);
    }
    
    public static SubLObject f14511(final SubLObject var28, final SubLObject var29, SubLObject var237) {
        if (var237 == UNPROVIDED) {
            var237 = (SubLObject)NIL;
        }
        assert NIL != module0004.f105(var29) : var29;
        SubLObject var238 = (SubLObject)NIL;
        if (NIL != var237) {
            if (NIL != module0158.f10054(var28, var29, var237)) {
                final SubLObject var239 = module0158.f10055(var28, var29, var237);
                SubLObject var240 = (SubLObject)NIL;
                final SubLObject var241 = (SubLObject)NIL;
                while (NIL == var240) {
                    final SubLObject var242 = module0052.f3695(var239, var241);
                    final SubLObject var243 = (SubLObject)makeBoolean(!var241.eql(var242));
                    if (NIL != var243) {
                        SubLObject var244 = (SubLObject)NIL;
                        try {
                            var244 = module0158.f10316(var242, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_238 = (SubLObject)NIL;
                            final SubLObject var38_239 = (SubLObject)NIL;
                            while (NIL == var37_238) {
                                final SubLObject var245 = module0052.f3695(var244, var38_239);
                                final SubLObject var40_240 = (SubLObject)makeBoolean(!var38_239.eql(var245));
                                if (NIL != var40_240) {
                                    var238 = (SubLObject)ConsesLow.cons(var245, var238);
                                }
                                var37_238 = (SubLObject)makeBoolean(NIL == var40_240);
                            }
                        }
                        finally {
                            final SubLObject var246 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var244) {
                                    module0158.f10319(var244);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var246);
                            }
                        }
                    }
                    var240 = (SubLObject)makeBoolean(NIL == var243);
                }
            }
        }
        else if (NIL != module0158.f10054(var28, var29, (SubLObject)NIL)) {
            final SubLObject var239 = module0158.f10055(var28, var29, (SubLObject)NIL);
            SubLObject var240 = (SubLObject)NIL;
            final SubLObject var241 = (SubLObject)NIL;
            while (NIL == var240) {
                final SubLObject var242 = module0052.f3695(var239, var241);
                final SubLObject var243 = (SubLObject)makeBoolean(!var241.eql(var242));
                if (NIL != var243) {
                    SubLObject var244 = (SubLObject)NIL;
                    try {
                        var244 = module0158.f10316(var242, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var37_239 = (SubLObject)NIL;
                        final SubLObject var38_240 = (SubLObject)NIL;
                        while (NIL == var37_239) {
                            final SubLObject var245 = module0052.f3695(var244, var38_240);
                            final SubLObject var40_241 = (SubLObject)makeBoolean(!var38_240.eql(var245));
                            if (NIL != var40_241) {
                                var238 = (SubLObject)ConsesLow.cons(var245, var238);
                            }
                            var37_239 = (SubLObject)makeBoolean(NIL == var40_241);
                        }
                    }
                    finally {
                        final SubLObject var247 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var244) {
                                module0158.f10319(var244);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var247);
                        }
                    }
                }
                var240 = (SubLObject)makeBoolean(NIL == var243);
            }
        }
        var238 = module0035.f2269(var238, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var238;
    }
    
    public static SubLObject f14512(final SubLObject var9, SubLObject var14, SubLObject var26) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)$ic57$;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = var14;
        final SubLObject var30 = module0147.$g2094$.currentBinding(var27);
        final SubLObject var31 = module0147.$g2095$.currentBinding(var27);
        try {
            module0147.$g2094$.bind(module0147.f9536(var29), var27);
            module0147.$g2095$.bind(module0147.f9537(var29), var27);
            if (NIL != module0158.f10038(var9)) {
                final SubLObject var32 = (SubLObject)NIL;
                final SubLObject var33_244 = module0012.$g73$.currentBinding(var27);
                final SubLObject var34_245 = module0012.$g65$.currentBinding(var27);
                final SubLObject var33 = module0012.$g67$.currentBinding(var27);
                final SubLObject var34 = module0012.$g68$.currentBinding(var27);
                final SubLObject var35 = module0012.$g66$.currentBinding(var27);
                final SubLObject var36 = module0012.$g69$.currentBinding(var27);
                final SubLObject var37 = module0012.$g70$.currentBinding(var27);
                final SubLObject var38 = module0012.$silent_progressP$.currentBinding(var27);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var27);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var27), var27);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var27);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var27);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var27);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var27);
                    module0012.$g70$.bind((SubLObject)T, var27);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var27) : T), var27);
                    module0012.f474(var32);
                    final SubLObject var39 = module0158.f10039(var9);
                    SubLObject var40 = (SubLObject)NIL;
                    final SubLObject var41 = (SubLObject)NIL;
                    while (NIL == var40) {
                        final SubLObject var42 = module0052.f3695(var39, var41);
                        final SubLObject var43 = (SubLObject)makeBoolean(!var41.eql(var42));
                        if (NIL != var43) {
                            module0012.f476();
                            SubLObject var44 = (SubLObject)NIL;
                            try {
                                var44 = module0158.f10316(var42, (SubLObject)$ic18$, var26, (SubLObject)NIL);
                                SubLObject var37_246 = (SubLObject)NIL;
                                final SubLObject var38_247 = (SubLObject)NIL;
                                while (NIL == var37_246) {
                                    final SubLObject var45 = module0052.f3695(var44, var38_247);
                                    final SubLObject var40_248 = (SubLObject)makeBoolean(!var38_247.eql(var45));
                                    if (NIL != var40_248) {
                                        var28 = (SubLObject)ConsesLow.cons(var45, var28);
                                    }
                                    var37_246 = (SubLObject)makeBoolean(NIL == var40_248);
                                }
                            }
                            finally {
                                final SubLObject var33_245 = Threads.$is_thread_performing_cleanupP$.currentBinding(var27);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var27);
                                    if (NIL != var44) {
                                        module0158.f10319(var44);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_245, var27);
                                }
                            }
                        }
                        var40 = (SubLObject)makeBoolean(NIL == var43);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var38, var27);
                    module0012.$g70$.rebind(var37, var27);
                    module0012.$g69$.rebind(var36, var27);
                    module0012.$g66$.rebind(var35, var27);
                    module0012.$g68$.rebind(var34, var27);
                    module0012.$g67$.rebind(var33, var27);
                    module0012.$g65$.rebind(var34_245, var27);
                    module0012.$g73$.rebind(var33_244, var27);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var31, var27);
            module0147.$g2094$.rebind(var30, var27);
        }
        var28 = module0035.f2269(var28, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var28;
    }
    
    public static SubLObject f14513(final SubLObject var237) {
        SubLObject var238 = (SubLObject)NIL;
        if (NIL != module0158.f10078(var237)) {
            final SubLObject var239 = module0158.f10080(var237);
            SubLObject var240 = (SubLObject)NIL;
            try {
                var240 = module0158.f10316(var239, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var241 = (SubLObject)NIL;
                final SubLObject var242 = (SubLObject)NIL;
                while (NIL == var241) {
                    final SubLObject var243 = module0052.f3695(var240, var242);
                    final SubLObject var244 = (SubLObject)makeBoolean(!var242.eql(var243));
                    if (NIL != var244) {
                        var238 = (SubLObject)ConsesLow.cons(var243, var238);
                    }
                    var241 = (SubLObject)makeBoolean(NIL == var244);
                }
            }
            finally {
                final SubLObject var245 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (NIL != var240) {
                        module0158.f10319(var240);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var245);
                }
            }
        }
        var238 = module0035.f2269(var238, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var238;
    }
    
    public static SubLObject f14514(final SubLObject var9, final SubLObject var96, SubLObject var14, SubLObject var19) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var97 = SubLProcess.currentSubLThread();
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var98 = (SubLObject)NIL;
        final SubLObject var99 = var14;
        final SubLObject var100 = module0147.$g2094$.currentBinding(var97);
        final SubLObject var101 = module0147.$g2095$.currentBinding(var97);
        try {
            module0147.$g2094$.bind(module0147.f9536(var99), var97);
            module0147.$g2095$.bind(module0147.f9537(var99), var97);
            if (NIL != var19) {
                if (NIL != module0158.f10084(var9, var96, var19)) {
                    final SubLObject var102 = module0158.f10085(var9, var96, var19);
                    SubLObject var103 = (SubLObject)NIL;
                    final SubLObject var104 = (SubLObject)NIL;
                    while (NIL == var103) {
                        final SubLObject var105 = module0052.f3695(var102, var104);
                        final SubLObject var106 = (SubLObject)makeBoolean(!var104.eql(var105));
                        if (NIL != var106) {
                            SubLObject var107 = (SubLObject)NIL;
                            try {
                                var107 = module0158.f10316(var105, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_250 = (SubLObject)NIL;
                                final SubLObject var38_251 = (SubLObject)NIL;
                                while (NIL == var37_250) {
                                    final SubLObject var108 = module0052.f3695(var107, var38_251);
                                    final SubLObject var40_252 = (SubLObject)makeBoolean(!var38_251.eql(var108));
                                    if (NIL != var40_252) {
                                        var98 = (SubLObject)ConsesLow.cons(var108, var98);
                                    }
                                    var37_250 = (SubLObject)makeBoolean(NIL == var40_252);
                                }
                            }
                            finally {
                                final SubLObject var33_253 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                                    if (NIL != var107) {
                                        module0158.f10319(var107);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_253, var97);
                                }
                            }
                        }
                        var103 = (SubLObject)makeBoolean(NIL == var106);
                    }
                }
            }
            else if (NIL != module0158.f10084(var9, var96, (SubLObject)NIL)) {
                final SubLObject var102 = module0158.f10085(var9, var96, (SubLObject)NIL);
                SubLObject var103 = (SubLObject)NIL;
                final SubLObject var104 = (SubLObject)NIL;
                while (NIL == var103) {
                    final SubLObject var105 = module0052.f3695(var102, var104);
                    final SubLObject var106 = (SubLObject)makeBoolean(!var104.eql(var105));
                    if (NIL != var106) {
                        SubLObject var107 = (SubLObject)NIL;
                        try {
                            var107 = module0158.f10316(var105, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_251 = (SubLObject)NIL;
                            final SubLObject var38_252 = (SubLObject)NIL;
                            while (NIL == var37_251) {
                                final SubLObject var108 = module0052.f3695(var107, var38_252);
                                final SubLObject var40_253 = (SubLObject)makeBoolean(!var38_252.eql(var108));
                                if (NIL != var40_253) {
                                    var98 = (SubLObject)ConsesLow.cons(var108, var98);
                                }
                                var37_251 = (SubLObject)makeBoolean(NIL == var40_253);
                            }
                        }
                        finally {
                            final SubLObject var33_254 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                                if (NIL != var107) {
                                    module0158.f10319(var107);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var33_254, var97);
                            }
                        }
                    }
                    var103 = (SubLObject)makeBoolean(NIL == var106);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var101, var97);
            module0147.$g2094$.rebind(var100, var97);
        }
        var98 = module0035.f2269(var98, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var98;
    }
    
    public static SubLObject f14515(final SubLObject var9, final SubLObject var96, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var97 = SubLProcess.currentSubLThread();
        SubLObject var98 = (SubLObject)NIL;
        final SubLObject var99 = module0147.$g2094$.currentBinding(var97);
        final SubLObject var100 = module0147.$g2095$.currentBinding(var97);
        try {
            module0147.$g2094$.bind((SubLObject)$ic53$, var97);
            module0147.$g2095$.bind($ic54$, var97);
            var98 = f14514(var9, var96, (SubLObject)NIL, var19);
        }
        finally {
            module0147.$g2095$.rebind(var100, var97);
            module0147.$g2094$.rebind(var99, var97);
        }
        return var98;
    }
    
    public static SubLObject f14516(final SubLObject var9, final SubLObject var96, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var97 = (SubLObject)NIL;
        if (NIL != var19) {
            if (NIL != module0158.f10112(var9, var96, var19)) {
                final SubLObject var98 = module0158.f10113(var9, var96, var19);
                SubLObject var99 = (SubLObject)NIL;
                final SubLObject var100 = (SubLObject)NIL;
                while (NIL == var99) {
                    final SubLObject var101 = module0052.f3695(var98, var100);
                    final SubLObject var102 = (SubLObject)makeBoolean(!var100.eql(var101));
                    if (NIL != var102) {
                        SubLObject var103 = (SubLObject)NIL;
                        try {
                            var103 = module0158.f10316(var101, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                            SubLObject var37_258 = (SubLObject)NIL;
                            final SubLObject var38_259 = (SubLObject)NIL;
                            while (NIL == var37_258) {
                                final SubLObject var104 = module0052.f3695(var103, var38_259);
                                final SubLObject var40_260 = (SubLObject)makeBoolean(!var38_259.eql(var104));
                                if (NIL != var40_260) {
                                    var97 = (SubLObject)ConsesLow.cons(var104, var97);
                                }
                                var37_258 = (SubLObject)makeBoolean(NIL == var40_260);
                            }
                        }
                        finally {
                            final SubLObject var105 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var103) {
                                    module0158.f10319(var103);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var105);
                            }
                        }
                    }
                    var99 = (SubLObject)makeBoolean(NIL == var102);
                }
            }
        }
        else if (NIL != module0158.f10112(var9, var96, (SubLObject)NIL)) {
            final SubLObject var98 = module0158.f10113(var9, var96, (SubLObject)NIL);
            SubLObject var99 = (SubLObject)NIL;
            final SubLObject var100 = (SubLObject)NIL;
            while (NIL == var99) {
                final SubLObject var101 = module0052.f3695(var98, var100);
                final SubLObject var102 = (SubLObject)makeBoolean(!var100.eql(var101));
                if (NIL != var102) {
                    SubLObject var103 = (SubLObject)NIL;
                    try {
                        var103 = module0158.f10316(var101, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var37_259 = (SubLObject)NIL;
                        final SubLObject var38_260 = (SubLObject)NIL;
                        while (NIL == var37_259) {
                            final SubLObject var104 = module0052.f3695(var103, var38_260);
                            final SubLObject var40_261 = (SubLObject)makeBoolean(!var38_260.eql(var104));
                            if (NIL != var40_261) {
                                var97 = (SubLObject)ConsesLow.cons(var104, var97);
                            }
                            var37_259 = (SubLObject)makeBoolean(NIL == var40_261);
                        }
                    }
                    finally {
                        final SubLObject var106 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var103) {
                                module0158.f10319(var103);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var106);
                        }
                    }
                }
                var99 = (SubLObject)makeBoolean(NIL == var102);
            }
        }
        var97 = module0035.f2269(var97, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var97;
    }
    
    public static SubLObject f14517(final SubLObject var113, final SubLObject var96, SubLObject var14, SubLObject var19) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var115 = (SubLObject)NIL;
        final SubLObject var116 = var14;
        final SubLObject var117 = module0147.$g2094$.currentBinding(var114);
        final SubLObject var118 = module0147.$g2095$.currentBinding(var114);
        try {
            module0147.$g2094$.bind(module0147.f9536(var116), var114);
            module0147.$g2095$.bind(module0147.f9537(var116), var114);
            if (NIL != var19) {
                if (NIL != module0158.f10135(var113, var96, var19)) {
                    final SubLObject var119 = module0158.f10137(var113, var96, var19);
                    SubLObject var120 = (SubLObject)NIL;
                    final SubLObject var121 = (SubLObject)NIL;
                    while (NIL == var120) {
                        final SubLObject var122 = module0052.f3695(var119, var121);
                        final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                        if (NIL != var123) {
                            SubLObject var124 = (SubLObject)NIL;
                            try {
                                var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_264 = (SubLObject)NIL;
                                final SubLObject var38_265 = (SubLObject)NIL;
                                while (NIL == var37_264) {
                                    final SubLObject var125 = module0052.f3695(var124, var38_265);
                                    final SubLObject var40_266 = (SubLObject)makeBoolean(!var38_265.eql(var125));
                                    if (NIL != var40_266) {
                                        var115 = (SubLObject)ConsesLow.cons(var125, var115);
                                    }
                                    var37_264 = (SubLObject)makeBoolean(NIL == var40_266);
                                }
                            }
                            finally {
                                final SubLObject var33_267 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                    if (NIL != var124) {
                                        module0158.f10319(var124);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_267, var114);
                                }
                            }
                        }
                        var120 = (SubLObject)makeBoolean(NIL == var123);
                    }
                }
            }
            else if (NIL != module0158.f10135(var113, var96, (SubLObject)NIL)) {
                final SubLObject var119 = module0158.f10137(var113, var96, (SubLObject)NIL);
                SubLObject var120 = (SubLObject)NIL;
                final SubLObject var121 = (SubLObject)NIL;
                while (NIL == var120) {
                    final SubLObject var122 = module0052.f3695(var119, var121);
                    final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                    if (NIL != var123) {
                        SubLObject var124 = (SubLObject)NIL;
                        try {
                            var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_265 = (SubLObject)NIL;
                            final SubLObject var38_266 = (SubLObject)NIL;
                            while (NIL == var37_265) {
                                final SubLObject var125 = module0052.f3695(var124, var38_266);
                                final SubLObject var40_267 = (SubLObject)makeBoolean(!var38_266.eql(var125));
                                if (NIL != var40_267) {
                                    var115 = (SubLObject)ConsesLow.cons(var125, var115);
                                }
                                var37_265 = (SubLObject)makeBoolean(NIL == var40_267);
                            }
                        }
                        finally {
                            final SubLObject var33_268 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                if (NIL != var124) {
                                    module0158.f10319(var124);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var33_268, var114);
                            }
                        }
                    }
                    var120 = (SubLObject)makeBoolean(NIL == var123);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var118, var114);
            module0147.$g2094$.rebind(var117, var114);
        }
        var115 = module0035.f2269(var115, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var115;
    }
    
    public static SubLObject f14518(final SubLObject var113, final SubLObject var96, SubLObject var14, SubLObject var19) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var115 = (SubLObject)NIL;
        final SubLObject var116 = var14;
        final SubLObject var117 = module0147.$g2094$.currentBinding(var114);
        final SubLObject var118 = module0147.$g2095$.currentBinding(var114);
        try {
            module0147.$g2094$.bind(module0147.f9536(var116), var114);
            module0147.$g2095$.bind(module0147.f9537(var116), var114);
            if (NIL != var19) {
                if (NIL != module0158.f10140(var113, var96, var19)) {
                    final SubLObject var119 = module0158.f10141(var113, var96, var19);
                    SubLObject var120 = (SubLObject)NIL;
                    final SubLObject var121 = (SubLObject)NIL;
                    while (NIL == var120) {
                        final SubLObject var122 = module0052.f3695(var119, var121);
                        final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                        if (NIL != var123) {
                            SubLObject var124 = (SubLObject)NIL;
                            try {
                                var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_272 = (SubLObject)NIL;
                                final SubLObject var38_273 = (SubLObject)NIL;
                                while (NIL == var37_272) {
                                    final SubLObject var125 = module0052.f3695(var124, var38_273);
                                    final SubLObject var40_274 = (SubLObject)makeBoolean(!var38_273.eql(var125));
                                    if (NIL != var40_274) {
                                        var115 = (SubLObject)ConsesLow.cons(var125, var115);
                                    }
                                    var37_272 = (SubLObject)makeBoolean(NIL == var40_274);
                                }
                            }
                            finally {
                                final SubLObject var33_275 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                    if (NIL != var124) {
                                        module0158.f10319(var124);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_275, var114);
                                }
                            }
                        }
                        var120 = (SubLObject)makeBoolean(NIL == var123);
                    }
                }
            }
            else if (NIL != module0158.f10140(var113, var96, (SubLObject)NIL)) {
                final SubLObject var119 = module0158.f10141(var113, var96, (SubLObject)NIL);
                SubLObject var120 = (SubLObject)NIL;
                final SubLObject var121 = (SubLObject)NIL;
                while (NIL == var120) {
                    final SubLObject var122 = module0052.f3695(var119, var121);
                    final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                    if (NIL != var123) {
                        SubLObject var124 = (SubLObject)NIL;
                        try {
                            var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_273 = (SubLObject)NIL;
                            final SubLObject var38_274 = (SubLObject)NIL;
                            while (NIL == var37_273) {
                                final SubLObject var125 = module0052.f3695(var124, var38_274);
                                final SubLObject var40_275 = (SubLObject)makeBoolean(!var38_274.eql(var125));
                                if (NIL != var40_275) {
                                    var115 = (SubLObject)ConsesLow.cons(var125, var115);
                                }
                                var37_273 = (SubLObject)makeBoolean(NIL == var40_275);
                            }
                        }
                        finally {
                            final SubLObject var33_276 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                if (NIL != var124) {
                                    module0158.f10319(var124);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var33_276, var114);
                            }
                        }
                    }
                    var120 = (SubLObject)makeBoolean(NIL == var123);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var118, var114);
            module0147.$g2094$.rebind(var117, var114);
        }
        var115 = module0035.f2269(var115, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var115;
    }
    
    public static SubLObject f14519(final SubLObject var113, final SubLObject var96, SubLObject var14, SubLObject var19) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var115 = (SubLObject)NIL;
        final SubLObject var116 = var14;
        final SubLObject var117 = module0147.$g2094$.currentBinding(var114);
        final SubLObject var118 = module0147.$g2095$.currentBinding(var114);
        try {
            module0147.$g2094$.bind(module0147.f9536(var116), var114);
            module0147.$g2095$.bind(module0147.f9537(var116), var114);
            if (NIL != var19) {
                if (NIL != module0158.f10143(var113, var96, var19)) {
                    final SubLObject var119 = module0158.f10144(var113, var96, var19);
                    SubLObject var120 = (SubLObject)NIL;
                    final SubLObject var121 = (SubLObject)NIL;
                    while (NIL == var120) {
                        final SubLObject var122 = module0052.f3695(var119, var121);
                        final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                        if (NIL != var123) {
                            SubLObject var124 = (SubLObject)NIL;
                            try {
                                var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_280 = (SubLObject)NIL;
                                final SubLObject var38_281 = (SubLObject)NIL;
                                while (NIL == var37_280) {
                                    final SubLObject var125 = module0052.f3695(var124, var38_281);
                                    final SubLObject var40_282 = (SubLObject)makeBoolean(!var38_281.eql(var125));
                                    if (NIL != var40_282) {
                                        var115 = (SubLObject)ConsesLow.cons(var125, var115);
                                    }
                                    var37_280 = (SubLObject)makeBoolean(NIL == var40_282);
                                }
                            }
                            finally {
                                final SubLObject var33_283 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                    if (NIL != var124) {
                                        module0158.f10319(var124);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_283, var114);
                                }
                            }
                        }
                        var120 = (SubLObject)makeBoolean(NIL == var123);
                    }
                }
            }
            else if (NIL != module0158.f10143(var113, var96, (SubLObject)NIL)) {
                final SubLObject var119 = module0158.f10144(var113, var96, (SubLObject)NIL);
                SubLObject var120 = (SubLObject)NIL;
                final SubLObject var121 = (SubLObject)NIL;
                while (NIL == var120) {
                    final SubLObject var122 = module0052.f3695(var119, var121);
                    final SubLObject var123 = (SubLObject)makeBoolean(!var121.eql(var122));
                    if (NIL != var123) {
                        SubLObject var124 = (SubLObject)NIL;
                        try {
                            var124 = module0158.f10316(var122, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_281 = (SubLObject)NIL;
                            final SubLObject var38_282 = (SubLObject)NIL;
                            while (NIL == var37_281) {
                                final SubLObject var125 = module0052.f3695(var124, var38_282);
                                final SubLObject var40_283 = (SubLObject)makeBoolean(!var38_282.eql(var125));
                                if (NIL != var40_283) {
                                    var115 = (SubLObject)ConsesLow.cons(var125, var115);
                                }
                                var37_281 = (SubLObject)makeBoolean(NIL == var40_283);
                            }
                        }
                        finally {
                            final SubLObject var33_284 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var114);
                                if (NIL != var124) {
                                    module0158.f10319(var124);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var33_284, var114);
                            }
                        }
                    }
                    var120 = (SubLObject)makeBoolean(NIL == var123);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var118, var114);
            module0147.$g2094$.rebind(var117, var114);
        }
        var115 = module0035.f2269(var115, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var115;
    }
    
    public static SubLObject f14520(final SubLObject var141, final SubLObject var96, SubLObject var142, SubLObject var19) {
        if (var142 == UNPROVIDED) {
            var142 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        assert NIL != module0130.f8516(var96) : var96;
        SubLObject var144 = (SubLObject)NIL;
        final SubLObject var145 = var142;
        final SubLObject var146 = module0147.$g2094$.currentBinding(var143);
        final SubLObject var147 = module0147.$g2095$.currentBinding(var143);
        try {
            module0147.$g2094$.bind(module0147.f9536(var145), var143);
            module0147.$g2095$.bind(module0147.f9537(var145), var143);
            if (NIL != var19) {
                if (NIL != module0158.f10146(var141, var96, var19)) {
                    final SubLObject var148 = module0158.f10147(var141, var96, var19);
                    SubLObject var149 = (SubLObject)NIL;
                    final SubLObject var150 = (SubLObject)NIL;
                    while (NIL == var149) {
                        final SubLObject var151 = module0052.f3695(var148, var150);
                        final SubLObject var152 = (SubLObject)makeBoolean(!var150.eql(var151));
                        if (NIL != var152) {
                            SubLObject var153 = (SubLObject)NIL;
                            try {
                                var153 = module0158.f10316(var151, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_288 = (SubLObject)NIL;
                                final SubLObject var38_289 = (SubLObject)NIL;
                                while (NIL == var37_288) {
                                    final SubLObject var154 = module0052.f3695(var153, var38_289);
                                    final SubLObject var40_290 = (SubLObject)makeBoolean(!var38_289.eql(var154));
                                    if (NIL != var40_290) {
                                        var144 = (SubLObject)ConsesLow.cons(var154, var144);
                                    }
                                    var37_288 = (SubLObject)makeBoolean(NIL == var40_290);
                                }
                            }
                            finally {
                                final SubLObject var33_291 = Threads.$is_thread_performing_cleanupP$.currentBinding(var143);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var143);
                                    if (NIL != var153) {
                                        module0158.f10319(var153);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_291, var143);
                                }
                            }
                        }
                        var149 = (SubLObject)makeBoolean(NIL == var152);
                    }
                }
            }
            else if (NIL != module0158.f10146(var141, var96, (SubLObject)NIL)) {
                final SubLObject var148 = module0158.f10147(var141, var96, (SubLObject)NIL);
                SubLObject var149 = (SubLObject)NIL;
                final SubLObject var150 = (SubLObject)NIL;
                while (NIL == var149) {
                    final SubLObject var151 = module0052.f3695(var148, var150);
                    final SubLObject var152 = (SubLObject)makeBoolean(!var150.eql(var151));
                    if (NIL != var152) {
                        SubLObject var153 = (SubLObject)NIL;
                        try {
                            var153 = module0158.f10316(var151, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_289 = (SubLObject)NIL;
                            final SubLObject var38_290 = (SubLObject)NIL;
                            while (NIL == var37_289) {
                                final SubLObject var154 = module0052.f3695(var153, var38_290);
                                final SubLObject var40_291 = (SubLObject)makeBoolean(!var38_290.eql(var154));
                                if (NIL != var40_291) {
                                    var144 = (SubLObject)ConsesLow.cons(var154, var144);
                                }
                                var37_289 = (SubLObject)makeBoolean(NIL == var40_291);
                            }
                        }
                        finally {
                            final SubLObject var33_292 = Threads.$is_thread_performing_cleanupP$.currentBinding(var143);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var143);
                                if (NIL != var153) {
                                    module0158.f10319(var153);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var33_292, var143);
                            }
                        }
                    }
                    var149 = (SubLObject)makeBoolean(NIL == var152);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var147, var143);
            module0147.$g2094$.rebind(var146, var143);
        }
        var144 = module0035.f2269(var144, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var144;
    }
    
    public static SubLObject f14521(final SubLObject var237, SubLObject var14, SubLObject var19) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var238 = SubLProcess.currentSubLThread();
        SubLObject var239 = (SubLObject)NIL;
        final SubLObject var240 = var14;
        final SubLObject var241 = module0147.$g2094$.currentBinding(var238);
        final SubLObject var242 = module0147.$g2095$.currentBinding(var238);
        try {
            module0147.$g2094$.bind(module0147.f9536(var240), var238);
            module0147.$g2095$.bind(module0147.f9537(var240), var238);
            if (NIL != var19) {
                if (NIL != module0158.f10175(var237, var19)) {
                    final SubLObject var243 = module0158.f10176(var237, var19);
                    SubLObject var244 = (SubLObject)NIL;
                    final SubLObject var245 = (SubLObject)NIL;
                    while (NIL == var244) {
                        final SubLObject var246 = module0052.f3695(var243, var245);
                        final SubLObject var247 = (SubLObject)makeBoolean(!var245.eql(var246));
                        if (NIL != var247) {
                            SubLObject var248 = (SubLObject)NIL;
                            try {
                                var248 = module0158.f10316(var246, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_296 = (SubLObject)NIL;
                                final SubLObject var38_297 = (SubLObject)NIL;
                                while (NIL == var37_296) {
                                    final SubLObject var249 = module0052.f3695(var248, var38_297);
                                    final SubLObject var40_298 = (SubLObject)makeBoolean(!var38_297.eql(var249));
                                    if (NIL != var40_298) {
                                        var239 = (SubLObject)ConsesLow.cons(var249, var239);
                                    }
                                    var37_296 = (SubLObject)makeBoolean(NIL == var40_298);
                                }
                            }
                            finally {
                                final SubLObject var33_299 = Threads.$is_thread_performing_cleanupP$.currentBinding(var238);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var238);
                                    if (NIL != var248) {
                                        module0158.f10319(var248);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_299, var238);
                                }
                            }
                        }
                        var244 = (SubLObject)makeBoolean(NIL == var247);
                    }
                }
            }
            else if (NIL != module0158.f10175(var237, (SubLObject)NIL)) {
                final SubLObject var243 = module0158.f10176(var237, (SubLObject)NIL);
                SubLObject var244 = (SubLObject)NIL;
                final SubLObject var245 = (SubLObject)NIL;
                while (NIL == var244) {
                    final SubLObject var246 = module0052.f3695(var243, var245);
                    final SubLObject var247 = (SubLObject)makeBoolean(!var245.eql(var246));
                    if (NIL != var247) {
                        SubLObject var248 = (SubLObject)NIL;
                        try {
                            var248 = module0158.f10316(var246, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_297 = (SubLObject)NIL;
                            final SubLObject var38_298 = (SubLObject)NIL;
                            while (NIL == var37_297) {
                                final SubLObject var249 = module0052.f3695(var248, var38_298);
                                final SubLObject var40_299 = (SubLObject)makeBoolean(!var38_298.eql(var249));
                                if (NIL != var40_299) {
                                    var239 = (SubLObject)ConsesLow.cons(var249, var239);
                                }
                                var37_297 = (SubLObject)makeBoolean(NIL == var40_299);
                            }
                        }
                        finally {
                            final SubLObject var33_300 = Threads.$is_thread_performing_cleanupP$.currentBinding(var238);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var238);
                                if (NIL != var248) {
                                    module0158.f10319(var248);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var33_300, var238);
                            }
                        }
                    }
                    var244 = (SubLObject)makeBoolean(NIL == var247);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var242, var238);
            module0147.$g2094$.rebind(var241, var238);
        }
        var239 = module0035.f2269(var239, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var239;
    }
    
    public static SubLObject f14522(final SubLObject var161, SubLObject var14, SubLObject var19) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var162 = SubLProcess.currentSubLThread();
        SubLObject var163 = (SubLObject)NIL;
        final SubLObject var164 = var14;
        final SubLObject var165 = module0147.$g2094$.currentBinding(var162);
        final SubLObject var166 = module0147.$g2095$.currentBinding(var162);
        try {
            module0147.$g2094$.bind(module0147.f9536(var164), var162);
            module0147.$g2095$.bind(module0147.f9537(var164), var162);
            if (NIL != var19) {
                if (NIL != module0158.f10198(var161, var19)) {
                    final SubLObject var167 = module0158.f10199(var161, var19);
                    SubLObject var168 = (SubLObject)NIL;
                    final SubLObject var169 = (SubLObject)NIL;
                    while (NIL == var168) {
                        final SubLObject var170 = module0052.f3695(var167, var169);
                        final SubLObject var171 = (SubLObject)makeBoolean(!var169.eql(var170));
                        if (NIL != var171) {
                            SubLObject var172 = (SubLObject)NIL;
                            try {
                                var172 = module0158.f10316(var170, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_304 = (SubLObject)NIL;
                                final SubLObject var38_305 = (SubLObject)NIL;
                                while (NIL == var37_304) {
                                    final SubLObject var173 = module0052.f3695(var172, var38_305);
                                    final SubLObject var40_306 = (SubLObject)makeBoolean(!var38_305.eql(var173));
                                    if (NIL != var40_306) {
                                        var163 = (SubLObject)ConsesLow.cons(var173, var163);
                                    }
                                    var37_304 = (SubLObject)makeBoolean(NIL == var40_306);
                                }
                            }
                            finally {
                                final SubLObject var33_307 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                                    if (NIL != var172) {
                                        module0158.f10319(var172);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_307, var162);
                                }
                            }
                        }
                        var168 = (SubLObject)makeBoolean(NIL == var171);
                    }
                }
            }
            else if (NIL != module0158.f10198(var161, (SubLObject)NIL)) {
                final SubLObject var167 = module0158.f10199(var161, (SubLObject)NIL);
                SubLObject var168 = (SubLObject)NIL;
                final SubLObject var169 = (SubLObject)NIL;
                while (NIL == var168) {
                    final SubLObject var170 = module0052.f3695(var167, var169);
                    final SubLObject var171 = (SubLObject)makeBoolean(!var169.eql(var170));
                    if (NIL != var171) {
                        SubLObject var172 = (SubLObject)NIL;
                        try {
                            var172 = module0158.f10316(var170, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_305 = (SubLObject)NIL;
                            final SubLObject var38_306 = (SubLObject)NIL;
                            while (NIL == var37_305) {
                                final SubLObject var173 = module0052.f3695(var172, var38_306);
                                final SubLObject var40_307 = (SubLObject)makeBoolean(!var38_306.eql(var173));
                                if (NIL != var40_307) {
                                    var163 = (SubLObject)ConsesLow.cons(var173, var163);
                                }
                                var37_305 = (SubLObject)makeBoolean(NIL == var40_307);
                            }
                        }
                        finally {
                            final SubLObject var33_308 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                                if (NIL != var172) {
                                    module0158.f10319(var172);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var33_308, var162);
                            }
                        }
                    }
                    var168 = (SubLObject)makeBoolean(NIL == var171);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var166, var162);
            module0147.$g2094$.rebind(var165, var162);
        }
        var163 = module0035.f2269(var163, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var163;
    }
    
    public static SubLObject f14523(final SubLObject var161, SubLObject var14, SubLObject var19) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var162 = SubLProcess.currentSubLThread();
        SubLObject var163 = (SubLObject)NIL;
        final SubLObject var164 = var14;
        final SubLObject var165 = module0147.$g2094$.currentBinding(var162);
        final SubLObject var166 = module0147.$g2095$.currentBinding(var162);
        try {
            module0147.$g2094$.bind(module0147.f9536(var164), var162);
            module0147.$g2095$.bind(module0147.f9537(var164), var162);
            if (NIL != var19) {
                if (NIL != module0158.f10221(var161, var19)) {
                    final SubLObject var167 = module0158.f10222(var161, var19);
                    SubLObject var168 = (SubLObject)NIL;
                    final SubLObject var169 = (SubLObject)NIL;
                    while (NIL == var168) {
                        final SubLObject var170 = module0052.f3695(var167, var169);
                        final SubLObject var171 = (SubLObject)makeBoolean(!var169.eql(var170));
                        if (NIL != var171) {
                            SubLObject var172 = (SubLObject)NIL;
                            try {
                                var172 = module0158.f10316(var170, (SubLObject)$ic20$, (SubLObject)NIL, var19);
                                SubLObject var37_312 = (SubLObject)NIL;
                                final SubLObject var38_313 = (SubLObject)NIL;
                                while (NIL == var37_312) {
                                    final SubLObject var173 = module0052.f3695(var172, var38_313);
                                    final SubLObject var40_314 = (SubLObject)makeBoolean(!var38_313.eql(var173));
                                    if (NIL != var40_314) {
                                        var163 = (SubLObject)ConsesLow.cons(var173, var163);
                                    }
                                    var37_312 = (SubLObject)makeBoolean(NIL == var40_314);
                                }
                            }
                            finally {
                                final SubLObject var33_315 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                                    if (NIL != var172) {
                                        module0158.f10319(var172);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33_315, var162);
                                }
                            }
                        }
                        var168 = (SubLObject)makeBoolean(NIL == var171);
                    }
                }
            }
            else if (NIL != module0158.f10221(var161, (SubLObject)NIL)) {
                final SubLObject var167 = module0158.f10222(var161, (SubLObject)NIL);
                SubLObject var168 = (SubLObject)NIL;
                final SubLObject var169 = (SubLObject)NIL;
                while (NIL == var168) {
                    final SubLObject var170 = module0052.f3695(var167, var169);
                    final SubLObject var171 = (SubLObject)makeBoolean(!var169.eql(var170));
                    if (NIL != var171) {
                        SubLObject var172 = (SubLObject)NIL;
                        try {
                            var172 = module0158.f10316(var170, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var37_313 = (SubLObject)NIL;
                            final SubLObject var38_314 = (SubLObject)NIL;
                            while (NIL == var37_313) {
                                final SubLObject var173 = module0052.f3695(var172, var38_314);
                                final SubLObject var40_315 = (SubLObject)makeBoolean(!var38_314.eql(var173));
                                if (NIL != var40_315) {
                                    var163 = (SubLObject)ConsesLow.cons(var173, var163);
                                }
                                var37_313 = (SubLObject)makeBoolean(NIL == var40_315);
                            }
                        }
                        finally {
                            final SubLObject var33_316 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                                if (NIL != var172) {
                                    module0158.f10319(var172);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var33_316, var162);
                            }
                        }
                    }
                    var168 = (SubLObject)makeBoolean(NIL == var171);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var166, var162);
            module0147.$g2094$.rebind(var165, var162);
        }
        var163 = module0035.f2269(var163, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var163;
    }
    
    public static SubLObject f14524(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        if (NIL != module0212.f13795(var28) || (NIL != module0161.f10481(var28) && NIL != module0217.f14342(module0161.f10557(var28)))) {
            final SubLObject var31 = module0018.$g584$.currentBinding(var29);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var29);
                final SubLObject var33_321 = module0147.$g2094$.currentBinding(var29);
                final SubLObject var32 = module0147.$g2095$.currentBinding(var29);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic98$, var29);
                    module0147.$g2095$.bind(var28, var29);
                    f14496(Symbols.symbol_function((SubLObject)$ic99$), module0161.f10557(var28), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var32, var29);
                    module0147.$g2094$.rebind(var33_321, var29);
                }
                var30 = module0018.$g584$.getDynamicValue(var29);
            }
            finally {
                module0018.$g584$.rebind(var31, var29);
            }
        }
        else {
            final SubLObject var33 = module0217.f14337(var28);
            if (NIL != var33) {
                var30 = conses_high.copy_list(module0212.f13828(var33));
            }
        }
        return var30;
    }
    
    public static SubLObject f14525(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        if (NIL != module0212.f13795(var28)) {
            final SubLObject var31 = module0018.$g584$.currentBinding(var29);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var29);
                f14502(Symbols.symbol_function((SubLObject)$ic99$), var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var30 = module0018.$g584$.getDynamicValue(var29);
            }
            finally {
                module0018.$g584$.rebind(var31, var29);
            }
        }
        else {
            final SubLObject var32 = module0217.f14351(var28);
            if (NIL != var32) {
                var30 = conses_high.copy_list(module0212.f13828(var32));
            }
        }
        return var30;
    }
    
    public static SubLObject f14526(final SubLObject var28, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        final SubLObject var31 = module0018.$g584$.currentBinding(var29);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var29);
            final SubLObject var32 = var14;
            final SubLObject var33_323 = module0147.$g2094$.currentBinding(var29);
            final SubLObject var33 = module0147.$g2095$.currentBinding(var29);
            try {
                module0147.$g2094$.bind(module0147.f9531(var32), var29);
                module0147.$g2095$.bind(module0147.f9534(var32), var29);
                f14491(Symbols.symbol_function((SubLObject)$ic99$), var28);
            }
            finally {
                module0147.$g2095$.rebind(var33, var29);
                module0147.$g2094$.rebind(var33_323, var29);
            }
            var30 = module0018.$g584$.getDynamicValue(var29);
        }
        finally {
            module0018.$g584$.rebind(var31, var29);
        }
        return var30;
    }
    
    public static SubLObject f14527(final SubLObject var324) {
        final SubLThread var325 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var324) : var324;
        SubLObject var326 = (SubLObject)NIL;
        final SubLObject var327 = module0018.$g584$.currentBinding(var325);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var325);
            f14491(Symbols.symbol_function((SubLObject)$ic109$), var324);
            var326 = module0018.$g584$.getDynamicValue(var325);
        }
        finally {
            module0018.$g584$.rebind(var327, var325);
        }
        return Sequences.nreverse(Sequences.remove_duplicates(var326, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14528() {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0018.$g584$.getDynamicValue(var30) && NIL != module0018.$g594$.getDynamicValue(var30));
    }
    
    public static SubLObject f14529() {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(module0018.$g596$.getDynamicValue(var30).isFunctionSpec() && NIL != Functions.funcall(module0018.$g596$.getDynamicValue(var30)));
    }
    
    public static SubLObject f14530(final SubLObject var325) {
        final SubLThread var326 = SubLProcess.currentSubLThread();
        module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var325, module0018.$g584$.getDynamicValue(var326)), var326);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14531(final SubLObject var325) {
        final SubLThread var326 = SubLProcess.currentSubLThread();
        module0018.$g584$.setDynamicValue(Numbers.add(module0018.$g584$.getDynamicValue(var326), (SubLObject)ONE_INTEGER), var326);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14532(final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        return module0178.f11309(var197, module0018.$g587$.getDynamicValue(var198));
    }
    
    public static SubLObject f14533(final SubLObject var197) {
        return (SubLObject)makeBoolean(NIL == f14532(var197));
    }
    
    public static SubLObject f14534(final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        if (NIL == module0018.$g603$.getDynamicValue(var198) || NIL != Functions.funcall(module0018.$g603$.getDynamicValue(var198), var197)) {
            final SubLObject var199 = module0538.f33478(var197, (SubLObject)UNPROVIDED);
            if (NIL == conses_high.member(var199, module0018.$g584$.getDynamicValue(var198), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var199, module0018.$g584$.getDynamicValue(var198)), var198);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14535(final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        if (NIL == module0018.$g603$.getDynamicValue(var198) || NIL != Functions.funcall(module0018.$g603$.getDynamicValue(var198), var197)) {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var197, module0018.$g584$.getDynamicValue(var198)), var198);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14536(final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        if (NIL == module0018.$g603$.getDynamicValue(var198) || NIL != Functions.funcall(module0018.$g603$.getDynamicValue(var198), var197)) {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var197, module0018.$g584$.getDynamicValue(var198)), var198);
        }
        if (NIL != f14529()) {
            module0012.f425();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14537(final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        if ((NIL == module0018.$g603$.getDynamicValue(var198) || NIL != Functions.funcall(module0018.$g603$.getDynamicValue(var198), var197)) && NIL == conses_high.member(var197, module0018.$g584$.getDynamicValue(var198), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var197, module0018.$g584$.getDynamicValue(var198)), var198);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14538(final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        final SubLObject var199 = module0211.f13701(var197);
        if (NIL != var199) {
            module0018.$g584$.setDynamicValue(ConsesLow.nconc(var199, module0018.$g584$.getDynamicValue(var198)), var198);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14539(final SubLObject var197, SubLObject var329, SubLObject var196) {
        if (var329 == UNPROVIDED) {
            var329 = module0018.$g590$.getDynamicValue();
        }
        if (var196 == UNPROVIDED) {
            var196 = module0018.$g593$.getDynamicValue();
        }
        final SubLThread var330 = SubLProcess.currentSubLThread();
        if (NIL != var196) {
            final SubLObject var331 = module0178.f11331(var197, var329);
            if (NIL == conses_high.member(var331, module0018.$g584$.getDynamicValue(var330), var196, Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var331, module0018.$g584$.getDynamicValue(var330)), var330);
            }
        }
        else {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(module0178.f11331(var197, var329), module0018.$g584$.getDynamicValue(var330)), var330);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14540(final SubLObject var197, SubLObject var329, SubLObject var330, SubLObject var331) {
        if (var329 == UNPROVIDED) {
            var329 = module0018.$g590$.getDynamicValue();
        }
        if (var330 == UNPROVIDED) {
            var330 = module0018.$g601$.getDynamicValue();
        }
        if (var331 == UNPROVIDED) {
            var331 = module0018.$g602$.getDynamicValue();
        }
        final SubLThread var332 = SubLProcess.currentSubLThread();
        final SubLObject var333 = Functions.apply(var330, module0178.f11331(var197, var329), var331);
        if (NIL != var333) {
            final SubLObject var334 = var333;
            if (NIL == conses_high.member(var334, module0018.$g584$.getDynamicValue(var332), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var334, module0018.$g584$.getDynamicValue(var332)), var332);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14541() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0219", "f14473", "S#17325");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0219", "f14474", "S#17326");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0219", "f14475", "S#17327");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0219", "f14476", "S#17328");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14477", "S#17329", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14478", "S#17330", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14479", "S#17331", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14480", "S#17332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14481", "S#17152", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14482", "S#17153", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14483", "S#17154", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14484", "S#17155", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14485", "S#17156", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14486", "S#17157", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14487", "S#17158", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14488", "S#17159", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14489", "S#17160", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14490", "S#17333", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14491", "MAP-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14492", "S#17334", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14493", "MAP-TERM-SELECTIVE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14494", "S#17335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14495", "MAP-TERM-GAFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14496", "MAP-MT-CONTENTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14497", "S#17336", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14499", "S#17337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14498", "MAP-MT-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14500", "MAP-HLMT-CONTENTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14501", "MAP-HLMT-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14502", "MAP-OTHER-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14503", "GATHER-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14505", "S#17338", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14506", "S#17339", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14507", "S#17340", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14504", "S#17341", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14508", "GATHER-INDEX-IN-ANY-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14509", "GATHER-GAF-ARG-INDEX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14510", "S#17342", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14511", "GATHER-NART-ARG-INDEX", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14512", "GATHER-PREDICATE-EXTENT-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14513", "GATHER-FUNCTION-EXTENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14514", "GATHER-PREDICATE-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14515", "GATHER-PREDICATE-RULE-INDEX-IN-ALL-MTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14516", "GATHER-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14517", "GATHER-ISA-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14518", "GATHER-QUOTED-ISA-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14519", "GATHER-GENLS-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14520", "GATHER-GENL-MT-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14521", "GATHER-FUNCTION-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14522", "GATHER-EXCEPTION-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14523", "GATHER-PRAGMA-RULE-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14524", "GATHER-MT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14525", "GATHER-OTHER-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14526", "GATHER-TERM-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14527", "S#17301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14528", "S#17343", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14529", "S#17344", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14530", "S#17345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14531", "S#17346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14532", "S#17320", 1, 0, false);
        new $f14532$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14533", "S#17321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14534", "S#17347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14535", "S#17324", 1, 0, false);
        new $f14535$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14536", "S#17348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14537", "S#17349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14538", "S#17350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14539", "S#12702", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0219", "f14540", "S#17351", 1, 3, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14542() {
        $g2394$ = SubLFiles.defparameter("S#17352", (SubLObject)NIL);
        $g2395$ = SubLFiles.defparameter("S#17353", (SubLObject)NIL);
        $g2396$ = SubLFiles.defparameter("S#17354", (SubLObject)NIL);
        $g2397$ = SubLFiles.defparameter("S#17355", (SubLObject)NIL);
        $g2398$ = SubLFiles.defparameter("S#17356", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14543() {
        module0012.f368((SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)$ic33$, (SubLObject)$ic24$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)$ic24$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)$ic24$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic43$, (SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)$ic24$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic44$, (SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)$ic24$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic45$, (SubLObject)$ic38$, (SubLObject)$ic46$, (SubLObject)$ic24$, (SubLObject)$ic25$);
        module0012.f368((SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic55$, (SubLObject)$ic48$, (SubLObject)$ic56$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic58$, (SubLObject)$ic59$, (SubLObject)$ic60$, (SubLObject)$ic61$, (SubLObject)$ic50$);
        module0002.f35((SubLObject)$ic62$, (SubLObject)$ic63$);
        module0012.f368((SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)$ic66$, (SubLObject)$ic61$, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic67$, (SubLObject)$ic68$, (SubLObject)$ic69$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic70$, (SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic73$, (SubLObject)$ic74$, (SubLObject)$ic75$, (SubLObject)$ic76$, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)$ic79$, (SubLObject)$ic76$, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic80$, (SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)$ic76$, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic83$, (SubLObject)$ic81$, (SubLObject)$ic84$, (SubLObject)$ic76$, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic85$, (SubLObject)$ic81$, (SubLObject)$ic86$, (SubLObject)$ic76$, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic87$, (SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)$ic76$, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic90$, (SubLObject)$ic91$, (SubLObject)$ic92$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic93$, (SubLObject)$ic94$, (SubLObject)$ic95$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic96$, (SubLObject)$ic94$, (SubLObject)$ic97$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic100$, (SubLObject)$ic101$, (SubLObject)$ic102$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic103$, (SubLObject)$ic101$, (SubLObject)$ic104$, (SubLObject)NIL, (SubLObject)$ic50$);
        module0012.f368((SubLObject)$ic105$, (SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)NIL, (SubLObject)$ic50$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f14541();
    }
    
    public void initializeVariables() {
        f14542();
    }
    
    public void runTopLevelForms() {
        f14543();
    }
    
    static {
        me = (SubLFile)new module0219();
        $g2394$ = null;
        $g2395$ = null;
        $g2396$ = null;
        $g2397$ = null;
        $g2398$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17133", "CYC"), (SubLObject)makeSymbol("S#17357", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeUninternedSymbol("US#34A80D6");
        $ic2$ = makeSymbol("DO-INTERMEDIATE-INDEX");
        $ic3$ = makeSymbol("PWHEN");
        $ic4$ = makeSymbol("S#12350", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17133", "CYC"), (SubLObject)makeSymbol("S#17358", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic6$ = makeUninternedSymbol("US#1526883");
        $ic7$ = makeSymbol("RELEVANT-MT?");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17133", "CYC"), (SubLObject)makeSymbol("S#17359", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic9$ = makeUninternedSymbol("US#1F7E647");
        $ic10$ = makeSymbol("COR");
        $ic11$ = makeSymbol("NULL");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17135", "CYC"), (SubLObject)makeSymbol("S#16675", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic13$ = makeSymbol("S#16656", "CYC");
        $ic14$ = makeSymbol("S#16467", "CYC");
        $ic15$ = makeSymbol("FUNCTION-SPEC-P");
        $ic16$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic17$ = makeKeyword("MAPPING-DONE");
        $ic18$ = makeKeyword("GAF");
        $ic19$ = makeSymbol("SENSE-P");
        $ic20$ = makeKeyword("RULE");
        $ic21$ = makeSymbol("MAP-TERM");
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#12141", "CYC"));
        $ic23$ = makeString("Apply FUNCTION to each assertion indexed from TERM.");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("FUNCTION-SPEC-P")));
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("NULL"));
        $ic26$ = makeSymbol("S#17335", "CYC");
        $ic27$ = makeSymbol("MAP-TERM-SELECTIVE");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12576", "CYC"));
        $ic29$ = makeString("Apply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.\n  If TRUTH is nil, all assertions are mapped.");
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("FUNCTION-SPEC-P")));
        $ic31$ = makeSymbol("MAP-TERM-GAFS");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12576", "CYC"));
        $ic33$ = makeString("Apply FUNCTION to every gaf indexed from TERM.\n   If TRUTH is nil, all assertions are mapped.");
        $ic34$ = makeString("mapping broad mt index");
        $ic35$ = makeSymbol("STRINGP");
        $ic36$ = makeKeyword("SKIP");
        $ic37$ = makeSymbol("MAP-MT-CONTENTS");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#17360", "CYC"));
        $ic39$ = makeString("Apply FUNCTION to each assertion with TRUTH in MT TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");
        $ic40$ = makeSymbol("MAP-MT-INDEX");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#17360", "CYC"));
        $ic42$ = makeString("Apply FUNCTION to each assertion with TRUTH at mt index MT.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");
        $ic43$ = makeSymbol("MAP-HLMT-CONTENTS");
        $ic44$ = makeSymbol("MAP-HLMT-INDEX");
        $ic45$ = makeSymbol("MAP-OTHER-INDEX");
        $ic46$ = makeString("Apply FUNCTION to each assertion with TRUTH at other index TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");
        $ic47$ = makeSymbol("GATHER-INDEX");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#17361", "CYC"));
        $ic49$ = makeString("Return a list of all mt-relevant assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("ASSERTION-P")));
        $ic51$ = makeString("So don't!");
        $ic52$ = makeString("Can't gather unknown auxiliary index ~s~%");
        $ic53$ = makeSymbol("S#12274", "CYC");
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic55$ = makeSymbol("GATHER-INDEX-IN-ANY-MT");
        $ic56$ = makeString("Return a list of all assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.");
        $ic57$ = makeKeyword("TRUE");
        $ic58$ = makeSymbol("GATHER-GAF-ARG-INDEX");
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeKeyword("TRUE")));
        $ic60$ = makeString("Return a list of all gaf assertions such that:\na) TERM is its ARGNUMth argument\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if PRED is non-nil, then PRED must be its predicate\nd) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("POSITIVE-INTEGER-P")));
        $ic62$ = makeSymbol("S#17342", "CYC");
        $ic63$ = ConsesLow.list((SubLObject)makeSymbol("GATHER-GAF-ARG-INDEX"));
        $ic64$ = makeSymbol("GATHER-NART-ARG-INDEX");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#168", "CYC"));
        $ic66$ = makeString("Return a list of all #$termOfUnit assertions with a naut arg2 such that:\na) TERM is its ARGNUMth argument\nb) if FUNC is non-nil, then FUNC must be its functor");
        $ic67$ = makeSymbol("GATHER-PREDICATE-EXTENT-INDEX");
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeKeyword("TRUE")));
        $ic69$ = makeString("Return a list of all gaf assertions such that:\na) PRED is its predicate\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if MT is non-nil, then MT must be its microtheory.");
        $ic70$ = makeSymbol("GATHER-FUNCTION-EXTENT-INDEX");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("S#168", "CYC"));
        $ic72$ = makeString("Return a list of all #$termOfUnit assertions such that:\nFUNC is the functor of the naut arg2.");
        $ic73$ = makeSymbol("GATHER-PREDICATE-RULE-INDEX");
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"));
        $ic75$ = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
        $ic76$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("SENSE-P")));
        $ic77$ = makeSymbol("GATHER-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#5432", "CYC"));
        $ic79$ = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");
        $ic80$ = makeSymbol("GATHER-ISA-RULE-INDEX");
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("S#12458", "CYC"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"));
        $ic82$ = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
        $ic83$ = makeSymbol("GATHER-QUOTED-ISA-RULE-INDEX");
        $ic84$ = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
        $ic85$ = makeSymbol("GATHER-GENLS-RULE-INDEX");
        $ic86$ = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
        $ic87$ = makeSymbol("GATHER-GENL-MT-RULE-INDEX");
        $ic88$ = ConsesLow.list((SubLObject)makeSymbol("S#13096", "CYC"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#17362", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"));
        $ic89$ = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)\nb) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)\nc) if RULE-MT is non-nil, then RULE-MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
        $ic90$ = makeSymbol("GATHER-FUNCTION-RULE-INDEX");
        $ic91$ = ConsesLow.list((SubLObject)makeSymbol("S#168", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"));
        $ic92$ = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");
        $ic93$ = makeSymbol("GATHER-EXCEPTION-RULE-INDEX");
        $ic94$ = ConsesLow.list((SubLObject)makeSymbol("S#13097", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"));
        $ic95$ = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (abnormal <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");
        $ic96$ = makeSymbol("GATHER-PRAGMA-RULE-INDEX");
        $ic97$ = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");
        $ic98$ = makeSymbol("S#12276", "CYC");
        $ic99$ = makeSymbol("S#17324", "CYC");
        $ic100$ = makeSymbol("GATHER-MT-INDEX");
        $ic101$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"));
        $ic102$ = makeString("Return a list of all assertions such that TERM is its microtheory.");
        $ic103$ = makeSymbol("GATHER-OTHER-INDEX");
        $ic104$ = makeString("Return a list of other assertions mentioning TERM but not indexed in any other more useful manner.");
        $ic105$ = makeSymbol("GATHER-TERM-ASSERTIONS");
        $ic106$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic107$ = makeString("Return a list of all mt-relevant assertions of TERM.");
        $ic108$ = makeSymbol("FORT-P");
        $ic109$ = makeSymbol("S#17350", "CYC");
    }
    
    public static final class $f14532$UnaryFunction extends UnaryFunction
    {
        public $f14532$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#17320"));
        }
        
        public SubLObject processItem(final SubLObject var326) {
            return f14532(var326);
        }
    }
    
    public static final class $f14535$UnaryFunction extends UnaryFunction
    {
        public $f14535$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#17324"));
        }
        
        public SubLObject processItem(final SubLObject var326) {
            return f14535(var326);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2262 ms
	
	Decompiled with Procyon 0.5.32.
*/