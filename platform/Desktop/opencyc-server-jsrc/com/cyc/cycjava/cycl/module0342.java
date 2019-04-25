package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0342 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0342";
    public static final String myFingerPrint = "011f155394eb5b7913fc9d33ac2acdeff423e993832c19fd52595eba11e3f3a7";
    public static SubLSymbol $g2221$;
    private static SubLSymbol $g2939$;
    private static SubLSymbol $g2940$;
    private static SubLSymbol $g2941$;
    private static SubLSymbol $g2942$;
    private static SubLSymbol $g2943$;
    private static SubLSymbol $g2944$;
    private static SubLSymbol $g2945$;
    private static SubLSymbol $g2946$;
    private static SubLSymbol $g2947$;
    private static SubLSymbol $g2948$;
    public static SubLSymbol $g2949$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLList $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLInteger $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    
    public static SubLObject f23104(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        return module0035.f2170(var1, $g2939$.getDynamicValue(var2));
    }
    
    public static SubLObject f23105(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic1$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic1$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.listS((SubLObject)$ic4$, var8, (SubLObject)$ic5$))), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23106(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles_oc.f11659(var9) : var9;
        return module0035.f2170(var9, $g2940$.getDynamicValue(var10));
    }
    
    public static SubLObject f23107(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic7$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic7$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)ConsesLow.listS((SubLObject)$ic4$, var8, (SubLObject)$ic9$))), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23108(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != deduction_handles_oc.f11659(var13) && NIL != f23106(var13));
    }
    
    public static SubLObject f23109(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic7$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic7$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9;
            var6 = (var9 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic11$, (SubLObject)ConsesLow.list(var8), ConsesLow.append(var9, (SubLObject)NIL)), reader.bq_cons((SubLObject)$ic12$, ConsesLow.append(var9, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23110() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0107.f7629($g2941$.getDynamicValue(var2));
    }
    
    public static SubLObject f23111(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != f23110()) {
            if (NIL == conses_high.member(var17, $g2941$.getDynamicValue(var18), Symbols.symbol_function((SubLObject)$ic14$), Symbols.symbol_function((SubLObject)IDENTITY))) {
                $g2941$.setDynamicValue((SubLObject)ConsesLow.cons(var17, $g2941$.getDynamicValue(var18)), var18);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23112(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)$ic15$, reader.bq_cons((SubLObject)$ic12$, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic16$, ConsesLow.append(var7, (SubLObject)$ic17$)));
    }
    
    public static SubLObject f23113(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic18$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f23114() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return conses_high.copy_list($g2941$.getDynamicValue(var2));
    }
    
    public static SubLObject f23115() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        final SubLObject var4 = f23114();
        final SubLObject var5 = $g2941$.currentBinding(var2);
        try {
            $g2941$.bind((SubLObject)$ic13$, var2);
            SubLObject var6 = var4;
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                if (NIL != module0540.f33510(var7)) {
                    var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        finally {
            $g2941$.rebind(var5, var2);
        }
        return var3;
    }
    
    public static SubLObject f23116(final SubLObject var1, final SubLObject var27) {
        final SubLObject var28 = assertions_interface_oc.f11093(var1, var27);
        if (NIL != var28) {
            return f23117(var1, var28, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23118(final SubLObject var1, final SubLObject var27, SubLObject var29) {
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)T;
        }
        final SubLObject var30 = (NIL != var29) ? assertions_interface_oc.f11098(var1, var27) : module0191.f11941(var1, var27);
        if (NIL != var30) {
            return f23117(var1, var30, var29);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23119(final SubLObject var1, final SubLObject var30, final SubLObject var27) {
        final SubLObject var31 = module0188.f11772(var1, var30, var27);
        f23117(var1, var31, (SubLObject)UNPROVIDED);
        return var31;
    }
    
    public static SubLObject f23117(final SubLObject var1, final SubLObject var13, SubLObject var29) {
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)T;
        }
        assert NIL != module0191.f11910(var13) : var13;
        SubLObject var30 = (SubLObject)NIL;
        try {
            f23120(var1, var29, (SubLObject)UNPROVIDED);
            module0343.f23187(var13, var1);
            var30 = (SubLObject)T;
        }
        finally {
            final SubLObject var31 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL == var30) {
                    f23121(var13, var1, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var31);
            }
        }
        return var13;
    }
    
    public static SubLObject f23121(final SubLObject var13, final SubLObject var32, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11910(var13) : var13;
        if (NIL != module0191.f11912(var13, (SubLObject)UNPROVIDED) && NIL == f23108(var13)) {
            SubLObject var35 = (SubLObject)NIL;
            if (NIL != deduction_handles_oc.f11659(var13)) {
                final SubLObject var36 = $g2940$.currentBinding(var34);
                try {
                    $g2940$.bind(conses_high.adjoin(var13, $g2940$.getDynamicValue(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var34);
                    if (NIL == var33 || NIL == assertion_handles_oc.f11035(var32) || NIL == module0191.f11932(var13)) {
                        module0191.f11930(var13, var32);
                    }
                    if (NIL != assertion_handles_oc.f11035(var32)) {
                        if (NIL != assertion_handles_oc.f11041(var32, (SubLObject)UNPROVIDED)) {
                            var35 = f23122(var13, var32, var33);
                        }
                        else {
                            var35 = (SubLObject)T;
                        }
                    }
                    else if (NIL != module0191.f11952(var32)) {
                        final SubLObject var37 = module0183.f11552(var32);
                        if (NIL != var37) {
                            var35 = module0183.f11622(var37);
                        }
                        else {
                            var35 = (SubLObject)T;
                        }
                    }
                }
                finally {
                    $g2940$.rebind(var36, var34);
                }
            }
            else {
                if (NIL == var33 || NIL == assertion_handles_oc.f11035(var32) || NIL == module0191.f11932(var13)) {
                    module0191.f11930(var13, var32);
                }
                if (NIL != assertion_handles_oc.f11035(var32)) {
                    if (NIL != assertion_handles_oc.f11041(var32, (SubLObject)UNPROVIDED)) {
                        var35 = f23122(var13, var32, var33);
                    }
                    else {
                        var35 = (SubLObject)T;
                    }
                }
                else if (NIL != module0191.f11952(var32)) {
                    final SubLObject var38 = module0183.f11552(var32);
                    if (NIL != var38) {
                        var35 = module0183.f11622(var38);
                    }
                    else {
                        var35 = (SubLObject)T;
                    }
                }
            }
            return var35;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23122(final SubLObject var13, final SubLObject var1, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)NIL;
        if (NIL != f23110()) {
            if (NIL != module0183.f11616()) {
                var35 = f23120(var1, (SubLObject)T, var33);
                if (NIL != assertion_handles_oc.f11041(var1, (SubLObject)UNPROVIDED)) {
                    try {
                        if (NIL != var35) {
                            final SubLObject var36 = $g2939$.currentBinding(var34);
                            try {
                                $g2939$.bind(conses_high.adjoin(var1, $g2939$.getDynamicValue(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var34);
                                module0343.f23191(var13, var1);
                            }
                            finally {
                                $g2939$.rebind(var36, var34);
                            }
                        }
                        else {
                            module0343.f23191(var13, var1);
                        }
                    }
                    finally {
                        final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var34);
                            if (NIL != var35) {
                                if (NIL != module0178.f11361(var1, (SubLObject)UNPROVIDED)) {
                                    if (NIL != f23104(var1)) {
                                        if (NIL != $g2942$.getDynamicValue(var34)) {
                                            f23123(var1);
                                        }
                                    }
                                    else {
                                        f23124(var1);
                                    }
                                }
                            }
                            else if (NIL != module0018.$g627$.getDynamicValue(var34) && NIL == f23125(var1, (SubLObject)UNPROVIDED)) {
                                f23126(var1);
                                var35 = (SubLObject)T;
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var37, var34);
                        }
                    }
                }
            }
            else {
                final SubLObject var36 = module0183.$g2227$.currentBinding(var34);
                try {
                    module0183.$g2227$.bind(module0055.f4017(), var34);
                    var35 = f23120(var1, (SubLObject)T, var33);
                    if (NIL != assertion_handles_oc.f11041(var1, (SubLObject)UNPROVIDED)) {
                        try {
                            if (NIL != var35) {
                                final SubLObject var25_37 = $g2939$.currentBinding(var34);
                                try {
                                    $g2939$.bind(conses_high.adjoin(var1, $g2939$.getDynamicValue(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var34);
                                    module0343.f23191(var13, var1);
                                }
                                finally {
                                    $g2939$.rebind(var25_37, var34);
                                }
                            }
                            else {
                                module0343.f23191(var13, var1);
                            }
                        }
                        finally {
                            final SubLObject var25_38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var34);
                                if (NIL != var35) {
                                    if (NIL != module0178.f11361(var1, (SubLObject)UNPROVIDED)) {
                                        if (NIL != f23104(var1)) {
                                            if (NIL != $g2942$.getDynamicValue(var34)) {
                                                f23123(var1);
                                            }
                                        }
                                        else {
                                            f23124(var1);
                                        }
                                    }
                                }
                                else if (NIL != module0018.$g627$.getDynamicValue(var34) && NIL == f23125(var1, (SubLObject)UNPROVIDED)) {
                                    f23126(var1);
                                    var35 = (SubLObject)T;
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_38, var34);
                            }
                        }
                    }
                    module0183.f11618();
                }
                finally {
                    module0183.$g2227$.rebind(var36, var34);
                }
            }
        }
        else {
            final SubLObject var36 = $g2941$.currentBinding(var34);
            try {
                $g2941$.bind((SubLObject)NIL, var34);
                if (NIL != module0183.f11616()) {
                    var35 = f23120(var1, (SubLObject)T, var33);
                    if (NIL != assertion_handles_oc.f11041(var1, (SubLObject)UNPROVIDED)) {
                        try {
                            if (NIL != var35) {
                                final SubLObject var25_39 = $g2939$.currentBinding(var34);
                                try {
                                    $g2939$.bind(conses_high.adjoin(var1, $g2939$.getDynamicValue(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var34);
                                    module0343.f23191(var13, var1);
                                }
                                finally {
                                    $g2939$.rebind(var25_39, var34);
                                }
                            }
                            else {
                                module0343.f23191(var13, var1);
                            }
                        }
                        finally {
                            final SubLObject var25_40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var34);
                                if (NIL != var35) {
                                    if (NIL != module0178.f11361(var1, (SubLObject)UNPROVIDED)) {
                                        if (NIL != f23104(var1)) {
                                            if (NIL != $g2942$.getDynamicValue(var34)) {
                                                f23123(var1);
                                            }
                                        }
                                        else {
                                            f23124(var1);
                                        }
                                    }
                                }
                                else if (NIL != module0018.$g627$.getDynamicValue(var34) && NIL == f23125(var1, (SubLObject)UNPROVIDED)) {
                                    f23126(var1);
                                    var35 = (SubLObject)T;
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_40, var34);
                            }
                        }
                    }
                }
                else {
                    final SubLObject var25_41 = module0183.$g2227$.currentBinding(var34);
                    try {
                        module0183.$g2227$.bind(module0055.f4017(), var34);
                        var35 = f23120(var1, (SubLObject)T, var33);
                        if (NIL != assertion_handles_oc.f11041(var1, (SubLObject)UNPROVIDED)) {
                            try {
                                if (NIL != var35) {
                                    final SubLObject var25_42 = $g2939$.currentBinding(var34);
                                    try {
                                        $g2939$.bind(conses_high.adjoin(var1, $g2939$.getDynamicValue(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var34);
                                        module0343.f23191(var13, var1);
                                    }
                                    finally {
                                        $g2939$.rebind(var25_42, var34);
                                    }
                                }
                                else {
                                    module0343.f23191(var13, var1);
                                }
                            }
                            finally {
                                final SubLObject var25_43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var34);
                                    if (NIL != var35) {
                                        if (NIL != module0178.f11361(var1, (SubLObject)UNPROVIDED)) {
                                            if (NIL != f23104(var1)) {
                                                if (NIL != $g2942$.getDynamicValue(var34)) {
                                                    f23123(var1);
                                                }
                                            }
                                            else {
                                                f23124(var1);
                                            }
                                        }
                                    }
                                    else if (NIL != module0018.$g627$.getDynamicValue(var34) && NIL == f23125(var1, (SubLObject)UNPROVIDED)) {
                                        f23126(var1);
                                        var35 = (SubLObject)T;
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var25_43, var34);
                                }
                            }
                        }
                        module0183.f11618();
                    }
                    finally {
                        module0183.$g2227$.rebind(var25_41, var34);
                    }
                }
                f23115();
            }
            finally {
                $g2941$.rebind(var36, var34);
            }
        }
        return var35;
    }
    
    public static SubLObject f23127(final SubLObject var44) {
        if (NIL == var44) {
            return (SubLObject)NIL;
        }
        return f23128(var44);
    }
    
    public static SubLObject f23128(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (NIL != f23110()) {
            SubLObject var46 = var44;
            SubLObject var47 = (SubLObject)NIL;
            var47 = var46.first();
            while (NIL != var46) {
                f23126(var47);
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        else {
            final SubLObject var48 = $g2941$.currentBinding(var45);
            try {
                $g2941$.bind((SubLObject)NIL, var45);
                SubLObject var49 = var44;
                SubLObject var50 = (SubLObject)NIL;
                var50 = var49.first();
                while (NIL != var49) {
                    f23126(var50);
                    var49 = var49.rest();
                    var50 = var49.first();
                }
                f23115();
            }
            finally {
                $g2941$.rebind(var48, var45);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23126(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        if (NIL != assertion_handles_oc.f11041(var1, (SubLObject)UNPROVIDED)) {
            if (NIL == f23104(var1)) {
                return f23124(var1);
            }
            if (NIL != $g2943$.getDynamicValue(var2) && NIL != f23104(var1)) {
                return f23123(var1);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23124(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0197.f12269(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0183.f11616()) {
            final SubLObject var3 = $g2939$.currentBinding(var2);
            try {
                $g2939$.bind(conses_high.adjoin(var1, $g2939$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
                final SubLObject var4 = module0178.f11299(var1);
                if (NIL == var4) {
                    f23123(var1);
                }
                else {
                    final SubLObject var5 = (SubLObject)makeBoolean(NIL != module0035.f1997(var4) && NIL != module0191.f11932(module0035.f2113(var4)));
                    SubLObject var6 = var4;
                    SubLObject var7 = (SubLObject)NIL;
                    var7 = var6.first();
                    while (NIL != var6) {
                        f23121(var7, var1, var5);
                        var6 = var6.rest();
                        var7 = var6.first();
                    }
                    if (NIL != assertion_handles_oc.f11041(var1, (SubLObject)UNPROVIDED)) {
                        f23123(var1);
                    }
                }
            }
            finally {
                $g2939$.rebind(var3, var2);
            }
        }
        else {
            final SubLObject var3 = module0183.$g2227$.currentBinding(var2);
            try {
                module0183.$g2227$.bind(module0055.f4017(), var2);
                final SubLObject var25_46 = $g2939$.currentBinding(var2);
                try {
                    $g2939$.bind(conses_high.adjoin(var1, $g2939$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
                    final SubLObject var8 = module0178.f11299(var1);
                    if (NIL == var8) {
                        f23123(var1);
                    }
                    else {
                        final SubLObject var9 = (SubLObject)makeBoolean(NIL != module0035.f1997(var8) && NIL != module0191.f11932(module0035.f2113(var8)));
                        SubLObject var10 = var8;
                        SubLObject var11 = (SubLObject)NIL;
                        var11 = var10.first();
                        while (NIL != var10) {
                            f23121(var11, var1, var9);
                            var10 = var10.rest();
                            var11 = var10.first();
                        }
                        if (NIL != assertion_handles_oc.f11041(var1, (SubLObject)UNPROVIDED)) {
                            f23123(var1);
                        }
                    }
                }
                finally {
                    $g2939$.rebind(var25_46, var2);
                }
                module0183.f11618();
            }
            finally {
                module0183.$g2227$.rebind(var3, var2);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23123(final SubLObject var1) {
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        module0217.f14370(var1);
        module0528.f32918(var1);
        if (NIL != module0178.f11290(var1)) {
            module0414.f28883(var1);
        }
        if (NIL == module0228.f15209(var1)) {
            return module0178.f11369(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23129(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles_oc.f11659(var9) : var9;
        final SubLObject var11 = module0188.f11781(var9);
        SubLObject var12 = (SubLObject)NIL;
        if (NIL != module0183.f11616()) {
            var12 = f23121(var9, var11, (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var13 = module0183.$g2227$.currentBinding(var10);
            try {
                module0183.$g2227$.bind(module0055.f4017(), var10);
                var12 = f23121(var9, var11, (SubLObject)UNPROVIDED);
                module0183.f11618();
            }
            finally {
                module0183.$g2227$.rebind(var13, var10);
            }
        }
        return var12;
    }
    
    public static SubLObject f23130(final SubLObject var49, final SubLObject var1, final SubLObject var27) {
        assert NIL != module0191.f11932(var49) : var49;
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        assert NIL != module0130.f8520(var27) : var27;
        assertions_interface_oc.f11095(var1, var27);
        f23120(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0343.f23191(var49, var1);
        module0343.f23187(var49, var1);
        return var49;
    }
    
    public static SubLObject f23120(final SubLObject var1, SubLObject var29, SubLObject var33) {
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)T;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        if (NIL != var33 || NIL == module0211.f13664(var1)) {
            final SubLObject var37 = $g2939$.currentBinding(var34);
            try {
                $g2939$.bind(conses_high.adjoin(var1, $g2939$.getDynamicValue(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var34);
                f23131(var1);
            }
            finally {
                $g2939$.rebind(var37, var34);
            }
            var36 = (SubLObject)T;
        }
        else {
            final SubLObject var38 = (SubLObject)((NIL != var29) ? module0178.f11302(var1) : $ic22$);
            final SubLObject var39 = module0346.f23314(var1);
            if (NIL == module0018.$g574$.getDynamicValue(var34)) {
                if (!var38.eql(var39)) {
                    if (module0130.f8524(var38).eql(module0130.f8524(var39))) {
                        f23132(var1);
                    }
                    else {
                        f23131(var1);
                        var35 = (SubLObject)T;
                    }
                }
            }
        }
        if (NIL != var35) {
            module0332.f22404(var1);
            if (NIL != var29 && module0178.f11291(var1) == $ic23$) {
                module0528.f32917(var1);
            }
        }
        return var36;
    }
    
    public static SubLObject f23133(final SubLObject var1, final SubLObject var54) {
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        assert NIL != module0130.f8503(var54) : var54;
        assertions_interface_oc.f11077(var1, var54);
        if (var54 == $ic23$) {
            module0528.f32917(var1);
        }
        return var1;
    }
    
    public static SubLObject f23134(final SubLObject var1) {
        f23131(var1);
        f23120(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var2 = module0178.f11299(var1);
        SubLObject var3 = (SubLObject)NIL;
        var3 = var2.first();
        while (NIL != var2) {
            module0343.f23191(var3, var1);
            module0343.f23187(var3, var1);
            var2 = var2.rest();
            var3 = var2.first();
        }
        return var1;
    }
    
    public static SubLObject f23131(final SubLObject var1) {
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var2 = module0178.f11300(var1);
        SubLObject var3;
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        for (var3 = module0032.f1741(var2), var4 = (SubLObject)NIL, var4 = module0032.f1742(var3, var2); NIL == module0032.f1744(var3, var4); var4 = module0032.f1743(var4)) {
            var5 = module0032.f1745(var3, var4);
            if (NIL != module0032.f1746(var4, var5) && NIL != deduction_handles_oc.f11671(var5, (SubLObject)UNPROVIDED)) {
                var6 = module0188.f11781(var5);
                f23121(var5, var6, (SubLObject)UNPROVIDED);
            }
        }
        return var1;
    }
    
    public static SubLObject f23132(final SubLObject var1) {
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var2 = module0178.f11300(var1);
        SubLObject var3;
        SubLObject var4;
        SubLObject var5;
        for (var3 = module0032.f1741(var2), var4 = (SubLObject)NIL, var4 = module0032.f1742(var3, var2); NIL == module0032.f1744(var3, var4); var4 = module0032.f1743(var4)) {
            var5 = module0032.f1745(var3, var4);
            if (NIL != module0032.f1746(var4, var5)) {
                f23135(var5);
            }
        }
        return var1;
    }
    
    public static SubLObject f23135(final SubLObject var9) {
        assert NIL != deduction_handles_oc.f11659(var9) : var9;
        final SubLObject var10 = module0191.f11926(var9);
        final SubLObject var11 = module0346.f23313(var9);
        if (!var10.eql(var11)) {
            final SubLObject var12 = module0188.f11781(var9);
            if (NIL != assertion_handles_oc.f11035(var12)) {
                f23120(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return var9;
    }
    
    public static SubLObject f23136(final SubLObject var61, SubLObject var62) {
        if (var62 == UNPROVIDED) {
            var62 = (SubLObject)NIL;
        }
        final SubLThread var63 = SubLProcess.currentSubLThread();
        assert NIL != module0161.f10481(var61) : var61;
        final SubLObject var64 = module0158.f10289(var61);
        if (var64.eql((SubLObject)$ic26$)) {
            if (NIL != module0158.f10270(var61, (SubLObject)NIL)) {
                final SubLObject var65 = module0158.f10271(var61);
                SubLObject var66 = (SubLObject)NIL;
                try {
                    var66 = module0158.f10316(var65, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var67 = (SubLObject)NIL;
                    final SubLObject var68 = (SubLObject)NIL;
                    while (NIL == var67) {
                        final SubLObject var69 = module0052.f3695(var66, var68);
                        final SubLObject var70 = (SubLObject)makeBoolean(!var68.eql(var69));
                        if (NIL != var70) {
                            SubLObject var72;
                            final SubLObject var71 = var72 = module0178.f11299(var69);
                            SubLObject var73 = (SubLObject)NIL;
                            var73 = var72.first();
                            while (NIL != var72) {
                                if (NIL == var62 || NIL != deduction_handles_oc.f11659(var73)) {
                                    f23121(var73, var69, (SubLObject)UNPROVIDED);
                                }
                                var72 = var72.rest();
                                var73 = var72.first();
                            }
                        }
                        var67 = (SubLObject)makeBoolean(NIL == var70);
                    }
                }
                finally {
                    final SubLObject var74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var63);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var63);
                        if (NIL != var66) {
                            module0158.f10319(var66);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var74, var63);
                    }
                }
            }
        }
        else if (var64.eql((SubLObject)$ic27$) && NIL != module0158.f10286(var61, (SubLObject)NIL)) {
            final SubLObject var75 = assertion_handles_oc.f11010();
            final SubLObject var76 = (SubLObject)$ic28$;
            final SubLObject var77 = module0065.f4733(var75);
            SubLObject var78 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var76) : var76;
            final SubLObject var79 = module0012.$g75$.currentBinding(var63);
            final SubLObject var80 = module0012.$g76$.currentBinding(var63);
            final SubLObject var81 = module0012.$g77$.currentBinding(var63);
            final SubLObject var82 = module0012.$g78$.currentBinding(var63);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var63);
                module0012.$g76$.bind((SubLObject)NIL, var63);
                module0012.$g77$.bind((SubLObject)T, var63);
                module0012.$g78$.bind(Time.get_universal_time(), var63);
                module0012.f478(var76);
                final SubLObject var76_77 = var75;
                if (NIL == module0065.f4772(var76_77, (SubLObject)$ic30$)) {
                    final SubLObject var78_79 = var76_77;
                    if (NIL == module0065.f4775(var78_79, (SubLObject)$ic30$)) {
                        final SubLObject var83 = module0065.f4740(var78_79);
                        final SubLObject var84 = (SubLObject)NIL;
                        SubLObject var85;
                        SubLObject var86;
                        SubLObject var87;
                        SubLObject var88;
                        SubLObject var90;
                        SubLObject var89;
                        SubLObject var91;
                        for (var85 = Sequences.length(var83), var86 = (SubLObject)NIL, var86 = (SubLObject)ZERO_INTEGER; var86.numL(var85); var86 = Numbers.add(var86, (SubLObject)ONE_INTEGER)) {
                            var87 = ((NIL != var84) ? Numbers.subtract(var85, var86, (SubLObject)ONE_INTEGER) : var86);
                            var88 = Vectors.aref(var83, var87);
                            if (NIL == module0065.f4749(var88) || NIL == module0065.f4773((SubLObject)$ic30$)) {
                                if (NIL != module0065.f4749(var88)) {
                                    var88 = (SubLObject)$ic30$;
                                }
                                module0012.note_percent_progress(var78, var77);
                                var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var88, var61, (SubLObject)NIL, (SubLObject)NIL)) {
                                    var89 = (var90 = module0178.f11299(var88));
                                    var91 = (SubLObject)NIL;
                                    var91 = var90.first();
                                    while (NIL != var90) {
                                        if (NIL == var62 || NIL != deduction_handles_oc.f11659(var91)) {
                                            f23121(var91, var88, (SubLObject)UNPROVIDED);
                                        }
                                        var90 = var90.rest();
                                        var91 = var90.first();
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject var85_86 = var76_77;
                    if (NIL == module0065.f4777(var85_86) || NIL == module0065.f4773((SubLObject)$ic30$)) {
                        final SubLObject var92 = module0065.f4738(var85_86);
                        SubLObject var93 = module0065.f4739(var85_86);
                        final SubLObject var94 = module0065.f4734(var85_86);
                        final SubLObject var95 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic30$)) ? NIL : $ic30$);
                        while (var93.numL(var94)) {
                            final SubLObject var96 = Hashtables.gethash_without_values(var93, var92, var95);
                            if (NIL == module0065.f4773((SubLObject)$ic30$) || NIL == module0065.f4749(var96)) {
                                module0012.note_percent_progress(var78, var77);
                                var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var96, var61, (SubLObject)NIL, (SubLObject)NIL)) {
                                    SubLObject var98;
                                    final SubLObject var97 = var98 = module0178.f11299(var96);
                                    SubLObject var99 = (SubLObject)NIL;
                                    var99 = var98.first();
                                    while (NIL != var98) {
                                        if (NIL == var62 || NIL != deduction_handles_oc.f11659(var99)) {
                                            f23121(var99, var96, (SubLObject)UNPROVIDED);
                                        }
                                        var98 = var98.rest();
                                        var99 = var98.first();
                                    }
                                }
                            }
                            var93 = Numbers.add(var93, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var82, var63);
                module0012.$g77$.rebind(var81, var63);
                module0012.$g76$.rebind(var80, var63);
                module0012.$g75$.rebind(var79, var63);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23137(final SubLObject var1, final SubLObject var30, SubLObject var90) {
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)$ic31$;
        }
        final SubLObject var91 = module0188.f11778(var1, var30, var90);
        if (NIL != var91) {
            f23121(var91, var1, (SubLObject)UNPROVIDED);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23138(final SubLObject var1, final SubLObject var30, SubLObject var90) {
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)$ic31$;
        }
        if (NIL != f23139(var1, var30)) {
            return Values.values((SubLObject)NIL, (SubLObject)T);
        }
        final SubLObject var91 = module0188.f11778(var1, var30, var90);
        if (NIL != var91) {
            return Values.values(var91, (SubLObject)T);
        }
        final SubLObject var92 = module0346.f23311(var30, var90);
        final SubLObject var93 = f23119(var1, var30, var92);
        f23140(var1, var93);
        return Values.values(var93, (SubLObject)NIL);
    }
    
    public static SubLObject f23141(final SubLObject var93, final SubLObject var61, final SubLObject var30, SubLObject var90, SubLObject var54, SubLObject var94) {
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)$ic31$;
        }
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)$ic32$;
        }
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)NIL;
        }
        final SubLObject var95 = module0178.f11367(var93, var61, var94, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f23138(var95, var30, var90);
    }
    
    public static SubLObject f23139(final SubLObject var1, final SubLObject var30) {
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        return module0035.f2170(var1, var30);
    }
    
    public static SubLObject f23142(final SubLObject var9) {
        assert NIL != deduction_handles_oc.f11659(var9) : var9;
        return f23139(module0188.f11788(var9), module0188.f11770(var9));
    }
    
    public static SubLObject f23140(final SubLObject var1, final SubLObject var92) {
        SubLObject var93 = (SubLObject)ZERO_INTEGER;
        SubLObject var95;
        final SubLObject var94 = var95 = f23143(var1, var92);
        SubLObject var96 = (SubLObject)NIL;
        var96 = var95.first();
        while (NIL != var95) {
            if (NIL != module0191.f11912(var96, (SubLObject)UNPROVIDED)) {
                f23144(var96, var1);
                var93 = Numbers.add(var93, (SubLObject)ONE_INTEGER);
            }
            var95 = var95.rest();
            var96 = var95.first();
        }
        return var93;
    }
    
    public static SubLObject f23143(final SubLObject var1, final SubLObject var92) {
        SubLObject var93 = (SubLObject)NIL;
        if (NIL != f23145(var92)) {
            SubLObject var94 = (SubLObject)NIL;
            SubLObject var95 = (SubLObject)NIL;
            SubLObject var96 = module0188.f11770(var92);
            SubLObject var97 = (SubLObject)NIL;
            var97 = var96.first();
            while (NIL != var96) {
                if (NIL != module0228.f15209(var97)) {
                    var94 = module0178.f11335(var97);
                }
                else {
                    var95 = (SubLObject)ConsesLow.cons(var97, var95);
                }
                var96 = var96.rest();
                var97 = var96.first();
            }
            var96 = module0178.f11299(var1);
            SubLObject var98 = (SubLObject)NIL;
            var98 = var96.first();
            while (NIL != var96) {
                if (!var98.eql(var92) && NIL != f23146(var98, var94)) {
                    SubLObject var99 = (SubLObject)NIL;
                    SubLObject var26_101 = module0188.f11770(var98);
                    SubLObject var100 = (SubLObject)NIL;
                    var100 = var26_101.first();
                    while (NIL != var26_101) {
                        if (NIL == f23147(var100, var94)) {
                            var99 = (SubLObject)ConsesLow.cons(var100, var99);
                        }
                        var26_101 = var26_101.rest();
                        var100 = var26_101.first();
                    }
                    if (NIL != module0035.f2210(var95, var99)) {
                        var93 = (SubLObject)ConsesLow.cons(var98, var93);
                    }
                }
                var96 = var96.rest();
                var98 = var96.first();
            }
        }
        return Sequences.nreverse(var93);
    }
    
    public static SubLObject f23144(final SubLObject var96, final SubLObject var32) {
        return f23121(var96, var32, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23145(final SubLObject var103) {
        if (NIL != deduction_handles_oc.f11659(var103)) {
            SubLObject var104 = (SubLObject)ZERO_INTEGER;
            SubLObject var105 = module0188.f11770(var103);
            SubLObject var106 = (SubLObject)NIL;
            var106 = var105.first();
            while (NIL != var105) {
                if (NIL != module0228.f15209(var106)) {
                    var104 = Numbers.add(var104, (SubLObject)ONE_INTEGER);
                }
                var105 = var105.rest();
                var106 = var105.first();
            }
            return module0048.f3275(var104);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23146(final SubLObject var103, final SubLObject var105) {
        if (NIL != deduction_handles_oc.f11659(var103)) {
            SubLObject var106 = (SubLObject)ZERO_INTEGER;
            SubLObject var107 = module0188.f11770(var103);
            SubLObject var108 = (SubLObject)NIL;
            var108 = var107.first();
            while (NIL != var107) {
                if (NIL != f23147(var108, var105)) {
                    var106 = Numbers.add(var106, (SubLObject)ONE_INTEGER);
                }
                var107 = var107.rest();
                var108 = var107.first();
            }
            return module0048.f3275(var106);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23147(final SubLObject var103, final SubLObject var105) {
        return (SubLObject)makeBoolean(NIL != module0191.f11952(var103) && $ic33$ == module0191.f11966(var103) && var105.equal(module0205.f13203(module0191.f11961(var103), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f23148(final SubLObject var106, final SubLObject var61) {
        assert NIL != module0232.f15320(var106) : var106;
        if (NIL != module0204.f13044(var106)) {
            final SubLObject var107 = module0204.f13054(var106);
            return f23149(var107, (SubLObject)$ic31$, var61);
        }
        if (NIL != module0204.f13048(var106)) {
            final SubLObject var107 = module0204.f13054(var106);
            return f23149(var107, (SubLObject)$ic35$, var61);
        }
        return Errors.error((SubLObject)$ic36$, var106);
    }
    
    public static SubLObject f23149(final SubLObject var108, final SubLObject var90, final SubLObject var61) {
        if (var90.eql((SubLObject)$ic31$)) {
            return f23150(var108, var61);
        }
        if (var90.eql((SubLObject)$ic35$)) {
            return f23151(var108, var61);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23150(final SubLObject var108, final SubLObject var61) {
        final SubLObject var110;
        final SubLObject var109 = var110 = module0202.f12832(var108, (SubLObject)UNPROVIDED);
        if (var110.eql($ic37$)) {
            SubLObject var112;
            final SubLObject var111 = var112 = module0202.f12829(var108, (SubLObject)UNPROVIDED);
            SubLObject var113 = (SubLObject)NIL;
            SubLObject var114 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)$ic38$);
            var113 = var112.first();
            var112 = var112.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)$ic38$);
            var114 = var112.first();
            var112 = var112.rest();
            if (NIL == var112) {
                return (SubLObject)makeBoolean(NIL != module0259.f16854(var113, var114, var61, (SubLObject)UNPROVIDED) || NIL != module0305.f20337(var114, var113, var61));
            }
            cdestructuring_bind.cdestructuring_bind_error(var111, (SubLObject)$ic38$);
        }
        else if (var110.eql($ic39$)) {
            SubLObject var116;
            final SubLObject var115 = var116 = module0202.f12829(var108, (SubLObject)UNPROVIDED);
            SubLObject var113 = (SubLObject)NIL;
            SubLObject var114 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var116, var115, (SubLObject)$ic38$);
            var113 = var116.first();
            var116 = var116.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var116, var115, (SubLObject)$ic38$);
            var114 = var116.first();
            var116 = var116.rest();
            if (NIL == var116) {
                return module0256.f16596(var113, var114, var61, (SubLObject)UNPROVIDED);
            }
            cdestructuring_bind.cdestructuring_bind_error(var115, (SubLObject)$ic38$);
        }
        else {
            final SubLObject var63_117;
            final SubLObject var117 = var63_117 = module0202.f12839(var108, (SubLObject)UNPROVIDED);
            if (var63_117.eql((SubLObject)TWO_INTEGER)) {
                SubLObject var119;
                final SubLObject var118 = var119 = module0202.f12829(var108, (SubLObject)UNPROVIDED);
                SubLObject var120 = (SubLObject)NIL;
                SubLObject var121 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)$ic38$);
                var120 = var119.first();
                var119 = var119.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)$ic38$);
                var121 = var119.first();
                var119 = var119.rest();
                if (NIL == var119) {
                    if (var120.equal(var121) && NIL != module0226.f14795(var109)) {
                        return (SubLObject)T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var118, (SubLObject)$ic38$);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23151(final SubLObject var108, final SubLObject var61) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23152(final SubLObject var1) {
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        SubLObject var2 = module0178.f11299(var1);
        SubLObject var3 = (SubLObject)NIL;
        var3 = var2.first();
        while (NIL != var2) {
            if (NIL != deduction_handles_oc.f11671(var3, (SubLObject)UNPROVIDED)) {
                f23153(var3);
            }
            var2 = var2.rest();
            var3 = var2.first();
        }
        return var1;
    }
    
    public static SubLObject f23154(final SubLObject var1) {
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var2 = module0178.f11300(var1);
        SubLObject var3;
        SubLObject var4;
        SubLObject var5;
        for (var3 = module0032.f1741(var2), var4 = (SubLObject)NIL, var4 = module0032.f1742(var3, var2); NIL == module0032.f1744(var3, var4); var4 = module0032.f1743(var4)) {
            var5 = module0032.f1745(var3, var4);
            if (NIL != module0032.f1746(var4, var5) && NIL != deduction_handles_oc.f11671(var5, (SubLObject)UNPROVIDED)) {
                f23153(var5);
            }
        }
        return var1;
    }
    
    public static SubLObject f23153(final SubLObject var9) {
        assert NIL != deduction_handles_oc.f11659(var9) : var9;
        if (NIL != module0188.f11787(var9)) {
            return (SubLObject)NIL;
        }
        if (NIL != f23155(var9)) {
            return f23129(var9);
        }
        if (NIL != f23156(var9)) {
            return f23129(var9);
        }
        f23135(var9);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23155(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0188.f11786(var9);
        final SubLObject var12 = module0188.f11791(var9);
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = module0333.$g2852$.currentBinding(var10);
        try {
            module0333.$g2852$.bind((SubLObject)T, var10);
            SubLObject var15;
            SubLObject var16;
            for (var15 = (SubLObject)NIL, var15 = module0188.f11770(var9); NIL == var13 && NIL != var15; var15 = var15.rest()) {
                var16 = var15.first();
                if (NIL != f23157(var16) || (NIL == var11 && NIL != f23158(var16, var12))) {
                    var13 = (SubLObject)T;
                }
            }
        }
        finally {
            module0333.$g2852$.rebind(var14, var10);
        }
        return var13;
    }
    
    public static SubLObject f23156(final SubLObject var9) {
        final SubLObject var10 = module0188.f11770(var9);
        final SubLObject var11 = module0035.remove_if_not((SubLObject)$ic40$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != Sequences.find_if((SubLObject)$ic41$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != Sequences.find_if((SubLObject)$ic42$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = module0188.f11788(var9);
            final SubLObject var13 = module0205.f13136(module0178.f11303(var12));
            final SubLObject var14 = f23159(var12);
            final SubLObject var15 = f23160(var9);
            final SubLObject var16 = module0188.f11789(var9);
            final SubLObject var17 = f23161(var14, var15, var13, var16, var11);
            final SubLObject var18 = module0409.f28506(var14, var15, var17);
            SubLObject var19 = (SubLObject)NIL;
            SubLObject var20 = var18;
            SubLObject var21 = (SubLObject)NIL;
            var21 = var20.first();
            while (NIL != var20) {
                if (NIL == module0035.f2170(var12, var21) && NIL == module0035.f2220(var11, var21, (SubLObject)UNPROVIDED)) {
                    var19 = (SubLObject)ConsesLow.cons(var21, var19);
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
            var19 = Sequences.nreverse(var19);
            if (NIL == var19) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23159(final SubLObject var1) {
        final SubLObject var2 = module0178.f11303(var1);
        final SubLObject var3 = module0178.f11287(var1);
        final SubLObject var4 = module0205.f13136(var2);
        SubLObject var5 = (SubLObject)NIL;
        if (NIL != module0349.f23471(var4, var3)) {
            final SubLObject var6 = module0205.f13207(var2, (SubLObject)UNPROVIDED);
            final SubLObject var7 = (SubLObject)$ic43$;
            final SubLObject var8 = module0202.f12768($ic44$, var4, var7);
            final SubLObject var9 = module0202.f12720(var7, var6, (SubLObject)UNPROVIDED);
            var5 = module0202.f12768($ic45$, var8, var9);
        }
        else {
            var5 = var2;
        }
        return var5;
    }
    
    public static SubLObject f23160(final SubLObject var9) {
        final SubLObject var10 = module0188.f11781(var9);
        if (NIL != module0226.f14833(var10)) {
            return $ic46$;
        }
        return module0188.f11791(var9);
    }
    
    public static SubLObject f23161(final SubLObject var127, final SubLObject var61, final SubLObject var109, final SubLObject var90, final SubLObject var125) {
        final SubLObject var128 = Sequences.length(var125);
        final SubLObject var129 = module0408.f28423(var127);
        final SubLObject var130 = module0035.sublisp_boolean(Sequences.find_if((SubLObject)$ic47$, var125, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var131 = (SubLObject)makeBoolean(var128.isPositive() && (NIL != module0229.f15236(var109, var61) || var128.numG((SubLObject)ONE_INTEGER)));
        final SubLObject var132 = (SubLObject)makeBoolean(var128.isPositive() && (NIL != module0333.f22416(var109) || var128.numG((SubLObject)ONE_INTEGER)));
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic48$, var125, $ic49$, var129, $ic50$, var128, $ic51$, $ic52$, $ic53$, $ic54$, $ic55$, $ic56$, $ic57$, NIL, $ic58$, $ic59$, $ic60$, var130, $ic61$, var131, $ic62$, var132 });
    }
    
    public static SubLObject f23162(final SubLObject var1) {
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var2 = module0178.f11299(var1);
        if (NIL != var2) {
            SubLObject var3 = (SubLObject)NIL;
            if (NIL == var3) {
                SubLObject var4 = var2;
                SubLObject var5 = (SubLObject)NIL;
                var5 = var4.first();
                while (NIL == var3 && NIL != var4) {
                    if (NIL != deduction_handles_oc.f11659(var5)) {
                        var3 = f23153(var5);
                    }
                    var4 = var4.rest();
                    var5 = var4.first();
                }
            }
            return var3;
        }
        f23126(var1);
        return (SubLObject)T;
    }
    
    public static SubLObject f23163(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        assert NIL != module0161.f10481(var61) : var61;
        final SubLObject var63 = module0161.f10557(var61);
        if (NIL != module0217.f14342(var63)) {
            final SubLObject var64 = assertion_handles_oc.f11010();
            final SubLObject var65 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic63$, var61);
            final SubLObject var66 = module0065.f4733(var64);
            SubLObject var67 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var65) : var65;
            final SubLObject var68 = module0012.$g75$.currentBinding(var62);
            final SubLObject var69 = module0012.$g76$.currentBinding(var62);
            final SubLObject var70 = module0012.$g77$.currentBinding(var62);
            final SubLObject var71 = module0012.$g78$.currentBinding(var62);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var62);
                module0012.$g76$.bind((SubLObject)NIL, var62);
                module0012.$g77$.bind((SubLObject)T, var62);
                module0012.$g78$.bind(Time.get_universal_time(), var62);
                module0012.f478(var65);
                final SubLObject var76_146 = var64;
                if (NIL == module0065.f4772(var76_146, (SubLObject)$ic30$)) {
                    final SubLObject var78_147 = var76_146;
                    if (NIL == module0065.f4775(var78_147, (SubLObject)$ic30$)) {
                        final SubLObject var72 = module0065.f4740(var78_147);
                        final SubLObject var73 = (SubLObject)NIL;
                        SubLObject var74;
                        SubLObject var75;
                        SubLObject var76;
                        SubLObject var77;
                        for (var74 = Sequences.length(var72), var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(var74); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                            var76 = ((NIL != var73) ? Numbers.subtract(var74, var75, (SubLObject)ONE_INTEGER) : var75);
                            var77 = Vectors.aref(var72, var76);
                            if (NIL == module0065.f4749(var77) || NIL == module0065.f4773((SubLObject)$ic30$)) {
                                if (NIL != module0065.f4749(var77)) {
                                    var77 = (SubLObject)$ic30$;
                                }
                                module0012.note_percent_progress(var67, var66);
                                var67 = Numbers.add(var67, (SubLObject)ONE_INTEGER);
                                if (NIL != module0161.f10513(module0178.f11287(var77), var61)) {
                                    f23162(var77);
                                }
                            }
                        }
                    }
                    final SubLObject var85_148 = var76_146;
                    if (NIL == module0065.f4777(var85_148) || NIL == module0065.f4773((SubLObject)$ic30$)) {
                        final SubLObject var78 = module0065.f4738(var85_148);
                        SubLObject var79 = module0065.f4739(var85_148);
                        final SubLObject var80 = module0065.f4734(var85_148);
                        final SubLObject var81 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic30$)) ? NIL : $ic30$);
                        while (var79.numL(var80)) {
                            final SubLObject var82 = Hashtables.gethash_without_values(var79, var78, var81);
                            if (NIL == module0065.f4773((SubLObject)$ic30$) || NIL == module0065.f4749(var82)) {
                                module0012.note_percent_progress(var67, var66);
                                var67 = Numbers.add(var67, (SubLObject)ONE_INTEGER);
                                if (NIL != module0161.f10513(module0178.f11287(var82), var61)) {
                                    f23162(var82);
                                }
                            }
                            var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var71, var62);
                module0012.$g77$.rebind(var70, var62);
                module0012.$g76$.rebind(var69, var62);
                module0012.$g75$.rebind(var68, var62);
            }
        }
        else {
            final SubLObject var83 = module0147.$g2094$.currentBinding(var62);
            final SubLObject var84 = module0147.$g2095$.currentBinding(var62);
            try {
                module0147.$g2094$.bind((SubLObject)$ic64$, var62);
                module0147.$g2095$.bind(var61, var62);
                module0219.f14498((SubLObject)$ic65$, var63, (SubLObject)NIL, (SubLObject)NIL);
            }
            finally {
                module0147.$g2095$.rebind(var84, var62);
                module0147.$g2094$.rebind(var83, var62);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23164(final SubLObject var149, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        final SubLThread var150 = SubLProcess.currentSubLThread();
        if (NIL != var61) {
            final SubLObject var151 = module0147.$g2094$.currentBinding(var150);
            final SubLObject var152 = module0147.$g2095$.currentBinding(var150);
            try {
                module0147.$g2094$.bind((SubLObject)$ic64$, var150);
                module0147.$g2095$.bind(var61, var150);
                module0219.f14495((SubLObject)$ic65$, var149, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var152, var150);
                module0147.$g2094$.rebind(var151, var150);
            }
        }
        else {
            final SubLObject var151 = module0147.$g2094$.currentBinding(var150);
            final SubLObject var152 = module0147.$g2095$.currentBinding(var150);
            try {
                module0147.$g2094$.bind((SubLObject)$ic66$, var150);
                module0147.$g2095$.bind($ic67$, var150);
                module0219.f14495((SubLObject)$ic65$, var149, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var152, var150);
                module0147.$g2094$.rebind(var151, var150);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23165(final SubLObject var126, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        final SubLThread var127 = SubLProcess.currentSubLThread();
        if (NIL != var61) {
            module0219.f14478((SubLObject)$ic65$, var126, (SubLObject)NIL, var61);
        }
        else {
            final SubLObject var128 = module0147.$g2094$.currentBinding(var127);
            final SubLObject var129 = module0147.$g2095$.currentBinding(var127);
            try {
                module0147.$g2094$.bind((SubLObject)$ic66$, var127);
                module0147.$g2095$.bind($ic67$, var127);
                module0219.f14478((SubLObject)$ic65$, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var129, var127);
                module0147.$g2094$.rebind(var128, var127);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23166(final SubLObject var149, final SubLObject var150, SubLObject var109, SubLObject var61) {
        if (var109 == UNPROVIDED) {
            var109 = (SubLObject)NIL;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        final SubLThread var151 = SubLProcess.currentSubLThread();
        if (NIL != var61) {
            module0219.f14477((SubLObject)$ic65$, var149, var150, var109, (SubLObject)NIL, var61);
        }
        else {
            final SubLObject var152 = module0147.$g2094$.currentBinding(var151);
            final SubLObject var153 = module0147.$g2095$.currentBinding(var151);
            try {
                module0147.$g2094$.bind((SubLObject)$ic66$, var151);
                module0147.$g2095$.bind($ic67$, var151);
                module0219.f14477((SubLObject)$ic65$, var149, var150, var109, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var153, var151);
                module0147.$g2094$.rebind(var152, var151);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23167(final SubLObject var149, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        final SubLThread var150 = SubLProcess.currentSubLThread();
        if (NIL != var61) {
            final SubLObject var151 = module0147.$g2094$.currentBinding(var150);
            final SubLObject var152 = module0147.$g2095$.currentBinding(var150);
            try {
                module0147.$g2094$.bind((SubLObject)$ic64$, var150);
                module0147.$g2095$.bind(var61, var150);
                module0219.f14491((SubLObject)$ic65$, var149);
            }
            finally {
                module0147.$g2095$.rebind(var152, var150);
                module0147.$g2094$.rebind(var151, var150);
            }
        }
        else {
            final SubLObject var151 = module0147.$g2094$.currentBinding(var150);
            final SubLObject var152 = module0147.$g2095$.currentBinding(var150);
            try {
                module0147.$g2094$.bind((SubLObject)$ic66$, var150);
                module0147.$g2095$.bind($ic67$, var150);
                module0219.f14491((SubLObject)$ic65$, var149);
            }
            finally {
                module0147.$g2095$.rebind(var152, var150);
                module0147.$g2094$.rebind(var151, var150);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23168() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)ZERO_INTEGER;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic68$;
        final SubLObject var71_152 = module0065.f4733(var4);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var7 = module0012.$g75$.currentBinding(var2);
        final SubLObject var8 = module0012.$g76$.currentBinding(var2);
        final SubLObject var9 = module0012.$g77$.currentBinding(var2);
        final SubLObject var10 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var76_153 = var4;
            if (NIL == module0065.f4772(var76_153, (SubLObject)$ic30$)) {
                final SubLObject var78_154 = var76_153;
                if (NIL == module0065.f4775(var78_154, (SubLObject)$ic30$)) {
                    final SubLObject var11 = module0065.f4740(var78_154);
                    final SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic30$)) {
                            if (NIL != module0065.f4749(var16)) {
                                var16 = (SubLObject)$ic30$;
                            }
                            module0012.note_percent_progress(var6, var71_152);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != f23162(var16)) {
                                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                }
                final SubLObject var85_155 = var76_153;
                if (NIL == module0065.f4777(var85_155) || NIL == module0065.f4773((SubLObject)$ic30$)) {
                    final SubLObject var17 = module0065.f4738(var85_155);
                    SubLObject var18 = module0065.f4739(var85_155);
                    final SubLObject var19 = module0065.f4734(var85_155);
                    final SubLObject var20 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic30$)) ? NIL : $ic30$);
                    while (var18.numL(var19)) {
                        final SubLObject var21 = Hashtables.gethash_without_values(var18, var17, var20);
                        if (NIL == module0065.f4773((SubLObject)$ic30$) || NIL == module0065.f4749(var21)) {
                            module0012.note_percent_progress(var6, var71_152);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != f23162(var21)) {
                                var3 = Numbers.add(var3, (SubLObject)ONE_INTEGER);
                            }
                        }
                        var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var2);
            module0012.$g77$.rebind(var9, var2);
            module0012.$g76$.rebind(var8, var2);
            module0012.$g75$.rebind(var7, var2);
        }
        return var3;
    }
    
    public static SubLObject f23157(final SubLObject var32) {
        assert NIL != module0191.f11950(var32) : var32;
        if (NIL != assertion_handles_oc.f11035(var32)) {
            return (SubLObject)makeBoolean(NIL == module0289.f19396(var32) || NIL == module0178.f11361(var32, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0179.f11424(var32)) {
            return (SubLObject)makeBoolean(NIL == module0183.f11625(var32));
        }
        return (SubLObject)makeBoolean(NIL == module0333.f22427(var32));
    }
    
    public static SubLObject f23158(final SubLObject var32, final SubLObject var121) {
        return (SubLObject)makeBoolean(NIL == f23169(var32, var121));
    }
    
    public static SubLObject f23169(final SubLObject var32, final SubLObject var121) {
        final SubLObject var123;
        final SubLObject var122 = var123 = module0191.f11976(var32);
        if (var123.eql($ic46$) || var123.eql($ic67$)) {
            return (SubLObject)T;
        }
        return module0262.f17336(var121, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23170(final SubLObject var1) {
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        SubLObject var2 = (SubLObject)NIL;
        if (NIL != module0178.f11376(var1)) {
            final SubLObject var3 = module0178.f11287(var1);
            SubLObject var4 = module0178.f11299(var1);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                if (NIL != deduction_handles_oc.f11659(var5)) {
                    SubLObject var6;
                    SubLObject var7;
                    SubLObject var8;
                    for (var6 = (SubLObject)NIL, var7 = (SubLObject)NIL, var7 = module0188.f11770(var5); NIL == var6 && NIL != var7; var7 = var7.rest()) {
                        var8 = var7.first();
                        if (NIL != module0230.f15277(var8, var3)) {
                            var6 = (SubLObject)T;
                        }
                    }
                    if (NIL != var6) {
                        var2 = (SubLObject)ConsesLow.cons(var5, var2);
                    }
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f23171(SubLObject var159) {
        if (var159 == UNPROVIDED) {
            var159 = (SubLObject)NIL;
        }
        final SubLThread var160 = SubLProcess.currentSubLThread();
        SubLObject var161 = (SubLObject)ZERO_INTEGER;
        final SubLObject var162 = assertion_handles_oc.f11010();
        final SubLObject var163 = (SubLObject)$ic71$;
        final SubLObject var71_160 = module0065.f4733(var162);
        SubLObject var164 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var163) : var163;
        final SubLObject var165 = module0012.$g75$.currentBinding(var160);
        final SubLObject var166 = module0012.$g76$.currentBinding(var160);
        final SubLObject var167 = module0012.$g77$.currentBinding(var160);
        final SubLObject var168 = module0012.$g78$.currentBinding(var160);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var160);
            module0012.$g76$.bind((SubLObject)NIL, var160);
            module0012.$g77$.bind((SubLObject)T, var160);
            module0012.$g78$.bind(Time.get_universal_time(), var160);
            module0012.f478(var163);
            final SubLObject var76_161 = var162;
            if (NIL == module0065.f4772(var76_161, (SubLObject)$ic30$)) {
                final SubLObject var78_162 = var76_161;
                if (NIL == module0065.f4775(var78_162, (SubLObject)$ic30$)) {
                    final SubLObject var169 = module0065.f4740(var78_162);
                    final SubLObject var170 = (SubLObject)NIL;
                    SubLObject var171;
                    SubLObject var172;
                    SubLObject var173;
                    SubLObject var174;
                    for (var171 = Sequences.length(var169), var172 = (SubLObject)NIL, var172 = (SubLObject)ZERO_INTEGER; var172.numL(var171); var172 = Numbers.add(var172, (SubLObject)ONE_INTEGER)) {
                        var173 = ((NIL != var170) ? Numbers.subtract(var171, var172, (SubLObject)ONE_INTEGER) : var172);
                        var174 = Vectors.aref(var169, var173);
                        if (NIL == module0065.f4749(var174) || NIL == module0065.f4773((SubLObject)$ic30$)) {
                            if (NIL != module0065.f4749(var174)) {
                                var174 = (SubLObject)$ic30$;
                            }
                            module0012.note_percent_progress(var164, var71_160);
                            var164 = Numbers.add(var164, (SubLObject)ONE_INTEGER);
                            if (NIL != f23172(var174, var159)) {
                                var161 = Numbers.add(var161, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                }
                final SubLObject var85_163 = var76_161;
                if (NIL == module0065.f4777(var85_163) || NIL == module0065.f4773((SubLObject)$ic30$)) {
                    final SubLObject var175 = module0065.f4738(var85_163);
                    SubLObject var176 = module0065.f4739(var85_163);
                    final SubLObject var177 = module0065.f4734(var85_163);
                    final SubLObject var178 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic30$)) ? NIL : $ic30$);
                    while (var176.numL(var177)) {
                        final SubLObject var179 = Hashtables.gethash_without_values(var176, var175, var178);
                        if (NIL == module0065.f4773((SubLObject)$ic30$) || NIL == module0065.f4749(var179)) {
                            module0012.note_percent_progress(var164, var71_160);
                            var164 = Numbers.add(var164, (SubLObject)ONE_INTEGER);
                            if (NIL != f23172(var179, var159)) {
                                var161 = Numbers.add(var161, (SubLObject)ONE_INTEGER);
                            }
                        }
                        var176 = Numbers.add(var176, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var168, var160);
            module0012.$g77$.rebind(var167, var160);
            module0012.$g76$.rebind(var166, var160);
            module0012.$g75$.rebind(var165, var160);
        }
        if (NIL != var159) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic72$, var161);
        }
        return var161;
    }
    
    public static SubLObject f23172(final SubLObject var1, SubLObject var159) {
        if (var159 == UNPROVIDED) {
            var159 = (SubLObject)T;
        }
        if (NIL == f23125(var1, (SubLObject)UNPROVIDED)) {
            if (NIL != var159) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic73$, var1);
            }
            f23126(var1);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23173(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var1) && NIL != module0178.f11376(var1) && NIL != f23125(var1, (SubLObject)ConsesLow.list(var1)));
    }
    
    public static SubLObject f23125(final SubLObject var1, SubLObject var164) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        if (NIL != module0178.f11375(var1) && NIL == module0035.f2170(var1, var164)) {
            return (SubLObject)T;
        }
        if (NIL == module0178.f11299(var1)) {
            return (SubLObject)NIL;
        }
        SubLObject var166 = (SubLObject)NIL;
        final SubLObject var167 = $g2944$.currentBinding(var165);
        final SubLObject var168 = $g2945$.currentBinding(var165);
        final SubLObject var169 = $g2947$.currentBinding(var165);
        final SubLObject var170 = $g2946$.currentBinding(var165);
        final SubLObject var171 = $g2948$.currentBinding(var165);
        try {
            $g2944$.bind((SubLObject)NIL, var165);
            $g2945$.bind((SubLObject)NIL, var165);
            $g2947$.bind((SubLObject)NIL, var165);
            $g2946$.bind(var1, var165);
            $g2948$.bind((SubLObject)ZERO_INTEGER, var165);
            try {
                var165.throwStack.push($ic74$);
                SubLObject var172 = module0178.f11299(var1);
                SubLObject var173 = (SubLObject)NIL;
                var173 = var172.first();
                while (NIL != var172) {
                    if (NIL != deduction_handles_oc.f11659(var173)) {
                        f23174(var173, var164);
                    }
                    var172 = var172.rest();
                    var173 = var172.first();
                }
                var172 = $g2945$.getDynamicValue(var165);
                SubLObject var174 = (SubLObject)NIL;
                var174 = var172.first();
                while (NIL != var172) {
                    if (NIL != module0178.f11375(var174) && NIL == module0035.f2170(var174, var164)) {
                        f23175(var174);
                    }
                    var172 = var172.rest();
                    var174 = var172.first();
                }
            }
            catch (Throwable var175) {
                var166 = Errors.handleThrowable(var175, (SubLObject)$ic74$);
            }
            finally {
                var165.throwStack.pop();
            }
        }
        finally {
            $g2948$.rebind(var171, var165);
            $g2946$.rebind(var170, var165);
            $g2947$.rebind(var169, var165);
            $g2945$.rebind(var168, var165);
            $g2944$.rebind(var167, var165);
        }
        return var166;
    }
    
    public static SubLObject f23176() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g2948$.setDynamicValue(Numbers.add($g2948$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
        if (NIL != $g2949$.getDynamicValue(var2) && $g2948$.getDynamicValue(var2).numG($g2949$.getDynamicValue(var2))) {
            Dynamic.sublisp_throw((SubLObject)$ic74$, (SubLObject)T);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23174(final SubLObject var9, final SubLObject var164) {
        final SubLThread var165 = SubLProcess.currentSubLThread();
        if (NIL == module0035.f2170(var9, $g2944$.getDynamicValue(var165))) {
            $g2944$.setDynamicValue((SubLObject)ConsesLow.cons(var9, $g2944$.getDynamicValue(var165)), var165);
            f23176();
            SubLObject var166 = module0188.f11770(var9);
            SubLObject var167 = (SubLObject)NIL;
            var167 = var166.first();
            while (NIL != var166) {
                if (NIL != assertion_handles_oc.f11035(var167)) {
                    $g2945$.setDynamicValue((SubLObject)ConsesLow.cons(var167, $g2945$.getDynamicValue(var165)), var165);
                    f23176();
                    if (NIL == module0178.f11375(var167) || NIL != module0035.f2170(var167, var164)) {
                        SubLObject var26_169 = module0178.f11299(var167);
                        SubLObject var168 = (SubLObject)NIL;
                        var168 = var26_169.first();
                        while (NIL != var26_169) {
                            if (NIL != deduction_handles_oc.f11659(var168)) {
                                f23174(var168, var164);
                            }
                            var26_169 = var26_169.rest();
                            var168 = var26_169.first();
                        }
                    }
                }
                var166 = var166.rest();
                var167 = var166.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23175(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (var1.eql($g2946$.getDynamicValue(var2))) {
            Dynamic.sublisp_throw((SubLObject)$ic74$, (SubLObject)T);
        }
        if (NIL == module0035.f2170(var1, $g2947$.getDynamicValue(var2))) {
            $g2947$.setDynamicValue((SubLObject)ConsesLow.cons(var1, $g2947$.getDynamicValue(var2)), var2);
            SubLObject var3 = f23177(var1);
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                if (NIL != f23178(var4)) {
                    f23175(module0188.f11788(var4));
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23177(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = $g2944$.getDynamicValue(var2);
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (NIL != module0035.f2170(var1, module0188.f11770(var5))) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f23178(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var11 = (SubLObject)NIL, var12 = (SubLObject)NIL, var12 = module0188.f11770(var9); NIL == var11 && NIL != var12; var12 = var12.rest()) {
            var13 = var12.first();
            if (NIL != assertion_handles_oc.f11035(var13) && NIL == module0004.f104(var13, $g2947$.getDynamicValue(var10), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
        }
        return (SubLObject)makeBoolean(NIL == var11);
    }
    
    public static SubLObject f23179() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23104", "S#17598", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0342", "f23105", "S#25825");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23106", "S#25826", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0342", "f23107", "S#25827");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23108", "S#14359", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0342", "f23109", "S#25828");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23110", "S#25829", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23111", "S#13551", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0342", "f23112", "S#25830");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0342", "f23113", "S#25831");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23114", "S#25832", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23115", "S#25833", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23116", "S#25834", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23118", "S#25835", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23119", "S#25836", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23117", "S#25837", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23121", "S#22112", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23122", "S#25838", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23127", "S#17144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23128", "S#25839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23126", "S#14111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23124", "S#25840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23123", "S#25841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23129", "S#14360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23130", "S#25842", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23120", "S#25843", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23133", "S#25844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23134", "S#25845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23131", "S#25846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23132", "S#25847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23135", "S#25848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23136", "S#25849", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23137", "S#25850", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23138", "S#25851", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23141", "S#25852", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23139", "S#25853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23142", "S#25854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23140", "S#25855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23143", "S#25856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23144", "S#25857", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23145", "S#25858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23146", "S#25859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23147", "S#25860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23148", "S#14916", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23149", "S#25861", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23150", "S#25862", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23151", "S#25863", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23152", "S#25864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23154", "S#25865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23153", "S#14364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23155", "S#25866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23156", "S#25867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23159", "S#25868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23160", "S#25869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23161", "S#25870", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23162", "S#25871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23163", "S#25872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23164", "S#25873", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23165", "S#25874", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23166", "S#25875", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23167", "S#25876", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23168", "S#25877", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23157", "S#25878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23158", "S#25879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23169", "S#25880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23170", "S#25881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23171", "S#25882", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23172", "S#25883", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23173", "S#25884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23125", "S#25885", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23176", "S#25886", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23174", "S#25887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23175", "S#25888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23177", "S#25889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0342", "f23178", "S#25890", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23180() {
        $g2221$ = SubLFiles.defparameter("S#25891", (SubLObject)NIL);
        $g2939$ = SubLFiles.defparameter("S#25892", (SubLObject)NIL);
        $g2940$ = SubLFiles.defparameter("S#25893", (SubLObject)NIL);
        $g2941$ = SubLFiles.defparameter("S#25894", (SubLObject)$ic13$);
        $g2942$ = SubLFiles.defparameter("S#25895", (SubLObject)NIL);
        $g2943$ = SubLFiles.defparameter("S#25896", (SubLObject)NIL);
        $g2944$ = SubLFiles.defparameter("S#25897", (SubLObject)NIL);
        $g2945$ = SubLFiles.defparameter("S#25898", (SubLObject)NIL);
        $g2946$ = SubLFiles.defparameter("S#25899", (SubLObject)NIL);
        $g2947$ = SubLFiles.defparameter("S#25900", (SubLObject)NIL);
        $g2948$ = SubLFiles.defparameter("S#25901", (SubLObject)ZERO_INTEGER);
        $g2949$ = SubLFiles.defparameter("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*", (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23181() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23179();
    }
    
    public void initializeVariables() {
        f23180();
    }
    
    public void runTopLevelForms() {
        f23181();
    }
    
    static {
        me = (SubLFile)new module0342();
        $g2221$ = null;
        $g2939$ = null;
        $g2940$ = null;
        $g2941$ = null;
        $g2942$ = null;
        $g2943$ = null;
        $g2944$ = null;
        $g2945$ = null;
        $g2946$ = null;
        $g2947$ = null;
        $g2948$ = null;
        $g2949$ = null;
        $ic0$ = makeSymbol("ASSERTION-P");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = makeSymbol("CLET");
        $ic3$ = makeSymbol("S#25892", "CYC");
        $ic4$ = makeSymbol("ADJOIN");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#25892", "CYC"));
        $ic6$ = makeSymbol("DEDUCTION-P");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DEDUCTION", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic8$ = makeSymbol("S#25893", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#25893", "CYC"));
        $ic10$ = makeSymbol("PIF");
        $ic11$ = makeSymbol("S#25827", "CYC");
        $ic12$ = makeSymbol("PROGN");
        $ic13$ = makeKeyword("UNINITIALIZED");
        $ic14$ = makeSymbol("S#2879", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#25829", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25894", "CYC"), (SubLObject)NIL));
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25833", "CYC")));
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25894", "CYC"), (SubLObject)makeKeyword("UNINITIALIZED")));
        $ic19$ = makeSymbol("ARGUMENT-P");
        $ic20$ = makeSymbol("ASSERTED-ARGUMENT-P");
        $ic21$ = makeSymbol("S#10615", "CYC");
        $ic22$ = makeKeyword("UNKNOWN");
        $ic23$ = makeKeyword("FORWARD");
        $ic24$ = makeSymbol("DIRECTION-P");
        $ic25$ = makeSymbol("S#12263", "CYC");
        $ic26$ = makeKeyword("MT");
        $ic27$ = makeKeyword("BROAD-MT");
        $ic28$ = makeString("do-broad-mt-index");
        $ic29$ = makeSymbol("STRINGP");
        $ic30$ = makeKeyword("SKIP");
        $ic31$ = makeKeyword("TRUE");
        $ic32$ = makeKeyword("BACKWARD");
        $ic33$ = makeKeyword("EQUALITY");
        $ic34$ = makeSymbol("CNF-P");
        $ic35$ = makeKeyword("FALSE");
        $ic36$ = makeString("~S was not an atomic CNF.");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic40$ = makeSymbol("S#12732", "CYC");
        $ic41$ = makeSymbol("S#16455", "CYC");
        $ic42$ = makeSymbol("S#18032", "CYC");
        $ic43$ = makeSymbol("?PRED");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic47$ = makeSymbol("S#17461", "CYC");
        $ic48$ = makeKeyword("ALLOWED-RULES");
        $ic49$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic50$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic51$ = makeKeyword("RESULT-UNIQUENESS");
        $ic52$ = makeKeyword("PROOF");
        $ic53$ = makeKeyword("RETURN");
        $ic54$ = makeKeyword("SUPPORTS");
        $ic55$ = makeKeyword("ANSWER-LANGUAGE");
        $ic56$ = makeKeyword("HL");
        $ic57$ = makeKeyword("CONTINUABLE?");
        $ic58$ = makeKeyword("PRODUCTIVITY-LIMIT");
        $ic59$ = makeKeyword("POSITIVE-INFINITY");
        $ic60$ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic61$ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic62$ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic63$ = makeString("Performing full TMS on mt ~S");
        $ic64$ = makeSymbol("S#12276", "CYC");
        $ic65$ = makeSymbol("S#25871", "CYC");
        $ic66$ = makeSymbol("S#12274", "CYC");
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic68$ = makeString("Reconsidering assertion arguments");
        $ic69$ = makeSymbol("SUPPORT-P");
        $ic70$ = makeInteger(50);
        $ic71$ = makeString("Removing circularly supported assertions");
        $ic72$ = makeString("~%~%~S circularly supported assertions removed");
        $ic73$ = makeString("~%Removing ~S");
        $ic74$ = makeKeyword("JUST-FOUND");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 741 ms
	
	Decompiled with Procyon 0.5.32.
*/