package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0306 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0306";
    public static final String myFingerPrint = "6d6fc88687dfe4596ead7720e53a81b9645699648d3b9477f0231928c4a49008";
    private static SubLSymbol $g2763$;
    private static SubLSymbol $g2764$;
    private static SubLSymbol $g2765$;
    private static SubLSymbol $g2766$;
    private static SubLSymbol $g2767$;
    private static SubLSymbol $g2768$;
    private static SubLSymbol $g2769$;
    private static SubLSymbol $g2770$;
    private static SubLSymbol $g2771$;
    private static SubLSymbol $g2772$;
    private static SubLSymbol $g2773$;
    public static SubLSymbol $g2774$;
    public static SubLSymbol $g2775$;
    public static SubLSymbol $g2776$;
    public static SubLSymbol $g2777$;
    public static SubLSymbol $g2778$;
    private static SubLSymbol $g2779$;
    private static SubLSymbol $g2780$;
    public static SubLSymbol $g2781$;
    public static SubLSymbol $g2782$;
    public static SubLSymbol $g2783$;
    public static SubLSymbol $g2784$;
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
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
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
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
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
    private static final SubLInteger $ic95$;
    private static final SubLInteger $ic96$;
    private static final SubLString $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLObject $ic105$;
    
    public static SubLObject f20628(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == $g2763$.getDynamicValue(var3) && NIL == $g2764$.getDynamicValue(var3)) {
            f20629();
        }
        if (NIL != var2) {
            return Hashtables.gethash(var1, $g2764$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
        }
        return Hashtables.gethash(var1, $g2763$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20630(final SubLObject var1, final SubLObject var2) {
        return module0035.sublisp_boolean(f20628(var1, var2));
    }
    
    public static SubLObject f20631(final SubLObject var1, final SubLObject var4, final SubLObject var2) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (NIL == $g2763$.getDynamicValue(var5) && NIL == $g2764$.getDynamicValue(var5)) {
            f20629();
        }
        if (NIL != var2) {
            return Hashtables.sethash(var1, $g2764$.getDynamicValue(var5), var4);
        }
        return Hashtables.sethash(var1, $g2763$.getDynamicValue(var5), var4);
    }
    
    public static SubLObject f20632(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == $g2763$.getDynamicValue(var3) && NIL == $g2764$.getDynamicValue(var3)) {
            f20629();
        }
        if (NIL != var2) {
            return Hashtables.remhash(var1, $g2764$.getDynamicValue(var3));
        }
        return Hashtables.remhash(var1, $g2763$.getDynamicValue(var3));
    }
    
    public static SubLObject f20633(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == $g2765$.getDynamicValue(var3) && NIL == $g2766$.getDynamicValue(var3)) {
            f20629();
        }
        if (NIL != var2) {
            return Hashtables.gethash(var1, $g2766$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
        }
        return Hashtables.gethash(var1, $g2765$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20634(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == $g2765$.getDynamicValue(var3) && NIL == $g2766$.getDynamicValue(var3)) {
            f20629();
        }
        if (NIL != var2) {
            return Hashtables.remhash(var1, $g2766$.getDynamicValue(var3));
        }
        return Hashtables.remhash(var1, $g2765$.getDynamicValue(var3));
    }
    
    public static SubLObject f20635(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == $g2767$.getDynamicValue(var3) && NIL == $g2768$.getDynamicValue(var3)) {
            f20629();
        }
        if (NIL != var2) {
            return Hashtables.gethash(var1, $g2768$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
        }
        return Hashtables.gethash(var1, $g2767$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20636(final SubLObject var1, final SubLObject var5, final SubLObject var2) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL == $g2767$.getDynamicValue(var6) && NIL == $g2768$.getDynamicValue(var6)) {
            f20629();
        }
        if (NIL != var2) {
            return module0030.f1605(var1, var5, $g2768$.getDynamicValue(var6), (SubLObject)UNPROVIDED);
        }
        return module0030.f1605(var1, var5, $g2767$.getDynamicValue(var6), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20637(final SubLObject var1, final SubLObject var6, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var7 = (SubLObject)NIL;
        if (NIL == var7) {
            SubLObject var8 = f20635(var1, var2);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL == var7 && NIL != var8) {
                if (NIL != module0178.f11361(var9, (SubLObject)UNPROVIDED)) {
                    var7 = Equality.eq(var6, module0202.f12757(module0178.f11335(var9)));
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        return var7;
    }
    
    public static SubLObject f20638(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == $g2769$.getDynamicValue(var3) && NIL == $g2770$.getDynamicValue(var3)) {
            f20629();
        }
        if (NIL != var2) {
            return Hashtables.gethash(var1, $g2770$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
        }
        return Hashtables.gethash(var1, $g2769$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20639(final SubLObject var1, final SubLObject var5, final SubLObject var2) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL == $g2769$.getDynamicValue(var6) && NIL == $g2770$.getDynamicValue(var6)) {
            f20629();
        }
        if (NIL != var2) {
            return module0030.f1605(var1, var5, $g2770$.getDynamicValue(var6), (SubLObject)UNPROVIDED);
        }
        return module0030.f1605(var1, var5, $g2769$.getDynamicValue(var6), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20640(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f20633(var1, var2) || NIL != f20635(var1, var2) || NIL != f20638(var1, var2));
    }
    
    public static SubLObject f20641() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)$ic1$, $g2774$.getDynamicValue(var3), (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic2$, $g2774$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic3$, $g2774$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic4$, $g2774$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic5$, $g2774$.getDynamicValue(var3), (SubLObject)$ic6$);
        Hashtables.sethash((SubLObject)$ic7$, $g2774$.getDynamicValue(var3), (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20642(final SubLObject var1, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = module0147.$g2095$.getDynamicValue();
        }
        return f20643(var1, var9, var10, (SubLObject)NIL);
    }
    
    public static SubLObject f20644(final SubLObject var1, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1865$.getDynamicValue(var11)) {
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var13 = (SubLObject)NIL;
            final SubLObject var14 = Time.get_internal_real_time();
            var12 = f20642(var1, var9, var10);
            var13 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var14), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)$ic1$, $g2774$.getDynamicValue(var11), Numbers.add(Hashtables.gethash((SubLObject)$ic1$, $g2774$.getDynamicValue(var11), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER));
            Hashtables.sethash((SubLObject)$ic2$, $g2774$.getDynamicValue(var11), (SubLObject)ConsesLow.cons(var13, Hashtables.gethash((SubLObject)$ic2$, $g2774$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic3$, $g2774$.getDynamicValue(var11), (SubLObject)ConsesLow.cons(var12, Hashtables.gethash((SubLObject)$ic3$, $g2774$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic4$, $g2774$.getDynamicValue(var11), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var1, var9, var10), Hashtables.gethash((SubLObject)$ic4$, $g2774$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            return var12;
        }
        return f20642(var1, var9, var10);
    }
    
    public static SubLObject f20643(SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL != module0155.f9779(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var1 = module0172.f10921(var1);
        }
        if (NIL != module0144.f9461()) {
            if (NIL != var2) {
                if (NIL != module0259.f16975(var9, var1, var10, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)T;
                }
            }
            else if (NIL != module0259.f16854(var9, var1, var10, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        if (NIL == module0173.f10955(var1) && NIL == f20630(var1, var2)) {
            return (SubLObject)NIL;
        }
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = module0144.$g1881$.currentBinding(var11);
        final SubLObject var14 = module0144.$g1882$.currentBinding(var11);
        final SubLObject var15 = module0144.$g1879$.currentBinding(var11);
        final SubLObject var16 = module0144.$g1880$.currentBinding(var11);
        try {
            module0144.$g1881$.bind(module0149.f9622(), var11);
            module0144.$g1882$.bind(module0149.f9623(), var11);
            module0144.$g1879$.bind(module0149.f9624(), var11);
            module0144.$g1880$.bind(module0149.f9625(), var11);
            try {
                final SubLObject var17 = f20645(var1, var9, var10, var2);
                if (var17.eql((SubLObject)$ic11$)) {
                    var12 = (SubLObject)T;
                }
                else if (var17.eql((SubLObject)$ic12$)) {
                    var12 = (SubLObject)NIL;
                }
                else if (NIL != f20646(var1, var9, var10, var2)) {
                    var12 = (SubLObject)T;
                }
                else if (NIL == var2 && NIL != module0206.f13472(var9)) {
                    final SubLObject var18 = module0285.f18933(var9, (SubLObject)UNPROVIDED);
                    if (NIL != var18 && NIL != module0305.f20349(var1, var18, var10)) {
                        var12 = (SubLObject)T;
                    }
                }
            }
            finally {
                final SubLObject var15_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                    module0305.f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_21, var11);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var16, var11);
            module0144.$g1879$.rebind(var15, var11);
            module0144.$g1882$.rebind(var14, var11);
            module0144.$g1881$.rebind(var13, var11);
        }
        return var12;
    }
    
    public static SubLObject f20647() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)$ic1$, $g2775$.getDynamicValue(var3), (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic2$, $g2775$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic3$, $g2775$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic4$, $g2775$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic5$, $g2775$.getDynamicValue(var3), (SubLObject)$ic6$);
        Hashtables.sethash((SubLObject)$ic7$, $g2775$.getDynamicValue(var3), (SubLObject)$ic14$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20648(final SubLObject var1, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = module0147.$g2095$.getDynamicValue();
        }
        return f20649(var1, var9, var10, (SubLObject)NIL);
    }
    
    public static SubLObject f20650(final SubLObject var1, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1865$.getDynamicValue(var11)) {
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var13 = (SubLObject)NIL;
            final SubLObject var14 = Time.get_internal_real_time();
            var12 = f20648(var1, var9, var10);
            var13 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var14), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)$ic1$, $g2775$.getDynamicValue(var11), Numbers.add(Hashtables.gethash((SubLObject)$ic1$, $g2775$.getDynamicValue(var11), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER));
            Hashtables.sethash((SubLObject)$ic2$, $g2775$.getDynamicValue(var11), (SubLObject)ConsesLow.cons(var13, Hashtables.gethash((SubLObject)$ic2$, $g2775$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic3$, $g2775$.getDynamicValue(var11), (SubLObject)ConsesLow.cons(var12, Hashtables.gethash((SubLObject)$ic3$, $g2775$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic4$, $g2775$.getDynamicValue(var11), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var1, var9, var10), Hashtables.gethash((SubLObject)$ic4$, $g2775$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            return var12;
        }
        return f20648(var1, var9, var10);
    }
    
    public static SubLObject f20649(SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL != module0155.f9779(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var1 = module0172.f10921(var1);
        }
        if (NIL != module0144.f9461()) {
            if (NIL != var2) {
                if (NIL != module0259.f16975(var9, var1, var10, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)NIL;
                }
            }
            else if (NIL != module0259.f16854(var9, var1, var10, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
        }
        if (NIL == module0173.f10955(var1)) {
            return (SubLObject)NIL;
        }
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = module0144.$g1881$.currentBinding(var11);
        final SubLObject var14 = module0144.$g1882$.currentBinding(var11);
        final SubLObject var15 = module0144.$g1879$.currentBinding(var11);
        final SubLObject var16 = module0144.$g1880$.currentBinding(var11);
        try {
            module0144.$g1881$.bind(module0149.f9626(), var11);
            module0144.$g1882$.bind(module0149.f9627(), var11);
            module0144.$g1879$.bind(module0149.f9628(), var11);
            module0144.$g1880$.bind(module0149.f9629(), var11);
            try {
                final SubLObject var17 = f20645(var1, var9, var10, var2);
                if (var17.eql((SubLObject)$ic11$)) {
                    var12 = (SubLObject)NIL;
                }
                else if (var17.eql((SubLObject)$ic12$)) {
                    var12 = (SubLObject)T;
                }
                else if (NIL != f20651(var1, var9, var10, var2, (SubLObject)UNPROVIDED)) {
                    var12 = (SubLObject)T;
                }
                else if (NIL == var2 && NIL != module0206.f13472(var9)) {
                    final SubLObject var18 = module0285.f18933(var9, (SubLObject)UNPROVIDED);
                    if (NIL != var18 && NIL != module0305.f20354(var1, var18, var10)) {
                        var12 = (SubLObject)T;
                    }
                }
            }
            finally {
                final SubLObject var15_23 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                    module0305.f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_23, var11);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var16, var11);
            module0144.$g1879$.rebind(var15, var11);
            module0144.$g1882$.rebind(var14, var11);
            module0144.$g1881$.rebind(var13, var11);
        }
        if (NIL == var12 && $ic12$ == f20652(var1, var9, var10, var2)) {
            var12 = (SubLObject)T;
        }
        return var12;
    }
    
    public static SubLObject f20653() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)$ic1$, $g2776$.getDynamicValue(var3), (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic2$, $g2776$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic3$, $g2776$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic4$, $g2776$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic5$, $g2776$.getDynamicValue(var3), (SubLObject)$ic6$);
        Hashtables.sethash((SubLObject)$ic7$, $g2776$.getDynamicValue(var3), (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20654(final SubLObject var1, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = module0147.$g2095$.getDynamicValue();
        }
        return f20643(var1, var9, var10, (SubLObject)T);
    }
    
    public static SubLObject f20655(final SubLObject var1, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1865$.getDynamicValue(var11)) {
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var13 = (SubLObject)NIL;
            final SubLObject var14 = Time.get_internal_real_time();
            var12 = f20654(var1, var9, var10);
            var13 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var14), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)$ic1$, $g2776$.getDynamicValue(var11), Numbers.add(Hashtables.gethash((SubLObject)$ic1$, $g2776$.getDynamicValue(var11), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER));
            Hashtables.sethash((SubLObject)$ic2$, $g2776$.getDynamicValue(var11), (SubLObject)ConsesLow.cons(var13, Hashtables.gethash((SubLObject)$ic2$, $g2776$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic3$, $g2776$.getDynamicValue(var11), (SubLObject)ConsesLow.cons(var12, Hashtables.gethash((SubLObject)$ic3$, $g2776$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic4$, $g2776$.getDynamicValue(var11), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var1, var9, var10), Hashtables.gethash((SubLObject)$ic4$, $g2776$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            return var12;
        }
        return f20654(var1, var9, var10);
    }
    
    public static SubLObject f20656() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)$ic1$, $g2777$.getDynamicValue(var3), (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic2$, $g2777$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic3$, $g2777$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic4$, $g2777$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic5$, $g2777$.getDynamicValue(var3), (SubLObject)$ic6$);
        Hashtables.sethash((SubLObject)$ic7$, $g2777$.getDynamicValue(var3), (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20657(final SubLObject var1, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = module0147.$g2095$.getDynamicValue();
        }
        return f20649(var1, var9, var10, (SubLObject)T);
    }
    
    public static SubLObject f20658(final SubLObject var1, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1865$.getDynamicValue(var11)) {
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var13 = (SubLObject)NIL;
            final SubLObject var14 = Time.get_internal_real_time();
            var12 = f20657(var1, var9, var10);
            var13 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var14), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)$ic1$, $g2777$.getDynamicValue(var11), Numbers.add(Hashtables.gethash((SubLObject)$ic1$, $g2777$.getDynamicValue(var11), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER));
            Hashtables.sethash((SubLObject)$ic2$, $g2777$.getDynamicValue(var11), (SubLObject)ConsesLow.cons(var13, Hashtables.gethash((SubLObject)$ic2$, $g2777$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic3$, $g2777$.getDynamicValue(var11), (SubLObject)ConsesLow.cons(var12, Hashtables.gethash((SubLObject)$ic3$, $g2777$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic4$, $g2777$.getDynamicValue(var11), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var1, var9, var10), Hashtables.gethash((SubLObject)$ic4$, $g2777$.getDynamicValue(var11), (SubLObject)UNPROVIDED)));
            return var12;
        }
        return f20657(var1, var9, var10);
    }
    
    public static SubLObject f20645(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = f20659(var1, var9, var10, var2);
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = var12;
        if (!var14.eql((SubLObject)$ic11$)) {
            if (!var14.eql((SubLObject)$ic12$)) {
                if (NIL != module0144.$g1858$.getDynamicValue(var11)) {
                    final SubLObject var15 = module0144.$g1869$.currentBinding(var11);
                    try {
                        module0144.$g1869$.bind(var1, var11);
                        if (NIL == var13) {
                            SubLObject var16 = var1;
                            final SubLObject var17 = (SubLObject)$ic24$;
                            final SubLObject var18 = module0056.f4145(var17);
                            final SubLObject var15_29 = module0139.$g1635$.currentBinding(var11);
                            try {
                                module0139.$g1635$.bind(module0139.f9007(), var11);
                                final SubLObject var15_30 = module0147.$g2095$.currentBinding(var11);
                                final SubLObject var19 = module0147.$g2094$.currentBinding(var11);
                                final SubLObject var20 = module0147.$g2096$.currentBinding(var11);
                                try {
                                    module0147.$g2095$.bind(module0147.f9545(var10), var11);
                                    module0147.$g2094$.bind(module0147.f9546(var10), var11);
                                    module0147.$g2096$.bind(module0147.f9549(var10), var11);
                                    final SubLObject var21 = (SubLObject)NIL;
                                    final SubLObject var15_31 = module0141.$g1714$.currentBinding(var11);
                                    final SubLObject var16_34 = module0141.$g1715$.currentBinding(var11);
                                    try {
                                        module0141.$g1714$.bind((NIL != var21) ? var21 : module0141.f9283(), var11);
                                        module0141.$g1715$.bind((SubLObject)((NIL != var21) ? $ic25$ : module0141.$g1715$.getDynamicValue(var11)), var11);
                                        if (NIL != var21 && NIL != module0136.f8864() && NIL == module0141.f9279(var21)) {
                                            final SubLObject var19_35 = module0136.$g1591$.getDynamicValue(var11);
                                            if (var19_35.eql((SubLObject)$ic26$)) {
                                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic27$, var21, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            }
                                            else if (var19_35.eql((SubLObject)$ic29$)) {
                                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic30$, (SubLObject)$ic27$, var21, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            }
                                            else if (var19_35.eql((SubLObject)$ic31$)) {
                                                Errors.warn((SubLObject)$ic27$, var21, (SubLObject)$ic28$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)$ic32$, module0136.$g1591$.getDynamicValue(var11));
                                                Errors.cerror((SubLObject)$ic30$, (SubLObject)$ic27$, var21, (SubLObject)$ic28$);
                                            }
                                        }
                                        final SubLObject var15_32 = module0141.$g1670$.currentBinding(var11);
                                        final SubLObject var16_35 = module0141.$g1671$.currentBinding(var11);
                                        final SubLObject var17_38 = module0141.$g1672$.currentBinding(var11);
                                        final SubLObject var22 = module0141.$g1674$.currentBinding(var11);
                                        final SubLObject var23 = module0137.$g1605$.currentBinding(var11);
                                        try {
                                            module0141.$g1670$.bind(module0137.f8955($ic33$), var11);
                                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic33$)), var11);
                                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic33$)), var11);
                                            module0141.$g1674$.bind((SubLObject)NIL, var11);
                                            module0137.$g1605$.bind(module0137.f8955($ic33$), var11);
                                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var1, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                final SubLObject var15_33 = module0141.$g1677$.currentBinding(var11);
                                                final SubLObject var16_36 = module0138.$g1619$.currentBinding(var11);
                                                final SubLObject var17_39 = module0141.$g1674$.currentBinding(var11);
                                                try {
                                                    module0141.$g1677$.bind(module0141.f9208(), var11);
                                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic33$)), var11);
                                                    module0141.$g1674$.bind((SubLObject)NIL, var11);
                                                    module0249.f16055(var16, (SubLObject)UNPROVIDED);
                                                    while (NIL != var16 && NIL == var13) {
                                                        final SubLObject var24 = var16;
                                                        if (!var24.eql(var1) && NIL != f20651(var24, var9, var10, var2, (SubLObject)T)) {
                                                            var13 = (SubLObject)T;
                                                            var12 = (SubLObject)$ic12$;
                                                        }
                                                        final SubLObject var25 = module0200.f12443(module0137.f8955($ic33$));
                                                        SubLObject var26;
                                                        SubLObject var27;
                                                        SubLObject var15_34;
                                                        SubLObject var16_37;
                                                        SubLObject var28;
                                                        SubLObject var29;
                                                        SubLObject var30;
                                                        SubLObject var31;
                                                        SubLObject var53_54;
                                                        SubLObject var32;
                                                        SubLObject var15_35;
                                                        SubLObject var52_57;
                                                        SubLObject var33;
                                                        SubLObject var34;
                                                        SubLObject var15_36;
                                                        SubLObject var35;
                                                        SubLObject var36;
                                                        SubLObject var37;
                                                        SubLObject var38;
                                                        SubLObject var39;
                                                        SubLObject var40;
                                                        SubLObject var41;
                                                        SubLObject var42;
                                                        SubLObject var45_67;
                                                        SubLObject var43;
                                                        SubLObject var15_37;
                                                        SubLObject var45;
                                                        SubLObject var44;
                                                        SubLObject var46;
                                                        SubLObject var47;
                                                        SubLObject var48;
                                                        SubLObject var49;
                                                        SubLObject var50;
                                                        SubLObject var51;
                                                        for (var26 = (SubLObject)NIL, var26 = var25; NIL == var13 && NIL != var26; var26 = var26.rest()) {
                                                            var27 = var26.first();
                                                            var15_34 = module0137.$g1605$.currentBinding(var11);
                                                            var16_37 = module0141.$g1674$.currentBinding(var11);
                                                            try {
                                                                module0137.$g1605$.bind(var27, var11);
                                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var11)) : module0141.$g1674$.getDynamicValue(var11)), var11);
                                                                var28 = module0228.f15229(var16);
                                                                if (NIL != module0138.f8992(var28)) {
                                                                    var29 = module0242.f15664(var28, module0137.f8955((SubLObject)UNPROVIDED));
                                                                    if (NIL != var29) {
                                                                        var30 = module0245.f15834(var29, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                                        if (NIL != var30) {
                                                                            for (var31 = module0066.f4838(module0067.f4891(var30)); NIL == var13 && NIL == module0066.f4841(var31); var31 = module0066.f4840(var31)) {
                                                                                var11.resetMultipleValues();
                                                                                var53_54 = module0066.f4839(var31);
                                                                                var32 = var11.secondMultipleValue();
                                                                                var11.resetMultipleValues();
                                                                                if (NIL != module0147.f9507(var53_54)) {
                                                                                    var15_35 = module0138.$g1623$.currentBinding(var11);
                                                                                    try {
                                                                                        module0138.$g1623$.bind(var53_54, var11);
                                                                                        for (var52_57 = module0066.f4838(module0067.f4891(var32)); NIL == var13 && NIL == module0066.f4841(var52_57); var52_57 = module0066.f4840(var52_57)) {
                                                                                            var11.resetMultipleValues();
                                                                                            var33 = module0066.f4839(var52_57);
                                                                                            var34 = var11.secondMultipleValue();
                                                                                            var11.resetMultipleValues();
                                                                                            if (NIL != module0141.f9289(var33)) {
                                                                                                var15_36 = module0138.$g1624$.currentBinding(var11);
                                                                                                try {
                                                                                                    module0138.$g1624$.bind(var33, var11);
                                                                                                    var35 = var34;
                                                                                                    if (NIL != module0077.f5302(var35)) {
                                                                                                        var36 = module0077.f5333(var35);
                                                                                                        for (var37 = module0032.f1741(var36), var38 = (SubLObject)NIL, var38 = module0032.f1742(var37, var36); NIL == var13 && NIL == module0032.f1744(var37, var38); var38 = module0032.f1743(var38)) {
                                                                                                            var39 = module0032.f1745(var37, var38);
                                                                                                            if (NIL != module0032.f1746(var38, var39) && NIL == module0249.f16059(var39, (SubLObject)UNPROVIDED)) {
                                                                                                                module0249.f16055(var39, (SubLObject)UNPROVIDED);
                                                                                                                module0056.f4149(var39, var18);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (var35.isList()) {
                                                                                                        if (NIL == var13) {
                                                                                                            var40 = var35;
                                                                                                            var41 = (SubLObject)NIL;
                                                                                                            var41 = var40.first();
                                                                                                            while (NIL == var13 && NIL != var40) {
                                                                                                                if (NIL == module0249.f16059(var41, (SubLObject)UNPROVIDED)) {
                                                                                                                    module0249.f16055(var41, (SubLObject)UNPROVIDED);
                                                                                                                    module0056.f4149(var41, var18);
                                                                                                                }
                                                                                                                var40 = var40.rest();
                                                                                                                var41 = var40.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)$ic34$, var35);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0138.$g1624$.rebind(var15_36, var11);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        module0066.f4842(var52_57);
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1623$.rebind(var15_35, var11);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var31);
                                                                        }
                                                                    }
                                                                    else {
                                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (NIL != module0155.f9785(var28, (SubLObject)UNPROVIDED)) {
                                                                    var42 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var11), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var11), module0137.f8955((SubLObject)UNPROVIDED)));
                                                                    for (var45_67 = (SubLObject)NIL, var45_67 = var42; NIL == var13 && NIL != var45_67; var45_67 = var45_67.rest()) {
                                                                        var43 = var45_67.first();
                                                                        var15_37 = module0138.$g1625$.currentBinding(var11);
                                                                        try {
                                                                            module0138.$g1625$.bind(var43, var11);
                                                                            var44 = (var45 = Functions.funcall(var43, var28));
                                                                            if (NIL != module0077.f5302(var45)) {
                                                                                var46 = module0077.f5333(var45);
                                                                                for (var47 = module0032.f1741(var46), var48 = (SubLObject)NIL, var48 = module0032.f1742(var47, var46); NIL == var13 && NIL == module0032.f1744(var47, var48); var48 = module0032.f1743(var48)) {
                                                                                    var49 = module0032.f1745(var47, var48);
                                                                                    if (NIL != module0032.f1746(var48, var49) && NIL == module0249.f16059(var49, (SubLObject)UNPROVIDED)) {
                                                                                        module0249.f16055(var49, (SubLObject)UNPROVIDED);
                                                                                        module0056.f4149(var49, var18);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var45.isList()) {
                                                                                if (NIL == var13) {
                                                                                    var50 = var45;
                                                                                    var51 = (SubLObject)NIL;
                                                                                    var51 = var50.first();
                                                                                    while (NIL == var13 && NIL != var50) {
                                                                                        if (NIL == module0249.f16059(var51, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var51, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var51, var18);
                                                                                        }
                                                                                        var50 = var50.rest();
                                                                                        var51 = var50.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)$ic34$, var45);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1625$.rebind(var15_37, var11);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0141.$g1674$.rebind(var16_37, var11);
                                                                module0137.$g1605$.rebind(var15_34, var11);
                                                            }
                                                        }
                                                        var16 = module0056.f4150(var18);
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var17_39, var11);
                                                    module0138.$g1619$.rebind(var16_36, var11);
                                                    module0141.$g1677$.rebind(var15_33, var11);
                                                }
                                            }
                                            else {
                                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic36$, var1, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            module0137.$g1605$.rebind(var23, var11);
                                            module0141.$g1674$.rebind(var22, var11);
                                            module0141.$g1672$.rebind(var17_38, var11);
                                            module0141.$g1671$.rebind(var16_35, var11);
                                            module0141.$g1670$.rebind(var15_32, var11);
                                        }
                                    }
                                    finally {
                                        module0141.$g1715$.rebind(var16_34, var11);
                                        module0141.$g1714$.rebind(var15_31, var11);
                                    }
                                }
                                finally {
                                    module0147.$g2096$.rebind(var20, var11);
                                    module0147.$g2094$.rebind(var19, var11);
                                    module0147.$g2095$.rebind(var15_30, var11);
                                }
                                module0139.f9011(module0139.$g1635$.getDynamicValue(var11));
                            }
                            finally {
                                module0139.$g1635$.rebind(var15_29, var11);
                            }
                        }
                    }
                    finally {
                        module0144.$g1869$.rebind(var15, var11);
                    }
                }
            }
        }
        return var12;
    }
    
    public static SubLObject f20652(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        if (NIL != module0144.$g1859$.getDynamicValue(var11)) {
            final SubLObject var13 = module0144.$g1869$.currentBinding(var11);
            final SubLObject var14 = module0258.$g2489$.currentBinding(var11);
            try {
                module0144.$g1869$.bind(var1, var11);
                module0258.$g2489$.bind(Equality.eq(module0144.$g1859$.getDynamicValue(var11), (SubLObject)$ic37$), var11);
                final SubLObject var15 = (NIL != var2) ? f20660(var9, var10) : f20661(var9, var10);
                if (NIL != module0257.f16696(var15, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var12 = (SubLObject)$ic12$;
                }
            }
            finally {
                module0258.$g2489$.rebind(var14, var11);
                module0144.$g1869$.rebind(var13, var11);
            }
        }
        return var12;
    }
    
    public static SubLObject f20646(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = $g2771$.currentBinding(var11);
        final SubLObject var14 = $g2772$.currentBinding(var11);
        final SubLObject var15 = $g2773$.currentBinding(var11);
        try {
            $g2771$.bind(var9, var11);
            $g2772$.bind(var1, var11);
            $g2773$.bind((SubLObject)NIL, var11);
            if (NIL != var2) {
                var12 = module0252.f16290(module0137.f8955($ic33$), var1, Symbols.symbol_function((SubLObject)$ic38$), var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                var12 = module0252.f16290(module0137.f8955($ic33$), var1, Symbols.symbol_function((SubLObject)$ic39$), var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL == var12 && NIL != module0144.$g1796$.getDynamicValue(var11) && NIL != module0152.$g2117$.getDynamicValue(var11) && NIL != $g2773$.getDynamicValue(var11) && NIL != module0303.f20208()) {
                module0302.f20036(f20662(var1, var9, $g2773$.getDynamicValue(var11), var2, var10));
            }
        }
        finally {
            $g2773$.rebind(var15, var11);
            $g2772$.rebind(var14, var11);
            $g2771$.rebind(var13, var11);
        }
        return var12;
    }
    
    public static SubLObject f20662(final SubLObject var1, final SubLObject var9, final SubLObject var71, final SubLObject var2, final SubLObject var10) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        if (NIL == module0067.f4852(module0302.$g2703$.getDynamicValue(var72))) {
            return (SubLObject)ConsesLow.list(module0305.f20366(var1, var9, var71, var2, var10));
        }
        final SubLObject var73 = module0067.f4884(module0302.$g2703$.getDynamicValue(var72), var1, (SubLObject)UNPROVIDED);
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = var73;
        SubLObject var76 = (SubLObject)NIL;
        var76 = var75.first();
        while (NIL != var75) {
            var74 = (SubLObject)ConsesLow.cons(f20663(var1, var9, var71, var2, var10, var76), var74);
            var75 = var75.rest();
            var76 = var75.first();
        }
        return var74;
    }
    
    public static SubLObject f20663(final SubLObject var1, final SubLObject var9, final SubLObject var71, final SubLObject var2, final SubLObject var10, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        SubLObject var80 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var75, var75, (SubLObject)$ic40$);
        var78 = var75.first();
        SubLObject var81 = var75.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var75, (SubLObject)$ic40$);
        var79 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var75, (SubLObject)$ic40$);
        var80 = var81.first();
        var81 = var81.rest();
        if (NIL != var81) {
            cdestructuring_bind.cdestructuring_bind_error(var75, (SubLObject)$ic40$);
            return (SubLObject)NIL;
        }
        if (NIL != var78 && NIL != module0144.$g1831$.getDynamicValue(var76) && !var78.eql(module0144.$g1831$.getDynamicValue(var76))) {
            var77 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var79, var78), var77);
        }
        if (NIL != module0144.$g1847$.getDynamicValue(var76) && NIL != var80) {
            var77 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic41$, var80), var77);
        }
        if (NIL != var10) {
            var77 = (SubLObject)ConsesLow.cons(var10, var77);
        }
        else {
            var77 = (SubLObject)ConsesLow.cons(module0147.$g2095$.getDynamicValue(var76), var77);
        }
        if (NIL != var2) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic42$, new SubLObject[] { var9, module0144.$g1831$.getDynamicValue(var76), module0144.$g1833$.getDynamicValue(var76), var1, var71, var77 });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic43$, new SubLObject[] { var9, module0144.$g1831$.getDynamicValue(var76), module0144.$g1833$.getDynamicValue(var76), var1, var71, var77 });
    }
    
    public static SubLObject f20664(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f20665(var1, $g2771$.getDynamicValue(var2), module0147.$g2095$.getDynamicValue(var2), (SubLObject)NIL);
    }
    
    public static SubLObject f20666(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f20665(var1, $g2771$.getDynamicValue(var2), module0147.$g2095$.getDynamicValue(var2), (SubLObject)T);
    }
    
    public static SubLObject f20665(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL == f20630(var1, var2)) {
            return (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)T);
        }
        if (NIL == f20640(var1, var2)) {
            return (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = (SubLObject)($g2772$.getDynamicValue(var11).eql(var1) ? T : f20659(var1, var9, var10, var2));
        if (var14.eql((SubLObject)$ic11$)) {
            var12 = (SubLObject)T;
            var13 = (SubLObject)T;
        }
        else if (var14.eql((SubLObject)$ic12$)) {
            var12 = (SubLObject)NIL;
            var13 = (SubLObject)T;
        }
        else if (NIL != f20667(var1, var9, var10, var2, (SubLObject)NIL)) {
            if (NIL != f20668(var1, var9, var10, var2)) {
                var12 = (SubLObject)T;
                var13 = (SubLObject)T;
            }
        }
        else {
            var12 = (SubLObject)NIL;
            var13 = (SubLObject)T;
        }
        return (SubLObject)ConsesLow.list(var12, var13);
    }
    
    public static SubLObject f20659(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = f20633(var1, var2);
        SubLObject var13 = (SubLObject)NIL;
        if (NIL == var12) {
            return (SubLObject)NIL;
        }
        final SubLObject var14 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var15 = module0147.$g2095$.currentBinding(var11);
        try {
            module0147.$g2094$.bind(module0147.f9531(var10), var11);
            module0147.$g2095$.bind(module0147.f9534(var10), var11);
            if (NIL != module0178.f11361(var12, (SubLObject)UNPROVIDED) && NIL != module0147.f9507(module0178.f11287(var12))) {
                final SubLObject var16 = module0202.f12757(module0178.f11335(var12));
                final SubLObject var15_85 = module0144.$g1869$.currentBinding(var11);
                try {
                    module0144.$g1869$.bind(var1, var11);
                    if (NIL != module0305.f20359(var16, var1)) {
                        if (NIL != ((NIL != var2) ? module0305.f20365(var16, var9, var1, var10) : module0305.f20360(var16, var9, var1, var10))) {
                            var13 = (SubLObject)$ic11$;
                        }
                        else {
                            var13 = (SubLObject)$ic12$;
                            if (NIL != module0144.$g1796$.getDynamicValue(var11)) {
                                module0302.f20036(f20669(var1, var9, var16, var2, var10));
                            }
                        }
                    }
                }
                finally {
                    module0144.$g1869$.rebind(var15_85, var11);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var15, var11);
            module0147.$g2094$.rebind(var14, var11);
        }
        return var13;
    }
    
    public static SubLObject f20669(final SubLObject var1, final SubLObject var9, final SubLObject var6, final SubLObject var2, final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL == module0067.f4852(module0302.$g2703$.getDynamicValue(var11))) {
            return (SubLObject)ConsesLow.list(module0305.f20361(var1, var9, var6, var2, var10));
        }
        final SubLObject var12 = module0067.f4884(module0302.$g2703$.getDynamicValue(var11), var1, (SubLObject)UNPROVIDED);
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var12;
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            var13 = (SubLObject)ConsesLow.cons(f20670(var1, var9, var6, var2, var10, var15), var13);
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var13;
    }
    
    public static SubLObject f20670(final SubLObject var1, final SubLObject var9, final SubLObject var6, final SubLObject var2, final SubLObject var10, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        SubLObject var80 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var75, var75, (SubLObject)$ic40$);
        var78 = var75.first();
        SubLObject var81 = var75.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var75, (SubLObject)$ic40$);
        var79 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var75, (SubLObject)$ic40$);
        var80 = var81.first();
        var81 = var81.rest();
        if (NIL == var81) {
            if (NIL != var78 && NIL != module0144.$g1831$.getDynamicValue(var76) && !var78.eql(module0144.$g1831$.getDynamicValue(var76))) {
                var77 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var79, var78), var77);
            }
            if (NIL != module0144.$g1847$.getDynamicValue(var76) && NIL != var80) {
                var77 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic41$, var80), var77);
            }
            if (NIL != var10) {
                var77 = (SubLObject)ConsesLow.cons(var10, var77);
            }
            else {
                var77 = (SubLObject)ConsesLow.cons(module0147.$g2095$.getDynamicValue(var76), var77);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var75, (SubLObject)$ic40$);
        }
        if (NIL != var2) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic44$, new SubLObject[] { var9, module0144.$g1831$.getDynamicValue(var76), module0144.$g1833$.getDynamicValue(var76), var1, var6, var77 });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic45$, new SubLObject[] { var9, module0144.$g1831$.getDynamicValue(var76), module0144.$g1833$.getDynamicValue(var76), var1, var6, var77 });
    }
    
    public static SubLObject f20668(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = f20635(var1, var2);
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        if (NIL == var12) {
            return (SubLObject)NIL;
        }
        final SubLObject var15 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var16 = module0147.$g2095$.currentBinding(var11);
        try {
            module0147.$g2094$.bind(module0147.f9531(var10), var11);
            module0147.$g2095$.bind(module0147.f9534(var10), var11);
            if (NIL == var14) {
                SubLObject var17 = var12;
                SubLObject var18 = (SubLObject)NIL;
                var18 = var17.first();
                while (NIL == var14 && NIL != var17) {
                    if (NIL != module0178.f11361(var18, (SubLObject)UNPROVIDED) && NIL != module0147.f9507(module0178.f11287(var18))) {
                        final SubLObject var19 = module0202.f12757(module0178.f11335(var18));
                        final SubLObject var15_90 = module0144.$g1869$.currentBinding(var11);
                        try {
                            module0144.$g1869$.bind(var1, var11);
                            if (NIL != module0305.f20359(var19, var1)) {
                                if (NIL != ((NIL != var2) ? module0305.f20426(var19, var9, var1, var10) : module0305.f20368(var19, var9, var1, var10))) {
                                    var13 = (SubLObject)T;
                                    var14 = (SubLObject)T;
                                }
                                else {
                                    var13 = (SubLObject)NIL;
                                    var14 = (SubLObject)NIL;
                                    if (NIL != module0144.$g1796$.getDynamicValue(var11)) {
                                        final SubLObject var20 = var19;
                                        if (NIL == conses_high.member(var20, $g2773$.getDynamicValue(var11), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            $g2773$.setDynamicValue((SubLObject)ConsesLow.cons(var20, $g2773$.getDynamicValue(var11)), var11);
                                        }
                                    }
                                }
                            }
                        }
                        finally {
                            module0144.$g1869$.rebind(var15_90, var11);
                        }
                    }
                    var17 = var17.rest();
                    var18 = var17.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var16, var11);
            module0147.$g2094$.rebind(var15, var11);
        }
        return var13;
    }
    
    public static SubLObject f20667(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2, SubLObject var92) {
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL == f20651(var1, var9, var10, var2, var92));
    }
    
    public static SubLObject f20671() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)$ic1$, $g2778$.getDynamicValue(var3), (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic2$, $g2778$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic3$, $g2778$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic4$, $g2778$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic5$, $g2778$.getDynamicValue(var3), (SubLObject)$ic47$);
        Hashtables.sethash((SubLObject)$ic7$, $g2778$.getDynamicValue(var3), (SubLObject)$ic48$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20672(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2, SubLObject var92) {
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)NIL;
        }
        final SubLThread var93 = SubLProcess.currentSubLThread();
        SubLObject var94 = f20638(var1, var2);
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        if (NIL == var94) {
            if (NIL != var92) {
                var94 = (SubLObject)ConsesLow.list(f20633(var1, var2));
            }
            if (NIL == var94) {
                return (SubLObject)NIL;
            }
        }
        final SubLObject var97 = module0147.$g2094$.currentBinding(var93);
        final SubLObject var98 = module0147.$g2095$.currentBinding(var93);
        try {
            module0147.$g2094$.bind(module0147.f9531(var10), var93);
            module0147.$g2095$.bind(module0147.f9534(var10), var93);
            if (NIL == var96) {
                SubLObject var99 = var94;
                SubLObject var100 = (SubLObject)NIL;
                var100 = var99.first();
                while (NIL == var96 && NIL != var99) {
                    if (NIL != module0178.f11361(var100, (SubLObject)UNPROVIDED) && NIL != module0147.f9507(module0178.f11287(var100))) {
                        final SubLObject var101 = module0202.f12757(module0178.f11335(var100));
                        final SubLObject var15_95 = module0144.$g1869$.currentBinding(var93);
                        try {
                            module0144.$g1869$.bind(var1, var93);
                            if (NIL != module0305.f20359(var101, var1)) {
                                if (NIL != ((NIL != var2) ? module0305.f20365(var101, var9, var1, var10) : module0305.f20360(var101, var9, var1, var10))) {
                                    var95 = (SubLObject)NIL;
                                    var96 = (SubLObject)NIL;
                                }
                                else {
                                    var95 = (SubLObject)T;
                                    var96 = (SubLObject)T;
                                    if (NIL != module0144.$g1796$.getDynamicValue(var93)) {
                                        module0302.f20036(f20673(module0144.$g1869$.getDynamicValue(var93), var9, var1, var101, var2, var10));
                                    }
                                }
                            }
                        }
                        finally {
                            module0144.$g1869$.rebind(var15_95, var93);
                        }
                    }
                    var99 = var99.rest();
                    var100 = var99.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var98, var93);
            module0147.$g2094$.rebind(var97, var93);
        }
        return var95;
    }
    
    public static SubLObject f20651(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2, SubLObject var92) {
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)NIL;
        }
        final SubLThread var93 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1865$.getDynamicValue(var93)) {
            SubLObject var94 = (SubLObject)NIL;
            SubLObject var95 = (SubLObject)NIL;
            final SubLObject var96 = Time.get_internal_real_time();
            var94 = f20672(var1, var9, var10, var2, var92);
            var95 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var96), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)$ic1$, $g2778$.getDynamicValue(var93), Numbers.add(Hashtables.gethash((SubLObject)$ic1$, $g2778$.getDynamicValue(var93), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER));
            Hashtables.sethash((SubLObject)$ic2$, $g2778$.getDynamicValue(var93), (SubLObject)ConsesLow.cons(var95, Hashtables.gethash((SubLObject)$ic2$, $g2778$.getDynamicValue(var93), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic3$, $g2778$.getDynamicValue(var93), (SubLObject)ConsesLow.cons(var94, Hashtables.gethash((SubLObject)$ic3$, $g2778$.getDynamicValue(var93), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic4$, $g2778$.getDynamicValue(var93), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var1, var9, var10, var2, var92), Hashtables.gethash((SubLObject)$ic4$, $g2778$.getDynamicValue(var93), (SubLObject)UNPROVIDED)));
            return var94;
        }
        return f20672(var1, var9, var10, var2, var92);
    }
    
    public static SubLObject f20673(final SubLObject var1, final SubLObject var9, final SubLObject var96, final SubLObject var6, final SubLObject var2, final SubLObject var10) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        if (NIL == module0067.f4852(module0302.$g2703$.getDynamicValue(var97))) {
            return (SubLObject)ConsesLow.list(module0305.f20373(var1, var9, var96, var6, var2, var10));
        }
        final SubLObject var98 = module0067.f4884(module0302.$g2703$.getDynamicValue(var97), var1, (SubLObject)UNPROVIDED);
        SubLObject var99 = (SubLObject)NIL;
        SubLObject var100 = var98;
        SubLObject var101 = (SubLObject)NIL;
        var101 = var100.first();
        while (NIL != var100) {
            var99 = (SubLObject)ConsesLow.cons(f20674(var1, var9, var96, var6, var2, var10, var101), var99);
            var100 = var100.rest();
            var101 = var100.first();
        }
        return var99;
    }
    
    public static SubLObject f20674(final SubLObject var1, final SubLObject var9, final SubLObject var96, final SubLObject var6, final SubLObject var2, final SubLObject var10, final SubLObject var75) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        SubLObject var98 = (SubLObject)NIL;
        SubLObject var99 = (SubLObject)NIL;
        SubLObject var100 = (SubLObject)NIL;
        SubLObject var101 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var75, var75, (SubLObject)$ic40$);
        var99 = var75.first();
        SubLObject var102 = var75.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var102, var75, (SubLObject)$ic40$);
        var100 = var102.first();
        var102 = var102.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var102, var75, (SubLObject)$ic40$);
        var101 = var102.first();
        var102 = var102.rest();
        if (NIL == var102) {
            if (NIL != var99 && NIL != module0144.$g1831$.getDynamicValue(var97) && !var99.eql(module0144.$g1831$.getDynamicValue(var97))) {
                var98 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var100, var99), var98);
            }
            if (NIL != module0144.$g1847$.getDynamicValue(var97) && NIL != var101) {
                var98 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic41$, var101), var98);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var75, (SubLObject)$ic40$);
        }
        if (NIL != var10) {
            var98 = (SubLObject)ConsesLow.cons(var10, var98);
        }
        else {
            var98 = (SubLObject)ConsesLow.cons(module0147.$g2095$.getDynamicValue(var97), var98);
        }
        if (NIL != var2) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic50$, new SubLObject[] { var9, module0144.$g1831$.getDynamicValue(var97), module0144.$g1833$.getDynamicValue(var97), var1, var96, var6, var98 });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic51$, new SubLObject[] { var9, module0144.$g1831$.getDynamicValue(var97), module0144.$g1833$.getDynamicValue(var97), var1, var96, var6, var98 });
    }
    
    public static SubLObject f20675(final SubLObject var9, final SubLObject var1) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = module0144.$g1870$.currentBinding(var10);
        try {
            module0144.$g1870$.bind((SubLObject)NIL, var10);
            var11 = f20676(var1, f20677(var9, var1, $ic52$, (SubLObject)NIL, (SubLObject)T));
        }
        finally {
            module0144.$g1870$.rebind(var12, var10);
        }
        return var11;
    }
    
    public static SubLObject f20678(final SubLObject var9, final SubLObject var1) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = module0144.$g1870$.currentBinding(var10);
        try {
            module0144.$g1870$.bind((SubLObject)NIL, var10);
            var11 = f20676(var1, f20677(var9, var1, $ic52$, (SubLObject)T, (SubLObject)T));
        }
        finally {
            module0144.$g1870$.rebind(var12, var10);
        }
        return var11;
    }
    
    public static SubLObject f20679(final SubLObject var9, final SubLObject var99, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var100 = f20677(var9, var99, var10, (SubLObject)NIL, (SubLObject)T);
        SubLObject var101 = (SubLObject)NIL;
        SubLObject var102 = var100;
        SubLObject var103 = (SubLObject)NIL;
        var103 = var102.first();
        while (NIL != var102) {
            final SubLObject var104 = module0178.f11334(var103);
            if (!var104.eql(var99)) {
                var101 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic53$, (SubLObject)ConsesLow.list($ic33$, var104, var99), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var101);
            }
            var101 = (SubLObject)ConsesLow.cons(var103, var101);
            var102 = var102.rest();
            var103 = var102.first();
        }
        return var101;
    }
    
    public static SubLObject f20680(final SubLObject var9, final SubLObject var99, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var100 = f20677(var9, var99, var10, (SubLObject)T, (SubLObject)T);
        SubLObject var101 = (SubLObject)NIL;
        SubLObject var102 = var100;
        SubLObject var103 = (SubLObject)NIL;
        var103 = var102.first();
        while (NIL != var102) {
            final SubLObject var104 = module0178.f11334(var103);
            if (!var104.eql(var99)) {
                var101 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic53$, (SubLObject)ConsesLow.list($ic33$, var104, var99), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var101);
            }
            var101 = (SubLObject)ConsesLow.cons(var103, var101);
            var102 = var102.rest();
            var103 = var102.first();
        }
        return var101;
    }
    
    public static SubLObject f20677(final SubLObject var9, SubLObject var1, final SubLObject var10, final SubLObject var2, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (NIL != module0155.f9779(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var1 = module0172.f10921(var1);
        }
        if (NIL == module0173.f10955(var1) && NIL == f20630(var1, var2)) {
            return (SubLObject)NIL;
        }
        SubLObject var104 = (SubLObject)NIL;
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = (SubLObject)NIL;
        final SubLObject var107 = module0147.$g2094$.currentBinding(var103);
        final SubLObject var108 = module0147.$g2095$.currentBinding(var103);
        final SubLObject var109 = module0144.$g1881$.currentBinding(var103);
        final SubLObject var110 = module0144.$g1882$.currentBinding(var103);
        final SubLObject var111 = module0144.$g1879$.currentBinding(var103);
        final SubLObject var112 = module0144.$g1880$.currentBinding(var103);
        try {
            module0147.$g2094$.bind(module0147.f9531(var10), var103);
            module0147.$g2095$.bind(module0147.f9534(var10), var103);
            module0144.$g1881$.bind(module0149.f9626(), var103);
            module0144.$g1882$.bind(module0149.f9627(), var103);
            module0144.$g1879$.bind(module0149.f9628(), var103);
            module0144.$g1880$.bind(module0149.f9629(), var103);
            try {
                var103.resetMultipleValues();
                final SubLObject var104_105 = f20681(var1, var9, var2);
                final SubLObject var106_107 = var103.secondMultipleValue();
                var103.resetMultipleValues();
                var106 = var104_105;
                var105 = var106_107;
            }
            finally {
                final SubLObject var15_108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var103);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var103);
                    final SubLObject var113 = var106;
                    if (var113.eql((SubLObject)$ic11$)) {
                        var104 = (SubLObject)ConsesLow.cons(var105, var104);
                        if (NIL == var102) {
                            var104 = ConsesLow.nconc(var104, f20682(var9, var1, var2, var102));
                        }
                    }
                    else if (!var113.eql((SubLObject)$ic12$)) {
                        var104 = f20682(var9, var1, var2, var102);
                    }
                    if (NIL == var2 && NIL == var104 && NIL != module0206.f13472(var9)) {
                        final SubLObject var114 = module0285.f18933(var9, (SubLObject)UNPROVIDED);
                        if (NIL != var114) {
                            var104 = f20677(var9, var1, var10, (SubLObject)T, var102);
                        }
                    }
                    module0305.f20348();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var15_108, var103);
                }
            }
        }
        finally {
            module0144.$g1880$.rebind(var112, var103);
            module0144.$g1879$.rebind(var111, var103);
            module0144.$g1882$.rebind(var110, var103);
            module0144.$g1881$.rebind(var109, var103);
            module0147.$g2095$.rebind(var108, var103);
            module0147.$g2094$.rebind(var107, var103);
        }
        return module0035.f2119(var104);
    }
    
    public static SubLObject f20676(final SubLObject var1, final SubLObject var71) {
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = var71;
        SubLObject var74 = (SubLObject)NIL;
        var74 = var73.first();
        while (NIL != var73) {
            final SubLObject var75 = module0178.f11334(var74);
            final SubLObject var76 = module0178.f11287(var74);
            SubLObject var74_110 = module0256.f16652(var75, var1, (SubLObject)UNPROVIDED);
            SubLObject var77 = (SubLObject)NIL;
            var77 = var74_110.first();
            while (NIL != var74_110) {
                var72 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var76, var77), var72);
                var74_110 = var74_110.rest();
                var77 = var74_110.first();
            }
            var73 = var73.rest();
            var74 = var73.first();
        }
        return module0262.f17379(var72);
    }
    
    public static SubLObject f20681(final SubLObject var1, final SubLObject var9, final SubLObject var2) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = f20659(var1, var9, module0147.$g2095$.getDynamicValue(var10), var2);
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = var11;
        if (var14.eql((SubLObject)$ic11$)) {
            var13 = f20633(var1, var2);
        }
        else if (!var14.eql((SubLObject)$ic12$)) {
            final SubLObject var15 = module0144.$g1869$.currentBinding(var10);
            try {
                module0144.$g1869$.bind(var1, var10);
                final SubLObject var16 = module0147.$g2095$.getDynamicValue(var10);
                if (NIL == var12) {
                    SubLObject var17 = var1;
                    final SubLObject var18 = (SubLObject)$ic24$;
                    final SubLObject var19 = module0056.f4145(var18);
                    final SubLObject var15_112 = module0139.$g1635$.currentBinding(var10);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var10);
                        final SubLObject var20 = var16;
                        final SubLObject var15_113 = module0147.$g2095$.currentBinding(var10);
                        final SubLObject var21 = module0147.$g2094$.currentBinding(var10);
                        final SubLObject var22 = module0147.$g2096$.currentBinding(var10);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var20), var10);
                            module0147.$g2094$.bind(module0147.f9546(var20), var10);
                            module0147.$g2096$.bind(module0147.f9549(var20), var10);
                            final SubLObject var23 = (SubLObject)NIL;
                            final SubLObject var15_114 = module0141.$g1714$.currentBinding(var10);
                            final SubLObject var16_115 = module0141.$g1715$.currentBinding(var10);
                            try {
                                module0141.$g1714$.bind((NIL != var23) ? var23 : module0141.f9283(), var10);
                                module0141.$g1715$.bind((SubLObject)((NIL != var23) ? $ic25$ : module0141.$g1715$.getDynamicValue(var10)), var10);
                                if (NIL != var23 && NIL != module0136.f8864() && NIL == module0141.f9279(var23)) {
                                    final SubLObject var19_116 = module0136.$g1591$.getDynamicValue(var10);
                                    if (var19_116.eql((SubLObject)$ic26$)) {
                                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic27$, var23, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    else if (var19_116.eql((SubLObject)$ic29$)) {
                                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic30$, (SubLObject)$ic27$, var23, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    else if (var19_116.eql((SubLObject)$ic31$)) {
                                        Errors.warn((SubLObject)$ic27$, var23, (SubLObject)$ic28$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)$ic32$, module0136.$g1591$.getDynamicValue(var10));
                                        Errors.cerror((SubLObject)$ic30$, (SubLObject)$ic27$, var23, (SubLObject)$ic28$);
                                    }
                                }
                                final SubLObject var15_115 = module0141.$g1670$.currentBinding(var10);
                                final SubLObject var16_116 = module0141.$g1671$.currentBinding(var10);
                                final SubLObject var17_119 = module0141.$g1672$.currentBinding(var10);
                                final SubLObject var24 = module0141.$g1674$.currentBinding(var10);
                                final SubLObject var25 = module0137.$g1605$.currentBinding(var10);
                                try {
                                    module0141.$g1670$.bind(module0137.f8955($ic33$), var10);
                                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic33$)), var10);
                                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic33$)), var10);
                                    module0141.$g1674$.bind((SubLObject)NIL, var10);
                                    module0137.$g1605$.bind(module0137.f8955($ic33$), var10);
                                    if (NIL != module0136.f8865() || NIL != module0244.f15795(var1, module0137.f8955((SubLObject)UNPROVIDED))) {
                                        final SubLObject var15_116 = module0141.$g1677$.currentBinding(var10);
                                        final SubLObject var16_117 = module0138.$g1619$.currentBinding(var10);
                                        final SubLObject var17_120 = module0141.$g1674$.currentBinding(var10);
                                        try {
                                            module0141.$g1677$.bind(module0141.f9208(), var10);
                                            module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic33$)), var10);
                                            module0141.$g1674$.bind((SubLObject)NIL, var10);
                                            module0249.f16055(var17, (SubLObject)UNPROVIDED);
                                            while (NIL != var17 && NIL == var12) {
                                                final SubLObject var26 = var17;
                                                if (!var26.eql(var1) && NIL != f20651(var26, var9, var16, var2, (SubLObject)T)) {
                                                    var12 = (SubLObject)T;
                                                    var11 = (SubLObject)$ic12$;
                                                }
                                                final SubLObject var27 = module0200.f12443(module0137.f8955($ic33$));
                                                SubLObject var28;
                                                SubLObject var29;
                                                SubLObject var15_117;
                                                SubLObject var16_118;
                                                SubLObject var30;
                                                SubLObject var31;
                                                SubLObject var32;
                                                SubLObject var33;
                                                SubLObject var53_125;
                                                SubLObject var34;
                                                SubLObject var15_118;
                                                SubLObject var52_127;
                                                SubLObject var35;
                                                SubLObject var36;
                                                SubLObject var15_119;
                                                SubLObject var37;
                                                SubLObject var38;
                                                SubLObject var39;
                                                SubLObject var40;
                                                SubLObject var41;
                                                SubLObject var42;
                                                SubLObject var43;
                                                SubLObject var44;
                                                SubLObject var45_129;
                                                SubLObject var45;
                                                SubLObject var15_120;
                                                SubLObject var47;
                                                SubLObject var46;
                                                SubLObject var48;
                                                SubLObject var49;
                                                SubLObject var50;
                                                SubLObject var51;
                                                SubLObject var52;
                                                SubLObject var53;
                                                for (var28 = (SubLObject)NIL, var28 = var27; NIL == var12 && NIL != var28; var28 = var28.rest()) {
                                                    var29 = var28.first();
                                                    var15_117 = module0137.$g1605$.currentBinding(var10);
                                                    var16_118 = module0141.$g1674$.currentBinding(var10);
                                                    try {
                                                        module0137.$g1605$.bind(var29, var10);
                                                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var10)) : module0141.$g1674$.getDynamicValue(var10)), var10);
                                                        var30 = module0228.f15229(var17);
                                                        if (NIL != module0138.f8992(var30)) {
                                                            var31 = module0242.f15664(var30, module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var31) {
                                                                var32 = module0245.f15834(var31, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                                if (NIL != var32) {
                                                                    for (var33 = module0066.f4838(module0067.f4891(var32)); NIL == var12 && NIL == module0066.f4841(var33); var33 = module0066.f4840(var33)) {
                                                                        var10.resetMultipleValues();
                                                                        var53_125 = module0066.f4839(var33);
                                                                        var34 = var10.secondMultipleValue();
                                                                        var10.resetMultipleValues();
                                                                        if (NIL != module0147.f9507(var53_125)) {
                                                                            var15_118 = module0138.$g1623$.currentBinding(var10);
                                                                            try {
                                                                                module0138.$g1623$.bind(var53_125, var10);
                                                                                for (var52_127 = module0066.f4838(module0067.f4891(var34)); NIL == var12 && NIL == module0066.f4841(var52_127); var52_127 = module0066.f4840(var52_127)) {
                                                                                    var10.resetMultipleValues();
                                                                                    var35 = module0066.f4839(var52_127);
                                                                                    var36 = var10.secondMultipleValue();
                                                                                    var10.resetMultipleValues();
                                                                                    if (NIL != module0141.f9289(var35)) {
                                                                                        var15_119 = module0138.$g1624$.currentBinding(var10);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var35, var10);
                                                                                            var37 = var36;
                                                                                            if (NIL != module0077.f5302(var37)) {
                                                                                                var38 = module0077.f5333(var37);
                                                                                                for (var39 = module0032.f1741(var38), var40 = (SubLObject)NIL, var40 = module0032.f1742(var39, var38); NIL == var12 && NIL == module0032.f1744(var39, var40); var40 = module0032.f1743(var40)) {
                                                                                                    var41 = module0032.f1745(var39, var40);
                                                                                                    if (NIL != module0032.f1746(var40, var41) && NIL == module0249.f16059(var41, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var41, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149(var41, var19);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var37.isList()) {
                                                                                                if (NIL == var12) {
                                                                                                    var42 = var37;
                                                                                                    var43 = (SubLObject)NIL;
                                                                                                    var43 = var42.first();
                                                                                                    while (NIL == var12 && NIL != var42) {
                                                                                                        if (NIL == module0249.f16059(var43, (SubLObject)UNPROVIDED)) {
                                                                                                            module0249.f16055(var43, (SubLObject)UNPROVIDED);
                                                                                                            module0056.f4149(var43, var19);
                                                                                                        }
                                                                                                        var42 = var42.rest();
                                                                                                        var43 = var42.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)$ic34$, var37);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var15_119, var10);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var52_127);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var15_118, var10);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var33);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                            }
                                                        }
                                                        else if (NIL != module0155.f9785(var30, (SubLObject)UNPROVIDED)) {
                                                            var44 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var10), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var10), module0137.f8955((SubLObject)UNPROVIDED)));
                                                            for (var45_129 = (SubLObject)NIL, var45_129 = var44; NIL == var12 && NIL != var45_129; var45_129 = var45_129.rest()) {
                                                                var45 = var45_129.first();
                                                                var15_120 = module0138.$g1625$.currentBinding(var10);
                                                                try {
                                                                    module0138.$g1625$.bind(var45, var10);
                                                                    var46 = (var47 = Functions.funcall(var45, var30));
                                                                    if (NIL != module0077.f5302(var47)) {
                                                                        var48 = module0077.f5333(var47);
                                                                        for (var49 = module0032.f1741(var48), var50 = (SubLObject)NIL, var50 = module0032.f1742(var49, var48); NIL == var12 && NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                            var51 = module0032.f1745(var49, var50);
                                                                            if (NIL != module0032.f1746(var50, var51) && NIL == module0249.f16059(var51, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var51, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149(var51, var19);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var47.isList()) {
                                                                        if (NIL == var12) {
                                                                            var52 = var47;
                                                                            var53 = (SubLObject)NIL;
                                                                            var53 = var52.first();
                                                                            while (NIL == var12 && NIL != var52) {
                                                                                if (NIL == module0249.f16059(var53, (SubLObject)UNPROVIDED)) {
                                                                                    module0249.f16055(var53, (SubLObject)UNPROVIDED);
                                                                                    module0056.f4149(var53, var19);
                                                                                }
                                                                                var52 = var52.rest();
                                                                                var53 = var52.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)$ic34$, var47);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var15_120, var10);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var16_118, var10);
                                                        module0137.$g1605$.rebind(var15_117, var10);
                                                    }
                                                }
                                                var17 = module0056.f4150(var19);
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var17_120, var10);
                                            module0138.$g1619$.rebind(var16_117, var10);
                                            module0141.$g1677$.rebind(var15_116, var10);
                                        }
                                    }
                                    else {
                                        module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic36$, var1, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0137.$g1605$.rebind(var25, var10);
                                    module0141.$g1674$.rebind(var24, var10);
                                    module0141.$g1672$.rebind(var17_119, var10);
                                    module0141.$g1671$.rebind(var16_116, var10);
                                    module0141.$g1670$.rebind(var15_115, var10);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var16_115, var10);
                                module0141.$g1714$.rebind(var15_114, var10);
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var22, var10);
                            module0147.$g2094$.rebind(var21, var10);
                            module0147.$g2095$.rebind(var15_113, var10);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var10));
                    }
                    finally {
                        module0139.$g1635$.rebind(var15_112, var10);
                    }
                }
            }
            finally {
                module0144.$g1869$.rebind(var15, var10);
            }
        }
        return Values.values(var11, var13);
    }
    
    public static SubLObject f20682(final SubLObject var9, final SubLObject var1, final SubLObject var2, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        SubLObject var104 = (SubLObject)NIL;
        final SubLObject var105 = $g2771$.currentBinding(var103);
        final SubLObject var106 = module0144.$g1869$.currentBinding(var103);
        try {
            $g2771$.bind(var9, var103);
            module0144.$g1869$.bind(var1, var103);
            final SubLObject var107 = module0147.$g2095$.getDynamicValue(var103);
            if (NIL != var102) {
                if (NIL != var2) {
                    var104 = module0252.f16290(module0137.f8955($ic33$), var1, Symbols.symbol_function((SubLObject)$ic54$), var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    var104 = module0252.f16290(module0137.f8955($ic33$), var1, Symbols.symbol_function((SubLObject)$ic55$), var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            else if (NIL != var2) {
                var104 = module0252.f16251(module0137.f8955($ic33$), var1, Symbols.symbol_function((SubLObject)$ic56$), var107, (SubLObject)UNPROVIDED);
            }
            else {
                var104 = module0252.f16251(module0137.f8955($ic33$), var1, Symbols.symbol_function((SubLObject)$ic57$), var107, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0144.$g1869$.rebind(var106, var103);
            $g2771$.rebind(var105, var103);
        }
        return var104;
    }
    
    public static SubLObject f20683(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f20684(var1, $g2771$.getDynamicValue(var2), (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f20685(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f20684(var1, $g2771$.getDynamicValue(var2), (SubLObject)T, (SubLObject)NIL);
    }
    
    public static SubLObject f20686(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f20684(var1, $g2771$.getDynamicValue(var2), (SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f20687(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f20684(var1, $g2771$.getDynamicValue(var2), (SubLObject)T, (SubLObject)T);
    }
    
    public static SubLObject f20684(final SubLObject var1, final SubLObject var9, final SubLObject var2, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (NIL == f20630(var1, var2)) {
            return (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)T);
        }
        if (NIL == f20640(var1, var2)) {
            return (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)NIL);
        }
        final SubLObject var104 = module0147.$g2095$.getDynamicValue(var103);
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = (SubLObject)NIL;
        final SubLObject var107 = (SubLObject)(module0144.$g1869$.getDynamicValue(var103).eql(var1) ? T : f20659(var1, var9, var104, var2));
        if (var107.eql((SubLObject)$ic11$)) {
            var105 = (SubLObject)ConsesLow.cons(f20633(var1, var2), var105);
            var106 = var102;
        }
        else if (var107.eql((SubLObject)$ic12$)) {
            var105 = (SubLObject)NIL;
            var106 = (SubLObject)T;
        }
        else if (NIL != f20667(var1, var9, var104, var2, (SubLObject)NIL)) {
            final SubLObject var108 = f20688(var1, var9, var104, var2);
            if (NIL != var108) {
                var105 = (SubLObject)ConsesLow.cons(var108, var105);
            }
            var106 = var102;
        }
        else {
            var105 = (SubLObject)NIL;
            var106 = (SubLObject)T;
        }
        return (SubLObject)ConsesLow.list(var105, var106);
    }
    
    public static SubLObject f20688(final SubLObject var1, final SubLObject var9, final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = f20635(var1, var2);
        SubLObject var13 = (SubLObject)NIL;
        if (NIL == var12) {
            return (SubLObject)NIL;
        }
        final SubLObject var14 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var15 = module0147.$g2095$.currentBinding(var11);
        try {
            module0147.$g2094$.bind(module0147.f9531(var10), var11);
            module0147.$g2095$.bind(module0147.f9534(var10), var11);
            SubLObject var16 = var12;
            SubLObject var17 = (SubLObject)NIL;
            var17 = var16.first();
            while (NIL != var16) {
                if (NIL != module0178.f11361(var17, (SubLObject)UNPROVIDED) && NIL != module0147.f9507(module0178.f11287(var17))) {
                    final SubLObject var18 = module0202.f12757(module0178.f11335(var17));
                    if (NIL != module0305.f20359(var18, var1) && NIL != ((NIL != var2) ? module0305.f20426(var18, var9, var1, var10) : module0305.f20368(var18, var9, var1, var10))) {
                        var13 = (SubLObject)ConsesLow.cons(var17, var13);
                    }
                }
                var16 = var16.rest();
                var17 = var16.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var15, var11);
            module0147.$g2094$.rebind(var14, var11);
        }
        return var13;
    }
    
    public static SubLObject f20689(final SubLObject var132, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)NIL;
        final SubLObject var136 = var133;
        final SubLObject var137 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var138 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var139 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var136), var134);
            module0147.$g2094$.bind(module0147.f9546(var136), var134);
            module0147.$g2096$.bind(module0147.f9549(var136), var134);
            if (NIL == var135) {
                SubLObject var140 = $g2779$.getGlobalValue();
                SubLObject var141 = (SubLObject)NIL;
                var141 = var140.first();
                while (NIL == var135 && NIL != var140) {
                    SubLObject var143;
                    final SubLObject var142 = var143 = var141;
                    SubLObject var144 = (SubLObject)NIL;
                    SubLObject var145 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)$ic59$);
                    var144 = var143.first();
                    var143 = var143.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)$ic59$);
                    var145 = var143.first();
                    var143 = var143.rest();
                    if (NIL == var143) {
                        if (NIL != Functions.funcall(var144, var132)) {
                            var135 = var145;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var142, (SubLObject)$ic59$);
                    }
                    var140 = var140.rest();
                    var141 = var140.first();
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var139, var134);
            module0147.$g2094$.rebind(var138, var134);
            module0147.$g2095$.rebind(var137, var134);
        }
        if (NIL != var135) {
            return (SubLObject)ConsesLow.list(var135);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20661(final SubLObject var132, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)NIL;
        final SubLObject var136 = var133;
        final SubLObject var137 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var138 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var139 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var136), var134);
            module0147.$g2094$.bind(module0147.f9546(var136), var134);
            module0147.$g2096$.bind(module0147.f9549(var136), var134);
            final SubLObject var140 = f20689(var132, var133);
            var135 = module0256.f16550(var140, var133, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var139, var134);
            module0147.$g2094$.rebind(var138, var134);
            module0147.$g2095$.rebind(var137, var134);
        }
        return module0549.f33908(conses_high.copy_list(var135), (SubLObject)$ic60$);
    }
    
    public static SubLObject f20690(final SubLObject var132, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)NIL;
        final SubLObject var136 = var133;
        final SubLObject var137 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var138 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var139 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var136), var134);
            module0147.$g2094$.bind(module0147.f9546(var136), var134);
            module0147.$g2096$.bind(module0147.f9549(var136), var134);
            if (NIL == var135) {
                SubLObject var140 = $g2780$.getGlobalValue();
                SubLObject var141 = (SubLObject)NIL;
                var141 = var140.first();
                while (NIL == var135 && NIL != var140) {
                    SubLObject var143;
                    final SubLObject var142 = var143 = var141;
                    SubLObject var144 = (SubLObject)NIL;
                    SubLObject var145 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)$ic62$);
                    var144 = var143.first();
                    var143 = var143.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)$ic62$);
                    var145 = var143.first();
                    var143 = var143.rest();
                    if (NIL == var143) {
                        if (NIL != Functions.funcall(var144, var132)) {
                            var135 = var145;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var142, (SubLObject)$ic62$);
                    }
                    var140 = var140.rest();
                    var141 = var140.first();
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var139, var134);
            module0147.$g2094$.rebind(var138, var134);
            module0147.$g2095$.rebind(var137, var134);
        }
        if (NIL != var135) {
            return (SubLObject)ConsesLow.list(var135);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20660(final SubLObject var132, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)NIL;
        final SubLObject var136 = var133;
        final SubLObject var137 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var138 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var139 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var136), var134);
            module0147.$g2094$.bind(module0147.f9546(var136), var134);
            module0147.$g2096$.bind(module0147.f9549(var136), var134);
            final SubLObject var140 = f20690(var132, var133);
            var135 = module0256.f16550(var140, var133, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var139, var134);
            module0147.$g2094$.rebind(var138, var134);
            module0147.$g2095$.rebind(var137, var134);
        }
        return module0549.f33908(conses_high.copy_list(var135), (SubLObject)$ic60$);
    }
    
    public static SubLObject f20691(final SubLObject var5, final SubLObject var145, final SubLObject var2, final SubLObject var146) {
        final SubLObject var147 = module0178.f11334(var5);
        f20692(var147, var145, var2);
        f20693(var147, var5, var145, var146);
        return var147;
    }
    
    public static SubLObject f20694(final SubLObject var5, final SubLObject var145, final SubLObject var146) {
        final SubLObject var147 = module0178.f11334(var5);
        f20693(var147, var5, var145, var146);
        return var147;
    }
    
    public static SubLObject f20695(final SubLObject var147, final SubLObject var5) {
        return f20691(var5, (SubLObject)T, (SubLObject)NIL, (SubLObject)$ic63$);
    }
    
    public static SubLObject f20696(final SubLObject var147, final SubLObject var5) {
        return f20691(var5, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic63$);
    }
    
    public static SubLObject f20697(final SubLObject var147, final SubLObject var5) {
        return f20691(var5, (SubLObject)T, (SubLObject)NIL, (SubLObject)$ic66$);
    }
    
    public static SubLObject f20698(final SubLObject var147, final SubLObject var5) {
        return f20691(var5, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic66$);
    }
    
    public static SubLObject f20699(final SubLObject var147, final SubLObject var5) {
        return f20694(var5, (SubLObject)T, (SubLObject)$ic69$);
    }
    
    public static SubLObject f20700(final SubLObject var147, final SubLObject var5) {
        return f20694(var5, (SubLObject)NIL, (SubLObject)$ic69$);
    }
    
    public static SubLObject f20701(final SubLObject var147, final SubLObject var5) {
        return f20691(var5, (SubLObject)T, (SubLObject)T, (SubLObject)$ic72$);
    }
    
    public static SubLObject f20702(final SubLObject var147, final SubLObject var5) {
        return f20691(var5, (SubLObject)NIL, (SubLObject)T, (SubLObject)$ic72$);
    }
    
    public static SubLObject f20703(final SubLObject var147, final SubLObject var5) {
        return f20691(var5, (SubLObject)T, (SubLObject)T, (SubLObject)$ic75$);
    }
    
    public static SubLObject f20704(final SubLObject var147, final SubLObject var5) {
        return f20691(var5, (SubLObject)NIL, (SubLObject)T, (SubLObject)$ic75$);
    }
    
    public static SubLObject f20705(final SubLObject var147, final SubLObject var5) {
        return f20694(var5, (SubLObject)T, (SubLObject)$ic78$);
    }
    
    public static SubLObject f20706(final SubLObject var147, final SubLObject var5) {
        return f20694(var5, (SubLObject)NIL, (SubLObject)$ic78$);
    }
    
    public static SubLObject f20707(final SubLObject var148, final SubLObject var43, final SubLObject var2) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        final SubLObject var150 = f20628(var148, var2);
        if (var150.isInteger() && var150.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var151 = module0147.$g2094$.currentBinding(var149);
            final SubLObject var152 = module0147.$g2095$.currentBinding(var149);
            try {
                module0147.$g2094$.bind((SubLObject)$ic81$, var149);
                module0147.$g2095$.bind($ic52$, var149);
                SubLObject var153 = var43;
                final SubLObject var154 = (SubLObject)$ic24$;
                final SubLObject var155 = module0056.f4145(var154);
                final SubLObject var15_150 = module0139.$g1635$.currentBinding(var149);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var149);
                    final SubLObject var156 = (SubLObject)NIL;
                    final SubLObject var15_151 = module0141.$g1714$.currentBinding(var149);
                    final SubLObject var16_152 = module0141.$g1715$.currentBinding(var149);
                    try {
                        module0141.$g1714$.bind((NIL != var156) ? var156 : module0141.f9283(), var149);
                        module0141.$g1715$.bind((SubLObject)((NIL != var156) ? $ic25$ : module0141.$g1715$.getDynamicValue(var149)), var149);
                        if (NIL != var156 && NIL != module0136.f8864() && NIL == module0141.f9279(var156)) {
                            final SubLObject var157 = module0136.$g1591$.getDynamicValue(var149);
                            if (var157.eql((SubLObject)$ic26$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic27$, var156, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var157.eql((SubLObject)$ic29$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic30$, (SubLObject)$ic27$, var156, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var157.eql((SubLObject)$ic31$)) {
                                Errors.warn((SubLObject)$ic27$, var156, (SubLObject)$ic28$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic32$, module0136.$g1591$.getDynamicValue(var149));
                                Errors.cerror((SubLObject)$ic30$, (SubLObject)$ic27$, var156, (SubLObject)$ic28$);
                            }
                        }
                        final SubLObject var15_152 = module0141.$g1670$.currentBinding(var149);
                        final SubLObject var16_153 = module0141.$g1671$.currentBinding(var149);
                        final SubLObject var158 = module0141.$g1672$.currentBinding(var149);
                        final SubLObject var159 = module0141.$g1674$.currentBinding(var149);
                        final SubLObject var160 = module0137.$g1605$.currentBinding(var149);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic33$), var149);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic33$)), var149);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic33$)), var149);
                            module0141.$g1674$.bind((SubLObject)NIL, var149);
                            module0137.$g1605$.bind(module0137.f8955($ic33$), var149);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var43, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var15_153 = module0141.$g1677$.currentBinding(var149);
                                final SubLObject var16_154 = module0138.$g1619$.currentBinding(var149);
                                final SubLObject var17_157 = module0141.$g1674$.currentBinding(var149);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var149);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic33$)), var149);
                                    module0141.$g1674$.bind((SubLObject)NIL, var149);
                                    module0249.f16055(var153, (SubLObject)UNPROVIDED);
                                    while (NIL != var153) {
                                        final SubLObject var161 = var153;
                                        f20708(var161, var2, var150);
                                        SubLObject var163;
                                        final SubLObject var162 = var163 = module0200.f12443(module0137.f8955($ic33$));
                                        SubLObject var164 = (SubLObject)NIL;
                                        var164 = var163.first();
                                        while (NIL != var163) {
                                            final SubLObject var15_154 = module0137.$g1605$.currentBinding(var149);
                                            final SubLObject var16_155 = module0141.$g1674$.currentBinding(var149);
                                            try {
                                                module0137.$g1605$.bind(var164, var149);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var149)) : module0141.$g1674$.getDynamicValue(var149)), var149);
                                                final SubLObject var165 = module0228.f15229(var153);
                                                if (NIL != module0138.f8992(var165)) {
                                                    final SubLObject var166 = module0242.f15664(var165, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var166) {
                                                        final SubLObject var167 = module0245.f15834(var166, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var167) {
                                                            SubLObject var168;
                                                            for (var168 = module0066.f4838(module0067.f4891(var167)); NIL == module0066.f4841(var168); var168 = module0066.f4840(var168)) {
                                                                var149.resetMultipleValues();
                                                                final SubLObject var169 = module0066.f4839(var168);
                                                                final SubLObject var170 = var149.secondMultipleValue();
                                                                var149.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var169)) {
                                                                    final SubLObject var15_155 = module0138.$g1623$.currentBinding(var149);
                                                                    try {
                                                                        module0138.$g1623$.bind(var169, var149);
                                                                        SubLObject var52_162;
                                                                        for (var52_162 = module0066.f4838(module0067.f4891(var170)); NIL == module0066.f4841(var52_162); var52_162 = module0066.f4840(var52_162)) {
                                                                            var149.resetMultipleValues();
                                                                            final SubLObject var171 = module0066.f4839(var52_162);
                                                                            final SubLObject var172 = var149.secondMultipleValue();
                                                                            var149.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var171)) {
                                                                                final SubLObject var15_156 = module0138.$g1624$.currentBinding(var149);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var171, var149);
                                                                                    final SubLObject var173 = var172;
                                                                                    if (NIL != module0077.f5302(var173)) {
                                                                                        final SubLObject var174 = module0077.f5333(var173);
                                                                                        SubLObject var175;
                                                                                        SubLObject var176;
                                                                                        SubLObject var177;
                                                                                        for (var175 = module0032.f1741(var174), var176 = (SubLObject)NIL, var176 = module0032.f1742(var175, var174); NIL == module0032.f1744(var175, var176); var176 = module0032.f1743(var176)) {
                                                                                            var177 = module0032.f1745(var175, var176);
                                                                                            if (NIL != module0032.f1746(var176, var177) && NIL == module0249.f16059(var177, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var177, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var177, var155);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var173.isList()) {
                                                                                        SubLObject var178 = var173;
                                                                                        SubLObject var179 = (SubLObject)NIL;
                                                                                        var179 = var178.first();
                                                                                        while (NIL != var178) {
                                                                                            if (NIL == module0249.f16059(var179, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var179, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var179, var155);
                                                                                            }
                                                                                            var178 = var178.rest();
                                                                                            var179 = var178.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic34$, var173);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var15_156, var149);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var52_162);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var15_155, var149);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var168);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var165, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var74_164;
                                                    final SubLObject var180 = var74_164 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var149), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var149), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var181 = (SubLObject)NIL;
                                                    var181 = var74_164.first();
                                                    while (NIL != var74_164) {
                                                        final SubLObject var15_157 = module0138.$g1625$.currentBinding(var149);
                                                        try {
                                                            module0138.$g1625$.bind(var181, var149);
                                                            final SubLObject var183;
                                                            final SubLObject var182 = var183 = Functions.funcall(var181, var165);
                                                            if (NIL != module0077.f5302(var183)) {
                                                                final SubLObject var184 = module0077.f5333(var183);
                                                                SubLObject var185;
                                                                SubLObject var186;
                                                                SubLObject var187;
                                                                for (var185 = module0032.f1741(var184), var186 = (SubLObject)NIL, var186 = module0032.f1742(var185, var184); NIL == module0032.f1744(var185, var186); var186 = module0032.f1743(var186)) {
                                                                    var187 = module0032.f1745(var185, var186);
                                                                    if (NIL != module0032.f1746(var186, var187) && NIL == module0249.f16059(var187, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var187, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var187, var155);
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
                                                                        module0056.f4149(var189, var155);
                                                                    }
                                                                    var188 = var188.rest();
                                                                    var189 = var188.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic34$, var183);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var15_157, var149);
                                                        }
                                                        var74_164 = var74_164.rest();
                                                        var181 = var74_164.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var16_155, var149);
                                                module0137.$g1605$.rebind(var15_154, var149);
                                            }
                                            var163 = var163.rest();
                                            var164 = var163.first();
                                        }
                                        var153 = module0056.f4150(var155);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var17_157, var149);
                                    module0138.$g1619$.rebind(var16_154, var149);
                                    module0141.$g1677$.rebind(var15_153, var149);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic36$, var43, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var160, var149);
                            module0141.$g1674$.rebind(var159, var149);
                            module0141.$g1672$.rebind(var158, var149);
                            module0141.$g1671$.rebind(var16_153, var149);
                            module0141.$g1670$.rebind(var15_152, var149);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var16_152, var149);
                        module0141.$g1714$.rebind(var15_151, var149);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var149));
                }
                finally {
                    module0139.$g1635$.rebind(var15_150, var149);
                }
            }
            finally {
                module0147.$g2095$.rebind(var152, var149);
                module0147.$g2094$.rebind(var151, var149);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20709() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)$ic1$, $g2781$.getDynamicValue(var3), (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic2$, $g2781$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic3$, $g2781$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic4$, $g2781$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic5$, $g2781$.getDynamicValue(var3), (SubLObject)$ic83$);
        Hashtables.sethash((SubLObject)$ic7$, $g2781$.getDynamicValue(var3), (SubLObject)$ic84$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20710(final SubLObject var148, final SubLObject var43) {
        return f20707(var148, var43, (SubLObject)NIL);
    }
    
    public static SubLObject f20711(final SubLObject var148, final SubLObject var43) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1865$.getDynamicValue(var149)) {
            SubLObject var150 = (SubLObject)NIL;
            SubLObject var151 = (SubLObject)NIL;
            final SubLObject var152 = Time.get_internal_real_time();
            var150 = f20710(var148, var43);
            var151 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var152), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)$ic1$, $g2781$.getDynamicValue(var149), Numbers.add(Hashtables.gethash((SubLObject)$ic1$, $g2781$.getDynamicValue(var149), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER));
            Hashtables.sethash((SubLObject)$ic2$, $g2781$.getDynamicValue(var149), (SubLObject)ConsesLow.cons(var151, Hashtables.gethash((SubLObject)$ic2$, $g2781$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic3$, $g2781$.getDynamicValue(var149), (SubLObject)ConsesLow.cons(var150, Hashtables.gethash((SubLObject)$ic3$, $g2781$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic4$, $g2781$.getDynamicValue(var149), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var148, var43), Hashtables.gethash((SubLObject)$ic4$, $g2781$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            return var150;
        }
        return f20710(var148, var43);
    }
    
    public static SubLObject f20712() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)$ic1$, $g2782$.getDynamicValue(var3), (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic2$, $g2782$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic3$, $g2782$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic4$, $g2782$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic5$, $g2782$.getDynamicValue(var3), (SubLObject)$ic83$);
        Hashtables.sethash((SubLObject)$ic7$, $g2782$.getDynamicValue(var3), (SubLObject)$ic87$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20713(final SubLObject var148, final SubLObject var43) {
        return f20707(var148, var43, (SubLObject)T);
    }
    
    public static SubLObject f20714(final SubLObject var148, final SubLObject var43) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1865$.getDynamicValue(var149)) {
            SubLObject var150 = (SubLObject)NIL;
            SubLObject var151 = (SubLObject)NIL;
            final SubLObject var152 = Time.get_internal_real_time();
            var150 = f20713(var148, var43);
            var151 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var152), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)$ic1$, $g2782$.getDynamicValue(var149), Numbers.add(Hashtables.gethash((SubLObject)$ic1$, $g2782$.getDynamicValue(var149), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER));
            Hashtables.sethash((SubLObject)$ic2$, $g2782$.getDynamicValue(var149), (SubLObject)ConsesLow.cons(var151, Hashtables.gethash((SubLObject)$ic2$, $g2782$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic3$, $g2782$.getDynamicValue(var149), (SubLObject)ConsesLow.cons(var150, Hashtables.gethash((SubLObject)$ic3$, $g2782$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic4$, $g2782$.getDynamicValue(var149), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var148, var43), Hashtables.gethash((SubLObject)$ic4$, $g2782$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            return var150;
        }
        return f20713(var148, var43);
    }
    
    public static SubLObject f20715(final SubLObject var148, final SubLObject var43, final SubLObject var2) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        final SubLObject var150 = module0147.$g2094$.currentBinding(var149);
        final SubLObject var151 = module0147.$g2095$.currentBinding(var149);
        try {
            module0147.$g2094$.bind((SubLObject)$ic81$, var149);
            module0147.$g2095$.bind($ic52$, var149);
            if (NIL == module0256.f16576(var148, var43, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var152 = f20628(var148, var2);
                if (var152.isInteger() && var152.numG((SubLObject)ZERO_INTEGER)) {
                    SubLObject var153 = var43;
                    final SubLObject var154 = (SubLObject)$ic24$;
                    final SubLObject var155 = module0056.f4145(var154);
                    final SubLObject var15_166 = module0139.$g1635$.currentBinding(var149);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var149);
                        final SubLObject var156 = (SubLObject)NIL;
                        final SubLObject var15_167 = module0141.$g1714$.currentBinding(var149);
                        final SubLObject var16_168 = module0141.$g1715$.currentBinding(var149);
                        try {
                            module0141.$g1714$.bind((NIL != var156) ? var156 : module0141.f9283(), var149);
                            module0141.$g1715$.bind((SubLObject)((NIL != var156) ? $ic25$ : module0141.$g1715$.getDynamicValue(var149)), var149);
                            if (NIL != var156 && NIL != module0136.f8864() && NIL == module0141.f9279(var156)) {
                                final SubLObject var157 = module0136.$g1591$.getDynamicValue(var149);
                                if (var157.eql((SubLObject)$ic26$)) {
                                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic27$, var156, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var157.eql((SubLObject)$ic29$)) {
                                    module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic30$, (SubLObject)$ic27$, var156, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var157.eql((SubLObject)$ic31$)) {
                                    Errors.warn((SubLObject)$ic27$, var156, (SubLObject)$ic28$);
                                }
                                else {
                                    Errors.warn((SubLObject)$ic32$, module0136.$g1591$.getDynamicValue(var149));
                                    Errors.cerror((SubLObject)$ic30$, (SubLObject)$ic27$, var156, (SubLObject)$ic28$);
                                }
                            }
                            final SubLObject var15_168 = module0141.$g1670$.currentBinding(var149);
                            final SubLObject var16_169 = module0141.$g1671$.currentBinding(var149);
                            final SubLObject var158 = module0141.$g1672$.currentBinding(var149);
                            final SubLObject var159 = module0141.$g1674$.currentBinding(var149);
                            final SubLObject var160 = module0137.$g1605$.currentBinding(var149);
                            try {
                                module0141.$g1670$.bind(module0137.f8955($ic33$), var149);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic33$)), var149);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic33$)), var149);
                                module0141.$g1674$.bind((SubLObject)NIL, var149);
                                module0137.$g1605$.bind(module0137.f8955($ic33$), var149);
                                if (NIL != module0136.f8865() || NIL != module0244.f15795(var43, module0137.f8955((SubLObject)UNPROVIDED))) {
                                    final SubLObject var15_169 = module0141.$g1677$.currentBinding(var149);
                                    final SubLObject var16_170 = module0138.$g1619$.currentBinding(var149);
                                    final SubLObject var17_173 = module0141.$g1674$.currentBinding(var149);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9208(), var149);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic33$)), var149);
                                        module0141.$g1674$.bind((SubLObject)NIL, var149);
                                        module0249.f16055(var153, (SubLObject)UNPROVIDED);
                                        while (NIL != var153) {
                                            final SubLObject var161 = var153;
                                            f20716(var161, var2, var152);
                                            SubLObject var163;
                                            final SubLObject var162 = var163 = module0200.f12443(module0137.f8955($ic33$));
                                            SubLObject var164 = (SubLObject)NIL;
                                            var164 = var163.first();
                                            while (NIL != var163) {
                                                final SubLObject var15_170 = module0137.$g1605$.currentBinding(var149);
                                                final SubLObject var16_171 = module0141.$g1674$.currentBinding(var149);
                                                try {
                                                    module0137.$g1605$.bind(var164, var149);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var149)) : module0141.$g1674$.getDynamicValue(var149)), var149);
                                                    final SubLObject var165 = module0228.f15229(var153);
                                                    if (NIL != module0138.f8992(var165)) {
                                                        final SubLObject var166 = module0242.f15664(var165, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var166) {
                                                            final SubLObject var167 = module0245.f15834(var166, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var167) {
                                                                SubLObject var168;
                                                                for (var168 = module0066.f4838(module0067.f4891(var167)); NIL == module0066.f4841(var168); var168 = module0066.f4840(var168)) {
                                                                    var149.resetMultipleValues();
                                                                    final SubLObject var169 = module0066.f4839(var168);
                                                                    final SubLObject var170 = var149.secondMultipleValue();
                                                                    var149.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var169)) {
                                                                        final SubLObject var15_171 = module0138.$g1623$.currentBinding(var149);
                                                                        try {
                                                                            module0138.$g1623$.bind(var169, var149);
                                                                            SubLObject var52_177;
                                                                            for (var52_177 = module0066.f4838(module0067.f4891(var170)); NIL == module0066.f4841(var52_177); var52_177 = module0066.f4840(var52_177)) {
                                                                                var149.resetMultipleValues();
                                                                                final SubLObject var171 = module0066.f4839(var52_177);
                                                                                final SubLObject var172 = var149.secondMultipleValue();
                                                                                var149.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var171)) {
                                                                                    final SubLObject var15_172 = module0138.$g1624$.currentBinding(var149);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var171, var149);
                                                                                        final SubLObject var173 = var172;
                                                                                        if (NIL != module0077.f5302(var173)) {
                                                                                            final SubLObject var174 = module0077.f5333(var173);
                                                                                            SubLObject var175;
                                                                                            SubLObject var176;
                                                                                            SubLObject var177;
                                                                                            for (var175 = module0032.f1741(var174), var176 = (SubLObject)NIL, var176 = module0032.f1742(var175, var174); NIL == module0032.f1744(var175, var176); var176 = module0032.f1743(var176)) {
                                                                                                var177 = module0032.f1745(var175, var176);
                                                                                                if (NIL != module0032.f1746(var176, var177) && NIL == module0249.f16059(var177, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var177, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var177, var155);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var173.isList()) {
                                                                                            SubLObject var178 = var173;
                                                                                            SubLObject var179 = (SubLObject)NIL;
                                                                                            var179 = var178.first();
                                                                                            while (NIL != var178) {
                                                                                                if (NIL == module0249.f16059(var179, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var179, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var179, var155);
                                                                                                }
                                                                                                var178 = var178.rest();
                                                                                                var179 = var178.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic34$, var173);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var15_172, var149);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var52_177);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var15_171, var149);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var168);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var165, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var74_179;
                                                        final SubLObject var180 = var74_179 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var149), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var149), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var181 = (SubLObject)NIL;
                                                        var181 = var74_179.first();
                                                        while (NIL != var74_179) {
                                                            final SubLObject var15_173 = module0138.$g1625$.currentBinding(var149);
                                                            try {
                                                                module0138.$g1625$.bind(var181, var149);
                                                                final SubLObject var183;
                                                                final SubLObject var182 = var183 = Functions.funcall(var181, var165);
                                                                if (NIL != module0077.f5302(var183)) {
                                                                    final SubLObject var184 = module0077.f5333(var183);
                                                                    SubLObject var185;
                                                                    SubLObject var186;
                                                                    SubLObject var187;
                                                                    for (var185 = module0032.f1741(var184), var186 = (SubLObject)NIL, var186 = module0032.f1742(var185, var184); NIL == module0032.f1744(var185, var186); var186 = module0032.f1743(var186)) {
                                                                        var187 = module0032.f1745(var185, var186);
                                                                        if (NIL != module0032.f1746(var186, var187) && NIL == module0249.f16059(var187, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var187, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var187, var155);
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
                                                                            module0056.f4149(var189, var155);
                                                                        }
                                                                        var188 = var188.rest();
                                                                        var189 = var188.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic34$, var183);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var15_173, var149);
                                                            }
                                                            var74_179 = var74_179.rest();
                                                            var181 = var74_179.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var16_171, var149);
                                                    module0137.$g1605$.rebind(var15_170, var149);
                                                }
                                                var163 = var163.rest();
                                                var164 = var163.first();
                                            }
                                            var153 = module0056.f4150(var155);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var17_173, var149);
                                        module0138.$g1619$.rebind(var16_170, var149);
                                        module0141.$g1677$.rebind(var15_169, var149);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic36$, var43, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var160, var149);
                                module0141.$g1674$.rebind(var159, var149);
                                module0141.$g1672$.rebind(var158, var149);
                                module0141.$g1671$.rebind(var16_169, var149);
                                module0141.$g1670$.rebind(var15_168, var149);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var16_168, var149);
                            module0141.$g1714$.rebind(var15_167, var149);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var149));
                    }
                    finally {
                        module0139.$g1635$.rebind(var15_166, var149);
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var151, var149);
            module0147.$g2094$.rebind(var150, var149);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20717() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)$ic1$, $g2783$.getDynamicValue(var3), (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic2$, $g2783$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic3$, $g2783$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic4$, $g2783$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic5$, $g2783$.getDynamicValue(var3), (SubLObject)$ic83$);
        Hashtables.sethash((SubLObject)$ic7$, $g2783$.getDynamicValue(var3), (SubLObject)$ic90$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20718(final SubLObject var148, final SubLObject var43) {
        return f20715(var148, var43, (SubLObject)NIL);
    }
    
    public static SubLObject f20719(final SubLObject var148, final SubLObject var43) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1865$.getDynamicValue(var149)) {
            SubLObject var150 = (SubLObject)NIL;
            SubLObject var151 = (SubLObject)NIL;
            final SubLObject var152 = Time.get_internal_real_time();
            var150 = f20718(var148, var43);
            var151 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var152), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)$ic1$, $g2783$.getDynamicValue(var149), Numbers.add(Hashtables.gethash((SubLObject)$ic1$, $g2783$.getDynamicValue(var149), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER));
            Hashtables.sethash((SubLObject)$ic2$, $g2783$.getDynamicValue(var149), (SubLObject)ConsesLow.cons(var151, Hashtables.gethash((SubLObject)$ic2$, $g2783$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic3$, $g2783$.getDynamicValue(var149), (SubLObject)ConsesLow.cons(var150, Hashtables.gethash((SubLObject)$ic3$, $g2783$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic4$, $g2783$.getDynamicValue(var149), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var148, var43), Hashtables.gethash((SubLObject)$ic4$, $g2783$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            return var150;
        }
        return f20718(var148, var43);
    }
    
    public static SubLObject f20720() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)$ic1$, $g2784$.getDynamicValue(var3), (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic2$, $g2784$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic3$, $g2784$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic4$, $g2784$.getDynamicValue(var3), (SubLObject)NIL);
        Hashtables.sethash((SubLObject)$ic5$, $g2784$.getDynamicValue(var3), (SubLObject)$ic83$);
        Hashtables.sethash((SubLObject)$ic7$, $g2784$.getDynamicValue(var3), (SubLObject)$ic93$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20721(final SubLObject var148, final SubLObject var43) {
        return f20715(var148, var43, (SubLObject)T);
    }
    
    public static SubLObject f20722(final SubLObject var148, final SubLObject var43) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1865$.getDynamicValue(var149)) {
            SubLObject var150 = (SubLObject)NIL;
            SubLObject var151 = (SubLObject)NIL;
            final SubLObject var152 = Time.get_internal_real_time();
            var150 = f20721(var148, var43);
            var151 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var152), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)$ic1$, $g2784$.getDynamicValue(var149), Numbers.add(Hashtables.gethash((SubLObject)$ic1$, $g2784$.getDynamicValue(var149), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER));
            Hashtables.sethash((SubLObject)$ic2$, $g2784$.getDynamicValue(var149), (SubLObject)ConsesLow.cons(var151, Hashtables.gethash((SubLObject)$ic2$, $g2784$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic3$, $g2784$.getDynamicValue(var149), (SubLObject)ConsesLow.cons(var150, Hashtables.gethash((SubLObject)$ic3$, $g2784$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            Hashtables.sethash((SubLObject)$ic4$, $g2784$.getDynamicValue(var149), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var148, var43), Hashtables.gethash((SubLObject)$ic4$, $g2784$.getDynamicValue(var149), (SubLObject)UNPROVIDED)));
            return var150;
        }
        return f20721(var148, var43);
    }
    
    public static SubLObject f20723() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == module0305.$g2728$.getDynamicValue(var3)) {
            return (SubLObject)NIL;
        }
        if (NIL != $g2763$.getDynamicValue(var3)) {
            Hashtables.clrhash($g2763$.getDynamicValue(var3));
        }
        if (NIL != $g2765$.getDynamicValue(var3)) {
            Hashtables.clrhash($g2765$.getDynamicValue(var3));
        }
        if (NIL != $g2767$.getDynamicValue(var3)) {
            Hashtables.clrhash($g2767$.getDynamicValue(var3));
        }
        if (NIL != $g2769$.getDynamicValue(var3)) {
            Hashtables.clrhash($g2769$.getDynamicValue(var3));
        }
        if (NIL != $g2764$.getDynamicValue(var3)) {
            Hashtables.clrhash($g2764$.getDynamicValue(var3));
        }
        if (NIL != $g2766$.getDynamicValue(var3)) {
            Hashtables.clrhash($g2766$.getDynamicValue(var3));
        }
        if (NIL != $g2768$.getDynamicValue(var3)) {
            Hashtables.clrhash($g2768$.getDynamicValue(var3));
        }
        if (NIL != $g2770$.getDynamicValue(var3)) {
            Hashtables.clrhash($g2770$.getDynamicValue(var3));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20629() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == $g2763$.getDynamicValue(var3)) {
            $g2763$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic95$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        }
        if (NIL == $g2765$.getDynamicValue(var3)) {
            $g2765$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic96$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        }
        if (NIL == $g2767$.getDynamicValue(var3)) {
            $g2767$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic96$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        }
        if (NIL == $g2769$.getDynamicValue(var3)) {
            $g2769$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic96$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        }
        if (NIL == $g2764$.getDynamicValue(var3)) {
            $g2764$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic95$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        }
        if (NIL == $g2766$.getDynamicValue(var3)) {
            $g2766$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic96$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        }
        if (NIL == $g2768$.getDynamicValue(var3)) {
            $g2768$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic96$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        }
        if (NIL == $g2770$.getDynamicValue(var3)) {
            $g2770$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic96$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20724() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == module0305.$g2728$.getDynamicValue(var3)) {
            return (SubLObject)NIL;
        }
        final SubLObject var4 = (SubLObject)$ic97$;
        final SubLObject var5 = module0012.$g73$.currentBinding(var3);
        final SubLObject var6 = module0012.$g65$.currentBinding(var3);
        final SubLObject var7 = module0012.$g67$.currentBinding(var3);
        final SubLObject var8 = module0012.$g68$.currentBinding(var3);
        final SubLObject var9 = module0012.$g66$.currentBinding(var3);
        final SubLObject var10 = module0012.$g69$.currentBinding(var3);
        final SubLObject var11 = module0012.$g70$.currentBinding(var3);
        final SubLObject var12 = module0012.$silent_progressP$.currentBinding(var3);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var3);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
            module0012.$g70$.bind((SubLObject)T, var3);
            module0012.$silent_progressP$.bind((SubLObject)((NIL != var4) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
            module0012.f474(var4);
            f20629();
            f20723();
            final SubLObject var15_184 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var16_185 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind((SubLObject)$ic81$, var3);
                module0147.$g2095$.bind($ic52$, var3);
                SubLObject var13 = $ic98$;
                if (NIL != module0158.f10038(var13)) {
                    final SubLObject var181_187 = (SubLObject)NIL;
                    final SubLObject var15_185 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var16_186 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var17_190 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var18_191 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var39_192 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var103_193 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var182_194 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var183_195 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var181_187) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                        module0012.f474(var181_187);
                        final SubLObject var14 = module0158.f10039(var13);
                        SubLObject var15 = (SubLObject)NIL;
                        final SubLObject var16 = (SubLObject)NIL;
                        while (NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                            if (NIL != var18) {
                                module0012.f476();
                                SubLObject var19 = (SubLObject)NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)$ic99$, (SubLObject)$ic100$, (SubLObject)NIL);
                                    SubLObject var197_202 = (SubLObject)NIL;
                                    final SubLObject var198_203 = (SubLObject)NIL;
                                    while (NIL == var197_202) {
                                        final SubLObject var20 = module0052.f3695(var19, var198_203);
                                        final SubLObject var200_204 = (SubLObject)makeBoolean(!var198_203.eql(var20));
                                        if (NIL != var200_204) {
                                            module0305.f20490(var20, var20);
                                        }
                                        var197_202 = (SubLObject)makeBoolean(NIL == var200_204);
                                    }
                                }
                                finally {
                                    final SubLObject var15_186 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var15_186, var3);
                                    }
                                }
                            }
                            var15 = (SubLObject)makeBoolean(NIL == var18);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var183_195, var3);
                        module0012.$g70$.rebind(var182_194, var3);
                        module0012.$g69$.rebind(var103_193, var3);
                        module0012.$g66$.rebind(var39_192, var3);
                        module0012.$g68$.rebind(var18_191, var3);
                        module0012.$g67$.rebind(var17_190, var3);
                        module0012.$g65$.rebind(var16_186, var3);
                        module0012.$g73$.rebind(var15_185, var3);
                    }
                }
                var13 = $ic101$;
                if (NIL != module0158.f10038(var13)) {
                    final SubLObject var181_188 = (SubLObject)NIL;
                    final SubLObject var15_187 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var16_187 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var17_191 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var18_192 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var39_193 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var103_194 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var182_195 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var183_196 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var181_188) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                        module0012.f474(var181_188);
                        final SubLObject var14 = module0158.f10039(var13);
                        SubLObject var15 = (SubLObject)NIL;
                        final SubLObject var16 = (SubLObject)NIL;
                        while (NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                            if (NIL != var18) {
                                module0012.f476();
                                SubLObject var19 = (SubLObject)NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)$ic99$, (SubLObject)$ic100$, (SubLObject)NIL);
                                    SubLObject var197_203 = (SubLObject)NIL;
                                    final SubLObject var198_204 = (SubLObject)NIL;
                                    while (NIL == var197_203) {
                                        final SubLObject var20 = module0052.f3695(var19, var198_204);
                                        final SubLObject var200_205 = (SubLObject)makeBoolean(!var198_204.eql(var20));
                                        if (NIL != var200_205) {
                                            module0305.f20488(var20, var20);
                                        }
                                        var197_203 = (SubLObject)makeBoolean(NIL == var200_205);
                                    }
                                }
                                finally {
                                    final SubLObject var15_188 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var15_188, var3);
                                    }
                                }
                            }
                            var15 = (SubLObject)makeBoolean(NIL == var18);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var183_196, var3);
                        module0012.$g70$.rebind(var182_195, var3);
                        module0012.$g69$.rebind(var103_194, var3);
                        module0012.$g66$.rebind(var39_193, var3);
                        module0012.$g68$.rebind(var18_192, var3);
                        module0012.$g67$.rebind(var17_191, var3);
                        module0012.$g65$.rebind(var16_187, var3);
                        module0012.$g73$.rebind(var15_187, var3);
                    }
                }
                var13 = $ic102$;
                if (NIL != module0158.f10038(var13)) {
                    final SubLObject var181_189 = (SubLObject)NIL;
                    final SubLObject var15_189 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var16_188 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var17_192 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var18_193 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var39_194 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var103_195 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var182_196 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var183_197 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var181_189) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                        module0012.f474(var181_189);
                        final SubLObject var14 = module0158.f10039(var13);
                        SubLObject var15 = (SubLObject)NIL;
                        final SubLObject var16 = (SubLObject)NIL;
                        while (NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                            if (NIL != var18) {
                                module0012.f476();
                                SubLObject var19 = (SubLObject)NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)$ic99$, (SubLObject)$ic100$, (SubLObject)NIL);
                                    SubLObject var197_204 = (SubLObject)NIL;
                                    final SubLObject var198_205 = (SubLObject)NIL;
                                    while (NIL == var197_204) {
                                        final SubLObject var20 = module0052.f3695(var19, var198_205);
                                        final SubLObject var200_206 = (SubLObject)makeBoolean(!var198_205.eql(var20));
                                        if (NIL != var200_206) {
                                            f20699(var20, var20);
                                        }
                                        var197_204 = (SubLObject)makeBoolean(NIL == var200_206);
                                    }
                                }
                                finally {
                                    final SubLObject var15_190 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var15_190, var3);
                                    }
                                }
                            }
                            var15 = (SubLObject)makeBoolean(NIL == var18);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var183_197, var3);
                        module0012.$g70$.rebind(var182_196, var3);
                        module0012.$g69$.rebind(var103_195, var3);
                        module0012.$g66$.rebind(var39_194, var3);
                        module0012.$g68$.rebind(var18_193, var3);
                        module0012.$g67$.rebind(var17_192, var3);
                        module0012.$g65$.rebind(var16_188, var3);
                        module0012.$g73$.rebind(var15_189, var3);
                    }
                }
                var13 = $ic103$;
                if (NIL != module0158.f10038(var13)) {
                    final SubLObject var181_190 = (SubLObject)NIL;
                    final SubLObject var15_191 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var16_189 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var17_193 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var18_194 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var39_195 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var103_196 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var182_197 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var183_198 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var181_190) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                        module0012.f474(var181_190);
                        final SubLObject var14 = module0158.f10039(var13);
                        SubLObject var15 = (SubLObject)NIL;
                        final SubLObject var16 = (SubLObject)NIL;
                        while (NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                            if (NIL != var18) {
                                module0012.f476();
                                SubLObject var19 = (SubLObject)NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)$ic99$, (SubLObject)$ic100$, (SubLObject)NIL);
                                    SubLObject var197_205 = (SubLObject)NIL;
                                    final SubLObject var198_206 = (SubLObject)NIL;
                                    while (NIL == var197_205) {
                                        final SubLObject var20 = module0052.f3695(var19, var198_206);
                                        final SubLObject var200_207 = (SubLObject)makeBoolean(!var198_206.eql(var20));
                                        if (NIL != var200_207) {
                                            module0305.f20533(var20, var20);
                                        }
                                        var197_205 = (SubLObject)makeBoolean(NIL == var200_207);
                                    }
                                }
                                finally {
                                    final SubLObject var15_192 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var15_192, var3);
                                    }
                                }
                            }
                            var15 = (SubLObject)makeBoolean(NIL == var18);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var183_198, var3);
                        module0012.$g70$.rebind(var182_197, var3);
                        module0012.$g69$.rebind(var103_196, var3);
                        module0012.$g66$.rebind(var39_195, var3);
                        module0012.$g68$.rebind(var18_194, var3);
                        module0012.$g67$.rebind(var17_193, var3);
                        module0012.$g65$.rebind(var16_189, var3);
                        module0012.$g73$.rebind(var15_191, var3);
                    }
                }
                var13 = $ic104$;
                if (NIL != module0158.f10038(var13)) {
                    final SubLObject var181_191 = (SubLObject)NIL;
                    final SubLObject var15_193 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var16_190 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var17_194 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var18_195 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var39_196 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var103_197 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var182_198 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var183_199 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var181_191) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                        module0012.f474(var181_191);
                        final SubLObject var14 = module0158.f10039(var13);
                        SubLObject var15 = (SubLObject)NIL;
                        final SubLObject var16 = (SubLObject)NIL;
                        while (NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                            if (NIL != var18) {
                                module0012.f476();
                                SubLObject var19 = (SubLObject)NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)$ic99$, (SubLObject)$ic100$, (SubLObject)NIL);
                                    SubLObject var197_206 = (SubLObject)NIL;
                                    final SubLObject var198_207 = (SubLObject)NIL;
                                    while (NIL == var197_206) {
                                        final SubLObject var20 = module0052.f3695(var19, var198_207);
                                        final SubLObject var200_208 = (SubLObject)makeBoolean(!var198_207.eql(var20));
                                        if (NIL != var200_208) {
                                            module0305.f20531(var20, var20);
                                        }
                                        var197_206 = (SubLObject)makeBoolean(NIL == var200_208);
                                    }
                                }
                                finally {
                                    final SubLObject var15_194 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var15_194, var3);
                                    }
                                }
                            }
                            var15 = (SubLObject)makeBoolean(NIL == var18);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var183_199, var3);
                        module0012.$g70$.rebind(var182_198, var3);
                        module0012.$g69$.rebind(var103_197, var3);
                        module0012.$g66$.rebind(var39_196, var3);
                        module0012.$g68$.rebind(var18_195, var3);
                        module0012.$g67$.rebind(var17_194, var3);
                        module0012.$g65$.rebind(var16_190, var3);
                        module0012.$g73$.rebind(var15_193, var3);
                    }
                }
                var13 = $ic105$;
                if (NIL != module0158.f10038(var13)) {
                    final SubLObject var181_192 = (SubLObject)NIL;
                    final SubLObject var15_195 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var16_191 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var17_195 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var18_196 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var39_197 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var103_198 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var182_199 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var183_200 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var181_192) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                        module0012.f474(var181_192);
                        final SubLObject var14 = module0158.f10039(var13);
                        SubLObject var15 = (SubLObject)NIL;
                        final SubLObject var16 = (SubLObject)NIL;
                        while (NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                            if (NIL != var18) {
                                module0012.f476();
                                SubLObject var19 = (SubLObject)NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)$ic99$, (SubLObject)$ic100$, (SubLObject)NIL);
                                    SubLObject var197_207 = (SubLObject)NIL;
                                    final SubLObject var198_208 = (SubLObject)NIL;
                                    while (NIL == var197_207) {
                                        final SubLObject var20 = module0052.f3695(var19, var198_208);
                                        final SubLObject var200_209 = (SubLObject)makeBoolean(!var198_208.eql(var20));
                                        if (NIL != var200_209) {
                                            f20705(var20, var20);
                                        }
                                        var197_207 = (SubLObject)makeBoolean(NIL == var200_209);
                                    }
                                }
                                finally {
                                    final SubLObject var15_196 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var15_196, var3);
                                    }
                                }
                            }
                            var15 = (SubLObject)makeBoolean(NIL == var18);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var183_200, var3);
                        module0012.$g70$.rebind(var182_199, var3);
                        module0012.$g69$.rebind(var103_198, var3);
                        module0012.$g66$.rebind(var39_197, var3);
                        module0012.$g68$.rebind(var18_196, var3);
                        module0012.$g67$.rebind(var17_195, var3);
                        module0012.$g65$.rebind(var16_191, var3);
                        module0012.$g73$.rebind(var15_195, var3);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var16_185, var3);
                module0147.$g2094$.rebind(var15_184, var3);
            }
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var12, var3);
            module0012.$g70$.rebind(var11, var3);
            module0012.$g69$.rebind(var10, var3);
            module0012.$g66$.rebind(var9, var3);
            module0012.$g68$.rebind(var8, var3);
            module0012.$g67$.rebind(var7, var3);
            module0012.$g65$.rebind(var6, var3);
            module0012.$g73$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20708(final SubLObject var1, final SubLObject var2, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)ONE_INTEGER;
        }
        SubLObject var5 = f20628(var1, var2);
        if (NIL == var5) {
            var5 = (SubLObject)ZERO_INTEGER;
        }
        var5 = Numbers.add(var5, var4);
        f20631(var1, var5, var2);
        return var5;
    }
    
    public static SubLObject f20716(final SubLObject var1, final SubLObject var2, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)ONE_INTEGER;
        }
        SubLObject var5 = f20628(var1, var2);
        if (!var5.isInteger()) {
            var5 = (SubLObject)ZERO_INTEGER;
        }
        var5 = Numbers.subtract(var5, var4);
        if (var5.numG((SubLObject)ZERO_INTEGER)) {
            f20631(var1, var5, var2);
        }
        else {
            f20632(var1, var2);
        }
        return var5;
    }
    
    public static SubLObject f20692(final SubLObject var1, final SubLObject var272, final SubLObject var2) {
        final SubLThread var273 = SubLProcess.currentSubLThread();
        final SubLObject var274 = module0147.$g2094$.currentBinding(var273);
        final SubLObject var275 = module0147.$g2095$.currentBinding(var273);
        try {
            module0147.$g2094$.bind((SubLObject)$ic81$, var273);
            module0147.$g2095$.bind($ic52$, var273);
            if (NIL != var272) {
                SubLObject var276 = var1;
                final SubLObject var277 = (SubLObject)$ic24$;
                final SubLObject var278 = module0056.f4145(var277);
                final SubLObject var15_273 = module0139.$g1635$.currentBinding(var273);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var273);
                    final SubLObject var279 = (SubLObject)NIL;
                    final SubLObject var15_274 = module0141.$g1714$.currentBinding(var273);
                    final SubLObject var16_275 = module0141.$g1715$.currentBinding(var273);
                    try {
                        module0141.$g1714$.bind((NIL != var279) ? var279 : module0141.f9283(), var273);
                        module0141.$g1715$.bind((SubLObject)((NIL != var279) ? $ic25$ : module0141.$g1715$.getDynamicValue(var273)), var273);
                        if (NIL != var279 && NIL != module0136.f8864() && NIL == module0141.f9279(var279)) {
                            final SubLObject var280 = module0136.$g1591$.getDynamicValue(var273);
                            if (var280.eql((SubLObject)$ic26$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic27$, var279, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var280.eql((SubLObject)$ic29$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic30$, (SubLObject)$ic27$, var279, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var280.eql((SubLObject)$ic31$)) {
                                Errors.warn((SubLObject)$ic27$, var279, (SubLObject)$ic28$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic32$, module0136.$g1591$.getDynamicValue(var273));
                                Errors.cerror((SubLObject)$ic30$, (SubLObject)$ic27$, var279, (SubLObject)$ic28$);
                            }
                        }
                        final SubLObject var15_275 = module0141.$g1670$.currentBinding(var273);
                        final SubLObject var16_276 = module0141.$g1671$.currentBinding(var273);
                        final SubLObject var281 = module0141.$g1672$.currentBinding(var273);
                        final SubLObject var282 = module0141.$g1674$.currentBinding(var273);
                        final SubLObject var283 = module0137.$g1605$.currentBinding(var273);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic33$), var273);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic33$)), var273);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic33$)), var273);
                            module0141.$g1674$.bind((SubLObject)NIL, var273);
                            module0137.$g1605$.bind(module0137.f8955($ic33$), var273);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var1, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var15_276 = module0141.$g1677$.currentBinding(var273);
                                final SubLObject var16_277 = module0138.$g1619$.currentBinding(var273);
                                final SubLObject var17_280 = module0141.$g1674$.currentBinding(var273);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var273);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic33$)), var273);
                                    module0141.$g1674$.bind((SubLObject)NIL, var273);
                                    module0249.f16055(var276, (SubLObject)UNPROVIDED);
                                    while (NIL != var276) {
                                        final SubLObject var284 = var276;
                                        f20708(var284, var2, (SubLObject)UNPROVIDED);
                                        SubLObject var286;
                                        final SubLObject var285 = var286 = module0200.f12443(module0137.f8955($ic33$));
                                        SubLObject var287 = (SubLObject)NIL;
                                        var287 = var286.first();
                                        while (NIL != var286) {
                                            final SubLObject var15_277 = module0137.$g1605$.currentBinding(var273);
                                            final SubLObject var16_278 = module0141.$g1674$.currentBinding(var273);
                                            try {
                                                module0137.$g1605$.bind(var287, var273);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var273)) : module0141.$g1674$.getDynamicValue(var273)), var273);
                                                final SubLObject var288 = module0228.f15229(var276);
                                                if (NIL != module0138.f8992(var288)) {
                                                    final SubLObject var289 = module0242.f15664(var288, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var289) {
                                                        final SubLObject var290 = module0245.f15834(var289, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var290) {
                                                            SubLObject var291;
                                                            for (var291 = module0066.f4838(module0067.f4891(var290)); NIL == module0066.f4841(var291); var291 = module0066.f4840(var291)) {
                                                                var273.resetMultipleValues();
                                                                final SubLObject var292 = module0066.f4839(var291);
                                                                final SubLObject var293 = var273.secondMultipleValue();
                                                                var273.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var292)) {
                                                                    final SubLObject var15_278 = module0138.$g1623$.currentBinding(var273);
                                                                    try {
                                                                        module0138.$g1623$.bind(var292, var273);
                                                                        SubLObject var52_284;
                                                                        for (var52_284 = module0066.f4838(module0067.f4891(var293)); NIL == module0066.f4841(var52_284); var52_284 = module0066.f4840(var52_284)) {
                                                                            var273.resetMultipleValues();
                                                                            final SubLObject var294 = module0066.f4839(var52_284);
                                                                            final SubLObject var295 = var273.secondMultipleValue();
                                                                            var273.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var294)) {
                                                                                final SubLObject var15_279 = module0138.$g1624$.currentBinding(var273);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var294, var273);
                                                                                    final SubLObject var296 = var295;
                                                                                    if (NIL != module0077.f5302(var296)) {
                                                                                        final SubLObject var297 = module0077.f5333(var296);
                                                                                        SubLObject var298;
                                                                                        SubLObject var299;
                                                                                        SubLObject var300;
                                                                                        for (var298 = module0032.f1741(var297), var299 = (SubLObject)NIL, var299 = module0032.f1742(var298, var297); NIL == module0032.f1744(var298, var299); var299 = module0032.f1743(var299)) {
                                                                                            var300 = module0032.f1745(var298, var299);
                                                                                            if (NIL != module0032.f1746(var299, var300) && NIL == module0249.f16059(var300, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var300, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var300, var278);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var296.isList()) {
                                                                                        SubLObject var301 = var296;
                                                                                        SubLObject var302 = (SubLObject)NIL;
                                                                                        var302 = var301.first();
                                                                                        while (NIL != var301) {
                                                                                            if (NIL == module0249.f16059(var302, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var302, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var302, var278);
                                                                                            }
                                                                                            var301 = var301.rest();
                                                                                            var302 = var301.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic34$, var296);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var15_279, var273);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var52_284);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var15_278, var273);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var291);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var288, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var74_286;
                                                    final SubLObject var303 = var74_286 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var273), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var273), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var304 = (SubLObject)NIL;
                                                    var304 = var74_286.first();
                                                    while (NIL != var74_286) {
                                                        final SubLObject var15_280 = module0138.$g1625$.currentBinding(var273);
                                                        try {
                                                            module0138.$g1625$.bind(var304, var273);
                                                            final SubLObject var306;
                                                            final SubLObject var305 = var306 = Functions.funcall(var304, var288);
                                                            if (NIL != module0077.f5302(var306)) {
                                                                final SubLObject var307 = module0077.f5333(var306);
                                                                SubLObject var308;
                                                                SubLObject var309;
                                                                SubLObject var310;
                                                                for (var308 = module0032.f1741(var307), var309 = (SubLObject)NIL, var309 = module0032.f1742(var308, var307); NIL == module0032.f1744(var308, var309); var309 = module0032.f1743(var309)) {
                                                                    var310 = module0032.f1745(var308, var309);
                                                                    if (NIL != module0032.f1746(var309, var310) && NIL == module0249.f16059(var310, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var310, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var310, var278);
                                                                    }
                                                                }
                                                            }
                                                            else if (var306.isList()) {
                                                                SubLObject var311 = var306;
                                                                SubLObject var312 = (SubLObject)NIL;
                                                                var312 = var311.first();
                                                                while (NIL != var311) {
                                                                    if (NIL == module0249.f16059(var312, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var312, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var312, var278);
                                                                    }
                                                                    var311 = var311.rest();
                                                                    var312 = var311.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic34$, var306);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var15_280, var273);
                                                        }
                                                        var74_286 = var74_286.rest();
                                                        var304 = var74_286.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var16_278, var273);
                                                module0137.$g1605$.rebind(var15_277, var273);
                                            }
                                            var286 = var286.rest();
                                            var287 = var286.first();
                                        }
                                        var276 = module0056.f4150(var278);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var17_280, var273);
                                    module0138.$g1619$.rebind(var16_277, var273);
                                    module0141.$g1677$.rebind(var15_276, var273);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic36$, var1, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var283, var273);
                            module0141.$g1674$.rebind(var282, var273);
                            module0141.$g1672$.rebind(var281, var273);
                            module0141.$g1671$.rebind(var16_276, var273);
                            module0141.$g1670$.rebind(var15_275, var273);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var16_275, var273);
                        module0141.$g1714$.rebind(var15_274, var273);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var273));
                }
                finally {
                    module0139.$g1635$.rebind(var15_273, var273);
                }
            }
            else {
                SubLObject var276 = var1;
                final SubLObject var277 = (SubLObject)$ic24$;
                final SubLObject var278 = module0056.f4145(var277);
                final SubLObject var15_281 = module0139.$g1635$.currentBinding(var273);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var273);
                    final SubLObject var279 = (SubLObject)NIL;
                    final SubLObject var15_282 = module0141.$g1714$.currentBinding(var273);
                    final SubLObject var16_279 = module0141.$g1715$.currentBinding(var273);
                    try {
                        module0141.$g1714$.bind((NIL != var279) ? var279 : module0141.f9283(), var273);
                        module0141.$g1715$.bind((SubLObject)((NIL != var279) ? $ic25$ : module0141.$g1715$.getDynamicValue(var273)), var273);
                        if (NIL != var279 && NIL != module0136.f8864() && NIL == module0141.f9279(var279)) {
                            final SubLObject var280 = module0136.$g1591$.getDynamicValue(var273);
                            if (var280.eql((SubLObject)$ic26$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic27$, var279, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var280.eql((SubLObject)$ic29$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic30$, (SubLObject)$ic27$, var279, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var280.eql((SubLObject)$ic31$)) {
                                Errors.warn((SubLObject)$ic27$, var279, (SubLObject)$ic28$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic32$, module0136.$g1591$.getDynamicValue(var273));
                                Errors.cerror((SubLObject)$ic30$, (SubLObject)$ic27$, var279, (SubLObject)$ic28$);
                            }
                        }
                        final SubLObject var15_283 = module0141.$g1670$.currentBinding(var273);
                        final SubLObject var16_280 = module0141.$g1671$.currentBinding(var273);
                        final SubLObject var281 = module0141.$g1672$.currentBinding(var273);
                        final SubLObject var282 = module0141.$g1674$.currentBinding(var273);
                        final SubLObject var283 = module0137.$g1605$.currentBinding(var273);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic33$), var273);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic33$)), var273);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic33$)), var273);
                            module0141.$g1674$.bind((SubLObject)NIL, var273);
                            module0137.$g1605$.bind(module0137.f8955($ic33$), var273);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var1, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var15_284 = module0141.$g1677$.currentBinding(var273);
                                final SubLObject var16_281 = module0138.$g1619$.currentBinding(var273);
                                final SubLObject var17_281 = module0141.$g1674$.currentBinding(var273);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var273);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic33$)), var273);
                                    module0141.$g1674$.bind((SubLObject)NIL, var273);
                                    module0249.f16055(var276, (SubLObject)UNPROVIDED);
                                    while (NIL != var276) {
                                        final SubLObject var284 = var276;
                                        f20716(var284, var2, (SubLObject)UNPROVIDED);
                                        SubLObject var286;
                                        final SubLObject var285 = var286 = module0200.f12443(module0137.f8955($ic33$));
                                        SubLObject var287 = (SubLObject)NIL;
                                        var287 = var286.first();
                                        while (NIL != var286) {
                                            final SubLObject var15_285 = module0137.$g1605$.currentBinding(var273);
                                            final SubLObject var16_282 = module0141.$g1674$.currentBinding(var273);
                                            try {
                                                module0137.$g1605$.bind(var287, var273);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var273)) : module0141.$g1674$.getDynamicValue(var273)), var273);
                                                final SubLObject var288 = module0228.f15229(var276);
                                                if (NIL != module0138.f8992(var288)) {
                                                    final SubLObject var289 = module0242.f15664(var288, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var289) {
                                                        final SubLObject var290 = module0245.f15834(var289, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var290) {
                                                            SubLObject var291;
                                                            for (var291 = module0066.f4838(module0067.f4891(var290)); NIL == module0066.f4841(var291); var291 = module0066.f4840(var291)) {
                                                                var273.resetMultipleValues();
                                                                final SubLObject var292 = module0066.f4839(var291);
                                                                final SubLObject var293 = var273.secondMultipleValue();
                                                                var273.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var292)) {
                                                                    final SubLObject var15_286 = module0138.$g1623$.currentBinding(var273);
                                                                    try {
                                                                        module0138.$g1623$.bind(var292, var273);
                                                                        SubLObject var52_285;
                                                                        for (var52_285 = module0066.f4838(module0067.f4891(var293)); NIL == module0066.f4841(var52_285); var52_285 = module0066.f4840(var52_285)) {
                                                                            var273.resetMultipleValues();
                                                                            final SubLObject var294 = module0066.f4839(var52_285);
                                                                            final SubLObject var295 = var273.secondMultipleValue();
                                                                            var273.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var294)) {
                                                                                final SubLObject var15_287 = module0138.$g1624$.currentBinding(var273);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var294, var273);
                                                                                    final SubLObject var296 = var295;
                                                                                    if (NIL != module0077.f5302(var296)) {
                                                                                        final SubLObject var297 = module0077.f5333(var296);
                                                                                        SubLObject var298;
                                                                                        SubLObject var299;
                                                                                        SubLObject var300;
                                                                                        for (var298 = module0032.f1741(var297), var299 = (SubLObject)NIL, var299 = module0032.f1742(var298, var297); NIL == module0032.f1744(var298, var299); var299 = module0032.f1743(var299)) {
                                                                                            var300 = module0032.f1745(var298, var299);
                                                                                            if (NIL != module0032.f1746(var299, var300) && NIL == module0249.f16059(var300, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var300, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var300, var278);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var296.isList()) {
                                                                                        SubLObject var301 = var296;
                                                                                        SubLObject var302 = (SubLObject)NIL;
                                                                                        var302 = var301.first();
                                                                                        while (NIL != var301) {
                                                                                            if (NIL == module0249.f16059(var302, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var302, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var302, var278);
                                                                                            }
                                                                                            var301 = var301.rest();
                                                                                            var302 = var301.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic34$, var296);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var15_287, var273);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var52_285);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var15_286, var273);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var291);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var288, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var74_287;
                                                    final SubLObject var303 = var74_287 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var273), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var273), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var304 = (SubLObject)NIL;
                                                    var304 = var74_287.first();
                                                    while (NIL != var74_287) {
                                                        final SubLObject var15_288 = module0138.$g1625$.currentBinding(var273);
                                                        try {
                                                            module0138.$g1625$.bind(var304, var273);
                                                            final SubLObject var306;
                                                            final SubLObject var305 = var306 = Functions.funcall(var304, var288);
                                                            if (NIL != module0077.f5302(var306)) {
                                                                final SubLObject var307 = module0077.f5333(var306);
                                                                SubLObject var308;
                                                                SubLObject var309;
                                                                SubLObject var310;
                                                                for (var308 = module0032.f1741(var307), var309 = (SubLObject)NIL, var309 = module0032.f1742(var308, var307); NIL == module0032.f1744(var308, var309); var309 = module0032.f1743(var309)) {
                                                                    var310 = module0032.f1745(var308, var309);
                                                                    if (NIL != module0032.f1746(var309, var310) && NIL == module0249.f16059(var310, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var310, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var310, var278);
                                                                    }
                                                                }
                                                            }
                                                            else if (var306.isList()) {
                                                                SubLObject var311 = var306;
                                                                SubLObject var312 = (SubLObject)NIL;
                                                                var312 = var311.first();
                                                                while (NIL != var311) {
                                                                    if (NIL == module0249.f16059(var312, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var312, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var312, var278);
                                                                    }
                                                                    var311 = var311.rest();
                                                                    var312 = var311.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic34$, var306);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var15_288, var273);
                                                        }
                                                        var74_287 = var74_287.rest();
                                                        var304 = var74_287.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var16_282, var273);
                                                module0137.$g1605$.rebind(var15_285, var273);
                                            }
                                            var286 = var286.rest();
                                            var287 = var286.first();
                                        }
                                        var276 = module0056.f4150(var278);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var17_281, var273);
                                    module0138.$g1619$.rebind(var16_281, var273);
                                    module0141.$g1677$.rebind(var15_284, var273);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic36$, var1, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var283, var273);
                            module0141.$g1674$.rebind(var282, var273);
                            module0141.$g1672$.rebind(var281, var273);
                            module0141.$g1671$.rebind(var16_280, var273);
                            module0141.$g1670$.rebind(var15_283, var273);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var16_279, var273);
                        module0141.$g1714$.rebind(var15_282, var273);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var273));
                }
                finally {
                    module0139.$g1635$.rebind(var15_281, var273);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var275, var273);
            module0147.$g2094$.rebind(var274, var273);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20693(final SubLObject var1, final SubLObject var303, final SubLObject var145, final SubLObject var146) {
        final SubLThread var304 = SubLProcess.currentSubLThread();
        if (var146.eql((SubLObject)$ic63$)) {
            if (NIL != var145) {
                return Hashtables.sethash(var1, $g2765$.getDynamicValue(var304), var303);
            }
            return Hashtables.remhash(var1, $g2765$.getDynamicValue(var304));
        }
        else if (var146.eql((SubLObject)$ic72$)) {
            if (NIL != var145) {
                return Hashtables.sethash(var1, $g2766$.getDynamicValue(var304), var303);
            }
            return Hashtables.remhash(var1, $g2766$.getDynamicValue(var304));
        }
        else if (var146.eql((SubLObject)$ic66$)) {
            if (NIL != var145) {
                return module0030.f1599(var1, var303, $g2767$.getDynamicValue(var304));
            }
            return module0030.f1605(var1, var303, $g2767$.getDynamicValue(var304), (SubLObject)UNPROVIDED);
        }
        else if (var146.eql((SubLObject)$ic75$)) {
            if (NIL != var145) {
                return module0030.f1599(var1, var303, $g2768$.getDynamicValue(var304));
            }
            return module0030.f1605(var1, var303, $g2768$.getDynamicValue(var304), (SubLObject)UNPROVIDED);
        }
        else if (var146.eql((SubLObject)$ic69$)) {
            if (NIL != var145) {
                return module0030.f1599(var1, var303, $g2769$.getDynamicValue(var304));
            }
            return module0030.f1605(var1, var303, $g2769$.getDynamicValue(var304), (SubLObject)UNPROVIDED);
        }
        else {
            if (!var146.eql((SubLObject)$ic78$)) {
                return (SubLObject)NIL;
            }
            if (NIL != var145) {
                return module0030.f1599(var1, var303, $g2770$.getDynamicValue(var304));
            }
            return module0030.f1605(var1, var303, $g2770$.getDynamicValue(var304), (SubLObject)UNPROVIDED);
        }
    }
    
    public static SubLObject f20725() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(!$g2763$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594($g2763$.getDynamicValue(var3)) || !$g2765$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594($g2765$.getDynamicValue(var3)) || !$g2767$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594($g2767$.getDynamicValue(var3)) || !$g2769$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594($g2769$.getDynamicValue(var3)) || !$g2764$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594($g2764$.getDynamicValue(var3)) || !$g2766$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594($g2766$.getDynamicValue(var3)) || !$g2768$.getDynamicValue(var3).isHashtable() || !$g2770$.getDynamicValue(var3).isHashtable() || !module0144.$g1866$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594(module0144.$g1866$.getDynamicValue(var3)) || !module0144.$g1867$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594(module0144.$g1867$.getDynamicValue(var3)) || !module0144.$g1873$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594(module0144.$g1873$.getDynamicValue(var3)) || !module0144.$g1874$.getDynamicValue(var3).isHashtable() || NIL != module0030.f1594(module0144.$g1874$.getDynamicValue(var3)));
    }
    
    public static SubLObject f20726() {
        f20723();
        module0305.f20325();
        module0305.f20333();
        module0305.f20612();
        module0305.f20613();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20727() {
        f20726();
        f20724();
        module0305.f20520();
        module0305.f20562();
        module0305.f20616();
        module0305.f20617();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20728(final SubLObject var304) {
        final SubLThread var305 = SubLProcess.currentSubLThread();
        module0021.f1038($g2763$.getDynamicValue(var305), var304);
        module0021.f1038($g2765$.getDynamicValue(var305), var304);
        module0021.f1038($g2767$.getDynamicValue(var305), var304);
        module0021.f1038($g2769$.getDynamicValue(var305), var304);
        module0021.f1038($g2764$.getDynamicValue(var305), var304);
        module0021.f1038($g2766$.getDynamicValue(var305), var304);
        module0021.f1038($g2768$.getDynamicValue(var305), var304);
        module0021.f1038($g2770$.getDynamicValue(var305), var304);
        module0021.f1038(module0144.$g1866$.getDynamicValue(var305), var304);
        module0021.f1038(module0144.$g1867$.getDynamicValue(var305), var304);
        module0021.f1038(module0144.$g1873$.getDynamicValue(var305), var304);
        module0021.f1038(module0144.$g1874$.getDynamicValue(var305), var304);
        module0021.f1038((SubLObject)NIL, var304);
        module0021.f1038((SubLObject)NIL, var304);
        module0021.f1038((SubLObject)NIL, var304);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20729(final SubLObject var304) {
        SubLObject var305 = (SubLObject)NIL;
        $g2763$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2765$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2767$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2769$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2764$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2766$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2768$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2770$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        module0144.$g1866$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        module0144.$g1867$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        module0144.$g1873$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        module0144.$g1874$.setDynamicValue(module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        var305 = module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var305 = module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var305 = module0021.f1060(var304, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20730() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20628", "S#23283", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20630", "S#22977", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20631", "S#23284", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20632", "S#23285", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20633", "S#23286", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20634", "S#23287", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20635", "S#23288", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20636", "S#23289", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20637", "S#22976", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20638", "S#23290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20639", "S#23291", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20640", "S#23292", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20641", "S#23293", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20642", "S#23294", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20644", "S#22969", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20643", "S#23295", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20647", "S#23296", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20648", "S#23297", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20650", "S#22970", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20649", "S#23298", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20653", "S#23299", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20654", "S#23300", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20655", "S#22971", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20656", "S#23301", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20657", "S#23302", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20658", "S#22972", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20645", "S#23303", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20652", "S#23304", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20646", "S#23305", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20662", "S#23306", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20663", "S#23307", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20664", "S#23281", 1, 0, false);
        new $f20664$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20666", "S#23308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20665", "S#23309", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20659", "S#23310", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20669", "S#23311", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20670", "S#23312", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20668", "S#23313", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20667", "S#23314", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20671", "S#23315", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20672", "S#23316", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20651", "S#23317", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20673", "S#23318", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20674", "S#23319", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20675", "S#22973", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20678", "S#22974", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20679", "S#22975", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20680", "S#23320", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20677", "S#23321", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20676", "S#23322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20681", "S#23323", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20682", "S#23324", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20683", "S#23282", 1, 0, false);
        new $f20683$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20685", "S#23325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20686", "S#23326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20687", "S#23327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20684", "S#23328", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20688", "S#23329", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20689", "S#23330", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20661", "S#23331", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20690", "S#23332", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20660", "S#23333", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20691", "S#23334", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20694", "S#23335", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20695", "NEW-ADD-IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20696", "NEW-REMOVE-IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20697", "NEW-ADD-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20698", "NEW-REMOVE-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20699", "ADD-NEC-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20700", "REMOVE-NEC-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20701", "NEW-ADD-IFF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20702", "NEW-REMOVE-IFF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20703", "NEW-ADD-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20704", "NEW-REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20705", "ADD-NEC-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20706", "REMOVE-NEC-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20707", "S#23336", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20709", "S#23337", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20710", "S#23338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20711", "S#22978", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20712", "S#23339", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20713", "S#23340", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20714", "S#22980", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20715", "S#23341", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20717", "S#23342", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20718", "S#23343", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20719", "S#22979", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20720", "S#23344", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20721", "S#23345", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20722", "S#22981", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20723", "S#23346", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20629", "S#23347", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20724", "S#23348", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20708", "S#23349", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20716", "S#23350", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20692", "S#23351", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20693", "S#23352", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20725", "S#16680", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20726", "S#16681", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20727", "S#16688", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20728", "S#23353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0306", "f20729", "S#23354", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20731() {
        $g2763$ = SubLFiles.defvar("S#23355", (SubLObject)NIL);
        $g2764$ = SubLFiles.defvar("S#23356", (SubLObject)NIL);
        $g2765$ = SubLFiles.defvar("S#23357", (SubLObject)NIL);
        $g2766$ = SubLFiles.defvar("S#23358", (SubLObject)NIL);
        $g2767$ = SubLFiles.defvar("S#23359", (SubLObject)NIL);
        $g2768$ = SubLFiles.defvar("S#23360", (SubLObject)NIL);
        $g2769$ = SubLFiles.defvar("S#23361", (SubLObject)NIL);
        $g2770$ = SubLFiles.defvar("S#23362", (SubLObject)NIL);
        $g2771$ = SubLFiles.defvar("S#23363", (SubLObject)NIL);
        $g2772$ = SubLFiles.defvar("S#23364", (SubLObject)NIL);
        $g2773$ = SubLFiles.defvar("S#23365", (SubLObject)NIL);
        $g2774$ = SubLFiles.defparameter("S#23366", Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2775$ = SubLFiles.defparameter("S#23367", Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2776$ = SubLFiles.defparameter("S#23368", Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2777$ = SubLFiles.defparameter("S#23369", Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2778$ = SubLFiles.defparameter("S#23370", Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2779$ = SubLFiles.deflexical("S#23371", (SubLObject)$ic58$);
        $g2780$ = SubLFiles.deflexical("S#23372", (SubLObject)$ic61$);
        $g2781$ = SubLFiles.defparameter("S#23373", Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2782$ = SubLFiles.defparameter("S#23374", Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2783$ = SubLFiles.defparameter("S#23375", Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2784$ = SubLFiles.defparameter("S#23376", Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20732() {
        SubLObject var91 = (SubLObject)$ic0$;
        if (NIL == conses_high.member(var91, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var91, module0012.$g57$.getGlobalValue()));
        }
        f20641();
        Hashtables.sethash((SubLObject)$ic9$, $g2774$.getDynamicValue(), (SubLObject)$ic10$);
        SubLObject var92 = module0144.$g1868$.getDynamicValue();
        SubLObject var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if ($ic8$ == Hashtables.gethash((SubLObject)$ic7$, var93, (SubLObject)UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var93, module0144.$g1868$.getDynamicValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                Hashtables.clrhash(var93);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons($g2774$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var91 = (SubLObject)$ic13$;
        if (NIL == conses_high.member(var91, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var91, module0012.$g57$.getGlobalValue()));
        }
        f20647();
        Hashtables.sethash((SubLObject)$ic9$, $g2775$.getDynamicValue(), (SubLObject)$ic15$);
        var92 = module0144.$g1868$.getDynamicValue();
        var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if ($ic14$ == Hashtables.gethash((SubLObject)$ic7$, var93, (SubLObject)UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var93, module0144.$g1868$.getDynamicValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                Hashtables.clrhash(var93);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons($g2775$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var91 = (SubLObject)$ic16$;
        if (NIL == conses_high.member(var91, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var91, module0012.$g57$.getGlobalValue()));
        }
        f20653();
        Hashtables.sethash((SubLObject)$ic9$, $g2776$.getDynamicValue(), (SubLObject)$ic18$);
        var92 = module0144.$g1868$.getDynamicValue();
        var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if ($ic17$ == Hashtables.gethash((SubLObject)$ic7$, var93, (SubLObject)UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var93, module0144.$g1868$.getDynamicValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                Hashtables.clrhash(var93);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons($g2776$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var91 = (SubLObject)$ic19$;
        if (NIL == conses_high.member(var91, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var91, module0012.$g57$.getGlobalValue()));
        }
        f20656();
        Hashtables.sethash((SubLObject)$ic9$, $g2777$.getDynamicValue(), (SubLObject)$ic21$);
        var92 = module0144.$g1868$.getDynamicValue();
        var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if ($ic20$ == Hashtables.gethash((SubLObject)$ic7$, var93, (SubLObject)UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var93, module0144.$g1868$.getDynamicValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                Hashtables.clrhash(var93);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons($g2777$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var91 = (SubLObject)$ic46$;
        if (NIL == conses_high.member(var91, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var91, module0012.$g57$.getGlobalValue()));
        }
        f20671();
        Hashtables.sethash((SubLObject)$ic9$, $g2778$.getDynamicValue(), (SubLObject)$ic49$);
        var92 = module0144.$g1868$.getDynamicValue();
        var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if ($ic48$ == Hashtables.gethash((SubLObject)$ic7$, var93, (SubLObject)UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var93, module0144.$g1868$.getDynamicValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                Hashtables.clrhash(var93);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons($g2778$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        module0012.f416((SubLObject)$ic64$);
        module0012.f416((SubLObject)$ic65$);
        module0012.f416((SubLObject)$ic67$);
        module0012.f416((SubLObject)$ic68$);
        module0012.f416((SubLObject)$ic70$);
        module0012.f416((SubLObject)$ic71$);
        module0012.f416((SubLObject)$ic73$);
        module0012.f416((SubLObject)$ic74$);
        module0012.f416((SubLObject)$ic76$);
        module0012.f416((SubLObject)$ic77$);
        module0012.f416((SubLObject)$ic79$);
        module0012.f416((SubLObject)$ic80$);
        var91 = (SubLObject)$ic82$;
        if (NIL == conses_high.member(var91, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var91, module0012.$g57$.getGlobalValue()));
        }
        f20709();
        Hashtables.sethash((SubLObject)$ic9$, $g2781$.getDynamicValue(), (SubLObject)$ic85$);
        var92 = module0144.$g1868$.getDynamicValue();
        var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if ($ic84$ == Hashtables.gethash((SubLObject)$ic7$, var93, (SubLObject)UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var93, module0144.$g1868$.getDynamicValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                Hashtables.clrhash(var93);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons($g2781$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var91 = (SubLObject)$ic86$;
        if (NIL == conses_high.member(var91, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var91, module0012.$g57$.getGlobalValue()));
        }
        f20712();
        Hashtables.sethash((SubLObject)$ic9$, $g2782$.getDynamicValue(), (SubLObject)$ic88$);
        var92 = module0144.$g1868$.getDynamicValue();
        var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if ($ic87$ == Hashtables.gethash((SubLObject)$ic7$, var93, (SubLObject)UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var93, module0144.$g1868$.getDynamicValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                Hashtables.clrhash(var93);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons($g2782$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var91 = (SubLObject)$ic89$;
        if (NIL == conses_high.member(var91, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var91, module0012.$g57$.getGlobalValue()));
        }
        f20717();
        Hashtables.sethash((SubLObject)$ic9$, $g2783$.getDynamicValue(), (SubLObject)$ic91$);
        var92 = module0144.$g1868$.getDynamicValue();
        var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if ($ic90$ == Hashtables.gethash((SubLObject)$ic7$, var93, (SubLObject)UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var93, module0144.$g1868$.getDynamicValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                Hashtables.clrhash(var93);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons($g2783$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        var91 = (SubLObject)$ic92$;
        if (NIL == conses_high.member(var91, module0012.$g57$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g57$.setGlobalValue((SubLObject)ConsesLow.cons(var91, module0012.$g57$.getGlobalValue()));
        }
        f20720();
        Hashtables.sethash((SubLObject)$ic9$, $g2784$.getDynamicValue(), (SubLObject)$ic94$);
        var92 = module0144.$g1868$.getDynamicValue();
        var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if ($ic93$ == Hashtables.gethash((SubLObject)$ic7$, var93, (SubLObject)UNPROVIDED)) {
                module0144.$g1868$.setDynamicValue(Sequences.delete(var93, module0144.$g1868$.getDynamicValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                Hashtables.clrhash(var93);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        module0144.$g1868$.setDynamicValue((SubLObject)ConsesLow.cons($g2784$.getDynamicValue(), module0144.$g1868$.getDynamicValue()));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f20730();
    }
    
    public void initializeVariables() {
        f20731();
    }
    
    public void runTopLevelForms() {
        f20732();
    }
    
    static {
        me = (SubLFile)new module0306();
        $g2763$ = null;
        $g2764$ = null;
        $g2765$ = null;
        $g2766$ = null;
        $g2767$ = null;
        $g2768$ = null;
        $g2769$ = null;
        $g2770$ = null;
        $g2771$ = null;
        $g2772$ = null;
        $g2773$ = null;
        $g2774$ = null;
        $g2775$ = null;
        $g2776$ = null;
        $g2777$ = null;
        $g2778$ = null;
        $g2779$ = null;
        $g2780$ = null;
        $g2781$ = null;
        $g2782$ = null;
        $g2783$ = null;
        $g2784$ = null;
        $ic0$ = makeSymbol("S#23366", "CYC");
        $ic1$ = makeKeyword("CALLS");
        $ic2$ = makeKeyword("TIMES");
        $ic3$ = makeKeyword("RESULTS");
        $ic4$ = makeKeyword("ARGS");
        $ic5$ = makeKeyword("ARG-LIST");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic7$ = makeKeyword("FUNCTION");
        $ic8$ = makeSymbol("S#22969", "CYC");
        $ic9$ = makeKeyword("RESET");
        $ic10$ = makeSymbol("S#23293", "CYC");
        $ic11$ = makeKeyword("ADMITTED");
        $ic12$ = makeKeyword("REJECTED");
        $ic13$ = makeSymbol("S#23367", "CYC");
        $ic14$ = makeSymbol("S#22970", "CYC");
        $ic15$ = makeSymbol("S#23296", "CYC");
        $ic16$ = makeSymbol("S#23368", "CYC");
        $ic17$ = makeSymbol("S#22971", "CYC");
        $ic18$ = makeSymbol("S#23299", "CYC");
        $ic19$ = makeSymbol("S#23369", "CYC");
        $ic20$ = makeSymbol("S#22972", "CYC");
        $ic21$ = makeSymbol("S#23301", "CYC");
        $ic22$ = makeKeyword("BREADTH");
        $ic23$ = makeKeyword("QUEUE");
        $ic24$ = makeKeyword("STACK");
        $ic25$ = makeSymbol("S#11450", "CYC");
        $ic26$ = makeKeyword("ERROR");
        $ic27$ = makeString("~A is not a ~A");
        $ic28$ = makeSymbol("S#11592", "CYC");
        $ic29$ = makeKeyword("CERROR");
        $ic30$ = makeString("continue anyway");
        $ic31$ = makeKeyword("WARN");
        $ic32$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic34$ = makeString("~A is neither SET-P nor LISTP.");
        $ic35$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic36$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic37$ = makeKeyword("DISJOINT");
        $ic38$ = makeSymbol("S#23308", "CYC");
        $ic39$ = makeSymbol("S#23281", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#22773", "CYC"), (SubLObject)makeSymbol("S#20622", "CYC"), (SubLObject)makeSymbol("S#20973", "CYC"));
        $ic41$ = makeKeyword("AT-CONSTRAINT-GAF");
        $ic42$ = makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");
        $ic43$ = makeKeyword("MAL-ARG-WRT-SUF-DEFNS");
        $ic44$ = makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");
        $ic45$ = makeKeyword("MAL-ARG-WRT-IFF-DEFN");
        $ic46$ = makeSymbol("S#23370", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#23377", "CYC"), (SubLObject)makeSymbol("S#23378", "CYC"));
        $ic48$ = makeSymbol("S#23317", "CYC");
        $ic49$ = makeSymbol("S#23315", "CYC");
        $ic50$ = makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");
        $ic51$ = makeKeyword("MAL-ARG-WRT-NEC-DEFN");
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic53$ = makeKeyword("GENLS");
        $ic54$ = makeSymbol("S#23327", "CYC");
        $ic55$ = makeSymbol("S#23326", "CYC");
        $ic56$ = makeSymbol("S#23325", "CYC");
        $ic57$ = makeSymbol("S#23282", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STRINGP"), constant_handles_oc.f8479((SubLObject)makeString("CharacterString"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("POSITIVE-INTEGER-P"), constant_handles_oc.f8479((SubLObject)makeString("PositiveInteger"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"), constant_handles_oc.f8479((SubLObject)makeString("NonNegativeInteger"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("INTEGERP"), constant_handles_oc.f8479((SubLObject)makeString("Integer"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FLOATP"), constant_handles_oc.f8479((SubLObject)makeString("RealNumber"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("TRUE"), constant_handles_oc.f8479((SubLObject)makeString("Thing"))));
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#12453", "CYC"), (SubLObject)makeSymbol("S#12458", "CYC"));
        $ic60$ = makeKeyword("ASCENDING");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STRINGP"), constant_handles_oc.f8479((SubLObject)makeString("SubLString"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("INTEGERP"), constant_handles_oc.f8479((SubLObject)makeString("SubLInteger"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FLOATP"), constant_handles_oc.f8479((SubLObject)makeString("SubLRealNumber"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SYMBOLP"), constant_handles_oc.f8479((SubLObject)makeString("SubLSymbol"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CONSTANT-P"), constant_handles_oc.f8479((SubLObject)makeString("CycLConstant"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NART-P"), constant_handles_oc.f8479((SubLObject)makeString("CycLNonAtomicReifiedTerm"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION-P"), constant_handles_oc.f8479((SubLObject)makeString("CycLAssertion"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("TRUE"), constant_handles_oc.f8479((SubLObject)makeString("CycLExpression"))));
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("S#23379", "CYC"), (SubLObject)makeSymbol("S#12458", "CYC"));
        $ic63$ = makeKeyword("IFF");
        $ic64$ = makeSymbol("NEW-ADD-IFF-DEFN");
        $ic65$ = makeSymbol("NEW-REMOVE-IFF-DEFN");
        $ic66$ = makeKeyword("SUF");
        $ic67$ = makeSymbol("NEW-ADD-SUF-DEFN");
        $ic68$ = makeSymbol("NEW-REMOVE-SUF-DEFN");
        $ic69$ = makeKeyword("NEC");
        $ic70$ = makeSymbol("ADD-NEC-DEFN");
        $ic71$ = makeSymbol("REMOVE-NEC-DEFN");
        $ic72$ = makeKeyword("QIFF");
        $ic73$ = makeSymbol("NEW-ADD-IFF-QUOTED-DEFN");
        $ic74$ = makeSymbol("NEW-REMOVE-IFF-QUOTED-DEFN");
        $ic75$ = makeKeyword("QSUF");
        $ic76$ = makeSymbol("NEW-ADD-SUF-QUOTED-DEFN");
        $ic77$ = makeSymbol("NEW-REMOVE-SUF-QUOTED-DEFN");
        $ic78$ = makeKeyword("QNEC");
        $ic79$ = makeSymbol("ADD-NEC-QUOTED-DEFN");
        $ic80$ = makeSymbol("REMOVE-NEC-QUOTED-DEFN");
        $ic81$ = makeSymbol("S#12274", "CYC");
        $ic82$ = makeSymbol("S#23373", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"));
        $ic84$ = makeSymbol("S#22978", "CYC");
        $ic85$ = makeSymbol("S#23337", "CYC");
        $ic86$ = makeSymbol("S#23374", "CYC");
        $ic87$ = makeSymbol("S#22980", "CYC");
        $ic88$ = makeSymbol("S#23339", "CYC");
        $ic89$ = makeSymbol("S#23375", "CYC");
        $ic90$ = makeSymbol("S#22979", "CYC");
        $ic91$ = makeSymbol("S#23342", "CYC");
        $ic92$ = makeSymbol("S#23376", "CYC");
        $ic93$ = makeSymbol("S#22981", "CYC");
        $ic94$ = makeSymbol("S#23344", "CYC");
        $ic95$ = makeInteger(400);
        $ic96$ = makeInteger(100);
        $ic97$ = makeString("Initializing defns...");
        $ic98$ = constant_handles_oc.f8479((SubLObject)makeString("defnIff"));
        $ic99$ = makeKeyword("GAF");
        $ic100$ = makeKeyword("TRUE");
        $ic101$ = constant_handles_oc.f8479((SubLObject)makeString("defnSufficient"));
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("defnNecessary"));
        $ic103$ = constant_handles_oc.f8479((SubLObject)makeString("quotedDefnIff"));
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("quotedDefnSufficient"));
        $ic105$ = constant_handles_oc.f8479((SubLObject)makeString("quotedDefnNecessary"));
    }
    
    public static final class $f20664$UnaryFunction extends UnaryFunction
    {
        public $f20664$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23281"));
        }
        
        public SubLObject processItem(final SubLObject var82) {
            return f20664(var82);
        }
    }
    
    public static final class $f20683$UnaryFunction extends UnaryFunction
    {
        public $f20683$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23282"));
        }
        
        public SubLObject processItem(final SubLObject var82) {
            return f20683(var82);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2791 ms
	
	Decompiled with Procyon 0.5.32.
*/