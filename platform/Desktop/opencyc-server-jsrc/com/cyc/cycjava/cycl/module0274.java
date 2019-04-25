package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0274 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0274";
    public static final String myFingerPrint = "6186008f4aabf7a61b1378b8d51384e871972525b8287e4fcb88939e38f4510b";
    private static SubLSymbol $g2584$;
    private static SubLSymbol $g2585$;
    private static SubLSymbol $g2586$;
    private static SubLSymbol $g2587$;
    private static SubLSymbol $g2588$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLInteger $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLString $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLInteger $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLString $ic92$;
    private static final SubLList $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLList $ic100$;
    private static final SubLString $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLString $ic107$;
    private static final SubLList $ic108$;
    private static final SubLString $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLList $ic130$;
    private static final SubLList $ic131$;
    private static final SubLList $ic132$;
    private static final SubLList $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLList $ic136$;
    private static final SubLList $ic137$;
    private static final SubLList $ic138$;
    private static final SubLList $ic139$;
    private static final SubLList $ic140$;
    private static final SubLList $ic141$;
    private static final SubLList $ic142$;
    private static final SubLList $ic143$;
    private static final SubLList $ic144$;
    private static final SubLList $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLList $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    
    public static SubLObject f18060(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = var3;
        assert module0274.NIL != module0035.f2327(var5) : var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = (SubLObject)module0274.NIL, var6 = var5; module0274.NIL != var6; var6 = conses_high.cddr(var6)) {
            var7 = var6.first();
            var8 = conses_high.cadr(var6);
            assert module0274.NIL != module0152.f9712(var7) : var7;
        }
        SubLObject var9 = (SubLObject)module0274.NIL;
        final SubLObject var10 = module0152.$g2125$.currentBinding(var4);
        final SubLObject var11 = module0152.$g2126$.currentBinding(var4);
        final SubLObject var12 = module0152.$g2102$.currentBinding(var4);
        try {
            module0152.$g2125$.bind(var1, var4);
            module0152.$g2126$.bind((module0274.NIL != module0151.f9690() && module0274.NIL != module0152.f9724()) ? module0152.f9724() : var1, var4);
            module0152.$g2102$.bind(module0151.f9695(), var4);
            final SubLObject var13 = module0152.$g2102$.getDynamicValue(var4);
            final SubLObject var10_14 = module0034.$g879$.currentBinding(var4);
            try {
                module0034.$g879$.bind(var13, var4);
                SubLObject var14 = (SubLObject)module0274.NIL;
                if (module0274.NIL != var13 && module0274.NIL == module0034.f1842(var13)) {
                    var14 = module0034.f1869(var13);
                    final SubLObject var15 = Threads.current_process();
                    if (module0274.NIL == var14) {
                        module0034.f1873(var13, var15);
                    }
                    else if (!var14.eql(var15)) {
                        Errors.error((SubLObject)module0274.$ic2$);
                    }
                }
                try {
                    if (module0274.NIL == module0151.f9690()) {
                        f18061();
                    }
                }
                finally {
                    final SubLObject var10_15 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0274.T, var4);
                        final SubLObject var17;
                        final SubLObject var16 = var17 = module0151.f9700(var3);
                        final SubLObject var10_16 = module0152.$g2104$.currentBinding(var4);
                        try {
                            module0152.$g2104$.bind(var17, var4);
                            final SubLObject var18 = var17;
                            assert module0274.NIL != module0091.f6325(var18) : var18;
                            final SubLObject var19 = module0091.f6339(var18);
                            final ArrayList var20 = Dynamic.extract_dynamic_values(var19);
                            try {
                                Dynamic.bind_dynamic_vars(var19, module0091.f6340(var18));
                                var9 = f18062(var1, (SubLObject)module0274.$ic4$, var2);
                            }
                            finally {
                                Dynamic.rebind_dynamic_vars(var19, var20);
                            }
                        }
                        finally {
                            module0152.$g2104$.rebind(var10_16, var4);
                        }
                        if (module0274.NIL != var13 && module0274.NIL == var14) {
                            module0034.f1873(var13, (SubLObject)module0274.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_15, var4);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var10_14, var4);
            }
        }
        finally {
            module0152.$g2102$.rebind(var12, var4);
            module0152.$g2126$.rebind(var11, var4);
            module0152.$g2125$.rebind(var10, var4);
        }
        return var9;
    }
    
    public static SubLObject f18063(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0152.$g2105$.currentBinding(var4);
        try {
            module0152.$g2105$.bind((SubLObject)module0274.$ic5$, var4);
            return f18060(var1, var2, var3);
        }
        finally {
            module0152.$g2105$.rebind(var5, var4);
        }
    }
    
    public static SubLObject f18064(final SubLObject var24, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = var3;
        assert module0274.NIL != module0035.f2327(var26) : var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        for (var27 = (SubLObject)module0274.NIL, var27 = var26; module0274.NIL != var27; var27 = conses_high.cddr(var27)) {
            var28 = var27.first();
            var29 = conses_high.cadr(var27);
            assert module0274.NIL != module0152.f9712(var28) : var28;
        }
        SubLObject var30 = (SubLObject)module0274.NIL;
        final SubLObject var31 = module0018.$g696$.currentBinding(var25);
        try {
            module0018.$g696$.bind((SubLObject)module0274.T, var25);
            final SubLObject var33;
            final SubLObject var32 = var33 = module0151.f9700(var3);
            final SubLObject var10_26 = module0152.$g2104$.currentBinding(var25);
            try {
                module0152.$g2104$.bind(var33, var25);
                final SubLObject var34 = var33;
                assert module0274.NIL != module0091.f6325(var34) : var34;
                final SubLObject var35 = module0091.f6339(var34);
                final ArrayList var36 = Dynamic.extract_dynamic_values(var35);
                try {
                    Dynamic.bind_dynamic_vars(var35, module0091.f6340(var34));
                    var30 = f18060(var24, var2, (SubLObject)module0274.UNPROVIDED);
                }
                finally {
                    Dynamic.rebind_dynamic_vars(var35, var36);
                }
            }
            finally {
                module0152.$g2104$.rebind(var10_26, var25);
            }
        }
        finally {
            module0018.$g696$.rebind(var31, var25);
        }
        return var30;
    }
    
    public static SubLObject f18065(final SubLObject var24, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0152.$g2105$.currentBinding(var25);
        try {
            module0152.$g2105$.bind((SubLObject)module0274.$ic7$, var25);
            return f18064(var24, var2, var3);
        }
        finally {
            module0152.$g2105$.rebind(var26, var25);
        }
    }
    
    public static SubLObject f18066(final SubLObject var24, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0152.$g2105$.currentBinding(var25);
        try {
            module0152.$g2105$.bind((SubLObject)module0274.$ic5$, var25);
            return f18064(var24, var2, var3);
        }
        finally {
            module0152.$g2105$.rebind(var26, var25);
        }
    }
    
    public static SubLObject f18067(final SubLObject var24, SubLObject var2, SubLObject var27) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var27 == module0274.UNPROVIDED) {
            var27 = (SubLObject)module0274.$ic8$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0274.NIL;
        final SubLObject var30 = module0152.$g2125$.currentBinding(var28);
        final SubLObject var31 = module0152.$g2126$.currentBinding(var28);
        final SubLObject var32 = module0152.$g2102$.currentBinding(var28);
        try {
            module0152.$g2125$.bind(var24, var28);
            module0152.$g2126$.bind((module0274.NIL != module0151.f9690() && module0274.NIL != module0152.f9724()) ? module0152.f9724() : var24, var28);
            module0152.$g2102$.bind(module0151.f9695(), var28);
            final SubLObject var33 = module0152.$g2102$.getDynamicValue(var28);
            final SubLObject var10_28 = module0034.$g879$.currentBinding(var28);
            try {
                module0034.$g879$.bind(var33, var28);
                SubLObject var34 = (SubLObject)module0274.NIL;
                if (module0274.NIL != var33 && module0274.NIL == module0034.f1842(var33)) {
                    var34 = module0034.f1869(var33);
                    final SubLObject var35 = Threads.current_process();
                    if (module0274.NIL == var34) {
                        module0034.f1873(var33, var35);
                    }
                    else if (!var34.eql(var35)) {
                        Errors.error((SubLObject)module0274.$ic2$);
                    }
                }
                try {
                    if (module0274.NIL == module0151.f9690()) {
                        f18061();
                    }
                }
                finally {
                    final SubLObject var10_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0274.T, var28);
                        final SubLObject var36 = var27;
                        if (var36.eql((SubLObject)module0274.$ic8$)) {
                            var29 = f18068(var24, var2);
                        }
                        else if (var36.eql((SubLObject)module0274.$ic9$)) {
                            var29 = f18069(var24, var2);
                        }
                        if (module0274.NIL != var33 && module0274.NIL == var34) {
                            module0034.f1873(var33, (SubLObject)module0274.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_29, var28);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var10_28, var28);
            }
        }
        finally {
            module0152.$g2102$.rebind(var32, var28);
            module0152.$g2126$.rebind(var31, var28);
            module0152.$g2125$.rebind(var30, var28);
        }
        return var29;
    }
    
    public static SubLObject f18062(final SubLObject var24, SubLObject var31, SubLObject var2) {
        if (var31 == module0274.UNPROVIDED) {
            var31 = (SubLObject)module0274.$ic4$;
        }
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0274.NIL;
        if (module0274.NIL == var2) {
            var2 = module0147.$g2095$.getDynamicValue(var32);
        }
        final SubLObject var34 = var31;
        if (var34.eql((SubLObject)module0274.$ic4$)) {
            var33 = f18070(var24, var2);
        }
        else if (var34.eql((SubLObject)module0274.$ic8$)) {
            var33 = f18068(var24, var2);
        }
        else if (var34.eql((SubLObject)module0274.$ic9$)) {
            var33 = f18069(var24, var2);
        }
        else if (var34.eql((SubLObject)module0274.$ic10$)) {
            var33 = f18071(var24, var2);
        }
        else {
            f18072((SubLObject)module0274.THREE_INTEGER, (SubLObject)module0274.$ic11$, var31, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED);
        }
        return var33;
    }
    
    public static SubLObject f18073(final SubLObject var24, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0274.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0274.$ic12$, var32);
            module0147.$g2095$.bind(module0274.$ic13$, var32);
            var33 = f18062(var24, var31, (SubLObject)module0274.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f18074() {
        final SubLObject var32 = module0274.$g2584$.getGlobalValue();
        if (module0274.NIL != var32) {
            module0034.f1818(var32);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18075(final SubLObject var24, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        return module0034.f1829(module0274.$g2584$.getGlobalValue(), (SubLObject)ConsesLow.list(var24, var2, var3), (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED);
    }
    
    public static SubLObject f18076(final SubLObject var24, final SubLObject var2, final SubLObject var3) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0152.$g2124$.currentBinding(var25);
        try {
            module0152.$g2124$.bind(module0274.$ic13$, var25);
            return f18063(var24, var2, var3);
        }
        finally {
            module0152.$g2124$.rebind(var26, var25);
        }
    }
    
    public static SubLObject f18077(final SubLObject var24, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        SubLObject var25 = module0274.$g2584$.getGlobalValue();
        if (module0274.NIL == var25) {
            var25 = module0034.f1934((SubLObject)module0274.$ic14$, (SubLObject)module0274.$ic15$, (SubLObject)module0274.$ic16$, (SubLObject)module0274.EQUAL, (SubLObject)module0274.THREE_INTEGER, (SubLObject)module0274.ZERO_INTEGER);
            module0034.f1951((SubLObject)module0274.$ic17$);
        }
        final SubLObject var26 = module0034.f1781(var24, var2, var3);
        final SubLObject var27 = module0034.f1814(var25, var26, (SubLObject)module0274.UNPROVIDED);
        if (var27 != module0274.$ic18$) {
            SubLObject var28 = var27;
            SubLObject var29 = (SubLObject)module0274.NIL;
            var29 = var28.first();
            while (module0274.NIL != var28) {
                SubLObject var30 = var29.first();
                final SubLObject var31 = conses_high.second(var29);
                if (var24.equal(var30.first())) {
                    var30 = var30.rest();
                    if (var2.equal(var30.first())) {
                        var30 = var30.rest();
                        if (module0274.NIL != var30 && module0274.NIL == var30.rest() && var3.equal(var30.first())) {
                            return module0034.f1959(var31);
                        }
                    }
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        final SubLObject var32 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18076(var24, var2, var3)));
        module0034.f1836(var25, var26, var27, var32, (SubLObject)ConsesLow.list(var24, var2, var3));
        return module0034.f1959(var32);
    }
    
    public static SubLObject f18061() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0274.NIL == module0146.$g1986$.getDynamicValue(var4)) {
            module0285.f18889();
        }
        f18078();
        f18079();
        module0303.f20213();
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18080(final SubLObject var24, final SubLObject var2) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        var25.resetMultipleValues();
        final SubLObject var26 = module0280.f18634(var24, var2);
        final SubLObject var27 = var25.secondMultipleValue();
        var25.resetMultipleValues();
        if (module0274.NIL == var26 || module0274.NIL == var27) {
            if (module0274.NIL == f18081()) {
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic19$));
            }
            return (SubLObject)module0274.T;
        }
        return module0035.sublisp_boolean(f18081());
    }
    
    public static SubLObject f18083(final SubLObject var1, final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0274.T;
        SubLObject var46 = module0152.$g2101$.currentBinding(var44);
        try {
            module0152.$g2101$.bind((SubLObject)module0274.T, var44);
            if (module0274.NIL != module0271.f17879(var1)) {
                var45 = (SubLObject)module0274.NIL;
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic20$, module0271.f17880(var1), var1));
            }
        }
        finally {
            module0152.$g2101$.rebind(var46, var44);
        }
        var46 = module0152.$g2101$.currentBinding(var44);
        try {
            module0152.$g2101$.bind((SubLObject)module0274.T, var44);
            if (module0274.NIL != var45 && module0274.NIL != module0271.$g2559$.getDynamicValue(var44) && module0274.NIL != f18084(var1)) {
                var45 = (SubLObject)module0274.NIL;
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic21$, f18085(var1)));
            }
        }
        finally {
            module0152.$g2101$.rebind(var46, var44);
        }
        var46 = module0152.$g2101$.currentBinding(var44);
        try {
            module0152.$g2101$.bind((SubLObject)module0274.T, var44);
            if (module0274.NIL != var45) {
                if (module0274.NIL != var43 && module0274.NIL != f18086(var1)) {
                    var45 = (SubLObject)module0274.T;
                }
                else if (module0274.NIL != module0206.f13425(var1)) {
                    var45 = (SubLObject)module0274.T;
                }
                else {
                    var45 = (SubLObject)module0274.NIL;
                }
            }
        }
        finally {
            module0152.$g2101$.rebind(var46, var44);
        }
        return var45;
    }
    
    public static SubLObject f18070(SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0274.T;
        SubLObject var5 = (SubLObject)module0274.NIL;
        final SubLObject var6 = module0152.$g2129$.currentBinding(var3);
        try {
            module0152.$g2129$.bind((SubLObject)module0274.NIL, var3);
            var4 = f18083(var1, (SubLObject)module0274.NIL);
            SubLObject var7 = module0205.f13327(var2);
            if (module0274.NIL == f18087(var4)) {
                if (module0274.NIL == module0161.f10481(var7)) {
                    var1 = module0202.f12782(var2, var1);
                    var7 = module0274.$ic22$;
                }
                if (module0274.NIL != module0271.f17874(var7)) {
                    var4 = (SubLObject)module0274.NIL;
                    f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic23$, var7));
                    if (module0274.NIL != f18088() && module0274.NIL != module0161.f10481(var7) && module0274.NIL != module0269.f17730(var7)) {
                        f18089((SubLObject)ConsesLow.list((SubLObject)module0274.$ic24$, module0202.f12768(module0274.$ic25$, var7, module0274.$ic26$), module0132.$g1548$.getGlobalValue()));
                    }
                }
            }
            if (module0274.NIL == f18090() && module0274.NIL != var4) {
                final SubLObject var8 = module0147.f9540(var7);
                final SubLObject var10_47 = module0147.$g2095$.currentBinding(var3);
                final SubLObject var9 = module0147.$g2094$.currentBinding(var3);
                final SubLObject var10 = module0147.$g2096$.currentBinding(var3);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var8), var3);
                    module0147.$g2094$.bind(module0147.f9546(var8), var3);
                    module0147.$g2096$.bind(module0147.f9549(var8), var3);
                    if (module0274.NIL == f18087(var4)) {
                        final SubLObject var10_48 = module0152.$g2101$.currentBinding(var3);
                        try {
                            module0152.$g2101$.bind((SubLObject)module0274.T, var3);
                            var4 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == f18080(var1, var7));
                        }
                        finally {
                            module0152.$g2101$.rebind(var10_48, var3);
                        }
                    }
                    if (module0274.NIL == f18087(var4)) {
                        final SubLObject var10_49 = module0271.$g2564$.currentBinding(var3);
                        final SubLObject var11_50 = module0271.$g2562$.currentBinding(var3);
                        final SubLObject var12_51 = module0271.$g2561$.currentBinding(var3);
                        final SubLObject var11 = module0271.$g2563$.currentBinding(var3);
                        try {
                            module0271.$g2564$.bind((SubLObject)module0274.NIL, var3);
                            module0271.$g2562$.bind(f18091(), var3);
                            module0271.$g2561$.bind(f18092(), var3);
                            module0271.$g2563$.bind(f18093(), var3);
                            final SubLObject var10_50 = module0152.$g2101$.currentBinding(var3);
                            try {
                                module0152.$g2101$.bind((SubLObject)module0274.T, var3);
                                var4 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != f18094(var1, module0147.$g2095$.getDynamicValue(var3)) && module0274.NIL != var4);
                            }
                            finally {
                                module0152.$g2101$.rebind(var10_50, var3);
                            }
                            if (module0274.NIL == f18087(var4) && module0274.NIL != f18095(var1, (SubLObject)module0274.UNPROVIDED)) {
                                final SubLObject var10_51 = module0152.$g2101$.currentBinding(var3);
                                try {
                                    module0152.$g2101$.bind((SubLObject)module0274.T, var3);
                                    if (module0274.NIL == ((module0274.NIL != module0144.$g1851$.getDynamicValue(var3)) ? module0307.f20734(var1, module0147.$g2095$.getDynamicValue(var3)) : module0307.f20738(var1, module0147.$g2095$.getDynamicValue(var3), (SubLObject)module0274.T, (SubLObject)module0274.T))) {
                                        var4 = (SubLObject)module0274.NIL;
                                        f18096(module0303.f20207());
                                    }
                                }
                                finally {
                                    module0152.$g2101$.rebind(var10_51, var3);
                                }
                            }
                            if (module0274.NIL == f18087(var4) && module0274.NIL != f18097(var1, (SubLObject)module0274.$ic4$)) {
                                final SubLObject var10_52 = module0152.$g2101$.currentBinding(var3);
                                try {
                                    module0152.$g2101$.bind((SubLObject)module0274.T, var3);
                                    if (module0274.NIL == f18098(var1, (SubLObject)module0274.$ic4$)) {
                                        var4 = (SubLObject)module0274.NIL;
                                    }
                                }
                                finally {
                                    module0152.$g2101$.rebind(var10_52, var3);
                                }
                            }
                        }
                        finally {
                            module0271.$g2563$.rebind(var11, var3);
                            module0271.$g2561$.rebind(var12_51, var3);
                            module0271.$g2562$.rebind(var11_50, var3);
                            module0271.$g2564$.rebind(var10_49, var3);
                        }
                    }
                    if (module0274.NIL == f18087(var4) && module0274.NIL != f18099(var1)) {
                        final SubLObject var10_53 = module0018.$g696$.currentBinding(var3);
                        try {
                            module0018.$g696$.bind((SubLObject)module0274.NIL, var3);
                            var3.resetMultipleValues();
                            final SubLObject var12 = f18100(var1, var2);
                            final SubLObject var2_58 = var3.secondMultipleValue();
                            var3.resetMultipleValues();
                            final SubLObject var10_54 = module0144.$g1808$.currentBinding(var3);
                            try {
                                module0144.$g1808$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == module0202.f12925(var1)), var3);
                                if (module0274.NIL != var12 && !var1.equal(var12)) {
                                    final SubLObject var10_55 = module0152.$g2134$.currentBinding(var3);
                                    final SubLObject var11_51 = module0152.$g2122$.currentBinding(var3);
                                    final SubLObject var12_52 = module0152.$g2133$.currentBinding(var3);
                                    final SubLObject var13 = module0152.$g2127$.currentBinding(var3);
                                    try {
                                        module0152.$g2134$.bind(var1, var3);
                                        module0152.$g2122$.bind((SubLObject)module0274.NIL, var3);
                                        module0152.$g2133$.bind((SubLObject)module0274.T, var3);
                                        module0152.$g2127$.bind((module0274.NIL != module0151.f9690() && module0274.NIL != module0152.f9725()) ? module0152.f9725() : var12, var3);
                                        if (module0274.NIL == f18070(var12, var2_58)) {
                                            var4 = (SubLObject)module0274.NIL;
                                        }
                                    }
                                    finally {
                                        module0152.$g2127$.rebind(var13, var3);
                                        module0152.$g2133$.rebind(var12_52, var3);
                                        module0152.$g2122$.rebind(var11_51, var3);
                                        module0152.$g2134$.rebind(var10_55, var3);
                                    }
                                }
                            }
                            finally {
                                module0144.$g1808$.rebind(var10_54, var3);
                            }
                        }
                        finally {
                            module0018.$g696$.rebind(var10_53, var3);
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var10, var3);
                    module0147.$g2094$.rebind(var9, var3);
                    module0147.$g2095$.rebind(var10_47, var3);
                }
            }
            var5 = f18081();
        }
        finally {
            module0152.$g2129$.rebind(var6, var3);
        }
        f18096(var5);
        return var4;
    }
    
    public static SubLObject f18100(final SubLObject var24, final SubLObject var2) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0274.NIL;
        SubLObject var27 = (SubLObject)module0274.NIL;
        SubLObject var28 = (SubLObject)module0274.NIL;
        try {
            var25.throwStack.push(module0274.$ic27$);
            try {
                var25.throwStack.push(module0274.$ic28$);
                var25.resetMultipleValues();
                final SubLObject var65_66 = module0278.f18389(var24, var2);
                final SubLObject var67_68 = var25.secondMultipleValue();
                var25.resetMultipleValues();
                var26 = var65_66;
                var27 = var67_68;
            }
            catch (Throwable var29) {
                var28 = Errors.handleThrowable(var29, (SubLObject)module0274.$ic28$);
            }
            finally {
                var25.throwStack.pop();
            }
        }
        catch (Throwable var29) {
            var28 = Errors.handleThrowable(var29, (SubLObject)module0274.$ic27$);
        }
        finally {
            var25.throwStack.pop();
        }
        if (module0274.NIL != var28) {
            if (module0274.NIL != module0152.$g2115$.getDynamicValue(var25)) {
                f18082(var28);
            }
            return (SubLObject)module0274.NIL;
        }
        return Values.values(var26, var27);
    }
    
    public static SubLObject f18101(final SubLObject var1, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        return f18083(var1, (SubLObject)module0274.T);
    }
    
    public static SubLObject f18094(final SubLObject var1, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        if (module0274.$ic33$.eql(var1)) {
            return (SubLObject)module0274.T;
        }
        if (module0274.$ic34$.eql(var1)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == module0018.f981());
        }
        if (module0274.NIL != f18086(var1)) {
            return (SubLObject)module0274.T;
        }
        return f18102(var1, var2);
    }
    
    public static SubLObject f18103(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0274.NIL == module0206.f13425(var1)) {
            return module0206.f13502(var1);
        }
        f18061();
        final SubLObject var4 = module0152.$g2125$.currentBinding(var3);
        final SubLObject var5 = module0152.$g2126$.currentBinding(var3);
        final SubLObject var6 = module0144.$g1795$.currentBinding(var3);
        final SubLObject var7 = module0152.$g2101$.currentBinding(var3);
        try {
            module0152.$g2125$.bind(var1, var3);
            module0152.$g2126$.bind((module0274.NIL != module0151.f9690() && module0274.NIL != module0152.f9724()) ? module0152.f9724() : var1, var3);
            module0144.$g1795$.bind((SubLObject)module0274.T, var3);
            module0152.$g2101$.bind((SubLObject)module0274.T, var3);
            f18102(var1, var2);
        }
        finally {
            module0152.$g2101$.rebind(var7, var3);
            module0144.$g1795$.rebind(var6, var3);
            module0152.$g2126$.rebind(var5, var3);
            module0152.$g2125$.rebind(var4, var3);
        }
        return Sequences.nreverse(module0144.$g1853$.getDynamicValue(var3));
    }
    
    public static SubLObject f18102(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0274.NIL != assertion_handles_oc.f11035(var1)) {
            return (SubLObject)module0274.T;
        }
        if (module0274.NIL != module0202.f12934(var1)) {
            return f18104(var1, var2);
        }
        if (module0274.NIL != module0202.f12935(var1)) {
            return f18105(var1, var2);
        }
        if (module0274.NIL != module0201.f12580(var1)) {
            return module0146.$g2027$.getDynamicValue(var3);
        }
        if (module0274.NIL != module0201.f12569(var1)) {
            return (SubLObject)module0274.NIL;
        }
        return Errors.error((SubLObject)module0274.$ic35$, var2, var1);
    }
    
    public static SubLObject f18086(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != f18106() && module0274.NIL != conses_high.member(module0205.f13136(var1), (SubLObject)module0274.$ic36$, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED) && module0274.NIL != module0202.f12734(var1, (SubLObject)module0274.TWO_INTEGER, (SubLObject)module0274.UNPROVIDED) && module0274.NIL == module0202.f12665(var1) && module0274.NIL != module0202.f12689(var1, Symbols.symbol_function((SubLObject)module0274.$ic37$)));
    }
    
    public static SubLObject f18071(final SubLObject var24, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0274.NIL;
        final SubLObject var27 = module0271.$g2562$.currentBinding(var25);
        final SubLObject var28 = module0271.$g2561$.currentBinding(var25);
        try {
            module0271.$g2562$.bind((SubLObject)module0274.NIL, var25);
            module0271.$g2561$.bind((SubLObject)module0274.NIL, var25);
            var26 = f18062(var24, (SubLObject)module0274.$ic4$, var2);
        }
        finally {
            module0271.$g2561$.rebind(var28, var25);
            module0271.$g2562$.rebind(var27, var25);
        }
        return var26;
    }
    
    public static SubLObject f18068(final SubLObject var70, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        SubLObject var72 = module0232.f15320(var70);
        if (module0274.NIL == f18087(var72) && module0274.NIL != f18084(var70)) {
            var72 = (SubLObject)module0274.NIL;
            final SubLObject var73 = module0152.$g2101$.currentBinding(var71);
            try {
                module0152.$g2101$.bind((SubLObject)module0274.T, var71);
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic21$, f18085(var70)));
            }
            finally {
                module0152.$g2101$.rebind(var73, var71);
            }
        }
        SubLObject var74 = module0232.f15306(var70);
        SubLObject var75 = (SubLObject)module0274.NIL;
        var75 = var74.first();
        while (module0274.NIL != var74) {
            var72 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != var72 && module0274.NIL != module0206.f13433(var75));
            var74 = var74.rest();
            var75 = var74.first();
        }
        var74 = module0232.f15308(var70);
        var75 = (SubLObject)module0274.NIL;
        var75 = var74.first();
        while (module0274.NIL != var74) {
            var72 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != var72 && module0274.NIL != module0206.f13433(var75));
            var74 = var74.rest();
            var75 = var74.first();
        }
        final SubLObject var76 = module0205.f13327(var2);
        if (module0274.NIL == f18087(var72) && module0274.NIL != module0271.f17874(var76)) {
            var72 = (SubLObject)module0274.NIL;
            f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic23$, var76));
        }
        if (module0274.NIL == f18090() && module0274.NIL != var72) {
            final SubLObject var77 = module0147.f9540(var76);
            final SubLObject var78 = module0147.$g2095$.currentBinding(var71);
            final SubLObject var79 = module0147.$g2094$.currentBinding(var71);
            final SubLObject var80 = module0147.$g2096$.currentBinding(var71);
            try {
                module0147.$g2095$.bind(module0147.f9545(var77), var71);
                module0147.$g2094$.bind(module0147.f9546(var77), var71);
                module0147.$g2096$.bind(module0147.f9549(var77), var71);
                if (module0274.NIL == f18087(var72)) {
                    final SubLObject var10_72 = module0271.$g2564$.currentBinding(var71);
                    final SubLObject var11_73 = module0271.$g2562$.currentBinding(var71);
                    final SubLObject var12_74 = module0271.$g2561$.currentBinding(var71);
                    final SubLObject var81 = module0271.$g2563$.currentBinding(var71);
                    try {
                        module0271.$g2564$.bind(f18107(), var71);
                        module0271.$g2562$.bind(f18091(), var71);
                        module0271.$g2561$.bind(f18092(), var71);
                        module0271.$g2563$.bind(f18093(), var71);
                        final SubLObject var10_73 = module0152.$g2101$.currentBinding(var71);
                        try {
                            module0152.$g2101$.bind((SubLObject)module0274.T, var71);
                            var72 = f18108(var70);
                        }
                        finally {
                            module0152.$g2101$.rebind(var10_73, var71);
                        }
                        if (module0274.NIL == f18087(var72) && module0274.NIL != f18095(var70, Symbols.symbol_function((SubLObject)module0274.$ic38$))) {
                            final SubLObject var10_74 = module0152.$g2101$.currentBinding(var71);
                            try {
                                module0152.$g2101$.bind((SubLObject)module0274.T, var71);
                                if (module0274.NIL == ((module0274.NIL != module0144.$g1851$.getDynamicValue(var71)) ? module0307.f20755(var70, var2, Symbols.symbol_function((SubLObject)module0274.$ic38$)) : module0307.f20756(var70, var2, Symbols.symbol_function((SubLObject)module0274.$ic38$)))) {
                                    var72 = (SubLObject)module0274.NIL;
                                    f18096(module0303.f20207());
                                }
                            }
                            finally {
                                module0152.$g2101$.rebind(var10_74, var71);
                            }
                        }
                        if (module0274.NIL == f18087(var72) && module0274.NIL != f18097(var70, (SubLObject)module0274.$ic8$)) {
                            final SubLObject var10_75 = module0152.$g2101$.currentBinding(var71);
                            try {
                                module0152.$g2101$.bind((SubLObject)module0274.T, var71);
                                var72 = f18098(var70, (SubLObject)module0274.$ic8$);
                            }
                            finally {
                                module0152.$g2101$.rebind(var10_75, var71);
                            }
                        }
                    }
                    finally {
                        module0271.$g2563$.rebind(var81, var71);
                        module0271.$g2561$.rebind(var12_74, var71);
                        module0271.$g2562$.rebind(var11_73, var71);
                        module0271.$g2564$.rebind(var10_72, var71);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var80, var71);
                module0147.$g2094$.rebind(var79, var71);
                module0147.$g2095$.rebind(var78, var71);
            }
        }
        return var72;
    }
    
    public static SubLObject f18108(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        SubLObject var72 = (SubLObject)module0274.T;
        final SubLObject var73 = module0144.$g1799$.currentBinding(var71);
        try {
            module0144.$g1799$.bind(module0309.f20967(var70), var71);
            SubLObject var74 = (SubLObject)module0274.NIL;
            if (module0274.NIL == var74) {
                SubLObject var75 = var70;
                SubLObject var76 = (SubLObject)module0274.NIL;
                var76 = var75.first();
                while (module0274.NIL == var74 && module0274.NIL != var75) {
                    if (module0274.NIL == var74) {
                        SubLObject var79_81 = var76;
                        SubLObject var77 = (SubLObject)module0274.NIL;
                        var77 = var79_81.first();
                        while (module0274.NIL == var74 && module0274.NIL != var79_81) {
                            var72 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != f18109(var77, (SubLObject)module0274.UNPROVIDED) && module0274.NIL != var72);
                            var74 = f18087(var72);
                            var79_81 = var79_81.rest();
                            var77 = var79_81.first();
                        }
                    }
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        finally {
            module0144.$g1799$.rebind(var73, var71);
        }
        return var72;
    }
    
    public static SubLObject f18069(final SubLObject var83, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18109(final SubLObject var84, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        SubLObject var85 = (SubLObject)module0274.NIL;
        if (module0274.NIL != module0202.f12934(var84)) {
            var85 = f18104(var84, var2);
        }
        return var85;
    }
    
    public static SubLObject f18110(final SubLObject var24, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = var3;
        assert module0274.NIL != module0035.f2327(var26) : var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        for (var27 = (SubLObject)module0274.NIL, var27 = var26; module0274.NIL != var27; var27 = conses_high.cddr(var27)) {
            var28 = var27.first();
            var29 = conses_high.cadr(var27);
            assert module0274.NIL != module0152.f9712(var28) : var28;
        }
        SubLObject var30 = (SubLObject)module0274.NIL;
        final SubLObject var31 = module0018.$g698$.currentBinding(var25);
        try {
            module0018.$g698$.bind((SubLObject)module0274.T, var25);
            final SubLObject var32 = module0147.f9540(module0162.f10628(var2));
            final SubLObject var10_86 = module0147.$g2095$.currentBinding(var25);
            final SubLObject var33 = module0147.$g2094$.currentBinding(var25);
            final SubLObject var34 = module0147.$g2096$.currentBinding(var25);
            final SubLObject var35 = module0271.$g2560$.currentBinding(var25);
            final SubLObject var36 = module0144.$g1771$.currentBinding(var25);
            try {
                module0147.$g2095$.bind(module0147.f9545(var32), var25);
                module0147.$g2094$.bind(module0147.f9546(var32), var25);
                module0147.$g2096$.bind(module0147.f9549(var32), var25);
                module0271.$g2560$.bind(module0285.f18891(var2), var25);
                module0144.$g1771$.bind(module0271.$g2560$.getDynamicValue(var25), var25);
                final SubLObject var38;
                final SubLObject var37 = var38 = module0151.f9700(var3);
                final SubLObject var10_87 = module0152.$g2104$.currentBinding(var25);
                try {
                    module0152.$g2104$.bind(var38, var25);
                    final SubLObject var39 = var38;
                    assert module0274.NIL != module0091.f6325(var39) : var39;
                    final SubLObject var40 = module0091.f6339(var39);
                    final ArrayList var41 = Dynamic.extract_dynamic_values(var40);
                    try {
                        Dynamic.bind_dynamic_vars(var40, module0091.f6340(var39));
                        var30 = f18101(var24, (SubLObject)module0274.UNPROVIDED);
                    }
                    finally {
                        Dynamic.rebind_dynamic_vars(var40, var41);
                    }
                }
                finally {
                    module0152.$g2104$.rebind(var10_87, var25);
                }
            }
            finally {
                module0144.$g1771$.rebind(var36, var25);
                module0271.$g2560$.rebind(var35, var25);
                module0147.$g2096$.rebind(var34, var25);
                module0147.$g2094$.rebind(var33, var25);
                module0147.$g2095$.rebind(var10_86, var25);
            }
        }
        finally {
            module0018.$g698$.rebind(var31, var25);
        }
        return var30;
    }
    
    public static SubLObject f18107() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0271.$g2564$.getDynamicValue(var4) && module0274.NIL == module0018.$g697$.getDynamicValue(var4));
    }
    
    public static SubLObject f18111(final SubLObject var89, final SubLObject var90) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == module0279.f18450(var89, var90, (SubLObject)module0274.UNPROVIDED) || module0274.NIL != module0279.f18480(var89, var90, (SubLObject)module0274.UNPROVIDED));
    }
    
    public static SubLObject f18112(SubLObject var91, SubLObject var90) {
        if (var91 == module0274.UNPROVIDED) {
            var91 = (SubLObject)module0274.NIL;
        }
        if (var90 == module0274.UNPROVIDED) {
            var90 = (SubLObject)module0274.NIL;
        }
        final SubLThread var92 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0271.$g2564$.getDynamicValue(var92) && (module0274.NIL == module0173.f10955(var91) || !var90.isInteger() || module0274.NIL != f18111(var91, var90)));
    }
    
    public static SubLObject f18091() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0271.$g2562$.getDynamicValue(var4) && module0274.NIL != module0271.$g2560$.getDynamicValue(var4));
    }
    
    public static SubLObject f18092() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0271.$g2561$.getDynamicValue(var4) && module0274.NIL != module0271.$g2560$.getDynamicValue(var4));
    }
    
    public static SubLObject f18093() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0271.$g2563$.getDynamicValue(var4) && module0274.NIL != f18091());
    }
    
    public static SubLObject f18113() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0152.$g2110$.getDynamicValue(var4);
    }
    
    public static SubLObject f18114() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0152.$g2112$.getDynamicValue(var4);
    }
    
    public static SubLObject f18115() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0152.$g2113$.getDynamicValue(var4);
    }
    
    public static SubLObject f18116() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0152.$g2118$.getDynamicValue(var4);
    }
    
    public static SubLObject f18095(final SubLObject var24, SubLObject var92) {
        if (var92 == module0274.UNPROVIDED) {
            var92 = Symbols.symbol_function((SubLObject)module0274.$ic39$);
        }
        final SubLThread var93 = SubLProcess.currentSubLThread();
        if (module0274.NIL == module0151.f9690() && module0274.NIL != module0271.$g2563$.getDynamicValue(var93)) {
            return module0035.f2439(var92, var24, (SubLObject)module0274.UNPROVIDED);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18106() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == module0271.$g2562$.getDynamicValue(var4) && module0274.NIL == module0271.$g2560$.getDynamicValue(var4) && module0274.NIL == module0271.$g2561$.getDynamicValue(var4) && module0274.NIL == module0271.$g2563$.getDynamicValue(var4) && module0274.NIL == module0144.$g1771$.getDynamicValue(var4) && module0274.NIL == module0144.$g1769$.getDynamicValue(var4));
    }
    
    public static SubLObject f18117() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != f18106() && module0274.NIL == module0271.$g2564$.getDynamicValue(var4));
    }
    
    public static SubLObject f18090() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0271.$g2565$.getDynamicValue(var4) && module0274.NIL == module0152.$g2115$.getDynamicValue(var4) && module0274.NIL != f18106());
    }
    
    public static SubLObject f18099(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0274.NIL == module0151.f9690() && module0274.NIL != module0152.$g2122$.getDynamicValue(var25)) {
            return module0278.f18400(var24, (SubLObject)module0274.UNPROVIDED);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18097(final SubLObject var24, SubLObject var27) {
        if (var27 == module0274.UNPROVIDED) {
            var27 = (SubLObject)module0274.$ic4$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        if (module0274.NIL == module0151.f9690() && module0274.NIL != module0271.$g2561$.getDynamicValue(var28)) {
            final SubLObject var29 = var27;
            if (var29.eql((SubLObject)module0274.$ic4$)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == module0202.f12934(var24));
            }
            if (var29.eql((SubLObject)module0274.$ic8$)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == module0232.f15322(var24));
            }
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18087(SubLObject var9) {
        if (var9 == module0274.UNPROVIDED) {
            var9 = (SubLObject)module0274.T;
        }
        if (module0274.NIL == f18118()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var9 || module0274.NIL != f18081());
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18084(final SubLObject var93) {
        return module0205.f13145(Symbols.symbol_function((SubLObject)module0274.$ic40$), var93, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED);
    }
    
    public static SubLObject f18085(final SubLObject var93) {
        return module0205.f13183(var93, Symbols.symbol_function((SubLObject)module0274.$ic40$), (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED);
    }
    
    public static SubLObject f18119(final SubLObject var84) {
        return (SubLObject)module0274.T;
    }
    
    public static SubLObject f18120(final SubLObject var84) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0202.f12965(var84) && module0274.NIL != module0309.f21041(var84, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED));
    }
    
    public static SubLObject f18121(final SubLObject var84) {
        return (SubLObject)module0274.T;
    }
    
    public static SubLObject f18122(final SubLObject var84) {
        return (SubLObject)module0274.T;
    }
    
    public static SubLObject f18104(final SubLObject var84, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        if (module0274.NIL != module0151.f9690()) {
            return f18123(var84, var2, f18106(), module0271.f17873());
        }
        SubLObject var86 = (SubLObject)module0274.NIL;
        final SubLObject var87 = module0152.$g2129$.currentBinding(var85);
        try {
            module0152.$g2129$.bind((SubLObject)module0274.NIL, var85);
            var86 = f18124(var84);
            if (module0274.NIL == f18087(var86)) {
                var86 = f18123(var84, var2, f18106(), module0271.f17873());
            }
        }
        finally {
            module0152.$g2129$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f18125(final SubLObject var24) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0202.f12933(var24) && module0274.NIL == f18126(var24));
    }
    
    public static SubLObject f18124(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0034.$g879$.getDynamicValue(var25);
        SubLObject var27 = (SubLObject)module0274.NIL;
        if (module0274.NIL == var26) {
            return f18125(var24);
        }
        var27 = module0034.f1857(var26, (SubLObject)module0274.$ic41$, (SubLObject)module0274.UNPROVIDED);
        if (module0274.NIL == var27) {
            var27 = module0034.f1807(module0034.f1842(var26), (SubLObject)module0274.$ic41$, (SubLObject)module0274.ONE_INTEGER, (SubLObject)module0274.NIL, (SubLObject)module0274.EQUAL, (SubLObject)module0274.UNPROVIDED);
            module0034.f1860(var26, (SubLObject)module0274.$ic41$, var27);
        }
        SubLObject var28 = module0034.f1814(var27, var24, (SubLObject)module0274.$ic18$);
        if (var28 == module0274.$ic18$) {
            var28 = Values.arg2(var25.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18125(var24)));
            module0034.f1816(var27, var24, var28, (SubLObject)module0274.UNPROVIDED);
        }
        return module0034.f1959(var28);
    }
    
    public static SubLObject f18127(final SubLObject var84) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0274.NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)module0274.$ic12$, var85);
            module0147.$g2095$.bind(module0274.$ic13$, var85);
            var86 = f18104(var84, (SubLObject)module0274.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f18128(final SubLObject var84, final SubLObject var2, final SubLObject var97, final SubLObject var98) {
        if (module0274.NIL == module0271.f17873() || module0274.NIL != f18129(var84, var2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != f18130(var84, var2) && module0274.NIL != f18131(var84, var2));
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18123(final SubLObject var84, final SubLObject var2, final SubLObject var97, final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        final SubLObject var100 = module0034.$g879$.getDynamicValue(var99);
        SubLObject var101 = (SubLObject)module0274.NIL;
        if (module0274.NIL == var100) {
            return f18128(var84, var2, var97, var98);
        }
        var101 = module0034.f1857(var100, (SubLObject)module0274.$ic42$, (SubLObject)module0274.UNPROVIDED);
        if (module0274.NIL == var101) {
            var101 = module0034.f1807(module0034.f1842(var100), (SubLObject)module0274.$ic42$, (SubLObject)module0274.FOUR_INTEGER, (SubLObject)module0274.NIL, (SubLObject)module0274.EQUAL, (SubLObject)module0274.UNPROVIDED);
            module0034.f1860(var100, (SubLObject)module0274.$ic42$, var101);
        }
        final SubLObject var102 = module0034.f1780(var84, var2, var97, var98);
        final SubLObject var103 = module0034.f1814(var101, var102, (SubLObject)module0274.UNPROVIDED);
        if (var103 != module0274.$ic18$) {
            SubLObject var104 = var103;
            SubLObject var105 = (SubLObject)module0274.NIL;
            var105 = var104.first();
            while (module0274.NIL != var104) {
                SubLObject var106 = var105.first();
                final SubLObject var107 = conses_high.second(var105);
                if (var84.equal(var106.first())) {
                    var106 = var106.rest();
                    if (var2.equal(var106.first())) {
                        var106 = var106.rest();
                        if (var97.equal(var106.first())) {
                            var106 = var106.rest();
                            if (module0274.NIL != var106 && module0274.NIL == var106.rest() && var98.equal(var106.first())) {
                                return module0034.f1959(var107);
                            }
                        }
                    }
                }
                var104 = var104.rest();
                var105 = var104.first();
            }
        }
        final SubLObject var108 = Values.arg2(var99.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18128(var84, var2, var97, var98)));
        module0034.f1836(var101, var102, var103, var108, (SubLObject)ConsesLow.list(var84, var2, var97, var98));
        return module0034.f1959(var108);
    }
    
    public static SubLObject f18129(final SubLObject var84, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0274.NIL;
        if (module0274.NIL != f18113() && module0274.NIL == f18132(module0202.f12832(var84, (SubLObject)module0274.UNPROVIDED)) && module0274.NIL != f18133(var84)) {
            var86 = (SubLObject)module0274.T;
            f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic43$, var84));
        }
        if (module0274.NIL == f18087((SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var86)) && module0274.NIL != f18114() && module0274.NIL != module0202.f12691(var84, Symbols.symbol_function((SubLObject)module0274.$ic39$)) && module0274.NIL != module0229.f15236(module0202.f12832(var84, (SubLObject)module0274.UNPROVIDED), var2)) {
            var85.resetMultipleValues();
            final SubLObject var87 = module0229.f15243(var84);
            final SubLObject var88 = var85.secondMultipleValue();
            var85.resetMultipleValues();
            if (module0274.NIL != var88 && (module0274.NIL == var87 || var87.eql(module0274.$ic34$))) {
                var86 = (SubLObject)module0274.T;
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic44$, var84, var2));
            }
        }
        if (module0274.NIL == f18087((SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var86))) {
            var85.resetMultipleValues();
            final SubLObject var89 = module0279.f18578(var84, var2);
            SubLObject var90 = var85.secondMultipleValue();
            var85.resetMultipleValues();
            final SubLObject var91 = module0226.f14824(var89);
            SubLObject var92 = (SubLObject)module0274.NIL;
            if (module0274.NIL != var91) {
                var92 = module0226.f14826(var89);
                if (module0274.NIL == module0226.f14829(var90, var92)) {
                    var90 = var92;
                }
            }
            if (module0274.NIL == module0144.$g1805$.getDynamicValue(var85) && module0274.NIL == module0144.$g1806$.getDynamicValue(var85) && module0274.NIL != var90 && module0274.NIL != module0226.f15156(var90)) {
                var86 = (SubLObject)module0274.T;
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic45$, var90, var89, var91));
            }
        }
        if (module0274.NIL == f18087((SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var86)) && module0274.NIL == module0144.$g1799$.getDynamicValue(var85) && module0274.NIL == module0144.$g1805$.getDynamicValue(var85) && module0274.NIL == module0144.$g1806$.getDynamicValue(var85) && module0274.NIL != module0202.f12691(var84, (SubLObject)module0274.UNPROVIDED)) {
            if (module0274.NIL != module0226.f15154(module0202.f12832(var84, (SubLObject)module0274.UNPROVIDED), var2)) {
                var86 = (SubLObject)module0274.T;
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic46$, var84, var2));
            }
            else if (module0274.NIL != module0202.f12859(var84) && module0274.NIL != module0226.f15155(module0202.f12835(var84, (SubLObject)module0274.UNPROVIDED), var2)) {
                var86 = (SubLObject)module0274.T;
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic47$, var84, var2));
            }
        }
        if (module0274.NIL == f18087((SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var86)) && module0274.NIL == module0144.$g1799$.getDynamicValue(var85) && module0274.NIL == module0144.$g1805$.getDynamicValue(var85) && module0274.NIL == module0144.$g1806$.getDynamicValue(var85) && module0274.NIL != module0152.$g2109$.getDynamicValue(var85) && module0274.NIL != f18134(var84, var2)) {
            var86 = (SubLObject)module0274.T;
        }
        if (module0274.NIL != f18115() && module0274.NIL == f18087((SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var86)) && module0274.NIL == module0144.$g1799$.getDynamicValue(var85) && module0274.NIL == module0144.$g1805$.getDynamicValue(var85) && module0274.NIL == module0144.$g1806$.getDynamicValue(var85) && module0274.NIL != module0202.f12691(var84, (SubLObject)module0274.UNPROVIDED)) {
            final SubLObject var93 = (module0274.NIL != var2) ? var2 : module0147.$g2095$.getDynamicValue(var85);
            final SubLObject var94 = module0202.f12832(var84, (SubLObject)module0274.UNPROVIDED);
            if (module0274.NIL != module0161.f10481(var93) && module0274.NIL != module0173.f10955(var94) && module0274.NIL != module0259.f16854(var93, module0274.$ic48$, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED) && module0274.NIL == f18135(var94, (SubLObject)module0274.UNPROVIDED) && module0274.NIL == f18136(var84, var2)) {
                var86 = (SubLObject)module0274.T;
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic49$, var84, var2));
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var86);
    }
    
    public static SubLObject f18136(final SubLObject var84, final SubLObject var2) {
        final SubLObject var85 = module0202.f12833(var84, (SubLObject)module0274.UNPROVIDED);
        SubLObject var86 = (SubLObject)module0274.ZERO_INTEGER;
        SubLObject var87 = (SubLObject)module0274.NIL;
        if (module0274.NIL == var87) {
            SubLObject var88 = module0202.f12829(var84, (SubLObject)module0274.$ic50$);
            SubLObject var89 = (SubLObject)module0274.NIL;
            var89 = var88.first();
            while (module0274.NIL == var87 && module0274.NIL != var88) {
                var86 = Numbers.add(var86, (SubLObject)module0274.ONE_INTEGER);
                if (module0274.NIL != module0279.f18447(var85, var86, (SubLObject)module0274.UNPROVIDED) && module0274.NIL == var87) {
                    SubLObject var79_116 = module0288.f19342(var89, var2);
                    SubLObject var90 = (SubLObject)module0274.NIL;
                    var90 = var79_116.first();
                    while (module0274.NIL == var87 && module0274.NIL != var79_116) {
                        if (module0274.NIL != module0178.f11284(var90) && var2.eql(module0178.f11287(var90))) {
                            final SubLObject var91 = module0178.f11333(var90);
                            if (module0274.NIL != module0173.f10955(var91)) {
                                var87 = f18135(var91, (SubLObject)module0274.UNPROVIDED);
                            }
                        }
                        var79_116 = var79_116.rest();
                        var90 = var79_116.first();
                    }
                }
                var88 = var88.rest();
                var89 = var88.first();
            }
        }
        return var87;
    }
    
    public static SubLObject f18135(final SubLObject var119, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0274.$ic51$;
        }
        return module0259.f16902(var119, (SubLObject)module0274.$ic52$, var2, (SubLObject)module0274.UNPROVIDED);
    }
    
    public static SubLObject f18134(final SubLObject var84, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        SubLObject var85 = (SubLObject)module0274.NIL;
        if (module0274.NIL != module0279.f18527()) {
            if (module0274.NIL != f18137(var84, var2)) {
                f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic53$, var84, var2));
                var85 = (SubLObject)module0274.T;
            }
        }
        else if (module0274.NIL != f18138(var84, var2)) {
            f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic54$, var84, var2));
            var85 = (SubLObject)module0274.T;
        }
        return var85;
    }
    
    public static SubLObject f18137(final SubLObject var71, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        final SubLObject var73 = module0202.f12832(var71, (SubLObject)module0274.UNPROVIDED);
        final SubLObject var74 = module0202.f12834(var71, (SubLObject)module0274.UNPROVIDED);
        final SubLObject var75 = module0202.f12835(var71, (SubLObject)module0274.UNPROVIDED);
        if (module0274.NIL != module0244.f15734(var73) && module0274.NIL != module0210.f13565(var75)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0252.f16335(module0137.f8955(var73), var74, var75, var2, (SubLObject)module0274.UNPROVIDED) || (module0274.NIL != module0274.$g2585$.getDynamicValue(var72) && module0274.$ic25$.eql(var73) && module0274.NIL != module0173.f10956(var74) && module0274.NIL != module0305.f20438(var74, var75, var2)));
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18138(final SubLObject var71, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        final SubLObject var73 = module0202.f12832(var71, (SubLObject)module0274.UNPROVIDED);
        final SubLObject var74 = module0202.f12834(var71, (SubLObject)module0274.UNPROVIDED);
        final SubLObject var75 = module0202.f12835(var71, (SubLObject)module0274.UNPROVIDED);
        if (module0274.NIL == module0244.f15734(var73) || module0274.NIL == module0210.f13565(var75)) {
            return (SubLObject)module0274.NIL;
        }
        final SubLObject var76 = module0137.f8955(var73);
        if (module0274.NIL != module0244.f15768(var76)) {
            return module0252.f16346(var76, var74, var75, var2, (SubLObject)module0274.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0254.f16488(var76, var74, var75, var2, (SubLObject)module0274.UNPROVIDED) || (module0274.NIL != module0274.$g2585$.getDynamicValue(var72) && module0274.$ic25$.eql(var73) && module0274.NIL != module0173.f10956(var74) && module0274.NIL != module0305.f20444(var74, var75, var2)));
    }
    
    public static SubLObject f18133(final SubLObject var124) {
        if (module0274.NIL != constant_handles_oc.f8449(var124) && module0274.NIL != module0210.f13584(var124)) {
            return var124;
        }
        if (module0274.NIL != module0202.f12590(var124)) {
            if (module0274.NIL != module0205.f13215((SubLObject)module0274.$ic55$, var124, (SubLObject)module0274.T, (SubLObject)module0274.UNPROVIDED)) {
                if (module0274.NIL == module0210.f13584(module0205.f13276(var124))) {
                    final SubLObject var125 = module0205.f13132(var124);
                    SubLObject var126 = (SubLObject)module0274.NIL;
                    SubLObject var127 = (SubLObject)module0274.NIL;
                    SubLObject var128 = (SubLObject)module0274.NIL;
                    SubLObject var129 = (SubLObject)module0274.NIL;
                    var127 = (SubLObject)module0274.ZERO_INTEGER;
                    var128 = var124;
                    var129 = var128.first();
                    while (var128.rest().isCons()) {
                        if (module0274.NIL == module0279.f18485(var125, var127, (SubLObject)module0274.UNPROVIDED) && module0274.NIL == module0226.f14837(var125, var127) && module0274.NIL == module0279.f18448(var125, var127, (SubLObject)module0274.UNPROVIDED)) {
                            var126 = f18133(var129);
                            if (module0274.NIL != var126) {
                                return var126;
                            }
                        }
                        var127 = Numbers.add((SubLObject)module0274.ONE_INTEGER, var127);
                        var128 = var128.rest();
                        var129 = var128.first();
                    }
                    if (module0274.NIL == module0279.f18485(var125, var127, (SubLObject)module0274.UNPROVIDED) && module0274.NIL == module0226.f14837(var125, var127) && module0274.NIL == module0279.f18448(var125, var127, (SubLObject)module0274.UNPROVIDED)) {
                        var126 = f18133(var128.first());
                        if (module0274.NIL != var126) {
                            return var126;
                        }
                        if (module0274.NIL != var128.rest()) {
                            var126 = f18133(var128.rest());
                        }
                    }
                    return var126;
                }
                if (module0274.NIL != module0202.f12691(var124, Symbols.symbol_function((SubLObject)module0274.$ic39$))) {
                    final SubLObject var125 = module0205.f13132(var124);
                    SubLObject var126 = (SubLObject)module0274.NIL;
                    SubLObject var127 = (SubLObject)module0274.NIL;
                    SubLObject var128 = (SubLObject)module0274.NIL;
                    SubLObject var129 = (SubLObject)module0274.NIL;
                    var127 = (SubLObject)module0274.ZERO_INTEGER;
                    var128 = module0205.f13304(var124, (SubLObject)module0274.UNPROVIDED);
                    var129 = var128.first();
                    while (var128.rest().isCons()) {
                        if (module0274.NIL == module0279.f18485(var125, var127, (SubLObject)module0274.UNPROVIDED) && module0274.NIL == module0226.f14837(var125, var127) && module0274.NIL == module0279.f18448(var125, var127, (SubLObject)module0274.UNPROVIDED)) {
                            var126 = f18133(var129);
                            if (module0274.NIL != var126) {
                                return var126;
                            }
                        }
                        var127 = Numbers.add((SubLObject)module0274.ONE_INTEGER, var127);
                        var128 = var128.rest();
                        var129 = var128.first();
                    }
                    if (module0274.NIL == module0279.f18485(var125, var127, (SubLObject)module0274.UNPROVIDED) && module0274.NIL == module0226.f14837(var125, var127) && module0274.NIL == module0279.f18448(var125, var127, (SubLObject)module0274.UNPROVIDED)) {
                        var126 = f18133(var128.first());
                        if (module0274.NIL != var126) {
                            return var126;
                        }
                        if (module0274.NIL != var128.rest()) {
                            var126 = f18133(var128.rest());
                        }
                    }
                    return var126;
                }
                return var124;
            }
        }
        else if (module0274.NIL != var124) {
            return f18133(module0228.f15205(var124));
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18132(final SubLObject var118) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0004.f104(var118, module0146.$g2072$.getGlobalValue(), (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED) || module0274.NIL != f18139(var118) || module0274.NIL != module0269.f17754(var118));
    }
    
    public static SubLObject f18139(final SubLObject var118) {
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18140() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0018.$g696$.getDynamicValue(var4) && module0274.NIL != module0152.$g2114$.getDynamicValue(var4));
    }
    
    public static SubLObject f18131(final SubLObject var84, final SubLObject var2) {
        if (module0274.NIL == f18116()) {
            return (SubLObject)module0274.T;
        }
        final SubLObject var85 = module0202.f12832(var84, (SubLObject)module0274.UNPROVIDED);
        if (var85.eql(module0274.$ic56$)) {
            return f18141(var84);
        }
        if (var85.eql(module0274.$ic57$)) {
            return f18142(var84, var2);
        }
        if (var85.eql(module0274.$ic58$)) {
            return module0285.f18958(var84, var2, f18140());
        }
        if (var85.eql(module0274.$ic59$)) {
            return module0285.f18958(var84, var2, f18140());
        }
        return (SubLObject)module0274.T;
    }
    
    public static SubLObject f18141(final SubLObject var84) {
        if (module0274.NIL != module0035.f1997(module0202.f12942(module0202.f12835(var84, (SubLObject)module0274.UNPROVIDED), (SubLObject)module0274.UNPROVIDED))) {
            return (SubLObject)module0274.T;
        }
        f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic60$, var84));
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18142(final SubLObject var84, final SubLObject var2) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        if (module0274.NIL == module0018.f981() || var2.eql(module0132.$g1558$.getGlobalValue()) || module0274.NIL != module0144.$g1799$.getDynamicValue(var85) || module0274.NIL == module0202.f12689(var84, (SubLObject)module0274.UNPROVIDED)) {
            return (SubLObject)module0274.T;
        }
        f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic61$, var84, var2));
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18105(final SubLObject var126, final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != f18130(var126, var2) && module0274.NIL != f18143(var126, var2));
    }
    
    public static SubLObject f18143(final SubLObject var126, final SubLObject var2) {
        SubLObject var127 = (SubLObject)module0274.T;
        final SubLObject var128 = module0205.f13210(var126);
        if (module0274.NIL != module0206.f13445(var128)) {
            SubLObject var129 = (SubLObject)module0274.ZERO_INTEGER;
            SubLObject var131;
            final SubLObject var130 = var131 = module0205.f13207(var126, (SubLObject)module0274.$ic50$);
            SubLObject var132 = (SubLObject)module0274.NIL;
            var132 = var131.first();
            while (module0274.NIL != var131) {
                var129 = Numbers.add(var129, (SubLObject)module0274.ONE_INTEGER);
                if (module0274.NIL == f18144(var126, var132, var129, var2)) {
                    var127 = (SubLObject)module0274.NIL;
                }
                var131 = var131.rest();
                var132 = var131.first();
            }
        }
        else if (module0274.NIL != module0206.f13446(var128)) {
            final SubLObject var133 = module0202.f12668(var126);
            final SubLObject var134 = module0202.f12749(var126);
            if (module0274.NIL == f18144(var126, var133, var134, var2)) {
                var127 = (SubLObject)module0274.NIL;
            }
        }
        else {
            Errors.error((SubLObject)module0274.$ic62$, var128, var126);
        }
        return var127;
    }
    
    public static SubLObject f18144(final SubLObject var126, final SubLObject var129, final SubLObject var90, final SubLObject var2) {
        final SubLThread var130 = SubLProcess.currentSubLThread();
        SubLObject var131 = (SubLObject)module0274.T;
        final SubLObject var132 = module0205.f13210(var126);
        final SubLObject var133 = module0146.$g2032$.currentBinding(var130);
        final SubLObject var134 = module0144.$g1801$.currentBinding(var130);
        final SubLObject var135 = module0144.$g1799$.currentBinding(var130);
        try {
            module0146.$g2032$.bind(module0309.f20936(var132, var90), var130);
            module0144.$g1801$.bind(module0309.f20939(var126, var90), var130);
            module0144.$g1799$.bind(module0309.f20942(var126, var2), var130);
            if (module0274.NIL == f18087(var131) && module0274.NIL == f18094(var129, var2)) {
                var131 = (SubLObject)module0274.NIL;
            }
        }
        finally {
            module0144.$g1799$.rebind(var135, var130);
            module0144.$g1801$.rebind(var134, var130);
            module0146.$g2032$.rebind(var133, var130);
        }
        return var131;
    }
    
    public static SubLObject f18130(final SubLObject var1, final SubLObject var2) {
        if (module0274.NIL != var2 && module0274.NIL != module0147.f9513()) {
            return f18145(var1);
        }
        return f18146(var1, var2);
    }
    
    public static SubLObject f18145(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0274.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0274.$ic12$, var2);
            module0147.$g2095$.bind(module0274.$ic13$, var2);
            var3 = f18146(var1, module0274.$ic13$);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f18147(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == f18148(var1, var2));
    }
    
    public static SubLObject f18146(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0034.$g879$.getDynamicValue(var3);
        SubLObject var5 = (SubLObject)module0274.NIL;
        if (module0274.NIL == var4) {
            return f18147(var1, var2);
        }
        var5 = module0034.f1857(var4, (SubLObject)module0274.$ic63$, (SubLObject)module0274.UNPROVIDED);
        if (module0274.NIL == var5) {
            var5 = module0034.f1807(module0034.f1842(var4), (SubLObject)module0274.$ic63$, (SubLObject)module0274.TWO_INTEGER, (SubLObject)module0274.NIL, (SubLObject)module0274.EQUAL, (SubLObject)module0274.UNPROVIDED);
            module0034.f1860(var4, (SubLObject)module0274.$ic63$, var5);
        }
        final SubLObject var6 = module0034.f1782(var1, var2);
        final SubLObject var7 = module0034.f1814(var5, var6, (SubLObject)module0274.UNPROVIDED);
        if (var7 != module0274.$ic18$) {
            SubLObject var8 = var7;
            SubLObject var9 = (SubLObject)module0274.NIL;
            var9 = var8.first();
            while (module0274.NIL != var8) {
                SubLObject var10 = var9.first();
                final SubLObject var11 = conses_high.second(var9);
                if (var1.equal(var10.first())) {
                    var10 = var10.rest();
                    if (module0274.NIL != var10 && module0274.NIL == var10.rest() && var2.equal(var10.first())) {
                        return module0034.f1959(var11);
                    }
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        final SubLObject var12 = Values.arg2(var3.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18147(var1, var2)));
        module0034.f1836(var5, var6, var7, var12, (SubLObject)ConsesLow.list(var1, var2));
        return module0034.f1959(var12);
    }
    
    public static SubLObject f18126(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0274.NIL == module0271.$g2564$.getDynamicValue(var25)) {
            return (SubLObject)module0274.NIL;
        }
        final SubLObject var26 = module0205.f13136(var24);
        if (module0274.NIL != module0206.f13438(var26)) {
            return (SubLObject)module0274.NIL;
        }
        if (module0274.NIL != f18149()) {
            return f18150(var24);
        }
        if (module0274.NIL != module0202.f12707(var24, (SubLObject)module0274.UNPROVIDED)) {
            return f18150(var24);
        }
        final SubLObject var27 = module0202.f12727(var24, (SubLObject)module0274.UNPROVIDED);
        return f18151(var26, var27);
    }
    
    public static SubLObject f18152() {
        final SubLObject var32 = module0274.$g2586$.getGlobalValue();
        if (module0274.NIL != var32) {
            module0034.f1818(var32);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18153(final SubLObject var130, final SubLObject var131) {
        return module0034.f1829(module0274.$g2586$.getGlobalValue(), (SubLObject)ConsesLow.list(var130, var131), (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED);
    }
    
    public static SubLObject f18154(final SubLObject var130, final SubLObject var131) {
        final SubLObject var132 = (SubLObject)ConsesLow.make_list(var131, (SubLObject)module0274.$ic65$);
        final SubLObject var133 = module0202.f12720(var130, var132, (SubLObject)module0274.UNPROVIDED);
        return f18150(var133);
    }
    
    public static SubLObject f18151(final SubLObject var130, final SubLObject var131) {
        SubLObject var132 = module0274.$g2586$.getGlobalValue();
        if (module0274.NIL == var132) {
            var132 = module0034.f1934((SubLObject)module0274.$ic64$, (SubLObject)module0274.$ic66$, (SubLObject)module0274.$ic67$, (SubLObject)module0274.EQUAL, (SubLObject)module0274.TWO_INTEGER, (SubLObject)module0274.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0274.$ic68$);
        }
        final SubLObject var133 = module0034.f1782(var130, var131);
        final SubLObject var134 = module0034.f1814(var132, var133, (SubLObject)module0274.UNPROVIDED);
        if (var134 != module0274.$ic18$) {
            SubLObject var135 = var134;
            SubLObject var136 = (SubLObject)module0274.NIL;
            var136 = var135.first();
            while (module0274.NIL != var135) {
                SubLObject var137 = var136.first();
                final SubLObject var138 = conses_high.second(var136);
                if (var130.equal(var137.first())) {
                    var137 = var137.rest();
                    if (module0274.NIL != var137 && module0274.NIL == var137.rest() && var131.equal(var137.first())) {
                        return module0034.f1959(var138);
                    }
                }
                var135 = var135.rest();
                var136 = var135.first();
            }
        }
        final SubLObject var139 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18154(var130, var131)));
        module0034.f1836(var132, var133, var134, var139, (SubLObject)ConsesLow.list(var130, var131));
        return module0034.f1959(var139);
    }
    
    public static SubLObject f18150(final SubLObject var24) {
        final SubLObject var25 = module0205.f13327(module0205.f13136(var24));
        SubLObject var26 = (SubLObject)module0274.NIL;
        if (module0274.NIL != module0173.f10955(var25) || module0274.NIL != module0202.f12895(var25) || module0274.NIL != module0202.f12899(var25)) {
            if (module0274.NIL != module0225.f14775(var25)) {
                var26 = f18155(var24);
            }
            else {
                var26 = f18156(var24);
            }
        }
        return var26;
    }
    
    public static SubLObject f18156(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0205.f13327(module0205.f13132(var24));
        final SubLObject var27 = module0225.f14739(var26);
        SubLObject var28 = (SubLObject)module0274.NIL;
        if (module0274.NIL == var27) {
            if ((module0274.NIL == module0131.$g1535$.getDynamicValue(var25) || module0274.NIL == module0131.f8587() || module0274.NIL == module0167.f10813(var26)) && module0274.NIL == module0226.f15160(var26)) {
                f18157((SubLObject)ConsesLow.list((SubLObject)module0274.$ic69$, var26, var27, var24));
                var28 = (SubLObject)module0274.T;
            }
        }
        else if (module0274.NIL == module0552.f34094(var27)) {
            f18157((SubLObject)ConsesLow.list((SubLObject)module0274.$ic70$, module0274.$ic71$, var26, var27));
            var28 = (SubLObject)module0274.T;
        }
        else if (module0274.NIL != module0202.f12707(var24, (SubLObject)module0274.UNPROVIDED)) {
            if (!module0202.f12727(var24, (SubLObject)module0274.$ic50$).numLE(var27)) {
                f18157((SubLObject)ConsesLow.list((SubLObject)module0274.$ic72$, module0274.$ic71$, var26, var27, var24));
                var28 = (SubLObject)module0274.T;
            }
        }
        else if (!var27.numE(module0202.f12727(var24, (SubLObject)module0274.UNPROVIDED))) {
            f18157((SubLObject)ConsesLow.list((SubLObject)module0274.$ic72$, module0274.$ic71$, var26, var27, var24));
            var28 = (SubLObject)module0274.T;
        }
        else {
            var28 = (SubLObject)module0274.NIL;
        }
        return var28;
    }
    
    public static SubLObject f18155(final SubLObject var24) {
        final SubLObject var25 = module0205.f13132(var24);
        final SubLObject var26 = module0202.f12727(var24, (SubLObject)module0274.$ic50$);
        final SubLObject var27 = module0225.f14755(var25);
        final SubLObject var28 = module0225.f14767(var25);
        SubLObject var29 = (SubLObject)module0274.NIL;
        if (module0274.NIL != var27) {
            if (module0274.NIL == module0552.f34094(var27)) {
                f18157((SubLObject)ConsesLow.list((SubLObject)module0274.$ic70$, module0274.$ic73$, var25, var26));
                var29 = (SubLObject)module0274.T;
            }
            else if (!var26.numGE(var27) && module0274.NIL == module0202.f12707(var24, (SubLObject)module0274.UNPROVIDED)) {
                f18157((SubLObject)ConsesLow.list((SubLObject)module0274.$ic72$, module0274.$ic73$, var25, var27, var24));
                var29 = (SubLObject)module0274.T;
            }
        }
        if (module0274.NIL != var28) {
            if (module0274.NIL == module0552.f34094(var28)) {
                f18157((SubLObject)ConsesLow.list((SubLObject)module0274.$ic70$, module0274.$ic74$, var25, var26));
                var29 = (SubLObject)module0274.T;
            }
            else if (!var26.numLE(var28)) {
                f18157((SubLObject)ConsesLow.list((SubLObject)module0274.$ic72$, module0274.$ic74$, var25, var28, var24));
                var29 = (SubLObject)module0274.T;
            }
        }
        return var29;
    }
    
    public static SubLObject f18148(final SubLObject var24, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        if (module0274.NIL != f18091() || module0274.NIL == module0202.f12925(var24) || module0274.NIL != module0202.f12883(var24, (SubLObject)module0274.UNPROVIDED)) {
            SubLObject var25 = (SubLObject)module0274.NIL;
            module0303.f20212((SubLObject)module0274.UNPROVIDED);
            var25 = f18158(var24, var2);
            if (module0274.NIL == var25) {
                f18096(module0303.f20207());
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var25);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18158(final SubLObject var24, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        return module0309.f20927(var24, var2);
    }
    
    public static SubLObject f18098(final SubLObject var24, SubLObject var27) {
        if (var27 == module0274.UNPROVIDED) {
            var27 = (SubLObject)module0274.$ic4$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == f18159(var24, var27));
    }
    
    public static SubLObject f18159(final SubLObject var24, SubLObject var27) {
        if (var27 == module0274.UNPROVIDED) {
            var27 = (SubLObject)module0274.$ic4$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        if (module0274.NIL != module0271.$g2561$.getDynamicValue(var28)) {
            final SubLObject var29 = var27;
            if (var29.eql((SubLObject)module0274.$ic4$)) {
                return f18160(var24);
            }
            if (var29.eql((SubLObject)module0274.$ic8$)) {
                return f18161(var24, (SubLObject)module0274.UNPROVIDED);
            }
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18160(final SubLObject var24) {
        SubLObject var25 = (SubLObject)module0274.NIL;
        f18162();
        var25 = module0598.f36651(var24, (SubLObject)module0274.UNPROVIDED);
        var25 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0598.f36662(var24) && module0274.NIL != var25);
        if (module0274.NIL == var25) {
            f18096(f18163());
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var25);
    }
    
    public static SubLObject f18161(final SubLObject var70, SubLObject var137) {
        if (var137 == module0274.UNPROVIDED) {
            var137 = Symbols.symbol_function((SubLObject)module0274.$ic38$);
        }
        SubLObject var138 = (SubLObject)module0274.NIL;
        f18162();
        var138 = module0598.f36652(var70, var137);
        var138 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0598.f36664(var70) && module0274.NIL != var138);
        if (module0274.NIL == var138) {
            f18096(f18163());
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var138);
    }
    
    public static SubLObject f18164(final SubLObject var24, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0274.NIL;
        final SubLObject var27 = module0147.f9540(module0205.f13327(var2));
        final SubLObject var28 = module0147.$g2095$.currentBinding(var25);
        final SubLObject var29 = module0147.$g2094$.currentBinding(var25);
        final SubLObject var30 = module0147.$g2096$.currentBinding(var25);
        final SubLObject var31 = module0152.$g2102$.currentBinding(var25);
        try {
            module0147.$g2095$.bind(module0147.f9545(var27), var25);
            module0147.$g2094$.bind(module0147.f9546(var27), var25);
            module0147.$g2096$.bind(module0147.f9549(var27), var25);
            module0152.$g2102$.bind(module0151.f9695(), var25);
            final SubLObject var32 = module0152.$g2102$.getDynamicValue(var25);
            final SubLObject var10_138 = module0034.$g879$.currentBinding(var25);
            try {
                module0034.$g879$.bind(var32, var25);
                SubLObject var33 = (SubLObject)module0274.NIL;
                if (module0274.NIL != var32 && module0274.NIL == module0034.f1842(var32)) {
                    var33 = module0034.f1869(var32);
                    final SubLObject var34 = Threads.current_process();
                    if (module0274.NIL == var33) {
                        module0034.f1873(var32, var34);
                    }
                    else if (!var33.eql(var34)) {
                        Errors.error((SubLObject)module0274.$ic2$);
                    }
                }
                try {
                    if (module0274.NIL == module0151.f9690()) {
                        f18061();
                    }
                }
                finally {
                    final SubLObject var10_139 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0274.T, var25);
                        final SubLObject var10_140 = module0152.$g2101$.currentBinding(var25);
                        final SubLObject var11_141 = module0152.$g2120$.currentBinding(var25);
                        try {
                            module0152.$g2101$.bind((SubLObject)module0274.T, var25);
                            module0152.$g2120$.bind((SubLObject)module0274.T, var25);
                            if (module0274.NIL != module0201.f12580(var24)) {
                                var26 = (SubLObject)module0274.T;
                            }
                            else {
                                var26 = f18062(var24, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED);
                            }
                        }
                        finally {
                            module0152.$g2120$.rebind(var11_141, var25);
                            module0152.$g2101$.rebind(var10_140, var25);
                        }
                        if (module0274.NIL != var32 && module0274.NIL == var33) {
                            module0034.f1873(var32, (SubLObject)module0274.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_139, var25);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var10_138, var25);
            }
        }
        finally {
            module0152.$g2102$.rebind(var31, var25);
            module0147.$g2096$.rebind(var30, var25);
            module0147.$g2094$.rebind(var29, var25);
            module0147.$g2095$.rebind(var28, var25);
        }
        return var26;
    }
    
    public static SubLObject f18165(final SubLObject var24, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0274.NIL;
        final SubLObject var27 = module0147.f9540(module0205.f13327(var2));
        final SubLObject var28 = module0147.$g2095$.currentBinding(var25);
        final SubLObject var29 = module0147.$g2094$.currentBinding(var25);
        final SubLObject var30 = module0147.$g2096$.currentBinding(var25);
        final SubLObject var31 = module0152.$g2101$.currentBinding(var25);
        final SubLObject var32 = module0152.$g2121$.currentBinding(var25);
        try {
            module0147.$g2095$.bind(module0147.f9545(var27), var25);
            module0147.$g2094$.bind(module0147.f9546(var27), var25);
            module0147.$g2096$.bind(module0147.f9549(var27), var25);
            module0152.$g2101$.bind((SubLObject)module0274.T, var25);
            module0152.$g2121$.bind((SubLObject)module0274.T, var25);
            if (module0274.NIL != module0201.f12580(var24)) {
                var26 = (SubLObject)module0274.T;
            }
            else {
                var26 = f18062(var24, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED);
            }
        }
        finally {
            module0152.$g2121$.rebind(var32, var25);
            module0152.$g2101$.rebind(var31, var25);
            module0147.$g2096$.rebind(var30, var25);
            module0147.$g2094$.rebind(var29, var25);
            module0147.$g2095$.rebind(var28, var25);
        }
        return var26;
    }
    
    public static SubLObject f18166(final SubLObject var24, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert module0274.NIL != Types.listp(var24) : var24;
        SubLObject var26 = (SubLObject)module0274.NIL;
        final SubLObject var27 = module0271.$g2562$.currentBinding(var25);
        final SubLObject var28 = module0271.$g2564$.currentBinding(var25);
        final SubLObject var29 = module0271.$g2563$.currentBinding(var25);
        final SubLObject var30 = module0271.$g2560$.currentBinding(var25);
        try {
            module0271.$g2562$.bind((SubLObject)module0274.T, var25);
            module0271.$g2564$.bind((SubLObject)module0274.T, var25);
            module0271.$g2563$.bind((SubLObject)module0274.T, var25);
            module0271.$g2560$.bind((SubLObject)module0274.T, var25);
            var26 = f18167(var24, var2);
        }
        finally {
            module0271.$g2560$.rebind(var30, var25);
            module0271.$g2563$.rebind(var29, var25);
            module0271.$g2564$.rebind(var28, var25);
            module0271.$g2562$.rebind(var27, var25);
        }
        return var26;
    }
    
    public static SubLObject f18167(final SubLObject var24, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0274.NIL;
        if (module0274.NIL != module0152.$g2120$.getDynamicValue(var25)) {
            var26 = f18164(var24, var2);
        }
        else if (module0274.NIL != module0152.$g2121$.getDynamicValue(var25)) {
            var26 = f18165(var24, var2);
        }
        else {
            var26 = f18060(var24, var2, (SubLObject)module0274.UNPROVIDED);
        }
        return var26;
    }
    
    public static SubLObject f18168(final SubLObject var24, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert module0274.NIL != Types.listp(var24) : var24;
        SubLObject var26 = (SubLObject)module0274.NIL;
        final SubLObject var27 = module0271.$g2562$.currentBinding(var25);
        final SubLObject var28 = module0271.$g2564$.currentBinding(var25);
        final SubLObject var29 = module0271.$g2563$.currentBinding(var25);
        final SubLObject var30 = module0271.$g2560$.currentBinding(var25);
        try {
            module0271.$g2562$.bind((SubLObject)module0274.T, var25);
            module0271.$g2564$.bind((SubLObject)module0274.T, var25);
            module0271.$g2563$.bind((SubLObject)module0274.NIL, var25);
            module0271.$g2560$.bind((SubLObject)module0274.T, var25);
            var26 = f18169(var24, var2);
        }
        finally {
            module0271.$g2560$.rebind(var30, var25);
            module0271.$g2563$.rebind(var29, var25);
            module0271.$g2564$.rebind(var28, var25);
            module0271.$g2562$.rebind(var27, var25);
        }
        return var26;
    }
    
    public static SubLObject f18169(final SubLObject var143, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145 = (SubLObject)module0274.NIL;
        final SubLObject var146 = module0152.$g2101$.currentBinding(var144);
        try {
            module0152.$g2101$.bind((SubLObject)module0274.T, var144);
            if (module0274.NIL != f18060(var143, var2, (SubLObject)module0274.UNPROVIDED)) {
                final SubLObject var147 = module0307.f20757(var143, var2, (SubLObject)module0274.UNPROVIDED);
                if (module0274.NIL == (var145 = var147)) {
                    f18096(module0303.f20207());
                }
            }
        }
        finally {
            module0152.$g2101$.rebind(var146, var144);
        }
        return var145;
    }
    
    public static SubLObject f18170(final SubLObject var143, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145 = (SubLObject)module0274.NIL;
        final SubLObject var146 = module0144.$g1796$.currentBinding(var144);
        final SubLObject var147 = module0144.$g1795$.currentBinding(var144);
        final SubLObject var148 = module0152.$g2116$.currentBinding(var144);
        final SubLObject var149 = module0152.$g2115$.currentBinding(var144);
        final SubLObject var150 = module0152.$g2129$.currentBinding(var144);
        try {
            module0144.$g1796$.bind((SubLObject)module0274.T, var144);
            module0144.$g1795$.bind((SubLObject)module0274.T, var144);
            module0152.$g2116$.bind((SubLObject)module0274.T, var144);
            module0152.$g2115$.bind((SubLObject)module0274.T, var144);
            module0152.$g2129$.bind((SubLObject)module0274.NIL, var144);
            f18169(var143, var2);
            if (module0274.NIL != module0161.f10481(var2) && module0274.NIL == f18081()) {
                final SubLObject var151 = var2;
                final SubLObject var10_146 = module0147.$g2094$.currentBinding(var144);
                final SubLObject var11_147 = module0147.$g2095$.currentBinding(var144);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var151), var144);
                    module0147.$g2095$.bind(module0147.f9534(var151), var144);
                    module0276.f18293(var143, (SubLObject)module0274.UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var11_147, var144);
                    module0147.$g2094$.rebind(var10_146, var144);
                }
            }
            var145 = f18081();
        }
        finally {
            module0152.$g2129$.rebind(var150, var144);
            module0152.$g2115$.rebind(var149, var144);
            module0152.$g2116$.rebind(var148, var144);
            module0144.$g1795$.rebind(var147, var144);
            module0144.$g1796$.rebind(var146, var144);
        }
        return var145;
    }
    
    public static SubLObject f18171(final SubLObject var148, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        SubLObject var150 = (SubLObject)module0274.NIL;
        final SubLObject var151 = module0152.$g2131$.currentBinding(var149);
        try {
            module0152.$g2131$.bind((SubLObject)module0274.NIL, var149);
            var150 = f18172(var148, var2, (SubLObject)module0274.UNPROVIDED);
        }
        finally {
            module0152.$g2131$.rebind(var151, var149);
        }
        return var150;
    }
    
    public static SubLObject f18173(final SubLObject var148, final SubLObject var2) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        SubLObject var150 = (SubLObject)module0274.NIL;
        final SubLObject var151 = module0147.f9540(var2);
        final SubLObject var152 = module0147.$g2095$.currentBinding(var149);
        final SubLObject var153 = module0147.$g2094$.currentBinding(var149);
        final SubLObject var154 = module0147.$g2096$.currentBinding(var149);
        try {
            module0147.$g2095$.bind(module0147.f9545(var151), var149);
            module0147.$g2094$.bind(module0147.f9546(var151), var149);
            module0147.$g2096$.bind(module0147.f9549(var151), var149);
            var150 = f18171(var148, var2);
        }
        finally {
            module0147.$g2096$.rebind(var154, var149);
            module0147.$g2094$.rebind(var153, var149);
            module0147.$g2095$.rebind(var152, var149);
        }
        return var150;
    }
    
    public static SubLObject f18172(final SubLObject var148, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        final SubLObject var150 = var3;
        assert module0274.NIL != module0035.f2327(var150) : var150;
        SubLObject var151;
        SubLObject var152;
        SubLObject var153;
        for (var151 = (SubLObject)module0274.NIL, var151 = var150; module0274.NIL != var151; var151 = conses_high.cddr(var151)) {
            var152 = var151.first();
            var153 = conses_high.cadr(var151);
            assert module0274.NIL != module0152.f9712(var152) : var152;
        }
        SubLObject var154 = (SubLObject)module0274.NIL;
        final SubLObject var156;
        final SubLObject var155 = var156 = module0151.f9700(var3);
        final SubLObject var157 = module0152.$g2104$.currentBinding(var149);
        try {
            module0152.$g2104$.bind(var156, var149);
            final SubLObject var158 = var156;
            assert module0274.NIL != module0091.f6325(var158) : var158;
            final SubLObject var159 = module0091.f6339(var158);
            final ArrayList var160 = Dynamic.extract_dynamic_values(var159);
            try {
                Dynamic.bind_dynamic_vars(var159, module0091.f6340(var158));
                var154 = f18174(var148, var2, (SubLObject)module0274.UNPROVIDED);
            }
            finally {
                Dynamic.rebind_dynamic_vars(var159, var160);
            }
        }
        finally {
            module0152.$g2104$.rebind(var157, var149);
        }
        return var154;
    }
    
    public static SubLObject f18174(final SubLObject var93, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        final SubLObject var95 = var3;
        assert module0274.NIL != module0035.f2327(var95) : var95;
        SubLObject var96;
        SubLObject var97;
        SubLObject var98;
        for (var96 = (SubLObject)module0274.NIL, var96 = var95; module0274.NIL != var96; var96 = conses_high.cddr(var96)) {
            var97 = var96.first();
            var98 = conses_high.cadr(var96);
            assert module0274.NIL != module0152.f9712(var97) : var97;
        }
        SubLObject var99 = (SubLObject)module0274.NIL;
        final SubLObject var100 = module0152.$g2125$.currentBinding(var94);
        final SubLObject var101 = module0152.$g2126$.currentBinding(var94);
        final SubLObject var102 = module0152.$g2102$.currentBinding(var94);
        try {
            module0152.$g2125$.bind(var93, var94);
            module0152.$g2126$.bind((module0274.NIL != module0151.f9690() && module0274.NIL != module0152.f9724()) ? module0152.f9724() : var93, var94);
            module0152.$g2102$.bind(module0151.f9695(), var94);
            final SubLObject var103 = module0152.$g2102$.getDynamicValue(var94);
            final SubLObject var10_151 = module0034.$g879$.currentBinding(var94);
            try {
                module0034.$g879$.bind(var103, var94);
                SubLObject var104 = (SubLObject)module0274.NIL;
                if (module0274.NIL != var103 && module0274.NIL == module0034.f1842(var103)) {
                    var104 = module0034.f1869(var103);
                    final SubLObject var105 = Threads.current_process();
                    if (module0274.NIL == var104) {
                        module0034.f1873(var103, var105);
                    }
                    else if (!var104.eql(var105)) {
                        Errors.error((SubLObject)module0274.$ic2$);
                    }
                }
                try {
                    if (module0274.NIL == module0151.f9690()) {
                        f18061();
                    }
                }
                finally {
                    final SubLObject var10_152 = Threads.$is_thread_performing_cleanupP$.currentBinding(var94);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0274.T, var94);
                        final SubLObject var107;
                        final SubLObject var106 = var107 = module0151.f9700(var3);
                        final SubLObject var10_153 = module0152.$g2104$.currentBinding(var94);
                        try {
                            module0152.$g2104$.bind(var107, var94);
                            final SubLObject var108 = var107;
                            assert module0274.NIL != module0091.f6325(var108) : var108;
                            final SubLObject var109 = module0091.f6339(var108);
                            final ArrayList var110 = Dynamic.extract_dynamic_values(var109);
                            try {
                                Dynamic.bind_dynamic_vars(var109, module0091.f6340(var108));
                                var99 = f18175(var93, var2);
                            }
                            finally {
                                Dynamic.rebind_dynamic_vars(var109, var110);
                            }
                        }
                        finally {
                            module0152.$g2104$.rebind(var10_153, var94);
                        }
                        if (module0274.NIL != var103 && module0274.NIL == var104) {
                            module0034.f1873(var103, (SubLObject)module0274.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_152, var94);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var10_151, var94);
            }
        }
        finally {
            module0152.$g2102$.rebind(var102, var94);
            module0152.$g2126$.rebind(var101, var94);
            module0152.$g2125$.rebind(var100, var94);
        }
        return var99;
    }
    
    public static SubLObject f18175(final SubLObject var93, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = (SubLObject)module0274.T;
        if (module0274.NIL == module0206.f13464(var93)) {
            var95 = (SubLObject)module0274.NIL;
        }
        final SubLObject var96 = module0205.f13327(var2);
        if (module0274.NIL == f18087(var95) && module0274.NIL != module0271.f17874(var96)) {
            f18082((SubLObject)ConsesLow.list((SubLObject)module0274.$ic23$, var96));
            var95 = (SubLObject)module0274.NIL;
        }
        if (module0274.NIL == f18090() && module0274.NIL != var95) {
            final SubLObject var97 = module0147.f9540(var96);
            final SubLObject var98 = module0147.$g2095$.currentBinding(var94);
            final SubLObject var99 = module0147.$g2094$.currentBinding(var94);
            final SubLObject var100 = module0147.$g2096$.currentBinding(var94);
            try {
                module0147.$g2095$.bind(module0147.f9545(var97), var94);
                module0147.$g2094$.bind(module0147.f9546(var97), var94);
                module0147.$g2096$.bind(module0147.f9549(var97), var94);
                if (module0274.NIL == f18087(var95)) {
                    final SubLObject var10_154 = module0152.$g2101$.currentBinding(var94);
                    try {
                        module0152.$g2101$.bind((SubLObject)module0274.T, var94);
                        if (module0274.NIL == f18176(var93)) {
                            var95 = (SubLObject)module0274.NIL;
                        }
                    }
                    finally {
                        module0152.$g2101$.rebind(var10_154, var94);
                    }
                }
                if (module0274.NIL == f18087(var95) && module0274.NIL != f18095(var93, (SubLObject)module0274.UNPROVIDED)) {
                    final SubLObject var10_155 = module0152.$g2101$.currentBinding(var94);
                    try {
                        module0152.$g2101$.bind((SubLObject)module0274.T, var94);
                        if (module0274.NIL == module0307.f20733(var93, var2)) {
                            var95 = (SubLObject)module0274.NIL;
                            f18096(module0303.f20207());
                        }
                    }
                    finally {
                        module0152.$g2101$.rebind(var10_155, var94);
                    }
                }
                if (module0274.NIL == f18087(var95) && module0274.NIL != f18099(var93)) {
                    final SubLObject var10_156 = module0018.$g696$.currentBinding(var94);
                    try {
                        module0018.$g696$.bind((SubLObject)module0274.NIL, var94);
                        var94.resetMultipleValues();
                        final SubLObject var101 = f18100(var93, var2);
                        final SubLObject var2_157 = var94.secondMultipleValue();
                        var94.resetMultipleValues();
                        final SubLObject var10_157 = module0144.$g1808$.currentBinding(var94);
                        try {
                            module0144.$g1808$.bind((SubLObject)module0274.NIL, var94);
                            if (module0274.NIL != var101 && !var93.equal(var101)) {
                                final SubLObject var10_158 = module0144.$g1808$.currentBinding(var94);
                                final SubLObject var11_160 = module0152.$g2134$.currentBinding(var94);
                                final SubLObject var12_161 = module0152.$g2122$.currentBinding(var94);
                                final SubLObject var102 = module0152.$g2133$.currentBinding(var94);
                                final SubLObject var103 = module0152.$g2127$.currentBinding(var94);
                                try {
                                    module0144.$g1808$.bind((SubLObject)module0274.NIL, var94);
                                    module0152.$g2134$.bind(var93, var94);
                                    module0152.$g2122$.bind((SubLObject)module0274.NIL, var94);
                                    module0152.$g2133$.bind((SubLObject)module0274.T, var94);
                                    module0152.$g2127$.bind((module0274.NIL != module0151.f9690() && module0274.NIL != module0152.f9725()) ? module0152.f9725() : var101, var94);
                                    if (module0274.NIL == f18175(var101, var2_157)) {
                                        var95 = (SubLObject)module0274.NIL;
                                    }
                                }
                                finally {
                                    module0152.$g2127$.rebind(var103, var94);
                                    module0152.$g2133$.rebind(var102, var94);
                                    module0152.$g2122$.rebind(var12_161, var94);
                                    module0152.$g2134$.rebind(var11_160, var94);
                                    module0144.$g1808$.rebind(var10_158, var94);
                                }
                            }
                        }
                        finally {
                            module0144.$g1808$.rebind(var10_157, var94);
                        }
                    }
                    finally {
                        module0018.$g696$.rebind(var10_156, var94);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var100, var94);
                module0147.$g2094$.rebind(var99, var94);
                module0147.$g2095$.rebind(var98, var94);
            }
        }
        return var95;
    }
    
    public static SubLObject f18176(final SubLObject var93) {
        SubLObject var94 = (SubLObject)module0274.NIL;
        if (module0274.NIL != module0210.f13571(var93)) {
            var94 = module0309.f20973(var93, (SubLObject)module0274.UNPROVIDED);
        }
        else if (module0274.NIL != module0207.f13509(var93)) {
            var94 = f18094(var93, (SubLObject)module0274.UNPROVIDED);
        }
        else {
            var94 = (SubLObject)module0274.T;
        }
        f18096(module0303.f20207());
        return var94;
    }
    
    public static SubLObject f18177(final SubLObject var162, final SubLObject var163, SubLObject var121, SubLObject var122, SubLObject var164, SubLObject var165, SubLObject var166) {
        if (var121 == module0274.UNPROVIDED) {
            var121 = (SubLObject)module0274.NIL;
        }
        if (var122 == module0274.UNPROVIDED) {
            var122 = (SubLObject)module0274.NIL;
        }
        if (var164 == module0274.UNPROVIDED) {
            var164 = (SubLObject)module0274.NIL;
        }
        if (var165 == module0274.UNPROVIDED) {
            var165 = (SubLObject)module0274.NIL;
        }
        if (var166 == module0274.UNPROVIDED) {
            var166 = (SubLObject)module0274.NIL;
        }
        final SubLThread var167 = SubLProcess.currentSubLThread();
        if (module0274.$g2587$.getDynamicValue(var167).numGE(var162)) {
            PrintLow.format((SubLObject)module0274.T, var163, new SubLObject[] { var121, var122, var164, var165, var166 });
            return (SubLObject)module0274.NIL;
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18072(final SubLObject var162, final SubLObject var163, SubLObject var121, SubLObject var122, SubLObject var164, SubLObject var165, SubLObject var166) {
        if (var121 == module0274.UNPROVIDED) {
            var121 = (SubLObject)module0274.NIL;
        }
        if (var122 == module0274.UNPROVIDED) {
            var122 = (SubLObject)module0274.NIL;
        }
        if (var164 == module0274.UNPROVIDED) {
            var164 = (SubLObject)module0274.NIL;
        }
        if (var165 == module0274.UNPROVIDED) {
            var165 = (SubLObject)module0274.NIL;
        }
        if (var166 == module0274.UNPROVIDED) {
            var166 = (SubLObject)module0274.NIL;
        }
        final SubLThread var167 = SubLProcess.currentSubLThread();
        if (module0274.$g2587$.getDynamicValue(var167).numGE(var162)) {
            Errors.cerror((SubLObject)module0274.$ic82$, var163, new SubLObject[] { var121, var122, var164, var165, var166 });
        }
        else if (Numbers.add((SubLObject)module0274.TWO_INTEGER, module0274.$g2587$.getDynamicValue(var167)).numGE(var162)) {
            Errors.warn(var163, new SubLObject[] { var121, var122, var164, var165, var166 });
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18178(final SubLObject var162, final SubLObject var167, final SubLObject var163, SubLObject var121, SubLObject var122, SubLObject var164, SubLObject var165, SubLObject var166) {
        if (var121 == module0274.UNPROVIDED) {
            var121 = (SubLObject)module0274.NIL;
        }
        if (var122 == module0274.UNPROVIDED) {
            var122 = (SubLObject)module0274.NIL;
        }
        if (var164 == module0274.UNPROVIDED) {
            var164 = (SubLObject)module0274.NIL;
        }
        if (var165 == module0274.UNPROVIDED) {
            var165 = (SubLObject)module0274.NIL;
        }
        if (var166 == module0274.UNPROVIDED) {
            var166 = (SubLObject)module0274.NIL;
        }
        final SubLThread var168 = SubLProcess.currentSubLThread();
        if (module0274.$g2587$.getDynamicValue(var168).numGE(var162)) {
            Errors.cerror(var167, var163, new SubLObject[] { var121, var122, var164, var165, var166 });
        }
        else if (Numbers.add((SubLObject)module0274.TWO_INTEGER, module0274.$g2587$.getDynamicValue(var168)).numGE(var162)) {
            Errors.warn(var163, new SubLObject[] { var121, var122, var164, var165, var166 });
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18179(final SubLObject var162, final SubLObject var163, SubLObject var121, SubLObject var122, SubLObject var164, SubLObject var165, SubLObject var166) {
        if (var121 == module0274.UNPROVIDED) {
            var121 = (SubLObject)module0274.NIL;
        }
        if (var122 == module0274.UNPROVIDED) {
            var122 = (SubLObject)module0274.NIL;
        }
        if (var164 == module0274.UNPROVIDED) {
            var164 = (SubLObject)module0274.NIL;
        }
        if (var165 == module0274.UNPROVIDED) {
            var165 = (SubLObject)module0274.NIL;
        }
        if (var166 == module0274.UNPROVIDED) {
            var166 = (SubLObject)module0274.NIL;
        }
        final SubLThread var167 = SubLProcess.currentSubLThread();
        if (module0274.$g2587$.getDynamicValue(var167).numGE(var162)) {
            Functions.apply((SubLObject)module0274.$ic83$, var163, new SubLObject[] { var121, var122, var164, var165, var166 });
            return (SubLObject)module0274.NIL;
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18180() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0152.$g2132$.getDynamicValue(var4);
    }
    
    public static SubLObject f18079() {
        module0152.$g2132$.setDynamicValue((SubLObject)module0274.NIL);
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18088() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0152.$g2131$.getDynamicValue(var4);
    }
    
    public static SubLObject f18089(final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        if (module0274.NIL == conses_high.member(var168, module0152.$g2132$.getDynamicValue(var169), Symbols.symbol_function((SubLObject)module0274.EQUAL), Symbols.symbol_function((SubLObject)module0274.IDENTITY))) {
            module0152.$g2132$.setDynamicValue((SubLObject)ConsesLow.cons(var168, module0152.$g2132$.getDynamicValue(var169)), var169);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18181(final SubLObject var170) {
        SubLObject var171 = var170;
        SubLObject var172 = (SubLObject)module0274.NIL;
        var172 = var171.first();
        while (module0274.NIL != var171) {
            f18089(var172);
            var171 = var171.rest();
            var172 = var171.first();
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18182(final SubLObject var1, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        if (module0274.NIL != f18060(var1, var2, (SubLObject)module0274.UNPROVIDED)) {
            return module0274.$ic33$;
        }
        return f18180();
    }
    
    public static SubLObject f18183(final SubLObject var148, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        if (module0274.NIL != f18172(var148, var2, (SubLObject)module0274.UNPROVIDED)) {
            return module0274.$ic33$;
        }
        return f18180();
    }
    
    public static SubLObject f18184(final SubLObject var1, SubLObject var2, SubLObject var170) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        if (var170 == module0274.UNPROVIDED) {
            var170 = f18182(var1, var2);
        }
        SubLObject var171 = (SubLObject)module0274.NIL;
        SubLObject var172 = var170;
        SubLObject var173 = (SubLObject)module0274.NIL;
        var173 = var172.first();
        while (module0274.NIL != var172) {
            final SubLObject var174 = var173.first();
            if (var174.eql((SubLObject)module0274.$ic84$)) {
                SubLObject var176;
                final SubLObject var175 = var176 = var173.rest();
                SubLObject var177 = (SubLObject)module0274.NIL;
                SubLObject var2_174 = (SubLObject)module0274.NIL;
                SubLObject var178 = (SubLObject)module0274.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0274.$ic85$);
                var177 = var176.first();
                var176 = var176.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0274.$ic85$);
                var2_174 = var176.first();
                var176 = var176.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0274.$ic85$);
                var178 = var176.first();
                var176 = var176.rest();
                if (module0274.NIL == var176) {
                    if (module0274.NIL != var178) {
                        if (var1.equal(var177)) {
                            if (module0274.NIL != module0035.f1997(var178)) {
                                var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic86$, var1, var178.first()), var171);
                            }
                            else {
                                var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic87$, var1, module0038.f2887(var178, (SubLObject)module0274.$ic88$, (SubLObject)module0274.$ic89$)), var171);
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var175, (SubLObject)module0274.$ic85$);
                }
            }
            else if (var174.eql((SubLObject)module0274.$ic90$)) {
                SubLObject var180;
                final SubLObject var179 = var180 = var173.rest();
                SubLObject var181 = (SubLObject)module0274.NIL;
                SubLObject var182 = (SubLObject)module0274.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var180, var179, (SubLObject)module0274.$ic91$);
                var181 = var180.first();
                var180 = var180.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var180, var179, (SubLObject)module0274.$ic91$);
                var182 = var180.first();
                var180 = var180.rest();
                if (module0274.NIL == var180) {
                    if (module0274.NIL != var182) {
                        if (!var181.equal(var182)) {
                            var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic92$, var182, var181), var171);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var179, (SubLObject)module0274.$ic91$);
                }
            }
            else if (var174.eql((SubLObject)module0274.$ic24$)) {
                SubLObject var184;
                final SubLObject var183 = var184 = var173.rest();
                SubLObject var177 = (SubLObject)module0274.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var184, var183, (SubLObject)module0274.$ic93$);
                var177 = var184.first();
                var184 = var184.rest();
                final SubLObject var2_175 = (SubLObject)(var184.isCons() ? var184.first() : module0274.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var184, var183, (SubLObject)module0274.$ic93$);
                var184 = var184.rest();
                if (module0274.NIL == var184) {
                    if (module0274.NIL != var2_175) {
                        var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic94$, var177, var2_175), var171);
                    }
                    else {
                        var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic95$, var177), var171);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var183, (SubLObject)module0274.$ic93$);
                }
            }
            else if (var174.eql((SubLObject)module0274.$ic96$)) {
                SubLObject var186;
                final SubLObject var185 = var186 = var173.rest();
                SubLObject var177 = (SubLObject)module0274.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0274.$ic93$);
                var177 = var186.first();
                var186 = var186.rest();
                final SubLObject var2_176 = (SubLObject)(var186.isCons() ? var186.first() : module0274.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var186, var185, (SubLObject)module0274.$ic93$);
                var186 = var186.rest();
                if (module0274.NIL == var186) {
                    if (module0274.NIL != var2_176) {
                        var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic97$, var177, var2_176), var171);
                    }
                    else {
                        var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic98$, var177), var171);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var185, (SubLObject)module0274.$ic93$);
                }
            }
            else {
                var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic99$, var173), var171);
            }
            var172 = var172.rest();
            var173 = var172.first();
        }
        return module0038.f2840(Sequences.nreverse(var171));
    }
    
    public static SubLObject f18185(final SubLObject var148, SubLObject var2, SubLObject var170) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        if (var170 == module0274.UNPROVIDED) {
            var170 = f18183(var148, var2);
        }
        SubLObject var171 = (SubLObject)module0274.NIL;
        SubLObject var172 = var170;
        SubLObject var173 = (SubLObject)module0274.NIL;
        var173 = var172.first();
        while (module0274.NIL != var172) {
            final SubLObject var174 = var173.first();
            if (var174.eql((SubLObject)module0274.$ic84$)) {
                SubLObject var176;
                final SubLObject var175 = var176 = var173.rest();
                SubLObject var177 = (SubLObject)module0274.NIL;
                SubLObject var2_189 = (SubLObject)module0274.NIL;
                SubLObject var178 = (SubLObject)module0274.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0274.$ic100$);
                var177 = var176.first();
                var176 = var176.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0274.$ic100$);
                var2_189 = var176.first();
                var176 = var176.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0274.$ic100$);
                var178 = var176.first();
                var176 = var176.rest();
                if (module0274.NIL == var176) {
                    if (module0274.NIL != var178) {
                        if (var148.equal(var177)) {
                            if (module0274.NIL != module0035.f1997(var178)) {
                                var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic101$, var148, var178.first()), var171);
                            }
                            else {
                                var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic87$, var148, module0038.f2887(var178, (SubLObject)module0274.$ic88$, (SubLObject)module0274.$ic89$)), var171);
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var175, (SubLObject)module0274.$ic100$);
                }
            }
            else if (var174.eql((SubLObject)module0274.$ic90$)) {
                SubLObject var180;
                final SubLObject var179 = var180 = var173.rest();
                SubLObject var181 = (SubLObject)module0274.NIL;
                SubLObject var182 = (SubLObject)module0274.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var180, var179, (SubLObject)module0274.$ic91$);
                var181 = var180.first();
                var180 = var180.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var180, var179, (SubLObject)module0274.$ic91$);
                var182 = var180.first();
                var180 = var180.rest();
                if (module0274.NIL == var180) {
                    if (module0274.NIL != var182) {
                        if (!var181.equal(var182)) {
                            var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic92$, var182, var181), var171);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var179, (SubLObject)module0274.$ic91$);
                }
            }
            else if (var174.eql((SubLObject)module0274.$ic24$)) {
                SubLObject var184;
                final SubLObject var183 = var184 = var173.rest();
                SubLObject var177 = (SubLObject)module0274.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var184, var183, (SubLObject)module0274.$ic102$);
                var177 = var184.first();
                var184 = var184.rest();
                final SubLObject var2_190 = (SubLObject)(var184.isCons() ? var184.first() : module0274.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var184, var183, (SubLObject)module0274.$ic102$);
                var184 = var184.rest();
                if (module0274.NIL == var184) {
                    if (module0274.NIL != var2_190) {
                        var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic94$, var177, var2_190), var171);
                    }
                    else {
                        var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic95$, var177), var171);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var183, (SubLObject)module0274.$ic102$);
                }
            }
            else if (var174.eql((SubLObject)module0274.$ic96$)) {
                SubLObject var186;
                final SubLObject var185 = var186 = var173.rest();
                SubLObject var177 = (SubLObject)module0274.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0274.$ic102$);
                var177 = var186.first();
                var186 = var186.rest();
                final SubLObject var2_191 = (SubLObject)(var186.isCons() ? var186.first() : module0274.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var186, var185, (SubLObject)module0274.$ic102$);
                var186 = var186.rest();
                if (module0274.NIL == var186) {
                    if (module0274.NIL != var2_191) {
                        var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic97$, var177, var2_191), var171);
                    }
                    else {
                        var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic98$, var177), var171);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var185, (SubLObject)module0274.$ic102$);
                }
            }
            else {
                var171 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic99$, var173), var171);
            }
            var172 = var172.rest();
            var173 = var172.first();
        }
        return module0038.f2840(Sequences.nreverse(var171));
    }
    
    public static SubLObject f18118() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0152.$g2115$.getDynamicValue(var4) || module0274.NIL != module0144.$g1795$.getDynamicValue(var4) || module0274.NIL != module0146.$g1960$.getDynamicValue(var4));
    }
    
    public static SubLObject f18157(SubLObject var198) {
        final SubLThread var199 = SubLProcess.currentSubLThread();
        if (module0274.NIL == module0152.$g2130$.getDynamicValue(var199) || module0274.NIL != f18118()) {
            if (module0274.NIL == module0152.f9715()) {
                var198 = ConsesLow.append(var198, module0302.f20041());
            }
            module0152.$g2130$.setDynamicValue((SubLObject)ConsesLow.cons(var198, module0152.$g2130$.getDynamicValue(var199)), var199);
            f18082(var198);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18186(final SubLObject var1, SubLObject var2, SubLObject var199) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        if (var199 == module0274.UNPROVIDED) {
            var199 = (SubLObject)module0274.$ic103$;
        }
        assert module0274.NIL != Types.listp(var1) : var1;
        final SubLObject var200 = var199;
        if (var200.eql((SubLObject)module0274.$ic103$)) {
            return f18187(var1, var2, (SubLObject)module0274.UNPROVIDED);
        }
        if (var200.eql((SubLObject)module0274.$ic104$)) {
            return f18188(var1, var2, (SubLObject)module0274.UNPROVIDED);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18189(final SubLObject var148, SubLObject var2, SubLObject var199) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        if (var199 == module0274.UNPROVIDED) {
            var199 = (SubLObject)module0274.$ic103$;
        }
        final SubLObject var200 = var199;
        if (var200.eql((SubLObject)module0274.$ic103$)) {
            return f18190(var148, var2, (SubLObject)module0274.UNPROVIDED);
        }
        if (var200.eql((SubLObject)module0274.$ic104$)) {
            return f18191(var148, var2, (SubLObject)module0274.UNPROVIDED);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18188(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = var3;
        assert module0274.NIL != module0035.f2327(var5) : var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = (SubLObject)module0274.NIL, var6 = var5; module0274.NIL != var6; var6 = conses_high.cddr(var6)) {
            var7 = var6.first();
            var8 = conses_high.cadr(var6);
            assert module0274.NIL != module0152.f9712(var7) : var7;
        }
        SubLObject var9 = (SubLObject)module0274.NIL;
        final SubLObject var10 = module0144.$g1796$.currentBinding(var4);
        final SubLObject var11 = module0144.$g1795$.currentBinding(var4);
        final SubLObject var12 = module0152.$g2116$.currentBinding(var4);
        final SubLObject var13 = module0152.$g2115$.currentBinding(var4);
        final SubLObject var14 = module0152.$g2129$.currentBinding(var4);
        final SubLObject var15 = module0271.$g2560$.currentBinding(var4);
        try {
            module0144.$g1796$.bind((SubLObject)module0274.T, var4);
            module0144.$g1795$.bind((SubLObject)module0274.T, var4);
            module0152.$g2116$.bind((SubLObject)module0274.T, var4);
            module0152.$g2115$.bind((SubLObject)module0274.T, var4);
            module0152.$g2129$.bind((SubLObject)module0274.NIL, var4);
            module0271.$g2560$.bind((SubLObject)module0274.T, var4);
            final SubLObject var17;
            final SubLObject var16 = var17 = module0151.f9700(var3);
            final SubLObject var10_201 = module0152.$g2104$.currentBinding(var4);
            try {
                module0152.$g2104$.bind(var17, var4);
                final SubLObject var18 = var17;
                assert module0274.NIL != module0091.f6325(var18) : var18;
                final SubLObject var19 = module0091.f6339(var18);
                final ArrayList var20 = Dynamic.extract_dynamic_values(var19);
                try {
                    Dynamic.bind_dynamic_vars(var19, module0091.f6340(var18));
                    f18060(var1, var2, (SubLObject)module0274.UNPROVIDED);
                    if (module0274.NIL != module0161.f10481(var2) && module0274.NIL == f18081()) {
                        final SubLObject var21 = var2;
                        final SubLObject var10_202 = module0147.$g2094$.currentBinding(var4);
                        final SubLObject var11_203 = module0147.$g2095$.currentBinding(var4);
                        try {
                            module0147.$g2094$.bind(module0147.f9531(var21), var4);
                            module0147.$g2095$.bind(module0147.f9534(var21), var4);
                            module0276.f18293(var1, (SubLObject)module0274.UNPROVIDED);
                        }
                        finally {
                            module0147.$g2095$.rebind(var11_203, var4);
                            module0147.$g2094$.rebind(var10_202, var4);
                        }
                    }
                    var9 = f18081();
                }
                finally {
                    Dynamic.rebind_dynamic_vars(var19, var20);
                }
            }
            finally {
                module0152.$g2104$.rebind(var10_201, var4);
            }
        }
        finally {
            module0271.$g2560$.rebind(var15, var4);
            module0152.$g2129$.rebind(var14, var4);
            module0152.$g2115$.rebind(var13, var4);
            module0152.$g2116$.rebind(var12, var4);
            module0144.$g1795$.rebind(var11, var4);
            module0144.$g1796$.rebind(var10, var4);
        }
        return var9;
    }
    
    public static SubLObject f18192(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = var3;
        assert module0274.NIL != module0035.f2327(var5) : var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = (SubLObject)module0274.NIL, var6 = var5; module0274.NIL != var6; var6 = conses_high.cddr(var6)) {
            var7 = var6.first();
            var8 = conses_high.cadr(var6);
            assert module0274.NIL != module0152.f9712(var7) : var7;
        }
        SubLObject var9 = (SubLObject)module0274.NIL;
        final SubLObject var10 = module0018.$g696$.currentBinding(var4);
        try {
            module0018.$g696$.bind((SubLObject)module0274.T, var4);
            final SubLObject var12;
            final SubLObject var11 = var12 = module0151.f9700(var3);
            final SubLObject var10_204 = module0152.$g2104$.currentBinding(var4);
            try {
                module0152.$g2104$.bind(var12, var4);
                final SubLObject var13 = var12;
                assert module0274.NIL != module0091.f6325(var13) : var13;
                final SubLObject var14 = module0091.f6339(var13);
                final ArrayList var15 = Dynamic.extract_dynamic_values(var14);
                try {
                    Dynamic.bind_dynamic_vars(var14, module0091.f6340(var13));
                    var9 = f18188(var1, var2, (SubLObject)module0274.UNPROVIDED);
                }
                finally {
                    Dynamic.rebind_dynamic_vars(var14, var15);
                }
            }
            finally {
                module0152.$g2104$.rebind(var10_204, var4);
            }
        }
        finally {
            module0018.$g696$.rebind(var10, var4);
        }
        return var9;
    }
    
    public static SubLObject f18191(final SubLObject var148, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        final SubLObject var150 = var3;
        assert module0274.NIL != module0035.f2327(var150) : var150;
        SubLObject var151;
        SubLObject var152;
        SubLObject var153;
        for (var151 = (SubLObject)module0274.NIL, var151 = var150; module0274.NIL != var151; var151 = conses_high.cddr(var151)) {
            var152 = var151.first();
            var153 = conses_high.cadr(var151);
            assert module0274.NIL != module0152.f9712(var152) : var152;
        }
        SubLObject var154 = (SubLObject)module0274.NIL;
        final SubLObject var155 = module0144.$g1796$.currentBinding(var149);
        final SubLObject var156 = module0144.$g1795$.currentBinding(var149);
        final SubLObject var157 = module0152.$g2116$.currentBinding(var149);
        final SubLObject var158 = module0152.$g2115$.currentBinding(var149);
        final SubLObject var159 = module0152.$g2129$.currentBinding(var149);
        final SubLObject var160 = module0271.$g2560$.currentBinding(var149);
        try {
            module0144.$g1796$.bind((SubLObject)module0274.T, var149);
            module0144.$g1795$.bind((SubLObject)module0274.T, var149);
            module0152.$g2116$.bind((SubLObject)module0274.T, var149);
            module0152.$g2115$.bind((SubLObject)module0274.T, var149);
            module0152.$g2129$.bind((SubLObject)module0274.NIL, var149);
            module0271.$g2560$.bind((SubLObject)module0274.T, var149);
            final SubLObject var162;
            final SubLObject var161 = var162 = module0151.f9700(var3);
            final SubLObject var10_205 = module0152.$g2104$.currentBinding(var149);
            try {
                module0152.$g2104$.bind(var162, var149);
                final SubLObject var163 = var162;
                assert module0274.NIL != module0091.f6325(var163) : var163;
                final SubLObject var164 = module0091.f6339(var163);
                final ArrayList var165 = Dynamic.extract_dynamic_values(var164);
                try {
                    Dynamic.bind_dynamic_vars(var164, module0091.f6340(var163));
                    f18172(var148, var2, (SubLObject)module0274.UNPROVIDED);
                    if (module0274.NIL != module0161.f10481(var2) && module0274.NIL == f18081()) {
                        final SubLObject var166 = var2;
                        final SubLObject var10_206 = module0147.$g2094$.currentBinding(var149);
                        final SubLObject var11_207 = module0147.$g2095$.currentBinding(var149);
                        try {
                            module0147.$g2094$.bind(module0147.f9531(var166), var149);
                            module0147.$g2095$.bind(module0147.f9534(var166), var149);
                            module0276.f18322(var148, Symbols.symbol_function((SubLObject)module0274.$ic37$));
                        }
                        finally {
                            module0147.$g2095$.rebind(var11_207, var149);
                            module0147.$g2094$.rebind(var10_206, var149);
                        }
                    }
                    var154 = f18081();
                }
                finally {
                    Dynamic.rebind_dynamic_vars(var164, var165);
                }
            }
            finally {
                module0152.$g2104$.rebind(var10_205, var149);
            }
        }
        finally {
            module0271.$g2560$.rebind(var160, var149);
            module0152.$g2129$.rebind(var159, var149);
            module0152.$g2115$.rebind(var158, var149);
            module0152.$g2116$.rebind(var157, var149);
            module0144.$g1795$.rebind(var156, var149);
            module0144.$g1796$.rebind(var155, var149);
        }
        return var154;
    }
    
    public static SubLObject f18193(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = var3;
        assert module0274.NIL != module0035.f2327(var5) : var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = (SubLObject)module0274.NIL, var6 = var5; module0274.NIL != var6; var6 = conses_high.cddr(var6)) {
            var7 = var6.first();
            var8 = conses_high.cadr(var6);
            assert module0274.NIL != module0152.f9712(var7) : var7;
        }
        SubLObject var9 = (SubLObject)module0274.NIL;
        final SubLObject var10 = module0144.$g1796$.currentBinding(var4);
        final SubLObject var11 = module0144.$g1795$.currentBinding(var4);
        final SubLObject var12 = module0152.$g2116$.currentBinding(var4);
        final SubLObject var13 = module0152.$g2115$.currentBinding(var4);
        final SubLObject var14 = module0152.$g2129$.currentBinding(var4);
        try {
            module0144.$g1796$.bind((SubLObject)module0274.T, var4);
            module0144.$g1795$.bind((SubLObject)module0274.T, var4);
            module0152.$g2116$.bind((SubLObject)module0274.T, var4);
            module0152.$g2115$.bind((SubLObject)module0274.T, var4);
            module0152.$g2129$.bind((SubLObject)module0274.NIL, var4);
            final SubLObject var16;
            final SubLObject var15 = var16 = module0151.f9700(var3);
            final SubLObject var10_208 = module0152.$g2104$.currentBinding(var4);
            try {
                module0152.$g2104$.bind(var16, var4);
                final SubLObject var17 = var16;
                assert module0274.NIL != module0091.f6325(var17) : var17;
                final SubLObject var18 = module0091.f6339(var17);
                final ArrayList var19 = Dynamic.extract_dynamic_values(var18);
                try {
                    Dynamic.bind_dynamic_vars(var18, module0091.f6340(var17));
                    f18110(var1, var2, (SubLObject)module0274.UNPROVIDED);
                    var9 = f18081();
                }
                finally {
                    Dynamic.rebind_dynamic_vars(var18, var19);
                }
            }
            finally {
                module0152.$g2104$.rebind(var10_208, var4);
            }
        }
        finally {
            module0152.$g2129$.rebind(var14, var4);
            module0152.$g2115$.rebind(var13, var4);
            module0152.$g2116$.rebind(var12, var4);
            module0144.$g1795$.rebind(var11, var4);
            module0144.$g1796$.rebind(var10, var4);
        }
        return var9;
    }
    
    public static SubLObject f18194(final SubLObject var1, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0274.NIL;
        final SubLObject var5 = module0110.$g1374$.currentBinding(var3);
        final SubLObject var6 = module0271.$g2563$.currentBinding(var3);
        final SubLObject var7 = module0271.$g2561$.currentBinding(var3);
        try {
            module0110.$g1374$.bind((SubLObject)module0274.T, var3);
            module0271.$g2563$.bind((SubLObject)module0274.T, var3);
            module0271.$g2561$.bind((SubLObject)module0274.T, var3);
            var4 = f18195(var1, var2, (SubLObject)module0274.UNPROVIDED);
        }
        finally {
            module0271.$g2561$.rebind(var7, var3);
            module0271.$g2563$.rebind(var6, var3);
            module0110.$g1374$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f18078() {
        module0152.$g2129$.setDynamicValue((SubLObject)module0274.NIL);
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18081() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0152.$g2129$.getDynamicValue(var4);
    }
    
    public static SubLObject f18149() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != module0152.$g2116$.getDynamicValue(var4) && (module0274.NIL == f18081() || module0274.NIL != module0152.$g2115$.getDynamicValue(var4)));
    }
    
    public static SubLObject f18082(final SubLObject var209) {
        final SubLThread var210 = SubLProcess.currentSubLThread();
        if (module0274.NIL != module0152.f9714()) {
            print_high.print(var209, (SubLObject)module0274.UNPROVIDED);
        }
        if (module0274.NIL != f18149() && module0274.NIL == conses_high.member(var209, module0152.$g2129$.getDynamicValue(var210), Symbols.symbol_function((SubLObject)module0274.EQUAL), Symbols.symbol_function((SubLObject)module0274.IDENTITY))) {
            module0152.$g2129$.setDynamicValue((SubLObject)ConsesLow.cons(var209, module0152.$g2129$.getDynamicValue(var210)), var210);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18096(final SubLObject var44) {
        SubLObject var45 = var44;
        SubLObject var46 = (SubLObject)module0274.NIL;
        var46 = var45.first();
        while (module0274.NIL != var45) {
            f18082(var46);
            var45 = var45.rest();
            var46 = var45.first();
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18187(final SubLObject var1, SubLObject var2, SubLObject var210) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var210 == module0274.UNPROVIDED) {
            var210 = (SubLObject)module0274.T;
        }
        PrintLow.format(var210, (SubLObject)module0274.$ic109$, f18195(var1, var2, (SubLObject)module0274.$ic110$));
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18196(final SubLObject var1, SubLObject var2, SubLObject var210) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var210 == module0274.UNPROVIDED) {
            var210 = (SubLObject)module0274.T;
        }
        PrintLow.format(var210, (SubLObject)module0274.$ic109$, f18197(var1, var2, (SubLObject)module0274.$ic110$));
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18198(final SubLObject var1, SubLObject var2, SubLObject var210) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var210 == module0274.UNPROVIDED) {
            var210 = (SubLObject)module0274.T;
        }
        PrintLow.format(var210, (SubLObject)module0274.$ic109$, f18199(var1, var2, (SubLObject)module0274.$ic110$));
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18190(final SubLObject var148, SubLObject var2, SubLObject var210) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var210 == module0274.UNPROVIDED) {
            var210 = (SubLObject)module0274.T;
        }
        PrintLow.format(var210, (SubLObject)module0274.$ic109$, f18200(var148, var2, (SubLObject)module0274.$ic110$));
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18201(final SubLObject var1, SubLObject var2, SubLObject var210) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var210 == module0274.UNPROVIDED) {
            var210 = (SubLObject)module0274.NIL;
        }
        if (module0274.NIL != var210) {
            PrintLow.format(var210, (SubLObject)module0274.$ic109$, f18202(var1, var2));
            return (SubLObject)module0274.NIL;
        }
        return f18202(var1, var2);
    }
    
    public static SubLObject f18203(final SubLObject var211, SubLObject var2, SubLObject var210) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var210 == module0274.UNPROVIDED) {
            var210 = (SubLObject)module0274.NIL;
        }
        if (module0274.NIL != var210) {
            PrintLow.format(var210, (SubLObject)module0274.$ic109$, f18204(var211, var2));
            return (SubLObject)module0274.NIL;
        }
        return f18204(var211, var2);
    }
    
    public static SubLObject f18202(final SubLObject var1, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0274.NIL;
        final SubLObject var5 = module0152.$g2116$.currentBinding(var3);
        try {
            module0152.$g2116$.bind((SubLObject)module0274.T, var3);
            SubLObject var6 = f18205(var1, var2);
            SubLObject var7 = (SubLObject)module0274.NIL;
            var7 = var6.first();
            while (module0274.NIL != var6) {
                var4 = (SubLObject)ConsesLow.cons(f18206(var1, var7), var4);
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        finally {
            module0152.$g2116$.rebind(var5, var3);
        }
        if (module0274.NIL != module0202.f12595(var4)) {
            return var4;
        }
        if (module0274.NIL != module0035.f1997(var4)) {
            return var4.first();
        }
        if (module0274.NIL != var4) {
            return module0276.f18287(Sequences.nreverse(var4), (SubLObject)module0274.UNPROVIDED);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18204(final SubLObject var211, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        SubLObject var213 = (SubLObject)module0274.NIL;
        final SubLObject var214 = module0152.$g2116$.currentBinding(var212);
        try {
            module0152.$g2116$.bind((SubLObject)module0274.T, var212);
            SubLObject var215 = f18207(var211, var2);
            SubLObject var216 = (SubLObject)module0274.NIL;
            var216 = var215.first();
            while (module0274.NIL != var215) {
                var213 = (SubLObject)ConsesLow.cons(f18208(var211, var216), var213);
                var215 = var215.rest();
                var216 = var215.first();
            }
        }
        finally {
            module0152.$g2116$.rebind(var214, var212);
        }
        if (module0274.NIL != module0202.f12595(var213)) {
            return var213;
        }
        if (module0274.NIL != module0035.f1997(var213)) {
            return var213.first();
        }
        if (module0274.NIL != var213) {
            return module0276.f18304(module0276.f18287(Sequences.nreverse(var213), (SubLObject)module0274.UNPROVIDED), (SubLObject)module0274.UNPROVIDED);
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18205(final SubLObject var1, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0274.NIL;
        final SubLObject var5 = module0144.$g1796$.currentBinding(var3);
        final SubLObject var6 = module0144.$g1795$.currentBinding(var3);
        final SubLObject var7 = module0152.$g2116$.currentBinding(var3);
        final SubLObject var8 = module0152.$g2115$.currentBinding(var3);
        final SubLObject var9 = module0152.$g2115$.currentBinding(var3);
        final SubLObject var10 = module0144.$g1795$.currentBinding(var3);
        final SubLObject var11 = module0152.$g2131$.currentBinding(var3);
        final SubLObject var12 = module0152.$g2129$.currentBinding(var3);
        try {
            module0144.$g1796$.bind((SubLObject)module0274.T, var3);
            module0144.$g1795$.bind((SubLObject)module0274.T, var3);
            module0152.$g2116$.bind((SubLObject)module0274.T, var3);
            module0152.$g2115$.bind((SubLObject)module0274.T, var3);
            module0152.$g2115$.bind((SubLObject)module0274.NIL, var3);
            module0144.$g1795$.bind((SubLObject)module0274.NIL, var3);
            module0152.$g2131$.bind((SubLObject)module0274.NIL, var3);
            module0152.$g2129$.bind((SubLObject)module0274.NIL, var3);
            final SubLObject var10_215 = module0271.$g2560$.currentBinding(var3);
            try {
                module0271.$g2560$.bind((SubLObject)module0274.T, var3);
                f18060(var1, var2, (SubLObject)module0274.UNPROVIDED);
            }
            finally {
                module0271.$g2560$.rebind(var10_215, var3);
            }
            var4 = f18081();
        }
        finally {
            module0152.$g2129$.rebind(var12, var3);
            module0152.$g2131$.rebind(var11, var3);
            module0144.$g1795$.rebind(var10, var3);
            module0152.$g2115$.rebind(var9, var3);
            module0152.$g2115$.rebind(var8, var3);
            module0152.$g2116$.rebind(var7, var3);
            module0144.$g1795$.rebind(var6, var3);
            module0144.$g1796$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f18207(final SubLObject var211, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        SubLObject var213 = (SubLObject)module0274.NIL;
        final SubLObject var214 = module0144.$g1796$.currentBinding(var212);
        final SubLObject var215 = module0144.$g1795$.currentBinding(var212);
        final SubLObject var216 = module0152.$g2116$.currentBinding(var212);
        final SubLObject var217 = module0152.$g2115$.currentBinding(var212);
        final SubLObject var218 = module0152.$g2115$.currentBinding(var212);
        final SubLObject var219 = module0144.$g1795$.currentBinding(var212);
        final SubLObject var220 = module0152.$g2131$.currentBinding(var212);
        final SubLObject var221 = module0152.$g2129$.currentBinding(var212);
        try {
            module0144.$g1796$.bind((SubLObject)module0274.T, var212);
            module0144.$g1795$.bind((SubLObject)module0274.T, var212);
            module0152.$g2116$.bind((SubLObject)module0274.T, var212);
            module0152.$g2115$.bind((SubLObject)module0274.T, var212);
            module0152.$g2115$.bind((SubLObject)module0274.NIL, var212);
            module0144.$g1795$.bind((SubLObject)module0274.NIL, var212);
            module0152.$g2131$.bind((SubLObject)module0274.NIL, var212);
            module0152.$g2129$.bind((SubLObject)module0274.NIL, var212);
            final SubLObject var10_216 = module0271.$g2560$.currentBinding(var212);
            try {
                module0271.$g2560$.bind((SubLObject)module0274.T, var212);
                f18172(var211, var2, (SubLObject)module0274.UNPROVIDED);
            }
            finally {
                module0271.$g2560$.rebind(var10_216, var212);
            }
            var213 = f18081();
        }
        finally {
            module0152.$g2129$.rebind(var221, var212);
            module0152.$g2131$.rebind(var220, var212);
            module0144.$g1795$.rebind(var219, var212);
            module0152.$g2115$.rebind(var218, var212);
            module0152.$g2115$.rebind(var217, var212);
            module0152.$g2116$.rebind(var216, var212);
            module0144.$g1795$.rebind(var215, var212);
            module0144.$g1796$.rebind(var214, var212);
        }
        return var213;
    }
    
    public static SubLObject f18195(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLObject var4 = var3;
        assert module0274.NIL != module0035.f2327(var4) : var4;
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        for (var5 = (SubLObject)module0274.NIL, var5 = var4; module0274.NIL != var5; var5 = conses_high.cddr(var5)) {
            var6 = var5.first();
            var7 = conses_high.cadr(var5);
            assert module0274.NIL != module0152.f9712(var6) : var6;
        }
        final SubLObject var8 = conses_high.getf(var3, (SubLObject)module0274.$ic111$, (SubLObject)module0274.$ic103$);
        final SubLObject var9 = conses_high.getf(var3, (SubLObject)module0274.$ic112$, (SubLObject)module0274.NIL);
        return f18209(var1, var2, var8, var9, (SubLObject)module0274.$ic113$, var3);
    }
    
    public static SubLObject f18197(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLObject var4 = var3;
        assert module0274.NIL != module0035.f2327(var4) : var4;
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        for (var5 = (SubLObject)module0274.NIL, var5 = var4; module0274.NIL != var5; var5 = conses_high.cddr(var5)) {
            var6 = var5.first();
            var7 = conses_high.cadr(var5);
            assert module0274.NIL != module0152.f9712(var6) : var6;
        }
        final SubLObject var8 = conses_high.getf(var3, (SubLObject)module0274.$ic111$, (SubLObject)module0274.$ic103$);
        final SubLObject var9 = conses_high.getf(var3, (SubLObject)module0274.$ic112$, (SubLObject)module0274.NIL);
        return f18209(var1, var2, var8, var9, (SubLObject)module0274.$ic114$, var3);
    }
    
    public static SubLObject f18199(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLObject var4 = var3;
        assert module0274.NIL != module0035.f2327(var4) : var4;
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        for (var5 = (SubLObject)module0274.NIL, var5 = var4; module0274.NIL != var5; var5 = conses_high.cddr(var5)) {
            var6 = var5.first();
            var7 = conses_high.cadr(var5);
            assert module0274.NIL != module0152.f9712(var6) : var6;
        }
        final SubLObject var8 = conses_high.getf(var3, (SubLObject)module0274.$ic111$, (SubLObject)module0274.$ic103$);
        final SubLObject var9 = conses_high.getf(var3, (SubLObject)module0274.$ic112$, (SubLObject)module0274.NIL);
        return f18209(var1, var2, var8, var9, (SubLObject)module0274.$ic24$, var3);
    }
    
    public static SubLObject f18209(final SubLObject var1, final SubLObject var2, final SubLObject var199, SubLObject var44, final SubLObject var217, final SubLObject var3) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        SubLObject var219 = (SubLObject)module0274.NIL;
        final SubLObject var221;
        final SubLObject var220 = var221 = module0151.f9700(var3);
        final SubLObject var222 = module0152.$g2104$.currentBinding(var218);
        try {
            module0152.$g2104$.bind(var221, var218);
            final SubLObject var223 = var221;
            assert module0274.NIL != module0091.f6325(var223) : var223;
            final SubLObject var224 = module0091.f6339(var223);
            final ArrayList var225 = Dynamic.extract_dynamic_values(var224);
            try {
                Dynamic.bind_dynamic_vars(var224, module0091.f6340(var223));
                if (module0274.NIL == var44) {
                    if (var217.eql((SubLObject)module0274.$ic114$)) {
                        var44 = f18193(var1, var2, (SubLObject)module0274.UNPROVIDED);
                    }
                    else if (var217.eql((SubLObject)module0274.$ic24$)) {
                        var44 = f18192(var1, var2, (SubLObject)module0274.UNPROVIDED);
                    }
                    else {
                        var44 = f18188(var1, var2, (SubLObject)module0274.UNPROVIDED);
                    }
                }
                SubLObject var226 = var44;
                SubLObject var227 = (SubLObject)module0274.NIL;
                var227 = var226.first();
                while (module0274.NIL != var226) {
                    var219 = (SubLObject)ConsesLow.cons(f18210(var227, var199), var219);
                    var226 = var226.rest();
                    var227 = var226.first();
                }
                if (module0274.NIL != f18180() && module0274.NIL != f18088() && var199 == module0274.$ic103$) {
                    final SubLObject var228 = f18184(var1, var2, f18180());
                    if (module0274.NIL != var228) {
                        var219 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic109$, var228), var219);
                    }
                }
                var219 = Sequences.nreverse(var219);
                if (module0274.$ic103$ == var199) {
                    var219 = module0038.f2840(var219);
                }
            }
            finally {
                Dynamic.rebind_dynamic_vars(var224, var225);
            }
        }
        finally {
            module0152.$g2104$.rebind(var222, var218);
        }
        return var219;
    }
    
    public static SubLObject f18200(final SubLObject var148, SubLObject var2, SubLObject var3) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var3 == module0274.UNPROVIDED) {
            var3 = (SubLObject)module0274.NIL;
        }
        final SubLObject var149 = var3;
        assert module0274.NIL != module0035.f2327(var149) : var149;
        SubLObject var150;
        SubLObject var151;
        SubLObject var152;
        for (var150 = (SubLObject)module0274.NIL, var150 = var149; module0274.NIL != var150; var150 = conses_high.cddr(var150)) {
            var151 = var150.first();
            var152 = conses_high.cadr(var150);
            assert module0274.NIL != module0152.f9712(var151) : var151;
        }
        SubLObject var153 = (SubLObject)module0274.NIL;
        final SubLObject var154 = conses_high.getf(var3, (SubLObject)module0274.$ic111$, (SubLObject)module0274.$ic103$);
        SubLObject var155 = conses_high.getf(var3, (SubLObject)module0274.$ic112$, (SubLObject)module0274.NIL);
        if (module0274.NIL == var155) {
            var155 = f18191(var148, var2, (SubLObject)module0274.UNPROVIDED);
        }
        SubLObject var156 = var155;
        SubLObject var157 = (SubLObject)module0274.NIL;
        var157 = var156.first();
        while (module0274.NIL != var156) {
            var153 = (SubLObject)ConsesLow.cons(f18210(var157, var154), var153);
            var156 = var156.rest();
            var157 = var156.first();
        }
        if (module0274.NIL != f18180() && module0274.NIL != f18088() && var154.eql((SubLObject)module0274.$ic103$)) {
            final SubLObject var158 = f18185(var148, var2, f18180());
            if (module0274.NIL != var158) {
                var153 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic109$, var158), var153);
            }
        }
        var153 = Sequences.nreverse(var153);
        if (module0274.$ic103$ == var154) {
            var153 = module0038.f2840(var153);
        }
        return var153;
    }
    
    public static SubLObject f18211(SubLObject var44) {
        if (var44 == module0274.UNPROVIDED) {
            var44 = module0152.$g2129$.getDynamicValue();
        }
        SubLObject var45 = (SubLObject)module0274.NIL;
        SubLObject var46 = var44;
        SubLObject var47 = (SubLObject)module0274.NIL;
        var47 = var46.first();
        while (module0274.NIL != var46) {
            var45 = (SubLObject)ConsesLow.cons(f18210(var47, (SubLObject)module0274.UNPROVIDED), var45);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return module0038.f2840(Sequences.nreverse(var45));
    }
    
    public static SubLObject f18206(final SubLObject var1, final SubLObject var212) {
        final SubLObject var213 = f18210(var212, (SubLObject)module0274.$ic104$);
        if (module0274.NIL != module0202.f12660(var213)) {
            return var213;
        }
        return module0202.f12761((SubLObject)ConsesLow.list(module0274.$ic115$, (SubLObject)ConsesLow.list(module0274.$ic116$, (SubLObject)ConsesLow.list(module0274.$ic117$, var1))));
    }
    
    public static SubLObject f18208(final SubLObject var211, final SubLObject var212) {
        final SubLObject var213 = f18210(var212, (SubLObject)module0274.$ic104$);
        if (module0274.NIL != module0202.f12660(var213)) {
            return var213;
        }
        return module0202.f12761((SubLObject)ConsesLow.list(module0274.$ic115$, (SubLObject)ConsesLow.list(module0274.$ic118$, (SubLObject)ConsesLow.list(module0274.$ic117$, var211))));
    }
    
    public static SubLObject f18210(final SubLObject var212, SubLObject var199) {
        if (var199 == module0274.UNPROVIDED) {
            var199 = (SubLObject)module0274.$ic103$;
        }
        assert module0274.NIL != module0272.f17949(var212) : var212;
        if (module0274.NIL == var212) {
            return (SubLObject)module0274.NIL;
        }
        final SubLObject var213 = module0272.f17953(module0303.f20223(var212));
        if (module0274.NIL != var213) {
            return Functions.funcall(var213, var212, var199);
        }
        return PrintLow.format((SubLObject)module0274.NIL, (SubLObject)module0274.$ic120$, var212);
    }
    
    public static SubLObject f18212(final SubLObject var220) {
        return Mapping.mapcar((SubLObject)module0274.$ic121$, var220);
    }
    
    public static SubLObject f18213(final SubLObject var221) {
        final SubLObject var223;
        final SubLObject var222 = var223 = module0303.f20223(var221);
        if (var223.eql((SubLObject)module0274.$ic54$)) {
            final SubLObject var224 = conses_high.second(var221);
            final SubLObject var225 = conses_high.third(var221);
            final SubLObject var30_222;
            final SubLObject var226 = var30_222 = module0205.f13333(var224);
            if (var30_222.eql(module0274.$ic25$)) {
                final SubLObject var227 = module0205.f13387(var224, (SubLObject)module0274.UNPROVIDED);
                final SubLObject var228 = module0205.f13388(var224, (SubLObject)module0274.UNPROVIDED);
                final SubLObject var229 = module0259.f16917(var227, var228, var225, (SubLObject)module0274.UNPROVIDED, (SubLObject)module0274.UNPROVIDED);
                if (module0274.NIL != var229) {
                    return (SubLObject)ConsesLow.list((SubLObject)module0274.$ic122$, var229);
                }
            }
        }
        return var221;
    }
    
    public static SubLObject f18163() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0152.$g2128$.getDynamicValue(var4);
    }
    
    public static SubLObject f18214(final SubLObject var1, SubLObject var2) {
        if (var2 == module0274.UNPROVIDED) {
            var2 = (SubLObject)module0274.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0271.$g2561$.currentBinding(var3);
        final SubLObject var5 = module0271.$g2560$.currentBinding(var3);
        try {
            module0271.$g2561$.bind((SubLObject)module0274.T, var3);
            module0271.$g2560$.bind((SubLObject)module0274.T, var3);
            f18060(var1, var2, (SubLObject)module0274.UNPROVIDED);
        }
        finally {
            module0271.$g2560$.rebind(var5, var3);
            module0271.$g2561$.rebind(var4, var3);
        }
        return f18163();
    }
    
    public static SubLObject f18162() {
        module0152.$g2128$.setDynamicValue((SubLObject)module0274.NIL);
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18215(final SubLObject var209) {
        final SubLThread var210 = SubLProcess.currentSubLThread();
        module0152.$g2128$.setDynamicValue((SubLObject)ConsesLow.cons(var209, module0152.$g2128$.getDynamicValue(var210)), var210);
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18216() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        f18217();
        module0152.$g2105$.setDynamicValue((SubLObject)module0274.$ic123$, var4);
        return module0152.$g2105$.getDynamicValue(var4);
    }
    
    public static SubLObject f18218() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        f18219();
        module0152.$g2105$.setDynamicValue((SubLObject)module0274.$ic5$, var4);
        return module0152.$g2105$.getDynamicValue(var4);
    }
    
    public static SubLObject f18220() {
        final SubLObject var226 = Mapping.mapcar((SubLObject)module0274.$ic124$, module0219.f14512(module0274.$ic125$, module0274.$ic126$, (SubLObject)module0274.UNPROVIDED));
        final SubLObject var227 = (SubLObject)((module0274.NIL != constant_handles_oc.f8465(module0274.$ic127$, (SubLObject)module0274.UNPROVIDED)) ? Mapping.mapcar((SubLObject)module0274.$ic124$, module0219.f14512(module0274.$ic125$, module0274.$ic127$, (SubLObject)module0274.UNPROVIDED)) : module0274.NIL);
        return ConsesLow.append(var226, var227);
    }
    
    public static SubLObject f18217() {
        SubLObject var228 = (SubLObject)module0274.ZERO_INTEGER;
        SubLObject var229 = f18220();
        SubLObject var230 = (SubLObject)module0274.NIL;
        var230 = var229.first();
        while (module0274.NIL != var229) {
            if (module0274.NIL != oc_assertions_interface.f11077(var230, (SubLObject)module0274.$ic128$)) {
                var228 = Numbers.add(var228, (SubLObject)module0274.ONE_INTEGER);
            }
            var229 = var229.rest();
            var230 = var229.first();
        }
        return var228;
    }
    
    public static SubLObject f18219() {
        SubLObject var228 = (SubLObject)module0274.ZERO_INTEGER;
        SubLObject var229 = f18220();
        SubLObject var230 = (SubLObject)module0274.NIL;
        var230 = var229.first();
        while (module0274.NIL != var229) {
            if (module0274.NIL != oc_assertions_interface.f11077(var230, (SubLObject)module0274.$ic129$)) {
                var228 = Numbers.add(var228, (SubLObject)module0274.ONE_INTEGER);
            }
            var229 = var229.rest();
            var230 = var229.first();
        }
        return var228;
    }
    
    public static SubLObject f18221() {
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic130$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic131$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic132$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic133$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic134$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic135$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic136$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic137$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic138$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic139$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic140$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic141$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic142$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic143$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic144$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic145$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic146$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic147$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic148$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        oc_assertions_interface.f11077(module0288.f19338((SubLObject)module0274.$ic149$, module0274.$ic22$), (SubLObject)module0274.$ic128$);
        return (SubLObject)module0274.TWENTY_INTEGER;
    }
    
    public static SubLObject f18222() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0274.ZERO_INTEGER;
        SubLObject var6 = f18220();
        SubLObject var7 = (SubLObject)module0274.NIL;
        var7 = var6.first();
        while (module0274.NIL != var6) {
            final SubLObject var8 = module0178.f11300(var7);
            SubLObject var9;
            SubLObject var10;
            SubLObject var11;
            SubLObject var12;
            SubLObject var13;
            for (var9 = module0032.f1741(var8), var10 = (SubLObject)module0274.NIL, var10 = module0032.f1742(var9, var8); module0274.NIL == module0032.f1744(var9, var10); var10 = module0032.f1743(var10)) {
                var11 = module0032.f1745(var9, var10);
                if (module0274.NIL != module0032.f1746(var10, var11) && module0274.NIL != oc_deduction_handles.f11671(var11, (SubLObject)module0274.UNPROVIDED) && module0274.NIL != f18223(var11) && module0274.NIL != f18224(var11)) {
                    var12 = (SubLObject)module0274.NIL;
                    try {
                        var4.throwStack.push(module0003.$g3$.getGlobalValue());
                        var13 = Errors.$error_handler$.currentBinding(var4);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0274.$ic150$, var4);
                            try {
                                module0342.f23129(var11);
                                var5 = Numbers.add(var5, (SubLObject)module0274.ONE_INTEGER);
                            }
                            catch (Throwable var14) {
                                Errors.handleThrowable(var14, (SubLObject)module0274.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var13, var4);
                        }
                    }
                    catch (Throwable var15) {
                        var12 = Errors.handleThrowable(var15, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var4.throwStack.pop();
                    }
                    if (var12.isString()) {
                        Errors.warn((SubLObject)module0274.$ic151$, var12);
                    }
                }
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var5;
    }
    
    public static SubLObject f18225(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0274.NIL;
        SubLObject var5;
        final SubLObject var4 = var5 = module0288.f19342(var1, var2);
        SubLObject var6 = (SubLObject)module0274.NIL;
        var6 = var5.first();
        while (module0274.NIL != var5) {
            final SubLObject var7 = f18226(var6);
            if (var7.isVector()) {
                final SubLObject var8 = var7;
                final SubLObject var9 = (SubLObject)module0274.NIL;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                for (var10 = Sequences.length(var8), var11 = (SubLObject)module0274.NIL, var11 = (SubLObject)module0274.ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)module0274.ONE_INTEGER)) {
                    var12 = ((module0274.NIL != var9) ? Numbers.subtract(var10, var11, (SubLObject)module0274.ONE_INTEGER) : var11);
                    var13 = Vectors.aref(var8, var12);
                    var3 = (SubLObject)ConsesLow.cons(var13, var3);
                }
            }
            else {
                SubLObject var36_244 = var7;
                SubLObject var14 = (SubLObject)module0274.NIL;
                var14 = var36_244.first();
                while (module0274.NIL != var36_244) {
                    var3 = (SubLObject)ConsesLow.cons(var14, var3);
                    var36_244 = var36_244.rest();
                    var14 = var36_244.first();
                }
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f18226(final SubLObject var117) {
        SubLObject var118 = (SubLObject)module0274.NIL;
        SubLObject var119 = module0178.f11299(var117);
        SubLObject var120 = (SubLObject)module0274.NIL;
        var120 = var119.first();
        while (module0274.NIL != var119) {
            if (module0274.NIL != f18223(var120)) {
                var118 = (SubLObject)ConsesLow.cons(var120, var118);
            }
            var119 = var119.rest();
            var120 = var119.first();
        }
        return Sequences.nreverse(var118);
    }
    
    public static SubLObject f18223(final SubLObject var124) {
        if (module0274.NIL != oc_deduction_handles.f11659(var124)) {
            SubLObject var125 = module0188.f11770(var124);
            SubLObject var126 = (SubLObject)module0274.NIL;
            var126 = var125.first();
            while (module0274.NIL != var125) {
                if (module0274.NIL != f18227(var126)) {
                    return (SubLObject)module0274.T;
                }
                var125 = var125.rest();
                var126 = var125.first();
            }
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18224(final SubLObject var233) {
        final SubLThread var234 = SubLProcess.currentSubLThread();
        final SubLObject var235 = module0188.f11781(var233);
        if (module0274.NIL != module0178.f11284(var235)) {
            final SubLObject var236 = var235;
            final SubLObject var237 = module0178.f11328(var236);
            var234.resetMultipleValues();
            final SubLObject var238 = module0202.f12796(var237);
            final SubLObject var239 = var234.secondMultipleValue();
            final SubLObject var240 = var234.thirdMultipleValue();
            var234.resetMultipleValues();
            final SubLObject var241 = module0147.f9540(module0188.f11791(var233));
            final SubLObject var242 = module0147.$g2095$.currentBinding(var234);
            final SubLObject var243 = module0147.$g2094$.currentBinding(var234);
            final SubLObject var244 = module0147.$g2096$.currentBinding(var234);
            try {
                module0147.$g2095$.bind(module0147.f9545(var241), var234);
                module0147.$g2094$.bind(module0147.f9546(var241), var234);
                module0147.$g2096$.bind(module0147.f9549(var241), var234);
                final SubLObject var245 = var238;
                if (module0274.NIL != module0158.f10010(var239, (SubLObject)module0274.ONE_INTEGER, var245)) {
                    final SubLObject var246 = module0158.f10011(var239, (SubLObject)module0274.ONE_INTEGER, var245);
                    SubLObject var247 = (SubLObject)module0274.NIL;
                    final SubLObject var248 = (SubLObject)module0274.NIL;
                    while (module0274.NIL == var247) {
                        final SubLObject var249 = module0052.f3695(var246, var248);
                        final SubLObject var250 = (SubLObject)SubLObjectFactory.makeBoolean(!var248.eql(var249));
                        if (module0274.NIL != var250) {
                            SubLObject var251 = (SubLObject)module0274.NIL;
                            try {
                                var251 = module0158.f10316(var249, (SubLObject)module0274.$ic152$, (SubLObject)module0274.$ic153$, (SubLObject)module0274.NIL);
                                SubLObject var254_259 = (SubLObject)module0274.NIL;
                                final SubLObject var255_260 = (SubLObject)module0274.NIL;
                                while (module0274.NIL == var254_259) {
                                    final SubLObject var252 = module0052.f3695(var251, var255_260);
                                    final SubLObject var257_262 = (SubLObject)SubLObjectFactory.makeBoolean(!var255_260.eql(var252));
                                    if (module0274.NIL != var257_262 && !var252.eql(var236)) {
                                        final SubLObject var253 = module0178.f11335(var252);
                                        final SubLObject var254 = module0178.f11287(var252);
                                        if (module0274.NIL != module0256.f16596(var253, var240, var254, (SubLObject)module0274.UNPROVIDED)) {
                                            return (SubLObject)module0274.T;
                                        }
                                    }
                                    var254_259 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var257_262);
                                }
                            }
                            finally {
                                final SubLObject var10_265 = Threads.$is_thread_performing_cleanupP$.currentBinding(var234);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0274.T, var234);
                                    if (module0274.NIL != var251) {
                                        module0158.f10319(var251);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var10_265, var234);
                                }
                            }
                        }
                        var247 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var250);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var244, var234);
                module0147.$g2094$.rebind(var243, var234);
                module0147.$g2095$.rebind(var242, var234);
            }
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18227(final SubLObject var124) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL != assertion_handles_oc.f11035(var124) && module0274.NIL != module0222.f14635(module0274.$ic125$, var124, (SubLObject)module0274.ONE_INTEGER, (SubLObject)module0274.UNPROVIDED));
    }
    
    public static SubLObject f18228(final SubLObject var245, final SubLObject var117) {
        f18229();
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18229() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0274.NIL == module0274.$g2588$.getDynamicValue(var4)) {
            final SubLObject var5 = module0274.$g2588$.currentBinding(var4);
            try {
                module0274.$g2588$.bind((SubLObject)module0274.T, var4);
                SubLObject var6 = module0034.$g888$.getGlobalValue();
                SubLObject var7 = (SubLObject)module0274.NIL;
                var7 = var6.first();
                while (module0274.NIL != var6) {
                    if (module0274.NIL != Symbols.fboundp(var7)) {
                        Functions.funcall(var7);
                    }
                    var6 = var6.rest();
                    var7 = var6.first();
                }
            }
            finally {
                module0274.$g2588$.rebind(var5, var4);
            }
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18230(final SubLObject var245, final SubLObject var117) {
        final SubLThread var246 = SubLProcess.currentSubLThread();
        if (module0274.NIL != module0191.f11932(var245) && module0274.NIL != module0178.f11284(var117)) {
            final SubLObject var247 = module0178.f11332(var117);
            final SubLObject var248 = module0178.f11334(var117);
            final SubLObject var249 = module0178.f11335(var117);
            final SubLObject var250 = module0178.f11287(var117);
            final SubLObject var251 = module0147.$g2094$.currentBinding(var246);
            final SubLObject var252 = module0147.$g2095$.currentBinding(var246);
            try {
                module0147.$g2094$.bind((SubLObject)module0274.$ic155$, var246);
                module0147.$g2095$.bind(var250, var246);
                final SubLObject var253 = var247;
                if (module0274.NIL != module0158.f10010(var248, (SubLObject)module0274.ONE_INTEGER, var253)) {
                    final SubLObject var254 = module0158.f10011(var248, (SubLObject)module0274.ONE_INTEGER, var253);
                    SubLObject var255 = (SubLObject)module0274.NIL;
                    final SubLObject var256 = (SubLObject)module0274.NIL;
                    while (module0274.NIL == var255) {
                        final SubLObject var257 = module0052.f3695(var254, var256);
                        final SubLObject var258 = (SubLObject)SubLObjectFactory.makeBoolean(!var256.eql(var257));
                        if (module0274.NIL != var258) {
                            SubLObject var259 = (SubLObject)module0274.NIL;
                            try {
                                var259 = module0158.f10316(var257, (SubLObject)module0274.$ic152$, (SubLObject)module0274.$ic153$, (SubLObject)module0274.NIL);
                                SubLObject var254_267 = (SubLObject)module0274.NIL;
                                final SubLObject var255_268 = (SubLObject)module0274.NIL;
                                while (module0274.NIL == var254_267) {
                                    final SubLObject var260 = module0052.f3695(var259, var255_268);
                                    final SubLObject var257_269 = (SubLObject)SubLObjectFactory.makeBoolean(!var255_268.eql(var260));
                                    if (module0274.NIL != var257_269) {
                                        SubLObject var261 = f18226(var260);
                                        SubLObject var262 = (SubLObject)module0274.NIL;
                                        var262 = var261.first();
                                        while (module0274.NIL != var261) {
                                            if (module0274.NIL != oc_deduction_handles.f11671(var262, (SubLObject)module0274.UNPROVIDED)) {
                                                final SubLObject var263 = module0178.f11335(var260);
                                                final SubLObject var264 = module0178.f11287(var260);
                                                if (module0274.NIL != module0256.f16596(var249, var263, var264, (SubLObject)module0274.UNPROVIDED)) {
                                                    module0342.f23129(var262);
                                                }
                                            }
                                            var261 = var261.rest();
                                            var262 = var261.first();
                                        }
                                    }
                                    var254_267 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var257_269);
                                }
                            }
                            finally {
                                final SubLObject var10_271 = Threads.$is_thread_performing_cleanupP$.currentBinding(var246);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0274.T, var246);
                                    if (module0274.NIL != var259) {
                                        module0158.f10319(var259);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var10_271, var246);
                                }
                            }
                        }
                        var255 = (SubLObject)SubLObjectFactory.makeBoolean(module0274.NIL == var258);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var252, var246);
                module0147.$g2094$.rebind(var251, var246);
            }
        }
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18231() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18060", "EL-WFF?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18063", "S#20669", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18064", "EL-WFF-ASSERTIBLE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18065", "S#20670", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18066", "S#20671", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18067", "HL-WFF?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18062", "WFF?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18073", "S#20672", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18074", "S#20673", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18075", "S#20674", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18076", "S#20675", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18077", "S#20676", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18061", "S#12502", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18080", "S#20677", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18083", "S#20678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18070", "S#20679", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18100", "S#20680", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18101", "EL-WFF-SYNTAX?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18094", "S#20681", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18103", "WHY-NOT-SEMANTICALLY-WF-WRT-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18102", "S#20682", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18086", "S#20683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18071", "S#20684", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18068", "S#20685", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18108", "S#20686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18069", "S#20687", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18109", "S#20688", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18110", "WFF-QUERY?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18107", "S#20689", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18111", "S#20690", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18112", "S#20691", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18091", "S#20692", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18092", "S#20693", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18093", "S#20694", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18113", "S#20695", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18114", "S#20696", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18115", "S#20697", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18116", "S#20698", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18095", "S#20699", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18106", "S#20700", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18117", "S#20701", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18090", "S#20702", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18099", "S#20703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18097", "S#20704", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18087", "S#20705", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18084", "S#20706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18085", "S#20707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18119", "S#20708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18120", "S#20709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18121", "S#20710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18122", "S#20711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18104", "SEMANTICALLY-WF-LITERAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18125", "S#20712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18124", "S#20713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18127", "S#20714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18128", "S#20715", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18123", "S#20716", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18129", "S#20717", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18136", "S#20718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18135", "S#20719", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18134", "S#20720", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18137", "S#20721", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18138", "S#20722", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18133", "S#20723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18132", "S#20724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18139", "S#20725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18140", "S#20726", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18131", "S#20727", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18141", "S#20728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18142", "S#20729", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18105", "S#20730", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18143", "S#20731", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18144", "S#20732", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18130", "S#20733", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18145", "S#20734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18147", "S#20735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18146", "S#20736", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18126", "S#16274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18152", "S#20656", 0, 0, false);
        new $f18152$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18153", "S#20737", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18154", "S#20738", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18151", "S#20739", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18150", "S#20740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18156", "S#20741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18155", "S#20742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18148", "S#20743", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18158", "S#20744", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18098", "S#20745", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18159", "S#20746", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18160", "S#20747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18161", "S#20748", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18164", "S#20749", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18165", "S#20750", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18166", "EL-FORMULA-OK?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18167", "S#20751", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18168", "EL-QUERY-OK?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18169", "S#20752", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18170", "WHY-NOT-QUERY-OK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18171", "S#20753", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18173", "S#20754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18172", "EL-WFT?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18174", "EL-WFE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18175", "S#20755", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18176", "S#20756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18177", "S#20757", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18072", "S#20758", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18178", "S#20759", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18179", "S#20760", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18180", "S#20761", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18079", "S#20762", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18088", "S#20500", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18089", "S#20763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18181", "S#20764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18182", "S#20765", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18183", "S#20766", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18184", "S#20767", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18185", "S#20768", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18118", "S#20769", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18157", "S#20770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18186", "DIAGNOSE-EL-FORMULA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18189", "S#20771", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18188", "WHY-NOT-WFF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18192", "WHY-NOT-WFF-ASSERT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18191", "WHY-NOT-WFT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18193", "WHY-NOT-WFF-ASK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18194", "S#20772", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18078", "S#20773", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18081", "S#20774", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18149", "S#16272", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18082", "S#16273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18096", "S#20775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18187", "S#20776", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18196", "S#20777", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18198", "S#20778", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18190", "S#20779", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18201", "S#20780", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18203", "S#20781", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18202", "S#20782", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18204", "S#20783", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18205", "S#20784", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18207", "S#20785", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18195", "EXPLANATION-OF-WHY-NOT-WFF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18197", "EXPLANATION-OF-WHY-NOT-WFF-ASK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18199", "S#20786", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18209", "S#20787", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18200", "S#20788", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18211", "S#16279", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18206", "S#20789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18208", "S#20790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18210", "S#20791", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18212", "S#20792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18213", "S#20793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18163", "S#20794", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18214", "S#20795", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18162", "S#20796", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18215", "S#20797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18216", "S#20798", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18218", "S#20799", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18220", "S#20800", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18217", "S#20801", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18219", "S#20802", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18221", "S#20803", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18222", "S#20804", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18225", "S#20805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18226", "S#20806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18223", "S#20807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18224", "S#20808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18227", "S#20809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18228", "CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18229", "S#20810", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0274", "f18230", "AFTER-WFF-CONSTRAINT-SATISFIED", 2, 0, false);
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18232() {
        module0274.$g2584$ = SubLFiles.deflexical("S#20811", (SubLObject)module0274.NIL);
        module0274.$g2585$ = SubLFiles.defparameter("S#20812", (SubLObject)module0274.T);
        module0274.$g2586$ = SubLFiles.deflexical("S#20813", (SubLObject)module0274.NIL);
        module0274.$g2587$ = SubLFiles.defvar("S#20814", (SubLObject)module0274.ONE_INTEGER);
        module0274.$g2588$ = SubLFiles.defparameter("S#20815", (SubLObject)module0274.NIL);
        return (SubLObject)module0274.NIL;
    }
    
    public static SubLObject f18233() {
        module0034.f1909((SubLObject)module0274.$ic14$);
        module0012.f368((SubLObject)module0274.$ic29$, (SubLObject)module0274.$ic30$, (SubLObject)module0274.$ic31$, (SubLObject)module0274.NIL, (SubLObject)module0274.$ic32$);
        module0034.f1895((SubLObject)module0274.$ic41$);
        module0034.f1895((SubLObject)module0274.$ic42$);
        module0034.f1895((SubLObject)module0274.$ic63$);
        module0034.f1909((SubLObject)module0274.$ic64$);
        module0012.f368((SubLObject)module0274.$ic76$, (SubLObject)module0274.$ic77$, (SubLObject)module0274.$ic78$, (SubLObject)module0274.$ic79$, (SubLObject)module0274.$ic32$);
        module0012.f368((SubLObject)module0274.$ic80$, (SubLObject)module0274.$ic77$, (SubLObject)module0274.$ic81$, (SubLObject)module0274.$ic79$, (SubLObject)module0274.$ic32$);
        module0012.f368((SubLObject)module0274.$ic105$, (SubLObject)module0274.$ic106$, (SubLObject)module0274.$ic107$, (SubLObject)module0274.$ic108$, (SubLObject)module0274.NIL);
        module0012.f419((SubLObject)module0274.$ic121$);
        module0012.f416((SubLObject)module0274.$ic154$);
        module0012.f416((SubLObject)module0274.$ic156$);
        return (SubLObject)module0274.NIL;
    }
    
    public void declareFunctions() {
        f18231();
    }
    
    public void initializeVariables() {
        f18232();
    }
    
    public void runTopLevelForms() {
        f18233();
    }
    
    static {
        me = (SubLFile)new module0274();
        module0274.$g2584$ = null;
        module0274.$g2585$ = null;
        module0274.$g2586$ = null;
        module0274.$g2587$ = null;
        module0274.$g2588$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#12511", "CYC");
        $ic2$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic3$ = SubLObjectFactory.makeSymbol("S#8003", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("ELF");
        $ic5$ = SubLObjectFactory.makeKeyword("STRICT");
        $ic6$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("LENIENT");
        $ic8$ = SubLObjectFactory.makeKeyword("CNF");
        $ic9$ = SubLObjectFactory.makeKeyword("DNF");
        $ic10$ = SubLObjectFactory.makeKeyword("NAF");
        $ic11$ = SubLObjectFactory.makeString("invalid formula type: ~s");
        $ic12$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#20676", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#20811", "CYC");
        $ic16$ = SubLObjectFactory.makeInteger(128);
        $ic17$ = SubLObjectFactory.makeSymbol("S#20673", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic19$ = SubLObjectFactory.makeKeyword("MAL-PRECANONICALIZATIONS");
        $ic20$ = SubLObjectFactory.makeKeyword("INVALID-VARIABLES");
        $ic21$ = SubLObjectFactory.makeKeyword("MAL-FORTS");
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic23$ = SubLObjectFactory.makeKeyword("INVALID-MT");
        $ic24$ = SubLObjectFactory.makeKeyword("ASSERT");
        $ic25$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic27$ = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $ic28$ = SubLObjectFactory.makeKeyword("INVALID-EXPANSION");
        $ic29$ = SubLObjectFactory.makeSymbol("EL-WFF-SYNTAX?");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic31$ = SubLObjectFactory.makeString("Is SENTENCE well-formed wrt syntax?");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic35$ = SubLObjectFactory.makeString("Got a sentence that was neither atomic nor non-atomic in mt ~s: ~s");
        $ic36$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myCreationSecond")));
        $ic37$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic38$ = SubLObjectFactory.makeSymbol("S#15433", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#20390", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#20713", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#20716", "CYC");
        $ic43$ = SubLObjectFactory.makeKeyword("RESTRICTED-SKOLEM-ASSERTION");
        $ic44$ = SubLObjectFactory.makeKeyword("EVALUATABLE-LITERAL-FALSE");
        $ic45$ = SubLObjectFactory.makeKeyword("RESTRICTED-MT-ASSERTION");
        $ic46$ = SubLObjectFactory.makeKeyword("RESTRICTED-PREDICATE-ASSERTION");
        $ic47$ = SubLObjectFactory.makeKeyword("RESTRICTED-COLLECTION-ASSERTION");
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("VocabularyMicrotheory"));
        $ic49$ = SubLObjectFactory.makeKeyword("NON-DEFN-PRED-IN-VOCAB-MT");
        $ic50$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic51$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefaultVocabConstraintMt"));
        $ic52$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PossibleDefinitionalPredicate")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DefinitionalPredicate")));
        $ic53$ = SubLObjectFactory.makeKeyword("CONFLICT-ASSERTING-FALSE-SBHL");
        $ic54$ = SubLObjectFactory.makeKeyword("CONFLICT-ASSERTING-TRUE-SBHL");
        $ic55$ = SubLObjectFactory.makeSymbol("S#16405", "CYC");
        $ic56$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exceptFor"));
        $ic57$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic58$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("commutativeInArgs"));
        $ic59$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("commutativeInArgsAndRest"));
        $ic60$ = SubLObjectFactory.makeKeyword("EXCEPT-FOR-W/O-SINGLETON-VAR");
        $ic61$ = SubLObjectFactory.makeKeyword("INVALID-MT-FOR-TOU");
        $ic62$ = SubLObjectFactory.makeString("Got an unexpected sentential relation ~s in ~s");
        $ic63$ = SubLObjectFactory.makeSymbol("S#20736", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#20739", "CYC");
        $ic65$ = SubLObjectFactory.makeKeyword("TERM");
        $ic66$ = SubLObjectFactory.makeSymbol("S#20813", "CYC");
        $ic67$ = SubLObjectFactory.makeInteger(256);
        $ic68$ = SubLObjectFactory.makeSymbol("S#20656", "CYC");
        $ic69$ = SubLObjectFactory.makeKeyword("MISSING-ARITY");
        $ic70$ = SubLObjectFactory.makeKeyword("MAL-ARITY");
        $ic71$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arity"));
        $ic72$ = SubLObjectFactory.makeKeyword("VIOLATED-ARITY");
        $ic73$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arityMin"));
        $ic74$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arityMax"));
        $ic75$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic76$ = SubLObjectFactory.makeSymbol("EL-FORMULA-OK?");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic78$ = SubLObjectFactory.makeString("Is FORMULA a well-formed el formula?");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic80$ = SubLObjectFactory.makeSymbol("EL-QUERY-OK?");
        $ic81$ = SubLObjectFactory.makeString("Is FORMULA a well-formed el query?");
        $ic82$ = SubLObjectFactory.makeString("continue anyway");
        $ic83$ = SubLObjectFactory.makeSymbol("WARN");
        $ic84$ = SubLObjectFactory.makeKeyword("CHANGE-MT");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20817", "CYC"));
        $ic86$ = SubLObjectFactory.makeString("~%Consider asserting ~%  ~s~%in mt ~s.");
        $ic87$ = SubLObjectFactory.makeString("~%Consider asserting ~%  ~s~%in one of these mts: ~s.");
        $ic88$ = SubLObjectFactory.makeString(", ");
        $ic89$ = SubLObjectFactory.makeString(", or ");
        $ic90$ = SubLObjectFactory.makeKeyword("REPLACE-TERM");
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20818", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20819", "CYC"));
        $ic92$ = SubLObjectFactory.makeString("~%Consider using term ~%  ~s~%instead of term~%  ~s.");
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic94$ = SubLObjectFactory.makeString("~%Consider asserting ~%  ~s~%  in mt ~s.");
        $ic95$ = SubLObjectFactory.makeString("~%Consider asserting ~%  ~s.");
        $ic96$ = SubLObjectFactory.makeKeyword("UNASSERT");
        $ic97$ = SubLObjectFactory.makeString("~%Consider unasserting ~%  ~s~%  in mt ~s.");
        $ic98$ = SubLObjectFactory.makeString("~%Consider unasserting ~%  ~s.");
        $ic99$ = SubLObjectFactory.makeString("~%No explanation template exists for wff suggestion~%~s.");
        $ic100$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20820", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20817", "CYC"));
        $ic101$ = SubLObjectFactory.makeString("~%Consider referencing ~%  ~s~%in mt ~s.");
        $ic102$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20820", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic103$ = SubLObjectFactory.makeKeyword("NL");
        $ic104$ = SubLObjectFactory.makeKeyword("HL");
        $ic105$ = SubLObjectFactory.makeSymbol("DIAGNOSE-EL-FORMULA");
        $ic106$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20821", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("NL")));
        $ic107$ = SubLObjectFactory.makeString("Identify how el sentence SENTENCE fails syntactic or semantic constraints");
        $ic108$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic109$ = SubLObjectFactory.makeString("~%~a");
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IO-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("NL"));
        $ic111$ = SubLObjectFactory.makeKeyword("IO-MODE");
        $ic112$ = SubLObjectFactory.makeKeyword("VIOLATIONS");
        $ic113$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic114$ = SubLObjectFactory.makeKeyword("ASK");
        $ic115$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic116$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("admittedSentence"));
        $ic117$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $ic118$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("admittedNAT"));
        $ic119$ = SubLObjectFactory.makeSymbol("S#20487", "CYC");
        $ic120$ = SubLObjectFactory.makeString("~%No explanation template exists for wff error~%~s.");
        $ic121$ = SubLObjectFactory.makeSymbol("S#20793", "CYC");
        $ic122$ = SubLObjectFactory.makeKeyword("NOT-ISA");
        $ic123$ = SubLObjectFactory.makeKeyword("ASSERTIVE");
        $ic124$ = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $ic125$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertiveWFFRule"));
        $ic126$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic127$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycAPIMt"));
        $ic128$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic129$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic130$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa1-2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic131$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa1-3")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic132$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa1-4")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.FOUR_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic133$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa1-5")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.FIVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic134$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa2-1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic135$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa2-3")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic136$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa2-4")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.FOUR_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic137$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa2-5")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.FIVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic138$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa3-1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic139$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa3-2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic140$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa3-4")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.FOUR_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic141$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa3-5")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.FIVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic142$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa4-1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.FOUR_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic143$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa4-2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.FOUR_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic144$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa4-3")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.FOUR_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic145$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa4-5")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.FOUR_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.FIVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic146$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa5-1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.FIVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic147$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa5-2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.FIVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic148$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa5-3")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.FIVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic149$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa5-4")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?CONSTRAINED-PRED")), (SubLObject)module0274.FIVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("?IND-COL")), (SubLObject)module0274.FOUR_INTEGER, (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)module0274.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("?DEP-COL"))));
        $ic150$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic151$ = SubLObjectFactory.makeString("~A");
        $ic152$ = SubLObjectFactory.makeKeyword("GAF");
        $ic153$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic154$ = SubLObjectFactory.makeSymbol("CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES");
        $ic155$ = SubLObjectFactory.makeSymbol("S#12279", "CYC");
        $ic156$ = SubLObjectFactory.makeSymbol("AFTER-WFF-CONSTRAINT-SATISFIED");
    }
    
    public static final class $f18152$ZeroArityFunction extends ZeroArityFunction
    {
        public $f18152$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20656"));
        }
        
        public SubLObject processItem() {
            return module0274.f18152();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0274.class
	Total time: 1648 ms
	
	Decompiled with Procyon 0.5.32.
*/